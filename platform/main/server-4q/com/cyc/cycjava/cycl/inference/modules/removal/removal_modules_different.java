package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_different extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different";
    public static String myFingerPrint = "940d912db85fcdc5b293015df6787176ba74adcd43e808234a3c33edf87164f2";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 500L)
    private static SubLSymbol $default_different_duplicate_cost$;
    private static SubLObject $$different;
    private static SubLSymbol $REMOVAL_EVAL;
    private static SubLSymbol $REMOVAL_NOT_EVAL;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_DIFFERENT_DUPLICATE;
    private static SubLList $list5;
    private static SubLObject $$differentSymbols;
    private static SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
    private static SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS;
    private static SubLSymbol $REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_SKSI_DIFFERENT_POS;
    private static SubLList $list12;
    private static SubLSymbol $REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS;
    private static SubLList $list14;
    private static SubLSymbol $sym15$REMOVAL_SKSI_DIFFERENT_EXPAND;
    private static SubLSymbol $sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND;
    private static SubLSymbol $QUERY;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 600L)
    public static SubLObject asent_duplicate_args_p(SubLObject asent) {
        return list_utilities.duplicatesP(cycl_utilities.atomic_sentence_args(asent, UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 700L)
    public static SubLObject make_binary_different_eval_support(SubLObject term1, SubLObject term2) {
        SubLObject different_sentence = backward_utilities.inference_canonicalize_hl_support_literal(el_utilities.make_binary_formula($$different, term1, term2));
        return removal_modules_evaluation.make_eval_support(different_sentence, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 1800L)
    public static SubLObject removal_different_duplicate_exclusive(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return asent_duplicate_args_p(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 3100L)
    public static SubLObject removal_different_symbols_duplicate_exclusive(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return asent_duplicate_args_p(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 3800L)
    public static SubLObject cyc_possibly_evaluate(SubLObject v_term) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject evaluated_term = relation_evaluation.cyc_evaluate(v_term);
        SubLObject validP = thread.secondMultipleValue();
        SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values((NIL != validP) ? evaluated_term : v_term, (NIL != validP) ? contextualizedP : NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4200L)
    public static SubLObject cyc_possibly_evaluate_args(SubLObject args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simplified_args = NIL;
        SubLObject some_arg_contextualizedP = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject simplified_arg = cyc_possibly_evaluate(arg);
            SubLObject contextualizedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            simplified_args = cons(simplified_arg, simplified_args);
            some_arg_contextualizedP = makeBoolean(NIL != some_arg_contextualizedP || NIL != contextualizedP);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(simplified_args), some_arg_contextualizedP);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4700L)
    public static SubLObject removal_sksi_different_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        SubLObject simplified_args = cyc_possibly_evaluate_args(args);
        SubLObject differentP = equals.differentP(simplified_args, UNPROVIDED);
        if (NIL != differentP) {
            return removal_sksi_different_expand_int(asent);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4700L)
    public static SubLObject removal_sksi_different_symbols_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        SubLObject simplified_args = cyc_possibly_evaluate_args(args);
        SubLObject differentP = evaluation_defns.cyc_different_symbols(simplified_args);
        if (NIL != differentP) {
            return removal_sksi_different_expand_int(asent);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4700L)
    public static SubLObject removal_sksi_different_expand_int(SubLObject asent) {
        SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
        SubLObject support = arguments.make_hl_support($QUERY, hl_support_formula, UNPROVIDED, UNPROVIDED);
        return backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_removal_modules_different_file() {
        declareFunction(myName, "asent_duplicate_args_p", "ASENT-DUPLICATE-ARGS-P", 1, 0, false);
        declareFunction(myName, "make_binary_different_eval_support", "MAKE-BINARY-DIFFERENT-EVAL-SUPPORT", 2, 0, false);
        declareFunction(myName, "removal_different_duplicate_exclusive", "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE", 1, 1, false);
        new $removal_different_duplicate_exclusive$UnaryFunction();
        new $removal_different_duplicate_exclusive$BinaryFunction();
        declareFunction(myName, "removal_different_symbols_duplicate_exclusive", "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE", 1, 1, false);
        declareFunction(myName, "cyc_possibly_evaluate", "CYC-POSSIBLY-EVALUATE", 1, 0, false);
        declareFunction(myName, "cyc_possibly_evaluate_args", "CYC-POSSIBLY-EVALUATE-ARGS", 1, 0, false);
        declareFunction(myName, "removal_sksi_different_expand", "REMOVAL-SKSI-DIFFERENT-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_sksi_different_symbols_expand", "REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_sksi_different_expand_int", "REMOVAL-SKSI-DIFFERENT-EXPAND-INT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_different_file() {
        $default_different_duplicate_cost$ = defparameter("*DEFAULT-DIFFERENT-DUPLICATE-COST*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_different_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$different);
        inference_modules.inference_removal_module_use_generic($$different, $REMOVAL_EVAL);
        inference_modules.inference_removal_module_use_generic($$different, $REMOVAL_NOT_EVAL);
        preference_modules.doomed_unless_all_args_bindable($POS, $$different);
        inference_modules.inference_removal_module($REMOVAL_DIFFERENT_DUPLICATE, $list5);
        inference_modules.register_solely_specific_removal_module_predicate($$differentSymbols);
        inference_modules.inference_removal_module_use_generic($$differentSymbols, $REMOVAL_EVAL);
        inference_modules.inference_removal_module_use_generic($$differentSymbols, $REMOVAL_NOT_EVAL);
        inference_modules.inference_removal_module_use_meta_removal($$differentSymbols, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$differentSymbols, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        preference_modules.doomed_unless_all_args_bindable($POS, $$differentSymbols);
        inference_modules.inference_removal_module($REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE, $list10);
        inference_modules.inference_removal_module($REMOVAL_SKSI_DIFFERENT_POS, $list12);
        inference_modules.inference_removal_module($REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS, $list14);
        utilities_macros.note_funcall_helper_function($sym15$REMOVAL_SKSI_DIFFERENT_EXPAND);
        utilities_macros.note_funcall_helper_function($sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_different_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_different_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_different_file();
    }

    static {
        me = new removal_modules_different();
        $default_different_duplicate_cost$ = null;
        $$different = makeConstSym(("different"));
        $REMOVAL_EVAL = makeKeyword("REMOVAL-EVAL");
        $REMOVAL_NOT_EVAL = makeKeyword("REMOVAL-NOT-EVAL");
        $POS = makeKeyword("POS");
        $REMOVAL_DIFFERENT_DUPLICATE = makeKeyword("REMOVAL-DIFFERENT-DUPLICATE");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("different")), makeKeyword("REQUIRED-PATTERN"), cons(makeConstSym(("different")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"),
                makeSymbol("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });
        $$differentSymbols = makeConstSym(("differentSymbols"));
        $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE = makeKeyword("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("differentSymbols")), makeKeyword("REQUIRED-PATTERN"), cons(makeConstSym(("differentSymbols")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"),
                makeSymbol("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });
        $REMOVAL_SKSI_DIFFERENT_POS = makeKeyword("REMOVAL-SKSI-DIFFERENT-POS");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("different")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), cons(makeConstSym(("different")), makeKeyword("FULLY-BOUND")), list(makeKeyword("OR"), list(makeKeyword("TREE-FIND-IF"), makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"),
                list(makeKeyword("REMOVAL-EVAL")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-DIFFERENT-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$different (#$SchemaObjectFn :fully-bound :fully-bound) (#$SchemaObjectFn :fully-bound :fully-bound))"), makeKeyword("EXAMPLE"), makeString("(#$different (#$SchemaObjectFn #$TwoLetterStateCodes \"MN\") (#$SchemaObjectFn #$TwoLetterStateCodes \"WI\"))") });
        $REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS = makeKeyword("REMOVAL-SKSI-DIFFERENT-SYMBOLS-POS");
        $list14 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("differentSymbols")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), cons(makeConstSym(("differentSymbols")), makeKeyword("FULLY-BOUND")), list(makeKeyword("OR"), list(makeKeyword("TREE-FIND-IF"), makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"),
                list(makeKeyword("REMOVAL-EVAL")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND") });
        $sym15$REMOVAL_SKSI_DIFFERENT_EXPAND = makeSymbol("REMOVAL-SKSI-DIFFERENT-EXPAND");
        $sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND = makeSymbol("REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND");
        $QUERY = makeKeyword("QUERY");
    }

    public static class $removal_different_duplicate_exclusive$UnaryFunction extends UnaryFunction {
        public $removal_different_duplicate_exclusive$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_different_duplicate_exclusive(arg1, $removal_different_duplicate_exclusive$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_different_duplicate_exclusive$BinaryFunction extends BinaryFunction {
        public $removal_different_duplicate_exclusive$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_different_duplicate_exclusive(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 90 ms
 *
 */