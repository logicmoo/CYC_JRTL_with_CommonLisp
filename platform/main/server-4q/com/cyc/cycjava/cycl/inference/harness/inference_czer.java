package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_czer.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_czer extends SubLTranslatedFile {
    public static final SubLFile me = new inference_czer();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_czer";

    public static final String myFingerPrint = "99f8108d6484b009d2a0fb6b3719cb65837d70e058451706865d1eca495158b5";

    // defparameter
    // Definitions
    /**
     * Whether the inference czer sorts in a principled way. This entails treating
     * variables as opaque tokens.
     */
    private static final SubLSymbol $inference_sort_principledP$ = makeSymbol("*INFERENCE-SORT-PRINCIPLED?*");

    // defparameter
    private static final SubLSymbol $backchaining_on_ist_enabledP$ = makeSymbol("*BACKCHAINING-ON-IST-ENABLED?*");

    // defparameter
    private static final SubLSymbol $inference_czer_fixed_vars_table$ = makeSymbol("*INFERENCE-CZER-FIXED-VARS-TABLE*");

    // defparameter
    private static final SubLSymbol $inference_czer_next_fixed_var_id$ = makeSymbol("*INFERENCE-CZER-NEXT-FIXED-VAR-ID*");

    // defparameter
    private static final SubLSymbol $inference_czer_at_least_partially_commutative_relations_alist$ = makeSymbol("*INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATIONS-ALIST*");



    // defparameter
    /**
     * lambda used in @xref non-contiguous-hl-var? and
     * possibly-note-hl-var-contiguity-pair
     */
    private static final SubLSymbol $largest_hl_var_num_so_far$ = makeSymbol("*LARGEST-HL-VAR-NUM-SO-FAR*");

    // defparameter
    // lambda used in @xref possibly-note-hl-var-contiguity-pair
    private static final SubLSymbol $hl_var_contiguity_alist$ = makeSymbol("*HL-VAR-CONTIGUITY-ALIST*");

    // Internal Constants
    public static final SubLSymbol INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE = makeSymbol("INFERENCE-SIMPLIFY-NEGATED-TRUE-SENTENCE");

    public static final SubLList $list1 = list(makeSymbol("MT"), makeSymbol("TRUE-SENTENCE"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$trueSentence = reader_make_constant_shell(makeString("trueSentence"));

    public static final SubLList $list5 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    public static final SubLList $list7 = list(reader_make_constant_shell(makeString("elementOf")), makeKeyword("VARIABLE"), list(reader_make_constant_shell(makeString("TheSetOf")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLSymbol $sym9$INFERENCE_CLAUSE__ = makeSymbol("INFERENCE-CLAUSE-<");

    public static final SubLSymbol $sym10$INFERENCE_CONTEXTUALIZED_ASENT__ = makeSymbol("INFERENCE-CONTEXTUALIZED-ASENT-<");

    public static final SubLString $str11$The_type_of_object__a_cannot_be_s = makeString("The type of object ~a cannot be sorted");

    public static final SubLString $str12$Got_a_CycL_term_of_unknown_infere = makeString("Got a CycL term of unknown inference type: ~a");

    public static final SubLSymbol NON_FIXED_VARIABLE_P = makeSymbol("NON-FIXED-VARIABLE-P");

    private static final SubLSymbol $INFERENCE_CZER_FIXED_VARIABLE = makeKeyword("INFERENCE-CZER-FIXED-VARIABLE");



    private static final SubLObject $$CommutativeRelation = reader_make_constant_shell(makeString("CommutativeRelation"));

    private static final SubLObject $$PartiallyCommutativeRelation = reader_make_constant_shell(makeString("PartiallyCommutativeRelation"));

    public static final SubLSymbol $variable_token$ = makeSymbol("*VARIABLE-TOKEN*");

    public static final SubLString $$$var = makeString("var");

    public static final SubLList $list20 = cons(makeUninternedSymbol("KEY"), makeSymbol("LITERALS"));

    public static final SubLSymbol VARIABLE_TOKEN = makeSymbol("VARIABLE-TOKEN");



    public static final SubLList $list23 = cons(makeUninternedSymbol("KEY"), makeSymbol("LITERAL"));





    public static final SubLSymbol $sym26$NON_CONTIGUOUS_HL_VAR_ = makeSymbol("NON-CONTIGUOUS-HL-VAR?");

    public static final SubLSymbol POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR = makeSymbol("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR");









    public static final SubLString $str32$Unexpected_inference_disjunction_ = makeString("Unexpected inference disjunction free el vars policy : ~S");

    public static final SubLSymbol INFERENCE_CANONICALIZE_ASK_MEMOIZED = makeSymbol("INFERENCE-CANONICALIZE-ASK-MEMOIZED");



    private static final SubLString $str35$Got_a_czer_result_of_unexpected_t = makeString("Got a czer-result of unexpected type: ~s");

    private static final SubLList $list36 = list(makeSymbol("TUPLE"));

    public static final SubLList $list37 = list(makeSymbol("CLAUSE"), makeSymbol("EL-TO-HL-VARIABLE-MAP"), makeSymbol("FREE-EL-VARS"));

    public static final SubLList $list38 = list(makeSymbol("LOCAL-HL-CLAUSE"), makeSymbol("LOCAL-EL-TO-HL-VARIABLE-MAP"), makeSymbol("LOCAL-FREE-EL-VARS"));



    private static final SubLList $list40 = list(makeSymbol("CLAUSE"), makeSymbol("EL-TO-HL-VARIABLE-MAP"), makeSymbol("FREE-HL-VARS"));

    private static final SubLSymbol $sym41$INFERENCE_TERM__ = makeSymbol("INFERENCE-TERM-<");



    private static final SubLString $str43$Something_weird_happened_when_try = makeString("Something weird happened when trying to distribute #$ist across logical operators with ~s");

    private static final SubLSymbol $sym44$_EXIT = makeSymbol("%EXIT");







    public static final SubLSymbol IST_SENTENCE_WITH_CHLMT_P = makeSymbol("IST-SENTENCE-WITH-CHLMT-P");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));









    public static final SubLSymbol $sym54$_ = makeSymbol(">");



    public static final SubLList $list56 = list(reader_make_constant_shell(makeString("False")));

    public static final SubLString $str57$Can_t_canonicalize_hypothesis__S = makeString("Can't canonicalize hypothesis ~S");



    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");

    private static final SubLObject $$assertionDirection = reader_make_constant_shell(makeString("assertionDirection"));

    private static final SubLObject $$constraint = reader_make_constant_shell(makeString("constraint"));

    private static final SubLObject $$highlyRelevantAssertion = reader_make_constant_shell(makeString("highlyRelevantAssertion"));

    private static final SubLObject $$irrelevantAssertion = reader_make_constant_shell(makeString("irrelevantAssertion"));

    private static final SubLObject $$knownAntecedentRule = reader_make_constant_shell(makeString("knownAntecedentRule"));

    private static final SubLObject $$queryExtentCached = reader_make_constant_shell(makeString("queryExtentCached"));

    private static final SubLObject $$genlRules = reader_make_constant_shell(makeString("genlRules"));

    private static final SubLObject $$universalLiftingRule = reader_make_constant_shell(makeString("universalLiftingRule"));

    public static SubLObject canonicalize_problem_query(SubLObject query) {
        query = copy_tree(query);
        final SubLObject simplified_query = inference_simplify_problem_query(query);
        final SubLObject sorted_query = inference_sort_clauses_and_literals(simplified_query);
        final SubLObject reduced_literals_query = inference_delete_duplicate_literals(sorted_query);
        final SubLObject reduced_clauses_query = inference_delete_duplicate_clauses(reduced_literals_query);
        return contiguize_hl_vars_in_clauses(reduced_clauses_query);
    }

    public static SubLObject inference_delete_duplicate_literals(SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject any_reducedP = NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = NIL;
        contextualized_dnf_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject literals = clauses.neg_lits(contextualized_dnf_clause);
            if ((NIL != literals) && (NIL == list_utilities.singletonP(literals))) {
                thread.resetMultipleValues();
                final SubLObject reduced_literals = delete_duplicate_sorted_literals(literals);
                final SubLObject reducedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                clauses.set_clause_neg_lits(contextualized_dnf_clause, reduced_literals);
                if (NIL != reducedP) {
                    any_reducedP = T;
                }
            }
            literals = clauses.pos_lits(contextualized_dnf_clause);
            if ((NIL != literals) && (NIL == list_utilities.singletonP(literals))) {
                thread.resetMultipleValues();
                final SubLObject reduced_literals = delete_duplicate_sorted_literals(literals);
                final SubLObject reducedP = thread.secondMultipleValue();
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

    public static SubLObject inference_delete_duplicate_clauses(final SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            return contextualized_dnf_clauses;
        }
        thread.resetMultipleValues();
        SubLObject reduced_clauses = delete_duplicate_sorted_clauses(contextualized_dnf_clauses);
        final SubLObject reducedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != reducedP) {
            reduced_clauses = inference_sort_clauses_and_literals(reduced_clauses);
        }
        return reduced_clauses;
    }

    public static SubLObject delete_duplicate_sorted_literals(final SubLObject literals) {
        final SubLObject literal_count = length(literals);
        final SubLObject reduced_literals = list_utilities.delete_duplicates_sorted(literals, symbol_function(EQUAL));
        final SubLObject reduced_literal_count = length(reduced_literals);
        final SubLObject reducedP = numL(reduced_literal_count, literal_count);
        return subl_promotions.values2(reduced_literals, reducedP);
    }

    public static SubLObject delete_duplicate_sorted_clauses(final SubLObject v_clauses) {
        final SubLObject clause_count = length(v_clauses);
        final SubLObject reduced_clauses = list_utilities.delete_duplicates_sorted(v_clauses, symbol_function(EQUAL));
        final SubLObject reduced_clause_count = length(reduced_clauses);
        final SubLObject reducedP = numL(reduced_clause_count, clause_count);
        return subl_promotions.values2(reduced_clauses, reducedP);
    }

    public static SubLObject inference_simplify_problem_query(final SubLObject contextualized_dnf_clauses) {
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

    public static SubLObject inference_simplify_contextualized_dnf_clause(final SubLObject contextualized_clause) {
        SubLObject neglits_to_become_poslits = NIL;
        SubLObject rest_neglits;
        SubLObject asent;
        for (rest_neglits = NIL, rest_neglits = contextualized_neg_lits(contextualized_clause); !rest_neglits.isAtom(); rest_neglits = rest_neglits.rest()) {
            asent = rest_neglits.first();
            if (NIL != true_sentence_p(inference_datastructures_problem_query.contextualized_asent_asent(asent))) {
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
                new_neglits = delete(moving_lit, new_neglits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                moving_lit = cdolist_list_var.first();
            } 
            clauses.set_clause_neg_lits(contextualized_clause, new_neglits);
            final SubLObject canonicalized_new_poslits = list_utilities.nmapcar(INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE, neglits_to_become_poslits);
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

    public static SubLObject inference_simplify_negated_true_sentence(final SubLObject contextualized_asent) {
        SubLObject mt = NIL;
        SubLObject true_sentence = NIL;
        destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list1);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        destructuring_bind_must_consp(current, contextualized_asent, $list1);
        true_sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject subsentence = cycl_utilities.sentence_arg1(true_sentence, UNPROVIDED);
            SubLObject negated_sub = NIL;
            SubLObject result = NIL;
            if (NIL != cycl_variables.hl_varP(subsentence)) {
                result = contextualized_asent;
            } else
                if (subsentence.eql($$False)) {
                    negated_sub = $$True;
                    result = convert_to_hl_contextualized_asent(list($$trueSentence, negated_sub), mt);
                } else {
                    result = convert_to_hl_contextualized_asent(list($$trueSentence, inference_el_dnf(cycl_utilities.negate(subsentence), mt, UNPROVIDED)), mt);
                }

            return inference_simplify_contextualized_asent(result);
        }
        cdestructuring_bind_error(contextualized_asent, $list1);
        return NIL;
    }

    public static SubLObject inference_el_dnf(final SubLObject sentence, final SubLObject mt, SubLObject implicitify_universalsP) {
        if (implicitify_universalsP == UNPROVIDED) {
            implicitify_universalsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
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

    public static SubLObject backchaining_on_ist_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $backchaining_on_ist_enabledP$.getDynamicValue(thread);
    }

    public static SubLObject inference_simplify_contextualized_asent(final SubLObject contextualized_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        destructuring_bind_must_consp(current, contextualized_asent, $list5);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((((NIL == backchaining_on_ist_enabledP()) && (NIL == kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread))) && (NIL != ist_of_atomic_sentence_p(asent))) && (NIL != variables.fully_bound_p(designated_mt(asent)))) {
                final SubLObject subsentence = designated_sentence(asent);
                final SubLObject sub_mt = designated_mt(asent);
                return convert_to_hl_contextualized_asent(subsentence, sub_mt);
            }
            if (((NIL != ist_of_atomic_sentence_p(asent)) && (NIL != variables.fully_bound_p(designated_mt(asent)))) && ((NIL != mt_vars.core_microtheory_p(designated_mt(asent))) || ((NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt)) && (NIL == kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread))))) {
                final SubLObject subsentence = designated_sentence(asent);
                final SubLObject sub_mt = designated_mt(asent);
                return convert_to_hl_contextualized_asent(subsentence, sub_mt);
            }
            if (NIL != true_sentence_of_atomic_sentence_p(asent)) {
                final SubLObject subsentence = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                return convert_to_hl_contextualized_asent(subsentence, mt);
            }
            if ((!$$elementOf.eql(cycl_utilities.atomic_sentence_predicate(asent))) || (NIL == formula_pattern_match.pattern_matches_formula_without_bindings($list7, asent))) {
                return contextualized_asent;
            }
            final SubLObject hl_var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject el_var_1 = cycl_utilities.atomic_sentence_arg1(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
            final SubLObject isa_asent = cycl_utilities.atomic_sentence_arg2(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
            final SubLObject el_var_2 = cycl_utilities.atomic_sentence_arg1(isa_asent, UNPROVIDED);
            final SubLObject collection = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
            if ((((NIL != cycl_grammar.hl_variable_p(hl_var)) && (NIL != cycl_grammar.el_variable_p(el_var_1))) && (NIL != cycl_grammar.el_variable_p(el_var_2))) && el_var_1.eql(el_var_2)) {
                return convert_to_hl_contextualized_asent(list($$isa, hl_var, collection), mt);
            }
        } else {
            cdestructuring_bind_error(contextualized_asent, $list5);
        }
        return NIL;
    }

    public static SubLObject inference_sort_clauses_and_literals(final SubLObject contextualized_dnf_clauses) {
        if (NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            final SubLObject contextualized_dnf_clause = contextualized_dnf_clauses.first();
            final SubLObject sorted_contextualized_dnf_clause = inference_sort_contextualized_clause_literals(contextualized_dnf_clause);
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

    public static SubLObject inference_sort_contextualized_clause_literals(final SubLObject contextualized_clause) {
        final SubLObject neg_lits = contextualized_neg_lits(contextualized_clause);
        final SubLObject pos_lits = contextualized_pos_lits(contextualized_clause);
        final SubLObject new_neg_lits = inference_sort_contextualized_literals(neg_lits);
        final SubLObject new_pos_lits = inference_sort_contextualized_literals(pos_lits);
        if (neg_lits.eql(new_neg_lits) && pos_lits.eql(new_pos_lits)) {
            return contextualized_clause;
        }
        final SubLObject new_contextualized_clause = clauses.make_clause(new_neg_lits, new_pos_lits);
        return new_contextualized_clause;
    }

    public static SubLObject inference_sort_contextualized_clauses(final SubLObject contextualized_clauses) {
        return Sort.sort(contextualized_clauses, $sym9$INFERENCE_CLAUSE__, UNPROVIDED);
    }

    public static SubLObject inference_sort_contextualized_literals(final SubLObject literals) {
        return inference_awesome_sort_contextualized_literals(literals);
    }

    public static SubLObject inference_simple_sort_contextualized_literals(final SubLObject literals) {
        return Sort.sort(literals, $sym10$INFERENCE_CONTEXTUALIZED_ASENT__, UNPROVIDED);
    }

    public static SubLObject inference_clause_L(final SubLObject clause1, final SubLObject clause2) {
        return inference_list_L(clause1, clause2);
    }

    public static SubLObject inference_contextualized_asent_L(final SubLObject asent1, final SubLObject asent2) {
        return inference_list_L(asent1, asent2);
    }

    public static SubLObject inference_list_L(final SubLObject list1, final SubLObject list2) {
        return inference_formula_L(list1, list2);
    }

    public static SubLObject inference_formula_L(final SubLObject formula1, final SubLObject formula2) {
        if (NIL != formula_arityL(formula1, formula2, UNPROVIDED)) {
            return T;
        }
        if (NIL != formula_arityG(formula1, formula2, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject seqvar1P = formula_with_sequence_termP(formula1);
        final SubLObject seqvar2P = formula_with_sequence_termP(formula2);
        if ((NIL == seqvar1P) && (NIL != seqvar2P)) {
            return T;
        }
        if ((NIL != seqvar1P) && (NIL == seqvar2P)) {
            return NIL;
        }
        final SubLObject terms1 = cycl_utilities.formula_terms(formula1, UNPROVIDED);
        final SubLObject terms2 = cycl_utilities.formula_terms(formula2, UNPROVIDED);
        SubLObject term1 = NIL;
        SubLObject term1_$1 = NIL;
        SubLObject term2 = NIL;
        SubLObject term2_$2 = NIL;
        term1 = terms1;
        term1_$1 = term1.first();
        term2 = terms2;
        term2_$2 = term2.first();
        while ((NIL != term2) || (NIL != term1)) {
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

    public static SubLObject inference_term_L(final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (term1.eql(term2)) {
            return NIL;
        }
        final SubLObject type_code_1 = inference_term_type_code(term1);
        final SubLObject type_code_2 = inference_term_type_code(term2);
        if (type_code_1.numL(type_code_2)) {
            return T;
        }
        if (type_code_1.numG(type_code_2)) {
            return NIL;
        }
        if (NIL != constant_p(term1)) {
            return inference_constant_L(term1, term2);
        }
        if (NIL != nart_handles.nart_p(term1)) {
            return inference_nart_L(term1, term2);
        }
        if (NIL != fixed_variable_p(term1)) {
            return numL(fixed_variable_id(term1), fixed_variable_id(term2));
        }
        if (NIL != variables.variable_p(term1)) {
            if (NIL != $inference_sort_principledP$.getDynamicValue(thread)) {
                return NIL;
            }
            return numL(variables.variable_id(term1), variables.variable_id(term2));
        } else {
            if (NIL != cycl_variables.el_varP(term1)) {
                return NIL;
            }
            if (NIL != cycl_variables.permissible_keyword_varP(term1)) {
                return NIL;
            }
            if (NIL != el_formula_p(term1)) {
                return inference_formula_L(term1, term2);
            }
            if (term1.isNumber()) {
                return numL(term1, term2);
            }
            if (term1.isString()) {
                return Strings.stringL(term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (term1.isSymbol()) {
                return Strings.stringL(symbol_name(term1), symbol_name(term2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (term1.isChar()) {
                return charL(term1, term2);
            }
            if (NIL != assertion_handles.assertion_p(term1)) {
                return inference_term_L(fi.assertion_hl_formula(term1, UNPROVIDED), fi.assertion_hl_formula(term2, UNPROVIDED));
            }
            Errors.error($str11$The_type_of_object__a_cannot_be_s, term1);
            return NIL;
        }
    }

    public static SubLObject inference_term_G(final SubLObject term1, final SubLObject term2) {
        return inference_term_L(term2, term1);
    }

    public static SubLObject inference_term_type_code(final SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
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
        if (NIL != el_formula_p(v_term)) {
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

    public static SubLObject inference_constant_L(final SubLObject constant1, final SubLObject constant2) {
        final SubLObject suid1 = constant_suid(constant1);
        final SubLObject suid2 = constant_suid(constant2);
        return numL(suid1, suid2);
    }

    public static SubLObject inference_nart_L(final SubLObject nart1, final SubLObject nart2) {
        final SubLObject suid1 = nart_handles.nart_id(nart1);
        final SubLObject suid2 = nart_handles.nart_id(nart2);
        return numL(suid1, suid2);
    }

    public static SubLObject non_fixed_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != list_utilities.alist_p($inference_czer_fixed_vars_table$.getDynamicValue(thread))) && (NIL != cycl_grammar.hl_variable_p(v_object))) && (NIL == list_utilities.alist_has_keyP($inference_czer_fixed_vars_table$.getDynamicValue(thread), v_object, symbol_function(EQL))));
    }

    public static SubLObject fixed_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != list_utilities.alist_p($inference_czer_fixed_vars_table$.getDynamicValue(thread))) && (NIL != cycl_grammar.hl_variable_p(v_object))) && (NIL != list_utilities.alist_has_keyP($inference_czer_fixed_vars_table$.getDynamicValue(thread), v_object, symbol_function(EQL))));
    }

    public static SubLObject fully_fixed_p(final SubLObject tree) {
        return makeBoolean(NIL == list_utilities.tree_find_if(NON_FIXED_VARIABLE_P, tree, UNPROVIDED));
    }

    public static SubLObject fixed_variable_id(final SubLObject fixed_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup_without_values($inference_czer_fixed_vars_table$.getDynamicValue(thread), fixed_var, symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject fixed_variable_token(final SubLObject fixed_var) {
        return list($INFERENCE_CZER_FIXED_VARIABLE, fixed_variable_id(fixed_var));
    }

    public static SubLObject fixed_variable_token_p(final SubLObject v_object) {
        return list_utilities.list_with_first_p(v_object, $INFERENCE_CZER_FIXED_VARIABLE);
    }

    public static SubLObject fixed_variable_for_token(final SubLObject token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_reverse_lookup($inference_czer_fixed_vars_table$.getDynamicValue(thread), second(token), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject inference_czer_at_least_partially_commutative_relation_p(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        final SubLObject cached_result = list_utilities.alist_lookup_without_values($inference_czer_at_least_partially_commutative_relations_alist$.getDynamicValue(thread), pred, symbol_function(EQL), $CACHE_MISS);
        if ($CACHE_MISS == cached_result) {
            resultP = makeBoolean(((NIL != variables.variable_p(pred)) || (NIL != fort_types_interface.fort_has_cached_typeP(pred, $$CommutativeRelation))) || (NIL != fort_types_interface.fort_has_cached_typeP(pred, $$PartiallyCommutativeRelation)));
            $inference_czer_at_least_partially_commutative_relations_alist$.setDynamicValue(list_utilities.alist_enter($inference_czer_at_least_partially_commutative_relations_alist$.getDynamicValue(thread), pred, resultP, symbol_function(EQL)), thread);
        } else {
            resultP = cached_result;
        }
        return resultP;
    }

    public static SubLObject inference_czer_not_at_all_commutative_relation_p(final SubLObject pred) {
        return makeBoolean(NIL == inference_czer_at_least_partially_commutative_relation_p(pred));
    }

    public static SubLObject not_at_all_commutative_contextualized_asent_p(final SubLObject contextualized_asent) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return inference_czer_not_at_all_commutative_relation_p(pred);
    }

    public static SubLObject at_least_partially_commutative_contextualized_asent_p(final SubLObject contextualized_asent) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return inference_czer_at_least_partially_commutative_relation_p(pred);
    }

    public static SubLObject inference_awesome_sort_contextualized_literals(final SubLObject literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $inference_czer_fixed_vars_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $inference_czer_next_fixed_var_id$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $inference_czer_at_least_partially_commutative_relations_alist$.currentBinding(thread);
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

    public static SubLObject inference_awesome_sort_contextualized_literals_iterative(SubLObject already_sorted_literals, SubLObject not_yet_sorted_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject skip_fully_fixed_this_timeP = NIL;
        while (NIL == doneP) {
            if (NIL == not_yet_sorted_literals) {
                doneP = T;
            } else {
                thread.resetMultipleValues();
                final SubLObject new_awesome_literals = pick_some_awesome_lits(not_yet_sorted_literals, skip_fully_fixed_this_timeP);
                final SubLObject skip_fully_fixed_next_timeP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                skip_fully_fixed_this_timeP = skip_fully_fixed_next_timeP;
                already_sorted_literals = nconc(already_sorted_literals, new_awesome_literals);
                not_yet_sorted_literals = set_difference(not_yet_sorted_literals, new_awesome_literals, symbol_function(EQ), UNPROVIDED);
                if (NIL == not_yet_sorted_literals) {
                    continue;
                }
                inference_update_fixed_vars_table(new_awesome_literals);
            }
        } 
        return already_sorted_literals;
    }

    public static SubLObject pick_some_awesome_lits(final SubLObject not_yet_sorted_literals, final SubLObject skip_fully_fixedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(not_yet_sorted_literals)) {
            return subl_promotions.values2(copy_list(not_yet_sorted_literals), NIL);
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
        final SubLObject _prev_bind_0 = $inference_sort_principledP$.currentBinding(thread);
        try {
            $inference_sort_principledP$.bind(principledP, thread);
            awesome_literals = inference_simple_sort_contextualized_literals(awesome_literals);
        } finally {
            $inference_sort_principledP$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(awesome_literals, skip_fully_fixed_next_timeP);
    }

    public static SubLObject inference_fully_fixed_literals(final SubLObject not_yet_sorted_literals) {
        SubLObject fully_fixed_literals = NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != fully_fixed_p(literal)) && (NIL != not_at_all_commutative_contextualized_asent_p(literal))) {
                fully_fixed_literals = cons(literal, fully_fixed_literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return fully_fixed_literals;
    }

    public static SubLObject variable_token(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return $variable_token$.getGlobalValue();
    }

    public static SubLObject var_tokenized_contextualized_asent_predicate(final SubLObject contextualized_asent) {
        final SubLObject pred = inference_datastructures_problem_query.contextualized_asent_predicate(contextualized_asent);
        if (NIL != variables.variable_p(pred)) {
            return $variable_token$.getGlobalValue();
        }
        return pred;
    }

    public static SubLObject inference_unique_commutative_literals(final SubLObject not_yet_sorted_literals) {
        SubLObject commutative_literals_alist = NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != at_least_partially_commutative_contextualized_asent_p(literal)) {
                commutative_literals_alist = list_utilities.alist_push(commutative_literals_alist, var_tokenized_contextualized_asent_predicate(literal), literal, symbol_function(EQ));
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
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject literals = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            key = current.first();
            current = literals = current.rest();
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
                final SubLObject datum2 = current2 = cons2;
                SubLObject key2 = NIL;
                SubLObject literals2 = NIL;
                destructuring_bind_must_consp(current2, datum2, $list20);
                key2 = current2.first();
                current2 = current2.rest();
                SubLObject cdolist_list_var_$3;
                literals2 = cdolist_list_var_$3 = current2;
                SubLObject literal2 = NIL;
                literal2 = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    fort_id_alist = list_utilities.alist_push(fort_id_alist, cycl_utilities.sorted_fort_id_list(literal2), literal2, symbol_function(EQUAL));
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
                final SubLObject datum2 = current2 = cons2;
                SubLObject key2 = NIL;
                SubLObject literals2 = NIL;
                destructuring_bind_must_consp(current2, datum2, $list20);
                key2 = current2.first();
                current2 = literals2 = current2.rest();
                if (NIL != list_utilities.singletonP(literals2)) {
                    unique_commutative_literals = cons(list_utilities.only_one(literals2), unique_commutative_literals);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                cons2 = cdolist_list_var3.first();
            } 
        }
        return unique_commutative_literals;
    }

    public static SubLObject inference_uniquely_constrained_literals(final SubLObject not_yet_sorted_literals) {
        SubLObject uniquely_constrained_literals = NIL;
        SubLObject alist = NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != not_at_all_commutative_contextualized_asent_p(literal)) {
                final SubLObject dwimmed_literal = transform_list_utilities.transform(literal, NON_FIXED_VARIABLE_P, VARIABLE_TOKEN, UNPROVIDED);
                final SubLObject alist_entry = assoc(dwimmed_literal, alist, symbol_function(EQUAL), UNPROVIDED);
                if (NIL != alist_entry) {
                    rplacd(alist_entry, $NOT_UNIQUE);
                } else {
                    final SubLObject new_alist_entry = cons(dwimmed_literal, literal);
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
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject literal2 = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            key = current.first();
            current = literal2 = current.rest();
            if ($NOT_UNIQUE != literal2) {
                uniquely_constrained_literals = cons(literal2, uniquely_constrained_literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return uniquely_constrained_literals;
    }

    public static SubLObject inference_update_fixed_vars_table(final SubLObject new_uniquely_constrained_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = list_utilities.tree_gather(new_uniquely_constrained_literals, VARIABLE_P, symbol_function(EQL), UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != non_fixed_variable_p(var)) {
                $inference_czer_fixed_vars_table$.setDynamicValue(list_utilities.alist_enter($inference_czer_fixed_vars_table$.getDynamicValue(thread), var, $inference_czer_next_fixed_var_id$.getDynamicValue(thread), symbol_function(EQL)), thread);
                $inference_czer_next_fixed_var_id$.setDynamicValue(add($inference_czer_next_fixed_var_id$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject contiguize_hl_vars_in_clauses(final SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hl_ground_tree_p(contextualized_dnf_clauses)) {
            return subl_promotions.values2(contextualized_dnf_clauses, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject all_goodP = all_hl_vars_contiguous_and_in_orderP(contextualized_dnf_clauses);
        final SubLObject largest_hl_var_num = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != all_goodP) {
            return subl_promotions.values2(contextualized_dnf_clauses, identity_variable_map(largest_hl_var_num));
        }
        final SubLObject hl_var_blist = hl_var_contiguity_alist(contextualized_dnf_clauses);
        return values(bindings.napply_bindings(hl_var_blist, contextualized_dnf_clauses), bindings.invert_bindings(hl_var_blist));
    }

    public static SubLObject identity_variable_map(final SubLObject largest_var_num) {
        return bindings.hl_identity_bindings(number_utilities.f_1X(largest_var_num));
    }

    public static SubLObject non_contiguous_hl_varP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cycl_grammar.hl_variable_p(v_object)) {
            return NIL;
        }
        final SubLObject var_num = variables.variable_id(v_object);
        if (var_num.numLE($largest_hl_var_num_so_far$.getDynamicValue(thread))) {
            return NIL;
        }
        if (var_num.numE(number_utilities.f_1X($largest_hl_var_num_so_far$.getDynamicValue(thread)))) {
            $largest_hl_var_num_so_far$.setDynamicValue(var_num, thread);
            return NIL;
        }
        return T;
    }

    public static SubLObject all_hl_vars_contiguous_and_in_orderP(final SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject largest_num = NIL;
        final SubLObject _prev_bind_0 = $largest_hl_var_num_so_far$.currentBinding(thread);
        try {
            $largest_hl_var_num_so_far$.bind(MINUS_ONE_INTEGER, thread);
            result = makeBoolean(NIL == list_utilities.tree_find_if($sym26$NON_CONTIGUOUS_HL_VAR_, contextualized_dnf_clauses, UNPROVIDED));
            largest_num = $largest_hl_var_num_so_far$.getDynamicValue(thread);
        } finally {
            $largest_hl_var_num_so_far$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(result, largest_num);
    }

    public static SubLObject possibly_note_hl_var_contiguity_pair(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_grammar.hl_variable_p(v_object)) {
            final SubLObject new_var_cons = assoc(v_object, $hl_var_contiguity_alist$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            if (NIL == new_var_cons) {
                final SubLObject next_var_num = number_utilities.f_1X($largest_hl_var_num_so_far$.getDynamicValue(thread));
                final SubLObject next_var = variables.get_variable(next_var_num);
                $largest_hl_var_num_so_far$.setDynamicValue(next_var_num, thread);
                $hl_var_contiguity_alist$.setDynamicValue(cons(cons(v_object, next_var), $hl_var_contiguity_alist$.getDynamicValue(thread)), thread);
            }
        }
        return NIL;
    }

    public static SubLObject hl_var_contiguity_alist(final SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $largest_hl_var_num_so_far$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $hl_var_contiguity_alist$.currentBinding(thread);
        try {
            $largest_hl_var_num_so_far$.bind(MINUS_ONE_INTEGER, thread);
            $hl_var_contiguity_alist$.bind(NIL, thread);
            list_utilities.tree_find_if(POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR, contextualized_dnf_clauses, UNPROVIDED);
            result = nreverse($hl_var_contiguity_alist$.getDynamicValue(thread));
        } finally {
            $hl_var_contiguity_alist$.rebind(_prev_bind_2, thread);
            $largest_hl_var_num_so_far$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject inference_apply_disjunction_free_el_vars_policy(final SubLObject policy, final SubLObject current_disjunction_free_el_vars, final SubLObject disjunct_free_el_vars) {
        if (policy.eql($REQUIRE_EQUAL)) {
            if (NIL != list_utilities.sets_equalP(current_disjunction_free_el_vars, disjunct_free_el_vars, UNPROVIDED)) {
                return current_disjunction_free_el_vars;
            }
            return $POLICY_VIOLATION;
        } else {
            if (policy.eql($COMPUTE_INTERSECTION)) {
                return intersection(current_disjunction_free_el_vars, disjunct_free_el_vars, UNPROVIDED, UNPROVIDED);
            }
            if (policy.eql($COMPUTE_UNION)) {
                return union(current_disjunction_free_el_vars, disjunct_free_el_vars, UNPROVIDED, UNPROVIDED);
            }
            return Errors.error($str32$Unexpected_inference_disjunction_, policy);
        }
    }

    public static SubLObject inference_canonicalize_ask_memoized_internal(final SubLObject cycl_query, final SubLObject mt, final SubLObject disjunction_free_el_vars_policy) {
        return inference_canonicalize_ask_int(cycl_query, mt, disjunction_free_el_vars_policy);
    }

    public static SubLObject inference_canonicalize_ask_memoized(final SubLObject cycl_query, final SubLObject mt, final SubLObject disjunction_free_el_vars_policy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_canonicalize_ask_memoized_internal(cycl_query, mt, disjunction_free_el_vars_policy);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_CANONICALIZE_ASK_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_CANONICALIZE_ASK_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_CANONICALIZE_ASK_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_query, mt, disjunction_free_el_vars_policy);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cycl_query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && disjunction_free_el_vars_policy.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_canonicalize_ask_memoized_internal(cycl_query, mt, disjunction_free_el_vars_policy)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl_query, mt, disjunction_free_el_vars_policy));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_canonicalize_ask_int(final SubLObject cycl_query, SubLObject mt, final SubLObject disjunction_free_el_vars_policy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject czer_result = NIL;
        if (NIL == mt) {
            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        thread.resetMultipleValues();
        final SubLObject czer_result_$4 = czer_main.canonicalize_ask_sentence(cycl_query, mt);
        final SubLObject mt_$5 = thread.secondMultipleValue();
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
        final SubLObject v_clauses = inference_standardize_canonicalize_ask_result(czer_result, disjunction_free_el_vars_policy, cycl_query);
        final SubLObject blist = thread.secondMultipleValue();
        final SubLObject free_el_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ($ILL_FORMED == v_clauses) {
            return subl_promotions.values3($ILL_FORMED, NIL, NIL);
        }
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject contextualized_clause = contextualize_clause(clause, mt, disjunction_free_el_vars_policy);
            contextualized_clauses = cons(contextualized_clause, contextualized_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return subl_promotions.values3(contextualized_clauses, blist, free_el_vars);
    }

    public static SubLObject inference_standardize_canonicalize_ask_result(final SubLObject czer_result, final SubLObject disjunction_free_el_vars_policy, final SubLObject cycl_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_clauses = NIL;
        SubLObject master_el_to_hl_variable_map = NIL;
        SubLObject all_free_el_vars = NIL;
        if (NIL != list_utilities.singletonP(czer_result)) {
            SubLObject tuple = NIL;
            destructuring_bind_must_consp(czer_result, czer_result, $list36);
            tuple = czer_result.first();
            final SubLObject current = czer_result.rest();
            if (NIL == current) {
                SubLObject current_$7;
                final SubLObject datum_$6 = current_$7 = tuple;
                SubLObject clause = NIL;
                SubLObject el_to_hl_variable_map = NIL;
                SubLObject free_el_vars = NIL;
                destructuring_bind_must_consp(current_$7, datum_$6, $list37);
                clause = current_$7.first();
                current_$7 = current_$7.rest();
                destructuring_bind_must_consp(current_$7, datum_$6, $list37);
                el_to_hl_variable_map = current_$7.first();
                current_$7 = current_$7.rest();
                destructuring_bind_must_consp(current_$7, datum_$6, $list37);
                free_el_vars = current_$7.first();
                current_$7 = current_$7.rest();
                if (NIL == current_$7) {
                    v_clauses = list(clause);
                    master_el_to_hl_variable_map = el_to_hl_variable_map;
                    all_free_el_vars = free_el_vars;
                } else {
                    cdestructuring_bind_error(datum_$6, $list37);
                }
            } else {
                cdestructuring_bind_error(czer_result, $list36);
            }
        } else {
            thread.resetMultipleValues();
            final SubLObject master_el_to_hl_variable_map_$8 = inference_master_el_to_hl_variable_map(czer_result, disjunction_free_el_vars_policy);
            final SubLObject all_free_el_vars_$9 = thread.secondMultipleValue();
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
                final SubLObject datum = current2 = tuple2;
                SubLObject local_hl_clause = NIL;
                SubLObject local_el_to_hl_variable_map = NIL;
                SubLObject local_free_el_vars = NIL;
                destructuring_bind_must_consp(current2, datum, $list38);
                local_hl_clause = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum, $list38);
                local_el_to_hl_variable_map = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum, $list38);
                local_free_el_vars = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    final SubLObject master_el_clause = bindings.apply_bindings_backwards(local_el_to_hl_variable_map, local_hl_clause);
                    final SubLObject master_hl_clause = bindings.apply_bindings(master_el_to_hl_variable_map, master_el_clause);
                    v_clauses = cons(master_hl_clause, v_clauses);
                } else {
                    cdestructuring_bind_error(datum, $list38);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tuple2 = cdolist_list_var.first();
            } 
            v_clauses = nreverse(v_clauses);
        }
        all_free_el_vars = canonicalize_free_el_var_ordering(all_free_el_vars, cycl_query);
        master_el_to_hl_variable_map = bindings.stable_sort_bindings(master_el_to_hl_variable_map, all_free_el_vars);
        return subl_promotions.values3(v_clauses, master_el_to_hl_variable_map, all_free_el_vars);
    }

    public static SubLObject inference_master_el_to_hl_variable_map(final SubLObject czer_result, final SubLObject disjunction_free_el_vars_policy) {
        SubLObject all_free_el_vars = $UNINITIALIZED;
        SubLObject all_el_vars = NIL;
        SubLObject cdolist_list_var = czer_result;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject clause = NIL;
            SubLObject el_to_hl_variable_map = NIL;
            SubLObject free_hl_vars = NIL;
            destructuring_bind_must_consp(current, datum, $list40);
            clause = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list40);
            el_to_hl_variable_map = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list40);
            free_hl_vars = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject free_el_vars = bindings.apply_bindings_backwards(el_to_hl_variable_map, free_hl_vars);
                final SubLObject el_vars = bindings.bindings_variables(el_to_hl_variable_map);
                all_el_vars = append(el_vars, all_el_vars);
                if ($UNINITIALIZED == all_free_el_vars) {
                    all_free_el_vars = free_el_vars;
                } else {
                    final SubLObject updated_all_free_el_vars = inference_apply_disjunction_free_el_vars_policy(disjunction_free_el_vars_policy, all_free_el_vars, free_el_vars);
                    if ($POLICY_VIOLATION == updated_all_free_el_vars) {
                        return subl_promotions.values2($ILL_FORMED, NIL);
                    }
                    all_free_el_vars = updated_all_free_el_vars;
                }
            } else {
                cdestructuring_bind_error(datum, $list40);
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
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject hl_var = variables.find_variable_by_id(index);
            master_el_to_hl_variable_map = bindings.add_variable_binding(el_var, hl_var, master_el_to_hl_variable_map);
        }
        master_el_to_hl_variable_map = nreverse(master_el_to_hl_variable_map);
        return subl_promotions.values2(master_el_to_hl_variable_map, all_free_el_vars);
    }

    public static SubLObject inference_sort_el_variables(final SubLObject el_variables) {
        return Sort.sort(el_variables, $sym41$INFERENCE_TERM__, UNPROVIDED);
    }

    public static SubLObject canonicalize_free_el_var_ordering(final SubLObject free_el_vars, final SubLObject cycl_query) {
        final SubLObject all_el_vars_in_appearance_order = list_utilities.tree_gather(cycl_query, EL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject free_el_vars_in_appearance_order = list_utilities.sort_via_position(free_el_vars, all_el_vars_in_appearance_order, UNPROVIDED, UNPROVIDED);
        return free_el_vars_in_appearance_order;
    }

    public static SubLObject decontextualize_clauses_with_best_mt(final SubLObject contextualized_clauses) {
        final SubLObject mt = determine_best_clauses_level_mt(contextualized_clauses);
        final SubLObject v_clauses = decontextualize_clauses(contextualized_clauses, mt);
        return subl_promotions.values2(v_clauses, mt);
    }

    public static SubLObject decontextualize_clauses(final SubLObject contextualized_clauses, final SubLObject mt) {
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

    public static SubLObject decontextualize_clause(final SubLObject contextualized_clause, final SubLObject mt) {
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
        return clauses.make_clause(nreverse(neg_lits), nreverse(pos_lits));
    }

    public static SubLObject contextualize_clauses(final SubLObject v_clauses, final SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
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
        return nreverse(ans);
    }

    public static SubLObject dnf_and_mt_to_hl_query(final SubLObject dnf_clause, final SubLObject mt) {
        return list(contextualize_clause(dnf_clause, mt, UNPROVIDED));
    }

    public static SubLObject contextualize_clause(final SubLObject clause, final SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
        if (disjunction_free_el_vars_policy == UNPROVIDED) {
            disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
        }
        final SubLObject contextualized_neg_lits = convert_to_hl_contextualized_asents(clauses.neg_lits(clause), mt);
        final SubLObject contextualized_pos_lits = convert_to_hl_contextualized_asents(clauses.pos_lits(clause), mt);
        final SubLObject contextualized_clause = clauses.make_clause(contextualized_neg_lits, contextualized_pos_lits);
        return canonicalize_contextualized_clause(contextualized_clause, disjunction_free_el_vars_policy);
    }

    public static SubLObject canonicalize_contextualized_clause(final SubLObject contextualized_clause, SubLObject disjunction_free_el_vars_policy) {
        if (disjunction_free_el_vars_policy == UNPROVIDED) {
            disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == clauses.atomic_clause_p(contextualized_clause)) || (NIL == cyc_const_sentential_relation_p(cycl_utilities.atomic_sentence_predicate(inference_datastructures_problem_query.contextualized_asent_asent(clause_utilities.atomic_clause_asent(contextualized_clause)))))) {
            return contextualized_clause;
        }
        final SubLObject not_really_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
        final SubLObject subsentence = inference_datastructures_problem_query.contextualized_asent_asent(not_really_asent);
        final SubLObject sub_mt = inference_datastructures_problem_query.contextualized_asent_mt(not_really_asent);
        final SubLObject contextualized_clauses = inference_canonicalize_ask_memoized(subsentence, sub_mt, disjunction_free_el_vars_policy);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(contextualized_clauses))) {
            Errors.error($str43$Something_weird_happened_when_try, contextualized_clause);
        }
        return contextualized_clauses.first();
    }

    public static SubLObject convert_to_hl_contextualized_asents(final SubLObject asents, final SubLObject mt) {
        SubLObject contextualized_asents = NIL;
        SubLObject cdolist_list_var = asents;
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject contextualized_asent = convert_to_hl_contextualized_asent(asent, mt);
            contextualized_asents = cons(contextualized_asent, contextualized_asents);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        contextualized_asents = nreverse(contextualized_asents);
        return contextualized_asents;
    }

    public static SubLObject convert_to_hl_contextualized_asent(SubLObject asent, final SubLObject mt) {
        if (NIL != cycl_variables.cyc_varP(asent)) {
            asent = make_unary_formula($$trueSentence, asent);
        }
        final SubLObject contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(mt, asent);
        return inference_simplify_contextualized_asent(contextualized_asent);
    }

    public static SubLObject find_problem_by_el_query(final SubLObject store, final SubLObject el_query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject sentence = czer_utilities.unwrap_if_ist(el_query, mt, UNPROVIDED);
            final SubLObject mt_$10 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject query = inference_canonicalize_ask_int(sentence, mt_$10, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
            final SubLObject el_to_hl_variable_map = thread.secondMultipleValue();
            final SubLObject free_el_vars = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject free_hl_vars = (NIL != inference_datastructures_problem_store.problem_identity_depends_on_free_hl_varsP(store)) ? variables.sort_hl_variable_list_memoized(bindings.apply_bindings(el_to_hl_variable_map, free_el_vars)) : NIL;
            return inference_worker.find_problem_int(store, query, free_hl_vars, T);
        } finally {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject problem_query_el_formula(final SubLObject query) {
        return cycl_utilities.hl_to_el(problem_query_formula(query));
    }

    public static SubLObject problem_query_formula(final SubLObject query) {
        return contextualized_dnf_clauses_formula(query, UNPROVIDED);
    }

    public static SubLObject contextualized_dnf_clauses_formula(final SubLObject contextualized_dnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        if (NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            return contextualized_dnf_clause_formula(contextualized_dnf_clauses.first(), clause_level_mt);
        }
        return contextualized_dnf_clauses_disjunction_formula(contextualized_dnf_clauses, clause_level_mt);
    }

    public static SubLObject contextualized_cnf_clauses_formula(final SubLObject contextualized_cnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        if (NIL != list_utilities.singletonP(contextualized_cnf_clauses)) {
            return contextualized_cnf_clause_formula(contextualized_cnf_clauses.first(), clause_level_mt);
        }
        return contextualized_cnf_clauses_conjunction_formula(contextualized_cnf_clauses, clause_level_mt);
    }

    public static SubLObject contextualized_dnf_clause_formula(final SubLObject contextualized_dnf_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        return contextualized_clause_formula(contextualized_dnf_clause, clause_level_mt, $DNF);
    }

    public static SubLObject contextualized_cnf_clause_formula(final SubLObject contextualized_cnf_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        return contextualized_clause_formula(contextualized_cnf_clause, clause_level_mt, $CNF);
    }

    public static SubLObject contextualized_dnf_clauses_common_mt(final SubLObject contextualized_dnf_clauses) {
        final SubLObject formula = contextualized_dnf_clauses_formula(contextualized_dnf_clauses, UNPROVIDED);
        if ((NIL != ist_sentence_p(formula, UNPROVIDED)) && (NIL == cycl_utilities.expression_find_if(IST_SENTENCE_WITH_CHLMT_P, cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
            return cycl_utilities.formula_arg1(formula, UNPROVIDED);
        }
        return mt_vars.$core_mt_floor$.getGlobalValue();
    }

    public static SubLObject contextualized_dnf_clause_common_mt(final SubLObject contextualized_dnf_clause) {
        final SubLObject formula = contextualized_dnf_clause_formula(contextualized_dnf_clause, UNPROVIDED);
        if ((NIL != ist_sentence_p(formula, UNPROVIDED)) && (NIL == cycl_utilities.expression_find_if(IST_SENTENCE_WITH_CHLMT_P, cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
            return cycl_utilities.formula_arg1(formula, UNPROVIDED);
        }
        return mt_vars.$core_mt_floor$.getGlobalValue();
    }

    public static SubLObject contextualized_clause_formula(final SubLObject contextualized_clause, final SubLObject clause_level_mt, final SubLObject type) {
        final SubLObject contextualized_neg_lits = contextualized_neg_lits(contextualized_clause);
        final SubLObject contextualized_pos_lits = contextualized_pos_lits(contextualized_clause);
        if ((NIL == contextualized_neg_lits) && (NIL == contextualized_pos_lits)) {
            return $$True;
        }
        if ((NIL == contextualized_neg_lits) && (NIL != list_utilities.singletonP(contextualized_pos_lits))) {
            return contextualized_asent_formula(contextualized_pos_lits.first(), clause_level_mt);
        }
        if ((NIL == contextualized_pos_lits) && (NIL != list_utilities.singletonP(contextualized_neg_lits))) {
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

    public static SubLObject contextualized_neg_lits(final SubLObject contextualized_clause) {
        return clauses.neg_lits(contextualized_clause);
    }

    public static SubLObject contextualized_pos_lits(final SubLObject contextualized_clause) {
        return clauses.pos_lits(contextualized_clause);
    }

    public static SubLObject contextualized_asent_formula(final SubLObject contextualized_asent, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        destructuring_bind_must_consp(current, contextualized_asent, $list5);
        asent = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(contextualized_asent, $list5);
            return NIL;
        }
        if (mt.equal(clause_level_mt)) {
            return asent;
        }
        return make_binary_formula($$ist, mt, asent);
    }

    public static SubLObject contextualized_asent_negated_formula(final SubLObject contextualized_asent, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        destructuring_bind_must_consp(current, contextualized_asent, $list5);
        asent = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(contextualized_asent, $list5);
            return NIL;
        }
        if (mt.equal(clause_level_mt)) {
            return cycl_utilities.negate(asent);
        }
        return make_binary_formula($$ist, mt, cycl_utilities.negate(asent));
    }

    public static SubLObject contextualized_dnf_clauses_disjunction_formula(final SubLObject contextualized_dnf_clauses, SubLObject clause_level_mt) {
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
        return make_disjunction(nreverse(disjuncts));
    }

    public static SubLObject contextualized_cnf_clauses_conjunction_formula(final SubLObject contextualized_cnf_clauses, SubLObject clause_level_mt) {
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
        return make_conjunction(nreverse(conjuncts));
    }

    public static SubLObject contextualized_clause_conjunction_formula(final SubLObject contextualized_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        return contextualized_clause_juncts_formula(contextualized_clause, clause_level_mt, $CONJUNCTION);
    }

    public static SubLObject contextualized_clause_disjunction_formula(final SubLObject contextualized_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == UNPROVIDED) {
            clause_level_mt = $UNSPECIFIED;
        }
        return contextualized_clause_juncts_formula(contextualized_clause, clause_level_mt, $DISJUNCTION);
    }

    public static SubLObject contextualized_clause_juncts_formula(final SubLObject contextualized_clause, SubLObject clause_level_mt, final SubLObject type) {
        SubLObject neg_lit_formulas = NIL;
        SubLObject pos_lit_formulas = NIL;
        final SubLObject add_ist_wrapperP = makeBoolean(NIL == hlmt.hlmt_p(clause_level_mt));
        if (NIL != add_ist_wrapperP) {
            clause_level_mt = determine_best_clause_level_mt(contextualized_clause);
        }
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $NEG;
            if ($NEG == sense) {
                neg_lit_formulas = cons(contextualized_asent_negated_formula(contextualized_asent, clause_level_mt), neg_lit_formulas);
            } else {
                pos_lit_formulas = cons(contextualized_asent_formula(contextualized_asent, clause_level_mt), pos_lit_formulas);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $POS;
            if ($NEG == sense) {
                neg_lit_formulas = cons(contextualized_asent_negated_formula(contextualized_asent, clause_level_mt), neg_lit_formulas);
            } else {
                pos_lit_formulas = cons(contextualized_asent_formula(contextualized_asent, clause_level_mt), pos_lit_formulas);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        neg_lit_formulas = nreverse(neg_lit_formulas);
        pos_lit_formulas = nreverse(pos_lit_formulas);
        final SubLObject juncts = nconc(neg_lit_formulas, pos_lit_formulas);
        final SubLObject decontextualized_formula = (type == $CONJUNCTION) ? make_conjunction(juncts) : make_disjunction(juncts);
        return NIL != add_ist_wrapperP ? make_binary_formula($$ist, clause_level_mt, decontextualized_formula) : decontextualized_formula;
    }

    public static SubLObject determine_best_clause_level_mt(final SubLObject contextualized_clause) {
        return determine_best_clauses_level_mt(list(contextualized_clause));
    }

    public static SubLObject determine_best_clauses_level_mt(final SubLObject contextualized_clauses) {
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
                final SubLObject sense = $NEG;
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list5);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list5);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject total_data = assoc(mt, frequency_map, symbol_function(EQUAL), UNPROVIDED);
                    if (NIL == total_data) {
                        total_data = cons(mt, ZERO_INTEGER);
                        frequency_map = cons(total_data, frequency_map);
                    }
                    rplacd(total_data, add(total_data.rest(), ONE_INTEGER));
                } else {
                    cdestructuring_bind_error(datum, $list5);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                contextualized_asent = cdolist_list_var_$11.first();
            } 
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$12 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                final SubLObject sense = $POS;
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list5);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list5);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject total_data = assoc(mt, frequency_map, symbol_function(EQUAL), UNPROVIDED);
                    if (NIL == total_data) {
                        total_data = cons(mt, ZERO_INTEGER);
                        frequency_map = cons(total_data, frequency_map);
                    }
                    rplacd(total_data, add(total_data.rest(), ONE_INTEGER));
                } else {
                    cdestructuring_bind_error(datum, $list5);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                contextualized_asent = cdolist_list_var_$12.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        } 
        frequency_map = nreverse(frequency_map);
        frequency_map = Sort.stable_sort(frequency_map, symbol_function($sym54$_), symbol_function(CDR));
        return frequency_map.first().first();
    }

    public static SubLObject canonicalize_hypothesis(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject free_vars = sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject sentence_$13 = canonicalize_hypothesis_recursive(sentence, mt);
        final SubLObject mt_$14 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$13;
        mt = mt_$14;
        return subl_promotions.values3(sentence, mt, free_vars);
    }

    public static SubLObject canonicalize_hypothesis_recursive(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$minimal_skolem_arityP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$assume_free_vars_are_existentially_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = czer_vars.$forbid_quantified_sequence_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = czer_vars.$leave_skolem_constants_aloneP$.currentBinding(thread);
        try {
            czer_vars.$implicitify_universalsP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$minimal_skolem_arityP$.bind(T, thread);
            czer_vars.$assume_free_vars_are_existentially_boundP$.bind(T, thread);
            czer_vars.$forbid_quantified_sequence_variablesP$.bind(NIL, thread);
            czer_vars.$leave_skolem_constants_aloneP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject sentence_$15 = clausifier.el_cnf(sentence, mt);
            final SubLObject mt_$16 = thread.secondMultipleValue();
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
            return subl_promotions.values2(make_conjunction(NIL), mt);
        }
        if ((NIL == sentence) || sentence.eql($$False)) {
            return subl_promotions.values2(make_conjunction($list56), mt);
        }
        if (sentence.isAtom()) {
            Errors.error($str57$Can_t_canonicalize_hypothesis__S, sentence);
            return NIL;
        }
        if ((NIL != el_implication_p(sentence)) || (NIL != el_negation_p(sentence))) {
            return subl_promotions.values2(make_conjunction(list(sentence)), mt);
        }
        if (NIL != el_disjunction_p(sentence)) {
            return subl_promotions.values2(make_conjunction(list(sentence)), mt);
        }
        if (NIL != el_conjunction_p(sentence)) {
            SubLObject canon_args = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject canon_arg = canonicalize_hypothesis_recursive(arg, mt);
                if (NIL != el_conjunction_p(canon_arg)) {
                    canon_args = revappend(cycl_utilities.formula_args(canon_arg, UNPROVIDED), canon_args);
                } else {
                    canon_args = cons(canon_arg, canon_args);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            return subl_promotions.values2(bq_cons($$and, append(nreverse(canon_args), NIL)), mt);
        }
        if ((NIL == mt_designating_literalP(sentence)) || (NIL != el_negation_p(sentence))) {
            return subl_promotions.values2(make_conjunction(list(sentence)), mt);
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        final SubLObject designated_sentence = designated_sentence(sentence);
        SubLObject canon_mt;
        final SubLObject designated_mt = canon_mt = designated_mt(sentence);
        if (NIL == hlmt.hlmt_p(designated_mt)) {
            canon_mt = mt;
        }
        final SubLObject canonical_subsentence = canonicalize_hypothesis_recursive(designated_sentence, canon_mt);
        assert NIL != el_conjunction_p(canonical_subsentence) : "el_utilities.el_conjunction_p(canonical_subsentence) " + "CommonSymbols.NIL != el_utilities.el_conjunction_p(canonical_subsentence) " + canonical_subsentence;
        SubLObject conjuncts = NIL;
        SubLObject cdolist_list_var2;
        final SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args(canonical_subsentence, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject new_conjunct = make_binary_formula(predicate, designated_mt, conjunct);
            conjuncts = cons(new_conjunct, conjuncts);
            cdolist_list_var2 = cdolist_list_var2.rest();
            conjunct = cdolist_list_var2.first();
        } 
        conjuncts = nreverse(conjuncts);
        return subl_promotions.values2(make_conjunction(conjuncts), mt);
    }

    public static SubLObject categorize_hypothesis_formulas(final SubLObject hypothesis_formula) {
        final SubLObject formulas = cycl_utilities.formula_args(hypothesis_formula, UNPROVIDED);
        SubLObject literals = NIL;
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = NIL;
        formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != el_formula_p(formula)) && (NIL != rule_el_formulaP(formula))) {
                rules = cons(formula, rules);
            } else {
                literals = cons(formula, literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        } 
        literals = nreverse(literals);
        rules = nreverse(rules);
        return subl_promotions.values2(literals, rules);
    }

    public static SubLObject rule_el_formulaP(final SubLObject formula) {
        return makeBoolean(((((((((((((NIL != el_implication_p(formula)) || (NIL != el_disjunction_p(formula))) || (NIL != el_exception_p(formula))) || (NIL != el_pragmatic_requirement_p(formula))) || ((NIL != ist_sentence_p(formula, UNPROVIDED)) && (NIL != rule_el_formulaP(cycl_utilities.formula_arg2(formula, UNPROVIDED))))) || (NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$assertionDirection))) || (NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$constraint))) || (NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$highlyRelevantAssertion))) || (NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$irrelevantAssertion))) || (NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$knownAntecedentRule))) || (NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$queryExtentCached))) || (NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$genlRules))) || (NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, $$universalLiftingRule)));
    }

    public static SubLObject canonicalize_hypothetical_ask(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_sentence = NIL;
        SubLObject result_mt = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_functionsP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject result_sentence_$17 = czer_main.canonicalize_ask_sentence(sentence, mt);
            final SubLObject result_mt_$18 = thread.secondMultipleValue();
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
        declareFunction(me, "canonicalize_problem_query", "CANONICALIZE-PROBLEM-QUERY", 1, 0, false);
        declareFunction(me, "inference_delete_duplicate_literals", "INFERENCE-DELETE-DUPLICATE-LITERALS", 1, 0, false);
        declareFunction(me, "inference_delete_duplicate_clauses", "INFERENCE-DELETE-DUPLICATE-CLAUSES", 1, 0, false);
        declareFunction(me, "delete_duplicate_sorted_literals", "DELETE-DUPLICATE-SORTED-LITERALS", 1, 0, false);
        declareFunction(me, "delete_duplicate_sorted_clauses", "DELETE-DUPLICATE-SORTED-CLAUSES", 1, 0, false);
        declareFunction(me, "inference_simplify_problem_query", "INFERENCE-SIMPLIFY-PROBLEM-QUERY", 1, 0, false);
        declareFunction(me, "inference_simplify_contextualized_dnf_clause", "INFERENCE-SIMPLIFY-CONTEXTUALIZED-DNF-CLAUSE", 1, 0, false);
        declareFunction(me, "inference_simplify_negated_true_sentence", "INFERENCE-SIMPLIFY-NEGATED-TRUE-SENTENCE", 1, 0, false);
        declareFunction(me, "inference_el_dnf", "INFERENCE-EL-DNF", 2, 1, false);
        declareFunction(me, "backchaining_on_ist_enabledP", "BACKCHAINING-ON-IST-ENABLED?", 0, 0, false);
        declareFunction(me, "inference_simplify_contextualized_asent", "INFERENCE-SIMPLIFY-CONTEXTUALIZED-ASENT", 1, 0, false);
        declareFunction(me, "inference_sort_clauses_and_literals", "INFERENCE-SORT-CLAUSES-AND-LITERALS", 1, 0, false);
        declareFunction(me, "inference_sort_contextualized_clause_literals", "INFERENCE-SORT-CONTEXTUALIZED-CLAUSE-LITERALS", 1, 0, false);
        declareFunction(me, "inference_sort_contextualized_clauses", "INFERENCE-SORT-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        declareFunction(me, "inference_sort_contextualized_literals", "INFERENCE-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        declareFunction(me, "inference_simple_sort_contextualized_literals", "INFERENCE-SIMPLE-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        declareFunction(me, "inference_clause_L", "INFERENCE-CLAUSE-<", 2, 0, false);
        declareFunction(me, "inference_contextualized_asent_L", "INFERENCE-CONTEXTUALIZED-ASENT-<", 2, 0, false);
        new inference_czer.$inference_contextualized_asent_L$BinaryFunction();
        declareFunction(me, "inference_list_L", "INFERENCE-LIST-<", 2, 0, false);
        declareFunction(me, "inference_formula_L", "INFERENCE-FORMULA-<", 2, 0, false);
        declareFunction(me, "inference_term_L", "INFERENCE-TERM-<", 2, 0, false);
        declareFunction(me, "inference_term_G", "INFERENCE-TERM->", 2, 0, false);
        declareFunction(me, "inference_term_type_code", "INFERENCE-TERM-TYPE-CODE", 1, 0, false);
        declareFunction(me, "inference_constant_L", "INFERENCE-CONSTANT-<", 2, 0, false);
        declareFunction(me, "inference_nart_L", "INFERENCE-NART-<", 2, 0, false);
        declareFunction(me, "non_fixed_variable_p", "NON-FIXED-VARIABLE-P", 1, 0, false);
        new inference_czer.$non_fixed_variable_p$UnaryFunction();
        declareFunction(me, "fixed_variable_p", "FIXED-VARIABLE-P", 1, 0, false);
        declareFunction(me, "fully_fixed_p", "FULLY-FIXED-P", 1, 0, false);
        declareFunction(me, "fixed_variable_id", "FIXED-VARIABLE-ID", 1, 0, false);
        declareFunction(me, "fixed_variable_token", "FIXED-VARIABLE-TOKEN", 1, 0, false);
        declareFunction(me, "fixed_variable_token_p", "FIXED-VARIABLE-TOKEN-P", 1, 0, false);
        declareFunction(me, "fixed_variable_for_token", "FIXED-VARIABLE-FOR-TOKEN", 1, 0, false);
        declareFunction(me, "inference_czer_at_least_partially_commutative_relation_p", "INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction(me, "inference_czer_not_at_all_commutative_relation_p", "INFERENCE-CZER-NOT-AT-ALL-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction(me, "not_at_all_commutative_contextualized_asent_p", "NOT-AT-ALL-COMMUTATIVE-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        declareFunction(me, "at_least_partially_commutative_contextualized_asent_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        declareFunction(me, "inference_awesome_sort_contextualized_literals", "INFERENCE-AWESOME-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        declareFunction(me, "inference_awesome_sort_contextualized_literals_iterative", "INFERENCE-AWESOME-SORT-CONTEXTUALIZED-LITERALS-ITERATIVE", 2, 0, false);
        declareFunction(me, "pick_some_awesome_lits", "PICK-SOME-AWESOME-LITS", 2, 0, false);
        declareFunction(me, "inference_fully_fixed_literals", "INFERENCE-FULLY-FIXED-LITERALS", 1, 0, false);
        declareFunction(me, "variable_token", "VARIABLE-TOKEN", 0, 1, false);
        new inference_czer.$variable_token$ZeroArityFunction();
        new inference_czer.$variable_token$UnaryFunction();
        declareFunction(me, "var_tokenized_contextualized_asent_predicate", "VAR-TOKENIZED-CONTEXTUALIZED-ASENT-PREDICATE", 1, 0, false);
        declareFunction(me, "inference_unique_commutative_literals", "INFERENCE-UNIQUE-COMMUTATIVE-LITERALS", 1, 0, false);
        declareFunction(me, "inference_uniquely_constrained_literals", "INFERENCE-UNIQUELY-CONSTRAINED-LITERALS", 1, 0, false);
        declareFunction(me, "inference_update_fixed_vars_table", "INFERENCE-UPDATE-FIXED-VARS-TABLE", 1, 0, false);
        declareFunction(me, "contiguize_hl_vars_in_clauses", "CONTIGUIZE-HL-VARS-IN-CLAUSES", 1, 0, false);
        declareFunction(me, "identity_variable_map", "IDENTITY-VARIABLE-MAP", 1, 0, false);
        declareFunction(me, "non_contiguous_hl_varP", "NON-CONTIGUOUS-HL-VAR?", 1, 0, false);
        new inference_czer.$non_contiguous_hl_varP$UnaryFunction();
        declareFunction(me, "all_hl_vars_contiguous_and_in_orderP", "ALL-HL-VARS-CONTIGUOUS-AND-IN-ORDER?", 1, 0, false);
        declareFunction(me, "possibly_note_hl_var_contiguity_pair", "POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR", 1, 0, false);
        new inference_czer.$possibly_note_hl_var_contiguity_pair$UnaryFunction();
        declareFunction(me, "hl_var_contiguity_alist", "HL-VAR-CONTIGUITY-ALIST", 1, 0, false);
        declareFunction(me, "inference_apply_disjunction_free_el_vars_policy", "INFERENCE-APPLY-DISJUNCTION-FREE-EL-VARS-POLICY", 3, 0, false);
        declareFunction(me, "inference_canonicalize_ask_memoized_internal", "INFERENCE-CANONICALIZE-ASK-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction(me, "inference_canonicalize_ask_memoized", "INFERENCE-CANONICALIZE-ASK-MEMOIZED", 3, 0, false);
        declareFunction(me, "inference_canonicalize_ask_int", "INFERENCE-CANONICALIZE-ASK-INT", 3, 0, false);
        declareFunction(me, "inference_standardize_canonicalize_ask_result", "INFERENCE-STANDARDIZE-CANONICALIZE-ASK-RESULT", 3, 0, false);
        declareFunction(me, "inference_master_el_to_hl_variable_map", "INFERENCE-MASTER-EL-TO-HL-VARIABLE-MAP", 2, 0, false);
        declareFunction(me, "inference_sort_el_variables", "INFERENCE-SORT-EL-VARIABLES", 1, 0, false);
        declareFunction(me, "canonicalize_free_el_var_ordering", "CANONICALIZE-FREE-EL-VAR-ORDERING", 2, 0, false);
        declareFunction(me, "decontextualize_clauses_with_best_mt", "DECONTEXTUALIZE-CLAUSES-WITH-BEST-MT", 1, 0, false);
        declareFunction(me, "decontextualize_clauses", "DECONTEXTUALIZE-CLAUSES", 2, 0, false);
        declareFunction(me, "decontextualize_clause", "DECONTEXTUALIZE-CLAUSE", 2, 0, false);
        declareFunction(me, "contextualize_clauses", "CONTEXTUALIZE-CLAUSES", 2, 1, false);
        declareFunction(me, "dnf_and_mt_to_hl_query", "DNF-AND-MT-TO-HL-QUERY", 2, 0, false);
        declareFunction(me, "contextualize_clause", "CONTEXTUALIZE-CLAUSE", 2, 1, false);
        declareFunction(me, "canonicalize_contextualized_clause", "CANONICALIZE-CONTEXTUALIZED-CLAUSE", 1, 1, false);
        declareFunction(me, "convert_to_hl_contextualized_asents", "CONVERT-TO-HL-CONTEXTUALIZED-ASENTS", 2, 0, false);
        declareFunction(me, "convert_to_hl_contextualized_asent", "CONVERT-TO-HL-CONTEXTUALIZED-ASENT", 2, 0, false);
        declareFunction(me, "find_problem_by_el_query", "FIND-PROBLEM-BY-EL-QUERY", 2, 1, false);
        declareFunction(me, "problem_query_el_formula", "PROBLEM-QUERY-EL-FORMULA", 1, 0, false);
        declareFunction(me, "problem_query_formula", "PROBLEM-QUERY-FORMULA", 1, 0, false);
        declareFunction(me, "contextualized_dnf_clauses_formula", "CONTEXTUALIZED-DNF-CLAUSES-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_cnf_clauses_formula", "CONTEXTUALIZED-CNF-CLAUSES-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_dnf_clause_formula", "CONTEXTUALIZED-DNF-CLAUSE-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_cnf_clause_formula", "CONTEXTUALIZED-CNF-CLAUSE-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_dnf_clauses_common_mt", "CONTEXTUALIZED-DNF-CLAUSES-COMMON-MT", 1, 0, false);
        declareFunction(me, "contextualized_dnf_clause_common_mt", "CONTEXTUALIZED-DNF-CLAUSE-COMMON-MT", 1, 0, false);
        declareFunction(me, "contextualized_clause_formula", "CONTEXTUALIZED-CLAUSE-FORMULA", 3, 0, false);
        declareFunction(me, "contextualized_neg_lits", "CONTEXTUALIZED-NEG-LITS", 1, 0, false);
        declareFunction(me, "contextualized_pos_lits", "CONTEXTUALIZED-POS-LITS", 1, 0, false);
        declareFunction(me, "contextualized_asent_formula", "CONTEXTUALIZED-ASENT-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_asent_negated_formula", "CONTEXTUALIZED-ASENT-NEGATED-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_dnf_clauses_disjunction_formula", "CONTEXTUALIZED-DNF-CLAUSES-DISJUNCTION-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_cnf_clauses_conjunction_formula", "CONTEXTUALIZED-CNF-CLAUSES-CONJUNCTION-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_clause_conjunction_formula", "CONTEXTUALIZED-CLAUSE-CONJUNCTION-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_clause_disjunction_formula", "CONTEXTUALIZED-CLAUSE-DISJUNCTION-FORMULA", 1, 1, false);
        declareFunction(me, "contextualized_clause_juncts_formula", "CONTEXTUALIZED-CLAUSE-JUNCTS-FORMULA", 3, 0, false);
        declareFunction(me, "determine_best_clause_level_mt", "DETERMINE-BEST-CLAUSE-LEVEL-MT", 1, 0, false);
        declareFunction(me, "determine_best_clauses_level_mt", "DETERMINE-BEST-CLAUSES-LEVEL-MT", 1, 0, false);
        declareFunction(me, "canonicalize_hypothesis", "CANONICALIZE-HYPOTHESIS", 2, 0, false);
        declareFunction(me, "canonicalize_hypothesis_recursive", "CANONICALIZE-HYPOTHESIS-RECURSIVE", 2, 0, false);
        declareFunction(me, "categorize_hypothesis_formulas", "CATEGORIZE-HYPOTHESIS-FORMULAS", 1, 0, false);
        declareFunction(me, "rule_el_formulaP", "RULE-EL-FORMULA?", 1, 0, false);
        declareFunction(me, "canonicalize_hypothetical_ask", "CANONICALIZE-HYPOTHETICAL-ASK", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_inference_czer_file() {
        defparameter("*INFERENCE-SORT-PRINCIPLED?*", T);
        defparameter("*BACKCHAINING-ON-IST-ENABLED?*", T);
        defparameter("*INFERENCE-CZER-FIXED-VARS-TABLE*", misc_utilities.uninitialized());
        defparameter("*INFERENCE-CZER-NEXT-FIXED-VAR-ID*", misc_utilities.uninitialized());
        defparameter("*INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATIONS-ALIST*", misc_utilities.uninitialized());
        deflexical("*VARIABLE-TOKEN*", SubLTrampolineFile.maybeDefault($variable_token$, $variable_token$, () -> make_symbol($$$var)));
        defparameter("*LARGEST-HL-VAR-NUM-SO-FAR*", $LAMBDA);
        defparameter("*HL-VAR-CONTIGUITY-ALIST*", $LAMBDA);
        return NIL;
    }

    public static SubLObject setup_inference_czer_file() {
        declare_defglobal($variable_token$);
        memoization_state.note_memoized_function(INFERENCE_CANONICALIZE_ASK_MEMOIZED);
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














































































    }

    public static final class $inference_contextualized_asent_L$BinaryFunction extends BinaryFunction {
        public $inference_contextualized_asent_L$BinaryFunction() {
            super(extractFunctionNamed("INFERENCE-CONTEXTUALIZED-ASENT-<"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return inference_contextualized_asent_L(arg1, arg2);
        }
    }

    public static final class $non_fixed_variable_p$UnaryFunction extends UnaryFunction {
        public $non_fixed_variable_p$UnaryFunction() {
            super(extractFunctionNamed("NON-FIXED-VARIABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return non_fixed_variable_p(arg1);
        }
    }

    public static final class $variable_token$ZeroArityFunction extends ZeroArityFunction {
        public $variable_token$ZeroArityFunction() {
            super(extractFunctionNamed("VARIABLE-TOKEN"));
        }

        @Override
        public SubLObject processItem() {
            return variable_token(inference_czer.$variable_token$ZeroArityFunction.UNPROVIDED);
        }
    }

    public static final class $variable_token$UnaryFunction extends UnaryFunction {
        public $variable_token$UnaryFunction() {
            super(extractFunctionNamed("VARIABLE-TOKEN"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return variable_token(arg1);
        }
    }

    public static final class $non_contiguous_hl_varP$UnaryFunction extends UnaryFunction {
        public $non_contiguous_hl_varP$UnaryFunction() {
            super(extractFunctionNamed("NON-CONTIGUOUS-HL-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return non_contiguous_hl_varP(arg1);
        }
    }

    public static final class $possibly_note_hl_var_contiguity_pair$UnaryFunction extends UnaryFunction {
        public $possibly_note_hl_var_contiguity_pair$UnaryFunction() {
            super(extractFunctionNamed("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return possibly_note_hl_var_contiguity_pair(arg1);
        }
    }
}

/**
 * Total time: 353 ms
 */
