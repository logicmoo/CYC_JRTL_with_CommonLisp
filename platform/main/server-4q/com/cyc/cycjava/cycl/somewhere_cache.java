/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
import static com.cyc.cycjava.cycl.misc_utilities.uninitialized;
import static com.cyc.cycjava.cycl.misc_utilities.uninitialized_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SOMEWHERE-CACHE
 * source file: /cyc/top/cycl/somewhere-cache.lisp
 * created:     2019/07/03 17:37:24
 */
public final class somewhere_cache extends SubLTranslatedFile implements V12 {
    /**
     * Like @xref some-pred-value-in-any-mt, but ensures that the assertion has some argument.
     */
    @LispMethod(comment = "Like @xref some-pred-value-in-any-mt, but ensures that the assertion has some argument.")
    public static final SubLObject some_pred_value_in_any_mt_with_argumentsP(SubLObject v_term, SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject resultP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_argnum, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_argnum, pred_var);
                                    SubLObject done_var = resultP;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                        {
                                                            SubLObject done_var_9 = resultP;
                                                            SubLObject token_var_10 = NIL;
                                                            while (NIL == done_var_9) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                    SubLObject valid_11 = makeBoolean(token_var_10 != ass);
                                                                    if (NIL != valid_11) {
                                                                        if (NIL != kb_accessors.assertion_still_thereP(ass, truth)) {
                                                                            resultP = T;
                                                                        }
                                                                    }
                                                                    done_var_9 = makeBoolean((NIL == valid_11) || (NIL != resultP));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != resultP));
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
                return resultP;
            }
        }
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_2_initializer() {
        return list(new SubLObject[]{ cons(reader_make_constant_shell("canonicalizerDirectiveForArg"), ONE_INTEGER), cons(reader_make_constant_shell("canonicalizerDirectiveForAllArgs"), ONE_INTEGER), cons(reader_make_constant_shell("canonicalizerDirectiveForArgAndRest"), ONE_INTEGER), cons(reader_make_constant_shell("evaluateAtEL"), ONE_INTEGER), cons(reader_make_constant_shell("evaluateImmediately"), ONE_INTEGER), cons(reader_make_constant_shell("genlPreds"), TWO_INTEGER), cons(reader_make_constant_shell("typedGenlPreds"), ONE_INTEGER), cons(reader_make_constant_shell("genlInverse"), TWO_INTEGER), cons(reader_make_constant_shell("functionCorrespondingPredicate"), ONE_INTEGER), cons(reader_make_constant_shell("highlyRelevantTerm"), ONE_INTEGER), cons(reader_make_constant_shell("interArgResultIsa"), ONE_INTEGER), cons(reader_make_constant_shell("interArgResultGenl"), THREE_INTEGER), cons(reader_make_constant_shell("interArgGenl1-2"), ONE_INTEGER), cons(reader_make_constant_shell("interArgGenl2-1"), ONE_INTEGER), cons(reader_make_constant_shell("interArgGenl2-4"), ONE_INTEGER), cons(reader_make_constant_shell("interArgDifferent"), ONE_INTEGER), cons(reader_make_constant_shell("interArgReln"), ONE_INTEGER), cons(reader_make_constant_shell("irrelevantTerm"), ONE_INTEGER), cons(reader_make_constant_shell("ruleTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("mtTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("modalInArg"), ONE_INTEGER), cons(reader_make_constant_shell("notAssertible"), ONE_INTEGER), cons(reader_make_constant_shell("relationAllExists"), TWO_INTEGER), cons(reader_make_constant_shell("rewriteOf"), TWO_INTEGER), cons(reader_make_constant_shell("scopingArg"), ONE_INTEGER), cons(reader_make_constant_shell("skolemizeForward"), ONE_INTEGER), cons(reader_make_constant_shell("typeLevelVersionInArg"), ONE_INTEGER), cons(reader_make_constant_shell("relationAllExistsCount"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsMany"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsMin"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsUnique"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsSame"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsAndOnly"), TWO_INTEGER), cons(reader_make_constant_shell("reflexiveOn"), ONE_INTEGER), cons(reader_make_constant_shell("requiredActorSlots-Unique"), ONE_INTEGER), cons(reader_make_constant_shell("collRelation"), TWO_INTEGER), cons(reader_make_constant_shell("collRelationUnique"), TWO_INTEGER), cons(reader_make_constant_shell("requiredActorSlots"), ONE_INTEGER), cons(reader_make_constant_shell("rolesForEventType"), ONE_INTEGER), cons(reader_make_constant_shell("keRequirementPreds"), ONE_INTEGER), cons(reader_make_constant_shell("roleTypesForEventType"), ONE_INTEGER), cons(reader_make_constant_shell("requiredArg1Pred"), ONE_INTEGER), cons(reader_make_constant_shell("preferredSubjectRole"), ONE_INTEGER), cons(reader_make_constant_shell("subjectRoles"), ONE_INTEGER), cons(reader_make_constant_shell("preferredIndirectObjectRole"), ONE_INTEGER), cons(reader_make_constant_shell("indirectObjectRoles"), ONE_INTEGER), cons(reader_make_constant_shell("preferredDirectObjectRole"), ONE_INTEGER), cons(reader_make_constant_shell("directObjectRoles"), ONE_INTEGER), cons(reader_make_constant_shell("posForms"), ONE_INTEGER), cons(reader_make_constant_shell("posBaseForms"), ONE_INTEGER), cons(reader_make_constant_shell("mtTimeIndex"), ONE_INTEGER), cons(reader_make_constant_shell("genStringAssertion-Terse"), TWO_INTEGER), cons(reader_make_constant_shell("genStringAssertion-Precise"), TWO_INTEGER), cons(reader_make_constant_shell("genStringAssertion"), TWO_INTEGER), cons(reader_make_constant_shell("predTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("assertionTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("ruleTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("salientTermImagePathname"), ONE_INTEGER), cons(reader_make_constant_shell("formulaTemplateHasArgumentPositionInformation"), ONE_INTEGER), cons(reader_make_constant_shell("except"), ONE_INTEGER), cons(reader_make_constant_shell("exceptMt"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa1-2"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa2-1"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentAsserted"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentAssertedForValueInArg"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentEnumerable"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentEnumerableForArg"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentEnumerableForValueInArg"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentDecidable"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentDecidableForValueInArg"), ONE_INTEGER), cons(reader_make_constant_shell("transitiveViaArg"), ONE_INTEGER), cons(reader_make_constant_shell("transitiveViaArgInverse"), ONE_INTEGER), cons(reader_make_constant_shell("conservativeViaArg"), ONE_INTEGER), cons(reader_make_constant_shell("conservativeViaArgInverse"), ONE_INTEGER), cons(reader_make_constant_shell("functionalInArgs"), ONE_INTEGER), cons(reader_make_constant_shell("strictlyFunctionalInArgs"), ONE_INTEGER), cons(reader_make_constant_shell("parsingConflateTo"), ONE_INTEGER), cons(reader_make_constant_shell("qaConflateTo"), ONE_INTEGER), cons(reader_make_constant_shell("qaConflateToCompletely"), ONE_INTEGER), cons(reader_make_constant_shell("terseDisambiguationString"), ONE_INTEGER), cons(reader_make_constant_shell("denotation"), FOUR_INTEGER), cons(reader_make_constant_shell("headMedialString"), FIVE_INTEGER), cons(reader_make_constant_shell("compoundString"), FOUR_INTEGER), cons(reader_make_constant_shell("hyphenString"), FOUR_INTEGER), cons(reader_make_constant_shell("multiWordString"), FOUR_INTEGER), cons(reader_make_constant_shell("preferredNameString"), ONE_INTEGER), cons(reader_make_constant_shell("nameString"), ONE_INTEGER), cons(reader_make_constant_shell("placeName-WithRegion"), ONE_INTEGER), cons(reader_make_constant_shell("placeName-WithRegionAbbreviation"), ONE_INTEGER), cons(reader_make_constant_shell("titleOfWork"), ONE_INTEGER), cons(reader_make_constant_shell("movieTitleString"), ONE_INTEGER), cons(reader_make_constant_shell("gospelName-Short"), ONE_INTEGER), cons(reader_make_constant_shell("brandNameOfProductType"), ONE_INTEGER), cons(reader_make_constant_shell("businessName-WithTickerSymbol"), ONE_INTEGER), cons(reader_make_constant_shell("organizationName-Standard"), ONE_INTEGER), cons(reader_make_constant_shell("organizationName-Official"), ONE_INTEGER), cons(reader_make_constant_shell("familyName"), ONE_INTEGER), cons(reader_make_constant_shell("lastName"), ONE_INTEGER), cons(reader_make_constant_shell("placeName-ShortForm"), ONE_INTEGER), cons(reader_make_constant_shell("countryName-ShortForm"), ONE_INTEGER), cons(reader_make_constant_shell("placeName-Standard"), ONE_INTEGER), cons(reader_make_constant_shell("countryName-LongForm"), ONE_INTEGER), cons(reader_make_constant_shell("chemicalFormulaString"), ONE_INTEGER), cons(reader_make_constant_shell("fullName"), ONE_INTEGER), cons(reader_make_constant_shell("alias"), ONE_INTEGER), cons(reader_make_constant_shell("definiteDescriptions"), ONE_INTEGER), cons(reader_make_constant_shell("acronymString"), ONE_INTEGER), cons(reader_make_constant_shell("initialismString"), ONE_INTEGER), cons(reader_make_constant_shell("initialsString"), ONE_INTEGER), cons(reader_make_constant_shell("pseudonym"), ONE_INTEGER), cons(reader_make_constant_shell("countryCodeTrigraph"), ONE_INTEGER), cons(reader_make_constant_shell("atomicSymbol"), ONE_INTEGER), cons(reader_make_constant_shell("codeMapping"), THREE_INTEGER), cons(reader_make_constant_shell("applicableWhenTypedOnlyWhenSpecialization"), THREE_INTEGER), cons(reader_make_constant_shell("mostNotableIsa"), ONE_INTEGER), cons(reader_make_constant_shell("mostNotableGenls"), ONE_INTEGER), cons(reader_make_constant_shell("facetOfCollectionBasedOnBinaryPred"), ONE_INTEGER), cons(reader_make_constant_shell("facetOfCollectionBasedOnBinaryPredInverse"), ONE_INTEGER), cons(reader_make_constant_shell("facetOfCollectionBasedOnTypeBinaryPred"), ONE_INTEGER), cons(reader_make_constant_shell("facetOfCollectionBasedOnTypeBinaryPredInverse"), ONE_INTEGER), cons(reader_make_constant_shell("teamSeed"), TWO_INTEGER), cons(reader_make_constant_shell("denotesArgInReln"), TWO_INTEGER), cons(reader_make_constant_shell("classificationSystemOf-Focally"), TWO_INTEGER), cons(reader_make_constant_shell("genlMt-Vocabulary"), ONE_INTEGER), cons(reader_make_constant_shell("marketTypeDefiningProductType"), TWO_INTEGER), cons(reader_make_constant_shell("collectionDifference"), TWO_INTEGER), cons(reader_make_constant_shell("characteristicActivityTypeOfPersonType-Frequently"), TWO_INTEGER), cons(reader_make_constant_shell("medicalFindingTypeOfType"), ONE_INTEGER), cons(reader_make_constant_shell("medicalDiagnosisTypeOfType"), ONE_INTEGER), cons(reader_make_constant_shell("suppressFacetInstancesFromTaxonomy"), TWO_INTEGER), cons(reader_make_constant_shell("quantifiedBinaryPredicateForPredWithMacro"), THREE_INTEGER), cons(reader_make_constant_shell("verbSemTransTemplate"), ONE_INTEGER), cons(reader_make_constant_shell("evaluationTypeDirectEvalueeType"), ONE_INTEGER), cons(reader_make_constant_shell("allSubCollectionsAreInstancesOf"), ONE_INTEGER), cons(reader_make_constant_shell("typeDeterminesValueOfArgInReln"), THREE_INTEGER), cons(reader_make_constant_shell("hypothesisLevelStrategyForPredAndArgs"), TWO_INTEGER), cons(reader_make_constant_shell("sourceFixedSemanticValueForRelationArg"), THREE_INTEGER) });
    }

    public static final SubLFile me = new somewhere_cache();

 public static final String myName = "com.cyc.cycjava.cycl.somewhere_cache";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $use_somewhere_cacheP$ = makeSymbol("*USE-SOMEWHERE-CACHE?*");

    // deflexical
    // Definitions
    /**
     * An alist, each entry of the form (PRED . ARGNUM) where PRED is the predicate to be cached
     * and ARGNUM specifies the argnum in which to find the indexed terms to be cached.
     * Currently a predicate CANNOT have more than one cached argnum.
     */
    @LispMethod(comment = "An alist, each entry of the form (PRED . ARGNUM) where PRED is the predicate to be cached\r\nand ARGNUM specifies the argnum in which to find the indexed terms to be cached.\r\nCurrently a predicate CANNOT have more than one cached argnum.\ndeflexical\nAn alist, each entry of the form (PRED . ARGNUM) where PRED is the predicate to be cached\nand ARGNUM specifies the argnum in which to find the indexed terms to be cached.\nCurrently a predicate CANNOT have more than one cached argnum.")
    private static final SubLSymbol $somewhere_cached_preds_table$ = makeSymbol("*SOMEWHERE-CACHED-PREDS-TABLE*");

    // deflexical
    // For use by get-after-adding and get-after-removing
    /**
     * For use by get-after-adding and get-after-removing
     */
    @LispMethod(comment = "For use by get-after-adding and get-after-removing\ndeflexical")
    public static final SubLSymbol $somewhere_cache_gaf_after_adding_info$ = makeSymbol("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = cons(reader_make_constant_shell("argsIsa"), ONE_INTEGER);

    static private final SubLList $list1 = cons(reader_make_constant_shell("argAndRestIsa"), ONE_INTEGER);

    static private final SubLList $list2 = cons(reader_make_constant_shell("argAndRestGenl"), ONE_INTEGER);

    private static final SubLList $list3 = cons(reader_make_constant_shell("argsQuotedIsa"), ONE_INTEGER);

    private static final SubLList $list4 = cons(reader_make_constant_shell("argAndRestQuotedIsa"), ONE_INTEGER);

    private static final SubLList $list5 = cons(reader_make_constant_shell("arg1Genl"), ONE_INTEGER);

    private static final SubLList $list6 = cons(reader_make_constant_shell("arg2Genl"), ONE_INTEGER);

    private static final SubLList $list7 = cons(reader_make_constant_shell("arg3Genl"), ONE_INTEGER);

    private static final SubLList $list8 = cons(reader_make_constant_shell("arg4Genl"), ONE_INTEGER);

    private static final SubLList $list9 = cons(reader_make_constant_shell("arg5Genl"), ONE_INTEGER);

    static private final SubLList $list10 = cons(reader_make_constant_shell("arg6Genl"), ONE_INTEGER);

    private static final SubLList $list11 = cons(reader_make_constant_shell("arg1NotIsa"), ONE_INTEGER);

    static private final SubLList $list12 = cons(reader_make_constant_shell("arg2NotIsa"), ONE_INTEGER);

    private static final SubLList $list13 = cons(reader_make_constant_shell("arg3NotIsa"), ONE_INTEGER);

    private static final SubLList $list14 = cons(reader_make_constant_shell("arg4NotIsa"), ONE_INTEGER);

    private static final SubLList $list15 = cons(reader_make_constant_shell("arg5NotIsa"), ONE_INTEGER);

    private static final SubLList $list16 = cons(reader_make_constant_shell("arg6NotIsa"), ONE_INTEGER);

    private static final SubLList $list17 = cons(reader_make_constant_shell("arg1Format"), ONE_INTEGER);

    private static final SubLList $list18 = cons(reader_make_constant_shell("arg2Format"), ONE_INTEGER);

    private static final SubLList $list19 = cons(reader_make_constant_shell("arg3Format"), ONE_INTEGER);

    private static final SubLList $list20 = cons(reader_make_constant_shell("arg4Format"), ONE_INTEGER);

    private static final SubLList $list21 = cons(reader_make_constant_shell("arg5Format"), ONE_INTEGER);

    private static final SubLList $list22 = cons(reader_make_constant_shell("arg6Format"), ONE_INTEGER);

    private static final SubLList $list23 = cons(reader_make_constant_shell("arg1QuotedIsa"), ONE_INTEGER);

    private static final SubLList $list24 = cons(reader_make_constant_shell("arg2QuotedIsa"), ONE_INTEGER);

    private static final SubLList $list25 = cons(reader_make_constant_shell("arg3QuotedIsa"), ONE_INTEGER);

    private static final SubLList $list26 = cons(reader_make_constant_shell("arg4QuotedIsa"), ONE_INTEGER);

    private static final SubLList $list27 = cons(reader_make_constant_shell("arg5QuotedIsa"), ONE_INTEGER);

    private static final SubLList $list28 = cons(reader_make_constant_shell("arg6QuotedIsa"), ONE_INTEGER);

    private static final SubLObject $list29 = _constant_29_initializer();

    private static final SubLSymbol $some_pred_assertion_somewhere_cache$ = makeSymbol("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*");

    private static final SubLSymbol $somewhere_cached_pred_argnum_dict$ = makeSymbol("*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*");

    private static final SubLSymbol SOMEWHERE_CACHED_PRED_P = makeSymbol("SOMEWHERE-CACHED-PRED-P");

    private static final SubLSymbol $sym34$VALID_SOMEWHERE_CACHE_ITEM_ = makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");

    private static final SubLList $list38 = cons(makeSymbol("PRED"), makeSymbol("ARGNUM"));

    private static final SubLString $$$Initializing_all_somewhere_caches = makeString("Initializing all somewhere caches");

    private static final SubLList $list40 = cons(makeSymbol("RECACHE-SOME-PRED-ASSERTION-SOMEWHERE"), reader_make_constant_shell("UniversalVocabularyMt"));

    private static final SubLSymbol $sym41$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLSymbol $sym42$VALID_FORT_ = makeSymbol("VALID-FORT?");

    private static final SubLSymbol $inter_arg_result_isa_somewhere_cache$ = makeSymbol("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*");



    private static final SubLString $str46$somewhere_cache_argnum_mismatch_f = makeString("somewhere-cache argnum mismatch for ~s: ~s vs. ~s");



    /**
     * Return T iff there are any true assertions of the form
     * (PRED ... TERM ...)
     * where TERM appears in the ARGNUMth position of the assertion,
     * where ARGNUM is specified in the *somewhere-cached-preds-table*.
     * Does not account for specPreds of PRED.
     *
     * @param INITIALIZE-IF-UNINITIALIZED?
     * 		booleanp; if the somewhere cache for PRED and ARGNUM
     * 		has not been initialized yet, should we initialize it? If NIL, we'll error instead.
     */
    @LispMethod(comment = "Return T iff there are any true assertions of the form\r\n(PRED ... TERM ...)\r\nwhere TERM appears in the ARGNUMth position of the assertion,\r\nwhere ARGNUM is specified in the *somewhere-cached-preds-table*.\r\nDoes not account for specPreds of PRED.\r\n\r\n@param INITIALIZE-IF-UNINITIALIZED?\r\n\t\tbooleanp; if the somewhere cache for PRED and ARGNUM\r\n\t\thas not been initialized yet, should we initialize it? If NIL, we\'ll error instead.\nReturn T iff there are any true assertions of the form\n(PRED ... TERM ...)\nwhere TERM appears in the ARGNUMth position of the assertion,\nwhere ARGNUM is specified in the *somewhere-cached-preds-table*.\nDoes not account for specPreds of PRED.")
    public static final SubLObject some_pred_assertion_somewhereP_alt(SubLObject pred, SubLObject v_term, SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        SubLTrampolineFile.checkType(pred, SOMEWHERE_CACHED_PRED_P);
        SubLTrampolineFile.checkType(v_term, $sym6$VALID_SOMEWHERE_CACHE_ITEM_);
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.somewhere_cache.some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP);
            if (pcase_var.eql($YES)) {
                return T;
            } else {
                if (pcase_var.eql($NO)) {
                    return NIL;
                } else {
                    if (pcase_var.eql($MAYBE)) {
                        com.cyc.cycjava.cycl.somewhere_cache.check_somewhere_cache_argnum(pred, argnum, UNPROVIDED);
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff there are any true assertions of the form
     * (PRED ... TERM ...)
     * where TERM appears in the ARGNUMth position of the assertion,
     * where ARGNUM is specified in the *somewhere-cached-preds-table*.
     * Does not account for specPreds of PRED.
     *
     * @param INITIALIZE-IF-UNINITIALIZED?
     * 		booleanp; if the somewhere cache for PRED and ARGNUM
     * 		has not been initialized yet, should we initialize it? If NIL, we'll error instead.
     */
    @LispMethod(comment = "Return T iff there are any true assertions of the form\r\n(PRED ... TERM ...)\r\nwhere TERM appears in the ARGNUMth position of the assertion,\r\nwhere ARGNUM is specified in the *somewhere-cached-preds-table*.\r\nDoes not account for specPreds of PRED.\r\n\r\n@param INITIALIZE-IF-UNINITIALIZED?\r\n\t\tbooleanp; if the somewhere cache for PRED and ARGNUM\r\n\t\thas not been initialized yet, should we initialize it? If NIL, we\'ll error instead.\nReturn T iff there are any true assertions of the form\n(PRED ... TERM ...)\nwhere TERM appears in the ARGNUMth position of the assertion,\nwhere ARGNUM is specified in the *somewhere-cached-preds-table*.\nDoes not account for specPreds of PRED.")
    public static SubLObject some_pred_assertion_somewhereP(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        assert NIL != somewhere_cached_pred_p(pred) : "! somewhere_cache.somewhere_cached_pred_p(pred) " + ("somewhere_cache.somewhere_cached_pred_p(pred) " + "CommonSymbols.NIL != somewhere_cache.somewhere_cached_pred_p(pred) ") + pred;
        assert NIL != valid_somewhere_cache_itemP(v_term) : "! somewhere_cache.valid_somewhere_cache_itemP(v_term) " + ("somewhere_cache.valid_somewhere_cache_itemP(v_term) " + "CommonSymbols.NIL != somewhere_cache.valid_somewhere_cache_itemP(v_term) ") + v_term;
        final SubLObject pcase_var = some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP);
        if (pcase_var.eql($YES)) {
            return T;
        }
        if (pcase_var.eql($NO)) {
            return NIL;
        }
        if (pcase_var.eql($MAYBE)) {
            check_somewhere_cache_argnum(pred, argnum, UNPROVIDED);
            return NIL;
        }
        return NIL;
    }

    /**
     * Return NIL iff the somewhere cache says that there are *no* true assertions of the form
     * (PRED ... TERM ...)
     * where TERM appears in the ARGNUMth position of the assertion.
     * Does not account for specPreds of PRED.
     *
     * @param INITIALIZE-IF-UNINITIALIZED?
     * 		booleanp; if the somewhere cache for PRED and ARGNUM
     * 		has not been initialized yet, should we initialize it? If NIL, we'll return T instead.
     */
    @LispMethod(comment = "Return NIL iff the somewhere cache says that there are *no* true assertions of the form\r\n(PRED ... TERM ...)\r\nwhere TERM appears in the ARGNUMth position of the assertion.\r\nDoes not account for specPreds of PRED.\r\n\r\n@param INITIALIZE-IF-UNINITIALIZED?\r\n\t\tbooleanp; if the somewhere cache for PRED and ARGNUM\r\n\t\thas not been initialized yet, should we initialize it? If NIL, we\'ll return T instead.\nReturn NIL iff the somewhere cache says that there are *no* true assertions of the form\n(PRED ... TERM ...)\nwhere TERM appears in the ARGNUMth position of the assertion.\nDoes not account for specPreds of PRED.")
    public static final SubLObject maybe_some_pred_assertion_somewhereP_alt(SubLObject pred, SubLObject v_term, SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        return makeBoolean((NIL == com.cyc.cycjava.cycl.somewhere_cache.somewhere_cached_pred_p(pred)) || ($NO != com.cyc.cycjava.cycl.somewhere_cache.some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP)));
    }

    /**
     * Return NIL iff the somewhere cache says that there are *no* true assertions of the form
     * (PRED ... TERM ...)
     * where TERM appears in the ARGNUMth position of the assertion.
     * Does not account for specPreds of PRED.
     *
     * @param INITIALIZE-IF-UNINITIALIZED?
     * 		booleanp; if the somewhere cache for PRED and ARGNUM
     * 		has not been initialized yet, should we initialize it? If NIL, we'll return T instead.
     */
    @LispMethod(comment = "Return NIL iff the somewhere cache says that there are *no* true assertions of the form\r\n(PRED ... TERM ...)\r\nwhere TERM appears in the ARGNUMth position of the assertion.\r\nDoes not account for specPreds of PRED.\r\n\r\n@param INITIALIZE-IF-UNINITIALIZED?\r\n\t\tbooleanp; if the somewhere cache for PRED and ARGNUM\r\n\t\thas not been initialized yet, should we initialize it? If NIL, we\'ll return T instead.\nReturn NIL iff the somewhere cache says that there are *no* true assertions of the form\n(PRED ... TERM ...)\nwhere TERM appears in the ARGNUMth position of the assertion.\nDoes not account for specPreds of PRED.")
    public static SubLObject maybe_some_pred_assertion_somewhereP(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        return makeBoolean((NIL == somewhere_cached_pred_p(pred)) || ($NO != some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP)));
    }

    public static final SubLObject possibly_initialize_all_somewhere_caches() {
        if ($UNINITIALIZED == $some_pred_assertion_somewhere_cache$.getGlobalValue()) {
            return com.cyc.cycjava.cycl.somewhere_cache.initialize_all_somewhere_caches();
        } else {
            {
                SubLObject cdolist_list_var = $somewhere_cached_preds_table$.getGlobalValue();
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject argnum = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt10);
                        pred = current.first();
                        current = current.rest();
                        argnum = current;
                        com.cyc.cycjava.cycl.somewhere_cache.lookup_somewhere_set_for_pred(pred, T);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_initialize_all_somewhere_caches(SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = T;
        }
        if (NIL != misc_utilities.uninitialized_p($some_pred_assertion_somewhere_cache$.getGlobalValue())) {
            return initialize_all_somewhere_caches();
        }
        if (NIL != robustP) {
            SubLObject cdolist_list_var = $somewhere_cached_preds_table$.getGlobalValue();
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject pred = NIL;
                SubLObject argnum = NIL;
                destructuring_bind_must_consp(current, datum, $list38);
                pred = current.first();
                current = argnum = current.rest();
                if (NIL == forts.invalid_fortP(pred)) {
                    lookup_somewhere_set_for_pred(pred, T);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject initialize_all_somewhere_caches_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.somewhere_cache.clear_all_somewhere_caches();
            {
                SubLObject total_pred_count = length($somewhere_cached_preds_table$.getGlobalValue());
                SubLObject count = ZERO_INTEGER;
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
                        noting_percent_progress_preamble($$$Initializing_all_somewhere_caches);
                        {
                            SubLObject cdolist_list_var = $somewhere_cached_preds_table$.getGlobalValue();
                            SubLObject cons = NIL;
                            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = cons;
                                    SubLObject current = datum;
                                    SubLObject pred = NIL;
                                    SubLObject argnum = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt10);
                                    pred = current.first();
                                    current = current.rest();
                                    argnum = current;
                                    count = add(count, set.set_size(com.cyc.cycjava.cycl.somewhere_cache.initialize_somewhere_cache(pred)));
                                    note_percent_progress(count, total_pred_count);
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
                return count;
            }
        }
    }

    public static SubLObject initialize_all_somewhere_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_somewhere_cached_pred_argnum_dict();
        clear_all_somewhere_caches();
        final SubLObject total_pred_count = length($somewhere_cached_preds_table$.getGlobalValue());
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$Initializing_all_somewhere_caches);
                SubLObject cdolist_list_var = $somewhere_cached_preds_table$.getGlobalValue();
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject pred = NIL;
                    SubLObject argnum = NIL;
                    destructuring_bind_must_consp(current, datum, $list38);
                    pred = current.first();
                    current = argnum = current.rest();
                    if (NIL == forts.invalid_fortP(pred)) {
                        count = add(count, set.set_size(initialize_somewhere_cache(pred)));
                    }
                    note_percent_progress(count, total_pred_count);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject clear_all_somewhere_caches_alt() {
        $some_pred_assertion_somewhere_cache$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQ), length($somewhere_cached_preds_table$.getGlobalValue())));
        return ZERO_INTEGER;
    }

    public static SubLObject clear_all_somewhere_caches() {
        $some_pred_assertion_somewhere_cache$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), length($somewhere_cached_preds_table$.getGlobalValue())));
        return ZERO_INTEGER;
    }

    public static SubLObject possibly_initialize_somewhere_cached_pred_argnum_dict() {
        if (NIL != misc_utilities.uninitialized_p($somewhere_cached_pred_argnum_dict$.getGlobalValue())) {
            return initialize_somewhere_cached_pred_argnum_dict();
        }
        return NIL;
    }

    public static SubLObject initialize_somewhere_cached_pred_argnum_dict() {
        $somewhere_cached_pred_argnum_dict$.setGlobalValue(dictionary_utilities.new_dictionary_from_alist($somewhere_cached_preds_table$.getGlobalValue(), symbol_function(EQL)));
        return dictionary.dictionary_length($somewhere_cached_pred_argnum_dict$.getGlobalValue());
    }

    public static SubLObject reclassify_somewhere_cached_preds() {
        return initialize_somewhere_cached_pred_argnum_dict();
    }

    /**
     * 'after-adding' and 'after-removing' for preds in *somewhere-cached-preds-table*.
     * This is not asserted as an afterAdding and afterRemoving in the KB, it's hard-coded specially
     * in get-after-adding and get-after-removing.
     */
    @LispMethod(comment = "\'after-adding\' and \'after-removing\' for preds in *somewhere-cached-preds-table*.\r\nThis is not asserted as an afterAdding and afterRemoving in the KB, it\'s hard-coded specially\r\nin get-after-adding and get-after-removing.\n\'after-adding\' and \'after-removing\' for preds in *somewhere-cached-preds-table*.\nThis is not asserted as an afterAdding and afterRemoving in the KB, it\'s hard-coded specially\nin get-after-adding and get-after-removing.")
    public static final SubLObject recache_some_pred_assertion_somewhere_alt(SubLObject argument, SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, $sym13$GAF_ASSERTION_);
        {
            SubLObject pred = assertions_high.gaf_predicate(assertion);
            SubLObject argnum = com.cyc.cycjava.cycl.somewhere_cache.some_pred_assertion_somewhere_argnum(pred);
            SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
            SubLTrampolineFile.checkType(pred, SOMEWHERE_CACHED_PRED_P);
            if (NIL != com.cyc.cycjava.cycl.somewhere_cache.valid_somewhere_cache_itemP(arg)) {
                com.cyc.cycjava.cycl.somewhere_cache.recache_some_pred_assertion_somewhere_int(pred, arg);
            }
        }
        return NIL;
    }

    /**
     * 'after-adding' and 'after-removing' for preds in *somewhere-cached-preds-table*.
     * This is not asserted as an afterAdding and afterRemoving in the KB, it's hard-coded specially
     * in get-after-adding and get-after-removing.
     */
    @LispMethod(comment = "\'after-adding\' and \'after-removing\' for preds in *somewhere-cached-preds-table*.\r\nThis is not asserted as an afterAdding and afterRemoving in the KB, it\'s hard-coded specially\r\nin get-after-adding and get-after-removing.\n\'after-adding\' and \'after-removing\' for preds in *somewhere-cached-preds-table*.\nThis is not asserted as an afterAdding and afterRemoving in the KB, it\'s hard-coded specially\nin get-after-adding and get-after-removing.")
    public static SubLObject recache_some_pred_assertion_somewhere(final SubLObject argument, final SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "! assertions_high.gaf_assertionP(assertion) " + ("assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) ") + assertion;
        final SubLObject pred = assertions_high.gaf_predicate(assertion);
        final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
        final SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
        assert NIL != somewhere_cached_pred_p(pred) : "! somewhere_cache.somewhere_cached_pred_p(pred) " + ("somewhere_cache.somewhere_cached_pred_p(pred) " + "CommonSymbols.NIL != somewhere_cache.somewhere_cached_pred_p(pred) ") + pred;
        if (NIL != valid_somewhere_cache_itemP(arg)) {
            recache_some_pred_assertion_somewhere_int(pred, arg);
        }
        return NIL;
    }

    public static final SubLObject somewhere_cached_preds_alt() {
        return list_utilities.alist_keys($somewhere_cached_preds_table$.getGlobalValue());
    }

    public static SubLObject somewhere_cached_preds() {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        return dictionary.dictionary_keys($somewhere_cached_pred_argnum_dict$.getGlobalValue());
    }

    public static SubLObject valid_somewhere_cached_preds() {
        return list_utilities.remove_if_not($sym42$VALID_FORT_, somewhere_cached_preds(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject somewhere_cached_pred_p_alt(SubLObject v_object) {
        return list_utilities.alist_has_keyP($somewhere_cached_preds_table$.getGlobalValue(), v_object, symbol_function(EQ));
    }

    public static SubLObject somewhere_cached_pred_p(final SubLObject v_object) {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        SubLObject result = dictionary_utilities.dictionary_has_keyP($somewhere_cached_pred_argnum_dict$.getGlobalValue(), v_object);
        if ((NIL == result) && (NIL != assoc(v_object, $somewhere_cached_preds_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            initialize_somewhere_cached_pred_argnum_dict();
            result = T;
        }
        return result;
    }

    public static SubLObject valid_somewhere_cached_pred_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.valid_fortP(v_object)) && (NIL != somewhere_cached_pred_p(v_object)));
    }

    public static final SubLObject some_pred_assertion_somewhere_argnum_alt(SubLObject pred) {
        return list_utilities.alist_lookup_without_values($somewhere_cached_preds_table$.getGlobalValue(), pred, symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject some_pred_assertion_somewhere_argnum(final SubLObject pred) {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        SubLObject result = dictionary.dictionary_lookup_without_values($somewhere_cached_pred_argnum_dict$.getGlobalValue(), pred, UNPROVIDED);
        if ((NIL == result) && (NIL != assoc(pred, $somewhere_cached_preds_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            initialize_somewhere_cached_pred_argnum_dict();
            result = dictionary.dictionary_lookup_without_values($somewhere_cached_pred_argnum_dict$.getGlobalValue(), pred, UNPROVIDED);
        }
        return result;
    }

    /**
     * All indexed-terms such that there exists some assertion of the form (PRED ... INDEXED-TERM ...)
     * where INDEXED-TERM appears in the ARGNUMth position of the assertion,
     * where ARGNUM is specified in the *somewhere-cached-preds-table*.
     *
     * @param INITIALIZE-IF-UNINITIALIZED?
     * 		booleanp; if the somewhere cache for PRED and ARGNUM
     * 		has not been initialized yet, should we initialize it? If NIL, we'll error instead.
     */
    @LispMethod(comment = "All indexed-terms such that there exists some assertion of the form (PRED ... INDEXED-TERM ...)\r\nwhere INDEXED-TERM appears in the ARGNUMth position of the assertion,\r\nwhere ARGNUM is specified in the *somewhere-cached-preds-table*.\r\n\r\n@param INITIALIZE-IF-UNINITIALIZED?\r\n\t\tbooleanp; if the somewhere cache for PRED and ARGNUM\r\n\t\thas not been initialized yet, should we initialize it? If NIL, we\'ll error instead.\nAll indexed-terms such that there exists some assertion of the form (PRED ... INDEXED-TERM ...)\nwhere INDEXED-TERM appears in the ARGNUMth position of the assertion,\nwhere ARGNUM is specified in the *somewhere-cached-preds-table*.")
    public static final SubLObject indexed_terms_with_some_pred_assertion_somewhere_alt(SubLObject pred, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        {
            SubLObject v_set = com.cyc.cycjava.cycl.somewhere_cache.lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
            return set.set_element_list(v_set);
        }
    }

    /**
     * All indexed-terms such that there exists some assertion of the form (PRED ... INDEXED-TERM ...)
     * where INDEXED-TERM appears in the ARGNUMth position of the assertion,
     * where ARGNUM is specified in the *somewhere-cached-preds-table*.
     *
     * @param INITIALIZE-IF-UNINITIALIZED?
     * 		booleanp; if the somewhere cache for PRED and ARGNUM
     * 		has not been initialized yet, should we initialize it? If NIL, we'll error instead.
     */
    @LispMethod(comment = "All indexed-terms such that there exists some assertion of the form (PRED ... INDEXED-TERM ...)\r\nwhere INDEXED-TERM appears in the ARGNUMth position of the assertion,\r\nwhere ARGNUM is specified in the *somewhere-cached-preds-table*.\r\n\r\n@param INITIALIZE-IF-UNINITIALIZED?\r\n\t\tbooleanp; if the somewhere cache for PRED and ARGNUM\r\n\t\thas not been initialized yet, should we initialize it? If NIL, we\'ll error instead.\nAll indexed-terms such that there exists some assertion of the form (PRED ... INDEXED-TERM ...)\nwhere INDEXED-TERM appears in the ARGNUMth position of the assertion,\nwhere ARGNUM is specified in the *somewhere-cached-preds-table*.")
    public static SubLObject indexed_terms_with_some_pred_assertion_somewhere(final SubLObject pred, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        final SubLObject v_set = lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
        return set.set_element_list(v_set);
    }

    public static final SubLObject inter_arg_result_isa_somewhere_cache_alt(SubLObject initialize_if_uninitializedP) {
        if (NIL != uninitialized_p($inter_arg_result_isa_somewhere_cache$.getGlobalValue())) {
            $inter_arg_result_isa_somewhere_cache$.setGlobalValue(com.cyc.cycjava.cycl.somewhere_cache.lookup_somewhere_set_for_pred($$interArgResultIsa, initialize_if_uninitializedP));
        }
        return $inter_arg_result_isa_somewhere_cache$.getGlobalValue();
    }

    public static SubLObject inter_arg_result_isa_somewhere_cache(final SubLObject initialize_if_uninitializedP) {
        if (NIL != misc_utilities.uninitialized_p($inter_arg_result_isa_somewhere_cache$.getGlobalValue())) {
            $inter_arg_result_isa_somewhere_cache$.setGlobalValue(lookup_somewhere_set_for_pred($$interArgResultIsa, initialize_if_uninitializedP));
        }
        return $inter_arg_result_isa_somewhere_cache$.getGlobalValue();
    }

    public static final SubLObject inter_arg_result_isa_somewhereP_alt(SubLObject v_term, SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        com.cyc.cycjava.cycl.somewhere_cache.check_somewhere_cache_argnum($$interArgResultIsa, argnum, ONE_INTEGER);
        {
            SubLObject v_set = com.cyc.cycjava.cycl.somewhere_cache.inter_arg_result_isa_somewhere_cache(initialize_if_uninitializedP);
            return set.set_memberP(v_term, v_set);
        }
    }

    public static SubLObject inter_arg_result_isa_somewhereP(final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        check_somewhere_cache_argnum($$interArgResultIsa, argnum, ONE_INTEGER);
        final SubLObject v_set = inter_arg_result_isa_somewhere_cache(initialize_if_uninitializedP);
        return set.set_memberP(v_term, v_set);
    }

    public static SubLObject use_somewhere_cacheP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $use_somewhere_cacheP$.getDynamicValue(thread);
    }

    public static final SubLObject some_pred_assertion_somewhereP_internal_alt(SubLObject pred, SubLObject v_term, SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        {
            SubLObject cached_argnum = com.cyc.cycjava.cycl.somewhere_cache.some_pred_assertion_somewhere_argnum(pred);
            SubLObject ans = $MAYBE;
            if (argnum.eql(cached_argnum)) {
                {
                    SubLObject v_set = com.cyc.cycjava.cycl.somewhere_cache.lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
                    ans = (NIL != set.set_memberP(v_term, v_set)) ? ((SubLObject) ($YES)) : $NO;
                }
            }
            return ans;
        }
    }

    public static SubLObject some_pred_assertion_somewhereP_internal(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, final SubLObject initialize_if_uninitializedP) {
        final SubLObject cached_argnum = some_pred_assertion_somewhere_argnum(pred);
        SubLObject ans = $MAYBE;
        if ((NIL != use_somewhere_cacheP()) && argnum.eql(cached_argnum)) {
            final SubLObject v_set = lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
            ans = (NIL != set.set_memberP(v_term, v_set)) ? $YES : $NO;
        }
        return ans;
    }

    public static final SubLObject check_somewhere_cache_argnum_alt(SubLObject pred, SubLObject argnum, SubLObject cached_argnum) {
        if (cached_argnum == UNPROVIDED) {
            cached_argnum = com.cyc.cycjava.cycl.somewhere_cache.some_pred_assertion_somewhere_argnum(pred);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!argnum.eql(cached_argnum)) {
                    Errors.error($str_alt17$somewhere_cache_argnum_mismatch_f, pred, argnum, cached_argnum);
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_somewhere_cache_argnum(final SubLObject pred, final SubLObject argnum, SubLObject cached_argnum) {
        if (cached_argnum == UNPROVIDED) {
            cached_argnum = some_pred_assertion_somewhere_argnum(pred);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!argnum.eql(cached_argnum))) {
            Errors.error($str46$somewhere_cache_argnum_mismatch_f, pred, argnum, cached_argnum);
        }
        return NIL;
    }

    public static final SubLObject lookup_somewhere_set_for_pred_alt(SubLObject pred, SubLObject initialize_if_uninitializedP) {
        {
            SubLObject v_set = dictionary.dictionary_lookup_without_values($some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, NIL);
            if ((NIL != initialize_if_uninitializedP) && (NIL == v_set)) {
                v_set = com.cyc.cycjava.cycl.somewhere_cache.initialize_somewhere_cache(pred);
            }
            return v_set;
        }
    }

    public static SubLObject lookup_somewhere_set_for_pred(final SubLObject pred, final SubLObject initialize_if_uninitializedP) {
        SubLObject v_set = dictionary.dictionary_lookup_without_values($some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, NIL);
        if ((NIL != initialize_if_uninitializedP) && (NIL == v_set)) {
            v_set = initialize_somewhere_cache(pred);
        }
        return v_set;
    }

    public static final SubLObject initialize_somewhere_cache_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject estimated_size = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
                SubLObject v_set = set.new_set(symbol_function(EQ), estimated_size);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = pred;
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_1 = NIL;
                                                            SubLObject token_var_2 = NIL;
                                                            while (NIL == done_var_1) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != gaf);
                                                                    if (NIL != valid_3) {
                                                                        com.cyc.cycjava.cycl.somewhere_cache.cache_some_pred_assertion_somewhere(v_set, gaf);
                                                                    }
                                                                    done_var_1 = makeBoolean(NIL == valid_3);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
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
                dictionary.dictionary_enter($some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, v_set);
                return v_set;
            }
        }
    }

    public static SubLObject initialize_somewhere_cache(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject estimated_size = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
        final SubLObject v_set = set.new_set(symbol_function(EQL), estimated_size);
        if ((NIL != $bootstrapping_kbP$.getDynamicValue(thread)) || (NIL != forts.valid_fortP(pred))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
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
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                        if (NIL != valid_$6) {
                                            cache_some_pred_assertion_somewhere(v_set, gaf);
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
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            dictionary.dictionary_enter($some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, v_set);
        }
        return v_set;
    }

    public static final SubLObject recache_some_pred_assertion_somewhere_int_alt(SubLObject pred, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_set = com.cyc.cycjava.cycl.somewhere_cache.lookup_somewhere_set_for_pred(pred, T);
                set.set_remove(v_term, v_set);
                {
                    SubLObject done = NIL;
                    SubLObject argnum = com.cyc.cycjava.cycl.somewhere_cache.some_pred_assertion_somewhere_argnum(pred);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject pred_var = pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                        SubLObject done_var = done;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_5 = done;
                                                                SubLObject token_var_6 = NIL;
                                                                while (NIL == done_var_5) {
                                                                    {
                                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                        SubLObject valid_7 = makeBoolean(token_var_6 != gaf);
                                                                        if (NIL != valid_7) {
                                                                            done = com.cyc.cycjava.cycl.somewhere_cache.cache_some_pred_assertion_somewhere(v_set, gaf);
                                                                        }
                                                                        done_var_5 = makeBoolean((NIL == valid_7) || (NIL != done));
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != done));
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
                    if (NIL != done) {
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject recache_some_pred_assertion_somewhere_int(final SubLObject pred, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = lookup_somewhere_set_for_pred(pred, T);
        set.set_remove(v_term, v_set);
        SubLObject done = NIL;
        final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
        final SubLObject _prev_bind_0 = $use_somewhere_cacheP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            $use_somewhere_cacheP$.bind(NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred);
                SubLObject done_var = done;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$8 = done;
                            final SubLObject token_var_$9 = NIL;
                            while (NIL == done_var_$8) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(gaf));
                                if (NIL != valid_$10) {
                                    done = cache_some_pred_assertion_somewhere(v_set, gaf);
                                }
                                done_var_$8 = makeBoolean((NIL == valid_$10) || (NIL != done));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != done));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            $use_somewhere_cacheP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != done) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject cache_some_pred_assertion_somewhere_alt(SubLObject v_set, SubLObject gaf) {
        if (NIL != kb_accessors.assertion_still_thereP(gaf, $TRUE)) {
            {
                SubLObject mt = assertions_high.assertion_mt(gaf);
                if (NIL != hlmt.hlmt_p(mt)) {
                    {
                        SubLObject pred = assertions_high.gaf_predicate(gaf);
                        SubLObject argnum = com.cyc.cycjava.cycl.somewhere_cache.some_pred_assertion_somewhere_argnum(pred);
                        SubLObject arg = assertions_high.gaf_arg(gaf, argnum);
                        if (NIL != com.cyc.cycjava.cycl.somewhere_cache.valid_somewhere_cache_itemP(arg)) {
                            set.set_add(arg, v_set);
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cache_some_pred_assertion_somewhere(final SubLObject v_set, final SubLObject gaf) {
        if (NIL != kb_accessors.assertion_still_thereP(gaf, $TRUE)) {
            final SubLObject mt = assertions_high.assertion_mt(gaf);
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject pred = assertions_high.gaf_predicate(gaf);
                final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
                final SubLObject arg = assertions_high.gaf_arg(gaf, argnum);
                if (NIL != valid_somewhere_cache_itemP(arg)) {
                    set.set_add(arg, v_set);
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT something we can reliably stick in the somewhere cache?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT something we can reliably stick in the somewhere cache?")
    public static final SubLObject valid_somewhere_cache_itemP_alt(SubLObject v_object) {
        return cycl_utilities.reified_term_p(v_object);
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT something we can reliably stick in the somewhere cache?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT something we can reliably stick in the somewhere cache?")
    public static SubLObject valid_somewhere_cache_itemP(final SubLObject v_object) {
        return cycl_utilities.reified_term_p(v_object);
    }

    public static final SubLObject somewhere_cache_unbuiltP_alt() {
        return makeBoolean(!((NIL != dictionary.dictionary_p($some_pred_assertion_somewhere_cache$.getGlobalValue())) && (NIL == dictionary.dictionary_empty_p($some_pred_assertion_somewhere_cache$.getGlobalValue()))));
    }

    public static SubLObject somewhere_cache_unbuiltP() {
        return makeBoolean((NIL == dictionary.dictionary_p($some_pred_assertion_somewhere_cache$.getGlobalValue())) || (NIL != dictionary.dictionary_empty_p($some_pred_assertion_somewhere_cache$.getGlobalValue())));
    }

    public static final SubLObject rebuild_somewhere_cache_alt() {
        return com.cyc.cycjava.cycl.somewhere_cache.initialize_all_somewhere_caches();
    }

    public static SubLObject rebuild_somewhere_cache() {
        return initialize_all_somewhere_caches();
    }

    public static final SubLObject dump_somewhere_cache_to_stream_alt(SubLObject stream) {
        cfasl_output($some_pred_assertion_somewhere_cache$.getGlobalValue(), stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static SubLObject dump_somewhere_cache_to_stream(final SubLObject stream) {
        cfasl_output($some_pred_assertion_somewhere_cache$.getGlobalValue(), stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static final SubLObject load_somewhere_cache_from_stream_alt(SubLObject stream) {
        {
            SubLObject dummy = NIL;
            $some_pred_assertion_somewhere_cache$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject load_somewhere_cache_from_stream(final SubLObject stream) {
        SubLObject dummy = NIL;
        $some_pred_assertion_somewhere_cache$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject declare_somewhere_cache_file_alt() {
        declareFunction("some_pred_assertion_somewhereP", "SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
        declareFunction("maybe_some_pred_assertion_somewhereP", "MAYBE-SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
        declareFunction("possibly_initialize_all_somewhere_caches", "POSSIBLY-INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
        declareFunction("initialize_all_somewhere_caches", "INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
        declareFunction("clear_all_somewhere_caches", "CLEAR-ALL-SOMEWHERE-CACHES", 0, 0, false);
        declareFunction("recache_some_pred_assertion_somewhere", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
        declareFunction("somewhere_cached_preds", "SOMEWHERE-CACHED-PREDS", 0, 0, false);
        declareFunction("somewhere_cached_pred_p", "SOMEWHERE-CACHED-PRED-P", 1, 0, false);
        declareFunction("some_pred_assertion_somewhere_argnum", "SOME-PRED-ASSERTION-SOMEWHERE-ARGNUM", 1, 0, false);
        declareFunction("indexed_terms_with_some_pred_assertion_somewhere", "INDEXED-TERMS-WITH-SOME-PRED-ASSERTION-SOMEWHERE", 1, 1, false);
        declareFunction("inter_arg_result_isa_somewhere_cache", "INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE", 1, 0, false);
        declareFunction("inter_arg_result_isa_somewhereP", "INTER-ARG-RESULT-ISA-SOMEWHERE?", 2, 1, false);
        declareFunction("some_pred_assertion_somewhereP_internal", "SOME-PRED-ASSERTION-SOMEWHERE?-INTERNAL", 4, 0, false);
        declareFunction("check_somewhere_cache_argnum", "CHECK-SOMEWHERE-CACHE-ARGNUM", 2, 1, false);
        declareFunction("lookup_somewhere_set_for_pred", "LOOKUP-SOMEWHERE-SET-FOR-PRED", 2, 0, false);
        declareFunction("initialize_somewhere_cache", "INITIALIZE-SOMEWHERE-CACHE", 1, 0, false);
        declareFunction("recache_some_pred_assertion_somewhere_int", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE-INT", 2, 0, false);
        declareFunction("cache_some_pred_assertion_somewhere", "CACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
        declareFunction("valid_somewhere_cache_itemP", "VALID-SOMEWHERE-CACHE-ITEM?", 1, 0, false);
        declareFunction("some_pred_value_in_any_mt_with_argumentsP", "SOME-PRED-VALUE-IN-ANY-MT-WITH-ARGUMENTS?", 4, 0, false);
        declareFunction("somewhere_cache_unbuiltP", "SOMEWHERE-CACHE-UNBUILT?", 0, 0, false);
        declareFunction("rebuild_somewhere_cache", "REBUILD-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("dump_somewhere_cache_to_stream", "DUMP-SOMEWHERE-CACHE-TO-STREAM", 1, 0, false);
        declareFunction("load_somewhere_cache_from_stream", "LOAD-SOMEWHERE-CACHE-FROM-STREAM", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_somewhere_cache_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("some_pred_assertion_somewhereP", "SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
            declareFunction("maybe_some_pred_assertion_somewhereP", "MAYBE-SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
            declareFunction("possibly_initialize_all_somewhere_caches", "POSSIBLY-INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 1, false);
            declareFunction("initialize_all_somewhere_caches", "INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
            declareFunction("clear_all_somewhere_caches", "CLEAR-ALL-SOMEWHERE-CACHES", 0, 0, false);
            declareFunction("possibly_initialize_somewhere_cached_pred_argnum_dict", "POSSIBLY-INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false);
            declareFunction("initialize_somewhere_cached_pred_argnum_dict", "INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false);
            declareFunction("reclassify_somewhere_cached_preds", "RECLASSIFY-SOMEWHERE-CACHED-PREDS", 0, 0, false);
            declareFunction("recache_some_pred_assertion_somewhere", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
            declareFunction("somewhere_cached_preds", "SOMEWHERE-CACHED-PREDS", 0, 0, false);
            declareFunction("valid_somewhere_cached_preds", "VALID-SOMEWHERE-CACHED-PREDS", 0, 0, false);
            declareFunction("somewhere_cached_pred_p", "SOMEWHERE-CACHED-PRED-P", 1, 0, false);
            declareFunction("valid_somewhere_cached_pred_p", "VALID-SOMEWHERE-CACHED-PRED-P", 1, 0, false);
            declareFunction("some_pred_assertion_somewhere_argnum", "SOME-PRED-ASSERTION-SOMEWHERE-ARGNUM", 1, 0, false);
            declareFunction("indexed_terms_with_some_pred_assertion_somewhere", "INDEXED-TERMS-WITH-SOME-PRED-ASSERTION-SOMEWHERE", 1, 1, false);
            declareFunction("inter_arg_result_isa_somewhere_cache", "INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE", 1, 0, false);
            declareFunction("inter_arg_result_isa_somewhereP", "INTER-ARG-RESULT-ISA-SOMEWHERE?", 2, 1, false);
            declareFunction("use_somewhere_cacheP", "USE-SOMEWHERE-CACHE?", 0, 0, false);
            declareFunction("some_pred_assertion_somewhereP_internal", "SOME-PRED-ASSERTION-SOMEWHERE?-INTERNAL", 4, 0, false);
            declareFunction("check_somewhere_cache_argnum", "CHECK-SOMEWHERE-CACHE-ARGNUM", 2, 1, false);
            declareFunction("lookup_somewhere_set_for_pred", "LOOKUP-SOMEWHERE-SET-FOR-PRED", 2, 0, false);
            declareFunction("initialize_somewhere_cache", "INITIALIZE-SOMEWHERE-CACHE", 1, 0, false);
            declareFunction("recache_some_pred_assertion_somewhere_int", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE-INT", 2, 0, false);
            declareFunction("cache_some_pred_assertion_somewhere", "CACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
            declareFunction("valid_somewhere_cache_itemP", "VALID-SOMEWHERE-CACHE-ITEM?", 1, 0, false);
            declareFunction("somewhere_cache_unbuiltP", "SOMEWHERE-CACHE-UNBUILT?", 0, 0, false);
            declareFunction("rebuild_somewhere_cache", "REBUILD-SOMEWHERE-CACHE", 0, 0, false);
            declareFunction("dump_somewhere_cache_to_stream", "DUMP-SOMEWHERE-CACHE-TO-STREAM", 1, 0, false);
            declareFunction("load_somewhere_cache_from_stream", "LOAD-SOMEWHERE-CACHE-FROM-STREAM", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("possibly_initialize_all_somewhere_caches", "POSSIBLY-INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
            declareFunction("some_pred_value_in_any_mt_with_argumentsP", "SOME-PRED-VALUE-IN-ANY-MT-WITH-ARGUMENTS?", 4, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_somewhere_cache_file_Previous() {
        declareFunction("some_pred_assertion_somewhereP", "SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
        declareFunction("maybe_some_pred_assertion_somewhereP", "MAYBE-SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
        declareFunction("possibly_initialize_all_somewhere_caches", "POSSIBLY-INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 1, false);
        declareFunction("initialize_all_somewhere_caches", "INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
        declareFunction("clear_all_somewhere_caches", "CLEAR-ALL-SOMEWHERE-CACHES", 0, 0, false);
        declareFunction("possibly_initialize_somewhere_cached_pred_argnum_dict", "POSSIBLY-INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false);
        declareFunction("initialize_somewhere_cached_pred_argnum_dict", "INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false);
        declareFunction("reclassify_somewhere_cached_preds", "RECLASSIFY-SOMEWHERE-CACHED-PREDS", 0, 0, false);
        declareFunction("recache_some_pred_assertion_somewhere", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
        declareFunction("somewhere_cached_preds", "SOMEWHERE-CACHED-PREDS", 0, 0, false);
        declareFunction("valid_somewhere_cached_preds", "VALID-SOMEWHERE-CACHED-PREDS", 0, 0, false);
        declareFunction("somewhere_cached_pred_p", "SOMEWHERE-CACHED-PRED-P", 1, 0, false);
        declareFunction("valid_somewhere_cached_pred_p", "VALID-SOMEWHERE-CACHED-PRED-P", 1, 0, false);
        declareFunction("some_pred_assertion_somewhere_argnum", "SOME-PRED-ASSERTION-SOMEWHERE-ARGNUM", 1, 0, false);
        declareFunction("indexed_terms_with_some_pred_assertion_somewhere", "INDEXED-TERMS-WITH-SOME-PRED-ASSERTION-SOMEWHERE", 1, 1, false);
        declareFunction("inter_arg_result_isa_somewhere_cache", "INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE", 1, 0, false);
        declareFunction("inter_arg_result_isa_somewhereP", "INTER-ARG-RESULT-ISA-SOMEWHERE?", 2, 1, false);
        declareFunction("use_somewhere_cacheP", "USE-SOMEWHERE-CACHE?", 0, 0, false);
        declareFunction("some_pred_assertion_somewhereP_internal", "SOME-PRED-ASSERTION-SOMEWHERE?-INTERNAL", 4, 0, false);
        declareFunction("check_somewhere_cache_argnum", "CHECK-SOMEWHERE-CACHE-ARGNUM", 2, 1, false);
        declareFunction("lookup_somewhere_set_for_pred", "LOOKUP-SOMEWHERE-SET-FOR-PRED", 2, 0, false);
        declareFunction("initialize_somewhere_cache", "INITIALIZE-SOMEWHERE-CACHE", 1, 0, false);
        declareFunction("recache_some_pred_assertion_somewhere_int", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE-INT", 2, 0, false);
        declareFunction("cache_some_pred_assertion_somewhere", "CACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
        declareFunction("valid_somewhere_cache_itemP", "VALID-SOMEWHERE-CACHE-ITEM?", 1, 0, false);
        declareFunction("somewhere_cache_unbuiltP", "SOMEWHERE-CACHE-UNBUILT?", 0, 0, false);
        declareFunction("rebuild_somewhere_cache", "REBUILD-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("dump_somewhere_cache_to_stream", "DUMP-SOMEWHERE-CACHE-TO-STREAM", 1, 0, false);
        declareFunction("load_somewhere_cache_from_stream", "LOAD-SOMEWHERE-CACHE-FROM-STREAM", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_somewhere_cache_file_alt() {
        deflexical("*SOMEWHERE-CACHED-PREDS-TABLE*", listS($list_alt0, $list_alt1, bq_cons(kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), ONE_INTEGER), $list_alt2));
        deflexical("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*", NIL != boundp($some_pred_assertion_somewhere_cache$) ? ((SubLObject) ($some_pred_assertion_somewhere_cache$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*", $list_alt12);
        deflexical("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*", NIL != boundp($inter_arg_result_isa_somewhere_cache$) ? ((SubLObject) ($inter_arg_result_isa_somewhere_cache$.getGlobalValue())) : uninitialized());
        return NIL;
    }

    public static SubLObject init_somewhere_cache_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*USE-SOMEWHERE-CACHE?*", T);
            deflexical("*SOMEWHERE-CACHED-PREDS-TABLE*", listS($list0, new SubLObject[]{ $list1, $list2, $list3, $list4, $list5, $list6, $list7, $list8, $list9, $list10, $list11, $list12, $list13, $list14, $list15, $list16, $list17, $list18, $list19, $list20, $list21, $list22, $list23, $list24, $list25, $list26, $list27, $list28, bq_cons(kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), ONE_INTEGER), $list29 }));
            deflexical("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($some_pred_assertion_somewhere_cache$, $some_pred_assertion_somewhere_cache$, $UNINITIALIZED));
            deflexical("*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*", SubLTrampolineFile.maybeDefault($somewhere_cached_pred_argnum_dict$, $somewhere_cached_pred_argnum_dict$, $UNINITIALIZED));
            deflexical("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*", $list40);
            deflexical("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($inter_arg_result_isa_somewhere_cache$, $inter_arg_result_isa_somewhere_cache$, () -> misc_utilities.uninitialized()));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SOMEWHERE-CACHED-PREDS-TABLE*", listS($list_alt0, $list_alt1, bq_cons(kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), ONE_INTEGER), $list_alt2));
            deflexical("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*", NIL != boundp($some_pred_assertion_somewhere_cache$) ? ((SubLObject) ($some_pred_assertion_somewhere_cache$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*", $list_alt12);
            deflexical("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*", NIL != boundp($inter_arg_result_isa_somewhere_cache$) ? ((SubLObject) ($inter_arg_result_isa_somewhere_cache$.getGlobalValue())) : uninitialized());
        }
        return NIL;
    }

    public static SubLObject init_somewhere_cache_file_Previous() {
        defparameter("*USE-SOMEWHERE-CACHE?*", T);
        deflexical("*SOMEWHERE-CACHED-PREDS-TABLE*", listS($list0, new SubLObject[]{ $list1, $list2, $list3, $list4, $list5, $list6, $list7, $list8, $list9, $list10, $list11, $list12, $list13, $list14, $list15, $list16, $list17, $list18, $list19, $list20, $list21, $list22, $list23, $list24, $list25, $list26, $list27, $list28, bq_cons(kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), ONE_INTEGER), $list29 }));
        deflexical("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($some_pred_assertion_somewhere_cache$, $some_pred_assertion_somewhere_cache$, $UNINITIALIZED));
        deflexical("*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*", SubLTrampolineFile.maybeDefault($somewhere_cached_pred_argnum_dict$, $somewhere_cached_pred_argnum_dict$, $UNINITIALIZED));
        deflexical("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*", $list40);
        deflexical("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($inter_arg_result_isa_somewhere_cache$, $inter_arg_result_isa_somewhere_cache$, () -> misc_utilities.uninitialized()));
        return NIL;
    }

    public static SubLObject setup_somewhere_cache_file() {
        declare_defglobal($some_pred_assertion_somewhere_cache$);
        declare_defglobal($somewhere_cached_pred_argnum_dict$);
        declare_defglobal($inter_arg_result_isa_somewhere_cache$);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = cons(reader_make_constant_shell("argsIsa"), ONE_INTEGER);

    static private final SubLList $list_alt1 = cons(reader_make_constant_shell("argAndRestIsa"), ONE_INTEGER);

    private static SubLObject _constant_29_initializer() {
        return list(new SubLObject[]{ cons(reader_make_constant_shell("backchainRequired"), ONE_INTEGER), cons(reader_make_constant_shell("canonicalizerDirectiveForArg"), ONE_INTEGER), cons(reader_make_constant_shell("canonicalizerDirectiveForAllArgs"), ONE_INTEGER), cons(reader_make_constant_shell("canonicalizerDirectiveForArgAndRest"), ONE_INTEGER), cons(reader_make_constant_shell("evaluateAtEL"), ONE_INTEGER), cons(reader_make_constant_shell("evaluateImmediately"), ONE_INTEGER), cons(reader_make_constant_shell("genlPreds"), TWO_INTEGER), cons(reader_make_constant_shell("typedGenlPreds"), ONE_INTEGER), cons(reader_make_constant_shell("genlInverse"), TWO_INTEGER), cons(reader_make_constant_shell("functionCorrespondingPredicate"), ONE_INTEGER), cons(reader_make_constant_shell("functionCorrespondingPredicate-Canonical"), TWO_INTEGER), cons(reader_make_constant_shell("highlyRelevantTerm"), ONE_INTEGER), cons(reader_make_constant_shell("interArgResultIsa"), ONE_INTEGER), cons(reader_make_constant_shell("interArgResultGenl"), THREE_INTEGER), cons(reader_make_constant_shell("interArgGenl1-2"), ONE_INTEGER), cons(reader_make_constant_shell("interArgGenl2-1"), ONE_INTEGER), cons(reader_make_constant_shell("interArgGenl2-4"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotGenl1-2"), ONE_INTEGER), cons(reader_make_constant_shell("interArgIsaGenl1-2"), ONE_INTEGER), cons(reader_make_constant_shell("interArgIsaGenl2-1"), ONE_INTEGER), cons(reader_make_constant_shell("interArgIsaGenl2-3"), ONE_INTEGER), cons(reader_make_constant_shell("interArgIsaGenl3-2"), ONE_INTEGER), cons(reader_make_constant_shell("interArgGenlIsa2-1"), ONE_INTEGER), cons(reader_make_constant_shell("interArgDifferent"), ONE_INTEGER), cons(reader_make_constant_shell("interArgReln"), ONE_INTEGER), cons(reader_make_constant_shell("irrelevantTerm"), ONE_INTEGER), cons(reader_make_constant_shell("modalInArg"), ONE_INTEGER), cons(reader_make_constant_shell("notAssertible"), ONE_INTEGER), cons(reader_make_constant_shell("relationAllExists"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllInstance"), ONE_INTEGER), cons(reader_make_constant_shell("relationInstanceAll"), ONE_INTEGER), cons(reader_make_constant_shell("rewriteOf"), TWO_INTEGER), cons(reader_make_constant_shell("scopingArg"), ONE_INTEGER), cons(reader_make_constant_shell("skolemizeForward"), ONE_INTEGER), cons(reader_make_constant_shell("typeLevelVersionInArg"), ONE_INTEGER), cons(reader_make_constant_shell("relationAllExistsCount"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsMany"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsMin"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsUnique"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsSame"), TWO_INTEGER), cons(reader_make_constant_shell("relationAllExistsAndOnly"), TWO_INTEGER), cons(reader_make_constant_shell("reflexiveOn"), ONE_INTEGER), cons(reader_make_constant_shell("requiredActorSlots-Unique"), ONE_INTEGER), cons(reader_make_constant_shell("collRelation"), TWO_INTEGER), cons(reader_make_constant_shell("collRelationUnique"), TWO_INTEGER), cons(reader_make_constant_shell("requiredActorSlots"), ONE_INTEGER), cons(reader_make_constant_shell("rolesForEventType"), ONE_INTEGER), cons(reader_make_constant_shell("keRequirementPreds"), ONE_INTEGER), cons(reader_make_constant_shell("roleTypesForEventType"), ONE_INTEGER), cons(reader_make_constant_shell("requiredArg1Pred"), ONE_INTEGER), cons(reader_make_constant_shell("preferredSubjectRole"), ONE_INTEGER), cons(reader_make_constant_shell("subjectRoles"), ONE_INTEGER), cons(reader_make_constant_shell("preferredIndirectObjectRole"), ONE_INTEGER), cons(reader_make_constant_shell("indirectObjectRoles"), ONE_INTEGER), cons(reader_make_constant_shell("preferredDirectObjectRole"), ONE_INTEGER), cons(reader_make_constant_shell("directObjectRoles"), ONE_INTEGER), cons(reader_make_constant_shell("posForms"), ONE_INTEGER), cons(reader_make_constant_shell("posBaseForms"), ONE_INTEGER), cons(reader_make_constant_shell("mtTimeIndex"), ONE_INTEGER), cons(reader_make_constant_shell("genStringAssertion-Terse"), TWO_INTEGER), cons(reader_make_constant_shell("genStringAssertion-Precise"), TWO_INTEGER), cons(reader_make_constant_shell("genStringAssertion"), TWO_INTEGER), cons(reader_make_constant_shell("dispreferredLexification"), TWO_INTEGER), cons(reader_make_constant_shell("predTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("assertionTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("ruleTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("mtTrivialForJustificationParaphrase"), ONE_INTEGER), cons(reader_make_constant_shell("ruleTrivialForSentenceImplicationConditions"), ONE_INTEGER), cons(reader_make_constant_shell("salientTermImagePathname"), ONE_INTEGER), cons(reader_make_constant_shell("formulaTemplateHasArgumentPositionInformation"), ONE_INTEGER), cons(reader_make_constant_shell("except"), ONE_INTEGER), cons(reader_make_constant_shell("exceptMt"), ONE_INTEGER), cons(reader_make_constant_shell("assertiveWFFRule"), ONE_INTEGER), cons(reader_make_constant_shell("forwardReificationRule"), TWO_INTEGER), cons(reader_make_constant_shell("universalForwardReificationRule"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa1-2"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa1-3"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa1-4"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa1-5"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa2-1"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa2-3"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa2-4"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa2-5"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa3-4"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa3-5"), ONE_INTEGER), cons(reader_make_constant_shell("interArgNotIsa4-5"), ONE_INTEGER), cons(reader_make_constant_shell("singleEntryFormatInArgs"), ONE_INTEGER), cons(reader_make_constant_shell("wffConstraintMt"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentAsserted"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentAssertedForValueInArg"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentEnumerable"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentEnumerableForArg"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentEnumerableForValueInArg"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentDecidable"), ONE_INTEGER), cons(reader_make_constant_shell("completeExtentDecidableForValueInArg"), ONE_INTEGER), cons(reader_make_constant_shell("transitiveViaArg"), ONE_INTEGER), cons(reader_make_constant_shell("transitiveViaArgInverse"), ONE_INTEGER), cons(reader_make_constant_shell("conservativeViaArg"), ONE_INTEGER), cons(reader_make_constant_shell("conservativeViaArgInverse"), ONE_INTEGER), cons(reader_make_constant_shell("functionalInArgs"), ONE_INTEGER), cons(reader_make_constant_shell("strictlyFunctionalInArgs"), ONE_INTEGER), cons(reader_make_constant_shell("parsingConflateTo"), ONE_INTEGER), cons(reader_make_constant_shell("qaConflateTo"), ONE_INTEGER), cons(reader_make_constant_shell("qaConflateToCompletely"), ONE_INTEGER), cons(reader_make_constant_shell("terseDisambiguationString"), ONE_INTEGER), cons(reader_make_constant_shell("denotation"), FOUR_INTEGER), cons(reader_make_constant_shell("headMedialString"), FIVE_INTEGER), cons(reader_make_constant_shell("compoundString"), FOUR_INTEGER), cons(reader_make_constant_shell("hyphenString"), FOUR_INTEGER), cons(reader_make_constant_shell("multiWordString"), FOUR_INTEGER), cons(reader_make_constant_shell("preferredNameString"), ONE_INTEGER), cons(reader_make_constant_shell("nameString"), ONE_INTEGER), cons(reader_make_constant_shell("placeName-WithRegion"), ONE_INTEGER), cons(reader_make_constant_shell("placeName-WithRegionAbbreviation"), ONE_INTEGER), cons(reader_make_constant_shell("titleOfWork"), ONE_INTEGER), cons(reader_make_constant_shell("movieTitleString"), ONE_INTEGER), cons(reader_make_constant_shell("gospelName-Short"), ONE_INTEGER), cons(reader_make_constant_shell("brandNameOfProductType"), ONE_INTEGER), cons(reader_make_constant_shell("businessName-WithTickerSymbol"), ONE_INTEGER), cons(reader_make_constant_shell("organizationName-Standard"), ONE_INTEGER), cons(reader_make_constant_shell("organizationName-Official"), ONE_INTEGER), cons(reader_make_constant_shell("familyName"), ONE_INTEGER), cons(reader_make_constant_shell("lastName"), ONE_INTEGER), cons(reader_make_constant_shell("placeName-ShortForm"), ONE_INTEGER), cons(reader_make_constant_shell("countryName-ShortForm"), ONE_INTEGER), cons(reader_make_constant_shell("placeName-Standard"), ONE_INTEGER), cons(reader_make_constant_shell("countryName-LongForm"), ONE_INTEGER), cons(reader_make_constant_shell("chemicalFormulaString"), ONE_INTEGER), cons(reader_make_constant_shell("fullName"), ONE_INTEGER), cons(reader_make_constant_shell("alias"), ONE_INTEGER), cons(reader_make_constant_shell("definiteDescriptions"), ONE_INTEGER), cons(reader_make_constant_shell("acronymString"), ONE_INTEGER), cons(reader_make_constant_shell("initialismString"), ONE_INTEGER), cons(reader_make_constant_shell("initialsString"), ONE_INTEGER), cons(reader_make_constant_shell("pseudonym"), ONE_INTEGER), cons(reader_make_constant_shell("countryCodeTrigraph"), ONE_INTEGER), cons(reader_make_constant_shell("atomicSymbol"), ONE_INTEGER), cons(reader_make_constant_shell("codeMapping"), THREE_INTEGER), cons(reader_make_constant_shell("applicableWhenTypedOnlyWhenSpecialization"), THREE_INTEGER), cons(reader_make_constant_shell("mostNotableIsa"), ONE_INTEGER), cons(reader_make_constant_shell("mostNotableGenls"), ONE_INTEGER), cons(reader_make_constant_shell("facetOfCollectionBasedOnBinaryPred"), ONE_INTEGER), cons(reader_make_constant_shell("facetOfCollectionBasedOnBinaryPredInverse"), ONE_INTEGER), cons(reader_make_constant_shell("facetOfCollectionBasedOnTypeBinaryPred"), ONE_INTEGER), cons(reader_make_constant_shell("facetOfCollectionBasedOnTypeBinaryPredInverse"), ONE_INTEGER), cons(reader_make_constant_shell("teamSeed"), TWO_INTEGER), cons(reader_make_constant_shell("denotesArgInReln"), TWO_INTEGER), cons(reader_make_constant_shell("classificationSystemOf-Focally"), TWO_INTEGER), cons(reader_make_constant_shell("genlMt-Vocabulary"), ONE_INTEGER), cons(reader_make_constant_shell("marketTypeDefiningProductType"), TWO_INTEGER), cons(reader_make_constant_shell("collectionDifference"), TWO_INTEGER), cons(reader_make_constant_shell("characteristicActivityTypeOfPersonType-Frequently"), TWO_INTEGER), cons(reader_make_constant_shell("medicalFindingTypeOfType"), ONE_INTEGER), cons(reader_make_constant_shell("medicalDiagnosisTypeOfType"), ONE_INTEGER), cons(reader_make_constant_shell("suppressFacetInstancesFromTaxonomy"), TWO_INTEGER), cons(reader_make_constant_shell("quantifiedBinaryPredicateForPredWithMacro"), THREE_INTEGER), cons(reader_make_constant_shell("verbSemTransTemplate"), ONE_INTEGER), cons(reader_make_constant_shell("evaluationTypeDirectEvalueeType"), ONE_INTEGER), cons(reader_make_constant_shell("allSubCollectionsAreInstancesOf"), ONE_INTEGER), cons(reader_make_constant_shell("typeDeterminesValueOfArgInReln"), THREE_INTEGER), cons(reader_make_constant_shell("hypothesisLevelStrategyForPredAndArgs"), TWO_INTEGER), cons(reader_make_constant_shell("sourceFixedSemanticValueForRelationArg"), THREE_INTEGER), cons(reader_make_constant_shell("genlRules"), ONE_INTEGER), cons(reader_make_constant_shell("disallowMeaningSentencesForUnboundPredicates"), ONE_INTEGER), cons(reader_make_constant_shell("hypotheticalTerm"), ONE_INTEGER), cons(reader_make_constant_shell("predNotAllowedInGeneralizedQueryForTheSetOf"), ONE_INTEGER), cons(reader_make_constant_shell("decontextualizedPredicate"), ONE_INTEGER), cons(reader_make_constant_shell("decontextualizedCollection"), ONE_INTEGER), cons(reader_make_constant_shell("predicateConventionMt"), ONE_INTEGER), cons(reader_make_constant_shell("collectionConventionMt"), ONE_INTEGER), cons(reader_make_constant_shell("quotedArgument"), ONE_INTEGER), cons(reader_make_constant_shell("inverseFunctions"), ONE_INTEGER), cons(reader_make_constant_shell("genlPredsWRTArgs"), TWO_INTEGER) });
    }

    public static final SubLObject $list_alt2 = com.cyc.cycjava.cycl.somewhere_cache._constant_2_initializer();

    static private final SubLSymbol $sym6$VALID_SOMEWHERE_CACHE_ITEM_ = makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");

    static private final SubLList $list_alt10 = cons(makeSymbol("PRED"), makeSymbol("ARGNUM"));

    static private final SubLList $list_alt12 = cons(makeSymbol("RECACHE-SOME-PRED-ASSERTION-SOMEWHERE"), reader_make_constant_shell("UniversalVocabularyMt"));

    static private final SubLSymbol $sym13$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    static private final SubLString $str_alt17$somewhere_cache_argnum_mismatch_f = makeString("somewhere-cache argnum mismatch for ~s: ~s vs. ~s");

    @Override
    public void declareFunctions() {
        declare_somewhere_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_somewhere_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_somewhere_cache_file();
    }

    static {
    }
}

/**
 * Total time: 266 ms
 */
