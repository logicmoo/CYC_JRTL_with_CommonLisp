package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class czer_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.czer_utilities";
    public static final String myFingerPrint = "f3937e96ff510cb1d24e599a2f208b0a011cf35c221b3e58ed5757b81d432ce9";
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10508L)
    private static SubLSymbol $formula_arg_intP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10735L)
    private static SubLSymbol $quoted_formula_arg_intP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11512L)
    private static SubLSymbol $sentence_arg_intP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11768L)
    private static SubLSymbol $quoted_sentence_arg_intP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12316L)
    private static SubLSymbol $some_sentence_arg_intP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12562L)
    private static SubLSymbol $some_quoted_sentence_arg_intP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 21666L)
    private static SubLSymbol $czer_evaluatable_predicate_fix_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 52464L)
    private static SubLSymbol $opaque_arg_wrt_quoting_target$;
    private static final SubLSymbol $kw0$TRUE;
    private static final SubLObject $const1$canonicalizerDirectiveForArg;
    private static final SubLSymbol $kw2$GAF;
    private static final SubLObject $const3$canonicalizerDirectiveForArgAndRe;
    private static final SubLObject $const4$canonicalizerDirectiveForAllArgs;
    private static final SubLObject $const5$LeaveSomeTermsAtEL;
    private static final SubLList $list6;
    private static final SubLObject $const7$LeaveSomeTermsAtELAndAllowKeyword;
    private static final SubLList $list8;
    private static final SubLObject $const9$AllowKeywordVariables;
    private static final SubLList $list10;
    private static final SubLObject $const11$LeaveVariablesAtEL;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLObject $const14$AllowGenericArgVariables;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$EL_VAR;
    private static final SubLString $str17$X__d;
    private static final SubLSymbol $kw18$KB_VAR;
    private static final SubLString $str19$_a_was_not_a_canonical_variable;
    private static final SubLObject $const20$RelaxArgTypeConstraintsForVariabl;
    private static final SubLObject $const21$DontReOrderCommutativeTerms;
    private static final SubLObject $const22$CycLIndexedTerm;
    private static final SubLObject $const23$CycLExpression;
    private static final SubLObject $const24$CycLExpression_Assertible;
    private static final SubLObject $const25$CycLExpression_Askable;
    private static final SubLSymbol $sym26$FORMULA_ARG_INT_;
    private static final SubLObject $const27$CycLFormula;
    private static final SubLSymbol $sym28$_FORMULA_ARG_INT__CACHING_STATE_;
    private static final SubLInteger $int29$1024;
    private static final SubLSymbol $sym30$QUOTED_FORMULA_ARG_INT_;
    private static final SubLSymbol $sym31$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_;
    private static final SubLSymbol $sym32$SENTENCE_ARG_INT_;
    private static final SubLObject $const33$CycLSentence;
    private static final SubLSymbol $sym34$_SENTENCE_ARG_INT__CACHING_STATE_;
    private static final SubLSymbol $sym35$CLEAR_SENTENCE_ARG_INT_;
    private static final SubLSymbol $sym36$QUOTED_SENTENCE_ARG_INT_;
    private static final SubLSymbol $sym37$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_;
    private static final SubLSymbol $sym38$CLEAR_QUOTED_SENTENCE_ARG_INT_;
    private static final SubLSymbol $sym39$SOME_SENTENCE_ARG_INT_;
    private static final SubLSymbol $sym40$_SOME_SENTENCE_ARG_INT__CACHING_STATE_;
    private static final SubLSymbol $sym41$CLEAR_SOME_SENTENCE_ARG_INT_;
    private static final SubLSymbol $sym42$SOME_QUOTED_SENTENCE_ARG_INT_;
    private static final SubLSymbol $sym43$_SOME_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_;
    private static final SubLSymbol $sym44$CLEAR_SOME_QUOTED_SENTENCE_ARG_INT_;
    private static final SubLObject $const45$CycLSentence_Askable;
    private static final SubLObject $const46$CycLSentence_Assertible;
    private static final SubLObject $const47$CycLDenotationalTerm;
    private static final SubLObject $const48$ist;
    private static final SubLSymbol $sym49$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym50$NPUT_BACK_CLAUSE_EL_VARIABLES;
    private static final SubLSymbol $sym51$PUT_BACK_CLAUSE_EL_VARIABLES;
    private static final SubLSymbol $sym52$FIRST;
    private static final SubLSymbol $sym53$SECOND;
    private static final SubLObject $const54$termOfUnit;
    private static final SubLString $str55$function;
    private static final SubLObject $const56$equals;
    private static final SubLObject $const57$evaluate;
    private static final SubLSymbol $sym58$STRING_;
    private static final SubLString $str59$;
    private static final SubLString $str60$__s;
    private static final SubLSymbol $sym61$_X;
    private static final SubLString $str62$Could_not_create_a_unique_HL_var_;
    private static final SubLSymbol $kw63$DEFAULT;
    private static final SubLSymbol $sym64$CYC_VAR_;
    private static final SubLObject $const65$trueSentence;
    private static final SubLSymbol $sym66$EL_FORMULA_P;
    private static final SubLObject $const67$functionCommutesWith;
    private static final SubLSymbol $sym68$FORT_OR_NAUT_WITH_CORRESPONDING_NART_;
    private static final SubLSymbol $sym69$VARIABLE_P;
    private static final SubLSymbol $sym70$NEGATE_ATOMIC;
    private static final SubLSymbol $sym71$EQUALS_EL_MEMOIZED_;
    private static final SubLSymbol $kw72$CNF;
    private static final SubLSymbol $kw73$DNF;
    private static final SubLSymbol $sym74$CLAUSAL_FORM_P;
    private static final SubLSymbol $sym75$BOOLEANP;
    private static final SubLString $str76$Unexpected_clausal_form__s;
    private static final SubLSymbol $sym77$NON_NULL_CLOSED_TERM_;
    private static final SubLSymbol $sym78$EL_VAR_;
    private static final SubLSymbol $sym79$EL_VARIABLE_TOKEN;
    private static final SubLSymbol $kw80$OPAQUIFIED_EL_VARIABLE;
    private static final SubLSymbol $sym81$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym82$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_;
    private static final SubLSymbol $sym83$FORT_P;
    private static final SubLObject $const84$TheSet;
    private static final SubLSymbol $sym85$EVALUATABLE_EXPRESSION_;
    private static final SubLSymbol $sym86$TRANSFORM_EVALUATION_EXPRESSION;
    private static final SubLString $str87$_s__s_does_not_adequately_specify;
    private static final SubLObject $const88$ist_Asserted;
    private static final SubLSymbol $sym89$HL_VAR_;
    private static final SubLObject $const90$EscapeQuote;
    private static final SubLSymbol $sym91$QUOTED_TERM_WITH_HL_VAR_;
    private static final SubLSymbol $sym92$ESCAPE_TERM;
    private static final SubLSymbol $sym93$NESCAPE_QUOTE_HL_VARS;
    private static final SubLSymbol $sym94$DECONTEXTUALIZED_CLAUSE_;
    private static final SubLSymbol $sym95$GENERALIZED_IST_CLAUSE_P;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$OPAQUE_ARG_WRT_QUOTING_SEEKER;
    private static final SubLSymbol $kw98$OPAQUE_ARG_FOUND;
    private static final SubLSymbol $sym99$CYCL_FORMULA_P;
    private static final SubLSymbol $sym100$ASSERTION_P;
    private static final SubLSymbol $sym101$KB_HL_SUPPORT_P;
    private static final SubLSymbol $sym102$HL_SUPPORT_P;
    private static final SubLSymbol $sym103$DEDUCTION_P;
    private static final SubLSymbol $sym104$INDEXED_TERM_P;
    private static final SubLSymbol $sym105$KBEQ;
    private static final SubLObject $const106$EverythingPSC;
    private static final SubLObject $const107$False;
    private static final SubLSymbol $sym108$LIT__;
    private static final SubLSymbol $sym109$CLAUSE_BINDING_LIST_PAIRS_LITERAL;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$TERM__;
    private static final SubLSymbol $sym112$SKOLEM_NART_;
    private static final SubLSymbol $sym113$CDR;
    private static final SubLSymbol $kw114$ASSERT;
    private static final SubLString $str115$__Error__assert_failed__S___;
    private static final SubLString $str116$__Error__Can_t_find_assertion___;
    private static final SubLSymbol $kw117$UNASSERT;
    private static final SubLString $str118$__Form___A_in__A__;
    private static final SubLString $str119$__Error__assert_failed__;
    private static final SubLString $str120$__Error__Can_t_find_assertions___;
    private static final SubLString $str121$__The_assertion_is__S___;
    private static final SubLString $str122$__Its_EL_form_is__S_in__S___;
    private static final SubLString $str123$__Error__Can_t_find_assertions___;
    private static final SubLString $str124$__Its_New_EL_form_is__S_in__S___;
    private static final SubLString $str125$__Error__EL_mismatch___Original__;
    private static final SubLString $str126$__Error__assert_failed___S__;
    private static final SubLString $str127$__Error__unassert_failed___S__;
    private static final SubLSymbol $sym128$EQUALS_EL_;
    private static final SubLSymbol $kw129$TEST;
    private static final SubLSymbol $kw130$OWNER;
    private static final SubLSymbol $kw131$CLASSES;
    private static final SubLSymbol $kw132$KB;
    private static final SubLSymbol $kw133$TINY;
    private static final SubLSymbol $kw134$WORKING_;
    private static final SubLObject $list135;
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 710L)
    public static SubLObject some_canonicalizer_directive_assertionsP(final SubLObject relation, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != forts.fort_p(relation) && czer_utilities.NIL != some_canonicalizer_directive_assertions_somewhereP(relation)) {
            SubLObject cdolist_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
            SubLObject czer_pred = (SubLObject)czer_utilities.NIL;
            czer_pred = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                if (czer_utilities.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(relation, czer_pred, mt, (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.$kw0$TRUE)) {
                    return (SubLObject)czer_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                czer_pred = cdolist_list_var.first();
            }
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 1188L)
    public static SubLObject some_canonicalizer_directive_assertions_somewhereP(final SubLObject relation) {
        if (czer_utilities.NIL != forts.fort_p(relation)) {
            SubLObject foundP = (SubLObject)czer_utilities.NIL;
            if (czer_utilities.NIL == foundP) {
                SubLObject csome_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
                SubLObject czer_pred = (SubLObject)czer_utilities.NIL;
                czer_pred = csome_list_var.first();
                while (czer_utilities.NIL == foundP && czer_utilities.NIL != csome_list_var) {
                    if (czer_utilities.NIL != somewhere_cache.some_pred_assertion_somewhereP(czer_pred, relation, (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.UNPROVIDED)) {
                        foundP = (SubLObject)czer_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    czer_pred = csome_list_var.first();
                }
            }
            return foundP;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 1698L)
    public static SubLObject canonicalizer_directive_for_argP(final SubLObject relation, final SubLObject argnum, final SubLObject directive, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == some_canonicalizer_directive_assertions_somewhereP(relation)) {
            return (SubLObject)czer_utilities.NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            SubLObject pred_var = czer_utilities.$const1$canonicalizerDirectiveForArg;
            if (czer_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)czer_utilities.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)czer_utilities.ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = (SubLObject)czer_utilities.NIL;
                while (czer_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (czer_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)czer_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)czer_utilities.$kw2$GAF, (SubLObject)czer_utilities.$kw0$TRUE, (SubLObject)czer_utilities.NIL);
                            SubLObject done_var_$1 = resultP;
                            final SubLObject token_var_$2 = (SubLObject)czer_utilities.NIL;
                            while (czer_utilities.NIL == done_var_$1) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(ass));
                                if (czer_utilities.NIL != valid_$3) {
                                    final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                    final SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                    resultP = (SubLObject)SubLObjectFactory.makeBoolean(argnum.eql(asserted_argnum) && czer_utilities.NIL != kb_utilities.kbeq(directive, asserted_directive));
                                }
                                done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid_$3 || czer_utilities.NIL != resultP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)czer_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (czer_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid || czer_utilities.NIL != resultP);
                }
            }
            pred_var = czer_utilities.$const3$canonicalizerDirectiveForArgAndRe;
            if (czer_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)czer_utilities.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)czer_utilities.ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = (SubLObject)czer_utilities.NIL;
                while (czer_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (czer_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)czer_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)czer_utilities.$kw2$GAF, (SubLObject)czer_utilities.$kw0$TRUE, (SubLObject)czer_utilities.NIL);
                            SubLObject done_var_$2 = resultP;
                            final SubLObject token_var_$3 = (SubLObject)czer_utilities.NIL;
                            while (czer_utilities.NIL == done_var_$2) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(ass));
                                if (czer_utilities.NIL != valid_$4) {
                                    final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                    final SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                    resultP = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != subl_promotions.non_negative_integer_p(asserted_argnum) && argnum.numGE(asserted_argnum) && czer_utilities.NIL != kb_utilities.kbeq(directive, asserted_directive));
                                }
                                done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid_$4 || czer_utilities.NIL != resultP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)czer_utilities.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (czer_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid || czer_utilities.NIL != resultP);
                }
            }
            pred_var = czer_utilities.$const4$canonicalizerDirectiveForAllArgs;
            if (czer_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)czer_utilities.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)czer_utilities.ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = (SubLObject)czer_utilities.NIL;
                while (czer_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (czer_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)czer_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)czer_utilities.$kw2$GAF, (SubLObject)czer_utilities.$kw0$TRUE, (SubLObject)czer_utilities.NIL);
                            SubLObject done_var_$3 = resultP;
                            final SubLObject token_var_$4 = (SubLObject)czer_utilities.NIL;
                            while (czer_utilities.NIL == done_var_$3) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(ass));
                                if (czer_utilities.NIL != valid_$5) {
                                    final SubLObject asserted_directive2 = assertions_high.gaf_arg2(ass);
                                    resultP = kb_utilities.kbeq(directive, asserted_directive2);
                                }
                                done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid_$5 || czer_utilities.NIL != resultP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)czer_utilities.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                if (czer_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid || czer_utilities.NIL != resultP);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (czer_utilities.NIL == resultP) {
            SubLObject csome_list_var = direct_spec_canonicalizer_directives(directive);
            SubLObject spec_directive = (SubLObject)czer_utilities.NIL;
            spec_directive = csome_list_var.first();
            while (czer_utilities.NIL == resultP && czer_utilities.NIL != csome_list_var) {
                if (czer_utilities.NIL != canonicalizer_directive_for_argP(relation, argnum, spec_directive, mt)) {
                    resultP = (SubLObject)czer_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                spec_directive = csome_list_var.first();
            }
        }
        return resultP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 3204L)
    public static SubLObject direct_genl_canonicalizer_directives(final SubLObject directive) {
        if (directive.eql(czer_utilities.$const5$LeaveSomeTermsAtEL)) {
            return (SubLObject)czer_utilities.$list6;
        }
        if (directive.eql(czer_utilities.$const7$LeaveSomeTermsAtELAndAllowKeyword)) {
            return (SubLObject)czer_utilities.$list8;
        }
        if (directive.eql(czer_utilities.$const9$AllowKeywordVariables)) {
            return (SubLObject)czer_utilities.$list10;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 3715L)
    public static SubLObject direct_spec_canonicalizer_directives(final SubLObject directive) {
        if (directive.eql(czer_utilities.$const11$LeaveVariablesAtEL)) {
            return (SubLObject)czer_utilities.$list12;
        }
        if (directive.eql(czer_utilities.$const5$LeaveSomeTermsAtEL)) {
            return (SubLObject)czer_utilities.$list13;
        }
        if (directive.eql(czer_utilities.$const9$AllowKeywordVariables)) {
            return (SubLObject)czer_utilities.$list13;
        }
        if (directive.eql(czer_utilities.$const14$AllowGenericArgVariables)) {
            return (SubLObject)czer_utilities.$list15;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 4277L)
    public static SubLObject get_nth_canonical_variable(final SubLObject n, SubLObject type) {
        if (type == czer_utilities.UNPROVIDED) {
            type = czer_vars.$canonical_variable_type$.getDynamicValue();
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)czer_utilities.$kw16$EL_VAR)) {
            return cycl_variables.make_el_var(PrintLow.format((SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.$str17$X__d, n));
        }
        if (pcase_var.eql((SubLObject)czer_utilities.$kw18$KB_VAR)) {
            return variables.find_variable_by_id(n);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 4503L)
    public static SubLObject canonical_variable_number(final SubLObject var) {
        if (czer_utilities.NIL != cycl_grammar.el_variable_p(var)) {
            final SubLObject name = cycl_variables.el_var_name(var);
            final SubLObject suffix = string_utilities.substring(name, (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.UNPROVIDED);
            final SubLObject num = string_utilities.string_to_integer(suffix);
            if (num.isInteger()) {
                return num;
            }
        }
        else if (czer_utilities.NIL != cycl_grammar.hl_variable_p(var)) {
            return variables.variable_id(var);
        }
        return Errors.error((SubLObject)czer_utilities.$str19$_a_was_not_a_canonical_variable, var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 4851L)
    public static SubLObject arg_permits_generic_arg_variablesP(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return canonicalizer_directive_for_argP(reln, argnum, czer_utilities.$const14$AllowGenericArgVariables, mt);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 5161L)
    public static SubLObject arg_permits_keyword_variablesP(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return canonicalizer_directive_for_argP(reln, argnum, czer_utilities.$const9$AllowKeywordVariables, mt);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 5460L)
    public static SubLObject relax_arg_type_constraints_for_variables_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, czer_utilities.$const20$RelaxArgTypeConstraintsForVariabl, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 5658L)
    public static SubLObject dont_reorder_commutative_terms_for_args(final SubLObject relation, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject argnums = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == some_canonicalizer_directive_assertions_somewhereP(relation)) {
            return (SubLObject)czer_utilities.NIL;
        }
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            SubLObject assertions = cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs(czer_utilities.$const1$canonicalizerDirectiveForArg, relation, czer_utilities.$const21$DontReOrderCommutativeTerms, (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.$kw0$TRUE);
            SubLObject ass = (SubLObject)czer_utilities.NIL;
            ass = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                if (czer_utilities.NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) {
                    argnums = (SubLObject)ConsesLow.cons(asserted_argnum, argnums);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
            assertions = (cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs(czer_utilities.$const3$canonicalizerDirectiveForArgAndRe, relation, czer_utilities.$const21$DontReOrderCommutativeTerms, (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.$kw0$TRUE));
            ass = (SubLObject)czer_utilities.NIL;
            ass = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                final SubLObject v_arity = arity.arity(relation);
                if (czer_utilities.NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) {
                    SubLObject end_var;
                    SubLObject argnum;
                    for (end_var = Numbers.add(v_arity, (SubLObject)czer_utilities.ONE_INTEGER), argnum = (SubLObject)czer_utilities.NIL, argnum = asserted_argnum; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                        argnums = (SubLObject)ConsesLow.cons(argnum, argnums);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
            assertions = kb_mapping_utilities.pred_u_v_holds_gafs(czer_utilities.$const4$canonicalizerDirectiveForAllArgs, relation, czer_utilities.$const21$DontReOrderCommutativeTerms, (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.TWO_INTEGER, (SubLObject)czer_utilities.$kw0$TRUE);
            if (czer_utilities.NIL != assertions) {
                final SubLObject v_arity2 = arity.arity(relation);
                SubLObject end_var2;
                SubLObject argnum2;
                for (end_var2 = Numbers.add(v_arity2, (SubLObject)czer_utilities.ONE_INTEGER), argnum2 = (SubLObject)czer_utilities.NIL, argnum2 = (SubLObject)czer_utilities.ONE_INTEGER; !argnum2.numGE(end_var2); argnum2 = number_utilities.f_1X(argnum2)) {
                    argnums = (SubLObject)ConsesLow.cons(argnum2, argnums);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(argnums, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 6935L)
    public static SubLObject possibly_assertion_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 7393L)
    public static SubLObject assertion_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_vars.$meta_arg_type$.getGlobalValue(), kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_vars.$meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 7789L)
    public static SubLObject indexed_argP(final SubLObject reln, final SubLObject psn) {
        if (psn.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            SubLObject formulaP = (SubLObject)czer_utilities.NIL;
            if (czer_utilities.NIL == formulaP) {
                SubLObject csome_list_var = kb_accessors.argn_isa(reln, psn, (SubLObject)czer_utilities.UNPROVIDED);
                SubLObject type = (SubLObject)czer_utilities.NIL;
                type = csome_list_var.first();
                while (czer_utilities.NIL == formulaP && czer_utilities.NIL != csome_list_var) {
                    if (czer_utilities.NIL != genls.genlsP(type, czer_utilities.$const22$CycLIndexedTerm, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
                        formulaP = (SubLObject)czer_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    type = csome_list_var.first();
                }
            }
            return formulaP;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 8117L)
    public static SubLObject expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isNumber() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_utilities.$const23$CycLExpression, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_utilities.$const23$CycLExpression, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 8698L)
    public static SubLObject assertible_expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isNumber() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_utilities.$const24$CycLExpression_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_utilities.$const24$CycLExpression_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 9323L)
    public static SubLObject askable_expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isNumber() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_utilities.$const25$CycLExpression_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_utilities.$const25$CycLExpression_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 9939L)
    public static SubLObject formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isInteger() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        mt = hlmt.hlmt_monad_mt(mt);
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != formula_arg_intP(relation, argnum, mt) || czer_utilities.NIL != quoted_formula_arg_intP(relation, argnum, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10508L)
    public static SubLObject clear_formula_arg_intP() {
        final SubLObject cs = czer_utilities.$formula_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10508L)
    public static SubLObject remove_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(czer_utilities.$formula_arg_intP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation, argnum, mt), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10508L)
    public static SubLObject formula_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP(czer_utilities.$const27$CycLFormula, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10508L)
    public static SubLObject formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        SubLObject caching_state = czer_utilities.$formula_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)czer_utilities.$sym26$FORMULA_ARG_INT_, (SubLObject)czer_utilities.$sym28$_FORMULA_ARG_INT__CACHING_STATE_, (SubLObject)czer_utilities.$int29$1024, (SubLObject)czer_utilities.EQUAL, (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)czer_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)czer_utilities.NIL;
            collision = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (czer_utilities.NIL != cached_args && czer_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(formula_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10735L)
    public static SubLObject clear_quoted_formula_arg_intP() {
        final SubLObject cs = czer_utilities.$quoted_formula_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10735L)
    public static SubLObject remove_quoted_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(czer_utilities.$quoted_formula_arg_intP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation, argnum, mt), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10735L)
    public static SubLObject quoted_formula_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP(czer_utilities.$const27$CycLFormula, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10735L)
    public static SubLObject quoted_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        SubLObject caching_state = czer_utilities.$quoted_formula_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)czer_utilities.$sym30$QUOTED_FORMULA_ARG_INT_, (SubLObject)czer_utilities.$sym31$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_, (SubLObject)czer_utilities.$int29$1024, (SubLObject)czer_utilities.EQUAL, (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)czer_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)czer_utilities.NIL;
            collision = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (czer_utilities.NIL != cached_args && czer_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(quoted_formula_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 10976L)
    public static SubLObject sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isInteger() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        mt = hlmt.hlmt_monad_mt(mt);
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != sentence_arg_intP(relation, argnum, mt) || czer_utilities.NIL != quoted_sentence_arg_intP(relation, argnum, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11512L)
    public static SubLObject clear_sentence_arg_intP() {
        final SubLObject cs = czer_utilities.$sentence_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11512L)
    public static SubLObject remove_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(czer_utilities.$sentence_arg_intP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation, argnum, mt), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11512L)
    public static SubLObject sentence_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP(czer_utilities.$const33$CycLSentence, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11512L)
    public static SubLObject sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        SubLObject caching_state = czer_utilities.$sentence_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)czer_utilities.$sym32$SENTENCE_ARG_INT_, (SubLObject)czer_utilities.$sym34$_SENTENCE_ARG_INT__CACHING_STATE_, (SubLObject)czer_utilities.$int29$1024, (SubLObject)czer_utilities.EQUAL, (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback((SubLObject)czer_utilities.$sym35$CLEAR_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)czer_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)czer_utilities.NIL;
            collision = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (czer_utilities.NIL != cached_args && czer_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sentence_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11768L)
    public static SubLObject clear_quoted_sentence_arg_intP() {
        final SubLObject cs = czer_utilities.$quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11768L)
    public static SubLObject remove_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(czer_utilities.$quoted_sentence_arg_intP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation, argnum, mt), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11768L)
    public static SubLObject quoted_sentence_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP(czer_utilities.$const33$CycLSentence, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 11768L)
    public static SubLObject quoted_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        SubLObject caching_state = czer_utilities.$quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)czer_utilities.$sym36$QUOTED_SENTENCE_ARG_INT_, (SubLObject)czer_utilities.$sym37$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_, (SubLObject)czer_utilities.$int29$1024, (SubLObject)czer_utilities.EQUAL, (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback((SubLObject)czer_utilities.$sym38$CLEAR_QUOTED_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)czer_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)czer_utilities.NIL;
            collision = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (czer_utilities.NIL != cached_args && czer_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(quoted_sentence_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12038L)
    public static SubLObject some_sentence_argP(final SubLObject reln, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != some_sentence_arg_intP(reln, mt) || czer_utilities.NIL != some_quoted_sentence_arg_intP(reln, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12316L)
    public static SubLObject clear_some_sentence_arg_intP() {
        final SubLObject cs = czer_utilities.$some_sentence_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12316L)
    public static SubLObject remove_some_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(czer_utilities.$some_sentence_arg_intP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation, mt), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12316L)
    public static SubLObject some_sentence_arg_intP_internal(final SubLObject relation, final SubLObject mt) {
        return genls.any_specP(czer_utilities.$const33$CycLSentence, kb_accessors.arg_isa(relation, mt), mt, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12316L)
    public static SubLObject some_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        SubLObject caching_state = czer_utilities.$some_sentence_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)czer_utilities.$sym39$SOME_SENTENCE_ARG_INT_, (SubLObject)czer_utilities.$sym40$_SOME_SENTENCE_ARG_INT__CACHING_STATE_, (SubLObject)czer_utilities.$int29$1024, (SubLObject)czer_utilities.EQUAL, (SubLObject)czer_utilities.TWO_INTEGER, (SubLObject)czer_utilities.ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback((SubLObject)czer_utilities.$sym41$CLEAR_SOME_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)czer_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)czer_utilities.NIL;
            collision = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (czer_utilities.NIL != cached_args && czer_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(some_sentence_arg_intP_internal(relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(relation, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12562L)
    public static SubLObject clear_some_quoted_sentence_arg_intP() {
        final SubLObject cs = czer_utilities.$some_quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12562L)
    public static SubLObject remove_some_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(czer_utilities.$some_quoted_sentence_arg_intP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation, mt), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12562L)
    public static SubLObject some_quoted_sentence_arg_intP_internal(final SubLObject relation, final SubLObject mt) {
        return genls.any_specP(czer_utilities.$const33$CycLSentence, kb_accessors.arg_quoted_isa(relation, mt), mt, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12562L)
    public static SubLObject some_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        SubLObject caching_state = czer_utilities.$some_quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (czer_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)czer_utilities.$sym42$SOME_QUOTED_SENTENCE_ARG_INT_, (SubLObject)czer_utilities.$sym43$_SOME_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_, (SubLObject)czer_utilities.$int29$1024, (SubLObject)czer_utilities.EQUAL, (SubLObject)czer_utilities.TWO_INTEGER, (SubLObject)czer_utilities.ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback((SubLObject)czer_utilities.$sym44$CLEAR_SOME_QUOTED_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)czer_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)czer_utilities.NIL;
            collision = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (czer_utilities.NIL != cached_args && czer_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(some_quoted_sentence_arg_intP_internal(relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(relation, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 12822L)
    public static SubLObject askable_formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isNumber() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_utilities.$const45$CycLSentence_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_utilities.$const45$CycLSentence_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 13411L)
    public static SubLObject assertable_formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isNumber() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_utilities.$const46$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_utilities.$const46$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 13999L)
    public static SubLObject askable_sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isNumber() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_utilities.$const45$CycLSentence_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_utilities.$const45$CycLSentence_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 14555L)
    public static SubLObject assertable_sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == forts.fort_p(relation) || !argnum.isNumber() || !argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(relation)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_utilities.$const46$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_utilities.$const46$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 15107L)
    public static SubLObject denotational_term_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != forts.fort_p(relation) && argnum.isNumber() && argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != genls.any_specP(czer_utilities.$const47$CycLDenotationalTerm, kb_accessors.argn_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != genls.any_specP(czer_utilities.$const47$CycLDenotationalTerm, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, (SubLObject)czer_utilities.UNPROVIDED));
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 15511L)
    public static SubLObject leave_some_terms_at_el_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, czer_utilities.$const5$LeaveSomeTermsAtEL, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 15674L)
    public static SubLObject leave_variables_at_el_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, czer_utilities.$const11$LeaveVariablesAtEL, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 15836L)
    public static SubLObject arg_isa_quotedP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.NIL != forts.fort_p(relation) && argnum.isNumber() && argnum.numG((SubLObject)czer_utilities.ZERO_INTEGER)) {
            SubLObject ans = (SubLObject)czer_utilities.NIL;
            final SubLObject arg_isa_quoted_arg = kb_accessors.arg_quoted_isa_pred(argnum, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            if (czer_utilities.NIL != arg_isa_quoted_arg) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    ans = kb_mapping_utilities.fpred_value(relation, kb_accessors.arg_quoted_isa_pred(argnum, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return ans;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 16189L)
    public static SubLObject distributing_meta_predP(final SubLObject pred) {
        return fort_types_interface.distributing_meta_knowledge_predicate_p(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 16382L)
    public static SubLObject find_hl_gaf(final SubLObject formula, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        final SubLObject assertion = safe_find_gaf_genl_mts(formula, mt);
        if (czer_utilities.NIL != term.kb_assertionP(assertion)) {
            return assertion;
        }
        if (czer_utilities.NIL != mt) {
            return (SubLObject)ConsesLow.list(czer_utilities.$const48$ist, mt, formula);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 16874L)
    public static SubLObject find_hl_gaf_if(final SubLObject formula, final SubLObject mt) {
        final SubLObject assertion = safe_find_gaf_genl_mts(formula, mt);
        if (czer_utilities.NIL != term.kb_assertionP(assertion)) {
            return assertion;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 17032L)
    public static SubLObject safe_find_gaf_genl_mts(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gaf = (SubLObject)czer_utilities.NIL;
        SubLObject error_message = (SubLObject)czer_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)czer_utilities.$sym49$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    gaf = kb_indexing.find_gaf_genl_mts(formula, mt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)czer_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 17246L)
    public static SubLObject nput_back_clause_el_variables(final SubLObject list) {
        SubLObject clause = list.first();
        final SubLObject blist = conses_high.second(list);
        clause = nescape_quote_hl_vars(clause);
        SubLObject cdolist_list_var = blist;
        SubLObject binding = (SubLObject)czer_utilities.NIL;
        binding = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            clause = conses_high.nsubst(binding.first(), binding.rest(), clause, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 17622L)
    public static SubLObject put_back_clause_el_variables(final SubLObject list) {
        SubLObject clause = list.first();
        final SubLObject blist = conses_high.second(list);
        clause = nescape_quote_hl_vars(conses_high.copy_tree(clause));
        SubLObject cdolist_list_var = blist;
        SubLObject binding = (SubLObject)czer_utilities.NIL;
        binding = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            clause = conses_high.nsubst(binding.first(), binding.rest(), clause, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 17994L)
    public static SubLObject list_of_clause_binding_list_pairs_p(final SubLObject v_object) {
        if (!v_object.isCons()) {
            return (SubLObject)czer_utilities.NIL;
        }
        SubLObject cdolist_list_var = v_object;
        SubLObject pair = (SubLObject)czer_utilities.NIL;
        pair = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            if (czer_utilities.NIL == list_utilities.lengthLE(pair, (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL == clauses.cnf_p(pair.first()) || czer_utilities.NIL == bindings.binding_list_p(conses_high.second(pair))) {
                return (SubLObject)czer_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return (SubLObject)czer_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 18645L)
    public static SubLObject clause_binding_list_pairs_literal(final SubLObject v_object) {
        return clauses.singleton_clause_literal(v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 18758L)
    public static SubLObject nextract_el_clauses(final SubLObject thing) {
        return (czer_utilities.NIL != list_of_clause_binding_list_pairs_p(thing)) ? Mapping.mapcar((SubLObject)czer_utilities.$sym50$NPUT_BACK_CLAUSE_EL_VARIABLES, thing) : thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 19155L)
    public static SubLObject extract_el_clauses(final SubLObject thing) {
        return (czer_utilities.NIL != list_of_clause_binding_list_pairs_p(thing)) ? Mapping.mapcar((SubLObject)czer_utilities.$sym51$PUT_BACK_CLAUSE_EL_VARIABLES, thing) : thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 19554L)
    public static SubLObject extract_hl_clauses(final SubLObject thing) {
        return (czer_utilities.NIL != list_of_clause_binding_list_pairs_p(thing)) ? Mapping.mapcar((SubLObject)czer_utilities.$sym52$FIRST, thing) : thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 19908L)
    public static SubLObject nextract_hl_clauses(final SubLObject thing) {
        return (czer_utilities.NIL != list_of_clause_binding_list_pairs_p(thing)) ? list_utilities.nmapcar((SubLObject)czer_utilities.$sym52$FIRST, thing) : thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 20260L)
    public static SubLObject extract_blists(final SubLObject thing) {
        return (czer_utilities.NIL != list_of_clause_binding_list_pairs_p(thing)) ? Mapping.mapcar((SubLObject)czer_utilities.$sym53$SECOND, thing) : thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 20611L)
    public static SubLObject nextract_blists(final SubLObject thing) {
        return (czer_utilities.NIL != list_of_clause_binding_list_pairs_p(thing)) ? list_utilities.nmapcar((SubLObject)czer_utilities.$sym53$SECOND, thing) : thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 20960L)
    public static SubLObject fn_tou_lit(final SubLObject fn_term, final SubLObject literals) {
        SubLObject tou = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == tou) {
            SubLObject csome_list_var = el_utilities.tou_lits(literals);
            SubLObject lit = (SubLObject)czer_utilities.NIL;
            lit = csome_list_var.first();
            while (czer_utilities.NIL == tou && czer_utilities.NIL != csome_list_var) {
                if (fn_term.equal(el_utilities.literal_arg2(lit, (SubLObject)czer_utilities.UNPROVIDED))) {
                    tou = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            }
        }
        return tou;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 21176L)
    public static SubLObject fn_equals_lit(final SubLObject fn_term, final SubLObject literals) {
        SubLObject equals_lit = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == equals_lit) {
            SubLObject csome_list_var = el_utilities.equals_lits(literals);
            SubLObject lit = (SubLObject)czer_utilities.NIL;
            lit = csome_list_var.first();
            while (czer_utilities.NIL == equals_lit && czer_utilities.NIL != csome_list_var) {
                if (fn_term.equal(conses_high.third(lit))) {
                    equals_lit = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            }
        }
        return equals_lit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 21387L)
    public static SubLObject fn_evaluate_lit(final SubLObject fn_term, final SubLObject literals, SubLObject test) {
        if (test == czer_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)czer_utilities.EQUAL);
        }
        SubLObject evaluate_lit = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == evaluate_lit) {
            SubLObject csome_list_var = literals;
            SubLObject lit = (SubLObject)czer_utilities.NIL;
            lit = csome_list_var.first();
            while (czer_utilities.NIL == evaluate_lit && czer_utilities.NIL != csome_list_var) {
                if (czer_utilities.NIL != el_utilities.evaluate_litP(lit, (SubLObject)czer_utilities.UNPROVIDED) && czer_utilities.NIL != Functions.funcall(test, fn_term, el_utilities.literal_arg2(lit, (SubLObject)czer_utilities.UNPROVIDED))) {
                    evaluate_lit = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            }
        }
        return evaluate_lit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 21794L)
    public static SubLObject fn_some_non_evaluatable_referenceP(final SubLObject fn_term, final SubLObject literals, SubLObject test) {
        if (test == czer_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)czer_utilities.EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.NIL == czer_utilities.$czer_evaluatable_predicate_fix_enabledP$.getDynamicValue(thread)) {
            return (SubLObject)czer_utilities.T;
        }
        SubLObject non_evaluatable_reference = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == non_evaluatable_reference) {
            SubLObject csome_list_var = literals;
            SubLObject lit = (SubLObject)czer_utilities.NIL;
            lit = csome_list_var.first();
            while (czer_utilities.NIL == non_evaluatable_reference && czer_utilities.NIL != csome_list_var) {
                final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(lit);
                if ((czer_utilities.NIL == forts.fort_p(predicate) || czer_utilities.NIL == relation_evaluation.evaluatable_predicateP(predicate, (SubLObject)czer_utilities.UNPROVIDED)) && czer_utilities.NIL != list_utilities.tree_find(fn_term, lit, test, (SubLObject)czer_utilities.UNPROVIDED)) {
                    non_evaluatable_reference = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            }
        }
        return non_evaluatable_reference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 22305L)
    public static SubLObject make_nart_var_tou_lit(final SubLObject fn_term) {
        return el_utilities.make_binary_formula(czer_utilities.$const54$termOfUnit, make_nart_var_for_tou_lit(cycl_utilities.formula_arg0(fn_term)), fn_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 22623L)
    public static SubLObject make_nart_var_for_tou_lit(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.NIL != misc_utilities.initialized_p(czer_main.$tou_skolem_blist$.getDynamicValue(thread))) {
            final SubLObject orig_var = list_utilities.alist_lookup(czer_main.$tou_skolem_blist$.getDynamicValue(thread), fn, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            if (czer_utilities.NIL != orig_var) {
                return orig_var;
            }
        }
        return cycl_variables.make_el_var(clause_new_el_var_name((SubLObject)((czer_utilities.NIL != forts.fort_p(fn)) ? constants_high.constant_name(fn) : czer_utilities.$str55$function)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 22929L)
    public static SubLObject make_nart_var_equals_lit(final SubLObject fn_term) {
        return el_utilities.make_binary_formula(czer_utilities.$const56$equals, cycl_variables.make_el_var(clause_new_el_var_name((SubLObject)((czer_utilities.NIL != forts.fort_p(cycl_utilities.formula_arg0(fn_term))) ? constants_high.constant_name(cycl_utilities.formula_arg0(fn_term)) : czer_utilities.$str55$function))), fn_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 23329L)
    public static SubLObject make_nart_var_evaluate_lit(final SubLObject fn_term) {
        return el_utilities.make_binary_formula(czer_utilities.$const57$evaluate, cycl_variables.make_el_var(clause_new_el_var_name((SubLObject)((czer_utilities.NIL != forts.fort_p(cycl_utilities.formula_arg0(fn_term))) ? constants_high.constant_name(cycl_utilities.formula_arg0(fn_term)) : czer_utilities.$str55$function))), fn_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 23735L)
    public static SubLObject clause_new_el_var_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_name = unique_var_name_wrt(name, czer_vars.$clause_el_var_names$.getDynamicValue(thread));
        if (czer_utilities.NIL == subl_promotions.memberP(new_name, czer_vars.$clause_el_var_names$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)czer_utilities.$sym58$STRING_), (SubLObject)czer_utilities.UNPROVIDED)) {
            czer_vars.$clause_el_var_names$.setDynamicValue((SubLObject)ConsesLow.cons(new_name, czer_vars.$clause_el_var_names$.getDynamicValue(thread)), thread);
        }
        return new_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 23983L)
    public static SubLObject unique_var_name_wrt(final SubLObject string, final SubLObject strings) {
        SubLObject n = (SubLObject)czer_utilities.NIL;
        SubLObject post = (SubLObject)czer_utilities.NIL;
        SubLObject new_string = (SubLObject)czer_utilities.NIL;
        SubLObject var_string = (SubLObject)czer_utilities.NIL;
        n = (SubLObject)czer_utilities.ZERO_INTEGER;
        post = (SubLObject)czer_utilities.$str59$;
        for (new_string = Sequences.cconcatenate(string, post), var_string = make_czer_el_var_name(new_string); czer_utilities.NIL != subl_promotions.memberP(var_string, strings, Symbols.symbol_function((SubLObject)czer_utilities.$sym58$STRING_), (SubLObject)czer_utilities.UNPROVIDED); var_string = make_czer_el_var_name(new_string)) {
            n = Numbers.add(n, (SubLObject)czer_utilities.ONE_INTEGER);
            post = PrintLow.format((SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.$str60$__s, n);
            new_string = Sequences.cconcatenate(string, post);
        }
        return var_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 24316L)
    public static SubLObject unique_el_var_wrt_expression(final SubLObject expression, SubLObject v_default) {
        if (v_default == czer_utilities.UNPROVIDED) {
            v_default = (SubLObject)czer_utilities.$sym61$_X;
        }
        SubLObject new_var;
        for (new_var = v_default; czer_utilities.NIL != cycl_utilities.expression_find(new_var, expression, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED); new_var = czer_main.uniquify(new_var)) {}
        return new_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 24536L)
    public static SubLObject unique_hl_var_wrt_expression(final SubLObject expression, SubLObject expression2) {
        if (expression2 == czer_utilities.UNPROVIDED) {
            expression2 = (SubLObject)czer_utilities.NIL;
        }
        SubLObject end_var;
        SubLObject num;
        SubLObject hl_var;
        for (end_var = variables.variable_count(), num = (SubLObject)czer_utilities.NIL, num = (SubLObject)czer_utilities.ZERO_INTEGER; !num.numGE(end_var); num = number_utilities.f_1X(num)) {
            hl_var = variables.find_variable_by_id(num);
            if (czer_utilities.NIL == cycl_utilities.expression_find(hl_var, expression, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED) && czer_utilities.NIL == cycl_utilities.expression_find(hl_var, expression2, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
                return hl_var;
            }
        }
        return Errors.error((SubLObject)czer_utilities.$str62$Could_not_create_a_unique_HL_var_, expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 25012L)
    public static SubLObject make_czer_el_var_name(final SubLObject string) {
        return cycl_variables.el_var_name(cycl_variables.make_el_var(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 25231L)
    public static SubLObject canon_varP(final SubLObject candidate_variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != candidate_variable && czer_utilities.NIL != ((czer_vars.$canon_var_function$.getDynamicValue(thread) == czer_utilities.$kw63$DEFAULT) ? cycl_variables.cyc_varP(candidate_variable) : Functions.funcall(czer_vars.$canon_var_function$.getDynamicValue(thread), candidate_variable)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 25674L)
    public static SubLObject true_sentenceP(final SubLObject formula) {
        if (czer_utilities.NIL == el_utilities.el_negation_p(formula)) {
            return el_utilities.true_sentence_litP(formula);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 25881L)
    public static SubLObject true_negated_varP(final SubLObject formula, SubLObject varP) {
        if (varP == czer_utilities.UNPROVIDED) {
            varP = (SubLObject)czer_utilities.$sym64$CYC_VAR_;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != true_sentenceP(formula) && czer_utilities.NIL != el_utilities.el_negation_p(cycl_utilities.formula_arg1(formula, (SubLObject)czer_utilities.UNPROVIDED)) && czer_utilities.NIL != Functions.funcall(varP, cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(formula, (SubLObject)czer_utilities.UNPROVIDED), (SubLObject)czer_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 26098L)
    public static SubLObject true_negated_formulaP(final SubLObject formula) {
        if (czer_utilities.NIL != true_sentenceP(formula)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != el_utilities.el_negation_p(cycl_utilities.formula_arg1(formula, (SubLObject)czer_utilities.UNPROVIDED)) || czer_utilities.NIL != el_utilities.el_quantified_negation_p(cycl_utilities.formula_arg1(formula, (SubLObject)czer_utilities.UNPROVIDED)));
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 26294L)
    public static SubLObject true_var_formulaP(final SubLObject formula, SubLObject varP) {
        if (varP == czer_utilities.UNPROVIDED) {
            varP = (SubLObject)czer_utilities.$sym64$CYC_VAR_;
        }
        if (czer_utilities.NIL != true_sentenceP(formula)) {
            return Functions.funcall(varP, cycl_utilities.formula_arg1(formula, (SubLObject)czer_utilities.UNPROVIDED));
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 26449L)
    public static SubLObject encapsulate_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.NIL != el_utilities.sequence_var(formula, (SubLObject)czer_utilities.UNPROVIDED)) {
            if (czer_utilities.NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread) && czer_utilities.NIL != el_utilities.el_formula_p(formula) && czer_utilities.NIL != el_utilities.cyc_const_logical_operator_p(cycl_utilities.formula_operator(formula)) && czer_utilities.NIL != wff.el_wff_syntaxP(formula, (SubLObject)czer_utilities.UNPROVIDED)) {
                return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
            }
            SubLObject result = (SubLObject)czer_utilities.NIL;
            final SubLObject formula_$13;
            final SubLObject tempformula = formula_$13 = ((czer_utilities.NIL != el_utilities.sequence_var(formula, (SubLObject)czer_utilities.UNPROVIDED)) ? el_utilities.strip_sequence_var(formula) : formula);
            result = encapsulate_formulaP(formula_$13);
            return result;
        }
        else {
            if (czer_utilities.NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread) && czer_utilities.NIL != cycl_variables.el_varP(formula)) {
                return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
            }
            if (czer_utilities.NIL != czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread) && czer_utilities.NIL != intensional_formulaP(formula)) {
                return czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread);
            }
            return (SubLObject)czer_utilities.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 27210L)
    public static SubLObject encapsulate_formula(final SubLObject formula, SubLObject varP) {
        if (varP == czer_utilities.UNPROVIDED) {
            varP = (SubLObject)czer_utilities.$sym64$CYC_VAR_;
        }
        if (czer_utilities.NIL != el_utilities.sequence_var(formula, (SubLObject)czer_utilities.UNPROVIDED)) {
            return el_utilities.make_unary_formula(czer_utilities.$const65$trueSentence, formula);
        }
        if (czer_utilities.NIL != Functions.funcall(varP, formula)) {
            return make_var_formula_lit(formula);
        }
        if (czer_utilities.NIL != intensional_formulaP(formula)) {
            return make_intensional_lit(formula);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 27526L)
    public static SubLObject intensional_formulaP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean((czer_utilities.NIL != within_disjunctionP() && czer_utilities.NIL == within_negated_disjunctionP() && ((czer_utilities.NIL != el_utilities.el_universal_p(formula) && (czer_utilities.NIL == el_utilities.el_quantified_negation_p(formula) || czer_utilities.NIL == within_negationP())) || ((czer_utilities.NIL != el_utilities.el_existential_p(formula) || czer_utilities.NIL != el_utilities.el_bounded_existential_p(formula)) && (czer_utilities.NIL != within_negationP() || czer_utilities.NIL != el_utilities.el_quantified_negation_p(formula))))) || (czer_utilities.NIL != control_vars.within_askP() && ((czer_utilities.NIL != within_negationP() && (czer_utilities.NIL != el_utilities.el_existential_p(formula) || czer_utilities.NIL != el_utilities.el_bounded_existential_p(formula))) || (czer_utilities.NIL == within_negationP() && czer_utilities.NIL != el_utilities.el_universal_p(formula)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 28752L)
    public static SubLObject make_var_formula_lit(final SubLObject var) {
        return el_utilities.make_unary_formula(czer_utilities.$const65$trueSentence, var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 28844L)
    public static SubLObject make_intensional_lit(final SubLObject formula) {
        if (czer_utilities.NIL != control_vars.within_askP() && czer_utilities.NIL != within_negationP() && czer_utilities.NIL != el_utilities.el_general_existential_p(formula)) {
            return make_intensional_lit_int(formula);
        }
        if (czer_utilities.NIL != within_negationP()) {
            return el_utilities.make_unary_formula(czer_utilities.$const65$trueSentence, formula);
        }
        if (czer_utilities.NIL != control_vars.within_askP()) {
            return el_utilities.make_unary_formula(czer_utilities.$const65$trueSentence, formula);
        }
        return make_intensional_lit_int(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 29409L)
    public static SubLObject make_intensional_lit_int(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)czer_utilities.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
        try {
            czer_vars.$encapsulate_intensional_formulaP$.bind((SubLObject)czer_utilities.NIL, thread);
            result = cycl_utilities.negate(el_utilities.make_unary_formula(czer_utilities.$const65$trueSentence, simplifier.simplify_cycl_sentence(clausifier.do_negations(cycl_utilities.negate(formula)), (SubLObject)czer_utilities.UNPROVIDED)));
        }
        finally {
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 29667L)
    public static SubLObject formula_has_expansionP(final SubLObject formula, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        assert czer_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return relation_has_expansionP(cycl_utilities.formula_operator(formula), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 30041L)
    public static SubLObject relation_has_expansionP(final SubLObject relation, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.NIL != forts.fort_p(relation)) {
            SubLObject result = (SubLObject)czer_utilities.NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                result = verbosifier.el_expansionP(relation);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 30342L)
    public static SubLObject within_negationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return czer_vars.$within_negationP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 30486L)
    public static SubLObject within_disjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_disjunctionP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 30556L)
    public static SubLObject within_conjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_conjunctionP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 30687L)
    public static SubLObject within_negated_disjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_negated_disjunctionP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 30773L)
    public static SubLObject commuting_functionsP(final SubLObject func1, final SubLObject func2, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != forts.fort_p(func1) && czer_utilities.NIL != forts.fort_p(func2) && (czer_utilities.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(czer_utilities.$const67$functionCommutesWith, func1, func2, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(czer_utilities.$const67$functionCommutesWith, func2, func1, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 31180L)
    public static SubLObject reifiable_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((czer_utilities.NIL != forts.fort_p(functor) || czer_utilities.NIL != term.first_order_nautP(functor)) && czer_utilities.NIL != fort_types_interface.isa_reifiable_functionP(functor, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 31673L)
    public static SubLObject reifiable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != el_utilities.el_formula_p(v_term) && czer_utilities.NIL != ((czer_utilities.NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread)) ? SubLObjectFactory.makeBoolean(czer_utilities.NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term)) || czer_utilities.NIL != reifiable_functorP(cycl_utilities.nat_functor(v_term), mt)) : SubLObjectFactory.makeBoolean(czer_utilities.NIL != reifiable_functorP(cycl_utilities.nat_functor(v_term), mt) && czer_utilities.NIL != term.closed_fn_termP(v_term))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 32045L)
    public static SubLObject wf_reifiable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != reifiable_function_termP(v_term, mt) && czer_utilities.NIL != wff.el_wftP(v_term, mt, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 32184L)
    public static SubLObject reifiable_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != forts.fort_p(v_term) || czer_utilities.NIL != reifiable_function_termP(v_term, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != term.skolem_termP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 32314L)
    public static SubLObject reifiable_nat_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == constant_handles.constant_p(v_term) && czer_utilities.NIL != reifiable_termP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 32427L)
    public static SubLObject unreified_reifiable_nat_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != reifiable_nat_termP(v_term) && czer_utilities.NIL == nart_handles.nart_p(v_term) && czer_utilities.NIL == narts_high.find_nart(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 32664L)
    public static SubLObject reifiable_nautP(final SubLObject v_term, SubLObject varP, SubLObject mt) {
        if (varP == czer_utilities.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)czer_utilities.$sym64$CYC_VAR_);
        }
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != term.closed_nautP(v_term, varP)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != reifiable_function_termP(v_term, mt) || czer_utilities.NIL != narts_high.find_nart(v_term));
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 32893L)
    public static SubLObject fort_or_naut_with_corresponding_nartP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != forts.fort_p(v_term) || czer_utilities.NIL != naut_with_corresponding_nartP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 33025L)
    public static SubLObject list_of_fort_or_naut_with_corresponding_nartP(final SubLObject obj) {
        return list_utilities.list_of_type_p((SubLObject)czer_utilities.$sym68$FORT_OR_NAUT_WITH_CORRESPONDING_NART_, obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 33162L)
    public static SubLObject naut_with_corresponding_nartP(final SubLObject v_term) {
        if (czer_utilities.NIL != term.ground_nautP(v_term, Symbols.symbol_function((SubLObject)czer_utilities.$sym69$VARIABLE_P))) {
            return list_utilities.sublisp_boolean(narts_high.find_nart(v_term));
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 33386L)
    public static SubLObject evaluatable_function_symbolP(final SubLObject symbol, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != forts.fort_p(symbol) && czer_utilities.NIL != fort_types_interface.evaluatable_function_p(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 33568L)
    public static SubLObject evaluatable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != el_utilities.el_formula_p(v_term) && czer_utilities.NIL != evaluatable_function_symbolP(cycl_utilities.nat_functor(v_term), mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 33727L)
    public static SubLObject unpackage_cnf_clause(final SubLObject cnf) {
        final SubLObject neg_lits = Mapping.mapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym70$NEGATE_ATOMIC), clauses.neg_lits(cnf));
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        return simplifier.disjoin(conses_high.nunion(neg_lits, pos_lits, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED), (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 33995L)
    public static SubLObject unpackage_dnf_clause(final SubLObject dnf) {
        final SubLObject neg_lits = Mapping.mapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym70$NEGATE_ATOMIC), clauses.neg_lits(dnf));
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        return simplifier.conjoin(conses_high.nunion(neg_lits, pos_lits, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED), (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 34264L)
    public static SubLObject equals_el_memoizedP_internal(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == czer_utilities.UNPROVIDED) {
            clausal_form = (SubLObject)czer_utilities.$kw72$CNF;
        }
        return equals_el_intP(object_1, object_2, mt, clausal_form, (SubLObject)czer_utilities.T, (SubLObject)czer_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 34264L)
    public static SubLObject equals_el_memoizedP(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == czer_utilities.UNPROVIDED) {
            clausal_form = (SubLObject)czer_utilities.$kw72$CNF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == v_memoization_state) {
            return equals_el_memoizedP_internal(object_1, object_2, mt, clausal_form);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)czer_utilities.$sym71$EQUALS_EL_MEMOIZED_, (SubLObject)czer_utilities.UNPROVIDED);
        if (czer_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)czer_utilities.$sym71$EQUALS_EL_MEMOIZED_, (SubLObject)czer_utilities.FOUR_INTEGER, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.EQUAL, (SubLObject)czer_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)czer_utilities.$sym71$EQUALS_EL_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(object_1, object_2, mt, clausal_form);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)czer_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)czer_utilities.NIL;
            collision = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (object_1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (object_2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (czer_utilities.NIL != cached_args && czer_utilities.NIL == cached_args.rest() && clausal_form.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(equals_el_memoizedP_internal(object_1, object_2, mt, clausal_form)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(object_1, object_2, mt, clausal_form));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 34528L)
    public static SubLObject queries_equal_at_elP(final SubLObject query1, final SubLObject query2, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return equals_elP(query1, query2, mt, (SubLObject)czer_utilities.$kw73$DNF, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 34645L)
    public static SubLObject terms_equal_at_elP(final SubLObject term1, final SubLObject term2, SubLObject perform_equals_unification) {
        if (perform_equals_unification == czer_utilities.UNPROVIDED) {
            perform_equals_unification = control_vars.$perform_equals_unification$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)czer_utilities.NIL;
        final SubLObject _prev_bind_0 = control_vars.$perform_equals_unification$.currentBinding(thread);
        try {
            control_vars.$perform_equals_unification$.bind(perform_equals_unification, thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != equals.equalsP(term1, term2, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED) || czer_utilities.NIL != equals.equalsP(cycl_utilities.hl_to_el(term1), cycl_utilities.hl_to_el(term2), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED));
        }
        finally {
            control_vars.$perform_equals_unification$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 34966L)
    public static SubLObject equals_elP(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form, SubLObject canonicalize_sentencesP) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == czer_utilities.UNPROVIDED) {
            clausal_form = (SubLObject)czer_utilities.$kw72$CNF;
        }
        if (canonicalize_sentencesP == czer_utilities.UNPROVIDED) {
            canonicalize_sentencesP = (SubLObject)czer_utilities.T;
        }
        return equals_el_intP(object_1, object_2, mt, clausal_form, (SubLObject)czer_utilities.NIL, canonicalize_sentencesP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 35780L)
    public static SubLObject equals_el_intP(final SubLObject object_1, final SubLObject object_2, final SubLObject mt, final SubLObject clausal_form, final SubLObject memoized_internalsP, final SubLObject canonicalize_sentencesP) {
        assert czer_utilities.NIL != clause_utilities.clausal_form_p(clausal_form) : clausal_form;
        assert czer_utilities.NIL != Types.booleanp(memoized_internalsP) : memoized_internalsP;
        if (czer_utilities.NIL != equals.equalsP(object_1, object_2, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
            return (SubLObject)czer_utilities.T;
        }
        if (czer_utilities.NIL != assertion_handles.assertion_p(object_1)) {
            if (czer_utilities.NIL != assertion_handles.assertion_p(object_2)) {
                return equals.equalsP(uncanonicalizer.assertion_el_ist_formula(object_1), uncanonicalizer.assertion_el_ist_formula(object_2), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            }
            if (czer_utilities.NIL != el_utilities.el_formula_p(object_2)) {
                return equals_el_intP(uncanonicalizer.assertion_el_ist_formula(object_1), object_2, mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
            }
        }
        else if (czer_utilities.NIL != assertion_handles.assertion_p(object_2)) {
            if (czer_utilities.NIL != el_utilities.el_formula_p(object_1)) {
                return equals_el_intP(object_1, uncanonicalizer.assertion_el_ist_formula(object_2), mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
            }
        }
        else if (czer_utilities.NIL != nart_handles.nart_p(object_1)) {
            if (czer_utilities.NIL != el_utilities.possibly_naut_p(object_2)) {
                return equals_el_intP(narts_high.nart_hl_formula(object_1), object_2, mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
            }
        }
        else {
            if (czer_utilities.NIL != nart_handles.nart_p(object_2) && czer_utilities.NIL != el_utilities.possibly_naut_p(object_1)) {
                return equals_el_intP(object_1, narts_high.nart_hl_formula(object_2), mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
            }
            if (czer_utilities.NIL != cycl_variables.cyc_varP(object_1) && czer_utilities.NIL != cycl_variables.cyc_varP(object_2)) {
                return (SubLObject)czer_utilities.T;
            }
            if (czer_utilities.NIL != el_utilities.el_formula_p(object_1) && czer_utilities.NIL != el_utilities.el_formula_p(object_2)) {
                return (SubLObject)((czer_utilities.NIL != canonicalize_sentencesP) ? el_expression_equalP(object_1, object_2, mt, clausal_form, memoized_internalsP) : czer_utilities.NIL);
            }
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 37544L)
    public static SubLObject el_expression_equalP(final SubLObject expr1, final SubLObject expr2, SubLObject mt, SubLObject clausal_form, SubLObject memoized_internalsP) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == czer_utilities.UNPROVIDED) {
            clausal_form = (SubLObject)czer_utilities.NIL;
        }
        if (memoized_internalsP == czer_utilities.UNPROVIDED) {
            memoized_internalsP = (SubLObject)czer_utilities.NIL;
        }
        final SubLObject el_1 = canonicalize_for_equals_el(expr1, mt, clausal_form, memoized_internalsP);
        final SubLObject el_2 = canonicalize_for_equals_el(expr2, mt, clausal_form, memoized_internalsP);
        if (czer_utilities.NIL != el_utilities.el_formula_p(el_1) && czer_utilities.NIL != el_utilities.el_formula_p(el_2)) {
            return el_expression_equal_unification_successfulP(unification_utilities.unify_clauses(list_utilities.nmapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym52$FIRST), el_1), list_utilities.nmapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym52$FIRST), el_2), (SubLObject)czer_utilities.T, (SubLObject)czer_utilities.UNPROVIDED));
        }
        final SubLObject term_1 = (czer_utilities.NIL != memoized_internalsP) ? czer_main.canonicalize_term_memoized(expr1, mt) : czer_main.canonicalize_term(expr1, mt);
        final SubLObject term_2 = (czer_utilities.NIL != memoized_internalsP) ? czer_main.canonicalize_term_memoized(expr2, mt) : czer_main.canonicalize_term(expr2, mt);
        return equals.equalsP(term_1, term_2, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 38811L)
    public static SubLObject canonicalize_for_equals_el(final SubLObject expression, final SubLObject mt, final SubLObject clausal_form, final SubLObject memoized_internalsP) {
        if (clausal_form.eql((SubLObject)czer_utilities.$kw72$CNF)) {
            if (czer_utilities.NIL != memoized_internalsP) {
                return czer_main.canonicalize_wf_cycl_memoized(expression, mt);
            }
            return czer_main.canonicalize_wf_cycl(expression, mt);
        }
        else {
            if (!clausal_form.eql((SubLObject)czer_utilities.$kw73$DNF)) {
                return Errors.error((SubLObject)czer_utilities.$str76$Unexpected_clausal_form__s, clausal_form);
            }
            if (czer_utilities.NIL != memoized_internalsP) {
                return czer_main.canonicalize_ask_memoized(expression, mt);
            }
            return czer_main.canonicalize_ask(expression, mt);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 39283L)
    public static SubLObject el_expression_equal_unification_successfulP(final SubLObject unification_result) {
        if (czer_utilities.NIL != list_utilities.singletonP(unification_result) && czer_utilities.NIL != bindings.unification_success_token_p(unification_result.first())) {
            return (SubLObject)czer_utilities.T;
        }
        if (czer_utilities.NIL == unification_result) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == list_utilities.tree_find_if((SubLObject)czer_utilities.$sym77$NON_NULL_CLOSED_TERM_, unification_result, (SubLObject)czer_utilities.UNPROVIDED)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 39716L)
    public static SubLObject problem_queries_equal_modulo_el_var_names(final SubLObject problem_query_1, final SubLObject problem_query_2) {
        return equal_modulo_el_var_names_int(problem_query_1, problem_query_2, (SubLObject)czer_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 39886L)
    public static SubLObject equal_modulo_el_var_names(final SubLObject object_1, final SubLObject object_2) {
        return equal_modulo_el_var_names_int(object_1, object_2, (SubLObject)czer_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 40011L)
    public static SubLObject equal_modulo_el_var_names_int(SubLObject object_1, SubLObject object_2, final SubLObject problem_queriesP) {
        if (object_1.equal(object_2)) {
            return (SubLObject)czer_utilities.T;
        }
        if (czer_utilities.NIL == list_utilities.tree_find_if((SubLObject)czer_utilities.$sym78$EL_VAR_, object_1, (SubLObject)czer_utilities.UNPROVIDED)) {
            return (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == list_utilities.tree_find_if((SubLObject)czer_utilities.$sym78$EL_VAR_, object_2, (SubLObject)czer_utilities.UNPROVIDED)) {
            return (SubLObject)czer_utilities.NIL;
        }
        final SubLObject opaque_object_1 = transform_list_utilities.transform(object_1, (SubLObject)czer_utilities.$sym78$EL_VAR_, (SubLObject)czer_utilities.$sym79$EL_VARIABLE_TOKEN, (SubLObject)czer_utilities.UNPROVIDED);
        final SubLObject opaque_object_2 = transform_list_utilities.transform(object_2, (SubLObject)czer_utilities.$sym78$EL_VAR_, (SubLObject)czer_utilities.$sym79$EL_VARIABLE_TOKEN, (SubLObject)czer_utilities.UNPROVIDED);
        if (opaque_object_1.equal(opaque_object_2)) {
            if (czer_utilities.NIL != problem_queriesP) {
                object_1 = inference_czer.problem_query_el_formula(object_1);
                object_2 = inference_czer.problem_query_el_formula(object_2);
            }
            return equals_elP(object_1, object_2, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 40653L)
    public static SubLObject el_variable_token(SubLObject dummy) {
        if (dummy == czer_utilities.UNPROVIDED) {
            dummy = (SubLObject)czer_utilities.NIL;
        }
        return (SubLObject)czer_utilities.$kw80$OPAQUIFIED_EL_VARIABLE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 40764L)
    public static SubLObject non_null_closed_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != v_object && czer_utilities.NIL != el_utilities.closedP(v_object, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 40858L)
    public static SubLObject delete_el_duplicates(final SubLObject list_of_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert czer_utilities.NIL != list_utilities.non_dotted_list_p(list_of_terms) : list_of_terms;
        SubLObject result = (SubLObject)czer_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = list_of_terms;
                SubLObject v_term = (SubLObject)czer_utilities.NIL;
                v_term = cdolist_list_var.first();
                while (czer_utilities.NIL != cdolist_list_var) {
                    if (czer_utilities.NIL != cycl_utilities.reified_term_p(v_term)) {
                        result = Sequences.delete(v_term, result, (SubLObject)czer_utilities.$sym71$EQUALS_EL_MEMOIZED_, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
                        result = (SubLObject)ConsesLow.cons(v_term, result);
                    }
                    else {
                        final SubLObject item_var = v_term;
                        if (czer_utilities.NIL == conses_high.member(item_var, result, (SubLObject)czer_utilities.$sym71$EQUALS_EL_MEMOIZED_, Symbols.symbol_function((SubLObject)czer_utilities.IDENTITY))) {
                            result = (SubLObject)ConsesLow.cons(item_var, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)czer_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 41890L)
    public static SubLObject cnfs_reorder_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == czer_utilities.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)czer_utilities.$sym69$VARIABLE_P);
        }
        return Equality.equal(czer_main.rename_clause_vars(czer_main.sort_clause_literals(czer_main.canonicalize_clause_commutative_terms(cnf1), varP), (SubLObject)czer_utilities.UNPROVIDED).first(), czer_main.rename_clause_vars(czer_main.sort_clause_literals(czer_main.canonicalize_clause_commutative_terms(cnf2), varP), (SubLObject)czer_utilities.UNPROVIDED).first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 42356L)
    public static SubLObject cnfs_reorder_literals_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == czer_utilities.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)czer_utilities.$sym69$VARIABLE_P);
        }
        return Equality.equal(czer_main.rename_clause_vars(czer_main.sort_clause_literals(cnf1, varP), varP).first(), czer_main.rename_clause_vars(czer_main.sort_clause_literals(cnf2, varP), varP).first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 42689L)
    public static SubLObject cnfs_reorder_terms_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == czer_utilities.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)czer_utilities.$sym69$VARIABLE_P);
        }
        return Equality.equal(czer_main.rename_clause_vars(czer_main.canonicalize_clause_commutative_terms(cnf1), varP).first(), czer_main.rename_clause_vars(czer_main.canonicalize_clause_commutative_terms(cnf2), varP).first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 43040L)
    public static SubLObject ordered_cnf_unifyP(final SubLObject cnf1, final SubLObject cnf2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != ordered_literals_unify(clauses.neg_lits(cnf1), clauses.neg_lits(cnf2)) && czer_utilities.NIL != ordered_literals_unify(clauses.pos_lits(cnf1), clauses.pos_lits(cnf2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 43223L)
    public static SubLObject ordered_literals_unify(final SubLObject literals1, final SubLObject literals2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(literals1).numE(Sequences.length(literals2)) && czer_utilities.NIL != ordered_literals_unify_int(literals1, literals2) && czer_utilities.NIL != ordered_literals_unify_int(literals2, literals1));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 43452L)
    public static SubLObject ordered_literals_unify_int(final SubLObject literals1, final SubLObject literals2) {
        SubLObject failsP;
        SubLObject lits1;
        SubLObject lits2;
        SubLObject lit1;
        SubLObject lit2;
        for (failsP = (SubLObject)czer_utilities.NIL, lits1 = (SubLObject)czer_utilities.NIL, lits2 = (SubLObject)czer_utilities.NIL, lit1 = (SubLObject)czer_utilities.NIL, lit2 = (SubLObject)czer_utilities.NIL, lits1 = literals1, lits2 = literals2, lit1 = lits1.first(), lit2 = lits2.first(); czer_utilities.NIL == failsP && czer_utilities.NIL != lit1 && czer_utilities.NIL != lit2; failsP = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == unification_utilities.asent_unify(lit1, lit2, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)), lits1 = lits1.rest(), lits2 = lits2.rest(), lit1 = lits1.first(), lit2 = lits2.first()) {}
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == failsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 43797L)
    public static SubLObject el_find_nart(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nat = czer_main.canonicalize_fn_term_int(naut, (SubLObject)czer_utilities.T, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.UNPROVIDED);
        if (czer_utilities.NIL != nart_handles.nart_p(nat)) {
            return nat;
        }
        if (czer_utilities.NIL != robust_nart_lookupP()) {
            final SubLObject _prev_bind_0 = control_vars.$nat_matching_predicate$.currentBinding(thread);
            try {
                control_vars.$nat_matching_predicate$.bind((SubLObject)czer_utilities.$sym82$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_, thread);
                nat = narts_high.find_nart(nat);
            }
            finally {
                control_vars.$nat_matching_predicate$.rebind(_prev_bind_0, thread);
            }
            return nat;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 44184L)
    public static SubLObject el_find_if_nart(final SubLObject v_object) {
        if (czer_utilities.NIL != el_utilities.possibly_naut_p(v_object)) {
            final SubLObject nart = el_find_nart(v_object);
            if (czer_utilities.NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 44480L)
    public static SubLObject recanonicalized_candidate_nat_equals_nat_formulaP(final SubLObject candidate_nat, final SubLObject target_nat) {
        return Equality.equal(recanonicalize_candidate_nat(candidate_nat), target_nat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 44728L)
    public static SubLObject recanonicalize_candidate_nat(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.NIL != czer_vars.$recanonicalizing_candidate_natP$.getDynamicValue(thread)) {
            return nat;
        }
        SubLObject result = (SubLObject)czer_utilities.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$recanonicalizing_candidate_natP$.currentBinding(thread);
        try {
            czer_vars.$recanonicalizing_candidate_natP$.bind((SubLObject)czer_utilities.T, thread);
            result = czer_main.canonicalize_term(nat, (SubLObject)czer_utilities.UNPROVIDED);
        }
        finally {
            czer_vars.$recanonicalizing_candidate_natP$.rebind(_prev_bind_0, thread);
        }
        if (czer_utilities.NIL != nart_handles.nart_p(result)) {
            return narts_high.nart_hl_formula(result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 45053L)
    public static SubLObject robust_nart_lookupP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.$kw63$DEFAULT == czer_vars.$robust_nart_lookup$.getDynamicValue(thread)) {
            return (SubLObject)czer_utilities.NIL;
        }
        return czer_vars.$robust_nart_lookup$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 45708L)
    public static SubLObject sort_forts_external(final SubLObject v_forts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert czer_utilities.NIL != list_utilities.non_dotted_list_p(v_forts) : v_forts;
        SubLObject cdolist_list_var = v_forts;
        SubLObject elem = (SubLObject)czer_utilities.NIL;
        elem = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            assert czer_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject result = (SubLObject)czer_utilities.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$new_canonicalizerP$.currentBinding(thread);
        try {
            czer_vars.$new_canonicalizerP$.bind((SubLObject)czer_utilities.T, thread);
            result = cycl_utilities.formula_args(czer_main.canonicalize_term(reader.bq_cons(czer_utilities.$const84$TheSet, ConsesLow.append(v_forts, (SubLObject)czer_utilities.NIL)), (SubLObject)czer_utilities.UNPROVIDED), (SubLObject)czer_utilities.UNPROVIDED);
        }
        finally {
            czer_vars.$new_canonicalizerP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 46034L)
    public static SubLObject definitional_lits_to_front(final SubLObject literals) {
        SubLObject isa_lits = (SubLObject)czer_utilities.NIL;
        SubLObject genls_lits = (SubLObject)czer_utilities.NIL;
        SubLObject rest = (SubLObject)czer_utilities.NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject lit = (SubLObject)czer_utilities.NIL;
        lit = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            if (czer_utilities.NIL != el_utilities.isa_litP(lit)) {
                isa_lits = (SubLObject)ConsesLow.cons(lit, isa_lits);
            }
            else if (czer_utilities.NIL != el_utilities.quoted_isa_litP(lit)) {
                isa_lits = (SubLObject)ConsesLow.cons(lit, isa_lits);
            }
            else if (czer_utilities.NIL != el_utilities.result_isa_litP(lit)) {
                isa_lits = (SubLObject)ConsesLow.cons(lit, isa_lits);
            }
            else if (czer_utilities.NIL != el_utilities.genls_litP(lit)) {
                genls_lits = (SubLObject)ConsesLow.cons(lit, genls_lits);
            }
            else if (czer_utilities.NIL != el_utilities.result_genl_litP(lit)) {
                genls_lits = (SubLObject)ConsesLow.cons(lit, genls_lits);
            }
            else {
                rest = (SubLObject)ConsesLow.cons(lit, rest);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return ConsesLow.nconc(Sequences.nreverse(isa_lits), Sequences.nreverse(genls_lits), Sequences.nreverse(rest));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 46753L)
    public static SubLObject evaluatable_expressions_out(final SubLObject formula) {
        return transform_list_utilities.quiescent_transform(formula, (SubLObject)czer_utilities.$sym85$EVALUATABLE_EXPRESSION_, (SubLObject)czer_utilities.$sym86$TRANSFORM_EVALUATION_EXPRESSION, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 46912L)
    public static SubLObject unwrap_if_ist(final SubLObject sentence, final SubLObject mt, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == czer_utilities.UNPROVIDED) {
            allow_spec_predsP = (SubLObject)czer_utilities.NIL;
        }
        return unwrap_if_ist_int(sentence, mt, (SubLObject)czer_utilities.T, (SubLObject)czer_utilities.T, allow_spec_predsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 47400L)
    public static SubLObject unwrap_if_ist_permissive(final SubLObject sentence, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return unwrap_if_ist_int(sentence, mt, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.T, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 47588L)
    public static SubLObject unwrap_if_ist_discard_mt(final SubLObject sentence, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return Values.values(unwrap_if_ist_int(sentence, mt, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 47796L)
    public static SubLObject unwrap_if_ist_canonical(final SubLObject sentence, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return unwrap_if_ist_canonical_int(sentence, mt, (SubLObject)czer_utilities.T, (SubLObject)czer_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 48015L)
    public static SubLObject unwrap_if_ist_permissive_canonical(final SubLObject sentence, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        return unwrap_if_ist_canonical_int(sentence, mt, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 48257L)
    public static SubLObject unwrap_if_ist_canonical_int(SubLObject sentence, SubLObject mt, final SubLObject errorP, final SubLObject require_closed_mtP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_mt = mt;
        thread.resetMultipleValues();
        final SubLObject sentence_$15 = unwrap_if_ist_int(sentence, mt, errorP, require_closed_mtP, (SubLObject)czer_utilities.UNPROVIDED);
        final SubLObject mt_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$15;
        mt = mt_$16;
        if (czer_utilities.NIL == hlmt.hlmt_equal(original_mt, mt)) {
            mt = czer_main.canonicalize_mt(mt);
        }
        return subl_promotions.values2(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 48594L)
    public static SubLObject unwrap_if_ist_int(SubLObject sentence, SubLObject mt, final SubLObject errorP, final SubLObject require_closed_mtP, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == czer_utilities.UNPROVIDED) {
            allow_spec_predsP = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_$17 = unwrap_if_ist_recursive(sentence, mt, require_closed_mtP, allow_spec_predsP);
        final SubLObject mt_$18 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$17;
        mt = mt_$18;
        if (czer_utilities.NIL != errorP && czer_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && czer_utilities.NIL == mt) {
            Errors.error((SubLObject)czer_utilities.$str87$_s__s_does_not_adequately_specify, sentence, mt);
        }
        return subl_promotions.values2(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 48936L)
    public static SubLObject unwrap_if_ist_recursive(final SubLObject sentence, final SubLObject mt, final SubLObject require_closed_mtP, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == czer_utilities.UNPROVIDED) {
            allow_spec_predsP = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != el_utilities.ist_sentence_p(sentence, allow_spec_predsP) && (czer_utilities.NIL == require_closed_mtP || czer_utilities.NIL != hlmt.closed_possibly_hlmt_p(cycl_utilities.sentence_arg1(sentence, (SubLObject)czer_utilities.UNPROVIDED))) && czer_utilities.NIL == kb_utilities.kbeq(czer_utilities.$const88$ist_Asserted, cycl_utilities.atomic_sentence_predicate(sentence))) {
            return unwrap_if_ist_recursive(cycl_utilities.sentence_arg2(sentence, (SubLObject)czer_utilities.UNPROVIDED), cycl_utilities.sentence_arg1(sentence, (SubLObject)czer_utilities.UNPROVIDED), require_closed_mtP, (SubLObject)czer_utilities.UNPROVIDED);
        }
        return subl_promotions.values2(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 49767L)
    public static SubLObject possibly_quoted_cycl_formula_p(final SubLObject v_object) {
        return cycl_grammar.cycl_formula_p(unwrap_quotes(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 49939L)
    public static SubLObject unwrap_quotes(final SubLObject expression) {
        if (czer_utilities.NIL != cycl_grammar.fast_cycl_quoted_term_p(expression)) {
            return unwrap_quotes(cycl_utilities.formula_arg1(expression, (SubLObject)czer_utilities.UNPROVIDED));
        }
        return expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 50335L)
    public static SubLObject quoted_term_with_hl_varP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != cycl_grammar.fast_quote_term_p(v_object) && czer_utilities.NIL != cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)czer_utilities.$sym89$HL_VAR_), v_object, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 50475L)
    public static SubLObject escape_term(final SubLObject v_term) {
        return (czer_utilities.NIL != cycl_grammar.fast_escape_quote_term_p(v_term)) ? v_term : el_utilities.make_unary_formula(czer_utilities.$const90$EscapeQuote, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 50690L)
    public static SubLObject possibly_escape_quote_hl_vars(final SubLObject v_object, SubLObject destructiveP) {
        if (destructiveP == czer_utilities.UNPROVIDED) {
            destructiveP = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL == cycl_utilities.expression_find_if((SubLObject)czer_utilities.$sym91$QUOTED_TERM_WITH_HL_VAR_, v_object, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
            return v_object;
        }
        if (czer_utilities.NIL != destructiveP) {
            return nescape_quote_hl_vars(v_object);
        }
        return escape_quote_hl_vars(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 50963L)
    public static SubLObject escape_quote_hl_vars(final SubLObject v_object) {
        return nescape_quote_hl_vars(conses_high.copy_tree(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 51064L)
    public static SubLObject nescape_quote_hl_vars(final SubLObject v_object) {
        if (czer_utilities.NIL != cycl_grammar.fast_quote_term_p(v_object)) {
            return list_utilities.tree_ntransform_if(v_object, (SubLObject)czer_utilities.$sym89$HL_VAR_, (SubLObject)czer_utilities.$sym92$ESCAPE_TERM, (SubLObject)czer_utilities.UNPROVIDED);
        }
        if (v_object.isCons()) {
            return ConsesLow.rplacd(ConsesLow.rplaca(v_object, nescape_quote_hl_vars(v_object.first())), (czer_utilities.NIL != list_utilities.non_dotted_list_p(v_object)) ? list_utilities.nmapcar((SubLObject)czer_utilities.$sym93$NESCAPE_QUOTE_HL_VARS, v_object.rest()) : nescape_quote_hl_vars(v_object.rest()));
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 51465L)
    public static SubLObject decontextualized_clausesP(final SubLObject v_clauses) {
        return list_utilities.every_in_list((SubLObject)czer_utilities.$sym94$DECONTEXTUALIZED_CLAUSE_, v_clauses, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 51679L)
    public static SubLObject decontextualized_clauseP(final SubLObject clause) {
        SubLObject contextualizedP;
        SubLObject rest;
        SubLObject asent;
        for (contextualizedP = (SubLObject)czer_utilities.NIL, rest = (SubLObject)czer_utilities.NIL, rest = clauses.neg_lits(clause); czer_utilities.NIL == contextualizedP && czer_utilities.NIL != rest; rest = rest.rest()) {
            asent = rest.first();
            if (czer_utilities.NIL == kb_accessors.decontextualized_literalP(asent)) {
                contextualizedP = (SubLObject)czer_utilities.T;
            }
        }
        for (rest = (SubLObject)czer_utilities.NIL, rest = clauses.pos_lits(clause); czer_utilities.NIL == contextualizedP && czer_utilities.NIL != rest; rest = rest.rest()) {
            asent = rest.first();
            if (czer_utilities.NIL == kb_accessors.decontextualized_literalP(asent)) {
                contextualizedP = (SubLObject)czer_utilities.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == contextualizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 51941L)
    public static SubLObject generalized_ist_clauses_p(final SubLObject v_clauses) {
        if (czer_utilities.NIL == cycl_grammar.cycl_truth_value_p(v_clauses)) {
            return list_utilities.every_in_list((SubLObject)czer_utilities.$sym95$GENERALIZED_IST_CLAUSE_P, v_clauses, (SubLObject)czer_utilities.UNPROVIDED);
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 52098L)
    public static SubLObject generalized_ist_clause_p(final SubLObject clause) {
        SubLObject non_istP;
        SubLObject rest;
        SubLObject asent;
        for (non_istP = (SubLObject)czer_utilities.NIL, rest = (SubLObject)czer_utilities.NIL, rest = clauses.neg_lits(clause); czer_utilities.NIL == non_istP && czer_utilities.NIL != rest; rest = rest.rest()) {
            asent = rest.first();
            if (czer_utilities.NIL == generalized_ist_literal_p(asent)) {
                non_istP = (SubLObject)czer_utilities.T;
            }
        }
        for (rest = (SubLObject)czer_utilities.NIL, rest = clauses.pos_lits(clause); czer_utilities.NIL == non_istP && czer_utilities.NIL != rest; rest = rest.rest()) {
            asent = rest.first();
            if (czer_utilities.NIL == generalized_ist_literal_p(asent)) {
                non_istP = (SubLObject)czer_utilities.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == non_istP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 52332L)
    public static SubLObject generalized_ist_literal_p(final SubLObject v_object) {
        return cycl_utilities.atomic_sentence_with_any_of_preds_p(v_object, (SubLObject)czer_utilities.$list96);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 52621L)
    public static SubLObject opaque_arg_wrt_quoting_seeker(final SubLObject formula, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.NIL != cycl_utilities.opaque_arg_wrt_quotingP(formula, argnum)) {
            final SubLObject arg = cycl_utilities.formula_arg(formula, argnum, (SubLObject)czer_utilities.UNPROVIDED);
            final SubLObject target = czer_utilities.$opaque_arg_wrt_quoting_target$.getDynamicValue(thread);
            if (czer_utilities.NIL != list_utilities.tree_find(target, arg, Symbols.symbol_function((SubLObject)czer_utilities.EQUAL), (SubLObject)czer_utilities.UNPROVIDED)) {
                note_opaque_reference_to_term(target, formula);
            }
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 52946L)
    public static SubLObject note_opaque_reference_to_term(final SubLObject v_term, final SubLObject formula) {
        return Dynamic.sublisp_throw((SubLObject)czer_utilities.$kw98$OPAQUE_ARG_FOUND, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 53067L)
    public static SubLObject formula_references_term_opaquelyP(final SubLObject formula, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == czer_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert czer_utilities.NIL != cycl_grammar.cycl_formula_p(formula) : formula;
        SubLObject result = (SubLObject)czer_utilities.NIL;
        try {
            thread.throwStack.push(czer_utilities.$kw98$OPAQUE_ARG_FOUND);
            final SubLObject _prev_bind_0 = czer_utilities.$opaque_arg_wrt_quoting_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                czer_utilities.$opaque_arg_wrt_quoting_target$.bind(v_term, thread);
                cycl_utilities.$opaque_arg_function$.bind((SubLObject)czer_utilities.$sym97$OPAQUE_ARG_WRT_QUOTING_SEEKER, thread);
                cycl_utilities.expression_find(v_term, formula, penetrate_hl_structuresP, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            }
            finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_2, thread);
                czer_utilities.$opaque_arg_wrt_quoting_target$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            result = Errors.handleThrowable(ccatch_env_var, (SubLObject)czer_utilities.$kw98$OPAQUE_ARG_FOUND);
        }
        finally {
            thread.throwStack.pop();
        }
        return list_utilities.sublisp_boolean(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 53533L)
    public static SubLObject assertion_references_term_opaquelyP(final SubLObject assertion, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == czer_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert czer_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject result = (SubLObject)czer_utilities.NIL;
        try {
            thread.throwStack.push(czer_utilities.$kw98$OPAQUE_ARG_FOUND);
            final SubLObject _prev_bind_0 = czer_utilities.$opaque_arg_wrt_quoting_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                czer_utilities.$opaque_arg_wrt_quoting_target$.bind(v_term, thread);
                cycl_utilities.$opaque_arg_function$.bind((SubLObject)czer_utilities.$sym97$OPAQUE_ARG_WRT_QUOTING_SEEKER, thread);
                cycl_utilities.assertion_find(v_term, assertion, penetrate_hl_structuresP, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            }
            finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_2, thread);
                czer_utilities.$opaque_arg_wrt_quoting_target$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            result = Errors.handleThrowable(ccatch_env_var, (SubLObject)czer_utilities.$kw98$OPAQUE_ARG_FOUND);
        }
        finally {
            thread.throwStack.pop();
        }
        return list_utilities.sublisp_boolean(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 53984L)
    public static SubLObject kb_hl_support_references_term_opaquelyP(final SubLObject kb_hl_support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == czer_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)czer_utilities.NIL;
        }
        assert czer_utilities.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : kb_hl_support;
        final SubLObject sentence = kb_hl_supports_high.kb_hl_support_ist_sentence(kb_hl_support);
        return formula_references_term_opaquelyP(sentence, v_term, penetrate_hl_structuresP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 54349L)
    public static SubLObject hl_support_references_term_opaquelyP(final SubLObject hl_support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == czer_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)czer_utilities.NIL;
        }
        assert czer_utilities.NIL != arguments.hl_support_p(hl_support) : hl_support;
        final SubLObject sentence = arguments.support_ist_sentence(hl_support);
        return formula_references_term_opaquelyP(sentence, v_term, penetrate_hl_structuresP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 54690L)
    public static SubLObject support_references_term_opaquelyP(final SubLObject support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == czer_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != assertion_handles.assertion_p(support)) {
            return assertion_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
        }
        if (czer_utilities.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_support_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
        }
        return hl_support_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 55172L)
    public static SubLObject deduction_references_term_opaquelyP(final SubLObject deduction, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == czer_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)czer_utilities.NIL;
        }
        assert czer_utilities.NIL != deduction_handles.deduction_p(deduction) : deduction;
        final SubLObject support = deductions_high.deduction_supported_object(deduction);
        if (czer_utilities.NIL != support_references_term_opaquelyP(support, penetrate_hl_structuresP, (SubLObject)czer_utilities.UNPROVIDED)) {
            return (SubLObject)czer_utilities.T;
        }
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support2 = (SubLObject)czer_utilities.NIL;
        support2 = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            if (czer_utilities.NIL != support_references_term_opaquelyP(support2, v_term, (SubLObject)czer_utilities.UNPROVIDED)) {
                return (SubLObject)czer_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support2 = cdolist_list_var.first();
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 55655L)
    public static SubLObject term_opaque_assertions(final SubLObject v_term, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert czer_utilities.NIL != kb_indexing_datastructures.indexed_term_p(v_term) : v_term;
        final SubLObject test = hash_table_utilities.to_hash_test(Symbols.symbol_function((SubLObject)czer_utilities.$sym105$KBEQ));
        SubLObject assertions = set_contents.new_set_contents((SubLObject)czer_utilities.ZERO_INTEGER, test);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (czer_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)czer_utilities.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)czer_utilities.NIL);
                SubLObject done_var = (SubLObject)czer_utilities.NIL;
                final SubLObject token_var = (SubLObject)czer_utilities.NIL;
                while (czer_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (czer_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)czer_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.NIL);
                            SubLObject done_var_$19 = (SubLObject)czer_utilities.NIL;
                            final SubLObject token_var_$20 = (SubLObject)czer_utilities.NIL;
                            while (czer_utilities.NIL == done_var_$19) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(assertion));
                                if (czer_utilities.NIL != valid_$21 && czer_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec) && czer_utilities.NIL != assertion_references_term_opaquelyP(assertion, v_term, (SubLObject)czer_utilities.NIL)) {
                                    assertions = set_contents.set_contents_add(assertion, assertions, test);
                                }
                                done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid_$21);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)czer_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (czer_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set_contents.set_contents_element_list(assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 56166L)
    public static SubLObject all_term_opaque_assertions(final SubLObject v_term) {
        return term_opaque_assertions(v_term, czer_utilities.$const106$EverythingPSC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 56337L)
    public static SubLObject term_opaque_deductions(final SubLObject v_term, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert czer_utilities.NIL != kb_indexing_datastructures.indexed_term_p(v_term) : v_term;
        final SubLObject test = hash_table_utilities.to_hash_test(Symbols.symbol_function((SubLObject)czer_utilities.$sym105$KBEQ));
        SubLObject deductions = set_contents.new_set_contents((SubLObject)czer_utilities.ZERO_INTEGER, test);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (czer_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)czer_utilities.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)czer_utilities.NIL);
                SubLObject done_var = (SubLObject)czer_utilities.NIL;
                final SubLObject token_var = (SubLObject)czer_utilities.NIL;
                while (czer_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (czer_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)czer_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.NIL, (SubLObject)czer_utilities.NIL);
                            SubLObject done_var_$23 = (SubLObject)czer_utilities.NIL;
                            final SubLObject token_var_$24 = (SubLObject)czer_utilities.NIL;
                            while (czer_utilities.NIL == done_var_$23) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                final SubLObject valid_$25 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$24.eql(assertion));
                                if (czer_utilities.NIL != valid_$25 && czer_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                    SubLObject deduction = (SubLObject)czer_utilities.NIL;
                                    deduction = cdolist_list_var.first();
                                    while (czer_utilities.NIL != cdolist_list_var) {
                                        if (czer_utilities.NIL != deduction_handles.deduction_p(deduction) && czer_utilities.NIL != deduction_references_term_opaquelyP(deduction, v_term, (SubLObject)czer_utilities.NIL)) {
                                            deductions = set_contents.set_contents_add(deduction, deductions, test);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        deduction = cdolist_list_var.first();
                                    }
                                }
                                done_var_$23 = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid_$25);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)czer_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (czer_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set_contents.set_contents_element_list(deductions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 56940L)
    public static SubLObject all_term_opaque_deductions(final SubLObject v_term) {
        return term_opaque_deductions(v_term, czer_utilities.$const106$EverythingPSC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 57111L)
    public static SubLObject canonicalize_el_query(final SubLObject sentence, SubLObject mt, SubLObject canonicalize_variablesP) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = (SubLObject)czer_utilities.NIL;
        }
        if (canonicalize_variablesP == czer_utilities.UNPROVIDED) {
            canonicalize_variablesP = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (czer_utilities.NIL != cycl_grammar.cycl_truth_value_p(sentence)) {
            return sentence;
        }
        thread.resetMultipleValues();
        SubLObject dnf_clauses_items = czer_main.canonicalize_ask_sentence(sentence, mt);
        final SubLObject canonical_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject dnf_clauses = (SubLObject)czer_utilities.NIL;
        SubLObject all_quantified_vars = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == dnf_clauses_items) {
            return czer_utilities.$const107$False;
        }
        SubLObject cdolist_list_var;
        dnf_clauses_items = (cdolist_list_var = Sort.sort(dnf_clauses_items, (SubLObject)czer_utilities.$sym108$LIT__, (SubLObject)czer_utilities.$sym109$CLAUSE_BINDING_LIST_PAIRS_LITERAL));
        SubLObject dnf_clauses_item = (SubLObject)czer_utilities.NIL;
        dnf_clauses_item = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = dnf_clauses_item;
            SubLObject dnf_clause = (SubLObject)czer_utilities.NIL;
            SubLObject el_to_hl_bindings = (SubLObject)czer_utilities.NIL;
            SubLObject free_el_vars = (SubLObject)czer_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)czer_utilities.$list110);
            dnf_clause = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)czer_utilities.$list110);
            el_to_hl_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)czer_utilities.$list110);
            free_el_vars = current.first();
            current = current.rest();
            if (czer_utilities.NIL == current) {
                final SubLObject hl_vars = bindings.bindings_variables(el_to_hl_bindings);
                final SubLObject quantified_hl_vars = conses_high.set_difference(hl_vars, free_el_vars, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
                SubLObject quantified_vars = bindings.apply_bindings(el_to_hl_bindings, quantified_hl_vars);
                dnf_clause = bindings.apply_bindings_backwards(el_to_hl_bindings, dnf_clause);
                quantified_vars = bindings.apply_bindings_backwards(el_to_hl_bindings, quantified_vars);
                dnf_clauses = (SubLObject)ConsesLow.cons(dnf_clause, dnf_clauses);
                all_quantified_vars = conses_high.union(all_quantified_vars, quantified_vars, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)czer_utilities.$list110);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dnf_clauses_item = cdolist_list_var.first();
        }
        dnf_clauses = Sequences.nreverse(dnf_clauses);
        if (czer_utilities.NIL != canonicalize_variablesP) {
            final SubLObject el_vars = Sequences.nreverse(cycl_utilities.expression_gather(dnf_clauses, (SubLObject)czer_utilities.$sym78$EL_VAR_, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED));
            SubLObject var_bindings = (SubLObject)czer_utilities.NIL;
            SubLObject list_var = (SubLObject)czer_utilities.NIL;
            SubLObject el_var = (SubLObject)czer_utilities.NIL;
            SubLObject n = (SubLObject)czer_utilities.NIL;
            list_var = el_vars;
            el_var = list_var.first();
            for (n = (SubLObject)czer_utilities.ZERO_INTEGER; czer_utilities.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), n = Numbers.add((SubLObject)czer_utilities.ONE_INTEGER, n)) {
                final SubLObject default_el_var = variables.get_default_el_var(n);
                var_bindings = bindings.add_variable_binding(el_var, default_el_var, var_bindings);
            }
            dnf_clauses = bindings.apply_bindings(var_bindings, dnf_clauses);
            all_quantified_vars = bindings.apply_bindings(var_bindings, all_quantified_vars);
        }
        all_quantified_vars = Sequences.nreverse(Sort.sort(all_quantified_vars, (SubLObject)czer_utilities.$sym111$TERM__, (SubLObject)czer_utilities.UNPROVIDED));
        SubLObject result = el_utilities.existentially_bind_vars(clauses.dnf_formula_from_clauses(dnf_clauses), all_quantified_vars);
        if (czer_utilities.NIL == kb_utilities.kbeq(mt, canonical_mt)) {
            result = el_utilities.make_ist_sentence(canonical_mt, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 59461L)
    public static SubLObject canonicalize_el_sentence(final SubLObject sentence, final SubLObject mt, SubLObject canonicalize_variablesP) {
        if (canonicalize_variablesP == czer_utilities.UNPROVIDED) {
            canonicalize_variablesP = (SubLObject)czer_utilities.NIL;
        }
        assert czer_utilities.NIL != cycl_grammar.cycl_formula_p(sentence) : sentence;
        final SubLObject hl = czer_main.el_to_hl(sentence, mt);
        SubLObject cnfs = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL != canonicalize_variablesP) {
            cnfs = cycl_utilities.hl_to_el(extract_hl_clauses(hl));
        }
        else {
            cnfs = extract_el_clauses(hl);
        }
        return uncanonicalizer.cnfs_el_formula(cnfs, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 60013L)
    public static SubLObject canon_equalP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == czer_utilities.UNPROVIDED) {
            canon_form1 = (SubLObject)czer_utilities.NIL;
        }
        if (canon_form2 == czer_utilities.UNPROVIDED) {
            canon_form2 = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = (SubLObject)czer_utilities.NIL;
        SubLObject canon_mt2 = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == canon_form1 || czer_utilities.NIL == canon_form2) {
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
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != canon_forms_equalP(canon_form1, canon_form2, (SubLObject)czer_utilities.UNPROVIDED) && czer_utilities.NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 61124L)
    public static SubLObject canon_query_equalP(final SubLObject query1, final SubLObject query2, SubLObject mt, SubLObject canon_query1, SubLObject canon_query2) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_query1 == czer_utilities.UNPROVIDED) {
            canon_query1 = (SubLObject)czer_utilities.NIL;
        }
        if (canon_query2 == czer_utilities.UNPROVIDED) {
            canon_query2 = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = (SubLObject)czer_utilities.NIL;
        SubLObject canon_mt2 = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == canon_query1 || czer_utilities.NIL == canon_query2) {
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
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != canon_forms_equalP(canon_query1, canon_query2, (SubLObject)czer_utilities.UNPROVIDED) && czer_utilities.NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 61705L)
    public static SubLObject canon_assert_equalP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == czer_utilities.UNPROVIDED) {
            canon_form1 = (SubLObject)czer_utilities.NIL;
        }
        if (canon_form2 == czer_utilities.UNPROVIDED) {
            canon_form2 = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = (SubLObject)czer_utilities.NIL;
        SubLObject canon_mt2 = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == canon_form1 || czer_utilities.NIL == canon_form2) {
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
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != canon_forms_equalP(canon_form1, canon_form2, (SubLObject)czer_utilities.UNPROVIDED) && czer_utilities.NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 62299L)
    public static SubLObject canon_assert_isomorphicP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == czer_utilities.UNPROVIDED) {
            canon_form1 = (SubLObject)czer_utilities.NIL;
        }
        if (canon_form2 == czer_utilities.UNPROVIDED) {
            canon_form2 = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = (SubLObject)czer_utilities.NIL;
        SubLObject canon_mt2 = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL == canon_form1 || czer_utilities.NIL == canon_form2) {
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
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL != canon_forms_isomorphicP(canon_form1, canon_form2, (SubLObject)czer_utilities.UNPROVIDED) && czer_utilities.NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 63169L)
    public static SubLObject canon_forms_equalP(final SubLObject canon_form1, final SubLObject canon_form2, SubLObject test) {
        if (test == czer_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)czer_utilities.EQUAL);
        }
        if (canon_form1.isAtom() || canon_form2.isAtom()) {
            return kb_utilities.kbeq(canon_form1, canon_form2);
        }
        return list_utilities.sets_equalP(Mapping.mapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym52$FIRST), canon_form1), Mapping.mapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym52$FIRST), canon_form2), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 63791L)
    public static SubLObject canon_forms_isomorphicP(final SubLObject canon_form1, final SubLObject canon_form2, SubLObject test) {
        if (test == czer_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)czer_utilities.EQUAL);
        }
        if (canon_form1.isAtom() || canon_form2.isAtom()) {
            return kb_utilities.kbeq(canon_form1, canon_form2);
        }
        final SubLObject canon_form1_skolem_terms = cycl_utilities.formula_gather(canon_form1, (SubLObject)czer_utilities.$sym112$SKOLEM_NART_, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
        final SubLObject canon_form2_skolem_terms = cycl_utilities.formula_gather(canon_form2, (SubLObject)czer_utilities.$sym112$SKOLEM_NART_, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
        final SubLObject skolem_term_def_map = Hashtables.make_hash_table((SubLObject)czer_utilities.TEN_INTEGER, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
        if (!Sequences.length(canon_form1_skolem_terms).numE(Sequences.length(canon_form2_skolem_terms))) {
            return (SubLObject)czer_utilities.NIL;
        }
        SubLObject cdolist_list_var = canon_form1_skolem_terms;
        SubLObject canon_form1_skolem_term = (SubLObject)czer_utilities.NIL;
        canon_form1_skolem_term = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            SubLObject term_formulas = (SubLObject)czer_utilities.NIL;
            SubLObject cdolist_list_var_$43 = kb_accessors.ata(canon_form1_skolem_term, (SubLObject)czer_utilities.UNPROVIDED);
            SubLObject term_assertion = (SubLObject)czer_utilities.NIL;
            term_assertion = cdolist_list_var_$43.first();
            while (czer_utilities.NIL != cdolist_list_var_$43) {
                if (czer_utilities.NIL == properties.term_quoted_in_gafP(term_assertion, canon_form1_skolem_term, (SubLObject)czer_utilities.NIL)) {
                    term_formulas = (SubLObject)ConsesLow.cons(list_utilities.tree_substitute(assertions_high.assertion_formula(term_assertion), canon_form1_skolem_term, (SubLObject)czer_utilities.NIL), term_formulas);
                }
                cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                term_assertion = cdolist_list_var_$43.first();
            }
            Hashtables.sethash(canon_form1_skolem_term, skolem_term_def_map, term_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            canon_form1_skolem_term = cdolist_list_var.first();
        }
        cdolist_list_var = canon_form2_skolem_terms;
        SubLObject canon_form2_skolem_term = (SubLObject)czer_utilities.NIL;
        canon_form2_skolem_term = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            SubLObject term_formulas = (SubLObject)czer_utilities.NIL;
            SubLObject cdolist_list_var_$44 = kb_accessors.ata(canon_form2_skolem_term, (SubLObject)czer_utilities.UNPROVIDED);
            SubLObject term_assertion = (SubLObject)czer_utilities.NIL;
            term_assertion = cdolist_list_var_$44.first();
            while (czer_utilities.NIL != cdolist_list_var_$44) {
                if (czer_utilities.NIL == properties.term_quoted_in_gafP(term_assertion, canon_form2_skolem_term, (SubLObject)czer_utilities.NIL)) {
                    term_formulas = (SubLObject)ConsesLow.cons(list_utilities.tree_substitute(assertions_high.assertion_formula(term_assertion), canon_form2_skolem_term, (SubLObject)czer_utilities.NIL), term_formulas);
                }
                cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                term_assertion = cdolist_list_var_$44.first();
            }
            Hashtables.sethash(canon_form2_skolem_term, skolem_term_def_map, term_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            canon_form2_skolem_term = cdolist_list_var.first();
        }
        cdolist_list_var = list_utilities.permute_list(canon_form1_skolem_terms, (SubLObject)czer_utilities.UNPROVIDED);
        SubLObject canon_form1_skolem_terms_permuted = (SubLObject)czer_utilities.NIL;
        canon_form1_skolem_terms_permuted = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            SubLObject canon_form2_transformed = canon_form2;
            SubLObject canon_form2_skolem_terms_used = (SubLObject)czer_utilities.NIL;
            SubLObject canon_form2_skolem_term2 = (SubLObject)czer_utilities.NIL;
            SubLObject canon_form2_skolem_term_$45 = (SubLObject)czer_utilities.NIL;
            SubLObject canon_form1_skolem_term2 = (SubLObject)czer_utilities.NIL;
            SubLObject canon_form1_skolem_term_$46 = (SubLObject)czer_utilities.NIL;
            canon_form2_skolem_term2 = canon_form2_skolem_terms;
            canon_form2_skolem_term_$45 = canon_form2_skolem_term2.first();
            canon_form1_skolem_term2 = canon_form1_skolem_terms_permuted;
            canon_form1_skolem_term_$46 = canon_form1_skolem_term2.first();
            while (czer_utilities.NIL != canon_form1_skolem_term2 || czer_utilities.NIL != canon_form2_skolem_term2) {
                if (czer_utilities.NIL == list_utilities.member_kbeqP(canon_form2_skolem_term_$45, canon_form2_skolem_terms_used) && czer_utilities.NIL != list_utilities.sets_equalP(Hashtables.gethash(canon_form1_skolem_term_$46, skolem_term_def_map, (SubLObject)czer_utilities.UNPROVIDED), Hashtables.gethash(canon_form2_skolem_term_$45, skolem_term_def_map, (SubLObject)czer_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)czer_utilities.EQUAL))) {
                    canon_form2_skolem_terms_used = (SubLObject)ConsesLow.cons(canon_form2_skolem_term_$45, canon_form2_skolem_terms_used);
                    canon_form2_transformed = list_utilities.tree_substitute(canon_form2_transformed, canon_form2_skolem_term_$45, canon_form1_skolem_term_$46);
                }
                canon_form2_skolem_term2 = canon_form2_skolem_term2.rest();
                canon_form2_skolem_term_$45 = canon_form2_skolem_term2.first();
                canon_form1_skolem_term2 = canon_form1_skolem_term2.rest();
                canon_form1_skolem_term_$46 = canon_form1_skolem_term2.first();
            }
            if (czer_utilities.NIL != list_utilities.sets_equalP(Mapping.mapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym52$FIRST), canon_form1), Mapping.mapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym52$FIRST), canon_form2_transformed), test)) {
                return (SubLObject)czer_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_form1_skolem_terms_permuted = cdolist_list_var.first();
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 66374L)
    public static SubLObject canon_equal_hl_namesP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject test, SubLObject bindings1, SubLObject bindings2) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (test == czer_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)czer_utilities.EQUAL);
        }
        if (bindings1 == czer_utilities.UNPROVIDED) {
            bindings1 = (SubLObject)czer_utilities.NIL;
        }
        if (bindings2 == czer_utilities.UNPROVIDED) {
            bindings2 = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)czer_utilities.NIL;
        SubLObject canon1 = (SubLObject)czer_utilities.NIL;
        SubLObject bind1 = (SubLObject)czer_utilities.NIL;
        SubLObject canon2 = (SubLObject)czer_utilities.NIL;
        SubLObject bind2 = (SubLObject)czer_utilities.NIL;
        if (czer_utilities.NIL != bindings1) {
            canon1 = form1;
            bind1 = bindings1;
        }
        else {
            thread.resetMultipleValues();
            final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(form1, mt);
            final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
            final SubLObject uniquified_bindings = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            canon1 = temp_cnf;
            bind1 = uniquified_bindings;
        }
        if (czer_utilities.NIL != bindings2) {
            canon2 = form2;
            bind2 = bindings2;
        }
        else {
            thread.resetMultipleValues();
            final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(form2, mt);
            final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
            final SubLObject uniquified_bindings = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            canon2 = temp_cnf;
            bind2 = uniquified_bindings;
        }
        SubLObject cdolist_list_var = bind1;
        SubLObject binding = (SubLObject)czer_utilities.NIL;
        binding = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            canon1 = conses_high.subst(binding.first(), binding.rest(), canon1, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        cdolist_list_var = bind2;
        binding = (SubLObject)czer_utilities.NIL;
        binding = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            canon2 = conses_high.subst(binding.first(), binding.rest(), canon2, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        result = canon_forms_equalP(canon1, canon2, test);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 68424L)
    public static SubLObject constant_occurs_in_formulaP(final SubLObject constant, final SubLObject formula) {
        if (czer_utilities.NIL != find_anywhere(constant, formula, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
            return (SubLObject)czer_utilities.T;
        }
        return (SubLObject)czer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 68593L)
    public static SubLObject canonicalize_and_return_skolem_vars(final SubLObject formula, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf = (SubLObject)czer_utilities.NIL;
        SubLObject var_bindings = (SubLObject)czer_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(formula, mt);
        final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
        final SubLObject uniquified_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        cnf = temp_cnf;
        var_bindings = uniquified_bindings;
        SubLObject cdolist_list_var;
        final SubLObject universals = cdolist_list_var = Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)czer_utilities.$sym52$FIRST), list_utilities.mapappend(Symbols.symbol_function((SubLObject)czer_utilities.$sym53$SECOND), cnf)), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
        SubLObject var = (SubLObject)czer_utilities.NIL;
        var = cdolist_list_var.first();
        while (czer_utilities.NIL != cdolist_list_var) {
            if (czer_utilities.NIL != conses_high.rassoc(var, var_bindings, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
                var_bindings = Sequences.delete(var, var_bindings, Symbols.symbol_function((SubLObject)czer_utilities.EQL), Symbols.symbol_function((SubLObject)czer_utilities.$sym113$CDR), (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return subl_promotions.values2(cnf, var_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 69710L)
    public static SubLObject find_anywhere(final SubLObject v_object, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == czer_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)czer_utilities.EQL);
        }
        if (key == czer_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)czer_utilities.IDENTITY);
        }
        if (czer_utilities.NIL != Functions.funcall(test, v_object, Functions.funcall(key, tree))) {
            if (czer_utilities.NIL != tree) {
                return tree;
            }
            return (SubLObject)czer_utilities.T;
        }
        else {
            if (!tree.isCons()) {
                return (SubLObject)czer_utilities.NIL;
            }
            final SubLObject first_result = find_anywhere(v_object, tree.first(), test, key);
            final SubLObject rest_result = (SubLObject)((czer_utilities.NIL != first_result || czer_utilities.NIL == tree.rest()) ? czer_utilities.NIL : find_anywhere(v_object, tree.rest(), test, key));
            if (czer_utilities.NIL != first_result) {
                return first_result;
            }
            if (czer_utilities.NIL != rest_result) {
                return rest_result;
            }
            return (SubLObject)czer_utilities.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 70912L)
    public static SubLObject find_all_anywhere(final SubLObject v_object, final SubLObject tree, SubLObject test, SubLObject key, SubLObject basket) {
        if (test == czer_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)czer_utilities.EQL);
        }
        if (key == czer_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)czer_utilities.IDENTITY);
        }
        if (basket == czer_utilities.UNPROVIDED) {
            basket = (SubLObject)czer_utilities.NIL;
        }
        if (czer_utilities.NIL != Functions.funcall(test, v_object, Functions.funcall(key, tree))) {
            if (czer_utilities.NIL != tree) {
                return (SubLObject)ConsesLow.cons(tree, basket);
            }
            return (SubLObject)ConsesLow.cons((SubLObject)czer_utilities.T, basket);
        }
        else {
            if (tree.isCons()) {
                return (czer_utilities.NIL == tree.rest()) ? find_all_anywhere(v_object, tree.first(), test, key, basket) : find_all_anywhere(v_object, tree.rest(), test, key, find_all_anywhere(v_object, tree.first(), test, key, basket));
            }
            return basket;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 72195L)
    public static SubLObject return_uncanon(final SubLObject form, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)czer_utilities.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)czer_utilities.NIL, thread);
            if (czer_utilities.NIL == fi.safe_fi((SubLObject)czer_utilities.$kw114$ASSERT, form, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
                PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str115$__Error__assert_failed__S___, form);
            }
            else {
                final SubLObject assertion = czer_meta.find_some_assertion_cycl(form, mt);
                if (czer_utilities.NIL == assertion) {
                    PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str116$__Error__Can_t_find_assertion___);
                }
                else {
                    final SubLObject el_form = uncanonicalizer.assertion_el_formula(assertion);
                    fi.safe_fi((SubLObject)czer_utilities.$kw117$UNASSERT, form, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
                    result = el_form;
                }
            }
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 72903L)
    public static SubLObject uncanon_original_test(final SubLObject form, final SubLObject mt) {
        return uncanon_test(form, mt, (SubLObject)czer_utilities.T, (SubLObject)czer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 72991L)
    public static SubLObject uncanon_test(final SubLObject form, final SubLObject mt, SubLObject require_original_equalP, SubLObject verboseP) {
        if (require_original_equalP == czer_utilities.UNPROVIDED) {
            require_original_equalP = (SubLObject)czer_utilities.NIL;
        }
        if (verboseP == czer_utilities.UNPROVIDED) {
            verboseP = (SubLObject)czer_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)czer_utilities.T;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)czer_utilities.NIL, thread);
            if (czer_utilities.NIL != verboseP) {
                PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str118$__Form___A_in__A__, form, mt);
            }
            if (czer_utilities.NIL == fi.safe_fi((SubLObject)czer_utilities.$kw114$ASSERT, form, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
                PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str119$__Error__assert_failed__);
            }
            else {
                final SubLObject assertions = czer_meta.find_assertions_cycl(form, mt);
                if (czer_utilities.NIL == assertions) {
                    PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str120$__Error__Can_t_find_assertions___, form);
                }
                else {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject assertion = (SubLObject)czer_utilities.NIL;
                    assertion = cdolist_list_var.first();
                    while (czer_utilities.NIL != cdolist_list_var) {
                        if (czer_utilities.NIL != verboseP) {
                            PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str121$__The_assertion_is__S___, assertion);
                        }
                        thread.resetMultipleValues();
                        final SubLObject el_form = uncanonicalizer.assertion_el_formula(assertion);
                        final SubLObject el_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (czer_utilities.NIL != verboseP) {
                            PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str122$__Its_EL_form_is__S_in__S___, el_form, el_mt);
                        }
                        if (!form.equal(el_form) || !mt.equal(el_mt)) {
                            if (czer_utilities.NIL != require_original_equalP) {
                                result = (SubLObject)czer_utilities.NIL;
                            }
                            else {
                                fi.safe_fi((SubLObject)czer_utilities.$kw117$UNASSERT, form, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
                                fi.safe_fi((SubLObject)czer_utilities.$kw114$ASSERT, el_form, el_mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
                                final SubLObject assertions_$47 = czer_meta.find_assertions_cycl(el_form, el_mt);
                                if (czer_utilities.NIL == assertions_$47) {
                                    PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str123$__Error__Can_t_find_assertions___, el_form, el_mt);
                                }
                                else {
                                    SubLObject doneP = (SubLObject)czer_utilities.NIL;
                                    if (czer_utilities.NIL == doneP) {
                                        SubLObject csome_list_var = assertions_$47;
                                        SubLObject assertion2 = (SubLObject)czer_utilities.NIL;
                                        assertion2 = csome_list_var.first();
                                        while (czer_utilities.NIL == doneP && czer_utilities.NIL != csome_list_var) {
                                            thread.resetMultipleValues();
                                            final SubLObject new_el_form = uncanonicalizer.assertion_el_formula(assertion2);
                                            final SubLObject new_el_mt = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (czer_utilities.NIL != verboseP) {
                                                PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str124$__Its_New_EL_form_is__S_in__S___, new_el_form, new_el_mt);
                                            }
                                            if (!el_form.equal(new_el_form) || !el_mt.equal(new_el_mt)) {
                                                PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str125$__Error__EL_mismatch___Original__, new_el_form, el_form);
                                                result = (SubLObject)czer_utilities.NIL;
                                                doneP = (SubLObject)czer_utilities.T;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            assertion2 = csome_list_var.first();
                                        }
                                    }
                                }
                                fi.safe_fi((SubLObject)czer_utilities.$kw117$UNASSERT, el_form, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                fi.safe_fi((SubLObject)czer_utilities.$kw117$UNASSERT, form, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
            }
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 74969L)
    public static SubLObject assert_return_uncanon(final SubLObject form_list, final SubLObject form2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)czer_utilities.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)czer_utilities.NIL, thread);
            SubLObject cdolist_list_var = form_list;
            SubLObject assert_form = (SubLObject)czer_utilities.NIL;
            assert_form = cdolist_list_var.first();
            while (czer_utilities.NIL != cdolist_list_var) {
                if (czer_utilities.NIL == fi.safe_fi((SubLObject)czer_utilities.$kw114$ASSERT, assert_form, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
                    PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str126$__Error__assert_failed___S__, assert_form);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assert_form = cdolist_list_var.first();
            }
            final SubLObject el_form2 = return_uncanon(form2, mt);
            SubLObject cdolist_list_var2 = form_list;
            SubLObject unassert_form = (SubLObject)czer_utilities.NIL;
            unassert_form = cdolist_list_var2.first();
            while (czer_utilities.NIL != cdolist_list_var2) {
                if (czer_utilities.NIL == fi.safe_fi((SubLObject)czer_utilities.$kw117$UNASSERT, unassert_form, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED)) {
                    PrintLow.format((SubLObject)czer_utilities.T, (SubLObject)czer_utilities.$str127$__Error__unassert_failed___S__, unassert_form);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                unassert_form = cdolist_list_var2.first();
            }
            result = el_form2;
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 75664L)
    public static SubLObject canon_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_cycl(formula, mt);
        return canon_form_mal_resultP(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 75825L)
    public static SubLObject canon_ask_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_ask(formula, mt);
        return canon_form_mal_resultP(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 75989L)
    public static SubLObject canon_query_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_query(formula, mt, (SubLObject)czer_utilities.UNPROVIDED, (SubLObject)czer_utilities.UNPROVIDED);
        return canon_form_mal_resultP(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 76157L)
    public static SubLObject canon_assert_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == czer_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.test_canonicalize_assert(formula, mt);
        return canon_form_mal_resultP(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/czer-utilities.lisp", position = 76332L)
    public static SubLObject canon_form_mal_resultP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(czer_utilities.NIL == formula || czer_utilities.NIL != kb_utilities.kbeq(czer_utilities.$const107$False, formula));
    }
    
    public static SubLObject declare_czer_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "some_canonicalizer_directive_assertionsP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "some_canonicalizer_directive_assertions_somewhereP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canonicalizer_directive_for_argP", "CANONICALIZER-DIRECTIVE-FOR-ARG?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "direct_genl_canonicalizer_directives", "DIRECT-GENL-CANONICALIZER-DIRECTIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "direct_spec_canonicalizer_directives", "DIRECT-SPEC-CANONICALIZER-DIRECTIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "get_nth_canonical_variable", "GET-NTH-CANONICAL-VARIABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canonical_variable_number", "CANONICAL-VARIABLE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "arg_permits_generic_arg_variablesP", "ARG-PERMITS-GENERIC-ARG-VARIABLES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "arg_permits_keyword_variablesP", "ARG-PERMITS-KEYWORD-VARIABLES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "relax_arg_type_constraints_for_variables_for_argP", "RELAX-ARG-TYPE-CONSTRAINTS-FOR-VARIABLES-FOR-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "dont_reorder_commutative_terms_for_args", "DONT-REORDER-COMMUTATIVE-TERMS-FOR-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "possibly_assertion_argP", "POSSIBLY-ASSERTION-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "assertion_argP", "ASSERTION-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "indexed_argP", "INDEXED-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "expression_argP", "EXPRESSION-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "assertible_expression_argP", "ASSERTIBLE-EXPRESSION-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "askable_expression_argP", "ASKABLE-EXPRESSION-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "formula_argP", "FORMULA-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "clear_formula_arg_intP", "CLEAR-FORMULA-ARG-INT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "remove_formula_arg_intP", "REMOVE-FORMULA-ARG-INT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "formula_arg_intP_internal", "FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "formula_arg_intP", "FORMULA-ARG-INT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "clear_quoted_formula_arg_intP", "CLEAR-QUOTED-FORMULA-ARG-INT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "remove_quoted_formula_arg_intP", "REMOVE-QUOTED-FORMULA-ARG-INT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "quoted_formula_arg_intP_internal", "QUOTED-FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "quoted_formula_arg_intP", "QUOTED-FORMULA-ARG-INT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "sentence_argP", "SENTENCE-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "clear_sentence_arg_intP", "CLEAR-SENTENCE-ARG-INT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "remove_sentence_arg_intP", "REMOVE-SENTENCE-ARG-INT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "sentence_arg_intP_internal", "SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "sentence_arg_intP", "SENTENCE-ARG-INT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "clear_quoted_sentence_arg_intP", "CLEAR-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "remove_quoted_sentence_arg_intP", "REMOVE-QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "quoted_sentence_arg_intP_internal", "QUOTED-SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "quoted_sentence_arg_intP", "QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "some_sentence_argP", "SOME-SENTENCE-ARG?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "clear_some_sentence_arg_intP", "CLEAR-SOME-SENTENCE-ARG-INT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "remove_some_sentence_arg_intP", "REMOVE-SOME-SENTENCE-ARG-INT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "some_sentence_arg_intP_internal", "SOME-SENTENCE-ARG-INT?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "some_sentence_arg_intP", "SOME-SENTENCE-ARG-INT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "clear_some_quoted_sentence_arg_intP", "CLEAR-SOME-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "remove_some_quoted_sentence_arg_intP", "REMOVE-SOME-QUOTED-SENTENCE-ARG-INT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "some_quoted_sentence_arg_intP_internal", "SOME-QUOTED-SENTENCE-ARG-INT?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "some_quoted_sentence_arg_intP", "SOME-QUOTED-SENTENCE-ARG-INT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "askable_formula_argP", "ASKABLE-FORMULA-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "assertable_formula_argP", "ASSERTABLE-FORMULA-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "askable_sentence_argP", "ASKABLE-SENTENCE-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "assertable_sentence_argP", "ASSERTABLE-SENTENCE-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "denotational_term_argP", "DENOTATIONAL-TERM-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "leave_some_terms_at_el_for_argP", "LEAVE-SOME-TERMS-AT-EL-FOR-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "leave_variables_at_el_for_argP", "LEAVE-VARIABLES-AT-EL-FOR-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "arg_isa_quotedP", "ARG-ISA-QUOTED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "distributing_meta_predP", "DISTRIBUTING-META-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "find_hl_gaf", "FIND-HL-GAF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "find_hl_gaf_if", "FIND-HL-GAF-IF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "safe_find_gaf_genl_mts", "SAFE-FIND-GAF-GENL-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "nput_back_clause_el_variables", "NPUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "put_back_clause_el_variables", "PUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "list_of_clause_binding_list_pairs_p", "LIST-OF-CLAUSE-BINDING-LIST-PAIRS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "clause_binding_list_pairs_literal", "CLAUSE-BINDING-LIST-PAIRS-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "nextract_el_clauses", "NEXTRACT-EL-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "extract_el_clauses", "EXTRACT-EL-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "extract_hl_clauses", "EXTRACT-HL-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "nextract_hl_clauses", "NEXTRACT-HL-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "extract_blists", "EXTRACT-BLISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "nextract_blists", "NEXTRACT-BLISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "fn_tou_lit", "FN-TOU-LIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "fn_equals_lit", "FN-EQUALS-LIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "fn_evaluate_lit", "FN-EVALUATE-LIT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "fn_some_non_evaluatable_referenceP", "FN-SOME-NON-EVALUATABLE-REFERENCE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "make_nart_var_tou_lit", "MAKE-NART-VAR-TOU-LIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "make_nart_var_for_tou_lit", "MAKE-NART-VAR-FOR-TOU-LIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "make_nart_var_equals_lit", "MAKE-NART-VAR-EQUALS-LIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "make_nart_var_evaluate_lit", "MAKE-NART-VAR-EVALUATE-LIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "clause_new_el_var_name", "CLAUSE-NEW-EL-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unique_var_name_wrt", "UNIQUE-VAR-NAME-WRT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unique_el_var_wrt_expression", "UNIQUE-EL-VAR-WRT-EXPRESSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unique_hl_var_wrt_expression", "UNIQUE-HL-VAR-WRT-EXPRESSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "make_czer_el_var_name", "MAKE-CZER-EL-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_varP", "CANON-VAR?", 1, 0, false);
        new $canon_varP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "true_sentenceP", "TRUE-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "true_negated_varP", "TRUE-NEGATED-VAR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "true_negated_formulaP", "TRUE-NEGATED-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "true_var_formulaP", "TRUE-VAR-FORMULA?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "encapsulate_formulaP", "ENCAPSULATE-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "encapsulate_formula", "ENCAPSULATE-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "intensional_formulaP", "INTENSIONAL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "make_var_formula_lit", "MAKE-VAR-FORMULA-LIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "make_intensional_lit", "MAKE-INTENSIONAL-LIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "make_intensional_lit_int", "MAKE-INTENSIONAL-LIT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "formula_has_expansionP", "FORMULA-HAS-EXPANSION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "relation_has_expansionP", "RELATION-HAS-EXPANSION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "within_negationP", "WITHIN-NEGATION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "within_disjunctionP", "WITHIN-DISJUNCTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "within_conjunctionP", "WITHIN-CONJUNCTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "within_negated_disjunctionP", "WITHIN-NEGATED-DISJUNCTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "commuting_functionsP", "COMMUTING-FUNCTIONS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "reifiable_functorP", "REIFIABLE-FUNCTOR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "reifiable_function_termP", "REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "wf_reifiable_function_termP", "WF-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "reifiable_termP", "REIFIABLE-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "reifiable_nat_termP", "REIFIABLE-NAT-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unreified_reifiable_nat_termP", "UNREIFIED-REIFIABLE-NAT-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "reifiable_nautP", "REIFIABLE-NAUT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "fort_or_naut_with_corresponding_nartP", "FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "list_of_fort_or_naut_with_corresponding_nartP", "LIST-OF-FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "naut_with_corresponding_nartP", "NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "evaluatable_function_symbolP", "EVALUATABLE-FUNCTION-SYMBOL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "evaluatable_function_termP", "EVALUATABLE-FUNCTION-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unpackage_cnf_clause", "UNPACKAGE-CNF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unpackage_dnf_clause", "UNPACKAGE-DNF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "equals_el_memoizedP_internal", "EQUALS-EL-MEMOIZED?-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "equals_el_memoizedP", "EQUALS-EL-MEMOIZED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "queries_equal_at_elP", "QUERIES-EQUAL-AT-EL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "terms_equal_at_elP", "TERMS-EQUAL-AT-EL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "equals_elP", "EQUALS-EL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "equals_el_intP", "EQUALS-EL-INT?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "el_expression_equalP", "EL-EXPRESSION-EQUAL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canonicalize_for_equals_el", "CANONICALIZE-FOR-EQUALS-EL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "el_expression_equal_unification_successfulP", "EL-EXPRESSION-EQUAL-UNIFICATION-SUCCESSFUL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "problem_queries_equal_modulo_el_var_names", "PROBLEM-QUERIES-EQUAL-MODULO-EL-VAR-NAMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "equal_modulo_el_var_names", "EQUAL-MODULO-EL-VAR-NAMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "equal_modulo_el_var_names_int", "EQUAL-MODULO-EL-VAR-NAMES-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "el_variable_token", "EL-VARIABLE-TOKEN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "non_null_closed_termP", "NON-NULL-CLOSED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "delete_el_duplicates", "DELETE-EL-DUPLICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "cnfs_reorder_equalP", "CNFS-REORDER-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "cnfs_reorder_literals_equalP", "CNFS-REORDER-LITERALS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "cnfs_reorder_terms_equalP", "CNFS-REORDER-TERMS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "ordered_cnf_unifyP", "ORDERED-CNF-UNIFY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "ordered_literals_unify", "ORDERED-LITERALS-UNIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "ordered_literals_unify_int", "ORDERED-LITERALS-UNIFY-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "el_find_nart", "EL-FIND-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "el_find_if_nart", "EL-FIND-IF-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "recanonicalized_candidate_nat_equals_nat_formulaP", "RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "recanonicalize_candidate_nat", "RECANONICALIZE-CANDIDATE-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "robust_nart_lookupP", "ROBUST-NART-LOOKUP?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "sort_forts_external", "SORT-FORTS-EXTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "definitional_lits_to_front", "DEFINITIONAL-LITS-TO-FRONT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "evaluatable_expressions_out", "EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_if_ist", "UNWRAP-IF-IST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_if_ist_permissive", "UNWRAP-IF-IST-PERMISSIVE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_if_ist_discard_mt", "UNWRAP-IF-IST-DISCARD-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_if_ist_canonical", "UNWRAP-IF-IST-CANONICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_if_ist_permissive_canonical", "UNWRAP-IF-IST-PERMISSIVE-CANONICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_if_ist_canonical_int", "UNWRAP-IF-IST-CANONICAL-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_if_ist_int", "UNWRAP-IF-IST-INT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_if_ist_recursive", "UNWRAP-IF-IST-RECURSIVE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "possibly_quoted_cycl_formula_p", "POSSIBLY-QUOTED-CYCL-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "unwrap_quotes", "UNWRAP-QUOTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "quoted_term_with_hl_varP", "QUOTED-TERM-WITH-HL-VAR?", 1, 0, false);
        new $quoted_term_with_hl_varP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "escape_term", "ESCAPE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "possibly_escape_quote_hl_vars", "POSSIBLY-ESCAPE-QUOTE-HL-VARS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "escape_quote_hl_vars", "ESCAPE-QUOTE-HL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "nescape_quote_hl_vars", "NESCAPE-QUOTE-HL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "decontextualized_clausesP", "DECONTEXTUALIZED-CLAUSES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "decontextualized_clauseP", "DECONTEXTUALIZED-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "generalized_ist_clauses_p", "GENERALIZED-IST-CLAUSES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "generalized_ist_clause_p", "GENERALIZED-IST-CLAUSE-P", 1, 0, false);
        new $generalized_ist_clause_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "generalized_ist_literal_p", "GENERALIZED-IST-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "opaque_arg_wrt_quoting_seeker", "OPAQUE-ARG-WRT-QUOTING-SEEKER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "note_opaque_reference_to_term", "NOTE-OPAQUE-REFERENCE-TO-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "formula_references_term_opaquelyP", "FORMULA-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "assertion_references_term_opaquelyP", "ASSERTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "kb_hl_support_references_term_opaquelyP", "KB-HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "hl_support_references_term_opaquelyP", "HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "support_references_term_opaquelyP", "SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "deduction_references_term_opaquelyP", "DEDUCTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "term_opaque_assertions", "TERM-OPAQUE-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "all_term_opaque_assertions", "ALL-TERM-OPAQUE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "term_opaque_deductions", "TERM-OPAQUE-DEDUCTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "all_term_opaque_deductions", "ALL-TERM-OPAQUE-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canonicalize_el_query", "CANONICALIZE-EL-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canonicalize_el_sentence", "CANONICALIZE-EL-SENTENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_equalP", "CANON-EQUAL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_query_equalP", "CANON-QUERY-EQUAL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_assert_equalP", "CANON-ASSERT-EQUAL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_assert_isomorphicP", "CANON-ASSERT-ISOMORPHIC?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_forms_equalP", "CANON-FORMS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_forms_isomorphicP", "CANON-FORMS-ISOMORPHIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_equal_hl_namesP", "CANON-EQUAL-HL-NAMES?", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "constant_occurs_in_formulaP", "CONSTANT-OCCURS-IN-FORMULA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canonicalize_and_return_skolem_vars", "CANONICALIZE-AND-RETURN-SKOLEM-VARS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "find_anywhere", "FIND-ANYWHERE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "find_all_anywhere", "FIND-ALL-ANYWHERE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "return_uncanon", "RETURN-UNCANON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "uncanon_original_test", "UNCANON-ORIGINAL-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "uncanon_test", "UNCANON-TEST", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "assert_return_uncanon", "ASSERT-RETURN-UNCANON", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_mal_resultP", "CANON-MAL-RESULT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_ask_mal_resultP", "CANON-ASK-MAL-RESULT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_query_mal_resultP", "CANON-QUERY-MAL-RESULT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_assert_mal_resultP", "CANON-ASSERT-MAL-RESULT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.czer_utilities", "canon_form_mal_resultP", "CANON-FORM-MAL-RESULT?", 1, 0, false);
        return (SubLObject)czer_utilities.NIL;
    }
    
    public static SubLObject init_czer_utilities_file() {
        czer_utilities.$formula_arg_intP_caching_state$ = SubLFiles.deflexical("*FORMULA-ARG-INT?-CACHING-STATE*", (SubLObject)czer_utilities.NIL);
        czer_utilities.$quoted_formula_arg_intP_caching_state$ = SubLFiles.deflexical("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*", (SubLObject)czer_utilities.NIL);
        czer_utilities.$sentence_arg_intP_caching_state$ = SubLFiles.deflexical("*SENTENCE-ARG-INT?-CACHING-STATE*", (SubLObject)czer_utilities.NIL);
        czer_utilities.$quoted_sentence_arg_intP_caching_state$ = SubLFiles.deflexical("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*", (SubLObject)czer_utilities.NIL);
        czer_utilities.$some_sentence_arg_intP_caching_state$ = SubLFiles.deflexical("*SOME-SENTENCE-ARG-INT?-CACHING-STATE*", (SubLObject)czer_utilities.NIL);
        czer_utilities.$some_quoted_sentence_arg_intP_caching_state$ = SubLFiles.deflexical("*SOME-QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*", (SubLObject)czer_utilities.NIL);
        czer_utilities.$czer_evaluatable_predicate_fix_enabledP$ = SubLFiles.defparameter("*CZER-EVALUATABLE-PREDICATE-FIX-ENABLED?*", (SubLObject)czer_utilities.NIL);
        czer_utilities.$opaque_arg_wrt_quoting_target$ = SubLFiles.defparameter("*OPAQUE-ARG-WRT-QUOTING-TARGET*", (SubLObject)czer_utilities.NIL);
        return (SubLObject)czer_utilities.NIL;
    }
    
    public static SubLObject setup_czer_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)czer_utilities.$sym26$FORMULA_ARG_INT_);
        memoization_state.note_globally_cached_function((SubLObject)czer_utilities.$sym30$QUOTED_FORMULA_ARG_INT_);
        memoization_state.note_globally_cached_function((SubLObject)czer_utilities.$sym32$SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function((SubLObject)czer_utilities.$sym36$QUOTED_SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function((SubLObject)czer_utilities.$sym39$SOME_SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function((SubLObject)czer_utilities.$sym42$SOME_QUOTED_SENTENCE_ARG_INT_);
        memoization_state.note_memoized_function((SubLObject)czer_utilities.$sym71$EQUALS_EL_MEMOIZED_);
        utilities_macros.note_funcall_helper_function((SubLObject)czer_utilities.$sym79$EL_VARIABLE_TOKEN);
        utilities_macros.note_funcall_helper_function((SubLObject)czer_utilities.$sym97$OPAQUE_ARG_WRT_QUOTING_SEEKER);
        generic_testing.define_test_case_table_int((SubLObject)czer_utilities.$sym128$EQUALS_EL_, (SubLObject)ConsesLow.list(new SubLObject[] { czer_utilities.$kw129$TEST, czer_utilities.NIL, czer_utilities.$kw130$OWNER, czer_utilities.NIL, czer_utilities.$kw131$CLASSES, czer_utilities.NIL, czer_utilities.$kw132$KB, czer_utilities.$kw133$TINY, czer_utilities.$kw134$WORKING_, czer_utilities.T }), czer_utilities.$list135);
        return (SubLObject)czer_utilities.NIL;
    }
    
    private static SubLObject _constant_135_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.ONE_INTEGER), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.TWO_INTEGER), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)czer_utilities.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)czer_utilities.TWO_INTEGER, (SubLObject)czer_utilities.ONE_INTEGER)), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)czer_utilities.THREE_INTEGER, (SubLObject)czer_utilities.ONE_INTEGER)), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)czer_utilities.ONE_INTEGER, (SubLObject)czer_utilities.TWO_INTEGER, (SubLObject)czer_utilities.THREE_INTEGER)), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January"))))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February"))))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March"))))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March"))))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March"))))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)SubLObjectFactory.makeKeyword("DNF")), (SubLObject)czer_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptySet")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")))), (SubLObject)czer_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)ConsesLow.list((SubLObject)czer_utilities.ZERO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptySet")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)ConsesLow.list((SubLObject)czer_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")))))), (SubLObject)czer_utilities.T) });
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
    
    static {
        me = (SubLFile)new czer_utilities();
        czer_utilities.$formula_arg_intP_caching_state$ = null;
        czer_utilities.$quoted_formula_arg_intP_caching_state$ = null;
        czer_utilities.$sentence_arg_intP_caching_state$ = null;
        czer_utilities.$quoted_sentence_arg_intP_caching_state$ = null;
        czer_utilities.$some_sentence_arg_intP_caching_state$ = null;
        czer_utilities.$some_quoted_sentence_arg_intP_caching_state$ = null;
        czer_utilities.$czer_evaluatable_predicate_fix_enabledP$ = null;
        czer_utilities.$opaque_arg_wrt_quoting_target$ = null;
        $kw0$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const1$canonicalizerDirectiveForArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArg"));
        $kw2$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const3$canonicalizerDirectiveForArgAndRe = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArgAndRest"));
        $const4$canonicalizerDirectiveForAllArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForAllArgs"));
        $const5$LeaveSomeTermsAtEL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtEL"));
        $list6 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeaveVariablesAtEL")));
        $const7$LeaveSomeTermsAtELAndAllowKeyword = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtELAndAllowKeywordVariables"));
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtEL")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllowKeywordVariables")));
        $const9$AllowKeywordVariables = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllowKeywordVariables"));
        $list10 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllowGenericArgVariables")));
        $const11$LeaveVariablesAtEL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeaveVariablesAtEL"));
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtEL")));
        $list13 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtELAndAllowKeywordVariables")));
        $const14$AllowGenericArgVariables = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllowGenericArgVariables"));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllowKeywordVariables")));
        $kw16$EL_VAR = SubLObjectFactory.makeKeyword("EL-VAR");
        $str17$X__d = SubLObjectFactory.makeString("X-~d");
        $kw18$KB_VAR = SubLObjectFactory.makeKeyword("KB-VAR");
        $str19$_a_was_not_a_canonical_variable = SubLObjectFactory.makeString("~a was not a canonical variable");
        $const20$RelaxArgTypeConstraintsForVariabl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelaxArgTypeConstraintsForVariables"));
        $const21$DontReOrderCommutativeTerms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DontReOrderCommutativeTerms"));
        $const22$CycLIndexedTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLIndexedTerm"));
        $const23$CycLExpression = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression"));
        $const24$CycLExpression_Assertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression-Assertible"));
        $const25$CycLExpression_Askable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression-Askable"));
        $sym26$FORMULA_ARG_INT_ = SubLObjectFactory.makeSymbol("FORMULA-ARG-INT?");
        $const27$CycLFormula = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLFormula"));
        $sym28$_FORMULA_ARG_INT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FORMULA-ARG-INT?-CACHING-STATE*");
        $int29$1024 = SubLObjectFactory.makeInteger(1024);
        $sym30$QUOTED_FORMULA_ARG_INT_ = SubLObjectFactory.makeSymbol("QUOTED-FORMULA-ARG-INT?");
        $sym31$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*");
        $sym32$SENTENCE_ARG_INT_ = SubLObjectFactory.makeSymbol("SENTENCE-ARG-INT?");
        $const33$CycLSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence"));
        $sym34$_SENTENCE_ARG_INT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SENTENCE-ARG-INT?-CACHING-STATE*");
        $sym35$CLEAR_SENTENCE_ARG_INT_ = SubLObjectFactory.makeSymbol("CLEAR-SENTENCE-ARG-INT?");
        $sym36$QUOTED_SENTENCE_ARG_INT_ = SubLObjectFactory.makeSymbol("QUOTED-SENTENCE-ARG-INT?");
        $sym37$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");
        $sym38$CLEAR_QUOTED_SENTENCE_ARG_INT_ = SubLObjectFactory.makeSymbol("CLEAR-QUOTED-SENTENCE-ARG-INT?");
        $sym39$SOME_SENTENCE_ARG_INT_ = SubLObjectFactory.makeSymbol("SOME-SENTENCE-ARG-INT?");
        $sym40$_SOME_SENTENCE_ARG_INT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SOME-SENTENCE-ARG-INT?-CACHING-STATE*");
        $sym41$CLEAR_SOME_SENTENCE_ARG_INT_ = SubLObjectFactory.makeSymbol("CLEAR-SOME-SENTENCE-ARG-INT?");
        $sym42$SOME_QUOTED_SENTENCE_ARG_INT_ = SubLObjectFactory.makeSymbol("SOME-QUOTED-SENTENCE-ARG-INT?");
        $sym43$_SOME_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SOME-QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");
        $sym44$CLEAR_SOME_QUOTED_SENTENCE_ARG_INT_ = SubLObjectFactory.makeSymbol("CLEAR-SOME-QUOTED-SENTENCE-ARG-INT?");
        $const45$CycLSentence_Askable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Askable"));
        $const46$CycLSentence_Assertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible"));
        $const47$CycLDenotationalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLDenotationalTerm"));
        $const48$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym49$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym50$NPUT_BACK_CLAUSE_EL_VARIABLES = SubLObjectFactory.makeSymbol("NPUT-BACK-CLAUSE-EL-VARIABLES");
        $sym51$PUT_BACK_CLAUSE_EL_VARIABLES = SubLObjectFactory.makeSymbol("PUT-BACK-CLAUSE-EL-VARIABLES");
        $sym52$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym53$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $const54$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $str55$function = SubLObjectFactory.makeString("function");
        $const56$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const57$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $sym58$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $str59$ = SubLObjectFactory.makeString("");
        $str60$__s = SubLObjectFactory.makeString("-~s");
        $sym61$_X = SubLObjectFactory.makeSymbol("?X");
        $str62$Could_not_create_a_unique_HL_var_ = SubLObjectFactory.makeString("Could not create a unique HL var wrt ~a");
        $kw63$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym64$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $const65$trueSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $sym66$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $const67$functionCommutesWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionCommutesWith"));
        $sym68$FORT_OR_NAUT_WITH_CORRESPONDING_NART_ = SubLObjectFactory.makeSymbol("FORT-OR-NAUT-WITH-CORRESPONDING-NART?");
        $sym69$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym70$NEGATE_ATOMIC = SubLObjectFactory.makeSymbol("NEGATE-ATOMIC");
        $sym71$EQUALS_EL_MEMOIZED_ = SubLObjectFactory.makeSymbol("EQUALS-EL-MEMOIZED?");
        $kw72$CNF = SubLObjectFactory.makeKeyword("CNF");
        $kw73$DNF = SubLObjectFactory.makeKeyword("DNF");
        $sym74$CLAUSAL_FORM_P = SubLObjectFactory.makeSymbol("CLAUSAL-FORM-P");
        $sym75$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $str76$Unexpected_clausal_form__s = SubLObjectFactory.makeString("Unexpected clausal form ~s");
        $sym77$NON_NULL_CLOSED_TERM_ = SubLObjectFactory.makeSymbol("NON-NULL-CLOSED-TERM?");
        $sym78$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym79$EL_VARIABLE_TOKEN = SubLObjectFactory.makeSymbol("EL-VARIABLE-TOKEN");
        $kw80$OPAQUIFIED_EL_VARIABLE = SubLObjectFactory.makeKeyword("OPAQUIFIED-EL-VARIABLE");
        $sym81$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym82$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_ = SubLObjectFactory.makeSymbol("RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?");
        $sym83$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const84$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $sym85$EVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("EVALUATABLE-EXPRESSION?");
        $sym86$TRANSFORM_EVALUATION_EXPRESSION = SubLObjectFactory.makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");
        $str87$_s__s_does_not_adequately_specify = SubLObjectFactory.makeString("~s ~s does not adequately specify a microtheory.");
        $const88$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $sym89$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $const90$EscapeQuote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EscapeQuote"));
        $sym91$QUOTED_TERM_WITH_HL_VAR_ = SubLObjectFactory.makeSymbol("QUOTED-TERM-WITH-HL-VAR?");
        $sym92$ESCAPE_TERM = SubLObjectFactory.makeSymbol("ESCAPE-TERM");
        $sym93$NESCAPE_QUOTE_HL_VARS = SubLObjectFactory.makeSymbol("NESCAPE-QUOTE-HL-VARS");
        $sym94$DECONTEXTUALIZED_CLAUSE_ = SubLObjectFactory.makeSymbol("DECONTEXTUALIZED-CLAUSE?");
        $sym95$GENERALIZED_IST_CLAUSE_P = SubLObjectFactory.makeSymbol("GENERALIZED-IST-CLAUSE-P");
        $list96 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")));
        $sym97$OPAQUE_ARG_WRT_QUOTING_SEEKER = SubLObjectFactory.makeSymbol("OPAQUE-ARG-WRT-QUOTING-SEEKER");
        $kw98$OPAQUE_ARG_FOUND = SubLObjectFactory.makeKeyword("OPAQUE-ARG-FOUND");
        $sym99$CYCL_FORMULA_P = SubLObjectFactory.makeSymbol("CYCL-FORMULA-P");
        $sym100$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym101$KB_HL_SUPPORT_P = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $sym102$HL_SUPPORT_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $sym103$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym104$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym105$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $const106$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const107$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $sym108$LIT__ = SubLObjectFactory.makeSymbol("LIT-<");
        $sym109$CLAUSE_BINDING_LIST_PAIRS_LITERAL = SubLObjectFactory.makeSymbol("CLAUSE-BINDING-LIST-PAIRS-LITERAL");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DNF-CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-TO-HL-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("FREE-EL-VARS"));
        $sym111$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym112$SKOLEM_NART_ = SubLObjectFactory.makeSymbol("SKOLEM-NART?");
        $sym113$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw114$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $str115$__Error__assert_failed__S___ = SubLObjectFactory.makeString("~%Error: assert failed ~S.~%");
        $str116$__Error__Can_t_find_assertion___ = SubLObjectFactory.makeString("~%Error: Can't find assertion:~%");
        $kw117$UNASSERT = SubLObjectFactory.makeKeyword("UNASSERT");
        $str118$__Form___A_in__A__ = SubLObjectFactory.makeString("~%Form: ~A in ~A~%");
        $str119$__Error__assert_failed__ = SubLObjectFactory.makeString("~%Error: assert failed~%");
        $str120$__Error__Can_t_find_assertions___ = SubLObjectFactory.makeString("~%Error: Can't find assertions: ~A~%");
        $str121$__The_assertion_is__S___ = SubLObjectFactory.makeString("~%The assertion is ~S.~%");
        $str122$__Its_EL_form_is__S_in__S___ = SubLObjectFactory.makeString("~%Its EL form is ~S in ~S.~%");
        $str123$__Error__Can_t_find_assertions___ = SubLObjectFactory.makeString("~%Error: Can't find assertions: ~A in ~A~%");
        $str124$__Its_New_EL_form_is__S_in__S___ = SubLObjectFactory.makeString("~%Its New EL form is ~S in ~S.~%");
        $str125$__Error__EL_mismatch___Original__ = SubLObjectFactory.makeString("~%Error: EL mismatch:~%Original: ~A ~%From assertion: ~A");
        $str126$__Error__assert_failed___S__ = SubLObjectFactory.makeString("~%Error: assert failed: ~S~%");
        $str127$__Error__unassert_failed___S__ = SubLObjectFactory.makeString("~%Error: unassert failed: ~S~%");
        $sym128$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $kw129$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw130$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw131$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw132$KB = SubLObjectFactory.makeKeyword("KB");
        $kw133$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw134$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list135 = _constant_135_initializer();
    }
    
    public static final class $canon_varP$UnaryFunction extends UnaryFunction
    {
        public $canon_varP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CANON-VAR?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return czer_utilities.canon_varP(arg1);
        }
    }
    
    public static final class $quoted_term_with_hl_varP$UnaryFunction extends UnaryFunction
    {
        public $quoted_term_with_hl_varP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QUOTED-TERM-WITH-HL-VAR?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return czer_utilities.quoted_term_with_hl_varP(arg1);
        }
    }
    
    public static final class $generalized_ist_clause_p$UnaryFunction extends UnaryFunction
    {
        public $generalized_ist_clause_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GENERALIZED-IST-CLAUSE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return czer_utilities.generalized_ist_clause_p(arg1);
        }
    }
}

/*

	Total time: 1182 ms
	
*/