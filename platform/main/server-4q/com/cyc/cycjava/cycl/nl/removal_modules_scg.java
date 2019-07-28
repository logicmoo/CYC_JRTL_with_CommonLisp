package com.cyc.cycjava.cycl.nl;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.el_grammar;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.nl.removal_modules_scg;
import com.cyc.cycjava.cycl.subcollection_unwinder;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.nl.removal_modules_scg.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_scg extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_scg();

    public static final String myName = "com.cyc.cycjava.cycl.nl.removal_modules_scg";

    public static final String myFingerPrint = "924dd601ec858157a405c0f735c7ba2965edf57116dd77b93443aa22f3f02796";

    // defparameter
    private static final SubLSymbol $scg_parse_removal_clear_cachesP$ = makeSymbol("*SCG-PARSE-REMOVAL-CLEAR-CACHES?*");

    private static final SubLObject $$scgParse = reader_make_constant_shell(makeString("scgParse"));



    private static final SubLSymbol $REMOVAL_SCG_PARSE = makeKeyword("REMOVAL-SCG-PARSE");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("scgParse")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("scgParse")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$scgParse <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$scgParse \"some clouds in the sky\" ?PARSE))") });

    private static final SubLObject $$scgParse_Partial = reader_make_constant_shell(makeString("scgParse-Partial"));

    private static final SubLSymbol $REMOVAL_SCG_PARSE_PARTIAL = makeKeyword("REMOVAL-SCG-PARSE-PARTIAL");

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("scgParse-Partial")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("scgParse-Partial")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$scgParse-Partial <fully-bound-p> <anything> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$scgParse-Partial \"some clouds in the sky\" ?INTERP ?OFFSET ?LENGTH))") });

    private static final SubLObject $$scgParse_Sentence = reader_make_constant_shell(makeString("scgParse-Sentence"));

    private static final SubLSymbol $REMOVAL_SCG_PARSE_SENTENCE = makeKeyword("REMOVAL-SCG-PARSE-SENTENCE");

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("scgParse-Sentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("scgParse-Sentence")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$scgParse-Sentence <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$scgParse-Sentence \"some clouds in the sky\" ?PARSE))") });

    private static final SubLObject $$scgParse_Term = reader_make_constant_shell(makeString("scgParse-Term"));

    private static final SubLSymbol $REMOVAL_SCG_PARSE_TERM = makeKeyword("REMOVAL-SCG-PARSE-TERM");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("scgParse-Term")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("scgParse-Term")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$scgParse-Term <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$scgParse-Term \"some clouds in the sky\" ?PARSE))") });

    private static final SubLObject $$scgParse_Partial_Sentence = reader_make_constant_shell(makeString("scgParse-Partial-Sentence"));

    private static final SubLSymbol $REMOVAL_SCG_PARSE_PARTIAL_SENTENCE = makeKeyword("REMOVAL-SCG-PARSE-PARTIAL-SENTENCE");

    private static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("scgParse-Partial-Sentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("scgParse-Partial-Sentence")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$scgParse-Partial-Sentence <fully-bound-p> <anything> <anything> <anything>"), makeKeyword("EXAMPLE"), makeString("(#$scgParse-Partial-Sentence \"some clouds in the sky\" ?INTERP ?OFFSET ?LENGTH))") });

    private static final SubLObject $$scgParse_Partial_Term = reader_make_constant_shell(makeString("scgParse-Partial-Term"));

    private static final SubLSymbol $REMOVAL_SCG_PARSE_PARTIAL_TERM = makeKeyword("REMOVAL-SCG-PARSE-PARTIAL-TERM");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("scgParse-Partial-Term")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("scgParse-Partial-Term")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$scgParse-Partial-Term <fully-bound-p> <anything> <anything> <anything>"), makeKeyword("EXAMPLE"), makeString("(#$scgParse-Partial-Term \"some clouds in the sky\" ?INTERP ?LENGTH ?OFFSET)") });



    private static final SubLSymbol $kw20$CLEAR_CACHES_ = makeKeyword("CLEAR-CACHES?");

    private static final SubLSymbol $kw21$COMPLETE_MATCHES_ONLY_ = makeKeyword("COMPLETE-MATCHES-ONLY?");





    private static final SubLList $list24 = list(reader_make_constant_shell(makeString("equals")), reader_make_constant_shell(makeString("equalSymbols")));







    private static final SubLObject $$salientURL = reader_make_constant_shell(makeString("salientURL"));

    private static final SubLObject $$URLFn = reader_make_constant_shell(makeString("URLFn"));

    private static final SubLList $list30 = list(reader_make_constant_shell(makeString("scgParse-Partial")), reader_make_constant_shell(makeString("scgParse-Partial-Sentence")), reader_make_constant_shell(makeString("scgParse-Partial-Term")));

    private static final SubLList $list31 = list(reader_make_constant_shell(makeString("scgParse")), reader_make_constant_shell(makeString("scgParse-Partial")));

    private static final SubLList $list32 = list(reader_make_constant_shell(makeString("scgParse-Term")), reader_make_constant_shell(makeString("scgParse-Partial-Term")));

    private static final SubLList $list33 = list(reader_make_constant_shell(makeString("scgParse-Sentence")), reader_make_constant_shell(makeString("scgParse-Partial-Sentence")));

    private static final SubLObject $const34$unwindingOfSubcollectionExpressio = reader_make_constant_shell(makeString("unwindingOfSubcollectionExpression"));

    private static final SubLSymbol $REMOVAL_UNWINDING_OF_SUBCOLLECTION_EXPRESSION = makeKeyword("REMOVAL-UNWINDING-OF-SUBCOLLECTION-EXPRESSION");

    private static final SubLList $list36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("unwindingOfSubcollectionExpression")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("unwindingOfSubcollectionExpression")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNWINDING-OF-SUBCOLLECTION-EXPRESSION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unwindingOfSubcollectionExpression <fully-bound-p> <anything>"), makeKeyword("EXAMPLE"), makeString("(unwindingOfSubcollectionExpression \n  (SubcollectionOfWithRelationToTypeFn FlashMobPerformance movementCoordinatedWith (MusicOfFn JohnPhilipSousa-Composer))\n  (Quote (and (isa ?X FlashMobPerformance) (isa ?Y (MusicOfFn JohnPhilipSousa-Composer)) (movementCoordinatedWith ?X ?Y))))") });



    private static final SubLSymbol NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");

    public static SubLObject removal_scg_parse_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject parse_string_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject parse_result_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject complete_matches_onlyP = makeBoolean(NIL == scg_parse_pred_partialP(pred));
        final SubLObject partial_parse_offset_arg = (NIL != complete_matches_onlyP) ? NIL : cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject partial_parse_length_arg = (NIL != complete_matches_onlyP) ? NIL : cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
        final SubLObject restricted_result_type = scg_parse_pred_restriction_type(pred);
        final SubLObject remaining_time = (NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_remaining_time(inference_macros.current_controlling_inference(), UNPROVIDED) : NIL;
        final SubLObject max_time_msec = (NIL != remaining_time) ? multiply(remaining_time, $int$1000) : NIL;
        SubLObject params = list($kw20$CLEAR_CACHES_, $scg_parse_removal_clear_cachesP$.getDynamicValue(thread), $kw21$COMPLETE_MATCHES_ONLY_, complete_matches_onlyP);
        if (NIL != max_time_msec) {
            params = putf(params, $MAX_TIME, max_time_msec);
        }
        if (parse_string_arg.isString()) {
            thread.resetMultipleValues();
            final SubLObject parses = scg_api.scg_parse(parse_string_arg, params);
            final SubLObject url = thread.secondMultipleValue();
            final SubLObject matched_strings = thread.thirdMultipleValue();
            final SubLObject matched_string_offsets = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            SubLObject parse = NIL;
            SubLObject parse_$1 = NIL;
            SubLObject matched_string = NIL;
            SubLObject matched_string_$2 = NIL;
            SubLObject matched_offset = NIL;
            SubLObject matched_offset_$3 = NIL;
            parse = parses;
            parse_$1 = parse.first();
            matched_string = matched_strings;
            matched_string_$2 = matched_string.first();
            matched_offset = matched_string_offsets;
            matched_offset_$3 = matched_offset.first();
            while (((NIL != matched_offset) || (NIL != matched_string)) || (NIL != parse)) {
                final SubLObject matched_length = length(matched_string_$2);
                if (((restricted_result_type != $NONE) && (NIL != el_formula_with_any_of_operators_p(parse_$1, $list24))) && (NIL != el_binary_formula_p(parse_$1))) {
                    parse_$1 = (NIL != cycl_variables.cyc_varP(cycl_utilities.el_formula_arg1(parse_$1, UNPROVIDED))) ? cycl_utilities.el_formula_arg2(parse_$1, UNPROVIDED) : NIL != cycl_variables.cyc_varP(cycl_utilities.el_formula_arg2(parse_$1, UNPROVIDED)) ? cycl_utilities.el_formula_arg1(parse_$1, UNPROVIDED) : parse_$1;
                }
                SubLObject abort_due_to_type_mismatchP = NIL;
                if ((restricted_result_type == $SENTENCE) && (NIL == el_grammar.el_sentence_p(parse_$1))) {
                    abort_due_to_type_mismatchP = T;
                }
                if ((restricted_result_type == $TERM) && (NIL != el_grammar.el_sentence_p(parse_$1))) {
                    abort_due_to_type_mismatchP = T;
                }
                if (((NIL == abort_due_to_type_mismatchP) && (NIL != unification.unify_possible(parse_result_arg, parse_$1))) && ((NIL != complete_matches_onlyP) || ((NIL != unification.unify_possible(partial_parse_offset_arg, matched_offset_$3)) && (NIL != unification.unify_possible(partial_parse_length_arg, matched_length))))) {
                    SubLObject v_bindings = (NIL != complete_matches_onlyP) ? unification_utilities.term_unify(parse_result_arg, parse_$1, UNPROVIDED, UNPROVIDED) : nconc(unification_utilities.term_unify(parse_result_arg, parse_$1, UNPROVIDED, UNPROVIDED), unification_utilities.term_unify(partial_parse_offset_arg, matched_offset_$3, UNPROVIDED, UNPROVIDED), unification_utilities.term_unify(partial_parse_length_arg, matched_length, UNPROVIDED, UNPROVIDED));
                    if (NIL == scg_parse_pred_uses_legacy_incorrect_non_quotingP(pred)) {
                        SubLObject new_bindings = NIL;
                        SubLObject cdolist_list_var = v_bindings;
                        SubLObject binding = NIL;
                        binding = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_bindings = cons(bindings.make_variable_binding(bindings.variable_binding_variable(binding), NIL != cycl_grammar.cycl_unrepresented_term_p(bindings.variable_binding_value(binding)) ? bindings.variable_binding_value(binding) : possibly_quote(bindings.variable_binding_value(binding))), new_bindings);
                            cdolist_list_var = cdolist_list_var.rest();
                            binding = cdolist_list_var.first();
                        } 
                        v_bindings = new_bindings;
                    }
                    final SubLObject sentence = bindings.apply_bindings(v_bindings, asent);
                    final SubLObject hl_support = arguments.make_hl_support($OPAQUE, sentence, UNPROVIDED, UNPROVIDED);
                    final SubLObject url_support = arguments.make_hl_support($OPAQUE, make_formula($$salientURL, list(matched_string_$2, list($$URLFn, url)), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    backward.removal_add_node(hl_support, v_bindings, list(url_support));
                }
                parse = parse.rest();
                parse_$1 = parse.first();
                matched_string = matched_string.rest();
                matched_string_$2 = matched_string.first();
                matched_offset = matched_offset.rest();
                matched_offset_$3 = matched_offset.first();
            } 
        }
        return NIL;
    }

    public static SubLObject scg_parse_pred_uses_legacy_incorrect_non_quotingP(final SubLObject pred) {
        return T;
    }

    public static SubLObject scg_parse_pred_partialP(final SubLObject pred) {
        return list_utilities.member_kbeqP(pred, $list30);
    }

    public static SubLObject scg_parse_pred_restriction_type(final SubLObject pred) {
        return NIL != list_utilities.member_kbeqP(pred, $list31) ? $NONE : NIL != list_utilities.member_kbeqP(pred, $list32) ? $TERM : NIL != list_utilities.member_kbeqP(pred, $list33) ? $SENTENCE : NIL;
    }

    public static SubLObject removal_unwinding_of_subcollection_expression_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_nested_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject raw_unwound_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject nested_arg = possibly_unquote_closed_formula(raw_nested_arg);
        final SubLObject nested_arg_quotedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        nested_arg = cycl_utilities.expression_transform(nested_arg, NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject unwound_arg = possibly_unquote_closed_formula(raw_unwound_arg);
        final SubLObject unwound_arg_quotedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject raw_unwound_answer = subcollection_unwinder.scg_subcl_expand_signature_int(nested_arg);
        final SubLObject unwound_answer = possibly_quote_open_formula(raw_unwound_answer, unwound_arg_quotedP);
        final SubLObject v_bindings = unification_utilities.term_unify(unwound_arg, unwound_answer, UNPROVIDED, UNPROVIDED);
        final SubLObject sentence = bindings.apply_bindings(v_bindings, asent);
        final SubLObject hl_support = arguments.make_hl_support($OPAQUE, sentence, UNPROVIDED, UNPROVIDED);
        backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_removal_modules_scg_file() {
        declareFunction(me, "removal_scg_parse_expand", "REMOVAL-SCG-PARSE-EXPAND", 1, 1, false);
        declareFunction(me, "scg_parse_pred_uses_legacy_incorrect_non_quotingP", "SCG-PARSE-PRED-USES-LEGACY-INCORRECT-NON-QUOTING?", 1, 0, false);
        declareFunction(me, "scg_parse_pred_partialP", "SCG-PARSE-PRED-PARTIAL?", 1, 0, false);
        declareFunction(me, "scg_parse_pred_restriction_type", "SCG-PARSE-PRED-RESTRICTION-TYPE", 1, 0, false);
        declareFunction(me, "removal_unwinding_of_subcollection_expression_expand", "REMOVAL-UNWINDING-OF-SUBCOLLECTION-EXPRESSION-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_scg_file() {
        defparameter("*SCG-PARSE-REMOVAL-CLEAR-CACHES?*", T);
        return NIL;
    }

    public static SubLObject setup_removal_modules_scg_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$scgParse);
        preference_modules.doomed_unless_arg_bindable($POS, $$scgParse, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SCG_PARSE, $list3);
        inference_modules.register_solely_specific_removal_module_predicate($$scgParse_Partial);
        preference_modules.doomed_unless_arg_bindable($POS, $$scgParse_Partial, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SCG_PARSE_PARTIAL, $list6);
        inference_modules.register_solely_specific_removal_module_predicate($$scgParse_Sentence);
        preference_modules.doomed_unless_arg_bindable($POS, $$scgParse_Sentence, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SCG_PARSE_SENTENCE, $list9);
        inference_modules.register_solely_specific_removal_module_predicate($$scgParse_Term);
        preference_modules.doomed_unless_arg_bindable($POS, $$scgParse_Term, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SCG_PARSE_TERM, $list12);
        inference_modules.register_solely_specific_removal_module_predicate($$scgParse_Partial_Sentence);
        preference_modules.doomed_unless_arg_bindable($POS, $$scgParse_Partial_Sentence, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SCG_PARSE_PARTIAL_SENTENCE, $list15);
        inference_modules.register_solely_specific_removal_module_predicate($$scgParse_Partial_Term);
        preference_modules.doomed_unless_arg_bindable($POS, $$scgParse_Partial_Term, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SCG_PARSE_PARTIAL_TERM, $list18);
        inference_modules.register_solely_specific_removal_module_predicate($const34$unwindingOfSubcollectionExpressio);
        preference_modules.doomed_unless_arg_bindable($POS, $const34$unwindingOfSubcollectionExpressio, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_UNWINDING_OF_SUBCOLLECTION_EXPRESSION, $list36);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_scg_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_scg_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_scg_file();
    }

    static {









































    }
}

/**
 * Total time: 83 ms
 */
