package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_czer extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_czer";
    public static String myFingerPrint = "99f8108d6484b009d2a0fb6b3719cb65837d70e058451706865d1eca495158b5";
    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 1300L)
    private static SubLSymbol $inference_sort_principledP$;
    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 8000L)
    private static SubLSymbol $backchaining_on_ist_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15600L)
    private static SubLSymbol $inference_czer_fixed_vars_table$;
    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15700L)
    private static SubLSymbol $inference_czer_next_fixed_var_id$;
    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17000L)
    private static SubLSymbol $inference_czer_at_least_partially_commutative_relations_alist$;
    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 22400L)
    private static SubLSymbol $variable_token$;
    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26600L)
    private static SubLSymbol $largest_hl_var_num_so_far$;
    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 27400L)
    private static SubLSymbol $hl_var_contiguity_alist$;
    private static SubLSymbol $sym0$INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE;
    private static SubLList $list1;
    private static SubLObject $$False;
    private static SubLObject $$True;
    private static SubLObject $$trueSentence;
    private static SubLList $list5;
    private static SubLObject $$elementOf;
    private static SubLList $list7;
    private static SubLObject $$isa;
    private static SubLSymbol $sym9$INFERENCE_CLAUSE__;
    private static SubLSymbol $sym10$INFERENCE_CONTEXTUALIZED_ASENT__;
    private static SubLString $str11$The_type_of_object__a_cannot_be_s;
    private static SubLString $str12$Got_a_CycL_term_of_unknown_infere;
    private static SubLSymbol $sym13$NON_FIXED_VARIABLE_P;
    private static SubLSymbol $INFERENCE_CZER_FIXED_VARIABLE;
    private static SubLSymbol $CACHE_MISS;
    private static SubLObject $$CommutativeRelation;
    private static SubLObject $$PartiallyCommutativeRelation;
    private static SubLSymbol $sym18$_VARIABLE_TOKEN_;
    private static SubLString $str19$var;
    private static SubLList $list20;
    private static SubLSymbol $sym21$VARIABLE_TOKEN;
    private static SubLSymbol $NOT_UNIQUE;
    private static SubLList $list23;
    private static SubLSymbol $sym24$VARIABLE_P;
    private static SubLSymbol $LAMBDA;
    private static SubLSymbol $sym26$NON_CONTIGUOUS_HL_VAR_;
    private static SubLSymbol $sym27$POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR;
    private static SubLSymbol $REQUIRE_EQUAL;
    private static SubLSymbol $POLICY_VIOLATION;
    private static SubLSymbol $COMPUTE_INTERSECTION;
    private static SubLSymbol $COMPUTE_UNION;
    private static SubLString $str32$Unexpected_inference_disjunction_;
    private static SubLSymbol $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED;
    private static SubLSymbol $ILL_FORMED;
    private static SubLString $str35$Got_a_czer_result_of_unexpected_t;
    private static SubLList $list36;
    private static SubLList $list37;
    private static SubLList $list38;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLList $list40;
    private static SubLSymbol $sym41$INFERENCE_TERM__;
    private static SubLSymbol $sym42$EL_VARIABLE_P;
    private static SubLString $str43$Something_weird_happened_when_try;
    private static SubLSymbol $sym44$_EXIT;
    private static SubLSymbol $UNSPECIFIED;
    private static SubLSymbol $DNF;
    private static SubLSymbol $CNF;
    private static SubLSymbol $sym48$IST_SENTENCE_WITH_CHLMT_P;
    private static SubLObject $$ist;
    private static SubLSymbol $CONJUNCTION;
    private static SubLSymbol $DISJUNCTION;
    private static SubLSymbol $NEG;
    private static SubLSymbol $POS;
    private static SubLSymbol $sym54$_;
    private static SubLSymbol $sym55$CDR;
    private static SubLList $list56;
    private static SubLString $str57$Can_t_canonicalize_hypothesis__S;
    private static SubLSymbol $IGNORE;
    private static SubLObject $$and;
    private static SubLSymbol $sym60$EL_CONJUNCTION_P;
    private static SubLObject $$assertionDirection;
    private static SubLObject $$constraint;
    private static SubLObject $$highlyRelevantAssertion;
    private static SubLObject $$irrelevantAssertion;
    private static SubLObject $$knownAntecedentRule;
    private static SubLObject $$queryExtentCached;
    private static SubLObject $$genlRules;
    private static SubLObject $$universalLiftingRule;

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 1400L)
    public static SubLObject canonicalize_problem_query(SubLObject query) {
        query = conses_high.copy_tree(query);
        SubLObject simplified_query = inference_simplify_problem_query(query);
        SubLObject sorted_query = inference_sort_clauses_and_literals(simplified_query);
        SubLObject reduced_literals_query = inference_delete_duplicate_literals(sorted_query);
        SubLObject reduced_clauses_query = inference_delete_duplicate_clauses(reduced_literals_query);
        return contiguize_hl_vars_in_clauses(reduced_clauses_query);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 2200L)
    public static SubLObject inference_delete_duplicate_literals(SubLObject contextualized_dnf_clauses) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject any_reducedP = NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = NIL;
        contextualized_dnf_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject literals = clauses.neg_lits(contextualized_dnf_clause);
            if (NIL != literals && NIL == list_utilities.singletonP(literals)) {
                thread.resetMultipleValues();
                SubLObject reduced_literals = delete_duplicate_sorted_literals(literals);
                SubLObject reducedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                clauses.set_clause_neg_lits(contextualized_dnf_clause, reduced_literals);
                if (NIL != reducedP) {
                    any_reducedP = T;
                }
            }
            literals = clauses.pos_lits(contextualized_dnf_clause);
            if (NIL != literals && NIL == list_utilities.singletonP(literals)) {
                thread.resetMultipleValues();
                SubLObject reduced_literals = delete_duplicate_sorted_literals(literals);
                SubLObject reducedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                clauses.set_clause_pos_lits(contextualized_dnf_clause, reduced_literals);
                if (NIL != reducedP) {
                    any_reducedP = T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause = cdolist_list_var.first();
        }
        if (NIL != any_reducedP) {
            contextualized_dnf_clauses = inference_sort_clauses_and_literals(contextualized_dnf_clauses);
        }
        return contextualized_dnf_clauses;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 3300L)
    public static SubLObject inference_delete_duplicate_clauses(SubLObject contextualized_dnf_clauses) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            return contextualized_dnf_clauses;
        }
        thread.resetMultipleValues();
        SubLObject reduced_clauses = delete_duplicate_sorted_clauses(contextualized_dnf_clauses);
        SubLObject reducedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != reducedP) {
            reduced_clauses = inference_sort_clauses_and_literals(reduced_clauses);
        }
        return reduced_clauses;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 3900L)
    public static SubLObject delete_duplicate_sorted_literals(SubLObject literals) {
        SubLObject literal_count = Sequences.length(literals);
        SubLObject reduced_literals = list_utilities.delete_duplicates_sorted(literals, Symbols.symbol_function(EQUAL));
        SubLObject reduced_literal_count = Sequences.length(reduced_literals);
        SubLObject reducedP = Numbers.numL(reduced_literal_count, literal_count);
        return subl_promotions.values2(reduced_literals, reducedP);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 4200L)
    public static SubLObject delete_duplicate_sorted_clauses(SubLObject v_clauses) {
        SubLObject clause_count = Sequences.length(v_clauses);
        SubLObject reduced_clauses = list_utilities.delete_duplicates_sorted(v_clauses, Symbols.symbol_function(EQUAL));
        SubLObject reduced_clause_count = Sequences.length(reduced_clauses);
        SubLObject reducedP = Numbers.numL(reduced_clause_count, clause_count);
        return subl_promotions.values2(reduced_clauses, reducedP);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 4500L)
    public static SubLObject inference_simplify_problem_query(SubLObject contextualized_dnf_clauses) {
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = NIL;
        contextualized_dnf_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_simplify_contextualized_dnf_clause(contextualized_dnf_clause);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause = cdolist_list_var.first();
        }
        return contextualized_dnf_clauses;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 5700L)
    public static SubLObject inference_simplify_contextualized_dnf_clause(SubLObject contextualized_clause) {
        SubLObject neglits_to_become_poslits = NIL;
        SubLObject rest_neglits;
        SubLObject asent;
        for (rest_neglits = NIL, rest_neglits = contextualized_neg_lits(contextualized_clause); !rest_neglits.isAtom(); rest_neglits = rest_neglits.rest()) {
            asent = rest_neglits.first();
            if (NIL != el_utilities.true_sentence_p(inference_datastructures_problem_query.contextualized_asent_asent(asent))) {
                neglits_to_become_poslits = cons(asent, neglits_to_become_poslits);
            } else {
                rplaca(rest_neglits, inference_simplify_contextualized_asent(asent));
            }
        }
        if (NIL != neglits_to_become_poslits) {
            SubLObject new_neglits = contextualized_neg_lits(contextualized_clause);
            SubLObject cdolist_list_var = neglits_to_become_poslits;
            SubLObject moving_lit = NIL;
            moving_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                new_neglits = Sequences.delete(moving_lit, new_neglits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                moving_lit = cdolist_list_var.first();
            }
            clauses.set_clause_neg_lits(contextualized_clause, new_neglits);
            SubLObject canonicalized_new_poslits = list_utilities.nmapcar($sym0$INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE, neglits_to_become_poslits);
            clauses.set_clause_pos_lits(contextualized_clause, nconc(canonicalized_new_poslits, contextualized_pos_lits(contextualized_clause)));
        }
        SubLObject rest_poslits;
        SubLObject asent2;
        for (rest_poslits = NIL, rest_poslits = contextualized_pos_lits(contextualized_clause); !rest_poslits.isAtom(); rest_poslits = rest_poslits.rest()) {
            asent2 = rest_poslits.first();
            rplaca(rest_poslits, inference_simplify_contextualized_asent(asent2));
        }
        return contextualized_clause;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 7000L)
    public static SubLObject inference_simplify_negated_true_sentence(SubLObject contextualized_asent) {
        SubLObject mt = NIL;
        SubLObject true_sentence = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list1);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, $list1);
        true_sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject subsentence = cycl_utilities.sentence_arg1(true_sentence, UNPROVIDED);
            SubLObject negated_sub = NIL;
            SubLObject result = NIL;
            if (NIL != cycl_variables.hl_varP(subsentence)) {
                result = contextualized_asent;
            } else if (subsentence.eql($$False)) {
                negated_sub = $$True;
                result = convert_to_hl_contextualized_asent(list($$trueSentence, negated_sub), mt);
            } else {
                result = convert_to_hl_contextualized_asent(list($$trueSentence, inference_el_dnf(cycl_utilities.negate(subsentence), mt, UNPROVIDED)), mt);
            }
            return inference_simplify_contextualized_asent(result);
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, $list1);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 7700L)
    public static SubLObject inference_el_dnf(SubLObject sentence, SubLObject mt, SubLObject implicitify_universalsP) {
        if (implicitify_universalsP == UNPROVIDED) {
            implicitify_universalsP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
        SubLObject _prev_bind_2 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
        try {
            czer_vars.$turn_existentials_into_skolemsP$.bind(NIL, thread);
            czer_vars.$implicitify_universalsP$.bind(implicitify_universalsP, thread);
            result = clausifier.el_dnf(sentence, mt);
        } finally {
            czer_vars.$implicitify_universalsP$.rebind(_prev_bind_2, thread);
            czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 8000L)
    public static SubLObject backchaining_on_ist_enabledP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $backchaining_on_ist_enabledP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 8100L)
    public static SubLObject inference_simplify_contextualized_asent(SubLObject contextualized_asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, $list5);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == backchaining_on_ist_enabledP() && NIL == kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread) && NIL != el_utilities.ist_of_atomic_sentence_p(asent) && NIL != variables.fully_bound_p(el_utilities.designated_mt(asent))) {
                SubLObject subsentence = el_utilities.designated_sentence(asent);
                SubLObject sub_mt = el_utilities.designated_mt(asent);
                return convert_to_hl_contextualized_asent(subsentence, sub_mt);
            }
            if (NIL != el_utilities.ist_of_atomic_sentence_p(asent) && NIL != variables.fully_bound_p(el_utilities.designated_mt(asent))
                    && (NIL != mt_vars.core_microtheory_p(el_utilities.designated_mt(asent)) || (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt) && NIL == kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread)))) {
                SubLObject subsentence = el_utilities.designated_sentence(asent);
                SubLObject sub_mt = el_utilities.designated_mt(asent);
                return convert_to_hl_contextualized_asent(subsentence, sub_mt);
            }
            if (NIL != el_utilities.true_sentence_of_atomic_sentence_p(asent)) {
                SubLObject subsentence = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                return convert_to_hl_contextualized_asent(subsentence, mt);
            }
            if (!$$elementOf.eql(cycl_utilities.atomic_sentence_predicate(asent)) || NIL == formula_pattern_match.pattern_matches_formula_without_bindings($list7, asent)) {
                return contextualized_asent;
            }
            SubLObject hl_var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject el_var_1 = cycl_utilities.atomic_sentence_arg1(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
            SubLObject isa_asent = cycl_utilities.atomic_sentence_arg2(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
            SubLObject el_var_2 = cycl_utilities.atomic_sentence_arg1(isa_asent, UNPROVIDED);
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
            if (NIL != cycl_grammar.hl_variable_p(hl_var) && NIL != cycl_grammar.el_variable_p(el_var_1) && NIL != cycl_grammar.el_variable_p(el_var_2) && el_var_1.eql(el_var_2)) {
                return convert_to_hl_contextualized_asent(list($$isa, hl_var, collection), mt);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, $list5);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 10500L)
    public static SubLObject inference_sort_clauses_and_literals(SubLObject contextualized_dnf_clauses) {
        if (NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            SubLObject contextualized_dnf_clause = contextualized_dnf_clauses.first();
            SubLObject sorted_contextualized_dnf_clause = inference_sort_contextualized_clause_literals(contextualized_dnf_clause);
            return list(sorted_contextualized_dnf_clause);
        }
        SubLObject sorted_contextualized_dnf_clauses = NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause2 = NIL;
        contextualized_dnf_clause2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sorted_contextualized_dnf_clauses = cons(inference_sort_contextualized_clause_literals(contextualized_dnf_clause2), sorted_contextualized_dnf_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause2 = cdolist_list_var.first();
        }
        return inference_sort_contextualized_clauses(sorted_contextualized_dnf_clauses);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11200L)
    public static SubLObject inference_sort_contextualized_clause_literals(SubLObject contextualized_clause) {
        SubLObject neg_lits = contextualized_neg_lits(contextualized_clause);
        SubLObject pos_lits = contextualized_pos_lits(contextualized_clause);
        SubLObject new_neg_lits = inference_sort_contextualized_literals(neg_lits);
        SubLObject new_pos_lits = inference_sort_contextualized_literals(pos_lits);
        if (neg_lits.eql(new_neg_lits) && pos_lits.eql(new_pos_lits)) {
            return contextualized_clause;
        }
        SubLObject new_contextualized_clause = clauses.make_clause(new_neg_lits, new_pos_lits);
        return new_contextualized_clause;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11800L)
    public static SubLObject inference_sort_contextualized_clauses(SubLObject contextualized_clauses) {
        return Sort.sort(contextualized_clauses, $sym9$INFERENCE_CLAUSE__, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12000L)
    public static SubLObject inference_sort_contextualized_literals(SubLObject literals) {
        return inference_awesome_sort_contextualized_literals(literals);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12100L)
    public static SubLObject inference_simple_sort_contextualized_literals(SubLObject literals) {
        return Sort.sort(literals, $sym10$INFERENCE_CONTEXTUALIZED_ASENT__, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12200L)
    public static SubLObject inference_clause_L(SubLObject clause1, SubLObject clause2) {
        return inference_list_L(clause1, clause2);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12300L)
    public static SubLObject inference_contextualized_asent_L(SubLObject asent1, SubLObject asent2) {
        return inference_list_L(asent1, asent2);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12400L)
    public static SubLObject inference_list_L(SubLObject list1, SubLObject list2) {
        return inference_formula_L(list1, list2);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12500L)
    public static SubLObject inference_formula_L(SubLObject formula1, SubLObject formula2) {
        if (NIL != el_utilities.formula_arityL(formula1, formula2, UNPROVIDED)) {
            return T;
        }
        if (NIL != el_utilities.formula_arityG(formula1, formula2, UNPROVIDED)) {
            return NIL;
        }
        SubLObject seqvar1P = el_utilities.formula_with_sequence_termP(formula1);
        SubLObject seqvar2P = el_utilities.formula_with_sequence_termP(formula2);
        if (NIL == seqvar1P && NIL != seqvar2P) {
            return T;
        }
        if (NIL != seqvar1P && NIL == seqvar2P) {
            return NIL;
        }
        SubLObject terms1 = cycl_utilities.formula_terms(formula1, UNPROVIDED);
        SubLObject terms2 = cycl_utilities.formula_terms(formula2, UNPROVIDED);
        SubLObject term1 = NIL;
        SubLObject term1_$1 = NIL;
        SubLObject term2 = NIL;
        SubLObject term2_$2 = NIL;
        term1 = terms1;
        term1_$1 = term1.first();
        term2 = terms2;
        term2_$2 = term2.first();
        while (NIL != term2 || NIL != term1) {
            if (NIL != inference_term_L(term1_$1, term2_$2)) {
                return T;
            }
            if (NIL != inference_term_G(term1_$1, term2_$2)) {
                return NIL;
            }
            term1 = term1.rest();
            term1_$1 = term1.first();
            term2 = term2.rest();
            term2_$2 = term2.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 13200L)
    public static SubLObject inference_term_L(SubLObject term1, SubLObject term2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (term1.eql(term2)) {
            return NIL;
        }
        SubLObject type_code_1 = inference_term_type_code(term1);
        SubLObject type_code_2 = inference_term_type_code(term2);
        if (type_code_1.numL(type_code_2)) {
            return T;
        }
        if (type_code_1.numG(type_code_2)) {
            return NIL;
        }
        if (isConstSym(term1)) {
            return inference_constant_L(term1, term2);
        }
        if (NIL != nart_handles.nart_p(term1)) {
            return inference_nart_L(term1, term2);
        }
        if (NIL != fixed_variable_p(term1)) {
            return Numbers.numL(fixed_variable_id(term1), fixed_variable_id(term2));
        }
        if (NIL != variables.variable_p(term1)) {
            if (NIL != $inference_sort_principledP$.getDynamicValue(thread)) {
                return NIL;
            }
            return Numbers.numL(variables.variable_id(term1), variables.variable_id(term2));
        } else {
            if (NIL != cycl_variables.el_varP(term1)) {
                return NIL;
            }
            if (NIL != cycl_variables.permissible_keyword_varP(term1)) {
                return NIL;
            }
            if (NIL != el_utilities.el_formula_p(term1)) {
                return inference_formula_L(term1, term2);
            }
            if (term1.isNumber()) {
                return Numbers.numL(term1, term2);
            }
            if (term1.isString()) {
                return Strings.stringL(term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (term1.isSymbol()) {
                return Strings.stringL(Symbols.symbol_name(term1), Symbols.symbol_name(term2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (term1.isChar()) {
                return Characters.charL(term1, term2);
            }
            if (NIL != assertion_handles.assertion_p(term1)) {
                return inference_term_L(fi.assertion_hl_formula(term1, UNPROVIDED), fi.assertion_hl_formula(term2, UNPROVIDED));
            }
            Errors.error($str11$The_type_of_object__a_cannot_be_s, term1);
            return NIL;
        }
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 14600L)
    public static SubLObject inference_term_G(SubLObject term1, SubLObject term2) {
        return inference_term_L(term2, term1);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 14600L)
    public static SubLObject inference_term_type_code(SubLObject v_term) {
        if (isConstSym(v_term)) {
            return ZERO_INTEGER;
        }
        if (NIL != nart_handles.nart_p(v_term)) {
            return ONE_INTEGER;
        }
        if (NIL != fixed_variable_p(v_term)) {
            return ELEVEN_INTEGER;
        }
        if (NIL != variables.variable_p(v_term)) {
            return TWO_INTEGER;
        }
        if (NIL != cycl_variables.el_varP(v_term)) {
            return THREE_INTEGER;
        }
        if (NIL != cycl_variables.permissible_keyword_varP(v_term)) {
            return FOUR_INTEGER;
        }
        if (NIL != el_utilities.el_formula_p(v_term)) {
            return FIVE_INTEGER;
        }
        if (v_term.isNumber()) {
            return SIX_INTEGER;
        }
        if (v_term.isString()) {
            return SEVEN_INTEGER;
        }
        if (v_term.isSymbol()) {
            return EIGHT_INTEGER;
        }
        if (v_term.isChar()) {
            return NINE_INTEGER;
        }
        if (NIL != assertion_handles.assertion_p(v_term)) {
            return TEN_INTEGER;
        }
        Errors.error($str12$Got_a_CycL_term_of_unknown_infere, v_term);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15300L)
    public static SubLObject inference_constant_L(SubLObject constant1, SubLObject constant2) {
        SubLObject suid1 = constant_handles.constant_suid(constant1);
        SubLObject suid2 = constant_handles.constant_suid(constant2);
        return Numbers.numL(suid1, suid2);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15500L)
    public static SubLObject inference_nart_L(SubLObject nart1, SubLObject nart2) {
        SubLObject suid1 = nart_handles.nart_id(nart1);
        SubLObject suid2 = nart_handles.nart_id(nart2);
        return Numbers.numL(suid1, suid2);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15800L)
    public static SubLObject non_fixed_variable_p(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(
                NIL != list_utilities.alist_p($inference_czer_fixed_vars_table$.getDynamicValue(thread)) && NIL != cycl_grammar.hl_variable_p(v_object) && NIL == list_utilities.alist_has_keyP($inference_czer_fixed_vars_table$.getDynamicValue(thread), v_object, Symbols.symbol_function(EQL)));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16100L)
    public static SubLObject fixed_variable_p(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(
                NIL != list_utilities.alist_p($inference_czer_fixed_vars_table$.getDynamicValue(thread)) && NIL != cycl_grammar.hl_variable_p(v_object) && NIL != list_utilities.alist_has_keyP($inference_czer_fixed_vars_table$.getDynamicValue(thread), v_object, Symbols.symbol_function(EQL)));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16400L)
    public static SubLObject fully_fixed_p(SubLObject tree) {
        return makeBoolean(NIL == list_utilities.tree_find_if($sym13$NON_FIXED_VARIABLE_P, tree, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16500L)
    public static SubLObject fixed_variable_id(SubLObject fixed_var) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup_without_values($inference_czer_fixed_vars_table$.getDynamicValue(thread), fixed_var, Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16600L)
    public static SubLObject fixed_variable_token(SubLObject fixed_var) {
        return list($INFERENCE_CZER_FIXED_VARIABLE, fixed_variable_id(fixed_var));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16700L)
    public static SubLObject fixed_variable_token_p(SubLObject v_object) {
        return list_utilities.list_with_first_p(v_object, $INFERENCE_CZER_FIXED_VARIABLE);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16900L)
    public static SubLObject fixed_variable_for_token(SubLObject token) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_reverse_lookup($inference_czer_fixed_vars_table$.getDynamicValue(thread), conses_high.second(token), Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17100L)
    public static SubLObject inference_czer_at_least_partially_commutative_relation_p(SubLObject pred) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        SubLObject cached_result = list_utilities.alist_lookup_without_values($inference_czer_at_least_partially_commutative_relations_alist$.getDynamicValue(thread), pred, Symbols.symbol_function(EQL), $CACHE_MISS);
        if ($CACHE_MISS == cached_result) {
            resultP = makeBoolean(NIL != variables.variable_p(pred) || NIL != fort_types_interface.fort_has_cached_typeP(pred, $$CommutativeRelation) || NIL != fort_types_interface.fort_has_cached_typeP(pred, $$PartiallyCommutativeRelation));
            $inference_czer_at_least_partially_commutative_relations_alist$.setDynamicValue(list_utilities.alist_enter($inference_czer_at_least_partially_commutative_relations_alist$.getDynamicValue(thread), pred, resultP, Symbols.symbol_function(EQL)), thread);
        } else {
            resultP = cached_result;
        }
        return resultP;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17900L)
    public static SubLObject inference_czer_not_at_all_commutative_relation_p(SubLObject pred) {
        return makeBoolean(NIL == inference_czer_at_least_partially_commutative_relation_p(pred));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 18000L)
    public static SubLObject not_at_all_commutative_contextualized_asent_p(SubLObject contextualized_asent) {
        SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return inference_czer_not_at_all_commutative_relation_p(pred);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 18300L)
    public static SubLObject at_least_partially_commutative_contextualized_asent_p(SubLObject contextualized_asent) {
        SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return inference_czer_at_least_partially_commutative_relation_p(pred);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 18600L)
    public static SubLObject inference_awesome_sort_contextualized_literals(SubLObject literals) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $inference_czer_fixed_vars_table$.currentBinding(thread);
        SubLObject _prev_bind_2 = $inference_czer_next_fixed_var_id$.currentBinding(thread);
        SubLObject _prev_bind_3 = $inference_czer_at_least_partially_commutative_relations_alist$.currentBinding(thread);
        try {
            $inference_czer_fixed_vars_table$.bind(NIL, thread);
            $inference_czer_next_fixed_var_id$.bind(ZERO_INTEGER, thread);
            $inference_czer_at_least_partially_commutative_relations_alist$.bind(NIL, thread);
            result = inference_awesome_sort_contextualized_literals_iterative(NIL, literals);
        } finally {
            $inference_czer_at_least_partially_commutative_relations_alist$.rebind(_prev_bind_3, thread);
            $inference_czer_next_fixed_var_id$.rebind(_prev_bind_2, thread);
            $inference_czer_fixed_vars_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 19000L)
    public static SubLObject inference_awesome_sort_contextualized_literals_iterative(SubLObject already_sorted_literals, SubLObject not_yet_sorted_literals) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject skip_fully_fixed_this_timeP = NIL;
        while (NIL == doneP) {
            if (NIL == not_yet_sorted_literals) {
                doneP = T;
            } else {
                thread.resetMultipleValues();
                SubLObject new_awesome_literals = pick_some_awesome_lits(not_yet_sorted_literals, skip_fully_fixed_this_timeP);
                SubLObject skip_fully_fixed_next_timeP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                skip_fully_fixed_this_timeP = skip_fully_fixed_next_timeP;
                already_sorted_literals = nconc(already_sorted_literals, new_awesome_literals);
                not_yet_sorted_literals = conses_high.set_difference(not_yet_sorted_literals, new_awesome_literals, Symbols.symbol_function(EQ), UNPROVIDED);
                if (NIL == not_yet_sorted_literals) {
                    continue;
                }
                inference_update_fixed_vars_table(new_awesome_literals);
            }
        }
        return already_sorted_literals;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 19800L)
    public static SubLObject pick_some_awesome_lits(SubLObject not_yet_sorted_literals, SubLObject skip_fully_fixedP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(not_yet_sorted_literals)) {
            return subl_promotions.values2(conses_high.copy_list(not_yet_sorted_literals), NIL);
        }
        SubLObject awesome_literals = NIL;
        SubLObject skip_fully_fixed_next_timeP = NIL;
        SubLObject principledP = T;
        if (NIL == skip_fully_fixedP) {
            awesome_literals = inference_fully_fixed_literals(not_yet_sorted_literals);
        }
        if (NIL != awesome_literals) {
            skip_fully_fixed_next_timeP = T;
        } else {
            awesome_literals = inference_unique_commutative_literals(not_yet_sorted_literals);
        }
        if (NIL == awesome_literals) {
            awesome_literals = inference_uniquely_constrained_literals(not_yet_sorted_literals);
        }
        if (NIL == awesome_literals) {
            awesome_literals = not_yet_sorted_literals;
            principledP = NIL;
        }
        SubLObject _prev_bind_0 = $inference_sort_principledP$.currentBinding(thread);
        try {
            $inference_sort_principledP$.bind(principledP, thread);
            awesome_literals = inference_simple_sort_contextualized_literals(awesome_literals);
        } finally {
            $inference_sort_principledP$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(awesome_literals, skip_fully_fixed_next_timeP);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 21800L)
    public static SubLObject inference_fully_fixed_literals(SubLObject not_yet_sorted_literals) {
        SubLObject fully_fixed_literals = NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fully_fixed_p(literal) && NIL != not_at_all_commutative_contextualized_asent_p(literal)) {
                fully_fixed_literals = cons(literal, fully_fixed_literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        return fully_fixed_literals;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 22400L)
    public static SubLObject variable_token(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return $variable_token$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 22500L)
    public static SubLObject var_tokenized_contextualized_asent_predicate(SubLObject contextualized_asent) {
        SubLObject pred = inference_datastructures_problem_query.contextualized_asent_predicate(contextualized_asent);
        if (NIL != variables.variable_p(pred)) {
            return $variable_token$.getGlobalValue();
        }
        return pred;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 22800L)
    public static SubLObject inference_unique_commutative_literals(SubLObject not_yet_sorted_literals) {
        SubLObject commutative_literals_alist = NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != at_least_partially_commutative_contextualized_asent_p(literal)) {
                commutative_literals_alist = list_utilities.alist_push(commutative_literals_alist, var_tokenized_contextualized_asent_predicate(literal), literal, Symbols.symbol_function(EQ));
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        if (NIL == commutative_literals_alist) {
            return NIL;
        }
        SubLObject unique_commutative_literals = NIL;
        SubLObject cdolist_list_var2 = commutative_literals_alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject literals = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
            key = current.first();
            current = (literals = current.rest());
            if (NIL != list_utilities.singletonP(literals)) {
                unique_commutative_literals = cons(list_utilities.only_one(literals), unique_commutative_literals);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons = cdolist_list_var2.first();
        }
        if (NIL == unique_commutative_literals) {
            SubLObject fort_id_alist = NIL;
            SubLObject cdolist_list_var3 = commutative_literals_alist;
            SubLObject cons2 = NIL;
            cons2 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                SubLObject current2;
                SubLObject datum2 = current2 = cons2;
                SubLObject key2 = NIL;
                SubLObject literals2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, $list20);
                key2 = current2.first();
                current2 = current2.rest();
                SubLObject cdolist_list_var_$3;
                literals2 = (cdolist_list_var_$3 = current2);
                SubLObject literal2 = NIL;
                literal2 = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    fort_id_alist = list_utilities.alist_push(fort_id_alist, cycl_utilities.sorted_fort_id_list(literal2), literal2, Symbols.symbol_function(EQUAL));
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    literal2 = cdolist_list_var_$3.first();
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                cons2 = cdolist_list_var3.first();
            }
            cdolist_list_var3 = fort_id_alist;
            cons2 = NIL;
            cons2 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                SubLObject current2;
                SubLObject datum2 = current2 = cons2;
                SubLObject key2 = NIL;
                SubLObject literals2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, $list20);
                key2 = current2.first();
                current2 = (literals2 = current2.rest());
                if (NIL != list_utilities.singletonP(literals2)) {
                    unique_commutative_literals = cons(list_utilities.only_one(literals2), unique_commutative_literals);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                cons2 = cdolist_list_var3.first();
            }
        }
        return unique_commutative_literals;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 24200L)
    public static SubLObject inference_uniquely_constrained_literals(SubLObject not_yet_sorted_literals) {
        SubLObject uniquely_constrained_literals = NIL;
        SubLObject alist = NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != not_at_all_commutative_contextualized_asent_p(literal)) {
                SubLObject dwimmed_literal = transform_list_utilities.transform(literal, $sym13$NON_FIXED_VARIABLE_P, $sym21$VARIABLE_TOKEN, UNPROVIDED);
                SubLObject alist_entry = conses_high.assoc(dwimmed_literal, alist, Symbols.symbol_function(EQUAL), UNPROVIDED);
                if (NIL != alist_entry) {
                    rplacd(alist_entry, $NOT_UNIQUE);
                } else {
                    SubLObject new_alist_entry = cons(dwimmed_literal, literal);
                    alist = cons(new_alist_entry, alist);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject literal2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
            key = current.first();
            current = (literal2 = current.rest());
            if ($NOT_UNIQUE != literal2) {
                uniquely_constrained_literals = cons(literal2, uniquely_constrained_literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return uniquely_constrained_literals;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 25200L)
    public static SubLObject inference_update_fixed_vars_table(SubLObject new_uniquely_constrained_literals) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = list_utilities.tree_gather(new_uniquely_constrained_literals, $sym24$VARIABLE_P, Symbols.symbol_function(EQL), UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != non_fixed_variable_p(var)) {
                $inference_czer_fixed_vars_table$.setDynamicValue(list_utilities.alist_enter($inference_czer_fixed_vars_table$.getDynamicValue(thread), var, $inference_czer_next_fixed_var_id$.getDynamicValue(thread), Symbols.symbol_function(EQL)), thread);
                $inference_czer_next_fixed_var_id$.setDynamicValue(Numbers.add($inference_czer_next_fixed_var_id$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 25700L)
    public static SubLObject contiguize_hl_vars_in_clauses(SubLObject contextualized_dnf_clauses) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_utilities.hl_ground_tree_p(contextualized_dnf_clauses)) {
            return subl_promotions.values2(contextualized_dnf_clauses, NIL);
        }
        thread.resetMultipleValues();
        SubLObject all_goodP = all_hl_vars_contiguous_and_in_orderP(contextualized_dnf_clauses);
        SubLObject largest_hl_var_num = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != all_goodP) {
            return subl_promotions.values2(contextualized_dnf_clauses, identity_variable_map(largest_hl_var_num));
        }
        SubLObject hl_var_blist = hl_var_contiguity_alist(contextualized_dnf_clauses);
        return Values.values(bindings.napply_bindings(hl_var_blist, contextualized_dnf_clauses), bindings.invert_bindings(hl_var_blist));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26500L)
    public static SubLObject identity_variable_map(SubLObject largest_var_num) {
        return bindings.hl_identity_bindings(number_utilities.f_1X(largest_var_num));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26700L)
    public static SubLObject non_contiguous_hl_varP(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cycl_grammar.hl_variable_p(v_object)) {
            return NIL;
        }
        SubLObject var_num = variables.variable_id(v_object);
        if (var_num.numLE($largest_hl_var_num_so_far$.getDynamicValue(thread))) {
            return NIL;
        }
        if (var_num.numE(number_utilities.f_1X($largest_hl_var_num_so_far$.getDynamicValue(thread)))) {
            $largest_hl_var_num_so_far$.setDynamicValue(var_num, thread);
            return NIL;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 27100L)
    public static SubLObject all_hl_vars_contiguous_and_in_orderP(SubLObject contextualized_dnf_clauses) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject largest_num = NIL;
        SubLObject _prev_bind_0 = $largest_hl_var_num_so_far$.currentBinding(thread);
        try {
            $largest_hl_var_num_so_far$.bind(MINUS_ONE_INTEGER, thread);
            result = makeBoolean(NIL == list_utilities.tree_find_if($sym26$NON_CONTIGUOUS_HL_VAR_, contextualized_dnf_clauses, UNPROVIDED));
            largest_num = $largest_hl_var_num_so_far$.getDynamicValue(thread);
        } finally {
            $largest_hl_var_num_so_far$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(result, largest_num);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 27600L)
    public static SubLObject possibly_note_hl_var_contiguity_pair(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_grammar.hl_variable_p(v_object)) {
            SubLObject new_var_cons = conses_high.assoc(v_object, $hl_var_contiguity_alist$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            if (NIL == new_var_cons) {
                SubLObject next_var_num = number_utilities.f_1X($largest_hl_var_num_so_far$.getDynamicValue(thread));
                SubLObject next_var = variables.get_variable(next_var_num);
                $largest_hl_var_num_so_far$.setDynamicValue(next_var_num, thread);
                $hl_var_contiguity_alist$.setDynamicValue(cons(cons(v_object, next_var), $hl_var_contiguity_alist$.getDynamicValue(thread)), thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 28000L)
    public static SubLObject hl_var_contiguity_alist(SubLObject contextualized_dnf_clauses) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $largest_hl_var_num_so_far$.currentBinding(thread);
        SubLObject _prev_bind_2 = $hl_var_contiguity_alist$.currentBinding(thread);
        try {
            $largest_hl_var_num_so_far$.bind(MINUS_ONE_INTEGER, thread);
            $hl_var_contiguity_alist$.bind(NIL, thread);
            list_utilities.tree_find_if($sym27$POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR, contextualized_dnf_clauses, UNPROVIDED);
            result = Sequences.nreverse($hl_var_contiguity_alist$.getDynamicValue(thread));
        } finally {
            $hl_var_contiguity_alist$.rebind(_prev_bind_2, thread);
            $largest_hl_var_num_so_far$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 28400L)
    public static SubLObject inference_apply_disjunction_free_el_vars_policy(SubLObject policy, SubLObject current_disjunction_free_el_vars, SubLObject disjunct_free_el_vars) {
        if (policy.eql($REQUIRE_EQUAL)) {
            if (NIL != list_utilities.sets_equalP(current_disjunction_free_el_vars, disjunct_free_el_vars, UNPROVIDED)) {
                return current_disjunction_free_el_vars;
            }
            return $POLICY_VIOLATION;
        } else {
            if (policy.eql($COMPUTE_INTERSECTION)) {
                return conses_high.intersection(current_disjunction_free_el_vars, disjunct_free_el_vars, UNPROVIDED, UNPROVIDED);
            }
            if (policy.eql($COMPUTE_UNION)) {
                return conses_high.union(current_disjunction_free_el_vars, disjunct_free_el_vars, UNPROVIDED, UNPROVIDED);
            }
            return Errors.error($str32$Unexpected_inference_disjunction_, policy);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 29000L)
    public static SubLObject inference_canonicalize_ask_memoized_internal(SubLObject cycl_query, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
        return inference_canonicalize_ask_int(cycl_query, mt, disjunction_free_el_vars_policy);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 29000L)
    public static SubLObject inference_canonicalize_ask_memoized(SubLObject cycl_query, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_canonicalize_ask_memoized_internal(cycl_query, mt, disjunction_free_el_vars_policy);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_query, mt, disjunction_free_el_vars_policy);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (cycl_query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && disjunction_free_el_vars_policy.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_canonicalize_ask_memoized_internal(cycl_query, mt, disjunction_free_el_vars_policy)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl_query, mt, disjunction_free_el_vars_policy));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 29300L)
    public static SubLObject inference_canonicalize_ask_int(SubLObject cycl_query, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject czer_result = NIL;
        if (NIL == mt) {
            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        thread.resetMultipleValues();
        SubLObject czer_result_$4 = czer_main.canonicalize_ask_sentence(cycl_query, mt);
        SubLObject mt_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        czer_result = czer_result_$4;
        mt = mt_$5;
        if (NIL == czer_result) {
            return subl_promotions.values3($ILL_FORMED, NIL, NIL);
        }
        if (NIL != cycl_grammar.cycl_truth_value_p(czer_result)) {
            return subl_promotions.values3(czer_result, NIL, NIL);
        }
        if (!czer_result.isCons()) {
            Errors.error($str35$Got_a_czer_result_of_unexpected_t, czer_result);
            return NIL;
        }
        SubLObject contextualized_clauses = NIL;
        thread.resetMultipleValues();
        SubLObject v_clauses = inference_standardize_canonicalize_ask_result(czer_result, disjunction_free_el_vars_policy, cycl_query);
        SubLObject blist = thread.secondMultipleValue();
        SubLObject free_el_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ($ILL_FORMED == v_clauses) {
            return subl_promotions.values3($ILL_FORMED, NIL, NIL);
        }
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject contextualized_clause = contextualize_clause(clause, mt, disjunction_free_el_vars_policy);
            contextualized_clauses = cons(contextualized_clause, contextualized_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return subl_promotions.values3(contextualized_clauses, blist, free_el_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 30600L)
    public static SubLObject inference_standardize_canonicalize_ask_result(SubLObject czer_result, SubLObject disjunction_free_el_vars_policy, SubLObject cycl_query) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_clauses = NIL;
        SubLObject master_el_to_hl_variable_map = NIL;
        SubLObject all_free_el_vars = NIL;
        if (NIL != list_utilities.singletonP(czer_result)) {
            SubLObject tuple = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(czer_result, czer_result, $list36);
            tuple = czer_result.first();
            SubLObject current = czer_result.rest();
            if (NIL == current) {
                SubLObject current_$7;
                SubLObject datum_$6 = current_$7 = tuple;
                SubLObject clause = NIL;
                SubLObject el_to_hl_variable_map = NIL;
                SubLObject free_el_vars = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, $list37);
                clause = current_$7.first();
                current_$7 = current_$7.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, $list37);
                el_to_hl_variable_map = current_$7.first();
                current_$7 = current_$7.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, $list37);
                free_el_vars = current_$7.first();
                current_$7 = current_$7.rest();
                if (NIL == current_$7) {
                    v_clauses = list(clause);
                    master_el_to_hl_variable_map = el_to_hl_variable_map;
                    all_free_el_vars = free_el_vars;
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$6, $list37);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(czer_result, $list36);
            }
        } else {
            thread.resetMultipleValues();
            SubLObject master_el_to_hl_variable_map_$8 = inference_master_el_to_hl_variable_map(czer_result, disjunction_free_el_vars_policy);
            SubLObject all_free_el_vars_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            master_el_to_hl_variable_map = master_el_to_hl_variable_map_$8;
            all_free_el_vars = all_free_el_vars_$9;
            if (master_el_to_hl_variable_map == $ILL_FORMED) {
                return subl_promotions.values3($ILL_FORMED, NIL, NIL);
            }
            SubLObject cdolist_list_var = czer_result;
            SubLObject tuple2 = NIL;
            tuple2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current2;
                SubLObject datum = current2 = tuple2;
                SubLObject local_hl_clause = NIL;
                SubLObject local_el_to_hl_variable_map = NIL;
                SubLObject local_free_el_vars = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, $list38);
                local_hl_clause = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, $list38);
                local_el_to_hl_variable_map = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, $list38);
                local_free_el_vars = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    SubLObject master_el_clause = bindings.apply_bindings_backwards(local_el_to_hl_variable_map, local_hl_clause);
                    SubLObject master_hl_clause = bindings.apply_bindings(master_el_to_hl_variable_map, master_el_clause);
                    v_clauses = cons(master_hl_clause, v_clauses);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list38);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tuple2 = cdolist_list_var.first();
            }
            v_clauses = Sequences.nreverse(v_clauses);
        }
        all_free_el_vars = canonicalize_free_el_var_ordering(all_free_el_vars, cycl_query);
        master_el_to_hl_variable_map = bindings.stable_sort_bindings(master_el_to_hl_variable_map, all_free_el_vars);
        return subl_promotions.values3(v_clauses, master_el_to_hl_variable_map, all_free_el_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 32100L)
    public static SubLObject inference_master_el_to_hl_variable_map(SubLObject czer_result, SubLObject disjunction_free_el_vars_policy) {
        SubLObject all_free_el_vars = $UNINITIALIZED;
        SubLObject all_el_vars = NIL;
        SubLObject cdolist_list_var = czer_result;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = tuple;
            SubLObject clause = NIL;
            SubLObject el_to_hl_variable_map = NIL;
            SubLObject free_hl_vars = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
            clause = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
            el_to_hl_variable_map = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
            free_hl_vars = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject free_el_vars = bindings.apply_bindings_backwards(el_to_hl_variable_map, free_hl_vars);
                SubLObject el_vars = bindings.bindings_variables(el_to_hl_variable_map);
                all_el_vars = append(el_vars, all_el_vars);
                if ($UNINITIALIZED == all_free_el_vars) {
                    all_free_el_vars = free_el_vars;
                } else {
                    SubLObject updated_all_free_el_vars = inference_apply_disjunction_free_el_vars_policy(disjunction_free_el_vars_policy, all_free_el_vars, free_el_vars);
                    if ($POLICY_VIOLATION == updated_all_free_el_vars) {
                        return subl_promotions.values2($ILL_FORMED, NIL);
                    }
                    all_free_el_vars = updated_all_free_el_vars;
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list40);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        all_free_el_vars = list_utilities.fast_delete_duplicates(all_free_el_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        all_free_el_vars = inference_sort_el_variables(all_free_el_vars);
        all_el_vars = list_utilities.fast_delete_duplicates(all_el_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        all_el_vars = inference_sort_el_variables(all_el_vars);
        SubLObject master_el_to_hl_variable_map = NIL;
        SubLObject list_var = NIL;
        SubLObject el_var = NIL;
        SubLObject index = NIL;
        list_var = all_el_vars;
        el_var = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
            SubLObject hl_var = variables.find_variable_by_id(index);
            master_el_to_hl_variable_map = bindings.add_variable_binding(el_var, hl_var, master_el_to_hl_variable_map);
        }
        master_el_to_hl_variable_map = Sequences.nreverse(master_el_to_hl_variable_map);
        return subl_promotions.values2(master_el_to_hl_variable_map, all_free_el_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 33800L)
    public static SubLObject inference_sort_el_variables(SubLObject el_variables) {
        return Sort.sort(el_variables, $sym41$INFERENCE_TERM__, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 33900L)
    public static SubLObject canonicalize_free_el_var_ordering(SubLObject free_el_vars, SubLObject cycl_query) {
        SubLObject all_el_vars_in_appearance_order = list_utilities.tree_gather(cycl_query, $sym42$EL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject free_el_vars_in_appearance_order = list_utilities.sort_via_position(free_el_vars, all_el_vars_in_appearance_order, UNPROVIDED, UNPROVIDED);
        return free_el_vars_in_appearance_order;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 34300L)
    public static SubLObject decontextualize_clauses_with_best_mt(SubLObject contextualized_clauses) {
        SubLObject mt = determine_best_clauses_level_mt(contextualized_clauses);
        SubLObject v_clauses = decontextualize_clauses(contextualized_clauses, mt);
        return subl_promotions.values2(v_clauses, mt);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 34500L)
    public static SubLObject decontextualize_clauses(SubLObject contextualized_clauses, SubLObject mt) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = contextualized_clauses;
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(decontextualize_clause(contextualized_clause, mt), ans);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return ans;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 34800L)
    public static SubLObject decontextualize_clause(SubLObject contextualized_clause, SubLObject mt) {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject neg_lit = NIL;
        neg_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            neg_lits = cons(contextualized_asent_formula(neg_lit, mt), neg_lits);
            cdolist_list_var = cdolist_list_var.rest();
            neg_lit = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pos_lits = cons(contextualized_asent_formula(pos_lit, mt), pos_lits);
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        }
        return clauses.make_clause(Sequences.nreverse(neg_lits), Sequences.nreverse(pos_lits));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 35400L)
    public static SubLObject contextualize_clauses(SubLObject v_clauses, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
        if (disjunction_free_el_vars_policy == UNPROVIDED) {
            disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
        }
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(contextualize_clause(clause, mt, disjunction_free_el_vars_policy), ans);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 35800L)
    public static SubLObject dnf_and_mt_to_hl_query(SubLObject dnf_clause, SubLObject mt) {
        return list(contextualize_clause(dnf_clause, mt, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 35900L)
    public static SubLObject contextualize_clause(SubLObject clause, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
        if (disjunction_free_el_vars_policy == UNPROVIDED) {
            disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
        }
        SubLObject contextualized_neg_lits = convert_to_hl_contextualized_asents(clauses.neg_lits(clause), mt);
        SubLObject contextualized_pos_lits = convert_to_hl_contextualized_asents(clauses.pos_lits(clause), mt);
        SubLObject contextualized_clause = clauses.make_clause(contextualized_neg_lits, contextualized_pos_lits);
        return canonicalize_contextualized_clause(contextualized_clause, disjunction_free_el_vars_policy);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 36400L)
    public static SubLObject canonicalize_contextualized_clause(SubLObject contextualized_clause, SubLObject disjunction_free_el_vars_policy) {
        if (disjunction_free_el_vars_policy == UNPROVIDED) {
            disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == clauses.atomic_clause_p(contextualized_clause) || NIL == el_utilities.cyc_const_sentential_relation_p(cycl_utilities.atomic_sentence_predicate(inference_datastructures_problem_query.contextualized_asent_asent(clause_utilities.atomic_clause_asent(contextualized_clause))))) {
            return contextualized_clause;
        }
        SubLObject not_really_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
        SubLObject subsentence = inference_datastructures_problem_query.contextualized_asent_asent(not_really_asent);
        SubLObject sub_mt = inference_datastructures_problem_query.contextualized_asent_mt(not_really_asent);
        SubLObject contextualized_clauses = inference_canonicalize_ask_memoized(subsentence, sub_mt, disjunction_free_el_vars_policy);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.singletonP(contextualized_clauses)) {
            Errors.error($str43$Something_weird_happened_when_try, contextualized_clause);
        }
        return contextualized_clauses.first();
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 37600L)
    public static SubLObject convert_to_hl_contextualized_asents(SubLObject asents, SubLObject mt) {
        SubLObject contextualized_asents = NIL;
        SubLObject cdolist_list_var = asents;
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject contextualized_asent = convert_to_hl_contextualized_asent(asent, mt);
            contextualized_asents = cons(contextualized_asent, contextualized_asents);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        contextualized_asents = Sequences.nreverse(contextualized_asents);
        return contextualized_asents;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 37900L)
    public static SubLObject convert_to_hl_contextualized_asent(SubLObject asent, SubLObject mt) {
        if (NIL != cycl_variables.cyc_varP(asent)) {
            asent = el_utilities.make_unary_formula($$trueSentence, asent);
        }
        SubLObject contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(mt, asent);
        return inference_simplify_contextualized_asent(contextualized_asent);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 38300L)
    public static SubLObject find_problem_by_el_query(SubLObject store, SubLObject el_query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
            thread.resetMultipleValues();
            SubLObject sentence = czer_utilities.unwrap_if_ist(el_query, mt, UNPROVIDED);
            SubLObject mt_$10 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            SubLObject query = inference_canonicalize_ask_int(sentence, mt_$10, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
            SubLObject el_to_hl_variable_map = thread.secondMultipleValue();
            SubLObject free_el_vars = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject free_hl_vars = (NIL != inference_datastructures_problem_store.problem_identity_depends_on_free_hl_varsP(store)) ? variables.sort_hl_variable_list_memoized(bindings.apply_bindings(el_to_hl_variable_map, free_el_vars)) : NIL;
            return inference_worker.find_problem_int(store, query, free_hl_vars, T);
        } finally {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 39000L)
    public static SubLObject problem_query_el_formula(SubLObject query) {
        return cycl_utilities.hl_to_el(problem_query_formula(query));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 39300L)
    public static SubLObject problem_query_formula(SubLObject query) {
        return contextualized_dnf_clauses_formula(query, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 39400L)
    public static SubLObject contextualized_dnf_clauses_formula(SubLObject contextualized_dnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        if (NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            return contextualized_dnf_clause_formula(contextualized_dnf_clauses.first(), clause_level_mt);
        }
        return contextualized_dnf_clauses_disjunction_formula(contextualized_dnf_clauses, clause_level_mt);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 40000L)
    public static SubLObject contextualized_cnf_clauses_formula(SubLObject contextualized_cnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        if (NIL != list_utilities.singletonP(contextualized_cnf_clauses)) {
            return contextualized_cnf_clause_formula(contextualized_cnf_clauses.first(), clause_level_mt);
        }
        return contextualized_cnf_clauses_conjunction_formula(contextualized_cnf_clauses, clause_level_mt);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 40600L)
    public static SubLObject contextualized_dnf_clause_formula(SubLObject contextualized_dnf_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        return contextualized_clause_formula(contextualized_dnf_clause, clause_level_mt, $DNF);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 40900L)
    public static SubLObject contextualized_cnf_clause_formula(SubLObject contextualized_cnf_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        return contextualized_clause_formula(contextualized_cnf_clause, clause_level_mt, $CNF);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 41200L)
    public static SubLObject contextualized_dnf_clauses_common_mt(SubLObject contextualized_dnf_clauses) {
        SubLObject formula = contextualized_dnf_clauses_formula(contextualized_dnf_clauses, UNPROVIDED);
        if (NIL != el_utilities.ist_sentence_p(formula, UNPROVIDED) && NIL == cycl_utilities.expression_find_if($sym48$IST_SENTENCE_WITH_CHLMT_P, cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            return cycl_utilities.formula_arg1(formula, UNPROVIDED);
        }
        return mt_vars.$core_mt_floor$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 41600L)
    public static SubLObject contextualized_dnf_clause_common_mt(SubLObject contextualized_dnf_clause) {
        SubLObject formula = contextualized_dnf_clause_formula(contextualized_dnf_clause, UNPROVIDED);
        if (NIL != el_utilities.ist_sentence_p(formula, UNPROVIDED) && NIL == cycl_utilities.expression_find_if($sym48$IST_SENTENCE_WITH_CHLMT_P, cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            return cycl_utilities.formula_arg1(formula, UNPROVIDED);
        }
        return mt_vars.$core_mt_floor$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 42100L)
    public static SubLObject contextualized_clause_formula(SubLObject contextualized_clause, SubLObject clause_level_mt, SubLObject type) {
        SubLObject contextualized_neg_lits = contextualized_neg_lits(contextualized_clause);
        SubLObject contextualized_pos_lits = contextualized_pos_lits(contextualized_clause);
        if (NIL == contextualized_neg_lits && NIL == contextualized_pos_lits) {
            return $$True;
        }
        if (NIL == contextualized_neg_lits && NIL != list_utilities.singletonP(contextualized_pos_lits)) {
            return contextualized_asent_formula(contextualized_pos_lits.first(), clause_level_mt);
        }
        if (NIL == contextualized_pos_lits && NIL != list_utilities.singletonP(contextualized_neg_lits)) {
            return contextualized_asent_negated_formula(contextualized_neg_lits.first(), clause_level_mt);
        }
        if (type == $DNF) {
            return contextualized_clause_conjunction_formula(contextualized_clause, clause_level_mt);
        }
        if (type == $CNF) {
            return contextualized_clause_disjunction_formula(contextualized_clause, clause_level_mt);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 43500L)
    public static SubLObject contextualized_neg_lits(SubLObject contextualized_clause) {
        return clauses.neg_lits(contextualized_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 43600L)
    public static SubLObject contextualized_pos_lits(SubLObject contextualized_clause) {
        return clauses.pos_lits(contextualized_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 43700L)
    public static SubLObject contextualized_asent_formula(SubLObject contextualized_asent, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, $list5);
        asent = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, $list5);
            return NIL;
        }
        if (mt.equal(clause_level_mt)) {
            return asent;
        }
        return el_utilities.make_binary_formula($$ist, mt, asent);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 44100L)
    public static SubLObject contextualized_asent_negated_formula(SubLObject contextualized_asent, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, $list5);
        asent = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, $list5);
            return NIL;
        }
        if (mt.equal(clause_level_mt)) {
            return cycl_utilities.negate(asent);
        }
        return el_utilities.make_binary_formula($$ist, mt, cycl_utilities.negate(asent));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 44400L)
    public static SubLObject contextualized_dnf_clauses_disjunction_formula(SubLObject contextualized_dnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        if (NIL == contextualized_dnf_clauses) {
            return $$False;
        }
        SubLObject disjuncts = NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = NIL;
        contextualized_dnf_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            disjuncts = cons(contextualized_dnf_clause_formula(contextualized_dnf_clause, clause_level_mt), disjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause = cdolist_list_var.first();
        }
        return el_utilities.make_disjunction(Sequences.nreverse(disjuncts));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 45100L)
    public static SubLObject contextualized_cnf_clauses_conjunction_formula(SubLObject contextualized_cnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        SubLObject conjuncts = NIL;
        SubLObject cdolist_list_var = contextualized_cnf_clauses;
        SubLObject contextualized_cnf_clause = NIL;
        contextualized_cnf_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            conjuncts = cons(contextualized_cnf_clause_formula(contextualized_cnf_clause, clause_level_mt), conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_cnf_clause = cdolist_list_var.first();
        }
        return el_utilities.make_conjunction(Sequences.nreverse(conjuncts));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 45700L)
    public static SubLObject contextualized_clause_conjunction_formula(SubLObject contextualized_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        return contextualized_clause_juncts_formula(contextualized_clause, clause_level_mt, $CONJUNCTION);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 46100L)
    public static SubLObject contextualized_clause_disjunction_formula(SubLObject contextualized_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        return contextualized_clause_juncts_formula(contextualized_clause, clause_level_mt, $DISJUNCTION);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 46500L)
    public static SubLObject contextualized_clause_juncts_formula(SubLObject contextualized_clause, SubLObject clause_level_mt, SubLObject type) {
        SubLObject neg_lit_formulas = NIL;
        SubLObject pos_lit_formulas = NIL;
        SubLObject add_ist_wrapperP = makeBoolean(NIL == hlmt.hlmt_p(clause_level_mt));
        if (NIL != add_ist_wrapperP) {
            clause_level_mt = determine_best_clause_level_mt(contextualized_clause);
        }
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            if ($NEG == sense) {
                neg_lit_formulas = cons(contextualized_asent_negated_formula(contextualized_asent, clause_level_mt), neg_lit_formulas);
            } else {
                pos_lit_formulas = cons(contextualized_asent_formula(contextualized_asent, clause_level_mt), pos_lit_formulas);
            }
            index_var = Numbers.add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $POS;
            if ($NEG == sense) {
                neg_lit_formulas = cons(contextualized_asent_negated_formula(contextualized_asent, clause_level_mt), neg_lit_formulas);
            } else {
                pos_lit_formulas = cons(contextualized_asent_formula(contextualized_asent, clause_level_mt), pos_lit_formulas);
            }
            index_var = Numbers.add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        neg_lit_formulas = Sequences.nreverse(neg_lit_formulas);
        pos_lit_formulas = Sequences.nreverse(pos_lit_formulas);
        SubLObject juncts = nconc(neg_lit_formulas, pos_lit_formulas);
        SubLObject decontextualized_formula = (type == $CONJUNCTION) ? el_utilities.make_conjunction(juncts) : el_utilities.make_disjunction(juncts);
        return (NIL != add_ist_wrapperP) ? el_utilities.make_binary_formula($$ist, clause_level_mt, decontextualized_formula) : decontextualized_formula;
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 47600L)
    public static SubLObject determine_best_clause_level_mt(SubLObject contextualized_clause) {
        return determine_best_clauses_level_mt(list(contextualized_clause));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 47700L)
    public static SubLObject determine_best_clauses_level_mt(SubLObject contextualized_clauses) {
        SubLObject frequency_map = NIL;
        SubLObject cdolist_list_var = contextualized_clauses;
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$11 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$11.first();
            while (NIL != cdolist_list_var_$11) {
                SubLObject sense = $NEG;
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject total_data = conses_high.assoc(mt, frequency_map, Symbols.symbol_function(EQUAL), UNPROVIDED);
                    if (NIL == total_data) {
                        total_data = cons(mt, ZERO_INTEGER);
                        frequency_map = cons(total_data, frequency_map);
                    }
                    rplacd(total_data, Numbers.add(total_data.rest(), ONE_INTEGER));
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list5);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                contextualized_asent = cdolist_list_var_$11.first();
            }
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$12 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                SubLObject sense = $POS;
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject total_data = conses_high.assoc(mt, frequency_map, Symbols.symbol_function(EQUAL), UNPROVIDED);
                    if (NIL == total_data) {
                        total_data = cons(mt, ZERO_INTEGER);
                        frequency_map = cons(total_data, frequency_map);
                    }
                    rplacd(total_data, Numbers.add(total_data.rest(), ONE_INTEGER));
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list5);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                contextualized_asent = cdolist_list_var_$12.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        frequency_map = Sequences.nreverse(frequency_map);
        frequency_map = Sort.stable_sort(frequency_map, Symbols.symbol_function($sym54$_), Symbols.symbol_function($sym55$CDR));
        return frequency_map.first().first();
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 48500L)
    public static SubLObject canonicalize_hypothesis(SubLObject sentence, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject free_vars = el_utilities.sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject sentence_$13 = canonicalize_hypothesis_recursive(sentence, mt);
        SubLObject mt_$14 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$13;
        mt = mt_$14;
        return subl_promotions.values3(sentence, mt, free_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 48900L)
    public static SubLObject canonicalize_hypothesis_recursive(SubLObject sentence, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
        SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        SubLObject _prev_bind_3 = czer_vars.$minimal_skolem_arityP$.currentBinding(thread);
        SubLObject _prev_bind_4 = czer_vars.$assume_free_vars_are_existentially_boundP$.currentBinding(thread);
        SubLObject _prev_bind_5 = czer_vars.$forbid_quantified_sequence_variablesP$.currentBinding(thread);
        SubLObject _prev_bind_6 = czer_vars.$leave_skolem_constants_aloneP$.currentBinding(thread);
        try {
            czer_vars.$implicitify_universalsP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$minimal_skolem_arityP$.bind(T, thread);
            czer_vars.$assume_free_vars_are_existentially_boundP$.bind(T, thread);
            czer_vars.$forbid_quantified_sequence_variablesP$.bind(NIL, thread);
            czer_vars.$leave_skolem_constants_aloneP$.bind(T, thread);
            thread.resetMultipleValues();
            SubLObject sentence_$15 = clausifier.el_cnf(sentence, mt);
            SubLObject mt_$16 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$15;
            mt = mt_$16;
        } finally {
            czer_vars.$leave_skolem_constants_aloneP$.rebind(_prev_bind_6, thread);
            czer_vars.$forbid_quantified_sequence_variablesP$.rebind(_prev_bind_5, thread);
            czer_vars.$assume_free_vars_are_existentially_boundP$.rebind(_prev_bind_4, thread);
            czer_vars.$minimal_skolem_arityP$.rebind(_prev_bind_3, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_2, thread);
            czer_vars.$implicitify_universalsP$.rebind(_prev_bind_0, thread);
        }
        if (sentence.eql($$True)) {
            return subl_promotions.values2(el_utilities.make_conjunction(NIL), mt);
        }
        if (NIL == sentence || sentence.eql($$False)) {
            return subl_promotions.values2(el_utilities.make_conjunction($list56), mt);
        }
        if (sentence.isAtom()) {
            Errors.error($str57$Can_t_canonicalize_hypothesis__S, sentence);
            return NIL;
        }
        if (NIL != el_utilities.el_implication_p(sentence) || NIL != el_utilities.el_negation_p(sentence)) {
            return subl_promotions.values2(el_utilities.make_conjunction(list(sentence)), mt);
        }
        if (NIL != el_utilities.el_disjunction_p(sentence)) {
            return subl_promotions.values2(el_utilities.make_conjunction(list(sentence)), mt);
        }
        if (NIL != el_utilities.el_conjunction_p(sentence)) {
            SubLObject canon_args = NIL;
            SubLObject cdolist_list_var;
            SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject canon_arg = canonicalize_hypothesis_recursive(arg, mt);
                if (NIL != el_utilities.el_conjunction_p(canon_arg)) {
                    canon_args = conses_high.revappend(cycl_utilities.formula_args(canon_arg, UNPROVIDED), canon_args);
                } else {
                    canon_args = cons(canon_arg, canon_args);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            return subl_promotions.values2(reader.bq_cons($$and, append(Sequences.nreverse(canon_args), NIL)), mt);
        }
        if (NIL == el_utilities.mt_designating_literalP(sentence) || NIL != el_utilities.el_negation_p(sentence)) {
            return subl_promotions.values2(el_utilities.make_conjunction(list(sentence)), mt);
        }
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        SubLObject designated_sentence = el_utilities.designated_sentence(sentence);
        SubLObject canon_mt;
        SubLObject designated_mt = canon_mt = el_utilities.designated_mt(sentence);
        if (NIL == hlmt.hlmt_p(designated_mt)) {
            canon_mt = mt;
        }
        SubLObject canonical_subsentence = canonicalize_hypothesis_recursive(designated_sentence, canon_mt);
        assert NIL != el_utilities.el_conjunction_p(canonical_subsentence) : canonical_subsentence;
        SubLObject conjuncts = NIL;
        SubLObject cdolist_list_var2;
        SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args(canonical_subsentence, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject new_conjunct = el_utilities.make_binary_formula(predicate, designated_mt, conjunct);
            conjuncts = cons(new_conjunct, conjuncts);
            cdolist_list_var2 = cdolist_list_var2.rest();
            conjunct = cdolist_list_var2.first();
        }
        conjuncts = Sequences.nreverse(conjuncts);
        return subl_promotions.values2(el_utilities.make_conjunction(conjuncts), mt);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 52100L)
    public static SubLObject categorize_hypothesis_formulas(SubLObject hypothesis_formula) {
        SubLObject formulas = cycl_utilities.formula_args(hypothesis_formula, UNPROVIDED);
        SubLObject literals = NIL;
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = NIL;
        formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_utilities.el_formula_p(formula) && NIL != rule_el_formulaP(formula)) {
                rules = cons(formula, rules);
            } else {
                literals = cons(formula, literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        }
        literals = Sequences.nreverse(literals);
        rules = Sequences.nreverse(rules);
        return subl_promotions.values2(literals, rules);
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 52600L)
    public static SubLObject rule_el_formulaP(SubLObject formula) {
        return makeBoolean(NIL != el_utilities.el_implication_p(formula) || NIL != el_utilities.el_disjunction_p(formula) || NIL != el_utilities.el_exception_p(formula) || NIL != el_utilities.el_pragmatic_requirement_p(formula)
                || (NIL != el_utilities.ist_sentence_p(formula, UNPROVIDED) && NIL != rule_el_formulaP(cycl_utilities.formula_arg2(formula, UNPROVIDED))) || NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$assertionDirection)
                || NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$constraint) || NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$highlyRelevantAssertion) || NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$irrelevantAssertion)
                || NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$knownAntecedentRule) || NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$queryExtentCached) || NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$genlRules)
                || NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$universalLiftingRule));
    }

    @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 53400L)
    public static SubLObject canonicalize_hypothetical_ask(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_sentence = NIL;
        SubLObject result_mt = NIL;
        SubLObject _prev_bind_0 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
        SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        SubLObject _prev_bind_3 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_functionsP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
            thread.resetMultipleValues();
            SubLObject result_sentence_$17 = czer_main.canonicalize_ask_sentence(sentence, mt);
            SubLObject result_mt_$18 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_sentence = result_sentence_$17;
            result_mt = result_mt_$18;
        } finally {
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_3, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_2, thread);
            czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(result_sentence, result_mt);
    }

    public static SubLObject declare_inference_czer_file() {
        declareFunction(myName, "canonicalize_problem_query", "CANONICALIZE-PROBLEM-QUERY", 1, 0, false);
        declareFunction(myName, "inference_delete_duplicate_literals", "INFERENCE-DELETE-DUPLICATE-LITERALS", 1, 0, false);
        declareFunction(myName, "inference_delete_duplicate_clauses", "INFERENCE-DELETE-DUPLICATE-CLAUSES", 1, 0, false);
        declareFunction(myName, "delete_duplicate_sorted_literals", "DELETE-DUPLICATE-SORTED-LITERALS", 1, 0, false);
        declareFunction(myName, "delete_duplicate_sorted_clauses", "DELETE-DUPLICATE-SORTED-CLAUSES", 1, 0, false);
        declareFunction(myName, "inference_simplify_problem_query", "INFERENCE-SIMPLIFY-PROBLEM-QUERY", 1, 0, false);
        declareFunction(myName, "inference_simplify_contextualized_dnf_clause", "INFERENCE-SIMPLIFY-CONTEXTUALIZED-DNF-CLAUSE", 1, 0, false);
        declareFunction(myName, "inference_simplify_negated_true_sentence", "INFERENCE-SIMPLIFY-NEGATED-TRUE-SENTENCE", 1, 0, false);
        declareFunction(myName, "inference_el_dnf", "INFERENCE-EL-DNF", 2, 1, false);
        declareFunction(myName, "backchaining_on_ist_enabledP", "BACKCHAINING-ON-IST-ENABLED?", 0, 0, false);
        declareFunction(myName, "inference_simplify_contextualized_asent", "INFERENCE-SIMPLIFY-CONTEXTUALIZED-ASENT", 1, 0, false);
        declareFunction(myName, "inference_sort_clauses_and_literals", "INFERENCE-SORT-CLAUSES-AND-LITERALS", 1, 0, false);
        declareFunction(myName, "inference_sort_contextualized_clause_literals", "INFERENCE-SORT-CONTEXTUALIZED-CLAUSE-LITERALS", 1, 0, false);
        declareFunction(myName, "inference_sort_contextualized_clauses", "INFERENCE-SORT-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        declareFunction(myName, "inference_sort_contextualized_literals", "INFERENCE-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        declareFunction(myName, "inference_simple_sort_contextualized_literals", "INFERENCE-SIMPLE-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        declareFunction(myName, "inference_clause_L", "INFERENCE-CLAUSE-<", 2, 0, false);
        declareFunction(myName, "inference_contextualized_asent_L", "INFERENCE-CONTEXTUALIZED-ASENT-<", 2, 0, false);
        new $inference_contextualized_asent_L$BinaryFunction();
        declareFunction(myName, "inference_list_L", "INFERENCE-LIST-<", 2, 0, false);
        declareFunction(myName, "inference_formula_L", "INFERENCE-FORMULA-<", 2, 0, false);
        declareFunction(myName, "inference_term_L", "INFERENCE-TERM-<", 2, 0, false);
        declareFunction(myName, "inference_term_G", "INFERENCE-TERM->", 2, 0, false);
        declareFunction(myName, "inference_term_type_code", "INFERENCE-TERM-TYPE-CODE", 1, 0, false);
        declareFunction(myName, "inference_constant_L", "INFERENCE-CONSTANT-<", 2, 0, false);
        declareFunction(myName, "inference_nart_L", "INFERENCE-NART-<", 2, 0, false);
        declareFunction(myName, "non_fixed_variable_p", "NON-FIXED-VARIABLE-P", 1, 0, false);
        new $non_fixed_variable_p$UnaryFunction();
        declareFunction(myName, "fixed_variable_p", "FIXED-VARIABLE-P", 1, 0, false);
        declareFunction(myName, "fully_fixed_p", "FULLY-FIXED-P", 1, 0, false);
        declareFunction(myName, "fixed_variable_id", "FIXED-VARIABLE-ID", 1, 0, false);
        declareFunction(myName, "fixed_variable_token", "FIXED-VARIABLE-TOKEN", 1, 0, false);
        declareFunction(myName, "fixed_variable_token_p", "FIXED-VARIABLE-TOKEN-P", 1, 0, false);
        declareFunction(myName, "fixed_variable_for_token", "FIXED-VARIABLE-FOR-TOKEN", 1, 0, false);
        declareFunction(myName, "inference_czer_at_least_partially_commutative_relation_p", "INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction(myName, "inference_czer_not_at_all_commutative_relation_p", "INFERENCE-CZER-NOT-AT-ALL-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction(myName, "not_at_all_commutative_contextualized_asent_p", "NOT-AT-ALL-COMMUTATIVE-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        declareFunction(myName, "at_least_partially_commutative_contextualized_asent_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        declareFunction(myName, "inference_awesome_sort_contextualized_literals", "INFERENCE-AWESOME-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        declareFunction(myName, "inference_awesome_sort_contextualized_literals_iterative", "INFERENCE-AWESOME-SORT-CONTEXTUALIZED-LITERALS-ITERATIVE", 2, 0, false);
        declareFunction(myName, "pick_some_awesome_lits", "PICK-SOME-AWESOME-LITS", 2, 0, false);
        declareFunction(myName, "inference_fully_fixed_literals", "INFERENCE-FULLY-FIXED-LITERALS", 1, 0, false);
        declareFunction(myName, "variable_token", "VARIABLE-TOKEN", 0, 1, false);
        new $variable_token$ZeroArityFunction();
        new $variable_token$UnaryFunction();
        declareFunction(myName, "var_tokenized_contextualized_asent_predicate", "VAR-TOKENIZED-CONTEXTUALIZED-ASENT-PREDICATE", 1, 0, false);
        declareFunction(myName, "inference_unique_commutative_literals", "INFERENCE-UNIQUE-COMMUTATIVE-LITERALS", 1, 0, false);
        declareFunction(myName, "inference_uniquely_constrained_literals", "INFERENCE-UNIQUELY-CONSTRAINED-LITERALS", 1, 0, false);
        declareFunction(myName, "inference_update_fixed_vars_table", "INFERENCE-UPDATE-FIXED-VARS-TABLE", 1, 0, false);
        declareFunction(myName, "contiguize_hl_vars_in_clauses", "CONTIGUIZE-HL-VARS-IN-CLAUSES", 1, 0, false);
        declareFunction(myName, "identity_variable_map", "IDENTITY-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "non_contiguous_hl_varP", "NON-CONTIGUOUS-HL-VAR?", 1, 0, false);
        new $non_contiguous_hl_varP$UnaryFunction();
        declareFunction(myName, "all_hl_vars_contiguous_and_in_orderP", "ALL-HL-VARS-CONTIGUOUS-AND-IN-ORDER?", 1, 0, false);
        declareFunction(myName, "possibly_note_hl_var_contiguity_pair", "POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR", 1, 0, false);
        new $possibly_note_hl_var_contiguity_pair$UnaryFunction();
        declareFunction(myName, "hl_var_contiguity_alist", "HL-VAR-CONTIGUITY-ALIST", 1, 0, false);
        declareFunction(myName, "inference_apply_disjunction_free_el_vars_policy", "INFERENCE-APPLY-DISJUNCTION-FREE-EL-VARS-POLICY", 3, 0, false);
        declareFunction(myName, "inference_canonicalize_ask_memoized_internal", "INFERENCE-CANONICALIZE-ASK-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction(myName, "inference_canonicalize_ask_memoized", "INFERENCE-CANONICALIZE-ASK-MEMOIZED", 3, 0, false);
        declareFunction(myName, "inference_canonicalize_ask_int", "INFERENCE-CANONICALIZE-ASK-INT", 3, 0, false);
        declareFunction(myName, "inference_standardize_canonicalize_ask_result", "INFERENCE-STANDARDIZE-CANONICALIZE-ASK-RESULT", 3, 0, false);
        declareFunction(myName, "inference_master_el_to_hl_variable_map", "INFERENCE-MASTER-EL-TO-HL-VARIABLE-MAP", 2, 0, false);
        declareFunction(myName, "inference_sort_el_variables", "INFERENCE-SORT-EL-VARIABLES", 1, 0, false);
        declareFunction(myName, "canonicalize_free_el_var_ordering", "CANONICALIZE-FREE-EL-VAR-ORDERING", 2, 0, false);
        declareFunction(myName, "decontextualize_clauses_with_best_mt", "DECONTEXTUALIZE-CLAUSES-WITH-BEST-MT", 1, 0, false);
        declareFunction(myName, "decontextualize_clauses", "DECONTEXTUALIZE-CLAUSES", 2, 0, false);
        declareFunction(myName, "decontextualize_clause", "DECONTEXTUALIZE-CLAUSE", 2, 0, false);
        declareFunction(myName, "contextualize_clauses", "CONTEXTUALIZE-CLAUSES", 2, 1, false);
        declareFunction(myName, "dnf_and_mt_to_hl_query", "DNF-AND-MT-TO-HL-QUERY", 2, 0, false);
        declareFunction(myName, "contextualize_clause", "CONTEXTUALIZE-CLAUSE", 2, 1, false);
        declareFunction(myName, "canonicalize_contextualized_clause", "CANONICALIZE-CONTEXTUALIZED-CLAUSE", 1, 1, false);
        declareFunction(myName, "convert_to_hl_contextualized_asents", "CONVERT-TO-HL-CONTEXTUALIZED-ASENTS", 2, 0, false);
        declareFunction(myName, "convert_to_hl_contextualized_asent", "CONVERT-TO-HL-CONTEXTUALIZED-ASENT", 2, 0, false);
        declareFunction(myName, "find_problem_by_el_query", "FIND-PROBLEM-BY-EL-QUERY", 2, 1, false);
        declareFunction(myName, "problem_query_el_formula", "PROBLEM-QUERY-EL-FORMULA", 1, 0, false);
        declareFunction(myName, "problem_query_formula", "PROBLEM-QUERY-FORMULA", 1, 0, false);
        declareFunction(myName, "contextualized_dnf_clauses_formula", "CONTEXTUALIZED-DNF-CLAUSES-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_cnf_clauses_formula", "CONTEXTUALIZED-CNF-CLAUSES-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_dnf_clause_formula", "CONTEXTUALIZED-DNF-CLAUSE-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_cnf_clause_formula", "CONTEXTUALIZED-CNF-CLAUSE-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_dnf_clauses_common_mt", "CONTEXTUALIZED-DNF-CLAUSES-COMMON-MT", 1, 0, false);
        declareFunction(myName, "contextualized_dnf_clause_common_mt", "CONTEXTUALIZED-DNF-CLAUSE-COMMON-MT", 1, 0, false);
        declareFunction(myName, "contextualized_clause_formula", "CONTEXTUALIZED-CLAUSE-FORMULA", 3, 0, false);
        declareFunction(myName, "contextualized_neg_lits", "CONTEXTUALIZED-NEG-LITS", 1, 0, false);
        declareFunction(myName, "contextualized_pos_lits", "CONTEXTUALIZED-POS-LITS", 1, 0, false);
        declareFunction(myName, "contextualized_asent_formula", "CONTEXTUALIZED-ASENT-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_asent_negated_formula", "CONTEXTUALIZED-ASENT-NEGATED-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_dnf_clauses_disjunction_formula", "CONTEXTUALIZED-DNF-CLAUSES-DISJUNCTION-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_cnf_clauses_conjunction_formula", "CONTEXTUALIZED-CNF-CLAUSES-CONJUNCTION-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_clause_conjunction_formula", "CONTEXTUALIZED-CLAUSE-CONJUNCTION-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_clause_disjunction_formula", "CONTEXTUALIZED-CLAUSE-DISJUNCTION-FORMULA", 1, 1, false);
        declareFunction(myName, "contextualized_clause_juncts_formula", "CONTEXTUALIZED-CLAUSE-JUNCTS-FORMULA", 3, 0, false);
        declareFunction(myName, "determine_best_clause_level_mt", "DETERMINE-BEST-CLAUSE-LEVEL-MT", 1, 0, false);
        declareFunction(myName, "determine_best_clauses_level_mt", "DETERMINE-BEST-CLAUSES-LEVEL-MT", 1, 0, false);
        declareFunction(myName, "canonicalize_hypothesis", "CANONICALIZE-HYPOTHESIS", 2, 0, false);
        declareFunction(myName, "canonicalize_hypothesis_recursive", "CANONICALIZE-HYPOTHESIS-RECURSIVE", 2, 0, false);
        declareFunction(myName, "categorize_hypothesis_formulas", "CATEGORIZE-HYPOTHESIS-FORMULAS", 1, 0, false);
        declareFunction(myName, "rule_el_formulaP", "RULE-EL-FORMULA?", 1, 0, false);
        declareFunction(myName, "canonicalize_hypothetical_ask", "CANONICALIZE-HYPOTHETICAL-ASK", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_inference_czer_file() {
        $inference_sort_principledP$ = defparameter("*INFERENCE-SORT-PRINCIPLED?*", T);
        $backchaining_on_ist_enabledP$ = defparameter("*BACKCHAINING-ON-IST-ENABLED?*", T);
        $inference_czer_fixed_vars_table$ = defparameter("*INFERENCE-CZER-FIXED-VARS-TABLE*", misc_utilities.uninitialized());
        $inference_czer_next_fixed_var_id$ = defparameter("*INFERENCE-CZER-NEXT-FIXED-VAR-ID*", misc_utilities.uninitialized());
        $inference_czer_at_least_partially_commutative_relations_alist$ = defparameter("*INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATIONS-ALIST*", misc_utilities.uninitialized());
        $variable_token$ = deflexical("*VARIABLE-TOKEN*", maybeDefault($sym18$_VARIABLE_TOKEN_, $variable_token$, () -> (Symbols.make_uninterned_symbol($str19$var))));
        $largest_hl_var_num_so_far$ = defparameter("*LARGEST-HL-VAR-NUM-SO-FAR*", $LAMBDA);
        $hl_var_contiguity_alist$ = defparameter("*HL-VAR-CONTIGUITY-ALIST*", $LAMBDA);
        return NIL;
    }

    public static SubLObject setup_inference_czer_file() {
        subl_macro_promotions.declare_defglobal($sym18$_VARIABLE_TOKEN_);
        memoization_state.note_memoized_function($sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_czer_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_czer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_czer_file();
    }

    static {
        me = new inference_czer();
        $inference_sort_principledP$ = null;
        $backchaining_on_ist_enabledP$ = null;
        $inference_czer_fixed_vars_table$ = null;
        $inference_czer_next_fixed_var_id$ = null;
        $inference_czer_at_least_partially_commutative_relations_alist$ = null;
        $variable_token$ = null;
        $largest_hl_var_num_so_far$ = null;
        $hl_var_contiguity_alist$ = null;
        $sym0$INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE = makeSymbol("INFERENCE-SIMPLIFY-NEGATED-TRUE-SENTENCE");
        $list1 = list(makeSymbol("MT"), makeSymbol("TRUE-SENTENCE"));
        $$False = makeConstSym(("False"));
        $$True = makeConstSym(("True"));
        $$trueSentence = makeConstSym(("trueSentence"));
        $list5 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $$elementOf = makeConstSym(("elementOf"));
        $list7 = list(makeConstSym(("elementOf")), makeKeyword("VARIABLE"), list(makeConstSym(("TheSetOf")), makeKeyword("ANYTHING"), list(makeConstSym(("isa")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))));
        $$isa = makeConstSym(("isa"));
        $sym9$INFERENCE_CLAUSE__ = makeSymbol("INFERENCE-CLAUSE-<");
        $sym10$INFERENCE_CONTEXTUALIZED_ASENT__ = makeSymbol("INFERENCE-CONTEXTUALIZED-ASENT-<");
        $str11$The_type_of_object__a_cannot_be_s = makeString("The type of object ~a cannot be sorted");
        $str12$Got_a_CycL_term_of_unknown_infere = makeString("Got a CycL term of unknown inference type: ~a");
        $sym13$NON_FIXED_VARIABLE_P = makeSymbol("NON-FIXED-VARIABLE-P");
        $INFERENCE_CZER_FIXED_VARIABLE = makeKeyword("INFERENCE-CZER-FIXED-VARIABLE");
        $CACHE_MISS = makeKeyword("CACHE-MISS");
        $$CommutativeRelation = makeConstSym(("CommutativeRelation"));
        $$PartiallyCommutativeRelation = makeConstSym(("PartiallyCommutativeRelation"));
        $sym18$_VARIABLE_TOKEN_ = makeSymbol("*VARIABLE-TOKEN*");
        $str19$var = makeString("var");
        $list20 = cons(makeUninternedSymbol("KEY"), makeSymbol("LITERALS"));
        $sym21$VARIABLE_TOKEN = makeSymbol("VARIABLE-TOKEN");
        $NOT_UNIQUE = makeKeyword("NOT-UNIQUE");
        $list23 = cons(makeUninternedSymbol("KEY"), makeSymbol("LITERAL"));
        $sym24$VARIABLE_P = makeSymbol("VARIABLE-P");
        $LAMBDA = makeKeyword("LAMBDA");
        $sym26$NON_CONTIGUOUS_HL_VAR_ = makeSymbol("NON-CONTIGUOUS-HL-VAR?");
        $sym27$POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR = makeSymbol("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR");
        $REQUIRE_EQUAL = makeKeyword("REQUIRE-EQUAL");
        $POLICY_VIOLATION = makeKeyword("POLICY-VIOLATION");
        $COMPUTE_INTERSECTION = makeKeyword("COMPUTE-INTERSECTION");
        $COMPUTE_UNION = makeKeyword("COMPUTE-UNION");
        $str32$Unexpected_inference_disjunction_ = makeString("Unexpected inference disjunction free el vars policy : ~S");
        $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED = makeSymbol("INFERENCE-CANONICALIZE-ASK-MEMOIZED");
        $ILL_FORMED = makeKeyword("ILL-FORMED");
        $str35$Got_a_czer_result_of_unexpected_t = makeString("Got a czer-result of unexpected type: ~s");
        $list36 = list(makeSymbol("TUPLE"));
        $list37 = list(makeSymbol("CLAUSE"), makeSymbol("EL-TO-HL-VARIABLE-MAP"), makeSymbol("FREE-EL-VARS"));
        $list38 = list(makeSymbol("LOCAL-HL-CLAUSE"), makeSymbol("LOCAL-EL-TO-HL-VARIABLE-MAP"), makeSymbol("LOCAL-FREE-EL-VARS"));
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $list40 = list(makeSymbol("CLAUSE"), makeSymbol("EL-TO-HL-VARIABLE-MAP"), makeSymbol("FREE-HL-VARS"));
        $sym41$INFERENCE_TERM__ = makeSymbol("INFERENCE-TERM-<");
        $sym42$EL_VARIABLE_P = makeSymbol("EL-VARIABLE-P");
        $str43$Something_weird_happened_when_try = makeString("Something weird happened when trying to distribute #$ist across logical operators with ~s");
        $sym44$_EXIT = makeSymbol("%EXIT");
        $UNSPECIFIED = makeKeyword("UNSPECIFIED");
        $DNF = makeKeyword("DNF");
        $CNF = makeKeyword("CNF");
        $sym48$IST_SENTENCE_WITH_CHLMT_P = makeSymbol("IST-SENTENCE-WITH-CHLMT-P");
        $$ist = makeConstSym(("ist"));
        $CONJUNCTION = makeKeyword("CONJUNCTION");
        $DISJUNCTION = makeKeyword("DISJUNCTION");
        $NEG = makeKeyword("NEG");
        $POS = makeKeyword("POS");
        $sym54$_ = makeSymbol(">");
        $sym55$CDR = makeSymbol("CDR");
        $list56 = list(makeConstSym(("False")));
        $str57$Can_t_canonicalize_hypothesis__S = makeString("Can't canonicalize hypothesis ~S");
        $IGNORE = makeKeyword("IGNORE");
        $$and = makeConstSym(("and"));
        $sym60$EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");
        $$assertionDirection = makeConstSym(("assertionDirection"));
        $$constraint = makeConstSym(("constraint"));
        $$highlyRelevantAssertion = makeConstSym(("highlyRelevantAssertion"));
        $$irrelevantAssertion = makeConstSym(("irrelevantAssertion"));
        $$knownAntecedentRule = makeConstSym(("knownAntecedentRule"));
        $$queryExtentCached = makeConstSym(("queryExtentCached"));
        $$genlRules = makeConstSym(("genlRules"));
        $$universalLiftingRule = makeConstSym(("universalLiftingRule"));
    }

    public static class $inference_contextualized_asent_L$BinaryFunction extends BinaryFunction {
        public $inference_contextualized_asent_L$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-CONTEXTUALIZED-ASENT-<"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return inference_contextualized_asent_L(arg1, arg2);
        }
    }

    public static class $non_fixed_variable_p$UnaryFunction extends UnaryFunction {
        public $non_fixed_variable_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NON-FIXED-VARIABLE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return non_fixed_variable_p(arg1);
        }
    }

    public static class $variable_token$ZeroArityFunction extends ZeroArityFunction {
        public $variable_token$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VARIABLE-TOKEN"));
        }

        @Override
        public SubLObject processItem() {
            return variable_token($variable_token$ZeroArityFunction.UNPROVIDED);
        }
    }

    public static class $variable_token$UnaryFunction extends UnaryFunction {
        public $variable_token$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VARIABLE-TOKEN"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return variable_token(arg1);
        }
    }

    public static class $non_contiguous_hl_varP$UnaryFunction extends UnaryFunction {
        public $non_contiguous_hl_varP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NON-CONTIGUOUS-HL-VAR?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return non_contiguous_hl_varP(arg1);
        }
    }

    public static class $possibly_note_hl_var_contiguity_pair$UnaryFunction extends UnaryFunction {
        public $possibly_note_hl_var_contiguity_pair$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return possibly_note_hl_var_contiguity_pair(arg1);
        }
    }
}
/*
 *
 * Total time: 353 ms
 *
 */