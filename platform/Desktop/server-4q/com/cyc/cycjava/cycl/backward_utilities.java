package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class backward_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.backward_utilities";
    public static final String myFingerPrint = "5b334b45c18a83f24240e844d6c4bc21b6e7188fd0915d99a7d0e8272064dbd0";
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 756L)
    public static SubLSymbol $inference_recursive_query_overhead$;
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 1088L)
    private static SubLSymbol $directions_for_forward_inference$;
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 1268L)
    private static SubLSymbol $directions_for_backward_inference$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$ASSERTION_P;
    private static final SubLSymbol $sym3$VARIABLE_P;
    private static final SubLObject $const4$isa;
    private static final SubLObject $const5$genls;
    private static final SubLObject $const6$TheList;
    private static final SubLList $list7;
    private static final SubLObject $const8$abnormal;
    private static final SubLSymbol $kw9$NEG;
    private static final SubLSymbol $kw10$POS;
    private static final SubLSymbol $sym11$LISTP;
    private static final SubLSymbol $sym12$INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$INFERENCE_MAKE_COMMUTATIVE_LITERAL;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CYC_VAR_;
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 865L)
    public static SubLObject rule_relevant_to_proof(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(backward_utilities.NIL == control_vars.$proof_checking_enabled$.getDynamicValue(thread) || backward_utilities.NIL != conses_high.member(assertion, control_vars.$proof_checker_rules$.getDynamicValue(thread), (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 1356L)
    public static SubLObject relevant_directions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (backward_utilities.NIL != kb_control_vars.within_forward_inferenceP() && backward_utilities.NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread)) {
            return backward_utilities.$directions_for_forward_inference$.getGlobalValue();
        }
        return backward_utilities.$directions_for_backward_inference$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 1646L)
    public static SubLObject direction_is_relevant(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert backward_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        if (backward_utilities.NIL != kb_control_vars.within_forward_inferenceP() && backward_utilities.NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread)) {
            return conses_high.member(direction, backward_utilities.$directions_for_forward_inference$.getGlobalValue(), (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED);
        }
        return conses_high.member(direction, backward_utilities.$directions_for_backward_inference$.getGlobalValue(), (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 2082L)
    public static SubLObject duplicate_literal_cleanup(SubLObject literals, SubLObject exclude_set) {
        if (exclude_set == backward_utilities.UNPROVIDED) {
            exclude_set = (SubLObject)backward_utilities.NIL;
        }
        if (backward_utilities.NIL != literals) {
            literals = Sequences.delete_duplicates(literals, Symbols.symbol_function((SubLObject)backward_utilities.EQUAL), (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED);
            if (backward_utilities.NIL != exclude_set) {
                literals = conses_high.nset_difference(literals, exclude_set, Symbols.symbol_function((SubLObject)backward_utilities.EQUAL), (SubLObject)backward_utilities.UNPROVIDED);
            }
            return literals;
        }
        return (SubLObject)backward_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 2426L)
    public static SubLObject additional_source_variable_pos_lits(final SubLObject literal, final SubLObject dependent_dnf, final SubLObject support) {
        final SubLObject literal_vars = list_utilities.tree_gather(literal, Symbols.symbol_function((SubLObject)backward_utilities.$sym3$VARIABLE_P), (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED);
        SubLObject unintroduced_literal_vars = (SubLObject)backward_utilities.NIL;
        if (backward_utilities.NIL == literal_vars) {
            return (SubLObject)backward_utilities.NIL;
        }
        SubLObject cdolist_list_var = literal_vars;
        SubLObject literal_var = (SubLObject)backward_utilities.NIL;
        literal_var = cdolist_list_var.first();
        while (backward_utilities.NIL != cdolist_list_var) {
            if (backward_utilities.NIL == list_utilities.tree_find(literal_var, dependent_dnf, (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED)) {
                unintroduced_literal_vars = (SubLObject)ConsesLow.cons(literal_var, unintroduced_literal_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal_var = cdolist_list_var.first();
        }
        if (backward_utilities.NIL == unintroduced_literal_vars) {
            return (SubLObject)backward_utilities.NIL;
        }
        SubLObject support_cnf = (SubLObject)backward_utilities.NIL;
        SubLObject additional_pos_lits = (SubLObject)backward_utilities.NIL;
        if (backward_utilities.NIL != assertion_handles.assertion_p(support)) {
            final SubLObject cnf = assertions_high.assertion_cnf(support);
            support_cnf = ((backward_utilities.NIL != clause_utilities.neg_atomic_clause_p(cnf)) ? clause_utilities.make_gaf_cnf(clauses.neg_lits(cnf).first()) : cnf);
        }
        else {
            support_cnf = clause_utilities.make_gaf_cnf(literal);
        }
        SubLObject cdolist_list_var2 = unintroduced_literal_vars;
        SubLObject unintroduced_literal_var = (SubLObject)backward_utilities.NIL;
        unintroduced_literal_var = cdolist_list_var2.first();
        while (backward_utilities.NIL != cdolist_list_var2) {
            if (backward_utilities.NIL != list_utilities.tree_find(unintroduced_literal_var, support_cnf, (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED)) {
                final SubLObject some_additional_pos_lits = constraint_sentences_for_transformation_variable(unintroduced_literal_var, support_cnf);
                additional_pos_lits = ConsesLow.nconc(some_additional_pos_lits, additional_pos_lits);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            unintroduced_literal_var = cdolist_list_var2.first();
        }
        return Sequences.nreverse(additional_pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 3890L)
    public static SubLObject constraint_sentences_for_transformation_variable(final SubLObject var, final SubLObject support_cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject additional_pos_lits = (SubLObject)backward_utilities.NIL;
        final SubLObject isa_constraints = genls.min_cols(at_var_types.cnf_variable_isa_constraints(var, support_cnf, mt_relevance_macros.$mt$.getDynamicValue(thread)), (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED);
        final SubLObject genl_constraints = genls.min_cols(at_var_types.cnf_variable_genl_constraints(var, support_cnf, mt_relevance_macros.$mt$.getDynamicValue(thread)), (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject isa_constraint = (SubLObject)backward_utilities.NIL;
        isa_constraint = cdolist_list_var.first();
        while (backward_utilities.NIL != cdolist_list_var) {
            additional_pos_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(backward_utilities.$const4$isa, var, isa_constraint), additional_pos_lits);
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        }
        cdolist_list_var = genl_constraints;
        SubLObject genl_constraint = (SubLObject)backward_utilities.NIL;
        genl_constraint = cdolist_list_var.first();
        while (backward_utilities.NIL != cdolist_list_var) {
            additional_pos_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(backward_utilities.$const5$genls, var, genl_constraint), additional_pos_lits);
            cdolist_list_var = cdolist_list_var.rest();
            genl_constraint = cdolist_list_var.first();
        }
        if (backward_utilities.NIL == isa_constraints && backward_utilities.NIL == genl_constraints) {
            if (backward_utilities.NIL != el_utilities.occurs_as_sequence_variable_in_clauseP(var, support_cnf)) {
                additional_pos_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(backward_utilities.$const4$isa, reader.bq_cons(backward_utilities.$const6$TheList, var), (SubLObject)backward_utilities.$list7), additional_pos_lits);
            }
            if (backward_utilities.NIL != el_utilities.occurs_as_term_variable_in_clauseP(var, support_cnf)) {
                additional_pos_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(backward_utilities.$const4$isa, var, (SubLObject)backward_utilities.$list7), additional_pos_lits);
            }
        }
        return Sequences.nreverse(additional_pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 4856L)
    public static SubLObject inference_backchain_impossible(final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)backward_utilities.UNPROVIDED);
        if (backward_utilities.NIL == forts.fort_p(predicate)) {
            return (SubLObject)backward_utilities.NIL;
        }
        if (backward_utilities.NIL != inference_trampolines.inference_backchain_forbiddenP(predicate, mt)) {
            return (SubLObject)backward_utilities.T;
        }
        if (backward_utilities.$const4$isa.eql(predicate)) {
            if (backward_utilities.NIL != control_vars.$hl_failure_backchaining$.getDynamicValue(thread) || backward_utilities.NIL != control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread)) {
                return (SubLObject)backward_utilities.NIL;
            }
            final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)backward_utilities.UNPROVIDED);
            if (backward_utilities.NIL != forts.fort_p(arg2) && backward_utilities.NIL != inference_trampolines.inference_collection_backchain_encouragedP(arg2, mt)) {
                return (SubLObject)backward_utilities.NIL;
            }
            return (SubLObject)backward_utilities.T;
        }
        else {
            if (backward_utilities.NIL != hl_supports.hl_predicate_p(predicate)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(backward_utilities.NIL == control_vars.$hl_failure_backchaining$.getDynamicValue(thread));
            }
            if (backward_utilities.NIL != inference_trampolines.inference_evaluatable_predicateP(predicate)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(backward_utilities.NIL == control_vars.$evaluatable_backchain_enabled$.getDynamicValue(thread));
            }
            if (predicate.eql(backward_utilities.$const8$abnormal)) {
                return Equality.eq((SubLObject)backward_utilities.$kw9$NEG, sense);
            }
            if (kb_indexing.num_predicate_rule_index(predicate, (SubLObject)backward_utilities.$kw10$POS, (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED).isPositive() || kb_indexing.num_predicate_rule_index(predicate, (SubLObject)backward_utilities.$kw9$NEG, (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED).isPositive() || backward_utilities.NIL != inference_trampolines.inference_some_spec_pred_or_inverseP(predicate) || backward_utilities.NIL != inference_trampolines.inference_some_genl_pred_or_inverseP(predicate)) {
                return (SubLObject)backward_utilities.NIL;
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(backward_utilities.NIL == control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 6124L)
    public static SubLObject transformation_backchain_for_predicateP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(backward_utilities.NIL != forts.fort_p(predicate) && (backward_utilities.NIL != control_vars.$hl_failure_backchaining$.getDynamicValue(thread) || backward_utilities.NIL == hl_supports.hl_predicate_p(predicate)) && (backward_utilities.NIL != control_vars.$evaluatable_backchain_enabled$.getDynamicValue(thread) || backward_utilities.NIL == inference_trampolines.inference_evaluatable_predicateP(predicate)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 6506L)
    public static SubLObject inference_canonicalize_hl_support_asent(final SubLObject asent) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (backward_utilities.NIL == inference_trampolines.inference_commutative_relationP(predicate)) {
            return asent;
        }
        return inference_make_commutative_asent(predicate, cycl_utilities.atomic_sentence_args(asent, (SubLObject)backward_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7016L)
    public static SubLObject inference_make_commutative_asent(final SubLObject predicate, SubLObject args) {
        assert backward_utilities.NIL != Types.listp(args) : args;
        args = inference_canonicalize_commutative_args(args);
        return reader.bq_cons(predicate, ConsesLow.append(args, (SubLObject)backward_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7203L)
    public static SubLObject inference_canonicalize_commutative_args(final SubLObject args) {
        assert backward_utilities.NIL != Types.listp(args) : args;
        return kb_utilities.sort_terms(args, (SubLObject)backward_utilities.T, (SubLObject)backward_utilities.NIL, (SubLObject)backward_utilities.NIL, (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED, (SubLObject)backward_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7330L)
    public static SubLObject inference_canonicalize_hl_support_literal(final SubLObject asent) {
        return inference_canonicalize_hl_support_asent(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7513L)
    public static SubLObject inference_make_commutative_literal(final SubLObject predicate, final SubLObject args) {
        return inference_make_commutative_asent(predicate, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7693L)
    public static SubLObject inference_term_free_variables(final SubLObject v_term) {
        if (backward_utilities.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)backward_utilities.$sym3$VARIABLE_P), v_term, (SubLObject)backward_utilities.UNPROVIDED)) {
            return (SubLObject)backward_utilities.NIL;
        }
        return temp_term_free_variables(v_term, Symbols.symbol_function((SubLObject)backward_utilities.$sym3$VARIABLE_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7886L)
    public static SubLObject inference_literal_free_variables(final SubLObject literal) {
        if (backward_utilities.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)backward_utilities.$sym3$VARIABLE_P), literal, (SubLObject)backward_utilities.UNPROVIDED)) {
            return (SubLObject)backward_utilities.NIL;
        }
        return el_utilities.literal_free_variables(literal, (SubLObject)backward_utilities.NIL, Symbols.symbol_function((SubLObject)backward_utilities.$sym3$VARIABLE_P), (SubLObject)backward_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8092L)
    public static SubLObject inference_clause_free_variables(final SubLObject clause) {
        if (backward_utilities.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)backward_utilities.$sym3$VARIABLE_P), clause, (SubLObject)backward_utilities.UNPROVIDED)) {
            return (SubLObject)backward_utilities.NIL;
        }
        return clause_utilities.clause_free_variables(clause, Symbols.symbol_function((SubLObject)backward_utilities.$sym3$VARIABLE_P), (SubLObject)backward_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8289L)
    public static SubLObject temp_term_free_variables(final SubLObject function_expression, SubLObject varP) {
        if (varP == backward_utilities.UNPROVIDED) {
            varP = (SubLObject)backward_utilities.$sym16$CYC_VAR_;
        }
        if (backward_utilities.NIL != el_utilities.el_relation_expressionP(function_expression)) {
            return el_utilities.literal_free_variables(function_expression, (SubLObject)backward_utilities.NIL, varP, (SubLObject)backward_utilities.UNPROVIDED);
        }
        return (SubLObject)backward_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8501L)
    public static SubLObject inference_closed_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(backward_utilities.NIL != forts.fort_p(v_term) || (v_term.isAtom() && backward_utilities.NIL == variables.variable_p(v_term)) || backward_utilities.NIL == inference_term_free_variables(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8729L)
    public static SubLObject inference_closed_literalP(final SubLObject literal) {
        return Types.sublisp_null(inference_literal_free_variables(literal));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8861L)
    public static SubLObject inference_closed_clauseP(final SubLObject clause) {
        return Types.sublisp_null(inference_clause_free_variables(clause));
    }
    
    public static SubLObject declare_backward_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "rule_relevant_to_proof", "RULE-RELEVANT-TO-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "relevant_directions", "RELEVANT-DIRECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "direction_is_relevant", "DIRECTION-IS-RELEVANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "duplicate_literal_cleanup", "DUPLICATE-LITERAL-CLEANUP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "additional_source_variable_pos_lits", "ADDITIONAL-SOURCE-VARIABLE-POS-LITS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "constraint_sentences_for_transformation_variable", "CONSTRAINT-SENTENCES-FOR-TRANSFORMATION-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_backchain_impossible", "INFERENCE-BACKCHAIN-IMPOSSIBLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "transformation_backchain_for_predicateP", "TRANSFORMATION-BACKCHAIN-FOR-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_canonicalize_hl_support_asent", "INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_make_commutative_asent", "INFERENCE-MAKE-COMMUTATIVE-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_canonicalize_commutative_args", "INFERENCE-CANONICALIZE-COMMUTATIVE-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_canonicalize_hl_support_literal", "INFERENCE-CANONICALIZE-HL-SUPPORT-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_make_commutative_literal", "INFERENCE-MAKE-COMMUTATIVE-LITERAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_term_free_variables", "INFERENCE-TERM-FREE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_literal_free_variables", "INFERENCE-LITERAL-FREE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_clause_free_variables", "INFERENCE-CLAUSE-FREE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "temp_term_free_variables", "TEMP-TERM-FREE-VARIABLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_closed_termP", "INFERENCE-CLOSED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_closed_literalP", "INFERENCE-CLOSED-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_utilities", "inference_closed_clauseP", "INFERENCE-CLOSED-CLAUSE?", 1, 0, false);
        return (SubLObject)backward_utilities.NIL;
    }
    
    public static SubLObject init_backward_utilities_file() {
        backward_utilities.$inference_recursive_query_overhead$ = SubLFiles.defparameter("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*", (SubLObject)backward_utilities.TWENTY_INTEGER);
        backward_utilities.$directions_for_forward_inference$ = SubLFiles.deflexical("*DIRECTIONS-FOR-FORWARD-INFERENCE*", (SubLObject)backward_utilities.$list0);
        backward_utilities.$directions_for_backward_inference$ = SubLFiles.deflexical("*DIRECTIONS-FOR-BACKWARD-INFERENCE*", (SubLObject)backward_utilities.$list1);
        return (SubLObject)backward_utilities.NIL;
    }
    
    public static SubLObject setup_backward_utilities_file() {
        access_macros.define_obsolete_register((SubLObject)backward_utilities.$sym12$INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL, (SubLObject)backward_utilities.$list13);
        access_macros.define_obsolete_register((SubLObject)backward_utilities.$sym14$INFERENCE_MAKE_COMMUTATIVE_LITERAL, (SubLObject)backward_utilities.$list15);
        return (SubLObject)backward_utilities.NIL;
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
    
    static {
        me = (SubLFile)new backward_utilities();
        backward_utilities.$inference_recursive_query_overhead$ = null;
        backward_utilities.$directions_for_forward_inference$ = null;
        backward_utilities.$directions_for_backward_inference$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $sym2$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym3$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $const4$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const5$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const6$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $const8$abnormal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $kw9$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw10$POS = SubLObjectFactory.makeKeyword("POS");
        $sym11$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym12$INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL = SubLObjectFactory.makeSymbol("INFERENCE-CANONICALIZE-HL-SUPPORT-LITERAL");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT"));
        $sym14$INFERENCE_MAKE_COMMUTATIVE_LITERAL = SubLObjectFactory.makeSymbol("INFERENCE-MAKE-COMMUTATIVE-LITERAL");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-MAKE-COMMUTATIVE-ASENT"));
        $sym16$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
    }
}

/*

	Total time: 178 ms
	
*/