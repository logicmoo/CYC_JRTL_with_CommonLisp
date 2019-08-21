/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_integer_between extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_integer_between();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_integer_between";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_integer_between_check_cost$ = makeSymbol("*DEFAULT-INTEGER-BETWEEN-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_integer_between_check_cost$ = makeSymbol("*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*");



    private static final SubLSymbol $REMOVAL_INTEGER_BETWEEN_CHECK = makeKeyword("REMOVAL-INTEGER-BETWEEN-CHECK");

    private static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("integerBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("integerBetween"), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INTEGER-BETWEEN-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INTEGER-BETWEEN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$integerBetween <integer> <integer> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$integerBetween 1 2 3)") });

    public static final SubLSymbol $integer_between_defining_mt$ = makeSymbol("*INTEGER-BETWEEN-DEFINING-MT*");



    static private final SubLList $list10 = list(makeSymbol("LOW"), makeSymbol("HIGH"));

    private static final SubLSymbol $REMOVAL_INTEGER_BETWEEN_UNIFY = makeKeyword("REMOVAL-INTEGER-BETWEEN-UNIFY");

    static private final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("integerBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("integerBetween"), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER")), $COST, makeSymbol("REMOVAL-INTEGER-BETWEEN-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("integerBetween"), list($BIND, makeSymbol("LOW")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("HIGH"))), list(list(makeKeyword("VALUE"), makeSymbol("LOW")), list(makeKeyword("VALUE"), makeSymbol("HIGH")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-INTEGER-BETWEEN-VERIFY")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LOW"), makeSymbol("HIGH")), list($CALL, makeSymbol("NEW-INTEGER-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("LOW")), list($CALL, makeSymbol("1+"), list(makeKeyword("VALUE"), makeSymbol("HIGH"))), ONE_INTEGER)), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("integerBetween"), list(makeKeyword("VALUE"), makeSymbol("LOW")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("HIGH"))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-MT"), makeSymbol("*INTEGER-BETWEEN-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$integerBetween <integer> <whatever> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$integerBetween 1 ?NUM 10)") });

    private static final SubLSymbol $REMOVAL_NOT_INTEGER_BETWEEN_CHECK = makeKeyword("REMOVAL-NOT-INTEGER-BETWEEN-CHECK");

    static private final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("integerBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("integerBetween"), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-INTEGER-BETWEEN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$integerBetween <integer> <whatever> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$integerBetween 1 42 10))") });

    private static final SubLSymbol $REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN = makeKeyword("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN");

    private static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("greaterThanOrEqualTo")), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY"), $COST, makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM <int1>) (#$greaterThanOrEqualTo <int2> ?NUM))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM 1) (#$greaterThanOrEqualTo 212 ?NUM))") });

    private static final SubLList $list17 = list(makeSymbol("MT"), makeSymbol("ASENT"));







    private static final SubLSymbol REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY = makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY");

    private static final SubLSymbol REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST = makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST");

    private static final SubLSymbol REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND = makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND");

    public static final SubLObject removal_integer_between_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject med = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            if (low.numLE(med) && med.numLE(high)) {
                backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_integer_between.make_integer_between_support(low, med, high, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_integer_between_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject med = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        if (low.numLE(med) && med.numLE(high)) {
            backward.removal_add_node(make_integer_between_support(low, med, high, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject make_integer_between_support_alt(SubLObject low, SubLObject med, SubLObject high, SubLObject negate) {
        if (negate == UNPROVIDED) {
            negate = NIL;
        }
        SubLTrampolineFile.checkType(low, INTEGERP);
        SubLTrampolineFile.checkType(med, INTEGERP);
        SubLTrampolineFile.checkType(high, INTEGERP);
        {
            SubLObject formula = list($$integerBetween, low, med, high);
            if (NIL != negate) {
                formula = cycl_utilities.negate(formula);
            }
            {
                SubLObject hl_support = arguments.make_hl_support($CODE, formula, $integer_between_defining_mt$.getGlobalValue(), $TRUE_MON);
                return hl_support;
            }
        }
    }

    public static SubLObject make_integer_between_support(final SubLObject low, final SubLObject med, final SubLObject high, SubLObject negate) {
        if (negate == UNPROVIDED) {
            negate = NIL;
        }
        assert NIL != integerp(low) : "! integerp(low) " + ("Types.integerp(low) " + "CommonSymbols.NIL != Types.integerp(low) ") + low;
        assert NIL != integerp(med) : "! integerp(med) " + ("Types.integerp(med) " + "CommonSymbols.NIL != Types.integerp(med) ") + med;
        assert NIL != integerp(high) : "! integerp(high) " + ("Types.integerp(high) " + "CommonSymbols.NIL != Types.integerp(high) ") + high;
        SubLObject formula = list($$integerBetween, low, med, high);
        if (NIL != negate) {
            formula = cycl_utilities.negate(formula);
        }
        final SubLObject hl_support = arguments.make_hl_support($CODE, formula, $integer_between_defining_mt$.getGlobalValue(), $TRUE_MON);
        return hl_support;
    }

    public static final SubLObject removal_integer_between_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            SubLObject range = add(ONE_INTEGER, subtract(high, low));
            return max(ZERO_INTEGER, range);
        }
    }

    public static SubLObject removal_integer_between_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject range = add(ONE_INTEGER, subtract(high, low));
        return max(ZERO_INTEGER, range);
    }

    public static final SubLObject removal_integer_between_verify_alt(SubLObject cycl_input) {
        {
            SubLObject datum = cycl_input;
            SubLObject current = datum;
            SubLObject low = NIL;
            SubLObject high = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            low = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt8);
            high = current.first();
            current = current.rest();
            if (NIL == current) {
                return numLE(low, high);
            } else {
                cdestructuring_bind_error(datum, $list_alt8);
            }
        }
        return NIL;
    }

    public static SubLObject removal_integer_between_verify(final SubLObject cycl_input) {
        SubLObject low = NIL;
        SubLObject high = NIL;
        destructuring_bind_must_consp(cycl_input, cycl_input, $list10);
        low = cycl_input.first();
        SubLObject current = cycl_input.rest();
        destructuring_bind_must_consp(current, cycl_input, $list10);
        high = current.first();
        current = current.rest();
        if (NIL == current) {
            return numLE(low, high);
        }
        cdestructuring_bind_error(cycl_input, $list10);
        return NIL;
    }

    public static final SubLObject removal_not_integer_between_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject med = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            if (!(low.numLE(med) && med.numLE(high))) {
                backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_integer_between.make_integer_between_support(low, med, high, T), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_not_integer_between_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject med = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        if ((!low.numLE(med)) || (!med.numLE(high))) {
            backward.removal_add_node(make_integer_between_support(low, med, high, T), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_conjunctive_integer_between_applicability_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject gt_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject lt_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                {
                    SubLObject index = ZERO_INTEGER;
                    SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt15);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt15);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != el_binary_formula_p(asent)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject pred = unmake_binary_formula(asent);
                                        SubLObject arg1 = thread.secondMultipleValue();
                                        SubLObject arg2 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject pcase_var = pred;
                                            if (pcase_var.eql($$isa)) {
                                                if ($$Integer == arg2) {
                                                    dictionary_utilities.dictionary_push(isa_dict, arg1, index);
                                                }
                                            } else {
                                                if (pcase_var.eql($$greaterThanOrEqualTo)) {
                                                    if ((NIL != variables.variable_p(arg1)) && arg2.isInteger()) {
                                                        dictionary_utilities.dictionary_push(gt_dict, arg1, index);
                                                    } else {
                                                        if (arg1.isInteger() && (NIL != variables.variable_p(arg2))) {
                                                            dictionary_utilities.dictionary_push(lt_dict, arg2, index);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt15);
                            }
                        }
                        index = add(index, ONE_INTEGER);
                    }
                }
                {
                    SubLObject subclause_specs = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(gt_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject gt_indices = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject lt_indices = dictionary.dictionary_lookup(lt_dict, var, UNPROVIDED);
                                if (NIL != lt_indices) {
                                    {
                                        SubLObject isa_indices = dictionary.dictionary_lookup(isa_dict, var, UNPROVIDED);
                                        if (NIL != isa_indices) {
                                            {
                                                SubLObject index_sets = list_utilities.cartesian_product(list(isa_indices, gt_indices, lt_indices), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject cdolist_list_var = index_sets;
                                                SubLObject indices = NIL;
                                                for (indices = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indices = cdolist_list_var.first()) {
                                                    subclause_specs = cons(clause_utilities.new_subclause_spec(NIL, indices), subclause_specs);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    return nreverse(subclause_specs);
                }
            }
        }
    }

    public static SubLObject removal_conjunctive_integer_between_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject isa_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject gt_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject lt_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list17);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list17);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != el_binary_formula_p(asent)) {
                    thread.resetMultipleValues();
                    final SubLObject pred = unmake_binary_formula(asent);
                    final SubLObject arg1 = thread.secondMultipleValue();
                    final SubLObject arg2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject pcase_var = pred;
                    if (pcase_var.eql($$isa)) {
                        if ($$Integer.eql(arg2)) {
                            dictionary_utilities.dictionary_push(isa_dict, arg1, index);
                        }
                    } else
                        if (pcase_var.eql($$greaterThanOrEqualTo)) {
                            if ((NIL != variables.variable_p(arg1)) && arg2.isInteger()) {
                                dictionary_utilities.dictionary_push(gt_dict, arg1, index);
                            } else
                                if (arg1.isInteger() && (NIL != variables.variable_p(arg2))) {
                                    dictionary_utilities.dictionary_push(lt_dict, arg2, index);
                                }

                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list17);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        SubLObject subclause_specs = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(gt_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject gt_indices = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject lt_indices = dictionary.dictionary_lookup(lt_dict, var, UNPROVIDED);
            if (NIL != lt_indices) {
                final SubLObject isa_indices = dictionary.dictionary_lookup(isa_dict, var, UNPROVIDED);
                if (NIL != isa_indices) {
                    SubLObject cdolist_list_var2;
                    final SubLObject index_sets = cdolist_list_var2 = list_utilities.cartesian_product(list(isa_indices, gt_indices, lt_indices), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject indices = NIL;
                    indices = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        subclause_specs = cons(clause_utilities.new_subclause_spec(NIL, indices), subclause_specs);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        indices = cdolist_list_var2.first();
                    } 
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return nreverse(subclause_specs);
    }

    public static final SubLObject removal_conjunctive_integer_between_cost_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject min = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_integer_between.removal_conjunctive_integer_between_destructure(contextualized_dnf_clause);
                SubLObject max = thread.secondMultipleValue();
                SubLObject variable = thread.thirdMultipleValue();
                SubLObject ordering = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (max.numL(min)) {
                    return ZERO_INTEGER;
                } else {
                    return number_utilities.f_1X(subtract(max, min));
                }
            }
        }
    }

    public static SubLObject removal_conjunctive_integer_between_cost(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject min = removal_conjunctive_integer_between_destructure(contextualized_dnf_clause);
        final SubLObject max = thread.secondMultipleValue();
        final SubLObject variable = thread.thirdMultipleValue();
        final SubLObject ordering = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (max.numL(min)) {
            return ZERO_INTEGER;
        }
        return number_utilities.f_1X(subtract(max, min));
    }

    public static final SubLObject removal_conjunctive_integer_between_expand_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject min = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_integer_between.removal_conjunctive_integer_between_destructure(contextualized_dnf_clause);
                SubLObject max = thread.secondMultipleValue();
                SubLObject variable = thread.thirdMultipleValue();
                SubLObject ordering = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject n = min;
                    while (n.numLE(max)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(variable, n, UNPROVIDED, UNPROVIDED);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject isa_support_sentence = make_binary_formula($$isa, n, $$Integer);
                                    SubLObject gt_support_sentence = make_binary_formula($$greaterThanOrEqualTo, n, min);
                                    SubLObject lt_support_sentence = make_binary_formula($$greaterThanOrEqualTo, max, n);
                                    SubLObject isa_supports = list(arguments.make_hl_support($ISA, isa_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                                    SubLObject gt_supports = list(arguments.make_hl_support($EVAL, gt_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                                    SubLObject lt_supports = list(arguments.make_hl_support($EVAL, lt_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                                    SubLObject justifications = list_utilities.permute(list(isa_supports, gt_supports, lt_supports), ordering);
                                    inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                                }
                            }
                        }
                        n = add(n, ONE_INTEGER);
                    } 
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_conjunctive_integer_between_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject min = removal_conjunctive_integer_between_destructure(contextualized_dnf_clause);
        final SubLObject max = thread.secondMultipleValue();
        final SubLObject variable = thread.thirdMultipleValue();
        final SubLObject ordering = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        for (SubLObject n = min; n.numLE(max); n = add(n, ONE_INTEGER)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, n, UNPROVIDED, UNPROVIDED);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject isa_support_sentence = make_binary_formula($$isa, n, $$Integer);
                final SubLObject gt_support_sentence = make_binary_formula($$greaterThanOrEqualTo, n, min);
                final SubLObject lt_support_sentence = make_binary_formula($$greaterThanOrEqualTo, max, n);
                final SubLObject isa_supports = list(arguments.make_hl_support($ISA, isa_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                final SubLObject gt_supports = list(arguments.make_hl_support($EVAL, gt_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                final SubLObject lt_supports = list(arguments.make_hl_support($EVAL, lt_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                final SubLObject justifications = list_utilities.permute(list(isa_supports, gt_supports, lt_supports), ordering);
                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_conjunctive_integer_between_destructure_alt(SubLObject contextualized_dnf_clause) {
        {
            SubLObject min = NIL;
            SubLObject max = NIL;
            SubLObject variable = NIL;
            SubLObject permutation = NIL;
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                {
                    SubLObject datum = contextualized_asent;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$greaterThanOrEqualTo)) && cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED).isInteger()) {
                            min = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                            permutation = cons(ONE_INTEGER, permutation);
                        } else {
                            if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$greaterThanOrEqualTo)) && cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED).isInteger()) {
                                max = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                                permutation = cons(TWO_INTEGER, permutation);
                            } else {
                                variable = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                                permutation = cons(ZERO_INTEGER, permutation);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt15);
                    }
                }
                index = add(index, ONE_INTEGER);
            }
            permutation = nreverse(permutation);
            return values(min, max, variable, permutation);
        }
    }

    public static SubLObject removal_conjunctive_integer_between_destructure(final SubLObject contextualized_dnf_clause) {
        SubLObject min = NIL;
        SubLObject max = NIL;
        SubLObject variable = NIL;
        SubLObject permutation = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list17);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list17);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$greaterThanOrEqualTo)) && cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED).isInteger()) {
                    min = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    permutation = cons(ONE_INTEGER, permutation);
                } else
                    if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$greaterThanOrEqualTo)) && cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED).isInteger()) {
                        max = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                        permutation = cons(TWO_INTEGER, permutation);
                    } else {
                        variable = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                        permutation = cons(ZERO_INTEGER, permutation);
                    }

            } else {
                cdestructuring_bind_error(datum, $list17);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        permutation = nreverse(permutation);
        return values(min, max, variable, permutation);
    }

    public static SubLObject declare_removal_modules_integer_between_file() {
        declareFunction("removal_integer_between_check_expand", "REMOVAL-INTEGER-BETWEEN-CHECK-EXPAND", 1, 1, false);
        declareFunction("make_integer_between_support", "MAKE-INTEGER-BETWEEN-SUPPORT", 3, 1, false);
        declareFunction("removal_integer_between_unify_cost", "REMOVAL-INTEGER-BETWEEN-UNIFY-COST", 1, 1, false);
        declareFunction("removal_integer_between_verify", "REMOVAL-INTEGER-BETWEEN-VERIFY", 1, 0, false);
        declareFunction("removal_not_integer_between_check_expand", "REMOVAL-NOT-INTEGER-BETWEEN-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_conjunctive_integer_between_applicability", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY", 1, 0, false);
        declareFunction("removal_conjunctive_integer_between_cost", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST", 1, 0, false);
        declareFunction("removal_conjunctive_integer_between_expand", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND", 1, 0, false);
        declareFunction("removal_conjunctive_integer_between_destructure", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-DESTRUCTURE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("integerBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("integerBetween"), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INTEGER-BETWEEN-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INTEGER-BETWEEN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$integerBetween <integer> <integer> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$integerBetween 1 2 3)") });

    static private final SubLList $list_alt8 = list(makeSymbol("LOW"), makeSymbol("HIGH"));

    public static final SubLObject init_removal_modules_integer_between_file_alt() {
        defparameter("*DEFAULT-INTEGER-BETWEEN-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*INTEGER-BETWEEN-DEFINING-MT*", NIL != boundp($integer_between_defining_mt$) ? ((SubLObject) ($integer_between_defining_mt$.getGlobalValue())) : $$BaseKB);
        defparameter("*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        return NIL;
    }

    public static SubLObject init_removal_modules_integer_between_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*DEFAULT-INTEGER-BETWEEN-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
            deflexical("*INTEGER-BETWEEN-DEFINING-MT*", SubLTrampolineFile.maybeDefault($integer_between_defining_mt$, $integer_between_defining_mt$, $$BaseKB));
            defparameter("*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        }
        if (SubLFiles.USE_V2) {
            deflexical("*INTEGER-BETWEEN-DEFINING-MT*", NIL != boundp($integer_between_defining_mt$) ? ((SubLObject) ($integer_between_defining_mt$.getGlobalValue())) : $$BaseKB);
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_integer_between_file_Previous() {
        defparameter("*DEFAULT-INTEGER-BETWEEN-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*INTEGER-BETWEEN-DEFINING-MT*", SubLTrampolineFile.maybeDefault($integer_between_defining_mt$, $integer_between_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        return NIL;
    }

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("integerBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("integerBetween"), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER")), $COST, makeSymbol("REMOVAL-INTEGER-BETWEEN-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("integerBetween"), list($BIND, makeSymbol("LOW")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("HIGH"))), list(list(makeKeyword("VALUE"), makeSymbol("LOW")), list(makeKeyword("VALUE"), makeSymbol("HIGH")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-INTEGER-BETWEEN-VERIFY")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LOW"), makeSymbol("HIGH")), list($CALL, makeSymbol("NEW-INTEGER-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("LOW")), list($CALL, makeSymbol("1+"), list(makeKeyword("VALUE"), makeSymbol("HIGH"))), ONE_INTEGER)), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("integerBetween"), list(makeKeyword("VALUE"), makeSymbol("LOW")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("HIGH"))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-MT"), makeSymbol("*INTEGER-BETWEEN-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$integerBetween <integer> <whatever> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$integerBetween 1 ?NUM 10)") });

    public static final SubLObject setup_removal_modules_integer_between_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$integerBetween);
        inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_CHECK, $list_alt2);
        declare_defglobal($integer_between_defining_mt$);
        mt_vars.note_mt_var($integer_between_defining_mt$, $$integerBetween);
        inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_UNIFY, $list_alt10);
        inference_modules.inference_removal_module($REMOVAL_NOT_INTEGER_BETWEEN_CHECK, $list_alt12);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN, $list_alt14);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND);
        return NIL;
    }

    public static SubLObject setup_removal_modules_integer_between_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$integerBetween);
            preference_modules.doomed_unless_arg_bindable($POS, $$integerBetween, ONE_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $$integerBetween, THREE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$integerBetween);
            inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_CHECK, $list4);
            declare_defglobal($integer_between_defining_mt$);
            mt_vars.note_mt_var($integer_between_defining_mt$, $$integerBetween);
            inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_UNIFY, $list12);
            inference_modules.inference_removal_module($REMOVAL_NOT_INTEGER_BETWEEN_CHECK, $list14);
            inference_modules.inference_conjunctive_removal_module($REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN, $list16);
            note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY);
            note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST);
            note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_CHECK, $list_alt2);
            inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_UNIFY, $list_alt10);
            inference_modules.inference_removal_module($REMOVAL_NOT_INTEGER_BETWEEN_CHECK, $list_alt12);
            inference_modules.inference_conjunctive_removal_module($REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN, $list_alt14);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_integer_between_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$integerBetween);
        preference_modules.doomed_unless_arg_bindable($POS, $$integerBetween, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$integerBetween, THREE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$integerBetween);
        inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_CHECK, $list4);
        declare_defglobal($integer_between_defining_mt$);
        mt_vars.note_mt_var($integer_between_defining_mt$, $$integerBetween);
        inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_UNIFY, $list12);
        inference_modules.inference_removal_module($REMOVAL_NOT_INTEGER_BETWEEN_CHECK, $list14);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN, $list16);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_integer_between_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_integer_between_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_integer_between_file();
    }

    static {
    }

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("integerBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("integerBetween"), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-INTEGER-BETWEEN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$integerBetween <integer> <whatever> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$integerBetween 1 42 10))") });

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("greaterThanOrEqualTo")), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY"), $COST, makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM <int1>) (#$greaterThanOrEqualTo <int2> ?NUM))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM 1) (#$greaterThanOrEqualTo 212 ?NUM))") });

    static private final SubLList $list_alt15 = list(makeSymbol("MT"), makeSymbol("ASENT"));
}

/**
 * Total time: 81 ms
 */
