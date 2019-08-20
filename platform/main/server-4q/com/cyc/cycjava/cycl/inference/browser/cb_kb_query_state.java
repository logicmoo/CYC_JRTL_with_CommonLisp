package com.cyc.cycjava.cycl.inference.browser;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cb_kb_query_state extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "3d743076b42bb8861778f9675c3b125f11763ac0470db5d295a3ab140ef49a91";
	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLSymbol $dtp_kb_query_state$;
	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4900L)
	public static SubLSymbol $cb_kb_query_being_saved$;
	private static SubLSymbol $sym0$KB_QUERY_STATE;
	private static SubLSymbol $sym1$KB_QUERY_STATE_P;
	private static SubLList $list2;
	private static SubLList $list3;
	private static SubLList $list4;
	private static SubLList $list5;
	private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
	private static SubLSymbol $sym7$KB_QUERY_STATE_PRINT_FUNCTION_TRAMPOLINE;
	private static SubLList $list8;
	private static SubLSymbol $sym9$KB_QUERY_STATE_QUERY_SPEC;
	private static SubLSymbol $sym10$_CSETF_KB_QUERY_STATE_QUERY_SPEC;
	private static SubLSymbol $sym11$KB_QUERY_STATE_NAME;
	private static SubLSymbol $sym12$_CSETF_KB_QUERY_STATE_NAME;
	private static SubLSymbol $sym13$KB_QUERY_STATE_COMMENTS;
	private static SubLSymbol $sym14$_CSETF_KB_QUERY_STATE_COMMENTS;
	private static SubLSymbol $sym15$KB_QUERY_STATE_TEST_STATE;
	private static SubLSymbol $sym16$_CSETF_KB_QUERY_STATE_TEST_STATE;
	private static SubLSymbol $sym17$KB_QUERY_STATE_SAVE_MT;
	private static SubLSymbol $sym18$_CSETF_KB_QUERY_STATE_SAVE_MT;
	private static SubLSymbol $sym19$KB_QUERY_STATE_INFERENCE;
	private static SubLSymbol $sym20$_CSETF_KB_QUERY_STATE_INFERENCE;
	private static SubLSymbol $sym21$KB_QUERY_STATE_SENTENCES;
	private static SubLSymbol $sym22$_CSETF_KB_QUERY_STATE_SENTENCES;
	private static SubLSymbol $sym23$KB_QUERY_STATE_QUERY_MTS;
	private static SubLSymbol $sym24$_CSETF_KB_QUERY_STATE_QUERY_MTS;
	private static SubLSymbol $sym25$KB_QUERY_STATE_TEMPLATE;
	private static SubLSymbol $sym26$_CSETF_KB_QUERY_STATE_TEMPLATE;
	private static SubLSymbol $sym27$KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS;
	private static SubLSymbol $sym28$_CSETF_KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS;
	private static SubLSymbol $sym29$KB_QUERY_STATE_TEMPLATE_GLOSSES;
	private static SubLSymbol $sym30$_CSETF_KB_QUERY_STATE_TEMPLATE_GLOSSES;
	private static SubLSymbol $sym31$KB_QUERY_STATE_QUERY_PROPERTIES;
	private static SubLSymbol $sym32$_CSETF_KB_QUERY_STATE_QUERY_PROPERTIES;
	private static SubLSymbol $sym33$KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE;
	private static SubLSymbol $sym34$_CSETF_KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE;
	private static SubLSymbol $sym35$KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS;
	private static SubLSymbol $sym36$_CSETF_KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS;
	private static SubLSymbol $kw$QUERY_SPEC;
	private static SubLSymbol $kw$NAME;
	private static SubLSymbol $kw$COMMENTS;
	private static SubLSymbol $kw$TEST_STATE;
	private static SubLSymbol $kw$SAVE_MT;
	private static SubLSymbol $kw$INFERENCE;
	private static SubLSymbol $kw$SENTENCES;
	private static SubLSymbol $kw$QUERY_MTS;
	private static SubLSymbol $kw$TEMPLATE;
	private static SubLSymbol $kw$TEMPLATE_FOLDER_MT_PAIRS;
	private static SubLSymbol $kw$TEMPLATE_GLOSSES;
	private static SubLSymbol $kw$QUERY_PROPERTIES;
	private static SubLSymbol $kw$NON_EXPLANATORY_SENTENCE;
	private static SubLSymbol $kw$MULTIPLE_CHOICE_OPTION_SPECS;
	private static SubLString $str51$Invalid_slot__S_for_construction_;
	private static SubLSymbol $kw$BEGIN;
	private static SubLSymbol $sym53$MAKE_KB_QUERY_STATE;
	private static SubLSymbol $kw$SLOT;
	private static SubLSymbol $kw$END;
	private static SubLSymbol $sym56$VISIT_DEFSTRUCT_OBJECT_KB_QUERY_STATE_METHOD;
	private static SubLSymbol $sym57$KBQ_QUERY_SPEC_P;
	private static SubLSymbol $sym58$KCT_TEST_STATE_P;
	private static SubLSymbol $sym59$INFERENCE_P;
	private static SubLSymbol $sym60$_CB_KB_QUERY_BEING_SAVED_;

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_print_function_trampoline(SubLObject v_object, SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_p(SubLObject v_object) {
		return (v_object.getClass() == $kb_query_state_native.class) ? T : NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_query_spec(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField2();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_name(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField3();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_comments(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField4();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_test_state(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField5();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_save_mt(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField6();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_inference(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField7();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_sentences(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField8();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_query_mts(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField9();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_template(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField10();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_template_folder_mt_pairs(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField11();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_template_glosses(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField12();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_query_properties(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField13();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_non_explanatory_sentence(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField14();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject kb_query_state_multiple_choice_option_specs(SubLObject v_object) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.getField15();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_query_spec(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField2(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_name(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField3(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_comments(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField4(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_test_state(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField5(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_save_mt(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField6(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_inference(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField7(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_sentences(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField8(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_query_mts(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField9(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_template(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField10(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_template_folder_mt_pairs(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField11(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_template_glosses(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField12(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_query_properties(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField13(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_non_explanatory_sentence(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField14(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject _csetf_kb_query_state_multiple_choice_option_specs(SubLObject v_object, SubLObject value) {
		assert NIL != kb_query_state_p(v_object) : v_object;
		return v_object.setField15(value);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject make_kb_query_state(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		SubLObject v_new = new $kb_query_state_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
			current_arg = next.first();
			current_value = conses_high.cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($kw$QUERY_SPEC)) {
				_csetf_kb_query_state_query_spec(v_new, current_value);
			} else if (pcase_var.eql($kw$NAME)) {
				_csetf_kb_query_state_name(v_new, current_value);
			} else if (pcase_var.eql($kw$COMMENTS)) {
				_csetf_kb_query_state_comments(v_new, current_value);
			} else if (pcase_var.eql($kw$TEST_STATE)) {
				_csetf_kb_query_state_test_state(v_new, current_value);
			} else if (pcase_var.eql($kw$SAVE_MT)) {
				_csetf_kb_query_state_save_mt(v_new, current_value);
			} else if (pcase_var.eql($kw$INFERENCE)) {
				_csetf_kb_query_state_inference(v_new, current_value);
			} else if (pcase_var.eql($kw$SENTENCES)) {
				_csetf_kb_query_state_sentences(v_new, current_value);
			} else if (pcase_var.eql($kw$QUERY_MTS)) {
				_csetf_kb_query_state_query_mts(v_new, current_value);
			} else if (pcase_var.eql($kw$TEMPLATE)) {
				_csetf_kb_query_state_template(v_new, current_value);
			} else if (pcase_var.eql($kw$TEMPLATE_FOLDER_MT_PAIRS)) {
				_csetf_kb_query_state_template_folder_mt_pairs(v_new, current_value);
			} else if (pcase_var.eql($kw$TEMPLATE_GLOSSES)) {
				_csetf_kb_query_state_template_glosses(v_new, current_value);
			} else if (pcase_var.eql($kw$QUERY_PROPERTIES)) {
				_csetf_kb_query_state_query_properties(v_new, current_value);
			} else if (pcase_var.eql($kw$NON_EXPLANATORY_SENTENCE)) {
				_csetf_kb_query_state_non_explanatory_sentence(v_new, current_value);
			} else if (pcase_var.eql($kw$MULTIPLE_CHOICE_OPTION_SPECS)) {
				_csetf_kb_query_state_multiple_choice_option_specs(v_new, current_value);
			} else {
				Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
			}
		}
		return v_new;
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject visit_defstruct_kb_query_state(SubLObject obj, SubLObject visitor_fn) {
		Functions.funcall(visitor_fn, obj, $kw$BEGIN, $sym53$MAKE_KB_QUERY_STATE, FOURTEEN_INTEGER);
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$QUERY_SPEC, kb_query_state_query_spec(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$NAME, kb_query_state_name(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$COMMENTS, kb_query_state_comments(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$TEST_STATE, kb_query_state_test_state(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$SAVE_MT, kb_query_state_save_mt(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$INFERENCE, kb_query_state_inference(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$SENTENCES, kb_query_state_sentences(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$QUERY_MTS, kb_query_state_query_mts(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$TEMPLATE, kb_query_state_template(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$TEMPLATE_FOLDER_MT_PAIRS,
				kb_query_state_template_folder_mt_pairs(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$TEMPLATE_GLOSSES, kb_query_state_template_glosses(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$QUERY_PROPERTIES, kb_query_state_query_properties(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$NON_EXPLANATORY_SENTENCE,
				kb_query_state_non_explanatory_sentence(obj));
		Functions.funcall(visitor_fn, obj, $kw$SLOT, $kw$MULTIPLE_CHOICE_OPTION_SPECS,
				kb_query_state_multiple_choice_option_specs(obj));
		Functions.funcall(visitor_fn, obj, $kw$END, $sym53$MAKE_KB_QUERY_STATE, FOURTEEN_INTEGER);
		return obj;
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 800L)
	public static SubLObject visit_defstruct_object_kb_query_state_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_kb_query_state(obj, visitor_fn);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 1700L)
	public static SubLObject cb_kbq_new_query_state_from_query_spec(SubLObject query_spec, SubLObject test_state) {
		if (test_state == UNPROVIDED) {
			test_state = NIL;
		}
		assert NIL != kb_query.kbq_query_spec_p(query_spec) : query_spec;
		if ((NIL != test_state) && !assertionsDisabledInClass && (NIL == cb_kct_test.kct_test_state_p(test_state)))
			throw new AssertionError(test_state);
		SubLObject query_state = make_kb_query_state(UNPROVIDED);
		_csetf_kb_query_state_query_spec(query_state, query_spec);
		_csetf_kb_query_state_name(query_state, cb_utilities.cb_string_for_fort(query_spec));
		_csetf_kb_query_state_comments(query_state, kb_query.kbq_comments(query_spec));
		_csetf_kb_query_state_test_state(query_state, test_state);
		_csetf_kb_query_state_save_mt(query_state, kb_query.kbq_defining_mt(query_spec));
		_csetf_kb_query_state_sentences(query_state, kb_query.kbq_sentences(query_spec));
		_csetf_kb_query_state_non_explanatory_sentence(query_state, kb_query.kbq_pragmatics(query_spec));
		_csetf_kb_query_state_query_mts(query_state, kb_query.kbq_mts(query_spec));
		_csetf_kb_query_state_template(query_state, kb_query.kbq_template(query_spec));
		if (NIL != kb_query_state_template(query_state)) {
			_csetf_kb_query_state_template_folder_mt_pairs(query_state,
					kb_query.template_folders(kb_query_state_template(query_state)));
			_csetf_kb_query_state_template_glosses(query_state,
					kb_query.kbq_template_glosses(kb_query_state_template(query_state)));
		}
		_csetf_kb_query_state_query_properties(query_state,
				conses_high.remf(kb_query.kbq_query_properties(query_spec), $kw$NON_EXPLANATORY_SENTENCE));
		_csetf_kb_query_state_multiple_choice_option_specs(query_state,
				kb_query.kbq_multiple_choice_option_specs(query_spec));
		return query_state;
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 3300L)
	public static SubLObject cb_kbq_new_query_state_from_inference(SubLObject inference, SubLObject test_state) {
		if (test_state == UNPROVIDED) {
			test_state = NIL;
		}
		assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
		if ((NIL != test_state) && !assertionsDisabledInClass && (NIL == cb_kct_test.kct_test_state_p(test_state)))
			throw new AssertionError(test_state);
		SubLObject query_state = make_kb_query_state(UNPROVIDED);
		_csetf_kb_query_state_query_spec(query_state, cb_kb_query.kbq_lookup_query_spec_by_inference(inference));
		_csetf_kb_query_state_save_mt(query_state, kb_query.kbq_default_defining_mt());
		_csetf_kb_query_state_inference(query_state, inference);
		_csetf_kb_query_state_sentences(query_state,
				list(inference_datastructures_inference.inference_input_el_query(inference)));
		_csetf_kb_query_state_query_mts(query_state,
				list(inference_datastructures_inference.inference_input_mt(inference)));
		_csetf_kb_query_state_query_properties(query_state,
				inference_datastructures_inference.inference_input_query_properties(inference));
		_csetf_kb_query_state_non_explanatory_sentence(query_state,
				inference_datastructures_inference.inference_input_non_explanatory_el_query(inference));
		_csetf_kb_query_state_multiple_choice_option_specs(query_state, NIL);
		return query_state;
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4300L)
	public static SubLObject kb_query_state_best_sentence(SubLObject query_state) {
		assert NIL != kb_query_state_p(query_state) : query_state;
		return kb_query_state_sentences(query_state).first();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4400L)
	public static SubLObject kb_query_state_other_sentences(SubLObject query_state) {
		assert NIL != kb_query_state_p(query_state) : query_state;
		return kb_query_state_sentences(query_state).rest();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4600L)
	public static SubLObject kb_query_state_best_mt(SubLObject query_state) {
		assert NIL != kb_query_state_p(query_state) : query_state;
		return kb_query_state_query_mts(query_state).first();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4700L)
	public static SubLObject kb_query_state_other_mts(SubLObject query_state) {
		assert NIL != kb_query_state_p(query_state) : query_state;
		return kb_query_state_query_mts(query_state).rest();
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 5100L)
	public static SubLObject cb_clear_kb_query_being_saved() {
		$cb_kb_query_being_saved$.setDynamicValue(NIL);
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 5200L)
	public static SubLObject cb_kb_query_being_saved() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return $cb_kb_query_being_saved$.getDynamicValue(thread);
	}

	@SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 5300L)
	public static SubLObject cb_set_kb_query_being_saved(SubLObject kb_query_state) {
		$cb_kb_query_being_saved$.setDynamicValue(kb_query_state);
		return kb_query_state;
	}

	public static SubLObject declare_cb_kb_query_state_file() {
		declareFunction("kb_query_state_print_function_trampoline", "KB-QUERY-STATE-PRINT-FUNCTION-TRAMPOLINE",
				2, 0, false);
		declareFunction("kb_query_state_p", "KB-QUERY-STATE-P", 1, 0, false);
		new $kb_query_state_p$UnaryFunction();
		declareFunction("kb_query_state_query_spec", "KB-QUERY-STATE-QUERY-SPEC", 1, 0, false);
		declareFunction("kb_query_state_name", "KB-QUERY-STATE-NAME", 1, 0, false);
		declareFunction("kb_query_state_comments", "KB-QUERY-STATE-COMMENTS", 1, 0, false);
		declareFunction("kb_query_state_test_state", "KB-QUERY-STATE-TEST-STATE", 1, 0, false);
		declareFunction("kb_query_state_save_mt", "KB-QUERY-STATE-SAVE-MT", 1, 0, false);
		declareFunction("kb_query_state_inference", "KB-QUERY-STATE-INFERENCE", 1, 0, false);
		declareFunction("kb_query_state_sentences", "KB-QUERY-STATE-SENTENCES", 1, 0, false);
		declareFunction("kb_query_state_query_mts", "KB-QUERY-STATE-QUERY-MTS", 1, 0, false);
		declareFunction("kb_query_state_template", "KB-QUERY-STATE-TEMPLATE", 1, 0, false);
		declareFunction("kb_query_state_template_folder_mt_pairs", "KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS", 1,
				0, false);
		declareFunction("kb_query_state_template_glosses", "KB-QUERY-STATE-TEMPLATE-GLOSSES", 1, 0, false);
		declareFunction("kb_query_state_query_properties", "KB-QUERY-STATE-QUERY-PROPERTIES", 1, 0, false);
		declareFunction("kb_query_state_non_explanatory_sentence", "KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE", 1,
				0, false);
		declareFunction("kb_query_state_multiple_choice_option_specs",
				"KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS", 1, 0, false);
		declareFunction("_csetf_kb_query_state_query_spec", "_CSETF-KB-QUERY-STATE-QUERY-SPEC", 2, 0, false);
		declareFunction("_csetf_kb_query_state_name", "_CSETF-KB-QUERY-STATE-NAME", 2, 0, false);
		declareFunction("_csetf_kb_query_state_comments", "_CSETF-KB-QUERY-STATE-COMMENTS", 2, 0, false);
		declareFunction("_csetf_kb_query_state_test_state", "_CSETF-KB-QUERY-STATE-TEST-STATE", 2, 0, false);
		declareFunction("_csetf_kb_query_state_save_mt", "_CSETF-KB-QUERY-STATE-SAVE-MT", 2, 0, false);
		declareFunction("_csetf_kb_query_state_inference", "_CSETF-KB-QUERY-STATE-INFERENCE", 2, 0, false);
		declareFunction("_csetf_kb_query_state_sentences", "_CSETF-KB-QUERY-STATE-SENTENCES", 2, 0, false);
		declareFunction("_csetf_kb_query_state_query_mts", "_CSETF-KB-QUERY-STATE-QUERY-MTS", 2, 0, false);
		declareFunction("_csetf_kb_query_state_template", "_CSETF-KB-QUERY-STATE-TEMPLATE", 2, 0, false);
		declareFunction("_csetf_kb_query_state_template_folder_mt_pairs",
				"_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS", 2, 0, false);
		declareFunction("_csetf_kb_query_state_template_glosses", "_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES", 2,
				0, false);
		declareFunction("_csetf_kb_query_state_query_properties", "_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES", 2,
				0, false);
		declareFunction("_csetf_kb_query_state_non_explanatory_sentence",
				"_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE", 2, 0, false);
		declareFunction("_csetf_kb_query_state_multiple_choice_option_specs",
				"_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS", 2, 0, false);
		declareFunction("make_kb_query_state", "MAKE-KB-QUERY-STATE", 0, 1, false);
		declareFunction("visit_defstruct_kb_query_state", "VISIT-DEFSTRUCT-KB-QUERY-STATE", 2, 0, false);
		declareFunction("visit_defstruct_object_kb_query_state_method",
				"VISIT-DEFSTRUCT-OBJECT-KB-QUERY-STATE-METHOD", 2, 0, false);
		declareFunction("cb_kbq_new_query_state_from_query_spec", "CB-KBQ-NEW-QUERY-STATE-FROM-QUERY-SPEC", 1,
				1, false);
		declareFunction("cb_kbq_new_query_state_from_inference", "CB-KBQ-NEW-QUERY-STATE-FROM-INFERENCE", 1, 1,
				false);
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
		$dtp_kb_query_state$ = defconstant("*DTP-KB-QUERY-STATE*", $sym0$KB_QUERY_STATE);
		$cb_kb_query_being_saved$ = defvar("*CB-KB-QUERY-BEING-SAVED*", NIL);
		return NIL;
	}

	public static SubLObject setup_cb_kb_query_state_file() {
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				$dtp_kb_query_state$.getGlobalValue(),
				Symbols.symbol_function($sym7$KB_QUERY_STATE_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list8);
		Structures.def_csetf($sym9$KB_QUERY_STATE_QUERY_SPEC, $sym10$_CSETF_KB_QUERY_STATE_QUERY_SPEC);
		Structures.def_csetf($sym11$KB_QUERY_STATE_NAME, $sym12$_CSETF_KB_QUERY_STATE_NAME);
		Structures.def_csetf($sym13$KB_QUERY_STATE_COMMENTS, $sym14$_CSETF_KB_QUERY_STATE_COMMENTS);
		Structures.def_csetf($sym15$KB_QUERY_STATE_TEST_STATE, $sym16$_CSETF_KB_QUERY_STATE_TEST_STATE);
		Structures.def_csetf($sym17$KB_QUERY_STATE_SAVE_MT, $sym18$_CSETF_KB_QUERY_STATE_SAVE_MT);
		Structures.def_csetf($sym19$KB_QUERY_STATE_INFERENCE, $sym20$_CSETF_KB_QUERY_STATE_INFERENCE);
		Structures.def_csetf($sym21$KB_QUERY_STATE_SENTENCES, $sym22$_CSETF_KB_QUERY_STATE_SENTENCES);
		Structures.def_csetf($sym23$KB_QUERY_STATE_QUERY_MTS, $sym24$_CSETF_KB_QUERY_STATE_QUERY_MTS);
		Structures.def_csetf($sym25$KB_QUERY_STATE_TEMPLATE, $sym26$_CSETF_KB_QUERY_STATE_TEMPLATE);
		Structures.def_csetf($sym27$KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS,
				$sym28$_CSETF_KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS);
		Structures.def_csetf($sym29$KB_QUERY_STATE_TEMPLATE_GLOSSES, $sym30$_CSETF_KB_QUERY_STATE_TEMPLATE_GLOSSES);
		Structures.def_csetf($sym31$KB_QUERY_STATE_QUERY_PROPERTIES, $sym32$_CSETF_KB_QUERY_STATE_QUERY_PROPERTIES);
		Structures.def_csetf($sym33$KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE,
				$sym34$_CSETF_KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE);
		Structures.def_csetf($sym35$KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS,
				$sym36$_CSETF_KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS);
		Equality.identity($sym0$KB_QUERY_STATE);
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				$dtp_kb_query_state$.getGlobalValue(),
				Symbols.symbol_function($sym56$VISIT_DEFSTRUCT_OBJECT_KB_QUERY_STATE_METHOD));
		utilities_macros.register_html_state_variable($sym60$_CB_KB_QUERY_BEING_SAVED_);
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
		me = new cb_kb_query_state();
		$dtp_kb_query_state$ = null;
		$cb_kb_query_being_saved$ = null;
		$sym0$KB_QUERY_STATE = makeSymbol("KB-QUERY-STATE");
		$sym1$KB_QUERY_STATE_P = makeSymbol("KB-QUERY-STATE-P");
		$list2 = list(new SubLObject[] { makeSymbol("QUERY-SPEC"), makeSymbol("NAME"), makeSymbol("COMMENTS"),
				makeSymbol("TEST-STATE"), makeSymbol("SAVE-MT"), makeSymbol("INFERENCE"), makeSymbol("SENTENCES"),
				makeSymbol("QUERY-MTS"), makeSymbol("TEMPLATE"), makeSymbol("TEMPLATE-FOLDER-MT-PAIRS"),
				makeSymbol("TEMPLATE-GLOSSES"), makeSymbol("QUERY-PROPERTIES"), makeSymbol("NON-EXPLANATORY-SENTENCE"),
				makeSymbol("MULTIPLE-CHOICE-OPTION-SPECS") });
		$list3 = list(new SubLObject[] { makeKeyword("QUERY-SPEC"), makeKeyword("NAME"), makeKeyword("COMMENTS"),
				makeKeyword("TEST-STATE"), makeKeyword("SAVE-MT"), makeKeyword("INFERENCE"), makeKeyword("SENTENCES"),
				makeKeyword("QUERY-MTS"), makeKeyword("TEMPLATE"), makeKeyword("TEMPLATE-FOLDER-MT-PAIRS"),
				makeKeyword("TEMPLATE-GLOSSES"), makeKeyword("QUERY-PROPERTIES"),
				makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("MULTIPLE-CHOICE-OPTION-SPECS") });
		$list4 = list(new SubLObject[] { makeSymbol("KB-QUERY-STATE-QUERY-SPEC"), makeSymbol("KB-QUERY-STATE-NAME"),
				makeSymbol("KB-QUERY-STATE-COMMENTS"), makeSymbol("KB-QUERY-STATE-TEST-STATE"),
				makeSymbol("KB-QUERY-STATE-SAVE-MT"), makeSymbol("KB-QUERY-STATE-INFERENCE"),
				makeSymbol("KB-QUERY-STATE-SENTENCES"), makeSymbol("KB-QUERY-STATE-QUERY-MTS"),
				makeSymbol("KB-QUERY-STATE-TEMPLATE"), makeSymbol("KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS"),
				makeSymbol("KB-QUERY-STATE-TEMPLATE-GLOSSES"), makeSymbol("KB-QUERY-STATE-QUERY-PROPERTIES"),
				makeSymbol("KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE"),
				makeSymbol("KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS") });
		$list5 = list(new SubLObject[] { makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-SPEC"),
				makeSymbol("_CSETF-KB-QUERY-STATE-NAME"), makeSymbol("_CSETF-KB-QUERY-STATE-COMMENTS"),
				makeSymbol("_CSETF-KB-QUERY-STATE-TEST-STATE"), makeSymbol("_CSETF-KB-QUERY-STATE-SAVE-MT"),
				makeSymbol("_CSETF-KB-QUERY-STATE-INFERENCE"), makeSymbol("_CSETF-KB-QUERY-STATE-SENTENCES"),
				makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-MTS"), makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE"),
				makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS"),
				makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES"),
				makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES"),
				makeSymbol("_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE"),
				makeSymbol("_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS") });
		$sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
		$sym7$KB_QUERY_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-QUERY-STATE-PRINT-FUNCTION-TRAMPOLINE");
		$list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KB-QUERY-STATE-P"));
		$sym9$KB_QUERY_STATE_QUERY_SPEC = makeSymbol("KB-QUERY-STATE-QUERY-SPEC");
		$sym10$_CSETF_KB_QUERY_STATE_QUERY_SPEC = makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-SPEC");
		$sym11$KB_QUERY_STATE_NAME = makeSymbol("KB-QUERY-STATE-NAME");
		$sym12$_CSETF_KB_QUERY_STATE_NAME = makeSymbol("_CSETF-KB-QUERY-STATE-NAME");
		$sym13$KB_QUERY_STATE_COMMENTS = makeSymbol("KB-QUERY-STATE-COMMENTS");
		$sym14$_CSETF_KB_QUERY_STATE_COMMENTS = makeSymbol("_CSETF-KB-QUERY-STATE-COMMENTS");
		$sym15$KB_QUERY_STATE_TEST_STATE = makeSymbol("KB-QUERY-STATE-TEST-STATE");
		$sym16$_CSETF_KB_QUERY_STATE_TEST_STATE = makeSymbol("_CSETF-KB-QUERY-STATE-TEST-STATE");
		$sym17$KB_QUERY_STATE_SAVE_MT = makeSymbol("KB-QUERY-STATE-SAVE-MT");
		$sym18$_CSETF_KB_QUERY_STATE_SAVE_MT = makeSymbol("_CSETF-KB-QUERY-STATE-SAVE-MT");
		$sym19$KB_QUERY_STATE_INFERENCE = makeSymbol("KB-QUERY-STATE-INFERENCE");
		$sym20$_CSETF_KB_QUERY_STATE_INFERENCE = makeSymbol("_CSETF-KB-QUERY-STATE-INFERENCE");
		$sym21$KB_QUERY_STATE_SENTENCES = makeSymbol("KB-QUERY-STATE-SENTENCES");
		$sym22$_CSETF_KB_QUERY_STATE_SENTENCES = makeSymbol("_CSETF-KB-QUERY-STATE-SENTENCES");
		$sym23$KB_QUERY_STATE_QUERY_MTS = makeSymbol("KB-QUERY-STATE-QUERY-MTS");
		$sym24$_CSETF_KB_QUERY_STATE_QUERY_MTS = makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-MTS");
		$sym25$KB_QUERY_STATE_TEMPLATE = makeSymbol("KB-QUERY-STATE-TEMPLATE");
		$sym26$_CSETF_KB_QUERY_STATE_TEMPLATE = makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE");
		$sym27$KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS = makeSymbol("KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS");
		$sym28$_CSETF_KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS = makeSymbol(
				"_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS");
		$sym29$KB_QUERY_STATE_TEMPLATE_GLOSSES = makeSymbol("KB-QUERY-STATE-TEMPLATE-GLOSSES");
		$sym30$_CSETF_KB_QUERY_STATE_TEMPLATE_GLOSSES = makeSymbol("_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES");
		$sym31$KB_QUERY_STATE_QUERY_PROPERTIES = makeSymbol("KB-QUERY-STATE-QUERY-PROPERTIES");
		$sym32$_CSETF_KB_QUERY_STATE_QUERY_PROPERTIES = makeSymbol("_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES");
		$sym33$KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE = makeSymbol("KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE");
		$sym34$_CSETF_KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE = makeSymbol(
				"_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE");
		$sym35$KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS = makeSymbol("KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS");
		$sym36$_CSETF_KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS = makeSymbol(
				"_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS");
		$kw$QUERY_SPEC = makeKeyword("QUERY-SPEC");
		$kw$NAME = makeKeyword("NAME");
		$kw$COMMENTS = makeKeyword("COMMENTS");
		$kw$TEST_STATE = makeKeyword("TEST-STATE");
		$kw$SAVE_MT = makeKeyword("SAVE-MT");
		$kw$INFERENCE = makeKeyword("INFERENCE");
		$kw$SENTENCES = makeKeyword("SENTENCES");
		$kw$QUERY_MTS = makeKeyword("QUERY-MTS");
		$kw$TEMPLATE = makeKeyword("TEMPLATE");
		$kw$TEMPLATE_FOLDER_MT_PAIRS = makeKeyword("TEMPLATE-FOLDER-MT-PAIRS");
		$kw$TEMPLATE_GLOSSES = makeKeyword("TEMPLATE-GLOSSES");
		$kw$QUERY_PROPERTIES = makeKeyword("QUERY-PROPERTIES");
		$kw$NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");
		$kw$MULTIPLE_CHOICE_OPTION_SPECS = makeKeyword("MULTIPLE-CHOICE-OPTION-SPECS");
		$str51$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
		$kw$BEGIN = makeKeyword("BEGIN");
		$sym53$MAKE_KB_QUERY_STATE = makeSymbol("MAKE-KB-QUERY-STATE");
		$kw$SLOT = makeKeyword("SLOT");
		$kw$END = makeKeyword("END");
		$sym56$VISIT_DEFSTRUCT_OBJECT_KB_QUERY_STATE_METHOD = makeSymbol(
				"VISIT-DEFSTRUCT-OBJECT-KB-QUERY-STATE-METHOD");
		$sym57$KBQ_QUERY_SPEC_P = makeSymbol("KBQ-QUERY-SPEC-P");
		$sym58$KCT_TEST_STATE_P = makeSymbol("KCT-TEST-STATE-P");
		$sym59$INFERENCE_P = makeSymbol("INFERENCE-P");
		$sym60$_CB_KB_QUERY_BEING_SAVED_ = makeSymbol("*CB-KB-QUERY-BEING-SAVED*");
	}

	public static class $kb_query_state_native extends SubLStructNative {
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
		private static SubLStructDeclNative structDecl;

		public $kb_query_state_native() {
			this.$query_spec = CommonSymbols.NIL;
			this.$name = CommonSymbols.NIL;
			this.$comments = CommonSymbols.NIL;
			this.$test_state = CommonSymbols.NIL;
			this.$save_mt = CommonSymbols.NIL;
			this.$inference = CommonSymbols.NIL;
			this.$sentences = CommonSymbols.NIL;
			this.$query_mts = CommonSymbols.NIL;
			this.$template = CommonSymbols.NIL;
			this.$template_folder_mt_pairs = CommonSymbols.NIL;
			this.$template_glosses = CommonSymbols.NIL;
			this.$query_properties = CommonSymbols.NIL;
			this.$non_explanatory_sentence = CommonSymbols.NIL;
			this.$multiple_choice_option_specs = CommonSymbols.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return $kb_query_state_native.structDecl;
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
		public SubLObject setField2(SubLObject value) {
			return this.$query_spec = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return this.$name = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return this.$comments = value;
		}

		@Override
		public SubLObject setField5(SubLObject value) {
			return this.$test_state = value;
		}

		@Override
		public SubLObject setField6(SubLObject value) {
			return this.$save_mt = value;
		}

		@Override
		public SubLObject setField7(SubLObject value) {
			return this.$inference = value;
		}

		@Override
		public SubLObject setField8(SubLObject value) {
			return this.$sentences = value;
		}

		@Override
		public SubLObject setField9(SubLObject value) {
			return this.$query_mts = value;
		}

		@Override
		public SubLObject setField10(SubLObject value) {
			return this.$template = value;
		}

		@Override
		public SubLObject setField11(SubLObject value) {
			return this.$template_folder_mt_pairs = value;
		}

		@Override
		public SubLObject setField12(SubLObject value) {
			return this.$template_glosses = value;
		}

		@Override
		public SubLObject setField13(SubLObject value) {
			return this.$query_properties = value;
		}

		@Override
		public SubLObject setField14(SubLObject value) {
			return this.$non_explanatory_sentence = value;
		}

		@Override
		public SubLObject setField15(SubLObject value) {
			return this.$multiple_choice_option_specs = value;
		}

		static {
			structDecl = Structures.makeStructDeclNative($kb_query_state_native.class, $sym0$KB_QUERY_STATE,
					$sym1$KB_QUERY_STATE_P, $list2, $list3,
					new String[] { "$query_spec", "$name", "$comments", "$test_state", "$save_mt", "$inference",
							"$sentences", "$query_mts", "$template", "$template_folder_mt_pairs", "$template_glosses",
							"$query_properties", "$non_explanatory_sentence", "$multiple_choice_option_specs" },
					$list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
		}
	}

	public static class $kb_query_state_p$UnaryFunction extends UnaryFunction {
		public $kb_query_state_p$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("KB-QUERY-STATE-P"));
		}

		@Override
		public SubLObject processItem(SubLObject arg1) {
			return kb_query_state_p(arg1);
		}
	}
}
/*
 *
 * Total time: 123 ms synthetic
 */