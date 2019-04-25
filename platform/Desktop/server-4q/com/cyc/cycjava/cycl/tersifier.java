package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tersifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.tersifier";
    public static final String myFingerPrint = "9f7631c3f5c86576d05e4d3476735d7fca51a53af0151dcbf3061ce5dc930bda";
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 1253L)
    private static SubLSymbol $constants_to_ignore_for_contraction_ht$;
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 1526L)
    private static SubLSymbol $contraction_constant_ht$;
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 1781L)
    private static SubLSymbol $contraction_checksum_ht$;
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 2042L)
    private static SubLSymbol $canon_expansion_ht$;
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 3962L)
    private static SubLSymbol $current_generic_arg_num$;
    private static final SubLSymbol $sym0$EL_FORMULA_P;
    private static final SubLSymbol $sym1$EL_CONTRACTION;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_CONTRACTION_CONSTANT_HT_;
    private static final SubLSymbol $sym4$_CONTRACTION_CHECKSUM_HT_;
    private static final SubLSymbol $sym5$_CANON_EXPANSION_HT_;
    private static final SubLSymbol $sym6$EL_VAR_;
    private static final SubLSymbol $sym7$VARIABLE_P;
    private static final SubLSymbol $sym8$DEFAULT_EL_VAR_FOR_HL_VAR;
    private static final SubLSymbol $sym9$UNREIFIED_SKOLEM_TERM_;
    private static final SubLSymbol $sym10$REPLACE_SKOLEM_ARGS_WITH_VARIABLES;
    private static final SubLSymbol $sym11$GENERIC_ARG_P;
    private static final SubLSymbol $sym12$GENERIC_ARG_TO_HL_VAR;
    private static final SubLSymbol $sym13$HL_VAR_TO_GENERIC_ARG;
    private static final SubLSymbol $sym14$DEFAULT_EL_VAR_;
    private static final SubLSymbol $sym15$HL_VAR_FOR_DEFAULT_EL_VAR;
    private static final SubLObject $const16$expansion;
    private static final SubLSymbol $sym17$FIRST;
    private static final SubLSymbol $sym18$KBEQ;
    private static final SubLObject $const19$True;
    private static final SubLObject $const20$False;
    private static final SubLSymbol $sym21$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const22$EverythingPSC;
    private static final SubLSymbol $sym23$ADD_ASSERTION_TO_CONTRACTION_HT;
    private static final SubLSymbol $sym24$GENERIC_ARG_NUM;
    private static final SubLSymbol $sym25$MAX;
    private static final SubLSymbol $sym26$SECOND;
    private static final SubLSymbol $sym27$CDR;
    private static final SubLSymbol $sym28$_;
    private static final SubLSymbol $sym29$CAR;
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 721L)
    public static SubLObject tersify_cycl(final SubLObject formula, SubLObject mt, SubLObject settings) {
        if (mt == tersifier.UNPROVIDED) {
            mt = (SubLObject)tersifier.NIL;
        }
        if (settings == tersifier.UNPROVIDED) {
            settings = (SubLObject)tersifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert tersifier.NIL != el_utilities.el_formula_p(formula) : formula;
        thread.resetMultipleValues();
        SubLObject contracted_formula = el_contraction(formula, mt);
        final SubLObject changedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (tersifier.NIL == changedP) {
            contracted_formula = el_utilities.map_formula_terms(Symbols.symbol_function((SubLObject)tersifier.$sym1$EL_CONTRACTION), formula, (SubLObject)tersifier.UNPROVIDED);
        }
        return contracted_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 2256L)
    public static SubLObject contraction_hts_validP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(tersifier.NIL != tersifier.$canon_expansion_ht$.getGlobalValue() && tersifier.NIL != tersifier.$contraction_constant_ht$.getGlobalValue() && tersifier.NIL != tersifier.$contraction_checksum_ht$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 2562L)
    public static SubLObject contraction_relevant_constant_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tersifier.NIL != constant_handles.constant_p(v_object) && tersifier.NIL == subl_promotions.memberP(v_object, tersifier.$constants_to_ignore_for_contraction_ht$.getGlobalValue(), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 2727L)
    public static SubLObject generic_arg_to_hl_var(final SubLObject generic_arg) {
        return variables.get_variable(at_utilities.generic_arg_num(generic_arg));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 2945L)
    public static SubLObject hl_var_to_generic_arg(final SubLObject hl_var) {
        return at_utilities.get_generic_arg(variables.variable_id(hl_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 3116L)
    public static SubLObject clauses_hl_vars_to_el_vars(final SubLObject v_clauses, SubLObject blists) {
        if (blists == tersifier.UNPROVIDED) {
            blists = (SubLObject)tersifier.NIL;
        }
        SubLObject new_clauses = (SubLObject)tersifier.NIL;
        SubLObject clause_list = (SubLObject)tersifier.NIL;
        SubLObject clause = (SubLObject)tersifier.NIL;
        SubLObject blist_list = (SubLObject)tersifier.NIL;
        SubLObject blist = (SubLObject)tersifier.NIL;
        clause_list = v_clauses;
        clause = clause_list.first();
        blist_list = blists;
        blist = blist_list.first();
        while (tersifier.NIL != clause_list) {
            SubLObject cdolist_list_var = blist;
            SubLObject binding = (SubLObject)tersifier.NIL;
            binding = cdolist_list_var.first();
            while (tersifier.NIL != cdolist_list_var) {
                conses_high.nsubst(binding.first(), binding.rest(), clause, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
            new_clauses = (SubLObject)ConsesLow.cons(clause, new_clauses);
            clause_list = clause_list.rest();
            clause = clause_list.first();
            blist_list = blist_list.rest();
            blist = blist_list.first();
        }
        return Sequences.nreverse(new_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 3577L)
    public static SubLObject var_name_conflictsP(final SubLObject formula) {
        final SubLObject el_vars = list_utilities.tree_gather(formula, Symbols.symbol_function((SubLObject)tersifier.$sym6$EL_VAR_), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED);
        final SubLObject hl_vars = list_utilities.tree_gather(formula, Symbols.symbol_function((SubLObject)tersifier.$sym7$VARIABLE_P), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(tersifier.NIL != conses_high.nintersection(el_vars, Mapping.mapcar(Symbols.symbol_function((SubLObject)tersifier.$sym8$DEFAULT_EL_VAR_FOR_HL_VAR), hl_vars), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 4014L)
    public static SubLObject generic_arg_unify(final SubLObject generic_arg_template, final SubLObject v_object, final SubLObject object_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tersifier.NIL != var_name_conflictsP(generic_arg_template)) {
            return (SubLObject)tersifier.NIL;
        }
        SubLObject result = (SubLObject)tersifier.NIL;
        final SubLObject highest_num = highest_generic_arg_num(generic_arg_template);
        final SubLObject _prev_bind_0 = tersifier.$current_generic_arg_num$.currentBinding(thread);
        try {
            tersifier.$current_generic_arg_num$.bind(Numbers.add((SubLObject)tersifier.ONE_INTEGER, highest_num), thread);
            final SubLObject unification_template = transform_list_utilities.ntransform(transform_list_utilities.ntransform(transform_list_utilities.transform(generic_arg_template, Symbols.symbol_function((SubLObject)tersifier.$sym9$UNREIFIED_SKOLEM_TERM_), Symbols.symbol_function((SubLObject)tersifier.$sym10$REPLACE_SKOLEM_ARGS_WITH_VARIABLES), (SubLObject)tersifier.UNPROVIDED), Symbols.symbol_function((SubLObject)tersifier.$sym7$VARIABLE_P), Symbols.symbol_function((SubLObject)tersifier.$sym8$DEFAULT_EL_VAR_FOR_HL_VAR), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED), Symbols.symbol_function((SubLObject)tersifier.$sym11$GENERIC_ARG_P), Symbols.symbol_function((SubLObject)tersifier.$sym12$GENERIC_ARG_TO_HL_VAR), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED);
            final SubLObject opaque_object = clauses_hl_vars_to_el_vars(v_object, object_bindings);
            result = check_temp_skolem_variables(unification_utilities.unify_clauses(unification_template, opaque_object, (SubLObject)tersifier.T, (SubLObject)tersifier.UNPROVIDED), highest_num);
        }
        finally {
            tersifier.$current_generic_arg_num$.rebind(_prev_bind_0, thread);
        }
        return transform_list_utilities.ntransform(transform_list_utilities.ntransform(result, Symbols.symbol_function((SubLObject)tersifier.$sym7$VARIABLE_P), Symbols.symbol_function((SubLObject)tersifier.$sym13$HL_VAR_TO_GENERIC_ARG), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED), Symbols.symbol_function((SubLObject)tersifier.$sym14$DEFAULT_EL_VAR_), Symbols.symbol_function((SubLObject)tersifier.$sym15$HL_VAR_FOR_DEFAULT_EL_VAR), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 5008L)
    public static SubLObject expansion_clauseP(final SubLObject clause) {
        final SubLObject expansion_neglits = clauses.neg_lits(clause);
        final SubLObject expansion_poslits = clauses.pos_lits(clause);
        final SubLObject expansion_poslit = expansion_poslits.first();
        return (SubLObject)SubLObjectFactory.makeBoolean(tersifier.NIL == expansion_neglits && tersifier.NIL != list_utilities.singletonP(expansion_poslits) && tersifier.NIL != el_utilities.el_binary_formula_p(expansion_poslit) && tersifier.NIL != kb_utilities.kbeq(tersifier.$const16$expansion, cycl_utilities.formula_arg0(expansion_poslit)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 6244L)
    public static SubLObject canonicalize_expansion(final SubLObject expansion, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)tersifier.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$add_term_of_unit_litsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$reify_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
        try {
            czer_vars.$add_term_of_unit_litsP$.bind((SubLObject)tersifier.NIL, thread);
            czer_vars.$reify_skolemsP$.bind((SubLObject)tersifier.NIL, thread);
            wff_vars.$permit_generic_arg_variablesP$.bind((SubLObject)tersifier.T, thread);
            czer_vars.$canonicalize_variablesP$.bind((SubLObject)tersifier.NIL, thread);
            result = czer_main.canonicalize_cycl(expansion, mt);
        }
        finally {
            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_4, thread);
            wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_3, thread);
            czer_vars.$reify_skolemsP$.rebind(_prev_bind_2, thread);
            czer_vars.$add_term_of_unit_litsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 6598L)
    public static SubLObject add_assertion_to_contraction_ht(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tersifier.NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue(thread)) {
            if (tersifier.NIL == contraction_hts_validP()) {
                sync_contraction_ht_to_kb();
            }
            final SubLObject expansion_clause = assertions_high.assertion_cnf(assertion);
            final SubLObject expansion_mt = assertions_high.assertion_mt(assertion);
            if (tersifier.NIL != expansion_clauseP(expansion_clause)) {
                thread.resetMultipleValues();
                final SubLObject hash_dollar_expansion = el_utilities.unmake_binary_formula(clauses.pos_lits(expansion_clause).first());
                final SubLObject new_reln = thread.secondMultipleValue();
                final SubLObject expansion = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject canon_expansion = canonicalize_expansion(expansion, expansion_mt);
                if (tersifier.NIL == cycl_grammar.cycl_truth_value_p(canon_expansion) && canon_expansion.isList()) {
                    Hashtables.sethash(new_reln, tersifier.$canon_expansion_ht$.getGlobalValue(), canon_expansion);
                    final SubLObject v_clauses = Mapping.mapcar(Symbols.symbol_function((SubLObject)tersifier.$sym17$FIRST), canon_expansion);
                    final SubLObject constants = cycl_utilities.constant_list(v_clauses, (SubLObject)tersifier.UNPROVIDED);
                    SubLObject num_relevant_constants = (SubLObject)tersifier.ZERO_INTEGER;
                    SubLObject cdolist_list_var = constants;
                    SubLObject constant = (SubLObject)tersifier.NIL;
                    constant = cdolist_list_var.first();
                    while (tersifier.NIL != cdolist_list_var) {
                        if (tersifier.NIL != contraction_relevant_constant_p(constant)) {
                            num_relevant_constants = Numbers.add(num_relevant_constants, (SubLObject)tersifier.ONE_INTEGER);
                            SubLObject relns = Hashtables.gethash(constant, tersifier.$contraction_constant_ht$.getGlobalValue(), (SubLObject)tersifier.UNPROVIDED);
                            final SubLObject item_var = new_reln;
                            if (tersifier.NIL == conses_high.member(item_var, relns, Symbols.symbol_function((SubLObject)tersifier.$sym18$KBEQ), Symbols.symbol_function((SubLObject)tersifier.IDENTITY))) {
                                relns = (SubLObject)ConsesLow.cons(item_var, relns);
                            }
                            Hashtables.sethash(constant, tersifier.$contraction_constant_ht$.getGlobalValue(), relns);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        constant = cdolist_list_var.first();
                    }
                    Hashtables.sethash(new_reln, tersifier.$contraction_checksum_ht$.getGlobalValue(), num_relevant_constants);
                }
            }
        }
        return (SubLObject)tersifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 8353L)
    public static SubLObject remove_assertion_from_contraction_ht(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tersifier.NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue(thread)) {
            if (tersifier.NIL == contraction_hts_validP()) {
                sync_contraction_ht_to_kb();
            }
            final SubLObject expansion_clause = assertions_high.assertion_cnf(assertion);
            final SubLObject expansion_mt = assertions_high.assertion_mt(assertion);
            if (tersifier.NIL != expansion_clauseP(expansion_clause)) {
                thread.resetMultipleValues();
                final SubLObject hash_dollar_expansion = el_utilities.unmake_binary_formula(clauses.pos_lits(expansion_clause).first());
                final SubLObject dead_reln = thread.secondMultipleValue();
                final SubLObject expansion = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0 = czer_vars.$reify_skolemsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = czer_vars.$control_4$.currentBinding(thread);
                try {
                    czer_vars.$reify_skolemsP$.bind((SubLObject)tersifier.NIL, thread);
                    wff_vars.$permit_generic_arg_variablesP$.bind((SubLObject)tersifier.T, thread);
                    czer_vars.$control_4$.bind((SubLObject)tersifier.T, thread);
                    final SubLObject canon_expansion = czer_main.canonicalize_cycl(expansion, expansion_mt);
                    if (tersifier.NIL == kb_utilities.kbeq(tersifier.$const19$True, canon_expansion) && tersifier.NIL == kb_utilities.kbeq(tersifier.$const20$False, canon_expansion) && canon_expansion.isList()) {
                        Hashtables.remhash(dead_reln, tersifier.$canon_expansion_ht$.getGlobalValue());
                        final SubLObject v_clauses = Mapping.mapcar(Symbols.symbol_function((SubLObject)tersifier.$sym17$FIRST), canon_expansion);
                        SubLObject cdolist_list_var;
                        final SubLObject constants = cdolist_list_var = cycl_utilities.constant_list(v_clauses, (SubLObject)tersifier.UNPROVIDED);
                        SubLObject constant = (SubLObject)tersifier.NIL;
                        constant = cdolist_list_var.first();
                        while (tersifier.NIL != cdolist_list_var) {
                            if (tersifier.NIL != contraction_relevant_constant_p(constant)) {
                                final SubLObject relns = Hashtables.gethash(constant, tersifier.$contraction_constant_ht$.getGlobalValue(), (SubLObject)tersifier.UNPROVIDED);
                                if (relns.equal((SubLObject)ConsesLow.list(dead_reln))) {
                                    Hashtables.remhash(constant, tersifier.$contraction_constant_ht$.getGlobalValue());
                                }
                                else {
                                    Hashtables.sethash(constant, tersifier.$contraction_constant_ht$.getGlobalValue(), Sequences.delete(dead_reln, relns, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED));
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            constant = cdolist_list_var.first();
                        }
                        Hashtables.remhash(dead_reln, tersifier.$contraction_checksum_ht$.getGlobalValue());
                    }
                }
                finally {
                    czer_vars.$control_4$.rebind(_prev_bind_3, thread);
                    wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_2, thread);
                    czer_vars.$reify_skolemsP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)tersifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 10084L)
    public static SubLObject sync_contraction_ht_to_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_num = (SubLObject)tersifier.ZERO_INTEGER;
        if (tersifier.NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tersifier.$sym21$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(tersifier.$const22$EverythingPSC, thread);
                final SubLObject expansion_formulas = kb_mapping.gather_predicate_extent_index(tersifier.$const16$expansion, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED);
                if (tersifier.NIL != expansion_formulas) {
                    final SubLObject len = result_num = Sequences.length(expansion_formulas);
                    tersifier.$canon_expansion_ht$.setGlobalValue(Hashtables.make_hash_table(len, Symbols.symbol_function((SubLObject)tersifier.EQL), (SubLObject)tersifier.UNPROVIDED));
                    tersifier.$contraction_constant_ht$.setGlobalValue(Hashtables.make_hash_table(len, Symbols.symbol_function((SubLObject)tersifier.EQL), (SubLObject)tersifier.UNPROVIDED));
                    tersifier.$contraction_checksum_ht$.setGlobalValue(Hashtables.make_hash_table(len, Symbols.symbol_function((SubLObject)tersifier.EQL), (SubLObject)tersifier.UNPROVIDED));
                    list_utilities.nmapcar(Symbols.symbol_function((SubLObject)tersifier.$sym23$ADD_ASSERTION_TO_CONTRACTION_HT), expansion_formulas);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result_num;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 10961L)
    public static SubLObject highest_generic_arg_num(final SubLObject formula) {
        final SubLObject numbers = Mapping.mapcar(Symbols.symbol_function((SubLObject)tersifier.$sym24$GENERIC_ARG_NUM), list_utilities.tree_gather(formula, Symbols.symbol_function((SubLObject)tersifier.$sym11$GENERIC_ARG_P), (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED, (SubLObject)tersifier.UNPROVIDED));
        return (SubLObject)((tersifier.NIL != numbers) ? Functions.apply(Symbols.symbol_function((SubLObject)tersifier.$sym25$MAX), numbers) : tersifier.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 11189L)
    public static SubLObject check_temp_skolem_variables(final SubLObject bindings_list, final SubLObject highest_legit_num) {
        if (bindings_list.isList() && bindings_list.first().isList()) {
            SubLObject result = (SubLObject)tersifier.NIL;
            SubLObject cdolist_list_var = bindings_list.first();
            SubLObject binding = (SubLObject)tersifier.NIL;
            binding = cdolist_list_var.first();
            while (tersifier.NIL != cdolist_list_var) {
                if (binding.isList() && tersifier.NIL != variables.variable_p(binding.first()) && variables.variable_id(binding.first()).numLE(highest_legit_num)) {
                    result = (SubLObject)ConsesLow.cons(binding, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.list(Sequences.nreverse(result));
        }
        return (SubLObject)tersifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 11677L)
    public static SubLObject replace_skolem_args_with_variables(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_skolem = conses_high.copy_tree(skolem);
        ConsesLow.rplaca(new_skolem.rest(), at_utilities.get_generic_arg(tersifier.$current_generic_arg_num$.getDynamicValue(thread)));
        tersifier.$current_generic_arg_num$.setDynamicValue(Numbers.add(tersifier.$current_generic_arg_num$.getDynamicValue(thread), (SubLObject)tersifier.ONE_INTEGER), thread);
        return new_skolem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 11962L)
    public static SubLObject contraction_candidates(final SubLObject formula) {
        final SubLObject constants = cycl_utilities.constant_list(formula, (SubLObject)tersifier.UNPROVIDED);
        final SubLObject temp_hash = Hashtables.make_hash_table(Hashtables.hash_table_count(tersifier.$contraction_checksum_ht$.getGlobalValue()), Symbols.symbol_function((SubLObject)tersifier.EQL), (SubLObject)tersifier.UNPROVIDED);
        SubLObject result = (SubLObject)tersifier.NIL;
        SubLObject cdolist_list_var = constants;
        SubLObject constant = (SubLObject)tersifier.NIL;
        constant = cdolist_list_var.first();
        while (tersifier.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = Hashtables.gethash(constant, tersifier.$contraction_constant_ht$.getGlobalValue(), (SubLObject)tersifier.UNPROVIDED);
            SubLObject reln = (SubLObject)tersifier.NIL;
            reln = cdolist_list_var_$1.first();
            while (tersifier.NIL != cdolist_list_var_$1) {
                final SubLObject sum = Hashtables.gethash(reln, temp_hash, (SubLObject)tersifier.UNPROVIDED);
                Hashtables.sethash(reln, temp_hash, (SubLObject)(sum.isInteger() ? Numbers.add(sum, (SubLObject)tersifier.ONE_INTEGER) : tersifier.ONE_INTEGER));
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                reln = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            constant = cdolist_list_var.first();
        }
        SubLObject reln2 = (SubLObject)tersifier.NIL;
        SubLObject checksum = (SubLObject)tersifier.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(temp_hash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                reln2 = Hashtables.getEntryKey(cdohash_entry);
                checksum = Hashtables.getEntryValue(cdohash_entry);
                if (checksum.eql(Hashtables.gethash(reln2, tersifier.$contraction_checksum_ht$.getGlobalValue(), (SubLObject)tersifier.UNPROVIDED))) {
                    result = (SubLObject)ConsesLow.cons(reln2, result);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tersifier.lisp", position = 12743L)
    public static SubLObject el_contraction(final SubLObject formula, SubLObject mt) {
        if (mt == tersifier.UNPROVIDED) {
            mt = (SubLObject)tersifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)tersifier.NIL;
        if (tersifier.NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue(thread)) {
            if (tersifier.NIL == contraction_hts_validP()) {
                sync_contraction_ht_to_kb();
            }
            final SubLObject canon_formula = canonicalize_expansion(formula, mt);
            if (canon_formula.isCons()) {
                final SubLObject canon_formula_clauses = Mapping.mapcar(Symbols.symbol_function((SubLObject)tersifier.$sym17$FIRST), canon_formula);
                final SubLObject canon_formula_blists = Mapping.mapcar(Symbols.symbol_function((SubLObject)tersifier.$sym26$SECOND), canon_formula);
                final SubLObject relns = contraction_candidates(canon_formula_clauses);
                if (tersifier.NIL != relns && tersifier.NIL == result) {
                    SubLObject csome_list_var = relns;
                    SubLObject reln = (SubLObject)tersifier.NIL;
                    reln = csome_list_var.first();
                    while (tersifier.NIL == result && tersifier.NIL != csome_list_var) {
                        final SubLObject canon_expansion = Hashtables.gethash(reln, tersifier.$canon_expansion_ht$.getGlobalValue(), (SubLObject)tersifier.UNPROVIDED);
                        if (tersifier.NIL != canon_expansion && canon_expansion.isList()) {
                            final SubLObject canon_expansion_clauses = Mapping.mapcar(Symbols.symbol_function((SubLObject)tersifier.$sym17$FIRST), canon_expansion);
                            final SubLObject v_bindings = generic_arg_unify(canon_expansion_clauses, canon_formula_clauses, canon_formula_blists);
                            if (tersifier.NIL != v_bindings && tersifier.NIL != list_utilities.proper_list_p(v_bindings) && tersifier.NIL != list_utilities.proper_list_p(v_bindings.first())) {
                                SubLObject arg_list_vars = (SubLObject)tersifier.NIL;
                                SubLObject errorP = (SubLObject)tersifier.NIL;
                                SubLObject cdolist_list_var = v_bindings.first();
                                SubLObject binding = (SubLObject)tersifier.NIL;
                                binding = cdolist_list_var.first();
                                while (tersifier.NIL != cdolist_list_var) {
                                    if (tersifier.NIL != list_utilities.dotted_list_p(binding)) {
                                        ConsesLow.rplaca(binding, at_utilities.generic_arg_num(binding.first()));
                                        if (binding.first().isInteger()) {
                                            arg_list_vars = (SubLObject)ConsesLow.cons(binding, arg_list_vars);
                                        }
                                        else {
                                            errorP = (SubLObject)tersifier.T;
                                        }
                                    }
                                    else {
                                        errorP = (SubLObject)tersifier.T;
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    binding = cdolist_list_var.first();
                                }
                                if (tersifier.NIL == errorP) {
                                    final SubLObject sorted_arg_list_terms = Mapping.mapcar(Symbols.symbol_function((SubLObject)tersifier.$sym27$CDR), Sort.sort(arg_list_vars, Symbols.symbol_function((SubLObject)tersifier.$sym28$_), Symbols.symbol_function((SubLObject)tersifier.$sym29$CAR)));
                                    result = el_utilities.make_formula(reln, sorted_arg_list_terms, (SubLObject)tersifier.UNPROVIDED);
                                }
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        reln = csome_list_var.first();
                    }
                }
            }
        }
        return Values.values((tersifier.NIL != result) ? result : formula, list_utilities.sublisp_boolean(result));
    }
    
    public static SubLObject declare_tersifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "tersify_cycl", "TERSIFY-CYCL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "contraction_hts_validP", "CONTRACTION-HTS-VALID?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "contraction_relevant_constant_p", "CONTRACTION-RELEVANT-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "generic_arg_to_hl_var", "GENERIC-ARG-TO-HL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "hl_var_to_generic_arg", "HL-VAR-TO-GENERIC-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "clauses_hl_vars_to_el_vars", "CLAUSES-HL-VARS-TO-EL-VARS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "var_name_conflictsP", "VAR-NAME-CONFLICTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "generic_arg_unify", "GENERIC-ARG-UNIFY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "expansion_clauseP", "EXPANSION-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "canonicalize_expansion", "CANONICALIZE-EXPANSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "add_assertion_to_contraction_ht", "ADD-ASSERTION-TO-CONTRACTION-HT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "remove_assertion_from_contraction_ht", "REMOVE-ASSERTION-FROM-CONTRACTION-HT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "sync_contraction_ht_to_kb", "SYNC-CONTRACTION-HT-TO-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "highest_generic_arg_num", "HIGHEST-GENERIC-ARG-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "check_temp_skolem_variables", "CHECK-TEMP-SKOLEM-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "replace_skolem_args_with_variables", "REPLACE-SKOLEM-ARGS-WITH-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "contraction_candidates", "CONTRACTION-CANDIDATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tersifier", "el_contraction", "EL-CONTRACTION", 1, 1, false);
        return (SubLObject)tersifier.NIL;
    }
    
    public static SubLObject init_tersifier_file() {
        tersifier.$constants_to_ignore_for_contraction_ht$ = SubLFiles.deflexical("*CONSTANTS-TO-IGNORE-FOR-CONTRACTION-HT*", (SubLObject)tersifier.$list2);
        tersifier.$contraction_constant_ht$ = SubLFiles.deflexical("*CONTRACTION-CONSTANT-HT*", (SubLObject)(maybeDefault((SubLObject)tersifier.$sym3$_CONTRACTION_CONSTANT_HT_, tersifier.$contraction_constant_ht$, tersifier.NIL)));
        tersifier.$contraction_checksum_ht$ = SubLFiles.deflexical("*CONTRACTION-CHECKSUM-HT*", (SubLObject)(maybeDefault((SubLObject)tersifier.$sym4$_CONTRACTION_CHECKSUM_HT_, tersifier.$contraction_checksum_ht$, tersifier.NIL)));
        tersifier.$canon_expansion_ht$ = SubLFiles.deflexical("*CANON-EXPANSION-HT*", (SubLObject)(maybeDefault((SubLObject)tersifier.$sym5$_CANON_EXPANSION_HT_, tersifier.$canon_expansion_ht$, tersifier.NIL)));
        tersifier.$current_generic_arg_num$ = SubLFiles.defparameter("*CURRENT-GENERIC-ARG-NUM*", (SubLObject)tersifier.ZERO_INTEGER);
        return (SubLObject)tersifier.NIL;
    }
    
    public static SubLObject setup_tersifier_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)tersifier.$sym3$_CONTRACTION_CONSTANT_HT_);
        subl_macro_promotions.declare_defglobal((SubLObject)tersifier.$sym4$_CONTRACTION_CHECKSUM_HT_);
        subl_macro_promotions.declare_defglobal((SubLObject)tersifier.$sym5$_CANON_EXPANSION_HT_);
        return (SubLObject)tersifier.NIL;
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
    
    static {
        me = (SubLFile)new tersifier();
        tersifier.$constants_to_ignore_for_contraction_ht$ = null;
        tersifier.$contraction_constant_ht$ = null;
        tersifier.$contraction_checksum_ht$ = null;
        tersifier.$canon_expansion_ht$ = null;
        tersifier.$current_generic_arg_num$ = null;
        $sym0$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym1$EL_CONTRACTION = SubLObjectFactory.makeSymbol("EL-CONTRACTION");
        $list2 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")));
        $sym3$_CONTRACTION_CONSTANT_HT_ = SubLObjectFactory.makeSymbol("*CONTRACTION-CONSTANT-HT*");
        $sym4$_CONTRACTION_CHECKSUM_HT_ = SubLObjectFactory.makeSymbol("*CONTRACTION-CHECKSUM-HT*");
        $sym5$_CANON_EXPANSION_HT_ = SubLObjectFactory.makeSymbol("*CANON-EXPANSION-HT*");
        $sym6$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym7$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym8$DEFAULT_EL_VAR_FOR_HL_VAR = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
        $sym9$UNREIFIED_SKOLEM_TERM_ = SubLObjectFactory.makeSymbol("UNREIFIED-SKOLEM-TERM?");
        $sym10$REPLACE_SKOLEM_ARGS_WITH_VARIABLES = SubLObjectFactory.makeSymbol("REPLACE-SKOLEM-ARGS-WITH-VARIABLES");
        $sym11$GENERIC_ARG_P = SubLObjectFactory.makeSymbol("GENERIC-ARG-P");
        $sym12$GENERIC_ARG_TO_HL_VAR = SubLObjectFactory.makeSymbol("GENERIC-ARG-TO-HL-VAR");
        $sym13$HL_VAR_TO_GENERIC_ARG = SubLObjectFactory.makeSymbol("HL-VAR-TO-GENERIC-ARG");
        $sym14$DEFAULT_EL_VAR_ = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR?");
        $sym15$HL_VAR_FOR_DEFAULT_EL_VAR = SubLObjectFactory.makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR");
        $const16$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $sym17$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym18$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $const19$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const20$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $sym21$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const22$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym23$ADD_ASSERTION_TO_CONTRACTION_HT = SubLObjectFactory.makeSymbol("ADD-ASSERTION-TO-CONTRACTION-HT");
        $sym24$GENERIC_ARG_NUM = SubLObjectFactory.makeSymbol("GENERIC-ARG-NUM");
        $sym25$MAX = SubLObjectFactory.makeSymbol("MAX");
        $sym26$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym27$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym28$_ = SubLObjectFactory.makeSymbol("<");
        $sym29$CAR = SubLObjectFactory.makeSymbol("CAR");
    }
}

/*

	Total time: 104 ms
	
*/