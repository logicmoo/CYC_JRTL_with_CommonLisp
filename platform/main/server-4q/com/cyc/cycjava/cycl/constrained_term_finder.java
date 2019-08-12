/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cycl_variables.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class constrained_term_finder extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constrained_term_finder();

 public static final String myName = "com.cyc.cycjava.cycl.constrained_term_finder";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $constrained_term_finder_queries_browsableP$ = makeSymbol("*CONSTRAINED-TERM-FINDER-QUERIES-BROWSABLE?*");

    // defparameter
    // Variables already introduced are recorded here.
    /**
     * Variables already introduced are recorded here.
     */
    @LispMethod(comment = "Variables already introduced are recorded here.\ndefparameter")
    private static final SubLSymbol $constraint_match_ignore_vars$ = makeSymbol("*CONSTRAINT-MATCH-IGNORE-VARS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $constraint_match_constraints$ = makeSymbol("*CONSTRAINT-MATCH-CONSTRAINTS*");

    // defparameter
    /**
     *
     *
     * @see bug 14564
     */
    @LispMethod(comment = "@see bug 14564\ndefparameter")
    private static final SubLSymbol $expand_spatially_transitive_constraintsP$ = makeSymbol("*EXPAND-SPATIALLY-TRANSITIVE-CONSTRAINTS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $spatially_transitive_constraints$ = makeSymbol("*SPATIALLY-TRANSITIVE-CONSTRAINTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fuzzy_quantity_functions$ = makeSymbol("*FUZZY-QUANTITY-FUNCTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $use_mt_and_dims_variablesP$ = makeSymbol("*USE-MT-AND-DIMS-VARIABLES?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("CASE-INSENSITIVE"), $TRUE, makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"));

    static private final SubLSymbol $sym1$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLSymbol $kw9$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    static private final SubLList $list12 = list(list(makeSymbol("*CONSTRAINT-MATCH-IGNORE-VARS*"), NIL));

    static private final SubLString $str13$___A_D = makeString("??~A~D");

    private static final SubLObject $$ist_Intermediate = reader_make_constant_shell("ist-Intermediate");



    private static final SubLSymbol REGULAR_EXPRESSION_STRING_P = makeSymbol("REGULAR-EXPRESSION-STRING-P");

    private static final SubLSymbol NON_REGULAR_EXPRESSION_STRING_P = makeSymbol("NON-REGULAR-EXPRESSION-STRING-P");

    private static final SubLSymbol CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P = makeSymbol("CONSTRAINT-MATCH-FUZZY-QUANTITY-NAT-P");

    private static final SubLSymbol CONSTRAINT_MATCH_SOME_FN_TERM_P = makeSymbol("CONSTRAINT-MATCH-SOME-FN-TERM-P");

    private static final SubLSymbol CONSTRAINT_MATCH_INFN_TERNARY_TERM_P = makeSymbol("CONSTRAINT-MATCH-INFN-TERNARY-TERM-P");

    static private final SubLList $list25 = list(list($BIND, makeSymbol("ARG0")), makeKeyword("ANYTHING"), $FORT);

    private static final SubLSymbol ARG0 = makeSymbol("ARG0");





    static private final SubLSymbol $sym31$_DATE = makeSymbol("?DATE");

    static private final SubLSymbol $sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_ = makeSymbol("SPATIALLY-TRANSITIVE-CONSTRAINT?");

    private static final SubLSymbol TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT = makeSymbol("TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINT");



    static private final SubLSymbol $sym35$_PLACE = makeSymbol("?PLACE");

    static private final SubLSymbol $sym36$_REFSPEC = makeSymbol("?REFSPEC");

    static private final SubLSymbol $sym37$_ASSERTION = makeSymbol("?ASSERTION");

    static private final SubLSymbol $sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_ = makeSymbol("CONSTRAINT-MATCH-MT-TEMPORAL-CONSTRAINT?");

    static private final SubLList $list39 = list(reader_make_constant_shell("temporallySubsumes"), list(reader_make_constant_shell("SomeTimeInIntervalFn"), list($BIND, makeSymbol("BOUNDING-TIME-INTERVAL")), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));

    private static final SubLSymbol BOUNDING_TIME_INTERVAL = makeSymbol("BOUNDING-TIME-INTERVAL");

    static private final SubLList $list41 = list(reader_make_constant_shell("temporallySubsumes"), list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list(reader_make_constant_shell("SomeTimeInIntervalFn"), list($BIND, makeSymbol("START")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("SomeTimeInIntervalFn"), list($BIND, makeSymbol("END")), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING"));

    static private final SubLList $list44 = list(ONE_INTEGER, ONE_INTEGER);

    static private final SubLList $list45 = list(ONE_INTEGER, TWO_INTEGER);

    static private final SubLList $list46 = list(reader_make_constant_shell("IntervalOfTypeMinFn"), reader_make_constant_shell("IntervalOfTypeMaxFn"), reader_make_constant_shell("IntervalRangeFn"), reader_make_constant_shell("ApproximatelyFn"), reader_make_constant_shell("AlmostFn"), reader_make_constant_shell("Unity"));













    static private final SubLList $list53 = list(makeDouble(0.9));

    static private final SubLList $list54 = list(makeDouble(1.1));









    static private final SubLList $list59 = list(makeSymbol("MIN"), makeSymbol("MAX"));

    static private final SubLString $$$QUANTITY = makeString("QUANTITY");

    static private final SubLString $$$INSTANCE = makeString("INSTANCE");







    static private final SubLList $list65 = list(THREE_INTEGER);

    static private final SubLString $$$GUID = makeString("GUID");

    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell("InstanceNamedFn-Ternary");

    private static final SubLObject $$trueSentence_CaseInsensitive = reader_make_constant_shell("trueSentence-CaseInsensitive");



    static private final SubLList $list70 = list(reader_make_constant_shell("The"), reader_make_constant_shell("Microtheory"));

    static private final SubLList $list71 = list(reader_make_constant_shell("ist"), list(reader_make_constant_shell("MtSpace"), makeKeyword("ANYTHING"), list(makeKeyword("AND"), list($BIND, makeSymbol("TEMPORAL-MT")), list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), list(makeKeyword("AND"), makeKeyword("EL-VARIABLE"), list($BIND, makeSymbol("DATE-VAR"))), reader_make_constant_shell("TimePoint")))), makeKeyword("ANYTHING"));

    private static final SubLSymbol DATE_VAR = makeSymbol("DATE-VAR");

    private static final SubLSymbol TEMPORAL_MT = makeSymbol("TEMPORAL-MT");

    static private final SubLList $list74 = list($BIND, makeSymbol("DATE"));



    static private final SubLString $$$MT = makeString("MT");

    static private final SubLString $str78$MT_DIMS = makeString("MT-DIMS");



    private static final SubLObject $$ist_Asserted = reader_make_constant_shell("ist-Asserted");







    private static final SubLObject $$regexStringMatch_CaseInsensitive = reader_make_constant_shell("regexStringMatch-CaseInsensitive");



    private static final SubLSymbol UNPARSABLE_INSTANCE_EXPRESSION_P = makeSymbol("UNPARSABLE-INSTANCE-EXPRESSION-P");

    static private final SubLString $$$STANDIN = makeString("STANDIN");



    static private final SubLString $$$REGEX = makeString("REGEX");



    // Definitions
    /**
     * Given a TERM-VARIABLE, an ELMT and a set of CONSTRAINTS on TERM-VARIABLE,
     * return all instances in the KB that satisfy these CONSTRAINTS.
     *
     * @return LISTP of CYCL-DENOTATIONAL-TERM-P.
     */
    @LispMethod(comment = "Given a TERM-VARIABLE, an ELMT and a set of CONSTRAINTS on TERM-VARIABLE,\r\nreturn all instances in the KB that satisfy these CONSTRAINTS.\r\n\r\n@return LISTP of CYCL-DENOTATIONAL-TERM-P.\nGiven a TERM-VARIABLE, an ELMT and a set of CONSTRAINTS on TERM-VARIABLE,\nreturn all instances in the KB that satisfy these CONSTRAINTS.")
    public static final SubLObject find_terms_matching_constraints_alt(SubLObject term_variable, SubLObject constraints, SubLObject mt, SubLObject string_match_options, SubLObject non_reformulatable_constraints) {
        if (string_match_options == UNPROVIDED) {
            string_match_options = $list_alt0;
        }
        if (non_reformulatable_constraints == UNPROVIDED) {
            non_reformulatable_constraints = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(term_variable, $sym1$EL_VAR_);
            SubLTrampolineFile.checkType(constraints, LISTP);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            SubLTrampolineFile.checkType(string_match_options, PROPERTY_LIST_P);
            thread.resetMultipleValues();
            {
                SubLObject query_sentence = com.cyc.cycjava.cycl.constrained_term_finder.build_constraint_match_query_from_constraints_and_options(term_variable, constraints, string_match_options, mt, non_reformulatable_constraints);
                SubLObject ignored_constraints = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return com.cyc.cycjava.cycl.constrained_term_finder.find_terms_matching_constraints_perform_query(term_variable, query_sentence, mt);
            }
        }
    }

    // Definitions
    /**
     * Given a TERM-VARIABLE, an ELMT and a set of CONSTRAINTS on TERM-VARIABLE,
     * return all instances in the KB that satisfy these CONSTRAINTS.
     *
     * @return LISTP of CYCL-DENOTATIONAL-TERM-P.
     */
    @LispMethod(comment = "Given a TERM-VARIABLE, an ELMT and a set of CONSTRAINTS on TERM-VARIABLE,\r\nreturn all instances in the KB that satisfy these CONSTRAINTS.\r\n\r\n@return LISTP of CYCL-DENOTATIONAL-TERM-P.\nGiven a TERM-VARIABLE, an ELMT and a set of CONSTRAINTS on TERM-VARIABLE,\nreturn all instances in the KB that satisfy these CONSTRAINTS.")
    public static SubLObject find_terms_matching_constraints(final SubLObject term_variable, final SubLObject constraints, final SubLObject mt, SubLObject string_match_options, SubLObject non_reformulatable_constraints) {
        if (string_match_options == UNPROVIDED) {
            string_match_options = $list0;
        }
        if (non_reformulatable_constraints == UNPROVIDED) {
            non_reformulatable_constraints = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_variables.el_varP(term_variable) : "! cycl_variables.el_varP(term_variable) " + ("cycl_variables.el_varP(term_variable) " + "CommonSymbols.NIL != cycl_variables.el_varP(term_variable) ") + term_variable;
        assert NIL != listp(constraints) : "! listp(constraints) " + ("Types.listp(constraints) " + "CommonSymbols.NIL != Types.listp(constraints) ") + constraints;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != list_utilities.property_list_p(string_match_options) : "! list_utilities.property_list_p(string_match_options) " + ("list_utilities.property_list_p(string_match_options) " + "CommonSymbols.NIL != list_utilities.property_list_p(string_match_options) ") + string_match_options;
        thread.resetMultipleValues();
        final SubLObject query_sentence = build_constraint_match_query_from_constraints_and_options(term_variable, constraints, string_match_options, mt, non_reformulatable_constraints);
        final SubLObject ignored_constraints = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return find_terms_matching_constraints_perform_query(term_variable, query_sentence, mt);
    }

    public static final SubLObject find_terms_matching_constraints_perform_query_alt(SubLObject term_variable, SubLObject query_sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_properties = list($ANSWER_LANGUAGE, $HL, $PROBABLY_APPROXIMATELY_DONE, $float$1_0, $kw9$NEW_TERMS_ALLOWED_, NIL, $BROWSABLE_, $constrained_term_finder_queries_browsableP$.getDynamicValue(thread));
                return ask_utilities.query_variable(term_variable, query_sentence, mt, v_properties);
            }
        }
    }

    public static SubLObject find_terms_matching_constraints_perform_query(final SubLObject term_variable, final SubLObject query_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = list($ANSWER_LANGUAGE, $HL, $PROBABLY_APPROXIMATELY_DONE, $float$1_0, $kw9$NEW_TERMS_ALLOWED_, NIL, $BROWSABLE_, $constrained_term_finder_queries_browsableP$.getDynamicValue(thread));
        return ask_utilities.query_variable(term_variable, query_sentence, mt, v_properties);
    }

    public static final SubLObject with_new_constraint_match_ignore_vars_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt12, append(body, NIL));
        }
    }

    public static SubLObject with_new_constraint_match_ignore_vars(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list12, append(body, NIL));
    }

    public static final SubLObject new_constraint_match_ignore_var_alt(SubLObject stem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject variable = NIL;
                while (NIL == variable) {
                    {
                        SubLObject guessed_variable_name = format(NIL, $str_alt13$___A_D, stem, index);
                        SubLObject el_var = make_el_var(guessed_variable_name);
                        if (NIL == subl_promotions.memberP(el_var, $constraint_match_ignore_vars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            variable = el_var;
                        }
                    }
                    index = add(index, ONE_INTEGER);
                } 
                $constraint_match_ignore_vars$.setDynamicValue(cons(variable, $constraint_match_ignore_vars$.getDynamicValue(thread)), thread);
                return variable;
            }
        }
    }

    public static SubLObject new_constraint_match_ignore_var(final SubLObject stem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = ZERO_INTEGER;
        SubLObject variable = NIL;
        while (NIL == variable) {
            final SubLObject guessed_variable_name = format(NIL, $str13$___A_D, stem, index);
            final SubLObject el_var = cycl_variables.make_el_var(guessed_variable_name);
            if (NIL == subl_promotions.memberP(el_var, $constraint_match_ignore_vars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                variable = el_var;
            }
            index = add(index, ONE_INTEGER);
        } 
        $constraint_match_ignore_vars$.setDynamicValue(cons(variable, $constraint_match_ignore_vars$.getDynamicValue(thread)), thread);
        return variable;
    }

    public static final SubLObject constraint_match_constraint_variable_mentioned_in_mt_p_alt(SubLObject constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject vars = cycl_utilities.expression_gather(constraint, $sym1$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == ans) {
                    {
                        SubLObject csome_list_var = vars;
                        SubLObject var = NIL;
                        for (var = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , var = csome_list_var.first()) {
                            if (NIL == ans) {
                                {
                                    SubLObject csome_list_var_1 = $constraint_match_constraints$.getDynamicValue(thread);
                                    SubLObject constraint_2 = NIL;
                                    for (constraint_2 = csome_list_var_1.first(); !((NIL != ans) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest() , constraint_2 = csome_list_var_1.first()) {
                                        if ((NIL != el_formula_with_operator_p(constraint_2, $$ist_Intermediate)) && (NIL != cycl_utilities.expression_find(var, constraint_2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                            ans = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject constraint_match_constraint_variable_mentioned_in_mt_p(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject vars = cycl_utilities.expression_gather(constraint, $sym1$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == ans) {
            SubLObject csome_list_var = vars;
            SubLObject var = NIL;
            var = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (NIL == ans) {
                    SubLObject csome_list_var_$1 = $constraint_match_constraints$.getDynamicValue(thread);
                    SubLObject constraint_$2 = NIL;
                    constraint_$2 = csome_list_var_$1.first();
                    while ((NIL == ans) && (NIL != csome_list_var_$1)) {
                        if ((NIL != el_formula_with_operator_p(constraint_$2, $$ist_Intermediate)) && (NIL != cycl_utilities.expression_find(var, constraint_$2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            ans = T;
                        }
                        csome_list_var_$1 = csome_list_var_$1.rest();
                        constraint_$2 = csome_list_var_$1.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                var = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static final SubLObject build_constraint_match_query_from_constraints_and_options_alt(SubLObject term_variable, SubLObject constraints, SubLObject string_match_options, SubLObject domain_mt, SubLObject non_reformulatable_constraints) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject case_insensitiveP = eq($TRUE, getf(string_match_options, $CASE_INSENSITIVE, UNPROVIDED));
                SubLObject regular_expressionsP = makeBoolean((NIL != regular_expressions.is_regular_expressions_support_availableP()) && ($TRUE == getf(string_match_options, $REGULAR_EXPRESSIONS, UNPROVIDED)));
                SubLObject query_conjuncts = NIL;
                SubLObject ignored_constraints = NIL;
                SubLObject query_sentence = NIL;
                {
                    SubLObject _prev_bind_0 = $constraint_match_ignore_vars$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $constraint_match_constraints$.currentBinding(thread);
                    try {
                        $constraint_match_ignore_vars$.bind(NIL, thread);
                        $constraint_match_constraints$.bind(constraints, thread);
                        {
                            SubLObject cdolist_list_var = constraints;
                            SubLObject constraint = NIL;
                            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                {
                                    SubLObject transformed = com.cyc.cycjava.cycl.constrained_term_finder.transform_constraint_match_query_constraint(term_variable, constraint, case_insensitiveP, regular_expressionsP, domain_mt, T);
                                    if (NIL != transformed) {
                                        query_conjuncts = cons(transformed, query_conjuncts);
                                    } else {
                                        ignored_constraints = cons(constraint, ignored_constraints);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = non_reformulatable_constraints;
                            SubLObject constraint = NIL;
                            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                {
                                    SubLObject transformed = com.cyc.cycjava.cycl.constrained_term_finder.transform_constraint_match_query_constraint(term_variable, constraint, case_insensitiveP, regular_expressionsP, domain_mt, NIL);
                                    if (NIL != transformed) {
                                        query_conjuncts = cons(transformed, query_conjuncts);
                                    } else {
                                        ignored_constraints = cons(constraint, ignored_constraints);
                                    }
                                }
                            }
                        }
                        query_sentence = simplifier.conjoin(nreverse(query_conjuncts), UNPROVIDED);
                    } finally {
                        $constraint_match_constraints$.rebind(_prev_bind_1, thread);
                        $constraint_match_ignore_vars$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = obsolete.formula_free_variables(query_sentence, list(term_variable), $sym1$EL_VAR_, UNPROVIDED);
                    SubLObject ignore_var = NIL;
                    for (ignore_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ignore_var = cdolist_list_var.first()) {
                        query_sentence = make_existential(ignore_var, query_sentence);
                    }
                }
                return values(query_sentence, ignored_constraints);
            }
        }
    }

    public static SubLObject build_constraint_match_query_from_constraints_and_options(final SubLObject term_variable, final SubLObject constraints, final SubLObject string_match_options, final SubLObject domain_mt, final SubLObject non_reformulatable_constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject case_insensitiveP = eq($TRUE, getf(string_match_options, $CASE_INSENSITIVE, UNPROVIDED));
        final SubLObject regular_expressionsP = makeBoolean((NIL != regular_expressions.is_regular_expressions_support_availableP()) && ($TRUE == getf(string_match_options, $REGULAR_EXPRESSIONS, UNPROVIDED)));
        SubLObject query_conjuncts = NIL;
        SubLObject ignored_constraints = NIL;
        SubLObject query_sentence = NIL;
        final SubLObject _prev_bind_0 = $constraint_match_ignore_vars$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $constraint_match_constraints$.currentBinding(thread);
        try {
            $constraint_match_ignore_vars$.bind(NIL, thread);
            $constraint_match_constraints$.bind(constraints, thread);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject transformed = transform_constraint_match_query_constraint(term_variable, constraint, case_insensitiveP, regular_expressionsP, domain_mt, T);
                if (NIL != transformed) {
                    query_conjuncts = cons(transformed, query_conjuncts);
                } else {
                    ignored_constraints = cons(constraint, ignored_constraints);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
            cdolist_list_var = non_reformulatable_constraints;
            constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject transformed = transform_constraint_match_query_constraint(term_variable, constraint, case_insensitiveP, regular_expressionsP, domain_mt, NIL);
                if (NIL != transformed) {
                    query_conjuncts = cons(transformed, query_conjuncts);
                } else {
                    ignored_constraints = cons(constraint, ignored_constraints);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
            query_sentence = simplifier.conjoin(nreverse(query_conjuncts), UNPROVIDED);
        } finally {
            $constraint_match_constraints$.rebind(_prev_bind_2, thread);
            $constraint_match_ignore_vars$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = obsolete.formula_free_variables(query_sentence, list(term_variable), $sym1$EL_VAR_, UNPROVIDED);
        SubLObject ignore_var = NIL;
        ignore_var = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            query_sentence = make_existential(ignore_var, query_sentence);
            cdolist_list_var2 = cdolist_list_var2.rest();
            ignore_var = cdolist_list_var2.first();
        } 
        return values(query_sentence, ignored_constraints);
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff some variable in CONSTRAINT appears inside an mt-designating
    constraint.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff some variable in CONSTRAINT appears inside an mt-designating\r\nconstraint.")
    public static final SubLObject constraint_match_mt_temporal_constraintP_alt(SubLObject constraint) {
        return makeBoolean((NIL != el_formula_with_operator_p(constraint, $$temporallySubsumes)) && (NIL != com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_constraint_variable_mentioned_in_mt_p(constraint)));
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff some variable in CONSTRAINT appears inside an mt-designating
    constraint.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff some variable in CONSTRAINT appears inside an mt-designating\r\nconstraint.")
    public static SubLObject constraint_match_mt_temporal_constraintP(final SubLObject constraint) {
        return makeBoolean((NIL != el_formula_with_operator_p(constraint, $$temporallySubsumes)) && (NIL != constraint_match_constraint_variable_mentioned_in_mt_p(constraint)));
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff TEMPORAL-CONSTRAINT constrains MT-CONSTRAINT.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff TEMPORAL-CONSTRAINT constrains MT-CONSTRAINT.")
    public static final SubLObject constraint_match_temporal_constraint_on_mt_constraintP_alt(SubLObject temporal_constraint, SubLObject mt_constraint) {
        {
            SubLObject var = cycl_utilities.formula_arg2(temporal_constraint, UNPROVIDED);
            return makeBoolean((NIL != el_varP(var)) && (NIL != cycl_utilities.expression_find(var, mt_constraint, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff TEMPORAL-CONSTRAINT constrains MT-CONSTRAINT.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff TEMPORAL-CONSTRAINT constrains MT-CONSTRAINT.")
    public static SubLObject constraint_match_temporal_constraint_on_mt_constraintP(final SubLObject temporal_constraint, final SubLObject mt_constraint) {
        final SubLObject var = cycl_utilities.formula_arg2(temporal_constraint, UNPROVIDED);
        return makeBoolean((NIL != cycl_variables.el_varP(var)) && (NIL != cycl_utilities.expression_find(var, mt_constraint, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Transform CONSTRAINT into a query conjunct for finding matches.
     *
     * @return EL-FORMULA-P or NIL. NIL means we don't support it yet.
     */
    @LispMethod(comment = "Transform CONSTRAINT into a query conjunct for finding matches.\r\n\r\n@return EL-FORMULA-P or NIL. NIL means we don\'t support it yet.")
    public static final SubLObject transform_constraint_match_query_constraint_alt(SubLObject term_variable, SubLObject constraint, SubLObject case_insensitiveP, SubLObject regular_expressionsP, SubLObject domain_mt, SubLObject check_reformulatedP) {
        {
            SubLObject original_constraint = copy_expression(constraint);
            if (NIL != com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_mt_temporal_constraintP(constraint)) {
                constraint = NIL;
            } else {
                if (NIL != el_formula_with_operator_p(constraint, $$ist_Intermediate)) {
                    constraint = com.cyc.cycjava.cycl.constrained_term_finder.transform_temporal_qualification_on_query_constraint(constraint, domain_mt);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.constrained_term_finder.temporally_transitive_constraintP(constraint, domain_mt)) {
                        constraint = com.cyc.cycjava.cycl.constrained_term_finder.transform_temporally_transitive_constraint(constraint);
                    }
                }
            }
            if (((NIL != constraint) && (NIL != regular_expressionsP)) && (NIL != cycl_utilities.expression_find_if(symbol_function(REGULAR_EXPRESSION_STRING_P), constraint, UNPROVIDED, UNPROVIDED))) {
                constraint = com.cyc.cycjava.cycl.constrained_term_finder.add_regular_expression_marker_to_query_constraint(constraint, case_insensitiveP);
            }
            if ((((NIL != constraint) && (NIL != case_insensitiveP)) && ((NIL == regular_expressionsP) || (NIL != cycl_utilities.expression_find_if(symbol_function(NON_REGULAR_EXPRESSION_STRING_P), constraint, UNPROVIDED, UNPROVIDED)))) && (NIL != sentence_has_nontrivial_true_sentence_case_insensitive_supportP(constraint))) {
                constraint = com.cyc.cycjava.cycl.constrained_term_finder.add_case_insensitivity_marker_to_query_constraint(constraint);
            }
            while (NIL != cycl_utilities.expression_find_if(CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P, constraint, UNPROVIDED, UNPROVIDED)) {
                constraint = com.cyc.cycjava.cycl.constrained_term_finder.transform_constraint_match_fuzzy_quantity_constraint(constraint);
            } 
            constraint = com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_reformulate_temporal_constraint(constraint);
            constraint = com.cyc.cycjava.cycl.constrained_term_finder.transform_spatially_transitive_constraints(constraint);
            while (NIL != cycl_utilities.expression_find_if(CONSTRAINT_MATCH_SOME_FN_TERM_P, constraint, UNPROVIDED, UNPROVIDED)) {
                constraint = com.cyc.cycjava.cycl.constrained_term_finder.transform_constraint_match_some_fn_term(constraint);
            } 
            if ((NIL != check_reformulatedP) && (NIL != constraint)) {
                constraint = com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_constraint_add_reformulation_option(term_variable, constraint, original_constraint);
            }
            while (NIL != cycl_utilities.expression_find_if(CONSTRAINT_MATCH_INFN_TERNARY_TERM_P, constraint, UNPROVIDED, UNPROVIDED)) {
                constraint = com.cyc.cycjava.cycl.constrained_term_finder.transform_constraint_match_infn_ternary_term(constraint);
            } 
        }
        return constraint;
    }

    /**
     * Transform CONSTRAINT into a query conjunct for finding matches.
     *
     * @return EL-FORMULA-P or NIL. NIL means we don't support it yet.
     */
    @LispMethod(comment = "Transform CONSTRAINT into a query conjunct for finding matches.\r\n\r\n@return EL-FORMULA-P or NIL. NIL means we don\'t support it yet.")
    public static SubLObject transform_constraint_match_query_constraint(final SubLObject term_variable, SubLObject constraint, final SubLObject case_insensitiveP, final SubLObject regular_expressionsP, final SubLObject domain_mt, final SubLObject check_reformulatedP) {
        final SubLObject original_constraint = copy_expression(constraint);
        if (NIL != constraint_match_mt_temporal_constraintP(constraint)) {
            constraint = NIL;
        } else
            if (NIL != el_formula_with_operator_p(constraint, $$ist_Intermediate)) {
                constraint = transform_temporal_qualification_on_query_constraint(constraint, domain_mt);
            } else
                if (NIL != temporally_transitive_constraintP(constraint, domain_mt)) {
                    constraint = transform_temporally_transitive_constraint(constraint);
                }


        if (((NIL != constraint) && (NIL != regular_expressionsP)) && (NIL != cycl_utilities.expression_find_if(symbol_function(REGULAR_EXPRESSION_STRING_P), constraint, UNPROVIDED, UNPROVIDED))) {
            constraint = add_regular_expression_marker_to_query_constraint(constraint, case_insensitiveP);
        }
        if ((((NIL != constraint) && (NIL != case_insensitiveP)) && ((NIL == regular_expressionsP) || (NIL != cycl_utilities.expression_find_if(symbol_function(NON_REGULAR_EXPRESSION_STRING_P), constraint, UNPROVIDED, UNPROVIDED)))) && (NIL != sentence_has_nontrivial_true_sentence_case_insensitive_supportP(constraint))) {
            constraint = add_case_insensitivity_marker_to_query_constraint(constraint);
        }
        while (NIL != cycl_utilities.expression_find_if(CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P, constraint, UNPROVIDED, UNPROVIDED)) {
            constraint = transform_constraint_match_fuzzy_quantity_constraint(constraint);
        } 
        for (constraint = constraint_match_reformulate_temporal_constraint(constraint), constraint = transform_spatially_transitive_constraints(constraint); NIL != cycl_utilities.expression_find_if(CONSTRAINT_MATCH_SOME_FN_TERM_P, constraint, UNPROVIDED, UNPROVIDED); constraint = transform_constraint_match_some_fn_term(constraint)) {
        }
        if ((NIL != check_reformulatedP) && (NIL != constraint)) {
            constraint = constraint_match_constraint_add_reformulation_option(term_variable, constraint, original_constraint);
        }
        while (NIL != cycl_utilities.expression_find_if(CONSTRAINT_MATCH_INFN_TERNARY_TERM_P, constraint, UNPROVIDED, UNPROVIDED)) {
            constraint = transform_constraint_match_infn_ternary_term(constraint);
        } 
        return constraint;
    }

    public static final SubLObject temporally_transitive_constraintP_alt(SubLObject constraint, SubLObject mt) {
        return com.cyc.cycjava.cycl.constrained_term_finder.transitive_constraintP(constraint, $$temporallySubsumes);
    }

    public static SubLObject temporally_transitive_constraintP(final SubLObject constraint, final SubLObject mt) {
        return transitive_constraintP(constraint, $$temporallySubsumes);
    }

    /**
     *
     *
     * @return BOOLEANP; Is CONSTRAINT transitive in TRANSITIVE-PRED?
     */
    @LispMethod(comment = "@return BOOLEANP; Is CONSTRAINT transitive in TRANSITIVE-PRED?")
    public static final SubLObject transitive_constraintP_alt(SubLObject constraint, SubLObject transitive_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(constraint, $list_alt25);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject arg0 = alist_lookup_without_values(v_bindings, ARG0, UNPROVIDED, UNPROVIDED);
                            if (arg0 != transitive_pred) {
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        {
                                            SubLObject pred_var = $$transitiveViaArgInverse;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg0, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg0, NIL, pred_var);
                                                    SubLObject done_var = ans;
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
                                                                            SubLObject done_var_3 = ans;
                                                                            SubLObject token_var_4 = NIL;
                                                                            while (NIL == done_var_3) {
                                                                                {
                                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                                    SubLObject valid_5 = makeBoolean(token_var_4 != gaf);
                                                                                    if (NIL != valid_5) {
                                                                                        ans = makeBoolean((transitive_pred == assertions_high.gaf_arg2(gaf)) && (TWO_INTEGER == assertions_high.gaf_arg3(gaf)));
                                                                                    }
                                                                                    done_var_3 = makeBoolean((NIL == valid_5) || (NIL != ans));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != ans));
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
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is CONSTRAINT transitive in TRANSITIVE-PRED?
     */
    @LispMethod(comment = "@return BOOLEANP; Is CONSTRAINT transitive in TRANSITIVE-PRED?")
    public static SubLObject transitive_constraintP(final SubLObject constraint, final SubLObject transitive_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(constraint, $list25);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject arg0 = list_utilities.alist_lookup_without_values(v_bindings, ARG0, UNPROVIDED, UNPROVIDED);
            if (!arg0.eql(transitive_pred)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject pred_var = $$transitiveViaArgInverse;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg0, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg0, NIL, pred_var);
                        SubLObject done_var = ans;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$3 = ans;
                                    final SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
                                        if (NIL != valid_$5) {
                                            ans = makeBoolean(transitive_pred.eql(assertions_high.gaf_arg2(gaf)) && TWO_INTEGER.eql(assertions_high.gaf_arg3(gaf)));
                                        }
                                        done_var_$3 = makeBoolean((NIL == valid_$5) || (NIL != ans));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != ans));
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }

    public static final SubLObject transform_temporally_transitive_constraint_alt(SubLObject constraint) {
        {
            SubLObject date_var = czer_utilities.unique_el_var_wrt_expression(constraint, $sym31$_DATE);
            SubLObject varified_original = replace_formula_arg(TWO_INTEGER, date_var, constraint);
            SubLObject subsumption_constraint = list($$temporallySubsumes, cycl_utilities.formula_arg2(constraint, UNPROVIDED), date_var);
            return make_existential(date_var, simplifier.conjoin(list(varified_original, subsumption_constraint), UNPROVIDED));
        }
    }

    public static SubLObject transform_temporally_transitive_constraint(final SubLObject constraint) {
        final SubLObject date_var = czer_utilities.unique_el_var_wrt_expression(constraint, $sym31$_DATE);
        final SubLObject varified_original = replace_formula_arg(TWO_INTEGER, date_var, constraint);
        final SubLObject subsumption_constraint = list($$temporallySubsumes, cycl_utilities.formula_arg2(constraint, UNPROVIDED), date_var);
        return make_existential(date_var, simplifier.conjoin(list(varified_original, subsumption_constraint), UNPROVIDED));
    }

    public static final SubLObject transform_spatially_transitive_constraints_alt(SubLObject constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $expand_spatially_transitive_constraintsP$.getDynamicValue(thread)) {
                {
                    SubLObject _prev_bind_0 = $spatially_transitive_constraints$.currentBinding(thread);
                    try {
                        $spatially_transitive_constraints$.bind(NIL, thread);
                        constraint = cycl_utilities.expression_transform(constraint, $sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_, TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = $spatially_transitive_constraints$.getDynamicValue(thread);
                            SubLObject spatially_transitive_constraint = NIL;
                            for (spatially_transitive_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spatially_transitive_constraint = cdolist_list_var.first()) {
                                {
                                    SubLObject place_var = cycl_utilities.formula_arg2(spatially_transitive_constraint, UNPROVIDED);
                                    constraint = make_existential(place_var, simplifier.conjoin(list(spatially_transitive_constraint, constraint), UNPROVIDED));
                                }
                            }
                        }
                    } finally {
                        $spatially_transitive_constraints$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return constraint;
        }
    }

    public static SubLObject transform_spatially_transitive_constraints(SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $expand_spatially_transitive_constraintsP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = $spatially_transitive_constraints$.currentBinding(thread);
            try {
                $spatially_transitive_constraints$.bind(NIL, thread);
                constraint = cycl_utilities.expression_transform(constraint, $sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_, TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = $spatially_transitive_constraints$.getDynamicValue(thread);
                SubLObject spatially_transitive_constraint = NIL;
                spatially_transitive_constraint = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject place_var = cycl_utilities.formula_arg2(spatially_transitive_constraint, UNPROVIDED);
                    constraint = make_existential(place_var, simplifier.conjoin(list(spatially_transitive_constraint, constraint), UNPROVIDED));
                    cdolist_list_var = cdolist_list_var.rest();
                    spatially_transitive_constraint = cdolist_list_var.first();
                } 
            } finally {
                $spatially_transitive_constraints$.rebind(_prev_bind_0, thread);
            }
        }
        return constraint;
    }

    public static final SubLObject spatially_transitive_constraintP_alt(SubLObject constraint) {
        return com.cyc.cycjava.cycl.constrained_term_finder.transitive_constraintP(constraint, $$geographicallySubsumes);
    }

    public static SubLObject spatially_transitive_constraintP(final SubLObject constraint) {
        return transitive_constraintP(constraint, $$geographicallySubsumes);
    }

    public static final SubLObject transform_spatially_transitive_constraint_alt(SubLObject constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject place_var = czer_utilities.unique_el_var_wrt_expression(constraint, $sym35$_PLACE);
                if ($spatially_transitive_constraints$.getDynamicValue(thread).isList()) {
                    {
                        SubLObject cdolist_list_var = $spatially_transitive_constraints$.getDynamicValue(thread);
                        SubLObject existing = NIL;
                        for (existing = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , existing = cdolist_list_var.first()) {
                            place_var = czer_utilities.unique_el_var_wrt_expression(existing, $sym35$_PLACE);
                        }
                    }
                }
                {
                    SubLObject varified_original = replace_formula_arg(TWO_INTEGER, place_var, constraint);
                    SubLObject subsumption_constraint = list($$geographicallySubsumes, cycl_utilities.formula_arg2(constraint, UNPROVIDED), place_var);
                    if ($spatially_transitive_constraints$.getDynamicValue(thread).isList()) {
                        $spatially_transitive_constraints$.setDynamicValue(cons(subsumption_constraint, $spatially_transitive_constraints$.getDynamicValue(thread)), thread);
                    }
                    return varified_original;
                }
            }
        }
    }

    public static SubLObject transform_spatially_transitive_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject place_var = czer_utilities.unique_el_var_wrt_expression(constraint, $sym35$_PLACE);
        if ($spatially_transitive_constraints$.getDynamicValue(thread).isList()) {
            SubLObject cdolist_list_var = $spatially_transitive_constraints$.getDynamicValue(thread);
            SubLObject existing = NIL;
            existing = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                place_var = czer_utilities.unique_el_var_wrt_expression(existing, $sym35$_PLACE);
                cdolist_list_var = cdolist_list_var.rest();
                existing = cdolist_list_var.first();
            } 
        }
        final SubLObject varified_original = replace_formula_arg(TWO_INTEGER, place_var, constraint);
        final SubLObject subsumption_constraint = list($$geographicallySubsumes, cycl_utilities.formula_arg2(constraint, UNPROVIDED), place_var);
        if ($spatially_transitive_constraints$.getDynamicValue(thread).isList()) {
            $spatially_transitive_constraints$.setDynamicValue(cons(subsumption_constraint, $spatially_transitive_constraints$.getDynamicValue(thread)), thread);
        }
        return varified_original;
    }

    /**
     * Because ORIGINAL-CONSTRAINT may be met by a reformulated assertion from which
     * ORIGINAL-CONSTRAINT is not deducible, look for reformulated versions explicitly.
     * Cf. bug 12386.
     */
    @LispMethod(comment = "Because ORIGINAL-CONSTRAINT may be met by a reformulated assertion from which\r\nORIGINAL-CONSTRAINT is not deducible, look for reformulated versions explicitly.\r\nCf. bug 12386.\nBecause ORIGINAL-CONSTRAINT may be met by a reformulated assertion from which\nORIGINAL-CONSTRAINT is not deducible, look for reformulated versions explicitly.\nCf. bug 12386.")
    public static final SubLObject constraint_match_constraint_add_reformulation_option_alt(SubLObject term_variable, SubLObject new_constraint, SubLObject original_constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject refspec_var = $sym36$_REFSPEC;
                SubLObject assertion_var = $sym37$_ASSERTION;
                SubLObject ref_option = make_existential(assertion_var, make_existential(refspec_var, com.cyc.cycjava.cycl.constrained_term_finder.generate_note_reformulation_formula(assertion_var, term_variable, original_constraint, refspec_var)));
                if (NIL != el_formula_with_operator_p(original_constraint, $$ist_Intermediate)) {
                    {
                        SubLObject temporal_constraints = find_all_if($sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_, $constraint_match_constraints$.getDynamicValue(thread), UNPROVIDED);
                        SubLObject cdolist_list_var = temporal_constraints;
                        SubLObject temporal_constraint = NIL;
                        for (temporal_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , temporal_constraint = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_temporal_constraint_on_mt_constraintP(temporal_constraint, original_constraint)) {
                                {
                                    SubLObject reformulated_temporal_constraint = com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_reformulate_temporal_constraint(temporal_constraint);
                                    ref_option = simplifier.conjoin(list(ref_option, reformulated_temporal_constraint), UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                ref_option = com.cyc.cycjava.cycl.constrained_term_finder.transform_spatially_transitive_constraints(ref_option);
                ref_option = com.cyc.cycjava.cycl.constrained_term_finder.transform_constraint_match_some_fn_term(ref_option);
                {
                    SubLObject disjuncts = list(new_constraint, ref_option);
                    return simplifier.disjoin(disjuncts, UNPROVIDED);
                }
            }
        }
    }

    /**
     * Because ORIGINAL-CONSTRAINT may be met by a reformulated assertion from which
     * ORIGINAL-CONSTRAINT is not deducible, look for reformulated versions explicitly.
     * Cf. bug 12386.
     */
    @LispMethod(comment = "Because ORIGINAL-CONSTRAINT may be met by a reformulated assertion from which\r\nORIGINAL-CONSTRAINT is not deducible, look for reformulated versions explicitly.\r\nCf. bug 12386.\nBecause ORIGINAL-CONSTRAINT may be met by a reformulated assertion from which\nORIGINAL-CONSTRAINT is not deducible, look for reformulated versions explicitly.\nCf. bug 12386.")
    public static SubLObject constraint_match_constraint_add_reformulation_option(final SubLObject term_variable, final SubLObject new_constraint, final SubLObject original_constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject refspec_var = $sym36$_REFSPEC;
        final SubLObject assertion_var = $sym37$_ASSERTION;
        SubLObject ref_option = make_existential(assertion_var, make_existential(refspec_var, generate_note_reformulation_formula(assertion_var, term_variable, original_constraint, refspec_var)));
        if (NIL != el_formula_with_operator_p(original_constraint, $$ist_Intermediate)) {
            SubLObject cdolist_list_var;
            final SubLObject temporal_constraints = cdolist_list_var = list_utilities.find_all_if($sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_, $constraint_match_constraints$.getDynamicValue(thread), UNPROVIDED);
            SubLObject temporal_constraint = NIL;
            temporal_constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != constraint_match_temporal_constraint_on_mt_constraintP(temporal_constraint, original_constraint)) {
                    final SubLObject reformulated_temporal_constraint = constraint_match_reformulate_temporal_constraint(temporal_constraint);
                    ref_option = simplifier.conjoin(list(ref_option, reformulated_temporal_constraint), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                temporal_constraint = cdolist_list_var.first();
            } 
        }
        ref_option = transform_spatially_transitive_constraints(ref_option);
        ref_option = transform_constraint_match_some_fn_term(ref_option);
        final SubLObject disjuncts = list(new_constraint, ref_option);
        return simplifier.disjoin(disjuncts, UNPROVIDED);
    }

    public static final SubLObject constraint_match_reformulate_temporal_constraint_alt(SubLObject temporal_constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject success = formula_pattern_match.formula_matches_pattern(temporal_constraint, $list_alt39);
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    {
                        SubLObject bounding_time_interval = alist_lookup_without_values(v_bindings, BOUNDING_TIME_INTERVAL, UNPROVIDED, UNPROVIDED);
                        return com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_reformulate_temporal_constraint(replace_formula_arg(ONE_INTEGER, bounding_time_interval, temporal_constraint));
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject success = formula_pattern_match.formula_matches_pattern(temporal_constraint, $list_alt41);
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    {
                        SubLObject end = alist_lookup_without_values(v_bindings, END, UNPROVIDED, UNPROVIDED);
                        SubLObject start = alist_lookup_without_values(v_bindings, START, UNPROVIDED, UNPROVIDED);
                        return com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_reformulate_temporal_constraint(replace_formula_arg_position($list_alt44, start, replace_formula_arg_position($list_alt45, end, temporal_constraint)));
                    }
                }
            }
            return temporal_constraint;
        }
    }

    public static SubLObject constraint_match_reformulate_temporal_constraint(final SubLObject temporal_constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(temporal_constraint, $list39);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject bounding_time_interval = list_utilities.alist_lookup_without_values(v_bindings, BOUNDING_TIME_INTERVAL, UNPROVIDED, UNPROVIDED);
            return constraint_match_reformulate_temporal_constraint(replace_formula_arg(ONE_INTEGER, bounding_time_interval, temporal_constraint));
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern(temporal_constraint, $list41);
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject end = list_utilities.alist_lookup_without_values(v_bindings, END, UNPROVIDED, UNPROVIDED);
            final SubLObject start = list_utilities.alist_lookup_without_values(v_bindings, START, UNPROVIDED, UNPROVIDED);
            return constraint_match_reformulate_temporal_constraint(replace_formula_arg_position($list44, start, replace_formula_arg_position($list45, end, temporal_constraint)));
        }
        return temporal_constraint;
    }

    public static final SubLObject constraint_match_fuzzy_quantity_nat_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != term.nautP(v_object, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.constrained_term_finder.fuzzy_quantity_function_p(cycl_utilities.nat_functor(v_object))));
    }

    public static SubLObject constraint_match_fuzzy_quantity_nat_p(final SubLObject v_object) {
        return makeBoolean((NIL != term.nautP(v_object, UNPROVIDED)) && (NIL != fuzzy_quantity_function_p(cycl_utilities.nat_functor(v_object))));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject fuzzy_quantity_function_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $fuzzy_quantity_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject fuzzy_quantity_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $fuzzy_quantity_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject fuzzy_quantity_constraint_alt(SubLObject quantity_var, SubLObject fuzzy_quantity) {
        {
            SubLObject pcase_var = cycl_utilities.nat_functor(fuzzy_quantity);
            if (pcase_var.eql($$IntervalOfTypeMinFn)) {
                {
                    SubLObject min = cycl_utilities.nat_arg2(fuzzy_quantity, UNPROVIDED);
                    return make_binary_formula($$greaterThanOrEqualTo, quantity_var, min);
                }
            } else {
                if (pcase_var.eql($$IntervalOfTypeMaxFn)) {
                    {
                        SubLObject min = cycl_utilities.nat_arg2(fuzzy_quantity, UNPROVIDED);
                        return make_binary_formula($$lessThanOrEqualTo, quantity_var, min);
                    }
                } else {
                    if (pcase_var.eql($$ApproximatelyFn)) {
                        {
                            SubLObject exact_value = cycl_utilities.nat_arg1(fuzzy_quantity, UNPROVIDED);
                            SubLObject min = relation_evaluation.cyc_evaluate(listS($$TimesFn, exact_value, $list_alt53));
                            SubLObject max = relation_evaluation.cyc_evaluate(listS($$TimesFn, exact_value, $list_alt54));
                            return simplifier.nconjoin(list(list($$greaterThanOrEqualTo, quantity_var, min), list($$lessThanOrEqualTo, quantity_var, max)), UNPROVIDED);
                        }
                    } else {
                        if (pcase_var.eql($$AlmostFn)) {
                            {
                                SubLObject exact_value = cycl_utilities.nat_arg1(fuzzy_quantity, UNPROVIDED);
                                SubLObject min = relation_evaluation.cyc_evaluate(listS($$TimesFn, exact_value, $list_alt53));
                                return simplifier.nconjoin(list(list($$greaterThanOrEqualTo, quantity_var, min), list($$lessThan, quantity_var, exact_value)), UNPROVIDED);
                            }
                        } else {
                            if (pcase_var.eql($$Unity) || pcase_var.eql($$IntervalRangeFn)) {
                                if (NIL != cycl_utilities.nat_arg2(fuzzy_quantity, UNPROVIDED)) {
                                    {
                                        SubLObject datum = cycl_utilities.nat_args(fuzzy_quantity, UNPROVIDED);
                                        SubLObject current = datum;
                                        SubLObject min = NIL;
                                        SubLObject max = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        min = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        max = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            return simplifier.nconjoin(list(list($$greaterThanOrEqualTo, quantity_var, min), list($$lessThanOrEqualTo, quantity_var, max)), UNPROVIDED);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt59);
                                        }
                                    }
                                } else {
                                    return cycl_utilities.nat_arg1(fuzzy_quantity, UNPROVIDED);
                                }
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject fuzzy_quantity_constraint(final SubLObject quantity_var, final SubLObject fuzzy_quantity) {
        final SubLObject pcase_var = cycl_utilities.nat_functor(fuzzy_quantity);
        if (pcase_var.eql($$IntervalOfTypeMinFn)) {
            final SubLObject min = cycl_utilities.nat_arg2(fuzzy_quantity, UNPROVIDED);
            return make_binary_formula($$greaterThanOrEqualTo, quantity_var, min);
        }
        if (pcase_var.eql($$IntervalOfTypeMaxFn)) {
            final SubLObject min = cycl_utilities.nat_arg2(fuzzy_quantity, UNPROVIDED);
            return make_binary_formula($$lessThanOrEqualTo, quantity_var, min);
        }
        if (pcase_var.eql($$ApproximatelyFn)) {
            final SubLObject exact_value = cycl_utilities.nat_arg1(fuzzy_quantity, UNPROVIDED);
            final SubLObject min2 = relation_evaluation.cyc_evaluate(listS($$TimesFn, exact_value, $list53));
            final SubLObject max = relation_evaluation.cyc_evaluate(listS($$TimesFn, exact_value, $list54));
            return simplifier.nconjoin(list(list($$greaterThanOrEqualTo, quantity_var, min2), list($$lessThanOrEqualTo, quantity_var, max)), UNPROVIDED);
        }
        if (pcase_var.eql($$AlmostFn)) {
            final SubLObject exact_value = cycl_utilities.nat_arg1(fuzzy_quantity, UNPROVIDED);
            final SubLObject min2 = relation_evaluation.cyc_evaluate(listS($$TimesFn, exact_value, $list53));
            return simplifier.nconjoin(list(list($$greaterThanOrEqualTo, quantity_var, min2), list($$lessThan, quantity_var, exact_value)), UNPROVIDED);
        }
        if ((!pcase_var.eql($$Unity)) && (!pcase_var.eql($$IntervalRangeFn))) {
            return NIL;
        }
        if (NIL == cycl_utilities.nat_arg2(fuzzy_quantity, UNPROVIDED)) {
            return cycl_utilities.nat_arg1(fuzzy_quantity, UNPROVIDED);
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(fuzzy_quantity, UNPROVIDED);
        SubLObject min3 = NIL;
        SubLObject max2 = NIL;
        destructuring_bind_must_consp(current, datum, $list59);
        min3 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list59);
        max2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return simplifier.nconjoin(list(list($$greaterThanOrEqualTo, quantity_var, min3), list($$lessThanOrEqualTo, quantity_var, max2)), UNPROVIDED);
        }
        cdestructuring_bind_error(datum, $list59);
        return NIL;
    }

    /**
     * Transform CONSTRAINT into something we can do removal-only inference on. Cf. bug 12351.
     *
     * @unknown - Should probably use the Reformulator for this.
     */
    @LispMethod(comment = "Transform CONSTRAINT into something we can do removal-only inference on. Cf. bug 12351.\r\n\r\n@unknown - Should probably use the Reformulator for this.")
    public static final SubLObject transform_constraint_match_fuzzy_quantity_constraint_alt(SubLObject constraint) {
        {
            SubLObject fuzzy_quantity = cycl_utilities.expression_find_if(CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P, constraint, UNPROVIDED, UNPROVIDED);
            SubLObject fuzzy_quantity_argpos = cycl_utilities.arg_positions_bfs(fuzzy_quantity, constraint, symbol_function(EQUAL)).first();
            SubLObject quantity_var = com.cyc.cycjava.cycl.constrained_term_finder.new_constraint_match_ignore_var($$$QUANTITY);
            SubLObject new_main_constraint = replace_formula_arg_position(fuzzy_quantity_argpos, quantity_var, constraint);
            SubLObject quantity_constraint = com.cyc.cycjava.cycl.constrained_term_finder.fuzzy_quantity_constraint(quantity_var, fuzzy_quantity);
            return NIL != quantity_constraint ? ((SubLObject) (simplifier.nconjoin(list(new_main_constraint, quantity_constraint), UNPROVIDED))) : new_main_constraint;
        }
    }

    /**
     * Transform CONSTRAINT into something we can do removal-only inference on. Cf. bug 12351.
     *
     * @unknown - Should probably use the Reformulator for this.
     */
    @LispMethod(comment = "Transform CONSTRAINT into something we can do removal-only inference on. Cf. bug 12351.\r\n\r\n@unknown - Should probably use the Reformulator for this.")
    public static SubLObject transform_constraint_match_fuzzy_quantity_constraint(final SubLObject constraint) {
        final SubLObject fuzzy_quantity = cycl_utilities.expression_find_if(CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P, constraint, UNPROVIDED, UNPROVIDED);
        final SubLObject fuzzy_quantity_argpos = cycl_utilities.arg_positions_bfs(fuzzy_quantity, constraint, symbol_function(EQUAL)).first();
        final SubLObject quantity_var = new_constraint_match_ignore_var($$$QUANTITY);
        final SubLObject new_main_constraint = replace_formula_arg_position(fuzzy_quantity_argpos, quantity_var, constraint);
        final SubLObject quantity_constraint = fuzzy_quantity_constraint(quantity_var, fuzzy_quantity);
        return NIL != quantity_constraint ? simplifier.nconjoin(list(new_main_constraint, quantity_constraint), UNPROVIDED) : new_main_constraint;
    }

    public static final SubLObject transform_constraint_match_some_fn_term_alt(SubLObject constraint) {
        {
            SubLObject some_fn_term = cycl_utilities.expression_find_if(CONSTRAINT_MATCH_SOME_FN_TERM_P, constraint, UNPROVIDED, UNPROVIDED);
            if (NIL == some_fn_term) {
                return constraint;
            }
            {
                SubLObject some_fn_term_argpos = cycl_utilities.arg_positions_bfs(some_fn_term, constraint, symbol_function(EQUAL)).first();
                SubLObject instance_var = com.cyc.cycjava.cycl.constrained_term_finder.new_constraint_match_ignore_var($$$INSTANCE);
                SubLObject new_main_constraint = replace_formula_arg_position(some_fn_term_argpos, instance_var, constraint);
                SubLObject type_constraint = com.cyc.cycjava.cycl.constrained_term_finder.some_fn_term_constraint(instance_var, some_fn_term);
                return NIL != type_constraint ? ((SubLObject) (simplifier.nconjoin(list(new_main_constraint, type_constraint), UNPROVIDED))) : new_main_constraint;
            }
        }
    }

    public static SubLObject transform_constraint_match_some_fn_term(final SubLObject constraint) {
        final SubLObject some_fn_term = cycl_utilities.expression_find_if(CONSTRAINT_MATCH_SOME_FN_TERM_P, constraint, UNPROVIDED, UNPROVIDED);
        if (NIL == some_fn_term) {
            return constraint;
        }
        final SubLObject some_fn_term_argpos = cycl_utilities.arg_positions_bfs(some_fn_term, constraint, symbol_function(EQUAL)).first();
        final SubLObject instance_var = new_constraint_match_ignore_var($$$INSTANCE);
        final SubLObject new_main_constraint = replace_formula_arg_position(some_fn_term_argpos, instance_var, constraint);
        final SubLObject type_constraint = some_fn_term_constraint(instance_var, some_fn_term);
        return NIL != type_constraint ? simplifier.nconjoin(list(new_main_constraint, type_constraint), UNPROVIDED) : new_main_constraint;
    }

    public static final SubLObject constraint_match_some_fn_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && (cycl_utilities.nat_functor(v_object) == $$SomeFn));
    }

    public static SubLObject constraint_match_some_fn_term_p(final SubLObject v_object) {
        return cycl_utilities.naut_with_functor_p(v_object, $$SomeFn);
    }

    public static final SubLObject some_fn_term_constraint_alt(SubLObject instance_var, SubLObject some_fn_term) {
        {
            SubLObject type = cycl_utilities.nat_arg1(some_fn_term, UNPROVIDED);
            return type.eql($$Thing) ? ((SubLObject) (NIL)) : make_binary_formula($$isa, instance_var, type);
        }
    }

    public static SubLObject some_fn_term_constraint(final SubLObject instance_var, final SubLObject some_fn_term) {
        final SubLObject type = cycl_utilities.nat_arg1(some_fn_term, UNPROVIDED);
        return type.eql($$Thing) ? NIL : make_binary_formula($$isa, instance_var, type);
    }

    public static final SubLObject transform_constraint_match_infn_ternary_term_alt(SubLObject constraint) {
        {
            SubLObject infn_ternary_term = cycl_utilities.expression_find_if(CONSTRAINT_MATCH_INFN_TERNARY_TERM_P, constraint, UNPROVIDED, UNPROVIDED);
            SubLObject infn_ternary_term_argpos = cycl_utilities.arg_positions_bfs(infn_ternary_term, constraint, symbol_function(EQUAL)).first();
            SubLObject guid_argpos = append(infn_ternary_term_argpos, $list_alt65);
            SubLObject guid_var = com.cyc.cycjava.cycl.constrained_term_finder.new_constraint_match_ignore_var($$$GUID);
            SubLObject new_main_constraint = replace_formula_arg_position(guid_argpos, guid_var, constraint);
            return new_main_constraint;
        }
    }

    public static SubLObject transform_constraint_match_infn_ternary_term(final SubLObject constraint) {
        final SubLObject infn_ternary_term = cycl_utilities.expression_find_if(CONSTRAINT_MATCH_INFN_TERNARY_TERM_P, constraint, UNPROVIDED, UNPROVIDED);
        final SubLObject infn_ternary_term_argpos = cycl_utilities.arg_positions_bfs(infn_ternary_term, constraint, symbol_function(EQUAL)).first();
        final SubLObject guid_argpos = append(infn_ternary_term_argpos, $list65);
        final SubLObject guid_var = new_constraint_match_ignore_var($$$GUID);
        final SubLObject new_main_constraint = replace_formula_arg_position(guid_argpos, guid_var, constraint);
        return new_main_constraint;
    }

    public static final SubLObject constraint_match_infn_ternary_term_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != narts_high.naut_p(v_object)) && (cycl_utilities.nat_functor(v_object) == $$InstanceNamedFn_Ternary)) && cycl_utilities.nat_arg3(v_object, UNPROVIDED).isString());
    }

    public static SubLObject constraint_match_infn_ternary_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_utilities.naut_with_functor_p(v_object, $$InstanceNamedFn_Ternary)) && cycl_utilities.nat_arg3(v_object, UNPROVIDED).isString());
    }

    public static final SubLObject add_case_insensitivity_marker_to_query_constraint_alt(SubLObject constraint) {
        return make_unary_formula($$trueSentence_CaseInsensitive, constraint);
    }

    public static SubLObject add_case_insensitivity_marker_to_query_constraint(final SubLObject constraint) {
        return make_unary_formula($$trueSentence_CaseInsensitive, constraint);
    }

    public static final SubLObject transform_temporal_qualification_on_query_constraint_alt(SubLObject constraint, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $use_mt_and_dims_variablesP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.constrained_term_finder.transform_temporal_qualification_on_query_constraint_old(constraint, domain_mt);
            } else {
                return com.cyc.cycjava.cycl.constrained_term_finder.transform_temporal_qualification_on_query_constraint_new(constraint, domain_mt);
            }
        }
    }

    public static SubLObject transform_temporal_qualification_on_query_constraint(final SubLObject constraint, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_mt_and_dims_variablesP$.getDynamicValue(thread)) {
            return transform_temporal_qualification_on_query_constraint_old(constraint, domain_mt);
        }
        return transform_temporal_qualification_on_query_constraint_new(constraint, domain_mt);
    }

    public static final SubLObject transform_temporal_qualification_on_query_constraint_new_alt(SubLObject constraint, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject possibly_qualified_constraint = replace_formula_arg(ZERO_INTEGER, $$ist, cycl_utilities.expression_subst(domain_mt, narts_high.find_nart($list_alt70), constraint, UNPROVIDED, UNPROVIDED));
                SubLObject temporal_constraints = find_all_if($sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_, $constraint_match_constraints$.getDynamicValue(thread), UNPROVIDED);
                SubLObject constrainedP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(possibly_qualified_constraint, $list_alt71);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject date_var = alist_lookup_without_values(v_bindings, DATE_VAR, UNPROVIDED, UNPROVIDED);
                            SubLObject temporal_mt = alist_lookup_without_values(v_bindings, TEMPORAL_MT, UNPROVIDED, UNPROVIDED);
                            if (NIL == constrainedP) {
                                {
                                    SubLObject csome_list_var = temporal_constraints;
                                    SubLObject temporal_constraint = NIL;
                                    for (temporal_constraint = csome_list_var.first(); !((NIL != constrainedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , temporal_constraint = csome_list_var.first()) {
                                        if (NIL != com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_temporal_constraint_on_mt_constraintP(temporal_constraint, possibly_qualified_constraint)) {
                                            {
                                                SubLObject reformulated_temporal_constraint = com.cyc.cycjava.cycl.constrained_term_finder.constraint_match_reformulate_temporal_constraint(temporal_constraint);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject success_7 = formula_pattern_match.formula_matches_pattern(reformulated_temporal_constraint, list($$temporallySubsumes, $list_alt74, date_var));
                                                    SubLObject v_bindings_8 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != success_7) {
                                                        {
                                                            SubLObject date = alist_lookup_without_values(v_bindings_8, DATE, UNPROVIDED, UNPROVIDED);
                                                            SubLObject specified_temporal_mt = list($$AnytimeDuringPSCFn, date);
                                                            possibly_qualified_constraint = replace_formula_arg_position($list_alt45, specified_temporal_mt, possibly_qualified_constraint);
                                                            constrainedP = T;
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
                }
                return possibly_qualified_constraint;
            }
        }
    }

    public static SubLObject transform_temporal_qualification_on_query_constraint_new(final SubLObject constraint, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject possibly_qualified_constraint = replace_formula_arg(ZERO_INTEGER, $$ist, cycl_utilities.expression_subst(domain_mt, narts_high.find_nart($list70), constraint, UNPROVIDED, UNPROVIDED));
        final SubLObject temporal_constraints = list_utilities.find_all_if($sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_, $constraint_match_constraints$.getDynamicValue(thread), UNPROVIDED);
        SubLObject constrainedP = NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(possibly_qualified_constraint, $list71);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject date_var = list_utilities.alist_lookup_without_values(v_bindings, DATE_VAR, UNPROVIDED, UNPROVIDED);
            final SubLObject temporal_mt = list_utilities.alist_lookup_without_values(v_bindings, TEMPORAL_MT, UNPROVIDED, UNPROVIDED);
            if (NIL == constrainedP) {
                SubLObject csome_list_var = temporal_constraints;
                SubLObject temporal_constraint = NIL;
                temporal_constraint = csome_list_var.first();
                while ((NIL == constrainedP) && (NIL != csome_list_var)) {
                    if (NIL != constraint_match_temporal_constraint_on_mt_constraintP(temporal_constraint, possibly_qualified_constraint)) {
                        final SubLObject reformulated_temporal_constraint = constraint_match_reformulate_temporal_constraint(temporal_constraint);
                        thread.resetMultipleValues();
                        final SubLObject success_$7 = formula_pattern_match.formula_matches_pattern(reformulated_temporal_constraint, list($$temporallySubsumes, $list74, date_var));
                        final SubLObject v_bindings_$8 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success_$7) {
                            final SubLObject date = list_utilities.alist_lookup_without_values(v_bindings_$8, DATE, UNPROVIDED, UNPROVIDED);
                            final SubLObject specified_temporal_mt = list($$AnytimeDuringPSCFn, date);
                            possibly_qualified_constraint = replace_formula_arg_position($list45, specified_temporal_mt, possibly_qualified_constraint);
                            constrainedP = T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    temporal_constraint = csome_list_var.first();
                } 
            }
        }
        return possibly_qualified_constraint;
    }

    public static final SubLObject transform_temporal_qualification_on_query_constraint_old_alt(SubLObject constraint, SubLObject domain_mt) {
        {
            SubLObject sentence = cycl_utilities.formula_arg2(constraint, UNPROVIDED);
            SubLObject mt_var = com.cyc.cycjava.cycl.constrained_term_finder.new_constraint_match_ignore_var($$$MT);
            SubLObject mt_dim_var = com.cyc.cycjava.cycl.constrained_term_finder.new_constraint_match_ignore_var($str_alt78$MT_DIMS);
            SubLObject mt_space_expression = make_el_formula($$MtSpace, list(mt_var), mt_dim_var);
            SubLObject temporally_qualified = make_binary_formula($$ist_Asserted, mt_space_expression, sentence);
            SubLObject mt_reasoning = com.cyc.cycjava.cycl.constrained_term_finder.compute_mt_expression_for_temporal_qualification_on_query_constraint(mt_var, domain_mt);
            return make_binary_formula($$and, mt_reasoning, temporally_qualified);
        }
    }

    public static SubLObject transform_temporal_qualification_on_query_constraint_old(final SubLObject constraint, final SubLObject domain_mt) {
        final SubLObject sentence = cycl_utilities.formula_arg2(constraint, UNPROVIDED);
        final SubLObject mt_var = new_constraint_match_ignore_var($$$MT);
        final SubLObject mt_dim_var = new_constraint_match_ignore_var($str78$MT_DIMS);
        final SubLObject mt_space_expression = make_el_formula($$MtSpace, list(mt_var), mt_dim_var);
        final SubLObject temporally_qualified = make_binary_formula($$ist_Asserted, mt_space_expression, sentence);
        final SubLObject mt_reasoning = compute_mt_expression_for_temporal_qualification_on_query_constraint(mt_var, domain_mt);
        return make_binary_formula($$and, mt_reasoning, temporally_qualified);
    }

    public static final SubLObject compute_mt_expression_for_temporal_qualification_on_query_constraint_alt(SubLObject mt_var, SubLObject domain_mt) {
        if (NIL != el_formula_with_operator_p(domain_mt, $$MtUnionFn)) {
            {
                SubLObject mt_reasoning = NIL;
                SubLObject cdolist_list_var = flatten(com.cyc.cycjava.cycl.constrained_term_finder.mt_union_fn_mts_only(domain_mt));
                SubLObject elmt = NIL;
                for (elmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elmt = cdolist_list_var.first()) {
                    mt_reasoning = cons(make_binary_formula($$genlMt, elmt, mt_var), mt_reasoning);
                }
                return simplifier.disjoin(mt_reasoning, UNPROVIDED);
            }
        } else {
            return make_binary_formula($$genlMt, domain_mt, mt_var);
        }
    }

    public static SubLObject compute_mt_expression_for_temporal_qualification_on_query_constraint(final SubLObject mt_var, final SubLObject domain_mt) {
        if (NIL != el_formula_with_operator_p(domain_mt, $$MtUnionFn)) {
            SubLObject mt_reasoning = NIL;
            SubLObject cdolist_list_var = list_utilities.flatten(mt_union_fn_mts_only(domain_mt));
            SubLObject elmt = NIL;
            elmt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                mt_reasoning = cons(make_binary_formula($$genlMt, elmt, mt_var), mt_reasoning);
                cdolist_list_var = cdolist_list_var.rest();
                elmt = cdolist_list_var.first();
            } 
            return simplifier.disjoin(mt_reasoning, UNPROVIDED);
        }
        return make_binary_formula($$genlMt, domain_mt, mt_var);
    }

    public static final SubLObject mt_union_fn_mts_only_alt(SubLObject mt_denotation) {
        if (NIL != forts.fort_p(mt_denotation)) {
            return mt_denotation;
        } else {
            if (NIL != el_formula_with_operator_p(mt_denotation, $$MtUnionFn)) {
                return com.cyc.cycjava.cycl.constrained_term_finder.mt_union_fn_mts_only(cycl_utilities.nat_args(mt_denotation, UNPROVIDED));
            } else {
                if (NIL != narts_high.naut_p(mt_denotation)) {
                    return mt_denotation;
                } else {
                    if (NIL != proper_list_p(mt_denotation)) {
                        return cons(com.cyc.cycjava.cycl.constrained_term_finder.mt_union_fn_mts_only(mt_denotation.first()), com.cyc.cycjava.cycl.constrained_term_finder.mt_union_fn_mts_only(mt_denotation.rest()));
                    } else {
                        return mt_denotation;
                    }
                }
            }
        }
    }

    public static SubLObject mt_union_fn_mts_only(final SubLObject mt_denotation) {
        if (NIL != forts.fort_p(mt_denotation)) {
            return mt_denotation;
        }
        if (NIL != el_formula_with_operator_p(mt_denotation, $$MtUnionFn)) {
            return mt_union_fn_mts_only(cycl_utilities.nat_args(mt_denotation, UNPROVIDED));
        }
        if (NIL != narts_high.naut_p(mt_denotation)) {
            return mt_denotation;
        }
        if (NIL != list_utilities.proper_list_p(mt_denotation)) {
            return cons(mt_union_fn_mts_only(mt_denotation.first()), mt_union_fn_mts_only(mt_denotation.rest()));
        }
        return mt_denotation;
    }

    public static final SubLObject add_regular_expression_marker_to_query_constraint_alt(SubLObject constraint, SubLObject case_insensitiveP) {
        {
            SubLObject new_constraint = copy_sentence(constraint);
            SubLObject regex_pred = (NIL != case_insensitiveP) ? ((SubLObject) ($$regexStringMatch_CaseInsensitive)) : $$regexStringMatch;
            SubLObject unparsable = cycl_utilities.expression_find_if(symbol_function(UNPARSABLE_INSTANCE_EXPRESSION_P), new_constraint, UNPROVIDED, UNPROVIDED);
            if (NIL != unparsable) {
                {
                    SubLObject regex_string = cycl_utilities.expression_find_if(symbol_function(REGULAR_EXPRESSION_STRING_P), unparsable, UNPROVIDED, UNPROVIDED);
                    SubLObject el_var = com.cyc.cycjava.cycl.constrained_term_finder.new_constraint_match_ignore_var($$$STANDIN);
                    new_constraint = cycl_utilities.expression_nsubst(el_var, unparsable, new_constraint, UNPROVIDED, UNPROVIDED);
                    new_constraint = simplifier.conjoin(list(new_constraint, make_binary_formula($$termStrings, el_var, regex_string)), UNPROVIDED);
                }
            }
            {
                SubLObject regex_string = cycl_utilities.expression_find_if(symbol_function(REGULAR_EXPRESSION_STRING_P), new_constraint, UNPROVIDED, UNPROVIDED);
                SubLObject el_var = com.cyc.cycjava.cycl.constrained_term_finder.new_constraint_match_ignore_var($$$REGEX);
                new_constraint = cycl_utilities.expression_nsubst(el_var, regex_string, new_constraint, UNPROVIDED, UNPROVIDED);
                return make_binary_formula($$and, new_constraint, make_binary_formula(regex_pred, regex_string, el_var));
            }
        }
    }

    public static SubLObject add_regular_expression_marker_to_query_constraint(final SubLObject constraint, final SubLObject case_insensitiveP) {
        SubLObject new_constraint = copy_sentence(constraint);
        final SubLObject regex_pred = (NIL != case_insensitiveP) ? $$regexStringMatch_CaseInsensitive : $$regexStringMatch;
        final SubLObject unparsable = cycl_utilities.expression_find_if(symbol_function(UNPARSABLE_INSTANCE_EXPRESSION_P), new_constraint, UNPROVIDED, UNPROVIDED);
        if (NIL != unparsable) {
            final SubLObject regex_string = cycl_utilities.expression_find_if(symbol_function(REGULAR_EXPRESSION_STRING_P), unparsable, UNPROVIDED, UNPROVIDED);
            final SubLObject el_var = new_constraint_match_ignore_var($$$STANDIN);
            new_constraint = cycl_utilities.expression_nsubst(el_var, unparsable, new_constraint, UNPROVIDED, UNPROVIDED);
            new_constraint = simplifier.conjoin(list(new_constraint, make_binary_formula($$termStrings, el_var, regex_string)), UNPROVIDED);
        }
        final SubLObject regex_string = cycl_utilities.expression_find_if(symbol_function(REGULAR_EXPRESSION_STRING_P), new_constraint, UNPROVIDED, UNPROVIDED);
        final SubLObject el_var = new_constraint_match_ignore_var($$$REGEX);
        new_constraint = cycl_utilities.expression_nsubst(el_var, regex_string, new_constraint, UNPROVIDED, UNPROVIDED);
        return make_binary_formula($$and, new_constraint, make_binary_formula(regex_pred, regex_string, el_var));
    }

    public static final SubLObject generate_note_reformulation_formula_alt(SubLObject formula, SubLObject v_term, SubLObject original, SubLObject refspec_id) {
        return make_quaternary_formula($$assertionProducedByReformulation, formula, v_term, original, refspec_id);
    }

    public static SubLObject generate_note_reformulation_formula(final SubLObject formula, final SubLObject v_term, final SubLObject original, final SubLObject refspec_id) {
        return make_quaternary_formula($$assertionProducedByReformulation, formula, v_term, original, refspec_id);
    }

    public static final SubLObject is_note_reformulation_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && ($$assertionProducedByReformulation == assertions_high.gaf_arg0(assertion)));
    }

    public static SubLObject is_note_reformulation_assertionP(final SubLObject assertion) {
        return assertion_utilities.gaf_assertion_with_pred_p(assertion, $$assertionProducedByReformulation);
    }

    public static SubLObject declare_constrained_term_finder_file() {
        declareFunction("find_terms_matching_constraints", "FIND-TERMS-MATCHING-CONSTRAINTS", 3, 2, false);
        declareFunction("find_terms_matching_constraints_perform_query", "FIND-TERMS-MATCHING-CONSTRAINTS-PERFORM-QUERY", 3, 0, false);
        declareMacro("with_new_constraint_match_ignore_vars", "WITH-NEW-CONSTRAINT-MATCH-IGNORE-VARS");
        declareFunction("new_constraint_match_ignore_var", "NEW-CONSTRAINT-MATCH-IGNORE-VAR", 1, 0, false);
        declareFunction("constraint_match_constraint_variable_mentioned_in_mt_p", "CONSTRAINT-MATCH-CONSTRAINT-VARIABLE-MENTIONED-IN-MT-P", 1, 0, false);
        declareFunction("build_constraint_match_query_from_constraints_and_options", "BUILD-CONSTRAINT-MATCH-QUERY-FROM-CONSTRAINTS-AND-OPTIONS", 5, 0, false);
        declareFunction("constraint_match_mt_temporal_constraintP", "CONSTRAINT-MATCH-MT-TEMPORAL-CONSTRAINT?", 1, 0, false);
        declareFunction("constraint_match_temporal_constraint_on_mt_constraintP", "CONSTRAINT-MATCH-TEMPORAL-CONSTRAINT-ON-MT-CONSTRAINT?", 2, 0, false);
        declareFunction("transform_constraint_match_query_constraint", "TRANSFORM-CONSTRAINT-MATCH-QUERY-CONSTRAINT", 6, 0, false);
        declareFunction("temporally_transitive_constraintP", "TEMPORALLY-TRANSITIVE-CONSTRAINT?", 2, 0, false);
        declareFunction("transitive_constraintP", "TRANSITIVE-CONSTRAINT?", 2, 0, false);
        declareFunction("transform_temporally_transitive_constraint", "TRANSFORM-TEMPORALLY-TRANSITIVE-CONSTRAINT", 1, 0, false);
        declareFunction("transform_spatially_transitive_constraints", "TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINTS", 1, 0, false);
        declareFunction("spatially_transitive_constraintP", "SPATIALLY-TRANSITIVE-CONSTRAINT?", 1, 0, false);
        declareFunction("transform_spatially_transitive_constraint", "TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINT", 1, 0, false);
        declareFunction("constraint_match_constraint_add_reformulation_option", "CONSTRAINT-MATCH-CONSTRAINT-ADD-REFORMULATION-OPTION", 3, 0, false);
        declareFunction("constraint_match_reformulate_temporal_constraint", "CONSTRAINT-MATCH-REFORMULATE-TEMPORAL-CONSTRAINT", 1, 0, false);
        declareFunction("constraint_match_fuzzy_quantity_nat_p", "CONSTRAINT-MATCH-FUZZY-QUANTITY-NAT-P", 1, 0, false);
        declareFunction("fuzzy_quantity_function_p", "FUZZY-QUANTITY-FUNCTION-P", 1, 0, false);
        declareFunction("fuzzy_quantity_constraint", "FUZZY-QUANTITY-CONSTRAINT", 2, 0, false);
        declareFunction("transform_constraint_match_fuzzy_quantity_constraint", "TRANSFORM-CONSTRAINT-MATCH-FUZZY-QUANTITY-CONSTRAINT", 1, 0, false);
        declareFunction("transform_constraint_match_some_fn_term", "TRANSFORM-CONSTRAINT-MATCH-SOME-FN-TERM", 1, 0, false);
        declareFunction("constraint_match_some_fn_term_p", "CONSTRAINT-MATCH-SOME-FN-TERM-P", 1, 0, false);
        declareFunction("some_fn_term_constraint", "SOME-FN-TERM-CONSTRAINT", 2, 0, false);
        declareFunction("transform_constraint_match_infn_ternary_term", "TRANSFORM-CONSTRAINT-MATCH-INFN-TERNARY-TERM", 1, 0, false);
        declareFunction("constraint_match_infn_ternary_term_p", "CONSTRAINT-MATCH-INFN-TERNARY-TERM-P", 1, 0, false);
        declareFunction("add_case_insensitivity_marker_to_query_constraint", "ADD-CASE-INSENSITIVITY-MARKER-TO-QUERY-CONSTRAINT", 1, 0, false);
        declareFunction("transform_temporal_qualification_on_query_constraint", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT", 2, 0, false);
        declareFunction("transform_temporal_qualification_on_query_constraint_new", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT-NEW", 2, 0, false);
        declareFunction("transform_temporal_qualification_on_query_constraint_old", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT-OLD", 2, 0, false);
        declareFunction("compute_mt_expression_for_temporal_qualification_on_query_constraint", "COMPUTE-MT-EXPRESSION-FOR-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT", 2, 0, false);
        declareFunction("mt_union_fn_mts_only", "MT-UNION-FN-MTS-ONLY", 1, 0, false);
        declareFunction("add_regular_expression_marker_to_query_constraint", "ADD-REGULAR-EXPRESSION-MARKER-TO-QUERY-CONSTRAINT", 2, 0, false);
        declareFunction("generate_note_reformulation_formula", "GENERATE-NOTE-REFORMULATION-FORMULA", 4, 0, false);
        declareFunction("is_note_reformulation_assertionP", "IS-NOTE-REFORMULATION-ASSERTION?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_constrained_term_finder_file() {
        defparameter("*CONSTRAINED-TERM-FINDER-QUERIES-BROWSABLE?*", NIL);
        defparameter("*CONSTRAINT-MATCH-IGNORE-VARS*", NIL);
        defparameter("*CONSTRAINT-MATCH-CONSTRAINTS*", NIL);
        defparameter("*EXPAND-SPATIALLY-TRANSITIVE-CONSTRAINTS?*", NIL);
        defparameter("*SPATIALLY-TRANSITIVE-CONSTRAINTS*", $UNBOUND);
        deflexical("*FUZZY-QUANTITY-FUNCTIONS*", $list46);
        defparameter("*USE-MT-AND-DIMS-VARIABLES?*", NIL);
        return NIL;
    }

    public static SubLObject setup_constrained_term_finder_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constrained_term_finder_file();
    }

    @Override
    public void initializeVariables() {
        init_constrained_term_finder_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constrained_term_finder_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("CASE-INSENSITIVE"), $TRUE, makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"));

    static private final SubLList $list_alt12 = list(list(makeSymbol("*CONSTRAINT-MATCH-IGNORE-VARS*"), NIL));

    static private final SubLString $str_alt13$___A_D = makeString("??~A~D");

    static private final SubLList $list_alt25 = list(list($BIND, makeSymbol("ARG0")), makeKeyword("ANYTHING"), $FORT);

    static private final SubLList $list_alt39 = list(reader_make_constant_shell("temporallySubsumes"), list(reader_make_constant_shell("SomeTimeInIntervalFn"), list($BIND, makeSymbol("BOUNDING-TIME-INTERVAL")), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt41 = list(reader_make_constant_shell("temporallySubsumes"), list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list(reader_make_constant_shell("SomeTimeInIntervalFn"), list($BIND, makeSymbol("START")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("SomeTimeInIntervalFn"), list($BIND, makeSymbol("END")), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt44 = list(ONE_INTEGER, ONE_INTEGER);

    static private final SubLList $list_alt45 = list(ONE_INTEGER, TWO_INTEGER);

    static private final SubLList $list_alt46 = list(reader_make_constant_shell("IntervalOfTypeMinFn"), reader_make_constant_shell("IntervalOfTypeMaxFn"), reader_make_constant_shell("IntervalRangeFn"), reader_make_constant_shell("ApproximatelyFn"), reader_make_constant_shell("AlmostFn"), reader_make_constant_shell("Unity"));

    static private final SubLList $list_alt53 = list(makeDouble(0.9));

    static private final SubLList $list_alt54 = list(makeDouble(1.1));

    static private final SubLList $list_alt59 = list(makeSymbol("MIN"), makeSymbol("MAX"));

    static private final SubLList $list_alt65 = list(THREE_INTEGER);

    static private final SubLList $list_alt70 = list(reader_make_constant_shell("The"), reader_make_constant_shell("Microtheory"));

    static private final SubLList $list_alt71 = list(reader_make_constant_shell("ist"), list(reader_make_constant_shell("MtSpace"), makeKeyword("ANYTHING"), list(makeKeyword("AND"), list($BIND, makeSymbol("TEMPORAL-MT")), list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), list(makeKeyword("AND"), makeKeyword("EL-VARIABLE"), list($BIND, makeSymbol("DATE-VAR"))), reader_make_constant_shell("TimePoint")))), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt74 = list($BIND, makeSymbol("DATE"));

    static private final SubLString $str_alt78$MT_DIMS = makeString("MT-DIMS");
}

/**
 * Total time: 346 ms
 */
