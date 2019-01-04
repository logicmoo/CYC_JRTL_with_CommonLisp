package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_czer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_czer";
    public static final String myFingerPrint = "99f8108d6484b009d2a0fb6b3719cb65837d70e058451706865d1eca495158b5";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 1317L)
    private static SubLSymbol $inference_sort_principledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 8033L)
    private static SubLSymbol $backchaining_on_ist_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15642L)
    private static SubLSymbol $inference_czer_fixed_vars_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15786L)
    private static SubLSymbol $inference_czer_next_fixed_var_id$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17037L)
    private static SubLSymbol $inference_czer_at_least_partially_commutative_relations_alist$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 22439L)
    private static SubLSymbol $variable_token$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26639L)
    private static SubLSymbol $largest_hl_var_num_so_far$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 27484L)
    private static SubLSymbol $hl_var_contiguity_alist$;
    private static final SubLSymbol $sym0$INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE;
    private static final SubLList $list1;
    private static final SubLObject $const2$False;
    private static final SubLObject $const3$True;
    private static final SubLObject $const4$trueSentence;
    private static final SubLList $list5;
    private static final SubLObject $const6$elementOf;
    private static final SubLList $list7;
    private static final SubLObject $const8$isa;
    private static final SubLSymbol $sym9$INFERENCE_CLAUSE__;
    private static final SubLSymbol $sym10$INFERENCE_CONTEXTUALIZED_ASENT__;
    private static final SubLString $str11$The_type_of_object__a_cannot_be_s;
    private static final SubLString $str12$Got_a_CycL_term_of_unknown_infere;
    private static final SubLSymbol $sym13$NON_FIXED_VARIABLE_P;
    private static final SubLSymbol $kw14$INFERENCE_CZER_FIXED_VARIABLE;
    private static final SubLSymbol $kw15$CACHE_MISS;
    private static final SubLObject $const16$CommutativeRelation;
    private static final SubLObject $const17$PartiallyCommutativeRelation;
    private static final SubLSymbol $sym18$_VARIABLE_TOKEN_;
    private static final SubLString $str19$var;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$VARIABLE_TOKEN;
    private static final SubLSymbol $kw22$NOT_UNIQUE;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$VARIABLE_P;
    private static final SubLSymbol $kw25$LAMBDA;
    private static final SubLSymbol $sym26$NON_CONTIGUOUS_HL_VAR_;
    private static final SubLSymbol $sym27$POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR;
    private static final SubLSymbol $kw28$REQUIRE_EQUAL;
    private static final SubLSymbol $kw29$POLICY_VIOLATION;
    private static final SubLSymbol $kw30$COMPUTE_INTERSECTION;
    private static final SubLSymbol $kw31$COMPUTE_UNION;
    private static final SubLString $str32$Unexpected_inference_disjunction_;
    private static final SubLSymbol $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED;
    private static final SubLSymbol $kw34$ILL_FORMED;
    private static final SubLString $str35$Got_a_czer_result_of_unexpected_t;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$UNINITIALIZED;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$INFERENCE_TERM__;
    private static final SubLSymbol $sym42$EL_VARIABLE_P;
    private static final SubLString $str43$Something_weird_happened_when_try;
    private static final SubLSymbol $sym44$_EXIT;
    private static final SubLSymbol $kw45$UNSPECIFIED;
    private static final SubLSymbol $kw46$DNF;
    private static final SubLSymbol $kw47$CNF;
    private static final SubLSymbol $sym48$IST_SENTENCE_WITH_CHLMT_P;
    private static final SubLObject $const49$ist;
    private static final SubLSymbol $kw50$CONJUNCTION;
    private static final SubLSymbol $kw51$DISJUNCTION;
    private static final SubLSymbol $kw52$NEG;
    private static final SubLSymbol $kw53$POS;
    private static final SubLSymbol $sym54$_;
    private static final SubLSymbol $sym55$CDR;
    private static final SubLList $list56;
    private static final SubLString $str57$Can_t_canonicalize_hypothesis__S;
    private static final SubLSymbol $kw58$IGNORE;
    private static final SubLObject $const59$and;
    private static final SubLSymbol $sym60$EL_CONJUNCTION_P;
    private static final SubLObject $const61$assertionDirection;
    private static final SubLObject $const62$constraint;
    private static final SubLObject $const63$highlyRelevantAssertion;
    private static final SubLObject $const64$irrelevantAssertion;
    private static final SubLObject $const65$knownAntecedentRule;
    private static final SubLObject $const66$queryExtentCached;
    private static final SubLObject $const67$genlRules;
    private static final SubLObject $const68$universalLiftingRule;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 1484L)
    public static SubLObject canonicalize_problem_query(SubLObject query) {
        query = conses_high.copy_tree(query);
        final SubLObject simplified_query = inference_simplify_problem_query(query);
        final SubLObject sorted_query = inference_sort_clauses_and_literals(simplified_query);
        final SubLObject reduced_literals_query = inference_delete_duplicate_literals(sorted_query);
        final SubLObject reduced_clauses_query = inference_delete_duplicate_clauses(reduced_literals_query);
        return contiguize_hl_vars_in_clauses(reduced_clauses_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 2268L)
    public static SubLObject inference_delete_duplicate_literals(SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject any_reducedP = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = (SubLObject)inference_czer.NIL;
        contextualized_dnf_clause = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            SubLObject literals = clauses.neg_lits(contextualized_dnf_clause);
            if (inference_czer.NIL != literals && inference_czer.NIL == list_utilities.singletonP(literals)) {
                thread.resetMultipleValues();
                final SubLObject reduced_literals = delete_duplicate_sorted_literals(literals);
                final SubLObject reducedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                clauses.set_clause_neg_lits(contextualized_dnf_clause, reduced_literals);
                if (inference_czer.NIL != reducedP) {
                    any_reducedP = (SubLObject)inference_czer.T;
                }
            }
            literals = clauses.pos_lits(contextualized_dnf_clause);
            if (inference_czer.NIL != literals && inference_czer.NIL == list_utilities.singletonP(literals)) {
                thread.resetMultipleValues();
                final SubLObject reduced_literals = delete_duplicate_sorted_literals(literals);
                final SubLObject reducedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                clauses.set_clause_pos_lits(contextualized_dnf_clause, reduced_literals);
                if (inference_czer.NIL != reducedP) {
                    any_reducedP = (SubLObject)inference_czer.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause = cdolist_list_var.first();
        }
        if (inference_czer.NIL != any_reducedP) {
            contextualized_dnf_clauses = inference_sort_clauses_and_literals(contextualized_dnf_clauses);
        }
        return contextualized_dnf_clauses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 3390L)
    public static SubLObject inference_delete_duplicate_clauses(final SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_czer.NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            return contextualized_dnf_clauses;
        }
        thread.resetMultipleValues();
        SubLObject reduced_clauses = delete_duplicate_sorted_clauses(contextualized_dnf_clauses);
        final SubLObject reducedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_czer.NIL != reducedP) {
            reduced_clauses = inference_sort_clauses_and_literals(reduced_clauses);
        }
        return reduced_clauses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 3921L)
    public static SubLObject delete_duplicate_sorted_literals(final SubLObject literals) {
        final SubLObject literal_count = Sequences.length(literals);
        final SubLObject reduced_literals = list_utilities.delete_duplicates_sorted(literals, Symbols.symbol_function((SubLObject)inference_czer.EQUAL));
        final SubLObject reduced_literal_count = Sequences.length(reduced_literals);
        final SubLObject reducedP = Numbers.numL(reduced_literal_count, literal_count);
        return subl_promotions.values2(reduced_literals, reducedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 4249L)
    public static SubLObject delete_duplicate_sorted_clauses(final SubLObject v_clauses) {
        final SubLObject clause_count = Sequences.length(v_clauses);
        final SubLObject reduced_clauses = list_utilities.delete_duplicates_sorted(v_clauses, Symbols.symbol_function((SubLObject)inference_czer.EQUAL));
        final SubLObject reduced_clause_count = Sequences.length(reduced_clauses);
        final SubLObject reducedP = Numbers.numL(reduced_clause_count, clause_count);
        return subl_promotions.values2(reduced_clauses, reducedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 4566L)
    public static SubLObject inference_simplify_problem_query(final SubLObject contextualized_dnf_clauses) {
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = (SubLObject)inference_czer.NIL;
        contextualized_dnf_clause = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            inference_simplify_contextualized_dnf_clause(contextualized_dnf_clause);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause = cdolist_list_var.first();
        }
        return contextualized_dnf_clauses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 5733L)
    public static SubLObject inference_simplify_contextualized_dnf_clause(final SubLObject contextualized_clause) {
        SubLObject neglits_to_become_poslits = (SubLObject)inference_czer.NIL;
        SubLObject rest_neglits;
        SubLObject asent;
        for (rest_neglits = (SubLObject)inference_czer.NIL, rest_neglits = contextualized_neg_lits(contextualized_clause); !rest_neglits.isAtom(); rest_neglits = rest_neglits.rest()) {
            asent = rest_neglits.first();
            if (inference_czer.NIL != el_utilities.true_sentence_p(inference_datastructures_problem_query.contextualized_asent_asent(asent))) {
                neglits_to_become_poslits = (SubLObject)ConsesLow.cons(asent, neglits_to_become_poslits);
            }
            else {
                ConsesLow.rplaca(rest_neglits, inference_simplify_contextualized_asent(asent));
            }
        }
        if (inference_czer.NIL != neglits_to_become_poslits) {
            SubLObject new_neglits = contextualized_neg_lits(contextualized_clause);
            SubLObject cdolist_list_var = neglits_to_become_poslits;
            SubLObject moving_lit = (SubLObject)inference_czer.NIL;
            moving_lit = cdolist_list_var.first();
            while (inference_czer.NIL != cdolist_list_var) {
                new_neglits = Sequences.delete(moving_lit, new_neglits, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                moving_lit = cdolist_list_var.first();
            }
            clauses.set_clause_neg_lits(contextualized_clause, new_neglits);
            final SubLObject canonicalized_new_poslits = list_utilities.nmapcar((SubLObject)inference_czer.$sym0$INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE, neglits_to_become_poslits);
            clauses.set_clause_pos_lits(contextualized_clause, ConsesLow.nconc(canonicalized_new_poslits, contextualized_pos_lits(contextualized_clause)));
        }
        SubLObject rest_poslits;
        SubLObject asent2;
        for (rest_poslits = (SubLObject)inference_czer.NIL, rest_poslits = contextualized_pos_lits(contextualized_clause); !rest_poslits.isAtom(); rest_poslits = rest_poslits.rest()) {
            asent2 = rest_poslits.first();
            ConsesLow.rplaca(rest_poslits, inference_simplify_contextualized_asent(asent2));
        }
        return contextualized_clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 7008L)
    public static SubLObject inference_simplify_negated_true_sentence(final SubLObject contextualized_asent) {
        SubLObject mt = (SubLObject)inference_czer.NIL;
        SubLObject true_sentence = (SubLObject)inference_czer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)inference_czer.$list1);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)inference_czer.$list1);
        true_sentence = current.first();
        current = current.rest();
        if (inference_czer.NIL == current) {
            final SubLObject subsentence = cycl_utilities.sentence_arg1(true_sentence, (SubLObject)inference_czer.UNPROVIDED);
            SubLObject negated_sub = (SubLObject)inference_czer.NIL;
            SubLObject result = (SubLObject)inference_czer.NIL;
            if (inference_czer.NIL != cycl_variables.hl_varP(subsentence)) {
                result = contextualized_asent;
            }
            else if (subsentence.eql(inference_czer.$const2$False)) {
                negated_sub = inference_czer.$const3$True;
                result = convert_to_hl_contextualized_asent((SubLObject)ConsesLow.list(inference_czer.$const4$trueSentence, negated_sub), mt);
            }
            else {
                result = convert_to_hl_contextualized_asent((SubLObject)ConsesLow.list(inference_czer.$const4$trueSentence, inference_el_dnf(cycl_utilities.negate(subsentence), mt, (SubLObject)inference_czer.UNPROVIDED)), mt);
            }
            return inference_simplify_contextualized_asent(result);
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)inference_czer.$list1);
        return (SubLObject)inference_czer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 7756L)
    public static SubLObject inference_el_dnf(final SubLObject sentence, final SubLObject mt, SubLObject implicitify_universalsP) {
        if (implicitify_universalsP == inference_czer.UNPROVIDED) {
            implicitify_universalsP = (SubLObject)inference_czer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_czer.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
        try {
            czer_vars.$turn_existentials_into_skolemsP$.bind((SubLObject)inference_czer.NIL, thread);
            czer_vars.$implicitify_universalsP$.bind(implicitify_universalsP, thread);
            result = clausifier.el_dnf(sentence, mt);
        }
        finally {
            czer_vars.$implicitify_universalsP$.rebind(_prev_bind_2, thread);
            czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 8090L)
    public static SubLObject backchaining_on_ist_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_czer.$backchaining_on_ist_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 8181L)
    public static SubLObject inference_simplify_contextualized_asent(final SubLObject contextualized_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = (SubLObject)inference_czer.NIL;
        SubLObject asent = (SubLObject)inference_czer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)inference_czer.$list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)inference_czer.$list5);
        asent = current.first();
        current = current.rest();
        if (inference_czer.NIL == current) {
            if (inference_czer.NIL == backchaining_on_ist_enabledP() && inference_czer.NIL == kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread) && inference_czer.NIL != el_utilities.ist_of_atomic_sentence_p(asent) && inference_czer.NIL != variables.fully_bound_p(el_utilities.designated_mt(asent))) {
                final SubLObject subsentence = el_utilities.designated_sentence(asent);
                final SubLObject sub_mt = el_utilities.designated_mt(asent);
                return convert_to_hl_contextualized_asent(subsentence, sub_mt);
            }
            if (inference_czer.NIL != el_utilities.ist_of_atomic_sentence_p(asent) && inference_czer.NIL != variables.fully_bound_p(el_utilities.designated_mt(asent)) && (inference_czer.NIL != mt_vars.core_microtheory_p(el_utilities.designated_mt(asent)) || (inference_czer.NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt) && inference_czer.NIL == kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread)))) {
                final SubLObject subsentence = el_utilities.designated_sentence(asent);
                final SubLObject sub_mt = el_utilities.designated_mt(asent);
                return convert_to_hl_contextualized_asent(subsentence, sub_mt);
            }
            if (inference_czer.NIL != el_utilities.true_sentence_of_atomic_sentence_p(asent)) {
                final SubLObject subsentence = cycl_utilities.sentence_arg1(asent, (SubLObject)inference_czer.UNPROVIDED);
                return convert_to_hl_contextualized_asent(subsentence, mt);
            }
            if (!inference_czer.$const6$elementOf.eql(cycl_utilities.atomic_sentence_predicate(asent)) || inference_czer.NIL == formula_pattern_match.pattern_matches_formula_without_bindings((SubLObject)inference_czer.$list7, asent)) {
                return contextualized_asent;
            }
            final SubLObject hl_var = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)inference_czer.UNPROVIDED);
            final SubLObject el_var_1 = cycl_utilities.atomic_sentence_arg1(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)inference_czer.UNPROVIDED), (SubLObject)inference_czer.UNPROVIDED);
            final SubLObject isa_asent = cycl_utilities.atomic_sentence_arg2(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)inference_czer.UNPROVIDED), (SubLObject)inference_czer.UNPROVIDED);
            final SubLObject el_var_2 = cycl_utilities.atomic_sentence_arg1(isa_asent, (SubLObject)inference_czer.UNPROVIDED);
            final SubLObject collection = cycl_utilities.atomic_sentence_arg2(isa_asent, (SubLObject)inference_czer.UNPROVIDED);
            if (inference_czer.NIL != cycl_grammar.hl_variable_p(hl_var) && inference_czer.NIL != cycl_grammar.el_variable_p(el_var_1) && inference_czer.NIL != cycl_grammar.el_variable_p(el_var_2) && el_var_1.eql(el_var_2)) {
                return convert_to_hl_contextualized_asent((SubLObject)ConsesLow.list(inference_czer.$const8$isa, hl_var, collection), mt);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)inference_czer.$list5);
        }
        return (SubLObject)inference_czer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 10501L)
    public static SubLObject inference_sort_clauses_and_literals(final SubLObject contextualized_dnf_clauses) {
        if (inference_czer.NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            final SubLObject contextualized_dnf_clause = contextualized_dnf_clauses.first();
            final SubLObject sorted_contextualized_dnf_clause = inference_sort_contextualized_clause_literals(contextualized_dnf_clause);
            return (SubLObject)ConsesLow.list(sorted_contextualized_dnf_clause);
        }
        SubLObject sorted_contextualized_dnf_clauses = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause2 = (SubLObject)inference_czer.NIL;
        contextualized_dnf_clause2 = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            sorted_contextualized_dnf_clauses = (SubLObject)ConsesLow.cons(inference_sort_contextualized_clause_literals(contextualized_dnf_clause2), sorted_contextualized_dnf_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause2 = cdolist_list_var.first();
        }
        return inference_sort_contextualized_clauses(sorted_contextualized_dnf_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11285L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11862L)
    public static SubLObject inference_sort_contextualized_clauses(final SubLObject contextualized_clauses) {
        return Sort.sort(contextualized_clauses, (SubLObject)inference_czer.$sym9$INFERENCE_CLAUSE__, (SubLObject)inference_czer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12003L)
    public static SubLObject inference_sort_contextualized_literals(final SubLObject literals) {
        return inference_awesome_sort_contextualized_literals(literals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12139L)
    public static SubLObject inference_simple_sort_contextualized_literals(final SubLObject literals) {
        return Sort.sort(literals, (SubLObject)inference_czer.$sym10$INFERENCE_CONTEXTUALIZED_ASENT__, (SubLObject)inference_czer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12290L)
    public static SubLObject inference_clause_L(final SubLObject clause1, final SubLObject clause2) {
        return inference_list_L(clause1, clause2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12388L)
    public static SubLObject inference_contextualized_asent_L(final SubLObject asent1, final SubLObject asent2) {
        return inference_list_L(asent1, asent2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12496L)
    public static SubLObject inference_list_L(final SubLObject list1, final SubLObject list2) {
        return inference_formula_L(list1, list2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12587L)
    public static SubLObject inference_formula_L(final SubLObject formula1, final SubLObject formula2) {
        if (inference_czer.NIL != el_utilities.formula_arityL(formula1, formula2, (SubLObject)inference_czer.UNPROVIDED)) {
            return (SubLObject)inference_czer.T;
        }
        if (inference_czer.NIL != el_utilities.formula_arityG(formula1, formula2, (SubLObject)inference_czer.UNPROVIDED)) {
            return (SubLObject)inference_czer.NIL;
        }
        final SubLObject seqvar1P = el_utilities.formula_with_sequence_termP(formula1);
        final SubLObject seqvar2P = el_utilities.formula_with_sequence_termP(formula2);
        if (inference_czer.NIL == seqvar1P && inference_czer.NIL != seqvar2P) {
            return (SubLObject)inference_czer.T;
        }
        if (inference_czer.NIL != seqvar1P && inference_czer.NIL == seqvar2P) {
            return (SubLObject)inference_czer.NIL;
        }
        final SubLObject terms1 = cycl_utilities.formula_terms(formula1, (SubLObject)inference_czer.UNPROVIDED);
        final SubLObject terms2 = cycl_utilities.formula_terms(formula2, (SubLObject)inference_czer.UNPROVIDED);
        SubLObject term1 = (SubLObject)inference_czer.NIL;
        SubLObject term1_$1 = (SubLObject)inference_czer.NIL;
        SubLObject term2 = (SubLObject)inference_czer.NIL;
        SubLObject term2_$2 = (SubLObject)inference_czer.NIL;
        term1 = terms1;
        term1_$1 = term1.first();
        term2 = terms2;
        term2_$2 = term2.first();
        while (inference_czer.NIL != term2 || inference_czer.NIL != term1) {
            if (inference_czer.NIL != inference_term_L(term1_$1, term2_$2)) {
                return (SubLObject)inference_czer.T;
            }
            if (inference_czer.NIL != inference_term_G(term1_$1, term2_$2)) {
                return (SubLObject)inference_czer.NIL;
            }
            term1 = term1.rest();
            term1_$1 = term1.first();
            term2 = term2.rest();
            term2_$2 = term2.first();
        }
        return (SubLObject)inference_czer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 13249L)
    public static SubLObject inference_term_L(final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (term1.eql(term2)) {
            return (SubLObject)inference_czer.NIL;
        }
        final SubLObject type_code_1 = inference_term_type_code(term1);
        final SubLObject type_code_2 = inference_term_type_code(term2);
        if (type_code_1.numL(type_code_2)) {
            return (SubLObject)inference_czer.T;
        }
        if (type_code_1.numG(type_code_2)) {
            return (SubLObject)inference_czer.NIL;
        }
        if (inference_czer.NIL != constant_handles.constant_p(term1)) {
            return inference_constant_L(term1, term2);
        }
        if (inference_czer.NIL != nart_handles.nart_p(term1)) {
            return inference_nart_L(term1, term2);
        }
        if (inference_czer.NIL != fixed_variable_p(term1)) {
            return Numbers.numL(fixed_variable_id(term1), fixed_variable_id(term2));
        }
        if (inference_czer.NIL != variables.variable_p(term1)) {
            if (inference_czer.NIL != inference_czer.$inference_sort_principledP$.getDynamicValue(thread)) {
                return (SubLObject)inference_czer.NIL;
            }
            return Numbers.numL(variables.variable_id(term1), variables.variable_id(term2));
        }
        else {
            if (inference_czer.NIL != cycl_variables.el_varP(term1)) {
                return (SubLObject)inference_czer.NIL;
            }
            if (inference_czer.NIL != cycl_variables.permissible_keyword_varP(term1)) {
                return (SubLObject)inference_czer.NIL;
            }
            if (inference_czer.NIL != el_utilities.el_formula_p(term1)) {
                return inference_formula_L(term1, term2);
            }
            if (term1.isNumber()) {
                return Numbers.numL(term1, term2);
            }
            if (term1.isString()) {
                return Strings.stringL(term1, term2, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
            }
            if (term1.isSymbol()) {
                return Strings.stringL(Symbols.symbol_name(term1), Symbols.symbol_name(term2), (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
            }
            if (term1.isChar()) {
                return Characters.charL(term1, term2);
            }
            if (inference_czer.NIL != assertion_handles.assertion_p(term1)) {
                return inference_term_L(fi.assertion_hl_formula(term1, (SubLObject)inference_czer.UNPROVIDED), fi.assertion_hl_formula(term2, (SubLObject)inference_czer.UNPROVIDED));
            }
            Errors.error((SubLObject)inference_czer.$str11$The_type_of_object__a_cannot_be_s, term1);
            return (SubLObject)inference_czer.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 14601L)
    public static SubLObject inference_term_G(final SubLObject term1, final SubLObject term2) {
        return inference_term_L(term2, term1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 14689L)
    public static SubLObject inference_term_type_code(final SubLObject v_term) {
        if (inference_czer.NIL != constant_handles.constant_p(v_term)) {
            return (SubLObject)inference_czer.ZERO_INTEGER;
        }
        if (inference_czer.NIL != nart_handles.nart_p(v_term)) {
            return (SubLObject)inference_czer.ONE_INTEGER;
        }
        if (inference_czer.NIL != fixed_variable_p(v_term)) {
            return (SubLObject)inference_czer.ELEVEN_INTEGER;
        }
        if (inference_czer.NIL != variables.variable_p(v_term)) {
            return (SubLObject)inference_czer.TWO_INTEGER;
        }
        if (inference_czer.NIL != cycl_variables.el_varP(v_term)) {
            return (SubLObject)inference_czer.THREE_INTEGER;
        }
        if (inference_czer.NIL != cycl_variables.permissible_keyword_varP(v_term)) {
            return (SubLObject)inference_czer.FOUR_INTEGER;
        }
        if (inference_czer.NIL != el_utilities.el_formula_p(v_term)) {
            return (SubLObject)inference_czer.FIVE_INTEGER;
        }
        if (v_term.isNumber()) {
            return (SubLObject)inference_czer.SIX_INTEGER;
        }
        if (v_term.isString()) {
            return (SubLObject)inference_czer.SEVEN_INTEGER;
        }
        if (v_term.isSymbol()) {
            return (SubLObject)inference_czer.EIGHT_INTEGER;
        }
        if (v_term.isChar()) {
            return (SubLObject)inference_czer.NINE_INTEGER;
        }
        if (inference_czer.NIL != assertion_handles.assertion_p(v_term)) {
            return (SubLObject)inference_czer.TEN_INTEGER;
        }
        Errors.error((SubLObject)inference_czer.$str12$Got_a_CycL_term_of_unknown_infere, v_term);
        return (SubLObject)inference_czer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15338L)
    public static SubLObject inference_constant_L(final SubLObject constant1, final SubLObject constant2) {
        final SubLObject suid1 = constant_handles.constant_suid(constant1);
        final SubLObject suid2 = constant_handles.constant_suid(constant2);
        return Numbers.numL(suid1, suid2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15506L)
    public static SubLObject inference_nart_L(final SubLObject nart1, final SubLObject nart2) {
        final SubLObject suid1 = nart_handles.nart_id(nart1);
        final SubLObject suid2 = nart_handles.nart_id(nart2);
        return Numbers.numL(suid1, suid2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15860L)
    public static SubLObject non_fixed_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_czer.NIL != list_utilities.alist_p(inference_czer.$inference_czer_fixed_vars_table$.getDynamicValue(thread)) && inference_czer.NIL != cycl_grammar.hl_variable_p(v_object) && inference_czer.NIL == list_utilities.alist_has_keyP(inference_czer.$inference_czer_fixed_vars_table$.getDynamicValue(thread), v_object, Symbols.symbol_function((SubLObject)inference_czer.EQL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16150L)
    public static SubLObject fixed_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_czer.NIL != list_utilities.alist_p(inference_czer.$inference_czer_fixed_vars_table$.getDynamicValue(thread)) && inference_czer.NIL != cycl_grammar.hl_variable_p(v_object) && inference_czer.NIL != list_utilities.alist_has_keyP(inference_czer.$inference_czer_fixed_vars_table$.getDynamicValue(thread), v_object, Symbols.symbol_function((SubLObject)inference_czer.EQL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16425L)
    public static SubLObject fully_fixed_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_czer.NIL == list_utilities.tree_find_if((SubLObject)inference_czer.$sym13$NON_FIXED_VARIABLE_P, tree, (SubLObject)inference_czer.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16521L)
    public static SubLObject fixed_variable_id(final SubLObject fixed_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup_without_values(inference_czer.$inference_czer_fixed_vars_table$.getDynamicValue(thread), fixed_var, Symbols.symbol_function((SubLObject)inference_czer.EQL), (SubLObject)inference_czer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16657L)
    public static SubLObject fixed_variable_token(final SubLObject fixed_var) {
        return (SubLObject)ConsesLow.list((SubLObject)inference_czer.$kw14$INFERENCE_CZER_FIXED_VARIABLE, fixed_variable_id(fixed_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16784L)
    public static SubLObject fixed_variable_token_p(final SubLObject v_object) {
        return list_utilities.list_with_first_p(v_object, (SubLObject)inference_czer.$kw14$INFERENCE_CZER_FIXED_VARIABLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16900L)
    public static SubLObject fixed_variable_for_token(final SubLObject token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_reverse_lookup(inference_czer.$inference_czer_fixed_vars_table$.getDynamicValue(thread), conses_high.second(token), Symbols.symbol_function((SubLObject)inference_czer.EQL), (SubLObject)inference_czer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17178L)
    public static SubLObject inference_czer_at_least_partially_commutative_relation_p(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = (SubLObject)inference_czer.NIL;
        final SubLObject cached_result = list_utilities.alist_lookup_without_values(inference_czer.$inference_czer_at_least_partially_commutative_relations_alist$.getDynamicValue(thread), pred, Symbols.symbol_function((SubLObject)inference_czer.EQL), (SubLObject)inference_czer.$kw15$CACHE_MISS);
        if (inference_czer.$kw15$CACHE_MISS == cached_result) {
            resultP = (SubLObject)SubLObjectFactory.makeBoolean(inference_czer.NIL != variables.variable_p(pred) || inference_czer.NIL != fort_types_interface.fort_has_cached_typeP(pred, inference_czer.$const16$CommutativeRelation) || inference_czer.NIL != fort_types_interface.fort_has_cached_typeP(pred, inference_czer.$const17$PartiallyCommutativeRelation));
            inference_czer.$inference_czer_at_least_partially_commutative_relations_alist$.setDynamicValue(list_utilities.alist_enter(inference_czer.$inference_czer_at_least_partially_commutative_relations_alist$.getDynamicValue(thread), pred, resultP, Symbols.symbol_function((SubLObject)inference_czer.EQL)), thread);
        }
        else {
            resultP = cached_result;
        }
        return resultP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17929L)
    public static SubLObject inference_czer_not_at_all_commutative_relation_p(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_czer.NIL == inference_czer_at_least_partially_commutative_relation_p(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 18082L)
    public static SubLObject not_at_all_commutative_contextualized_asent_p(final SubLObject contextualized_asent) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return inference_czer_not_at_all_commutative_relation_p(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 18348L)
    public static SubLObject at_least_partially_commutative_contextualized_asent_p(final SubLObject contextualized_asent) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return inference_czer_at_least_partially_commutative_relation_p(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 18630L)
    public static SubLObject inference_awesome_sort_contextualized_literals(final SubLObject literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_czer.NIL;
        final SubLObject _prev_bind_0 = inference_czer.$inference_czer_fixed_vars_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_czer.$inference_czer_next_fixed_var_id$.currentBinding(thread);
        final SubLObject _prev_bind_3 = inference_czer.$inference_czer_at_least_partially_commutative_relations_alist$.currentBinding(thread);
        try {
            inference_czer.$inference_czer_fixed_vars_table$.bind((SubLObject)inference_czer.NIL, thread);
            inference_czer.$inference_czer_next_fixed_var_id$.bind((SubLObject)inference_czer.ZERO_INTEGER, thread);
            inference_czer.$inference_czer_at_least_partially_commutative_relations_alist$.bind((SubLObject)inference_czer.NIL, thread);
            result = inference_awesome_sort_contextualized_literals_iterative((SubLObject)inference_czer.NIL, literals);
        }
        finally {
            inference_czer.$inference_czer_at_least_partially_commutative_relations_alist$.rebind(_prev_bind_3, thread);
            inference_czer.$inference_czer_next_fixed_var_id$.rebind(_prev_bind_2, thread);
            inference_czer.$inference_czer_fixed_vars_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 19023L)
    public static SubLObject inference_awesome_sort_contextualized_literals_iterative(SubLObject already_sorted_literals, SubLObject not_yet_sorted_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = (SubLObject)inference_czer.NIL;
        SubLObject skip_fully_fixed_this_timeP = (SubLObject)inference_czer.NIL;
        while (inference_czer.NIL == doneP) {
            if (inference_czer.NIL == not_yet_sorted_literals) {
                doneP = (SubLObject)inference_czer.T;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject new_awesome_literals = pick_some_awesome_lits(not_yet_sorted_literals, skip_fully_fixed_this_timeP);
                final SubLObject skip_fully_fixed_next_timeP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                skip_fully_fixed_this_timeP = skip_fully_fixed_next_timeP;
                already_sorted_literals = ConsesLow.nconc(already_sorted_literals, new_awesome_literals);
                not_yet_sorted_literals = conses_high.set_difference(not_yet_sorted_literals, new_awesome_literals, Symbols.symbol_function((SubLObject)inference_czer.EQ), (SubLObject)inference_czer.UNPROVIDED);
                if (inference_czer.NIL == not_yet_sorted_literals) {
                    continue;
                }
                inference_update_fixed_vars_table(new_awesome_literals);
            }
        }
        return already_sorted_literals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 19885L)
    public static SubLObject pick_some_awesome_lits(final SubLObject not_yet_sorted_literals, final SubLObject skip_fully_fixedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_czer.NIL != list_utilities.singletonP(not_yet_sorted_literals)) {
            return subl_promotions.values2(conses_high.copy_list(not_yet_sorted_literals), (SubLObject)inference_czer.NIL);
        }
        SubLObject awesome_literals = (SubLObject)inference_czer.NIL;
        SubLObject skip_fully_fixed_next_timeP = (SubLObject)inference_czer.NIL;
        SubLObject principledP = (SubLObject)inference_czer.T;
        if (inference_czer.NIL == skip_fully_fixedP) {
            awesome_literals = inference_fully_fixed_literals(not_yet_sorted_literals);
        }
        if (inference_czer.NIL != awesome_literals) {
            skip_fully_fixed_next_timeP = (SubLObject)inference_czer.T;
        }
        else {
            awesome_literals = inference_unique_commutative_literals(not_yet_sorted_literals);
        }
        if (inference_czer.NIL == awesome_literals) {
            awesome_literals = inference_uniquely_constrained_literals(not_yet_sorted_literals);
        }
        if (inference_czer.NIL == awesome_literals) {
            awesome_literals = not_yet_sorted_literals;
            principledP = (SubLObject)inference_czer.NIL;
        }
        final SubLObject _prev_bind_0 = inference_czer.$inference_sort_principledP$.currentBinding(thread);
        try {
            inference_czer.$inference_sort_principledP$.bind(principledP, thread);
            awesome_literals = inference_simple_sort_contextualized_literals(awesome_literals);
        }
        finally {
            inference_czer.$inference_sort_principledP$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(awesome_literals, skip_fully_fixed_next_timeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 21863L)
    public static SubLObject inference_fully_fixed_literals(final SubLObject not_yet_sorted_literals) {
        SubLObject fully_fixed_literals = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = (SubLObject)inference_czer.NIL;
        literal = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            if (inference_czer.NIL != fully_fixed_p(literal) && inference_czer.NIL != not_at_all_commutative_contextualized_asent_p(literal)) {
                fully_fixed_literals = (SubLObject)ConsesLow.cons(literal, fully_fixed_literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        return fully_fixed_literals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 22497L)
    public static SubLObject variable_token(SubLObject dummy) {
        if (dummy == inference_czer.UNPROVIDED) {
            dummy = (SubLObject)inference_czer.NIL;
        }
        return inference_czer.$variable_token$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 22590L)
    public static SubLObject var_tokenized_contextualized_asent_predicate(final SubLObject contextualized_asent) {
        final SubLObject pred = inference_datastructures_problem_query.contextualized_asent_predicate(contextualized_asent);
        if (inference_czer.NIL != variables.variable_p(pred)) {
            return inference_czer.$variable_token$.getGlobalValue();
        }
        return pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 22814L)
    public static SubLObject inference_unique_commutative_literals(final SubLObject not_yet_sorted_literals) {
        SubLObject commutative_literals_alist = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = (SubLObject)inference_czer.NIL;
        literal = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            if (inference_czer.NIL != at_least_partially_commutative_contextualized_asent_p(literal)) {
                commutative_literals_alist = list_utilities.alist_push(commutative_literals_alist, var_tokenized_contextualized_asent_predicate(literal), literal, Symbols.symbol_function((SubLObject)inference_czer.EQ));
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        if (inference_czer.NIL == commutative_literals_alist) {
            return (SubLObject)inference_czer.NIL;
        }
        SubLObject unique_commutative_literals = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var2 = commutative_literals_alist;
        SubLObject cons = (SubLObject)inference_czer.NIL;
        cons = cdolist_list_var2.first();
        while (inference_czer.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)inference_czer.NIL;
            SubLObject literals = (SubLObject)inference_czer.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list20);
            key = current.first();
            current = (literals = current.rest());
            if (inference_czer.NIL != list_utilities.singletonP(literals)) {
                unique_commutative_literals = (SubLObject)ConsesLow.cons(list_utilities.only_one(literals), unique_commutative_literals);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons = cdolist_list_var2.first();
        }
        if (inference_czer.NIL == unique_commutative_literals) {
            SubLObject fort_id_alist = (SubLObject)inference_czer.NIL;
            SubLObject cdolist_list_var3 = commutative_literals_alist;
            SubLObject cons2 = (SubLObject)inference_czer.NIL;
            cons2 = cdolist_list_var3.first();
            while (inference_czer.NIL != cdolist_list_var3) {
                SubLObject current2;
                final SubLObject datum2 = current2 = cons2;
                SubLObject key2 = (SubLObject)inference_czer.NIL;
                SubLObject literals2 = (SubLObject)inference_czer.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)inference_czer.$list20);
                key2 = current2.first();
                current2 = current2.rest();
                SubLObject cdolist_list_var_$3;
                literals2 = (cdolist_list_var_$3 = current2);
                SubLObject literal2 = (SubLObject)inference_czer.NIL;
                literal2 = cdolist_list_var_$3.first();
                while (inference_czer.NIL != cdolist_list_var_$3) {
                    fort_id_alist = list_utilities.alist_push(fort_id_alist, cycl_utilities.sorted_fort_id_list(literal2), literal2, Symbols.symbol_function((SubLObject)inference_czer.EQUAL));
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    literal2 = cdolist_list_var_$3.first();
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                cons2 = cdolist_list_var3.first();
            }
            cdolist_list_var3 = fort_id_alist;
            cons2 = (SubLObject)inference_czer.NIL;
            cons2 = cdolist_list_var3.first();
            while (inference_czer.NIL != cdolist_list_var3) {
                SubLObject current2;
                final SubLObject datum2 = current2 = cons2;
                SubLObject key2 = (SubLObject)inference_czer.NIL;
                SubLObject literals2 = (SubLObject)inference_czer.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)inference_czer.$list20);
                key2 = current2.first();
                current2 = (literals2 = current2.rest());
                if (inference_czer.NIL != list_utilities.singletonP(literals2)) {
                    unique_commutative_literals = (SubLObject)ConsesLow.cons(list_utilities.only_one(literals2), unique_commutative_literals);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                cons2 = cdolist_list_var3.first();
            }
        }
        return unique_commutative_literals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 24297L)
    public static SubLObject inference_uniquely_constrained_literals(final SubLObject not_yet_sorted_literals) {
        SubLObject uniquely_constrained_literals = (SubLObject)inference_czer.NIL;
        SubLObject alist = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = (SubLObject)inference_czer.NIL;
        literal = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            if (inference_czer.NIL != not_at_all_commutative_contextualized_asent_p(literal)) {
                final SubLObject dwimmed_literal = transform_list_utilities.transform(literal, (SubLObject)inference_czer.$sym13$NON_FIXED_VARIABLE_P, (SubLObject)inference_czer.$sym21$VARIABLE_TOKEN, (SubLObject)inference_czer.UNPROVIDED);
                final SubLObject alist_entry = conses_high.assoc(dwimmed_literal, alist, Symbols.symbol_function((SubLObject)inference_czer.EQUAL), (SubLObject)inference_czer.UNPROVIDED);
                if (inference_czer.NIL != alist_entry) {
                    ConsesLow.rplacd(alist_entry, (SubLObject)inference_czer.$kw22$NOT_UNIQUE);
                }
                else {
                    final SubLObject new_alist_entry = (SubLObject)ConsesLow.cons(dwimmed_literal, literal);
                    alist = (SubLObject)ConsesLow.cons(new_alist_entry, alist);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        cdolist_list_var = alist;
        SubLObject cons = (SubLObject)inference_czer.NIL;
        cons = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)inference_czer.NIL;
            SubLObject literal2 = (SubLObject)inference_czer.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list23);
            key = current.first();
            current = (literal2 = current.rest());
            if (inference_czer.$kw22$NOT_UNIQUE != literal2) {
                uniquely_constrained_literals = (SubLObject)ConsesLow.cons(literal2, uniquely_constrained_literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return uniquely_constrained_literals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 25280L)
    public static SubLObject inference_update_fixed_vars_table(final SubLObject new_uniquely_constrained_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = list_utilities.tree_gather(new_uniquely_constrained_literals, (SubLObject)inference_czer.$sym24$VARIABLE_P, Symbols.symbol_function((SubLObject)inference_czer.EQL), (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
        SubLObject var = (SubLObject)inference_czer.NIL;
        var = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            if (inference_czer.NIL != non_fixed_variable_p(var)) {
                inference_czer.$inference_czer_fixed_vars_table$.setDynamicValue(list_utilities.alist_enter(inference_czer.$inference_czer_fixed_vars_table$.getDynamicValue(thread), var, inference_czer.$inference_czer_next_fixed_var_id$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_czer.EQL)), thread);
                inference_czer.$inference_czer_next_fixed_var_id$.setDynamicValue(Numbers.add(inference_czer.$inference_czer_next_fixed_var_id$.getDynamicValue(thread), (SubLObject)inference_czer.ONE_INTEGER), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return (SubLObject)inference_czer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 25747L)
    public static SubLObject contiguize_hl_vars_in_clauses(final SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_czer.NIL != el_utilities.hl_ground_tree_p(contextualized_dnf_clauses)) {
            return subl_promotions.values2(contextualized_dnf_clauses, (SubLObject)inference_czer.NIL);
        }
        thread.resetMultipleValues();
        final SubLObject all_goodP = all_hl_vars_contiguous_and_in_orderP(contextualized_dnf_clauses);
        final SubLObject largest_hl_var_num = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_czer.NIL != all_goodP) {
            return subl_promotions.values2(contextualized_dnf_clauses, identity_variable_map(largest_hl_var_num));
        }
        final SubLObject hl_var_blist = hl_var_contiguity_alist(contextualized_dnf_clauses);
        return Values.values(bindings.napply_bindings(hl_var_blist, contextualized_dnf_clauses), bindings.invert_bindings(hl_var_blist));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26527L)
    public static SubLObject identity_variable_map(final SubLObject largest_var_num) {
        return bindings.hl_identity_bindings(number_utilities.f_1X(largest_var_num));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26788L)
    public static SubLObject non_contiguous_hl_varP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_czer.NIL == cycl_grammar.hl_variable_p(v_object)) {
            return (SubLObject)inference_czer.NIL;
        }
        final SubLObject var_num = variables.variable_id(v_object);
        if (var_num.numLE(inference_czer.$largest_hl_var_num_so_far$.getDynamicValue(thread))) {
            return (SubLObject)inference_czer.NIL;
        }
        if (var_num.numE(number_utilities.f_1X(inference_czer.$largest_hl_var_num_so_far$.getDynamicValue(thread)))) {
            inference_czer.$largest_hl_var_num_so_far$.setDynamicValue(var_num, thread);
            return (SubLObject)inference_czer.NIL;
        }
        return (SubLObject)inference_czer.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 27135L)
    public static SubLObject all_hl_vars_contiguous_and_in_orderP(final SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_czer.NIL;
        SubLObject largest_num = (SubLObject)inference_czer.NIL;
        final SubLObject _prev_bind_0 = inference_czer.$largest_hl_var_num_so_far$.currentBinding(thread);
        try {
            inference_czer.$largest_hl_var_num_so_far$.bind((SubLObject)inference_czer.MINUS_ONE_INTEGER, thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(inference_czer.NIL == list_utilities.tree_find_if((SubLObject)inference_czer.$sym26$NON_CONTIGUOUS_HL_VAR_, contextualized_dnf_clauses, (SubLObject)inference_czer.UNPROVIDED));
            largest_num = inference_czer.$largest_hl_var_num_so_far$.getDynamicValue(thread);
        }
        finally {
            inference_czer.$largest_hl_var_num_so_far$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(result, largest_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 27604L)
    public static SubLObject possibly_note_hl_var_contiguity_pair(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_czer.NIL != cycl_grammar.hl_variable_p(v_object)) {
            final SubLObject new_var_cons = conses_high.assoc(v_object, inference_czer.$hl_var_contiguity_alist$.getDynamicValue(thread), (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
            if (inference_czer.NIL == new_var_cons) {
                final SubLObject next_var_num = number_utilities.f_1X(inference_czer.$largest_hl_var_num_so_far$.getDynamicValue(thread));
                final SubLObject next_var = variables.get_variable(next_var_num);
                inference_czer.$largest_hl_var_num_so_far$.setDynamicValue(next_var_num, thread);
                inference_czer.$hl_var_contiguity_alist$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(v_object, next_var), inference_czer.$hl_var_contiguity_alist$.getDynamicValue(thread)), thread);
            }
        }
        return (SubLObject)inference_czer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 28032L)
    public static SubLObject hl_var_contiguity_alist(final SubLObject contextualized_dnf_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_czer.NIL;
        final SubLObject _prev_bind_0 = inference_czer.$largest_hl_var_num_so_far$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_czer.$hl_var_contiguity_alist$.currentBinding(thread);
        try {
            inference_czer.$largest_hl_var_num_so_far$.bind((SubLObject)inference_czer.MINUS_ONE_INTEGER, thread);
            inference_czer.$hl_var_contiguity_alist$.bind((SubLObject)inference_czer.NIL, thread);
            list_utilities.tree_find_if((SubLObject)inference_czer.$sym27$POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR, contextualized_dnf_clauses, (SubLObject)inference_czer.UNPROVIDED);
            result = Sequences.nreverse(inference_czer.$hl_var_contiguity_alist$.getDynamicValue(thread));
        }
        finally {
            inference_czer.$hl_var_contiguity_alist$.rebind(_prev_bind_2, thread);
            inference_czer.$largest_hl_var_num_so_far$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 28418L)
    public static SubLObject inference_apply_disjunction_free_el_vars_policy(final SubLObject policy, final SubLObject current_disjunction_free_el_vars, final SubLObject disjunct_free_el_vars) {
        if (policy.eql((SubLObject)inference_czer.$kw28$REQUIRE_EQUAL)) {
            if (inference_czer.NIL != list_utilities.sets_equalP(current_disjunction_free_el_vars, disjunct_free_el_vars, (SubLObject)inference_czer.UNPROVIDED)) {
                return current_disjunction_free_el_vars;
            }
            return (SubLObject)inference_czer.$kw29$POLICY_VIOLATION;
        }
        else {
            if (policy.eql((SubLObject)inference_czer.$kw30$COMPUTE_INTERSECTION)) {
                return conses_high.intersection(current_disjunction_free_el_vars, disjunct_free_el_vars, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
            }
            if (policy.eql((SubLObject)inference_czer.$kw31$COMPUTE_UNION)) {
                return conses_high.union(current_disjunction_free_el_vars, disjunct_free_el_vars, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
            }
            return Errors.error((SubLObject)inference_czer.$str32$Unexpected_inference_disjunction_, policy);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 29081L)
    public static SubLObject inference_canonicalize_ask_memoized_internal(final SubLObject cycl_query, final SubLObject mt, final SubLObject disjunction_free_el_vars_policy) {
        return inference_canonicalize_ask_int(cycl_query, mt, disjunction_free_el_vars_policy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 29081L)
    public static SubLObject inference_canonicalize_ask_memoized(final SubLObject cycl_query, final SubLObject mt, final SubLObject disjunction_free_el_vars_policy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_czer.NIL;
        if (inference_czer.NIL == v_memoization_state) {
            return inference_canonicalize_ask_memoized_internal(cycl_query, mt, disjunction_free_el_vars_policy);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_czer.$sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, (SubLObject)inference_czer.UNPROVIDED);
        if (inference_czer.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_czer.$sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, (SubLObject)inference_czer.THREE_INTEGER, (SubLObject)inference_czer.NIL, (SubLObject)inference_czer.EQUAL, (SubLObject)inference_czer.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_czer.$sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_query, mt, disjunction_free_el_vars_policy);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_czer.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_czer.NIL;
            collision = cdolist_list_var.first();
            while (inference_czer.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cycl_query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (inference_czer.NIL != cached_args && inference_czer.NIL == cached_args.rest() && disjunction_free_el_vars_policy.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_canonicalize_ask_memoized_internal(cycl_query, mt, disjunction_free_el_vars_policy)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cycl_query, mt, disjunction_free_el_vars_policy));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 29326L)
    public static SubLObject inference_canonicalize_ask_int(final SubLObject cycl_query, SubLObject mt, final SubLObject disjunction_free_el_vars_policy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject czer_result = (SubLObject)inference_czer.NIL;
        if (inference_czer.NIL == mt) {
            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        thread.resetMultipleValues();
        final SubLObject czer_result_$4 = czer_main.canonicalize_ask_sentence(cycl_query, mt);
        final SubLObject mt_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        czer_result = czer_result_$4;
        mt = mt_$5;
        if (inference_czer.NIL == czer_result) {
            return subl_promotions.values3((SubLObject)inference_czer.$kw34$ILL_FORMED, (SubLObject)inference_czer.NIL, (SubLObject)inference_czer.NIL);
        }
        if (inference_czer.NIL != cycl_grammar.cycl_truth_value_p(czer_result)) {
            return subl_promotions.values3(czer_result, (SubLObject)inference_czer.NIL, (SubLObject)inference_czer.NIL);
        }
        if (!czer_result.isCons()) {
            Errors.error((SubLObject)inference_czer.$str35$Got_a_czer_result_of_unexpected_t, czer_result);
            return (SubLObject)inference_czer.NIL;
        }
        SubLObject contextualized_clauses = (SubLObject)inference_czer.NIL;
        thread.resetMultipleValues();
        final SubLObject v_clauses = inference_standardize_canonicalize_ask_result(czer_result, disjunction_free_el_vars_policy, cycl_query);
        final SubLObject blist = thread.secondMultipleValue();
        final SubLObject free_el_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (inference_czer.$kw34$ILL_FORMED == v_clauses) {
            return subl_promotions.values3((SubLObject)inference_czer.$kw34$ILL_FORMED, (SubLObject)inference_czer.NIL, (SubLObject)inference_czer.NIL);
        }
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)inference_czer.NIL;
        clause = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            final SubLObject contextualized_clause = contextualize_clause(clause, mt, disjunction_free_el_vars_policy);
            contextualized_clauses = (SubLObject)ConsesLow.cons(contextualized_clause, contextualized_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return subl_promotions.values3(contextualized_clauses, blist, free_el_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 30685L)
    public static SubLObject inference_standardize_canonicalize_ask_result(final SubLObject czer_result, final SubLObject disjunction_free_el_vars_policy, final SubLObject cycl_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_clauses = (SubLObject)inference_czer.NIL;
        SubLObject master_el_to_hl_variable_map = (SubLObject)inference_czer.NIL;
        SubLObject all_free_el_vars = (SubLObject)inference_czer.NIL;
        if (inference_czer.NIL != list_utilities.singletonP(czer_result)) {
            SubLObject tuple = (SubLObject)inference_czer.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(czer_result, czer_result, (SubLObject)inference_czer.$list36);
            tuple = czer_result.first();
            final SubLObject current = czer_result.rest();
            if (inference_czer.NIL == current) {
                SubLObject current_$7;
                final SubLObject datum_$6 = current_$7 = tuple;
                SubLObject clause = (SubLObject)inference_czer.NIL;
                SubLObject el_to_hl_variable_map = (SubLObject)inference_czer.NIL;
                SubLObject free_el_vars = (SubLObject)inference_czer.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)inference_czer.$list37);
                clause = current_$7.first();
                current_$7 = current_$7.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)inference_czer.$list37);
                el_to_hl_variable_map = current_$7.first();
                current_$7 = current_$7.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)inference_czer.$list37);
                free_el_vars = current_$7.first();
                current_$7 = current_$7.rest();
                if (inference_czer.NIL == current_$7) {
                    v_clauses = (SubLObject)ConsesLow.list(clause);
                    master_el_to_hl_variable_map = el_to_hl_variable_map;
                    all_free_el_vars = free_el_vars;
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$6, (SubLObject)inference_czer.$list37);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(czer_result, (SubLObject)inference_czer.$list36);
            }
        }
        else {
            thread.resetMultipleValues();
            final SubLObject master_el_to_hl_variable_map_$8 = inference_master_el_to_hl_variable_map(czer_result, disjunction_free_el_vars_policy);
            final SubLObject all_free_el_vars_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            master_el_to_hl_variable_map = master_el_to_hl_variable_map_$8;
            all_free_el_vars = all_free_el_vars_$9;
            if (master_el_to_hl_variable_map == inference_czer.$kw34$ILL_FORMED) {
                return subl_promotions.values3((SubLObject)inference_czer.$kw34$ILL_FORMED, (SubLObject)inference_czer.NIL, (SubLObject)inference_czer.NIL);
            }
            SubLObject cdolist_list_var = czer_result;
            SubLObject tuple2 = (SubLObject)inference_czer.NIL;
            tuple2 = cdolist_list_var.first();
            while (inference_czer.NIL != cdolist_list_var) {
                SubLObject current2;
                final SubLObject datum = current2 = tuple2;
                SubLObject local_hl_clause = (SubLObject)inference_czer.NIL;
                SubLObject local_el_to_hl_variable_map = (SubLObject)inference_czer.NIL;
                SubLObject local_free_el_vars = (SubLObject)inference_czer.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)inference_czer.$list38);
                local_hl_clause = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)inference_czer.$list38);
                local_el_to_hl_variable_map = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)inference_czer.$list38);
                local_free_el_vars = current2.first();
                current2 = current2.rest();
                if (inference_czer.NIL == current2) {
                    final SubLObject master_el_clause = bindings.apply_bindings_backwards(local_el_to_hl_variable_map, local_hl_clause);
                    final SubLObject master_hl_clause = bindings.apply_bindings(master_el_to_hl_variable_map, master_el_clause);
                    v_clauses = (SubLObject)ConsesLow.cons(master_hl_clause, v_clauses);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_czer.$list38);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 32196L)
    public static SubLObject inference_master_el_to_hl_variable_map(final SubLObject czer_result, final SubLObject disjunction_free_el_vars_policy) {
        SubLObject all_free_el_vars = (SubLObject)inference_czer.$kw39$UNINITIALIZED;
        SubLObject all_el_vars = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = czer_result;
        SubLObject tuple = (SubLObject)inference_czer.NIL;
        tuple = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject clause = (SubLObject)inference_czer.NIL;
            SubLObject el_to_hl_variable_map = (SubLObject)inference_czer.NIL;
            SubLObject free_hl_vars = (SubLObject)inference_czer.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list40);
            clause = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list40);
            el_to_hl_variable_map = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list40);
            free_hl_vars = current.first();
            current = current.rest();
            if (inference_czer.NIL == current) {
                final SubLObject free_el_vars = bindings.apply_bindings_backwards(el_to_hl_variable_map, free_hl_vars);
                final SubLObject el_vars = bindings.bindings_variables(el_to_hl_variable_map);
                all_el_vars = ConsesLow.append(el_vars, all_el_vars);
                if (inference_czer.$kw39$UNINITIALIZED == all_free_el_vars) {
                    all_free_el_vars = free_el_vars;
                }
                else {
                    final SubLObject updated_all_free_el_vars = inference_apply_disjunction_free_el_vars_policy(disjunction_free_el_vars_policy, all_free_el_vars, free_el_vars);
                    if (inference_czer.$kw29$POLICY_VIOLATION == updated_all_free_el_vars) {
                        return subl_promotions.values2((SubLObject)inference_czer.$kw34$ILL_FORMED, (SubLObject)inference_czer.NIL);
                    }
                    all_free_el_vars = updated_all_free_el_vars;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_czer.$list40);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        all_free_el_vars = list_utilities.fast_delete_duplicates(all_free_el_vars, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
        all_free_el_vars = inference_sort_el_variables(all_free_el_vars);
        all_el_vars = list_utilities.fast_delete_duplicates(all_el_vars, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
        all_el_vars = inference_sort_el_variables(all_el_vars);
        SubLObject master_el_to_hl_variable_map = (SubLObject)inference_czer.NIL;
        SubLObject list_var = (SubLObject)inference_czer.NIL;
        SubLObject el_var = (SubLObject)inference_czer.NIL;
        SubLObject index = (SubLObject)inference_czer.NIL;
        list_var = all_el_vars;
        el_var = list_var.first();
        for (index = (SubLObject)inference_czer.ZERO_INTEGER; inference_czer.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), index = Numbers.add((SubLObject)inference_czer.ONE_INTEGER, index)) {
            final SubLObject hl_var = variables.find_variable_by_id(index);
            master_el_to_hl_variable_map = bindings.add_variable_binding(el_var, hl_var, master_el_to_hl_variable_map);
        }
        master_el_to_hl_variable_map = Sequences.nreverse(master_el_to_hl_variable_map);
        return subl_promotions.values2(master_el_to_hl_variable_map, all_free_el_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 33822L)
    public static SubLObject inference_sort_el_variables(final SubLObject el_variables) {
        return Sort.sort(el_variables, (SubLObject)inference_czer.$sym41$INFERENCE_TERM__, (SubLObject)inference_czer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 33929L)
    public static SubLObject canonicalize_free_el_var_ordering(final SubLObject free_el_vars, final SubLObject cycl_query) {
        final SubLObject all_el_vars_in_appearance_order = list_utilities.tree_gather(cycl_query, (SubLObject)inference_czer.$sym42$EL_VARIABLE_P, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
        final SubLObject free_el_vars_in_appearance_order = list_utilities.sort_via_position(free_el_vars, all_el_vars_in_appearance_order, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
        return free_el_vars_in_appearance_order;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 34320L)
    public static SubLObject decontextualize_clauses_with_best_mt(final SubLObject contextualized_clauses) {
        final SubLObject mt = determine_best_clauses_level_mt(contextualized_clauses);
        final SubLObject v_clauses = decontextualize_clauses(contextualized_clauses, mt);
        return subl_promotions.values2(v_clauses, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 34570L)
    public static SubLObject decontextualize_clauses(final SubLObject contextualized_clauses, final SubLObject mt) {
        SubLObject ans = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = contextualized_clauses;
        SubLObject contextualized_clause = (SubLObject)inference_czer.NIL;
        contextualized_clause = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            ans = (SubLObject)ConsesLow.cons(decontextualize_clause(contextualized_clause, mt), ans);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 34886L)
    public static SubLObject decontextualize_clause(final SubLObject contextualized_clause, final SubLObject mt) {
        SubLObject neg_lits = (SubLObject)inference_czer.NIL;
        SubLObject pos_lits = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject neg_lit = (SubLObject)inference_czer.NIL;
        neg_lit = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            neg_lits = (SubLObject)ConsesLow.cons(contextualized_asent_formula(neg_lit, mt), neg_lits);
            cdolist_list_var = cdolist_list_var.rest();
            neg_lit = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        SubLObject pos_lit = (SubLObject)inference_czer.NIL;
        pos_lit = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            pos_lits = (SubLObject)ConsesLow.cons(contextualized_asent_formula(pos_lit, mt), pos_lits);
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        }
        return clauses.make_clause(Sequences.nreverse(neg_lits), Sequences.nreverse(pos_lits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 35417L)
    public static SubLObject contextualize_clauses(final SubLObject v_clauses, final SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
        if (disjunction_free_el_vars_policy == inference_czer.UNPROVIDED) {
            disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
        }
        SubLObject ans = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)inference_czer.NIL;
        clause = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            ans = (SubLObject)ConsesLow.cons(contextualize_clause(clause, mt, disjunction_free_el_vars_policy), ans);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 35801L)
    public static SubLObject dnf_and_mt_to_hl_query(final SubLObject dnf_clause, final SubLObject mt) {
        return (SubLObject)ConsesLow.list(contextualize_clause(dnf_clause, mt, (SubLObject)inference_czer.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 35940L)
    public static SubLObject contextualize_clause(final SubLObject clause, final SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
        if (disjunction_free_el_vars_policy == inference_czer.UNPROVIDED) {
            disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
        }
        final SubLObject contextualized_neg_lits = convert_to_hl_contextualized_asents(clauses.neg_lits(clause), mt);
        final SubLObject contextualized_pos_lits = convert_to_hl_contextualized_asents(clauses.pos_lits(clause), mt);
        final SubLObject contextualized_clause = clauses.make_clause(contextualized_neg_lits, contextualized_pos_lits);
        return canonicalize_contextualized_clause(contextualized_clause, disjunction_free_el_vars_policy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 36478L)
    public static SubLObject canonicalize_contextualized_clause(final SubLObject contextualized_clause, SubLObject disjunction_free_el_vars_policy) {
        if (disjunction_free_el_vars_policy == inference_czer.UNPROVIDED) {
            disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_czer.NIL == clauses.atomic_clause_p(contextualized_clause) || inference_czer.NIL == el_utilities.cyc_const_sentential_relation_p(cycl_utilities.atomic_sentence_predicate(inference_datastructures_problem_query.contextualized_asent_asent(clause_utilities.atomic_clause_asent(contextualized_clause))))) {
            return contextualized_clause;
        }
        final SubLObject not_really_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
        final SubLObject subsentence = inference_datastructures_problem_query.contextualized_asent_asent(not_really_asent);
        final SubLObject sub_mt = inference_datastructures_problem_query.contextualized_asent_mt(not_really_asent);
        final SubLObject contextualized_clauses = inference_canonicalize_ask_memoized(subsentence, sub_mt, disjunction_free_el_vars_policy);
        if (inference_czer.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_czer.NIL == list_utilities.singletonP(contextualized_clauses)) {
            Errors.error((SubLObject)inference_czer.$str43$Something_weird_happened_when_try, contextualized_clause);
        }
        return contextualized_clauses.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 37612L)
    public static SubLObject convert_to_hl_contextualized_asents(final SubLObject asents, final SubLObject mt) {
        SubLObject contextualized_asents = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = asents;
        SubLObject asent = (SubLObject)inference_czer.NIL;
        asent = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            final SubLObject contextualized_asent = convert_to_hl_contextualized_asent(asent, mt);
            contextualized_asents = (SubLObject)ConsesLow.cons(contextualized_asent, contextualized_asents);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        contextualized_asents = Sequences.nreverse(contextualized_asents);
        return contextualized_asents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 37977L)
    public static SubLObject convert_to_hl_contextualized_asent(SubLObject asent, final SubLObject mt) {
        if (inference_czer.NIL != cycl_variables.cyc_varP(asent)) {
            asent = el_utilities.make_unary_formula(inference_czer.$const4$trueSentence, asent);
        }
        final SubLObject contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(mt, asent);
        return inference_simplify_contextualized_asent(contextualized_asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 38375L)
    public static SubLObject find_problem_by_el_query(final SubLObject store, final SubLObject el_query, SubLObject mt) {
        if (mt == inference_czer.UNPROVIDED) {
            mt = (SubLObject)inference_czer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind((SubLObject)inference_czer.T, thread);
            thread.resetMultipleValues();
            final SubLObject sentence = czer_utilities.unwrap_if_ist(el_query, mt, (SubLObject)inference_czer.UNPROVIDED);
            final SubLObject mt_$10 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject query = inference_canonicalize_ask_int(sentence, mt_$10, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
            final SubLObject el_to_hl_variable_map = thread.secondMultipleValue();
            final SubLObject free_el_vars = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject free_hl_vars = (SubLObject)((inference_czer.NIL != inference_datastructures_problem_store.problem_identity_depends_on_free_hl_varsP(store)) ? variables.sort_hl_variable_list_memoized(bindings.apply_bindings(el_to_hl_variable_map, free_el_vars)) : inference_czer.NIL);
            return inference_worker.find_problem_int(store, query, free_hl_vars, (SubLObject)inference_czer.T);
        }
        finally {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 39088L)
    public static SubLObject problem_query_el_formula(final SubLObject query) {
        return cycl_utilities.hl_to_el(problem_query_formula(query));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 39347L)
    public static SubLObject problem_query_formula(final SubLObject query) {
        return contextualized_dnf_clauses_formula(query, (SubLObject)inference_czer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 39448L)
    public static SubLObject contextualized_dnf_clauses_formula(final SubLObject contextualized_dnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        if (inference_czer.NIL != list_utilities.singletonP(contextualized_dnf_clauses)) {
            return contextualized_dnf_clause_formula(contextualized_dnf_clauses.first(), clause_level_mt);
        }
        return contextualized_dnf_clauses_disjunction_formula(contextualized_dnf_clauses, clause_level_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 40065L)
    public static SubLObject contextualized_cnf_clauses_formula(final SubLObject contextualized_cnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        if (inference_czer.NIL != list_utilities.singletonP(contextualized_cnf_clauses)) {
            return contextualized_cnf_clause_formula(contextualized_cnf_clauses.first(), clause_level_mt);
        }
        return contextualized_cnf_clauses_conjunction_formula(contextualized_cnf_clauses, clause_level_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 40600L)
    public static SubLObject contextualized_dnf_clause_formula(final SubLObject contextualized_dnf_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        return contextualized_clause_formula(contextualized_dnf_clause, clause_level_mt, (SubLObject)inference_czer.$kw46$DNF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 40911L)
    public static SubLObject contextualized_cnf_clause_formula(final SubLObject contextualized_cnf_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        return contextualized_clause_formula(contextualized_cnf_clause, clause_level_mt, (SubLObject)inference_czer.$kw47$CNF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 41222L)
    public static SubLObject contextualized_dnf_clauses_common_mt(final SubLObject contextualized_dnf_clauses) {
        final SubLObject formula = contextualized_dnf_clauses_formula(contextualized_dnf_clauses, (SubLObject)inference_czer.UNPROVIDED);
        if (inference_czer.NIL != el_utilities.ist_sentence_p(formula, (SubLObject)inference_czer.UNPROVIDED) && inference_czer.NIL == cycl_utilities.expression_find_if((SubLObject)inference_czer.$sym48$IST_SENTENCE_WITH_CHLMT_P, cycl_utilities.formula_arg2(formula, (SubLObject)inference_czer.UNPROVIDED), (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED)) {
            return cycl_utilities.formula_arg1(formula, (SubLObject)inference_czer.UNPROVIDED);
        }
        return mt_vars.$core_mt_floor$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 41684L)
    public static SubLObject contextualized_dnf_clause_common_mt(final SubLObject contextualized_dnf_clause) {
        final SubLObject formula = contextualized_dnf_clause_formula(contextualized_dnf_clause, (SubLObject)inference_czer.UNPROVIDED);
        if (inference_czer.NIL != el_utilities.ist_sentence_p(formula, (SubLObject)inference_czer.UNPROVIDED) && inference_czer.NIL == cycl_utilities.expression_find_if((SubLObject)inference_czer.$sym48$IST_SENTENCE_WITH_CHLMT_P, cycl_utilities.formula_arg2(formula, (SubLObject)inference_czer.UNPROVIDED), (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED)) {
            return cycl_utilities.formula_arg1(formula, (SubLObject)inference_czer.UNPROVIDED);
        }
        return mt_vars.$core_mt_floor$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 42141L)
    public static SubLObject contextualized_clause_formula(final SubLObject contextualized_clause, final SubLObject clause_level_mt, final SubLObject type) {
        final SubLObject contextualized_neg_lits = contextualized_neg_lits(contextualized_clause);
        final SubLObject contextualized_pos_lits = contextualized_pos_lits(contextualized_clause);
        if (inference_czer.NIL == contextualized_neg_lits && inference_czer.NIL == contextualized_pos_lits) {
            return inference_czer.$const3$True;
        }
        if (inference_czer.NIL == contextualized_neg_lits && inference_czer.NIL != list_utilities.singletonP(contextualized_pos_lits)) {
            return contextualized_asent_formula(contextualized_pos_lits.first(), clause_level_mt);
        }
        if (inference_czer.NIL == contextualized_pos_lits && inference_czer.NIL != list_utilities.singletonP(contextualized_neg_lits)) {
            return contextualized_asent_negated_formula(contextualized_neg_lits.first(), clause_level_mt);
        }
        if (type == inference_czer.$kw46$DNF) {
            return contextualized_clause_conjunction_formula(contextualized_clause, clause_level_mt);
        }
        if (type == inference_czer.$kw47$CNF) {
            return contextualized_clause_disjunction_formula(contextualized_clause, clause_level_mt);
        }
        return (SubLObject)inference_czer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 43508L)
    public static SubLObject contextualized_neg_lits(final SubLObject contextualized_clause) {
        return clauses.neg_lits(contextualized_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 43626L)
    public static SubLObject contextualized_pos_lits(final SubLObject contextualized_clause) {
        return clauses.pos_lits(contextualized_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 43745L)
    public static SubLObject contextualized_asent_formula(final SubLObject contextualized_asent, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        SubLObject mt = (SubLObject)inference_czer.NIL;
        SubLObject asent = (SubLObject)inference_czer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)inference_czer.$list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)inference_czer.$list5);
        asent = current.first();
        current = current.rest();
        if (inference_czer.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)inference_czer.$list5);
            return (SubLObject)inference_czer.NIL;
        }
        if (mt.equal(clause_level_mt)) {
            return asent;
        }
        return el_utilities.make_binary_formula(inference_czer.$const49$ist, mt, asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 44139L)
    public static SubLObject contextualized_asent_negated_formula(final SubLObject contextualized_asent, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        SubLObject mt = (SubLObject)inference_czer.NIL;
        SubLObject asent = (SubLObject)inference_czer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)inference_czer.$list5);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)inference_czer.$list5);
        asent = current.first();
        current = current.rest();
        if (inference_czer.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)inference_czer.$list5);
            return (SubLObject)inference_czer.NIL;
        }
        if (mt.equal(clause_level_mt)) {
            return cycl_utilities.negate(asent);
        }
        return el_utilities.make_binary_formula(inference_czer.$const49$ist, mt, cycl_utilities.negate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 44441L)
    public static SubLObject contextualized_dnf_clauses_disjunction_formula(final SubLObject contextualized_dnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        if (inference_czer.NIL == contextualized_dnf_clauses) {
            return inference_czer.$const2$False;
        }
        SubLObject disjuncts = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = (SubLObject)inference_czer.NIL;
        contextualized_dnf_clause = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            disjuncts = (SubLObject)ConsesLow.cons(contextualized_dnf_clause_formula(contextualized_dnf_clause, clause_level_mt), disjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf_clause = cdolist_list_var.first();
        }
        return el_utilities.make_disjunction(Sequences.nreverse(disjuncts));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 45163L)
    public static SubLObject contextualized_cnf_clauses_conjunction_formula(final SubLObject contextualized_cnf_clauses, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        SubLObject conjuncts = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = contextualized_cnf_clauses;
        SubLObject contextualized_cnf_clause = (SubLObject)inference_czer.NIL;
        contextualized_cnf_clause = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            conjuncts = (SubLObject)ConsesLow.cons(contextualized_cnf_clause_formula(contextualized_cnf_clause, clause_level_mt), conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_cnf_clause = cdolist_list_var.first();
        }
        return el_utilities.make_conjunction(Sequences.nreverse(conjuncts));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 45776L)
    public static SubLObject contextualized_clause_conjunction_formula(final SubLObject contextualized_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        return contextualized_clause_juncts_formula(contextualized_clause, clause_level_mt, (SubLObject)inference_czer.$kw50$CONJUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 46163L)
    public static SubLObject contextualized_clause_disjunction_formula(final SubLObject contextualized_clause, SubLObject clause_level_mt) {
        if (clause_level_mt == inference_czer.UNPROVIDED) {
            clause_level_mt = (SubLObject)inference_czer.$kw45$UNSPECIFIED;
        }
        return contextualized_clause_juncts_formula(contextualized_clause, clause_level_mt, (SubLObject)inference_czer.$kw51$DISJUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 46550L)
    public static SubLObject contextualized_clause_juncts_formula(final SubLObject contextualized_clause, SubLObject clause_level_mt, final SubLObject type) {
        SubLObject neg_lit_formulas = (SubLObject)inference_czer.NIL;
        SubLObject pos_lit_formulas = (SubLObject)inference_czer.NIL;
        final SubLObject add_ist_wrapperP = (SubLObject)SubLObjectFactory.makeBoolean(inference_czer.NIL == hlmt.hlmt_p(clause_level_mt));
        if (inference_czer.NIL != add_ist_wrapperP) {
            clause_level_mt = determine_best_clause_level_mt(contextualized_clause);
        }
        SubLObject index_var = (SubLObject)inference_czer.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = (SubLObject)inference_czer.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)inference_czer.$kw52$NEG;
            if (inference_czer.$kw52$NEG == sense) {
                neg_lit_formulas = (SubLObject)ConsesLow.cons(contextualized_asent_negated_formula(contextualized_asent, clause_level_mt), neg_lit_formulas);
            }
            else {
                pos_lit_formulas = (SubLObject)ConsesLow.cons(contextualized_asent_formula(contextualized_asent, clause_level_mt), pos_lit_formulas);
            }
            index_var = Numbers.add(index_var, (SubLObject)inference_czer.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        index_var = (SubLObject)inference_czer.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        contextualized_asent = (SubLObject)inference_czer.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)inference_czer.$kw53$POS;
            if (inference_czer.$kw52$NEG == sense) {
                neg_lit_formulas = (SubLObject)ConsesLow.cons(contextualized_asent_negated_formula(contextualized_asent, clause_level_mt), neg_lit_formulas);
            }
            else {
                pos_lit_formulas = (SubLObject)ConsesLow.cons(contextualized_asent_formula(contextualized_asent, clause_level_mt), pos_lit_formulas);
            }
            index_var = Numbers.add(index_var, (SubLObject)inference_czer.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        neg_lit_formulas = Sequences.nreverse(neg_lit_formulas);
        pos_lit_formulas = Sequences.nreverse(pos_lit_formulas);
        final SubLObject juncts = ConsesLow.nconc(neg_lit_formulas, pos_lit_formulas);
        final SubLObject decontextualized_formula = (type == inference_czer.$kw50$CONJUNCTION) ? el_utilities.make_conjunction(juncts) : el_utilities.make_disjunction(juncts);
        return (inference_czer.NIL != add_ist_wrapperP) ? el_utilities.make_binary_formula(inference_czer.$const49$ist, clause_level_mt, decontextualized_formula) : decontextualized_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 47623L)
    public static SubLObject determine_best_clause_level_mt(final SubLObject contextualized_clause) {
        return determine_best_clauses_level_mt((SubLObject)ConsesLow.list(contextualized_clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 47767L)
    public static SubLObject determine_best_clauses_level_mt(final SubLObject contextualized_clauses) {
        SubLObject frequency_map = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = contextualized_clauses;
        SubLObject contextualized_clause = (SubLObject)inference_czer.NIL;
        contextualized_clause = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            SubLObject index_var = (SubLObject)inference_czer.ZERO_INTEGER;
            SubLObject cdolist_list_var_$11 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = (SubLObject)inference_czer.NIL;
            contextualized_asent = cdolist_list_var_$11.first();
            while (inference_czer.NIL != cdolist_list_var_$11) {
                final SubLObject sense = (SubLObject)inference_czer.$kw52$NEG;
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)inference_czer.NIL;
                SubLObject asent = (SubLObject)inference_czer.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list5);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list5);
                asent = current.first();
                current = current.rest();
                if (inference_czer.NIL == current) {
                    SubLObject total_data = conses_high.assoc(mt, frequency_map, Symbols.symbol_function((SubLObject)inference_czer.EQUAL), (SubLObject)inference_czer.UNPROVIDED);
                    if (inference_czer.NIL == total_data) {
                        total_data = (SubLObject)ConsesLow.cons(mt, (SubLObject)inference_czer.ZERO_INTEGER);
                        frequency_map = (SubLObject)ConsesLow.cons(total_data, frequency_map);
                    }
                    ConsesLow.rplacd(total_data, Numbers.add(total_data.rest(), (SubLObject)inference_czer.ONE_INTEGER));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_czer.$list5);
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_czer.ONE_INTEGER);
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                contextualized_asent = cdolist_list_var_$11.first();
            }
            index_var = (SubLObject)inference_czer.ZERO_INTEGER;
            SubLObject cdolist_list_var_$12 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = (SubLObject)inference_czer.NIL;
            contextualized_asent = cdolist_list_var_$12.first();
            while (inference_czer.NIL != cdolist_list_var_$12) {
                final SubLObject sense = (SubLObject)inference_czer.$kw53$POS;
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)inference_czer.NIL;
                SubLObject asent = (SubLObject)inference_czer.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list5);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_czer.$list5);
                asent = current.first();
                current = current.rest();
                if (inference_czer.NIL == current) {
                    SubLObject total_data = conses_high.assoc(mt, frequency_map, Symbols.symbol_function((SubLObject)inference_czer.EQUAL), (SubLObject)inference_czer.UNPROVIDED);
                    if (inference_czer.NIL == total_data) {
                        total_data = (SubLObject)ConsesLow.cons(mt, (SubLObject)inference_czer.ZERO_INTEGER);
                        frequency_map = (SubLObject)ConsesLow.cons(total_data, frequency_map);
                    }
                    ConsesLow.rplacd(total_data, Numbers.add(total_data.rest(), (SubLObject)inference_czer.ONE_INTEGER));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_czer.$list5);
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_czer.ONE_INTEGER);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                contextualized_asent = cdolist_list_var_$12.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        frequency_map = Sequences.nreverse(frequency_map);
        frequency_map = Sort.stable_sort(frequency_map, Symbols.symbol_function((SubLObject)inference_czer.$sym54$_), Symbols.symbol_function((SubLObject)inference_czer.$sym55$CDR));
        return frequency_map.first().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 48514L)
    public static SubLObject canonicalize_hypothesis(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject free_vars = el_utilities.sentence_free_variables(sentence, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED, (SubLObject)inference_czer.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject sentence_$13 = canonicalize_hypothesis_recursive(sentence, mt);
        final SubLObject mt_$14 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$13;
        mt = mt_$14;
        return subl_promotions.values3(sentence, mt, free_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 48962L)
    public static SubLObject canonicalize_hypothesis_recursive(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$minimal_skolem_arityP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$assume_free_vars_are_existentially_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = czer_vars.$forbid_quantified_sequence_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = czer_vars.$leave_skolem_constants_aloneP$.currentBinding(thread);
        try {
            czer_vars.$implicitify_universalsP$.bind((SubLObject)inference_czer.NIL, thread);
            czer_vars.$expand_el_relationsP$.bind((SubLObject)inference_czer.NIL, thread);
            czer_vars.$minimal_skolem_arityP$.bind((SubLObject)inference_czer.T, thread);
            czer_vars.$assume_free_vars_are_existentially_boundP$.bind((SubLObject)inference_czer.T, thread);
            czer_vars.$forbid_quantified_sequence_variablesP$.bind((SubLObject)inference_czer.NIL, thread);
            czer_vars.$leave_skolem_constants_aloneP$.bind((SubLObject)inference_czer.T, thread);
            thread.resetMultipleValues();
            final SubLObject sentence_$15 = clausifier.el_cnf(sentence, mt);
            final SubLObject mt_$16 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$15;
            mt = mt_$16;
        }
        finally {
            czer_vars.$leave_skolem_constants_aloneP$.rebind(_prev_bind_6, thread);
            czer_vars.$forbid_quantified_sequence_variablesP$.rebind(_prev_bind_5, thread);
            czer_vars.$assume_free_vars_are_existentially_boundP$.rebind(_prev_bind_4, thread);
            czer_vars.$minimal_skolem_arityP$.rebind(_prev_bind_3, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_2, thread);
            czer_vars.$implicitify_universalsP$.rebind(_prev_bind_0, thread);
        }
        if (sentence.eql(inference_czer.$const3$True)) {
            return subl_promotions.values2(el_utilities.make_conjunction((SubLObject)inference_czer.NIL), mt);
        }
        if (inference_czer.NIL == sentence || sentence.eql(inference_czer.$const2$False)) {
            return subl_promotions.values2(el_utilities.make_conjunction((SubLObject)inference_czer.$list56), mt);
        }
        if (sentence.isAtom()) {
            Errors.error((SubLObject)inference_czer.$str57$Can_t_canonicalize_hypothesis__S, sentence);
            return (SubLObject)inference_czer.NIL;
        }
        if (inference_czer.NIL != el_utilities.el_implication_p(sentence) || inference_czer.NIL != el_utilities.el_negation_p(sentence)) {
            return subl_promotions.values2(el_utilities.make_conjunction((SubLObject)ConsesLow.list(sentence)), mt);
        }
        if (inference_czer.NIL != el_utilities.el_disjunction_p(sentence)) {
            return subl_promotions.values2(el_utilities.make_conjunction((SubLObject)ConsesLow.list(sentence)), mt);
        }
        if (inference_czer.NIL != el_utilities.el_conjunction_p(sentence)) {
            SubLObject canon_args = (SubLObject)inference_czer.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)inference_czer.$kw58$IGNORE);
            SubLObject arg = (SubLObject)inference_czer.NIL;
            arg = cdolist_list_var.first();
            while (inference_czer.NIL != cdolist_list_var) {
                final SubLObject canon_arg = canonicalize_hypothesis_recursive(arg, mt);
                if (inference_czer.NIL != el_utilities.el_conjunction_p(canon_arg)) {
                    canon_args = conses_high.revappend(cycl_utilities.formula_args(canon_arg, (SubLObject)inference_czer.UNPROVIDED), canon_args);
                }
                else {
                    canon_args = (SubLObject)ConsesLow.cons(canon_arg, canon_args);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            return subl_promotions.values2(reader.bq_cons(inference_czer.$const59$and, ConsesLow.append(Sequences.nreverse(canon_args), (SubLObject)inference_czer.NIL)), mt);
        }
        if (inference_czer.NIL == el_utilities.mt_designating_literalP(sentence) || inference_czer.NIL != el_utilities.el_negation_p(sentence)) {
            return subl_promotions.values2(el_utilities.make_conjunction((SubLObject)ConsesLow.list(sentence)), mt);
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        final SubLObject designated_sentence = el_utilities.designated_sentence(sentence);
        SubLObject canon_mt;
        final SubLObject designated_mt = canon_mt = el_utilities.designated_mt(sentence);
        if (inference_czer.NIL == hlmt.hlmt_p(designated_mt)) {
            canon_mt = mt;
        }
        final SubLObject canonical_subsentence = canonicalize_hypothesis_recursive(designated_sentence, canon_mt);
        assert inference_czer.NIL != el_utilities.el_conjunction_p(canonical_subsentence) : canonical_subsentence;
        SubLObject conjuncts = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var2;
        final SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args(canonical_subsentence, (SubLObject)inference_czer.$kw58$IGNORE);
        SubLObject conjunct = (SubLObject)inference_czer.NIL;
        conjunct = cdolist_list_var2.first();
        while (inference_czer.NIL != cdolist_list_var2) {
            final SubLObject new_conjunct = el_utilities.make_binary_formula(predicate, designated_mt, conjunct);
            conjuncts = (SubLObject)ConsesLow.cons(new_conjunct, conjuncts);
            cdolist_list_var2 = cdolist_list_var2.rest();
            conjunct = cdolist_list_var2.first();
        }
        conjuncts = Sequences.nreverse(conjuncts);
        return subl_promotions.values2(el_utilities.make_conjunction(conjuncts), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 52193L)
    public static SubLObject categorize_hypothesis_formulas(final SubLObject hypothesis_formula) {
        final SubLObject formulas = cycl_utilities.formula_args(hypothesis_formula, (SubLObject)inference_czer.UNPROVIDED);
        SubLObject literals = (SubLObject)inference_czer.NIL;
        SubLObject rules = (SubLObject)inference_czer.NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = (SubLObject)inference_czer.NIL;
        formula = cdolist_list_var.first();
        while (inference_czer.NIL != cdolist_list_var) {
            if (inference_czer.NIL != el_utilities.el_formula_p(formula) && inference_czer.NIL != rule_el_formulaP(formula)) {
                rules = (SubLObject)ConsesLow.cons(formula, rules);
            }
            else {
                literals = (SubLObject)ConsesLow.cons(formula, literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        }
        literals = Sequences.nreverse(literals);
        rules = Sequences.nreverse(rules);
        return subl_promotions.values2(literals, rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 52619L)
    public static SubLObject rule_el_formulaP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_czer.NIL != el_utilities.el_implication_p(formula) || inference_czer.NIL != el_utilities.el_disjunction_p(formula) || inference_czer.NIL != el_utilities.el_exception_p(formula) || inference_czer.NIL != el_utilities.el_pragmatic_requirement_p(formula) || (inference_czer.NIL != el_utilities.ist_sentence_p(formula, (SubLObject)inference_czer.UNPROVIDED) && inference_czer.NIL != rule_el_formulaP(cycl_utilities.formula_arg2(formula, (SubLObject)inference_czer.UNPROVIDED))) || inference_czer.NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, inference_czer.$const61$assertionDirection) || inference_czer.NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, inference_czer.$const62$constraint) || inference_czer.NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, inference_czer.$const63$highlyRelevantAssertion) || inference_czer.NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, inference_czer.$const64$irrelevantAssertion) || inference_czer.NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, inference_czer.$const65$knownAntecedentRule) || inference_czer.NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, inference_czer.$const66$queryExtentCached) || inference_czer.NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, inference_czer.$const67$genlRules) || inference_czer.NIL != cycl_utilities.atomic_sentence_with_pred_p(formula, inference_czer.$const68$universalLiftingRule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 53450L)
    public static SubLObject canonicalize_hypothetical_ask(final SubLObject sentence, SubLObject mt) {
        if (mt == inference_czer.UNPROVIDED) {
            mt = (SubLObject)inference_czer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_sentence = (SubLObject)inference_czer.NIL;
        SubLObject result_mt = (SubLObject)inference_czer.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_functionsP$.bind((SubLObject)inference_czer.NIL, thread);
            czer_vars.$expand_el_relationsP$.bind((SubLObject)inference_czer.NIL, thread);
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind((SubLObject)inference_czer.T, thread);
            thread.resetMultipleValues();
            final SubLObject result_sentence_$17 = czer_main.canonicalize_ask_sentence(sentence, mt);
            final SubLObject result_mt_$18 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_sentence = result_sentence_$17;
            result_mt = result_mt_$18;
        }
        finally {
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_3, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_2, thread);
            czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(result_sentence, result_mt);
    }
    
    public static SubLObject declare_inference_czer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "canonicalize_problem_query", "CANONICALIZE-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_delete_duplicate_literals", "INFERENCE-DELETE-DUPLICATE-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_delete_duplicate_clauses", "INFERENCE-DELETE-DUPLICATE-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "delete_duplicate_sorted_literals", "DELETE-DUPLICATE-SORTED-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "delete_duplicate_sorted_clauses", "DELETE-DUPLICATE-SORTED-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_simplify_problem_query", "INFERENCE-SIMPLIFY-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_simplify_contextualized_dnf_clause", "INFERENCE-SIMPLIFY-CONTEXTUALIZED-DNF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_simplify_negated_true_sentence", "INFERENCE-SIMPLIFY-NEGATED-TRUE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_el_dnf", "INFERENCE-EL-DNF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "backchaining_on_ist_enabledP", "BACKCHAINING-ON-IST-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_simplify_contextualized_asent", "INFERENCE-SIMPLIFY-CONTEXTUALIZED-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_sort_clauses_and_literals", "INFERENCE-SORT-CLAUSES-AND-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_sort_contextualized_clause_literals", "INFERENCE-SORT-CONTEXTUALIZED-CLAUSE-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_sort_contextualized_clauses", "INFERENCE-SORT-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_sort_contextualized_literals", "INFERENCE-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_simple_sort_contextualized_literals", "INFERENCE-SIMPLE-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_clause_L", "INFERENCE-CLAUSE-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_contextualized_asent_L", "INFERENCE-CONTEXTUALIZED-ASENT-<", 2, 0, false);
        new $inference_contextualized_asent_L$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_list_L", "INFERENCE-LIST-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_formula_L", "INFERENCE-FORMULA-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_term_L", "INFERENCE-TERM-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_term_G", "INFERENCE-TERM->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_term_type_code", "INFERENCE-TERM-TYPE-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_constant_L", "INFERENCE-CONSTANT-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_nart_L", "INFERENCE-NART-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "non_fixed_variable_p", "NON-FIXED-VARIABLE-P", 1, 0, false);
        new $non_fixed_variable_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "fixed_variable_p", "FIXED-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "fully_fixed_p", "FULLY-FIXED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "fixed_variable_id", "FIXED-VARIABLE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "fixed_variable_token", "FIXED-VARIABLE-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "fixed_variable_token_p", "FIXED-VARIABLE-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "fixed_variable_for_token", "FIXED-VARIABLE-FOR-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_czer_at_least_partially_commutative_relation_p", "INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_czer_not_at_all_commutative_relation_p", "INFERENCE-CZER-NOT-AT-ALL-COMMUTATIVE-RELATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "not_at_all_commutative_contextualized_asent_p", "NOT-AT-ALL-COMMUTATIVE-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "at_least_partially_commutative_contextualized_asent_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_awesome_sort_contextualized_literals", "INFERENCE-AWESOME-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_awesome_sort_contextualized_literals_iterative", "INFERENCE-AWESOME-SORT-CONTEXTUALIZED-LITERALS-ITERATIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "pick_some_awesome_lits", "PICK-SOME-AWESOME-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_fully_fixed_literals", "INFERENCE-FULLY-FIXED-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "variable_token", "VARIABLE-TOKEN", 0, 1, false);
        new $variable_token$ZeroArityFunction();
        new $variable_token$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "var_tokenized_contextualized_asent_predicate", "VAR-TOKENIZED-CONTEXTUALIZED-ASENT-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_unique_commutative_literals", "INFERENCE-UNIQUE-COMMUTATIVE-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_uniquely_constrained_literals", "INFERENCE-UNIQUELY-CONSTRAINED-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_update_fixed_vars_table", "INFERENCE-UPDATE-FIXED-VARS-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contiguize_hl_vars_in_clauses", "CONTIGUIZE-HL-VARS-IN-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "identity_variable_map", "IDENTITY-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "non_contiguous_hl_varP", "NON-CONTIGUOUS-HL-VAR?", 1, 0, false);
        new $non_contiguous_hl_varP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "all_hl_vars_contiguous_and_in_orderP", "ALL-HL-VARS-CONTIGUOUS-AND-IN-ORDER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "possibly_note_hl_var_contiguity_pair", "POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR", 1, 0, false);
        new $possibly_note_hl_var_contiguity_pair$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "hl_var_contiguity_alist", "HL-VAR-CONTIGUITY-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_apply_disjunction_free_el_vars_policy", "INFERENCE-APPLY-DISJUNCTION-FREE-EL-VARS-POLICY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_canonicalize_ask_memoized_internal", "INFERENCE-CANONICALIZE-ASK-MEMOIZED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_canonicalize_ask_memoized", "INFERENCE-CANONICALIZE-ASK-MEMOIZED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_canonicalize_ask_int", "INFERENCE-CANONICALIZE-ASK-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_standardize_canonicalize_ask_result", "INFERENCE-STANDARDIZE-CANONICALIZE-ASK-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_master_el_to_hl_variable_map", "INFERENCE-MASTER-EL-TO-HL-VARIABLE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "inference_sort_el_variables", "INFERENCE-SORT-EL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "canonicalize_free_el_var_ordering", "CANONICALIZE-FREE-EL-VAR-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "decontextualize_clauses_with_best_mt", "DECONTEXTUALIZE-CLAUSES-WITH-BEST-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "decontextualize_clauses", "DECONTEXTUALIZE-CLAUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "decontextualize_clause", "DECONTEXTUALIZE-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualize_clauses", "CONTEXTUALIZE-CLAUSES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "dnf_and_mt_to_hl_query", "DNF-AND-MT-TO-HL-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualize_clause", "CONTEXTUALIZE-CLAUSE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "canonicalize_contextualized_clause", "CANONICALIZE-CONTEXTUALIZED-CLAUSE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "convert_to_hl_contextualized_asents", "CONVERT-TO-HL-CONTEXTUALIZED-ASENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "convert_to_hl_contextualized_asent", "CONVERT-TO-HL-CONTEXTUALIZED-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "find_problem_by_el_query", "FIND-PROBLEM-BY-EL-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "problem_query_el_formula", "PROBLEM-QUERY-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "problem_query_formula", "PROBLEM-QUERY-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_dnf_clauses_formula", "CONTEXTUALIZED-DNF-CLAUSES-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_cnf_clauses_formula", "CONTEXTUALIZED-CNF-CLAUSES-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_dnf_clause_formula", "CONTEXTUALIZED-DNF-CLAUSE-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_cnf_clause_formula", "CONTEXTUALIZED-CNF-CLAUSE-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_dnf_clauses_common_mt", "CONTEXTUALIZED-DNF-CLAUSES-COMMON-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_dnf_clause_common_mt", "CONTEXTUALIZED-DNF-CLAUSE-COMMON-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_clause_formula", "CONTEXTUALIZED-CLAUSE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_neg_lits", "CONTEXTUALIZED-NEG-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_pos_lits", "CONTEXTUALIZED-POS-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_asent_formula", "CONTEXTUALIZED-ASENT-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_asent_negated_formula", "CONTEXTUALIZED-ASENT-NEGATED-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_dnf_clauses_disjunction_formula", "CONTEXTUALIZED-DNF-CLAUSES-DISJUNCTION-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_cnf_clauses_conjunction_formula", "CONTEXTUALIZED-CNF-CLAUSES-CONJUNCTION-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_clause_conjunction_formula", "CONTEXTUALIZED-CLAUSE-CONJUNCTION-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_clause_disjunction_formula", "CONTEXTUALIZED-CLAUSE-DISJUNCTION-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "contextualized_clause_juncts_formula", "CONTEXTUALIZED-CLAUSE-JUNCTS-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "determine_best_clause_level_mt", "DETERMINE-BEST-CLAUSE-LEVEL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "determine_best_clauses_level_mt", "DETERMINE-BEST-CLAUSES-LEVEL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "canonicalize_hypothesis", "CANONICALIZE-HYPOTHESIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "canonicalize_hypothesis_recursive", "CANONICALIZE-HYPOTHESIS-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "categorize_hypothesis_formulas", "CATEGORIZE-HYPOTHESIS-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "rule_el_formulaP", "RULE-EL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_czer", "canonicalize_hypothetical_ask", "CANONICALIZE-HYPOTHETICAL-ASK", 1, 1, false);
        return (SubLObject)inference_czer.NIL;
    }
    
    public static SubLObject init_inference_czer_file() {
        inference_czer.$inference_sort_principledP$ = SubLFiles.defparameter("*INFERENCE-SORT-PRINCIPLED?*", (SubLObject)inference_czer.T);
        inference_czer.$backchaining_on_ist_enabledP$ = SubLFiles.defparameter("*BACKCHAINING-ON-IST-ENABLED?*", (SubLObject)inference_czer.T);
        inference_czer.$inference_czer_fixed_vars_table$ = SubLFiles.defparameter("*INFERENCE-CZER-FIXED-VARS-TABLE*", misc_utilities.uninitialized());
        inference_czer.$inference_czer_next_fixed_var_id$ = SubLFiles.defparameter("*INFERENCE-CZER-NEXT-FIXED-VAR-ID*", misc_utilities.uninitialized());
        inference_czer.$inference_czer_at_least_partially_commutative_relations_alist$ = SubLFiles.defparameter("*INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATIONS-ALIST*", misc_utilities.uninitialized());
        inference_czer.$variable_token$ = SubLFiles.deflexical("*VARIABLE-TOKEN*", (inference_czer.NIL != Symbols.boundp((SubLObject)inference_czer.$sym18$_VARIABLE_TOKEN_)) ? inference_czer.$variable_token$.getGlobalValue() : Symbols.make_symbol((SubLObject)inference_czer.$str19$var));
        inference_czer.$largest_hl_var_num_so_far$ = SubLFiles.defparameter("*LARGEST-HL-VAR-NUM-SO-FAR*", (SubLObject)inference_czer.$kw25$LAMBDA);
        inference_czer.$hl_var_contiguity_alist$ = SubLFiles.defparameter("*HL-VAR-CONTIGUITY-ALIST*", (SubLObject)inference_czer.$kw25$LAMBDA);
        return (SubLObject)inference_czer.NIL;
    }
    
    public static SubLObject setup_inference_czer_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)inference_czer.$sym18$_VARIABLE_TOKEN_);
        memoization_state.note_memoized_function((SubLObject)inference_czer.$sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED);
        return (SubLObject)inference_czer.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_czer_file();
    }
    
    public void initializeVariables() {
        init_inference_czer_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_czer_file();
    }
    
    static {
        me = (SubLFile)new inference_czer();
        inference_czer.$inference_sort_principledP$ = null;
        inference_czer.$backchaining_on_ist_enabledP$ = null;
        inference_czer.$inference_czer_fixed_vars_table$ = null;
        inference_czer.$inference_czer_next_fixed_var_id$ = null;
        inference_czer.$inference_czer_at_least_partially_commutative_relations_alist$ = null;
        inference_czer.$variable_token$ = null;
        inference_czer.$largest_hl_var_num_so_far$ = null;
        inference_czer.$hl_var_contiguity_alist$ = null;
        $sym0$INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE = SubLObjectFactory.makeSymbol("INFERENCE-SIMPLIFY-NEGATED-TRUE-SENTENCE");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE-SENTENCE"));
        $const2$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const3$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const4$trueSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $const6$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))));
        $const8$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym9$INFERENCE_CLAUSE__ = SubLObjectFactory.makeSymbol("INFERENCE-CLAUSE-<");
        $sym10$INFERENCE_CONTEXTUALIZED_ASENT__ = SubLObjectFactory.makeSymbol("INFERENCE-CONTEXTUALIZED-ASENT-<");
        $str11$The_type_of_object__a_cannot_be_s = SubLObjectFactory.makeString("The type of object ~a cannot be sorted");
        $str12$Got_a_CycL_term_of_unknown_infere = SubLObjectFactory.makeString("Got a CycL term of unknown inference type: ~a");
        $sym13$NON_FIXED_VARIABLE_P = SubLObjectFactory.makeSymbol("NON-FIXED-VARIABLE-P");
        $kw14$INFERENCE_CZER_FIXED_VARIABLE = SubLObjectFactory.makeKeyword("INFERENCE-CZER-FIXED-VARIABLE");
        $kw15$CACHE_MISS = SubLObjectFactory.makeKeyword("CACHE-MISS");
        $const16$CommutativeRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommutativeRelation"));
        $const17$PartiallyCommutativeRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativeRelation"));
        $sym18$_VARIABLE_TOKEN_ = SubLObjectFactory.makeSymbol("*VARIABLE-TOKEN*");
        $str19$var = SubLObjectFactory.makeString("var");
        $list20 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS"));
        $sym21$VARIABLE_TOKEN = SubLObjectFactory.makeSymbol("VARIABLE-TOKEN");
        $kw22$NOT_UNIQUE = SubLObjectFactory.makeKeyword("NOT-UNIQUE");
        $list23 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"));
        $sym24$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $kw25$LAMBDA = SubLObjectFactory.makeKeyword("LAMBDA");
        $sym26$NON_CONTIGUOUS_HL_VAR_ = SubLObjectFactory.makeSymbol("NON-CONTIGUOUS-HL-VAR?");
        $sym27$POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR = SubLObjectFactory.makeSymbol("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR");
        $kw28$REQUIRE_EQUAL = SubLObjectFactory.makeKeyword("REQUIRE-EQUAL");
        $kw29$POLICY_VIOLATION = SubLObjectFactory.makeKeyword("POLICY-VIOLATION");
        $kw30$COMPUTE_INTERSECTION = SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION");
        $kw31$COMPUTE_UNION = SubLObjectFactory.makeKeyword("COMPUTE-UNION");
        $str32$Unexpected_inference_disjunction_ = SubLObjectFactory.makeString("Unexpected inference disjunction free el vars policy : ~S");
        $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED = SubLObjectFactory.makeSymbol("INFERENCE-CANONICALIZE-ASK-MEMOIZED");
        $kw34$ILL_FORMED = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $str35$Got_a_czer_result_of_unexpected_t = SubLObjectFactory.makeString("Got a czer-result of unexpected type: ~s");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TUPLE"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-TO-HL-VARIABLE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("FREE-EL-VARS"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-HL-CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-EL-TO-HL-VARIABLE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-FREE-EL-VARS"));
        $kw39$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-TO-HL-VARIABLE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("FREE-HL-VARS"));
        $sym41$INFERENCE_TERM__ = SubLObjectFactory.makeSymbol("INFERENCE-TERM-<");
        $sym42$EL_VARIABLE_P = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $str43$Something_weird_happened_when_try = SubLObjectFactory.makeString("Something weird happened when trying to distribute #$ist across logical operators with ~s");
        $sym44$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw45$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $kw46$DNF = SubLObjectFactory.makeKeyword("DNF");
        $kw47$CNF = SubLObjectFactory.makeKeyword("CNF");
        $sym48$IST_SENTENCE_WITH_CHLMT_P = SubLObjectFactory.makeSymbol("IST-SENTENCE-WITH-CHLMT-P");
        $const49$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $kw50$CONJUNCTION = SubLObjectFactory.makeKeyword("CONJUNCTION");
        $kw51$DISJUNCTION = SubLObjectFactory.makeKeyword("DISJUNCTION");
        $kw52$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw53$POS = SubLObjectFactory.makeKeyword("POS");
        $sym54$_ = SubLObjectFactory.makeSymbol(">");
        $sym55$CDR = SubLObjectFactory.makeSymbol("CDR");
        $list56 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False")));
        $str57$Can_t_canonicalize_hypothesis__S = SubLObjectFactory.makeString("Can't canonicalize hypothesis ~S");
        $kw58$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const59$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym60$EL_CONJUNCTION_P = SubLObjectFactory.makeSymbol("EL-CONJUNCTION-P");
        $const61$assertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection"));
        $const62$constraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constraint"));
        $const63$highlyRelevantAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("highlyRelevantAssertion"));
        $const64$irrelevantAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("irrelevantAssertion"));
        $const65$knownAntecedentRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownAntecedentRule"));
        $const66$queryExtentCached = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryExtentCached"));
        $const67$genlRules = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlRules"));
        $const68$universalLiftingRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("universalLiftingRule"));
    }
    
    public static final class $inference_contextualized_asent_L$BinaryFunction extends BinaryFunction
    {
        public $inference_contextualized_asent_L$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-CONTEXTUALIZED-ASENT-<"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return inference_czer.inference_contextualized_asent_L(arg1, arg2);
        }
    }
    
    public static final class $non_fixed_variable_p$UnaryFunction extends UnaryFunction
    {
        public $non_fixed_variable_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NON-FIXED-VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_czer.non_fixed_variable_p(arg1);
        }
    }
    
    public static final class $variable_token$ZeroArityFunction extends ZeroArityFunction
    {
        public $variable_token$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VARIABLE-TOKEN"));
        }
        
        public SubLObject processItem() {
            return inference_czer.variable_token((SubLObject)$variable_token$ZeroArityFunction.UNPROVIDED);
        }
    }
    
    public static final class $variable_token$UnaryFunction extends UnaryFunction
    {
        public $variable_token$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VARIABLE-TOKEN"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_czer.variable_token(arg1);
        }
    }
    
    public static final class $non_contiguous_hl_varP$UnaryFunction extends UnaryFunction
    {
        public $non_contiguous_hl_varP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NON-CONTIGUOUS-HL-VAR?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_czer.non_contiguous_hl_varP(arg1);
        }
    }
    
    public static final class $possibly_note_hl_var_contiguity_pair$UnaryFunction extends UnaryFunction
    {
        public $possibly_note_hl_var_contiguity_pair$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_czer.possibly_note_hl_var_contiguity_pair(arg1);
        }
    }
}

/*

	Total time: 353 ms
	
*/