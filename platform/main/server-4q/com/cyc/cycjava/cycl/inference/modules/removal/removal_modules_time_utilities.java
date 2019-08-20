package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.el_utilities;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_time_utilities extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "555bcbbf807d9c66dea7c5efd36267a361995f3a17af711923dc99827bfbd725";
    private static SubLSymbol $REMOVAL_SUB_TIME_INTERVAL_OF_TYPE;
    private static SubLList $list1;
    private static SubLList $list2;
    private static SubLObject $$isa;
    private static SubLList $list4;
    private static SubLObject $$TimeParameter;
    private static SubLList $list6;
    private static SubLObject $$temporallySubsumes;
    private static SubLList $list8;
    private static SubLSymbol $sym9$_;
    private static SubLList $list10;
    private static SubLList $list11;
    private static SubLSymbol $POS;
    private static SubLSymbol $sym13$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE;
    private static SubLSymbol $sym14$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT;
    private static SubLSymbol $sym15$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE;
    private static SubLList $list16;
    private static SubLSymbol $ISA;
    private static SubLSymbol $TIME;
    private static SubLSymbol $BACKWARD;
    private static SubLSymbol $FORWARD;
    private static SubLList $list21;
    private static SubLObject $$startingDay;
    private static SubLSymbol $REMOVAL_STARTING_DAY_CHECK_POS;
    private static SubLList $list24;
    private static SubLSymbol $REMOVAL_STARTING_DAY_CHECK_NEG;
    private static SubLList $list26;
    private static SubLSymbol $REMOVAL_STARTING_DAY_POS;
    private static SubLList $list28;
    private static SubLObject $$CalendarSecond;
    private static SubLObject $$CalendarMinute;
    private static SubLObject $$CalendarHour;
    private static SubLObject $$CalendarDay;
    private static SubLSymbol $OPAQUE;
    private static SubLObject $$endingDay;
    private static SubLSymbol $REMOVAL_ENDING_DAY_CHECK_POS;
    private static SubLList $list36;
    private static SubLSymbol $REMOVAL_ENDING_DAY_CHECK_NEG;
    private static SubLList $list38;
    private static SubLSymbol $REMOVAL_ENDING_DAY_POS;
    private static SubLList $list40;
    private static SubLObject $$maximalContiguousSpanningInterval;
    private static SubLSymbol $REMOVAL_MAXIMALCONTIGUOUSSPANNINGINTERVAL;
    private static SubLList $list43;
    private static SubLSymbol $sym44$CAR;
    private static SubLSymbol $sym45$LIST;
    private static SubLSymbol $sym46$DATE__;
    private static SubLSymbol $sym47$FIRST_CYCL_INTERVAL_INITIAL_SECOND_POSSIBLY_INDETERMINATE_LATE;
    private static SubLString $str48$INPUT___A__;
    private static SubLString $str49$_________________________________;
    private static SubLString $str50$NEXT__A_____A_____A_____A_____A__;
    private static SubLString $str51$CURRENT_____A_____A_____A_____A__;
    private static SubLString $str52$initial_setup_____A_____A_____A__;
    private static SubLString $str53$stitching_____A_____A_____A_____A;
    private static SubLString $str54$into_current_____A_____A_____A___;
    private static SubLString $str55$to_get_____A_____A_____A_____A__;
    private static SubLString $str56$adding_____A_____A_____A_____A__;
    private static SubLString $str57$adding_last_____A_____A_____A____;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 1500L)
    public static SubLObject removal_sub_time_interval_of_type_applicability(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject mt_var = mt;
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                        SubLObject current_$2;
                        SubLObject datum_$1 = current_$2 = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                        SubLObject var = NIL;
                        SubLObject type = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, $list4);
                        var = current_$2.first();
                        current_$2 = current_$2.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, $list4);
                        type = current_$2.first();
                        current_$2 = current_$2.rest();
                        if (NIL == current_$2) {
                            if (NIL != variables.variable_p(var) && NIL != forts.fort_p(type) && NIL != isa.isaP(type, $$TimeParameter, UNPROVIDED, UNPROVIDED)) {
                                SubLObject index2 = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$3 = clauses.pos_lits(contextualized_dnf_clause);
                                SubLObject contextualized_asent2 = NIL;
                                contextualized_asent2 = cdolist_list_var_$3.first();
                                while (NIL != cdolist_list_var_$3) {
                                    if (!index.eql(index2)) {
                                        SubLObject current_$3;
                                        SubLObject datum_$2 = current_$3 = contextualized_asent2;
                                        SubLObject mt2 = NIL;
                                        SubLObject asent2 = NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, $list6);
                                        mt2 = current_$3.first();
                                        current_$3 = current_$3.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, $list6);
                                        asent2 = current_$3.first();
                                        current_$3 = current_$3.rest();
                                        if (NIL == current_$3) {
                                            SubLObject mt_var_$6 = mt2;
                                            SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2_$9 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$6), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$6), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$6), thread);
                                                if ($$temporallySubsumes.eql(cycl_utilities.atomic_sentence_predicate(asent2))) {
                                                    SubLObject current_$4;
                                                    SubLObject datum_$3 = current_$4 = cycl_utilities.atomic_sentence_args(asent2, UNPROVIDED);
                                                    SubLObject interval1 = NIL;
                                                    SubLObject var2 = NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list8);
                                                    interval1 = current_$4.first();
                                                    current_$4 = current_$4.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list8);
                                                    var2 = current_$4.first();
                                                    current_$4 = current_$4.rest();
                                                    if (NIL == current_$4) {
                                                        if (var.eql(var2) && NIL != variables.fully_bound_p(interval1) && NIL != time_interval_utilities.date_interval_p(interval1) && NIL == date_utilities.always_time_intervalP(interval1)
                                                                && NIL == time_interval_utilities.indeterminate_date_interval_p(interval1)) {
                                                            subclause_specs = cons(list(NIL, Sort.sort(list(index, index2), $sym9$_, UNPROVIDED)), subclause_specs);
                                                        }
                                                    } else {
                                                        cdestructuring_bind.cdestructuring_bind_error(datum_$3, $list8);
                                                    }
                                                }
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$9, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$8, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        } else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$2, $list6);
                                        }
                                    }
                                    index2 = Numbers.add(index2, ONE_INTEGER);
                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                    contextualized_asent2 = cdolist_list_var_$3.first();
                                }
                            }
                        } else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$1, $list4);
                        }
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
            }
            index = Numbers.add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        return subclause_specs;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 2700L)
    public static SubLObject removal_sub_time_interval_of_type_cost(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject isa_lit = removal_sub_time_interval_of_type_literals(contextualized_dnf_clause);
        SubLObject temp_lit = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        SubLObject datum = current = isa_lit;
        SubLObject isa_mt = NIL;
        SubLObject isa_asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
        isa_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
        isa_asent = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$13;
            SubLObject datum_$12 = current_$13 = temp_lit;
            SubLObject temp_mt = NIL;
            SubLObject temp_asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, $list11);
            temp_mt = current_$13.first();
            current_$13 = current_$13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, $list11);
            temp_asent = current_$13.first();
            current_$13 = current_$13.rest();
            if (NIL == current_$13) {
                SubLObject type = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
                SubLObject v_int = cycl_utilities.atomic_sentence_arg1(temp_asent, UNPROVIDED);
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
                    type_period = ((NIL != time_parameter_utilities.gappy_time_type_p(type)) ? time_parameter_utilities.gappy_type_period(type) : time_parameter_utilities.get_duration_of_type(type));
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
                if (NIL == time_parameter_utilities.duration_p(type_period) || NIL == time_parameter_utilities.duration_p(int_duration)) {
                    return ZERO_INTEGER;
                }
                if (NIL != time_parameter_utilities.a_really_long_timeP(type_period)) {
                    return ZERO_INTEGER;
                }
                if (NIL != time_parameter_utilities.a_really_long_timeP(int_duration)) {
                    return Numbers.$most_positive_fixnum$.getGlobalValue();
                }
                if (NIL != time_parameter_utilities.durationL(int_duration, type_period)) {
                    return (NIL != time_parameter_utilities.durationL(int_duration, time_parameter_utilities.get_duration_of_type(type))) ? ZERO_INTEGER : ONE_INTEGER;
                }
                if (NIL != time_parameter_utilities.durationE(int_duration, type_period)) {
                    return ONE_INTEGER;
                }
                SubLObject type_type = time_parameter_utilities.duration_type(type_period);
                SubLObject type_magnitude = time_parameter_utilities.duration_magnitude(type_period);
                SubLObject int_type = time_parameter_utilities.duration_type(int_duration);
                SubLObject int_magnitude = time_parameter_utilities.duration_magnitude(int_duration);
                return (NIL != time_parameter_utilities.duration_typeL(type_type, int_type)) ? Numbers.multiply(int_magnitude, Numbers.divide(time_parameter_utilities.find_duration_quotient(type_type, int_type, UNPROVIDED), type_magnitude))
                        : Numbers.multiply(Numbers.divide(int_magnitude, time_parameter_utilities.find_duration_quotient(int_type, type_type, UNPROVIDED)), type_magnitude);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$12, $list11);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list10);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 4400L)
    public static SubLObject removal_sub_time_interval_of_type_output_generate(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject isa_lit = removal_sub_time_interval_of_type_literals(contextualized_dnf_clause);
        SubLObject temp_lit = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        SubLObject datum = current = isa_lit;
        SubLObject isa_mt = NIL;
        SubLObject isa_asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
        isa_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
        isa_asent = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$15;
            SubLObject datum_$14 = current_$15 = temp_lit;
            SubLObject temp_mt = NIL;
            SubLObject temp_asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, $list11);
            temp_mt = current_$15.first();
            current_$15 = current_$15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, $list11);
            temp_asent = current_$15.first();
            current_$15 = current_$15.rest();
            if (NIL == current_$15) {
                SubLObject type = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
                SubLObject interval = cycl_utilities.atomic_sentence_arg1(temp_asent, UNPROVIDED);
                SubLObject var = cycl_utilities.atomic_sentence_arg1(isa_asent, UNPROVIDED);
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
                if (NIL == time_parameter_utilities.duration_p(type_duration) || NIL == time_parameter_utilities.duration_p(int_duration)) {
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
                cdestructuring_bind.cdestructuring_bind_error(datum_$14, $list11);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list10);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 5600L)
    public static SubLObject removal_sub_time_interval_of_type_literals(SubLObject contextualized_dnf_clause) {
        SubLObject lit0 = clauses.clause_literal(contextualized_dnf_clause, $POS, ZERO_INTEGER);
        SubLObject lit2 = clauses.clause_literal(contextualized_dnf_clause, $POS, ONE_INTEGER);
        return $$isa.eql(cycl_utilities.atomic_sentence_predicate(inference_datastructures_problem_query.contextualized_asent_asent(lit0))) ? Values.values(lit0, lit2) : Values.values(lit2, lit0);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 5900L)
    public static SubLObject new_sub_time_interval_of_type_iterator(SubLObject type, SubLObject interval, SubLObject var, SubLObject contextualized_dnf_clause) {
        return iteration.new_iterator(sub_time_interval_of_type_iterator_state(type, interval, var, contextualized_dnf_clause), $sym13$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE, $sym14$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT, $sym15$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 6300L)
    public static SubLObject sub_time_interval_of_type_iterator_state(SubLObject type, SubLObject interval, SubLObject var, SubLObject contextualized_dnf_clause) {
        SubLObject current;
        SubLObject datum = current = clauses.clause_literal(contextualized_dnf_clause, $POS, ZERO_INTEGER);
        SubLObject mt0 = NIL;
        SubLObject asent0 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        mt0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        asent0 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$17;
            SubLObject datum_$16 = current_$17 = clauses.clause_literal(contextualized_dnf_clause, $POS, ONE_INTEGER);
            SubLObject mt2 = NIL;
            SubLObject asent2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, $list6);
            mt2 = current_$17.first();
            current_$17 = current_$17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, $list6);
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
                return (NIL != date_utilities.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(interval))) ? list(ZERO_INTEGER, $BACKWARD, type, interval, var, list(list(support0), list(support2)))
                        : list(ZERO_INTEGER, $FORWARD, type, interval, var, list(list(support0), list(support2)));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$16, $list6);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 7100L)
    public static SubLObject sub_time_interval_of_type_iterator_done(SubLObject state) {
        return Types.sublisp_null(state);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 7200L)
    public static SubLObject sub_time_interval_of_type_iterator_next(SubLObject state) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = NIL;
        SubLObject direction = NIL;
        SubLObject type = NIL;
        SubLObject interval = NIL;
        SubLObject var = NIL;
        SubLObject just_template = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list21);
        index = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list21);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list21);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list21);
        interval = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list21);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list21);
        just_template = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, $list21);
            return NIL;
        }
        SubLObject subinterval = ($BACKWARD == direction) ? time_parameter_utilities.nth_type_ending_no_later_than_end_of_interval(interval, type, index) : time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, index);
        if (NIL == subinterval) {
            return Values.values(NIL, NIL, T);
        }
        if (NIL != sbhl_time_modules.temporally_subsumesP(interval, subinterval, UNPROVIDED)) {
            set_nth(ZERO_INTEGER, state, Numbers.add(nth(ZERO_INTEGER, state), ONE_INTEGER));
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(var, subinterval, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject justs = append(conses_high.sublis(v_bindings, just_template, Symbols.symbol_function(EQL), UNPROVIDED), unify_justification);
            return Values.values(list(v_bindings, justs), state, NIL);
        }
        return Values.values(NIL, NIL, T);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 8000L)
    public static SubLObject sub_time_interval_of_type_iterator_finalize(SubLObject state) {
        return T;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 9900L)
    public static SubLObject removal_starting_day_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject day_query = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject starting_date = time_interval_utilities.reduce_date_wrt_start(interval);
        if (NIL != date_utilities.date_p(starting_date)) {
            SubLObject interval_start_precision = date_utilities.date_precision(starting_date);
            SubLObject starting_day = (interval_start_precision.eql($$CalendarSecond) || interval_start_precision.eql($$CalendarMinute) || interval_start_precision.eql($$CalendarHour)) ? NIL
                    : date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), $$CalendarDay, UNPROVIDED);
            if (NIL != starting_day) {
                SubLObject v_bindings = unification_utilities.term_unify(day_query, starting_day, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 10700L)
    public static SubLObject removal_starting_day_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject starting_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), $$CalendarDay, UNPROVIDED);
        if (NIL != czer_utilities.equals_elP(day_arg, starting_day, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 11100L)
    public static SubLObject removal_starting_day_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject starting_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), $$CalendarDay, UNPROVIDED);
        if (NIL == czer_utilities.equals_elP(day_arg, starting_day, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 13300L)
    public static SubLObject removal_ending_day_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject day_query = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject ending_date = time_interval_utilities.reduce_date_wrt_end(interval);
        if (NIL != date_utilities.date_p(ending_date)) {
            SubLObject interval_end_precision = date_utilities.date_precision(time_interval_utilities.reduce_date_wrt_end(interval));
            SubLObject ending_day = (interval_end_precision.eql($$CalendarSecond) || interval_end_precision.eql($$CalendarMinute) || interval_end_precision.eql($$CalendarHour)) ? NIL
                    : date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), $$CalendarDay, UNPROVIDED);
            if (NIL != ending_day) {
                SubLObject v_bindings = unification_utilities.term_unify(day_query, ending_day, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 14100L)
    public static SubLObject removal_ending_day_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject ending_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), $$CalendarDay, UNPROVIDED);
        if (NIL != czer_utilities.equals_elP(day_arg, ending_day, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 14500L)
    public static SubLObject removal_ending_day_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject ending_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), $$CalendarDay, UNPROVIDED);
        if (NIL == czer_utilities.equals_elP(day_arg, ending_day, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 15900L)
    public static SubLObject removal_maximalcontiguousspanninginterval_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject el_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject answers = cdolist_list_var = Mapping.mapcar($sym44$CAR, maximal_intervals_subsuming_intervals(Mapping.mapcar($sym45$LIST, quantities.set_extent(el_set, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED));
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject v_bindings = unification_utilities.term_unify(asent, el_utilities.make_binary_formula(pred, el_set, v_answer), UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 16500L)
    public static SubLObject first_cycl_interval_initial_second_possibly_indeterminate_late(SubLObject v_object) {
        return time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(v_object.first());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 16800L)
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
        intervals_with_supports_list = Sort.sort(conses_high.copy_list(intervals_with_supports_list), $sym46$DATE__, $sym47$FIRST_CYCL_INTERVAL_INITIAL_SECOND_POSSIBLY_INDETERMINATE_LATE);
        if (NIL != debugP) {
            SubLObject cdolist_list_var = Mapping.mapcar($sym44$CAR, intervals_with_supports_list);
            SubLObject interval = NIL;
            interval = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                PrintLow.format(T, $str48$INPUT___A__, interval);
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
            SubLObject interval2 = time_interval_utilities.recanonicalize_time_interval(interval_with_supports.first(), UNPROVIDED, UNPROVIDED);
            SubLObject supports = conses_high.second(interval_with_supports);
            SubLObject earliest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_early(interval2);
            SubLObject latest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(interval2);
            SubLObject earliest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_early(interval2);
            SubLObject latest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_late(interval2);
            if (NIL != debugP) {
                PrintLow.format(T, $str49$_________________________________);
                PrintLow.format(T, $str50$NEXT__A_____A_____A_____A_____A__, new SubLObject[] { interval2, earliest_start, latest_start, earliest_end, latest_end });
                PrintLow.format(T, $str51$CURRENT_____A_____A_____A_____A__, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
            }
            if (NIL == cur_earliest_start || NIL == cur_latest_end) {
                if (NIL != debugP) {
                    PrintLow.format(T, $str52$initial_setup_____A_____A_____A__, new SubLObject[] { earliest_start, latest_start, earliest_end, latest_end });
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
                        PrintLow.format(T, $str53$stitching_____A_____A_____A_____A, new SubLObject[] { earliest_start, latest_start, earliest_end, latest_end });
                    }
                    if (NIL != debugP) {
                        PrintLow.format(T, $str54$into_current_____A_____A_____A___, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
                    }
                    SubLObject merged_interval = cur_interval = time_interval_utilities.merge_date_intervals(cur_interval, interval2);
                    cur_earliest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_early(cur_interval);
                    cur_latest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(cur_interval);
                    cur_earliest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_early(cur_interval);
                    cur_latest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_late(cur_interval);
                    if (NIL != debugP) {
                        PrintLow.format(T, $str55$to_get_____A_____A_____A_____A__, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
                    }
                    SubLObject cdolist_list_var_$18 = supports;
                    SubLObject support = NIL;
                    support = cdolist_list_var_$18.first();
                    while (NIL != cdolist_list_var_$18) {
                        SubLObject item_var = support;
                        if (NIL == conses_high.member(item_var, cur_supports, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                            cur_supports = cons(item_var, cur_supports);
                        }
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        support = cdolist_list_var_$18.first();
                    }
                } else {
                    if (NIL != debugP) {
                        PrintLow.format(T, $str56$adding_____A_____A_____A_____A__, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
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
            PrintLow.format(T, $str57$adding_last_____A_____A_____A____, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
        }
        if (NIL != cur_earliest_start && NIL != cur_latest_end) {
            merged_intervals_start_end_supports_list = cons(list(cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end, cur_supports), merged_intervals_start_end_supports_list);
        }
        cdolist_list_var2 = merged_intervals_start_end_supports_list;
        SubLObject merged_interval_start_end_supports = NIL;
        merged_interval_start_end_supports = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            maximal_intervals_with_supports_list = cons(list(time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(merged_interval_start_end_supports.first(), conses_high.second(merged_interval_start_end_supports), conses_high.third(merged_interval_start_end_supports),
                    conses_high.fourth(merged_interval_start_end_supports), precision, T), conses_high.fifth(merged_interval_start_end_supports)), maximal_intervals_with_supports_list);
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
        me = new removal_modules_time_utilities();
        $REMOVAL_SUB_TIME_INTERVAL_OF_TYPE = makeKeyword("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE");
        $list1 = list(new SubLObject[] { makeKeyword("EVERY-PREDICATES"), list(makeConstSym(("isa")), makeConstSym(("temporallySubsumes"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-APPLICABILITY"), makeKeyword("COST"),
                makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <varN> <time-type>)\n           (#$temporallySubsumes <time-interval> <varN>))"), makeKeyword("EXAMPLE"),
                makeString("(#$and (#$isa ?MONTH #$CalendarWeek)\n           (#$temporallySubsumes (#$MonthFn #$May (#$YearFn 2005)) ?MONTH))") });
        $list2 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $$isa = makeConstSym(("isa"));
        $list4 = list(makeSymbol("VAR"), makeSymbol("TYPE"));
        $$TimeParameter = makeConstSym(("TimeParameter"));
        $list6 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));
        $$temporallySubsumes = makeConstSym(("temporallySubsumes"));
        $list8 = list(makeSymbol("INTERVAL1"), makeSymbol("VAR1"));
        $sym9$_ = makeSymbol("<");
        $list10 = list(makeSymbol("ISA-MT"), makeSymbol("ISA-ASENT"));
        $list11 = list(makeSymbol("TEMP-MT"), makeSymbol("TEMP-ASENT"));
        $POS = makeKeyword("POS");
        $sym13$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE = makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-DONE");
        $sym14$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT = makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-NEXT");
        $sym15$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE = makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-FINALIZE");
        $list16 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));
        $ISA = makeKeyword("ISA");
        $TIME = makeKeyword("TIME");
        $BACKWARD = makeKeyword("BACKWARD");
        $FORWARD = makeKeyword("FORWARD");
        $list21 = list(makeSymbol("INDEX"), makeSymbol("DIRECTION"), makeSymbol("TYPE"), makeSymbol("INTERVAL"), makeSymbol("VAR"), makeSymbol("JUST-TEMPLATE"));
        $$startingDay = makeConstSym(("startingDay"));
        $REMOVAL_STARTING_DAY_CHECK_POS = makeKeyword("REMOVAL-STARTING-DAY-CHECK-POS");
        $list24 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startingDay")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startingDay")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STARTING-DAY-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$startingDay <time-interval> <day>)"), makeKeyword("EXAMPLE"), makeString("(#$startingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002))))") });
        $REMOVAL_STARTING_DAY_CHECK_NEG = makeKeyword("REMOVAL-STARTING-DAY-CHECK-NEG");
        $list26 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("startingDay")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startingDay")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STARTING-DAY-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$startingDay <time-interval> <day>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$startingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002)))))") });
        $REMOVAL_STARTING_DAY_POS = makeKeyword("REMOVAL-STARTING-DAY-POS");
        $list28 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startingDay")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startingDay")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STARTING-DAY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDay <time-interval> ?DAY)"),
                makeKeyword("EXAMPLE"), makeString("(#$startingDay (#$YearFn 2002) ?DAY) -> (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002)))") });
        $$CalendarSecond = makeConstSym(("CalendarSecond"));
        $$CalendarMinute = makeConstSym(("CalendarMinute"));
        $$CalendarHour = makeConstSym(("CalendarHour"));
        $$CalendarDay = makeConstSym(("CalendarDay"));
        $OPAQUE = makeKeyword("OPAQUE");
        $$endingDay = makeConstSym(("endingDay"));
        $REMOVAL_ENDING_DAY_CHECK_POS = makeKeyword("REMOVAL-ENDING-DAY-CHECK-POS");
        $list36 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endingDay")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endingDay")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ENDING-DAY-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDay <time-interval> <day>)"),
                makeKeyword("EXAMPLE"), makeString("(#$endingDay (#$YearFn 2002) (#$DayFn 31 (#$MonthFn #$December (#$YearFn 2002))))") });
        $REMOVAL_ENDING_DAY_CHECK_NEG = makeKeyword("REMOVAL-ENDING-DAY-CHECK-NEG");
        $list38 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("endingDay")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endingDay")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ENDING-DAY-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$endingDay <time-interval> <day>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$endingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002))))") });
        $REMOVAL_ENDING_DAY_POS = makeKeyword("REMOVAL-ENDING-DAY-POS");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endingDay")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endingDay")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ENDING-DAY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDay <time-interval> ?DAY)"),
                makeKeyword("EXAMPLE"), makeString("(#$endingDay (#$YearFn 2002) ?DAY) -> (#$DayFn 31 (#$MonthFn #$December (#$YearFn 2002)))") });
        $$maximalContiguousSpanningInterval = makeConstSym(("maximalContiguousSpanningInterval"));
        $REMOVAL_MAXIMALCONTIGUOUSSPANNINGINTERVAL = makeKeyword("REMOVAL-MAXIMALCONTIGUOUSSPANNINGINTERVAL");
        $list43 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("maximalContiguousSpanningInterval")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("maximalContiguousSpanningInterval")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-MAXIMALCONTIGUOUSSPANNINGINTERVAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalContiguousSpanningInterval <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"),
                makeString("(maximalContiguousSpanningInterval (TheSet (DateFromStringFn \"2002\") (DateFromStringFn \"2003\")) (#$TimeIntervalInclusiveFn (DateFromStringFn \"2002\") (DateFromStringFn \"2003\")))") });
        $sym44$CAR = makeSymbol("CAR");
        $sym45$LIST = makeSymbol("LIST");
        $sym46$DATE__ = makeSymbol("DATE<=");
        $sym47$FIRST_CYCL_INTERVAL_INITIAL_SECOND_POSSIBLY_INDETERMINATE_LATE = makeSymbol("FIRST-CYCL-INTERVAL-INITIAL-SECOND-POSSIBLY-INDETERMINATE-LATE");
        $str48$INPUT___A__ = makeString("INPUT: ~A~%");
        $str49$_________________________________ = makeString("-------------------------------------------------------~%");
        $str50$NEXT__A_____A_____A_____A_____A__ = makeString("NEXT ~A~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str51$CURRENT_____A_____A_____A_____A__ = makeString("CURRENT~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str52$initial_setup_____A_____A_____A__ = makeString("initial setup~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str53$stitching_____A_____A_____A_____A = makeString("stitching~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str54$into_current_____A_____A_____A___ = makeString("into current~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str55$to_get_____A_____A_____A_____A__ = makeString("to get~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str56$adding_____A_____A_____A_____A__ = makeString("adding~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str57$adding_last_____A_____A_____A____ = makeString("adding last~%  ~A~%  ~A~%  ~A~%  ~A~%");
    }
}
/*
 *
 * Total time: 253 ms
 *
 */