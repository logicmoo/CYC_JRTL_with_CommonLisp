package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_kappa extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa";
    public static final String myFingerPrint = "702d667b7e8dc79777041fdc0fdec92c35fd8f52e36327441e10d9db405d554b";
    private static final SubLSymbol $kw0$REMOVAL_KAPPA;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$REMOVAL_KAPPA_POS;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$POS;
    private static final SubLSymbol $kw5$INCOMPLETE;
    private static final SubLSymbol $kw6$GROSSLY_DISPREFERRED;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$MAKE_VARIABLE_BINDING;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 1359L)
    public static SubLObject removal_kappa_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_kappa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_kappa.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression_query = kappa_expression_query(asent);
        SubLObject cost = (removal_modules_kappa.NIL != el_utilities.atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_cost(expression_query, (SubLObject)removal_modules_kappa.$kw4$POS, (SubLObject)removal_modules_kappa.UNPROVIDED, (SubLObject)removal_modules_kappa.UNPROVIDED) : control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
        if (!cost.isZero()) {
            cost = Numbers.add(cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 1739L)
    public static SubLObject removal_kappa_pos_gaf_completeness(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_kappa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_kappa.NIL;
        }
        final SubLObject expression_query = kappa_expression_query(asent);
        final SubLObject completeness = (SubLObject)((removal_modules_kappa.NIL != el_utilities.atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_completeness(expression_query, (SubLObject)removal_modules_kappa.$kw4$POS, (SubLObject)removal_modules_kappa.UNPROVIDED) : removal_modules_kappa.$kw5$INCOMPLETE);
        return completeness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2055L)
    public static SubLObject removal_kappa_pos_gaf_preference_level(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject expression_query = kappa_expression_query(asent);
        final SubLObject preference_level = (SubLObject)((removal_modules_kappa.NIL != el_utilities.atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_preference_level(expression_query, (SubLObject)removal_modules_kappa.$kw4$POS, bindable_vars, (SubLObject)removal_modules_kappa.UNPROVIDED, (SubLObject)removal_modules_kappa.UNPROVIDED) : removal_modules_kappa.$kw6$GROSSLY_DISPREFERRED);
        return preference_level;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2433L)
    public static SubLObject removal_kappa_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject regular_query = kappa_expression_query(asent);
        final SubLObject variable_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = ask_utilities.kappa_tuples_justified(variable_bindings, regular_query, inference_worker.mt_of_currently_executing_tactic(), (SubLObject)removal_modules_kappa.UNPROVIDED);
        SubLObject bindings_and_supports = (SubLObject)removal_modules_kappa.NIL;
        bindings_and_supports = cdolist_list_var.first();
        while (removal_modules_kappa.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_and_supports;
            SubLObject v_bindings = (SubLObject)removal_modules_kappa.NIL;
            SubLObject supports = (SubLObject)removal_modules_kappa.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_kappa.$list7);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_kappa.$list7);
            supports = current.first();
            current = current.rest();
            if (removal_modules_kappa.NIL == current) {
                backward.removal_add_node(supports.first(), bindings.apply_bindings(variable_bindings, v_bindings), supports.rest());
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_kappa.$list7);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_and_supports = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_kappa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2915L)
    public static SubLObject kappa_expression_query(final SubLObject asent) {
        final SubLObject kappa_expression = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject formal_args = el_utilities.kappa_predicate_formal_args(kappa_expression);
        final SubLObject kappa_query = el_utilities.kappa_predicate_query(kappa_expression);
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_kappa.UNPROVIDED);
        final SubLObject formal_argument_bindings = Mapping.mapcar(Symbols.symbol_function((SubLObject)removal_modules_kappa.$sym8$MAKE_VARIABLE_BINDING), formal_args, new SubLObject[] { args });
        final SubLObject regular_query = bindings.apply_bindings(formal_argument_bindings, kappa_query);
        final SubLObject variable_bindings = remove_bindings_to_ground_terms(formal_argument_bindings);
        return Values.values(regular_query, variable_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 3472L)
    public static SubLObject remove_bindings_to_ground_terms(final SubLObject v_bindings) {
        SubLObject result = (SubLObject)removal_modules_kappa.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)removal_modules_kappa.NIL;
        binding = cdolist_list_var.first();
        while (removal_modules_kappa.NIL != cdolist_list_var) {
            if (removal_modules_kappa.NIL == el_utilities.groundP(bindings.variable_binding_value(binding), (SubLObject)removal_modules_kappa.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(binding, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return result;
    }
    
    public static SubLObject declare_removal_modules_kappa_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa", "removal_kappa_pos_gaf_cost", "REMOVAL-KAPPA-POS-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa", "removal_kappa_pos_gaf_completeness", "REMOVAL-KAPPA-POS-GAF-COMPLETENESS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa", "removal_kappa_pos_gaf_preference_level", "REMOVAL-KAPPA-POS-GAF-PREFERENCE-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa", "removal_kappa_expand", "REMOVAL-KAPPA-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa", "kappa_expression_query", "KAPPA-EXPRESSION-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa", "remove_bindings_to_ground_terms", "REMOVE-BINDINGS-TO-GROUND-TERMS", 1, 0, false);
        return (SubLObject)removal_modules_kappa.NIL;
    }
    
    public static SubLObject init_removal_modules_kappa_file() {
        return (SubLObject)removal_modules_kappa.NIL;
    }
    
    public static SubLObject setup_removal_modules_kappa_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_kappa.$kw0$REMOVAL_KAPPA, (SubLObject)removal_modules_kappa.$list1);
        preference_modules.inference_preference_module((SubLObject)removal_modules_kappa.$kw2$REMOVAL_KAPPA_POS, (SubLObject)removal_modules_kappa.$list3);
        return (SubLObject)removal_modules_kappa.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_kappa_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_kappa_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_kappa_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_kappa();
        $kw0$REMOVAL_KAPPA = SubLObjectFactory.makeKeyword("REMOVAL-KAPPA");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("KAPPA-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-KAPPA-POS-GAF-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-KAPPA-POS-GAF-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-KAPPA-EXPAND"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), SubLObjectFactory.makeKeyword("ALL"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("((#$Kappa <formal-args> <sentence>) <args>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("((#$Kappa (?X ?Y) (#$isa ?X ?Y)) #$Guyren ?WHAT)") });
        $kw2$REMOVAL_KAPPA_POS = SubLObjectFactory.makeKeyword("REMOVAL-KAPPA-POS");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("KAPPA-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-KAPPA-POS-GAF-PREFERENCE-LEVEL"));
        $kw4$POS = SubLObjectFactory.makeKeyword("POS");
        $kw5$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw6$GROSSLY_DISPREFERRED = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym8$MAKE_VARIABLE_BINDING = SubLObjectFactory.makeSymbol("MAKE-VARIABLE-BINDING");
    }
}

/*

	Total time: 79 ms
	
*/