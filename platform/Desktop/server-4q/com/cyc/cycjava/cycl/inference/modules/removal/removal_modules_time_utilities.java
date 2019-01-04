package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_time_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities";
    public static final String myFingerPrint = "555bcbbf807d9c66dea7c5efd36267a361995f3a17af711923dc99827bfbd725";
    private static final SubLSymbol $kw0$REMOVAL_SUB_TIME_INTERVAL_OF_TYPE;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLObject $const3$isa;
    private static final SubLList $list4;
    private static final SubLObject $const5$TimeParameter;
    private static final SubLList $list6;
    private static final SubLObject $const7$temporallySubsumes;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$_;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$POS;
    private static final SubLSymbol $sym13$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE;
    private static final SubLSymbol $sym14$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT;
    private static final SubLSymbol $sym15$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$ISA;
    private static final SubLSymbol $kw18$TIME;
    private static final SubLSymbol $kw19$BACKWARD;
    private static final SubLSymbol $kw20$FORWARD;
    private static final SubLList $list21;
    private static final SubLObject $const22$startingDay;
    private static final SubLSymbol $kw23$REMOVAL_STARTING_DAY_CHECK_POS;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$REMOVAL_STARTING_DAY_CHECK_NEG;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$REMOVAL_STARTING_DAY_POS;
    private static final SubLList $list28;
    private static final SubLObject $const29$CalendarSecond;
    private static final SubLObject $const30$CalendarMinute;
    private static final SubLObject $const31$CalendarHour;
    private static final SubLObject $const32$CalendarDay;
    private static final SubLSymbol $kw33$OPAQUE;
    private static final SubLObject $const34$endingDay;
    private static final SubLSymbol $kw35$REMOVAL_ENDING_DAY_CHECK_POS;
    private static final SubLList $list36;
    private static final SubLSymbol $kw37$REMOVAL_ENDING_DAY_CHECK_NEG;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$REMOVAL_ENDING_DAY_POS;
    private static final SubLList $list40;
    private static final SubLObject $const41$maximalContiguousSpanningInterval;
    private static final SubLSymbol $kw42$REMOVAL_MAXIMALCONTIGUOUSSPANNINGINTERVAL;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$CAR;
    private static final SubLSymbol $sym45$LIST;
    private static final SubLSymbol $sym46$DATE__;
    private static final SubLSymbol $sym47$FIRST_CYCL_INTERVAL_INITIAL_SECOND_POSSIBLY_INDETERMINATE_LATE;
    private static final SubLString $str48$INPUT___A__;
    private static final SubLString $str49$_________________________________;
    private static final SubLString $str50$NEXT__A_____A_____A_____A_____A__;
    private static final SubLString $str51$CURRENT_____A_____A_____A_____A__;
    private static final SubLString $str52$initial_setup_____A_____A_____A__;
    private static final SubLString $str53$stitching_____A_____A_____A_____A;
    private static final SubLString $str54$into_current_____A_____A_____A___;
    private static final SubLString $str55$to_get_____A_____A_____A_____A__;
    private static final SubLString $str56$adding_____A_____A_____A_____A__;
    private static final SubLString $str57$adding_last_____A_____A_____A____;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 1543L)
    public static SubLObject removal_sub_time_interval_of_type_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject index = (SubLObject)removal_modules_time_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = (SubLObject)removal_modules_time_utilities.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (removal_modules_time_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)removal_modules_time_utilities.NIL;
            SubLObject asent = (SubLObject)removal_modules_time_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_time_utilities.$list2);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_time_utilities.$list2);
            asent = current.first();
            current = current.rest();
            if (removal_modules_time_utilities.NIL == current) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (removal_modules_time_utilities.$const3$isa.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                        SubLObject current_$2;
                        final SubLObject datum_$1 = current_$2 = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                        SubLObject var = (SubLObject)removal_modules_time_utilities.NIL;
                        SubLObject type = (SubLObject)removal_modules_time_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)removal_modules_time_utilities.$list4);
                        var = current_$2.first();
                        current_$2 = current_$2.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)removal_modules_time_utilities.$list4);
                        type = current_$2.first();
                        current_$2 = current_$2.rest();
                        if (removal_modules_time_utilities.NIL == current_$2) {
                            if (removal_modules_time_utilities.NIL != variables.variable_p(var) && removal_modules_time_utilities.NIL != forts.fort_p(type) && removal_modules_time_utilities.NIL != isa.isaP(type, removal_modules_time_utilities.$const5$TimeParameter, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED)) {
                                SubLObject index2 = (SubLObject)removal_modules_time_utilities.ZERO_INTEGER;
                                SubLObject cdolist_list_var_$3 = clauses.pos_lits(contextualized_dnf_clause);
                                SubLObject contextualized_asent2 = (SubLObject)removal_modules_time_utilities.NIL;
                                contextualized_asent2 = cdolist_list_var_$3.first();
                                while (removal_modules_time_utilities.NIL != cdolist_list_var_$3) {
                                    if (!index.eql(index2)) {
                                        SubLObject current_$3;
                                        final SubLObject datum_$2 = current_$3 = contextualized_asent2;
                                        SubLObject mt2 = (SubLObject)removal_modules_time_utilities.NIL;
                                        SubLObject asent2 = (SubLObject)removal_modules_time_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)removal_modules_time_utilities.$list6);
                                        mt2 = current_$3.first();
                                        current_$3 = current_$3.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)removal_modules_time_utilities.$list6);
                                        asent2 = current_$3.first();
                                        current_$3 = current_$3.rest();
                                        if (removal_modules_time_utilities.NIL == current_$3) {
                                            final SubLObject mt_var_$6 = mt2;
                                            final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$9 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$6), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$6), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$6), thread);
                                                if (removal_modules_time_utilities.$const7$temporallySubsumes.eql(cycl_utilities.atomic_sentence_predicate(asent2))) {
                                                    SubLObject current_$4;
                                                    final SubLObject datum_$3 = current_$4 = cycl_utilities.atomic_sentence_args(asent2, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                                                    SubLObject interval1 = (SubLObject)removal_modules_time_utilities.NIL;
                                                    SubLObject var2 = (SubLObject)removal_modules_time_utilities.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)removal_modules_time_utilities.$list8);
                                                    interval1 = current_$4.first();
                                                    current_$4 = current_$4.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)removal_modules_time_utilities.$list8);
                                                    var2 = current_$4.first();
                                                    current_$4 = current_$4.rest();
                                                    if (removal_modules_time_utilities.NIL == current_$4) {
                                                        if (var.eql(var2) && removal_modules_time_utilities.NIL != variables.fully_bound_p(interval1) && removal_modules_time_utilities.NIL != time_interval_utilities.date_interval_p(interval1) && removal_modules_time_utilities.NIL == date_utilities.always_time_intervalP(interval1) && removal_modules_time_utilities.NIL == time_interval_utilities.indeterminate_date_interval_p(interval1)) {
                                                            subclause_specs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)removal_modules_time_utilities.NIL, Sort.sort((SubLObject)ConsesLow.list(index, index2), (SubLObject)removal_modules_time_utilities.$sym9$_, (SubLObject)removal_modules_time_utilities.UNPROVIDED)), subclause_specs);
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)removal_modules_time_utilities.$list8);
                                                    }
                                                }
                                            }
                                            finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$9, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$8, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$2, (SubLObject)removal_modules_time_utilities.$list6);
                                        }
                                    }
                                    index2 = Numbers.add(index2, (SubLObject)removal_modules_time_utilities.ONE_INTEGER);
                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                    contextualized_asent2 = cdolist_list_var_$3.first();
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)removal_modules_time_utilities.$list4);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_time_utilities.$list2);
            }
            index = Numbers.add(index, (SubLObject)removal_modules_time_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        return subclause_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 2781L)
    public static SubLObject removal_sub_time_interval_of_type_cost(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject isa_lit = removal_sub_time_interval_of_type_literals(contextualized_dnf_clause);
        final SubLObject temp_lit = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        final SubLObject datum = current = isa_lit;
        SubLObject isa_mt = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject isa_asent = (SubLObject)removal_modules_time_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_time_utilities.$list10);
        isa_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_time_utilities.$list10);
        isa_asent = current.first();
        current = current.rest();
        if (removal_modules_time_utilities.NIL == current) {
            SubLObject current_$13;
            final SubLObject datum_$12 = current_$13 = temp_lit;
            SubLObject temp_mt = (SubLObject)removal_modules_time_utilities.NIL;
            SubLObject temp_asent = (SubLObject)removal_modules_time_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)removal_modules_time_utilities.$list11);
            temp_mt = current_$13.first();
            current_$13 = current_$13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)removal_modules_time_utilities.$list11);
            temp_asent = current_$13.first();
            current_$13 = current_$13.rest();
            if (removal_modules_time_utilities.NIL == current_$13) {
                final SubLObject type = cycl_utilities.atomic_sentence_arg2(isa_asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                final SubLObject v_int = cycl_utilities.atomic_sentence_arg1(temp_asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                SubLObject type_period = (SubLObject)removal_modules_time_utilities.NIL;
                SubLObject int_duration = (SubLObject)removal_modules_time_utilities.NIL;
                SubLObject mt_var = isa_mt;
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    type_period = ((removal_modules_time_utilities.NIL != time_parameter_utilities.gappy_time_type_p(type)) ? time_parameter_utilities.gappy_type_period(type) : time_parameter_utilities.get_duration_of_type(type));
                }
                finally {
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
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (removal_modules_time_utilities.NIL == time_parameter_utilities.duration_p(type_period) || removal_modules_time_utilities.NIL == time_parameter_utilities.duration_p(int_duration)) {
                    return (SubLObject)removal_modules_time_utilities.ZERO_INTEGER;
                }
                if (removal_modules_time_utilities.NIL != time_parameter_utilities.a_really_long_timeP(type_period)) {
                    return (SubLObject)removal_modules_time_utilities.ZERO_INTEGER;
                }
                if (removal_modules_time_utilities.NIL != time_parameter_utilities.a_really_long_timeP(int_duration)) {
                    return Numbers.$most_positive_fixnum$.getGlobalValue();
                }
                if (removal_modules_time_utilities.NIL != time_parameter_utilities.durationL(int_duration, type_period)) {
                    return (SubLObject)((removal_modules_time_utilities.NIL != time_parameter_utilities.durationL(int_duration, time_parameter_utilities.get_duration_of_type(type))) ? removal_modules_time_utilities.ZERO_INTEGER : removal_modules_time_utilities.ONE_INTEGER);
                }
                if (removal_modules_time_utilities.NIL != time_parameter_utilities.durationE(int_duration, type_period)) {
                    return (SubLObject)removal_modules_time_utilities.ONE_INTEGER;
                }
                final SubLObject type_type = time_parameter_utilities.duration_type(type_period);
                final SubLObject type_magnitude = time_parameter_utilities.duration_magnitude(type_period);
                final SubLObject int_type = time_parameter_utilities.duration_type(int_duration);
                final SubLObject int_magnitude = time_parameter_utilities.duration_magnitude(int_duration);
                return (removal_modules_time_utilities.NIL != time_parameter_utilities.duration_typeL(type_type, int_type)) ? Numbers.multiply(int_magnitude, Numbers.divide(time_parameter_utilities.find_duration_quotient(type_type, int_type, (SubLObject)removal_modules_time_utilities.UNPROVIDED), type_magnitude)) : Numbers.multiply(Numbers.divide(int_magnitude, time_parameter_utilities.find_duration_quotient(int_type, type_type, (SubLObject)removal_modules_time_utilities.UNPROVIDED)), type_magnitude);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$12, (SubLObject)removal_modules_time_utilities.$list11);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_time_utilities.$list10);
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 4403L)
    public static SubLObject removal_sub_time_interval_of_type_output_generate(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject isa_lit = removal_sub_time_interval_of_type_literals(contextualized_dnf_clause);
        final SubLObject temp_lit = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        final SubLObject datum = current = isa_lit;
        SubLObject isa_mt = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject isa_asent = (SubLObject)removal_modules_time_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_time_utilities.$list10);
        isa_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_time_utilities.$list10);
        isa_asent = current.first();
        current = current.rest();
        if (removal_modules_time_utilities.NIL == current) {
            SubLObject current_$15;
            final SubLObject datum_$14 = current_$15 = temp_lit;
            SubLObject temp_mt = (SubLObject)removal_modules_time_utilities.NIL;
            SubLObject temp_asent = (SubLObject)removal_modules_time_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)removal_modules_time_utilities.$list11);
            temp_mt = current_$15.first();
            current_$15 = current_$15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)removal_modules_time_utilities.$list11);
            temp_asent = current_$15.first();
            current_$15 = current_$15.rest();
            if (removal_modules_time_utilities.NIL == current_$15) {
                final SubLObject type = cycl_utilities.atomic_sentence_arg2(isa_asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                final SubLObject interval = cycl_utilities.atomic_sentence_arg1(temp_asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                final SubLObject var = cycl_utilities.atomic_sentence_arg1(isa_asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                SubLObject type_duration = (SubLObject)removal_modules_time_utilities.NIL;
                SubLObject int_duration = (SubLObject)removal_modules_time_utilities.NIL;
                SubLObject mt_var = isa_mt;
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    type_duration = time_parameter_utilities.get_duration_of_type(type);
                }
                finally {
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
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (removal_modules_time_utilities.NIL == time_parameter_utilities.duration_p(type_duration) || removal_modules_time_utilities.NIL == time_parameter_utilities.duration_p(int_duration)) {
                    return iteration.new_null_iterator();
                }
                if (removal_modules_time_utilities.NIL != time_parameter_utilities.a_really_long_timeP(int_duration)) {
                    return new_sub_time_interval_of_type_iterator(type, interval, var, contextualized_dnf_clause);
                }
                if (removal_modules_time_utilities.NIL != time_parameter_utilities.durationL(int_duration, type_duration)) {
                    return iteration.new_null_iterator();
                }
                return new_sub_time_interval_of_type_iterator(type, interval, var, contextualized_dnf_clause);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$14, (SubLObject)removal_modules_time_utilities.$list11);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_time_utilities.$list10);
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 5613L)
    public static SubLObject removal_sub_time_interval_of_type_literals(final SubLObject contextualized_dnf_clause) {
        final SubLObject lit0 = clauses.clause_literal(contextualized_dnf_clause, (SubLObject)removal_modules_time_utilities.$kw12$POS, (SubLObject)removal_modules_time_utilities.ZERO_INTEGER);
        final SubLObject lit2 = clauses.clause_literal(contextualized_dnf_clause, (SubLObject)removal_modules_time_utilities.$kw12$POS, (SubLObject)removal_modules_time_utilities.ONE_INTEGER);
        return removal_modules_time_utilities.$const3$isa.eql(cycl_utilities.atomic_sentence_predicate(inference_datastructures_problem_query.contextualized_asent_asent(lit0))) ? Values.values(lit0, lit2) : Values.values(lit2, lit0);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 5972L)
    public static SubLObject new_sub_time_interval_of_type_iterator(final SubLObject type, final SubLObject interval, final SubLObject var, final SubLObject contextualized_dnf_clause) {
        return iteration.new_iterator(sub_time_interval_of_type_iterator_state(type, interval, var, contextualized_dnf_clause), (SubLObject)removal_modules_time_utilities.$sym13$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE, (SubLObject)removal_modules_time_utilities.$sym14$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT, (SubLObject)removal_modules_time_utilities.$sym15$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 6333L)
    public static SubLObject sub_time_interval_of_type_iterator_state(final SubLObject type, final SubLObject interval, final SubLObject var, final SubLObject contextualized_dnf_clause) {
        SubLObject current;
        final SubLObject datum = current = clauses.clause_literal(contextualized_dnf_clause, (SubLObject)removal_modules_time_utilities.$kw12$POS, (SubLObject)removal_modules_time_utilities.ZERO_INTEGER);
        SubLObject mt0 = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject asent0 = (SubLObject)removal_modules_time_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_time_utilities.$list16);
        mt0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_time_utilities.$list16);
        asent0 = current.first();
        current = current.rest();
        if (removal_modules_time_utilities.NIL == current) {
            SubLObject current_$17;
            final SubLObject datum_$16 = current_$17 = clauses.clause_literal(contextualized_dnf_clause, (SubLObject)removal_modules_time_utilities.$kw12$POS, (SubLObject)removal_modules_time_utilities.ONE_INTEGER);
            SubLObject mt2 = (SubLObject)removal_modules_time_utilities.NIL;
            SubLObject asent2 = (SubLObject)removal_modules_time_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, (SubLObject)removal_modules_time_utilities.$list6);
            mt2 = current_$17.first();
            current_$17 = current_$17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, (SubLObject)removal_modules_time_utilities.$list6);
            asent2 = current_$17.first();
            current_$17 = current_$17.rest();
            if (removal_modules_time_utilities.NIL == current_$17) {
                SubLObject support0 = (SubLObject)removal_modules_time_utilities.NIL;
                SubLObject support2 = (SubLObject)removal_modules_time_utilities.NIL;
                if (removal_modules_time_utilities.$const3$isa.eql(cycl_utilities.atomic_sentence_predicate(asent0))) {
                    support0 = arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw17$ISA, asent0, mt0, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                    support2 = arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw18$TIME, asent2, mt2, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                }
                else {
                    support0 = arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw18$TIME, asent0, mt0, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                    support2 = arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw17$ISA, asent2, mt2, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                }
                return (SubLObject)((removal_modules_time_utilities.NIL != date_utilities.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(interval))) ? ConsesLow.list((SubLObject)removal_modules_time_utilities.ZERO_INTEGER, (SubLObject)removal_modules_time_utilities.$kw19$BACKWARD, type, interval, var, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(support0), (SubLObject)ConsesLow.list(support2))) : ConsesLow.list((SubLObject)removal_modules_time_utilities.ZERO_INTEGER, (SubLObject)removal_modules_time_utilities.$kw20$FORWARD, type, interval, var, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(support0), (SubLObject)ConsesLow.list(support2))));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$16, (SubLObject)removal_modules_time_utilities.$list6);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_time_utilities.$list16);
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 7163L)
    public static SubLObject sub_time_interval_of_type_iterator_done(final SubLObject state) {
        return Types.sublisp_null(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 7252L)
    public static SubLObject sub_time_interval_of_type_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject direction = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject type = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject interval = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject var = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject just_template = (SubLObject)removal_modules_time_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_time_utilities.$list21);
        index = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_time_utilities.$list21);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_time_utilities.$list21);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_time_utilities.$list21);
        interval = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_time_utilities.$list21);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_time_utilities.$list21);
        just_template = current.first();
        current = current.rest();
        if (removal_modules_time_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_time_utilities.$list21);
            return (SubLObject)removal_modules_time_utilities.NIL;
        }
        final SubLObject subinterval = (removal_modules_time_utilities.$kw19$BACKWARD == direction) ? time_parameter_utilities.nth_type_ending_no_later_than_end_of_interval(interval, type, index) : time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, index);
        if (removal_modules_time_utilities.NIL == subinterval) {
            return Values.values((SubLObject)removal_modules_time_utilities.NIL, (SubLObject)removal_modules_time_utilities.NIL, (SubLObject)removal_modules_time_utilities.T);
        }
        if (removal_modules_time_utilities.NIL != sbhl_time_modules.temporally_subsumesP(interval, subinterval, (SubLObject)removal_modules_time_utilities.UNPROVIDED)) {
            ConsesLow.set_nth((SubLObject)removal_modules_time_utilities.ZERO_INTEGER, state, Numbers.add(ConsesLow.nth((SubLObject)removal_modules_time_utilities.ZERO_INTEGER, state), (SubLObject)removal_modules_time_utilities.ONE_INTEGER));
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(var, subinterval, (SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject justs = ConsesLow.append(conses_high.sublis(v_bindings, just_template, Symbols.symbol_function((SubLObject)removal_modules_time_utilities.EQL), (SubLObject)removal_modules_time_utilities.UNPROVIDED), unify_justification);
            return Values.values((SubLObject)ConsesLow.list(v_bindings, justs), state, (SubLObject)removal_modules_time_utilities.NIL);
        }
        return Values.values((SubLObject)removal_modules_time_utilities.NIL, (SubLObject)removal_modules_time_utilities.NIL, (SubLObject)removal_modules_time_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 8040L)
    public static SubLObject sub_time_interval_of_type_iterator_finalize(final SubLObject state) {
        return (SubLObject)removal_modules_time_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 9929L)
    public static SubLObject removal_starting_day_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_time_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_time_utilities.NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject day_query = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject starting_date = time_interval_utilities.reduce_date_wrt_start(interval);
        if (removal_modules_time_utilities.NIL != date_utilities.date_p(starting_date)) {
            final SubLObject interval_start_precision = date_utilities.date_precision(starting_date);
            final SubLObject starting_day = (SubLObject)((interval_start_precision.eql(removal_modules_time_utilities.$const29$CalendarSecond) || interval_start_precision.eql(removal_modules_time_utilities.$const30$CalendarMinute) || interval_start_precision.eql(removal_modules_time_utilities.$const31$CalendarHour)) ? removal_modules_time_utilities.NIL : date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), removal_modules_time_utilities.$const32$CalendarDay, (SubLObject)removal_modules_time_utilities.UNPROVIDED));
            if (removal_modules_time_utilities.NIL != starting_day) {
                final SubLObject v_bindings = unification_utilities.term_unify(day_query, starting_day, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                if (removal_modules_time_utilities.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw33$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED), v_bindings, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                }
            }
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 10768L)
    public static SubLObject removal_starting_day_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_time_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_time_utilities.NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject starting_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), removal_modules_time_utilities.$const32$CalendarDay, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        if (removal_modules_time_utilities.NIL != czer_utilities.equals_elP(day_arg, starting_day, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw33$OPAQUE, asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 11174L)
    public static SubLObject removal_starting_day_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_time_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_time_utilities.NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject starting_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_initial_second(interval), removal_modules_time_utilities.$const32$CalendarDay, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        if (removal_modules_time_utilities.NIL == czer_utilities.equals_elP(day_arg, starting_day, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw33$OPAQUE, asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 13328L)
    public static SubLObject removal_ending_day_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_time_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_time_utilities.NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject day_query = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject ending_date = time_interval_utilities.reduce_date_wrt_end(interval);
        if (removal_modules_time_utilities.NIL != date_utilities.date_p(ending_date)) {
            final SubLObject interval_end_precision = date_utilities.date_precision(time_interval_utilities.reduce_date_wrt_end(interval));
            final SubLObject ending_day = (SubLObject)((interval_end_precision.eql(removal_modules_time_utilities.$const29$CalendarSecond) || interval_end_precision.eql(removal_modules_time_utilities.$const30$CalendarMinute) || interval_end_precision.eql(removal_modules_time_utilities.$const31$CalendarHour)) ? removal_modules_time_utilities.NIL : date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), removal_modules_time_utilities.$const32$CalendarDay, (SubLObject)removal_modules_time_utilities.UNPROVIDED));
            if (removal_modules_time_utilities.NIL != ending_day) {
                final SubLObject v_bindings = unification_utilities.term_unify(day_query, ending_day, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                if (removal_modules_time_utilities.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw33$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED), v_bindings, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                }
            }
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 14155L)
    public static SubLObject removal_ending_day_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_time_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_time_utilities.NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject ending_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), removal_modules_time_utilities.$const32$CalendarDay, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        if (removal_modules_time_utilities.NIL != czer_utilities.equals_elP(day_arg, ending_day, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw33$OPAQUE, asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 14553L)
    public static SubLObject removal_ending_day_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_time_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_time_utilities.NIL;
        }
        final SubLObject interval = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject day_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        final SubLObject ending_day = date_utilities.date_to_precision(time_interval_utilities.cycl_interval_final_second(interval), removal_modules_time_utilities.$const32$CalendarDay, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        if (removal_modules_time_utilities.NIL == czer_utilities.equals_elP(day_arg, ending_day, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw33$OPAQUE, asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 15977L)
    public static SubLObject removal_maximalcontiguousspanninginterval_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_time_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_time_utilities.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject el_set = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject answers = cdolist_list_var = Mapping.mapcar((SubLObject)removal_modules_time_utilities.$sym44$CAR, maximal_intervals_subsuming_intervals(Mapping.mapcar((SubLObject)removal_modules_time_utilities.$sym45$LIST, quantities.set_extent(el_set, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED)), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED));
        SubLObject v_answer = (SubLObject)removal_modules_time_utilities.NIL;
        v_answer = cdolist_list_var.first();
        while (removal_modules_time_utilities.NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(asent, el_utilities.make_binary_formula(pred, el_set, v_answer), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
            if (removal_modules_time_utilities.NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_time_utilities.$kw33$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED), v_bindings, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 16514L)
    public static SubLObject first_cycl_interval_initial_second_possibly_indeterminate_late(final SubLObject v_object) {
        return time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-time-utilities.lisp", position = 16813L)
    public static SubLObject maximal_intervals_subsuming_intervals(SubLObject intervals_with_supports_list, SubLObject precision, SubLObject debugP) {
        if (precision == removal_modules_time_utilities.UNPROVIDED) {
            precision = (SubLObject)removal_modules_time_utilities.NIL;
        }
        if (debugP == removal_modules_time_utilities.UNPROVIDED) {
            debugP = (SubLObject)removal_modules_time_utilities.NIL;
        }
        if (removal_modules_time_utilities.NIL == intervals_with_supports_list) {
            return (SubLObject)removal_modules_time_utilities.NIL;
        }
        SubLObject maximal_intervals_with_supports_list = (SubLObject)removal_modules_time_utilities.NIL;
        intervals_with_supports_list = Sort.sort(conses_high.copy_list(intervals_with_supports_list), (SubLObject)removal_modules_time_utilities.$sym46$DATE__, (SubLObject)removal_modules_time_utilities.$sym47$FIRST_CYCL_INTERVAL_INITIAL_SECOND_POSSIBLY_INDETERMINATE_LATE);
        if (removal_modules_time_utilities.NIL != debugP) {
            SubLObject cdolist_list_var = Mapping.mapcar((SubLObject)removal_modules_time_utilities.$sym44$CAR, intervals_with_supports_list);
            SubLObject interval = (SubLObject)removal_modules_time_utilities.NIL;
            interval = cdolist_list_var.first();
            while (removal_modules_time_utilities.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str48$INPUT___A__, interval);
                cdolist_list_var = cdolist_list_var.rest();
                interval = cdolist_list_var.first();
            }
        }
        SubLObject merged_intervals_start_end_supports_list = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject cur_earliest_start = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject cur_latest_start = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject cur_earliest_end = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject cur_latest_end = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject cur_supports = (SubLObject)removal_modules_time_utilities.NIL;
        SubLObject cdolist_list_var2 = intervals_with_supports_list;
        SubLObject interval_with_supports = (SubLObject)removal_modules_time_utilities.NIL;
        interval_with_supports = cdolist_list_var2.first();
        while (removal_modules_time_utilities.NIL != cdolist_list_var2) {
            final SubLObject interval2 = time_interval_utilities.recanonicalize_time_interval(interval_with_supports.first(), (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
            final SubLObject supports = conses_high.second(interval_with_supports);
            final SubLObject earliest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_early(interval2);
            final SubLObject latest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(interval2);
            final SubLObject earliest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_early(interval2);
            final SubLObject latest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_late(interval2);
            if (removal_modules_time_utilities.NIL != debugP) {
                PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str49$_________________________________);
                PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str50$NEXT__A_____A_____A_____A_____A__, new SubLObject[] { interval2, earliest_start, latest_start, earliest_end, latest_end });
                PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str51$CURRENT_____A_____A_____A_____A__, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
            }
            if (removal_modules_time_utilities.NIL == cur_earliest_start || removal_modules_time_utilities.NIL == cur_latest_end) {
                if (removal_modules_time_utilities.NIL != debugP) {
                    PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str52$initial_setup_____A_____A_____A__, new SubLObject[] { earliest_start, latest_start, earliest_end, latest_end });
                }
                cur_earliest_start = earliest_start;
                cur_latest_start = latest_start;
                cur_earliest_end = earliest_end;
                cur_latest_end = latest_end;
                cur_supports = supports;
            }
            else {
                SubLObject cur_interval = time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end, (SubLObject)removal_modules_time_utilities.UNPROVIDED, (SubLObject)removal_modules_time_utilities.UNPROVIDED);
                if (removal_modules_time_utilities.NIL != time_interval_utilities.date_intervals_intersectP(cur_interval, interval2, (SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.T)) {
                    if (removal_modules_time_utilities.NIL != debugP) {
                        PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str53$stitching_____A_____A_____A_____A, new SubLObject[] { earliest_start, latest_start, earliest_end, latest_end });
                    }
                    if (removal_modules_time_utilities.NIL != debugP) {
                        PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str54$into_current_____A_____A_____A___, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
                    }
                    final SubLObject merged_interval = cur_interval = time_interval_utilities.merge_date_intervals(cur_interval, interval2);
                    cur_earliest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_early(cur_interval);
                    cur_latest_start = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(cur_interval);
                    cur_earliest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_early(cur_interval);
                    cur_latest_end = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_late(cur_interval);
                    if (removal_modules_time_utilities.NIL != debugP) {
                        PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str55$to_get_____A_____A_____A_____A__, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
                    }
                    SubLObject cdolist_list_var_$18 = supports;
                    SubLObject support = (SubLObject)removal_modules_time_utilities.NIL;
                    support = cdolist_list_var_$18.first();
                    while (removal_modules_time_utilities.NIL != cdolist_list_var_$18) {
                        final SubLObject item_var = support;
                        if (removal_modules_time_utilities.NIL == conses_high.member(item_var, cur_supports, Symbols.symbol_function((SubLObject)removal_modules_time_utilities.EQL), Symbols.symbol_function((SubLObject)removal_modules_time_utilities.IDENTITY))) {
                            cur_supports = (SubLObject)ConsesLow.cons(item_var, cur_supports);
                        }
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        support = cdolist_list_var_$18.first();
                    }
                }
                else {
                    if (removal_modules_time_utilities.NIL != debugP) {
                        PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str56$adding_____A_____A_____A_____A__, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
                    }
                    merged_intervals_start_end_supports_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end, cur_supports), merged_intervals_start_end_supports_list);
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
        if (removal_modules_time_utilities.NIL != debugP) {
            PrintLow.format((SubLObject)removal_modules_time_utilities.T, (SubLObject)removal_modules_time_utilities.$str57$adding_last_____A_____A_____A____, new SubLObject[] { cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end });
        }
        if (removal_modules_time_utilities.NIL != cur_earliest_start && removal_modules_time_utilities.NIL != cur_latest_end) {
            merged_intervals_start_end_supports_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cur_earliest_start, cur_latest_start, cur_earliest_end, cur_latest_end, cur_supports), merged_intervals_start_end_supports_list);
        }
        cdolist_list_var2 = merged_intervals_start_end_supports_list;
        SubLObject merged_interval_start_end_supports = (SubLObject)removal_modules_time_utilities.NIL;
        merged_interval_start_end_supports = cdolist_list_var2.first();
        while (removal_modules_time_utilities.NIL != cdolist_list_var2) {
            maximal_intervals_with_supports_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(merged_interval_start_end_supports.first(), conses_high.second(merged_interval_start_end_supports), conses_high.third(merged_interval_start_end_supports), conses_high.fourth(merged_interval_start_end_supports), precision, (SubLObject)removal_modules_time_utilities.T), conses_high.fifth(merged_interval_start_end_supports)), maximal_intervals_with_supports_list);
            cdolist_list_var2 = cdolist_list_var2.rest();
            merged_interval_start_end_supports = cdolist_list_var2.first();
        }
        return maximal_intervals_with_supports_list;
    }
    
    public static SubLObject declare_removal_modules_time_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_sub_time_interval_of_type_applicability", "REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-APPLICABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_sub_time_interval_of_type_cost", "REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_sub_time_interval_of_type_output_generate", "REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-OUTPUT-GENERATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_sub_time_interval_of_type_literals", "REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "new_sub_time_interval_of_type_iterator", "NEW-SUB-TIME-INTERVAL-OF-TYPE-ITERATOR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "sub_time_interval_of_type_iterator_state", "SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "sub_time_interval_of_type_iterator_done", "SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "sub_time_interval_of_type_iterator_next", "SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "sub_time_interval_of_type_iterator_finalize", "SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_starting_day_pos_expand", "REMOVAL-STARTING-DAY-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_starting_day_check_pos_expand", "REMOVAL-STARTING-DAY-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_starting_day_check_neg_expand", "REMOVAL-STARTING-DAY-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_ending_day_pos_expand", "REMOVAL-ENDING-DAY-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_ending_day_check_pos_expand", "REMOVAL-ENDING-DAY-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_ending_day_check_neg_expand", "REMOVAL-ENDING-DAY-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "removal_maximalcontiguousspanninginterval_expand", "REMOVAL-MAXIMALCONTIGUOUSSPANNINGINTERVAL-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "first_cycl_interval_initial_second_possibly_indeterminate_late", "FIRST-CYCL-INTERVAL-INITIAL-SECOND-POSSIBLY-INDETERMINATE-LATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_time_utilities", "maximal_intervals_subsuming_intervals", "MAXIMAL-INTERVALS-SUBSUMING-INTERVALS", 1, 2, false);
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    public static SubLObject init_removal_modules_time_utilities_file() {
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    public static SubLObject setup_removal_modules_time_utilities_file() {
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_time_utilities.$kw0$REMOVAL_SUB_TIME_INTERVAL_OF_TYPE, (SubLObject)removal_modules_time_utilities.$list1);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_time_utilities.$const22$startingDay);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_time_utilities.$kw12$POS, removal_modules_time_utilities.$const22$startingDay, (SubLObject)removal_modules_time_utilities.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_time_utilities.$kw23$REMOVAL_STARTING_DAY_CHECK_POS, (SubLObject)removal_modules_time_utilities.$list24);
        inference_modules.inference_removal_module((SubLObject)removal_modules_time_utilities.$kw25$REMOVAL_STARTING_DAY_CHECK_NEG, (SubLObject)removal_modules_time_utilities.$list26);
        inference_modules.inference_removal_module((SubLObject)removal_modules_time_utilities.$kw27$REMOVAL_STARTING_DAY_POS, (SubLObject)removal_modules_time_utilities.$list28);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_time_utilities.$const34$endingDay);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_time_utilities.$kw12$POS, removal_modules_time_utilities.$const34$endingDay, (SubLObject)removal_modules_time_utilities.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_time_utilities.$kw35$REMOVAL_ENDING_DAY_CHECK_POS, (SubLObject)removal_modules_time_utilities.$list36);
        inference_modules.inference_removal_module((SubLObject)removal_modules_time_utilities.$kw37$REMOVAL_ENDING_DAY_CHECK_NEG, (SubLObject)removal_modules_time_utilities.$list38);
        inference_modules.inference_removal_module((SubLObject)removal_modules_time_utilities.$kw39$REMOVAL_ENDING_DAY_POS, (SubLObject)removal_modules_time_utilities.$list40);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_time_utilities.$kw12$POS, removal_modules_time_utilities.$const41$maximalContiguousSpanningInterval, (SubLObject)removal_modules_time_utilities.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_time_utilities.$kw42$REMOVAL_MAXIMALCONTIGUOUSSPANNINGINTERVAL, (SubLObject)removal_modules_time_utilities.$list43);
        return (SubLObject)removal_modules_time_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_time_utilities_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_time_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_time_utilities_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_time_utilities();
        $kw0$REMOVAL_SUB_TIME_INTERVAL_OF_TYPE = SubLObjectFactory.makeKeyword("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"))), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-APPLICABILITY"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE-OUTPUT-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and (#$isa <varN> <time-type>)\n           (#$temporallySubsumes <time-interval> <varN>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and (#$isa ?MONTH #$CalendarWeek)\n           (#$temporallySubsumes (#$MonthFn #$May (#$YearFn 2005)) ?MONTH))") });
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $const3$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $const5$TimeParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeParameter"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT1"));
        $const7$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERVAL1"), (SubLObject)SubLObjectFactory.makeSymbol("VAR1"));
        $sym9$_ = SubLObjectFactory.makeSymbol("<");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-ASENT"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMP-ASENT"));
        $kw12$POS = SubLObjectFactory.makeKeyword("POS");
        $sym13$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-DONE");
        $sym14$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-NEXT");
        $sym15$SUB_TIME_INTERVAL_OF_TYPE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("SUB-TIME-INTERVAL-OF-TYPE-ITERATOR-FINALIZE");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT0"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT0"));
        $kw17$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw18$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw19$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $kw20$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("JUST-TEMPLATE"));
        $const22$startingDay = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDay"));
        $kw23$REMOVAL_STARTING_DAY_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-STARTING-DAY-CHECK-POS");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDay")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDay")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-STARTING-DAY-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$startingDay <time-interval> <day>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$startingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002))))") });
        $kw25$REMOVAL_STARTING_DAY_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-STARTING-DAY-CHECK-NEG");
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDay")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDay")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-STARTING-DAY-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$startingDay <time-interval> <day>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$startingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002)))))") });
        $kw27$REMOVAL_STARTING_DAY_POS = SubLObjectFactory.makeKeyword("REMOVAL-STARTING-DAY-POS");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDay")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDay")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-STARTING-DAY-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$startingDay <time-interval> ?DAY)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$startingDay (#$YearFn 2002) ?DAY) -> (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002)))") });
        $const29$CalendarSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarSecond"));
        $const30$CalendarMinute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarMinute"));
        $const31$CalendarHour = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarHour"));
        $const32$CalendarDay = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarDay"));
        $kw33$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const34$endingDay = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDay"));
        $kw35$REMOVAL_ENDING_DAY_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ENDING-DAY-CHECK-POS");
        $list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDay")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDay")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ENDING-DAY-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$endingDay <time-interval> <day>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$endingDay (#$YearFn 2002) (#$DayFn 31 (#$MonthFn #$December (#$YearFn 2002))))") });
        $kw37$REMOVAL_ENDING_DAY_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ENDING-DAY-CHECK-NEG");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDay")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDay")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ENDING-DAY-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$endingDay <time-interval> <day>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$endingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002))))") });
        $kw39$REMOVAL_ENDING_DAY_POS = SubLObjectFactory.makeKeyword("REMOVAL-ENDING-DAY-POS");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDay")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDay")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ENDING-DAY-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$endingDay <time-interval> ?DAY)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$endingDay (#$YearFn 2002) ?DAY) -> (#$DayFn 31 (#$MonthFn #$December (#$YearFn 2002)))") });
        $const41$maximalContiguousSpanningInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalContiguousSpanningInterval"));
        $kw42$REMOVAL_MAXIMALCONTIGUOUSSPANNINGINTERVAL = SubLObjectFactory.makeKeyword("REMOVAL-MAXIMALCONTIGUOUSSPANNINGINTERVAL");
        $list43 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalContiguousSpanningInterval")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximalContiguousSpanningInterval")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MAXIMALCONTIGUOUSSPANNINGINTERVAL-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$maximalContiguousSpanningInterval <fully-bound-p> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(maximalContiguousSpanningInterval (TheSet (DateFromStringFn \"2002\") (DateFromStringFn \"2003\")) (#$TimeIntervalInclusiveFn (DateFromStringFn \"2002\") (DateFromStringFn \"2003\")))") });
        $sym44$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym45$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym46$DATE__ = SubLObjectFactory.makeSymbol("DATE<=");
        $sym47$FIRST_CYCL_INTERVAL_INITIAL_SECOND_POSSIBLY_INDETERMINATE_LATE = SubLObjectFactory.makeSymbol("FIRST-CYCL-INTERVAL-INITIAL-SECOND-POSSIBLY-INDETERMINATE-LATE");
        $str48$INPUT___A__ = SubLObjectFactory.makeString("INPUT: ~A~%");
        $str49$_________________________________ = SubLObjectFactory.makeString("-------------------------------------------------------~%");
        $str50$NEXT__A_____A_____A_____A_____A__ = SubLObjectFactory.makeString("NEXT ~A~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str51$CURRENT_____A_____A_____A_____A__ = SubLObjectFactory.makeString("CURRENT~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str52$initial_setup_____A_____A_____A__ = SubLObjectFactory.makeString("initial setup~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str53$stitching_____A_____A_____A_____A = SubLObjectFactory.makeString("stitching~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str54$into_current_____A_____A_____A___ = SubLObjectFactory.makeString("into current~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str55$to_get_____A_____A_____A_____A__ = SubLObjectFactory.makeString("to get~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str56$adding_____A_____A_____A_____A__ = SubLObjectFactory.makeString("adding~%  ~A~%  ~A~%  ~A~%  ~A~%");
        $str57$adding_last_____A_____A_____A____ = SubLObjectFactory.makeString("adding last~%  ~A~%  ~A~%  ~A~%  ~A~%");
    }
}

/*

	Total time: 253 ms
	
*/