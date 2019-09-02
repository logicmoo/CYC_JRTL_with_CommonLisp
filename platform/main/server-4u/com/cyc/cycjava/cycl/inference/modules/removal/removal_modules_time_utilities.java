/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-TIME-UTILITIES
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-time-utilities.lisp
 * created:     2019/07/03 17:37:45
 */
public final class removal_modules_time_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_time_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities";


    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $REMOVAL_SUB_TIME_INTERVAL_OF_TYPE = makeKeyword("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE");

    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("temporallySubsumes")), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-APPLICABILITY"), $COST, makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), list($CALL, makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <varN> <time-type>)\n           (#$temporallySubsumes <time-interval> <varN>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa ?MONTH #$CalendarWeek)\n           (#$temporallySubsumes (#$MonthFn #$May (#$YearFn 2005)) ?MONTH))") });

    static private final SubLList $list2 = list(makeSymbol("MT"), makeSymbol("ASENT"));



    static private final SubLList $list4 = list(makeSymbol("VAR"), makeSymbol("TYPE"));



    static private final SubLList $list6 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));



    static private final SubLList $list8 = list(makeSymbol("INTERVAL1"), makeSymbol("VAR1"));

    static private final SubLSymbol $sym9$_ = makeSymbol("<");

    static private final SubLList $list10 = list(makeSymbol("ISA-MT"), makeSymbol("ISA-ASENT"));

    static private final SubLList $list11 = list(makeSymbol("TEMP-MT"), makeSymbol("TEMP-ASENT"));

    private static final SubLSymbol SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE = makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-DONE");

    private static final SubLSymbol SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT = makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-NEXT");

    private static final SubLSymbol SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE = makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-FINALIZE");

    static private final SubLList $list16 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));

    static private final SubLList $list21 = list(makeSymbol("INDEX"), makeSymbol("DIRECTION"), makeSymbol("TYPE"), makeSymbol("INTERVAL"), makeSymbol("VAR"), makeSymbol("JUST-TEMPLATE"));



    private static final SubLSymbol $REMOVAL_STARTING_DAY_CHECK_POS = makeKeyword("REMOVAL-STARTING-DAY-CHECK-POS");

    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("startingDay"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startingDay"), list($TEST, makeSymbol("DATE-INTERVAL-P")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STARTING-DAY-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDay <time-interval> <day>)"), makeKeyword("EXAMPLE"), makeString("(#$startingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002))))") });

    private static final SubLSymbol $REMOVAL_STARTING_DAY_CHECK_NEG = makeKeyword("REMOVAL-STARTING-DAY-CHECK-NEG");

    private static final SubLList $list26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("startingDay"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startingDay"), list($TEST, makeSymbol("DATE-INTERVAL-P")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STARTING-DAY-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startingDay <time-interval> <day>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$startingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002)))))") });

    private static final SubLSymbol $REMOVAL_STARTING_DAY_POS = makeKeyword("REMOVAL-STARTING-DAY-POS");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("startingDay"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startingDay"), list($TEST, makeSymbol("DATE-INTERVAL-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STARTING-DAY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDay <time-interval> ?DAY)"), makeKeyword("EXAMPLE"), makeString("(#$startingDay (#$YearFn 2002) ?DAY) -> (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002)))") });











    private static final SubLSymbol $REMOVAL_ENDING_DAY_CHECK_POS = makeKeyword("REMOVAL-ENDING-DAY-CHECK-POS");

    private static final SubLList $list36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("endingDay"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("endingDay"), list($TEST, makeSymbol("DATE-INTERVAL-P")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ENDING-DAY-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDay <time-interval> <day>)"), makeKeyword("EXAMPLE"), makeString("(#$endingDay (#$YearFn 2002) (#$DayFn 31 (#$MonthFn #$December (#$YearFn 2002))))") });

    private static final SubLSymbol $REMOVAL_ENDING_DAY_CHECK_NEG = makeKeyword("REMOVAL-ENDING-DAY-CHECK-NEG");

    private static final SubLList $list38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("endingDay"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("endingDay"), list($TEST, makeSymbol("DATE-INTERVAL-P")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ENDING-DAY-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$endingDay <time-interval> <day>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$endingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002))))") });

    private static final SubLSymbol $REMOVAL_ENDING_DAY_POS = makeKeyword("REMOVAL-ENDING-DAY-POS");

    private static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("endingDay"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("endingDay"), list($TEST, makeSymbol("DATE-INTERVAL-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ENDING-DAY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDay <time-interval> ?DAY)"), makeKeyword("EXAMPLE"), makeString("(#$endingDay (#$YearFn 2002) ?DAY) -> (#$DayFn 31 (#$MonthFn #$December (#$YearFn 2002)))") });



    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("maximalContiguousSpanningInterval"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("maximalContiguousSpanningInterval"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAXIMALCONTIGUOUSSPANNINGINTERVAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalContiguousSpanningInterval <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(maximalContiguousSpanningInterval (TheSet (DateFromStringFn \"2002\") (DateFromStringFn \"2003\")) (#$TimeIntervalInclusiveFn (DateFromStringFn \"2002\") (DateFromStringFn \"2003\")))") });

    private static final SubLSymbol $sym46$DATE__ = makeSymbol("DATE<=");

    private static final SubLSymbol FIRST_CYCL_INTERVAL_INITIAL_SECOND_POSSIBLY_INDETERMINATE_LATE = makeSymbol("FIRST-CYCL-INTERVAL-INITIAL-SECOND-POSSIBLY-INDETERMINATE-LATE");

    private static final SubLString $str48$INPUT___A__ = makeString("INPUT: ~A~%");

    private static final SubLString $str49$_________________________________ = makeString("-------------------------------------------------------~%");

    private static final SubLString $str50$NEXT__A_____A_____A_____A_____A__ = makeString("NEXT ~A~%  ~A~%  ~A~%  ~A~%  ~A~%");

    private static final SubLString $str51$CURRENT_____A_____A_____A_____A__ = makeString("CURRENT~%  ~A~%  ~A~%  ~A~%  ~A~%");

    private static final SubLString $str52$initial_setup_____A_____A_____A__ = makeString("initial setup~%  ~A~%  ~A~%  ~A~%  ~A~%");

    private static final SubLString $str53$stitching_____A_____A_____A_____A = makeString("stitching~%  ~A~%  ~A~%  ~A~%  ~A~%");

    private static final SubLString $str54$into_current_____A_____A_____A___ = makeString("into current~%  ~A~%  ~A~%  ~A~%  ~A~%");

    private static final SubLString $str55$to_get_____A_____A_____A_____A__ = makeString("to get~%  ~A~%  ~A~%  ~A~%  ~A~%");

    private static final SubLString $str56$adding_____A_____A_____A_____A__ = makeString("adding~%  ~A~%  ~A~%  ~A~%  ~A~%");

    private static final SubLString $str57$adding_last_____A_____A_____A____ = makeString("adding last~%  ~A~%  ~A~%  ~A~%  ~A~%");

    // Definitions
    public static final SubLObject removal_sub_time_interval_of_type_applicability_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subclause_specs = NIL;
                SubLObject index = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    {
                        SubLObject datum = contextualized_asent;
                        SubLObject current = datum;
                        SubLObject mt = NIL;
                        SubLObject asent = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt2);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt2);
                        asent = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject mt_var = mt;
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        if ($$isa == cycl_utilities.atomic_sentence_predicate(asent)) {
                                            {
                                                SubLObject datum_1 = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                                                SubLObject current_2 = datum_1;
                                                SubLObject var = NIL;
                                                SubLObject type = NIL;
                                                destructuring_bind_must_consp(current_2, datum_1, $list_alt4);
                                                var = current_2.first();
                                                current_2 = current_2.rest();
                                                destructuring_bind_must_consp(current_2, datum_1, $list_alt4);
                                                type = current_2.first();
                                                current_2 = current_2.rest();
                                                if (NIL == current_2) {
                                                    if (((NIL != variables.variable_p(var)) && (NIL != forts.fort_p(type))) && (NIL != isa.isaP(type, $$TimeParameter, UNPROVIDED, UNPROVIDED))) {
                                                        {
                                                            SubLObject index1 = ZERO_INTEGER;
                                                            SubLObject cdolist_list_var_3 = clauses.pos_lits(contextualized_dnf_clause);
                                                            SubLObject contextualized_asent1 = NIL;
                                                            for (contextualized_asent1 = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , contextualized_asent1 = cdolist_list_var_3.first()) {
                                                                if (!index.eql(index1)) {
                                                                    {
                                                                        SubLObject datum_4 = contextualized_asent1;
                                                                        SubLObject current_5 = datum_4;
                                                                        SubLObject mt1 = NIL;
                                                                        SubLObject asent1 = NIL;
                                                                        destructuring_bind_must_consp(current_5, datum_4, $list_alt6);
                                                                        mt1 = current_5.first();
                                                                        current_5 = current_5.rest();
                                                                        destructuring_bind_must_consp(current_5, datum_4, $list_alt6);
                                                                        asent1 = current_5.first();
                                                                        current_5 = current_5.rest();
                                                                        if (NIL == current_5) {
                                                                            {
                                                                                SubLObject mt_var_6 = mt1;
                                                                                {
                                                                                    SubLObject _prev_bind_0_7 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_9 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                    try {
                                                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_6), thread);
                                                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_6), thread);
                                                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_6), thread);
                                                                                        if ($$temporallySubsumes == cycl_utilities.atomic_sentence_predicate(asent1)) {
                                                                                            {
                                                                                                SubLObject datum_10 = cycl_utilities.atomic_sentence_args(asent1, UNPROVIDED);
                                                                                                SubLObject current_11 = datum_10;
                                                                                                SubLObject interval1 = NIL;
                                                                                                SubLObject var1 = NIL;
                                                                                                destructuring_bind_must_consp(current_11, datum_10, $list_alt8);
                                                                                                interval1 = current_11.first();
                                                                                                current_11 = current_11.rest();
                                                                                                destructuring_bind_must_consp(current_11, datum_10, $list_alt8);
                                                                                                var1 = current_11.first();
                                                                                                current_11 = current_11.rest();
                                                                                                if (NIL == current_11) {
                                                                                                    if (((((var == var1) && (NIL != variables.fully_bound_p(interval1))) && (NIL != time_interval_utilities.date_interval_p(interval1))) && (NIL == date_utilities.always_time_intervalP(interval1))) && (NIL == time_interval_utilities.indeterminate_date_interval_p(interval1))) {
                                                                                                        subclause_specs = cons(list(NIL, Sort.sort(list(index, index1), $sym9$_, UNPROVIDED)), subclause_specs);
                                                                                                    }
                                                                                                } else {
                                                                                                    cdestructuring_bind_error(datum_10, $list_alt8);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_9, thread);
                                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_8, thread);
                                                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_7, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum_4, $list_alt6);
                                                                        }
                                                                    }
                                                                }
                                                                index1 = add(index1, ONE_INTEGER);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_1, $list_alt4);
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
                        } else {
                            cdestructuring_bind_error(datum, $list_alt2);
                        }
                    }
                    index = add(index, ONE_INTEGER);
                }
                return subclause_specs;
            }
        }
    }

    // Definitions
    public static SubLObject removal_sub_time_interval_of_type_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list2);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                        SubLObject current_$2;
                        final SubLObject datum_$1 = current_$2 = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                        SubLObject var = NIL;
                        SubLObject type = NIL;
                        destructuring_bind_must_consp(current_$2, datum_$1, $list4);
                        var = current_$2.first();
                        current_$2 = current_$2.rest();
                        destructuring_bind_must_consp(current_$2, datum_$1, $list4);
                        type = current_$2.first();
                        current_$2 = current_$2.rest();
                        if (NIL == current_$2) {
                            if (((NIL != variables.variable_p(var)) && (NIL != forts.fort_p(type))) && (NIL != isa.isaP(type, $$TimeParameter, UNPROVIDED, UNPROVIDED))) {
                                SubLObject index2 = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$3 = clauses.pos_lits(contextualized_dnf_clause);
                                SubLObject contextualized_asent2 = NIL;
                                contextualized_asent2 = cdolist_list_var_$3.first();
                                while (NIL != cdolist_list_var_$3) {
                                    if (!index.eql(index2)) {
                                        SubLObject current_$3;
                                        final SubLObject datum_$2 = current_$3 = contextualized_asent2;
                                        SubLObject mt2 = NIL;
                                        SubLObject asent2 = NIL;
                                        destructuring_bind_must_consp(current_$3, datum_$2, $list6);
                                        mt2 = current_$3.first();
                                        current_$3 = current_$3.rest();
                                        destructuring_bind_must_consp(current_$3, datum_$2, $list6);
                                        asent2 = current_$3.first();
                                        current_$3 = current_$3.rest();
                                        if (NIL == current_$3) {
                                            final SubLObject mt_var_$6 = mt2;
                                            final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$9 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$6), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$6), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$6), thread);
                                                if ($$temporallySubsumes.eql(cycl_utilities.atomic_sentence_predicate(asent2))) {
                                                    SubLObject current_$4;
                                                    final SubLObject datum_$3 = current_$4 = cycl_utilities.atomic_sentence_args(asent2, UNPROVIDED);
                                                    SubLObject interval1 = NIL;
                                                    SubLObject var2 = NIL;
                                                    destructuring_bind_must_consp(current_$4, datum_$3, $list8);
                                                    interval1 = current_$4.first();
                                                    current_$4 = current_$4.rest();
                                                    destructuring_bind_must_consp(current_$4, datum_$3, $list8);
                                                    var2 = current_$4.first();
                                                    current_$4 = current_$4.rest();
                                                    if (NIL == current_$4) {
                                                        if ((((var.eql(var2) && (NIL != variables.fully_bound_p(interval1))) && (NIL != time_interval_utilities.date_interval_p(interval1))) && (NIL == date_utilities.always_time_intervalP(interval1))) && (NIL == time_interval_utilities.indeterminate_date_interval_p(interval1))) {
                                                            subclause_specs = cons(list(NIL, Sort.sort(list(index, index2), $sym9$_, UNPROVIDED)), subclause_specs);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum_$3, $list8);
                                                    }
                                                }
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$9, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$8, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_$2, $list6);
                                        }
                                    }
                                    index2 = add(index2, ONE_INTEGER);
                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                    contextualized_asent2 = cdolist_list_var_$3.first();
                                } 
                            }
                        } else {
                            cdestructuring_bind_error(datum_$1, $list4);
                        }
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(datum, $list2);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        return subclause_specs;
    }

    public static final SubLObject removal_sub_time_interval_of_type_cost_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject isa_lit = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities.removal_sub_time_interval_of_type_literals(contextualized_dnf_clause);
                SubLObject temp_lit = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject datum = isa_lit;
                    SubLObject current = datum;
                    SubLObject isa_mt = NIL;
                    SubLObject isa_asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    isa_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    isa_asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject datum_12 = temp_lit;
                            SubLObject current_13 = datum_12;
                            SubLObject temp_mt = NIL;
                            SubLObject temp_asent = NIL;
                            destructuring_bind_must_consp(current_13, datum_12, $list_alt11);
                            temp_mt = current_13.first();
                            current_13 = current_13.rest();
                            destructuring_bind_must_consp(current_13, datum_12, $list_alt11);
                            temp_asent = current_13.first();
                            current_13 = current_13.rest();
                            if (NIL == current_13) {
                                {
                                    SubLObject type = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
                                    SubLObject v_int = cycl_utilities.atomic_sentence_arg1(temp_asent, UNPROVIDED);
                                    SubLObject type_period = NIL;
                                    SubLObject int_duration = NIL;
                                    {
                                        SubLObject mt_var = isa_mt;
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                type_period = (NIL != time_parameter_utilities.gappy_time_type_p(type)) ? ((SubLObject) (time_parameter_utilities.gappy_type_period(type))) : time_parameter_utilities.get_duration_of_type(type);
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject mt_var = temp_mt;
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                int_duration = time_parameter_utilities.get_duration_of_interval(v_int);
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    if ((NIL == time_parameter_utilities.duration_p(type_period)) || (NIL == time_parameter_utilities.duration_p(int_duration))) {
                                        return ZERO_INTEGER;
                                    } else {
                                        if (NIL != time_parameter_utilities.a_really_long_timeP(type_period)) {
                                            return ZERO_INTEGER;
                                        } else {
                                            if (NIL != time_parameter_utilities.a_really_long_timeP(int_duration)) {
                                                return $most_positive_fixnum$.getGlobalValue();
                                            } else {
                                                if (NIL != time_parameter_utilities.durationL(int_duration, type_period)) {
                                                    return NIL != time_parameter_utilities.durationL(int_duration, time_parameter_utilities.get_duration_of_type(type)) ? ((SubLObject) (ZERO_INTEGER)) : ONE_INTEGER;
                                                } else {
                                                    if (NIL != time_parameter_utilities.durationE(int_duration, type_period)) {
                                                        return ONE_INTEGER;
                                                    } else {
                                                        {
                                                            SubLObject type_type = time_parameter_utilities.duration_type(type_period);
                                                            SubLObject type_magnitude = time_parameter_utilities.duration_magnitude(type_period);
                                                            SubLObject int_type = time_parameter_utilities.duration_type(int_duration);
                                                            SubLObject int_magnitude = time_parameter_utilities.duration_magnitude(int_duration);
                                                            return NIL != time_parameter_utilities.duration_typeL(type_type, int_type) ? ((SubLObject) (multiply(int_magnitude, divide(time_parameter_utilities.find_duration_quotient(type_type, int_type, UNPROVIDED), type_magnitude)))) : multiply(divide(int_magnitude, time_parameter_utilities.find_duration_quotient(int_type, type_type, UNPROVIDED)), type_magnitude);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum_12, $list_alt11);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt10);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_sub_time_interval_of_type_cost(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject isa_lit = removal_sub_time_interval_of_type_literals(contextualized_dnf_clause);
        final SubLObject temp_lit = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        final SubLObject datum = current = isa_lit;
        SubLObject isa_mt = NIL;
        SubLObject isa_asent = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        isa_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        isa_asent = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$13;
            final SubLObject datum_$12 = current_$13 = temp_lit;
            SubLObject temp_mt = NIL;
            SubLObject temp_asent = NIL;
            destructuring_bind_must_consp(current_$13, datum_$12, $list11);
            temp_mt = current_$13.first();
            current_$13 = current_$13.rest();
            destructuring_bind_must_consp(current_$13, datum_$12, $list11);
            temp_asent = current_$13.first();
            current_$13 = current_$13.rest();
            if (NIL == current_$13) {
                final SubLObject type = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
                final SubLObject v_int = cycl_utilities.atomic_sentence_arg1(temp_asent, UNPROVIDED);
                SubLObject type_period = NIL;
                SubLObject int_duration = NIL;
                SubLObject mt_var = isa_mt;
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    type_period = (NIL != time_parameter_utilities.gappy_time_type_p(type)) ? time_parameter_utilities.gappy_type_period(type) : time_parameter_utilities.get_duration_of_type(type);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                mt_var = temp_mt;
                _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    int_duration = time_parameter_utilities.get_duration_of_interval(v_int);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if ((NIL == time_parameter_utilities.duration_p(type_period)) || (NIL == time_parameter_utilities.duration_p(int_duration))) {
                    return ZERO_INTEGER;
                }
                if (NIL != time_parameter_utilities.a_really_long_timeP(type_period)) {
                    return ZERO_INTEGER;
                }
                if (NIL != time_parameter_utilities.a_really_long_timeP(int_duration)) {
                    return $most_positive_fixnum$.getGlobalValue();
                }
                if (NIL != time_parameter_utilities.durationL(int_duration, type_period)) {
                    return NIL != time_parameter_utilities.durationL(int_duration, time_parameter_utilities.get_duration_of_type(type)) ? ZERO_INTEGER : ONE_INTEGER;
                }
                if (NIL != time_parameter_utilities.durationE(int_duration, type_period)) {
                    return ONE_INTEGER;
                }
                final SubLObject type_type = time_parameter_utilities.duration_type(type_period);
                final SubLObject type_magnitude = time_parameter_utilities.duration_magnitude(type_period);
                final SubLObject int_type = time_parameter_utilities.duration_type(int_duration);
                final SubLObject int_magnitude = time_parameter_utilities.duration_magnitude(int_duration);
                return NIL != time_parameter_utilities.duration_typeL(type_type, int_type) ? multiply(int_magnitude, divide(time_parameter_utilities.find_duration_quotient(type_type, int_type, UNPROVIDED), type_magnitude)) : multiply(divide(int_magnitude, time_parameter_utilities.find_duration_quotient(int_type, type_type, UNPROVIDED)), type_magnitude);
            } else {
                cdestructuring_bind_error(datum_$12, $list11);
            }
        } else {
            cdestructuring_bind_error(datum, $list10);
        }
        return NIL;
    }

    public static final SubLObject removal_sub_time_interval_of_type_output_generate_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject isa_lit = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities.removal_sub_time_interval_of_type_literals(contextualized_dnf_clause);
                SubLObject temp_lit = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject datum = isa_lit;
                    SubLObject current = datum;
                    SubLObject isa_mt = NIL;
                    SubLObject isa_asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    isa_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    isa_asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject datum_14 = temp_lit;
                            SubLObject current_15 = datum_14;
                            SubLObject temp_mt = NIL;
                            SubLObject temp_asent = NIL;
                            destructuring_bind_must_consp(current_15, datum_14, $list_alt11);
                            temp_mt = current_15.first();
                            current_15 = current_15.rest();
                            destructuring_bind_must_consp(current_15, datum_14, $list_alt11);
                            temp_asent = current_15.first();
                            current_15 = current_15.rest();
                            if (NIL == current_15) {
                                {
                                    SubLObject type = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
                                    SubLObject interval = cycl_utilities.atomic_sentence_arg1(temp_asent, UNPROVIDED);
                                    SubLObject var = cycl_utilities.atomic_sentence_arg1(isa_asent, UNPROVIDED);
                                    SubLObject type_duration = NIL;
                                    SubLObject int_duration = NIL;
                                    {
                                        SubLObject mt_var = isa_mt;
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                type_duration = time_parameter_utilities.get_duration_of_type(type);
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject mt_var = temp_mt;
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                int_duration = time_parameter_utilities.get_duration_of_interval(interval);
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    if ((NIL == time_parameter_utilities.duration_p(type_duration)) || (NIL == time_parameter_utilities.duration_p(int_duration))) {
                                        return iteration.new_null_iterator();
                                    } else {
                                        if (NIL != time_parameter_utilities.a_really_long_timeP(int_duration)) {
                                            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities.new_sub_time_interval_of_type_iterator(type, interval, var, contextualized_dnf_clause);
                                        } else {
                                            if (NIL != time_parameter_utilities.durationL(int_duration, type_duration)) {
                                                return iteration.new_null_iterator();
                                            } else {
                                                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities.new_sub_time_interval_of_type_iterator(type, interval, var, contextualized_dnf_clause);
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum_14, $list_alt11);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt10);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_sub_time_interval_of_type_output_generate(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject isa_lit = removal_sub_time_interval_of_type_literals(contextualized_dnf_clause);
        final SubLObject temp_lit = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        final SubLObject datum = current = isa_lit;
        SubLObject isa_mt = NIL;
        SubLObject isa_asent = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        isa_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        isa_asent = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$15;
            final SubLObject datum_$14 = current_$15 = temp_lit;
            SubLObject temp_mt = NIL;
            SubLObject temp_asent = NIL;
            destructuring_bind_must_consp(current_$15, datum_$14, $list11);
            temp_mt = current_$15.first();
            current_$15 = current_$15.rest();
            destructuring_bind_must_consp(current_$15, datum_$14, $list11);
            temp_asent = current_$15.first();
            current_$15 = current_$15.rest();
            if (NIL == current_$15) {
                final SubLObject type = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
                final SubLObject interval = cycl_utilities.atomic_sentence_arg1(temp_asent, UNPROVIDED);
                final SubLObject var = cycl_utilities.atomic_sentence_arg1(isa_asent, UNPROVIDED);
                SubLObject type_duration = NIL;
                SubLObject int_duration = NIL;
                SubLObject mt_var = isa_mt;
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    type_duration = time_parameter_utilities.get_duration_of_type(type);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                mt_var = temp_mt;
                _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    int_duration = time_parameter_utilities.get_duration_of_interval(interval);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if ((NIL == time_parameter_utilities.duration_p(type_duration)) || (NIL == time_parameter_utilities.duration_p(int_duration))) {
                    return iteration.new_null_iterator();
                }
                if (NIL != time_parameter_utilities.a_really_long_timeP(int_duration)) {
                    return new_sub_time_interval_of_type_iterator(type, interval, var, contextualized_dnf_clause);
                }
                if (NIL != time_parameter_utilities.durationL(int_duration, type_duration)) {
                    return iteration.new_null_iterator();
                }
                return new_sub_time_interval_of_type_iterator(type, interval, var, contextualized_dnf_clause);
            } else {
                cdestructuring_bind_error(datum_$14, $list11);
            }
        } else {
            cdestructuring_bind_error(datum, $list10);
        }
        return NIL;
    }

    public static final SubLObject removal_sub_time_interval_of_type_literals_alt(SubLObject contextualized_dnf_clause) {
        {
            SubLObject lit0 = clauses.clause_literal(contextualized_dnf_clause, $POS, ZERO_INTEGER);
            SubLObject lit1 = clauses.clause_literal(contextualized_dnf_clause, $POS, ONE_INTEGER);
            return $$isa == cycl_utilities.atomic_sentence_predicate(inference_datastructures_problem_query.contextualized_asent_asent(lit0)) ? ((SubLObject) (values(lit0, lit1))) : values(lit1, lit0);
        }
    }

    public static SubLObject removal_sub_time_interval_of_type_literals(final SubLObject contextualized_dnf_clause) {
        final SubLObject lit0 = clauses.clause_literal(contextualized_dnf_clause, $POS, ZERO_INTEGER);
        final SubLObject lit2 = clauses.clause_literal(contextualized_dnf_clause, $POS, ONE_INTEGER);
        return $$isa.eql(cycl_utilities.atomic_sentence_predicate(inference_datastructures_problem_query.contextualized_asent_asent(lit0))) ? values(lit0, lit2) : values(lit2, lit0);
    }

    public static final SubLObject new_sub_time_interval_of_type_iterator_alt(SubLObject type, SubLObject interval, SubLObject var, SubLObject contextualized_dnf_clause) {
        return iteration.new_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities.sub_time_interval_of_type_iterator_state(type, interval, var, contextualized_dnf_clause), SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE, SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT, SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE);
    }

    public static SubLObject new_sub_time_interval_of_type_iterator(final SubLObject type, final SubLObject interval, final SubLObject var, final SubLObject contextualized_dnf_clause) {
        return iteration.new_iterator(sub_time_interval_of_type_iterator_state(type, interval, var, contextualized_dnf_clause), SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE, SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT, SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE);
    }

    public static final SubLObject sub_time_interval_of_type_iterator_state_alt(SubLObject type, SubLObject interval, SubLObject var, SubLObject contextualized_dnf_clause) {
        {
            SubLObject datum = clauses.clause_literal(contextualized_dnf_clause, $POS, ZERO_INTEGER);
            SubLObject current = datum;
            SubLObject mt0 = NIL;
            SubLObject asent0 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            mt0 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt16);
            asent0 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_16 = clauses.clause_literal(contextualized_dnf_clause, $POS, ONE_INTEGER);
                    SubLObject current_17 = datum_16;
                    SubLObject mt1 = NIL;
                    SubLObject asent1 = NIL;
                    destructuring_bind_must_consp(current_17, datum_16, $list_alt6);
                    mt1 = current_17.first();
                    current_17 = current_17.rest();
                    destructuring_bind_must_consp(current_17, datum_16, $list_alt6);
                    asent1 = current_17.first();
                    current_17 = current_17.rest();
                    if (NIL == current_17) {
                        {
                            SubLObject support0 = NIL;
                            SubLObject support1 = NIL;
                            if ($$isa == cycl_utilities.atomic_sentence_predicate(asent0)) {
                                support0 = arguments.make_hl_support($ISA, asent0, mt0, UNPROVIDED);
                                support1 = arguments.make_hl_support($TIME, asent1, mt1, UNPROVIDED);
                            } else {
                                support0 = arguments.make_hl_support($TIME, asent0, mt0, UNPROVIDED);
                                support1 = arguments.make_hl_support($ISA, asent1, mt1, UNPROVIDED);
                            }
                            return NIL != date_utilities.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(interval)) ? ((SubLObject) (list(ZERO_INTEGER, $BACKWARD, type, interval, var, list(list(support0), list(support1))))) : list(ZERO_INTEGER, $FORWARD, type, interval, var, list(list(support0), list(support1)));
                        }
                    } else {
                        cdestructuring_bind_error(datum_16, $list_alt6);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt16);
            }
        }
        return NIL;
    }

    public static SubLObject sub_time_interval_of_type_iterator_state(final SubLObject type, final SubLObject interval, final SubLObject var, final SubLObject contextualized_dnf_clause) {
        SubLObject current;
        final SubLObject datum = current = clauses.clause_literal(contextualized_dnf_clause, $POS, ZERO_INTEGER);
        SubLObject mt0 = NIL;
        SubLObject asent0 = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        mt0 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        asent0 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$17;
            final SubLObject datum_$16 = current_$17 = clauses.clause_literal(contextualized_dnf_clause, $POS, ONE_INTEGER);
            SubLObject mt2 = NIL;
            SubLObject asent2 = NIL;
            destructuring_bind_must_consp(current_$17, datum_$16, $list6);
            mt2 = current_$17.first();
            current_$17 = current_$17.rest();
            destructuring_bind_must_consp(current_$17, datum_$16, $list6);
            asent2 = current_$17.first();
            current_$17 = current_$17.rest();
            if (NIL == current_$17) {
                SubLObject support0 = NIL;
                SubLObject support2 = NIL;
                if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(asent0))) {
                    support0 = arguments.make_hl_support($ISA, asent0, mt0, UNPROVIDED);
                    support2 = arguments.make_hl_support($TIME, asent2, mt2, UNPROVIDED);
                } else {
                    support0 = arguments.make_hl_support($TIME, asent0, mt0, UNPROVIDED);
                    support2 = arguments.make_hl_support($ISA, asent2, mt2, UNPROVIDED);
                }
                return NIL != date_utilities.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(interval)) ? list(ZERO_INTEGER, $BACKWARD, type, interval, var, list(list(support0), list(support2))) : list(ZERO_INTEGER, $FORWARD, type, interval, var, list(list(support0), list(support2)));
            }
            cdestructuring_bind_error(datum_$16, $list6);
        } else {
            cdestructuring_bind_error(datum, $list16);
        }
        return NIL;
    }

    public static final SubLObject sub_time_interval_of_type_iterator_done_alt(SubLObject state) {
        return sublisp_null(state);
    }

    public static SubLObject sub_time_interval_of_type_iterator_done(final SubLObject state) {
        return sublisp_null(state);
    }

    public static final SubLObject sub_time_interval_of_type_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject index = NIL;
                SubLObject direction = NIL;
                SubLObject type = NIL;
                SubLObject interval = NIL;
                SubLObject var = NIL;
                SubLObject just_template = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt21);
                index = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt21);
                direction = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt21);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt21);
                interval = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt21);
                var = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt21);
                just_template = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject subinterval = ($BACKWARD == direction) ? ((SubLObject) (time_parameter_utilities.nth_type_ending_no_later_than_end_of_interval(interval, type, index))) : time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, index);
                        if (NIL == subinterval) {
                            return values(NIL, NIL, T);
                        } else {
                            if (NIL != sbhl_time_modules.temporally_subsumesP(interval, subinterval, UNPROVIDED)) {
                                set_nth(ZERO_INTEGER, state, add(nth(ZERO_INTEGER, state), ONE_INTEGER));
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = unification_utilities.term_unify(var, subinterval, T, T);
                                    SubLObject unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject justs = append(sublis(v_bindings, just_template, symbol_function(EQ), UNPROVIDED), unify_justification);
                                        return values(list(v_bindings, justs), state, NIL);
                                    }
                                }
                            } else {
                                return values(NIL, NIL, T);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt21);
                }
            }
            return NIL;
        }
    }

    public static SubLObject sub_time_interval_of_type_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = NIL;
        SubLObject direction = NIL;
        SubLObject type = NIL;
        SubLObject interval = NIL;
        SubLObject var = NIL;
        SubLObject just_template = NIL;
        destructuring_bind_must_consp(state, state, $list21);
        index = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list21);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list21);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list21);
        interval = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list21);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list21);
        just_template = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list21);
            return NIL;
        }
        final SubLObject subinterval = ($BACKWARD == direction) ? time_parameter_utilities.nth_type_ending_no_later_than_end_of_interval(interval, type, index) : time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, index);
        if (NIL == subinterval) {
            return values(NIL, NIL, T);
        }
        if (NIL != sbhl_time_modules.temporally_subsumesP(interval, subinterval, UNPROVIDED)) {
            set_nth(ZERO_INTEGER, state, add(nth(ZERO_INTEGER, state), ONE_INTEGER));
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(var, subinterval, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject justs = append(sublis(v_bindings, just_template, symbol_function(EQL), UNPROVIDED), unify_justification);
            return values(list(v_bindings, justs), state, NIL);
        }
        return values(NIL, NIL, T);
    }

    public static final SubLObject sub_time_interval_of_type_iterator_finalize_alt(SubLObject state) {
        return T;
    }

    public static SubLObject sub_time_interval_of_type_iterator_finalize(final SubLObject state) {
        return T;
    }

    public static SubLObject removal_starting_day_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject day_query = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject starting_date = time_interval_utilities.reduce_date_wrt_start(interval);
        if (NIL != date_utilities.date_p(starting_date)) {
            final SubLObject interval_start_precision = date_utilities.date_precision(starting_date);
            final SubLObject starting_day = ((interval_start_precision.eql($$CalendarSecond) || interval_start_precision.eql($$CalendarMinute)) || interval_start_precision.eql($$CalendarHour)) ? NIL : date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), $$CalendarDay, UNPROVIDED);
            if (NIL != starting_day) {
                final SubLObject v_bindings = unification_utilities.term_unify(day_query, starting_day, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("temporallySubsumes")), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-APPLICABILITY"), $COST, makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), list($CALL, makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <varN> <time-type>)\n           (#$temporallySubsumes <time-interval> <varN>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa ?MONTH #$CalendarWeek)\n           (#$temporallySubsumes (#$MonthFn #$May (#$YearFn 2005)) ?MONTH))") });

    static private final SubLList $list_alt2 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    public static SubLObject removal_starting_day_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject starting_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), $$CalendarDay, UNPROVIDED);
        if (NIL != czer_utilities.equals_elP(day_arg, starting_day, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt4 = list(makeSymbol("VAR"), makeSymbol("TYPE"));

    static private final SubLList $list_alt6 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));

    static private final SubLList $list_alt8 = list(makeSymbol("INTERVAL1"), makeSymbol("VAR1"));

    static private final SubLList $list_alt10 = list(makeSymbol("ISA-MT"), makeSymbol("ISA-ASENT"));

    public static SubLObject removal_starting_day_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject starting_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), $$CalendarDay, UNPROVIDED);
        if (NIL == czer_utilities.equals_elP(day_arg, starting_day, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt11 = list(makeSymbol("TEMP-MT"), makeSymbol("TEMP-ASENT"));

    static private final SubLList $list_alt16 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));

    static private final SubLList $list_alt21 = list(makeSymbol("INDEX"), makeSymbol("DIRECTION"), makeSymbol("TYPE"), makeSymbol("INTERVAL"), makeSymbol("VAR"), makeSymbol("JUST-TEMPLATE"));

    public static SubLObject removal_ending_day_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject day_query = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject ending_date = time_interval_utilities.reduce_date_wrt_end(interval);
        if (NIL != date_utilities.date_p(ending_date)) {
            final SubLObject interval_end_precision = date_utilities.date_precision(time_interval_utilities.reduce_date_wrt_end(interval));
            final SubLObject ending_day = ((interval_end_precision.eql($$CalendarSecond) || interval_end_precision.eql($$CalendarMinute)) || interval_end_precision.eql($$CalendarHour)) ? NIL : date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), $$CalendarDay, UNPROVIDED);
            if (NIL != ending_day) {
                final SubLObject v_bindings = unification_utilities.term_unify(day_query, ending_day, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_ending_day_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject ending_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), $$CalendarDay, UNPROVIDED);
        if (NIL != czer_utilities.equals_elP(day_arg, ending_day, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_ending_day_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject ending_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), $$CalendarDay, UNPROVIDED);
        if (NIL == czer_utilities.equals_elP(day_arg, ending_day, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_maximalcontiguousspanninginterval_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject el_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject answers = cdolist_list_var = Mapping.mapcar(CAR, maximal_intervals_subsuming_intervals(Mapping.mapcar(LIST, quantities.set_extent(el_set, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED));
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(asent, make_binary_formula(pred, el_set, v_answer), UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject first_cycl_interval_initial_second_possibly_indeterminate_late(final SubLObject v_object) {
        return time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(v_object.first());
    }

    public static SubLObject maximal_intervals_subsuming_intervals(SubLObject intervals_with_supports_list, SubLObject precision, SubLObject debugP) {
        if (precision == UNPROVIDED) {
            precision = NIL;
        }
        if (debugP == UNPROVIDED) {
            debugP = NIL;
        }
        if (NIL == intervals_with_supports_list) {
            return NIL;
        }
        SubLObject maximal_intervals_with_supports_list = NIL;
        intervals_with_supports_list = Sort.sort(copy_list(intervals_with_supports_list), $sym46$DATE__, FIRST_CYCL_INTERVAL_INITIAL_SECOND_POSSIBLY_INDETERMINATE_LATE);
        if (NIL != debugP) {
            SubLObject cdolist_list_var = Mapping.mapcar(CAR, intervals_with_supports_list);
            SubLObject interval = NIL;
            interval = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str48$INPUT___A__, interval);
                cdolist_list_var = cdolist_list_var.rest();
                interval = cdolist_list_var.first();
            } 
        }
        SubLObject merged_intervals_start_end_supports_list = NIL;
        SubLObject cur_earliest_start = NIL;
        SubLObject cur_latest_start = NIL;
        SubLObject cur_earliest_end = NIL;
        SubLObject cur_latest_end = NIL;
        SubLObject cur_supports = NIL;
        SubLObject cdolist_list_var2 = intervals_with_supports_list;
        SubLObject interval_with_supports = NIL;
        interval_with_supports = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject interval2 = time_interval_utilities.recanonicalize_time_interval(interval_with_supports.first(), UNPROVIDED, UNPROVIDED);
            final SubLObject supports = second(interval_with_supports);
            final SubLObject earliest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_early(interval2);
            final SubLObject latest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(interval2);
            final SubLObject earliest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_early(interval2);
            final SubLObject latest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_late(interval2);
            if (NIL != debugP) {
                format(T, $str49$_________________________________);
                format(T, $str50$NEXT__A_____A_____A_____A_____A__, new SubLObject[]{ interval2, earliest_start, latest_start, earliest_end, latest_end });
                format(T, $str51$CURRENT_____A_____A_____A_____A__, new SubLObject[]{ cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
            }
            if ((NIL == cur_earliest_start) || (NIL == cur_latest_end)) {
                if (NIL != debugP) {
                    format(T, $str52$initial_setup_____A_____A_____A__, new SubLObject[]{ earliest_start, latest_start, earliest_end, latest_end });
                }
                cur_earliest_start = earliest_start;
                cur_latest_start = latest_start;
                cur_earliest_end = earliest_end;
                cur_latest_end = latest_end;
                cur_supports = supports;
            } else {
                SubLObject cur_interval = time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end, UNPROVIDED, UNPROVIDED);
                if (NIL != time_interval_utilities.date_intervals_intersectP(cur_interval, interval2, T, T)) {
                    if (NIL != debugP) {
                        format(T, $str53$stitching_____A_____A_____A_____A, new SubLObject[]{ earliest_start, latest_start, earliest_end, latest_end });
                    }
                    if (NIL != debugP) {
                        format(T, $str54$into_current_____A_____A_____A___, new SubLObject[]{ cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
                    }
                    final SubLObject merged_interval = cur_interval = time_interval_utilities.merge_date_intervals(cur_interval, interval2);
                    cur_earliest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_early(cur_interval);
                    cur_latest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(cur_interval);
                    cur_earliest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_early(cur_interval);
                    cur_latest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_late(cur_interval);
                    if (NIL != debugP) {
                        format(T, $str55$to_get_____A_____A_____A_____A__, new SubLObject[]{ cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
                    }
                    SubLObject cdolist_list_var_$18 = supports;
                    SubLObject support = NIL;
                    support = cdolist_list_var_$18.first();
                    while (NIL != cdolist_list_var_$18) {
                        final SubLObject item_var = support;
                        if (NIL == member(item_var, cur_supports, symbol_function(EQL), symbol_function(IDENTITY))) {
                            cur_supports = cons(item_var, cur_supports);
                        }
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        support = cdolist_list_var_$18.first();
                    } 
                } else {
                    if (NIL != debugP) {
                        format(T, $str56$adding_____A_____A_____A_____A__, new SubLObject[]{ cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
                    }
                    merged_intervals_start_end_supports_list = cons(list(cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end, cur_supports), merged_intervals_start_end_supports_list);
                    cur_earliest_start = earliest_start;
                    cur_latest_start = latest_start;
                    cur_earliest_end = earliest_end;
                    cur_latest_end = latest_end;
                    cur_supports = supports;
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            interval_with_supports = cdolist_list_var2.first();
        } 
        if (NIL != debugP) {
            format(T, $str57$adding_last_____A_____A_____A____, new SubLObject[]{ cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
        }
        if ((NIL != cur_earliest_start) && (NIL != cur_latest_end)) {
            merged_intervals_start_end_supports_list = cons(list(cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end, cur_supports), merged_intervals_start_end_supports_list);
        }
        cdolist_list_var2 = merged_intervals_start_end_supports_list;
        SubLObject merged_interval_start_end_supports = NIL;
        merged_interval_start_end_supports = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            maximal_intervals_with_supports_list = cons(list(time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(merged_interval_start_end_supports.first(), second(merged_interval_start_end_supports), third(merged_interval_start_end_supports), fourth(merged_interval_start_end_supports), precision, T), fifth(merged_interval_start_end_supports)), maximal_intervals_with_supports_list);
            cdolist_list_var2 = cdolist_list_var2.rest();
            merged_interval_start_end_supports = cdolist_list_var2.first();
        } 
        return maximal_intervals_with_supports_list;
    }

    public static SubLObject declare_removal_modules_time_utilities_file() {
        declareFunction("removal_sub_time_interval_of_type_applicability", "REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-APPLICABILITY", 1, 0, false);
        declareFunction("removal_sub_time_interval_of_type_cost", "REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-COST", 1, 0, false);
        declareFunction("removal_sub_time_interval_of_type_output_generate", "REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction("removal_sub_time_interval_of_type_literals", "REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-LITERALS", 1, 0, false);
        declareFunction("new_sub_time_interval_of_type_iterator", "NEW-SUB-TIME-INTERVAL-OF-TYPE-ITERATOR", 4, 0, false);
        declareFunction("sub_time_interval_of_type_iterator_state", "SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-STATE", 4, 0, false);
        declareFunction("sub_time_interval_of_type_iterator_done", "SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-DONE", 1, 0, false);
        declareFunction("sub_time_interval_of_type_iterator_next", "SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sub_time_interval_of_type_iterator_finalize", "SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("removal_starting_day_pos_expand", "REMOVAL-STARTING-DAY-POS-EXPAND", 1, 1, false);
        declareFunction("removal_starting_day_check_pos_expand", "REMOVAL-STARTING-DAY-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_starting_day_check_neg_expand", "REMOVAL-STARTING-DAY-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_ending_day_pos_expand", "REMOVAL-ENDING-DAY-POS-EXPAND", 1, 1, false);
        declareFunction("removal_ending_day_check_pos_expand", "REMOVAL-ENDING-DAY-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_ending_day_check_neg_expand", "REMOVAL-ENDING-DAY-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_maximalcontiguousspanninginterval_expand", "REMOVAL-MAXIMALCONTIGUOUSSPANNINGINTERVAL-EXPAND", 1, 1, false);
        declareFunction("first_cycl_interval_initial_second_possibly_indeterminate_late", "FIRST-CYCL-INTERVAL-INITIAL-SECOND-POSSIBLY-INDETERMINATE-LATE", 1, 0, false);
        declareFunction("maximal_intervals_subsuming_intervals", "MAXIMAL-INTERVALS-SUBSUMING-INTERVALS", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_time_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_time_utilities_file() {
        inference_modules.inference_conjunctive_removal_module($REMOVAL_SUB_TIME_INTERVAL_OF_TYPE, $list1);
        inference_modules.register_solely_specific_removal_module_predicate($$startingDay);
        preference_modules.doomed_unless_arg_bindable($POS, $$startingDay, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_STARTING_DAY_CHECK_POS, $list24);
        inference_modules.inference_removal_module($REMOVAL_STARTING_DAY_CHECK_NEG, $list26);
        inference_modules.inference_removal_module($REMOVAL_STARTING_DAY_POS, $list28);
        inference_modules.register_solely_specific_removal_module_predicate($$endingDay);
        preference_modules.doomed_unless_arg_bindable($POS, $$endingDay, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_ENDING_DAY_CHECK_POS, $list36);
        inference_modules.inference_removal_module($REMOVAL_ENDING_DAY_CHECK_NEG, $list38);
        inference_modules.inference_removal_module($REMOVAL_ENDING_DAY_POS, $list40);
        preference_modules.doomed_unless_arg_bindable($POS, $$maximalContiguousSpanningInterval, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MAXIMALCONTIGUOUSSPANNINGINTERVAL, $list43);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_time_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_time_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_time_utilities_file();
    }

    static {
    }
}

/**
 * Total time: 253 ms
 */
