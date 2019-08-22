package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class czer_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new czer_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.czer_utilities";

    public static final String myFingerPrint = "f3937e96ff510cb1d24e599a2f208b0a011cf35c221b3e58ed5757b81d432ce9";

    // deflexical
    private static final SubLSymbol $formula_arg_intP_caching_state$ = makeSymbol("*FORMULA-ARG-INT?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $quoted_formula_arg_intP_caching_state$ = makeSymbol("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $sentence_arg_intP_caching_state$ = makeSymbol("*SENTENCE-ARG-INT?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $quoted_sentence_arg_intP_caching_state$ = makeSymbol("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $some_sentence_arg_intP_caching_state$ = makeSymbol("*SOME-SENTENCE-ARG-INT?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $some_quoted_sentence_arg_intP_caching_state$ = makeSymbol("*SOME-QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    // defparameter
    // Temporary control variable; should eventually stay T.
    private static final SubLSymbol $czer_evaluatable_predicate_fix_enabledP$ = makeSymbol("*CZER-EVALUATABLE-PREDICATE-FIX-ENABLED?*");

    // defparameter
    private static final SubLSymbol $opaque_arg_wrt_quoting_target$ = makeSymbol("*OPAQUE-ARG-WRT-QUOTING-TARGET*");



    private static final SubLObject $$canonicalizerDirectiveForArg = reader_make_constant_shell(makeString("canonicalizerDirectiveForArg"));



    private static final SubLObject $const3$canonicalizerDirectiveForArgAndRe = reader_make_constant_shell(makeString("canonicalizerDirectiveForArgAndRest"));

    private static final SubLObject $$canonicalizerDirectiveForAllArgs = reader_make_constant_shell(makeString("canonicalizerDirectiveForAllArgs"));

    private static final SubLObject $$LeaveSomeTermsAtEL = reader_make_constant_shell(makeString("LeaveSomeTermsAtEL"));

    public static final SubLList $list6 = list(reader_make_constant_shell(makeString("LeaveVariablesAtEL")));

    private static final SubLObject $const7$LeaveSomeTermsAtELAndAllowKeyword = reader_make_constant_shell(makeString("LeaveSomeTermsAtELAndAllowKeywordVariables"));

    public static final SubLList $list8 = list(reader_make_constant_shell(makeString("LeaveSomeTermsAtEL")), reader_make_constant_shell(makeString("AllowKeywordVariables")));

    private static final SubLObject $$AllowKeywordVariables = reader_make_constant_shell(makeString("AllowKeywordVariables"));

    public static final SubLList $list10 = list(reader_make_constant_shell(makeString("AllowGenericArgVariables")));

    private static final SubLObject $$LeaveVariablesAtEL = reader_make_constant_shell(makeString("LeaveVariablesAtEL"));

    public static final SubLList $list12 = list(reader_make_constant_shell(makeString("LeaveSomeTermsAtEL")));

    public static final SubLList $list13 = list(reader_make_constant_shell(makeString("LeaveSomeTermsAtELAndAllowKeywordVariables")));

    private static final SubLObject $$AllowGenericArgVariables = reader_make_constant_shell(makeString("AllowGenericArgVariables"));

    public static final SubLList $list15 = list(reader_make_constant_shell(makeString("AllowKeywordVariables")));



    public static final SubLString $str17$X__d = makeString("X-~d");



    public static final SubLString $str19$_a_was_not_a_canonical_variable = makeString("~a was not a canonical variable");

    private static final SubLObject $const20$RelaxArgTypeConstraintsForVariabl = reader_make_constant_shell(makeString("RelaxArgTypeConstraintsForVariables"));

    private static final SubLObject $$DontReOrderCommutativeTerms = reader_make_constant_shell(makeString("DontReOrderCommutativeTerms"));

    private static final SubLObject $$CycLIndexedTerm = reader_make_constant_shell(makeString("CycLIndexedTerm"));

    private static final SubLObject $$CycLExpression = reader_make_constant_shell(makeString("CycLExpression"));

    private static final SubLObject $$CycLExpression_Assertible = reader_make_constant_shell(makeString("CycLExpression-Assertible"));

    private static final SubLObject $$CycLExpression_Askable = reader_make_constant_shell(makeString("CycLExpression-Askable"));

    private static final SubLSymbol $sym26$FORMULA_ARG_INT_ = makeSymbol("FORMULA-ARG-INT?");

    private static final SubLObject $$CycLFormula = reader_make_constant_shell(makeString("CycLFormula"));

    private static final SubLSymbol $sym28$_FORMULA_ARG_INT__CACHING_STATE_ = makeSymbol("*FORMULA-ARG-INT?-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol $sym30$QUOTED_FORMULA_ARG_INT_ = makeSymbol("QUOTED-FORMULA-ARG-INT?");

    private static final SubLSymbol $sym31$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_ = makeSymbol("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym32$SENTENCE_ARG_INT_ = makeSymbol("SENTENCE-ARG-INT?");

    private static final SubLObject $$CycLSentence = reader_make_constant_shell(makeString("CycLSentence"));

    private static final SubLSymbol $sym34$_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*SENTENCE-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym35$CLEAR_SENTENCE_ARG_INT_ = makeSymbol("CLEAR-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym36$QUOTED_SENTENCE_ARG_INT_ = makeSymbol("QUOTED-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym37$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym38$CLEAR_QUOTED_SENTENCE_ARG_INT_ = makeSymbol("CLEAR-QUOTED-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym39$SOME_SENTENCE_ARG_INT_ = makeSymbol("SOME-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym40$_SOME_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*SOME-SENTENCE-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym41$CLEAR_SOME_SENTENCE_ARG_INT_ = makeSymbol("CLEAR-SOME-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym42$SOME_QUOTED_SENTENCE_ARG_INT_ = makeSymbol("SOME-QUOTED-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym43$_SOME_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*SOME-QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym44$CLEAR_SOME_QUOTED_SENTENCE_ARG_INT_ = makeSymbol("CLEAR-SOME-QUOTED-SENTENCE-ARG-INT?");

    private static final SubLObject $$CycLSentence_Askable = reader_make_constant_shell(makeString("CycLSentence-Askable"));

    private static final SubLObject $$CycLSentence_Assertible = reader_make_constant_shell(makeString("CycLSentence-Assertible"));

    private static final SubLObject $$CycLDenotationalTerm = reader_make_constant_shell(makeString("CycLDenotationalTerm"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));



    private static final SubLSymbol NPUT_BACK_CLAUSE_EL_VARIABLES = makeSymbol("NPUT-BACK-CLAUSE-EL-VARIABLES");

    private static final SubLSymbol PUT_BACK_CLAUSE_EL_VARIABLES = makeSymbol("PUT-BACK-CLAUSE-EL-VARIABLES");





    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLString $$$function = makeString("function");

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLSymbol $sym58$STRING_ = makeSymbol("STRING=");

    private static final SubLString $str59$ = makeString("");

    private static final SubLString $str60$__s = makeString("-~s");

    private static final SubLSymbol $sym61$_X = makeSymbol("?X");

    private static final SubLString $str62$Could_not_create_a_unique_HL_var_ = makeString("Could not create a unique HL var wrt ~a");



    private static final SubLSymbol $sym64$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLObject $$trueSentence = reader_make_constant_shell(makeString("trueSentence"));



    private static final SubLObject $$functionCommutesWith = reader_make_constant_shell(makeString("functionCommutesWith"));

    private static final SubLSymbol $sym68$FORT_OR_NAUT_WITH_CORRESPONDING_NART_ = makeSymbol("FORT-OR-NAUT-WITH-CORRESPONDING-NART?");



    private static final SubLSymbol NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");

    private static final SubLSymbol $sym71$EQUALS_EL_MEMOIZED_ = makeSymbol("EQUALS-EL-MEMOIZED?");





    private static final SubLSymbol CLAUSAL_FORM_P = makeSymbol("CLAUSAL-FORM-P");



    private static final SubLString $str76$Unexpected_clausal_form__s = makeString("Unexpected clausal form ~s");

    private static final SubLSymbol $sym77$NON_NULL_CLOSED_TERM_ = makeSymbol("NON-NULL-CLOSED-TERM?");

    private static final SubLSymbol $sym78$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol EL_VARIABLE_TOKEN = makeSymbol("EL-VARIABLE-TOKEN");

    private static final SubLSymbol $OPAQUIFIED_EL_VARIABLE = makeKeyword("OPAQUIFIED-EL-VARIABLE");



    private static final SubLSymbol $sym82$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_ = makeSymbol("RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?");



    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLSymbol $sym85$EVALUATABLE_EXPRESSION_ = makeSymbol("EVALUATABLE-EXPRESSION?");

    private static final SubLSymbol TRANSFORM_EVALUATION_EXPRESSION = makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");

    private static final SubLString $str87$_s__s_does_not_adequately_specify = makeString("~s ~s does not adequately specify a microtheory.");

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell(makeString("ist-Asserted"));

    private static final SubLSymbol $sym89$HL_VAR_ = makeSymbol("HL-VAR?");

    private static final SubLObject $$EscapeQuote = reader_make_constant_shell(makeString("EscapeQuote"));

    private static final SubLSymbol $sym91$QUOTED_TERM_WITH_HL_VAR_ = makeSymbol("QUOTED-TERM-WITH-HL-VAR?");

    private static final SubLSymbol ESCAPE_TERM = makeSymbol("ESCAPE-TERM");

    private static final SubLSymbol NESCAPE_QUOTE_HL_VARS = makeSymbol("NESCAPE-QUOTE-HL-VARS");

    private static final SubLSymbol $sym94$DECONTEXTUALIZED_CLAUSE_ = makeSymbol("DECONTEXTUALIZED-CLAUSE?");

    private static final SubLSymbol GENERALIZED_IST_CLAUSE_P = makeSymbol("GENERALIZED-IST-CLAUSE-P");

    private static final SubLList $list96 = list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("ist-Asserted")));

    private static final SubLSymbol OPAQUE_ARG_WRT_QUOTING_SEEKER = makeSymbol("OPAQUE-ARG-WRT-QUOTING-SEEKER");

    private static final SubLSymbol $OPAQUE_ARG_FOUND = makeKeyword("OPAQUE-ARG-FOUND");

    private static final SubLSymbol CYCL_FORMULA_P = makeSymbol("CYCL-FORMULA-P");











    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLSymbol $sym108$LIT__ = makeSymbol("LIT-<");

    private static final SubLSymbol CLAUSE_BINDING_LIST_PAIRS_LITERAL = makeSymbol("CLAUSE-BINDING-LIST-PAIRS-LITERAL");

    private static final SubLList $list110 = list(makeSymbol("DNF-CLAUSE"), makeSymbol("EL-TO-HL-BINDINGS"), makeSymbol("FREE-EL-VARS"));

    private static final SubLSymbol $sym111$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol $sym112$SKOLEM_NART_ = makeSymbol("SKOLEM-NART?");





    private static final SubLString $str115$__Error__assert_failed__S___ = makeString("~%Error: assert failed ~S.~%");

    private static final SubLString $str116$__Error__Can_t_find_assertion___ = makeString("~%Error: Can't find assertion:~%");



    private static final SubLString $str118$__Form___A_in__A__ = makeString("~%Form: ~A in ~A~%");

    private static final SubLString $str119$__Error__assert_failed__ = makeString("~%Error: assert failed~%");

    private static final SubLString $str120$__Error__Can_t_find_assertions___ = makeString("~%Error: Can't find assertions: ~A~%");

    private static final SubLString $str121$__The_assertion_is__S___ = makeString("~%The assertion is ~S.~%");

    private static final SubLString $str122$__Its_EL_form_is__S_in__S___ = makeString("~%Its EL form is ~S in ~S.~%");

    private static final SubLString $str123$__Error__Can_t_find_assertions___ = makeString("~%Error: Can't find assertions: ~A in ~A~%");

    private static final SubLString $str124$__Its_New_EL_form_is__S_in__S___ = makeString("~%Its New EL form is ~S in ~S.~%");

    private static final SubLString $str125$__Error__EL_mismatch___Original__ = makeString("~%Error: EL mismatch:~%Original: ~A ~%From assertion: ~A");

    private static final SubLString $str126$__Error__assert_failed___S__ = makeString("~%Error: assert failed: ~S~%");

    private static final SubLString $str127$__Error__unassert_failed___S__ = makeString("~%Error: unassert failed: ~S~%");

    private static final SubLSymbol $sym128$EQUALS_EL_ = makeSymbol("EQUALS-EL?");













    private static final SubLObject $list135 = _constant_135_initializer();

    public static SubLObject some_canonicalizer_directive_assertionsP(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != forts.fort_p(relation)) && (NIL != some_canonicalizer_directive_assertions_somewhereP(relation))) {
            SubLObject cdolist_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
            SubLObject czer_pred = NIL;
            czer_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(relation, czer_pred, mt, ONE_INTEGER, $TRUE)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                czer_pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject some_canonicalizer_directive_assertions_somewhereP(final SubLObject relation) {
        if (NIL != forts.fort_p(relation)) {
            SubLObject foundP = NIL;
            if (NIL == foundP) {
                SubLObject csome_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
                SubLObject czer_pred = NIL;
                czer_pred = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    if (NIL != somewhere_cache.some_pred_assertion_somewhereP(czer_pred, relation, ONE_INTEGER, UNPROVIDED)) {
                        foundP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    czer_pred = csome_list_var.first();
                } 
            }
            return foundP;
        }
        return NIL;
    }

    public static SubLObject canonicalizer_directive_for_argP(final SubLObject relation, final SubLObject argnum, final SubLObject directive, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        if (NIL == some_canonicalizer_directive_assertions_somewhereP(relation)) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            SubLObject pred_var = $$canonicalizerDirectiveForArg;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$1 = resultP;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
                                if (NIL != valid_$3) {
                                    final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                    final SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                    resultP = makeBoolean(argnum.eql(asserted_argnum) && (NIL != kb_utilities.kbeq(directive, asserted_directive)));
                                }
                                done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != resultP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                } 
            }
            pred_var = $const3$canonicalizerDirectiveForArgAndRe;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$2 = resultP;
                            final SubLObject token_var_$3 = NIL;
                            while (NIL == done_var_$2) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(ass));
                                if (NIL != valid_$4) {
                                    final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                    final SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                    resultP = makeBoolean(((NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) && argnum.numGE(asserted_argnum)) && (NIL != kb_utilities.kbeq(directive, asserted_directive)));
                                }
                                done_var_$2 = makeBoolean((NIL == valid_$4) || (NIL != resultP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                } 
            }
            pred_var = $$canonicalizerDirectiveForAllArgs;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$3 = resultP;
                            final SubLObject token_var_$4 = NIL;
                            while (NIL == done_var_$3) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(ass));
                                if (NIL != valid_$5) {
                                    final SubLObject asserted_directive2 = assertions_high.gaf_arg2(ass);
                                    resultP = kb_utilities.kbeq(directive, asserted_directive2);
                                }
                                done_var_$3 = makeBoolean((NIL == valid_$5) || (NIL != resultP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == resultP) {
            SubLObject csome_list_var = direct_spec_canonicalizer_directives(directive);
            SubLObject spec_directive = NIL;
            spec_directive = csome_list_var.first();
            while ((NIL == resultP) && (NIL != csome_list_var)) {
                if (NIL != canonicalizer_directive_for_argP(relation, argnum, spec_directive, mt)) {
                    resultP = T;
                }
                csome_list_var = csome_list_var.rest();
                spec_directive = csome_list_var.first();
            } 
        }
        return resultP;
    }

    public static SubLObject direct_genl_canonicalizer_directives(final SubLObject directive) {
        if (directive.eql($$LeaveSomeTermsAtEL)) {
            return $list6;
        }
        if (directive.eql($const7$LeaveSomeTermsAtELAndAllowKeyword)) {
            return $list8;
        }
        if (directive.eql($$AllowKeywordVariables)) {
            return $list10;
        }
        return NIL;
    }

    public static SubLObject direct_spec_canonicalizer_directives(final SubLObject directive) {
        if (directive.eql($$LeaveVariablesAtEL)) {
            return $list12;
        }
        if (directive.eql($$LeaveSomeTermsAtEL)) {
            return $list13;
        }
        if (directive.eql($$AllowKeywordVariables)) {
            return $list13;
        }
        if (directive.eql($$AllowGenericArgVariables)) {
            return $list15;
        }
        return NIL;
    }

    public static SubLObject get_nth_canonical_variable(final SubLObject n, SubLObject type) {
        if (type == UNPROVIDED) {
            type = czer_vars.$canonical_variable_type$.getDynamicValue();
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql($EL_VAR)) {
            return cycl_variables.make_el_var(format(NIL, $str17$X__d, n));
        }
        if (pcase_var.eql($KB_VAR)) {
            return variables.find_variable_by_id(n);
        }
        return NIL;
    }

    public static SubLObject canonical_variable_number(final SubLObject var) {
        if (NIL != cycl_grammar.el_variable_p(var)) {
            final SubLObject name = cycl_variables.el_var_name(var);
            final SubLObject suffix = string_utilities.substring(name, THREE_INTEGER, UNPROVIDED);
            final SubLObject num = string_utilities.string_to_integer(suffix);
            if (num.isInteger()) {
                return num;
            }
        } else
            if (NIL != cycl_grammar.hl_variable_p(var)) {
                return variables.variable_id(var);
            }

        return Errors.error($str19$_a_was_not_a_canonical_variable, var);
    }

    public static SubLObject arg_permits_generic_arg_variablesP(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return canonicalizer_directive_for_argP(reln, argnum, $$AllowGenericArgVariables, mt);
        }
        return NIL;
    }

    public static SubLObject arg_permits_keyword_variablesP(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return canonicalizer_directive_for_argP(reln, argnum, $$AllowKeywordVariables, mt);
        }
        return NIL;
    }

    public static SubLObject relax_arg_type_constraints_for_variables_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, $const20$RelaxArgTypeConstraintsForVariabl, mt);
    }

    public static SubLObject dont_reorder_commutative_terms_for_args(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject argnums = NIL;
        if (NIL == some_canonicalizer_directive_assertions_somewhereP(relation)) {
            return NIL;
        }
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            SubLObject assertions = cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs($$canonicalizerDirectiveForArg, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, THREE_INTEGER, $TRUE);
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                if (NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) {
                    argnums = cons(asserted_argnum, argnums);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            assertions = cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs($const3$canonicalizerDirectiveForArgAndRe, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, THREE_INTEGER, $TRUE);
            ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                final SubLObject v_arity = arity.arity(relation);
                if (NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) {
                    SubLObject end_var;
                    SubLObject argnum;
                    for (end_var = add(v_arity, ONE_INTEGER), argnum = NIL, argnum = asserted_argnum; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                        argnums = cons(argnum, argnums);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$canonicalizerDirectiveForAllArgs, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, TWO_INTEGER, $TRUE);
            if (NIL != assertions) {
                final SubLObject v_arity2 = arity.arity(relation);
                SubLObject end_var2;
                SubLObject argnum2;
                for (end_var2 = add(v_arity2, ONE_INTEGER), argnum2 = NIL, argnum2 = ONE_INTEGER; !argnum2.numGE(end_var2); argnum2 = number_utilities.f_1X(argnum2)) {
                    argnums = cons(argnum2, argnums);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(argnums, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject possibly_assertion_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject assertion_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP(czer_vars.$meta_arg_type$.getGlobalValue(), kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP(czer_vars.$meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject indexed_argP(final SubLObject reln, final SubLObject psn) {
        if (psn.numG(ZERO_INTEGER)) {
            SubLObject formulaP = NIL;
            if (NIL == formulaP) {
                SubLObject csome_list_var = kb_accessors.argn_isa(reln, psn, UNPROVIDED);
                SubLObject type = NIL;
                type = csome_list_var.first();
                while ((NIL == formulaP) && (NIL != csome_list_var)) {
                    if (NIL != genls.genlsP(type, $$CycLIndexedTerm, UNPROVIDED, UNPROVIDED)) {
                        formulaP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    type = csome_list_var.first();
                } 
            }
            return formulaP;
        }
        return NIL;
    }

    public static SubLObject expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLExpression, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLExpression, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject assertible_expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLExpression_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLExpression_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject askable_expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLExpression_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLExpression_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isInteger())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        mt = hlmt.hlmt_monad_mt(mt);
        return makeBoolean((NIL != formula_arg_intP(relation, argnum, mt)) || (NIL != quoted_formula_arg_intP(relation, argnum, mt)));
    }

    public static SubLObject clear_formula_arg_intP() {
        final SubLObject cs = $formula_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($formula_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject formula_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP($$CycLFormula, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static SubLObject formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject caching_state = $formula_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym26$FORMULA_ARG_INT_, $sym28$_FORMULA_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(formula_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_quoted_formula_arg_intP() {
        final SubLObject cs = $quoted_formula_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_quoted_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($quoted_formula_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject quoted_formula_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP($$CycLFormula, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static SubLObject quoted_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject caching_state = $quoted_formula_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym30$QUOTED_FORMULA_ARG_INT_, $sym31$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(quoted_formula_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isInteger())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        mt = hlmt.hlmt_monad_mt(mt);
        return makeBoolean((NIL != sentence_arg_intP(relation, argnum, mt)) || (NIL != quoted_sentence_arg_intP(relation, argnum, mt)));
    }

    public static SubLObject clear_sentence_arg_intP() {
        final SubLObject cs = $sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentence_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static SubLObject sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        SubLObject caching_state = $sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym32$SENTENCE_ARG_INT_, $sym34$_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym35$CLEAR_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(sentence_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_quoted_sentence_arg_intP() {
        final SubLObject cs = $quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($quoted_sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject quoted_sentence_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static SubLObject quoted_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        SubLObject caching_state = $quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym36$QUOTED_SENTENCE_ARG_INT_, $sym37$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym38$CLEAR_QUOTED_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(quoted_sentence_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject some_sentence_argP(final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != some_sentence_arg_intP(reln, mt)) || (NIL != some_quoted_sentence_arg_intP(reln, mt)));
    }

    public static SubLObject clear_some_sentence_arg_intP() {
        final SubLObject cs = $some_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_some_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($some_sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject some_sentence_arg_intP_internal(final SubLObject relation, final SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.arg_isa(relation, mt), mt, UNPROVIDED);
    }

    public static SubLObject some_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        SubLObject caching_state = $some_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym39$SOME_SENTENCE_ARG_INT_, $sym40$_SOME_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym41$CLEAR_SOME_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(some_sentence_arg_intP_internal(relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_some_quoted_sentence_arg_intP() {
        final SubLObject cs = $some_quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_some_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($some_quoted_sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject some_quoted_sentence_arg_intP_internal(final SubLObject relation, final SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.arg_quoted_isa(relation, mt), mt, UNPROVIDED);
    }

    public static SubLObject some_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        SubLObject caching_state = $some_quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym42$SOME_QUOTED_SENTENCE_ARG_INT_, $sym43$_SOME_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym44$CLEAR_SOME_QUOTED_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(some_quoted_sentence_arg_intP_internal(relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject askable_formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject assertable_formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject askable_sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject assertable_sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject denotational_term_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP($$CycLDenotationalTerm, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLDenotationalTerm, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject leave_some_terms_at_el_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, $$LeaveSomeTermsAtEL, mt);
    }

    public static SubLObject leave_variables_at_el_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, $$LeaveVariablesAtEL, mt);
    }

    public static SubLObject arg_isa_quotedP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            SubLObject ans = NIL;
            final SubLObject arg_isa_quoted_arg = kb_accessors.arg_quoted_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
            if (NIL != arg_isa_quoted_arg) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    ans = kb_mapping_utilities.fpred_value(relation, kb_accessors.arg_quoted_isa_pred(argnum, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return ans;
        }
        return NIL;
    }

    public static SubLObject distributing_meta_predP(final SubLObject pred) {
        return fort_types_interface.distributing_meta_knowledge_predicate_p(pred);
    }

    public static SubLObject find_hl_gaf(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject assertion = safe_find_gaf_genl_mts(formula, mt);
        if (NIL != term.kb_assertionP(assertion)) {
            return assertion;
        }
        if (NIL != mt) {
            return list($$ist, mt, formula);
        }
        return formula;
    }

    public static SubLObject find_hl_gaf_if(final SubLObject formula, final SubLObject mt) {
        final SubLObject assertion = safe_find_gaf_genl_mts(formula, mt);
        if (NIL != term.kb_assertionP(assertion)) {
            return assertion;
        }
        return NIL;
    }

    public static SubLObject safe_find_gaf_genl_mts(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gaf = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    gaf = kb_indexing.find_gaf_genl_mts(formula, mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return gaf;
    }

    public static SubLObject nput_back_clause_el_variables(final SubLObject list) {
        SubLObject clause = list.first();
        final SubLObject blist = second(list);
        clause = nescape_quote_hl_vars(clause);
        SubLObject cdolist_list_var = blist;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clause = nsubst(binding.first(), binding.rest(), clause, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return clause;
    }

    public static SubLObject put_back_clause_el_variables(final SubLObject list) {
        SubLObject clause = list.first();
        final SubLObject blist = second(list);
        clause = nescape_quote_hl_vars(copy_tree(clause));
        SubLObject cdolist_list_var = blist;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clause = nsubst(binding.first(), binding.rest(), clause, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return clause;
    }

    public static SubLObject list_of_clause_binding_list_pairs_p(final SubLObject v_object) {
        if (!v_object.isCons()) {
            return NIL;
        }
        SubLObject cdolist_list_var = v_object;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL == list_utilities.lengthLE(pair, THREE_INTEGER, UNPROVIDED)) || (NIL == clauses.cnf_p(pair.first()))) || (NIL == bindings.binding_list_p(second(pair)))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject clause_binding_list_pairs_literal(final SubLObject v_object) {
        return clauses.singleton_clause_literal(v_object.first());
    }

    public static SubLObject nextract_el_clauses(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? Mapping.mapcar(NPUT_BACK_CLAUSE_EL_VARIABLES, thing) : thing;
    }

    public static SubLObject extract_el_clauses(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? Mapping.mapcar(PUT_BACK_CLAUSE_EL_VARIABLES, thing) : thing;
    }

    public static SubLObject extract_hl_clauses(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? Mapping.mapcar(FIRST, thing) : thing;
    }

    public static SubLObject nextract_hl_clauses(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? list_utilities.nmapcar(FIRST, thing) : thing;
    }

    public static SubLObject extract_blists(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? Mapping.mapcar(SECOND, thing) : thing;
    }

    public static SubLObject nextract_blists(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? list_utilities.nmapcar(SECOND, thing) : thing;
    }

    public static SubLObject fn_tou_lit(final SubLObject fn_term, final SubLObject literals) {
        SubLObject tou = NIL;
        if (NIL == tou) {
            SubLObject csome_list_var = tou_lits(literals);
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == tou) && (NIL != csome_list_var)) {
                if (fn_term.equal(literal_arg2(lit, UNPROVIDED))) {
                    tou = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return tou;
    }

    public static SubLObject fn_equals_lit(final SubLObject fn_term, final SubLObject literals) {
        SubLObject equals_lit = NIL;
        if (NIL == equals_lit) {
            SubLObject csome_list_var = equals_lits(literals);
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == equals_lit) && (NIL != csome_list_var)) {
                if (fn_term.equal(third(lit))) {
                    equals_lit = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return equals_lit;
    }

    public static SubLObject fn_evaluate_lit(final SubLObject fn_term, final SubLObject literals, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        SubLObject evaluate_lit = NIL;
        if (NIL == evaluate_lit) {
            SubLObject csome_list_var = literals;
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == evaluate_lit) && (NIL != csome_list_var)) {
                if ((NIL != evaluate_litP(lit, UNPROVIDED)) && (NIL != funcall(test, fn_term, literal_arg2(lit, UNPROVIDED)))) {
                    evaluate_lit = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return evaluate_lit;
    }

    public static SubLObject fn_some_non_evaluatable_referenceP(final SubLObject fn_term, final SubLObject literals, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $czer_evaluatable_predicate_fix_enabledP$.getDynamicValue(thread)) {
            return T;
        }
        SubLObject non_evaluatable_reference = NIL;
        if (NIL == non_evaluatable_reference) {
            SubLObject csome_list_var = literals;
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == non_evaluatable_reference) && (NIL != csome_list_var)) {
                final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(lit);
                if (((NIL == forts.fort_p(predicate)) || (NIL == relation_evaluation.evaluatable_predicateP(predicate, UNPROVIDED))) && (NIL != list_utilities.tree_find(fn_term, lit, test, UNPROVIDED))) {
                    non_evaluatable_reference = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return non_evaluatable_reference;
    }

    public static SubLObject make_nart_var_tou_lit(final SubLObject fn_term) {
        return make_binary_formula($$termOfUnit, make_nart_var_for_tou_lit(cycl_utilities.formula_arg0(fn_term)), fn_term);
    }

    public static SubLObject make_nart_var_for_tou_lit(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p(czer_main.$tou_skolem_blist$.getDynamicValue(thread))) {
            final SubLObject orig_var = list_utilities.alist_lookup(czer_main.$tou_skolem_blist$.getDynamicValue(thread), fn, UNPROVIDED, UNPROVIDED);
            if (NIL != orig_var) {
                return orig_var;
            }
        }
        return cycl_variables.make_el_var(clause_new_el_var_name(NIL != forts.fort_p(fn) ? constants_high.constant_name(fn) : $$$function));
    }

    public static SubLObject make_nart_var_equals_lit(final SubLObject fn_term) {
        return make_binary_formula($$equals, cycl_variables.make_el_var(clause_new_el_var_name(NIL != forts.fort_p(cycl_utilities.formula_arg0(fn_term)) ? constants_high.constant_name(cycl_utilities.formula_arg0(fn_term)) : $$$function)), fn_term);
    }

    public static SubLObject make_nart_var_evaluate_lit(final SubLObject fn_term) {
        return make_binary_formula($$evaluate, cycl_variables.make_el_var(clause_new_el_var_name(NIL != forts.fort_p(cycl_utilities.formula_arg0(fn_term)) ? constants_high.constant_name(cycl_utilities.formula_arg0(fn_term)) : $$$function)), fn_term);
    }

    public static SubLObject clause_new_el_var_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_name = unique_var_name_wrt(name, czer_vars.$clause_el_var_names$.getDynamicValue(thread));
        if (NIL == subl_promotions.memberP(new_name, czer_vars.$clause_el_var_names$.getDynamicValue(thread), symbol_function($sym58$STRING_), UNPROVIDED)) {
            czer_vars.$clause_el_var_names$.setDynamicValue(cons(new_name, czer_vars.$clause_el_var_names$.getDynamicValue(thread)), thread);
        }
        return new_name;
    }

    public static SubLObject unique_var_name_wrt(final SubLObject string, final SubLObject strings) {
        SubLObject n = NIL;
        SubLObject post = NIL;
        SubLObject new_string = NIL;
        SubLObject var_string = NIL;
        n = ZERO_INTEGER;
        post = $str59$;
        for (new_string = cconcatenate(string, post), var_string = make_czer_el_var_name(new_string); NIL != subl_promotions.memberP(var_string, strings, symbol_function($sym58$STRING_), UNPROVIDED); var_string = make_czer_el_var_name(new_string)) {
            n = add(n, ONE_INTEGER);
            post = format(NIL, $str60$__s, n);
            new_string = cconcatenate(string, post);
        }
        return var_string;
    }

    public static SubLObject unique_el_var_wrt_expression(final SubLObject expression, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $sym61$_X;
        }
        SubLObject new_var;
        for (new_var = v_default; NIL != cycl_utilities.expression_find(new_var, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED); new_var = czer_main.uniquify(new_var)) {
        }
        return new_var;
    }

    public static SubLObject unique_hl_var_wrt_expression(final SubLObject expression, SubLObject expression2) {
        if (expression2 == UNPROVIDED) {
            expression2 = NIL;
        }
        SubLObject end_var;
        SubLObject num;
        SubLObject hl_var;
        for (end_var = variables.variable_count(), num = NIL, num = ZERO_INTEGER; !num.numGE(end_var); num = number_utilities.f_1X(num)) {
            hl_var = variables.find_variable_by_id(num);
            if ((NIL == cycl_utilities.expression_find(hl_var, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find(hl_var, expression2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return hl_var;
            }
        }
        return Errors.error($str62$Could_not_create_a_unique_HL_var_, expression);
    }

    public static SubLObject make_czer_el_var_name(final SubLObject string) {
        return cycl_variables.el_var_name(cycl_variables.make_el_var(string));
    }

    public static SubLObject canon_varP(final SubLObject candidate_variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != candidate_variable) && (NIL != (czer_vars.$canon_var_function$.getDynamicValue(thread) == $DEFAULT ? cycl_variables.cyc_varP(candidate_variable) : funcall(czer_vars.$canon_var_function$.getDynamicValue(thread), candidate_variable))));
    }

    public static SubLObject true_sentenceP(final SubLObject formula) {
        if (NIL == el_negation_p(formula)) {
            return true_sentence_litP(formula);
        }
        return NIL;
    }

    public static SubLObject true_negated_varP(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym64$CYC_VAR_;
        }
        return makeBoolean(((NIL != true_sentenceP(formula)) && (NIL != el_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) && (NIL != funcall(varP, cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED))));
    }

    public static SubLObject true_negated_formulaP(final SubLObject formula) {
        if (NIL != true_sentenceP(formula)) {
            return makeBoolean((NIL != el_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED))) || (NIL != el_quantified_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED))));
        }
        return NIL;
    }

    public static SubLObject true_var_formulaP(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym64$CYC_VAR_;
        }
        if (NIL != true_sentenceP(formula)) {
            return funcall(varP, cycl_utilities.formula_arg1(formula, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject encapsulate_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sequence_var(formula, UNPROVIDED)) {
            if ((((NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread)) && (NIL != el_formula_p(formula))) && (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_operator(formula)))) && (NIL != wff.el_wff_syntaxP(formula, UNPROVIDED))) {
                return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
            }
            SubLObject result = NIL;
            final SubLObject formula_$13;
            final SubLObject tempformula = formula_$13 = (NIL != sequence_var(formula, UNPROVIDED)) ? strip_sequence_var(formula) : formula;
            result = encapsulate_formulaP(formula_$13);
            return result;
        } else {
            if ((NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread)) && (NIL != cycl_variables.el_varP(formula))) {
                return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
            }
            if ((NIL != czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread)) && (NIL != intensional_formulaP(formula))) {
                return czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread);
            }
            return NIL;
        }
    }

    public static SubLObject encapsulate_formula(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym64$CYC_VAR_;
        }
        if (NIL != sequence_var(formula, UNPROVIDED)) {
            return make_unary_formula($$trueSentence, formula);
        }
        if (NIL != funcall(varP, formula)) {
            return make_var_formula_lit(formula);
        }
        if (NIL != intensional_formulaP(formula)) {
            return make_intensional_lit(formula);
        }
        return formula;
    }

    public static SubLObject intensional_formulaP(final SubLObject formula) {
        return makeBoolean((((NIL != within_disjunctionP()) && (NIL == within_negated_disjunctionP())) && (((NIL != el_universal_p(formula)) && ((NIL == el_quantified_negation_p(formula)) || (NIL == within_negationP()))) || (((NIL != el_existential_p(formula)) || (NIL != el_bounded_existential_p(formula))) && ((NIL != within_negationP()) || (NIL != el_quantified_negation_p(formula)))))) || ((NIL != within_askP()) && (((NIL != within_negationP()) && ((NIL != el_existential_p(formula)) || (NIL != el_bounded_existential_p(formula)))) || ((NIL == within_negationP()) && (NIL != el_universal_p(formula))))));
    }

    public static SubLObject make_var_formula_lit(final SubLObject var) {
        return make_unary_formula($$trueSentence, var);
    }

    public static SubLObject make_intensional_lit(final SubLObject formula) {
        if (((NIL != within_askP()) && (NIL != within_negationP())) && (NIL != el_general_existential_p(formula))) {
            return make_intensional_lit_int(formula);
        }
        if (NIL != within_negationP()) {
            return make_unary_formula($$trueSentence, formula);
        }
        if (NIL != within_askP()) {
            return make_unary_formula($$trueSentence, formula);
        }
        return make_intensional_lit_int(formula);
    }

    public static SubLObject make_intensional_lit_int(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
        try {
            czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
            result = cycl_utilities.negate(make_unary_formula($$trueSentence, simplifier.simplify_cycl_sentence(clausifier.do_negations(cycl_utilities.negate(formula)), UNPROVIDED)));
        } finally {
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject formula_has_expansionP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        return relation_has_expansionP(cycl_utilities.formula_operator(formula), mt);
    }

    public static SubLObject relation_has_expansionP(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(relation)) {
            SubLObject result = NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                result = verbosifier.el_expansionP(relation);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject within_negationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return czer_vars.$within_negationP$.getDynamicValue(thread);
    }

    public static SubLObject within_disjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_disjunctionP$.getDynamicValue(thread);
    }

    public static SubLObject within_conjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_conjunctionP$.getDynamicValue(thread);
    }

    public static SubLObject within_negated_disjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_negated_disjunctionP$.getDynamicValue(thread);
    }

    public static SubLObject commuting_functionsP(final SubLObject func1, final SubLObject func2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(func1)) && (NIL != forts.fort_p(func2))) && ((NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$functionCommutesWith, func1, func2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$functionCommutesWith, func2, func1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject reifiable_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(functor)) || (NIL != term.first_order_nautP(functor))) && (NIL != fort_types_interface.isa_reifiable_functionP(functor, mt)));
    }

    public static SubLObject reifiable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != (NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread) ? makeBoolean((NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term))) || (NIL != reifiable_functorP(cycl_utilities.nat_functor(v_term), mt))) : makeBoolean((NIL != reifiable_functorP(cycl_utilities.nat_functor(v_term), mt)) && (NIL != term.closed_fn_termP(v_term))))));
    }

    public static SubLObject wf_reifiable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != reifiable_function_termP(v_term, mt)) && (NIL != wff.el_wftP(v_term, mt, UNPROVIDED)));
    }

    public static SubLObject reifiable_termP(final SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) || (NIL != reifiable_function_termP(v_term, UNPROVIDED))) || (NIL != term.skolem_termP(v_term)));
    }

    public static SubLObject reifiable_nat_termP(final SubLObject v_term) {
        return makeBoolean((NIL == constant_p(v_term)) && (NIL != reifiable_termP(v_term)));
    }

    public static SubLObject unreified_reifiable_nat_termP(final SubLObject v_term) {
        return makeBoolean(((NIL != reifiable_nat_termP(v_term)) && (NIL == nart_handles.nart_p(v_term))) && (NIL == narts_high.find_nart(v_term)));
    }

    public static SubLObject reifiable_nautP(final SubLObject v_term, SubLObject varP, SubLObject mt) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym64$CYC_VAR_);
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.closed_nautP(v_term, varP)) {
            return makeBoolean((NIL != reifiable_function_termP(v_term, mt)) || (NIL != narts_high.find_nart(v_term)));
        }
        return NIL;
    }

    public static SubLObject fort_or_naut_with_corresponding_nartP(final SubLObject v_term) {
        return makeBoolean((NIL != forts.fort_p(v_term)) || (NIL != naut_with_corresponding_nartP(v_term)));
    }

    public static SubLObject list_of_fort_or_naut_with_corresponding_nartP(final SubLObject obj) {
        return list_utilities.list_of_type_p($sym68$FORT_OR_NAUT_WITH_CORRESPONDING_NART_, obj);
    }

    public static SubLObject naut_with_corresponding_nartP(final SubLObject v_term) {
        if (NIL != term.ground_nautP(v_term, symbol_function(VARIABLE_P))) {
            return list_utilities.sublisp_boolean(narts_high.find_nart(v_term));
        }
        return NIL;
    }

    public static SubLObject evaluatable_function_symbolP(final SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(symbol)) && (NIL != fort_types_interface.evaluatable_function_p(symbol)));
    }

    public static SubLObject evaluatable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != evaluatable_function_symbolP(cycl_utilities.nat_functor(v_term), mt)));
    }

    public static SubLObject unpackage_cnf_clause(final SubLObject cnf) {
        final SubLObject neg_lits = Mapping.mapcar(symbol_function(NEGATE_ATOMIC), clauses.neg_lits(cnf));
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        return simplifier.disjoin(nunion(neg_lits, pos_lits, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject unpackage_dnf_clause(final SubLObject dnf) {
        final SubLObject neg_lits = Mapping.mapcar(symbol_function(NEGATE_ATOMIC), clauses.neg_lits(dnf));
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        return simplifier.conjoin(nunion(neg_lits, pos_lits, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject equals_el_memoizedP_internal(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        return equals_el_intP(object_1, object_2, mt, clausal_form, T, T);
    }

    public static SubLObject equals_el_memoizedP(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return equals_el_memoizedP_internal(object_1, object_2, mt, clausal_form);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym71$EQUALS_EL_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym71$EQUALS_EL_MEMOIZED_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym71$EQUALS_EL_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(object_1, object_2, mt, clausal_form);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (object_1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (object_2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && clausal_form.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(equals_el_memoizedP_internal(object_1, object_2, mt, clausal_form)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(object_1, object_2, mt, clausal_form));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject queries_equal_at_elP(final SubLObject query1, final SubLObject query2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return equals_elP(query1, query2, mt, $DNF, UNPROVIDED);
    }

    public static SubLObject terms_equal_at_elP(final SubLObject term1, final SubLObject term2, SubLObject perform_equals_unification) {
        if (perform_equals_unification == UNPROVIDED) {
            perform_equals_unification = $perform_equals_unification$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
        try {
            $perform_equals_unification$.bind(perform_equals_unification, thread);
            result = makeBoolean((NIL != equals.equalsP(term1, term2, UNPROVIDED, UNPROVIDED)) || (NIL != equals.equalsP(cycl_utilities.hl_to_el(term1), cycl_utilities.hl_to_el(term2), UNPROVIDED, UNPROVIDED)));
        } finally {
            $perform_equals_unification$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject equals_elP(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form, SubLObject canonicalize_sentencesP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        if (canonicalize_sentencesP == UNPROVIDED) {
            canonicalize_sentencesP = T;
        }
        return equals_el_intP(object_1, object_2, mt, clausal_form, NIL, canonicalize_sentencesP);
    }

    public static SubLObject equals_el_intP(final SubLObject object_1, final SubLObject object_2, final SubLObject mt, final SubLObject clausal_form, final SubLObject memoized_internalsP, final SubLObject canonicalize_sentencesP) {
        assert NIL != clause_utilities.clausal_form_p(clausal_form) : "clause_utilities.clausal_form_p(clausal_form) " + "CommonSymbols.NIL != clause_utilities.clausal_form_p(clausal_form) " + clausal_form;
        assert NIL != booleanp(memoized_internalsP) : "Types.booleanp(memoized_internalsP) " + "CommonSymbols.NIL != Types.booleanp(memoized_internalsP) " + memoized_internalsP;
        if (NIL != equals.equalsP(object_1, object_2, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != assertion_handles.assertion_p(object_1)) {
            if (NIL != assertion_handles.assertion_p(object_2)) {
                return equals.equalsP(uncanonicalizer.assertion_el_ist_formula(object_1), uncanonicalizer.assertion_el_ist_formula(object_2), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != el_formula_p(object_2)) {
                return equals_el_intP(uncanonicalizer.assertion_el_ist_formula(object_1), object_2, mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
            }
        } else
            if (NIL != assertion_handles.assertion_p(object_2)) {
                if (NIL != el_formula_p(object_1)) {
                    return equals_el_intP(object_1, uncanonicalizer.assertion_el_ist_formula(object_2), mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
                }
            } else
                if (NIL != nart_handles.nart_p(object_1)) {
                    if (NIL != possibly_naut_p(object_2)) {
                        return equals_el_intP(narts_high.nart_hl_formula(object_1), object_2, mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
                    }
                } else {
                    if ((NIL != nart_handles.nart_p(object_2)) && (NIL != possibly_naut_p(object_1))) {
                        return equals_el_intP(object_1, narts_high.nart_hl_formula(object_2), mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
                    }
                    if ((NIL != cycl_variables.cyc_varP(object_1)) && (NIL != cycl_variables.cyc_varP(object_2))) {
                        return T;
                    }
                    if ((NIL != el_formula_p(object_1)) && (NIL != el_formula_p(object_2))) {
                        return NIL != canonicalize_sentencesP ? el_expression_equalP(object_1, object_2, mt, clausal_form, memoized_internalsP) : NIL;
                    }
                }


        return NIL;
    }

    public static SubLObject el_expression_equalP(final SubLObject expr1, final SubLObject expr2, SubLObject mt, SubLObject clausal_form, SubLObject memoized_internalsP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = NIL;
        }
        if (memoized_internalsP == UNPROVIDED) {
            memoized_internalsP = NIL;
        }
        final SubLObject el_1 = canonicalize_for_equals_el(expr1, mt, clausal_form, memoized_internalsP);
        final SubLObject el_2 = canonicalize_for_equals_el(expr2, mt, clausal_form, memoized_internalsP);
        if ((NIL != el_formula_p(el_1)) && (NIL != el_formula_p(el_2))) {
            return el_expression_equal_unification_successfulP(unification_utilities.unify_clauses(list_utilities.nmapcar(symbol_function(FIRST), el_1), list_utilities.nmapcar(symbol_function(FIRST), el_2), T, UNPROVIDED));
        }
        final SubLObject term_1 = (NIL != memoized_internalsP) ? czer_main.canonicalize_term_memoized(expr1, mt) : czer_main.canonicalize_term(expr1, mt);
        final SubLObject term_2 = (NIL != memoized_internalsP) ? czer_main.canonicalize_term_memoized(expr2, mt) : czer_main.canonicalize_term(expr2, mt);
        return equals.equalsP(term_1, term_2, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject canonicalize_for_equals_el(final SubLObject expression, final SubLObject mt, final SubLObject clausal_form, final SubLObject memoized_internalsP) {
        if (clausal_form.eql($CNF)) {
            if (NIL != memoized_internalsP) {
                return czer_main.canonicalize_wf_cycl_memoized(expression, mt);
            }
            return czer_main.canonicalize_wf_cycl(expression, mt);
        } else {
            if (!clausal_form.eql($DNF)) {
                return Errors.error($str76$Unexpected_clausal_form__s, clausal_form);
            }
            if (NIL != memoized_internalsP) {
                return czer_main.canonicalize_ask_memoized(expression, mt);
            }
            return czer_main.canonicalize_ask(expression, mt);
        }
    }

    public static SubLObject el_expression_equal_unification_successfulP(final SubLObject unification_result) {
        if ((NIL != list_utilities.singletonP(unification_result)) && (NIL != bindings.unification_success_token_p(unification_result.first()))) {
            return T;
        }
        if (NIL == unification_result) {
            return NIL;
        }
        if (NIL == list_utilities.tree_find_if($sym77$NON_NULL_CLOSED_TERM_, unification_result, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject problem_queries_equal_modulo_el_var_names(final SubLObject problem_query_1, final SubLObject problem_query_2) {
        return equal_modulo_el_var_names_int(problem_query_1, problem_query_2, T);
    }

    public static SubLObject equal_modulo_el_var_names(final SubLObject object_1, final SubLObject object_2) {
        return equal_modulo_el_var_names_int(object_1, object_2, NIL);
    }

    public static SubLObject equal_modulo_el_var_names_int(SubLObject object_1, SubLObject object_2, final SubLObject problem_queriesP) {
        if (object_1.equal(object_2)) {
            return T;
        }
        if (NIL == list_utilities.tree_find_if($sym78$EL_VAR_, object_1, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == list_utilities.tree_find_if($sym78$EL_VAR_, object_2, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject opaque_object_1 = transform_list_utilities.transform(object_1, $sym78$EL_VAR_, EL_VARIABLE_TOKEN, UNPROVIDED);
        final SubLObject opaque_object_2 = transform_list_utilities.transform(object_2, $sym78$EL_VAR_, EL_VARIABLE_TOKEN, UNPROVIDED);
        if (opaque_object_1.equal(opaque_object_2)) {
            if (NIL != problem_queriesP) {
                object_1 = inference_czer.problem_query_el_formula(object_1);
                object_2 = inference_czer.problem_query_el_formula(object_2);
            }
            return equals_elP(object_1, object_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject el_variable_token(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return $OPAQUIFIED_EL_VARIABLE;
    }

    public static SubLObject non_null_closed_termP(final SubLObject v_object) {
        return makeBoolean((NIL != v_object) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject delete_el_duplicates(final SubLObject list_of_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(list_of_terms) : "list_utilities.non_dotted_list_p(list_of_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_of_terms) " + list_of_terms;
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = list_of_terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != cycl_utilities.reified_term_p(v_term)) {
                        result = delete(v_term, result, $sym71$EQUALS_EL_MEMOIZED_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        result = cons(v_term, result);
                    } else {
                        final SubLObject item_var = v_term;
                        if (NIL == member(item_var, result, $sym71$EQUALS_EL_MEMOIZED_, symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject cnfs_reorder_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.sort_clause_literals(czer_main.canonicalize_clause_commutative_terms(cnf1), varP), UNPROVIDED).first(), czer_main.rename_clause_vars(czer_main.sort_clause_literals(czer_main.canonicalize_clause_commutative_terms(cnf2), varP), UNPROVIDED).first());
    }

    public static SubLObject cnfs_reorder_literals_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.sort_clause_literals(cnf1, varP), varP).first(), czer_main.rename_clause_vars(czer_main.sort_clause_literals(cnf2, varP), varP).first());
    }

    public static SubLObject cnfs_reorder_terms_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.canonicalize_clause_commutative_terms(cnf1), varP).first(), czer_main.rename_clause_vars(czer_main.canonicalize_clause_commutative_terms(cnf2), varP).first());
    }

    public static SubLObject ordered_cnf_unifyP(final SubLObject cnf1, final SubLObject cnf2) {
        return makeBoolean((NIL != ordered_literals_unify(clauses.neg_lits(cnf1), clauses.neg_lits(cnf2))) && (NIL != ordered_literals_unify(clauses.pos_lits(cnf1), clauses.pos_lits(cnf2))));
    }

    public static SubLObject ordered_literals_unify(final SubLObject literals1, final SubLObject literals2) {
        return makeBoolean((length(literals1).numE(length(literals2)) && (NIL != ordered_literals_unify_int(literals1, literals2))) && (NIL != ordered_literals_unify_int(literals2, literals1)));
    }

    public static SubLObject ordered_literals_unify_int(final SubLObject literals1, final SubLObject literals2) {
        SubLObject failsP;
        SubLObject lits1;
        SubLObject lits2;
        SubLObject lit1;
        SubLObject lit2;
        for (failsP = NIL, lits1 = NIL, lits2 = NIL, lit1 = NIL, lit2 = NIL, lits1 = literals1, lits2 = literals2, lit1 = lits1.first(), lit2 = lits2.first(); ((NIL == failsP) && (NIL != lit1)) && (NIL != lit2); failsP = makeBoolean(NIL == unification_utilities.asent_unify(lit1, lit2, UNPROVIDED, UNPROVIDED)) , lits1 = lits1.rest() , lits2 = lits2.rest() , lit1 = lits1.first() , lit2 = lits2.first()) {
        }
        return makeBoolean(NIL == failsP);
    }

    public static SubLObject el_find_nart(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nat = czer_main.canonicalize_fn_term_int(naut, T, NIL, UNPROVIDED);
        if (NIL != nart_handles.nart_p(nat)) {
            return nat;
        }
        if (NIL != robust_nart_lookupP()) {
            final SubLObject _prev_bind_0 = $nat_matching_predicate$.currentBinding(thread);
            try {
                $nat_matching_predicate$.bind($sym82$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_, thread);
                nat = narts_high.find_nart(nat);
            } finally {
                $nat_matching_predicate$.rebind(_prev_bind_0, thread);
            }
            return nat;
        }
        return NIL;
    }

    public static SubLObject el_find_if_nart(final SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            final SubLObject nart = el_find_nart(v_object);
            if (NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return NIL;
    }

    public static SubLObject recanonicalized_candidate_nat_equals_nat_formulaP(final SubLObject candidate_nat, final SubLObject target_nat) {
        return equal(recanonicalize_candidate_nat(candidate_nat), target_nat);
    }

    public static SubLObject recanonicalize_candidate_nat(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$recanonicalizing_candidate_natP$.getDynamicValue(thread)) {
            return nat;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$recanonicalizing_candidate_natP$.currentBinding(thread);
        try {
            czer_vars.$recanonicalizing_candidate_natP$.bind(T, thread);
            result = czer_main.canonicalize_term(nat, UNPROVIDED);
        } finally {
            czer_vars.$recanonicalizing_candidate_natP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != nart_handles.nart_p(result)) {
            return narts_high.nart_hl_formula(result);
        }
        return result;
    }

    public static SubLObject robust_nart_lookupP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($DEFAULT == czer_vars.$robust_nart_lookup$.getDynamicValue(thread)) {
            return NIL;
        }
        return czer_vars.$robust_nart_lookup$.getDynamicValue(thread);
    }

    public static SubLObject sort_forts_external(final SubLObject v_forts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(v_forts) : "list_utilities.non_dotted_list_p(v_forts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(v_forts) " + v_forts;
        SubLObject cdolist_list_var = v_forts;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$new_canonicalizerP$.currentBinding(thread);
        try {
            czer_vars.$new_canonicalizerP$.bind(T, thread);
            result = cycl_utilities.formula_args(czer_main.canonicalize_term(bq_cons($$TheSet, append(v_forts, NIL)), UNPROVIDED), UNPROVIDED);
        } finally {
            czer_vars.$new_canonicalizerP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject definitional_lits_to_front(final SubLObject literals) {
        SubLObject isa_lits = NIL;
        SubLObject genls_lits = NIL;
        SubLObject rest = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa_litP(lit)) {
                isa_lits = cons(lit, isa_lits);
            } else
                if (NIL != quoted_isa_litP(lit)) {
                    isa_lits = cons(lit, isa_lits);
                } else
                    if (NIL != result_isa_litP(lit)) {
                        isa_lits = cons(lit, isa_lits);
                    } else
                        if (NIL != genls_litP(lit)) {
                            genls_lits = cons(lit, genls_lits);
                        } else
                            if (NIL != result_genl_litP(lit)) {
                                genls_lits = cons(lit, genls_lits);
                            } else {
                                rest = cons(lit, rest);
                            }




            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nconc(nreverse(isa_lits), nreverse(genls_lits), nreverse(rest));
    }

    public static SubLObject evaluatable_expressions_out(final SubLObject formula) {
        return transform_list_utilities.quiescent_transform(formula, $sym85$EVALUATABLE_EXPRESSION_, TRANSFORM_EVALUATION_EXPRESSION, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject unwrap_if_ist(final SubLObject sentence, final SubLObject mt, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == UNPROVIDED) {
            allow_spec_predsP = NIL;
        }
        return unwrap_if_ist_int(sentence, mt, T, T, allow_spec_predsP);
    }

    public static SubLObject unwrap_if_ist_permissive(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return unwrap_if_ist_int(sentence, mt, NIL, T, UNPROVIDED);
    }

    public static SubLObject unwrap_if_ist_discard_mt(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return values(unwrap_if_ist_int(sentence, mt, NIL, NIL, UNPROVIDED));
    }

    public static SubLObject unwrap_if_ist_canonical(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return unwrap_if_ist_canonical_int(sentence, mt, T, T);
    }

    public static SubLObject unwrap_if_ist_permissive_canonical(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return unwrap_if_ist_canonical_int(sentence, mt, NIL, T);
    }

    public static SubLObject unwrap_if_ist_canonical_int(SubLObject sentence, SubLObject mt, final SubLObject errorP, final SubLObject require_closed_mtP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_mt = mt;
        thread.resetMultipleValues();
        final SubLObject sentence_$15 = unwrap_if_ist_int(sentence, mt, errorP, require_closed_mtP, UNPROVIDED);
        final SubLObject mt_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$15;
        mt = mt_$16;
        if (NIL == hlmt.hlmt_equal(original_mt, mt)) {
            mt = czer_main.canonicalize_mt(mt);
        }
        return subl_promotions.values2(sentence, mt);
    }

    public static SubLObject unwrap_if_ist_int(SubLObject sentence, SubLObject mt, final SubLObject errorP, final SubLObject require_closed_mtP, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == UNPROVIDED) {
            allow_spec_predsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_$17 = unwrap_if_ist_recursive(sentence, mt, require_closed_mtP, allow_spec_predsP);
        final SubLObject mt_$18 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$17;
        mt = mt_$18;
        if (((NIL != errorP) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == mt)) {
            Errors.error($str87$_s__s_does_not_adequately_specify, sentence, mt);
        }
        return subl_promotions.values2(sentence, mt);
    }

    public static SubLObject unwrap_if_ist_recursive(final SubLObject sentence, final SubLObject mt, final SubLObject require_closed_mtP, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == UNPROVIDED) {
            allow_spec_predsP = NIL;
        }
        if (((NIL != ist_sentence_p(sentence, allow_spec_predsP)) && ((NIL == require_closed_mtP) || (NIL != hlmt.closed_possibly_hlmt_p(cycl_utilities.sentence_arg1(sentence, UNPROVIDED))))) && (NIL == kb_utilities.kbeq($$ist_Asserted, cycl_utilities.atomic_sentence_predicate(sentence)))) {
            return unwrap_if_ist_recursive(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), cycl_utilities.sentence_arg1(sentence, UNPROVIDED), require_closed_mtP, UNPROVIDED);
        }
        return subl_promotions.values2(sentence, mt);
    }

    public static SubLObject possibly_quoted_cycl_formula_p(final SubLObject v_object) {
        return cycl_grammar.cycl_formula_p(unwrap_quotes(v_object));
    }

    public static SubLObject unwrap_quotes(final SubLObject expression) {
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(expression)) {
            return unwrap_quotes(cycl_utilities.formula_arg1(expression, UNPROVIDED));
        }
        return expression;
    }

    public static SubLObject quoted_term_with_hl_varP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.fast_quote_term_p(v_object)) && (NIL != cycl_utilities.expression_find_if(symbol_function($sym89$HL_VAR_), v_object, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject escape_term(final SubLObject v_term) {
        return NIL != cycl_grammar.fast_escape_quote_term_p(v_term) ? v_term : make_unary_formula($$EscapeQuote, v_term);
    }

    public static SubLObject possibly_escape_quote_hl_vars(final SubLObject v_object, SubLObject destructiveP) {
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (NIL == cycl_utilities.expression_find_if($sym91$QUOTED_TERM_WITH_HL_VAR_, v_object, UNPROVIDED, UNPROVIDED)) {
            return v_object;
        }
        if (NIL != destructiveP) {
            return nescape_quote_hl_vars(v_object);
        }
        return escape_quote_hl_vars(v_object);
    }

    public static SubLObject escape_quote_hl_vars(final SubLObject v_object) {
        return nescape_quote_hl_vars(copy_tree(v_object));
    }

    public static SubLObject nescape_quote_hl_vars(final SubLObject v_object) {
        if (NIL != cycl_grammar.fast_quote_term_p(v_object)) {
            return list_utilities.tree_ntransform_if(v_object, $sym89$HL_VAR_, ESCAPE_TERM, UNPROVIDED);
        }
        if (v_object.isCons()) {
            return rplacd(rplaca(v_object, nescape_quote_hl_vars(v_object.first())), NIL != list_utilities.non_dotted_list_p(v_object) ? list_utilities.nmapcar(NESCAPE_QUOTE_HL_VARS, v_object.rest()) : nescape_quote_hl_vars(v_object.rest()));
        }
        return v_object;
    }

    public static SubLObject decontextualized_clausesP(final SubLObject v_clauses) {
        return list_utilities.every_in_list($sym94$DECONTEXTUALIZED_CLAUSE_, v_clauses, UNPROVIDED);
    }

    public static SubLObject decontextualized_clauseP(final SubLObject clause) {
        SubLObject contextualizedP;
        SubLObject rest;
        SubLObject asent;
        for (contextualizedP = NIL, rest = NIL, rest = clauses.neg_lits(clause); (NIL == contextualizedP) && (NIL != rest); rest = rest.rest()) {
            asent = rest.first();
            if (NIL == kb_accessors.decontextualized_literalP(asent)) {
                contextualizedP = T;
            }
        }
        for (rest = NIL, rest = clauses.pos_lits(clause); (NIL == contextualizedP) && (NIL != rest); rest = rest.rest()) {
            asent = rest.first();
            if (NIL == kb_accessors.decontextualized_literalP(asent)) {
                contextualizedP = T;
            }
        }
        return makeBoolean(NIL == contextualizedP);
    }

    public static SubLObject generalized_ist_clauses_p(final SubLObject v_clauses) {
        if (NIL == cycl_grammar.cycl_truth_value_p(v_clauses)) {
            return list_utilities.every_in_list(GENERALIZED_IST_CLAUSE_P, v_clauses, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject generalized_ist_clause_p(final SubLObject clause) {
        SubLObject non_istP;
        SubLObject rest;
        SubLObject asent;
        for (non_istP = NIL, rest = NIL, rest = clauses.neg_lits(clause); (NIL == non_istP) && (NIL != rest); rest = rest.rest()) {
            asent = rest.first();
            if (NIL == generalized_ist_literal_p(asent)) {
                non_istP = T;
            }
        }
        for (rest = NIL, rest = clauses.pos_lits(clause); (NIL == non_istP) && (NIL != rest); rest = rest.rest()) {
            asent = rest.first();
            if (NIL == generalized_ist_literal_p(asent)) {
                non_istP = T;
            }
        }
        return makeBoolean(NIL == non_istP);
    }

    public static SubLObject generalized_ist_literal_p(final SubLObject v_object) {
        return cycl_utilities.atomic_sentence_with_any_of_preds_p(v_object, $list96);
    }

    public static SubLObject opaque_arg_wrt_quoting_seeker(final SubLObject formula, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_utilities.opaque_arg_wrt_quotingP(formula, argnum)) {
            final SubLObject arg = cycl_utilities.formula_arg(formula, argnum, UNPROVIDED);
            final SubLObject target = $opaque_arg_wrt_quoting_target$.getDynamicValue(thread);
            if (NIL != list_utilities.tree_find(target, arg, symbol_function(EQUAL), UNPROVIDED)) {
                note_opaque_reference_to_term(target, formula);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject note_opaque_reference_to_term(final SubLObject v_term, final SubLObject formula) {
        return sublisp_throw($OPAQUE_ARG_FOUND, formula);
    }

    public static SubLObject formula_references_term_opaquelyP(final SubLObject formula, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_formula_p(formula) : "cycl_grammar.cycl_formula_p(formula) " + "CommonSymbols.NIL != cycl_grammar.cycl_formula_p(formula) " + formula;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($OPAQUE_ARG_FOUND);
            final SubLObject _prev_bind_0 = $opaque_arg_wrt_quoting_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                $opaque_arg_wrt_quoting_target$.bind(v_term, thread);
                cycl_utilities.$opaque_arg_function$.bind(OPAQUE_ARG_WRT_QUOTING_SEEKER, thread);
                cycl_utilities.expression_find(v_term, formula, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
            } finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_2, thread);
                $opaque_arg_wrt_quoting_target$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            result = Errors.handleThrowable(ccatch_env_var, $OPAQUE_ARG_FOUND);
        } finally {
            thread.throwStack.pop();
        }
        return list_utilities.sublisp_boolean(result);
    }

    public static SubLObject assertion_references_term_opaquelyP(final SubLObject assertion, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($OPAQUE_ARG_FOUND);
            final SubLObject _prev_bind_0 = $opaque_arg_wrt_quoting_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                $opaque_arg_wrt_quoting_target$.bind(v_term, thread);
                cycl_utilities.$opaque_arg_function$.bind(OPAQUE_ARG_WRT_QUOTING_SEEKER, thread);
                cycl_utilities.assertion_find(v_term, assertion, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
            } finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_2, thread);
                $opaque_arg_wrt_quoting_target$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            result = Errors.handleThrowable(ccatch_env_var, $OPAQUE_ARG_FOUND);
        } finally {
            thread.throwStack.pop();
        }
        return list_utilities.sublisp_boolean(result);
    }

    public static SubLObject kb_hl_support_references_term_opaquelyP(final SubLObject kb_hl_support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        assert NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : "kb_hl_support_handles.kb_hl_support_p(kb_hl_support) " + "CommonSymbols.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) " + kb_hl_support;
        final SubLObject sentence = kb_hl_supports_high.kb_hl_support_ist_sentence(kb_hl_support);
        return formula_references_term_opaquelyP(sentence, v_term, penetrate_hl_structuresP);
    }

    public static SubLObject hl_support_references_term_opaquelyP(final SubLObject hl_support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        assert NIL != arguments.hl_support_p(hl_support) : "arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) " + hl_support;
        final SubLObject sentence = arguments.support_ist_sentence(hl_support);
        return formula_references_term_opaquelyP(sentence, v_term, penetrate_hl_structuresP);
    }

    public static SubLObject support_references_term_opaquelyP(final SubLObject support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertion_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_support_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
        }
        return hl_support_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
    }

    public static SubLObject deduction_references_term_opaquelyP(final SubLObject deduction, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        final SubLObject support = deductions_high.deduction_supported_object(deduction);
        if (NIL != support_references_term_opaquelyP(support, penetrate_hl_structuresP, UNPROVIDED)) {
            return T;
        }
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support2 = NIL;
        support2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != support_references_term_opaquelyP(support2, v_term, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support2 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject term_opaque_assertions(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) " + v_term;
        final SubLObject test = hash_table_utilities.to_hash_test(symbol_function(KBEQ));
        SubLObject assertions = set_contents.new_set_contents(ZERO_INTEGER, test);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$19 = NIL;
                            final SubLObject token_var_$20 = NIL;
                            while (NIL == done_var_$19) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(assertion));
                                if (((NIL != valid_$21) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) && (NIL != assertion_references_term_opaquelyP(assertion, v_term, NIL))) {
                                    assertions = set_contents.set_contents_add(assertion, assertions, test);
                                }
                                done_var_$19 = makeBoolean(NIL == valid_$21);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set_contents.set_contents_element_list(assertions);
    }

    public static SubLObject all_term_opaque_assertions(final SubLObject v_term) {
        return term_opaque_assertions(v_term, $$EverythingPSC);
    }

    public static SubLObject term_opaque_deductions(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) " + v_term;
        final SubLObject test = hash_table_utilities.to_hash_test(symbol_function(KBEQ));
        SubLObject deductions = set_contents.new_set_contents(ZERO_INTEGER, test);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$23 = NIL;
                            final SubLObject token_var_$24 = NIL;
                            while (NIL == done_var_$23) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(assertion));
                                if ((NIL != valid_$25) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) {
                                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                    SubLObject deduction = NIL;
                                    deduction = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if ((NIL != deduction_handles.deduction_p(deduction)) && (NIL != deduction_references_term_opaquelyP(deduction, v_term, NIL))) {
                                            deductions = set_contents.set_contents_add(deduction, deductions, test);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        deduction = cdolist_list_var.first();
                                    } 
                                }
                                done_var_$23 = makeBoolean(NIL == valid_$25);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set_contents.set_contents_element_list(deductions);
    }

    public static SubLObject all_term_opaque_deductions(final SubLObject v_term) {
        return term_opaque_deductions(v_term, $$EverythingPSC);
    }

    public static SubLObject canonicalize_el_query(final SubLObject sentence, SubLObject mt, SubLObject canonicalize_variablesP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (canonicalize_variablesP == UNPROVIDED) {
            canonicalize_variablesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_grammar.cycl_truth_value_p(sentence)) {
            return sentence;
        }
        thread.resetMultipleValues();
        SubLObject dnf_clauses_items = czer_main.canonicalize_ask_sentence(sentence, mt);
        final SubLObject canonical_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject dnf_clauses = NIL;
        SubLObject all_quantified_vars = NIL;
        if (NIL == dnf_clauses_items) {
            return $$False;
        }
        SubLObject cdolist_list_var;
        dnf_clauses_items = cdolist_list_var = Sort.sort(dnf_clauses_items, $sym108$LIT__, CLAUSE_BINDING_LIST_PAIRS_LITERAL);
        SubLObject dnf_clauses_item = NIL;
        dnf_clauses_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = dnf_clauses_item;
            SubLObject dnf_clause = NIL;
            SubLObject el_to_hl_bindings = NIL;
            SubLObject free_el_vars = NIL;
            destructuring_bind_must_consp(current, datum, $list110);
            dnf_clause = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list110);
            el_to_hl_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list110);
            free_el_vars = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject hl_vars = bindings.bindings_variables(el_to_hl_bindings);
                final SubLObject quantified_hl_vars = set_difference(hl_vars, free_el_vars, UNPROVIDED, UNPROVIDED);
                SubLObject quantified_vars = bindings.apply_bindings(el_to_hl_bindings, quantified_hl_vars);
                dnf_clause = bindings.apply_bindings_backwards(el_to_hl_bindings, dnf_clause);
                quantified_vars = bindings.apply_bindings_backwards(el_to_hl_bindings, quantified_vars);
                dnf_clauses = cons(dnf_clause, dnf_clauses);
                all_quantified_vars = union(all_quantified_vars, quantified_vars, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list110);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dnf_clauses_item = cdolist_list_var.first();
        } 
        dnf_clauses = nreverse(dnf_clauses);
        if (NIL != canonicalize_variablesP) {
            final SubLObject el_vars = nreverse(cycl_utilities.expression_gather(dnf_clauses, $sym78$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject var_bindings = NIL;
            SubLObject list_var = NIL;
            SubLObject el_var = NIL;
            SubLObject n = NIL;
            list_var = el_vars;
            el_var = list_var.first();
            for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , n = add(ONE_INTEGER, n)) {
                final SubLObject default_el_var = variables.get_default_el_var(n);
                var_bindings = bindings.add_variable_binding(el_var, default_el_var, var_bindings);
            }
            dnf_clauses = bindings.apply_bindings(var_bindings, dnf_clauses);
            all_quantified_vars = bindings.apply_bindings(var_bindings, all_quantified_vars);
        }
        all_quantified_vars = nreverse(Sort.sort(all_quantified_vars, $sym111$TERM__, UNPROVIDED));
        SubLObject result = existentially_bind_vars(clauses.dnf_formula_from_clauses(dnf_clauses), all_quantified_vars);
        if (NIL == kb_utilities.kbeq(mt, canonical_mt)) {
            result = make_ist_sentence(canonical_mt, result);
        }
        return result;
    }

    public static SubLObject canonicalize_el_sentence(final SubLObject sentence, final SubLObject mt, SubLObject canonicalize_variablesP) {
        if (canonicalize_variablesP == UNPROVIDED) {
            canonicalize_variablesP = NIL;
        }
        assert NIL != cycl_grammar.cycl_formula_p(sentence) : "cycl_grammar.cycl_formula_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_formula_p(sentence) " + sentence;
        final SubLObject hl = czer_main.el_to_hl(sentence, mt);
        SubLObject cnfs = NIL;
        if (NIL != canonicalize_variablesP) {
            cnfs = cycl_utilities.hl_to_el(extract_hl_clauses(hl));
        } else {
            cnfs = extract_el_clauses(hl);
        }
        return uncanonicalizer.cnfs_el_formula(cnfs, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject canon_equalP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = NIL;
        SubLObject canon_mt2 = NIL;
        if ((NIL == canon_form1) || (NIL == canon_form2)) {
            thread.resetMultipleValues();
            final SubLObject canon_form1_$27 = czer_main.canonicalize_cycl_sentence(form1, mt);
            final SubLObject canon_mt1_$28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form1 = canon_form1_$27;
            canon_mt1 = canon_mt1_$28;
            thread.resetMultipleValues();
            final SubLObject canon_form2_$29 = czer_main.canonicalize_cycl_sentence(form2, mt);
            final SubLObject canon_mt2_$30 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form2 = canon_form2_$29;
            canon_mt2 = canon_mt2_$30;
        }
        return makeBoolean((NIL != canon_forms_equalP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2)));
    }

    public static SubLObject canon_query_equalP(final SubLObject query1, final SubLObject query2, SubLObject mt, SubLObject canon_query1, SubLObject canon_query2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_query1 == UNPROVIDED) {
            canon_query1 = NIL;
        }
        if (canon_query2 == UNPROVIDED) {
            canon_query2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = NIL;
        SubLObject canon_mt2 = NIL;
        if ((NIL == canon_query1) || (NIL == canon_query2)) {
            thread.resetMultipleValues();
            final SubLObject canon_query1_$31 = czer_main.canonicalize_ask_sentence(query1, mt);
            final SubLObject canon_mt1_$32 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_query1 = canon_query1_$31;
            canon_mt1 = canon_mt1_$32;
            thread.resetMultipleValues();
            final SubLObject canon_query2_$33 = czer_main.canonicalize_ask_sentence(query2, mt);
            final SubLObject canon_mt2_$34 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_query2 = canon_query2_$33;
            canon_mt2 = canon_mt2_$34;
        }
        return makeBoolean((NIL != canon_forms_equalP(canon_query1, canon_query2, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2)));
    }

    public static SubLObject canon_assert_equalP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = NIL;
        SubLObject canon_mt2 = NIL;
        if ((NIL == canon_form1) || (NIL == canon_form2)) {
            thread.resetMultipleValues();
            final SubLObject canon_form1_$35 = czer_main.test_canonicalize_assert_sentence(form1, mt);
            final SubLObject canon_mt1_$36 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form1 = canon_form1_$35;
            canon_mt1 = canon_mt1_$36;
            thread.resetMultipleValues();
            final SubLObject canon_form2_$37 = czer_main.test_canonicalize_assert_sentence(form2, mt);
            final SubLObject canon_mt2_$38 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form2 = canon_form2_$37;
            canon_mt2 = canon_mt2_$38;
        }
        return makeBoolean((NIL != canon_forms_equalP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2)));
    }

    public static SubLObject canon_assert_isomorphicP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = NIL;
        SubLObject canon_mt2 = NIL;
        if ((NIL == canon_form1) || (NIL == canon_form2)) {
            thread.resetMultipleValues();
            final SubLObject canon_form1_$39 = czer_main.test_canonicalize_assert_sentence(form1, mt);
            final SubLObject canon_mt1_$40 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form1 = canon_form1_$39;
            canon_mt1 = canon_mt1_$40;
            thread.resetMultipleValues();
            final SubLObject canon_form2_$41 = czer_main.test_canonicalize_assert_sentence(form2, mt);
            final SubLObject canon_mt2_$42 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form2 = canon_form2_$41;
            canon_mt2 = canon_mt2_$42;
        }
        return makeBoolean((NIL != canon_forms_isomorphicP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2)));
    }

    public static SubLObject canon_forms_equalP(final SubLObject canon_form1, final SubLObject canon_form2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (canon_form1.isAtom() || canon_form2.isAtom()) {
            return kb_utilities.kbeq(canon_form1, canon_form2);
        }
        return list_utilities.sets_equalP(Mapping.mapcar(symbol_function(FIRST), canon_form1), Mapping.mapcar(symbol_function(FIRST), canon_form2), test);
    }

    public static SubLObject canon_forms_isomorphicP(final SubLObject canon_form1, final SubLObject canon_form2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (canon_form1.isAtom() || canon_form2.isAtom()) {
            return kb_utilities.kbeq(canon_form1, canon_form2);
        }
        final SubLObject canon_form1_skolem_terms = cycl_utilities.formula_gather(canon_form1, $sym112$SKOLEM_NART_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject canon_form2_skolem_terms = cycl_utilities.formula_gather(canon_form2, $sym112$SKOLEM_NART_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject skolem_term_def_map = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
        if (!length(canon_form1_skolem_terms).numE(length(canon_form2_skolem_terms))) {
            return NIL;
        }
        SubLObject cdolist_list_var = canon_form1_skolem_terms;
        SubLObject canon_form1_skolem_term = NIL;
        canon_form1_skolem_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject term_formulas = NIL;
            SubLObject cdolist_list_var_$43 = kb_accessors.ata(canon_form1_skolem_term, UNPROVIDED);
            SubLObject term_assertion = NIL;
            term_assertion = cdolist_list_var_$43.first();
            while (NIL != cdolist_list_var_$43) {
                if (NIL == properties.term_quoted_in_gafP(term_assertion, canon_form1_skolem_term, NIL)) {
                    term_formulas = cons(list_utilities.tree_substitute(assertions_high.assertion_formula(term_assertion), canon_form1_skolem_term, NIL), term_formulas);
                }
                cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                term_assertion = cdolist_list_var_$43.first();
            } 
            sethash(canon_form1_skolem_term, skolem_term_def_map, term_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            canon_form1_skolem_term = cdolist_list_var.first();
        } 
        cdolist_list_var = canon_form2_skolem_terms;
        SubLObject canon_form2_skolem_term = NIL;
        canon_form2_skolem_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject term_formulas = NIL;
            SubLObject cdolist_list_var_$44 = kb_accessors.ata(canon_form2_skolem_term, UNPROVIDED);
            SubLObject term_assertion = NIL;
            term_assertion = cdolist_list_var_$44.first();
            while (NIL != cdolist_list_var_$44) {
                if (NIL == properties.term_quoted_in_gafP(term_assertion, canon_form2_skolem_term, NIL)) {
                    term_formulas = cons(list_utilities.tree_substitute(assertions_high.assertion_formula(term_assertion), canon_form2_skolem_term, NIL), term_formulas);
                }
                cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                term_assertion = cdolist_list_var_$44.first();
            } 
            sethash(canon_form2_skolem_term, skolem_term_def_map, term_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            canon_form2_skolem_term = cdolist_list_var.first();
        } 
        cdolist_list_var = list_utilities.permute_list(canon_form1_skolem_terms, UNPROVIDED);
        SubLObject canon_form1_skolem_terms_permuted = NIL;
        canon_form1_skolem_terms_permuted = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject canon_form2_transformed = canon_form2;
            SubLObject canon_form2_skolem_terms_used = NIL;
            SubLObject canon_form2_skolem_term2 = NIL;
            SubLObject canon_form2_skolem_term_$45 = NIL;
            SubLObject canon_form1_skolem_term2 = NIL;
            SubLObject canon_form1_skolem_term_$46 = NIL;
            canon_form2_skolem_term2 = canon_form2_skolem_terms;
            canon_form2_skolem_term_$45 = canon_form2_skolem_term2.first();
            canon_form1_skolem_term2 = canon_form1_skolem_terms_permuted;
            canon_form1_skolem_term_$46 = canon_form1_skolem_term2.first();
            while ((NIL != canon_form1_skolem_term2) || (NIL != canon_form2_skolem_term2)) {
                if ((NIL == list_utilities.member_kbeqP(canon_form2_skolem_term_$45, canon_form2_skolem_terms_used)) && (NIL != list_utilities.sets_equalP(gethash(canon_form1_skolem_term_$46, skolem_term_def_map, UNPROVIDED), gethash(canon_form2_skolem_term_$45, skolem_term_def_map, UNPROVIDED), symbol_function(EQUAL)))) {
                    canon_form2_skolem_terms_used = cons(canon_form2_skolem_term_$45, canon_form2_skolem_terms_used);
                    canon_form2_transformed = list_utilities.tree_substitute(canon_form2_transformed, canon_form2_skolem_term_$45, canon_form1_skolem_term_$46);
                }
                canon_form2_skolem_term2 = canon_form2_skolem_term2.rest();
                canon_form2_skolem_term_$45 = canon_form2_skolem_term2.first();
                canon_form1_skolem_term2 = canon_form1_skolem_term2.rest();
                canon_form1_skolem_term_$46 = canon_form1_skolem_term2.first();
            } 
            if (NIL != list_utilities.sets_equalP(Mapping.mapcar(symbol_function(FIRST), canon_form1), Mapping.mapcar(symbol_function(FIRST), canon_form2_transformed), test)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_form1_skolem_terms_permuted = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject canon_equal_hl_namesP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject test, SubLObject bindings1, SubLObject bindings2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (bindings1 == UNPROVIDED) {
            bindings1 = NIL;
        }
        if (bindings2 == UNPROVIDED) {
            bindings2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject canon1 = NIL;
        SubLObject bind1 = NIL;
        SubLObject canon2 = NIL;
        SubLObject bind2 = NIL;
        if (NIL != bindings1) {
            canon1 = form1;
            bind1 = bindings1;
        } else {
            thread.resetMultipleValues();
            final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(form1, mt);
            final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
            final SubLObject uniquified_bindings = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            canon1 = temp_cnf;
            bind1 = uniquified_bindings;
        }
        if (NIL != bindings2) {
            canon2 = form2;
            bind2 = bindings2;
        } else {
            thread.resetMultipleValues();
            final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(form2, mt);
            final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
            final SubLObject uniquified_bindings = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            canon2 = temp_cnf;
            bind2 = uniquified_bindings;
        }
        SubLObject cdolist_list_var = bind1;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            canon1 = subst(binding.first(), binding.rest(), canon1, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        cdolist_list_var = bind2;
        binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            canon2 = subst(binding.first(), binding.rest(), canon2, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        result = canon_forms_equalP(canon1, canon2, test);
        return result;
    }

    public static SubLObject constant_occurs_in_formulaP(final SubLObject constant, final SubLObject formula) {
        if (NIL != find_anywhere(constant, formula, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject canonicalize_and_return_skolem_vars(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf = NIL;
        SubLObject var_bindings = NIL;
        thread.resetMultipleValues();
        final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(formula, mt);
        final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
        final SubLObject uniquified_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        cnf = temp_cnf;
        var_bindings = uniquified_bindings;
        SubLObject cdolist_list_var;
        final SubLObject universals = cdolist_list_var = remove_duplicates(Mapping.mapcar(symbol_function(FIRST), list_utilities.mapappend(symbol_function(SECOND), cnf)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rassoc(var, var_bindings, UNPROVIDED, UNPROVIDED)) {
                var_bindings = delete(var, var_bindings, symbol_function(EQL), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return subl_promotions.values2(cnf, var_bindings);
    }

    public static SubLObject find_anywhere(final SubLObject v_object, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != funcall(test, v_object, funcall(key, tree))) {
            if (NIL != tree) {
                return tree;
            }
            return T;
        } else {
            if (!tree.isCons()) {
                return NIL;
            }
            final SubLObject first_result = find_anywhere(v_object, tree.first(), test, key);
            final SubLObject rest_result = ((NIL != first_result) || (NIL == tree.rest())) ? NIL : find_anywhere(v_object, tree.rest(), test, key);
            if (NIL != first_result) {
                return first_result;
            }
            if (NIL != rest_result) {
                return rest_result;
            }
            return NIL;
        }
    }

    public static SubLObject find_all_anywhere(final SubLObject v_object, final SubLObject tree, SubLObject test, SubLObject key, SubLObject basket) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (basket == UNPROVIDED) {
            basket = NIL;
        }
        if (NIL != funcall(test, v_object, funcall(key, tree))) {
            if (NIL != tree) {
                return cons(tree, basket);
            }
            return cons(T, basket);
        } else {
            if (tree.isCons()) {
                return NIL == tree.rest() ? find_all_anywhere(v_object, tree.first(), test, key, basket) : find_all_anywhere(v_object, tree.rest(), test, key, find_all_anywhere(v_object, tree.first(), test, key, basket));
            }
            return basket;
        }
    }

    public static SubLObject return_uncanon(final SubLObject form, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            if (NIL == fi.safe_fi($ASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                format(T, $str115$__Error__assert_failed__S___, form);
            } else {
                final SubLObject assertion = czer_meta.find_some_assertion_cycl(form, mt);
                if (NIL == assertion) {
                    format(T, $str116$__Error__Can_t_find_assertion___);
                } else {
                    final SubLObject el_form = uncanonicalizer.assertion_el_formula(assertion);
                    fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    result = el_form;
                }
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject uncanon_original_test(final SubLObject form, final SubLObject mt) {
        return uncanon_test(form, mt, T, UNPROVIDED);
    }

    public static SubLObject uncanon_test(final SubLObject form, final SubLObject mt, SubLObject require_original_equalP, SubLObject verboseP) {
        if (require_original_equalP == UNPROVIDED) {
            require_original_equalP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = T;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            if (NIL != verboseP) {
                format(T, $str118$__Form___A_in__A__, form, mt);
            }
            if (NIL == fi.safe_fi($ASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                format(T, $str119$__Error__assert_failed__);
            } else {
                final SubLObject assertions = czer_meta.find_assertions_cycl(form, mt);
                if (NIL == assertions) {
                    format(T, $str120$__Error__Can_t_find_assertions___, form);
                } else {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != verboseP) {
                            format(T, $str121$__The_assertion_is__S___, assertion);
                        }
                        thread.resetMultipleValues();
                        final SubLObject el_form = uncanonicalizer.assertion_el_formula(assertion);
                        final SubLObject el_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != verboseP) {
                            format(T, $str122$__Its_EL_form_is__S_in__S___, el_form, el_mt);
                        }
                        if ((!form.equal(el_form)) || (!mt.equal(el_mt))) {
                            if (NIL != require_original_equalP) {
                                result = NIL;
                            } else {
                                fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                fi.safe_fi($ASSERT, el_form, el_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject assertions_$47 = czer_meta.find_assertions_cycl(el_form, el_mt);
                                if (NIL == assertions_$47) {
                                    format(T, $str123$__Error__Can_t_find_assertions___, el_form, el_mt);
                                } else {
                                    SubLObject doneP = NIL;
                                    if (NIL == doneP) {
                                        SubLObject csome_list_var = assertions_$47;
                                        SubLObject assertion2 = NIL;
                                        assertion2 = csome_list_var.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                                            thread.resetMultipleValues();
                                            final SubLObject new_el_form = uncanonicalizer.assertion_el_formula(assertion2);
                                            final SubLObject new_el_mt = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != verboseP) {
                                                format(T, $str124$__Its_New_EL_form_is__S_in__S___, new_el_form, new_el_mt);
                                            }
                                            if ((!el_form.equal(new_el_form)) || (!el_mt.equal(new_el_mt))) {
                                                format(T, $str125$__Error__EL_mismatch___Original__, new_el_form, el_form);
                                                result = NIL;
                                                doneP = T;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            assertion2 = csome_list_var.first();
                                        } 
                                    }
                                }
                                fi.safe_fi($UNASSERT, el_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                }
                fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject assert_return_uncanon(final SubLObject form_list, final SubLObject form2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            SubLObject cdolist_list_var = form_list;
            SubLObject assert_form = NIL;
            assert_form = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == fi.safe_fi($ASSERT, assert_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    format(T, $str126$__Error__assert_failed___S__, assert_form);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assert_form = cdolist_list_var.first();
            } 
            final SubLObject el_form2 = return_uncanon(form2, mt);
            SubLObject cdolist_list_var2 = form_list;
            SubLObject unassert_form = NIL;
            unassert_form = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL == fi.safe_fi($UNASSERT, unassert_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    format(T, $str127$__Error__unassert_failed___S__, unassert_form);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                unassert_form = cdolist_list_var2.first();
            } 
            result = el_form2;
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject canon_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_cycl(formula, mt);
        return canon_form_mal_resultP(result);
    }

    public static SubLObject canon_ask_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_ask(formula, mt);
        return canon_form_mal_resultP(result);
    }

    public static SubLObject canon_query_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_query(formula, mt, UNPROVIDED, UNPROVIDED);
        return canon_form_mal_resultP(result);
    }

    public static SubLObject canon_assert_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.test_canonicalize_assert(formula, mt);
        return canon_form_mal_resultP(result);
    }

    public static SubLObject canon_form_mal_resultP(final SubLObject formula) {
        return makeBoolean((NIL == formula) || (NIL != kb_utilities.kbeq($$False, formula)));
    }

    public static SubLObject declare_czer_utilities_file() {
        declareFunction(me, "some_canonicalizer_directive_assertionsP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS?", 1, 1, false);
        declareFunction(me, "some_canonicalizer_directive_assertions_somewhereP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "canonicalizer_directive_for_argP", "CANONICALIZER-DIRECTIVE-FOR-ARG?", 4, 0, false);
        declareFunction(me, "direct_genl_canonicalizer_directives", "DIRECT-GENL-CANONICALIZER-DIRECTIVES", 1, 0, false);
        declareFunction(me, "direct_spec_canonicalizer_directives", "DIRECT-SPEC-CANONICALIZER-DIRECTIVES", 1, 0, false);
        declareFunction(me, "get_nth_canonical_variable", "GET-NTH-CANONICAL-VARIABLE", 1, 1, false);
        declareFunction(me, "canonical_variable_number", "CANONICAL-VARIABLE-NUMBER", 1, 0, false);
        declareFunction(me, "arg_permits_generic_arg_variablesP", "ARG-PERMITS-GENERIC-ARG-VARIABLES?", 2, 1, false);
        declareFunction(me, "arg_permits_keyword_variablesP", "ARG-PERMITS-KEYWORD-VARIABLES?", 2, 1, false);
        declareFunction(me, "relax_arg_type_constraints_for_variables_for_argP", "RELAX-ARG-TYPE-CONSTRAINTS-FOR-VARIABLES-FOR-ARG?", 2, 1, false);
        declareFunction(me, "dont_reorder_commutative_terms_for_args", "DONT-REORDER-COMMUTATIVE-TERMS-FOR-ARGS", 1, 1, false);
        declareFunction(me, "possibly_assertion_argP", "POSSIBLY-ASSERTION-ARG?", 2, 1, false);
        declareFunction(me, "assertion_argP", "ASSERTION-ARG?", 2, 1, false);
        declareFunction(me, "indexed_argP", "INDEXED-ARG?", 2, 0, false);
        declareFunction(me, "expression_argP", "EXPRESSION-ARG?", 2, 1, false);
        declareFunction(me, "assertible_expression_argP", "ASSERTIBLE-EXPRESSION-ARG?", 2, 1, false);
        declareFunction(me, "askable_expression_argP", "ASKABLE-EXPRESSION-ARG?", 2, 1, false);
        declareFunction(me, "formula_argP", "FORMULA-ARG?", 2, 1, false);
        declareFunction(me, "clear_formula_arg_intP", "CLEAR-FORMULA-ARG-INT?", 0, 0, false);
        declareFunction(me, "remove_formula_arg_intP", "REMOVE-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction(me, "formula_arg_intP_internal", "FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction(me, "formula_arg_intP", "FORMULA-ARG-INT?", 2, 1, false);
        declareFunction(me, "clear_quoted_formula_arg_intP", "CLEAR-QUOTED-FORMULA-ARG-INT?", 0, 0, false);
        declareFunction(me, "remove_quoted_formula_arg_intP", "REMOVE-QUOTED-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction(me, "quoted_formula_arg_intP_internal", "QUOTED-FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction(me, "quoted_formula_arg_intP", "QUOTED-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction(me, "sentence_argP", "SENTENCE-ARG?", 2, 1, false);
        declareFunction(me, "clear_sentence_arg_intP", "CLEAR-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction(me, "remove_sentence_arg_intP", "REMOVE-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction(me, "sentence_arg_intP_internal", "SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction(me, "sentence_arg_intP", "SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction(me, "clear_quoted_sentence_arg_intP", "CLEAR-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction(me, "remove_quoted_sentence_arg_intP", "REMOVE-QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction(me, "quoted_sentence_arg_intP_internal", "QUOTED-SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction(me, "quoted_sentence_arg_intP", "QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction(me, "some_sentence_argP", "SOME-SENTENCE-ARG?", 1, 1, false);
        declareFunction(me, "clear_some_sentence_arg_intP", "CLEAR-SOME-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction(me, "remove_some_sentence_arg_intP", "REMOVE-SOME-SENTENCE-ARG-INT?", 2, 0, false);
        declareFunction(me, "some_sentence_arg_intP_internal", "SOME-SENTENCE-ARG-INT?-INTERNAL", 2, 0, false);
        declareFunction(me, "some_sentence_arg_intP", "SOME-SENTENCE-ARG-INT?", 2, 0, false);
        declareFunction(me, "clear_some_quoted_sentence_arg_intP", "CLEAR-SOME-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction(me, "remove_some_quoted_sentence_arg_intP", "REMOVE-SOME-QUOTED-SENTENCE-ARG-INT?", 2, 0, false);
        declareFunction(me, "some_quoted_sentence_arg_intP_internal", "SOME-QUOTED-SENTENCE-ARG-INT?-INTERNAL", 2, 0, false);
        declareFunction(me, "some_quoted_sentence_arg_intP", "SOME-QUOTED-SENTENCE-ARG-INT?", 2, 0, false);
        declareFunction(me, "askable_formula_argP", "ASKABLE-FORMULA-ARG?", 2, 1, false);
        declareFunction(me, "assertable_formula_argP", "ASSERTABLE-FORMULA-ARG?", 2, 1, false);
        declareFunction(me, "askable_sentence_argP", "ASKABLE-SENTENCE-ARG?", 2, 1, false);
        declareFunction(me, "assertable_sentence_argP", "ASSERTABLE-SENTENCE-ARG?", 2, 1, false);
        declareFunction(me, "denotational_term_argP", "DENOTATIONAL-TERM-ARG?", 2, 1, false);
        declareFunction(me, "leave_some_terms_at_el_for_argP", "LEAVE-SOME-TERMS-AT-EL-FOR-ARG?", 2, 1, false);
        declareFunction(me, "leave_variables_at_el_for_argP", "LEAVE-VARIABLES-AT-EL-FOR-ARG?", 2, 1, false);
        declareFunction(me, "arg_isa_quotedP", "ARG-ISA-QUOTED?", 2, 1, false);
        declareFunction(me, "distributing_meta_predP", "DISTRIBUTING-META-PRED?", 1, 0, false);
        declareFunction(me, "find_hl_gaf", "FIND-HL-GAF", 1, 1, false);
        declareFunction(me, "find_hl_gaf_if", "FIND-HL-GAF-IF", 2, 0, false);
        declareFunction(me, "safe_find_gaf_genl_mts", "SAFE-FIND-GAF-GENL-MTS", 2, 0, false);
        declareFunction(me, "nput_back_clause_el_variables", "NPUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
        declareFunction(me, "put_back_clause_el_variables", "PUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
        declareFunction(me, "list_of_clause_binding_list_pairs_p", "LIST-OF-CLAUSE-BINDING-LIST-PAIRS-P", 1, 0, false);
        declareFunction(me, "clause_binding_list_pairs_literal", "CLAUSE-BINDING-LIST-PAIRS-LITERAL", 1, 0, false);
        declareFunction(me, "nextract_el_clauses", "NEXTRACT-EL-CLAUSES", 1, 0, false);
        declareFunction(me, "extract_el_clauses", "EXTRACT-EL-CLAUSES", 1, 0, false);
        declareFunction(me, "extract_hl_clauses", "EXTRACT-HL-CLAUSES", 1, 0, false);
        declareFunction(me, "nextract_hl_clauses", "NEXTRACT-HL-CLAUSES", 1, 0, false);
        declareFunction(me, "extract_blists", "EXTRACT-BLISTS", 1, 0, false);
        declareFunction(me, "nextract_blists", "NEXTRACT-BLISTS", 1, 0, false);
        declareFunction(me, "fn_tou_lit", "FN-TOU-LIT", 2, 0, false);
        declareFunction(me, "fn_equals_lit", "FN-EQUALS-LIT", 2, 0, false);
        declareFunction(me, "fn_evaluate_lit", "FN-EVALUATE-LIT", 2, 1, false);
        declareFunction(me, "fn_some_non_evaluatable_referenceP", "FN-SOME-NON-EVALUATABLE-REFERENCE?", 2, 1, false);
        declareFunction(me, "make_nart_var_tou_lit", "MAKE-NART-VAR-TOU-LIT", 1, 0, false);
        declareFunction(me, "make_nart_var_for_tou_lit", "MAKE-NART-VAR-FOR-TOU-LIT", 1, 0, false);
        declareFunction(me, "make_nart_var_equals_lit", "MAKE-NART-VAR-EQUALS-LIT", 1, 0, false);
        declareFunction(me, "make_nart_var_evaluate_lit", "MAKE-NART-VAR-EVALUATE-LIT", 1, 0, false);
        declareFunction(me, "clause_new_el_var_name", "CLAUSE-NEW-EL-VAR-NAME", 1, 0, false);
        declareFunction(me, "unique_var_name_wrt", "UNIQUE-VAR-NAME-WRT", 2, 0, false);
        declareFunction(me, "unique_el_var_wrt_expression", "UNIQUE-EL-VAR-WRT-EXPRESSION", 1, 1, false);
        declareFunction(me, "unique_hl_var_wrt_expression", "UNIQUE-HL-VAR-WRT-EXPRESSION", 1, 1, false);
        declareFunction(me, "make_czer_el_var_name", "MAKE-CZER-EL-VAR-NAME", 1, 0, false);
        declareFunction(me, "canon_varP", "CANON-VAR?", 1, 0, false);
        new czer_utilities.$canon_varP$UnaryFunction();
        declareFunction(me, "true_sentenceP", "TRUE-SENTENCE?", 1, 0, false);
        declareFunction(me, "true_negated_varP", "TRUE-NEGATED-VAR?", 1, 1, false);
        declareFunction(me, "true_negated_formulaP", "TRUE-NEGATED-FORMULA?", 1, 0, false);
        declareFunction(me, "true_var_formulaP", "TRUE-VAR-FORMULA?", 1, 1, false);
        declareFunction(me, "encapsulate_formulaP", "ENCAPSULATE-FORMULA?", 1, 0, false);
        declareFunction(me, "encapsulate_formula", "ENCAPSULATE-FORMULA", 1, 1, false);
        declareFunction(me, "intensional_formulaP", "INTENSIONAL-FORMULA?", 1, 0, false);
        declareFunction(me, "make_var_formula_lit", "MAKE-VAR-FORMULA-LIT", 1, 0, false);
        declareFunction(me, "make_intensional_lit", "MAKE-INTENSIONAL-LIT", 1, 0, false);
        declareFunction(me, "make_intensional_lit_int", "MAKE-INTENSIONAL-LIT-INT", 1, 0, false);
        declareFunction(me, "formula_has_expansionP", "FORMULA-HAS-EXPANSION?", 1, 1, false);
        declareFunction(me, "relation_has_expansionP", "RELATION-HAS-EXPANSION?", 1, 1, false);
        declareFunction(me, "within_negationP", "WITHIN-NEGATION?", 0, 0, false);
        declareFunction(me, "within_disjunctionP", "WITHIN-DISJUNCTION?", 0, 0, false);
        declareFunction(me, "within_conjunctionP", "WITHIN-CONJUNCTION?", 0, 0, false);
        declareFunction(me, "within_negated_disjunctionP", "WITHIN-NEGATED-DISJUNCTION?", 0, 0, false);
        declareFunction(me, "commuting_functionsP", "COMMUTING-FUNCTIONS?", 2, 1, false);
        declareFunction(me, "reifiable_functorP", "REIFIABLE-FUNCTOR?", 1, 1, false);
        declareFunction(me, "reifiable_function_termP", "REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction(me, "wf_reifiable_function_termP", "WF-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction(me, "reifiable_termP", "REIFIABLE-TERM?", 1, 0, false);
        declareFunction(me, "reifiable_nat_termP", "REIFIABLE-NAT-TERM?", 1, 0, false);
        declareFunction(me, "unreified_reifiable_nat_termP", "UNREIFIED-REIFIABLE-NAT-TERM?", 1, 0, false);
        declareFunction(me, "reifiable_nautP", "REIFIABLE-NAUT?", 1, 2, false);
        declareFunction(me, "fort_or_naut_with_corresponding_nartP", "FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction(me, "list_of_fort_or_naut_with_corresponding_nartP", "LIST-OF-FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction(me, "naut_with_corresponding_nartP", "NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction(me, "evaluatable_function_symbolP", "EVALUATABLE-FUNCTION-SYMBOL?", 1, 1, false);
        declareFunction(me, "evaluatable_function_termP", "EVALUATABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction(me, "unpackage_cnf_clause", "UNPACKAGE-CNF-CLAUSE", 1, 0, false);
        declareFunction(me, "unpackage_dnf_clause", "UNPACKAGE-DNF-CLAUSE", 1, 0, false);
        declareFunction(me, "equals_el_memoizedP_internal", "EQUALS-EL-MEMOIZED?-INTERNAL", 2, 2, false);
        declareFunction(me, "equals_el_memoizedP", "EQUALS-EL-MEMOIZED?", 2, 2, false);
        declareFunction(me, "queries_equal_at_elP", "QUERIES-EQUAL-AT-EL?", 2, 1, false);
        declareFunction(me, "terms_equal_at_elP", "TERMS-EQUAL-AT-EL?", 2, 1, false);
        declareFunction(me, "equals_elP", "EQUALS-EL?", 2, 3, false);
        declareFunction(me, "equals_el_intP", "EQUALS-EL-INT?", 6, 0, false);
        declareFunction(me, "el_expression_equalP", "EL-EXPRESSION-EQUAL?", 2, 3, false);
        declareFunction(me, "canonicalize_for_equals_el", "CANONICALIZE-FOR-EQUALS-EL", 4, 0, false);
        declareFunction(me, "el_expression_equal_unification_successfulP", "EL-EXPRESSION-EQUAL-UNIFICATION-SUCCESSFUL?", 1, 0, false);
        declareFunction(me, "problem_queries_equal_modulo_el_var_names", "PROBLEM-QUERIES-EQUAL-MODULO-EL-VAR-NAMES", 2, 0, false);
        declareFunction(me, "equal_modulo_el_var_names", "EQUAL-MODULO-EL-VAR-NAMES", 2, 0, false);
        declareFunction(me, "equal_modulo_el_var_names_int", "EQUAL-MODULO-EL-VAR-NAMES-INT", 3, 0, false);
        declareFunction(me, "el_variable_token", "EL-VARIABLE-TOKEN", 0, 1, false);
        declareFunction(me, "non_null_closed_termP", "NON-NULL-CLOSED-TERM?", 1, 0, false);
        declareFunction(me, "delete_el_duplicates", "DELETE-EL-DUPLICATES", 1, 0, false);
        declareFunction(me, "cnfs_reorder_equalP", "CNFS-REORDER-EQUAL?", 2, 1, false);
        declareFunction(me, "cnfs_reorder_literals_equalP", "CNFS-REORDER-LITERALS-EQUAL?", 2, 1, false);
        declareFunction(me, "cnfs_reorder_terms_equalP", "CNFS-REORDER-TERMS-EQUAL?", 2, 1, false);
        declareFunction(me, "ordered_cnf_unifyP", "ORDERED-CNF-UNIFY?", 2, 0, false);
        declareFunction(me, "ordered_literals_unify", "ORDERED-LITERALS-UNIFY", 2, 0, false);
        declareFunction(me, "ordered_literals_unify_int", "ORDERED-LITERALS-UNIFY-INT", 2, 0, false);
        declareFunction(me, "el_find_nart", "EL-FIND-NART", 1, 0, false);
        declareFunction(me, "el_find_if_nart", "EL-FIND-IF-NART", 1, 0, false);
        declareFunction(me, "recanonicalized_candidate_nat_equals_nat_formulaP", "RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?", 2, 0, false);
        declareFunction(me, "recanonicalize_candidate_nat", "RECANONICALIZE-CANDIDATE-NAT", 1, 0, false);
        declareFunction(me, "robust_nart_lookupP", "ROBUST-NART-LOOKUP?", 0, 0, false);
        declareFunction(me, "sort_forts_external", "SORT-FORTS-EXTERNAL", 1, 0, false);
        declareFunction(me, "definitional_lits_to_front", "DEFINITIONAL-LITS-TO-FRONT", 1, 0, false);
        declareFunction(me, "evaluatable_expressions_out", "EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        declareFunction(me, "unwrap_if_ist", "UNWRAP-IF-IST", 2, 1, false);
        declareFunction(me, "unwrap_if_ist_permissive", "UNWRAP-IF-IST-PERMISSIVE", 1, 1, false);
        declareFunction(me, "unwrap_if_ist_discard_mt", "UNWRAP-IF-IST-DISCARD-MT", 1, 1, false);
        declareFunction(me, "unwrap_if_ist_canonical", "UNWRAP-IF-IST-CANONICAL", 1, 1, false);
        declareFunction(me, "unwrap_if_ist_permissive_canonical", "UNWRAP-IF-IST-PERMISSIVE-CANONICAL", 1, 1, false);
        declareFunction(me, "unwrap_if_ist_canonical_int", "UNWRAP-IF-IST-CANONICAL-INT", 4, 0, false);
        declareFunction(me, "unwrap_if_ist_int", "UNWRAP-IF-IST-INT", 4, 1, false);
        declareFunction(me, "unwrap_if_ist_recursive", "UNWRAP-IF-IST-RECURSIVE", 3, 1, false);
        declareFunction(me, "possibly_quoted_cycl_formula_p", "POSSIBLY-QUOTED-CYCL-FORMULA-P", 1, 0, false);
        declareFunction(me, "unwrap_quotes", "UNWRAP-QUOTES", 1, 0, false);
        declareFunction(me, "quoted_term_with_hl_varP", "QUOTED-TERM-WITH-HL-VAR?", 1, 0, false);
        new czer_utilities.$quoted_term_with_hl_varP$UnaryFunction();
        declareFunction(me, "escape_term", "ESCAPE-TERM", 1, 0, false);
        declareFunction(me, "possibly_escape_quote_hl_vars", "POSSIBLY-ESCAPE-QUOTE-HL-VARS", 1, 1, false);
        declareFunction(me, "escape_quote_hl_vars", "ESCAPE-QUOTE-HL-VARS", 1, 0, false);
        declareFunction(me, "nescape_quote_hl_vars", "NESCAPE-QUOTE-HL-VARS", 1, 0, false);
        declareFunction(me, "decontextualized_clausesP", "DECONTEXTUALIZED-CLAUSES?", 1, 0, false);
        declareFunction(me, "decontextualized_clauseP", "DECONTEXTUALIZED-CLAUSE?", 1, 0, false);
        declareFunction(me, "generalized_ist_clauses_p", "GENERALIZED-IST-CLAUSES-P", 1, 0, false);
        declareFunction(me, "generalized_ist_clause_p", "GENERALIZED-IST-CLAUSE-P", 1, 0, false);
        new czer_utilities.$generalized_ist_clause_p$UnaryFunction();
        declareFunction(me, "generalized_ist_literal_p", "GENERALIZED-IST-LITERAL-P", 1, 0, false);
        declareFunction(me, "opaque_arg_wrt_quoting_seeker", "OPAQUE-ARG-WRT-QUOTING-SEEKER", 2, 0, false);
        declareFunction(me, "note_opaque_reference_to_term", "NOTE-OPAQUE-REFERENCE-TO-TERM", 2, 0, false);
        declareFunction(me, "formula_references_term_opaquelyP", "FORMULA-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction(me, "assertion_references_term_opaquelyP", "ASSERTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction(me, "kb_hl_support_references_term_opaquelyP", "KB-HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction(me, "hl_support_references_term_opaquelyP", "HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction(me, "support_references_term_opaquelyP", "SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction(me, "deduction_references_term_opaquelyP", "DEDUCTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction(me, "term_opaque_assertions", "TERM-OPAQUE-ASSERTIONS", 1, 1, false);
        declareFunction(me, "all_term_opaque_assertions", "ALL-TERM-OPAQUE-ASSERTIONS", 1, 0, false);
        declareFunction(me, "term_opaque_deductions", "TERM-OPAQUE-DEDUCTIONS", 1, 1, false);
        declareFunction(me, "all_term_opaque_deductions", "ALL-TERM-OPAQUE-DEDUCTIONS", 1, 0, false);
        declareFunction(me, "canonicalize_el_query", "CANONICALIZE-EL-QUERY", 1, 2, false);
        declareFunction(me, "canonicalize_el_sentence", "CANONICALIZE-EL-SENTENCE", 2, 1, false);
        declareFunction(me, "canon_equalP", "CANON-EQUAL?", 2, 3, false);
        declareFunction(me, "canon_query_equalP", "CANON-QUERY-EQUAL?", 2, 3, false);
        declareFunction(me, "canon_assert_equalP", "CANON-ASSERT-EQUAL?", 2, 3, false);
        declareFunction(me, "canon_assert_isomorphicP", "CANON-ASSERT-ISOMORPHIC?", 2, 3, false);
        declareFunction(me, "canon_forms_equalP", "CANON-FORMS-EQUAL?", 2, 1, false);
        declareFunction(me, "canon_forms_isomorphicP", "CANON-FORMS-ISOMORPHIC?", 2, 1, false);
        declareFunction(me, "canon_equal_hl_namesP", "CANON-EQUAL-HL-NAMES?", 2, 4, false);
        declareFunction(me, "constant_occurs_in_formulaP", "CONSTANT-OCCURS-IN-FORMULA?", 2, 0, false);
        declareFunction(me, "canonicalize_and_return_skolem_vars", "CANONICALIZE-AND-RETURN-SKOLEM-VARS", 1, 1, false);
        declareFunction(me, "find_anywhere", "FIND-ANYWHERE", 2, 2, false);
        declareFunction(me, "find_all_anywhere", "FIND-ALL-ANYWHERE", 2, 3, false);
        declareFunction(me, "return_uncanon", "RETURN-UNCANON", 2, 0, false);
        declareFunction(me, "uncanon_original_test", "UNCANON-ORIGINAL-TEST", 2, 0, false);
        declareFunction(me, "uncanon_test", "UNCANON-TEST", 2, 2, false);
        declareFunction(me, "assert_return_uncanon", "ASSERT-RETURN-UNCANON", 3, 0, false);
        declareFunction(me, "canon_mal_resultP", "CANON-MAL-RESULT?", 1, 1, false);
        declareFunction(me, "canon_ask_mal_resultP", "CANON-ASK-MAL-RESULT?", 1, 1, false);
        declareFunction(me, "canon_query_mal_resultP", "CANON-QUERY-MAL-RESULT?", 1, 1, false);
        declareFunction(me, "canon_assert_mal_resultP", "CANON-ASSERT-MAL-RESULT?", 1, 1, false);
        declareFunction(me, "canon_form_mal_resultP", "CANON-FORM-MAL-RESULT?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_czer_utilities_file() {
        deflexical("*FORMULA-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*SOME-SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*SOME-QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
        defparameter("*CZER-EVALUATABLE-PREDICATE-FIX-ENABLED?*", NIL);
        defparameter("*OPAQUE-ARG-WRT-QUOTING-TARGET*", NIL);
        return NIL;
    }

    public static SubLObject setup_czer_utilities_file() {
        memoization_state.note_globally_cached_function($sym26$FORMULA_ARG_INT_);
        memoization_state.note_globally_cached_function($sym30$QUOTED_FORMULA_ARG_INT_);
        memoization_state.note_globally_cached_function($sym32$SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function($sym36$QUOTED_SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function($sym39$SOME_SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function($sym42$SOME_QUOTED_SENTENCE_ARG_INT_);
        memoization_state.note_memoized_function($sym71$EQUALS_EL_MEMOIZED_);
        note_funcall_helper_function(EL_VARIABLE_TOKEN);
        note_funcall_helper_function(OPAQUE_ARG_WRT_QUOTING_SEEKER);
        define_test_case_table_int($sym128$EQUALS_EL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list135);
        return NIL;
    }

    private static SubLObject _constant_135_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa"))), T), list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing"))), NIL), list(list(reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Thing"))), T), list(list(reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection"))), NIL), list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls"))), NIL), list(list(ONE_INTEGER, ONE_INTEGER), T), list(list(ONE_INTEGER, TWO_INTEGER), NIL), list(list(ONE_INTEGER, reader_make_constant_shell(makeString("Thing"))), NIL), list(list(ONE_INTEGER, makeSymbol("?X")), NIL), list(list(makeSymbol("?X"), makeSymbol("?X")), T), list(list(makeSymbol("?X"), makeSymbol("?Y")), T), list(list(reader_make_constant_shell(makeString("Thing")), makeSymbol("?X")), NIL), list(list(makeSymbol("?X"), reader_make_constant_shell(makeString("Thing"))), NIL), list(list(reader_make_constant_shell(makeString("Thing")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Thing")))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Thing")))), T), list(list(list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Thing")))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Thing")))), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Thing")))), reader_make_constant_shell(makeString("Thing")))), T), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), makeSymbol("?X"))), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("TheSet")), TWO_INTEGER, ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("TheSet")), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("TheSet")), THREE_INTEGER, ONE_INTEGER)), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("TheSet")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("January"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("February")))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("February"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("January"))))), T), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("January"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("February")))), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("February"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("February"))))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("January"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("February")))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("February"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("March"))))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("January"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("February")))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("February"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("March"))))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("January"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("February")))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("February"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("March"))))), NIL), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y"))))), T), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X")))), NIL), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("conceptuallyRelated")), makeSymbol("?Y"), makeSymbol("?X"))))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("conceptuallyRelated")), makeSymbol("?Y"), makeSymbol("?X")))))), T), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X"))))), NIL), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell(makeString("forAll")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X"))))), T), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X")))), T), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?X"))), reader_make_constant_shell(makeString("BaseKB")), makeKeyword("DNF")), NIL), list(list(reader_make_constant_shell(makeString("TheEmptySet")), list(reader_make_constant_shell(makeString("TheSet")))), T), list(list(list(reader_make_constant_shell(makeString("Unity")), list(ZERO_INTEGER, reader_make_constant_shell(makeString("TheEmptySet")))), list(reader_make_constant_shell(makeString("Unity")), list(ZERO_INTEGER, list(reader_make_constant_shell(makeString("TheSet")))))), T) });
    }

    @Override
    public void declareFunctions() {
        declare_czer_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_czer_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_czer_utilities_file();
    }

    

    public static final class $canon_varP$UnaryFunction extends UnaryFunction {
        public $canon_varP$UnaryFunction() {
            super(extractFunctionNamed("CANON-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return canon_varP(arg1);
        }
    }

    public static final class $quoted_term_with_hl_varP$UnaryFunction extends UnaryFunction {
        public $quoted_term_with_hl_varP$UnaryFunction() {
            super(extractFunctionNamed("QUOTED-TERM-WITH-HL-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return quoted_term_with_hl_varP(arg1);
        }
    }

    public static final class $generalized_ist_clause_p$UnaryFunction extends UnaryFunction {
        public $generalized_ist_clause_p$UnaryFunction() {
            super(extractFunctionNamed("GENERALIZED-IST-CLAUSE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return generalized_ist_clause_p(arg1);
        }
    }
}

/**
 * Total time: 1182 ms
 */
