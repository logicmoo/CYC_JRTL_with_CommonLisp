package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.equals;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_different extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different";
    public static final String myFingerPrint = "940d912db85fcdc5b293015df6787176ba74adcd43e808234a3c33edf87164f2";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 548L)
    private static SubLSymbol $default_different_duplicate_cost$;
    private static final SubLObject $const0$different;
    private static final SubLSymbol $kw1$REMOVAL_EVAL;
    private static final SubLSymbol $kw2$REMOVAL_NOT_EVAL;
    private static final SubLSymbol $kw3$POS;
    private static final SubLSymbol $kw4$REMOVAL_DIFFERENT_DUPLICATE;
    private static final SubLList $list5;
    private static final SubLObject $const6$differentSymbols;
    private static final SubLSymbol $kw7$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
    private static final SubLSymbol $kw8$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
    private static final SubLSymbol $kw9$REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_SKSI_DIFFERENT_POS;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$REMOVAL_SKSI_DIFFERENT_EXPAND;
    private static final SubLSymbol $sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND;
    private static final SubLSymbol $kw17$QUERY;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 670L)
    public static SubLObject asent_duplicate_args_p(final SubLObject asent) {
        return list_utilities.duplicatesP(cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_different.UNPROVIDED), Symbols.symbol_function((SubLObject)removal_modules_different.EQUAL), (SubLObject)removal_modules_different.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 778L)
    public static SubLObject make_binary_different_eval_support(final SubLObject term1, final SubLObject term2) {
        final SubLObject different_sentence = backward_utilities.inference_canonicalize_hl_support_literal(el_utilities.make_binary_formula(removal_modules_different.$const0$different, term1, term2));
        return removal_modules_evaluation.make_eval_support(different_sentence, (SubLObject)removal_modules_different.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 1816L)
    public static SubLObject removal_different_duplicate_exclusive(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_different.UNPROVIDED) {
            sense = (SubLObject)removal_modules_different.NIL;
        }
        return asent_duplicate_args_p(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 3193L)
    public static SubLObject removal_different_symbols_duplicate_exclusive(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_different.UNPROVIDED) {
            sense = (SubLObject)removal_modules_different.NIL;
        }
        return asent_duplicate_args_p(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 3842L)
    public static SubLObject cyc_possibly_evaluate(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject evaluated_term = relation_evaluation.cyc_evaluate(v_term);
        final SubLObject validP = thread.secondMultipleValue();
        final SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values((removal_modules_different.NIL != validP) ? evaluated_term : v_term, (SubLObject)((removal_modules_different.NIL != validP) ? contextualizedP : removal_modules_different.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4286L)
    public static SubLObject cyc_possibly_evaluate_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simplified_args = (SubLObject)removal_modules_different.NIL;
        SubLObject some_arg_contextualizedP = (SubLObject)removal_modules_different.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)removal_modules_different.NIL;
        arg = cdolist_list_var.first();
        while (removal_modules_different.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject simplified_arg = cyc_possibly_evaluate(arg);
            final SubLObject contextualizedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            simplified_args = (SubLObject)ConsesLow.cons(simplified_arg, simplified_args);
            some_arg_contextualizedP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_different.NIL != some_arg_contextualizedP || removal_modules_different.NIL != contextualizedP);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(simplified_args), some_arg_contextualizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4753L)
    public static SubLObject removal_sksi_different_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_different.UNPROVIDED) {
            sense = (SubLObject)removal_modules_different.NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_different.UNPROVIDED);
        final SubLObject simplified_args = cyc_possibly_evaluate_args(args);
        final SubLObject differentP = equals.differentP(simplified_args, (SubLObject)removal_modules_different.UNPROVIDED);
        if (removal_modules_different.NIL != differentP) {
            return removal_sksi_different_expand_int(asent);
        }
        return (SubLObject)removal_modules_different.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4753L)
    public static SubLObject removal_sksi_different_symbols_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_different.UNPROVIDED) {
            sense = (SubLObject)removal_modules_different.NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_different.UNPROVIDED);
        final SubLObject simplified_args = cyc_possibly_evaluate_args(args);
        final SubLObject differentP = evaluation_defns.cyc_different_symbols(simplified_args);
        if (removal_modules_different.NIL != differentP) {
            return removal_sksi_different_expand_int(asent);
        }
        return (SubLObject)removal_modules_different.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4753L)
    public static SubLObject removal_sksi_different_expand_int(final SubLObject asent) {
        final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_different.$kw17$QUERY, hl_support_formula, (SubLObject)removal_modules_different.UNPROVIDED, (SubLObject)removal_modules_different.UNPROVIDED);
        return backward.removal_add_node(support, (SubLObject)removal_modules_different.UNPROVIDED, (SubLObject)removal_modules_different.UNPROVIDED);
    }
    
    public static SubLObject declare_removal_modules_different_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "asent_duplicate_args_p", "ASENT-DUPLICATE-ARGS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "make_binary_different_eval_support", "MAKE-BINARY-DIFFERENT-EVAL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "removal_different_duplicate_exclusive", "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE", 1, 1, false);
        new $removal_different_duplicate_exclusive$UnaryFunction();
        new $removal_different_duplicate_exclusive$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "removal_different_symbols_duplicate_exclusive", "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "cyc_possibly_evaluate", "CYC-POSSIBLY-EVALUATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "cyc_possibly_evaluate_args", "CYC-POSSIBLY-EVALUATE-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "removal_sksi_different_expand", "REMOVAL-SKSI-DIFFERENT-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "removal_sksi_different_symbols_expand", "REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different", "removal_sksi_different_expand_int", "REMOVAL-SKSI-DIFFERENT-EXPAND-INT", 1, 0, false);
        return (SubLObject)removal_modules_different.NIL;
    }
    
    public static SubLObject init_removal_modules_different_file() {
        removal_modules_different.$default_different_duplicate_cost$ = SubLFiles.defparameter("*DEFAULT-DIFFERENT-DUPLICATE-COST*", (SubLObject)removal_modules_different.ZERO_INTEGER);
        return (SubLObject)removal_modules_different.NIL;
    }
    
    public static SubLObject setup_removal_modules_different_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_different.$const0$different);
        inference_modules.inference_removal_module_use_generic(removal_modules_different.$const0$different, (SubLObject)removal_modules_different.$kw1$REMOVAL_EVAL);
        inference_modules.inference_removal_module_use_generic(removal_modules_different.$const0$different, (SubLObject)removal_modules_different.$kw2$REMOVAL_NOT_EVAL);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_different.$kw3$POS, removal_modules_different.$const0$different);
        inference_modules.inference_removal_module((SubLObject)removal_modules_different.$kw4$REMOVAL_DIFFERENT_DUPLICATE, (SubLObject)removal_modules_different.$list5);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_different.$const6$differentSymbols);
        inference_modules.inference_removal_module_use_generic(removal_modules_different.$const6$differentSymbols, (SubLObject)removal_modules_different.$kw1$REMOVAL_EVAL);
        inference_modules.inference_removal_module_use_generic(removal_modules_different.$const6$differentSymbols, (SubLObject)removal_modules_different.$kw2$REMOVAL_NOT_EVAL);
        inference_modules.inference_removal_module_use_meta_removal(removal_modules_different.$const6$differentSymbols, (SubLObject)removal_modules_different.$kw7$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal(removal_modules_different.$const6$differentSymbols, (SubLObject)removal_modules_different.$kw8$META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_different.$kw3$POS, removal_modules_different.$const6$differentSymbols);
        inference_modules.inference_removal_module((SubLObject)removal_modules_different.$kw9$REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE, (SubLObject)removal_modules_different.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_different.$kw11$REMOVAL_SKSI_DIFFERENT_POS, (SubLObject)removal_modules_different.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_different.$kw13$REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS, (SubLObject)removal_modules_different.$list14);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_different.$sym15$REMOVAL_SKSI_DIFFERENT_EXPAND);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_different.$sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND);
        return (SubLObject)removal_modules_different.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_different_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_different_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_different_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_different();
        removal_modules_different.$default_different_duplicate_cost$ = null;
        $const0$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $kw1$REMOVAL_EVAL = SubLObjectFactory.makeKeyword("REMOVAL-EVAL");
        $kw2$REMOVAL_NOT_EVAL = SubLObjectFactory.makeKeyword("REMOVAL-NOT-EVAL");
        $kw3$POS = SubLObjectFactory.makeKeyword("POS");
        $kw4$REMOVAL_DIFFERENT_DUPLICATE = SubLObjectFactory.makeKeyword("REMOVAL-DIFFERENT-DUPLICATE");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), SubLObjectFactory.makeKeyword("ALL"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE") });
        $const6$differentSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("differentSymbols"));
        $kw7$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $kw8$META_REMOVAL_COMPLETELY_DECIDABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $kw9$REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE = SubLObjectFactory.makeKeyword("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("differentSymbols")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("differentSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), SubLObjectFactory.makeKeyword("ALL"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE") });
        $kw11$REMOVAL_SKSI_DIFFERENT_POS = SubLObjectFactory.makeKeyword("REMOVAL-SKSI-DIFFERENT-POS");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TREE-FIND-IF"), (SubLObject)SubLObjectFactory.makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EVAL")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SKSI-DIFFERENT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$different (#$SchemaObjectFn :fully-bound :fully-bound) (#$SchemaObjectFn :fully-bound :fully-bound))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$different (#$SchemaObjectFn #$TwoLetterStateCodes \"MN\") (#$SchemaObjectFn #$TwoLetterStateCodes \"WI\"))") });
        $kw13$REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS = SubLObjectFactory.makeKeyword("REMOVAL-SKSI-DIFFERENT-SYMBOLS-POS");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("differentSymbols")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("differentSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TREE-FIND-IF"), (SubLObject)SubLObjectFactory.makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EVAL")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND") });
        $sym15$REMOVAL_SKSI_DIFFERENT_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-DIFFERENT-EXPAND");
        $sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND");
        $kw17$QUERY = SubLObjectFactory.makeKeyword("QUERY");
    }
    
    public static final class $removal_different_duplicate_exclusive$UnaryFunction extends UnaryFunction
    {
        public $removal_different_duplicate_exclusive$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_different.removal_different_duplicate_exclusive(arg1, (SubLObject)$removal_different_duplicate_exclusive$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_different_duplicate_exclusive$BinaryFunction extends BinaryFunction
    {
        public $removal_different_duplicate_exclusive$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_different.removal_different_duplicate_exclusive(arg1, arg2);
        }
    }
}

/*

	Total time: 90 ms
	
*/