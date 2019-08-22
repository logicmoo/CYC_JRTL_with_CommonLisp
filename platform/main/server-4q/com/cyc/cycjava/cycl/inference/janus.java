package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$janus_extraction_deduce_specs$;
import static com.cyc.cycjava.cycl.control_vars.$janus_new_constants$;
import static com.cyc.cycjava.cycl.control_vars.$janus_operations$;
import static com.cyc.cycjava.cycl.control_vars.$janus_tag$;
import static com.cyc.cycjava.cycl.control_vars.$janus_test_case_loggingP$;
import static com.cyc.cycjava.cycl.control_vars.$janus_test_case_runningP$;
import static com.cyc.cycjava.cycl.control_vars.$janus_testing_deduce_specs$;
import static com.cyc.cycjava.cycl.control_vars.$janus_within_somethingP$;
import static com.cyc.cycjava.cycl.control_vars.$read_require_constant_exists$;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.eighth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.ninth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.seventh;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class janus extends SubLTranslatedFile {
    public static final SubLFile me = new janus();

    public static final String myName = "com.cyc.cycjava.cycl.inference.janus";

    public static final String myFingerPrint = "75641dd2247477f0fee6a04ea8a075a9d47e2a47ae57d5e2052118fdd4d48789";

    // deflexical
    private static final SubLSymbol $janus_transcript_directory$ = makeSymbol("*JANUS-TRANSCRIPT-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $janus_experiment_directory$ = makeSymbol("*JANUS-EXPERIMENT-DIRECTORY*");









    public static final SubLSymbol JANUS_CREATE_OPERATION_P = makeSymbol("JANUS-CREATE-OPERATION-P");

    public static final SubLSymbol JANUS_ASSERT_OPERATION_P = makeSymbol("JANUS-ASSERT-OPERATION-P");

    public static final SubLSymbol JANUS_QUERY_OPERATION_P = makeSymbol("JANUS-QUERY-OPERATION-P");



    public static final SubLSymbol ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");

    public static final SubLString $str9$_cyc_projects_inference_janus_tra = makeString("/cyc/projects/inference/janus/transcripts/");

    public static final SubLSymbol FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");

    public static final SubLString $str11$_s_appears_more_than_once__in_pos = makeString("~s appears more than once, in positions ~s.");

    public static final SubLSymbol $sym12$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");



    public static final SubLSymbol $sym14$INVALID_ASSERTION_ = makeSymbol("INVALID-ASSERTION?");

    public static final SubLString $str15$invalid_term_in_assert_op___s__s_ = makeString("invalid term in assert op: ~s ~s ~s");

    public static final SubLString $str16$invalid_constant_in_query_op___s_ = makeString("invalid constant in query op: ~s ~s");



    public static final SubLString $str18$ignoring_problem_store_reuse_for_ = makeString("ignoring problem store reuse for query ~s ~s ~s");

    public static final SubLString $str19$NEW_CONTINUABLE_INFERENCE___s__s_ = makeString("NEW-CONTINUABLE-INFERENCE: ~s ~s ~s~%");



    public static final SubLString $str21$_cyc_projects_inference_janus_exp = makeString("/cyc/projects/inference/janus/experiments/");

    public static final SubLList $list22 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("EXPERIMENT-FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*ARETE-OUTLIER-TIMEOUT*"))), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT") });

    public static final SubLList $list23 = list(makeKeyword("TRANSCRIPT-FILENAME"), makeKeyword("EXPERIMENT-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("SKIP"), makeKeyword("COUNT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    private static final SubLSymbol $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");



    public static final SubLList $list30 = list(makeSymbol("ALL-QUERY-METRICS"));



    public static final SubLSymbol $arete_outlier_timeout$ = makeSymbol("*ARETE-OUTLIER-TIMEOUT*");





    public static final SubLSymbol RUN_KCT_EXPERIMENT = makeSymbol("RUN-KCT-EXPERIMENT");

    private static final SubLSymbol $TEST_SPEC_SET = makeKeyword("TEST-SPEC-SET");









    private static final SubLInteger $int$600 = makeInteger(600);

    public static final SubLString $str42$Execution_of_Janus_operation__s_f = makeString("Execution of Janus operation ~s failed.");

    public static final SubLString $str43$unknown_modification_operation_ty = makeString("unknown modification operation type ~s");

    private static final SubLSymbol $NOT_A_QUERY = makeKeyword("NOT-A-QUERY");





    public static final SubLList $list47 = list(new SubLObject[]{ makeSymbol("JANUS-OP"), makeSymbol("TYPE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("EXPECTED-DEDUCE-SPECS"), makeSymbol("ALLOWED-RULES"), makeSymbol("TAG") });

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));



    public static final SubLString $str50$Janus_operation_of_unexpected_typ = makeString("Janus operation of unexpected type ~s");



    public static final SubLString $str52$_s_____s__ = makeString("~s != ~s~%");











    public static final SubLSymbol JANUS_CATEGORIZE_FAILING_ASSERT_INT = makeSymbol("JANUS-CATEGORIZE-FAILING-ASSERT-INT");

    public static final SubLString $$$filtered_to_exclude_invalid_forts = makeString("filtered to exclude invalid forts");

    public static final SubLSymbol $sym60$JANUS_VALID_TEST_RUN_ = makeSymbol("JANUS-VALID-TEST-RUN?");

    public static final SubLSymbol $sym61$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");









    public static SubLObject janus_operation_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && ($JANUS_OP == v_object.first()));
    }

    public static SubLObject janus_operation_type(final SubLObject jop) {
        return second(jop);
    }

    public static SubLObject janus_create_operation_p(final SubLObject v_object) {
        return makeBoolean((NIL != janus_operation_p(v_object)) && ($CREATE == janus_operation_type(v_object)));
    }

    public static SubLObject janus_assert_operation_p(final SubLObject v_object) {
        return makeBoolean((NIL != janus_operation_p(v_object)) && ($ASSERT == janus_operation_type(v_object)));
    }

    public static SubLObject janus_query_operation_p(final SubLObject v_object) {
        return makeBoolean((NIL != janus_operation_p(v_object)) && ($QUERY == janus_operation_type(v_object)));
    }

    public static SubLObject janus_modification_operation_p(final SubLObject v_object) {
        return makeBoolean((NIL != janus_create_operation_p(v_object)) || (NIL != janus_assert_operation_p(v_object)));
    }

    public static SubLObject new_janus_create_op(final SubLObject name, final SubLObject external_id, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = $janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate(list($JANUS_OP, $CREATE, name, external_id, tag));
    }

    public static SubLObject new_janus_deduce_spec(final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return list(cnf, mt, direction, variable_map);
    }

    public static SubLObject new_janus_assert_op(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject expected_deduce_specs, final SubLObject allowed_rules, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = $janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate(list(new SubLObject[]{ $JANUS_OP, $ASSERT, sentence, mt, strength, direction, expected_deduce_specs, allowed_rules, tag }));
    }

    public static SubLObject new_janus_query_op(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties, final SubLObject expected_result, final SubLObject expected_halt_reason, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = $janus_tag$.getDynamicValue();
        }
        return encapsulation.encapsulate(list($JANUS_OP, $QUERY, sentence, mt, query_properties, expected_result, expected_halt_reason, tag));
    }

    public static SubLObject janus_create_op_name(final SubLObject create_jop) {
        assert NIL != janus_create_operation_p(create_jop) : "janus.janus_create_operation_p(create_jop) " + "CommonSymbols.NIL != janus.janus_create_operation_p(create_jop) " + create_jop;
        return encapsulation.unencapsulate_partial(third(create_jop));
    }

    public static SubLObject janus_create_op_external_id(final SubLObject create_jop) {
        assert NIL != janus_create_operation_p(create_jop) : "janus.janus_create_operation_p(create_jop) " + "CommonSymbols.NIL != janus.janus_create_operation_p(create_jop) " + create_jop;
        return encapsulation.unencapsulate_partial(fourth(create_jop));
    }

    public static SubLObject janus_create_op_tag(final SubLObject create_jop) {
        assert NIL != janus_create_operation_p(create_jop) : "janus.janus_create_operation_p(create_jop) " + "CommonSymbols.NIL != janus.janus_create_operation_p(create_jop) " + create_jop;
        return encapsulation.unencapsulate_partial(fifth(create_jop));
    }

    public static SubLObject janus_assert_op_sentence(final SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : "janus.janus_assert_operation_p(assert_jop) " + "CommonSymbols.NIL != janus.janus_assert_operation_p(assert_jop) " + assert_jop;
        return encapsulation.unencapsulate_partial(third(assert_jop));
    }

    public static SubLObject janus_assert_op_mt(final SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : "janus.janus_assert_operation_p(assert_jop) " + "CommonSymbols.NIL != janus.janus_assert_operation_p(assert_jop) " + assert_jop;
        return encapsulation.unencapsulate_partial(fourth(assert_jop));
    }

    public static SubLObject janus_assert_op_strength(final SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : "janus.janus_assert_operation_p(assert_jop) " + "CommonSymbols.NIL != janus.janus_assert_operation_p(assert_jop) " + assert_jop;
        return encapsulation.unencapsulate_partial(fifth(assert_jop));
    }

    public static SubLObject janus_assert_op_direction(final SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : "janus.janus_assert_operation_p(assert_jop) " + "CommonSymbols.NIL != janus.janus_assert_operation_p(assert_jop) " + assert_jop;
        return encapsulation.unencapsulate_partial(sixth(assert_jop));
    }

    public static SubLObject janus_assert_op_expected_deduce_specs(final SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : "janus.janus_assert_operation_p(assert_jop) " + "CommonSymbols.NIL != janus.janus_assert_operation_p(assert_jop) " + assert_jop;
        return encapsulation.unencapsulate_partial(seventh(assert_jop));
    }

    public static SubLObject janus_assert_op_allowed_rules(final SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : "janus.janus_assert_operation_p(assert_jop) " + "CommonSymbols.NIL != janus.janus_assert_operation_p(assert_jop) " + assert_jop;
        return encapsulation.unencapsulate_partial(eighth(assert_jop));
    }

    public static SubLObject janus_assert_op_tag(final SubLObject assert_jop) {
        assert NIL != janus_assert_operation_p(assert_jop) : "janus.janus_assert_operation_p(assert_jop) " + "CommonSymbols.NIL != janus.janus_assert_operation_p(assert_jop) " + assert_jop;
        return encapsulation.unencapsulate_partial(ninth(assert_jop));
    }

    public static SubLObject janus_query_op_sentence(final SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : "janus.janus_query_operation_p(query_jop) " + "CommonSymbols.NIL != janus.janus_query_operation_p(query_jop) " + query_jop;
        return encapsulation.unencapsulate_partial(third(query_jop));
    }

    public static SubLObject janus_query_op_mt(final SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : "janus.janus_query_operation_p(query_jop) " + "CommonSymbols.NIL != janus.janus_query_operation_p(query_jop) " + query_jop;
        return encapsulation.unencapsulate_partial(fourth(query_jop));
    }

    public static SubLObject janus_query_op_query_properties(final SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : "janus.janus_query_operation_p(query_jop) " + "CommonSymbols.NIL != janus.janus_query_operation_p(query_jop) " + query_jop;
        return encapsulation.unencapsulate_partial(fifth(query_jop));
    }

    public static SubLObject janus_query_op_expected_result(final SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : "janus.janus_query_operation_p(query_jop) " + "CommonSymbols.NIL != janus.janus_query_operation_p(query_jop) " + query_jop;
        return encapsulation.unencapsulate_partial(sixth(query_jop));
    }

    public static SubLObject janus_query_op_expected_halt_reason(final SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : "janus.janus_query_operation_p(query_jop) " + "CommonSymbols.NIL != janus.janus_query_operation_p(query_jop) " + query_jop;
        return encapsulation.unencapsulate_partial(seventh(query_jop));
    }

    public static SubLObject janus_query_op_tag(final SubLObject query_jop) {
        assert NIL != janus_query_operation_p(query_jop) : "janus.janus_query_operation_p(query_jop) " + "CommonSymbols.NIL != janus.janus_query_operation_p(query_jop) " + query_jop;
        return encapsulation.unencapsulate_partial(eighth(query_jop));
    }

    public static SubLObject janus_new_constantP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != subl_promotions.memberP(v_object, $janus_new_constants$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject janus_dwim_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject position = position(constant, $janus_new_constants$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list($CONST, position);
    }

    public static SubLObject janus_dwimmed_constant_id(final SubLObject constant) {
        return second(janus_dwim_constant(constant));
    }

    public static SubLObject janus_dwimmed_constantP(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && ($CONST == v_object.first())) && (NIL != subl_promotions.non_negative_integer_p(second(v_object))));
    }

    public static SubLObject janus_dwim_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dwimmed_expression = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
        try {
            czer_vars.$assertion_key$.bind(ASSERTION_IST_FORMULA, thread);
            dwimmed_expression = cycl_utilities.hl_to_el(expression);
        } finally {
            czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
        }
        return dwimmed_expression;
    }

    public static SubLObject set_janus_tag(final SubLObject tag) {
        $janus_tag$.setDynamicValue(tag);
        return tag;
    }

    public static SubLObject janus_test_case_loggingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $janus_test_case_loggingP$.getDynamicValue(thread);
    }

    public static SubLObject janus_within_somethingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $janus_within_somethingP$.getDynamicValue(thread);
    }

    public static SubLObject janus_transcript_full_filename(final SubLObject filename) {
        return arete.arete_experiment_full_filename(filename, $janus_transcript_directory$.getGlobalValue());
    }

    public static SubLObject save_janus_transcript(SubLObject filename, final SubLObject form, SubLObject internalP) {
        if (internalP == UNPROVIDED) {
            internalP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        filename = janus_transcript_full_filename(filename);
        assert NIL != file_utilities.file_valid_for_writing_p(filename) : "file_utilities.file_valid_for_writing_p(filename) " + "CommonSymbols.NIL != file_utilities.file_valid_for_writing_p(filename) " + filename;
        thread.resetMultipleValues();
        final SubLObject jops = extract_janus_operations(form);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != internalP) {
            cfasl_utilities.cfasl_save(jops, filename);
        } else {
            cfasl_utilities.cfasl_save_externalized(jops, filename);
        }
        return time;
    }

    public static SubLObject load_janus_transcript(SubLObject filename) {
        filename = janus_transcript_full_filename(filename);
        return cfasl_utilities.cfasl_load(filename);
    }

    public static SubLObject janus_op_index(final SubLObject jops, final SubLObject jop) {
        final SubLObject indices = janus_op_indices(jops, jop);
        final SubLObject index = indices.first();
        if (NIL != list_utilities.lengthG(indices, ONE_INTEGER, UNPROVIDED)) {
            Errors.warn($str11$_s_appears_more_than_once__in_pos, jop, indices);
        }
        return index;
    }

    public static SubLObject janus_op_indices(final SubLObject jops, final SubLObject jop) {
        SubLObject indices = NIL;
        SubLObject list_var = NIL;
        SubLObject candidate_jop = NIL;
        SubLObject index = NIL;
        list_var = jops;
        candidate_jop = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , candidate_jop = list_var.first() , index = add(ONE_INTEGER, index)) {
            if (jop.equalp(candidate_jop)) {
                indices = cons(index, indices);
            }
        }
        return nreverse(indices);
    }

    public static SubLObject extract_janus_operations(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject jops = NIL;
        SubLObject time = NIL;
        final SubLObject _prev_bind_0 = $janus_test_case_loggingP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $janus_new_constants$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $janus_operations$.currentBinding(thread);
        try {
            $janus_test_case_loggingP$.bind(T, thread);
            $janus_new_constants$.bind(NIL, thread);
            $janus_operations$.bind(NIL, thread);
            final SubLObject time_var = get_internal_real_time();
            final SubLObject _prev_bind_0_$1 = $read_require_constant_exists$.currentBinding(thread);
            try {
                $read_require_constant_exists$.bind(NIL, thread);
                eval(form);
            } finally {
                $read_require_constant_exists$.rebind(_prev_bind_0_$1, thread);
            }
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            jops = nreverse($janus_operations$.getDynamicValue(thread));
        } finally {
            $janus_operations$.rebind(_prev_bind_3, thread);
            $janus_new_constants$.rebind(_prev_bind_2, thread);
            $janus_test_case_loggingP$.rebind(_prev_bind_0, thread);
        }
        return values(jops, time);
    }

    public static SubLObject janus_note_create_finished(final SubLObject new_constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != janus_test_case_loggingP()) && (NIL != valid_constantP(new_constant, UNPROVIDED))) {
            final SubLObject new_cons = cons(new_constant, NIL);
            final SubLObject list = $janus_new_constants$.getDynamicValue(thread);
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                $janus_new_constants$.setDynamicValue(new_cons, thread);
            }
            final SubLObject name = constants_high.constant_name(new_constant);
            final SubLObject external_id = constants_high.constant_external_id(new_constant);
            $janus_operations$.setDynamicValue(cons(new_janus_create_op(name, external_id, UNPROVIDED), $janus_operations$.getDynamicValue(thread)), thread);
            return T;
        }
        return NIL;
    }

    public static SubLObject janus_note_assert_finished(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject deduce_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == janus_test_case_loggingP()) || (NIL != janus_within_somethingP())) {
            return NIL;
        }
        deduce_specs = janus_dwim_expression(deduce_specs);
        final SubLObject allowed_rules = kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
        if ((((NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, sentence, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, mt, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, deduce_specs, UNPROVIDED, UNPROVIDED))) || (NIL != ($ALL == allowed_rules ? NIL : find_if($sym14$INVALID_ASSERTION_, allowed_rules, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
            Errors.warn($str15$invalid_term_in_assert_op___s__s_, new SubLObject[]{ sentence, mt, deduce_specs, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread) });
            return NIL;
        }
        $janus_operations$.setDynamicValue(cons(new_janus_assert_op(sentence, mt, strength, direction, deduce_specs, allowed_rules, UNPROVIDED), $janus_operations$.getDynamicValue(thread)), thread);
        return T;
    }

    public static SubLObject janus_note_query_finished(final SubLObject sentence, final SubLObject mt, SubLObject query_properties, SubLObject result, final SubLObject halt_reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != janus_test_case_loggingP()) && (NIL == janus_within_somethingP())) {
            result = janus_dwim_expression(result);
            if ((NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, sentence, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, mt, UNPROVIDED, UNPROVIDED))) {
                Errors.warn($str16$invalid_constant_in_query_op___s_, sentence, mt);
                return NIL;
            }
            if (NIL != getf(query_properties, $PROBLEM_STORE, UNPROVIDED)) {
                Errors.warn($str18$ignoring_problem_store_reuse_for_, sentence, mt, query_properties);
                query_properties = remf(copy_list(query_properties), $PROBLEM_STORE);
            }
            $janus_operations$.setDynamicValue(cons(new_janus_query_op(sentence, mt, query_properties, result, halt_reason, UNPROVIDED), $janus_operations$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject janus_note_new_continuable_inference(final SubLObject sentence, final SubLObject mt, final SubLObject query_static_properties) {
        if ((NIL != janus_test_case_loggingP()) && (NIL == janus_within_somethingP())) {
            Errors.warn($str19$NEW_CONTINUABLE_INFERENCE___s__s_, sentence, mt, query_static_properties);
            return T;
        }
        return NIL;
    }

    public static SubLObject janus_note_argument(final SubLObject argument_spec, SubLObject cnf, SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != janus_test_case_loggingP()) || (NIL != janus_test_case_runningP())) {
            cnf = janus_dwim_expression(cnf);
            mt = janus_dwim_expression(mt);
            if ($DEDUCTION == arguments.argument_spec_type(argument_spec)) {
                if (NIL != janus_test_case_runningP()) {
                    $janus_testing_deduce_specs$.setDynamicValue(cons(new_janus_deduce_spec(cnf, mt, direction, variable_map), $janus_testing_deduce_specs$.getDynamicValue(thread)), thread);
                } else {
                    $janus_extraction_deduce_specs$.setDynamicValue(cons(new_janus_deduce_spec(cnf, mt, direction, variable_map), $janus_extraction_deduce_specs$.getDynamicValue(thread)), thread);
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject janus_experiment_full_filename(final SubLObject filename) {
        return arete.arete_experiment_full_filename(filename, $janus_experiment_directory$.getGlobalValue());
    }

    public static SubLObject run_janus_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list22);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list22);
            if (NIL == member(current_$2, $list23, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list22);
        }
        final SubLObject transcript_filename_tail = property_list_member($TRANSCRIPT_FILENAME, current);
        final SubLObject transcript_filename = (NIL != transcript_filename_tail) ? cadr(transcript_filename_tail) : NIL;
        final SubLObject experiment_filename_tail = property_list_member($EXPERIMENT_FILENAME, current);
        final SubLObject experiment_filename = (NIL != experiment_filename_tail) ? cadr(experiment_filename_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, current);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject overriding_query_properties_tail = property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? cadr(overriding_query_properties_tail) : NIL;
        final SubLObject metrics_tail = property_list_member($METRICS, current);
        final SubLObject metrics = (NIL != metrics_tail) ? cadr(metrics_tail) : $list30;
        final SubLObject outlier_timeout_tail = property_list_member($OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? cadr(outlier_timeout_tail) : $arete_outlier_timeout$;
        final SubLObject skip_tail = property_list_member($SKIP, current);
        final SubLObject skip = (NIL != skip_tail) ? cadr(skip_tail) : ZERO_INTEGER;
        final SubLObject count_tail = property_list_member($COUNT, current);
        final SubLObject count = (NIL != count_tail) ? cadr(count_tail) : NIL;
        final SubLObject jops = load_janus_transcript(transcript_filename);
        final SubLObject experiment_full_filename = janus_experiment_full_filename(experiment_filename);
        return list(new SubLObject[]{ RUN_KCT_EXPERIMENT, $TEST_SPEC_SET, list(QUOTE, jops), $FILENAME, experiment_full_filename, $COMMENT, comment, $INCREMENTAL, T, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $OVERRIDING_METRICS, metrics, $OUTLIER_TIMEOUT, outlier_timeout, $SKIP, skip, $COUNT, count });
    }

    public static SubLObject janus_test_case_runningP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $janus_test_case_runningP$.getDynamicValue(thread);
    }

    public static SubLObject execute_janus_operations(final SubLObject jops, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP, SubLObject start, SubLObject end) {
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
        final SubLObject overall_result = NIL;
        SubLObject list_var = NIL;
        SubLObject jop = NIL;
        SubLObject index = NIL;
        list_var = jops;
        jop = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , jop = list_var.first() , index = add(ONE_INTEGER, index)) {
            if (index.numGE(start) && ((NIL == end) || index.numLE(end))) {
                final SubLObject jop_result = execute_janus_operation(jop, metrics, outlier_timeout, overriding_query_properties, include_resultP);
                count = add(count, ONE_INTEGER);
            }
        }
        return values(overall_result, count);
    }

    public static SubLObject execute_janus_operation(final SubLObject jop, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP) {
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

    public static SubLObject execute_janus_create_operations(final SubLObject jops) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = jops;
        SubLObject jop = NIL;
        jop = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != janus_create_operation_p(jop)) {
                if (NIL != execute_janus_create(jop)) {
                    count = add(count, ONE_INTEGER);
                } else {
                    Errors.warn($str42$Execution_of_Janus_operation__s_f, jop);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject execute_janus_modification_operation(final SubLObject jop) {
        final SubLObject pcase_var = janus_operation_type(jop);
        if (pcase_var.eql($CREATE)) {
            return execute_janus_create(jop);
        }
        if (pcase_var.eql($ASSERT)) {
            return execute_janus_assert(jop);
        }
        return Errors.error($str43$unknown_modification_operation_ty, janus_operation_type(jop));
    }

    public static SubLObject kill_janus_constants(final SubLObject jops) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = jops;
        SubLObject jop = NIL;
        jop = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($CREATE == janus_operation_type(jop)) {
                final SubLObject external_id = janus_create_op_external_id(jop);
                if (NIL != constants_high.constant_external_id_p(external_id)) {
                    final SubLObject v_const = constants_high.find_constant_by_external_id(external_id);
                    if (NIL != constant_p(v_const)) {
                        cyc_kernel.cyc_kill(v_const);
                        count = add(count, ONE_INTEGER);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject execute_janus_create(final SubLObject jop) {
        assert NIL != janus_create_operation_p(jop) : "janus.janus_create_operation_p(jop) " + "CommonSymbols.NIL != janus.janus_create_operation_p(jop) " + jop;
        final SubLObject name = janus_create_op_name(jop);
        final SubLObject external_id = janus_create_op_external_id(jop);
        final SubLObject result = cyc_kernel.cyc_create(name, external_id);
        return values(result, $NOT_A_QUERY, NIL, NIL);
    }

    public static SubLObject execute_janus_assert(SubLObject jop) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != janus_assert_operation_p(jop) : "janus.janus_assert_operation_p(jop) " + "CommonSymbols.NIL != janus.janus_assert_operation_p(jop) " + jop;
        jop = dwim_janus_assert_operation(jop);
        final SubLObject sentence = janus_assert_op_sentence(jop);
        final SubLObject mt = janus_assert_op_mt(jop);
        final SubLObject strength = janus_assert_op_strength(jop);
        final SubLObject direction = janus_assert_op_direction(jop);
        final SubLObject allowed_rules = janus_assert_op_allowed_rules(jop);
        SubLObject deduce_specs = NIL;
        final SubLObject _prev_bind_0 = $janus_test_case_runningP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $janus_testing_deduce_specs$.currentBinding(thread);
        try {
            $janus_test_case_runningP$.bind(T, thread);
            $janus_testing_deduce_specs$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(allowed_rules, thread);
                cyc_kernel.cyc_assert(sentence, mt, list($STRENGTH, strength, $DIRECTION, direction));
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$3, thread);
            }
            deduce_specs = $janus_testing_deduce_specs$.getDynamicValue(thread);
        } finally {
            $janus_testing_deduce_specs$.rebind(_prev_bind_2, thread);
            $janus_test_case_runningP$.rebind(_prev_bind_0, thread);
        }
        return values(deduce_specs, $NOT_A_QUERY, NIL, NIL);
    }

    public static SubLObject dwim_janus_assert_operation(SubLObject jop) {
        SubLObject current;
        final SubLObject datum = current = jop;
        SubLObject janus_op = NIL;
        SubLObject type = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject strength = NIL;
        SubLObject direction = NIL;
        SubLObject expected_deduce_specs = NIL;
        SubLObject allowed_rules = NIL;
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        janus_op = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        strength = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        expected_deduce_specs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        allowed_rules = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != list_utilities.tree_find(constants_high.constant_external_id($$termOfUnit), sentence, symbol_function(EQUALP), UNPROVIDED)) {
                final SubLObject unencapsulated_sentence = encapsulation.unencapsulate_partial(sentence);
                if (NIL != el_formula_with_operator_p(unencapsulated_sentence, $$termOfUnit)) {
                    final SubLObject nat = cycl_utilities.formula_arg1(unencapsulated_sentence, UNPROVIDED);
                    if ((NIL != list_utilities.doubletonP(nat)) && $NAT.equal(nat.first())) {
                        final SubLObject naut = second(nat);
                        sentence = replace_formula_arg(ONE_INTEGER, naut, sentence);
                        jop = new_janus_assert_op(sentence, mt, strength, direction, expected_deduce_specs, allowed_rules, tag);
                    }
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list47);
        }
        return jop;
    }

    public static SubLObject dwim_janus_query_properties(final SubLObject v_properties) {
        return v_properties;
    }

    public static SubLObject janus_operation_successP(final SubLObject jop, SubLObject result, SubLObject halt_reason) {
        if (halt_reason == UNPROVIDED) {
            halt_reason = NIL;
        }
        result = janus_dwim_expression(result);
        final SubLObject pcase_var = janus_operation_type(jop);
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

    public static SubLObject janus_create_successP(final SubLObject jop, final SubLObject result) {
        return list_utilities.sublisp_boolean(result);
    }

    public static SubLObject janus_assert_successP(final SubLObject jop, final SubLObject deduce_specs) {
        assert NIL != listp(deduce_specs) : "Types.listp(deduce_specs) " + "CommonSymbols.NIL != Types.listp(deduce_specs) " + deduce_specs;
        final SubLObject expected_deduce_specs = janus_assert_op_expected_deduce_specs(jop);
        final SubLObject successP = list_utilities.sets_equalP(deduce_specs, expected_deduce_specs, symbol_function(EQUALP));
        return successP;
    }

    public static SubLObject janus_query_successP(final SubLObject jop, final SubLObject result, SubLObject halt_reason) {
        if (halt_reason == UNPROVIDED) {
            halt_reason = NIL;
        }
        final SubLObject expected_result = janus_query_op_expected_result(jop);
        final SubLObject expected_halt_reason = janus_query_op_expected_halt_reason(jop);
        final SubLObject result_successP = janus_query_result_successP(result, expected_result);
        final SubLObject halt_reason_successP = makeBoolean((NIL == halt_reason) || halt_reason.equal(expected_halt_reason));
        final SubLObject successP = makeBoolean((NIL != result_successP) && (NIL != halt_reason_successP));
        if (NIL == result_successP) {
            format(T, $str52$_s_____s__, result, expected_result);
        }
        if (NIL == halt_reason_successP) {
            format(T, $str52$_s_____s__, halt_reason, expected_halt_reason);
        }
        return successP;
    }

    public static SubLObject janus_query_result_successP(final SubLObject result, final SubLObject expected_result) {
        if (NIL != bindings.binding_lists_p(result)) {
            return bindings.lists_of_binding_lists_equalP(result, expected_result);
        }
        return list_utilities.sets_equal_equalP(result, expected_result);
    }

    public static SubLObject load_janus_experiment(final SubLObject filename) {
        final SubLObject full_filename = janus_experiment_full_filename(filename);
        return kbq_query_run.kct_load_test_set_run(full_filename);
    }

    public static SubLObject janus_experiment_p(final SubLObject v_object) {
        return makeBoolean((NIL != kbq_query_run.kct_test_set_run_p(v_object)) && (NIL != janus_operation_p(kbq_query_run.kct_test_run_test(kbq_query_run.kct_test_set_run_test_runs(v_object).first()))));
    }

    public static SubLObject janus_failure_analysis(final SubLObject test_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject more_complete = janus_categorize_failing_asserts(test_set_run);
        final SubLObject equally_complete = thread.secondMultipleValue();
        final SubLObject less_complete = thread.thirdMultipleValue();
        final SubLObject different = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return list($MORE_COMPLETE, length(more_complete), $EQUALLY_COMPLETE, length(equally_complete), $LESS_COMPLETE, length(less_complete), $DIFFERENT, length(different));
    }

    public static SubLObject janus_newly_failing_op_failure_reasons(final SubLObject baseline, final SubLObject experiment) {
        SubLObject failure_reasons = NIL;
        SubLObject cdolist_list_var = kbq_query_run.kct_compare_test_set_run_statuses(baseline, experiment);
        SubLObject diff = NIL;
        diff = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test = getf(diff, $TEST, UNPROVIDED);
            final SubLObject baseline_test_run = kbq_query_run.kct_lookup_test_run(baseline, test);
            final SubLObject baseline_result = kbq_query_run.kbq_query_run_result(kbq_query_run.kct_test_run_query_run(baseline_test_run));
            final SubLObject experiment_test_run = kbq_query_run.kct_lookup_test_run(experiment, test);
            final SubLObject experiment_result = kbq_query_run.kbq_query_run_result(kbq_query_run.kct_test_run_query_run(experiment_test_run));
            failure_reasons = cons(janus_categorize_failing_assert_int(baseline_result, experiment_result), failure_reasons);
            cdolist_list_var = cdolist_list_var.rest();
            diff = cdolist_list_var.first();
        } 
        return nreverse(failure_reasons);
    }

    public static SubLObject janus_categorize_failing_asserts(final SubLObject test_set_run) {
        SubLObject more_complete = NIL;
        SubLObject equally_complete = NIL;
        SubLObject less_complete = NIL;
        SubLObject different = NIL;
        SubLObject cdolist_list_var;
        final SubLObject test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs(kbq_query_run.kct_failing_test_set_run(test_set_run));
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != janus_assert_operation_p(kbq_query_run.kct_test_run_test(test_run))) {
                final SubLObject pcase_var = janus_categorize_failing_assert(test_run);
                if (pcase_var.eql($MORE_COMPLETE)) {
                    more_complete = cons(test_run, more_complete);
                } else
                    if (pcase_var.eql($EQUALLY_COMPLETE)) {
                        equally_complete = cons(test_run, equally_complete);
                    } else
                        if (pcase_var.eql($LESS_COMPLETE)) {
                            less_complete = cons(test_run, less_complete);
                        } else
                            if (pcase_var.eql($DIFFERENT)) {
                                different = cons(test_run, different);
                            }



            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        } 
        return values(more_complete, equally_complete, less_complete, different);
    }

    public static SubLObject janus_categorize_failing_assert(final SubLObject test_run) {
        final SubLObject jop = kbq_query_run.kct_test_run_test(test_run);
        final SubLObject expected_deduce_specs = janus_assert_op_expected_deduce_specs(jop);
        final SubLObject query_run = kbq_query_run.kct_test_run_query_run(test_run);
        final SubLObject actual_deduce_specs = kbq_query_run.kbq_query_run_result(query_run);
        return janus_categorize_failing_assert_int(expected_deduce_specs, actual_deduce_specs);
    }

    public static SubLObject janus_categorize_failing_assert_int(final SubLObject baseline_deduce_specs, final SubLObject experiment_deduce_specs) {
        if (NIL != list_utilities.sets_equalP(baseline_deduce_specs, experiment_deduce_specs, symbol_function(EQUALP))) {
            return $EQUALLY_COMPLETE;
        }
        if (NIL != subsetp(baseline_deduce_specs, experiment_deduce_specs, symbol_function(EQUALP), UNPROVIDED)) {
            return $MORE_COMPLETE;
        }
        if (NIL != subsetp(experiment_deduce_specs, baseline_deduce_specs, symbol_function(EQUALP), UNPROVIDED)) {
            return $LESS_COMPLETE;
        }
        return $DIFFERENT;
    }

    public static SubLObject janus_valid_test_set_run(final SubLObject test_set_run) {
        return kbq_query_run.kct_filter_test_set_run_by_test(test_set_run, $$$filtered_to_exclude_invalid_forts, $sym60$JANUS_VALID_TEST_RUN_, UNPROVIDED);
    }

    public static SubLObject janus_valid_test_runP(final SubLObject test_run) {
        return makeBoolean(NIL == list_utilities.tree_find_if($sym61$INVALID_INDEXED_TERM_, test_run, UNPROVIDED));
    }

    public static SubLObject janus_more_complete_test_runs(final SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, $MORE_COMPLETE);
    }

    public static SubLObject janus_equally_complete_test_runs(final SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, $EQUALLY_COMPLETE);
    }

    public static SubLObject janus_less_complete_test_runs(final SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, $LESS_COMPLETE);
    }

    public static SubLObject janus_different_test_runs(final SubLObject test_set_run) {
        return janus_test_runs_with_assert_failure_status(test_set_run, $DIFFERENT);
    }

    public static SubLObject janus_test_runs_with_assert_failure_status(final SubLObject test_set_run, final SubLObject assert_failure_status) {
        SubLObject result_test_runs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((($FAILURE == kbq_query_run.kct_test_run_status(test_run)) && (NIL != janus_assert_operation_p(kbq_query_run.kct_test_run_test(test_run)))) && assert_failure_status.eql(janus_categorize_failing_assert(test_run))) {
                result_test_runs = cons(test_run, result_test_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        } 
        return nreverse(result_test_runs);
    }

    public static SubLObject janus_test_runs_that_started_failing(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        return janus_test_runs_that_became_status(test_set_run_1, test_set_run_2, $BECAME_FAILURE, NIL);
    }

    public static SubLObject janus_test_runs_that_started_succeeding(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        return janus_test_runs_that_became_status(test_set_run_1, test_set_run_2, $BECAME_SUCCESS, T);
    }

    public static SubLObject janus_test_runs_that_became_status(final SubLObject test_set_run_1, final SubLObject test_set_run_2, final SubLObject status, final SubLObject use_run_1P) {
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject jops = cdolist_list_var = janus_operations_that_became_status(test_set_run_1, test_set_run_2, status);
        SubLObject jop = NIL;
        jop = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test_run = kbq_query_run.kct_lookup_test_run(NIL != use_run_1P ? test_set_run_1 : test_set_run_2, jop);
            test_runs = cons(test_run, test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            jop = cdolist_list_var.first();
        } 
        return nreverse(test_runs);
    }

    public static SubLObject janus_operations_that_became_status(final SubLObject test_set_run_1, final SubLObject test_set_run_2, final SubLObject status) {
        SubLObject jops = NIL;
        SubLObject cdolist_list_var;
        final SubLObject differences = cdolist_list_var = kbq_query_run.kct_compare_test_set_run_statuses(test_set_run_1, test_set_run_2);
        SubLObject diff = NIL;
        diff = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (status.eql(getf(diff, $CHANGE, UNPROVIDED))) {
                final SubLObject jop = getf(diff, $TEST, UNPROVIDED);
                jops = cons(jop, jops);
            }
            cdolist_list_var = cdolist_list_var.rest();
            diff = cdolist_list_var.first();
        } 
        return nreverse(jops);
    }

    public static SubLObject janus_compare_test_set_run_statuses(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        SubLObject differences = NIL;
        SubLObject test_run_1 = NIL;
        SubLObject test_run_1_$4 = NIL;
        SubLObject test_run_2 = NIL;
        SubLObject test_run_2_$5 = NIL;
        test_run_1 = kbq_query_run.kct_test_set_run_test_runs(test_set_run_1);
        test_run_1_$4 = test_run_1.first();
        test_run_2 = kbq_query_run.kct_test_set_run_test_runs(test_set_run_2);
        test_run_2_$5 = test_run_2.first();
        while ((NIL != test_run_2) || (NIL != test_run_1)) {
            final SubLObject test = kbq_query_run.kct_test_run_test(test_run_1_$4);
            if ((NIL != test_run_1_$4) && (NIL != test_run_2_$5)) {
                final SubLObject difference = kbq_query_run.kct_compare_test_run_statuses(test_run_1_$4, test_run_2_$5);
                if (NIL != difference) {
                    differences = cons(list($TEST, test, $CHANGE, difference), differences);
                }
            }
            test_run_1 = test_run_1.rest();
            test_run_1_$4 = test_run_1.first();
            test_run_2 = test_run_2.rest();
            test_run_2_$5 = test_run_2.first();
        } 
        differences = nreverse(differences);
        return differences;
    }

    public static SubLObject declare_janus_file() {
        declareFunction(me, "janus_operation_p", "JANUS-OPERATION-P", 1, 0, false);
        declareFunction(me, "janus_operation_type", "JANUS-OPERATION-TYPE", 1, 0, false);
        declareFunction(me, "janus_create_operation_p", "JANUS-CREATE-OPERATION-P", 1, 0, false);
        declareFunction(me, "janus_assert_operation_p", "JANUS-ASSERT-OPERATION-P", 1, 0, false);
        declareFunction(me, "janus_query_operation_p", "JANUS-QUERY-OPERATION-P", 1, 0, false);
        declareFunction(me, "janus_modification_operation_p", "JANUS-MODIFICATION-OPERATION-P", 1, 0, false);
        declareFunction(me, "new_janus_create_op", "NEW-JANUS-CREATE-OP", 2, 1, false);
        declareFunction(me, "new_janus_deduce_spec", "NEW-JANUS-DEDUCE-SPEC", 4, 0, false);
        declareFunction(me, "new_janus_assert_op", "NEW-JANUS-ASSERT-OP", 6, 1, false);
        declareFunction(me, "new_janus_query_op", "NEW-JANUS-QUERY-OP", 5, 1, false);
        declareFunction(me, "janus_create_op_name", "JANUS-CREATE-OP-NAME", 1, 0, false);
        declareFunction(me, "janus_create_op_external_id", "JANUS-CREATE-OP-EXTERNAL-ID", 1, 0, false);
        declareFunction(me, "janus_create_op_tag", "JANUS-CREATE-OP-TAG", 1, 0, false);
        declareFunction(me, "janus_assert_op_sentence", "JANUS-ASSERT-OP-SENTENCE", 1, 0, false);
        declareFunction(me, "janus_assert_op_mt", "JANUS-ASSERT-OP-MT", 1, 0, false);
        declareFunction(me, "janus_assert_op_strength", "JANUS-ASSERT-OP-STRENGTH", 1, 0, false);
        declareFunction(me, "janus_assert_op_direction", "JANUS-ASSERT-OP-DIRECTION", 1, 0, false);
        declareFunction(me, "janus_assert_op_expected_deduce_specs", "JANUS-ASSERT-OP-EXPECTED-DEDUCE-SPECS", 1, 0, false);
        declareFunction(me, "janus_assert_op_allowed_rules", "JANUS-ASSERT-OP-ALLOWED-RULES", 1, 0, false);
        declareFunction(me, "janus_assert_op_tag", "JANUS-ASSERT-OP-TAG", 1, 0, false);
        declareFunction(me, "janus_query_op_sentence", "JANUS-QUERY-OP-SENTENCE", 1, 0, false);
        declareFunction(me, "janus_query_op_mt", "JANUS-QUERY-OP-MT", 1, 0, false);
        declareFunction(me, "janus_query_op_query_properties", "JANUS-QUERY-OP-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "janus_query_op_expected_result", "JANUS-QUERY-OP-EXPECTED-RESULT", 1, 0, false);
        declareFunction(me, "janus_query_op_expected_halt_reason", "JANUS-QUERY-OP-EXPECTED-HALT-REASON", 1, 0, false);
        declareFunction(me, "janus_query_op_tag", "JANUS-QUERY-OP-TAG", 1, 0, false);
        declareFunction(me, "janus_new_constantP", "JANUS-NEW-CONSTANT?", 1, 0, false);
        declareFunction(me, "janus_dwim_constant", "JANUS-DWIM-CONSTANT", 1, 0, false);
        declareFunction(me, "janus_dwimmed_constant_id", "JANUS-DWIMMED-CONSTANT-ID", 1, 0, false);
        declareFunction(me, "janus_dwimmed_constantP", "JANUS-DWIMMED-CONSTANT?", 1, 0, false);
        declareFunction(me, "janus_dwim_expression", "JANUS-DWIM-EXPRESSION", 1, 0, false);
        declareFunction(me, "set_janus_tag", "SET-JANUS-TAG", 1, 0, false);
        declareFunction(me, "janus_test_case_loggingP", "JANUS-TEST-CASE-LOGGING?", 0, 0, false);
        declareFunction(me, "janus_within_somethingP", "JANUS-WITHIN-SOMETHING?", 0, 0, false);
        declareFunction(me, "janus_transcript_full_filename", "JANUS-TRANSCRIPT-FULL-FILENAME", 1, 0, false);
        declareFunction(me, "save_janus_transcript", "SAVE-JANUS-TRANSCRIPT", 2, 1, false);
        declareFunction(me, "load_janus_transcript", "LOAD-JANUS-TRANSCRIPT", 1, 0, false);
        declareFunction(me, "janus_op_index", "JANUS-OP-INDEX", 2, 0, false);
        declareFunction(me, "janus_op_indices", "JANUS-OP-INDICES", 2, 0, false);
        declareFunction(me, "extract_janus_operations", "EXTRACT-JANUS-OPERATIONS", 1, 0, false);
        declareFunction(me, "janus_note_create_finished", "JANUS-NOTE-CREATE-FINISHED", 1, 0, false);
        declareFunction(me, "janus_note_assert_finished", "JANUS-NOTE-ASSERT-FINISHED", 5, 0, false);
        declareFunction(me, "janus_note_query_finished", "JANUS-NOTE-QUERY-FINISHED", 5, 0, false);
        declareFunction(me, "janus_note_new_continuable_inference", "JANUS-NOTE-NEW-CONTINUABLE-INFERENCE", 3, 0, false);
        declareFunction(me, "janus_note_argument", "JANUS-NOTE-ARGUMENT", 5, 0, false);
        declareFunction(me, "janus_experiment_full_filename", "JANUS-EXPERIMENT-FULL-FILENAME", 1, 0, false);
        declareMacro(me, "run_janus_experiment", "RUN-JANUS-EXPERIMENT");
        declareFunction(me, "janus_test_case_runningP", "JANUS-TEST-CASE-RUNNING?", 0, 0, false);
        declareFunction(me, "execute_janus_operations", "EXECUTE-JANUS-OPERATIONS", 1, 6, false);
        declareFunction(me, "execute_janus_operation", "EXECUTE-JANUS-OPERATION", 1, 4, false);
        declareFunction(me, "execute_janus_create_operations", "EXECUTE-JANUS-CREATE-OPERATIONS", 1, 0, false);
        declareFunction(me, "execute_janus_modification_operation", "EXECUTE-JANUS-MODIFICATION-OPERATION", 1, 0, false);
        declareFunction(me, "kill_janus_constants", "KILL-JANUS-CONSTANTS", 1, 0, false);
        declareFunction(me, "execute_janus_create", "EXECUTE-JANUS-CREATE", 1, 0, false);
        declareFunction(me, "execute_janus_assert", "EXECUTE-JANUS-ASSERT", 1, 0, false);
        declareFunction(me, "dwim_janus_assert_operation", "DWIM-JANUS-ASSERT-OPERATION", 1, 0, false);
        declareFunction(me, "dwim_janus_query_properties", "DWIM-JANUS-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "janus_operation_successP", "JANUS-OPERATION-SUCCESS?", 2, 1, false);
        declareFunction(me, "janus_create_successP", "JANUS-CREATE-SUCCESS?", 2, 0, false);
        declareFunction(me, "janus_assert_successP", "JANUS-ASSERT-SUCCESS?", 2, 0, false);
        declareFunction(me, "janus_query_successP", "JANUS-QUERY-SUCCESS?", 2, 1, false);
        declareFunction(me, "janus_query_result_successP", "JANUS-QUERY-RESULT-SUCCESS?", 2, 0, false);
        declareFunction(me, "load_janus_experiment", "LOAD-JANUS-EXPERIMENT", 1, 0, false);
        declareFunction(me, "janus_experiment_p", "JANUS-EXPERIMENT-P", 1, 0, false);
        declareFunction(me, "janus_failure_analysis", "JANUS-FAILURE-ANALYSIS", 1, 0, false);
        declareFunction(me, "janus_newly_failing_op_failure_reasons", "JANUS-NEWLY-FAILING-OP-FAILURE-REASONS", 2, 0, false);
        declareFunction(me, "janus_categorize_failing_asserts", "JANUS-CATEGORIZE-FAILING-ASSERTS", 1, 0, false);
        declareFunction(me, "janus_categorize_failing_assert", "JANUS-CATEGORIZE-FAILING-ASSERT", 1, 0, false);
        declareFunction(me, "janus_categorize_failing_assert_int", "JANUS-CATEGORIZE-FAILING-ASSERT-INT", 2, 0, false);
        declareFunction(me, "janus_valid_test_set_run", "JANUS-VALID-TEST-SET-RUN", 1, 0, false);
        declareFunction(me, "janus_valid_test_runP", "JANUS-VALID-TEST-RUN?", 1, 0, false);
        declareFunction(me, "janus_more_complete_test_runs", "JANUS-MORE-COMPLETE-TEST-RUNS", 1, 0, false);
        declareFunction(me, "janus_equally_complete_test_runs", "JANUS-EQUALLY-COMPLETE-TEST-RUNS", 1, 0, false);
        declareFunction(me, "janus_less_complete_test_runs", "JANUS-LESS-COMPLETE-TEST-RUNS", 1, 0, false);
        declareFunction(me, "janus_different_test_runs", "JANUS-DIFFERENT-TEST-RUNS", 1, 0, false);
        declareFunction(me, "janus_test_runs_with_assert_failure_status", "JANUS-TEST-RUNS-WITH-ASSERT-FAILURE-STATUS", 2, 0, false);
        declareFunction(me, "janus_test_runs_that_started_failing", "JANUS-TEST-RUNS-THAT-STARTED-FAILING", 2, 0, false);
        declareFunction(me, "janus_test_runs_that_started_succeeding", "JANUS-TEST-RUNS-THAT-STARTED-SUCCEEDING", 2, 0, false);
        declareFunction(me, "janus_test_runs_that_became_status", "JANUS-TEST-RUNS-THAT-BECAME-STATUS", 4, 0, false);
        declareFunction(me, "janus_operations_that_became_status", "JANUS-OPERATIONS-THAT-BECAME-STATUS", 3, 0, false);
        declareFunction(me, "janus_compare_test_set_run_statuses", "JANUS-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_janus_file() {
        deflexical("*JANUS-TRANSCRIPT-DIRECTORY*", $str9$_cyc_projects_inference_janus_tra);
        deflexical("*JANUS-EXPERIMENT-DIRECTORY*", $str21$_cyc_projects_inference_janus_exp);
        return NIL;
    }

    public static SubLObject setup_janus_file() {
        note_funcall_helper_function(JANUS_CATEGORIZE_FAILING_ASSERT_INT);
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

    
}

/**
 * Total time: 261 ms
 */
