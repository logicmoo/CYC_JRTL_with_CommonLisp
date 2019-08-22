package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_ternary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_unary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_unary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_quantifier_unifier_3 extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_quantifier_unifier_3();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3";

    public static final String myFingerPrint = "0a6791840b0ba80376035f996eacfa4e903cb637108995c3cdeead9439faa39c";

    // deflexical
    private static final SubLSymbol $quant_unif_3_microseconds$ = makeSymbol("*QUANT-UNIF-3-MICROSECONDS*");





    private static final SubLObject $$QuantifierUnifier_3_RLModule = reader_make_constant_shell(makeString("QuantifierUnifier-3-RLModule"));

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("QUANT-UNIF-3-REQUIRED"), makeKeyword("COST"), makeSymbol("QUANT-UNIF-3-COST"), makeKeyword("REFORMULATE"), makeSymbol("QUANT-UNIF-3-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Eliminates redundant NL quantification"), makeKeyword("EXAMPLE-SOURCE"), makeString("(genls (NLQuantFn-3 BareForm-NLAttr \n             (NLNumberFn Plural-NLAttr Dog)) Mammal)"), makeKeyword("EXAMPLE-TARGET"), makeString("(genls Dog Mammal)") });



    public static final SubLList $list3 = list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")));

    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

    private static final SubLObject $$NLNumberFn = reader_make_constant_shell(makeString("NLNumberFn"));

    private static final SubLObject $$NLDefinitenessFn_3 = reader_make_constant_shell(makeString("NLDefinitenessFn-3"));

    private static final SubLObject $$NLQuantFn_3 = reader_make_constant_shell(makeString("NLQuantFn-3"));

    private static final SubLObject $$BareForm_NLAttr = reader_make_constant_shell(makeString("BareForm-NLAttr"));

    private static final SubLObject $$CardinalityOfFn = reader_make_constant_shell(makeString("CardinalityOfFn"));

    private static final SubLObject $$UnaryFunction = reader_make_constant_shell(makeString("UnaryFunction"));

    private static final SubLObject $$NLGenQuantAttribute = reader_make_constant_shell(makeString("NLGenQuantAttribute"));

    private static final SubLObject $$NumericalQuant_NLAttrFn = reader_make_constant_shell(makeString("NumericalQuant-NLAttrFn"));

    private static final SubLObject $$ProperName_NLAttr = reader_make_constant_shell(makeString("ProperName-NLAttr"));

    private static final SubLObject $$NLTagFn = reader_make_constant_shell(makeString("NLTagFn"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$SetOrCollectionType = reader_make_constant_shell(makeString("SetOrCollectionType"));

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLObject $$SubcollectionFunction = reader_make_constant_shell(makeString("SubcollectionFunction"));

    public static final SubLList $list19 = list(reader_make_constant_shell(makeString("NLDefinitenessFn-3")), reader_make_constant_shell(makeString("NLQuantFn-3")));

    public static final SubLList $list20 = list(reader_make_constant_shell(makeString("Indefinite-NLAttr")), reader_make_constant_shell(makeString("Definite-NLAttr")), reader_make_constant_shell(makeString("Some-NLAttr")), reader_make_constant_shell(makeString("BareForm-NLAttr")));

    private static final SubLObject $$Definiteness_NLAttr = reader_make_constant_shell(makeString("Definiteness-NLAttr"));

    private static final SubLObject $$Plural_NLAttr = reader_make_constant_shell(makeString("Plural-NLAttr"));

    private static final SubLObject $$GenValueFn = reader_make_constant_shell(makeString("GenValueFn"));

    private static final SubLObject $$QuantityVariableFn = reader_make_constant_shell(makeString("QuantityVariableFn"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$CollectionType = reader_make_constant_shell(makeString("CollectionType"));

    private static final SubLObject $$CollectionTypeType = reader_make_constant_shell(makeString("CollectionTypeType"));

    private static final SubLObject $$FixedOrderCollection = reader_make_constant_shell(makeString("FixedOrderCollection"));

    private static final SubLObject $$SubcollectionOfWithRelationToFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));

    private static final SubLObject $const30$SubcollectionOfWithRelationToType = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn"));

    private static final SubLObject $$SubcollectionOfWithRelationFromFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn"));

    private static final SubLObject $const32$SubcollectionOfWithRelationFromTy = reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn"));

    public static final SubLSymbol ALL_FORT_INSTANCES_CACHED = makeSymbol("ALL-FORT-INSTANCES-CACHED");

    public static final SubLSymbol $all_fort_instances_cached_caching_state$ = makeSymbol("*ALL-FORT-INSTANCES-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    public static final SubLSymbol ALL_SPEC_FUNCS_IN_ANY_MT_CACHED = makeSymbol("ALL-SPEC-FUNCS-IN-ANY-MT-CACHED");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$genlFuncs = reader_make_constant_shell(makeString("genlFuncs"));

    public static final SubLSymbol $all_spec_funcs_in_any_mt_cached_caching_state$ = makeSymbol("*ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-CACHING-STATE*");

    public static SubLObject quant_unif_3_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLObject formula = (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) ? clause_utilities.gaf_cnf_literal(expression.first()) : expression;
        if (NIL != el_formula_p(formula)) {
            SubLObject matchP = NIL;
            final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = NIL, rest = args; (NIL == matchP) && (NIL != rest); rest = rest.rest()) {
                arg = rest.first();
                if (NIL != quant_unif_3_nl_quant_fn_expressionP(arg)) {
                    matchP = T;
                }
            }
            matchP = makeBoolean((NIL != matchP) || (NIL != quant_unif_3_some_fn_expressionP(formula)));
            matchP = makeBoolean((NIL != matchP) || (NIL != quant_unif_3_unary_fn_expressionP(formula, mt)));
            matchP = makeBoolean((NIL != matchP) || (NIL != quant_unif_3_quant_def_expressionP(formula)));
            matchP = makeBoolean((NIL != matchP) || (NIL != quant_unif_3_def_gen_quant_expressionP(formula, mt)));
            matchP = makeBoolean((NIL != matchP) || (NIL != quant_unif_3_def_quant_bare_expressionP(formula)));
            matchP = makeBoolean((NIL != matchP) || (NIL != quant_unif_3_numerical_quant_expressionP(formula)));
            matchP = makeBoolean((NIL != matchP) || (NIL != quant_unif_3_proper_name_expressionP(formula)));
            return matchP;
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_some_fn_expressionP(final SubLObject expression) {
        return makeBoolean((((NIL != formula_arityE(expression, THREE_INTEGER, UNPROVIDED)) && (NIL != member(cycl_utilities.formula_operator(expression), $list3, UNPROVIDED, UNPROVIDED))) && (NIL != el_unary_formula_p(cycl_utilities.formula_arg3(expression, UNPROVIDED)))) && $$SomeFn.eql(cycl_utilities.formula_operator(cycl_utilities.formula_arg3(expression, UNPROVIDED))));
    }

    public static SubLObject quant_unif_3_nl_quant_fn_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_formula_p(expression)) && ((NIL != formula_arityE(expression, TWO_INTEGER, UNPROVIDED)) || (NIL != formula_arityE(expression, THREE_INTEGER, UNPROVIDED)))) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(expression);
            final SubLObject nl_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((((NIL != el_formula_p(nl_number_fn)) && (NIL != formula_arityE(nl_number_fn, TWO_INTEGER, UNPROVIDED))) && $$NLNumberFn.eql(cycl_utilities.formula_operator(nl_number_fn))) && (NIL != nl_tag_fn_fort_3P(nl_quant_fn))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_subcol_fn_expressionP(final SubLObject expression) {
        return makeBoolean((NIL != member(cycl_utilities.formula_operator(expression), $list3, UNPROVIDED, UNPROVIDED)) && (NIL != formula_arityE(expression, THREE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject quant_unif_3_unary_fn_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_unary_formula_p(expression)) {
            thread.resetMultipleValues();
            final SubLObject unary_fn = unmake_unary_formula(expression);
            final SubLObject nl_quant_fn_expr = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != el_binary_formula_p(nl_quant_fn_expr)) || (NIL != el_ternary_formula_p(nl_quant_fn_expr))) {
                thread.resetMultipleValues();
                final SubLObject nl_quant_fn = unmake_binary_formula(nl_quant_fn_expr);
                final SubLObject nl_quant_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != el_binary_formula_p(nl_number_fn_expr)) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject nl_number_attr = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (((($$NLNumberFn.eql(nl_number_fn) && ($$NLDefinitenessFn_3.eql(nl_quant_fn) || ($$NLQuantFn_3.eql(nl_quant_fn) && $$BareForm_NLAttr.eql(nl_quant_attr)))) && ((NIL == subcollection_function_nautP(col, mt)) || unary_fn.eql($$CardinalityOfFn))) && (NIL != isa.isaP(unary_fn, $$UnaryFunction, mt, UNPROVIDED))) && (NIL != quant_unif_3_admitted_colP(col, ONE_INTEGER, unary_fn, mt))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_quant_def_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression))) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(expression);
            final SubLObject quant_attr = thread.secondMultipleValue();
            final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ($$NLQuantFn_3.eql(nl_quant_fn) && (NIL != el_binary_formula_p(nl_def_fn_expr))) {
                thread.resetMultipleValues();
                final SubLObject nl_def_fn = unmake_binary_formula(nl_def_fn_expr);
                final SubLObject def_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ($$NLDefinitenessFn_3.eql(nl_def_fn) && (NIL != el_binary_formula_p(nl_number_fn_expr))) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject number = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ($$NLNumberFn.eql(nl_number_fn)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_def_gen_quant_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression))) {
            thread.resetMultipleValues();
            final SubLObject nl_def_fn = unmake_binary_formula(expression);
            final SubLObject def_attr = thread.secondMultipleValue();
            final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ($$NLDefinitenessFn_3.eql(nl_def_fn) && ((NIL != el_binary_formula_p(nl_quant_fn_expr)) || (NIL != el_ternary_formula_p(nl_quant_fn_expr)))) {
                thread.resetMultipleValues();
                final SubLObject nl_quant_fn = unmake_binary_formula(nl_quant_fn_expr);
                final SubLObject quant_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ($$NLQuantFn_3.eql(nl_quant_fn) && (NIL != el_binary_formula_p(nl_number_fn_expr))) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject number = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ($$NLNumberFn.eql(nl_number_fn) && (NIL != isa.isaP(quant_attr, $$NLGenQuantAttribute, mt, UNPROVIDED))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_def_quant_bare_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression))) {
            thread.resetMultipleValues();
            final SubLObject nl_def_fn = unmake_binary_formula(expression);
            final SubLObject def_attr = thread.secondMultipleValue();
            final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ($$NLDefinitenessFn_3.eql(nl_def_fn) && (NIL != el_ternary_formula_p(nl_quant_fn_expr))) {
                thread.resetMultipleValues();
                final SubLObject nl_quant_fn = unmake_binary_formula(nl_quant_fn_expr);
                final SubLObject quant_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (($$NLQuantFn_3.eql(nl_quant_fn) && $$BareForm_NLAttr.eql(quant_attr)) && (NIL != el_binary_formula_p(nl_number_fn_expr))) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject number = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ($$NLNumberFn.eql(nl_number_fn)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_numerical_quant_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression))) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(expression);
            final SubLObject quant_attr = thread.secondMultipleValue();
            final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((($$NLQuantFn_3.eql(nl_quant_fn) && (NIL != el_unary_formula_p(quant_attr))) && $$NumericalQuant_NLAttrFn.eql(cycl_utilities.formula_arg1(quant_attr, UNPROVIDED))) && (NIL != el_ternary_formula_p(nl_def_fn_expr))) {
                thread.resetMultipleValues();
                final SubLObject nl_def_fn = unmake_binary_formula(nl_def_fn_expr);
                final SubLObject def_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ($$NLDefinitenessFn_3.eql(nl_def_fn) && (NIL != el_binary_formula_p(nl_number_fn_expr))) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject number = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ($$NLNumberFn.eql(nl_number_fn)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_proper_name_expressionP(final SubLObject expression) {
        return makeBoolean((((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression))) && $$NLQuantFn_3.eql(cycl_utilities.formula_operator(expression))) && $$ProperName_NLAttr.eql(cycl_utilities.formula_arg1(expression, UNPROVIDED)));
    }

    public static SubLObject nl_tag_fn_fort_3P(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != member(v_object, all_spec_funcs_in_any_mt_cached($$NLTagFn), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject quant_unif_3_admitted_colP(final SubLObject col, final SubLObject argnum, final SubLObject relation, final SubLObject mt) {
        SubLObject cdolist_list_var = kb_accessors.argn_isa(relation, argnum, mt);
        SubLObject arg_isa_col = NIL;
        arg_isa_col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((!$$Thing.eql(arg_isa_col)) && (NIL != isa.isaP(arg_isa_col, $$SetOrCollectionType, mt, UNPROVIDED))) && (NIL != isa.isaP(col, arg_isa_col, mt, UNPROVIDED))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_isa_col = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject quant_unif_3_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $quant_unif_3_microseconds$.getGlobalValue();
    }

    public static SubLObject quant_unif_3_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject formula = (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) ? clause_utilities.gaf_cnf_literal(expression.first()) : expression;
        SubLObject new_formula = NIL;
        SubLObject justification = T;
        if (NIL != quant_unif_3_unary_fn_expressionP(formula, mt)) {
            new_formula = quant_unif_3_unary_fn_reformulate(formula, mt, settings);
            justification = list($$UnaryFunction);
        }
        if (NIL != quant_unif_3_some_fn_expressionP(formula)) {
            new_formula = quant_unif_3_some_fn_reformulate(formula, mt, settings);
            justification = list($$SomeFn);
        }
        if ((NIL == new_formula) && (NIL != quant_unif_3_subcol_fn_expressionP(formula))) {
            new_formula = quant_unif_3_subcol_fn_reformulate(formula, mt, settings);
            justification = list($$SubcollectionFunction);
        }
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; (NIL == new_formula) && (NIL != rest); rest = rest.rest()) {
            arg = rest.first();
            argnum = add(argnum, ONE_INTEGER);
            new_formula = (NIL != quant_unif_3_nl_quant_fn_expressionP(arg)) ? quant_unif_3_nl_quant_fn_reformulate(formula, argnum, mt, settings) : NIL;
            if (NIL != new_formula) {
                justification = list($$NLQuantFn_3);
            }
        }
        if ((NIL == new_formula) && (NIL != quant_unif_3_proper_name_expressionP(formula))) {
            new_formula = cycl_utilities.formula_arg2(formula, UNPROVIDED);
            justification = list($$ProperName_NLAttr);
        }
        if ((NIL == new_formula) && (NIL != quant_unif_3_quant_def_expressionP(formula))) {
            new_formula = quant_unif_3_quant_def_reformulate(formula, mt, settings);
            justification = list($$NLQuantFn_3, $$NLDefinitenessFn_3);
        }
        if ((NIL == new_formula) && (NIL != quant_unif_3_def_gen_quant_expressionP(formula, mt))) {
            new_formula = quant_unif_3_def_gen_quant_reformulate(formula, mt, settings);
            justification = list($$NLDefinitenessFn_3);
        }
        if ((NIL == new_formula) && (NIL != quant_unif_3_def_quant_bare_expressionP(formula))) {
            new_formula = quant_unif_3_def_quant_bare_reformulate(formula, mt, settings);
            justification = list($$BareForm_NLAttr);
        }
        if ((NIL == new_formula) && (NIL != quant_unif_3_numerical_quant_expressionP(formula))) {
            new_formula = quant_unif_3_numerical_quant_reformulate(formula, mt, settings);
            justification = list($$NumericalQuant_NLAttrFn);
        }
        if (NIL != new_formula) {
            return values(NIL != clauses.clauses_p(expression) ? list(clause_utilities.make_gaf_cnf(new_formula)) : new_formula, justification);
        }
        return values(expression, NIL);
    }

    public static SubLObject quant_unif_3_unary_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unary_fn = unmake_unary_formula(expression);
        final SubLObject nl_quant_fn_expr = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_binary_formula(nl_quant_fn_expr);
        final SubLObject nl_quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
        final SubLObject nl_number_attr = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return make_unary_formula(unary_fn, col);
    }

    public static SubLObject quant_unif_3_some_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject subcol_fn = unmake_ternary_formula(expression);
        final SubLObject col1 = thread.secondMultipleValue();
        final SubLObject pred = thread.thirdMultipleValue();
        final SubLObject some_fn = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject col2 = cycl_utilities.formula_arg1(some_fn, UNPROVIDED);
        if (NIL == subcollection_function_nautP(col2, mt)) {
            final SubLObject new_subcol_fn = corresponding_type_subcol_fn_3(subcol_fn);
            if (NIL != new_subcol_fn) {
                return make_ternary_formula(new_subcol_fn, col1, pred, col2);
            }
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_subcol_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject subcol_fn = unmake_ternary_formula(expression);
        final SubLObject col1 = thread.secondMultipleValue();
        final SubLObject pred = thread.thirdMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != formula_arityE(nl_quant_fn_expr, THREE_INTEGER, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(nl_quant_fn_expr);
            final SubLObject nl_quant_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != formula_arityE(nl_number_fn_expr, TWO_INTEGER, UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                final SubLObject nl_number_attr = thread.secondMultipleValue();
                final SubLObject col2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (((NIL != member(nl_quant_fn, $list19, UNPROVIDED, UNPROVIDED)) && (NIL != member(nl_quant_attr, $list20, UNPROVIDED, UNPROVIDED))) && ((!nl_quant_attr.eql($$Definiteness_NLAttr)) || nl_number_attr.eql($$Plural_NLAttr))) {
                    return make_ternary_formula(corresponding_type_subcol_fn_3(subcol_fn), col1, pred, col2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject quant_unif_3_quant_def_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_binary_formula(expression);
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = unmake_binary_formula(nl_def_fn_expr);
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return list($$NLQuantFn_3, quant_attr, nl_number_fn_expr);
    }

    public static SubLObject quant_unif_3_def_gen_quant_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = unmake_binary_formula(expression);
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_ternary_formula(nl_quant_fn_expr);
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        final SubLObject quant_arg_pos_num = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return list($$NLQuantFn_3, quant_attr, nl_number_fn_expr, quant_arg_pos_num);
    }

    public static SubLObject quant_unif_3_def_quant_bare_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = unmake_ternary_formula(expression);
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
        final SubLObject def_arg_pos_num = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_binary_formula(nl_quant_fn_expr);
        final SubLObject bare_form = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return list($$NLDefinitenessFn_3, def_attr, nl_number_fn_expr, def_arg_pos_num);
    }

    public static SubLObject quant_unif_3_numerical_quant_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_binary_formula(expression);
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = unmake_binary_formula(nl_def_fn_expr);
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return list($$NLQuantFn_3, quant_attr, nl_number_fn_expr);
    }

    public static SubLObject quant_unif_3_nl_quant_fn_reformulate(final SubLObject the_expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression = copy_tree(the_expression);
        final SubLObject arg = cycl_utilities.formula_arg(expression, argnum, UNPROVIDED);
        final SubLObject operator = cycl_utilities.formula_operator(expression);
        if ((NIL != el_binary_formula_p(arg)) || (NIL != el_ternary_formula_p(arg))) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(arg);
            final SubLObject nl_quant_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != el_binary_formula_p(nl_number_fn_expr)) {
                thread.resetMultipleValues();
                final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                final SubLObject nl_number_attr = thread.secondMultipleValue();
                final SubLObject col = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (($$GenValueFn.eql(operator) || (NIL != fort_types_interface.isa_predicateP(operator, mt))) || ((argnum.numE(TWO_INTEGER) && (NIL != fort_types_interface.isa_functionP(operator, mt))) && (NIL != quant_unif_3_admitted_colP(col, argnum, operator, mt)))) {
                    if (NIL != subcollection_function_nautP(col, mt)) {
                        if ($$QuantityVariableFn.eql(operator)) {
                            return replace_formula_arg(argnum, col, expression);
                        }
                    } else {
                        if ($$GenValueFn.eql(operator)) {
                            return replace_formula_arg(argnum, col, expression);
                        }
                        if ((operator.eql($$genls) && argnum.numE(ONE_INTEGER)) && (NIL == isa.isaP(nl_quant_attr, $$NLGenQuantAttribute, mt, UNPROVIDED))) {
                            if (((NIL != quant_unif_3_admitted_colP(col, ONE_INTEGER, $$genls, mt)) && (NIL == isa.isaP(col, $$CollectionType, mt, UNPROVIDED))) && (NIL == isa.isaP(col, $$CollectionTypeType, mt, UNPROVIDED))) {
                                return replace_formula_arg(argnum, col, expression);
                            }
                        } else
                            if (NIL == isa.isaP(nl_quant_attr, $$NLGenQuantAttribute, mt, UNPROVIDED)) {
                                SubLObject cdolist_list_var = kb_accessors.argn_isa(operator, argnum, mt);
                                SubLObject arg_isa_col = NIL;
                                arg_isa_col = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (((!$$Thing.eql(arg_isa_col)) && ((NIL != isa.isaP(arg_isa_col, $$SetOrCollectionType, mt, UNPROVIDED)) || (NIL != isa.isaP(arg_isa_col, $$FixedOrderCollection, mt, UNPROVIDED)))) && (NIL != isa.isaP(col, arg_isa_col, mt, UNPROVIDED))) {
                                        return replace_formula_arg(argnum, col, expression);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg_isa_col = cdolist_list_var.first();
                                } 
                            }

                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject corresponding_type_subcol_fn_3(final SubLObject instance_subcol_fn) {
        if (instance_subcol_fn.eql($$SubcollectionOfWithRelationToFn)) {
            return $const30$SubcollectionOfWithRelationToType;
        }
        if (instance_subcol_fn.eql($$SubcollectionOfWithRelationFromFn)) {
            return $const32$SubcollectionOfWithRelationFromTy;
        }
        return NIL;
    }

    public static SubLObject subcollection_function_nautP(final SubLObject naut, final SubLObject mt) {
        return makeBoolean((NIL != possibly_naut_p(naut)) && (NIL != member(cycl_utilities.nat_functor(naut), all_fort_instances_cached($$SubcollectionFunction, mt), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject clear_all_fort_instances_cached() {
        final SubLObject cs = $all_fort_instances_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_all_fort_instances_cached(final SubLObject fort, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($all_fort_instances_cached_caching_state$.getGlobalValue(), list(fort, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_fort_instances_cached_internal(final SubLObject fort, final SubLObject mt) {
        return isa.all_fort_instances(fort, mt, UNPROVIDED);
    }

    public static SubLObject all_fort_instances_cached(final SubLObject fort, final SubLObject mt) {
        SubLObject caching_state = $all_fort_instances_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_FORT_INSTANCES_CACHED, $all_fort_instances_cached_caching_state$, $int$128, EQL, TWO_INTEGER, FOUR_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(all_fort_instances_cached_internal(fort, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_all_spec_funcs_in_any_mt_cached() {
        final SubLObject cs = $all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_all_spec_funcs_in_any_mt_cached(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_spec_funcs_in_any_mt_cached_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = gt_methods.gt_all_inferiors($$genlFuncs, fort, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_spec_funcs_in_any_mt_cached(final SubLObject fort) {
        SubLObject caching_state = $all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_SPEC_FUNCS_IN_ANY_MT_CACHED, $all_spec_funcs_in_any_mt_cached_caching_state$, $int$128, EQL, ONE_INTEGER, FOUR_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(all_spec_funcs_in_any_mt_cached_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_reformulator_module_quantifier_unifier_3_file() {
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_required", "QUANT-UNIF-3-REQUIRED", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_some_fn_expressionP", "QUANT-UNIF-3-SOME-FN-EXPRESSION?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_nl_quant_fn_expressionP", "QUANT-UNIF-3-NL-QUANT-FN-EXPRESSION?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_subcol_fn_expressionP", "QUANT-UNIF-3-SUBCOL-FN-EXPRESSION?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_unary_fn_expressionP", "QUANT-UNIF-3-UNARY-FN-EXPRESSION?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_quant_def_expressionP", "QUANT-UNIF-3-QUANT-DEF-EXPRESSION?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_gen_quant_expressionP", "QUANT-UNIF-3-DEF-GEN-QUANT-EXPRESSION?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_quant_bare_expressionP", "QUANT-UNIF-3-DEF-QUANT-BARE-EXPRESSION?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_numerical_quant_expressionP", "QUANT-UNIF-3-NUMERICAL-QUANT-EXPRESSION?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_proper_name_expressionP", "QUANT-UNIF-3-PROPER-NAME-EXPRESSION?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "nl_tag_fn_fort_3P", "NL-TAG-FN-FORT-3?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_admitted_colP", "QUANT-UNIF-3-ADMITTED-COL?", 4, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_cost", "QUANT-UNIF-3-COST", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_reformulate", "QUANT-UNIF-3-REFORMULATE", 4, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_unary_fn_reformulate", "QUANT-UNIF-3-UNARY-FN-REFORMULATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_some_fn_reformulate", "QUANT-UNIF-3-SOME-FN-REFORMULATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_subcol_fn_reformulate", "QUANT-UNIF-3-SUBCOL-FN-REFORMULATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_quant_def_reformulate", "QUANT-UNIF-3-QUANT-DEF-REFORMULATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_gen_quant_reformulate", "QUANT-UNIF-3-DEF-GEN-QUANT-REFORMULATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_quant_bare_reformulate", "QUANT-UNIF-3-DEF-QUANT-BARE-REFORMULATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_numerical_quant_reformulate", "QUANT-UNIF-3-NUMERICAL-QUANT-REFORMULATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_nl_quant_fn_reformulate", "QUANT-UNIF-3-NL-QUANT-FN-REFORMULATE", 4, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "corresponding_type_subcol_fn_3", "CORRESPONDING-TYPE-SUBCOL-FN-3", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "subcollection_function_nautP", "SUBCOLLECTION-FUNCTION-NAUT?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "clear_all_fort_instances_cached", "CLEAR-ALL-FORT-INSTANCES-CACHED", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "remove_all_fort_instances_cached", "REMOVE-ALL-FORT-INSTANCES-CACHED", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_fort_instances_cached_internal", "ALL-FORT-INSTANCES-CACHED-INTERNAL", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_fort_instances_cached", "ALL-FORT-INSTANCES-CACHED", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "clear_all_spec_funcs_in_any_mt_cached", "CLEAR-ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "remove_all_spec_funcs_in_any_mt_cached", "REMOVE-ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_spec_funcs_in_any_mt_cached_internal", "ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-INTERNAL", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_spec_funcs_in_any_mt_cached", "ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_quantifier_unifier_3_file() {
        deflexical("*QUANT-UNIF-3-MICROSECONDS*", $int$2000);
        deflexical("*ALL-FORT-INSTANCES-CACHED-CACHING-STATE*", NIL);
        deflexical("*ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_quantifier_unifier_3_file() {
        reformulator_module_harness.declare_rl_module($$QuantifierUnifier_3_RLModule, $list1);
        memoization_state.note_globally_cached_function(ALL_FORT_INSTANCES_CACHED);
        memoization_state.note_globally_cached_function(ALL_SPEC_FUNCS_IN_ANY_MT_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_quantifier_unifier_3_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_quantifier_unifier_3_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_quantifier_unifier_3_file();
    }

    
}

/**
 * Total time: 116 ms
 */
