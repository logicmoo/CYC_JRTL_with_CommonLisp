/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cardinality_estimates.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cycl_grammar.*;
import static com.cyc.cycjava.cycl.cycl_variables.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.fort_types_interface.*;
import static com.cyc.cycjava.cycl.memoization_state.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      THCL
 * source file: /cyc/top/cycl/thcl.lisp
 * created:     2019/07/03 17:38:40
 */
public final class thcl extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new thcl();

 public static final String myName = "com.cyc.cycjava.cycl.thcl";


    // defparameter
    /**
     * All THCL constants must have generality estimates less than or equal to this.
     */
    @LispMethod(comment = "All THCL constants must have generality estimates less than or equal to this.\ndefparameter")
    private static final SubLSymbol $thcl_generality_cutoff$ = makeSymbol("*THCL-GENERALITY-CUTOFF*");

    // defparameter
    // All THCL constants must be quoted instances of this collection.
    /**
     * All THCL constants must be quoted instances of this collection.
     */
    @LispMethod(comment = "All THCL constants must be quoted instances of this collection.\ndefparameter")
    private static final SubLSymbol $thcl_kb_subset_collection$ = makeSymbol("*THCL-KB-SUBSET-COLLECTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $thcl_pred_argument_types_for_non_definitional_preds$ = makeSymbol("*THCL-PRED-ARGUMENT-TYPES-FOR-NON-DEFINITIONAL-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fort_passes_cached_thcl_testsP_caching_state$ = makeSymbol("*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $thcl_filter_collections$ = makeSymbol("*THCL-FILTER-COLLECTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $thcl_nart_filter_collections$ = makeSymbol("*THCL-NART-FILTER-COLLECTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $thcl_quoted_filter_collections$ = makeSymbol("*THCL-QUOTED-FILTER-COLLECTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $thcl_quoted_filter_exceptions$ = makeSymbol("*THCL-QUOTED-FILTER-EXCEPTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $thcl_genls_filter_collections$ = makeSymbol("*THCL-GENLS-FILTER-COLLECTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $random_thcl_assertion_mt$ = makeSymbol("*RANDOM-THCL-ASSERTION-MT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ke_irrelevant_termP_via_inference_caching_state$ = makeSymbol("*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $clarifying_collectionP_caching_state$ = makeSymbol("*CLARIFYING-COLLECTION?-CACHING-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("FORT"), makeSymbol("&KEY"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE = makeSymbol("DO-THCL-FORTS-FROM-RKF-IRRELEVANCE-CACHE");

    private static final SubLSymbol DO_FORTS = makeSymbol("DO-FORTS");

    static private final SubLSymbol $sym7$THCL_FORT_ = makeSymbol("THCL-FORT?");

    static private final SubLList $list9 = list(makeSymbol("FWHEN-FEATURE"), makeKeyword("CYC-RKF"), list(makeSymbol("RKF-IRRELEVANT-CACHE-SUPPORTS-THCL?")));

    static private final SubLList $list12 = list(list(makeSymbol("FORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $thcl_forts_by_fiat$ = makeSymbol("*THCL-FORTS-BY-FIAT*");

    static private final SubLList $list16 = list(makeSymbol("*THCL-FORTS-BY-FIAT*"));

    static private final SubLList $list17 = list(list(makeSymbol("MAYBE-FORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol EASILY_UNDERSTOOD_BY_HUMANS = makeSymbol("EASILY-UNDERSTOOD-BY-HUMANS");

    static private final SubLString $str21$_is_a_THCL_FORT_by_fiat__cf___THC = makeString(" is a THCL FORT by fiat (cf. *THCL-FORTS-BY-FIAT*)");

    static private final SubLString $str22$_is_not_a_FORT_ = makeString(" is not a FORT.");

    static private final SubLString $$$RKF_irrelevance_cache_says_ = makeString("RKF irrelevance cache says ");

    static private final SubLString $str24$_is_not_THCL_ = makeString(" is not THCL.");

    private static final SubLSymbol COMPUTE_THCL_STATUS_OF_FORT = makeSymbol("COMPUTE-THCL-STATUS-OF-FORT");

    private static final SubLString $$$_is_a_predicate = makeString(" is a predicate");

    private static final SubLString $$$_is_a_functor = makeString(" is a functor");

    private static final SubLString $$$_is_a_logical_operator = makeString(" is a logical operator");

    private static final SubLString $$$_is_a_microtheory = makeString(" is a microtheory");

    private static final SubLString $$$Allowing_ = makeString("Allowing ");

    private static final SubLString $str31$__because_it_is_a_ClarifyingColle = makeString(", because it is a ClarifyingCollectionType");

    private static final SubLString $str32$_is_too_general__generality___ = makeString(" is too general (generality = ");

    private static final SubLString $str33$__vs_cutoff_of_ = makeString(", vs cutoff of ");

    private static final SubLString $str34$_ = makeString(")");

    private static final SubLString $$$_fails_the_THCL_KB_subset_test = makeString(" fails the THCL KB subset test");

    private static final SubLString $$$_fails_a_cached_test = makeString(" fails a cached test");

    private static final SubLString $str37$Sentence_arity_is_less_than_2____ = makeString("Sentence arity is less than 2:~% ~S");

    private static final SubLString $str38$Sentence_uses_a_function_and_its_ = makeString("Sentence uses a function and its corresponding predicate:~% ~S");



    private static final SubLString $str40$Non_THCL_arg___S = makeString("Non-THCL arg: ~S");

    private static final SubLList $list41 = list(reader_make_constant_shell("CapabilityPredicate"), reader_make_constant_shell("IncapabilityPredicate"));



    private static final SubLObject $const43$QuantificationalRuleMacroPredicat = reader_make_constant_shell("QuantificationalRuleMacroPredicate-Canonical");



    private static final SubLSymbol FUNCTIONS_CORRESPONDING_TO_PREDICATE = makeSymbol("FUNCTIONS-CORRESPONDING-TO-PREDICATE");



    private static final SubLSymbol $sym47$_FN = makeSymbol("?FN");

    private static final SubLObject $const48$functionCorrespondingPredicate_Ge = reader_make_constant_shell("functionCorrespondingPredicate-Generic");

    private static final SubLList $list49 = list(makeSymbol("?N"));

    private static final SubLList $list50 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));



    private static final SubLString $str52$_S_is_RKF_irrelevant_in___BaseKB_ = makeString("~S is RKF-irrelevant in #$BaseKB.");



    private static final SubLString $str54$_S_is_an___IntermediateVocabPredi = makeString("~S is an #$IntermediateVocabPredicate.");



    private static final SubLSymbol $sym56$GENL_ = makeSymbol("GENL?");

    static private final SubLList $list57 = list(reader_make_constant_shell("evaluate"));

    private static final SubLString $str58$_S_has_a_quoted___CycLTerm_argume = makeString("~S has a quoted #$CycLTerm argument.");

    private static final SubLList $list59 = list(reader_make_constant_shell("BinaryRolePredicate"), reader_make_constant_shell("VectorOrQuantitySlot"), reader_make_constant_shell("KindLevelPredicate"), reader_make_constant_shell("CapabilityPredicate"));

    private static final SubLSymbol $sym60$NON_THCL_ARG_ = makeSymbol("NON-THCL-ARG?");



    private static final SubLString $str62$Allowing__S_as_arg_of_non_definit = makeString("Allowing ~S as arg of non-definitional predicate ~S");



    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $str65$Allowing__S_as_arg_of___genlPreds = makeString("Allowing ~S as arg of #$genlPreds");

    private static final SubLString $str66$Non_thcl_arg___S = makeString("Non-thcl arg: ~S");

    private static final SubLSymbol $sym67$FORT_PASSES_CACHED_THCL_TESTS_ = makeSymbol("FORT-PASSES-CACHED-THCL-TESTS?");

    private static final SubLSymbol $sym68$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_ = makeSymbol("*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*");

    private static final SubLList $list69 = list(new SubLObject[]{ reader_make_constant_shell("DocumentationConstant"), reader_make_constant_shell("Format"), reader_make_constant_shell("ComputerCode"), reader_make_constant_shell("CycLQuerySpecification"), reader_make_constant_shell("Assignment-Specification"), reader_make_constant_shell("Allotment"), reader_make_constant_shell("Evaluating"), reader_make_constant_shell("KEInteractionResource"), reader_make_constant_shell("KBContentTest"), reader_make_constant_shell("CharacterString"), reader_make_constant_shell("ComputerVulnerabilityReport-CW"), reader_make_constant_shell("BugReport"), reader_make_constant_shell("BugzillaBugReportType"), reader_make_constant_shell("Allotment"), reader_make_constant_shell("WordNetSynset"), reader_make_constant_shell("DealingWithAStringInNounLearnerTool"), reader_make_constant_shell("SoftwareAgentCommunicating"), reader_make_constant_shell("KBContentTest"), reader_make_constant_shell("CoaDiagramObject"), reader_make_constant_shell("ReferenceWorkEntry") });

    private static final SubLList $list70 = list(reader_make_constant_shell("DocumentationConstant"), reader_make_constant_shell("ImplementationConstant"), reader_make_constant_shell("IndexicalConcept"), reader_make_constant_shell("IndeterminateTerm"), reader_make_constant_shell("UMLFORT"));

    private static final SubLList $list71 = list(reader_make_constant_shell("Now"));

    private static final SubLList $list72 = list(reader_make_constant_shell("RelationalStructure"), reader_make_constant_shell("Set-Mathematical"), reader_make_constant_shell("FormulaTemplate"), reader_make_constant_shell("Relation"), reader_make_constant_shell("Microtheory"), reader_make_constant_shell("CycLExpression"));



    private static final SubLString $str74$_S_is_a___highlyRelevantTerm__so_ = makeString("~S is a #$highlyRelevantTerm, so not filtering...");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLString $str76$_S_is_an_instance_of____S = makeString("~S is an instance of~% ~S");

    private static final SubLString $str77$_S_is_a_NART_and_is_an_instance_o = makeString("~S is a NART and is an instance of one of~% ~S");

    private static final SubLString $str78$_S_is_a_lexical_word = makeString("~S is a lexical word");

    private static final SubLString $str79$_S_is_a_quoted_instance_of_one_of = makeString("~S is a quoted instance of one of~% ~S");

    private static final SubLList $list80 = list(reader_make_constant_shell("BUTLERAgent"));

    private static final SubLString $str81$_S_was_created_by__S = makeString("~S was created by ~S");



    private static final SubLString $str83$_S_is_either_a___CollectionType_o = makeString("~S is either a #$CollectionType or a spec of one of~% ~S");

    private static final SubLObject $const84$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric");

    private static final SubLSymbol $sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE = makeSymbol("KE-IRRELEVANT-TERM?-VIA-INFERENCE");



    private static final SubLSymbol $sym87$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_ = makeSymbol("*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLSymbol $sym89$CLARIFYING_COLLECTION_ = makeSymbol("CLARIFYING-COLLECTION?");



    private static final SubLSymbol $sym91$_CLARIFYING_COLLECTION__CACHING_STATE_ = makeSymbol("*CLARIFYING-COLLECTION?-CACHING-STATE*");

    private static final SubLSymbol $sym92$CLEAR_CLARIFYING_COLLECTION_ = makeSymbol("CLEAR-CLARIFYING-COLLECTION?");

    // Definitions
    /**
     * Iterate over the THCL FORTs, executing BODY once with FORT bound to each.
     */
    @LispMethod(comment = "Iterate over the THCL FORTs, executing BODY once with FORT bound to each.")
    public static final SubLObject do_thcl_forts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fort = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    fort = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject message_tail = property_list_member($MESSAGE, current);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_supports_thclP()) {
                                    return listS(DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE, list(fort, message), append(body, NIL));
                                } else {
                                    return list(DO_FORTS, list(fort, message), listS(PWHEN, list($sym7$THCL_FORT_, fort), append(body, NIL)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    /**
     * Iterate over the THCL FORTs, executing BODY once with FORT bound to each.
     */
    @LispMethod(comment = "Iterate over the THCL FORTs, executing BODY once with FORT bound to each.")
    public static SubLObject do_thcl_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        fort = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_supports_thclP()) {
            return listS(DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE, list(fort, message), append(body, NIL));
        }
        return list(DO_FORTS, list(fort, message), listS(PWHEN, list($sym7$THCL_FORT_, fort), append(body, NIL)));
    }

    /**
     * Iterate over the THCL FORTs, executing BODY once with FORT bound to each.
     */
    @LispMethod(comment = "Iterate over the THCL FORTs, executing BODY once with FORT bound to each.")
    public static final SubLObject do_thcl_forts_2_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fort = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    fort = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_2, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject message_tail = property_list_member($MESSAGE, current);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(PCOND, list($list_alt9, listS(DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE, list(fort, message), append(body, NIL))), list(list(STRINGP, message), list(DO_FORTS, list(fort, message), listS(PWHEN, list($sym7$THCL_FORT_, fort), append(body, NIL)))), list(T, list(DO_FORTS, list(fort), listS(PWHEN, list($sym7$THCL_FORT_, fort), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over the THCL FORTs, executing BODY once with FORT bound to each.
     */
    @LispMethod(comment = "Iterate over the THCL FORTs, executing BODY once with FORT bound to each.")
    public static SubLObject do_thcl_forts_2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        fort = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$2, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PCOND, list($list9, listS(DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE, list(fort, message), append(body, NIL))), list(list(STRINGP, message), list(DO_FORTS, list(fort, message), listS(PWHEN, list($sym7$THCL_FORT_, fort), append(body, NIL)))), list(T, list(DO_FORTS, list(fort), listS(PWHEN, list($sym7$THCL_FORT_, fort), append(body, NIL)))));
    }

    public static final SubLObject with_thcl_fort_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fort = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    fort = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($thcl_forts_by_fiat$, listS(CONS, fort, $list_alt16))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt12);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_thcl_fort(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        fort = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($thcl_forts_by_fiat$, listS(CONS, fort, $list16))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list12);
        return NIL;
    }

    public static final SubLObject possibly_with_thcl_fort_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject maybe_fort = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    maybe_fort = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($thcl_forts_by_fiat$, listS(FIF, list(FORT_P, maybe_fort), listS(CONS, maybe_fort, $list_alt16), $list_alt16))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt17);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_thcl_fort(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject maybe_fort = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        maybe_fort = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($thcl_forts_by_fiat$, listS(FIF, list(FORT_P, maybe_fort), listS(CONS, maybe_fort, $list16), $list16))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list17);
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT a good Cyc constant for conscious-level human thought?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT a good Cyc constant for conscious-level human thought?")
    public static final SubLObject thcl_constantP_alt(SubLObject v_object, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != com.cyc.cycjava.cycl.thcl.thcl_fortP(v_object, warnP)));
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT a good Cyc constant for conscious-level human thought?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT a good Cyc constant for conscious-level human thought?")
    public static SubLObject thcl_constantP(final SubLObject v_object, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != thcl_fortP(v_object, warnP)));
    }

    public static final SubLObject easily_understood_by_humans_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.thcl.thcl_fortP(v_object, UNPROVIDED);
    }

    public static SubLObject easily_understood_by_humans(final SubLObject v_object) {
        return thcl_fortP(v_object, UNPROVIDED);
    }

    public static final SubLObject not_thcl_fortP_alt(SubLObject obj, SubLObject mt, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        return makeBoolean(NIL == com.cyc.cycjava.cycl.thcl.thcl_fortP(obj, warnP));
    }

    public static SubLObject not_thcl_fortP(final SubLObject obj, final SubLObject mt, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        return makeBoolean(NIL == thcl_fortP(obj, warnP));
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT a good candidate for conscious-level human thought?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT a good candidate for conscious-level human thought?")
    public static final SubLObject thcl_fortP_alt(SubLObject v_object, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thcl_fortP = NIL;
                SubLObject reason = NIL;
                if (NIL != list_utilities.member_equalP(v_object, $thcl_forts_by_fiat$.getDynamicValue(thread))) {
                    if (NIL != warnP) {
                        reason = cconcatenate(format_nil.format_nil_s_no_copy(v_object), $str_alt21$_is_a_THCL_FORT_by_fiat__cf___THC);
                    }
                    thcl_fortP = T;
                } else {
                    if (NIL == forts.fort_p(v_object)) {
                        if (NIL != warnP) {
                            reason = cconcatenate(format_nil.format_nil_s_no_copy(v_object), $str_alt22$_is_not_a_FORT_);
                        }
                    } else {
                        if (NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_supports_thclP()) {
                            if (NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_thclP(v_object)) {
                                thcl_fortP = T;
                            } else {
                                if (NIL != warnP) {
                                    reason = cconcatenate($str_alt23$RKF_irrelevance_cache_says_, new SubLObject[]{ format_nil.format_nil_s_no_copy(v_object), $str_alt24$_is_not_THCL_ });
                                }
                            }
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject thcl_fortP_3 = com.cyc.cycjava.cycl.thcl.compute_thcl_status_of_fort(v_object, warnP, NIL);
                                SubLObject reason_4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                thcl_fortP = thcl_fortP_3;
                                reason = reason_4;
                            }
                        }
                    }
                }
                if ((NIL != warnP) && reason.isString()) {
                    Errors.warn(reason);
                }
                return thcl_fortP;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT a good candidate for conscious-level human thought?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT a good candidate for conscious-level human thought?")
    public static SubLObject thcl_fortP(final SubLObject v_object, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject thcl_fortP = NIL;
        SubLObject reason = NIL;
        if (NIL != list_utilities.member_equalP(v_object, $thcl_forts_by_fiat$.getDynamicValue(thread))) {
            if (NIL != warnP) {
                reason = cconcatenate(format_nil.format_nil_s_no_copy(v_object), $str21$_is_a_THCL_FORT_by_fiat__cf___THC);
            }
            thcl_fortP = T;
        } else
            if (NIL == forts.fort_p(v_object)) {
                if (NIL != warnP) {
                    reason = cconcatenate(format_nil.format_nil_s_no_copy(v_object), $str22$_is_not_a_FORT_);
                }
            } else
                if (NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_supports_thclP()) {
                    if (NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_thclP(v_object)) {
                        thcl_fortP = T;
                    } else
                        if (NIL != warnP) {
                            reason = cconcatenate($$$RKF_irrelevance_cache_says_, new SubLObject[]{ format_nil.format_nil_s_no_copy(v_object), $str24$_is_not_THCL_ });
                        }

                } else {
                    thread.resetMultipleValues();
                    final SubLObject thcl_fortP_$3 = compute_thcl_status_of_fort(v_object, warnP, NIL, UNPROVIDED);
                    final SubLObject reason_$4 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    thcl_fortP = thcl_fortP_$3;
                    reason = reason_$4;
                }


        if ((NIL != warnP) && reason.isString()) {
            Errors.warn(reason);
        }
        return thcl_fortP;
    }

    public static SubLObject compute_thcl_status_of_fort_internal(final SubLObject fort, final SubLObject warnP, SubLObject assume_ke_relevantP, SubLObject generality_cutoff) {
        if (assume_ke_relevantP == UNPROVIDED) {
            assume_ke_relevantP = NIL;
        }
        if (generality_cutoff == UNPROVIDED) {
            generality_cutoff = $thcl_generality_cutoff$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject thcl_fortP = NIL;
        SubLObject reason = NIL;
        if (NIL != fort_types_interface.predicate_p(fort)) {
            if (NIL != warnP) {
                reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $$$_is_a_predicate);
            }
        } else
            if (NIL != fort_types_interface.functor_p(fort)) {
                if (NIL != warnP) {
                    reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $$$_is_a_functor);
                }
            } else
                if (NIL != cycl_grammar.cycl_logical_operator_p(fort)) {
                    if (NIL != warnP) {
                        reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $$$_is_a_logical_operator);
                    }
                } else
                    if (NIL != fort_types_interface.microtheory_p(fort)) {
                        if (NIL != warnP) {
                            reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $$$_is_a_microtheory);
                        }
                    } else
                        if (NIL != clarifying_collectionP(fort, UNPROVIDED)) {
                            thcl_fortP = T;
                            if (NIL != warnP) {
                                reason = cconcatenate($$$Allowing_, new SubLObject[]{ format_nil.format_nil_s_no_copy(fort), $str31$__because_it_is_a_ClarifyingColle });
                            }
                        } else
                            if (cardinality_estimates.generality_estimate(fort).numG(generality_cutoff)) {
                                if (NIL != warnP) {
                                    reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), new SubLObject[]{ $str32$_is_too_general__generality___, format_nil.format_nil_s_no_copy(cardinality_estimates.generality_estimate(fort)), $str33$__vs_cutoff_of_, format_nil.format_nil_s_no_copy($thcl_generality_cutoff$.getDynamicValue(thread)), $str34$_ });
                                }
                            } else
                                if (NIL == fort_passes_thcl_kb_subset_testP(fort)) {
                                    if (NIL != warnP) {
                                        reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $$$_fails_the_THCL_KB_subset_test);
                                    }
                                } else
                                    if (NIL == fort_passes_cached_thcl_testsP(fort)) {
                                        if (NIL != warnP) {
                                            reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $$$_fails_a_cached_test);
                                            thcl_filter_fortP(fort, T);
                                        }
                                    } else {
                                        thcl_fortP = T;
                                    }







        return values(thcl_fortP, reason);
    }

    public static final SubLObject compute_thcl_status_of_fort(SubLObject fort, SubLObject warnP, SubLObject assume_ke_relevantP) {
        if (assume_ke_relevantP == UNPROVIDED) {
            assume_ke_relevantP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            {
                SubLObject thcl_fortP = NIL;
                SubLObject reason = NIL;
                if (NIL != predicate_p(fort)) {
                    if (NIL != warnP) {
                        reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $str_alt25$_is_a_predicate);
                    }
                } else {
                    if (NIL != functor_p(fort)) {
                        if (NIL != warnP) {
                            reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $str_alt26$_is_a_functor);
                        }
                    } else {
                        if (NIL != cycl_logical_operator_p(fort)) {
                            if (NIL != warnP) {
                                reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $str_alt27$_is_a_logical_operator);
                            }
                        } else {
                            if (NIL != microtheory_p(fort)) {
                                if (NIL != warnP) {
                                    reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $str_alt28$_is_a_microtheory);
                                }
                            } else {
                                if ((NIL == assume_ke_relevantP) && (NIL != com.cyc.cycjava.cycl.thcl.ke_irrelevant_termP(fort, $$InferencePSC))) {
                                    if (NIL != warnP) {
                                        reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $str_alt30$_fails_keIrrelevantTerm_test);
                                    }
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.thcl.clarifying_collectionP(fort, UNPROVIDED)) {
                                        thcl_fortP = T;
                                        if (NIL != warnP) {
                                            reason = cconcatenate($str_alt31$Allowing_, new SubLObject[]{ format_nil.format_nil_s_no_copy(fort), $str_alt32$__because_it_is_a_ClarifyingColle });
                                        }
                                    } else {
                                        if (generality_estimate(fort).numG($thcl_generality_cutoff$.getDynamicValue(thread))) {
                                            if (NIL != warnP) {
                                                reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $str_alt33$_is_too_general);
                                            }
                                        } else {
                                            if (NIL == com.cyc.cycjava.cycl.thcl.fort_passes_thcl_kb_subset_testP(fort)) {
                                                if (NIL != warnP) {
                                                    reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $str_alt34$_fails_the_THCL_KB_subset_test);
                                                }
                                            } else {
                                                if (NIL == com.cyc.cycjava.cycl.thcl.fort_passes_cached_thcl_testsP(fort)) {
                                                    if (NIL != warnP) {
                                                        reason = cconcatenate(format_nil.format_nil_s_no_copy(fort), $str_alt35$_fails_a_cached_test);
                                                        com.cyc.cycjava.cycl.thcl.thcl_filter_fortP(fort, T);
                                                    }
                                                } else {
                                                    thcl_fortP = T;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(thcl_fortP, reason);
            }
        }
    }

    public static SubLObject compute_thcl_status_of_fort(final SubLObject fort, final SubLObject warnP, SubLObject assume_ke_relevantP, SubLObject generality_cutoff) {
        if (assume_ke_relevantP == UNPROVIDED) {
            assume_ke_relevantP = NIL;
        }
        if (generality_cutoff == UNPROVIDED) {
            generality_cutoff = $thcl_generality_cutoff$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return compute_thcl_status_of_fort_internal(fort, warnP, assume_ke_relevantP, generality_cutoff);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPUTE_THCL_STATUS_OF_FORT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPUTE_THCL_STATUS_OF_FORT, FOUR_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, COMPUTE_THCL_STATUS_OF_FORT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(fort, warnP, assume_ke_relevantP, generality_cutoff);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (warnP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (assume_ke_relevantP.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && generality_cutoff.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(compute_thcl_status_of_fort_internal(fort, warnP, assume_ke_relevantP, generality_cutoff)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, warnP, assume_ke_relevantP, generality_cutoff));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject fort_passes_thcl_kb_subset_testP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == valid_constantP($thcl_kb_subset_collection$.getDynamicValue(thread), UNPROVIDED)) || (NIL != isa.quoted_isa_in_any_mtP(fort, $thcl_kb_subset_collection$.getDynamicValue(thread))));
        }
    }

    public static SubLObject fort_passes_thcl_kb_subset_testP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == valid_constantP($thcl_kb_subset_collection$.getDynamicValue(thread), UNPROVIDED)) || (NIL != isa.quoted_isa_in_any_mtP(fort, $thcl_kb_subset_collection$.getDynamicValue(thread))));
    }

    /**
     *
     *
     * @return BOOLEANP; Is FORMULA a good candidate for conscious-level human thought?
     */
    @LispMethod(comment = "@return BOOLEANP; Is FORMULA a good candidate for conscious-level human thought?")
    public static final SubLObject thcl_formulaP_alt(SubLObject formula, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        {
            SubLObject badP = NIL;
            if ((NIL != collection_defns.cycl_sentenceP(formula)) && formula_arity(formula, UNPROVIDED).numL(TWO_INTEGER)) {
                if (NIL != warnP) {
                    Errors.warn($str_alt36$Sentence_arity_is_less_than_2____, formula);
                }
                badP = T;
            } else {
                if (NIL != com.cyc.cycjava.cycl.thcl.function_corresponding_predicate_sentenceP(formula)) {
                    if (NIL != warnP) {
                        Errors.warn($str_alt37$Sentence_uses_a_function_and_its_, formula);
                    }
                    badP = T;
                }
            }
            {
                SubLObject list_var = NIL;
                SubLObject arg = NIL;
                SubLObject argnum = NIL;
                for (list_var = cycl_utilities.formula_terms(formula, UNPROVIDED), arg = list_var.first(), argnum = ZERO_INTEGER; !((NIL != badP) || (NIL == list_var)); list_var = list_var.rest() , arg = list_var.first() , argnum = add(ONE_INTEGER, argnum)) {
                    if (argnum.isZero() && (NIL != isa.isa_in_any_mtP(arg, $$CandidateForPredicatePopulation))) {
                        return T;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.thcl.thcl_functor_argP(arg, argnum, formula)) {
                            badP = com.cyc.cycjava.cycl.thcl.non_thcl_functorP(arg, warnP);
                        } else {
                            badP = com.cyc.cycjava.cycl.thcl.non_thcl_argP(arg, warnP);
                        }
                    }
                    if ((NIL != badP) && (NIL != warnP)) {
                        Errors.warn($str_alt39$Non_THCL_arg___S, arg);
                    }
                }
            }
            return makeBoolean(NIL == badP);
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is FORMULA a good candidate for conscious-level human thought?
     */
    @LispMethod(comment = "@return BOOLEANP; Is FORMULA a good candidate for conscious-level human thought?")
    public static SubLObject thcl_formulaP(final SubLObject formula, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        SubLObject badP = NIL;
        if ((NIL != collection_defns.cycl_sentenceP(formula)) && formula_arity(formula, UNPROVIDED).numL(TWO_INTEGER)) {
            if (NIL != warnP) {
                Errors.warn($str37$Sentence_arity_is_less_than_2____, formula);
            }
            badP = T;
        } else
            if (NIL != function_corresponding_predicate_sentenceP(formula)) {
                if (NIL != warnP) {
                    Errors.warn($str38$Sentence_uses_a_function_and_its_, formula);
                }
                badP = T;
            }

        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject argnum = NIL;
        list_var = cycl_utilities.formula_terms(formula, UNPROVIDED);
        arg = list_var.first();
        for (argnum = ZERO_INTEGER; (NIL == badP) && (NIL != list_var); list_var = list_var.rest() , arg = list_var.first() , argnum = add(ONE_INTEGER, argnum)) {
            if (argnum.isZero() && (NIL != isa.isa_in_any_mtP(arg, $$CandidateForPredicatePopulation))) {
                return T;
            }
            if (NIL != thcl_functor_argP(arg, argnum, formula, warnP)) {
                badP = non_thcl_functorP(arg, warnP);
            } else {
                badP = non_thcl_argP(arg, argnum, formula, warnP);
            }
            if ((NIL != badP) && (NIL != warnP)) {
                Errors.warn($str40$Non_THCL_arg___S, arg);
            }
        }
        return makeBoolean(NIL == badP);
    }

    public static final SubLObject thcl_functor_argP(SubLObject arg, SubLObject argnum, SubLObject formula) {
        if (argnum.isZero()) {
            return T;
        } else {
            if (argnum.eql(THREE_INTEGER) && (NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(formula), $$CapabilityPredicate))) {
                return T;
            } else {
                if (((((NIL != rule_macro_predicate_p(cycl_utilities.formula_arg0(formula))) && (NIL != forts.fort_p(arg))) && (NIL != predicate_p(arg))) && ONE_INTEGER.eql(argnum)) && (NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(formula), $const41$QuantificationalRuleMacroPredicat))) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject thcl_functor_argP(final SubLObject arg, final SubLObject argnum, final SubLObject formula, final SubLObject warnP) {
        if (argnum.isZero()) {
            return T;
        }
        if (argnum.eql(THREE_INTEGER) && (NIL != isa.isa_anyP(cycl_utilities.formula_arg0(formula), $list41, $$UniversalVocabularyMt, UNPROVIDED))) {
            return T;
        }
        if (((((NIL != fort_types_interface.rule_macro_predicate_p(cycl_utilities.formula_arg0(formula))) && (NIL != forts.fort_p(arg))) && (NIL != fort_types_interface.predicate_p(arg))) && ONE_INTEGER.eql(argnum)) && (NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(formula), $const43$QuantificationalRuleMacroPredicat))) {
            return T;
        }
        if (ONE_INTEGER.eql(argnum) && $$valueOfFunctionForArgs.eql(cycl_utilities.formula_arg0(formula))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject function_corresponding_predicate_sentenceP_alt(SubLObject formula) {
        {
            SubLObject ans = NIL;
            if (((NIL != collection_defns.cycl_sentenceP(formula)) && (NIL != groundP(formula, UNPROVIDED))) && ((NIL != assertions_high.atomic_assertionP(formula)) || (NIL != atomic_sentenceP(formula)))) {
                if (NIL == ans) {
                    {
                        SubLObject csome_list_var = com.cyc.cycjava.cycl.thcl.functions_corresponding_to_predicate(cycl_utilities.formula_arg0(formula), UNPROVIDED);
                        SubLObject fn = NIL;
                        for (fn = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , fn = csome_list_var.first()) {
                            if (NIL != cycl_utilities.expression_find(fn, formula, T, UNPROVIDED, UNPROVIDED)) {
                                ans = T;
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject function_corresponding_predicate_sentenceP(final SubLObject formula) {
        SubLObject ans = NIL;
        if ((((NIL != collection_defns.cycl_sentenceP(formula)) && (NIL != groundP(formula, UNPROVIDED))) && ((NIL != assertions_high.atomic_assertionP(formula)) || (NIL != atomic_sentenceP(formula)))) && (NIL == ans)) {
            SubLObject csome_list_var = functions_corresponding_to_predicate(cycl_utilities.formula_arg0(formula), UNPROVIDED);
            SubLObject fn = NIL;
            fn = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (NIL != cycl_utilities.expression_find(fn, formula, T, UNPROVIDED, UNPROVIDED)) {
                    ans = T;
                }
                csome_list_var = csome_list_var.rest();
                fn = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static final SubLObject functions_corresponding_to_predicate_internal_alt(SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return ask_utilities.query_variable($sym43$_FN, listS($const44$functionCorrespondingPredicate_Ge, $sym43$_FN, predicate, $list_alt45), mt, $list_alt46);
    }

    public static SubLObject functions_corresponding_to_predicate_internal(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return ask_utilities.query_variable($sym47$_FN, listS($const48$functionCorrespondingPredicate_Ge, $sym47$_FN, predicate, $list49), mt, $list50);
    }

    public static final SubLObject functions_corresponding_to_predicate_alt(SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.thcl.functions_corresponding_to_predicate_internal(predicate, mt);
                }
                caching_state = memoization_state_lookup(v_memoization_state, FUNCTIONS_CORRESPONDING_TO_PREDICATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = create_caching_state(memoization_state_lock(v_memoization_state), FUNCTIONS_CORRESPONDING_TO_PREDICATE, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state_put(v_memoization_state, FUNCTIONS_CORRESPONDING_TO_PREDICATE, caching_state);
                }
                {
                    SubLObject sxhash = sxhash_calc_2(predicate, mt);
                    SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw47$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.thcl.functions_corresponding_to_predicate_internal(predicate, mt)));
                        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
                        return caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject functions_corresponding_to_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return functions_corresponding_to_predicate_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FUNCTIONS_CORRESPONDING_TO_PREDICATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FUNCTIONS_CORRESPONDING_TO_PREDICATE, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FUNCTIONS_CORRESPONDING_TO_PREDICATE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(functions_corresponding_to_predicate_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject non_thcl_functorP_alt(SubLObject functor, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.member_equalP(functor, $thcl_forts_by_fiat$.getDynamicValue(thread))) {
                return NIL;
            } else {
                if (NIL == forts.fort_p(functor)) {
                    return T;
                } else {
                    if (NIL != rkf_relevance_utilities.rkf_irrelevant_term(functor, $$BaseKB)) {
                        if (NIL != warnP) {
                            Errors.warn($str_alt49$_S_is_RKF_irrelevant_in___BaseKB_, functor);
                        }
                        return T;
                    } else {
                        if (NIL != lexicon_vars.name_string_predP(functor)) {
                            return T;
                        } else {
                            if (NIL != lexicon_accessors.speech_part_predP(functor, UNPROVIDED)) {
                                return T;
                            } else {
                                if (NIL != isa.isa_in_any_mtP(functor, $$IntermediateVocabPredicate)) {
                                    return T;
                                } else {
                                    if (NIL == com.cyc.cycjava.cycl.thcl.fort_passes_thcl_kb_subset_testP(functor)) {
                                        return T;
                                    } else {
                                        if (NIL != kb_accessors.some_quoted_argumentP(functor)) {
                                            return T;
                                        } else {
                                            return NIL;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject non_thcl_functorP(final SubLObject functor, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.member_equalP(functor, $thcl_forts_by_fiat$.getDynamicValue(thread))) {
            return NIL;
        }
        if (NIL == forts.fort_p(functor)) {
            return T;
        }
        if (NIL != rkf_relevance_utilities.rkf_irrelevant_term(functor, $$BaseKB)) {
            if (NIL != warnP) {
                Errors.warn($str52$_S_is_RKF_irrelevant_in___BaseKB_, functor);
            }
            return T;
        }
        if (NIL != lexicon_vars.name_string_predP(functor)) {
            return T;
        }
        if (NIL != lexicon_accessors.speech_part_predP(functor, UNPROVIDED)) {
            return T;
        }
        if (NIL != isa.isa_in_any_mtP(functor, $$IntermediateVocabPredicate)) {
            if (NIL != warnP) {
                Errors.warn($str54$_S_is_an___IntermediateVocabPredi, functor);
            }
            return T;
        }
        if (NIL == fort_passes_thcl_kb_subset_testP(functor)) {
            return T;
        }
        if (((NIL != kb_accessors.some_quoted_argumentP(functor)) && (NIL != member($$CycLTerm, kb_accessors.arg_isa(functor, UNPROVIDED), symbol_function($sym56$GENL_), UNPROVIDED))) && (NIL == member(functor, $list57, symbol_function(EQL), UNPROVIDED))) {
            if (NIL != warnP) {
                Errors.warn($str58$_S_has_a_quoted___CycLTerm_argume, functor);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject non_thcl_argP_internal(final SubLObject arg, final SubLObject argnum, final SubLObject formula, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject thclP = NIL;
        if (NIL != thcl_fortP(arg, makeBoolean((NIL != warnP) && (NIL != forts.fort_p(arg))))) {
            thclP = T;
        } else
            if (((NIL != fort_types_interface.predicate_p(arg)) && (NIL != isa.isa_anyP(arg, $thcl_pred_argument_types_for_non_definitional_preds$.getDynamicValue(thread), $$UniversalVocabularyMt, UNPROVIDED))) && (NIL == isa.isa_in_any_mtP(cycl_utilities.formula_arg0(formula), $$ResearchCycDefinitionalPredicate))) {
                if (NIL != warnP) {
                    Errors.warn($str62$Allowing__S_as_arg_of_non_definit, arg, cycl_utilities.formula_arg0(formula));
                }
                thclP = T;
            } else
                if (((NIL != fort_types_interface.predicate_p(arg)) && cycl_utilities.formula_arg0(formula).eql($$genlPreds)) && cardinality_estimates.generality_estimate(arg).numL($int$500)) {
                    if (NIL != warnP) {
                        Errors.warn($str65$Allowing__S_as_arg_of___genlPreds, arg);
                    }
                    thclP = T;
                } else
                    if (NIL != forts.fort_p(arg)) {
                        thclP = NIL;
                    } else
                        if (arg.isString()) {
                            thclP = T;
                        } else
                            if (arg.isNumber()) {
                                thclP = T;
                            } else
                                if (NIL != cycl_variables.el_varP(arg)) {
                                    thclP = T;
                                } else
                                    if (NIL != el_formula_p(arg)) {
                                        thclP = thcl_formulaP(arg, warnP);
                                    }







        if ((NIL == thclP) && (NIL != warnP)) {
            Errors.warn($str66$Non_thcl_arg___S, arg);
        }
        return makeBoolean(NIL == thclP);
    }

    public static final SubLObject non_thcl_argP(SubLObject arg, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        {
            SubLObject thclP = NIL;
            if (NIL != com.cyc.cycjava.cycl.thcl.thcl_fortP(arg, makeBoolean((NIL != warnP) && (NIL != forts.fort_p(arg))))) {
                thclP = T;
            } else {
                if (NIL != forts.fort_p(arg)) {
                    thclP = NIL;
                } else {
                    if (arg.isString()) {
                        thclP = T;
                    } else {
                        if (arg.isNumber()) {
                            thclP = T;
                        } else {
                            if (NIL != el_varP(arg)) {
                                thclP = T;
                            } else {
                                if (NIL != el_formula_p(arg)) {
                                    thclP = com.cyc.cycjava.cycl.thcl.thcl_formulaP(arg, warnP);
                                }
                            }
                        }
                    }
                }
            }
            if (!((NIL != thclP) || (NIL == warnP))) {
                Errors.warn($str_alt51$Non_thcl_arg___S, arg);
            }
            return makeBoolean(NIL == thclP);
        }
    }

    public static SubLObject non_thcl_argP(final SubLObject arg, final SubLObject argnum, final SubLObject formula, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return non_thcl_argP_internal(arg, argnum, formula, warnP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym60$NON_THCL_ARG_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym60$NON_THCL_ARG_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym60$NON_THCL_ARG_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(arg, argnum, formula, warnP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (arg.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (formula.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && warnP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(non_thcl_argP_internal(arg, argnum, formula, warnP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(arg, argnum, formula, warnP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_fort_passes_cached_thcl_testsP_alt() {
        {
            SubLObject cs = $fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_fort_passes_cached_thcl_testsP() {
        final SubLObject cs = $fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_fort_passes_cached_thcl_testsP_alt(SubLObject fort) {
        return caching_state_remove_function_results_with_args($fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_fort_passes_cached_thcl_testsP(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject fort_passes_cached_thcl_testsP_internal_alt(SubLObject fort) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.thcl.thcl_filter_fortP(fort, NIL));
    }

    public static SubLObject fort_passes_cached_thcl_testsP_internal(final SubLObject fort) {
        return makeBoolean(NIL == thcl_filter_fortP(fort, NIL));
    }

    public static final SubLObject fort_passes_cached_thcl_testsP_alt(SubLObject fort) {
        {
            SubLObject caching_state = $fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = create_global_caching_state_for_name($sym52$FORT_PASSES_CACHED_THCL_TESTS_, $sym53$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_, $int$500, EQL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = caching_state_lookup(caching_state, fort, $kw47$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw47$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.thcl.fort_passes_cached_thcl_testsP_internal(fort)));
                    caching_state_put(caching_state, fort, results, UNPROVIDED);
                }
                return caching_results(results);
            }
        }
    }

    public static SubLObject fort_passes_cached_thcl_testsP(final SubLObject fort) {
        SubLObject caching_state = $fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym67$FORT_PASSES_CACHED_THCL_TESTS_, $sym68$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_, $int$500, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(fort_passes_cached_thcl_testsP_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return booleanp; Should the THCL filter filter out FORT?
     */
    @LispMethod(comment = "@return booleanp; Should the THCL filter filter out FORT?")
    public static final SubLObject thcl_filter_fortP_alt(SubLObject fort, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        {
            SubLObject filterP = NIL;
            if (NIL != isa.isa_anyP(fort, $thcl_filter_collections$.getGlobalValue(), $$InferencePSC, $$True_JustificationTruth)) {
                if (NIL != warnP) {
                    {
                        SubLObject cdolist_list_var = $thcl_filter_collections$.getGlobalValue();
                        SubLObject col = NIL;
                        for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                            if (NIL != isa.isaP(fort, col, $$InferencePSC, $$True_JustificationTruth)) {
                                Errors.warn($str_alt60$_S_is_an_instance_of____S, fort, col);
                            }
                        }
                    }
                }
                filterP = T;
            } else {
                if ((NIL != nart_handles.nart_p(fort)) && (NIL != isa.isa_anyP(fort, $thcl_nart_filter_collections$.getGlobalValue(), $$InferencePSC, $$True_JustificationTruth))) {
                    if (NIL != warnP) {
                        Errors.warn($str_alt61$_S_is_a_NART_and_is_an_instance_o, fort, $thcl_nart_filter_collections$.getGlobalValue());
                    }
                    filterP = T;
                } else {
                    if (NIL != lexicon_accessors.quick_lexical_wordP(fort, UNPROVIDED)) {
                        if (NIL != warnP) {
                            Errors.warn($str_alt62$_S_is_a_lexical_word, fort);
                        }
                        filterP = T;
                    } else {
                        if (NIL != isa.any_quoted_isaP(fort, $thcl_quoted_filter_collections$.getGlobalValue(), $$InferencePSC, $$True_JustificationTruth)) {
                            if (NIL != warnP) {
                                Errors.warn($str_alt63$_S_is_a_quoted_instance_of_one_of, fort, $thcl_quoted_filter_collections$.getGlobalValue());
                            }
                            filterP = T;
                        } else {
                            if (NIL != member(bookkeeping_store.creator(fort, UNPROVIDED), $list_alt64, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != warnP) {
                                    Errors.warn($str_alt65$_S_was_created_by__S, bookkeeping_store.creator(fort, UNPROVIDED));
                                }
                                filterP = T;
                            } else {
                                if ((NIL != collection_p(fort)) && ((NIL != isa.isaP(fort, $$CollectionType, UNPROVIDED, UNPROVIDED)) || (NIL != genls.any_genlP(fort, $thcl_genls_filter_collections$.getGlobalValue(), $$InferencePSC, $$True_JustificationTruth)))) {
                                    if (NIL != warnP) {
                                        Errors.warn($str_alt67$_S_is_either_a___CollectionType_o, $thcl_genls_filter_collections$.getGlobalValue());
                                    }
                                    filterP = T;
                                }
                            }
                        }
                    }
                }
            }
            return filterP;
        }
    }

    /**
     *
     *
     * @return booleanp; Should the THCL filter filter out FORT?
     */
    @LispMethod(comment = "@return booleanp; Should the THCL filter filter out FORT?")
    public static SubLObject thcl_filter_fortP(final SubLObject fort, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        SubLObject filterP = NIL;
        if (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, $$highlyRelevantTerm, UNPROVIDED, UNPROVIDED)) {
            if (NIL != warnP) {
                Errors.warn($str74$_S_is_a___highlyRelevantTerm__so_, fort);
            }
        } else
            if (NIL != isa.isa_anyP(fort, $thcl_filter_collections$.getGlobalValue(), $$InferencePSC, $$True_JustificationTruth)) {
                if (NIL != warnP) {
                    SubLObject cdolist_list_var = $thcl_filter_collections$.getGlobalValue();
                    SubLObject col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != isa.isaP(fort, col, $$InferencePSC, $$True_JustificationTruth)) {
                            Errors.warn($str76$_S_is_an_instance_of____S, fort, col);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                }
                filterP = T;
            } else
                if ((NIL != nart_handles.nart_p(fort)) && (NIL != isa.isa_anyP(fort, $thcl_nart_filter_collections$.getGlobalValue(), $$InferencePSC, $$True_JustificationTruth))) {
                    if (NIL != warnP) {
                        Errors.warn($str77$_S_is_a_NART_and_is_an_instance_o, fort, $thcl_nart_filter_collections$.getGlobalValue());
                    }
                    filterP = T;
                } else
                    if (NIL != lexicon_accessors.quick_lexical_wordP(fort, UNPROVIDED)) {
                        if (NIL != warnP) {
                            Errors.warn($str78$_S_is_a_lexical_word, fort);
                        }
                        filterP = T;
                    } else
                        if ((NIL != isa.any_quoted_isaP(fort, $thcl_quoted_filter_collections$.getGlobalValue(), $$InferencePSC, $$True_JustificationTruth)) && (NIL == subl_promotions.memberP(fort, $thcl_quoted_filter_exceptions$.getGlobalValue(), symbol_function(EQL), UNPROVIDED))) {
                            if (NIL != warnP) {
                                Errors.warn($str79$_S_is_a_quoted_instance_of_one_of, fort, $thcl_quoted_filter_collections$.getGlobalValue());
                            }
                            filterP = T;
                        } else
                            if (NIL != member(bookkeeping_store.creator(fort, UNPROVIDED), $list80, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != warnP) {
                                    Errors.warn($str81$_S_was_created_by__S, bookkeeping_store.creator(fort, UNPROVIDED));
                                }
                                filterP = T;
                            } else
                                if ((NIL != fort_types_interface.collection_p(fort)) && ((NIL != isa.isaP(fort, $$CollectionType, UNPROVIDED, UNPROVIDED)) || (NIL != genls.any_genlP(fort, $thcl_genls_filter_collections$.getGlobalValue(), $$InferencePSC, $$True_JustificationTruth)))) {
                                    if (NIL != warnP) {
                                        Errors.warn($str83$_S_is_either_a___CollectionType_o, $thcl_genls_filter_collections$.getGlobalValue());
                                    }
                                    filterP = T;
                                }






        return filterP;
    }

    public static final SubLObject random_thcl_assertion_mt_alt() {
        return $random_thcl_assertion_mt$.getGlobalValue();
    }

    public static SubLObject random_thcl_assertion_mt() {
        return $random_thcl_assertion_mt$.getGlobalValue();
    }

    public static final SubLObject random_thcl_constant_and_assertion_alt(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        return com.cyc.cycjava.cycl.thcl.random_thcl_constant_and_assertion_int(cyclist);
    }

    public static SubLObject random_thcl_constant_and_assertion(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        return random_thcl_constant_and_assertion_int(cyclist);
    }

    public static final SubLObject random_thcl_constant_and_assertion_int_alt(SubLObject cyclist) {
        {
            SubLObject constant = NIL;
            SubLObject assertion = NIL;
            SubLObject abortP = NIL;
            while (!(((NIL != constant) && (NIL != assertion)) || (NIL != abortP))) {
                constant = constants_high.random_constant(UNPROVIDED);
                if (NIL != com.cyc.cycjava.cycl.thcl.thcl_constantP(constant, UNPROVIDED)) {
                    assertion = com.cyc.cycjava.cycl.thcl.random_thcl_assertion(constant, cyclist);
                }
            } 
            return values(constant, assertion);
        }
    }

    public static SubLObject random_thcl_constant_and_assertion_int(final SubLObject cyclist) {
        SubLObject constant = NIL;
        SubLObject assertion = NIL;
        for (final SubLObject abortP = NIL; ((NIL == constant) || (NIL == assertion)) && (NIL == abortP); assertion = random_thcl_assertion(constant, cyclist)) {
            constant = constants_high.random_constant(UNPROVIDED);
            if (NIL != thcl_constantP(constant, UNPROVIDED)) {
            }
        }
        return values(constant, assertion);
    }

    public static final SubLObject random_thcl_assertion_alt(SubLObject fort, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thcl_assertion = NIL;
                SubLObject all_assertions = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(com.cyc.cycjava.cycl.thcl.random_thcl_assertion_mt());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        all_assertions = kb_mapping.gather_index(fort, T);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == thcl_assertion) {
                    {
                        SubLObject csome_list_var = list_utilities.randomize_list(all_assertions);
                        SubLObject as = NIL;
                        for (as = csome_list_var.first(); !((NIL != thcl_assertion) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , as = csome_list_var.first()) {
                            if ((((NIL == random_thought_generator.thcl_assertion_seen_by_cyclistP(as, cyclist)) && (NIL != assertions_high.gaf_assertionP(as))) && (NIL != random_thought_generator.gaf_about_topicP(as, fort, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.thcl.thcl_formulaP(as, UNPROVIDED))) {
                                thcl_assertion = as;
                            }
                        }
                    }
                }
                return thcl_assertion;
            }
        }
    }

    public static SubLObject random_thcl_assertion(final SubLObject fort, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        final SubLObject thcl_assertion = NIL;
        final SubLObject all_assertions = NIL;
        return thcl_assertion;
    }

    public static final SubLObject ke_irrelevant_termP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return rkf_relevance_utilities.rkf_irrelevant_term(v_term, mt);
    }

    public static SubLObject ke_irrelevant_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return rkf_relevance_utilities.rkf_irrelevant_term(v_term, mt);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("FORT"), makeSymbol("&KEY"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject clear_ke_irrelevant_termP_via_inference_alt() {
        {
            SubLObject cs = $ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue();
            if (NIL != cs) {
                caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_ke_irrelevant_termP_via_inference() {
        final SubLObject cs = $ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeKeyword("MESSAGE"));

    public static final SubLObject remove_ke_irrelevant_termP_via_inference_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return caching_state_remove_function_results_with_args($ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_ke_irrelevant_termP_via_inference(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args($ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    static private final SubLList $list_alt9 = list(makeSymbol("FWHEN-FEATURE"), makeKeyword("CYC-RKF"), list(makeSymbol("RKF-IRRELEVANT-CACHE-SUPPORTS-THCL?")));

    public static final SubLObject ke_irrelevant_termP_via_inference_internal_alt(SubLObject v_term, SubLObject mt) {
        return ask_utilities.query_boolean(list($$keIrrelevantTerm, v_term), mt, UNPROVIDED);
    }

    public static SubLObject ke_irrelevant_termP_via_inference_internal(final SubLObject v_term, final SubLObject mt) {
        return ask_utilities.query_boolean(list($$keIrrelevantTerm, v_term), mt, UNPROVIDED);
    }

    static private final SubLList $list_alt12 = list(list(makeSymbol("FORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject ke_irrelevant_termP_via_inference_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject caching_state = $ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = create_global_caching_state_for_name($sym69$KE_IRRELEVANT_TERM__VIA_INFERENCE, $sym71$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_, $int$10000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = sxhash_calc_2(v_term, mt);
                SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw47$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                        return caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.thcl.ke_irrelevant_termP_via_inference_internal(v_term, mt)));
                    caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
                    return caching_results(results);
                }
            }
        }
    }

    public static SubLObject ke_irrelevant_termP_via_inference(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject caching_state = $ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE, $sym87$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_, $int$10000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(ke_irrelevant_termP_via_inference_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    static private final SubLList $list_alt16 = list(makeSymbol("*THCL-FORTS-BY-FIAT*"));

    static private final SubLList $list_alt17 = list(list(makeSymbol("MAYBE-FORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt21$_is_a_THCL_FORT_by_fiat__cf___THC = makeString(" is a THCL FORT by fiat (cf. *THCL-FORTS-BY-FIAT*)");

    static private final SubLString $str_alt22$_is_not_a_FORT_ = makeString(" is not a FORT.");

    static private final SubLString $str_alt23$RKF_irrelevance_cache_says_ = makeString("RKF irrelevance cache says ");

    static private final SubLString $str_alt24$_is_not_THCL_ = makeString(" is not THCL.");

    static private final SubLString $str_alt25$_is_a_predicate = makeString(" is a predicate");

    static private final SubLString $str_alt26$_is_a_functor = makeString(" is a functor");

    static private final SubLString $str_alt27$_is_a_logical_operator = makeString(" is a logical operator");

    static private final SubLString $str_alt28$_is_a_microtheory = makeString(" is a microtheory");

    static private final SubLString $str_alt30$_fails_keIrrelevantTerm_test = makeString(" fails keIrrelevantTerm test");

    static private final SubLString $str_alt31$Allowing_ = makeString("Allowing ");

    static private final SubLString $str_alt32$__because_it_is_a_ClarifyingColle = makeString(", because it is a ClarifyingCollectionType");

    static private final SubLString $str_alt33$_is_too_general = makeString(" is too general");

    static private final SubLString $str_alt34$_fails_the_THCL_KB_subset_test = makeString(" fails the THCL KB subset test");

    static private final SubLString $str_alt35$_fails_a_cached_test = makeString(" fails a cached test");

    public static final SubLObject clear_clarifying_collectionP_alt() {
        {
            SubLObject cs = $clarifying_collectionP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_clarifying_collectionP() {
        final SubLObject cs = $clarifying_collectionP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    static private final SubLString $str_alt36$Sentence_arity_is_less_than_2____ = makeString("Sentence arity is less than 2:~% ~S");

    static private final SubLString $str_alt37$Sentence_uses_a_function_and_its_ = makeString("Sentence uses a function and its corresponding predicate:~% ~S");

    public static final SubLObject remove_clarifying_collectionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return caching_state_remove_function_results_with_args($clarifying_collectionP_caching_state$.getGlobalValue(), list(v_object, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_clarifying_collectionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args($clarifying_collectionP_caching_state$.getGlobalValue(), list(v_object, mt), UNPROVIDED, UNPROVIDED);
    }

    static private final SubLString $str_alt39$Non_THCL_arg___S = makeString("Non-THCL arg: ~S");



    public static final SubLObject clarifying_collectionP_internal_alt(SubLObject v_object, SubLObject mt) {
        return isa.isaP(v_object, $$ClarifyingCollectionType, mt, UNPROVIDED);
    }

    public static SubLObject clarifying_collectionP_internal(final SubLObject v_object, final SubLObject mt) {
        return isa.isaP(v_object, $$ClarifyingCollectionType, mt, UNPROVIDED);
    }

    public static final SubLObject $const41$QuantificationalRuleMacroPredicat = reader_make_constant_shell("QuantificationalRuleMacroPredicate-Canonical");

    public static final SubLObject clarifying_collectionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject caching_state = $clarifying_collectionP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = create_global_caching_state_for_name($sym73$CLARIFYING_COLLECTION_, $sym75$_CLARIFYING_COLLECTION__CACHING_STATE_, $int$10000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = sxhash_calc_2(v_object, mt);
                SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw47$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_object.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                        return caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.thcl.clarifying_collectionP_internal(v_object, mt)));
                    caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_object, mt));
                    return caching_results(results);
                }
            }
        }
    }

    public static SubLObject clarifying_collectionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject caching_state = $clarifying_collectionP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym89$CLARIFYING_COLLECTION_, $sym91$_CLARIFYING_COLLECTION__CACHING_STATE_, $int$10000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback($sym92$CLEAR_CLARIFYING_COLLECTION_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_object, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_object.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(clarifying_collectionP_internal(v_object, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_object, mt));
        return memoization_state.caching_results(results3);
    }

    static private final SubLSymbol $sym43$_FN = makeSymbol("?FN");

    public static final SubLObject $const44$functionCorrespondingPredicate_Ge = reader_make_constant_shell("functionCorrespondingPredicate-Generic");

    static private final SubLList $list_alt45 = list(makeSymbol("?N"));

    static private final SubLList $list_alt46 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    public static final SubLSymbol $kw47$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt49$_S_is_RKF_irrelevant_in___BaseKB_ = makeString("~S is RKF-irrelevant in #$BaseKB.");

    static private final SubLString $str_alt51$Non_thcl_arg___S = makeString("Non-thcl arg: ~S");

    static private final SubLSymbol $sym52$FORT_PASSES_CACHED_THCL_TESTS_ = makeSymbol("FORT-PASSES-CACHED-THCL-TESTS?");

    static private final SubLSymbol $sym53$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_ = makeSymbol("*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*");

    static private final SubLList $list_alt55 = list(new SubLObject[]{ reader_make_constant_shell("DocumentationConstant"), reader_make_constant_shell("Format"), reader_make_constant_shell("ComputerCode"), reader_make_constant_shell("CycLQuerySpecification"), reader_make_constant_shell("Assignment-Specification"), reader_make_constant_shell("Allotment"), reader_make_constant_shell("Evaluating"), reader_make_constant_shell("KEInteractionResource"), reader_make_constant_shell("KBContentTest"), reader_make_constant_shell("CharacterString"), reader_make_constant_shell("ComputerVulnerabilityReport-CW"), reader_make_constant_shell("BugReport"), reader_make_constant_shell("BugzillaBugReportType"), reader_make_constant_shell("Allotment"), reader_make_constant_shell("WordNetSynset"), reader_make_constant_shell("DealingWithAStringInNounLearnerTool"), reader_make_constant_shell("SoftwareAgentCommunicating"), reader_make_constant_shell("KBContentTest"), reader_make_constant_shell("CoaDiagramObject"), reader_make_constant_shell("ReferenceWorkEntry") });

    public static final SubLObject declare_thcl_file_alt() {
        declareMacro("do_thcl_forts", "DO-THCL-FORTS");
        declareMacro("do_thcl_forts_2", "DO-THCL-FORTS-2");
        declareMacro("with_thcl_fort", "WITH-THCL-FORT");
        declareMacro("possibly_with_thcl_fort", "POSSIBLY-WITH-THCL-FORT");
        declareFunction("thcl_constantP", "THCL-CONSTANT?", 1, 1, false);
        declareFunction("easily_understood_by_humans", "EASILY-UNDERSTOOD-BY-HUMANS", 1, 0, false);
        declareFunction("not_thcl_fortP", "NOT-THCL-FORT?", 2, 1, false);
        declareFunction("thcl_fortP", "THCL-FORT?", 1, 1, false);
        declareFunction("compute_thcl_status_of_fort", "COMPUTE-THCL-STATUS-OF-FORT", 2, 1, false);
        declareFunction("fort_passes_thcl_kb_subset_testP", "FORT-PASSES-THCL-KB-SUBSET-TEST?", 1, 0, false);
        declareFunction("thcl_formulaP", "THCL-FORMULA?", 1, 1, false);
        declareFunction("thcl_functor_argP", "THCL-FUNCTOR-ARG?", 3, 0, false);
        declareFunction("function_corresponding_predicate_sentenceP", "FUNCTION-CORRESPONDING-PREDICATE-SENTENCE?", 1, 0, false);
        declareFunction("functions_corresponding_to_predicate_internal", "FUNCTIONS-CORRESPONDING-TO-PREDICATE-INTERNAL", 1, 1, false);
        declareFunction("functions_corresponding_to_predicate", "FUNCTIONS-CORRESPONDING-TO-PREDICATE", 1, 1, false);
        declareFunction("non_thcl_functorP", "NON-THCL-FUNCTOR?", 1, 1, false);
        declareFunction("non_thcl_argP", "NON-THCL-ARG?", 1, 1, false);
        declareFunction("clear_fort_passes_cached_thcl_testsP", "CLEAR-FORT-PASSES-CACHED-THCL-TESTS?", 0, 0, false);
        declareFunction("remove_fort_passes_cached_thcl_testsP", "REMOVE-FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false);
        declareFunction("fort_passes_cached_thcl_testsP_internal", "FORT-PASSES-CACHED-THCL-TESTS?-INTERNAL", 1, 0, false);
        declareFunction("fort_passes_cached_thcl_testsP", "FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false);
        declareFunction("thcl_filter_fortP", "THCL-FILTER-FORT?", 1, 1, false);
        declareFunction("random_thcl_assertion_mt", "RANDOM-THCL-ASSERTION-MT", 0, 0, false);
        declareFunction("random_thcl_constant_and_assertion", "RANDOM-THCL-CONSTANT-AND-ASSERTION", 0, 1, false);
        declareFunction("random_thcl_constant_and_assertion_int", "RANDOM-THCL-CONSTANT-AND-ASSERTION-INT", 1, 0, false);
        declareFunction("random_thcl_assertion", "RANDOM-THCL-ASSERTION", 1, 1, false);
        declareFunction("ke_irrelevant_termP", "KE-IRRELEVANT-TERM?", 1, 1, false);
        declareFunction("clear_ke_irrelevant_termP_via_inference", "CLEAR-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 0, 0, false);
        declareFunction("remove_ke_irrelevant_termP_via_inference", "REMOVE-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false);
        declareFunction("ke_irrelevant_termP_via_inference_internal", "KE-IRRELEVANT-TERM?-VIA-INFERENCE-INTERNAL", 2, 0, false);
        declareFunction("ke_irrelevant_termP_via_inference", "KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false);
        declareFunction("clear_clarifying_collectionP", "CLEAR-CLARIFYING-COLLECTION?", 0, 0, false);
        declareFunction("remove_clarifying_collectionP", "REMOVE-CLARIFYING-COLLECTION?", 1, 1, false);
        declareFunction("clarifying_collectionP_internal", "CLARIFYING-COLLECTION?-INTERNAL", 2, 0, false);
        declareFunction("clarifying_collectionP", "CLARIFYING-COLLECTION?", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_thcl_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("do_thcl_forts", "DO-THCL-FORTS");
            declareMacro("do_thcl_forts_2", "DO-THCL-FORTS-2");
            declareMacro("with_thcl_fort", "WITH-THCL-FORT");
            declareMacro("possibly_with_thcl_fort", "POSSIBLY-WITH-THCL-FORT");
            declareFunction("thcl_constantP", "THCL-CONSTANT?", 1, 1, false);
            declareFunction("easily_understood_by_humans", "EASILY-UNDERSTOOD-BY-HUMANS", 1, 0, false);
            declareFunction("not_thcl_fortP", "NOT-THCL-FORT?", 2, 1, false);
            declareFunction("thcl_fortP", "THCL-FORT?", 1, 1, false);
            declareFunction("compute_thcl_status_of_fort_internal", "COMPUTE-THCL-STATUS-OF-FORT-INTERNAL", 2, 2, false);
            declareFunction("compute_thcl_status_of_fort", "COMPUTE-THCL-STATUS-OF-FORT", 2, 2, false);
            declareFunction("fort_passes_thcl_kb_subset_testP", "FORT-PASSES-THCL-KB-SUBSET-TEST?", 1, 0, false);
            declareFunction("thcl_formulaP", "THCL-FORMULA?", 1, 1, false);
            declareFunction("thcl_functor_argP", "THCL-FUNCTOR-ARG?", 4, 0, false);
            declareFunction("function_corresponding_predicate_sentenceP", "FUNCTION-CORRESPONDING-PREDICATE-SENTENCE?", 1, 0, false);
            declareFunction("functions_corresponding_to_predicate_internal", "FUNCTIONS-CORRESPONDING-TO-PREDICATE-INTERNAL", 1, 1, false);
            declareFunction("functions_corresponding_to_predicate", "FUNCTIONS-CORRESPONDING-TO-PREDICATE", 1, 1, false);
            declareFunction("non_thcl_functorP", "NON-THCL-FUNCTOR?", 1, 1, false);
            declareFunction("non_thcl_argP_internal", "NON-THCL-ARG?-INTERNAL", 3, 1, false);
            declareFunction("non_thcl_argP", "NON-THCL-ARG?", 3, 1, false);
            declareFunction("clear_fort_passes_cached_thcl_testsP", "CLEAR-FORT-PASSES-CACHED-THCL-TESTS?", 0, 0, false);
            declareFunction("remove_fort_passes_cached_thcl_testsP", "REMOVE-FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false);
            declareFunction("fort_passes_cached_thcl_testsP_internal", "FORT-PASSES-CACHED-THCL-TESTS?-INTERNAL", 1, 0, false);
            declareFunction("fort_passes_cached_thcl_testsP", "FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false);
            declareFunction("thcl_filter_fortP", "THCL-FILTER-FORT?", 1, 1, false);
            declareFunction("random_thcl_assertion_mt", "RANDOM-THCL-ASSERTION-MT", 0, 0, false);
            declareFunction("random_thcl_constant_and_assertion", "RANDOM-THCL-CONSTANT-AND-ASSERTION", 0, 1, false);
            declareFunction("random_thcl_constant_and_assertion_int", "RANDOM-THCL-CONSTANT-AND-ASSERTION-INT", 1, 0, false);
            declareFunction("random_thcl_assertion", "RANDOM-THCL-ASSERTION", 1, 1, false);
            declareFunction("ke_irrelevant_termP", "KE-IRRELEVANT-TERM?", 1, 1, false);
            declareFunction("clear_ke_irrelevant_termP_via_inference", "CLEAR-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 0, 0, false);
            declareFunction("remove_ke_irrelevant_termP_via_inference", "REMOVE-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false);
            declareFunction("ke_irrelevant_termP_via_inference_internal", "KE-IRRELEVANT-TERM?-VIA-INFERENCE-INTERNAL", 2, 0, false);
            declareFunction("ke_irrelevant_termP_via_inference", "KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false);
            declareFunction("clear_clarifying_collectionP", "CLEAR-CLARIFYING-COLLECTION?", 0, 0, false);
            declareFunction("remove_clarifying_collectionP", "REMOVE-CLARIFYING-COLLECTION?", 1, 1, false);
            declareFunction("clarifying_collectionP_internal", "CLARIFYING-COLLECTION?-INTERNAL", 2, 0, false);
            declareFunction("clarifying_collectionP", "CLARIFYING-COLLECTION?", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("compute_thcl_status_of_fort", "COMPUTE-THCL-STATUS-OF-FORT", 2, 1, false);
            declareFunction("thcl_functor_argP", "THCL-FUNCTOR-ARG?", 3, 0, false);
            declareFunction("non_thcl_argP", "NON-THCL-ARG?", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_thcl_file_Previous() {
        declareMacro("do_thcl_forts", "DO-THCL-FORTS");
        declareMacro("do_thcl_forts_2", "DO-THCL-FORTS-2");
        declareMacro("with_thcl_fort", "WITH-THCL-FORT");
        declareMacro("possibly_with_thcl_fort", "POSSIBLY-WITH-THCL-FORT");
        declareFunction("thcl_constantP", "THCL-CONSTANT?", 1, 1, false);
        declareFunction("easily_understood_by_humans", "EASILY-UNDERSTOOD-BY-HUMANS", 1, 0, false);
        declareFunction("not_thcl_fortP", "NOT-THCL-FORT?", 2, 1, false);
        declareFunction("thcl_fortP", "THCL-FORT?", 1, 1, false);
        declareFunction("compute_thcl_status_of_fort_internal", "COMPUTE-THCL-STATUS-OF-FORT-INTERNAL", 2, 2, false);
        declareFunction("compute_thcl_status_of_fort", "COMPUTE-THCL-STATUS-OF-FORT", 2, 2, false);
        declareFunction("fort_passes_thcl_kb_subset_testP", "FORT-PASSES-THCL-KB-SUBSET-TEST?", 1, 0, false);
        declareFunction("thcl_formulaP", "THCL-FORMULA?", 1, 1, false);
        declareFunction("thcl_functor_argP", "THCL-FUNCTOR-ARG?", 4, 0, false);
        declareFunction("function_corresponding_predicate_sentenceP", "FUNCTION-CORRESPONDING-PREDICATE-SENTENCE?", 1, 0, false);
        declareFunction("functions_corresponding_to_predicate_internal", "FUNCTIONS-CORRESPONDING-TO-PREDICATE-INTERNAL", 1, 1, false);
        declareFunction("functions_corresponding_to_predicate", "FUNCTIONS-CORRESPONDING-TO-PREDICATE", 1, 1, false);
        declareFunction("non_thcl_functorP", "NON-THCL-FUNCTOR?", 1, 1, false);
        declareFunction("non_thcl_argP_internal", "NON-THCL-ARG?-INTERNAL", 3, 1, false);
        declareFunction("non_thcl_argP", "NON-THCL-ARG?", 3, 1, false);
        declareFunction("clear_fort_passes_cached_thcl_testsP", "CLEAR-FORT-PASSES-CACHED-THCL-TESTS?", 0, 0, false);
        declareFunction("remove_fort_passes_cached_thcl_testsP", "REMOVE-FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false);
        declareFunction("fort_passes_cached_thcl_testsP_internal", "FORT-PASSES-CACHED-THCL-TESTS?-INTERNAL", 1, 0, false);
        declareFunction("fort_passes_cached_thcl_testsP", "FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false);
        declareFunction("thcl_filter_fortP", "THCL-FILTER-FORT?", 1, 1, false);
        declareFunction("random_thcl_assertion_mt", "RANDOM-THCL-ASSERTION-MT", 0, 0, false);
        declareFunction("random_thcl_constant_and_assertion", "RANDOM-THCL-CONSTANT-AND-ASSERTION", 0, 1, false);
        declareFunction("random_thcl_constant_and_assertion_int", "RANDOM-THCL-CONSTANT-AND-ASSERTION-INT", 1, 0, false);
        declareFunction("random_thcl_assertion", "RANDOM-THCL-ASSERTION", 1, 1, false);
        declareFunction("ke_irrelevant_termP", "KE-IRRELEVANT-TERM?", 1, 1, false);
        declareFunction("clear_ke_irrelevant_termP_via_inference", "CLEAR-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 0, 0, false);
        declareFunction("remove_ke_irrelevant_termP_via_inference", "REMOVE-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false);
        declareFunction("ke_irrelevant_termP_via_inference_internal", "KE-IRRELEVANT-TERM?-VIA-INFERENCE-INTERNAL", 2, 0, false);
        declareFunction("ke_irrelevant_termP_via_inference", "KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false);
        declareFunction("clear_clarifying_collectionP", "CLEAR-CLARIFYING-COLLECTION?", 0, 0, false);
        declareFunction("remove_clarifying_collectionP", "REMOVE-CLARIFYING-COLLECTION?", 1, 1, false);
        declareFunction("clarifying_collectionP_internal", "CLARIFYING-COLLECTION?-INTERNAL", 2, 0, false);
        declareFunction("clarifying_collectionP", "CLARIFYING-COLLECTION?", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt56 = list(reader_make_constant_shell("ScalarInterval"));

    static private final SubLList $list_alt57 = list(reader_make_constant_shell("DocumentationConstant"), reader_make_constant_shell("ImplementationConstant"), reader_make_constant_shell("IndexicalConcept"), reader_make_constant_shell("IndeterminateTerm"), reader_make_constant_shell("UMLFORT"));

    static private final SubLList $list_alt58 = list(reader_make_constant_shell("RelationalStructure"), reader_make_constant_shell("Set-Mathematical"), reader_make_constant_shell("FormulaTemplate"), reader_make_constant_shell("Relation"), reader_make_constant_shell("Microtheory"), reader_make_constant_shell("CycLExpression"));

    static private final SubLString $str_alt60$_S_is_an_instance_of____S = makeString("~S is an instance of~% ~S");

    static private final SubLString $str_alt61$_S_is_a_NART_and_is_an_instance_o = makeString("~S is a NART and is an instance of one of~% ~S");

    static private final SubLString $str_alt62$_S_is_a_lexical_word = makeString("~S is a lexical word");

    static private final SubLString $str_alt63$_S_is_a_quoted_instance_of_one_of = makeString("~S is a quoted instance of one of~% ~S");

    static private final SubLList $list_alt64 = list(reader_make_constant_shell("BUTLERAgent"));

    static private final SubLString $str_alt65$_S_was_created_by__S = makeString("~S was created by ~S");

    static private final SubLString $str_alt67$_S_is_either_a___CollectionType_o = makeString("~S is either a #$CollectionType or a spec of one of~% ~S");

    public static final SubLObject $const68$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric");

    static private final SubLSymbol $sym69$KE_IRRELEVANT_TERM__VIA_INFERENCE = makeSymbol("KE-IRRELEVANT-TERM?-VIA-INFERENCE");

    static private final SubLSymbol $sym71$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_ = makeSymbol("*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*");

    static private final SubLSymbol $sym73$CLARIFYING_COLLECTION_ = makeSymbol("CLARIFYING-COLLECTION?");

    public static final SubLObject init_thcl_file_alt() {
        defparameter("*THCL-GENERALITY-CUTOFF*", $int$1000);
        defparameter("*THCL-KB-SUBSET-COLLECTION*", NIL);
        defparameter("*THCL-FORTS-BY-FIAT*", NIL);
        deflexical("*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*", NIL);
        deflexical("*THCL-FILTER-COLLECTIONS*", $list_alt55);
        deflexical("*THCL-NART-FILTER-COLLECTIONS*", $list_alt56);
        deflexical("*THCL-QUOTED-FILTER-COLLECTIONS*", $list_alt57);
        deflexical("*THCL-GENLS-FILTER-COLLECTIONS*", $list_alt58);
        deflexical("*RANDOM-THCL-ASSERTION-MT*", $const68$CurrentWorldDataCollectorMt_NonHo);
        deflexical("*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*", NIL);
        deflexical("*CLARIFYING-COLLECTION?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_thcl_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*THCL-GENERALITY-CUTOFF*", $int$1000);
            defparameter("*THCL-KB-SUBSET-COLLECTION*", NIL);
            defparameter("*THCL-FORTS-BY-FIAT*", NIL);
            defparameter("*THCL-PRED-ARGUMENT-TYPES-FOR-NON-DEFINITIONAL-PREDS*", $list59);
            deflexical("*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*", NIL);
            deflexical("*THCL-FILTER-COLLECTIONS*", $list69);
            deflexical("*THCL-NART-FILTER-COLLECTIONS*", NIL);
            deflexical("*THCL-QUOTED-FILTER-COLLECTIONS*", $list70);
            deflexical("*THCL-QUOTED-FILTER-EXCEPTIONS*", $list71);
            deflexical("*THCL-GENLS-FILTER-COLLECTIONS*", $list72);
            deflexical("*RANDOM-THCL-ASSERTION-MT*", $const84$CurrentWorldDataCollectorMt_NonHo);
            deflexical("*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*", NIL);
            deflexical("*CLARIFYING-COLLECTION?-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*THCL-FILTER-COLLECTIONS*", $list_alt55);
            deflexical("*THCL-NART-FILTER-COLLECTIONS*", $list_alt56);
            deflexical("*THCL-QUOTED-FILTER-COLLECTIONS*", $list_alt57);
            deflexical("*THCL-GENLS-FILTER-COLLECTIONS*", $list_alt58);
            deflexical("*RANDOM-THCL-ASSERTION-MT*", $const68$CurrentWorldDataCollectorMt_NonHo);
        }
        return NIL;
    }

    public static SubLObject init_thcl_file_Previous() {
        defparameter("*THCL-GENERALITY-CUTOFF*", $int$1000);
        defparameter("*THCL-KB-SUBSET-COLLECTION*", NIL);
        defparameter("*THCL-FORTS-BY-FIAT*", NIL);
        defparameter("*THCL-PRED-ARGUMENT-TYPES-FOR-NON-DEFINITIONAL-PREDS*", $list59);
        deflexical("*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*", NIL);
        deflexical("*THCL-FILTER-COLLECTIONS*", $list69);
        deflexical("*THCL-NART-FILTER-COLLECTIONS*", NIL);
        deflexical("*THCL-QUOTED-FILTER-COLLECTIONS*", $list70);
        deflexical("*THCL-QUOTED-FILTER-EXCEPTIONS*", $list71);
        deflexical("*THCL-GENLS-FILTER-COLLECTIONS*", $list72);
        deflexical("*RANDOM-THCL-ASSERTION-MT*", $const84$CurrentWorldDataCollectorMt_NonHo);
        deflexical("*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*", NIL);
        deflexical("*CLARIFYING-COLLECTION?-CACHING-STATE*", NIL);
        return NIL;
    }

    static private final SubLSymbol $sym75$_CLARIFYING_COLLECTION__CACHING_STATE_ = makeSymbol("*CLARIFYING-COLLECTION?-CACHING-STATE*");

    public static final SubLObject setup_thcl_file_alt() {
        register_kb_function(EASILY_UNDERSTOOD_BY_HUMANS);
        note_memoized_function(FUNCTIONS_CORRESPONDING_TO_PREDICATE);
        note_globally_cached_function($sym52$FORT_PASSES_CACHED_THCL_TESTS_);
        note_globally_cached_function($sym69$KE_IRRELEVANT_TERM__VIA_INFERENCE);
        note_globally_cached_function($sym73$CLARIFYING_COLLECTION_);
        return NIL;
    }

    public static SubLObject setup_thcl_file() {
        if (SubLFiles.USE_V1) {
            register_kb_function(EASILY_UNDERSTOOD_BY_HUMANS);
            memoization_state.note_memoized_function(COMPUTE_THCL_STATUS_OF_FORT);
            memoization_state.note_memoized_function(FUNCTIONS_CORRESPONDING_TO_PREDICATE);
            memoization_state.note_memoized_function($sym60$NON_THCL_ARG_);
            memoization_state.note_globally_cached_function($sym67$FORT_PASSES_CACHED_THCL_TESTS_);
            memoization_state.note_globally_cached_function($sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE);
            memoization_state.note_globally_cached_function($sym89$CLARIFYING_COLLECTION_);
        }
        if (SubLFiles.USE_V2) {
            note_globally_cached_function($sym52$FORT_PASSES_CACHED_THCL_TESTS_);
            note_globally_cached_function($sym69$KE_IRRELEVANT_TERM__VIA_INFERENCE);
            note_globally_cached_function($sym73$CLARIFYING_COLLECTION_);
        }
        return NIL;
    }

    public static SubLObject setup_thcl_file_Previous() {
        register_kb_function(EASILY_UNDERSTOOD_BY_HUMANS);
        memoization_state.note_memoized_function(COMPUTE_THCL_STATUS_OF_FORT);
        memoization_state.note_memoized_function(FUNCTIONS_CORRESPONDING_TO_PREDICATE);
        memoization_state.note_memoized_function($sym60$NON_THCL_ARG_);
        memoization_state.note_globally_cached_function($sym67$FORT_PASSES_CACHED_THCL_TESTS_);
        memoization_state.note_globally_cached_function($sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE);
        memoization_state.note_globally_cached_function($sym89$CLARIFYING_COLLECTION_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_thcl_file();
    }

    @Override
    public void initializeVariables() {
        init_thcl_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_thcl_file();
    }

    static {
    }
}

/**
 * Total time: 359 ms
 */
