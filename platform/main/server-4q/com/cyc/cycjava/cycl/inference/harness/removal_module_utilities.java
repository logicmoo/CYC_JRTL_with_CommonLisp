package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.modules.forward_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_module_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new removal_module_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_module_utilities";

    public static final String myFingerPrint = "bab082c2b86823f5fd6d3a14560488abd4ca75f913c17f579f3586d6aeb7d173";

    // deflexical
    /**
     * Modules which require :negation-by-failure? parameter to generate a minimize
     * support
     */
    private static final SubLSymbol $modules_require_negation_by_failure$ = makeSymbol("*MODULES-REQUIRE-NEGATION-BY-FAILURE*");

    // deflexical
    /**
     * Modules which require :completness-minization-allowed? parameter to generate
     * the support listed.
     */
    private static final SubLSymbol $completeness_minimization_required_modules$ = makeSymbol("*COMPLETENESS-MINIMIZATION-REQUIRED-MODULES*");

    // deflexical
    // Modules which require :new-terms-allowed? parameter.
    private static final SubLSymbol $new_terms_allowed_required_modules$ = makeSymbol("*NEW-TERMS-ALLOWED-REQUIRED-MODULES*");

    // deflexical
    // Removal modules that require :evaluate-subl-allowed? to be t to function
    private static final SubLSymbol $evaluate_subl_required_modules$ = makeSymbol("*EVALUATE-SUBL-REQUIRED-MODULES*");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));



    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));



    public static final SubLList $list6 = list(reader_make_constant_shell(makeString("equals")), makeSymbol("?X"), makeSymbol("?X"));



    public static final SubLString $str8$______System__a_HL_module_statist = makeString("~%;;; System ~a HL module statistics");

    public static final SubLString $str9$__HL_Modules_____________________ = makeString("~%HL Modules                   : ~6,' D");

    public static final SubLString $str10$___Removal_Modules_______________ = makeString("~% Removal Modules             : ~6,' D");

    public static final SubLString $str11$___Meta_Removal_Modules__________ = makeString("~% Meta-Removal Modules        : ~6,' D");

    public static final SubLString $str12$___Conjunctive_Removal_Modules___ = makeString("~% Conjunctive Removal Modules : ~6,' D");

    public static final SubLString $str13$___Transformation_Modules________ = makeString("~% Transformation Modules      : ~6,' D");

    public static final SubLString $str14$___Meta_Transformation_Modules___ = makeString("~% Meta-Transformation Modules : ~6,' D");

    public static final SubLString $str15$___Structural_Modules____________ = makeString("~% Structural Modules          : ~6,' D");

    public static final SubLString $str16$___Meta_Structural_Modules_______ = makeString("~% Meta-Structural Modules     : ~6,' D");

    public static final SubLString $str17$___Forward_Modules_______________ = makeString("~% Forward Modules             : ~6,' D");

    public static final SubLString $str18$___Storage_Modules_______________ = makeString("~% Storage Modules             : ~6,' D");

    public static final SubLString $str19$___Evaluatable_Predicates________ = makeString("~% Evaluatable Predicates      : ~6,' D");

    public static final SubLString $str20$___Evaluatable_Functions_________ = makeString("~% Evaluatable Functions       : ~6,' D");

    public static final SubLList $list21 = list(CHAR_lparen, CHAR_rparen, CHAR_less, CHAR_greater, makeString("#$"), CHAR_period);





    public static final SubLString $$$pos = makeString("pos");



    private static final SubLString $$$not = makeString("not");

    private static final SubLString $$$neg = makeString("neg");

    private static final SubLSymbol $kw28$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    public static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("REMOVAL-NOT-ISA-COLLECTION-CHECK"), makeKeyword("REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK"), makeKeyword("REMOVAL-NOT-CONCEPTUALLY-RELATED"), makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK"), makeKeyword("REMOVAL-NOT-GENLINVERSE-CHECK"), makeKeyword("REMOVAL-NOT-GENLMT-CHECK"), makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK"), makeKeyword("REMOVAL-NOT-SUPERSET"), makeKeyword("REMOVAL-MINIMIZE-EXTENT"), makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK"), makeKeyword("REMOVAL-NOT-NEGATIONPREDS-CHECK"), makeKeyword("REMOVAL-NOT-STARTS-AFTER-STARTING-OF"), makeKeyword("REMOVAL-NOT-STARTS-AFTER-ENDING-OF"), makeKeyword("REMOVAL-NOT-ENDS-AFTER-STARTING-OF"), makeKeyword("REMOVAL-NOT-ENDS-AFTER-ENDING-OF"), makeKeyword("REMOVAL-NOT-TEMPORALLY-SUBSUMES"), makeKeyword("REMOVAL-NOT-DATE-OF-EVENT"), makeKeyword("REMOVAL-NOT-COTEMPORAL"), makeKeyword("REMOVAL-NOT-TEMPORALLY-INTERSECTS"), makeKeyword("REMOVAL-NOT-TEMPORALLY-DISJOINT"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL"), makeKeyword("REMOVAL-NOT-TEMPORALLY-COORIGINATING"), makeKeyword("REMOVAL-NOT-TEMPORALLY-COTERMINAL"), makeKeyword("REMOVAL-NOT-CONTIGUOUS-AFTER"), makeKeyword("REMOVAL-NOT-STARTS-DURING"), makeKeyword("REMOVAL-NOT-ENDS-DURING"), makeKeyword("REMOVAL-NOT-STARTING-DATE"), makeKeyword("REMOVAL-NOT-ENDING-DATE"), makeKeyword("REMOVAL-NOT-BIRTH-DATE"), makeKeyword("REMOVAL-NOT-DATE-OF-DEATH"), makeKeyword("REMOVAL-NOT-TEMPORALLY-STARTED-BY"), makeKeyword("REMOVAL-NOT-TEMPORALLY-FINISHED-BY"), makeKeyword("REMOVAL-NOT-OVERLAPS-START") });

    public static final SubLList $list30 = list(cons(makeKeyword("REMOVAL-NOT-ISA-COLLECTION-CHECK"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-ISA-DEFN-REJECT"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-QUOTED-ISA-DEFN-REJECT"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG"), makeKeyword("MINIMIZE")));

    public static final SubLList $list31 = cons(makeSymbol("MODULE"), makeSymbol("SUPPORT"));

    public static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("REMOVAL-SKOLEMIZE-CREATE"), makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY"), makeKeyword("REMOVAL-RELATION-EXISTS-ALL-UNIFY"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2") });

    private static final SubLList $list33 = list(makeKeyword("REMOVAL-PERFORM-SUBL-POS"), makeKeyword("REMOVAL-PERFORM-SUBL-NEG"));

    public static SubLObject negation_grossly_incompleteP(final SubLObject asent, final SubLObject sense) {
        return makeBoolean(NIL == variables.fully_bound_p(asent));
    }

    public static SubLObject invert_removal_check_cost(final SubLObject check_cost) {
        final SubLObject inverted_check_cost = subtract(ONE_INTEGER, check_cost);
        return min(ONE_INTEGER, max(ZERO_INTEGER, inverted_check_cost));
    }

    public static SubLObject answer_to_singleton(final SubLObject v_answer) {
        return list(v_answer);
    }

    public static SubLObject non_null_answer_to_singleton(final SubLObject v_answer) {
        return NIL != v_answer ? answer_to_singleton(v_answer) : NIL;
    }

    public static SubLObject invert_boolean_answer(final SubLObject v_answer) {
        return makeBoolean(NIL == v_answer);
    }

    public static SubLObject additional_isa_support(final SubLObject v_object, final SubLObject collection) {
        final SubLObject hl_formula = list($$isa, v_object, collection);
        final SubLObject hl_support = arguments.make_hl_support($ISA, hl_formula, UNPROVIDED, UNPROVIDED);
        return hl_support;
    }

    public static SubLObject additional_isa_supports(final SubLObject v_object, final SubLObject collection) {
        return list(additional_isa_support(v_object, collection));
    }

    public static SubLObject make_genl_inverse_support(final SubLObject spec_pred, final SubLObject genl_pred) {
        final SubLObject hl_formula = list($$genlInverse, spec_pred, genl_pred);
        final SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
        return hl_support;
    }

    public static SubLObject additional_genl_inverse_supports(final SubLObject spec_pred, final SubLObject genl_pred) {
        if (!spec_pred.eql(genl_pred)) {
            return list(make_genl_inverse_support(spec_pred, genl_pred));
        }
        return NIL;
    }

    public static SubLObject make_genl_preds_support(final SubLObject spec_pred, final SubLObject genl_pred) {
        final SubLObject hl_formula = list($$genlPreds, spec_pred, genl_pred);
        final SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
        return hl_support;
    }

    public static SubLObject additional_genl_preds_supports(final SubLObject spec_pred, final SubLObject genl_pred) {
        if (!spec_pred.eql(genl_pred)) {
            return list(make_genl_preds_support(spec_pred, genl_pred));
        }
        return NIL;
    }

    public static SubLObject make_simplification_support() {
        return arguments.make_hl_support($CODE, $list6, mt_vars.$equals_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject hl_module_count() {
        return add(new SubLObject[]{ inference_modules.removal_module_count(), inference_modules.meta_removal_module_count(), inference_modules.conjunctive_removal_module_count(), inference_modules.transformation_module_count(), inference_modules.meta_transformation_module_count(), inference_modules.structural_module_count(), inference_modules.meta_structural_module_count(), forward_modules.forward_module_count(), hl_storage_modules.hl_storage_module_count(), evaluation_defns.evaluatable_predicate_count(), evaluation_defns.evaluatable_function_count() });
    }

    public static SubLObject hl_module_statistics(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject removal_module_count = inference_modules.removal_module_count();
        final SubLObject meta_removal_module_count = inference_modules.meta_removal_module_count();
        final SubLObject conjunctive_removal_module_count = inference_modules.conjunctive_removal_module_count();
        final SubLObject transformation_module_count = inference_modules.transformation_module_count();
        final SubLObject meta_transformation_module_count = inference_modules.meta_transformation_module_count();
        final SubLObject structural_module_count = inference_modules.structural_module_count();
        final SubLObject meta_structural_module_count = inference_modules.meta_structural_module_count();
        final SubLObject forward_module_count = forward_modules.forward_module_count();
        final SubLObject hl_storage_module_count = hl_storage_modules.hl_storage_module_count();
        final SubLObject evaluatable_predicate_count = evaluation_defns.evaluatable_predicate_count();
        final SubLObject evaluatable_function_count = evaluation_defns.evaluatable_function_count();
        final SubLObject hl_module_count = add(new SubLObject[]{ removal_module_count, meta_removal_module_count, conjunctive_removal_module_count, transformation_module_count, meta_transformation_module_count, forward_module_count, hl_storage_module_count, evaluatable_predicate_count, evaluatable_function_count });
        format(stream, $str8$______System__a_HL_module_statist, system_info.cyc_revision_string());
        format(stream, $str9$__HL_Modules_____________________, hl_module_count);
        format(stream, $str10$___Removal_Modules_______________, removal_module_count);
        format(stream, $str11$___Meta_Removal_Modules__________, meta_removal_module_count);
        format(stream, $str12$___Conjunctive_Removal_Modules___, conjunctive_removal_module_count);
        format(stream, $str13$___Transformation_Modules________, transformation_module_count);
        format(stream, $str14$___Meta_Transformation_Modules___, meta_transformation_module_count);
        format(stream, $str15$___Structural_Modules____________, structural_module_count);
        format(stream, $str16$___Meta_Structural_Modules_______, meta_structural_module_count);
        format(stream, $str17$___Forward_Modules_______________, forward_module_count);
        format(stream, $str18$___Storage_Modules_______________, hl_storage_module_count);
        format(stream, $str19$___Evaluatable_Predicates________, evaluatable_predicate_count);
        format(stream, $str20$___Evaluatable_Functions_________, evaluatable_function_count);
        terpri(stream);
        return NIL;
    }

    public static SubLObject determine_hl_module_name(final SubLObject string, final SubLObject sense) {
        final SubLObject break_list = append(string_utilities.whitespace_chars(), $list21);
        SubLObject substrings = delete_if(EMPTY_STRING_P, string_utilities.string_tokenize(string, break_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (sense.eql($POS)) {
            substrings = list_utilities.snoc($$$pos, substrings);
        } else
            if (sense.eql($NEG)) {
                if (NIL != string_utilities.substringP($$$not, substrings.first(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED)) {
                    substrings = list_utilities.snoc($$$neg, substrings.rest());
                } else {
                    substrings = list_utilities.snoc($$$neg, substrings);
                }
            }

        return make_removal_module_name(substrings);
    }

    public static SubLObject make_removal_module_name(final SubLObject substrings) {
        final SubLObject string = Strings.string_upcase(string_utilities.bunge(substrings, CHAR_hyphen), UNPROVIDED, UNPROVIDED);
        final SubLObject symbol = gensym(string);
        final SubLObject keyword = make_keyword(symbol);
        return keyword;
    }

    public static SubLObject current_query_allows_new_termsP() {
        final SubLObject store = inference_worker.currently_active_problem_store();
        if (NIL != store) {
            return inference_datastructures_problem_store.problem_store_new_terms_allowedP(store);
        }
        return inference_trivial.current_query_property_lookup($kw28$NEW_TERMS_ALLOWED_);
    }

    public static SubLObject module_requires_negation_by_failureP(final SubLObject module_name) {
        return list_utilities.member_eqP(module_name, $modules_require_negation_by_failure$.getGlobalValue());
    }

    public static SubLObject module_requires_completeness_minimization_for_supportP(final SubLObject module_name, final SubLObject hl_support) {
        SubLObject cdolist_list_var = $completeness_minimization_required_modules$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject module = NIL;
            SubLObject support = NIL;
            destructuring_bind_must_consp(current, datum, $list31);
            module = current.first();
            current = support = current.rest();
            if (module_name.eql(module) && hl_support.eql(support)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject module_requires_new_terms_allowedP(final SubLObject module_name) {
        return list_utilities.member_eqP(module_name, $new_terms_allowed_required_modules$.getGlobalValue());
    }

    public static SubLObject module_requires_evaluate_sublP(final SubLObject module_name) {
        return list_utilities.member_eqP(module_name, $evaluate_subl_required_modules$.getGlobalValue());
    }

    public static SubLObject declare_removal_module_utilities_file() {
        declareFunction(me, "negation_grossly_incompleteP", "NEGATION-GROSSLY-INCOMPLETE?", 2, 0, false);
        declareFunction(me, "invert_removal_check_cost", "INVERT-REMOVAL-CHECK-COST", 1, 0, false);
        declareFunction(me, "answer_to_singleton", "ANSWER-TO-SINGLETON", 1, 0, false);
        declareFunction(me, "non_null_answer_to_singleton", "NON-NULL-ANSWER-TO-SINGLETON", 1, 0, false);
        declareFunction(me, "invert_boolean_answer", "INVERT-BOOLEAN-ANSWER", 1, 0, false);
        declareFunction(me, "additional_isa_support", "ADDITIONAL-ISA-SUPPORT", 2, 0, false);
        declareFunction(me, "additional_isa_supports", "ADDITIONAL-ISA-SUPPORTS", 2, 0, false);
        declareFunction(me, "make_genl_inverse_support", "MAKE-GENL-INVERSE-SUPPORT", 2, 0, false);
        declareFunction(me, "additional_genl_inverse_supports", "ADDITIONAL-GENL-INVERSE-SUPPORTS", 2, 0, false);
        declareFunction(me, "make_genl_preds_support", "MAKE-GENL-PREDS-SUPPORT", 2, 0, false);
        declareFunction(me, "additional_genl_preds_supports", "ADDITIONAL-GENL-PREDS-SUPPORTS", 2, 0, false);
        declareFunction(me, "make_simplification_support", "MAKE-SIMPLIFICATION-SUPPORT", 0, 0, false);
        declareFunction(me, "hl_module_count", "HL-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "hl_module_statistics", "HL-MODULE-STATISTICS", 0, 1, false);
        declareFunction(me, "determine_hl_module_name", "DETERMINE-HL-MODULE-NAME", 2, 0, false);
        declareFunction(me, "make_removal_module_name", "MAKE-REMOVAL-MODULE-NAME", 1, 0, false);
        declareFunction(me, "current_query_allows_new_termsP", "CURRENT-QUERY-ALLOWS-NEW-TERMS?", 0, 0, false);
        declareFunction(me, "module_requires_negation_by_failureP", "MODULE-REQUIRES-NEGATION-BY-FAILURE?", 1, 0, false);
        declareFunction(me, "module_requires_completeness_minimization_for_supportP", "MODULE-REQUIRES-COMPLETENESS-MINIMIZATION-FOR-SUPPORT?", 2, 0, false);
        declareFunction(me, "module_requires_new_terms_allowedP", "MODULE-REQUIRES-NEW-TERMS-ALLOWED?", 1, 0, false);
        declareFunction(me, "module_requires_evaluate_sublP", "MODULE-REQUIRES-EVALUATE-SUBL?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_module_utilities_file() {
        deflexical("*MODULES-REQUIRE-NEGATION-BY-FAILURE*", $list29);
        deflexical("*COMPLETENESS-MINIMIZATION-REQUIRED-MODULES*", $list30);
        deflexical("*NEW-TERMS-ALLOWED-REQUIRED-MODULES*", $list32);
        deflexical("*EVALUATE-SUBL-REQUIRED-MODULES*", $list33);
        return NIL;
    }

    public static SubLObject setup_removal_module_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_module_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_module_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_module_utilities_file();
    }

    
}

/**
 * Total time: 53 ms
 */
