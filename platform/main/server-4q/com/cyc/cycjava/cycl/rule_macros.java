/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.arg_isa_binary_litP;
import static com.cyc.cycjava.cycl.el_utilities.binary_lit_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.genls_litP;
import static com.cyc.cycjava.cycl.el_utilities.isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_quaternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.reflexive_litP;
import static com.cyc.cycjava.cycl.el_utilities.reflexive_lits;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rule_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rule_macros();

 public static final String myName = "com.cyc.cycjava.cycl.rule_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CANONICALIZE_CLAUSE_WRT_RULE_MACROS = makeSymbol("CANONICALIZE-CLAUSE-WRT-RULE-MACROS");

    static private final SubLSymbol $sym1$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLList $list2 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLList $list3 = list(list(list(list(makeSymbol("ISA"), makeSymbol("VAR"), makeSymbol("COL"))), list(makeSymbol("POS-LIT"))));





    static private final SubLString $str6$invalid_required_arg_pred_index__ = makeString("invalid required-arg-pred index: ~s");

    static private final SubLList $list7 = list(list(makeSymbol("NEG-LITS-1"), makeSymbol("POS-LITS-1")), list(makeSymbol("NEG-LITS-2"), makeSymbol("POS-LITS-2")));

    static private final SubLList $list8 = list(list(list(list(makeSymbol("ISA"), makeSymbol("VAR"), makeSymbol("COL"))), list(makeSymbol("POS-LIT-1"))), list(list(makeSymbol("NEG-LIT-2")), list(makeSymbol("POS-LIT-2"))));

















    static private final SubLString $str17$invalid_relation_type_index___s = makeString("invalid relation-type index: ~s");

    static private final SubLString $str18$invalid_relation_type_rule_macro_ = makeString("invalid relation-type rule-macro-pred: ~s");







    static private final SubLList $list22 = list(makeSymbol("NEG-LITS"), list(list(makeSymbol("POS-ISA"), makeSymbol("POS-ISA-VAR"), makeSymbol("POS-ISA-COL"))));

    static private final SubLList $list23 = list(makeSymbol("NEG-ISA"), makeSymbol("NEG-ISA-VAR"), makeSymbol("NEG-ISA-COL"));























    // Definitions
    /**
     * If CLAUSES or its elements match certain hard-coded patterns, they are converted to rule macros.
     * Otherwise they are left alone.
     */
    @LispMethod(comment = "If CLAUSES or its elements match certain hard-coded patterns, they are converted to rule macros.\r\nOtherwise they are left alone.\nIf CLAUSES or its elements match certain hard-coded patterns, they are converted to rule macros.\nOtherwise they are left alone.")
    public static final SubLObject canonicalize_clauses_wrt_rule_macros_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == czer_vars.$express_as_rule_macroP$.getDynamicValue(thread)) {
                return v_clauses;
            } else {
                if (NIL != com.cyc.cycjava.cycl.rule_macros.required_arg_pred_clausesP(v_clauses, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.rule_macros.express_as_required_arg_pred(v_clauses);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.rule_macros.relation_type_clausesP(v_clauses, UNPROVIDED)) {
                        return com.cyc.cycjava.cycl.rule_macros.express_as_relation_type(v_clauses);
                    } else {
                        return Mapping.mapcar(CANONICALIZE_CLAUSE_WRT_RULE_MACROS, v_clauses);
                    }
                }
            }
        }
    }

    // Definitions
    /**
     * If CLAUSES or its elements match certain hard-coded patterns, they are converted to rule macros.
     * Otherwise they are left alone.
     */
    @LispMethod(comment = "If CLAUSES or its elements match certain hard-coded patterns, they are converted to rule macros.\r\nOtherwise they are left alone.\nIf CLAUSES or its elements match certain hard-coded patterns, they are converted to rule macros.\nOtherwise they are left alone.")
    public static SubLObject canonicalize_clauses_wrt_rule_macros(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_vars.$express_as_rule_macroP$.getDynamicValue(thread)) {
            return v_clauses;
        }
        if (NIL != required_arg_pred_clausesP(v_clauses, UNPROVIDED)) {
            return express_as_required_arg_pred(v_clauses);
        }
        if (NIL != relation_type_clausesP(v_clauses, UNPROVIDED)) {
            return express_as_relation_type(v_clauses);
        }
        return Mapping.mapcar(CANONICALIZE_CLAUSE_WRT_RULE_MACROS, v_clauses);
    }

    /**
     *
     *
     * @return boolean; t iff all the following conditions are met:
    There must be exactly 1 clause.
    In this clause, there must be exactly 1 neg-lit of the form (#$isa <var> <col>).
    <var> must be a variable and <col> must be a collection.
    There must be exactly 1 pos-lit.
    The pos-lit must contain <var> exactly once, in either position 1 or 2 (determined by @xref required-arg-pred).
    Also, all of the pos-lit's arguments (except <var>) must be unreified Skolem functions.
    An positive example is the CNF form of:
    (#$implies
    (#$isa ?X <col>)
    (#$thereExists ?Y
    (<pred> ?X ?Y))).
     */
    @LispMethod(comment = "@return boolean; t iff all the following conditions are met:\r\nThere must be exactly 1 clause.\r\nIn this clause, there must be exactly 1 neg-lit of the form (#$isa <var> <col>).\r\n<var> must be a variable and <col> must be a collection.\r\nThere must be exactly 1 pos-lit.\r\nThe pos-lit must contain <var> exactly once, in either position 1 or 2 (determined by @xref required-arg-pred).\r\nAlso, all of the pos-lit\'s arguments (except <var>) must be unreified Skolem functions.\r\nAn positive example is the CNF form of:\r\n(#$implies\r\n(#$isa ?X <col>)\r\n(#$thereExists ?Y\r\n(<pred> ?X ?Y))).")
    public static final SubLObject required_arg_pred_clausesP_alt(SubLObject v_clauses, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_required_arg_predP$.getDynamicValue(thread)) {
                if (NIL != list_utilities.singletonP(v_clauses)) {
                    {
                        SubLObject datum = v_clauses.first();
                        SubLObject current = datum;
                        SubLObject neg_lits = NIL;
                        SubLObject pos_lits = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt2);
                        neg_lits = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt2);
                        pos_lits = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                                {
                                    SubLObject neg_lit = neg_lits.first();
                                    if (NIL != isa_litP(neg_lit)) {
                                        {
                                            SubLObject var = literal_arg1(neg_lit, UNPROVIDED);
                                            SubLObject col = literal_arg2(neg_lit, UNPROVIDED);
                                            if ((NIL != funcall(varP, var)) && (NIL != fort_types_interface.collectionP(col))) {
                                                {
                                                    SubLObject pos_lit = pos_lits.first();
                                                    SubLObject args = literal_args(pos_lit, UNPROVIDED);
                                                    SubLObject pred = literal_arg0(pos_lit, UNPROVIDED);
                                                    SubLObject psn = position(var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    if (((NIL != fort_types_interface.predicateP(pred)) && (NIL != list_utilities.occurs_onceP(var, args, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.rule_macros.required_arg_pred(psn))) {
                                                        {
                                                            SubLObject non_skolemP = NIL;
                                                            if (NIL == non_skolemP) {
                                                                {
                                                                    SubLObject csome_list_var = args;
                                                                    SubLObject arg = NIL;
                                                                    for (arg = csome_list_var.first(); !((NIL != non_skolemP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                                                        non_skolemP = makeBoolean(!((arg == var) || (NIL != term.unreified_skolem_termP(arg))));
                                                                    }
                                                                }
                                                            }
                                                            return makeBoolean(NIL == non_skolemP);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt2);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean; t iff all the following conditions are met:
    There must be exactly 1 clause.
    In this clause, there must be exactly 1 neg-lit of the form (#$isa <var> <col>).
    <var> must be a variable and <col> must be a collection.
    There must be exactly 1 pos-lit.
    The pos-lit must contain <var> exactly once, in either position 1 or 2 (determined by @xref required-arg-pred).
    Also, all of the pos-lit's arguments (except <var>) must be unreified Skolem functions.
    An positive example is the CNF form of:
    (#$implies
    (#$isa ?X <col>)
    (#$thereExists ?Y
    (<pred> ?X ?Y))).
     */
    @LispMethod(comment = "@return boolean; t iff all the following conditions are met:\r\nThere must be exactly 1 clause.\r\nIn this clause, there must be exactly 1 neg-lit of the form (#$isa <var> <col>).\r\n<var> must be a variable and <col> must be a collection.\r\nThere must be exactly 1 pos-lit.\r\nThe pos-lit must contain <var> exactly once, in either position 1 or 2 (determined by @xref required-arg-pred).\r\nAlso, all of the pos-lit\'s arguments (except <var>) must be unreified Skolem functions.\r\nAn positive example is the CNF form of:\r\n(#$implies\r\n(#$isa ?X <col>)\r\n(#$thereExists ?Y\r\n(<pred> ?X ?Y))).")
    public static SubLObject required_arg_pred_clausesP(final SubLObject v_clauses, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != czer_vars.$express_as_required_arg_predP$.getDynamicValue(thread)) && (NIL != list_utilities.singletonP(v_clauses))) {
            SubLObject current;
            final SubLObject datum = current = v_clauses.first();
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            neg_lits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list2);
            pos_lits = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                    final SubLObject neg_lit = neg_lits.first();
                    if (NIL != isa_litP(neg_lit)) {
                        final SubLObject var = literal_arg1(neg_lit, UNPROVIDED);
                        final SubLObject col = literal_arg2(neg_lit, UNPROVIDED);
                        if ((NIL != funcall(varP, var)) && (NIL != fort_types_interface.collectionP(col))) {
                            final SubLObject pos_lit = pos_lits.first();
                            final SubLObject args = literal_args(pos_lit, UNPROVIDED);
                            final SubLObject pred = literal_arg0(pos_lit, UNPROVIDED);
                            final SubLObject psn = position(var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (((NIL != fort_types_interface.predicateP(pred)) && (NIL != list_utilities.occurs_onceP(var, args, UNPROVIDED))) && (NIL != required_arg_pred(psn))) {
                                SubLObject non_skolemP = NIL;
                                if (NIL == non_skolemP) {
                                    SubLObject csome_list_var;
                                    SubLObject arg;
                                    for (csome_list_var = args, arg = NIL, arg = csome_list_var.first(); (NIL == non_skolemP) && (NIL != csome_list_var); non_skolemP = makeBoolean((!arg.eql(var)) && (NIL == term.unreified_skolem_termP(arg))) , csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                    }
                                }
                                return makeBoolean(NIL == non_skolemP);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list2);
            }
        }
        return NIL;
    }

    /**
     * Assumes that @xref required-arg-pred-clauses? is true of CLAUSES.
     * Converts CLAUSES to a rule macro involving #$requiredArg1Pred et al.
     * e.g. if CLAUSES came from this EL formula:
     * (#$implies
     * (#$isa ?X <col>)
     * (#$thereExists ?Y
     * (<pred> ?X ?Y)))
     * it would be converted to (#$requiredArg1Pred <col> <pred>).
     */
    @LispMethod(comment = "Assumes that @xref required-arg-pred-clauses? is true of CLAUSES.\r\nConverts CLAUSES to a rule macro involving #$requiredArg1Pred et al.\r\ne.g. if CLAUSES came from this EL formula:\r\n(#$implies\r\n(#$isa ?X <col>)\r\n(#$thereExists ?Y\r\n(<pred> ?X ?Y)))\r\nit would be converted to (#$requiredArg1Pred <col> <pred>).\nAssumes that @xref required-arg-pred-clauses? is true of CLAUSES.\nConverts CLAUSES to a rule macro involving #$requiredArg1Pred et al.\ne.g. if CLAUSES came from this EL formula:\n(#$implies\n(#$isa ?X <col>)\n(#$thereExists ?Y\n(<pred> ?X ?Y)))\nit would be converted to (#$requiredArg1Pred <col> <pred>).")
    public static final SubLObject express_as_required_arg_pred_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_required_arg_predP$.getDynamicValue(thread)) {
                {
                    SubLObject datum = v_clauses;
                    SubLObject current = datum;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    {
                        SubLObject temp = current.rest();
                        current = current.first();
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        {
                            SubLObject temp_1 = current.rest();
                            current = current.first();
                            destructuring_bind_must_consp(current, datum, $list_alt3);
                            {
                                SubLObject temp_2 = current.rest();
                                current = current.first();
                                {
                                    SubLObject v_isa = NIL;
                                    SubLObject var = NIL;
                                    SubLObject col = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt3);
                                    v_isa = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt3);
                                    var = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt3);
                                    col = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        current = temp_2;
                                        if (NIL == current) {
                                            current = temp_1;
                                            destructuring_bind_must_consp(current, datum, $list_alt3);
                                            {
                                                SubLObject temp_3 = current.rest();
                                                current = current.first();
                                                {
                                                    SubLObject pos_lit = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt3);
                                                    pos_lit = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        current = temp_3;
                                                        if (NIL == current) {
                                                            current = temp;
                                                            if (NIL == current) {
                                                                {
                                                                    SubLObject pred = literal_arg0(pos_lit, UNPROVIDED);
                                                                    SubLObject rm_pred = com.cyc.cycjava.cycl.rule_macros.required_arg_pred(position(var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                    return list(com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula(rm_pred, col, pred), UNPROVIDED));
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt3);
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt3);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt3);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt3);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt3);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                return v_clauses;
            }
            return NIL;
        }
    }

    /**
     * Assumes that @xref required-arg-pred-clauses? is true of CLAUSES.
     * Converts CLAUSES to a rule macro involving #$requiredArg1Pred et al.
     * e.g. if CLAUSES came from this EL formula:
     * (#$implies
     * (#$isa ?X <col>)
     * (#$thereExists ?Y
     * (<pred> ?X ?Y)))
     * it would be converted to (#$requiredArg1Pred <col> <pred>).
     */
    @LispMethod(comment = "Assumes that @xref required-arg-pred-clauses? is true of CLAUSES.\r\nConverts CLAUSES to a rule macro involving #$requiredArg1Pred et al.\r\ne.g. if CLAUSES came from this EL formula:\r\n(#$implies\r\n(#$isa ?X <col>)\r\n(#$thereExists ?Y\r\n(<pred> ?X ?Y)))\r\nit would be converted to (#$requiredArg1Pred <col> <pred>).\nAssumes that @xref required-arg-pred-clauses? is true of CLAUSES.\nConverts CLAUSES to a rule macro involving #$requiredArg1Pred et al.\ne.g. if CLAUSES came from this EL formula:\n(#$implies\n(#$isa ?X <col>)\n(#$thereExists ?Y\n(<pred> ?X ?Y)))\nit would be converted to (#$requiredArg1Pred <col> <pred>).")
    public static SubLObject express_as_required_arg_pred(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_required_arg_predP$.getDynamicValue(thread)) {
            destructuring_bind_must_consp(v_clauses, v_clauses, $list3);
            final SubLObject temp = v_clauses.rest();
            SubLObject current = v_clauses.first();
            destructuring_bind_must_consp(current, v_clauses, $list3);
            final SubLObject temp_$1 = current.rest();
            current = current.first();
            destructuring_bind_must_consp(current, v_clauses, $list3);
            final SubLObject temp_$2 = current.rest();
            current = current.first();
            SubLObject v_isa = NIL;
            SubLObject var = NIL;
            SubLObject col = NIL;
            destructuring_bind_must_consp(current, v_clauses, $list3);
            v_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_clauses, $list3);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_clauses, $list3);
            col = current.first();
            current = current.rest();
            if (NIL == current) {
                current = temp_$2;
                if (NIL == current) {
                    current = temp_$1;
                    destructuring_bind_must_consp(current, v_clauses, $list3);
                    final SubLObject temp_$3 = current.rest();
                    current = current.first();
                    SubLObject pos_lit = NIL;
                    destructuring_bind_must_consp(current, v_clauses, $list3);
                    pos_lit = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp_$3;
                        if (NIL == current) {
                            current = temp;
                            if (NIL == current) {
                                final SubLObject pred = literal_arg0(pos_lit, UNPROVIDED);
                                final SubLObject rm_pred = required_arg_pred(position(var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                return list(make_rm_cnf(make_binary_formula(rm_pred, col, pred), UNPROVIDED));
                            }
                            cdestructuring_bind_error(v_clauses, $list3);
                        } else {
                            cdestructuring_bind_error(v_clauses, $list3);
                        }
                    } else {
                        cdestructuring_bind_error(v_clauses, $list3);
                    }
                } else {
                    cdestructuring_bind_error(v_clauses, $list3);
                }
            } else {
                cdestructuring_bind_error(v_clauses, $list3);
            }
            return NIL;
        }
        return v_clauses;
    }

    public static final SubLObject required_arg_pred_alt(SubLObject arg) {
        {
            SubLObject pcase_var = arg;
            if (pcase_var.eql(ONE_INTEGER)) {
                return $$requiredArg1Pred;
            } else {
                if (pcase_var.eql(TWO_INTEGER)) {
                    return $$requiredArg2Pred;
                } else {
                    el_error(THREE_INTEGER, $str_alt6$invalid_required_arg_pred_index__, arg, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject required_arg_pred(final SubLObject arg) {
        if (arg.eql(ONE_INTEGER)) {
            return $$requiredArg1Pred;
        }
        if (arg.eql(TWO_INTEGER)) {
            return $$requiredArg2Pred;
        }
        el_error(THREE_INTEGER, $str6$invalid_required_arg_pred_index__, arg, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff CLAUSES is expressible as a relation-type rule macro,
    i.e. one of the form (#$relation* ...)
     */
    @LispMethod(comment = "@return boolean; t iff CLAUSES is expressible as a relation-type rule macro,\r\ni.e. one of the form (#$relation* ...)")
    public static final SubLObject relation_type_clausesP_alt(SubLObject v_clauses, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_relation_typeP$.getDynamicValue(thread)) {
                if (NIL != list_utilities.doubletonP(v_clauses)) {
                    {
                        SubLObject datum = v_clauses;
                        SubLObject current = datum;
                        destructuring_bind_must_consp(current, datum, $list_alt7);
                        {
                            SubLObject temp = current.rest();
                            current = current.first();
                            {
                                SubLObject neg_lits_1 = NIL;
                                SubLObject pos_lits_1 = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt7);
                                neg_lits_1 = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt7);
                                pos_lits_1 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp;
                                    destructuring_bind_must_consp(current, datum, $list_alt7);
                                    {
                                        SubLObject temp_4 = current.rest();
                                        current = current.first();
                                        {
                                            SubLObject neg_lits_2 = NIL;
                                            SubLObject pos_lits_2 = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt7);
                                            neg_lits_2 = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt7);
                                            pos_lits_2 = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                current = temp_4;
                                                if (NIL == current) {
                                                    if ((NIL != list_utilities.singletonP(neg_lits_1)) && (NIL != list_utilities.singletonP(pos_lits_1))) {
                                                        if ((NIL != list_utilities.singletonP(neg_lits_2)) && (NIL != list_utilities.singletonP(pos_lits_2))) {
                                                            {
                                                                SubLObject neg_lit_1 = neg_lits_1.first();
                                                                SubLObject neg_lit_2 = neg_lits_2.first();
                                                                if ((NIL != isa_litP(neg_lit_1)) && neg_lit_1.equal(neg_lit_2)) {
                                                                    {
                                                                        SubLObject var = literal_arg1(neg_lit_1, UNPROVIDED);
                                                                        SubLObject col = literal_arg2(neg_lit_1, UNPROVIDED);
                                                                        if ((NIL != funcall(varP, var)) && (NIL != fort_types_interface.collectionP(col))) {
                                                                            {
                                                                                SubLObject pos_lit_1 = pos_lits_1.first();
                                                                                SubLObject pos_lit_2 = pos_lits_2.first();
                                                                                SubLObject isa_lit = NIL;
                                                                                SubLObject rel_lit = NIL;
                                                                                if (NIL != isa_litP(pos_lit_1)) {
                                                                                    isa_lit = pos_lit_1;
                                                                                    rel_lit = pos_lit_2;
                                                                                } else {
                                                                                    if (NIL != isa_litP(pos_lit_2)) {
                                                                                        isa_lit = pos_lit_2;
                                                                                        rel_lit = pos_lit_1;
                                                                                    }
                                                                                }
                                                                                if ((NIL != isa_lit) && (NIL != binary_lit_p(rel_lit))) {
                                                                                    {
                                                                                        SubLObject skolem = literal_arg1(isa_lit, UNPROVIDED);
                                                                                        SubLObject type = literal_arg2(isa_lit, UNPROVIDED);
                                                                                        SubLObject pred = literal_arg0(rel_lit, UNPROVIDED);
                                                                                        SubLObject args = literal_args(rel_lit, UNPROVIDED);
                                                                                        SubLObject psn = position(var, rel_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        if (((((NIL != term.unreified_skolem_termP(skolem)) && (NIL != fort_types_interface.collectionP(type))) && (NIL != fort_types_interface.predicateP(pred))) && (NIL != list_utilities.occurs_onceP(skolem, args, symbol_function(EQUAL)))) && (NIL != com.cyc.cycjava.cycl.rule_macros.relation_type_pred(psn, skolems.skolem_number(skolem)))) {
                                                                                            {
                                                                                                SubLObject non_skolemP = NIL;
                                                                                                if (NIL == non_skolemP) {
                                                                                                    {
                                                                                                        SubLObject csome_list_var = args;
                                                                                                        SubLObject arg = NIL;
                                                                                                        for (arg = csome_list_var.first(); !((NIL != non_skolemP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                                                                                            non_skolemP = makeBoolean(!((arg == var) || arg.equal(skolem)));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                return makeBoolean(NIL == non_skolemP);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt7);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt7);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt7);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean; t iff CLAUSES is expressible as a relation-type rule macro,
    i.e. one of the form (#$relation* ...)
     */
    @LispMethod(comment = "@return boolean; t iff CLAUSES is expressible as a relation-type rule macro,\r\ni.e. one of the form (#$relation* ...)")
    public static SubLObject relation_type_clausesP(final SubLObject v_clauses, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != czer_vars.$express_as_relation_typeP$.getDynamicValue(thread)) && (NIL != list_utilities.doubletonP(v_clauses))) {
            destructuring_bind_must_consp(v_clauses, v_clauses, $list7);
            final SubLObject temp = v_clauses.rest();
            SubLObject current = v_clauses.first();
            SubLObject neg_lits_1 = NIL;
            SubLObject pos_lits_1 = NIL;
            destructuring_bind_must_consp(current, v_clauses, $list7);
            neg_lits_1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_clauses, $list7);
            pos_lits_1 = current.first();
            current = current.rest();
            if (NIL == current) {
                current = temp;
                destructuring_bind_must_consp(current, v_clauses, $list7);
                final SubLObject temp_$4 = current.rest();
                current = current.first();
                SubLObject neg_lits_2 = NIL;
                SubLObject pos_lits_2 = NIL;
                destructuring_bind_must_consp(current, v_clauses, $list7);
                neg_lits_2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, v_clauses, $list7);
                pos_lits_2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    current = temp_$4;
                    if (NIL == current) {
                        if ((((NIL != list_utilities.singletonP(neg_lits_1)) && (NIL != list_utilities.singletonP(pos_lits_1))) && (NIL != list_utilities.singletonP(neg_lits_2))) && (NIL != list_utilities.singletonP(pos_lits_2))) {
                            final SubLObject neg_lit_1 = neg_lits_1.first();
                            final SubLObject neg_lit_2 = neg_lits_2.first();
                            if ((NIL != isa_litP(neg_lit_1)) && neg_lit_1.equal(neg_lit_2)) {
                                final SubLObject var = literal_arg1(neg_lit_1, UNPROVIDED);
                                final SubLObject col = literal_arg2(neg_lit_1, UNPROVIDED);
                                if ((NIL != funcall(varP, var)) && (NIL != fort_types_interface.collectionP(col))) {
                                    final SubLObject pos_lit_1 = pos_lits_1.first();
                                    final SubLObject pos_lit_2 = pos_lits_2.first();
                                    SubLObject isa_lit = NIL;
                                    SubLObject rel_lit = NIL;
                                    if (NIL != isa_litP(pos_lit_1)) {
                                        isa_lit = pos_lit_1;
                                        rel_lit = pos_lit_2;
                                    } else
                                        if (NIL != isa_litP(pos_lit_2)) {
                                            isa_lit = pos_lit_2;
                                            rel_lit = pos_lit_1;
                                        }

                                    if ((NIL != isa_lit) && (NIL != binary_lit_p(rel_lit))) {
                                        final SubLObject skolem = literal_arg1(isa_lit, UNPROVIDED);
                                        final SubLObject type = literal_arg2(isa_lit, UNPROVIDED);
                                        final SubLObject pred = literal_arg0(rel_lit, UNPROVIDED);
                                        final SubLObject args = literal_args(rel_lit, UNPROVIDED);
                                        final SubLObject psn = position(var, rel_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (((((NIL != term.unreified_skolem_termP(skolem)) && (NIL != fort_types_interface.collectionP(type))) && (NIL != fort_types_interface.predicateP(pred))) && (NIL != list_utilities.occurs_onceP(skolem, args, symbol_function(EQUAL)))) && (NIL != relation_type_pred(psn, skolems.skolem_number(skolem)))) {
                                            SubLObject non_skolemP = NIL;
                                            if (NIL == non_skolemP) {
                                                SubLObject csome_list_var;
                                                SubLObject arg;
                                                for (csome_list_var = args, arg = NIL, arg = csome_list_var.first(); (NIL == non_skolemP) && (NIL != csome_list_var); non_skolemP = makeBoolean((!arg.eql(var)) && (!arg.equal(skolem))) , csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                                }
                                            }
                                            return makeBoolean(NIL == non_skolemP);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(v_clauses, $list7);
                    }
                } else {
                    cdestructuring_bind_error(v_clauses, $list7);
                }
            } else {
                cdestructuring_bind_error(v_clauses, $list7);
            }
        }
        return NIL;
    }

    /**
     * Assumes that @xref relation-type-clauses? is true of CLAUSES.
     * Expresses CLAUSES as the appropriate type of #$relation* rule macro.
     * Which type is appropriate is determined by @xref relation-type-pred.
     */
    @LispMethod(comment = "Assumes that @xref relation-type-clauses? is true of CLAUSES.\r\nExpresses CLAUSES as the appropriate type of #$relation* rule macro.\r\nWhich type is appropriate is determined by @xref relation-type-pred.\nAssumes that @xref relation-type-clauses? is true of CLAUSES.\nExpresses CLAUSES as the appropriate type of #$relation* rule macro.\nWhich type is appropriate is determined by @xref relation-type-pred.")
    public static final SubLObject express_as_relation_type_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_relation_typeP$.getDynamicValue(thread)) {
                {
                    SubLObject datum = v_clauses;
                    SubLObject current = datum;
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    {
                        SubLObject temp = current.rest();
                        current = current.first();
                        destructuring_bind_must_consp(current, datum, $list_alt8);
                        {
                            SubLObject temp_5 = current.rest();
                            current = current.first();
                            destructuring_bind_must_consp(current, datum, $list_alt8);
                            {
                                SubLObject temp_6 = current.rest();
                                current = current.first();
                                {
                                    SubLObject v_isa = NIL;
                                    SubLObject var = NIL;
                                    SubLObject col = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt8);
                                    v_isa = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt8);
                                    var = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt8);
                                    col = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        current = temp_6;
                                        if (NIL == current) {
                                            current = temp_5;
                                            destructuring_bind_must_consp(current, datum, $list_alt8);
                                            {
                                                SubLObject temp_7 = current.rest();
                                                current = current.first();
                                                {
                                                    SubLObject pos_lit_1 = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt8);
                                                    pos_lit_1 = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        current = temp_7;
                                                        if (NIL == current) {
                                                            current = temp;
                                                            destructuring_bind_must_consp(current, datum, $list_alt8);
                                                            {
                                                                SubLObject temp_8 = current.rest();
                                                                current = current.first();
                                                                destructuring_bind_must_consp(current, datum, $list_alt8);
                                                                {
                                                                    SubLObject temp_9 = current.rest();
                                                                    current = current.first();
                                                                    {
                                                                        SubLObject neg_lit_2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt8);
                                                                        neg_lit_2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            current = temp_9;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt8);
                                                                            {
                                                                                SubLObject temp_10 = current.rest();
                                                                                current = current.first();
                                                                                {
                                                                                    SubLObject pos_lit_2 = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt8);
                                                                                    pos_lit_2 = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        current = temp_10;
                                                                                        if (NIL == current) {
                                                                                            current = temp_8;
                                                                                            if (NIL == current) {
                                                                                                {
                                                                                                    SubLObject isa_lit = NIL;
                                                                                                    SubLObject rel_lit = NIL;
                                                                                                    if (NIL != isa_litP(pos_lit_1)) {
                                                                                                        isa_lit = pos_lit_1;
                                                                                                        rel_lit = pos_lit_2;
                                                                                                    } else {
                                                                                                        if (NIL != isa_litP(pos_lit_2)) {
                                                                                                            isa_lit = pos_lit_2;
                                                                                                            rel_lit = pos_lit_1;
                                                                                                        }
                                                                                                    }
                                                                                                    {
                                                                                                        SubLObject type = literal_arg2(isa_lit, UNPROVIDED);
                                                                                                        SubLObject pred = literal_arg0(rel_lit, UNPROVIDED);
                                                                                                        SubLObject psn = position(var, rel_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        SubLObject number = skolems.skolem_number(literal_arg1(isa_lit, UNPROVIDED));
                                                                                                        SubLObject rm_pred = com.cyc.cycjava.cycl.rule_macros.relation_type_pred(psn, number);
                                                                                                        return list(com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(com.cyc.cycjava.cycl.rule_macros.relation_type_gaf(rm_pred, pred, col, type, number), UNPROVIDED));
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum, $list_alt8);
                                                                                            }
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum, $list_alt8);
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, $list_alt8);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list_alt8);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt8);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt8);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt8);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt8);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                return v_clauses;
            }
            return NIL;
        }
    }

    /**
     * Assumes that @xref relation-type-clauses? is true of CLAUSES.
     * Expresses CLAUSES as the appropriate type of #$relation* rule macro.
     * Which type is appropriate is determined by @xref relation-type-pred.
     */
    @LispMethod(comment = "Assumes that @xref relation-type-clauses? is true of CLAUSES.\r\nExpresses CLAUSES as the appropriate type of #$relation* rule macro.\r\nWhich type is appropriate is determined by @xref relation-type-pred.\nAssumes that @xref relation-type-clauses? is true of CLAUSES.\nExpresses CLAUSES as the appropriate type of #$relation* rule macro.\nWhich type is appropriate is determined by @xref relation-type-pred.")
    public static SubLObject express_as_relation_type(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_relation_typeP$.getDynamicValue(thread)) {
            destructuring_bind_must_consp(v_clauses, v_clauses, $list8);
            final SubLObject temp = v_clauses.rest();
            SubLObject current = v_clauses.first();
            destructuring_bind_must_consp(current, v_clauses, $list8);
            final SubLObject temp_$5 = current.rest();
            current = current.first();
            destructuring_bind_must_consp(current, v_clauses, $list8);
            final SubLObject temp_$6 = current.rest();
            current = current.first();
            SubLObject v_isa = NIL;
            SubLObject var = NIL;
            SubLObject col = NIL;
            destructuring_bind_must_consp(current, v_clauses, $list8);
            v_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_clauses, $list8);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_clauses, $list8);
            col = current.first();
            current = current.rest();
            if (NIL == current) {
                current = temp_$6;
                if (NIL == current) {
                    current = temp_$5;
                    destructuring_bind_must_consp(current, v_clauses, $list8);
                    final SubLObject temp_$7 = current.rest();
                    current = current.first();
                    SubLObject pos_lit_1 = NIL;
                    destructuring_bind_must_consp(current, v_clauses, $list8);
                    pos_lit_1 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp_$7;
                        if (NIL == current) {
                            current = temp;
                            destructuring_bind_must_consp(current, v_clauses, $list8);
                            final SubLObject temp_$8 = current.rest();
                            current = current.first();
                            destructuring_bind_must_consp(current, v_clauses, $list8);
                            final SubLObject temp_$9 = current.rest();
                            current = current.first();
                            SubLObject neg_lit_2 = NIL;
                            destructuring_bind_must_consp(current, v_clauses, $list8);
                            neg_lit_2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                current = temp_$9;
                                destructuring_bind_must_consp(current, v_clauses, $list8);
                                final SubLObject temp_$10 = current.rest();
                                current = current.first();
                                SubLObject pos_lit_2 = NIL;
                                destructuring_bind_must_consp(current, v_clauses, $list8);
                                pos_lit_2 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp_$10;
                                    if (NIL == current) {
                                        current = temp_$8;
                                        if (NIL == current) {
                                            SubLObject isa_lit = NIL;
                                            SubLObject rel_lit = NIL;
                                            if (NIL != isa_litP(pos_lit_1)) {
                                                isa_lit = pos_lit_1;
                                                rel_lit = pos_lit_2;
                                            } else
                                                if (NIL != isa_litP(pos_lit_2)) {
                                                    isa_lit = pos_lit_2;
                                                    rel_lit = pos_lit_1;
                                                }

                                            final SubLObject type = literal_arg2(isa_lit, UNPROVIDED);
                                            final SubLObject pred = literal_arg0(rel_lit, UNPROVIDED);
                                            final SubLObject psn = position(var, rel_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            final SubLObject number = skolems.skolem_number(literal_arg1(isa_lit, UNPROVIDED));
                                            final SubLObject rm_pred = relation_type_pred(psn, number);
                                            return list(make_rm_cnf(relation_type_gaf(rm_pred, pred, col, type, number), UNPROVIDED));
                                        }
                                        cdestructuring_bind_error(v_clauses, $list8);
                                    } else {
                                        cdestructuring_bind_error(v_clauses, $list8);
                                    }
                                } else {
                                    cdestructuring_bind_error(v_clauses, $list8);
                                }
                            } else {
                                cdestructuring_bind_error(v_clauses, $list8);
                            }
                        } else {
                            cdestructuring_bind_error(v_clauses, $list8);
                        }
                    } else {
                        cdestructuring_bind_error(v_clauses, $list8);
                    }
                } else {
                    cdestructuring_bind_error(v_clauses, $list8);
                }
            } else {
                cdestructuring_bind_error(v_clauses, $list8);
            }
            return NIL;
        }
        return v_clauses;
    }

    /**
     * Returns the appropriate rule macro predicate based on ARGNUM and NUMBER.
     * ARGNUM is an integer, and NUMBER is either an integer or a term (or NIL).
     */
    @LispMethod(comment = "Returns the appropriate rule macro predicate based on ARGNUM and NUMBER.\r\nARGNUM is an integer, and NUMBER is either an integer or a term (or NIL).\nReturns the appropriate rule macro predicate based on ARGNUM and NUMBER.\nARGNUM is an integer, and NUMBER is either an integer or a term (or NIL).")
    public static final SubLObject relation_type_pred_alt(SubLObject argnum, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        {
            SubLObject pcase_var = argnum;
            if (pcase_var.eql(ONE_INTEGER)) {
                if (NIL == number) {
                    return $$relationAllExists;
                } else {
                    if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_math_utilities.el_minP(number))) {
                        return $$relationAllExistsMin;
                    } else {
                        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_math_utilities.el_maxP(number))) {
                            return $$relationAllExistsMax;
                        } else {
                            return $$relationAllExistsCount;
                        }
                    }
                }
            } else {
                if (pcase_var.eql(TWO_INTEGER)) {
                    if (NIL == number) {
                        return $$relationExistsAll;
                    } else {
                        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_math_utilities.el_minP(number))) {
                            return $$relationExistsMinAll;
                        } else {
                            if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_math_utilities.el_maxP(number))) {
                                return $$relationExistsMaxAll;
                            } else {
                                return $$relationExistsCountAll;
                            }
                        }
                    }
                } else {
                    el_error(THREE_INTEGER, $str_alt17$invalid_relation_type_index___s, argnum, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Returns the appropriate rule macro predicate based on ARGNUM and NUMBER.\r\nARGNUM is an integer, and NUMBER is either an integer or a term (or NIL).\nReturns the appropriate rule macro predicate based on ARGNUM and NUMBER.\nARGNUM is an integer, and NUMBER is either an integer or a term (or NIL).")
    public static SubLObject relation_type_pred(final SubLObject argnum, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (argnum.eql(ONE_INTEGER)) {
            if (NIL == number) {
                return $$relationAllExists;
            }
            if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_math_utilities.el_minP(number))) {
                return $$relationAllExistsMin;
            }
            if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_math_utilities.el_maxP(number))) {
                return $$relationAllExistsMax;
            }
            return $$relationAllExistsCount;
        } else {
            if (!argnum.eql(TWO_INTEGER)) {
                el_error(THREE_INTEGER, $str17$invalid_relation_type_index___s, argnum, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            if (NIL == number) {
                return $$relationExistsAll;
            }
            if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_math_utilities.el_minP(number))) {
                return $$relationExistsMinAll;
            }
            if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_math_utilities.el_maxP(number))) {
                return $$relationExistsMaxAll;
            }
            return $$relationExistsCountAll;
        }
    }/**
     * Returns the appropriate rule macro predicate based on ARGNUM and NUMBER.
     * ARGNUM is an integer, and NUMBER is either an integer or a term (or NIL).
     */


    /**
     * Given a rule macro predicate RM-PRED and its arguments, returns a rule macro formula
     * with the appropriate fourth argument.  NUMBER is either an integer or a term (or NIL),
     * but this function will return the correct fourth argument for the rule macro because
     * the correct predicate for NUMBER should have already been determined by @xref relation-type-pred.
     */
    @LispMethod(comment = "Given a rule macro predicate RM-PRED and its arguments, returns a rule macro formula\r\nwith the appropriate fourth argument.  NUMBER is either an integer or a term (or NIL),\r\nbut this function will return the correct fourth argument for the rule macro because\r\nthe correct predicate for NUMBER should have already been determined by @xref relation-type-pred.\nGiven a rule macro predicate RM-PRED and its arguments, returns a rule macro formula\nwith the appropriate fourth argument.  NUMBER is either an integer or a term (or NIL),\nbut this function will return the correct fourth argument for the rule macro because\nthe correct predicate for NUMBER should have already been determined by @xref relation-type-pred.")
    public static final SubLObject relation_type_gaf_alt(SubLObject rm_pred, SubLObject pred, SubLObject col, SubLObject type, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (rm_pred == $$relationAllExists) {
            return make_ternary_formula(rm_pred, pred, col, type);
        } else {
            if (rm_pred == $$relationAllExistsCount) {
                return make_quaternary_formula(rm_pred, pred, col, type, number);
            } else {
                if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (rm_pred == $$relationAllExistsMin)) {
                    return make_quaternary_formula(rm_pred, pred, col, type, el_math_utilities.el_min(number));
                } else {
                    if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (rm_pred == $$relationAllExistsMax)) {
                        return make_quaternary_formula(rm_pred, pred, col, type, el_math_utilities.el_max(number));
                    } else {
                        if (rm_pred == $$relationExistsAll) {
                            return make_ternary_formula(rm_pred, pred, type, col);
                        } else {
                            if (rm_pred == $$relationExistsCountAll) {
                                return make_quaternary_formula(rm_pred, pred, type, col, number);
                            } else {
                                if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (rm_pred == $$relationExistsMinAll)) {
                                    return make_quaternary_formula(rm_pred, pred, type, col, el_math_utilities.el_min(number));
                                } else {
                                    if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (rm_pred == $$relationExistsMaxAll)) {
                                        return make_quaternary_formula(rm_pred, pred, type, col, el_math_utilities.el_max(number));
                                    } else {
                                        el_error(THREE_INTEGER, $str_alt18$invalid_relation_type_rule_macro_, rm_pred, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Given a rule macro predicate RM-PRED and its arguments, returns a rule macro formula\r\nwith the appropriate fourth argument.  NUMBER is either an integer or a term (or NIL),\r\nbut this function will return the correct fourth argument for the rule macro because\r\nthe correct predicate for NUMBER should have already been determined by @xref relation-type-pred.\nGiven a rule macro predicate RM-PRED and its arguments, returns a rule macro formula\nwith the appropriate fourth argument.  NUMBER is either an integer or a term (or NIL),\nbut this function will return the correct fourth argument for the rule macro because\nthe correct predicate for NUMBER should have already been determined by @xref relation-type-pred.")
    public static SubLObject relation_type_gaf(final SubLObject rm_pred, final SubLObject pred, final SubLObject col, final SubLObject type, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (rm_pred.eql($$relationAllExists)) {
            return make_ternary_formula(rm_pred, pred, col, type);
        }
        if (rm_pred.eql($$relationAllExistsCount)) {
            return make_quaternary_formula(rm_pred, pred, col, type, number);
        }
        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && rm_pred.eql($$relationAllExistsMin)) {
            return make_quaternary_formula(rm_pred, pred, col, type, el_math_utilities.el_min(number));
        }
        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && rm_pred.eql($$relationAllExistsMax)) {
            return make_quaternary_formula(rm_pred, pred, col, type, el_math_utilities.el_max(number));
        }
        if (rm_pred.eql($$relationExistsAll)) {
            return make_ternary_formula(rm_pred, pred, type, col);
        }
        if (rm_pred.eql($$relationExistsCountAll)) {
            return make_quaternary_formula(rm_pred, pred, type, col, number);
        }
        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && rm_pred.eql($$relationExistsMinAll)) {
            return make_quaternary_formula(rm_pred, pred, type, col, el_math_utilities.el_min(number));
        }
        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && rm_pred.eql($$relationExistsMaxAll)) {
            return make_quaternary_formula(rm_pred, pred, type, col, el_math_utilities.el_max(number));
        }
        el_error(THREE_INTEGER, $str18$invalid_relation_type_rule_macro_, rm_pred, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Given a rule macro predicate RM-PRED and its arguments, returns a rule macro formula
     * with the appropriate fourth argument.  NUMBER is either an integer or a term (or NIL),
     * but this function will return the correct fourth argument for the rule macro because
     * the correct predicate for NUMBER should have already been determined by @xref relation-type-pred.
     */


    /**
     * Transforms CLAUSE into a rule macro if possible.
     * Otherwise returns CLAUSE.
     */
    @LispMethod(comment = "Transforms CLAUSE into a rule macro if possible.\r\nOtherwise returns CLAUSE.\nTransforms CLAUSE into a rule macro if possible.\nOtherwise returns CLAUSE.")
    public static final SubLObject canonicalize_clause_wrt_rule_macros_alt(SubLObject clause) {
        if (NIL != com.cyc.cycjava.cycl.rule_macros.genls_clauseP(clause, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.rule_macros.express_as_genls(clause);
        } else {
            if (NIL != com.cyc.cycjava.cycl.rule_macros.genl_predicates_clauseP(clause, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.rule_macros.express_as_genl_predicates(clause);
            } else {
                if (NIL != com.cyc.cycjava.cycl.rule_macros.genl_inverse_clauseP(clause, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.rule_macros.express_as_genl_inverse(clause);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.rule_macros.arg_isa_clauseP(clause, UNPROVIDED)) {
                        return com.cyc.cycjava.cycl.rule_macros.express_as_arg_isa(clause);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.rule_macros.inter_arg_isa_clauseP(clause, UNPROVIDED)) {
                            return com.cyc.cycjava.cycl.rule_macros.express_as_inter_arg_isa(clause);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.rule_macros.arg_genl_clauseP(clause, UNPROVIDED)) {
                                return com.cyc.cycjava.cycl.rule_macros.express_as_arg_genl(clause);
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.rule_macros.disjoint_with_clauseP(clause, UNPROVIDED)) {
                                    return com.cyc.cycjava.cycl.rule_macros.express_as_disjoint_with(clause);
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.rule_macros.negation_preds_clauseP(clause, UNPROVIDED)) {
                                        return com.cyc.cycjava.cycl.rule_macros.express_as_negation_preds(clause);
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.rule_macros.negation_inverse_clauseP(clause, UNPROVIDED)) {
                                            return com.cyc.cycjava.cycl.rule_macros.express_as_negation_inverse(clause);
                                        } else {
                                            if (NIL != com.cyc.cycjava.cycl.rule_macros.reflexive_predicate_clauseP(clause, UNPROVIDED)) {
                                                return com.cyc.cycjava.cycl.rule_macros.express_as_reflexive_predicate(clause);
                                            } else {
                                                if (NIL != com.cyc.cycjava.cycl.rule_macros.irreflexive_predicate_clauseP(clause, UNPROVIDED)) {
                                                    return com.cyc.cycjava.cycl.rule_macros.express_as_irreflexive_predicate(clause);
                                                } else {
                                                    if (NIL != com.cyc.cycjava.cycl.rule_macros.transitive_predicate_clauseP(clause, UNPROVIDED)) {
                                                        return com.cyc.cycjava.cycl.rule_macros.express_as_transitive_predicate(clause);
                                                    } else {
                                                        if (NIL != com.cyc.cycjava.cycl.rule_macros.symmetric_predicate_clauseP(clause, UNPROVIDED)) {
                                                            return com.cyc.cycjava.cycl.rule_macros.express_as_symmetric_predicate(clause);
                                                        } else {
                                                            if (NIL != com.cyc.cycjava.cycl.rule_macros.asymmetric_predicate_clauseP(clause, UNPROVIDED)) {
                                                                return com.cyc.cycjava.cycl.rule_macros.express_as_asymmetric_predicate(clause);
                                                            } else {
                                                                return clause;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Transforms CLAUSE into a rule macro if possible.\r\nOtherwise returns CLAUSE.\nTransforms CLAUSE into a rule macro if possible.\nOtherwise returns CLAUSE.")
    public static SubLObject canonicalize_clause_wrt_rule_macros(final SubLObject clause) {
        if (NIL != genls_clauseP(clause, UNPROVIDED)) {
            return express_as_genls(clause);
        }
        if (NIL != genl_predicates_clauseP(clause, UNPROVIDED)) {
            return express_as_genl_predicates(clause);
        }
        if (NIL != genl_inverse_clauseP(clause, UNPROVIDED)) {
            return express_as_genl_inverse(clause);
        }
        if (NIL != arg_isa_clauseP(clause, UNPROVIDED)) {
            return express_as_arg_isa(clause);
        }
        if (NIL != inter_arg_isa_clauseP(clause, UNPROVIDED)) {
            return express_as_inter_arg_isa(clause);
        }
        if (NIL != arg_genl_clauseP(clause, UNPROVIDED)) {
            return express_as_arg_genl(clause);
        }
        if (NIL != disjoint_with_clauseP(clause, UNPROVIDED)) {
            return express_as_disjoint_with(clause);
        }
        if (NIL != negation_preds_clauseP(clause, UNPROVIDED)) {
            return express_as_negation_preds(clause);
        }
        if (NIL != negation_inverse_clauseP(clause, UNPROVIDED)) {
            return express_as_negation_inverse(clause);
        }
        if (NIL != reflexive_predicate_clauseP(clause, UNPROVIDED)) {
            return express_as_reflexive_predicate(clause);
        }
        if (NIL != irreflexive_predicate_clauseP(clause, UNPROVIDED)) {
            return express_as_irreflexive_predicate(clause);
        }
        if (NIL != transitive_predicate_clauseP(clause, UNPROVIDED)) {
            return express_as_transitive_predicate(clause);
        }
        if (NIL != symmetric_predicate_clauseP(clause, UNPROVIDED)) {
            return express_as_symmetric_predicate(clause);
        }
        if (NIL != asymmetric_predicate_clauseP(clause, UNPROVIDED)) {
            return express_as_asymmetric_predicate(clause);
        }
        return clause;
    }/**
     * Transforms CLAUSE into a rule macro if possible.
     * Otherwise returns CLAUSE.
     */


    public static final SubLObject genls_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_genlsP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                        {
                            SubLObject neg_lit = neg_lits.first();
                            SubLObject pos_lit = pos_lits.first();
                            SubLObject var = literal_arg1(neg_lit, UNPROVIDED);
                            return makeBoolean((((((NIL != isa_litP(neg_lit)) && (NIL != isa_litP(pos_lit))) && (NIL != funcall(varP, var))) && (var == literal_arg1(pos_lit, UNPROVIDED))) && (NIL != fort_types_interface.collectionP(literal_arg2(neg_lit, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(pos_lit, UNPROVIDED))));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject genls_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_genlsP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                final SubLObject neg_lit = neg_lits.first();
                final SubLObject pos_lit = pos_lits.first();
                final SubLObject var = literal_arg1(neg_lit, UNPROVIDED);
                return makeBoolean((((((NIL != isa_litP(neg_lit)) && (NIL != isa_litP(pos_lit))) && (NIL != funcall(varP, var))) && var.eql(literal_arg1(pos_lit, UNPROVIDED))) && (NIL != fort_types_interface.collectionP(literal_arg2(neg_lit, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(pos_lit, UNPROVIDED))));
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_genls_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_genlsP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$genls, literal_arg2(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg2(clauses.pos_lits(clause).first(), UNPROVIDED)), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_genls(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_genlsP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$genls, literal_arg2(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg2(clauses.pos_lits(clause).first(), UNPROVIDED)), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject genl_predicates_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_genl_predicatesP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                        {
                            SubLObject neg_lit = neg_lits.first();
                            SubLObject pos_lit = pos_lits.first();
                            SubLObject neg_args = literal_args(neg_lit, UNPROVIDED);
                            SubLObject pos_args = literal_args(pos_lit, UNPROVIDED);
                            if (NIL == list_utilities.every_in_list(varP, neg_args, UNPROVIDED)) {
                                return NIL;
                            } else {
                                if (neg_args.equal(pos_args)) {
                                    return T;
                                } else {
                                    if (NIL != fort_types_interface.commutative_relationP(literal_arg0(neg_lit, UNPROVIDED))) {
                                        return list_utilities.sets_equalP(neg_args, pos_args, UNPROVIDED);
                                    } else {
                                        if (NIL != fort_types_interface.commutative_relationP(literal_arg0(pos_lit, UNPROVIDED))) {
                                            return list_utilities.sets_equalP(neg_args, pos_args, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject genl_predicates_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_genl_predicatesP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                final SubLObject neg_lit = neg_lits.first();
                final SubLObject pos_lit = pos_lits.first();
                final SubLObject neg_args = literal_args(neg_lit, UNPROVIDED);
                final SubLObject pos_args = literal_args(pos_lit, UNPROVIDED);
                if (NIL == list_utilities.every_in_list(varP, neg_args, UNPROVIDED)) {
                    return NIL;
                }
                if (neg_args.equal(pos_args)) {
                    return T;
                }
                if (NIL != fort_types_interface.commutative_relationP(literal_arg0(neg_lit, UNPROVIDED))) {
                    return list_utilities.sets_equalP(neg_args, pos_args, UNPROVIDED);
                }
                if (NIL != fort_types_interface.commutative_relationP(literal_arg0(pos_lit, UNPROVIDED))) {
                    return list_utilities.sets_equalP(neg_args, pos_args, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_genl_predicates_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_genl_predicatesP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$genlPreds, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED)), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_genl_predicates(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_genl_predicatesP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$genlPreds, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED)), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject genl_inverse_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_genl_inverseP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                        {
                            SubLObject neg_lit = neg_lits.first();
                            SubLObject pos_lit = pos_lits.first();
                            SubLObject neg_pred = literal_arg0(neg_lit, UNPROVIDED);
                            SubLObject pos_pred = literal_arg0(pos_lit, UNPROVIDED);
                            if (neg_pred != pos_pred) {
                                if (NIL == kb_accessors.symmetric_predicateP(neg_pred)) {
                                    if (NIL == kb_accessors.symmetric_predicateP(neg_pred)) {
                                        return makeBoolean((((((NIL != binary_lit_p(neg_lit)) && (NIL != binary_lit_p(pos_lit))) && (literal_arg1(neg_lit, UNPROVIDED) == literal_arg2(pos_lit, UNPROVIDED))) && (literal_arg2(neg_lit, UNPROVIDED) == literal_arg1(pos_lit, UNPROVIDED))) && (NIL != funcall(varP, literal_arg1(neg_lit, UNPROVIDED)))) && (NIL != funcall(varP, literal_arg2(neg_lit, UNPROVIDED))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject genl_inverse_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_genl_inverseP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                final SubLObject neg_lit = neg_lits.first();
                final SubLObject pos_lit = pos_lits.first();
                final SubLObject neg_pred = literal_arg0(neg_lit, UNPROVIDED);
                final SubLObject pos_pred = literal_arg0(pos_lit, UNPROVIDED);
                if (((!neg_pred.eql(pos_pred)) && (NIL == kb_accessors.symmetric_predicateP(neg_pred))) && (NIL == kb_accessors.symmetric_predicateP(neg_pred))) {
                    return makeBoolean((((((NIL != binary_lit_p(neg_lit)) && (NIL != binary_lit_p(pos_lit))) && literal_arg1(neg_lit, UNPROVIDED).eql(literal_arg2(pos_lit, UNPROVIDED))) && literal_arg2(neg_lit, UNPROVIDED).eql(literal_arg1(pos_lit, UNPROVIDED))) && (NIL != funcall(varP, literal_arg1(neg_lit, UNPROVIDED)))) && (NIL != funcall(varP, literal_arg2(neg_lit, UNPROVIDED))));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_genl_inverse_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_genl_inverseP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$genlInverse, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED)), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_genl_inverse(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_genl_inverseP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$genlInverse, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED)), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject arg_isa_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_arg_isaP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                        {
                            SubLObject neg_lit = neg_lits.first();
                            SubLObject pos_lit = pos_lits.first();
                            return makeBoolean((((NIL != isa_litP(pos_lit)) && (NIL != fort_types_interface.predicateP(literal_arg0(neg_lit, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(pos_lit, UNPROVIDED)))) && (NIL != kb_accessors.arg_isa_pred(com.cyc.cycjava.cycl.rule_macros.relevant_arg_of_isa_clause(neg_lit, pos_lit, varP), UNPROVIDED, UNPROVIDED)));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject arg_isa_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_arg_isaP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                final SubLObject neg_lit = neg_lits.first();
                final SubLObject pos_lit = pos_lits.first();
                return makeBoolean((((NIL != isa_litP(pos_lit)) && (NIL != fort_types_interface.predicateP(literal_arg0(neg_lit, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(pos_lit, UNPROVIDED)))) && (NIL != kb_accessors.arg_isa_pred(relevant_arg_of_isa_clause(neg_lit, pos_lit, varP), UNPROVIDED, UNPROVIDED)));
            }
        }
        return NIL;
    }

    public static final SubLObject relevant_arg_of_isa_clause_alt(SubLObject neg_lit, SubLObject pos_lit, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        if (NIL != list_utilities.every_in_list(varP, literal_args(neg_lit, UNPROVIDED), UNPROVIDED)) {
            {
                SubLObject arg_foundP = NIL;
                SubLObject pos_arg = literal_arg1(pos_lit, UNPROVIDED);
                if (NIL == arg_foundP) {
                    {
                        SubLObject csome_list_var = czer_vars.$arg_positions$.getGlobalValue();
                        SubLObject n = NIL;
                        for (n = csome_list_var.first(); !((NIL != arg_foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , n = csome_list_var.first()) {
                            {
                                SubLObject neg_arg = nth(n, neg_lit);
                                if ((neg_arg == pos_arg) && (NIL != list_utilities.occurs_onceP(neg_arg, neg_lit, UNPROVIDED))) {
                                    return n;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject relevant_arg_of_isa_clause(final SubLObject neg_lit, final SubLObject pos_lit, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        if (NIL != list_utilities.every_in_list(varP, literal_args(neg_lit, UNPROVIDED), UNPROVIDED)) {
            final SubLObject arg_foundP = NIL;
            final SubLObject pos_arg = literal_arg1(pos_lit, UNPROVIDED);
            if (NIL == arg_foundP) {
                SubLObject csome_list_var = czer_vars.$arg_positions$.getGlobalValue();
                SubLObject n = NIL;
                n = csome_list_var.first();
                while ((NIL == arg_foundP) && (NIL != csome_list_var)) {
                    final SubLObject neg_arg = nth(n, neg_lit);
                    if (neg_arg.eql(pos_arg) && (NIL != list_utilities.occurs_onceP(neg_arg, neg_lit, UNPROVIDED))) {
                        return n;
                    }
                    csome_list_var = csome_list_var.rest();
                    n = csome_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_arg_isa_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_arg_isaP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lit = clauses.neg_lits(clause).first();
                    SubLObject pos_lit = clauses.pos_lits(clause).first();
                    SubLObject arg = com.cyc.cycjava.cycl.rule_macros.relevant_arg_of_isa_clause(neg_lit, pos_lit, UNPROVIDED);
                    SubLObject rm_pred = kb_accessors.arg_isa_pred(arg, UNPROVIDED, UNPROVIDED);
                    return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula(rm_pred, literal_arg0(neg_lit, UNPROVIDED), literal_arg2(pos_lit, UNPROVIDED)), UNPROVIDED);
                }
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_arg_isa(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_arg_isaP$.getDynamicValue(thread)) {
            final SubLObject neg_lit = clauses.neg_lits(clause).first();
            final SubLObject pos_lit = clauses.pos_lits(clause).first();
            final SubLObject arg = relevant_arg_of_isa_clause(neg_lit, pos_lit, UNPROVIDED);
            final SubLObject rm_pred = kb_accessors.arg_isa_pred(arg, UNPROVIDED, UNPROVIDED);
            return make_rm_cnf(make_binary_formula(rm_pred, literal_arg0(neg_lit, UNPROVIDED), literal_arg2(pos_lit, UNPROVIDED)), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject arg_genl_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_arg_genlP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                        {
                            SubLObject neg_lit = neg_lits.first();
                            SubLObject pos_lit = pos_lits.first();
                            return makeBoolean((((NIL != genls_litP(pos_lit)) && (NIL != kb_accessors.relationP(literal_arg0(neg_lit, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(pos_lit, UNPROVIDED)))) && (NIL != kb_accessors.arg_genl_pred(com.cyc.cycjava.cycl.rule_macros.relevant_arg_of_isa_clause(neg_lit, pos_lit, varP), UNPROVIDED, UNPROVIDED)));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject arg_genl_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_arg_genlP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                final SubLObject neg_lit = neg_lits.first();
                final SubLObject pos_lit = pos_lits.first();
                return makeBoolean((((NIL != genls_litP(pos_lit)) && (NIL != kb_accessors.relationP(literal_arg0(neg_lit, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(pos_lit, UNPROVIDED)))) && (NIL != kb_accessors.arg_genl_pred(relevant_arg_of_isa_clause(neg_lit, pos_lit, varP), UNPROVIDED, UNPROVIDED)));
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_arg_genl_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_arg_genlP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lit = clauses.neg_lits(clause).first();
                    SubLObject pos_lit = clauses.pos_lits(clause).first();
                    SubLObject arg = com.cyc.cycjava.cycl.rule_macros.relevant_arg_of_isa_clause(neg_lit, pos_lit, UNPROVIDED);
                    SubLObject rm_pred = kb_accessors.arg_genl_pred(arg, UNPROVIDED, UNPROVIDED);
                    return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula(rm_pred, literal_arg0(neg_lit, UNPROVIDED), literal_arg2(pos_lit, UNPROVIDED)), UNPROVIDED);
                }
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_arg_genl(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_arg_genlP$.getDynamicValue(thread)) {
            final SubLObject neg_lit = clauses.neg_lits(clause).first();
            final SubLObject pos_lit = clauses.pos_lits(clause).first();
            final SubLObject arg = relevant_arg_of_isa_clause(neg_lit, pos_lit, UNPROVIDED);
            final SubLObject rm_pred = kb_accessors.arg_genl_pred(arg, UNPROVIDED, UNPROVIDED);
            return make_rm_cnf(make_binary_formula(rm_pred, literal_arg0(neg_lit, UNPROVIDED), literal_arg2(pos_lit, UNPROVIDED)), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject inter_arg_isa_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_inter_arg_isaP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.doubletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                        {
                            SubLObject pos_lit = pos_lits.first();
                            if (NIL != isa_litP(pos_lit)) {
                                {
                                    SubLObject pos_isa_var = literal_arg1(pos_lit, UNPROVIDED);
                                    SubLObject pos_isa_col = literal_arg2(pos_lit, UNPROVIDED);
                                    if ((NIL != funcall(varP, pos_isa_var)) && (NIL != fort_types_interface.collectionP(pos_isa_col))) {
                                        {
                                            SubLObject neg_isa_lit = NIL;
                                            SubLObject neg_pred_lit = NIL;
                                            if (NIL != isa_litP(neg_lits.first())) {
                                                neg_isa_lit = neg_lits.first();
                                                neg_pred_lit = second(neg_lits);
                                            } else {
                                                if (NIL != isa_litP(second(neg_lits))) {
                                                    neg_isa_lit = second(neg_lits);
                                                    neg_pred_lit = neg_lits.first();
                                                }
                                            }
                                            if (NIL != neg_isa_lit) {
                                                {
                                                    SubLObject neg_isa_var = literal_arg1(neg_isa_lit, UNPROVIDED);
                                                    SubLObject neg_isa_col = literal_arg2(neg_isa_lit, UNPROVIDED);
                                                    SubLObject relevant_pred = literal_arg0(neg_pred_lit, UNPROVIDED);
                                                    if (((NIL != funcall(varP, neg_isa_var)) && (NIL != fort_types_interface.collectionP(neg_isa_col))) && (NIL != fort_types_interface.predicateP(relevant_pred))) {
                                                        {
                                                            SubLObject ind_arg = position(neg_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject dep_arg = position(pos_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject rm_pred = at_utilities.inter_arg_isa_pred(ind_arg, dep_arg);
                                                            if (NIL != rm_pred) {
                                                                return T;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject inter_arg_isa_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_inter_arg_isaP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.doubletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) {
                final SubLObject pos_lit = pos_lits.first();
                if (NIL != isa_litP(pos_lit)) {
                    final SubLObject pos_isa_var = literal_arg1(pos_lit, UNPROVIDED);
                    final SubLObject pos_isa_col = literal_arg2(pos_lit, UNPROVIDED);
                    if ((NIL != funcall(varP, pos_isa_var)) && (NIL != fort_types_interface.collectionP(pos_isa_col))) {
                        SubLObject neg_isa_lit = NIL;
                        SubLObject neg_pred_lit = NIL;
                        if (NIL != isa_litP(neg_lits.first())) {
                            neg_isa_lit = neg_lits.first();
                            neg_pred_lit = second(neg_lits);
                        } else
                            if (NIL != isa_litP(second(neg_lits))) {
                                neg_isa_lit = second(neg_lits);
                                neg_pred_lit = neg_lits.first();
                            }

                        if (NIL != neg_isa_lit) {
                            final SubLObject neg_isa_var = literal_arg1(neg_isa_lit, UNPROVIDED);
                            final SubLObject neg_isa_col = literal_arg2(neg_isa_lit, UNPROVIDED);
                            final SubLObject relevant_pred = literal_arg0(neg_pred_lit, UNPROVIDED);
                            if (((NIL != funcall(varP, neg_isa_var)) && (NIL != fort_types_interface.collectionP(neg_isa_col))) && (NIL != fort_types_interface.predicateP(relevant_pred))) {
                                final SubLObject ind_arg = position(neg_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject dep_arg = position(pos_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject rm_pred = at_utilities.inter_arg_isa_pred(ind_arg, dep_arg);
                                if (NIL != rm_pred) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_inter_arg_isa_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_inter_arg_isaP$.getDynamicValue(thread)) {
                {
                    SubLObject datum = clause;
                    SubLObject current = datum;
                    SubLObject neg_lits = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    neg_lits = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    {
                        SubLObject temp = current.rest();
                        current = current.first();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        {
                            SubLObject temp_11 = current.rest();
                            current = current.first();
                            {
                                SubLObject pos_isa = NIL;
                                SubLObject pos_isa_var = NIL;
                                SubLObject pos_isa_col = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt22);
                                pos_isa = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt22);
                                pos_isa_var = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt22);
                                pos_isa_col = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp_11;
                                    if (NIL == current) {
                                        current = temp;
                                        if (NIL == current) {
                                            {
                                                SubLObject neg_isa_lit = NIL;
                                                SubLObject neg_pred_lit = NIL;
                                                if (NIL != isa_litP(neg_lits.first())) {
                                                    neg_isa_lit = neg_lits.first();
                                                    neg_pred_lit = second(neg_lits);
                                                } else {
                                                    if (NIL != isa_litP(second(neg_lits))) {
                                                        neg_isa_lit = second(neg_lits);
                                                        neg_pred_lit = neg_lits.first();
                                                    }
                                                }
                                                {
                                                    SubLObject datum_12 = neg_isa_lit;
                                                    SubLObject current_13 = datum_12;
                                                    SubLObject neg_isa = NIL;
                                                    SubLObject neg_isa_var = NIL;
                                                    SubLObject neg_isa_col = NIL;
                                                    destructuring_bind_must_consp(current_13, datum_12, $list_alt23);
                                                    neg_isa = current_13.first();
                                                    current_13 = current_13.rest();
                                                    destructuring_bind_must_consp(current_13, datum_12, $list_alt23);
                                                    neg_isa_var = current_13.first();
                                                    current_13 = current_13.rest();
                                                    destructuring_bind_must_consp(current_13, datum_12, $list_alt23);
                                                    neg_isa_col = current_13.first();
                                                    current_13 = current_13.rest();
                                                    if (NIL == current_13) {
                                                        {
                                                            SubLObject relevant_pred = literal_arg0(neg_pred_lit, UNPROVIDED);
                                                            SubLObject ind_arg = position(neg_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject dep_arg = position(pos_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject rm_pred = at_utilities.inter_arg_isa_pred(ind_arg, dep_arg);
                                                            return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_ternary_formula(rm_pred, relevant_pred, neg_isa_col, pos_isa_col), UNPROVIDED);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum_12, $list_alt23);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt22);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt22);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt22);
                                }
                            }
                        }
                    }
                }
            } else {
                return clause;
            }
            return NIL;
        }
    }

    public static SubLObject express_as_inter_arg_isa(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_inter_arg_isaP$.getDynamicValue(thread)) {
            SubLObject neg_lits = NIL;
            destructuring_bind_must_consp(clause, clause, $list22);
            neg_lits = clause.first();
            SubLObject current = clause.rest();
            destructuring_bind_must_consp(current, clause, $list22);
            final SubLObject temp = current.rest();
            current = current.first();
            destructuring_bind_must_consp(current, clause, $list22);
            final SubLObject temp_$11 = current.rest();
            current = current.first();
            SubLObject pos_isa = NIL;
            SubLObject pos_isa_var = NIL;
            SubLObject pos_isa_col = NIL;
            destructuring_bind_must_consp(current, clause, $list22);
            pos_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, clause, $list22);
            pos_isa_var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, clause, $list22);
            pos_isa_col = current.first();
            current = current.rest();
            if (NIL == current) {
                current = temp_$11;
                if (NIL == current) {
                    current = temp;
                    if (NIL == current) {
                        SubLObject neg_isa_lit = NIL;
                        SubLObject neg_pred_lit = NIL;
                        if (NIL != isa_litP(neg_lits.first())) {
                            neg_isa_lit = neg_lits.first();
                            neg_pred_lit = second(neg_lits);
                        } else
                            if (NIL != isa_litP(second(neg_lits))) {
                                neg_isa_lit = second(neg_lits);
                                neg_pred_lit = neg_lits.first();
                            }

                        SubLObject current_$13;
                        final SubLObject datum_$12 = current_$13 = neg_isa_lit;
                        SubLObject neg_isa = NIL;
                        SubLObject neg_isa_var = NIL;
                        SubLObject neg_isa_col = NIL;
                        destructuring_bind_must_consp(current_$13, datum_$12, $list23);
                        neg_isa = current_$13.first();
                        current_$13 = current_$13.rest();
                        destructuring_bind_must_consp(current_$13, datum_$12, $list23);
                        neg_isa_var = current_$13.first();
                        current_$13 = current_$13.rest();
                        destructuring_bind_must_consp(current_$13, datum_$12, $list23);
                        neg_isa_col = current_$13.first();
                        current_$13 = current_$13.rest();
                        if (NIL == current_$13) {
                            final SubLObject relevant_pred = literal_arg0(neg_pred_lit, UNPROVIDED);
                            final SubLObject ind_arg = position(neg_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject dep_arg = position(pos_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject rm_pred = at_utilities.inter_arg_isa_pred(ind_arg, dep_arg);
                            return make_rm_cnf(make_ternary_formula(rm_pred, relevant_pred, neg_isa_col, pos_isa_col), UNPROVIDED);
                        }
                        cdestructuring_bind_error(datum_$12, $list23);
                    } else {
                        cdestructuring_bind_error(clause, $list22);
                    }
                } else {
                    cdestructuring_bind_error(clause, $list22);
                }
            } else {
                cdestructuring_bind_error(clause, $list22);
            }
            return NIL;
        }
        return clause;
    }

    public static final SubLObject disjoint_with_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_disjoint_withP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.doubletonP(neg_lits)) && (NIL == pos_lits)) {
                        {
                            SubLObject neg_lit_1 = neg_lits.first();
                            SubLObject neg_lit_2 = second(neg_lits);
                            return makeBoolean((((((literal_arg1(neg_lit_1, UNPROVIDED) == literal_arg1(neg_lit_2, UNPROVIDED)) && (NIL != isa_litP(neg_lit_1))) && (NIL != isa_litP(neg_lit_2))) && (NIL != funcall(varP, literal_arg1(neg_lit_1, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(neg_lit_1, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(neg_lit_2, UNPROVIDED))));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject disjoint_with_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_disjoint_withP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.doubletonP(neg_lits)) && (NIL == pos_lits)) {
                final SubLObject neg_lit_1 = neg_lits.first();
                final SubLObject neg_lit_2 = second(neg_lits);
                return makeBoolean(((((literal_arg1(neg_lit_1, UNPROVIDED).eql(literal_arg1(neg_lit_2, UNPROVIDED)) && (NIL != isa_litP(neg_lit_1))) && (NIL != isa_litP(neg_lit_2))) && (NIL != funcall(varP, literal_arg1(neg_lit_1, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(neg_lit_1, UNPROVIDED)))) && (NIL != fort_types_interface.collectionP(literal_arg2(neg_lit_2, UNPROVIDED))));
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_disjoint_with_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_disjoint_withP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$disjointWith, literal_arg2(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg2(second(clauses.neg_lits(clause)), UNPROVIDED)), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_disjoint_with(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_disjoint_withP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$disjointWith, literal_arg2(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg2(second(clauses.neg_lits(clause)), UNPROVIDED)), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject negation_preds_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_negation_predicatesP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.doubletonP(neg_lits)) && (NIL == pos_lits)) {
                        {
                            SubLObject neg_lit_1 = neg_lits.first();
                            SubLObject neg_lit_2 = second(neg_lits);
                            SubLObject pred_1 = literal_arg0(neg_lit_1, UNPROVIDED);
                            SubLObject pred_2 = literal_arg0(neg_lit_2, UNPROVIDED);
                            SubLObject neg_1_args = literal_args(neg_lit_1, UNPROVIDED);
                            SubLObject neg_2_args = literal_args(neg_lit_2, UNPROVIDED);
                            return makeBoolean(((((pred_1 != pred_2) && (NIL != fort_types_interface.predicateP(pred_1))) && (NIL != fort_types_interface.predicateP(pred_2))) && (NIL != list_utilities.every_in_list(varP, neg_1_args, UNPROVIDED))) && (neg_1_args.equal(neg_2_args) || (((NIL != fort_types_interface.commutative_relationP(pred_1)) || (NIL != fort_types_interface.commutative_relationP(pred_2))) && (NIL != list_utilities.sets_equalP(neg_1_args, neg_2_args, UNPROVIDED)))));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject negation_preds_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_negation_predicatesP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.doubletonP(neg_lits)) && (NIL == pos_lits)) {
                final SubLObject neg_lit_1 = neg_lits.first();
                final SubLObject neg_lit_2 = second(neg_lits);
                final SubLObject pred_1 = literal_arg0(neg_lit_1, UNPROVIDED);
                final SubLObject pred_2 = literal_arg0(neg_lit_2, UNPROVIDED);
                final SubLObject neg_1_args = literal_args(neg_lit_1, UNPROVIDED);
                final SubLObject neg_2_args = literal_args(neg_lit_2, UNPROVIDED);
                return makeBoolean(((((!pred_1.eql(pred_2)) && (NIL != fort_types_interface.predicateP(pred_1))) && (NIL != fort_types_interface.predicateP(pred_2))) && (NIL != list_utilities.every_in_list(varP, neg_1_args, UNPROVIDED))) && (neg_1_args.equal(neg_2_args) || (((NIL != fort_types_interface.commutative_relationP(pred_1)) || (NIL != fort_types_interface.commutative_relationP(pred_2))) && (NIL != list_utilities.sets_equalP(neg_1_args, neg_2_args, UNPROVIDED)))));
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_negation_preds_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_negation_predicatesP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$negationPreds, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg0(second(clauses.neg_lits(clause)), UNPROVIDED)), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_negation_preds(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_negation_predicatesP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$negationPreds, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg0(second(clauses.neg_lits(clause)), UNPROVIDED)), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject negation_inverse_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_negation_inverseP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.doubletonP(neg_lits)) && (NIL == pos_lits)) {
                        {
                            SubLObject neg_lit_1 = neg_lits.first();
                            SubLObject neg_lit_2 = second(neg_lits);
                            SubLObject pred_1 = literal_arg0(neg_lit_1, UNPROVIDED);
                            SubLObject pred_2 = literal_arg0(neg_lit_2, UNPROVIDED);
                            if ((((NIL != binary_lit_p(neg_lit_1)) && (NIL != binary_lit_p(neg_lit_2))) && (NIL != fort_types_interface.predicateP(pred_1))) && (NIL != fort_types_interface.predicateP(pred_2))) {
                                {
                                    SubLObject neg1_arg1 = literal_arg1(neg_lit_1, UNPROVIDED);
                                    SubLObject neg1_arg2 = literal_arg2(neg_lit_1, UNPROVIDED);
                                    SubLObject neg2_arg1 = literal_arg1(neg_lit_2, UNPROVIDED);
                                    SubLObject neg2_arg2 = literal_arg2(neg_lit_2, UNPROVIDED);
                                    return makeBoolean((((NIL != funcall(varP, neg1_arg1)) && (NIL != funcall(varP, neg1_arg2))) && (neg1_arg1 == neg2_arg2)) && (neg1_arg2 == neg2_arg1));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject negation_inverse_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_negation_inverseP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.doubletonP(neg_lits)) && (NIL == pos_lits)) {
                final SubLObject neg_lit_1 = neg_lits.first();
                final SubLObject neg_lit_2 = second(neg_lits);
                final SubLObject pred_1 = literal_arg0(neg_lit_1, UNPROVIDED);
                final SubLObject pred_2 = literal_arg0(neg_lit_2, UNPROVIDED);
                if ((((NIL != binary_lit_p(neg_lit_1)) && (NIL != binary_lit_p(neg_lit_2))) && (NIL != fort_types_interface.predicateP(pred_1))) && (NIL != fort_types_interface.predicateP(pred_2))) {
                    final SubLObject neg1_arg1 = literal_arg1(neg_lit_1, UNPROVIDED);
                    final SubLObject neg1_arg2 = literal_arg2(neg_lit_1, UNPROVIDED);
                    final SubLObject neg2_arg1 = literal_arg1(neg_lit_2, UNPROVIDED);
                    final SubLObject neg2_arg2 = literal_arg2(neg_lit_2, UNPROVIDED);
                    return makeBoolean((((NIL != funcall(varP, neg1_arg1)) && (NIL != funcall(varP, neg1_arg2))) && neg1_arg1.eql(neg2_arg2)) && neg1_arg2.eql(neg2_arg1));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_negation_inverse_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_negation_inverseP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$negationInverse, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg0(second(clauses.neg_lits(clause)), UNPROVIDED)), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_negation_inverse(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_negation_inverseP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$negationInverse, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), literal_arg0(second(clauses.neg_lits(clause)), UNPROVIDED)), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject reflexive_predicate_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_reflexiveP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if (NIL != list_utilities.singletonP(pos_lits)) {
                        {
                            SubLObject pos_lit = pos_lits.first();
                            if (NIL != reflexive_litP(pos_lit)) {
                                {
                                    SubLObject var = literal_arg1(pos_lit, UNPROVIDED);
                                    if (NIL != funcall(varP, var)) {
                                        {
                                            SubLObject pred = literal_arg0(pos_lit, UNPROVIDED);
                                            if (NIL != fort_types_interface.predicateP(pred)) {
                                                return com.cyc.cycjava.cycl.rule_macros.reflexive_neg_litsP(pred, var, neg_lits, varP);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject reflexive_predicate_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_reflexiveP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if (NIL != list_utilities.singletonP(pos_lits)) {
                final SubLObject pos_lit = pos_lits.first();
                if (NIL != reflexive_litP(pos_lit)) {
                    final SubLObject var = literal_arg1(pos_lit, UNPROVIDED);
                    if (NIL != funcall(varP, var)) {
                        final SubLObject pred = literal_arg0(pos_lit, UNPROVIDED);
                        if (NIL != fort_types_interface.predicateP(pred)) {
                            return reflexive_neg_litsP(pred, var, neg_lits, varP);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject reflexive_neg_litsP_alt(SubLObject pred, SubLObject var, SubLObject neg_lits, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            SubLObject extra_neg_litP = NIL;
            SubLObject cols = NIL;
            SubLObject vars = NIL;
            SubLObject isa_preds = NIL;
            if (NIL == extra_neg_litP) {
                {
                    SubLObject csome_list_var = neg_lits;
                    SubLObject neg_lit = NIL;
                    for (neg_lit = csome_list_var.first(); !((NIL != extra_neg_litP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , neg_lit = csome_list_var.first()) {
                        {
                            SubLObject arg1 = literal_arg1(neg_lit, UNPROVIDED);
                            SubLObject arg2 = literal_arg2(neg_lit, UNPROVIDED);
                            if (NIL != isa_litP(neg_lit)) {
                                if (var == arg1) {
                                    cols = cons(arg2, cols);
                                } else {
                                    extra_neg_litP = T;
                                }
                            } else {
                                if (((NIL != arg_isa_binary_litP(neg_lit)) && (pred == arg1)) && (NIL != funcall(varP, arg2))) {
                                    {
                                        SubLObject pcase_var = literal_arg0(neg_lit, UNPROVIDED);
                                        if (pcase_var.eql($$arg1Isa)) {
                                            vars = cons(arg2, vars);
                                            {
                                                SubLObject item_var = $$arg1Isa;
                                                if (NIL == member(item_var, isa_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    isa_preds = cons(item_var, isa_preds);
                                                }
                                            }
                                        } else {
                                            if (pcase_var.eql($$arg2Isa)) {
                                                vars = cons(arg2, vars);
                                                {
                                                    SubLObject item_var = $$arg2Isa;
                                                    if (NIL == member(item_var, isa_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        isa_preds = cons(item_var, isa_preds);
                                                    }
                                                }
                                            } else {
                                                extra_neg_litP = T;
                                            }
                                        }
                                    }
                                } else {
                                    extra_neg_litP = T;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == extra_neg_litP) {
                {
                    SubLObject mal_argP = (NIL != cols) ? ((SubLObject) (NIL)) : vars;
                    SubLObject all_arg_isa = (NIL != mal_argP) ? ((SubLObject) (NIL)) : kb_accessors.arg_types(pred, UNPROVIDED);
                    if (NIL == mal_argP) {
                        {
                            SubLObject csome_list_var = cols;
                            SubLObject col = NIL;
                            for (col = csome_list_var.first(); !((NIL != mal_argP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                if (NIL != fort_types_interface.collectionP(col)) {
                                    mal_argP = makeBoolean(NIL == genls.all_specP(col, all_arg_isa, UNPROVIDED, UNPROVIDED));
                                } else {
                                    if ((NIL != funcall(varP, col)) && (NIL != subl_promotions.memberP(col, vars, UNPROVIDED, UNPROVIDED))) {
                                    } else {
                                        mal_argP = T;
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == list_utilities.doubletonP(isa_preds)) {
                        if (NIL == mal_argP) {
                            {
                                SubLObject csome_list_var = isa_preds;
                                SubLObject isa_pred = NIL;
                                for (isa_pred = csome_list_var.first(); !((NIL != mal_argP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_pred = csome_list_var.first()) {
                                    {
                                        SubLObject isas = kb_mapping_utilities.pred_values_in_relevant_mts(pred, isa_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL == mal_argP) {
                                            {
                                                SubLObject csome_list_var_14 = isas;
                                                SubLObject arg_isa = NIL;
                                                for (arg_isa = csome_list_var_14.first(); !((NIL != mal_argP) || (NIL == csome_list_var_14)); csome_list_var_14 = csome_list_var_14.rest() , arg_isa = csome_list_var_14.first()) {
                                                    mal_argP = makeBoolean(NIL == genls.all_specP(arg_isa, all_arg_isa, UNPROVIDED, UNPROVIDED));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return makeBoolean(NIL == mal_argP);
                }
            }
        }
        return NIL;
    }

    public static SubLObject reflexive_neg_litsP(final SubLObject pred, final SubLObject var, final SubLObject neg_lits, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        SubLObject extra_neg_litP = NIL;
        SubLObject cols = NIL;
        SubLObject vars = NIL;
        SubLObject isa_preds = NIL;
        if (NIL == extra_neg_litP) {
            SubLObject csome_list_var = neg_lits;
            SubLObject neg_lit = NIL;
            neg_lit = csome_list_var.first();
            while ((NIL == extra_neg_litP) && (NIL != csome_list_var)) {
                final SubLObject arg1 = literal_arg1(neg_lit, UNPROVIDED);
                final SubLObject arg2 = literal_arg2(neg_lit, UNPROVIDED);
                if (NIL != isa_litP(neg_lit)) {
                    if (var.eql(arg1)) {
                        cols = cons(arg2, cols);
                    } else {
                        extra_neg_litP = T;
                    }
                } else
                    if (((NIL != arg_isa_binary_litP(neg_lit)) && pred.eql(arg1)) && (NIL != funcall(varP, arg2))) {
                        final SubLObject pcase_var = literal_arg0(neg_lit, UNPROVIDED);
                        if (pcase_var.eql($$arg1Isa)) {
                            vars = cons(arg2, vars);
                            final SubLObject item_var = $$arg1Isa;
                            if (NIL == member(item_var, isa_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                isa_preds = cons(item_var, isa_preds);
                            }
                        } else
                            if (pcase_var.eql($$arg2Isa)) {
                                vars = cons(arg2, vars);
                                final SubLObject item_var = $$arg2Isa;
                                if (NIL == member(item_var, isa_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    isa_preds = cons(item_var, isa_preds);
                                }
                            } else {
                                extra_neg_litP = T;
                            }

                    } else {
                        extra_neg_litP = T;
                    }

                csome_list_var = csome_list_var.rest();
                neg_lit = csome_list_var.first();
            } 
        }
        if (NIL == extra_neg_litP) {
            SubLObject mal_argP = (NIL != cols) ? NIL : vars;
            final SubLObject all_arg_isa = (NIL != mal_argP) ? NIL : kb_accessors.arg_types(pred, UNPROVIDED);
            if (NIL == mal_argP) {
                SubLObject csome_list_var2 = cols;
                SubLObject col = NIL;
                col = csome_list_var2.first();
                while ((NIL == mal_argP) && (NIL != csome_list_var2)) {
                    if (NIL != fort_types_interface.collectionP(col)) {
                        mal_argP = makeBoolean(NIL == genls.all_specP(col, all_arg_isa, UNPROVIDED, UNPROVIDED));
                    } else
                        if ((NIL == funcall(varP, col)) || (NIL == subl_promotions.memberP(col, vars, UNPROVIDED, UNPROVIDED))) {
                            mal_argP = T;
                        }

                    csome_list_var2 = csome_list_var2.rest();
                    col = csome_list_var2.first();
                } 
            }
            if ((NIL == list_utilities.doubletonP(isa_preds)) && (NIL == mal_argP)) {
                SubLObject csome_list_var2 = isa_preds;
                SubLObject isa_pred = NIL;
                isa_pred = csome_list_var2.first();
                while ((NIL == mal_argP) && (NIL != csome_list_var2)) {
                    final SubLObject isas = kb_mapping_utilities.pred_values_in_relevant_mts(pred, isa_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == mal_argP) {
                        SubLObject csome_list_var_$14;
                        SubLObject arg_isa;
                        for (csome_list_var_$14 = isas, arg_isa = NIL, arg_isa = csome_list_var_$14.first(); (NIL == mal_argP) && (NIL != csome_list_var_$14); mal_argP = makeBoolean(NIL == genls.all_specP(arg_isa, all_arg_isa, UNPROVIDED, UNPROVIDED)) , csome_list_var_$14 = csome_list_var_$14.rest() , arg_isa = csome_list_var_$14.first()) {
                        }
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    isa_pred = csome_list_var2.first();
                } 
            }
            return makeBoolean(NIL == mal_argP);
        }
        return NIL;
    }

    public static final SubLObject express_as_reflexive_predicate_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_reflexiveP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$isa, literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED), $$ReflexiveBinaryPredicate), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_reflexive_predicate(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_reflexiveP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$isa, literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED), $$ReflexiveBinaryPredicate), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject irreflexive_predicate_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_irreflexiveP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    SubLObject ref_lits = reflexive_lits(neg_lits);
                    if ((NIL == pos_lits) && (NIL != list_utilities.singletonP(ref_lits))) {
                        {
                            SubLObject ref_lit = ref_lits.first();
                            SubLObject var = (NIL != ref_lit) ? ((SubLObject) (literal_arg1(ref_lit, UNPROVIDED))) : NIL;
                            if (NIL != funcall(varP, var)) {
                                {
                                    SubLObject pred = literal_arg0(ref_lit, UNPROVIDED);
                                    if (NIL != fort_types_interface.predicateP(pred)) {
                                        return com.cyc.cycjava.cycl.rule_macros.reflexive_neg_litsP(pred, var, remove(ref_lit, neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject irreflexive_predicate_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_irreflexiveP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            final SubLObject ref_lits = reflexive_lits(neg_lits);
            if ((NIL == pos_lits) && (NIL != list_utilities.singletonP(ref_lits))) {
                final SubLObject ref_lit = ref_lits.first();
                final SubLObject var = (NIL != ref_lit) ? literal_arg1(ref_lit, UNPROVIDED) : NIL;
                if (NIL != funcall(varP, var)) {
                    final SubLObject pred = literal_arg0(ref_lit, UNPROVIDED);
                    if (NIL != fort_types_interface.predicateP(pred)) {
                        return reflexive_neg_litsP(pred, var, remove(ref_lit, neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_irreflexive_predicate_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_irreflexiveP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$isa, literal_arg0(reflexive_lits(clauses.neg_lits(clause)).first(), UNPROVIDED), $$IrreflexiveBinaryPredicate), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_irreflexive_predicate(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_irreflexiveP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$isa, literal_arg0(reflexive_lits(clauses.neg_lits(clause)).first(), UNPROVIDED), $$IrreflexiveBinaryPredicate), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject transitive_predicate_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_transitiveP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    if ((NIL != list_utilities.singletonP(pos_lits)) && (NIL != list_utilities.doubletonP(neg_lits))) {
                        {
                            SubLObject pos_lit = pos_lits.first();
                            SubLObject var1 = literal_arg1(pos_lit, UNPROVIDED);
                            SubLObject var2 = literal_arg2(pos_lit, UNPROVIDED);
                            if (((NIL != funcall(varP, var1)) && (NIL != funcall(varP, var2))) && (NIL != binary_lit_p(pos_lit))) {
                                {
                                    SubLObject pred = literal_arg0(pos_lit, UNPROVIDED);
                                    if (NIL != fort_types_interface.predicateP(pred)) {
                                        {
                                            SubLObject neg_lit1 = neg_lits.first();
                                            SubLObject neg_lit2 = second(neg_lits);
                                            if ((((pred == literal_arg0(neg_lit1, UNPROVIDED)) && (pred == literal_arg0(neg_lit2, UNPROVIDED))) && (NIL != binary_lit_p(neg_lit1))) && (NIL != binary_lit_p(neg_lit2))) {
                                                {
                                                    SubLObject neg_lit1_var1 = literal_arg1(neg_lit1, UNPROVIDED);
                                                    SubLObject neg_lit1_var2 = literal_arg2(neg_lit1, UNPROVIDED);
                                                    SubLObject neg_lit2_var1 = literal_arg1(neg_lit2, UNPROVIDED);
                                                    SubLObject neg_lit2_var2 = literal_arg2(neg_lit2, UNPROVIDED);
                                                    return makeBoolean(((((var1 == neg_lit1_var1) && (var2 == neg_lit2_var2)) && (neg_lit1_var2 == neg_lit2_var1)) && (NIL != funcall(varP, neg_lit1_var2))) || ((((var1 == neg_lit2_var1) && (var2 == neg_lit1_var2)) && (neg_lit1_var1 == neg_lit2_var2)) && (NIL != funcall(varP, neg_lit1_var1))));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject transitive_predicate_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_transitiveP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            if ((NIL != list_utilities.singletonP(pos_lits)) && (NIL != list_utilities.doubletonP(neg_lits))) {
                final SubLObject pos_lit = pos_lits.first();
                final SubLObject var1 = literal_arg1(pos_lit, UNPROVIDED);
                final SubLObject var2 = literal_arg2(pos_lit, UNPROVIDED);
                if (((NIL != funcall(varP, var1)) && (NIL != funcall(varP, var2))) && (NIL != binary_lit_p(pos_lit))) {
                    final SubLObject pred = literal_arg0(pos_lit, UNPROVIDED);
                    if (NIL != fort_types_interface.predicateP(pred)) {
                        final SubLObject neg_lit1 = neg_lits.first();
                        final SubLObject neg_lit2 = second(neg_lits);
                        if (((pred.eql(literal_arg0(neg_lit1, UNPROVIDED)) && pred.eql(literal_arg0(neg_lit2, UNPROVIDED))) && (NIL != binary_lit_p(neg_lit1))) && (NIL != binary_lit_p(neg_lit2))) {
                            final SubLObject neg_lit1_var1 = literal_arg1(neg_lit1, UNPROVIDED);
                            final SubLObject neg_lit1_var2 = literal_arg2(neg_lit1, UNPROVIDED);
                            final SubLObject neg_lit2_var1 = literal_arg1(neg_lit2, UNPROVIDED);
                            final SubLObject neg_lit2_var2 = literal_arg2(neg_lit2, UNPROVIDED);
                            return makeBoolean((((var1.eql(neg_lit1_var1) && var2.eql(neg_lit2_var2)) && neg_lit1_var2.eql(neg_lit2_var1)) && (NIL != funcall(varP, neg_lit1_var2))) || (((var1.eql(neg_lit2_var1) && var2.eql(neg_lit1_var2)) && neg_lit1_var1.eql(neg_lit2_var2)) && (NIL != funcall(varP, neg_lit1_var1))));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject express_as_transitive_predicate_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_transitiveP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$isa, literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED), $$TransitiveBinaryPredicate), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_transitive_predicate(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_transitiveP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$isa, literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED), $$TransitiveBinaryPredicate), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject symmetric_predicate_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_symmetricP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    return makeBoolean(((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) && (NIL != com.cyc.cycjava.cycl.rule_macros.symmetric_literalsP(neg_lits.first(), pos_lits.first(), varP)));
                }
            }
            return NIL;
        }
    }

    public static SubLObject symmetric_predicate_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_symmetricP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            return makeBoolean(((NIL != list_utilities.singletonP(neg_lits)) && (NIL != list_utilities.singletonP(pos_lits))) && (NIL != symmetric_literalsP(neg_lits.first(), pos_lits.first(), varP)));
        }
        return NIL;
    }

    public static final SubLObject symmetric_literalsP_alt(SubLObject lit1, SubLObject lit2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            SubLObject pred = literal_arg0(lit1, UNPROVIDED);
            if ((((NIL != binary_lit_p(lit1)) && (NIL != binary_lit_p(lit2))) && (pred == literal_arg0(lit2, UNPROVIDED))) && (NIL != fort_types_interface.predicateP(pred))) {
                {
                    SubLObject lit1_var1 = literal_arg1(lit1, UNPROVIDED);
                    SubLObject lit1_var2 = literal_arg2(lit1, UNPROVIDED);
                    SubLObject lit2_var1 = literal_arg1(lit2, UNPROVIDED);
                    SubLObject lit2_var2 = literal_arg2(lit2, UNPROVIDED);
                    return makeBoolean((((lit1_var1 == lit2_var2) && (lit1_var2 == lit2_var1)) && (NIL != funcall(varP, lit1_var1))) && (NIL != funcall(varP, lit1_var2)));
                }
            }
        }
        return NIL;
    }

    public static SubLObject symmetric_literalsP(final SubLObject lit1, final SubLObject lit2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLObject pred = literal_arg0(lit1, UNPROVIDED);
        if ((((NIL != binary_lit_p(lit1)) && (NIL != binary_lit_p(lit2))) && pred.eql(literal_arg0(lit2, UNPROVIDED))) && (NIL != fort_types_interface.predicateP(pred))) {
            final SubLObject lit1_var1 = literal_arg1(lit1, UNPROVIDED);
            final SubLObject lit1_var2 = literal_arg2(lit1, UNPROVIDED);
            final SubLObject lit2_var1 = literal_arg1(lit2, UNPROVIDED);
            final SubLObject lit2_var2 = literal_arg2(lit2, UNPROVIDED);
            return makeBoolean(((lit1_var1.eql(lit2_var2) && lit1_var2.eql(lit2_var1)) && (NIL != funcall(varP, lit1_var1))) && (NIL != funcall(varP, lit1_var2)));
        }
        return NIL;
    }

    public static final SubLObject express_as_symmetric_predicate_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_symmetricP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$isa, literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED), $$SymmetricBinaryPredicate), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_symmetric_predicate(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_symmetricP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$isa, literal_arg0(clauses.pos_lits(clause).first(), UNPROVIDED), $$SymmetricBinaryPredicate), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject asymmetric_predicate_clauseP_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_asymmetricP$.getDynamicValue(thread)) {
                {
                    SubLObject neg_lits = clauses.neg_lits(clause);
                    SubLObject pos_lits = clauses.pos_lits(clause);
                    return makeBoolean(((NIL == pos_lits) && (NIL != list_utilities.doubletonP(neg_lits))) && (NIL != com.cyc.cycjava.cycl.rule_macros.symmetric_literalsP(neg_lits.first(), second(neg_lits), varP)));
                }
            }
            return NIL;
        }
    }

    public static SubLObject asymmetric_predicate_clauseP(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_asymmetricP$.getDynamicValue(thread)) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            return makeBoolean(((NIL == pos_lits) && (NIL != list_utilities.doubletonP(neg_lits))) && (NIL != symmetric_literalsP(neg_lits.first(), second(neg_lits), varP)));
        }
        return NIL;
    }

    public static final SubLObject express_as_asymmetric_predicate_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$express_as_asymmetricP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rule_macros.make_rm_cnf(make_binary_formula($$isa, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), $$AsymmetricBinaryPredicate), UNPROVIDED);
            } else {
                return clause;
            }
        }
    }

    public static SubLObject express_as_asymmetric_predicate(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$express_as_asymmetricP$.getDynamicValue(thread)) {
            return make_rm_cnf(make_binary_formula($$isa, literal_arg0(clauses.neg_lits(clause).first(), UNPROVIDED), $$AsymmetricBinaryPredicate), UNPROVIDED);
        }
        return clause;
    }

    public static final SubLObject make_rm_cnf_alt(SubLObject pos_lit, SubLObject neg_lits) {
        if (neg_lits == UNPROVIDED) {
            neg_lits = NIL;
        }
        return clauses.make_cnf(neg_lits, list(pos_lit));
    }

    public static SubLObject make_rm_cnf(final SubLObject pos_lit, SubLObject neg_lits) {
        if (neg_lits == UNPROVIDED) {
            neg_lits = NIL;
        }
        return clauses.make_cnf(neg_lits, list(pos_lit));
    }

    public static SubLObject declare_rule_macros_file() {
        declareFunction("canonicalize_clauses_wrt_rule_macros", "CANONICALIZE-CLAUSES-WRT-RULE-MACROS", 1, 0, false);
        declareFunction("required_arg_pred_clausesP", "REQUIRED-ARG-PRED-CLAUSES?", 1, 1, false);
        declareFunction("express_as_required_arg_pred", "EXPRESS-AS-REQUIRED-ARG-PRED", 1, 0, false);
        declareFunction("required_arg_pred", "REQUIRED-ARG-PRED", 1, 0, false);
        declareFunction("relation_type_clausesP", "RELATION-TYPE-CLAUSES?", 1, 1, false);
        declareFunction("express_as_relation_type", "EXPRESS-AS-RELATION-TYPE", 1, 0, false);
        declareFunction("relation_type_pred", "RELATION-TYPE-PRED", 1, 1, false);
        declareFunction("relation_type_gaf", "RELATION-TYPE-GAF", 4, 1, false);
        declareFunction("canonicalize_clause_wrt_rule_macros", "CANONICALIZE-CLAUSE-WRT-RULE-MACROS", 1, 0, false);
        declareFunction("genls_clauseP", "GENLS-CLAUSE?", 1, 1, false);
        declareFunction("express_as_genls", "EXPRESS-AS-GENLS", 1, 0, false);
        declareFunction("genl_predicates_clauseP", "GENL-PREDICATES-CLAUSE?", 1, 1, false);
        declareFunction("express_as_genl_predicates", "EXPRESS-AS-GENL-PREDICATES", 1, 0, false);
        declareFunction("genl_inverse_clauseP", "GENL-INVERSE-CLAUSE?", 1, 1, false);
        declareFunction("express_as_genl_inverse", "EXPRESS-AS-GENL-INVERSE", 1, 0, false);
        declareFunction("arg_isa_clauseP", "ARG-ISA-CLAUSE?", 1, 1, false);
        declareFunction("relevant_arg_of_isa_clause", "RELEVANT-ARG-OF-ISA-CLAUSE", 2, 1, false);
        declareFunction("express_as_arg_isa", "EXPRESS-AS-ARG-ISA", 1, 0, false);
        declareFunction("arg_genl_clauseP", "ARG-GENL-CLAUSE?", 1, 1, false);
        declareFunction("express_as_arg_genl", "EXPRESS-AS-ARG-GENL", 1, 0, false);
        declareFunction("inter_arg_isa_clauseP", "INTER-ARG-ISA-CLAUSE?", 1, 1, false);
        declareFunction("express_as_inter_arg_isa", "EXPRESS-AS-INTER-ARG-ISA", 1, 0, false);
        declareFunction("disjoint_with_clauseP", "DISJOINT-WITH-CLAUSE?", 1, 1, false);
        declareFunction("express_as_disjoint_with", "EXPRESS-AS-DISJOINT-WITH", 1, 0, false);
        declareFunction("negation_preds_clauseP", "NEGATION-PREDS-CLAUSE?", 1, 1, false);
        declareFunction("express_as_negation_preds", "EXPRESS-AS-NEGATION-PREDS", 1, 0, false);
        declareFunction("negation_inverse_clauseP", "NEGATION-INVERSE-CLAUSE?", 1, 1, false);
        declareFunction("express_as_negation_inverse", "EXPRESS-AS-NEGATION-INVERSE", 1, 0, false);
        declareFunction("reflexive_predicate_clauseP", "REFLEXIVE-PREDICATE-CLAUSE?", 1, 1, false);
        declareFunction("reflexive_neg_litsP", "REFLEXIVE-NEG-LITS?", 3, 1, false);
        declareFunction("express_as_reflexive_predicate", "EXPRESS-AS-REFLEXIVE-PREDICATE", 1, 0, false);
        declareFunction("irreflexive_predicate_clauseP", "IRREFLEXIVE-PREDICATE-CLAUSE?", 1, 1, false);
        declareFunction("express_as_irreflexive_predicate", "EXPRESS-AS-IRREFLEXIVE-PREDICATE", 1, 0, false);
        declareFunction("transitive_predicate_clauseP", "TRANSITIVE-PREDICATE-CLAUSE?", 1, 1, false);
        declareFunction("express_as_transitive_predicate", "EXPRESS-AS-TRANSITIVE-PREDICATE", 1, 0, false);
        declareFunction("symmetric_predicate_clauseP", "SYMMETRIC-PREDICATE-CLAUSE?", 1, 1, false);
        declareFunction("symmetric_literalsP", "SYMMETRIC-LITERALS?", 2, 1, false);
        declareFunction("express_as_symmetric_predicate", "EXPRESS-AS-SYMMETRIC-PREDICATE", 1, 0, false);
        declareFunction("asymmetric_predicate_clauseP", "ASYMMETRIC-PREDICATE-CLAUSE?", 1, 1, false);
        declareFunction("express_as_asymmetric_predicate", "EXPRESS-AS-ASYMMETRIC-PREDICATE", 1, 0, false);
        declareFunction("make_rm_cnf", "MAKE-RM-CNF", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_rule_macros_file() {
        return NIL;
    }

    public static SubLObject setup_rule_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rule_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_rule_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rule_macros_file();
    }

    static {
    }

    static private final SubLList $list_alt2 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLList $list_alt3 = list(list(list(list(makeSymbol("ISA"), makeSymbol("VAR"), makeSymbol("COL"))), list(makeSymbol("POS-LIT"))));

    static private final SubLString $str_alt6$invalid_required_arg_pred_index__ = makeString("invalid required-arg-pred index: ~s");

    static private final SubLList $list_alt7 = list(list(makeSymbol("NEG-LITS-1"), makeSymbol("POS-LITS-1")), list(makeSymbol("NEG-LITS-2"), makeSymbol("POS-LITS-2")));

    static private final SubLList $list_alt8 = list(list(list(list(makeSymbol("ISA"), makeSymbol("VAR"), makeSymbol("COL"))), list(makeSymbol("POS-LIT-1"))), list(list(makeSymbol("NEG-LIT-2")), list(makeSymbol("POS-LIT-2"))));

    static private final SubLString $str_alt17$invalid_relation_type_index___s = makeString("invalid relation-type index: ~s");

    static private final SubLString $str_alt18$invalid_relation_type_rule_macro_ = makeString("invalid relation-type rule-macro-pred: ~s");

    static private final SubLList $list_alt22 = list(makeSymbol("NEG-LITS"), list(list(makeSymbol("POS-ISA"), makeSymbol("POS-ISA-VAR"), makeSymbol("POS-ISA-COL"))));

    static private final SubLList $list_alt23 = list(makeSymbol("NEG-ISA"), makeSymbol("NEG-ISA-VAR"), makeSymbol("NEG-ISA-COL"));
}

/**
 * Total time: 323 ms
 */
