package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class removal_modules_ke_useless_precision_value extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value";
    public static final String myFingerPrint = "7dc7993fea930a9b42f6f392294bd07b437b2889664906070ba1602557ff54a3";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 879L)
    private static SubLSymbol $useless_precision_from_relevant_precision_rule_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 1590L)
    private static SubLSymbol $useless_precision_from_relevant_precision_rule_antecedent_template$;
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
    private static final SubLSymbol $sym12$INTERVAL;
    private static final SubLSymbol $sym13$TERM;
    private static final SubLObject $const14$keUselessPrecisionValueForSlotOnT;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION;
    private static final SubLList $list17;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 1396L)
    public static SubLObject make_useless_precision_from_relevant_precision_rule_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_ke_useless_precision_value.$kw1$CODE, removal_modules_ke_useless_precision_value.$useless_precision_from_relevant_precision_rule_formula$.getGlobalValue(), removal_modules_ke_useless_precision_value.$const2$UniversalVocabularyMt, (SubLObject)removal_modules_ke_useless_precision_value.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 2069L)
    public static SubLObject useless_precision_from_relevant_precision_rule_antecedent_dnf(final SubLObject v_term, final SubLObject interval) {
        final SubLObject rule_antecedent_info = removal_modules_ke_useless_precision_value.$useless_precision_from_relevant_precision_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = (SubLObject)ConsesLow.list(v_term, interval);
        SubLObject current;
        final SubLObject datum = current = rule_antecedent_info;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ke_useless_precision_value.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = (SubLObject)removal_modules_ke_useless_precision_value.NIL;
        SubLObject output_el_vars = (SubLObject)removal_modules_ke_useless_precision_value.NIL;
        SubLObject scoped_el_vars = (SubLObject)removal_modules_ke_useless_precision_value.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ke_useless_precision_value.$list4);
        input_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ke_useless_precision_value.$list4);
        output_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ke_useless_precision_value.$list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (removal_modules_ke_useless_precision_value.NIL == current) {
            current = temp;
            SubLObject el_dnf_template = (SubLObject)removal_modules_ke_useless_precision_value.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ke_useless_precision_value.$list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (removal_modules_ke_useless_precision_value.NIL == current) {
                final SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                final SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                final SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                final SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return Values.values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_ke_useless_precision_value.$list4);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_ke_useless_precision_value.$list4);
        }
        return (SubLObject)removal_modules_ke_useless_precision_value.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 2891L)
    public static SubLObject removal_useless_precision_from_relevant_precision_antecedent_answers(final SubLObject v_term, final SubLObject interval, SubLObject mt) {
        if (mt == removal_modules_ke_useless_precision_value.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = useless_precision_from_relevant_precision_rule_antecedent_dnf(v_term, interval);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_ke_useless_precision_value.$kw5$PROBLEM_STORE, problem_store, removal_modules_ke_useless_precision_value.$kw6$CONTINUABLE_, removal_modules_ke_useless_precision_value.NIL, removal_modules_ke_useless_precision_value.$kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, removal_modules_ke_useless_precision_value.T, removal_modules_ke_useless_precision_value.$kw8$TRANSFORMATION_ALLOWED_, removal_modules_ke_useless_precision_value.NIL, removal_modules_ke_useless_precision_value.$kw9$RETURN, removal_modules_ke_useless_precision_value.$kw10$BINDINGS_AND_SUPPORTS }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 3595L)
    public static SubLObject removal_useless_precision_from_relevant_precision_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_ke_useless_precision_value.UNPROVIDED) {
            sense = (SubLObject)removal_modules_ke_useless_precision_value.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = (SubLObject)removal_modules_ke_useless_precision_value.$list11;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_ke_useless_precision_value.NIL != success) {
            final SubLObject interval = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_ke_useless_precision_value.$sym12$INTERVAL, (SubLObject)removal_modules_ke_useless_precision_value.UNPROVIDED, (SubLObject)removal_modules_ke_useless_precision_value.UNPROVIDED);
            final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_ke_useless_precision_value.$sym13$TERM, (SubLObject)removal_modules_ke_useless_precision_value.UNPROVIDED, (SubLObject)removal_modules_ke_useless_precision_value.UNPROVIDED);
            final SubLObject antecedent_answers = removal_useless_precision_from_relevant_precision_antecedent_answers(v_term, interval, (SubLObject)removal_modules_ke_useless_precision_value.UNPROVIDED);
            if (removal_modules_ke_useless_precision_value.NIL != antecedent_answers) {
                final SubLObject output_template = (SubLObject)ConsesLow.list(removal_modules_ke_useless_precision_value.$const14$keUselessPrecisionValueForSlotOnT, variables.find_variable_by_id((SubLObject)removal_modules_ke_useless_precision_value.ZERO_INTEGER), v_term, interval);
                final SubLObject rule_support = make_useless_precision_from_relevant_precision_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = (SubLObject)removal_modules_ke_useless_precision_value.NIL;
                antecedent_answer = cdolist_list_var.first();
                while (removal_modules_ke_useless_precision_value.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = (SubLObject)removal_modules_ke_useless_precision_value.NIL;
                    SubLObject antecedent_supports = (SubLObject)removal_modules_ke_useless_precision_value.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ke_useless_precision_value.$list15);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_ke_useless_precision_value.$list15);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (removal_modules_ke_useless_precision_value.NIL == current) {
                        final SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, (SubLObject)removal_modules_ke_useless_precision_value.T, (SubLObject)removal_modules_ke_useless_precision_value.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_ke_useless_precision_value.NIL != v_bindings_$1) {
                            backward.removal_add_node(rule_support, v_bindings_$1, ConsesLow.append(antecedent_supports, unify_justification));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_ke_useless_precision_value.$list15);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_ke_useless_precision_value.NIL;
    }
    
    public static SubLObject declare_removal_modules_ke_useless_precision_value_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value", "make_useless_precision_from_relevant_precision_rule_support", "MAKE-USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value", "useless_precision_from_relevant_precision_rule_antecedent_dnf", "USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value", "removal_useless_precision_from_relevant_precision_antecedent_answers", "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-ANTECEDENT-ANSWERS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value", "removal_useless_precision_from_relevant_precision_pos_expand", "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_ke_useless_precision_value.NIL;
    }
    
    public static SubLObject init_removal_modules_ke_useless_precision_value_file() {
        removal_modules_ke_useless_precision_value.$useless_precision_from_relevant_precision_rule_formula$ = SubLFiles.deflexical("*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-FORMULA*", (SubLObject)removal_modules_ke_useless_precision_value.$list0);
        removal_modules_ke_useless_precision_value.$useless_precision_from_relevant_precision_rule_antecedent_template$ = SubLFiles.deflexical("*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-TEMPLATE*", (SubLObject)removal_modules_ke_useless_precision_value.$list3);
        return (SubLObject)removal_modules_ke_useless_precision_value.NIL;
    }
    
    public static SubLObject setup_removal_modules_ke_useless_precision_value_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_ke_useless_precision_value.$kw16$REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION, (SubLObject)removal_modules_ke_useless_precision_value.$list17);
        return (SubLObject)removal_modules_ke_useless_precision_value.NIL;
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
        me = (SubLFile)new removal_modules_ke_useless_precision_value();
        removal_modules_ke_useless_precision_value.$useless_precision_from_relevant_precision_rule_formula$ = null;
        removal_modules_ke_useless_precision_value.$useless_precision_from_relevant_precision_rule_antecedent_template$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intervalSize")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL-SIZE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("?SIZE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keRelevantPrecisionValueForSlotOnType")), (SubLObject)SubLObjectFactory.makeSymbol("?SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SIZE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keUselessPrecisionValueForSlotOnTerm")), (SubLObject)SubLObjectFactory.makeSymbol("?SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL")));
        $kw1$CODE = SubLObjectFactory.makeKeyword("CODE");
        $const2$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL-SIZE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL-SIZE"))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_ke_useless_precision_value.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intervalSize")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL-SIZE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("?SIZE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keRelevantPrecisionValueForSlotOnType")), (SubLObject)SubLObjectFactory.makeSymbol("?SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SIZE")))));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-EL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-EL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPED-EL-VARS")), (SubLObject)SubLObjectFactory.makeSymbol("EL-DNF-TEMPLATE"));
        $kw5$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw6$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $kw8$TRANSFORMATION_ALLOWED_ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $kw9$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw10$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keUselessPrecisionValueForSlotOnTerm")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")));
        $sym12$INTERVAL = SubLObjectFactory.makeSymbol("INTERVAL");
        $sym13$TERM = SubLObjectFactory.makeSymbol("TERM");
        $const14$keUselessPrecisionValueForSlotOnT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keUselessPrecisionValueForSlotOnTerm"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-SUPPORTS"));
        $kw16$REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION = SubLObjectFactory.makeKeyword("REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keUselessPrecisionValueForSlotOnTerm")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keUselessPrecisionValueForSlotOnTerm")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_ke_useless_precision_value.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$keUselessPrecisionValueForSlotOnTerm <whatever> <fully-bound> <fully-bound>)\n    using relevant precision information from the KB."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$keUselessPrecisionValueForSlotOnTerm #$age #$Muffet (#$YearsDuration 1 19))") });
    }
}

/*

	Total time: 90 ms
	
*/