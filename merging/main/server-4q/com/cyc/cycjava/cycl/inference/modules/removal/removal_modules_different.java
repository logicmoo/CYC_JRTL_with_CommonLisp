/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-DIFFERENT
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-different.lisp
 * created:     2019/07/03 17:37:45
 */
public final class removal_modules_different extends SubLTranslatedFile implements V12 {
    /**
     * If not all variables in ASENT are bindable, prune early with :preferred.
     * Otherwise, delay with :DISALLOWED.
     */
    @LispMethod(comment = "If not all variables in ASENT are bindable, prune early with :preferred.\r\nOtherwise, delay with :DISALLOWED.\nIf not all variables in ASENT are bindable, prune early with :preferred.\nOtherwise, delay with :DISALLOWED.")
    public static final SubLObject different_symbols_delay_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.different_delay_pos_preference(asent, bindable_vars, strategic_context);
    }

    /**
     * If not all variables in ASENT are bindable, prune early with :preferred.
     * Otherwise, delay with :DISALLOWED.
     */
    @LispMethod(comment = "If not all variables in ASENT are bindable, prune early with :preferred.\r\nOtherwise, delay with :DISALLOWED.\nIf not all variables in ASENT are bindable, prune early with :preferred.\nOtherwise, delay with :DISALLOWED.")
    public static final SubLObject different_delay_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        if (NIL != list_utilities.sets_equalP(bindable_vars, list_utilities.tree_gather(asent, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED)) {
            return $DISALLOWED;
        } else {
            return $PREFERRED;
        }
    }

    public static final SubLFile me = new removal_modules_different();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_different_duplicate_cost$ = makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*");



    private static final SubLSymbol $REMOVAL_NOT_EVAL = makeKeyword("REMOVAL-NOT-EVAL");

    private static final SubLSymbol $REMOVAL_DIFFERENT_DUPLICATE = makeKeyword("REMOVAL-DIFFERENT-DUPLICATE");

    private static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("different"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("different"), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });



    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");

    private static final SubLSymbol $REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE = makeKeyword("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE");

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("differentSymbols"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("differentSymbols"), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });

    private static final SubLSymbol $REMOVAL_SKSI_DIFFERENT_POS = makeKeyword("REMOVAL-SKSI-DIFFERENT-POS");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("different"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(reader_make_constant_shell("different"), makeKeyword("FULLY-BOUND")), list(makeKeyword("OR"), list(makeKeyword("TREE-FIND-IF"), makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EVAL")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-DIFFERENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$different (#$SchemaObjectFn :fully-bound :fully-bound) (#$SchemaObjectFn :fully-bound :fully-bound))"), makeKeyword("EXAMPLE"), makeString("(#$different (#$SchemaObjectFn #$TwoLetterStateCodes \"MN\") (#$SchemaObjectFn #$TwoLetterStateCodes \"WI\"))") });

    private static final SubLSymbol $REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS = makeKeyword("REMOVAL-SKSI-DIFFERENT-SYMBOLS-POS");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("differentSymbols"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(reader_make_constant_shell("differentSymbols"), makeKeyword("FULLY-BOUND")), list(makeKeyword("OR"), list(makeKeyword("TREE-FIND-IF"), makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EVAL")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND") });

    private static final SubLSymbol REMOVAL_SKSI_DIFFERENT_EXPAND = makeSymbol("REMOVAL-SKSI-DIFFERENT-EXPAND");

    private static final SubLSymbol REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND = makeSymbol("REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND");

    public static final SubLObject asent_duplicate_args_p_alt(SubLObject asent) {
        return list_utilities.duplicatesP(cycl_utilities.atomic_sentence_args(asent, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject asent_duplicate_args_p(final SubLObject asent) {
        return list_utilities.duplicatesP(cycl_utilities.atomic_sentence_args(asent, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Return an HL support expressing (#$different TERM1 TERM2)
     */
    @LispMethod(comment = "Return an HL support expressing (#$different TERM1 TERM2)")
    public static final SubLObject make_binary_different_eval_support_alt(SubLObject term1, SubLObject term2) {
        {
            SubLObject different_sentence = backward_utilities.inference_canonicalize_hl_support_literal(make_binary_formula($$different, term1, term2));
            return removal_modules_evaluation.make_eval_support(different_sentence, UNPROVIDED);
        }
    }

    /**
     * Return an HL support expressing (#$different TERM1 TERM2)
     */
    @LispMethod(comment = "Return an HL support expressing (#$different TERM1 TERM2)")
    public static SubLObject make_binary_different_eval_support(final SubLObject term1, final SubLObject term2) {
        final SubLObject different_sentence = backward_utilities.inference_canonicalize_hl_support_literal(make_binary_formula($$different, term1, term2));
        return removal_modules_evaluation.make_eval_support(different_sentence, UNPROVIDED);
    }

    public static final SubLObject removal_different_duplicate_exclusive_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.asent_duplicate_args_p(asent);
    }

    public static SubLObject removal_different_duplicate_exclusive(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return asent_duplicate_args_p(asent);
    }

    public static final SubLObject removal_different_symbols_duplicate_exclusive_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.asent_duplicate_args_p(asent);
    }

    public static SubLObject removal_different_symbols_duplicate_exclusive(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return asent_duplicate_args_p(asent);
    }

    public static final SubLObject cyc_possibly_evaluate_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject evaluated_term = relation_evaluation.cyc_evaluate(v_term);
                SubLObject validP = thread.secondMultipleValue();
                SubLObject contextualizedP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(NIL != validP ? ((SubLObject) (evaluated_term)) : v_term, NIL != validP ? ((SubLObject) (contextualizedP)) : NIL);
            }
        }
    }

    public static SubLObject cyc_possibly_evaluate(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject evaluated_term = relation_evaluation.cyc_evaluate(v_term);
        final SubLObject validP = thread.secondMultipleValue();
        final SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(NIL != validP ? evaluated_term : v_term, NIL != validP ? contextualizedP : NIL);
    }

    public static final SubLObject cyc_possibly_evaluate_args_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject simplified_args = NIL;
                SubLObject some_arg_contextualizedP = NIL;
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject simplified_arg = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.cyc_possibly_evaluate(arg);
                        SubLObject contextualizedP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        simplified_args = cons(simplified_arg, simplified_args);
                        some_arg_contextualizedP = makeBoolean((NIL != some_arg_contextualizedP) || (NIL != contextualizedP));
                    }
                }
                return values(nreverse(simplified_args), some_arg_contextualizedP);
            }
        }
    }

    public static SubLObject cyc_possibly_evaluate_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simplified_args = NIL;
        SubLObject some_arg_contextualizedP = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject simplified_arg = cyc_possibly_evaluate(arg);
            final SubLObject contextualizedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            simplified_args = cons(simplified_arg, simplified_args);
            some_arg_contextualizedP = makeBoolean((NIL != some_arg_contextualizedP) || (NIL != contextualizedP));
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return values(nreverse(simplified_args), some_arg_contextualizedP);
    }

    public static final SubLObject removal_sksi_different_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
            SubLObject simplified_args = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.cyc_possibly_evaluate_args(args);
            SubLObject differentP = equals.differentP(simplified_args, UNPROVIDED);
            if (NIL != differentP) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.removal_sksi_different_expand_int(asent);
            }
        }
        return NIL;
    }

    public static SubLObject removal_sksi_different_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        final SubLObject simplified_args = cyc_possibly_evaluate_args(args);
        final SubLObject differentP = equals.differentP(simplified_args, UNPROVIDED);
        if (NIL != differentP) {
            return removal_sksi_different_expand_int(asent);
        }
        return NIL;
    }

    public static final SubLObject removal_sksi_different_symbols_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
            SubLObject simplified_args = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.cyc_possibly_evaluate_args(args);
            SubLObject differentP = evaluation_defns.cyc_different_symbols(simplified_args);
            if (NIL != differentP) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.removal_sksi_different_expand_int(asent);
            }
        }
        return NIL;
    }

    public static SubLObject removal_sksi_different_symbols_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        final SubLObject simplified_args = cyc_possibly_evaluate_args(args);
        final SubLObject differentP = evaluation_defns.cyc_different_symbols(simplified_args);
        if (NIL != differentP) {
            return removal_sksi_different_expand_int(asent);
        }
        return NIL;
    }

    public static final SubLObject removal_sksi_different_expand_int_alt(SubLObject asent) {
        {
            SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
            SubLObject support = arguments.make_hl_support($QUERY, hl_support_formula, UNPROVIDED, UNPROVIDED);
            return backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject removal_sksi_different_expand_int(final SubLObject asent) {
        final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
        final SubLObject support = arguments.make_hl_support($QUERY, hl_support_formula, UNPROVIDED, UNPROVIDED);
        return backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject declare_removal_modules_different_file_alt() {
        declareFunction("asent_duplicate_args_p", "ASENT-DUPLICATE-ARGS-P", 1, 0, false);
        declareFunction("make_binary_different_eval_support", "MAKE-BINARY-DIFFERENT-EVAL-SUPPORT", 2, 0, false);
        declareFunction("different_delay_pos_preference", "DIFFERENT-DELAY-POS-PREFERENCE", 3, 0, false);
        declareFunction("removal_different_duplicate_exclusive", "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE", 1, 1, false);
        new com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.$removal_different_duplicate_exclusive$UnaryFunction();
        new com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different.$removal_different_duplicate_exclusive$BinaryFunction();
        declareFunction("different_symbols_delay_pos_preference", "DIFFERENT-SYMBOLS-DELAY-POS-PREFERENCE", 3, 0, false);
        declareFunction("removal_different_symbols_duplicate_exclusive", "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE", 1, 1, false);
        declareFunction("cyc_possibly_evaluate", "CYC-POSSIBLY-EVALUATE", 1, 0, false);
        declareFunction("cyc_possibly_evaluate_args", "CYC-POSSIBLY-EVALUATE-ARGS", 1, 0, false);
        declareFunction("removal_sksi_different_expand", "REMOVAL-SKSI-DIFFERENT-EXPAND", 1, 1, false);
        declareFunction("removal_sksi_different_symbols_expand", "REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND", 1, 1, false);
        declareFunction("removal_sksi_different_expand_int", "REMOVAL-SKSI-DIFFERENT-EXPAND-INT", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_removal_modules_different_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("asent_duplicate_args_p", "ASENT-DUPLICATE-ARGS-P", 1, 0, false);
            declareFunction("make_binary_different_eval_support", "MAKE-BINARY-DIFFERENT-EVAL-SUPPORT", 2, 0, false);
            declareFunction("removal_different_duplicate_exclusive", "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE", 1, 1, false);
            new removal_modules_different.$removal_different_duplicate_exclusive$UnaryFunction();
            new removal_modules_different.$removal_different_duplicate_exclusive$BinaryFunction();
            declareFunction("removal_different_symbols_duplicate_exclusive", "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE", 1, 1, false);
            declareFunction("cyc_possibly_evaluate", "CYC-POSSIBLY-EVALUATE", 1, 0, false);
            declareFunction("cyc_possibly_evaluate_args", "CYC-POSSIBLY-EVALUATE-ARGS", 1, 0, false);
            declareFunction("removal_sksi_different_expand", "REMOVAL-SKSI-DIFFERENT-EXPAND", 1, 1, false);
            declareFunction("removal_sksi_different_symbols_expand", "REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND", 1, 1, false);
            declareFunction("removal_sksi_different_expand_int", "REMOVAL-SKSI-DIFFERENT-EXPAND-INT", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("different_delay_pos_preference", "DIFFERENT-DELAY-POS-PREFERENCE", 3, 0, false);
            declareFunction("different_symbols_delay_pos_preference", "DIFFERENT-SYMBOLS-DELAY-POS-PREFERENCE", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_different_file_Previous() {
        declareFunction("asent_duplicate_args_p", "ASENT-DUPLICATE-ARGS-P", 1, 0, false);
        declareFunction("make_binary_different_eval_support", "MAKE-BINARY-DIFFERENT-EVAL-SUPPORT", 2, 0, false);
        declareFunction("removal_different_duplicate_exclusive", "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE", 1, 1, false);
        new removal_modules_different.$removal_different_duplicate_exclusive$UnaryFunction();
        new removal_modules_different.$removal_different_duplicate_exclusive$BinaryFunction();
        declareFunction("removal_different_symbols_duplicate_exclusive", "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE", 1, 1, false);
        declareFunction("cyc_possibly_evaluate", "CYC-POSSIBLY-EVALUATE", 1, 0, false);
        declareFunction("cyc_possibly_evaluate_args", "CYC-POSSIBLY-EVALUATE-ARGS", 1, 0, false);
        declareFunction("removal_sksi_different_expand", "REMOVAL-SKSI-DIFFERENT-EXPAND", 1, 1, false);
        declareFunction("removal_sksi_different_symbols_expand", "REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND", 1, 1, false);
        declareFunction("removal_sksi_different_expand_int", "REMOVAL-SKSI-DIFFERENT-EXPAND-INT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_different_file() {
        defparameter("*DEFAULT-DIFFERENT-DUPLICATE-COST*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_different_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$different);
        inference_modules.inference_removal_module_use_generic($$different, $REMOVAL_EVAL);
        inference_modules.inference_removal_module_use_generic($$different, $REMOVAL_NOT_EVAL);
        preference_modules.inference_preference_module($DIFFERENT_DELAY_POS, $list_alt4);
        note_funcall_helper_function(DIFFERENT_DELAY_POS_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_DIFFERENT_DUPLICATE, $list_alt10);
        inference_modules.register_solely_specific_removal_module_predicate($$differentSymbols);
        inference_modules.inference_removal_module_use_generic($$differentSymbols, $REMOVAL_EVAL);
        inference_modules.inference_removal_module_use_generic($$differentSymbols, $REMOVAL_NOT_EVAL);
        inference_modules.inference_removal_module_use_meta_removal($$differentSymbols, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$differentSymbols, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        preference_modules.inference_preference_module($DIFFERENT_SYMBOLS_DELAY_POS, $list_alt15);
        note_funcall_helper_function(DIFFERENT_SYMBOLS_DELAY_POS_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE, $list_alt18);
        inference_modules.inference_removal_module($REMOVAL_SKSI_DIFFERENT_POS, $list_alt20);
        inference_modules.inference_removal_module($REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS, $list_alt22);
        note_funcall_helper_function(REMOVAL_SKSI_DIFFERENT_EXPAND);
        note_funcall_helper_function(REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND);
        return NIL;
    }

    public static SubLObject setup_removal_modules_different_file() {
        if (SubLFiles.USE_V1) {
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
            note_funcall_helper_function(REMOVAL_SKSI_DIFFERENT_EXPAND);
            note_funcall_helper_function(REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND);
        }
        if (SubLFiles.USE_V2) {
            preference_modules.inference_preference_module($DIFFERENT_DELAY_POS, $list_alt4);
            note_funcall_helper_function(DIFFERENT_DELAY_POS_PREFERENCE);
            inference_modules.inference_removal_module($REMOVAL_DIFFERENT_DUPLICATE, $list_alt10);
            preference_modules.inference_preference_module($DIFFERENT_SYMBOLS_DELAY_POS, $list_alt15);
            note_funcall_helper_function(DIFFERENT_SYMBOLS_DELAY_POS_PREFERENCE);
            inference_modules.inference_removal_module($REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE, $list_alt18);
            inference_modules.inference_removal_module($REMOVAL_SKSI_DIFFERENT_POS, $list_alt20);
            inference_modules.inference_removal_module($REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS, $list_alt22);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_different_file_Previous() {
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
        note_funcall_helper_function(REMOVAL_SKSI_DIFFERENT_EXPAND);
        note_funcall_helper_function(REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND);
        return NIL;
    }

    private static final SubLSymbol $DIFFERENT_DELAY_POS = makeKeyword("DIFFERENT-DELAY-POS");

    static private final SubLList $list_alt4 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("different"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("different"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("DIFFERENT-DELAY-POS-PREFERENCE"));

    private static final SubLSymbol DIFFERENT_DELAY_POS_PREFERENCE = makeSymbol("DIFFERENT-DELAY-POS-PREFERENCE");

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("different"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("different"), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });

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

    

    public static final class $removal_different_duplicate_exclusive$UnaryFunction extends UnaryFunction {
        public $removal_different_duplicate_exclusive$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_different_duplicate_exclusive(arg1, removal_modules_different.$removal_different_duplicate_exclusive$UnaryFunction.UNPROVIDED);
        }
    }

    private static final SubLSymbol $DIFFERENT_SYMBOLS_DELAY_POS = makeKeyword("DIFFERENT-SYMBOLS-DELAY-POS");

    public static final class $removal_different_duplicate_exclusive$BinaryFunction extends BinaryFunction {
        public $removal_different_duplicate_exclusive$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_different_duplicate_exclusive(arg1, arg2);
        }
    }

    static private final SubLList $list_alt15 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("differentSymbols"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("differentSymbols"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("DIFFERENT-SYMBOLS-DELAY-POS-PREFERENCE"));

    private static final SubLSymbol DIFFERENT_SYMBOLS_DELAY_POS_PREFERENCE = makeSymbol("DIFFERENT-SYMBOLS-DELAY-POS-PREFERENCE");

    static private final SubLList $list_alt18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("differentSymbols"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("differentSymbols"), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });

    static private final SubLList $list_alt20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("different"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(reader_make_constant_shell("different"), makeKeyword("FULLY-BOUND")), list(makeKeyword("OR"), list(makeKeyword("TREE-FIND"), reader_make_constant_shell("SchemaObjectFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EVAL")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-DIFFERENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$different (#$SchemaObjectFn :fully-bound :fully-bound) (#$SchemaObjectFn :fully-bound :fully-bound))"), makeKeyword("EXAMPLE"), makeString("(#$different (#$SchemaObjectFn #$TwoLetterStateCodes \"MN\") (#$SchemaObjectFn #$TwoLetterStateCodes \"WI\"))") });

    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("differentSymbols"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(reader_make_constant_shell("differentSymbols"), makeKeyword("FULLY-BOUND")), list(makeKeyword("OR"), list(makeKeyword("TREE-FIND"), reader_make_constant_shell("SchemaObjectFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EVAL")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND") });
}

/**
 * Total time: 90 ms
 */
