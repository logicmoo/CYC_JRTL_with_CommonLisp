package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_ke_useless_precision_value extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "7dc7993fea930a9b42f6f392294bd07b437b2889664906070ba1602557ff54a3";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 800L)
    private static SubLSymbol $useless_precision_from_relevant_precision_rule_formula$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 1500L)
    private static SubLSymbol $useless_precision_from_relevant_precision_rule_antecedent_template$;
    private static SubLList $list0;
    private static SubLSymbol $CODE;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLSymbol $CONTINUABLE_;
    private static SubLSymbol $ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static SubLSymbol $TRANSFORMATION_ALLOWED_;
    private static SubLSymbol $RETURN;
    private static SubLSymbol $BINDINGS_AND_SUPPORTS;
    private static SubLList $list11;
    private static SubLSymbol $sym12$INTERVAL;
    private static SubLSymbol $sym13$TERM;
    private static SubLObject $$keUselessPrecisionValueForSlotOnT;
    private static SubLList $list15;
    private static SubLSymbol $REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION;
    private static SubLList $list17;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 1300L)
    public static SubLObject make_useless_precision_from_relevant_precision_rule_support() {
        return arguments.make_hl_support($CODE, $useless_precision_from_relevant_precision_rule_formula$.getGlobalValue(), $$UniversalVocabularyMt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 2000L)
    public static SubLObject useless_precision_from_relevant_precision_rule_antecedent_dnf(SubLObject v_term, SubLObject interval) {
        SubLObject rule_antecedent_info = $useless_precision_from_relevant_precision_rule_antecedent_template$.getGlobalValue();
        SubLObject input_values = list(v_term, interval);
        SubLObject current;
        SubLObject datum = current = rule_antecedent_info;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = NIL;
        SubLObject output_el_vars = NIL;
        SubLObject scoped_el_vars = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        input_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        output_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject el_dnf_template = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return Values.values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 2800L)
    public static SubLObject removal_useless_precision_from_relevant_precision_antecedent_answers(SubLObject v_term, SubLObject interval, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        SubLObject rule_antecedent_dnf = useless_precision_from_relevant_precision_rule_antecedent_dnf(v_term, interval);
        SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[] { $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 3500L)
    public static SubLObject removal_useless_precision_from_relevant_precision_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list11;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject interval = list_utilities.alist_lookup_without_values(v_bindings, $sym12$INTERVAL, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, $sym13$TERM, UNPROVIDED, UNPROVIDED);
            SubLObject antecedent_answers = removal_useless_precision_from_relevant_precision_antecedent_answers(v_term, interval, UNPROVIDED);
            if (NIL != antecedent_answers) {
                SubLObject output_template = list($$keUselessPrecisionValueForSlotOnT, variables.find_variable_by_id(ZERO_INTEGER), v_term, interval);
                SubLObject rule_support = make_useless_precision_from_relevant_precision_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = NIL;
                antecedent_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = NIL;
                    SubLObject antecedent_supports = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings_$1) {
                            backward.removal_add_node(rule_support, v_bindings_$1, append(antecedent_supports, unify_justification));
                        }
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list15);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_ke_useless_precision_value_file() {
        declareFunction("make_useless_precision_from_relevant_precision_rule_support", "MAKE-USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-SUPPORT", 0, 0, false);
        declareFunction("useless_precision_from_relevant_precision_rule_antecedent_dnf", "USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-DNF", 2, 0, false);
        declareFunction("removal_useless_precision_from_relevant_precision_antecedent_answers", "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-ANTECEDENT-ANSWERS", 2, 1, false);
        declareFunction("removal_useless_precision_from_relevant_precision_pos_expand", "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_ke_useless_precision_value_file() {
        $useless_precision_from_relevant_precision_rule_formula$ = SubLFiles.deflexical("*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-FORMULA*", $list0);
        $useless_precision_from_relevant_precision_rule_antecedent_template$ = SubLFiles.deflexical("*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-TEMPLATE*", $list3);
        return NIL;
    }

    public static SubLObject setup_removal_modules_ke_useless_precision_value_file() {
        inference_modules.inference_removal_module($REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION, $list17);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_ke_useless_precision_value_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_ke_useless_precision_value_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_ke_useless_precision_value_file();
    }

    static {
        me = new removal_modules_ke_useless_precision_value();
        $useless_precision_from_relevant_precision_rule_formula$ = null;
        $useless_precision_from_relevant_precision_rule_antecedent_template$ = null;
        $list0 = list(
                makeConstSym(("implies")), list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?TERM"), makeSymbol("?TYPE")), list(makeConstSym(("intervalSize")), makeSymbol("?INTERVAL"), makeSymbol("?INTERVAL-SIZE")),
                        list(makeConstSym(("greaterThan")), makeSymbol("?INTERVAL-SIZE"), makeSymbol("?SIZE")), list(makeConstSym(("keRelevantPrecisionValueForSlotOnType")), makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE"))),
                list(makeConstSym(("keUselessPrecisionValueForSlotOnTerm")), makeSymbol("?SLOT"), makeSymbol("?TERM"), makeSymbol("?INTERVAL")));
        $CODE = makeKeyword("CODE");
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $list3 = list(list(list(makeSymbol("?TERM"), makeSymbol("?INTERVAL")), list(makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE"), makeSymbol("?INTERVAL-SIZE")), list(makeSymbol("?TYPE"), makeSymbol("?SIZE"), makeSymbol("?INTERVAL-SIZE"))),
                list(NIL, list(list(makeConstSym(("isa")), makeSymbol("?TERM"), makeSymbol("?TYPE")), list(makeConstSym(("intervalSize")), makeSymbol("?INTERVAL"), makeSymbol("?INTERVAL-SIZE")), list(makeConstSym(("greaterThan")), makeSymbol("?INTERVAL-SIZE"), makeSymbol("?SIZE")),
                        list(makeConstSym(("keRelevantPrecisionValueForSlotOnType")), makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE")))));
        $list4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $RETURN = makeKeyword("RETURN");
        $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
        $list11 = list(makeConstSym(("keUselessPrecisionValueForSlotOnTerm")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")));
        $sym12$INTERVAL = makeSymbol("INTERVAL");
        $sym13$TERM = makeSymbol("TERM");
        $$keUselessPrecisionValueForSlotOnT = makeConstSym(("keUselessPrecisionValueForSlotOnTerm"));
        $list15 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));
        $REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION = makeKeyword("REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION");
        $list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("keUselessPrecisionValueForSlotOnTerm")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("keUselessPrecisionValueForSlotOnTerm")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$keUselessPrecisionValueForSlotOnTerm <whatever> <fully-bound> <fully-bound>)\n    using relevant precision information from the KB."), makeKeyword("EXAMPLE"),
                makeString("(#$keUselessPrecisionValueForSlotOnTerm #$age #$Muffet (#$YearsDuration 1 19))") });
    }
}
/*
 *
 * Total time: 90 ms
 *
 */