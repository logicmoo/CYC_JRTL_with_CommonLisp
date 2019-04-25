package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_quantifier_unifier_3 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3";
    public static final String myFingerPrint = "0a6791840b0ba80376035f996eacfa4e903cb637108995c3cdeead9439faa39c";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9648L)
    private static SubLSymbol $quant_unif_3_microseconds$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
    private static SubLSymbol $all_fort_instances_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
    private static SubLSymbol $all_spec_funcs_in_any_mt_cached_caching_state$;
    private static final SubLObject $const0$QuantifierUnifier_3_RLModule;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$IGNORE;
    private static final SubLList $list3;
    private static final SubLObject $const4$SomeFn;
    private static final SubLObject $const5$NLNumberFn;
    private static final SubLObject $const6$NLDefinitenessFn_3;
    private static final SubLObject $const7$NLQuantFn_3;
    private static final SubLObject $const8$BareForm_NLAttr;
    private static final SubLObject $const9$CardinalityOfFn;
    private static final SubLObject $const10$UnaryFunction;
    private static final SubLObject $const11$NLGenQuantAttribute;
    private static final SubLObject $const12$NumericalQuant_NLAttrFn;
    private static final SubLObject $const13$ProperName_NLAttr;
    private static final SubLObject $const14$NLTagFn;
    private static final SubLObject $const15$Thing;
    private static final SubLObject $const16$SetOrCollectionType;
    private static final SubLInteger $int17$2000;
    private static final SubLObject $const18$SubcollectionFunction;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLObject $const21$Definiteness_NLAttr;
    private static final SubLObject $const22$Plural_NLAttr;
    private static final SubLObject $const23$GenValueFn;
    private static final SubLObject $const24$QuantityVariableFn;
    private static final SubLObject $const25$genls;
    private static final SubLObject $const26$CollectionType;
    private static final SubLObject $const27$CollectionTypeType;
    private static final SubLObject $const28$FixedOrderCollection;
    private static final SubLObject $const29$SubcollectionOfWithRelationToFn;
    private static final SubLObject $const30$SubcollectionOfWithRelationToType;
    private static final SubLObject $const31$SubcollectionOfWithRelationFromFn;
    private static final SubLObject $const32$SubcollectionOfWithRelationFromTy;
    private static final SubLSymbol $sym33$ALL_FORT_INSTANCES_CACHED;
    private static final SubLSymbol $sym34$_ALL_FORT_INSTANCES_CACHED_CACHING_STATE_;
    private static final SubLInteger $int35$128;
    private static final SubLSymbol $sym36$ALL_SPEC_FUNCS_IN_ANY_MT_CACHED;
    private static final SubLSymbol $sym37$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const38$EverythingPSC;
    private static final SubLObject $const39$genlFuncs;
    private static final SubLSymbol $sym40$_ALL_SPEC_FUNCS_IN_ANY_MT_CACHED_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 1789L)
    public static SubLObject quant_unif_3_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLObject formula = (reformulator_module_quantifier_unifier_3.NIL != clauses.clauses_p(expression) && reformulator_module_quantifier_unifier_3.NIL != list_utilities.singletonP(expression) && reformulator_module_quantifier_unifier_3.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) ? clause_utilities.gaf_cnf_literal(expression.first()) : expression;
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_formula_p(formula)) {
            SubLObject matchP = (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
            final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)reformulator_module_quantifier_unifier_3.$kw2$IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = (SubLObject)reformulator_module_quantifier_unifier_3.NIL, rest = args; reformulator_module_quantifier_unifier_3.NIL == matchP && reformulator_module_quantifier_unifier_3.NIL != rest; rest = rest.rest()) {
                arg = rest.first();
                if (reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_nl_quant_fn_expressionP(arg)) {
                    matchP = (SubLObject)reformulator_module_quantifier_unifier_3.T;
                }
            }
            matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != matchP || reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_some_fn_expressionP(formula));
            matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != matchP || reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_unary_fn_expressionP(formula, mt));
            matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != matchP || reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_quant_def_expressionP(formula));
            matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != matchP || reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_def_gen_quant_expressionP(formula, mt));
            matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != matchP || reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_def_quant_bare_expressionP(formula));
            matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != matchP || reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_numerical_quant_expressionP(formula));
            matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != matchP || reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_proper_name_expressionP(formula));
            return matchP;
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 3115L)
    public static SubLObject quant_unif_3_some_fn_expressionP(final SubLObject expression) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != el_utilities.formula_arityE(expression, (SubLObject)reformulator_module_quantifier_unifier_3.THREE_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && reformulator_module_quantifier_unifier_3.NIL != conses_high.member(cycl_utilities.formula_operator(expression), (SubLObject)reformulator_module_quantifier_unifier_3.$list3, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_unary_formula_p(cycl_utilities.formula_arg3(expression, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) && reformulator_module_quantifier_unifier_3.$const4$SomeFn.eql(cycl_utilities.formula_operator(cycl_utilities.formula_arg3(expression, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 3489L)
    public static SubLObject quant_unif_3_nl_quant_fn_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_formula_p(expression) && (reformulator_module_quantifier_unifier_3.NIL != el_utilities.formula_arityE(expression, (SubLObject)reformulator_module_quantifier_unifier_3.TWO_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.formula_arityE(expression, (SubLObject)reformulator_module_quantifier_unifier_3.THREE_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(expression);
            final SubLObject nl_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_formula_p(nl_number_fn) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.formula_arityE(nl_number_fn, (SubLObject)reformulator_module_quantifier_unifier_3.TWO_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && reformulator_module_quantifier_unifier_3.$const5$NLNumberFn.eql(cycl_utilities.formula_operator(nl_number_fn)) && reformulator_module_quantifier_unifier_3.NIL != nl_tag_fn_fort_3P(nl_quant_fn)) {
                return (SubLObject)reformulator_module_quantifier_unifier_3.T;
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 4109L)
    public static SubLObject quant_unif_3_subcol_fn_expressionP(final SubLObject expression) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != conses_high.member(cycl_utilities.formula_operator(expression), (SubLObject)reformulator_module_quantifier_unifier_3.$list3, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.formula_arityE(expression, (SubLObject)reformulator_module_quantifier_unifier_3.THREE_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 4352L)
    public static SubLObject quant_unif_3_unary_fn_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_unary_formula_p(expression)) {
            thread.resetMultipleValues();
            final SubLObject unary_fn = el_utilities.unmake_unary_formula(expression);
            final SubLObject nl_quant_fn_expr = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_quant_fn_expr) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(nl_quant_fn_expr)) {
                thread.resetMultipleValues();
                final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(nl_quant_fn_expr);
                final SubLObject nl_quant_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_number_fn_expr)) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject nl_number_attr = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_module_quantifier_unifier_3.$const5$NLNumberFn.eql(nl_number_fn) && (reformulator_module_quantifier_unifier_3.$const6$NLDefinitenessFn_3.eql(nl_quant_fn) || (reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3.eql(nl_quant_fn) && reformulator_module_quantifier_unifier_3.$const8$BareForm_NLAttr.eql(nl_quant_attr))) && (reformulator_module_quantifier_unifier_3.NIL == subcollection_function_nautP(col, mt) || unary_fn.eql(reformulator_module_quantifier_unifier_3.$const9$CardinalityOfFn)) && reformulator_module_quantifier_unifier_3.NIL != isa.isaP(unary_fn, reformulator_module_quantifier_unifier_3.$const10$UnaryFunction, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_admitted_colP(col, (SubLObject)reformulator_module_quantifier_unifier_3.ONE_INTEGER, unary_fn, mt)) {
                        return (SubLObject)reformulator_module_quantifier_unifier_3.T;
                    }
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 5400L)
    public static SubLObject quant_unif_3_quant_def_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(expression) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(expression)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(expression);
            final SubLObject quant_attr = thread.secondMultipleValue();
            final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3.eql(nl_quant_fn) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_def_fn_expr)) {
                thread.resetMultipleValues();
                final SubLObject nl_def_fn = el_utilities.unmake_binary_formula(nl_def_fn_expr);
                final SubLObject def_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (reformulator_module_quantifier_unifier_3.$const6$NLDefinitenessFn_3.eql(nl_def_fn) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_number_fn_expr)) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject number = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_module_quantifier_unifier_3.$const5$NLNumberFn.eql(nl_number_fn)) {
                        return (SubLObject)reformulator_module_quantifier_unifier_3.T;
                    }
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 6206L)
    public static SubLObject quant_unif_3_def_gen_quant_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(expression) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(expression)) {
            thread.resetMultipleValues();
            final SubLObject nl_def_fn = el_utilities.unmake_binary_formula(expression);
            final SubLObject def_attr = thread.secondMultipleValue();
            final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_unifier_3.$const6$NLDefinitenessFn_3.eql(nl_def_fn) && (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_quant_fn_expr) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(nl_quant_fn_expr))) {
                thread.resetMultipleValues();
                final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(nl_quant_fn_expr);
                final SubLObject quant_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3.eql(nl_quant_fn) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_number_fn_expr)) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject number = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_module_quantifier_unifier_3.$const5$NLNumberFn.eql(nl_number_fn) && reformulator_module_quantifier_unifier_3.NIL != isa.isaP(quant_attr, reformulator_module_quantifier_unifier_3.$const11$NLGenQuantAttribute, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) {
                        return (SubLObject)reformulator_module_quantifier_unifier_3.T;
                    }
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 7109L)
    public static SubLObject quant_unif_3_def_quant_bare_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(expression) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(expression)) {
            thread.resetMultipleValues();
            final SubLObject nl_def_fn = el_utilities.unmake_binary_formula(expression);
            final SubLObject def_attr = thread.secondMultipleValue();
            final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_unifier_3.$const6$NLDefinitenessFn_3.eql(nl_def_fn) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(nl_quant_fn_expr)) {
                thread.resetMultipleValues();
                final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(nl_quant_fn_expr);
                final SubLObject quant_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3.eql(nl_quant_fn) && reformulator_module_quantifier_unifier_3.$const8$BareForm_NLAttr.eql(quant_attr) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_number_fn_expr)) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject number = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_module_quantifier_unifier_3.$const5$NLNumberFn.eql(nl_number_fn)) {
                        return (SubLObject)reformulator_module_quantifier_unifier_3.T;
                    }
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 7950L)
    public static SubLObject quant_unif_3_numerical_quant_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(expression) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(expression)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(expression);
            final SubLObject quant_attr = thread.secondMultipleValue();
            final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3.eql(nl_quant_fn) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_unary_formula_p(quant_attr) && reformulator_module_quantifier_unifier_3.$const12$NumericalQuant_NLAttrFn.eql(cycl_utilities.formula_arg1(quant_attr, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(nl_def_fn_expr)) {
                thread.resetMultipleValues();
                final SubLObject nl_def_fn = el_utilities.unmake_binary_formula(nl_def_fn_expr);
                final SubLObject def_attr = thread.secondMultipleValue();
                final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (reformulator_module_quantifier_unifier_3.$const6$NLDefinitenessFn_3.eql(nl_def_fn) && reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_number_fn_expr)) {
                    thread.resetMultipleValues();
                    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
                    final SubLObject number = thread.secondMultipleValue();
                    final SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_module_quantifier_unifier_3.$const5$NLNumberFn.eql(nl_number_fn)) {
                        return (SubLObject)reformulator_module_quantifier_unifier_3.T;
                    }
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 8837L)
    public static SubLObject quant_unif_3_proper_name_expressionP(final SubLObject expression) {
        return (SubLObject)SubLObjectFactory.makeBoolean((reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(expression) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(expression)) && reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3.eql(cycl_utilities.formula_operator(expression)) && reformulator_module_quantifier_unifier_3.$const13$ProperName_NLAttr.eql(cycl_utilities.formula_arg1(expression, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9111L)
    public static SubLObject nl_tag_fn_fort_3P(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != forts.fort_p(v_object) && reformulator_module_quantifier_unifier_3.NIL != conses_high.member(v_object, all_spec_funcs_in_any_mt_cached(reformulator_module_quantifier_unifier_3.$const14$NLTagFn), (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9315L)
    public static SubLObject quant_unif_3_admitted_colP(final SubLObject col, final SubLObject argnum, final SubLObject relation, final SubLObject mt) {
        SubLObject cdolist_list_var = kb_accessors.argn_isa(relation, argnum, mt);
        SubLObject arg_isa_col = (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
        arg_isa_col = cdolist_list_var.first();
        while (reformulator_module_quantifier_unifier_3.NIL != cdolist_list_var) {
            if (!reformulator_module_quantifier_unifier_3.$const15$Thing.eql(arg_isa_col) && reformulator_module_quantifier_unifier_3.NIL != isa.isaP(arg_isa_col, reformulator_module_quantifier_unifier_3.$const16$SetOrCollectionType, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && reformulator_module_quantifier_unifier_3.NIL != isa.isaP(col, arg_isa_col, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) {
                return (SubLObject)reformulator_module_quantifier_unifier_3.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_isa_col = cdolist_list_var.first();
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9714L)
    public static SubLObject quant_unif_3_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_quantifier_unifier_3.$quant_unif_3_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9845L)
    public static SubLObject quant_unif_3_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject formula = (reformulator_module_quantifier_unifier_3.NIL != clauses.clauses_p(expression) && reformulator_module_quantifier_unifier_3.NIL != list_utilities.singletonP(expression) && reformulator_module_quantifier_unifier_3.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) ? clause_utilities.gaf_cnf_literal(expression.first()) : expression;
        SubLObject new_formula = (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
        SubLObject justification = (SubLObject)reformulator_module_quantifier_unifier_3.T;
        if (reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_unary_fn_expressionP(formula, mt)) {
            new_formula = quant_unif_3_unary_fn_reformulate(formula, mt, settings);
            justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const10$UnaryFunction);
        }
        if (reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_some_fn_expressionP(formula)) {
            new_formula = quant_unif_3_some_fn_reformulate(formula, mt, settings);
            justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const4$SomeFn);
        }
        if (reformulator_module_quantifier_unifier_3.NIL == new_formula && reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_subcol_fn_expressionP(formula)) {
            new_formula = quant_unif_3_subcol_fn_reformulate(formula, mt, settings);
            justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const18$SubcollectionFunction);
        }
        SubLObject argnum = (SubLObject)reformulator_module_quantifier_unifier_3.ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)reformulator_module_quantifier_unifier_3.$kw2$IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = (SubLObject)reformulator_module_quantifier_unifier_3.NIL, rest = args; reformulator_module_quantifier_unifier_3.NIL == new_formula && reformulator_module_quantifier_unifier_3.NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            argnum = Numbers.add(argnum, (SubLObject)reformulator_module_quantifier_unifier_3.ONE_INTEGER);
            new_formula = (SubLObject)((reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_nl_quant_fn_expressionP(arg)) ? quant_unif_3_nl_quant_fn_reformulate(formula, argnum, mt, settings) : reformulator_module_quantifier_unifier_3.NIL);
            if (reformulator_module_quantifier_unifier_3.NIL != new_formula) {
                justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3);
            }
        }
        if (reformulator_module_quantifier_unifier_3.NIL == new_formula && reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_proper_name_expressionP(formula)) {
            new_formula = cycl_utilities.formula_arg2(formula, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
            justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const13$ProperName_NLAttr);
        }
        if (reformulator_module_quantifier_unifier_3.NIL == new_formula && reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_quant_def_expressionP(formula)) {
            new_formula = quant_unif_3_quant_def_reformulate(formula, mt, settings);
            justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3, reformulator_module_quantifier_unifier_3.$const6$NLDefinitenessFn_3);
        }
        if (reformulator_module_quantifier_unifier_3.NIL == new_formula && reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_def_gen_quant_expressionP(formula, mt)) {
            new_formula = quant_unif_3_def_gen_quant_reformulate(formula, mt, settings);
            justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const6$NLDefinitenessFn_3);
        }
        if (reformulator_module_quantifier_unifier_3.NIL == new_formula && reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_def_quant_bare_expressionP(formula)) {
            new_formula = quant_unif_3_def_quant_bare_reformulate(formula, mt, settings);
            justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const8$BareForm_NLAttr);
        }
        if (reformulator_module_quantifier_unifier_3.NIL == new_formula && reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_numerical_quant_expressionP(formula)) {
            new_formula = quant_unif_3_numerical_quant_reformulate(formula, mt, settings);
            justification = (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const12$NumericalQuant_NLAttrFn);
        }
        if (reformulator_module_quantifier_unifier_3.NIL != new_formula) {
            return Values.values((SubLObject)((reformulator_module_quantifier_unifier_3.NIL != clauses.clauses_p(expression)) ? ConsesLow.list(clause_utilities.make_gaf_cnf(new_formula)) : new_formula), justification);
        }
        return Values.values(expression, (SubLObject)reformulator_module_quantifier_unifier_3.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 12418L)
    public static SubLObject quant_unif_3_unary_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unary_fn = el_utilities.unmake_unary_formula(expression);
        final SubLObject nl_quant_fn_expr = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(nl_quant_fn_expr);
        final SubLObject nl_quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
        final SubLObject nl_number_attr = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return el_utilities.make_unary_formula(unary_fn, col);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 12965L)
    public static SubLObject quant_unif_3_some_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject subcol_fn = el_utilities.unmake_ternary_formula(expression);
        final SubLObject col1 = thread.secondMultipleValue();
        final SubLObject pred = thread.thirdMultipleValue();
        final SubLObject some_fn = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject col2 = cycl_utilities.formula_arg1(some_fn, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
        if (reformulator_module_quantifier_unifier_3.NIL == subcollection_function_nautP(col2, mt)) {
            final SubLObject new_subcol_fn = corresponding_type_subcol_fn_3(subcol_fn);
            if (reformulator_module_quantifier_unifier_3.NIL != new_subcol_fn) {
                return el_utilities.make_ternary_formula(new_subcol_fn, col1, pred, col2);
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 13425L)
    public static SubLObject quant_unif_3_subcol_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject subcol_fn = el_utilities.unmake_ternary_formula(expression);
        final SubLObject col1 = thread.secondMultipleValue();
        final SubLObject pred = thread.thirdMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.formula_arityE(nl_quant_fn_expr, (SubLObject)reformulator_module_quantifier_unifier_3.THREE_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(nl_quant_fn_expr);
            final SubLObject nl_quant_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.formula_arityE(nl_number_fn_expr, (SubLObject)reformulator_module_quantifier_unifier_3.TWO_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
                final SubLObject nl_number_attr = thread.secondMultipleValue();
                final SubLObject col2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (reformulator_module_quantifier_unifier_3.NIL != conses_high.member(nl_quant_fn, (SubLObject)reformulator_module_quantifier_unifier_3.$list19, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && reformulator_module_quantifier_unifier_3.NIL != conses_high.member(nl_quant_attr, (SubLObject)reformulator_module_quantifier_unifier_3.$list20, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && (!nl_quant_attr.eql(reformulator_module_quantifier_unifier_3.$const21$Definiteness_NLAttr) || nl_number_attr.eql(reformulator_module_quantifier_unifier_3.$const22$Plural_NLAttr))) {
                    return el_utilities.make_ternary_formula(corresponding_type_subcol_fn_3(subcol_fn), col1, pred, col2);
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 14559L)
    public static SubLObject quant_unif_3_quant_def_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(expression);
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = el_utilities.unmake_binary_formula(nl_def_fn_expr);
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3, quant_attr, nl_number_fn_expr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 15002L)
    public static SubLObject quant_unif_3_def_gen_quant_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = el_utilities.unmake_binary_formula(expression);
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_ternary_formula(nl_quant_fn_expr);
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        final SubLObject quant_arg_pos_num = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3, quant_attr, nl_number_fn_expr, quant_arg_pos_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 15491L)
    public static SubLObject quant_unif_3_def_quant_bare_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = el_utilities.unmake_ternary_formula(expression);
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
        final SubLObject def_arg_pos_num = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(nl_quant_fn_expr);
        final SubLObject bare_form = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const6$NLDefinitenessFn_3, def_attr, nl_number_fn_expr, def_arg_pos_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 15982L)
    public static SubLObject quant_unif_3_numerical_quant_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(expression);
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = el_utilities.unmake_binary_formula(nl_def_fn_expr);
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(reformulator_module_quantifier_unifier_3.$const7$NLQuantFn_3, quant_attr, nl_number_fn_expr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 16431L)
    public static SubLObject quant_unif_3_nl_quant_fn_reformulate(final SubLObject the_expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression = conses_high.copy_tree(the_expression);
        final SubLObject arg = cycl_utilities.formula_arg(expression, argnum, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
        final SubLObject operator = cycl_utilities.formula_operator(expression);
        if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(arg) || reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_ternary_formula_p(arg)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg);
            final SubLObject nl_quant_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_unifier_3.NIL != el_utilities.el_binary_formula_p(nl_number_fn_expr)) {
                thread.resetMultipleValues();
                final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
                final SubLObject nl_number_attr = thread.secondMultipleValue();
                final SubLObject col = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (reformulator_module_quantifier_unifier_3.$const23$GenValueFn.eql(operator) || reformulator_module_quantifier_unifier_3.NIL != fort_types_interface.isa_predicateP(operator, mt) || (argnum.numE((SubLObject)reformulator_module_quantifier_unifier_3.TWO_INTEGER) && reformulator_module_quantifier_unifier_3.NIL != fort_types_interface.isa_functionP(operator, mt) && reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_admitted_colP(col, argnum, operator, mt))) {
                    if (reformulator_module_quantifier_unifier_3.NIL != subcollection_function_nautP(col, mt)) {
                        if (reformulator_module_quantifier_unifier_3.$const24$QuantityVariableFn.eql(operator)) {
                            return el_utilities.replace_formula_arg(argnum, col, expression);
                        }
                    }
                    else {
                        if (reformulator_module_quantifier_unifier_3.$const23$GenValueFn.eql(operator)) {
                            return el_utilities.replace_formula_arg(argnum, col, expression);
                        }
                        if (operator.eql(reformulator_module_quantifier_unifier_3.$const25$genls) && argnum.numE((SubLObject)reformulator_module_quantifier_unifier_3.ONE_INTEGER) && reformulator_module_quantifier_unifier_3.NIL == isa.isaP(nl_quant_attr, reformulator_module_quantifier_unifier_3.$const11$NLGenQuantAttribute, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) {
                            if (reformulator_module_quantifier_unifier_3.NIL != quant_unif_3_admitted_colP(col, (SubLObject)reformulator_module_quantifier_unifier_3.ONE_INTEGER, reformulator_module_quantifier_unifier_3.$const25$genls, mt) && reformulator_module_quantifier_unifier_3.NIL == isa.isaP(col, reformulator_module_quantifier_unifier_3.$const26$CollectionType, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) && reformulator_module_quantifier_unifier_3.NIL == isa.isaP(col, reformulator_module_quantifier_unifier_3.$const27$CollectionTypeType, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) {
                                return el_utilities.replace_formula_arg(argnum, col, expression);
                            }
                        }
                        else if (reformulator_module_quantifier_unifier_3.NIL == isa.isaP(nl_quant_attr, reformulator_module_quantifier_unifier_3.$const11$NLGenQuantAttribute, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) {
                            SubLObject cdolist_list_var = kb_accessors.argn_isa(operator, argnum, mt);
                            SubLObject arg_isa_col = (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
                            arg_isa_col = cdolist_list_var.first();
                            while (reformulator_module_quantifier_unifier_3.NIL != cdolist_list_var) {
                                if (!reformulator_module_quantifier_unifier_3.$const15$Thing.eql(arg_isa_col) && (reformulator_module_quantifier_unifier_3.NIL != isa.isaP(arg_isa_col, reformulator_module_quantifier_unifier_3.$const16$SetOrCollectionType, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED) || reformulator_module_quantifier_unifier_3.NIL != isa.isaP(arg_isa_col, reformulator_module_quantifier_unifier_3.$const28$FixedOrderCollection, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) && reformulator_module_quantifier_unifier_3.NIL != isa.isaP(col, arg_isa_col, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED)) {
                                    return el_utilities.replace_formula_arg(argnum, col, expression);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                arg_isa_col = cdolist_list_var.first();
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 18647L)
    public static SubLObject corresponding_type_subcol_fn_3(final SubLObject instance_subcol_fn) {
        if (instance_subcol_fn.eql(reformulator_module_quantifier_unifier_3.$const29$SubcollectionOfWithRelationToFn)) {
            return reformulator_module_quantifier_unifier_3.$const30$SubcollectionOfWithRelationToType;
        }
        if (instance_subcol_fn.eql(reformulator_module_quantifier_unifier_3.$const31$SubcollectionOfWithRelationFromFn)) {
            return reformulator_module_quantifier_unifier_3.$const32$SubcollectionOfWithRelationFromTy;
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 18955L)
    public static SubLObject subcollection_function_nautP(final SubLObject naut, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_unifier_3.NIL != el_utilities.possibly_naut_p(naut) && reformulator_module_quantifier_unifier_3.NIL != conses_high.member(cycl_utilities.nat_functor(naut), all_fort_instances_cached(reformulator_module_quantifier_unifier_3.$const18$SubcollectionFunction, mt), (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
    public static SubLObject clear_all_fort_instances_cached() {
        final SubLObject cs = reformulator_module_quantifier_unifier_3.$all_fort_instances_cached_caching_state$.getGlobalValue();
        if (reformulator_module_quantifier_unifier_3.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
    public static SubLObject remove_all_fort_instances_cached(final SubLObject fort, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(reformulator_module_quantifier_unifier_3.$all_fort_instances_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(fort, mt), (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
    public static SubLObject all_fort_instances_cached_internal(final SubLObject fort, final SubLObject mt) {
        return isa.all_fort_instances(fort, mt, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
    public static SubLObject all_fort_instances_cached(final SubLObject fort, final SubLObject mt) {
        SubLObject caching_state = reformulator_module_quantifier_unifier_3.$all_fort_instances_cached_caching_state$.getGlobalValue();
        if (reformulator_module_quantifier_unifier_3.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)reformulator_module_quantifier_unifier_3.$sym33$ALL_FORT_INSTANCES_CACHED, (SubLObject)reformulator_module_quantifier_unifier_3.$sym34$_ALL_FORT_INSTANCES_CACHED_CACHING_STATE_, (SubLObject)reformulator_module_quantifier_unifier_3.$int35$128, (SubLObject)reformulator_module_quantifier_unifier_3.EQL, (SubLObject)reformulator_module_quantifier_unifier_3.TWO_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.FOUR_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
            collision = cdolist_list_var.first();
            while (reformulator_module_quantifier_unifier_3.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (reformulator_module_quantifier_unifier_3.NIL != cached_args && reformulator_module_quantifier_unifier_3.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_fort_instances_cached_internal(fort, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(fort, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
    public static SubLObject clear_all_spec_funcs_in_any_mt_cached() {
        final SubLObject cs = reformulator_module_quantifier_unifier_3.$all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue();
        if (reformulator_module_quantifier_unifier_3.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
    public static SubLObject remove_all_spec_funcs_in_any_mt_cached(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args(reformulator_module_quantifier_unifier_3.$all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(fort), (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
    public static SubLObject all_spec_funcs_in_any_mt_cached_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_module_quantifier_unifier_3.$sym37$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(reformulator_module_quantifier_unifier_3.$const38$EverythingPSC, thread);
            result = gt_methods.gt_all_inferiors(reformulator_module_quantifier_unifier_3.$const39$genlFuncs, fort, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
    public static SubLObject all_spec_funcs_in_any_mt_cached(final SubLObject fort) {
        SubLObject caching_state = reformulator_module_quantifier_unifier_3.$all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue();
        if (reformulator_module_quantifier_unifier_3.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)reformulator_module_quantifier_unifier_3.$sym36$ALL_SPEC_FUNCS_IN_ANY_MT_CACHED, (SubLObject)reformulator_module_quantifier_unifier_3.$sym40$_ALL_SPEC_FUNCS_IN_ANY_MT_CACHED_CACHING_STATE_, (SubLObject)reformulator_module_quantifier_unifier_3.$int35$128, (SubLObject)reformulator_module_quantifier_unifier_3.EQL, (SubLObject)reformulator_module_quantifier_unifier_3.ONE_INTEGER, (SubLObject)reformulator_module_quantifier_unifier_3.FOUR_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_spec_funcs_in_any_mt_cached_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, (SubLObject)reformulator_module_quantifier_unifier_3.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_reformulator_module_quantifier_unifier_3_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_required", "QUANT-UNIF-3-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_some_fn_expressionP", "QUANT-UNIF-3-SOME-FN-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_nl_quant_fn_expressionP", "QUANT-UNIF-3-NL-QUANT-FN-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_subcol_fn_expressionP", "QUANT-UNIF-3-SUBCOL-FN-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_unary_fn_expressionP", "QUANT-UNIF-3-UNARY-FN-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_quant_def_expressionP", "QUANT-UNIF-3-QUANT-DEF-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_gen_quant_expressionP", "QUANT-UNIF-3-DEF-GEN-QUANT-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_quant_bare_expressionP", "QUANT-UNIF-3-DEF-QUANT-BARE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_numerical_quant_expressionP", "QUANT-UNIF-3-NUMERICAL-QUANT-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_proper_name_expressionP", "QUANT-UNIF-3-PROPER-NAME-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "nl_tag_fn_fort_3P", "NL-TAG-FN-FORT-3?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_admitted_colP", "QUANT-UNIF-3-ADMITTED-COL?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_cost", "QUANT-UNIF-3-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_reformulate", "QUANT-UNIF-3-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_unary_fn_reformulate", "QUANT-UNIF-3-UNARY-FN-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_some_fn_reformulate", "QUANT-UNIF-3-SOME-FN-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_subcol_fn_reformulate", "QUANT-UNIF-3-SUBCOL-FN-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_quant_def_reformulate", "QUANT-UNIF-3-QUANT-DEF-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_gen_quant_reformulate", "QUANT-UNIF-3-DEF-GEN-QUANT-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_quant_bare_reformulate", "QUANT-UNIF-3-DEF-QUANT-BARE-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_numerical_quant_reformulate", "QUANT-UNIF-3-NUMERICAL-QUANT-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_nl_quant_fn_reformulate", "QUANT-UNIF-3-NL-QUANT-FN-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "corresponding_type_subcol_fn_3", "CORRESPONDING-TYPE-SUBCOL-FN-3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "subcollection_function_nautP", "SUBCOLLECTION-FUNCTION-NAUT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "clear_all_fort_instances_cached", "CLEAR-ALL-FORT-INSTANCES-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "remove_all_fort_instances_cached", "REMOVE-ALL-FORT-INSTANCES-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_fort_instances_cached_internal", "ALL-FORT-INSTANCES-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_fort_instances_cached", "ALL-FORT-INSTANCES-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "clear_all_spec_funcs_in_any_mt_cached", "CLEAR-ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "remove_all_spec_funcs_in_any_mt_cached", "REMOVE-ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_spec_funcs_in_any_mt_cached_internal", "ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_spec_funcs_in_any_mt_cached", "ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 1, 0, false);
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    public static SubLObject init_reformulator_module_quantifier_unifier_3_file() {
        reformulator_module_quantifier_unifier_3.$quant_unif_3_microseconds$ = SubLFiles.deflexical("*QUANT-UNIF-3-MICROSECONDS*", (SubLObject)reformulator_module_quantifier_unifier_3.$int17$2000);
        reformulator_module_quantifier_unifier_3.$all_fort_instances_cached_caching_state$ = SubLFiles.deflexical("*ALL-FORT-INSTANCES-CACHED-CACHING-STATE*", (SubLObject)reformulator_module_quantifier_unifier_3.NIL);
        reformulator_module_quantifier_unifier_3.$all_spec_funcs_in_any_mt_cached_caching_state$ = SubLFiles.deflexical("*ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-CACHING-STATE*", (SubLObject)reformulator_module_quantifier_unifier_3.NIL);
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
    }
    
    public static SubLObject setup_reformulator_module_quantifier_unifier_3_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_quantifier_unifier_3.$const0$QuantifierUnifier_3_RLModule, (SubLObject)reformulator_module_quantifier_unifier_3.$list1);
        memoization_state.note_globally_cached_function((SubLObject)reformulator_module_quantifier_unifier_3.$sym33$ALL_FORT_INSTANCES_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)reformulator_module_quantifier_unifier_3.$sym36$ALL_SPEC_FUNCS_IN_ANY_MT_CACHED);
        return (SubLObject)reformulator_module_quantifier_unifier_3.NIL;
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
    
    static {
        me = (SubLFile)new reformulator_module_quantifier_unifier_3();
        reformulator_module_quantifier_unifier_3.$quant_unif_3_microseconds$ = null;
        reformulator_module_quantifier_unifier_3.$all_fort_instances_cached_caching_state$ = null;
        reformulator_module_quantifier_unifier_3.$all_spec_funcs_in_any_mt_cached_caching_state$ = null;
        $const0$QuantifierUnifier_3_RLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierUnifier-3-RLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("QUANT-UNIF-3-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("QUANT-UNIF-3-COST"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("QUANT-UNIF-3-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Eliminates redundant NL quantification"), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(genls (NLQuantFn-3 BareForm-NLAttr \n             (NLNumberFn Plural-NLAttr Dog)) Mammal)"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(genls Dog Mammal)") });
        $kw2$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")));
        $const4$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $const5$NLNumberFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn"));
        $const6$NLDefinitenessFn_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3"));
        $const7$NLQuantFn_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3"));
        $const8$BareForm_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr"));
        $const9$CardinalityOfFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardinalityOfFn"));
        $const10$UnaryFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnaryFunction"));
        $const11$NLGenQuantAttribute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLGenQuantAttribute"));
        $const12$NumericalQuant_NLAttrFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericalQuant-NLAttrFn"));
        $const13$ProperName_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperName-NLAttr"));
        $const14$NLTagFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTagFn"));
        $const15$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const16$SetOrCollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SetOrCollectionType"));
        $int17$2000 = SubLObjectFactory.makeInteger(2000);
        $const18$SubcollectionFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionFunction"));
        $list19 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")));
        $list20 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Indefinite-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Some-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr")));
        $const21$Definiteness_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definiteness-NLAttr"));
        $const22$Plural_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr"));
        $const23$GenValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenValueFn"));
        $const24$QuantityVariableFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantityVariableFn"));
        $const25$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const26$CollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $const27$CollectionTypeType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionTypeType"));
        $const28$FixedOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FixedOrderCollection"));
        $const29$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $const30$SubcollectionOfWithRelationToType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn"));
        $const31$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn"));
        $const32$SubcollectionOfWithRelationFromTy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn"));
        $sym33$ALL_FORT_INSTANCES_CACHED = SubLObjectFactory.makeSymbol("ALL-FORT-INSTANCES-CACHED");
        $sym34$_ALL_FORT_INSTANCES_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALL-FORT-INSTANCES-CACHED-CACHING-STATE*");
        $int35$128 = SubLObjectFactory.makeInteger(128);
        $sym36$ALL_SPEC_FUNCS_IN_ANY_MT_CACHED = SubLObjectFactory.makeSymbol("ALL-SPEC-FUNCS-IN-ANY-MT-CACHED");
        $sym37$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const38$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const39$genlFuncs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlFuncs"));
        $sym40$_ALL_SPEC_FUNCS_IN_ANY_MT_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-CACHING-STATE*");
    }
}

/*

	Total time: 116 ms
	
*/