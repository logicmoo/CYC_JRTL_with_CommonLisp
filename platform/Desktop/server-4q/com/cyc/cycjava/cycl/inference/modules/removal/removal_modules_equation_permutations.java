package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_equation_permutations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations";
    public static final String myFingerPrint = "a16b132c140ef503b6bd67cdd3030fdb1a7c57ac9b4c89cb1b32cb1760335bf5";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6121L)
    private static SubLSymbol $equation_permutable_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 13601L)
    public static SubLSymbol $equation_permutations_defining_mt$;
    private static final SubLObject $const0$numericallyEquals;
    private static final SubLSymbol $sym1$CYCL_EQUATION_P;
    private static final SubLSymbol $sym2$EQUATION_CANONICAL_PERMUTATION_;
    private static final SubLList $list3;
    private static final SubLObject $const4$PlusFn;
    private static final SubLObject $const5$DifferenceFn;
    private static final SubLObject $const6$TimesFn;
    private static final SubLObject $const7$QuotientFn;
    private static final SubLObject $const8$LogFn;
    private static final SubLObject $const9$ExpFn;
    private static final SubLObject $const10$The;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$MAKE_ADDITION;
    private static final SubLSymbol $sym15$MAKE_MULTIPLICATION;
    private static final SubLObject $const16$equationPermutations;
    private static final SubLSymbol $kw17$POS;
    private static final SubLSymbol $sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_;
    private static final SubLObject $const19$UniversalVocabularyMt;
    private static final SubLSymbol $kw20$REMOVAL_EQUATION_PERMUTATIONS_CHECK;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$EQUATION_PERMUTATIONS_FROM_ADDITION;
    private static final SubLSymbol $kw27$TEST;
    private static final SubLSymbol $kw28$OWNER;
    private static final SubLSymbol $kw29$CLASSES;
    private static final SubLSymbol $kw30$KB;
    private static final SubLSymbol $kw31$TINY;
    private static final SubLSymbol $kw32$WORKING_;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$EQUATION_PERMUTATIONS_FROM_DIVISION;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$EQUATION_IMMEDIATE_PERMUTATIONS;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$EQUATION_CANONICAL_PERMUTATIONS;
    private static final SubLSymbol $kw43$FULL;
    private static final SubLList $list44;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 1122L)
    public static SubLObject cycl_equation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_equation_permutations.NIL != el_utilities.el_formula_with_operator_p(v_object, removal_modules_equation_permutations.$const0$numericallyEquals) && removal_modules_equation_permutations.NIL != el_utilities.formula_arityE(v_object, (SubLObject)removal_modules_equation_permutations.TWO_INTEGER, (SubLObject)removal_modules_equation_permutations.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 1506L)
    public static SubLObject equation_permutations(final SubLObject equation) {
        assert removal_modules_equation_permutations.NIL != cycl_equation_p(equation) : equation;
        final SubLObject unprocessed_equations = queues.create_queue((SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        final SubLObject seen_equations = set.new_set(Symbols.symbol_function((SubLObject)removal_modules_equation_permutations.EQUAL), (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        SubLObject all_permutations = (SubLObject)removal_modules_equation_permutations.NIL;
        queues.enqueue(equation, unprocessed_equations);
        set.set_add(equation, seen_equations);
        while (removal_modules_equation_permutations.NIL == queues.queue_empty_p(unprocessed_equations)) {
            final SubLObject unprocessed_equation = queues.dequeue(unprocessed_equations);
            final SubLObject immediate_permutations = equation_immediate_permutations(unprocessed_equation);
            all_permutations = (SubLObject)ConsesLow.cons(unprocessed_equation, all_permutations);
            SubLObject cdolist_list_var = immediate_permutations;
            SubLObject immediate_permutation = (SubLObject)removal_modules_equation_permutations.NIL;
            immediate_permutation = cdolist_list_var.first();
            while (removal_modules_equation_permutations.NIL != cdolist_list_var) {
                if (removal_modules_equation_permutations.NIL == set.set_memberP(immediate_permutation, seen_equations)) {
                    queues.enqueue(immediate_permutation, unprocessed_equations);
                    set.set_add(immediate_permutation, seen_equations);
                }
                cdolist_list_var = cdolist_list_var.rest();
                immediate_permutation = cdolist_list_var.first();
            }
        }
        all_permutations = kb_utilities.sort_terms(all_permutations, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        return all_permutations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 2646L)
    public static SubLObject equation_canonical_permutations(final SubLObject equation) {
        final SubLObject all_permutations = equation_permutations(equation);
        SubLObject canonical_permutations = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject cdolist_list_var = all_permutations;
        SubLObject permutation = (SubLObject)removal_modules_equation_permutations.NIL;
        permutation = cdolist_list_var.first();
        while (removal_modules_equation_permutations.NIL != cdolist_list_var) {
            if (removal_modules_equation_permutations.NIL != equation_canonical_permutationP(permutation)) {
                canonical_permutations = (SubLObject)ConsesLow.cons(permutation, canonical_permutations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            permutation = cdolist_list_var.first();
        }
        canonical_permutations = kb_utilities.sort_terms(canonical_permutations, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        return canonical_permutations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 3222L)
    public static SubLObject equation_has_canonical_permutationP(final SubLObject equation, final SubLObject permutation) {
        assert removal_modules_equation_permutations.NIL != cycl_equation_p(equation) : equation;
        assert removal_modules_equation_permutations.NIL != cycl_equation_p(permutation) : permutation;
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_equation_permutations.NIL != equation_canonical_permutationP(permutation) && removal_modules_equation_permutations.NIL != list_utilities.member_equalP(permutation, equation_canonical_permutations(equation)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 3601L)
    public static SubLObject equation_canonical_permutationP(final SubLObject permutation) {
        if (removal_modules_equation_permutations.NIL == cycl_equation_p(permutation)) {
            return (SubLObject)removal_modules_equation_permutations.NIL;
        }
        final SubLObject arg1 = cycl_utilities.formula_arg1(permutation, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        if (arg1.isNumber()) {
            return (SubLObject)removal_modules_equation_permutations.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((removal_modules_equation_permutations.NIL == el_utilities.el_formula_p(arg1) || removal_modules_equation_permutations.NIL == equation_permutable_operator_p(cycl_utilities.formula_operator(arg1))) && removal_modules_equation_permutations.NIL == cycl_utilities.expression_find(arg1, cycl_utilities.formula_arg2(permutation, (SubLObject)removal_modules_equation_permutations.UNPROVIDED), (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 4912L)
    public static SubLObject equation_immediate_permutations(final SubLObject equation) {
        SubLObject num_eq = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject expression1 = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject expression2 = (SubLObject)removal_modules_equation_permutations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(equation, equation, (SubLObject)removal_modules_equation_permutations.$list3);
        num_eq = equation.first();
        SubLObject current = equation.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, equation, (SubLObject)removal_modules_equation_permutations.$list3);
        expression1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, equation, (SubLObject)removal_modules_equation_permutations.$list3);
        expression2 = current.first();
        current = current.rest();
        if (removal_modules_equation_permutations.NIL == current) {
            list_utilities.verify_operator(num_eq, removal_modules_equation_permutations.$const0$numericallyEquals);
            SubLObject permutations = (SubLObject)removal_modules_equation_permutations.NIL;
            if (removal_modules_equation_permutations.NIL != el_utilities.el_formula_p(expression1)) {
                final SubLObject pcase_var;
                final SubLObject operator = pcase_var = cycl_utilities.formula_operator(expression1);
                if (pcase_var.eql(removal_modules_equation_permutations.$const4$PlusFn)) {
                    permutations = equation_permutations_from_addition(expression1, expression2);
                }
                else if (pcase_var.eql(removal_modules_equation_permutations.$const5$DifferenceFn)) {
                    permutations = equation_permutations_from_subtraction(expression1, expression2);
                }
                else if (pcase_var.eql(removal_modules_equation_permutations.$const6$TimesFn)) {
                    permutations = equation_permutations_from_multiplication(expression1, expression2);
                }
                else if (pcase_var.eql(removal_modules_equation_permutations.$const7$QuotientFn)) {
                    permutations = equation_permutations_from_division(expression1, expression2);
                }
                else if (pcase_var.eql(removal_modules_equation_permutations.$const8$LogFn)) {
                    permutations = equation_permutations_from_natural_log(expression1, expression2);
                }
                else if (pcase_var.eql(removal_modules_equation_permutations.$const9$ExpFn)) {
                    permutations = equation_permutations_from_natural_exp(expression1, expression2);
                }
                else if (pcase_var.eql(removal_modules_equation_permutations.$const10$The)) {}
            }
            permutations = (SubLObject)ConsesLow.cons(make_equation(expression2, expression1), permutations);
            return permutations;
        }
        cdestructuring_bind.cdestructuring_bind_error(equation, (SubLObject)removal_modules_equation_permutations.$list3);
        return (SubLObject)removal_modules_equation_permutations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6451L)
    public static SubLObject equation_permutable_operator_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, removal_modules_equation_permutations.$equation_permutable_operators$.getGlobalValue(), (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6566L)
    public static SubLObject equation_permutations_from_addition(final SubLObject addition, final SubLObject other) {
        list_utilities.verify_form_with_operator(addition, removal_modules_equation_permutations.$const4$PlusFn);
        final SubLObject addends = cycl_utilities.formula_args(addition, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        SubLObject permutations = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject list_var = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject addend = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject index = (SubLObject)removal_modules_equation_permutations.NIL;
        list_var = addends;
        addend = list_var.first();
        for (index = (SubLObject)removal_modules_equation_permutations.ZERO_INTEGER; removal_modules_equation_permutations.NIL != list_var; list_var = list_var.rest(), addend = list_var.first(), index = Numbers.add((SubLObject)removal_modules_equation_permutations.ONE_INTEGER, index)) {
            final SubLObject rest_addends = list_utilities.remove_nth(index, addends);
            final SubLObject rest_term = (removal_modules_equation_permutations.NIL != list_utilities.singletonP(rest_addends)) ? rest_addends.first() : make_addition(rest_addends);
            final SubLObject permuted_other = make_difference(other, rest_term);
            final SubLObject permutation = make_equation(addend, permuted_other);
            permutations = (SubLObject)ConsesLow.cons(permutation, permutations);
        }
        return Sequences.nreverse(permutations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 7279L)
    public static SubLObject equation_permutations_from_subtraction(final SubLObject subtraction, final SubLObject other) {
        list_utilities.verify_form_with_operator(subtraction, removal_modules_equation_permutations.$const5$DifferenceFn);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(subtraction, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        SubLObject minuend = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject subtrahend = (SubLObject)removal_modules_equation_permutations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_equation_permutations.$list12);
        minuend = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_equation_permutations.$list12);
        subtrahend = current.first();
        current = current.rest();
        if (removal_modules_equation_permutations.NIL == current) {
            final SubLObject permuted1 = make_addition((SubLObject)ConsesLow.list(other, subtrahend));
            final SubLObject permuted2 = make_difference(minuend, other);
            final SubLObject permutation1 = make_equation(minuend, permuted1);
            final SubLObject permutation2 = make_equation(subtrahend, permuted2);
            return (SubLObject)ConsesLow.list(permutation1, permutation2);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_equation_permutations.$list12);
        return (SubLObject)removal_modules_equation_permutations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 7879L)
    public static SubLObject equation_permutations_from_multiplication(final SubLObject multiplication, final SubLObject other) {
        list_utilities.verify_form_with_operator(multiplication, removal_modules_equation_permutations.$const6$TimesFn);
        final SubLObject addends = cycl_utilities.formula_args(multiplication, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        SubLObject permutations = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject list_var = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject addend = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject index = (SubLObject)removal_modules_equation_permutations.NIL;
        list_var = addends;
        addend = list_var.first();
        for (index = (SubLObject)removal_modules_equation_permutations.ZERO_INTEGER; removal_modules_equation_permutations.NIL != list_var; list_var = list_var.rest(), addend = list_var.first(), index = Numbers.add((SubLObject)removal_modules_equation_permutations.ONE_INTEGER, index)) {
            SubLObject rest_addends = list_utilities.remove_nth(index, addends);
            final SubLObject rest_term = (removal_modules_equation_permutations.NIL != list_utilities.singletonP(rest_addends)) ? rest_addends.first() : make_multiplication(rest_addends);
            final SubLObject permuted_other = make_quotient(other, rest_term);
            final SubLObject permutation = make_equation(addend, permuted_other);
            permutations = (SubLObject)ConsesLow.cons(permutation, permutations);
            rest_addends = list_utilities.remove_nth(index, addends);
            final SubLObject permuted_numerator = (removal_modules_equation_permutations.NIL != list_utilities.form_with_operator_p(addend, removal_modules_equation_permutations.$const7$QuotientFn)) ? make_quotient(make_multiplication(ConsesLow.append((SubLObject)ConsesLow.list(conses_high.second(addend)), rest_addends)), conses_high.third(addend)) : make_multiplication(addends);
            final SubLObject permutation2 = make_equation(other, permuted_numerator);
            permutations = (SubLObject)ConsesLow.cons(permutation2, permutations);
        }
        return Sequences.nreverse(permutations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 9238L)
    public static SubLObject equation_permutations_from_division(final SubLObject division, final SubLObject other) {
        list_utilities.verify_form_with_operator(division, removal_modules_equation_permutations.$const7$QuotientFn);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(division, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        SubLObject numerator = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject denominator = (SubLObject)removal_modules_equation_permutations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_equation_permutations.$list13);
        numerator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_equation_permutations.$list13);
        denominator = current.first();
        current = current.rest();
        if (removal_modules_equation_permutations.NIL == current) {
            final SubLObject permuted1 = make_multiplication((SubLObject)ConsesLow.list(other, denominator));
            final SubLObject permuted2 = make_quotient(numerator, other);
            final SubLObject permutation1 = make_equation(numerator, permuted1);
            final SubLObject permutation2 = make_equation(denominator, permuted2);
            return (SubLObject)ConsesLow.list(permutation1, permutation2);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_equation_permutations.$list13);
        return (SubLObject)removal_modules_equation_permutations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 9842L)
    public static SubLObject equation_permutations_from_natural_log(final SubLObject log_formula, final SubLObject other) {
        list_utilities.verify_form_with_operator(log_formula, removal_modules_equation_permutations.$const8$LogFn);
        final SubLObject v_term = cycl_utilities.formula_arg1(log_formula, (SubLObject)removal_modules_equation_permutations.ONE_INTEGER);
        final SubLObject permuted = el_utilities.make_unary_formula(removal_modules_equation_permutations.$const9$ExpFn, other);
        final SubLObject permutation = make_equation(v_term, permuted);
        return (SubLObject)ConsesLow.list(permutation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10225L)
    public static SubLObject equation_permutations_from_natural_exp(final SubLObject exp_formula, final SubLObject other) {
        list_utilities.verify_form_with_operator(exp_formula, removal_modules_equation_permutations.$const9$ExpFn);
        final SubLObject v_term = cycl_utilities.formula_arg1(exp_formula, (SubLObject)removal_modules_equation_permutations.ONE_INTEGER);
        final SubLObject permuted = el_utilities.make_unary_formula(removal_modules_equation_permutations.$const8$LogFn, other);
        final SubLObject permutation = make_equation(v_term, permuted);
        return (SubLObject)ConsesLow.list(permutation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10609L)
    public static SubLObject make_equation(final SubLObject expression1, final SubLObject expression2) {
        return el_utilities.make_binary_formula(removal_modules_equation_permutations.$const0$numericallyEquals, expression1, expression2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10808L)
    public static SubLObject make_commutative_formula(final SubLObject relation, SubLObject args) {
        args = kb_utilities.sort_terms(args, (SubLObject)removal_modules_equation_permutations.T, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
        return el_utilities.make_formula(relation, args, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10939L)
    public static SubLObject make_symmetric_formula(final SubLObject relation, final SubLObject arg1, final SubLObject arg2) {
        return make_commutative_formula(relation, (SubLObject)ConsesLow.list(arg1, arg2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 11062L)
    public static SubLObject make_associative_commutative_formula(final SubLObject operator, final SubLObject args) {
        SubLObject final_args = (SubLObject)removal_modules_equation_permutations.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)removal_modules_equation_permutations.NIL;
        arg = cdolist_list_var.first();
        while (removal_modules_equation_permutations.NIL != cdolist_list_var) {
            if (removal_modules_equation_permutations.NIL != el_utilities.el_formula_with_operator_p(arg, operator)) {
                SubLObject cdolist_list_var_$1;
                final SubLObject sub_args = cdolist_list_var_$1 = cycl_utilities.formula_args(arg, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
                SubLObject sub_arg = (SubLObject)removal_modules_equation_permutations.NIL;
                sub_arg = cdolist_list_var_$1.first();
                while (removal_modules_equation_permutations.NIL != cdolist_list_var_$1) {
                    final_args = (SubLObject)ConsesLow.cons(sub_arg, final_args);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    sub_arg = cdolist_list_var_$1.first();
                }
            }
            else {
                final_args = (SubLObject)ConsesLow.cons(arg, final_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        if (removal_modules_equation_permutations.NIL != list_utilities.singletonP(final_args)) {
            return final_args.first();
        }
        return make_commutative_formula(operator, final_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 11608L)
    public static SubLObject make_separator_formula(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject aggregator) {
        if (removal_modules_equation_permutations.NIL != el_utilities.el_formula_with_operator_p(arg1, operator)) {
            final SubLObject sub_arg1 = cycl_utilities.formula_arg1(arg1, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
            final SubLObject sub_arg2 = cycl_utilities.formula_arg2(arg1, (SubLObject)removal_modules_equation_permutations.UNPROVIDED);
            final SubLObject new_arg2 = Functions.funcall(aggregator, (SubLObject)ConsesLow.list(sub_arg2, arg2));
            return make_separator_formula(operator, sub_arg1, new_arg2, aggregator);
        }
        return el_utilities.make_binary_formula(operator, arg1, arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12268L)
    public static SubLObject make_addition(final SubLObject addends) {
        return make_associative_commutative_formula(removal_modules_equation_permutations.$const4$PlusFn, addends);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12466L)
    public static SubLObject make_multiplication(final SubLObject products) {
        return make_associative_commutative_formula(removal_modules_equation_permutations.$const6$TimesFn, products);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12675L)
    public static SubLObject make_difference(final SubLObject minuend, final SubLObject subtrahend) {
        return make_separator_formula(removal_modules_equation_permutations.$const5$DifferenceFn, minuend, subtrahend, (SubLObject)removal_modules_equation_permutations.$sym14$MAKE_ADDITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12921L)
    public static SubLObject make_quotient(final SubLObject numerator, final SubLObject denominator) {
        return make_separator_formula(removal_modules_equation_permutations.$const7$QuotientFn, numerator, denominator, (SubLObject)removal_modules_equation_permutations.$sym15$MAKE_MULTIPLICATION);
    }
    
    public static SubLObject declare_removal_modules_equation_permutations_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "cycl_equation_p", "CYCL-EQUATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_permutations", "EQUATION-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_canonical_permutations", "EQUATION-CANONICAL-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_has_canonical_permutationP", "EQUATION-HAS-CANONICAL-PERMUTATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_canonical_permutationP", "EQUATION-CANONICAL-PERMUTATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_immediate_permutations", "EQUATION-IMMEDIATE-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_permutable_operator_p", "EQUATION-PERMUTABLE-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_permutations_from_addition", "EQUATION-PERMUTATIONS-FROM-ADDITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_permutations_from_subtraction", "EQUATION-PERMUTATIONS-FROM-SUBTRACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_permutations_from_multiplication", "EQUATION-PERMUTATIONS-FROM-MULTIPLICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_permutations_from_division", "EQUATION-PERMUTATIONS-FROM-DIVISION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_permutations_from_natural_log", "EQUATION-PERMUTATIONS-FROM-NATURAL-LOG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "equation_permutations_from_natural_exp", "EQUATION-PERMUTATIONS-FROM-NATURAL-EXP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_equation", "MAKE-EQUATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_commutative_formula", "MAKE-COMMUTATIVE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_symmetric_formula", "MAKE-SYMMETRIC-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_associative_commutative_formula", "MAKE-ASSOCIATIVE-COMMUTATIVE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_separator_formula", "MAKE-SEPARATOR-FORMULA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_addition", "MAKE-ADDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_multiplication", "MAKE-MULTIPLICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_difference", "MAKE-DIFFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations", "make_quotient", "MAKE-QUOTIENT", 2, 0, false);
        return (SubLObject)removal_modules_equation_permutations.NIL;
    }
    
    public static SubLObject init_removal_modules_equation_permutations_file() {
        removal_modules_equation_permutations.$equation_permutable_operators$ = SubLFiles.deflexical("*EQUATION-PERMUTABLE-OPERATORS*", (SubLObject)removal_modules_equation_permutations.$list11);
        removal_modules_equation_permutations.$equation_permutations_defining_mt$ = SubLFiles.deflexical("*EQUATION-PERMUTATIONS-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_equation_permutations.$sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_, removal_modules_equation_permutations.$equation_permutations_defining_mt$, removal_modules_equation_permutations.$const19$UniversalVocabularyMt));
        return (SubLObject)removal_modules_equation_permutations.NIL;
    }
    
    public static SubLObject setup_removal_modules_equation_permutations_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_equation_permutations.$sym2$EQUATION_CANONICAL_PERMUTATION_);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_equation_permutations.$const16$equationPermutations);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_equation_permutations.$kw17$POS, removal_modules_equation_permutations.$const16$equationPermutations);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_equation_permutations.$sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_equation_permutations.$sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_, removal_modules_equation_permutations.$const16$equationPermutations);
        inference_modules.inference_removal_module((SubLObject)removal_modules_equation_permutations.$kw20$REMOVAL_EQUATION_PERMUTATIONS_CHECK, (SubLObject)removal_modules_equation_permutations.$list21);
        inference_modules.inference_removal_module((SubLObject)removal_modules_equation_permutations.$kw22$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY, (SubLObject)removal_modules_equation_permutations.$list23);
        inference_modules.inference_removal_module((SubLObject)removal_modules_equation_permutations.$kw24$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY, (SubLObject)removal_modules_equation_permutations.$list25);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_equation_permutations.$sym26$EQUATION_PERMUTATIONS_FROM_ADDITION, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_equation_permutations.$kw27$TEST, Symbols.symbol_function((SubLObject)removal_modules_equation_permutations.EQUAL), removal_modules_equation_permutations.$kw28$OWNER, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw29$CLASSES, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw30$KB, removal_modules_equation_permutations.$kw31$TINY, removal_modules_equation_permutations.$kw32$WORKING_, removal_modules_equation_permutations.T }), (SubLObject)removal_modules_equation_permutations.$list33);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_equation_permutations.$sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_equation_permutations.$kw27$TEST, Symbols.symbol_function((SubLObject)removal_modules_equation_permutations.EQUAL), removal_modules_equation_permutations.$kw28$OWNER, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw29$CLASSES, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw30$KB, removal_modules_equation_permutations.$kw31$TINY, removal_modules_equation_permutations.$kw32$WORKING_, removal_modules_equation_permutations.T }), (SubLObject)removal_modules_equation_permutations.$list35);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_equation_permutations.$sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_equation_permutations.$kw27$TEST, Symbols.symbol_function((SubLObject)removal_modules_equation_permutations.EQUAL), removal_modules_equation_permutations.$kw28$OWNER, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw29$CLASSES, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw30$KB, removal_modules_equation_permutations.$kw31$TINY, removal_modules_equation_permutations.$kw32$WORKING_, removal_modules_equation_permutations.T }), (SubLObject)removal_modules_equation_permutations.$list37);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_equation_permutations.$sym38$EQUATION_PERMUTATIONS_FROM_DIVISION, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_equation_permutations.$kw27$TEST, Symbols.symbol_function((SubLObject)removal_modules_equation_permutations.EQUAL), removal_modules_equation_permutations.$kw28$OWNER, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw29$CLASSES, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw30$KB, removal_modules_equation_permutations.$kw31$TINY, removal_modules_equation_permutations.$kw32$WORKING_, removal_modules_equation_permutations.T }), (SubLObject)removal_modules_equation_permutations.$list39);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_equation_permutations.$sym40$EQUATION_IMMEDIATE_PERMUTATIONS, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_equation_permutations.$kw27$TEST, Symbols.symbol_function((SubLObject)removal_modules_equation_permutations.EQUAL), removal_modules_equation_permutations.$kw28$OWNER, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw29$CLASSES, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw30$KB, removal_modules_equation_permutations.$kw31$TINY, removal_modules_equation_permutations.$kw32$WORKING_, removal_modules_equation_permutations.T }), (SubLObject)removal_modules_equation_permutations.$list41);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_equation_permutations.$sym42$EQUATION_CANONICAL_PERMUTATIONS, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_equation_permutations.$kw27$TEST, Symbols.symbol_function((SubLObject)removal_modules_equation_permutations.EQUAL), removal_modules_equation_permutations.$kw28$OWNER, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw29$CLASSES, removal_modules_equation_permutations.NIL, removal_modules_equation_permutations.$kw30$KB, removal_modules_equation_permutations.$kw43$FULL, removal_modules_equation_permutations.$kw32$WORKING_, removal_modules_equation_permutations.T }), (SubLObject)removal_modules_equation_permutations.$list44);
        return (SubLObject)removal_modules_equation_permutations.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_equation_permutations_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_equation_permutations_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_equation_permutations_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_equation_permutations();
        removal_modules_equation_permutations.$equation_permutable_operators$ = null;
        removal_modules_equation_permutations.$equation_permutations_defining_mt$ = null;
        $const0$numericallyEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals"));
        $sym1$CYCL_EQUATION_P = SubLObjectFactory.makeSymbol("CYCL-EQUATION-P");
        $sym2$EQUATION_CANONICAL_PERMUTATION_ = SubLObjectFactory.makeSymbol("EQUATION-CANONICAL-PERMUTATION?");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM-EQ"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION1"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION2"));
        $const4$PlusFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn"));
        $const5$DifferenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn"));
        $const6$TimesFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn"));
        $const7$QuotientFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn"));
        $const8$LogFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogFn"));
        $const9$ExpFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpFn"));
        $const10$The = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The"));
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpFn")));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MINUEND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTRAHEND"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("DENOMINATOR"));
        $sym14$MAKE_ADDITION = SubLObjectFactory.makeSymbol("MAKE-ADDITION");
        $sym15$MAKE_MULTIPLICATION = SubLObjectFactory.makeSymbol("MAKE-MULTIPLICATION");
        $const16$equationPermutations = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations"));
        $kw17$POS = SubLObjectFactory.makeKeyword("POS");
        $sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*");
        $const19$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $kw20$REMOVAL_EQUATION_PERMUTATIONS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-CHECK");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PERMUTATION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PERMUTATION")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUATION"), (SubLObject)SubLObjectFactory.makeSymbol("PERMUTATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION-HAS-CANONICAL-PERMUTATION-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PERMUTATION")))), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equationPermutations \n  (#$numericallyEquals <bound> <bound>)\n  (#$numericallyEquals <bound> <bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))") });
        $kw22$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-ARG1-UNIFY");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_equation_permutations.TWENTY_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION"))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION-CANONICAL-PERMUTATION?")), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION-PERMUTATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION"))), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equationPermutations  <whatever> (#$numericallyEquals <bound> <bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equationPermutations \n  ?EQUATION \n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))") });
        $kw24$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-ARG2-UNIFY");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_equation_permutations.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION-CANONICAL-PERMUTATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equationPermutations")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EQUATION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equationPermutations (#$numericallyEquals <bound> <bound>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  ?PERMUTED)") });
        $sym26$EQUATION_PERMUTATIONS_FROM_ADDITION = SubLObjectFactory.makeSymbol("EQUATION-PERMUTATIONS-FROM-ADDITION");
        $kw27$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw28$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw29$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw30$KB = SubLObjectFactory.makeKeyword("KB");
        $kw31$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw32$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)SubLObjectFactory.makeKeyword("A"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("C")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("C")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("C")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("C"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")))))));
        $sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION = SubLObjectFactory.makeSymbol("EQUATION-PERMUTATIONS-FROM-SUBTRACTION");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))))));
        $sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION = SubLObjectFactory.makeSymbol("EQUATION-PERMUTATIONS-FROM-MULTIPLICATION");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)SubLObjectFactory.makeKeyword("A"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("C")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("C")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("C"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("C")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("C"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("C"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("C"))))));
        $sym38$EQUATION_PERMUTATIONS_FROM_DIVISION = SubLObjectFactory.makeSymbol("EQUATION-PERMUTATIONS-FROM-DIVISION");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))))));
        $sym40$EQUATION_IMMEDIATE_PERMUTATIONS = SubLObjectFactory.makeSymbol("EQUATION-IMMEDIATE-PERMUTATIONS");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)SubLObjectFactory.makeKeyword("A"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)SubLObjectFactory.makeKeyword("A"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("B"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("B"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"))))));
        $sym42$EQUATION_CANONICAL_PERMUTATIONS = SubLObjectFactory.makeSymbol("EQUATION-CANONICAL-PERMUTATIONS");
        $kw43$FULL = SubLObjectFactory.makeKeyword("FULL");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElectricalResistance"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Length"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BulkResistance")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Area")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Length"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElectricalResistance"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Area")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BulkResistance"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElectricalResistance"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Length"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BulkResistance")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Area"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Area"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Length"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BulkResistance")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElectricalResistance"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BulkResistance"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElectricalResistance"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Area")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Length"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("PRESSURE"), (SubLObject)SubLObjectFactory.makeKeyword("VOLUME")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("MOLARITY"), (SubLObject)SubLObjectFactory.makeKeyword("R"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPERATURE")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("MOLARITY"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("PRESSURE"), (SubLObject)SubLObjectFactory.makeKeyword("VOLUME")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("R"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPERATURE")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("PRESSURE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("MOLARITY"), (SubLObject)SubLObjectFactory.makeKeyword("R"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPERATURE")), (SubLObject)SubLObjectFactory.makeKeyword("VOLUME"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("R"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("PRESSURE"), (SubLObject)SubLObjectFactory.makeKeyword("VOLUME")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("MOLARITY"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPERATURE")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("TEMPERATURE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("PRESSURE"), (SubLObject)SubLObjectFactory.makeKeyword("VOLUME")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("MOLARITY"), (SubLObject)SubLObjectFactory.makeKeyword("R")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("VOLUME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("MOLARITY"), (SubLObject)SubLObjectFactory.makeKeyword("R"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPERATURE")), (SubLObject)SubLObjectFactory.makeKeyword("PRESSURE"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-PLUS-TIP"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("TIP-PERCENT"), (SubLObject)SubLObjectFactory.makeInteger(100)))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-PLUS-TIP"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT"), (SubLObject)SubLObjectFactory.makeKeyword("TIP-PERCENT")), (SubLObject)SubLObjectFactory.makeInteger(100)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-PLUS-TIP"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)SubLObjectFactory.makeKeyword("TIP-PERCENT"), (SubLObject)SubLObjectFactory.makeInteger(100))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("TIP-PERCENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-PLUS-TIP"), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT"))), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals")), (SubLObject)SubLObjectFactory.makeKeyword("TIP-PERCENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-PLUS-TIP"), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT")), (SubLObject)SubLObjectFactory.makeKeyword("BILL-ABOUT")))))));
    }
}

/*

	Total time: 238 ms
	
*/