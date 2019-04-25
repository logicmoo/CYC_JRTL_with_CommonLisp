package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_type_shifting extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_type_shifting";
    public static final String myFingerPrint = "891f382bab3f0b84ee54a610743b32f0859c6e11ea22e5a4c9e94ad6675e1420";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 3004L)
    private static SubLSymbol $typeshift_microseconds$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 10419L)
    private static SubLSymbol $typeshift_doomed_vars$;
    private static final SubLObject $const0$TypeShiftingRLModule;
    private static final SubLList $list1;
    private static final SubLObject $const2$typeLevelVersionInArg;
    private static final SubLSymbol $kw3$TRUE;
    private static final SubLSymbol $sym4$ISA_VAR_COL_ASENT_;
    private static final SubLSymbol $sym5$PRED_HAS_SOME_TLVIA_ASSERTIONS_SOMEWHERE_;
    private static final SubLInteger $int6$2500;
    private static final SubLSymbol $kw7$EXCISE;
    private static final SubLSymbol $kw8$NEG;
    private static final SubLObject $const9$trueSentence;
    private static final SubLObject $const10$True;
    private static final SubLSymbol $kw11$POS;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$UNREIFIED_SKOLEM_TERM_WITH_DOOMED_VARS_;
    private static final SubLSymbol $sym14$EXCISE_DOOMED_VARS_FROM_UNREIFIED_SKOLEM_TERM;
    private static final SubLSymbol $sym15$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym16$GAF_ARG2;
    private static final SubLObject $const17$forAll;
    private static final SubLObject $const18$thereExists;
    private static final SubLSymbol $kw19$IGNORE;
    private static final SubLSymbol $sym20$UNREIFIED_SKOLEM_OR_DEFAULT_OPAQUE_ARG_;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 1834L)
    public static SubLObject isa_var_col_asentP(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_type_shifting.NIL != el_utilities.isa_litP(asent) && reformulator_module_type_shifting.NIL != cycl_variables.el_varP(cycl_utilities.sentence_arg1(asent, (SubLObject)reformulator_module_type_shifting.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 1963L)
    public static SubLObject pred_has_some_tlvia_assertions_somewhereP(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return some_tlvia_assertions_somewhereP(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 2133L)
    public static SubLObject some_tlvia_assertions_somewhereP(final SubLObject pred) {
        return somewhere_cache.some_pred_assertion_somewhereP(reformulator_module_type_shifting.$const2$typeLevelVersionInArg, pred, (SubLObject)reformulator_module_type_shifting.ONE_INTEGER, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 2263L)
    public static SubLObject some_tlvia_assertionsP(final SubLObject pred, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_type_shifting.NIL != some_tlvia_assertions_somewhereP(pred) && reformulator_module_type_shifting.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(pred, reformulator_module_type_shifting.$const2$typeLevelVersionInArg, mt, (SubLObject)reformulator_module_type_shifting.ONE_INTEGER, (SubLObject)reformulator_module_type_shifting.$kw3$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 2449L)
    public static SubLObject typeshift_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_type_shifting.NIL != clauses.clauses_p(expression)) {
            SubLObject cdolist_list_var = expression;
            SubLObject clause = (SubLObject)reformulator_module_type_shifting.NIL;
            clause = cdolist_list_var.first();
            while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
                if (reformulator_module_type_shifting.NIL != typeshift_clause_requiredP(clause, mt)) {
                    return (SubLObject)reformulator_module_type_shifting.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
        }
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 2687L)
    public static SubLObject typeshift_clause_requiredP(final SubLObject clause, final SubLObject mt) {
        final SubLObject neglits = clauses.neg_lits(clause);
        final SubLObject poslits = clauses.pos_lits(clause);
        if (reformulator_module_type_shifting.NIL != poslits && reformulator_module_type_shifting.NIL != neglits && reformulator_module_type_shifting.NIL != list_utilities.any_in_list((SubLObject)reformulator_module_type_shifting.$sym4$ISA_VAR_COL_ASENT_, neglits, (SubLObject)reformulator_module_type_shifting.UNPROVIDED) && reformulator_module_type_shifting.NIL != list_utilities.any_in_list((SubLObject)reformulator_module_type_shifting.$sym5$PRED_HAS_SOME_TLVIA_ASSERTIONS_SOMEWHERE_, poslits, (SubLObject)reformulator_module_type_shifting.UNPROVIDED)) {
            return (SubLObject)reformulator_module_type_shifting.T;
        }
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 3067L)
    public static SubLObject typeshift_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_type_shifting.$typeshift_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 3192L)
    public static SubLObject typeshift_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject new_clauses = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject list_var = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject clause = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject clause_num = (SubLObject)reformulator_module_type_shifting.NIL;
        list_var = expression;
        clause = list_var.first();
        for (clause_num = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL == new_clauses && reformulator_module_type_shifting.NIL != list_var; list_var = list_var.rest(), clause = list_var.first(), clause_num = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, clause_num)) {
            if (reformulator_module_type_shifting.NIL != typeshift_clause_requiredP(clause, mt)) {
                new_clauses = typeshift_reformulate_wrt_clause(expression, clause_num, mt, settings);
            }
        }
        if (reformulator_module_type_shifting.NIL != new_clauses) {
            return Values.values(new_clauses, (SubLObject)reformulator_module_type_shifting.T);
        }
        return Values.values(expression, (SubLObject)reformulator_module_type_shifting.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 3639L)
    public static SubLObject typeshift_reformulate_wrt_clause(final SubLObject v_clauses, final SubLObject clause_num, final SubLObject mt, final SubLObject settings) {
        SubLObject result_clauses = (SubLObject)reformulator_module_type_shifting.NIL;
        final SubLObject clause = ConsesLow.nth(clause_num, v_clauses);
        final SubLObject poslits = clauses.pos_lits(clause);
        SubLObject list_var = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject target_poslit = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject target_poslit_num = (SubLObject)reformulator_module_type_shifting.NIL;
        list_var = poslits;
        target_poslit = list_var.first();
        for (target_poslit_num = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL != list_var; list_var = list_var.rest(), target_poslit = list_var.first(), target_poslit_num = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, target_poslit_num)) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(target_poslit);
            if (reformulator_module_type_shifting.NIL != forts.fort_p(pred) && reformulator_module_type_shifting.NIL != some_tlvia_assertionsP(pred, mt) && reformulator_module_type_shifting.NIL == tlvia_ambiguity_violationP(pred)) {
                SubLObject cdolist_list_var = possible_type_preds_for_pred(pred, mt);
                SubLObject type_pred = (SubLObject)reformulator_module_type_shifting.NIL;
                type_pred = cdolist_list_var.first();
                while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
                    result_clauses = typeshift_reformulate_wrt_clause_int(v_clauses, clause_num, mt, target_poslit_num, type_pred);
                    if (reformulator_module_type_shifting.NIL != result_clauses) {
                        return result_clauses;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    type_pred = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 4348L)
    public static SubLObject typeshift_reformulate_wrt_clause_int(final SubLObject v_clauses, final SubLObject clause_num, final SubLObject mt, final SubLObject target_poslit_num, final SubLObject type_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target_clause = ConsesLow.nth(clause_num, v_clauses);
        final SubLObject target_poslit = ConsesLow.nth(target_poslit_num, clauses.pos_lits(target_clause));
        final SubLObject info_list = typeshift_clause_info_list(v_clauses, mt, type_pred, target_poslit, clause_num, target_poslit_num);
        if (reformulator_module_type_shifting.NIL != info_list) {
            SubLObject result_clauses = (SubLObject)reformulator_module_type_shifting.NIL;
            final SubLObject smitten_vars = set.new_set(Symbols.symbol_function((SubLObject)reformulator_module_type_shifting.EQL), (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject new_target_clause = typeshift_reformulate_clause(v_clauses, clause_num, mt, info_list, type_pred, target_poslit, target_poslit_num);
            final SubLObject curr_smitten_vars = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_type_shifting.NIL != new_target_clause) {
                SubLObject cdolist_list_var = curr_smitten_vars;
                SubLObject smitten_var = (SubLObject)reformulator_module_type_shifting.NIL;
                smitten_var = cdolist_list_var.first();
                while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
                    set.set_add(smitten_var, smitten_vars);
                    cdolist_list_var = cdolist_list_var.rest();
                    smitten_var = cdolist_list_var.first();
                }
                SubLObject cdotimes_end_var;
                SubLObject num;
                SubLObject new_clause;
                SubLObject new_smitten_vars;
                SubLObject cdolist_list_var2;
                SubLObject smitten_var2;
                for (cdotimes_end_var = Sequences.length(v_clauses), num = (SubLObject)reformulator_module_type_shifting.NIL, num = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; num.numL(cdotimes_end_var); num = Numbers.add(num, (SubLObject)reformulator_module_type_shifting.ONE_INTEGER)) {
                    if (num.numE(clause_num)) {
                        result_clauses = (SubLObject)ConsesLow.cons(new_target_clause, result_clauses);
                    }
                    else {
                        thread.resetMultipleValues();
                        new_clause = typeshift_reformulate_clause(v_clauses, num, mt, info_list, type_pred, target_poslit, (SubLObject)reformulator_module_type_shifting.NIL);
                        new_smitten_vars = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (reformulator_module_type_shifting.NIL == new_clause) {
                            return (SubLObject)reformulator_module_type_shifting.NIL;
                        }
                        if (!new_clause.eql((SubLObject)reformulator_module_type_shifting.$kw7$EXCISE)) {
                            cdolist_list_var2 = new_smitten_vars;
                            smitten_var2 = (SubLObject)reformulator_module_type_shifting.NIL;
                            smitten_var2 = cdolist_list_var2.first();
                            while (reformulator_module_type_shifting.NIL != cdolist_list_var2) {
                                set.set_add(smitten_var2, smitten_vars);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                smitten_var2 = cdolist_list_var2.first();
                            }
                            result_clauses = (SubLObject)ConsesLow.cons(new_clause, result_clauses);
                        }
                    }
                }
            }
            if (reformulator_module_type_shifting.NIL != doomed_vars_smittenP(smitten_vars, result_clauses)) {
                result_clauses = Sequences.nreverse(result_clauses);
                return result_clauses;
            }
        }
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 5694L)
    public static SubLObject typeshift_reformulate_clause(final SubLObject v_clauses, final SubLObject clause_num, final SubLObject mt, final SubLObject info_list, final SubLObject type_pred, final SubLObject target_poslit, final SubLObject target_poslit_num) {
        final SubLObject clause = ConsesLow.nth(clause_num, v_clauses);
        final SubLObject neglits = clauses.neg_lits(clause);
        final SubLObject poslits = clauses.pos_lits(clause);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(target_poslit);
        final SubLObject sense = sense_for_pred_and_type_pred(pred, type_pred, mt);
        final SubLObject doomed_vars = vars_to_be_excised(target_poslit, info_list);
        SubLObject new_neglits = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject new_poslits = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject list_var = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject neglit = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject neglit_num = (SubLObject)reformulator_module_type_shifting.NIL;
        list_var = neglits;
        neglit = list_var.first();
        for (neglit_num = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL != list_var; list_var = list_var.rest(), neglit = list_var.first(), neglit_num = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, neglit_num)) {
            if (sense.eql((SubLObject)reformulator_module_type_shifting.$kw8$NEG) && reformulator_module_type_shifting.NIL != isa_var_lit_to_be_excisedP(v_clauses, sense, clause_num, neglit_num, info_list)) {
                new_neglits = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(reformulator_module_type_shifting.$const9$trueSentence, reformulator_module_type_shifting.$const10$True), new_neglits);
            }
            else {
                final SubLObject new_neglit = excise_dependent_skolem_vars(neglit, doomed_vars);
                new_neglits = (SubLObject)ConsesLow.cons(new_neglit, new_neglits);
            }
        }
        new_neglits = Sequences.nreverse(new_neglits);
        list_var = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject poslit = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject poslit_num = (SubLObject)reformulator_module_type_shifting.NIL;
        list_var = poslits;
        poslit = list_var.first();
        for (poslit_num = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL != list_var; list_var = list_var.rest(), poslit = list_var.first(), poslit_num = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, poslit_num)) {
            if (poslit_num.eql(target_poslit_num)) {
                final SubLObject new_target_poslit = excise_dependent_skolem_vars(typeshift_reformulate_target_poslit(v_clauses, sense, clause_num, target_poslit_num, type_pred, info_list), doomed_vars);
                if (reformulator_module_type_shifting.NIL == new_target_poslit) {
                    return Values.values((SubLObject)reformulator_module_type_shifting.NIL, (SubLObject)reformulator_module_type_shifting.NIL);
                }
                new_poslits = (SubLObject)ConsesLow.cons(new_target_poslit, new_poslits);
            }
            else if (sense.eql((SubLObject)reformulator_module_type_shifting.$kw11$POS) && reformulator_module_type_shifting.NIL != isa_var_lit_to_be_excisedP(v_clauses, sense, clause_num, poslit_num, info_list)) {
                new_poslits = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(reformulator_module_type_shifting.$const9$trueSentence, reformulator_module_type_shifting.$const10$True), new_poslits);
            }
            else {
                final SubLObject new_poslit = excise_dependent_skolem_vars(poslit, doomed_vars);
                new_poslits = (SubLObject)ConsesLow.cons(new_poslit, new_poslits);
            }
        }
        new_poslits = Sequences.nreverse(new_poslits);
        final SubLObject new_clause = clauses.make_cnf(new_neglits, new_poslits);
        return Values.values(new_clause, doomed_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 7536L)
    public static SubLObject doomed_vars_smittenP(final SubLObject doomed_vars, final SubLObject expression) {
        final SubLObject set_contents_var = set.do_set_internal(doomed_vars);
        SubLObject basis_object;
        SubLObject state;
        SubLObject doomed_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)reformulator_module_type_shifting.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); reformulator_module_type_shifting.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            doomed_var = set_contents.do_set_contents_next(basis_object, state);
            if (reformulator_module_type_shifting.NIL != set_contents.do_set_contents_element_validP(state, doomed_var) && reformulator_module_type_shifting.NIL != cycl_utilities.expression_find(doomed_var, expression, (SubLObject)reformulator_module_type_shifting.UNPROVIDED, (SubLObject)reformulator_module_type_shifting.UNPROVIDED, (SubLObject)reformulator_module_type_shifting.UNPROVIDED)) {
                return (SubLObject)reformulator_module_type_shifting.NIL;
            }
        }
        return (SubLObject)reformulator_module_type_shifting.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 7714L)
    public static SubLObject typeshift_reformulate_target_poslit(final SubLObject v_clauses, final SubLObject sense, final SubLObject target_poslit_clause_num, final SubLObject target_poslit_lit_num, final SubLObject type_pred, final SubLObject info_list) {
        final SubLObject target_clause = ConsesLow.nth(target_poslit_clause_num, v_clauses);
        final SubLObject poslits = clauses.pos_lits(target_clause);
        SubLObject result;
        final SubLObject target_poslit = result = ConsesLow.nth(target_poslit_lit_num, poslits);
        result = el_utilities.replace_formula_arg((SubLObject)reformulator_module_type_shifting.ZERO_INTEGER, type_pred, result);
        SubLObject cdolist_list_var = info_list;
        SubLObject info = (SubLObject)reformulator_module_type_shifting.NIL;
        info = cdolist_list_var.first();
        while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
            final SubLObject isa_clause_num = typeshift_info_isa_clause_num(info);
            final SubLObject isa_clause = ConsesLow.nth(isa_clause_num, v_clauses);
            final SubLObject isa_lit_num = typeshift_info_isa_lit_num(info);
            final SubLObject isa_lit = clauses.clause_literal(isa_clause, sense, isa_lit_num);
            final SubLObject col = cycl_utilities.sentence_arg2(isa_lit, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
            final SubLObject type_pred_argnum = typeshift_info_type_pred_argnum(info);
            result = el_utilities.replace_formula_arg(type_pred_argnum, col, result);
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 8540L)
    public static SubLObject typeshift_clause_info_list(final SubLObject v_clauses, final SubLObject mt, final SubLObject type_pred, final SubLObject target_poslit, final SubLObject target_poslit_clause_num, final SubLObject target_poslit_lit_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(target_poslit);
        final SubLObject sense = sense_for_pred_and_type_pred(pred, type_pred, mt);
        final SubLObject argnum_pairs = tlvia_argnum_pairs_for_pred_and_type_pred(pred, type_pred, mt);
        SubLObject info_list = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject cdolist_list_var = argnum_pairs;
        SubLObject argnum_pair = (SubLObject)reformulator_module_type_shifting.NIL;
        argnum_pair = cdolist_list_var.first();
        while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = argnum_pair;
            SubLObject pred_argnum = (SubLObject)reformulator_module_type_shifting.NIL;
            SubLObject type_pred_argnum = (SubLObject)reformulator_module_type_shifting.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_type_shifting.$list12);
            pred_argnum = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_type_shifting.$list12);
            type_pred_argnum = current.first();
            current = current.rest();
            if (reformulator_module_type_shifting.NIL == current) {
                SubLObject this_arg_okP = (SubLObject)reformulator_module_type_shifting.NIL;
                SubLObject var = cycl_utilities.sentence_arg(target_poslit, pred_argnum, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
                if ((reformulator_module_type_shifting.$kw8$NEG.eql(sense) && reformulator_module_type_shifting.NIL != cycl_variables.el_varP(var)) || (reformulator_module_type_shifting.$kw11$POS.eql(sense) && reformulator_module_type_shifting.NIL != term.unreified_skolem_termP(var))) {
                    if (reformulator_module_type_shifting.$kw11$POS.eql(sense) && reformulator_module_type_shifting.NIL != term.unreified_skolem_termP(var)) {
                        var = skolems.skolem_function_var(var);
                    }
                    thread.resetMultipleValues();
                    final SubLObject isa_clause_num = isa_x_col_asent_pos(v_clauses, sense, var);
                    final SubLObject isa_lit_num = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_module_type_shifting.NIL != isa_clause_num && reformulator_module_type_shifting.NIL != isa_lit_num && reformulator_module_type_shifting.NIL != appears_nowhere_but(v_clauses, var, isa_clause_num, isa_lit_num, sense, target_poslit_clause_num, target_poslit_lit_num, pred_argnum)) {
                        this_arg_okP = (SubLObject)reformulator_module_type_shifting.T;
                        info_list = (SubLObject)ConsesLow.cons(make_typeshift_info(pred_argnum, type_pred_argnum, isa_clause_num, isa_lit_num), info_list);
                    }
                }
                if (reformulator_module_type_shifting.NIL == this_arg_okP) {
                    return (SubLObject)reformulator_module_type_shifting.NIL;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reformulator_module_type_shifting.$list12);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argnum_pair = cdolist_list_var.first();
        }
        return info_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 9926L)
    public static SubLObject make_typeshift_info(final SubLObject pred_argnum, final SubLObject type_pred_argnum, final SubLObject isa_clause_num, final SubLObject isa_lit_num) {
        return (SubLObject)ConsesLow.list(pred_argnum, type_pred_argnum, isa_clause_num, isa_lit_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 10117L)
    public static SubLObject typeshift_info_pred_argnum(final SubLObject info) {
        return info.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 10190L)
    public static SubLObject typeshift_info_type_pred_argnum(final SubLObject info) {
        return conses_high.second(info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 10269L)
    public static SubLObject typeshift_info_isa_clause_num(final SubLObject info) {
        return conses_high.third(info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 10345L)
    public static SubLObject typeshift_info_isa_lit_num(final SubLObject info) {
        return conses_high.fourth(info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 10471L)
    public static SubLObject excise_dependent_skolem_vars(final SubLObject asent, final SubLObject doomed_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_module_type_shifting.NIL;
        final SubLObject _prev_bind_0 = reformulator_module_type_shifting.$typeshift_doomed_vars$.currentBinding(thread);
        try {
            reformulator_module_type_shifting.$typeshift_doomed_vars$.bind(doomed_vars, thread);
            result = cycl_utilities.expression_transform(asent, (SubLObject)reformulator_module_type_shifting.$sym13$UNREIFIED_SKOLEM_TERM_WITH_DOOMED_VARS_, (SubLObject)reformulator_module_type_shifting.$sym14$EXCISE_DOOMED_VARS_FROM_UNREIFIED_SKOLEM_TERM, (SubLObject)reformulator_module_type_shifting.NIL, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
        }
        finally {
            reformulator_module_type_shifting.$typeshift_doomed_vars$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 10766L)
    public static SubLObject unreified_skolem_term_with_doomed_varsP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_type_shifting.NIL != term.unreified_skolem_termP(v_term) && reformulator_module_type_shifting.NIL != keyhash_utilities.fast_intersection(skolems.skolem_function_dependent_vars(v_term), reformulator_module_type_shifting.$typeshift_doomed_vars$.getDynamicValue(thread), (SubLObject)reformulator_module_type_shifting.UNPROVIDED, (SubLObject)reformulator_module_type_shifting.UNPROVIDED, (SubLObject)reformulator_module_type_shifting.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 10964L)
    public static SubLObject excise_doomed_vars_from_unreified_skolem_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dependent_vars = skolems.skolem_function_dependent_vars(v_term);
        final SubLObject new_dependent_vars = list_utilities.fast_set_difference(dependent_vars, reformulator_module_type_shifting.$typeshift_doomed_vars$.getDynamicValue(thread), (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
        final SubLObject new_term = el_utilities.replace_formula_arg((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, new_dependent_vars, v_term);
        return new_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 11345L)
    public static SubLObject isa_var_lit_to_be_excisedP(final SubLObject v_clauses, final SubLObject sense, final SubLObject clause_num, final SubLObject literal_num, final SubLObject info_list) {
        SubLObject cdolist_list_var = info_list;
        SubLObject info = (SubLObject)reformulator_module_type_shifting.NIL;
        info = cdolist_list_var.first();
        while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
            final SubLObject isa_clause_num = typeshift_info_isa_clause_num(info);
            final SubLObject isa_clause = ConsesLow.nth(isa_clause_num, v_clauses);
            final SubLObject isa_lit_num = typeshift_info_isa_lit_num(info);
            final SubLObject isa_lit = clauses.clause_literal(isa_clause, sense, isa_lit_num);
            final SubLObject this_clause = ConsesLow.nth(clause_num, v_clauses);
            final SubLObject this_lit = clauses.clause_literal(this_clause, sense, literal_num);
            if ((isa_clause_num.eql(clause_num) && isa_lit_num.eql(literal_num)) || (!isa_clause_num.eql(clause_num) && this_lit.equal(isa_lit))) {
                return (SubLObject)reformulator_module_type_shifting.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 11989L)
    public static SubLObject vars_to_be_excised(final SubLObject target_poslit, final SubLObject info_list) {
        SubLObject doomed_vars = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject cdolist_list_var = info_list;
        SubLObject info = (SubLObject)reformulator_module_type_shifting.NIL;
        info = cdolist_list_var.first();
        while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
            final SubLObject pred_argnum = typeshift_info_pred_argnum(info);
            final SubLObject var_arg = cycl_utilities.sentence_arg(target_poslit, pred_argnum, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
            final SubLObject var = (reformulator_module_type_shifting.NIL != term.unreified_skolem_termP(var_arg)) ? skolems.skolem_function_var(var_arg) : var_arg;
            doomed_vars = (SubLObject)ConsesLow.cons(var, doomed_vars);
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return doomed_vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 12362L)
    public static SubLObject tlvia_argnum_pairs_for_pred_and_type_pred(final SubLObject pred, final SubLObject type_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_module_type_shifting.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_module_type_shifting.$sym15$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject assertions = cdolist_list_var = kb_mapping.gather_gaf_arg_index(pred, (SubLObject)reformulator_module_type_shifting.ONE_INTEGER, reformulator_module_type_shifting.$const2$typeLevelVersionInArg, (SubLObject)reformulator_module_type_shifting.UNPROVIDED, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
            SubLObject ass = (SubLObject)reformulator_module_type_shifting.NIL;
            ass = cdolist_list_var.first();
            while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
                if (type_pred.eql(assertions_high.gaf_arg2(ass))) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.gaf_arg3(ass), assertions_high.gaf_arg4(ass)), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 12707L)
    public static SubLObject possible_type_preds_for_pred(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_module_type_shifting.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_module_type_shifting.$sym15$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject assertions = kb_mapping.gather_gaf_arg_index(pred, (SubLObject)reformulator_module_type_shifting.ONE_INTEGER, reformulator_module_type_shifting.$const2$typeLevelVersionInArg, (SubLObject)reformulator_module_type_shifting.UNPROVIDED, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
            final SubLObject type_preds = result = Mapping.mapcar((SubLObject)reformulator_module_type_shifting.$sym16$GAF_ARG2, assertions);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 12974L)
    public static SubLObject sense_for_pred_and_type_pred(final SubLObject pred, final SubLObject type_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_module_type_shifting.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_module_type_shifting.$sym15$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject assertions = cdolist_list_var = kb_mapping.gather_gaf_arg_index(pred, (SubLObject)reformulator_module_type_shifting.ONE_INTEGER, reformulator_module_type_shifting.$const2$typeLevelVersionInArg, (SubLObject)reformulator_module_type_shifting.UNPROVIDED, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
            SubLObject ass = (SubLObject)reformulator_module_type_shifting.NIL;
            ass = cdolist_list_var.first();
            while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
                if (type_pred.eql(assertions_high.gaf_arg2(ass))) {
                    final SubLObject pcase_var = assertions_high.gaf_arg5(ass);
                    if (pcase_var.eql(reformulator_module_type_shifting.$const17$forAll)) {
                        result = (SubLObject)reformulator_module_type_shifting.$kw8$NEG;
                    }
                    else if (pcase_var.eql(reformulator_module_type_shifting.$const18$thereExists)) {
                        result = (SubLObject)reformulator_module_type_shifting.$kw11$POS;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 13408L)
    public static SubLObject isa_x_col_asent_pos(final SubLObject v_clauses, final SubLObject sense, final SubLObject x) {
        SubLObject result_clause_num = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject result_lit_num = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject list_var = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject clause = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject clause_num = (SubLObject)reformulator_module_type_shifting.NIL;
        list_var = v_clauses;
        clause = list_var.first();
        for (clause_num = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL == result_clause_num && reformulator_module_type_shifting.NIL != list_var; list_var = list_var.rest(), clause = list_var.first(), clause_num = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, clause_num)) {
            final SubLObject lits = clause_utilities.literals_with_sense(clause, sense);
            SubLObject list_var_$1 = (SubLObject)reformulator_module_type_shifting.NIL;
            SubLObject asent = (SubLObject)reformulator_module_type_shifting.NIL;
            SubLObject asent_num = (SubLObject)reformulator_module_type_shifting.NIL;
            list_var_$1 = lits;
            asent = list_var_$1.first();
            for (asent_num = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL == result_lit_num && reformulator_module_type_shifting.NIL != list_var_$1; list_var_$1 = list_var_$1.rest(), asent = list_var_$1.first(), asent_num = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, asent_num)) {
                if (reformulator_module_type_shifting.NIL != isa_x_col_asentP(asent, sense, x)) {
                    result_clause_num = clause_num;
                    result_lit_num = asent_num;
                }
            }
        }
        return Values.values(result_clause_num, result_lit_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 13866L)
    public static SubLObject isa_x_col_asentP(final SubLObject asent, final SubLObject sense, final SubLObject x) {
        if (sense.eql((SubLObject)reformulator_module_type_shifting.$kw8$NEG)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_type_shifting.NIL != el_utilities.isa_litP(asent) && x.equal(cycl_utilities.sentence_arg1(asent, (SubLObject)reformulator_module_type_shifting.UNPROVIDED)));
        }
        if (sense.eql((SubLObject)reformulator_module_type_shifting.$kw11$POS)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_type_shifting.NIL != el_utilities.isa_litP(asent) && reformulator_module_type_shifting.NIL != term.unreified_skolem_termP(cycl_utilities.sentence_arg1(asent, (SubLObject)reformulator_module_type_shifting.UNPROVIDED)) && x.equal(skolems.skolem_function_var(cycl_utilities.sentence_arg1(asent, (SubLObject)reformulator_module_type_shifting.UNPROVIDED))));
        }
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 14164L)
    public static SubLObject tlvia_ambiguity_violationP(final SubLObject pred) {
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 14254L)
    public static SubLObject appears_nowhere_but(final SubLObject v_clauses, final SubLObject x, final SubLObject clause_num, final SubLObject lit_num, final SubLObject sense, final SubLObject poslit_clause_num, final SubLObject poslit_lit_num, final SubLObject poslit_argnum) {
        final SubLObject ok_clause = ConsesLow.nth(clause_num, v_clauses);
        final SubLObject ok_lit = clauses.clause_literal(ok_clause, sense, lit_num);
        SubLObject list_var = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject clause = (SubLObject)reformulator_module_type_shifting.NIL;
        SubLObject cnum = (SubLObject)reformulator_module_type_shifting.NIL;
        list_var = v_clauses;
        clause = list_var.first();
        for (cnum = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL != list_var; list_var = list_var.rest(), clause = list_var.first(), cnum = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, cnum)) {
            SubLObject list_var_$2 = (SubLObject)reformulator_module_type_shifting.NIL;
            SubLObject neglit = (SubLObject)reformulator_module_type_shifting.NIL;
            SubLObject lnum = (SubLObject)reformulator_module_type_shifting.NIL;
            list_var_$2 = clauses.neg_lits(clause);
            neglit = list_var_$2.first();
            for (lnum = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL != list_var_$2; list_var_$2 = list_var_$2.rest(), neglit = list_var_$2.first(), lnum = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, lnum)) {
                if ((!sense.eql((SubLObject)reformulator_module_type_shifting.$kw8$NEG) || !cnum.eql(clause_num) || !lnum.eql(lit_num)) && (!sense.eql((SubLObject)reformulator_module_type_shifting.$kw8$NEG) || cnum.eql(clause_num) || !neglit.equal(ok_lit)) && reformulator_module_type_shifting.NIL != typeshift_expression_find(x, neglit)) {
                    return (SubLObject)reformulator_module_type_shifting.NIL;
                }
            }
            SubLObject list_var_$3 = (SubLObject)reformulator_module_type_shifting.NIL;
            SubLObject poslit = (SubLObject)reformulator_module_type_shifting.NIL;
            lnum = (SubLObject)reformulator_module_type_shifting.NIL;
            list_var_$3 = clauses.pos_lits(clause);
            poslit = list_var_$3.first();
            for (lnum = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER; reformulator_module_type_shifting.NIL != list_var_$3; list_var_$3 = list_var_$3.rest(), poslit = list_var_$3.first(), lnum = Numbers.add((SubLObject)reformulator_module_type_shifting.ONE_INTEGER, lnum)) {
                if (cnum.eql(poslit_clause_num) && lnum.eql(poslit_lit_num)) {
                    SubLObject argnum = (SubLObject)reformulator_module_type_shifting.ZERO_INTEGER;
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(poslit, (SubLObject)reformulator_module_type_shifting.$kw19$IGNORE);
                    SubLObject arg = (SubLObject)reformulator_module_type_shifting.NIL;
                    arg = cdolist_list_var.first();
                    while (reformulator_module_type_shifting.NIL != cdolist_list_var) {
                        argnum = Numbers.add(argnum, (SubLObject)reformulator_module_type_shifting.ONE_INTEGER);
                        if (!argnum.eql(poslit_argnum) && reformulator_module_type_shifting.NIL != typeshift_expression_find(x, arg)) {
                            return (SubLObject)reformulator_module_type_shifting.NIL;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    }
                }
                else if ((!sense.eql((SubLObject)reformulator_module_type_shifting.$kw11$POS) || !cnum.eql(clause_num) || !lnum.eql(lit_num)) && (!sense.eql((SubLObject)reformulator_module_type_shifting.$kw11$POS) || cnum.eql(clause_num) || !poslit.equal(ok_lit)) && reformulator_module_type_shifting.NIL != typeshift_expression_find(x, poslit)) {
                    return (SubLObject)reformulator_module_type_shifting.NIL;
                }
            }
        }
        return (SubLObject)reformulator_module_type_shifting.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 15751L)
    public static SubLObject typeshift_expression_find(final SubLObject v_object, final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_module_type_shifting.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)reformulator_module_type_shifting.$sym20$UNREIFIED_SKOLEM_OR_DEFAULT_OPAQUE_ARG_, thread);
            result = cycl_utilities.expression_find(v_object, expression, (SubLObject)reformulator_module_type_shifting.NIL, (SubLObject)reformulator_module_type_shifting.UNPROVIDED, (SubLObject)reformulator_module_type_shifting.UNPROVIDED);
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-type-shifting.lisp", position = 15989L)
    public static SubLObject unreified_skolem_or_default_opaque_argP(final SubLObject formula, final SubLObject argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_type_shifting.NIL != cycl_utilities.default_opaque_argP(formula, argnum) || reformulator_module_type_shifting.NIL != term.unreified_skolem_termP(cycl_utilities.formula_arg(formula, argnum, (SubLObject)reformulator_module_type_shifting.UNPROVIDED)));
    }
    
    public static SubLObject declare_reformulator_module_type_shifting_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "isa_var_col_asentP", "ISA-VAR-COL-ASENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "pred_has_some_tlvia_assertions_somewhereP", "PRED-HAS-SOME-TLVIA-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "some_tlvia_assertions_somewhereP", "SOME-TLVIA-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "some_tlvia_assertionsP", "SOME-TLVIA-ASSERTIONS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_required", "TYPESHIFT-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_clause_requiredP", "TYPESHIFT-CLAUSE-REQUIRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_cost", "TYPESHIFT-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_reformulate", "TYPESHIFT-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_reformulate_wrt_clause", "TYPESHIFT-REFORMULATE-WRT-CLAUSE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_reformulate_wrt_clause_int", "TYPESHIFT-REFORMULATE-WRT-CLAUSE-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_reformulate_clause", "TYPESHIFT-REFORMULATE-CLAUSE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "doomed_vars_smittenP", "DOOMED-VARS-SMITTEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_reformulate_target_poslit", "TYPESHIFT-REFORMULATE-TARGET-POSLIT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_clause_info_list", "TYPESHIFT-CLAUSE-INFO-LIST", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "make_typeshift_info", "MAKE-TYPESHIFT-INFO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_info_pred_argnum", "TYPESHIFT-INFO-PRED-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_info_type_pred_argnum", "TYPESHIFT-INFO-TYPE-PRED-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_info_isa_clause_num", "TYPESHIFT-INFO-ISA-CLAUSE-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_info_isa_lit_num", "TYPESHIFT-INFO-ISA-LIT-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "excise_dependent_skolem_vars", "EXCISE-DEPENDENT-SKOLEM-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "unreified_skolem_term_with_doomed_varsP", "UNREIFIED-SKOLEM-TERM-WITH-DOOMED-VARS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "excise_doomed_vars_from_unreified_skolem_term", "EXCISE-DOOMED-VARS-FROM-UNREIFIED-SKOLEM-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "isa_var_lit_to_be_excisedP", "ISA-VAR-LIT-TO-BE-EXCISED?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "vars_to_be_excised", "VARS-TO-BE-EXCISED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "tlvia_argnum_pairs_for_pred_and_type_pred", "TLVIA-ARGNUM-PAIRS-FOR-PRED-AND-TYPE-PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "possible_type_preds_for_pred", "POSSIBLE-TYPE-PREDS-FOR-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "sense_for_pred_and_type_pred", "SENSE-FOR-PRED-AND-TYPE-PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "isa_x_col_asent_pos", "ISA-X-COL-ASENT-POS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "isa_x_col_asentP", "ISA-X-COL-ASENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "tlvia_ambiguity_violationP", "TLVIA-AMBIGUITY-VIOLATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "appears_nowhere_but", "APPEARS-NOWHERE-BUT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "typeshift_expression_find", "TYPESHIFT-EXPRESSION-FIND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_type_shifting", "unreified_skolem_or_default_opaque_argP", "UNREIFIED-SKOLEM-OR-DEFAULT-OPAQUE-ARG?", 2, 0, false);
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    public static SubLObject init_reformulator_module_type_shifting_file() {
        reformulator_module_type_shifting.$typeshift_microseconds$ = SubLFiles.deflexical("*TYPESHIFT-MICROSECONDS*", (SubLObject)reformulator_module_type_shifting.$int6$2500);
        reformulator_module_type_shifting.$typeshift_doomed_vars$ = SubLFiles.defparameter("*TYPESHIFT-DOOMED-VARS*", (SubLObject)reformulator_module_type_shifting.NIL);
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    public static SubLObject setup_reformulator_module_type_shifting_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_type_shifting.$const0$TypeShiftingRLModule, (SubLObject)reformulator_module_type_shifting.$list1);
        return (SubLObject)reformulator_module_type_shifting.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_reformulator_module_type_shifting_file();
    }
    
    @Override
	public void initializeVariables() {
        init_reformulator_module_type_shifting_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_reformulator_module_type_shifting_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_type_shifting();
        reformulator_module_type_shifting.$typeshift_microseconds$ = null;
        reformulator_module_type_shifting.$typeshift_doomed_vars$ = null;
        $const0$TypeShiftingRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeShiftingRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TYPESHIFT-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("TYPESHIFT-COST"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("TYPESHIFT-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Based on #$typeLevelVersionInArg assertions in the KB, will\n reformulate instance-level expressions into type-level expressions\n when possible, even if they're in the middle of a bunch of other\n stuff."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString(" (#$implies \n    (#$and \n      (#$isa ?X #$Dog) \n      (#$likesAsFriend ?X #$Pace)) \n    (#$thereExists ?Y \n      (#$and \n        (#$genls ?Y #$Running) \n        (#$relationAllInstance #$rateOfEvent ?Y \n          (#$HighAmountFn #$EventRate)) \n        (#$behaviorCapable ?X ?Y #$performedBy))))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString(" (#$implies \n    (#$and \n      (#$isa ?X #$Dog) \n      (#$likesAsFriend ?X #$Pace)) \n    (#$thereExists ?Y \n      (#$and \n        (#$genls ?Y #$Running) \n        (#$relationAllInstance #$rateOfEvent ?Y \n          (#$HighAmountFn #$EventRate)) \n        (#$behaviorCapable ?X ?Y #$performedBy))))") });
        $const2$typeLevelVersionInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeLevelVersionInArg"));
        $kw3$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym4$ISA_VAR_COL_ASENT_ = SubLObjectFactory.makeSymbol("ISA-VAR-COL-ASENT?");
        $sym5$PRED_HAS_SOME_TLVIA_ASSERTIONS_SOMEWHERE_ = SubLObjectFactory.makeSymbol("PRED-HAS-SOME-TLVIA-ASSERTIONS-SOMEWHERE?");
        $int6$2500 = SubLObjectFactory.makeInteger(2500);
        $kw7$EXCISE = SubLObjectFactory.makeKeyword("EXCISE");
        $kw8$NEG = SubLObjectFactory.makeKeyword("NEG");
        $const9$trueSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $const10$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $kw11$POS = SubLObjectFactory.makeKeyword("POS");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-PRED-ARGNUM"));
        $sym13$UNREIFIED_SKOLEM_TERM_WITH_DOOMED_VARS_ = SubLObjectFactory.makeSymbol("UNREIFIED-SKOLEM-TERM-WITH-DOOMED-VARS?");
        $sym14$EXCISE_DOOMED_VARS_FROM_UNREIFIED_SKOLEM_TERM = SubLObjectFactory.makeSymbol("EXCISE-DOOMED-VARS-FROM-UNREIFIED-SKOLEM-TERM");
        $sym15$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym16$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $const17$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $const18$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $kw19$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym20$UNREIFIED_SKOLEM_OR_DEFAULT_OPAQUE_ARG_ = SubLObjectFactory.makeSymbol("UNREIFIED-SKOLEM-OR-DEFAULT-OPAQUE-ARG?");
    }
}

/*

	Total time: 124 ms
	
*/