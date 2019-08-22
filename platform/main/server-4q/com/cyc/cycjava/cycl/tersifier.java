package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class tersifier extends SubLTranslatedFile {
    public static final SubLFile me = new tersifier();

    public static final String myName = "com.cyc.cycjava.cycl.tersifier";

    public static final String myFingerPrint = "9f7631c3f5c86576d05e4d3476735d7fca51a53af0151dcbf3061ce5dc930bda";

    // deflexical
    private static final SubLSymbol $constants_to_ignore_for_contraction_ht$ = makeSymbol("*CONSTANTS-TO-IGNORE-FOR-CONTRACTION-HT*");







    // defparameter
    private static final SubLSymbol $current_generic_arg_num$ = makeSymbol("*CURRENT-GENERIC-ARG-NUM*");



    public static final SubLSymbol EL_CONTRACTION = makeSymbol("EL-CONTRACTION");

    public static final SubLList $list2 = list(reader_make_constant_shell(makeString("termOfUnit")));

    public static final SubLSymbol $contraction_constant_ht$ = makeSymbol("*CONTRACTION-CONSTANT-HT*");

    public static final SubLSymbol $contraction_checksum_ht$ = makeSymbol("*CONTRACTION-CHECKSUM-HT*");

    public static final SubLSymbol $canon_expansion_ht$ = makeSymbol("*CANON-EXPANSION-HT*");

    public static final SubLSymbol $sym6$EL_VAR_ = makeSymbol("EL-VAR?");



    public static final SubLSymbol DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");

    public static final SubLSymbol $sym9$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");

    public static final SubLSymbol REPLACE_SKOLEM_ARGS_WITH_VARIABLES = makeSymbol("REPLACE-SKOLEM-ARGS-WITH-VARIABLES");



    public static final SubLSymbol GENERIC_ARG_TO_HL_VAR = makeSymbol("GENERIC-ARG-TO-HL-VAR");

    public static final SubLSymbol HL_VAR_TO_GENERIC_ARG = makeSymbol("HL-VAR-TO-GENERIC-ARG");

    public static final SubLSymbol $sym14$DEFAULT_EL_VAR_ = makeSymbol("DEFAULT-EL-VAR?");

    public static final SubLSymbol HL_VAR_FOR_DEFAULT_EL_VAR = makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR");

    private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));



    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol ADD_ASSERTION_TO_CONTRACTION_HT = makeSymbol("ADD-ASSERTION-TO-CONTRACTION-HT");

    private static final SubLSymbol GENERIC_ARG_NUM = makeSymbol("GENERIC-ARG-NUM");







    private static final SubLSymbol $sym28$_ = makeSymbol("<");



    public static SubLObject tersify_cycl(final SubLObject formula, SubLObject mt, SubLObject settings) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (settings == UNPROVIDED) {
            settings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        thread.resetMultipleValues();
        SubLObject contracted_formula = el_contraction(formula, mt);
        final SubLObject changedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == changedP) {
            contracted_formula = map_formula_terms(symbol_function(EL_CONTRACTION), formula, UNPROVIDED);
        }
        return contracted_formula;
    }

    public static SubLObject contraction_hts_validP() {
        return makeBoolean(((NIL != $canon_expansion_ht$.getGlobalValue()) && (NIL != $contraction_constant_ht$.getGlobalValue())) && (NIL != $contraction_checksum_ht$.getGlobalValue()));
    }

    public static SubLObject contraction_relevant_constant_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL == subl_promotions.memberP(v_object, $constants_to_ignore_for_contraction_ht$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject generic_arg_to_hl_var(final SubLObject generic_arg) {
        return variables.get_variable(at_utilities.generic_arg_num(generic_arg));
    }

    public static SubLObject hl_var_to_generic_arg(final SubLObject hl_var) {
        return at_utilities.get_generic_arg(variables.variable_id(hl_var));
    }

    public static SubLObject clauses_hl_vars_to_el_vars(final SubLObject v_clauses, SubLObject blists) {
        if (blists == UNPROVIDED) {
            blists = NIL;
        }
        SubLObject new_clauses = NIL;
        SubLObject clause_list = NIL;
        SubLObject clause = NIL;
        SubLObject blist_list = NIL;
        SubLObject blist = NIL;
        clause_list = v_clauses;
        clause = clause_list.first();
        blist_list = blists;
        blist = blist_list.first();
        while (NIL != clause_list) {
            SubLObject cdolist_list_var = blist;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                nsubst(binding.first(), binding.rest(), clause, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
            new_clauses = cons(clause, new_clauses);
            clause_list = clause_list.rest();
            clause = clause_list.first();
            blist_list = blist_list.rest();
            blist = blist_list.first();
        } 
        return nreverse(new_clauses);
    }

    public static SubLObject var_name_conflictsP(final SubLObject formula) {
        final SubLObject el_vars = list_utilities.tree_gather(formula, symbol_function($sym6$EL_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject hl_vars = list_utilities.tree_gather(formula, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return makeBoolean(NIL != nintersection(el_vars, Mapping.mapcar(symbol_function(DEFAULT_EL_VAR_FOR_HL_VAR), hl_vars), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject generic_arg_unify(final SubLObject generic_arg_template, final SubLObject v_object, final SubLObject object_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != var_name_conflictsP(generic_arg_template)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject highest_num = highest_generic_arg_num(generic_arg_template);
        final SubLObject _prev_bind_0 = $current_generic_arg_num$.currentBinding(thread);
        try {
            $current_generic_arg_num$.bind(add(ONE_INTEGER, highest_num), thread);
            final SubLObject unification_template = transform_list_utilities.ntransform(transform_list_utilities.ntransform(transform_list_utilities.transform(generic_arg_template, symbol_function($sym9$UNREIFIED_SKOLEM_TERM_), symbol_function(REPLACE_SKOLEM_ARGS_WITH_VARIABLES), UNPROVIDED), symbol_function(VARIABLE_P), symbol_function(DEFAULT_EL_VAR_FOR_HL_VAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(GENERIC_ARG_P), symbol_function(GENERIC_ARG_TO_HL_VAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject opaque_object = clauses_hl_vars_to_el_vars(v_object, object_bindings);
            result = check_temp_skolem_variables(unification_utilities.unify_clauses(unification_template, opaque_object, T, UNPROVIDED), highest_num);
        } finally {
            $current_generic_arg_num$.rebind(_prev_bind_0, thread);
        }
        return transform_list_utilities.ntransform(transform_list_utilities.ntransform(result, symbol_function(VARIABLE_P), symbol_function(HL_VAR_TO_GENERIC_ARG), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym14$DEFAULT_EL_VAR_), symbol_function(HL_VAR_FOR_DEFAULT_EL_VAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject expansion_clauseP(final SubLObject clause) {
        final SubLObject expansion_neglits = clauses.neg_lits(clause);
        final SubLObject expansion_poslits = clauses.pos_lits(clause);
        final SubLObject expansion_poslit = expansion_poslits.first();
        return makeBoolean((((NIL == expansion_neglits) && (NIL != list_utilities.singletonP(expansion_poslits))) && (NIL != el_binary_formula_p(expansion_poslit))) && (NIL != kb_utilities.kbeq($$expansion, cycl_utilities.formula_arg0(expansion_poslit))));
    }

    public static SubLObject canonicalize_expansion(final SubLObject expansion, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$add_term_of_unit_litsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$reify_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
        try {
            czer_vars.$add_term_of_unit_litsP$.bind(NIL, thread);
            czer_vars.$reify_skolemsP$.bind(NIL, thread);
            wff_vars.$permit_generic_arg_variablesP$.bind(T, thread);
            czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
            result = czer_main.canonicalize_cycl(expansion, mt);
        } finally {
            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_4, thread);
            wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_3, thread);
            czer_vars.$reify_skolemsP$.rebind(_prev_bind_2, thread);
            czer_vars.$add_term_of_unit_litsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject add_assertion_to_contraction_ht(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue(thread)) {
            if (NIL == contraction_hts_validP()) {
                sync_contraction_ht_to_kb();
            }
            final SubLObject expansion_clause = assertions_high.assertion_cnf(assertion);
            final SubLObject expansion_mt = assertions_high.assertion_mt(assertion);
            if (NIL != expansion_clauseP(expansion_clause)) {
                thread.resetMultipleValues();
                final SubLObject hash_dollar_expansion = unmake_binary_formula(clauses.pos_lits(expansion_clause).first());
                final SubLObject new_reln = thread.secondMultipleValue();
                final SubLObject expansion = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject canon_expansion = canonicalize_expansion(expansion, expansion_mt);
                if ((NIL == cycl_grammar.cycl_truth_value_p(canon_expansion)) && canon_expansion.isList()) {
                    sethash(new_reln, $canon_expansion_ht$.getGlobalValue(), canon_expansion);
                    final SubLObject v_clauses = Mapping.mapcar(symbol_function(FIRST), canon_expansion);
                    final SubLObject constants = cycl_utilities.constant_list(v_clauses, UNPROVIDED);
                    SubLObject num_relevant_constants = ZERO_INTEGER;
                    SubLObject cdolist_list_var = constants;
                    SubLObject constant = NIL;
                    constant = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != contraction_relevant_constant_p(constant)) {
                            num_relevant_constants = add(num_relevant_constants, ONE_INTEGER);
                            SubLObject relns = gethash(constant, $contraction_constant_ht$.getGlobalValue(), UNPROVIDED);
                            final SubLObject item_var = new_reln;
                            if (NIL == member(item_var, relns, symbol_function(KBEQ), symbol_function(IDENTITY))) {
                                relns = cons(item_var, relns);
                            }
                            sethash(constant, $contraction_constant_ht$.getGlobalValue(), relns);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        constant = cdolist_list_var.first();
                    } 
                    sethash(new_reln, $contraction_checksum_ht$.getGlobalValue(), num_relevant_constants);
                }
            }
        }
        return NIL;
    }

    public static SubLObject remove_assertion_from_contraction_ht(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue(thread)) {
            if (NIL == contraction_hts_validP()) {
                sync_contraction_ht_to_kb();
            }
            final SubLObject expansion_clause = assertions_high.assertion_cnf(assertion);
            final SubLObject expansion_mt = assertions_high.assertion_mt(assertion);
            if (NIL != expansion_clauseP(expansion_clause)) {
                thread.resetMultipleValues();
                final SubLObject hash_dollar_expansion = unmake_binary_formula(clauses.pos_lits(expansion_clause).first());
                final SubLObject dead_reln = thread.secondMultipleValue();
                final SubLObject expansion = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0 = czer_vars.$reify_skolemsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = czer_vars.$control_4$.currentBinding(thread);
                try {
                    czer_vars.$reify_skolemsP$.bind(NIL, thread);
                    wff_vars.$permit_generic_arg_variablesP$.bind(T, thread);
                    czer_vars.$control_4$.bind(T, thread);
                    final SubLObject canon_expansion = czer_main.canonicalize_cycl(expansion, expansion_mt);
                    if (((NIL == kb_utilities.kbeq($$True, canon_expansion)) && (NIL == kb_utilities.kbeq($$False, canon_expansion))) && canon_expansion.isList()) {
                        remhash(dead_reln, $canon_expansion_ht$.getGlobalValue());
                        final SubLObject v_clauses = Mapping.mapcar(symbol_function(FIRST), canon_expansion);
                        SubLObject cdolist_list_var;
                        final SubLObject constants = cdolist_list_var = cycl_utilities.constant_list(v_clauses, UNPROVIDED);
                        SubLObject constant = NIL;
                        constant = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != contraction_relevant_constant_p(constant)) {
                                final SubLObject relns = gethash(constant, $contraction_constant_ht$.getGlobalValue(), UNPROVIDED);
                                if (relns.equal(list(dead_reln))) {
                                    remhash(constant, $contraction_constant_ht$.getGlobalValue());
                                } else {
                                    sethash(constant, $contraction_constant_ht$.getGlobalValue(), delete(dead_reln, relns, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            constant = cdolist_list_var.first();
                        } 
                        remhash(dead_reln, $contraction_checksum_ht$.getGlobalValue());
                    }
                } finally {
                    czer_vars.$control_4$.rebind(_prev_bind_3, thread);
                    wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_2, thread);
                    czer_vars.$reify_skolemsP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject sync_contraction_ht_to_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_num = ZERO_INTEGER;
        if (NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject expansion_formulas = kb_mapping.gather_predicate_extent_index($$expansion, UNPROVIDED, UNPROVIDED);
                if (NIL != expansion_formulas) {
                    final SubLObject len = result_num = length(expansion_formulas);
                    $canon_expansion_ht$.setGlobalValue(make_hash_table(len, symbol_function(EQL), UNPROVIDED));
                    $contraction_constant_ht$.setGlobalValue(make_hash_table(len, symbol_function(EQL), UNPROVIDED));
                    $contraction_checksum_ht$.setGlobalValue(make_hash_table(len, symbol_function(EQL), UNPROVIDED));
                    list_utilities.nmapcar(symbol_function(ADD_ASSERTION_TO_CONTRACTION_HT), expansion_formulas);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result_num;
    }

    public static SubLObject highest_generic_arg_num(final SubLObject formula) {
        final SubLObject numbers = Mapping.mapcar(symbol_function(GENERIC_ARG_NUM), list_utilities.tree_gather(formula, symbol_function(GENERIC_ARG_P), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL != numbers ? apply(symbol_function(MAX), numbers) : ZERO_INTEGER;
    }

    public static SubLObject check_temp_skolem_variables(final SubLObject bindings_list, final SubLObject highest_legit_num) {
        if (bindings_list.isList() && bindings_list.first().isList()) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = bindings_list.first();
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((binding.isList() && (NIL != variables.variable_p(binding.first()))) && variables.variable_id(binding.first()).numLE(highest_legit_num)) {
                    result = cons(binding, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
            return list(nreverse(result));
        }
        return NIL;
    }

    public static SubLObject replace_skolem_args_with_variables(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_skolem = copy_tree(skolem);
        rplaca(new_skolem.rest(), at_utilities.get_generic_arg($current_generic_arg_num$.getDynamicValue(thread)));
        $current_generic_arg_num$.setDynamicValue(add($current_generic_arg_num$.getDynamicValue(thread), ONE_INTEGER), thread);
        return new_skolem;
    }

    public static SubLObject contraction_candidates(final SubLObject formula) {
        final SubLObject constants = cycl_utilities.constant_list(formula, UNPROVIDED);
        final SubLObject temp_hash = make_hash_table(hash_table_count($contraction_checksum_ht$.getGlobalValue()), symbol_function(EQL), UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = constants;
        SubLObject constant = NIL;
        constant = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = gethash(constant, $contraction_constant_ht$.getGlobalValue(), UNPROVIDED);
            SubLObject reln = NIL;
            reln = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject sum = gethash(reln, temp_hash, UNPROVIDED);
                sethash(reln, temp_hash, sum.isInteger() ? add(sum, ONE_INTEGER) : ONE_INTEGER);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                reln = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            constant = cdolist_list_var.first();
        } 
        SubLObject reln2 = NIL;
        SubLObject checksum = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(temp_hash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                reln2 = getEntryKey(cdohash_entry);
                checksum = getEntryValue(cdohash_entry);
                if (checksum.eql(gethash(reln2, $contraction_checksum_ht$.getGlobalValue(), UNPROVIDED))) {
                    result = cons(reln2, result);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }

    public static SubLObject el_contraction(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue(thread)) {
            if (NIL == contraction_hts_validP()) {
                sync_contraction_ht_to_kb();
            }
            final SubLObject canon_formula = canonicalize_expansion(formula, mt);
            if (canon_formula.isCons()) {
                final SubLObject canon_formula_clauses = Mapping.mapcar(symbol_function(FIRST), canon_formula);
                final SubLObject canon_formula_blists = Mapping.mapcar(symbol_function(SECOND), canon_formula);
                final SubLObject relns = contraction_candidates(canon_formula_clauses);
                if ((NIL != relns) && (NIL == result)) {
                    SubLObject csome_list_var = relns;
                    SubLObject reln = NIL;
                    reln = csome_list_var.first();
                    while ((NIL == result) && (NIL != csome_list_var)) {
                        final SubLObject canon_expansion = gethash(reln, $canon_expansion_ht$.getGlobalValue(), UNPROVIDED);
                        if ((NIL != canon_expansion) && canon_expansion.isList()) {
                            final SubLObject canon_expansion_clauses = Mapping.mapcar(symbol_function(FIRST), canon_expansion);
                            final SubLObject v_bindings = generic_arg_unify(canon_expansion_clauses, canon_formula_clauses, canon_formula_blists);
                            if (((NIL != v_bindings) && (NIL != list_utilities.proper_list_p(v_bindings))) && (NIL != list_utilities.proper_list_p(v_bindings.first()))) {
                                SubLObject arg_list_vars = NIL;
                                SubLObject errorP = NIL;
                                SubLObject cdolist_list_var = v_bindings.first();
                                SubLObject binding = NIL;
                                binding = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != list_utilities.dotted_list_p(binding)) {
                                        rplaca(binding, at_utilities.generic_arg_num(binding.first()));
                                        if (binding.first().isInteger()) {
                                            arg_list_vars = cons(binding, arg_list_vars);
                                        } else {
                                            errorP = T;
                                        }
                                    } else {
                                        errorP = T;
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    binding = cdolist_list_var.first();
                                } 
                                if (NIL == errorP) {
                                    final SubLObject sorted_arg_list_terms = Mapping.mapcar(symbol_function(CDR), Sort.sort(arg_list_vars, symbol_function($sym28$_), symbol_function(CAR)));
                                    result = make_formula(reln, sorted_arg_list_terms, UNPROVIDED);
                                }
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        reln = csome_list_var.first();
                    } 
                }
            }
        }
        return values(NIL != result ? result : formula, list_utilities.sublisp_boolean(result));
    }

    public static SubLObject declare_tersifier_file() {
        declareFunction(me, "tersify_cycl", "TERSIFY-CYCL", 1, 2, false);
        declareFunction(me, "contraction_hts_validP", "CONTRACTION-HTS-VALID?", 0, 0, false);
        declareFunction(me, "contraction_relevant_constant_p", "CONTRACTION-RELEVANT-CONSTANT-P", 1, 0, false);
        declareFunction(me, "generic_arg_to_hl_var", "GENERIC-ARG-TO-HL-VAR", 1, 0, false);
        declareFunction(me, "hl_var_to_generic_arg", "HL-VAR-TO-GENERIC-ARG", 1, 0, false);
        declareFunction(me, "clauses_hl_vars_to_el_vars", "CLAUSES-HL-VARS-TO-EL-VARS", 1, 1, false);
        declareFunction(me, "var_name_conflictsP", "VAR-NAME-CONFLICTS?", 1, 0, false);
        declareFunction(me, "generic_arg_unify", "GENERIC-ARG-UNIFY", 3, 0, false);
        declareFunction(me, "expansion_clauseP", "EXPANSION-CLAUSE?", 1, 0, false);
        declareFunction(me, "canonicalize_expansion", "CANONICALIZE-EXPANSION", 2, 0, false);
        declareFunction(me, "add_assertion_to_contraction_ht", "ADD-ASSERTION-TO-CONTRACTION-HT", 1, 0, false);
        declareFunction(me, "remove_assertion_from_contraction_ht", "REMOVE-ASSERTION-FROM-CONTRACTION-HT", 1, 0, false);
        declareFunction(me, "sync_contraction_ht_to_kb", "SYNC-CONTRACTION-HT-TO-KB", 0, 0, false);
        declareFunction(me, "highest_generic_arg_num", "HIGHEST-GENERIC-ARG-NUM", 1, 0, false);
        declareFunction(me, "check_temp_skolem_variables", "CHECK-TEMP-SKOLEM-VARIABLES", 2, 0, false);
        declareFunction(me, "replace_skolem_args_with_variables", "REPLACE-SKOLEM-ARGS-WITH-VARIABLES", 1, 0, false);
        declareFunction(me, "contraction_candidates", "CONTRACTION-CANDIDATES", 1, 0, false);
        declareFunction(me, "el_contraction", "EL-CONTRACTION", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_tersifier_file() {
        deflexical("*CONSTANTS-TO-IGNORE-FOR-CONTRACTION-HT*", $list2);
        deflexical("*CONTRACTION-CONSTANT-HT*", SubLTrampolineFile.maybeDefault($contraction_constant_ht$, $contraction_constant_ht$, NIL));
        deflexical("*CONTRACTION-CHECKSUM-HT*", SubLTrampolineFile.maybeDefault($contraction_checksum_ht$, $contraction_checksum_ht$, NIL));
        deflexical("*CANON-EXPANSION-HT*", SubLTrampolineFile.maybeDefault($canon_expansion_ht$, $canon_expansion_ht$, NIL));
        defparameter("*CURRENT-GENERIC-ARG-NUM*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_tersifier_file() {
        declare_defglobal($contraction_constant_ht$);
        declare_defglobal($contraction_checksum_ht$);
        declare_defglobal($canon_expansion_ht$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_tersifier_file();
    }

    @Override
    public void initializeVariables() {
        init_tersifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tersifier_file();
    }

    
}

/**
 * Total time: 104 ms
 */
