package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
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

public final class removal_modules_distance_between extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between";
    public static final String myFingerPrint = "2f28d53345ccbaa8518c715d8c9ac42368d38b4ba478b7d8b8b8d0898ac8aac9";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 899L)
    private static SubLSymbol $distance_between_great_circle_rule_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 1865L)
    private static SubLSymbol $distance_between_great_circle_rule_antecedent_template$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$CODE;
    private static final SubLObject $const2$GeographyMt;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$PROBLEM_STORE;
    private static final SubLSymbol $kw6$CONTINUABLE_;
    private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_;
    private static final SubLSymbol $kw9$RETURN;
    private static final SubLSymbol $kw10$BINDINGS_AND_SUPPORTS;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$LOC2;
    private static final SubLSymbol $sym13$LOC1;
    private static final SubLObject $const14$distanceBetween;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$DISTANCE_BETWEEN_POS;
    private static final SubLList $list19;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 1705L)
    public static SubLObject make_distance_between_great_circle_rule_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_distance_between.$kw1$CODE, removal_modules_distance_between.$distance_between_great_circle_rule_formula$.getGlobalValue(), removal_modules_distance_between.$const2$GeographyMt, (SubLObject)removal_modules_distance_between.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 2753L)
    public static SubLObject distance_between_great_circle_rule_antecedent_dnf(final SubLObject loc1, final SubLObject loc2) {
        final SubLObject rule_antecedent_info = removal_modules_distance_between.$distance_between_great_circle_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = (SubLObject)ConsesLow.list(loc1, loc2);
        SubLObject current;
        final SubLObject datum = current = rule_antecedent_info;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_distance_between.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = (SubLObject)removal_modules_distance_between.NIL;
        SubLObject output_el_vars = (SubLObject)removal_modules_distance_between.NIL;
        SubLObject scoped_el_vars = (SubLObject)removal_modules_distance_between.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_distance_between.$list4);
        input_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_distance_between.$list4);
        output_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_distance_between.$list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (removal_modules_distance_between.NIL == current) {
            current = temp;
            SubLObject el_dnf_template = (SubLObject)removal_modules_distance_between.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_distance_between.$list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (removal_modules_distance_between.NIL == current) {
                final SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                final SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                final SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                final SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return Values.values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_distance_between.$list4);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_distance_between.$list4);
        }
        return (SubLObject)removal_modules_distance_between.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 3541L)
    public static SubLObject removal_distance_between_great_circle_antecedent_answers(final SubLObject loc1, final SubLObject loc2, SubLObject mt) {
        if (mt == removal_modules_distance_between.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = distance_between_great_circle_rule_antecedent_dnf(loc1, loc2);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_distance_between.$kw5$PROBLEM_STORE, problem_store, removal_modules_distance_between.$kw6$CONTINUABLE_, removal_modules_distance_between.NIL, removal_modules_distance_between.$kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, removal_modules_distance_between.T, removal_modules_distance_between.$kw8$TRANSFORMATION_ALLOWED_, removal_modules_distance_between.NIL, removal_modules_distance_between.$kw9$RETURN, removal_modules_distance_between.$kw10$BINDINGS_AND_SUPPORTS }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 4253L)
    public static SubLObject removal_distance_between_great_circle_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_distance_between.UNPROVIDED) {
            sense = (SubLObject)removal_modules_distance_between.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = (SubLObject)removal_modules_distance_between.$list11;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_distance_between.NIL != success) {
            final SubLObject loc2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_distance_between.$sym12$LOC2, (SubLObject)removal_modules_distance_between.UNPROVIDED, (SubLObject)removal_modules_distance_between.UNPROVIDED);
            final SubLObject loc3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_distance_between.$sym13$LOC1, (SubLObject)removal_modules_distance_between.UNPROVIDED, (SubLObject)removal_modules_distance_between.UNPROVIDED);
            final SubLObject antecedent_answers = removal_distance_between_great_circle_antecedent_answers(loc3, loc2, (SubLObject)removal_modules_distance_between.UNPROVIDED);
            if (removal_modules_distance_between.NIL != antecedent_answers) {
                final SubLObject output_template = (SubLObject)ConsesLow.list(removal_modules_distance_between.$const14$distanceBetween, loc3, loc2, variables.find_variable_by_id((SubLObject)removal_modules_distance_between.ZERO_INTEGER));
                final SubLObject rule_support = make_distance_between_great_circle_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = (SubLObject)removal_modules_distance_between.NIL;
                antecedent_answer = cdolist_list_var.first();
                while (removal_modules_distance_between.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = (SubLObject)removal_modules_distance_between.NIL;
                    SubLObject antecedent_supports = (SubLObject)removal_modules_distance_between.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_distance_between.$list15);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_distance_between.$list15);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (removal_modules_distance_between.NIL == current) {
                        final SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, (SubLObject)removal_modules_distance_between.T, (SubLObject)removal_modules_distance_between.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_distance_between.NIL != v_bindings_$1) {
                            backward.removal_add_node(rule_support, v_bindings_$1, ConsesLow.append(antecedent_supports, unify_justification));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_distance_between.$list15);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_distance_between.NIL;
    }
    
    public static SubLObject declare_removal_modules_distance_between_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between", "make_distance_between_great_circle_rule_support", "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between", "distance_between_great_circle_rule_antecedent_dnf", "DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between", "removal_distance_between_great_circle_antecedent_answers", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-ANTECEDENT-ANSWERS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between", "removal_distance_between_great_circle_pos_expand", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_distance_between.NIL;
    }
    
    public static SubLObject init_removal_modules_distance_between_file() {
        removal_modules_distance_between.$distance_between_great_circle_rule_formula$ = SubLFiles.deflexical("*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-FORMULA*", (SubLObject)removal_modules_distance_between.$list0);
        removal_modules_distance_between.$distance_between_great_circle_rule_antecedent_template$ = SubLFiles.deflexical("*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-TEMPLATE*", (SubLObject)removal_modules_distance_between.$list3);
        return (SubLObject)removal_modules_distance_between.NIL;
    }
    
    public static SubLObject setup_removal_modules_distance_between_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_distance_between.$kw16$REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS, (SubLObject)removal_modules_distance_between.$list17);
        preference_modules.inference_preference_module((SubLObject)removal_modules_distance_between.$kw18$DISTANCE_BETWEEN_POS, (SubLObject)removal_modules_distance_between.$list19);
        return (SubLObject)removal_modules_distance_between.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_distance_between_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_distance_between_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_distance_between_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_distance_between();
        removal_modules_distance_between.$distance_between_great_circle_rule_formula$ = null;
        removal_modules_distance_between.$distance_between_great_circle_rule_antecedent_template$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC1"), (SubLObject)SubLObjectFactory.makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC1"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC2"), (SubLObject)SubLObjectFactory.makeSymbol("?LAT2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC2"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TIMESFN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PerFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mile")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Radian"))), (SubLObject)SubLObjectFactory.makeDouble(3980.91)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArcCosineFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SineFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SineFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT2"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CosineFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CosineFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CosineFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LONG2"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG1"))))))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distanceBetween")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC1"), (SubLObject)SubLObjectFactory.makeSymbol("?LOC2"), (SubLObject)SubLObjectFactory.makeSymbol("?TIMESFN")));
        $kw1$CODE = SubLObjectFactory.makeKeyword("CODE");
        $const2$GeographyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographyMt"));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LOC1"), (SubLObject)SubLObjectFactory.makeSymbol("?LOC2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TIMESFN"), (SubLObject)SubLObjectFactory.makeSymbol("?LAT1"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG1"), (SubLObject)SubLObjectFactory.makeSymbol("?LAT2"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LAT1"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG1"), (SubLObject)SubLObjectFactory.makeSymbol("?LAT2"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG2"))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_distance_between.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC1"), (SubLObject)SubLObjectFactory.makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC1"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC2"), (SubLObject)SubLObjectFactory.makeSymbol("?LAT2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)SubLObjectFactory.makeSymbol("?LOC2"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TIMESFN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PerFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mile")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Radian"))), (SubLObject)SubLObjectFactory.makeDouble(3980.91)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArcCosineFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SineFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SineFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT2"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CosineFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CosineFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CosineFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LONG2"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG1")))))))))));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-EL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-EL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPED-EL-VARS")), (SubLObject)SubLObjectFactory.makeSymbol("EL-DNF-TEMPLATE"));
        $kw5$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw6$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $kw8$TRANSFORMATION_ALLOWED_ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $kw9$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw10$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distanceBetween")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LOC1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LOC2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym12$LOC2 = SubLObjectFactory.makeSymbol("LOC2");
        $sym13$LOC1 = SubLObjectFactory.makeSymbol("LOC1");
        $const14$distanceBetween = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distanceBetween"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-SUPPORTS"));
        $kw16$REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS = SubLObjectFactory.makeKeyword("REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distanceBetween")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distanceBetween")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_distance_between.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$distanceBetween <fully-bound> <fully-bound> <whatever>)\n    by computing the Great Circle distance using \n    #$latitude and #$longitude information about ARG1 and ARG2"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$distanceBetween #$CityOfAnchorageAK #$CityOfSanFranciscoCA ?DIST)") });
        $kw18$DISTANCE_BETWEEN_POS = SubLObjectFactory.makeKeyword("DISTANCE-BETWEEN-POS");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distanceBetween")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distanceBetween")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"));
    }
}

/*

	Total time: 102 ms
	
*/