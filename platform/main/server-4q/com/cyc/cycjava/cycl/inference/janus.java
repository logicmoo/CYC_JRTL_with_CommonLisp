package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class janus extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "75641dd2247477f0fee6a04ea8a075a9d47e2a47ae57d5e2052118fdd4d48789";
    @SubL(source = "cycl/inference.lisp", position = 6100L)
    private static SubLSymbol $janus_transcript_directory$;
    @SubL(source = "cycl/inference.lisp", position = 11300L)
    private static SubLSymbol $janus_experiment_directory$;
    private static SubLSymbol $JANUS_OP;
    private static SubLSymbol $CREATE;
    private static SubLSymbol $ASSERT;
    private static SubLSymbol $QUERY;
    private static SubLSymbol $sym4$JANUS_CREATE_OPERATION_P;
    private static SubLSymbol $sym5$JANUS_ASSERT_OPERATION_P;
    private static SubLSymbol $sym6$JANUS_QUERY_OPERATION_P;
    private static SubLSymbol $CONST;
    private static SubLSymbol $sym8$ASSERTION_IST_FORMULA;
    private static SubLString $str9$_cyc_projects_inference_janus_tra;
    private static SubLSymbol $sym10$FILE_VALID_FOR_WRITING_P;
    private static SubLString $str11$_s_appears_more_than_once__in_pos;
    private static SubLSymbol $sym12$INVALID_CONSTANT_;
    private static SubLSymbol $ALL;
    private static SubLSymbol $sym14$INVALID_ASSERTION_;
    private static SubLString $str15$invalid_term_in_assert_op___s__s_;
    private static SubLString $str16$invalid_constant_in_query_op___s_;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLString $str18$ignoring_problem_store_reuse_for_;
    private static SubLString $str19$NEW_CONTINUABLE_INFERENCE___s__s_;
    private static SubLSymbol $DEDUCTION;
    private static SubLString $str21$_cyc_projects_inference_janus_exp;
    private static SubLList $list22;
    private static SubLList $list23;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $TRANSCRIPT_FILENAME;
    private static SubLSymbol $EXPERIMENT_FILENAME;
    private static SubLSymbol $COMMENT;
    private static SubLSymbol $OVERRIDING_QUERY_PROPERTIES;
    private static SubLSymbol $METRICS;
    private static SubLList $list30;
    private static SubLSymbol $OUTLIER_TIMEOUT;
    private static SubLSymbol $sym32$_ARETE_OUTLIER_TIMEOUT_;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $COUNT;
    private static SubLSymbol $sym35$RUN_KCT_EXPERIMENT;
    private static SubLSymbol $TEST_SPEC_SET;
    private static SubLSymbol $sym37$QUOTE;
    private static SubLSymbol $FILENAME;
    private static SubLSymbol $INCREMENTAL;
    private static SubLSymbol $OVERRIDING_METRICS;
    private static SubLInteger $int$600;
    private static SubLString $str42$Execution_of_Janus_operation__s_f;
    private static SubLString $str43$unknown_modification_operation_ty;
    private static SubLSymbol $NOT_A_QUERY;
    private static SubLSymbol $STRENGTH;
    private static SubLSymbol $DIRECTION;
    private static SubLList $list47;
    private static SubLObject $$termOfUnit;
    private static SubLSymbol $NAT;
    private static SubLString $str50$Janus_operation_of_unexpected_typ;
    private static SubLSymbol $sym51$LISTP;
    private static SubLString $str52$_s_____s__;
    private static SubLSymbol $MORE_COMPLETE;
    private static SubLSymbol $EQUALLY_COMPLETE;
    private static SubLSymbol $LESS_COMPLETE;
    private static SubLSymbol $DIFFERENT;
    private static SubLSymbol $TEST;
    private static SubLSymbol $sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT;
    private static SubLString $str59$filtered_to_exclude_invalid_forts;
    private static SubLSymbol $sym60$JANUS_VALID_TEST_RUN_;
    private static SubLSymbol $sym61$INVALID_INDEXED_TERM_;
    private static SubLSymbol $FAILURE;
    private static SubLSymbol $BECAME_FAILURE;
    private static SubLSymbol $BECAME_SUCCESS;
    private static SubLSymbol $CHANGE;

    @SubL(source = "cycl/inference.lisp", position = 800L)
    public static SubLObject janus_operation_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && $JANUS_OP == v_object.first());
    }

    @SubL(source = "cycl/inference.lisp", position = 1000L)
    public static SubLObject janus_operation_type(SubLObject jop) {
        return conses_high.second(jop);
    }

    @SubL(source = "cycl/inference.lisp", position = 1100L)
    public static SubLObject janus_create_operation_p(SubLObject v_object) {
        return makeBoolean(NIL != janus_operation_p(v_object) && $CREATE == janus_operation_type(v_object));
    }

    @SubL(source = "cycl/inference.lisp", position = 1200L)
    public static SubLObject janus_assert_operation_p(SubLObject v_object) {
        return makeBoolean(NIL != janus_operation_p(v_object) && $ASSERT == janus_operation_type(v_object));
    }

    @SubL(source = "cycl/inference.lisp", position = 1400L)
    public static SubLObject janus_query_operation_p(SubLObject v_object) {
        return makeBoolean(NIL != janus_operation_p(v_object) && $QUERY == janus_operation_type(v_object));
    }

    @SubL(source = "cycl/inference.lisp", position = 1500L)
    public static SubLObject janus_modification_operation_p(SubLObject v_object) {
        return makeBoolean(NIL != janus_create_operation_p(v_object) || NIL != janus_assert_operation_p(v_object));
    }

    @SubL(source = "cycl/inference.lisp", position = 1600L)
    public static SubLObject new_janus_create_op(SubLObject name, SubLObject external_id, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = control_vars.$janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate(list($JANUS_OP, $CREATE, name, external_id, tag));
    }

    @SubL(source = "cycl/inference.lisp", position = 1800L)
    public static SubLObject new_janus_deduce_spec(SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        return list(cnf, mt, direction, variable_map);
    }

    @SubL(source = "cycl/inference.lisp", position = 1900L)
    public static SubLObject new_janus_assert_op(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject expected_deduce_specs, SubLObject allowed_rules, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = control_vars.$janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate(list(new SubLObject[] { $JANUS_OP, $ASSERT, sentence, mt, strength, direction, expected_deduce_specs, allowed_rules, tag }));
    }

    @SubL(source = "cycl/inference.lisp", position = 2200L)
    public static SubLObject new_janus_query_op(SubLObject sentence, SubLObject mt, SubLObject query_properties, SubLObject expected_result, SubLObject expected_halt_reason, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = control_vars.$janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate(list($JANUS_OP, $QUERY, sentence, mt, query_properties, expected_result, expected_halt_reason, tag));
    }

    @SubL(source = "cycl/inference.lisp", position = 2400L)
    public static SubLObject janus_create_op_name(SubLObject create_jop) {
        assert NIL != janus_create_operation_p(create_jop) : create_jop;
        return encapsulation.unencapsulate_partial(conses_high.third(create_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 2600L)
    public static SubLObject janus_create_op_external_id(SubLObject create_jop) {
        assert NIL != janus_create_operation_p(create_jop) : create_jop;
        return encapsulation.unencapsulate_partial(conses_high.fourth(create_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 2700L)
    public static SubLObject janus_create_op_tag(SubLObject create_jop) {
        assert NIL != janus_create_operation_p(create_jop) : create_jop;
        return encapsulation.unencapsulate_partial(conses_high.fifth(create_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 2900L)
    public static SubLObject janus_assert_op_sentence(SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.third(assert_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 3000L)
    public static SubLObject janus_assert_op_mt(SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.fourth(assert_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 3200L)
    public static SubLObject janus_assert_op_strength(SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.fifth(assert_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 3300L)
    public static SubLObject janus_assert_op_direction(SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.sixth(assert_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 3500L)
    public static SubLObject janus_assert_op_expected_deduce_specs(SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.seventh(assert_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 3700L)
    public static SubLObject janus_assert_op_allowed_rules(SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.eighth(assert_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 3800L)
    public static SubLObject janus_assert_op_tag(SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.ninth(assert_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 4000L)
    public static SubLObject janus_query_op_sentence(SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.third(query_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 4100L)
    public static SubLObject janus_query_op_mt(SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.fourth(query_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 4300L)
    public static SubLObject janus_query_op_query_properties(SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.fifth(query_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 4400L)
    public static SubLObject janus_query_op_expected_result(SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.sixth(query_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 4600L)
    public static SubLObject janus_query_op_expected_halt_reason(SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.seventh(query_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 4800L)
    public static SubLObject janus_query_op_tag(SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.eighth(query_jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 4900L)
    public static SubLObject janus_new_constantP(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(isConstSym(v_object) && NIL != subl_promotions.memberP(v_object, control_vars.$janus_new_constants$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference.lisp", position = 5100L)
    public static SubLObject janus_dwim_constant(SubLObject constant) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject position = Sequences.position(constant, control_vars.$janus_new_constants$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list($CONST, position);
    }

    @SubL(source = "cycl/inference.lisp", position = 5200L)
    public static SubLObject janus_dwimmed_constant_id(SubLObject constant) {
        return conses_high.second(janus_dwim_constant(constant));
    }

    @SubL(source = "cycl/inference.lisp", position = 5300L)
    public static SubLObject janus_dwimmed_constantP(SubLObject v_object) {
        return makeBoolean(NIL != list_utilities.doubletonP(v_object) && $CONST == v_object.first() && NIL != subl_promotions.non_negative_integer_p(conses_high.second(v_object)));
    }

    @SubL(source = "cycl/inference.lisp", position = 5500L)
    public static SubLObject janus_dwim_expression(SubLObject expression) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dwimmed_expression = NIL;
        SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
        try {
            czer_vars.$assertion_key$.bind($sym8$ASSERTION_IST_FORMULA, thread);
            dwimmed_expression = cycl_utilities.hl_to_el(expression);
        } finally {
            czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
        }
        return dwimmed_expression;
    }

    @SubL(source = "cycl/inference.lisp", position = 5800L)
    public static SubLObject set_janus_tag(SubLObject tag) {
        control_vars.$janus_tag$.setDynamicValue(tag);
        return tag;
    }

    @SubL(source = "cycl/inference.lisp", position = 5900L)
    public static SubLObject janus_test_case_loggingP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$janus_test_case_loggingP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference.lisp", position = 6000L)
    public static SubLObject janus_within_somethingP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$janus_within_somethingP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference.lisp", position = 6200L)
    public static SubLObject janus_transcript_full_filename(SubLObject filename) {
        return arete.arete_experiment_full_filename(filename, $janus_transcript_directory$.getGlobalValue());
    }

    @SubL(source = "cycl/inference.lisp", position = 6300L)
    public static SubLObject save_janus_transcript(SubLObject filename, SubLObject form, SubLObject internalP) {
        if (internalP == UNPROVIDED) {
            internalP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        filename = janus_transcript_full_filename(filename);
        assert NIL != file_utilities.file_valid_for_writing_p(filename) : filename;
        thread.resetMultipleValues();
        SubLObject jops = extract_janus_operations(form);
        SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != internalP) {
            cfasl_utilities.cfasl_save(jops, filename);
        } else {
            cfasl_utilities.cfasl_save_externalized(jops, filename);
        }
        return time;
    }

    @SubL(source = "cycl/inference.lisp", position = 6800L)
    public static SubLObject load_janus_transcript(SubLObject filename) {
        filename = janus_transcript_full_filename(filename);
        return cfasl_utilities.cfasl_load(filename);
    }

    @SubL(source = "cycl/inference.lisp", position = 7000L)
    public static SubLObject janus_op_index(SubLObject jops, SubLObject jop) {
        SubLObject indices = janus_op_indices(jops, jop);
        SubLObject index = indices.first();
        if (NIL != list_utilities.lengthG(indices, ONE_INTEGER, UNPROVIDED)) {
            Errors.warn($str11$_s_appears_more_than_once__in_pos, jop, indices);
        }
        return index;
    }

    @SubL(source = "cycl/inference.lisp", position = 7500L)
    public static SubLObject janus_op_indices(SubLObject jops, SubLObject jop) {
        SubLObject indices = NIL;
        SubLObject list_var = NIL;
        SubLObject candidate_jop = NIL;
        SubLObject index = NIL;
        list_var = jops;
        candidate_jop = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), candidate_jop = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
            if (jop.equalp(candidate_jop)) {
                indices = cons(index, indices);
            }
        }
        return Sequences.nreverse(indices);
    }

    @SubL(source = "cycl/inference.lisp", position = 7800L)
    public static SubLObject extract_janus_operations(SubLObject form) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject jops = NIL;
        SubLObject time = NIL;
        SubLObject _prev_bind_0 = control_vars.$janus_test_case_loggingP$.currentBinding(thread);
        SubLObject _prev_bind_2 = control_vars.$janus_new_constants$.currentBinding(thread);
        SubLObject _prev_bind_3 = control_vars.$janus_operations$.currentBinding(thread);
        try {
            control_vars.$janus_test_case_loggingP$.bind(T, thread);
            control_vars.$janus_new_constants$.bind(NIL, thread);
            control_vars.$janus_operations$.bind(NIL, thread);
            SubLObject time_var = Time.get_internal_real_time();
            SubLObject _prev_bind_0_$1 = control_vars.$read_require_constant_exists$.currentBinding(thread);
            try {
                control_vars.$read_require_constant_exists$.bind(NIL, thread);
                Eval.eval(form);
            } finally {
                control_vars.$read_require_constant_exists$.rebind(_prev_bind_0_$1, thread);
            }
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            jops = Sequences.nreverse(control_vars.$janus_operations$.getDynamicValue(thread));
        } finally {
            control_vars.$janus_operations$.rebind(_prev_bind_3, thread);
            control_vars.$janus_new_constants$.rebind(_prev_bind_2, thread);
            control_vars.$janus_test_case_loggingP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(jops, time);
    }

    @SubL(source = "cycl/inference.lisp", position = 8200L)
    public static SubLObject janus_note_create_finished(SubLObject new_constant) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != janus_test_case_loggingP() && NIL != constant_handles.valid_constantP(new_constant, UNPROVIDED)) {
            SubLObject new_cons = cons(new_constant, NIL);
            SubLObject list = control_vars.$janus_new_constants$.getDynamicValue(thread);
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                control_vars.$janus_new_constants$.setDynamicValue(new_cons, thread);
            }
            SubLObject name = constants_high.constant_name(new_constant);
            SubLObject external_id = constants_high.constant_external_id(new_constant);
            control_vars.$janus_operations$.setDynamicValue(cons(new_janus_create_op(name, external_id, UNPROVIDED), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference.lisp", position = 8700L)
    public static SubLObject janus_note_assert_finished(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject deduce_specs) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == janus_test_case_loggingP() || NIL != janus_within_somethingP()) {
            return NIL;
        }
        deduce_specs = janus_dwim_expression(deduce_specs);
        SubLObject allowed_rules = kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
        if (NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, sentence, UNPROVIDED, UNPROVIDED) || NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, mt, UNPROVIDED, UNPROVIDED)
                || NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, deduce_specs, UNPROVIDED, UNPROVIDED) || NIL != (($ALL == allowed_rules) ? NIL : Sequences.find_if($sym14$INVALID_ASSERTION_, allowed_rules, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.warn($str15$invalid_term_in_assert_op___s__s_, new SubLObject[] { sentence, mt, deduce_specs, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread) });
            return NIL;
        }
        control_vars.$janus_operations$.setDynamicValue(cons(new_janus_assert_op(sentence, mt, strength, direction, deduce_specs, allowed_rules, UNPROVIDED), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
        return T;
    }

    @SubL(source = "cycl/inference.lisp", position = 9500L)
    public static SubLObject janus_note_query_finished(SubLObject sentence, SubLObject mt, SubLObject query_properties, SubLObject result, SubLObject halt_reason) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != janus_test_case_loggingP() && NIL == janus_within_somethingP()) {
            result = janus_dwim_expression(result);
            if (NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, sentence, UNPROVIDED, UNPROVIDED) || NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, mt, UNPROVIDED, UNPROVIDED)) {
                Errors.warn($str16$invalid_constant_in_query_op___s_, sentence, mt);
                return NIL;
            }
            if (NIL != conses_high.getf(query_properties, $PROBLEM_STORE, UNPROVIDED)) {
                Errors.warn($str18$ignoring_problem_store_reuse_for_, sentence, mt, query_properties);
                query_properties = conses_high.remf(conses_high.copy_list(query_properties), $PROBLEM_STORE);
            }
            control_vars.$janus_operations$.setDynamicValue(cons(new_janus_query_op(sentence, mt, query_properties, result, halt_reason, UNPROVIDED), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference.lisp", position = 10300L)
    public static SubLObject janus_note_new_continuable_inference(SubLObject sentence, SubLObject mt, SubLObject query_static_properties) {
        if (NIL != janus_test_case_loggingP() && NIL == janus_within_somethingP()) {
            Errors.warn($str19$NEW_CONTINUABLE_INFERENCE___s__s_, sentence, mt, query_static_properties);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference.lisp", position = 10600L)
    public static SubLObject janus_note_argument(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != janus_test_case_loggingP() || NIL != janus_test_case_runningP()) {
            cnf = janus_dwim_expression(cnf);
            mt = janus_dwim_expression(mt);
            if ($DEDUCTION == arguments.argument_spec_type(argument_spec)) {
                if (NIL != janus_test_case_runningP()) {
                    control_vars.$janus_testing_deduce_specs$.setDynamicValue(cons(new_janus_deduce_spec(cnf, mt, direction, variable_map), control_vars.$janus_testing_deduce_specs$.getDynamicValue(thread)), thread);
                } else {
                    control_vars.$janus_extraction_deduce_specs$.setDynamicValue(cons(new_janus_deduce_spec(cnf, mt, direction, variable_map), control_vars.$janus_extraction_deduce_specs$.getDynamicValue(thread)), thread);
                }
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference.lisp", position = 11400L)
    public static SubLObject janus_experiment_full_filename(SubLObject filename) {
        return arete.arete_experiment_full_filename(filename, $janus_experiment_directory$.getGlobalValue());
    }

    @SubL(source = "cycl/inference.lisp", position = 11600L)
    public static SubLObject run_janus_experiment(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list22);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list22);
            if (NIL == conses_high.member(current_$2, $list23, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list22);
        }
        SubLObject transcript_filename_tail = cdestructuring_bind.property_list_member($TRANSCRIPT_FILENAME, current);
        SubLObject transcript_filename = (NIL != transcript_filename_tail) ? conses_high.cadr(transcript_filename_tail) : NIL;
        SubLObject experiment_filename_tail = cdestructuring_bind.property_list_member($EXPERIMENT_FILENAME, current);
        SubLObject experiment_filename = (NIL != experiment_filename_tail) ? conses_high.cadr(experiment_filename_tail) : NIL;
        SubLObject comment_tail = cdestructuring_bind.property_list_member($COMMENT, current);
        SubLObject comment = (NIL != comment_tail) ? conses_high.cadr(comment_tail) : NIL;
        SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
        SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : NIL;
        SubLObject metrics_tail = cdestructuring_bind.property_list_member($METRICS, current);
        SubLObject metrics = (NIL != metrics_tail) ? conses_high.cadr(metrics_tail) : $list30;
        SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member($OUTLIER_TIMEOUT, current);
        SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : $sym32$_ARETE_OUTLIER_TIMEOUT_;
        SubLObject skip_tail = cdestructuring_bind.property_list_member($SKIP, current);
        SubLObject skip = (NIL != skip_tail) ? conses_high.cadr(skip_tail) : ZERO_INTEGER;
        SubLObject count_tail = cdestructuring_bind.property_list_member($COUNT, current);
        SubLObject count = (NIL != count_tail) ? conses_high.cadr(count_tail) : NIL;
        SubLObject jops = load_janus_transcript(transcript_filename);
        SubLObject experiment_full_filename = janus_experiment_full_filename(experiment_filename);
        return list(new SubLObject[] { $sym35$RUN_KCT_EXPERIMENT, $TEST_SPEC_SET, list($sym37$QUOTE, jops), $FILENAME, experiment_full_filename, $COMMENT, comment, $INCREMENTAL, T, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $OVERRIDING_METRICS, metrics,
                $OUTLIER_TIMEOUT, outlier_timeout, $SKIP, skip, $COUNT, count });
    }

    @SubL(source = "cycl/inference.lisp", position = 12200L)
    public static SubLObject janus_test_case_runningP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$janus_test_case_runningP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference.lisp", position = 12300L)
    public static SubLObject execute_janus_operations(SubLObject jops, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP, SubLObject start, SubLObject end) {
        if (metrics == UNPROVIDED) {
            metrics = NIL;
        }
        if (outlier_timeout == UNPROVIDED) {
            outlier_timeout = $int$600;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (include_resultP == UNPROVIDED) {
            include_resultP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject overall_result = NIL;
        SubLObject list_var = NIL;
        SubLObject jop = NIL;
        SubLObject index = NIL;
        list_var = jops;
        jop = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), jop = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
            if (index.numGE(start) && (NIL == end || index.numLE(end))) {
                SubLObject jop_result = execute_janus_operation(jop, metrics, outlier_timeout, overriding_query_properties, include_resultP);
                count = Numbers.add(count, ONE_INTEGER);
            }
        }
        return Values.values(overall_result, count);
    }

    @SubL(source = "cycl/inference.lisp", position = 12800L)
    public static SubLObject execute_janus_operation(SubLObject jop, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP) {
        if (metrics == UNPROVIDED) {
            metrics = NIL;
        }
        if (outlier_timeout == UNPROVIDED) {
            outlier_timeout = $int$600;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (include_resultP == UNPROVIDED) {
            include_resultP = NIL;
        }
        return kbq_query_run.kbq_run_query(jop, metrics, outlier_timeout, overriding_query_properties, include_resultP, UNPROVIDED);
    }

    @SubL(source = "cycl/inference.lisp", position = 13100L)
    public static SubLObject execute_janus_create_operations(SubLObject jops) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = jops;
        SubLObject jop = NIL;
        jop = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != janus_create_operation_p(jop)) {
                if (NIL != execute_janus_create(jop)) {
                    count = Numbers.add(count, ONE_INTEGER);
                } else {
                    Errors.warn($str42$Execution_of_Janus_operation__s_f, jop);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference.lisp", position = 13300L)
    public static SubLObject execute_janus_modification_operation(SubLObject jop) {
        SubLObject pcase_var = janus_operation_type(jop);
        if (pcase_var.eql($CREATE)) {
            return execute_janus_create(jop);
        }
        if (pcase_var.eql($ASSERT)) {
            return execute_janus_assert(jop);
        }
        return Errors.error($str43$unknown_modification_operation_ty, janus_operation_type(jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 13700L)
    public static SubLObject kill_janus_constants(SubLObject jops) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = jops;
        SubLObject jop = NIL;
        jop = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($CREATE == janus_operation_type(jop)) {
                SubLObject external_id = janus_create_op_external_id(jop);
                if (NIL != constants_high.constant_external_id_p(external_id)) {
                    SubLObject v_const = constants_high.find_constant_by_external_id(external_id);
                    if (isConstSym(v_const)) {
                        cyc_kernel.cyc_kill(v_const);
                        count = Numbers.add(count, ONE_INTEGER);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference.lisp", position = 14100L)
    public static SubLObject execute_janus_create(SubLObject jop) {
        assert NIL != janus_create_operation_p(jop) : jop;
        SubLObject name = janus_create_op_name(jop);
        SubLObject external_id = janus_create_op_external_id(jop);
        SubLObject result = cyc_kernel.cyc_create(name, external_id);
        return Values.values(result, $NOT_A_QUERY, NIL, NIL);
    }

    @SubL(source = "cycl/inference.lisp", position = 14600L)
    public static SubLObject execute_janus_assert(SubLObject jop) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != janus_assert_operation_p(jop) : jop;
        jop = dwim_janus_assert_operation(jop);
        SubLObject sentence = janus_assert_op_sentence(jop);
        SubLObject mt = janus_assert_op_mt(jop);
        SubLObject strength = janus_assert_op_strength(jop);
        SubLObject direction = janus_assert_op_direction(jop);
        SubLObject allowed_rules = janus_assert_op_allowed_rules(jop);
        SubLObject deduce_specs = NIL;
        SubLObject _prev_bind_0 = control_vars.$janus_test_case_runningP$.currentBinding(thread);
        SubLObject _prev_bind_2 = control_vars.$janus_testing_deduce_specs$.currentBinding(thread);
        try {
            control_vars.$janus_test_case_runningP$.bind(T, thread);
            control_vars.$janus_testing_deduce_specs$.bind(NIL, thread);
            SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(allowed_rules, thread);
                cyc_kernel.cyc_assert(sentence, mt, list($STRENGTH, strength, $DIRECTION, direction));
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$3, thread);
            }
            deduce_specs = control_vars.$janus_testing_deduce_specs$.getDynamicValue(thread);
        } finally {
            control_vars.$janus_testing_deduce_specs$.rebind(_prev_bind_2, thread);
            control_vars.$janus_test_case_runningP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(deduce_specs, $NOT_A_QUERY, NIL, NIL);
    }

    @SubL(source = "cycl/inference.lisp", position = 15500L)
    public static SubLObject dwim_janus_assert_operation(SubLObject jop) {
        SubLObject current;
        SubLObject datum = current = jop;
        SubLObject janus_op = NIL;
        SubLObject type = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject strength = NIL;
        SubLObject direction = NIL;
        SubLObject expected_deduce_specs = NIL;
        SubLObject allowed_rules = NIL;
        SubLObject tag = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        janus_op = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        strength = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        expected_deduce_specs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        allowed_rules = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != list_utilities.tree_find(constants_high.constant_external_id($$termOfUnit), sentence, Symbols.symbol_function(EQUALP), UNPROVIDED)) {
                SubLObject unencapsulated_sentence = encapsulation.unencapsulate_partial(sentence);
                if (NIL != el_utilities.el_formula_with_operator_p(unencapsulated_sentence, $$termOfUnit)) {
                    SubLObject nat = cycl_utilities.formula_arg1(unencapsulated_sentence, UNPROVIDED);
                    if (NIL != list_utilities.doubletonP(nat) && $NAT.equal(nat.first())) {
                        SubLObject naut = conses_high.second(nat);
                        sentence = el_utilities.replace_formula_arg(ONE_INTEGER, naut, sentence);
                        jop = new_janus_assert_op(sentence, mt, strength, direction, expected_deduce_specs, allowed_rules, tag);
                    }
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
        }
        return jop;
    }

    @SubL(source = "cycl/inference.lisp", position = 16300L)
    public static SubLObject dwim_janus_query_properties(SubLObject v_properties) {
        return v_properties;
    }

    @SubL(source = "cycl/inference.lisp", position = 16400L)
    public static SubLObject janus_operation_successP(SubLObject jop, SubLObject result, SubLObject halt_reason) {
        if (halt_reason == UNPROVIDED) {
            halt_reason = NIL;
        }
        result = janus_dwim_expression(result);
        SubLObject pcase_var = janus_operation_type(jop);
        if (pcase_var.eql($CREATE)) {
            return janus_create_successP(jop, result);
        }
        if (pcase_var.eql($ASSERT)) {
            return janus_assert_successP(jop, result);
        }
        if (pcase_var.eql($QUERY)) {
            return janus_query_successP(jop, result, halt_reason);
        }
        return Errors.error($str50$Janus_operation_of_unexpected_typ, janus_operation_type(jop));
    }

    @SubL(source = "cycl/inference.lisp", position = 16800L)
    public static SubLObject janus_create_successP(SubLObject jop, SubLObject result) {
        return list_utilities.sublisp_boolean(result);
    }

    @SubL(source = "cycl/inference.lisp", position = 16900L)
    public static SubLObject janus_assert_successP(SubLObject jop, SubLObject deduce_specs) {
        assert NIL != Types.listp(deduce_specs) : deduce_specs;
        SubLObject expected_deduce_specs = janus_assert_op_expected_deduce_specs(jop);
        SubLObject successP = list_utilities.sets_equalP(deduce_specs, expected_deduce_specs, Symbols.symbol_function(EQUALP));
        return successP;
    }

    @SubL(source = "cycl/inference.lisp", position = 17300L)
    public static SubLObject janus_query_successP(SubLObject jop, SubLObject result, SubLObject halt_reason) {
        if (halt_reason == UNPROVIDED) {
            halt_reason = NIL;
        }
        SubLObject expected_result = janus_query_op_expected_result(jop);
        SubLObject expected_halt_reason = janus_query_op_expected_halt_reason(jop);
        SubLObject result_successP = janus_query_result_successP(result, expected_result);
        SubLObject halt_reason_successP = makeBoolean(NIL == halt_reason || halt_reason.equal(expected_halt_reason));
        SubLObject successP = makeBoolean(NIL != result_successP && NIL != halt_reason_successP);
        if (NIL == result_successP) {
            PrintLow.format(T, $str52$_s_____s__, result, expected_result);
        }
        if (NIL == halt_reason_successP) {
            PrintLow.format(T, $str52$_s_____s__, halt_reason, expected_halt_reason);
        }
        return successP;
    }

    @SubL(source = "cycl/inference.lisp", position = 18000L)
    public static SubLObject janus_query_result_successP(SubLObject result, SubLObject expected_result) {
        if (NIL != bindings.binding_lists_p(result)) {
            return bindings.lists_of_binding_lists_equalP(result, expected_result);
        }
        return list_utilities.sets_equal_equalP(result, expected_result);
    }

    @SubL(source = "cycl/inference.lisp", position = 18200L)
    public static SubLObject load_janus_experiment(SubLObject filename) {
        SubLObject full_filename = janus_experiment_full_filename(filename);
        return kbq_query_run.kct_load_test_set_run(full_filename);
    }

    @SubL(source = "cycl/inference.lisp", position = 19900L)
    public static SubLObject janus_experiment_p(SubLObject v_object) {
        return makeBoolean(NIL != kbq_query_run.kct_test_set_run_p(v_object) && NIL != janus_operation_p(kbq_query_run.kct_test_run_test(kbq_query_run.kct_test_set_run_test_runs(v_object).first())));
    }

    @SubL(source = "cycl/inference.lisp", position = 20100L)
    public static SubLObject janus_failure_analysis(SubLObject test_set_run) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject more_complete = janus_categorize_failing_asserts(test_set_run);
        SubLObject equally_complete = thread.secondMultipleValue();
        SubLObject less_complete = thread.thirdMultipleValue();
        SubLObject different = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return list($MORE_COMPLETE, Sequences.length(more_complete), $EQUALLY_COMPLETE, Sequences.length(equally_complete), $LESS_COMPLETE, Sequences.length(less_complete), $DIFFERENT, Sequences.length(different));
    }

    @SubL(source = "cycl/inference.lisp", position = 20500L)
    public static SubLObject janus_newly_failing_op_failure_reasons(SubLObject baseline, SubLObject experiment) {
        SubLObject failure_reasons = NIL;
        SubLObject cdolist_list_var = kbq_query_run.kct_compare_test_set_run_statuses(baseline, experiment);
        SubLObject diff = NIL;
        diff = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject test = conses_high.getf(diff, $TEST, UNPROVIDED);
            SubLObject baseline_test_run = kbq_query_run.kct_lookup_test_run(baseline, test);
            SubLObject baseline_result = kbq_query_run.kbq_query_run_result(kbq_query_run.kct_test_run_query_run(baseline_test_run));
            SubLObject experiment_test_run = kbq_query_run.kct_lookup_test_run(experiment, test);
            SubLObject experiment_result = kbq_query_run.kbq_query_run_result(kbq_query_run.kct_test_run_query_run(experiment_test_run));
            failure_reasons = cons(janus_categorize_failing_assert_int(baseline_result, experiment_result), failure_reasons);
            cdolist_list_var = cdolist_list_var.rest();
            diff = cdolist_list_var.first();
        }
        return Sequences.nreverse(failure_reasons);
    }

    @SubL(source = "cycl/inference.lisp", position = 21100L)
    public static SubLObject janus_categorize_failing_asserts(SubLObject test_set_run) {
        SubLObject more_complete = NIL;
        SubLObject equally_complete = NIL;
        SubLObject less_complete = NIL;
        SubLObject different = NIL;
        SubLObject cdolist_list_var;
        SubLObject test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs(kbq_query_run.kct_failing_test_set_run(test_set_run));
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != janus_assert_operation_p(kbq_query_run.kct_test_run_test(test_run))) {
                SubLObject pcase_var = janus_categorize_failing_assert(test_run);
                if (pcase_var.eql($MORE_COMPLETE)) {
                    more_complete = cons(test_run, more_complete);
                } else if (pcase_var.eql($EQUALLY_COMPLETE)) {
                    equally_complete = cons(test_run, equally_complete);
                } else if (pcase_var.eql($LESS_COMPLETE)) {
                    less_complete = cons(test_run, less_complete);
                } else if (pcase_var.eql($DIFFERENT)) {
                    different = cons(test_run, different);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return Values.values(more_complete, equally_complete, less_complete, different);
    }

    @SubL(source = "cycl/inference.lisp", position = 22100L)
    public static SubLObject janus_categorize_failing_assert(SubLObject test_run) {
        SubLObject jop = kbq_query_run.kct_test_run_test(test_run);
        SubLObject expected_deduce_specs = janus_assert_op_expected_deduce_specs(jop);
        SubLObject query_run = kbq_query_run.kct_test_run_query_run(test_run);
        SubLObject actual_deduce_specs = kbq_query_run.kbq_query_run_result(query_run);
        return janus_categorize_failing_assert_int(expected_deduce_specs, actual_deduce_specs);
    }

    @SubL(source = "cycl/inference.lisp", position = 22500L)
    public static SubLObject janus_categorize_failing_assert_int(SubLObject baseline_deduce_specs, SubLObject experiment_deduce_specs) {
        if (NIL != list_utilities.sets_equalP(baseline_deduce_specs, experiment_deduce_specs, Symbols.symbol_function(EQUALP))) {
            return $EQUALLY_COMPLETE;
        }
        if (NIL != conses_high.subsetp(baseline_deduce_specs, experiment_deduce_specs, Symbols.symbol_function(EQUALP), UNPROVIDED)) {
            return $MORE_COMPLETE;
        }
        if (NIL != conses_high.subsetp(experiment_deduce_specs, baseline_deduce_specs, Symbols.symbol_function(EQUALP), UNPROVIDED)) {
            return $LESS_COMPLETE;
        }
        return $DIFFERENT;
    }

    @SubL(source = "cycl/inference.lisp", position = 23100L)
    public static SubLObject janus_valid_test_set_run(SubLObject test_set_run) {
        return kbq_query_run.kct_filter_test_set_run_by_test(test_set_run, $str59$filtered_to_exclude_invalid_forts, $sym60$JANUS_VALID_TEST_RUN_, UNPROVIDED);
    }

    @SubL(source = "cycl/inference.lisp", position = 23400L)
    public static SubLObject janus_valid_test_runP(SubLObject test_run) {
        return makeBoolean(NIL == list_utilities.tree_find_if($sym61$INVALID_INDEXED_TERM_, test_run, UNPROVIDED));
    }

    @SubL(source = "cycl/inference.lisp", position = 23500L)
    public static SubLObject janus_more_complete_test_runs(SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, $MORE_COMPLETE);
    }

    @SubL(source = "cycl/inference.lisp", position = 23700L)
    public static SubLObject janus_equally_complete_test_runs(SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, $EQUALLY_COMPLETE);
    }

    @SubL(source = "cycl/inference.lisp", position = 23800L)
    public static SubLObject janus_less_complete_test_runs(SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, $LESS_COMPLETE);
    }

    @SubL(source = "cycl/inference.lisp", position = 24000L)
    public static SubLObject janus_different_test_runs(SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, $DIFFERENT);
    }

    @SubL(source = "cycl/inference.lisp", position = 24100L)
    public static SubLObject janus_test_runs_with_assert_failure_status(SubLObject test_set_run, SubLObject assert_failure_status) {
        SubLObject result_test_runs = NIL;
        SubLObject cdolist_list_var;
        SubLObject test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($FAILURE == kbq_query_run.kct_test_run_status(test_run) && NIL != janus_assert_operation_p(kbq_query_run.kct_test_run_test(test_run)) && assert_failure_status.eql(janus_categorize_failing_assert(test_run))) {
                result_test_runs = cons(test_run, result_test_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(result_test_runs);
    }

    @SubL(source = "cycl/inference.lisp", position = 24600L)
    public static SubLObject janus_test_runs_that_started_failing(SubLObject test_set_run_1, SubLObject test_set_run_2) {
        return janus_test_runs_that_became_status(test_set_run_1, test_set_run_2, $BECAME_FAILURE, NIL);
    }

    @SubL(source = "cycl/inference.lisp", position = 24900L)
    public static SubLObject janus_test_runs_that_started_succeeding(SubLObject test_set_run_1, SubLObject test_set_run_2) {
        return janus_test_runs_that_became_status(test_set_run_1, test_set_run_2, $BECAME_SUCCESS, T);
    }

    @SubL(source = "cycl/inference.lisp", position = 25200L)
    public static SubLObject janus_test_runs_that_became_status(SubLObject test_set_run_1, SubLObject test_set_run_2, SubLObject status, SubLObject use_run_1P) {
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var;
        SubLObject jops = cdolist_list_var = janus_operations_that_became_status(test_set_run_1, test_set_run_2, status);
        SubLObject jop = NIL;
        jop = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject test_run = kbq_query_run.kct_lookup_test_run((NIL != use_run_1P) ? test_set_run_1 : test_set_run_2, jop);
            test_runs = cons(test_run, test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        }
        return Sequences.nreverse(test_runs);
    }

    @SubL(source = "cycl/inference.lisp", position = 25600L)
    public static SubLObject janus_operations_that_became_status(SubLObject test_set_run_1, SubLObject test_set_run_2, SubLObject status) {
        SubLObject jops = NIL;
        SubLObject cdolist_list_var;
        SubLObject differences = cdolist_list_var = kbq_query_run.kct_compare_test_set_run_statuses(test_set_run_1, test_set_run_2);
        SubLObject diff = NIL;
        diff = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (status.eql(conses_high.getf(diff, $CHANGE, UNPROVIDED))) {
                SubLObject jop = conses_high.getf(diff, $TEST, UNPROVIDED);
                jops = cons(jop, jops);
            }
            cdolist_list_var = cdolist_list_var.rest();
            diff = cdolist_list_var.first();
        }
        return Sequences.nreverse(jops);
    }

    @SubL(source = "cycl/inference.lisp", position = 26000L)
    public static SubLObject janus_compare_test_set_run_statuses(SubLObject test_set_run_1, SubLObject test_set_run_2) {
        SubLObject differences = NIL;
        SubLObject test_run_1 = NIL;
        SubLObject test_run_1_$4 = NIL;
        SubLObject test_run_2 = NIL;
        SubLObject test_run_2_$5 = NIL;
        test_run_1 = kbq_query_run.kct_test_set_run_test_runs(test_set_run_1);
        test_run_1_$4 = test_run_1.first();
        test_run_2 = kbq_query_run.kct_test_set_run_test_runs(test_set_run_2);
        test_run_2_$5 = test_run_2.first();
        while (NIL != test_run_2 || NIL != test_run_1) {
            SubLObject test = kbq_query_run.kct_test_run_test(test_run_1_$4);
            if (NIL != test_run_1_$4 && NIL != test_run_2_$5) {
                SubLObject difference = kbq_query_run.kct_compare_test_run_statuses(test_run_1_$4, test_run_2_$5);
                if (NIL != difference) {
                    differences = cons(list($TEST, test, $CHANGE, difference), differences);
                }
            }
            test_run_1 = test_run_1.rest();
            test_run_1_$4 = test_run_1.first();
            test_run_2 = test_run_2.rest();
            test_run_2_$5 = test_run_2.first();
        }
        differences = Sequences.nreverse(differences);
        return differences;
    }

    public static SubLObject declare_janus_file() {
        declareFunction("janus_operation_p", "JANUS-OPERATION-P", 1, 0, false);
        declareFunction("janus_operation_type", "JANUS-OPERATION-TYPE", 1, 0, false);
        declareFunction("janus_create_operation_p", "JANUS-CREATE-OPERATION-P", 1, 0, false);
        declareFunction("janus_assert_operation_p", "JANUS-ASSERT-OPERATION-P", 1, 0, false);
        declareFunction("janus_query_operation_p", "JANUS-QUERY-OPERATION-P", 1, 0, false);
        declareFunction("janus_modification_operation_p", "JANUS-MODIFICATION-OPERATION-P", 1, 0, false);
        declareFunction("new_janus_create_op", "NEW-JANUS-CREATE-OP", 2, 1, false);
        declareFunction("new_janus_deduce_spec", "NEW-JANUS-DEDUCE-SPEC", 4, 0, false);
        declareFunction("new_janus_assert_op", "NEW-JANUS-ASSERT-OP", 6, 1, false);
        declareFunction("new_janus_query_op", "NEW-JANUS-QUERY-OP", 5, 1, false);
        declareFunction("janus_create_op_name", "JANUS-CREATE-OP-NAME", 1, 0, false);
        declareFunction("janus_create_op_external_id", "JANUS-CREATE-OP-EXTERNAL-ID", 1, 0, false);
        declareFunction("janus_create_op_tag", "JANUS-CREATE-OP-TAG", 1, 0, false);
        declareFunction("janus_assert_op_sentence", "JANUS-ASSERT-OP-SENTENCE", 1, 0, false);
        declareFunction("janus_assert_op_mt", "JANUS-ASSERT-OP-MT", 1, 0, false);
        declareFunction("janus_assert_op_strength", "JANUS-ASSERT-OP-STRENGTH", 1, 0, false);
        declareFunction("janus_assert_op_direction", "JANUS-ASSERT-OP-DIRECTION", 1, 0, false);
        declareFunction("janus_assert_op_expected_deduce_specs", "JANUS-ASSERT-OP-EXPECTED-DEDUCE-SPECS", 1, 0, false);
        declareFunction("janus_assert_op_allowed_rules", "JANUS-ASSERT-OP-ALLOWED-RULES", 1, 0, false);
        declareFunction("janus_assert_op_tag", "JANUS-ASSERT-OP-TAG", 1, 0, false);
        declareFunction("janus_query_op_sentence", "JANUS-QUERY-OP-SENTENCE", 1, 0, false);
        declareFunction("janus_query_op_mt", "JANUS-QUERY-OP-MT", 1, 0, false);
        declareFunction("janus_query_op_query_properties", "JANUS-QUERY-OP-QUERY-PROPERTIES", 1, 0, false);
        declareFunction("janus_query_op_expected_result", "JANUS-QUERY-OP-EXPECTED-RESULT", 1, 0, false);
        declareFunction("janus_query_op_expected_halt_reason", "JANUS-QUERY-OP-EXPECTED-HALT-REASON", 1, 0, false);
        declareFunction("janus_query_op_tag", "JANUS-QUERY-OP-TAG", 1, 0, false);
        declareFunction("janus_new_constantP", "JANUS-NEW-CONSTANT?", 1, 0, false);
        declareFunction("janus_dwim_constant", "JANUS-DWIM-CONSTANT", 1, 0, false);
        declareFunction("janus_dwimmed_constant_id", "JANUS-DWIMMED-CONSTANT-ID", 1, 0, false);
        declareFunction("janus_dwimmed_constantP", "JANUS-DWIMMED-CONSTANT?", 1, 0, false);
        declareFunction("janus_dwim_expression", "JANUS-DWIM-EXPRESSION", 1, 0, false);
        declareFunction("set_janus_tag", "SET-JANUS-TAG", 1, 0, false);
        declareFunction("janus_test_case_loggingP", "JANUS-TEST-CASE-LOGGING?", 0, 0, false);
        declareFunction("janus_within_somethingP", "JANUS-WITHIN-SOMETHING?", 0, 0, false);
        declareFunction("janus_transcript_full_filename", "JANUS-TRANSCRIPT-FULL-FILENAME", 1, 0, false);
        declareFunction("save_janus_transcript", "SAVE-JANUS-TRANSCRIPT", 2, 1, false);
        declareFunction("load_janus_transcript", "LOAD-JANUS-TRANSCRIPT", 1, 0, false);
        declareFunction("janus_op_index", "JANUS-OP-INDEX", 2, 0, false);
        declareFunction("janus_op_indices", "JANUS-OP-INDICES", 2, 0, false);
        declareFunction("extract_janus_operations", "EXTRACT-JANUS-OPERATIONS", 1, 0, false);
        declareFunction("janus_note_create_finished", "JANUS-NOTE-CREATE-FINISHED", 1, 0, false);
        declareFunction("janus_note_assert_finished", "JANUS-NOTE-ASSERT-FINISHED", 5, 0, false);
        declareFunction("janus_note_query_finished", "JANUS-NOTE-QUERY-FINISHED", 5, 0, false);
        declareFunction("janus_note_new_continuable_inference", "JANUS-NOTE-NEW-CONTINUABLE-INFERENCE", 3, 0, false);
        declareFunction("janus_note_argument", "JANUS-NOTE-ARGUMENT", 5, 0, false);
        declareFunction("janus_experiment_full_filename", "JANUS-EXPERIMENT-FULL-FILENAME", 1, 0, false);
        declareMacro("run_janus_experiment", "RUN-JANUS-EXPERIMENT");
        declareFunction("janus_test_case_runningP", "JANUS-TEST-CASE-RUNNING?", 0, 0, false);
        declareFunction("execute_janus_operations", "EXECUTE-JANUS-OPERATIONS", 1, 6, false);
        declareFunction("execute_janus_operation", "EXECUTE-JANUS-OPERATION", 1, 4, false);
        declareFunction("execute_janus_create_operations", "EXECUTE-JANUS-CREATE-OPERATIONS", 1, 0, false);
        declareFunction("execute_janus_modification_operation", "EXECUTE-JANUS-MODIFICATION-OPERATION", 1, 0, false);
        declareFunction("kill_janus_constants", "KILL-JANUS-CONSTANTS", 1, 0, false);
        declareFunction("execute_janus_create", "EXECUTE-JANUS-CREATE", 1, 0, false);
        declareFunction("execute_janus_assert", "EXECUTE-JANUS-ASSERT", 1, 0, false);
        declareFunction("dwim_janus_assert_operation", "DWIM-JANUS-ASSERT-OPERATION", 1, 0, false);
        declareFunction("dwim_janus_query_properties", "DWIM-JANUS-QUERY-PROPERTIES", 1, 0, false);
        declareFunction("janus_operation_successP", "JANUS-OPERATION-SUCCESS?", 2, 1, false);
        declareFunction("janus_create_successP", "JANUS-CREATE-SUCCESS?", 2, 0, false);
        declareFunction("janus_assert_successP", "JANUS-ASSERT-SUCCESS?", 2, 0, false);
        declareFunction("janus_query_successP", "JANUS-QUERY-SUCCESS?", 2, 1, false);
        declareFunction("janus_query_result_successP", "JANUS-QUERY-RESULT-SUCCESS?", 2, 0, false);
        declareFunction("load_janus_experiment", "LOAD-JANUS-EXPERIMENT", 1, 0, false);
        declareFunction("janus_experiment_p", "JANUS-EXPERIMENT-P", 1, 0, false);
        declareFunction("janus_failure_analysis", "JANUS-FAILURE-ANALYSIS", 1, 0, false);
        declareFunction("janus_newly_failing_op_failure_reasons", "JANUS-NEWLY-FAILING-OP-FAILURE-REASONS", 2, 0, false);
        declareFunction("janus_categorize_failing_asserts", "JANUS-CATEGORIZE-FAILING-ASSERTS", 1, 0, false);
        declareFunction("janus_categorize_failing_assert", "JANUS-CATEGORIZE-FAILING-ASSERT", 1, 0, false);
        declareFunction("janus_categorize_failing_assert_int", "JANUS-CATEGORIZE-FAILING-ASSERT-INT", 2, 0, false);
        declareFunction("janus_valid_test_set_run", "JANUS-VALID-TEST-SET-RUN", 1, 0, false);
        declareFunction("janus_valid_test_runP", "JANUS-VALID-TEST-RUN?", 1, 0, false);
        declareFunction("janus_more_complete_test_runs", "JANUS-MORE-COMPLETE-TEST-RUNS", 1, 0, false);
        declareFunction("janus_equally_complete_test_runs", "JANUS-EQUALLY-COMPLETE-TEST-RUNS", 1, 0, false);
        declareFunction("janus_less_complete_test_runs", "JANUS-LESS-COMPLETE-TEST-RUNS", 1, 0, false);
        declareFunction("janus_different_test_runs", "JANUS-DIFFERENT-TEST-RUNS", 1, 0, false);
        declareFunction("janus_test_runs_with_assert_failure_status", "JANUS-TEST-RUNS-WITH-ASSERT-FAILURE-STATUS", 2, 0, false);
        declareFunction("janus_test_runs_that_started_failing", "JANUS-TEST-RUNS-THAT-STARTED-FAILING", 2, 0, false);
        declareFunction("janus_test_runs_that_started_succeeding", "JANUS-TEST-RUNS-THAT-STARTED-SUCCEEDING", 2, 0, false);
        declareFunction("janus_test_runs_that_became_status", "JANUS-TEST-RUNS-THAT-BECAME-STATUS", 4, 0, false);
        declareFunction("janus_operations_that_became_status", "JANUS-OPERATIONS-THAT-BECAME-STATUS", 3, 0, false);
        declareFunction("janus_compare_test_set_run_statuses", "JANUS-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_janus_file() {
        $janus_transcript_directory$ = deflexical("*JANUS-TRANSCRIPT-DIRECTORY*", $str9$_cyc_projects_inference_janus_tra);
        $janus_experiment_directory$ = deflexical("*JANUS-EXPERIMENT-DIRECTORY*", $str21$_cyc_projects_inference_janus_exp);
        return NIL;
    }

    public static SubLObject setup_janus_file() {
        utilities_macros.note_funcall_helper_function($sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_janus_file();
    }

    @Override
    public void initializeVariables() {
        init_janus_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_janus_file();
    }

    static {
        me = new janus();
        $janus_transcript_directory$ = null;
        $janus_experiment_directory$ = null;
        $JANUS_OP = makeKeyword("JANUS-OP");
        $CREATE = makeKeyword("CREATE");
        $ASSERT = makeKeyword("ASSERT");
        $QUERY = makeKeyword("QUERY");
        $sym4$JANUS_CREATE_OPERATION_P = makeSymbol("JANUS-CREATE-OPERATION-P");
        $sym5$JANUS_ASSERT_OPERATION_P = makeSymbol("JANUS-ASSERT-OPERATION-P");
        $sym6$JANUS_QUERY_OPERATION_P = makeSymbol("JANUS-QUERY-OPERATION-P");
        $CONST = makeKeyword("CONST");
        $sym8$ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");
        $str9$_cyc_projects_inference_janus_tra = makeString("/cyc/projects/inference/janus/transcripts/");
        $sym10$FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");
        $str11$_s_appears_more_than_once__in_pos = makeString("~s appears more than once, in positions ~s.");
        $sym12$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
        $ALL = makeKeyword("ALL");
        $sym14$INVALID_ASSERTION_ = makeSymbol("INVALID-ASSERTION?");
        $str15$invalid_term_in_assert_op___s__s_ = makeString("invalid term in assert op: ~s ~s ~s");
        $str16$invalid_constant_in_query_op___s_ = makeString("invalid constant in query op: ~s ~s");
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $str18$ignoring_problem_store_reuse_for_ = makeString("ignoring problem store reuse for query ~s ~s ~s");
        $str19$NEW_CONTINUABLE_INFERENCE___s__s_ = makeString("NEW-CONTINUABLE-INFERENCE: ~s ~s ~s~%");
        $DEDUCTION = makeKeyword("DEDUCTION");
        $str21$_cyc_projects_inference_janus_exp = makeString("/cyc/projects/inference/janus/experiments/");
        $list22 = list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("EXPERIMENT-FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-QUERY-METRICS")))),
                list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*ARETE-OUTLIER-TIMEOUT*"))), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT") });
        $list23 = list(makeKeyword("TRANSCRIPT-FILENAME"), makeKeyword("EXPERIMENT-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("SKIP"), makeKeyword("COUNT"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $TRANSCRIPT_FILENAME = makeKeyword("TRANSCRIPT-FILENAME");
        $EXPERIMENT_FILENAME = makeKeyword("EXPERIMENT-FILENAME");
        $COMMENT = makeKeyword("COMMENT");
        $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $METRICS = makeKeyword("METRICS");
        $list30 = list(makeSymbol("ALL-QUERY-METRICS"));
        $OUTLIER_TIMEOUT = makeKeyword("OUTLIER-TIMEOUT");
        $sym32$_ARETE_OUTLIER_TIMEOUT_ = makeSymbol("*ARETE-OUTLIER-TIMEOUT*");
        $SKIP = makeKeyword("SKIP");
        $COUNT = makeKeyword("COUNT");
        $sym35$RUN_KCT_EXPERIMENT = makeSymbol("RUN-KCT-EXPERIMENT");
        $TEST_SPEC_SET = makeKeyword("TEST-SPEC-SET");
        $sym37$QUOTE = makeSymbol("QUOTE");
        $FILENAME = makeKeyword("FILENAME");
        $INCREMENTAL = makeKeyword("INCREMENTAL");
        $OVERRIDING_METRICS = makeKeyword("OVERRIDING-METRICS");
        $int$600 = makeInteger(600);
        $str42$Execution_of_Janus_operation__s_f = makeString("Execution of Janus operation ~s failed.");
        $str43$unknown_modification_operation_ty = makeString("unknown modification operation type ~s");
        $NOT_A_QUERY = makeKeyword("NOT-A-QUERY");
        $STRENGTH = makeKeyword("STRENGTH");
        $DIRECTION = makeKeyword("DIRECTION");
        $list47 = list(new SubLObject[] { makeSymbol("JANUS-OP"), makeSymbol("TYPE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("EXPECTED-DEDUCE-SPECS"), makeSymbol("ALLOWED-RULES"), makeSymbol("TAG") });
        $$termOfUnit = makeConstSym(("termOfUnit"));
        $NAT = makeKeyword("NAT");
        $str50$Janus_operation_of_unexpected_typ = makeString("Janus operation of unexpected type ~s");
        $sym51$LISTP = makeSymbol("LISTP");
        $str52$_s_____s__ = makeString("~s != ~s~%");
        $MORE_COMPLETE = makeKeyword("MORE-COMPLETE");
        $EQUALLY_COMPLETE = makeKeyword("EQUALLY-COMPLETE");
        $LESS_COMPLETE = makeKeyword("LESS-COMPLETE");
        $DIFFERENT = makeKeyword("DIFFERENT");
        $TEST = makeKeyword("TEST");
        $sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT = makeSymbol("JANUS-CATEGORIZE-FAILING-ASSERT-INT");
        $str59$filtered_to_exclude_invalid_forts = makeString("filtered to exclude invalid forts");
        $sym60$JANUS_VALID_TEST_RUN_ = makeSymbol("JANUS-VALID-TEST-RUN?");
        $sym61$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");
        $FAILURE = makeKeyword("FAILURE");
        $BECAME_FAILURE = makeKeyword("BECAME-FAILURE");
        $BECAME_SUCCESS = makeKeyword("BECAME-SUCCESS");
        $CHANGE = makeKeyword("CHANGE");
    }
}
/*
 *
 * Total time: 261 ms
 *
 */