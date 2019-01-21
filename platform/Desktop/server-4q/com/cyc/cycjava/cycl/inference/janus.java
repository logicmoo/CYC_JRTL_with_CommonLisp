package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class janus extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.janus";
    public static final String myFingerPrint = "75641dd2247477f0fee6a04ea8a075a9d47e2a47ae57d5e2052118fdd4d48789";
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 6102L)
    private static SubLSymbol $janus_transcript_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 11341L)
    private static SubLSymbol $janus_experiment_directory$;
    private static final SubLSymbol $kw0$JANUS_OP;
    private static final SubLSymbol $kw1$CREATE;
    private static final SubLSymbol $kw2$ASSERT;
    private static final SubLSymbol $kw3$QUERY;
    private static final SubLSymbol $sym4$JANUS_CREATE_OPERATION_P;
    private static final SubLSymbol $sym5$JANUS_ASSERT_OPERATION_P;
    private static final SubLSymbol $sym6$JANUS_QUERY_OPERATION_P;
    private static final SubLSymbol $kw7$CONST;
    private static final SubLSymbol $sym8$ASSERTION_IST_FORMULA;
    private static final SubLString $str9$_cyc_projects_inference_janus_tra;
    private static final SubLSymbol $sym10$FILE_VALID_FOR_WRITING_P;
    private static final SubLString $str11$_s_appears_more_than_once__in_pos;
    private static final SubLSymbol $sym12$INVALID_CONSTANT_;
    private static final SubLSymbol $kw13$ALL;
    private static final SubLSymbol $sym14$INVALID_ASSERTION_;
    private static final SubLString $str15$invalid_term_in_assert_op___s__s_;
    private static final SubLString $str16$invalid_constant_in_query_op___s_;
    private static final SubLSymbol $kw17$PROBLEM_STORE;
    private static final SubLString $str18$ignoring_problem_store_reuse_for_;
    private static final SubLString $str19$NEW_CONTINUABLE_INFERENCE___s__s_;
    private static final SubLSymbol $kw20$DEDUCTION;
    private static final SubLString $str21$_cyc_projects_inference_janus_exp;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw25$TRANSCRIPT_FILENAME;
    private static final SubLSymbol $kw26$EXPERIMENT_FILENAME;
    private static final SubLSymbol $kw27$COMMENT;
    private static final SubLSymbol $kw28$OVERRIDING_QUERY_PROPERTIES;
    private static final SubLSymbol $kw29$METRICS;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$OUTLIER_TIMEOUT;
    private static final SubLSymbol $sym32$_ARETE_OUTLIER_TIMEOUT_;
    private static final SubLSymbol $kw33$SKIP;
    private static final SubLSymbol $kw34$COUNT;
    private static final SubLSymbol $sym35$RUN_KCT_EXPERIMENT;
    private static final SubLSymbol $kw36$TEST_SPEC_SET;
    private static final SubLSymbol $sym37$QUOTE;
    private static final SubLSymbol $kw38$FILENAME;
    private static final SubLSymbol $kw39$INCREMENTAL;
    private static final SubLSymbol $kw40$OVERRIDING_METRICS;
    private static final SubLInteger $int41$600;
    private static final SubLString $str42$Execution_of_Janus_operation__s_f;
    private static final SubLString $str43$unknown_modification_operation_ty;
    private static final SubLSymbol $kw44$NOT_A_QUERY;
    private static final SubLSymbol $kw45$STRENGTH;
    private static final SubLSymbol $kw46$DIRECTION;
    private static final SubLList $list47;
    private static final SubLObject $const48$termOfUnit;
    private static final SubLSymbol $kw49$NAT;
    private static final SubLString $str50$Janus_operation_of_unexpected_typ;
    private static final SubLSymbol $sym51$LISTP;
    private static final SubLString $str52$_s_____s__;
    private static final SubLSymbol $kw53$MORE_COMPLETE;
    private static final SubLSymbol $kw54$EQUALLY_COMPLETE;
    private static final SubLSymbol $kw55$LESS_COMPLETE;
    private static final SubLSymbol $kw56$DIFFERENT;
    private static final SubLSymbol $kw57$TEST;
    private static final SubLSymbol $sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT;
    private static final SubLString $str59$filtered_to_exclude_invalid_forts;
    private static final SubLSymbol $sym60$JANUS_VALID_TEST_RUN_;
    private static final SubLSymbol $sym61$INVALID_INDEXED_TERM_;
    private static final SubLSymbol $kw62$FAILURE;
    private static final SubLSymbol $kw63$BECAME_FAILURE;
    private static final SubLSymbol $kw64$BECAME_SUCCESS;
    private static final SubLSymbol $kw65$CHANGE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 850L)
    public static SubLObject janus_operation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && janus.$kw0$JANUS_OP == v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 1051L)
    public static SubLObject janus_operation_type(final SubLObject jop) {
        return conses_high.second(jop);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 1116L)
    public static SubLObject janus_create_operation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL != janus_operation_p(v_object) && janus.$kw1$CREATE == janus_operation_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 1258L)
    public static SubLObject janus_assert_operation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL != janus_operation_p(v_object) && janus.$kw2$ASSERT == janus_operation_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 1400L)
    public static SubLObject janus_query_operation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL != janus_operation_p(v_object) && janus.$kw3$QUERY == janus_operation_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 1540L)
    public static SubLObject janus_modification_operation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL != janus_create_operation_p(v_object) || janus.NIL != janus_assert_operation_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 1684L)
    public static SubLObject new_janus_create_op(final SubLObject name, final SubLObject external_id, SubLObject tag) {
        if (tag == janus.UNPROVIDED) {
            tag = control_vars.$janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate((SubLObject)ConsesLow.list((SubLObject)janus.$kw0$JANUS_OP, (SubLObject)janus.$kw1$CREATE, name, external_id, tag));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 1836L)
    public static SubLObject new_janus_deduce_spec(final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)ConsesLow.list(cnf, mt, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 1952L)
    public static SubLObject new_janus_assert_op(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject expected_deduce_specs, final SubLObject allowed_rules, SubLObject tag) {
        if (tag == janus.UNPROVIDED) {
            tag = control_vars.$janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate((SubLObject)ConsesLow.list(new SubLObject[] { janus.$kw0$JANUS_OP, janus.$kw2$ASSERT, sentence, mt, strength, direction, expected_deduce_specs, allowed_rules, tag }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 2204L)
    public static SubLObject new_janus_query_op(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties, final SubLObject expected_result, final SubLObject expected_halt_reason, SubLObject tag) {
        if (tag == janus.UNPROVIDED) {
            tag = control_vars.$janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate((SubLObject)ConsesLow.list((SubLObject)janus.$kw0$JANUS_OP, (SubLObject)janus.$kw3$QUERY, sentence, mt, query_properties, expected_result, expected_halt_reason, tag));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 2452L)
    public static SubLObject janus_create_op_name(final SubLObject create_jop) {
        assert janus.NIL != janus_create_operation_p(create_jop) : create_jop;
        return encapsulation.unencapsulate_partial(conses_high.third(create_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 2605L)
    public static SubLObject janus_create_op_external_id(final SubLObject create_jop) {
        assert janus.NIL != janus_create_operation_p(create_jop) : create_jop;
        return encapsulation.unencapsulate_partial(conses_high.fourth(create_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 2766L)
    public static SubLObject janus_create_op_tag(final SubLObject create_jop) {
        assert janus.NIL != janus_create_operation_p(create_jop) : create_jop;
        return encapsulation.unencapsulate_partial(conses_high.fifth(create_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 2918L)
    public static SubLObject janus_assert_op_sentence(final SubLObject assert_jop) {
        assert janus.NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.third(assert_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 3075L)
    public static SubLObject janus_assert_op_mt(final SubLObject assert_jop) {
        assert janus.NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.fourth(assert_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 3227L)
    public static SubLObject janus_assert_op_strength(final SubLObject assert_jop) {
        assert janus.NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.fifth(assert_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 3384L)
    public static SubLObject janus_assert_op_direction(final SubLObject assert_jop) {
        assert janus.NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.sixth(assert_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 3542L)
    public static SubLObject janus_assert_op_expected_deduce_specs(final SubLObject assert_jop) {
        assert janus.NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.seventh(assert_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 3714L)
    public static SubLObject janus_assert_op_allowed_rules(final SubLObject assert_jop) {
        assert janus.NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.eighth(assert_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 3877L)
    public static SubLObject janus_assert_op_tag(final SubLObject assert_jop) {
        assert janus.NIL != janus_assert_operation_p(assert_jop) : assert_jop;
        return encapsulation.unencapsulate_partial(conses_high.ninth(assert_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 4029L)
    public static SubLObject janus_query_op_sentence(final SubLObject query_jop) {
        assert janus.NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.third(query_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 4181L)
    public static SubLObject janus_query_op_mt(final SubLObject query_jop) {
        assert janus.NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.fourth(query_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 4328L)
    public static SubLObject janus_query_op_query_properties(final SubLObject query_jop) {
        assert janus.NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.fifth(query_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 4488L)
    public static SubLObject janus_query_op_expected_result(final SubLObject query_jop) {
        assert janus.NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.sixth(query_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 4647L)
    public static SubLObject janus_query_op_expected_halt_reason(final SubLObject query_jop) {
        assert janus.NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.seventh(query_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 4813L)
    public static SubLObject janus_query_op_tag(final SubLObject query_jop) {
        assert janus.NIL != janus_query_operation_p(query_jop) : query_jop;
        return encapsulation.unencapsulate_partial(conses_high.eighth(query_jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 4961L)
    public static SubLObject janus_new_constantP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL != constant_handles.constant_p(v_object) && janus.NIL != subl_promotions.memberP(v_object, control_vars.$janus_new_constants$.getDynamicValue(thread), (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 5114L)
    public static SubLObject janus_dwim_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject position = Sequences.position(constant, control_vars.$janus_new_constants$.getDynamicValue(thread), (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)janus.$kw7$CONST, position);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 5260L)
    public static SubLObject janus_dwimmed_constant_id(final SubLObject constant) {
        return conses_high.second(janus_dwim_constant(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 5363L)
    public static SubLObject janus_dwimmed_constantP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL != list_utilities.doubletonP(v_object) && janus.$kw7$CONST == v_object.first() && janus.NIL != subl_promotions.non_negative_integer_p(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 5529L)
    public static SubLObject janus_dwim_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dwimmed_expression = (SubLObject)janus.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
        try {
            czer_vars.$assertion_key$.bind((SubLObject)janus.$sym8$ASSERTION_IST_FORMULA, thread);
            dwimmed_expression = cycl_utilities.hl_to_el(expression);
        }
        finally {
            czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
        }
        return dwimmed_expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 5837L)
    public static SubLObject set_janus_tag(final SubLObject tag) {
        control_vars.$janus_tag$.setDynamicValue(tag);
        return tag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 5938L)
    public static SubLObject janus_test_case_loggingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$janus_test_case_loggingP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 6021L)
    public static SubLObject janus_within_somethingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$janus_within_somethingP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 6202L)
    public static SubLObject janus_transcript_full_filename(final SubLObject filename) {
        return arete.arete_experiment_full_filename(filename, janus.$janus_transcript_directory$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 6343L)
    public static SubLObject save_janus_transcript(SubLObject filename, final SubLObject form, SubLObject internalP) {
        if (internalP == janus.UNPROVIDED) {
            internalP = (SubLObject)janus.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        filename = janus_transcript_full_filename(filename);
        assert janus.NIL != file_utilities.file_valid_for_writing_p(filename) : filename;
        thread.resetMultipleValues();
        final SubLObject jops = extract_janus_operations(form);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (janus.NIL != internalP) {
            cfasl_utilities.cfasl_save(jops, filename);
        }
        else {
            cfasl_utilities.cfasl_save_externalized(jops, filename);
        }
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 6850L)
    public static SubLObject load_janus_transcript(SubLObject filename) {
        filename = janus_transcript_full_filename(filename);
        return cfasl_utilities.cfasl_load(filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 7049L)
    public static SubLObject janus_op_index(final SubLObject jops, final SubLObject jop) {
        final SubLObject indices = janus_op_indices(jops, jop);
        final SubLObject index = indices.first();
        if (janus.NIL != list_utilities.lengthG(indices, (SubLObject)janus.ONE_INTEGER, (SubLObject)janus.UNPROVIDED)) {
            Errors.warn((SubLObject)janus.$str11$_s_appears_more_than_once__in_pos, jop, indices);
        }
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 7508L)
    public static SubLObject janus_op_indices(final SubLObject jops, final SubLObject jop) {
        SubLObject indices = (SubLObject)janus.NIL;
        SubLObject list_var = (SubLObject)janus.NIL;
        SubLObject candidate_jop = (SubLObject)janus.NIL;
        SubLObject index = (SubLObject)janus.NIL;
        list_var = jops;
        candidate_jop = list_var.first();
        for (index = (SubLObject)janus.ZERO_INTEGER; janus.NIL != list_var; list_var = list_var.rest(), candidate_jop = list_var.first(), index = Numbers.add((SubLObject)janus.ONE_INTEGER, index)) {
            if (jop.equalp(candidate_jop)) {
                indices = (SubLObject)ConsesLow.cons(index, indices);
            }
        }
        return Sequences.nreverse(indices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 7804L)
    public static SubLObject extract_janus_operations(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject jops = (SubLObject)janus.NIL;
        SubLObject time = (SubLObject)janus.NIL;
        final SubLObject _prev_bind_0 = control_vars.$janus_test_case_loggingP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$janus_new_constants$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$janus_operations$.currentBinding(thread);
        try {
            control_vars.$janus_test_case_loggingP$.bind((SubLObject)janus.T, thread);
            control_vars.$janus_new_constants$.bind((SubLObject)janus.NIL, thread);
            control_vars.$janus_operations$.bind((SubLObject)janus.NIL, thread);
            final SubLObject time_var = Time.get_internal_real_time();
            final SubLObject _prev_bind_0_$1 = control_vars.$read_require_constant_exists$.currentBinding(thread);
            try {
                control_vars.$read_require_constant_exists$.bind((SubLObject)janus.NIL, thread);
                Eval.eval(form);
            }
            finally {
                control_vars.$read_require_constant_exists$.rebind(_prev_bind_0_$1, thread);
            }
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            jops = Sequences.nreverse(control_vars.$janus_operations$.getDynamicValue(thread));
        }
        finally {
            control_vars.$janus_operations$.rebind(_prev_bind_3, thread);
            control_vars.$janus_new_constants$.rebind(_prev_bind_2, thread);
            control_vars.$janus_test_case_loggingP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(jops, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 8223L)
    public static SubLObject janus_note_create_finished(final SubLObject new_constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (janus.NIL != janus_test_case_loggingP() && janus.NIL != constant_handles.valid_constantP(new_constant, (SubLObject)janus.UNPROVIDED)) {
            final SubLObject new_cons = (SubLObject)ConsesLow.cons(new_constant, (SubLObject)janus.NIL);
            final SubLObject list = control_vars.$janus_new_constants$.getDynamicValue(thread);
            if (janus.NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            }
            else {
                control_vars.$janus_new_constants$.setDynamicValue(new_cons, thread);
            }
            final SubLObject name = constants_high.constant_name(new_constant);
            final SubLObject external_id = constants_high.constant_external_id(new_constant);
            control_vars.$janus_operations$.setDynamicValue((SubLObject)ConsesLow.cons(new_janus_create_op(name, external_id, (SubLObject)janus.UNPROVIDED), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
            return (SubLObject)janus.T;
        }
        return (SubLObject)janus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 8752L)
    public static SubLObject janus_note_assert_finished(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject deduce_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (janus.NIL == janus_test_case_loggingP() || janus.NIL != janus_within_somethingP()) {
            return (SubLObject)janus.NIL;
        }
        deduce_specs = janus_dwim_expression(deduce_specs);
        final SubLObject allowed_rules = kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
        if (janus.NIL != cycl_utilities.expression_find_if((SubLObject)janus.$sym12$INVALID_CONSTANT_, sentence, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED) || janus.NIL != cycl_utilities.expression_find_if((SubLObject)janus.$sym12$INVALID_CONSTANT_, mt, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED) || janus.NIL != cycl_utilities.expression_find_if((SubLObject)janus.$sym12$INVALID_CONSTANT_, deduce_specs, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED) || janus.NIL != ((janus.$kw13$ALL == allowed_rules) ? janus.NIL : Sequences.find_if((SubLObject)janus.$sym14$INVALID_ASSERTION_, allowed_rules, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED))) {
            Errors.warn((SubLObject)janus.$str15$invalid_term_in_assert_op___s__s_, new SubLObject[] { sentence, mt, deduce_specs, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread) });
            return (SubLObject)janus.NIL;
        }
        control_vars.$janus_operations$.setDynamicValue((SubLObject)ConsesLow.cons(new_janus_assert_op(sentence, mt, strength, direction, deduce_specs, allowed_rules, (SubLObject)janus.UNPROVIDED), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
        return (SubLObject)janus.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 9573L)
    public static SubLObject janus_note_query_finished(final SubLObject sentence, final SubLObject mt, SubLObject query_properties, SubLObject result, final SubLObject halt_reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (janus.NIL != janus_test_case_loggingP() && janus.NIL == janus_within_somethingP()) {
            result = janus_dwim_expression(result);
            if (janus.NIL != cycl_utilities.expression_find_if((SubLObject)janus.$sym12$INVALID_CONSTANT_, sentence, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED) || janus.NIL != cycl_utilities.expression_find_if((SubLObject)janus.$sym12$INVALID_CONSTANT_, mt, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED)) {
                Errors.warn((SubLObject)janus.$str16$invalid_constant_in_query_op___s_, sentence, mt);
                return (SubLObject)janus.NIL;
            }
            if (janus.NIL != conses_high.getf(query_properties, (SubLObject)janus.$kw17$PROBLEM_STORE, (SubLObject)janus.UNPROVIDED)) {
                Errors.warn((SubLObject)janus.$str18$ignoring_problem_store_reuse_for_, sentence, mt, query_properties);
                query_properties = conses_high.remf(conses_high.copy_list(query_properties), (SubLObject)janus.$kw17$PROBLEM_STORE);
            }
            control_vars.$janus_operations$.setDynamicValue((SubLObject)ConsesLow.cons(new_janus_query_op(sentence, mt, query_properties, result, halt_reason, (SubLObject)janus.UNPROVIDED), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)janus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 10363L)
    public static SubLObject janus_note_new_continuable_inference(final SubLObject sentence, final SubLObject mt, final SubLObject query_static_properties) {
        if (janus.NIL != janus_test_case_loggingP() && janus.NIL == janus_within_somethingP()) {
            Errors.warn((SubLObject)janus.$str19$NEW_CONTINUABLE_INFERENCE___s__s_, sentence, mt, query_static_properties);
            return (SubLObject)janus.T;
        }
        return (SubLObject)janus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 10663L)
    public static SubLObject janus_note_argument(final SubLObject argument_spec, SubLObject cnf, SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (janus.NIL != janus_test_case_loggingP() || janus.NIL != janus_test_case_runningP()) {
            cnf = janus_dwim_expression(cnf);
            mt = janus_dwim_expression(mt);
            if (janus.$kw20$DEDUCTION == arguments.argument_spec_type(argument_spec)) {
                if (janus.NIL != janus_test_case_runningP()) {
                    control_vars.$janus_testing_deduce_specs$.setDynamicValue((SubLObject)ConsesLow.cons(new_janus_deduce_spec(cnf, mt, direction, variable_map), control_vars.$janus_testing_deduce_specs$.getDynamicValue(thread)), thread);
                }
                else {
                    control_vars.$janus_extraction_deduce_specs$.setDynamicValue((SubLObject)ConsesLow.cons(new_janus_deduce_spec(cnf, mt, direction, variable_map), control_vars.$janus_extraction_deduce_specs$.getDynamicValue(thread)), thread);
                }
                return (SubLObject)janus.T;
            }
        }
        return (SubLObject)janus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 11465L)
    public static SubLObject janus_experiment_full_filename(final SubLObject filename) {
        return arete.arete_experiment_full_filename(filename, janus.$janus_experiment_directory$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 11606L)
    public static SubLObject run_janus_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)janus.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)janus.NIL;
        SubLObject current_$2 = (SubLObject)janus.NIL;
        while (janus.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)janus.$list22);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)janus.$list22);
            if (janus.NIL == conses_high.member(current_$2, (SubLObject)janus.$list23, (SubLObject)janus.UNPROVIDED, (SubLObject)janus.UNPROVIDED)) {
                bad = (SubLObject)janus.T;
            }
            if (current_$2 == janus.$kw24$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (janus.NIL != bad && janus.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)janus.$list22);
        }
        final SubLObject transcript_filename_tail = cdestructuring_bind.property_list_member((SubLObject)janus.$kw25$TRANSCRIPT_FILENAME, current);
        final SubLObject transcript_filename = (SubLObject)((janus.NIL != transcript_filename_tail) ? conses_high.cadr(transcript_filename_tail) : janus.NIL);
        final SubLObject experiment_filename_tail = cdestructuring_bind.property_list_member((SubLObject)janus.$kw26$EXPERIMENT_FILENAME, current);
        final SubLObject experiment_filename = (SubLObject)((janus.NIL != experiment_filename_tail) ? conses_high.cadr(experiment_filename_tail) : janus.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)janus.$kw27$COMMENT, current);
        final SubLObject comment = (SubLObject)((janus.NIL != comment_tail) ? conses_high.cadr(comment_tail) : janus.NIL);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)janus.$kw28$OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (SubLObject)((janus.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : janus.NIL);
        final SubLObject metrics_tail = cdestructuring_bind.property_list_member((SubLObject)janus.$kw29$METRICS, current);
        final SubLObject metrics = (SubLObject)((janus.NIL != metrics_tail) ? conses_high.cadr(metrics_tail) : janus.$list30);
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)janus.$kw31$OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (SubLObject)((janus.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : janus.$sym32$_ARETE_OUTLIER_TIMEOUT_);
        final SubLObject skip_tail = cdestructuring_bind.property_list_member((SubLObject)janus.$kw33$SKIP, current);
        final SubLObject skip = (SubLObject)((janus.NIL != skip_tail) ? conses_high.cadr(skip_tail) : janus.ZERO_INTEGER);
        final SubLObject count_tail = cdestructuring_bind.property_list_member((SubLObject)janus.$kw34$COUNT, current);
        final SubLObject count = (SubLObject)((janus.NIL != count_tail) ? conses_high.cadr(count_tail) : janus.NIL);
        final SubLObject jops = load_janus_transcript(transcript_filename);
        final SubLObject experiment_full_filename = janus_experiment_full_filename(experiment_filename);
        return (SubLObject)ConsesLow.list(new SubLObject[] { janus.$sym35$RUN_KCT_EXPERIMENT, janus.$kw36$TEST_SPEC_SET, ConsesLow.list((SubLObject)janus.$sym37$QUOTE, jops), janus.$kw38$FILENAME, experiment_full_filename, janus.$kw27$COMMENT, comment, janus.$kw39$INCREMENTAL, janus.T, janus.$kw28$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, janus.$kw40$OVERRIDING_METRICS, metrics, janus.$kw31$OUTLIER_TIMEOUT, outlier_timeout, janus.$kw33$SKIP, skip, janus.$kw34$COUNT, count });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 12289L)
    public static SubLObject janus_test_case_runningP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$janus_test_case_runningP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 12372L)
    public static SubLObject execute_janus_operations(final SubLObject jops, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP, SubLObject start, SubLObject end) {
        if (metrics == janus.UNPROVIDED) {
            metrics = (SubLObject)janus.NIL;
        }
        if (outlier_timeout == janus.UNPROVIDED) {
            outlier_timeout = (SubLObject)janus.$int41$600;
        }
        if (overriding_query_properties == janus.UNPROVIDED) {
            overriding_query_properties = (SubLObject)janus.NIL;
        }
        if (include_resultP == janus.UNPROVIDED) {
            include_resultP = (SubLObject)janus.NIL;
        }
        if (start == janus.UNPROVIDED) {
            start = (SubLObject)janus.ZERO_INTEGER;
        }
        if (end == janus.UNPROVIDED) {
            end = (SubLObject)janus.NIL;
        }
        SubLObject count = (SubLObject)janus.ZERO_INTEGER;
        final SubLObject overall_result = (SubLObject)janus.NIL;
        SubLObject list_var = (SubLObject)janus.NIL;
        SubLObject jop = (SubLObject)janus.NIL;
        SubLObject index = (SubLObject)janus.NIL;
        list_var = jops;
        jop = list_var.first();
        for (index = (SubLObject)janus.ZERO_INTEGER; janus.NIL != list_var; list_var = list_var.rest(), jop = list_var.first(), index = Numbers.add((SubLObject)janus.ONE_INTEGER, index)) {
            if (index.numGE(start) && (janus.NIL == end || index.numLE(end))) {
                final SubLObject jop_result = execute_janus_operation(jop, metrics, outlier_timeout, overriding_query_properties, include_resultP);
                count = Numbers.add(count, (SubLObject)janus.ONE_INTEGER);
            }
        }
        return Values.values(overall_result, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 12887L)
    public static SubLObject execute_janus_operation(final SubLObject jop, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP) {
        if (metrics == janus.UNPROVIDED) {
            metrics = (SubLObject)janus.NIL;
        }
        if (outlier_timeout == janus.UNPROVIDED) {
            outlier_timeout = (SubLObject)janus.$int41$600;
        }
        if (overriding_query_properties == janus.UNPROVIDED) {
            overriding_query_properties = (SubLObject)janus.NIL;
        }
        if (include_resultP == janus.UNPROVIDED) {
            include_resultP = (SubLObject)janus.NIL;
        }
        return kbq_query_run.kbq_run_query(jop, metrics, outlier_timeout, overriding_query_properties, include_resultP, (SubLObject)janus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 13114L)
    public static SubLObject execute_janus_create_operations(final SubLObject jops) {
        SubLObject count = (SubLObject)janus.ZERO_INTEGER;
        SubLObject cdolist_list_var = jops;
        SubLObject jop = (SubLObject)janus.NIL;
        jop = cdolist_list_var.first();
        while (janus.NIL != cdolist_list_var) {
            if (janus.NIL != janus_create_operation_p(jop)) {
                if (janus.NIL != execute_janus_create(jop)) {
                    count = Numbers.add(count, (SubLObject)janus.ONE_INTEGER);
                }
                else {
                    Errors.warn((SubLObject)janus.$str42$Execution_of_Janus_operation__s_f, jop);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 13389L)
    public static SubLObject execute_janus_modification_operation(final SubLObject jop) {
        final SubLObject pcase_var = janus_operation_type(jop);
        if (pcase_var.eql((SubLObject)janus.$kw1$CREATE)) {
            return execute_janus_create(jop);
        }
        if (pcase_var.eql((SubLObject)janus.$kw2$ASSERT)) {
            return execute_janus_assert(jop);
        }
        return Errors.error((SubLObject)janus.$str43$unknown_modification_operation_ty, janus_operation_type(jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 13748L)
    public static SubLObject kill_janus_constants(final SubLObject jops) {
        SubLObject count = (SubLObject)janus.ZERO_INTEGER;
        SubLObject cdolist_list_var = jops;
        SubLObject jop = (SubLObject)janus.NIL;
        jop = cdolist_list_var.first();
        while (janus.NIL != cdolist_list_var) {
            if (janus.$kw1$CREATE == janus_operation_type(jop)) {
                final SubLObject external_id = janus_create_op_external_id(jop);
                if (janus.NIL != constants_high.constant_external_id_p(external_id)) {
                    final SubLObject v_const = constants_high.find_constant_by_external_id(external_id);
                    if (janus.NIL != constant_handles.constant_p(v_const)) {
                        cyc_kernel.cyc_kill(v_const);
                        count = Numbers.add(count, (SubLObject)janus.ONE_INTEGER);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 14151L)
    public static SubLObject execute_janus_create(final SubLObject jop) {
        assert janus.NIL != janus_create_operation_p(jop) : jop;
        final SubLObject name = janus_create_op_name(jop);
        final SubLObject external_id = janus_create_op_external_id(jop);
        final SubLObject result = cyc_kernel.cyc_create(name, external_id);
        return Values.values(result, (SubLObject)janus.$kw44$NOT_A_QUERY, (SubLObject)janus.NIL, (SubLObject)janus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 14606L)
    public static SubLObject execute_janus_assert(SubLObject jop) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert janus.NIL != janus_assert_operation_p(jop) : jop;
        jop = dwim_janus_assert_operation(jop);
        final SubLObject sentence = janus_assert_op_sentence(jop);
        final SubLObject mt = janus_assert_op_mt(jop);
        final SubLObject strength = janus_assert_op_strength(jop);
        final SubLObject direction = janus_assert_op_direction(jop);
        final SubLObject allowed_rules = janus_assert_op_allowed_rules(jop);
        SubLObject deduce_specs = (SubLObject)janus.NIL;
        final SubLObject _prev_bind_0 = control_vars.$janus_test_case_runningP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$janus_testing_deduce_specs$.currentBinding(thread);
        try {
            control_vars.$janus_test_case_runningP$.bind((SubLObject)janus.T, thread);
            control_vars.$janus_testing_deduce_specs$.bind((SubLObject)janus.NIL, thread);
            final SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(allowed_rules, thread);
                cyc_kernel.cyc_assert(sentence, mt, (SubLObject)ConsesLow.list((SubLObject)janus.$kw45$STRENGTH, strength, (SubLObject)janus.$kw46$DIRECTION, direction));
            }
            finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$3, thread);
            }
            deduce_specs = control_vars.$janus_testing_deduce_specs$.getDynamicValue(thread);
        }
        finally {
            control_vars.$janus_testing_deduce_specs$.rebind(_prev_bind_2, thread);
            control_vars.$janus_test_case_runningP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(deduce_specs, (SubLObject)janus.$kw44$NOT_A_QUERY, (SubLObject)janus.NIL, (SubLObject)janus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 15562L)
    public static SubLObject dwim_janus_assert_operation(SubLObject jop) {
        SubLObject current;
        final SubLObject datum = current = jop;
        SubLObject janus_op = (SubLObject)janus.NIL;
        SubLObject type = (SubLObject)janus.NIL;
        SubLObject sentence = (SubLObject)janus.NIL;
        SubLObject mt = (SubLObject)janus.NIL;
        SubLObject strength = (SubLObject)janus.NIL;
        SubLObject direction = (SubLObject)janus.NIL;
        SubLObject expected_deduce_specs = (SubLObject)janus.NIL;
        SubLObject allowed_rules = (SubLObject)janus.NIL;
        SubLObject tag = (SubLObject)janus.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        janus_op = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        strength = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        expected_deduce_specs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        allowed_rules = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)janus.$list47);
        tag = current.first();
        current = current.rest();
        if (janus.NIL == current) {
            if (janus.NIL != list_utilities.tree_find(constants_high.constant_external_id(janus.$const48$termOfUnit), sentence, Symbols.symbol_function((SubLObject)janus.EQUALP), (SubLObject)janus.UNPROVIDED)) {
                final SubLObject unencapsulated_sentence = encapsulation.unencapsulate_partial(sentence);
                if (janus.NIL != el_utilities.el_formula_with_operator_p(unencapsulated_sentence, janus.$const48$termOfUnit)) {
                    final SubLObject nat = cycl_utilities.formula_arg1(unencapsulated_sentence, (SubLObject)janus.UNPROVIDED);
                    if (janus.NIL != list_utilities.doubletonP(nat) && janus.$kw49$NAT.equal(nat.first())) {
                        final SubLObject naut = conses_high.second(nat);
                        sentence = el_utilities.replace_formula_arg((SubLObject)janus.ONE_INTEGER, naut, sentence);
                        jop = new_janus_assert_op(sentence, mt, strength, direction, expected_deduce_specs, allowed_rules, tag);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)janus.$list47);
        }
        return jop;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 16352L)
    public static SubLObject dwim_janus_query_properties(final SubLObject v_properties) {
        return v_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 16432L)
    public static SubLObject janus_operation_successP(final SubLObject jop, SubLObject result, SubLObject halt_reason) {
        if (halt_reason == janus.UNPROVIDED) {
            halt_reason = (SubLObject)janus.NIL;
        }
        result = janus_dwim_expression(result);
        final SubLObject pcase_var = janus_operation_type(jop);
        if (pcase_var.eql((SubLObject)janus.$kw1$CREATE)) {
            return janus_create_successP(jop, result);
        }
        if (pcase_var.eql((SubLObject)janus.$kw2$ASSERT)) {
            return janus_assert_successP(jop, result);
        }
        if (pcase_var.eql((SubLObject)janus.$kw3$QUERY)) {
            return janus_query_successP(jop, result, halt_reason);
        }
        return Errors.error((SubLObject)janus.$str50$Janus_operation_of_unexpected_typ, janus_operation_type(jop));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 16889L)
    public static SubLObject janus_create_successP(final SubLObject jop, final SubLObject result) {
        return list_utilities.sublisp_boolean(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 16982L)
    public static SubLObject janus_assert_successP(final SubLObject jop, final SubLObject deduce_specs) {
        assert janus.NIL != Types.listp(deduce_specs) : deduce_specs;
        final SubLObject expected_deduce_specs = janus_assert_op_expected_deduce_specs(jop);
        final SubLObject successP = list_utilities.sets_equalP(deduce_specs, expected_deduce_specs, Symbols.symbol_function((SubLObject)janus.EQUALP));
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 17357L)
    public static SubLObject janus_query_successP(final SubLObject jop, final SubLObject result, SubLObject halt_reason) {
        if (halt_reason == janus.UNPROVIDED) {
            halt_reason = (SubLObject)janus.NIL;
        }
        final SubLObject expected_result = janus_query_op_expected_result(jop);
        final SubLObject expected_halt_reason = janus_query_op_expected_halt_reason(jop);
        final SubLObject result_successP = janus_query_result_successP(result, expected_result);
        final SubLObject halt_reason_successP = (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL == halt_reason || halt_reason.equal(expected_halt_reason));
        final SubLObject successP = (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL != result_successP && janus.NIL != halt_reason_successP);
        if (janus.NIL == result_successP) {
            PrintLow.format((SubLObject)janus.T, (SubLObject)janus.$str52$_s_____s__, result, expected_result);
        }
        if (janus.NIL == halt_reason_successP) {
            PrintLow.format((SubLObject)janus.T, (SubLObject)janus.$str52$_s_____s__, halt_reason, expected_halt_reason);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 18005L)
    public static SubLObject janus_query_result_successP(final SubLObject result, final SubLObject expected_result) {
        if (janus.NIL != bindings.binding_lists_p(result)) {
            return bindings.lists_of_binding_lists_equalP(result, expected_result);
        }
        return list_utilities.sets_equal_equalP(result, expected_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 18233L)
    public static SubLObject load_janus_experiment(final SubLObject filename) {
        final SubLObject full_filename = janus_experiment_full_filename(filename);
        return kbq_query_run.kct_load_test_set_run(full_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 19937L)
    public static SubLObject janus_experiment_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL != kbq_query_run.kct_test_set_run_p(v_object) && janus.NIL != janus_operation_p(kbq_query_run.kct_test_run_test(kbq_query_run.kct_test_set_run_test_runs(v_object).first())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 20115L)
    public static SubLObject janus_failure_analysis(final SubLObject test_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject more_complete = janus_categorize_failing_asserts(test_set_run);
        final SubLObject equally_complete = thread.secondMultipleValue();
        final SubLObject less_complete = thread.thirdMultipleValue();
        final SubLObject different = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)janus.$kw53$MORE_COMPLETE, Sequences.length(more_complete), (SubLObject)janus.$kw54$EQUALLY_COMPLETE, Sequences.length(equally_complete), (SubLObject)janus.$kw55$LESS_COMPLETE, Sequences.length(less_complete), (SubLObject)janus.$kw56$DIFFERENT, Sequences.length(different));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 20513L)
    public static SubLObject janus_newly_failing_op_failure_reasons(final SubLObject baseline, final SubLObject experiment) {
        SubLObject failure_reasons = (SubLObject)janus.NIL;
        SubLObject cdolist_list_var = kbq_query_run.kct_compare_test_set_run_statuses(baseline, experiment);
        SubLObject diff = (SubLObject)janus.NIL;
        diff = cdolist_list_var.first();
        while (janus.NIL != cdolist_list_var) {
            final SubLObject test = conses_high.getf(diff, (SubLObject)janus.$kw57$TEST, (SubLObject)janus.UNPROVIDED);
            final SubLObject baseline_test_run = kbq_query_run.kct_lookup_test_run(baseline, test);
            final SubLObject baseline_result = kbq_query_run.kbq_query_run_result(kbq_query_run.kct_test_run_query_run(baseline_test_run));
            final SubLObject experiment_test_run = kbq_query_run.kct_lookup_test_run(experiment, test);
            final SubLObject experiment_result = kbq_query_run.kbq_query_run_result(kbq_query_run.kct_test_run_query_run(experiment_test_run));
            failure_reasons = (SubLObject)ConsesLow.cons(janus_categorize_failing_assert_int(baseline_result, experiment_result), failure_reasons);
            cdolist_list_var = cdolist_list_var.rest();
            diff = cdolist_list_var.first();
        }
        return Sequences.nreverse(failure_reasons);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 21195L)
    public static SubLObject janus_categorize_failing_asserts(final SubLObject test_set_run) {
        SubLObject more_complete = (SubLObject)janus.NIL;
        SubLObject equally_complete = (SubLObject)janus.NIL;
        SubLObject less_complete = (SubLObject)janus.NIL;
        SubLObject different = (SubLObject)janus.NIL;
        SubLObject cdolist_list_var;
        final SubLObject test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs(kbq_query_run.kct_failing_test_set_run(test_set_run));
        SubLObject test_run = (SubLObject)janus.NIL;
        test_run = cdolist_list_var.first();
        while (janus.NIL != cdolist_list_var) {
            if (janus.NIL != janus_assert_operation_p(kbq_query_run.kct_test_run_test(test_run))) {
                final SubLObject pcase_var = janus_categorize_failing_assert(test_run);
                if (pcase_var.eql((SubLObject)janus.$kw53$MORE_COMPLETE)) {
                    more_complete = (SubLObject)ConsesLow.cons(test_run, more_complete);
                }
                else if (pcase_var.eql((SubLObject)janus.$kw54$EQUALLY_COMPLETE)) {
                    equally_complete = (SubLObject)ConsesLow.cons(test_run, equally_complete);
                }
                else if (pcase_var.eql((SubLObject)janus.$kw55$LESS_COMPLETE)) {
                    less_complete = (SubLObject)ConsesLow.cons(test_run, less_complete);
                }
                else if (pcase_var.eql((SubLObject)janus.$kw56$DIFFERENT)) {
                    different = (SubLObject)ConsesLow.cons(test_run, different);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return Values.values(more_complete, equally_complete, less_complete, different);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 22162L)
    public static SubLObject janus_categorize_failing_assert(final SubLObject test_run) {
        final SubLObject jop = kbq_query_run.kct_test_run_test(test_run);
        final SubLObject expected_deduce_specs = janus_assert_op_expected_deduce_specs(jop);
        final SubLObject query_run = kbq_query_run.kct_test_run_query_run(test_run);
        final SubLObject actual_deduce_specs = kbq_query_run.kbq_query_run_result(query_run);
        return janus_categorize_failing_assert_int(expected_deduce_specs, actual_deduce_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 22561L)
    public static SubLObject janus_categorize_failing_assert_int(final SubLObject baseline_deduce_specs, final SubLObject experiment_deduce_specs) {
        if (janus.NIL != list_utilities.sets_equalP(baseline_deduce_specs, experiment_deduce_specs, Symbols.symbol_function((SubLObject)janus.EQUALP))) {
            return (SubLObject)janus.$kw54$EQUALLY_COMPLETE;
        }
        if (janus.NIL != conses_high.subsetp(baseline_deduce_specs, experiment_deduce_specs, Symbols.symbol_function((SubLObject)janus.EQUALP), (SubLObject)janus.UNPROVIDED)) {
            return (SubLObject)janus.$kw53$MORE_COMPLETE;
        }
        if (janus.NIL != conses_high.subsetp(experiment_deduce_specs, baseline_deduce_specs, Symbols.symbol_function((SubLObject)janus.EQUALP), (SubLObject)janus.UNPROVIDED)) {
            return (SubLObject)janus.$kw55$LESS_COMPLETE;
        }
        return (SubLObject)janus.$kw56$DIFFERENT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 23133L)
    public static SubLObject janus_valid_test_set_run(final SubLObject test_set_run) {
        return kbq_query_run.kct_filter_test_set_run_by_test(test_set_run, (SubLObject)janus.$str59$filtered_to_exclude_invalid_forts, (SubLObject)janus.$sym60$JANUS_VALID_TEST_RUN_, (SubLObject)janus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 23454L)
    public static SubLObject janus_valid_test_runP(final SubLObject test_run) {
        return (SubLObject)SubLObjectFactory.makeBoolean(janus.NIL == list_utilities.tree_find_if((SubLObject)janus.$sym61$INVALID_INDEXED_TERM_, test_run, (SubLObject)janus.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 23567L)
    public static SubLObject janus_more_complete_test_runs(final SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, (SubLObject)janus.$kw53$MORE_COMPLETE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 23713L)
    public static SubLObject janus_equally_complete_test_runs(final SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, (SubLObject)janus.$kw54$EQUALLY_COMPLETE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 23865L)
    public static SubLObject janus_less_complete_test_runs(final SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, (SubLObject)janus.$kw55$LESS_COMPLETE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 24011L)
    public static SubLObject janus_different_test_runs(final SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, (SubLObject)janus.$kw56$DIFFERENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 24149L)
    public static SubLObject janus_test_runs_with_assert_failure_status(final SubLObject test_set_run, final SubLObject assert_failure_status) {
        SubLObject result_test_runs = (SubLObject)janus.NIL;
        SubLObject cdolist_list_var;
        final SubLObject test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = (SubLObject)janus.NIL;
        test_run = cdolist_list_var.first();
        while (janus.NIL != cdolist_list_var) {
            if (janus.$kw62$FAILURE == kbq_query_run.kct_test_run_status(test_run) && janus.NIL != janus_assert_operation_p(kbq_query_run.kct_test_run_test(test_run)) && assert_failure_status.eql(janus_categorize_failing_assert(test_run))) {
                result_test_runs = (SubLObject)ConsesLow.cons(test_run, result_test_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(result_test_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 24667L)
    public static SubLObject janus_test_runs_that_started_failing(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        return janus_test_runs_that_became_status(test_set_run_1, test_set_run_2, (SubLObject)janus.$kw63$BECAME_FAILURE, (SubLObject)janus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 24961L)
    public static SubLObject janus_test_runs_that_started_succeeding(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        return janus_test_runs_that_became_status(test_set_run_1, test_set_run_2, (SubLObject)janus.$kw64$BECAME_SUCCESS, (SubLObject)janus.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 25256L)
    public static SubLObject janus_test_runs_that_became_status(final SubLObject test_set_run_1, final SubLObject test_set_run_2, final SubLObject status, final SubLObject use_run_1P) {
        SubLObject test_runs = (SubLObject)janus.NIL;
        SubLObject cdolist_list_var;
        final SubLObject jops = cdolist_list_var = janus_operations_that_became_status(test_set_run_1, test_set_run_2, status);
        SubLObject jop = (SubLObject)janus.NIL;
        jop = cdolist_list_var.first();
        while (janus.NIL != cdolist_list_var) {
            final SubLObject test_run = kbq_query_run.kct_lookup_test_run((janus.NIL != use_run_1P) ? test_set_run_1 : test_set_run_2, jop);
            test_runs = (SubLObject)ConsesLow.cons(test_run, test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        }
        return Sequences.nreverse(test_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 25662L)
    public static SubLObject janus_operations_that_became_status(final SubLObject test_set_run_1, final SubLObject test_set_run_2, final SubLObject status) {
        SubLObject jops = (SubLObject)janus.NIL;
        SubLObject cdolist_list_var;
        final SubLObject differences = cdolist_list_var = kbq_query_run.kct_compare_test_set_run_statuses(test_set_run_1, test_set_run_2);
        SubLObject diff = (SubLObject)janus.NIL;
        diff = cdolist_list_var.first();
        while (janus.NIL != cdolist_list_var) {
            if (status.eql(conses_high.getf(diff, (SubLObject)janus.$kw65$CHANGE, (SubLObject)janus.UNPROVIDED))) {
                final SubLObject jop = conses_high.getf(diff, (SubLObject)janus.$kw57$TEST, (SubLObject)janus.UNPROVIDED);
                jops = (SubLObject)ConsesLow.cons(jop, jops);
            }
            cdolist_list_var = cdolist_list_var.rest();
            diff = cdolist_list_var.first();
        }
        return Sequences.nreverse(jops);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus.lisp", position = 26029L)
    public static SubLObject janus_compare_test_set_run_statuses(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        SubLObject differences = (SubLObject)janus.NIL;
        SubLObject test_run_1 = (SubLObject)janus.NIL;
        SubLObject test_run_1_$4 = (SubLObject)janus.NIL;
        SubLObject test_run_2 = (SubLObject)janus.NIL;
        SubLObject test_run_2_$5 = (SubLObject)janus.NIL;
        test_run_1 = kbq_query_run.kct_test_set_run_test_runs(test_set_run_1);
        test_run_1_$4 = test_run_1.first();
        test_run_2 = kbq_query_run.kct_test_set_run_test_runs(test_set_run_2);
        test_run_2_$5 = test_run_2.first();
        while (janus.NIL != test_run_2 || janus.NIL != test_run_1) {
            final SubLObject test = kbq_query_run.kct_test_run_test(test_run_1_$4);
            if (janus.NIL != test_run_1_$4 && janus.NIL != test_run_2_$5) {
                final SubLObject difference = kbq_query_run.kct_compare_test_run_statuses(test_run_1_$4, test_run_2_$5);
                if (janus.NIL != difference) {
                    differences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)janus.$kw57$TEST, test, (SubLObject)janus.$kw65$CHANGE, difference), differences);
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
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_operation_p", "JANUS-OPERATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_operation_type", "JANUS-OPERATION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_create_operation_p", "JANUS-CREATE-OPERATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_operation_p", "JANUS-ASSERT-OPERATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_operation_p", "JANUS-QUERY-OPERATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_modification_operation_p", "JANUS-MODIFICATION-OPERATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "new_janus_create_op", "NEW-JANUS-CREATE-OP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "new_janus_deduce_spec", "NEW-JANUS-DEDUCE-SPEC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "new_janus_assert_op", "NEW-JANUS-ASSERT-OP", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "new_janus_query_op", "NEW-JANUS-QUERY-OP", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_create_op_name", "JANUS-CREATE-OP-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_create_op_external_id", "JANUS-CREATE-OP-EXTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_create_op_tag", "JANUS-CREATE-OP-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_op_sentence", "JANUS-ASSERT-OP-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_op_mt", "JANUS-ASSERT-OP-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_op_strength", "JANUS-ASSERT-OP-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_op_direction", "JANUS-ASSERT-OP-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_op_expected_deduce_specs", "JANUS-ASSERT-OP-EXPECTED-DEDUCE-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_op_allowed_rules", "JANUS-ASSERT-OP-ALLOWED-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_op_tag", "JANUS-ASSERT-OP-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_op_sentence", "JANUS-QUERY-OP-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_op_mt", "JANUS-QUERY-OP-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_op_query_properties", "JANUS-QUERY-OP-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_op_expected_result", "JANUS-QUERY-OP-EXPECTED-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_op_expected_halt_reason", "JANUS-QUERY-OP-EXPECTED-HALT-REASON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_op_tag", "JANUS-QUERY-OP-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_new_constantP", "JANUS-NEW-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_dwim_constant", "JANUS-DWIM-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_dwimmed_constant_id", "JANUS-DWIMMED-CONSTANT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_dwimmed_constantP", "JANUS-DWIMMED-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_dwim_expression", "JANUS-DWIM-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "set_janus_tag", "SET-JANUS-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_test_case_loggingP", "JANUS-TEST-CASE-LOGGING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_within_somethingP", "JANUS-WITHIN-SOMETHING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_transcript_full_filename", "JANUS-TRANSCRIPT-FULL-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "save_janus_transcript", "SAVE-JANUS-TRANSCRIPT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "load_janus_transcript", "LOAD-JANUS-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_op_index", "JANUS-OP-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_op_indices", "JANUS-OP-INDICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "extract_janus_operations", "EXTRACT-JANUS-OPERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_note_create_finished", "JANUS-NOTE-CREATE-FINISHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_note_assert_finished", "JANUS-NOTE-ASSERT-FINISHED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_note_query_finished", "JANUS-NOTE-QUERY-FINISHED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_note_new_continuable_inference", "JANUS-NOTE-NEW-CONTINUABLE-INFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_note_argument", "JANUS-NOTE-ARGUMENT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_experiment_full_filename", "JANUS-EXPERIMENT-FULL-FILENAME", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.janus", "run_janus_experiment", "RUN-JANUS-EXPERIMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_test_case_runningP", "JANUS-TEST-CASE-RUNNING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "execute_janus_operations", "EXECUTE-JANUS-OPERATIONS", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "execute_janus_operation", "EXECUTE-JANUS-OPERATION", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "execute_janus_create_operations", "EXECUTE-JANUS-CREATE-OPERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "execute_janus_modification_operation", "EXECUTE-JANUS-MODIFICATION-OPERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "kill_janus_constants", "KILL-JANUS-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "execute_janus_create", "EXECUTE-JANUS-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "execute_janus_assert", "EXECUTE-JANUS-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "dwim_janus_assert_operation", "DWIM-JANUS-ASSERT-OPERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "dwim_janus_query_properties", "DWIM-JANUS-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_operation_successP", "JANUS-OPERATION-SUCCESS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_create_successP", "JANUS-CREATE-SUCCESS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_assert_successP", "JANUS-ASSERT-SUCCESS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_successP", "JANUS-QUERY-SUCCESS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_query_result_successP", "JANUS-QUERY-RESULT-SUCCESS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "load_janus_experiment", "LOAD-JANUS-EXPERIMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_experiment_p", "JANUS-EXPERIMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_failure_analysis", "JANUS-FAILURE-ANALYSIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_newly_failing_op_failure_reasons", "JANUS-NEWLY-FAILING-OP-FAILURE-REASONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_categorize_failing_asserts", "JANUS-CATEGORIZE-FAILING-ASSERTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_categorize_failing_assert", "JANUS-CATEGORIZE-FAILING-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_categorize_failing_assert_int", "JANUS-CATEGORIZE-FAILING-ASSERT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_valid_test_set_run", "JANUS-VALID-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_valid_test_runP", "JANUS-VALID-TEST-RUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_more_complete_test_runs", "JANUS-MORE-COMPLETE-TEST-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_equally_complete_test_runs", "JANUS-EQUALLY-COMPLETE-TEST-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_less_complete_test_runs", "JANUS-LESS-COMPLETE-TEST-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_different_test_runs", "JANUS-DIFFERENT-TEST-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_test_runs_with_assert_failure_status", "JANUS-TEST-RUNS-WITH-ASSERT-FAILURE-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_test_runs_that_started_failing", "JANUS-TEST-RUNS-THAT-STARTED-FAILING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_test_runs_that_started_succeeding", "JANUS-TEST-RUNS-THAT-STARTED-SUCCEEDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_test_runs_that_became_status", "JANUS-TEST-RUNS-THAT-BECAME-STATUS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_operations_that_became_status", "JANUS-OPERATIONS-THAT-BECAME-STATUS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.janus", "janus_compare_test_set_run_statuses", "JANUS-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
        return (SubLObject)janus.NIL;
    }
    
    public static SubLObject init_janus_file() {
        janus.$janus_transcript_directory$ = SubLFiles.deflexical("*JANUS-TRANSCRIPT-DIRECTORY*", (SubLObject)janus.$str9$_cyc_projects_inference_janus_tra);
        janus.$janus_experiment_directory$ = SubLFiles.deflexical("*JANUS-EXPERIMENT-DIRECTORY*", (SubLObject)janus.$str21$_cyc_projects_inference_janus_exp);
        return (SubLObject)janus.NIL;
    }
    
    public static SubLObject setup_janus_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)janus.$sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT);
        return (SubLObject)janus.NIL;
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
        me = (SubLFile)new janus();
        janus.$janus_transcript_directory$ = null;
        janus.$janus_experiment_directory$ = null;
        $kw0$JANUS_OP = SubLObjectFactory.makeKeyword("JANUS-OP");
        $kw1$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $kw2$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $kw3$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $sym4$JANUS_CREATE_OPERATION_P = SubLObjectFactory.makeSymbol("JANUS-CREATE-OPERATION-P");
        $sym5$JANUS_ASSERT_OPERATION_P = SubLObjectFactory.makeSymbol("JANUS-ASSERT-OPERATION-P");
        $sym6$JANUS_QUERY_OPERATION_P = SubLObjectFactory.makeSymbol("JANUS-QUERY-OPERATION-P");
        $kw7$CONST = SubLObjectFactory.makeKeyword("CONST");
        $sym8$ASSERTION_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-IST-FORMULA");
        $str9$_cyc_projects_inference_janus_tra = SubLObjectFactory.makeString("/cyc/projects/inference/janus/transcripts/");
        $sym10$FILE_VALID_FOR_WRITING_P = SubLObjectFactory.makeSymbol("FILE-VALID-FOR-WRITING-P");
        $str11$_s_appears_more_than_once__in_pos = SubLObjectFactory.makeString("~s appears more than once, in positions ~s.");
        $sym12$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $kw13$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym14$INVALID_ASSERTION_ = SubLObjectFactory.makeSymbol("INVALID-ASSERTION?");
        $str15$invalid_term_in_assert_op___s__s_ = SubLObjectFactory.makeString("invalid term in assert op: ~s ~s ~s");
        $str16$invalid_constant_in_query_op___s_ = SubLObjectFactory.makeString("invalid constant in query op: ~s ~s");
        $kw17$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $str18$ignoring_problem_store_reuse_for_ = SubLObjectFactory.makeString("ignoring problem store reuse for query ~s ~s ~s");
        $str19$NEW_CONTINUABLE_INFERENCE___s__s_ = SubLObjectFactory.makeString("NEW-CONTINUABLE-INFERENCE: ~s ~s ~s~%");
        $kw20$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $str21$_cyc_projects_inference_janus_exp = SubLObjectFactory.makeString("/cyc/projects/inference/janus/experiments/");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("TRANSCRIPT-FILENAME"), SubLObjectFactory.makeSymbol("EXPERIMENT-FILENAME"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("OVERRIDING-QUERY-PROPERTIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METRICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-QUERY-METRICS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTLIER-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*ARETE-OUTLIER-TIMEOUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP"), (SubLObject)janus.ZERO_INTEGER), SubLObjectFactory.makeSymbol("COUNT") });
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSCRIPT-FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("EXPERIMENT-FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("METRICS"), (SubLObject)SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT"));
        $kw24$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw25$TRANSCRIPT_FILENAME = SubLObjectFactory.makeKeyword("TRANSCRIPT-FILENAME");
        $kw26$EXPERIMENT_FILENAME = SubLObjectFactory.makeKeyword("EXPERIMENT-FILENAME");
        $kw27$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw28$OVERRIDING_QUERY_PROPERTIES = SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $kw29$METRICS = SubLObjectFactory.makeKeyword("METRICS");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-QUERY-METRICS"));
        $kw31$OUTLIER_TIMEOUT = SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT");
        $sym32$_ARETE_OUTLIER_TIMEOUT_ = SubLObjectFactory.makeSymbol("*ARETE-OUTLIER-TIMEOUT*");
        $kw33$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw34$COUNT = SubLObjectFactory.makeKeyword("COUNT");
        $sym35$RUN_KCT_EXPERIMENT = SubLObjectFactory.makeSymbol("RUN-KCT-EXPERIMENT");
        $kw36$TEST_SPEC_SET = SubLObjectFactory.makeKeyword("TEST-SPEC-SET");
        $sym37$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw38$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $kw39$INCREMENTAL = SubLObjectFactory.makeKeyword("INCREMENTAL");
        $kw40$OVERRIDING_METRICS = SubLObjectFactory.makeKeyword("OVERRIDING-METRICS");
        $int41$600 = SubLObjectFactory.makeInteger(600);
        $str42$Execution_of_Janus_operation__s_f = SubLObjectFactory.makeString("Execution of Janus operation ~s failed.");
        $str43$unknown_modification_operation_ty = SubLObjectFactory.makeString("unknown modification operation type ~s");
        $kw44$NOT_A_QUERY = SubLObjectFactory.makeKeyword("NOT-A-QUERY");
        $kw45$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw46$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $list47 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("JANUS-OP"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("STRENGTH"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("EXPECTED-DEDUCE-SPECS"), SubLObjectFactory.makeSymbol("ALLOWED-RULES"), SubLObjectFactory.makeSymbol("TAG") });
        $const48$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $kw49$NAT = SubLObjectFactory.makeKeyword("NAT");
        $str50$Janus_operation_of_unexpected_typ = SubLObjectFactory.makeString("Janus operation of unexpected type ~s");
        $sym51$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str52$_s_____s__ = SubLObjectFactory.makeString("~s != ~s~%");
        $kw53$MORE_COMPLETE = SubLObjectFactory.makeKeyword("MORE-COMPLETE");
        $kw54$EQUALLY_COMPLETE = SubLObjectFactory.makeKeyword("EQUALLY-COMPLETE");
        $kw55$LESS_COMPLETE = SubLObjectFactory.makeKeyword("LESS-COMPLETE");
        $kw56$DIFFERENT = SubLObjectFactory.makeKeyword("DIFFERENT");
        $kw57$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT = SubLObjectFactory.makeSymbol("JANUS-CATEGORIZE-FAILING-ASSERT-INT");
        $str59$filtered_to_exclude_invalid_forts = SubLObjectFactory.makeString("filtered to exclude invalid forts");
        $sym60$JANUS_VALID_TEST_RUN_ = SubLObjectFactory.makeSymbol("JANUS-VALID-TEST-RUN?");
        $sym61$INVALID_INDEXED_TERM_ = SubLObjectFactory.makeSymbol("INVALID-INDEXED-TERM?");
        $kw62$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw63$BECAME_FAILURE = SubLObjectFactory.makeKeyword("BECAME-FAILURE");
        $kw64$BECAME_SUCCESS = SubLObjectFactory.makeKeyword("BECAME-SUCCESS");
        $kw65$CHANGE = SubLObjectFactory.makeKeyword("CHANGE");
    }
}

/*

	Total time: 261 ms
	
*/