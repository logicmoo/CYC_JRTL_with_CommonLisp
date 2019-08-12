/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_control_vars.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.ArrayList;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WFF
 * source file: /cyc/top/cycl/wff.lisp
 * created:     2019/07/03 17:37:29
 */
public final class wff extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return boolean; t iff ASENT is known to be true via sbhl inference
     */
    @LispMethod(comment = "@return boolean; t iff ASENT is known to be true via sbhl inference")
    public static final SubLObject sbhl_trueP(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject pred = literal_predicate(asent, UNPROVIDED);
            SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
            SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
            if ((NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) && (NIL != term.el_fort_p(arg2))) {
                return sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), arg1, arg2, mt, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff literal, if asserted, establishes a sbhl conflict
     */
    @LispMethod(comment = "@return boolean; t iff literal, if asserted, establishes a sbhl conflict")
    public static final SubLObject sbhl_literal_conflictP(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject conflictP = NIL;
            if (NIL != czer_utilities.within_negationP()) {
                if (NIL != com.cyc.cycjava.cycl.wff.sbhl_trueP(literal, mt)) {
                    com.cyc.cycjava.cycl.wff.note_wff_violation(list($CONFLICT_ASSERTING_FALSE_SBHL, literal, mt));
                    conflictP = T;
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.wff.sbhl_falseP(literal, mt)) {
                    com.cyc.cycjava.cycl.wff.note_wff_violation(list($CONFLICT_ASSERTING_TRUE_SBHL, literal, mt));
                    conflictP = T;
                }
            }
            return conflictP;
        }
    }

    /**
     *
     *
     * @return boolean; t iff ASENT is known to be false via sbhl inference
     */
    @LispMethod(comment = "@return boolean; t iff ASENT is known to be false via sbhl inference")
    public static final SubLObject sbhl_falseP(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject pred = literal_predicate(asent, UNPROVIDED);
            SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
            SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
            if ((NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) && (NIL != term.el_fort_p(arg2))) {
                {
                    SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
                    if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                        return sbhl_search_methods.sbhl_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED);
                    } else {
                        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLFile me = new wff();

 public static final String myName = "com.cyc.cycjava.cycl.wff";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $strictly_wff_in_all_spec_mtsP_caching_state$ = makeSymbol("*STRICTLY-WFF-IN-ALL-SPEC-MTS?-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $wff_non_fort_isa_support_enabledP$ = makeSymbol("*WFF-NON-FORT-ISA-SUPPORT-ENABLED?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mal_actual_arity_cachedP_caching_state$ = makeSymbol("*MAL-ACTUAL-ARITY-CACHED?-CACHING-STATE*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $wff_trace_level$ = makeSymbol("*WFF-TRACE-LEVEL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $inside_clear_wff_constraint_dependent_cachesP$ = makeSymbol("*INSIDE-CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES?*");

    private static final SubLSymbol WFF_PROPERTY_P = makeSymbol("WFF-PROPERTY-P");

    private static final SubLSymbol SPECIAL_VARIABLE_STATE_P = makeSymbol("SPECIAL-VARIABLE-STATE-P");

    private static final SubLSymbol $sym5$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str10$invalid_formula_type___s = makeString("invalid formula type: ~s");



    private static final SubLSymbol $sym13$STRICTLY_WFF_IN_ALL_SPEC_MTS_ = makeSymbol("STRICTLY-WFF-IN-ALL-SPEC-MTS?");

    private static final SubLSymbol $sym14$_STRICTLY_WFF_IN_ALL_SPEC_MTS__CACHING_STATE_ = makeSymbol("*STRICTLY-WFF-IN-ALL-SPEC-MTS?-CACHING-STATE*");

    private static final SubLSymbol $sym16$CLEAR_STRICTLY_WFF_IN_ALL_SPEC_MTS_ = makeSymbol("CLEAR-STRICTLY-WFF-IN-ALL-SPEC-MTS?");







    private static final SubLSymbol $RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");

    private static final SubLSymbol $sym27$EL_WFF_SYNTAX_ = makeSymbol("EL-WFF-SYNTAX?");

    static private final SubLList $list28 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str29$Is_SENTENCE_well_formed_wrt_synta = makeString("Is SENTENCE well-formed wrt syntax?");

    private static final SubLList $list30 = list(makeSymbol("BOOLEANP"));





    private static final SubLString $str33$Got_a_sentence_that_was_neither_a = makeString("Got a sentence that was neither atomic nor non-atomic in mt ~s: ~s");

    private static final SubLList $list34 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"), reader_make_constant_shell("myCreator"), reader_make_constant_shell("myCreationTime"), reader_make_constant_shell("myCreationPurpose"), reader_make_constant_shell("myCreationSecond"));

    private static final SubLSymbol $sym35$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol $sym36$HL_VAR_ = makeSymbol("HL-VAR?");

    private static final SubLSymbol $sym37$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol NON_WF_FORT_P = makeSymbol("NON-WF-FORT-P");

    private static final SubLSymbol $sym39$MEMOIZED_SYNTACTICALLY_WF_FORMULA_ = makeSymbol("MEMOIZED-SYNTACTICALLY-WF-FORMULA?");

    private static final SubLSymbol $sym40$MEMOIZED_SEMANTICALLY_WF_LITERAL_ = makeSymbol("MEMOIZED-SEMANTICALLY-WF-LITERAL?");

    private static final SubLSymbol $RESTRICTED_SKOLEM_ASSERTION = makeKeyword("RESTRICTED-SKOLEM-ASSERTION");

    private static final SubLSymbol $EVALUATABLE_LITERAL_FALSE = makeKeyword("EVALUATABLE-LITERAL-FALSE");

    private static final SubLSymbol $RESTRICTED_MT_ASSERTION = makeKeyword("RESTRICTED-MT-ASSERTION");

    private static final SubLSymbol $RESTRICTED_PREDICATE_ASSERTION = makeKeyword("RESTRICTED-PREDICATE-ASSERTION");

    private static final SubLSymbol $RESTRICTED_COLLECTION_ASSERTION = makeKeyword("RESTRICTED-COLLECTION-ASSERTION");

    private static final SubLSymbol $REIFIABLE_BUT_NOT_FORWARD_REIFIABLE = makeKeyword("REIFIABLE-BUT-NOT-FORWARD-REIFIABLE");



    private static final SubLSymbol $NON_DEFN_PRED_IN_VOCAB_MT = makeKeyword("NON-DEFN-PRED-IN-VOCAB-MT");

    private static final SubLSymbol $sym49$OPAQUE_ARG_WRT_QUOTING_ = makeSymbol("OPAQUE-ARG-WRT-QUOTING?");

    private static final SubLSymbol $sym50$REIFIABLE_BUT_NOT_FORWARD_REIFIABLE_NAT_ = makeSymbol("REIFIABLE-BUT-NOT-FORWARD-REIFIABLE-NAT?");



    private static final SubLList $list53 = list(reader_make_constant_shell("PossibleDefinitionalPredicate"), reader_make_constant_shell("DefinitionalPredicate"));

    private static final SubLSymbol $CONFLICT_ASSERTING_FALSE_SBHL = makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");

    private static final SubLSymbol $CONFLICT_ASSERTING_TRUE_SBHL = makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");



    private static final SubLSymbol $sym57$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");









    private static final SubLSymbol $kw62$EXCEPT_FOR_W_O_SINGLETON_VAR = makeKeyword("EXCEPT-FOR-W/O-SINGLETON-VAR");

    private static final SubLSymbol $INVALID_MT_FOR_TOU = makeKeyword("INVALID-MT-FOR-TOU");

    private static final SubLString $str64$Got_an_unexpected_sentential_rela = makeString("Got an unexpected sentential relation ~s in ~s");

    private static final SubLSymbol $sym65$MEMOIZED_SEMANTICALLY_WF_SENTENCE_ = makeSymbol("MEMOIZED-SEMANTICALLY-WF-SENTENCE?");

    private static final SubLSymbol $sym66$MAL_ACTUAL_ARITY_CACHED_ = makeSymbol("MAL-ACTUAL-ARITY-CACHED?");

    private static final SubLSymbol $sym68$_MAL_ACTUAL_ARITY_CACHED__CACHING_STATE_ = makeSymbol("*MAL-ACTUAL-ARITY-CACHED?-CACHING-STATE*");

    private static final SubLSymbol $sym69$CLEAR_MAL_ACTUAL_ARITY_CACHED_ = makeSymbol("CLEAR-MAL-ACTUAL-ARITY-CACHED?");







    private static final SubLSymbol $sym77$EL_FORMULA_OK_ = makeSymbol("EL-FORMULA-OK?");

    static private final SubLList $list78 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str79$Is_FORMULA_a_well_formed_el_formu = makeString("Is FORMULA a well-formed el formula?");

    private static final SubLList $list80 = list(list(makeSymbol("FORMULA"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym81$EL_QUERY_OK_ = makeSymbol("EL-QUERY-OK?");

    private static final SubLString $str82$Is_FORMULA_a_well_formed_el_query = makeString("Is FORMULA a well-formed el query?");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLList $list86 = list(makeSymbol("SENTENCE-1"), makeSymbol("MT"), makeSymbol("ACCOMMODATING-MTS"));

    private static final SubLString $str87$__Consider_asserting______s__in_m = makeString("~%Consider asserting ~%  ~s~%in mt ~s.");

    private static final SubLString $str88$__Consider_asserting______s__in_o = makeString("~%Consider asserting ~%  ~s~%in one of these mts: ~s.");

    private static final SubLString $str89$__ = makeString(", ");

    private static final SubLString $str90$__or_ = makeString(", or ");

    private static final SubLList $list92 = list(makeSymbol("OLD-TERM"), makeSymbol("NEW-TERM"));

    private static final SubLString $str93$__Consider_using_term______s__ins = makeString("~%Consider using term ~%  ~s~%instead of term~%  ~s.");

    private static final SubLList $list94 = list(makeSymbol("SENTENCE-1"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str95$__Consider_asserting______s____in = makeString("~%Consider asserting ~%  ~s~%  in mt ~s.");

    private static final SubLString $str96$__Consider_asserting______s_ = makeString("~%Consider asserting ~%  ~s.");

    private static final SubLString $str98$__Consider_unasserting______s____ = makeString("~%Consider unasserting ~%  ~s~%  in mt ~s.");

    private static final SubLString $str99$__Consider_unasserting______s_ = makeString("~%Consider unasserting ~%  ~s.");

    private static final SubLString $str100$__No_explanation_template_exists_ = makeString("~%No explanation template exists for wff suggestion~%~s.");

    static private final SubLList $list101 = list(makeSymbol("TERM-1"), makeSymbol("MT"), makeSymbol("ACCOMMODATING-MTS"));

    private static final SubLString $str102$__Consider_referencing______s__in = makeString("~%Consider referencing ~%  ~s~%in mt ~s.");

    static private final SubLList $list103 = list(makeSymbol("TERM-1"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLSymbol DIAGNOSE_EL_FORMULA = makeSymbol("DIAGNOSE-EL-FORMULA");

    private static final SubLList $list107 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("IO-MODE"), makeKeyword("NL")));

    private static final SubLString $str108$Identify_how_el_sentence_SENTENCE = makeString("Identify how el sentence SENTENCE fails syntactic or semantic constraints");

    private static final SubLList $list109 = list(list(makeSymbol("SENTENCE"), makeSymbol("LISTP")));

    private static final SubLString $str110$___a = makeString("~%~a");

    private static final SubLList $list111 = list(makeKeyword("IO-MODE"), makeKeyword("NL"));

    private static final SubLSymbol EXPLANATION_OF_WHY_NOT_WFF_TERSE = makeSymbol("EXPLANATION-OF-WHY-NOT-WFF-TERSE");

    private static final SubLSymbol $NL_TERM_MAP = makeKeyword("NL-TERM-MAP");

    private static final SubLSymbol $NL_LIST_OUTPUT = makeKeyword("NL-LIST-OUTPUT");

    private static final SubLSymbol EXPLANATION_OF_WHY_NOT_WFF_TERSE_ASSERT = makeSymbol("EXPLANATION-OF-WHY-NOT-WFF-TERSE-ASSERT");

    private static final SubLList $list123 = list(makeKeyword("IO-MODE"), makeKeyword("HL"));









    private static final SubLSymbol WFF_VIOLATION_P = makeSymbol("WFF-VIOLATION-P");

    private static final SubLString $str129$__No_explanation_template_exists_ = makeString("~%No explanation template exists for wff error~%~s.");

    private static final SubLSymbol DRILL_DOWN_ON_WFF_VIOLATION = makeSymbol("DRILL-DOWN-ON-WFF-VIOLATION");

    private static final SubLSymbol $sym135$INVALID_ASSERTION_ = makeSymbol("INVALID-ASSERTION?");

    private static final SubLSymbol ASSERTIVE_WFF_RULES_CACHED = makeSymbol("ASSERTIVE-WFF-RULES-CACHED");





    private static final SubLSymbol $assertive_wff_rules_cached_caching_state$ = makeSymbol("*ASSERTIVE-WFF-RULES-CACHED-CACHING-STATE*");

    private static final SubLList $list143 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa1-2"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), ONE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), TWO_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list144 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa1-3"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), ONE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), THREE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list145 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa1-4"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), ONE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), FOUR_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list146 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa1-5"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), ONE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), FIVE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list147 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa2-1"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), TWO_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), ONE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list148 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa2-3"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), TWO_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), THREE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list149 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa2-4"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), TWO_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), FOUR_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list150 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa2-5"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), TWO_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), FIVE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list151 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa3-1"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), THREE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), ONE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list152 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa3-2"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), THREE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), TWO_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list153 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa3-4"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), THREE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), FOUR_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list154 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa3-5"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), THREE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), FIVE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list155 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa4-1"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), FOUR_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), ONE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list156 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa4-2"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), FOUR_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), TWO_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list157 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa4-3"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), FOUR_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), THREE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list158 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa4-5"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), FOUR_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), FIVE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list159 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa5-1"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), FIVE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), ONE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list160 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa5-2"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), FIVE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), TWO_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list161 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa5-3"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), FIVE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), THREE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLList $list162 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("interArgIsa5-4"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))), list(reader_make_constant_shell("interArgIsa"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("?CONSTRAINED-PRED")), FIVE_INTEGER, list(reader_make_constant_shell("TLVariableFn"), ONE_INTEGER, makeString("?IND-COL")), FOUR_INTEGER, list(reader_make_constant_shell("TLVariableFn"), TWO_INTEGER, makeString("?DEP-COL"))));

    private static final SubLString $str163$Forgetting_redundant_assertive_wf = makeString("Forgetting redundant assertive wff deductions");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list166 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str169$_A = makeString("~A");

    private static final SubLString $str170$Forgot__A_redundant_assertive_wff = makeString("Forgot ~A redundant assertive wff deductions~%");

    private static final SubLSymbol CLEAR_WFF_CONSTRAINT_DEPENDENT_CACHES = makeSymbol("CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES");

    private static final SubLSymbol RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");

    private static final SubLSymbol AFTER_WFF_CONSTRAINT_SATISFIED = makeSymbol("AFTER-WFF-CONSTRAINT-SATISFIED");

    // Definitions
    /**
     * is <sentence> a well-formed el sentence?
     */
    @LispMethod(comment = "is <sentence> a well-formed el sentence?")
    public static final SubLObject el_wffP_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$wff_original_formula$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$wff_memoization_state$.currentBinding(thread);
                    try {
                        wff_vars.$wff_formula$.bind(sentence, thread);
                        wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? ((SubLObject) (wff_vars.wff_original_formula())) : sentence, thread);
                        wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
                        {
                            SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt2$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            if (NIL == wff_macros.within_wffP()) {
                                                com.cyc.cycjava.cycl.wff.reset_wff_state();
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    {
                                                        SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                                                        SubLObject svs = wff_svs;
                                                        {
                                                            SubLObject _prev_bind_0_3 = wff_vars.$wff_properties$.currentBinding(thread);
                                                            try {
                                                                wff_vars.$wff_properties$.bind(svs, thread);
                                                                {
                                                                    SubLObject svs_var = svs;
                                                                    SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                                                                    {
                                                                        SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                                                        final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                                                        try {
                                                                            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                                                            wffP = com.cyc.cycjava.cycl.wff.wffP(sentence, $ELF, mt);
                                                                        } finally {
                                                                            rebind_dynamic_vars(cprogv_var, old_values);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                wff_vars.$wff_properties$.rebind(_prev_bind_0_3, thread);
                                                            }
                                                        }
                                                    }
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        wff_vars.$wff_memoization_state$.rebind(_prev_bind_2, thread);
                        wff_vars.$wff_original_formula$.rebind(_prev_bind_1, thread);
                        wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    // Definitions
    /**
     * is <sentence> a well-formed el sentence?
     */
    @LispMethod(comment = "is <sentence> a well-formed el sentence?")
    public static SubLObject el_wffP(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$wff_original_formula$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$wff_memoization_state$.currentBinding(thread);
        try {
            wff_vars.$wff_formula$.bind(sentence, thread);
            wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? wff_vars.wff_original_formula() : sentence, thread);
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == wff_macros.within_wffP()) {
                        reset_wff_state();
                    }
                    final SubLObject svs;
                    final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
                    final SubLObject _prev_bind_0_$2 = wff_vars.$wff_properties$.currentBinding(thread);
                    try {
                        wff_vars.$wff_properties$.bind(svs, thread);
                        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                        final ArrayList old_values = extract_dynamic_values(cprogv_var);
                        try {
                            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                            SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                            wffP = wffP(sentence, $ELF, mt);
                        } finally {
                            rebind_dynamic_vars(cprogv_var, old_values);
                        }
                    } finally {
                        wff_vars.$wff_properties$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_3, thread);
            wff_vars.$wff_original_formula$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static SubLObject el_strictly_wffP(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            wff_vars.$wff_mode$.bind($STRICT, thread);
            return el_wffP(sentence, mt, v_properties);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * is <formula> an assertible el formula?
     */
    @LispMethod(comment = "is <formula> an assertible el formula?")
    public static final SubLObject el_wff_assertibleP_alt(SubLObject formula, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    try {
                        $within_assert$.bind(T, thread);
                        {
                            SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                            SubLObject svs = wff_svs;
                            {
                                SubLObject _prev_bind_0_4 = wff_vars.$wff_properties$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_properties$.bind(svs, thread);
                                    {
                                        SubLObject svs_var = svs;
                                        SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                                        {
                                            SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                            final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                            try {
                                                bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                                ans = com.cyc.cycjava.cycl.wff.el_wffP(formula, mt, UNPROVIDED);
                                            } finally {
                                                rebind_dynamic_vars(cprogv_var, old_values);
                                            }
                                        }
                                    }
                                } finally {
                                    wff_vars.$wff_properties$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                    } finally {
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * is <formula> an assertible el formula?
     */
    @LispMethod(comment = "is <formula> an assertible el formula?")
    public static SubLObject el_wff_assertibleP(final SubLObject formula, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            final SubLObject svs;
            final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
            final SubLObject _prev_bind_0_$4 = wff_vars.$wff_properties$.currentBinding(thread);
            try {
                wff_vars.$wff_properties$.bind(svs, thread);
                final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                    SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                    ans = el_wffP(formula, mt, UNPROVIDED);
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
            } finally {
                wff_vars.$wff_properties$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject el_lenient_wff_assertibleP(final SubLObject formula, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            wff_vars.$wff_mode$.bind($LENIENT, thread);
            return el_wff_assertibleP(formula, mt, v_properties);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject el_strictly_wff_assertibleP(final SubLObject formula, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            wff_vars.$wff_mode$.bind($STRICT, thread);
            return el_wff_assertibleP(formula, mt, v_properties);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * is <formula> a well-formed hl formula?
     */
    @LispMethod(comment = "is <formula> a well-formed hl formula?")
    public static final SubLObject hl_wffP_alt(SubLObject formula, SubLObject mt, SubLObject form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (form == UNPROVIDED) {
            form = $CNF;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$wff_original_formula$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$wff_memoization_state$.currentBinding(thread);
                    try {
                        wff_vars.$wff_formula$.bind(formula, thread);
                        wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? ((SubLObject) (wff_vars.wff_original_formula())) : formula, thread);
                        wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
                        {
                            SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_5 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt2$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            if (NIL == wff_macros.within_wffP()) {
                                                com.cyc.cycjava.cycl.wff.reset_wff_state();
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    {
                                                        SubLObject pcase_var = form;
                                                        if (pcase_var.eql($CNF)) {
                                                            wffP = com.cyc.cycjava.cycl.wff.wff_cnfP(formula, mt);
                                                        } else {
                                                            if (pcase_var.eql($DNF)) {
                                                                wffP = com.cyc.cycjava.cycl.wff.wff_dnfP(formula, mt);
                                                            }
                                                        }
                                                    }
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                        }
                    } finally {
                        wff_vars.$wff_memoization_state$.rebind(_prev_bind_2, thread);
                        wff_vars.$wff_original_formula$.rebind(_prev_bind_1, thread);
                        wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    /**
     * is <formula> a well-formed hl formula?
     */
    @LispMethod(comment = "is <formula> a well-formed hl formula?")
    public static SubLObject hl_wffP(final SubLObject formula, SubLObject mt, SubLObject form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (form == UNPROVIDED) {
            form = $CNF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$wff_original_formula$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$wff_memoization_state$.currentBinding(thread);
        try {
            wff_vars.$wff_formula$.bind(formula, thread);
            wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? wff_vars.wff_original_formula() : formula, thread);
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == wff_macros.within_wffP()) {
                        reset_wff_state();
                    }
                    final SubLObject pcase_var = form;
                    if (pcase_var.eql($CNF)) {
                        wffP = wff_cnfP(formula, mt);
                    } else
                        if (pcase_var.eql($DNF)) {
                            wffP = wff_dnfP(formula, mt);
                        }

                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_3, thread);
            wff_vars.$wff_original_formula$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject wffP_alt(SubLObject formula, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ELF;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                if (NIL == mt) {
                    mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                }
                {
                    SubLObject pcase_var = type;
                    if (pcase_var.eql($ELF)) {
                        wffP = com.cyc.cycjava.cycl.wff.wff_elfP(formula, mt);
                    } else {
                        if (pcase_var.eql($CNF)) {
                            wffP = com.cyc.cycjava.cycl.wff.wff_cnfP(formula, mt);
                        } else {
                            if (pcase_var.eql($DNF)) {
                                wffP = com.cyc.cycjava.cycl.wff.wff_dnfP(formula, mt);
                            } else {
                                if (pcase_var.eql($NAF)) {
                                    wffP = com.cyc.cycjava.cycl.wff.wff_nafP(formula, mt);
                                } else {
                                    com.cyc.cycjava.cycl.wff.wff_error(THREE_INTEGER, $str_alt8$invalid_formula_type___s, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject wffP(final SubLObject formula, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ELF;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        if (NIL == mt) {
            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql($ELF)) {
            wffP = wff_elfP(formula, mt);
        } else
            if (pcase_var.eql($CNF)) {
                wffP = wff_cnfP(formula, mt);
            } else
                if (pcase_var.eql($DNF)) {
                    wffP = wff_dnfP(formula, mt);
                } else
                    if (pcase_var.eql($NAF)) {
                        wffP = wff_nafP(formula, mt);
                    } else {
                        wff_error(THREE_INTEGER, $str10$invalid_formula_type___s, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }



        return wffP;
    }

    public static final SubLObject wff_in_any_mtP_alt(SubLObject formula, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        wffP = com.cyc.cycjava.cycl.wff.wffP(formula, type, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject wff_in_any_mtP(final SubLObject formula, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            wffP = wffP(formula, type, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static SubLObject clear_strictly_wff_in_all_spec_mtsP() {
        final SubLObject cs = $strictly_wff_in_all_spec_mtsP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_strictly_wff_in_all_spec_mtsP(final SubLObject formula, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($strictly_wff_in_all_spec_mtsP_caching_state$.getGlobalValue(), list(formula, mt, v_properties), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strictly_wff_in_all_spec_mtsP_internal(final SubLObject formula, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = wff_vars.$wff_constraint_mt$.currentBinding(thread);
        try {
            wff_vars.$wff_constraint_mt$.bind($$EverythingPSC, thread);
            return el_strictly_wffP(formula, mt, v_properties);
        } finally {
            wff_vars.$wff_constraint_mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject strictly_wff_in_all_spec_mtsP(final SubLObject formula, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject caching_state = $strictly_wff_in_all_spec_mtsP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym13$STRICTLY_WFF_IN_ALL_SPEC_MTS_, $sym14$_STRICTLY_WFF_IN_ALL_SPEC_MTS__CACHING_STATE_, $int$256, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym16$CLEAR_STRICTLY_WFF_IN_ALL_SPEC_MTS_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(formula, mt, v_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_properties.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(strictly_wff_in_all_spec_mtsP_internal(formula, mt, v_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt, v_properties));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject reset_wff_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == czer_vars.$within_canonicalizerP$.getDynamicValue(thread)) {
                czer_main.clear_canon_caches();
            }
            com.cyc.cycjava.cycl.wff.reset_wff_violations();
            com.cyc.cycjava.cycl.wff.reset_wff_suggestions();
            at_utilities.reset_at_state();
            return NIL;
        }
    }

    public static SubLObject reset_wff_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_vars.$within_canonicalizerP$.getDynamicValue(thread)) {
            czer_main.clear_canon_caches();
        }
        reset_wff_violations();
        reset_wff_suggestions();
        at_utilities.reset_at_state();
        return NIL;
    }

    public static final SubLObject mal_precanonicalizationsP_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject precanonicalized_formula = precanonicalizer.safe_precanonicalizations(formula, mt);
                SubLObject precanonicalized_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL == precanonicalized_formula) || (NIL == precanonicalized_mt)) {
                    if (NIL == com.cyc.cycjava.cycl.wff.wff_violations()) {
                        com.cyc.cycjava.cycl.wff.note_wff_violation(list($MAL_PRECANONICALIZATIONS));
                    }
                    return T;
                }
            }
            return sublisp_boolean(com.cyc.cycjava.cycl.wff.wff_violations());
        }
    }

    public static SubLObject mal_precanonicalizationsP(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject precanonicalized_formula = precanonicalizer.safe_precanonicalizations(formula, mt);
        final SubLObject precanonicalized_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == precanonicalized_formula) || (NIL == precanonicalized_mt)) {
            if (NIL == wff_violations()) {
                note_wff_violation(list($MAL_PRECANONICALIZATIONS));
            }
            return T;
        }
        return list_utilities.sublisp_boolean(wff_violations());
    }

    public static final SubLObject syntactically_wff_elf_intP_alt(SubLObject sentence, SubLObject check_fast_gafP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = T;
                {
                    SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
                    try {
                        wff_vars.$within_wffP$.bind(T, thread);
                        if (NIL != wff_utilities.mal_variablesP(sentence)) {
                            wffP = NIL;
                            com.cyc.cycjava.cycl.wff.note_wff_violation(list($INVALID_VARIABLES, wff_utilities.mal_variables(sentence), sentence));
                        }
                    } finally {
                        wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
                    try {
                        wff_vars.$within_wffP$.bind(T, thread);
                        if (NIL != wffP) {
                            if ((NIL != wff_utilities.$check_wff_constantsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.wff.mal_fortsP(sentence))) {
                                wffP = NIL;
                                com.cyc.cycjava.cycl.wff.note_wff_violation(list($MAL_FORTS, com.cyc.cycjava.cycl.wff.mal_forts(sentence)));
                            }
                        }
                    } finally {
                        wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
                    try {
                        wff_vars.$within_wffP$.bind(T, thread);
                        if (NIL != wffP) {
                            if ((NIL != check_fast_gafP) && (NIL != com.cyc.cycjava.cycl.wff.wff_fast_gafP(sentence))) {
                                wffP = T;
                            } else {
                                if (NIL != cycl_grammar.cycl_sentence_p(sentence)) {
                                    wffP = T;
                                } else {
                                    wffP = NIL;
                                }
                            }
                        }
                    } finally {
                        wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject syntactically_wff_elf_intP(final SubLObject sentence, final SubLObject check_fast_gafP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = T;
        SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
        try {
            wff_vars.$within_wffP$.bind(T, thread);
            if (NIL != wff_utilities.mal_variablesP(sentence)) {
                wffP = NIL;
                note_wff_violation(list($INVALID_VARIABLES, wff_utilities.mal_variables(sentence), sentence));
            }
        } finally {
            wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
        try {
            wff_vars.$within_wffP$.bind(T, thread);
            if (((NIL != wffP) && (NIL != wff_utilities.$check_wff_constantsP$.getDynamicValue(thread))) && (NIL != mal_fortsP(sentence))) {
                wffP = NIL;
                note_wff_violation(list($MAL_FORTS, mal_forts(sentence)));
            }
        } finally {
            wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
        try {
            wff_vars.$within_wffP$.bind(T, thread);
            if (NIL != wffP) {
                if ((NIL != check_fast_gafP) && (NIL != wff_fast_gafP(sentence))) {
                    wffP = T;
                } else
                    if (NIL != cycl_grammar.cycl_sentence_p(sentence)) {
                        wffP = T;
                    } else {
                        wffP = NIL;
                    }

            }
        } finally {
            wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject wff_elfP_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = T;
                SubLObject violations = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
                    try {
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        wffP = com.cyc.cycjava.cycl.wff.syntactically_wff_elf_intP(sentence, NIL);
                        {
                            SubLObject wff_mt = cycl_utilities.reify_when_closed_naut(mt);
                            if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                if (NIL == hlmt.hlmt_p(wff_mt)) {
                                    sentence = make_ist_sentence(mt, sentence);
                                    wff_mt = $$BaseKB;
                                }
                                if (NIL != wff_utilities.mal_mt_specP(wff_mt)) {
                                    wffP = NIL;
                                    com.cyc.cycjava.cycl.wff.note_wff_violation(list($INVALID_MT, wff_mt));
                                    if (((NIL != com.cyc.cycjava.cycl.wff.provide_wff_suggestionsP()) && (NIL != hlmt.hlmt_p(wff_mt))) && (NIL != fort_types_interface.mt_in_any_mtP(wff_mt))) {
                                        com.cyc.cycjava.cycl.wff.note_wff_suggestion(list($ASSERT, make_binary_formula($$isa, wff_mt, $$Microtheory), mt_vars.$mt_mt$.getGlobalValue()));
                                    }
                                }
                            }
                            if (!((NIL != com.cyc.cycjava.cycl.wff.wff_only_needs_syntactic_checksP()) || (NIL == wffP))) {
                                {
                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_mt);
                                    {
                                        SubLObject _prev_bind_0_7 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                                {
                                                    SubLObject _prev_bind_0_8 = wff_vars.$within_wffP$.currentBinding(thread);
                                                    try {
                                                        wff_vars.$within_wffP$.bind(T, thread);
                                                        wffP = makeBoolean(NIL == com.cyc.cycjava.cycl.wff.mal_precanonicalizationsP(sentence, wff_mt));
                                                    } finally {
                                                        wff_vars.$within_wffP$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                            }
                                            if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                                {
                                                    SubLObject _prev_bind_0_9 = wff_utilities.$check_arityP$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_10 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_11 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                                    try {
                                                        wff_utilities.$check_arityP$.bind(NIL, thread);
                                                        wff_utilities.$check_arg_typesP$.bind(com.cyc.cycjava.cycl.wff.wff_check_argsP(), thread);
                                                        wff_utilities.$check_wff_coherenceP$.bind(com.cyc.cycjava.cycl.wff.wff_check_coherenceP(), thread);
                                                        wff_utilities.$check_var_typesP$.bind(com.cyc.cycjava.cycl.wff.wff_check_varsP(), thread);
                                                        {
                                                            SubLObject _prev_bind_0_12 = wff_vars.$within_wffP$.currentBinding(thread);
                                                            try {
                                                                wff_vars.$within_wffP$.bind(T, thread);
                                                                wffP = makeBoolean((NIL != com.cyc.cycjava.cycl.wff.wff_elf_intP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread))) && (NIL != wffP));
                                                            } finally {
                                                                wff_vars.$within_wffP$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                        }
                                                        if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                                            if (NIL != com.cyc.cycjava.cycl.wff.check_var_typesP(sentence, UNPROVIDED)) {
                                                                {
                                                                    SubLObject _prev_bind_0_13 = wff_vars.$within_wffP$.currentBinding(thread);
                                                                    try {
                                                                        wff_vars.$within_wffP$.bind(T, thread);
                                                                        if (NIL == (NIL != at_vars.$at_assume_conjuncts_independentP$.getDynamicValue(thread) ? ((SubLObject) (at_var_types.formula_var_types_ok_intP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread)))) : at_var_types.inter_formula_var_types_ok_intP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), T, T))) {
                                                                            wffP = NIL;
                                                                            com.cyc.cycjava.cycl.wff.note_wff_violations(at_utilities.semantic_violations());
                                                                        }
                                                                    } finally {
                                                                        wff_vars.$within_wffP$.rebind(_prev_bind_0_13, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                                            if (NIL != com.cyc.cycjava.cycl.wff.check_wff_coherenceP(sentence, $ELF)) {
                                                                {
                                                                    SubLObject _prev_bind_0_14 = wff_vars.$within_wffP$.currentBinding(thread);
                                                                    try {
                                                                        wff_vars.$within_wffP$.bind(T, thread);
                                                                        if (NIL == com.cyc.cycjava.cycl.wff.wff_coherentP(sentence, $ELF)) {
                                                                            wffP = NIL;
                                                                        }
                                                                    } finally {
                                                                        wff_vars.$within_wffP$.rebind(_prev_bind_0_14, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_3, thread);
                                                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2_11, thread);
                                                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_10, thread);
                                                        wff_utilities.$check_arityP$.rebind(_prev_bind_0_9, thread);
                                                    }
                                                }
                                            }
                                            if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                                if (NIL != com.cyc.cycjava.cycl.wff.check_wff_expansionP(sentence)) {
                                                    {
                                                        SubLObject _prev_bind_0_15 = $within_assert$.currentBinding(thread);
                                                        try {
                                                            $within_assert$.bind(NIL, thread);
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject expansion = com.cyc.cycjava.cycl.wff.wff_el_expansion(sentence, mt);
                                                                SubLObject mt_16 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject _prev_bind_0_17 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                                                                    try {
                                                                        at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(makeBoolean(NIL == atomic_sentenceP(sentence)), thread);
                                                                        if (!((NIL == expansion) || sentence.equal(expansion))) {
                                                                            {
                                                                                SubLObject _prev_bind_0_18 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_19 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_20 = wff_vars.$validating_expansionP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3 = wff_vars.$wff_expansion_formula$.currentBinding(thread);
                                                                                try {
                                                                                    wff_vars.$unexpanded_formula$.bind(sentence, thread);
                                                                                    wff_vars.$validate_expansionsP$.bind(NIL, thread);
                                                                                    wff_vars.$validating_expansionP$.bind(T, thread);
                                                                                    wff_vars.$wff_expansion_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_expansion_formula()) ? ((SubLObject) (wff_vars.wff_expansion_formula())) : expansion, thread);
                                                                                    if (NIL == com.cyc.cycjava.cycl.wff.wff_elfP(expansion, mt_16)) {
                                                                                        wffP = NIL;
                                                                                    }
                                                                                } finally {
                                                                                    wff_vars.$wff_expansion_formula$.rebind(_prev_bind_3, thread);
                                                                                    wff_vars.$validating_expansionP$.rebind(_prev_bind_2_20, thread);
                                                                                    wff_vars.$validate_expansionsP$.rebind(_prev_bind_1_19, thread);
                                                                                    wff_vars.$unexpanded_formula$.rebind(_prev_bind_0_18, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0_17, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $within_assert$.rebind(_prev_bind_0_15, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                }
                            }
                        }
                        violations = com.cyc.cycjava.cycl.wff.wff_violations();
                    } finally {
                        wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
                    }
                }
                com.cyc.cycjava.cycl.wff.note_wff_violations(violations);
                return wffP;
            }
        }
    }

    public static SubLObject wff_elfP(SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = T;
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
        try {
            wff_vars.$wff_violations$.bind(NIL, thread);
            wffP = syntactically_wff_elf_intP(sentence, NIL);
            SubLObject wff_mt = cycl_utilities.reify_when_closed_naut(mt);
            if (NIL == wff_doneP(wffP)) {
                if (NIL == hlmt.hlmt_p(wff_mt)) {
                    sentence = make_ist_sentence(mt, sentence);
                    wff_mt = $$BaseKB;
                }
                if (NIL != wff_utilities.mal_mt_specP(wff_mt)) {
                    wffP = NIL;
                    note_wff_violation(list($INVALID_MT, wff_mt));
                    if (((NIL != provide_wff_suggestionsP()) && (NIL != hlmt.hlmt_p(wff_mt))) && (NIL != fort_types_interface.mt_in_any_mtP(wff_mt))) {
                        note_wff_suggestion(list($ASSERT, make_binary_formula($$isa, wff_mt, $$Microtheory), mt_vars.$mt_mt$.getGlobalValue()));
                    }
                }
            }
            if ((NIL == wff_only_needs_syntactic_checksP()) && (NIL != wffP)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_mt);
                final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (NIL == wff_doneP(wffP)) {
                        final SubLObject _prev_bind_0_$8 = wff_vars.$within_wffP$.currentBinding(thread);
                        try {
                            wff_vars.$within_wffP$.bind(T, thread);
                            wffP = makeBoolean(NIL == mal_precanonicalizationsP(sentence, wff_mt));
                        } finally {
                            wff_vars.$within_wffP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    if (NIL == wff_doneP(wffP)) {
                        final SubLObject _prev_bind_0_$9 = wff_utilities.$check_arityP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$11 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                        try {
                            wff_utilities.$check_arityP$.bind(NIL, thread);
                            wff_utilities.$check_arg_typesP$.bind(wff_check_argsP(), thread);
                            wff_utilities.$check_wff_coherenceP$.bind(wff_check_coherenceP(), thread);
                            wff_utilities.$check_var_typesP$.bind(wff_check_varsP(), thread);
                            final SubLObject _prev_bind_0_$10 = wff_vars.$within_wffP$.currentBinding(thread);
                            try {
                                wff_vars.$within_wffP$.bind(T, thread);
                                wffP = makeBoolean((NIL != wff_elf_intP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread))) && (NIL != wffP));
                            } finally {
                                wff_vars.$within_wffP$.rebind(_prev_bind_0_$10, thread);
                            }
                            if ((NIL == wff_doneP(wffP)) && (NIL != check_var_typesP(sentence, UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$11 = wff_vars.$within_wffP$.currentBinding(thread);
                                try {
                                    wff_vars.$within_wffP$.bind(T, thread);
                                    if (NIL == (NIL != at_vars.$at_assume_conjuncts_independentP$.getDynamicValue(thread) ? at_var_types.formula_var_types_ok_intP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread)) : at_var_types.inter_formula_var_types_ok_intP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), T, T))) {
                                        wffP = NIL;
                                        note_wff_violations(at_utilities.semantic_violations());
                                    }
                                } finally {
                                    wff_vars.$within_wffP$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            if ((NIL == wff_doneP(wffP)) && (NIL != check_wff_coherenceP(sentence, $ELF))) {
                                final SubLObject _prev_bind_0_$12 = wff_vars.$within_wffP$.currentBinding(thread);
                                try {
                                    wff_vars.$within_wffP$.bind(T, thread);
                                    if (NIL == wff_coherentP(sentence, $ELF)) {
                                        wffP = NIL;
                                    }
                                } finally {
                                    wff_vars.$within_wffP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        } finally {
                            wff_utilities.$check_var_typesP$.rebind(_prev_bind_4, thread);
                            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2_$11, thread);
                            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_$10, thread);
                            wff_utilities.$check_arityP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    if ((NIL == wff_doneP(wffP)) && (NIL != check_wff_expansionP(sentence))) {
                        final SubLObject _prev_bind_0_$13 = $within_assert$.currentBinding(thread);
                        try {
                            $within_assert$.bind(NIL, thread);
                            thread.resetMultipleValues();
                            final SubLObject expansion = wff_el_expansion(sentence, mt);
                            final SubLObject mt_$16 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$14 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                            try {
                                at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(makeBoolean(NIL == atomic_sentenceP(sentence)), thread);
                                if ((NIL != expansion) && (!sentence.equal(expansion))) {
                                    final SubLObject _prev_bind_0_$15 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$11 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$12 = wff_vars.$validating_expansionP$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = wff_vars.$wff_expansion_formula$.currentBinding(thread);
                                    try {
                                        wff_vars.$unexpanded_formula$.bind(sentence, thread);
                                        wff_vars.$validate_expansionsP$.bind(NIL, thread);
                                        wff_vars.$validating_expansionP$.bind(T, thread);
                                        wff_vars.$wff_expansion_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_expansion_formula()) ? wff_vars.wff_expansion_formula() : expansion, thread);
                                        if (NIL == wff_elfP(expansion, mt_$16)) {
                                            wffP = NIL;
                                        }
                                    } finally {
                                        wff_vars.$wff_expansion_formula$.rebind(_prev_bind_5, thread);
                                        wff_vars.$validating_expansionP$.rebind(_prev_bind_2_$12, thread);
                                        wff_vars.$validate_expansionsP$.rebind(_prev_bind_1_$11, thread);
                                        wff_vars.$unexpanded_formula$.rebind(_prev_bind_0_$15, thread);
                                    }
                                }
                            } finally {
                                at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0_$14, thread);
                            }
                        } finally {
                            $within_assert$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
                }
            }
            violations = wff_violations();
        } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
        }
        note_wff_violations(violations);
        return wffP;
    }

    /**
     * return the el-expansion of FORMULA, possibly noting encountered errors
     */
    @LispMethod(comment = "return the el-expansion of FORMULA, possibly noting encountered errors")
    public static final SubLObject wff_el_expansion_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expansion = NIL;
                SubLObject new_mt = NIL;
                SubLObject error = NIL;
                try {
                    try {
                        thread.resetMultipleValues();
                        {
                            SubLObject expansion_21 = verbosifier.el_expansion(formula, mt);
                            SubLObject new_mt_22 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            expansion = expansion_21;
                            new_mt = new_mt_22;
                        }
                    } catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $INVALID_EXPANSION);
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $RECURSION_LIMIT_EXCEEDED);
                }
                if (NIL != error) {
                    if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                        com.cyc.cycjava.cycl.wff.note_wff_violation(error);
                    }
                    return NIL;
                }
                return values(expansion, new_mt);
            }
        }
    }

    /**
     * return the el-expansion of FORMULA, possibly noting encountered errors
     */
    @LispMethod(comment = "return the el-expansion of FORMULA, possibly noting encountered errors")
    public static SubLObject wff_el_expansion(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expansion = NIL;
        SubLObject new_mt = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($RECURSION_LIMIT_EXCEEDED);
            try {
                thread.throwStack.push($INVALID_EXPANSION);
                thread.resetMultipleValues();
                final SubLObject expansion_$21 = verbosifier.el_expansion(formula, mt);
                final SubLObject new_mt_$22 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                expansion = expansion_$21;
                new_mt = new_mt_$22;
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $INVALID_EXPANSION);
            } finally {
                thread.throwStack.pop();
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $RECURSION_LIMIT_EXCEEDED);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                note_wff_violation(error);
            }
            return NIL;
        }
        return values(expansion, new_mt);
    }

    /**
     * Is SENTENCE well-formed wrt syntax?
     */
    @LispMethod(comment = "Is SENTENCE well-formed wrt syntax?")
    public static final SubLObject el_wff_syntaxP_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.wff.syntactically_wff_elf_intP(sentence, T);
    }

    /**
     * Is SENTENCE well-formed wrt syntax?
     */
    @LispMethod(comment = "Is SENTENCE well-formed wrt syntax?")
    public static SubLObject el_wff_syntaxP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return syntactically_wff_elf_intP(sentence, T);
    }

    public static final SubLObject wff_elf_intP_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ($$True == sentence) {
            return T;
        } else {
            if ($$False == sentence) {
                return makeBoolean(NIL == within_assertP());
            } else {
                if (NIL != com.cyc.cycjava.cycl.wff.wff_fast_gafP(sentence)) {
                    return T;
                } else {
                    return com.cyc.cycjava.cycl.wff.semantically_wff_elf_intP(sentence, mt);
                }
            }
        }
    }

    public static SubLObject wff_elf_intP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ($$True.eql(sentence)) {
            return T;
        }
        if ($$False.eql(sentence)) {
            return makeBoolean(NIL == within_assertP());
        }
        if (NIL != wff_fast_gafP(sentence)) {
            return T;
        }
        return semantically_wff_elf_intP(sentence, mt);
    }

    public static final SubLObject why_not_semantically_wf_wrt_types_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == cycl_grammar.cycl_sentence_p(sentence)) {
                return cycl_grammar.why_not_cycl_sentence(sentence);
            }
            com.cyc.cycjava.cycl.wff.reset_wff_state();
            {
                SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
                SubLObject _prev_bind_1 = wff_vars.$wff_original_formula$.currentBinding(thread);
                SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                SubLObject _prev_bind_3 = wff_vars.$within_wffP$.currentBinding(thread);
                try {
                    wff_vars.$wff_formula$.bind(sentence, thread);
                    wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? ((SubLObject) (wff_vars.wff_original_formula())) : sentence, thread);
                    at_vars.$accumulating_at_violationsP$.bind(T, thread);
                    wff_vars.$within_wffP$.bind(T, thread);
                    com.cyc.cycjava.cycl.wff.semantically_wff_elf_intP(sentence, mt);
                } finally {
                    wff_vars.$within_wffP$.rebind(_prev_bind_3, thread);
                    at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
                    wff_vars.$wff_original_formula$.rebind(_prev_bind_1, thread);
                    wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
                }
            }
            return nreverse(at_vars.$at_violations$.getDynamicValue(thread));
        }
    }

    public static SubLObject why_not_semantically_wf_wrt_types(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cycl_grammar.cycl_sentence_p(sentence)) {
            return cycl_grammar.why_not_cycl_sentence(sentence);
        }
        reset_wff_state();
        final SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$wff_original_formula$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$within_wffP$.currentBinding(thread);
        try {
            wff_vars.$wff_formula$.bind(sentence, thread);
            wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? wff_vars.wff_original_formula() : sentence, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$within_wffP$.bind(T, thread);
            semantically_wff_elf_intP(sentence, mt);
        } finally {
            wff_vars.$within_wffP$.rebind(_prev_bind_4, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$wff_original_formula$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
        }
        return nreverse(at_vars.$at_violations$.getDynamicValue(thread));
    }

    public static final SubLObject semantically_wff_elf_intP_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_handles.assertion_p(sentence)) {
                return T;
            } else {
                if (NIL != el_atomic_sentenceP(sentence)) {
                    return com.cyc.cycjava.cycl.wff.semantically_wf_literalP(sentence, mt);
                } else {
                    if (NIL != el_non_atomic_sentenceP(sentence)) {
                        return com.cyc.cycjava.cycl.wff.semantically_wf_non_atomic_sentenceP(sentence, mt);
                    } else {
                        if (NIL != cycl_variables.cyc_varP(sentence)) {
                            return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
                        } else {
                            if (NIL != cycl_variables.impermissible_varP(sentence)) {
                                return NIL;
                            } else {
                                return Errors.error($str_alt27$Got_a_sentence_that_was_neither_a, mt, sentence);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject semantically_wff_elf_intP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(sentence)) {
            return T;
        }
        if (NIL != el_atomic_sentenceP(sentence)) {
            return semantically_wf_literalP(sentence, mt);
        }
        if (NIL != el_non_atomic_sentenceP(sentence)) {
            return semantically_wf_non_atomic_sentenceP(sentence, mt);
        }
        if (NIL != cycl_variables.cyc_varP(sentence)) {
            return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
        }
        if (NIL != cycl_variables.impermissible_varP(sentence)) {
            return NIL;
        }
        return Errors.error($str33$Got_a_sentence_that_was_neither_a, mt, sentence);
    }

    /**
     *
     *
     * @return boolean; t iff SENTENCE is a gaf which is well-formed (a quick check before a more involved analysis of well-formedness)
    Returning NIL does not mean that SENTENCE is ill-formed.
     */
    @LispMethod(comment = "@return boolean; t iff SENTENCE is a gaf which is well-formed (a quick check before a more involved analysis of well-formedness)\r\nReturning NIL does not mean that SENTENCE is ill-formed.")
    public static final SubLObject wff_fast_gafP_alt(SubLObject sentence) {
        return makeBoolean(((((NIL != com.cyc.cycjava.cycl.wff.no_wff_semanticsP()) && (NIL != member(cycl_utilities.formula_operator(sentence), $list_alt28, UNPROVIDED, UNPROVIDED))) && (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED))) && (NIL == contains_subformula_p(sentence))) && (NIL != groundP(sentence, symbol_function($sym29$EL_VAR_))));
    }

    /**
     *
     *
     * @return boolean; t iff SENTENCE is a gaf which is well-formed (a quick check before a more involved analysis of well-formedness)
    Returning NIL does not mean that SENTENCE is ill-formed.
     */
    @LispMethod(comment = "@return boolean; t iff SENTENCE is a gaf which is well-formed (a quick check before a more involved analysis of well-formedness)\r\nReturning NIL does not mean that SENTENCE is ill-formed.")
    public static SubLObject wff_fast_gafP(final SubLObject sentence) {
        return makeBoolean(((((NIL != no_wff_semanticsP()) && (NIL != member(cycl_utilities.formula_operator(sentence), $list34, UNPROVIDED, UNPROVIDED))) && (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED))) && (NIL == contains_subformula_p(sentence))) && (NIL != groundP(sentence, symbol_function($sym35$EL_VAR_))));
    }

    /**
     * is el FORMULA wff wrt non-atomic structure
     * (e.g., can it be put into cnf or dnf)?
     */
    @LispMethod(comment = "is el FORMULA wff wrt non-atomic structure\r\n(e.g., can it be put into cnf or dnf)?\nis el FORMULA wff wrt non-atomic structure\n(e.g., can it be put into cnf or dnf)?")
    public static final SubLObject wff_nafP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    try {
                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                        wffP = com.cyc.cycjava.cycl.wff.wffP(formula, $ELF, mt);
                    } finally {
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_1, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    /**
     * is el FORMULA wff wrt non-atomic structure
     * (e.g., can it be put into cnf or dnf)?
     */
    @LispMethod(comment = "is el FORMULA wff wrt non-atomic structure\r\n(e.g., can it be put into cnf or dnf)?\nis el FORMULA wff wrt non-atomic structure\n(e.g., can it be put into cnf or dnf)?")
    public static SubLObject wff_nafP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        try {
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wffP = wffP(formula, $ELF, mt);
        } finally {
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject wff_cnfP_alt(SubLObject cnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = clauses.cnf_p(cnf);
                if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                    if (NIL != com.cyc.cycjava.cycl.wff.mal_fortsP(cnf)) {
                        wffP = NIL;
                        {
                            SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
                            try {
                                wff_vars.$within_wffP$.bind(T, thread);
                                com.cyc.cycjava.cycl.wff.note_wff_violation(list($MAL_FORTS, com.cyc.cycjava.cycl.wff.mal_forts(cnf)));
                            } finally {
                                wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf);
                    SubLObject asent = NIL;
                    for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                        wffP = makeBoolean((NIL != wffP) && (NIL != cycl_grammar.cycl_atomic_sentence_p(asent)));
                    }
                }
                {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf);
                    SubLObject asent = NIL;
                    for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                        wffP = makeBoolean((NIL != wffP) && (NIL != cycl_grammar.cycl_atomic_sentence_p(asent)));
                    }
                }
                {
                    SubLObject wff_mt = cycl_utilities.reify_when_closed_naut(mt);
                    if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                        if (NIL != wff_utilities.mal_mt_specP(wff_mt)) {
                            wffP = NIL;
                            com.cyc.cycjava.cycl.wff.note_wff_violation(list($INVALID_MT, wff_mt));
                        }
                    }
                    if (!((NIL != com.cyc.cycjava.cycl.wff.wff_only_needs_syntactic_checksP()) || (NIL == wffP))) {
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_mt);
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                        {
                                            SubLObject _prev_bind_0_23 = wff_utilities.$check_arityP$.currentBinding(thread);
                                            SubLObject _prev_bind_1_24 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                            SubLObject _prev_bind_2_25 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                            try {
                                                wff_utilities.$check_arityP$.bind(com.cyc.cycjava.cycl.wff.wff_check_arityP(), thread);
                                                wff_utilities.$check_arg_typesP$.bind(com.cyc.cycjava.cycl.wff.wff_check_argsP(), thread);
                                                wff_utilities.$check_wff_coherenceP$.bind(com.cyc.cycjava.cycl.wff.wff_check_coherenceP(), thread);
                                                wff_utilities.$check_var_typesP$.bind(com.cyc.cycjava.cycl.wff.wff_check_varsP(), thread);
                                                {
                                                    SubLObject _prev_bind_0_26 = wff_vars.$within_wffP$.currentBinding(thread);
                                                    try {
                                                        wff_vars.$within_wffP$.bind(T, thread);
                                                        wffP = com.cyc.cycjava.cycl.wff.wff_cnf_intP(cnf);
                                                    } finally {
                                                        wff_vars.$within_wffP$.rebind(_prev_bind_0_26, thread);
                                                    }
                                                }
                                                if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                                    if (NIL != com.cyc.cycjava.cycl.wff.check_var_typesP(cnf, symbol_function($sym30$HL_VAR_))) {
                                                        {
                                                            SubLObject _prev_bind_0_27 = wff_vars.$within_wffP$.currentBinding(thread);
                                                            try {
                                                                wff_vars.$within_wffP$.bind(T, thread);
                                                                if (NIL == (NIL != at_vars.$at_assume_conjuncts_independentP$.getDynamicValue(thread) ? ((SubLObject) (at_var_types.cnf_var_types_okP(cnf, mt, symbol_function($sym30$HL_VAR_)))) : at_var_types.inter_cnf_var_types_okP(cnf, mt, symbol_function($sym30$HL_VAR_)))) {
                                                                    wffP = NIL;
                                                                    com.cyc.cycjava.cycl.wff.note_wff_violations(at_utilities.semantic_violations());
                                                                }
                                                            } finally {
                                                                wff_vars.$within_wffP$.rebind(_prev_bind_0_27, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                                    if (NIL != com.cyc.cycjava.cycl.wff.check_wff_coherenceP(cnf, $CNF)) {
                                                        {
                                                            SubLObject _prev_bind_0_28 = wff_vars.$within_wffP$.currentBinding(thread);
                                                            try {
                                                                wff_vars.$within_wffP$.bind(T, thread);
                                                                wffP = com.cyc.cycjava.cycl.wff.wff_coherentP(cnf, $CNF);
                                                            } finally {
                                                                wff_vars.$within_wffP$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                wff_utilities.$check_var_typesP$.rebind(_prev_bind_3, thread);
                                                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2_25, thread);
                                                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_24, thread);
                                                wff_utilities.$check_arityP$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject wff_cnfP(final SubLObject cnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = clauses.cnf_p(cnf);
        if ((NIL == wff_doneP(wffP)) && (NIL != mal_fortsP(cnf))) {
            wffP = NIL;
            final SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
            try {
                wff_vars.$within_wffP$.bind(T, thread);
                note_wff_violation(list($MAL_FORTS, mal_forts(cnf)));
            } finally {
                wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = clauses.neg_lits(cnf);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            wffP = makeBoolean((NIL != wffP) && (NIL != cycl_grammar.cycl_atomic_sentence_p(asent)));
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.pos_lits(cnf);
        asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            wffP = makeBoolean((NIL != wffP) && (NIL != cycl_grammar.cycl_atomic_sentence_p(asent)));
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        final SubLObject wff_mt = cycl_utilities.reify_when_closed_naut(mt);
        if ((NIL == wff_doneP(wffP)) && (NIL != wff_utilities.mal_mt_specP(wff_mt))) {
            wffP = NIL;
            note_wff_violation(list($INVALID_MT, wff_mt));
        }
        if ((NIL == wff_only_needs_syntactic_checksP()) && (NIL != wffP)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_mt);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == wff_doneP(wffP)) {
                    final SubLObject _prev_bind_0_$23 = wff_utilities.$check_arityP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$24 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$25 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    try {
                        wff_utilities.$check_arityP$.bind(wff_check_arityP(), thread);
                        wff_utilities.$check_arg_typesP$.bind(wff_check_argsP(), thread);
                        wff_utilities.$check_wff_coherenceP$.bind(wff_check_coherenceP(), thread);
                        wff_utilities.$check_var_typesP$.bind(wff_check_varsP(), thread);
                        final SubLObject _prev_bind_0_$24 = wff_vars.$within_wffP$.currentBinding(thread);
                        try {
                            wff_vars.$within_wffP$.bind(T, thread);
                            wffP = wff_cnf_intP(cnf);
                        } finally {
                            wff_vars.$within_wffP$.rebind(_prev_bind_0_$24, thread);
                        }
                        if ((NIL == wff_doneP(wffP)) && (NIL != check_var_typesP(cnf, symbol_function($sym36$HL_VAR_)))) {
                            final SubLObject _prev_bind_0_$25 = wff_vars.$within_wffP$.currentBinding(thread);
                            try {
                                wff_vars.$within_wffP$.bind(T, thread);
                                if (NIL == (NIL != at_vars.$at_assume_conjuncts_independentP$.getDynamicValue(thread) ? at_var_types.cnf_var_types_okP(cnf, mt, symbol_function($sym36$HL_VAR_)) : at_var_types.inter_cnf_var_types_okP(cnf, mt, symbol_function($sym36$HL_VAR_)))) {
                                    wffP = NIL;
                                    note_wff_violations(at_utilities.semantic_violations());
                                }
                            } finally {
                                wff_vars.$within_wffP$.rebind(_prev_bind_0_$25, thread);
                            }
                        }
                        if ((NIL == wff_doneP(wffP)) && (NIL != check_wff_coherenceP(cnf, $CNF))) {
                            final SubLObject _prev_bind_0_$26 = wff_vars.$within_wffP$.currentBinding(thread);
                            try {
                                wff_vars.$within_wffP$.bind(T, thread);
                                wffP = wff_coherentP(cnf, $CNF);
                            } finally {
                                wff_vars.$within_wffP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    } finally {
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2_$25, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_$24, thread);
                        wff_utilities.$check_arityP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            }
        }
        return wffP;
    }

    /**
     * Assumes mt relevance established from outside
     */
    @LispMethod(comment = "Assumes mt relevance established from outside")
    public static final SubLObject wff_cnf_intP_alt(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = T;
                {
                    SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
                    try {
                        at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunct_cnfP(cnf), thread);
                        {
                            SubLObject doneP = NIL;
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = cnf;
                                    SubLObject lit_list = NIL;
                                    for (lit_list = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit_list = csome_list_var.first()) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var_29 = lit_list;
                                                SubLObject lit = NIL;
                                                for (lit = csome_list_var_29.first(); !((NIL != doneP) || (NIL == csome_list_var_29)); csome_list_var_29 = csome_list_var_29.rest() , lit = csome_list_var_29.first()) {
                                                    wffP = makeBoolean((NIL != com.cyc.cycjava.cycl.wff.wff_literalP(lit, UNPROVIDED)) && (NIL != wffP));
                                                    doneP = com.cyc.cycjava.cycl.wff.wff_doneP(wffP);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    /**
     * Assumes mt relevance established from outside
     */
    @LispMethod(comment = "Assumes mt relevance established from outside")
    public static SubLObject wff_cnf_intP(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = T;
        final SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
        try {
            at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunct_cnfP(cnf), thread);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = cnf;
                SubLObject lit_list = NIL;
                lit_list = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL == doneP) {
                        SubLObject csome_list_var_$29 = lit_list;
                        SubLObject lit = NIL;
                        lit = csome_list_var_$29.first();
                        while ((NIL == doneP) && (NIL != csome_list_var_$29)) {
                            wffP = makeBoolean((NIL != wff_literalP(lit, UNPROVIDED)) && (NIL != wffP));
                            doneP = wff_doneP(wffP);
                            csome_list_var_$29 = csome_list_var_$29.rest();
                            lit = csome_list_var_$29.first();
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    lit_list = csome_list_var.first();
                } 
            }
        } finally {
            at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject wff_dnfP_alt(SubLObject dnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return NIL;
    }

    public static SubLObject wff_dnfP(final SubLObject dnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return NIL;
    }

    public static final SubLObject wff_literalP_alt(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject wffP = NIL;
            if (NIL != el_atomic_sentenceP(literal)) {
                wffP = com.cyc.cycjava.cycl.wff.semantically_wf_literalP(literal, mt);
            }
            return wffP;
        }
    }

    public static SubLObject wff_literalP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject wffP = NIL;
        if (NIL != el_atomic_sentenceP(literal)) {
            wffP = semantically_wf_literalP(literal, mt);
        }
        return wffP;
    }

    /**
     *
     *
     * @return boolean; t iff FORMULA is a well-formed CycL query in MT wrt syntax and arity
     */
    @LispMethod(comment = "@return boolean; t iff FORMULA is a well-formed CycL query in MT wrt syntax and arity")
    public static final SubLObject wff_queryP_alt(SubLObject formula, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_ask$.currentBinding(thread);
                    try {
                        $within_ask$.bind(T, thread);
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(hlmt_czer.canonicalize_hlmt(mt));
                            {
                                SubLObject _prev_bind_0_30 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                SubLObject _prev_bind_4 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    wff_utilities.$check_wff_semanticsP$.bind(czer_main.check_wff_semanticsP(mt), thread);
                                    at_vars.$at_check_relator_constraintsP$.bind(wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread), thread);
                                    {
                                        SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                                        SubLObject svs = wff_svs;
                                        {
                                            SubLObject _prev_bind_0_31 = wff_vars.$wff_properties$.currentBinding(thread);
                                            try {
                                                wff_vars.$wff_properties$.bind(svs, thread);
                                                {
                                                    SubLObject svs_var = svs;
                                                    SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                                                    {
                                                        SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                                        final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                                        try {
                                                            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                                            result = com.cyc.cycjava.cycl.wff.el_wff_syntaxP(formula, UNPROVIDED);
                                                        } finally {
                                                            rebind_dynamic_vars(cprogv_var, old_values);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                wff_vars.$wff_properties$.rebind(_prev_bind_0_31, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_4, thread);
                                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_30, thread);
                                }
                            }
                        }
                    } finally {
                        $within_ask$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff FORMULA is a well-formed CycL query in MT wrt syntax and arity
     */
    @LispMethod(comment = "@return boolean; t iff FORMULA is a well-formed CycL query in MT wrt syntax and arity")
    public static SubLObject wff_queryP(final SubLObject formula, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_ask$.currentBinding(thread);
        try {
            $within_ask$.bind(T, thread);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(hlmt_czer.canonicalize_hlmt(mt));
            final SubLObject _prev_bind_0_$30 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                wff_utilities.$check_wff_semanticsP$.bind(czer_main.check_wff_semanticsP(mt), thread);
                at_vars.$at_check_relator_constraintsP$.bind(wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread), thread);
                final SubLObject svs;
                final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
                final SubLObject _prev_bind_0_$31 = wff_vars.$wff_properties$.currentBinding(thread);
                try {
                    wff_vars.$wff_properties$.bind(svs, thread);
                    final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                    final ArrayList old_values = extract_dynamic_values(cprogv_var);
                    try {
                        bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                        SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                        result = el_wff_syntaxP(formula, UNPROVIDED);
                    } finally {
                        rebind_dynamic_vars(cprogv_var, old_values);
                    }
                } finally {
                    wff_vars.$wff_properties$.rebind(_prev_bind_0_$31, thread);
                }
            } finally {
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$30, thread);
            }
        } finally {
            $within_ask$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject wff_check_arityP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != wff_utilities.$check_arityP$.getDynamicValue(thread)) && (NIL == $within_unassert$.getDynamicValue(thread)));
        }
    }

    public static SubLObject wff_check_arityP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != wff_utilities.$check_arityP$.getDynamicValue(thread)) && (NIL == $within_unassert$.getDynamicValue(thread)));
    }

    /**
     *
     *
     * @return booleanp; t iff arity checks should be applied to arg ARGNUM of relation RELATION
     */
    @LispMethod(comment = "@return booleanp; t iff arity checks should be applied to arg ARGNUM of relation RELATION")
    public static final SubLObject arity_tests_applyP_alt(SubLObject relation, SubLObject argnum) {
        return makeBoolean((NIL == czer_utilities.expression_argP(relation, argnum, UNPROVIDED)) || (NIL != czer_utilities.askable_formula_argP(relation, argnum, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp; t iff arity checks should be applied to arg ARGNUM of relation RELATION
     */
    @LispMethod(comment = "@return booleanp; t iff arity checks should be applied to arg ARGNUM of relation RELATION")
    public static SubLObject arity_tests_applyP(final SubLObject relation, final SubLObject argnum) {
        return makeBoolean((NIL == czer_utilities.expression_argP(relation, argnum, UNPROVIDED)) || (NIL != czer_utilities.askable_formula_argP(relation, argnum, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp; t iff arg-type analysis should in fact impose arity checks on nats
     */
    @LispMethod(comment = "@return booleanp; t iff arg-type analysis should in fact impose arity checks on nats")
    public static final SubLObject check_arityP_alt(SubLObject formula_arg0, SubLObject argnum) {
        if (formula_arg0 == UNPROVIDED) {
            formula_arg0 = NIL;
        }
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != wff_utilities.$check_arityP$.getDynamicValue(thread)) && ((!((NIL != forts.fort_p(formula_arg0)) && argnum.isInteger())) || (NIL != com.cyc.cycjava.cycl.wff.arity_tests_applyP(formula_arg0, argnum))));
        }
    }

    /**
     *
     *
     * @return booleanp; t iff arg-type analysis should in fact impose arity checks on nats
     */
    @LispMethod(comment = "@return booleanp; t iff arg-type analysis should in fact impose arity checks on nats")
    public static SubLObject check_arityP(SubLObject formula_arg0, SubLObject argnum) {
        if (formula_arg0 == UNPROVIDED) {
            formula_arg0 = NIL;
        }
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != wff_utilities.$check_arityP$.getDynamicValue(thread)) && (((NIL == forts.fort_p(formula_arg0)) || (!argnum.isInteger())) || (NIL != arity_tests_applyP(formula_arg0, argnum))));
    }

    public static final SubLObject wff_check_argsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != wff_utilities.$check_arg_typesP$.getDynamicValue(thread)) && (NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject wff_check_argsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != wff_utilities.$check_arg_typesP$.getDynamicValue(thread)) && (NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread)));
    }

    public static final SubLObject wff_check_coherenceP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread)) && (NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject wff_check_coherenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread)) && (NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread)));
    }

    public static final SubLObject wff_check_varsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != wff_utilities.$check_var_typesP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.wff.wff_check_argsP()));
        }
    }

    public static SubLObject wff_check_varsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != wff_utilities.$check_var_typesP$.getDynamicValue(thread)) && (NIL != wff_check_argsP()));
    }

    public static final SubLObject inhibit_skolem_assertsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$inhibit_skolem_assertsP$.getDynamicValue(thread);
        }
    }

    public static SubLObject inhibit_skolem_assertsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$inhibit_skolem_assertsP$.getDynamicValue(thread);
    }

    public static final SubLObject enforce_evaluatable_satisfiabilityP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$enforce_evaluatable_satisfiabilityP$.getDynamicValue(thread);
        }
    }

    public static SubLObject enforce_evaluatable_satisfiabilityP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$enforce_evaluatable_satisfiabilityP$.getDynamicValue(thread);
    }

    public static final SubLObject enforce_only_definitional_gafs_in_vocab_mtP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$enforce_only_definitional_gafs_in_vocab_mtP$.getDynamicValue(thread);
        }
    }

    public static SubLObject enforce_only_definitional_gafs_in_vocab_mtP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$enforce_only_definitional_gafs_in_vocab_mtP$.getDynamicValue(thread);
    }

    public static final SubLObject enforce_literal_idiosyncrasiesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$enforce_literal_wff_idiosyncrasiesP$.getDynamicValue(thread);
        }
    }

    public static SubLObject enforce_literal_idiosyncrasiesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$enforce_literal_wff_idiosyncrasiesP$.getDynamicValue(thread);
    }

    public static final SubLObject check_var_typesP_alt(SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym31$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == wff_macros.within_wffP()) {
                if (NIL != wff_utilities.$check_var_typesP$.getDynamicValue(thread)) {
                    return tree_find_if(varP, formula, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_var_typesP(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym37$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == wff_macros.within_wffP()) && (NIL != wff_utilities.$check_var_typesP$.getDynamicValue(thread))) {
            return list_utilities.tree_find_if(varP, formula, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff ALL semantic wff checking is disabled.
     */
    @LispMethod(comment = "@return boolean; t iff ALL semantic wff checking is disabled.")
    public static final SubLObject no_wff_semanticsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((((NIL == wff_utilities.$check_arg_typesP$.getDynamicValue(thread)) && (NIL == wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread))) && (NIL == wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))) && (NIL == wff_utilities.$check_var_typesP$.getDynamicValue(thread))) && (NIL == at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread)));
        }
    }

    /**
     *
     *
     * @return boolean; t iff ALL semantic wff checking is disabled.
     */
    @LispMethod(comment = "@return boolean; t iff ALL semantic wff checking is disabled.")
    public static SubLObject no_wff_semanticsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((((NIL == wff_utilities.$check_arg_typesP$.getDynamicValue(thread)) && (NIL == wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread))) && (NIL == wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))) && (NIL == wff_utilities.$check_var_typesP$.getDynamicValue(thread))) && (NIL == at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread)));
    }

    /**
     *
     *
     * @return boolean; t iff ALL semantic wff checking and arity checking is disabled.
     */
    @LispMethod(comment = "@return boolean; t iff ALL semantic wff checking and arity checking is disabled.")
    public static final SubLObject no_wff_semantics_or_arityP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != com.cyc.cycjava.cycl.wff.no_wff_semanticsP()) && (NIL == wff_utilities.$check_arityP$.getDynamicValue(thread)));
        }
    }

    /**
     *
     *
     * @return boolean; t iff ALL semantic wff checking and arity checking is disabled.
     */
    @LispMethod(comment = "@return boolean; t iff ALL semantic wff checking and arity checking is disabled.")
    public static SubLObject no_wff_semantics_or_arityP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != no_wff_semanticsP()) && (NIL == wff_utilities.$check_arityP$.getDynamicValue(thread)));
    }

    /**
     * Whether the wff-checker can use the CycL grammar instead of the full semantic wff-checker.
     */
    @LispMethod(comment = "Whether the wff-checker can use the CycL grammar instead of the full semantic wff-checker.")
    public static final SubLObject wff_only_needs_syntactic_checksP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != wff_utilities.$use_cycl_grammar_if_semantic_checking_disabledP$.getDynamicValue(thread)) && (NIL == wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))) && (NIL != com.cyc.cycjava.cycl.wff.no_wff_semanticsP()));
        }
    }

    /**
     * Whether the wff-checker can use the CycL grammar instead of the full semantic wff-checker.
     */
    @LispMethod(comment = "Whether the wff-checker can use the CycL grammar instead of the full semantic wff-checker.")
    public static SubLObject wff_only_needs_syntactic_checksP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != wff_utilities.$use_cycl_grammar_if_semantic_checking_disabledP$.getDynamicValue(thread)) && (NIL == wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))) && (NIL != no_wff_semanticsP()));
    }

    public static final SubLObject check_wff_expansionP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == wff_macros.within_wffP()) {
                if (NIL != wff_vars.$validate_expansionsP$.getDynamicValue(thread)) {
                    return verbosifier.el_expandible_subformulaP(formula, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_wff_expansionP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == wff_macros.within_wffP()) && (NIL != wff_vars.$validate_expansionsP$.getDynamicValue(thread))) {
            return verbosifier.el_expandible_subformulaP(formula, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject check_wff_coherenceP_alt(SubLObject formula, SubLObject form) {
        if (form == UNPROVIDED) {
            form = $ELF;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == wff_macros.within_wffP()) {
                if (NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread)) {
                    {
                        SubLObject pcase_var = form;
                        if (pcase_var.eql($ELF)) {
                            return makeBoolean(NIL == el_atomic_sentenceP(formula));
                        } else {
                            if (pcase_var.eql($CNF)) {
                                return makeBoolean(NIL == clauses.gaf_cnfP(formula));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_wff_coherenceP(final SubLObject formula, SubLObject form) {
        if (form == UNPROVIDED) {
            form = $ELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == wff_macros.within_wffP()) && (NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))) {
            final SubLObject pcase_var = form;
            if (pcase_var.eql($ELF)) {
                return makeBoolean(NIL == el_atomic_sentenceP(formula));
            }
            if (pcase_var.eql($CNF)) {
                return makeBoolean(NIL == clauses.gaf_cnfP(formula));
            }
        }
        return NIL;
    }

    public static final SubLObject wff_doneP_alt(SubLObject wffP) {
        if (wffP == UNPROVIDED) {
            wffP = T;
        }
        if (NIL == com.cyc.cycjava.cycl.wff.accumulating_el_violationsP()) {
            return makeBoolean((NIL == wffP) || (NIL != com.cyc.cycjava.cycl.wff.wff_violations()));
        }
        return NIL;
    }

    public static SubLObject wff_doneP(SubLObject wffP) {
        if (wffP == UNPROVIDED) {
            wffP = T;
        }
        if (NIL == accumulating_el_violationsP()) {
            return makeBoolean((NIL == wffP) || (NIL != wff_violations()));
        }
        return NIL;
    }

    public static final SubLObject mal_fortsP_alt(SubLObject expression) {
        return cycl_utilities.expression_find_if(symbol_function(NON_WF_FORT_P), expression, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mal_fortsP(final SubLObject expression) {
        return cycl_utilities.expression_find_if(symbol_function(NON_WF_FORT_P), expression, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mal_forts_alt(SubLObject expression) {
        return cycl_utilities.expression_gather(expression, symbol_function(NON_WF_FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mal_forts(final SubLObject expression) {
        return cycl_utilities.expression_gather(expression, symbol_function(NON_WF_FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff LITERAL is valid at the top level during backward inference.
     */
    @LispMethod(comment = "@return boolean; t iff LITERAL is valid at the top level during backward inference.")
    public static final SubLObject valid_top_level_backward_inference_literalP_alt(SubLObject literal) {
        return T;
    }

    /**
     *
     *
     * @return boolean; t iff LITERAL is valid at the top level during backward inference.
     */
    @LispMethod(comment = "@return boolean; t iff LITERAL is valid at the top level during backward inference.")
    public static SubLObject valid_top_level_backward_inference_literalP(final SubLObject literal) {
        return T;
    }

    /**
     *
     *
     * @return boolean; t iff LITERAL is valid as an intermediate step during backward inference.
     */
    @LispMethod(comment = "@return boolean; t iff LITERAL is valid as an intermediate step during backward inference.")
    public static final SubLObject valid_intermediate_backward_inference_literalP_alt(SubLObject literal) {
        return makeBoolean((NIL != subformulas_wf_wrt_sequence_varsP(literal)) && (NIL != arg_type.semantically_valid_literalP(literal, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff LITERAL is valid as an intermediate step during backward inference.
     */
    @LispMethod(comment = "@return boolean; t iff LITERAL is valid as an intermediate step during backward inference.")
    public static SubLObject valid_intermediate_backward_inference_literalP(final SubLObject literal) {
        return makeBoolean((NIL != subformulas_wf_wrt_sequence_varsP(literal)) && (NIL != arg_type.semantically_valid_literalP(literal, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff LITERAL is valid at the top level during forward inference.
     */
    @LispMethod(comment = "@return boolean; t iff LITERAL is valid at the top level during forward inference.")
    public static final SubLObject valid_top_level_forward_inference_literalP_alt(SubLObject literal) {
        return T;
    }

    /**
     *
     *
     * @return boolean; t iff LITERAL is valid at the top level during forward inference.
     */
    @LispMethod(comment = "@return boolean; t iff LITERAL is valid at the top level during forward inference.")
    public static SubLObject valid_top_level_forward_inference_literalP(final SubLObject literal) {
        return T;
    }

    /**
     *
     *
     * @return boolean; t iff LITERAL is valid as an intermediate step during forward inference.
     */
    @LispMethod(comment = "@return boolean; t iff LITERAL is valid as an intermediate step during forward inference.")
    public static final SubLObject valid_intermediate_forward_inference_literalP_alt(SubLObject literal) {
        return T;
    }

    /**
     *
     *
     * @return boolean; t iff LITERAL is valid as an intermediate step during forward inference.
     */
    @LispMethod(comment = "@return boolean; t iff LITERAL is valid as an intermediate step during forward inference.")
    public static SubLObject valid_intermediate_forward_inference_literalP(final SubLObject literal) {
        return T;
    }

    public static final SubLObject semantically_wf_literalP_alt(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != wff_macros.within_wffP()) {
                return com.cyc.cycjava.cycl.wff.memoized_semantically_wf_literalP(literal, mt, com.cyc.cycjava.cycl.wff.no_wff_semanticsP(), wff_utilities.check_assertible_literalP());
            } else {
                {
                    SubLObject wffP = NIL;
                    {
                        SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
                        try {
                            wff_vars.$wff_violations$.bind(NIL, thread);
                            wffP = com.cyc.cycjava.cycl.wff.memoized_syntactically_wf_formulaP(literal);
                            if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                                wffP = com.cyc.cycjava.cycl.wff.memoized_semantically_wf_literalP(literal, mt, com.cyc.cycjava.cycl.wff.no_wff_semanticsP(), wff_utilities.check_assertible_literalP());
                            }
                        } finally {
                            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return wffP;
                }
            }
        }
    }

    public static SubLObject semantically_wf_literalP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != wff_macros.within_wffP()) {
            return memoized_semantically_wf_literalP(literal, mt, no_wff_semanticsP(), wff_utilities.check_assertible_literalP());
        }
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
        try {
            wff_vars.$wff_violations$.bind(NIL, thread);
            wffP = memoized_syntactically_wf_formulaP(literal);
            if (NIL == wff_doneP(wffP)) {
                wffP = memoized_semantically_wf_literalP(literal, mt, no_wff_semanticsP(), wff_utilities.check_assertible_literalP());
            }
        } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject memoized_syntactically_wf_formulaP_internal_alt(SubLObject formula) {
        return makeBoolean((NIL != wf_wrt_sequence_varsP(formula)) && (NIL == com.cyc.cycjava.cycl.wff.mal_arityP(formula)));
    }

    public static SubLObject memoized_syntactically_wf_formulaP_internal(final SubLObject formula) {
        return makeBoolean((NIL != wf_wrt_sequence_varsP(formula)) && (NIL == mal_arityP(formula)));
    }

    public static final SubLObject memoized_syntactically_wf_formulaP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.wff.memoized_syntactically_wf_formulaP_internal(formula);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym33$MEMOIZED_SYNTACTICALLY_WF_FORMULA_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym33$MEMOIZED_SYNTACTICALLY_WF_FORMULA_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym33$MEMOIZED_SYNTACTICALLY_WF_FORMULA_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, $kw34$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw34$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wff.memoized_syntactically_wf_formulaP_internal(formula)));
                        memoization_state.caching_state_put(caching_state, formula, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject memoized_syntactically_wf_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_syntactically_wf_formulaP_internal(formula);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym39$MEMOIZED_SYNTACTICALLY_WF_FORMULA_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym39$MEMOIZED_SYNTACTICALLY_WF_FORMULA_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym39$MEMOIZED_SYNTACTICALLY_WF_FORMULA_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_syntactically_wf_formulaP_internal(formula)));
            memoization_state.caching_state_put(caching_state, formula, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject semantically_wf_literal_in_any_mtP_alt(SubLObject literal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        wffP = com.cyc.cycjava.cycl.wff.semantically_wf_literalP(literal, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject semantically_wf_literal_in_any_mtP(final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            wffP = semantically_wf_literalP(literal, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject memoized_semantically_wf_literalP_internal_alt(SubLObject literal, SubLObject mt, SubLObject no_semanticsP, SubLObject check_assertibleP) {
        if ((NIL == wff_utilities.check_assertible_literalP()) || (NIL != com.cyc.cycjava.cycl.wff.assertible_literalP(literal, mt))) {
            return makeBoolean((NIL != com.cyc.cycjava.cycl.wff.semantically_wf_sentenceP(literal, mt)) && (NIL != com.cyc.cycjava.cycl.wff.wff_wrt_literal_idiosyncrasiesP(literal, mt)));
        }
        return NIL;
    }

    public static SubLObject memoized_semantically_wf_literalP_internal(final SubLObject literal, final SubLObject mt, final SubLObject no_semanticsP, final SubLObject check_assertibleP) {
        if ((NIL == wff_utilities.check_assertible_literalP()) || (NIL != assertible_literalP(literal, mt))) {
            return makeBoolean((NIL != semantically_wf_sentenceP(literal, mt)) && (NIL != wff_wrt_literal_idiosyncrasiesP(literal, mt)));
        }
        return NIL;
    }

    public static final SubLObject memoized_semantically_wf_literalP_alt(SubLObject literal, SubLObject mt, SubLObject no_semanticsP, SubLObject check_assertibleP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.wff.memoized_semantically_wf_literalP_internal(literal, mt, no_semanticsP, check_assertibleP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(literal, mt, no_semanticsP, check_assertibleP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (literal.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (no_semanticsP.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && check_assertibleP.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wff.memoized_semantically_wf_literalP_internal(literal, mt, no_semanticsP, check_assertibleP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(literal, mt, no_semanticsP, check_assertibleP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject memoized_semantically_wf_literalP(final SubLObject literal, final SubLObject mt, final SubLObject no_semanticsP, final SubLObject check_assertibleP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_semantically_wf_literalP_internal(literal, mt, no_semanticsP, check_assertibleP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym40$MEMOIZED_SEMANTICALLY_WF_LITERAL_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym40$MEMOIZED_SEMANTICALLY_WF_LITERAL_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym40$MEMOIZED_SEMANTICALLY_WF_LITERAL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(literal, mt, no_semanticsP, check_assertibleP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (literal.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (no_semanticsP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && check_assertibleP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_semantically_wf_literalP_internal(literal, mt, no_semanticsP, check_assertibleP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(literal, mt, no_semanticsP, check_assertibleP));
        return memoization_state.caching_results(results3);
    }

    /**
     * applies to top-level and sub-formula literals
     */
    @LispMethod(comment = "applies to top-level and sub-formula literals")
    public static final SubLObject assertible_literalP_alt(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unassertibleP = NIL;
                if (NIL != com.cyc.cycjava.cycl.wff.inhibit_skolem_assertsP()) {
                    if (NIL == com.cyc.cycjava.cycl.wff.pred_of_editable_skolem_gafP(literal_predicate(literal, UNPROVIDED))) {
                        if (NIL != com.cyc.cycjava.cycl.wff.non_editable_skolem_referenceP(literal)) {
                            unassertibleP = T;
                            com.cyc.cycjava.cycl.wff.note_wff_violation(list($RESTRICTED_SKOLEM_ASSERTION, literal));
                        }
                    }
                }
                if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(makeBoolean(NIL == unassertibleP))) {
                    if (NIL != com.cyc.cycjava.cycl.wff.enforce_evaluatable_satisfiabilityP()) {
                        if (NIL != closedP(literal, symbol_function($sym31$CYC_VAR_))) {
                            if (NIL != relation_evaluation.evaluatable_predicateP(literal_predicate(literal, UNPROVIDED), mt)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_answer = relation_evaluation.cyc_evaluate(literal);
                                    SubLObject validP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != validP) {
                                        if (!((NIL != v_answer) && (v_answer != $$False))) {
                                            unassertibleP = T;
                                            com.cyc.cycjava.cycl.wff.note_wff_violation(list($EVALUATABLE_LITERAL_FALSE, literal, mt));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(makeBoolean(NIL == unassertibleP))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject unwrapped_literal = czer_utilities.unwrap_if_ist_permissive(literal, mt);
                        SubLObject unwrapped_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject decontextualized_literalP = kb_accessors.decontextualized_literalP(unwrapped_literal);
                            SubLObject decontextualized_mt = NIL;
                            if (NIL != decontextualized_literalP) {
                                decontextualized_mt = kb_accessors.decontextualized_literal_convention_mt(unwrapped_literal);
                                if (NIL == kb_accessors.mt_matches_convention_mtP(unwrapped_mt, decontextualized_mt)) {
                                    unwrapped_mt = decontextualized_mt;
                                }
                            }
                            if (!((NIL != at_vars.$within_functionP$.getDynamicValue(thread)) || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread)))) {
                                if ((NIL != unwrapped_mt) && (NIL != kb_accessors.not_assertible_mtP(unwrapped_mt))) {
                                    unassertibleP = T;
                                    com.cyc.cycjava.cycl.wff.note_wff_violation(list($RESTRICTED_MT_ASSERTION, unwrapped_mt, unwrapped_literal, decontextualized_literalP));
                                }
                            }
                        }
                    }
                }
                if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(makeBoolean(NIL == unassertibleP))) {
                    if (!((((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))) || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread))) || (NIL == closedP(literal, UNPROVIDED)))) {
                        if (NIL != kb_accessors.not_assertible_predicateP(literal_predicate(literal, UNPROVIDED), mt)) {
                            unassertibleP = T;
                            com.cyc.cycjava.cycl.wff.note_wff_violation(list($RESTRICTED_PREDICATE_ASSERTION, literal, mt));
                        } else {
                            if ((NIL != isa_litP(literal)) && (NIL != kb_accessors.not_assertible_collectionP(literal_arg2(literal, UNPROVIDED), mt))) {
                                unassertibleP = T;
                                com.cyc.cycjava.cycl.wff.note_wff_violation(list($RESTRICTED_COLLECTION_ASSERTION, literal, mt));
                            }
                        }
                    }
                }
                if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(makeBoolean(NIL == unassertibleP))) {
                    if (!(((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))) || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread)))) {
                        if ((NIL != wff_vars.$reject_sbhl_conflictsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.wff.sbhl_literal_conflictP(literal, mt))) {
                            unassertibleP = T;
                        }
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.wff.enforce_only_definitional_gafs_in_vocab_mtP()) {
                    if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(makeBoolean(NIL == unassertibleP))) {
                        if (!((((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))) || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread))) || (NIL == closedP(literal, UNPROVIDED)))) {
                            {
                                SubLObject assert_mt = (NIL != mt) ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread);
                                SubLObject assert_pred = literal_predicate(literal, UNPROVIDED);
                                if (((NIL != hlmt.hlmt_p(assert_mt)) && (NIL != forts.fort_p(assert_pred))) && (NIL != isa.isaP(assert_mt, $$VocabularyMicrotheory, UNPROVIDED, UNPROVIDED))) {
                                    if (!((NIL != com.cyc.cycjava.cycl.wff.definitional_predP(assert_pred, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.wff.meta_sentence_referencing_defn_gaf_in_mtP(literal, mt)))) {
                                        unassertibleP = T;
                                        com.cyc.cycjava.cycl.wff.note_wff_violation(list($NON_DEFN_PRED_IN_VOCAB_MT, literal, mt));
                                    }
                                }
                            }
                        }
                    }
                }
                return makeBoolean(NIL == unassertibleP);
            }
        }
    }

    /**
     * applies to top-level and sub-formula literals
     */
    @LispMethod(comment = "applies to top-level and sub-formula literals")
    public static SubLObject assertible_literalP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unassertibleP = NIL;
        if (((NIL != inhibit_skolem_assertsP()) && (NIL == pred_of_editable_skolem_gafP(literal_predicate(literal, UNPROVIDED)))) && (NIL != non_editable_skolem_referenceP(literal))) {
            unassertibleP = T;
            note_wff_violation(list($RESTRICTED_SKOLEM_ASSERTION, literal));
        }
        if ((((NIL == wff_doneP(makeBoolean(NIL == unassertibleP))) && (NIL != enforce_evaluatable_satisfiabilityP())) && (NIL != closedP(literal, symbol_function($sym37$CYC_VAR_)))) && (NIL != relation_evaluation.evaluatable_predicateP(literal_predicate(literal, UNPROVIDED), mt))) {
            thread.resetMultipleValues();
            final SubLObject v_answer = relation_evaluation.cyc_evaluate(literal);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != validP) && ((NIL == v_answer) || v_answer.eql($$False))) {
                unassertibleP = T;
                note_wff_violation(list($EVALUATABLE_LITERAL_FALSE, literal, mt));
            }
        }
        if (NIL == wff_doneP(makeBoolean(NIL == unassertibleP))) {
            thread.resetMultipleValues();
            final SubLObject unwrapped_literal = czer_utilities.unwrap_if_ist_permissive(literal, mt);
            SubLObject unwrapped_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject decontextualized_literalP = kb_accessors.decontextualized_literalP(unwrapped_literal);
            SubLObject decontextualized_mt = NIL;
            if (NIL != decontextualized_literalP) {
                decontextualized_mt = kb_accessors.decontextualized_literal_convention_mt(unwrapped_literal);
                if (NIL == kb_accessors.mt_matches_convention_mtP(unwrapped_mt, decontextualized_mt)) {
                    unwrapped_mt = decontextualized_mt;
                }
            }
            if ((((NIL == at_vars.$within_functionP$.getDynamicValue(thread)) && (NIL == at_vars.$within_predicateP$.getDynamicValue(thread))) && (NIL != unwrapped_mt)) && (NIL != kb_accessors.not_assertible_mtP(unwrapped_mt))) {
                unassertibleP = T;
                note_wff_violation(list($RESTRICTED_MT_ASSERTION, unwrapped_mt, unwrapped_literal, decontextualized_literalP));
            }
        }
        if (((((NIL == wff_doneP(makeBoolean(NIL == unassertibleP))) && (NIL == at_vars.$appraising_disjunctP$.getDynamicValue(thread))) && (NIL == at_vars.$within_functionP$.getDynamicValue(thread))) && (NIL == at_vars.$within_predicateP$.getDynamicValue(thread))) && (NIL != closedP(literal, UNPROVIDED))) {
            if (NIL != kb_accessors.not_assertible_predicateP(literal_predicate(literal, UNPROVIDED), mt)) {
                unassertibleP = T;
                note_wff_violation(list($RESTRICTED_PREDICATE_ASSERTION, literal, mt));
            } else
                if ((NIL != isa_litP(literal)) && (NIL != kb_accessors.not_assertible_collectionP(literal_arg2(literal, UNPROVIDED), mt))) {
                    unassertibleP = T;
                    note_wff_violation(list($RESTRICTED_COLLECTION_ASSERTION, literal, mt));
                } else
                    if ((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL != contains_a_reifiable_but_not_forward_reifiable_natP(literal, mt))) {
                        unassertibleP = T;
                        note_wff_violation(list($REIFIABLE_BUT_NOT_FORWARD_REIFIABLE, literal, mt));
                    }


        }
        if ((((((NIL == wff_doneP(makeBoolean(NIL == unassertibleP))) && (NIL == at_vars.$appraising_disjunctP$.getDynamicValue(thread))) && (NIL == at_vars.$within_functionP$.getDynamicValue(thread))) && (NIL == at_vars.$within_predicateP$.getDynamicValue(thread))) && (NIL != wff_vars.$reject_sbhl_conflictsP$.getDynamicValue(thread))) && (NIL != sbhlXdefns_literal_conflictP(literal, mt))) {
            unassertibleP = T;
        }
        if ((((((NIL != enforce_only_definitional_gafs_in_vocab_mtP()) && (NIL == wff_doneP(makeBoolean(NIL == unassertibleP)))) && (NIL == at_vars.$appraising_disjunctP$.getDynamicValue(thread))) && (NIL == at_vars.$within_functionP$.getDynamicValue(thread))) && (NIL == at_vars.$within_predicateP$.getDynamicValue(thread))) && (NIL != closedP(literal, UNPROVIDED))) {
            final SubLObject assert_mt = (NIL != mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread);
            final SubLObject assert_pred = literal_predicate(literal, UNPROVIDED);
            if (((((NIL != hlmt.hlmt_p(assert_mt)) && (NIL != forts.fort_p(assert_pred))) && (NIL != isa.isaP(assert_mt, $$VocabularyMicrotheory, UNPROVIDED, UNPROVIDED))) && (NIL == definitional_predP(assert_pred, UNPROVIDED))) && (NIL == meta_sentence_referencing_defn_gaf_in_mtP(literal, mt))) {
                unassertibleP = T;
                note_wff_violation(list($NON_DEFN_PRED_IN_VOCAB_MT, literal, mt));
            }
        }
        return makeBoolean(NIL == unassertibleP);
    }

    public static SubLObject contains_a_reifiable_but_not_forward_reifiable_natP(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind($sym49$OPAQUE_ARG_WRT_QUOTING_, thread);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$32 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                return cycl_utilities.expression_find_if($sym50$REIFIABLE_BUT_NOT_FORWARD_REIFIABLE_NAT_, literal, NIL, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$32, thread);
            }
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject reifiable_but_not_forward_reifiable_natP(final SubLObject v_object) {
        return makeBoolean((((NIL != possibly_naut_p(v_object)) && (NIL != czer_utilities.reifiable_functorP(cycl_utilities.nat_functor(v_object), UNPROVIDED))) && (NIL == czer_main.forward_inference_reifiable_functionP(cycl_utilities.nat_functor(v_object), UNPROVIDED))) && (NIL == narts_high.find_nart(v_object)));
    }

    public static final SubLObject meta_sentence_referencing_defn_gaf_in_mtP_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject meta_pred = literal_arg0(literal, UNPROVIDED);
            SubLObject argnum = ZERO_INTEGER;
            SubLObject ouiP = NIL;
            if (NIL == ouiP) {
                {
                    SubLObject csome_list_var = literal_args(literal, $IGNORE);
                    SubLObject arg = NIL;
                    for (arg = csome_list_var.first(); !((NIL != ouiP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL != czer_utilities.possibly_assertion_argP(meta_pred, argnum, UNPROVIDED)) {
                            if (NIL == ouiP) {
                                {
                                    SubLObject csome_list_var_32 = czer_meta.find_assertions_cycl(arg, mt);
                                    SubLObject assertion = NIL;
                                    for (assertion = csome_list_var_32.first(); !((NIL != ouiP) || (NIL == csome_list_var_32)); csome_list_var_32 = csome_list_var_32.rest() , assertion = csome_list_var_32.first()) {
                                        if ((NIL != assertions_high.gaf_assertionP(assertion)) && mt.eql(assertions_high.assertion_mt(assertion))) {
                                            {
                                                SubLObject pred = assertions_high.gaf_arg0(assertion);
                                                if (NIL != forts.fort_p(pred)) {
                                                    ouiP = com.cyc.cycjava.cycl.wff.definitional_predP(pred, UNPROVIDED);
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
            return ouiP;
        }
    }

    public static SubLObject meta_sentence_referencing_defn_gaf_in_mtP(final SubLObject literal, final SubLObject mt) {
        final SubLObject meta_pred = literal_arg0(literal, UNPROVIDED);
        SubLObject argnum = ZERO_INTEGER;
        SubLObject ouiP = NIL;
        if (NIL == ouiP) {
            SubLObject csome_list_var = literal_args(literal, $IGNORE);
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ((NIL == ouiP) && (NIL != csome_list_var)) {
                argnum = add(argnum, ONE_INTEGER);
                if ((NIL != czer_utilities.possibly_assertion_argP(meta_pred, argnum, UNPROVIDED)) && (NIL == ouiP)) {
                    SubLObject csome_list_var_$33 = czer_meta.find_assertions_cycl(arg, mt);
                    SubLObject assertion = NIL;
                    assertion = csome_list_var_$33.first();
                    while ((NIL == ouiP) && (NIL != csome_list_var_$33)) {
                        if ((NIL != assertions_high.gaf_assertionP(assertion)) && mt.eql(assertions_high.assertion_mt(assertion))) {
                            final SubLObject pred = assertions_high.gaf_arg0(assertion);
                            if (NIL != forts.fort_p(pred)) {
                                ouiP = definitional_predP(pred, UNPROVIDED);
                            }
                        }
                        csome_list_var_$33 = csome_list_var_$33.rest();
                        assertion = csome_list_var_$33.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            } 
        }
        return ouiP;
    }

    /**
     *
     *
     * @return boolean; t iff FORT isa #$DefinitionalPredicate
     */
    @LispMethod(comment = "@return boolean; t iff FORT isa #$DefinitionalPredicate")
    public static final SubLObject definitional_predP_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$DefaultVocabConstraintMt;
        }
        return isa.isa_anyP(fort, $list_alt45, mt, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff FORT isa #$DefinitionalPredicate
     */
    @LispMethod(comment = "@return boolean; t iff FORT isa #$DefinitionalPredicate")
    public static SubLObject definitional_predP(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$DefaultVocabConstraintMt;
        }
        return isa.isa_anyP(fort, $list53, mt, UNPROVIDED);
    }

    public static SubLObject sbhlXdefns_literal_conflictP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject conflictP = NIL;
        if (NIL != czer_utilities.within_negationP()) {
            if (NIL != sbhlXdefns_trueP(literal, mt)) {
                note_wff_violation(list($CONFLICT_ASSERTING_FALSE_SBHL, literal, mt));
                conflictP = T;
            }
        } else
            if (NIL != sbhlXdefns_falseP(literal, mt)) {
                note_wff_violation(list($CONFLICT_ASSERTING_TRUE_SBHL, literal, mt));
                conflictP = T;
            }

        return conflictP;
    }

    public static SubLObject sbhlXdefns_trueP(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = literal_predicate(asent, UNPROVIDED);
        final SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
        if ((NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) && (NIL != term.el_fort_p(arg2))) {
            return makeBoolean((NIL != sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), arg1, arg2, mt, UNPROVIDED)) || ((((NIL != $wff_non_fort_isa_support_enabledP$.getDynamicValue(thread)) && $$isa.eql(pred)) && (NIL != forts.non_fort_p(arg1))) && (NIL != at_defns.quiet_has_typeP(arg1, arg2, mt))));
        }
        return NIL;
    }

    public static SubLObject sbhlXdefns_falseP(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = literal_predicate(asent, UNPROVIDED);
        final SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
        if ((NIL != kb_utilities.kbeq(pred, $$genls)) && (NIL != equals.equalsP(arg1, arg2, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if ((NIL == sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) || (NIL == term.el_fort_p(arg2))) {
            return NIL;
        }
        final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            return sbhl_search_methods.sbhl_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED);
        }
        return makeBoolean((NIL != sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED)) || ((((NIL != $wff_non_fort_isa_support_enabledP$.getDynamicValue(thread)) && $$isa.eql(pred)) && (NIL != forts.non_fort_p(arg1))) && (NIL != at_defns.quiet_not_has_typeP(arg1, arg2, mt))));
    }

    /**
     *
     *
     * @return term or nil; term is object or a component of object that
    is returned iff that component has a variable within the scope of
    a skolem as a functor.
     */
    @LispMethod(comment = "@return term or nil; term is object or a component of object that\r\nis returned iff that component has a variable within the scope of\r\na skolem as a functor.")
    public static final SubLObject non_editable_skolem_referenceP_alt(SubLObject v_object) {
        if ((NIL != constant_p(v_object)) && (NIL != term.fast_reified_skolemP(v_object))) {
            return v_object;
        } else {
            if (NIL != el_formula_p(v_object)) {
                if (NIL != cycl_utilities.formula_find_if($sym48$FAST_REIFIED_SKOLEM_, v_object, T, UNPROVIDED)) {
                    if (NIL != term.fast_reified_skolemP(cycl_utilities.nat_functor(v_object))) {
                        if (NIL != closedP(v_object, symbol_function($sym31$CYC_VAR_))) {
                            {
                                SubLObject relation = cycl_utilities.formula_arg0(v_object);
                                SubLObject ans = NIL;
                                SubLObject argnum = NIL;
                                SubLObject args = NIL;
                                SubLObject arg = NIL;
                                for (argnum = ZERO_INTEGER, args = cycl_utilities.nat_args(v_object, UNPROVIDED), arg = args.first(); args.rest().isCons(); argnum = add(ONE_INTEGER, argnum) , args = args.rest() , arg = args.first()) {
                                    if (!(((NIL != czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, UNPROVIDED)) || (NIL != kb_accessors.quoted_argumentP(relation, argnum))) || (NIL != czer_utilities.assertion_argP(relation, argnum, UNPROVIDED)))) {
                                        ans = com.cyc.cycjava.cycl.wff.non_editable_skolem_referenceP(arg);
                                        if (NIL != ans) {
                                            return ans;
                                        }
                                    }
                                }
                                if (!(((NIL != czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, UNPROVIDED)) || (NIL != kb_accessors.quoted_argumentP(relation, argnum))) || (NIL != czer_utilities.assertion_argP(relation, argnum, UNPROVIDED)))) {
                                    ans = com.cyc.cycjava.cycl.wff.non_editable_skolem_referenceP(args.first());
                                    if (NIL != ans) {
                                        return ans;
                                    }
                                    if (NIL != args.rest()) {
                                        ans = com.cyc.cycjava.cycl.wff.non_editable_skolem_referenceP(args.rest());
                                    }
                                }
                                return ans;
                            }
                        } else {
                            return v_object;
                        }
                    } else {
                        {
                            SubLObject relation = cycl_utilities.formula_arg0(v_object);
                            SubLObject ans = NIL;
                            SubLObject argnum = NIL;
                            SubLObject args = NIL;
                            SubLObject arg = NIL;
                            for (argnum = ZERO_INTEGER, args = v_object, arg = args.first(); args.rest().isCons(); argnum = add(ONE_INTEGER, argnum) , args = args.rest() , arg = args.first()) {
                                if (!(((NIL != czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, UNPROVIDED)) || (NIL != kb_accessors.quoted_argumentP(relation, argnum))) || (NIL != czer_utilities.assertion_argP(relation, argnum, UNPROVIDED)))) {
                                    ans = com.cyc.cycjava.cycl.wff.non_editable_skolem_referenceP(arg);
                                    if (NIL != ans) {
                                        return ans;
                                    }
                                }
                            }
                            if (!(((NIL != czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, UNPROVIDED)) || (NIL != kb_accessors.quoted_argumentP(relation, argnum))) || (NIL != czer_utilities.assertion_argP(relation, argnum, UNPROVIDED)))) {
                                ans = com.cyc.cycjava.cycl.wff.non_editable_skolem_referenceP(args.first());
                                if (NIL != ans) {
                                    return ans;
                                }
                                if (NIL != args.rest()) {
                                    ans = com.cyc.cycjava.cycl.wff.non_editable_skolem_referenceP(args.rest());
                                }
                            }
                            return ans;
                        }
                    }
                }
            } else {
                if (NIL != v_object) {
                    return com.cyc.cycjava.cycl.wff.non_editable_skolem_referenceP(function_terms.term_of_unit(v_object));
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return term or nil; term is object or a component of object that
    is returned iff that component has a variable within the scope of
    a skolem as a functor.
     */
    @LispMethod(comment = "@return term or nil; term is object or a component of object that\r\nis returned iff that component has a variable within the scope of\r\na skolem as a functor.")
    public static SubLObject non_editable_skolem_referenceP(final SubLObject v_object) {
        if ((NIL != constant_p(v_object)) && (NIL != term.fast_reified_skolemP(v_object))) {
            return v_object;
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cycl_utilities.formula_find_if($sym57$FAST_REIFIED_SKOLEM_, v_object, T, UNPROVIDED)) {
                if (NIL == term.fast_reified_skolemP(cycl_utilities.nat_functor(v_object))) {
                    final SubLObject relation = cycl_utilities.formula_arg0(v_object);
                    SubLObject ans = NIL;
                    SubLObject argnum = NIL;
                    SubLObject args = NIL;
                    SubLObject arg = NIL;
                    argnum = ZERO_INTEGER;
                    args = v_object;
                    arg = args.first();
                    while (args.rest().isCons()) {
                        if (((NIL == czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, UNPROVIDED)) && (NIL == kb_accessors.quoted_argumentP(relation, argnum))) && (NIL == czer_utilities.assertion_argP(relation, argnum, UNPROVIDED))) {
                            ans = non_editable_skolem_referenceP(arg);
                            if (NIL != ans) {
                                return ans;
                            }
                        }
                        argnum = add(ONE_INTEGER, argnum);
                        args = args.rest();
                        arg = args.first();
                    } 
                    if (((NIL == czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, UNPROVIDED)) && (NIL == kb_accessors.quoted_argumentP(relation, argnum))) && (NIL == czer_utilities.assertion_argP(relation, argnum, UNPROVIDED))) {
                        ans = non_editable_skolem_referenceP(args.first());
                        if (NIL != ans) {
                            return ans;
                        }
                        if (NIL != args.rest()) {
                            ans = non_editable_skolem_referenceP(args.rest());
                        }
                    }
                    return ans;
                }
                if (NIL != closedP(v_object, symbol_function($sym37$CYC_VAR_))) {
                    final SubLObject relation = cycl_utilities.formula_arg0(v_object);
                    SubLObject ans = NIL;
                    SubLObject argnum = NIL;
                    SubLObject args = NIL;
                    SubLObject arg = NIL;
                    argnum = ZERO_INTEGER;
                    args = cycl_utilities.nat_args(v_object, UNPROVIDED);
                    arg = args.first();
                    while (args.rest().isCons()) {
                        if (((NIL == czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, UNPROVIDED)) && (NIL == kb_accessors.quoted_argumentP(relation, argnum))) && (NIL == czer_utilities.assertion_argP(relation, argnum, UNPROVIDED))) {
                            ans = non_editable_skolem_referenceP(arg);
                            if (NIL != ans) {
                                return ans;
                            }
                        }
                        argnum = add(ONE_INTEGER, argnum);
                        args = args.rest();
                        arg = args.first();
                    } 
                    if (((NIL == czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, UNPROVIDED)) && (NIL == kb_accessors.quoted_argumentP(relation, argnum))) && (NIL == czer_utilities.assertion_argP(relation, argnum, UNPROVIDED))) {
                        ans = non_editable_skolem_referenceP(args.first());
                        if (NIL != ans) {
                            return ans;
                        }
                        if (NIL != args.rest()) {
                            ans = non_editable_skolem_referenceP(args.rest());
                        }
                    }
                    return ans;
                }
                return v_object;
            }
        } else
            if (NIL != v_object) {
                return non_editable_skolem_referenceP(function_terms.term_of_unit(v_object));
            }

        return NIL;
    }

    public static final SubLObject pred_of_editable_skolem_gafP_alt(SubLObject pred) {
        return makeBoolean(((NIL != subl_promotions.memberP(pred, czer_vars.$preds_of_editable_skolem_gafs$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.wff.editable_skolem_predicateP(pred))) || (NIL != fort_types_interface.bookkeeping_predicate_p(pred)));
    }

    public static SubLObject pred_of_editable_skolem_gafP(final SubLObject pred) {
        return makeBoolean(((NIL != subl_promotions.memberP(pred, czer_vars.$preds_of_editable_skolem_gafs$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != editable_skolem_predicateP(pred))) || (NIL != fort_types_interface.bookkeeping_predicate_p(pred)));
    }

    public static final SubLObject editable_skolem_predicateP_alt(SubLObject pred) {
        return NIL;
    }

    public static SubLObject editable_skolem_predicateP(final SubLObject pred) {
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff we want to inhibit asserting semantically dubious
    #$commutativeInArgs or #$commutativeInArgsAndRest gafs, based on what is already in the KB.
     * @see ok-wrt-partial-commutativity?
     */
    @LispMethod(comment = "@return boolean; t iff we want to inhibit asserting semantically dubious\r\n#$commutativeInArgs or #$commutativeInArgsAndRest gafs, based on what is already in the KB.\r\n@see ok-wrt-partial-commutativity?")
    public static final SubLObject inhibit_cyclic_commutative_in_argsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != wff_vars.$inhibit_cyclic_commutative_in_argsP$.getDynamicValue(thread)));
        }
    }

    /**
     *
     *
     * @return boolean; t iff we want to inhibit asserting semantically dubious
    #$commutativeInArgs or #$commutativeInArgsAndRest gafs, based on what is already in the KB.
     * @see ok-wrt-partial-commutativity?
     */
    @LispMethod(comment = "@return boolean; t iff we want to inhibit asserting semantically dubious\r\n#$commutativeInArgs or #$commutativeInArgsAndRest gafs, based on what is already in the KB.\r\n@see ok-wrt-partial-commutativity?")
    public static SubLObject inhibit_cyclic_commutative_in_argsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != wff_vars.$inhibit_cyclic_commutative_in_argsP$.getDynamicValue(thread)));
    }

    public static final SubLObject wff_wrt_literal_idiosyncrasiesP_alt(SubLObject literal, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.wff.enforce_literal_idiosyncrasiesP()) {
            {
                SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
                if (pcase_var.eql($$exceptFor)) {
                    return com.cyc.cycjava.cycl.wff.except_for_wffP(literal);
                } else {
                    if (pcase_var.eql($$termOfUnit)) {
                        return com.cyc.cycjava.cycl.wff.tou_mt_okP(literal, mt);
                    } else {
                        if (pcase_var.eql($$commutativeInArgs)) {
                            return czer_main.ok_wrt_partial_commutativityP(literal, mt, com.cyc.cycjava.cycl.wff.inhibit_cyclic_commutative_in_argsP());
                        } else {
                            if (pcase_var.eql($$commutativeInArgsAndRest)) {
                                return czer_main.ok_wrt_partial_commutativityP(literal, mt, com.cyc.cycjava.cycl.wff.inhibit_cyclic_commutative_in_argsP());
                            } else {
                                return T;
                            }
                        }
                    }
                }
            }
        } else {
            return T;
        }
    }

    public static SubLObject wff_wrt_literal_idiosyncrasiesP(final SubLObject literal, final SubLObject mt) {
        if (NIL == enforce_literal_idiosyncrasiesP()) {
            return T;
        }
        final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
        if (pcase_var.eql($$exceptFor)) {
            return except_for_wffP(literal);
        }
        if (pcase_var.eql($$termOfUnit)) {
            return tou_mt_okP(literal, mt);
        }
        if (pcase_var.eql($$commutativeInArgs)) {
            return czer_main.ok_wrt_partial_commutativityP(literal, mt, inhibit_cyclic_commutative_in_argsP());
        }
        if (pcase_var.eql($$commutativeInArgsAndRest)) {
            return czer_main.ok_wrt_partial_commutativityP(literal, mt, inhibit_cyclic_commutative_in_argsP());
        }
        return T;
    }

    public static final SubLObject except_for_wffP_alt(SubLObject literal) {
        if (NIL != singletonP(referenced_variables(literal_arg2(literal, UNPROVIDED), UNPROVIDED))) {
            return T;
        } else {
            com.cyc.cycjava.cycl.wff.note_wff_violation(list($kw53$EXCEPT_FOR_W_O_SINGLETON_VAR, literal));
        }
        return NIL;
    }

    public static SubLObject except_for_wffP(final SubLObject literal) {
        if (NIL != list_utilities.singletonP(referenced_variables(literal_arg2(literal, UNPROVIDED), UNPROVIDED))) {
            return T;
        }
        note_wff_violation(list($kw62$EXCEPT_FOR_W_O_SINGLETON_VAR, literal));
        return NIL;
    }

    public static final SubLObject tou_mt_okP_alt(SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((((NIL == within_assertP()) || mt.eql(mt_vars.$tou_mt$.getGlobalValue())) || (NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))) || (NIL == groundP(literal, UNPROVIDED))) {
                return T;
            } else {
                com.cyc.cycjava.cycl.wff.note_wff_violation(list($INVALID_MT_FOR_TOU, literal, mt));
            }
            return NIL;
        }
    }

    public static SubLObject tou_mt_okP(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL == within_assertP()) || mt.eql(mt_vars.$tou_mt$.getGlobalValue())) || (NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))) || (NIL == groundP(literal, UNPROVIDED))) {
            return T;
        }
        note_wff_violation(list($INVALID_MT_FOR_TOU, literal, mt));
        return NIL;
    }

    public static final SubLObject semantically_wf_non_atomic_sentenceP_alt(SubLObject nasent, SubLObject mt) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.wff.semantically_wf_sentenceP(nasent, mt)) && (NIL != com.cyc.cycjava.cycl.wff.all_subsentences_semantically_wfP(nasent, mt)));
    }

    public static SubLObject semantically_wf_non_atomic_sentenceP(final SubLObject nasent, final SubLObject mt) {
        return makeBoolean((NIL != semantically_wf_sentenceP(nasent, mt)) && (NIL != all_subsentences_semantically_wfP(nasent, mt)));
    }

    /**
     * Checks whether all subsentences (passing through sentential relations)
     * of the non-atomic sentence NASENT are semantically well-formed.
     */
    @LispMethod(comment = "Checks whether all subsentences (passing through sentential relations)\r\nof the non-atomic sentence NASENT are semantically well-formed.\nChecks whether all subsentences (passing through sentential relations)\nof the non-atomic sentence NASENT are semantically well-formed.")
    public static final SubLObject all_subsentences_semantically_wfP_alt(SubLObject nasent, SubLObject mt) {
        {
            SubLObject wffP = T;
            SubLObject truth_function = cycl_utilities.sentence_truth_function(nasent);
            if (NIL != cycl_grammar.cycl_logical_operator_p(truth_function)) {
                {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(nasent, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject subsentence = NIL;
                    for (subsentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subsentence = cdolist_list_var.first()) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL == com.cyc.cycjava.cycl.wff.subsentence_semantically_wfP(nasent, subsentence, argnum, mt)) {
                            wffP = NIL;
                        }
                    }
                }
            } else {
                if (NIL != cycl_grammar.cycl_quantifier_p(truth_function)) {
                    {
                        SubLObject subsentence = quantified_sub_sentence(nasent);
                        SubLObject argnum = quantified_sub_sentence_argnum(nasent);
                        if (NIL == com.cyc.cycjava.cycl.wff.subsentence_semantically_wfP(nasent, subsentence, argnum, mt)) {
                            wffP = NIL;
                        }
                    }
                } else {
                    Errors.error($str_alt55$Got_an_unexpected_sentential_rela, truth_function, nasent);
                }
            }
            return wffP;
        }
    }

    /**
     * Checks whether all subsentences (passing through sentential relations)
     * of the non-atomic sentence NASENT are semantically well-formed.
     */
    @LispMethod(comment = "Checks whether all subsentences (passing through sentential relations)\r\nof the non-atomic sentence NASENT are semantically well-formed.\nChecks whether all subsentences (passing through sentential relations)\nof the non-atomic sentence NASENT are semantically well-formed.")
    public static SubLObject all_subsentences_semantically_wfP(final SubLObject nasent, final SubLObject mt) {
        SubLObject wffP = T;
        final SubLObject truth_function = cycl_utilities.sentence_truth_function(nasent);
        if (NIL != cycl_grammar.cycl_logical_operator_p(truth_function)) {
            SubLObject argnum = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(nasent, $IGNORE);
            SubLObject subsentence = NIL;
            subsentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                argnum = add(argnum, ONE_INTEGER);
                if (NIL == subsentence_semantically_wfP(nasent, subsentence, argnum, mt)) {
                    wffP = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subsentence = cdolist_list_var.first();
            } 
        } else
            if (NIL != cycl_grammar.cycl_quantifier_p(truth_function)) {
                final SubLObject subsentence2 = quantified_sub_sentence(nasent);
                final SubLObject argnum2 = quantified_sub_sentence_argnum(nasent);
                if (NIL == subsentence_semantically_wfP(nasent, subsentence2, argnum2, mt)) {
                    wffP = NIL;
                }
            } else {
                Errors.error($str64$Got_an_unexpected_sentential_rela, truth_function, nasent);
            }

        return wffP;
    }

    public static final SubLObject subsentence_semantically_wfP_alt(SubLObject nasent, SubLObject subsentence, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = T;
                SubLObject truth_function = cycl_utilities.sentence_truth_function(nasent);
                {
                    SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$within_disjunctionP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$appraising_disjunctP$.currentBinding(thread);
                    try {
                        czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(truth_function, argnum), thread);
                        at_vars.$within_disjunctionP$.bind(arg_type.at_within_disjunctP(nasent, argnum), thread);
                        at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunctP(nasent, mt), thread);
                        if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wffP)) {
                            if (NIL == com.cyc.cycjava.cycl.wff.wff_elf_intP(subsentence, mt)) {
                                wffP = NIL;
                            }
                        }
                    } finally {
                        at_vars.$appraising_disjunctP$.rebind(_prev_bind_2, thread);
                        at_vars.$within_disjunctionP$.rebind(_prev_bind_1, thread);
                        czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject subsentence_semantically_wfP(final SubLObject nasent, final SubLObject subsentence, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = T;
        final SubLObject truth_function = cycl_utilities.sentence_truth_function(nasent);
        final SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$within_disjunctionP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$appraising_disjunctP$.currentBinding(thread);
        try {
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(truth_function, argnum), thread);
            at_vars.$within_disjunctionP$.bind(arg_type.at_within_disjunctP(nasent, argnum), thread);
            at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunctP(nasent, mt), thread);
            if ((NIL == wff_doneP(wffP)) && (NIL == wff_elf_intP(subsentence, mt))) {
                wffP = NIL;
            }
        } finally {
            at_vars.$appraising_disjunctP$.rebind(_prev_bind_3, thread);
            at_vars.$within_disjunctionP$.rebind(_prev_bind_2, thread);
            czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject semantically_wf_sentenceP_alt(SubLObject sentence, SubLObject mt) {
        if ((NIL != mt) && (NIL != mt_relevance_macros.all_mts_are_relevantP())) {
            return com.cyc.cycjava.cycl.wff.semantically_wf_sentence_in_any_mtP(sentence);
        } else {
            return com.cyc.cycjava.cycl.wff.memoized_semantically_wf_sentenceP(sentence, mt);
        }
    }

    public static SubLObject semantically_wf_sentenceP(final SubLObject sentence, final SubLObject mt) {
        if ((NIL != mt) && (NIL != mt_relevance_macros.all_mts_are_relevantP())) {
            return semantically_wf_sentence_in_any_mtP(sentence);
        }
        return memoized_semantically_wf_sentenceP(sentence, mt);
    }

    public static final SubLObject semantically_wf_sentence_in_any_mtP_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        wffP = com.cyc.cycjava.cycl.wff.memoized_semantically_wf_sentenceP(sentence, $$EverythingPSC);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject semantically_wf_sentence_in_any_mtP(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            wffP = memoized_semantically_wf_sentenceP(sentence, $$EverythingPSC);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject memoized_semantically_wf_sentenceP_internal_alt(SubLObject sentence, SubLObject mt) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.wff.mal_arg_typesP(sentence, mt));
    }

    public static SubLObject memoized_semantically_wf_sentenceP_internal(final SubLObject sentence, final SubLObject mt) {
        return makeBoolean(NIL == mal_arg_typesP(sentence, mt));
    }

    public static final SubLObject memoized_semantically_wf_sentenceP_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.wff.memoized_semantically_wf_sentenceP_internal(sentence, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (sentence.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wff.memoized_semantically_wf_sentenceP_internal(sentence, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject memoized_semantically_wf_sentenceP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_semantically_wf_sentenceP_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym65$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym65$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym65$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_semantically_wf_sentenceP_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject mal_arityP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == wff_utilities.$check_arityP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject operator = cycl_utilities.formula_operator(formula);
                if (NIL != cycl_grammar.cycl_variable_p(operator)) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.wff.note_wff_violationP()) {
                        return com.cyc.cycjava.cycl.wff.mal_arity_intP(formula);
                    } else {
                        if (NIL != sequence_var(formula, UNPROVIDED)) {
                            return com.cyc.cycjava.cycl.wff.mal_arity_intP(formula);
                        } else {
                            {
                                SubLObject actual_arity = expression_arity(formula, UNPROVIDED);
                                return com.cyc.cycjava.cycl.wff.mal_actual_arity_cachedP(operator, actual_arity);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject mal_arityP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == wff_utilities.$check_arityP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject operator = cycl_utilities.formula_operator(formula);
        if (NIL != cycl_grammar.cycl_variable_p(operator)) {
            return NIL;
        }
        if (NIL != note_wff_violationP()) {
            return mal_arity_intP(formula);
        }
        if (NIL != sequence_var(formula, UNPROVIDED)) {
            return mal_arity_intP(formula);
        }
        final SubLObject actual_arity = expression_arity(formula, UNPROVIDED);
        return mal_actual_arity_cachedP(operator, actual_arity);
    }

    public static final SubLObject clear_mal_actual_arity_cachedP_alt() {
        {
            SubLObject cs = $mal_actual_arity_cachedP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_mal_actual_arity_cachedP() {
        final SubLObject cs = $mal_actual_arity_cachedP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_mal_actual_arity_cachedP_alt(SubLObject operator, SubLObject actual_arity) {
        return memoization_state.caching_state_remove_function_results_with_args($mal_actual_arity_cachedP_caching_state$.getGlobalValue(), list(operator, actual_arity), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_mal_actual_arity_cachedP(final SubLObject operator, final SubLObject actual_arity) {
        return memoization_state.caching_state_remove_function_results_with_args($mal_actual_arity_cachedP_caching_state$.getGlobalValue(), list(operator, actual_arity), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mal_actual_arity_cachedP_internal_alt(SubLObject operator, SubLObject actual_arity) {
        {
            SubLObject args = make_list(actual_arity, $TERM);
            SubLObject formula = make_formula(operator, args, UNPROVIDED);
            return com.cyc.cycjava.cycl.wff.mal_arity_intP(formula);
        }
    }

    public static SubLObject mal_actual_arity_cachedP_internal(final SubLObject operator, final SubLObject actual_arity) {
        final SubLObject args = make_list(actual_arity, $TERM);
        final SubLObject formula = make_formula(operator, args, UNPROVIDED);
        return mal_arity_intP(formula);
    }

    public static final SubLObject mal_actual_arity_cachedP_alt(SubLObject operator, SubLObject actual_arity) {
        {
            SubLObject caching_state = $mal_actual_arity_cachedP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym57$MAL_ACTUAL_ARITY_CACHED_, $sym59$_MAL_ACTUAL_ARITY_CACHED__CACHING_STATE_, $int$256, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback($sym61$CLEAR_MAL_ACTUAL_ARITY_CACHED_);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(operator, actual_arity);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (operator.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && actual_arity.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wff.mal_actual_arity_cachedP_internal(operator, actual_arity)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(operator, actual_arity));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject mal_actual_arity_cachedP(final SubLObject operator, final SubLObject actual_arity) {
        SubLObject caching_state = $mal_actual_arity_cachedP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym66$MAL_ACTUAL_ARITY_CACHED_, $sym68$_MAL_ACTUAL_ARITY_CACHED__CACHING_STATE_, $int$256, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym69$CLEAR_MAL_ACTUAL_ARITY_CACHED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, actual_arity);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (operator.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && actual_arity.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(mal_actual_arity_cachedP_internal(operator, actual_arity)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(operator, actual_arity));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject mal_arity_intP_alt(SubLObject formula) {
        {
            SubLObject relation = cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_operator(formula));
            SubLObject malP = NIL;
            if (((NIL != forts.fort_p(relation)) || (NIL != kappa_predicate_p(relation))) || (NIL != lambda_function_p(relation))) {
                if (NIL != arity.variable_arityP(relation)) {
                    malP = com.cyc.cycjava.cycl.wff.mal_variable_arityP(formula);
                } else {
                    malP = com.cyc.cycjava.cycl.wff.mal_fixed_arityP(formula);
                }
            }
            return malP;
        }
    }

    public static SubLObject mal_arity_intP(final SubLObject formula) {
        final SubLObject relation = cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_operator(formula));
        SubLObject malP = NIL;
        if (((NIL != forts.fort_p(relation)) || (NIL != kappa_predicate_p(relation))) || (NIL != lambda_function_p(relation))) {
            if (NIL != arity.variable_arityP(relation)) {
                malP = mal_variable_arityP(formula);
            } else {
                malP = mal_fixed_arityP(formula);
            }
        }
        return malP;
    }

    /**
     * does FORMULA, with fixed-arity relation arg0, comply with applicable arity constraints?
     */
    @LispMethod(comment = "does FORMULA, with fixed-arity relation arg0, comply with applicable arity constraints?")
    public static final SubLObject mal_fixed_arityP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation = cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_arg0(formula));
                SubLObject v_arity = arity.arity(relation);
                SubLObject malP = NIL;
                if (NIL == v_arity) {
                    if (!(((NIL != $relax_type_restrictions_for_nats$.getDynamicValue(thread)) && (NIL != within_forward_inferenceP())) && (NIL != nart_handles.nart_p(relation)))) {
                        if (NIL == kb_accessors.indeterminate_termP(relation)) {
                            com.cyc.cycjava.cycl.wff.note_arity_violation(list($MISSING_ARITY, relation, v_arity, formula));
                            malP = T;
                        }
                    }
                } else {
                    if (NIL == collection_defns.cyc_non_negative_integer(v_arity)) {
                        com.cyc.cycjava.cycl.wff.note_arity_violation(list($MAL_ARITY, $$arity, relation, v_arity));
                        malP = T;
                    } else {
                        if (NIL != sequence_var(formula, UNPROVIDED)) {
                            if (!expression_arity(formula, $IGNORE).numLE(v_arity)) {
                                com.cyc.cycjava.cycl.wff.note_arity_violation(list($VIOLATED_ARITY, $$arity, relation, v_arity, formula));
                                malP = T;
                            }
                        } else {
                            if (!v_arity.numE(expression_arity(formula, UNPROVIDED))) {
                                com.cyc.cycjava.cycl.wff.note_arity_violation(list($VIOLATED_ARITY, $$arity, relation, v_arity, formula));
                                malP = T;
                            } else {
                                malP = NIL;
                            }
                        }
                    }
                }
                return malP;
            }
        }
    }

    @LispMethod(comment = "does FORMULA, with fixed-arity relation arg0, comply with applicable arity constraints?")
    public static SubLObject mal_fixed_arityP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject relation = cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_arg0(formula));
        final SubLObject v_arity = arity.arity(relation);
        SubLObject malP = NIL;
        if (NIL == v_arity) {
            if ((((NIL == kb_control_vars.$relax_type_restrictions_for_nats$.getDynamicValue(thread)) || (NIL == kb_control_vars.within_forward_inferenceP())) || (NIL == nart_handles.nart_p(relation))) && (NIL == kb_accessors.indeterminate_termP(relation))) {
                note_arity_violation(list($MISSING_ARITY, relation, v_arity, formula));
                malP = T;
            }
        } else
            if (NIL == collection_defns.cyc_non_negative_integer(v_arity)) {
                note_arity_violation(list($MAL_ARITY, $$arity, relation, v_arity));
                malP = T;
            } else
                if (NIL != sequence_var(formula, UNPROVIDED)) {
                    if (!expression_arity(formula, $IGNORE).numLE(v_arity)) {
                        note_arity_violation(list($VIOLATED_ARITY, $$arity, relation, v_arity, formula));
                        malP = T;
                    }
                } else
                    if (!v_arity.numE(expression_arity(formula, UNPROVIDED))) {
                        note_arity_violation(list($VIOLATED_ARITY, $$arity, relation, v_arity, formula));
                        malP = T;
                    } else {
                        malP = NIL;
                    }



        return malP;
    }

    /**
     * does FORMULA, with variable-arity relation arg0, comply with applicable arity constraints?
     */
    @LispMethod(comment = "does FORMULA, with variable-arity relation arg0, comply with applicable arity constraints?")
    public static final SubLObject mal_variable_arityP_alt(SubLObject formula) {
        {
            SubLObject relation = cycl_utilities.formula_arg0(formula);
            SubLObject v_arity = expression_arity(formula, $IGNORE);
            SubLObject arity_min = arity.arity_min(relation);
            SubLObject arity_max = arity.arity_max(relation);
            SubLObject malP = NIL;
            if (NIL != arity_min) {
                if (NIL == collection_defns.cyc_non_negative_integer(arity_min)) {
                    com.cyc.cycjava.cycl.wff.note_arity_violation(list($MAL_ARITY, $$arityMin, relation, v_arity));
                    malP = T;
                } else {
                    if ((!v_arity.numGE(arity_min)) && (NIL == sequence_var(formula, UNPROVIDED))) {
                        com.cyc.cycjava.cycl.wff.note_arity_violation(list($VIOLATED_ARITY, $$arityMin, relation, arity_min, formula));
                        malP = T;
                    }
                }
            }
            if (NIL != arity_max) {
                if (NIL == collection_defns.cyc_non_negative_integer(arity_max)) {
                    com.cyc.cycjava.cycl.wff.note_arity_violation(list($MAL_ARITY, $$arityMax, relation, v_arity));
                    malP = T;
                } else {
                    if (!v_arity.numLE(arity_max)) {
                        com.cyc.cycjava.cycl.wff.note_arity_violation(list($VIOLATED_ARITY, $$arityMax, relation, arity_max, formula));
                        malP = T;
                    }
                }
            }
            return malP;
        }
    }

    @LispMethod(comment = "does FORMULA, with variable-arity relation arg0, comply with applicable arity constraints?")
    public static SubLObject mal_variable_arityP(final SubLObject formula) {
        final SubLObject relation = cycl_utilities.formula_arg0(formula);
        final SubLObject v_arity = expression_arity(formula, $IGNORE);
        final SubLObject arity_min = arity.arity_min(relation);
        final SubLObject arity_max = arity.arity_max(relation);
        SubLObject malP = NIL;
        if (NIL != arity_min) {
            if (NIL == collection_defns.cyc_non_negative_integer(arity_min)) {
                note_arity_violation(list($MAL_ARITY, $$arityMin, relation, v_arity));
                malP = T;
            } else
                if ((!v_arity.numGE(arity_min)) && (NIL == sequence_var(formula, UNPROVIDED))) {
                    note_arity_violation(list($VIOLATED_ARITY, $$arityMin, relation, arity_min, formula));
                    malP = T;
                }

        }
        if (NIL != arity_max) {
            if (NIL == collection_defns.cyc_non_negative_integer(arity_max)) {
                note_arity_violation(list($MAL_ARITY, $$arityMax, relation, v_arity));
                malP = T;
            } else
                if (!v_arity.numLE(arity_max)) {
                    note_arity_violation(list($VIOLATED_ARITY, $$arityMax, relation, arity_max, formula));
                    malP = T;
                }

        }
        return malP;
    }

    public static final SubLObject mal_arg_typesP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != com.cyc.cycjava.cycl.wff.wff_check_argsP()) || (NIL == atomic_sentenceP(formula))) || (NIL != ist_sentence_p(formula))) {
            {
                SubLObject wffP = NIL;
                at_utilities.reset_semantic_violations(UNPROVIDED);
                wffP = com.cyc.cycjava.cycl.wff.wff_wrt_arg_typesP(formula, mt);
                if (NIL == wffP) {
                    com.cyc.cycjava.cycl.wff.note_wff_violations(at_utilities.semantic_violations());
                }
                return makeBoolean(NIL == wffP);
            }
        }
        return NIL;
    }

    public static SubLObject mal_arg_typesP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != wff_check_argsP()) || (NIL == atomic_sentenceP(formula))) || (NIL != ist_sentence_p(formula, UNPROVIDED))) {
            SubLObject wffP = NIL;
            at_utilities.reset_semantic_violations(UNPROVIDED);
            wffP = wff_wrt_arg_typesP(formula, mt);
            if (NIL == wffP) {
                note_wff_violations(at_utilities.semantic_violations());
            }
            return makeBoolean(NIL == wffP);
        }
        return NIL;
    }

    public static final SubLObject wff_wrt_arg_typesP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return arg_type.formula_args_ok_wrt_typeP(formula, mt);
    }

    public static SubLObject wff_wrt_arg_typesP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return arg_type.formula_args_ok_wrt_typeP(formula, mt);
    }

    public static final SubLObject wff_coherentP_alt(SubLObject formula, SubLObject form) {
        if (form == UNPROVIDED) {
            form = $ELF;
        }
        return makeBoolean(NIL == com.cyc.cycjava.cycl.wff.wff_incoherentP(formula, form));
    }

    public static SubLObject wff_coherentP(final SubLObject formula, SubLObject form) {
        if (form == UNPROVIDED) {
            form = $ELF;
        }
        return makeBoolean(NIL == wff_incoherentP(formula, form));
    }

    public static final SubLObject wff_incoherentP_alt(SubLObject formula, SubLObject form) {
        if (form == UNPROVIDED) {
            form = $ELF;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread)) {
                {
                    SubLObject pcase_var = form;
                    if (pcase_var.eql($ELF)) {
                        return com.cyc.cycjava.cycl.wff.elf_incoherentP(formula);
                    } else {
                        if (pcase_var.eql($CNF)) {
                            return com.cyc.cycjava.cycl.wff.cnf_incoherentP(formula, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject wff_incoherentP(final SubLObject formula, SubLObject form) {
        if (form == UNPROVIDED) {
            form = $ELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread)) {
            final SubLObject pcase_var = form;
            if (pcase_var.eql($ELF)) {
                return elf_incoherentP(formula);
            }
            if (pcase_var.eql($CNF)) {
                return cnf_incoherentP(formula, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject elf_incoherentP_alt(SubLObject formula) {
        {
            SubLObject coherentP = NIL;
            com.cyc.cycjava.cycl.wff.reset_coherence_violations();
            coherentP = ke_coherence.connected_formulaP(formula, UNPROVIDED);
            coherentP = makeBoolean((NIL != ke_coherence.formula_relevant_only_literalsP(formula)) && (NIL != coherentP));
            if (NIL == coherentP) {
                com.cyc.cycjava.cycl.wff.note_wff_violations(com.cyc.cycjava.cycl.wff.coherence_violations());
            }
            return makeBoolean(NIL == coherentP);
        }
    }

    public static SubLObject elf_incoherentP(final SubLObject formula) {
        SubLObject coherentP = NIL;
        reset_coherence_violations();
        coherentP = ke_coherence.connected_formulaP(formula, UNPROVIDED);
        coherentP = makeBoolean((NIL != ke_coherence.formula_relevant_only_literalsP(formula)) && (NIL != coherentP));
        if (NIL == coherentP) {
            note_wff_violations(coherence_violations());
        }
        return makeBoolean(NIL == coherentP);
    }

    public static final SubLObject cnf_incoherentP_alt(SubLObject cnf, SubLObject var) {
        if (var == UNPROVIDED) {
            var = symbol_function($sym30$HL_VAR_);
        }
        {
            SubLObject coherentP = NIL;
            com.cyc.cycjava.cycl.wff.reset_coherence_violations();
            coherentP = ke_coherence.connected_cnfP(cnf, var);
            coherentP = makeBoolean((NIL != ke_coherence.cnf_relevant_only_literalsP(cnf)) && (NIL != coherentP));
            if (NIL == coherentP) {
                com.cyc.cycjava.cycl.wff.note_wff_violations(com.cyc.cycjava.cycl.wff.coherence_violations());
            }
            return makeBoolean(NIL == coherentP);
        }
    }

    public static SubLObject cnf_incoherentP(final SubLObject cnf, SubLObject var) {
        if (var == UNPROVIDED) {
            var = symbol_function($sym36$HL_VAR_);
        }
        SubLObject coherentP = NIL;
        reset_coherence_violations();
        coherentP = ke_coherence.connected_cnfP(cnf, var);
        coherentP = makeBoolean((NIL != ke_coherence.cnf_relevant_only_literalsP(cnf)) && (NIL != coherentP));
        if (NIL == coherentP) {
            note_wff_violations(coherence_violations());
        }
        return makeBoolean(NIL == coherentP);
    }

    public static final SubLObject kwt_wffP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(cycl_utilities.reify_when_closed_naut(mt));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$wff_memoization_state$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
                        {
                            SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_33 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt2$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            if (NIL == wff_macros.within_wffP()) {
                                                com.cyc.cycjava.cycl.wff.reset_wff_state();
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    {
                                                        SubLObject _prev_bind_0_35 = wff_vars.$within_wffP$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_36 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                                                        try {
                                                            wff_vars.$within_wffP$.bind(T, thread);
                                                            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
                                                            if (NIL != cycl_variables.cyc_varP(formula)) {
                                                                wffP = T;
                                                            } else {
                                                                wffP = com.cyc.cycjava.cycl.wff.wffP(formula, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_1_36, thread);
                                                            wff_vars.$within_wffP$.rebind(_prev_bind_0_35, thread);
                                                        }
                                                    }
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_33, thread);
                                }
                            }
                        }
                    } finally {
                        wff_vars.$wff_memoization_state$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject kwt_wffP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(cycl_utilities.reify_when_closed_naut(mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$wff_memoization_state$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$34 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == wff_macros.within_wffP()) {
                        reset_wff_state();
                    }
                    final SubLObject _prev_bind_0_$35 = wff_vars.$within_wffP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$36 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                    try {
                        wff_vars.$within_wffP$.bind(T, thread);
                        wff_vars.$permit_keyword_variablesP$.bind(T, thread);
                        if (NIL != cycl_variables.cyc_varP(formula)) {
                            wffP = T;
                        } else {
                            wffP = wffP(formula, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_1_$36, thread);
                        wff_vars.$within_wffP$.rebind(_prev_bind_0_$35, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$34, thread);
            }
        } finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject gat_wffP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(cycl_utilities.reify_when_closed_naut(mt));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$within_wffP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        wff_vars.$within_wffP$.bind(T, thread);
                        wff_vars.$permit_generic_arg_variablesP$.bind(T, thread);
                        if (NIL != cycl_variables.cyc_varP(formula)) {
                            wffP = T;
                        } else {
                            wffP = com.cyc.cycjava.cycl.wff.wffP(formula, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_4, thread);
                        wff_vars.$within_wffP$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject gat_wffP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(cycl_utilities.reify_when_closed_naut(mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$within_wffP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            wff_vars.$within_wffP$.bind(T, thread);
            wff_vars.$permit_generic_arg_variablesP$.bind(T, thread);
            if (NIL != cycl_variables.cyc_varP(formula)) {
                wffP = T;
            } else {
                wffP = wffP(formula, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_5, thread);
            wff_vars.$within_wffP$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    /**
     * Is FORMULA a well-formed el formula?
     */
    @LispMethod(comment = "Is FORMULA a well-formed el formula?")
    public static final SubLObject el_formula_okP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(formula, LISTP);
            {
                SubLObject okP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_utilities.$check_arityP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    try {
                        wff_utilities.$check_arg_typesP$.bind(T, thread);
                        wff_utilities.$check_arityP$.bind(T, thread);
                        wff_utilities.$check_var_typesP$.bind(T, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                        okP = com.cyc.cycjava.cycl.wff.formula_okP(formula, mt);
                    } finally {
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_2, thread);
                        wff_utilities.$check_arityP$.rebind(_prev_bind_1, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return okP;
            }
        }
    }

    @LispMethod(comment = "Is FORMULA a well-formed el formula?")
    public static SubLObject el_formula_okP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(formula, LISTP);
        SubLObject okP = NIL;
        final SubLObject _prev_bind_0 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arityP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        try {
            wff_utilities.$check_arg_typesP$.bind(T, thread);
            wff_utilities.$check_arityP$.bind(T, thread);
            wff_utilities.$check_var_typesP$.bind(T, thread);
            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
            okP = formula_okP(formula, mt);
        } finally {
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arityP$.rebind(_prev_bind_2, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    public static final SubLObject formula_okP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = NIL;
                if (NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) {
                    okP = com.cyc.cycjava.cycl.wff.kwt_wffP(formula, mt);
                } else {
                    if (NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) {
                        okP = com.cyc.cycjava.cycl.wff.gat_wffP(formula, mt);
                    } else {
                        okP = com.cyc.cycjava.cycl.wff.el_wffP(formula, mt, UNPROVIDED);
                    }
                }
                return okP;
            }
        }
    }

    public static SubLObject formula_okP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        if (NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) {
            okP = kwt_wffP(formula, mt);
        } else
            if (NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) {
                okP = gat_wffP(formula, mt);
            } else {
                okP = el_wffP(formula, mt, UNPROVIDED);
            }

        return okP;
    }

    /**
     * Is FORMULA a well-formed el query?
     */
    @LispMethod(comment = "Is FORMULA a well-formed el query?")
    public static final SubLObject el_query_okP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(formula, LISTP);
            {
                SubLObject okP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_utilities.$check_arityP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    try {
                        wff_utilities.$check_arg_typesP$.bind(T, thread);
                        wff_utilities.$check_arityP$.bind(T, thread);
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                        okP = com.cyc.cycjava.cycl.wff.query_okP(formula, mt);
                    } finally {
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_2, thread);
                        wff_utilities.$check_arityP$.rebind(_prev_bind_1, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return okP;
            }
        }
    }

    @LispMethod(comment = "Is FORMULA a well-formed el query?")
    public static SubLObject el_query_okP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(formula, LISTP);
        SubLObject okP = NIL;
        final SubLObject _prev_bind_0 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arityP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        try {
            wff_utilities.$check_arg_typesP$.bind(T, thread);
            wff_utilities.$check_arityP$.bind(T, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
            okP = query_okP(formula, mt);
        } finally {
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arityP$.rebind(_prev_bind_2, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    public static final SubLObject query_okP_alt(SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
                    try {
                        wff_vars.$within_wffP$.bind(T, thread);
                        if (NIL != com.cyc.cycjava.cycl.wff.el_wffP(query, mt, UNPROVIDED)) {
                            {
                                SubLObject var_types_okP = at_var_types.query_var_types_okP(query, mt, UNPROVIDED);
                                okP = var_types_okP;
                                if (NIL == var_types_okP) {
                                    com.cyc.cycjava.cycl.wff.note_wff_violations(at_utilities.semantic_violations());
                                }
                            }
                        }
                    } finally {
                        wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
                    }
                }
                return okP;
            }
        }
    }

    public static SubLObject query_okP(final SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
        try {
            wff_vars.$within_wffP$.bind(T, thread);
            if (NIL != el_wffP(query, mt, UNPROVIDED)) {
                final SubLObject var_types_okP = at_var_types.query_var_types_okP(query, mt, UNPROVIDED);
                if (NIL == (okP = var_types_okP)) {
                    note_wff_violations(at_utilities.semantic_violations());
                }
            }
        } finally {
            wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    public static final SubLObject why_not_query_ok_alt(SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$wff_violations$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(T, thread);
                        at_vars.$accumulating_at_violationsP$.bind(T, thread);
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        com.cyc.cycjava.cycl.wff.query_okP(query, mt);
                        if (NIL != hlmt.hlmt_p(mt)) {
                            if (NIL == com.cyc.cycjava.cycl.wff.wff_violations()) {
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0_37 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1_38 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                            simplifier.simplify_cycl_sentence(query, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_38, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                }
                            }
                        }
                        result = com.cyc.cycjava.cycl.wff.wff_violations();
                    } finally {
                        wff_vars.$wff_violations$.rebind(_prev_bind_4, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject why_not_query_ok(final SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$wff_violations$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wff_vars.$wff_violations$.bind(NIL, thread);
            query_okP(query, mt);
            if ((NIL != hlmt.hlmt_p(mt)) && (NIL == wff_violations())) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$38 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$39 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    simplifier.simplify_cycl_sentence(query, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$39, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$38, thread);
                }
            }
            result = wff_violations();
        } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject el_wft_fastP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wftP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                    try {
                        wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                        wftP = com.cyc.cycjava.cycl.wff.el_wftP(v_term, mt, UNPROVIDED);
                    } finally {
                        wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return wftP;
            }
        }
    }

    public static SubLObject el_wft_fastP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wftP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            wftP = el_wftP(v_term, mt, UNPROVIDED);
        } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
        }
        return wftP;
    }

    public static SubLObject el_strictly_wft_fastP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wftP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            wff_vars.$wff_mode$.bind($STRICT, thread);
            wftP = el_wftP(v_term, mt, UNPROVIDED);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_2, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
        }
        return wftP;
    }

    public static final SubLObject el_wft_fast_in_mtP_alt(SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wftP = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        wftP = com.cyc.cycjava.cycl.wff.el_wft_fastP(v_term, mt);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return wftP;
            }
        }
    }

    public static SubLObject el_wft_fast_in_mtP(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wftP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            wftP = el_wft_fastP(v_term, mt);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return wftP;
    }

    /**
     * is <formula> a well-formed el term?
     */
    @LispMethod(comment = "is <formula> a well-formed el term?")
    public static final SubLObject el_wftP_alt(SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject result = NIL;
                SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                SubLObject svs = wff_svs;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_properties$.currentBinding(thread);
                    try {
                        wff_vars.$wff_properties$.bind(svs, thread);
                        {
                            SubLObject svs_var = svs;
                            SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                            {
                                SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                try {
                                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                    result = com.cyc.cycjava.cycl.wff.el_wfeP(v_term, mt, UNPROVIDED);
                                } finally {
                                    rebind_dynamic_vars(cprogv_var, old_values);
                                }
                            }
                        }
                    } finally {
                        wff_vars.$wff_properties$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "is <formula> a well-formed el term?")
    public static SubLObject el_wftP(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject result = NIL;
        final SubLObject svs;
        final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
        final SubLObject _prev_bind_0 = wff_vars.$wff_properties$.currentBinding(thread);
        try {
            wff_vars.$wff_properties$.bind(svs, thread);
            final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
            final ArrayList old_values = extract_dynamic_values(cprogv_var);
            try {
                bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                result = el_wfeP(v_term, mt, UNPROVIDED);
            } finally {
                rebind_dynamic_vars(cprogv_var, old_values);
            }
        } finally {
            wff_vars.$wff_properties$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * is <formula> a well-formed el expression?
     */
    @LispMethod(comment = "is <formula> a well-formed el expression?")
    public static final SubLObject el_wfeP_alt(SubLObject expression, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject wfeP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$wff_original_formula$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$wff_memoization_state$.currentBinding(thread);
                    try {
                        wff_vars.$wff_formula$.bind(expression, thread);
                        wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? ((SubLObject) (wff_vars.wff_original_formula())) : expression, thread);
                        wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
                        {
                            SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_39 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt2$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            if (NIL == wff_macros.within_wffP()) {
                                                com.cyc.cycjava.cycl.wff.reset_wff_state();
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    {
                                                        SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                                                        SubLObject svs = wff_svs;
                                                        {
                                                            SubLObject _prev_bind_0_41 = wff_vars.$wff_properties$.currentBinding(thread);
                                                            try {
                                                                wff_vars.$wff_properties$.bind(svs, thread);
                                                                {
                                                                    SubLObject svs_var = svs;
                                                                    SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                                                                    {
                                                                        SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                                                        final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                                                        try {
                                                                            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                                                            wfeP = com.cyc.cycjava.cycl.wff.wfeP(expression, mt);
                                                                        } finally {
                                                                            rebind_dynamic_vars(cprogv_var, old_values);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                wff_vars.$wff_properties$.rebind(_prev_bind_0_41, thread);
                                                            }
                                                        }
                                                    }
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_39, thread);
                                }
                            }
                        }
                    } finally {
                        wff_vars.$wff_memoization_state$.rebind(_prev_bind_2, thread);
                        wff_vars.$wff_original_formula$.rebind(_prev_bind_1, thread);
                        wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
                    }
                }
                return wfeP;
            }
        }
    }

    @LispMethod(comment = "is <formula> a well-formed el expression?")
    public static SubLObject el_wfeP(final SubLObject expression, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject wfeP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$wff_original_formula$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$wff_memoization_state$.currentBinding(thread);
        try {
            wff_vars.$wff_formula$.bind(expression, thread);
            wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? wff_vars.wff_original_formula() : expression, thread);
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$40 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == wff_macros.within_wffP()) {
                        reset_wff_state();
                    }
                    final SubLObject svs;
                    final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
                    final SubLObject _prev_bind_0_$41 = wff_vars.$wff_properties$.currentBinding(thread);
                    try {
                        wff_vars.$wff_properties$.bind(svs, thread);
                        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                        final ArrayList old_values = extract_dynamic_values(cprogv_var);
                        try {
                            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                            SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                            wfeP = wfeP(expression, mt);
                        } finally {
                            rebind_dynamic_vars(cprogv_var, old_values);
                        }
                    } finally {
                        wff_vars.$wff_properties$.rebind(_prev_bind_0_$41, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$40, thread);
            }
        } finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_3, thread);
            wff_vars.$wff_original_formula$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
        }
        return wfeP;
    }

    public static final SubLObject wfeP_alt(SubLObject expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wfeP = T;
                if (NIL == cycl_grammar.cycl_expression_p(expression)) {
                    wfeP = NIL;
                }
                {
                    SubLObject wff_mt = cycl_utilities.reify_when_closed_naut(mt);
                    if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wfeP)) {
                        if (NIL != wff_utilities.mal_mt_specP(wff_mt)) {
                            com.cyc.cycjava.cycl.wff.note_wff_violation(list($INVALID_MT, wff_mt));
                            wfeP = NIL;
                        }
                    }
                    if (!((NIL != com.cyc.cycjava.cycl.wff.wff_only_needs_syntactic_checksP()) || (NIL == wfeP))) {
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_mt);
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wfeP)) {
                                        {
                                            SubLObject _prev_bind_0_42 = wff_vars.$within_wffP$.currentBinding(thread);
                                            try {
                                                wff_vars.$within_wffP$.bind(T, thread);
                                                if (NIL == com.cyc.cycjava.cycl.wff.wfe_intP(expression)) {
                                                    wfeP = NIL;
                                                }
                                            } finally {
                                                wff_vars.$within_wffP$.rebind(_prev_bind_0_42, thread);
                                            }
                                        }
                                    }
                                    if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wfeP)) {
                                        if (NIL != com.cyc.cycjava.cycl.wff.check_var_typesP(expression, UNPROVIDED)) {
                                            {
                                                SubLObject _prev_bind_0_43 = wff_vars.$within_wffP$.currentBinding(thread);
                                                try {
                                                    wff_vars.$within_wffP$.bind(T, thread);
                                                    if (NIL == at_var_types.term_var_types_ok_intP(expression, mt)) {
                                                        wfeP = NIL;
                                                        com.cyc.cycjava.cycl.wff.note_wff_violations(at_utilities.semantic_violations());
                                                    }
                                                } finally {
                                                    wff_vars.$within_wffP$.rebind(_prev_bind_0_43, thread);
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == com.cyc.cycjava.cycl.wff.wff_doneP(wfeP)) {
                                        if (NIL != com.cyc.cycjava.cycl.wff.check_wff_expansionP(expression)) {
                                            {
                                                SubLObject _prev_bind_0_44 = $within_assert$.currentBinding(thread);
                                                try {
                                                    $within_assert$.bind(NIL, thread);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject expansion = com.cyc.cycjava.cycl.wff.wff_el_expansion(expression, mt);
                                                        SubLObject mt_45 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject _prev_bind_0_46 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                                                            try {
                                                                at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                                                                if (!((NIL == expansion) || expression.equal(expansion))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_47 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_48 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_49 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = wff_vars.$validating_expansionP$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = wff_vars.$wff_expansion_formula$.currentBinding(thread);
                                                                        try {
                                                                            at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                                                                            wff_vars.$unexpanded_formula$.bind(expression, thread);
                                                                            wff_vars.$validate_expansionsP$.bind(NIL, thread);
                                                                            wff_vars.$validating_expansionP$.bind(T, thread);
                                                                            wff_vars.$wff_expansion_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_expansion_formula()) ? ((SubLObject) (wff_vars.wff_expansion_formula())) : expansion, thread);
                                                                            if (NIL == com.cyc.cycjava.cycl.wff.wfeP(expansion, mt_45)) {
                                                                                wfeP = NIL;
                                                                            }
                                                                        } finally {
                                                                            wff_vars.$wff_expansion_formula$.rebind(_prev_bind_4, thread);
                                                                            wff_vars.$validating_expansionP$.rebind(_prev_bind_3, thread);
                                                                            wff_vars.$validate_expansionsP$.rebind(_prev_bind_2_49, thread);
                                                                            wff_vars.$unexpanded_formula$.rebind(_prev_bind_1_48, thread);
                                                                            at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0_47, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $within_assert$.rebind(_prev_bind_0_44, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return wfeP;
            }
        }
    }

    public static SubLObject wfeP(final SubLObject expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wfeP = T;
        if (NIL == cycl_grammar.cycl_expression_p(expression)) {
            wfeP = NIL;
        }
        final SubLObject wff_mt = cycl_utilities.reify_when_closed_naut(mt);
        if ((NIL == wff_doneP(wfeP)) && (NIL != wff_utilities.mal_mt_specP(wff_mt))) {
            note_wff_violation(list($INVALID_MT, wff_mt));
            wfeP = NIL;
        }
        if ((NIL == wff_only_needs_syntactic_checksP()) && (NIL != wfeP)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == wff_doneP(wfeP)) {
                    final SubLObject _prev_bind_0_$43 = wff_vars.$within_wffP$.currentBinding(thread);
                    try {
                        wff_vars.$within_wffP$.bind(T, thread);
                        if (NIL == wfe_intP(expression)) {
                            wfeP = NIL;
                        }
                    } finally {
                        wff_vars.$within_wffP$.rebind(_prev_bind_0_$43, thread);
                    }
                }
                if ((NIL == wff_doneP(wfeP)) && (NIL != check_var_typesP(expression, UNPROVIDED))) {
                    final SubLObject _prev_bind_0_$44 = wff_vars.$within_wffP$.currentBinding(thread);
                    try {
                        wff_vars.$within_wffP$.bind(T, thread);
                        if (NIL == at_var_types.term_var_types_ok_intP(expression, mt)) {
                            wfeP = NIL;
                            note_wff_violations(at_utilities.semantic_violations());
                        }
                    } finally {
                        wff_vars.$within_wffP$.rebind(_prev_bind_0_$44, thread);
                    }
                }
                if ((NIL == wff_doneP(wfeP)) && (NIL != check_wff_expansionP(expression))) {
                    final SubLObject _prev_bind_0_$45 = $within_assert$.currentBinding(thread);
                    try {
                        $within_assert$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject expansion = wff_el_expansion(expression, mt);
                        final SubLObject mt_$46 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$46 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                        try {
                            at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                            if ((NIL != expansion) && (!expression.equal(expansion))) {
                                final SubLObject _prev_bind_0_$47 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$49 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$50 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = wff_vars.$validating_expansionP$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = wff_vars.$wff_expansion_formula$.currentBinding(thread);
                                try {
                                    at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                                    wff_vars.$unexpanded_formula$.bind(expression, thread);
                                    wff_vars.$validate_expansionsP$.bind(NIL, thread);
                                    wff_vars.$validating_expansionP$.bind(T, thread);
                                    wff_vars.$wff_expansion_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_expansion_formula()) ? wff_vars.wff_expansion_formula() : expansion, thread);
                                    if (NIL == wfeP(expansion, mt_$46)) {
                                        wfeP = NIL;
                                    }
                                } finally {
                                    wff_vars.$wff_expansion_formula$.rebind(_prev_bind_5, thread);
                                    wff_vars.$validating_expansionP$.rebind(_prev_bind_4, thread);
                                    wff_vars.$validate_expansionsP$.rebind(_prev_bind_2_$50, thread);
                                    wff_vars.$unexpanded_formula$.rebind(_prev_bind_1_$49, thread);
                                    at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0_$47, thread);
                                }
                            }
                        } finally {
                            at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0_$46, thread);
                        }
                    } finally {
                        $within_assert$.rebind(_prev_bind_0_$45, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return wfeP;
    }

    public static final SubLObject wfe_intP_alt(SubLObject expression) {
        {
            SubLObject wfeP = NIL;
            if (NIL != term.function_termP(expression)) {
                wfeP = arg_type.at_nat_okP(expression, UNPROVIDED);
            } else {
                if (NIL != el_grammar.el_sentence_p(expression)) {
                    wfeP = com.cyc.cycjava.cycl.wff.wff_elf_intP(expression, UNPROVIDED);
                } else {
                    wfeP = T;
                }
            }
            com.cyc.cycjava.cycl.wff.note_wff_violations(at_utilities.semantic_violations());
            return wfeP;
        }
    }

    public static SubLObject wfe_intP(final SubLObject expression) {
        SubLObject wfeP = NIL;
        if (NIL != term.function_termP(expression)) {
            wfeP = arg_type.at_nat_okP(expression, UNPROVIDED);
        } else
            if (NIL != el_grammar.el_sentence_p(expression)) {
                wfeP = wff_elf_intP(expression, UNPROVIDED);
            } else {
                wfeP = T;
            }

        note_wff_violations(at_utilities.semantic_violations());
        return wfeP;
    }

    public static final SubLObject wff_note_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($wff_trace_level$.getDynamicValue(thread).numGE(level)) {
                format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject wff_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($wff_trace_level$.getDynamicValue(thread).numGE(level)) {
            format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject wff_error_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($wff_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, $wff_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    public static SubLObject wff_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($wff_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, $wff_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static final SubLObject wff_cerror_alt(SubLObject level, SubLObject continue_str, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($wff_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, $wff_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    public static SubLObject wff_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($wff_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, $wff_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static final SubLObject wff_warn_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($wff_trace_level$.getDynamicValue(thread).numGE(level)) {
                apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject wff_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($wff_trace_level$.getDynamicValue(thread).numGE(level)) {
            apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject wff_suggestions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$wff_suggestions$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_suggestions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$wff_suggestions$.getDynamicValue(thread);
    }

    public static final SubLObject reset_wff_suggestions_alt() {
        wff_vars.$wff_suggestions$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject reset_wff_suggestions() {
        wff_vars.$wff_suggestions$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject provide_wff_suggestionsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$provide_wff_suggestionsP$.getDynamicValue(thread);
        }
    }

    public static SubLObject provide_wff_suggestionsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$provide_wff_suggestionsP$.getDynamicValue(thread);
    }

    public static final SubLObject note_wff_suggestion_alt(SubLObject suggestion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item_var = suggestion;
                if (NIL == member(item_var, wff_vars.$wff_suggestions$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    wff_vars.$wff_suggestions$.setDynamicValue(cons(item_var, wff_vars.$wff_suggestions$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject note_wff_suggestion(final SubLObject suggestion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == member(suggestion, wff_vars.$wff_suggestions$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            wff_vars.$wff_suggestions$.setDynamicValue(cons(suggestion, wff_vars.$wff_suggestions$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject note_wff_suggestions_alt(SubLObject suggestions) {
        {
            SubLObject cdolist_list_var = suggestions;
            SubLObject suggestion = NIL;
            for (suggestion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suggestion = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.wff.note_wff_suggestion(suggestion);
            }
        }
        return NIL;
    }

    public static SubLObject note_wff_suggestions(final SubLObject suggestions) {
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_wff_suggestion(suggestion);
            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject how_make_wffP_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.wff.el_wffP(sentence, mt, UNPROVIDED)) {
            return $$True;
        } else {
            return com.cyc.cycjava.cycl.wff.wff_suggestions();
        }
    }

    public static SubLObject how_make_wffP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != el_wffP(sentence, mt, UNPROVIDED)) {
            return $$True;
        }
        return wff_suggestions();
    }

    public static final SubLObject how_make_wft_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.wff.el_wftP(v_term, mt, UNPROVIDED)) {
            return $$True;
        } else {
            return com.cyc.cycjava.cycl.wff.wff_suggestions();
        }
    }

    public static SubLObject how_make_wft(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != el_wftP(v_term, mt, UNPROVIDED)) {
            return $$True;
        }
        return wff_suggestions();
    }

    public static final SubLObject explanation_of_wff_suggestion_alt(SubLObject sentence, SubLObject mt, SubLObject suggestions) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (suggestions == UNPROVIDED) {
            suggestions = com.cyc.cycjava.cycl.wff.how_make_wffP(sentence, mt);
        }
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = suggestions;
            SubLObject suggestion = NIL;
            for (suggestion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suggestion = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = suggestion.first();
                    if (pcase_var.eql($CHANGE_MT)) {
                        {
                            SubLObject datum = suggestion.rest();
                            SubLObject current = datum;
                            SubLObject sentence_1 = NIL;
                            SubLObject mt_50 = NIL;
                            SubLObject accommodating_mts = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt78);
                            sentence_1 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt78);
                            mt_50 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt78);
                            accommodating_mts = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL == accommodating_mts) {
                                } else {
                                    if (!sentence.equal(sentence_1)) {
                                    } else {
                                        if (NIL != singletonP(accommodating_mts)) {
                                            v_answer = cons(format(NIL, $str_alt79$__Consider_asserting______s__in_m, sentence, accommodating_mts.first()), v_answer);
                                        } else {
                                            v_answer = cons(format(NIL, $str_alt80$__Consider_asserting______s__in_o, sentence, string_utilities.stringify_terms(accommodating_mts, $str_alt81$__, $str_alt82$__or_)), v_answer);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt78);
                            }
                        }
                    } else {
                        if (pcase_var.eql($REPLACE_TERM)) {
                            {
                                SubLObject datum = suggestion.rest();
                                SubLObject current = datum;
                                SubLObject old_term = NIL;
                                SubLObject new_term = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt84);
                                old_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt84);
                                new_term = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL == new_term) {
                                    } else {
                                        if (old_term.equal(new_term)) {
                                        } else {
                                            v_answer = cons(format(NIL, $str_alt85$__Consider_using_term______s__ins, new_term, old_term), v_answer);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt84);
                                }
                            }
                        } else {
                            if (pcase_var.eql($ASSERT)) {
                                {
                                    SubLObject datum = suggestion.rest();
                                    SubLObject current = datum;
                                    SubLObject sentence_1 = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt86);
                                    sentence_1 = current.first();
                                    current = current.rest();
                                    {
                                        SubLObject mt_51 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                        destructuring_bind_must_listp(current, datum, $list_alt86);
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != mt_51) {
                                                v_answer = cons(format(NIL, $str_alt87$__Consider_asserting______s____in, sentence_1, mt_51), v_answer);
                                            } else {
                                                v_answer = cons(format(NIL, $str_alt88$__Consider_asserting______s_, sentence_1), v_answer);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt86);
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($UNASSERT)) {
                                    {
                                        SubLObject datum = suggestion.rest();
                                        SubLObject current = datum;
                                        SubLObject sentence_1 = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt86);
                                        sentence_1 = current.first();
                                        current = current.rest();
                                        {
                                            SubLObject mt_52 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                            destructuring_bind_must_listp(current, datum, $list_alt86);
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (NIL != mt_52) {
                                                    v_answer = cons(format(NIL, $str_alt90$__Consider_unasserting______s____, sentence_1, mt_52), v_answer);
                                                } else {
                                                    v_answer = cons(format(NIL, $str_alt91$__Consider_unasserting______s_, sentence_1), v_answer);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt86);
                                            }
                                        }
                                    }
                                } else {
                                    v_answer = cons(format(NIL, $str_alt92$__No_explanation_template_exists_, suggestion), v_answer);
                                }
                            }
                        }
                    }
                }
            }
            return string_utilities.strcat(nreverse(v_answer));
        }
    }

    public static SubLObject explanation_of_wff_suggestion(final SubLObject sentence, SubLObject mt, SubLObject suggestions) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (suggestions == UNPROVIDED) {
            suggestions = how_make_wffP(sentence, mt);
        }
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = suggestion.first();
            if (pcase_var.eql($CHANGE_MT)) {
                SubLObject current;
                final SubLObject datum = current = suggestion.rest();
                SubLObject sentence_1 = NIL;
                SubLObject mt_$51 = NIL;
                SubLObject accommodating_mts = NIL;
                destructuring_bind_must_consp(current, datum, $list86);
                sentence_1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list86);
                mt_$51 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list86);
                accommodating_mts = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != accommodating_mts) {
                        if (sentence.equal(sentence_1)) {
                            if (NIL != list_utilities.singletonP(accommodating_mts)) {
                                v_answer = cons(format(NIL, $str87$__Consider_asserting______s__in_m, sentence, accommodating_mts.first()), v_answer);
                            } else {
                                v_answer = cons(format(NIL, $str88$__Consider_asserting______s__in_o, sentence, string_utilities.stringify_terms(accommodating_mts, $str89$__, $str90$__or_)), v_answer);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list86);
                }
            } else
                if (pcase_var.eql($REPLACE_TERM)) {
                    SubLObject current;
                    final SubLObject datum = current = suggestion.rest();
                    SubLObject old_term = NIL;
                    SubLObject new_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list92);
                    old_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list92);
                    new_term = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != new_term) {
                            if (!old_term.equal(new_term)) {
                                v_answer = cons(format(NIL, $str93$__Consider_using_term______s__ins, new_term, old_term), v_answer);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list92);
                    }
                } else
                    if (pcase_var.eql($ASSERT)) {
                        SubLObject current;
                        final SubLObject datum = current = suggestion.rest();
                        SubLObject sentence_1 = NIL;
                        destructuring_bind_must_consp(current, datum, $list94);
                        sentence_1 = current.first();
                        current = current.rest();
                        final SubLObject mt_$52 = (current.isCons()) ? current.first() : NIL;
                        destructuring_bind_must_listp(current, datum, $list94);
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != mt_$52) {
                                v_answer = cons(format(NIL, $str95$__Consider_asserting______s____in, sentence_1, mt_$52), v_answer);
                            } else {
                                v_answer = cons(format(NIL, $str96$__Consider_asserting______s_, sentence_1), v_answer);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list94);
                        }
                    } else
                        if (pcase_var.eql($UNASSERT)) {
                            SubLObject current;
                            final SubLObject datum = current = suggestion.rest();
                            SubLObject sentence_1 = NIL;
                            destructuring_bind_must_consp(current, datum, $list94);
                            sentence_1 = current.first();
                            current = current.rest();
                            final SubLObject mt_$53 = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list94);
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != mt_$53) {
                                    v_answer = cons(format(NIL, $str98$__Consider_unasserting______s____, sentence_1, mt_$53), v_answer);
                                } else {
                                    v_answer = cons(format(NIL, $str99$__Consider_unasserting______s_, sentence_1), v_answer);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list94);
                            }
                        } else {
                            v_answer = cons(format(NIL, $str100$__No_explanation_template_exists_, suggestion), v_answer);
                        }



            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        } 
        return string_utilities.strcat(nreverse(v_answer));
    }

    public static final SubLObject explanation_of_wft_suggestion_alt(SubLObject v_term, SubLObject mt, SubLObject suggestions) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (suggestions == UNPROVIDED) {
            suggestions = com.cyc.cycjava.cycl.wff.how_make_wft(v_term, mt);
        }
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = suggestions;
            SubLObject suggestion = NIL;
            for (suggestion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suggestion = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = suggestion.first();
                    if (pcase_var.eql($CHANGE_MT)) {
                        {
                            SubLObject datum = suggestion.rest();
                            SubLObject current = datum;
                            SubLObject term_1 = NIL;
                            SubLObject mt_53 = NIL;
                            SubLObject accommodating_mts = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt93);
                            term_1 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt93);
                            mt_53 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt93);
                            accommodating_mts = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL == accommodating_mts) {
                                } else {
                                    if (!v_term.equal(term_1)) {
                                    } else {
                                        if (NIL != singletonP(accommodating_mts)) {
                                            v_answer = cons(format(NIL, $str_alt94$__Consider_referencing______s__in, v_term, accommodating_mts.first()), v_answer);
                                        } else {
                                            v_answer = cons(format(NIL, $str_alt80$__Consider_asserting______s__in_o, v_term, string_utilities.stringify_terms(accommodating_mts, $str_alt81$__, $str_alt82$__or_)), v_answer);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt93);
                            }
                        }
                    } else {
                        if (pcase_var.eql($REPLACE_TERM)) {
                            {
                                SubLObject datum = suggestion.rest();
                                SubLObject current = datum;
                                SubLObject old_term = NIL;
                                SubLObject new_term = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt84);
                                old_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt84);
                                new_term = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL == new_term) {
                                    } else {
                                        if (old_term.equal(new_term)) {
                                        } else {
                                            v_answer = cons(format(NIL, $str_alt85$__Consider_using_term______s__ins, new_term, old_term), v_answer);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt84);
                                }
                            }
                        } else {
                            if (pcase_var.eql($ASSERT)) {
                                {
                                    SubLObject datum = suggestion.rest();
                                    SubLObject current = datum;
                                    SubLObject term_1 = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt95);
                                    term_1 = current.first();
                                    current = current.rest();
                                    {
                                        SubLObject mt_54 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                        destructuring_bind_must_listp(current, datum, $list_alt95);
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != mt_54) {
                                                v_answer = cons(format(NIL, $str_alt87$__Consider_asserting______s____in, term_1, mt_54), v_answer);
                                            } else {
                                                v_answer = cons(format(NIL, $str_alt88$__Consider_asserting______s_, term_1), v_answer);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt95);
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($UNASSERT)) {
                                    {
                                        SubLObject datum = suggestion.rest();
                                        SubLObject current = datum;
                                        SubLObject term_1 = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt95);
                                        term_1 = current.first();
                                        current = current.rest();
                                        {
                                            SubLObject mt_55 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                            destructuring_bind_must_listp(current, datum, $list_alt95);
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (NIL != mt_55) {
                                                    v_answer = cons(format(NIL, $str_alt90$__Consider_unasserting______s____, term_1, mt_55), v_answer);
                                                } else {
                                                    v_answer = cons(format(NIL, $str_alt91$__Consider_unasserting______s_, term_1), v_answer);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt95);
                                            }
                                        }
                                    }
                                } else {
                                    v_answer = cons(format(NIL, $str_alt92$__No_explanation_template_exists_, suggestion), v_answer);
                                }
                            }
                        }
                    }
                }
            }
            return string_utilities.strcat(nreverse(v_answer));
        }
    }

    public static SubLObject explanation_of_wft_suggestion(final SubLObject v_term, SubLObject mt, SubLObject suggestions) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (suggestions == UNPROVIDED) {
            suggestions = how_make_wft(v_term, mt);
        }
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = suggestion.first();
            if (pcase_var.eql($CHANGE_MT)) {
                SubLObject current;
                final SubLObject datum = current = suggestion.rest();
                SubLObject term_1 = NIL;
                SubLObject mt_$54 = NIL;
                SubLObject accommodating_mts = NIL;
                destructuring_bind_must_consp(current, datum, $list101);
                term_1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list101);
                mt_$54 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list101);
                accommodating_mts = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != accommodating_mts) {
                        if (v_term.equal(term_1)) {
                            if (NIL != list_utilities.singletonP(accommodating_mts)) {
                                v_answer = cons(format(NIL, $str102$__Consider_referencing______s__in, v_term, accommodating_mts.first()), v_answer);
                            } else {
                                v_answer = cons(format(NIL, $str88$__Consider_asserting______s__in_o, v_term, string_utilities.stringify_terms(accommodating_mts, $str89$__, $str90$__or_)), v_answer);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list101);
                }
            } else
                if (pcase_var.eql($REPLACE_TERM)) {
                    SubLObject current;
                    final SubLObject datum = current = suggestion.rest();
                    SubLObject old_term = NIL;
                    SubLObject new_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list92);
                    old_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list92);
                    new_term = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != new_term) {
                            if (!old_term.equal(new_term)) {
                                v_answer = cons(format(NIL, $str93$__Consider_using_term______s__ins, new_term, old_term), v_answer);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list92);
                    }
                } else
                    if (pcase_var.eql($ASSERT)) {
                        SubLObject current;
                        final SubLObject datum = current = suggestion.rest();
                        SubLObject term_1 = NIL;
                        destructuring_bind_must_consp(current, datum, $list103);
                        term_1 = current.first();
                        current = current.rest();
                        final SubLObject mt_$55 = (current.isCons()) ? current.first() : NIL;
                        destructuring_bind_must_listp(current, datum, $list103);
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != mt_$55) {
                                v_answer = cons(format(NIL, $str95$__Consider_asserting______s____in, term_1, mt_$55), v_answer);
                            } else {
                                v_answer = cons(format(NIL, $str96$__Consider_asserting______s_, term_1), v_answer);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list103);
                        }
                    } else
                        if (pcase_var.eql($UNASSERT)) {
                            SubLObject current;
                            final SubLObject datum = current = suggestion.rest();
                            SubLObject term_1 = NIL;
                            destructuring_bind_must_consp(current, datum, $list103);
                            term_1 = current.first();
                            current = current.rest();
                            final SubLObject mt_$56 = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list103);
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != mt_$56) {
                                    v_answer = cons(format(NIL, $str98$__Consider_unasserting______s____, term_1, mt_$56), v_answer);
                                } else {
                                    v_answer = cons(format(NIL, $str99$__Consider_unasserting______s_, term_1), v_answer);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list103);
                            }
                        } else {
                            v_answer = cons(format(NIL, $str100$__No_explanation_template_exists_, suggestion), v_answer);
                        }



            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        } 
        return string_utilities.strcat(nreverse(v_answer));
    }

    public static final SubLObject accumulating_el_violationsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) || (NIL != czer_vars.$accumulating_semantic_violationsP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject accumulating_el_violationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) || (NIL != czer_vars.$accumulating_semantic_violationsP$.getDynamicValue(thread)));
    }

    public static final SubLObject note_arity_violation_alt(SubLObject note) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == wff_vars.$arity_violations$.getDynamicValue(thread)) || (NIL != com.cyc.cycjava.cycl.wff.accumulating_el_violationsP())) {
                if (NIL == wff_vars.wff_violation_data_terseP()) {
                    note = append(note, at_routines.wff_violation_verbose_data());
                }
                wff_vars.$arity_violations$.setDynamicValue(cons(note, wff_vars.$arity_violations$.getDynamicValue(thread)), thread);
                com.cyc.cycjava.cycl.wff.note_wff_violation(note);
            }
            return NIL;
        }
    }

    public static SubLObject note_arity_violation(SubLObject note) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == wff_vars.$arity_violations$.getDynamicValue(thread)) || (NIL != accumulating_el_violationsP())) {
            if (NIL == wff_vars.wff_violation_data_terseP()) {
                note = append(note, at_routines.wff_violation_verbose_data());
            }
            wff_vars.$arity_violations$.setDynamicValue(cons(note, wff_vars.$arity_violations$.getDynamicValue(thread)), thread);
            note_wff_violation(note);
        }
        return NIL;
    }

    /**
     * Identify how el sentence SENTENCE fails syntactic or semantic constraints
     */
    @LispMethod(comment = "Identify how el sentence SENTENCE fails syntactic or semantic constraints")
    public static final SubLObject diagnose_el_formula_alt(SubLObject sentence, SubLObject mt, SubLObject io_mode) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        SubLTrampolineFile.checkType(sentence, LISTP);
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return com.cyc.cycjava.cycl.wff.explain_why_not_wff(sentence, mt, UNPROVIDED);
            } else {
                if (pcase_var.eql($HL)) {
                    return com.cyc.cycjava.cycl.wff.why_not_wff(sentence, mt, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Identify how el sentence SENTENCE fails syntactic or semantic constraints")
    public static SubLObject diagnose_el_formula(final SubLObject sentence, SubLObject mt, SubLObject io_mode) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        SubLTrampolineFile.enforceType(sentence, LISTP);
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql($NL)) {
            return explain_why_not_wff(sentence, mt, UNPROVIDED);
        }
        if (pcase_var.eql($HL)) {
            return why_not_wff(sentence, mt, UNPROVIDED);
        }
        return NIL;
    }/**
     * Identify how el sentence SENTENCE fails syntactic or semantic constraints
     */


    /**
     * Identify how el term TERM fails syntactic or semantic constraints
     */
    @LispMethod(comment = "Identify how el term TERM fails syntactic or semantic constraints")
    public static final SubLObject diagnose_el_term_alt(SubLObject v_term, SubLObject mt, SubLObject io_mode) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return com.cyc.cycjava.cycl.wff.explain_why_not_wft(v_term, mt, UNPROVIDED);
            } else {
                if (pcase_var.eql($HL)) {
                    return com.cyc.cycjava.cycl.wff.why_not_wft(v_term, mt, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Identify how el term TERM fails syntactic or semantic constraints")
    public static SubLObject diagnose_el_term(final SubLObject v_term, SubLObject mt, SubLObject io_mode) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql($NL)) {
            return explain_why_not_wft(v_term, mt, UNPROVIDED);
        }
        if (pcase_var.eql($HL)) {
            return why_not_wft(v_term, mt, UNPROVIDED);
        }
        return NIL;
    }/**
     * Identify how el term TERM fails syntactic or semantic constraints
     */


    public static final SubLObject why_not_wff_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$wff_violations$.currentBinding(thread);
                    SubLObject _prev_bind_5 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(T, thread);
                        at_vars.$accumulating_at_violationsP$.bind(T, thread);
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                        {
                            SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                            SubLObject svs = wff_svs;
                            {
                                SubLObject _prev_bind_0_56 = wff_vars.$wff_properties$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_properties$.bind(svs, thread);
                                    {
                                        SubLObject svs_var = svs;
                                        SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                                        {
                                            SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                            final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                            try {
                                                bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                                com.cyc.cycjava.cycl.wff.el_wffP(sentence, mt, UNPROVIDED);
                                                if (NIL != hlmt.hlmt_p(mt)) {
                                                    if (NIL == com.cyc.cycjava.cycl.wff.wff_violations()) {
                                                        {
                                                            SubLObject mt_var = mt;
                                                            {
                                                                SubLObject _prev_bind_0_57 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_58 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                                                    simplifier.simplify_cycl_sentence(sentence, UNPROVIDED);
                                                                } finally {
                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_58, thread);
                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_57, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                result = com.cyc.cycjava.cycl.wff.wff_violations();
                                            } finally {
                                                rebind_dynamic_vars(cprogv_var, old_values);
                                            }
                                        }
                                    }
                                } finally {
                                    wff_vars.$wff_properties$.rebind(_prev_bind_0_56, thread);
                                }
                            }
                        }
                    } finally {
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_5, thread);
                        wff_vars.$wff_violations$.rebind(_prev_bind_4, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject why_not_wff(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$wff_violations$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wff_vars.$wff_violations$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
            final SubLObject svs;
            final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
            final SubLObject _prev_bind_0_$57 = wff_vars.$wff_properties$.currentBinding(thread);
            try {
                wff_vars.$wff_properties$.bind(svs, thread);
                final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                    SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                    el_wffP(sentence, mt, UNPROVIDED);
                    if ((NIL != hlmt.hlmt_p(mt)) && (NIL == wff_violations())) {
                        final SubLObject mt_var = mt;
                        final SubLObject _prev_bind_0_$58 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$59 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            simplifier.simplify_cycl_sentence(sentence, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$59, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$58, thread);
                        }
                    }
                    result = wff_violations();
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
            } finally {
                wff_vars.$wff_properties$.rebind(_prev_bind_0_$57, thread);
            }
        } finally {
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_6, thread);
            wff_vars.$wff_violations$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject why_not_wff_assert_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    try {
                        $within_assert$.bind(T, thread);
                        {
                            SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                            SubLObject svs = wff_svs;
                            {
                                SubLObject _prev_bind_0_59 = wff_vars.$wff_properties$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_properties$.bind(svs, thread);
                                    {
                                        SubLObject svs_var = svs;
                                        SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                                        {
                                            SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                            final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                            try {
                                                bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                                result = com.cyc.cycjava.cycl.wff.why_not_wff(sentence, mt, UNPROVIDED);
                                            } finally {
                                                rebind_dynamic_vars(cprogv_var, old_values);
                                            }
                                        }
                                    }
                                } finally {
                                    wff_vars.$wff_properties$.rebind(_prev_bind_0_59, thread);
                                }
                            }
                        }
                    } finally {
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject why_not_wff_assert(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            final SubLObject svs;
            final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
            final SubLObject _prev_bind_0_$60 = wff_vars.$wff_properties$.currentBinding(thread);
            try {
                wff_vars.$wff_properties$.bind(svs, thread);
                final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                    SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                    result = why_not_wff(sentence, mt, UNPROVIDED);
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
            } finally {
                wff_vars.$wff_properties$.rebind(_prev_bind_0_$60, thread);
            }
        } finally {
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject why_not_wft_alt(SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$wff_violations$.currentBinding(thread);
                    SubLObject _prev_bind_5 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(T, thread);
                        at_vars.$accumulating_at_violationsP$.bind(T, thread);
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                        {
                            SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                            SubLObject svs = wff_svs;
                            {
                                SubLObject _prev_bind_0_60 = wff_vars.$wff_properties$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_properties$.bind(svs, thread);
                                    {
                                        SubLObject svs_var = svs;
                                        SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                                        {
                                            SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                            final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                            try {
                                                bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                                com.cyc.cycjava.cycl.wff.el_wftP(v_term, mt, UNPROVIDED);
                                                if (NIL != hlmt.hlmt_p(mt)) {
                                                    if (NIL == com.cyc.cycjava.cycl.wff.wff_violations()) {
                                                        {
                                                            SubLObject mt_var = mt;
                                                            {
                                                                SubLObject _prev_bind_0_61 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_62 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                                                    simplifier.simplify_cycl_term(v_term, symbol_function($sym29$EL_VAR_));
                                                                } finally {
                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_62, thread);
                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_61, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                result = com.cyc.cycjava.cycl.wff.wff_violations();
                                            } finally {
                                                rebind_dynamic_vars(cprogv_var, old_values);
                                            }
                                        }
                                    }
                                } finally {
                                    wff_vars.$wff_properties$.rebind(_prev_bind_0_60, thread);
                                }
                            }
                        }
                    } finally {
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_5, thread);
                        wff_vars.$wff_violations$.rebind(_prev_bind_4, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject why_not_wft(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$wff_violations$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wff_vars.$wff_violations$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
            final SubLObject svs;
            final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
            final SubLObject _prev_bind_0_$61 = wff_vars.$wff_properties$.currentBinding(thread);
            try {
                wff_vars.$wff_properties$.bind(svs, thread);
                final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                    SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                    el_wftP(v_term, mt, UNPROVIDED);
                    if ((NIL != hlmt.hlmt_p(mt)) && (NIL == wff_violations())) {
                        final SubLObject mt_var = mt;
                        final SubLObject _prev_bind_0_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$63 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            simplifier.simplify_cycl_term(v_term, symbol_function($sym35$EL_VAR_));
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$63, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$62, thread);
                        }
                    }
                    result = wff_violations();
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
            } finally {
                wff_vars.$wff_properties$.rebind(_prev_bind_0_$61, thread);
            }
        } finally {
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_6, thread);
            wff_vars.$wff_violations$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject why_not_wff_ask_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = v_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$wff_violations$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(T, thread);
                        at_vars.$accumulating_at_violationsP$.bind(T, thread);
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        {
                            SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                            SubLObject svs = wff_svs;
                            {
                                SubLObject _prev_bind_0_63 = wff_vars.$wff_properties$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_properties$.bind(svs, thread);
                                    {
                                        SubLObject svs_var = svs;
                                        SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                                        {
                                            SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                            final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                            try {
                                                bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                                com.cyc.cycjava.cycl.wff.wff_queryP(sentence, mt, UNPROVIDED);
                                                result = com.cyc.cycjava.cycl.wff.wff_violations();
                                            } finally {
                                                rebind_dynamic_vars(cprogv_var, old_values);
                                            }
                                        }
                                    }
                                } finally {
                                    wff_vars.$wff_properties$.rebind(_prev_bind_0_63, thread);
                                }
                            }
                        }
                    } finally {
                        wff_vars.$wff_violations$.rebind(_prev_bind_4, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject why_not_wff_ask(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$wff_violations$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wff_vars.$wff_violations$.bind(NIL, thread);
            final SubLObject svs;
            final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
            final SubLObject _prev_bind_0_$64 = wff_vars.$wff_properties$.currentBinding(thread);
            try {
                wff_vars.$wff_properties$.bind(svs, thread);
                final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                    SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                    wff_queryP(sentence, mt, UNPROVIDED);
                    result = wff_violations();
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
            } finally {
                wff_vars.$wff_properties$.rebind(_prev_bind_0_$64, thread);
            }
        } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject cb_why_not_wff_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    try {
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        wff_utilities.$check_var_typesP$.bind(T, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.wff.explanation_of_why_not_wff(sentence, mt, UNPROVIDED);
                    } finally {
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_1, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cb_why_not_wff(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            wff_utilities.$check_var_typesP$.bind(T, thread);
            wff_utilities.$check_wff_coherenceP$.bind(T, thread);
            result = explanation_of_why_not_wff(sentence, mt, UNPROVIDED);
        } finally {
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_2, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject reset_wff_violations_alt() {
        wff_vars.$wff_violations$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject reset_wff_violations() {
        wff_vars.$wff_violations$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject wff_violations_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$wff_violations$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_violations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$wff_violations$.getDynamicValue(thread);
    }

    public static final SubLObject note_wff_violationP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != wff_vars.$noting_wff_violationsP$.getDynamicValue(thread)) && ((NIL == com.cyc.cycjava.cycl.wff.wff_violations()) || (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))));
        }
    }

    public static SubLObject note_wff_violationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != wff_vars.$noting_wff_violationsP$.getDynamicValue(thread)) && ((NIL == wff_violations()) || (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))));
    }

    /**
     *
     *
     * @param violation
     * 		a list, the first element of which is a keyword indicating the type of violation, and the rest provide additional information about the violation.
     */
    @LispMethod(comment = "@param violation\r\n\t\ta list, the first element of which is a keyword indicating the type of violation, and the rest provide additional information about the violation.")
    public static final SubLObject note_wff_violation_alt(SubLObject violation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != wff_vars.wff_debugP()) {
                print(violation, UNPROVIDED);
            }
            if (NIL != com.cyc.cycjava.cycl.wff.note_wff_violationP()) {
                {
                    SubLObject item_var = violation;
                    if (NIL == member(item_var, wff_vars.$wff_violations$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        wff_vars.$wff_violations$.setDynamicValue(cons(item_var, wff_vars.$wff_violations$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param violation
     * 		a list, the first element of which is a keyword indicating the type of violation, and the rest provide additional information about the violation.
     */
    @LispMethod(comment = "@param violation\r\n\t\ta list, the first element of which is a keyword indicating the type of violation, and the rest provide additional information about the violation.")
    public static SubLObject note_wff_violation(final SubLObject violation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != wff_vars.wff_debugP()) {
            print(violation, UNPROVIDED);
        }
        if ((NIL != note_wff_violationP()) && (NIL == member(violation, wff_vars.$wff_violations$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY)))) {
            wff_vars.$wff_violations$.setDynamicValue(cons(violation, wff_vars.$wff_violations$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject note_wff_violations_alt(SubLObject violations) {
        {
            SubLObject cdolist_list_var = violations;
            SubLObject violation = NIL;
            for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.wff.note_wff_violation(violation);
            }
        }
        return NIL;
    }

    public static SubLObject note_wff_violations(final SubLObject violations) {
        SubLObject cdolist_list_var = violations;
        SubLObject violation = NIL;
        violation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_wff_violation(violation);
            cdolist_list_var = cdolist_list_var.rest();
            violation = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject explain_why_not_wff_alt(SubLObject sentence, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt102$___a, com.cyc.cycjava.cycl.wff.explanation_of_why_not_wff(sentence, mt, $list_alt103));
        return NIL;
    }

    public static SubLObject explain_why_not_wff(final SubLObject sentence, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str110$___a, explanation_of_why_not_wff(sentence, mt, $list111));
        return NIL;
    }

    public static final SubLObject explain_why_not_wff_ask_alt(SubLObject sentence, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt102$___a, com.cyc.cycjava.cycl.wff.explanation_of_why_not_wff_ask(sentence, mt, $list_alt103));
        return NIL;
    }

    public static SubLObject explain_why_not_wff_ask(final SubLObject sentence, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str110$___a, explanation_of_why_not_wff_ask(sentence, mt, $list111));
        return NIL;
    }

    public static final SubLObject explain_why_not_wff_assert_alt(SubLObject sentence, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt102$___a, com.cyc.cycjava.cycl.wff.explanation_of_why_not_wff_assert(sentence, mt, $list_alt103));
        return NIL;
    }

    public static SubLObject explain_why_not_wff_assert(final SubLObject sentence, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str110$___a, explanation_of_why_not_wff_assert(sentence, mt, $list111));
        return NIL;
    }

    public static final SubLObject explain_why_not_wft_alt(SubLObject v_term, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt102$___a, com.cyc.cycjava.cycl.wff.explanation_of_why_not_wft(v_term, mt, $list_alt103));
        return NIL;
    }

    public static SubLObject explain_why_not_wft(final SubLObject v_term, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str110$___a, explanation_of_why_not_wft(v_term, mt, $list111));
        return NIL;
    }

    public static final SubLObject hl_explain_why_not_wff_alt(SubLObject sentence, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (NIL != stream) {
            format(stream, $str_alt102$___a, com.cyc.cycjava.cycl.wff.hl_explanation_of_why_not_wff(sentence, mt));
        } else {
            return com.cyc.cycjava.cycl.wff.hl_explanation_of_why_not_wff(sentence, mt);
        }
        return NIL;
    }

    public static SubLObject hl_explain_why_not_wff(final SubLObject sentence, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (NIL != stream) {
            format(stream, $str110$___a, hl_explanation_of_why_not_wff(sentence, mt));
            return NIL;
        }
        return hl_explanation_of_why_not_wff(sentence, mt);
    }

    public static final SubLObject hl_explain_why_not_wft_alt(SubLObject nat, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (NIL != stream) {
            format(stream, $str_alt102$___a, com.cyc.cycjava.cycl.wff.hl_explanation_of_why_not_wft(nat, mt));
        } else {
            return com.cyc.cycjava.cycl.wff.hl_explanation_of_why_not_wft(nat, mt);
        }
        return NIL;
    }

    public static SubLObject hl_explain_why_not_wft(final SubLObject nat, SubLObject mt, SubLObject stream) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (NIL != stream) {
            format(stream, $str110$___a, hl_explanation_of_why_not_wft(nat, mt));
            return NIL;
        }
        return hl_explanation_of_why_not_wft(nat, mt);
    }

    public static final SubLObject hl_explanation_of_why_not_wff_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    try {
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.wff.hl_why_not_wff(sentence, mt);
                            SubLObject why_not = NIL;
                            for (why_not = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , why_not = cdolist_list_var.first()) {
                                v_answer = cons(com.cyc.cycjava.cycl.wff.explain_wff_violation_with_cycl_sentence(sentence, why_not), v_answer);
                            }
                        }
                    } finally {
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != el_conjunction_p(v_answer)) {
                    return v_answer;
                } else {
                    if (NIL != singletonP(v_answer)) {
                        return v_answer.first();
                    } else {
                        if (NIL != v_answer) {
                            return simplifier.conjoin(nreverse(v_answer), UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject hl_explanation_of_why_not_wff(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            SubLObject cdolist_list_var = hl_why_not_wff(sentence, mt);
            SubLObject why_not = NIL;
            why_not = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                v_answer = cons(explain_wff_violation_with_cycl_sentence(sentence, why_not), v_answer);
                cdolist_list_var = cdolist_list_var.rest();
                why_not = cdolist_list_var.first();
            } 
        } finally {
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != el_conjunction_p(v_answer)) {
            return v_answer;
        }
        if (NIL != list_utilities.singletonP(v_answer)) {
            return v_answer.first();
        }
        if (NIL != v_answer) {
            return simplifier.conjoin(nreverse(v_answer), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject hl_explanation_of_why_not_wft_alt(SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    try {
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.wff.hl_why_not_wft(nat, mt);
                            SubLObject why_not = NIL;
                            for (why_not = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , why_not = cdolist_list_var.first()) {
                                v_answer = cons(com.cyc.cycjava.cycl.wff.explain_wft_violation_with_cycl_sentence(nat, why_not), v_answer);
                            }
                        }
                    } finally {
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != el_conjunction_p(v_answer)) {
                    return v_answer;
                } else {
                    if (NIL != singletonP(v_answer)) {
                        return v_answer.first();
                    } else {
                        if (NIL != v_answer) {
                            return simplifier.simplify_cycl_conjunction(simplifier.conjoin(nreverse(v_answer), UNPROVIDED), UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject hl_explanation_of_why_not_wft(final SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            SubLObject cdolist_list_var = hl_why_not_wft(nat, mt);
            SubLObject why_not = NIL;
            why_not = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                v_answer = cons(explain_wft_violation_with_cycl_sentence(nat, why_not), v_answer);
                cdolist_list_var = cdolist_list_var.rest();
                why_not = cdolist_list_var.first();
            } 
        } finally {
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != el_conjunction_p(v_answer)) {
            return v_answer;
        }
        if (NIL != list_utilities.singletonP(v_answer)) {
            return v_answer.first();
        }
        if (NIL != v_answer) {
            return simplifier.simplify_cycl_conjunction(simplifier.conjoin(nreverse(v_answer), UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject hl_why_not_wff_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject violations = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = wff_vars.$wff_violations$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(T, thread);
                        at_vars.$accumulating_at_violationsP$.bind(T, thread);
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_64 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                            try {
                                wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                                com.cyc.cycjava.cycl.wff.el_wffP(sentence, mt, UNPROVIDED);
                            } finally {
                                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0_64, thread);
                            }
                        }
                        violations = com.cyc.cycjava.cycl.wff.wff_violations();
                    } finally {
                        wff_vars.$wff_violations$.rebind(_prev_bind_7, thread);
                        wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_6, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_5, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return violations;
            }
        }
    }

    public static SubLObject hl_why_not_wff(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_vars.$wff_violations$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            wff_vars.$wff_violations$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$65 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            try {
                wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                el_wffP(sentence, mt, UNPROVIDED);
            } finally {
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0_$65, thread);
            }
            violations = wff_violations();
        } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_8, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_7, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_6, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return violations;
    }

    public static final SubLObject hl_why_not_wft_alt(SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject violations = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = wff_vars.$wff_violations$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(T, thread);
                        at_vars.$accumulating_at_violationsP$.bind(T, thread);
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_65 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                            try {
                                wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                                com.cyc.cycjava.cycl.wff.el_wftP(nat, mt, UNPROVIDED);
                            } finally {
                                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0_65, thread);
                            }
                        }
                        violations = com.cyc.cycjava.cycl.wff.wff_violations();
                    } finally {
                        wff_vars.$wff_violations$.rebind(_prev_bind_7, thread);
                        wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_6, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_5, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return violations;
            }
        }
    }

    public static SubLObject hl_why_not_wft(final SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_vars.$wff_violations$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            wff_vars.$wff_violations$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$66 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            try {
                wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                el_wftP(nat, mt, UNPROVIDED);
            } finally {
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0_$66, thread);
            }
            violations = wff_violations();
        } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_8, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_7, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_6, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return violations;
    }

    /**
     * Gives an explanation of why SENTENCE is not wff in MT.
     */
    @LispMethod(comment = "Gives an explanation of why SENTENCE is not wff in MT.")
    public static final SubLObject explanation_of_why_not_wff_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject plist_var = v_properties;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                    }
                }
            }
        }
        {
            SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
            SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
            return com.cyc.cycjava.cycl.wff.explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $DEFAULT, v_properties);
        }
    }

    @LispMethod(comment = "Gives an explanation of why SENTENCE is not wff in MT.")
    public static SubLObject explanation_of_why_not_wff(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        final SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
        final SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
        return explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $DEFAULT, v_properties);
    }/**
     * Gives an explanation of why SENTENCE is not wff in MT.
     */


    /**
     * Gives an explanation of why SENTENCE is not wff to be asked in MT.
     */
    @LispMethod(comment = "Gives an explanation of why SENTENCE is not wff to be asked in MT.")
    public static final SubLObject explanation_of_why_not_wff_ask_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject plist_var = v_properties;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                    }
                }
            }
        }
        {
            SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
            SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
            return com.cyc.cycjava.cycl.wff.explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $ASK, v_properties);
        }
    }

    @LispMethod(comment = "Gives an explanation of why SENTENCE is not wff to be asked in MT.")
    public static SubLObject explanation_of_why_not_wff_ask(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        final SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
        final SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
        return explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $ASK, v_properties);
    }/**
     * Gives an explanation of why SENTENCE is not wff to be asked in MT.
     */


    /**
     * Gives an explanation of why SENTENCE is not wff to be asserted in MT.
     */
    @LispMethod(comment = "Gives an explanation of why SENTENCE is not wff to be asserted in MT.")
    public static final SubLObject explanation_of_why_not_wff_assert_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject plist_var = v_properties;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                    }
                }
            }
        }
        {
            SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
            SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
            return com.cyc.cycjava.cycl.wff.explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $ASSERT, v_properties);
        }
    }

    @LispMethod(comment = "Gives an explanation of why SENTENCE is not wff to be asserted in MT.")
    public static SubLObject explanation_of_why_not_wff_assert(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        final SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
        final SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
        return explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $ASSERT, v_properties);
    }/**
     * Gives an explanation of why SENTENCE is not wff to be asserted in MT.
     */


    public static SubLObject explanation_of_why_not_lenient_wff_assert(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        final SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
        final SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            wff_vars.$wff_mode$.bind($LENIENT, thread);
            result = explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $ASSERT, v_properties);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject explanation_of_why_not_wff_terse(final SubLObject sentence, SubLObject mt, SubLObject term_mappings, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (term_mappings == UNPROVIDED) {
            term_mappings = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        v_properties = list_utilities.maybe_putf(v_properties, $NL_VERBOSITY, $TERSE);
        v_properties = list_utilities.maybe_putf(v_properties, $NL_TERM_MAP, term_mappings);
        v_properties = list_utilities.maybe_putf(v_properties, $NL_LIST_OUTPUT, T);
        v_properties = list_utilities.maybe_putf(v_properties, $WFF_MODE, wff_vars.$wff_mode$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            wff_vars.$wff_mode$.bind(getf(v_properties, $WFF_MODE, UNPROVIDED), thread);
            final SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
            final SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
            result = explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $DEFAULT, v_properties);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject explanation_of_why_not_wff_terse_assert(final SubLObject sentence, SubLObject mt, SubLObject term_mappings, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (term_mappings == UNPROVIDED) {
            term_mappings = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        v_properties = list_utilities.maybe_putf(v_properties, $NL_VERBOSITY, $TERSE);
        v_properties = list_utilities.maybe_putf(v_properties, $NL_TERM_MAP, term_mappings);
        v_properties = list_utilities.maybe_putf(v_properties, $NL_LIST_OUTPUT, T);
        v_properties = list_utilities.maybe_putf(v_properties, $WFF_MODE, wff_vars.$wff_mode$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            wff_vars.$wff_mode$.bind(getf(v_properties, $WFF_MODE, UNPROVIDED), thread);
            final SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
            final SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
            result = explanation_of_why_not_wff_int(sentence, mt, io_mode, violations, $ASSERT, v_properties);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param WFF-CONTEXT;
     * 		:ask, :assert, or :default
     */
    @LispMethod(comment = "@param WFF-CONTEXT;\r\n\t\t:ask, :assert, or :default")
    public static final SubLObject explanation_of_why_not_wff_int_alt(SubLObject sentence, SubLObject mt, SubLObject io_mode, SubLObject violations, SubLObject wff_context, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                SubLObject svs = wff_svs;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_properties$.currentBinding(thread);
                    try {
                        wff_vars.$wff_properties$.bind(svs, thread);
                        {
                            SubLObject svs_var = svs;
                            SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                            {
                                SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                try {
                                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                    if (NIL == violations) {
                                        {
                                            SubLObject pcase_var = wff_context;
                                            if (pcase_var.eql($ASK)) {
                                                violations = com.cyc.cycjava.cycl.wff.why_not_wff_ask(sentence, mt, UNPROVIDED);
                                            } else {
                                                if (pcase_var.eql($ASSERT)) {
                                                    violations = com.cyc.cycjava.cycl.wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
                                                } else {
                                                    violations = com.cyc.cycjava.cycl.wff.why_not_wff(sentence, mt, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = violations;
                                        SubLObject why_not = NIL;
                                        for (why_not = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , why_not = cdolist_list_var.first()) {
                                            v_answer = cons(com.cyc.cycjava.cycl.wff.explain_wff_violation(why_not, io_mode), v_answer);
                                        }
                                    }
                                    if (((NIL != com.cyc.cycjava.cycl.wff.wff_suggestions()) && (NIL != com.cyc.cycjava.cycl.wff.provide_wff_suggestionsP())) && (io_mode == $NL)) {
                                        {
                                            SubLObject suggestions = com.cyc.cycjava.cycl.wff.explanation_of_wff_suggestion(sentence, mt, com.cyc.cycjava.cycl.wff.wff_suggestions());
                                            if (NIL != suggestions) {
                                                v_answer = cons(format(NIL, $str_alt102$___a, suggestions), v_answer);
                                            }
                                        }
                                    }
                                    v_answer = nreverse(v_answer);
                                    if ($NL == io_mode) {
                                        v_answer = string_utilities.strcat(v_answer);
                                    }
                                } finally {
                                    rebind_dynamic_vars(cprogv_var, old_values);
                                }
                            }
                        }
                    } finally {
                        wff_vars.$wff_properties$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     *
     *
     * @param WFF-CONTEXT;
     * 		:ask, :assert, or :default
     */
    @LispMethod(comment = "@param WFF-CONTEXT;\r\n\t\t:ask, :assert, or :default")
    public static SubLObject explanation_of_why_not_wff_int(final SubLObject sentence, final SubLObject mt, final SubLObject io_mode, SubLObject violations, final SubLObject wff_context, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject svs;
        final SubLObject wff_svs = svs = wff_macros.new_wff_special_variable_state(v_properties);
        final SubLObject _prev_bind_0 = wff_vars.$wff_properties$.currentBinding(thread);
        try {
            wff_vars.$wff_properties$.bind(svs, thread);
            final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
            final ArrayList old_values = extract_dynamic_values(cprogv_var);
            try {
                bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
                if (NIL == violations) {
                    if (wff_context.eql($ASK)) {
                        violations = why_not_wff_ask(sentence, mt, UNPROVIDED);
                    } else
                        if (wff_context.eql($ASSERT)) {
                            violations = why_not_wff_assert(sentence, mt, UNPROVIDED);
                        } else {
                            violations = why_not_wff(sentence, mt, UNPROVIDED);
                        }

                }
                SubLObject cdolist_list_var = violations;
                SubLObject why_not = NIL;
                why_not = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0_$67 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        v_answer = cons(explain_wff_violation(why_not, putf(v_properties, $IO_MODE, io_mode)), v_answer);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$67, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    why_not = cdolist_list_var.first();
                } 
                if (((NIL != wff_suggestions()) && (NIL != provide_wff_suggestionsP())) && (io_mode == $NL)) {
                    final SubLObject suggestions = explanation_of_wff_suggestion(sentence, mt, wff_suggestions());
                    if (NIL != suggestions) {
                        v_answer = cons(format(NIL, $str110$___a, suggestions), v_answer);
                    }
                }
                v_answer = nreverse(v_answer);
                if ($NL == io_mode) {
                    if (NIL != getf(v_properties, $NL_LIST_OUTPUT, UNPROVIDED)) {
                        v_answer = remove_duplicates(v_answer, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        v_answer = string_utilities.strcat(remove_duplicates(v_answer, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }
                }
            } finally {
                rebind_dynamic_vars(cprogv_var, old_values);
            }
        } finally {
            wff_vars.$wff_properties$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static final SubLObject explanation_of_why_not_wft_alt(SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject plist_var = v_properties;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                    }
                }
            }
        }
        {
            SubLObject v_answer = NIL;
            SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
            SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
            if (NIL == violations) {
                violations = com.cyc.cycjava.cycl.wff.why_not_wft(v_term, mt, UNPROVIDED);
            }
            {
                SubLObject cdolist_list_var = violations;
                SubLObject why_not = NIL;
                for (why_not = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , why_not = cdolist_list_var.first()) {
                    v_answer = cons(com.cyc.cycjava.cycl.wff.explain_wff_violation(why_not, io_mode), v_answer);
                }
            }
            if (((NIL != com.cyc.cycjava.cycl.wff.wff_suggestions()) && (NIL != com.cyc.cycjava.cycl.wff.provide_wff_suggestionsP())) && io_mode.eql($NL)) {
                {
                    SubLObject suggestions = com.cyc.cycjava.cycl.wff.explanation_of_wft_suggestion(v_term, mt, com.cyc.cycjava.cycl.wff.wff_suggestions());
                    if (NIL != suggestions) {
                        v_answer = cons(format(NIL, $str_alt102$___a, suggestions), v_answer);
                    }
                }
            }
            v_answer = nreverse(v_answer);
            if ($NL == io_mode) {
                v_answer = string_utilities.strcat(v_answer);
            }
            return v_answer;
        }
    }

    public static SubLObject explanation_of_why_not_wft(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_vars.wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        SubLObject v_answer = NIL;
        final SubLObject io_mode = getf(v_properties, $IO_MODE, $NL);
        SubLObject violations = getf(v_properties, $VIOLATIONS, NIL);
        if (NIL == violations) {
            violations = why_not_wft(v_term, mt, UNPROVIDED);
        }
        SubLObject cdolist_list_var = violations;
        SubLObject why_not = NIL;
        why_not = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_answer = cons(explain_wff_violation(why_not, v_properties), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            why_not = cdolist_list_var.first();
        } 
        if (((NIL != wff_suggestions()) && (NIL != provide_wff_suggestionsP())) && io_mode.eql($NL)) {
            final SubLObject suggestions = explanation_of_wft_suggestion(v_term, mt, wff_suggestions());
            if (NIL != suggestions) {
                v_answer = cons(format(NIL, $str110$___a, suggestions), v_answer);
            }
        }
        v_answer = nreverse(v_answer);
        if ($NL == io_mode) {
            v_answer = string_utilities.strcat(v_answer);
        }
        return v_answer;
    }

    public static final SubLObject explain_wff_violations_alt(SubLObject violations) {
        if (violations == UNPROVIDED) {
            violations = wff_vars.$wff_violations$.getDynamicValue();
        }
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = violations;
            SubLObject why_not = NIL;
            for (why_not = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , why_not = cdolist_list_var.first()) {
                v_answer = cons(com.cyc.cycjava.cycl.wff.explain_wff_violation(why_not, UNPROVIDED), v_answer);
            }
            return string_utilities.strcat(nreverse(v_answer));
        }
    }

    public static SubLObject explain_wff_violations(SubLObject violations) {
        if (violations == UNPROVIDED) {
            violations = wff_vars.$wff_violations$.getDynamicValue();
        }
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = violations;
        SubLObject why_not = NIL;
        why_not = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_answer = cons(explain_wff_violation(why_not, UNPROVIDED), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            why_not = cdolist_list_var.first();
        } 
        return string_utilities.strcat(nreverse(v_answer));
    }

    /**
     *
     *
     * @return CycL sentence; a CycL sentence explaining this wff violation.
     */
    @LispMethod(comment = "@return CycL sentence; a CycL sentence explaining this wff violation.")
    public static final SubLObject explain_wff_violation_with_cycl_sentence_alt(SubLObject sentence, SubLObject why_not) {
        {
            SubLObject explanation = com.cyc.cycjava.cycl.wff.explain_wff_violation(why_not, $HL);
            if (NIL != possibly_sentence_p(explanation)) {
                return explanation;
            } else {
                return list_to_elf(list($$not, list($$admittedSentence, list($$SubLQuoteFn, sentence))));
            }
        }
    }

    /**
     *
     *
     * @return CycL sentence; a CycL sentence explaining this wff violation.
     */
    @LispMethod(comment = "@return CycL sentence; a CycL sentence explaining this wff violation.")
    public static SubLObject explain_wff_violation_with_cycl_sentence(final SubLObject sentence, final SubLObject why_not) {
        final SubLObject explanation = explain_wff_violation(why_not, $list123);
        if (NIL != possibly_sentence_p(explanation)) {
            return explanation;
        }
        return list_to_elf(list($$not, list($$admittedSentence, list($$SubLQuoteFn, sentence))));
    }

    /**
     *
     *
     * @return CycL sentence; a CycL sentence explaining this wff violation.
     */
    @LispMethod(comment = "@return CycL sentence; a CycL sentence explaining this wff violation.")
    public static final SubLObject explain_wft_violation_with_cycl_sentence_alt(SubLObject nat, SubLObject why_not) {
        {
            SubLObject explanation = com.cyc.cycjava.cycl.wff.explain_wff_violation(why_not, $HL);
            if (NIL != possibly_sentence_p(explanation)) {
                return explanation;
            } else {
                return list_to_elf(list($$not, list($$admittedNAT, list($$SubLQuoteFn, nat))));
            }
        }
    }

    /**
     *
     *
     * @return CycL sentence; a CycL sentence explaining this wff violation.
     */
    @LispMethod(comment = "@return CycL sentence; a CycL sentence explaining this wff violation.")
    public static SubLObject explain_wft_violation_with_cycl_sentence(final SubLObject nat, final SubLObject why_not) {
        final SubLObject explanation = explain_wff_violation(why_not, $list123);
        if (NIL != possibly_sentence_p(explanation)) {
            return explanation;
        }
        return list_to_elf(list($$not, list($$admittedNAT, list($$SubLQuoteFn, nat))));
    }

    public static final SubLObject explain_wff_violation_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        SubLTrampolineFile.checkType(why_not, WFF_VIOLATION_P);
        if (NIL != why_not) {
            {
                SubLObject explanation_function = wff_module_datastructures.wff_violation_explanation_function(at_utilities.violation_type(why_not));
                if (NIL != explanation_function) {
                    return funcall(explanation_function, why_not, io_mode);
                } else {
                    return format(NIL, $str_alt113$__No_explanation_template_exists_, why_not);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_wff_violation(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != wff_module_datastructures.wff_violation_p(why_not) : "! wff_module_datastructures.wff_violation_p(why_not) " + ("wff_module_datastructures.wff_violation_p(why_not) " + "CommonSymbols.NIL != wff_module_datastructures.wff_violation_p(why_not) ") + why_not;
        if (NIL == why_not) {
            return NIL;
        }
        final SubLObject explanation_function = wff_module_datastructures.wff_violation_explanation_function(at_utilities.violation_type(why_not));
        if (NIL != explanation_function) {
            return funcall(explanation_function, why_not, v_properties);
        }
        return format(NIL, $str129$__No_explanation_template_exists_, why_not);
    }

    public static SubLObject drill_down_on_wff_violations(final SubLObject wff_violations) {
        return Mapping.mapcar(DRILL_DOWN_ON_WFF_VIOLATION, wff_violations);
    }

    public static SubLObject drill_down_on_wff_violation(final SubLObject wff_violation) {
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = at_utilities.violation_type(wff_violation);
        if (pcase_var.eql($CONFLICT_ASSERTING_TRUE_SBHL)) {
            final SubLObject asent = second(wff_violation);
            final SubLObject mt = third(wff_violation);
            final SubLObject pcase_var_$68;
            final SubLObject pred = pcase_var_$68 = cycl_utilities.atomic_sentence_predicate(asent);
            if (pcase_var_$68.eql($$isa)) {
                final SubLObject ins = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                final SubLObject why_not_isa = isa.why_not_isaP(ins, col, mt, UNPROVIDED, UNPROVIDED);
                if (NIL != why_not_isa) {
                    return list($NOT_ISA, why_not_isa);
                }
            }
        }
        return wff_violation;
    }

    public static SubLObject why_not_wff_violations_to_supports(final SubLObject wff_violations) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = wff_violations;
        SubLObject wff_violation = NIL;
        wff_violation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$69 = list_utilities.tree_find_all_if(SUPPORT_P, wff_violation, UNPROVIDED);
            SubLObject support = NIL;
            support = cdolist_list_var_$69.first();
            while (NIL != cdolist_list_var_$69) {
                final SubLObject item_var = support;
                if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                support = cdolist_list_var_$69.first();
            } 
            final SubLObject possible_sentence = explain_wff_violation(wff_violation, $list123);
            if (NIL != possibly_cycl_sentence_p(possible_sentence)) {
                final SubLObject item_var2 = arguments.make_hl_support($OPAQUE, possible_sentence, UNPROVIDED, UNPROVIDED);
                if (NIL == member(item_var2, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    result = cons(item_var2, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            wff_violation = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject coherence_violations_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$coherence_violations$.getDynamicValue(thread);
        }
    }

    public static SubLObject coherence_violations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$coherence_violations$.getDynamicValue(thread);
    }

    public static final SubLObject why_not_coherent_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                SubLObject _prev_bind_1 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                try {
                    wff_utilities.$check_wff_coherenceP$.bind(T, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                    com.cyc.cycjava.cycl.wff.el_wffP(sentence, mt, UNPROVIDED);
                } finally {
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_1, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_0, thread);
                }
            }
            return com.cyc.cycjava.cycl.wff.coherence_violations();
        }
    }

    public static SubLObject why_not_coherent(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        try {
            wff_utilities.$check_wff_coherenceP$.bind(T, thread);
            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
            el_wffP(sentence, mt, UNPROVIDED);
        } finally {
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_2, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_0, thread);
        }
        return coherence_violations();
    }

    public static final SubLObject reset_coherence_violations_alt() {
        wff_vars.$coherence_violations$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject reset_coherence_violations() {
        wff_vars.$coherence_violations$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject note_coherence_violation_alt(SubLObject violation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            wff_vars.$coherence_violations$.setDynamicValue(cons(violation, wff_vars.$coherence_violations$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static SubLObject note_coherence_violation(final SubLObject violation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        wff_vars.$coherence_violations$.setDynamicValue(cons(violation, wff_vars.$coherence_violations$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject enable_assertive_wff() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enable_assertive_wff_forward_rules();
        wff_vars.$wff_mode$.setDynamicValue($ASSERTIVE, thread);
        return wff_vars.$wff_mode$.getDynamicValue(thread);
    }

    public static SubLObject disable_assertive_wff() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        disable_assertive_wff_forward_rules();
        wff_vars.$wff_mode$.setDynamicValue($STRICT, thread);
        return wff_vars.$wff_mode$.getDynamicValue(thread);
    }

    public static SubLObject assertive_wff_rules() {
        return remove_if($sym135$INVALID_ASSERTION_, assertive_wff_rules_cached(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_assertive_wff_rules_cached() {
        final SubLObject cs = $assertive_wff_rules_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_assertive_wff_rules_cached() {
        return memoization_state.caching_state_remove_function_results_with_args($assertive_wff_rules_cached_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertive_wff_rules_cached_internal() {
        return Mapping.mapcar(GAF_ARG1, kb_mapping.gather_predicate_extent_index($$assertiveWFFRule, $$UniversalVocabularyMt, UNPROVIDED));
    }

    public static SubLObject assertive_wff_rules_cached() {
        SubLObject caching_state = $assertive_wff_rules_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ASSERTIVE_WFF_RULES_CACHED, $assertive_wff_rules_cached_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(assertive_wff_rules_cached_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject enable_assertive_wff_forward_rules() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = assertive_wff_rules();
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_interface.kb_set_assertion_direction(rule, $FORWARD)) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject disable_assertive_wff_forward_rules() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = assertive_wff_rules();
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_interface.kb_set_assertion_direction(rule, $BACKWARD)) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject enable_inter_arg_isa_forward_rules() {
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list143, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list144, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list145, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list146, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list147, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list148, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list149, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list150, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list151, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list152, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list153, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list154, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list155, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list156, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list157, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list158, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list159, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list160, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list161, $$BaseKB), $FORWARD);
        assertions_interface.kb_set_assertion_direction(czer_meta.find_assertion_cycl($list162, $$BaseKB), $FORWARD);
        return TWENTY_INTEGER;
    }

    public static SubLObject forget_redundant_assertive_wff_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject list_var = assertive_wff_rules();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str163$Forgetting_redundant_assertive_wf, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject rule = NIL;
                rule = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject set_contents_var = assertions_high.assertion_dependents(rule);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject deduction;
                    SubLObject message_var;
                    SubLObject was_appendingP;
                    SubLObject _prev_bind_0_$70;
                    SubLObject _prev_bind_0_$71;
                    SubLObject _values;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        deduction = set_contents.do_set_contents_next(basis_object, state);
                        if ((((NIL != set_contents.do_set_contents_element_validP(state, deduction)) && (NIL != deduction_handles.valid_deductionP(deduction, UNPROVIDED))) && (NIL != assertive_wff_deductionP(deduction))) && (NIL != assertive_wff_deduction_redundantP(deduction))) {
                            message_var = NIL;
                            was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                            eval($list166);
                            try {
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    _prev_bind_0_$70 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            tms.tms_remove_deduction(deduction);
                                            count = add(count, ONE_INTEGER);
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$70, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                            } finally {
                                _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    _values = getValuesAsVector();
                                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                                }
                            }
                            if (message_var.isString()) {
                                Errors.warn($str169$_A, message_var);
                            }
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    rule = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        if (NIL == $silent_progressP$.getDynamicValue(thread)) {
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str170$Forgot__A_redundant_assertive_wff, count);
        }
        return count;
    }

    public static SubLObject assertive_wff_deductions_for_sentence(final SubLObject sentence, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var;
        final SubLObject assertions = cdolist_list_var = czer_meta.find_assertions_cycl(sentence, mt);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject items_var = assertive_wff_deductions(assertion);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(vector_var, element_num);
                    result = cons(item, result);
                }
            } else {
                SubLObject cdolist_list_var_$73 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$73.first();
                while (NIL != cdolist_list_var_$73) {
                    result = cons(item2, result);
                    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                    item2 = cdolist_list_var_$73.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject assertive_wff_deductions(final SubLObject assertion) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertive_wff_deductionP(argument)) {
                result = cons(argument, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject assertive_wff_deductionP(final SubLObject v_object) {
        if (NIL != deduction_handles.deduction_p(v_object)) {
            SubLObject cdolist_list_var = deductions_high.deduction_supports(v_object);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertive_wff_ruleP(support)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject assertive_wff_deduction_redundantP(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject redundant_supported_object = deductions_high.deduction_supported_object(deduction);
        if (NIL != assertions_high.gaf_assertionP(redundant_supported_object)) {
            final SubLObject redundant_assertion = redundant_supported_object;
            final SubLObject redundant_asent = assertions_high.gaf_hl_formula(redundant_assertion);
            thread.resetMultipleValues();
            final SubLObject pred = unmake_binary_formula(redundant_asent);
            final SubLObject redundant_arg1 = thread.secondMultipleValue();
            final SubLObject redundant_arg2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(deductions_high.deduction_mt(deduction));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(redundant_arg1, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(redundant_arg1, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$74 = NIL;
                                final SubLObject token_var_$75 = NIL;
                                while (NIL == done_var_$74) {
                                    final SubLObject candidate_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$75);
                                    final SubLObject valid_$76 = makeBoolean(!token_var_$75.eql(candidate_assertion));
                                    if ((NIL != valid_$76) && (!candidate_assertion.eql(redundant_assertion))) {
                                        final SubLObject candidate_arg2 = assertions_high.gaf_arg2(candidate_assertion);
                                        final SubLObject candidate_mt = assertions_high.assertion_mt(candidate_assertion);
                                        if (NIL != genls.genlsP(candidate_arg2, redundant_arg2, candidate_mt, UNPROVIDED)) {
                                            return T;
                                        }
                                    }
                                    done_var_$74 = makeBoolean(NIL == valid_$76);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
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
        }
        return NIL;
    }

    public static SubLObject assertive_wff_ruleP(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$assertiveWFFRule, v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject clear_wff_constraint_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        clear_wff_constraint_dependent_caches_internal();
        return NIL;
    }

    public static SubLObject clear_wff_constraint_dependent_caches_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inside_clear_wff_constraint_dependent_cachesP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = $inside_clear_wff_constraint_dependent_cachesP$.currentBinding(thread);
            try {
                $inside_clear_wff_constraint_dependent_cachesP$.bind(T, thread);
                SubLObject cdolist_list_var = memoization_state.$wff_constraint_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = NIL;
                callback = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != fboundp(callback)) {
                        funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                } 
            } finally {
                $inside_clear_wff_constraint_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject after_wff_constraint_satisfied(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arguments.asserted_argument_p(argument)) && (NIL != assertions_high.gaf_assertionP(assertion))) {
            final SubLObject pred = assertions_high.gaf_predicate(assertion);
            final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                final SubLObject pred_var = pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$78 = NIL;
                                final SubLObject token_var_$79 = NIL;
                                while (NIL == done_var_$78) {
                                    final SubLObject candidate_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$79);
                                    final SubLObject valid_$80 = makeBoolean(!token_var_$79.eql(candidate_assertion));
                                    if (NIL != valid_$80) {
                                        SubLObject cdolist_list_var = assertive_wff_deductions(candidate_assertion);
                                        SubLObject candidate_deduction = NIL;
                                        candidate_deduction = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            if (NIL != deduction_handles.valid_deductionP(candidate_deduction, UNPROVIDED)) {
                                                final SubLObject candidate_arg2 = assertions_high.gaf_arg2(candidate_assertion);
                                                final SubLObject candidate_mt = assertions_high.assertion_mt(candidate_assertion);
                                                if (NIL != genls.genlsP(arg2, candidate_arg2, candidate_mt, UNPROVIDED)) {
                                                    tms.tms_remove_deduction(candidate_deduction);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            candidate_deduction = cdolist_list_var.first();
                                        } 
                                    }
                                    done_var_$78 = makeBoolean(NIL == valid_$80);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt2$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt8$invalid_formula_type___s = makeString("invalid formula type: ~s");

    static private final SubLSymbol $sym21$EL_WFF_SYNTAX_ = makeSymbol("EL-WFF-SYNTAX?");

    static private final SubLList $list_alt22 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt23$Is_SENTENCE_well_formed_wrt_synta = makeString("Is SENTENCE well-formed wrt syntax?");

    static private final SubLList $list_alt24 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt27$Got_a_sentence_that_was_neither_a = makeString("Got a sentence that was neither atomic nor non-atomic in mt ~s: ~s");

    static private final SubLList $list_alt28 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"), reader_make_constant_shell("myCreator"), reader_make_constant_shell("myCreationTime"), reader_make_constant_shell("myCreationPurpose"), reader_make_constant_shell("myCreationSecond"));

    static private final SubLSymbol $sym29$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLSymbol $sym30$HL_VAR_ = makeSymbol("HL-VAR?");

    static private final SubLSymbol $sym31$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym33$MEMOIZED_SYNTACTICALLY_WF_FORMULA_ = makeSymbol("MEMOIZED-SYNTACTICALLY-WF-FORMULA?");

    public static final SubLSymbol $kw34$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_ = makeSymbol("MEMOIZED-SEMANTICALLY-WF-LITERAL?");

    public static final SubLObject declare_wff_file_alt() {
        declareFunction("el_wffP", "EL-WFF?", 1, 2, false);
        declareFunction("el_wff_assertibleP", "EL-WFF-ASSERTIBLE?", 1, 2, false);
        declareFunction("hl_wffP", "HL-WFF?", 1, 2, false);
        declareFunction("wffP", "WFF?", 1, 2, false);
        declareFunction("wff_in_any_mtP", "WFF-IN-ANY-MT?", 2, 0, false);
        declareFunction("reset_wff_state", "RESET-WFF-STATE", 0, 0, false);
        declareFunction("mal_precanonicalizationsP", "MAL-PRECANONICALIZATIONS?", 2, 0, false);
        declareFunction("syntactically_wff_elf_intP", "SYNTACTICALLY-WFF-ELF-INT?", 2, 0, false);
        declareFunction("wff_elfP", "WFF-ELF?", 2, 0, false);
        declareFunction("wff_el_expansion", "WFF-EL-EXPANSION", 2, 0, false);
        declareFunction("el_wff_syntaxP", "EL-WFF-SYNTAX?", 1, 1, false);
        declareFunction("wff_elf_intP", "WFF-ELF-INT?", 1, 1, false);
        declareFunction("why_not_semantically_wf_wrt_types", "WHY-NOT-SEMANTICALLY-WF-WRT-TYPES", 2, 0, false);
        declareFunction("semantically_wff_elf_intP", "SEMANTICALLY-WFF-ELF-INT?", 2, 0, false);
        declareFunction("wff_fast_gafP", "WFF-FAST-GAF?", 1, 0, false);
        declareFunction("wff_nafP", "WFF-NAF?", 1, 1, false);
        declareFunction("wff_cnfP", "WFF-CNF?", 1, 1, false);
        declareFunction("wff_cnf_intP", "WFF-CNF-INT?", 1, 0, false);
        declareFunction("wff_dnfP", "WFF-DNF?", 1, 1, false);
        declareFunction("wff_literalP", "WFF-LITERAL?", 1, 1, false);
        declareFunction("wff_queryP", "WFF-QUERY?", 1, 2, false);
        declareFunction("wff_check_arityP", "WFF-CHECK-ARITY?", 0, 0, false);
        declareFunction("arity_tests_applyP", "ARITY-TESTS-APPLY?", 2, 0, false);
        declareFunction("check_arityP", "CHECK-ARITY?", 0, 2, false);
        declareFunction("wff_check_argsP", "WFF-CHECK-ARGS?", 0, 0, false);
        declareFunction("wff_check_coherenceP", "WFF-CHECK-COHERENCE?", 0, 0, false);
        declareFunction("wff_check_varsP", "WFF-CHECK-VARS?", 0, 0, false);
        declareFunction("inhibit_skolem_assertsP", "INHIBIT-SKOLEM-ASSERTS?", 0, 0, false);
        declareFunction("enforce_evaluatable_satisfiabilityP", "ENFORCE-EVALUATABLE-SATISFIABILITY?", 0, 0, false);
        declareFunction("enforce_only_definitional_gafs_in_vocab_mtP", "ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?", 0, 0, false);
        declareFunction("enforce_literal_idiosyncrasiesP", "ENFORCE-LITERAL-IDIOSYNCRASIES?", 0, 0, false);
        declareFunction("check_var_typesP", "CHECK-VAR-TYPES?", 1, 1, false);
        declareFunction("no_wff_semanticsP", "NO-WFF-SEMANTICS?", 0, 0, false);
        declareFunction("no_wff_semantics_or_arityP", "NO-WFF-SEMANTICS-OR-ARITY?", 0, 0, false);
        declareFunction("wff_only_needs_syntactic_checksP", "WFF-ONLY-NEEDS-SYNTACTIC-CHECKS?", 0, 0, false);
        declareFunction("check_wff_expansionP", "CHECK-WFF-EXPANSION?", 1, 0, false);
        declareFunction("check_wff_coherenceP", "CHECK-WFF-COHERENCE?", 1, 1, false);
        declareFunction("wff_doneP", "WFF-DONE?", 0, 1, false);
        declareFunction("mal_fortsP", "MAL-FORTS?", 1, 0, false);
        declareFunction("mal_forts", "MAL-FORTS", 1, 0, false);
        declareFunction("valid_top_level_backward_inference_literalP", "VALID-TOP-LEVEL-BACKWARD-INFERENCE-LITERAL?", 1, 0, false);
        declareFunction("valid_intermediate_backward_inference_literalP", "VALID-INTERMEDIATE-BACKWARD-INFERENCE-LITERAL?", 1, 0, false);
        declareFunction("valid_top_level_forward_inference_literalP", "VALID-TOP-LEVEL-FORWARD-INFERENCE-LITERAL?", 1, 0, false);
        declareFunction("valid_intermediate_forward_inference_literalP", "VALID-INTERMEDIATE-FORWARD-INFERENCE-LITERAL?", 1, 0, false);
        declareFunction("semantically_wf_literalP", "SEMANTICALLY-WF-LITERAL?", 1, 1, false);
        declareFunction("memoized_syntactically_wf_formulaP_internal", "MEMOIZED-SYNTACTICALLY-WF-FORMULA?-INTERNAL", 1, 0, false);
        declareFunction("memoized_syntactically_wf_formulaP", "MEMOIZED-SYNTACTICALLY-WF-FORMULA?", 1, 0, false);
        declareFunction("semantically_wf_literal_in_any_mtP", "SEMANTICALLY-WF-LITERAL-IN-ANY-MT?", 1, 0, false);
        declareFunction("memoized_semantically_wf_literalP_internal", "MEMOIZED-SEMANTICALLY-WF-LITERAL?-INTERNAL", 4, 0, false);
        declareFunction("memoized_semantically_wf_literalP", "MEMOIZED-SEMANTICALLY-WF-LITERAL?", 4, 0, false);
        declareFunction("assertible_literalP", "ASSERTIBLE-LITERAL?", 1, 1, false);
        declareFunction("meta_sentence_referencing_defn_gaf_in_mtP", "META-SENTENCE-REFERENCING-DEFN-GAF-IN-MT?", 2, 0, false);
        declareFunction("definitional_predP", "DEFINITIONAL-PRED?", 1, 1, false);
        declareFunction("sbhl_literal_conflictP", "SBHL-LITERAL-CONFLICT?", 1, 1, false);
        declareFunction("sbhl_trueP", "SBHL-TRUE?", 1, 1, false);
        declareFunction("sbhl_falseP", "SBHL-FALSE?", 1, 1, false);
        declareFunction("non_editable_skolem_referenceP", "NON-EDITABLE-SKOLEM-REFERENCE?", 1, 0, false);
        declareFunction("pred_of_editable_skolem_gafP", "PRED-OF-EDITABLE-SKOLEM-GAF?", 1, 0, false);
        declareFunction("editable_skolem_predicateP", "EDITABLE-SKOLEM-PREDICATE?", 1, 0, false);
        declareFunction("inhibit_cyclic_commutative_in_argsP", "INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?", 0, 0, false);
        declareFunction("wff_wrt_literal_idiosyncrasiesP", "WFF-WRT-LITERAL-IDIOSYNCRASIES?", 2, 0, false);
        declareFunction("except_for_wffP", "EXCEPT-FOR-WFF?", 1, 0, false);
        declareFunction("tou_mt_okP", "TOU-MT-OK?", 2, 0, false);
        declareFunction("semantically_wf_non_atomic_sentenceP", "SEMANTICALLY-WF-NON-ATOMIC-SENTENCE?", 2, 0, false);
        declareFunction("all_subsentences_semantically_wfP", "ALL-SUBSENTENCES-SEMANTICALLY-WF?", 2, 0, false);
        declareFunction("subsentence_semantically_wfP", "SUBSENTENCE-SEMANTICALLY-WF?", 4, 0, false);
        declareFunction("semantically_wf_sentenceP", "SEMANTICALLY-WF-SENTENCE?", 2, 0, false);
        declareFunction("semantically_wf_sentence_in_any_mtP", "SEMANTICALLY-WF-SENTENCE-IN-ANY-MT?", 1, 0, false);
        declareFunction("memoized_semantically_wf_sentenceP_internal", "MEMOIZED-SEMANTICALLY-WF-SENTENCE?-INTERNAL", 2, 0, false);
        declareFunction("memoized_semantically_wf_sentenceP", "MEMOIZED-SEMANTICALLY-WF-SENTENCE?", 2, 0, false);
        declareFunction("mal_arityP", "MAL-ARITY?", 1, 0, false);
        declareFunction("clear_mal_actual_arity_cachedP", "CLEAR-MAL-ACTUAL-ARITY-CACHED?", 0, 0, false);
        new com.cyc.cycjava.cycl.wff.$clear_mal_actual_arity_cachedP$ZeroArityFunction();
        declareFunction("remove_mal_actual_arity_cachedP", "REMOVE-MAL-ACTUAL-ARITY-CACHED?", 2, 0, false);
        declareFunction("mal_actual_arity_cachedP_internal", "MAL-ACTUAL-ARITY-CACHED?-INTERNAL", 2, 0, false);
        declareFunction("mal_actual_arity_cachedP", "MAL-ACTUAL-ARITY-CACHED?", 2, 0, false);
        declareFunction("mal_arity_intP", "MAL-ARITY-INT?", 1, 0, false);
        declareFunction("mal_fixed_arityP", "MAL-FIXED-ARITY?", 1, 0, false);
        declareFunction("mal_variable_arityP", "MAL-VARIABLE-ARITY?", 1, 0, false);
        declareFunction("mal_arg_typesP", "MAL-ARG-TYPES?", 1, 1, false);
        declareFunction("wff_wrt_arg_typesP", "WFF-WRT-ARG-TYPES?", 1, 1, false);
        declareFunction("wff_coherentP", "WFF-COHERENT?", 1, 1, false);
        declareFunction("wff_incoherentP", "WFF-INCOHERENT?", 1, 1, false);
        declareFunction("elf_incoherentP", "ELF-INCOHERENT?", 1, 0, false);
        declareFunction("cnf_incoherentP", "CNF-INCOHERENT?", 1, 1, false);
        declareFunction("kwt_wffP", "KWT-WFF?", 1, 1, false);
        declareFunction("gat_wffP", "GAT-WFF?", 1, 1, false);
        declareFunction("el_formula_okP", "EL-FORMULA-OK?", 1, 1, false);
        declareFunction("formula_okP", "FORMULA-OK?", 1, 1, false);
        declareFunction("el_query_okP", "EL-QUERY-OK?", 1, 1, false);
        declareFunction("query_okP", "QUERY-OK?", 1, 1, false);
        declareFunction("why_not_query_ok", "WHY-NOT-QUERY-OK", 1, 1, false);
        declareFunction("el_wft_fastP", "EL-WFT-FAST?", 1, 1, false);
        declareFunction("el_wft_fast_in_mtP", "EL-WFT-FAST-IN-MT?", 2, 0, false);
        declareFunction("el_wftP", "EL-WFT?", 1, 2, false);
        declareFunction("el_wfeP", "EL-WFE?", 1, 2, false);
        declareFunction("wfeP", "WFE?", 1, 1, false);
        declareFunction("wfe_intP", "WFE-INT?", 1, 0, false);
        declareFunction("wff_note", "WFF-NOTE", 2, 5, false);
        declareFunction("wff_error", "WFF-ERROR", 2, 5, false);
        declareFunction("wff_cerror", "WFF-CERROR", 3, 5, false);
        declareFunction("wff_warn", "WFF-WARN", 2, 5, false);
        declareFunction("wff_suggestions", "WFF-SUGGESTIONS", 0, 0, false);
        declareFunction("reset_wff_suggestions", "RESET-WFF-SUGGESTIONS", 0, 0, false);
        declareFunction("provide_wff_suggestionsP", "PROVIDE-WFF-SUGGESTIONS?", 0, 0, false);
        declareFunction("note_wff_suggestion", "NOTE-WFF-SUGGESTION", 1, 0, false);
        declareFunction("note_wff_suggestions", "NOTE-WFF-SUGGESTIONS", 1, 0, false);
        declareFunction("how_make_wffP", "HOW-MAKE-WFF?", 1, 1, false);
        declareFunction("how_make_wft", "HOW-MAKE-WFT", 1, 1, false);
        declareFunction("explanation_of_wff_suggestion", "EXPLANATION-OF-WFF-SUGGESTION", 1, 2, false);
        declareFunction("explanation_of_wft_suggestion", "EXPLANATION-OF-WFT-SUGGESTION", 1, 2, false);
        declareFunction("accumulating_el_violationsP", "ACCUMULATING-EL-VIOLATIONS?", 0, 0, false);
        declareFunction("note_arity_violation", "NOTE-ARITY-VIOLATION", 1, 0, false);
        declareFunction("diagnose_el_formula", "DIAGNOSE-EL-FORMULA", 1, 2, false);
        declareFunction("diagnose_el_term", "DIAGNOSE-EL-TERM", 1, 2, false);
        declareFunction("why_not_wff", "WHY-NOT-WFF", 1, 2, false);
        declareFunction("why_not_wff_assert", "WHY-NOT-WFF-ASSERT", 1, 2, false);
        declareFunction("why_not_wft", "WHY-NOT-WFT", 1, 2, false);
        declareFunction("why_not_wff_ask", "WHY-NOT-WFF-ASK", 1, 2, false);
        declareFunction("cb_why_not_wff", "CB-WHY-NOT-WFF", 1, 1, false);
        declareFunction("reset_wff_violations", "RESET-WFF-VIOLATIONS", 0, 0, false);
        declareFunction("wff_violations", "WFF-VIOLATIONS", 0, 0, false);
        declareFunction("note_wff_violationP", "NOTE-WFF-VIOLATION?", 0, 0, false);
        declareFunction("note_wff_violation", "NOTE-WFF-VIOLATION", 1, 0, false);
        declareFunction("note_wff_violations", "NOTE-WFF-VIOLATIONS", 1, 0, false);
        declareFunction("explain_why_not_wff", "EXPLAIN-WHY-NOT-WFF", 1, 2, false);
        declareFunction("explain_why_not_wff_ask", "EXPLAIN-WHY-NOT-WFF-ASK", 1, 2, false);
        declareFunction("explain_why_not_wff_assert", "EXPLAIN-WHY-NOT-WFF-ASSERT", 1, 2, false);
        declareFunction("explain_why_not_wft", "EXPLAIN-WHY-NOT-WFT", 1, 2, false);
        declareFunction("hl_explain_why_not_wff", "HL-EXPLAIN-WHY-NOT-WFF", 1, 2, false);
        declareFunction("hl_explain_why_not_wft", "HL-EXPLAIN-WHY-NOT-WFT", 1, 2, false);
        declareFunction("hl_explanation_of_why_not_wff", "HL-EXPLANATION-OF-WHY-NOT-WFF", 1, 1, false);
        declareFunction("hl_explanation_of_why_not_wft", "HL-EXPLANATION-OF-WHY-NOT-WFT", 1, 1, false);
        declareFunction("hl_why_not_wff", "HL-WHY-NOT-WFF", 1, 1, false);
        declareFunction("hl_why_not_wft", "HL-WHY-NOT-WFT", 1, 1, false);
        declareFunction("explanation_of_why_not_wff", "EXPLANATION-OF-WHY-NOT-WFF", 1, 2, false);
        declareFunction("explanation_of_why_not_wff_ask", "EXPLANATION-OF-WHY-NOT-WFF-ASK", 1, 2, false);
        declareFunction("explanation_of_why_not_wff_assert", "EXPLANATION-OF-WHY-NOT-WFF-ASSERT", 1, 2, false);
        declareFunction("explanation_of_why_not_wff_int", "EXPLANATION-OF-WHY-NOT-WFF-INT", 6, 0, false);
        declareFunction("explanation_of_why_not_wft", "EXPLANATION-OF-WHY-NOT-WFT", 1, 2, false);
        declareFunction("explain_wff_violations", "EXPLAIN-WFF-VIOLATIONS", 0, 1, false);
        declareFunction("explain_wff_violation_with_cycl_sentence", "EXPLAIN-WFF-VIOLATION-WITH-CYCL-SENTENCE", 2, 0, false);
        declareFunction("explain_wft_violation_with_cycl_sentence", "EXPLAIN-WFT-VIOLATION-WITH-CYCL-SENTENCE", 2, 0, false);
        declareFunction("explain_wff_violation", "EXPLAIN-WFF-VIOLATION", 1, 1, false);
        declareFunction("coherence_violations", "COHERENCE-VIOLATIONS", 0, 0, false);
        declareFunction("why_not_coherent", "WHY-NOT-COHERENT", 1, 1, false);
        declareFunction("reset_coherence_violations", "RESET-COHERENCE-VIOLATIONS", 0, 0, false);
        declareFunction("note_coherence_violation", "NOTE-COHERENCE-VIOLATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_wff_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("el_wffP", "EL-WFF?", 1, 2, false);
            declareFunction("el_strictly_wffP", "EL-STRICTLY-WFF?", 1, 2, false);
            declareFunction("el_wff_assertibleP", "EL-WFF-ASSERTIBLE?", 1, 2, false);
            declareFunction("el_lenient_wff_assertibleP", "EL-LENIENT-WFF-ASSERTIBLE?", 1, 2, false);
            declareFunction("el_strictly_wff_assertibleP", "EL-STRICTLY-WFF-ASSERTIBLE?", 1, 2, false);
            declareFunction("hl_wffP", "HL-WFF?", 1, 2, false);
            declareFunction("wffP", "WFF?", 1, 2, false);
            declareFunction("wff_in_any_mtP", "WFF-IN-ANY-MT?", 2, 0, false);
            declareFunction("clear_strictly_wff_in_all_spec_mtsP", "CLEAR-STRICTLY-WFF-IN-ALL-SPEC-MTS?", 0, 0, false);
            declareFunction("remove_strictly_wff_in_all_spec_mtsP", "REMOVE-STRICTLY-WFF-IN-ALL-SPEC-MTS?", 1, 2, false);
            declareFunction("strictly_wff_in_all_spec_mtsP_internal", "STRICTLY-WFF-IN-ALL-SPEC-MTS?-INTERNAL", 3, 0, false);
            declareFunction("strictly_wff_in_all_spec_mtsP", "STRICTLY-WFF-IN-ALL-SPEC-MTS?", 1, 2, false);
            declareFunction("reset_wff_state", "RESET-WFF-STATE", 0, 0, false);
            declareFunction("mal_precanonicalizationsP", "MAL-PRECANONICALIZATIONS?", 2, 0, false);
            declareFunction("syntactically_wff_elf_intP", "SYNTACTICALLY-WFF-ELF-INT?", 2, 0, false);
            declareFunction("wff_elfP", "WFF-ELF?", 2, 0, false);
            declareFunction("wff_el_expansion", "WFF-EL-EXPANSION", 2, 0, false);
            declareFunction("el_wff_syntaxP", "EL-WFF-SYNTAX?", 1, 1, false);
            declareFunction("wff_elf_intP", "WFF-ELF-INT?", 1, 1, false);
            declareFunction("why_not_semantically_wf_wrt_types", "WHY-NOT-SEMANTICALLY-WF-WRT-TYPES", 2, 0, false);
            declareFunction("semantically_wff_elf_intP", "SEMANTICALLY-WFF-ELF-INT?", 2, 0, false);
            declareFunction("wff_fast_gafP", "WFF-FAST-GAF?", 1, 0, false);
            declareFunction("wff_nafP", "WFF-NAF?", 1, 1, false);
            declareFunction("wff_cnfP", "WFF-CNF?", 1, 1, false);
            declareFunction("wff_cnf_intP", "WFF-CNF-INT?", 1, 0, false);
            declareFunction("wff_dnfP", "WFF-DNF?", 1, 1, false);
            declareFunction("wff_literalP", "WFF-LITERAL?", 1, 1, false);
            declareFunction("wff_queryP", "WFF-QUERY?", 1, 2, false);
            declareFunction("wff_check_arityP", "WFF-CHECK-ARITY?", 0, 0, false);
            declareFunction("arity_tests_applyP", "ARITY-TESTS-APPLY?", 2, 0, false);
            declareFunction("check_arityP", "CHECK-ARITY?", 0, 2, false);
            declareFunction("wff_check_argsP", "WFF-CHECK-ARGS?", 0, 0, false);
            declareFunction("wff_check_coherenceP", "WFF-CHECK-COHERENCE?", 0, 0, false);
            declareFunction("wff_check_varsP", "WFF-CHECK-VARS?", 0, 0, false);
            declareFunction("inhibit_skolem_assertsP", "INHIBIT-SKOLEM-ASSERTS?", 0, 0, false);
            declareFunction("enforce_evaluatable_satisfiabilityP", "ENFORCE-EVALUATABLE-SATISFIABILITY?", 0, 0, false);
            declareFunction("enforce_only_definitional_gafs_in_vocab_mtP", "ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?", 0, 0, false);
            declareFunction("enforce_literal_idiosyncrasiesP", "ENFORCE-LITERAL-IDIOSYNCRASIES?", 0, 0, false);
            declareFunction("check_var_typesP", "CHECK-VAR-TYPES?", 1, 1, false);
            declareFunction("no_wff_semanticsP", "NO-WFF-SEMANTICS?", 0, 0, false);
            declareFunction("no_wff_semantics_or_arityP", "NO-WFF-SEMANTICS-OR-ARITY?", 0, 0, false);
            declareFunction("wff_only_needs_syntactic_checksP", "WFF-ONLY-NEEDS-SYNTACTIC-CHECKS?", 0, 0, false);
            declareFunction("check_wff_expansionP", "CHECK-WFF-EXPANSION?", 1, 0, false);
            declareFunction("check_wff_coherenceP", "CHECK-WFF-COHERENCE?", 1, 1, false);
            declareFunction("wff_doneP", "WFF-DONE?", 0, 1, false);
            declareFunction("mal_fortsP", "MAL-FORTS?", 1, 0, false);
            declareFunction("mal_forts", "MAL-FORTS", 1, 0, false);
            declareFunction("valid_top_level_backward_inference_literalP", "VALID-TOP-LEVEL-BACKWARD-INFERENCE-LITERAL?", 1, 0, false);
            declareFunction("valid_intermediate_backward_inference_literalP", "VALID-INTERMEDIATE-BACKWARD-INFERENCE-LITERAL?", 1, 0, false);
            declareFunction("valid_top_level_forward_inference_literalP", "VALID-TOP-LEVEL-FORWARD-INFERENCE-LITERAL?", 1, 0, false);
            declareFunction("valid_intermediate_forward_inference_literalP", "VALID-INTERMEDIATE-FORWARD-INFERENCE-LITERAL?", 1, 0, false);
            declareFunction("semantically_wf_literalP", "SEMANTICALLY-WF-LITERAL?", 1, 1, false);
            declareFunction("memoized_syntactically_wf_formulaP_internal", "MEMOIZED-SYNTACTICALLY-WF-FORMULA?-INTERNAL", 1, 0, false);
            declareFunction("memoized_syntactically_wf_formulaP", "MEMOIZED-SYNTACTICALLY-WF-FORMULA?", 1, 0, false);
            declareFunction("semantically_wf_literal_in_any_mtP", "SEMANTICALLY-WF-LITERAL-IN-ANY-MT?", 1, 0, false);
            declareFunction("memoized_semantically_wf_literalP_internal", "MEMOIZED-SEMANTICALLY-WF-LITERAL?-INTERNAL", 4, 0, false);
            declareFunction("memoized_semantically_wf_literalP", "MEMOIZED-SEMANTICALLY-WF-LITERAL?", 4, 0, false);
            declareFunction("assertible_literalP", "ASSERTIBLE-LITERAL?", 1, 1, false);
            declareFunction("contains_a_reifiable_but_not_forward_reifiable_natP", "CONTAINS-A-REIFIABLE-BUT-NOT-FORWARD-REIFIABLE-NAT?", 2, 0, false);
            declareFunction("reifiable_but_not_forward_reifiable_natP", "REIFIABLE-BUT-NOT-FORWARD-REIFIABLE-NAT?", 1, 0, false);
            declareFunction("meta_sentence_referencing_defn_gaf_in_mtP", "META-SENTENCE-REFERENCING-DEFN-GAF-IN-MT?", 2, 0, false);
            declareFunction("definitional_predP", "DEFINITIONAL-PRED?", 1, 1, false);
            declareFunction("sbhlXdefns_literal_conflictP", "SBHL/DEFNS-LITERAL-CONFLICT?", 1, 1, false);
            declareFunction("sbhlXdefns_trueP", "SBHL/DEFNS-TRUE?", 1, 1, false);
            declareFunction("sbhlXdefns_falseP", "SBHL/DEFNS-FALSE?", 1, 1, false);
            declareFunction("non_editable_skolem_referenceP", "NON-EDITABLE-SKOLEM-REFERENCE?", 1, 0, false);
            declareFunction("pred_of_editable_skolem_gafP", "PRED-OF-EDITABLE-SKOLEM-GAF?", 1, 0, false);
            declareFunction("editable_skolem_predicateP", "EDITABLE-SKOLEM-PREDICATE?", 1, 0, false);
            declareFunction("inhibit_cyclic_commutative_in_argsP", "INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?", 0, 0, false);
            declareFunction("wff_wrt_literal_idiosyncrasiesP", "WFF-WRT-LITERAL-IDIOSYNCRASIES?", 2, 0, false);
            declareFunction("except_for_wffP", "EXCEPT-FOR-WFF?", 1, 0, false);
            declareFunction("tou_mt_okP", "TOU-MT-OK?", 2, 0, false);
            declareFunction("semantically_wf_non_atomic_sentenceP", "SEMANTICALLY-WF-NON-ATOMIC-SENTENCE?", 2, 0, false);
            declareFunction("all_subsentences_semantically_wfP", "ALL-SUBSENTENCES-SEMANTICALLY-WF?", 2, 0, false);
            declareFunction("subsentence_semantically_wfP", "SUBSENTENCE-SEMANTICALLY-WF?", 4, 0, false);
            declareFunction("semantically_wf_sentenceP", "SEMANTICALLY-WF-SENTENCE?", 2, 0, false);
            declareFunction("semantically_wf_sentence_in_any_mtP", "SEMANTICALLY-WF-SENTENCE-IN-ANY-MT?", 1, 0, false);
            declareFunction("memoized_semantically_wf_sentenceP_internal", "MEMOIZED-SEMANTICALLY-WF-SENTENCE?-INTERNAL", 2, 0, false);
            declareFunction("memoized_semantically_wf_sentenceP", "MEMOIZED-SEMANTICALLY-WF-SENTENCE?", 2, 0, false);
            declareFunction("mal_arityP", "MAL-ARITY?", 1, 0, false);
            declareFunction("clear_mal_actual_arity_cachedP", "CLEAR-MAL-ACTUAL-ARITY-CACHED?", 0, 0, false);
            new wff.$clear_mal_actual_arity_cachedP$ZeroArityFunction();
            declareFunction("remove_mal_actual_arity_cachedP", "REMOVE-MAL-ACTUAL-ARITY-CACHED?", 2, 0, false);
            declareFunction("mal_actual_arity_cachedP_internal", "MAL-ACTUAL-ARITY-CACHED?-INTERNAL", 2, 0, false);
            declareFunction("mal_actual_arity_cachedP", "MAL-ACTUAL-ARITY-CACHED?", 2, 0, false);
            declareFunction("mal_arity_intP", "MAL-ARITY-INT?", 1, 0, false);
            declareFunction("mal_fixed_arityP", "MAL-FIXED-ARITY?", 1, 0, false);
            declareFunction("mal_variable_arityP", "MAL-VARIABLE-ARITY?", 1, 0, false);
            declareFunction("mal_arg_typesP", "MAL-ARG-TYPES?", 1, 1, false);
            declareFunction("wff_wrt_arg_typesP", "WFF-WRT-ARG-TYPES?", 1, 1, false);
            declareFunction("wff_coherentP", "WFF-COHERENT?", 1, 1, false);
            declareFunction("wff_incoherentP", "WFF-INCOHERENT?", 1, 1, false);
            declareFunction("elf_incoherentP", "ELF-INCOHERENT?", 1, 0, false);
            declareFunction("cnf_incoherentP", "CNF-INCOHERENT?", 1, 1, false);
            declareFunction("kwt_wffP", "KWT-WFF?", 1, 1, false);
            declareFunction("gat_wffP", "GAT-WFF?", 1, 1, false);
            declareFunction("el_formula_okP", "EL-FORMULA-OK?", 1, 1, false);
            declareFunction("formula_okP", "FORMULA-OK?", 1, 1, false);
            declareFunction("el_query_okP", "EL-QUERY-OK?", 1, 1, false);
            declareFunction("query_okP", "QUERY-OK?", 1, 1, false);
            declareFunction("why_not_query_ok", "WHY-NOT-QUERY-OK", 1, 1, false);
            declareFunction("el_wft_fastP", "EL-WFT-FAST?", 1, 1, false);
            declareFunction("el_strictly_wft_fastP", "EL-STRICTLY-WFT-FAST?", 1, 1, false);
            declareFunction("el_wft_fast_in_mtP", "EL-WFT-FAST-IN-MT?", 2, 0, false);
            declareFunction("el_wftP", "EL-WFT?", 1, 2, false);
            declareFunction("el_wfeP", "EL-WFE?", 1, 2, false);
            declareFunction("wfeP", "WFE?", 1, 1, false);
            declareFunction("wfe_intP", "WFE-INT?", 1, 0, false);
            declareFunction("wff_note", "WFF-NOTE", 2, 5, false);
            declareFunction("wff_error", "WFF-ERROR", 2, 5, false);
            declareFunction("wff_cerror", "WFF-CERROR", 3, 5, false);
            declareFunction("wff_warn", "WFF-WARN", 2, 5, false);
            declareFunction("wff_suggestions", "WFF-SUGGESTIONS", 0, 0, false);
            declareFunction("reset_wff_suggestions", "RESET-WFF-SUGGESTIONS", 0, 0, false);
            declareFunction("provide_wff_suggestionsP", "PROVIDE-WFF-SUGGESTIONS?", 0, 0, false);
            declareFunction("note_wff_suggestion", "NOTE-WFF-SUGGESTION", 1, 0, false);
            declareFunction("note_wff_suggestions", "NOTE-WFF-SUGGESTIONS", 1, 0, false);
            declareFunction("how_make_wffP", "HOW-MAKE-WFF?", 1, 1, false);
            declareFunction("how_make_wft", "HOW-MAKE-WFT", 1, 1, false);
            declareFunction("explanation_of_wff_suggestion", "EXPLANATION-OF-WFF-SUGGESTION", 1, 2, false);
            declareFunction("explanation_of_wft_suggestion", "EXPLANATION-OF-WFT-SUGGESTION", 1, 2, false);
            declareFunction("accumulating_el_violationsP", "ACCUMULATING-EL-VIOLATIONS?", 0, 0, false);
            declareFunction("note_arity_violation", "NOTE-ARITY-VIOLATION", 1, 0, false);
            declareFunction("diagnose_el_formula", "DIAGNOSE-EL-FORMULA", 1, 2, false);
            declareFunction("diagnose_el_term", "DIAGNOSE-EL-TERM", 1, 2, false);
            declareFunction("why_not_wff", "WHY-NOT-WFF", 1, 2, false);
            declareFunction("why_not_wff_assert", "WHY-NOT-WFF-ASSERT", 1, 2, false);
            declareFunction("why_not_wft", "WHY-NOT-WFT", 1, 2, false);
            declareFunction("why_not_wff_ask", "WHY-NOT-WFF-ASK", 1, 2, false);
            declareFunction("cb_why_not_wff", "CB-WHY-NOT-WFF", 1, 1, false);
            declareFunction("reset_wff_violations", "RESET-WFF-VIOLATIONS", 0, 0, false);
            declareFunction("wff_violations", "WFF-VIOLATIONS", 0, 0, false);
            declareFunction("note_wff_violationP", "NOTE-WFF-VIOLATION?", 0, 0, false);
            declareFunction("note_wff_violation", "NOTE-WFF-VIOLATION", 1, 0, false);
            declareFunction("note_wff_violations", "NOTE-WFF-VIOLATIONS", 1, 0, false);
            declareFunction("explain_why_not_wff", "EXPLAIN-WHY-NOT-WFF", 1, 2, false);
            declareFunction("explain_why_not_wff_ask", "EXPLAIN-WHY-NOT-WFF-ASK", 1, 2, false);
            declareFunction("explain_why_not_wff_assert", "EXPLAIN-WHY-NOT-WFF-ASSERT", 1, 2, false);
            declareFunction("explain_why_not_wft", "EXPLAIN-WHY-NOT-WFT", 1, 2, false);
            declareFunction("hl_explain_why_not_wff", "HL-EXPLAIN-WHY-NOT-WFF", 1, 2, false);
            declareFunction("hl_explain_why_not_wft", "HL-EXPLAIN-WHY-NOT-WFT", 1, 2, false);
            declareFunction("hl_explanation_of_why_not_wff", "HL-EXPLANATION-OF-WHY-NOT-WFF", 1, 1, false);
            declareFunction("hl_explanation_of_why_not_wft", "HL-EXPLANATION-OF-WHY-NOT-WFT", 1, 1, false);
            declareFunction("hl_why_not_wff", "HL-WHY-NOT-WFF", 1, 1, false);
            declareFunction("hl_why_not_wft", "HL-WHY-NOT-WFT", 1, 1, false);
            declareFunction("explanation_of_why_not_wff", "EXPLANATION-OF-WHY-NOT-WFF", 1, 2, false);
            declareFunction("explanation_of_why_not_wff_ask", "EXPLANATION-OF-WHY-NOT-WFF-ASK", 1, 2, false);
            declareFunction("explanation_of_why_not_wff_assert", "EXPLANATION-OF-WHY-NOT-WFF-ASSERT", 1, 2, false);
            declareFunction("explanation_of_why_not_lenient_wff_assert", "EXPLANATION-OF-WHY-NOT-LENIENT-WFF-ASSERT", 1, 2, false);
            declareFunction("explanation_of_why_not_wff_terse", "EXPLANATION-OF-WHY-NOT-WFF-TERSE", 1, 3, false);
            declareFunction("explanation_of_why_not_wff_terse_assert", "EXPLANATION-OF-WHY-NOT-WFF-TERSE-ASSERT", 1, 3, false);
            declareFunction("explanation_of_why_not_wff_int", "EXPLANATION-OF-WHY-NOT-WFF-INT", 6, 0, false);
            declareFunction("explanation_of_why_not_wft", "EXPLANATION-OF-WHY-NOT-WFT", 1, 2, false);
            declareFunction("explain_wff_violations", "EXPLAIN-WFF-VIOLATIONS", 0, 1, false);
            declareFunction("explain_wff_violation_with_cycl_sentence", "EXPLAIN-WFF-VIOLATION-WITH-CYCL-SENTENCE", 2, 0, false);
            declareFunction("explain_wft_violation_with_cycl_sentence", "EXPLAIN-WFT-VIOLATION-WITH-CYCL-SENTENCE", 2, 0, false);
            declareFunction("explain_wff_violation", "EXPLAIN-WFF-VIOLATION", 1, 1, false);
            declareFunction("drill_down_on_wff_violations", "DRILL-DOWN-ON-WFF-VIOLATIONS", 1, 0, false);
            declareFunction("drill_down_on_wff_violation", "DRILL-DOWN-ON-WFF-VIOLATION", 1, 0, false);
            declareFunction("why_not_wff_violations_to_supports", "WHY-NOT-WFF-VIOLATIONS-TO-SUPPORTS", 1, 0, false);
            declareFunction("coherence_violations", "COHERENCE-VIOLATIONS", 0, 0, false);
            declareFunction("why_not_coherent", "WHY-NOT-COHERENT", 1, 1, false);
            declareFunction("reset_coherence_violations", "RESET-COHERENCE-VIOLATIONS", 0, 0, false);
            declareFunction("note_coherence_violation", "NOTE-COHERENCE-VIOLATION", 1, 0, false);
            declareFunction("enable_assertive_wff", "ENABLE-ASSERTIVE-WFF", 0, 0, false);
            declareFunction("disable_assertive_wff", "DISABLE-ASSERTIVE-WFF", 0, 0, false);
            declareFunction("assertive_wff_rules", "ASSERTIVE-WFF-RULES", 0, 0, false);
            declareFunction("clear_assertive_wff_rules_cached", "CLEAR-ASSERTIVE-WFF-RULES-CACHED", 0, 0, false);
            declareFunction("remove_assertive_wff_rules_cached", "REMOVE-ASSERTIVE-WFF-RULES-CACHED", 0, 0, false);
            declareFunction("assertive_wff_rules_cached_internal", "ASSERTIVE-WFF-RULES-CACHED-INTERNAL", 0, 0, false);
            declareFunction("assertive_wff_rules_cached", "ASSERTIVE-WFF-RULES-CACHED", 0, 0, false);
            declareFunction("enable_assertive_wff_forward_rules", "ENABLE-ASSERTIVE-WFF-FORWARD-RULES", 0, 0, false);
            declareFunction("disable_assertive_wff_forward_rules", "DISABLE-ASSERTIVE-WFF-FORWARD-RULES", 0, 0, false);
            declareFunction("enable_inter_arg_isa_forward_rules", "ENABLE-INTER-ARG-ISA-FORWARD-RULES", 0, 0, false);
            declareFunction("forget_redundant_assertive_wff_deductions", "FORGET-REDUNDANT-ASSERTIVE-WFF-DEDUCTIONS", 0, 0, false);
            declareFunction("assertive_wff_deductions_for_sentence", "ASSERTIVE-WFF-DEDUCTIONS-FOR-SENTENCE", 2, 0, false);
            declareFunction("assertive_wff_deductions", "ASSERTIVE-WFF-DEDUCTIONS", 1, 0, false);
            declareFunction("assertive_wff_deductionP", "ASSERTIVE-WFF-DEDUCTION?", 1, 0, false);
            declareFunction("assertive_wff_deduction_redundantP", "ASSERTIVE-WFF-DEDUCTION-REDUNDANT?", 1, 0, false);
            declareFunction("assertive_wff_ruleP", "ASSERTIVE-WFF-RULE?", 1, 0, false);
            declareFunction("clear_wff_constraint_dependent_caches", "CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES", 2, 0, false);
            declareFunction("clear_wff_constraint_dependent_caches_internal", "CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
            declareFunction("after_wff_constraint_satisfied", "AFTER-WFF-CONSTRAINT-SATISFIED", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("sbhl_literal_conflictP", "SBHL-LITERAL-CONFLICT?", 1, 1, false);
            declareFunction("sbhl_trueP", "SBHL-TRUE?", 1, 1, false);
            declareFunction("sbhl_falseP", "SBHL-FALSE?", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_wff_file_Previous() {
        declareFunction("el_wffP", "EL-WFF?", 1, 2, false);
        declareFunction("el_strictly_wffP", "EL-STRICTLY-WFF?", 1, 2, false);
        declareFunction("el_wff_assertibleP", "EL-WFF-ASSERTIBLE?", 1, 2, false);
        declareFunction("el_lenient_wff_assertibleP", "EL-LENIENT-WFF-ASSERTIBLE?", 1, 2, false);
        declareFunction("el_strictly_wff_assertibleP", "EL-STRICTLY-WFF-ASSERTIBLE?", 1, 2, false);
        declareFunction("hl_wffP", "HL-WFF?", 1, 2, false);
        declareFunction("wffP", "WFF?", 1, 2, false);
        declareFunction("wff_in_any_mtP", "WFF-IN-ANY-MT?", 2, 0, false);
        declareFunction("clear_strictly_wff_in_all_spec_mtsP", "CLEAR-STRICTLY-WFF-IN-ALL-SPEC-MTS?", 0, 0, false);
        declareFunction("remove_strictly_wff_in_all_spec_mtsP", "REMOVE-STRICTLY-WFF-IN-ALL-SPEC-MTS?", 1, 2, false);
        declareFunction("strictly_wff_in_all_spec_mtsP_internal", "STRICTLY-WFF-IN-ALL-SPEC-MTS?-INTERNAL", 3, 0, false);
        declareFunction("strictly_wff_in_all_spec_mtsP", "STRICTLY-WFF-IN-ALL-SPEC-MTS?", 1, 2, false);
        declareFunction("reset_wff_state", "RESET-WFF-STATE", 0, 0, false);
        declareFunction("mal_precanonicalizationsP", "MAL-PRECANONICALIZATIONS?", 2, 0, false);
        declareFunction("syntactically_wff_elf_intP", "SYNTACTICALLY-WFF-ELF-INT?", 2, 0, false);
        declareFunction("wff_elfP", "WFF-ELF?", 2, 0, false);
        declareFunction("wff_el_expansion", "WFF-EL-EXPANSION", 2, 0, false);
        declareFunction("el_wff_syntaxP", "EL-WFF-SYNTAX?", 1, 1, false);
        declareFunction("wff_elf_intP", "WFF-ELF-INT?", 1, 1, false);
        declareFunction("why_not_semantically_wf_wrt_types", "WHY-NOT-SEMANTICALLY-WF-WRT-TYPES", 2, 0, false);
        declareFunction("semantically_wff_elf_intP", "SEMANTICALLY-WFF-ELF-INT?", 2, 0, false);
        declareFunction("wff_fast_gafP", "WFF-FAST-GAF?", 1, 0, false);
        declareFunction("wff_nafP", "WFF-NAF?", 1, 1, false);
        declareFunction("wff_cnfP", "WFF-CNF?", 1, 1, false);
        declareFunction("wff_cnf_intP", "WFF-CNF-INT?", 1, 0, false);
        declareFunction("wff_dnfP", "WFF-DNF?", 1, 1, false);
        declareFunction("wff_literalP", "WFF-LITERAL?", 1, 1, false);
        declareFunction("wff_queryP", "WFF-QUERY?", 1, 2, false);
        declareFunction("wff_check_arityP", "WFF-CHECK-ARITY?", 0, 0, false);
        declareFunction("arity_tests_applyP", "ARITY-TESTS-APPLY?", 2, 0, false);
        declareFunction("check_arityP", "CHECK-ARITY?", 0, 2, false);
        declareFunction("wff_check_argsP", "WFF-CHECK-ARGS?", 0, 0, false);
        declareFunction("wff_check_coherenceP", "WFF-CHECK-COHERENCE?", 0, 0, false);
        declareFunction("wff_check_varsP", "WFF-CHECK-VARS?", 0, 0, false);
        declareFunction("inhibit_skolem_assertsP", "INHIBIT-SKOLEM-ASSERTS?", 0, 0, false);
        declareFunction("enforce_evaluatable_satisfiabilityP", "ENFORCE-EVALUATABLE-SATISFIABILITY?", 0, 0, false);
        declareFunction("enforce_only_definitional_gafs_in_vocab_mtP", "ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?", 0, 0, false);
        declareFunction("enforce_literal_idiosyncrasiesP", "ENFORCE-LITERAL-IDIOSYNCRASIES?", 0, 0, false);
        declareFunction("check_var_typesP", "CHECK-VAR-TYPES?", 1, 1, false);
        declareFunction("no_wff_semanticsP", "NO-WFF-SEMANTICS?", 0, 0, false);
        declareFunction("no_wff_semantics_or_arityP", "NO-WFF-SEMANTICS-OR-ARITY?", 0, 0, false);
        declareFunction("wff_only_needs_syntactic_checksP", "WFF-ONLY-NEEDS-SYNTACTIC-CHECKS?", 0, 0, false);
        declareFunction("check_wff_expansionP", "CHECK-WFF-EXPANSION?", 1, 0, false);
        declareFunction("check_wff_coherenceP", "CHECK-WFF-COHERENCE?", 1, 1, false);
        declareFunction("wff_doneP", "WFF-DONE?", 0, 1, false);
        declareFunction("mal_fortsP", "MAL-FORTS?", 1, 0, false);
        declareFunction("mal_forts", "MAL-FORTS", 1, 0, false);
        declareFunction("valid_top_level_backward_inference_literalP", "VALID-TOP-LEVEL-BACKWARD-INFERENCE-LITERAL?", 1, 0, false);
        declareFunction("valid_intermediate_backward_inference_literalP", "VALID-INTERMEDIATE-BACKWARD-INFERENCE-LITERAL?", 1, 0, false);
        declareFunction("valid_top_level_forward_inference_literalP", "VALID-TOP-LEVEL-FORWARD-INFERENCE-LITERAL?", 1, 0, false);
        declareFunction("valid_intermediate_forward_inference_literalP", "VALID-INTERMEDIATE-FORWARD-INFERENCE-LITERAL?", 1, 0, false);
        declareFunction("semantically_wf_literalP", "SEMANTICALLY-WF-LITERAL?", 1, 1, false);
        declareFunction("memoized_syntactically_wf_formulaP_internal", "MEMOIZED-SYNTACTICALLY-WF-FORMULA?-INTERNAL", 1, 0, false);
        declareFunction("memoized_syntactically_wf_formulaP", "MEMOIZED-SYNTACTICALLY-WF-FORMULA?", 1, 0, false);
        declareFunction("semantically_wf_literal_in_any_mtP", "SEMANTICALLY-WF-LITERAL-IN-ANY-MT?", 1, 0, false);
        declareFunction("memoized_semantically_wf_literalP_internal", "MEMOIZED-SEMANTICALLY-WF-LITERAL?-INTERNAL", 4, 0, false);
        declareFunction("memoized_semantically_wf_literalP", "MEMOIZED-SEMANTICALLY-WF-LITERAL?", 4, 0, false);
        declareFunction("assertible_literalP", "ASSERTIBLE-LITERAL?", 1, 1, false);
        declareFunction("contains_a_reifiable_but_not_forward_reifiable_natP", "CONTAINS-A-REIFIABLE-BUT-NOT-FORWARD-REIFIABLE-NAT?", 2, 0, false);
        declareFunction("reifiable_but_not_forward_reifiable_natP", "REIFIABLE-BUT-NOT-FORWARD-REIFIABLE-NAT?", 1, 0, false);
        declareFunction("meta_sentence_referencing_defn_gaf_in_mtP", "META-SENTENCE-REFERENCING-DEFN-GAF-IN-MT?", 2, 0, false);
        declareFunction("definitional_predP", "DEFINITIONAL-PRED?", 1, 1, false);
        declareFunction("sbhlXdefns_literal_conflictP", "SBHL/DEFNS-LITERAL-CONFLICT?", 1, 1, false);
        declareFunction("sbhlXdefns_trueP", "SBHL/DEFNS-TRUE?", 1, 1, false);
        declareFunction("sbhlXdefns_falseP", "SBHL/DEFNS-FALSE?", 1, 1, false);
        declareFunction("non_editable_skolem_referenceP", "NON-EDITABLE-SKOLEM-REFERENCE?", 1, 0, false);
        declareFunction("pred_of_editable_skolem_gafP", "PRED-OF-EDITABLE-SKOLEM-GAF?", 1, 0, false);
        declareFunction("editable_skolem_predicateP", "EDITABLE-SKOLEM-PREDICATE?", 1, 0, false);
        declareFunction("inhibit_cyclic_commutative_in_argsP", "INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?", 0, 0, false);
        declareFunction("wff_wrt_literal_idiosyncrasiesP", "WFF-WRT-LITERAL-IDIOSYNCRASIES?", 2, 0, false);
        declareFunction("except_for_wffP", "EXCEPT-FOR-WFF?", 1, 0, false);
        declareFunction("tou_mt_okP", "TOU-MT-OK?", 2, 0, false);
        declareFunction("semantically_wf_non_atomic_sentenceP", "SEMANTICALLY-WF-NON-ATOMIC-SENTENCE?", 2, 0, false);
        declareFunction("all_subsentences_semantically_wfP", "ALL-SUBSENTENCES-SEMANTICALLY-WF?", 2, 0, false);
        declareFunction("subsentence_semantically_wfP", "SUBSENTENCE-SEMANTICALLY-WF?", 4, 0, false);
        declareFunction("semantically_wf_sentenceP", "SEMANTICALLY-WF-SENTENCE?", 2, 0, false);
        declareFunction("semantically_wf_sentence_in_any_mtP", "SEMANTICALLY-WF-SENTENCE-IN-ANY-MT?", 1, 0, false);
        declareFunction("memoized_semantically_wf_sentenceP_internal", "MEMOIZED-SEMANTICALLY-WF-SENTENCE?-INTERNAL", 2, 0, false);
        declareFunction("memoized_semantically_wf_sentenceP", "MEMOIZED-SEMANTICALLY-WF-SENTENCE?", 2, 0, false);
        declareFunction("mal_arityP", "MAL-ARITY?", 1, 0, false);
        declareFunction("clear_mal_actual_arity_cachedP", "CLEAR-MAL-ACTUAL-ARITY-CACHED?", 0, 0, false);
        new wff.$clear_mal_actual_arity_cachedP$ZeroArityFunction();
        declareFunction("remove_mal_actual_arity_cachedP", "REMOVE-MAL-ACTUAL-ARITY-CACHED?", 2, 0, false);
        declareFunction("mal_actual_arity_cachedP_internal", "MAL-ACTUAL-ARITY-CACHED?-INTERNAL", 2, 0, false);
        declareFunction("mal_actual_arity_cachedP", "MAL-ACTUAL-ARITY-CACHED?", 2, 0, false);
        declareFunction("mal_arity_intP", "MAL-ARITY-INT?", 1, 0, false);
        declareFunction("mal_fixed_arityP", "MAL-FIXED-ARITY?", 1, 0, false);
        declareFunction("mal_variable_arityP", "MAL-VARIABLE-ARITY?", 1, 0, false);
        declareFunction("mal_arg_typesP", "MAL-ARG-TYPES?", 1, 1, false);
        declareFunction("wff_wrt_arg_typesP", "WFF-WRT-ARG-TYPES?", 1, 1, false);
        declareFunction("wff_coherentP", "WFF-COHERENT?", 1, 1, false);
        declareFunction("wff_incoherentP", "WFF-INCOHERENT?", 1, 1, false);
        declareFunction("elf_incoherentP", "ELF-INCOHERENT?", 1, 0, false);
        declareFunction("cnf_incoherentP", "CNF-INCOHERENT?", 1, 1, false);
        declareFunction("kwt_wffP", "KWT-WFF?", 1, 1, false);
        declareFunction("gat_wffP", "GAT-WFF?", 1, 1, false);
        declareFunction("el_formula_okP", "EL-FORMULA-OK?", 1, 1, false);
        declareFunction("formula_okP", "FORMULA-OK?", 1, 1, false);
        declareFunction("el_query_okP", "EL-QUERY-OK?", 1, 1, false);
        declareFunction("query_okP", "QUERY-OK?", 1, 1, false);
        declareFunction("why_not_query_ok", "WHY-NOT-QUERY-OK", 1, 1, false);
        declareFunction("el_wft_fastP", "EL-WFT-FAST?", 1, 1, false);
        declareFunction("el_strictly_wft_fastP", "EL-STRICTLY-WFT-FAST?", 1, 1, false);
        declareFunction("el_wft_fast_in_mtP", "EL-WFT-FAST-IN-MT?", 2, 0, false);
        declareFunction("el_wftP", "EL-WFT?", 1, 2, false);
        declareFunction("el_wfeP", "EL-WFE?", 1, 2, false);
        declareFunction("wfeP", "WFE?", 1, 1, false);
        declareFunction("wfe_intP", "WFE-INT?", 1, 0, false);
        declareFunction("wff_note", "WFF-NOTE", 2, 5, false);
        declareFunction("wff_error", "WFF-ERROR", 2, 5, false);
        declareFunction("wff_cerror", "WFF-CERROR", 3, 5, false);
        declareFunction("wff_warn", "WFF-WARN", 2, 5, false);
        declareFunction("wff_suggestions", "WFF-SUGGESTIONS", 0, 0, false);
        declareFunction("reset_wff_suggestions", "RESET-WFF-SUGGESTIONS", 0, 0, false);
        declareFunction("provide_wff_suggestionsP", "PROVIDE-WFF-SUGGESTIONS?", 0, 0, false);
        declareFunction("note_wff_suggestion", "NOTE-WFF-SUGGESTION", 1, 0, false);
        declareFunction("note_wff_suggestions", "NOTE-WFF-SUGGESTIONS", 1, 0, false);
        declareFunction("how_make_wffP", "HOW-MAKE-WFF?", 1, 1, false);
        declareFunction("how_make_wft", "HOW-MAKE-WFT", 1, 1, false);
        declareFunction("explanation_of_wff_suggestion", "EXPLANATION-OF-WFF-SUGGESTION", 1, 2, false);
        declareFunction("explanation_of_wft_suggestion", "EXPLANATION-OF-WFT-SUGGESTION", 1, 2, false);
        declareFunction("accumulating_el_violationsP", "ACCUMULATING-EL-VIOLATIONS?", 0, 0, false);
        declareFunction("note_arity_violation", "NOTE-ARITY-VIOLATION", 1, 0, false);
        declareFunction("diagnose_el_formula", "DIAGNOSE-EL-FORMULA", 1, 2, false);
        declareFunction("diagnose_el_term", "DIAGNOSE-EL-TERM", 1, 2, false);
        declareFunction("why_not_wff", "WHY-NOT-WFF", 1, 2, false);
        declareFunction("why_not_wff_assert", "WHY-NOT-WFF-ASSERT", 1, 2, false);
        declareFunction("why_not_wft", "WHY-NOT-WFT", 1, 2, false);
        declareFunction("why_not_wff_ask", "WHY-NOT-WFF-ASK", 1, 2, false);
        declareFunction("cb_why_not_wff", "CB-WHY-NOT-WFF", 1, 1, false);
        declareFunction("reset_wff_violations", "RESET-WFF-VIOLATIONS", 0, 0, false);
        declareFunction("wff_violations", "WFF-VIOLATIONS", 0, 0, false);
        declareFunction("note_wff_violationP", "NOTE-WFF-VIOLATION?", 0, 0, false);
        declareFunction("note_wff_violation", "NOTE-WFF-VIOLATION", 1, 0, false);
        declareFunction("note_wff_violations", "NOTE-WFF-VIOLATIONS", 1, 0, false);
        declareFunction("explain_why_not_wff", "EXPLAIN-WHY-NOT-WFF", 1, 2, false);
        declareFunction("explain_why_not_wff_ask", "EXPLAIN-WHY-NOT-WFF-ASK", 1, 2, false);
        declareFunction("explain_why_not_wff_assert", "EXPLAIN-WHY-NOT-WFF-ASSERT", 1, 2, false);
        declareFunction("explain_why_not_wft", "EXPLAIN-WHY-NOT-WFT", 1, 2, false);
        declareFunction("hl_explain_why_not_wff", "HL-EXPLAIN-WHY-NOT-WFF", 1, 2, false);
        declareFunction("hl_explain_why_not_wft", "HL-EXPLAIN-WHY-NOT-WFT", 1, 2, false);
        declareFunction("hl_explanation_of_why_not_wff", "HL-EXPLANATION-OF-WHY-NOT-WFF", 1, 1, false);
        declareFunction("hl_explanation_of_why_not_wft", "HL-EXPLANATION-OF-WHY-NOT-WFT", 1, 1, false);
        declareFunction("hl_why_not_wff", "HL-WHY-NOT-WFF", 1, 1, false);
        declareFunction("hl_why_not_wft", "HL-WHY-NOT-WFT", 1, 1, false);
        declareFunction("explanation_of_why_not_wff", "EXPLANATION-OF-WHY-NOT-WFF", 1, 2, false);
        declareFunction("explanation_of_why_not_wff_ask", "EXPLANATION-OF-WHY-NOT-WFF-ASK", 1, 2, false);
        declareFunction("explanation_of_why_not_wff_assert", "EXPLANATION-OF-WHY-NOT-WFF-ASSERT", 1, 2, false);
        declareFunction("explanation_of_why_not_lenient_wff_assert", "EXPLANATION-OF-WHY-NOT-LENIENT-WFF-ASSERT", 1, 2, false);
        declareFunction("explanation_of_why_not_wff_terse", "EXPLANATION-OF-WHY-NOT-WFF-TERSE", 1, 3, false);
        declareFunction("explanation_of_why_not_wff_terse_assert", "EXPLANATION-OF-WHY-NOT-WFF-TERSE-ASSERT", 1, 3, false);
        declareFunction("explanation_of_why_not_wff_int", "EXPLANATION-OF-WHY-NOT-WFF-INT", 6, 0, false);
        declareFunction("explanation_of_why_not_wft", "EXPLANATION-OF-WHY-NOT-WFT", 1, 2, false);
        declareFunction("explain_wff_violations", "EXPLAIN-WFF-VIOLATIONS", 0, 1, false);
        declareFunction("explain_wff_violation_with_cycl_sentence", "EXPLAIN-WFF-VIOLATION-WITH-CYCL-SENTENCE", 2, 0, false);
        declareFunction("explain_wft_violation_with_cycl_sentence", "EXPLAIN-WFT-VIOLATION-WITH-CYCL-SENTENCE", 2, 0, false);
        declareFunction("explain_wff_violation", "EXPLAIN-WFF-VIOLATION", 1, 1, false);
        declareFunction("drill_down_on_wff_violations", "DRILL-DOWN-ON-WFF-VIOLATIONS", 1, 0, false);
        declareFunction("drill_down_on_wff_violation", "DRILL-DOWN-ON-WFF-VIOLATION", 1, 0, false);
        declareFunction("why_not_wff_violations_to_supports", "WHY-NOT-WFF-VIOLATIONS-TO-SUPPORTS", 1, 0, false);
        declareFunction("coherence_violations", "COHERENCE-VIOLATIONS", 0, 0, false);
        declareFunction("why_not_coherent", "WHY-NOT-COHERENT", 1, 1, false);
        declareFunction("reset_coherence_violations", "RESET-COHERENCE-VIOLATIONS", 0, 0, false);
        declareFunction("note_coherence_violation", "NOTE-COHERENCE-VIOLATION", 1, 0, false);
        declareFunction("enable_assertive_wff", "ENABLE-ASSERTIVE-WFF", 0, 0, false);
        declareFunction("disable_assertive_wff", "DISABLE-ASSERTIVE-WFF", 0, 0, false);
        declareFunction("assertive_wff_rules", "ASSERTIVE-WFF-RULES", 0, 0, false);
        declareFunction("clear_assertive_wff_rules_cached", "CLEAR-ASSERTIVE-WFF-RULES-CACHED", 0, 0, false);
        declareFunction("remove_assertive_wff_rules_cached", "REMOVE-ASSERTIVE-WFF-RULES-CACHED", 0, 0, false);
        declareFunction("assertive_wff_rules_cached_internal", "ASSERTIVE-WFF-RULES-CACHED-INTERNAL", 0, 0, false);
        declareFunction("assertive_wff_rules_cached", "ASSERTIVE-WFF-RULES-CACHED", 0, 0, false);
        declareFunction("enable_assertive_wff_forward_rules", "ENABLE-ASSERTIVE-WFF-FORWARD-RULES", 0, 0, false);
        declareFunction("disable_assertive_wff_forward_rules", "DISABLE-ASSERTIVE-WFF-FORWARD-RULES", 0, 0, false);
        declareFunction("enable_inter_arg_isa_forward_rules", "ENABLE-INTER-ARG-ISA-FORWARD-RULES", 0, 0, false);
        declareFunction("forget_redundant_assertive_wff_deductions", "FORGET-REDUNDANT-ASSERTIVE-WFF-DEDUCTIONS", 0, 0, false);
        declareFunction("assertive_wff_deductions_for_sentence", "ASSERTIVE-WFF-DEDUCTIONS-FOR-SENTENCE", 2, 0, false);
        declareFunction("assertive_wff_deductions", "ASSERTIVE-WFF-DEDUCTIONS", 1, 0, false);
        declareFunction("assertive_wff_deductionP", "ASSERTIVE-WFF-DEDUCTION?", 1, 0, false);
        declareFunction("assertive_wff_deduction_redundantP", "ASSERTIVE-WFF-DEDUCTION-REDUNDANT?", 1, 0, false);
        declareFunction("assertive_wff_ruleP", "ASSERTIVE-WFF-RULE?", 1, 0, false);
        declareFunction("clear_wff_constraint_dependent_caches", "CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES", 2, 0, false);
        declareFunction("clear_wff_constraint_dependent_caches_internal", "CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
        declareFunction("after_wff_constraint_satisfied", "AFTER-WFF-CONSTRAINT-SATISFIED", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt45 = list(reader_make_constant_shell("PossibleDefinitionalPredicate"), reader_make_constant_shell("DefinitionalPredicate"));

    static private final SubLSymbol $sym48$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");

    public static final SubLSymbol $kw53$EXCEPT_FOR_W_O_SINGLETON_VAR = makeKeyword("EXCEPT-FOR-W/O-SINGLETON-VAR");

    static private final SubLString $str_alt55$Got_an_unexpected_sentential_rela = makeString("Got an unexpected sentential relation ~s in ~s");

    static private final SubLSymbol $sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_ = makeSymbol("MEMOIZED-SEMANTICALLY-WF-SENTENCE?");

    static private final SubLSymbol $sym57$MAL_ACTUAL_ARITY_CACHED_ = makeSymbol("MAL-ACTUAL-ARITY-CACHED?");

    static private final SubLSymbol $sym59$_MAL_ACTUAL_ARITY_CACHED__CACHING_STATE_ = makeSymbol("*MAL-ACTUAL-ARITY-CACHED?-CACHING-STATE*");

    static private final SubLSymbol $sym61$CLEAR_MAL_ACTUAL_ARITY_CACHED_ = makeSymbol("CLEAR-MAL-ACTUAL-ARITY-CACHED?");

    static private final SubLSymbol $sym69$EL_FORMULA_OK_ = makeSymbol("EL-FORMULA-OK?");

    static private final SubLList $list_alt70 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt71$Is_FORMULA_a_well_formed_el_formu = makeString("Is FORMULA a well-formed el formula?");

    static private final SubLList $list_alt72 = list(list(makeSymbol("FORMULA"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym73$EL_QUERY_OK_ = makeSymbol("EL-QUERY-OK?");

    static private final SubLString $str_alt74$Is_FORMULA_a_well_formed_el_query = makeString("Is FORMULA a well-formed el query?");

    static private final SubLList $list_alt78 = list(makeSymbol("SENTENCE-1"), makeSymbol("MT"), makeSymbol("ACCOMMODATING-MTS"));

    static private final SubLString $str_alt79$__Consider_asserting______s__in_m = makeString("~%Consider asserting ~%  ~s~%in mt ~s.");

    static private final SubLString $str_alt80$__Consider_asserting______s__in_o = makeString("~%Consider asserting ~%  ~s~%in one of these mts: ~s.");

    static private final SubLString $str_alt81$__ = makeString(", ");

    static private final SubLString $str_alt82$__or_ = makeString(", or ");

    static private final SubLList $list_alt84 = list(makeSymbol("OLD-TERM"), makeSymbol("NEW-TERM"));

    static private final SubLString $str_alt85$__Consider_using_term______s__ins = makeString("~%Consider using term ~%  ~s~%instead of term~%  ~s.");

    static private final SubLList $list_alt86 = list(makeSymbol("SENTENCE-1"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt87$__Consider_asserting______s____in = makeString("~%Consider asserting ~%  ~s~%  in mt ~s.");

    static private final SubLString $str_alt88$__Consider_asserting______s_ = makeString("~%Consider asserting ~%  ~s.");

    static private final SubLString $str_alt90$__Consider_unasserting______s____ = makeString("~%Consider unasserting ~%  ~s~%  in mt ~s.");

    static private final SubLString $str_alt91$__Consider_unasserting______s_ = makeString("~%Consider unasserting ~%  ~s.");

    static private final SubLString $str_alt92$__No_explanation_template_exists_ = makeString("~%No explanation template exists for wff suggestion~%~s.");

    static private final SubLList $list_alt93 = list(makeSymbol("TERM-1"), makeSymbol("MT"), makeSymbol("ACCOMMODATING-MTS"));

    static private final SubLString $str_alt94$__Consider_referencing______s__in = makeString("~%Consider referencing ~%  ~s~%in mt ~s.");

    static private final SubLList $list_alt95 = list(makeSymbol("TERM-1"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLList $list_alt99 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("IO-MODE"), makeKeyword("NL")));

    static private final SubLString $str_alt100$Identify_how_el_sentence_SENTENCE = makeString("Identify how el sentence SENTENCE fails syntactic or semantic constraints");

    static private final SubLList $list_alt101 = list(list(makeSymbol("SENTENCE"), makeSymbol("LISTP")));

    static private final SubLString $str_alt102$___a = makeString("~%~a");

    static private final SubLList $list_alt103 = list(makeKeyword("IO-MODE"), makeKeyword("NL"));

    static private final SubLString $str_alt113$__No_explanation_template_exists_ = makeString("~%No explanation template exists for wff error~%~s.");

    public static SubLObject init_wff_file() {
        deflexical("*STRICTLY-WFF-IN-ALL-SPEC-MTS?-CACHING-STATE*", NIL);
        defparameter("*WFF-NON-FORT-ISA-SUPPORT-ENABLED?*", T);
        deflexical("*MAL-ACTUAL-ARITY-CACHED?-CACHING-STATE*", NIL);
        defvar("*WFF-TRACE-LEVEL*", ONE_INTEGER);
        deflexical("*ASSERTIVE-WFF-RULES-CACHED-CACHING-STATE*", NIL);
        defparameter("*INSIDE-CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_wff_file_alt() {
        register_cyc_api_function($sym21$EL_WFF_SYNTAX_, $list_alt22, $str_alt23$Is_SENTENCE_well_formed_wrt_synta, NIL, $list_alt24);
        memoization_state.note_memoized_function($sym33$MEMOIZED_SYNTACTICALLY_WF_FORMULA_);
        memoization_state.note_memoized_function($sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_);
        memoization_state.note_memoized_function($sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_);
        memoization_state.note_globally_cached_function($sym57$MAL_ACTUAL_ARITY_CACHED_);
        register_cyc_api_function($sym69$EL_FORMULA_OK_, $list_alt70, $str_alt71$Is_FORMULA_a_well_formed_el_formu, $list_alt72, $list_alt24);
        register_cyc_api_function($sym73$EL_QUERY_OK_, $list_alt70, $str_alt74$Is_FORMULA_a_well_formed_el_query, $list_alt72, $list_alt24);
        register_cyc_api_function(DIAGNOSE_EL_FORMULA, $list_alt99, $str_alt100$Identify_how_el_sentence_SENTENCE, $list_alt101, NIL);
        return NIL;
    }

    public static SubLObject setup_wff_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function($sym13$STRICTLY_WFF_IN_ALL_SPEC_MTS_);
            register_cyc_api_function($sym27$EL_WFF_SYNTAX_, $list28, $str29$Is_SENTENCE_well_formed_wrt_synta, NIL, $list30);
            memoization_state.note_memoized_function($sym39$MEMOIZED_SYNTACTICALLY_WF_FORMULA_);
            memoization_state.note_memoized_function($sym40$MEMOIZED_SEMANTICALLY_WF_LITERAL_);
            note_funcall_helper_function($sym50$REIFIABLE_BUT_NOT_FORWARD_REIFIABLE_NAT_);
            memoization_state.note_memoized_function($sym65$MEMOIZED_SEMANTICALLY_WF_SENTENCE_);
            memoization_state.note_globally_cached_function($sym66$MAL_ACTUAL_ARITY_CACHED_);
            register_cyc_api_function($sym77$EL_FORMULA_OK_, $list78, $str79$Is_FORMULA_a_well_formed_el_formu, $list80, $list30);
            register_cyc_api_function($sym81$EL_QUERY_OK_, $list78, $str82$Is_FORMULA_a_well_formed_el_query, $list80, $list30);
            register_cyc_api_function(DIAGNOSE_EL_FORMULA, $list107, $str108$Identify_how_el_sentence_SENTENCE, $list109, NIL);
            register_external_symbol(EXPLANATION_OF_WHY_NOT_WFF_TERSE);
            register_external_symbol(EXPLANATION_OF_WHY_NOT_WFF_TERSE_ASSERT);
            note_funcall_helper_function(DRILL_DOWN_ON_WFF_VIOLATION);
            memoization_state.note_globally_cached_function(ASSERTIVE_WFF_RULES_CACHED);
            register_kb_function(CLEAR_WFF_CONSTRAINT_DEPENDENT_CACHES);
            register_kb_function(AFTER_WFF_CONSTRAINT_SATISFIED);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function($sym21$EL_WFF_SYNTAX_, $list_alt22, $str_alt23$Is_SENTENCE_well_formed_wrt_synta, NIL, $list_alt24);
            memoization_state.note_memoized_function($sym33$MEMOIZED_SYNTACTICALLY_WF_FORMULA_);
            memoization_state.note_memoized_function($sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_);
            memoization_state.note_memoized_function($sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_);
            memoization_state.note_globally_cached_function($sym57$MAL_ACTUAL_ARITY_CACHED_);
            register_cyc_api_function($sym69$EL_FORMULA_OK_, $list_alt70, $str_alt71$Is_FORMULA_a_well_formed_el_formu, $list_alt72, $list_alt24);
            register_cyc_api_function($sym73$EL_QUERY_OK_, $list_alt70, $str_alt74$Is_FORMULA_a_well_formed_el_query, $list_alt72, $list_alt24);
            register_cyc_api_function(DIAGNOSE_EL_FORMULA, $list_alt99, $str_alt100$Identify_how_el_sentence_SENTENCE, $list_alt101, NIL);
        }
        return NIL;
    }

    public static SubLObject setup_wff_file_Previous() {
        memoization_state.note_globally_cached_function($sym13$STRICTLY_WFF_IN_ALL_SPEC_MTS_);
        register_cyc_api_function($sym27$EL_WFF_SYNTAX_, $list28, $str29$Is_SENTENCE_well_formed_wrt_synta, NIL, $list30);
        memoization_state.note_memoized_function($sym39$MEMOIZED_SYNTACTICALLY_WF_FORMULA_);
        memoization_state.note_memoized_function($sym40$MEMOIZED_SEMANTICALLY_WF_LITERAL_);
        note_funcall_helper_function($sym50$REIFIABLE_BUT_NOT_FORWARD_REIFIABLE_NAT_);
        memoization_state.note_memoized_function($sym65$MEMOIZED_SEMANTICALLY_WF_SENTENCE_);
        memoization_state.note_globally_cached_function($sym66$MAL_ACTUAL_ARITY_CACHED_);
        register_cyc_api_function($sym77$EL_FORMULA_OK_, $list78, $str79$Is_FORMULA_a_well_formed_el_formu, $list80, $list30);
        register_cyc_api_function($sym81$EL_QUERY_OK_, $list78, $str82$Is_FORMULA_a_well_formed_el_query, $list80, $list30);
        register_cyc_api_function(DIAGNOSE_EL_FORMULA, $list107, $str108$Identify_how_el_sentence_SENTENCE, $list109, NIL);
        register_external_symbol(EXPLANATION_OF_WHY_NOT_WFF_TERSE);
        register_external_symbol(EXPLANATION_OF_WHY_NOT_WFF_TERSE_ASSERT);
        note_funcall_helper_function(DRILL_DOWN_ON_WFF_VIOLATION);
        memoization_state.note_globally_cached_function(ASSERTIVE_WFF_RULES_CACHED);
        register_kb_function(CLEAR_WFF_CONSTRAINT_DEPENDENT_CACHES);
        register_kb_function(AFTER_WFF_CONSTRAINT_SATISFIED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_wff_file();
    }

    @Override
    public void initializeVariables() {
        init_wff_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wff_file();
    }

    static {
    }

    public static final class $clear_mal_actual_arity_cachedP$ZeroArityFunction extends ZeroArityFunction {
        public $clear_mal_actual_arity_cachedP$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-MAL-ACTUAL-ARITY-CACHED?"));
        }

        @Override
        public SubLObject processItem() {
            return clear_mal_actual_arity_cachedP();
        }
    }
}

/**
 * Total time: 1645 ms
 */
