/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_find;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_find_if;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_subst;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_terms;
import static com.cyc.cycjava.cycl.cycl_utilities.nat_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.nat_arg2;
import static com.cyc.cycjava.cycl.cycl_utilities.nat_arg3;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_p;
import static com.cyc.cycjava.cycl.el_utilities.lambda_function_p;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_kb_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.sksi.sksi_database_fusion;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-REFORMULATE
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp
 * created:     2019/07/03 17:37:54
 */
public final class sksi_reformulate extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_reformulate();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $memoize_sksi_reformulateP$ = makeSymbol("*MEMOIZE-SKSI-REFORMULATE?*");

    // deflexical
    // The maximum level of recursive calls that can be made to SKSI-REFORMULATE
    /**
     * The maximum level of recursive calls that can be made to SKSI-REFORMULATE
     */
    @LispMethod(comment = "The maximum level of recursive calls that can be made to SKSI-REFORMULATE\ndeflexical")
    private static final SubLSymbol $sksi_reformulate_recursion_limit$ = makeSymbol("*SKSI-REFORMULATE-RECURSION-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $current_sksi_reformulate_recursion_level$ = makeSymbol("*CURRENT-SKSI-REFORMULATE-RECURSION-LEVEL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $memoize_sksi_evaluatable_expressionP$ = makeSymbol("*MEMOIZE-SKSI-EVALUATABLE-EXPRESSION?*");

    private static final SubLSymbol $sym2$NON_SKSI_EVALUATABLE_EXPRESSION_ = makeSymbol("NON-SKSI-EVALUATABLE-EXPRESSION?");

    private static final SubLSymbol SKSI_REFORMULATE_EL_FORMULA_MEMOIZED = makeSymbol("SKSI-REFORMULATE-EL-FORMULA-MEMOIZED");

    private static final SubLInteger $int$2048 = makeInteger(2048);









    static private final SubLSymbol $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED = makeSymbol("SKSI-EVALUATABLE-EXPRESSION?-MEMOIZED");

    private static final SubLSymbol SKSI_REFORMULATE_INT_MEMOIZED = makeSymbol("SKSI-REFORMULATE-INT-MEMOIZED");

    static private final SubLList $list14 = list(makeSymbol("LOGICAL-SCHEMA"), makeSymbol("CYCL-INPUT"));

    static private final SubLList $list16 = list(makeSymbol("EXP-SKS"), makeSymbol("LOGICAL-SCHEMA"), makeSymbol("CYCL-INPUT"));

    static private final SubLList $list17 = list(makeSymbol("LOGICAL-SCHEMA"), makeSymbol("RAW-INPUT"));



    static private final SubLList $list19 = list(makeSymbol("EXP-SKS"), makeSymbol("LOGICAL-SCHEMA"), makeSymbol("RAW-INPUT"));





    static private final SubLList $list22 = list(makeSymbol("CYCL-INPUT"), makeSymbol("ENTITY-TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("GUID"));

    static private final SubLList $list24 = list(makeSymbol("CITY-STRING"), makeSymbol("THE-COUNTRY"));





    private static final SubLSymbol CYC_EVALUATE_MEMOIZED = makeSymbol("CYC-EVALUATE-MEMOIZED");

    static private final SubLList $list28 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));





    static private final SubLString $str32$Dwimming__s_to__s = makeString("Dwimming ~s to ~s");

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell("RDFTripleStore-Physical");



    static private final SubLString $$$Could_not_encode_ = makeString("Could not encode ");

    static private final SubLString $$$_using_logical_schema_ = makeString(" using logical schema ");

    static private final SubLString $$$_as_part_of_ = makeString(" as part of ");

    private static final SubLSymbol SKSI_ENCODE_VIA_CODE_MAPPING = makeSymbol("SKSI-ENCODE-VIA-CODE-MAPPING");





    private static final SubLObject $const44$fieldWithPhysicalValueMapsToPhysi = reader_make_constant_shell("fieldWithPhysicalValueMapsToPhysicalValue");

    private static final SubLObject $const45$fieldWithPhysicalValueMapsToLogic = reader_make_constant_shell("fieldWithPhysicalValueMapsToLogicalValue");

    private static final SubLSymbol CMLS_DECODING_TABLE = makeSymbol("CMLS-DECODING-TABLE");

    private static final SubLSymbol $cmls_decoding_table_caching_state$ = makeSymbol("*CMLS-DECODING-TABLE-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CMLS_DECODING_TABLE = makeSymbol("CLEAR-CMLS-DECODING-TABLE");

    private static final SubLSymbol SK_SOURCE_CANONICAL_SK_SOURCE = makeSymbol("SK-SOURCE-CANONICAL-SK-SOURCE");

    public static final SubLObject sksi_reformulate_recursion_limit_exceededP_alt() {
        return numG(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.current_sksi_reformulate_recursion_level(), $sksi_reformulate_recursion_limit$.getGlobalValue());
    }

    public static SubLObject sksi_reformulate_recursion_limit_exceededP() {
        return numG(current_sksi_reformulate_recursion_level(), $sksi_reformulate_recursion_limit$.getGlobalValue());
    }

    public static final SubLObject current_sksi_reformulate_recursion_level_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $current_sksi_reformulate_recursion_level$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_sksi_reformulate_recursion_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_sksi_reformulate_recursion_level$.getDynamicValue(thread);
    }

    /**
     * This is the top-level function for the code in this module.
     *
     * @unknown EXPRESSION; el-formula-p
     * @unknown DIRECTION; keywordp (:ENCODE or :DECODE)
     * @unknown SKS; fort-p (an instance of #$StructuredKnowledgeSource.
     */
    @LispMethod(comment = "This is the top-level function for the code in this module.\r\n\r\n@unknown EXPRESSION; el-formula-p\r\n@unknown DIRECTION; keywordp (:ENCODE or :DECODE)\r\n@unknown SKS; fort-p (an instance of #$StructuredKnowledgeSource.")
    public static final SubLObject sksi_reformulate_alt(SubLObject expression, SubLObject direction, SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_recursion_limit_exceededP()) {
                return $UNREFORMULATABLE;
            }
            if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
                return $UNREFORMULATABLE;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sksi_evaluation_defns.$current_sksi_reformulate_sks$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $current_sksi_reformulate_recursion_level$.currentBinding(thread);
                    try {
                        sksi_evaluation_defns.$current_sksi_reformulate_sks$.bind(sks, thread);
                        $current_sksi_reformulate_recursion_level$.bind(number_utilities.f_1X(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.current_sksi_reformulate_recursion_level()), thread);
                        result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_internal(expression, direction, sks);
                    } finally {
                        $current_sksi_reformulate_recursion_level$.rebind(_prev_bind_1, thread);
                        sksi_evaluation_defns.$current_sksi_reformulate_sks$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * This is the top-level function for the code in this module.
     *
     * @unknown EXPRESSION; el-formula-p
     * @unknown DIRECTION; keywordp (:ENCODE or :DECODE)
     * @unknown SKS; fort-p (an instance of #$StructuredKnowledgeSource.
     */
    @LispMethod(comment = "This is the top-level function for the code in this module.\r\n\r\n@unknown EXPRESSION; el-formula-p\r\n@unknown DIRECTION; keywordp (:ENCODE or :DECODE)\r\n@unknown SKS; fort-p (an instance of #$StructuredKnowledgeSource.")
    public static SubLObject sksi_reformulate(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_utilities.expression_find($DONT_CARE, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $DONT_CARE;
        }
        if (NIL != sksi_reformulate_recursion_limit_exceededP()) {
            return $UNREFORMULATABLE;
        }
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            return $UNREFORMULATABLE;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_evaluation_defns.$current_sksi_reformulate_sks$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $current_sksi_reformulate_recursion_level$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(sksi_batch_translate.current_sksi_batch_template_allowed_rules(), thread);
            sksi_evaluation_defns.$current_sksi_reformulate_sks$.bind(sks, thread);
            $current_sksi_reformulate_recursion_level$.bind(number_utilities.f_1X(current_sksi_reformulate_recursion_level()), thread);
            result = sksi_reformulate_internal(expression, direction, sks);
        } finally {
            $current_sksi_reformulate_recursion_level$.rebind(_prev_bind_3, thread);
            sksi_evaluation_defns.$current_sksi_reformulate_sks$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sksi_reformulatableP_alt(SubLObject expression, SubLObject direction, SubLObject sks) {
        return makeBoolean(NIL == sksi_query_utilities.sksi_unreformulatable_p(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate(expression, direction, sks)));
    }

    public static SubLObject sksi_reformulatableP(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        return makeBoolean(NIL == sksi_query_utilities.sksi_unreformulatable_p(sksi_reformulate(expression, direction, sks)));
    }

    public static final SubLObject sksi_reformulate_internal_alt(SubLObject expression, SubLObject direction, SubLObject sks) {
        {
            SubLObject result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_recursive(expression, direction, sks);
            if (NIL != expression_find_if($sym1$NON_SKSI_EVALUATABLE_EXPRESSION_, result, T, UNPROVIDED)) {
                return $UNREFORMULATABLE;
            }
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_true_list_p(result)) {
                result = list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.lengthG(result, ONE_INTEGER, UNPROVIDED)) {
                    {
                        SubLObject pcase_var = direction;
                        if (pcase_var.eql($ENCODE)) {
                            result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.make_disjunctive_reformulation(result);
                        } else {
                            if (pcase_var.eql($DECODE)) {
                                result = make_el_list(result, UNPROVIDED);
                            }
                        }
                    }
                } else {
                    result = result.first();
                }
            }
            result = narts_high.nart_substitute(result);
            return result;
        }
    }

    public static SubLObject sksi_reformulate_internal(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        SubLObject result = sksi_reformulate_recursive(expression, direction, sks);
        if (NIL != cycl_utilities.expression_find_if($sym2$NON_SKSI_EVALUATABLE_EXPRESSION_, result, T, UNPROVIDED)) {
            return $UNREFORMULATABLE;
        }
        if (NIL != sksi_true_list_p(result)) {
            result = list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.lengthG(result, ONE_INTEGER, UNPROVIDED)) {
                if (direction.eql($ENCODE)) {
                    result = make_disjunctive_reformulation(result);
                } else
                    if (direction.eql($DECODE)) {
                        result = make_el_list(result, UNPROVIDED);
                    }

            } else {
                result = result.first();
            }
        }
        result = narts_high.nart_substitute(result);
        return result;
    }

    /**
     * Evaluates sksi-reformulatable functions like #$SchemaObjectIDFn.
     */
    @LispMethod(comment = "Evaluates sksi-reformulatable functions like #$SchemaObjectIDFn.")
    public static final SubLObject sksi_reformulate_recursive_alt(SubLObject expression, SubLObject direction, SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != expression_find($UNREFORMULATABLE, expression, NIL, symbol_function(EQ), UNPROVIDED)) {
                return $UNREFORMULATABLE;
            }
            if (NIL == el_formula_p(expression)) {
                return expression;
            }
            {
                SubLObject result = NIL;
                if (NIL != $memoize_sksi_reformulateP$.getDynamicValue(thread)) {
                    result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_el_formula_memoized(expression, direction, sks, mt_relevance_macros.mt_info(UNPROVIDED));
                } else {
                    result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_el_formula(expression, direction, sks);
                }
                return result;
            }
        }
    }

    /**
     * Evaluates sksi-reformulatable functions like #$SchemaObjectIDFn.
     */
    @LispMethod(comment = "Evaluates sksi-reformulatable functions like #$SchemaObjectIDFn.")
    public static SubLObject sksi_reformulate_recursive(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_utilities.expression_find($UNREFORMULATABLE, expression, NIL, symbol_function(EQ), UNPROVIDED)) {
            return $UNREFORMULATABLE;
        }
        if (NIL == el_formula_p(expression)) {
            return expression;
        }
        SubLObject result = NIL;
        if (NIL != $memoize_sksi_reformulateP$.getDynamicValue(thread)) {
            result = sksi_reformulate_el_formula_memoized(expression, direction, sks, mt_relevance_macros.mt_info(UNPROVIDED));
        } else {
            result = sksi_reformulate_el_formula(expression, direction, sks);
        }
        return result;
    }

    public static final SubLObject sksi_reformulate_el_formula_memoized_internal_alt(SubLObject expression, SubLObject direction, SubLObject sks, SubLObject mt_info) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_el_formula(expression, direction, sks);
    }

    public static SubLObject sksi_reformulate_el_formula_memoized_internal(final SubLObject expression, final SubLObject direction, final SubLObject sks, final SubLObject mt_info) {
        return sksi_reformulate_el_formula(expression, direction, sks);
    }

    public static final SubLObject sksi_reformulate_el_formula_memoized_alt(SubLObject expression, SubLObject direction, SubLObject sks, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_el_formula_memoized_internal(expression, direction, sks, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, FOUR_INTEGER, $int$2048, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(expression, direction, sks, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (direction.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (sks.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_el_formula_memoized_internal(expression, direction, sks, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, direction, sks, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_reformulate_el_formula_memoized(final SubLObject expression, final SubLObject direction, final SubLObject sks, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_reformulate_el_formula_memoized_internal(expression, direction, sks, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, FOUR_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(expression, direction, sks, mt_info);
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
                    if (direction.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sks.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_reformulate_el_formula_memoized_internal(expression, direction, sks, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, direction, sks, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_reformulate_el_formula_alt(SubLObject expression, SubLObject direction, SubLObject sks) {
        {
            SubLObject term_reformulations = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_terms(formula_terms(expression, UNPROVIDED), direction, sks);
            if (NIL != list_utilities.tree_find($UNREFORMULATABLE, term_reformulations, symbol_function(EQ), UNPROVIDED)) {
                return $UNREFORMULATABLE;
            } else {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.disjunctive_reformulation_p(term_reformulations)) {
                    {
                        SubLObject result = NIL;
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.disjunctive_reformulation_reformulations(term_reformulations);
                        SubLObject each_reformulation = NIL;
                        for (each_reformulation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_reformulation = cdolist_list_var.first()) {
                            result = cons(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_int(each_reformulation, direction, sks), result);
                        }
                        return nreverse(result);
                    }
                } else {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_int(term_reformulations, direction, sks);
                }
            }
        }
    }

    public static SubLObject sksi_reformulate_el_formula(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        final SubLObject term_reformulations = sksi_reformulate_terms(cycl_utilities.formula_terms(expression, UNPROVIDED), direction, sks);
        if (NIL != list_utilities.tree_find($UNREFORMULATABLE, term_reformulations, symbol_function(EQ), UNPROVIDED)) {
            return $UNREFORMULATABLE;
        }
        if (NIL != disjunctive_reformulation_p(term_reformulations)) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = disjunctive_reformulation_reformulations(term_reformulations);
            SubLObject each_reformulation = NIL;
            each_reformulation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(sksi_reformulate_int(each_reformulation, direction, sks), result);
                cdolist_list_var = cdolist_list_var.rest();
                each_reformulation = cdolist_list_var.first();
            } 
            return nreverse(result);
        }
        return sksi_reformulate_int(term_reformulations, direction, sks);
    }

    public static final SubLObject disjunctive_reformulation_p_alt(SubLObject reformulation) {
        return makeBoolean(reformulation.isCons() && (reformulation.first() == $$CSQLOr));
    }

    public static SubLObject disjunctive_reformulation_p(final SubLObject reformulation) {
        return makeBoolean(reformulation.isCons() && reformulation.first().eql($$CSQLOr));
    }

    public static final SubLObject disjunctive_reformulation_reformulations_alt(SubLObject reformulation) {
        return reformulation.rest();
    }

    public static SubLObject disjunctive_reformulation_reformulations(final SubLObject reformulation) {
        return reformulation.rest();
    }

    public static final SubLObject make_disjunctive_reformulation_alt(SubLObject reformulations) {
        return cons($$CSQLOr, reformulations);
    }

    public static SubLObject make_disjunctive_reformulation(final SubLObject reformulations) {
        return cons($$CSQLOr, reformulations);
    }

    public static final SubLObject sksi_reformulate_terms_alt(SubLObject terms, SubLObject direction, SubLObject sks) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject reformulated_term = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_term(v_term, direction, sks);
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_true_list_p(reformulated_term)) {
                        {
                            SubLObject new_result = make_list(length(reformulated_term), NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.disjunctive_reformulation_p(result) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.disjunctive_reformulation_reformulations(result))) : result);
                            result = NIL;
                            {
                                SubLObject each_reformulation = NIL;
                                SubLObject each_reformulation_1 = NIL;
                                SubLObject each_result = NIL;
                                SubLObject each_result_2 = NIL;
                                for (each_reformulation = reformulated_term, each_reformulation_1 = each_reformulation.first(), each_result = new_result, each_result_2 = each_result.first(); !((NIL == each_result) && (NIL == each_reformulation)); each_reformulation = each_reformulation.rest() , each_reformulation_1 = each_reformulation.first() , each_result = each_result.rest() , each_result_2 = each_result.first()) {
                                    result = cons(list_utilities.nadd_to_end(each_reformulation_1, copy_list(each_result_2)), result);
                                }
                            }
                            result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.make_disjunctive_reformulation(nreverse(result));
                        }
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.disjunctive_reformulation_p(result)) {
                            {
                                SubLObject new_result = NIL;
                                SubLObject cdolist_list_var_3 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.disjunctive_reformulation_reformulations(result);
                                SubLObject each_result = NIL;
                                for (each_result = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , each_result = cdolist_list_var_3.first()) {
                                    if (each_result.isList()) {
                                        new_result = cons(list_utilities.nadd_to_end(reformulated_term, each_result), new_result);
                                    } else {
                                        new_result = cons(list(each_result, reformulated_term), new_result);
                                    }
                                }
                                result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.make_disjunctive_reformulation(nreverse(new_result));
                            }
                        } else {
                            result = list_utilities.nadd_to_end(reformulated_term, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject sksi_reformulate_terms(final SubLObject terms, final SubLObject direction, final SubLObject sks) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject reformulated_term = sksi_reformulate_term(v_term, direction, sks);
            if (NIL != sksi_true_list_p(reformulated_term)) {
                final SubLObject new_result = make_list(length(reformulated_term), NIL != disjunctive_reformulation_p(result) ? disjunctive_reformulation_reformulations(result) : result);
                result = NIL;
                SubLObject each_reformulation = NIL;
                SubLObject each_reformulation_$1 = NIL;
                SubLObject each_result = NIL;
                SubLObject each_result_$2 = NIL;
                each_reformulation = reformulated_term;
                each_reformulation_$1 = each_reformulation.first();
                each_result = new_result;
                each_result_$2 = each_result.first();
                while ((NIL != each_result) || (NIL != each_reformulation)) {
                    result = cons(list_utilities.nadd_to_end(each_reformulation_$1, copy_list(each_result_$2)), result);
                    each_reformulation = each_reformulation.rest();
                    each_reformulation_$1 = each_reformulation.first();
                    each_result = each_result.rest();
                    each_result_$2 = each_result.first();
                } 
                result = make_disjunctive_reformulation(nreverse(result));
            } else
                if (NIL != disjunctive_reformulation_p(result)) {
                    SubLObject new_result = NIL;
                    SubLObject cdolist_list_var_$3 = disjunctive_reformulation_reformulations(result);
                    SubLObject each_result2 = NIL;
                    each_result2 = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        if (each_result2.isList()) {
                            new_result = cons(list_utilities.nadd_to_end(reformulated_term, each_result2), new_result);
                        } else {
                            new_result = cons(list(each_result2, reformulated_term), new_result);
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        each_result2 = cdolist_list_var_$3.first();
                    } 
                    result = make_disjunctive_reformulation(nreverse(new_result));
                } else {
                    result = list_utilities.nadd_to_end(reformulated_term, result);
                }

            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject sksi_reformulate_term_alt(SubLObject v_term, SubLObject direction, SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.function_to_arg_function_with_kappa_predicate_p(v_term)) || (NIL != lambda_function_p(v_term))) {
                if (NIL != $memoize_sksi_reformulateP$.getDynamicValue(thread)) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_int_memoized(v_term, direction, sks, mt_relevance_macros.mt_info(UNPROVIDED));
                } else {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_int(v_term, direction, sks);
                }
            } else {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_recursive(v_term, direction, sks);
            }
        }
    }

    public static SubLObject sksi_reformulate_term(final SubLObject v_term, final SubLObject direction, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == function_to_arg_function_with_kappa_predicate_p(v_term)) && (NIL == lambda_function_p(v_term))) {
            return sksi_reformulate_recursive(v_term, direction, sks);
        }
        if (NIL != $memoize_sksi_reformulateP$.getDynamicValue(thread)) {
            return sksi_reformulate_int_memoized(v_term, direction, sks, mt_relevance_macros.mt_info(UNPROVIDED));
        }
        return sksi_reformulate_int(v_term, direction, sks);
    }

    public static final SubLObject function_to_arg_function_with_kappa_predicate_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != el_formula_with_operator_p(v_object, $$FunctionToArg)) && (NIL != formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) && nat_arg1(v_object, UNPROVIDED).isInteger()) && (NIL != kappa_predicate_p(nat_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject function_to_arg_function_with_kappa_predicate_p(final SubLObject v_object) {
        return makeBoolean((((NIL != el_formula_with_operator_p(v_object, $$FunctionToArg)) && (NIL != formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) && cycl_utilities.nat_arg1(v_object, UNPROVIDED).isInteger()) && (NIL != kappa_predicate_p(cycl_utilities.nat_arg2(v_object, UNPROVIDED))));
    }

    public static final SubLObject sksi_reformulatable_expressionP_alt(SubLObject expression) {
        return makeBoolean(((((((NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) || (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression))) || (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression))) || (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression))) || (NIL != misc_kb_utilities.instance_named_fn_expression_p(expression))) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.names_for_term_fn_expression_p(expression))) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_evaluatable_expressionP(expression)));
    }

    public static SubLObject sksi_reformulatable_expressionP(final SubLObject expression) {
        return makeBoolean(((((((NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) || (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression))) || (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression))) || (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression))) || (NIL != misc_kb_utilities.instance_named_fn_expression_p(expression))) || (NIL != names_for_term_fn_expression_p(expression))) || (NIL != sksi_evaluatable_expressionP(expression)));
    }

    public static final SubLObject city_named_fn_expression_p_alt(SubLObject expression) {
        return el_formula_with_operator_p(expression, $$CityNamedFn);
    }

    public static SubLObject city_named_fn_expression_p(final SubLObject expression) {
        return el_formula_with_operator_p(expression, $$CityNamedFn);
    }

    public static final SubLObject names_for_term_fn_expression_p_alt(SubLObject expression) {
        return el_formula_with_operator_p(expression, $$NamesForTermFn);
    }

    public static SubLObject names_for_term_fn_expression_p(final SubLObject expression) {
        return el_formula_with_operator_p(expression, $$NamesForTermFn);
    }

    public static final SubLObject sksi_evaluatable_expressionP_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $memoize_sksi_evaluatable_expressionP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_evaluatable_expressionP_memoized(expression);
            } else {
                return relation_evaluation.evaluatable_expressionP(expression);
            }
        }
    }

    public static SubLObject sksi_evaluatable_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $memoize_sksi_evaluatable_expressionP$.getDynamicValue(thread)) {
            return makeBoolean((NIL != possibly_sksi_evaluatable_expressionP(expression)) && (NIL != sksi_evaluatable_expressionP_memoized(expression)));
        }
        return relation_evaluation.evaluatable_expressionP(expression);
    }

    public static SubLObject possibly_sksi_evaluatable_expressionP(final SubLObject expression) {
        return el_formula_p(expression);
    }

    public static final SubLObject sksi_evaluatable_expressionP_memoized_internal_alt(SubLObject expression) {
        return relation_evaluation.evaluatable_expressionP(expression);
    }

    public static SubLObject sksi_evaluatable_expressionP_memoized_internal(final SubLObject expression) {
        return relation_evaluation.evaluatable_expressionP(expression);
    }

    public static final SubLObject sksi_evaluatable_expressionP_memoized_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_evaluatable_expressionP_memoized_internal(expression);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, ONE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, expression, $kw6$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_evaluatable_expressionP_memoized_internal(expression)));
                        memoization_state.caching_state_put(caching_state, expression, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject sksi_evaluatable_expressionP_memoized(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_evaluatable_expressionP_memoized_internal(expression);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, ONE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, expression, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_evaluatable_expressionP_memoized_internal(expression)));
            memoization_state.caching_state_put(caching_state, expression, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject non_sksi_evaluatable_expressionP_alt(SubLObject expression) {
        if ((((NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) || (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression))) || (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression))) || (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression))) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_evaluatable_expressionP(expression);
    }

    public static SubLObject non_sksi_evaluatable_expressionP(final SubLObject expression) {
        if ((((NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) || (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression))) || (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression))) || (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression))) {
            return NIL;
        }
        return sksi_evaluatable_expressionP(expression);
    }

    public static final SubLObject sksi_reformulate_int_memoized_internal_alt(SubLObject expression, SubLObject direction, SubLObject sks, SubLObject mt_info) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_int(expression, direction, sks);
    }

    public static SubLObject sksi_reformulate_int_memoized_internal(final SubLObject expression, final SubLObject direction, final SubLObject sks, final SubLObject mt_info) {
        return sksi_reformulate_int(expression, direction, sks);
    }

    public static final SubLObject sksi_reformulate_int_memoized_alt(SubLObject expression, SubLObject direction, SubLObject sks, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_int_memoized_internal(expression, direction, sks, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_REFORMULATE_INT_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_REFORMULATE_INT_MEMOIZED, FOUR_INTEGER, $int$2048, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_REFORMULATE_INT_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(expression, direction, sks, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (direction.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (sks.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_int_memoized_internal(expression, direction, sks, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, direction, sks, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_reformulate_int_memoized(final SubLObject expression, final SubLObject direction, final SubLObject sks, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_reformulate_int_memoized_internal(expression, direction, sks, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_REFORMULATE_INT_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_REFORMULATE_INT_MEMOIZED, FOUR_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_REFORMULATE_INT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(expression, direction, sks, mt_info);
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
                    if (direction.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sks.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_reformulate_int_memoized_internal(expression, direction, sks, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, direction, sks, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_reformulate_int_alt(SubLObject expression, SubLObject direction, SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $UNREFORMULATABLE;
                SubLObject support_method = $UNINITIALIZED;
                if (NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) {
                    if (direction == $ENCODE) {
                        {
                            SubLObject datum = formula_args(expression, UNPROVIDED);
                            SubLObject current = datum;
                            SubLObject logical_schema = NIL;
                            SubLObject cycl_input = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt14);
                            logical_schema = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt14);
                            cycl_input = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                support_method = $REFORMULATE;
                                result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_encode(cycl_input, logical_schema, sks);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt14);
                            }
                        }
                    } else {
                        result = expression;
                    }
                } else {
                    if (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression)) {
                        if (direction == $ENCODE) {
                            {
                                SubLObject datum = formula_args(expression, UNPROVIDED);
                                SubLObject current = datum;
                                SubLObject exp_sks = NIL;
                                SubLObject logical_schema = NIL;
                                SubLObject cycl_input = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt16);
                                exp_sks = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt16);
                                logical_schema = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt16);
                                cycl_input = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    support_method = $REFORMULATE;
                                    result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_encode(cycl_input, logical_schema, sks);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt16);
                                }
                            }
                        } else {
                            result = expression;
                        }
                    } else {
                        if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression)) {
                            if (direction == $DECODE) {
                                {
                                    SubLObject datum = formula_args(expression, UNPROVIDED);
                                    SubLObject current = datum;
                                    SubLObject logical_schema = NIL;
                                    SubLObject raw_input = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt17);
                                    logical_schema = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt17);
                                    raw_input = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        support_method = $REFORMULATE;
                                        result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_decode(raw_input, logical_schema, sks, $$SchemaObjectFn);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt17);
                                    }
                                }
                            } else {
                                result = expression;
                            }
                        } else {
                            if (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) {
                                if (direction == $DECODE) {
                                    {
                                        SubLObject datum = formula_args(expression, UNPROVIDED);
                                        SubLObject current = datum;
                                        SubLObject exp_sks = NIL;
                                        SubLObject logical_schema = NIL;
                                        SubLObject raw_input = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt19);
                                        exp_sks = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt19);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt19);
                                        raw_input = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            support_method = $REFORMULATE;
                                            result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_decode(raw_input, logical_schema, exp_sks == $$TheCurrentKnowledgeSource ? ((SubLObject) (sks)) : exp_sks, $$SourceSchemaObjectFn);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt19);
                                        }
                                    }
                                } else {
                                    result = expression;
                                }
                            } else {
                                if (NIL != misc_kb_utilities.instance_named_fn_expression_p(expression)) {
                                    {
                                        SubLObject datum = formula_args(expression, UNPROVIDED);
                                        SubLObject current = datum;
                                        SubLObject cycl_input = NIL;
                                        SubLObject entity_type = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt22);
                                        cycl_input = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt22);
                                        entity_type = current.first();
                                        current = current.rest();
                                        {
                                            SubLObject guid = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                            destructuring_bind_must_listp(current, datum, $list_alt22);
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (cycl_input.isString()) {
                                                    support_method = $REFORMULATE;
                                                    result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_lexical_decode(string_utilities.trim_whitespace(cycl_input), entity_type);
                                                    if (NIL == result) {
                                                        result = expression;
                                                    }
                                                } else {
                                                    result = $UNREFORMULATABLE;
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt22);
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.names_for_term_fn_expression_p(expression)) {
                                        {
                                            SubLObject v_term = formula_arg1(expression, UNPROVIDED);
                                            support_method = $REFORMULATE;
                                            result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_names_for_term(v_term);
                                        }
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_evaluatable_expressionP(expression)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject evaluation_result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.cyc_evaluate_memoized(expression, UNPROVIDED);
                                                SubLObject valid_p = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != valid_p) {
                                                    support_method = $EVAL;
                                                    result = evaluation_result;
                                                    result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_reformulate_recursive(result, direction, sks);
                                                } else {
                                                    result = expression;
                                                }
                                            }
                                        } else {
                                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.city_named_fn_expression_p(expression)) {
                                                {
                                                    SubLObject datum = formula_args(expression, UNPROVIDED);
                                                    SubLObject current = datum;
                                                    SubLObject city_string = NIL;
                                                    SubLObject the_country = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt24);
                                                    city_string = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt24);
                                                    the_country = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (city_string.isString()) {
                                                            support_method = $REFORMULATE;
                                                            result = evaluation_defns.city_named_fn_defn(city_string, the_country);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt24);
                                                    }
                                                }
                                            } else {
                                                return expression;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!((result == $UNREFORMULATABLE) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_uninteresting_reformulationP(result, expression)))) {
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_true_list_p(result)) {
                        result = list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != list_utilities.lengthE(result, ONE_INTEGER, UNPROVIDED)) {
                            result = result.first();
                        }
                    }
                    {
                        SubLObject support_exp = expression;
                        if ((NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) || (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression))) {
                            {
                                SubLObject canonical_sks = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sk_source_canonical_sk_source(sks);
                                support_exp = expression_subst(canonical_sks, $$TheCurrentKnowledgeSource, expression, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject pcase_var = support_method;
                            if (pcase_var.eql($REFORMULATE)) {
                                sksi_hl_support_utilities.note_sksi_support(arguments.make_hl_support($REFORMULATE, list($$rewriteOf, result, support_exp), UNPROVIDED, UNPROVIDED));
                            } else {
                                if (pcase_var.eql($EVAL)) {
                                    sksi_hl_support_utilities.note_sksi_support(arguments.make_hl_support($EVAL, list($$evaluate, result, support_exp), UNPROVIDED, UNPROVIDED));
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_reformulate_int(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $UNREFORMULATABLE;
        SubLObject support_method = $UNINITIALIZED;
        if (NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) {
            if (direction == $ENCODE) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
                SubLObject logical_schema = NIL;
                SubLObject cycl_input = NIL;
                destructuring_bind_must_consp(current, datum, $list14);
                logical_schema = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list14);
                cycl_input = current.first();
                current = current.rest();
                if (NIL == current) {
                    support_method = $REFORMULATE;
                    result = sksi_encode(cycl_input, logical_schema, sks);
                } else {
                    cdestructuring_bind_error(datum, $list14);
                }
            } else {
                result = expression;
            }
        } else
            if (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression)) {
                if (direction == $ENCODE) {
                    SubLObject current;
                    final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
                    SubLObject exp_sks = NIL;
                    SubLObject logical_schema2 = NIL;
                    SubLObject cycl_input2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list16);
                    exp_sks = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list16);
                    logical_schema2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list16);
                    cycl_input2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        support_method = $REFORMULATE;
                        result = sksi_encode(cycl_input2, logical_schema2, sks);
                    } else {
                        cdestructuring_bind_error(datum, $list16);
                    }
                } else {
                    result = expression;
                }
            } else
                if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression)) {
                    if (direction == $DECODE) {
                        SubLObject current;
                        final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
                        SubLObject logical_schema = NIL;
                        SubLObject raw_input = NIL;
                        destructuring_bind_must_consp(current, datum, $list17);
                        logical_schema = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list17);
                        raw_input = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            support_method = $REFORMULATE;
                            result = sksi_decode(raw_input, logical_schema, sks, $$SchemaObjectFn);
                        } else {
                            cdestructuring_bind_error(datum, $list17);
                        }
                    } else {
                        result = expression;
                    }
                } else
                    if (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) {
                        if (direction == $DECODE) {
                            SubLObject current;
                            final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
                            SubLObject exp_sks = NIL;
                            SubLObject logical_schema2 = NIL;
                            SubLObject raw_input2 = NIL;
                            destructuring_bind_must_consp(current, datum, $list19);
                            exp_sks = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list19);
                            logical_schema2 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list19);
                            raw_input2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                support_method = $REFORMULATE;
                                result = sksi_decode(raw_input2, logical_schema2, exp_sks.eql($$TheCurrentKnowledgeSource) ? sks : exp_sks, $$SourceSchemaObjectFn);
                            } else {
                                cdestructuring_bind_error(datum, $list19);
                            }
                        } else {
                            result = expression;
                        }
                    } else
                        if (NIL != misc_kb_utilities.instance_named_fn_expression_p(expression)) {
                            SubLObject current;
                            final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
                            SubLObject cycl_input3 = NIL;
                            SubLObject entity_type = NIL;
                            destructuring_bind_must_consp(current, datum, $list22);
                            cycl_input3 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list22);
                            entity_type = current.first();
                            current = current.rest();
                            final SubLObject guid = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list22);
                            current = current.rest();
                            if (NIL == current) {
                                if (cycl_input3.isString()) {
                                    support_method = $REFORMULATE;
                                    result = sksi_lexical_decode(string_utilities.trim_whitespace(cycl_input3), entity_type);
                                    if (NIL == result) {
                                        result = expression;
                                    }
                                } else {
                                    result = $UNREFORMULATABLE;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list22);
                            }
                        } else
                            if (NIL != names_for_term_fn_expression_p(expression)) {
                                final SubLObject v_term = cycl_utilities.formula_arg1(expression, UNPROVIDED);
                                support_method = $REFORMULATE;
                                result = sksi_names_for_term(v_term);
                            } else
                                if (NIL != sksi_evaluatable_expressionP(expression)) {
                                    thread.resetMultipleValues();
                                    final SubLObject evaluation_result = cyc_evaluate_memoized(expression, UNPROVIDED);
                                    final SubLObject valid_p = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid_p) {
                                        support_method = $EVAL;
                                        result = evaluation_result;
                                        result = sksi_reformulate_recursive(result, direction, sks);
                                    } else {
                                        result = expression;
                                    }
                                } else {
                                    if (NIL == city_named_fn_expression_p(expression)) {
                                        return expression;
                                    }
                                    SubLObject current;
                                    final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
                                    SubLObject city_string = NIL;
                                    SubLObject the_country = NIL;
                                    destructuring_bind_must_consp(current, datum, $list24);
                                    city_string = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list24);
                                    the_country = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (city_string.isString()) {
                                            support_method = $REFORMULATE;
                                            result = evaluation_defns.city_named_fn_defn(city_string, the_country);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list24);
                                    }
                                }






        if ((result != $UNREFORMULATABLE) && (NIL == sksi_uninteresting_reformulationP(result, expression))) {
            if (NIL != sksi_true_list_p(result)) {
                result = list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.lengthE(result, ONE_INTEGER, UNPROVIDED)) {
                    result = result.first();
                }
            }
            SubLObject support_exp = expression;
            if ((NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) || (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression))) {
                final SubLObject canonical_sks = sk_source_canonical_sk_source(sks);
                support_exp = cycl_utilities.expression_subst(canonical_sks, $$TheCurrentKnowledgeSource, expression, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject pcase_var = support_method;
            if (pcase_var.eql($REFORMULATE)) {
                sksi_hl_support_utilities.note_sksi_support(arguments.make_hl_support($REFORMULATE, list($$rewriteOf, result, support_exp), UNPROVIDED, UNPROVIDED));
            } else
                if (pcase_var.eql($EVAL)) {
                    sksi_hl_support_utilities.note_sksi_support(arguments.make_hl_support($EVAL, list($$evaluate, result, support_exp), UNPROVIDED, UNPROVIDED));
                }

        }
        return result;
    }

    public static final SubLObject cyc_evaluate_memoized_internal_alt(SubLObject expression, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return relation_evaluation.cyc_evaluate(expression);
    }

    public static SubLObject cyc_evaluate_memoized_internal(final SubLObject expression, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return relation_evaluation.cyc_evaluate(expression);
    }

    public static final SubLObject cyc_evaluate_memoized_alt(SubLObject expression, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.cyc_evaluate_memoized_internal(expression, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CYC_EVALUATE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CYC_EVALUATE_MEMOIZED, TWO_INTEGER, $int$2048, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, CYC_EVALUATE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(expression, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.cyc_evaluate_memoized_internal(expression, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject cyc_evaluate_memoized(final SubLObject expression, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cyc_evaluate_memoized_internal(expression, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CYC_EVALUATE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CYC_EVALUATE_MEMOIZED, TWO_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CYC_EVALUATE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(expression, mt_info);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cyc_evaluate_memoized_internal(expression, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_true_list_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.non_empty_list_p(v_object)) && (!v_object.first().isFunctionSpec())) && (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_el_formulaP(v_object)));
    }

    public static SubLObject sksi_true_list_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.non_empty_list_p(v_object)) && (!v_object.first().isFunctionSpec())) && (NIL == sksi_el_formulaP(v_object)));
    }

    public static final SubLObject sksi_el_formulaP_alt(SubLObject v_object) {
        return makeBoolean((NIL != term.nautP(v_object, UNPROVIDED)) || (NIL != cycl_grammar.cycl_sentence_p(v_object)));
    }

    public static SubLObject sksi_el_formulaP(final SubLObject v_object) {
        return makeBoolean((NIL != term.nautP(v_object, UNPROVIDED)) || (NIL != cycl_grammar.cycl_sentence_p(v_object)));
    }

    public static final SubLObject sksi_uninteresting_reformulationP_alt(SubLObject expression, SubLObject reformulation) {
        return equal(expression, reformulation);
    }

    public static SubLObject sksi_uninteresting_reformulationP(final SubLObject expression, final SubLObject reformulation) {
        return equal(expression, reformulation);
    }

    public static final SubLObject sksi_lexical_decode_alt(SubLObject string_input, SubLObject entity_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sdbc.sql_null_p(string_input)) {
                return $UNREFORMULATABLE;
            }
            if (!(string_input.isString() || (NIL != forts.fort_p(entity_type)))) {
                return $UNREFORMULATABLE;
            }
            {
                SubLObject v_answer = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject all_forts = lexicon_accessors.denots_of_string(string_input, $list_alt28, $DENOT, T, NIL, $$AllLexicalMicrotheoryPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject all_pred_lists = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == v_answer) {
                        {
                            SubLObject csome_list_var = all_forts;
                            SubLObject each_fort = NIL;
                            for (each_fort = csome_list_var.first(); !((NIL != v_answer) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , each_fort = csome_list_var.first()) {
                                if (NIL != at_defns.quiet_has_typeP(each_fort, entity_type, UNPROVIDED)) {
                                    v_answer = each_fort;
                                }
                            }
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    public static SubLObject sksi_lexical_decode(final SubLObject string_input, final SubLObject entity_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sdbc.sql_null_p(string_input)) {
            return $UNREFORMULATABLE;
        }
        if ((!string_input.isString()) && (NIL == forts.fort_p(entity_type))) {
            return $UNREFORMULATABLE;
        }
        SubLObject v_answer = NIL;
        thread.resetMultipleValues();
        final SubLObject all_forts = lexicon_accessors.denots_of_string(string_input, $list28, $DENOT, T, NIL, $$AllLexicalMicrotheoryPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject all_pred_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == v_answer) {
            SubLObject csome_list_var = all_forts;
            SubLObject each_fort = NIL;
            each_fort = csome_list_var.first();
            while ((NIL == v_answer) && (NIL != csome_list_var)) {
                if (NIL != at_defns.quiet_has_typeP(each_fort, entity_type, UNPROVIDED)) {
                    v_answer = each_fort;
                }
                csome_list_var = csome_list_var.rest();
                each_fort = csome_list_var.first();
            } 
        }
        return v_answer;
    }

    public static final SubLObject sksi_names_for_term_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == forts.fort_p(v_term)) {
                return $UNREFORMULATABLE;
            }
            thread.resetMultipleValues();
            {
                SubLObject names = pph_methods_lexicon.names_for_term(v_term, $$termStrings, $$AllLexicalMicrotheoryPSC, UNPROVIDED);
                SubLObject pred_lists = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject name = NIL;
                    SubLObject name_4 = NIL;
                    SubLObject pred_list = NIL;
                    SubLObject pred_list_5 = NIL;
                    for (name = names, name_4 = name.first(), pred_list = pred_lists, pred_list_5 = pred_list.first(); !((NIL == pred_list) && (NIL == name)); name = name.rest() , name_4 = name.first() , pred_list = pred_list.rest() , pred_list_5 = pred_list.first()) {
                        {
                            SubLObject cdolist_list_var = pred_list_5;
                            SubLObject pred = NIL;
                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                {
                                    SubLObject gaf = kb_indexing.find_gaf_genl_mts(list_to_elf(list(pred, v_term, name_4)), $$AllLexicalMicrotheoryPSC);
                                    if (NIL != gaf) {
                                        sksi_hl_support_utilities.note_sksi_support(gaf);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != list_utilities.non_empty_list_p(names)) {
                    return make_el_list(names, UNPROVIDED);
                } else {
                    return $UNREFORMULATABLE;
                }
            }
        }
    }

    public static SubLObject sksi_names_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(v_term)) {
            return $UNREFORMULATABLE;
        }
        thread.resetMultipleValues();
        final SubLObject names = pph_methods_lexicon.names_for_term(v_term, $$termStrings, $$AllLexicalMicrotheoryPSC, UNPROVIDED);
        final SubLObject pred_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject name = NIL;
        SubLObject name_$4 = NIL;
        SubLObject pred_list = NIL;
        SubLObject pred_list_$5 = NIL;
        name = names;
        name_$4 = name.first();
        pred_list = pred_lists;
        pred_list_$5 = pred_list.first();
        while ((NIL != pred_list) || (NIL != name)) {
            SubLObject cdolist_list_var = pred_list_$5;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject gaf = kb_indexing.find_gaf_genl_mts(list_to_elf(list(pred, v_term, name_$4)), $$AllLexicalMicrotheoryPSC);
                if (NIL != gaf) {
                    sksi_hl_support_utilities.note_sksi_support(gaf);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            name = name.rest();
            name_$4 = name.first();
            pred_list = pred_list.rest();
            pred_list_$5 = pred_list.first();
        } 
        if (NIL != list_utilities.non_empty_list_p(names)) {
            return make_el_list(names, UNPROVIDED);
        }
        return $UNREFORMULATABLE;
    }

    public static final SubLObject sksi_encode_alt(SubLObject cycl_input, SubLObject logical_schema, SubLObject sks) {
        if ((NIL != sksi_kb_accessors.schema_object_fn_expression_p(cycl_input)) && (logical_schema == nat_arg1(cycl_input, UNPROVIDED))) {
            return nat_arg2(cycl_input, UNPROVIDED);
        } else {
            if ((NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(cycl_input)) && (logical_schema == nat_arg2(cycl_input, UNPROVIDED))) {
                return nat_arg3(cycl_input, UNPROVIDED);
            } else {
                if (((NIL != sksi_database_fusion.within_sksi_database_fusionP()) && (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(cycl_input))) && (NIL != sksi_database_fusion.sksi_database_fusion_clones_or_fusionsP(logical_schema, nat_arg2(cycl_input, UNPROVIDED)))) {
                    if (NIL != sksi_database_fusion.sksi_database_fusion_debugP()) {
                        Errors.warn($str_alt32$Dwimming__s_to__s, cycl_input, nat_arg3(cycl_input, UNPROVIDED));
                    }
                    return nat_arg3(cycl_input, UNPROVIDED);
                } else {
                    if (($$RDFTripleStore_Physical == sksi_sks_accessors.sks_get_type(sks)) && (NIL != el_set_p(cycl_input))) {
                        {
                            SubLObject set_encoding = NIL;
                            set_encoding = cons($$TheSet, set_encoding);
                            {
                                SubLObject cdolist_list_var = el_set_items(cycl_input);
                                SubLObject set_elem = NIL;
                                for (set_elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , set_elem = cdolist_list_var.first()) {
                                    {
                                        SubLObject set_elem_encoded = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_encode(set_elem, logical_schema, sks);
                                        if ($UNREFORMULATABLE == set_elem_encoded) {
                                            sksi_debugging.sksi_error(cconcatenate($str_alt35$Could_not_encode_, new SubLObject[]{ format_nil.format_nil_a_no_copy(set_elem), $str_alt36$_using_logical_schema_, format_nil.format_nil_a_no_copy(logical_schema), $str_alt37$_as_part_of_, format_nil.format_nil_a_no_copy(cycl_input) }));
                                            return $UNREFORMULATABLE;
                                        }
                                        set_encoding = cons(set_elem_encoded, set_encoding);
                                    }
                                }
                            }
                            return nreverse(set_encoding);
                        }
                    } else {
                        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_encode_via_code_mapping(cycl_input, logical_schema, sks);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_encode(final SubLObject cycl_input, final SubLObject logical_schema, final SubLObject sks) {
        if ((NIL != sksi_kb_accessors.schema_object_fn_expression_p(cycl_input)) && logical_schema.eql(cycl_utilities.nat_arg1(cycl_input, UNPROVIDED))) {
            return cycl_utilities.nat_arg2(cycl_input, UNPROVIDED);
        }
        if ((NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(cycl_input)) && logical_schema.eql(cycl_utilities.nat_arg2(cycl_input, UNPROVIDED))) {
            return cycl_utilities.nat_arg3(cycl_input, UNPROVIDED);
        }
        if (((NIL != sksi_database_fusion.within_sksi_database_fusionP()) && (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(cycl_input))) && (NIL != sksi_database_fusion.sksi_database_fusion_clones_or_fusionsP(logical_schema, cycl_utilities.nat_arg2(cycl_input, UNPROVIDED)))) {
            if (NIL != sksi_database_fusion.sksi_database_fusion_debugP()) {
                Errors.warn($str32$Dwimming__s_to__s, cycl_input, cycl_utilities.nat_arg3(cycl_input, UNPROVIDED));
            }
            return cycl_utilities.nat_arg3(cycl_input, UNPROVIDED);
        }
        if ($$RDFTripleStore_Physical.eql(sksi_sks_accessors.sks_get_type(sks)) && (NIL != el_set_p(cycl_input))) {
            SubLObject set_encoding = NIL;
            set_encoding = cons($$TheSet, set_encoding);
            SubLObject cdolist_list_var = el_set_items(cycl_input);
            SubLObject set_elem = NIL;
            set_elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject set_elem_encoded = sksi_encode(set_elem, logical_schema, sks);
                if ($UNREFORMULATABLE == set_elem_encoded) {
                    sksi_debugging.sksi_error(cconcatenate($$$Could_not_encode_, new SubLObject[]{ format_nil.format_nil_a_no_copy(set_elem), $$$_using_logical_schema_, format_nil.format_nil_a_no_copy(logical_schema), $$$_as_part_of_, format_nil.format_nil_a_no_copy(cycl_input) }));
                    return $UNREFORMULATABLE;
                }
                set_encoding = cons(set_elem_encoded, set_encoding);
                cdolist_list_var = cdolist_list_var.rest();
                set_elem = cdolist_list_var.first();
            } 
            return nreverse(set_encoding);
        }
        return sksi_encode_via_code_mapping(cycl_input, logical_schema, sks);
    }

    public static final SubLObject sksi_encode_via_code_mapping_internal_alt(SubLObject cycl_input, SubLObject cmls, SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (sks == $$TheCurrentKnowledgeSource) {
                    result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_encode_via_code_mapping_int(cycl_input, cmls);
                } else {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sks));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_encode_via_code_mapping_int(cycl_input, cmls);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                if (NIL != result) {
                    return NIL != list_utilities.singletonP(result) ? ((SubLObject) (result.first())) : result;
                } else {
                    return $UNREFORMULATABLE;
                }
            }
        }
    }

    public static SubLObject sksi_encode_via_code_mapping_internal(final SubLObject cycl_input, final SubLObject cmls, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (sks.eql($$TheCurrentKnowledgeSource)) {
            result = sksi_encode_via_code_mapping_int(cycl_input, cmls);
        } else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sks));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = sksi_encode_via_code_mapping_int(cycl_input, cmls);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != result) {
            return NIL != list_utilities.singletonP(result) ? result.first() : result;
        }
        return $UNREFORMULATABLE;
    }

    public static final SubLObject sksi_encode_via_code_mapping_alt(SubLObject cycl_input, SubLObject cmls, SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_encode_via_code_mapping_internal(cycl_input, cmls, sks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_ENCODE_VIA_CODE_MAPPING, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_ENCODE_VIA_CODE_MAPPING, THREE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_ENCODE_VIA_CODE_MAPPING, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_input, cmls, sks);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (cycl_input.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (cmls.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && sks.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_encode_via_code_mapping_internal(cycl_input, cmls, sks)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cycl_input, cmls, sks));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_encode_via_code_mapping(final SubLObject cycl_input, final SubLObject cmls, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_encode_via_code_mapping_internal(cycl_input, cmls, sks);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_ENCODE_VIA_CODE_MAPPING, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_ENCODE_VIA_CODE_MAPPING, THREE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_ENCODE_VIA_CODE_MAPPING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_input, cmls, sks);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cycl_input.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cmls.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && sks.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_encode_via_code_mapping_internal(cycl_input, cmls, sks)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl_input, cmls, sks));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_encode_via_code_mapping_int_alt(SubLObject cycl_input, SubLObject cmls) {
        {
            SubLObject result = NIL;
            SubLObject pred_var = $$codeMapping;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(czer_main.canonicalize_term(cycl_input, UNPROVIDED), THREE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(czer_main.canonicalize_term(cycl_input, UNPROVIDED), THREE_INTEGER, pred_var);
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
                                            SubLObject done_var_6 = NIL;
                                            SubLObject token_var_7 = NIL;
                                            while (NIL == done_var_6) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                    SubLObject valid_8 = makeBoolean(token_var_7 != ass);
                                                    if (NIL != valid_8) {
                                                        {
                                                            SubLObject ass_cmls = assertions_high.gaf_arg1(ass);
                                                            if (ass_cmls.equal(cmls)) {
                                                                {
                                                                    SubLObject raw = assertions_high.gaf_arg2(ass);
                                                                    result = cons(raw, result);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var_6 = makeBoolean(NIL == valid_8);
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
            return result;
        }
    }

    public static SubLObject sksi_encode_via_code_mapping_int(final SubLObject cycl_input, final SubLObject cmls) {
        SubLObject result = NIL;
        final SubLObject pred_var = $$codeMapping;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(czer_main.canonicalize_term(cycl_input, UNPROVIDED), THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(czer_main.canonicalize_term(cycl_input, UNPROVIDED), THREE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$6 = NIL;
                        final SubLObject token_var_$7 = NIL;
                        while (NIL == done_var_$6) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                            final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(ass));
                            if (NIL != valid_$8) {
                                final SubLObject ass_cmls = assertions_high.gaf_arg1(ass);
                                if (NIL != czer_utilities.terms_equal_at_elP(ass_cmls, cmls, UNPROVIDED)) {
                                    final SubLObject raw = assertions_high.gaf_arg2(ass);
                                    result = cons(raw, result);
                                }
                            }
                            done_var_$6 = makeBoolean(NIL == valid_$8);
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
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return result;
    }

    public static final SubLObject sksi_decode_alt(SubLObject raw_input, SubLObject cmls, SubLObject sks, SubLObject func) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sks));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sksi_decode_via_code_mapping_int(raw_input, cmls);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != sdbc.sql_null_p(raw_input)) {
                    return $UNDECODED;
                }
                return NIL != result ? ((SubLObject) (result)) : func == $$SchemaObjectFn ? ((SubLObject) (make_el_formula($$SchemaObjectFn, list(cmls, raw_input), UNPROVIDED))) : make_el_formula($$SourceSchemaObjectFn, list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sk_source_canonical_sk_source(sks), cmls, raw_input), UNPROVIDED);
            }
        }
    }

    public static SubLObject sksi_decode(SubLObject raw_input, final SubLObject cmls, final SubLObject sks, final SubLObject func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject result_$9 = sksi_decode_via_override_assertions(raw_input, cmls, sks);
        final SubLObject raw_input_$10 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$9;
        raw_input = raw_input_$10;
        if (NIL != result) {
            return result;
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sks));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = sksi_decode_via_code_mapping_int(raw_input, cmls);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sdbc.sql_null_p(raw_input)) {
            return $UNDECODED;
        }
        return NIL != result ? result : func.eql($$SchemaObjectFn) ? make_el_formula($$SchemaObjectFn, list(cmls, raw_input), UNPROVIDED) : make_el_formula($$SourceSchemaObjectFn, list(sk_source_canonical_sk_source(sks), cmls, raw_input), UNPROVIDED);
    }

    public static SubLObject sksi_decode_via_override_assertions(SubLObject raw_input, final SubLObject cmls, final SubLObject sks) {
        SubLObject result = NIL;
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject pf = kb_mapping_utilities.fpred_value_in_relevant_mts(cmls, $$canonicalCodeMappingLogicalSchema, mapping_mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        if (NIL != pf) {
            final SubLObject p_to_p_gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts($const44$fieldWithPhysicalValueMapsToPhysi, pf, raw_input, mapping_mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            if (NIL != assertions_high.gaf_assertionP(p_to_p_gaf)) {
                raw_input = assertions_high.gaf_arg3(p_to_p_gaf);
            }
            final SubLObject p_to_l_gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts($const45$fieldWithPhysicalValueMapsToLogic, pf, raw_input, mapping_mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            if (NIL != assertions_high.gaf_assertionP(p_to_l_gaf)) {
                result = assertions_high.gaf_arg3(p_to_l_gaf);
            }
        }
        return values(result, raw_input);
    }

    public static final SubLObject sksi_decode_via_code_mapping_int_alt(SubLObject raw_input, SubLObject cmls) {
        if (NIL != forts.fort_p(cmls)) {
            {
                SubLObject table = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.cmls_decoding_table(cmls);
                return gethash_without_values(raw_input, table, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_decode_via_code_mapping_int(final SubLObject raw_input, final SubLObject cmls) {
        if (NIL != forts.fort_p(cmls)) {
            final SubLObject table = cmls_decoding_table(cmls);
            return gethash_without_values(raw_input, table, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject clear_cmls_decoding_table_alt() {
        {
            SubLObject cs = $cmls_decoding_table_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cmls_decoding_table() {
        final SubLObject cs = $cmls_decoding_table_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cmls_decoding_table_alt(SubLObject cmls) {
        return memoization_state.caching_state_remove_function_results_with_args($cmls_decoding_table_caching_state$.getGlobalValue(), list(cmls), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cmls_decoding_table(final SubLObject cmls) {
        return memoization_state.caching_state_remove_function_results_with_args($cmls_decoding_table_caching_state$.getGlobalValue(), list(cmls), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cmls_decoding_table_internal_alt(SubLObject cmls) {
        {
            SubLObject size = kb_indexing.num_gaf_arg_index(cmls, ONE_INTEGER, $$codeMapping, UNPROVIDED);
            SubLObject table = make_hash_table(size, symbol_function(EQUAL), UNPROVIDED);
            SubLObject pred_var = $$codeMapping;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cmls, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cmls, ONE_INTEGER, pred_var);
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
                                            SubLObject done_var_9 = NIL;
                                            SubLObject token_var_10 = NIL;
                                            while (NIL == done_var_9) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                    SubLObject valid_11 = makeBoolean(token_var_10 != ass);
                                                    if (NIL != valid_11) {
                                                        {
                                                            SubLObject code = assertions_high.gaf_arg2(ass);
                                                            SubLObject v_term = assertions_high.gaf_arg3(ass);
                                                            sethash(code, table, v_term);
                                                        }
                                                    }
                                                    done_var_9 = makeBoolean(NIL == valid_11);
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
            return table;
        }
    }

    public static SubLObject cmls_decoding_table_internal(final SubLObject cmls) {
        final SubLObject size = kb_indexing.num_gaf_arg_index(cmls, ONE_INTEGER, $$codeMapping, UNPROVIDED);
        final SubLObject table = make_hash_table(size, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject pred_var = $$codeMapping;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cmls, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cmls, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$11 = NIL;
                        final SubLObject token_var_$12 = NIL;
                        while (NIL == done_var_$11) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                            final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(ass));
                            if (NIL != valid_$13) {
                                final SubLObject code = assertions_high.gaf_arg2(ass);
                                final SubLObject v_term = assertions_high.gaf_arg3(ass);
                                sethash(code, table, v_term);
                            }
                            done_var_$11 = makeBoolean(NIL == valid_$13);
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
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return table;
    }

    public static final SubLObject cmls_decoding_table_alt(SubLObject cmls) {
        {
            SubLObject caching_state = $cmls_decoding_table_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CMLS_DECODING_TABLE, $cmls_decoding_table_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_CMLS_DECODING_TABLE);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, cmls, $kw6$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.cmls_decoding_table_internal(cmls)));
                    memoization_state.caching_state_put(caching_state, cmls, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cmls_decoding_table(final SubLObject cmls) {
        SubLObject caching_state = $cmls_decoding_table_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CMLS_DECODING_TABLE, $cmls_decoding_table_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CMLS_DECODING_TABLE);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cmls, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cmls_decoding_table_internal(cmls)));
            memoization_state.caching_state_put(caching_state, cmls, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject sk_source_canonical_sk_source_internal_alt(SubLObject sk_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                SubLObject canonical_sk_source = NIL;
                SubLObject mt_var = mapping_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        canonical_sk_source = sksi_infrastructure_utilities.source_schema_object_fn_canonical_sks(sk_source);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != canonical_sk_source ? ((SubLObject) (canonical_sk_source)) : sk_source;
            }
        }
    }

    public static SubLObject sk_source_canonical_sk_source_internal(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        SubLObject canonical_sk_source = NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            canonical_sk_source = sksi_infrastructure_utilities.source_schema_object_fn_canonical_sks(sk_source);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL != canonical_sk_source ? canonical_sk_source : sk_source;
    }

    public static final SubLObject sk_source_canonical_sk_source_alt(SubLObject sk_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sk_source_canonical_sk_source_internal(sk_source);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SK_SOURCE_CANONICAL_SK_SOURCE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SK_SOURCE_CANONICAL_SK_SOURCE, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SK_SOURCE_CANONICAL_SK_SOURCE, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, $kw6$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate.sk_source_canonical_sk_source_internal(sk_source)));
                        memoization_state.caching_state_put(caching_state, sk_source, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject sk_source_canonical_sk_source(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sk_source_canonical_sk_source_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SK_SOURCE_CANONICAL_SK_SOURCE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SK_SOURCE_CANONICAL_SK_SOURCE, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SK_SOURCE_CANONICAL_SK_SOURCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sk_source_canonical_sk_source_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_sksi_reformulate_file() {
        declareFunction("sksi_reformulate_recursion_limit_exceededP", "SKSI-REFORMULATE-RECURSION-LIMIT-EXCEEDED?", 0, 0, false);
        declareFunction("current_sksi_reformulate_recursion_level", "CURRENT-SKSI-REFORMULATE-RECURSION-LEVEL", 0, 0, false);
        declareFunction("sksi_reformulate", "SKSI-REFORMULATE", 3, 0, false);
        declareFunction("sksi_reformulatableP", "SKSI-REFORMULATABLE?", 3, 0, false);
        declareFunction("sksi_reformulate_internal", "SKSI-REFORMULATE-INTERNAL", 3, 0, false);
        declareFunction("sksi_reformulate_recursive", "SKSI-REFORMULATE-RECURSIVE", 3, 0, false);
        declareFunction("sksi_reformulate_el_formula_memoized_internal", "SKSI-REFORMULATE-EL-FORMULA-MEMOIZED-INTERNAL", 4, 0, false);
        declareFunction("sksi_reformulate_el_formula_memoized", "SKSI-REFORMULATE-EL-FORMULA-MEMOIZED", 4, 0, false);
        declareFunction("sksi_reformulate_el_formula", "SKSI-REFORMULATE-EL-FORMULA", 3, 0, false);
        declareFunction("disjunctive_reformulation_p", "DISJUNCTIVE-REFORMULATION-P", 1, 0, false);
        declareFunction("disjunctive_reformulation_reformulations", "DISJUNCTIVE-REFORMULATION-REFORMULATIONS", 1, 0, false);
        declareFunction("make_disjunctive_reformulation", "MAKE-DISJUNCTIVE-REFORMULATION", 1, 0, false);
        declareFunction("sksi_reformulate_terms", "SKSI-REFORMULATE-TERMS", 3, 0, false);
        declareFunction("sksi_reformulate_term", "SKSI-REFORMULATE-TERM", 3, 0, false);
        declareFunction("function_to_arg_function_with_kappa_predicate_p", "FUNCTION-TO-ARG-FUNCTION-WITH-KAPPA-PREDICATE-P", 1, 0, false);
        declareFunction("sksi_reformulatable_expressionP", "SKSI-REFORMULATABLE-EXPRESSION?", 1, 0, false);
        declareFunction("city_named_fn_expression_p", "CITY-NAMED-FN-EXPRESSION-P", 1, 0, false);
        declareFunction("names_for_term_fn_expression_p", "NAMES-FOR-TERM-FN-EXPRESSION-P", 1, 0, false);
        declareFunction("sksi_evaluatable_expressionP", "SKSI-EVALUATABLE-EXPRESSION?", 1, 0, false);
        declareFunction("possibly_sksi_evaluatable_expressionP", "POSSIBLY-SKSI-EVALUATABLE-EXPRESSION?", 1, 0, false);
        declareFunction("sksi_evaluatable_expressionP_memoized_internal", "SKSI-EVALUATABLE-EXPRESSION?-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("sksi_evaluatable_expressionP_memoized", "SKSI-EVALUATABLE-EXPRESSION?-MEMOIZED", 1, 0, false);
        declareFunction("non_sksi_evaluatable_expressionP", "NON-SKSI-EVALUATABLE-EXPRESSION?", 1, 0, false);
        new sksi_reformulate.$non_sksi_evaluatable_expressionP$UnaryFunction();
        declareFunction("sksi_reformulate_int_memoized_internal", "SKSI-REFORMULATE-INT-MEMOIZED-INTERNAL", 4, 0, false);
        declareFunction("sksi_reformulate_int_memoized", "SKSI-REFORMULATE-INT-MEMOIZED", 4, 0, false);
        declareFunction("sksi_reformulate_int", "SKSI-REFORMULATE-INT", 3, 0, false);
        declareFunction("cyc_evaluate_memoized_internal", "CYC-EVALUATE-MEMOIZED-INTERNAL", 1, 1, false);
        declareFunction("cyc_evaluate_memoized", "CYC-EVALUATE-MEMOIZED", 1, 1, false);
        declareFunction("sksi_true_list_p", "SKSI-TRUE-LIST-P", 1, 0, false);
        declareFunction("sksi_el_formulaP", "SKSI-EL-FORMULA?", 1, 0, false);
        declareFunction("sksi_uninteresting_reformulationP", "SKSI-UNINTERESTING-REFORMULATION?", 2, 0, false);
        declareFunction("sksi_lexical_decode", "SKSI-LEXICAL-DECODE", 2, 0, false);
        declareFunction("sksi_names_for_term", "SKSI-NAMES-FOR-TERM", 1, 0, false);
        declareFunction("sksi_encode", "SKSI-ENCODE", 3, 0, false);
        declareFunction("sksi_encode_via_code_mapping_internal", "SKSI-ENCODE-VIA-CODE-MAPPING-INTERNAL", 3, 0, false);
        declareFunction("sksi_encode_via_code_mapping", "SKSI-ENCODE-VIA-CODE-MAPPING", 3, 0, false);
        declareFunction("sksi_encode_via_code_mapping_int", "SKSI-ENCODE-VIA-CODE-MAPPING-INT", 2, 0, false);
        declareFunction("sksi_decode", "SKSI-DECODE", 4, 0, false);
        declareFunction("sksi_decode_via_override_assertions", "SKSI-DECODE-VIA-OVERRIDE-ASSERTIONS", 3, 0, false);
        declareFunction("sksi_decode_via_code_mapping_int", "SKSI-DECODE-VIA-CODE-MAPPING-INT", 2, 0, false);
        declareFunction("clear_cmls_decoding_table", "CLEAR-CMLS-DECODING-TABLE", 0, 0, false);
        new sksi_reformulate.$clear_cmls_decoding_table$ZeroArityFunction();
        declareFunction("remove_cmls_decoding_table", "REMOVE-CMLS-DECODING-TABLE", 1, 0, false);
        declareFunction("cmls_decoding_table_internal", "CMLS-DECODING-TABLE-INTERNAL", 1, 0, false);
        declareFunction("cmls_decoding_table", "CMLS-DECODING-TABLE", 1, 0, false);
        declareFunction("sk_source_canonical_sk_source_internal", "SK-SOURCE-CANONICAL-SK-SOURCE-INTERNAL", 1, 0, false);
        declareFunction("sk_source_canonical_sk_source", "SK-SOURCE-CANONICAL-SK-SOURCE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_reformulate_file() {
        defparameter("*MEMOIZE-SKSI-REFORMULATE?*", T);
        deflexical("*SKSI-REFORMULATE-RECURSION-LIMIT*", FIVE_INTEGER);
        defparameter("*CURRENT-SKSI-REFORMULATE-RECURSION-LEVEL*", ZERO_INTEGER);
        defparameter("*MEMOIZE-SKSI-EVALUATABLE-EXPRESSION?*", T);
        deflexical("*CMLS-DECODING-TABLE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_reformulate_file() {
        memoization_state.note_memoized_function(SKSI_REFORMULATE_EL_FORMULA_MEMOIZED);
        memoization_state.note_memoized_function($sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED);
        memoization_state.note_memoized_function(SKSI_REFORMULATE_INT_MEMOIZED);
        memoization_state.note_memoized_function(CYC_EVALUATE_MEMOIZED);
        memoization_state.note_memoized_function(SKSI_ENCODE_VIA_CODE_MAPPING);
        memoization_state.note_globally_cached_function(CMLS_DECODING_TABLE);
        memoization_state.note_memoized_function(SK_SOURCE_CANONICAL_SK_SOURCE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_reformulate_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_reformulate_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_reformulate_file();
    }

    

    public static final class $non_sksi_evaluatable_expressionP$UnaryFunction extends UnaryFunction {
        public $non_sksi_evaluatable_expressionP$UnaryFunction() {
            super(extractFunctionNamed("NON-SKSI-EVALUATABLE-EXPRESSION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return non_sksi_evaluatable_expressionP(arg1);
        }
    }

    public static final class $clear_cmls_decoding_table$ZeroArityFunction extends ZeroArityFunction {
        public $clear_cmls_decoding_table$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-CMLS-DECODING-TABLE"));
        }

        @Override
        public SubLObject processItem() {
            return clear_cmls_decoding_table();
        }
    }

    static private final SubLSymbol $sym1$NON_SKSI_EVALUATABLE_EXPRESSION_ = makeSymbol("NON-SKSI-EVALUATABLE-EXPRESSION?");

    public static final SubLSymbol $kw6$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt14 = list(makeSymbol("LOGICAL-SCHEMA"), makeSymbol("CYCL-INPUT"));

    static private final SubLList $list_alt16 = list(makeSymbol("EXP-SKS"), makeSymbol("LOGICAL-SCHEMA"), makeSymbol("CYCL-INPUT"));

    static private final SubLList $list_alt17 = list(makeSymbol("LOGICAL-SCHEMA"), makeSymbol("RAW-INPUT"));

    static private final SubLList $list_alt19 = list(makeSymbol("EXP-SKS"), makeSymbol("LOGICAL-SCHEMA"), makeSymbol("RAW-INPUT"));

    static private final SubLList $list_alt22 = list(makeSymbol("CYCL-INPUT"), makeSymbol("ENTITY-TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("GUID"));

    static private final SubLList $list_alt24 = list(makeSymbol("CITY-STRING"), makeSymbol("THE-COUNTRY"));

    static private final SubLList $list_alt28 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));

    static private final SubLString $str_alt32$Dwimming__s_to__s = makeString("Dwimming ~s to ~s");

    static private final SubLString $str_alt35$Could_not_encode_ = makeString("Could not encode ");

    static private final SubLString $str_alt36$_using_logical_schema_ = makeString(" using logical schema ");

    static private final SubLString $str_alt37$_as_part_of_ = makeString(" as part of ");
}

/**
 * Total time: 268 ms
 */
