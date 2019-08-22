/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cache_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$evaluatable_backchain_enabled$;
import static com.cyc.cycjava.cycl.control_vars.$hl_failure_backchaining$;
import static com.cyc.cycjava.cycl.control_vars.$inference_answer_handler$;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.control_vars.$proof_checker_rules$;
import static com.cyc.cycjava.cycl.control_vars.$proof_checking_enabled$;
import static com.cyc.cycjava.cycl.control_vars.$query_properties_inherited_by_recursive_queries$;
import static com.cyc.cycjava.cycl.control_vars.$removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.control_vars.$unbound_rule_backchain_enabled$;
import static com.cyc.cycjava.cycl.el_utilities.el_intensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.sefify;
import static com.cyc.cycjava.cycl.kb_control_vars.$forward_inference_environment$;
import static com.cyc.cycjava.cycl.utilities_macros.$fi_state_variables$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_obsolete_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.ArrayList;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.backward_results;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_quantification;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.wff_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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
 * module:      ASK-UTILITIES
 * source file: /cyc/top/cycl/inference/ask-utilities.lisp
 * created:     2019/07/03 17:37:44
 */
public final class ask_utilities extends SubLTranslatedFile implements V12 {
    /**
     * Temporary control variable;
     * When non-nil, recursive queries are performed in the currently active problem store.
     */
    // defvar
    @LispMethod(comment = "Temporary control variable;\r\nWhen non-nil, recursive queries are performed in the currently active problem store.\nTemporary control variable;\nWhen non-nil, recursive queries are performed in the currently active problem store.\ndefvar")
    public static final SubLSymbol $recursive_queries_in_currently_active_problem_storeP$ = makeSymbol("*RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?*");

    public static final SubLFile me = new ask_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.inference.ask_utilities";


    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $recursive_queries_browsableP$ = makeSymbol("*RECURSIVE-QUERIES-BROWSABLE?*");

    // deflexical
    // A recursive query depth higher than this will yield an error
    /**
     * A recursive query depth higher than this will yield an error
     */
    @LispMethod(comment = "A recursive query depth higher than this will yield an error\ndeflexical")
    private static final SubLSymbol $max_recursive_query_depth$ = makeSymbol("*MAX-RECURSIVE-QUERY-DEPTH*");

    // defparameter
    // To avoid infinite recursion and stack overflow
    /**
     * To avoid infinite recursion and stack overflow
     */
    @LispMethod(comment = "To avoid infinite recursion and stack overflow\ndefparameter")
    private static final SubLSymbol $recursive_query_depth$ = makeSymbol("*RECURSIVE-QUERY-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $allow_the_set_of_via_generalized_queryP$ = makeSymbol("*ALLOW-THE-SET-OF-VIA-GENERALIZED-QUERY?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $be_careful_when_solving_the_set_of_via_generalized_queryP$ = makeSymbol("*BE-CAREFUL-WHEN-SOLVING-THE-SET-OF-VIA-GENERALIZED-QUERY?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $debug_the_set_of_problem_solvable_via_generalized_queryP$ = makeSymbol("*DEBUG-THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLSymbol $kw4$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    private static final SubLSymbol INFERENCE_RETURN_BLISTS = makeSymbol("INFERENCE-RETURN-BLISTS");

    private static final SubLSymbol INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol INFERENCE_RETURN_TEMPLATE = makeSymbol("INFERENCE-RETURN-TEMPLATE");

    private static final SubLSymbol $kw19$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw20$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw21$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");

    private static final SubLSymbol $kw24$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLSymbol QUERY_JUSTIFIED = makeSymbol("QUERY-JUSTIFIED");

    static private final SubLList $list27 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    static private final SubLString $str28$Ask_for_bindings_for_free_variabl = makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   Returns a list of binding and justificaion pairs.");

    static private final SubLList $list29 = list(makeSymbol("LISTP"), makeSymbol("QUERY-HALT-REASON-P"));

    private static final SubLSymbol ASK_JUSTIFIED = makeSymbol("ASK-JUSTIFIED");

    static private final SubLList $list31 = list(makeSymbol("QUERY-JUSTIFIED"));

    static private final SubLList $list32 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLString $str33$Ask_for_bindings_for_free_variabl = makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   If BACKCHAIN is NIL, no inference is performed.\n   If BACKCHAIN is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If BACKCHAIN is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If NUMBER is an integer, then at most that number of bindings are returned.\n   If TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\n   If DEPTH is an integer, then the inference paths are limited to that number of total steps.\n   Returns a list of binding and justificaion pairs.\n   Deprecated in favor of query-justified.");

    static private final SubLList $list35 = list(makeSymbol("TEMPLATE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    static private final SubLString $str36$Ask_SENTENCE_in_MT___Return_resul = makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.");

    private static final SubLSymbol ASK_TEMPLATE = makeSymbol("ASK-TEMPLATE");

    static private final SubLList $list38 = list(makeSymbol("QUERY-TEMPLATE"));

    static private final SubLList $list39 = list(makeSymbol("TEMPLATE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLString $str40$Ask_SENTENCE_in_MT___Return_resul = makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\n   Deprecated in favor of query-template.");

    private static final SubLSymbol QUERY_VARIABLE = makeSymbol("QUERY-VARIABLE");

    static private final SubLList $list42 = list(makeSymbol("VARIABLE-TOKEN"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    static private final SubLString $str43$Ask_SENTENCE_in_MT_treating_VARIA = makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.");

    private static final SubLSymbol ASK_VARIABLE = makeSymbol("ASK-VARIABLE");

    static private final SubLList $list45 = list(makeSymbol("QUERY-VARIABLE"));

    static private final SubLList $list46 = list(makeSymbol("VARIABLE-TOKEN"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLString $str47$Ask_SENTENCE_in_MT_treating_VARIA = makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.\n   Deprecated in favor of query-variable.");

    private static final SubLSymbol QUERY_TEMPLATE_EVAL = makeSymbol("QUERY-TEMPLATE-EVAL");

    static private final SubLString $str49$Ask_SENTENCE_in_MT_under_the_reso = makeString("Ask SENTENCE in MT under the resource constraints query-properties\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.");

    static private final SubLList $list50 = list(makeSymbol("NON-NEGATIVE-INTEGER-P"));

    private static final SubLSymbol ASK_TEMPLATE_EVAL = makeSymbol("ASK-TEMPLATE-EVAL");

    static private final SubLList $list52 = list(makeSymbol("QUERY-TEMPLATE-EVAL"));

    static private final SubLString $str53$Ask_SENTENCE_in_MT_under_the_reso = makeString("Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.\n Deprecated in favor of query-template-eval.");

    private static final SubLSymbol $ONLY_FOR_EXISTING_STORES = makeKeyword("ONLY-FOR-EXISTING-STORES");



    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLString $str60$max_recursive_query_depth_of__s_e = makeString("max recursive query depth of ~s exceeded with query ~s in mt ~s");

    private static final SubLString $str61$Either_deeper_thought_is_required = makeString("Either deeper thought is required to answer this query, or it is a paradox.");

    private static final SubLSymbol $sym64$QUERY_PROPERTY_INHERITED_BY_RECURSIVE_QUERY_ = makeSymbol("QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?");

    private static final SubLSymbol $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    private static final SubLList $list66 = list(makeKeyword("SUPPORTS"));

    private static final SubLList $list70 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLList $list71 = list(makeSymbol("VARIABLE"), makeSymbol("QUERY"));



    private static final SubLSymbol $NO_THE_SET_OF_EXPRESSION_FOUND = makeKeyword("NO-THE-SET-OF-EXPRESSION-FOUND");

    private static final SubLSymbol $THE_SET_OF_VIA_GENERALIZED_QUERY_NOT_ALLOWED = makeKeyword("THE-SET-OF-VIA-GENERALIZED-QUERY-NOT-ALLOWED");

    private static final SubLSymbol $SKSI_STRONGLY_PREFER_CONJUNCTIVE_REMOVAL_MODULES_NOT_T = makeKeyword("SKSI-STRONGLY-PREFER-CONJUNCTIVE-REMOVAL-MODULES-NOT-T");

    private static final SubLSymbol $PROBLEM_NOT_VALID = makeKeyword("PROBLEM-NOT-VALID");

    private static final SubLSymbol $CANNOT_FIND_UNRESTRICTED_PROBLEM_OF_THE_SET_OF_EXPRESSION_PROBLEM = makeKeyword("CANNOT-FIND-UNRESTRICTED-PROBLEM-OF-THE-SET-OF-EXPRESSION-PROBLEM");

    private static final SubLSymbol $CANNOT_FIND_JO_LINK_AND_FOCAL_PROBLEM_OF_SUPPORTED_PROBLEM = makeKeyword("CANNOT-FIND-JO-LINK-AND-FOCAL-PROBLEM-OF-SUPPORTED-PROBLEM");

    private static final SubLSymbol $kw80$GENERALIZED_QUERY_PROPERTIES_DIFFERENT_THAN_RESTRICTED_QUERY_PROP = makeKeyword("GENERALIZED-QUERY-PROPERTIES-DIFFERENT-THAN-RESTRICTED-QUERY-PROPERTIES");

    private static final SubLSymbol $GENERALIZED_QUERY_NOT_GENERALIZED__CONTAINS_RESTRICTED_QUERY = makeKeyword("GENERALIZED-QUERY-NOT-GENERALIZED--CONTAINS-RESTRICTED-QUERY");

    private static final SubLSymbol $sym82$PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_FOR_THE_SET_OF_ = makeSymbol("PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF?");

    private static final SubLSymbol $kw83$GENERALIZED_QUERY_CONTAINS_PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_ = makeKeyword("GENERALIZED-QUERY-CONTAINS-PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF");

    private static final SubLSymbol $sym84$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLString $str85$the_set_of_via_generalized_query_ = makeString("the-set-of-via-generalized-query missed an answer!~%");

    private static final SubLString $str86$__Generalized_query___new_cyc_que = makeString("  Generalized query: (new-cyc-query ~S ~S ~S)~%");

    private static final SubLString $str87$__Restricted__query___new_cyc_que = makeString("  Restricted  query: (new-cyc-query ~S ~S ~S)~%");

    private static final SubLString $str88$__Missed_answer___S_____S__ = makeString("  Missed answer: ~S -> ~S~%");

    private static final SubLObject $const90$predNotAllowedInGeneralizedQueryF = reader_make_constant_shell("predNotAllowedInGeneralizedQueryForTheSetOf");

    private static final SubLSymbol EL_INTENSIONAL_SET_P = makeSymbol("EL-INTENSIONAL-SET-P");

    private static final SubLList $list92 = list(makeSymbol("POSSIBLE-UNRESTRICTED-PROBLEM"), makeSymbol("THIS-UNRESTRICTED-THE-SET-OF-EXPRESSION"), makeSymbol("RESTRICTION-LINK-BINDINGS"));

    private static final SubLSymbol JOIN_ORDERED_LINK_P = makeSymbol("JOIN-ORDERED-LINK-P");

    private static final SubLSymbol THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED = makeSymbol("THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED");

    // Definitions
    /**
     * Constructs query-properties suitable for NEW-CYC-QUERY based on the legacy query properties
     * BACKCHAIN, NUMBER, TIME, and DEPTH, and the values for legacy inference dynamic variables.
     *
     * @return query-properties-p;
     */
    @LispMethod(comment = "Constructs query-properties suitable for NEW-CYC-QUERY based on the legacy query properties\r\nBACKCHAIN, NUMBER, TIME, and DEPTH, and the values for legacy inference dynamic variables.\r\n\r\n@return query-properties-p;\nConstructs query-properties suitable for NEW-CYC-QUERY based on the legacy query properties\nBACKCHAIN, NUMBER, TIME, and DEPTH, and the values for legacy inference dynamic variables.")
    public static final SubLObject query_properties_from_legacy_ask_parameters_alt(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_properties = NIL;
                if (NIL != backchain) {
                    v_properties = putf(v_properties, $MAX_TRANSFORMATION_DEPTH, T == backchain ? ((SubLObject) (NIL)) : backchain);
                }
                if (NIL != number) {
                    v_properties = putf(v_properties, $MAX_NUMBER, number);
                }
                if (NIL != time) {
                    v_properties = putf(v_properties, $MAX_TIME, time);
                }
                if (NIL != depth) {
                    v_properties = putf(v_properties, $MAX_PROOF_DEPTH, depth);
                }
                v_properties = putf(v_properties, $kw4$CACHE_INFERENCE_RESULTS_, list_utilities.sublisp_boolean($cache_inference_results$.getDynamicValue(thread)));
                if (NIL != api_control_vars.$generate_readable_fi_results$.getDynamicValue(thread)) {
                    v_properties = putf(v_properties, $ANSWER_LANGUAGE, $EL);
                } else {
                    v_properties = putf(v_properties, $ANSWER_LANGUAGE, $HL);
                }
                if (NIL != $proof_checking_enabled$.getDynamicValue(thread)) {
                    v_properties = putf(v_properties, $ALLOWED_RULES, $proof_checker_rules$.getDynamicValue(thread));
                } else {
                    v_properties = putf(v_properties, $ALLOWED_RULES, $ALL);
                }
                {
                    SubLObject pcase_var = $inference_answer_handler$.getDynamicValue(thread);
                    if (pcase_var.eql(INFERENCE_RETURN_BLISTS)) {
                        v_properties = putf(v_properties, $RETURN, $BINDINGS);
                        v_properties = putf(v_properties, $RESULT_UNIQUENESS, $BINDINGS);
                    } else {
                        if (pcase_var.eql(INFERENCE_RETURN_BLISTS_AND_SUPPORTS)) {
                            v_properties = putf(v_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
                            v_properties = putf(v_properties, $RESULT_UNIQUENESS, $PROOF);
                            v_properties = putf(v_properties, $ANSWER_LANGUAGE, $HL);
                        } else {
                            if (pcase_var.eql(INFERENCE_RETURN_TEMPLATE)) {
                                v_properties = putf(v_properties, $RETURN, list($TEMPLATE, backward_results.$inference_answer_template$.getDynamicValue(thread)));
                                v_properties = putf(v_properties, $RESULT_UNIQUENESS, $BINDINGS);
                            }
                        }
                    }
                }
                v_properties = putf(v_properties, $kw19$ALLOW_HL_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($hl_failure_backchaining$.getDynamicValue(thread)));
                v_properties = putf(v_properties, $kw20$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($unbound_rule_backchain_enabled$.getDynamicValue(thread)));
                v_properties = putf(v_properties, $kw21$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($evaluatable_backchain_enabled$.getDynamicValue(thread)));
                {
                    SubLObject productivity_limit = com.cyc.cycjava.cycl.inference.ask_utilities.productivity_limit_from_removal_cost_cutoff($removal_cost_cutoff$.getDynamicValue(thread));
                    v_properties = putf(v_properties, $PRODUCTIVITY_LIMIT, productivity_limit);
                }
                v_properties = putf(v_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, backward_results.$inference_intermediate_step_validation_level$.getDynamicValue(thread));
                v_properties = putf(v_properties, $kw24$NEGATION_BY_FAILURE_, list_utilities.sublisp_boolean($negation_by_failure$.getDynamicValue(thread)));
                return v_properties;
            }
        }
    }

    // Definitions
    /**
     * Constructs query-properties suitable for NEW-CYC-QUERY based on the legacy query properties
     * BACKCHAIN, NUMBER, TIME, and DEPTH, and the values for legacy inference dynamic variables.
     *
     * @return query-properties-p;
     */
    @LispMethod(comment = "Constructs query-properties suitable for NEW-CYC-QUERY based on the legacy query properties\r\nBACKCHAIN, NUMBER, TIME, and DEPTH, and the values for legacy inference dynamic variables.\r\n\r\n@return query-properties-p;\nConstructs query-properties suitable for NEW-CYC-QUERY based on the legacy query properties\nBACKCHAIN, NUMBER, TIME, and DEPTH, and the values for legacy inference dynamic variables.")
    public static SubLObject query_properties_from_legacy_ask_parameters(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_properties = NIL;
        if (NIL != backchain) {
            v_properties = putf(v_properties, $MAX_TRANSFORMATION_DEPTH, T == backchain ? NIL : backchain);
        }
        if (NIL != number) {
            v_properties = putf(v_properties, $MAX_NUMBER, number);
        }
        if (NIL != time) {
            v_properties = putf(v_properties, $MAX_TIME, time);
        }
        if (NIL != depth) {
            v_properties = putf(v_properties, $MAX_PROOF_DEPTH, depth);
        }
        v_properties = putf(v_properties, $kw4$CACHE_INFERENCE_RESULTS_, list_utilities.sublisp_boolean($cache_inference_results$.getDynamicValue(thread)));
        if (NIL != api_control_vars.$generate_readable_fi_results$.getDynamicValue(thread)) {
            v_properties = putf(v_properties, $ANSWER_LANGUAGE, $EL);
        } else {
            v_properties = putf(v_properties, $ANSWER_LANGUAGE, $HL);
        }
        if (NIL != $proof_checking_enabled$.getDynamicValue(thread)) {
            v_properties = putf(v_properties, $ALLOWED_RULES, $proof_checker_rules$.getDynamicValue(thread));
        } else {
            v_properties = putf(v_properties, $ALLOWED_RULES, $ALL);
        }
        final SubLObject pcase_var = $inference_answer_handler$.getDynamicValue(thread);
        if (pcase_var.eql(INFERENCE_RETURN_BLISTS)) {
            v_properties = putf(v_properties, $RETURN, $BINDINGS);
            v_properties = putf(v_properties, $RESULT_UNIQUENESS, $BINDINGS);
        } else
            if (pcase_var.eql(INFERENCE_RETURN_BLISTS_AND_SUPPORTS)) {
                v_properties = putf(v_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
                v_properties = putf(v_properties, $RESULT_UNIQUENESS, $PROOF);
                v_properties = putf(v_properties, $ANSWER_LANGUAGE, $HL);
            } else
                if (pcase_var.eql(INFERENCE_RETURN_TEMPLATE)) {
                    v_properties = putf(v_properties, $RETURN, list($TEMPLATE, backward_results.$inference_answer_template$.getDynamicValue(thread)));
                    v_properties = putf(v_properties, $RESULT_UNIQUENESS, $BINDINGS);
                }


        v_properties = putf(v_properties, $kw19$ALLOW_HL_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($hl_failure_backchaining$.getDynamicValue(thread)));
        v_properties = putf(v_properties, $kw20$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($unbound_rule_backchain_enabled$.getDynamicValue(thread)));
        v_properties = putf(v_properties, $kw21$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($evaluatable_backchain_enabled$.getDynamicValue(thread)));
        final SubLObject productivity_limit = productivity_limit_from_removal_cost_cutoff($removal_cost_cutoff$.getDynamicValue(thread));
        v_properties = putf(v_properties, $PRODUCTIVITY_LIMIT, productivity_limit);
        v_properties = putf(v_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, backward_results.$inference_intermediate_step_validation_level$.getDynamicValue(thread));
        v_properties = putf(v_properties, $kw24$NEGATION_BY_FAILURE_, list_utilities.sublisp_boolean($negation_by_failure$.getDynamicValue(thread)));
        return v_properties;
    }

    public static final SubLObject productivity_limit_from_removal_cost_cutoff_alt(SubLObject cost_cutoff) {
        return NIL != cost_cutoff ? ((SubLObject) (multiply(TWO_INTEGER, $int$100, cost_cutoff))) : number_utilities.positive_infinity();
    }

    public static SubLObject productivity_limit_from_removal_cost_cutoff(final SubLObject cost_cutoff) {
        return NIL != cost_cutoff ? floor(multiply(TWO_INTEGER, $int$100, cost_cutoff), UNPROVIDED) : number_utilities.positive_infinity();
    }

    public static final SubLObject query_static_properties_from_legacy_ask_parameters_alt() {
        {
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.query_properties_from_legacy_ask_parameters(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_enumerated_types.extract_query_static_properties(query_properties);
        }
    }

    public static SubLObject query_static_properties_from_legacy_ask_parameters() {
        final SubLObject query_properties = query_properties_from_legacy_ask_parameters(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return inference_datastructures_enumerated_types.extract_query_static_properties(query_properties);
    }

    public static final SubLObject query_dynamic_properties_from_legacy_ask_parameters_alt(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deepP) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (reconsider_deepP == UNPROVIDED) {
            reconsider_deepP = NIL;
        }
        {
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
            return inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
        }
    }

    public static SubLObject query_dynamic_properties_from_legacy_ask_parameters(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deepP) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (reconsider_deepP == UNPROVIDED) {
            reconsider_deepP = NIL;
        }
        final SubLObject query_properties = query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
    }

    /**
     * Ask for bindings for free variables which will satisfy SENTENCE within MT.
     * Returns bindings and HL supports.
     * Returns a list of binding and justificaion pairs.
     */
    @LispMethod(comment = "Ask for bindings for free variables which will satisfy SENTENCE within MT.\r\nReturns bindings and HL supports.\r\nReturns a list of binding and justificaion pairs.\nAsk for bindings for free variables which will satisfy SENTENCE within MT.\nReturns bindings and HL supports.\nReturns a list of binding and justificaion pairs.")
    public static final SubLObject query_justified_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                mt = mt_vars.$default_ask_mt$.getGlobalValue();
            }
            {
                SubLObject new_query_properties = putf(copy_list(query_properties), $ANSWER_LANGUAGE, $HL);
                new_query_properties = putf(new_query_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
                thread.resetMultipleValues();
                {
                    SubLObject results = inference_kernel.new_cyc_query(sentence, mt, new_query_properties);
                    SubLObject suspend_status = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(results, suspend_status);
                }
            }
        }
    }

    /**
     * Ask for bindings for free variables which will satisfy SENTENCE within MT.
     * Returns bindings and HL supports.
     * Returns a list of binding and justificaion pairs.
     */
    @LispMethod(comment = "Ask for bindings for free variables which will satisfy SENTENCE within MT.\r\nReturns bindings and HL supports.\r\nReturns a list of binding and justificaion pairs.\nAsk for bindings for free variables which will satisfy SENTENCE within MT.\nReturns bindings and HL supports.\nReturns a list of binding and justificaion pairs.")
    public static SubLObject query_justified(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        SubLObject new_query_properties = putf(copy_list(query_properties), $ANSWER_LANGUAGE, $HL);
        new_query_properties = putf(new_query_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, new_query_properties);
        final SubLObject suspend_status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(results, suspend_status);
    }

    /**
     * Ask for bindings for free variables which will satisfy SENTENCE within MT.
     * Returns bindings and HL supports.
     * If BACKCHAIN is NIL, no inference is performed.
     * If BACKCHAIN is an integer, then at most that many backchaining steps using rules
     * are performed.
     * If BACKCHAIN is T, then inference is performed without limit on the number of
     * backchaining steps when searching for bindings.
     * If NUMBER is an integer, then at most that number of bindings are returned.
     * If TIME is an integer, then at most TIME seconds are consumed by the search for bindings.
     * If DEPTH is an integer, then the inference paths are limited to that number of total steps.
     * Returns a list of binding and justificaion pairs.
     * Deprecated in favor of query-justified.
     */
    @LispMethod(comment = "Ask for bindings for free variables which will satisfy SENTENCE within MT.\r\nReturns bindings and HL supports.\r\nIf BACKCHAIN is NIL, no inference is performed.\r\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\r\nare performed.\r\nIf BACKCHAIN is T, then inference is performed without limit on the number of\r\nbackchaining steps when searching for bindings.\r\nIf NUMBER is an integer, then at most that number of bindings are returned.\r\nIf TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\r\nIf DEPTH is an integer, then the inference paths are limited to that number of total steps.\r\nReturns a list of binding and justificaion pairs.\r\nDeprecated in favor of query-justified.\nAsk for bindings for free variables which will satisfy SENTENCE within MT.\nReturns bindings and HL supports.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of total steps.\nReturns a list of binding and justificaion pairs.\nDeprecated in favor of query-justified.")
    public static final SubLObject ask_justified_alt(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
            return com.cyc.cycjava.cycl.inference.ask_utilities.query_justified(sentence, mt, query_properties);
        }
    }

    /**
     * Ask for bindings for free variables which will satisfy SENTENCE within MT.
     * Returns bindings and HL supports.
     * If BACKCHAIN is NIL, no inference is performed.
     * If BACKCHAIN is an integer, then at most that many backchaining steps using rules
     * are performed.
     * If BACKCHAIN is T, then inference is performed without limit on the number of
     * backchaining steps when searching for bindings.
     * If NUMBER is an integer, then at most that number of bindings are returned.
     * If TIME is an integer, then at most TIME seconds are consumed by the search for bindings.
     * If DEPTH is an integer, then the inference paths are limited to that number of total steps.
     * Returns a list of binding and justificaion pairs.
     * Deprecated in favor of query-justified.
     */
    @LispMethod(comment = "Ask for bindings for free variables which will satisfy SENTENCE within MT.\r\nReturns bindings and HL supports.\r\nIf BACKCHAIN is NIL, no inference is performed.\r\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\r\nare performed.\r\nIf BACKCHAIN is T, then inference is performed without limit on the number of\r\nbackchaining steps when searching for bindings.\r\nIf NUMBER is an integer, then at most that number of bindings are returned.\r\nIf TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\r\nIf DEPTH is an integer, then the inference paths are limited to that number of total steps.\r\nReturns a list of binding and justificaion pairs.\r\nDeprecated in favor of query-justified.\nAsk for bindings for free variables which will satisfy SENTENCE within MT.\nReturns bindings and HL supports.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of total steps.\nReturns a list of binding and justificaion pairs.\nDeprecated in favor of query-justified.")
    public static SubLObject ask_justified(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject query_properties = query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return query_justified(sentence, mt, query_properties);
    }

    /**
     * Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.")
    public static final SubLObject query_template_alt(SubLObject template, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                mt = mt_vars.$default_ask_mt$.getGlobalValue();
            }
            {
                SubLObject new_query_properties = putf(copy_list(query_properties), $RESULT_UNIQUENESS, $BINDINGS);
                new_query_properties = putf(new_query_properties, $RETURN, list($TEMPLATE, template));
                thread.resetMultipleValues();
                {
                    SubLObject results = inference_kernel.new_cyc_query(sentence, mt, new_query_properties);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(results, halt_reason);
                }
            }
        }
    }

    /**
     * Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.")
    public static SubLObject query_template(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        SubLObject new_query_properties = putf(copy_list(query_properties), $RESULT_UNIQUENESS, $BINDINGS);
        new_query_properties = putf(new_query_properties, $RETURN, list($TEMPLATE, template));
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, new_query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(results, halt_reason);
    }

    /**
     * Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.
     * Deprecated in favor of query-template.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\r\nDeprecated in favor of query-template.\nAsk SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\nDeprecated in favor of query-template.")
    public static final SubLObject ask_template_alt(SubLObject template, SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
            return com.cyc.cycjava.cycl.inference.ask_utilities.query_template(template, sentence, mt, query_properties);
        }
    }

    /**
     * Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.
     * Deprecated in favor of query-template.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\r\nDeprecated in favor of query-template.\nAsk SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\nDeprecated in favor of query-template.")
    public static SubLObject ask_template(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject query_properties = query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return query_template(template, sentence, mt, query_properties);
    }

    /**
     * Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one
     * free variable for which a list of answers is desired.
     */
    @LispMethod(comment = "Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\r\nfree variable for which a list of answers is desired.\nAsk SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\nfree variable for which a list of answers is desired.")
    public static final SubLObject query_variable_alt(SubLObject variable_token, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject variable = czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED);
                SubLObject query_sentence = cycl_utilities.expression_subst(variable, variable_token, sentence, UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject results = com.cyc.cycjava.cycl.inference.ask_utilities.query_template(variable, query_sentence, mt, query_properties);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    results = delete_duplicates(results, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return values(results, halt_reason);
                }
            }
        }
    }

    /**
     * Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one
     * free variable for which a list of answers is desired.
     */
    @LispMethod(comment = "Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\r\nfree variable for which a list of answers is desired.\nAsk SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\nfree variable for which a list of answers is desired.")
    public static SubLObject query_variable(final SubLObject variable_token, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED);
        final SubLObject query_sentence = cycl_utilities.expression_subst(variable, variable_token, sentence, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject results = query_template(variable, query_sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        results = delete_duplicates(results, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(results, halt_reason);
    }

    /**
     * Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one
     * free variable for which a list of answers is desired.
     * Deprecated in favor of query-variable.
     */
    @LispMethod(comment = "Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\r\nfree variable for which a list of answers is desired.\r\nDeprecated in favor of query-variable.\nAsk SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\nfree variable for which a list of answers is desired.\nDeprecated in favor of query-variable.")
    public static final SubLObject ask_variable_alt(SubLObject variable_token, SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
            return com.cyc.cycjava.cycl.inference.ask_utilities.query_variable(variable_token, sentence, mt, query_properties);
        }
    }

    /**
     * Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one
     * free variable for which a list of answers is desired.
     * Deprecated in favor of query-variable.
     */
    @LispMethod(comment = "Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\r\nfree variable for which a list of answers is desired.\r\nDeprecated in favor of query-variable.\nAsk SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\nfree variable for which a list of answers is desired.\nDeprecated in favor of query-variable.")
    public static SubLObject ask_variable(final SubLObject variable_token, final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject query_properties = query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return query_variable(variable_token, sentence, mt, query_properties);
    }

    /**
     * Ask SENTENCE in MT under the resource constraints query-properties
     * TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.
     * The bindings are substitued into TEMPLATE before evaluation.
     * Returns a count of the number of evaluations performed.
     */
    @LispMethod(comment = "Ask SENTENCE in MT under the resource constraints query-properties\r\nTEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\r\nThe bindings are substitued into TEMPLATE before evaluation.\r\nReturns a count of the number of evaluations performed.\nAsk SENTENCE in MT under the resource constraints query-properties\nTEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\nThe bindings are substitued into TEMPLATE before evaluation.\nReturns a count of the number of evaluations performed.")
    public static final SubLObject query_template_eval_alt(SubLObject template, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            SubLObject actions = com.cyc.cycjava.cycl.inference.ask_utilities.query_template(template, sentence, mt, query_properties);
            SubLObject cdolist_list_var = actions;
            SubLObject action = NIL;
            for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                eval_in_api.cyc_api_eval(action);
            }
            return length(actions);
        }
    }

    /**
     * Ask SENTENCE in MT under the resource constraints query-properties
     * TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.
     * The bindings are substitued into TEMPLATE before evaluation.
     * Returns a count of the number of evaluations performed.
     */
    @LispMethod(comment = "Ask SENTENCE in MT under the resource constraints query-properties\r\nTEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\r\nThe bindings are substitued into TEMPLATE before evaluation.\r\nReturns a count of the number of evaluations performed.\nAsk SENTENCE in MT under the resource constraints query-properties\nTEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\nThe bindings are substitued into TEMPLATE before evaluation.\nReturns a count of the number of evaluations performed.")
    public static SubLObject query_template_eval(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject actions = cdolist_list_var = query_template(template, sentence, mt, query_properties);
        SubLObject action = NIL;
        action = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            eval_in_api.cyc_api_eval(action);
            cdolist_list_var = cdolist_list_var.rest();
            action = cdolist_list_var.first();
        } 
        return length(actions);
    }

    /**
     * Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH
     * TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.
     * The bindings are substitued into TEMPLATE before evaluation.
     * Returns a count of the number of evaluations performed.
     * Deprecated in favor of query-template-eval.
     */
    @LispMethod(comment = "Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\r\nTEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\r\nThe bindings are substitued into TEMPLATE before evaluation.\r\nReturns a count of the number of evaluations performed.\r\nDeprecated in favor of query-template-eval.\nAsk SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\nTEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\nThe bindings are substitued into TEMPLATE before evaluation.\nReturns a count of the number of evaluations performed.\nDeprecated in favor of query-template-eval.")
    public static final SubLObject ask_template_eval_alt(SubLObject template, SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
            return com.cyc.cycjava.cycl.inference.ask_utilities.query_template_eval(template, sentence, mt, query_properties);
        }
    }

    /**
     * Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH
     * TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.
     * The bindings are substitued into TEMPLATE before evaluation.
     * Returns a count of the number of evaluations performed.
     * Deprecated in favor of query-template-eval.
     */
    @LispMethod(comment = "Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\r\nTEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\r\nThe bindings are substitued into TEMPLATE before evaluation.\r\nReturns a count of the number of evaluations performed.\r\nDeprecated in favor of query-template-eval.\nAsk SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\nTEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\nThe bindings are substitued into TEMPLATE before evaluation.\nReturns a count of the number of evaluations performed.\nDeprecated in favor of query-template-eval.")
    public static SubLObject ask_template_eval(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject query_properties = query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return query_template_eval(template, sentence, mt, query_properties);
    }

    /**
     * Ask SENTENCE in MT.  Return T if any bindings are returned, or if its a closed sentence that is true
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return T if any bindings are returned, or if its a closed sentence that is true")
    public static final SubLObject query_boolean_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
                SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(list_utilities.sublisp_boolean(results), halt_reason);
            }
        }
    }

    /**
     * Ask SENTENCE in MT.  Return T if any bindings are returned, or if its a closed sentence that is true
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return T if any bindings are returned, or if its a closed sentence that is true")
    public static SubLObject query_boolean(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(list_utilities.sublisp_boolean(results), halt_reason);
    }

    public static final SubLObject recursive_ask_query_properties_from_legacy_ask_parameters_alt(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
                query_properties = putf(query_properties, $kw4$CACHE_INFERENCE_RESULTS_, NIL);
                query_properties = putf(query_properties, $ANSWER_LANGUAGE, $HL);
                query_properties = putf(query_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $NONE);
                if (NIL != $recursive_queries_in_currently_active_problem_storeP$.getDynamicValue(thread)) {
                    {
                        SubLObject problem_store = inference_worker.currently_active_problem_store();
                        query_properties = putf(query_properties, $PROBLEM_STORE, problem_store);
                    }
                }
                return query_properties;
            }
        }
    }

    public static SubLObject recursive_ask_query_properties_from_legacy_ask_parameters(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_properties = query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        query_properties = putf(query_properties, $kw4$CACHE_INFERENCE_RESULTS_, NIL);
        query_properties = putf(query_properties, $ANSWER_LANGUAGE, $HL);
        query_properties = putf(query_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $NONE);
        if ((NIL != inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.getDynamicValue(thread)) && (NIL == kb_control_vars.within_forward_inferenceP())) {
            final SubLObject problem_store = inference_worker.currently_active_problem_store();
            query_properties = putf(query_properties, $PROBLEM_STORE, problem_store);
        }
        return query_properties;
    }

    public static final SubLObject within_recursive_queryP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.positive_integer_p($recursive_query_depth$.getDynamicValue(thread));
        }
    }

    public static SubLObject within_recursive_queryP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.positive_integer_p($recursive_query_depth$.getDynamicValue(thread));
    }

    public static final SubLObject recursive_query_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_query_properties = copy_list(query_properties);
                SubLObject problem_store = com.cyc.cycjava.cycl.inference.ask_utilities.recursive_query_problem_store_to_reuse(new_query_properties);
                if (NIL != problem_store) {
                    new_query_properties = putf(new_query_properties, $PROBLEM_STORE, problem_store);
                }
                if (NIL == getf(new_query_properties, $PROBABLY_APPROXIMATELY_DONE, UNPROVIDED)) {
                    new_query_properties = putf(new_query_properties, $PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER);
                }
                {
                    SubLObject inference = inference_macros.current_controlling_inference();
                    if (NIL != inference_datastructures_inference.inference_p(inference)) {
                        {
                            SubLObject cdolist_list_var = $query_properties_inherited_by_recursive_queries$.getDynamicValue(thread);
                            SubLObject query_property = NIL;
                            for (query_property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_property = cdolist_list_var.first()) {
                                if (NIL == getf(new_query_properties, query_property, UNPROVIDED)) {
                                    {
                                        SubLObject value = inference_datastructures_inference.inference_input_query_property(inference, query_property, UNPROVIDED);
                                        if (NIL != value) {
                                            new_query_properties = putf(new_query_properties, query_property, value);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = NIL;
                    SubLObject halt_reason = NIL;
                    {
                        SubLObject _prev_bind_0 = $recursive_query_depth$.currentBinding(thread);
                        try {
                            $recursive_query_depth$.bind(NIL != $recursive_query_depth$.getDynamicValue(thread) ? ((SubLObject) (number_utilities.f_1X($recursive_query_depth$.getDynamicValue(thread)))) : ONE_INTEGER, thread);
                            if ($recursive_query_depth$.getDynamicValue(thread).numG($max_recursive_query_depth$.getGlobalValue())) {
                                if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                                    Errors.error($str_alt58$max_recursive_query_depth_of__s_e, $max_recursive_query_depth$.getGlobalValue(), sentence, mt);
                                } else {
                                    Errors.error($str_alt59$Either_deeper_thought_is_required);
                                }
                            } else {
                                {
                                    SubLObject cprogv_var = $fi_state_variables$.getGlobalValue();
                                    final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                    try {
                                        bind_dynamic_vars(cprogv_var, make_list(length($fi_state_variables$.getGlobalValue()), NIL));
                                        {
                                            SubLObject environment = forward.get_forward_inference_environment();
                                            SubLTrampolineFile.checkType(environment, QUEUE_P);
                                            {
                                                SubLObject _prev_bind_0_1 = $forward_inference_environment$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
                                                try {
                                                    $forward_inference_environment$.bind(environment, thread);
                                                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                                    czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject results_2 = inference_kernel.new_cyc_query(sentence, mt, new_query_properties);
                                                        SubLObject halt_reason_3 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        results = results_2;
                                                        halt_reason = halt_reason_3;
                                                    }
                                                } finally {
                                                    czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_2, thread);
                                                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_1, thread);
                                                    $forward_inference_environment$.rebind(_prev_bind_0_1, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        rebind_dynamic_vars(cprogv_var, old_values);
                                    }
                                }
                            }
                        } finally {
                            $recursive_query_depth$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return values(results, halt_reason);
                }
            }
        }
    }

    public static SubLObject recursive_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_query_properties = copy_list(query_properties);
        final SubLObject problem_store = recursive_query_problem_store_to_reuse(new_query_properties);
        if (NIL != problem_store) {
            new_query_properties = putf(new_query_properties, $PROBLEM_STORE, problem_store);
        }
        if (NIL == getf(new_query_properties, $PROBABLY_APPROXIMATELY_DONE, UNPROVIDED)) {
            new_query_properties = putf(new_query_properties, $PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER);
        }
        SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference_datastructures_inference.inference_p(inference)) {
            SubLObject cdolist_list_var = $query_properties_inherited_by_recursive_queries$.getDynamicValue(thread);
            SubLObject query_property = NIL;
            query_property = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == getf(new_query_properties, query_property, UNPROVIDED)) {
                    final SubLObject value = inference_datastructures_inference.inference_input_query_property(inference, query_property, UNPROVIDED);
                    if (NIL != value) {
                        new_query_properties = putf(new_query_properties, query_property, value);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                query_property = cdolist_list_var.first();
            } 
        }
        if (NIL == list_utilities.indicator_presentP(new_query_properties, $ANSWER_LANGUAGE)) {
            new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
        }
        inference = inference_macros.current_controlling_inference();
        if (((NIL != inference_datastructures_inference.running_inference_p(inference)) && (NIL != inference_datastructures_inference.inference_browsableP(inference))) && ((($recursive_queries_browsableP$.getDynamicValue(thread) == $ONLY_FOR_EXISTING_STORES) && (NIL != getf(new_query_properties, $PROBLEM_STORE, UNPROVIDED))) || ($recursive_queries_browsableP$.getDynamicValue(thread) == T))) {
            new_query_properties = putf(new_query_properties, $BROWSABLE_, T);
        }
        SubLObject results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference2 = NIL;
        SubLObject metrics = NIL;
        final SubLObject _prev_bind_0 = $recursive_query_depth$.currentBinding(thread);
        try {
            $recursive_query_depth$.bind(NIL != $recursive_query_depth$.getDynamicValue(thread) ? number_utilities.f_1X($recursive_query_depth$.getDynamicValue(thread)) : ONE_INTEGER, thread);
            if ($recursive_query_depth$.getDynamicValue(thread).numG($max_recursive_query_depth$.getGlobalValue())) {
                if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                    Errors.error($str60$max_recursive_query_depth_of__s_e, $max_recursive_query_depth$.getGlobalValue(), sentence, mt);
                } else {
                    Errors.error($str61$Either_deeper_thought_is_required);
                }
            } else {
                final SubLObject cprogv_var = $fi_state_variables$.getGlobalValue();
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, make_list(length($fi_state_variables$.getGlobalValue()), NIL));
                    final SubLObject environment = forward.get_forward_inference_environment();
                    assert NIL != queues.queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
                    final SubLObject _prev_bind_0_$1 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                        czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject results_$2 = inference_kernel.new_cyc_query(sentence, mt, new_query_properties);
                        final SubLObject halt_reason_$3 = thread.secondMultipleValue();
                        final SubLObject inference_$4 = thread.thirdMultipleValue();
                        final SubLObject metrics_$5 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        results = results_$2;
                        halt_reason = halt_reason_$3;
                        inference2 = inference_$4;
                        metrics = metrics_$5;
                    } finally {
                        czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_3, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_2, thread);
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
            }
        } finally {
            $recursive_query_depth$.rebind(_prev_bind_0, thread);
        }
        if ((NIL == getf(query_properties, $BROWSABLE_, UNPROVIDED)) && (NIL == getf(query_properties, $CONTINUABLE_, UNPROVIDED))) {
            inference_datastructures_inference.destroy_inference(inference2);
        }
        return values(results, halt_reason, inference2, metrics);
    }

    public static final SubLObject query_property_inherited_by_recursive_queryP_alt(SubLObject property) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.member_eqP(property, $query_properties_inherited_by_recursive_queries$.getDynamicValue(thread));
        }
    }

    public static SubLObject query_property_inherited_by_recursive_queryP(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.member_eqP(property, $query_properties_inherited_by_recursive_queries$.getDynamicValue(thread));
    }

    public static final SubLObject filter_query_properties_for_recursive_query_alt(SubLObject query_properties) {
        return list_utilities.filter_plist(query_properties, $sym61$QUERY_PROPERTY_INHERITED_BY_RECURSIVE_QUERY_);
    }

    public static SubLObject filter_query_properties_for_recursive_query(final SubLObject query_properties) {
        return list_utilities.filter_plist(query_properties, $sym64$QUERY_PROPERTY_INHERITED_BY_RECURSIVE_QUERY_);
    }

    /**
     * Return the problem store to reuse for a recursive query with QUERY-PROPERTIES
     * or NIL if no existing store can be determined.
     */
    @LispMethod(comment = "Return the problem store to reuse for a recursive query with QUERY-PROPERTIES\r\nor NIL if no existing store can be determined.\nReturn the problem store to reuse for a recursive query with QUERY-PROPERTIES\nor NIL if no existing store can be determined.")
    public static final SubLObject recursive_query_problem_store_to_reuse_alt(SubLObject query_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $recursive_queries_in_currently_active_problem_storeP$.getDynamicValue(thread)) {
                {
                    SubLObject problem_store = inference_worker.currently_active_problem_store();
                    if (NIL != problem_store) {
                        if (NIL != inference_parameters.problem_store_allows_reuse_wrt_query_propertiesP(problem_store, query_properties)) {
                            return problem_store;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Return the problem store to reuse for a recursive query with QUERY-PROPERTIES
     * or NIL if no existing store can be determined.
     */
    @LispMethod(comment = "Return the problem store to reuse for a recursive query with QUERY-PROPERTIES\r\nor NIL if no existing store can be determined.\nReturn the problem store to reuse for a recursive query with QUERY-PROPERTIES\nor NIL if no existing store can be determined.")
    public static SubLObject recursive_query_problem_store_to_reuse(final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.getDynamicValue(thread)) && (NIL == kb_control_vars.within_forward_inferenceP())) {
            final SubLObject problem_store = inference_worker.currently_active_problem_store();
            if ((NIL != problem_store) && (NIL != inference_parameters.problem_store_allows_reuse_wrt_query_propertiesP(problem_store, query_properties))) {
                return problem_store;
            }
        }
        return NIL;
    }

    public static final SubLObject kappa_tuples_alt(SubLObject v_variables, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fi_variables = uncanonicalizer.uncanonicalize_recursive_query_vars(v_variables);
                SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query(sentence);
                SubLObject new_query_properties = copy_list(query_properties);
                new_query_properties = putf(new_query_properties, $RETURN, list($TEMPLATE, fi_variables));
                new_query_properties = putf(new_query_properties, $RESULT_UNIQUENESS, $BINDINGS);
                new_query_properties = putf(new_query_properties, $kw62$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL);
                new_query_properties = putf(new_query_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $NONE);
                new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
                thread.resetMultipleValues();
                {
                    SubLObject tuples = com.cyc.cycjava.cycl.inference.ask_utilities.recursive_query(fi_sentence, mt, new_query_properties);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    tuples = delete_duplicates(tuples, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return values(tuples, halt_reason);
                }
            }
        }
    }

    public static SubLObject kappa_tuples(final SubLObject v_variables, final SubLObject sentence, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fi_variables = uncanonicalizer.uncanonicalize_recursive_query_vars(v_variables);
        final SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query(sentence);
        SubLObject new_query_properties = copy_list(query_properties);
        new_query_properties = putf(new_query_properties, $RETURN, list($TEMPLATE, fi_variables));
        new_query_properties = putf(new_query_properties, $RESULT_UNIQUENESS, $BINDINGS);
        new_query_properties = putf(new_query_properties, $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL);
        new_query_properties = putf(new_query_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $NONE);
        new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
        thread.resetMultipleValues();
        SubLObject tuples = recursive_query(fi_sentence, mt, new_query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        tuples = delete_duplicates(tuples, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(tuples, halt_reason);
    }

    public static final SubLObject kappa_tuples_justified_alt(SubLObject v_variables, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fi_variables = uncanonicalizer.uncanonicalize_recursive_query_vars(v_variables);
                SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query(sentence);
                SubLObject new_query_properties = copy_list(query_properties);
                new_query_properties = putf(new_query_properties, $RETURN, list($TEMPLATE, append(list(fi_variables), $list_alt63)));
                new_query_properties = putf(new_query_properties, $RESULT_UNIQUENESS, $BINDINGS);
                new_query_properties = putf(new_query_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $NONE);
                new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
                thread.resetMultipleValues();
                {
                    SubLObject tuples = com.cyc.cycjava.cycl.inference.ask_utilities.recursive_query(fi_sentence, mt, new_query_properties);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    tuples = delete_duplicates(tuples, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return values(tuples, halt_reason);
                }
            }
        }
    }

    public static SubLObject kappa_tuples_justified(final SubLObject v_variables, final SubLObject sentence, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fi_variables = uncanonicalizer.uncanonicalize_recursive_query_vars(v_variables);
        final SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query(sentence);
        SubLObject new_query_properties = copy_list(query_properties);
        new_query_properties = putf(new_query_properties, $RETURN, list($TEMPLATE, append(list(fi_variables), $list66)));
        new_query_properties = putf(new_query_properties, $RESULT_UNIQUENESS, $BINDINGS);
        new_query_properties = putf(new_query_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $NONE);
        new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
        thread.resetMultipleValues();
        SubLObject tuples = recursive_query(fi_sentence, mt, new_query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        tuples = delete_duplicates(tuples, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(tuples, halt_reason);
    }

    /**
     * Ask SENTENCE in MT.  Return bindings and supports for those bindings.
     * Deprecated in favor of inference-recursive-query.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return bindings and supports for those bindings.\r\nDeprecated in favor of inference-recursive-query.\nAsk SENTENCE in MT.  Return bindings and supports for those bindings.\nDeprecated in favor of inference-recursive-query.")
    public static final SubLObject inference_recursive_ask_alt(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        {
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.recursive_ask_query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
            return com.cyc.cycjava.cycl.inference.ask_utilities.inference_recursive_query(sentence, mt, query_properties);
        }
    }

    /**
     * Ask SENTENCE in MT.  Return bindings and supports for those bindings.
     * Deprecated in favor of inference-recursive-query.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return bindings and supports for those bindings.\r\nDeprecated in favor of inference-recursive-query.\nAsk SENTENCE in MT.  Return bindings and supports for those bindings.\nDeprecated in favor of inference-recursive-query.")
    public static SubLObject inference_recursive_ask(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        final SubLObject query_properties = recursive_ask_query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return inference_recursive_query(sentence, mt, query_properties);
    }

    /**
     * Ask SENTENCE in MT.  Return bindings and supports for those bindings.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return bindings and supports for those bindings.")
    public static final SubLObject inference_recursive_query_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_variables = variables.gather_hl_variables(sentence);
                SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query(sentence);
                SubLObject new_query_properties = copy_list(query_properties);
                new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
                new_query_properties = putf(new_query_properties, $RESULT_UNIQUENESS, $PROOF);
                new_query_properties = putf(new_query_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
                thread.resetMultipleValues();
                {
                    SubLObject results = com.cyc.cycjava.cycl.inference.ask_utilities.recursive_query(fi_sentence, mt, new_query_properties);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cdolist_list_var = results;
                        SubLObject result = NIL;
                        for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                            {
                                SubLObject v_bindings = result.first();
                                if (NIL != v_bindings) {
                                    set_nth(ZERO_INTEGER, result, com.cyc.cycjava.cycl.inference.ask_utilities.inference_recursive_query_convert_to_hl_bindings(v_bindings, hl_variables));
                                }
                            }
                        }
                    }
                    return values(results, halt_reason);
                }
            }
        }
    }

    /**
     * Ask SENTENCE in MT.  Return bindings and supports for those bindings.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return bindings and supports for those bindings.")
    public static SubLObject inference_recursive_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_variables = variables.gather_hl_variables(sentence);
        final SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query(sentence);
        SubLObject new_query_properties = copy_list(query_properties);
        new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
        new_query_properties = putf(new_query_properties, $RESULT_UNIQUENESS, $PROOF);
        new_query_properties = putf(new_query_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
        thread.resetMultipleValues();
        final SubLObject results = recursive_query(fi_sentence, mt, new_query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = result.first();
            if (NIL != v_bindings) {
                set_nth(ZERO_INTEGER, result, inference_recursive_query_convert_to_hl_bindings(v_bindings, hl_variables));
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return values(results, halt_reason, inference, metrics);
    }

    /**
     * Ask SENTENCE in MT.  Return bindings only.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return bindings only.")
    public static final SubLObject inference_recursive_query_unique_bindings_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                mt = mt_vars.$default_ask_mt$.getGlobalValue();
            }
            {
                SubLObject hl_variables = variables.gather_hl_variables(sentence);
                SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query(sentence);
                SubLObject new_query_properties = copy_list(query_properties);
                new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
                new_query_properties = putf(new_query_properties, $RESULT_UNIQUENESS, $BINDINGS);
                new_query_properties = putf(new_query_properties, $kw62$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL);
                new_query_properties = putf(new_query_properties, $RETURN, $BINDINGS);
                thread.resetMultipleValues();
                {
                    SubLObject results = com.cyc.cycjava.cycl.inference.ask_utilities.recursive_query(fi_sentence, mt, new_query_properties);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject final_results = NIL;
                        SubLObject cdolist_list_var = results;
                        SubLObject result = NIL;
                        for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                            final_results = cons(com.cyc.cycjava.cycl.inference.ask_utilities.inference_recursive_query_convert_to_hl_bindings(result, hl_variables), final_results);
                        }
                        final_results = nreverse(final_results);
                        return values(final_results, halt_reason);
                    }
                }
            }
        }
    }

    /**
     * Ask SENTENCE in MT.  Return bindings only.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return bindings only.")
    public static SubLObject inference_recursive_query_unique_bindings(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        final SubLObject hl_variables = variables.gather_hl_variables(sentence);
        final SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query(sentence);
        SubLObject new_query_properties = copy_list(query_properties);
        new_query_properties = putf(new_query_properties, $ANSWER_LANGUAGE, $HL);
        new_query_properties = putf(new_query_properties, $RESULT_UNIQUENESS, $BINDINGS);
        new_query_properties = putf(new_query_properties, $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL);
        new_query_properties = putf(new_query_properties, $RETURN, $BINDINGS);
        thread.resetMultipleValues();
        final SubLObject results = recursive_query(fi_sentence, mt, new_query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject final_results = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final_results = cons(inference_recursive_query_convert_to_hl_bindings(result, hl_variables), final_results);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final_results = nreverse(final_results);
        return values(final_results, halt_reason, inference, metrics);
    }

    /**
     * Ask SENTENCE in MT.  Return bindings only.
     * Deprecated in favor of inference-recursive-query-unique-bindings.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return bindings only.\r\nDeprecated in favor of inference-recursive-query-unique-bindings.\nAsk SENTENCE in MT.  Return bindings only.\nDeprecated in favor of inference-recursive-query-unique-bindings.")
    public static final SubLObject inference_recursive_ask_unique_bindings_alt(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.ask_utilities.recursive_ask_query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
            return com.cyc.cycjava.cycl.inference.ask_utilities.inference_recursive_query_unique_bindings(sentence, mt, query_properties);
        }
    }

    /**
     * Ask SENTENCE in MT.  Return bindings only.
     * Deprecated in favor of inference-recursive-query-unique-bindings.
     */
    @LispMethod(comment = "Ask SENTENCE in MT.  Return bindings only.\r\nDeprecated in favor of inference-recursive-query-unique-bindings.\nAsk SENTENCE in MT.  Return bindings only.\nDeprecated in favor of inference-recursive-query-unique-bindings.")
    public static SubLObject inference_recursive_ask_unique_bindings(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject query_properties = recursive_ask_query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return inference_recursive_query_unique_bindings(sentence, mt, query_properties);
    }

    public static final SubLObject inference_recursive_query_convert_to_hl_bindings_alt(SubLObject result_bindings, SubLObject hl_variables) {
        if ((NIL == hl_variables) || (NIL != cyc_kernel.closed_query_bindings_p(result_bindings))) {
            return result_bindings;
        }
        {
            SubLObject answer_bindings = NIL;
            SubLObject cdolist_list_var = hl_variables;
            SubLObject hl_variable = NIL;
            for (hl_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_variable = cdolist_list_var.first()) {
                {
                    SubLObject el_variable = variables.default_el_var_for_hl_var(hl_variable);
                    SubLObject value = bindings.variable_lookup(el_variable, result_bindings);
                    answer_bindings = cons(bindings.make_variable_binding(hl_variable, value), answer_bindings);
                }
            }
            return nreverse(answer_bindings);
        }
    }

    public static SubLObject inference_recursive_query_convert_to_hl_bindings(final SubLObject result_bindings, final SubLObject hl_variables) {
        if ((NIL == hl_variables) || (NIL != cyc_kernel.closed_query_bindings_p(result_bindings))) {
            return result_bindings;
        }
        SubLObject answer_bindings = NIL;
        SubLObject cdolist_list_var = hl_variables;
        SubLObject hl_variable = NIL;
        hl_variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject el_variable = variables.default_el_var_for_hl_var(hl_variable);
            final SubLObject value = bindings.variable_lookup(el_variable, result_bindings);
            answer_bindings = cons(bindings.make_variable_binding(hl_variable, value), answer_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            hl_variable = cdolist_list_var.first();
        } 
        return nreverse(answer_bindings);
    }

    /**
     * Recursively call the inference engine to determine the truth of LITERAL.
     */
    @LispMethod(comment = "Recursively call the inference engine to determine the truth of LITERAL.")
    public static final SubLObject inference_literal_truth_alt(SubLObject literal, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.inference.ask_utilities.inference_literal_ask(literal, mt)) {
            return $TRUE;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.ask_utilities.inference_literal_ask(cycl_utilities.negate(literal), mt)) {
            return $FALSE;
        }
        return $UNKNOWN;
    }

    /**
     * Recursively call the inference engine to determine the truth of LITERAL.
     */
    @LispMethod(comment = "Recursively call the inference engine to determine the truth of LITERAL.")
    public static SubLObject inference_literal_truth(final SubLObject literal, final SubLObject mt) {
        if (NIL != inference_literal_ask(literal, mt)) {
            return $TRUE;
        }
        if (NIL != inference_literal_ask(cycl_utilities.negate(literal), mt)) {
            return $FALSE;
        }
        return $UNKNOWN;
    }

    /**
     * Recursively call the inference engine to see if LITERAL can be proved.
     */
    @LispMethod(comment = "Recursively call the inference engine to see if LITERAL can be proved.")
    public static final SubLObject inference_literal_ask_alt(SubLObject literal, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.ask_utilities.inference_recursive_query_unique_bindings(literal, mt, $list_alt67));
    }

    /**
     * Recursively call the inference engine to see if LITERAL can be proved.
     */
    @LispMethod(comment = "Recursively call the inference engine to see if LITERAL can be proved.")
    public static SubLObject inference_literal_ask(final SubLObject literal, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_recursive_query_unique_bindings(literal, mt, $list70));
    }

    public static final SubLObject the_set_of_elements_alt(SubLObject v_set, SubLObject answer_language, SubLObject mt) {
        if (answer_language == UNPROVIDED) {
            answer_language = $EL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.inference.ask_utilities.the_set_of_problem_solvable_via_generalized_queryP(UNPROVIDED, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.inference.ask_utilities.the_set_of_elements_via_generalized_query(UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject datum = cycl_utilities.nat_args(v_set, UNPROVIDED);
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject query = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt68);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt68);
            query = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject fi_variable = uncanonicalizer.uncanonicalize_recursive_query_vars(variable);
                    SubLObject fi_query = uncanonicalizer.uncanonicalize_recursive_query(query);
                    SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(fi_query, mt);
                    SubLObject tuples = NIL;
                    query_properties = putf(query_properties, $ANSWER_LANGUAGE, answer_language);
                    tuples = com.cyc.cycjava.cycl.inference.ask_utilities.kappa_tuples(list(fi_variable), fi_query, mt, query_properties);
                    return Mapping.mapcar(symbol_function(FIRST), tuples);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt68);
            }
        }
        return NIL;
    }

    public static SubLObject the_set_of_elements(final SubLObject v_set, SubLObject answer_language, SubLObject mt) {
        if (answer_language == UNPROVIDED) {
            answer_language = $EL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != the_set_of_problem_solvable_via_generalized_queryP(v_set, UNPROVIDED, UNPROVIDED)) {
            return the_set_of_elements_via_generalized_query(UNPROVIDED, UNPROVIDED);
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(v_set, UNPROVIDED);
        SubLObject variable = NIL;
        SubLObject query = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        query = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject fi_variable = uncanonicalizer.uncanonicalize_recursive_query_vars(variable);
            final SubLObject fi_query = uncanonicalizer.uncanonicalize_recursive_query(query);
            SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(fi_query, mt);
            SubLObject tuples = NIL;
            query_properties = putf(query_properties, $ANSWER_LANGUAGE, answer_language);
            tuples = kappa_tuples(list(fi_variable), fi_query, mt, query_properties);
            return Mapping.mapcar(symbol_function(FIRST), tuples);
        }
        cdestructuring_bind_error(datum, $list71);
        return NIL;
    }

    public static final SubLObject the_set_of_problem_solvable_via_generalized_queryP(SubLObject problem, SubLObject mt) {
        if (problem == UNPROVIDED) {
            problem = inference_worker.currently_active_problem();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sksi_conjunctive_removal_modules_cost.$strongly_prefer_conjunctive_removal_modulesP$.getDynamicValue(thread)) {
                return NIL;
            }
            if (NIL == inference_datastructures_problem.problem_p(problem)) {
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject unrestricted_problem = com.cyc.cycjava.cycl.inference.ask_utilities.find_unrestricted_problem_of_the_set_of_expression_problem(problem);
                SubLObject unrestricted_the_set_of_expression = thread.secondMultipleValue();
                SubLObject restriction_link_bindings = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (((NIL != unrestricted_problem) && (NIL != unrestricted_the_set_of_expression)) && (NIL != restriction_link_bindings)) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject the_set_of_problem_solvable_via_generalized_queryP(SubLObject v_set, SubLObject problem, SubLObject mt) {
        if (v_set == UNPROVIDED) {
            v_set = NIL;
        }
        if (problem == UNPROVIDED) {
            problem = inference_worker.currently_active_problem();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == inference_datastructures_problem.problem_p(problem)) || (NIL == cycl_utilities.expression_find($$TheSetOf, inference_datastructures_problem.problem_query(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return values(NIL, $NO_THE_SET_OF_EXPRESSION_FOUND);
        }
        if (NIL == $allow_the_set_of_via_generalized_queryP$.getDynamicValue(thread)) {
            return values(NIL, $THE_SET_OF_VIA_GENERALIZED_QUERY_NOT_ALLOWED);
        }
        if (NIL == sksi_conjunctive_removal_modules_cost.$sksi_strongly_prefer_conjunctive_removal_modulesP$.getDynamicValue(thread)) {
            return values(NIL, $SKSI_STRONGLY_PREFER_CONJUNCTIVE_REMOVAL_MODULES_NOT_T);
        }
        if (NIL == inference_datastructures_problem.problem_p(problem)) {
            return values(NIL, $PROBLEM_NOT_VALID);
        }
        SubLObject unrestricted_problem = find_unrestricted_problem_of_the_set_of_expression_problem(problem);
        if (NIL == unrestricted_problem) {
            return values(NIL, $CANNOT_FIND_UNRESTRICTED_PROBLEM_OF_THE_SET_OF_EXPRESSION_PROBLEM);
        }
        if (NIL == find_jo_link_and_focal_problem_of_supported_problem(unrestricted_problem)) {
            return values(NIL, $CANNOT_FIND_JO_LINK_AND_FOCAL_PROBLEM_OF_SUPPORTED_PROBLEM);
        }
        thread.resetMultipleValues();
        unrestricted_problem = find_unrestricted_problem_of_the_set_of_expression_problem(problem);
        final SubLObject unrestricted_the_set_of_expression = thread.secondMultipleValue();
        final SubLObject restriction_link_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (((NIL != unrestricted_problem) && (NIL != unrestricted_the_set_of_expression)) && (NIL != restriction_link_bindings)) {
            if (NIL != el_intensional_set_p(v_set)) {
                final SubLObject generalized_query = compute_the_set_of_elements_generalized_query(problem);
                final SubLObject generalized_query_properties = determine_the_set_of_elements_generalized_query_properties(generalized_query, mt);
                final SubLObject restricted_query = cycl_utilities.formula_arg2(v_set, UNPROVIDED);
                final SubLObject set_el_var = cycl_utilities.formula_arg1(v_set, UNPROVIDED);
                final SubLObject restricted_query_properties = determine_the_set_of_elements_generalized_query_properties(restricted_query, mt);
                if (!generalized_query_properties.equal(restricted_query_properties)) {
                    return values(NIL, $kw80$GENERALIZED_QUERY_PROPERTIES_DIFFERENT_THAN_RESTRICTED_QUERY_PROP);
                }
                if (NIL != cycl_utilities.expression_find(restricted_query, generalized_query, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, $GENERALIZED_QUERY_NOT_GENERALIZED__CONTAINS_RESTRICTED_QUERY);
                }
                if (NIL != cycl_utilities.expression_gather(generalized_query, $sym82$PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_FOR_THE_SET_OF_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, $kw83$GENERALIZED_QUERY_CONTAINS_PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_);
                }
                if (NIL != $debug_the_set_of_problem_solvable_via_generalized_queryP$.getDynamicValue(thread)) {
                    final SubLObject generalized_answers = the_set_of_elements_via_generalized_query(problem, mt);
                    thread.resetMultipleValues();
                    final SubLObject answers = query_template(set_el_var, restricted_query, mt, restricted_query_properties);
                    final SubLObject halt_reason = thread.secondMultipleValue();
                    final SubLObject inference = thread.thirdMultipleValue();
                    final SubLObject metrics = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != set_difference(answers, generalized_answers, $sym84$EQUALS_EL_, UNPROVIDED)) {
                        format_nil.force_format(T, $str85$the_set_of_via_generalized_query_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format_nil.force_format(T, $str86$__Generalized_query___new_cyc_que, sefify(compute_the_set_of_elements_generalized_query(problem)), sefify(mt), sefify(generalized_query_properties), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format_nil.force_format(T, $str87$__Restricted__query___new_cyc_que, sefify(restricted_query), sefify(mt), sefify(restricted_query_properties), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = set_difference(answers, generalized_answers, $sym84$EQUALS_EL_, UNPROVIDED);
                        SubLObject x = NIL;
                        x = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            format_nil.force_format(T, $str88$__Missed_answer___S_____S__, set_el_var, x, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            x = cdolist_list_var.first();
                        } 
                    }
                }
            }
            return values(T, NIL);
        }
        return values(NIL, $FALLTHROUGH_NIL);
    }

    public static SubLObject pred_not_allowed_in_generalized_query_for_the_set_ofP(final SubLObject v_object) {
        return makeBoolean((((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.predicateP(v_object))) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($const90$predNotAllowedInGeneralizedQueryF, v_object, ONE_INTEGER, UNPROVIDED))) && (NIL != kb_mapping_utilities.fpred_value(v_object, $const90$predNotAllowedInGeneralizedQueryF, ONE_INTEGER, ONE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject the_set_of_elements_via_generalized_query_alt(SubLObject problem, SubLObject mt) {
        if (problem == UNPROVIDED) {
            problem = inference_worker.currently_active_problem();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject generalized_query = com.cyc.cycjava.cycl.inference.ask_utilities.compute_the_set_of_elements_generalized_query(problem);
                SubLObject the_set_of_variable = thread.secondMultipleValue();
                SubLObject supported_restriction_bindings = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject expanded_answers = com.cyc.cycjava.cycl.inference.ask_utilities.the_set_of_elements_generalized_query_memoized(generalized_query, mt);
                    SubLObject result = NIL;
                    SubLObject cdolist_list_var = expanded_answers;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        if (NIL != list_utilities.fast_subsetP(supported_restriction_bindings, binding, symbol_function(EQUAL))) {
                            result = cons(bindings.variable_lookup(the_set_of_variable, binding), result);
                        }
                    }
                    return list_utilities.fast_delete_duplicates(result, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    public static SubLObject the_set_of_elements_via_generalized_query(SubLObject problem, SubLObject mt) {
        if (problem == UNPROVIDED) {
            problem = inference_worker.currently_active_problem();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject generalized_query = compute_the_set_of_elements_generalized_query(problem);
        final SubLObject the_set_of_variable = thread.secondMultipleValue();
        final SubLObject supported_restriction_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject expanded_answers = the_set_of_elements_generalized_query_memoized(generalized_query, mt);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = expanded_answers;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.fast_subsetP(supported_restriction_bindings, binding, symbol_function(EQUAL))) {
                result = cons(bindings.variable_lookup(the_set_of_variable, binding), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(result, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject compute_the_set_of_elements_generalized_query_alt(SubLObject problem) {
        if (problem == UNPROVIDED) {
            problem = inference_worker.currently_active_problem();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject unrestricted_problem = com.cyc.cycjava.cycl.inference.ask_utilities.find_unrestricted_problem_of_the_set_of_expression_problem(problem);
                SubLObject unrestricted_the_set_of_expression = thread.secondMultipleValue();
                SubLObject restriction_link_bindings = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject focal_jo_link = com.cyc.cycjava.cycl.inference.ask_utilities.find_jo_link_and_focal_problem_of_supported_problem(unrestricted_problem);
                    SubLObject focal_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != focal_problem) {
                        {
                            SubLObject jo_link_focal_to_supp_bindings = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(focal_jo_link);
                            SubLObject jo_link_non_focal_to_supp_bindings = inference_worker_join_ordered.join_ordered_link_non_focal_to_supported_variable_map(focal_jo_link);
                            SubLObject the_set_of_variable = cycl_utilities.formula_arg1(unrestricted_the_set_of_expression, UNPROVIDED);
                            SubLObject unrestricted_the_set_of_formula = cycl_utilities.formula_arg2(unrestricted_the_set_of_expression, UNPROVIDED);
                            SubLObject focal_problem_formula = inference_datastructures_problem.problem_formula(focal_problem);
                            SubLObject supported_generator_formula = bindings.apply_bindings(jo_link_focal_to_supp_bindings, focal_problem_formula);
                            SubLObject supported_the_set_of_formula = bindings.apply_bindings(jo_link_non_focal_to_supp_bindings, unrestricted_the_set_of_formula);
                            SubLObject supported_restriction_bindings = bindings.apply_bindings(jo_link_non_focal_to_supp_bindings, restriction_link_bindings);
                            SubLObject numeric_quantification_value_formula = numeric_quantification.compute_possible_numeric_quantification_value_formula(the_set_of_variable);
                            SubLObject generalized_query = make_conjunction(listS(supported_generator_formula, supported_the_set_of_formula, append(NIL != numeric_quantification_value_formula ? ((SubLObject) (list(numeric_quantification_value_formula))) : NIL, NIL)));
                            return values(generalized_query, the_set_of_variable, supported_restriction_bindings);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_the_set_of_elements_generalized_query(SubLObject problem) {
        if (problem == UNPROVIDED) {
            problem = inference_worker.currently_active_problem();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unrestricted_problem = find_unrestricted_problem_of_the_set_of_expression_problem(problem);
        final SubLObject unrestricted_the_set_of_expression = thread.secondMultipleValue();
        final SubLObject restriction_link_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject focal_jo_link = find_jo_link_and_focal_problem_of_supported_problem(unrestricted_problem);
        final SubLObject focal_problem = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != focal_problem) {
            final SubLObject jo_link_focal_to_supp_bindings = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(focal_jo_link);
            final SubLObject jo_link_non_focal_to_supp_bindings = inference_worker_join_ordered.join_ordered_link_non_focal_to_supported_variable_map(focal_jo_link);
            final SubLObject the_set_of_variable = cycl_utilities.formula_arg1(unrestricted_the_set_of_expression, UNPROVIDED);
            final SubLObject unrestricted_the_set_of_formula = cycl_utilities.formula_arg2(unrestricted_the_set_of_expression, UNPROVIDED);
            final SubLObject focal_problem_formula = inference_datastructures_problem.problem_formula(focal_problem);
            final SubLObject supported_generator_formula = bindings.apply_bindings(jo_link_focal_to_supp_bindings, focal_problem_formula);
            final SubLObject supported_the_set_of_formula = bindings.apply_bindings(jo_link_non_focal_to_supp_bindings, unrestricted_the_set_of_formula);
            final SubLObject supported_restriction_bindings = bindings.apply_bindings(jo_link_non_focal_to_supp_bindings, restriction_link_bindings);
            final SubLObject numeric_quantification_value_formula = numeric_quantification.compute_possible_numeric_quantification_value_formula(the_set_of_variable);
            final SubLObject generalized_query = make_conjunction(listS(supported_generator_formula, supported_the_set_of_formula, append(NIL != numeric_quantification_value_formula ? list(numeric_quantification_value_formula) : NIL, NIL)));
            return values(generalized_query, the_set_of_variable, supported_restriction_bindings);
        }
        return NIL;
    }

    public static final SubLObject find_unrestricted_problem_of_the_set_of_expression_problem_alt(SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject restricted_the_set_of_expressions = list_utilities.tree_find_all_if(EL_INTENSIONAL_SET_P, inference_datastructures_problem.problem_formula(problem), UNPROVIDED);
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                            if (NIL != inference_worker_restriction.restriction_link_p(link)) {
                                {
                                    SubLObject possible_unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                    SubLObject restriction_link_bindings = inference_worker_restriction.restriction_link_bindings(link);
                                    if (NIL != inference_datastructures_problem.problem_p(possible_unrestricted_problem)) {
                                        {
                                            SubLObject unrestricted_the_set_of_expressions = list_utilities.tree_find_all_if(EL_INTENSIONAL_SET_P, inference_datastructures_problem.problem_formula(possible_unrestricted_problem), UNPROVIDED);
                                            SubLObject cdolist_list_var = restricted_the_set_of_expressions;
                                            SubLObject this_restricted_the_set_of_expression = NIL;
                                            for (this_restricted_the_set_of_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_restricted_the_set_of_expression = cdolist_list_var.first()) {
                                                {
                                                    SubLObject cdolist_list_var_4 = unrestricted_the_set_of_expressions;
                                                    SubLObject this_unrestricted_the_set_of_expression = NIL;
                                                    for (this_unrestricted_the_set_of_expression = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , this_unrestricted_the_set_of_expression = cdolist_list_var_4.first()) {
                                                        if (this_restricted_the_set_of_expression.equal(bindings.apply_bindings(restriction_link_bindings, this_unrestricted_the_set_of_expression))) {
                                                            return values(possible_unrestricted_problem, this_unrestricted_the_set_of_expression, restriction_link_bindings);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                                    {
                                        SubLObject dependent_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                        if (NIL != inference_datastructures_problem.problem_p(dependent_problem)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject unrestricted_problem = com.cyc.cycjava.cycl.inference.ask_utilities.find_unrestricted_problem_of_the_set_of_expression_problem(dependent_problem);
                                                SubLObject unrestricted_the_set_of_expression = thread.secondMultipleValue();
                                                SubLObject restriction_link_bindings = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != unrestricted_problem) {
                                                    return values(unrestricted_problem, unrestricted_the_set_of_expression, restriction_link_bindings);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != inference_worker_split.split_link_p(link)) {
                                        return com.cyc.cycjava.cycl.inference.ask_utilities.find_unrestricted_problem_of_the_set_of_expression_problem(inference_datastructures_problem_link.problem_link_supported_problem(link));
                                    }
                                }
                            }
                        }
                    }
                }
                return values(NIL, NIL, NIL);
            }
        }
    }

    public static SubLObject find_unrestricted_problem_of_the_set_of_expression_problem(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject restricted_the_set_of_expressions = cycl_utilities.expression_gather(inference_datastructures_problem.problem_formula(problem), EL_INTENSIONAL_SET_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject possible_unrestricted_problem;
        SubLObject restriction_link_bindings;
        SubLObject unrestricted_the_set_of_expressions;
        SubLObject candidate_results;
        SubLObject cdolist_list_var;
        SubLObject this_restricted_the_set_of_expression;
        SubLObject cdolist_list_var_$6;
        SubLObject this_unrestricted_the_set_of_expression;
        SubLObject current;
        SubLObject datum;
        SubLObject possible_unrestricted_problem_$7;
        SubLObject this_unrestricted_the_set_of_expression2;
        SubLObject restriction_link_bindings_$8;
        SubLObject dependent_problem;
        SubLObject unrestricted_problem;
        SubLObject unrestricted_the_set_of_expression;
        SubLObject restriction_link_bindings2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                if (NIL != inference_worker_restriction.restriction_link_p(link)) {
                    possible_unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    restriction_link_bindings = inference_worker_restriction.restriction_link_bindings(link);
                    if (NIL != inference_datastructures_problem.problem_p(possible_unrestricted_problem)) {
                        unrestricted_the_set_of_expressions = cycl_utilities.expression_gather(inference_datastructures_problem.problem_formula(possible_unrestricted_problem), EL_INTENSIONAL_SET_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        candidate_results = NIL;
                        cdolist_list_var = restricted_the_set_of_expressions;
                        this_restricted_the_set_of_expression = NIL;
                        this_restricted_the_set_of_expression = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$6 = unrestricted_the_set_of_expressions;
                            this_unrestricted_the_set_of_expression = NIL;
                            this_unrestricted_the_set_of_expression = cdolist_list_var_$6.first();
                            while (NIL != cdolist_list_var_$6) {
                                if (this_restricted_the_set_of_expression.equal(bindings.apply_bindings(restriction_link_bindings, this_unrestricted_the_set_of_expression))) {
                                    candidate_results = cons(list(possible_unrestricted_problem, this_unrestricted_the_set_of_expression, restriction_link_bindings), candidate_results);
                                }
                                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                this_unrestricted_the_set_of_expression = cdolist_list_var_$6.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            this_restricted_the_set_of_expression = cdolist_list_var.first();
                        } 
                        if ((NIL == $be_careful_when_solving_the_set_of_via_generalized_queryP$.getDynamicValue(thread)) || (NIL != list_utilities.singletonP(candidate_results))) {
                            datum = current = list_utilities.only_one(candidate_results);
                            possible_unrestricted_problem_$7 = NIL;
                            this_unrestricted_the_set_of_expression2 = NIL;
                            restriction_link_bindings_$8 = NIL;
                            destructuring_bind_must_consp(current, datum, $list92);
                            possible_unrestricted_problem_$7 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list92);
                            this_unrestricted_the_set_of_expression2 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list92);
                            restriction_link_bindings_$8 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                return values(possible_unrestricted_problem_$7, this_unrestricted_the_set_of_expression2, restriction_link_bindings_$8);
                            }
                            cdestructuring_bind_error(datum, $list92);
                        }
                    }
                } else
                    if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                        dependent_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                        if (NIL != inference_datastructures_problem.problem_p(dependent_problem)) {
                            thread.resetMultipleValues();
                            unrestricted_problem = find_unrestricted_problem_of_the_set_of_expression_problem(dependent_problem);
                            unrestricted_the_set_of_expression = thread.secondMultipleValue();
                            restriction_link_bindings2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != unrestricted_problem) {
                                return values(unrestricted_problem, unrestricted_the_set_of_expression, restriction_link_bindings2);
                            }
                        }
                    } else
                        if (NIL != inference_worker_split.split_link_p(link)) {
                            return find_unrestricted_problem_of_the_set_of_expression_problem(inference_datastructures_problem_link.problem_link_supported_problem(link));
                        }


            }
        }
        return values(NIL, NIL, NIL);
    }

    public static final SubLObject find_jo_link_and_focal_problem_of_supported_problem_alt(SubLObject supported_problem) {
        {
            SubLObject cdolist_list_var = list_utilities.find_all_if(JOIN_ORDERED_LINK_P, inference_datastructures_problem.problem_all_dependent_links(supported_problem), UNPROVIDED);
            SubLObject jo_link = NIL;
            for (jo_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , jo_link = cdolist_list_var.first()) {
                {
                    SubLObject possible_focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
                    if (supported_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(jo_link)) {
                        return values(jo_link, possible_focal_problem);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_jo_link_and_focal_problem_of_supported_problem(final SubLObject supported_problem) {
        SubLObject cdolist_list_var = list_utilities.find_all_if(JOIN_ORDERED_LINK_P, inference_datastructures_problem.problem_all_dependent_links(supported_problem), UNPROVIDED);
        SubLObject jo_link = NIL;
        jo_link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject possible_focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
            if (supported_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(jo_link))) {
                return values(jo_link, possible_focal_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            jo_link = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject the_set_of_elements_generalized_query_memoized_internal_alt(SubLObject generalized_query, SubLObject mt) {
        {
            SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(generalized_query, mt);
            query_properties = putf(query_properties, $kw62$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL);
            return com.cyc.cycjava.cycl.inference.ask_utilities.recursive_query(generalized_query, mt, query_properties);
        }
    }

    public static SubLObject the_set_of_elements_generalized_query_memoized_internal(final SubLObject generalized_query, final SubLObject mt) {
        final SubLObject query_properties = determine_the_set_of_elements_generalized_query_properties(generalized_query, mt);
        return recursive_query(generalized_query, mt, query_properties);
    }

    public static final SubLObject the_set_of_elements_generalized_query_memoized_alt(SubLObject generalized_query, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.ask_utilities.the_set_of_elements_generalized_query_memoized_internal(generalized_query, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(generalized_query, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw73$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (generalized_query.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.ask_utilities.the_set_of_elements_generalized_query_memoized_internal(generalized_query, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(generalized_query, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject the_set_of_elements_generalized_query_memoized(final SubLObject generalized_query, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return the_set_of_elements_generalized_query_memoized_internal(generalized_query, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(generalized_query, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (generalized_query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(the_set_of_elements_generalized_query_memoized_internal(generalized_query, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(generalized_query, mt));
        return memoization_state.caching_results(results3);
    }

    static private final SubLList $list_alt27 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    static private final SubLString $str_alt28$Ask_for_bindings_for_free_variabl = makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   Returns a list of binding and justificaion pairs.");

    static private final SubLList $list_alt29 = list(makeSymbol("LISTP"), makeSymbol("QUERY-HALT-REASON-P"));

    static private final SubLList $list_alt31 = list(makeSymbol("QUERY-JUSTIFIED"));

    static private final SubLList $list_alt32 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLString $str_alt33$Ask_for_bindings_for_free_variabl = makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   If BACKCHAIN is NIL, no inference is performed.\n   If BACKCHAIN is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If BACKCHAIN is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If NUMBER is an integer, then at most that number of bindings are returned.\n   If TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\n   If DEPTH is an integer, then the inference paths are limited to that number of total steps.\n   Returns a list of binding and justificaion pairs.\n   Deprecated in favor of query-justified.");

    static private final SubLList $list_alt35 = list(makeSymbol("TEMPLATE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    static private final SubLString $str_alt36$Ask_SENTENCE_in_MT___Return_resul = makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.");

    static private final SubLList $list_alt38 = list(makeSymbol("QUERY-TEMPLATE"));

    static private final SubLList $list_alt39 = list(makeSymbol("TEMPLATE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    public static SubLObject determine_the_set_of_elements_generalized_query_properties(final SubLObject generalized_query, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(generalized_query, mt);
        query_properties = putf(query_properties, $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_, inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.getDynamicValue(thread));
        return query_properties;
    }

    static private final SubLString $str_alt40$Ask_SENTENCE_in_MT___Return_resul = makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\n   Deprecated in favor of query-template.");

    static private final SubLList $list_alt42 = list(makeSymbol("VARIABLE-TOKEN"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    /**
     * Like @xref new-cyc-query, except it iteratively extends the max-transformation-depth,
     * and stops deepening as soon as it gets at least one answer or exceeds the provided max-transformation-depth.
     * Also see the :occams-razor strategic heuristic for a way of handling this in the Tactician
     * rather than the Strategist.
     */
    @LispMethod(comment = "Like @xref new-cyc-query, except it iteratively extends the max-transformation-depth,\r\nand stops deepening as soon as it gets at least one answer or exceeds the provided max-transformation-depth.\r\nAlso see the :occams-razor strategic heuristic for a way of handling this in the Tactician\r\nrather than the Strategist.\nLike @xref new-cyc-query, except it iteratively extends the max-transformation-depth,\nand stops deepening as soon as it gets at least one answer or exceeds the provided max-transformation-depth.\nAlso see the :occams-razor strategic heuristic for a way of handling this in the Tactician\nrather than the Strategist.")
    public static final SubLObject cyc_query_with_minimal_required_transformation_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_query_properties = copy_list(query_properties);
                SubLObject max_max_transformation_depth = getf(query_properties, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED);
                SubLObject results = NIL;
                SubLObject halt_reason = NIL;
                if (!max_max_transformation_depth.isInteger()) {
                    max_max_transformation_depth = $most_positive_fixnum$.getGlobalValue();
                }
                new_query_properties = putf(new_query_properties, $CONTINUABLE_, T);
                new_query_properties = putf(new_query_properties, $MAX_TRANSFORMATION_DEPTH, MINUS_ONE_INTEGER);
                {
                    SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(new_query_properties);
                    SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(new_query_properties);
                    SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, query_static_properties);
                    SubLObject doneP = NIL;
                    while (NIL == doneP) {
                        {
                            SubLObject max_transformation_depth = getf(query_dynamic_properties, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED);
                            max_transformation_depth = add(max_transformation_depth, ONE_INTEGER);
                            if (max_transformation_depth.numG(max_max_transformation_depth)) {
                                halt_reason = $EXHAUST;
                                doneP = T;
                            } else {
                                query_dynamic_properties = putf(query_dynamic_properties, $MAX_TRANSFORMATION_DEPTH, max_transformation_depth);
                                thread.resetMultipleValues();
                                {
                                    SubLObject results_5 = inference_kernel.continue_inference(inference, query_dynamic_properties);
                                    SubLObject halt_reason_6 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    results = results_5;
                                    halt_reason = halt_reason_6;
                                }
                                if (NIL != results) {
                                    doneP = T;
                                }
                            }
                        }
                    } 
                    return values(results, halt_reason, inference);
                }
            }
        }
    }

    /**
     * Like @xref new-cyc-query, except it iteratively extends the max-transformation-depth,
     * and stops deepening as soon as it gets at least one answer or exceeds the provided max-transformation-depth.
     * Also see the :occams-razor strategic heuristic for a way of handling this in the Tactician
     * rather than the Strategist.
     */
    @LispMethod(comment = "Like @xref new-cyc-query, except it iteratively extends the max-transformation-depth,\r\nand stops deepening as soon as it gets at least one answer or exceeds the provided max-transformation-depth.\r\nAlso see the :occams-razor strategic heuristic for a way of handling this in the Tactician\r\nrather than the Strategist.\nLike @xref new-cyc-query, except it iteratively extends the max-transformation-depth,\nand stops deepening as soon as it gets at least one answer or exceeds the provided max-transformation-depth.\nAlso see the :occams-razor strategic heuristic for a way of handling this in the Tactician\nrather than the Strategist.")
    public static SubLObject cyc_query_with_minimal_required_transformation(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_query_properties = copy_list(query_properties);
        SubLObject max_max_transformation_depth = getf(query_properties, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED);
        SubLObject results = NIL;
        SubLObject halt_reason = NIL;
        if (!max_max_transformation_depth.isInteger()) {
            max_max_transformation_depth = $most_positive_fixnum$.getGlobalValue();
        }
        new_query_properties = putf(new_query_properties, $CONTINUABLE_, T);
        new_query_properties = putf(new_query_properties, $MAX_TRANSFORMATION_DEPTH, MINUS_ONE_INTEGER);
        final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(new_query_properties);
        SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(new_query_properties);
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, query_static_properties);
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            SubLObject max_transformation_depth = getf(query_dynamic_properties, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED);
            max_transformation_depth = add(max_transformation_depth, ONE_INTEGER);
            if (max_transformation_depth.numG(max_max_transformation_depth)) {
                halt_reason = $EXHAUST;
                doneP = T;
            } else {
                query_dynamic_properties = putf(query_dynamic_properties, $MAX_TRANSFORMATION_DEPTH, max_transformation_depth);
                thread.resetMultipleValues();
                final SubLObject results_$9 = inference_kernel.continue_inference(inference, query_dynamic_properties);
                final SubLObject halt_reason_$10 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                results = results_$9;
                halt_reason = halt_reason_$10;
                if (NIL == results) {
                    continue;
                }
                doneP = T;
            }
        } 
        return values(results, halt_reason, inference);
    }

    static private final SubLString $str_alt43$Ask_SENTENCE_in_MT_treating_VARIA = makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.");

    static private final SubLList $list_alt45 = list(makeSymbol("QUERY-VARIABLE"));

    static private final SubLList $list_alt46 = list(makeSymbol("VARIABLE-TOKEN"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLString $str_alt47$Ask_SENTENCE_in_MT_treating_VARIA = makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.\n   Deprecated in favor of query-variable.");

    static private final SubLString $str_alt49$Ask_SENTENCE_in_MT_under_the_reso = makeString("Ask SENTENCE in MT under the resource constraints query-properties\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.");

    static private final SubLList $list_alt50 = list(makeSymbol("NON-NEGATIVE-INTEGER-P"));

    static private final SubLList $list_alt52 = list(makeSymbol("QUERY-TEMPLATE-EVAL"));

    static private final SubLString $str_alt53$Ask_SENTENCE_in_MT_under_the_reso = makeString("Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.\n Deprecated in favor of query-template-eval.");

    static private final SubLString $str_alt58$max_recursive_query_depth_of__s_e = makeString("max recursive query depth of ~s exceeded with query ~s in mt ~s");

    static private final SubLString $str_alt59$Either_deeper_thought_is_required = makeString("Either deeper thought is required to answer this query, or it is a paradox.");

    public static final SubLObject declare_ask_utilities_file_alt() {
        declareFunction("query_properties_from_legacy_ask_parameters", "QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
        declareFunction("productivity_limit_from_removal_cost_cutoff", "PRODUCTIVITY-LIMIT-FROM-REMOVAL-COST-CUTOFF", 1, 0, false);
        declareFunction("query_static_properties_from_legacy_ask_parameters", "QUERY-STATIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 0, false);
        declareFunction("query_dynamic_properties_from_legacy_ask_parameters", "QUERY-DYNAMIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 5, false);
        declareFunction("query_justified", "QUERY-JUSTIFIED", 1, 2, false);
        declareFunction("ask_justified", "ASK-JUSTIFIED", 1, 5, false);
        declareFunction("query_template", "QUERY-TEMPLATE", 2, 2, false);
        declareFunction("ask_template", "ASK-TEMPLATE", 2, 5, false);
        declareFunction("query_variable", "QUERY-VARIABLE", 2, 2, false);
        declareFunction("ask_variable", "ASK-VARIABLE", 2, 5, false);
        declareFunction("query_template_eval", "QUERY-TEMPLATE-EVAL", 2, 2, false);
        declareFunction("ask_template_eval", "ASK-TEMPLATE-EVAL", 2, 5, false);
        declareFunction("query_boolean", "QUERY-BOOLEAN", 1, 2, false);
        declareFunction("recursive_ask_query_properties_from_legacy_ask_parameters", "RECURSIVE-ASK-QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
        declareFunction("within_recursive_queryP", "WITHIN-RECURSIVE-QUERY?", 0, 0, false);
        declareFunction("recursive_query", "RECURSIVE-QUERY", 1, 2, false);
        declareFunction("query_property_inherited_by_recursive_queryP", "QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?", 1, 0, false);
        declareFunction("filter_query_properties_for_recursive_query", "FILTER-QUERY-PROPERTIES-FOR-RECURSIVE-QUERY", 1, 0, false);
        declareFunction("recursive_query_problem_store_to_reuse", "RECURSIVE-QUERY-PROBLEM-STORE-TO-REUSE", 1, 0, false);
        declareFunction("kappa_tuples", "KAPPA-TUPLES", 3, 1, false);
        declareFunction("kappa_tuples_justified", "KAPPA-TUPLES-JUSTIFIED", 3, 1, false);
        declareFunction("inference_recursive_ask", "INFERENCE-RECURSIVE-ASK", 1, 5, false);
        declareFunction("inference_recursive_query", "INFERENCE-RECURSIVE-QUERY", 1, 2, false);
        declareFunction("inference_recursive_query_unique_bindings", "INFERENCE-RECURSIVE-QUERY-UNIQUE-BINDINGS", 1, 2, false);
        declareFunction("inference_recursive_ask_unique_bindings", "INFERENCE-RECURSIVE-ASK-UNIQUE-BINDINGS", 1, 5, false);
        declareFunction("inference_recursive_query_convert_to_hl_bindings", "INFERENCE-RECURSIVE-QUERY-CONVERT-TO-HL-BINDINGS", 2, 0, false);
        declareFunction("inference_literal_truth", "INFERENCE-LITERAL-TRUTH", 2, 0, false);
        declareFunction("inference_literal_ask", "INFERENCE-LITERAL-ASK", 2, 0, false);
        declareFunction("the_set_of_elements", "THE-SET-OF-ELEMENTS", 1, 2, false);
        declareFunction("the_set_of_problem_solvable_via_generalized_queryP", "THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?", 0, 2, false);
        declareFunction("the_set_of_elements_via_generalized_query", "THE-SET-OF-ELEMENTS-VIA-GENERALIZED-QUERY", 0, 2, false);
        declareFunction("compute_the_set_of_elements_generalized_query", "COMPUTE-THE-SET-OF-ELEMENTS-GENERALIZED-QUERY", 0, 1, false);
        declareFunction("find_unrestricted_problem_of_the_set_of_expression_problem", "FIND-UNRESTRICTED-PROBLEM-OF-THE-SET-OF-EXPRESSION-PROBLEM", 1, 0, false);
        declareFunction("find_jo_link_and_focal_problem_of_supported_problem", "FIND-JO-LINK-AND-FOCAL-PROBLEM-OF-SUPPORTED-PROBLEM", 1, 0, false);
        declareFunction("the_set_of_elements_generalized_query_memoized_internal", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("the_set_of_elements_generalized_query_memoized", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED", 2, 0, false);
        declareFunction("cyc_query_with_minimal_required_transformation", "CYC-QUERY-WITH-MINIMAL-REQUIRED-TRANSFORMATION", 1, 2, false);
        return NIL;
    }

    public static SubLObject declare_ask_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("query_properties_from_legacy_ask_parameters", "QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
            declareFunction("productivity_limit_from_removal_cost_cutoff", "PRODUCTIVITY-LIMIT-FROM-REMOVAL-COST-CUTOFF", 1, 0, false);
            declareFunction("query_static_properties_from_legacy_ask_parameters", "QUERY-STATIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 0, false);
            declareFunction("query_dynamic_properties_from_legacy_ask_parameters", "QUERY-DYNAMIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 5, false);
            declareFunction("query_justified", "QUERY-JUSTIFIED", 1, 2, false);
            declareFunction("ask_justified", "ASK-JUSTIFIED", 1, 5, false);
            declareFunction("query_template", "QUERY-TEMPLATE", 2, 2, false);
            declareFunction("ask_template", "ASK-TEMPLATE", 2, 5, false);
            declareFunction("query_variable", "QUERY-VARIABLE", 2, 2, false);
            declareFunction("ask_variable", "ASK-VARIABLE", 2, 5, false);
            declareFunction("query_template_eval", "QUERY-TEMPLATE-EVAL", 2, 2, false);
            declareFunction("ask_template_eval", "ASK-TEMPLATE-EVAL", 2, 5, false);
            declareFunction("query_boolean", "QUERY-BOOLEAN", 1, 2, false);
            declareFunction("recursive_ask_query_properties_from_legacy_ask_parameters", "RECURSIVE-ASK-QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
            declareFunction("within_recursive_queryP", "WITHIN-RECURSIVE-QUERY?", 0, 0, false);
            declareFunction("recursive_query", "RECURSIVE-QUERY", 1, 2, false);
            declareFunction("query_property_inherited_by_recursive_queryP", "QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?", 1, 0, false);
            declareFunction("filter_query_properties_for_recursive_query", "FILTER-QUERY-PROPERTIES-FOR-RECURSIVE-QUERY", 1, 0, false);
            declareFunction("recursive_query_problem_store_to_reuse", "RECURSIVE-QUERY-PROBLEM-STORE-TO-REUSE", 1, 0, false);
            declareFunction("kappa_tuples", "KAPPA-TUPLES", 3, 1, false);
            declareFunction("kappa_tuples_justified", "KAPPA-TUPLES-JUSTIFIED", 3, 1, false);
            declareFunction("inference_recursive_ask", "INFERENCE-RECURSIVE-ASK", 1, 5, false);
            declareFunction("inference_recursive_query", "INFERENCE-RECURSIVE-QUERY", 1, 2, false);
            declareFunction("inference_recursive_query_unique_bindings", "INFERENCE-RECURSIVE-QUERY-UNIQUE-BINDINGS", 1, 2, false);
            declareFunction("inference_recursive_ask_unique_bindings", "INFERENCE-RECURSIVE-ASK-UNIQUE-BINDINGS", 1, 5, false);
            declareFunction("inference_recursive_query_convert_to_hl_bindings", "INFERENCE-RECURSIVE-QUERY-CONVERT-TO-HL-BINDINGS", 2, 0, false);
            declareFunction("inference_literal_truth", "INFERENCE-LITERAL-TRUTH", 2, 0, false);
            declareFunction("inference_literal_ask", "INFERENCE-LITERAL-ASK", 2, 0, false);
            declareFunction("the_set_of_elements", "THE-SET-OF-ELEMENTS", 1, 2, false);
            declareFunction("the_set_of_problem_solvable_via_generalized_queryP", "THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?", 0, 3, false);
            declareFunction("pred_not_allowed_in_generalized_query_for_the_set_ofP", "PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF?", 1, 0, false);
            declareFunction("the_set_of_elements_via_generalized_query", "THE-SET-OF-ELEMENTS-VIA-GENERALIZED-QUERY", 0, 2, false);
            declareFunction("compute_the_set_of_elements_generalized_query", "COMPUTE-THE-SET-OF-ELEMENTS-GENERALIZED-QUERY", 0, 1, false);
            declareFunction("find_unrestricted_problem_of_the_set_of_expression_problem", "FIND-UNRESTRICTED-PROBLEM-OF-THE-SET-OF-EXPRESSION-PROBLEM", 1, 0, false);
            declareFunction("find_jo_link_and_focal_problem_of_supported_problem", "FIND-JO-LINK-AND-FOCAL-PROBLEM-OF-SUPPORTED-PROBLEM", 1, 0, false);
            declareFunction("the_set_of_elements_generalized_query_memoized_internal", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED-INTERNAL", 2, 0, false);
            declareFunction("the_set_of_elements_generalized_query_memoized", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED", 2, 0, false);
            declareFunction("determine_the_set_of_elements_generalized_query_properties", "DETERMINE-THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-PROPERTIES", 2, 0, false);
            declareFunction("cyc_query_with_minimal_required_transformation", "CYC-QUERY-WITH-MINIMAL-REQUIRED-TRANSFORMATION", 1, 2, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("the_set_of_problem_solvable_via_generalized_queryP", "THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?", 0, 2, false);
        }
        return NIL;
    }

    public static SubLObject declare_ask_utilities_file_Previous() {
        declareFunction("query_properties_from_legacy_ask_parameters", "QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
        declareFunction("productivity_limit_from_removal_cost_cutoff", "PRODUCTIVITY-LIMIT-FROM-REMOVAL-COST-CUTOFF", 1, 0, false);
        declareFunction("query_static_properties_from_legacy_ask_parameters", "QUERY-STATIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 0, false);
        declareFunction("query_dynamic_properties_from_legacy_ask_parameters", "QUERY-DYNAMIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 5, false);
        declareFunction("query_justified", "QUERY-JUSTIFIED", 1, 2, false);
        declareFunction("ask_justified", "ASK-JUSTIFIED", 1, 5, false);
        declareFunction("query_template", "QUERY-TEMPLATE", 2, 2, false);
        declareFunction("ask_template", "ASK-TEMPLATE", 2, 5, false);
        declareFunction("query_variable", "QUERY-VARIABLE", 2, 2, false);
        declareFunction("ask_variable", "ASK-VARIABLE", 2, 5, false);
        declareFunction("query_template_eval", "QUERY-TEMPLATE-EVAL", 2, 2, false);
        declareFunction("ask_template_eval", "ASK-TEMPLATE-EVAL", 2, 5, false);
        declareFunction("query_boolean", "QUERY-BOOLEAN", 1, 2, false);
        declareFunction("recursive_ask_query_properties_from_legacy_ask_parameters", "RECURSIVE-ASK-QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
        declareFunction("within_recursive_queryP", "WITHIN-RECURSIVE-QUERY?", 0, 0, false);
        declareFunction("recursive_query", "RECURSIVE-QUERY", 1, 2, false);
        declareFunction("query_property_inherited_by_recursive_queryP", "QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?", 1, 0, false);
        declareFunction("filter_query_properties_for_recursive_query", "FILTER-QUERY-PROPERTIES-FOR-RECURSIVE-QUERY", 1, 0, false);
        declareFunction("recursive_query_problem_store_to_reuse", "RECURSIVE-QUERY-PROBLEM-STORE-TO-REUSE", 1, 0, false);
        declareFunction("kappa_tuples", "KAPPA-TUPLES", 3, 1, false);
        declareFunction("kappa_tuples_justified", "KAPPA-TUPLES-JUSTIFIED", 3, 1, false);
        declareFunction("inference_recursive_ask", "INFERENCE-RECURSIVE-ASK", 1, 5, false);
        declareFunction("inference_recursive_query", "INFERENCE-RECURSIVE-QUERY", 1, 2, false);
        declareFunction("inference_recursive_query_unique_bindings", "INFERENCE-RECURSIVE-QUERY-UNIQUE-BINDINGS", 1, 2, false);
        declareFunction("inference_recursive_ask_unique_bindings", "INFERENCE-RECURSIVE-ASK-UNIQUE-BINDINGS", 1, 5, false);
        declareFunction("inference_recursive_query_convert_to_hl_bindings", "INFERENCE-RECURSIVE-QUERY-CONVERT-TO-HL-BINDINGS", 2, 0, false);
        declareFunction("inference_literal_truth", "INFERENCE-LITERAL-TRUTH", 2, 0, false);
        declareFunction("inference_literal_ask", "INFERENCE-LITERAL-ASK", 2, 0, false);
        declareFunction("the_set_of_elements", "THE-SET-OF-ELEMENTS", 1, 2, false);
        declareFunction("the_set_of_problem_solvable_via_generalized_queryP", "THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?", 0, 3, false);
        declareFunction("pred_not_allowed_in_generalized_query_for_the_set_ofP", "PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF?", 1, 0, false);
        declareFunction("the_set_of_elements_via_generalized_query", "THE-SET-OF-ELEMENTS-VIA-GENERALIZED-QUERY", 0, 2, false);
        declareFunction("compute_the_set_of_elements_generalized_query", "COMPUTE-THE-SET-OF-ELEMENTS-GENERALIZED-QUERY", 0, 1, false);
        declareFunction("find_unrestricted_problem_of_the_set_of_expression_problem", "FIND-UNRESTRICTED-PROBLEM-OF-THE-SET-OF-EXPRESSION-PROBLEM", 1, 0, false);
        declareFunction("find_jo_link_and_focal_problem_of_supported_problem", "FIND-JO-LINK-AND-FOCAL-PROBLEM-OF-SUPPORTED-PROBLEM", 1, 0, false);
        declareFunction("the_set_of_elements_generalized_query_memoized_internal", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("the_set_of_elements_generalized_query_memoized", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED", 2, 0, false);
        declareFunction("determine_the_set_of_elements_generalized_query_properties", "DETERMINE-THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("cyc_query_with_minimal_required_transformation", "CYC-QUERY-WITH-MINIMAL-REQUIRED-TRANSFORMATION", 1, 2, false);
        return NIL;
    }

    static private final SubLSymbol $sym61$QUERY_PROPERTY_INHERITED_BY_RECURSIVE_QUERY_ = makeSymbol("QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?");

    public static final SubLSymbol $kw62$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    static private final SubLList $list_alt63 = list(makeKeyword("SUPPORTS"));

    static private final SubLList $list_alt67 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLList $list_alt68 = list(makeSymbol("VARIABLE"), makeSymbol("QUERY"));

    public static final SubLSymbol $kw73$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject init_ask_utilities_file_alt() {
        defvar("*RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?*", T);
        deflexical("*MAX-RECURSIVE-QUERY-DEPTH*", $int$27);
        defparameter("*RECURSIVE-QUERY-DEPTH*", NIL);
        return NIL;
    }

    public static SubLObject init_ask_utilities_file() {
        if (SubLFiles.USE_V1) {
            defvar("*RECURSIVE-QUERIES-BROWSABLE?*", $ONLY_FOR_EXISTING_STORES);
            deflexical("*MAX-RECURSIVE-QUERY-DEPTH*", $int$27);
            defparameter("*RECURSIVE-QUERY-DEPTH*", NIL);
            defparameter("*ALLOW-THE-SET-OF-VIA-GENERALIZED-QUERY?*", T);
            defparameter("*BE-CAREFUL-WHEN-SOLVING-THE-SET-OF-VIA-GENERALIZED-QUERY?*", T);
            defparameter("*DEBUG-THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defvar("*RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?*", T);
        }
        return NIL;
    }

    public static SubLObject init_ask_utilities_file_Previous() {
        defvar("*RECURSIVE-QUERIES-BROWSABLE?*", $ONLY_FOR_EXISTING_STORES);
        deflexical("*MAX-RECURSIVE-QUERY-DEPTH*", $int$27);
        defparameter("*RECURSIVE-QUERY-DEPTH*", NIL);
        defparameter("*ALLOW-THE-SET-OF-VIA-GENERALIZED-QUERY?*", T);
        defparameter("*BE-CAREFUL-WHEN-SOLVING-THE-SET-OF-VIA-GENERALIZED-QUERY?*", T);
        defparameter("*DEBUG-THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?*", NIL);
        return NIL;
    }

    public static SubLObject setup_ask_utilities_file() {
        register_cyc_api_function(QUERY_JUSTIFIED, $list27, $str28$Ask_for_bindings_for_free_variabl, NIL, $list29);
        register_obsolete_cyc_api_function(ASK_JUSTIFIED, $list31, $list32, $str33$Ask_for_bindings_for_free_variabl, NIL, $list29);
        register_cyc_api_function(QUERY_TEMPLATE, $list35, $str36$Ask_SENTENCE_in_MT___Return_resul, NIL, $list29);
        register_obsolete_cyc_api_function(ASK_TEMPLATE, $list38, $list39, $str40$Ask_SENTENCE_in_MT___Return_resul, NIL, $list29);
        register_cyc_api_function(QUERY_VARIABLE, $list42, $str43$Ask_SENTENCE_in_MT_treating_VARIA, NIL, $list29);
        register_obsolete_cyc_api_function(ASK_VARIABLE, $list45, $list46, $str47$Ask_SENTENCE_in_MT_treating_VARIA, NIL, $list29);
        register_cyc_api_function(QUERY_TEMPLATE_EVAL, $list35, $str49$Ask_SENTENCE_in_MT_under_the_reso, NIL, $list50);
        register_obsolete_cyc_api_function(ASK_TEMPLATE_EVAL, $list52, $list39, $str53$Ask_SENTENCE_in_MT_under_the_reso, NIL, $list50);
        memoization_state.note_memoized_function(THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ask_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_ask_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ask_utilities_file();
    }

    
}

/**
 * Total time: 261 ms
 */
