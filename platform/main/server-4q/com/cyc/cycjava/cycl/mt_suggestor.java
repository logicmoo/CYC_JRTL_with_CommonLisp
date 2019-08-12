/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MT-SUGGESTOR
 * source file: /cyc/top/cycl/mt-suggestor.lisp
 * created:     2019/07/03 17:39:04
 */
public final class mt_suggestor extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new mt_suggestor();

 public static final String myName = "com.cyc.cycjava.cycl.mt_suggestor";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mts_forbid_lexical_mts$ = makeSymbol("*MTS-FORBID-LEXICAL-MTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mts_forbid_project_mts$ = makeSymbol("*MTS-FORBID-PROJECT-MTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mts_forbid_high_level_mts_for_content_assertions$ = makeSymbol("*MTS-FORBID-HIGH-LEVEL-MTS-FOR-CONTENT-ASSERTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $predicate_determined_gaf_cutoff_percent$ = makeSymbol("*PREDICATE-DETERMINED-GAF-CUTOFF-PERCENT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $predicate_determined_gaf_cutoff_number$ = makeSymbol("*PREDICATE-DETERMINED-GAF-CUTOFF-NUMBER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mtsugg_related_assertion_formulas_query_properties$ = makeSymbol("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-PROPERTIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mtsugg_related_assertion_formulas_query_mt$ = makeSymbol("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-MT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mtsugg_too_general_term_filter$ = makeSymbol("*MTSUGG-TOO-GENERAL-TERM-FILTER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mtsugg_too_general_collection_filter$ = makeSymbol("*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mtsugg_too_general_quoted_collection_filter$ = makeSymbol("*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $examination_formulas$ = makeSymbol("*EXAMINATION-FORMULAS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $examination_mts$ = makeSymbol("*EXAMINATION-MTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mts_incorrect_formulas$ = makeSymbol("*MTS-INCORRECT-FORMULAS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mts_actual_mts$ = makeSymbol("*MTS-ACTUAL-MTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mts_guessed_mts$ = makeSymbol("*MTS-GUESSED-MTS*");

    static private final SubLSymbol $sym1$MTS_NOT_COMMONSENSE_MT_ = makeSymbol("MTS-NOT-COMMONSENSE-MT?");



    private static final SubLFloat $float$0_8 = makeDouble(0.8);

















    static private final SubLList $list13 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    static private final SubLList $list14 = list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric"), list(reader_make_constant_shell("MtTimeDimFn"), reader_make_constant_shell("Now")));

    static private final SubLSymbol $sym15$GAF_ = makeSymbol("GAF?");

    static private final SubLSymbol $sym16$_X = makeSymbol("?X");

    static private final SubLSymbol $sym17$_MT = makeSymbol("?MT");

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell("ist-Asserted");

    private static final SubLSymbol ASSERTION_MONAD_MT = makeSymbol("ASSERTION-MONAD-MT");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLFloat $float$0_2 = makeDouble(0.2);

    private static final SubLSymbol FREQUENCY_LIST_OF_MTS = makeSymbol("FREQUENCY-LIST-OF-MTS");



    public static final SubLSymbol $frequency_list_of_mts_caching_state$ = makeSymbol("*FREQUENCY-LIST-OF-MTS-CACHING-STATE*");

    private static final SubLSymbol $sym31$MTS_TOO_GENERAL_ = makeSymbol("MTS-TOO-GENERAL?");



    private static final SubLSymbol $sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_ = makeSymbol("MTS-TOO-GENERAL-LIGHT-FILTERING?");

    private static final SubLSymbol $sym35$_ = makeSymbol(">");

    private static final SubLSymbol CADDR = makeSymbol("CADDR");

    private static final SubLList $list38 = list(new SubLObject[]{ reader_make_constant_shell("implies"), reader_make_constant_shell("and"), reader_make_constant_shell("not"), reader_make_constant_shell("or"), reader_make_constant_shell("termOfUnit"), reader_make_constant_shell("equals"), reader_make_constant_shell("ExistingObjectType"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("forAll"), reader_make_constant_shell("comment"), reader_make_constant_shell("cyclistNotes"), reader_make_constant_shell("sharedNotes"), reader_make_constant_shell("different"), reader_make_constant_shell("Predicate"), reader_make_constant_shell("unknownSentence"), reader_make_constant_shell("similarTo"), reader_make_constant_shell("CollectionType"), reader_make_constant_shell("abnormal"), reader_make_constant_shell("evaluate") });

    static private final SubLList $list39 = list(reader_make_constant_shell("MetaRelation"), reader_make_constant_shell("KEFaciliationPredicate"));

    static private final SubLList $list40 = list(reader_make_constant_shell("CoreConstant"));







    private static final SubLInteger $int$20000 = makeInteger(20000);

    private static final SubLSymbol TOP_MT_PERCENT_COUNT = makeSymbol("TOP-MT-PERCENT-COUNT");

    private static final SubLSymbol $sym48$_ = makeSymbol("+");

    private static final SubLSymbol $top_mt_percent_count_caching_state$ = makeSymbol("*TOP-MT-PERCENT-COUNT-CACHING-STATE*");



    private static final SubLList $list55 = list(new SubLObject[]{ makeSymbol("RUN-LARGE-COMMONSENSE-MT-RULES-TEST"), makeSymbol("RUN-BASE-KB-RULES-TEST"), makeSymbol("RUN-LEXICAL-RULES-TEST"), makeSymbol("RUN-LEXICAL-GAFS-TEST"), makeSymbol("RUN-LARGE-COMMONSENSE-MT-GAFS-TEST"), makeSymbol("RUN-META-PREDICATES-TEST"), makeSymbol("RUN-RULE-MACRO-PREDICATES-TEST"), makeSymbol("RUN-NEW-PROJECT-ASSERTIONS-TEST"), makeSymbol("RUN-OLD-PROJECT-ASSERTIONS-TEST") });

    private static final SubLString $str56$Running_test__ = makeString("Running test: ");

    private static final SubLString $str57$_RESULTS__ = makeString(" RESULTS: ");

    private static final SubLString $str58$Incorrect_Formula__ = makeString("Incorrect Formula: ");

    private static final SubLString $str59$Suggested_Mt__ = makeString("Suggested Mt: ");

    private static final SubLString $str60$Actual_Mt__ = makeString("Actual Mt: ");

    private static final SubLString $str61$Frequency_list_of_suggested_mts__ = makeString("Frequency list of suggested mts: ");

    private static final SubLString $str62$Frequency_list_of_actual_mts__ = makeString("Frequency list of actual mts: ");















    private static final SubLObject $$Y2Scenario_Stage1Mt = reader_make_constant_shell("Y2Scenario-Stage1Mt");































    private static final SubLString $str86$Trying_Formula__ = makeString("Trying Formula: ");

    private static final SubLString $$$Got_ = makeString("Got ");

    private static final SubLString $$$_out_of_ = makeString(" out of ");

    private static final SubLString $str92$do_broad_mt_index = makeString("do-broad-mt-index");

    private static final SubLInteger $int$100000 = makeInteger(100000);



    /**
     *
     *
     * @param FORMULA
    el-formula-p
     * 		
     * @return microtheory-p, the best guess at an appropriate microtheory for FORMULA
     */
    @LispMethod(comment = "@param FORMULA\nel-formula-p\r\n\t\t\r\n@return microtheory-p, the best guess at an appropriate microtheory for FORMULA")
    public static final SubLObject suggest_mt_alt(SubLObject formula) {
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        if (NIL != gafP(formula)) {
            return com.cyc.cycjava.cycl.mt_suggestor.suggest_mt_for_gaf(formula);
        } else {
            return com.cyc.cycjava.cycl.mt_suggestor.suggest_mt_by_content(formula);
        }
    }

    /**
     *
     *
     * @param FORMULA
    el-formula-p
     * 		
     * @return microtheory-p, the best guess at an appropriate microtheory for FORMULA
     */
    @LispMethod(comment = "@param FORMULA\nel-formula-p\r\n\t\t\r\n@return microtheory-p, the best guess at an appropriate microtheory for FORMULA")
    public static SubLObject suggest_mt(final SubLObject formula) {
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        if (NIL != gafP(formula)) {
            return suggest_mt_for_gaf(formula);
        }
        return suggest_mt_by_content(formula);
    }

    /**
     *
     *
     * @param FORMULA
    el-formula-p
     * 		
     * @return microtheory-p, the best guess at an appropriate microtheory for FORMULA, assuming
    that the microtheory for FORMULA is determined by its general 'topic'.
     */
    @LispMethod(comment = "@param FORMULA\nel-formula-p\r\n\t\t\r\n@return microtheory-p, the best guess at an appropriate microtheory for FORMULA, assuming\r\nthat the microtheory for FORMULA is determined by its general \'topic\'.")
    public static final SubLObject suggest_mt_by_content_alt(SubLObject formula) {
        {
            SubLObject data = com.cyc.cycjava.cycl.mt_suggestor.mts_get_summed_data(formula);
            SubLObject filtered = remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, data, CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject just_mts = Mapping.mapcar(CAR, filtered);
            return NIL == just_mts ? ((SubLObject) ($$BaseKB)) : just_mts.first();
        }
    }

    /**
     *
     *
     * @param FORMULA
    el-formula-p
     * 		
     * @return microtheory-p, the best guess at an appropriate microtheory for FORMULA, assuming
    that the microtheory for FORMULA is determined by its general 'topic'.
     */
    @LispMethod(comment = "@param FORMULA\nel-formula-p\r\n\t\t\r\n@return microtheory-p, the best guess at an appropriate microtheory for FORMULA, assuming\r\nthat the microtheory for FORMULA is determined by its general \'topic\'.")
    public static SubLObject suggest_mt_by_content(final SubLObject formula) {
        final SubLObject data = mts_get_summed_data(formula);
        final SubLObject filtered = remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, data, CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject just_mts = Mapping.mapcar(CAR, filtered);
        return NIL == just_mts ? $$BaseKB : just_mts.first();
    }

    /**
     *
     *
     * @param GAF
    gaf?
     * 		
     * @return microtheory-p, the best guess at an appropriate microtheory for FORMULA, by first trying to find similar
    assertions to GAF, and failing that, using a content-based method.
     */
    @LispMethod(comment = "@param GAF\ngaf?\r\n\t\t\r\n@return microtheory-p, the best guess at an appropriate microtheory for FORMULA, by first trying to find similar\r\nassertions to GAF, and failing that, using a content-based method.")
    public static final SubLObject suggest_mt_for_gaf_alt(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_list_with_count = com.cyc.cycjava.cycl.mt_suggestor.mt_list_from_related(gaf);
                SubLObject mt_list = Mapping.mapcar(CAR, mt_list_with_count);
                if ((NIL != mt_list_with_count) && THREE_INTEGER.numL(cdar(mt_list_with_count))) {
                    return mt_list.first();
                }
                {
                    SubLObject predicate_results = com.cyc.cycjava.cycl.mt_suggestor.top_mt_percent_count(gaf.first(), UNPROVIDED);
                    if (((NIL != predicate_results) && second(predicate_results).numG($predicate_determined_gaf_cutoff_percent$.getDynamicValue(thread))) && third(predicate_results).numG($predicate_determined_gaf_cutoff_number$.getDynamicValue(thread))) {
                        return predicate_results.first();
                    }
                }
                return com.cyc.cycjava.cycl.mt_suggestor.suggest_mt_by_content(gaf);
            }
        }
    }

    /**
     *
     *
     * @param GAF
    gaf?
     * 		
     * @return microtheory-p, the best guess at an appropriate microtheory for FORMULA, by first trying to find similar
    assertions to GAF, and failing that, using a content-based method.
     */
    @LispMethod(comment = "@param GAF\ngaf?\r\n\t\t\r\n@return microtheory-p, the best guess at an appropriate microtheory for FORMULA, by first trying to find similar\r\nassertions to GAF, and failing that, using a content-based method.")
    public static SubLObject suggest_mt_for_gaf(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_list_with_count = mt_list_from_related(gaf);
        final SubLObject mt_list = Mapping.mapcar(CAR, mt_list_with_count);
        if ((NIL != mt_list_with_count) && THREE_INTEGER.numL(cdar(mt_list_with_count))) {
            return mt_list.first();
        }
        final SubLObject predicate_results = top_mt_percent_count(gaf.first(), UNPROVIDED);
        if (((NIL != predicate_results) && second(predicate_results).numG($predicate_determined_gaf_cutoff_percent$.getDynamicValue(thread))) && third(predicate_results).numG($predicate_determined_gaf_cutoff_number$.getDynamicValue(thread))) {
            return predicate_results.first();
        }
        return suggest_mt_by_content(gaf);
    }

    /**
     *
     *
     * @param MT
     * 		a microtheory
     * @return if MT is considered to be not a commonsense microtheory.
    Note that this function is used to filter non-commonsense microtheories ONLY in suggest-mt-by-content.  suggest-mt-for-gaf
    chooses whatever microtheory it likes without filtering.
     */
    @LispMethod(comment = "@param MT\r\n\t\ta microtheory\r\n@return if MT is considered to be not a commonsense microtheory.\r\nNote that this function is used to filter non-commonsense microtheories ONLY in suggest-mt-by-content.  suggest-mt-for-gaf\r\nchooses whatever microtheory it likes without filtering.")
    public static final SubLObject mts_not_commonsense_mtP_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((mt.equal($$BookkeepingMt) || ((NIL != $mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue(thread)) && mt.equal($$BaseKB))) || ((NIL != $mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue(thread)) && mt.equal($$UniversalVocabularyMt))) || ((NIL != $mts_forbid_lexical_mts$.getDynamicValue(thread)) && (NIL != isa.isaP(mt, $$LexicalMicrotheory, UNPROVIDED, UNPROVIDED)))) || ((NIL != $mts_forbid_project_mts$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.mt_suggestor.likely_project_related_assertionP(mt))));
        }
    }

    /**
     *
     *
     * @param MT
     * 		a microtheory
     * @return if MT is considered to be not a commonsense microtheory.
    Note that this function is used to filter non-commonsense microtheories ONLY in suggest-mt-by-content.  suggest-mt-for-gaf
    chooses whatever microtheory it likes without filtering.
     */
    @LispMethod(comment = "@param MT\r\n\t\ta microtheory\r\n@return if MT is considered to be not a commonsense microtheory.\r\nNote that this function is used to filter non-commonsense microtheories ONLY in suggest-mt-by-content.  suggest-mt-for-gaf\r\nchooses whatever microtheory it likes without filtering.")
    public static SubLObject mts_not_commonsense_mtP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((mt.equal($$BookkeepingMt) || ((NIL != $mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue(thread)) && mt.equal($$BaseKB))) || ((NIL != $mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue(thread)) && mt.equal($$UniversalVocabularyMt))) || ((NIL != $mts_forbid_lexical_mts$.getDynamicValue(thread)) && (NIL != isa.isaP(mt, $$LexicalMicrotheory, UNPROVIDED, UNPROVIDED)))) || ((NIL != $mts_forbid_project_mts$.getDynamicValue(thread)) && (NIL != likely_project_related_assertionP(mt))));
    }

    /**
     *
     *
     * @param MT
     * 		a microtheory
     * @return if MT is a microtheory considered likely to be created solely for the use of some cyc-based project.
     */
    @LispMethod(comment = "@param MT\r\n\t\ta microtheory\r\n@return if MT is a microtheory considered likely to be created solely for the use of some cyc-based project.")
    public static final SubLObject likely_project_related_assertionP_alt(SubLObject mt) {
        return makeBoolean((((((NIL == constant_p(mt)) || (NIL != isa.isa_in_any_mtP(mt, $$ProjectMicrotheory))) || ((NIL != isa.isa_in_any_mtP(mt, $$ApplicationContext)) && (NIL == isa.isaP(mt, $$LexicalMicrotheory, UNPROVIDED, UNPROVIDED)))) || (NIL != isa.isaP(mt, $$SourceMicrotheory, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(mt, $$MappingMicrotheory, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(mt, $$ProblemSolvingCntxt, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @param MT
     * 		a microtheory
     * @return if MT is a microtheory considered likely to be created solely for the use of some cyc-based project.
     */
    @LispMethod(comment = "@param MT\r\n\t\ta microtheory\r\n@return if MT is a microtheory considered likely to be created solely for the use of some cyc-based project.")
    public static SubLObject likely_project_related_assertionP(final SubLObject mt) {
        return makeBoolean((((((NIL == constant_p(mt)) || (NIL != isa.isa_in_any_mtP(mt, $$ProjectMicrotheory))) || ((NIL != isa.isa_in_any_mtP(mt, $$ApplicationContext)) && (NIL == isa.isaP(mt, $$LexicalMicrotheory, UNPROVIDED, UNPROVIDED)))) || (NIL != isa.isaP(mt, $$SourceMicrotheory, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(mt, $$MappingMicrotheory, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(mt, $$ProblemSolvingCntxt, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Loosely, finds assertions related to formula.
     *
     * @param FORMULA
     * 		some gaf.
     * @return a list of the ASSERTION-P objects
    An assertion is considered to be related to formula iff they share the same predicate and differ in
    exactly one argument place (or are identical).
     */
    @LispMethod(comment = "Loosely, finds assertions related to formula.\r\n\r\n@param FORMULA\r\n\t\tsome gaf.\r\n@return a list of the ASSERTION-P objects\r\nAn assertion is considered to be related to formula iff they share the same predicate and differ in\r\nexactly one argument place (or are identical).")
    public static final SubLObject mtsugg_get_related_assertions_alt(SubLObject formula) {
        SubLTrampolineFile.checkType(formula, $sym15$GAF_);
        if (arity.arity(cycl_utilities.formula_arg0(formula)).numL(TWO_INTEGER)) {
            return NIL;
        }
        {
            SubLObject missing_term = $sym16$_X;
            SubLObject mt_term = $sym17$_MT;
            SubLObject answers = NIL;
            SubLObject query_formula = NIL;
            SubLObject term_num = ZERO_INTEGER;
            SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                term_num = add(term_num, ONE_INTEGER);
                query_formula = copy_tree(formula);
                set_nth(term_num, query_formula, missing_term);
                {
                    SubLObject v_bindings = inference_kernel.new_cyc_query(list($$ist_Asserted, mt_term, query_formula), $mtsugg_related_assertion_formulas_query_mt$.getGlobalValue(), $mtsugg_related_assertion_formulas_query_properties$.getGlobalValue());
                    SubLObject cdolist_list_var_1 = v_bindings;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , binding = cdolist_list_var_1.first()) {
                        {
                            SubLObject related_formula = copy_tree(formula);
                            set_nth(term_num, related_formula, bindings.variable_binding_value(bindings.get_variable_binding(missing_term, binding)));
                            {
                                SubLObject mt = bindings.variable_binding_value(bindings.get_variable_binding(mt_term, binding));
                                SubLObject assertion = czer_meta.find_assertion_cycl(related_formula, mt);
                                if (NIL != assertion_handles.assertion_p(assertion)) {
                                    answers = cons(assertion, answers);
                                }
                            }
                        }
                    }
                }
            }
            return answers;
        }
    }

    /**
     * Loosely, finds assertions related to formula.
     *
     * @param FORMULA
     * 		some gaf.
     * @return a list of the ASSERTION-P objects
    An assertion is considered to be related to formula iff they share the same predicate and differ in
    exactly one argument place (or are identical).
     */
    @LispMethod(comment = "Loosely, finds assertions related to formula.\r\n\r\n@param FORMULA\r\n\t\tsome gaf.\r\n@return a list of the ASSERTION-P objects\r\nAn assertion is considered to be related to formula iff they share the same predicate and differ in\r\nexactly one argument place (or are identical).")
    public static SubLObject mtsugg_get_related_assertions(final SubLObject formula) {
        assert NIL != gafP(formula) : "! el_utilities.gafP(formula) " + ("el_utilities.gafP(formula) " + "CommonSymbols.NIL != el_utilities.gafP(formula) ") + formula;
        if (arity.arity(cycl_utilities.formula_arg0(formula)).numL(TWO_INTEGER)) {
            return NIL;
        }
        final SubLObject missing_term = $sym16$_X;
        final SubLObject mt_term = $sym17$_MT;
        SubLObject answers = NIL;
        SubLObject query_formula = NIL;
        SubLObject term_num = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            term_num = add(term_num, ONE_INTEGER);
            query_formula = copy_tree(formula);
            set_nth(term_num, query_formula, missing_term);
            SubLObject cdolist_list_var_$1;
            final SubLObject v_bindings = cdolist_list_var_$1 = inference_kernel.new_cyc_query(list($$ist_Asserted, mt_term, query_formula), $mtsugg_related_assertion_formulas_query_mt$.getGlobalValue(), $mtsugg_related_assertion_formulas_query_properties$.getGlobalValue());
            SubLObject binding = NIL;
            binding = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject related_formula = copy_tree(formula);
                set_nth(term_num, related_formula, bindings.variable_binding_value(bindings.get_variable_binding(missing_term, binding)));
                final SubLObject mt = bindings.variable_binding_value(bindings.get_variable_binding(mt_term, binding));
                final SubLObject assertion = czer_meta.find_assertion_cycl(related_formula, mt);
                if (NIL != assertion_handles.assertion_p(assertion)) {
                    answers = cons(assertion, answers);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                binding = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return answers;
    }

    /**
     * Gets a frequency list of microtheories associated with formula through related assertions.
     *
     * @param FORMULA
    gaf?
     * 		
     * @return an a-list.  Each key is the microtheory for an assertion related to formula (using the definition of related in
    mtsugg-get-related-assertions  Each datum is the number of times that microtheory occurred in all of the related assertions
    to FORMULA.
     */
    @LispMethod(comment = "Gets a frequency list of microtheories associated with formula through related assertions.\r\n\r\n@param FORMULA\ngaf?\r\n\t\t\r\n@return an a-list.  Each key is the microtheory for an assertion related to formula (using the definition of related in\r\nmtsugg-get-related-assertions  Each datum is the number of times that microtheory occurred in all of the related assertions\r\nto FORMULA.")
    public static final SubLObject mt_list_from_related_alt(SubLObject formula) {
        SubLTrampolineFile.checkType(formula, $sym15$GAF_);
        {
            SubLObject assertions = com.cyc.cycjava.cycl.mt_suggestor.mtsugg_get_related_assertions(formula);
            if (NIL != assertions) {
                {
                    SubLObject mts = Mapping.mapcar(ASSERTION_MONAD_MT, assertions);
                    return number_utilities.get_sorted_frequency_list(mts);
                }
            }
        }
        return NIL;
    }

    /**
     * Gets a frequency list of microtheories associated with formula through related assertions.
     *
     * @param FORMULA
    		gaf?
     * 		
     * @return an a-list.  Each key is the microtheory for an assertion related to formula (using the definition of related in
    mtsugg-get-related-assertions  Each datum is the number of times that microtheory occurred in all of the related assertions
    to FORMULA.
     */
    @LispMethod(comment = "Gets a frequency list of microtheories associated with formula through related assertions.\r\n\r\n@param FORMULA\n\t\tgaf?\r\n\t\t\r\n@return an a-list.  Each key is the microtheory for an assertion related to formula (using the definition of related in\r\nmtsugg-get-related-assertions  Each datum is the number of times that microtheory occurred in all of the related assertions\r\nto FORMULA.")
    public static SubLObject mt_list_from_related(final SubLObject formula) {
        assert NIL != gafP(formula) : "! el_utilities.gafP(formula) " + ("el_utilities.gafP(formula) " + "CommonSymbols.NIL != el_utilities.gafP(formula) ") + formula;
        final SubLObject assertions = mtsugg_get_related_assertions(formula);
        if (NIL != assertions) {
            final SubLObject mts = Mapping.mapcar(ASSERTION_MONAD_MT, assertions);
            return number_utilities.get_sorted_frequency_list(mts);
        }
        return NIL;
    }

    /**
     *
     *
     * @param TERM
    fort-p
     * 		
     * @return a 'specificity estimate' of term on a scale from 0 to 1 optimized for use in mt-suggesting.
     */
    @LispMethod(comment = "@param TERM\nfort-p\r\n\t\t\r\n@return a \'specificity estimate\' of term on a scale from 0 to 1 optimized for use in mt-suggesting.")
    public static final SubLObject mts_specificity_estimate_alt(SubLObject v_term) {
        {
            SubLObject generality = cardinality_estimates.generality_estimate(v_term);
            if (generality.numL($int$100)) {
                return ONE_INTEGER;
            } else {
                if (generality.numL($int$10000)) {
                    return $float$0_5;
                } else {
                    return $float$0_2;
                }
            }
        }
    }

    /**
     *
     *
     * @param TERM
    fort-p
     * 		
     * @return a 'specificity estimate' of term on a scale from 0 to 1 optimized for use in mt-suggesting.
     */
    @LispMethod(comment = "@param TERM\nfort-p\r\n\t\t\r\n@return a \'specificity estimate\' of term on a scale from 0 to 1 optimized for use in mt-suggesting.")
    public static SubLObject mts_specificity_estimate(final SubLObject v_term) {
        final SubLObject generality = cardinality_estimates.generality_estimate(v_term);
        if (generality.numL($int$100)) {
            return ONE_INTEGER;
        }
        if (generality.numL($int$10000)) {
            return $float$0_5;
        }
        return $float$0_2;
    }

    /**
     *
     *
     * @param TERM
     * 		some cyc term
     * @return an a-list.  Each key is a microtheory that mentions term.  Each datum is a measure of how related term is to this
    microtheory, weighted by the specificity of term.  Specifically, this measure is the product of the number of assertions
    in that mt that mention term and the specificity estimate of term.
     */
    @LispMethod(comment = "@param TERM\r\n\t\tsome cyc term\r\n@return an a-list.  Each key is a microtheory that mentions term.  Each datum is a measure of how related term is to this\r\nmicrotheory, weighted by the specificity of term.  Specifically, this measure is the product of the number of assertions\r\nin that mt that mention term and the specificity estimate of term.")
    public static final SubLObject frequency_list_of_mts_adjusted_alt(SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        {
            SubLObject freqlist = com.cyc.cycjava.cycl.mt_suggestor.frequency_list_of_mts(v_term, function_or_predicate, rule_assertion);
            SubLObject specificity = com.cyc.cycjava.cycl.mt_suggestor.mts_specificity_estimate(v_term);
            SubLObject adjusted = NIL;
            SubLObject cdolist_list_var = freqlist;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                adjusted = cons(cons(pair.first(), multiply(pair.rest(), specificity)), adjusted);
            }
            return nreverse(adjusted);
        }
    }

    /**
     *
     *
     * @param TERM
     * 		some cyc term
     * @return an a-list.  Each key is a microtheory that mentions term.  Each datum is a measure of how related term is to this
    microtheory, weighted by the specificity of term.  Specifically, this measure is the product of the number of assertions
    in that mt that mention term and the specificity estimate of term.
     */
    @LispMethod(comment = "@param TERM\r\n\t\tsome cyc term\r\n@return an a-list.  Each key is a microtheory that mentions term.  Each datum is a measure of how related term is to this\r\nmicrotheory, weighted by the specificity of term.  Specifically, this measure is the product of the number of assertions\r\nin that mt that mention term and the specificity estimate of term.")
    public static SubLObject frequency_list_of_mts_adjusted(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        final SubLObject freqlist = frequency_list_of_mts(v_term, function_or_predicate, rule_assertion);
        final SubLObject specificity = mts_specificity_estimate(v_term);
        SubLObject adjusted = NIL;
        SubLObject cdolist_list_var = freqlist;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            adjusted = cons(cons(pair.first(), multiply(pair.rest(), specificity)), adjusted);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return nreverse(adjusted);
    }

    public static final SubLObject clear_frequency_list_of_mts_alt() {
        {
            SubLObject cs = $frequency_list_of_mts_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_frequency_list_of_mts() {
        final SubLObject cs = $frequency_list_of_mts_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_frequency_list_of_mts_alt(SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($frequency_list_of_mts_caching_state$.getGlobalValue(), list(v_term, function_or_predicate, rule_assertion), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_frequency_list_of_mts(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($frequency_list_of_mts_caching_state$.getGlobalValue(), list(v_term, function_or_predicate, rule_assertion), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return an a-list.  Each key is a microtheory that mentions term.  Each datum is the number of assertions in that
    microtheory that mention term.  The return value is sorted by decreasing datum.
    If function-or-predicate is non-nil, then instead of all assertions that mention term, only ones in the
    function or predicate rule extent will be returned.
     */
    @LispMethod(comment = "@return an a-list.  Each key is a microtheory that mentions term.  Each datum is the number of assertions in that\r\nmicrotheory that mention term.  The return value is sorted by decreasing datum.\r\nIf function-or-predicate is non-nil, then instead of all assertions that mention term, only ones in the\r\nfunction or predicate rule extent will be returned.")
    public static final SubLObject frequency_list_of_mts_internal_alt(SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mts = NIL;
                if (NIL != list_utilities.sublisp_boolean(function_or_predicate)) {
                    if (NIL != fort_types_interface.predicateP(v_term)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                {
                                    SubLObject pred_var = v_term;
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_2 = NIL;
                                                                    SubLObject token_var_3 = NIL;
                                                                    while (NIL == done_var_2) {
                                                                        {
                                                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_3);
                                                                            SubLObject valid_4 = makeBoolean(token_var_3 != gaf);
                                                                            if (NIL != valid_4) {
                                                                                mts = cons(hlmt.assertion_monad_mt(gaf), mts);
                                                                            }
                                                                            done_var_2 = makeBoolean(NIL == valid_4);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(v_term, NIL, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(v_term, NIL, NIL);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_6 = NIL;
                                                                    SubLObject token_var_7 = NIL;
                                                                    while (NIL == done_var_6) {
                                                                        {
                                                                            SubLObject asst = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                                            SubLObject valid_8 = makeBoolean(token_var_7 != asst);
                                                                            if (NIL != valid_8) {
                                                                                mts = cons(hlmt.assertion_monad_mt(asst), mts);
                                                                            }
                                                                            done_var_6 = makeBoolean(NIL == valid_8);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (NIL != fort_types_interface.functionP(v_term)) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(v_term, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(v_term, NIL);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_10 = NIL;
                                                                    SubLObject token_var_11 = NIL;
                                                                    while (NIL == done_var_10) {
                                                                        {
                                                                            SubLObject asst = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                            SubLObject valid_12 = makeBoolean(token_var_11 != asst);
                                                                            if (NIL != valid_12) {
                                                                                mts = cons(hlmt.assertion_monad_mt(asst), mts);
                                                                            }
                                                                            done_var_10 = makeBoolean(NIL == valid_12);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            return com.cyc.cycjava.cycl.mt_suggestor.frequency_list_of_mts(v_term, NIL, UNPROVIDED);
                        }
                    }
                    if (length(mts).numL(FOUR_INTEGER)) {
                        return com.cyc.cycjava.cycl.mt_suggestor.frequency_list_of_mts(v_term, NIL, UNPROVIDED);
                    }
                } else {
                    if (NIL != list_utilities.sublisp_boolean(rule_assertion)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                            {
                                                                SubLObject done_var_14 = NIL;
                                                                SubLObject token_var_15 = NIL;
                                                                while (NIL == done_var_14) {
                                                                    {
                                                                        SubLObject asst = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
                                                                        SubLObject valid_16 = makeBoolean(token_var_15 != asst);
                                                                        if (NIL != valid_16) {
                                                                            if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(asst, final_index_spec)) {
                                                                                if (NIL != assertions_high.rule_assertionP(asst)) {
                                                                                    mts = cons(hlmt.assertion_monad_mt(asst), mts);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_14 = makeBoolean(NIL == valid_16);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                            {
                                                                SubLObject done_var_18 = NIL;
                                                                SubLObject token_var_19 = NIL;
                                                                while (NIL == done_var_18) {
                                                                    {
                                                                        SubLObject asst = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                                                        SubLObject valid_20 = makeBoolean(token_var_19 != asst);
                                                                        if (NIL != valid_20) {
                                                                            if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(asst, final_index_spec)) {
                                                                                mts = cons(hlmt.assertion_monad_mt(asst), mts);
                                                                            }
                                                                        }
                                                                        done_var_18 = makeBoolean(NIL == valid_20);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                if (NIL != list_utilities.sublisp_boolean(mts)) {
                    return number_utilities.get_sorted_frequency_list(mts);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return an a-list.  Each key is a microtheory that mentions term.  Each datum is the number of assertions in that
    microtheory that mention term.  The return value is sorted by decreasing datum.
    If function-or-predicate is non-nil, then instead of all assertions that mention term, only ones in the
    function or predicate rule extent will be returned.
     */
    @LispMethod(comment = "@return an a-list.  Each key is a microtheory that mentions term.  Each datum is the number of assertions in that\r\nmicrotheory that mention term.  The return value is sorted by decreasing datum.\r\nIf function-or-predicate is non-nil, then instead of all assertions that mention term, only ones in the\r\nfunction or predicate rule extent will be returned.")
    public static SubLObject frequency_list_of_mts_internal(final SubLObject v_term, final SubLObject function_or_predicate, final SubLObject rule_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        if (NIL != list_utilities.sublisp_boolean(function_or_predicate)) {
            if (NIL != fort_types_interface.predicateP(v_term)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(v_term)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(v_term);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$4 = NIL;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                            if (NIL != valid_$6) {
                                                mts = cons(hlmt.assertion_monad_mt(gaf), mts);
                                            }
                                            done_var_$4 = makeBoolean(NIL == valid_$6);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(v_term, NIL, NIL)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(v_term, NIL, NIL);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $RULE, NIL, NIL);
                                    SubLObject done_var_$5 = NIL;
                                    final SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        final SubLObject asst = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(asst));
                                        if (NIL != valid_$7) {
                                            mts = cons(hlmt.assertion_monad_mt(asst), mts);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else {
                if (NIL == fort_types_interface.functionP(v_term)) {
                    return frequency_list_of_mts(v_term, NIL, UNPROVIDED);
                }
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(v_term, NIL)) {
                        final SubLObject iterator_var3 = kb_mapping_macros.new_function_rule_final_index_spec_iterator(v_term, NIL);
                        SubLObject done_var3 = NIL;
                        final SubLObject token_var3 = NIL;
                        while (NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                            if (NIL != valid3) {
                                SubLObject final_index_iterator3 = NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $RULE, NIL, NIL);
                                    SubLObject done_var_$6 = NIL;
                                    final SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$7);
                                        final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(asst2));
                                        if (NIL != valid_$8) {
                                            mts = cons(hlmt.assertion_monad_mt(asst2), mts);
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            done_var3 = makeBoolean(NIL == valid3);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (length(mts).numL(FOUR_INTEGER)) {
                return frequency_list_of_mts(v_term, NIL, UNPROVIDED);
            }
        } else
            if (NIL != list_utilities.sublisp_boolean(rule_assertion)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                        final SubLObject iterator_var3 = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                        SubLObject done_var3 = NIL;
                        final SubLObject token_var3 = NIL;
                        while (NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                            if (NIL != valid3) {
                                SubLObject final_index_iterator3 = NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, NIL, NIL, NIL);
                                    SubLObject done_var_$7 = NIL;
                                    final SubLObject token_var_$8 = NIL;
                                    while (NIL == done_var_$7) {
                                        final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$8);
                                        final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(asst2));
                                        if (((NIL != valid_$9) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(asst2, final_index_spec3))) && (NIL != assertions_high.rule_assertionP(asst2))) {
                                            mts = cons(hlmt.assertion_monad_mt(asst2), mts);
                                        }
                                        done_var_$7 = makeBoolean(NIL == valid_$9);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var3 = makeBoolean(NIL == valid3);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                        final SubLObject iterator_var3 = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                        SubLObject done_var3 = NIL;
                        final SubLObject token_var3 = NIL;
                        while (NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                            if (NIL != valid3) {
                                SubLObject final_index_iterator3 = NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, NIL, NIL, NIL);
                                    SubLObject done_var_$8 = NIL;
                                    final SubLObject token_var_$9 = NIL;
                                    while (NIL == done_var_$8) {
                                        final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$9);
                                        final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(asst2));
                                        if ((NIL != valid_$10) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(asst2, final_index_spec3))) {
                                            mts = cons(hlmt.assertion_monad_mt(asst2), mts);
                                        }
                                        done_var_$8 = makeBoolean(NIL == valid_$10);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var3 = makeBoolean(NIL == valid3);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }

        if (NIL != list_utilities.sublisp_boolean(mts)) {
            return number_utilities.get_sorted_frequency_list(mts);
        }
        return NIL;
    }

    public static final SubLObject frequency_list_of_mts_alt(SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        {
            SubLObject caching_state = $frequency_list_of_mts_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(FREQUENCY_LIST_OF_MTS, $frequency_list_of_mts_caching_state$, NIL, EQUAL, THREE_INTEGER, FOUR_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, function_or_predicate, rule_assertion);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw31$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (function_or_predicate.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && rule_assertion.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.mt_suggestor.frequency_list_of_mts_internal(v_term, function_or_predicate, rule_assertion)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, function_or_predicate, rule_assertion));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject frequency_list_of_mts(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        SubLObject caching_state = $frequency_list_of_mts_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FREQUENCY_LIST_OF_MTS, $frequency_list_of_mts_caching_state$, NIL, EQUAL, THREE_INTEGER, FOUR_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, function_or_predicate, rule_assertion);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (function_or_predicate.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && rule_assertion.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(frequency_list_of_mts_internal(v_term, function_or_predicate, rule_assertion)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, function_or_predicate, rule_assertion));
        return memoization_state.caching_results(results3);
    }

    /**
     * A useful function for inspecting the intermediate results of the mt-suggestor from which the ultimate mt suggestion is generated.
     *
     * @param FORMULA
    el-formula-p
     * 		
     * @return a list of lists.  Each list contains information about a particular term in FORMULA.  Its first element is the term
    about which it provides information.  The rest of the elements are conses, the car of which is an mt associated with that term,
    the cdr of which is a number representing the strength of association.
     */
    @LispMethod(comment = "A useful function for inspecting the intermediate results of the mt-suggestor from which the ultimate mt suggestion is generated.\r\n\r\n@param FORMULA\nel-formula-p\r\n\t\t\r\n@return a list of lists.  Each list contains information about a particular term in FORMULA.  Its first element is the term\r\nabout which it provides information.  The rest of the elements are conses, the car of which is an mt associated with that term,\r\nthe cdr of which is a number representing the strength of association.")
    public static final SubLObject mts_get_formula_frequency_data_alt(SubLObject formula) {
        {
            SubLObject v_forts = cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED);
            SubLObject filtered = remove_if($sym32$MTS_TOO_GENERAL_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject frequency_data = NIL;
            SubLObject cdolist_list_var = filtered;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                frequency_data = cons(bq_cons(v_term, subseq(remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, com.cyc.cycjava.cycl.mt_suggestor.frequency_list_of_mts_adjusted(v_term, com.cyc.cycjava.cycl.mt_suggestor.used_as_function_or_predicateP($$Dog, formula), UNPROVIDED), CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, FIVE_INTEGER)), frequency_data);
            }
            return frequency_data;
        }
    }

    /**
     * A useful function for inspecting the intermediate results of the mt-suggestor from which the ultimate mt suggestion is generated.
     *
     * @param FORMULA
    		el-formula-p
     * 		
     * @return a list of lists.  Each list contains information about a particular term in FORMULA.  Its first element is the term
    about which it provides information.  The rest of the elements are conses, the car of which is an mt associated with that term,
    the cdr of which is a number representing the strength of association.
     */
    @LispMethod(comment = "A useful function for inspecting the intermediate results of the mt-suggestor from which the ultimate mt suggestion is generated.\r\n\r\n@param FORMULA\n\t\tel-formula-p\r\n\t\t\r\n@return a list of lists.  Each list contains information about a particular term in FORMULA.  Its first element is the term\r\nabout which it provides information.  The rest of the elements are conses, the car of which is an mt associated with that term,\r\nthe cdr of which is a number representing the strength of association.")
    public static SubLObject mts_get_formula_frequency_data(final SubLObject formula) {
        final SubLObject v_forts = cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED);
        final SubLObject filtered = remove_if($sym31$MTS_TOO_GENERAL_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject frequency_data = NIL;
        SubLObject cdolist_list_var = filtered;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            frequency_data = cons(bq_cons(v_term, subseq(remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, frequency_list_of_mts_adjusted(v_term, used_as_function_or_predicateP($$Dog, formula), UNPROVIDED), CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, FIVE_INTEGER)), frequency_data);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return frequency_data;
    }

    /**
     * Another useful function for inspecting intermediate results, and also the primary helper for suggest-mt-for-rule.
     *
     * @param FORMULA
    el-formula-p
     * 		
     * @return a list of lists.  Each list contains a microtheory and some ranking information about it, and the lists are sorted in descending
    order of preference; e.g., the mt to be suggested is the first list.  Specifically, for each list, the first element is
    the microtheory, the second element is the number of terms in FORMULA it is associated with at all (weighted by generality)
    and the third element is the total combined number of assertions in that mt that mention any of the terms in FORMULA
    (again, weighted by generality).
    The order of sorting is precisely this: the lists are first sorted by third element, and then stable-sorted by second element.
    Since there are many ties for second element, the stable sorting does exert considerable effect.
     */
    @LispMethod(comment = "Another useful function for inspecting intermediate results, and also the primary helper for suggest-mt-for-rule.\r\n\r\n@param FORMULA\nel-formula-p\r\n\t\t\r\n@return a list of lists.  Each list contains a microtheory and some ranking information about it, and the lists are sorted in descending\r\norder of preference; e.g., the mt to be suggested is the first list.  Specifically, for each list, the first element is\r\nthe microtheory, the second element is the number of terms in FORMULA it is associated with at all (weighted by generality)\r\nand the third element is the total combined number of assertions in that mt that mention any of the terms in FORMULA\r\n(again, weighted by generality).\r\nThe order of sorting is precisely this: the lists are first sorted by third element, and then stable-sorted by second element.\r\nSince there are many ties for second element, the stable sorting does exert considerable effect.")
    public static final SubLObject mts_get_summed_data_alt(SubLObject formula) {
        {
            SubLObject v_forts = cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED);
            SubLObject filtered = remove_if($sym32$MTS_TOO_GENERAL_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject mts_for_term = NIL;
            SubLObject mts_for_term_adjusted = NIL;
            SubLObject all_mt_frequencies = NIL;
            SubLObject freqlist = NIL;
            SubLObject summed_data = NIL;
            if (length(filtered).numLE(TWO_INTEGER)) {
                filtered = remove_if($sym34$MTS_TOO_GENERAL_LIGHT_FILTERING_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject cdolist_list_var = filtered;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    freqlist = list_utilities.first_n(FIVE_INTEGER, remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, com.cyc.cycjava.cycl.mt_suggestor.frequency_list_of_mts_adjusted(v_term, com.cyc.cycjava.cycl.mt_suggestor.used_as_function_or_predicateP(v_term, formula), el_implication_p(formula)), CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    mts_for_term = Mapping.mapcar(CAR, freqlist);
                    mts_for_term_adjusted = Mapping.mapcar(CONS, mts_for_term, new SubLObject[]{ make_list(length(mts_for_term), com.cyc.cycjava.cycl.mt_suggestor.mts_specificity_estimate(v_term)) });
                    all_mt_frequencies = append(all_mt_frequencies, freqlist);
                    summed_data = append(summed_data, mts_for_term_adjusted);
                }
            }
            {
                SubLObject small_number_hash = make_hash_table(TEN_INTEGER, EQUAL, UNPROVIDED);
                SubLObject big_number_hash = make_hash_table(TEN_INTEGER, EQUAL, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = summed_data;
                    SubLObject dotted_pair = NIL;
                    for (dotted_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dotted_pair = cdolist_list_var.first()) {
                        hash_table_utilities.cinc_hash(dotted_pair.first(), small_number_hash, dotted_pair.rest(), UNPROVIDED);
                    }
                }
                {
                    SubLObject cdolist_list_var = all_mt_frequencies;
                    SubLObject dotted_pair = NIL;
                    for (dotted_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dotted_pair = cdolist_list_var.first()) {
                        hash_table_utilities.cinc_hash(dotted_pair.first(), big_number_hash, dotted_pair.rest(), UNPROVIDED);
                    }
                }
                {
                    SubLObject combined_data = com.cyc.cycjava.cycl.mt_suggestor.get_combined_list_for_mts_summed_data(hash_table_utilities.hash_table_to_alist(small_number_hash), hash_table_utilities.hash_table_to_alist(big_number_hash));
                    SubLObject semi_sorted = Sort.sort(combined_data, $sym36$_, CADDR);
                    SubLObject sorted = Sort.stable_sort(semi_sorted, $sym36$_, CADR);
                    return sorted;
                }
            }
        }
    }

    /**
     * Another useful function for inspecting intermediate results, and also the primary helper for suggest-mt-for-rule.
     *
     * @param FORMULA
    		el-formula-p
     * 		
     * @return a list of lists.  Each list contains a microtheory and some ranking information about it, and the lists are sorted in descending
    order of preference; e.g., the mt to be suggested is the first list.  Specifically, for each list, the first element is
    the microtheory, the second element is the number of terms in FORMULA it is associated with at all (weighted by generality)
    and the third element is the total combined number of assertions in that mt that mention any of the terms in FORMULA
    (again, weighted by generality).
    The order of sorting is precisely this: the lists are first sorted by third element, and then stable-sorted by second element.
    Since there are many ties for second element, the stable sorting does exert considerable effect.
     */
    @LispMethod(comment = "Another useful function for inspecting intermediate results, and also the primary helper for suggest-mt-for-rule.\r\n\r\n@param FORMULA\n\t\tel-formula-p\r\n\t\t\r\n@return a list of lists.  Each list contains a microtheory and some ranking information about it, and the lists are sorted in descending\r\norder of preference; e.g., the mt to be suggested is the first list.  Specifically, for each list, the first element is\r\nthe microtheory, the second element is the number of terms in FORMULA it is associated with at all (weighted by generality)\r\nand the third element is the total combined number of assertions in that mt that mention any of the terms in FORMULA\r\n(again, weighted by generality).\r\nThe order of sorting is precisely this: the lists are first sorted by third element, and then stable-sorted by second element.\r\nSince there are many ties for second element, the stable sorting does exert considerable effect.")
    public static SubLObject mts_get_summed_data(final SubLObject formula) {
        final SubLObject v_forts = cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED);
        SubLObject filtered = remove_if($sym31$MTS_TOO_GENERAL_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject mts_for_term = NIL;
        SubLObject mts_for_term_adjusted = NIL;
        SubLObject all_mt_frequencies = NIL;
        SubLObject freqlist = NIL;
        SubLObject summed_data = NIL;
        if (length(filtered).numLE(TWO_INTEGER)) {
            filtered = remove_if($sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = filtered;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            freqlist = list_utilities.first_n(FIVE_INTEGER, remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, frequency_list_of_mts_adjusted(v_term, used_as_function_or_predicateP(v_term, formula), el_implication_p(formula)), CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            mts_for_term = Mapping.mapcar(CAR, freqlist);
            mts_for_term_adjusted = Mapping.mapcar(CONS, mts_for_term, new SubLObject[]{ make_list(length(mts_for_term), mts_specificity_estimate(v_term)) });
            all_mt_frequencies = append(all_mt_frequencies, freqlist);
            summed_data = append(summed_data, mts_for_term_adjusted);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        final SubLObject small_number_hash = make_hash_table(TEN_INTEGER, EQUAL, UNPROVIDED);
        final SubLObject big_number_hash = make_hash_table(TEN_INTEGER, EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var2 = summed_data;
        SubLObject dotted_pair = NIL;
        dotted_pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            hash_table_utilities.cinc_hash(dotted_pair.first(), small_number_hash, dotted_pair.rest(), UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            dotted_pair = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = all_mt_frequencies;
        dotted_pair = NIL;
        dotted_pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            hash_table_utilities.cinc_hash(dotted_pair.first(), big_number_hash, dotted_pair.rest(), UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            dotted_pair = cdolist_list_var2.first();
        } 
        final SubLObject combined_data = get_combined_list_for_mts_summed_data(hash_table_utilities.hash_table_to_alist(small_number_hash), hash_table_utilities.hash_table_to_alist(big_number_hash));
        final SubLObject semi_sorted = Sort.sort(combined_data, $sym35$_, CADDR);
        final SubLObject sorted = Sort.stable_sort(semi_sorted, $sym35$_, CADR);
        return sorted;
    }

    /**
     * A minor helper function for get-summed-data.
     */
    @LispMethod(comment = "A minor helper function for get-summed-data.")
    public static final SubLObject get_combined_list_for_mts_summed_data_alt(SubLObject lst1, SubLObject lst2) {
        {
            SubLObject final_list = NIL;
            SubLObject one_element = NIL;
            SubLObject pair = NIL;
            SubLObject cdolist_list_var = lst1;
            SubLObject elt = NIL;
            for (elt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elt = cdolist_list_var.first()) {
                pair = find(elt.first(), lst2, EQUAL, CAR, UNPROVIDED, UNPROVIDED);
                one_element = list(elt.first(), elt.rest(), pair.rest());
                final_list = cons(one_element, final_list);
            }
            return final_list;
        }
    }

    /**
     * A minor helper function for get-summed-data.
     */
    @LispMethod(comment = "A minor helper function for get-summed-data.")
    public static SubLObject get_combined_list_for_mts_summed_data(final SubLObject lst1, final SubLObject lst2) {
        SubLObject final_list = NIL;
        SubLObject one_element = NIL;
        SubLObject pair = NIL;
        SubLObject cdolist_list_var = lst1;
        SubLObject elt = NIL;
        elt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pair = find(elt.first(), lst2, EQUAL, CAR, UNPROVIDED, UNPROVIDED);
            one_element = list(elt.first(), elt.rest(), pair.rest());
            final_list = cons(one_element, final_list);
            cdolist_list_var = cdolist_list_var.rest();
            elt = cdolist_list_var.first();
        } 
        return final_list;
    }/**
     * A minor helper function for get-summed-data.
     */


    /**
     * A filter function for the mt suggestor.  All terms that are
     * considered 'too general' will be essentially thrown out of the list
     * of terms that suggest-mt-by-content uses to suggest an mt.  This has
     * two effects: 1, it improves performance, especially because most of
     * these terms have very many assertions and slow the process down
     * considerably, and 2, it reduces noise, because these terms generally
     * contribute little to the mt-suggesting process.  If light-filtering
     * is set to true, then it will do a bare minimum of filtering.  Light
     * filtering is suitable for very general assertions that should go in
     * CoreCycLMt and the like, and the mt suggestor will attempt to
     * determine which type of filtering is more suitable.
     */
    @LispMethod(comment = "A filter function for the mt suggestor.  All terms that are\r\nconsidered \'too general\' will be essentially thrown out of the list\r\nof terms that suggest-mt-by-content uses to suggest an mt.  This has\r\ntwo effects: 1, it improves performance, especially because most of\r\nthese terms have very many assertions and slow the process down\r\nconsiderably, and 2, it reduces noise, because these terms generally\r\ncontribute little to the mt-suggesting process.  If light-filtering\r\nis set to true, then it will do a bare minimum of filtering.  Light\r\nfiltering is suitable for very general assertions that should go in\r\nCoreCycLMt and the like, and the mt suggestor will attempt to\r\ndetermine which type of filtering is more suitable.\nA filter function for the mt suggestor.  All terms that are\nconsidered \'too general\' will be essentially thrown out of the list\nof terms that suggest-mt-by-content uses to suggest an mt.  This has\ntwo effects: 1, it improves performance, especially because most of\nthese terms have very many assertions and slow the process down\nconsiderably, and 2, it reduces noise, because these terms generally\ncontribute little to the mt-suggesting process.  If light-filtering\nis set to true, then it will do a bare minimum of filtering.  Light\nfiltering is suitable for very general assertions that should go in\nCoreCycLMt and the like, and the mt suggestor will attempt to\ndetermine which type of filtering is more suitable.")
    public static final SubLObject mts_too_generalP_alt(SubLObject v_term, SubLObject light_filtering) {
        if (light_filtering == UNPROVIDED) {
            light_filtering = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_term, $mtsugg_too_general_term_filter$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || ((NIL == light_filtering) && (((NIL != isa.isaP(v_term, $$MetaRelation, UNPROVIDED, UNPROVIDED)) || (NIL != isa.quoted_isaP(v_term, $$CoreConstant, $$EverythingPSC, UNPROVIDED))) || (NIL != isa.isaP(v_term, $$KEFacilitationPredicate, UNPROVIDED, UNPROVIDED)))));
    }

    /**
     * A filter function for the mt suggestor.  All terms that are
     * considered 'too general' will be essentially thrown out of the list
     * of terms that suggest-mt-by-content uses to suggest an mt.  This has
     * two effects: 1, it improves performance, especially because most of
     * these terms have very many assertions and slow the process down
     * considerably, and 2, it reduces noise, because these terms generally
     * contribute little to the mt-suggesting process.  If light-filtering
     * is set to true, then it will do a bare minimum of filtering.  Light
     * filtering is suitable for very general assertions that should go in
     * CoreCycLMt and the like, and the mt suggestor will attempt to
     * determine which type of filtering is more suitable.
     */
    @LispMethod(comment = "A filter function for the mt suggestor.  All terms that are\r\nconsidered \'too general\' will be essentially thrown out of the list\r\nof terms that suggest-mt-by-content uses to suggest an mt.  This has\r\ntwo effects: 1, it improves performance, especially because most of\r\nthese terms have very many assertions and slow the process down\r\nconsiderably, and 2, it reduces noise, because these terms generally\r\ncontribute little to the mt-suggesting process.  If light-filtering\r\nis set to true, then it will do a bare minimum of filtering.  Light\r\nfiltering is suitable for very general assertions that should go in\r\nCoreCycLMt and the like, and the mt suggestor will attempt to\r\ndetermine which type of filtering is more suitable.\nA filter function for the mt suggestor.  All terms that are\nconsidered \'too general\' will be essentially thrown out of the list\nof terms that suggest-mt-by-content uses to suggest an mt.  This has\ntwo effects: 1, it improves performance, especially because most of\nthese terms have very many assertions and slow the process down\nconsiderably, and 2, it reduces noise, because these terms generally\ncontribute little to the mt-suggesting process.  If light-filtering\nis set to true, then it will do a bare minimum of filtering.  Light\nfiltering is suitable for very general assertions that should go in\nCoreCycLMt and the like, and the mt suggestor will attempt to\ndetermine which type of filtering is more suitable.")
    public static SubLObject mts_too_generalP(final SubLObject v_term, SubLObject light_filtering) {
        if (light_filtering == UNPROVIDED) {
            light_filtering = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_term, $mtsugg_too_general_term_filter$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || ((NIL == light_filtering) && (((NIL != isa.isaP(v_term, $$MetaRelation, UNPROVIDED, UNPROVIDED)) || (NIL != isa.quoted_isaP(v_term, $$CoreConstant, $$EverythingPSC, UNPROVIDED))) || (NIL != isa.isaP(v_term, $$KEFacilitationPredicate, UNPROVIDED, UNPROVIDED)))));
    }/**
     * A filter function for the mt suggestor.  All terms that are
     * considered 'too general' will be essentially thrown out of the list
     * of terms that suggest-mt-by-content uses to suggest an mt.  This has
     * two effects: 1, it improves performance, especially because most of
     * these terms have very many assertions and slow the process down
     * considerably, and 2, it reduces noise, because these terms generally
     * contribute little to the mt-suggesting process.  If light-filtering
     * is set to true, then it will do a bare minimum of filtering.  Light
     * filtering is suitable for very general assertions that should go in
     * CoreCycLMt and the like, and the mt suggestor will attempt to
     * determine which type of filtering is more suitable.
     */


    /**
     * Single argument version of mts-too-general? with opposite default
     */
    @LispMethod(comment = "Single argument version of mts-too-general? with opposite default")
    public static final SubLObject mts_too_general_light_filteringP_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.mt_suggestor.mts_too_generalP(v_term, T);
    }

    /**
     * Single argument version of mts-too-general? with opposite default
     */
    @LispMethod(comment = "Single argument version of mts-too-general? with opposite default")
    public static SubLObject mts_too_general_light_filteringP(final SubLObject v_term) {
        return mts_too_generalP(v_term, T);
    }/**
     * Single argument version of mts-too-general? with opposite default
     */


    /**
     *
     *
     * @param PREDICATE
    predicate-p
     * 		
     * @param MAX-ASSERTIONS
     * 		the maximum number of assertions to try to get
     * @return a frequency list of the mts of all the assertions in the predicate extent of predicate, unless the predicate
    extent is greater than max-assertions, in which case this returns nil.
     */
    @LispMethod(comment = "@param PREDICATE\npredicate-p\r\n\t\t\r\n@param MAX-ASSERTIONS\r\n\t\tthe maximum number of assertions to try to get\r\n@return a frequency list of the mts of all the assertions in the predicate extent of predicate, unless the predicate\r\nextent is greater than max-assertions, in which case this returns nil.")
    public static final SubLObject get_mt_list_for_predicate_alt(SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED).numG(max_assertions)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        {
                            SubLObject assertions = kb_mapping.gather_predicate_extent_index(predicate, UNPROVIDED, UNPROVIDED);
                            SubLObject mts = Mapping.mapcar(ASSERTION_MT, assertions);
                            result = (NIL != mts) ? ((SubLObject) (number_utilities.get_sorted_frequency_list(mts))) : NIL;
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param PREDICATE
    predicate-p
     * 		
     * @param MAX-ASSERTIONS
     * 		the maximum number of assertions to try to get
     * @return a frequency list of the mts of all the assertions in the predicate extent of predicate, unless the predicate
    extent is greater than max-assertions, in which case this returns nil.
     */
    @LispMethod(comment = "@param PREDICATE\npredicate-p\r\n\t\t\r\n@param MAX-ASSERTIONS\r\n\t\tthe maximum number of assertions to try to get\r\n@return a frequency list of the mts of all the assertions in the predicate extent of predicate, unless the predicate\r\nextent is greater than max-assertions, in which case this returns nil.")
    public static SubLObject get_mt_list_for_predicate(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED).numG(max_assertions)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            final SubLObject assertions = kb_mapping.gather_predicate_extent_index(predicate, UNPROVIDED, UNPROVIDED);
            final SubLObject mts = Mapping.mapcar(ASSERTION_MT, assertions);
            result = (NIL != mts) ? number_utilities.get_sorted_frequency_list(mts) : NIL;
        } finally {
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject clear_top_mt_percent_count_alt() {
        {
            SubLObject cs = $top_mt_percent_count_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_top_mt_percent_count() {
        final SubLObject cs = $top_mt_percent_count_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_top_mt_percent_count_alt(SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        return memoization_state.caching_state_remove_function_results_with_args($top_mt_percent_count_caching_state$.getGlobalValue(), list(predicate, max_assertions), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_top_mt_percent_count(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        return memoization_state.caching_state_remove_function_results_with_args($top_mt_percent_count_caching_state$.getGlobalValue(), list(predicate, max_assertions), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param PREDICATE
    predicate-p
     * 		
     * @param MAX-ASSERTIONS
     * 		the maximum number of assertions to try to get
     * @return a list with three elements.  The first is the microtheory most commonly occurring in the predicate
    extent of PREDICATE.  The second is the percent of the assertions in the predicate extent of PREDICATE that are
    in that mt.  The third is the total number of the assertions in the predicate extent of PREDICATE that are in
    that mt.
     */
    @LispMethod(comment = "@param PREDICATE\npredicate-p\r\n\t\t\r\n@param MAX-ASSERTIONS\r\n\t\tthe maximum number of assertions to try to get\r\n@return a list with three elements.  The first is the microtheory most commonly occurring in the predicate\r\nextent of PREDICATE.  The second is the percent of the assertions in the predicate extent of PREDICATE that are\r\nin that mt.  The third is the total number of the assertions in the predicate extent of PREDICATE that are in\r\nthat mt.")
    public static final SubLObject top_mt_percent_count_internal_alt(SubLObject predicate, SubLObject max_assertions) {
        {
            SubLObject freq_list = com.cyc.cycjava.cycl.mt_suggestor.get_mt_list_for_predicate(predicate, max_assertions);
            SubLObject total = (NIL != freq_list) ? ((SubLObject) (apply($sym49$_, Mapping.mapcar(CDR, freq_list)))) : NIL;
            return NIL != freq_list ? ((SubLObject) (list(caar(freq_list), divide(cdar(freq_list), total), total))) : NIL;
        }
    }

    /**
     *
     *
     * @param PREDICATE
    predicate-p
     * 		
     * @param MAX-ASSERTIONS
     * 		the maximum number of assertions to try to get
     * @return a list with three elements.  The first is the microtheory most commonly occurring in the predicate
    extent of PREDICATE.  The second is the percent of the assertions in the predicate extent of PREDICATE that are
    in that mt.  The third is the total number of the assertions in the predicate extent of PREDICATE that are in
    that mt.
     */
    @LispMethod(comment = "@param PREDICATE\npredicate-p\r\n\t\t\r\n@param MAX-ASSERTIONS\r\n\t\tthe maximum number of assertions to try to get\r\n@return a list with three elements.  The first is the microtheory most commonly occurring in the predicate\r\nextent of PREDICATE.  The second is the percent of the assertions in the predicate extent of PREDICATE that are\r\nin that mt.  The third is the total number of the assertions in the predicate extent of PREDICATE that are in\r\nthat mt.")
    public static SubLObject top_mt_percent_count_internal(final SubLObject predicate, final SubLObject max_assertions) {
        final SubLObject freq_list = get_mt_list_for_predicate(predicate, max_assertions);
        final SubLObject total = (NIL != freq_list) ? apply($sym48$_, Mapping.mapcar(CDR, freq_list)) : NIL;
        return NIL != freq_list ? list(caar(freq_list), divide(cdar(freq_list), total), total) : NIL;
    }

    public static final SubLObject top_mt_percent_count_alt(SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        {
            SubLObject caching_state = $top_mt_percent_count_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TOP_MT_PERCENT_COUNT, $top_mt_percent_count_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$25);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, max_assertions);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw31$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (predicate.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max_assertions.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.mt_suggestor.top_mt_percent_count_internal(predicate, max_assertions)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, max_assertions));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject top_mt_percent_count(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        SubLObject caching_state = $top_mt_percent_count_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TOP_MT_PERCENT_COUNT, $top_mt_percent_count_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$25);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, max_assertions);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max_assertions.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(top_mt_percent_count_internal(predicate, max_assertions)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, max_assertions));
        return memoization_state.caching_results(results3);
    }

    /**
     * Generally, returns whether term is 'used as' a predicate or a function in formula.
     *
     * @unknown iff TERM is the first element of any sublist of FORMULA.
     */
    @LispMethod(comment = "Generally, returns whether term is \'used as\' a predicate or a function in formula.\r\n\r\n@unknown iff TERM is the first element of any sublist of FORMULA.")
    public static final SubLObject used_as_function_or_predicateP_alt(SubLObject v_term, SubLObject formula) {
        {
            SubLObject positions = list_utilities.tree_positions(v_term, formula, EQUAL, UNPROVIDED);
            SubLObject atoms = remove_if(LISTP, positions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject lists = remove_if(ATOM, positions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject last_elements = Mapping.mapcar(CAR, Mapping.mapcar(LAST, lists));
            return makeBoolean((NIL != subl_promotions.memberP(ZERO_INTEGER, atoms, EQUAL, UNPROVIDED)) || (NIL != member(ZERO_INTEGER, last_elements, EQUAL, UNPROVIDED)));
        }
    }

    @LispMethod(comment = "Generally, returns whether term is \'used as\' a predicate or a function in formula.\r\n\r\n@unknown iff TERM is the first element of any sublist of FORMULA.")
    public static SubLObject used_as_function_or_predicateP(final SubLObject v_term, final SubLObject formula) {
        final SubLObject positions = list_utilities.tree_positions(v_term, formula, EQUAL, UNPROVIDED);
        final SubLObject atoms = remove_if(LISTP, positions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject lists = remove_if(ATOM, positions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject last_elements = Mapping.mapcar(CAR, Mapping.mapcar(LAST, lists));
        return makeBoolean((NIL != subl_promotions.memberP(ZERO_INTEGER, atoms, EQUAL, UNPROVIDED)) || (NIL != member(ZERO_INTEGER, last_elements, EQUAL, UNPROVIDED)));
    }/**
     * Generally, returns whether term is 'used as' a predicate or a function in formula.
     *
     * @unknown iff TERM is the first element of any sublist of FORMULA.
     */


    /**
     * Runs all the currently defined test for the mt suggestor, and then prints the end results.
     *
     * @param VERBOSE,
     * 		whether to print intermediate, assertion-by-assertion results.
     */
    @LispMethod(comment = "Runs all the currently defined test for the mt suggestor, and then prints the end results.\r\n\r\n@param VERBOSE,\r\n\t\twhether to print intermediate, assertion-by-assertion results.")
    public static final SubLObject mts_run_all_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        {
            SubLObject all_tests = $list_alt56;
            SubLObject results = NIL;
            SubLObject testname = NIL;
            com.cyc.cycjava.cycl.mt_suggestor.mts_clear_test_results();
            com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
            {
                SubLObject cdolist_list_var = all_tests;
                SubLObject test = NIL;
                for (test = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test = cdolist_list_var.first()) {
                    testname = subseq(symbol_name(test), FOUR_INTEGER, UNPROVIDED);
                    princ($str_alt57$Running_test__, UNPROVIDED);
                    princ(testname, UNPROVIDED);
                    terpri(UNPROVIDED);
                    results = funcall(test, verbose);
                    terpri(UNPROVIDED);
                    princ(testname, UNPROVIDED);
                    princ($str_alt58$_RESULTS__, UNPROVIDED);
                    princ(results, UNPROVIDED);
                    terpri(UNPROVIDED);
                    terpri(UNPROVIDED);
                }
            }
            return T;
        }
    }

    @LispMethod(comment = "Runs all the currently defined test for the mt suggestor, and then prints the end results.\r\n\r\n@param VERBOSE,\r\n\t\twhether to print intermediate, assertion-by-assertion results.")
    public static SubLObject mts_run_all_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLObject all_tests = $list55;
        SubLObject results = NIL;
        SubLObject testname = NIL;
        mts_clear_test_results();
        mts_clear_tests();
        SubLObject cdolist_list_var = all_tests;
        SubLObject test = NIL;
        test = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            testname = subseq(symbol_name(test), FOUR_INTEGER, UNPROVIDED);
            princ($str56$Running_test__, UNPROVIDED);
            princ(testname, UNPROVIDED);
            terpri(UNPROVIDED);
            results = funcall(test, verbose);
            terpri(UNPROVIDED);
            princ(testname, UNPROVIDED);
            princ($str57$_RESULTS__, UNPROVIDED);
            princ(results, UNPROVIDED);
            terpri(UNPROVIDED);
            terpri(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            test = cdolist_list_var.first();
        } 
        return T;
    }/**
     * Runs all the currently defined test for the mt suggestor, and then prints the end results.
     *
     * @param VERBOSE,
     * 		whether to print intermediate, assertion-by-assertion results.
     */


    /**
     * Clears the mt suggestor tests; leaves the results alone.
     */
    @LispMethod(comment = "Clears the mt suggestor tests; leaves the results alone.")
    public static final SubLObject mts_clear_tests_alt() {
        $examination_mts$.setGlobalValue(NIL);
        $examination_formulas$.setGlobalValue(NIL);
        return NIL;
    }

    @LispMethod(comment = "Clears the mt suggestor tests; leaves the results alone.")
    public static SubLObject mts_clear_tests() {
        $examination_mts$.setGlobalValue(NIL);
        $examination_formulas$.setGlobalValue(NIL);
        return NIL;
    }/**
     * Clears the mt suggestor tests; leaves the results alone.
     */


    /**
     * Clears the mt suggestor results; leaves the tests alone.
     */
    @LispMethod(comment = "Clears the mt suggestor results; leaves the tests alone.")
    public static final SubLObject mts_clear_test_results_alt() {
        $mts_incorrect_formulas$.setGlobalValue(NIL);
        $mts_actual_mts$.setGlobalValue(NIL);
        $mts_guessed_mts$.setGlobalValue(NIL);
        return NIL;
    }

    @LispMethod(comment = "Clears the mt suggestor results; leaves the tests alone.")
    public static SubLObject mts_clear_test_results() {
        $mts_incorrect_formulas$.setGlobalValue(NIL);
        $mts_actual_mts$.setGlobalValue(NIL);
        $mts_guessed_mts$.setGlobalValue(NIL);
        return NIL;
    }/**
     * Clears the mt suggestor results; leaves the tests alone.
     */


    /**
     * Prints the results of an mt-suggestor test.  Displaying formula, suggested mt, correct mt, and the results of some statistical tests.
     *
     * @param VERBOSE,
     * 		if nil just prints the statistical tests.
     */
    @LispMethod(comment = "Prints the results of an mt-suggestor test.  Displaying formula, suggested mt, correct mt, and the results of some statistical tests.\r\n\r\n@param VERBOSE,\r\n\t\tif nil just prints the statistical tests.")
    public static final SubLObject mts_print_test_results_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = T;
        }
        if (NIL != verbose) {
            {
                SubLObject cdotimes_end_var = length($mts_incorrect_formulas$.getGlobalValue());
                SubLObject n = NIL;
                for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                    princ($str_alt59$Incorrect_Formula__, UNPROVIDED);
                    terpri(UNPROVIDED);
                    princ(nth(n, $mts_incorrect_formulas$.getGlobalValue()), UNPROVIDED);
                    terpri(UNPROVIDED);
                    princ($str_alt60$Suggested_Mt__, UNPROVIDED);
                    princ(nth(n, $mts_guessed_mts$.getGlobalValue()), UNPROVIDED);
                    terpri(UNPROVIDED);
                    princ($str_alt61$Actual_Mt__, UNPROVIDED);
                    princ(nth(n, $mts_actual_mts$.getGlobalValue()), UNPROVIDED);
                    terpri(UNPROVIDED);
                }
            }
        }
        princ($str_alt62$Frequency_list_of_suggested_mts__, UNPROVIDED);
        terpri(UNPROVIDED);
        princ(number_utilities.get_sorted_frequency_list($mts_guessed_mts$.getGlobalValue()), UNPROVIDED);
        terpri(UNPROVIDED);
        princ($str_alt63$Frequency_list_of_actual_mts__, UNPROVIDED);
        terpri(UNPROVIDED);
        princ(number_utilities.get_sorted_frequency_list($mts_actual_mts$.getGlobalValue()), UNPROVIDED);
        terpri(UNPROVIDED);
        terpri(UNPROVIDED);
        terpri(UNPROVIDED);
        return NIL;
    }

    @LispMethod(comment = "Prints the results of an mt-suggestor test.  Displaying formula, suggested mt, correct mt, and the results of some statistical tests.\r\n\r\n@param VERBOSE,\r\n\t\tif nil just prints the statistical tests.")
    public static SubLObject mts_print_test_results(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = T;
        }
        if (NIL != verbose) {
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = length($mts_incorrect_formulas$.getGlobalValue()), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                princ($str58$Incorrect_Formula__, UNPROVIDED);
                terpri(UNPROVIDED);
                princ(nth(n, $mts_incorrect_formulas$.getGlobalValue()), UNPROVIDED);
                terpri(UNPROVIDED);
                princ($str59$Suggested_Mt__, UNPROVIDED);
                princ(nth(n, $mts_guessed_mts$.getGlobalValue()), UNPROVIDED);
                terpri(UNPROVIDED);
                princ($str60$Actual_Mt__, UNPROVIDED);
                princ(nth(n, $mts_actual_mts$.getGlobalValue()), UNPROVIDED);
                terpri(UNPROVIDED);
            }
        }
        princ($str61$Frequency_list_of_suggested_mts__, UNPROVIDED);
        terpri(UNPROVIDED);
        princ(number_utilities.get_sorted_frequency_list($mts_guessed_mts$.getGlobalValue()), UNPROVIDED);
        terpri(UNPROVIDED);
        princ($str62$Frequency_list_of_actual_mts__, UNPROVIDED);
        terpri(UNPROVIDED);
        princ(number_utilities.get_sorted_frequency_list($mts_actual_mts$.getGlobalValue()), UNPROVIDED);
        terpri(UNPROVIDED);
        terpri(UNPROVIDED);
        terpri(UNPROVIDED);
        return NIL;
    }/**
     * Prints the results of an mt-suggestor test.  Displaying formula, suggested mt, correct mt, and the results of some statistical tests.
     *
     * @param VERBOSE,
     * 		if nil just prints the statistical tests.
     */


    /**
     * Runs a test with whatever formulas are currently in *examination-formulas*
     */
    @LispMethod(comment = "Runs a test with whatever formulas are currently in *examination-formulas*")
    public static final SubLObject mts_default_test_alt(SubLObject print) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        return com.cyc.cycjava.cycl.mt_suggestor.test_mt_suggestor($examination_formulas$.getGlobalValue(), $examination_mts$.getGlobalValue(), print);
    }

    @LispMethod(comment = "Runs a test with whatever formulas are currently in *examination-formulas*")
    public static SubLObject mts_default_test(SubLObject print) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        return test_mt_suggestor($examination_formulas$.getGlobalValue(), $examination_mts$.getGlobalValue(), print);
    }/**
     * Runs a test with whatever formulas are currently in *examination-formulas*
     */


    /**
     * Test the mt suggestor on recent assertions made for specific cyc-based projects.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Test the mt suggestor on recent assertions made for specific cyc-based projects.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_new_project_assertions_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject numassertions = divide(assertions, FOUR_INTEGER);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$SAICLegacyAssertionsMt, numassertions, T, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$PredicatePopulationMt, numassertions, T, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$TestVocabularyMt, numassertions, T, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$MotleyFoolUKGlossaryMt, numassertions, T, T);
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Test the mt suggestor on recent assertions made for specific cyc-based projects.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_new_project_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numassertions = divide(assertions, FOUR_INTEGER);
        add_n_assertions_in_mt($$SAICLegacyAssertionsMt, numassertions, T, T);
        add_n_assertions_in_mt($$PredicatePopulationMt, numassertions, T, T);
        add_n_assertions_in_mt($$TestVocabularyMt, numassertions, T, T);
        add_n_assertions_in_mt($$MotleyFoolUKGlossaryMt, numassertions, T, T);
        return mts_default_test(print);
    }/**
     * Test the mt suggestor on recent assertions made for specific cyc-based projects.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on old assertions made for specific cyc-based projects.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on old assertions made for specific cyc-based projects.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_old_project_assertions_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject numrules = divide(assertions, SIX_INTEGER);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$WebSearchEnhancementMt, numrules, T, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$DesertShieldMt, numrules, T, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$OilEconModelMt, numrules, T, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$Y2Scenario_Stage1Mt, numrules, T, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$BeachWalkIMt, numrules, T, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$PQ204Mt, numrules, T, T);
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on old assertions made for specific cyc-based projects.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_old_project_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numrules = divide(assertions, SIX_INTEGER);
        add_n_assertions_in_mt($$WebSearchEnhancementMt, numrules, T, T);
        add_n_assertions_in_mt($$DesertShieldMt, numrules, T, T);
        add_n_assertions_in_mt($$OilEconModelMt, numrules, T, T);
        add_n_assertions_in_mt($$Y2Scenario_Stage1Mt, numrules, T, T);
        add_n_assertions_in_mt($$BeachWalkIMt, numrules, T, T);
        add_n_assertions_in_mt($$PQ204Mt, numrules, T, T);
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on old assertions made for specific cyc-based projects.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on definitional assertions - specifically those gafs with the predicate #$isa or #$genls.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on definitional assertions - specifically those gafs with the predicate #$isa or #$genls.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_definitional_assertions_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject assts = append(com.cyc.cycjava.cycl.mt_suggestor.get_about_n_representative_assertions_from_pred($$isa, divide(assertions, TWO_INTEGER)), com.cyc.cycjava.cycl.mt_suggestor.get_about_n_representative_assertions_from_pred($$genls, divide(assertions, TWO_INTEGER)));
            SubLObject cdolist_list_var = assts;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
                $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
            }
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on definitional assertions - specifically those gafs with the predicate #$isa or #$genls.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_definitional_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        SubLObject cdolist_list_var;
        final SubLObject assts = cdolist_list_var = append(get_about_n_representative_assertions_from_pred($$isa, divide(assertions, TWO_INTEGER)), get_about_n_representative_assertions_from_pred($$genls, divide(assertions, TWO_INTEGER)));
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
            $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on definitional assertions - specifically those gafs with the predicate #$isa or #$genls.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on a collection of gafs with a #$MetaPredicate predicate.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on a collection of gafs with a #$MetaPredicate predicate.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_meta_predicates_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject numpredicates = ceiling(divide(assertions, FIVE_INTEGER), UNPROVIDED);
            SubLObject predicates = com.cyc.cycjava.cycl.mt_suggestor.mts_random_subset(isa.all_fort_instances($$MetaPredicate, UNPROVIDED, UNPROVIDED), numpredicates);
            SubLObject assts = NIL;
            {
                SubLObject cdolist_list_var = predicates;
                SubLObject pred = NIL;
                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                    assts = append(assts, com.cyc.cycjava.cycl.mt_suggestor.get_about_n_representative_assertions_from_pred(pred, ceiling(divide(assertions, numpredicates), UNPROVIDED)));
                }
            }
            {
                SubLObject cdolist_list_var = assts;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
                    $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
                }
            }
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on a collection of gafs with a #$MetaPredicate predicate.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_meta_predicates_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numpredicates = ceiling(divide(assertions, FIVE_INTEGER), UNPROVIDED);
        final SubLObject predicates = mts_random_subset(isa.all_fort_instances($$MetaPredicate, UNPROVIDED, UNPROVIDED), numpredicates);
        SubLObject assts = NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assts = append(assts, get_about_n_representative_assertions_from_pred(pred, ceiling(divide(assertions, numpredicates), UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        cdolist_list_var = assts;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
            $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on a collection of gafs with a #$MetaPredicate predicate.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on a collection of rule macro predicate assertions.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on a collection of rule macro predicate assertions.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_rule_macro_predicates_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject numpredicates = ceiling(divide(assertions, FIVE_INTEGER), UNPROVIDED);
            SubLObject predicates = com.cyc.cycjava.cycl.mt_suggestor.mts_random_subset(isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED), numpredicates);
            SubLObject assts = NIL;
            {
                SubLObject cdolist_list_var = predicates;
                SubLObject pred = NIL;
                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                    assts = append(assts, com.cyc.cycjava.cycl.mt_suggestor.get_about_n_representative_assertions_from_pred(pred, ceiling(divide(assertions, numpredicates), UNPROVIDED)));
                }
            }
            {
                SubLObject cdolist_list_var = assts;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
                    $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
                }
            }
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on a collection of rule macro predicate assertions.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_rule_macro_predicates_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numpredicates = ceiling(divide(assertions, FIVE_INTEGER), UNPROVIDED);
        final SubLObject predicates = mts_random_subset(isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED), numpredicates);
        SubLObject assts = NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assts = append(assts, get_about_n_representative_assertions_from_pred(pred, ceiling(divide(assertions, numpredicates), UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        cdolist_list_var = assts;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
            $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on a collection of rule macro predicate assertions.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on a collection of rules selected from four large 'commonsense' microtheories.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on a collection of rules selected from four large \'commonsense\' microtheories.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_large_commonsense_mt_rules_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject numrules = divide(assertions, FOUR_INTEGER);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$BiologyMt, numrules, NIL, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$ModernMilitaryTacticsMt, numrules, NIL, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$HumanSocialLifeMt, numrules, NIL, T);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$ChemistryMt, numrules, NIL, T);
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on a collection of rules selected from four large \'commonsense\' microtheories.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_large_commonsense_mt_rules_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numrules = divide(assertions, FOUR_INTEGER);
        add_n_assertions_in_mt($$BiologyMt, numrules, NIL, T);
        add_n_assertions_in_mt($$ModernMilitaryTacticsMt, numrules, NIL, T);
        add_n_assertions_in_mt($$HumanSocialLifeMt, numrules, NIL, T);
        add_n_assertions_in_mt($$ChemistryMt, numrules, NIL, T);
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on a collection of rules selected from four large 'commonsense' microtheories.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on a collection of gafs selected from four large 'commonsense' microtheories.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on a collection of gafs selected from four large \'commonsense\' microtheories.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_large_commonsense_mt_gafs_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject numgafs = divide(assertions, FOUR_INTEGER);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$BiologyMt, numgafs, T, NIL);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$ModernMilitaryTacticsMt, numgafs, T, NIL);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$HumanSocialLifeMt, numgafs, T, NIL);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$ChemistryMt, numgafs, T, NIL);
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on a collection of gafs selected from four large \'commonsense\' microtheories.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_large_commonsense_mt_gafs_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numgafs = divide(assertions, FOUR_INTEGER);
        add_n_assertions_in_mt($$BiologyMt, numgafs, T, NIL);
        add_n_assertions_in_mt($$ModernMilitaryTacticsMt, numgafs, T, NIL);
        add_n_assertions_in_mt($$HumanSocialLifeMt, numgafs, T, NIL);
        add_n_assertions_in_mt($$ChemistryMt, numgafs, T, NIL);
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on a collection of gafs selected from four large 'commonsense' microtheories.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on a collection of rules in BaseKB.  This is a hard one.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on a collection of rules in BaseKB.  This is a hard one.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_base_kb_rules_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$BaseKB, assertions, UNPROVIDED, UNPROVIDED);
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on a collection of rules in BaseKB.  This is a hard one.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_base_kb_rules_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        add_n_assertions_in_mt($$BaseKB, assertions, UNPROVIDED, UNPROVIDED);
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on a collection of rules in BaseKB.  This is a hard one.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on a collection of rules about lexical topics.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on a collection of rules about lexical topics.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_lexical_rules_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$EnglishLexiconMt, assertions, NIL, T);
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on a collection of rules about lexical topics.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_lexical_rules_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        add_n_assertions_in_mt($$EnglishLexiconMt, assertions, NIL, T);
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on a collection of rules about lexical topics.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Tests the mt suggestor on a collection of gafs about lexical topics.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Tests the mt suggestor on a collection of gafs about lexical topics.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_lexical_gafs_test_alt(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject numgafs = divide(assertions, TWO_INTEGER);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$EnglishParaphraseMt, numgafs, T, NIL);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$EnglishLexiconMt, numgafs, T, NIL);
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Tests the mt suggestor on a collection of gafs about lexical topics.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_lexical_gafs_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numgafs = divide(assertions, TWO_INTEGER);
        add_n_assertions_in_mt($$EnglishParaphraseMt, numgafs, T, NIL);
        add_n_assertions_in_mt($$EnglishLexiconMt, numgafs, T, NIL);
        return mts_default_test(print);
    }/**
     * Tests the mt suggestor on a collection of gafs about lexical topics.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * Test the mt suggestor on a bunch of very high-level, infrastructural assertions.  This is another hard one.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @param GAFS?
     * 		whether to include gafs
     * @param RULES?
     * 		whether to include rules
     * @return the percentage correct, expressed as a decimal.
     */
    @LispMethod(comment = "Test the mt suggestor on a bunch of very high-level, infrastructural assertions.  This is another hard one.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@param GAFS?\r\n\t\twhether to include gafs\r\n@param RULES?\r\n\t\twhether to include rules\r\n@return the percentage correct, expressed as a decimal.")
    public static final SubLObject run_high_level_assertions_test_alt(SubLObject print, SubLObject assertions, SubLObject gafsP, SubLObject rulesP) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        if (gafsP == UNPROVIDED) {
            gafsP = T;
        }
        if (rulesP == UNPROVIDED) {
            rulesP = T;
        }
        com.cyc.cycjava.cycl.mt_suggestor.mts_clear_tests();
        {
            SubLObject numassertions = divide(assertions, FOUR_INTEGER);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$LogicalTruthMt, numassertions, gafsP, rulesP);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$LogicalTruthImplementationMt, numassertions, gafsP, rulesP);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$CoreCycLMt, numassertions, gafsP, rulesP);
            com.cyc.cycjava.cycl.mt_suggestor.add_n_assertions_in_mt($$CoreCycLMt, numassertions, gafsP, rulesP);
        }
        return com.cyc.cycjava.cycl.mt_suggestor.mts_default_test(print);
    }

    @LispMethod(comment = "Test the mt suggestor on a bunch of very high-level, infrastructural assertions.  This is another hard one.\r\n\r\n@param PRINT\r\n\t\twhether to print intermediate results\r\n@param ASSERTIONS\r\n\t\tthe approximate number of assertions to test.\r\n@param GAFS?\r\n\t\twhether to include gafs\r\n@param RULES?\r\n\t\twhether to include rules\r\n@return the percentage correct, expressed as a decimal.")
    public static SubLObject run_high_level_assertions_test(SubLObject print, SubLObject assertions, SubLObject gafsP, SubLObject rulesP) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        if (gafsP == UNPROVIDED) {
            gafsP = T;
        }
        if (rulesP == UNPROVIDED) {
            rulesP = T;
        }
        mts_clear_tests();
        final SubLObject numassertions = divide(assertions, FOUR_INTEGER);
        add_n_assertions_in_mt($$LogicalTruthMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt($$LogicalTruthImplementationMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt($$CoreCycLMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt($$CoreCycLMt, numassertions, gafsP, rulesP);
        return mts_default_test(print);
    }/**
     * Test the mt suggestor on a bunch of very high-level, infrastructural assertions.  This is another hard one.
     *
     * @param PRINT
     * 		whether to print intermediate results
     * @param ASSERTIONS
     * 		the approximate number of assertions to test.
     * @param GAFS?
     * 		whether to include gafs
     * @param RULES?
     * 		whether to include rules
     * @return the percentage correct, expressed as a decimal.
     */


    /**
     * A helper function for testing the mt-suggestor.
     *
     * @param ASSERTIONLIST
     * 		a list of formulas to try to suggest mts for.
     * @param MTLIST
     * 		a list of the correct mts for the formulas in ASSERTIONLIST
     * @param PRINT
     * 		whether to print intermediate result or conduct the test silently.
     */
    @LispMethod(comment = "A helper function for testing the mt-suggestor.\r\n\r\n@param ASSERTIONLIST\r\n\t\ta list of formulas to try to suggest mts for.\r\n@param MTLIST\r\n\t\ta list of the correct mts for the formulas in ASSERTIONLIST\r\n@param PRINT\r\n\t\twhether to print intermediate result or conduct the test silently.")
    public static final SubLObject test_mt_suggestor_alt(SubLObject assertionlist, SubLObject mtlist, SubLObject print) {
        if (print == UNPROVIDED) {
            print = T;
        }
        {
            SubLObject i = ZERO_INTEGER;
            SubLObject right = ZERO_INTEGER;
            SubLObject suggestion = NIL;
            SubLObject cdolist_list_var = assertionlist;
            SubLObject asst = NIL;
            for (asst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asst = cdolist_list_var.first()) {
                if (NIL != print) {
                    princ($str_alt87$Trying_Formula__, UNPROVIDED);
                    princ(i, UNPROVIDED);
                    terpri(UNPROVIDED);
                }
                suggestion = com.cyc.cycjava.cycl.mt_suggestor.suggest_mt(asst);
                if (NIL != print) {
                    princ($str_alt60$Suggested_Mt__, UNPROVIDED);
                    princ(suggestion, UNPROVIDED);
                    terpri(UNPROVIDED);
                    princ($str_alt61$Actual_Mt__, UNPROVIDED);
                    princ(nth(i, mtlist), UNPROVIDED);
                    terpri(UNPROVIDED);
                    terpri(UNPROVIDED);
                }
                if (suggestion.equal(nth(i, mtlist))) {
                    right = add(right, ONE_INTEGER);
                } else {
                    $mts_incorrect_formulas$.setGlobalValue(cons(asst, $mts_incorrect_formulas$.getGlobalValue()));
                    $mts_guessed_mts$.setGlobalValue(cons(suggestion, $mts_guessed_mts$.getGlobalValue()));
                    $mts_actual_mts$.setGlobalValue(cons(nth(i, mtlist), $mts_actual_mts$.getGlobalValue()));
                }
                i = add(i, ONE_INTEGER);
            }
            if (NIL != print) {
                princ($str_alt88$Got_, UNPROVIDED);
                princ(right, UNPROVIDED);
                princ($str_alt89$_out_of_, UNPROVIDED);
                princ(i, UNPROVIDED);
                terpri(UNPROVIDED);
            }
            return divide(right, i);
        }
    }

    @LispMethod(comment = "A helper function for testing the mt-suggestor.\r\n\r\n@param ASSERTIONLIST\r\n\t\ta list of formulas to try to suggest mts for.\r\n@param MTLIST\r\n\t\ta list of the correct mts for the formulas in ASSERTIONLIST\r\n@param PRINT\r\n\t\twhether to print intermediate result or conduct the test silently.")
    public static SubLObject test_mt_suggestor(final SubLObject assertionlist, final SubLObject mtlist, SubLObject print) {
        if (print == UNPROVIDED) {
            print = T;
        }
        SubLObject i = ZERO_INTEGER;
        SubLObject right = ZERO_INTEGER;
        SubLObject suggestion = NIL;
        SubLObject cdolist_list_var = assertionlist;
        SubLObject asst = NIL;
        asst = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != print) {
                princ($str86$Trying_Formula__, UNPROVIDED);
                princ(i, UNPROVIDED);
                terpri(UNPROVIDED);
            }
            suggestion = suggest_mt(asst);
            if (NIL != print) {
                princ($str59$Suggested_Mt__, UNPROVIDED);
                princ(suggestion, UNPROVIDED);
                terpri(UNPROVIDED);
                princ($str60$Actual_Mt__, UNPROVIDED);
                princ(nth(i, mtlist), UNPROVIDED);
                terpri(UNPROVIDED);
                terpri(UNPROVIDED);
            }
            if (suggestion.equal(nth(i, mtlist))) {
                right = add(right, ONE_INTEGER);
            } else {
                $mts_incorrect_formulas$.setGlobalValue(cons(asst, $mts_incorrect_formulas$.getGlobalValue()));
                $mts_guessed_mts$.setGlobalValue(cons(suggestion, $mts_guessed_mts$.getGlobalValue()));
                $mts_actual_mts$.setGlobalValue(cons(nth(i, mtlist), $mts_actual_mts$.getGlobalValue()));
            }
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asst = cdolist_list_var.first();
        } 
        if (NIL != print) {
            princ($$$Got_, UNPROVIDED);
            princ(right, UNPROVIDED);
            princ($$$_out_of_, UNPROVIDED);
            princ(i, UNPROVIDED);
            terpri(UNPROVIDED);
        }
        return divide(right, i);
    }/**
     * A helper function for testing the mt-suggestor.
     *
     * @param ASSERTIONLIST
     * 		a list of formulas to try to suggest mts for.
     * @param MTLIST
     * 		a list of the correct mts for the formulas in ASSERTIONLIST
     * @param PRINT
     * 		whether to print intermediate result or conduct the test silently.
     */


    /**
     *
     *
     * @param mt
    microtheory-p
     * 		
     * @param n
     * 		the maximum number of assertions to include
     * @param include-gafs
     * 		whether to include gafs
     * @param include-rules
     * 		whether to include rules
     * @unknown the first N assertions in MT that satisfy the gafs/rules constraints.
     */
    @LispMethod(comment = "@param mt\nmicrotheory-p\r\n\t\t\r\n@param n\r\n\t\tthe maximum number of assertions to include\r\n@param include-gafs\r\n\t\twhether to include gafs\r\n@param include-rules\r\n\t\twhether to include rules\r\n@unknown the first N assertions in MT that satisfy the gafs/rules constraints.")
    public static final SubLObject add_n_assertions_in_mt_alt(SubLObject mt, SubLObject n, SubLObject include_gafs, SubLObject include_rules) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        if (include_gafs == UNPROVIDED) {
            include_gafs = NIL;
        }
        if (include_rules == UNPROVIDED) {
            include_rules = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stopP = NIL;
                SubLObject numsofar = ZERO_INTEGER;
                SubLObject formula = NIL;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                {
                                    SubLObject done_var = stopP;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != assertion);
                                            if (NIL != valid) {
                                                formula = assertions_high.assertion_formula(assertion);
                                                if (((NIL != include_rules) && (NIL != el_implication_p(formula))) || (((NIL != include_gafs) && (NIL == el_implication_p(formula))) && (length(formula).numL(TWO_INTEGER) || (NIL == fort_types_interface.skolem_functionP(second(formula), UNPROVIDED))))) {
                                                    $examination_formulas$.setGlobalValue(cons(formula, $examination_formulas$.getGlobalValue()));
                                                    $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
                                                    numsofar = add(numsofar, ONE_INTEGER);
                                                }
                                                if (numsofar.numGE(n)) {
                                                    stopP = T;
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != stopP));
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    {
                                        SubLObject idx = assertion_handles.do_assertions_table();
                                        SubLObject total = id_index_count(idx);
                                        SubLObject sofar = ZERO_INTEGER;
                                        SubLTrampolineFile.checkType($str_alt93$do_broad_mt_index, STRINGP);
                                        {
                                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble($str_alt93$do_broad_mt_index);
                                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                                    {
                                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                        SubLObject assertion = NIL;
                                                        while (NIL != id) {
                                                            assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                            if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                                note_percent_progress(sofar, total);
                                                                sofar = add(sofar, ONE_INTEGER);
                                                                if (NIL != stopP) {
                                                                    mapping_finished();
                                                                }
                                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion, mt, NIL, NIL)) {
                                                                    formula = assertions_high.assertion_formula(assertion);
                                                                    if (((NIL != include_rules) && (NIL != el_implication_p(formula))) || (((NIL != include_gafs) && (NIL == el_implication_p(formula))) && (length(formula).numL(TWO_INTEGER) || (NIL == fort_types_interface.skolem_functionP(second(formula), UNPROVIDED))))) {
                                                                        $examination_formulas$.setGlobalValue(cons(formula, $examination_formulas$.getGlobalValue()));
                                                                        $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
                                                                        numsofar = add(numsofar, ONE_INTEGER);
                                                                    }
                                                                    if (numsofar.numGE(n)) {
                                                                        stopP = T;
                                                                    }
                                                                }
                                                            }
                                                            id = do_id_index_next_id(idx, T, id, state_var);
                                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                                        } 
                                                    }
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param mt
    microtheory-p
     * 		
     * @param n
     * 		the maximum number of assertions to include
     * @param include-gafs
     * 		whether to include gafs
     * @param include-rules
     * 		whether to include rules
     * @unknown the first N assertions in MT that satisfy the gafs/rules constraints.
     */
    @LispMethod(comment = "@param mt\nmicrotheory-p\r\n\t\t\r\n@param n\r\n\t\tthe maximum number of assertions to include\r\n@param include-gafs\r\n\t\twhether to include gafs\r\n@param include-rules\r\n\t\twhether to include rules\r\n@unknown the first N assertions in MT that satisfy the gafs/rules constraints.")
    public static SubLObject add_n_assertions_in_mt(final SubLObject mt, SubLObject n, SubLObject include_gafs, SubLObject include_rules) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        if (include_gafs == UNPROVIDED) {
            include_gafs = NIL;
        }
        if (include_rules == UNPROVIDED) {
            include_rules = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stopP = NIL;
        SubLObject numsofar = ZERO_INTEGER;
        SubLObject formula = NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = stopP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                        if (NIL != valid) {
                            formula = assertions_high.assertion_formula(assertion);
                            if (((NIL != include_rules) && (NIL != el_implication_p(formula))) || (((NIL != include_gafs) && (NIL == el_implication_p(formula))) && (length(formula).numL(TWO_INTEGER) || (NIL == fort_types_interface.skolem_functionP(second(formula), UNPROVIDED))))) {
                                $examination_formulas$.setGlobalValue(cons(formula, $examination_formulas$.getGlobalValue()));
                                $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
                                numsofar = add(numsofar, ONE_INTEGER);
                            }
                            if (numsofar.numGE(n)) {
                                stopP = T;
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != stopP));
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } else
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($MAPPING_DONE);
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $str92$do_broad_mt_index;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                    final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$24 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$24, $SKIP)) {
                                final SubLObject idx_$25 = idx_$24;
                                if (NIL == id_index_dense_objects_empty_p(idx_$25, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$25);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject assertion2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != stopP) {
                                                mapping_finished();
                                            }
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, NIL, NIL)) {
                                                formula = assertions_high.assertion_formula(assertion2);
                                                if (((NIL != include_rules) && (NIL != el_implication_p(formula))) || (((NIL != include_gafs) && (NIL == el_implication_p(formula))) && (length(formula).numL(TWO_INTEGER) || (NIL == fort_types_interface.skolem_functionP(second(formula), UNPROVIDED))))) {
                                                    $examination_formulas$.setGlobalValue(cons(formula, $examination_formulas$.getGlobalValue()));
                                                    $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion2), $examination_mts$.getGlobalValue()));
                                                    numsofar = add(numsofar, ONE_INTEGER);
                                                }
                                                if (numsofar.numGE(n)) {
                                                    stopP = T;
                                                }
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$26 = idx_$24;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$26)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$26);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$26);
                                    final SubLObject end_id = id_index_next_id(idx_$26);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != stopP) {
                                                mapping_finished();
                                            }
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, NIL, NIL)) {
                                                formula = assertions_high.assertion_formula(assertion3);
                                                if (((NIL != include_rules) && (NIL != el_implication_p(formula))) || (((NIL != include_gafs) && (NIL == el_implication_p(formula))) && (length(formula).numL(TWO_INTEGER) || (NIL == fort_types_interface.skolem_functionP(second(formula), UNPROVIDED))))) {
                                                    $examination_formulas$.setGlobalValue(cons(formula, $examination_formulas$.getGlobalValue()));
                                                    $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion3), $examination_mts$.getGlobalValue()));
                                                    numsofar = add(numsofar, ONE_INTEGER);
                                                }
                                                if (numsofar.numGE(n)) {
                                                    stopP = T;
                                                }
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                } finally {
                    thread.throwStack.pop();
                }
            }

        return NIL;
    }

    /**
     *
     *
     * @param PRED
    predicate-p
     * 		
     * @param N
     * 		positive-integer-p
     * 		Attempts to return approximately N assertions in the predicate extent of PRED representative of the entire predicate extent,
     * 		by looking over most of the predicate extent and randomly choosing only a few assertions.  Will always return a list of length
     * 		less than or equal to N.
     */
    @LispMethod(comment = "@param PRED\npredicate-p\r\n\t\t\r\n@param N\r\n\t\tpositive-integer-p\r\n\t\tAttempts to return approximately N assertions in the predicate extent of PRED representative of the entire predicate extent,\r\n\t\tby looking over most of the predicate extent and randomly choosing only a few assertions.  Will always return a list of length\r\n\t\tless than or equal to N.")
    public static final SubLObject get_about_n_representative_assertions_from_pred_alt(SubLObject pred, SubLObject n) {
        {
            SubLObject extent = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
            SubLObject prob = (extent.numE(ZERO_INTEGER)) ? ((SubLObject) (ONE_INTEGER)) : min(ONE_INTEGER, divide(n, extent));
            return com.cyc.cycjava.cycl.mt_suggestor.get_n_assertions_from_pred_with_prob(pred, n, prob);
        }
    }

    /**
     *
     *
     * @param PRED
    predicate-p
     * 		
     * @param N
     * 		positive-integer-p
     * 		Attempts to return approximately N assertions in the predicate extent of PRED representative of the entire predicate extent,
     * 		by looking over most of the predicate extent and randomly choosing only a few assertions.  Will always return a list of length
     * 		less than or equal to N.
     */
    @LispMethod(comment = "@param PRED\npredicate-p\r\n\t\t\r\n@param N\r\n\t\tpositive-integer-p\r\n\t\tAttempts to return approximately N assertions in the predicate extent of PRED representative of the entire predicate extent,\r\n\t\tby looking over most of the predicate extent and randomly choosing only a few assertions.  Will always return a list of length\r\n\t\tless than or equal to N.")
    public static SubLObject get_about_n_representative_assertions_from_pred(final SubLObject pred, final SubLObject n) {
        final SubLObject extent = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
        final SubLObject prob = (extent.numE(ZERO_INTEGER)) ? ONE_INTEGER : min(ONE_INTEGER, divide(n, extent));
        return get_n_assertions_from_pred_with_prob(pred, n, prob);
    }

    /**
     *
     *
     * @param MT
    microtheory-p
     * 		
     * @param N
     * 		positive-integer-p
     * 		Attempts to return approximately N assertions in MT representative of the entire contents of MT
     * 		by looking over most of the predicate extent and randomly choosing only a few assertions.  Will always return a list of length
     * 		less than or equal to N.
     */
    @LispMethod(comment = "@param MT\nmicrotheory-p\r\n\t\t\r\n@param N\r\n\t\tpositive-integer-p\r\n\t\tAttempts to return approximately N assertions in MT representative of the entire contents of MT\r\n\t\tby looking over most of the predicate extent and randomly choosing only a few assertions.  Will always return a list of length\r\n\t\tless than or equal to N.")
    public static final SubLObject get_about_n_representative_assertions_from_mt_alt(SubLObject mt, SubLObject n) {
        {
            SubLObject extent = (NIL != kb_indexing.broad_mtP(mt)) ? ((SubLObject) ($int$100000)) : kb_indexing.num_mt_index(mt);
            SubLObject prob = (extent.numE(ZERO_INTEGER)) ? ((SubLObject) (ONE_INTEGER)) : min(ONE_INTEGER, divide(n, extent));
            return com.cyc.cycjava.cycl.mt_suggestor.get_n_assertions_from_mt_with_prob(mt, n, prob);
        }
    }

    /**
     *
     *
     * @param MT
    microtheory-p
     * 		
     * @param N
     * 		positive-integer-p
     * 		Attempts to return approximately N assertions in MT representative of the entire contents of MT
     * 		by looking over most of the predicate extent and randomly choosing only a few assertions.  Will always return a list of length
     * 		less than or equal to N.
     */
    @LispMethod(comment = "@param MT\nmicrotheory-p\r\n\t\t\r\n@param N\r\n\t\tpositive-integer-p\r\n\t\tAttempts to return approximately N assertions in MT representative of the entire contents of MT\r\n\t\tby looking over most of the predicate extent and randomly choosing only a few assertions.  Will always return a list of length\r\n\t\tless than or equal to N.")
    public static SubLObject get_about_n_representative_assertions_from_mt(final SubLObject mt, final SubLObject n) {
        final SubLObject extent = (NIL != kb_indexing.broad_mtP(mt)) ? $int$100000 : kb_indexing.num_mt_index(mt);
        final SubLObject prob = (extent.numE(ZERO_INTEGER)) ? ONE_INTEGER : min(ONE_INTEGER, divide(n, extent));
        return get_n_assertions_from_mt_with_prob(mt, n, prob);
    }

    /**
     * A helper function for get-about-n-representative-assertions-from-pred
     *
     * @param PRED
    predicate-p
     * 		
     * @param N
     * 		the maximum number of assertions to include
     * @param PROB
     * 		the probability of including any given assertion
     * @return at most N assertions in the predicate extent of PRED
     */
    @LispMethod(comment = "A helper function for get-about-n-representative-assertions-from-pred\r\n\r\n@param PRED\npredicate-p\r\n\t\t\r\n@param N\r\n\t\tthe maximum number of assertions to include\r\n@param PROB\r\n\t\tthe probability of including any given assertion\r\n@return at most N assertions in the predicate extent of PRED")
    public static final SubLObject get_n_assertions_from_pred_with_prob_alt(SubLObject pred, SubLObject n, SubLObject prob) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                SubLObject assertion_count = ZERO_INTEGER;
                SubLObject assertions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = doneP;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_22 = doneP;
                                                            SubLObject token_var_23 = NIL;
                                                            while (NIL == done_var_22) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_23);
                                                                    SubLObject valid_24 = makeBoolean(token_var_23 != assertion);
                                                                    if (NIL != valid_24) {
                                                                        if (NIL != number_utilities.true_with_probability(prob)) {
                                                                            assertions = cons(assertion, assertions);
                                                                            assertion_count = add(assertion_count, ONE_INTEGER);
                                                                            doneP = numGE(assertion_count, n);
                                                                        }
                                                                    }
                                                                    done_var_22 = makeBoolean((NIL == valid_24) || (NIL != doneP));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertions;
            }
        }
    }

    @LispMethod(comment = "A helper function for get-about-n-representative-assertions-from-pred\r\n\r\n@param PRED\n\t\tpredicate-p\r\n\t\t\r\n@param N\r\n\t\tthe maximum number of assertions to include\r\n@param PROB\r\n\t\tthe probability of including any given assertion\r\n@return at most N assertions in the predicate extent of PRED")
    public static SubLObject get_n_assertions_from_pred_with_prob(final SubLObject pred, final SubLObject n, final SubLObject prob) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject assertion_count = ZERO_INTEGER;
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$28 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = doneP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$30 = doneP;
                                final SubLObject token_var_$31 = NIL;
                                while (NIL == done_var_$30) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                    final SubLObject valid_$32 = makeBoolean(!token_var_$31.eql(assertion));
                                    if ((NIL != valid_$32) && (NIL != number_utilities.true_with_probability(prob))) {
                                        assertions = cons(assertion, assertions);
                                        assertion_count = add(assertion_count, ONE_INTEGER);
                                        doneP = numGE(assertion_count, n);
                                    }
                                    done_var_$30 = makeBoolean((NIL == valid_$32) || (NIL != doneP));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$29, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }/**
     * A helper function for get-about-n-representative-assertions-from-pred
     *
     * @param PRED
    		predicate-p
     * 		
     * @param N
     * 		the maximum number of assertions to include
     * @param PROB
     * 		the probability of including any given assertion
     * @return at most N assertions in the predicate extent of PRED
     */


    /**
     * A helper function for get-about-n-representative-assertions-from-mt
     *
     * @param MT
    microtheory-p
     * 		
     * @param N
     * 		the maximum number of assertions to include
     * @param PROB
     * 		the probability of including any given assertion
     * @return at most N assertions in MT
     */
    @LispMethod(comment = "A helper function for get-about-n-representative-assertions-from-mt\r\n\r\n@param MT\nmicrotheory-p\r\n\t\t\r\n@param N\r\n\t\tthe maximum number of assertions to include\r\n@param PROB\r\n\t\tthe probability of including any given assertion\r\n@return at most N assertions in MT")
    public static final SubLObject get_n_assertions_from_mt_with_prob_alt(SubLObject mt, SubLObject n, SubLObject prob) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                SubLObject assertion_count = ZERO_INTEGER;
                SubLObject assertions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                            if (pcase_var.eql($MT)) {
                                if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                                    {
                                        SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                            {
                                                SubLObject done_var = doneP;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                                        SubLObject valid = makeBoolean(token_var != assertion);
                                                        if (NIL != valid) {
                                                            if (NIL != number_utilities.true_with_probability(prob)) {
                                                                assertions = cons(assertion, assertions);
                                                                assertion_count = add(assertion_count, ONE_INTEGER);
                                                                doneP = numGE(assertion_count, n);
                                                            }
                                                        }
                                                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($BROAD_MT)) {
                                    if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                                        {
                                            SubLObject catch_var = NIL;
                                            try {
                                                {
                                                    SubLObject idx = assertion_handles.do_assertions_table();
                                                    SubLObject total = id_index_count(idx);
                                                    SubLObject sofar = ZERO_INTEGER;
                                                    SubLTrampolineFile.checkType($str_alt93$do_broad_mt_index, STRINGP);
                                                    {
                                                        SubLObject _prev_bind_0_27 = $last_percent_progress_index$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_28 = $last_percent_progress_prediction$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                        try {
                                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                                            $within_noting_percent_progress$.bind(T, thread);
                                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                            noting_percent_progress_preamble($str_alt93$do_broad_mt_index);
                                                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                                                {
                                                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                                    SubLObject assertion = NIL;
                                                                    while (NIL != id) {
                                                                        assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                                        if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                                            note_percent_progress(sofar, total);
                                                                            sofar = add(sofar, ONE_INTEGER);
                                                                            if (NIL != doneP) {
                                                                                mapping_finished();
                                                                            }
                                                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion, mt, NIL, NIL)) {
                                                                                if (NIL != number_utilities.true_with_probability(prob)) {
                                                                                    assertions = cons(assertion, assertions);
                                                                                    assertion_count = add(assertion_count, ONE_INTEGER);
                                                                                    doneP = numGE(assertion_count, n);
                                                                                }
                                                                            }
                                                                        }
                                                                        id = do_id_index_next_id(idx, T, id, state_var);
                                                                        state_var = do_id_index_next_state(idx, T, id, state_var);
                                                                    } 
                                                                }
                                                            }
                                                            noting_percent_progress_postamble();
                                                        } finally {
                                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_28, thread);
                                                            $last_percent_progress_index$.rebind(_prev_bind_0_27, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertions;
            }
        }
    }

    /**
     * A helper function for get-about-n-representative-assertions-from-mt
     *
     * @param MT
    		microtheory-p
     * 		
     * @param N
     * 		the maximum number of assertions to include
     * @param PROB
     * 		the probability of including any given assertion
     * @return at most N assertions in MT
     */
    @LispMethod(comment = "A helper function for get-about-n-representative-assertions-from-mt\r\n\r\n@param MT\n\t\tmicrotheory-p\r\n\t\t\r\n@param N\r\n\t\tthe maximum number of assertions to include\r\n@param PROB\r\n\t\tthe probability of including any given assertion\r\n@return at most N assertions in MT")
    public static SubLObject get_n_assertions_from_mt_with_prob(final SubLObject mt, final SubLObject n, final SubLObject prob) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject assertion_count = ZERO_INTEGER;
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql($MT)) {
                if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                            if ((NIL != valid) && (NIL != number_utilities.true_with_probability(prob))) {
                                assertions = cons(assertion, assertions);
                                assertion_count = add(assertion_count, ONE_INTEGER);
                                doneP = numGE(assertion_count, n);
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                }
            } else
                if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                    SubLObject catch_var = NIL;
                    try {
                        thread.throwStack.push($MAPPING_DONE);
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $str92$do_broad_mt_index;
                        final SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                        final SubLObject _prev_bind_0_$35 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject idx_$37 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$37, $SKIP)) {
                                    final SubLObject idx_$38 = idx_$37;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$38, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$38);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject assertion2;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if (NIL != doneP) {
                                                    mapping_finished();
                                                }
                                                if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, NIL, NIL)) && (NIL != number_utilities.true_with_probability(prob))) {
                                                    assertions = cons(assertion2, assertions);
                                                    assertion_count = add(assertion_count, ONE_INTEGER);
                                                    doneP = numGE(assertion_count, n);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$39 = idx_$37;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$39)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$39);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$39);
                                        final SubLObject end_id = id_index_next_id(idx_$39);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if (NIL != doneP) {
                                                    mapping_finished();
                                                }
                                                if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, NIL, NIL)) && (NIL != number_utilities.true_with_probability(prob))) {
                                                    assertions = cons(assertion3, assertions);
                                                    assertion_count = add(assertion_count, ONE_INTEGER);
                                                    doneP = numGE(assertion_count, n);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$36, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$35, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                    } finally {
                        thread.throwStack.pop();
                    }
                }

        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static final SubLObject get_summed_frequencies_from_frequency_list_alt(SubLObject freq_list) {
        return apply($sym49$_, Mapping.mapcar(CDR, freq_list));
    }

    public static SubLObject get_summed_frequencies_from_frequency_list(final SubLObject freq_list) {
        return apply($sym48$_, Mapping.mapcar(CDR, freq_list));
    }

    /**
     * Returns a random subset of LST of size less than or equal to SIZE.  If
     * SIZE is greater than (length LST) returns a random order of LST.
     * NOTE: An inefficient O(N^2) implementation for testing purposes only.
     */
    @LispMethod(comment = "Returns a random subset of LST of size less than or equal to SIZE.  If\r\nSIZE is greater than (length LST) returns a random order of LST.\r\nNOTE: An inefficient O(N^2) implementation for testing purposes only.\nReturns a random subset of LST of size less than or equal to SIZE.  If\nSIZE is greater than (length LST) returns a random order of LST.\nNOTE: An inefficient O(N^2) implementation for testing purposes only.")
    public static final SubLObject mts_random_subset_alt(SubLObject lst, SubLObject size) {
        {
            SubLObject integers = number_utilities.n_random_integers(size, length(lst), UNPROVIDED);
            SubLObject subset = NIL;
            SubLObject cdolist_list_var = integers;
            SubLObject integer = NIL;
            for (integer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , integer = cdolist_list_var.first()) {
                subset = cons(nth(integer, lst), subset);
            }
            return subset;
        }
    }

    @LispMethod(comment = "Returns a random subset of LST of size less than or equal to SIZE.  If\r\nSIZE is greater than (length LST) returns a random order of LST.\r\nNOTE: An inefficient O(N^2) implementation for testing purposes only.\nReturns a random subset of LST of size less than or equal to SIZE.  If\nSIZE is greater than (length LST) returns a random order of LST.\nNOTE: An inefficient O(N^2) implementation for testing purposes only.")
    public static SubLObject mts_random_subset(final SubLObject lst, final SubLObject size) {
        final SubLObject integers = number_utilities.n_random_integers(size, length(lst), UNPROVIDED);
        SubLObject subset = NIL;
        SubLObject cdolist_list_var = integers;
        SubLObject integer = NIL;
        integer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subset = cons(nth(integer, lst), subset);
            cdolist_list_var = cdolist_list_var.rest();
            integer = cdolist_list_var.first();
        } 
        return subset;
    }/**
     * Returns a random subset of LST of size less than or equal to SIZE.  If
     * SIZE is greater than (length LST) returns a random order of LST.
     * NOTE: An inefficient O(N^2) implementation for testing purposes only.
     */


    public static SubLObject declare_mt_suggestor_file() {
        declareFunction("suggest_mt", "SUGGEST-MT", 1, 0, false);
        declareFunction("suggest_mt_by_content", "SUGGEST-MT-BY-CONTENT", 1, 0, false);
        declareFunction("suggest_mt_for_gaf", "SUGGEST-MT-FOR-GAF", 1, 0, false);
        declareFunction("mts_not_commonsense_mtP", "MTS-NOT-COMMONSENSE-MT?", 1, 0, false);
        declareFunction("likely_project_related_assertionP", "LIKELY-PROJECT-RELATED-ASSERTION?", 1, 0, false);
        declareFunction("mtsugg_get_related_assertions", "MTSUGG-GET-RELATED-ASSERTIONS", 1, 0, false);
        declareFunction("mt_list_from_related", "MT-LIST-FROM-RELATED", 1, 0, false);
        declareFunction("mts_specificity_estimate", "MTS-SPECIFICITY-ESTIMATE", 1, 0, false);
        declareFunction("frequency_list_of_mts_adjusted", "FREQUENCY-LIST-OF-MTS-ADJUSTED", 1, 2, false);
        declareFunction("clear_frequency_list_of_mts", "CLEAR-FREQUENCY-LIST-OF-MTS", 0, 0, false);
        declareFunction("remove_frequency_list_of_mts", "REMOVE-FREQUENCY-LIST-OF-MTS", 1, 2, false);
        declareFunction("frequency_list_of_mts_internal", "FREQUENCY-LIST-OF-MTS-INTERNAL", 3, 0, false);
        declareFunction("frequency_list_of_mts", "FREQUENCY-LIST-OF-MTS", 1, 2, false);
        declareFunction("mts_get_formula_frequency_data", "MTS-GET-FORMULA-FREQUENCY-DATA", 1, 0, false);
        declareFunction("mts_get_summed_data", "MTS-GET-SUMMED-DATA", 1, 0, false);
        declareFunction("get_combined_list_for_mts_summed_data", "GET-COMBINED-LIST-FOR-MTS-SUMMED-DATA", 2, 0, false);
        declareFunction("mts_too_generalP", "MTS-TOO-GENERAL?", 1, 1, false);
        declareFunction("mts_too_general_light_filteringP", "MTS-TOO-GENERAL-LIGHT-FILTERING?", 1, 0, false);
        declareFunction("get_mt_list_for_predicate", "GET-MT-LIST-FOR-PREDICATE", 1, 1, false);
        declareFunction("clear_top_mt_percent_count", "CLEAR-TOP-MT-PERCENT-COUNT", 0, 0, false);
        declareFunction("remove_top_mt_percent_count", "REMOVE-TOP-MT-PERCENT-COUNT", 1, 1, false);
        declareFunction("top_mt_percent_count_internal", "TOP-MT-PERCENT-COUNT-INTERNAL", 2, 0, false);
        declareFunction("top_mt_percent_count", "TOP-MT-PERCENT-COUNT", 1, 1, false);
        declareFunction("used_as_function_or_predicateP", "USED-AS-FUNCTION-OR-PREDICATE?", 2, 0, false);
        declareFunction("mts_run_all_tests", "MTS-RUN-ALL-TESTS", 0, 1, false);
        declareFunction("mts_clear_tests", "MTS-CLEAR-TESTS", 0, 0, false);
        declareFunction("mts_clear_test_results", "MTS-CLEAR-TEST-RESULTS", 0, 0, false);
        declareFunction("mts_print_test_results", "MTS-PRINT-TEST-RESULTS", 0, 1, false);
        declareFunction("mts_default_test", "MTS-DEFAULT-TEST", 0, 1, false);
        declareFunction("run_new_project_assertions_test", "RUN-NEW-PROJECT-ASSERTIONS-TEST", 0, 2, false);
        declareFunction("run_old_project_assertions_test", "RUN-OLD-PROJECT-ASSERTIONS-TEST", 0, 2, false);
        declareFunction("run_definitional_assertions_test", "RUN-DEFINITIONAL-ASSERTIONS-TEST", 0, 2, false);
        declareFunction("run_meta_predicates_test", "RUN-META-PREDICATES-TEST", 0, 2, false);
        declareFunction("run_rule_macro_predicates_test", "RUN-RULE-MACRO-PREDICATES-TEST", 0, 2, false);
        declareFunction("run_large_commonsense_mt_rules_test", "RUN-LARGE-COMMONSENSE-MT-RULES-TEST", 0, 2, false);
        declareFunction("run_large_commonsense_mt_gafs_test", "RUN-LARGE-COMMONSENSE-MT-GAFS-TEST", 0, 2, false);
        declareFunction("run_base_kb_rules_test", "RUN-BASE-KB-RULES-TEST", 0, 2, false);
        declareFunction("run_lexical_rules_test", "RUN-LEXICAL-RULES-TEST", 0, 2, false);
        declareFunction("run_lexical_gafs_test", "RUN-LEXICAL-GAFS-TEST", 0, 2, false);
        declareFunction("run_high_level_assertions_test", "RUN-HIGH-LEVEL-ASSERTIONS-TEST", 0, 4, false);
        declareFunction("test_mt_suggestor", "TEST-MT-SUGGESTOR", 2, 1, false);
        declareFunction("add_n_assertions_in_mt", "ADD-N-ASSERTIONS-IN-MT", 1, 3, false);
        declareFunction("get_about_n_representative_assertions_from_pred", "GET-ABOUT-N-REPRESENTATIVE-ASSERTIONS-FROM-PRED", 2, 0, false);
        declareFunction("get_about_n_representative_assertions_from_mt", "GET-ABOUT-N-REPRESENTATIVE-ASSERTIONS-FROM-MT", 2, 0, false);
        declareFunction("get_n_assertions_from_pred_with_prob", "GET-N-ASSERTIONS-FROM-PRED-WITH-PROB", 3, 0, false);
        declareFunction("get_n_assertions_from_mt_with_prob", "GET-N-ASSERTIONS-FROM-MT-WITH-PROB", 3, 0, false);
        declareFunction("get_summed_frequencies_from_frequency_list", "GET-SUMMED-FREQUENCIES-FROM-FREQUENCY-LIST", 1, 0, false);
        declareFunction("mts_random_subset", "MTS-RANDOM-SUBSET", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_mt_suggestor_file_alt() {
        defparameter("*MTS-FORBID-LEXICAL-MTS*", NIL);
        defparameter("*MTS-FORBID-PROJECT-MTS*", NIL);
        defparameter("*MTS-FORBID-HIGH-LEVEL-MTS-FOR-CONTENT-ASSERTIONS*", T);
        defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-PERCENT*", $float$0_8);
        defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-NUMBER*", THREE_INTEGER);
        deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-PROPERTIES*", $list_alt13);
        deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-MT*", $list_alt14);
        deflexical("*FREQUENCY-LIST-OF-MTS-CACHING-STATE*", NIL);
        deflexical("*MTSUGG-TOO-GENERAL-TERM-FILTER*", $list_alt39);
        deflexical("*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*", $list_alt40);
        deflexical("*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*", $list_alt41);
        deflexical("*TOP-MT-PERCENT-COUNT-CACHING-STATE*", NIL);
        deflexical("*EXAMINATION-FORMULAS*", NIL);
        deflexical("*EXAMINATION-MTS*", NIL);
        deflexical("*MTS-INCORRECT-FORMULAS*", NIL);
        deflexical("*MTS-ACTUAL-MTS*", NIL);
        deflexical("*MTS-GUESSED-MTS*", NIL);
        return NIL;
    }

    public static SubLObject init_mt_suggestor_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*MTS-FORBID-LEXICAL-MTS*", NIL);
            defparameter("*MTS-FORBID-PROJECT-MTS*", NIL);
            defparameter("*MTS-FORBID-HIGH-LEVEL-MTS-FOR-CONTENT-ASSERTIONS*", T);
            defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-PERCENT*", $float$0_8);
            defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-NUMBER*", THREE_INTEGER);
            deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-PROPERTIES*", $list13);
            deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-MT*", $list14);
            deflexical("*FREQUENCY-LIST-OF-MTS-CACHING-STATE*", NIL);
            deflexical("*MTSUGG-TOO-GENERAL-TERM-FILTER*", $list38);
            deflexical("*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*", $list39);
            deflexical("*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*", $list40);
            deflexical("*TOP-MT-PERCENT-COUNT-CACHING-STATE*", NIL);
            deflexical("*EXAMINATION-FORMULAS*", NIL);
            deflexical("*EXAMINATION-MTS*", NIL);
            deflexical("*MTS-INCORRECT-FORMULAS*", NIL);
            deflexical("*MTS-ACTUAL-MTS*", NIL);
            deflexical("*MTS-GUESSED-MTS*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MTSUGG-TOO-GENERAL-TERM-FILTER*", $list_alt39);
            deflexical("*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*", $list_alt40);
            deflexical("*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*", $list_alt41);
        }
        return NIL;
    }

    public static SubLObject init_mt_suggestor_file_Previous() {
        defparameter("*MTS-FORBID-LEXICAL-MTS*", NIL);
        defparameter("*MTS-FORBID-PROJECT-MTS*", NIL);
        defparameter("*MTS-FORBID-HIGH-LEVEL-MTS-FOR-CONTENT-ASSERTIONS*", T);
        defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-PERCENT*", $float$0_8);
        defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-NUMBER*", THREE_INTEGER);
        deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-PROPERTIES*", $list13);
        deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-MT*", $list14);
        deflexical("*FREQUENCY-LIST-OF-MTS-CACHING-STATE*", NIL);
        deflexical("*MTSUGG-TOO-GENERAL-TERM-FILTER*", $list38);
        deflexical("*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*", $list39);
        deflexical("*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*", $list40);
        deflexical("*TOP-MT-PERCENT-COUNT-CACHING-STATE*", NIL);
        deflexical("*EXAMINATION-FORMULAS*", NIL);
        deflexical("*EXAMINATION-MTS*", NIL);
        deflexical("*MTS-INCORRECT-FORMULAS*", NIL);
        deflexical("*MTS-ACTUAL-MTS*", NIL);
        deflexical("*MTS-GUESSED-MTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_mt_suggestor_file() {
        memoization_state.note_globally_cached_function(FREQUENCY_LIST_OF_MTS);
        memoization_state.note_globally_cached_function(TOP_MT_PERCENT_COUNT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mt_suggestor_file();
    }

    @Override
    public void initializeVariables() {
        init_mt_suggestor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mt_suggestor_file();
    }

    static {
    }

    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    static private final SubLList $list_alt14 = list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric"), list(reader_make_constant_shell("MtTimeDimFn"), reader_make_constant_shell("Now")));

    public static final SubLSymbol $kw31$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym32$MTS_TOO_GENERAL_ = makeSymbol("MTS-TOO-GENERAL?");

    static private final SubLSymbol $sym34$MTS_TOO_GENERAL_LIGHT_FILTERING_ = makeSymbol("MTS-TOO-GENERAL-LIGHT-FILTERING?");

    static private final SubLSymbol $sym36$_ = makeSymbol(">");

    static private final SubLList $list_alt39 = list(new SubLObject[]{ reader_make_constant_shell("implies"), reader_make_constant_shell("and"), reader_make_constant_shell("not"), reader_make_constant_shell("or"), reader_make_constant_shell("termOfUnit"), reader_make_constant_shell("equals"), reader_make_constant_shell("ExistingObjectType"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("forAll"), reader_make_constant_shell("comment"), reader_make_constant_shell("cyclistNotes"), reader_make_constant_shell("sharedNotes"), reader_make_constant_shell("different"), reader_make_constant_shell("Predicate"), reader_make_constant_shell("unknownSentence"), reader_make_constant_shell("similarTo"), reader_make_constant_shell("CollectionType"), reader_make_constant_shell("abnormal"), reader_make_constant_shell("evaluate") });

    static private final SubLList $list_alt40 = list(reader_make_constant_shell("MetaRelation"), reader_make_constant_shell("KEFaciliationPredicate"));

    static private final SubLList $list_alt41 = list(reader_make_constant_shell("CoreConstant"));

    static private final SubLSymbol $sym49$_ = makeSymbol("+");

    static private final SubLList $list_alt56 = list(new SubLObject[]{ makeSymbol("RUN-LARGE-COMMONSENSE-MT-RULES-TEST"), makeSymbol("RUN-BASE-KB-RULES-TEST"), makeSymbol("RUN-LEXICAL-RULES-TEST"), makeSymbol("RUN-LEXICAL-GAFS-TEST"), makeSymbol("RUN-LARGE-COMMONSENSE-MT-GAFS-TEST"), makeSymbol("RUN-META-PREDICATES-TEST"), makeSymbol("RUN-RULE-MACRO-PREDICATES-TEST"), makeSymbol("RUN-NEW-PROJECT-ASSERTIONS-TEST"), makeSymbol("RUN-OLD-PROJECT-ASSERTIONS-TEST") });

    static private final SubLString $str_alt57$Running_test__ = makeString("Running test: ");

    static private final SubLString $str_alt58$_RESULTS__ = makeString(" RESULTS: ");

    static private final SubLString $str_alt59$Incorrect_Formula__ = makeString("Incorrect Formula: ");

    static private final SubLString $str_alt60$Suggested_Mt__ = makeString("Suggested Mt: ");

    static private final SubLString $str_alt61$Actual_Mt__ = makeString("Actual Mt: ");

    static private final SubLString $str_alt62$Frequency_list_of_suggested_mts__ = makeString("Frequency list of suggested mts: ");

    static private final SubLString $str_alt63$Frequency_list_of_actual_mts__ = makeString("Frequency list of actual mts: ");

    static private final SubLString $str_alt87$Trying_Formula__ = makeString("Trying Formula: ");

    static private final SubLString $str_alt88$Got_ = makeString("Got ");

    static private final SubLString $str_alt89$_out_of_ = makeString(" out of ");

    static private final SubLString $str_alt93$do_broad_mt_index = makeString("do-broad-mt-index");
}

/**
 * Total time: 934 ms
 */
