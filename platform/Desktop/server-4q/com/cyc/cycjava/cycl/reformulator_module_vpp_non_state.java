package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_vpp_non_state extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_vpp_non_state";
    public static final String myFingerPrint = "74b89b1ad56dbb5bcdc7c90ffe377beab7cca53c6b75bc0f47fc73770b2f99f1";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 3059L)
    private static SubLSymbol $vppns_microseconds$;
    private static final SubLObject $const0$VPPProcessingNonStateRLModule;
    private static final SubLList $list1;
    private static final SubLObject $const2$TheVPParse;
    private static final SubLObject $const3$SomeFn;
    private static final SubLObject $const4$SubjectRolePredicate;
    private static final SubLSymbol $kw5$IGNORE;
    private static final SubLObject $const6$SubcollectionOfWithRelationFromFn;
    private static final SubLInteger $int7$6000;
    private static final SubLObject $const8$isa;
    private static final SubLObject $const9$genls;
    private static final SubLObject $const10$Thing;
    private static final SubLObject $const11$thereExists;
    private static final SubLObject $const12$and;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 1430L)
    public static SubLObject binary_the_vp_parse_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_vpp_non_state.NIL != el_utilities.el_binary_formula_p(v_object) && reformulator_module_vpp_non_state.$const2$TheVPParse.eql(cycl_utilities.formula_operator(v_object)) && reformulator_module_vpp_non_state.NIL == el_utilities.formula_with_sequence_varP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 1647L)
    public static SubLObject binary_the_vp_parse_some_fn_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_vpp_non_state.NIL != el_utilities.el_binary_formula_p(v_object) && reformulator_module_vpp_non_state.$const2$TheVPParse.eql(cycl_utilities.formula_operator(v_object)) && reformulator_module_vpp_non_state.NIL == el_utilities.formula_with_sequence_varP(v_object) && reformulator_module_vpp_non_state.$const3$SomeFn.eql(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(v_object, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 1920L)
    public static SubLObject subject_role_predicateP(final SubLObject v_object, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_vpp_non_state.NIL != forts.fort_p(v_object) && reformulator_module_vpp_non_state.NIL != isa.isaP(v_object, reformulator_module_vpp_non_state.$const4$SubjectRolePredicate, mt, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 2053L)
    public static SubLObject unary_some_fn_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_vpp_non_state.NIL != el_utilities.el_unary_formula_p(v_object) && reformulator_module_vpp_non_state.$const3$SomeFn.eql(cycl_utilities.formula_operator(v_object)) && reformulator_module_vpp_non_state.NIL == el_utilities.formula_with_sequence_varP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 2245L)
    public static SubLObject vppns_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_vpp_non_state.NIL != clauses.clauses_p(expression)) {
            if (reformulator_module_vpp_non_state.NIL != list_utilities.singletonP(expression) && reformulator_module_vpp_non_state.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) {
                final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_vpp_non_state.$kw5$IGNORE);
                SubLObject arg = (SubLObject)reformulator_module_vpp_non_state.NIL;
                arg = cdolist_list_var.first();
                while (reformulator_module_vpp_non_state.NIL != cdolist_list_var) {
                    if (reformulator_module_vpp_non_state.NIL != binary_the_vp_parse_expressionP(arg) || (reformulator_module_vpp_non_state.NIL != unary_some_fn_expressionP(arg) && reformulator_module_vpp_non_state.NIL == subject_role_predicateP(pred, mt)) || reformulator_module_vpp_non_state.NIL != reformulator_module_quantifier_unifier_3.subcollection_function_nautP(arg, mt)) {
                        return (SubLObject)reformulator_module_vpp_non_state.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
        }
        else if (reformulator_module_vpp_non_state.NIL != el_utilities.el_formula_p(expression)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_vpp_non_state.$const6$SubcollectionOfWithRelationFromFn.eql(cycl_utilities.formula_operator(expression)) && reformulator_module_vpp_non_state.NIL != el_utilities.formula_arityE(expression, (SubLObject)reformulator_module_vpp_non_state.THREE_INTEGER, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED) && reformulator_module_vpp_non_state.NIL != binary_the_vp_parse_expressionP(cycl_utilities.formula_arg3(expression, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED)));
        }
        return (SubLObject)reformulator_module_vpp_non_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 3118L)
    public static SubLObject vppns_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_vpp_non_state.$vppns_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 3235L)
    public static SubLObject vppns_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject result = (SubLObject)reformulator_module_vpp_non_state.NIL;
        if (reformulator_module_vpp_non_state.NIL != clauses.clauses_p(expression)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject argnum = (SubLObject)reformulator_module_vpp_non_state.ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_vpp_non_state.$kw5$IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = (SubLObject)reformulator_module_vpp_non_state.NIL, rest = args; reformulator_module_vpp_non_state.NIL == result && reformulator_module_vpp_non_state.NIL != rest; rest = rest.rest()) {
                arg = rest.first();
                argnum = Numbers.add(argnum, (SubLObject)reformulator_module_vpp_non_state.ONE_INTEGER);
                if (reformulator_module_vpp_non_state.NIL != binary_the_vp_parse_some_fn_expressionP(arg)) {
                    result = vppns_reformulate_vp_parse_some_fn_asent(asent, argnum, mt, settings, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
                }
                if (reformulator_module_vpp_non_state.NIL == result && reformulator_module_vpp_non_state.NIL != binary_the_vp_parse_expressionP(arg)) {
                    result = vppns_reformulate_role_pred_asent(asent, argnum, mt, settings, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
                }
                if (reformulator_module_vpp_non_state.NIL == result && reformulator_module_vpp_non_state.NIL != unary_some_fn_expressionP(arg)) {
                    result = vppns_reformulate_some_fn_asent(asent, argnum, mt, settings, original_clause);
                }
                if (reformulator_module_vpp_non_state.NIL == result && reformulator_module_vpp_non_state.NIL != reformulator_module_quantifier_unifier_3.subcollection_function_nautP(arg, mt)) {
                    result = vppns_reformulate_subcol_naut(asent, argnum, mt, settings, original_clause);
                }
            }
            if (reformulator_module_vpp_non_state.NIL != result) {
                result = (SubLObject)ConsesLow.list(clause_utilities.make_gaf_cnf(result));
            }
        }
        else {
            result = vppns_reformulate_naut(expression, mt, settings);
        }
        if (reformulator_module_vpp_non_state.NIL != result) {
            return Values.values(result, (SubLObject)reformulator_module_vpp_non_state.T);
        }
        return Values.values(expression, (SubLObject)reformulator_module_vpp_non_state.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 4463L)
    public static SubLObject vppns_reformulate_role_pred_asent(final SubLObject asent, final SubLObject role_list_argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_vpp_non_state.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_vpp_non_state.NIL;
        }
        if (reformulator_module_vpp_non_state.NIL != fort_types_interface.isa_predicateP(cycl_utilities.atomic_sentence_predicate(asent), mt)) {
            SubLObject role_pred_argnum = (SubLObject)reformulator_module_vpp_non_state.NIL;
            final SubLObject role_list_arg = cycl_utilities.sentence_arg(asent, role_list_argnum, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
            final SubLObject thing = cycl_utilities.nat_arg1(role_list_arg, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
            final SubLObject role = cycl_utilities.nat_arg2(role_list_arg, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
            final SubLObject terms = cycl_utilities.formula_terms(asent, (SubLObject)reformulator_module_vpp_non_state.$kw5$IGNORE);
            SubLObject list_var = (SubLObject)reformulator_module_vpp_non_state.NIL;
            SubLObject arg = (SubLObject)reformulator_module_vpp_non_state.NIL;
            SubLObject argnum = (SubLObject)reformulator_module_vpp_non_state.NIL;
            list_var = terms;
            arg = list_var.first();
            for (argnum = (SubLObject)reformulator_module_vpp_non_state.ZERO_INTEGER; reformulator_module_vpp_non_state.NIL == role_pred_argnum && reformulator_module_vpp_non_state.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                if (reformulator_module_vpp_non_state.NIL != subject_role_predicateP(arg, mt)) {
                    role_pred_argnum = argnum;
                }
            }
            if (reformulator_module_vpp_non_state.NIL != role_pred_argnum) {
                SubLObject new_asent = el_utilities.replace_formula_arg(role_list_argnum, thing, asent);
                new_asent = el_utilities.replace_formula_arg(role_pred_argnum, role, new_asent);
                return new_asent;
            }
        }
        return (SubLObject)reformulator_module_vpp_non_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 5257L)
    public static SubLObject vppns_reformulate_vp_parse_some_fn_asent(final SubLObject asent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_vpp_non_state.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_vpp_non_state.NIL;
        }
        if (reformulator_module_vpp_non_state.NIL != fort_types_interface.isa_predicateP(cycl_utilities.atomic_sentence_predicate(asent), mt)) {
            final SubLObject terms = cycl_utilities.formula_terms(asent, (SubLObject)reformulator_module_vpp_non_state.$kw5$IGNORE);
            SubLObject list_var = (SubLObject)reformulator_module_vpp_non_state.NIL;
            SubLObject arg = (SubLObject)reformulator_module_vpp_non_state.NIL;
            SubLObject argnum_$1 = (SubLObject)reformulator_module_vpp_non_state.NIL;
            list_var = terms;
            arg = list_var.first();
            for (argnum_$1 = (SubLObject)reformulator_module_vpp_non_state.ZERO_INTEGER; reformulator_module_vpp_non_state.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum_$1 = number_utilities.f_1X(argnum_$1)) {
                if (reformulator_module_vpp_non_state.NIL != subject_role_predicateP(arg, mt)) {
                    return (SubLObject)reformulator_module_vpp_non_state.NIL;
                }
            }
            final SubLObject vp_parse_arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
            final SubLObject some_fn_nat = cycl_utilities.formula_arg1(vp_parse_arg, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
            return el_utilities.replace_formula_arg(argnum, some_fn_nat, asent);
        }
        return (SubLObject)reformulator_module_vpp_non_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 5754L)
    public static SubLObject vppns_reformulate_some_fn_asent(final SubLObject asent, final SubLObject some_fn_argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_vpp_non_state.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_vpp_non_state.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject some_fn_expr = cycl_utilities.sentence_arg(asent, some_fn_argnum, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        final SubLObject v_term = cycl_utilities.nat_arg1(some_fn_expr, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        SubLObject choice = (SubLObject)reformulator_module_vpp_non_state.NIL;
        if (reformulator_module_vpp_non_state.NIL != at_admitted.admitted_argumentP(some_fn_expr, some_fn_argnum, pred, mt)) {
            choice = reformulator_module_vpp_non_state.$const8$isa;
        }
        else {
            if (reformulator_module_vpp_non_state.NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP(v_term, mt)) {
                return el_utilities.replace_formula_arg(some_fn_argnum, v_term, asent);
            }
            choice = reformulator_module_vpp_non_state.$const9$genls;
        }
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        return el_utilities.make_existential(new_var, el_utilities.make_conjunction((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(choice, new_var, v_term), el_utilities.replace_formula_arg(some_fn_argnum, new_var, asent))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 6551L)
    public static SubLObject vppns_reformulate_naut(final SubLObject naut, final SubLObject mt, final SubLObject settings) {
        final SubLObject col = cycl_utilities.nat_arg1(naut, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        final SubLObject role_pred = cycl_utilities.nat_arg2(naut, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        final SubLObject role_list = cycl_utilities.nat_arg3(naut, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        final SubLObject thing = cycl_utilities.nat_arg1(role_list, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        final SubLObject role = cycl_utilities.nat_arg2(role_list, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        if (reformulator_module_vpp_non_state.NIL != subject_role_predicateP(role_pred, mt)) {
            return el_utilities.make_ternary_formula(reformulator_module_vpp_non_state.$const6$SubcollectionOfWithRelationFromFn, col, role, thing);
        }
        return (SubLObject)reformulator_module_vpp_non_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 6934L)
    public static SubLObject vppns_reformulate_subcol_naut(final SubLObject asent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_vpp_non_state.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_vpp_non_state.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (reformulator_module_vpp_non_state.$const8$isa.eql(pred) || reformulator_module_vpp_non_state.$const9$genls.eql(pred) || reformulator_module_vpp_non_state.NIL != subl_promotions.memberP(reformulator_module_vpp_non_state.$const10$Thing, kb_accessors.argn_isa(pred, argnum, mt), (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED)) {
            return (SubLObject)reformulator_module_vpp_non_state.NIL;
        }
        if (reformulator_module_vpp_non_state.NIL != subl_promotions.memberP(reformulator_module_vpp_non_state.$const9$genls, ke_tools.transitive_via_arg_inverses(pred, argnum, mt), (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED)) {
            return (SubLObject)reformulator_module_vpp_non_state.NIL;
        }
        final SubLObject col = cycl_utilities.sentence_arg(asent, argnum, (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_vpp_non_state.UNPROVIDED);
        final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
        return el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_vpp_non_state.$const11$thereExists, new_var, (SubLObject)ConsesLow.list(reformulator_module_vpp_non_state.$const12$and, (SubLObject)ConsesLow.list(reformulator_module_vpp_non_state.$const9$genls, new_var, col), subsentence)));
    }
    
    public static SubLObject declare_reformulator_module_vpp_non_state_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "binary_the_vp_parse_expressionP", "BINARY-THE-VP-PARSE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "binary_the_vp_parse_some_fn_expressionP", "BINARY-THE-VP-PARSE-SOME-FN-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "subject_role_predicateP", "SUBJECT-ROLE-PREDICATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "unary_some_fn_expressionP", "UNARY-SOME-FN-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "vppns_required", "VPPNS-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "vppns_cost", "VPPNS-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "vppns_reformulate", "VPPNS-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "vppns_reformulate_role_pred_asent", "VPPNS-REFORMULATE-ROLE-PRED-ASENT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "vppns_reformulate_vp_parse_some_fn_asent", "VPPNS-REFORMULATE-VP-PARSE-SOME-FN-ASENT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "vppns_reformulate_some_fn_asent", "VPPNS-REFORMULATE-SOME-FN-ASENT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "vppns_reformulate_naut", "VPPNS-REFORMULATE-NAUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_non_state", "vppns_reformulate_subcol_naut", "VPPNS-REFORMULATE-SUBCOL-NAUT", 4, 1, false);
        return (SubLObject)reformulator_module_vpp_non_state.NIL;
    }
    
    public static SubLObject init_reformulator_module_vpp_non_state_file() {
        reformulator_module_vpp_non_state.$vppns_microseconds$ = SubLFiles.deflexical("*VPPNS-MICROSECONDS*", (SubLObject)reformulator_module_vpp_non_state.$int7$6000);
        return (SubLObject)reformulator_module_vpp_non_state.NIL;
    }
    
    public static SubLObject setup_reformulator_module_vpp_non_state_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_vpp_non_state.$const0$VPPProcessingNonStateRLModule, (SubLObject)reformulator_module_vpp_non_state.$list1);
        return (SubLObject)reformulator_module_vpp_non_state.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_module_vpp_non_state_file();
    }
    
    public void initializeVariables() {
        init_reformulator_module_vpp_non_state_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_module_vpp_non_state_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_vpp_non_state();
        reformulator_module_vpp_non_state.$vppns_microseconds$ = null;
        $const0$VPPProcessingNonStateRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VPPProcessingNonStateRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("VPPNS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("VPPNS-COST"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("VPPNS-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Transforms the output of the RTP and VPP into usable CycL."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(SubcollectionOfWithRelationFromFn Monkey playsActiveSubjectRole \n           (TheList \n               (SomeFn ProcessingALoanApplication) doneBy))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(SubcollectionOfWithRelationFromFn Monkey doneBy \n           (SomeFn ProcessingALoanApplication))") });
        $const2$TheVPParse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheVPParse"));
        $const3$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $const4$SubjectRolePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubjectRolePredicate"));
        $kw5$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const6$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn"));
        $int7$6000 = SubLObjectFactory.makeInteger(6000);
        $const8$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const9$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const10$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const11$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const12$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
    }
}

/*

	Total time: 51 ms
	
*/