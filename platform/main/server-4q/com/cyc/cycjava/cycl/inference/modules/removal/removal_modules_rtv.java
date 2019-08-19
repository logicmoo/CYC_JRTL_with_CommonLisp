package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.graphl_graph_utilities;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_rtv extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv";
    public static String myFingerPrint = "369573826563e256567bd8887c61019c08ddac2f7e0b2b22b8cafa89fd6a4aba";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 500L)
    private static SubLSymbol $rtv_asent$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 600L)
    private static SubLSymbol $rtv_asent_pred$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 700L)
    private static SubLSymbol $rtv_term_argnums$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 700L)
    private static SubLSymbol $rtv_var_argnums$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 800L)
    private static SubLSymbol $rtv_asent_set_o_preds$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1000L)
    private static SubLSymbol $rtv_depth_cutoff$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3500L)
    private static SubLSymbol $rtv_default_search_plist$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4100L)
    private static SubLSymbol $rtv_isa_constraints$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4100L)
    private static SubLSymbol $rtv_genls_constraints$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4200L)
    private static SubLSymbol $rtv_use_type_constraints_p$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 20000L)
    private static SubLSymbol $default_rtv_cost$;
    private static SubLList $list0;
    private static SubLSymbol $sym1$PROGN;
    private static SubLSymbol $sym2$CHECK_TYPE;
    private static SubLList $list3;
    private static SubLSymbol $sym4$CLET;
    private static SubLSymbol $sym5$_RTV_ASENT_SET_O_PREDS_;
    private static SubLList $list6;
    private static SubLSymbol $sym7$_RTV_DEPTH_CUTOFF_;
    private static SubLString $str8$No_valid_hl_variable_in_asent____;
    private static SubLString $str9$No_initial_node_applicable_for_as;
    private static SubLList $list10;
    private static SubLSymbol $sym11$_RTV_ASENT_;
    private static SubLSymbol $sym12$_RTV_ASENT_PRED_;
    private static SubLSymbol $sym13$ATOMIC_SENTENCE_PREDICATE;
    private static SubLSymbol $sym14$_RTV_TERM_ARGNUMS_;
    private static SubLSymbol $sym15$DETERMINE_RTV_TERM_ARGNUMS;
    private static SubLSymbol $sym16$_RTV_VAR_ARGNUMS_;
    private static SubLSymbol $sym17$DETERMINE_RTV_VAR_ARGNUMS;
    private static SubLSymbol $sym18$DETERMINE_RTV_ASENT_PREDS;
    private static SubLSymbol $sym19$DETERMINE_RTV_DEPTH_CUTOFF;
    private static SubLList $list20;
    private static SubLList $list21;
    private static SubLSymbol $sym22$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE;
    private static SubLSymbol $sym23$GETF;
    private static SubLList $list24;
    private static SubLSymbol $sym25$WITH_GHL_SEARCH_INITIALIZED;
    private static SubLSymbol $sym26$ADD_RTV_DEFAULT_SEARCH_PROPERTIES;
    private static SubLList $list27;
    private static SubLList $list28;
    private static SubLSymbol $sym29$RTV_FORMULA;
    private static SubLSymbol $sym30$VAR;
    private static SubLSymbol $sym31$FIND_IF;
    private static SubLList $list32;
    private static SubLSymbol $sym33$FCOND;
    private static SubLSymbol $sym34$EL_VAR_;
    private static SubLSymbol $sym35$FORMULA_ARG1;
    private static SubLSymbol $sym36$FORMULA_ARG2;
    private static SubLSymbol $sym37$_RTV_ISA_CONSTRAINTS_;
    private static SubLSymbol $sym38$FIND_RTV_ISA_CONSTRAINTS;
    private static SubLSymbol $sym39$_RTV_GENLS_CONSTRAINTS_;
    private static SubLSymbol $sym40$FIND_RTV_GENLS_CONSTRAINTS;
    private static SubLList $list41;
    private static SubLSymbol $sym42$ISA_CLAUSE_P;
    private static SubLSymbol $sym43$GENLS_CLAUSE_P;
    private static SubLObject $$relatedToVia;
    private static SubLObject $$isa;
    private static SubLObject $$genls;
    private static SubLSymbol $sym47$LISTP;
    private static SubLSymbol $ORDER;
    private static SubLSymbol $DEPTH_FIRST;
    private static SubLSymbol $MT;
    private static SubLSymbol $PREDICATES;
    private static SubLSymbol $CUTOFF;
    private static SubLList $list53;
    private static SubLSymbol $GOAL;
    private static SubLSymbol $ITERATIVE_DEEPENING;
    private static SubLSymbol $JUSTIFY_;
    private static SubLSymbol $ADD_TO_RESULT_;
    private static SubLSymbol $EDGES_ON_UNWIND;
    private static SubLSymbol $ALL;
    private static SubLList $list60;
    private static SubLList $list61;
    private static SubLSymbol $sym62$RTV_CLAUSE_P;
    private static SubLSymbol $GOAL_FN;
    private static SubLSymbol $sym64$RTV_NODE_MEETS_CONSTRAINTS_P;
    private static SubLList $list65;
    private static SubLObject $$genlPreds;
    private static SubLSymbol $ASSERTION;
    private static SubLSymbol $sym68$FIRST;
    private static SubLObject $$genlInverse;
    private static SubLSymbol $GENLPREDS;
    private static SubLList $list71;
    private static SubLSymbol $RTV;
    private static SubLSymbol $REMOVAL_RELATED_TO_VIA_CHECK;
    private static SubLList $list74;
    private static SubLSymbol $REMOVAL_RELATED_TO_VIA_GENERATE;
    private static SubLList $list76;
    private static SubLSymbol $POS;
    private static SubLSymbol $RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE;
    private static SubLList $list79;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 800L)
    public static SubLObject with_rtv_asent_set_o_preds(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject preds = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        preds = current.first();
        SubLObject body;
        current = (body = current.rest());
        return list($sym1$PROGN, listS($sym2$CHECK_TYPE, preds, $list3), listS($sym4$CLET, list(list($sym5$_RTV_ASENT_SET_O_PREDS_, preds)), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1000L)
    public static SubLObject get_rtv_pred_set() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $rtv_asent_set_o_preds$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1100L)
    public static SubLObject get_rtv_depth_cutoff() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $rtv_depth_cutoff$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1200L)
    public static SubLObject with_rtv_depth_cutoff(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject depth = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list6);
        depth = current.first();
        SubLObject body;
        current = (body = current.rest());
        return list($sym1$PROGN, listS($sym4$CLET, list(list($sym7$_RTV_DEPTH_CUTOFF_, depth)), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1300L)
    public static SubLObject determine_rtv_term_argnums(SubLObject asent) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(el_utilities.formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                result = cons(num, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1600L)
    public static SubLObject determine_rtv_var_argnums(SubLObject asent) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(el_utilities.formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                result = cons(num, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1900L)
    public static SubLObject get_rtv_var_arg(SubLObject asent) {
        if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
        }
        if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED);
        }
        ghl_search_vars.ghl_error($str8$No_valid_hl_variable_in_asent____, asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 2200L)
    public static SubLObject determine_rtv_asent_preds(SubLObject asent) {
        return cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg(asent, THREE_INTEGER, UNPROVIDED), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 2300L)
    public static SubLObject determine_rtv_depth_cutoff(SubLObject asent) {
        return cycl_utilities.atomic_sentence_arg(asent, FOUR_INTEGER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 2400L)
    public static SubLObject determine_rtv_initial_node(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) && NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_var_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
        }
        if (NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) && NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_var_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED);
        }
        if (NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) && NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
        }
        Errors.error($str9$No_initial_node_applicable_for_as, asent);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3000L)
    public static SubLObject determine_rtv_goal(SubLObject asent) {
        return conses_high.third(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3000L)
    public static SubLObject bind_rtv_asent(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
        asent = current.first();
        SubLObject body;
        current = (body = current.rest());
        return listS($sym4$CLET, list(list($sym11$_RTV_ASENT_, asent), list($sym12$_RTV_ASENT_PRED_, list($sym13$ATOMIC_SENTENCE_PREDICATE, asent)), list($sym14$_RTV_TERM_ARGNUMS_, list($sym15$DETERMINE_RTV_TERM_ARGNUMS, asent)),
                list($sym16$_RTV_VAR_ARGNUMS_, list($sym17$DETERMINE_RTV_VAR_ARGNUMS, asent)), list($sym5$_RTV_ASENT_SET_O_PREDS_, list($sym18$DETERMINE_RTV_ASENT_PREDS, asent)), list($sym7$_RTV_DEPTH_CUTOFF_, list($sym19$DETERMINE_RTV_DEPTH_CUTOFF, asent))), append(body, NIL));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3700L)
    public static SubLObject add_rtv_default_search_properties(SubLObject plist) {
        return append($rtv_default_search_plist$.getGlobalValue(), plist);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3800L)
    public static SubLObject with_rtv_search_initialized(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject v_search = NIL;
        SubLObject plist = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list21);
        v_search = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list21);
        plist = current.first();
        SubLObject body;
        current = (body = current.rest());
        return list($sym22$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, listS($sym23$GETF, plist, $list24), listS($sym25$WITH_GHL_SEARCH_INITIALIZED, v_search, list($sym26$ADD_RTV_DEFAULT_SEARCH_PROPERTIES, plist), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4200L)
    public static SubLObject with_new_rtv_type_constraints(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym4$CLET, $list27, append(body, NIL));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4400L)
    public static SubLObject with_rtv_constraints_from_formula(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject formula = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
        formula = current.first();
        SubLObject body;
        current = (body = current.rest());
        SubLObject rtv_formula = $sym29$RTV_FORMULA;
        SubLObject var = $sym30$VAR;
        return ConsesLow.list($sym4$CLET,
                ConsesLow.list(list(rtv_formula, list($sym31$FIND_IF, $list32, formula)),
                        list(var, list($sym33$FCOND, list(list($sym34$EL_VAR_, list($sym35$FORMULA_ARG1, rtv_formula)), list($sym35$FORMULA_ARG1, rtv_formula)), list(list($sym34$EL_VAR_, list($sym36$FORMULA_ARG2, rtv_formula)), list($sym36$FORMULA_ARG2, rtv_formula)))),
                        list($sym37$_RTV_ISA_CONSTRAINTS_, list($sym38$FIND_RTV_ISA_CONSTRAINTS, formula, var)), list($sym39$_RTV_GENLS_CONSTRAINTS_, list($sym40$FIND_RTV_GENLS_CONSTRAINTS, formula, var))),
                listS($sym4$CLET, $list41, append(body, NIL)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5000L)
    public static SubLObject find_rtv_isa_constraints(SubLObject formula, SubLObject var) {
        SubLObject isa_clauses = list_utilities.tree_find_all_if($sym42$ISA_CLAUSE_P, formula, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = isa_clauses;
        SubLObject isa_clause = NIL;
        isa_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == var || cycl_utilities.formula_arg1(isa_clause, UNPROVIDED).eql(var)) {
                SubLObject col = cycl_utilities.formula_arg2(isa_clause, UNPROVIDED);
                if (NIL != forts.fort_p(col)) {
                    result = cons(col, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_clause = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5400L)
    public static SubLObject find_rtv_genls_constraints(SubLObject formula, SubLObject var) {
        SubLObject genls_clauses = list_utilities.tree_find_all_if($sym43$GENLS_CLAUSE_P, formula, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = genls_clauses;
        SubLObject genls_clause = NIL;
        genls_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == var || cycl_utilities.formula_arg1(genls_clause, UNPROVIDED).eql(var)) {
                SubLObject col = cycl_utilities.formula_arg2(genls_clause, UNPROVIDED);
                if (NIL != forts.fort_p(col)) {
                    result = cons(col, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genls_clause = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5700L)
    public static SubLObject rtv_clause_p(SubLObject formula) {
        return Equality.eql(cycl_utilities.formula_arg0(formula), $$relatedToVia);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5800L)
    public static SubLObject isa_clause_p(SubLObject formula) {
        return Equality.eql(cycl_utilities.formula_arg0(formula), $$isa);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5900L)
    public static SubLObject genls_clause_p(SubLObject formula) {
        return Equality.eql(cycl_utilities.formula_arg0(formula), $$genls);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6000L)
    public static SubLObject rtv_use_type_constraints_p() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $rtv_use_type_constraints_p$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6100L)
    public static SubLObject rtv_node_meets_constraints_p(SubLObject v_search, SubLObject node) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = T;
        if (NIL != $rtv_isa_constraints$.getDynamicValue(thread) && NIL == isa.isa_anyP(node, $rtv_isa_constraints$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            successP = NIL;
        }
        if (NIL != $rtv_genls_constraints$.getDynamicValue(thread) && NIL == genls.any_genlP(node, $rtv_genls_constraints$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            successP = NIL;
        }
        return successP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6500L)
    public static SubLObject get_rtv_inference_node_constraints() {
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6700L)
    public static SubLObject rtv_type_litP(SubLObject literal) {
        return makeBoolean(NIL != generate_instance_litP(literal) || NIL != generate_spec_litP(literal));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6800L)
    public static SubLObject generate_spec_litP(SubLObject literal) {
        return makeBoolean(NIL != el_utilities.genls_litP(literal) && NIL != variables.variable_p(cycl_utilities.formula_arg1(literal, UNPROVIDED)) && NIL != forts.fort_p(cycl_utilities.formula_arg2(literal, UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6900L)
    public static SubLObject generate_instance_litP(SubLObject literal) {
        return makeBoolean(NIL != el_utilities.isa_litP(literal) && NIL != variables.variable_p(cycl_utilities.formula_arg1(literal, UNPROVIDED)) && NIL != forts.fort_p(cycl_utilities.formula_arg2(literal, UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 7100L)
    public static SubLObject rtv_closure(SubLObject node, SubLObject pred_set, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != Types.listp(pred_set) : pred_set;
        SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            SubLObject mt_var = conses_high.getf(listS($ORDER, new SubLObject[] { $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $list53 }), $MT, UNPROVIDED);
            SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[] { $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $list53 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 7700L)
    public static SubLObject rtv_closure_filtered(SubLObject node, SubLObject pred_set, SubLObject test_fn, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.remove_if_not(test_fn, rtv_closure(node, pred_set, depth, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 8100L)
    public static SubLObject rtv_path_p(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != Types.listp(pred_set) : pred_set;
        SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            SubLObject mt_var = conses_high.getf(list(new SubLObject[] { $ORDER, $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $GOAL, goal_node }), $MT, UNPROVIDED);
            SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(list(new SubLObject[] { $ORDER, $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $GOAL, goal_node })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 8600L)
    public static SubLObject rtv_justify_relation(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
            assert NIL != Types.listp(pred_set) : pred_set;
            SubLObject _prev_bind_0_$3 = $rtv_asent_set_o_preds$.currentBinding(thread);
            try {
                $rtv_asent_set_o_preds$.bind(pred_set, thread);
                SubLObject mt_var = conses_high.getf(list(new SubLObject[] { $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, T, $ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node }), $MT, UNPROVIDED);
                SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject v_search = ghl_search_vars.new_ghl_search(
                            add_rtv_default_search_properties(list(new SubLObject[] { $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, T, $ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, start_node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                $rtv_asent_set_o_preds$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 9300L)
    public static SubLObject rtv_justify_relation_union_all(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
            assert NIL != Types.listp(pred_set) : pred_set;
            SubLObject _prev_bind_0_$5 = $rtv_asent_set_o_preds$.currentBinding(thread);
            try {
                $rtv_asent_set_o_preds$.bind(pred_set, thread);
                SubLObject mt_var = conses_high.getf(list(new SubLObject[] { $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, $ALL, $ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node }), $MT, UNPROVIDED);
                SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject v_search = ghl_search_vars.new_ghl_search(
                            add_rtv_default_search_properties(list(new SubLObject[] { $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, $ALL, $ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, start_node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$6, thread);
                }
            } finally {
                $rtv_asent_set_o_preds$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 10100L)
    public static SubLObject rtv_all_nodes_from_node(SubLObject node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.fast_delete_duplicates(rtv_closure(node, pred_set, length, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 10400L)
    public static SubLObject rtv_all_edges_from_node(SubLObject node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != Types.listp(pred_set) : pred_set;
        SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            SubLObject mt_var = conses_high.getf(listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $list60 }), $MT, UNPROVIDED);
            SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $list60 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 10900L)
    public static SubLObject rtv_paths_covering_node_closure(SubLObject node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rtv_all_edges_from_node(node, pred_set, length, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 11300L)
    public static SubLObject rtv_one_path(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rtv_justify_relation(start_node, goal_node, pred_set, length, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 11600L)
    public static SubLObject rtv_all_edges_from_node_to_node(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != Types.listp(pred_set) : pred_set;
        SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            SubLObject mt_var = conses_high.getf(ConsesLow.listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_node, $list61 }), $MT, UNPROVIDED);
            SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_node, $list61 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 12300L)
    public static SubLObject rtv_all_edges_from_node_to_node_expanded(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject exemplars = rtv_all_edges_from_node_to_node(start_node, goal_node, pred_set, length, mt);
        return rtv_add_alternate_edges_to_exemplars(exemplars, pred_set, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 12800L)
    public static SubLObject rtv_add_alternate_edges_to_exemplars(SubLObject exemplars, SubLObject pred_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject included_set = set_utilities.make_set_from_list(exemplars, UNPROVIDED);
        SubLObject alternates = NIL;
        SubLObject cdolist_list_var = exemplars;
        SubLObject exemplar = NIL;
        exemplar = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject node_1 = assertions_high.gaf_arg1(exemplar);
            SubLObject node_2 = assertions_high.gaf_arg2(exemplar);
            SubLObject cdolist_list_var_$9 = pred_set;
            SubLObject pred = NIL;
            pred = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                SubLObject cdolist_list_var_$10;
                SubLObject candidates = cdolist_list_var_$10 = rtv_all_edges_from_node_to_node(node_1, node_2, list(pred), ONE_INTEGER, mt);
                SubLObject candidate = NIL;
                candidate = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    if (NIL == set.set_memberP(candidate, included_set)) {
                        set.set_add(candidate, included_set);
                        alternates = cons(candidate, alternates);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    candidate = cdolist_list_var_$10.first();
                }
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                pred = cdolist_list_var_$9.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            exemplar = cdolist_list_var.first();
        }
        SubLObject expanded = nconc(exemplars, Sequences.nreverse(alternates));
        return expanded;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 13400L)
    public static SubLObject rtv_all_edges_from_node_to_nodes(SubLObject start_node, SubLObject goal_nodes, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != Types.listp(pred_set) : pred_set;
        SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            SubLObject mt_var = conses_high.getf(ConsesLow.listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_nodes, $list61 }), $MT, UNPROVIDED);
            SubLObject _prev_bind_0_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_nodes, $list61 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$11, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 14800L)
    public static SubLObject rtv_all_edges_from_node_to_nodes_expanded(SubLObject start_node, SubLObject goal_nodes, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject exemplars = rtv_all_edges_from_node_to_nodes(start_node, goal_nodes, pred_set, length, mt);
        return rtv_add_alternate_edges_to_exemplars(exemplars, pred_set, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 15300L)
    public static SubLObject rtv_all_edges_from_node_to_nodes_satisfying(SubLObject node, SubLObject test_formula, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != Types.listp(pred_set) : pred_set;
        SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            SubLObject rtv_formula = Sequences.find_if($sym62$RTV_CLAUSE_P, test_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject var = (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED))) ? cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED)
                    : ((NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED))) ? cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED) : NIL);
            SubLObject _prev_bind_0_$12 = $rtv_isa_constraints$.currentBinding(thread);
            SubLObject _prev_bind_2 = $rtv_genls_constraints$.currentBinding(thread);
            SubLObject _prev_bind_3 = $rtv_use_type_constraints_p$.currentBinding(thread);
            try {
                $rtv_isa_constraints$.bind(find_rtv_isa_constraints(test_formula, var), thread);
                $rtv_genls_constraints$.bind(find_rtv_genls_constraints(test_formula, var), thread);
                $rtv_use_type_constraints_p$.bind(makeBoolean(NIL != $rtv_isa_constraints$.getDynamicValue(thread) || NIL != $rtv_genls_constraints$.getDynamicValue(thread)), thread);
                SubLObject mt_var = conses_high.getf(listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, $sym64$RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $list65 }), $MT, UNPROVIDED);
                SubLObject _prev_bind_0_$13 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_$14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_$15 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, $sym64$RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $list65 })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$15, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$14, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$13, thread);
                }
            } finally {
                $rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
                $rtv_genls_constraints$.rebind(_prev_bind_2, thread);
                $rtv_isa_constraints$.rebind(_prev_bind_0_$12, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 16000L)
    public static SubLObject rtv_all_edges_from_node_to_goal_nodes_satisfying(SubLObject node, SubLObject goal_nodes, SubLObject test_formula, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != Types.listp(pred_set) : pred_set;
        SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            SubLObject rtv_formula = Sequences.find_if($sym62$RTV_CLAUSE_P, test_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject var = (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED))) ? cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED)
                    : ((NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED))) ? cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED) : NIL);
            SubLObject _prev_bind_0_$16 = $rtv_isa_constraints$.currentBinding(thread);
            SubLObject _prev_bind_2 = $rtv_genls_constraints$.currentBinding(thread);
            SubLObject _prev_bind_3 = $rtv_use_type_constraints_p$.currentBinding(thread);
            try {
                $rtv_isa_constraints$.bind(find_rtv_isa_constraints(test_formula, var), thread);
                $rtv_genls_constraints$.bind(find_rtv_genls_constraints(test_formula, var), thread);
                $rtv_use_type_constraints_p$.bind(makeBoolean(NIL != $rtv_isa_constraints$.getDynamicValue(thread) || NIL != $rtv_genls_constraints$.getDynamicValue(thread)), thread);
                SubLObject mt_var = conses_high.getf(listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, $sym64$RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $GOAL, goal_nodes, $list65 }), $MT, UNPROVIDED);
                SubLObject _prev_bind_0_$17 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_$18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_$19 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject v_search = ghl_search_vars.new_ghl_search(
                            add_rtv_default_search_properties(listS($ORDER, new SubLObject[] { $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, $sym64$RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $GOAL, goal_nodes, $list65 })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$19, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$18, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                $rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
                $rtv_genls_constraints$.rebind(_prev_bind_2, thread);
                $rtv_isa_constraints$.rebind(_prev_bind_0_$16, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 16700L)
    public static SubLObject all_edges_subsumed_by_preds(SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
            try {
                sbhl_search_methods.sbhl_union_simply_all_backward_true_edges(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, UNPROVIDED);
            } finally {
                SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = sbhl_search_vars.$sbhl_justification_behavior$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_justification_behavior$.bind($ASSERTION, thread);
            just = sbhl_search_utilities.sbhl_assemble_justification(just, UNPROVIDED);
        } finally {
            sbhl_search_vars.$sbhl_justification_behavior$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 17100L)
    public static SubLObject inference_rtv_check(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
        SubLObject _prev_bind_2 = $rtv_asent_pred$.currentBinding(thread);
        SubLObject _prev_bind_3 = $rtv_term_argnums$.currentBinding(thread);
        SubLObject _prev_bind_4 = $rtv_var_argnums$.currentBinding(thread);
        SubLObject _prev_bind_5 = $rtv_asent_set_o_preds$.currentBinding(thread);
        SubLObject _prev_bind_6 = $rtv_depth_cutoff$.currentBinding(thread);
        try {
            $rtv_asent$.bind(asent, thread);
            $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            result = rtv_path_p(determine_rtv_initial_node(asent), determine_rtv_goal(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        } finally {
            $rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            $rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            $rtv_var_argnums$.rebind(_prev_bind_4, thread);
            $rtv_term_argnums$.rebind(_prev_bind_3, thread);
            $rtv_asent_pred$.rebind(_prev_bind_2, thread);
            $rtv_asent$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 17600L)
    public static SubLObject inference_rtv_unify(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
        SubLObject _prev_bind_2 = $rtv_asent_pred$.currentBinding(thread);
        SubLObject _prev_bind_3 = $rtv_term_argnums$.currentBinding(thread);
        SubLObject _prev_bind_4 = $rtv_var_argnums$.currentBinding(thread);
        SubLObject _prev_bind_5 = $rtv_asent_set_o_preds$.currentBinding(thread);
        SubLObject _prev_bind_6 = $rtv_depth_cutoff$.currentBinding(thread);
        try {
            $rtv_asent$.bind(asent, thread);
            $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            result = rtv_closure(determine_rtv_initial_node(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        } finally {
            $rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            $rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            $rtv_var_argnums$.rebind(_prev_bind_4, thread);
            $rtv_term_argnums$.rebind(_prev_bind_3, thread);
            $rtv_asent_pred$.rebind(_prev_bind_2, thread);
            $rtv_asent$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 17900L)
    public static SubLObject inference_rtv_justify(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
        SubLObject _prev_bind_2 = $rtv_asent_pred$.currentBinding(thread);
        SubLObject _prev_bind_3 = $rtv_term_argnums$.currentBinding(thread);
        SubLObject _prev_bind_4 = $rtv_var_argnums$.currentBinding(thread);
        SubLObject _prev_bind_5 = $rtv_asent_set_o_preds$.currentBinding(thread);
        SubLObject _prev_bind_6 = $rtv_depth_cutoff$.currentBinding(thread);
        try {
            $rtv_asent$.bind(asent, thread);
            $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            just = rtv_justify_relation(determine_rtv_initial_node(asent), determine_rtv_goal(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        } finally {
            $rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            $rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            $rtv_var_argnums$.rebind(_prev_bind_4, thread);
            $rtv_term_argnums$.rebind(_prev_bind_3, thread);
            $rtv_asent_pred$.rebind(_prev_bind_2, thread);
            $rtv_asent$.rebind(_prev_bind_0, thread);
        }
        if (NIL != just) {
            just = rtv_add_genl_predicate_justs(just, asent, mt);
        }
        return just;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 18400L)
    public static SubLObject inference_rtv_max_floor_mts(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.fast_delete_duplicates(Mapping.mapcan(Symbols.symbol_function($sym68$FIRST), forward.compute_all_mt_and_support_combinations(inference_rtv_justify(asent, mt), UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 18500L)
    public static SubLObject rtv_add_genl_predicate_justs(SubLObject just, SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = just;
        SubLObject justified = NIL;
        SubLObject mt_var = mt;
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        SubLObject _prev_bind_4 = $rtv_asent$.currentBinding(thread);
        SubLObject _prev_bind_5 = $rtv_asent_pred$.currentBinding(thread);
        SubLObject _prev_bind_6 = $rtv_term_argnums$.currentBinding(thread);
        SubLObject _prev_bind_7 = $rtv_var_argnums$.currentBinding(thread);
        SubLObject _prev_bind_8 = $rtv_asent_set_o_preds$.currentBinding(thread);
        SubLObject _prev_bind_9 = $rtv_depth_cutoff$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            $rtv_asent$.bind(asent, thread);
            $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            SubLObject cdolist_list_var = just;
            SubLObject just_ass = NIL;
            just_ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertions_high.gaf_assertionP(just_ass)) {
                    SubLObject just_pred = assertions_high.gaf_arg0(just_ass);
                    if (NIL == subl_promotions.memberP(just_pred, get_rtv_pred_set(), UNPROVIDED, UNPROVIDED) && NIL == subl_promotions.memberP(just_pred, justified, UNPROVIDED, UNPROVIDED)) {
                        SubLObject formula = NIL;
                        if (NIL == formula) {
                            SubLObject csome_list_var = get_rtv_pred_set();
                            SubLObject rtv_pred = NIL;
                            rtv_pred = csome_list_var.first();
                            while (NIL == formula && NIL != csome_list_var) {
                                if (NIL != genl_predicates.genl_predicateP(just_pred, rtv_pred, UNPROVIDED, UNPROVIDED)) {
                                    formula = list($$genlPreds, just_pred, rtv_pred);
                                } else if (NIL != genl_predicates.genl_inverseP(just_pred, rtv_pred, UNPROVIDED, UNPROVIDED)) {
                                    formula = list($$genlInverse, just_pred, rtv_pred);
                                }
                                csome_list_var = csome_list_var.rest();
                                rtv_pred = csome_list_var.first();
                            }
                        }
                        if (NIL != formula) {
                            justified = cons(just_pred, justified);
                            result = append(result, list(arguments.make_hl_support($GENLPREDS, formula, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED)));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                just_ass = cdolist_list_var.first();
            }
        } finally {
            $rtv_depth_cutoff$.rebind(_prev_bind_9, thread);
            $rtv_asent_set_o_preds$.rebind(_prev_bind_8, thread);
            $rtv_var_argnums$.rebind(_prev_bind_7, thread);
            $rtv_term_argnums$.rebind(_prev_bind_6, thread);
            $rtv_asent_pred$.rebind(_prev_bind_5, thread);
            $rtv_asent$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 19400L)
    public static SubLObject removal_rtv_required(SubLObject asent) {
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject sop = NIL;
        SubLObject num = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(asent, asent, $list71);
        pred = asent.first();
        SubLObject current = asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, $list71);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, $list71);
        arg2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, $list71);
        sop = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, $list71);
        num = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == subl_promotions.non_negative_integer_p(num)) {
                return NIL;
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(asent, $list71);
        }
        return T;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 19800L)
    public static SubLObject make_rtv_support(SubLObject asent) {
        return arguments.make_hl_support($RTV, asent, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 19900L)
    public static SubLObject removal_rtv_check_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_rtv_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 20100L)
    public static SubLObject removal_rtv_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != inference_rtv_check(asent, UNPROVIDED)) {
            SubLObject hl_support = make_rtv_support(asent);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 20900L)
    public static SubLObject removal_rtv_generate_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_rtv_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 21100L)
    public static SubLObject removal_rtv_generate_iterator(SubLObject asent) {
        SubLObject constraints = get_rtv_inference_node_constraints();
        SubLObject unified_terms = NIL;
        if (NIL != constraints) {
            unified_terms = inference_rtv_constrained_unify(asent, constraints);
        } else {
            unified_terms = inference_rtv_unify(asent, UNPROVIDED);
        }
        return iteration.new_list_iterator(unified_terms);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 21600L)
    public static SubLObject inference_rtv_constrained_unify(SubLObject asent, SubLObject constraints) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $rtv_isa_constraints$.currentBinding(thread);
        SubLObject _prev_bind_2 = $rtv_genls_constraints$.currentBinding(thread);
        SubLObject _prev_bind_3 = $rtv_use_type_constraints_p$.currentBinding(thread);
        try {
            $rtv_isa_constraints$.bind(NIL, thread);
            $rtv_genls_constraints$.bind(NIL, thread);
            $rtv_use_type_constraints_p$.bind(T, thread);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject pred = cycl_utilities.formula_arg0(constraint);
                SubLObject col = cycl_utilities.formula_arg2(constraint, UNPROVIDED);
                SubLObject pcase_var = pred;
                if (pcase_var.eql($$isa)) {
                    $rtv_isa_constraints$.setDynamicValue(cons(col, $rtv_isa_constraints$.getDynamicValue(thread)), thread);
                } else if (pcase_var.eql($$genls)) {
                    $rtv_genls_constraints$.setDynamicValue(cons(col, $rtv_genls_constraints$.getDynamicValue(thread)), thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            SubLObject _prev_bind_0_$21 = $rtv_asent$.currentBinding(thread);
            SubLObject _prev_bind_1_$22 = $rtv_asent_pred$.currentBinding(thread);
            SubLObject _prev_bind_2_$23 = $rtv_term_argnums$.currentBinding(thread);
            SubLObject _prev_bind_4 = $rtv_var_argnums$.currentBinding(thread);
            SubLObject _prev_bind_5 = $rtv_asent_set_o_preds$.currentBinding(thread);
            SubLObject _prev_bind_6 = $rtv_depth_cutoff$.currentBinding(thread);
            try {
                $rtv_asent$.bind(asent, thread);
                $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
                $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
                $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
                $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
                $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
                result = rtv_closure_filtered(determine_rtv_initial_node(asent), get_rtv_pred_set(), $sym64$RTV_NODE_MEETS_CONSTRAINTS_P, get_rtv_depth_cutoff(), UNPROVIDED);
            } finally {
                $rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
                $rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
                $rtv_var_argnums$.rebind(_prev_bind_4, thread);
                $rtv_term_argnums$.rebind(_prev_bind_2_$23, thread);
                $rtv_asent_pred$.rebind(_prev_bind_1_$22, thread);
                $rtv_asent$.rebind(_prev_bind_0_$21, thread);
            }
        } finally {
            $rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
            $rtv_genls_constraints$.rebind(_prev_bind_2, thread);
            $rtv_isa_constraints$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject declare_removal_modules_rtv_file() {
        declareMacro(me, "with_rtv_asent_set_o_preds", "WITH-RTV-ASENT-SET-O-PREDS");
        declareFunction(myName, "get_rtv_pred_set", "GET-RTV-PRED-SET", 0, 0, false);
        declareFunction(myName, "get_rtv_depth_cutoff", "GET-RTV-DEPTH-CUTOFF", 0, 0, false);
        declareMacro(me, "with_rtv_depth_cutoff", "WITH-RTV-DEPTH-CUTOFF");
        declareFunction(myName, "determine_rtv_term_argnums", "DETERMINE-RTV-TERM-ARGNUMS", 1, 0, false);
        declareFunction(myName, "determine_rtv_var_argnums", "DETERMINE-RTV-VAR-ARGNUMS", 1, 0, false);
        declareFunction(myName, "get_rtv_var_arg", "GET-RTV-VAR-ARG", 1, 0, false);
        declareFunction(myName, "determine_rtv_asent_preds", "DETERMINE-RTV-ASENT-PREDS", 1, 0, false);
        declareFunction(myName, "determine_rtv_depth_cutoff", "DETERMINE-RTV-DEPTH-CUTOFF", 1, 0, false);
        declareFunction(myName, "determine_rtv_initial_node", "DETERMINE-RTV-INITIAL-NODE", 1, 0, false);
        declareFunction(myName, "determine_rtv_goal", "DETERMINE-RTV-GOAL", 1, 0, false);
        declareMacro(me, "bind_rtv_asent", "BIND-RTV-ASENT");
        declareFunction(myName, "add_rtv_default_search_properties", "ADD-RTV-DEFAULT-SEARCH-PROPERTIES", 1, 0, false);
        declareMacro(me, "with_rtv_search_initialized", "WITH-RTV-SEARCH-INITIALIZED");
        declareMacro(me, "with_new_rtv_type_constraints", "WITH-NEW-RTV-TYPE-CONSTRAINTS");
        declareMacro(me, "with_rtv_constraints_from_formula", "WITH-RTV-CONSTRAINTS-FROM-FORMULA");
        declareFunction(myName, "find_rtv_isa_constraints", "FIND-RTV-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction(myName, "find_rtv_genls_constraints", "FIND-RTV-GENLS-CONSTRAINTS", 2, 0, false);
        declareFunction(myName, "rtv_clause_p", "RTV-CLAUSE-P", 1, 0, false);
        declareFunction(myName, "isa_clause_p", "ISA-CLAUSE-P", 1, 0, false);
        declareFunction(myName, "genls_clause_p", "GENLS-CLAUSE-P", 1, 0, false);
        declareFunction(myName, "rtv_use_type_constraints_p", "RTV-USE-TYPE-CONSTRAINTS-P", 0, 0, false);
        declareFunction(myName, "rtv_node_meets_constraints_p", "RTV-NODE-MEETS-CONSTRAINTS-P", 2, 0, false);
        declareFunction(myName, "get_rtv_inference_node_constraints", "GET-RTV-INFERENCE-NODE-CONSTRAINTS", 0, 0, false);
        declareFunction(myName, "rtv_type_litP", "RTV-TYPE-LIT?", 1, 0, false);
        declareFunction(myName, "generate_spec_litP", "GENERATE-SPEC-LIT?", 1, 0, false);
        declareFunction(myName, "generate_instance_litP", "GENERATE-INSTANCE-LIT?", 1, 0, false);
        declareFunction(myName, "rtv_closure", "RTV-CLOSURE", 3, 1, false);
        declareFunction(myName, "rtv_closure_filtered", "RTV-CLOSURE-FILTERED", 4, 1, false);
        declareFunction(myName, "rtv_path_p", "RTV-PATH-P", 4, 1, false);
        declareFunction(myName, "rtv_justify_relation", "RTV-JUSTIFY-RELATION", 4, 1, false);
        declareFunction(myName, "rtv_justify_relation_union_all", "RTV-JUSTIFY-RELATION-UNION-ALL", 4, 1, false);
        declareFunction(myName, "rtv_all_nodes_from_node", "RTV-ALL-NODES-FROM-NODE", 3, 1, false);
        declareFunction(myName, "rtv_all_edges_from_node", "RTV-ALL-EDGES-FROM-NODE", 3, 1, false);
        declareFunction(myName, "rtv_paths_covering_node_closure", "RTV-PATHS-COVERING-NODE-CLOSURE", 3, 1, false);
        declareFunction(myName, "rtv_one_path", "RTV-ONE-PATH", 4, 1, false);
        declareFunction(myName, "rtv_all_edges_from_node_to_node", "RTV-ALL-EDGES-FROM-NODE-TO-NODE", 4, 1, false);
        declareFunction(myName, "rtv_all_edges_from_node_to_node_expanded", "RTV-ALL-EDGES-FROM-NODE-TO-NODE-EXPANDED", 4, 1, false);
        declareFunction(myName, "rtv_add_alternate_edges_to_exemplars", "RTV-ADD-ALTERNATE-EDGES-TO-EXEMPLARS", 2, 1, false);
        declareFunction(myName, "rtv_all_edges_from_node_to_nodes", "RTV-ALL-EDGES-FROM-NODE-TO-NODES", 4, 1, false);
        declareFunction(myName, "rtv_all_edges_from_node_to_nodes_expanded", "RTV-ALL-EDGES-FROM-NODE-TO-NODES-EXPANDED", 4, 1, false);
        declareFunction(myName, "rtv_all_edges_from_node_to_nodes_satisfying", "RTV-ALL-EDGES-FROM-NODE-TO-NODES-SATISFYING", 4, 1, false);
        declareFunction(myName, "rtv_all_edges_from_node_to_goal_nodes_satisfying", "RTV-ALL-EDGES-FROM-NODE-TO-GOAL-NODES-SATISFYING", 5, 1, false);
        declareFunction(myName, "all_edges_subsumed_by_preds", "ALL-EDGES-SUBSUMED-BY-PREDS", 1, 1, false);
        declareFunction(myName, "inference_rtv_check", "INFERENCE-RTV-CHECK", 1, 1, false);
        declareFunction(myName, "inference_rtv_unify", "INFERENCE-RTV-UNIFY", 1, 1, false);
        declareFunction(myName, "inference_rtv_justify", "INFERENCE-RTV-JUSTIFY", 1, 1, false);
        declareFunction(myName, "inference_rtv_max_floor_mts", "INFERENCE-RTV-MAX-FLOOR-MTS", 1, 1, false);
        declareFunction(myName, "rtv_add_genl_predicate_justs", "RTV-ADD-GENL-PREDICATE-JUSTS", 2, 1, false);
        declareFunction(myName, "removal_rtv_required", "REMOVAL-RTV-REQUIRED", 1, 0, false);
        declareFunction(myName, "make_rtv_support", "MAKE-RTV-SUPPORT", 1, 0, false);
        declareFunction(myName, "removal_rtv_check_required", "REMOVAL-RTV-CHECK-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_rtv_check_expand", "REMOVAL-RTV-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_rtv_generate_required", "REMOVAL-RTV-GENERATE-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_rtv_generate_iterator", "REMOVAL-RTV-GENERATE-ITERATOR", 1, 0, false);
        declareFunction(myName, "inference_rtv_constrained_unify", "INFERENCE-RTV-CONSTRAINED-UNIFY", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_rtv_file() {
        $rtv_asent$ = defparameter("*RTV-ASENT*", NIL);
        $rtv_asent_pred$ = defparameter("*RTV-ASENT-PRED*", NIL);
        $rtv_term_argnums$ = defparameter("*RTV-TERM-ARGNUMS*", NIL);
        $rtv_var_argnums$ = defparameter("*RTV-VAR-ARGNUMS*", NIL);
        $rtv_asent_set_o_preds$ = defparameter("*RTV-ASENT-SET-O-PREDS*", NIL);
        $rtv_depth_cutoff$ = defparameter("*RTV-DEPTH-CUTOFF*", NIL);
        $rtv_default_search_plist$ = deflexical("*RTV-DEFAULT-SEARCH-PLIST*", $list20);
        $rtv_isa_constraints$ = defparameter("*RTV-ISA-CONSTRAINTS*", NIL);
        $rtv_genls_constraints$ = defparameter("*RTV-GENLS-CONSTRAINTS*", NIL);
        $rtv_use_type_constraints_p$ = defparameter("*RTV-USE-TYPE-CONSTRAINTS-P*", NIL);
        $default_rtv_cost$ = deflexical("*DEFAULT-RTV-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_rtv_file() {
        inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_CHECK, $list74);
        inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_GENERATE, $list76);
        inference_modules.register_solely_specific_removal_module_predicate($$relatedToVia);
        preference_modules.doomed_unless_arg_bindable($POS, $$relatedToVia, THREE_INTEGER);
        preference_modules.inference_preference_module($RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE, $list79);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_rtv_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_rtv_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_rtv_file();
    }

    static {
        me = new removal_modules_rtv();
        $rtv_asent$ = null;
        $rtv_asent_pred$ = null;
        $rtv_term_argnums$ = null;
        $rtv_var_argnums$ = null;
        $rtv_asent_set_o_preds$ = null;
        $rtv_depth_cutoff$ = null;
        $rtv_default_search_plist$ = null;
        $rtv_isa_constraints$ = null;
        $rtv_genls_constraints$ = null;
        $rtv_use_type_constraints_p$ = null;
        $default_rtv_cost$ = null;
        $list0 = list(makeSymbol("PREDS"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym1$PROGN = makeSymbol("PROGN");
        $sym2$CHECK_TYPE = makeSymbol("CHECK-TYPE");
        $list3 = list(makeSymbol("LISTP"));
        $sym4$CLET = makeSymbol("CLET");
        $sym5$_RTV_ASENT_SET_O_PREDS_ = makeSymbol("*RTV-ASENT-SET-O-PREDS*");
        $list6 = list(makeSymbol("DEPTH"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym7$_RTV_DEPTH_CUTOFF_ = makeSymbol("*RTV-DEPTH-CUTOFF*");
        $str8$No_valid_hl_variable_in_asent____ = makeString("No valid hl-variable in asent : ~A");
        $str9$No_initial_node_applicable_for_as = makeString("No initial node applicable for asent ~A~%");
        $list10 = list(makeSymbol("ASENT"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym11$_RTV_ASENT_ = makeSymbol("*RTV-ASENT*");
        $sym12$_RTV_ASENT_PRED_ = makeSymbol("*RTV-ASENT-PRED*");
        $sym13$ATOMIC_SENTENCE_PREDICATE = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $sym14$_RTV_TERM_ARGNUMS_ = makeSymbol("*RTV-TERM-ARGNUMS*");
        $sym15$DETERMINE_RTV_TERM_ARGNUMS = makeSymbol("DETERMINE-RTV-TERM-ARGNUMS");
        $sym16$_RTV_VAR_ARGNUMS_ = makeSymbol("*RTV-VAR-ARGNUMS*");
        $sym17$DETERMINE_RTV_VAR_ARGNUMS = makeSymbol("DETERMINE-RTV-VAR-ARGNUMS");
        $sym18$DETERMINE_RTV_ASENT_PREDS = makeSymbol("DETERMINE-RTV-ASENT-PREDS");
        $sym19$DETERMINE_RTV_DEPTH_CUTOFF = makeSymbol("DETERMINE-RTV-DEPTH-CUTOFF");
        $list20 = list(makeKeyword("TYPE"), makeKeyword("TRANSITIVE-REASONING"), makeKeyword("DIRECTION"), makeKeyword("ACCESSIBLE"), makeKeyword("MARKING"), makeKeyword("DEPTH-MARKING"));
        $list21 = list(makeSymbol("SEARCH"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym22$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
        $sym23$GETF = makeSymbol("GETF");
        $list24 = list(makeKeyword("MT"));
        $sym25$WITH_GHL_SEARCH_INITIALIZED = makeSymbol("WITH-GHL-SEARCH-INITIALIZED");
        $sym26$ADD_RTV_DEFAULT_SEARCH_PROPERTIES = makeSymbol("ADD-RTV-DEFAULT-SEARCH-PROPERTIES");
        $list27 = list(list(makeSymbol("*RTV-ISA-CONSTRAINTS*"), NIL), list(makeSymbol("*RTV-GENLS-CONSTRAINTS*"), NIL), list(makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*"), T));
        $list28 = list(makeSymbol("FORMULA"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym29$RTV_FORMULA = makeUninternedSymbol("RTV-FORMULA");
        $sym30$VAR = makeUninternedSymbol("VAR");
        $sym31$FIND_IF = makeSymbol("FIND-IF");
        $list32 = list(makeSymbol("QUOTE"), makeSymbol("RTV-CLAUSE-P"));
        $sym33$FCOND = makeSymbol("FCOND");
        $sym34$EL_VAR_ = makeSymbol("EL-VAR?");
        $sym35$FORMULA_ARG1 = makeSymbol("FORMULA-ARG1");
        $sym36$FORMULA_ARG2 = makeSymbol("FORMULA-ARG2");
        $sym37$_RTV_ISA_CONSTRAINTS_ = makeSymbol("*RTV-ISA-CONSTRAINTS*");
        $sym38$FIND_RTV_ISA_CONSTRAINTS = makeSymbol("FIND-RTV-ISA-CONSTRAINTS");
        $sym39$_RTV_GENLS_CONSTRAINTS_ = makeSymbol("*RTV-GENLS-CONSTRAINTS*");
        $sym40$FIND_RTV_GENLS_CONSTRAINTS = makeSymbol("FIND-RTV-GENLS-CONSTRAINTS");
        $list41 = list(list(makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*"), ConsesLow.list(makeSymbol("COR"), makeSymbol("*RTV-ISA-CONSTRAINTS*"), makeSymbol("*RTV-GENLS-CONSTRAINTS*"))));
        $sym42$ISA_CLAUSE_P = makeSymbol("ISA-CLAUSE-P");
        $sym43$GENLS_CLAUSE_P = makeSymbol("GENLS-CLAUSE-P");
        $$relatedToVia = makeConstSym(("relatedToVia"));
        $$isa = makeConstSym(("isa"));
        $$genls = makeConstSym(("genls"));
        $sym47$LISTP = makeSymbol("LISTP");
        $ORDER = makeKeyword("ORDER");
        $DEPTH_FIRST = makeKeyword("DEPTH-FIRST");
        $MT = makeKeyword("MT");
        $PREDICATES = makeKeyword("PREDICATES");
        $CUTOFF = makeKeyword("CUTOFF");
        $list53 = list(makeKeyword("ADD-TO-RESULT?"), makeKeyword("NODES-ON-WIND"));
        $GOAL = makeKeyword("GOAL");
        $ITERATIVE_DEEPENING = makeKeyword("ITERATIVE-DEEPENING");
        $JUSTIFY_ = makeKeyword("JUSTIFY?");
        $ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");
        $EDGES_ON_UNWIND = makeKeyword("EDGES-ON-UNWIND");
        $ALL = makeKeyword("ALL");
        $list60 = list(makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"), makeKeyword("JUSTIFY?"), makeKeyword("ALL"));
        $list61 = list(makeKeyword("JUSTIFY?"), makeKeyword("ALL"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"));
        $sym62$RTV_CLAUSE_P = makeSymbol("RTV-CLAUSE-P");
        $GOAL_FN = makeKeyword("GOAL-FN");
        $sym64$RTV_NODE_MEETS_CONSTRAINTS_P = makeSymbol("RTV-NODE-MEETS-CONSTRAINTS-P");
        $list65 = list(makeKeyword("SATISFY-FN"), makeSymbol("RTV-NODE-MEETS-CONSTRAINTS-P"), makeKeyword("JUSTIFY?"), makeKeyword("ALL"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"));
        $$genlPreds = makeConstSym(("genlPreds"));
        $ASSERTION = makeKeyword("ASSERTION");
        $sym68$FIRST = makeSymbol("FIRST");
        $$genlInverse = makeConstSym(("genlInverse"));
        $GENLPREDS = makeKeyword("GENLPREDS");
        $list71 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("SOP"), makeSymbol("NUM"));
        $RTV = makeKeyword("RTV");
        $REMOVAL_RELATED_TO_VIA_CHECK = makeKeyword("REMOVAL-RELATED-TO-VIA-CHECK");
        $list74 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("relatedToVia")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("relatedToVia")), makeKeyword("FORT"), makeKeyword("FORT"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RTV-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-RTV-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RTV-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$relatedToVia <fort> <fort> <SOP> <num>)"), makeKeyword("EXAMPLE"),
                makeString("(#$relatedToVia #$KevinBacon #$KevinSpacey (#$TheSet #$costars) 2)") });
        $REMOVAL_RELATED_TO_VIA_GENERATE = makeKeyword("REMOVAL-RELATED-TO-VIA-GENERATE");
        $list76 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("relatedToVia")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("relatedToVia")), makeKeyword("FORT"), makeKeyword("VARIABLE"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER")),
                        list(makeConstSym(("relatedToVia")), makeKeyword("VARIABLE"), makeKeyword("FORT"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER"))),
                makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RTV-GENERATE-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RTV-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-RTV-GENERATE-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("CALL"), makeSymbol("TERM-UNIFY"), list(makeKeyword("CALL"), makeSymbol("GET-RTV-VAR-ARG"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("INPUT")),
                        list(makeKeyword("VALUE"), makeSymbol("ASENT"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("RTV"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$relatedToVia <VAR> <fort> <SOP> <num>)\n    and\n    (#$relatedToVia <fort> <VAR> <SOP> <num>)"), makeKeyword("EXAMPLE"),
                makeString("(#$relatedToVia ?WHO #$KevinBacon (#$TheSet #$costars) 2)\n    and\n    (#$relatedToVia #$KevinBacon ?WHO (#$TheSet #$costars) 2)") });
        $POS = makeKeyword("POS");
        $RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE = makeKeyword("RELATED-TO-VIA-EITHER-ARG1-OR-ARG2-BINDABLE");
        $list79 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("relatedToVia")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("relatedToVia")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG2"));
    }
}
/*
 *
 * Total time: 396 ms
 *
 */