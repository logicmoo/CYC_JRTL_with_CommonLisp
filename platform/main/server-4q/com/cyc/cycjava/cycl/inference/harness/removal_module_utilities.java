package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.modules.forward_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_module_utilities extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "bab082c2b86823f5fd6d3a14560488abd4ca75f913c17f579f3586d6aeb7d173";
    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 7200L)
    private static SubLSymbol $modules_require_negation_by_failure$;
    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 9000L)
    private static SubLSymbol $completeness_minimization_required_modules$;
    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 9700L)
    private static SubLSymbol $new_terms_allowed_required_modules$;
    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 10700L)
    private static SubLSymbol $evaluate_subl_required_modules$;
    private static SubLObject $$isa;
    private static SubLSymbol $ISA;
    private static SubLObject $$genlInverse;
    private static SubLSymbol $GENLPREDS;
    private static SubLObject $$genlPreds;
    private static SubLSymbol $CODE;
    private static SubLList $list6;
    private static SubLSymbol $TRUE_MON;
    private static SubLString $str8$______System__a_HL_module_statist;
    private static SubLString $str9$__HL_Modules_____________________;
    private static SubLString $str10$___Removal_Modules_______________;
    private static SubLString $str11$___Meta_Removal_Modules__________;
    private static SubLString $str12$___Conjunctive_Removal_Modules___;
    private static SubLString $str13$___Transformation_Modules________;
    private static SubLString $str14$___Meta_Transformation_Modules___;
    private static SubLString $str15$___Structural_Modules____________;
    private static SubLString $str16$___Meta_Structural_Modules_______;
    private static SubLString $str17$___Forward_Modules_______________;
    private static SubLString $str18$___Storage_Modules_______________;
    private static SubLString $str19$___Evaluatable_Predicates________;
    private static SubLString $str20$___Evaluatable_Functions_________;
    private static SubLList $list21;
    private static SubLSymbol $sym22$EMPTY_STRING_P;
    private static SubLSymbol $POS;
    private static SubLString $str24$pos;
    private static SubLSymbol $NEG;
    private static SubLString $str26$not;
    private static SubLString $str27$neg;
    private static SubLSymbol $NEW_TERMS_ALLOWED_;
    private static SubLList $list29;
    private static SubLList $list30;
    private static SubLList $list31;
    private static SubLList $list32;
    private static SubLList $list33;

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 700L)
    public static SubLObject negation_grossly_incompleteP(SubLObject asent, SubLObject sense) {
        return makeBoolean(NIL == variables.fully_bound_p(asent));
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 800L)
    public static SubLObject invert_removal_check_cost(SubLObject check_cost) {
        SubLObject inverted_check_cost = Numbers.subtract(ONE_INTEGER, check_cost);
        return Numbers.min(ONE_INTEGER, Numbers.max(ZERO_INTEGER, inverted_check_cost));
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1200L)
    public static SubLObject answer_to_singleton(SubLObject v_answer) {
        return list(v_answer);
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1500L)
    public static SubLObject non_null_answer_to_singleton(SubLObject v_answer) {
        return (NIL != v_answer) ? answer_to_singleton(v_answer) : NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1700L)
    public static SubLObject invert_boolean_answer(SubLObject v_answer) {
        return makeBoolean(NIL == v_answer);
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1800L)
    public static SubLObject additional_isa_support(SubLObject v_object, SubLObject collection) {
        SubLObject hl_formula = list($$isa, v_object, collection);
        SubLObject hl_support = arguments.make_hl_support($ISA, hl_formula, UNPROVIDED, UNPROVIDED);
        return hl_support;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2100L)
    public static SubLObject additional_isa_supports(SubLObject v_object, SubLObject collection) {
        return list(additional_isa_support(v_object, collection));
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2200L)
    public static SubLObject make_genl_inverse_support(SubLObject spec_pred, SubLObject genl_pred) {
        SubLObject hl_formula = list($$genlInverse, spec_pred, genl_pred);
        SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
        return hl_support;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2500L)
    public static SubLObject additional_genl_inverse_supports(SubLObject spec_pred, SubLObject genl_pred) {
        if (!spec_pred.eql(genl_pred)) {
            return list(make_genl_inverse_support(spec_pred, genl_pred));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2600L)
    public static SubLObject make_genl_preds_support(SubLObject spec_pred, SubLObject genl_pred) {
        SubLObject hl_formula = list($$genlPreds, spec_pred, genl_pred);
        SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
        return hl_support;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2800L)
    public static SubLObject additional_genl_preds_supports(SubLObject spec_pred, SubLObject genl_pred) {
        if (!spec_pred.eql(genl_pred)) {
            return list(make_genl_preds_support(spec_pred, genl_pred));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 3000L)
    public static SubLObject make_simplification_support() {
        return arguments.make_hl_support($CODE, $list6, mt_vars.$equals_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 3200L)
    public static SubLObject hl_module_count() {
        return Numbers.add(new SubLObject[] { inference_modules.removal_module_count(), inference_modules.meta_removal_module_count(), inference_modules.conjunctive_removal_module_count(), inference_modules.transformation_module_count(), inference_modules.meta_transformation_module_count(),
                inference_modules.structural_module_count(), inference_modules.meta_structural_module_count(), forward_modules.forward_module_count(), hl_storage_modules.hl_storage_module_count(), evaluation_defns.evaluatable_predicate_count(), evaluation_defns.evaluatable_function_count() });
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 3700L)
    public static SubLObject hl_module_statistics(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject removal_module_count = inference_modules.removal_module_count();
        SubLObject meta_removal_module_count = inference_modules.meta_removal_module_count();
        SubLObject conjunctive_removal_module_count = inference_modules.conjunctive_removal_module_count();
        SubLObject transformation_module_count = inference_modules.transformation_module_count();
        SubLObject meta_transformation_module_count = inference_modules.meta_transformation_module_count();
        SubLObject structural_module_count = inference_modules.structural_module_count();
        SubLObject meta_structural_module_count = inference_modules.meta_structural_module_count();
        SubLObject forward_module_count = forward_modules.forward_module_count();
        SubLObject hl_storage_module_count = hl_storage_modules.hl_storage_module_count();
        SubLObject evaluatable_predicate_count = evaluation_defns.evaluatable_predicate_count();
        SubLObject evaluatable_function_count = evaluation_defns.evaluatable_function_count();
        SubLObject hl_module_count = Numbers.add(
                new SubLObject[] { removal_module_count, meta_removal_module_count, conjunctive_removal_module_count, transformation_module_count, meta_transformation_module_count, forward_module_count, hl_storage_module_count, evaluatable_predicate_count, evaluatable_function_count });
        PrintLow.format(stream, $str8$______System__a_HL_module_statist, system_info.cyc_revision_string());
        PrintLow.format(stream, $str9$__HL_Modules_____________________, hl_module_count);
        PrintLow.format(stream, $str10$___Removal_Modules_______________, removal_module_count);
        PrintLow.format(stream, $str11$___Meta_Removal_Modules__________, meta_removal_module_count);
        PrintLow.format(stream, $str12$___Conjunctive_Removal_Modules___, conjunctive_removal_module_count);
        PrintLow.format(stream, $str13$___Transformation_Modules________, transformation_module_count);
        PrintLow.format(stream, $str14$___Meta_Transformation_Modules___, meta_transformation_module_count);
        PrintLow.format(stream, $str15$___Structural_Modules____________, structural_module_count);
        PrintLow.format(stream, $str16$___Meta_Structural_Modules_______, meta_structural_module_count);
        PrintLow.format(stream, $str17$___Forward_Modules_______________, forward_module_count);
        PrintLow.format(stream, $str18$___Storage_Modules_______________, hl_storage_module_count);
        PrintLow.format(stream, $str19$___Evaluatable_Predicates________, evaluatable_predicate_count);
        PrintLow.format(stream, $str20$___Evaluatable_Functions_________, evaluatable_function_count);
        streams_high.terpri(stream);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 6000L)
    public static SubLObject determine_hl_module_name(SubLObject string, SubLObject sense) {
        SubLObject break_list = append(string_utilities.whitespace_chars(), $list21);
        SubLObject substrings = Sequences.delete_if($sym22$EMPTY_STRING_P, string_utilities.string_tokenize(string, break_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (sense.eql($POS)) {
            substrings = list_utilities.snoc($str24$pos, substrings);
        } else if (sense.eql($NEG)) {
            if (NIL != string_utilities.substringP($str26$not, substrings.first(), Symbols.symbol_function(EQUALP), UNPROVIDED, UNPROVIDED)) {
                substrings = list_utilities.snoc($str27$neg, substrings.rest());
            } else {
                substrings = list_utilities.snoc($str27$neg, substrings);
            }
        }
        return make_removal_module_name(substrings);
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 6700L)
    public static SubLObject make_removal_module_name(SubLObject substrings) {
        SubLObject string = Strings.string_upcase(string_utilities.bunge(substrings, Characters.CHAR_hyphen), UNPROVIDED, UNPROVIDED);
        SubLObject symbol = Symbols.gensym(string);
        SubLObject keyword = Symbols.make_keyword(symbol);
        return keyword;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 7000L)
    public static SubLObject current_query_allows_new_termsP() {
        SubLObject store = inference_worker.currently_active_problem_store();
        if (NIL != store) {
            return inference_datastructures_problem_store.problem_store_new_terms_allowedP(store);
        }
        return inference_trivial.current_query_property_lookup($NEW_TERMS_ALLOWED_);
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 8900L)
    public static SubLObject module_requires_negation_by_failureP(SubLObject module_name) {
        return list_utilities.member_eqP(module_name, $modules_require_negation_by_failure$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 9500L)
    public static SubLObject module_requires_completeness_minimization_for_supportP(SubLObject module_name, SubLObject hl_support) {
        SubLObject cdolist_list_var = $completeness_minimization_required_modules$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = cons;
            SubLObject module = NIL;
            SubLObject support = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
            module = current.first();
            current = (support = current.rest());
            if (module_name.eql(module) && hl_support.eql(support)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 10500L)
    public static SubLObject module_requires_new_terms_allowedP(SubLObject module_name) {
        return list_utilities.member_eqP(module_name, $new_terms_allowed_required_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 10900L)
    public static SubLObject module_requires_evaluate_sublP(SubLObject module_name) {
        return list_utilities.member_eqP(module_name, $evaluate_subl_required_modules$.getGlobalValue());
    }

    public static SubLObject declare_removal_module_utilities_file() {
        declareFunction("negation_grossly_incompleteP", "NEGATION-GROSSLY-INCOMPLETE?", 2, 0, false);
        declareFunction("invert_removal_check_cost", "INVERT-REMOVAL-CHECK-COST", 1, 0, false);
        declareFunction("answer_to_singleton", "ANSWER-TO-SINGLETON", 1, 0, false);
        declareFunction("non_null_answer_to_singleton", "NON-NULL-ANSWER-TO-SINGLETON", 1, 0, false);
        declareFunction("invert_boolean_answer", "INVERT-BOOLEAN-ANSWER", 1, 0, false);
        declareFunction("additional_isa_support", "ADDITIONAL-ISA-SUPPORT", 2, 0, false);
        declareFunction("additional_isa_supports", "ADDITIONAL-ISA-SUPPORTS", 2, 0, false);
        declareFunction("make_genl_inverse_support", "MAKE-GENL-INVERSE-SUPPORT", 2, 0, false);
        declareFunction("additional_genl_inverse_supports", "ADDITIONAL-GENL-INVERSE-SUPPORTS", 2, 0, false);
        declareFunction("make_genl_preds_support", "MAKE-GENL-PREDS-SUPPORT", 2, 0, false);
        declareFunction("additional_genl_preds_supports", "ADDITIONAL-GENL-PREDS-SUPPORTS", 2, 0, false);
        declareFunction("make_simplification_support", "MAKE-SIMPLIFICATION-SUPPORT", 0, 0, false);
        declareFunction("hl_module_count", "HL-MODULE-COUNT", 0, 0, false);
        declareFunction("hl_module_statistics", "HL-MODULE-STATISTICS", 0, 1, false);
        declareFunction("determine_hl_module_name", "DETERMINE-HL-MODULE-NAME", 2, 0, false);
        declareFunction("make_removal_module_name", "MAKE-REMOVAL-MODULE-NAME", 1, 0, false);
        declareFunction("current_query_allows_new_termsP", "CURRENT-QUERY-ALLOWS-NEW-TERMS?", 0, 0, false);
        declareFunction("module_requires_negation_by_failureP", "MODULE-REQUIRES-NEGATION-BY-FAILURE?", 1, 0, false);
        declareFunction("module_requires_completeness_minimization_for_supportP", "MODULE-REQUIRES-COMPLETENESS-MINIMIZATION-FOR-SUPPORT?", 2, 0, false);
        declareFunction("module_requires_new_terms_allowedP", "MODULE-REQUIRES-NEW-TERMS-ALLOWED?", 1, 0, false);
        declareFunction("module_requires_evaluate_sublP", "MODULE-REQUIRES-EVALUATE-SUBL?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_module_utilities_file() {
        $modules_require_negation_by_failure$ = deflexical("*MODULES-REQUIRE-NEGATION-BY-FAILURE*", $list29);
        $completeness_minimization_required_modules$ = SubLFiles.deflexical("*COMPLETENESS-MINIMIZATION-REQUIRED-MODULES*", $list30);
        $new_terms_allowed_required_modules$ = deflexical("*NEW-TERMS-ALLOWED-REQUIRED-MODULES*", $list32);
        $evaluate_subl_required_modules$ = deflexical("*EVALUATE-SUBL-REQUIRED-MODULES*", $list33);
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

    static {
        me = new removal_module_utilities();
        $modules_require_negation_by_failure$ = null;
        $completeness_minimization_required_modules$ = null;
        $new_terms_allowed_required_modules$ = null;
        $evaluate_subl_required_modules$ = null;
        $$isa = makeConstSym(("isa"));
        $ISA = makeKeyword("ISA");
        $$genlInverse = makeConstSym(("genlInverse"));
        $GENLPREDS = makeKeyword("GENLPREDS");
        $$genlPreds = makeConstSym(("genlPreds"));
        $CODE = makeKeyword("CODE");
        $list6 = list(makeConstSym(("equals")), makeSymbol("?X"), makeSymbol("?X"));
        $TRUE_MON = makeKeyword("TRUE-MON");
        $str8$______System__a_HL_module_statist = makeString("~%;;; System ~a HL module statistics");
        $str9$__HL_Modules_____________________ = makeString("~%HL Modules                   : ~6,' D");
        $str10$___Removal_Modules_______________ = makeString("~% Removal Modules             : ~6,' D");
        $str11$___Meta_Removal_Modules__________ = makeString("~% Meta-Removal Modules        : ~6,' D");
        $str12$___Conjunctive_Removal_Modules___ = makeString("~% Conjunctive Removal Modules : ~6,' D");
        $str13$___Transformation_Modules________ = makeString("~% Transformation Modules      : ~6,' D");
        $str14$___Meta_Transformation_Modules___ = makeString("~% Meta-Transformation Modules : ~6,' D");
        $str15$___Structural_Modules____________ = makeString("~% Structural Modules          : ~6,' D");
        $str16$___Meta_Structural_Modules_______ = makeString("~% Meta-Structural Modules     : ~6,' D");
        $str17$___Forward_Modules_______________ = makeString("~% Forward Modules             : ~6,' D");
        $str18$___Storage_Modules_______________ = makeString("~% Storage Modules             : ~6,' D");
        $str19$___Evaluatable_Predicates________ = makeString("~% Evaluatable Predicates      : ~6,' D");
        $str20$___Evaluatable_Functions_________ = makeString("~% Evaluatable Functions       : ~6,' D");
        $list21 = list(Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_less, Characters.CHAR_greater, makeString("#$"), Characters.CHAR_period);
        $sym22$EMPTY_STRING_P = makeSymbol("EMPTY-STRING-P");
        $POS = makeKeyword("POS");
        $str24$pos = makeString("pos");
        $NEG = makeKeyword("NEG");
        $str26$not = makeString("not");
        $str27$neg = makeString("neg");
        $NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
        $list29 = list(new SubLObject[] { makeKeyword("REMOVAL-NOT-ISA-COLLECTION-CHECK"), makeKeyword("REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK"), makeKeyword("REMOVAL-NOT-CONCEPTUALLY-RELATED"), makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK"), makeKeyword("REMOVAL-NOT-GENLINVERSE-CHECK"),
                makeKeyword("REMOVAL-NOT-GENLMT-CHECK"), makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK"), makeKeyword("REMOVAL-NOT-SUPERSET"), makeKeyword("REMOVAL-MINIMIZE-EXTENT"), makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK"), makeKeyword("REMOVAL-NOT-NEGATIONPREDS-CHECK"),
                makeKeyword("REMOVAL-NOT-STARTS-AFTER-STARTING-OF"), makeKeyword("REMOVAL-NOT-STARTS-AFTER-ENDING-OF"), makeKeyword("REMOVAL-NOT-ENDS-AFTER-STARTING-OF"), makeKeyword("REMOVAL-NOT-ENDS-AFTER-ENDING-OF"), makeKeyword("REMOVAL-NOT-TEMPORALLY-SUBSUMES"),
                makeKeyword("REMOVAL-NOT-DATE-OF-EVENT"), makeKeyword("REMOVAL-NOT-COTEMPORAL"), makeKeyword("REMOVAL-NOT-TEMPORALLY-INTERSECTS"), makeKeyword("REMOVAL-NOT-TEMPORALLY-DISJOINT"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME"),
                makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL"), makeKeyword("REMOVAL-NOT-TEMPORALLY-COORIGINATING"), makeKeyword("REMOVAL-NOT-TEMPORALLY-COTERMINAL"), makeKeyword("REMOVAL-NOT-CONTIGUOUS-AFTER"),
                makeKeyword("REMOVAL-NOT-STARTS-DURING"), makeKeyword("REMOVAL-NOT-ENDS-DURING"), makeKeyword("REMOVAL-NOT-STARTING-DATE"), makeKeyword("REMOVAL-NOT-ENDING-DATE"), makeKeyword("REMOVAL-NOT-BIRTH-DATE"), makeKeyword("REMOVAL-NOT-DATE-OF-DEATH"),
                makeKeyword("REMOVAL-NOT-TEMPORALLY-STARTED-BY"), makeKeyword("REMOVAL-NOT-TEMPORALLY-FINISHED-BY"), makeKeyword("REMOVAL-NOT-OVERLAPS-START") });
        $list30 = list(cons(makeKeyword("REMOVAL-NOT-ISA-COLLECTION-CHECK"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-ISA-DEFN-REJECT"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK"), makeKeyword("ISA")),
                cons(makeKeyword("REMOVAL-QUOTED-ISA-DEFN-REJECT"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG"), makeKeyword("MINIMIZE")));
        $list31 = cons(makeSymbol("MODULE"), makeSymbol("SUPPORT"));
        $list32 = list(new SubLObject[] { makeKeyword("REMOVAL-SKOLEMIZE-CREATE"), makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY"), makeKeyword("REMOVAL-RELATION-EXISTS-ALL-UNIFY"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1"),
                makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1"),
                makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2") });
        $list33 = list(makeKeyword("REMOVAL-PERFORM-SUBL-POS"), makeKeyword("REMOVAL-PERFORM-SUBL-NEG"));
    }
}
/*
 *
 * Total time: 53 ms
 *
 */