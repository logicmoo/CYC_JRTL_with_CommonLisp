package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.mt_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class mt_vars extends SubLTranslatedFile {
    public static final SubLFile me = new mt_vars();

    public static final String myName = "com.cyc.cycjava.cycl.mt_vars";

    public static final String myFingerPrint = "c8287c48409ed3a8f507cd9ca0c0edf59042fe6e2f6a254799f980503958c33d";

    // deflexical
    public static final SubLSymbol $mt_var_basis_table$ = makeSymbol("*MT-VAR-BASIS-TABLE*");































































    // defparameter
    /**
     * Temporary control variable ; controls whether or not genlMt has special-case
     * optimization for core-microtheory-p
     */
    public static final SubLSymbol $core_mt_optimization_enabledP$ = makeSymbol("*CORE-MT-OPTIMIZATION-ENABLED?*");

    // deflexical
    /**
     * The cluster of mts up near the root of the microtheory hierarchy. Ordered
     * from max (topmost) to min (lowest).
     */
    private static final SubLSymbol $core_mts$ = makeSymbol("*CORE-MTS*");

    // deflexical
    /**
     * The cluster of mts up near the root of the microtheory hierarchy. Min
     * numbered is topmost.
     */
    private static final SubLSymbol $ordered_core_mts$ = makeSymbol("*ORDERED-CORE-MTS*");

    // deflexical
    private static final SubLSymbol $special_loop_core_mts$ = makeSymbol("*SPECIAL-LOOP-CORE-MTS*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("VAR"), makeSymbol("DEFAULT"), makeSymbol("&OPTIONAL"), makeSymbol("BASIS"), makeSymbol("COMMENT"));

    public static final SubLString $str1$Illegal_basis_argument_to_defglob = makeString("Illegal basis argument to defglobal-mt-var: ~s");



    public static final SubLSymbol DEFGLOBAL_PROTECTED = makeSymbol("DEFGLOBAL-PROTECTED");

    public static final SubLSymbol NOTE_MT_VAR = makeSymbol("NOTE-MT-VAR");



    public static final SubLSymbol $mt_root$ = makeSymbol("*MT-ROOT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLSymbol $theory_mt_root$ = makeSymbol("*THEORY-MT-ROOT*");

    public static final SubLSymbol $assertible_mt_root$ = makeSymbol("*ASSERTIBLE-MT-ROOT*");

    public static final SubLSymbol $assertible_theory_mt_root$ = makeSymbol("*ASSERTIBLE-THEORY-MT-ROOT*");

    public static final SubLSymbol $core_mt_floor$ = makeSymbol("*CORE-MT-FLOOR*");

    public static final SubLSymbol $mt_mt$ = makeSymbol("*MT-MT*");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    public static final SubLSymbol $defining_mt_mt$ = makeSymbol("*DEFINING-MT-MT*");

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    public static final SubLSymbol $decontextualized_predicate_mt$ = makeSymbol("*DECONTEXTUALIZED-PREDICATE-MT*");

    private static final SubLObject $$decontextualizedPredicate = reader_make_constant_shell(makeString("decontextualizedPredicate"));

    public static final SubLSymbol $decontextualized_collection_mt$ = makeSymbol("*DECONTEXTUALIZED-COLLECTION-MT*");

    private static final SubLObject $$decontextualizedCollection = reader_make_constant_shell(makeString("decontextualizedCollection"));

    public static final SubLSymbol $ephemeral_term_mt$ = makeSymbol("*EPHEMERAL-TERM-MT*");

    private static final SubLObject $$ephemeralTerm = reader_make_constant_shell(makeString("ephemeralTerm"));

    public static final SubLSymbol $ist_mt$ = makeSymbol("*IST-MT*");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    public static final SubLSymbol $inference_related_bookkeeping_predicate_mt$ = makeSymbol("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*");

    private static final SubLObject $const26$InferenceRelatedBookkeepingPredic = reader_make_constant_shell(makeString("InferenceRelatedBookkeepingPredicate"));

    public static final SubLSymbol $anect_mt$ = makeSymbol("*ANECT-MT*");

    private static final SubLObject $const28$AtemporalNecessarilyEssentialColl = reader_make_constant_shell(makeString("AtemporalNecessarilyEssentialCollectionType"));

    public static final SubLSymbol $broad_mt_mt$ = makeSymbol("*BROAD-MT-MT*");

    private static final SubLObject $$BroadMicrotheory = reader_make_constant_shell(makeString("BroadMicrotheory"));

    public static final SubLSymbol $psc_mt$ = makeSymbol("*PSC-MT*");

    private static final SubLObject $$ProblemSolvingCntxt = reader_make_constant_shell(makeString("ProblemSolvingCntxt"));

    public static final SubLSymbol $tou_mt$ = makeSymbol("*TOU-MT*");

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    public static final SubLSymbol $skolem_mt$ = makeSymbol("*SKOLEM-MT*");

    private static final SubLObject $$skolem = reader_make_constant_shell(makeString("skolem"));

    public static final SubLSymbol $thing_defining_mt$ = makeSymbol("*THING-DEFINING-MT*");

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    public static final SubLSymbol $relation_defining_mt$ = makeSymbol("*RELATION-DEFINING-MT*");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    public static final SubLSymbol $equals_defining_mt$ = makeSymbol("*EQUALS-DEFINING-MT*");

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    public static final SubLSymbol $element_of_defining_mt$ = makeSymbol("*ELEMENT-OF-DEFINING-MT*");

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    public static final SubLSymbol $subset_of_defining_mt$ = makeSymbol("*SUBSET-OF-DEFINING-MT*");

    private static final SubLObject $$subsetOf = reader_make_constant_shell(makeString("subsetOf"));

    public static final SubLSymbol $arity_mt$ = makeSymbol("*ARITY-MT*");

    private static final SubLObject $$arity = reader_make_constant_shell(makeString("arity"));

    public static final SubLSymbol $sublid_mt$ = makeSymbol("*SUBLID-MT*");

    private static final SubLObject $$CycAPIMt = reader_make_constant_shell(makeString("CycAPIMt"));

    private static final SubLObject $$subLIdentifier = reader_make_constant_shell(makeString("subLIdentifier"));

    public static final SubLSymbol $not_assertible_mt_convention_mt$ = makeSymbol("*NOT-ASSERTIBLE-MT-CONVENTION-MT*");

    private static final SubLObject $$notAssertibleMt = reader_make_constant_shell(makeString("notAssertibleMt"));

    public static final SubLSymbol $default_ask_mt$ = makeSymbol("*DEFAULT-ASK-MT*");

    public static final SubLSymbol $default_assert_mt$ = makeSymbol("*DEFAULT-ASSERT-MT*");

    public static final SubLSymbol $default_clone_mt$ = makeSymbol("*DEFAULT-CLONE-MT*");

    public static final SubLSymbol $default_support_mt$ = makeSymbol("*DEFAULT-SUPPORT-MT*");

    public static final SubLSymbol $default_comment_mt$ = makeSymbol("*DEFAULT-COMMENT-MT*");

    public static final SubLSymbol $default_convention_mt$ = makeSymbol("*DEFAULT-CONVENTION-MT*");

    public static final SubLList $list60 = list(reader_make_constant_shell(makeString("LogicalTruthMt")), reader_make_constant_shell(makeString("LogicalTruthImplementationMt")), reader_make_constant_shell(makeString("CoreCycLMt")), reader_make_constant_shell(makeString("CoreCycLImplementationMt")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), reader_make_constant_shell(makeString("UniversalVocabularyImplementationMt")), reader_make_constant_shell(makeString("BaseKB")));

    public static final SubLList $list61 = list(cons(reader_make_constant_shell(makeString("LogicalTruthMt")), ZERO_INTEGER), cons(reader_make_constant_shell(makeString("LogicalTruthImplementationMt")), ZERO_INTEGER), cons(reader_make_constant_shell(makeString("CoreCycLMt")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("CoreCycLImplementationMt")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("UniversalVocabularyMt")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("UniversalVocabularyImplementationMt")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("BaseKB")), THREE_INTEGER));

    public static final SubLList $list62 = list(reader_make_constant_shell(makeString("UniversalVocabularyMt")), reader_make_constant_shell(makeString("BaseKB")));

    public static final SubLSymbol CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");

    public static final SubLSymbol $sym64$CORE_MICROTHEORY__ = makeSymbol("CORE-MICROTHEORY-<");

    public static final SubLSymbol $sym65$CORE_MICROTHEORY__ = makeSymbol("CORE-MICROTHEORY->");

    public static final SubLSymbol $sym66$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    public static SubLObject defglobal_mt_var(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        SubLObject v_default = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_default = current.first();
        current = current.rest();
        final SubLObject basis = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list0);
        current = current.rest();
        final SubLObject comment = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list0);
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && basis.isString()) {
                Errors.error($str1$Illegal_basis_argument_to_defglob, basis);
            }
            return list(PROGN, list(DEFGLOBAL_PROTECTED, var, v_default, comment), list(NOTE_MT_VAR, list(QUOTE, var), basis));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject note_mt_var(final SubLObject var, SubLObject basis) {
        if (basis == UNPROVIDED) {
            basis = NIL;
        }
        if (NIL != basis) {
            note_mt_var_basis(var, basis);
        }
        return NIL;
    }

    public static SubLObject note_mt_var_basis(final SubLObject var, final SubLObject basis) {
        return dictionary.dictionary_enter($mt_var_basis_table$.getGlobalValue(), var, basis);
    }

    public static SubLObject mt_mt_relevantP(final SubLObject mt) {
        return genl_mts.genl_mtP($mt_mt$.getGlobalValue(), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject core_microtheory_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $core_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject core_microtheory_L(final SubLObject mt1, final SubLObject mt2) {
        final SubLObject level1 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED);
        final SubLObject level2 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED);
        if (level1.isInteger() && level2.isInteger()) {
            return numLE(level2, level1);
        }
        return NIL;
    }

    public static SubLObject core_microtheory_G(final SubLObject mt1, final SubLObject mt2) {
        final SubLObject level1 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED);
        final SubLObject level2 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED);
        if (level1.isInteger() && level2.isInteger()) {
            return numLE(level1, level2);
        }
        return NIL;
    }

    public static SubLObject core_genl_mtP(final SubLObject mt1, final SubLObject mt2) {
        if ((NIL != special_core_loop_mt_p(mt1)) && (NIL != special_core_loop_mt_p(mt2))) {
            return T;
        }
        return core_microtheory_G(mt1, mt2);
    }

    public static SubLObject core_any_genl_mtP(final SubLObject spec, final SubLObject v_genls) {
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != core_genl_mtP(spec, genl)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject special_core_loop_mt_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $special_loop_core_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject minimize_mts_wrt_core(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject core_mts = list_utilities.partition_list(mts, CORE_MICROTHEORY_P);
        final SubLObject non_core_mts = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != non_core_mts) {
            return non_core_mts;
        }
        final SubLObject min_core_mt = list_utilities.extremal(core_mts, $sym64$CORE_MICROTHEORY__, UNPROVIDED);
        return removal_module_utilities.non_null_answer_to_singleton(min_core_mt);
    }

    public static SubLObject maximize_mts_wrt_core(final SubLObject mts) {
        final SubLObject core_mts = list_utilities.remove_if_not(CORE_MICROTHEORY_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != core_mts) {
            final SubLObject max_core_mt = list_utilities.extremal(core_mts, $sym65$CORE_MICROTHEORY__, UNPROVIDED);
            return list(max_core_mt);
        }
        return mts;
    }

    public static SubLObject minimize_mt_sets_wrt_core(final SubLObject mt_sets) {
        SubLObject reduced_mt_sets = NIL;
        SubLObject cdolist_list_var = mt_sets;
        SubLObject mt_set = NIL;
        mt_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject reduced_mt_set = item_var = minimize_mts_wrt_core(mt_set);
            if (NIL == member(item_var, reduced_mt_sets, symbol_function($sym66$SETS_EQUAL_), symbol_function(IDENTITY))) {
                reduced_mt_sets = cons(item_var, reduced_mt_sets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_set = cdolist_list_var.first();
        } 
        return nreverse(reduced_mt_sets);
    }

    public static SubLObject push_core_mts_to_beginning(final SubLObject mts) {
        final SubLObject core_mts = list_utilities.remove_if_not(CORE_MICROTHEORY_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != core_mts) {
            final SubLObject non_core_mts = list_utilities.ordered_set_difference(mts, core_mts, UNPROVIDED, UNPROVIDED);
            final SubLObject sorted_core_mts = Sort.sort(core_mts, $sym65$CORE_MICROTHEORY__, UNPROVIDED);
            final SubLObject sorted_mts = nconc(sorted_core_mts, non_core_mts);
            return sorted_mts;
        }
        return mts;
    }

    public static SubLObject declare_mt_vars_file() {
        declareMacro(me, "defglobal_mt_var", "DEFGLOBAL-MT-VAR");
        declareFunction(me, "note_mt_var", "NOTE-MT-VAR", 1, 1, false);
        declareFunction(me, "note_mt_var_basis", "NOTE-MT-VAR-BASIS", 2, 0, false);
        declareFunction(me, "mt_mt_relevantP", "MT-MT-RELEVANT?", 1, 0, false);
        declareFunction(me, "core_microtheory_p", "CORE-MICROTHEORY-P", 1, 0, false);
        new mt_vars.$core_microtheory_p$UnaryFunction();
        declareFunction(me, "core_microtheory_L", "CORE-MICROTHEORY-<", 2, 0, false);
        declareFunction(me, "core_microtheory_G", "CORE-MICROTHEORY->", 2, 0, false);
        declareFunction(me, "core_genl_mtP", "CORE-GENL-MT?", 2, 0, false);
        declareFunction(me, "core_any_genl_mtP", "CORE-ANY-GENL-MT?", 2, 0, false);
        declareFunction(me, "special_core_loop_mt_p", "SPECIAL-CORE-LOOP-MT-P", 1, 0, false);
        new mt_vars.$special_core_loop_mt_p$UnaryFunction();
        declareFunction(me, "minimize_mts_wrt_core", "MINIMIZE-MTS-WRT-CORE", 1, 0, false);
        declareFunction(me, "maximize_mts_wrt_core", "MAXIMIZE-MTS-WRT-CORE", 1, 0, false);
        declareFunction(me, "minimize_mt_sets_wrt_core", "MINIMIZE-MT-SETS-WRT-CORE", 1, 0, false);
        declareFunction(me, "push_core_mts_to_beginning", "PUSH-CORE-MTS-TO-BEGINNING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_mt_vars_file() {
        deflexical("*MT-VAR-BASIS-TABLE*", dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        deflexical("*MT-ROOT*", SubLTrampolineFile.maybeDefault($mt_root$, $mt_root$, $$BaseKB));
        deflexical("*THEORY-MT-ROOT*", SubLTrampolineFile.maybeDefault($theory_mt_root$, $theory_mt_root$, $$BaseKB));
        deflexical("*ASSERTIBLE-MT-ROOT*", SubLTrampolineFile.maybeDefault($assertible_mt_root$, $assertible_mt_root$, $$BaseKB));
        deflexical("*ASSERTIBLE-THEORY-MT-ROOT*", SubLTrampolineFile.maybeDefault($assertible_theory_mt_root$, $assertible_theory_mt_root$, $$BaseKB));
        deflexical("*CORE-MT-FLOOR*", SubLTrampolineFile.maybeDefault($core_mt_floor$, $core_mt_floor$, $$BaseKB));
        deflexical("*MT-MT*", SubLTrampolineFile.maybeDefault($mt_mt$, $mt_mt$, $$UniversalVocabularyMt));
        deflexical("*DEFINING-MT-MT*", SubLTrampolineFile.maybeDefault($defining_mt_mt$, $defining_mt_mt$, $$BaseKB));
        deflexical("*DECONTEXTUALIZED-PREDICATE-MT*", SubLTrampolineFile.maybeDefault($decontextualized_predicate_mt$, $decontextualized_predicate_mt$, $$BaseKB));
        deflexical("*DECONTEXTUALIZED-COLLECTION-MT*", SubLTrampolineFile.maybeDefault($decontextualized_collection_mt$, $decontextualized_collection_mt$, $$BaseKB));
        deflexical("*EPHEMERAL-TERM-MT*", SubLTrampolineFile.maybeDefault($ephemeral_term_mt$, $ephemeral_term_mt$, $$BaseKB));
        deflexical("*IST-MT*", SubLTrampolineFile.maybeDefault($ist_mt$, $ist_mt$, $$BaseKB));
        deflexical("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*", SubLTrampolineFile.maybeDefault($inference_related_bookkeeping_predicate_mt$, $inference_related_bookkeeping_predicate_mt$, $$BaseKB));
        deflexical("*ANECT-MT*", SubLTrampolineFile.maybeDefault($anect_mt$, $anect_mt$, $$UniversalVocabularyMt));
        deflexical("*BROAD-MT-MT*", SubLTrampolineFile.maybeDefault($broad_mt_mt$, $broad_mt_mt$, $$BaseKB));
        deflexical("*PSC-MT*", SubLTrampolineFile.maybeDefault($psc_mt$, $psc_mt$, $$BaseKB));
        deflexical("*TOU-MT*", SubLTrampolineFile.maybeDefault($tou_mt$, $tou_mt$, $$BaseKB));
        deflexical("*SKOLEM-MT*", SubLTrampolineFile.maybeDefault($skolem_mt$, $skolem_mt$, $$BaseKB));
        deflexical("*THING-DEFINING-MT*", SubLTrampolineFile.maybeDefault($thing_defining_mt$, $thing_defining_mt$, $$BaseKB));
        deflexical("*RELATION-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_defining_mt$, $relation_defining_mt$, $$BaseKB));
        deflexical("*EQUALS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($equals_defining_mt$, $equals_defining_mt$, $$BaseKB));
        deflexical("*ELEMENT-OF-DEFINING-MT*", SubLTrampolineFile.maybeDefault($element_of_defining_mt$, $element_of_defining_mt$, $$BaseKB));
        deflexical("*SUBSET-OF-DEFINING-MT*", SubLTrampolineFile.maybeDefault($subset_of_defining_mt$, $subset_of_defining_mt$, $$BaseKB));
        deflexical("*ARITY-MT*", SubLTrampolineFile.maybeDefault($arity_mt$, $arity_mt$, $$UniversalVocabularyMt));
        deflexical("*SUBLID-MT*", SubLTrampolineFile.maybeDefault($sublid_mt$, $sublid_mt$, $$CycAPIMt));
        deflexical("*NOT-ASSERTIBLE-MT-CONVENTION-MT*", SubLTrampolineFile.maybeDefault($not_assertible_mt_convention_mt$, $not_assertible_mt_convention_mt$, $$UniversalVocabularyMt));
        deflexical("*DEFAULT-ASK-MT*", SubLTrampolineFile.maybeDefault($default_ask_mt$, $default_ask_mt$, $$BaseKB));
        deflexical("*DEFAULT-ASSERT-MT*", SubLTrampolineFile.maybeDefault($default_assert_mt$, $default_assert_mt$, $$BaseKB));
        deflexical("*DEFAULT-CLONE-MT*", SubLTrampolineFile.maybeDefault($default_clone_mt$, $default_clone_mt$, $$BaseKB));
        deflexical("*DEFAULT-SUPPORT-MT*", SubLTrampolineFile.maybeDefault($default_support_mt$, $default_support_mt$, $$BaseKB));
        deflexical("*DEFAULT-COMMENT-MT*", SubLTrampolineFile.maybeDefault($default_comment_mt$, $default_comment_mt$, $$BaseKB));
        deflexical("*DEFAULT-CONVENTION-MT*", SubLTrampolineFile.maybeDefault($default_convention_mt$, $default_convention_mt$, $$UniversalVocabularyMt));
        defparameter("*CORE-MT-OPTIMIZATION-ENABLED?*", T);
        deflexical("*CORE-MTS*", $list60);
        deflexical("*ORDERED-CORE-MTS*", $list61);
        deflexical("*SPECIAL-LOOP-CORE-MTS*", $list62);
        return NIL;
    }

    public static SubLObject setup_mt_vars_file() {
        declare_defglobal($mt_root$);
        note_mt_var($mt_root$, NIL);
        declare_defglobal($theory_mt_root$);
        note_mt_var($theory_mt_root$, NIL);
        declare_defglobal($assertible_mt_root$);
        note_mt_var($assertible_mt_root$, NIL);
        declare_defglobal($assertible_theory_mt_root$);
        note_mt_var($assertible_theory_mt_root$, NIL);
        declare_defglobal($core_mt_floor$);
        note_mt_var($core_mt_floor$, NIL);
        declare_defglobal($mt_mt$);
        note_mt_var($mt_mt$, $$Microtheory);
        declare_defglobal($defining_mt_mt$);
        note_mt_var($defining_mt_mt$, $$definingMt);
        declare_defglobal($decontextualized_predicate_mt$);
        note_mt_var($decontextualized_predicate_mt$, $$decontextualizedPredicate);
        declare_defglobal($decontextualized_collection_mt$);
        note_mt_var($decontextualized_collection_mt$, $$decontextualizedCollection);
        declare_defglobal($ephemeral_term_mt$);
        note_mt_var($ephemeral_term_mt$, $$ephemeralTerm);
        declare_defglobal($ist_mt$);
        note_mt_var($ist_mt$, $$ist);
        declare_defglobal($inference_related_bookkeeping_predicate_mt$);
        note_mt_var($inference_related_bookkeeping_predicate_mt$, $const26$InferenceRelatedBookkeepingPredic);
        declare_defglobal($anect_mt$);
        note_mt_var($anect_mt$, $const28$AtemporalNecessarilyEssentialColl);
        declare_defglobal($broad_mt_mt$);
        note_mt_var($broad_mt_mt$, $$BroadMicrotheory);
        declare_defglobal($psc_mt$);
        note_mt_var($psc_mt$, $$ProblemSolvingCntxt);
        declare_defglobal($tou_mt$);
        note_mt_var($tou_mt$, $$termOfUnit);
        declare_defglobal($skolem_mt$);
        note_mt_var($skolem_mt$, $$skolem);
        declare_defglobal($thing_defining_mt$);
        note_mt_var($thing_defining_mt$, $$Thing);
        declare_defglobal($relation_defining_mt$);
        note_mt_var($relation_defining_mt$, $$Relation);
        declare_defglobal($equals_defining_mt$);
        note_mt_var($equals_defining_mt$, $$equals);
        declare_defglobal($element_of_defining_mt$);
        note_mt_var($element_of_defining_mt$, $$elementOf);
        declare_defglobal($subset_of_defining_mt$);
        note_mt_var($subset_of_defining_mt$, $$subsetOf);
        declare_defglobal($arity_mt$);
        note_mt_var($arity_mt$, $$arity);
        declare_defglobal($sublid_mt$);
        note_mt_var($sublid_mt$, $$subLIdentifier);
        declare_defglobal($not_assertible_mt_convention_mt$);
        note_mt_var($not_assertible_mt_convention_mt$, $$notAssertibleMt);
        declare_defglobal($default_ask_mt$);
        note_mt_var($default_ask_mt$, NIL);
        declare_defglobal($default_assert_mt$);
        note_mt_var($default_assert_mt$, NIL);
        declare_defglobal($default_clone_mt$);
        note_mt_var($default_clone_mt$, NIL);
        declare_defglobal($default_support_mt$);
        note_mt_var($default_support_mt$, NIL);
        declare_defglobal($default_comment_mt$);
        note_mt_var($default_comment_mt$, NIL);
        declare_defglobal($default_convention_mt$);
        note_mt_var($default_convention_mt$, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mt_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_mt_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mt_vars_file();
    }

    static {








































































































    }

    public static final class $core_microtheory_p$UnaryFunction extends UnaryFunction {
        public $core_microtheory_p$UnaryFunction() {
            super(extractFunctionNamed("CORE-MICROTHEORY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return core_microtheory_p(arg1);
        }
    }

    public static final class $special_core_loop_mt_p$UnaryFunction extends UnaryFunction {
        public $special_core_loop_mt_p$UnaryFunction() {
            super(extractFunctionNamed("SPECIAL-CORE-LOOP-MT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return special_core_loop_mt_p(arg1);
        }
    }
}

/**
 * Total time: 174 ms
 */
