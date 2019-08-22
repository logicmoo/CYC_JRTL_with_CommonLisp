/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.assertion_handles.assertion_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$evaluatable_backchain_enabled$;
import static com.cyc.cycjava.cycl.control_vars.$hl_failure_backchaining$;
import static com.cyc.cycjava.cycl.control_vars.$proof_checker_rules$;
import static com.cyc.cycjava.cycl.control_vars.$proof_checking_enabled$;
import static com.cyc.cycjava.cycl.control_vars.$unbound_rule_backchain_enabled$;
import static com.cyc.cycjava.cycl.el_utilities.el_relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.occurs_as_sequence_variable_in_clauseP;
import static com.cyc.cycjava.cycl.el_utilities.occurs_as_term_variable_in_clauseP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nset_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      BACKWARD-UTILITIES
 * source file: /cyc/top/cycl/backward-utilities.lisp
 * created:     2019/07/03 17:37:37
 */
public final class backward_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new backward_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.backward_utilities";


    // defparameter
    // Definitions
    /**
     * The overhead of doing any recursive ask.
     */
    @LispMethod(comment = "The overhead of doing any recursive ask.\ndefparameter")
    public static final SubLSymbol $inference_recursive_query_overhead$ = makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $directions_for_forward_inference$ = makeSymbol("*DIRECTIONS-FOR-FORWARD-INFERENCE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $directions_for_backward_inference$ = makeSymbol("*DIRECTIONS-FOR-BACKWARD-INFERENCE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("FORWARD"));

    static private final SubLList $list1 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"));







    static private final SubLList $list7 = list(reader_make_constant_shell("Thing"));



    private static final SubLSymbol INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL = makeSymbol("INFERENCE-CANONICALIZE-HL-SUPPORT-LITERAL");

    static private final SubLList $list13 = list(makeSymbol("INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT"));

    private static final SubLSymbol INFERENCE_MAKE_COMMUTATIVE_LITERAL = makeSymbol("INFERENCE-MAKE-COMMUTATIVE-LITERAL");

    static private final SubLList $list15 = list(makeSymbol("INFERENCE-MAKE-COMMUTATIVE-ASENT"));

    static private final SubLSymbol $sym16$CYC_VAR_ = makeSymbol("CYC-VAR?");

    public static final SubLObject rule_relevant_to_proof_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == $proof_checking_enabled$.getDynamicValue(thread)) || (NIL != member(assertion, $proof_checker_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject rule_relevant_to_proof(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == $proof_checking_enabled$.getDynamicValue(thread)) || (NIL != member(assertion, $proof_checker_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject relevant_directions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))) {
                return $directions_for_forward_inference$.getGlobalValue();
            }
            return $directions_for_backward_inference$.getGlobalValue();
        }
    }

    public static SubLObject relevant_directions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))) {
            return $directions_for_forward_inference$.getGlobalValue();
        }
        return $directions_for_backward_inference$.getGlobalValue();
    }

    public static final SubLObject direction_is_relevant_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            {
                SubLObject direction = assertions_high.assertion_direction(assertion);
                if ((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))) {
                    return member(direction, $directions_for_forward_inference$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                }
                return member(direction, $directions_for_backward_inference$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject direction_is_relevant(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        if ((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))) {
            return member(direction, $directions_for_forward_inference$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        return member(direction, $directions_for_backward_inference$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Remove duplicate literals from LITERALS and drop those in EXCLUDE-SET
     */
    @LispMethod(comment = "Remove duplicate literals from LITERALS and drop those in EXCLUDE-SET")
    public static final SubLObject duplicate_literal_cleanup_alt(SubLObject literals, SubLObject exclude_set) {
        if (exclude_set == UNPROVIDED) {
            exclude_set = NIL;
        }
        if (NIL != literals) {
            literals = delete_duplicates(literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != exclude_set) {
                literals = nset_difference(literals, exclude_set, symbol_function(EQUAL), UNPROVIDED);
            }
            return literals;
        }
        return NIL;
    }

    /**
     * Remove duplicate literals from LITERALS and drop those in EXCLUDE-SET
     */
    @LispMethod(comment = "Remove duplicate literals from LITERALS and drop those in EXCLUDE-SET")
    public static SubLObject duplicate_literal_cleanup(SubLObject literals, SubLObject exclude_set) {
        if (exclude_set == UNPROVIDED) {
            exclude_set = NIL;
        }
        if (NIL != literals) {
            literals = delete_duplicates(literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != exclude_set) {
                literals = nset_difference(literals, exclude_set, symbol_function(EQUAL), UNPROVIDED);
            }
            return literals;
        }
        return NIL;
    }

    /**
     * Check for variables mentioned in LITERAL but not also mentioned in DEPENDENT-DNF.
     * For such variables, compute their type constraints implied by their originating
     * SUPPORT, or #$Thing if the arg-type code yields no type constraints.
     */
    @LispMethod(comment = "Check for variables mentioned in LITERAL but not also mentioned in DEPENDENT-DNF.\r\nFor such variables, compute their type constraints implied by their originating\r\nSUPPORT, or #$Thing if the arg-type code yields no type constraints.\nCheck for variables mentioned in LITERAL but not also mentioned in DEPENDENT-DNF.\nFor such variables, compute their type constraints implied by their originating\nSUPPORT, or #$Thing if the arg-type code yields no type constraints.")
    public static final SubLObject additional_source_variable_pos_lits_alt(SubLObject literal, SubLObject dependent_dnf, SubLObject support) {
        {
            SubLObject literal_vars = list_utilities.tree_gather(literal, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject unintroduced_literal_vars = NIL;
            if (NIL == literal_vars) {
                return NIL;
            }
            {
                SubLObject cdolist_list_var = literal_vars;
                SubLObject literal_var = NIL;
                for (literal_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal_var = cdolist_list_var.first()) {
                    if (NIL == list_utilities.tree_find(literal_var, dependent_dnf, UNPROVIDED, UNPROVIDED)) {
                        unintroduced_literal_vars = cons(literal_var, unintroduced_literal_vars);
                    }
                }
            }
            if (NIL == unintroduced_literal_vars) {
                return NIL;
            }
            {
                SubLObject support_cnf = NIL;
                SubLObject additional_pos_lits = NIL;
                if (NIL != assertion_p(support)) {
                    {
                        SubLObject cnf = assertions_high.assertion_cnf(support);
                        support_cnf = (NIL != clause_utilities.neg_atomic_clause_p(cnf)) ? ((SubLObject) (clause_utilities.make_gaf_cnf(clauses.neg_lits(cnf).first()))) : cnf;
                    }
                } else {
                    support_cnf = clause_utilities.make_gaf_cnf(literal);
                }
                {
                    SubLObject cdolist_list_var = unintroduced_literal_vars;
                    SubLObject unintroduced_literal_var = NIL;
                    for (unintroduced_literal_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unintroduced_literal_var = cdolist_list_var.first()) {
                        if (NIL != list_utilities.tree_find(unintroduced_literal_var, support_cnf, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject some_additional_pos_lits = com.cyc.cycjava.cycl.backward_utilities.constraint_sentences_for_transformation_variable(unintroduced_literal_var, support_cnf);
                                additional_pos_lits = nconc(some_additional_pos_lits, additional_pos_lits);
                            }
                        }
                    }
                }
                return nreverse(additional_pos_lits);
            }
        }
    }

    /**
     * Check for variables mentioned in LITERAL but not also mentioned in DEPENDENT-DNF.
     * For such variables, compute their type constraints implied by their originating
     * SUPPORT, or #$Thing if the arg-type code yields no type constraints.
     */
    @LispMethod(comment = "Check for variables mentioned in LITERAL but not also mentioned in DEPENDENT-DNF.\r\nFor such variables, compute their type constraints implied by their originating\r\nSUPPORT, or #$Thing if the arg-type code yields no type constraints.\nCheck for variables mentioned in LITERAL but not also mentioned in DEPENDENT-DNF.\nFor such variables, compute their type constraints implied by their originating\nSUPPORT, or #$Thing if the arg-type code yields no type constraints.")
    public static SubLObject additional_source_variable_pos_lits(final SubLObject literal, final SubLObject dependent_dnf, final SubLObject support) {
        final SubLObject literal_vars = list_utilities.tree_gather(literal, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject unintroduced_literal_vars = NIL;
        if (NIL == literal_vars) {
            return NIL;
        }
        SubLObject cdolist_list_var = literal_vars;
        SubLObject literal_var = NIL;
        literal_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == list_utilities.tree_find(literal_var, dependent_dnf, UNPROVIDED, UNPROVIDED)) {
                unintroduced_literal_vars = cons(literal_var, unintroduced_literal_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal_var = cdolist_list_var.first();
        } 
        if (NIL == unintroduced_literal_vars) {
            return NIL;
        }
        SubLObject support_cnf = NIL;
        SubLObject additional_pos_lits = NIL;
        if (NIL != assertion_handles.assertion_p(support)) {
            final SubLObject cnf = assertions_high.assertion_cnf(support);
            support_cnf = (NIL != clause_utilities.neg_atomic_clause_p(cnf)) ? clause_utilities.make_gaf_cnf(clauses.neg_lits(cnf).first()) : cnf;
        } else {
            support_cnf = clause_utilities.make_gaf_cnf(literal);
        }
        SubLObject cdolist_list_var2 = unintroduced_literal_vars;
        SubLObject unintroduced_literal_var = NIL;
        unintroduced_literal_var = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != list_utilities.tree_find(unintroduced_literal_var, support_cnf, UNPROVIDED, UNPROVIDED)) {
                final SubLObject some_additional_pos_lits = constraint_sentences_for_transformation_variable(unintroduced_literal_var, support_cnf);
                additional_pos_lits = nconc(some_additional_pos_lits, additional_pos_lits);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            unintroduced_literal_var = cdolist_list_var2.first();
        } 
        return nreverse(additional_pos_lits);
    }

    public static final SubLObject constraint_sentences_for_transformation_variable_alt(SubLObject var, SubLObject support_cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject additional_pos_lits = NIL;
                SubLObject isa_constraints = genls.min_cols(at_var_types.cnf_variable_isa_constraints(var, support_cnf, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                SubLObject genl_constraints = genls.min_cols(at_var_types.cnf_variable_genl_constraints(var, support_cnf, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = isa_constraints;
                    SubLObject isa_constraint = NIL;
                    for (isa_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_constraint = cdolist_list_var.first()) {
                        additional_pos_lits = cons(list($$isa, var, isa_constraint), additional_pos_lits);
                    }
                }
                {
                    SubLObject cdolist_list_var = genl_constraints;
                    SubLObject genl_constraint = NIL;
                    for (genl_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_constraint = cdolist_list_var.first()) {
                        additional_pos_lits = cons(list($$genls, var, genl_constraint), additional_pos_lits);
                    }
                }
                if ((NIL == isa_constraints) && (NIL == genl_constraints)) {
                    if (NIL != occurs_as_sequence_variable_in_clauseP(var, support_cnf)) {
                        additional_pos_lits = cons(listS($$isa, bq_cons($$TheList, var), $list_alt7), additional_pos_lits);
                    }
                    if (NIL != occurs_as_term_variable_in_clauseP(var, support_cnf)) {
                        additional_pos_lits = cons(listS($$isa, var, $list_alt7), additional_pos_lits);
                    }
                }
                return nreverse(additional_pos_lits);
            }
        }
    }

    public static SubLObject constraint_sentences_for_transformation_variable(final SubLObject var, final SubLObject support_cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject additional_pos_lits = NIL;
        final SubLObject isa_constraints = genls.min_cols(at_var_types.cnf_variable_isa_constraints(var, support_cnf, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
        final SubLObject genl_constraints = genls.min_cols(at_var_types.cnf_variable_genl_constraints(var, support_cnf, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject isa_constraint = NIL;
        isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            additional_pos_lits = cons(list($$isa, var, isa_constraint), additional_pos_lits);
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        } 
        cdolist_list_var = genl_constraints;
        SubLObject genl_constraint = NIL;
        genl_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            additional_pos_lits = cons(list($$genls, var, genl_constraint), additional_pos_lits);
            cdolist_list_var = cdolist_list_var.rest();
            genl_constraint = cdolist_list_var.first();
        } 
        if ((NIL == isa_constraints) && (NIL == genl_constraints)) {
            if (NIL != occurs_as_sequence_variable_in_clauseP(var, support_cnf)) {
                additional_pos_lits = cons(listS($$isa, bq_cons($$TheList, var), $list7), additional_pos_lits);
            }
            if (NIL != occurs_as_term_variable_in_clauseP(var, support_cnf)) {
                additional_pos_lits = cons(listS($$isa, var, $list7), additional_pos_lits);
            }
        }
        return nreverse(additional_pos_lits);
    }

    /**
     * Return T iff we can prove that it is not possible to backchain to
     * prove a LITERAL of SENSE.  This must be conservative.
     */
    @LispMethod(comment = "Return T iff we can prove that it is not possible to backchain to\r\nprove a LITERAL of SENSE.  This must be conservative.\nReturn T iff we can prove that it is not possible to backchain to\nprove a LITERAL of SENSE.  This must be conservative.")
    public static final SubLObject inference_backchain_impossible_alt(SubLObject literal, SubLObject sense, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                if (NIL == forts.fort_p(predicate)) {
                    return NIL;
                } else {
                    if (NIL != inference_trampolines.inference_backchain_forbiddenP(predicate, mt)) {
                        return T;
                    } else {
                        if ($$isa == predicate) {
                            if ((NIL != $hl_failure_backchaining$.getDynamicValue(thread)) || (NIL != $unbound_rule_backchain_enabled$.getDynamicValue(thread))) {
                                return NIL;
                            }
                            {
                                SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
                                if ((NIL != forts.fort_p(arg2)) && (NIL != inference_trampolines.inference_collection_backchain_encouragedP(arg2, mt))) {
                                    return NIL;
                                }
                            }
                            return T;
                        } else {
                            if (NIL != hl_supports.hl_predicate_p(predicate)) {
                                return makeBoolean(NIL == $hl_failure_backchaining$.getDynamicValue(thread));
                            } else {
                                if (NIL != inference_trampolines.inference_evaluatable_predicateP(predicate)) {
                                    return makeBoolean(NIL == $evaluatable_backchain_enabled$.getDynamicValue(thread));
                                } else {
                                    if (predicate == $$abnormal) {
                                        return eq($NEG, sense);
                                    } else {
                                        if (((kb_indexing.num_predicate_rule_index(predicate, $POS, UNPROVIDED, UNPROVIDED).isPositive() || kb_indexing.num_predicate_rule_index(predicate, $NEG, UNPROVIDED, UNPROVIDED).isPositive()) || (NIL != inference_trampolines.inference_some_spec_pred_or_inverseP(predicate))) || (NIL != inference_trampolines.inference_some_genl_pred_or_inverseP(predicate))) {
                                            return NIL;
                                        } else {
                                            return makeBoolean(NIL == $unbound_rule_backchain_enabled$.getDynamicValue(thread));
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

    /**
     * Return T iff we can prove that it is not possible to backchain to
     * prove a LITERAL of SENSE.  This must be conservative.
     */
    @LispMethod(comment = "Return T iff we can prove that it is not possible to backchain to\r\nprove a LITERAL of SENSE.  This must be conservative.\nReturn T iff we can prove that it is not possible to backchain to\nprove a LITERAL of SENSE.  This must be conservative.")
    public static SubLObject inference_backchain_impossible(final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        if (NIL == forts.fort_p(predicate)) {
            return NIL;
        }
        if (NIL != inference_trampolines.inference_backchain_forbiddenP(predicate, mt)) {
            return T;
        }
        if ($$isa.eql(predicate)) {
            if ((NIL != $hl_failure_backchaining$.getDynamicValue(thread)) || (NIL != $unbound_rule_backchain_enabled$.getDynamicValue(thread))) {
                return NIL;
            }
            final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
            if ((NIL != forts.fort_p(arg2)) && (NIL != inference_trampolines.inference_collection_backchain_encouragedP(arg2, mt))) {
                return NIL;
            }
            return T;
        } else {
            if (NIL != hl_supports.hl_predicate_p(predicate)) {
                return makeBoolean(NIL == $hl_failure_backchaining$.getDynamicValue(thread));
            }
            if (NIL != inference_trampolines.inference_evaluatable_predicateP(predicate)) {
                return makeBoolean(NIL == $evaluatable_backchain_enabled$.getDynamicValue(thread));
            }
            if (predicate.eql($$abnormal)) {
                return eq($NEG, sense);
            }
            if (((kb_indexing.num_predicate_rule_index(predicate, $POS, UNPROVIDED, UNPROVIDED).isPositive() || kb_indexing.num_predicate_rule_index(predicate, $NEG, UNPROVIDED, UNPROVIDED).isPositive()) || (NIL != inference_trampolines.inference_some_spec_pred_or_inverseP(predicate))) || (NIL != inference_trampolines.inference_some_genl_pred_or_inverseP(predicate))) {
                return NIL;
            }
            return makeBoolean(NIL == $unbound_rule_backchain_enabled$.getDynamicValue(thread));
        }
    }

    /**
     * Return T iff PREDICATE is one for which we currently allow the backchaining HL modules to fire.
     */
    @LispMethod(comment = "Return T iff PREDICATE is one for which we currently allow the backchaining HL modules to fire.")
    public static final SubLObject transformation_backchain_for_predicateP_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != forts.fort_p(predicate)) && ((NIL != $hl_failure_backchaining$.getDynamicValue(thread)) || (NIL == hl_supports.hl_predicate_p(predicate)))) && ((NIL != $evaluatable_backchain_enabled$.getDynamicValue(thread)) || (NIL == inference_trampolines.inference_evaluatable_predicateP(predicate))));
        }
    }

    @LispMethod(comment = "Return T iff PREDICATE is one for which we currently allow the backchaining HL modules to fire.")
    public static SubLObject transformation_backchain_for_predicateP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != forts.fort_p(predicate)) && ((NIL != $hl_failure_backchaining$.getDynamicValue(thread)) || (NIL == hl_supports.hl_predicate_p(predicate)))) && ((NIL != $evaluatable_backchain_enabled$.getDynamicValue(thread)) || (NIL == inference_trampolines.inference_evaluatable_predicateP(predicate))));
    }/**
     * Return T iff PREDICATE is one for which we currently allow the backchaining HL modules to fire.
     */


    public static final SubLObject inference_canonicalize_hl_support_asent_alt(SubLObject asent) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL == inference_trampolines.inference_commutative_relationP(predicate)) {
                return asent;
            }
            return com.cyc.cycjava.cycl.backward_utilities.inference_make_commutative_asent(predicate, cycl_utilities.atomic_sentence_args(asent, UNPROVIDED));
        }
    }

    public static SubLObject inference_canonicalize_hl_support_asent(final SubLObject asent) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL == inference_trampolines.inference_commutative_relationP(predicate)) {
            return asent;
        }
        return inference_make_commutative_asent(predicate, cycl_utilities.atomic_sentence_args(asent, UNPROVIDED));
    }

    public static final SubLObject inference_make_commutative_asent_alt(SubLObject predicate, SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        args = com.cyc.cycjava.cycl.backward_utilities.inference_canonicalize_commutative_args(args);
        return bq_cons(predicate, append(args, NIL));
    }

    public static SubLObject inference_make_commutative_asent(final SubLObject predicate, SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        args = inference_canonicalize_commutative_args(args);
        return bq_cons(predicate, append(args, NIL));
    }

    public static final SubLObject inference_canonicalize_commutative_args_alt(SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        return kb_utilities.sort_terms(args, T, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_canonicalize_commutative_args(final SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        return kb_utilities.sort_terms(args, T, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_canonicalize_hl_support_literal_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.backward_utilities.inference_canonicalize_hl_support_asent(asent);
    }

    public static SubLObject inference_canonicalize_hl_support_literal(final SubLObject asent) {
        return inference_canonicalize_hl_support_asent(asent);
    }

    public static final SubLObject inference_make_commutative_literal_alt(SubLObject predicate, SubLObject args) {
        return com.cyc.cycjava.cycl.backward_utilities.inference_make_commutative_asent(predicate, args);
    }

    public static SubLObject inference_make_commutative_literal(final SubLObject predicate, final SubLObject args) {
        return inference_make_commutative_asent(predicate, args);
    }

    public static final SubLObject inference_term_free_variables_alt(SubLObject v_term) {
        if (NIL == list_utilities.tree_find_if(symbol_function(VARIABLE_P), v_term, UNPROVIDED)) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.backward_utilities.temp_term_free_variables(v_term, symbol_function(VARIABLE_P));
    }

    public static SubLObject inference_term_free_variables(final SubLObject v_term) {
        if (NIL == list_utilities.tree_find_if(symbol_function(VARIABLE_P), v_term, UNPROVIDED)) {
            return NIL;
        }
        return temp_term_free_variables(v_term, symbol_function(VARIABLE_P));
    }

    public static final SubLObject inference_literal_free_variables_alt(SubLObject literal) {
        if (NIL == list_utilities.tree_find_if(symbol_function(VARIABLE_P), literal, UNPROVIDED)) {
            return NIL;
        }
        return literal_free_variables(literal, NIL, symbol_function(VARIABLE_P), UNPROVIDED);
    }

    public static SubLObject inference_literal_free_variables(final SubLObject literal) {
        if (NIL == list_utilities.tree_find_if(symbol_function(VARIABLE_P), literal, UNPROVIDED)) {
            return NIL;
        }
        return literal_free_variables(literal, NIL, symbol_function(VARIABLE_P), UNPROVIDED);
    }

    public static final SubLObject inference_clause_free_variables_alt(SubLObject clause) {
        if (NIL == list_utilities.tree_find_if(symbol_function(VARIABLE_P), clause, UNPROVIDED)) {
            return NIL;
        }
        return clause_utilities.clause_free_variables(clause, symbol_function(VARIABLE_P), UNPROVIDED);
    }

    public static SubLObject inference_clause_free_variables(final SubLObject clause) {
        if (NIL == list_utilities.tree_find_if(symbol_function(VARIABLE_P), clause, UNPROVIDED)) {
            return NIL;
        }
        return clause_utilities.clause_free_variables(clause, symbol_function(VARIABLE_P), UNPROVIDED);
    }

    public static final SubLObject temp_term_free_variables_alt(SubLObject function_expression, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym16$CYC_VAR_;
        }
        if (NIL != el_relation_expressionP(function_expression)) {
            return literal_free_variables(function_expression, NIL, varP, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject temp_term_free_variables(final SubLObject function_expression, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym16$CYC_VAR_;
        }
        if (NIL != el_relation_expressionP(function_expression)) {
            return literal_free_variables(function_expression, NIL, varP, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject inference_closed_termP_alt(SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) || (v_term.isAtom() && (NIL == variables.variable_p(v_term)))) || (NIL == com.cyc.cycjava.cycl.backward_utilities.inference_term_free_variables(v_term)));
    }

    public static SubLObject inference_closed_termP(final SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) || (v_term.isAtom() && (NIL == variables.variable_p(v_term)))) || (NIL == inference_term_free_variables(v_term)));
    }

    public static final SubLObject inference_closed_literalP_alt(SubLObject literal) {
        return sublisp_null(com.cyc.cycjava.cycl.backward_utilities.inference_literal_free_variables(literal));
    }

    public static SubLObject inference_closed_literalP(final SubLObject literal) {
        return sublisp_null(inference_literal_free_variables(literal));
    }

    public static final SubLObject inference_closed_clauseP_alt(SubLObject clause) {
        return sublisp_null(com.cyc.cycjava.cycl.backward_utilities.inference_clause_free_variables(clause));
    }

    public static SubLObject inference_closed_clauseP(final SubLObject clause) {
        return sublisp_null(inference_clause_free_variables(clause));
    }

    public static SubLObject declare_backward_utilities_file() {
        declareFunction("rule_relevant_to_proof", "RULE-RELEVANT-TO-PROOF", 1, 0, false);
        declareFunction("relevant_directions", "RELEVANT-DIRECTIONS", 0, 0, false);
        declareFunction("direction_is_relevant", "DIRECTION-IS-RELEVANT", 1, 0, false);
        declareFunction("duplicate_literal_cleanup", "DUPLICATE-LITERAL-CLEANUP", 1, 1, false);
        declareFunction("additional_source_variable_pos_lits", "ADDITIONAL-SOURCE-VARIABLE-POS-LITS", 3, 0, false);
        declareFunction("constraint_sentences_for_transformation_variable", "CONSTRAINT-SENTENCES-FOR-TRANSFORMATION-VARIABLE", 2, 0, false);
        declareFunction("inference_backchain_impossible", "INFERENCE-BACKCHAIN-IMPOSSIBLE", 3, 0, false);
        declareFunction("transformation_backchain_for_predicateP", "TRANSFORMATION-BACKCHAIN-FOR-PREDICATE?", 1, 0, false);
        declareFunction("inference_canonicalize_hl_support_asent", "INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT", 1, 0, false);
        declareFunction("inference_make_commutative_asent", "INFERENCE-MAKE-COMMUTATIVE-ASENT", 2, 0, false);
        declareFunction("inference_canonicalize_commutative_args", "INFERENCE-CANONICALIZE-COMMUTATIVE-ARGS", 1, 0, false);
        declareFunction("inference_canonicalize_hl_support_literal", "INFERENCE-CANONICALIZE-HL-SUPPORT-LITERAL", 1, 0, false);
        declareFunction("inference_make_commutative_literal", "INFERENCE-MAKE-COMMUTATIVE-LITERAL", 2, 0, false);
        declareFunction("inference_term_free_variables", "INFERENCE-TERM-FREE-VARIABLES", 1, 0, false);
        declareFunction("inference_literal_free_variables", "INFERENCE-LITERAL-FREE-VARIABLES", 1, 0, false);
        declareFunction("inference_clause_free_variables", "INFERENCE-CLAUSE-FREE-VARIABLES", 1, 0, false);
        declareFunction("temp_term_free_variables", "TEMP-TERM-FREE-VARIABLES", 1, 1, false);
        declareFunction("inference_closed_termP", "INFERENCE-CLOSED-TERM?", 1, 0, false);
        declareFunction("inference_closed_literalP", "INFERENCE-CLOSED-LITERAL?", 1, 0, false);
        declareFunction("inference_closed_clauseP", "INFERENCE-CLOSED-CLAUSE?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_backward_utilities_file() {
        defparameter("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*", TWENTY_INTEGER);
        deflexical("*DIRECTIONS-FOR-FORWARD-INFERENCE*", $list0);
        deflexical("*DIRECTIONS-FOR-BACKWARD-INFERENCE*", $list1);
        return NIL;
    }

    public static SubLObject setup_backward_utilities_file() {
        define_obsolete_register(INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL, $list13);
        define_obsolete_register(INFERENCE_MAKE_COMMUTATIVE_LITERAL, $list15);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_backward_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_backward_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_backward_utilities_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("FORWARD"));

    static private final SubLList $list_alt1 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"));

    static private final SubLList $list_alt7 = list(reader_make_constant_shell("Thing"));

    static private final SubLList $list_alt13 = list(makeSymbol("INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT"));

    static private final SubLList $list_alt15 = list(makeSymbol("INFERENCE-MAKE-COMMUTATIVE-ASENT"));
}

/**
 * Total time: 178 ms
 */
