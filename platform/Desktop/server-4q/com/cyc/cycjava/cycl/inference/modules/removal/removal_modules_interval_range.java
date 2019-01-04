package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_interval_range extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range";
    public static final String myFingerPrint = "27149929ea9e4ef6b4555a4a195c17d1af326bb07ffb22177df1b7663afdbb1c";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 845L)
    private static SubLSymbol $interval_range_binary_uom_nat_rule_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 1481L)
    private static SubLSymbol $interval_range_binary_uom_nat_rule_antecedent_template$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$CODE;
    private static final SubLObject $const2$UniversalVocabularyMt;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$PROBLEM_STORE;
    private static final SubLSymbol $kw6$CONTINUABLE_;
    private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_;
    private static final SubLSymbol $kw9$RETURN;
    private static final SubLSymbol $kw10$BINDINGS_AND_SUPPORTS;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$BINARY_UOM_NAT;
    private static final SubLObject $const13$intervalRange;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$REMOVAL_INTERVAL_RANGE_BINARY_UOM_NAT_POS;
    private static final SubLList $list16;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 1311L)
    public static SubLObject make_interval_range_binary_uom_nat_rule_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_interval_range.$kw1$CODE, removal_modules_interval_range.$interval_range_binary_uom_nat_rule_formula$.getGlobalValue(), removal_modules_interval_range.$const2$UniversalVocabularyMt, (SubLObject)removal_modules_interval_range.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 1863L)
    public static SubLObject interval_range_binary_uom_nat_rule_antecedent_dnf(final SubLObject binary_uom_nat) {
        final SubLObject rule_antecedent_info = removal_modules_interval_range.$interval_range_binary_uom_nat_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = (SubLObject)ConsesLow.list(binary_uom_nat);
        SubLObject current;
        final SubLObject datum = current = rule_antecedent_info;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_interval_range.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = (SubLObject)removal_modules_interval_range.NIL;
        SubLObject output_el_vars = (SubLObject)removal_modules_interval_range.NIL;
        SubLObject scoped_el_vars = (SubLObject)removal_modules_interval_range.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_interval_range.$list4);
        input_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_interval_range.$list4);
        output_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_interval_range.$list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (removal_modules_interval_range.NIL == current) {
            current = temp;
            SubLObject el_dnf_template = (SubLObject)removal_modules_interval_range.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_interval_range.$list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (removal_modules_interval_range.NIL == current) {
                final SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                final SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                final SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                final SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return Values.values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_interval_range.$list4);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_interval_range.$list4);
        }
        return (SubLObject)removal_modules_interval_range.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 2642L)
    public static SubLObject removal_interval_range_binary_uom_nat_antecedent_answers(final SubLObject binary_uom_nat, SubLObject mt) {
        if (mt == removal_modules_interval_range.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = interval_range_binary_uom_nat_rule_antecedent_dnf(binary_uom_nat);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_interval_range.$kw5$PROBLEM_STORE, problem_store, removal_modules_interval_range.$kw6$CONTINUABLE_, removal_modules_interval_range.NIL, removal_modules_interval_range.$kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, removal_modules_interval_range.T, removal_modules_interval_range.$kw8$TRANSFORMATION_ALLOWED_, removal_modules_interval_range.NIL, removal_modules_interval_range.$kw9$RETURN, removal_modules_interval_range.$kw10$BINDINGS_AND_SUPPORTS }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-interval-range.lisp", position = 3303L)
    public static SubLObject removal_interval_range_binary_uom_nat_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_interval_range.UNPROVIDED) {
            sense = (SubLObject)removal_modules_interval_range.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = (SubLObject)removal_modules_interval_range.$list11;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_interval_range.NIL != success) {
            final SubLObject binary_uom_nat = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_interval_range.$sym12$BINARY_UOM_NAT, (SubLObject)removal_modules_interval_range.UNPROVIDED, (SubLObject)removal_modules_interval_range.UNPROVIDED);
            final SubLObject antecedent_answers = removal_interval_range_binary_uom_nat_antecedent_answers(binary_uom_nat, (SubLObject)removal_modules_interval_range.UNPROVIDED);
            if (removal_modules_interval_range.NIL != antecedent_answers) {
                final SubLObject output_template = (SubLObject)ConsesLow.list(removal_modules_interval_range.$const13$intervalRange, binary_uom_nat, (SubLObject)ConsesLow.list(variables.find_variable_by_id((SubLObject)removal_modules_interval_range.ZERO_INTEGER), variables.find_variable_by_id((SubLObject)removal_modules_interval_range.ONE_INTEGER)), (SubLObject)ConsesLow.list(variables.find_variable_by_id((SubLObject)removal_modules_interval_range.ZERO_INTEGER), variables.find_variable_by_id((SubLObject)removal_modules_interval_range.TWO_INTEGER)));
                final SubLObject rule_support = make_interval_range_binary_uom_nat_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = (SubLObject)removal_modules_interval_range.NIL;
                antecedent_answer = cdolist_list_var.first();
                while (removal_modules_interval_range.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = (SubLObject)removal_modules_interval_range.NIL;
                    SubLObject antecedent_supports = (SubLObject)removal_modules_interval_range.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_interval_range.$list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_interval_range.$list14);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (removal_modules_interval_range.NIL == current) {
                        final SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, (SubLObject)removal_modules_interval_range.T, (SubLObject)removal_modules_interval_range.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_interval_range.NIL != v_bindings_$1) {
                            backward.removal_add_node(rule_support, v_bindings_$1, ConsesLow.append(antecedent_supports, unify_justification));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_interval_range.$list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_interval_range.NIL;
    }
    
    public static SubLObject declare_removal_modules_interval_range_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range", "make_interval_range_binary_uom_nat_rule_support", "MAKE-INTERVAL-RANGE-BINARY-UOM-NAT-RULE-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range", "interval_range_binary_uom_nat_rule_antecedent_dnf", "INTERVAL-RANGE-BINARY-UOM-NAT-RULE-ANTECEDENT-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range", "removal_interval_range_binary_uom_nat_antecedent_answers", "REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-ANTECEDENT-ANSWERS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range", "removal_interval_range_binary_uom_nat_pos_expand", "REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_interval_range.NIL;
    }
    
    public static SubLObject init_removal_modules_interval_range_file() {
        removal_modules_interval_range.$interval_range_binary_uom_nat_rule_formula$ = SubLFiles.deflexical("*INTERVAL-RANGE-BINARY-UOM-NAT-RULE-FORMULA*", (SubLObject)removal_modules_interval_range.$list0);
        removal_modules_interval_range.$interval_range_binary_uom_nat_rule_antecedent_template$ = SubLFiles.deflexical("*INTERVAL-RANGE-BINARY-UOM-NAT-RULE-ANTECEDENT-TEMPLATE*", (SubLObject)removal_modules_interval_range.$list3);
        return (SubLObject)removal_modules_interval_range.NIL;
    }
    
    public static SubLObject setup_removal_modules_interval_range_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_interval_range.$kw15$REMOVAL_INTERVAL_RANGE_BINARY_UOM_NAT_POS, (SubLObject)removal_modules_interval_range.$list16);
        return (SubLObject)removal_modules_interval_range.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_interval_range_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_interval_range_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_interval_range_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_interval_range();
        removal_modules_interval_range.$interval_range_binary_uom_nat_rule_formula$ = null;
        removal_modules_interval_range.$interval_range_binary_uom_nat_rule_antecedent_template$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operatorFormulas")), (SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?MIN-VALUE"), (SubLObject)removal_modules_interval_range.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?MAX-VALUE"), (SubLObject)removal_modules_interval_range.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intervalRange")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?MIN-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?MAX-VALUE"))));
        $kw1$CODE = SubLObjectFactory.makeKeyword("CODE");
        $const2$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?MIN-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("?MAX-VALUE")), (SubLObject)removal_modules_interval_range.NIL), (SubLObject)ConsesLow.list((SubLObject)removal_modules_interval_range.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operatorFormulas")), (SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?MIN-VALUE"), (SubLObject)removal_modules_interval_range.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?MAX-VALUE"), (SubLObject)removal_modules_interval_range.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT")))));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-EL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-EL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPED-EL-VARS")), (SubLObject)SubLObjectFactory.makeSymbol("EL-DNF-TEMPLATE"));
        $kw5$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw6$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $kw8$TRANSFORMATION_ALLOWED_ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $kw9$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw10$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intervalRange")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINARY-UOM-NAT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym12$BINARY_UOM_NAT = SubLObjectFactory.makeSymbol("BINARY-UOM-NAT");
        $const13$intervalRange = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intervalRange"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-SUPPORTS"));
        $kw15$REMOVAL_INTERVAL_RANGE_BINARY_UOM_NAT_POS = SubLObjectFactory.makeKeyword("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS");
        $list16 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intervalRange")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intervalRange")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_interval_range.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$intervalRange <fully-bound> <whatever> <whatever>)\n    using min and max values from the arg1."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$intervalRange (#$YearsDuration 1 19) ?LOW ?HIGH)") });
    }
}

/*

	Total time: 38 ms
	
*/