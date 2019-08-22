package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class prop_sentence_clausifier extends SubLTranslatedFile {
    public static final SubLFile me = new prop_sentence_clausifier();

    public static final String myName = "com.cyc.cycjava.cycl.prop_sentence_clausifier";

    public static final String myFingerPrint = "f7bb49e9a9245d0ad85c2deae675ce9d75a047b3bc023a397ec542f749f8076a";

    // defparameter
    public static final SubLSymbol $prop_sentence_and$ = makeSymbol("*PROP-SENTENCE-AND*");

    // defparameter
    public static final SubLSymbol $prop_sentence_or$ = makeSymbol("*PROP-SENTENCE-OR*");

    // defparameter
    public static final SubLSymbol $prop_sentence_not$ = makeSymbol("*PROP-SENTENCE-NOT*");

    // defparameter
    public static final SubLSymbol $prop_sentence_true$ = makeSymbol("*PROP-SENTENCE-TRUE*");

    // defparameter
    public static final SubLSymbol $prop_sentence_false$ = makeSymbol("*PROP-SENTENCE-FALSE*");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    public static final SubLSymbol PROP_SENTENCE_NEGATE = makeSymbol("PROP-SENTENCE-NEGATE");

    public static final SubLSymbol PROP_SENTENCE_ARG_OPERATOR = makeSymbol("PROP-SENTENCE-ARG-OPERATOR");

    public static final SubLList $list7 = list(makeSymbol("ARG"));

    public static final SubLList $list8 = list(makeSymbol("INNER-ARG"));

    public static final SubLString $str9$Can_t_handle__S = makeString("Can't handle ~S");

    public static final SubLSymbol PROP_SENTENCE_CANON_NEGATIONS_IN = makeSymbol("PROP-SENTENCE-CANON-NEGATIONS-IN");

    public static final SubLSymbol PROP_SENTENCE_CANON_DISJUNCTIONS_IN = makeSymbol("PROP-SENTENCE-CANON-DISJUNCTIONS-IN");

    public static final SubLSymbol PROP_SENTENCE_CANON_CONJUNCTIONS_IN = makeSymbol("PROP-SENTENCE-CANON-CONJUNCTIONS-IN");

    public static final SubLList $list13 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    public static final SubLSymbol PROP_SENTENCE_SIMPLIFY = makeSymbol("PROP-SENTENCE-SIMPLIFY");

    public static final SubLList $list15 = cons(makeSymbol("INNER-OPERATOR"), makeSymbol("INNER-ARGS"));

    public static final SubLList $list16 = list(makeSymbol("OPERATOR"), makeSymbol("ARG"));

    public static final SubLList $list17 = cons(makeSymbol("FIRST-ARG"), makeSymbol("REST-ARGS"));

    public static SubLObject prop_sentence_conjoin_p(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return equal($prop_sentence_and$.getDynamicValue(thread), sentence.first());
    }

    public static SubLObject prop_sentence_disjoin_p(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return equal($prop_sentence_or$.getDynamicValue(thread), sentence.first());
    }

    public static SubLObject prop_sentence_negation_p(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return equal($prop_sentence_not$.getDynamicValue(thread), sentence.first());
    }

    public static SubLObject prop_sentence_conjoin(final SubLObject sentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cons($prop_sentence_and$.getDynamicValue(thread), sentences);
    }

    public static SubLObject prop_sentence_disjoin(final SubLObject sentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cons($prop_sentence_or$.getDynamicValue(thread), sentences);
    }

    public static SubLObject prop_sentence_negate(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list($prop_sentence_not$.getDynamicValue(thread), prop_sentence);
    }

    public static SubLObject prop_sentence_negate_args(final SubLObject sentence_list) {
        return Mapping.mapcar(PROP_SENTENCE_NEGATE, sentence_list);
    }

    public static SubLObject prop_sentence_args(final SubLObject sentence) {
        return sentence.rest();
    }

    public static SubLObject find_arg_with_operator(final SubLObject operator, final SubLObject args) {
        return find(operator, args, symbol_function(EQL), symbol_function(PROP_SENTENCE_ARG_OPERATOR), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject prop_sentence_arg_operator(final SubLObject v_object) {
        if (v_object.isCons()) {
            return v_object.first();
        }
        return NIL;
    }

    public static SubLObject prop_sentence_to_cnf(SubLObject prop_sentence) {
        if (!prop_sentence.isAtom()) {
            prop_sentence = prop_sentence_canon_negations_in(prop_sentence);
            prop_sentence = prop_sentence_canon_disjunctions_in(prop_sentence);
        }
        return prop_sentence;
    }

    public static SubLObject prop_sentence_to_dnf(SubLObject prop_sentence) {
        if (!prop_sentence.isAtom()) {
            prop_sentence = prop_sentence_canon_negations_in(prop_sentence);
            prop_sentence = prop_sentence_canon_conjunctions_in(prop_sentence);
        }
        return prop_sentence;
    }

    public static SubLObject prop_sentence_canon_negations_in(final SubLObject prop_sentence) {
        if (prop_sentence.isAtom()) {
            return prop_sentence;
        }
        if (NIL != prop_sentence_negation_p(prop_sentence)) {
            SubLObject current;
            final SubLObject datum = current = prop_sentence_args(prop_sentence);
            SubLObject arg = NIL;
            destructuring_bind_must_consp(current, datum, $list7);
            arg = current.first();
            current = current.rest();
            if (NIL == current) {
                if (arg.isAtom()) {
                    return prop_sentence;
                }
                if (NIL != prop_sentence_negation_p(arg)) {
                    SubLObject current_$2;
                    final SubLObject datum_$1 = current_$2 = prop_sentence_args(arg);
                    SubLObject inner_arg = NIL;
                    destructuring_bind_must_consp(current_$2, datum_$1, $list8);
                    inner_arg = current_$2.first();
                    current_$2 = current_$2.rest();
                    if (NIL == current_$2) {
                        return prop_sentence_canon_negations_in(inner_arg);
                    }
                    cdestructuring_bind_error(datum_$1, $list8);
                } else {
                    if (NIL != prop_sentence_conjoin_p(arg)) {
                        return prop_sentence_canon_negations_in(prop_sentence_disjoin(prop_sentence_negate_args(prop_sentence_args(arg))));
                    }
                    if (NIL != prop_sentence_disjoin_p(arg)) {
                        return prop_sentence_canon_negations_in(prop_sentence_conjoin(prop_sentence_negate_args(prop_sentence_args(arg))));
                    }
                    return Errors.error($str9$Can_t_handle__S, prop_sentence);
                }
            } else {
                cdestructuring_bind_error(datum, $list7);
            }
            return NIL;
        }
        if (NIL != prop_sentence_conjoin_p(prop_sentence)) {
            return prop_sentence_conjoin(Mapping.mapcar(PROP_SENTENCE_CANON_NEGATIONS_IN, prop_sentence_args(prop_sentence)));
        }
        if (NIL != prop_sentence_disjoin_p(prop_sentence)) {
            return prop_sentence_disjoin(Mapping.mapcar(PROP_SENTENCE_CANON_NEGATIONS_IN, prop_sentence_args(prop_sentence)));
        }
        return Errors.error($str9$Can_t_handle__S, prop_sentence);
    }

    public static SubLObject prop_sentence_canon_disjunctions_in(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prop_sentence.isAtom()) {
            return prop_sentence;
        }
        if (NIL != prop_sentence_negation_p(prop_sentence)) {
            return prop_sentence;
        }
        if (NIL != prop_sentence_conjoin_p(prop_sentence)) {
            return prop_sentence_conjoin(Mapping.mapcar(PROP_SENTENCE_CANON_DISJUNCTIONS_IN, prop_sentence_args(prop_sentence)));
        }
        if (NIL == prop_sentence_disjoin_p(prop_sentence)) {
            return Errors.error($str9$Can_t_handle__S, prop_sentence);
        }
        final SubLObject args = prop_sentence_args(prop_sentence);
        final SubLObject nested_conjunction = find_arg_with_operator($prop_sentence_and$.getDynamicValue(thread), args);
        if (NIL == nested_conjunction) {
            return prop_sentence;
        }
        final SubLObject other_disjuncts = delete(nested_conjunction, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != other_disjuncts) {
            SubLObject new_conjuncts = NIL;
            SubLObject cdolist_list_var = nested_conjunction.rest();
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_disjuncts = cons(conjunct, other_disjuncts);
                new_conjuncts = cons(prop_sentence_disjoin(new_disjuncts), new_conjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            return prop_sentence_conjoin(Mapping.mapcar(PROP_SENTENCE_CANON_DISJUNCTIONS_IN, new_conjuncts));
        }
        return nested_conjunction;
    }

    public static SubLObject prop_sentence_canon_conjunctions_in(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prop_sentence.isAtom()) {
            return prop_sentence;
        }
        if (NIL != prop_sentence_negation_p(prop_sentence)) {
            return prop_sentence;
        }
        if (NIL != prop_sentence_disjoin_p(prop_sentence)) {
            return prop_sentence_disjoin(Mapping.mapcar(PROP_SENTENCE_CANON_CONJUNCTIONS_IN, prop_sentence_args(prop_sentence)));
        }
        if (NIL == prop_sentence_conjoin_p(prop_sentence)) {
            return Errors.error($str9$Can_t_handle__S, prop_sentence);
        }
        final SubLObject args = prop_sentence_args(prop_sentence);
        final SubLObject nested_disjunction = find_arg_with_operator($prop_sentence_or$.getDynamicValue(thread), args);
        if (NIL == nested_disjunction) {
            return prop_sentence;
        }
        final SubLObject other_conjuncts = delete(nested_disjunction, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != other_conjuncts) {
            SubLObject new_disjuncts = NIL;
            SubLObject cdolist_list_var = nested_disjunction.rest();
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_conjuncts = cons(disjunct, other_conjuncts);
                new_disjuncts = cons(prop_sentence_conjoin(new_conjuncts), new_disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            } 
            return prop_sentence_disjoin(Mapping.mapcar(PROP_SENTENCE_CANON_CONJUNCTIONS_IN, new_disjuncts));
        }
        return nested_disjunction;
    }

    public static SubLObject prop_sentence_simplify(final SubLObject prop_sentence) {
        if (prop_sentence.isAtom()) {
            return prop_sentence;
        }
        if (NIL != prop_sentence_conjoin_p(prop_sentence)) {
            return prop_sentence_simplify_and(prop_sentence);
        }
        if (NIL != prop_sentence_disjoin_p(prop_sentence)) {
            return prop_sentence_simplify_or(prop_sentence);
        }
        if (NIL != prop_sentence_negation_p(prop_sentence)) {
            return prop_sentence_simplify_not(prop_sentence);
        }
        return Errors.error($str9$Can_t_handle__S, prop_sentence);
    }

    public static SubLObject prop_sentence_simplify_and(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(prop_sentence, prop_sentence, $list13);
        operator = prop_sentence.first();
        final SubLObject current = args = prop_sentence.rest();
        args = Mapping.mapcar(PROP_SENTENCE_SIMPLIFY, args);
        SubLObject lifted_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = arg;
                SubLObject inner_operator = NIL;
                SubLObject inner_args = NIL;
                destructuring_bind_must_consp(current_$4, datum_$3, $list15);
                inner_operator = current_$4.first();
                current_$4 = inner_args = current_$4.rest();
                if ($prop_sentence_and$.getDynamicValue(thread).eql(inner_operator)) {
                    SubLObject cdolist_list_var_$5 = inner_args;
                    SubLObject inner_arg = NIL;
                    inner_arg = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        lifted_args = cons(inner_arg, lifted_args);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        inner_arg = cdolist_list_var_$5.first();
                    } 
                } else {
                    lifted_args = cons(arg, lifted_args);
                }
            } else {
                lifted_args = cons(arg, lifted_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        args = nreverse(lifted_args);
        args = delete_duplicates(args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        args = delete($prop_sentence_true$.getDynamicValue(thread), args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == args) {
            return $prop_sentence_true$.getDynamicValue(thread);
        }
        if (NIL != list_utilities.singletonP(args)) {
            SubLObject current_$5;
            final SubLObject datum_$4 = current_$5 = args;
            arg = NIL;
            destructuring_bind_must_consp(current_$5, datum_$4, $list7);
            arg = current_$5.first();
            current_$5 = current_$5.rest();
            if (NIL == current_$5) {
                return arg;
            }
            cdestructuring_bind_error(datum_$4, $list7);
            return NIL;
        } else {
            if (NIL != subl_promotions.memberP($prop_sentence_false$.getDynamicValue(thread), args, symbol_function(EQUAL), UNPROVIDED)) {
                return $prop_sentence_false$.getDynamicValue(thread);
            }
            if (NIL != prop_literal_duals_foundP(args)) {
                return $prop_sentence_false$.getDynamicValue(thread);
            }
            return prop_sentence_conjoin(args);
        }
    }

    public static SubLObject prop_sentence_simplify_or(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(prop_sentence, prop_sentence, $list13);
        operator = prop_sentence.first();
        final SubLObject current = args = prop_sentence.rest();
        args = Mapping.mapcar(PROP_SENTENCE_SIMPLIFY, args);
        SubLObject lifted_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current_$9;
                final SubLObject datum_$8 = current_$9 = arg;
                SubLObject inner_operator = NIL;
                SubLObject inner_args = NIL;
                destructuring_bind_must_consp(current_$9, datum_$8, $list15);
                inner_operator = current_$9.first();
                current_$9 = inner_args = current_$9.rest();
                if ($prop_sentence_or$.getDynamicValue(thread).eql(inner_operator)) {
                    SubLObject cdolist_list_var_$10 = inner_args;
                    SubLObject inner_arg = NIL;
                    inner_arg = cdolist_list_var_$10.first();
                    while (NIL != cdolist_list_var_$10) {
                        lifted_args = cons(inner_arg, lifted_args);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        inner_arg = cdolist_list_var_$10.first();
                    } 
                } else {
                    lifted_args = cons(arg, lifted_args);
                }
            } else {
                lifted_args = cons(arg, lifted_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        args = nreverse(lifted_args);
        args = delete_duplicates(args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        args = delete($prop_sentence_false$.getDynamicValue(thread), args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == args) {
            return $prop_sentence_false$.getDynamicValue(thread);
        }
        if (NIL != list_utilities.singletonP(args)) {
            return args.first();
        }
        if (NIL != subl_promotions.memberP($prop_sentence_true$.getDynamicValue(thread), args, symbol_function(EQUAL), UNPROVIDED)) {
            return $prop_sentence_true$.getDynamicValue(thread);
        }
        if (NIL != prop_literal_duals_foundP(args)) {
            return $prop_sentence_true$.getDynamicValue(thread);
        }
        return prop_sentence_disjoin(args);
    }

    public static SubLObject prop_sentence_simplify_not(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject arg = NIL;
        destructuring_bind_must_consp(prop_sentence, prop_sentence, $list16);
        operator = prop_sentence.first();
        SubLObject current = prop_sentence.rest();
        destructuring_bind_must_consp(current, prop_sentence, $list16);
        arg = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(prop_sentence, $list16);
            return NIL;
        }
        arg = prop_sentence_simplify(arg);
        if (arg.equal($prop_sentence_true$.getDynamicValue(thread))) {
            return $prop_sentence_false$.getDynamicValue(thread);
        }
        if (arg.equal($prop_sentence_false$.getDynamicValue(thread))) {
            return $prop_sentence_true$.getDynamicValue(thread);
        }
        if (arg.isCons() && $prop_sentence_not$.getDynamicValue(thread).eql(arg.first())) {
            return second(arg);
        }
        return prop_sentence_negate(arg);
    }

    public static SubLObject prop_literal_duals_foundP(final SubLObject args) {
        if (NIL == args) {
            return NIL;
        }
        SubLObject first_arg = NIL;
        SubLObject rest_args = NIL;
        destructuring_bind_must_consp(args, args, $list17);
        first_arg = args.first();
        final SubLObject current = rest_args = args.rest();
        if (NIL != prop_literal_duals_foundP(rest_args)) {
            return T;
        }
        SubLObject cdolist_list_var = rest_args;
        SubLObject rest_arg = NIL;
        rest_arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != prop_literal_dual_p(first_arg, rest_arg)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rest_arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject prop_literal_dual_p(final SubLObject prop_literal1, final SubLObject prop_literal2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prop_literal1.isCons() && $prop_sentence_not$.getDynamicValue(thread).eql(prop_literal1.first())) {
            return equal(second(prop_literal1), prop_literal2);
        }
        if (prop_literal2.isCons() && $prop_sentence_not$.getDynamicValue(thread).eql(prop_literal2.first())) {
            return equal(prop_literal1, second(prop_literal2));
        }
        return NIL;
    }

    public static SubLObject declare_prop_sentence_clausifier_file() {
        declareFunction(me, "prop_sentence_conjoin_p", "PROP-SENTENCE-CONJOIN-P", 1, 0, false);
        declareFunction(me, "prop_sentence_disjoin_p", "PROP-SENTENCE-DISJOIN-P", 1, 0, false);
        declareFunction(me, "prop_sentence_negation_p", "PROP-SENTENCE-NEGATION-P", 1, 0, false);
        declareFunction(me, "prop_sentence_conjoin", "PROP-SENTENCE-CONJOIN", 1, 0, false);
        declareFunction(me, "prop_sentence_disjoin", "PROP-SENTENCE-DISJOIN", 1, 0, false);
        declareFunction(me, "prop_sentence_negate", "PROP-SENTENCE-NEGATE", 1, 0, false);
        declareFunction(me, "prop_sentence_negate_args", "PROP-SENTENCE-NEGATE-ARGS", 1, 0, false);
        declareFunction(me, "prop_sentence_args", "PROP-SENTENCE-ARGS", 1, 0, false);
        declareFunction(me, "find_arg_with_operator", "FIND-ARG-WITH-OPERATOR", 2, 0, false);
        declareFunction(me, "prop_sentence_arg_operator", "PROP-SENTENCE-ARG-OPERATOR", 1, 0, false);
        declareFunction(me, "prop_sentence_to_cnf", "PROP-SENTENCE-TO-CNF", 1, 0, false);
        declareFunction(me, "prop_sentence_to_dnf", "PROP-SENTENCE-TO-DNF", 1, 0, false);
        declareFunction(me, "prop_sentence_canon_negations_in", "PROP-SENTENCE-CANON-NEGATIONS-IN", 1, 0, false);
        declareFunction(me, "prop_sentence_canon_disjunctions_in", "PROP-SENTENCE-CANON-DISJUNCTIONS-IN", 1, 0, false);
        declareFunction(me, "prop_sentence_canon_conjunctions_in", "PROP-SENTENCE-CANON-CONJUNCTIONS-IN", 1, 0, false);
        declareFunction(me, "prop_sentence_simplify", "PROP-SENTENCE-SIMPLIFY", 1, 0, false);
        declareFunction(me, "prop_sentence_simplify_and", "PROP-SENTENCE-SIMPLIFY-AND", 1, 0, false);
        declareFunction(me, "prop_sentence_simplify_or", "PROP-SENTENCE-SIMPLIFY-OR", 1, 0, false);
        declareFunction(me, "prop_sentence_simplify_not", "PROP-SENTENCE-SIMPLIFY-NOT", 1, 0, false);
        declareFunction(me, "prop_literal_duals_foundP", "PROP-LITERAL-DUALS-FOUND?", 1, 0, false);
        declareFunction(me, "prop_literal_dual_p", "PROP-LITERAL-DUAL-P", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_prop_sentence_clausifier_file() {
        defparameter("*PROP-SENTENCE-AND*", $$and);
        defparameter("*PROP-SENTENCE-OR*", $$or);
        defparameter("*PROP-SENTENCE-NOT*", $$not);
        defparameter("*PROP-SENTENCE-TRUE*", $$True);
        defparameter("*PROP-SENTENCE-FALSE*", $$False);
        return NIL;
    }

    public static SubLObject setup_prop_sentence_clausifier_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_prop_sentence_clausifier_file();
    }

    @Override
    public void initializeVariables() {
        init_prop_sentence_clausifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_prop_sentence_clausifier_file();
    }

    
}

/**
 * Total time: 69 ms
 */
