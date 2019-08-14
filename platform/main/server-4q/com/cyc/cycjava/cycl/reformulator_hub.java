/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.evaluatable_el_expressionP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REFORMULATOR-HUB
 * source file: /cyc/top/cycl/reformulator-hub.lisp
 * created:     2019/07/03 17:37:33
 */
public final class reformulator_hub extends SubLTranslatedFile implements V12 {
    public static final SubLObject update_original_clause_recursively_p(SubLObject update_original_clause_recursively) {
        return classes.subloop_instanceof_class(update_original_clause_recursively, UPDATE_ORIGINAL_CLAUSE_RECURSIVELY);
    }

    public static final SubLObject substitute_rl_expression_p(SubLObject substitute_rl_expression) {
        return classes.subloop_instanceof_class(substitute_rl_expression, SUBSTITUTE_RL_EXPRESSION);
    }

    public static final SubLObject subloop_reserved_initialize_update_original_clause_recursively_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_update_original_clause_recursively_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_substitute_rl_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, SUBSTITUTE_RL_EXPRESSION, NEW_EXPR, NIL);
        classes.subloop_initialize_slot(new_instance, SUBSTITUTE_RL_EXPRESSION, OLD_SUBFORMULA, NIL);
        classes.subloop_initialize_slot(new_instance, SUBSTITUTE_RL_EXPRESSION, FORMULA, NIL);
        classes.subloop_initialize_slot(new_instance, SUBSTITUTE_RL_EXPRESSION, OUT_FORMULA, NIL);
        classes.subloop_initialize_slot(new_instance, SUBSTITUTE_RL_EXPRESSION, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_substitute_rl_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_gingerly_reformulate_in_modals_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, GINGERLY_REFORMULATE_IN_MODALS, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, GINGERLY_REFORMULATE_IN_MODALS, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, GINGERLY_REFORMULATE_IN_MODALS, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_gingerly_reformulate_in_modals_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_update_original_clause_recursively_out_cycl(SubLObject update_original_clause_recursively, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(update_original_clause_recursively, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_update_original_clause_recursively_mt(SubLObject update_original_clause_recursively, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(update_original_clause_recursively, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_update_original_clause_recursively_in_cycl(SubLObject update_original_clause_recursively, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(update_original_clause_recursively, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_substitute_rl_expression_out_formula(SubLObject substitute_rl_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(substitute_rl_expression, value, SIX_INTEGER, OUT_FORMULA);
    }

    public static final SubLObject set_substitute_rl_expression_old_subformula(SubLObject substitute_rl_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(substitute_rl_expression, value, FOUR_INTEGER, OLD_SUBFORMULA);
    }

    public static final SubLObject set_substitute_rl_expression_new_expr(SubLObject substitute_rl_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(substitute_rl_expression, value, THREE_INTEGER, NEW_EXPR);
    }

    public static final SubLObject set_substitute_rl_expression_mt(SubLObject substitute_rl_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(substitute_rl_expression, value, SEVEN_INTEGER, MT);
    }

    public static final SubLObject set_substitute_rl_expression_formula(SubLObject substitute_rl_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(substitute_rl_expression, value, FIVE_INTEGER, FORMULA);
    }

    public static final SubLObject set_gingerly_reformulate_in_modals_out_cycl(SubLObject gingerly_reformulate_in_modals, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(gingerly_reformulate_in_modals, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_gingerly_reformulate_in_modals_mt(SubLObject gingerly_reformulate_in_modals, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(gingerly_reformulate_in_modals, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_gingerly_reformulate_in_modals_in_cycl(SubLObject gingerly_reformulate_in_modals, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(gingerly_reformulate_in_modals, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject gingerly_reformulate_in_modals_p(SubLObject gingerly_reformulate_in_modals) {
        return classes.subloop_instanceof_class(gingerly_reformulate_in_modals, GINGERLY_REFORMULATE_IN_MODALS);
    }

    public static final SubLObject get_update_original_clause_recursively_out_cycl(SubLObject update_original_clause_recursively) {
        return classes.subloop_get_access_protected_instance_slot(update_original_clause_recursively, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_update_original_clause_recursively_mt(SubLObject update_original_clause_recursively) {
        return classes.subloop_get_access_protected_instance_slot(update_original_clause_recursively, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_update_original_clause_recursively_in_cycl(SubLObject update_original_clause_recursively) {
        return classes.subloop_get_access_protected_instance_slot(update_original_clause_recursively, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_substitute_rl_expression_out_formula(SubLObject substitute_rl_expression) {
        return classes.subloop_get_access_protected_instance_slot(substitute_rl_expression, SIX_INTEGER, OUT_FORMULA);
    }

    public static final SubLObject get_substitute_rl_expression_old_subformula(SubLObject substitute_rl_expression) {
        return classes.subloop_get_access_protected_instance_slot(substitute_rl_expression, FOUR_INTEGER, OLD_SUBFORMULA);
    }

    public static final SubLObject get_substitute_rl_expression_new_expr(SubLObject substitute_rl_expression) {
        return classes.subloop_get_access_protected_instance_slot(substitute_rl_expression, THREE_INTEGER, NEW_EXPR);
    }

    public static final SubLObject get_substitute_rl_expression_mt(SubLObject substitute_rl_expression) {
        return classes.subloop_get_access_protected_instance_slot(substitute_rl_expression, SEVEN_INTEGER, MT);
    }

    public static final SubLObject get_substitute_rl_expression_formula(SubLObject substitute_rl_expression) {
        return classes.subloop_get_access_protected_instance_slot(substitute_rl_expression, FIVE_INTEGER, FORMULA);
    }

    public static final SubLObject get_gingerly_reformulate_in_modals_out_cycl(SubLObject gingerly_reformulate_in_modals) {
        return classes.subloop_get_access_protected_instance_slot(gingerly_reformulate_in_modals, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_gingerly_reformulate_in_modals_mt(SubLObject gingerly_reformulate_in_modals) {
        return classes.subloop_get_access_protected_instance_slot(gingerly_reformulate_in_modals, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_gingerly_reformulate_in_modals_in_cycl(SubLObject gingerly_reformulate_in_modals) {
        return classes.subloop_get_access_protected_instance_slot(gingerly_reformulate_in_modals, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLFile me = new reformulator_hub();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_hub";


    // defparameter
    /**
     * when non-nil contains the absolute time beyond which the reformulator should
     * return whatever results it has so far - derived dynamically from the
     * :max-time property
     */
    @LispMethod(comment = "when non-nil contains the absolute time beyond which the reformulator should\r\nreturn whatever results it has so far - derived dynamically from the\r\n:max-time property\ndefparameter\nwhen non-nil contains the absolute time beyond which the reformulator should\nreturn whatever results it has so far - derived dynamically from the\n:max-time property")
    private static final SubLSymbol $reformulator_timeout_time$ = makeSymbol("*REFORMULATOR-TIMEOUT-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rl_mt$ = makeSymbol("*RL-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rl_old$ = makeSymbol("*RL-OLD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rl_new$ = makeSymbol("*RL-NEW*");

    // defparameter
    /**
     * A number from 0 to 5 indicating how much tracing of the reformulator should
     * be done. 0 is least, 5 is most.
     */
    @LispMethod(comment = "A number from 0 to 5 indicating how much tracing of the reformulator should\r\nbe done. 0 is least, 5 is most.\ndefparameter\nA number from 0 to 5 indicating how much tracing of the reformulator should\nbe done. 0 is least, 5 is most.")
    private static final SubLSymbol $ref_trace_level$ = makeSymbol("*REF-TRACE-LEVEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ignore_modules_unless_focussed$ = makeSymbol("*IGNORE-MODULES-UNLESS-FOCUSSED*");

    static private final SubLString $str1$The_expression__s_contains_an_HL_ = makeString("The expression ~s contains an HL variable, and the CycL reformulator cannot handle it.");

    static private final SubLString $str2$reformulate_cycl_cannot_be_called = makeString("reformulate-cycl cannot be called when the Cyc KB does not contain the knowledge necessary for reformulation.");

    private static final SubLSymbol $UNLESS_REWRITE_OF = makeKeyword("UNLESS-REWRITE-OF");

    private static final SubLSymbol ALL_KB_MODAL_OPERATORS = makeSymbol("ALL-KB-MODAL-OPERATORS");





    private static final SubLSymbol $all_kb_modal_operators_caching_state$ = makeSymbol("*ALL-KB-MODAL-OPERATORS-CACHING-STATE*");

    private static final SubLString $str13$The_reformulator_currently_cannot = makeString("The reformulator currently cannot handle the n-conjuncts problem.");

    private static final SubLSymbol $sym15$CONTAINS_OLD_RL_ = makeSymbol("CONTAINS-OLD-RL?");

    private static final SubLSymbol SUBST_NEW_RL = makeSymbol("SUBST-NEW-RL");

    private static final SubLSymbol REFORMULATE_EXPRESSION = makeSymbol("REFORMULATE-EXPRESSION");

    private static final SubLSymbol $APPLY_FIRST_RECURSIVELY = makeKeyword("APPLY-FIRST-RECURSIVELY");

    private static final SubLList $list22 = list(reader_make_constant_shell("WffViolationResolutionRLModule"));

    private static final SubLSymbol $sym23$_ = makeSymbol("<");

    private static final SubLSymbol CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED = makeSymbol("CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED");





    private static final SubLSymbol UNCANONICALIZE_RL_EXPRESSION_CACHED = makeSymbol("UNCANONICALIZE-RL-EXPRESSION-CACHED");

    private static final SubLSymbol $sym34$RL_EVALUATABLE_EXPRESSION_ = makeSymbol("RL-EVALUATABLE-EXPRESSION?");

    private static final SubLSymbol TRANSFORM_EVALUATION_EXPRESSION = makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");



    private static final SubLSymbol $sym37$RL_UNEVALUATABLE_EXPRESSION_ = makeSymbol("RL-UNEVALUATABLE-EXPRESSION?");

    private static final SubLString $str38$All___s__Arity___s__KB___s__None_ = makeString("All: ~s  Arity: ~s  KB: ~s  None: ~s~%");

    private static final SubLString $str39$Average_number_of_FORTs_mentioned = makeString("Average number of FORTs mentioned in reformulator rules: ~s");

    private static final SubLString $str40$RL_EL_mismatch_substitution = makeString("RL-EL mismatch substitution");

    private static final SubLString $str41$Restrict_reformulation_inside_mod = makeString("Restrict reformulation inside modals");

    private static final SubLString $$$Uniquify_variables = makeString("Uniquify variables");

    private static final SubLString $str43$reformulator_hub_test_suite = makeString("reformulator-hub-test-suite");

    // Definitions
    /**
     * Reformulates EXPRESSION into another form.
     *
     * @param EXPRESSION;
     * 		an EL expression
     * @param SETTINGS;
     * 		described above
     * @return 0 EL expression; The possibly reformulated version of EXPRESSION.
     * @return 1 listp or keywordp; If EXPRESSION was ill-formed, the keyword :ill-formed.
    Otherwise, a list of (old-expr new-expr justification) triples that reflect the history of
    reformulations performed on EXPRESSION.  Each justification is a list, the first element
    of which is the RL module which performed the reformulation, and the remaining elements
    are the supports (either assertions or RL supports, as defined by the RL modules.)
     * @return 2 has value :MAX-TIME if the :MAX-TIME property was non-nil and the
    reformulator exceeded the specified seconds duration, otherwise a value of NIL.
     */
    @LispMethod(comment = "Reformulates EXPRESSION into another form.\r\n\r\n@param EXPRESSION;\r\n\t\tan EL expression\r\n@param SETTINGS;\r\n\t\tdescribed above\r\n@return 0 EL expression; The possibly reformulated version of EXPRESSION.\r\n@return 1 listp or keywordp; If EXPRESSION was ill-formed, the keyword :ill-formed.\r\nOtherwise, a list of (old-expr new-expr justification) triples that reflect the history of\r\nreformulations performed on EXPRESSION.  Each justification is a list, the first element\r\nof which is the RL module which performed the reformulation, and the remaining elements\r\nare the supports (either assertions or RL supports, as defined by the RL modules.)\r\n@return 2 has value :MAX-TIME if the :MAX-TIME property was non-nil and the\r\nreformulator exceeded the specified seconds duration, otherwise a value of NIL.")
    public static final SubLObject reformulate_cycl_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (settings == UNPROVIDED) {
            settings = NIL;
        }
        if (NIL != cycl_utilities.expression_find_if(symbol_function(VARIABLE_P), expression, NIL, UNPROVIDED)) {
            com.cyc.cycjava.cycl.reformulator_hub.ref_warn(ONE_INTEGER, $str_alt1$The_expression__s_contains_an_HL_, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL == kb_control_vars.reformulator_kb_loaded_p()) {
            Errors.error($str_alt2$reformulate_cycl_cannot_be_called);
        }
        reformulator_datastructures.ensure_reformulator_initialized();
        {
            SubLObject fixed_settings = reformulator_datastructures.fix_invalid_settings(settings, mt);
            SubLObject clear_cachesP = reformulator_datastructures.get_clear_reformulator_cachesP(fixed_settings);
            if ($TRUE == clear_cachesP) {
                reformulator_datastructures.clear_reformulator_caches();
            }
            return com.cyc.cycjava.cycl.reformulator_hub.reformulate_cycl_int(expression, mt, fixed_settings);
        }
    }

    // Definitions
    /**
     * Reformulates EXPRESSION into another form.
     *
     * @param EXPRESSION;
     * 		an EL expression
     * @param SETTINGS;
     * 		described above
     * @return 0 EL expression; The possibly reformulated version of EXPRESSION.
     * @return 1 listp or keywordp; If EXPRESSION was ill-formed, the keyword :ill-formed.
    Otherwise, a list of (old-expr new-expr justification) triples that reflect the history of
    reformulations performed on EXPRESSION.  Each justification is a list, the first element
    of which is the RL module which performed the reformulation, and the remaining elements
    are the supports (either assertions or RL supports, as defined by the RL modules.)
     * @return 2 has value :MAX-TIME if the :MAX-TIME property was non-nil and the
    reformulator exceeded the specified seconds duration, otherwise a value of NIL.
     */
    @LispMethod(comment = "Reformulates EXPRESSION into another form.\r\n\r\n@param EXPRESSION;\r\n\t\tan EL expression\r\n@param SETTINGS;\r\n\t\tdescribed above\r\n@return 0 EL expression; The possibly reformulated version of EXPRESSION.\r\n@return 1 listp or keywordp; If EXPRESSION was ill-formed, the keyword :ill-formed.\r\nOtherwise, a list of (old-expr new-expr justification) triples that reflect the history of\r\nreformulations performed on EXPRESSION.  Each justification is a list, the first element\r\nof which is the RL module which performed the reformulation, and the remaining elements\r\nare the supports (either assertions or RL supports, as defined by the RL modules.)\r\n@return 2 has value :MAX-TIME if the :MAX-TIME property was non-nil and the\r\nreformulator exceeded the specified seconds duration, otherwise a value of NIL.")
    public static SubLObject reformulate_cycl(final SubLObject expression, SubLObject mt, SubLObject settings) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (settings == UNPROVIDED) {
            settings = NIL;
        }
        if (NIL != cycl_utilities.expression_find_if(symbol_function(VARIABLE_P), expression, NIL, UNPROVIDED)) {
            ref_warn(ONE_INTEGER, $str1$The_expression__s_contains_an_HL_, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL == kb_control_vars.reformulator_kb_loaded_p()) {
            Errors.error($str2$reformulate_cycl_cannot_be_called);
        }
        reformulator_datastructures.ensure_reformulator_initialized();
        final SubLObject fixed_settings = reformulator_datastructures.fix_invalid_settings(settings, mt);
        final SubLObject clear_cachesP = reformulator_datastructures.get_clear_reformulator_cachesP(fixed_settings);
        if ($TRUE == clear_cachesP) {
            reformulator_datastructures.clear_reformulator_caches();
        }
        return reformulate_cycl_int(expression, mt, fixed_settings);
    }

    public static final SubLObject reformulate_atoms_criterion_metP_alt(SubLObject expression, SubLObject settings) {
        if (NIL == el_formula_p(expression)) {
            {
                SubLObject reformulate_atomsP = reformulator_datastructures.get_reformulate_atomsP(settings);
                SubLObject pcase_var = reformulate_atomsP;
                if (pcase_var.eql($TRUE)) {
                    return T;
                } else {
                    if (pcase_var.eql($FALSE)) {
                        return NIL;
                    } else {
                        if (pcase_var.eql($UNLESS_REWRITE_OF)) {
                            return equality_store.some_source_rewrite_of_assertions_somewhereP(expression);
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject reformulate_atoms_criterion_metP(final SubLObject expression, final SubLObject settings) {
        if (NIL == el_formula_p(expression)) {
            final SubLObject pcase_var;
            final SubLObject reformulate_atomsP = pcase_var = reformulator_datastructures.get_reformulate_atomsP(settings);
            if (pcase_var.eql($TRUE)) {
                return T;
            }
            if (pcase_var.eql($FALSE)) {
                return NIL;
            }
            if (pcase_var.eql($UNLESS_REWRITE_OF)) {
                return equality_store.some_source_rewrite_of_assertions_somewhereP(expression);
            }
        }
        return T;
    }

    /**
     * Returns the the absolute time beyond which the reformulator should return
     * whatever results it has so far, or NIL if :MAX-TIME is not specified.
     */
    @LispMethod(comment = "Returns the the absolute time beyond which the reformulator should return\r\nwhatever results it has so far, or NIL if :MAX-TIME is not specified.\nReturns the the absolute time beyond which the reformulator should return\nwhatever results it has so far, or NIL if :MAX-TIME is not specified.")
    public static final SubLObject reformulator_timeout_time_alt(SubLObject settings) {
        {
            SubLObject delay_in_seconds = reformulator_datastructures.get_max_time(settings);
            return NIL != delay_in_seconds ? ((SubLObject) (add(get_internal_real_time(), floor(multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED)))) : NIL;
        }
    }

    /**
     * Returns the the absolute time beyond which the reformulator should return
     * whatever results it has so far, or NIL if :MAX-TIME is not specified.
     */
    @LispMethod(comment = "Returns the the absolute time beyond which the reformulator should return\r\nwhatever results it has so far, or NIL if :MAX-TIME is not specified.\nReturns the the absolute time beyond which the reformulator should return\nwhatever results it has so far, or NIL if :MAX-TIME is not specified.")
    public static SubLObject reformulator_timeout_time(final SubLObject settings) {
        final SubLObject delay_in_seconds = reformulator_datastructures.get_max_time(settings);
        return NIL != delay_in_seconds ? add(get_internal_real_time(), floor(multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED)) : NIL;
    }

    public static final SubLObject reformulate_cycl_int_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject return_values = NIL;
                SubLObject number_of_reformulations = ZERO_INTEGER;
                SubLObject previous_rl_expr = NIL;
                SubLObject new_expression = NIL;
                SubLObject reformulation_history = NIL;
                SubLObject original_clause = NIL;
                {
                    SubLObject _prev_bind_0 = $reformulator_timeout_time$.currentBinding(thread);
                    try {
                        $reformulator_timeout_time$.bind(com.cyc.cycjava.cycl.reformulator_hub.reformulator_timeout_time(settings), thread);
                        if (NIL != com.cyc.cycjava.cycl.reformulator_hub.reformulate_atoms_criterion_metP(expression, settings)) {
                            {
                                SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
                                SubLTrampolineFile.checkType(v_memoization_state, MEMOIZATION_STATE_P);
                                {
                                    SubLObject _prev_bind_0_1 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
                                    try {
                                        reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
                                        {
                                            SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
                                            {
                                                SubLObject _prev_bind_0_2 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                        Errors.error($str_alt7$Invalid_attempt_to_reuse_memoizat);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            {
                                                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(mt));
                                                                {
                                                                    SubLObject _prev_bind_0_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                    try {
                                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                                        {
                                                                            SubLObject recursion_limit = reformulator_datastructures.get_recursion_limit(settings);
                                                                            SubLObject reformulate_subformulasP = reformulator_datastructures.get_reformulate_subformulasP(settings);
                                                                            SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
                                                                            SubLObject doneP = NIL;
                                                                            SubLObject stack = NIL;
                                                                            SubLObject modal_operator_if_any = com.cyc.cycjava.cycl.reformulator_hub.possible_modal(expression);
                                                                            if (NIL != modal_operator_if_any) {
                                                                                {
                                                                                    SubLObject non_modal_expression = cycl_utilities.formula_arg1(expression, UNPROVIDED);
                                                                                    previous_rl_expr = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_cached(non_modal_expression, mt, NIL, wff_degree);
                                                                                }
                                                                            } else {
                                                                                previous_rl_expr = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_cached(expression, mt, NIL, wff_degree);
                                                                            }
                                                                            original_clause = previous_rl_expr;
                                                                            if (NIL != previous_rl_expr) {
                                                                                while ((NIL == doneP) && number_of_reformulations.numLE(recursion_limit)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject thrown_old_expr = com.cyc.cycjava.cycl.reformulator_hub.reformulate_expression(previous_rl_expr, previous_rl_expr, original_clause, mt, settings, eql($TRUE, reformulate_subformulasP));
                                                                                        SubLObject thrown_new_expr = thread.secondMultipleValue();
                                                                                        SubLObject thrown_justification = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL == thrown_justification) {
                                                                                            doneP = T;
                                                                                        } else {
                                                                                            new_expression = com.cyc.cycjava.cycl.reformulator_hub.reformulator_subst(thrown_new_expr, thrown_old_expr, previous_rl_expr, mt);
                                                                                            if (NIL != find(new_expression, stack, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                                doneP = T;
                                                                                            } else {
                                                                                                stack = cons(new_expression, stack);
                                                                                                reformulation_history = cons(com.cyc.cycjava.cycl.reformulator_hub.construct_reformulation_step(thrown_old_expr, thrown_new_expr, thrown_justification), reformulation_history);
                                                                                                number_of_reformulations = add(number_of_reformulations, ONE_INTEGER);
                                                                                                previous_rl_expr = new_expression;
                                                                                                original_clause = previous_rl_expr;
                                                                                                new_expression = NIL;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if ((NIL != $reformulator_timeout_time$.getDynamicValue(thread)) && get_internal_real_time().numG($reformulator_timeout_time$.getDynamicValue(thread))) {
                                                                                        doneP = T;
                                                                                    }
                                                                                } 
                                                                                previous_rl_expr = com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression_cached(previous_rl_expr, mt);
                                                                                if (NIL != modal_operator_if_any) {
                                                                                    previous_rl_expr = list(modal_operator_if_any, previous_rl_expr);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_3, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    reformulation_history = reverse(reformulation_history);
                                                                    if ($TRUE == reformulator_datastructures.get_eliminate_transitivity_in_reformulation_historyP(settings)) {
                                                                        reformulation_history = com.cyc.cycjava.cycl.reformulator_hub.eliminate_transitivity_in_reformulation_history(reformulation_history);
                                                                    }
                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject timed_out_return_value = ((NIL != $reformulator_timeout_time$.getDynamicValue(thread)) && get_internal_real_time().numG($reformulator_timeout_time$.getDynamicValue(thread))) ? ((SubLObject) ($MAX_TIME)) : NIL;
                            if (number_of_reformulations.isPositive()) {
                                return_values = list(previous_rl_expr, reformulation_history, timed_out_return_value);
                            } else {
                                if (NIL == previous_rl_expr) {
                                    return_values = list(expression, $ILL_FORMED, timed_out_return_value);
                                } else {
                                    return_values = list(previous_rl_expr, NIL, timed_out_return_value);
                                }
                            }
                        }
                    } finally {
                        $reformulator_timeout_time$.rebind(_prev_bind_0, thread);
                    }
                }
                return subl_promotions.values_list(return_values);
            }
        }
    }

    public static SubLObject reformulate_cycl_int(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject return_values = NIL;
        SubLObject number_of_reformulations = ZERO_INTEGER;
        SubLObject previous_rl_expr = NIL;
        SubLObject new_expression = NIL;
        SubLObject reformulation_history = NIL;
        SubLObject original_clause = NIL;
        final SubLObject _prev_bind_0 = $reformulator_timeout_time$.currentBinding(thread);
        try {
            $reformulator_timeout_time$.bind(reformulator_timeout_time(settings), thread);
            if (NIL != reformulate_atoms_criterion_metP(expression, settings)) {
                final SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
                assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "! memoization_state.memoization_state_p(v_memoization_state) " + ("memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) ") + v_memoization_state;
                final SubLObject _prev_bind_0_$1 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
                try {
                    reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
                    final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$2 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(mt));
                            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject recursion_limit = reformulator_datastructures.get_recursion_limit(settings);
                                final SubLObject reformulate_subformulasP = reformulator_datastructures.get_reformulate_subformulasP(settings);
                                final SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
                                SubLObject doneP = NIL;
                                SubLObject stack = NIL;
                                final SubLObject modal_operator_if_any = possible_modal(expression);
                                if (NIL != modal_operator_if_any) {
                                    final SubLObject non_modal_expression = cycl_utilities.formula_arg1(expression, UNPROVIDED);
                                    previous_rl_expr = canonicalize_reformulator_expression_cached(non_modal_expression, mt, NIL, wff_degree);
                                } else {
                                    previous_rl_expr = canonicalize_reformulator_expression_cached(expression, mt, NIL, wff_degree);
                                }
                                original_clause = previous_rl_expr;
                                if (NIL != previous_rl_expr) {
                                    while ((NIL == doneP) && number_of_reformulations.numLE(recursion_limit)) {
                                        thread.resetMultipleValues();
                                        final SubLObject thrown_old_expr = reformulate_expression(previous_rl_expr, previous_rl_expr, original_clause, mt, settings, eql($TRUE, reformulate_subformulasP));
                                        final SubLObject thrown_new_expr = thread.secondMultipleValue();
                                        final SubLObject thrown_justification = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL == thrown_justification) {
                                            doneP = T;
                                        } else {
                                            new_expression = reformulator_subst(thrown_new_expr, thrown_old_expr, previous_rl_expr, mt);
                                            if (NIL != find(new_expression, stack, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                doneP = T;
                                            } else {
                                                stack = cons(new_expression, stack);
                                                reformulation_history = cons(construct_reformulation_step(thrown_old_expr, thrown_new_expr, thrown_justification), reformulation_history);
                                                number_of_reformulations = add(number_of_reformulations, ONE_INTEGER);
                                                previous_rl_expr = original_clause = new_expression;
                                                new_expression = NIL;
                                            }
                                        }
                                        if ((NIL != $reformulator_timeout_time$.getDynamicValue(thread)) && get_internal_real_time().numG($reformulator_timeout_time$.getDynamicValue(thread))) {
                                            doneP = T;
                                        }
                                    } 
                                    previous_rl_expr = uncanonicalize_rl_expression_cached(previous_rl_expr, mt);
                                    if (NIL != modal_operator_if_any) {
                                        previous_rl_expr = list(modal_operator_if_any, previous_rl_expr);
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                            }
                            reformulation_history = reverse(reformulation_history);
                            if ($TRUE == reformulator_datastructures.get_eliminate_transitivity_in_reformulation_historyP(settings)) {
                                reformulation_history = eliminate_transitivity_in_reformulation_history(reformulation_history);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0_$1, thread);
                }
            }
            final SubLObject timed_out_return_value = ((NIL != $reformulator_timeout_time$.getDynamicValue(thread)) && get_internal_real_time().numG($reformulator_timeout_time$.getDynamicValue(thread))) ? $MAX_TIME : NIL;
            if (number_of_reformulations.isPositive()) {
                return_values = list(previous_rl_expr, reformulation_history, timed_out_return_value);
            } else
                if (NIL == previous_rl_expr) {
                    return_values = list(expression, $ILL_FORMED, timed_out_return_value);
                } else {
                    return_values = list(previous_rl_expr, NIL, timed_out_return_value);
                }

        } finally {
            $reformulator_timeout_time$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(return_values);
    }

    /**
     *
     *
     * @param REFORMULATION-HISTORY;
     * 		a list of (expression reformulation justifications) tuples
     * @return listp; the input reformulation history where intermediate reformulations have been
    eliminated (and their justifications combined)
     * @unknown zelal
     * @unknown hagen
     */
    @LispMethod(comment = "@param REFORMULATION-HISTORY;\r\n\t\ta list of (expression reformulation justifications) tuples\r\n@return listp; the input reformulation history where intermediate reformulations have been\r\neliminated (and their justifications combined)\r\n@unknown zelal\r\n@unknown hagen")
    public static final SubLObject eliminate_transitivity_in_reformulation_history_alt(SubLObject reformulation_history) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = reformulation_history;
            SubLObject reformulation_step = NIL;
            for (reformulation_step = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reformulation_step = cdolist_list_var.first()) {
                {
                    SubLObject original = com.cyc.cycjava.cycl.reformulator_hub.reformulation_step_struct_expression(reformulation_step);
                    SubLObject reformulation = com.cyc.cycjava.cycl.reformulator_hub.reformulation_step_struct_result(reformulation_step);
                    SubLObject justification = com.cyc.cycjava.cycl.reformulator_hub.reformulation_step_struct_justification(reformulation_step);
                    SubLObject result_changedP = NIL;
                    SubLObject cdolist_list_var_5 = result;
                    SubLObject result_step = NIL;
                    for (result_step = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , result_step = cdolist_list_var_5.first()) {
                        {
                            SubLObject result_original = com.cyc.cycjava.cycl.reformulator_hub.reformulation_step_struct_expression(result_step);
                            SubLObject result_reformulation = com.cyc.cycjava.cycl.reformulator_hub.reformulation_step_struct_result(result_step);
                            SubLObject result_justification = com.cyc.cycjava.cycl.reformulator_hub.reformulation_step_struct_justification(result_step);
                            if (original.equalp(result_reformulation)) {
                                result_changedP = T;
                                {
                                    SubLObject new_result_step = list(result_original, reformulation, append(result_justification, justification));
                                    result = subst(new_result_step, result_step, result, EQUALP, UNPROVIDED);
                                }
                            }
                        }
                    }
                    if (NIL == result_changedP) {
                        result = cons(reformulation_step, result);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param REFORMULATION-HISTORY;
     * 		a list of (expression reformulation justifications) tuples
     * @return listp; the input reformulation history where intermediate reformulations have been
    eliminated (and their justifications combined)
     * @unknown zelal
     * @unknown hagen
     */
    @LispMethod(comment = "@param REFORMULATION-HISTORY;\r\n\t\ta list of (expression reformulation justifications) tuples\r\n@return listp; the input reformulation history where intermediate reformulations have been\r\neliminated (and their justifications combined)\r\n@unknown zelal\r\n@unknown hagen")
    public static SubLObject eliminate_transitivity_in_reformulation_history(final SubLObject reformulation_history) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = reformulation_history;
        SubLObject reformulation_step = NIL;
        reformulation_step = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject original = reformulation_step_struct_expression(reformulation_step);
            final SubLObject reformulation = reformulation_step_struct_result(reformulation_step);
            final SubLObject justification = reformulation_step_struct_justification(reformulation_step);
            SubLObject result_changedP = NIL;
            SubLObject cdolist_list_var_$5 = result;
            SubLObject result_step = NIL;
            result_step = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                final SubLObject result_original = reformulation_step_struct_expression(result_step);
                final SubLObject result_reformulation = reformulation_step_struct_result(result_step);
                final SubLObject result_justification = reformulation_step_struct_justification(result_step);
                if (original.equalp(result_reformulation)) {
                    result_changedP = T;
                    final SubLObject new_result_step = list(result_original, reformulation, append(result_justification, justification));
                    result = subst(new_result_step, result_step, result, EQUALP, UNPROVIDED);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                result_step = cdolist_list_var_$5.first();
            } 
            if (NIL == result_changedP) {
                result = cons(reformulation_step, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            reformulation_step = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject reformulator_subst_alt(SubLObject v_new, SubLObject old, SubLObject expression, SubLObject mt) {
        if (old.equal(expression)) {
            return com.cyc.cycjava.cycl.reformulator_hub.recanonicalize_rl_expression(v_new, mt);
        } else {
            {
                SubLObject uncanon_new = (NIL != clauses.clauses_p(v_new)) ? ((SubLObject) (com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression_cached(v_new, mt))) : v_new;
                SubLObject new_expression = NIL;
                if (((NIL != clauses.clauses_p(v_new)) && (NIL != clauses.clauses_p(old))) && (NIL != clauses.clauses_p(expression))) {
                    new_expression = com.cyc.cycjava.cycl.reformulator_hub.rl_clauses_merge_subst(v_new, old, expression, mt);
                } else {
                    new_expression = cycl_utilities.expression_subst(uncanon_new, old, expression, symbol_function(EQUAL), UNPROVIDED);
                }
                if (expression.equal(new_expression)) {
                    new_expression = com.cyc.cycjava.cycl.reformulator_hub.nested_rl_expression_subst(uncanon_new, old, expression, mt);
                }
                return com.cyc.cycjava.cycl.reformulator_hub.recanonicalize_rl_expression(new_expression, mt);
            }
        }
    }

    public static SubLObject reformulator_subst(final SubLObject v_new, final SubLObject old, final SubLObject expression, final SubLObject mt) {
        if (old.equal(expression)) {
            return recanonicalize_rl_expression(v_new, mt);
        }
        final SubLObject uncanon_new = (NIL != clauses.clauses_p(v_new)) ? uncanonicalize_rl_expression_cached(v_new, mt) : v_new;
        SubLObject new_expression = NIL;
        if (((NIL != clauses.clauses_p(v_new)) && (NIL != clauses.clauses_p(old))) && (NIL != clauses.clauses_p(expression))) {
            new_expression = rl_clauses_merge_subst(v_new, old, expression, mt);
        } else {
            new_expression = cycl_utilities.expression_subst(uncanon_new, old, expression, symbol_function(EQUAL), UNPROVIDED);
        }
        if (expression.equal(new_expression)) {
            new_expression = nested_rl_expression_subst(uncanon_new, old, expression, mt);
        }
        return recanonicalize_rl_expression(new_expression, mt);
    }

    public static final SubLObject clear_all_kb_modal_operators_alt() {
        {
            SubLObject cs = $all_kb_modal_operators_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_all_kb_modal_operators() {
        final SubLObject cs = $all_kb_modal_operators_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_all_kb_modal_operators_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($all_kb_modal_operators_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_all_kb_modal_operators() {
        return memoization_state.caching_state_remove_function_results_with_args($all_kb_modal_operators_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_kb_modal_operators_internal_alt() {
        return isa.all_fort_instances($$ModalOperator, $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static SubLObject all_kb_modal_operators_internal() {
        return isa.all_fort_instances($$ModalOperator, $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static final SubLObject all_kb_modal_operators_alt() {
        {
            SubLObject caching_state = $all_kb_modal_operators_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ALL_KB_MODAL_OPERATORS, $all_kb_modal_operators_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.reformulator_hub.all_kb_modal_operators_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject all_kb_modal_operators() {
        SubLObject caching_state = $all_kb_modal_operators_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_KB_MODAL_OPERATORS, $all_kb_modal_operators_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(all_kb_modal_operators_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @unknown the operator of SENT when expression is a singleton clauses-p in which SENT is the only pos literal
     */
    @LispMethod(comment = "@unknown the operator of SENT when expression is a singleton clauses-p in which SENT is the only pos literal")
    public static final SubLObject possible_modal_alt(SubLObject expression) {
        if (NIL != el_formula_p(expression)) {
            {
                SubLObject operator = cycl_utilities.formula_operator(expression);
                if (NIL != subl_promotions.memberP(operator, com.cyc.cycjava.cycl.reformulator_hub.all_kb_modal_operators(), UNPROVIDED, UNPROVIDED)) {
                    return operator;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the operator of SENT when expression is a singleton clauses-p in which SENT is the only pos literal
     */
    @LispMethod(comment = "@unknown the operator of SENT when expression is a singleton clauses-p in which SENT is the only pos literal")
    public static SubLObject possible_modal(final SubLObject expression) {
        if (NIL != el_formula_p(expression)) {
            final SubLObject operator = cycl_utilities.formula_operator(expression);
            if (NIL != subl_promotions.memberP(operator, all_kb_modal_operators(), UNPROVIDED, UNPROVIDED)) {
                return operator;
            }
        }
        return NIL;
    }

    /**
     * For now, assumes OLD-CLAUSES is a singleton pos-atomic-cnf-p.
     */
    @LispMethod(comment = "For now, assumes OLD-CLAUSES is a singleton pos-atomic-cnf-p.")
    public static final SubLObject rl_clauses_merge_subst_alt(SubLObject new_clauses, SubLObject old_clauses, SubLObject all_clauses, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != list_utilities.singletonP(old_clauses)) && (NIL != clause_utilities.pos_atomic_cnf_p(old_clauses.first())))) {
                    Errors.error($str_alt15$The_reformulator_currently_cannot);
                }
            }
            {
                SubLObject result_clauses = NIL;
                SubLObject old_lit = clause_utilities.gaf_cnf_literal(old_clauses.first());
                if (NIL != list_utilities.singletonP(new_clauses)) {
                    {
                        SubLObject new_pos_lits = clauses.pos_lits(new_clauses.first());
                        SubLObject new_neg_lits = clauses.neg_lits(new_clauses.first());
                        SubLObject cdolist_list_var = all_clauses;
                        SubLObject clause = NIL;
                        for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                            {
                                SubLObject result_pos_lits = NIL;
                                SubLObject result_neg_lits = NIL;
                                {
                                    SubLObject cdolist_list_var_6 = clauses.pos_lits(clause);
                                    SubLObject pos_lit = NIL;
                                    for (pos_lit = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , pos_lit = cdolist_list_var_6.first()) {
                                        if (pos_lit.equal(old_lit)) {
                                            if (NIL != new_pos_lits) {
                                                result_pos_lits = append(result_pos_lits, new_pos_lits);
                                            }
                                        } else {
                                            result_pos_lits = cons(pos_lit, result_pos_lits);
                                        }
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var_7 = clauses.neg_lits(clause);
                                    SubLObject neg_lit = NIL;
                                    for (neg_lit = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , neg_lit = cdolist_list_var_7.first()) {
                                        if (neg_lit.equal(old_lit)) {
                                            if (NIL != list_utilities.sublisp_boolean(new_neg_lits)) {
                                                result_neg_lits = append(result_neg_lits, new_neg_lits);
                                            } else {
                                                if (NIL != list_utilities.sublisp_boolean(new_pos_lits)) {
                                                    result_neg_lits = append(result_neg_lits, new_pos_lits);
                                                }
                                            }
                                        } else {
                                            result_neg_lits = cons(neg_lit, result_neg_lits);
                                        }
                                    }
                                }
                                if ((NIL != result_pos_lits) || (NIL != result_neg_lits)) {
                                    result_clauses = cons(clauses.make_cnf(reverse(result_neg_lits), reverse(result_pos_lits)), result_clauses);
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject old_lit_not_aloneP = NIL;
                        if (NIL == old_lit_not_aloneP) {
                            {
                                SubLObject csome_list_var = all_clauses;
                                SubLObject clause = NIL;
                                for (clause = csome_list_var.first(); !((NIL != old_lit_not_aloneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
                                    {
                                        SubLObject result_pos_lits = NIL;
                                        SubLObject result_neg_lits = NIL;
                                        SubLObject saw_old_lit_this_clauseP = NIL;
                                        SubLObject saw_non_old_lit_this_clauseP = NIL;
                                        {
                                            SubLObject cdolist_list_var = clauses.pos_lits(clause);
                                            SubLObject pos_lit = NIL;
                                            for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                                                if (pos_lit.equal(old_lit)) {
                                                    saw_old_lit_this_clauseP = T;
                                                } else {
                                                    saw_non_old_lit_this_clauseP = T;
                                                    result_pos_lits = cons(pos_lit, result_pos_lits);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = clauses.neg_lits(clause);
                                            SubLObject neg_lit = NIL;
                                            for (neg_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit = cdolist_list_var.first()) {
                                                if (neg_lit.equal(old_lit)) {
                                                    saw_old_lit_this_clauseP = T;
                                                } else {
                                                    saw_non_old_lit_this_clauseP = T;
                                                    result_neg_lits = cons(neg_lit, result_neg_lits);
                                                }
                                            }
                                        }
                                        if ((NIL != saw_old_lit_this_clauseP) && (NIL != saw_non_old_lit_this_clauseP)) {
                                            old_lit_not_aloneP = T;
                                        }
                                        if ((NIL != result_pos_lits) || (NIL != result_neg_lits)) {
                                            result_clauses = cons(clauses.make_cnf(reverse(result_neg_lits), reverse(result_pos_lits)), result_clauses);
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL == old_lit_not_aloneP) {
                            result_clauses = append(result_clauses, new_clauses);
                        } else {
                            result_clauses = NIL;
                            {
                                SubLObject el_all = com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression_cached(all_clauses, mt);
                                SubLObject el_new = com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression_cached(new_clauses, mt);
                                SubLObject el_result = cycl_utilities.expression_subst(el_new, old_lit, el_all, symbol_function(EQUAL), UNPROVIDED);
                                result_clauses = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression(el_result, mt, NIL, $NONE, UNPROVIDED);
                            }
                        }
                    }
                }
                return reverse(result_clauses);
            }
        }
    }

    /**
     * For now, assumes OLD-CLAUSES is a singleton pos-atomic-cnf-p.
     */
    @LispMethod(comment = "For now, assumes OLD-CLAUSES is a singleton pos-atomic-cnf-p.")
    public static SubLObject rl_clauses_merge_subst(final SubLObject new_clauses, final SubLObject old_clauses, final SubLObject all_clauses, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == list_utilities.singletonP(old_clauses)) || (NIL == clause_utilities.pos_atomic_cnf_p(old_clauses.first())))) {
            Errors.error($str13$The_reformulator_currently_cannot);
        }
        SubLObject result_clauses = NIL;
        final SubLObject old_lit = clause_utilities.gaf_cnf_literal(old_clauses.first());
        if (NIL != list_utilities.singletonP(new_clauses)) {
            final SubLObject new_pos_lits = clauses.pos_lits(new_clauses.first());
            final SubLObject new_neg_lits = clauses.neg_lits(new_clauses.first());
            SubLObject cdolist_list_var = all_clauses;
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject result_pos_lits = NIL;
                SubLObject result_neg_lits = NIL;
                SubLObject cdolist_list_var_$6 = clauses.pos_lits(clause);
                SubLObject pos_lit = NIL;
                pos_lit = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    if (pos_lit.equal(old_lit)) {
                        if (NIL != new_pos_lits) {
                            result_pos_lits = append(result_pos_lits, new_pos_lits);
                        }
                    } else {
                        result_pos_lits = cons(pos_lit, result_pos_lits);
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    pos_lit = cdolist_list_var_$6.first();
                } 
                SubLObject cdolist_list_var_$7 = clauses.neg_lits(clause);
                SubLObject neg_lit = NIL;
                neg_lit = cdolist_list_var_$7.first();
                while (NIL != cdolist_list_var_$7) {
                    if (neg_lit.equal(old_lit)) {
                        if (NIL != list_utilities.sublisp_boolean(new_neg_lits)) {
                            result_neg_lits = append(result_neg_lits, new_neg_lits);
                        } else
                            if (NIL != list_utilities.sublisp_boolean(new_pos_lits)) {
                                result_neg_lits = append(result_neg_lits, new_pos_lits);
                            }

                    } else {
                        result_neg_lits = cons(neg_lit, result_neg_lits);
                    }
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    neg_lit = cdolist_list_var_$7.first();
                } 
                if ((NIL != result_pos_lits) || (NIL != result_neg_lits)) {
                    result_clauses = cons(clauses.make_cnf(reverse(result_neg_lits), reverse(result_pos_lits)), result_clauses);
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
        } else {
            SubLObject old_lit_not_aloneP = NIL;
            if (NIL == old_lit_not_aloneP) {
                SubLObject csome_list_var = all_clauses;
                SubLObject clause2 = NIL;
                clause2 = csome_list_var.first();
                while ((NIL == old_lit_not_aloneP) && (NIL != csome_list_var)) {
                    SubLObject result_pos_lits2 = NIL;
                    SubLObject result_neg_lits2 = NIL;
                    SubLObject saw_old_lit_this_clauseP = NIL;
                    SubLObject saw_non_old_lit_this_clauseP = NIL;
                    SubLObject cdolist_list_var2 = clauses.pos_lits(clause2);
                    SubLObject pos_lit2 = NIL;
                    pos_lit2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (pos_lit2.equal(old_lit)) {
                            saw_old_lit_this_clauseP = T;
                        } else {
                            saw_non_old_lit_this_clauseP = T;
                            result_pos_lits2 = cons(pos_lit2, result_pos_lits2);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pos_lit2 = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = clauses.neg_lits(clause2);
                    SubLObject neg_lit2 = NIL;
                    neg_lit2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (neg_lit2.equal(old_lit)) {
                            saw_old_lit_this_clauseP = T;
                        } else {
                            saw_non_old_lit_this_clauseP = T;
                            result_neg_lits2 = cons(neg_lit2, result_neg_lits2);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        neg_lit2 = cdolist_list_var2.first();
                    } 
                    if ((NIL != saw_old_lit_this_clauseP) && (NIL != saw_non_old_lit_this_clauseP)) {
                        old_lit_not_aloneP = T;
                    }
                    if ((NIL != result_pos_lits2) || (NIL != result_neg_lits2)) {
                        result_clauses = cons(clauses.make_cnf(reverse(result_neg_lits2), reverse(result_pos_lits2)), result_clauses);
                    }
                    csome_list_var = csome_list_var.rest();
                    clause2 = csome_list_var.first();
                } 
            }
            if (NIL == old_lit_not_aloneP) {
                result_clauses = append(result_clauses, new_clauses);
            } else {
                result_clauses = NIL;
                final SubLObject el_all = uncanonicalize_rl_expression_cached(all_clauses, mt);
                final SubLObject el_new = uncanonicalize_rl_expression_cached(new_clauses, mt);
                final SubLObject el_result = cycl_utilities.expression_subst(el_new, old_lit, el_all, symbol_function(EQUAL), UNPROVIDED);
                result_clauses = canonicalize_reformulator_expression(el_result, mt, NIL, $NONE, UNPROVIDED);
            }
        }
        return reverse(result_clauses);
    }

    public static final SubLObject nested_rl_expression_subst_alt(SubLObject uncanon_new, SubLObject old, SubLObject expression, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rl_mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $rl_old$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $rl_new$.currentBinding(thread);
                    try {
                        $rl_mt$.bind(mt, thread);
                        $rl_old$.bind(NIL != clauses.clauses_p(old) ? ((SubLObject) (old)) : com.cyc.cycjava.cycl.reformulator_hub.recanonicalize_rl_expression(old, $rl_mt$.getDynamicValue(thread)), thread);
                        $rl_new$.bind(uncanon_new, thread);
                        result = cycl_utilities.expression_transform(expression, $sym17$CONTAINS_OLD_RL_, SUBST_NEW_RL, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $rl_new$.rebind(_prev_bind_2, thread);
                        $rl_old$.rebind(_prev_bind_1, thread);
                        $rl_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject nested_rl_expression_subst(final SubLObject uncanon_new, final SubLObject old, final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rl_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rl_old$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $rl_new$.currentBinding(thread);
        try {
            $rl_mt$.bind(mt, thread);
            $rl_old$.bind(NIL != clauses.clauses_p(old) ? old : recanonicalize_rl_expression(old, $rl_mt$.getDynamicValue(thread)), thread);
            $rl_new$.bind(uncanon_new, thread);
            result = cycl_utilities.expression_transform(expression, $sym15$CONTAINS_OLD_RL_, SUBST_NEW_RL, UNPROVIDED, UNPROVIDED);
        } finally {
            $rl_new$.rebind(_prev_bind_3, thread);
            $rl_old$.rebind(_prev_bind_2, thread);
            $rl_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject contains_old_rlP_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (expression.equal($rl_new$.getDynamicValue(thread))) {
                return NIL;
            }
            {
                SubLObject canon_expression = com.cyc.cycjava.cycl.reformulator_hub.recanonicalize_rl_expression(expression, $rl_mt$.getDynamicValue(thread));
                if ((NIL != clauses.clauses_p(canon_expression)) && (NIL != clauses.clauses_p($rl_old$.getDynamicValue(thread)))) {
                    return subsetp($rl_old$.getDynamicValue(thread), canon_expression, symbol_function(EQUAL), UNPROVIDED);
                } else {
                    return list_utilities.sublisp_boolean(cycl_utilities.expression_find($rl_old$.getDynamicValue(thread), canon_expression, NIL, UNPROVIDED, UNPROVIDED));
                }
            }
        }
    }

    public static SubLObject contains_old_rlP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (expression.equal($rl_new$.getDynamicValue(thread))) {
            return NIL;
        }
        final SubLObject canon_expression = recanonicalize_rl_expression(expression, $rl_mt$.getDynamicValue(thread));
        if ((NIL != clauses.clauses_p(canon_expression)) && (NIL != clauses.clauses_p($rl_old$.getDynamicValue(thread)))) {
            return subsetp($rl_old$.getDynamicValue(thread), canon_expression, symbol_function(EQUAL), UNPROVIDED);
        }
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find($rl_old$.getDynamicValue(thread), canon_expression, NIL, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject subst_new_rl_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_expression = com.cyc.cycjava.cycl.reformulator_hub.recanonicalize_rl_expression(expression, $rl_mt$.getDynamicValue(thread));
                SubLObject canon_old = (NIL != clauses.clauses_p($rl_old$.getDynamicValue(thread))) ? ((SubLObject) ($rl_old$.getDynamicValue(thread))) : com.cyc.cycjava.cycl.reformulator_hub.recanonicalize_rl_expression($rl_old$.getDynamicValue(thread), $rl_mt$.getDynamicValue(thread));
                SubLObject canon_new = com.cyc.cycjava.cycl.reformulator_hub.recanonicalize_rl_expression($rl_new$.getDynamicValue(thread), $rl_mt$.getDynamicValue(thread));
                if (((NIL != clauses.clauses_p(canon_new)) && (NIL != clauses.clauses_p(canon_old))) && (NIL != clauses.clauses_p(canon_expression))) {
                    return com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression(com.cyc.cycjava.cycl.reformulator_hub.rl_clauses_merge_subst(canon_new, canon_old, canon_expression, $rl_mt$.getDynamicValue(thread)), $rl_mt$.getDynamicValue(thread));
                }
            }
            return NIL;
        }
    }

    public static SubLObject subst_new_rl(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_expression = recanonicalize_rl_expression(expression, $rl_mt$.getDynamicValue(thread));
        final SubLObject canon_old = (NIL != clauses.clauses_p($rl_old$.getDynamicValue(thread))) ? $rl_old$.getDynamicValue(thread) : recanonicalize_rl_expression($rl_old$.getDynamicValue(thread), $rl_mt$.getDynamicValue(thread));
        final SubLObject canon_new = recanonicalize_rl_expression($rl_new$.getDynamicValue(thread), $rl_mt$.getDynamicValue(thread));
        if (((NIL != clauses.clauses_p(canon_new)) && (NIL != clauses.clauses_p(canon_old))) && (NIL != clauses.clauses_p(canon_expression))) {
            return uncanonicalize_rl_expression(rl_clauses_merge_subst(canon_new, canon_old, canon_expression, $rl_mt$.getDynamicValue(thread)), $rl_mt$.getDynamicValue(thread));
        }
        return NIL;
    }

    /**
     * Returns a reformulation step that encodes the source expression, result expression and justifications of a single reformulation.
     */
    @LispMethod(comment = "Returns a reformulation step that encodes the source expression, result expression and justifications of a single reformulation.")
    public static final SubLObject construct_reformulation_step_alt(SubLObject expression, SubLObject result, SubLObject justification) {
        return list(expression, result, justification);
    }

    @LispMethod(comment = "Returns a reformulation step that encodes the source expression, result expression and justifications of a single reformulation.")
    public static SubLObject construct_reformulation_step(final SubLObject expression, final SubLObject result, final SubLObject justification) {
        return list(expression, result, justification);
    }/**
     * Returns a reformulation step that encodes the source expression, result expression and justifications of a single reformulation.
     */


    /**
     * Returns the source expression slot of a reformulation step.
     */
    @LispMethod(comment = "Returns the source expression slot of a reformulation step.")
    public static final SubLObject reformulation_step_struct_expression_alt(SubLObject reformulation_step) {
        return reformulation_step.first();
    }

    @LispMethod(comment = "Returns the source expression slot of a reformulation step.")
    public static SubLObject reformulation_step_struct_expression(final SubLObject reformulation_step) {
        return reformulation_step.first();
    }/**
     * Returns the source expression slot of a reformulation step.
     */


    /**
     * Returns the result expression slot of a reformulation step.
     */
    @LispMethod(comment = "Returns the result expression slot of a reformulation step.")
    public static final SubLObject reformulation_step_struct_result_alt(SubLObject reformulation_step) {
        return second(reformulation_step);
    }

    @LispMethod(comment = "Returns the result expression slot of a reformulation step.")
    public static SubLObject reformulation_step_struct_result(final SubLObject reformulation_step) {
        return second(reformulation_step);
    }/**
     * Returns the result expression slot of a reformulation step.
     */


    /**
     * Returns the justifications slot of a reformulation step.
     */
    @LispMethod(comment = "Returns the justifications slot of a reformulation step.")
    public static final SubLObject reformulation_step_struct_justification_alt(SubLObject reformulation_step) {
        return third(reformulation_step);
    }

    @LispMethod(comment = "Returns the justifications slot of a reformulation step.")
    public static SubLObject reformulation_step_struct_justification(final SubLObject reformulation_step) {
        return third(reformulation_step);
    }/**
     * Returns the justifications slot of a reformulation step.
     */


    public static final SubLObject ref_warn_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($ref_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }
            return NIL;
        }
    }

    public static SubLObject ref_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($ref_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        }
        return NIL;
    }

    /**
     * Reformulates EXPRESSION (and its subexpressions, if REFORMULATE-SUBFORMULAS? is true) into other forms.
     *
     * @param OLD-EXPRESSION;
     * 		the expression that will be substituted for at the top level.
     * @param ORIGINAL-CLAUSE;
     * 		the clause passed by reformulate-cycl, canonicalized
     * @return 0 old expression
     * @return 1 new expression
     * @return 2 justification
     */
    @LispMethod(comment = "Reformulates EXPRESSION (and its subexpressions, if REFORMULATE-SUBFORMULAS? is true) into other forms.\r\n\r\n@param OLD-EXPRESSION;\r\n\t\tthe expression that will be substituted for at the top level.\r\n@param ORIGINAL-CLAUSE;\r\n\t\tthe clause passed by reformulate-cycl, canonicalized\r\n@return 0 old expression\r\n@return 1 new expression\r\n@return 2 justification")
    public static final SubLObject reformulate_expression_internal_alt(SubLObject expression, SubLObject old_expression, SubLObject original_clause, SubLObject mt, SubLObject settings, SubLObject reformulate_subformulasP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject justification = NIL;
                SubLObject apply_first = reformulator_datastructures.get_apply_first_recursively(settings);
                if (NIL != com.cyc.cycjava.cycl.reformulator_hub.reformulate_atoms_criterion_metP(expression, settings)) {
                    if ((NIL != apply_first) && (NIL != reformulate_subformulasP)) {
                        settings = remf(copy_list(settings), $APPLY_FIRST_RECURSIVELY);
                        thread.resetMultipleValues();
                        {
                            SubLObject old_expression_8 = com.cyc.cycjava.cycl.reformulator_hub.reformulate_cycl_apply_first_recursively(expression, old_expression, original_clause, mt, settings, apply_first);
                            SubLObject result_9 = thread.secondMultipleValue();
                            SubLObject justification_10 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            old_expression = old_expression_8;
                            result = result_9;
                            justification = justification_10;
                        }
                    } else {
                        thread.resetMultipleValues();
                        {
                            SubLObject result_11 = com.cyc.cycjava.cycl.reformulator_hub.try_rl_modules_with_expression(expression, original_clause, mt, settings);
                            SubLObject justification_12 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_11;
                            justification = justification_12;
                        }
                    }
                }
                if (NIL != justification) {
                    return values(old_expression, result, justification);
                }
                if ((NIL != el_formula_p(expression)) && (NIL != reformulate_subformulasP)) {
                    return com.cyc.cycjava.cycl.reformulator_hub.map_reformulate_cycl(expression, original_clause, mt, settings);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Reformulates EXPRESSION (and its subexpressions, if REFORMULATE-SUBFORMULAS? is true) into other forms.\r\n\r\n@param OLD-EXPRESSION;\r\n\t\tthe expression that will be substituted for at the top level.\r\n@param ORIGINAL-CLAUSE;\r\n\t\tthe clause passed by reformulate-cycl, canonicalized\r\n@return 0 old expression\r\n@return 1 new expression\r\n@return 2 justification")
    public static SubLObject reformulate_expression_internal(final SubLObject expression, SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, SubLObject settings, final SubLObject reformulate_subformulasP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject apply_first = reformulator_datastructures.get_apply_first_recursively(settings);
        if (NIL != reformulate_atoms_criterion_metP(expression, settings)) {
            if ((NIL != apply_first) && (NIL != reformulate_subformulasP)) {
                settings = remf(copy_list(settings), $APPLY_FIRST_RECURSIVELY);
                thread.resetMultipleValues();
                final SubLObject old_expression_$8 = reformulate_cycl_apply_first_recursively(expression, old_expression, original_clause, mt, settings, apply_first);
                final SubLObject result_$9 = thread.secondMultipleValue();
                final SubLObject justification_$10 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                old_expression = old_expression_$8;
                result = result_$9;
                justification = justification_$10;
            } else {
                thread.resetMultipleValues();
                final SubLObject result_$10 = try_rl_modules_with_expression(expression, original_clause, mt, settings);
                final SubLObject justification_$11 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$10;
                justification = justification_$11;
            }
        }
        if (NIL != justification) {
            return values(old_expression, result, justification);
        }
        if ((NIL != el_formula_p(expression)) && (NIL != reformulate_subformulasP)) {
            return map_reformulate_cycl(expression, original_clause, mt, settings);
        }
        return NIL;
    }/**
     * Reformulates EXPRESSION (and its subexpressions, if REFORMULATE-SUBFORMULAS? is true) into other forms.
     *
     * @param OLD-EXPRESSION;
     * 		the expression that will be substituted for at the top level.
     * @param ORIGINAL-CLAUSE;
     * 		the clause passed by reformulate-cycl, canonicalized
     * @return 0 old expression
     * @return 1 new expression
     * @return 2 justification
     */


    public static final SubLObject reformulate_expression_alt(SubLObject expression, SubLObject old_expression, SubLObject original_clause, SubLObject mt, SubLObject settings, SubLObject reformulate_subformulasP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.reformulator_hub.reformulate_expression_internal(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REFORMULATE_EXPRESSION, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REFORMULATE_EXPRESSION, SIX_INTEGER, $int$64, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, REFORMULATE_EXPRESSION, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_6(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (old_expression.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (original_clause.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (mt.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (settings.equal(cached_args.first())) {
                                                        cached_args = cached_args.rest();
                                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && reformulate_subformulasP.equal(cached_args.first())) {
                                                            return memoization_state.caching_results(results2);
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
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.reformulator_hub.reformulate_expression_internal(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject reformulate_expression(final SubLObject expression, final SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings, final SubLObject reformulate_subformulasP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return reformulate_expression_internal(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REFORMULATE_EXPRESSION, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REFORMULATE_EXPRESSION, SIX_INTEGER, $int$64, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REFORMULATE_EXPRESSION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (old_expression.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (original_clause.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (settings.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && reformulate_subformulasP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(reformulate_expression_internal(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP));
        return memoization_state.caching_results(results3);
    }

    /**
     * special case wrapper for reformulate-expression, when the :apply-first-recursively setting is set.
     *
     * @return 0 old expression
     * @return 1 new expression
     * @return 2 justification
     */
    @LispMethod(comment = "special case wrapper for reformulate-expression, when the :apply-first-recursively setting is set.\r\n\r\n@return 0 old expression\r\n@return 1 new expression\r\n@return 2 justification")
    public static final SubLObject reformulate_cycl_apply_first_recursively_alt(SubLObject expression, SubLObject old_expression, SubLObject original_clause, SubLObject mt, SubLObject settings, SubLObject apply_first) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = append(apply_first, list(NIL));
                SubLObject rl_module_name = NIL;
                for (rl_module_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rl_module_name = cdolist_list_var.first()) {
                    {
                        SubLObject focused_settings = putf(copy_list(settings), $FOCUS, rl_module_name);
                        thread.resetMultipleValues();
                        {
                            SubLObject new_old_expression = com.cyc.cycjava.cycl.reformulator_hub.reformulate_expression(expression, old_expression, original_clause, mt, focused_settings, T);
                            SubLObject new_expression = thread.secondMultipleValue();
                            SubLObject justification = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != justification) {
                                return values(new_old_expression, new_expression, justification);
                            }
                        }
                    }
                }
            }
            return values(old_expression, expression, NIL);
        }
    }

    @LispMethod(comment = "special case wrapper for reformulate-expression, when the :apply-first-recursively setting is set.\r\n\r\n@return 0 old expression\r\n@return 1 new expression\r\n@return 2 justification")
    public static SubLObject reformulate_cycl_apply_first_recursively(final SubLObject expression, final SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings, final SubLObject apply_first) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = append(apply_first, list(NIL));
        SubLObject rl_module_name = NIL;
        rl_module_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject focused_settings = putf(copy_list(settings), $FOCUS, rl_module_name);
            thread.resetMultipleValues();
            final SubLObject new_old_expression = reformulate_expression(expression, old_expression, original_clause, mt, focused_settings, T);
            final SubLObject new_expression = thread.secondMultipleValue();
            final SubLObject justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != justification) {
                return values(new_old_expression, new_expression, justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rl_module_name = cdolist_list_var.first();
        } 
        return values(old_expression, expression, NIL);
    }/**
     * special case wrapper for reformulate-expression, when the :apply-first-recursively setting is set.
     *
     * @return 0 old expression
     * @return 1 new expression
     * @return 2 justification
     */


    /**
     * Reformulates the subexpressions of EXPRESSION in MT given SETTINGS.
     */
    @LispMethod(comment = "Reformulates the subexpressions of EXPRESSION in MT given SETTINGS.")
    public static final SubLObject map_reformulate_cycl_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != clauses.clauses_p(expression)) {
                if ((NIL != list_utilities.singletonP(expression)) && (NIL != clauses.atomic_clause_p(expression.first()))) {
                    {
                        SubLObject clause = expression.first();
                        if (NIL != clause_utilities.neg_atomic_cnf_p(clause)) {
                            {
                                SubLObject inverted_neg_pos_atomic_clause = clause_utilities.make_gaf_cnf(clause_utilities.atomic_cnf_asent(clause));
                                thread.resetMultipleValues();
                                {
                                    SubLObject sub_expression = com.cyc.cycjava.cycl.reformulator_hub.reformulate_expression(inverted_neg_pos_atomic_clause, expression, original_clause, mt, settings, T);
                                    SubLObject sub_result = thread.secondMultipleValue();
                                    SubLObject justification = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != justification) {
                                        return values(sub_expression, sub_result, justification);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject pos_lit = clauses.pos_lits(clause).first();
                            SubLObject neg_lit = clauses.neg_lits(clause).first();
                            return com.cyc.cycjava.cycl.reformulator_hub.map_reformulate_cycl(NIL != pos_lit ? ((SubLObject) (pos_lit)) : neg_lit, original_clause, mt, settings);
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = expression;
                        SubLObject clause = NIL;
                        for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_13 = clauses.pos_lits(clause);
                                SubLObject pos_lit = NIL;
                                for (pos_lit = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , pos_lit = cdolist_list_var_13.first()) {
                                    {
                                        SubLObject v_clauses = list(clause_utilities.make_gaf_cnf(pos_lit));
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject sub_expression = com.cyc.cycjava.cycl.reformulator_hub.reformulate_expression(v_clauses, v_clauses, original_clause, mt, settings, T);
                                            SubLObject sub_result = thread.secondMultipleValue();
                                            SubLObject justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != justification) {
                                                return values(sub_expression, sub_result, justification);
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var_14 = clauses.neg_lits(clause);
                                SubLObject neg_lit = NIL;
                                for (neg_lit = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , neg_lit = cdolist_list_var_14.first()) {
                                    {
                                        SubLObject v_clauses = list(clause_utilities.make_gaf_cnf(neg_lit));
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject sub_expression = com.cyc.cycjava.cycl.reformulator_hub.reformulate_expression(v_clauses, v_clauses, original_clause, mt, settings, T);
                                            SubLObject sub_result = thread.secondMultipleValue();
                                            SubLObject justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != justification) {
                                                return values(sub_expression, sub_result, justification);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject terms = cycl_utilities.formula_terms(expression, $IGNORE);
                    SubLObject cdolist_list_var = terms;
                    SubLObject sub_term = NIL;
                    for (sub_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_term = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject sub_expression = com.cyc.cycjava.cycl.reformulator_hub.map_reformulate_expression(sub_term, original_clause, mt, settings);
                            SubLObject sub_result = thread.secondMultipleValue();
                            SubLObject justification = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != justification) {
                                return values(sub_expression, sub_result, justification);
                            }
                        }
                    }
                }
            }
            return values(expression, NIL, NIL);
        }
    }

    @LispMethod(comment = "Reformulates the subexpressions of EXPRESSION in MT given SETTINGS.")
    public static SubLObject map_reformulate_cycl(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != clauses.clauses_p(expression)) {
            if ((NIL != list_utilities.singletonP(expression)) && (NIL != clauses.atomic_clause_p(expression.first()))) {
                final SubLObject clause = expression.first();
                if (NIL != clause_utilities.neg_atomic_cnf_p(clause)) {
                    final SubLObject inverted_neg_pos_atomic_clause = clause_utilities.make_gaf_cnf(clause_utilities.atomic_cnf_asent(clause));
                    thread.resetMultipleValues();
                    final SubLObject sub_expression = reformulate_expression(inverted_neg_pos_atomic_clause, expression, original_clause, mt, settings, T);
                    final SubLObject sub_result = thread.secondMultipleValue();
                    final SubLObject justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != justification) {
                        return values(sub_expression, sub_result, justification);
                    }
                }
                final SubLObject pos_lit = clauses.pos_lits(clause).first();
                final SubLObject neg_lit = clauses.neg_lits(clause).first();
                return map_reformulate_cycl(NIL != pos_lit ? pos_lit : neg_lit, original_clause, mt, settings);
            }
            SubLObject cdolist_list_var = expression;
            SubLObject clause2 = NIL;
            clause2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$13 = clauses.pos_lits(clause2);
                SubLObject pos_lit2 = NIL;
                pos_lit2 = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    final SubLObject v_clauses = list(clause_utilities.make_gaf_cnf(pos_lit2));
                    thread.resetMultipleValues();
                    final SubLObject sub_expression2 = reformulate_expression(v_clauses, v_clauses, original_clause, mt, settings, T);
                    final SubLObject sub_result2 = thread.secondMultipleValue();
                    final SubLObject justification2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != justification2) {
                        return values(sub_expression2, sub_result2, justification2);
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    pos_lit2 = cdolist_list_var_$13.first();
                } 
                SubLObject cdolist_list_var_$14 = clauses.neg_lits(clause2);
                SubLObject neg_lit2 = NIL;
                neg_lit2 = cdolist_list_var_$14.first();
                while (NIL != cdolist_list_var_$14) {
                    final SubLObject v_clauses = list(clause_utilities.make_gaf_cnf(neg_lit2));
                    thread.resetMultipleValues();
                    final SubLObject sub_expression2 = reformulate_expression(v_clauses, v_clauses, original_clause, mt, settings, T);
                    final SubLObject sub_result2 = thread.secondMultipleValue();
                    final SubLObject justification2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != justification2) {
                        return values(sub_expression2, sub_result2, justification2);
                    }
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    neg_lit2 = cdolist_list_var_$14.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                clause2 = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var2;
            final SubLObject terms = cdolist_list_var2 = cycl_utilities.formula_terms(expression, $IGNORE);
            SubLObject sub_term = NIL;
            sub_term = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject sub_expression3 = map_reformulate_expression(sub_term, original_clause, mt, settings);
                final SubLObject sub_result3 = thread.secondMultipleValue();
                final SubLObject justification3 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != justification3) {
                    return values(sub_expression3, sub_result3, justification3);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                sub_term = cdolist_list_var2.first();
            } 
        }
        return values(expression, NIL, NIL);
    }/**
     * Reformulates the subexpressions of EXPRESSION in MT given SETTINGS.
     */


    public static final SubLObject map_reformulate_expression_alt(SubLObject sub_term, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            SubLObject canon_subterm = sub_term;
            if (NIL != cycl_grammar.cycl_sentence_p(sub_term)) {
                canon_subterm = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_cached(sub_term, mt, NIL, $NONE);
            }
            return com.cyc.cycjava.cycl.reformulator_hub.reformulate_expression(canon_subterm, sub_term, original_clause, mt, settings, T);
        }
    }

    public static SubLObject map_reformulate_expression(final SubLObject sub_term, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject canon_subterm = sub_term;
        if (NIL != cycl_grammar.cycl_sentence_p(sub_term)) {
            canon_subterm = canonicalize_reformulator_expression_cached(sub_term, mt, NIL, $NONE);
        }
        return reformulate_expression(canon_subterm, sub_term, original_clause, mt, settings, T);
    }

    /**
     * If there's a FOCUS specified then directly calls the respective RL module to reformulate EXPRESSION.
     * Otherwise, solicits all RL modules to see if they apply and at what cost; calls each of the applicable
     * modules in order of cost, and returns the first successful result.
     */
    @LispMethod(comment = "If there\'s a FOCUS specified then directly calls the respective RL module to reformulate EXPRESSION.\r\nOtherwise, solicits all RL modules to see if they apply and at what cost; calls each of the applicable\r\nmodules in order of cost, and returns the first successful result.\nIf there\'s a FOCUS specified then directly calls the respective RL module to reformulate EXPRESSION.\nOtherwise, solicits all RL modules to see if they apply and at what cost; calls each of the applicable\nmodules in order of cost, and returns the first successful result.")
    public static final SubLObject try_rl_modules_with_expression_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = expression;
                SubLObject justification = NIL;
                SubLObject focus = reformulator_datastructures.get_reformulation_focus(settings);
                SubLObject ignore_list = reformulator_datastructures.get_ignore_rl_modules(settings);
                SubLObject rl_module_cost_pairs = NIL;
                if (NIL != focus) {
                    {
                        SubLObject rl_module = reformulator_module_harness.get_rl_module_from_store(focus);
                        if (NIL != reformulator_module_harness.rl_module_applicableP(rl_module, expression, mt, settings)) {
                            rl_module_cost_pairs = list(bq_cons(rl_module, ZERO_INTEGER));
                        } else {
                            rl_module_cost_pairs = NIL;
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = reformulator_module_harness.rl_module_store();
                        SubLObject mod = NIL;
                        for (mod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mod = cdolist_list_var.first()) {
                            {
                                SubLObject rl_module = mod;
                                SubLObject module_name = reformulator_module_harness.rl_module_name(rl_module);
                                if (!((NIL != subl_promotions.memberP(module_name, ignore_list, UNPROVIDED, UNPROVIDED)) || (NIL != member(module_name, $ignore_modules_unless_focussed$.getGlobalValue(), UNPROVIDED, UNPROVIDED)))) {
                                    {
                                        SubLObject requiredP = reformulator_module_harness.rl_module_applicableP(rl_module, expression, mt, settings);
                                        if (NIL != requiredP) {
                                            {
                                                SubLObject cost = reformulator_module_harness.rl_module_cost(rl_module, expression, mt, settings);
                                                rl_module_cost_pairs = cons(cons(rl_module, cost), rl_module_cost_pairs);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                rl_module_cost_pairs = Sort.sort(rl_module_cost_pairs, symbol_function($sym25$_), symbol_function(CDR));
                if (NIL == justification) {
                    {
                        SubLObject csome_list_var = rl_module_cost_pairs;
                        SubLObject rl_moduleXcost = NIL;
                        for (rl_moduleXcost = csome_list_var.first(); !((NIL != justification) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rl_moduleXcost = csome_list_var.first()) {
                            {
                                SubLObject rl_module = rl_moduleXcost.first();
                                thread.resetMultipleValues();
                                {
                                    SubLObject result_15 = reformulator_module_harness.rl_module_reformulate(rl_module, expression, original_clause, mt, settings);
                                    SubLObject justification_16 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    result = result_15;
                                    justification = justification_16;
                                }
                                if (NIL == justification) {
                                } else {
                                    if (T.eql(justification)) {
                                        justification = list(reformulator_module_harness.rl_module_name(rl_module));
                                    } else {
                                        if (justification.isCons()) {
                                            justification = cons(reformulator_module_harness.rl_module_name(rl_module), justification);
                                        } else {
                                            justification = cons(reformulator_module_harness.rl_module_name(rl_module), list(justification));
                                        }
                                    }
                                }
                                if ((NIL != $reformulator_timeout_time$.getDynamicValue(thread)) && get_internal_real_time().numG($reformulator_timeout_time$.getDynamicValue(thread))) {
                                    justification = NIL;
                                }
                            }
                        }
                    }
                }
                return values(result, justification);
            }
        }
    }

    @LispMethod(comment = "If there\'s a FOCUS specified then directly calls the respective RL module to reformulate EXPRESSION.\r\nOtherwise, solicits all RL modules to see if they apply and at what cost; calls each of the applicable\r\nmodules in order of cost, and returns the first successful result.\nIf there\'s a FOCUS specified then directly calls the respective RL module to reformulate EXPRESSION.\nOtherwise, solicits all RL modules to see if they apply and at what cost; calls each of the applicable\nmodules in order of cost, and returns the first successful result.")
    public static SubLObject try_rl_modules_with_expression(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = expression;
        SubLObject justification = NIL;
        final SubLObject focus = reformulator_datastructures.get_reformulation_focus(settings);
        final SubLObject ignore_list = reformulator_datastructures.get_ignore_rl_modules(settings);
        SubLObject rl_module_cost_pairs = NIL;
        if (NIL != focus) {
            final SubLObject rl_module = reformulator_module_harness.get_rl_module_from_store(focus);
            if (NIL != reformulator_module_harness.rl_module_applicableP(rl_module, expression, mt, settings)) {
                rl_module_cost_pairs = list(bq_cons(rl_module, ZERO_INTEGER));
            } else {
                rl_module_cost_pairs = NIL;
            }
        } else {
            SubLObject cdolist_list_var = reformulator_module_harness.rl_module_store();
            SubLObject mod = NIL;
            mod = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject rl_module2 = mod;
                final SubLObject module_name = reformulator_module_harness.rl_module_name(rl_module2);
                if ((NIL == subl_promotions.memberP(module_name, ignore_list, UNPROVIDED, UNPROVIDED)) && (NIL == member(module_name, $ignore_modules_unless_focussed$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                    final SubLObject requiredP = reformulator_module_harness.rl_module_applicableP(rl_module2, expression, mt, settings);
                    if (NIL != requiredP) {
                        final SubLObject cost = reformulator_module_harness.rl_module_cost(rl_module2, expression, mt, settings);
                        rl_module_cost_pairs = cons(cons(rl_module2, cost), rl_module_cost_pairs);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                mod = cdolist_list_var.first();
            } 
        }
        rl_module_cost_pairs = Sort.sort(rl_module_cost_pairs, symbol_function($sym23$_), symbol_function(CDR));
        if (NIL == justification) {
            SubLObject csome_list_var = rl_module_cost_pairs;
            SubLObject rl_moduleXcost = NIL;
            rl_moduleXcost = csome_list_var.first();
            while ((NIL == justification) && (NIL != csome_list_var)) {
                final SubLObject rl_module2 = rl_moduleXcost.first();
                thread.resetMultipleValues();
                final SubLObject result_$15 = reformulator_module_harness.rl_module_reformulate(rl_module2, expression, original_clause, mt, settings);
                final SubLObject justification_$16 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$15;
                justification = justification_$16;
                if (NIL != justification) {
                    if (T.eql(justification)) {
                        justification = list(reformulator_module_harness.rl_module_name(rl_module2));
                    } else
                        if (justification.isCons()) {
                            justification = cons(reformulator_module_harness.rl_module_name(rl_module2), justification);
                        } else {
                            justification = cons(reformulator_module_harness.rl_module_name(rl_module2), list(justification));
                        }

                }
                if ((NIL != $reformulator_timeout_time$.getDynamicValue(thread)) && get_internal_real_time().numG($reformulator_timeout_time$.getDynamicValue(thread))) {
                    justification = NIL;
                }
                csome_list_var = csome_list_var.rest();
                rl_moduleXcost = csome_list_var.first();
            } 
        }
        return values(result, justification);
    }/**
     * If there's a FOCUS specified then directly calls the respective RL module to reformulate EXPRESSION.
     * Otherwise, solicits all RL modules to see if they apply and at what cost; calls each of the applicable
     * modules in order of cost, and returns the first successful result.
     */


    public static final SubLObject canonicalize_reformulator_expression_cached_internal_alt(SubLObject expression, SubLObject mt, SubLObject templateP, SubLObject wff_degree) {
        return com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression(expression, mt, templateP, wff_degree, UNPROVIDED);
    }

    public static SubLObject canonicalize_reformulator_expression_cached_internal(final SubLObject expression, final SubLObject mt, final SubLObject templateP, final SubLObject wff_degree) {
        return canonicalize_reformulator_expression(expression, mt, templateP, wff_degree, UNPROVIDED);
    }

    public static final SubLObject canonicalize_reformulator_expression_cached_alt(SubLObject expression, SubLObject mt, SubLObject templateP, SubLObject wff_degree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_cached_internal(expression, mt, templateP, wff_degree);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(expression, mt, templateP, wff_degree);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (templateP.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && wff_degree.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_cached_internal(expression, mt, templateP, wff_degree)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, mt, templateP, wff_degree));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject canonicalize_reformulator_expression_cached(final SubLObject expression, final SubLObject mt, final SubLObject templateP, final SubLObject wff_degree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return canonicalize_reformulator_expression_cached_internal(expression, mt, templateP, wff_degree);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(expression, mt, templateP, wff_degree);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (templateP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && wff_degree.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(canonicalize_reformulator_expression_cached_internal(expression, mt, templateP, wff_degree)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, mt, templateP, wff_degree));
        return memoization_state.caching_results(results3);
    }

    /**
     * A special kind of canonicalizer for reformulator expressions.
     *
     * @param TEMPLATE?;
     * 		whether we are canonicalizing a reformulator template.
     * @return 0 canonical HL expression
     * @return 1 wff degree
     */
    @LispMethod(comment = "A special kind of canonicalizer for reformulator expressions.\r\n\r\n@param TEMPLATE?;\r\n\t\twhether we are canonicalizing a reformulator template.\r\n@return 0 canonical HL expression\r\n@return 1 wff degree")
    public static final SubLObject canonicalize_reformulator_expression_alt(SubLObject expression, SubLObject mt, SubLObject templateP, SubLObject wff_degree, SubLObject rule_pred) {
        if (wff_degree == UNPROVIDED) {
            wff_degree = NIL;
        }
        if (rule_pred == UNPROVIDED) {
            rule_pred = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_expression = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$add_term_of_unit_litsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$reify_skolemsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = czer_vars.$express_as_rule_macroP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
                    SubLObject _prev_bind_7 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
                    SubLObject _prev_bind_8 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
                    SubLObject _prev_bind_9 = wff_vars.$reject_sbhl_conflictsP$.currentBinding(thread);
                    try {
                        czer_vars.$expand_el_relationsP$.bind(NIL, thread);
                        czer_vars.$add_term_of_unit_litsP$.bind(NIL, thread);
                        czer_vars.$reify_skolemsP$.bind(NIL, thread);
                        czer_vars.$express_as_rule_macroP$.bind(NIL, thread);
                        czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                        czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
                        czer_vars.$robust_assertion_lookup$.bind(NIL, thread);
                        czer_vars.$robust_nart_lookup$.bind(NIL, thread);
                        czer_vars.$implicitify_universalsP$.bind(makeBoolean(NIL == templateP), thread);
                        wff_vars.$reject_sbhl_conflictsP$.bind(NIL, thread);
                        if (NIL != wff_degree) {
                            canon_expression = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_with_wff_degree(expression, mt, wff_degree, rule_pred);
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject canon_expression_17 = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_wXo_wff_degree(expression, mt, rule_pred);
                                SubLObject wff_degree_18 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                canon_expression = canon_expression_17;
                                wff_degree = wff_degree_18;
                            }
                        }
                    } finally {
                        wff_vars.$reject_sbhl_conflictsP$.rebind(_prev_bind_9, thread);
                        czer_vars.$implicitify_universalsP$.rebind(_prev_bind_8, thread);
                        czer_vars.$robust_nart_lookup$.rebind(_prev_bind_7, thread);
                        czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_6, thread);
                        czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_5, thread);
                        czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_4, thread);
                        czer_vars.$express_as_rule_macroP$.rebind(_prev_bind_3, thread);
                        czer_vars.$reify_skolemsP$.rebind(_prev_bind_2, thread);
                        czer_vars.$add_term_of_unit_litsP$.rebind(_prev_bind_1, thread);
                        czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(canon_expression, wff_degree);
            }
        }
    }

    @LispMethod(comment = "A special kind of canonicalizer for reformulator expressions.\r\n\r\n@param TEMPLATE?;\r\n\t\twhether we are canonicalizing a reformulator template.\r\n@return 0 canonical HL expression\r\n@return 1 wff degree")
    public static SubLObject canonicalize_reformulator_expression(final SubLObject expression, final SubLObject mt, final SubLObject templateP, SubLObject wff_degree, SubLObject rule_pred) {
        if (wff_degree == UNPROVIDED) {
            wff_degree = NIL;
        }
        if (rule_pred == UNPROVIDED) {
            rule_pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_expression = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$add_term_of_unit_litsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$reify_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$express_as_rule_macroP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
        final SubLObject _prev_bind_8 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
        final SubLObject _prev_bind_9 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$reject_sbhl_conflictsP$.currentBinding(thread);
        try {
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$add_term_of_unit_litsP$.bind(NIL, thread);
            czer_vars.$reify_skolemsP$.bind(NIL, thread);
            czer_vars.$express_as_rule_macroP$.bind(NIL, thread);
            czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
            czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
            czer_vars.$robust_assertion_lookup$.bind(NIL, thread);
            czer_vars.$robust_nart_lookup$.bind(NIL, thread);
            czer_vars.$implicitify_universalsP$.bind(makeBoolean(NIL == templateP), thread);
            wff_vars.$reject_sbhl_conflictsP$.bind(NIL, thread);
            if (NIL != wff_degree) {
                canon_expression = canonicalize_reformulator_expression_with_wff_degree(expression, mt, wff_degree, rule_pred);
            } else {
                thread.resetMultipleValues();
                final SubLObject canon_expression_$17 = canonicalize_reformulator_expression_wXo_wff_degree(expression, mt, rule_pred);
                final SubLObject wff_degree_$18 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_expression = canon_expression_$17;
                wff_degree = wff_degree_$18;
            }
        } finally {
            wff_vars.$reject_sbhl_conflictsP$.rebind(_prev_bind_10, thread);
            czer_vars.$implicitify_universalsP$.rebind(_prev_bind_9, thread);
            czer_vars.$robust_nart_lookup$.rebind(_prev_bind_8, thread);
            czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_7, thread);
            czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_6, thread);
            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_5, thread);
            czer_vars.$express_as_rule_macroP$.rebind(_prev_bind_4, thread);
            czer_vars.$reify_skolemsP$.rebind(_prev_bind_3, thread);
            czer_vars.$add_term_of_unit_litsP$.rebind(_prev_bind_2, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
        }
        return values(canon_expression, wff_degree);
    }/**
     * A special kind of canonicalizer for reformulator expressions.
     *
     * @param TEMPLATE?;
     * 		whether we are canonicalizing a reformulator template.
     * @return 0 canonical HL expression
     * @return 1 wff degree
     */


    /**
     * Tries to canonicalize EXPRESSION in MT with different well-formedness constraints (from the most to the least
     * constrained) and returns the result of canonicalization together with the associated well-formedness degree.
     */
    @LispMethod(comment = "Tries to canonicalize EXPRESSION in MT with different well-formedness constraints (from the most to the least\r\nconstrained) and returns the result of canonicalization together with the associated well-formedness degree.\nTries to canonicalize EXPRESSION in MT with different well-formedness constraints (from the most to the least\nconstrained) and returns the result of canonicalization together with the associated well-formedness degree.")
    public static final SubLObject canonicalize_reformulator_expression_wXo_wff_degree_alt(SubLObject expression, SubLObject mt, SubLObject rule_pred) {
        if (rule_pred == UNPROVIDED) {
            rule_pred = NIL;
        }
        {
            SubLObject wff_degree_order = list($ALL, $ARITY, $KB, $NONE);
            SubLObject wff_degree = NIL;
            SubLObject canon_expression = NIL;
            if (NIL == wff_degree) {
                {
                    SubLObject csome_list_var = wff_degree_order;
                    SubLObject each_wff_degree = NIL;
                    for (each_wff_degree = csome_list_var.first(); !((NIL != wff_degree) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , each_wff_degree = csome_list_var.first()) {
                        canon_expression = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_with_wff_degree(expression, mt, each_wff_degree, rule_pred);
                        if (NIL != canon_expression) {
                            wff_degree = each_wff_degree;
                        }
                    }
                }
            }
            return values(canon_expression, wff_degree);
        }
    }

    @LispMethod(comment = "Tries to canonicalize EXPRESSION in MT with different well-formedness constraints (from the most to the least\r\nconstrained) and returns the result of canonicalization together with the associated well-formedness degree.\nTries to canonicalize EXPRESSION in MT with different well-formedness constraints (from the most to the least\nconstrained) and returns the result of canonicalization together with the associated well-formedness degree.")
    public static SubLObject canonicalize_reformulator_expression_wXo_wff_degree(final SubLObject expression, final SubLObject mt, SubLObject rule_pred) {
        if (rule_pred == UNPROVIDED) {
            rule_pred = NIL;
        }
        final SubLObject wff_degree_order = list($ALL, $ARITY, $KB, $NONE);
        SubLObject wff_degree = NIL;
        SubLObject canon_expression = NIL;
        if (NIL == wff_degree) {
            SubLObject csome_list_var = wff_degree_order;
            SubLObject each_wff_degree = NIL;
            each_wff_degree = csome_list_var.first();
            while ((NIL == wff_degree) && (NIL != csome_list_var)) {
                canon_expression = canonicalize_reformulator_expression_with_wff_degree(expression, mt, each_wff_degree, rule_pred);
                if (NIL != canon_expression) {
                    wff_degree = each_wff_degree;
                }
                csome_list_var = csome_list_var.rest();
                each_wff_degree = csome_list_var.first();
            } 
        }
        return values(canon_expression, wff_degree);
    }/**
     * Tries to canonicalize EXPRESSION in MT with different well-formedness constraints (from the most to the least
     * constrained) and returns the result of canonicalization together with the associated well-formedness degree.
     */


    /**
     * Tries to canonicalize EXPRESSION in MT with WFF-DEGREE and returns the result of canonicalization.
     */
    @LispMethod(comment = "Tries to canonicalize EXPRESSION in MT with WFF-DEGREE and returns the result of canonicalization.")
    public static final SubLObject canonicalize_reformulator_expression_with_wff_degree_alt(SubLObject expression, SubLObject mt, SubLObject wff_degree, SubLObject rule_pred) {
        if (rule_pred == UNPROVIDED) {
            rule_pred = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_expression = NIL;
                SubLObject pcase_var = wff_degree;
                if (pcase_var.eql($NONE)) {
                    {
                        SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                        SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                        SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                        SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                        SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                        SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                        SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        SubLObject _prev_bind_11 = wff_utilities.$check_arityP$.currentBinding(thread);
                        SubLObject _prev_bind_12 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
                        try {
                            $within_assert$.bind(NIL, thread);
                            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                            wff_utilities.$check_var_typesP$.bind(NIL, thread);
                            czer_vars.$simplify_literalP$.bind(NIL, thread);
                            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            wff_vars.$validate_constantsP$.bind(NIL, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            wff_utilities.$check_arityP$.bind(NIL, thread);
                            cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
                            canon_expression = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_int(expression, mt, rule_pred);
                        } finally {
                            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_12, thread);
                            wff_utilities.$check_arityP$.rebind(_prev_bind_11, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                            wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                            czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                            wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                            $within_assert$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (pcase_var.eql($KB)) {
                        {
                            SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                            SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                            SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                            SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                            SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                            SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                            SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                            SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                            SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                            SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                            SubLObject _prev_bind_11 = wff_utilities.$check_arityP$.currentBinding(thread);
                            try {
                                $within_assert$.bind(NIL, thread);
                                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                czer_vars.$simplify_literalP$.bind(NIL, thread);
                                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                wff_vars.$validate_constantsP$.bind(NIL, thread);
                                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                wff_utilities.$check_arityP$.bind(NIL, thread);
                                canon_expression = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_int(expression, mt, rule_pred);
                            } finally {
                                wff_utilities.$check_arityP$.rebind(_prev_bind_11, thread);
                                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                                wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                                $within_assert$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (pcase_var.eql($ARITY)) {
                            {
                                SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                                SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                                SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                                SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                try {
                                    $within_assert$.bind(NIL, thread);
                                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                    canon_expression = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_int(expression, mt, rule_pred);
                                } finally {
                                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                    wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                    czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                                    $within_assert$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            if (pcase_var.eql($ALL)) {
                                {
                                    SubLObject _prev_bind_0 = czer_vars.$must_enforce_semanticsP$.currentBinding(thread);
                                    try {
                                        czer_vars.$must_enforce_semanticsP$.bind(T, thread);
                                        canon_expression = com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_int(expression, mt, rule_pred);
                                    } finally {
                                        czer_vars.$must_enforce_semanticsP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return canon_expression;
            }
        }
    }

    @LispMethod(comment = "Tries to canonicalize EXPRESSION in MT with WFF-DEGREE and returns the result of canonicalization.")
    public static SubLObject canonicalize_reformulator_expression_with_wff_degree(final SubLObject expression, final SubLObject mt, final SubLObject wff_degree, SubLObject rule_pred) {
        if (rule_pred == UNPROVIDED) {
            rule_pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_expression = NIL;
        if (wff_degree.eql($NONE)) {
            final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            final SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding(thread);
            final SubLObject _prev_bind_13 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
            try {
                $within_assert$.bind(NIL, thread);
                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                czer_vars.$simplify_literalP$.bind(NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                wff_vars.$validate_constantsP$.bind(NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                wff_utilities.$check_arityP$.bind(NIL, thread);
                cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
                canon_expression = canonicalize_reformulator_expression_int(expression, mt, rule_pred);
            } finally {
                cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_13, thread);
                wff_utilities.$check_arityP$.rebind(_prev_bind_12, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                $within_assert$.rebind(_prev_bind_0, thread);
            }
        } else
            if (wff_degree.eql($KB)) {
                final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding(thread);
                try {
                    $within_assert$.bind(NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                    wff_utilities.$check_arityP$.bind(NIL, thread);
                    canon_expression = canonicalize_reformulator_expression_int(expression, mt, rule_pred);
                } finally {
                    wff_utilities.$check_arityP$.rebind(_prev_bind_12, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    $within_assert$.rebind(_prev_bind_0, thread);
                }
            } else
                if (wff_degree.eql($ARITY)) {
                    final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        $within_assert$.bind(NIL, thread);
                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        canon_expression = canonicalize_reformulator_expression_int(expression, mt, rule_pred);
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                        wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                } else
                    if (wff_degree.eql($ALL)) {
                        final SubLObject _prev_bind_0 = czer_vars.$must_enforce_semanticsP$.currentBinding(thread);
                        try {
                            czer_vars.$must_enforce_semanticsP$.bind(T, thread);
                            canon_expression = canonicalize_reformulator_expression_int(expression, mt, rule_pred);
                        } finally {
                            czer_vars.$must_enforce_semanticsP$.rebind(_prev_bind_0, thread);
                        }
                    }



        return canon_expression;
    }/**
     * Tries to canonicalize EXPRESSION in MT with WFF-DEGREE and returns the result of canonicalization.
     */


    public static final SubLObject canonicalize_reformulator_expression_int_alt(SubLObject expression, SubLObject mt, SubLObject rule_pred) {
        if (rule_pred == UNPROVIDED) {
            rule_pred = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_expression = NIL;
                SubLObject canon_expression_and_stuff = NIL;
                SubLObject clauses_and_stuffP = NIL;
                if (NIL != rule_pred) {
                    if (NIL != genl_predicates.genl_predP(rule_pred, $$reformulatorEquals, UNPROVIDED, UNPROVIDED)) {
                        canon_expression_and_stuff = czer_main.canonicalize_term(expression, mt);
                        clauses_and_stuffP = NIL;
                    } else {
                        if (NIL != genl_predicates.genl_predP(rule_pred, $$reformulatorEquiv, UNPROVIDED, UNPROVIDED)) {
                            canon_expression_and_stuff = czer_main.canonicalize_cycl(expression, mt);
                            clauses_and_stuffP = czer_utilities.list_of_clause_binding_list_pairs_p(canon_expression_and_stuff);
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject canon_expression_and_stuff_19 = czer_main.canonicalize_expression(expression, mt, UNPROVIDED);
                                SubLObject clauses_and_stuffP_20 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                canon_expression_and_stuff = canon_expression_and_stuff_19;
                                clauses_and_stuffP = clauses_and_stuffP_20;
                            }
                        }
                    }
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_expression_and_stuff_21 = czer_main.canonicalize_expression(expression, mt, UNPROVIDED);
                        SubLObject clauses_and_stuffP_22 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_expression_and_stuff = canon_expression_and_stuff_21;
                        clauses_and_stuffP = clauses_and_stuffP_22;
                    }
                }
                if (NIL != clauses_and_stuffP) {
                    canon_expression = czer_main.sort_clauses(Mapping.mapcar(symbol_function(FIRST), canon_expression_and_stuff));
                } else {
                    canon_expression = canon_expression_and_stuff;
                }
                return canon_expression;
            }
        }
    }

    public static SubLObject canonicalize_reformulator_expression_int(final SubLObject expression, final SubLObject mt, SubLObject rule_pred) {
        if (rule_pred == UNPROVIDED) {
            rule_pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_expression = NIL;
        SubLObject canon_expression_and_stuff = NIL;
        SubLObject clauses_and_stuffP = NIL;
        if (NIL != rule_pred) {
            if (NIL != genl_predicates.genl_predP(rule_pred, $$reformulatorEquals, UNPROVIDED, UNPROVIDED)) {
                canon_expression_and_stuff = czer_main.canonicalize_term(expression, mt);
                clauses_and_stuffP = NIL;
            } else
                if (NIL != genl_predicates.genl_predP(rule_pred, $$reformulatorEquiv, UNPROVIDED, UNPROVIDED)) {
                    canon_expression_and_stuff = czer_main.canonicalize_cycl(expression, mt);
                    clauses_and_stuffP = czer_utilities.list_of_clause_binding_list_pairs_p(canon_expression_and_stuff);
                } else {
                    thread.resetMultipleValues();
                    final SubLObject canon_expression_and_stuff_$19 = czer_main.canonicalize_expression(expression, mt, UNPROVIDED);
                    final SubLObject clauses_and_stuffP_$20 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    canon_expression_and_stuff = canon_expression_and_stuff_$19;
                    clauses_and_stuffP = clauses_and_stuffP_$20;
                }

        } else {
            thread.resetMultipleValues();
            final SubLObject canon_expression_and_stuff_$20 = czer_main.canonicalize_expression(expression, mt, UNPROVIDED);
            final SubLObject clauses_and_stuffP_$21 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_expression_and_stuff = canon_expression_and_stuff_$20;
            clauses_and_stuffP = clauses_and_stuffP_$21;
        }
        if (NIL != clauses_and_stuffP) {
            canon_expression = czer_main.sort_clauses(Mapping.mapcar(symbol_function(FIRST), canon_expression_and_stuff));
        } else {
            canon_expression = canon_expression_and_stuff;
        }
        return canon_expression;
    }

    public static final SubLObject recanonicalize_rl_expression_alt(SubLObject expression, SubLObject mt) {
        return com.cyc.cycjava.cycl.reformulator_hub.canonicalize_reformulator_expression_cached(com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression_cached(expression, mt), mt, NIL, $NONE);
    }

    public static SubLObject recanonicalize_rl_expression(final SubLObject expression, final SubLObject mt) {
        return canonicalize_reformulator_expression_cached(uncanonicalize_rl_expression_cached(expression, mt), mt, NIL, $NONE);
    }

    public static final SubLObject uncanonicalize_rl_expression_cached_internal_alt(SubLObject expression, SubLObject mt) {
        return com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression(expression, mt);
    }

    public static SubLObject uncanonicalize_rl_expression_cached_internal(final SubLObject expression, final SubLObject mt) {
        return uncanonicalize_rl_expression(expression, mt);
    }

    public static final SubLObject uncanonicalize_rl_expression_cached_alt(SubLObject expression, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression_cached_internal(expression, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UNCANONICALIZE_RL_EXPRESSION_CACHED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UNCANONICALIZE_RL_EXPRESSION_CACHED, TWO_INTEGER, $int$64, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UNCANONICALIZE_RL_EXPRESSION_CACHED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(expression, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.reformulator_hub.uncanonicalize_rl_expression_cached_internal(expression, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject uncanonicalize_rl_expression_cached(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return uncanonicalize_rl_expression_cached_internal(expression, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UNCANONICALIZE_RL_EXPRESSION_CACHED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UNCANONICALIZE_RL_EXPRESSION_CACHED, TWO_INTEGER, $int$64, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, UNCANONICALIZE_RL_EXPRESSION_CACHED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(expression, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(uncanonicalize_rl_expression_cached_internal(expression, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject uncanonicalize_rl_expression_alt(SubLObject expression, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$unremove_universalsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        czer_vars.$expand_el_relationsP$.bind(NIL, thread);
                        czer_vars.$unremove_universalsP$.bind(NIL, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        if (NIL != clauses.clauses_p(expression)) {
                            result = uncanonicalizer.cnfs_el_formula(expression, mt, UNPROVIDED);
                        } else {
                            result = expression;
                        }
                        result = com.cyc.cycjava.cycl.reformulator_hub.rl_evaluatable_expressions_out(result);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        czer_vars.$unremove_universalsP$.rebind(_prev_bind_1, thread);
                        czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject uncanonicalize_rl_expression(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$unremove_universalsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$unremove_universalsP$.bind(NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (NIL != clauses.clauses_p(expression)) {
                result = uncanonicalizer.cnfs_el_formula(expression, mt, UNPROVIDED);
            } else {
                result = expression;
            }
            result = rl_evaluatable_expressions_out(result);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            czer_vars.$unremove_universalsP$.rebind(_prev_bind_2, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Performs transformations on FORMULA to remove expressions that are evaluatable at the RL.
     * Does not recursively expand evaluatable expressions.
     */
    @LispMethod(comment = "Performs transformations on FORMULA to remove expressions that are evaluatable at the RL.\r\nDoes not recursively expand evaluatable expressions.\nPerforms transformations on FORMULA to remove expressions that are evaluatable at the RL.\nDoes not recursively expand evaluatable expressions.")
    public static final SubLObject rl_evaluatable_expressions_out_alt(SubLObject formula) {
        if (NIL != cycl_utilities.expression_find_if($sym36$RL_EVALUATABLE_EXPRESSION_, formula, NIL, UNPROVIDED)) {
            return transform_list_utilities.quiescent_transform(formula, $sym36$RL_EVALUATABLE_EXPRESSION_, TRANSFORM_EVALUATION_EXPRESSION, UNPROVIDED, UNPROVIDED);
        } else {
            return formula;
        }
    }

    @LispMethod(comment = "Performs transformations on FORMULA to remove expressions that are evaluatable at the RL.\r\nDoes not recursively expand evaluatable expressions.\nPerforms transformations on FORMULA to remove expressions that are evaluatable at the RL.\nDoes not recursively expand evaluatable expressions.")
    public static SubLObject rl_evaluatable_expressions_out(final SubLObject formula) {
        if (NIL != cycl_utilities.expression_find_if($sym34$RL_EVALUATABLE_EXPRESSION_, formula, NIL, UNPROVIDED)) {
            return transform_list_utilities.quiescent_transform(formula, $sym34$RL_EVALUATABLE_EXPRESSION_, TRANSFORM_EVALUATION_EXPRESSION, UNPROVIDED, UNPROVIDED);
        }
        return formula;
    }/**
     * Performs transformations on FORMULA to remove expressions that are evaluatable at the RL.
     * Does not recursively expand evaluatable expressions.
     */


    public static final SubLObject rl_evaluatable_expressionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = makeBoolean((((NIL != el_formula_p(v_object)) && (NIL != com.cyc.cycjava.cycl.reformulator_hub.rl_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt))) && (NIL != evaluatable_el_expressionP(v_object))) && (NIL != com.cyc.cycjava.cycl.reformulator_hub.rl_evaluatable_subexpressionsP(v_object, mt)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rl_evaluatable_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            result = makeBoolean((((NIL != el_formula_p(v_object)) && (NIL != rl_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt))) && (NIL != evaluatable_el_expressionP(v_object))) && (NIL != rl_evaluatable_subexpressionsP(v_object, mt)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @unknown change to #$evaluateAtRL
     */
    @LispMethod(comment = "@unknown change to #$evaluateAtRL")
    public static final SubLObject rl_evaluatable_functorP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_object)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(v_object, $$evaluateAtEL, mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown change to #$evaluateAtRL
     */
    @LispMethod(comment = "@unknown change to #$evaluateAtRL")
    public static SubLObject rl_evaluatable_functorP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_object)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(v_object, $$evaluateAtEL, mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject rl_evaluatable_subexpressionsP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rl_evaluatableP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        rl_evaluatableP = makeBoolean(NIL == cycl_utilities.expression_find_if($sym39$RL_UNEVALUATABLE_EXPRESSION_, v_object, UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return rl_evaluatableP;
            }
        }
    }

    public static SubLObject rl_evaluatable_subexpressionsP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rl_evaluatableP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            rl_evaluatableP = makeBoolean(NIL == cycl_utilities.expression_find_if($sym37$RL_UNEVALUATABLE_EXPRESSION_, v_object, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return rl_evaluatableP;
    }

    public static final SubLObject rl_unevaluatable_expressionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != relation_evaluation.evaluatable_expressionP(v_object))) && (NIL == com.cyc.cycjava.cycl.reformulator_hub.rl_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt)));
    }

    public static SubLObject rl_unevaluatable_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != relation_evaluation.evaluatable_expressionP(v_object))) && (NIL == rl_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt)));
    }

    public static final SubLObject hl_formula_for_reformulator_rule_alt(SubLObject rr) {
        {
            SubLObject assertion_for_rule = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
            SubLObject hl_formula = NIL;
            if (NIL != assertion_for_rule) {
                hl_formula = fi.assertion_hl_formula(assertion_for_rule, UNPROVIDED);
            }
            return hl_formula;
        }
    }

    public static SubLObject hl_formula_for_reformulator_rule(final SubLObject rr) {
        final SubLObject assertion_for_rule = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
        SubLObject hl_formula = NIL;
        if (NIL != assertion_for_rule) {
            hl_formula = fi.assertion_hl_formula(assertion_for_rule, UNPROVIDED);
        }
        return hl_formula;
    }

    public static final SubLObject reformulator_template_mentions_fortP_alt(SubLObject rt, SubLObject fort) {
        return list_utilities.sublisp_boolean(find(fort, reformulator_rule_unifier_datastructures.reformulator_template_forts(rt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject reformulator_template_mentions_fortP(final SubLObject rt, final SubLObject fort) {
        return list_utilities.sublisp_boolean(find(fort, reformulator_rule_unifier_datastructures.reformulator_template_forts(rt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject reformulator_rule_mentions_fortP_alt(SubLObject rr, SubLObject fort) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.reformulator_hub.reformulator_template_mentions_fortP(reformulator_rule_unifier_datastructures.reformulator_rule_first_rt(rr), fort)) || (NIL != com.cyc.cycjava.cycl.reformulator_hub.reformulator_template_mentions_fortP(reformulator_rule_unifier_datastructures.reformulator_rule_second_rt(rr), fort)));
    }

    public static SubLObject reformulator_rule_mentions_fortP(final SubLObject rr, final SubLObject fort) {
        return makeBoolean((NIL != reformulator_template_mentions_fortP(reformulator_rule_unifier_datastructures.reformulator_rule_first_rt(rr), fort)) || (NIL != reformulator_template_mentions_fortP(reformulator_rule_unifier_datastructures.reformulator_rule_second_rt(rr), fort)));
    }

    public static final SubLObject reformulator_rules_mentioning_fort_alt(SubLObject fort) {
        if (NIL == reformulator_datastructures.reformulator_initializedP()) {
            return NIL;
        }
        return append(gethash(fort, reformulator_rule_unifier_datastructures.constant_reformulator_rule_table(), UNPROVIDED), gethash(fort, reformulator_rule_unifier_datastructures.nart_reformulator_rule_table(), UNPROVIDED), gethash(fort, reformulator_rule_unifier_datastructures.fort_reformulator_rule_table(), UNPROVIDED));
    }

    public static SubLObject reformulator_rules_mentioning_fort(final SubLObject fort) {
        if (NIL == reformulator_datastructures.reformulator_initializedP()) {
            return NIL;
        }
        return append(gethash(fort, reformulator_rule_unifier_datastructures.constant_reformulator_rule_table(), UNPROVIDED), gethash(fort, reformulator_rule_unifier_datastructures.nart_reformulator_rule_table(), UNPROVIDED), gethash(fort, reformulator_rule_unifier_datastructures.fort_reformulator_rule_table(), UNPROVIDED));
    }

    /**
     * For each well-formedness category, prints the number of reformulator rules whose well-formedness levels
     * match the category in question.
     */
    @LispMethod(comment = "For each well-formedness category, prints the number of reformulator rules whose well-formedness levels\r\nmatch the category in question.\nFor each well-formedness category, prints the number of reformulator rules whose well-formedness levels\nmatch the category in question.")
    public static final SubLObject print_wff_reformulator_rules_alt() {
        if (NIL == reformulator_datastructures.reformulator_initializedP()) {
            return NIL;
        }
        {
            SubLObject no_all = ZERO_INTEGER;
            SubLObject no_arity = ZERO_INTEGER;
            SubLObject no_kb = ZERO_INTEGER;
            SubLObject no_none = ZERO_INTEGER;
            SubLObject cdohash_table = reformulator_rule_unifier_datastructures.reformulator_rules();
            SubLObject key = NIL;
            SubLObject rr = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        rr = getEntryValue(cdohash_entry);
                        {
                            SubLObject rule_wff = reformulator_rule_unifier_datastructures.reformulator_rule_wff_degree(rr);
                            SubLObject pcase_var = rule_wff;
                            if (pcase_var.eql($ALL)) {
                                no_all = add(no_all, ONE_INTEGER);
                            } else {
                                if (pcase_var.eql($ARITY)) {
                                    no_arity = add(no_arity, ONE_INTEGER);
                                } else {
                                    if (pcase_var.eql($KB)) {
                                        no_kb = add(no_kb, ONE_INTEGER);
                                    } else {
                                        if (pcase_var.eql($NONE)) {
                                            no_none = add(no_none, ONE_INTEGER);
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
            format(T, $str_alt40$All___s__Arity___s__KB___s__None_, new SubLObject[]{ no_all, no_arity, no_kb, no_none });
            return NIL;
        }
    }

    @LispMethod(comment = "For each well-formedness category, prints the number of reformulator rules whose well-formedness levels\r\nmatch the category in question.\nFor each well-formedness category, prints the number of reformulator rules whose well-formedness levels\nmatch the category in question.")
    public static SubLObject print_wff_reformulator_rules() {
        if (NIL == reformulator_datastructures.reformulator_initializedP()) {
            return NIL;
        }
        SubLObject no_all = ZERO_INTEGER;
        SubLObject no_arity = ZERO_INTEGER;
        SubLObject no_kb = ZERO_INTEGER;
        SubLObject no_none = ZERO_INTEGER;
        final SubLObject cdohash_table = reformulator_rule_unifier_datastructures.reformulator_rules();
        SubLObject key = NIL;
        SubLObject rr = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                rr = getEntryValue(cdohash_entry);
                final SubLObject pcase_var;
                final SubLObject rule_wff = pcase_var = reformulator_rule_unifier_datastructures.reformulator_rule_wff_degree(rr);
                if (pcase_var.eql($ALL)) {
                    no_all = add(no_all, ONE_INTEGER);
                } else
                    if (pcase_var.eql($ARITY)) {
                        no_arity = add(no_arity, ONE_INTEGER);
                    } else
                        if (pcase_var.eql($KB)) {
                            no_kb = add(no_kb, ONE_INTEGER);
                        } else {
                            if (!pcase_var.eql($NONE)) {
                                continue;
                            }
                            no_none = add(no_none, ONE_INTEGER);
                        }


            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        format(T, $str38$All___s__Arity___s__KB___s__None_, new SubLObject[]{ no_all, no_arity, no_kb, no_none });
        return NIL;
    }/**
     * For each well-formedness category, prints the number of reformulator rules whose well-formedness levels
     * match the category in question.
     */


    /**
     * Computes the average number of forts mentioned in reformulator rules --
     * useful to determine an estimate size for the reformulator hash tables.
     */
    @LispMethod(comment = "Computes the average number of forts mentioned in reformulator rules --\r\nuseful to determine an estimate size for the reformulator hash tables.\nComputes the average number of forts mentioned in reformulator rules --\nuseful to determine an estimate size for the reformulator hash tables.")
    public static final SubLObject compute_average_number_of_forts_mentioned_in_reformulator_rules_alt() {
        if (NIL == reformulator_datastructures.reformulator_initializedP()) {
            return NIL;
        }
        {
            SubLObject num_rules = ZERO_INTEGER;
            SubLObject num_forts = ZERO_INTEGER;
            SubLObject cdohash_table = reformulator_rule_unifier_datastructures.reformulator_rules();
            SubLObject key = NIL;
            SubLObject rr = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        rr = getEntryValue(cdohash_entry);
                        num_rules = add(num_rules, ONE_INTEGER);
                        num_forts = add(num_forts, length(reformulator_rule_unifier_datastructures.reformulator_rule_forts(rr)));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            format(T, $str_alt41$Average_number_of_FORTs_mentioned, divide(num_forts, num_rules));
        }
        return NIL;
    }

    @LispMethod(comment = "Computes the average number of forts mentioned in reformulator rules --\r\nuseful to determine an estimate size for the reformulator hash tables.\nComputes the average number of forts mentioned in reformulator rules --\nuseful to determine an estimate size for the reformulator hash tables.")
    public static SubLObject compute_average_number_of_forts_mentioned_in_reformulator_rules() {
        if (NIL == reformulator_datastructures.reformulator_initializedP()) {
            return NIL;
        }
        SubLObject num_rules = ZERO_INTEGER;
        SubLObject num_forts = ZERO_INTEGER;
        final SubLObject cdohash_table = reformulator_rule_unifier_datastructures.reformulator_rules();
        SubLObject key = NIL;
        SubLObject rr = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                rr = getEntryValue(cdohash_entry);
                num_rules = add(num_rules, ONE_INTEGER);
                num_forts = add(num_forts, length(reformulator_rule_unifier_datastructures.reformulator_rule_forts(rr)));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        format(T, $str39$Average_number_of_FORTs_mentioned, divide(num_forts, num_rules));
        return NIL;
    }/**
     * Computes the average number of forts mentioned in reformulator rules --
     * useful to determine an estimate size for the reformulator hash tables.
     */


    public static final SubLObject declare_reformulator_hub_file_alt() {
        declareFunction("reformulate_cycl", "REFORMULATE-CYCL", 1, 2, false);
        declareFunction("reformulate_atoms_criterion_metP", "REFORMULATE-ATOMS-CRITERION-MET?", 2, 0, false);
        declareFunction("reformulator_timeout_time", "REFORMULATOR-TIMEOUT-TIME", 1, 0, false);
        declareFunction("reformulate_cycl_int", "REFORMULATE-CYCL-INT", 3, 0, false);
        declareFunction("eliminate_transitivity_in_reformulation_history", "ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY", 1, 0, false);
        declareFunction("reformulator_subst", "REFORMULATOR-SUBST", 4, 0, false);
        declareFunction("clear_all_kb_modal_operators", "CLEAR-ALL-KB-MODAL-OPERATORS", 0, 0, false);
        declareFunction("remove_all_kb_modal_operators", "REMOVE-ALL-KB-MODAL-OPERATORS", 0, 0, false);
        declareFunction("all_kb_modal_operators_internal", "ALL-KB-MODAL-OPERATORS-INTERNAL", 0, 0, false);
        declareFunction("all_kb_modal_operators", "ALL-KB-MODAL-OPERATORS", 0, 0, false);
        declareFunction("possible_modal", "POSSIBLE-MODAL", 1, 0, false);
        declareFunction("rl_clauses_merge_subst", "RL-CLAUSES-MERGE-SUBST", 4, 0, false);
        declareFunction("nested_rl_expression_subst", "NESTED-RL-EXPRESSION-SUBST", 4, 0, false);
        declareFunction("contains_old_rlP", "CONTAINS-OLD-RL?", 1, 0, false);
        declareFunction("subst_new_rl", "SUBST-NEW-RL", 1, 0, false);
        declareFunction("construct_reformulation_step", "CONSTRUCT-REFORMULATION-STEP", 3, 0, false);
        declareFunction("reformulation_step_struct_expression", "REFORMULATION-STEP-STRUCT-EXPRESSION", 1, 0, false);
        declareFunction("reformulation_step_struct_result", "REFORMULATION-STEP-STRUCT-RESULT", 1, 0, false);
        declareFunction("reformulation_step_struct_justification", "REFORMULATION-STEP-STRUCT-JUSTIFICATION", 1, 0, false);
        declareFunction("ref_warn", "REF-WARN", 2, 5, false);
        declareFunction("reformulate_expression_internal", "REFORMULATE-EXPRESSION-INTERNAL", 6, 0, false);
        declareFunction("reformulate_expression", "REFORMULATE-EXPRESSION", 6, 0, false);
        declareFunction("reformulate_cycl_apply_first_recursively", "REFORMULATE-CYCL-APPLY-FIRST-RECURSIVELY", 6, 0, false);
        declareFunction("map_reformulate_cycl", "MAP-REFORMULATE-CYCL", 4, 0, false);
        declareFunction("map_reformulate_expression", "MAP-REFORMULATE-EXPRESSION", 4, 0, false);
        declareFunction("try_rl_modules_with_expression", "TRY-RL-MODULES-WITH-EXPRESSION", 4, 0, false);
        declareFunction("canonicalize_reformulator_expression_cached_internal", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED-INTERNAL", 4, 0, false);
        declareFunction("canonicalize_reformulator_expression_cached", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED", 4, 0, false);
        declareFunction("canonicalize_reformulator_expression", "CANONICALIZE-REFORMULATOR-EXPRESSION", 3, 2, false);
        declareFunction("canonicalize_reformulator_expression_wXo_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-W/O-WFF-DEGREE", 2, 1, false);
        declareFunction("canonicalize_reformulator_expression_with_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-WITH-WFF-DEGREE", 3, 1, false);
        declareFunction("canonicalize_reformulator_expression_int", "CANONICALIZE-REFORMULATOR-EXPRESSION-INT", 2, 1, false);
        declareFunction("recanonicalize_rl_expression", "RECANONICALIZE-RL-EXPRESSION", 2, 0, false);
        declareFunction("uncanonicalize_rl_expression_cached_internal", "UNCANONICALIZE-RL-EXPRESSION-CACHED-INTERNAL", 2, 0, false);
        declareFunction("uncanonicalize_rl_expression_cached", "UNCANONICALIZE-RL-EXPRESSION-CACHED", 2, 0, false);
        declareFunction("uncanonicalize_rl_expression", "UNCANONICALIZE-RL-EXPRESSION", 2, 0, false);
        declareFunction("rl_evaluatable_expressions_out", "RL-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        declareFunction("rl_evaluatable_expressionP", "RL-EVALUATABLE-EXPRESSION?", 1, 1, false);
        declareFunction("rl_evaluatable_functorP", "RL-EVALUATABLE-FUNCTOR?", 1, 1, false);
        declareFunction("rl_evaluatable_subexpressionsP", "RL-EVALUATABLE-SUBEXPRESSIONS?", 1, 1, false);
        declareFunction("rl_unevaluatable_expressionP", "RL-UNEVALUATABLE-EXPRESSION?", 1, 1, false);
        declareFunction("hl_formula_for_reformulator_rule", "HL-FORMULA-FOR-REFORMULATOR-RULE", 1, 0, false);
        declareFunction("reformulator_template_mentions_fortP", "REFORMULATOR-TEMPLATE-MENTIONS-FORT?", 2, 0, false);
        declareFunction("reformulator_rule_mentions_fortP", "REFORMULATOR-RULE-MENTIONS-FORT?", 2, 0, false);
        declareFunction("reformulator_rules_mentioning_fort", "REFORMULATOR-RULES-MENTIONING-FORT", 1, 0, false);
        declareFunction("print_wff_reformulator_rules", "PRINT-WFF-REFORMULATOR-RULES", 0, 0, false);
        declareFunction("compute_average_number_of_forts_mentioned_in_reformulator_rules", "COMPUTE-AVERAGE-NUMBER-OF-FORTS-MENTIONED-IN-REFORMULATOR-RULES", 0, 0, false);
        declareFunction("get_update_original_clause_recursively_mt", "GET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-MT", 1, 0, false);
        declareFunction("set_update_original_clause_recursively_mt", "SET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-MT", 2, 0, false);
        declareFunction("get_update_original_clause_recursively_out_cycl", "GET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-OUT-CYCL", 1, 0, false);
        declareFunction("set_update_original_clause_recursively_out_cycl", "SET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-OUT-CYCL", 2, 0, false);
        declareFunction("get_update_original_clause_recursively_in_cycl", "GET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-IN-CYCL", 1, 0, false);
        declareFunction("set_update_original_clause_recursively_in_cycl", "SET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_update_original_clause_recursively_class", "SUBLOOP-RESERVED-INITIALIZE-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_update_original_clause_recursively_instance", "SUBLOOP-RESERVED-INITIALIZE-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-INSTANCE", 1, 0, false);
        declareFunction("update_original_clause_recursively_p", "UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-P", 1, 0, false);
        declareFunction("get_gingerly_reformulate_in_modals_mt", "GET-GINGERLY-REFORMULATE-IN-MODALS-MT", 1, 0, false);
        declareFunction("set_gingerly_reformulate_in_modals_mt", "SET-GINGERLY-REFORMULATE-IN-MODALS-MT", 2, 0, false);
        declareFunction("get_gingerly_reformulate_in_modals_out_cycl", "GET-GINGERLY-REFORMULATE-IN-MODALS-OUT-CYCL", 1, 0, false);
        declareFunction("set_gingerly_reformulate_in_modals_out_cycl", "SET-GINGERLY-REFORMULATE-IN-MODALS-OUT-CYCL", 2, 0, false);
        declareFunction("get_gingerly_reformulate_in_modals_in_cycl", "GET-GINGERLY-REFORMULATE-IN-MODALS-IN-CYCL", 1, 0, false);
        declareFunction("set_gingerly_reformulate_in_modals_in_cycl", "SET-GINGERLY-REFORMULATE-IN-MODALS-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_gingerly_reformulate_in_modals_class", "SUBLOOP-RESERVED-INITIALIZE-GINGERLY-REFORMULATE-IN-MODALS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_gingerly_reformulate_in_modals_instance", "SUBLOOP-RESERVED-INITIALIZE-GINGERLY-REFORMULATE-IN-MODALS-INSTANCE", 1, 0, false);
        declareFunction("gingerly_reformulate_in_modals_p", "GINGERLY-REFORMULATE-IN-MODALS-P", 1, 0, false);
        declareFunction("get_substitute_rl_expression_mt", "GET-SUBSTITUTE-RL-EXPRESSION-MT", 1, 0, false);
        declareFunction("set_substitute_rl_expression_mt", "SET-SUBSTITUTE-RL-EXPRESSION-MT", 2, 0, false);
        declareFunction("get_substitute_rl_expression_out_formula", "GET-SUBSTITUTE-RL-EXPRESSION-OUT-FORMULA", 1, 0, false);
        declareFunction("set_substitute_rl_expression_out_formula", "SET-SUBSTITUTE-RL-EXPRESSION-OUT-FORMULA", 2, 0, false);
        declareFunction("get_substitute_rl_expression_formula", "GET-SUBSTITUTE-RL-EXPRESSION-FORMULA", 1, 0, false);
        declareFunction("set_substitute_rl_expression_formula", "SET-SUBSTITUTE-RL-EXPRESSION-FORMULA", 2, 0, false);
        declareFunction("get_substitute_rl_expression_old_subformula", "GET-SUBSTITUTE-RL-EXPRESSION-OLD-SUBFORMULA", 1, 0, false);
        declareFunction("set_substitute_rl_expression_old_subformula", "SET-SUBSTITUTE-RL-EXPRESSION-OLD-SUBFORMULA", 2, 0, false);
        declareFunction("get_substitute_rl_expression_new_expr", "GET-SUBSTITUTE-RL-EXPRESSION-NEW-EXPR", 1, 0, false);
        declareFunction("set_substitute_rl_expression_new_expr", "SET-SUBSTITUTE-RL-EXPRESSION-NEW-EXPR", 2, 0, false);
        declareFunction("subloop_reserved_initialize_substitute_rl_expression_class", "SUBLOOP-RESERVED-INITIALIZE-SUBSTITUTE-RL-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_substitute_rl_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBSTITUTE-RL-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("substitute_rl_expression_p", "SUBSTITUTE-RL-EXPRESSION-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_reformulator_hub_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("reformulate_cycl", "REFORMULATE-CYCL", 1, 2, false);
            declareFunction("reformulate_atoms_criterion_metP", "REFORMULATE-ATOMS-CRITERION-MET?", 2, 0, false);
            declareFunction("reformulator_timeout_time", "REFORMULATOR-TIMEOUT-TIME", 1, 0, false);
            declareFunction("reformulate_cycl_int", "REFORMULATE-CYCL-INT", 3, 0, false);
            declareFunction("eliminate_transitivity_in_reformulation_history", "ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY", 1, 0, false);
            declareFunction("reformulator_subst", "REFORMULATOR-SUBST", 4, 0, false);
            declareFunction("clear_all_kb_modal_operators", "CLEAR-ALL-KB-MODAL-OPERATORS", 0, 0, false);
            declareFunction("remove_all_kb_modal_operators", "REMOVE-ALL-KB-MODAL-OPERATORS", 0, 0, false);
            declareFunction("all_kb_modal_operators_internal", "ALL-KB-MODAL-OPERATORS-INTERNAL", 0, 0, false);
            declareFunction("all_kb_modal_operators", "ALL-KB-MODAL-OPERATORS", 0, 0, false);
            declareFunction("possible_modal", "POSSIBLE-MODAL", 1, 0, false);
            declareFunction("rl_clauses_merge_subst", "RL-CLAUSES-MERGE-SUBST", 4, 0, false);
            declareFunction("nested_rl_expression_subst", "NESTED-RL-EXPRESSION-SUBST", 4, 0, false);
            declareFunction("contains_old_rlP", "CONTAINS-OLD-RL?", 1, 0, false);
            declareFunction("subst_new_rl", "SUBST-NEW-RL", 1, 0, false);
            declareFunction("construct_reformulation_step", "CONSTRUCT-REFORMULATION-STEP", 3, 0, false);
            declareFunction("reformulation_step_struct_expression", "REFORMULATION-STEP-STRUCT-EXPRESSION", 1, 0, false);
            declareFunction("reformulation_step_struct_result", "REFORMULATION-STEP-STRUCT-RESULT", 1, 0, false);
            declareFunction("reformulation_step_struct_justification", "REFORMULATION-STEP-STRUCT-JUSTIFICATION", 1, 0, false);
            declareFunction("ref_warn", "REF-WARN", 2, 5, false);
            declareFunction("reformulate_expression_internal", "REFORMULATE-EXPRESSION-INTERNAL", 6, 0, false);
            declareFunction("reformulate_expression", "REFORMULATE-EXPRESSION", 6, 0, false);
            declareFunction("reformulate_cycl_apply_first_recursively", "REFORMULATE-CYCL-APPLY-FIRST-RECURSIVELY", 6, 0, false);
            declareFunction("map_reformulate_cycl", "MAP-REFORMULATE-CYCL", 4, 0, false);
            declareFunction("map_reformulate_expression", "MAP-REFORMULATE-EXPRESSION", 4, 0, false);
            declareFunction("try_rl_modules_with_expression", "TRY-RL-MODULES-WITH-EXPRESSION", 4, 0, false);
            declareFunction("canonicalize_reformulator_expression_cached_internal", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED-INTERNAL", 4, 0, false);
            declareFunction("canonicalize_reformulator_expression_cached", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED", 4, 0, false);
            declareFunction("canonicalize_reformulator_expression", "CANONICALIZE-REFORMULATOR-EXPRESSION", 3, 2, false);
            declareFunction("canonicalize_reformulator_expression_wXo_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-W/O-WFF-DEGREE", 2, 1, false);
            declareFunction("canonicalize_reformulator_expression_with_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-WITH-WFF-DEGREE", 3, 1, false);
            declareFunction("canonicalize_reformulator_expression_int", "CANONICALIZE-REFORMULATOR-EXPRESSION-INT", 2, 1, false);
            declareFunction("recanonicalize_rl_expression", "RECANONICALIZE-RL-EXPRESSION", 2, 0, false);
            declareFunction("uncanonicalize_rl_expression_cached_internal", "UNCANONICALIZE-RL-EXPRESSION-CACHED-INTERNAL", 2, 0, false);
            declareFunction("uncanonicalize_rl_expression_cached", "UNCANONICALIZE-RL-EXPRESSION-CACHED", 2, 0, false);
            declareFunction("uncanonicalize_rl_expression", "UNCANONICALIZE-RL-EXPRESSION", 2, 0, false);
            declareFunction("rl_evaluatable_expressions_out", "RL-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
            declareFunction("rl_evaluatable_expressionP", "RL-EVALUATABLE-EXPRESSION?", 1, 1, false);
            declareFunction("rl_evaluatable_functorP", "RL-EVALUATABLE-FUNCTOR?", 1, 1, false);
            declareFunction("rl_evaluatable_subexpressionsP", "RL-EVALUATABLE-SUBEXPRESSIONS?", 1, 1, false);
            declareFunction("rl_unevaluatable_expressionP", "RL-UNEVALUATABLE-EXPRESSION?", 1, 1, false);
            declareFunction("hl_formula_for_reformulator_rule", "HL-FORMULA-FOR-REFORMULATOR-RULE", 1, 0, false);
            declareFunction("reformulator_template_mentions_fortP", "REFORMULATOR-TEMPLATE-MENTIONS-FORT?", 2, 0, false);
            declareFunction("reformulator_rule_mentions_fortP", "REFORMULATOR-RULE-MENTIONS-FORT?", 2, 0, false);
            declareFunction("reformulator_rules_mentioning_fort", "REFORMULATOR-RULES-MENTIONING-FORT", 1, 0, false);
            declareFunction("print_wff_reformulator_rules", "PRINT-WFF-REFORMULATOR-RULES", 0, 0, false);
            declareFunction("compute_average_number_of_forts_mentioned_in_reformulator_rules", "COMPUTE-AVERAGE-NUMBER-OF-FORTS-MENTIONED-IN-REFORMULATOR-RULES", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_update_original_clause_recursively_mt", "GET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-MT", 1, 0, false);
            declareFunction("set_update_original_clause_recursively_mt", "SET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-MT", 2, 0, false);
            declareFunction("get_update_original_clause_recursively_out_cycl", "GET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-OUT-CYCL", 1, 0, false);
            declareFunction("set_update_original_clause_recursively_out_cycl", "SET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-OUT-CYCL", 2, 0, false);
            declareFunction("get_update_original_clause_recursively_in_cycl", "GET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-IN-CYCL", 1, 0, false);
            declareFunction("set_update_original_clause_recursively_in_cycl", "SET-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_update_original_clause_recursively_class", "SUBLOOP-RESERVED-INITIALIZE-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_update_original_clause_recursively_instance", "SUBLOOP-RESERVED-INITIALIZE-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-INSTANCE", 1, 0, false);
            declareFunction("update_original_clause_recursively_p", "UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-P", 1, 0, false);
            declareFunction("get_gingerly_reformulate_in_modals_mt", "GET-GINGERLY-REFORMULATE-IN-MODALS-MT", 1, 0, false);
            declareFunction("set_gingerly_reformulate_in_modals_mt", "SET-GINGERLY-REFORMULATE-IN-MODALS-MT", 2, 0, false);
            declareFunction("get_gingerly_reformulate_in_modals_out_cycl", "GET-GINGERLY-REFORMULATE-IN-MODALS-OUT-CYCL", 1, 0, false);
            declareFunction("set_gingerly_reformulate_in_modals_out_cycl", "SET-GINGERLY-REFORMULATE-IN-MODALS-OUT-CYCL", 2, 0, false);
            declareFunction("get_gingerly_reformulate_in_modals_in_cycl", "GET-GINGERLY-REFORMULATE-IN-MODALS-IN-CYCL", 1, 0, false);
            declareFunction("set_gingerly_reformulate_in_modals_in_cycl", "SET-GINGERLY-REFORMULATE-IN-MODALS-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_gingerly_reformulate_in_modals_class", "SUBLOOP-RESERVED-INITIALIZE-GINGERLY-REFORMULATE-IN-MODALS-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_gingerly_reformulate_in_modals_instance", "SUBLOOP-RESERVED-INITIALIZE-GINGERLY-REFORMULATE-IN-MODALS-INSTANCE", 1, 0, false);
            declareFunction("gingerly_reformulate_in_modals_p", "GINGERLY-REFORMULATE-IN-MODALS-P", 1, 0, false);
            declareFunction("get_substitute_rl_expression_mt", "GET-SUBSTITUTE-RL-EXPRESSION-MT", 1, 0, false);
            declareFunction("set_substitute_rl_expression_mt", "SET-SUBSTITUTE-RL-EXPRESSION-MT", 2, 0, false);
            declareFunction("get_substitute_rl_expression_out_formula", "GET-SUBSTITUTE-RL-EXPRESSION-OUT-FORMULA", 1, 0, false);
            declareFunction("set_substitute_rl_expression_out_formula", "SET-SUBSTITUTE-RL-EXPRESSION-OUT-FORMULA", 2, 0, false);
            declareFunction("get_substitute_rl_expression_formula", "GET-SUBSTITUTE-RL-EXPRESSION-FORMULA", 1, 0, false);
            declareFunction("set_substitute_rl_expression_formula", "SET-SUBSTITUTE-RL-EXPRESSION-FORMULA", 2, 0, false);
            declareFunction("get_substitute_rl_expression_old_subformula", "GET-SUBSTITUTE-RL-EXPRESSION-OLD-SUBFORMULA", 1, 0, false);
            declareFunction("set_substitute_rl_expression_old_subformula", "SET-SUBSTITUTE-RL-EXPRESSION-OLD-SUBFORMULA", 2, 0, false);
            declareFunction("get_substitute_rl_expression_new_expr", "GET-SUBSTITUTE-RL-EXPRESSION-NEW-EXPR", 1, 0, false);
            declareFunction("set_substitute_rl_expression_new_expr", "SET-SUBSTITUTE-RL-EXPRESSION-NEW-EXPR", 2, 0, false);
            declareFunction("subloop_reserved_initialize_substitute_rl_expression_class", "SUBLOOP-RESERVED-INITIALIZE-SUBSTITUTE-RL-EXPRESSION-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_substitute_rl_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBSTITUTE-RL-EXPRESSION-INSTANCE", 1, 0, false);
            declareFunction("substitute_rl_expression_p", "SUBSTITUTE-RL-EXPRESSION-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_reformulator_hub_file_Previous() {
        declareFunction("reformulate_cycl", "REFORMULATE-CYCL", 1, 2, false);
        declareFunction("reformulate_atoms_criterion_metP", "REFORMULATE-ATOMS-CRITERION-MET?", 2, 0, false);
        declareFunction("reformulator_timeout_time", "REFORMULATOR-TIMEOUT-TIME", 1, 0, false);
        declareFunction("reformulate_cycl_int", "REFORMULATE-CYCL-INT", 3, 0, false);
        declareFunction("eliminate_transitivity_in_reformulation_history", "ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY", 1, 0, false);
        declareFunction("reformulator_subst", "REFORMULATOR-SUBST", 4, 0, false);
        declareFunction("clear_all_kb_modal_operators", "CLEAR-ALL-KB-MODAL-OPERATORS", 0, 0, false);
        declareFunction("remove_all_kb_modal_operators", "REMOVE-ALL-KB-MODAL-OPERATORS", 0, 0, false);
        declareFunction("all_kb_modal_operators_internal", "ALL-KB-MODAL-OPERATORS-INTERNAL", 0, 0, false);
        declareFunction("all_kb_modal_operators", "ALL-KB-MODAL-OPERATORS", 0, 0, false);
        declareFunction("possible_modal", "POSSIBLE-MODAL", 1, 0, false);
        declareFunction("rl_clauses_merge_subst", "RL-CLAUSES-MERGE-SUBST", 4, 0, false);
        declareFunction("nested_rl_expression_subst", "NESTED-RL-EXPRESSION-SUBST", 4, 0, false);
        declareFunction("contains_old_rlP", "CONTAINS-OLD-RL?", 1, 0, false);
        declareFunction("subst_new_rl", "SUBST-NEW-RL", 1, 0, false);
        declareFunction("construct_reformulation_step", "CONSTRUCT-REFORMULATION-STEP", 3, 0, false);
        declareFunction("reformulation_step_struct_expression", "REFORMULATION-STEP-STRUCT-EXPRESSION", 1, 0, false);
        declareFunction("reformulation_step_struct_result", "REFORMULATION-STEP-STRUCT-RESULT", 1, 0, false);
        declareFunction("reformulation_step_struct_justification", "REFORMULATION-STEP-STRUCT-JUSTIFICATION", 1, 0, false);
        declareFunction("ref_warn", "REF-WARN", 2, 5, false);
        declareFunction("reformulate_expression_internal", "REFORMULATE-EXPRESSION-INTERNAL", 6, 0, false);
        declareFunction("reformulate_expression", "REFORMULATE-EXPRESSION", 6, 0, false);
        declareFunction("reformulate_cycl_apply_first_recursively", "REFORMULATE-CYCL-APPLY-FIRST-RECURSIVELY", 6, 0, false);
        declareFunction("map_reformulate_cycl", "MAP-REFORMULATE-CYCL", 4, 0, false);
        declareFunction("map_reformulate_expression", "MAP-REFORMULATE-EXPRESSION", 4, 0, false);
        declareFunction("try_rl_modules_with_expression", "TRY-RL-MODULES-WITH-EXPRESSION", 4, 0, false);
        declareFunction("canonicalize_reformulator_expression_cached_internal", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED-INTERNAL", 4, 0, false);
        declareFunction("canonicalize_reformulator_expression_cached", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED", 4, 0, false);
        declareFunction("canonicalize_reformulator_expression", "CANONICALIZE-REFORMULATOR-EXPRESSION", 3, 2, false);
        declareFunction("canonicalize_reformulator_expression_wXo_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-W/O-WFF-DEGREE", 2, 1, false);
        declareFunction("canonicalize_reformulator_expression_with_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-WITH-WFF-DEGREE", 3, 1, false);
        declareFunction("canonicalize_reformulator_expression_int", "CANONICALIZE-REFORMULATOR-EXPRESSION-INT", 2, 1, false);
        declareFunction("recanonicalize_rl_expression", "RECANONICALIZE-RL-EXPRESSION", 2, 0, false);
        declareFunction("uncanonicalize_rl_expression_cached_internal", "UNCANONICALIZE-RL-EXPRESSION-CACHED-INTERNAL", 2, 0, false);
        declareFunction("uncanonicalize_rl_expression_cached", "UNCANONICALIZE-RL-EXPRESSION-CACHED", 2, 0, false);
        declareFunction("uncanonicalize_rl_expression", "UNCANONICALIZE-RL-EXPRESSION", 2, 0, false);
        declareFunction("rl_evaluatable_expressions_out", "RL-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        declareFunction("rl_evaluatable_expressionP", "RL-EVALUATABLE-EXPRESSION?", 1, 1, false);
        declareFunction("rl_evaluatable_functorP", "RL-EVALUATABLE-FUNCTOR?", 1, 1, false);
        declareFunction("rl_evaluatable_subexpressionsP", "RL-EVALUATABLE-SUBEXPRESSIONS?", 1, 1, false);
        declareFunction("rl_unevaluatable_expressionP", "RL-UNEVALUATABLE-EXPRESSION?", 1, 1, false);
        declareFunction("hl_formula_for_reformulator_rule", "HL-FORMULA-FOR-REFORMULATOR-RULE", 1, 0, false);
        declareFunction("reformulator_template_mentions_fortP", "REFORMULATOR-TEMPLATE-MENTIONS-FORT?", 2, 0, false);
        declareFunction("reformulator_rule_mentions_fortP", "REFORMULATOR-RULE-MENTIONS-FORT?", 2, 0, false);
        declareFunction("reformulator_rules_mentioning_fort", "REFORMULATOR-RULES-MENTIONING-FORT", 1, 0, false);
        declareFunction("print_wff_reformulator_rules", "PRINT-WFF-REFORMULATOR-RULES", 0, 0, false);
        declareFunction("compute_average_number_of_forts_mentioned_in_reformulator_rules", "COMPUTE-AVERAGE-NUMBER-OF-FORTS-MENTIONED-IN-REFORMULATOR-RULES", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_reformulator_hub_file_alt() {
        defparameter("*REFORMULATOR-TIMEOUT-TIME*", NIL);
        deflexical("*ALL-KB-MODAL-OPERATORS-CACHING-STATE*", NIL);
        defparameter("*RL-MT*", mt_vars.$default_ask_mt$.getGlobalValue());
        defparameter("*RL-OLD*", NIL);
        defparameter("*RL-NEW*", NIL);
        defparameter("*REF-TRACE-LEVEL*", ONE_INTEGER);
        deflexical("*IGNORE-MODULES-UNLESS-FOCUSSED*", $list_alt24);
        return NIL;
    }

    public static SubLObject init_reformulator_hub_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*REFORMULATOR-TIMEOUT-TIME*", NIL);
            deflexical("*ALL-KB-MODAL-OPERATORS-CACHING-STATE*", NIL);
            defparameter("*RL-MT*", mt_vars.$default_ask_mt$.getGlobalValue());
            defparameter("*RL-OLD*", NIL);
            defparameter("*RL-NEW*", NIL);
            defparameter("*REF-TRACE-LEVEL*", ONE_INTEGER);
            deflexical("*IGNORE-MODULES-UNLESS-FOCUSSED*", $list22);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*IGNORE-MODULES-UNLESS-FOCUSSED*", $list_alt24);
        }
        return NIL;
    }

    public static SubLObject init_reformulator_hub_file_Previous() {
        defparameter("*REFORMULATOR-TIMEOUT-TIME*", NIL);
        deflexical("*ALL-KB-MODAL-OPERATORS-CACHING-STATE*", NIL);
        defparameter("*RL-MT*", mt_vars.$default_ask_mt$.getGlobalValue());
        defparameter("*RL-OLD*", NIL);
        defparameter("*RL-NEW*", NIL);
        defparameter("*REF-TRACE-LEVEL*", ONE_INTEGER);
        deflexical("*IGNORE-MODULES-UNLESS-FOCUSSED*", $list22);
        return NIL;
    }

    public static final SubLObject setup_reformulator_hub_file_alt() {
        memoization_state.note_globally_cached_function(ALL_KB_MODAL_OPERATORS);
        memoization_state.note_memoized_function(REFORMULATE_EXPRESSION);
        memoization_state.note_memoized_function(CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED);
        memoization_state.note_memoized_function(UNCANONICALIZE_RL_EXPRESSION_CACHED);
        sunit_external.define_test_category($str_alt42$RL_EL_mismatch_substitution, UNPROVIDED);
        sunit_external.define_test_category($str_alt43$Restrict_reformulation_inside_mod, UNPROVIDED);
        sunit_external.define_test_category($$$Uniquify_variables, UNPROVIDED);
        sunit_external.define_test_suite($str_alt45$reformulator_hub_test_suite, list($str_alt42$RL_EL_mismatch_substitution, $str_alt43$Restrict_reformulation_inside_mod, $$$Uniquify_variables), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY);
        classes.subloop_new_class(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, TEST_CASE, NIL, NIL, $list_alt48);
        classes.class_set_implements_slot_listeners(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, NIL);
        classes.subloop_note_class_initialization_function(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, $sym60$SUBLOOP_RESERVED_INITIALIZE_UPDATE_ORIGINAL_CLAUSE_RECURSIVELY_CL);
        classes.subloop_note_instance_initialization_function(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, $sym65$SUBLOOP_RESERVED_INITIALIZE_UPDATE_ORIGINAL_CLAUSE_RECURSIVELY_IN);
        com.cyc.cycjava.cycl.reformulator_hub.subloop_reserved_initialize_update_original_clause_recursively_class(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY);
        sunit_macros.define_test_case_postamble(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, $str_alt66$reformulator_hub, $$$cycl, $list_alt68);
        sunit_macros.def_test_method_register(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, REFORMULATE_SKOLEMS_STRAIGHT);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GINGERLY_REFORMULATE_IN_MODALS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(GINGERLY_REFORMULATE_IN_MODALS);
        classes.subloop_new_class(GINGERLY_REFORMULATE_IN_MODALS, TEST_CASE, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(GINGERLY_REFORMULATE_IN_MODALS, NIL);
        classes.subloop_note_class_initialization_function(GINGERLY_REFORMULATE_IN_MODALS, SUBLOOP_RESERVED_INITIALIZE_GINGERLY_REFORMULATE_IN_MODALS_CLASS);
        classes.subloop_note_instance_initialization_function(GINGERLY_REFORMULATE_IN_MODALS, $sym73$SUBLOOP_RESERVED_INITIALIZE_GINGERLY_REFORMULATE_IN_MODALS_INSTAN);
        com.cyc.cycjava.cycl.reformulator_hub.subloop_reserved_initialize_gingerly_reformulate_in_modals_class(GINGERLY_REFORMULATE_IN_MODALS);
        sunit_macros.define_test_case_postamble(GINGERLY_REFORMULATE_IN_MODALS, $str_alt66$reformulator_hub, $$$cycl, $list_alt74);
        sunit_macros.def_test_method_register(GINGERLY_REFORMULATE_IN_MODALS, REFORMULATE_INTERNAL);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SUBSTITUTE_RL_EXPRESSION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(SUBSTITUTE_RL_EXPRESSION);
        classes.subloop_new_class(SUBSTITUTE_RL_EXPRESSION, TEST_CASE, NIL, NIL, $list_alt77);
        classes.class_set_implements_slot_listeners(SUBSTITUTE_RL_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(SUBSTITUTE_RL_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_SUBSTITUTE_RL_EXPRESSION_CLASS);
        classes.subloop_note_instance_initialization_function(SUBSTITUTE_RL_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_SUBSTITUTE_RL_EXPRESSION_INSTANCE);
        com.cyc.cycjava.cycl.reformulator_hub.subloop_reserved_initialize_substitute_rl_expression_class(SUBSTITUTE_RL_EXPRESSION);
        sunit_macros.define_test_case_postamble(SUBSTITUTE_RL_EXPRESSION, $str_alt66$reformulator_hub, $$$cycl, $list_alt84);
        sunit_macros.def_test_method_register(SUBSTITUTE_RL_EXPRESSION, USE_NESTED_RL_EXPRESSION);
        return NIL;
    }

    public static SubLObject setup_reformulator_hub_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(ALL_KB_MODAL_OPERATORS);
            memoization_state.note_memoized_function(REFORMULATE_EXPRESSION);
            memoization_state.note_memoized_function(CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED);
            memoization_state.note_memoized_function(UNCANONICALIZE_RL_EXPRESSION_CACHED);
            sunit_external.define_test_category($str40$RL_EL_mismatch_substitution, UNPROVIDED);
            sunit_external.define_test_category($str41$Restrict_reformulation_inside_mod, UNPROVIDED);
            sunit_external.define_test_category($$$Uniquify_variables, UNPROVIDED);
            sunit_external.define_test_suite($str43$reformulator_hub_test_suite, list($str40$RL_EL_mismatch_substitution, $str41$Restrict_reformulation_inside_mod, $$$Uniquify_variables), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_external.define_test_category($str_alt42$RL_EL_mismatch_substitution, UNPROVIDED);
            sunit_external.define_test_category($str_alt43$Restrict_reformulation_inside_mod, UNPROVIDED);
            sunit_external.define_test_suite($str_alt45$reformulator_hub_test_suite, list($str_alt42$RL_EL_mismatch_substitution, $str_alt43$Restrict_reformulation_inside_mod, $$$Uniquify_variables), UNPROVIDED, UNPROVIDED);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY);
            classes.subloop_new_class(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, TEST_CASE, NIL, NIL, $list_alt48);
            classes.class_set_implements_slot_listeners(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, NIL);
            classes.subloop_note_class_initialization_function(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, $sym60$SUBLOOP_RESERVED_INITIALIZE_UPDATE_ORIGINAL_CLAUSE_RECURSIVELY_CL);
            classes.subloop_note_instance_initialization_function(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, $sym65$SUBLOOP_RESERVED_INITIALIZE_UPDATE_ORIGINAL_CLAUSE_RECURSIVELY_IN);
            com.cyc.cycjava.cycl.reformulator_hub.subloop_reserved_initialize_update_original_clause_recursively_class(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY);
            sunit_macros.define_test_case_postamble(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, $str_alt66$reformulator_hub, $$$cycl, $list_alt68);
            sunit_macros.def_test_method_register(UPDATE_ORIGINAL_CLAUSE_RECURSIVELY, REFORMULATE_SKOLEMS_STRAIGHT);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GINGERLY_REFORMULATE_IN_MODALS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(GINGERLY_REFORMULATE_IN_MODALS);
            classes.subloop_new_class(GINGERLY_REFORMULATE_IN_MODALS, TEST_CASE, NIL, NIL, $list_alt71);
            classes.class_set_implements_slot_listeners(GINGERLY_REFORMULATE_IN_MODALS, NIL);
            classes.subloop_note_class_initialization_function(GINGERLY_REFORMULATE_IN_MODALS, SUBLOOP_RESERVED_INITIALIZE_GINGERLY_REFORMULATE_IN_MODALS_CLASS);
            classes.subloop_note_instance_initialization_function(GINGERLY_REFORMULATE_IN_MODALS, $sym73$SUBLOOP_RESERVED_INITIALIZE_GINGERLY_REFORMULATE_IN_MODALS_INSTAN);
            com.cyc.cycjava.cycl.reformulator_hub.subloop_reserved_initialize_gingerly_reformulate_in_modals_class(GINGERLY_REFORMULATE_IN_MODALS);
            sunit_macros.define_test_case_postamble(GINGERLY_REFORMULATE_IN_MODALS, $str_alt66$reformulator_hub, $$$cycl, $list_alt74);
            sunit_macros.def_test_method_register(GINGERLY_REFORMULATE_IN_MODALS, REFORMULATE_INTERNAL);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SUBSTITUTE_RL_EXPRESSION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(SUBSTITUTE_RL_EXPRESSION);
            classes.subloop_new_class(SUBSTITUTE_RL_EXPRESSION, TEST_CASE, NIL, NIL, $list_alt77);
            classes.class_set_implements_slot_listeners(SUBSTITUTE_RL_EXPRESSION, NIL);
            classes.subloop_note_class_initialization_function(SUBSTITUTE_RL_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_SUBSTITUTE_RL_EXPRESSION_CLASS);
            classes.subloop_note_instance_initialization_function(SUBSTITUTE_RL_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_SUBSTITUTE_RL_EXPRESSION_INSTANCE);
            com.cyc.cycjava.cycl.reformulator_hub.subloop_reserved_initialize_substitute_rl_expression_class(SUBSTITUTE_RL_EXPRESSION);
            sunit_macros.define_test_case_postamble(SUBSTITUTE_RL_EXPRESSION, $str_alt66$reformulator_hub, $$$cycl, $list_alt84);
            sunit_macros.def_test_method_register(SUBSTITUTE_RL_EXPRESSION, USE_NESTED_RL_EXPRESSION);
        }
        return NIL;
    }

    public static SubLObject setup_reformulator_hub_file_Previous() {
        memoization_state.note_globally_cached_function(ALL_KB_MODAL_OPERATORS);
        memoization_state.note_memoized_function(REFORMULATE_EXPRESSION);
        memoization_state.note_memoized_function(CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED);
        memoization_state.note_memoized_function(UNCANONICALIZE_RL_EXPRESSION_CACHED);
        sunit_external.define_test_category($str40$RL_EL_mismatch_substitution, UNPROVIDED);
        sunit_external.define_test_category($str41$Restrict_reformulation_inside_mod, UNPROVIDED);
        sunit_external.define_test_category($$$Uniquify_variables, UNPROVIDED);
        sunit_external.define_test_suite($str43$reformulator_hub_test_suite, list($str40$RL_EL_mismatch_substitution, $str41$Restrict_reformulation_inside_mod, $$$Uniquify_variables), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_hub_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_hub_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_hub_file();
    }

    static {
    }

    static private final SubLString $str_alt1$The_expression__s_contains_an_HL_ = makeString("The expression ~s contains an HL variable, and the CycL reformulator cannot handle it.");

    static private final SubLString $str_alt2$reformulate_cycl_cannot_be_called = makeString("reformulate-cycl cannot be called when the Cyc KB does not contain the knowledge necessary for reformulation.");

    static private final SubLString $str_alt7$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLSymbol $kw14$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt15$The_reformulator_currently_cannot = makeString("The reformulator currently cannot handle the n-conjuncts problem.");

    static private final SubLSymbol $sym17$CONTAINS_OLD_RL_ = makeSymbol("CONTAINS-OLD-RL?");

    static private final SubLList $list_alt24 = list(reader_make_constant_shell("WffViolationResolutionRLModule"));

    static private final SubLSymbol $sym25$_ = makeSymbol("<");

    static private final SubLSymbol $sym36$RL_EVALUATABLE_EXPRESSION_ = makeSymbol("RL-EVALUATABLE-EXPRESSION?");

    static private final SubLSymbol $sym39$RL_UNEVALUATABLE_EXPRESSION_ = makeSymbol("RL-UNEVALUATABLE-EXPRESSION?");

    static private final SubLString $str_alt40$All___s__Arity___s__KB___s__None_ = makeString("All: ~s  Arity: ~s  KB: ~s  None: ~s~%");

    static private final SubLString $str_alt41$Average_number_of_FORTs_mentioned = makeString("Average number of FORTs mentioned in reformulator rules: ~s");

    static private final SubLString $str_alt42$RL_EL_mismatch_substitution = makeString("RL-EL mismatch substitution");

    static private final SubLString $str_alt43$Restrict_reformulation_inside_mod = makeString("Restrict reformulation inside modals");

    static private final SubLString $str_alt45$reformulator_hub_test_suite = makeString("reformulator-hub-test-suite");

    private static final SubLSymbol UPDATE_ORIGINAL_CLAUSE_RECURSIVELY = makeSymbol("UPDATE-ORIGINAL-CLAUSE-RECURSIVELY");

    static private final SubLList $list_alt48 = list(list(makeSymbol("IN-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OUT-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REFORMULATE-SKOLEMS-STRAIGHT"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_UPDATE_ORIGINAL_CLAUSE_RECURSIVELY_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-CLASS");

    static private final SubLSymbol $sym65$SUBLOOP_RESERVED_INITIALIZE_UPDATE_ORIGINAL_CLAUSE_RECURSIVELY_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-UPDATE-ORIGINAL-CLAUSE-RECURSIVELY-INSTANCE");

    static private final SubLString $str_alt66$reformulator_hub = makeString("reformulator-hub");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt68 = list(makeString("Uniquify variables"));

    private static final SubLSymbol REFORMULATE_SKOLEMS_STRAIGHT = makeSymbol("REFORMULATE-SKOLEMS-STRAIGHT");

    private static final SubLSymbol GINGERLY_REFORMULATE_IN_MODALS = makeSymbol("GINGERLY-REFORMULATE-IN-MODALS");

    static private final SubLList $list_alt71 = list(list(makeSymbol("IN-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OUT-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REFORMULATE-INTERNAL"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GINGERLY_REFORMULATE_IN_MODALS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GINGERLY-REFORMULATE-IN-MODALS-CLASS");

    static private final SubLSymbol $sym73$SUBLOOP_RESERVED_INITIALIZE_GINGERLY_REFORMULATE_IN_MODALS_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GINGERLY-REFORMULATE-IN-MODALS-INSTANCE");

    static private final SubLList $list_alt74 = list(makeString("Restrict reformulation inside modals"));

    private static final SubLSymbol REFORMULATE_INTERNAL = makeSymbol("REFORMULATE-INTERNAL");

    private static final SubLSymbol SUBSTITUTE_RL_EXPRESSION = makeSymbol("SUBSTITUTE-RL-EXPRESSION");

    static private final SubLList $list_alt77 = list(list(makeSymbol("NEW-EXPR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OLD-SUBFORMULA"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FORMULA"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OUT-FORMULA"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USE-NESTED-RL-EXPRESSION"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol OUT_FORMULA = makeSymbol("OUT-FORMULA");

    private static final SubLSymbol OLD_SUBFORMULA = makeSymbol("OLD-SUBFORMULA");

    private static final SubLSymbol NEW_EXPR = makeSymbol("NEW-EXPR");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBSTITUTE_RL_EXPRESSION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBSTITUTE-RL-EXPRESSION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBSTITUTE_RL_EXPRESSION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBSTITUTE-RL-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt84 = list(makeString("RL-EL mismatch substitution"));

    private static final SubLSymbol USE_NESTED_RL_EXPRESSION = makeSymbol("USE-NESTED-RL-EXPRESSION");
}

/**
 * Total time: 328 ms
 */
