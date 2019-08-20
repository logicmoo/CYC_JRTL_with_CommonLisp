/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class mt_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new mt_vars();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $mt_var_basis_table$ = makeSymbol("*MT-VAR-BASIS-TABLE*");

    // defparameter
    /**
     * Temporary control variable ; controls whether or not genlMt has special-case
     * optimization for core-microtheory-p
     */
    @LispMethod(comment = "Temporary control variable ; controls whether or not genlMt has special-case\r\noptimization for core-microtheory-p\ndefparameter\nTemporary control variable ; controls whether or not genlMt has special-case\noptimization for core-microtheory-p")
    public static final SubLSymbol $core_mt_optimization_enabledP$ = makeSymbol("*CORE-MT-OPTIMIZATION-ENABLED?*");

    // deflexical
    /**
     * The cluster of mts up near the root of the microtheory hierarchy. Ordered
     * from max (topmost) to min (lowest).
     */
    @LispMethod(comment = "The cluster of mts up near the root of the microtheory hierarchy. Ordered\r\nfrom max (topmost) to min (lowest).\ndeflexical\nThe cluster of mts up near the root of the microtheory hierarchy. Ordered\nfrom max (topmost) to min (lowest).")
    private static final SubLSymbol $core_mts$ = makeSymbol("*CORE-MTS*");

    // deflexical
    /**
     * The cluster of mts up near the root of the microtheory hierarchy. Min
     * numbered is topmost.
     */
    @LispMethod(comment = "The cluster of mts up near the root of the microtheory hierarchy. Min\r\nnumbered is topmost.\ndeflexical\nThe cluster of mts up near the root of the microtheory hierarchy. Min\nnumbered is topmost.")
    private static final SubLSymbol $ordered_core_mts$ = makeSymbol("*ORDERED-CORE-MTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $special_loop_core_mts$ = makeSymbol("*SPECIAL-LOOP-CORE-MTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("VAR"), makeSymbol("DEFAULT"), makeSymbol("&OPTIONAL"), makeSymbol("BASIS"), makeSymbol("COMMENT"));

    static private final SubLString $str1$Illegal_basis_argument_to_defglob = makeString("Illegal basis argument to defglobal-mt-var: ~s");

    private static final SubLSymbol DEFGLOBAL_PROTECTED = makeSymbol("DEFGLOBAL-PROTECTED");

    private static final SubLSymbol NOTE_MT_VAR = makeSymbol("NOTE-MT-VAR");

    public static final SubLSymbol $mt_root$ = makeSymbol("*MT-ROOT*");



    public static final SubLSymbol $theory_mt_root$ = makeSymbol("*THEORY-MT-ROOT*");

    public static final SubLSymbol $assertible_mt_root$ = makeSymbol("*ASSERTIBLE-MT-ROOT*");

    public static final SubLSymbol $assertible_theory_mt_root$ = makeSymbol("*ASSERTIBLE-THEORY-MT-ROOT*");

    public static final SubLSymbol $core_mt_floor$ = makeSymbol("*CORE-MT-FLOOR*");

    public static final SubLSymbol $mt_mt$ = makeSymbol("*MT-MT*");





    public static final SubLSymbol $defining_mt_mt$ = makeSymbol("*DEFINING-MT-MT*");



    public static final SubLSymbol $decontextualized_predicate_mt$ = makeSymbol("*DECONTEXTUALIZED-PREDICATE-MT*");



    public static final SubLSymbol $decontextualized_collection_mt$ = makeSymbol("*DECONTEXTUALIZED-COLLECTION-MT*");



    public static final SubLSymbol $ephemeral_term_mt$ = makeSymbol("*EPHEMERAL-TERM-MT*");



    public static final SubLSymbol $ist_mt$ = makeSymbol("*IST-MT*");



    public static final SubLSymbol $inference_related_bookkeeping_predicate_mt$ = makeSymbol("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*");

    private static final SubLObject $const26$InferenceRelatedBookkeepingPredic = reader_make_constant_shell("InferenceRelatedBookkeepingPredicate");

    public static final SubLSymbol $anect_mt$ = makeSymbol("*ANECT-MT*");

    private static final SubLObject $const28$AtemporalNecessarilyEssentialColl = reader_make_constant_shell("AtemporalNecessarilyEssentialCollectionType");

    public static final SubLSymbol $broad_mt_mt$ = makeSymbol("*BROAD-MT-MT*");



    public static final SubLSymbol $psc_mt$ = makeSymbol("*PSC-MT*");



    public static final SubLSymbol $tou_mt$ = makeSymbol("*TOU-MT*");



    public static final SubLSymbol $skolem_mt$ = makeSymbol("*SKOLEM-MT*");



    public static final SubLSymbol $thing_defining_mt$ = makeSymbol("*THING-DEFINING-MT*");



    public static final SubLSymbol $relation_defining_mt$ = makeSymbol("*RELATION-DEFINING-MT*");



    public static final SubLSymbol $equals_defining_mt$ = makeSymbol("*EQUALS-DEFINING-MT*");



    public static final SubLSymbol $element_of_defining_mt$ = makeSymbol("*ELEMENT-OF-DEFINING-MT*");



    public static final SubLSymbol $subset_of_defining_mt$ = makeSymbol("*SUBSET-OF-DEFINING-MT*");



    public static final SubLSymbol $arity_mt$ = makeSymbol("*ARITY-MT*");



    public static final SubLSymbol $sublid_mt$ = makeSymbol("*SUBLID-MT*");





    public static final SubLSymbol $not_assertible_mt_convention_mt$ = makeSymbol("*NOT-ASSERTIBLE-MT-CONVENTION-MT*");



    public static final SubLSymbol $default_ask_mt$ = makeSymbol("*DEFAULT-ASK-MT*");

    public static final SubLSymbol $default_assert_mt$ = makeSymbol("*DEFAULT-ASSERT-MT*");

    public static final SubLSymbol $default_clone_mt$ = makeSymbol("*DEFAULT-CLONE-MT*");

    public static final SubLSymbol $default_support_mt$ = makeSymbol("*DEFAULT-SUPPORT-MT*");

    public static final SubLSymbol $default_comment_mt$ = makeSymbol("*DEFAULT-COMMENT-MT*");

    public static final SubLSymbol $default_convention_mt$ = makeSymbol("*DEFAULT-CONVENTION-MT*");

    static private final SubLList $list60 = list(reader_make_constant_shell("LogicalTruthMt"), reader_make_constant_shell("LogicalTruthImplementationMt"), reader_make_constant_shell("CoreCycLMt"), reader_make_constant_shell("CoreCycLImplementationMt"), reader_make_constant_shell("UniversalVocabularyMt"), reader_make_constant_shell("UniversalVocabularyImplementationMt"), reader_make_constant_shell("BaseKB"));

    static private final SubLList $list61 = list(cons(reader_make_constant_shell("LogicalTruthMt"), ZERO_INTEGER), cons(reader_make_constant_shell("LogicalTruthImplementationMt"), ZERO_INTEGER), cons(reader_make_constant_shell("CoreCycLMt"), ONE_INTEGER), cons(reader_make_constant_shell("CoreCycLImplementationMt"), ONE_INTEGER), cons(reader_make_constant_shell("UniversalVocabularyMt"), TWO_INTEGER), cons(reader_make_constant_shell("UniversalVocabularyImplementationMt"), TWO_INTEGER), cons(reader_make_constant_shell("BaseKB"), THREE_INTEGER));

    static private final SubLList $list62 = list(reader_make_constant_shell("UniversalVocabularyMt"), reader_make_constant_shell("BaseKB"));

    private static final SubLSymbol CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");

    static private final SubLSymbol $sym64$CORE_MICROTHEORY__ = makeSymbol("CORE-MICROTHEORY-<");

    static private final SubLSymbol $sym65$CORE_MICROTHEORY__ = makeSymbol("CORE-MICROTHEORY->");

    static private final SubLSymbol $sym66$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    /**
     * Sets the value of VAR to DEFAULT.
     * If BASIS is non-nil, notes that BASIS is a basis in the KB
     * for why DEFAULT was chosen.  This basis is the term of which DEFAULT is either the #$definingMt,
     * the #$decontextualizedPredicateConventionMt, or the #$decontextualizedCollectionConventionMt.
     * In other words:
     * (#$or
     * (#$definingMt BASIS DEFAULT)
     * (#$decontextualizedPredicateConventionMt BASIS DEFAULT)
     * (#$decontextualizedCollectionConventionMt BASIS DEFAULT))
     */
    @LispMethod(comment = "Sets the value of VAR to DEFAULT.\r\nIf BASIS is non-nil, notes that BASIS is a basis in the KB\r\nfor why DEFAULT was chosen.  This basis is the term of which DEFAULT is either the #$definingMt,\r\nthe #$decontextualizedPredicateConventionMt, or the #$decontextualizedCollectionConventionMt.\r\nIn other words:\r\n(#$or\r\n(#$definingMt BASIS DEFAULT)\r\n(#$decontextualizedPredicateConventionMt BASIS DEFAULT)\r\n(#$decontextualizedCollectionConventionMt BASIS DEFAULT))\nSets the value of VAR to DEFAULT.\nIf BASIS is non-nil, notes that BASIS is a basis in the KB\nfor why DEFAULT was chosen.  This basis is the term of which DEFAULT is either the #$definingMt,\nthe #$decontextualizedPredicateConventionMt, or the #$decontextualizedCollectionConventionMt.\nIn other words:\n(#$or\n(#$definingMt BASIS DEFAULT)\n(#$decontextualizedPredicateConventionMt BASIS DEFAULT)\n(#$decontextualizedCollectionConventionMt BASIS DEFAULT))")
    public static final SubLObject defglobal_mt_var_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject var = NIL;
                SubLObject v_default = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                var = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                v_default = current.first();
                current = current.rest();
                {
                    SubLObject basis = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt0);
                    current = current.rest();
                    {
                        SubLObject comment = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt0);
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (basis.isString()) {
                                    Errors.error($str_alt1$Illegal_basis_argument_to_defglob, basis);
                                }
                            }
                            return list(PROGN, list(DEFGLOBAL_PROTECTED, var, v_default, comment), list(NOTE_MT_VAR, list(QUOTE, var), basis));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Sets the value of VAR to DEFAULT.
     * If BASIS is non-nil, notes that BASIS is a basis in the KB
     * for why DEFAULT was chosen.  This basis is the term of which DEFAULT is either the #$definingMt,
     * the #$decontextualizedPredicateConventionMt, or the #$decontextualizedCollectionConventionMt.
     * In other words:
     * (#$or
     * (#$definingMt BASIS DEFAULT)
     * (#$decontextualizedPredicateConventionMt BASIS DEFAULT)
     * (#$decontextualizedCollectionConventionMt BASIS DEFAULT))
     */
    @LispMethod(comment = "Sets the value of VAR to DEFAULT.\r\nIf BASIS is non-nil, notes that BASIS is a basis in the KB\r\nfor why DEFAULT was chosen.  This basis is the term of which DEFAULT is either the #$definingMt,\r\nthe #$decontextualizedPredicateConventionMt, or the #$decontextualizedCollectionConventionMt.\r\nIn other words:\r\n(#$or\r\n(#$definingMt BASIS DEFAULT)\r\n(#$decontextualizedPredicateConventionMt BASIS DEFAULT)\r\n(#$decontextualizedCollectionConventionMt BASIS DEFAULT))\nSets the value of VAR to DEFAULT.\nIf BASIS is non-nil, notes that BASIS is a basis in the KB\nfor why DEFAULT was chosen.  This basis is the term of which DEFAULT is either the #$definingMt,\nthe #$decontextualizedPredicateConventionMt, or the #$decontextualizedCollectionConventionMt.\nIn other words:\n(#$or\n(#$definingMt BASIS DEFAULT)\n(#$decontextualizedPredicateConventionMt BASIS DEFAULT)\n(#$decontextualizedCollectionConventionMt BASIS DEFAULT))")
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

    public static final SubLObject note_mt_var_alt(SubLObject var, SubLObject basis) {
        if (basis == UNPROVIDED) {
            basis = NIL;
        }
        if (NIL != basis) {
            com.cyc.cycjava.cycl.mt_vars.note_mt_var_basis(var, basis);
        }
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

    public static final SubLObject note_mt_var_basis_alt(SubLObject var, SubLObject basis) {
        return dictionary.dictionary_enter($mt_var_basis_table$.getGlobalValue(), var, basis);
    }

    public static SubLObject note_mt_var_basis(final SubLObject var, final SubLObject basis) {
        return dictionary.dictionary_enter($mt_var_basis_table$.getGlobalValue(), var, basis);
    }

    /**
     * Is MT visible from the *mt-mt*?
     */
    @LispMethod(comment = "Is MT visible from the *mt-mt*?")
    public static final SubLObject mt_mt_relevantP_alt(SubLObject mt) {
        return genl_mts.genl_mtP($mt_mt$.getGlobalValue(), mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Is MT visible from the *mt-mt*?
     */
    @LispMethod(comment = "Is MT visible from the *mt-mt*?")
    public static SubLObject mt_mt_relevantP(final SubLObject mt) {
        return genl_mts.genl_mtP($mt_mt$.getGlobalValue(), mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff OBJECT is a core microtheory.
     */
    @LispMethod(comment = "Return T iff OBJECT is a core microtheory.")
    public static final SubLObject core_microtheory_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $core_mts$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is a core microtheory.
     */
    @LispMethod(comment = "Return T iff OBJECT is a core microtheory.")
    public static SubLObject core_microtheory_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $core_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff core microtheory MT1 is lower than MT2 in the #$genlMt hierarchy.
     */
    @LispMethod(comment = "Return T iff core microtheory MT1 is lower than MT2 in the #$genlMt hierarchy.")
    public static final SubLObject core_microtheory_L_alt(SubLObject mt1, SubLObject mt2) {
        {
            SubLObject level1 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED);
            SubLObject level2 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED);
            if (level1.isInteger() && level2.isInteger()) {
                return numLE(level2, level1);
            }
        }
        return NIL;
    }

    /**
     * Return T iff core microtheory MT1 is lower than MT2 in the #$genlMt hierarchy.
     */
    @LispMethod(comment = "Return T iff core microtheory MT1 is lower than MT2 in the #$genlMt hierarchy.")
    public static SubLObject core_microtheory_L(final SubLObject mt1, final SubLObject mt2) {
        final SubLObject level1 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED);
        final SubLObject level2 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED);
        if (level1.isInteger() && level2.isInteger()) {
            return numLE(level2, level1);
        }
        return NIL;
    }

    /**
     * Return T iff core microtheory MT1 is higher than MT2 in the #$genlMt hierarchy.
     */
    @LispMethod(comment = "Return T iff core microtheory MT1 is higher than MT2 in the #$genlMt hierarchy.")
    public static final SubLObject core_microtheory_G_alt(SubLObject mt1, SubLObject mt2) {
        {
            SubLObject level1 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED);
            SubLObject level2 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED);
            if (level1.isInteger() && level2.isInteger()) {
                return numLE(level1, level2);
            }
        }
        return NIL;
    }

    /**
     * Return T iff core microtheory MT1 is higher than MT2 in the #$genlMt hierarchy.
     */
    @LispMethod(comment = "Return T iff core microtheory MT1 is higher than MT2 in the #$genlMt hierarchy.")
    public static SubLObject core_microtheory_G(final SubLObject mt1, final SubLObject mt2) {
        final SubLObject level1 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED);
        final SubLObject level2 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED);
        if (level1.isInteger() && level2.isInteger()) {
            return numLE(level1, level2);
        }
        return NIL;
    }

    public static final SubLObject core_genl_mtP_alt(SubLObject mt1, SubLObject mt2) {
        if ((NIL != com.cyc.cycjava.cycl.mt_vars.special_core_loop_mt_p(mt1)) && (NIL != com.cyc.cycjava.cycl.mt_vars.special_core_loop_mt_p(mt2))) {
            return T;
        } else {
            return com.cyc.cycjava.cycl.mt_vars.core_microtheory_G(mt1, mt2);
        }
    }

    public static SubLObject core_genl_mtP(final SubLObject mt1, final SubLObject mt2) {
        if ((NIL != special_core_loop_mt_p(mt1)) && (NIL != special_core_loop_mt_p(mt2))) {
            return T;
        }
        return core_microtheory_G(mt1, mt2);
    }

    public static final SubLObject core_any_genl_mtP_alt(SubLObject spec, SubLObject v_genls) {
        {
            SubLObject cdolist_list_var = v_genls;
            SubLObject genl = NIL;
            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.mt_vars.core_genl_mtP(spec, genl)) {
                    return T;
                }
            }
        }
        return NIL;
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

    public static final SubLObject special_core_loop_mt_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $special_loop_core_mts$.getGlobalValue());
    }

    public static SubLObject special_core_loop_mt_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $special_loop_core_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Reduces MTS by eliminating any core microtheories that are proper genlMt of microtheories in MTS.
     */
    @LispMethod(comment = "Reduces MTS by eliminating any core microtheories that are proper genlMt of microtheories in MTS.")
    public static final SubLObject minimize_mts_wrt_core_alt(SubLObject mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject core_mts = list_utilities.partition_list(mts, CORE_MICROTHEORY_P);
                SubLObject non_core_mts = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != non_core_mts) {
                    return non_core_mts;
                } else {
                    {
                        SubLObject min_core_mt = list_utilities.extremal(core_mts, $sym64$CORE_MICROTHEORY__, UNPROVIDED);
                        return removal_module_utilities.non_null_answer_to_singleton(min_core_mt);
                    }
                }
            }
        }
    }

    /**
     * Reduces MTS by eliminating any core microtheories that are proper genlMt of microtheories in MTS.
     */
    @LispMethod(comment = "Reduces MTS by eliminating any core microtheories that are proper genlMt of microtheories in MTS.")
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

    /**
     * Reduces MTS by eliminating any non-core mts if there are any core mts,
     * and then taking the maximal core mt.
     */
    @LispMethod(comment = "Reduces MTS by eliminating any non-core mts if there are any core mts,\r\nand then taking the maximal core mt.\nReduces MTS by eliminating any non-core mts if there are any core mts,\nand then taking the maximal core mt.")
    public static final SubLObject maximize_mts_wrt_core_alt(SubLObject mts) {
        {
            SubLObject core_mts = list_utilities.remove_if_not(CORE_MICROTHEORY_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != core_mts) {
                {
                    SubLObject max_core_mt = list_utilities.extremal(core_mts, $sym65$CORE_MICROTHEORY__, UNPROVIDED);
                    return list(max_core_mt);
                }
            } else {
                return mts;
            }
        }
    }

    /**
     * Reduces MTS by eliminating any non-core mts if there are any core mts,
     * and then taking the maximal core mt.
     */
    @LispMethod(comment = "Reduces MTS by eliminating any non-core mts if there are any core mts,\r\nand then taking the maximal core mt.\nReduces MTS by eliminating any non-core mts if there are any core mts,\nand then taking the maximal core mt.")
    public static SubLObject maximize_mts_wrt_core(final SubLObject mts) {
        final SubLObject core_mts = list_utilities.remove_if_not(CORE_MICROTHEORY_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != core_mts) {
            final SubLObject max_core_mt = list_utilities.extremal(core_mts, $sym65$CORE_MICROTHEORY__, UNPROVIDED);
            return list(max_core_mt);
        }
        return mts;
    }

    /**
     * Reduces mts in MT-SETS by eliminating any proper genlMts of core microtheories in each element of MT-SETS.
     */
    @LispMethod(comment = "Reduces mts in MT-SETS by eliminating any proper genlMts of core microtheories in each element of MT-SETS.")
    public static final SubLObject minimize_mt_sets_wrt_core_alt(SubLObject mt_sets) {
        {
            SubLObject reduced_mt_sets = NIL;
            SubLObject cdolist_list_var = mt_sets;
            SubLObject mt_set = NIL;
            for (mt_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_set = cdolist_list_var.first()) {
                {
                    SubLObject reduced_mt_set = com.cyc.cycjava.cycl.mt_vars.minimize_mts_wrt_core(mt_set);
                    SubLObject item_var = reduced_mt_set;
                    if (NIL == member(item_var, reduced_mt_sets, symbol_function($sym66$SETS_EQUAL_), symbol_function(IDENTITY))) {
                        reduced_mt_sets = cons(item_var, reduced_mt_sets);
                    }
                }
            }
            return nreverse(reduced_mt_sets);
        }
    }

    /**
     * Reduces mts in MT-SETS by eliminating any proper genlMts of core microtheories in each element of MT-SETS.
     */
    @LispMethod(comment = "Reduces mts in MT-SETS by eliminating any proper genlMts of core microtheories in each element of MT-SETS.")
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

    /**
     *
     *
     * @param MTS;
     * 		a list of microtheories
     * @return listp; a list of microtheories with all core microtheories sorted in descending order;
    from topmost (max) to lowest (min).
     * @unknown this is not destructive
     */
    @LispMethod(comment = "@param MTS;\r\n\t\ta list of microtheories\r\n@return listp; a list of microtheories with all core microtheories sorted in descending order;\r\nfrom topmost (max) to lowest (min).\r\n@unknown this is not destructive")
    public static final SubLObject push_core_mts_to_beginning_alt(SubLObject mts) {
        {
            SubLObject core_mts = list_utilities.remove_if_not(CORE_MICROTHEORY_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != core_mts) {
                {
                    SubLObject non_core_mts = list_utilities.ordered_set_difference(mts, core_mts, UNPROVIDED, UNPROVIDED);
                    SubLObject sorted_core_mts = Sort.sort(core_mts, $sym65$CORE_MICROTHEORY__, UNPROVIDED);
                    SubLObject sorted_mts = nconc(sorted_core_mts, non_core_mts);
                    return sorted_mts;
                }
            } else {
                return mts;
            }
        }
    }

    /**
     *
     *
     * @param MTS;
     * 		a list of microtheories
     * @return listp; a list of microtheories with all core microtheories sorted in descending order;
    from topmost (max) to lowest (min).
     * @unknown this is not destructive
     */
    @LispMethod(comment = "@param MTS;\r\n\t\ta list of microtheories\r\n@return listp; a list of microtheories with all core microtheories sorted in descending order;\r\nfrom topmost (max) to lowest (min).\r\n@unknown this is not destructive")
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
        declareMacro("defglobal_mt_var", "DEFGLOBAL-MT-VAR");
        declareFunction("note_mt_var", "NOTE-MT-VAR", 1, 1, false);
        declareFunction("note_mt_var_basis", "NOTE-MT-VAR-BASIS", 2, 0, false);
        declareFunction("mt_mt_relevantP", "MT-MT-RELEVANT?", 1, 0, false);
        declareFunction("core_microtheory_p", "CORE-MICROTHEORY-P", 1, 0, false);
        new mt_vars.$core_microtheory_p$UnaryFunction();
        declareFunction("core_microtheory_L", "CORE-MICROTHEORY-<", 2, 0, false);
        declareFunction("core_microtheory_G", "CORE-MICROTHEORY->", 2, 0, false);
        declareFunction("core_genl_mtP", "CORE-GENL-MT?", 2, 0, false);
        declareFunction("core_any_genl_mtP", "CORE-ANY-GENL-MT?", 2, 0, false);
        declareFunction("special_core_loop_mt_p", "SPECIAL-CORE-LOOP-MT-P", 1, 0, false);
        new mt_vars.$special_core_loop_mt_p$UnaryFunction();
        declareFunction("minimize_mts_wrt_core", "MINIMIZE-MTS-WRT-CORE", 1, 0, false);
        declareFunction("maximize_mts_wrt_core", "MAXIMIZE-MTS-WRT-CORE", 1, 0, false);
        declareFunction("minimize_mt_sets_wrt_core", "MINIMIZE-MT-SETS-WRT-CORE", 1, 0, false);
        declareFunction("push_core_mts_to_beginning", "PUSH-CORE-MTS-TO-BEGINNING", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mt_vars_file_alt() {
        deflexical("*MT-VAR-BASIS-TABLE*", dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        deflexical("*MT-ROOT*", NIL != boundp($mt_root$) ? ((SubLObject) ($mt_root$.getGlobalValue())) : $$BaseKB);
        deflexical("*THEORY-MT-ROOT*", NIL != boundp($theory_mt_root$) ? ((SubLObject) ($theory_mt_root$.getGlobalValue())) : $$BaseKB);
        deflexical("*ASSERTIBLE-MT-ROOT*", NIL != boundp($assertible_mt_root$) ? ((SubLObject) ($assertible_mt_root$.getGlobalValue())) : $$BaseKB);
        deflexical("*ASSERTIBLE-THEORY-MT-ROOT*", NIL != boundp($assertible_theory_mt_root$) ? ((SubLObject) ($assertible_theory_mt_root$.getGlobalValue())) : $$BaseKB);
        deflexical("*CORE-MT-FLOOR*", NIL != boundp($core_mt_floor$) ? ((SubLObject) ($core_mt_floor$.getGlobalValue())) : $$BaseKB);
        deflexical("*MT-MT*", NIL != boundp($mt_mt$) ? ((SubLObject) ($mt_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        deflexical("*DEFINING-MT-MT*", NIL != boundp($defining_mt_mt$) ? ((SubLObject) ($defining_mt_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DECONTEXTUALIZED-PREDICATE-MT*", NIL != boundp($decontextualized_predicate_mt$) ? ((SubLObject) ($decontextualized_predicate_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DECONTEXTUALIZED-COLLECTION-MT*", NIL != boundp($decontextualized_collection_mt$) ? ((SubLObject) ($decontextualized_collection_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*EPHEMERAL-TERM-MT*", NIL != boundp($ephemeral_term_mt$) ? ((SubLObject) ($ephemeral_term_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*IST-MT*", NIL != boundp($ist_mt$) ? ((SubLObject) ($ist_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*", NIL != boundp($inference_related_bookkeeping_predicate_mt$) ? ((SubLObject) ($inference_related_bookkeeping_predicate_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*ANECT-MT*", NIL != boundp($anect_mt$) ? ((SubLObject) ($anect_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        deflexical("*BROAD-MT-MT*", NIL != boundp($broad_mt_mt$) ? ((SubLObject) ($broad_mt_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*PSC-MT*", NIL != boundp($psc_mt$) ? ((SubLObject) ($psc_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*TOU-MT*", NIL != boundp($tou_mt$) ? ((SubLObject) ($tou_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*SKOLEM-MT*", NIL != boundp($skolem_mt$) ? ((SubLObject) ($skolem_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*THING-DEFINING-MT*", NIL != boundp($thing_defining_mt$) ? ((SubLObject) ($thing_defining_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*RELATION-DEFINING-MT*", NIL != boundp($relation_defining_mt$) ? ((SubLObject) ($relation_defining_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*EQUALS-DEFINING-MT*", NIL != boundp($equals_defining_mt$) ? ((SubLObject) ($equals_defining_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*ELEMENT-OF-DEFINING-MT*", NIL != boundp($element_of_defining_mt$) ? ((SubLObject) ($element_of_defining_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*SUBSET-OF-DEFINING-MT*", NIL != boundp($subset_of_defining_mt$) ? ((SubLObject) ($subset_of_defining_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*ARITY-MT*", NIL != boundp($arity_mt$) ? ((SubLObject) ($arity_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        deflexical("*SUBLID-MT*", NIL != boundp($sublid_mt$) ? ((SubLObject) ($sublid_mt$.getGlobalValue())) : $$CycAPIMt);
        deflexical("*NOT-ASSERTIBLE-MT-CONVENTION-MT*", NIL != boundp($not_assertible_mt_convention_mt$) ? ((SubLObject) ($not_assertible_mt_convention_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        deflexical("*DEFAULT-ASK-MT*", NIL != boundp($default_ask_mt$) ? ((SubLObject) ($default_ask_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DEFAULT-ASSERT-MT*", NIL != boundp($default_assert_mt$) ? ((SubLObject) ($default_assert_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DEFAULT-CLONE-MT*", NIL != boundp($default_clone_mt$) ? ((SubLObject) ($default_clone_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DEFAULT-SUPPORT-MT*", NIL != boundp($default_support_mt$) ? ((SubLObject) ($default_support_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DEFAULT-COMMENT-MT*", NIL != boundp($default_comment_mt$) ? ((SubLObject) ($default_comment_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DEFAULT-CONVENTION-MT*", NIL != boundp($default_convention_mt$) ? ((SubLObject) ($default_convention_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        defparameter("*CORE-MT-OPTIMIZATION-ENABLED?*", T);
        deflexical("*CORE-MTS*", $list_alt60);
        deflexical("*ORDERED-CORE-MTS*", $list_alt61);
        deflexical("*SPECIAL-LOOP-CORE-MTS*", $list_alt62);
        return NIL;
    }

    public static SubLObject init_mt_vars_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MT-ROOT*", NIL != boundp($mt_root$) ? ((SubLObject) ($mt_root$.getGlobalValue())) : $$BaseKB);
            deflexical("*THEORY-MT-ROOT*", NIL != boundp($theory_mt_root$) ? ((SubLObject) ($theory_mt_root$.getGlobalValue())) : $$BaseKB);
            deflexical("*ASSERTIBLE-MT-ROOT*", NIL != boundp($assertible_mt_root$) ? ((SubLObject) ($assertible_mt_root$.getGlobalValue())) : $$BaseKB);
            deflexical("*ASSERTIBLE-THEORY-MT-ROOT*", NIL != boundp($assertible_theory_mt_root$) ? ((SubLObject) ($assertible_theory_mt_root$.getGlobalValue())) : $$BaseKB);
            deflexical("*CORE-MT-FLOOR*", NIL != boundp($core_mt_floor$) ? ((SubLObject) ($core_mt_floor$.getGlobalValue())) : $$BaseKB);
            deflexical("*MT-MT*", NIL != boundp($mt_mt$) ? ((SubLObject) ($mt_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
            deflexical("*DEFINING-MT-MT*", NIL != boundp($defining_mt_mt$) ? ((SubLObject) ($defining_mt_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*DECONTEXTUALIZED-PREDICATE-MT*", NIL != boundp($decontextualized_predicate_mt$) ? ((SubLObject) ($decontextualized_predicate_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*DECONTEXTUALIZED-COLLECTION-MT*", NIL != boundp($decontextualized_collection_mt$) ? ((SubLObject) ($decontextualized_collection_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*EPHEMERAL-TERM-MT*", NIL != boundp($ephemeral_term_mt$) ? ((SubLObject) ($ephemeral_term_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*IST-MT*", NIL != boundp($ist_mt$) ? ((SubLObject) ($ist_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*", NIL != boundp($inference_related_bookkeeping_predicate_mt$) ? ((SubLObject) ($inference_related_bookkeeping_predicate_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*ANECT-MT*", NIL != boundp($anect_mt$) ? ((SubLObject) ($anect_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
            deflexical("*BROAD-MT-MT*", NIL != boundp($broad_mt_mt$) ? ((SubLObject) ($broad_mt_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*PSC-MT*", NIL != boundp($psc_mt$) ? ((SubLObject) ($psc_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*TOU-MT*", NIL != boundp($tou_mt$) ? ((SubLObject) ($tou_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*SKOLEM-MT*", NIL != boundp($skolem_mt$) ? ((SubLObject) ($skolem_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*THING-DEFINING-MT*", NIL != boundp($thing_defining_mt$) ? ((SubLObject) ($thing_defining_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*RELATION-DEFINING-MT*", NIL != boundp($relation_defining_mt$) ? ((SubLObject) ($relation_defining_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*EQUALS-DEFINING-MT*", NIL != boundp($equals_defining_mt$) ? ((SubLObject) ($equals_defining_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*ELEMENT-OF-DEFINING-MT*", NIL != boundp($element_of_defining_mt$) ? ((SubLObject) ($element_of_defining_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*SUBSET-OF-DEFINING-MT*", NIL != boundp($subset_of_defining_mt$) ? ((SubLObject) ($subset_of_defining_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*ARITY-MT*", NIL != boundp($arity_mt$) ? ((SubLObject) ($arity_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
            deflexical("*SUBLID-MT*", NIL != boundp($sublid_mt$) ? ((SubLObject) ($sublid_mt$.getGlobalValue())) : $$CycAPIMt);
            deflexical("*NOT-ASSERTIBLE-MT-CONVENTION-MT*", NIL != boundp($not_assertible_mt_convention_mt$) ? ((SubLObject) ($not_assertible_mt_convention_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
            deflexical("*DEFAULT-ASK-MT*", NIL != boundp($default_ask_mt$) ? ((SubLObject) ($default_ask_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*DEFAULT-ASSERT-MT*", NIL != boundp($default_assert_mt$) ? ((SubLObject) ($default_assert_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*DEFAULT-CLONE-MT*", NIL != boundp($default_clone_mt$) ? ((SubLObject) ($default_clone_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*DEFAULT-SUPPORT-MT*", NIL != boundp($default_support_mt$) ? ((SubLObject) ($default_support_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*DEFAULT-COMMENT-MT*", NIL != boundp($default_comment_mt$) ? ((SubLObject) ($default_comment_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*DEFAULT-CONVENTION-MT*", NIL != boundp($default_convention_mt$) ? ((SubLObject) ($default_convention_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        }
        return NIL;
    }

    public static SubLObject init_mt_vars_file_Previous() {
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("VAR"), makeSymbol("DEFAULT"), makeSymbol("&OPTIONAL"), makeSymbol("BASIS"), makeSymbol("COMMENT"));

    static private final SubLString $str_alt1$Illegal_basis_argument_to_defglob = makeString("Illegal basis argument to defglobal-mt-var: ~s");

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

    static private final SubLList $list_alt60 = list(reader_make_constant_shell("LogicalTruthMt"), reader_make_constant_shell("LogicalTruthImplementationMt"), reader_make_constant_shell("CoreCycLMt"), reader_make_constant_shell("CoreCycLImplementationMt"), reader_make_constant_shell("UniversalVocabularyMt"), reader_make_constant_shell("UniversalVocabularyImplementationMt"), reader_make_constant_shell("BaseKB"));

    static private final SubLList $list_alt61 = list(cons(reader_make_constant_shell("LogicalTruthMt"), ZERO_INTEGER), cons(reader_make_constant_shell("LogicalTruthImplementationMt"), ZERO_INTEGER), cons(reader_make_constant_shell("CoreCycLMt"), ONE_INTEGER), cons(reader_make_constant_shell("CoreCycLImplementationMt"), ONE_INTEGER), cons(reader_make_constant_shell("UniversalVocabularyMt"), TWO_INTEGER), cons(reader_make_constant_shell("UniversalVocabularyImplementationMt"), TWO_INTEGER), cons(reader_make_constant_shell("BaseKB"), THREE_INTEGER));

    static private final SubLList $list_alt62 = list(reader_make_constant_shell("UniversalVocabularyMt"), reader_make_constant_shell("BaseKB"));
}

/**
 * Total time: 174 ms
 */
