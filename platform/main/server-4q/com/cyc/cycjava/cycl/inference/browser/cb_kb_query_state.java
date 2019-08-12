package com.cyc.cycjava.cycl.inference.browser;

import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
//import com.cyc.cycjava.cycl.inference.browser.cb_kb_query.$kb_query_state_native;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_kb_query_state extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new cb_kb_query_state();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.browser.cb_kb_query_state";


    // defconstant
    public static final SubLSymbol $dtp_kb_query_state$ = makeSymbol("*DTP-KB-QUERY-STATE*");

    private static final SubLSymbol KB_QUERY_STATE = makeSymbol("KB-QUERY-STATE");

    private static final SubLSymbol KB_QUERY_STATE_P = makeSymbol("KB-QUERY-STATE-P");

    private static final SubLList $list2 = list(new SubLObject[] { makeSymbol("QUERY-SPEC"), makeSymbol("NAME"), makeSymbol("COMMENTS"), makeSymbol("TEST-STATE"), makeSymbol("SAVE-MT"), makeSymbol("INFERENCE"), makeSymbol("SENTENCES"), makeSymbol("QUERY-MTS"), makeSymbol("TEMPLATE"),
	    makeSymbol("TEMPLATE-FOLDER-MT-PAIRS"), makeSymbol("TEMPLATE-GLOSSES"), makeSymbol("QUERY-PROPERTIES"), makeSymbol("NON-EXPLANATORY-SENTENCE"), makeSymbol("MULTIPLE-CHOICE-OPTION-SPECS") });

    private static final SubLList $list3 = list(new SubLObject[] { makeKeyword("QUERY-SPEC"), $NAME, makeKeyword("COMMENTS"), makeKeyword("TEST-STATE"), makeKeyword("SAVE-MT"), makeKeyword("INFERENCE"), makeKeyword("SENTENCES"), makeKeyword("QUERY-MTS"), makeKeyword("TEMPLATE"),
	    makeKeyword("TEMPLATE-FOLDER-MT-PAIRS"), makeKeyword("TEMPLATE-GLOSSES"), makeKeyword("QUERY-PROPERTIES"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("MULTIPLE-CHOICE-OPTION-SPECS") });

    private static final SubLList $list4 = list(new SubLObject[] { makeSymbol("KB-QUERY-STATE-QUERY-SPEC"), makeSymbol("KB-QUERY-STATE-NAME"), makeSymbol("KB-QUERY-STATE-COMMENTS"), makeSymbol("KB-QUERY-STATE-TEST-STATE"), makeSymbol("KB-QUERY-STATE-SAVE-MT"), makeSymbol("KB-QUERY-STATE-INFERENCE"),
	    makeSymbol("KB-QUERY-STATE-SENTENCES"), makeSymbol("KB-QUERY-STATE-QUERY-MTS"), makeSymbol("KB-QUERY-STATE-TEMPLATE"), makeSymbol("KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS"), makeSymbol("KB-QUERY-STATE-TEMPLATE-GLOSSES"), makeSymbol("KB-QUERY-STATE-QUERY-PROPERTIES"),
	    makeSymbol("KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE"), makeSymbol("KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS") });

    private static final SubLList $list5 = list(new SubLObject[] { makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-SPEC"), makeSymbol("_CSETF-KB-QUERY-STATE-NAME"), makeSymbol("_CSETF-KB-QUERY-STATE-COMMENTS"), makeSymbol("_CSETF-KB-QUERY-STATE-TEST-STATE"), makeSymbol("_CSETF-KB-QUERY-STATE-SAVE-MT"),
	    makeSymbol("_CSETF-KB-QUERY-STATE-INFERENCE"), makeSymbol("_CSETF-KB-QUERY-STATE-SENTENCES"), makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-MTS"), makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE"), makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS"),
	    makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES"), makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES"), makeSymbol("_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE"), makeSymbol("_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS") });

    private static final SubLSymbol KB_QUERY_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-QUERY-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KB-QUERY-STATE-P"));

    private static final SubLSymbol KB_QUERY_STATE_QUERY_SPEC = makeSymbol("KB-QUERY-STATE-QUERY-SPEC");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_QUERY_SPEC = makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-SPEC");

    private static final SubLSymbol KB_QUERY_STATE_NAME = makeSymbol("KB-QUERY-STATE-NAME");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_NAME = makeSymbol("_CSETF-KB-QUERY-STATE-NAME");

    private static final SubLSymbol KB_QUERY_STATE_COMMENTS = makeSymbol("KB-QUERY-STATE-COMMENTS");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_COMMENTS = makeSymbol("_CSETF-KB-QUERY-STATE-COMMENTS");

    private static final SubLSymbol KB_QUERY_STATE_TEST_STATE = makeSymbol("KB-QUERY-STATE-TEST-STATE");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_TEST_STATE = makeSymbol("_CSETF-KB-QUERY-STATE-TEST-STATE");

    private static final SubLSymbol KB_QUERY_STATE_SAVE_MT = makeSymbol("KB-QUERY-STATE-SAVE-MT");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_SAVE_MT = makeSymbol("_CSETF-KB-QUERY-STATE-SAVE-MT");

    private static final SubLSymbol KB_QUERY_STATE_INFERENCE = makeSymbol("KB-QUERY-STATE-INFERENCE");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_INFERENCE = makeSymbol("_CSETF-KB-QUERY-STATE-INFERENCE");

    private static final SubLSymbol KB_QUERY_STATE_SENTENCES = makeSymbol("KB-QUERY-STATE-SENTENCES");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_SENTENCES = makeSymbol("_CSETF-KB-QUERY-STATE-SENTENCES");

    private static final SubLSymbol KB_QUERY_STATE_QUERY_MTS = makeSymbol("KB-QUERY-STATE-QUERY-MTS");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_QUERY_MTS = makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-MTS");

    private static final SubLSymbol KB_QUERY_STATE_TEMPLATE = makeSymbol("KB-QUERY-STATE-TEMPLATE");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_TEMPLATE = makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE");

    private static final SubLSymbol KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS = makeSymbol("KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS = makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS");

    private static final SubLSymbol KB_QUERY_STATE_TEMPLATE_GLOSSES = makeSymbol("KB-QUERY-STATE-TEMPLATE-GLOSSES");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_TEMPLATE_GLOSSES = makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES");

    private static final SubLSymbol KB_QUERY_STATE_QUERY_PROPERTIES = makeSymbol("KB-QUERY-STATE-QUERY-PROPERTIES");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_QUERY_PROPERTIES = makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES");

    private static final SubLSymbol KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE = makeSymbol("KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE = makeSymbol("_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE");

    private static final SubLSymbol KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS = makeSymbol("KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS");

    private static final SubLSymbol _CSETF_KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS = makeSymbol("_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS");

    private static final SubLSymbol $TEST_STATE = makeKeyword("TEST-STATE");

    private static final SubLSymbol $QUERY_MTS = makeKeyword("QUERY-MTS");

    private static final SubLSymbol $TEMPLATE_FOLDER_MT_PAIRS = makeKeyword("TEMPLATE-FOLDER-MT-PAIRS");

    private static final SubLSymbol $TEMPLATE_GLOSSES = makeKeyword("TEMPLATE-GLOSSES");

    private static final SubLSymbol $QUERY_PROPERTIES = makeKeyword("QUERY-PROPERTIES");

    private static final SubLSymbol $NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");

    private static final SubLSymbol $MULTIPLE_CHOICE_OPTION_SPECS = makeKeyword("MULTIPLE-CHOICE-OPTION-SPECS");

    private static final SubLString $str51$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_KB_QUERY_STATE = makeSymbol("MAKE-KB-QUERY-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KB_QUERY_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-QUERY-STATE-METHOD");

    private static final SubLSymbol KBQ_QUERY_SPEC_P = makeSymbol("KBQ-QUERY-SPEC-P");

    private static final SubLSymbol KCT_TEST_STATE_P = makeSymbol("KCT-TEST-STATE-P");

    public static final SubLSymbol $cb_kb_query_being_saved$ = makeSymbol("*CB-KB-QUERY-BEING-SAVED*");

    public static SubLObject kb_query_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject kb_query_state_p(final SubLObject v_object) {
	return v_object.getClass() == $kb_query_state_native.class ? T : NIL;
    }

    public static SubLObject kb_query_state_query_spec(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject kb_query_state_name(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField3();
    }

    public static SubLObject kb_query_state_comments(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField4();
    }

    public static SubLObject kb_query_state_test_state(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField5();
    }

    public static SubLObject kb_query_state_save_mt(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField6();
    }

    public static SubLObject kb_query_state_inference(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField7();
    }

    public static SubLObject kb_query_state_sentences(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField8();
    }

    public static SubLObject kb_query_state_query_mts(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField9();
    }

    public static SubLObject kb_query_state_template(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField10();
    }

    public static SubLObject kb_query_state_template_folder_mt_pairs(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField11();
    }

    public static SubLObject kb_query_state_template_glosses(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField12();
    }

    public static SubLObject kb_query_state_query_properties(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField13();
    }

    public static SubLObject kb_query_state_non_explanatory_sentence(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField14();
    }

    public static SubLObject kb_query_state_multiple_choice_option_specs(final SubLObject v_object) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.getField15();
    }

    public static SubLObject _csetf_kb_query_state_query_spec(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_kb_query_state_name(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_kb_query_state_comments(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_kb_query_state_test_state(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_kb_query_state_save_mt(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_kb_query_state_inference(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_kb_query_state_sentences(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_kb_query_state_query_mts(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static SubLObject _csetf_kb_query_state_template(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField10(value);
    }

    public static SubLObject _csetf_kb_query_state_template_folder_mt_pairs(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField11(value);
    }

    public static SubLObject _csetf_kb_query_state_template_glosses(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField12(value);
    }

    public static SubLObject _csetf_kb_query_state_query_properties(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField13(value);
    }

    public static SubLObject _csetf_kb_query_state_non_explanatory_sentence(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField14(value);
    }

    public static SubLObject _csetf_kb_query_state_multiple_choice_option_specs(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_query_state_p(v_object) : "cb_kb_query_state.kb_query_state_p error :" + v_object;
	return v_object.setField15(value);
    }

    public static SubLObject make_kb_query_state(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $kb_query_state_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($QUERY_SPEC)) {
		_csetf_kb_query_state_query_spec(v_new, current_value);
	    } else if (pcase_var.eql($NAME)) {
		_csetf_kb_query_state_name(v_new, current_value);
	    } else if (pcase_var.eql($COMMENTS)) {
		_csetf_kb_query_state_comments(v_new, current_value);
	    } else if (pcase_var.eql($TEST_STATE)) {
		_csetf_kb_query_state_test_state(v_new, current_value);
	    } else if (pcase_var.eql($SAVE_MT)) {
		_csetf_kb_query_state_save_mt(v_new, current_value);
	    } else if (pcase_var.eql($INFERENCE)) {
		_csetf_kb_query_state_inference(v_new, current_value);
	    } else if (pcase_var.eql($SENTENCES)) {
		_csetf_kb_query_state_sentences(v_new, current_value);
	    } else if (pcase_var.eql($QUERY_MTS)) {
		_csetf_kb_query_state_query_mts(v_new, current_value);
	    } else if (pcase_var.eql($TEMPLATE)) {
		_csetf_kb_query_state_template(v_new, current_value);
	    } else if (pcase_var.eql($TEMPLATE_FOLDER_MT_PAIRS)) {
		_csetf_kb_query_state_template_folder_mt_pairs(v_new, current_value);
	    } else if (pcase_var.eql($TEMPLATE_GLOSSES)) {
		_csetf_kb_query_state_template_glosses(v_new, current_value);
	    } else if (pcase_var.eql($QUERY_PROPERTIES)) {
		_csetf_kb_query_state_query_properties(v_new, current_value);
	    } else if (pcase_var.eql($NON_EXPLANATORY_SENTENCE)) {
		_csetf_kb_query_state_non_explanatory_sentence(v_new, current_value);
	    } else if (pcase_var.eql($MULTIPLE_CHOICE_OPTION_SPECS)) {
		_csetf_kb_query_state_multiple_choice_option_specs(v_new, current_value);
	    } else {
		Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_kb_query_state(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_KB_QUERY_STATE, FOURTEEN_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $QUERY_SPEC, kb_query_state_query_spec(obj));
	funcall(visitor_fn, obj, $SLOT, $NAME, kb_query_state_name(obj));
	funcall(visitor_fn, obj, $SLOT, $COMMENTS, kb_query_state_comments(obj));
	funcall(visitor_fn, obj, $SLOT, $TEST_STATE, kb_query_state_test_state(obj));
	funcall(visitor_fn, obj, $SLOT, $SAVE_MT, kb_query_state_save_mt(obj));
	funcall(visitor_fn, obj, $SLOT, $INFERENCE, kb_query_state_inference(obj));
	funcall(visitor_fn, obj, $SLOT, $SENTENCES, kb_query_state_sentences(obj));
	funcall(visitor_fn, obj, $SLOT, $QUERY_MTS, kb_query_state_query_mts(obj));
	funcall(visitor_fn, obj, $SLOT, $TEMPLATE, kb_query_state_template(obj));
	funcall(visitor_fn, obj, $SLOT, $TEMPLATE_FOLDER_MT_PAIRS, kb_query_state_template_folder_mt_pairs(obj));
	funcall(visitor_fn, obj, $SLOT, $TEMPLATE_GLOSSES, kb_query_state_template_glosses(obj));
	funcall(visitor_fn, obj, $SLOT, $QUERY_PROPERTIES, kb_query_state_query_properties(obj));
	funcall(visitor_fn, obj, $SLOT, $NON_EXPLANATORY_SENTENCE, kb_query_state_non_explanatory_sentence(obj));
	funcall(visitor_fn, obj, $SLOT, $MULTIPLE_CHOICE_OPTION_SPECS, kb_query_state_multiple_choice_option_specs(obj));
	funcall(visitor_fn, obj, $END, MAKE_KB_QUERY_STATE, FOURTEEN_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_kb_query_state_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_kb_query_state(obj, visitor_fn);
    }

    public static SubLObject cb_kbq_new_query_state_from_query_spec(final SubLObject query_spec, SubLObject test_state) {
	if (test_state == UNPROVIDED) {
	    test_state = NIL;
	}
	assert NIL != kb_query.kbq_query_spec_p(query_spec) : "kb_query.kbq_query_spec_p(query_spec) " + "CommonSymbols.NIL != kb_query.kbq_query_spec_p(query_spec) " + query_spec;
	if (((NIL != test_state) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cb_kct_test.kct_test_state_p(test_state))) {
	    throw new AssertionError(test_state);
	}
	final SubLObject query_state = make_kb_query_state(UNPROVIDED);
	_csetf_kb_query_state_query_spec(query_state, query_spec);
	_csetf_kb_query_state_name(query_state, cb_string_for_fort(query_spec));
	_csetf_kb_query_state_comments(query_state, kb_query.kbq_comments(query_spec));
	_csetf_kb_query_state_test_state(query_state, test_state);
	_csetf_kb_query_state_save_mt(query_state, kb_query.kbq_defining_mt(query_spec));
	_csetf_kb_query_state_sentences(query_state, kb_query.kbq_sentences(query_spec));
	_csetf_kb_query_state_non_explanatory_sentence(query_state, kb_query.kbq_pragmatics(query_spec));
	_csetf_kb_query_state_query_mts(query_state, kb_query.kbq_mts(query_spec));
	_csetf_kb_query_state_template(query_state, kb_query.kbq_template(query_spec));
	if (NIL != kb_query_state_template(query_state)) {
	    _csetf_kb_query_state_template_folder_mt_pairs(query_state, kb_query.template_folders(kb_query_state_template(query_state)));
	    _csetf_kb_query_state_template_glosses(query_state, kb_query.kbq_template_glosses(kb_query_state_template(query_state)));
	}
	_csetf_kb_query_state_query_properties(query_state, remf(kb_query.kbq_query_properties(query_spec), $NON_EXPLANATORY_SENTENCE));
	_csetf_kb_query_state_multiple_choice_option_specs(query_state, kb_query.kbq_multiple_choice_option_specs(query_spec));
	return query_state;
    }

    public static SubLObject cb_kbq_new_query_state_from_inference(final SubLObject inference, SubLObject test_state) {
	if (test_state == UNPROVIDED) {
	    test_state = NIL;
	}
	assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
	if (((NIL != test_state) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cb_kct_test.kct_test_state_p(test_state))) {
	    throw new AssertionError(test_state);
	}
	final SubLObject query_state = make_kb_query_state(UNPROVIDED);
	_csetf_kb_query_state_query_spec(query_state, cb_kb_query.kbq_lookup_query_spec_by_inference(inference));
	_csetf_kb_query_state_save_mt(query_state, kb_query.kbq_default_defining_mt());
	_csetf_kb_query_state_inference(query_state, inference);
	_csetf_kb_query_state_sentences(query_state, list(inference_datastructures_inference.inference_input_el_query(inference)));
	_csetf_kb_query_state_query_mts(query_state, list(inference_datastructures_inference.inference_input_mt(inference)));
	_csetf_kb_query_state_query_properties(query_state, inference_datastructures_inference.inference_input_query_properties(inference));
	_csetf_kb_query_state_non_explanatory_sentence(query_state, inference_datastructures_inference.inference_input_non_explanatory_el_query(inference));
	_csetf_kb_query_state_multiple_choice_option_specs(query_state, NIL);
	return query_state;
    }

    public static SubLObject kb_query_state_best_sentence(final SubLObject query_state) {
	assert NIL != kb_query_state_p(query_state) : "cb_kb_query_state.kb_query_state_p(query_state) " + "CommonSymbols.NIL != cb_kb_query_state.kb_query_state_p(query_state) " + query_state;
	return kb_query_state_sentences(query_state).first();
    }

    public static SubLObject kb_query_state_other_sentences(final SubLObject query_state) {
	assert NIL != kb_query_state_p(query_state) : "cb_kb_query_state.kb_query_state_p(query_state) " + "CommonSymbols.NIL != cb_kb_query_state.kb_query_state_p(query_state) " + query_state;
	return kb_query_state_sentences(query_state).rest();
    }

    public static SubLObject kb_query_state_best_mt(final SubLObject query_state) {
	assert NIL != kb_query_state_p(query_state) : "cb_kb_query_state.kb_query_state_p(query_state) " + "CommonSymbols.NIL != cb_kb_query_state.kb_query_state_p(query_state) " + query_state;
	return kb_query_state_query_mts(query_state).first();
    }

    public static SubLObject kb_query_state_other_mts(final SubLObject query_state) {
	assert NIL != kb_query_state_p(query_state) : "cb_kb_query_state.kb_query_state_p(query_state) " + "CommonSymbols.NIL != cb_kb_query_state.kb_query_state_p(query_state) " + query_state;
	return kb_query_state_query_mts(query_state).rest();
    }

    public static SubLObject cb_clear_kb_query_being_saved() {
	$cb_kb_query_being_saved$.setDynamicValue(NIL);
	return NIL;
    }

    public static SubLObject cb_kb_query_being_saved() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $cb_kb_query_being_saved$.getDynamicValue(thread);
    }

    public static SubLObject cb_set_kb_query_being_saved(final SubLObject kb_query_state) {
	$cb_kb_query_being_saved$.setDynamicValue(kb_query_state);
	return kb_query_state;
    }

    public static SubLObject declare_cb_kb_query_state_file() {
	declareFunction("kb_query_state_print_function_trampoline", "KB-QUERY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("kb_query_state_p", "KB-QUERY-STATE-P", 1, 0, false);
	new cb_kb_query_state.$kb_query_state_p$UnaryFunction();
	declareFunction("kb_query_state_query_spec", "KB-QUERY-STATE-QUERY-SPEC", 1, 0, false);
	declareFunction("kb_query_state_name", "KB-QUERY-STATE-NAME", 1, 0, false);
	declareFunction("kb_query_state_comments", "KB-QUERY-STATE-COMMENTS", 1, 0, false);
	declareFunction("kb_query_state_test_state", "KB-QUERY-STATE-TEST-STATE", 1, 0, false);
	declareFunction("kb_query_state_save_mt", "KB-QUERY-STATE-SAVE-MT", 1, 0, false);
	declareFunction("kb_query_state_inference", "KB-QUERY-STATE-INFERENCE", 1, 0, false);
	declareFunction("kb_query_state_sentences", "KB-QUERY-STATE-SENTENCES", 1, 0, false);
	declareFunction("kb_query_state_query_mts", "KB-QUERY-STATE-QUERY-MTS", 1, 0, false);
	declareFunction("kb_query_state_template", "KB-QUERY-STATE-TEMPLATE", 1, 0, false);
	declareFunction("kb_query_state_template_folder_mt_pairs", "KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS", 1, 0, false);
	declareFunction("kb_query_state_template_glosses", "KB-QUERY-STATE-TEMPLATE-GLOSSES", 1, 0, false);
	declareFunction("kb_query_state_query_properties", "KB-QUERY-STATE-QUERY-PROPERTIES", 1, 0, false);
	declareFunction("kb_query_state_non_explanatory_sentence", "KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE", 1, 0, false);
	declareFunction("kb_query_state_multiple_choice_option_specs", "KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS", 1, 0, false);
	declareFunction("_csetf_kb_query_state_query_spec", "_CSETF-KB-QUERY-STATE-QUERY-SPEC", 2, 0, false);
	declareFunction("_csetf_kb_query_state_name", "_CSETF-KB-QUERY-STATE-NAME", 2, 0, false);
	declareFunction("_csetf_kb_query_state_comments", "_CSETF-KB-QUERY-STATE-COMMENTS", 2, 0, false);
	declareFunction("_csetf_kb_query_state_test_state", "_CSETF-KB-QUERY-STATE-TEST-STATE", 2, 0, false);
	declareFunction("_csetf_kb_query_state_save_mt", "_CSETF-KB-QUERY-STATE-SAVE-MT", 2, 0, false);
	declareFunction("_csetf_kb_query_state_inference", "_CSETF-KB-QUERY-STATE-INFERENCE", 2, 0, false);
	declareFunction("_csetf_kb_query_state_sentences", "_CSETF-KB-QUERY-STATE-SENTENCES", 2, 0, false);
	declareFunction("_csetf_kb_query_state_query_mts", "_CSETF-KB-QUERY-STATE-QUERY-MTS", 2, 0, false);
	declareFunction("_csetf_kb_query_state_template", "_CSETF-KB-QUERY-STATE-TEMPLATE", 2, 0, false);
	declareFunction("_csetf_kb_query_state_template_folder_mt_pairs", "_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS", 2, 0, false);
	declareFunction("_csetf_kb_query_state_template_glosses", "_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES", 2, 0, false);
	declareFunction("_csetf_kb_query_state_query_properties", "_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES", 2, 0, false);
	declareFunction("_csetf_kb_query_state_non_explanatory_sentence", "_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE", 2, 0, false);
	declareFunction("_csetf_kb_query_state_multiple_choice_option_specs", "_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS", 2, 0, false);
	declareFunction("make_kb_query_state", "MAKE-KB-QUERY-STATE", 0, 1, false);
	declareFunction("visit_defstruct_kb_query_state", "VISIT-DEFSTRUCT-KB-QUERY-STATE", 2, 0, false);
	declareFunction("visit_defstruct_object_kb_query_state_method", "VISIT-DEFSTRUCT-OBJECT-KB-QUERY-STATE-METHOD", 2, 0, false);
	declareFunction("cb_kbq_new_query_state_from_query_spec", "CB-KBQ-NEW-QUERY-STATE-FROM-QUERY-SPEC", 1, 1, false);
	declareFunction("cb_kbq_new_query_state_from_inference", "CB-KBQ-NEW-QUERY-STATE-FROM-INFERENCE", 1, 1, false);
	declareFunction("kb_query_state_best_sentence", "KB-QUERY-STATE-BEST-SENTENCE", 1, 0, false);
	declareFunction("kb_query_state_other_sentences", "KB-QUERY-STATE-OTHER-SENTENCES", 1, 0, false);
	declareFunction("kb_query_state_best_mt", "KB-QUERY-STATE-BEST-MT", 1, 0, false);
	declareFunction("kb_query_state_other_mts", "KB-QUERY-STATE-OTHER-MTS", 1, 0, false);
	declareFunction("cb_clear_kb_query_being_saved", "CB-CLEAR-KB-QUERY-BEING-SAVED", 0, 0, false);
	declareFunction("cb_kb_query_being_saved", "CB-KB-QUERY-BEING-SAVED", 0, 0, false);
	declareFunction("cb_set_kb_query_being_saved", "CB-SET-KB-QUERY-BEING-SAVED", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_cb_kb_query_state_file() {
	defconstant("*DTP-KB-QUERY-STATE*", KB_QUERY_STATE);
	defvar("*CB-KB-QUERY-BEING-SAVED*", NIL);
	return NIL;
    }

    public static SubLObject setup_cb_kb_query_state_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_query_state$.getGlobalValue(), symbol_function(KB_QUERY_STATE_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list8);
	def_csetf(KB_QUERY_STATE_QUERY_SPEC, _CSETF_KB_QUERY_STATE_QUERY_SPEC);
	def_csetf(KB_QUERY_STATE_NAME, _CSETF_KB_QUERY_STATE_NAME);
	def_csetf(KB_QUERY_STATE_COMMENTS, _CSETF_KB_QUERY_STATE_COMMENTS);
	def_csetf(KB_QUERY_STATE_TEST_STATE, _CSETF_KB_QUERY_STATE_TEST_STATE);
	def_csetf(KB_QUERY_STATE_SAVE_MT, _CSETF_KB_QUERY_STATE_SAVE_MT);
	def_csetf(KB_QUERY_STATE_INFERENCE, _CSETF_KB_QUERY_STATE_INFERENCE);
	def_csetf(KB_QUERY_STATE_SENTENCES, _CSETF_KB_QUERY_STATE_SENTENCES);
	def_csetf(KB_QUERY_STATE_QUERY_MTS, _CSETF_KB_QUERY_STATE_QUERY_MTS);
	def_csetf(KB_QUERY_STATE_TEMPLATE, _CSETF_KB_QUERY_STATE_TEMPLATE);
	def_csetf(KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS, _CSETF_KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS);
	def_csetf(KB_QUERY_STATE_TEMPLATE_GLOSSES, _CSETF_KB_QUERY_STATE_TEMPLATE_GLOSSES);
	def_csetf(KB_QUERY_STATE_QUERY_PROPERTIES, _CSETF_KB_QUERY_STATE_QUERY_PROPERTIES);
	def_csetf(KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE, _CSETF_KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE);
	def_csetf(KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS, _CSETF_KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS);
	identity(KB_QUERY_STATE);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_query_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_QUERY_STATE_METHOD));
	register_html_state_variable($cb_kb_query_being_saved$);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_cb_kb_query_state_file();
    }

    @Override
    public void initializeVariables() {
	init_cb_kb_query_state_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_cb_kb_query_state_file();
    }

    static {

    }

    public static final class $kb_query_state_native extends SubLStructNative {
	public SubLObject $query_spec;

	public SubLObject $name;

	public SubLObject $comments;

	public SubLObject $test_state;

	public SubLObject $save_mt;

	public SubLObject $inference;

	public SubLObject $sentences;

	public SubLObject $query_mts;

	public SubLObject $template;

	public SubLObject $template_folder_mt_pairs;

	public SubLObject $template_glosses;

	public SubLObject $query_properties;

	public SubLObject $non_explanatory_sentence;

	public SubLObject $multiple_choice_option_specs;

	private static final SubLStructDeclNative structDecl;

	private $kb_query_state_native() {
	    this.$query_spec = Lisp.NIL;
	    this.$name = Lisp.NIL;
	    this.$comments = Lisp.NIL;
	    this.$test_state = Lisp.NIL;
	    this.$save_mt = Lisp.NIL;
	    this.$inference = Lisp.NIL;
	    this.$sentences = Lisp.NIL;
	    this.$query_mts = Lisp.NIL;
	    this.$template = Lisp.NIL;
	    this.$template_folder_mt_pairs = Lisp.NIL;
	    this.$template_glosses = Lisp.NIL;
	    this.$query_properties = Lisp.NIL;
	    this.$non_explanatory_sentence = Lisp.NIL;
	    this.$multiple_choice_option_specs = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$query_spec;
	}

	@Override
	public SubLObject getField3() {
	    return this.$name;
	}

	@Override
	public SubLObject getField4() {
	    return this.$comments;
	}

	@Override
	public SubLObject getField5() {
	    return this.$test_state;
	}

	@Override
	public SubLObject getField6() {
	    return this.$save_mt;
	}

	@Override
	public SubLObject getField7() {
	    return this.$inference;
	}

	@Override
	public SubLObject getField8() {
	    return this.$sentences;
	}

	@Override
	public SubLObject getField9() {
	    return this.$query_mts;
	}

	@Override
	public SubLObject getField10() {
	    return this.$template;
	}

	@Override
	public SubLObject getField11() {
	    return this.$template_folder_mt_pairs;
	}

	@Override
	public SubLObject getField12() {
	    return this.$template_glosses;
	}

	@Override
	public SubLObject getField13() {
	    return this.$query_properties;
	}

	@Override
	public SubLObject getField14() {
	    return this.$non_explanatory_sentence;
	}

	@Override
	public SubLObject getField15() {
	    return this.$multiple_choice_option_specs;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$query_spec = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$name = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$comments = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return this.$test_state = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return this.$save_mt = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return this.$inference = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return this.$sentences = value;
	}

	@Override
	public SubLObject setField9(final SubLObject value) {
	    return this.$query_mts = value;
	}

	@Override
	public SubLObject setField10(final SubLObject value) {
	    return this.$template = value;
	}

	@Override
	public SubLObject setField11(final SubLObject value) {
	    return this.$template_folder_mt_pairs = value;
	}

	@Override
	public SubLObject setField12(final SubLObject value) {
	    return this.$template_glosses = value;
	}

	@Override
	public SubLObject setField13(final SubLObject value) {
	    return this.$query_properties = value;
	}

	@Override
	public SubLObject setField14(final SubLObject value) {
	    return this.$non_explanatory_sentence = value;
	}

	@Override
	public SubLObject setField15(final SubLObject value) {
	    return this.$multiple_choice_option_specs = value;
	}

	static {
	    structDecl = makeStructDeclNative($kb_query_state_native.class, KB_QUERY_STATE, KB_QUERY_STATE_P, $list2, $list3,
		    new String[] { "$query_spec", "$name", "$comments", "$test_state", "$save_mt", "$inference", "$sentences", "$query_mts", "$template", "$template_folder_mt_pairs", "$template_glosses", "$query_properties", "$non_explanatory_sentence", "$multiple_choice_option_specs" }, $list4,
		    $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
	}
    }

    public static final class $kb_query_state_p$UnaryFunction extends UnaryFunction {
	public $kb_query_state_p$UnaryFunction() {
	    super(extractFunctionNamed("KB-QUERY-STATE-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return kb_query_state_p(arg1);
	}
    }
}

/**
 * Total time: 123 ms synthetic
 */
