package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_type_shifting extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_type_shifting();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_type_shifting";

    public static final String myFingerPrint = "891f382bab3f0b84ee54a610743b32f0859c6e11ea22e5a4c9e94ad6675e1420";

    // deflexical
    private static final SubLSymbol $typeshift_microseconds$ = makeSymbol("*TYPESHIFT-MICROSECONDS*");

    // defparameter
    private static final SubLSymbol $typeshift_doomed_vars$ = makeSymbol("*TYPESHIFT-DOOMED-VARS*");

    private static final SubLObject $$TypeShiftingRLModule = reader_make_constant_shell(makeString("TypeShiftingRLModule"));

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("TYPESHIFT-REQUIRED"), makeKeyword("COST"), makeSymbol("TYPESHIFT-COST"), makeKeyword("REFORMULATE"), makeSymbol("TYPESHIFT-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Based on #$typeLevelVersionInArg assertions in the KB, will\n reformulate instance-level expressions into type-level expressions\n when possible, even if they\'re in the middle of a bunch of other\n stuff."), makeKeyword("EXAMPLE-SOURCE"), makeString(" (#$implies \n    (#$and \n      (#$isa ?X #$Dog) \n      (#$likesAsFriend ?X #$Pace)) \n    (#$thereExists ?Y \n      (#$and \n        (#$genls ?Y #$Running) \n        (#$relationAllInstance #$rateOfEvent ?Y \n          (#$HighAmountFn #$EventRate)) \n        (#$behaviorCapable ?X ?Y #$performedBy))))"), makeKeyword("EXAMPLE-TARGET"), makeString(" (#$implies \n    (#$and \n      (#$isa ?X #$Dog) \n      (#$likesAsFriend ?X #$Pace)) \n    (#$thereExists ?Y \n      (#$and \n        (#$genls ?Y #$Running) \n        (#$relationAllInstance #$rateOfEvent ?Y \n          (#$HighAmountFn #$EventRate)) \n        (#$behaviorCapable ?X ?Y #$performedBy))))") });

    private static final SubLObject $$typeLevelVersionInArg = reader_make_constant_shell(makeString("typeLevelVersionInArg"));



    public static final SubLSymbol $sym4$ISA_VAR_COL_ASENT_ = makeSymbol("ISA-VAR-COL-ASENT?");

    public static final SubLSymbol $sym5$PRED_HAS_SOME_TLVIA_ASSERTIONS_SOMEWHERE_ = makeSymbol("PRED-HAS-SOME-TLVIA-ASSERTIONS-SOMEWHERE?");

    private static final SubLInteger $int$2500 = makeInteger(2500);





    private static final SubLObject $$trueSentence = reader_make_constant_shell(makeString("trueSentence"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));



    public static final SubLList $list12 = list(makeSymbol("PRED-ARGNUM"), makeSymbol("TYPE-PRED-ARGNUM"));

    public static final SubLSymbol $sym13$UNREIFIED_SKOLEM_TERM_WITH_DOOMED_VARS_ = makeSymbol("UNREIFIED-SKOLEM-TERM-WITH-DOOMED-VARS?");

    public static final SubLSymbol EXCISE_DOOMED_VARS_FROM_UNREIFIED_SKOLEM_TERM = makeSymbol("EXCISE-DOOMED-VARS-FROM-UNREIFIED-SKOLEM-TERM");





    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));



    public static final SubLSymbol $sym20$UNREIFIED_SKOLEM_OR_DEFAULT_OPAQUE_ARG_ = makeSymbol("UNREIFIED-SKOLEM-OR-DEFAULT-OPAQUE-ARG?");

    public static SubLObject isa_var_col_asentP(final SubLObject asent) {
        return makeBoolean((NIL != isa_litP(asent)) && (NIL != cycl_variables.el_varP(cycl_utilities.sentence_arg1(asent, UNPROVIDED))));
    }

    public static SubLObject pred_has_some_tlvia_assertions_somewhereP(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return some_tlvia_assertions_somewhereP(pred);
    }

    public static SubLObject some_tlvia_assertions_somewhereP(final SubLObject pred) {
        return somewhere_cache.some_pred_assertion_somewhereP($$typeLevelVersionInArg, pred, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject some_tlvia_assertionsP(final SubLObject pred, final SubLObject mt) {
        return makeBoolean((NIL != some_tlvia_assertions_somewhereP(pred)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(pred, $$typeLevelVersionInArg, mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject typeshift_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (NIL != clauses.clauses_p(expression)) {
            SubLObject cdolist_list_var = expression;
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != typeshift_clause_requiredP(clause, mt)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject typeshift_clause_requiredP(final SubLObject clause, final SubLObject mt) {
        final SubLObject neglits = clauses.neg_lits(clause);
        final SubLObject poslits = clauses.pos_lits(clause);
        if ((((NIL != poslits) && (NIL != neglits)) && (NIL != list_utilities.any_in_list($sym4$ISA_VAR_COL_ASENT_, neglits, UNPROVIDED))) && (NIL != list_utilities.any_in_list($sym5$PRED_HAS_SOME_TLVIA_ASSERTIONS_SOMEWHERE_, poslits, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject typeshift_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $typeshift_microseconds$.getGlobalValue();
    }

    public static SubLObject typeshift_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject new_clauses = NIL;
        SubLObject list_var = NIL;
        SubLObject clause = NIL;
        SubLObject clause_num = NIL;
        list_var = expression;
        clause = list_var.first();
        for (clause_num = ZERO_INTEGER; (NIL == new_clauses) && (NIL != list_var); list_var = list_var.rest() , clause = list_var.first() , clause_num = add(ONE_INTEGER, clause_num)) {
            if (NIL != typeshift_clause_requiredP(clause, mt)) {
                new_clauses = typeshift_reformulate_wrt_clause(expression, clause_num, mt, settings);
            }
        }
        if (NIL != new_clauses) {
            return values(new_clauses, T);
        }
        return values(expression, NIL);
    }

    public static SubLObject typeshift_reformulate_wrt_clause(final SubLObject v_clauses, final SubLObject clause_num, final SubLObject mt, final SubLObject settings) {
        SubLObject result_clauses = NIL;
        final SubLObject clause = nth(clause_num, v_clauses);
        final SubLObject poslits = clauses.pos_lits(clause);
        SubLObject list_var = NIL;
        SubLObject target_poslit = NIL;
        SubLObject target_poslit_num = NIL;
        list_var = poslits;
        target_poslit = list_var.first();
        for (target_poslit_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , target_poslit = list_var.first() , target_poslit_num = add(ONE_INTEGER, target_poslit_num)) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(target_poslit);
            if (((NIL != forts.fort_p(pred)) && (NIL != some_tlvia_assertionsP(pred, mt))) && (NIL == tlvia_ambiguity_violationP(pred))) {
                SubLObject cdolist_list_var = possible_type_preds_for_pred(pred, mt);
                SubLObject type_pred = NIL;
                type_pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_clauses = typeshift_reformulate_wrt_clause_int(v_clauses, clause_num, mt, target_poslit_num, type_pred);
                    if (NIL != result_clauses) {
                        return result_clauses;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    type_pred = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject typeshift_reformulate_wrt_clause_int(final SubLObject v_clauses, final SubLObject clause_num, final SubLObject mt, final SubLObject target_poslit_num, final SubLObject type_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target_clause = nth(clause_num, v_clauses);
        final SubLObject target_poslit = nth(target_poslit_num, clauses.pos_lits(target_clause));
        final SubLObject info_list = typeshift_clause_info_list(v_clauses, mt, type_pred, target_poslit, clause_num, target_poslit_num);
        if (NIL != info_list) {
            SubLObject result_clauses = NIL;
            final SubLObject smitten_vars = set.new_set(symbol_function(EQL), UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject new_target_clause = typeshift_reformulate_clause(v_clauses, clause_num, mt, info_list, type_pred, target_poslit, target_poslit_num);
            final SubLObject curr_smitten_vars = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != new_target_clause) {
                SubLObject cdolist_list_var = curr_smitten_vars;
                SubLObject smitten_var = NIL;
                smitten_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
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
                for (cdotimes_end_var = length(v_clauses), num = NIL, num = ZERO_INTEGER; num.numL(cdotimes_end_var); num = add(num, ONE_INTEGER)) {
                    if (num.numE(clause_num)) {
                        result_clauses = cons(new_target_clause, result_clauses);
                    } else {
                        thread.resetMultipleValues();
                        new_clause = typeshift_reformulate_clause(v_clauses, num, mt, info_list, type_pred, target_poslit, NIL);
                        new_smitten_vars = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == new_clause) {
                            return NIL;
                        }
                        if (!new_clause.eql($EXCISE)) {
                            cdolist_list_var2 = new_smitten_vars;
                            smitten_var2 = NIL;
                            smitten_var2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                set.set_add(smitten_var2, smitten_vars);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                smitten_var2 = cdolist_list_var2.first();
                            } 
                            result_clauses = cons(new_clause, result_clauses);
                        }
                    }
                }
            }
            if (NIL != doomed_vars_smittenP(smitten_vars, result_clauses)) {
                result_clauses = nreverse(result_clauses);
                return result_clauses;
            }
        }
        return NIL;
    }

    public static SubLObject typeshift_reformulate_clause(final SubLObject v_clauses, final SubLObject clause_num, final SubLObject mt, final SubLObject info_list, final SubLObject type_pred, final SubLObject target_poslit, final SubLObject target_poslit_num) {
        final SubLObject clause = nth(clause_num, v_clauses);
        final SubLObject neglits = clauses.neg_lits(clause);
        final SubLObject poslits = clauses.pos_lits(clause);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(target_poslit);
        final SubLObject sense = sense_for_pred_and_type_pred(pred, type_pred, mt);
        final SubLObject doomed_vars = vars_to_be_excised(target_poslit, info_list);
        SubLObject new_neglits = NIL;
        SubLObject new_poslits = NIL;
        SubLObject list_var = NIL;
        SubLObject neglit = NIL;
        SubLObject neglit_num = NIL;
        list_var = neglits;
        neglit = list_var.first();
        for (neglit_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , neglit = list_var.first() , neglit_num = add(ONE_INTEGER, neglit_num)) {
            if (sense.eql($NEG) && (NIL != isa_var_lit_to_be_excisedP(v_clauses, sense, clause_num, neglit_num, info_list))) {
                new_neglits = cons(make_unary_formula($$trueSentence, $$True), new_neglits);
            } else {
                final SubLObject new_neglit = excise_dependent_skolem_vars(neglit, doomed_vars);
                new_neglits = cons(new_neglit, new_neglits);
            }
        }
        new_neglits = nreverse(new_neglits);
        list_var = NIL;
        SubLObject poslit = NIL;
        SubLObject poslit_num = NIL;
        list_var = poslits;
        poslit = list_var.first();
        for (poslit_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , poslit = list_var.first() , poslit_num = add(ONE_INTEGER, poslit_num)) {
            if (poslit_num.eql(target_poslit_num)) {
                final SubLObject new_target_poslit = excise_dependent_skolem_vars(typeshift_reformulate_target_poslit(v_clauses, sense, clause_num, target_poslit_num, type_pred, info_list), doomed_vars);
                if (NIL == new_target_poslit) {
                    return values(NIL, NIL);
                }
                new_poslits = cons(new_target_poslit, new_poslits);
            } else
                if (sense.eql($POS) && (NIL != isa_var_lit_to_be_excisedP(v_clauses, sense, clause_num, poslit_num, info_list))) {
                    new_poslits = cons(make_unary_formula($$trueSentence, $$True), new_poslits);
                } else {
                    final SubLObject new_poslit = excise_dependent_skolem_vars(poslit, doomed_vars);
                    new_poslits = cons(new_poslit, new_poslits);
                }

        }
        new_poslits = nreverse(new_poslits);
        final SubLObject new_clause = clauses.make_cnf(new_neglits, new_poslits);
        return values(new_clause, doomed_vars);
    }

    public static SubLObject doomed_vars_smittenP(final SubLObject doomed_vars, final SubLObject expression) {
        final SubLObject set_contents_var = set.do_set_internal(doomed_vars);
        SubLObject basis_object;
        SubLObject state;
        SubLObject doomed_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            doomed_var = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, doomed_var)) && (NIL != cycl_utilities.expression_find(doomed_var, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject typeshift_reformulate_target_poslit(final SubLObject v_clauses, final SubLObject sense, final SubLObject target_poslit_clause_num, final SubLObject target_poslit_lit_num, final SubLObject type_pred, final SubLObject info_list) {
        final SubLObject target_clause = nth(target_poslit_clause_num, v_clauses);
        final SubLObject poslits = clauses.pos_lits(target_clause);
        SubLObject result;
        final SubLObject target_poslit = result = nth(target_poslit_lit_num, poslits);
        result = replace_formula_arg(ZERO_INTEGER, type_pred, result);
        SubLObject cdolist_list_var = info_list;
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject isa_clause_num = typeshift_info_isa_clause_num(info);
            final SubLObject isa_clause = nth(isa_clause_num, v_clauses);
            final SubLObject isa_lit_num = typeshift_info_isa_lit_num(info);
            final SubLObject isa_lit = clauses.clause_literal(isa_clause, sense, isa_lit_num);
            final SubLObject col = cycl_utilities.sentence_arg2(isa_lit, UNPROVIDED);
            final SubLObject type_pred_argnum = typeshift_info_type_pred_argnum(info);
            result = replace_formula_arg(type_pred_argnum, col, result);
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject typeshift_clause_info_list(final SubLObject v_clauses, final SubLObject mt, final SubLObject type_pred, final SubLObject target_poslit, final SubLObject target_poslit_clause_num, final SubLObject target_poslit_lit_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(target_poslit);
        final SubLObject sense = sense_for_pred_and_type_pred(pred, type_pred, mt);
        final SubLObject argnum_pairs = tlvia_argnum_pairs_for_pred_and_type_pred(pred, type_pred, mt);
        SubLObject info_list = NIL;
        SubLObject cdolist_list_var = argnum_pairs;
        SubLObject argnum_pair = NIL;
        argnum_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = argnum_pair;
            SubLObject pred_argnum = NIL;
            SubLObject type_pred_argnum = NIL;
            destructuring_bind_must_consp(current, datum, $list12);
            pred_argnum = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list12);
            type_pred_argnum = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject this_arg_okP = NIL;
                SubLObject var = cycl_utilities.sentence_arg(target_poslit, pred_argnum, UNPROVIDED);
                if (($NEG.eql(sense) && (NIL != cycl_variables.el_varP(var))) || ($POS.eql(sense) && (NIL != term.unreified_skolem_termP(var)))) {
                    if ($POS.eql(sense) && (NIL != term.unreified_skolem_termP(var))) {
                        var = skolems.skolem_function_var(var);
                    }
                    thread.resetMultipleValues();
                    final SubLObject isa_clause_num = isa_x_col_asent_pos(v_clauses, sense, var);
                    final SubLObject isa_lit_num = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (((NIL != isa_clause_num) && (NIL != isa_lit_num)) && (NIL != appears_nowhere_but(v_clauses, var, isa_clause_num, isa_lit_num, sense, target_poslit_clause_num, target_poslit_lit_num, pred_argnum))) {
                        this_arg_okP = T;
                        info_list = cons(make_typeshift_info(pred_argnum, type_pred_argnum, isa_clause_num, isa_lit_num), info_list);
                    }
                }
                if (NIL == this_arg_okP) {
                    return NIL;
                }
            } else {
                cdestructuring_bind_error(datum, $list12);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argnum_pair = cdolist_list_var.first();
        } 
        return info_list;
    }

    public static SubLObject make_typeshift_info(final SubLObject pred_argnum, final SubLObject type_pred_argnum, final SubLObject isa_clause_num, final SubLObject isa_lit_num) {
        return list(pred_argnum, type_pred_argnum, isa_clause_num, isa_lit_num);
    }

    public static SubLObject typeshift_info_pred_argnum(final SubLObject info) {
        return info.first();
    }

    public static SubLObject typeshift_info_type_pred_argnum(final SubLObject info) {
        return second(info);
    }

    public static SubLObject typeshift_info_isa_clause_num(final SubLObject info) {
        return third(info);
    }

    public static SubLObject typeshift_info_isa_lit_num(final SubLObject info) {
        return fourth(info);
    }

    public static SubLObject excise_dependent_skolem_vars(final SubLObject asent, final SubLObject doomed_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $typeshift_doomed_vars$.currentBinding(thread);
        try {
            $typeshift_doomed_vars$.bind(doomed_vars, thread);
            result = cycl_utilities.expression_transform(asent, $sym13$UNREIFIED_SKOLEM_TERM_WITH_DOOMED_VARS_, EXCISE_DOOMED_VARS_FROM_UNREIFIED_SKOLEM_TERM, NIL, UNPROVIDED);
        } finally {
            $typeshift_doomed_vars$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject unreified_skolem_term_with_doomed_varsP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != term.unreified_skolem_termP(v_term)) && (NIL != keyhash_utilities.fast_intersection(skolems.skolem_function_dependent_vars(v_term), $typeshift_doomed_vars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject excise_doomed_vars_from_unreified_skolem_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dependent_vars = skolems.skolem_function_dependent_vars(v_term);
        final SubLObject new_dependent_vars = list_utilities.fast_set_difference(dependent_vars, $typeshift_doomed_vars$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject new_term = replace_formula_arg(ONE_INTEGER, new_dependent_vars, v_term);
        return new_term;
    }

    public static SubLObject isa_var_lit_to_be_excisedP(final SubLObject v_clauses, final SubLObject sense, final SubLObject clause_num, final SubLObject literal_num, final SubLObject info_list) {
        SubLObject cdolist_list_var = info_list;
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject isa_clause_num = typeshift_info_isa_clause_num(info);
            final SubLObject isa_clause = nth(isa_clause_num, v_clauses);
            final SubLObject isa_lit_num = typeshift_info_isa_lit_num(info);
            final SubLObject isa_lit = clauses.clause_literal(isa_clause, sense, isa_lit_num);
            final SubLObject this_clause = nth(clause_num, v_clauses);
            final SubLObject this_lit = clauses.clause_literal(this_clause, sense, literal_num);
            if ((isa_clause_num.eql(clause_num) && isa_lit_num.eql(literal_num)) || ((!isa_clause_num.eql(clause_num)) && this_lit.equal(isa_lit))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject vars_to_be_excised(final SubLObject target_poslit, final SubLObject info_list) {
        SubLObject doomed_vars = NIL;
        SubLObject cdolist_list_var = info_list;
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred_argnum = typeshift_info_pred_argnum(info);
            final SubLObject var_arg = cycl_utilities.sentence_arg(target_poslit, pred_argnum, UNPROVIDED);
            final SubLObject var = (NIL != term.unreified_skolem_termP(var_arg)) ? skolems.skolem_function_var(var_arg) : var_arg;
            doomed_vars = cons(var, doomed_vars);
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return doomed_vars;
    }

    public static SubLObject tlvia_argnum_pairs_for_pred_and_type_pred(final SubLObject pred, final SubLObject type_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject assertions = cdolist_list_var = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$typeLevelVersionInArg, UNPROVIDED, UNPROVIDED);
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (type_pred.eql(assertions_high.gaf_arg2(ass))) {
                    result = cons(list(assertions_high.gaf_arg3(ass), assertions_high.gaf_arg4(ass)), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject possible_type_preds_for_pred(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject assertions = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$typeLevelVersionInArg, UNPROVIDED, UNPROVIDED);
            final SubLObject type_preds = result = Mapping.mapcar(GAF_ARG2, assertions);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sense_for_pred_and_type_pred(final SubLObject pred, final SubLObject type_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject assertions = cdolist_list_var = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$typeLevelVersionInArg, UNPROVIDED, UNPROVIDED);
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (type_pred.eql(assertions_high.gaf_arg2(ass))) {
                    final SubLObject pcase_var = assertions_high.gaf_arg5(ass);
                    if (pcase_var.eql($$forAll)) {
                        result = $NEG;
                    } else
                        if (pcase_var.eql($$thereExists)) {
                            result = $POS;
                        }

                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject isa_x_col_asent_pos(final SubLObject v_clauses, final SubLObject sense, final SubLObject x) {
        SubLObject result_clause_num = NIL;
        SubLObject result_lit_num = NIL;
        SubLObject list_var = NIL;
        SubLObject clause = NIL;
        SubLObject clause_num = NIL;
        list_var = v_clauses;
        clause = list_var.first();
        for (clause_num = ZERO_INTEGER; (NIL == result_clause_num) && (NIL != list_var); list_var = list_var.rest() , clause = list_var.first() , clause_num = add(ONE_INTEGER, clause_num)) {
            final SubLObject lits = clause_utilities.literals_with_sense(clause, sense);
            SubLObject list_var_$1 = NIL;
            SubLObject asent = NIL;
            SubLObject asent_num = NIL;
            list_var_$1 = lits;
            asent = list_var_$1.first();
            for (asent_num = ZERO_INTEGER; (NIL == result_lit_num) && (NIL != list_var_$1); list_var_$1 = list_var_$1.rest() , asent = list_var_$1.first() , asent_num = add(ONE_INTEGER, asent_num)) {
                if (NIL != isa_x_col_asentP(asent, sense, x)) {
                    result_clause_num = clause_num;
                    result_lit_num = asent_num;
                }
            }
        }
        return values(result_clause_num, result_lit_num);
    }

    public static SubLObject isa_x_col_asentP(final SubLObject asent, final SubLObject sense, final SubLObject x) {
        if (sense.eql($NEG)) {
            return makeBoolean((NIL != isa_litP(asent)) && x.equal(cycl_utilities.sentence_arg1(asent, UNPROVIDED)));
        }
        if (sense.eql($POS)) {
            return makeBoolean(((NIL != isa_litP(asent)) && (NIL != term.unreified_skolem_termP(cycl_utilities.sentence_arg1(asent, UNPROVIDED)))) && x.equal(skolems.skolem_function_var(cycl_utilities.sentence_arg1(asent, UNPROVIDED))));
        }
        return NIL;
    }

    public static SubLObject tlvia_ambiguity_violationP(final SubLObject pred) {
        return NIL;
    }

    public static SubLObject appears_nowhere_but(final SubLObject v_clauses, final SubLObject x, final SubLObject clause_num, final SubLObject lit_num, final SubLObject sense, final SubLObject poslit_clause_num, final SubLObject poslit_lit_num, final SubLObject poslit_argnum) {
        final SubLObject ok_clause = nth(clause_num, v_clauses);
        final SubLObject ok_lit = clauses.clause_literal(ok_clause, sense, lit_num);
        SubLObject list_var = NIL;
        SubLObject clause = NIL;
        SubLObject cnum = NIL;
        list_var = v_clauses;
        clause = list_var.first();
        for (cnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , clause = list_var.first() , cnum = add(ONE_INTEGER, cnum)) {
            SubLObject list_var_$2 = NIL;
            SubLObject neglit = NIL;
            SubLObject lnum = NIL;
            list_var_$2 = clauses.neg_lits(clause);
            neglit = list_var_$2.first();
            for (lnum = ZERO_INTEGER; NIL != list_var_$2; list_var_$2 = list_var_$2.rest() , neglit = list_var_$2.first() , lnum = add(ONE_INTEGER, lnum)) {
                if (((((!sense.eql($NEG)) || (!cnum.eql(clause_num))) || (!lnum.eql(lit_num))) && (((!sense.eql($NEG)) || cnum.eql(clause_num)) || (!neglit.equal(ok_lit)))) && (NIL != typeshift_expression_find(x, neglit))) {
                    return NIL;
                }
            }
            SubLObject list_var_$3 = NIL;
            SubLObject poslit = NIL;
            lnum = NIL;
            list_var_$3 = clauses.pos_lits(clause);
            poslit = list_var_$3.first();
            for (lnum = ZERO_INTEGER; NIL != list_var_$3; list_var_$3 = list_var_$3.rest() , poslit = list_var_$3.first() , lnum = add(ONE_INTEGER, lnum)) {
                if (cnum.eql(poslit_clause_num) && lnum.eql(poslit_lit_num)) {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(poslit, $IGNORE);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        argnum = add(argnum, ONE_INTEGER);
                        if ((!argnum.eql(poslit_argnum)) && (NIL != typeshift_expression_find(x, arg))) {
                            return NIL;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    } 
                } else
                    if (((((!sense.eql($POS)) || (!cnum.eql(clause_num))) || (!lnum.eql(lit_num))) && (((!sense.eql($POS)) || cnum.eql(clause_num)) || (!poslit.equal(ok_lit)))) && (NIL != typeshift_expression_find(x, poslit))) {
                        return NIL;
                    }

            }
        }
        return T;
    }

    public static SubLObject typeshift_expression_find(final SubLObject v_object, final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind($sym20$UNREIFIED_SKOLEM_OR_DEFAULT_OPAQUE_ARG_, thread);
            result = cycl_utilities.expression_find(v_object, expression, NIL, UNPROVIDED, UNPROVIDED);
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject unreified_skolem_or_default_opaque_argP(final SubLObject formula, final SubLObject argnum) {
        return makeBoolean((NIL != cycl_utilities.default_opaque_argP(formula, argnum)) || (NIL != term.unreified_skolem_termP(cycl_utilities.formula_arg(formula, argnum, UNPROVIDED))));
    }

    public static SubLObject declare_reformulator_module_type_shifting_file() {
        declareFunction(me, "isa_var_col_asentP", "ISA-VAR-COL-ASENT?", 1, 0, false);
        declareFunction(me, "pred_has_some_tlvia_assertions_somewhereP", "PRED-HAS-SOME-TLVIA-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "some_tlvia_assertions_somewhereP", "SOME-TLVIA-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "some_tlvia_assertionsP", "SOME-TLVIA-ASSERTIONS?", 2, 0, false);
        declareFunction(me, "typeshift_required", "TYPESHIFT-REQUIRED", 3, 0, false);
        declareFunction(me, "typeshift_clause_requiredP", "TYPESHIFT-CLAUSE-REQUIRED?", 2, 0, false);
        declareFunction(me, "typeshift_cost", "TYPESHIFT-COST", 3, 0, false);
        declareFunction(me, "typeshift_reformulate", "TYPESHIFT-REFORMULATE", 4, 0, false);
        declareFunction(me, "typeshift_reformulate_wrt_clause", "TYPESHIFT-REFORMULATE-WRT-CLAUSE", 4, 0, false);
        declareFunction(me, "typeshift_reformulate_wrt_clause_int", "TYPESHIFT-REFORMULATE-WRT-CLAUSE-INT", 5, 0, false);
        declareFunction(me, "typeshift_reformulate_clause", "TYPESHIFT-REFORMULATE-CLAUSE", 7, 0, false);
        declareFunction(me, "doomed_vars_smittenP", "DOOMED-VARS-SMITTEN?", 2, 0, false);
        declareFunction(me, "typeshift_reformulate_target_poslit", "TYPESHIFT-REFORMULATE-TARGET-POSLIT", 6, 0, false);
        declareFunction(me, "typeshift_clause_info_list", "TYPESHIFT-CLAUSE-INFO-LIST", 6, 0, false);
        declareFunction(me, "make_typeshift_info", "MAKE-TYPESHIFT-INFO", 4, 0, false);
        declareFunction(me, "typeshift_info_pred_argnum", "TYPESHIFT-INFO-PRED-ARGNUM", 1, 0, false);
        declareFunction(me, "typeshift_info_type_pred_argnum", "TYPESHIFT-INFO-TYPE-PRED-ARGNUM", 1, 0, false);
        declareFunction(me, "typeshift_info_isa_clause_num", "TYPESHIFT-INFO-ISA-CLAUSE-NUM", 1, 0, false);
        declareFunction(me, "typeshift_info_isa_lit_num", "TYPESHIFT-INFO-ISA-LIT-NUM", 1, 0, false);
        declareFunction(me, "excise_dependent_skolem_vars", "EXCISE-DEPENDENT-SKOLEM-VARS", 2, 0, false);
        declareFunction(me, "unreified_skolem_term_with_doomed_varsP", "UNREIFIED-SKOLEM-TERM-WITH-DOOMED-VARS?", 1, 0, false);
        declareFunction(me, "excise_doomed_vars_from_unreified_skolem_term", "EXCISE-DOOMED-VARS-FROM-UNREIFIED-SKOLEM-TERM", 1, 0, false);
        declareFunction(me, "isa_var_lit_to_be_excisedP", "ISA-VAR-LIT-TO-BE-EXCISED?", 5, 0, false);
        declareFunction(me, "vars_to_be_excised", "VARS-TO-BE-EXCISED", 2, 0, false);
        declareFunction(me, "tlvia_argnum_pairs_for_pred_and_type_pred", "TLVIA-ARGNUM-PAIRS-FOR-PRED-AND-TYPE-PRED", 3, 0, false);
        declareFunction(me, "possible_type_preds_for_pred", "POSSIBLE-TYPE-PREDS-FOR-PRED", 2, 0, false);
        declareFunction(me, "sense_for_pred_and_type_pred", "SENSE-FOR-PRED-AND-TYPE-PRED", 3, 0, false);
        declareFunction(me, "isa_x_col_asent_pos", "ISA-X-COL-ASENT-POS", 3, 0, false);
        declareFunction(me, "isa_x_col_asentP", "ISA-X-COL-ASENT?", 3, 0, false);
        declareFunction(me, "tlvia_ambiguity_violationP", "TLVIA-AMBIGUITY-VIOLATION?", 1, 0, false);
        declareFunction(me, "appears_nowhere_but", "APPEARS-NOWHERE-BUT", 8, 0, false);
        declareFunction(me, "typeshift_expression_find", "TYPESHIFT-EXPRESSION-FIND", 2, 0, false);
        declareFunction(me, "unreified_skolem_or_default_opaque_argP", "UNREIFIED-SKOLEM-OR-DEFAULT-OPAQUE-ARG?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_type_shifting_file() {
        deflexical("*TYPESHIFT-MICROSECONDS*", $int$2500);
        defparameter("*TYPESHIFT-DOOMED-VARS*", NIL);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_type_shifting_file() {
        reformulator_module_harness.declare_rl_module($$TypeShiftingRLModule, $list1);
        return NIL;
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

    
}

/**
 * Total time: 124 ms
 */
