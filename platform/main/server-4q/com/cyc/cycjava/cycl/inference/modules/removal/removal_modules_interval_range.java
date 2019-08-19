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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
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

public class removal_modules_interval_range extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range";
    public static String myFingerPrint = "27149929ea9e4ef6b4555a4a195c17d1af326bb07ffb22177df1b7663afdbb1c";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 800L)
    private static SubLSymbol $interval_range_binary_uom_nat_rule_formula$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 1400L)
    private static SubLSymbol $interval_range_binary_uom_nat_rule_antecedent_template$;
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
    private static SubLSymbol $sym12$BINARY_UOM_NAT;
    private static SubLObject $$intervalRange;
    private static SubLList $list14;
    private static SubLSymbol $REMOVAL_INTERVAL_RANGE_BINARY_UOM_NAT_POS;
    private static SubLList $list16;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 1300L)
    public static SubLObject make_interval_range_binary_uom_nat_rule_support() {
        return arguments.make_hl_support($CODE, $interval_range_binary_uom_nat_rule_formula$.getGlobalValue(), $$UniversalVocabularyMt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 1800L)
    public static SubLObject interval_range_binary_uom_nat_rule_antecedent_dnf(SubLObject binary_uom_nat) {
        SubLObject rule_antecedent_info = $interval_range_binary_uom_nat_rule_antecedent_template$.getGlobalValue();
        SubLObject input_values = list(binary_uom_nat);
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 2600L)
    public static SubLObject removal_interval_range_binary_uom_nat_antecedent_answers(SubLObject binary_uom_nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        SubLObject rule_antecedent_dnf = interval_range_binary_uom_nat_rule_antecedent_dnf(binary_uom_nat);
        SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[] { $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 3300L)
    public static SubLObject removal_interval_range_binary_uom_nat_pos_expand(SubLObject asent, SubLObject sense) {
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
            SubLObject binary_uom_nat = list_utilities.alist_lookup_without_values(v_bindings, $sym12$BINARY_UOM_NAT, UNPROVIDED, UNPROVIDED);
            SubLObject antecedent_answers = removal_interval_range_binary_uom_nat_antecedent_answers(binary_uom_nat, UNPROVIDED);
            if (NIL != antecedent_answers) {
                SubLObject output_template = list($$intervalRange, binary_uom_nat, list(variables.find_variable_by_id(ZERO_INTEGER), variables.find_variable_by_id(ONE_INTEGER)), list(variables.find_variable_by_id(ZERO_INTEGER), variables.find_variable_by_id(TWO_INTEGER)));
                SubLObject rule_support = make_interval_range_binary_uom_nat_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = NIL;
                antecedent_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = NIL;
                    SubLObject antecedent_supports = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
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
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_interval_range_file() {
        declareFunction(myName, "make_interval_range_binary_uom_nat_rule_support", "MAKE-INTERVAL-RANGE-BINARY-UOM-NAT-RULE-SUPPORT", 0, 0, false);
        declareFunction(myName, "interval_range_binary_uom_nat_rule_antecedent_dnf", "INTERVAL-RANGE-BINARY-UOM-NAT-RULE-ANTECEDENT-DNF", 1, 0, false);
        declareFunction(myName, "removal_interval_range_binary_uom_nat_antecedent_answers", "REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-ANTECEDENT-ANSWERS", 1, 1, false);
        declareFunction(myName, "removal_interval_range_binary_uom_nat_pos_expand", "REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_interval_range_file() {
        $interval_range_binary_uom_nat_rule_formula$ = SubLFiles.deflexical("*INTERVAL-RANGE-BINARY-UOM-NAT-RULE-FORMULA*", $list0);
        $interval_range_binary_uom_nat_rule_antecedent_template$ = SubLFiles.deflexical("*INTERVAL-RANGE-BINARY-UOM-NAT-RULE-ANTECEDENT-TEMPLATE*", $list3);
        return NIL;
    }

    public static SubLObject setup_removal_modules_interval_range_file() {
        inference_modules.inference_removal_module($REMOVAL_INTERVAL_RANGE_BINARY_UOM_NAT_POS, $list16);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_interval_range_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_interval_range_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_interval_range_file();
    }

    static {
        me = new removal_modules_interval_range();
        $interval_range_binary_uom_nat_rule_formula$ = null;
        $interval_range_binary_uom_nat_rule_antecedent_template$ = null;
        $list0 = list(
                makeConstSym(("implies")), list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?UNIT"), makeConstSym(("UnitOfMeasure"))), list(makeConstSym(("operatorFormulas")), makeSymbol("?UNIT"), makeSymbol("?NAT")),
                        list(makeConstSym(("argN")), makeSymbol("?MIN-VALUE"), ONE_INTEGER, makeSymbol("?NAT")), list(makeConstSym(("argN")), makeSymbol("?MAX-VALUE"), TWO_INTEGER, makeSymbol("?NAT"))),
                list(makeConstSym(("intervalRange")), makeSymbol("?NAT"), list(makeSymbol("?UNIT"), makeSymbol("?MIN-VALUE")), list(makeSymbol("?UNIT"), makeSymbol("?MAX-VALUE"))));
        $CODE = makeKeyword("CODE");
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $list3 = ConsesLow.list(list(list(makeSymbol("?NAT")), list(makeSymbol("?UNIT"), makeSymbol("?MIN-VALUE"), makeSymbol("?MAX-VALUE")), NIL), list(NIL, list(list(makeConstSym(("isa")), makeSymbol("?UNIT"), makeConstSym(("UnitOfMeasure"))),
                list(makeConstSym(("operatorFormulas")), makeSymbol("?UNIT"), makeSymbol("?NAT")), list(makeConstSym(("argN")), makeSymbol("?MIN-VALUE"), ONE_INTEGER, makeSymbol("?NAT")), list(makeConstSym(("argN")), makeSymbol("?MAX-VALUE"), TWO_INTEGER, makeSymbol("?NAT")))));
        $list4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $RETURN = makeKeyword("RETURN");
        $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
        $list11 = list(makeConstSym(("intervalRange")), list(makeKeyword("BIND"), makeSymbol("BINARY-UOM-NAT")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));
        $sym12$BINARY_UOM_NAT = makeSymbol("BINARY-UOM-NAT");
        $$intervalRange = makeConstSym(("intervalRange"));
        $list14 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));
        $REMOVAL_INTERVAL_RANGE_BINARY_UOM_NAT_POS = makeKeyword("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS");
        $list16 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("intervalRange")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("intervalRange")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$intervalRange <fully-bound> <whatever> <whatever>)\n    using min and max values from the arg1."), makeKeyword("EXAMPLE"), makeString("(#$intervalRange (#$YearsDuration 1 19) ?LOW ?HIGH)") });
    }
}
/*
 *
 * Total time: 38 ms
 *
 */