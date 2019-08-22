/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HALO-QA-INTERFACE
 *  source file: /cyc/top/cycl/halo-qa-interface.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class halo_qa_interface extends SubLTranslatedFile implements V02 {
    // // Constructor
    private halo_qa_interface() {
    }

    public static final SubLFile me = new halo_qa_interface();


    // // Definitions
    // defparameter
    public static final SubLSymbol $halo_default_test_specification$ = makeSymbol("*HALO-DEFAULT-TEST-SPECIFICATION*");

    // defparameter
    public static final SubLSymbol $halo_default_output_file$ = makeSymbol("*HALO-DEFAULT-OUTPUT-FILE*");

    // defparameter
    public static final SubLSymbol $halo_default_query_mt$ = makeSymbol("*HALO-DEFAULT-QUERY-MT*");



    /**
     * Should we destroy ephemeral terms after inference?
     */
    // defparameter
    public static final SubLSymbol $halo_destroy_ephemeral_termsP$ = makeSymbol("*HALO-DESTROY-EPHEMERAL-TERMS?*");

    /**
     * Should we refrain from showing the paraphrase of the CycL representation of the question?
     */
    // defparameter
    public static final SubLSymbol $halo_suppress_query_formula_displayP$ = makeSymbol("*HALO-SUPPRESS-QUERY-FORMULA-DISPLAY?*");

    /**
     * Should we refrain from showing the paraphrase of the CycL representation of QUERY-SPEC?
     */
    public static final SubLObject halo_query_spec_show_question_p(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(NIL == $halo_suppress_query_formula_displayP$.getDynamicValue(thread));
        }
    }

    /**
     * Should we print out debug information?
     */
    // defparameter
    public static final SubLSymbol $halo_trace$ = makeSymbol("*HALO-TRACE*");

    public static final SubLObject maybe_with_halo_sbhl_resourcing(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(PIF, $list_alt4, listS(WITH_SBHL_RESOURCED_MARKING_SPACES, $halo_qa_resourcing_spaces$, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
        }
    }

    // deflexical
    private static final SubLSymbol $halo_qa_interface_intitialized$ = makeSymbol("*HALO-QA-INTERFACE-INTITIALIZED*");

    public static final SubLObject initialize_halo_qa_interface() {
        eval($list_alt8);
        $halo_qa_interface_intitialized$.setGlobalValue(T);
        return $halo_qa_interface_intitialized$.getGlobalValue();
    }

    public static final SubLObject ensure_halo_qa_interface_initialized() {
        if (NIL == $halo_qa_interface_intitialized$.getGlobalValue()) {
            return initialize_halo_qa_interface();
        }
        return NIL;
    }

    public static final class $halo_query_specification_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return halo_qa_interface.$halo_query_specification_native.structDecl;
        }

        public SubLObject getField2() {
            return $cycl_id;
        }

        public SubLObject getField3() {
            return $number;
        }

        public SubLObject getField4() {
            return $formula;
        }

        public SubLObject getField5() {
            return $query_a;
        }

        public SubLObject getField6() {
            return $neg_query_a;
        }

        public SubLObject getField7() {
            return $query_b;
        }

        public SubLObject getField8() {
            return $neg_query_b;
        }

        public SubLObject getField9() {
            return $query_c;
        }

        public SubLObject getField10() {
            return $neg_query_c;
        }

        public SubLObject getField11() {
            return $query_d;
        }

        public SubLObject getField12() {
            return $neg_query_d;
        }

        public SubLObject getField13() {
            return $query_e;
        }

        public SubLObject getField14() {
            return $neg_query_e;
        }

        public SubLObject getField15() {
            return $bindings;
        }

        public SubLObject getField16() {
            return $answer;
        }

        public SubLObject getField17() {
            return $answer_just;
        }

        public SubLObject getField18() {
            return $correct_answer;
        }

        public SubLObject getField19() {
            return $time;
        }

        public SubLObject getField20() {
            return $mt;
        }

        public SubLObject getField21() {
            return $comment;
        }

        public SubLObject getField22() {
            return $static_properties;
        }

        public SubLObject getField23() {
            return $dynamic_properties;
        }

        public SubLObject getField24() {
            return $multiple_choiceP;
        }

        public SubLObject getField25() {
            return $generate_consequentP;
        }

        public SubLObject getField26() {
            return $max_number_of_results;
        }

        public SubLObject getField27() {
            return $back_chaining;
        }

        public SubLObject getField28() {
            return $time_cutoff_secs;
        }

        public SubLObject getField29() {
            return $max_depth;
        }

        public SubLObject getField30() {
            return $removal_cost_cutoff;
        }

        public SubLObject getField31() {
            return $enable_negation_by_failure;
        }

        public SubLObject getField32() {
            return $enable_hl_predicate_backchaining;
        }

        public SubLObject getField33() {
            return $enable_cache_backwards_query_results;
        }

        public SubLObject getField34() {
            return $enable_unbound_predicate_backchaining;
        }

        public SubLObject getField35() {
            return $intermediate_step_validation_level;
        }

        public SubLObject setField2(SubLObject value) {
            return $cycl_id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $number = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $formula = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $query_a = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $neg_query_a = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $query_b = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $neg_query_b = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $query_c = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $neg_query_c = value;
        }

        public SubLObject setField11(SubLObject value) {
            return $query_d = value;
        }

        public SubLObject setField12(SubLObject value) {
            return $neg_query_d = value;
        }

        public SubLObject setField13(SubLObject value) {
            return $query_e = value;
        }

        public SubLObject setField14(SubLObject value) {
            return $neg_query_e = value;
        }

        public SubLObject setField15(SubLObject value) {
            return $bindings = value;
        }

        public SubLObject setField16(SubLObject value) {
            return $answer = value;
        }

        public SubLObject setField17(SubLObject value) {
            return $answer_just = value;
        }

        public SubLObject setField18(SubLObject value) {
            return $correct_answer = value;
        }

        public SubLObject setField19(SubLObject value) {
            return $time = value;
        }

        public SubLObject setField20(SubLObject value) {
            return $mt = value;
        }

        public SubLObject setField21(SubLObject value) {
            return $comment = value;
        }

        public SubLObject setField22(SubLObject value) {
            return $static_properties = value;
        }

        public SubLObject setField23(SubLObject value) {
            return $dynamic_properties = value;
        }

        public SubLObject setField24(SubLObject value) {
            return $multiple_choiceP = value;
        }

        public SubLObject setField25(SubLObject value) {
            return $generate_consequentP = value;
        }

        public SubLObject setField26(SubLObject value) {
            return $max_number_of_results = value;
        }

        public SubLObject setField27(SubLObject value) {
            return $back_chaining = value;
        }

        public SubLObject setField28(SubLObject value) {
            return $time_cutoff_secs = value;
        }

        public SubLObject setField29(SubLObject value) {
            return $max_depth = value;
        }

        public SubLObject setField30(SubLObject value) {
            return $removal_cost_cutoff = value;
        }

        public SubLObject setField31(SubLObject value) {
            return $enable_negation_by_failure = value;
        }

        public SubLObject setField32(SubLObject value) {
            return $enable_hl_predicate_backchaining = value;
        }

        public SubLObject setField33(SubLObject value) {
            return $enable_cache_backwards_query_results = value;
        }

        public SubLObject setField34(SubLObject value) {
            return $enable_unbound_predicate_backchaining = value;
        }

        public SubLObject setField35(SubLObject value) {
            return $intermediate_step_validation_level = value;
        }

        public SubLObject $cycl_id = Lisp.NIL;

        public SubLObject $number = Lisp.NIL;

        public SubLObject $formula = Lisp.NIL;

        public SubLObject $query_a = Lisp.NIL;

        public SubLObject $neg_query_a = Lisp.NIL;

        public SubLObject $query_b = Lisp.NIL;

        public SubLObject $neg_query_b = Lisp.NIL;

        public SubLObject $query_c = Lisp.NIL;

        public SubLObject $neg_query_c = Lisp.NIL;

        public SubLObject $query_d = Lisp.NIL;

        public SubLObject $neg_query_d = Lisp.NIL;

        public SubLObject $query_e = Lisp.NIL;

        public SubLObject $neg_query_e = Lisp.NIL;

        public SubLObject $bindings = Lisp.NIL;

        public SubLObject $answer = Lisp.NIL;

        public SubLObject $answer_just = Lisp.NIL;

        public SubLObject $correct_answer = Lisp.NIL;

        public SubLObject $time = Lisp.NIL;

        public SubLObject $mt = Lisp.NIL;

        public SubLObject $comment = Lisp.NIL;

        public SubLObject $static_properties = Lisp.NIL;

        public SubLObject $dynamic_properties = Lisp.NIL;

        public SubLObject $multiple_choiceP = Lisp.NIL;

        public SubLObject $generate_consequentP = Lisp.NIL;

        public SubLObject $max_number_of_results = Lisp.NIL;

        public SubLObject $back_chaining = Lisp.NIL;

        public SubLObject $time_cutoff_secs = Lisp.NIL;

        public SubLObject $max_depth = Lisp.NIL;

        public SubLObject $removal_cost_cutoff = Lisp.NIL;

        public SubLObject $enable_negation_by_failure = Lisp.NIL;

        public SubLObject $enable_hl_predicate_backchaining = Lisp.NIL;

        public SubLObject $enable_cache_backwards_query_results = Lisp.NIL;

        public SubLObject $enable_unbound_predicate_backchaining = Lisp.NIL;

        public SubLObject $intermediate_step_validation_level = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(halo_qa_interface.$halo_query_specification_native.class, HALO_QUERY_SPECIFICATION, HALO_QUERY_SPECIFICATION_P, $list_alt11, $list_alt12, new String[]{ "$cycl_id", "$number", "$formula", "$query_a", "$neg_query_a", "$query_b", "$neg_query_b", "$query_c", "$neg_query_c", "$query_d", "$neg_query_d", "$query_e", "$neg_query_e", "$bindings", "$answer", "$answer_just", "$correct_answer", "$time", "$mt", "$comment", "$static_properties", "$dynamic_properties", "$multiple_choiceP", "$generate_consequentP", "$max_number_of_results", "$back_chaining", "$time_cutoff_secs", "$max_depth", "$removal_cost_cutoff", "$enable_negation_by_failure", "$enable_hl_predicate_backchaining", "$enable_cache_backwards_query_results", "$enable_unbound_predicate_backchaining", "$intermediate_step_validation_level" }, $list_alt13, $list_alt14, HALO_QUERY_SPECIFICATION_PRINT);
    }

    // defconstant
    public static final SubLSymbol $dtp_halo_query_specification$ = makeSymbol("*DTP-HALO-QUERY-SPECIFICATION*");

    public static final SubLObject halo_query_specification_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        halo_query_specification_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject halo_query_specification_p(SubLObject v_object) {
        return v_object.getJavaClass() ==halo_qa_interface.$halo_query_specification_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $halo_query_specification_p$UnaryFunction extends UnaryFunction {
        public $halo_query_specification_p$UnaryFunction() {
            super(extractFunctionNamed("HALO-QUERY-SPECIFICATION-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return halo_query_specification_p(arg1);
        }
    }

    public static final SubLObject halo_query_spec_cycl_id(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField2();
    }

    public static final SubLObject halo_query_spec_number(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField3();
    }

    public static final SubLObject halo_query_spec_formula(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField4();
    }

    public static final SubLObject halo_query_spec_query_a(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField5();
    }

    public static final SubLObject halo_query_spec_neg_query_a(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField6();
    }

    public static final SubLObject halo_query_spec_query_b(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField7();
    }

    public static final SubLObject halo_query_spec_neg_query_b(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField8();
    }

    public static final SubLObject halo_query_spec_query_c(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField9();
    }

    public static final SubLObject halo_query_spec_neg_query_c(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField10();
    }

    public static final SubLObject halo_query_spec_query_d(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField11();
    }

    public static final SubLObject halo_query_spec_neg_query_d(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField12();
    }

    public static final SubLObject halo_query_spec_query_e(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField13();
    }

    public static final SubLObject halo_query_spec_neg_query_e(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField14();
    }

    public static final SubLObject halo_query_spec_bindings(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField15();
    }

    public static final SubLObject halo_query_spec_answer(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField16();
    }

    public static final SubLObject halo_query_spec_answer_just(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField17();
    }

    public static final SubLObject halo_query_spec_correct_answer(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField18();
    }

    public static final SubLObject halo_query_spec_time(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField19();
    }

    public static final SubLObject halo_query_spec_mt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.getField20();
    }

    public static final SubLObject halo_query_spec_comment(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$comment;
    }

    public static final SubLObject halo_query_spec_static_properties(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$static_properties;
    }

    public static final SubLObject halo_query_spec_dynamic_properties(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$dynamic_properties;
    }

    public static final SubLObject halo_query_spec_multiple_choiceP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$multiple_choiceP;
    }

    public static final SubLObject halo_query_spec_generate_consequentP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$generate_consequentP;
    }

    public static final SubLObject halo_query_spec_max_number_of_results(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$max_number_of_results;
    }

    public static final SubLObject halo_query_spec_back_chaining(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$back_chaining;
    }

    public static final SubLObject halo_query_spec_time_cutoff_secs(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$time_cutoff_secs;
    }

    public static final SubLObject halo_query_spec_max_depth(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$max_depth;
    }

    public static final SubLObject halo_query_spec_removal_cost_cutoff(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$removal_cost_cutoff;
    }

    public static final SubLObject halo_query_spec_enable_negation_by_failure(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$enable_negation_by_failure;
    }

    public static final SubLObject halo_query_spec_enable_hl_predicate_backchaining(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$enable_hl_predicate_backchaining;
    }

    public static final SubLObject halo_query_spec_enable_cache_backwards_query_results(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$enable_cache_backwards_query_results;
    }

    public static final SubLObject halo_query_spec_enable_unbound_predicate_backchaining(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$enable_unbound_predicate_backchaining;
    }

    public static final SubLObject halo_query_spec_intermediate_step_validation_level(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$intermediate_step_validation_level;
    }

    public static final SubLObject _csetf_halo_query_spec_cycl_id(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_halo_query_spec_number(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_halo_query_spec_formula(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_halo_query_spec_query_a(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_halo_query_spec_neg_query_a(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_halo_query_spec_query_b(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_halo_query_spec_neg_query_b(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_halo_query_spec_query_c(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_halo_query_spec_neg_query_c(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_halo_query_spec_query_d(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_halo_query_spec_neg_query_d(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_halo_query_spec_query_e(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_halo_query_spec_neg_query_e(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_halo_query_spec_bindings(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_halo_query_spec_answer(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField16(value);
    }

    public static final SubLObject _csetf_halo_query_spec_answer_just(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField17(value);
    }

    public static final SubLObject _csetf_halo_query_spec_correct_answer(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField18(value);
    }

    public static final SubLObject _csetf_halo_query_spec_time(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField19(value);
    }

    public static final SubLObject _csetf_halo_query_spec_mt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return v_object.setField20(value);
    }

    public static final SubLObject _csetf_halo_query_spec_comment(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$comment = value;
    }

    public static final SubLObject _csetf_halo_query_spec_static_properties(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$static_properties = value;
    }

    public static final SubLObject _csetf_halo_query_spec_dynamic_properties(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$dynamic_properties = value;
    }

    public static final SubLObject _csetf_halo_query_spec_multiple_choiceP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$multiple_choiceP = value;
    }

    public static final SubLObject _csetf_halo_query_spec_generate_consequentP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$generate_consequentP = value;
    }

    public static final SubLObject _csetf_halo_query_spec_max_number_of_results(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$max_number_of_results = value;
    }

    public static final SubLObject _csetf_halo_query_spec_back_chaining(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$back_chaining = value;
    }

    public static final SubLObject _csetf_halo_query_spec_time_cutoff_secs(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$time_cutoff_secs = value;
    }

    public static final SubLObject _csetf_halo_query_spec_max_depth(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$max_depth = value;
    }

    public static final SubLObject _csetf_halo_query_spec_removal_cost_cutoff(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$removal_cost_cutoff = value;
    }

    public static final SubLObject _csetf_halo_query_spec_enable_negation_by_failure(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$enable_negation_by_failure = value;
    }

    public static final SubLObject _csetf_halo_query_spec_enable_hl_predicate_backchaining(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$enable_hl_predicate_backchaining = value;
    }

    public static final SubLObject _csetf_halo_query_spec_enable_cache_backwards_query_results(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$enable_cache_backwards_query_results = value;
    }

    public static final SubLObject _csetf_halo_query_spec_enable_unbound_predicate_backchaining(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$enable_unbound_predicate_backchaining = value;
    }

    public static final SubLObject _csetf_halo_query_spec_intermediate_step_validation_level(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_QUERY_SPECIFICATION_P);
        return ((halo_qa_interface.$halo_query_specification_native) (v_object)).$intermediate_step_validation_level = value;
    }

    public static final SubLObject make_halo_query_specification(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new halo_qa_interface.$halo_query_specification_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL_ID)) {
                        _csetf_halo_query_spec_cycl_id(v_new, current_value);
                    } else
                        if (pcase_var.eql($NUMBER)) {
                            _csetf_halo_query_spec_number(v_new, current_value);
                        } else
                            if (pcase_var.eql($FORMULA)) {
                                _csetf_halo_query_spec_formula(v_new, current_value);
                            } else
                                if (pcase_var.eql($QUERY_A)) {
                                    _csetf_halo_query_spec_query_a(v_new, current_value);
                                } else
                                    if (pcase_var.eql($NEG_QUERY_A)) {
                                        _csetf_halo_query_spec_neg_query_a(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($QUERY_B)) {
                                            _csetf_halo_query_spec_query_b(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($NEG_QUERY_B)) {
                                                _csetf_halo_query_spec_neg_query_b(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($QUERY_C)) {
                                                    _csetf_halo_query_spec_query_c(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($NEG_QUERY_C)) {
                                                        _csetf_halo_query_spec_neg_query_c(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($QUERY_D)) {
                                                            _csetf_halo_query_spec_query_d(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($NEG_QUERY_D)) {
                                                                _csetf_halo_query_spec_neg_query_d(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($QUERY_E)) {
                                                                    _csetf_halo_query_spec_query_e(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($NEG_QUERY_E)) {
                                                                        _csetf_halo_query_spec_neg_query_e(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($BINDINGS)) {
                                                                            _csetf_halo_query_spec_bindings(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($ANSWER)) {
                                                                                _csetf_halo_query_spec_answer(v_new, current_value);
                                                                            } else
                                                                                if (pcase_var.eql($ANSWER_JUST)) {
                                                                                    _csetf_halo_query_spec_answer_just(v_new, current_value);
                                                                                } else
                                                                                    if (pcase_var.eql($CORRECT_ANSWER)) {
                                                                                        _csetf_halo_query_spec_correct_answer(v_new, current_value);
                                                                                    } else
                                                                                        if (pcase_var.eql($TIME)) {
                                                                                            _csetf_halo_query_spec_time(v_new, current_value);
                                                                                        } else
                                                                                            if (pcase_var.eql($MT)) {
                                                                                                _csetf_halo_query_spec_mt(v_new, current_value);
                                                                                            } else
                                                                                                if (pcase_var.eql($COMMENT)) {
                                                                                                    _csetf_halo_query_spec_comment(v_new, current_value);
                                                                                                } else
                                                                                                    if (pcase_var.eql($STATIC_PROPERTIES)) {
                                                                                                        _csetf_halo_query_spec_static_properties(v_new, current_value);
                                                                                                    } else
                                                                                                        if (pcase_var.eql($DYNAMIC_PROPERTIES)) {
                                                                                                            _csetf_halo_query_spec_dynamic_properties(v_new, current_value);
                                                                                                        } else
                                                                                                            if (pcase_var.eql($kw122$MULTIPLE_CHOICE_)) {
                                                                                                                _csetf_halo_query_spec_multiple_choiceP(v_new, current_value);
                                                                                                            } else
                                                                                                                if (pcase_var.eql($kw123$GENERATE_CONSEQUENT_)) {
                                                                                                                    _csetf_halo_query_spec_generate_consequentP(v_new, current_value);
                                                                                                                } else
                                                                                                                    if (pcase_var.eql($MAX_NUMBER_OF_RESULTS)) {
                                                                                                                        _csetf_halo_query_spec_max_number_of_results(v_new, current_value);
                                                                                                                    } else
                                                                                                                        if (pcase_var.eql($BACK_CHAINING)) {
                                                                                                                            _csetf_halo_query_spec_back_chaining(v_new, current_value);
                                                                                                                        } else
                                                                                                                            if (pcase_var.eql($TIME_CUTOFF_SECS)) {
                                                                                                                                _csetf_halo_query_spec_time_cutoff_secs(v_new, current_value);
                                                                                                                            } else
                                                                                                                                if (pcase_var.eql($MAX_DEPTH)) {
                                                                                                                                    _csetf_halo_query_spec_max_depth(v_new, current_value);
                                                                                                                                } else
                                                                                                                                    if (pcase_var.eql($REMOVAL_COST_CUTOFF)) {
                                                                                                                                        _csetf_halo_query_spec_removal_cost_cutoff(v_new, current_value);
                                                                                                                                    } else
                                                                                                                                        if (pcase_var.eql($ENABLE_NEGATION_BY_FAILURE)) {
                                                                                                                                            _csetf_halo_query_spec_enable_negation_by_failure(v_new, current_value);
                                                                                                                                        } else
                                                                                                                                            if (pcase_var.eql($ENABLE_HL_PREDICATE_BACKCHAINING)) {
                                                                                                                                                _csetf_halo_query_spec_enable_hl_predicate_backchaining(v_new, current_value);
                                                                                                                                            } else
                                                                                                                                                if (pcase_var.eql($ENABLE_CACHE_BACKWARDS_QUERY_RESULTS)) {
                                                                                                                                                    _csetf_halo_query_spec_enable_cache_backwards_query_results(v_new, current_value);
                                                                                                                                                } else
                                                                                                                                                    if (pcase_var.eql($ENABLE_UNBOUND_PREDICATE_BACKCHAINING)) {
                                                                                                                                                        _csetf_halo_query_spec_enable_unbound_predicate_backchaining(v_new, current_value);
                                                                                                                                                    } else
                                                                                                                                                        if (pcase_var.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
                                                                                                                                                            _csetf_halo_query_spec_intermediate_step_validation_level(v_new, current_value);
                                                                                                                                                        } else {
                                                                                                                                                            Errors.error($str_alt134$Invalid_slot__S_for_construction_, current_arg);
                                                                                                                                                        }

































                }
            }
            return v_new;
        }
    }

    public static final SubLObject halo_query_specification_print(SubLObject query_spec, SubLObject stream, SubLObject depth) {
        {
            SubLObject indent1 = Strings.make_string(depth, UNPROVIDED);
            SubLObject indent2 = Strings.make_string(add(depth, THREE_INTEGER), UNPROVIDED);
            format(stream, $str_alt135$___Ahalo_query_specification___, indent1);
            format(stream, $str_alt136$_Acycl_id____A__, indent2, halo_query_spec_cycl_id(query_spec));
            format(stream, $str_alt137$_Aquestion_number___A__, indent2, halo_query_spec_number(query_spec));
            format(stream, $str_alt138$_Aformula___A__, indent2, halo_query_spec_formula(query_spec));
            format(stream, $str_alt139$_ACorrect_Answer___A__, indent2, halo_query_spec_correct_answer(query_spec));
            format(stream, $str_alt140$_ABindings___A__, indent2, halo_query_spec_bindings(query_spec));
            format(stream, $str_alt141$_AAnswer___A__, indent2, halo_query_spec_answer(query_spec));
            format(stream, $str_alt142$_ATime___A__, indent2, halo_query_spec_time(query_spec));
            format(stream, $str_alt143$_AJustification___A__, indent2, halo_query_spec_answer_just(query_spec));
            format(stream, $str_alt144$_Amt___S__, indent2, halo_query_spec_mt(query_spec));
            format(stream, $str_alt145$_Acomment___A__, indent2, halo_query_spec_comment(query_spec));
            format(stream, $str_alt146$_Amax_number_of_results___A__, indent2, halo_query_spec_max_number_of_results(query_spec));
            format(stream, $str_alt147$_Aback_chaining___A__, indent2, halo_query_spec_back_chaining(query_spec));
            format(stream, $str_alt148$_Atime_cutoff_secs___A__, indent2, halo_query_spec_time_cutoff_secs(query_spec));
            format(stream, $str_alt149$_Amax_depth___A__, indent2, halo_query_spec_max_depth(query_spec));
            format(stream, $str_alt150$_Aremoval_cost_cutoff___A__, indent2, halo_query_spec_removal_cost_cutoff(query_spec));
            format(stream, $str_alt151$_Aenable_negation_by_failure___A_, indent2, halo_query_spec_enable_negation_by_failure(query_spec));
            format(stream, $str_alt152$_Aenable_hl_predicate_backchainin, indent2, halo_query_spec_enable_hl_predicate_backchaining(query_spec));
            format(stream, $str_alt153$_Aenable_cache_backwards_query_re, indent2, halo_query_spec_enable_cache_backwards_query_results(query_spec));
            format(stream, $str_alt154$_Aenable_unbound_predicate_backch, indent2, halo_query_spec_enable_unbound_predicate_backchaining(query_spec));
            format(stream, $str_alt155$_Aintermediate_step_validation_le, indent2, halo_query_spec_intermediate_step_validation_level(query_spec));
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $halo_query_time_default$ = makeSymbol("*HALO-QUERY-TIME-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_max_number_of_results$ = makeSymbol("*HALO-QUERY-MAX-NUMBER-OF-RESULTS*");

    // defparameter
    public static final SubLSymbol $halo_query_back_chaining_default$ = makeSymbol("*HALO-QUERY-BACK-CHAINING-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_back_chaining_default_overrides_specified_settingP$ = makeSymbol("*HALO-QUERY-BACK-CHAINING-DEFAULT-OVERRIDES-SPECIFIED-SETTING?*");

    // defparameter
    public static final SubLSymbol $halo_query_time_cutoff_default$ = makeSymbol("*HALO-QUERY-TIME-CUTOFF-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_max_depth_default$ = makeSymbol("*HALO-QUERY-MAX-DEPTH-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_removal_cost_cutoff_default$ = makeSymbol("*HALO-QUERY-REMOVAL-COST-CUTOFF-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_enable_unbound_predicate_backchaining_default$ = makeSymbol("*HALO-QUERY-ENABLE-UNBOUND-PREDICATE-BACKCHAINING-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_intermediate_step_validation_level_default$ = makeSymbol("*HALO-QUERY-INTERMEDIATE-STEP-VALIDATION-LEVEL-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_enable_cache_backwards_query_results_default$ = makeSymbol("*HALO-QUERY-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_enable_hl_predicate_backchaining_default$ = makeSymbol("*HALO-QUERY-ENABLE-HL-PREDICATE-BACKCHAINING-DEFAULT*");

    // defparameter
    public static final SubLSymbol $halo_query_enable_negation_by_failure_default$ = makeSymbol("*HALO-QUERY-ENABLE-NEGATION-BY-FAILURE-DEFAULT*");

    /**
     * Makes a new halo-query-specification with the appropriate defaults.
     */
    public static final SubLObject halo_query_specification_new() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = make_halo_query_specification(UNPROVIDED);
                _csetf_halo_query_spec_time(result, $halo_query_time_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_max_number_of_results(result, $halo_query_max_number_of_results$.getDynamicValue(thread));
                _csetf_halo_query_spec_back_chaining(result, $halo_query_back_chaining_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_time_cutoff_secs(result, $halo_query_time_cutoff_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_max_depth(result, $halo_query_max_depth_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_enable_unbound_predicate_backchaining(result, $halo_query_enable_unbound_predicate_backchaining_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_removal_cost_cutoff(result, $halo_query_removal_cost_cutoff_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_intermediate_step_validation_level(result, $halo_query_intermediate_step_validation_level_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_enable_cache_backwards_query_results(result, $halo_query_enable_cache_backwards_query_results_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_enable_hl_predicate_backchaining(result, $halo_query_enable_hl_predicate_backchaining_default$.getDynamicValue(thread));
                _csetf_halo_query_spec_enable_negation_by_failure(result, $halo_query_enable_negation_by_failure_default$.getDynamicValue(thread));
                return result;
            }
        }
    }

    /**
     * Given the cyc-constant for a halo-query-specification and an mt,
     * reads the query specification from the KB and returns it as
     * a halo-query-specification.
     */
    public static final SubLObject halo_query_specification_get(SubLObject constant_id, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(constant_id, CYCL_DENOTATIONAL_TERM_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, MICROTHEORY_P);
        }
        {
            SubLObject test_atom = halo_extract_test_atom(constant_id);
            SubLObject multiple_choiceP = isa.isaP(test_atom, $$TestQuery_MultipleChoice, mt, UNPROVIDED);
            return halo_query_specification_get_int(constant_id, mt, multiple_choiceP);
        }
    }

    public static final SubLObject halo_extract_test_atom(SubLObject constant_id) {
        if (NIL != nart_handles.nart_p(constant_id)) {
            return second(narts_high.nart_el_formula(constant_id));
        }
        if (NIL != constant_handles.constant_p(constant_id)) {
            return constant_id;
        }
        return NIL;
    }

    public static final SubLObject halo_query_specification_get_int(SubLObject constant_id, SubLObject mt, SubLObject multiple_choiceP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (multiple_choiceP == UNPROVIDED) {
            multiple_choiceP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = halo_query_specification_new();
                if (NIL != multiple_choiceP) {
                    _csetf_halo_query_spec_max_number_of_results(result, ONE_INTEGER);
                } else {
                    _csetf_halo_query_spec_max_number_of_results(result, NIL);
                    _csetf_halo_query_spec_generate_consequentP(result, isa.isaP(halo_extract_test_atom(constant_id), $$TestQuery_ResultAsConsequent, mt, UNPROVIDED));
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if (NIL != mt) {
                                _csetf_halo_query_spec_mt(result, mt);
                            } else {
                                _csetf_halo_query_spec_mt(result, $halo_default_query_mt$.getDynamicValue(thread));
                            }
                            _csetf_halo_query_spec_number(result, NIL != mt ? ((SubLObject) (kb_mapping_utilities.fpred_value_in_mt(constant_id, $$testQueryToNumber, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : kb_mapping_utilities.fpred_value(constant_id, $$testQueryToNumber, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            _csetf_halo_query_spec_cycl_id(result, constant_id);
                            {
                                SubLObject comments = ask_utilities.ask_variable($sym164$_COMMENT, listS($$comment, constant_id, $list_alt166), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != comments) {
                                    {
                                        SubLObject comment_str = comments.first();
                                        halo_query_specification_assign_param(result, $$comment, comment_str);
                                    }
                                }
                            }
                            {
                                SubLObject results = ask_utilities.ask_template($list_alt167, list($const168$softwareParameterValueInSpecifica, $sym169$_PARAM, $sym170$_VAL, constant_id), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var = results;
                                SubLObject pair = NIL;
                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = pair;
                                        SubLObject current = datum;
                                        SubLObject param = NIL;
                                        SubLObject val = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt171);
                                        param = current.first();
                                        current = current.rest();
                                        val = current;
                                        halo_query_specification_assign_param(result, param, val);
                                    }
                                }
                            }
                            {
                                SubLObject v_bindings = ask_utilities.ask_variable($sym172$_BINDINGS, listS($$testAnswersCycL_Exact, halo_extract_test_atom(constant_id), $list_alt174), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != v_bindings) {
                                    {
                                        SubLObject raw_answer = v_bindings.first();
                                        SubLObject ans_number = third(second(second(raw_answer)));
                                        SubLObject ans_letter = halo_decode_number_to_letter(ans_number);
                                        _csetf_halo_query_spec_correct_answer(result, ans_letter);
                                    }
                                }
                            }
                            _csetf_halo_query_spec_multiple_choiceP(result, multiple_choiceP);
                            if (NIL != multiple_choiceP) {
                                _csetf_halo_query_spec_query_a(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), ZERO_INTEGER, T));
                                _csetf_halo_query_spec_neg_query_a(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), ZERO_INTEGER, NIL));
                                _csetf_halo_query_spec_query_b(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), ONE_INTEGER, T));
                                _csetf_halo_query_spec_neg_query_b(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), ONE_INTEGER, NIL));
                                _csetf_halo_query_spec_query_c(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), TWO_INTEGER, T));
                                _csetf_halo_query_spec_neg_query_c(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), TWO_INTEGER, NIL));
                                _csetf_halo_query_spec_query_d(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), THREE_INTEGER, T));
                                _csetf_halo_query_spec_neg_query_d(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), THREE_INTEGER, NIL));
                                _csetf_halo_query_spec_query_e(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), FOUR_INTEGER, T));
                                _csetf_halo_query_spec_neg_query_e(result, halo_create_single_query_from_formula(halo_query_spec_formula(result), FOUR_INTEGER, NIL));
                            }
                            _csetf_halo_query_spec_static_properties(result, halo_static_query_properties_from_query_spec(result));
                            _csetf_halo_query_spec_dynamic_properties(result, halo_dynamic_query_properties_from_query_spec(result));
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject halo_create_single_query_from_formula(SubLObject full_formula, SubLObject answer_num, SubLObject posP) {
        if (full_formula.first() == $$goodChoiceAmongSentences) {
            if (NIL != posP) {
                return nth(add(answer_num, ONE_INTEGER), list_utilities.tree_find($$TheList, full_formula, symbol_function(HALO_LIST_FINDER_COMPARATOR), UNPROVIDED));
            } else {
                return list($$not, nth(add(answer_num, ONE_INTEGER), list_utilities.tree_find($$TheList, full_formula, symbol_function(HALO_LIST_FINDER_COMPARATOR), UNPROVIDED)));
            }
        } else {
            {
                SubLObject gcas = list_utilities.tree_find($$goodChoiceAmongSentences, full_formula, symbol_function(HALO_LIST_FINDER_COMPARATOR), UNPROVIDED);
                SubLObject answer_clause = nth(add(answer_num, ONE_INTEGER), list_utilities.tree_find($$TheList, gcas, symbol_function(HALO_LIST_FINDER_COMPARATOR), UNPROVIDED));
                if (NIL != posP) {
                    return list_utilities.tree_substitute(full_formula, gcas, answer_clause);
                } else {
                    return list_utilities.tree_substitute(full_formula, gcas, list($$not, answer_clause));
                }
            }
        }
    }

    public static final SubLObject halo_list_finder_comparator(SubLObject test_object, SubLObject head_object) {
        return makeBoolean(head_object.isList() && head_object.first().eql(test_object));
    }

    /**
     * Assigns the given parameter to the given value in the query specification passed.
     */
    public static final SubLObject halo_query_specification_assign_param(SubLObject query_spec, SubLObject param, SubLObject val) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = param;
                if (pcase_var.eql($$InferenceSentenceParameter)) {
                    _csetf_halo_query_spec_formula(query_spec, val);
                } else
                    if (pcase_var.eql($$InferenceMicrotheoryParameter)) {
                        _csetf_halo_query_spec_mt(query_spec, NIL != function_terms.nat_formula_p(val) ? ((SubLObject) (narts_high.nart_substitute(val))) : val);
                    } else
                        if (pcase_var.eql($$InferenceMaxAnswersParameter)) {
                            _csetf_halo_query_spec_max_number_of_results(query_spec, val);
                        } else
                            if (pcase_var.eql($const182$InferenceMaxTransformationStepsPa)) {
                                if (NIL == $halo_query_back_chaining_default_overrides_specified_settingP$.getDynamicValue(thread)) {
                                    _csetf_halo_query_spec_back_chaining(query_spec, val);
                                }
                            } else
                                if (pcase_var.eql($$InferenceMaxTimeParameter)) {
                                    if (NIL != nart_handles.nart_p(val)) {
                                        _csetf_halo_query_spec_time_cutoff_secs(query_spec, cycl_utilities.nat_arg1(val, UNPROVIDED));
                                    } else
                                        if (NIL != el_utilities.possibly_naut_p(val)) {
                                            _csetf_halo_query_spec_time_cutoff_secs(query_spec, cycl_utilities.nat_arg1(val, UNPROVIDED));
                                        } else {
                                            _csetf_halo_query_spec_time_cutoff_secs(query_spec, val);
                                        }

                                } else
                                    if (pcase_var.eql($$InferenceMaxProofDepthParameter)) {
                                        _csetf_halo_query_spec_max_depth(query_spec, val);
                                    } else
                                        if (pcase_var.eql($const185$InferenceAllowUnboundPredicateTra)) {
                                            _csetf_halo_query_spec_enable_unbound_predicate_backchaining(query_spec, val);
                                        } else
                                            if (pcase_var.eql($const186$InferenceProductivityLimitParamet)) {
                                                _csetf_halo_query_spec_removal_cost_cutoff(query_spec, val);
                                            } else
                                                if (pcase_var.eql($const187$InferenceIntermediateStepValidati)) {
                                                    _csetf_halo_query_spec_intermediate_step_validation_level(query_spec, val);
                                                } else
                                                    if (pcase_var.eql($const188$InferenceCacheInferenceResultsPar)) {
                                                        _csetf_halo_query_spec_enable_cache_backwards_query_results(query_spec, val);
                                                    } else
                                                        if (pcase_var.eql($const189$InferenceAllowHLPredicateTransfor)) {
                                                            _csetf_halo_query_spec_enable_hl_predicate_backchaining(query_spec, val);
                                                        } else
                                                            if (pcase_var.eql($const190$InferenceNegationByFailureParamet)) {
                                                                _csetf_halo_query_spec_enable_negation_by_failure(query_spec, val);
                                                            } else
                                                                if (pcase_var.eql($$comment)) {
                                                                    _csetf_halo_query_spec_comment(query_spec, val);
                                                                }












            }
            return NIL;
        }
    }

    public static final class $halo_justification_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return halo_qa_interface.$halo_justification_native.structDecl;
        }

        public SubLObject getField2() {
            return $answer;
        }

        public SubLObject getField3() {
            return $supportingP;
        }

        public SubLObject getField4() {
            return $multiple_choiceP;
        }

        public SubLObject getField5() {
            return $text;
        }

        public SubLObject setField2(SubLObject value) {
            return $answer = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $supportingP = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $multiple_choiceP = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $text = value;
        }

        public SubLObject $answer = Lisp.NIL;

        public SubLObject $supportingP = Lisp.NIL;

        public SubLObject $multiple_choiceP = Lisp.NIL;

        public SubLObject $text = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(halo_qa_interface.$halo_justification_native.class, HALO_JUSTIFICATION, HALO_JUSTIFICATION_P, $list_alt193, $list_alt194, new String[]{ "$answer", "$supportingP", "$multiple_choiceP", "$text" }, $list_alt195, $list_alt196, HALO_JUSTIFICATION_PRINT);
    }

    // defconstant
    public static final SubLSymbol $dtp_halo_justification$ = makeSymbol("*DTP-HALO-JUSTIFICATION*");

    public static final SubLObject halo_justification_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        halo_justification_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject halo_justification_p(SubLObject v_object) {
        return v_object.getJavaClass() ==halo_qa_interface.$halo_justification_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $halo_justification_p$UnaryFunction extends UnaryFunction {
        public $halo_justification_p$UnaryFunction() {
            super(extractFunctionNamed("HALO-JUSTIFICATION-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return halo_justification_p(arg1);
        }
    }

    public static final SubLObject halo_just_answer(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_JUSTIFICATION_P);
        return v_object.getField2();
    }

    public static final SubLObject halo_just_supportingP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_JUSTIFICATION_P);
        return v_object.getField3();
    }

    public static final SubLObject halo_just_multiple_choiceP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_JUSTIFICATION_P);
        return v_object.getField4();
    }

    public static final SubLObject halo_just_text(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_JUSTIFICATION_P);
        return v_object.getField5();
    }

    public static final SubLObject _csetf_halo_just_answer(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_JUSTIFICATION_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_halo_just_supportingP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_JUSTIFICATION_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_halo_just_multiple_choiceP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_JUSTIFICATION_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_halo_just_text(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_JUSTIFICATION_P);
        return v_object.setField5(value);
    }

    public static final SubLObject make_halo_justification(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new halo_qa_interface.$halo_justification_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ANSWER)) {
                        _csetf_halo_just_answer(v_new, current_value);
                    } else
                        if (pcase_var.eql($kw207$SUPPORTING_)) {
                            _csetf_halo_just_supportingP(v_new, current_value);
                        } else
                            if (pcase_var.eql($kw122$MULTIPLE_CHOICE_)) {
                                _csetf_halo_just_multiple_choiceP(v_new, current_value);
                            } else
                                if (pcase_var.eql($TEXT)) {
                                    _csetf_halo_just_text(v_new, current_value);
                                } else {
                                    Errors.error($str_alt134$Invalid_slot__S_for_construction_, current_arg);
                                }



                }
            }
            return v_new;
        }
    }

    /**
     * make a justification with LETTER SUPPORTING? and JUSTIFICATION
     */
    public static final SubLObject halo_make_justification(SubLObject v_answer, SubLObject supportingP, SubLObject justification, SubLObject multiple_choiceP) {
        if (multiple_choiceP == UNPROVIDED) {
            multiple_choiceP = T;
        }
        {
            SubLObject result = make_halo_justification(UNPROVIDED);
            _csetf_halo_just_answer(result, v_answer);
            _csetf_halo_just_supportingP(result, supportingP);
            _csetf_halo_just_multiple_choiceP(result, multiple_choiceP);
            _csetf_halo_just_text(result, justification);
            return result;
        }
    }

    public static final SubLObject halo_justification_print(SubLObject justification, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt209$__Answer________A__, halo_just_answer(justification));
        format(stream, $str_alt210$__Supporting____A__, halo_just_supportingP(justification));
        format(stream, $str_alt211$__Multiple______A__, halo_just_multiple_choiceP(justification));
        format(stream, $str_alt212$__Text__________A__, halo_just_text(justification));
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $halo_generate_answers_with_metrics$ = makeSymbol("*HALO-GENERATE-ANSWERS-WITH-METRICS*");

    /**
     * iterate through mt grabbing all the #$testQueryFn nart instances of test-specification,
     * running the queries, and dumping the answers to file in HTML format while updating the
     * process-wrapper object of the current status
     */
    public static final SubLObject halo_generate_answers_with_process_wrapper(SubLObject process_wrapper, SubLObject mt, SubLObject file, SubLObject test_specification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ensure_halo_qa_interface_initialized();
            {
                SubLObject queries = ask_utilities.ask_variable($sym213$_QUERY_NART, listS($$and, list($$isa, $sym216$_QUERY, test_specification), $list_alt217), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject all_halo_query_specs = NIL;
                SubLObject encoded_halo_query_specs = NIL;
                SubLObject cdolist_list_var = queries;
                SubLObject query = NIL;
                for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                    if (NIL != function_terms.nat_formula_p(query)) {
                        {
                            SubLObject query_spec = halo_query_specification_get(narts_high.find_nart(query), mt);
                            all_halo_query_specs = cons(query_spec, all_halo_query_specs);
                        }
                    }
                }
                all_halo_query_specs = Sort.sort(all_halo_query_specs, symbol_function($sym218$_), symbol_function(HALO_QUERY_SPEC_NUMBER));
                encoded_halo_query_specs = list_utilities.remove_if_not(symbol_function(HALO_QUERY_SPEC_FORMULA), all_halo_query_specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                process_utilities.process_wrapper_set_property(process_wrapper, $TOTAL_QUESTIONS, length(encoded_halo_query_specs));
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(file, $OUTPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt221$Unable_to_open__S, file);
                        }
                        {
                            SubLObject out = stream;
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind(out, thread);
                                    {
                                        SubLObject title_var = $$$Cyc_Halo_Batch_Results;
                                        {
                                            SubLObject _prev_bind_0_1 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                                            try {
                                                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                                html_macros.html_head_content_type();
                                                cb_parameters.cb_head_shortcut_icon();
                                                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                                                if (NIL != title_var) {
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                                    html_utilities.html_princ(title_var);
                                                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($str_alt225$yui_skin_sam);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != title_var) {
                                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                                    html_utilities.html_markup(TWO_INTEGER);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    html_utilities.html_princ(title_var);
                                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(TWO_INTEGER);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                                html_utilities.html_markup(THREE_INTEGER);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt226$Run_with_KB__A_on_system__A, operation_communication.kb_version_string(), system_info.cyc_revision_string());
                                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                                html_utilities.html_markup(THREE_INTEGER);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                if (NIL != subl_promotions.positive_integer_p($halo_qa_resourcing_spaces$.getGlobalValue())) {
                                                                    {
                                                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                                        {
                                                                            SubLObject _prev_bind_0_4 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, $halo_qa_resourcing_spaces$.getGlobalValue()), thread);
                                                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                                {
                                                                                    SubLObject list_var = NIL;
                                                                                    SubLObject query_spec = NIL;
                                                                                    SubLObject num = NIL;
                                                                                    for (list_var = encoded_halo_query_specs, query_spec = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , query_spec = list_var.first() , num = add(ONE_INTEGER, num)) {
                                                                                        process_utilities.process_wrapper_set_property(process_wrapper, $CURRENT_QUESTION, add(num, ONE_INTEGER));
                                                                                        if (NIL != $halo_generate_answers_with_metrics$.getDynamicValue(thread)) {
                                                                                            inference_metrics.reset_inference_metrics();
                                                                                        }
                                                                                        halo_answer_query_spec(query_spec);
                                                                                        halo_write_query_spec_to_stream(out, query_spec);
                                                                                        if (NIL != $halo_generate_answers_with_metrics$.getDynamicValue(thread)) {
                                                                                            {
                                                                                                SubLObject string = NIL;
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_5 = StreamsLow.$standard_output$.currentBinding(thread);
                                                                                                    try {
                                                                                                        StreamsLow.$standard_output$.bind(NIL, thread);
                                                                                                        try {
                                                                                                            StreamsLow.$standard_output$.setDynamicValue(make_private_string_output_stream(), thread);
                                                                                                            inference_metrics.show_inference_metrics(UNPROVIDED);
                                                                                                            string = get_output_stream_string(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                                                                        } finally {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                    close(StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED);
                                                                                                                } finally {
                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        StreamsLow.$standard_output$.rebind(_prev_bind_0_5, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_comment_head$.getGlobalValue());
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_utilities.html_princ($$$Start_metrics);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_comment_tail$.getGlobalValue());
                                                                                                html_utilities.html_markup(format_inference_metrics(string));
                                                                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_markup(html_macros.$html_comment_head$.getGlobalValue());
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_utilities.html_princ($$$End_metrics);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_comment_tail$.getGlobalValue());
                                                                                                html_utilities.html_flush();
                                                                                            }
                                                                                        }
                                                                                        if (NIL != $halo_destroy_ephemeral_termsP$.getDynamicValue(thread)) {
                                                                                            kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
                                                                                        }
                                                                                        halo_trace(format(NIL, $str_alt230$__Problem_store_count___A__, inference_datastructures_problem_store.problem_store_count()));
                                                                                        Storage.gc(UNPROVIDED);
                                                                                    }
                                                                                    halo_write_results_table_to_stream(out, all_halo_query_specs);
                                                                                }
                                                                            } finally {
                                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_4, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    {
                                                                        SubLObject list_var = NIL;
                                                                        SubLObject query_spec = NIL;
                                                                        SubLObject num = NIL;
                                                                        for (list_var = encoded_halo_query_specs, query_spec = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , query_spec = list_var.first() , num = add(ONE_INTEGER, num)) {
                                                                            process_utilities.process_wrapper_set_property(process_wrapper, $CURRENT_QUESTION, add(num, ONE_INTEGER));
                                                                            if (NIL != $halo_generate_answers_with_metrics$.getDynamicValue(thread)) {
                                                                                inference_metrics.reset_inference_metrics();
                                                                            }
                                                                            halo_answer_query_spec(query_spec);
                                                                            halo_write_query_spec_to_stream(out, query_spec);
                                                                            if (NIL != $halo_generate_answers_with_metrics$.getDynamicValue(thread)) {
                                                                                {
                                                                                    SubLObject string = NIL;
                                                                                    {
                                                                                        SubLObject _prev_bind_0_9 = StreamsLow.$standard_output$.currentBinding(thread);
                                                                                        try {
                                                                                            StreamsLow.$standard_output$.bind(NIL, thread);
                                                                                            try {
                                                                                                StreamsLow.$standard_output$.setDynamicValue(make_private_string_output_stream(), thread);
                                                                                                inference_metrics.show_inference_metrics(UNPROVIDED);
                                                                                                string = get_output_stream_string(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                                                            } finally {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        close(StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED);
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            StreamsLow.$standard_output$.rebind(_prev_bind_0_9, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_comment_head$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($$$Start_metrics);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_comment_tail$.getGlobalValue());
                                                                                    html_utilities.html_markup(format_inference_metrics(string));
                                                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_comment_head$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($$$End_metrics);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_comment_tail$.getGlobalValue());
                                                                                    html_utilities.html_flush();
                                                                                }
                                                                            }
                                                                            if (NIL != $halo_destroy_ephemeral_termsP$.getDynamicValue(thread)) {
                                                                                kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
                                                                            }
                                                                            halo_trace(format(NIL, $str_alt230$__Problem_store_count___A__, inference_datastructures_problem_store.problem_store_count()));
                                                                            Storage.gc(UNPROVIDED);
                                                                        }
                                                                        halo_write_results_table_to_stream(out, all_halo_query_specs);
                                                                    }
                                                                }
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                html_utilities.html_copyright_notice();
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject format_inference_metrics(SubLObject string) {
        return string_utilities.string_subst($str_alt231$_br_, string_utilities.$new_line_string$.getGlobalValue(), string, UNPROVIDED);
    }

    /**
     * iterate through mt grabbing all the #$testQueryFn nart instances of test-specification,
     * running the queries, and dumping the answers to file in HTML format
     */
    public static final SubLObject halo_generate_answers_from_mt(SubLObject mt, SubLObject file, SubLObject test_specification) {
        if (mt == UNPROVIDED) {
            mt = $halo_default_query_mt$.getDynamicValue();
        }
        if (file == UNPROVIDED) {
            file = $str_alt1$test_html;
        }
        if (test_specification == UNPROVIDED) {
            test_specification = $halo_default_test_specification$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ensure_halo_qa_interface_initialized();
            {
                SubLObject queries = ask_utilities.ask_variable($sym213$_QUERY_NART, listS($$and, list($$isa, $sym216$_QUERY, test_specification), $list_alt217), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject all_halo_query_specs = NIL;
                SubLObject encoded_halo_query_specs = NIL;
                {
                    SubLObject cdolist_list_var = queries;
                    SubLObject query = NIL;
                    for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                        if (NIL != function_terms.nat_formula_p(query)) {
                            all_halo_query_specs = cons(halo_query_specification_get(narts_high.find_nart(query), mt), all_halo_query_specs);
                        }
                    }
                }
                all_halo_query_specs = Sort.sort(all_halo_query_specs, symbol_function($sym218$_), symbol_function(HALO_QUERY_SPEC_NUMBER));
                encoded_halo_query_specs = list_utilities.remove_if_not(symbol_function(HALO_QUERY_SPEC_FORMULA), all_halo_query_specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(file, $OUTPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt221$Unable_to_open__S, file);
                        }
                        {
                            SubLObject out = stream;
                            format(out, $str_alt232$_html__head__title_Cyc_Halo_Batch);
                            format(out, $str_alt233$_h3_Run_with_KB__A_on_system__A__, operation_communication.kb_version_string(), system_info.cyc_revision_string());
                            if (NIL != subl_promotions.positive_integer_p($halo_qa_resourcing_spaces$.getGlobalValue())) {
                                {
                                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                    {
                                        SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, $halo_qa_resourcing_spaces$.getGlobalValue()), thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            {
                                                SubLObject cdolist_list_var = encoded_halo_query_specs;
                                                SubLObject query_spec = NIL;
                                                for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                                                    halo_answer_query_spec(query_spec);
                                                    halo_write_query_spec_to_stream(out, query_spec);
                                                    if (NIL != $halo_destroy_ephemeral_termsP$.getDynamicValue(thread)) {
                                                        kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
                                                    }
                                                    halo_trace(format(NIL, $str_alt230$__Problem_store_count___A__, inference_datastructures_problem_store.problem_store_count()));
                                                    Storage.gc(UNPROVIDED);
                                                }
                                                halo_write_results_table_to_stream(out, all_halo_query_specs);
                                                format(out, $str_alt234$____body___html_);
                                            }
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var = encoded_halo_query_specs;
                                    SubLObject query_spec = NIL;
                                    for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                                        halo_answer_query_spec(query_spec);
                                        halo_write_query_spec_to_stream(out, query_spec);
                                        if (NIL != $halo_destroy_ephemeral_termsP$.getDynamicValue(thread)) {
                                            kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
                                        }
                                        halo_trace(format(NIL, $str_alt230$__Problem_store_count___A__, inference_datastructures_problem_store.problem_store_count()));
                                        Storage.gc(UNPROVIDED);
                                    }
                                    halo_write_results_table_to_stream(out, all_halo_query_specs);
                                    format(out, $str_alt234$____body___html_);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_generate_answers_for_numbers(SubLObject num_list, SubLObject mt, SubLObject file, SubLObject test_specification) {
        if (mt == UNPROVIDED) {
            mt = $halo_default_query_mt$.getDynamicValue();
        }
        if (file == UNPROVIDED) {
            file = $halo_default_output_file$.getDynamicValue();
        }
        if (test_specification == UNPROVIDED) {
            test_specification = $halo_default_test_specification$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ensure_halo_qa_interface_initialized();
            num_list = Sort.sort(num_list, symbol_function($sym218$_), UNPROVIDED);
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(file, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt221$Unable_to_open__S, file);
                    }
                    {
                        SubLObject out = stream;
                        format(out, $str_alt232$_html__head__title_Cyc_Halo_Batch);
                        if (NIL != subl_promotions.positive_integer_p($halo_qa_resourcing_spaces$.getGlobalValue())) {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, $halo_qa_resourcing_spaces$.getGlobalValue()), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = num_list;
                                            SubLObject num = NIL;
                                            for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num = cdolist_list_var.first()) {
                                                halo_generate_answer_for_number(num, out, mt, test_specification);
                                            }
                                            format(out, $str_alt235$__body___html_);
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject cdolist_list_var = num_list;
                                SubLObject num = NIL;
                                for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num = cdolist_list_var.first()) {
                                    halo_generate_answer_for_number(num, out, mt, test_specification);
                                }
                                format(out, $str_alt235$__body___html_);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_generate_answer_for_number(SubLObject question_number, SubLObject stream, SubLObject mt, SubLObject test_specification) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (mt == UNPROVIDED) {
            mt = $halo_default_query_mt$.getDynamicValue();
        }
        if (test_specification == UNPROVIDED) {
            test_specification = $halo_default_test_specification$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ensure_halo_qa_interface_initialized();
            {
                SubLObject query = ask_utilities.ask_variable($sym213$_QUERY_NART, list($$and, list($$isa, $sym216$_QUERY, test_specification), $list_alt236, list($$testQueryToNumber, $sym213$_QUERY_NART, question_number)), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject query_spec = NIL;
                if (NIL != function_terms.nat_formula_p(query.first())) {
                    query_spec = halo_query_specification_get(narts_high.find_nart(query.first()), mt);
                }
                if (NIL != halo_query_specification_p(query_spec)) {
                    if (NIL != subl_promotions.positive_integer_p($halo_qa_resourcing_spaces$.getGlobalValue())) {
                        {
                            SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, $halo_qa_resourcing_spaces$.getGlobalValue()), thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                    halo_answer_query_spec(query_spec);
                                    halo_write_query_spec_to_stream(stream, query_spec);
                                    if (NIL != $halo_destroy_ephemeral_termsP$.getDynamicValue(thread)) {
                                        kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
                                    }
                                    halo_trace(format(NIL, $str_alt230$__Problem_store_count___A__, inference_datastructures_problem_store.problem_store_count()));
                                    Storage.gc(UNPROVIDED);
                                    format(stream, $str_alt237$_br_Query_took___A_seconds_br___, round(halo_query_spec_time(query_spec), UNPROVIDED));
                                } finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } else {
                        halo_answer_query_spec(query_spec);
                        halo_write_query_spec_to_stream(stream, query_spec);
                        if (NIL != $halo_destroy_ephemeral_termsP$.getDynamicValue(thread)) {
                            kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
                        }
                        halo_trace(format(NIL, $str_alt230$__Problem_store_count___A__, inference_datastructures_problem_store.problem_store_count()));
                        Storage.gc(UNPROVIDED);
                        format(stream, $str_alt237$_br_Query_took___A_seconds_br___, round(halo_query_spec_time(query_spec), UNPROVIDED));
                    }
                } else {
                    format(stream, $$$Not_a_valid_question_number);
                }
            }
            force_output(stream);
            return NIL;
        }
    }

    public static final SubLObject halo_write_results_table_to_stream(SubLObject stream, SubLObject query_list) {
        format(stream, $str_alt239$_br__center__h3_Tabulated_Results);
        format(stream, $str_alt240$_tr__td_width__10___Question____t);
        {
            SubLObject cdolist_list_var = query_list;
            SubLObject query_spec = NIL;
            for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                format(stream, $str_alt241$_tr__td__A__td__td__A__td__td__A_, new SubLObject[]{ halo_query_spec_number(query_spec), NIL != halo_query_spec_formula(query_spec) ? ((SubLObject) ($$$Yes)) : $$$No, NIL != halo_query_spec_answer(query_spec) ? ((SubLObject) (halo_query_spec_answer(query_spec))) : $str_alt244$_nbsp_, round(halo_query_spec_time(query_spec), UNPROVIDED), halo_calculate_query_correctness(query_spec) });
            }
        }
        format(stream, $str_alt245$__table___center___);
        halo_write_summary_to_stream(stream, query_list);
        return NIL;
    }

    public static final class $halo_statistics_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return halo_qa_interface.$halo_statistics_native.structDecl;
        }

        public SubLObject getField2() {
            return $name;
        }

        public SubLObject getField3() {
            return $correct;
        }

        public SubLObject getField4() {
            return $wrong;
        }

        public SubLObject getField5() {
            return $partial;
        }

        public SubLObject getField6() {
            return $unknown;
        }

        public SubLObject getField7() {
            return $encoded;
        }

        public SubLObject getField8() {
            return $unencoded;
        }

        public SubLObject getField9() {
            return $time;
        }

        public SubLObject getField10() {
            return $total;
        }

        public SubLObject setField2(SubLObject value) {
            return $name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $correct = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $wrong = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $partial = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $unknown = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $encoded = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $unencoded = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $time = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $total = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $correct = Lisp.NIL;

        public SubLObject $wrong = Lisp.NIL;

        public SubLObject $partial = Lisp.NIL;

        public SubLObject $unknown = Lisp.NIL;

        public SubLObject $encoded = Lisp.NIL;

        public SubLObject $unencoded = Lisp.NIL;

        public SubLObject $time = Lisp.NIL;

        public SubLObject $total = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(halo_qa_interface.$halo_statistics_native.class, HALO_STATISTICS, HALO_STATISTICS_P, $list_alt248, $list_alt249, new String[]{ "$name", "$correct", "$wrong", "$partial", "$unknown", "$encoded", "$unencoded", "$time", "$total" }, $list_alt250, $list_alt251, HALO_STATISTICS_PRINT);
    }

    // defconstant
    public static final SubLSymbol $dtp_halo_statistics$ = makeSymbol("*DTP-HALO-STATISTICS*");

    public static final SubLObject halo_statistics_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        halo_statistics_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject halo_statistics_p(SubLObject v_object) {
        return v_object.getJavaClass() ==halo_qa_interface.$halo_statistics_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $halo_statistics_p$UnaryFunction extends UnaryFunction {
        public $halo_statistics_p$UnaryFunction() {
            super(extractFunctionNamed("HALO-STATISTICS-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return halo_statistics_p(arg1);
        }
    }

    public static final SubLObject halo_stat_name(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField2();
    }

    public static final SubLObject halo_stat_correct(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField3();
    }

    public static final SubLObject halo_stat_wrong(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField4();
    }

    public static final SubLObject halo_stat_partial(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField5();
    }

    public static final SubLObject halo_stat_unknown(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField6();
    }

    public static final SubLObject halo_stat_encoded(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField7();
    }

    public static final SubLObject halo_stat_unencoded(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField8();
    }

    public static final SubLObject halo_stat_time(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField9();
    }

    public static final SubLObject halo_stat_total(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.getField10();
    }

    public static final SubLObject _csetf_halo_stat_name(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_halo_stat_correct(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_halo_stat_wrong(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_halo_stat_partial(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_halo_stat_unknown(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_halo_stat_encoded(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_halo_stat_unencoded(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_halo_stat_time(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_halo_stat_total(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HALO_STATISTICS_P);
        return v_object.setField10(value);
    }

    public static final SubLObject make_halo_statistics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new halo_qa_interface.$halo_statistics_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_halo_stat_name(v_new, current_value);
                    } else
                        if (pcase_var.eql($CORRECT)) {
                            _csetf_halo_stat_correct(v_new, current_value);
                        } else
                            if (pcase_var.eql($WRONG)) {
                                _csetf_halo_stat_wrong(v_new, current_value);
                            } else
                                if (pcase_var.eql($PARTIAL)) {
                                    _csetf_halo_stat_partial(v_new, current_value);
                                } else
                                    if (pcase_var.eql($UNKNOWN)) {
                                        _csetf_halo_stat_unknown(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ENCODED)) {
                                            _csetf_halo_stat_encoded(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($UNENCODED)) {
                                                _csetf_halo_stat_unencoded(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($TIME)) {
                                                    _csetf_halo_stat_time(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($TOTAL)) {
                                                        _csetf_halo_stat_total(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt134$Invalid_slot__S_for_construction_, current_arg);
                                                    }








                }
            }
            return v_new;
        }
    }

    public static final SubLObject halo_make_statistics(SubLObject name) {
        {
            SubLObject result = make_halo_statistics(UNPROVIDED);
            _csetf_halo_stat_name(result, name);
            _csetf_halo_stat_time(result, ZERO_INTEGER);
            _csetf_halo_stat_total(result, ZERO_INTEGER);
            return result;
        }
    }

    public static final SubLObject halo_statistics_print(SubLObject stat, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt280$__Name________A__, halo_stat_name(stat));
        format(stream, $str_alt281$__Correct_____A__, length(halo_stat_correct(stat)));
        format(stream, $str_alt282$__Wrong_______A__, length(halo_stat_wrong(stat)));
        format(stream, $str_alt283$__Partial_____A__, length(halo_stat_partial(stat)));
        format(stream, $str_alt284$__Unknown_____A__, length(halo_stat_unknown(stat)));
        format(stream, $str_alt285$__Encoded_____A__, length(halo_stat_encoded(stat)));
        format(stream, $str_alt286$__Unencoded___A__, length(halo_stat_unencoded(stat)));
        format(stream, $str_alt287$__Time________A__, halo_stat_time(stat));
        format(stream, $str_alt288$__Total_______A__, halo_stat_total(stat));
        return NIL;
    }

    public static final SubLObject halo_write_summary_to_stream(SubLObject stream, SubLObject query_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject mc_stats = halo_compute_stats(query_list);
                SubLObject da_stats = thread.secondMultipleValue();
                SubLObject total_stats = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                format(stream, $str_alt289$_br__center__h3_Summary__h3__tabl);
                format(stream, $str_alt290$_tr__td_Type__td__td_width__10___);
                format(stream, $str_alt291$_td_width__10___Partial__td_);
                format(stream, $str_alt292$_td_width__10___Wrong__td_);
                format(stream, $str_alt293$_td_width__10___Unknown__td_);
                format(stream, $str_alt294$_td_width__10___Encoded_Questions);
                format(stream, $str_alt295$_td_width__10___Total_Questions__);
                format(stream, $str_alt296$_td_width__10___Time__td___tr___);
                {
                    SubLObject cdolist_list_var = list(mc_stats, da_stats, total_stats);
                    SubLObject stat = NIL;
                    for (stat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stat = cdolist_list_var.first()) {
                        format(stream, $str_alt297$_tr__td__A__td__td__A__td__td__A_, new SubLObject[]{ halo_stat_name(stat), length(halo_stat_correct(stat)), length(halo_stat_partial(stat)) });
                        format(stream, $str_alt298$_td__A__td__td__A__td__td__A__td_, new SubLObject[]{ length(halo_stat_wrong(stat)), length(halo_stat_unknown(stat)), length(halo_stat_encoded(stat)) });
                        format(stream, $str_alt299$_td__A__td__td__A__td___tr___, halo_stat_total(stat), halo_stat_time(stat));
                    }
                }
                format(stream, $str_alt245$__table___center___);
                format(stream, $str_alt300$_h3_Correct__h3__A_br___, halo_stat_correct(total_stats));
                format(stream, $str_alt301$_h3_Partial__h3__A_br___, halo_stat_partial(total_stats));
                format(stream, $str_alt302$_h3_Wrong__h3__A_br___, halo_stat_wrong(total_stats));
                format(stream, $str_alt303$_h3_Unencoded__h3__A_br___, halo_stat_unencoded(total_stats));
            }
            return NIL;
        }
    }

    public static final SubLObject halo_compute_stats(SubLObject query_list) {
        {
            SubLObject mc_stats = halo_make_statistics($$$Multiple_Choice);
            SubLObject da_stats = halo_make_statistics($$$Detailed_Answer);
            SubLObject total_stats = halo_make_statistics($$$Combined);
            SubLObject cdolist_list_var = query_list;
            SubLObject query = NIL;
            for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                if (NIL != halo_query_spec_multiple_choiceP(query)) {
                    halo_update_stats(query, mc_stats);
                } else {
                    halo_update_stats(query, da_stats);
                }
                halo_update_stats(query, total_stats);
            }
            return values(mc_stats, da_stats, total_stats);
        }
    }

    public static final SubLObject halo_update_stats(SubLObject query, SubLObject stat) {
        {
            SubLObject num = halo_query_spec_number(query);
            SubLObject correctness = halo_calculate_query_correctness(query);
            _csetf_halo_stat_total(stat, add(halo_stat_total(stat), ONE_INTEGER));
            if (NIL == halo_query_spec_formula(query)) {
                _csetf_halo_stat_unencoded(stat, cons(num, halo_stat_unencoded(stat)));
                return NIL;
            }
            _csetf_halo_stat_encoded(stat, cons(num, halo_stat_encoded(stat)));
            _csetf_halo_stat_time(stat, add(halo_stat_time(stat), round(halo_query_spec_time(query), UNPROVIDED)));
            if (NIL != Strings.string_equal(correctness, $$$Correct, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_halo_stat_correct(stat, cons(num, halo_stat_correct(stat)));
            } else
                if (NIL != Strings.string_equal(correctness, $$$Partial, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    _csetf_halo_stat_partial(stat, cons(num, halo_stat_partial(stat)));
                } else
                    if (NIL != Strings.string_equal(correctness, $$$Wrong, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        _csetf_halo_stat_wrong(stat, cons(num, halo_stat_wrong(stat)));
                    } else
                        if (NIL != Strings.string_equal(correctness, $$$Unknown, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            _csetf_halo_stat_unknown(stat, cons(num, halo_stat_unknown(stat)));
                        }



        }
        return NIL;
    }

    public static final SubLObject halo_calculate_query_correctness(SubLObject query_spec) {
        SubLTrampolineFile.checkType(query_spec, HALO_QUERY_SPECIFICATION_P);
        if (NIL == halo_query_spec_formula(query_spec)) {
            return $str_alt311$_nbsp;
        }
        if (NIL != halo_query_spec_multiple_choiceP(query_spec)) {
            return halo_calculate_query_correctness_multiple_choice(query_spec);
        } else {
            return halo_calculate_query_correctness_detailed_answer(query_spec);
        }
    }

    public static final SubLObject halo_calculate_query_correctness_multiple_choice(SubLObject query_spec) {
        if ((NIL == halo_query_spec_correct_answer(query_spec)) && (NIL == halo_query_spec_answer(query_spec))) {
            return $str_alt312$Both_answer_and_correct_answer_un;
        } else
            if (NIL == halo_query_spec_correct_answer(query_spec)) {
                return $$$Correct_answer_unknown;
            } else
                if (NIL == halo_query_spec_answer(query_spec)) {
                    return $$$Unknown;
                } else
                    if (NIL != subl_promotions.memberP(halo_query_spec_correct_answer(query_spec), halo_query_spec_answer(query_spec), symbol_function(EQUAL), UNPROVIDED)) {
                        if (length(halo_query_spec_answer(query_spec)) == ONE_INTEGER) {
                            return $$$Correct;
                        } else {
                            return $$$Partial;
                        }
                    } else {
                        return $$$Wrong;
                    }



    }

    public static final SubLObject halo_calculate_query_correctness_detailed_answer(SubLObject query_spec) {
        if ((NIL == halo_query_spec_correct_answer(query_spec)) && (NIL == halo_query_spec_answer(query_spec))) {
            return $str_alt312$Both_answer_and_correct_answer_un;
        } else
            if (NIL == halo_query_spec_correct_answer(query_spec)) {
                return $$$Correct_answer_unknown;
            } else
                if (NIL == halo_query_spec_answer(query_spec)) {
                    return $$$Unknown;
                } else
                    if (halo_query_spec_correct_answer(query_spec).equal(halo_query_spec_bindings(query_spec))) {
                        return $$$Correct;
                    } else {
                        return $$$Wrong;
                    }



    }

    public static final SubLObject halo_write_query_spec_to_stream(SubLObject stream, SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    {
                        SubLObject single_answerP = list_utilities.singletonP(halo_query_spec_answer(query_spec));
                        SubLObject multiple_choiceP = halo_query_spec_multiple_choiceP(query_spec);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt314$_A, halo_query_spec_comment(query_spec));
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup(THREE_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_princ($$$Answer);
                        if (!((NIL != single_answerP) || (NIL != multiple_choiceP))) {
                            html_utilities.html_princ($$$s);
                        }
                        html_utilities.html_princ($str_alt317$_);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup(THREE_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        if (NIL == halo_query_spec_answer(query_spec)) {
                            html_utilities.html_princ($$$unknown);
                            html_utilities.html_newline(UNPROVIDED);
                        } else
                            if (NIL != single_answerP) {
                                html_utilities.html_markup(halo_query_spec_answer(query_spec).first());
                                html_utilities.html_newline(UNPROVIDED);
                            } else
                                if (NIL != multiple_choiceP) {
                                    html_utilities.html_princ($str_alt319$is_one_of_);
                                    {
                                        SubLObject last_item = last(halo_query_spec_answer(query_spec), UNPROVIDED).first();
                                        SubLObject rest = remove(last_item, halo_query_spec_answer(query_spec), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject cdolist_list_var = rest;
                                        SubLObject ans = NIL;
                                        for (ans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans = cdolist_list_var.first()) {
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt320$_A__, ans);
                                        }
                                        html_utilities.html_princ(last_item);
                                        html_utilities.html_newline(UNPROVIDED);
                                    }
                                } else {
                                    {
                                        SubLObject cdolist_list_var = halo_query_spec_answer(query_spec);
                                        SubLObject ans = NIL;
                                        for (ans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans = cdolist_list_var.first()) {
                                            html_utilities.html_markup(ans);
                                            html_utilities.html_newline(UNPROVIDED);
                                        }
                                    }
                                    html_utilities.html_newline(UNPROVIDED);
                                }


                        if (NIL != halo_query_spec_answer_just(query_spec)) {
                            if (NIL != halo_query_spec_show_question_p(query_spec)) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_princ($str_alt321$Formulation_of_Question_);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        halo_inference_paraphrase.halo_show_question(halo_query_spec_formula(query_spec));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup(THREE_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            html_utilities.html_princ($str_alt322$Justification_);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup(THREE_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = halo_query_spec_answer_just(query_spec);
                                SubLObject just = NIL;
                                for (just = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just = cdolist_list_var.first()) {
                                    halo_write_justification_to_stream(stream, just);
                                }
                            }
                        }
                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        force_output(stream);
                    }
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_write_justification_to_stream(SubLObject stream, SubLObject justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    {
                        SubLObject v_answer = halo_just_answer(justification);
                        SubLObject supportingP = halo_just_supportingP(justification);
                        SubLObject multiple_choiceP = halo_just_multiple_choiceP(justification);
                        SubLObject text = halo_just_text(justification);
                        if (NIL == multiple_choiceP) {
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_markup(text);
                        } else
                            if (NIL != supportingP) {
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt323$Answer__A_is_the_right_answer_bec, v_answer);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(text);
                                html_utilities.html_newline(UNPROVIDED);
                            } else {
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt324$Answer__A_can_be_excluded_because, v_answer);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(text);
                                html_utilities.html_newline(UNPROVIDED);
                            }

                    }
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_create_query_properties(SubLObject query_spec) {
        {
            SubLObject static_properties = halo_static_query_properties_from_query_spec(query_spec);
            SubLObject dynamic_properties = halo_dynamic_query_properties_from_query_spec(query_spec);
            return list_utilities.merge_plist(static_properties, dynamic_properties);
        }
    }

    /**
     *
     *
     * @return QUERY-STATIC-PROPERTIES-P corresponding to QUERY-SPEC.
     */
    public static final SubLObject halo_static_query_properties_from_query_spec(SubLObject query_spec) {
        {
            SubLObject hl_pred_transformationP = halo_query_spec_enable_hl_predicate_backchaining(query_spec);
            SubLObject unbound_pred_transformationP = halo_query_spec_enable_unbound_predicate_backchaining(query_spec);
            SubLObject negation_by_failureP = halo_query_spec_enable_negation_by_failure(query_spec);
            SubLObject intermediate_step_validation_level = halo_query_spec_intermediate_step_validation_level(query_spec);
            SubLObject conditional_sentenceP = halo_query_specification_conditional_sentenceP(query_spec);
            return list(new SubLObject[]{ $kw325$CONDITIONAL_SENTENCE_, conditional_sentenceP, $kw326$ALLOW_HL_PREDICATE_TRANSFORMATION_, hl_pred_transformationP, $kw327$NEGATION_BY_FAILURE_, negation_by_failureP, $INTERMEDIATE_STEP_VALIDATION_LEVEL, intermediate_step_validation_level, $kw328$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, unbound_pred_transformationP });
        }
    }

    /**
     *
     *
     * @return QUERY-DYNAMIC-PROPERTIES-P corresponding to QUERY-SPEC.
     */
    public static final SubLObject halo_dynamic_query_properties_from_query_spec(SubLObject query_spec) {
        {
            SubLObject max_backchain = halo_query_spec_back_chaining(query_spec);
            SubLObject max_depth = halo_query_spec_max_depth(query_spec);
            SubLObject removal_cost_cutoff = halo_query_spec_removal_cost_cutoff(query_spec);
            SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff(removal_cost_cutoff);
            SubLObject cache_resultsP = halo_query_spec_enable_cache_backwards_query_results(query_spec);
            SubLObject time = halo_query_spec_time_cutoff_secs(query_spec);
            SubLObject number = halo_query_spec_max_number_of_results(query_spec);
            return list(new SubLObject[]{ $MAX_TRANSFORMATION_DEPTH, max_backchain, $MAX_PROOF_DEPTH, max_depth, $RETURN, $BINDINGS_AND_SUPPORTS, $PRODUCTIVITY_LIMIT, productivity_limit, $ANSWER_LANGUAGE, $HL, $kw336$CACHE_INFERENCE_RESULTS_, cache_resultsP, $MAX_TIME, time, $MAX_NUMBER, number, $kw339$FORGET_EXTRA_RESULTS_, T });
        }
    }

    /**
     * Should QUERY-SPEC be treated as a conditional, hypothesizing any neg-lits?
     */
    public static final SubLObject halo_query_specification_conditional_sentenceP(SubLObject query_spec) {
        SubLTrampolineFile.checkType(query_spec, HALO_QUERY_SPECIFICATION_P);
        {
            SubLObject formula = halo_query_spec_formula(query_spec);
            return inference_strategist.inference_conditional_sentence_p(formula);
        }
    }

    /**
     * If bound to T, the Halo QA app will not destroy the inferences
     * and problem stores it uses to try to answer the queries.
     */
    // defvar
    private static final SubLSymbol $preserve_halo_queriesP$ = makeSymbol("*PRESERVE-HALO-QUERIES?*");

    /**
     * If bound to T, employ the round-robin iterative progress answering scheme.
     */
    // deflexical
    private static final SubLSymbol $use_round_robin_answering_schemeP$ = makeSymbol("*USE-ROUND-ROBIN-ANSWERING-SCHEME?*");

    public static final SubLObject halo_answer_query_spec(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
                try {
                    Errors.$continue_cerrorP$.bind(T, thread);
                    {
                        SubLObject time = NIL;
                        if (NIL != halo_query_spec_formula(query_spec)) {
                            {
                                SubLObject time_var = get_internal_real_time();
                                halo_ask_priming_query(query_spec);
                                if (NIL != halo_query_spec_multiple_choiceP(query_spec)) {
                                    {
                                        SubLObject problem_store = NIL;
                                        {
                                            SubLObject _prev_bind_0_14 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $preserve_halo_queriesP$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
                                                pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
                                                $preserve_halo_queriesP$.bind(T, thread);
                                                if (NIL != $use_round_robin_answering_schemeP$.getGlobalValue()) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject doneP = halo_answer_query_spec_pos_round_robin(query_spec);
                                                        SubLObject shared_problem_store = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        problem_store = shared_problem_store;
                                                    }
                                                } else {
                                                    problem_store = halo_answer_query_spec_pos(query_spec);
                                                }
                                                if (NIL == halo_query_spec_answer(query_spec)) {
                                                    halo_answer_query_spec_neg(query_spec, problem_store);
                                                    {
                                                        SubLObject cdolist_list_var = halo_query_spec_answer_just(query_spec);
                                                        SubLObject just = NIL;
                                                        for (just = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just = cdolist_list_var.first()) {
                                                            _csetf_halo_just_supportingP(just, NIL);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                $preserve_halo_queriesP$.rebind(_prev_bind_2, thread);
                                                pph_vars.$pph_justified_proofs$.rebind(_prev_bind_1, thread);
                                                pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                        if (NIL == $preserve_halo_queriesP$.getDynamicValue(thread)) {
                                            inference_datastructures_problem_store.destroy_problem_store(problem_store);
                                        }
                                    }
                                } else {
                                    halo_answer_query_spec_detailed_answer(query_spec);
                                }
                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            }
                            _csetf_halo_query_spec_time(query_spec, time);
                            _csetf_halo_query_spec_answer(query_spec, nreverse(halo_query_spec_answer(query_spec)));
                            _csetf_halo_query_spec_answer_just(query_spec, nreverse(halo_query_spec_answer_just(query_spec)));
                        }
                    }
                } finally {
                    Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_answer_query_spec_detailed_answer(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference = inference_kernel.new_continuable_inference(halo_query_spec_formula(query_spec), halo_query_spec_mt(query_spec), halo_query_spec_static_properties(query_spec));
                SubLObject just = NIL;
                if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                    halo_trace(format(NIL, $str_alt340$__Trying__S__, halo_query_spec_number(query_spec)));
                    {
                        SubLObject results = inference_kernel.continue_inference(inference, halo_query_spec_dynamic_properties(query_spec));
                        SubLObject arbitrary_result = results.first();
                        SubLObject arbitrary_bindings = arbitrary_result.first();
                        SubLObject arbitrary_binding = arbitrary_bindings.first();
                        SubLObject arbitrary_binding_value = bindings.variable_binding_value(arbitrary_binding);
                        SubLObject show_consequentP = halo_query_spec_show_consequentP(query_spec);
                        if (NIL != results) {
                            halo_trace(format(NIL, $str_alt341$__Results___S__, results));
                            _csetf_halo_query_spec_bindings(query_spec, arbitrary_binding_value);
                            {
                                SubLObject desired_number_of_answers = halo_query_spec_how_many_answers_desiredP(query_spec);
                                SubLObject answers_displayed = ZERO_INTEGER;
                                SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                                        SubLObject inference_answer = NIL;
                                        while (NIL != id) {
                                            inference_answer = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != id_index.do_id_index_id_and_object_validP(id, inference_answer, $SKIP)) {
                                                if (!answers_displayed.numGE(desired_number_of_answers)) {
                                                    {
                                                        SubLObject proof = halo_choose_inference_answer_proof(inference_answer);
                                                        SubLObject nl_answer = NIL;
                                                        {
                                                            SubLObject stream = NIL;
                                                            try {
                                                                stream = make_private_string_output_stream();
                                                                if ((NIL != show_consequentP) || (NIL == inference_datastructures_inference.inference_answer_bindings(inference_answer))) {
                                                                    halo_inference_paraphrase.halo_display_proof_query_formula(proof, stream, inference);
                                                                } else {
                                                                    halo_inference_paraphrase.halo_display_answer_bindings(inference_answer, stream);
                                                                }
                                                                nl_answer = get_output_stream_string(stream);
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        close(stream, UNPROVIDED);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject item_var = nl_answer;
                                                            if (NIL == member(item_var, halo_query_spec_answer(query_spec), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                _csetf_halo_query_spec_answer(query_spec, cons(item_var, halo_query_spec_answer(query_spec)));
                                                            }
                                                        }
                                                        {
                                                            SubLObject stream = NIL;
                                                            try {
                                                                stream = make_private_string_output_stream();
                                                                halo_inference_paraphrase.halo_display_inference_answer(inference_answer, stream, halo_query_spec_mt(query_spec), proof);
                                                                just = get_output_stream_string(stream);
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        close(stream, UNPROVIDED);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    answers_displayed = add(answers_displayed, ONE_INTEGER);
                                                }
                                            }
                                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                                        } 
                                    }
                                }
                                {
                                    SubLObject item_var = halo_make_justification(halo_query_spec_bindings(query_spec), T, just, NIL);
                                    if (NIL == member(item_var, halo_query_spec_answer_just(query_spec), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        _csetf_halo_query_spec_answer_just(query_spec, cons(item_var, halo_query_spec_answer_just(query_spec)));
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == $preserve_halo_queriesP$.getDynamicValue(thread)) {
                    inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return INTEGERP; How many answers (at most) for QUERY-SPEC should we display?
     */
    public static final SubLObject halo_query_spec_how_many_answers_desiredP(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cached_value = halo_query_spec_max_number_of_results(query_spec);
                return NIL != subl_promotions.non_negative_integer_p(cached_value) ? ((SubLObject) (cached_value)) : NIL != subl_promotions.non_negative_integer_p($halo_query_max_number_of_results$.getDynamicValue(thread)) ? ((SubLObject) ($halo_query_max_number_of_results$.getDynamicValue(thread))) : ONE_INTEGER;
            }
        }
    }

    public static final SubLObject halo_query_spec_show_consequentP(SubLObject query_spec) {
        return halo_query_spec_generate_consequentP(query_spec);
    }

    /**
     * Pick an answer for INFERENCE to display.
     *
     * @unknown - Arbitrarily picks the first one.
     */
    public static final SubLObject halo_choose_inference_answer(SubLObject inference) {
        {
            SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject inference_answer = NIL;
                    while (NIL != id) {
                        inference_answer = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != id_index.do_id_index_id_and_object_validP(id, inference_answer, $SKIP)) {
                            return inference_answer;
                        }
                        id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
        }
        return NIL;
    }

    /**
     * Pick a proof of INFERENCE-ANSWER to display.
     *
     * @unknown - Arbitrarily picks the first one.
     */
    public static final SubLObject halo_choose_inference_answer_proof(SubLObject inference_answer) {
        {
            SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
            SubLObject justification = NIL;
            for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_15 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                    SubLObject proof = NIL;
                    for (proof = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , proof = cdolist_list_var_15.first()) {
                        return proof;
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject halo_ask_priming_query(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formula = halo_query_spec_formula(query_spec);
                SubLObject priming_query = (formula.first() == $$implies) ? ((SubLObject) (listS($$implies, second(formula), $list_alt344))) : NIL;
                if (NIL == priming_query) {
                    return NIL;
                }
                halo_trace(format(NIL, $str_alt345$__Asking_priming_query__A__, halo_query_spec_number(query_spec)));
                {
                    SubLObject inference = inference_kernel.new_continuable_inference(priming_query, halo_query_spec_mt(query_spec), halo_query_spec_static_properties(query_spec));
                    if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject results = inference_kernel.continue_inference(inference, putf(halo_query_spec_dynamic_properties(query_spec), $kw336$CACHE_INFERENCE_RESULTS_, T));
                            SubLObject halt_reason = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            halo_trace(format(NIL, $str_alt346$__Halt_reason___A__Inference_stat, halt_reason, inference_datastructures_inference.inference_status(inference)));
                        }
                        halo_repropagate_forward_rules(inference);
                    }
                    inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_repropagate_forward_rules(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hypothetical_mt = inference_datastructures_inference.inference_mt(inference);
                if (NIL != hlmt.hlmt_p(hypothetical_mt)) {
                    {
                        SubLObject assertions = NIL;
                        assertions = append(assertions, kb_mapping.gather_predicate_extent_index($$completeAtomicComposition_List, hypothetical_mt, UNPROVIDED));
                        assertions = append(assertions, kb_mapping.gather_predicate_extent_index($$insolubleIn_TypeType, hypothetical_mt, UNPROVIDED));
                        assertions = append(assertions, kb_mapping.gather_predicate_extent_index($$chemicalProducts_TypeType, hypothetical_mt, UNPROVIDED));
                        assertions = append(assertions, kb_mapping.gather_predicate_extent_index($$reactionTypeInMixture, hypothetical_mt, UNPROVIDED));
                        {
                            SubLObject assertion_count = length(assertions);
                            halo_trace(format(NIL, $str_alt351$__repropagating__A_assertions____, assertion_count));
                            {
                                SubLObject cdolist_list_var = assertions;
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    {
                                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                        try {
                                            api_control_vars.$the_cyclist$.bind($$CycAdministrator, thread);
                                            forward.repropagate_forward_assertion(assertion);
                                        } finally {
                                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Seconds to work on each problem before shifting to the next.
     */
    // defparameter
    private static final SubLSymbol $halo_round_robin_answering_time_slice$ = makeSymbol("*HALO-ROUND-ROBIN-ANSWERING-TIME-SLICE*");

    public static final SubLObject halo_answer_query_spec_someway_round_robin(SubLObject query_spec, SubLObject sub_queries, SubLObject shared_problem_store) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_time = halo_query_spec_time_cutoff_secs(query_spec);
                SubLObject time_slice = $halo_round_robin_answering_time_slice$.getDynamicValue(thread);
                SubLObject letters = list($$$A, $$$B, $$$C, $$$D, $$$E);
                SubLObject job_queue = queues.create_queue();
                SubLObject inferences = NIL;
                SubLObject doneP = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(FIVE_INTEGER); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject letter = nth(i, letters);
                        SubLObject sub_query = nth(i, sub_queries);
                        SubLObject inference = halo_create_one_time_sliced_sub_query(query_spec, sub_query, letter, shared_problem_store);
                        inferences = cons(inference, inferences);
                        queues.enqueue(list(inference, letter, max_time), job_queue);
                        if (NIL == shared_problem_store) {
                            shared_problem_store = inference_datastructures_inference.inference_problem_store(inference);
                        }
                    }
                }
                while ((NIL == doneP) && (NIL == queues.queue_empty_p(job_queue))) {
                    {
                        SubLObject current_job = queues.dequeue(job_queue);
                        SubLObject datum = current_job;
                        SubLObject current = datum;
                        SubLObject inference = NIL;
                        SubLObject letter = NIL;
                        SubLObject time_to_die = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt358);
                        inference = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt358);
                        letter = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt358);
                        time_to_die = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            halo_trace(format(NIL, $str_alt359$Scheduling__A_with__A_time_to_liv, letter, time_to_die));
                            doneP = halo_schedule_one_time_sliced_sub_query(query_spec, letter, inference, time_slice);
                            if (NIL == doneP) {
                                time_to_die = subtract(time_to_die, time_slice);
                                if (time_to_die.isPositive()) {
                                    halo_trace(format(NIL, $str_alt360$enqueing__A_with__A_time_to_live_, letter, time_to_die));
                                    queues.enqueue(list(inference, letter, time_to_die), job_queue);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt358);
                        }
                    }
                } 
                {
                    SubLObject cdolist_list_var = inferences;
                    SubLObject inference = NIL;
                    for (inference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference = cdolist_list_var.first()) {
                        inference_datastructures_inference.destroy_inference(inference);
                    }
                }
                return values(doneP, shared_problem_store);
            }
        }
    }

    public static final SubLObject halo_answer_query_spec_pos_round_robin(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sub_queries = list(halo_query_spec_query_a(query_spec), halo_query_spec_query_b(query_spec), halo_query_spec_query_c(query_spec), halo_query_spec_query_d(query_spec), halo_query_spec_query_e(query_spec));
                thread.resetMultipleValues();
                {
                    SubLObject doneP = halo_answer_query_spec_someway_round_robin(query_spec, sub_queries, NIL);
                    SubLObject new_problem_store = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(doneP, new_problem_store);
                }
            }
        }
    }

    public static final SubLObject halo_answer_query_spec_pos(SubLObject query_spec) {
        {
            SubLObject problem_store = halo_ask_one_sub_query(query_spec, halo_query_spec_query_a(query_spec), $$$A, UNPROVIDED);
            halo_ask_one_sub_query(query_spec, halo_query_spec_query_b(query_spec), $$$B, problem_store);
            halo_ask_one_sub_query(query_spec, halo_query_spec_query_c(query_spec), $$$C, problem_store);
            halo_ask_one_sub_query(query_spec, halo_query_spec_query_d(query_spec), $$$D, problem_store);
            halo_ask_one_sub_query(query_spec, halo_query_spec_query_e(query_spec), $$$E, problem_store);
            return problem_store;
        }
    }

    public static final SubLObject halo_answer_query_spec_neg(SubLObject query_spec, SubLObject problem_store) {
        {
            SubLObject v_answer = NIL;
            halo_ask_one_sub_query(query_spec, halo_query_spec_neg_query_a(query_spec), $$$A, problem_store);
            halo_ask_one_sub_query(query_spec, halo_query_spec_neg_query_b(query_spec), $$$B, problem_store);
            halo_ask_one_sub_query(query_spec, halo_query_spec_neg_query_c(query_spec), $$$C, problem_store);
            halo_ask_one_sub_query(query_spec, halo_query_spec_neg_query_d(query_spec), $$$D, problem_store);
            halo_ask_one_sub_query(query_spec, halo_query_spec_neg_query_e(query_spec), $$$E, problem_store);
            v_answer = set_difference($list_alt361, halo_query_spec_answer(query_spec), symbol_function(STRING_EQUAL), UNPROVIDED);
            if (NIL == v_answer) {
                _csetf_halo_query_spec_answer_just(query_spec, NIL);
            }
            if (!length(v_answer).numE(FIVE_INTEGER)) {
                _csetf_halo_query_spec_answer(query_spec, v_answer);
            }
        }
        return NIL;
    }

    public static final SubLObject halo_ask_one_sub_query(SubLObject query_spec, SubLObject sub_query, SubLObject letter, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            halo_trace(format(NIL, $str_alt363$__Trying__S_S__, halo_query_spec_number(query_spec), letter));
            {
                SubLObject inference = inference_kernel.new_continuable_inference(sub_query, halo_query_spec_mt(query_spec), putf(halo_query_spec_static_properties(query_spec), $PROBLEM_STORE, problem_store));
                SubLObject problem_store_16 = inference_datastructures_inference.inference_problem_store(inference);
                SubLObject just = NIL;
                if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject results = inference_kernel.continue_inference(inference, putf(halo_query_spec_dynamic_properties(query_spec), $kw336$CACHE_INFERENCE_RESULTS_, NIL));
                        SubLObject halt_reason = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (halt_reason == $ABORT) {
                            inference_datastructures_problem_store.destroy_problem_store(problem_store_16);
                            problem_store_16 = NIL;
                        }
                        {
                            SubLObject cdolist_list_var = results;
                            SubLObject result = NIL;
                            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = result;
                                    SubLObject current = datum;
                                    SubLObject binding = NIL;
                                    SubLObject justification = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt366);
                                    binding = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt366);
                                    justification = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != justification) {
                                            {
                                                SubLObject item_var = letter;
                                                if (NIL == member(item_var, halo_query_spec_answer(query_spec), symbol_function(STRING_EQUAL), symbol_function(IDENTITY))) {
                                                    _csetf_halo_query_spec_answer(query_spec, cons(item_var, halo_query_spec_answer(query_spec)));
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt366);
                                    }
                                }
                            }
                        }
                        if (NIL != results) {
                            halo_trace(format(NIL, $str_alt341$__Results___S__, results));
                            {
                                SubLObject inference_answer = halo_choose_inference_answer(inference);
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    halo_inference_paraphrase.halo_display_inference_answer(inference_answer, stream, halo_query_spec_mt(query_spec), UNPROVIDED);
                                    just = get_output_stream_string(stream);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            close(stream, UNPROVIDED);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject item_var = halo_make_justification(letter, T, just, UNPROVIDED);
                                if (NIL == member(item_var, halo_query_spec_answer_just(query_spec), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    _csetf_halo_query_spec_answer_just(query_spec, cons(item_var, halo_query_spec_answer_just(query_spec)));
                                }
                            }
                        }
                    }
                }
                if (NIL == $preserve_halo_queriesP$.getDynamicValue(thread)) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
                return problem_store_16;
            }
        }
    }

    public static final SubLObject halo_create_one_time_sliced_sub_query(SubLObject query_spec, SubLObject sub_query, SubLObject letter, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        halo_trace(format(NIL, $str_alt367$__Allocating_inference_for__S_S__, halo_query_spec_number(query_spec), letter));
        {
            SubLObject inference = inference_kernel.new_continuable_inference(sub_query, halo_query_spec_mt(query_spec), putf(halo_query_spec_static_properties(query_spec), $PROBLEM_STORE, problem_store));
            return inference;
        }
    }

    public static final SubLObject halo_schedule_one_time_sliced_sub_query(SubLObject query_spec, SubLObject letter, SubLObject inference, SubLObject time_slice) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = T;
                if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject results = inference_kernel.continue_inference(inference, putf(putf(halo_query_spec_dynamic_properties(query_spec), $kw336$CACHE_INFERENCE_RESULTS_, NIL), $MAX_TIME, time_slice));
                        SubLObject halt_reason = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (halt_reason == $ABORT) {
                            halo_trace(format(NIL, $str_alt368$Inference_aborted_asking__A__, letter));
                            inference_datastructures_problem_store.destroy_problem_store(inference_datastructures_inference.inference_problem_store(inference));
                            doneP = NIL;
                        } else
                            if (halt_reason == $MAX_TIME) {
                                halo_trace(format(NIL, $str_alt369$Timed_out_asking__A__, letter));
                                doneP = NIL;
                            } else
                                if (halt_reason == $MAX_NUMBER) {
                                    halo_trace(format(NIL, $str_alt370$Got_an_answer_for__A__, letter));
                                    {
                                        SubLObject just = NIL;
                                        SubLObject cdolist_list_var = results;
                                        SubLObject result = NIL;
                                        for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = result;
                                                SubLObject current = datum;
                                                SubLObject binding = NIL;
                                                SubLObject justification = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt366);
                                                binding = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt366);
                                                justification = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (NIL != justification) {
                                                        {
                                                            SubLObject item_var = letter;
                                                            if (NIL == member(item_var, halo_query_spec_answer(query_spec), symbol_function(STRING_EQUAL), symbol_function(IDENTITY))) {
                                                                _csetf_halo_query_spec_answer(query_spec, cons(item_var, halo_query_spec_answer(query_spec)));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt366);
                                                }
                                            }
                                        }
                                        if (NIL == results) {
                                            doneP = NIL;
                                        }
                                        if (NIL != results) {
                                            halo_trace(format(NIL, $str_alt341$__Results___S__, results));
                                            {
                                                SubLObject inference_answer = halo_choose_inference_answer(inference);
                                                SubLObject stream = NIL;
                                                try {
                                                    stream = make_private_string_output_stream();
                                                    halo_inference_paraphrase.halo_display_inference_answer(inference_answer, stream, halo_query_spec_mt(query_spec), UNPROVIDED);
                                                    just = get_output_stream_string(stream);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            close(stream, UNPROVIDED);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject item_var = halo_make_justification(letter, T, just, UNPROVIDED);
                                                if (NIL == member(item_var, halo_query_spec_answer_just(query_spec), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    _csetf_halo_query_spec_answer_just(query_spec, cons(item_var, halo_query_spec_answer_just(query_spec)));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    halo_trace(format(NIL, $str_alt371$struck_out_on__A__, letter));
                                    halo_trace(format(NIL, $str_alt372$halt_reason___A__, halt_reason));
                                    doneP = NIL;
                                }


                    }
                } else {
                    halo_trace(format(NIL, $str_alt373$Non_continuable_inference_for__A_, letter));
                    doneP = NIL;
                }
                return doneP;
            }
        }
    }

    /**
     * For determining definitional assertions. Rebound in
     * halo-valid-definitional-assertion-p as needed.
     */
    // defparameter
    private static final SubLSymbol $halo_definitional_fort$ = makeSymbol("*HALO-DEFINITIONAL-FORT*");

    // defparameter
    private static final SubLSymbol $halo_ke_direction$ = makeSymbol("*HALO-KE-DIRECTION*");

    // defparameter
    private static final SubLSymbol $halo_ke_tv$ = makeSymbol("*HALO-KE-TV*");

    // defparameter
    private static final SubLSymbol $halo_ke_mt$ = makeSymbol("*HALO-KE-MT*");

    // defparameter
    private static final SubLSymbol $halo_ke_current_constant$ = makeSymbol("*HALO-KE-CURRENT-CONSTANT*");

    // defparameter
    private static final SubLSymbol $halo_ke_filter_preds$ = makeSymbol("*HALO-KE-FILTER-PREDS*");

    public static final SubLObject halo_generate_artefact_2(SubLObject file, SubLObject mt, SubLObject test_specification) {
        if (file == UNPROVIDED) {
            file = $halo_default_output_file$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $halo_default_query_mt$.getDynamicValue();
        }
        if (test_specification == UNPROVIDED) {
            test_specification = $halo_default_test_specification$.getDynamicValue();
        }
        ensure_halo_qa_interface_initialized();
        {
            SubLObject query_pairs = ask_utilities.ask_template($list_alt377, listS($$and, list($$isa, $sym216$_QUERY, test_specification), $list_alt217), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject detailed_answers = genls.specs(test_specification, mt, UNPROVIDED);
            SubLObject temp_gloss_terms = NIL;
            SubLObject gloss_terms = NIL;
            query_pairs = Sort.sort(query_pairs, symbol_function($sym218$_), symbol_function(HALO_QUERY_NUMBER_LAMBDA));
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(file, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt221$Unable_to_open__S, file);
                    }
                    {
                        SubLObject out = stream;
                        format(out, $str_alt379$___KE_file_for_loading_all_querie);
                        format(out, $str_alt380$_________Test_specification_const);
                        halo_write_definitional_ke_for_fort(test_specification, out);
                        if (NIL != detailed_answers) {
                            format(out, $str_alt381$_________Detailed_query_definitio);
                            {
                                SubLObject cdolist_list_var = detailed_answers;
                                SubLObject detailed_answer = NIL;
                                for (detailed_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , detailed_answer = cdolist_list_var.first()) {
                                    halo_write_definitional_ke_for_fort(detailed_answer, out);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = query_pairs;
                            SubLObject query_pair = NIL;
                            for (query_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_pair = cdolist_list_var.first()) {
                                temp_gloss_terms = halo_dump_ke_for_fort_pair(query_pair, out);
                                {
                                    SubLObject cdolist_list_var_17 = temp_gloss_terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , v_term = cdolist_list_var_17.first()) {
                                        {
                                            SubLObject item_var = v_term;
                                            if (NIL == member(item_var, gloss_terms, symbol_function(EQ), symbol_function(IDENTITY))) {
                                                gloss_terms = cons(item_var, gloss_terms);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        halo_write_glossary_as_ke_comment(gloss_terms, out);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject halo_query_number_lambda(SubLObject query_pair) {
        return kb_mapping_utilities.fpred_value_in_any_mt(narts_high.find_nart(second(query_pair)), $$testQueryToNumber, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject halo_write_definitional_ke_for_fort(SubLObject fort, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $halo_definitional_fort$.currentBinding(thread);
                SubLObject _prev_bind_1 = $halo_ke_current_constant$.currentBinding(thread);
                try {
                    $halo_definitional_fort$.bind(fort, thread);
                    $halo_ke_current_constant$.bind(fort, thread);
                    {
                        SubLObject assertions = NIL;
                        {
                            SubLObject _prev_bind_0_18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1_19 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                assertions = delete_if(symbol_function($sym384$DEDUCED_ASSERTION_), kb_mapping.gather_term_assertions(fort, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_19, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_18, thread);
                            }
                        }
                        assertions = list_utilities.delete_if_not(symbol_function(HALO_VALID_DEFINITIONAL_ASSERTION_P), assertions, symbol_function(ASSERTION_EL_FORMULA), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        assertions = Sort.sort(assertions, symbol_function(HALO_ASSERTION_COMPARATOR), UNPROVIDED);
                        halo_write_ke_for_fort($halo_ke_current_constant$.getDynamicValue(thread), stream);
                        {
                            SubLObject cdolist_list_var = assertions;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                halo_write_assertion_as_ke_text(assertion, stream);
                            }
                        }
                    }
                } finally {
                    $halo_ke_current_constant$.rebind(_prev_bind_1, thread);
                    $halo_definitional_fort$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_write_ke_for_fort(SubLObject fort, SubLObject stream) {
        if (NIL != forts.fort_p(fort)) {
            $halo_ke_mt$.setDynamicValue(NIL);
            format(stream, $str_alt388$Constant___A_____, kb_paths.fort_name(fort));
        }
        return NIL;
    }

    public static final SubLObject halo_valid_definitional_assertion_p(SubLObject el_assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq(second(el_assertion), $halo_definitional_fort$.getDynamicValue(thread));
        }
    }

    public static final SubLObject halo_assertion_comparator(SubLObject ass1, SubLObject ass2) {
        {
            SubLObject pred1 = uncanonicalizer.assertion_el_formula(ass1).first();
            SubLObject pred2 = uncanonicalizer.assertion_el_formula(ass2).first();
            if (pred1 == pred2) {
                return T;
            }
            if (pred1 == $$isa) {
                return T;
            }
            if ((pred1 == $$isa) && (pred2 == $$genls)) {
                return T;
            }
            if ((pred1 == $$genls) && (pred2 != $$isa)) {
                return T;
            }
            return NIL;
        }
    }

    public static final SubLObject halo_write_glossary_as_ke_comment(SubLObject gloss_list, SubLObject stream) {
        {
            SubLObject sorted_gloss_list = Sort.sort(gloss_list, symbol_function($sym390$STRING_), symbol_function(HALO_GLOSS_LAMBDA));
            format(stream, $str_alt392$___________Glossary_of_terms_____);
            {
                SubLObject cdolist_list_var = sorted_gloss_list;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    {
                        SubLObject comment = kb_mapping_utilities.fpred_value_in_any_mt(v_term, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != comment) {
                            halo_write_string_as_ke_comment(cconcatenate(constants_high.constant_name(v_term), new SubLObject[]{ $str_alt393$__, comment }), stream);
                            format(stream, $str_alt394$__);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject halo_gloss_lambda(SubLObject constant) {
        return Strings.string_downcase(constants_high.constant_name(constant), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject halo_dump_ke_for_fort_pair(SubLObject query_pair, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_fort = query_pair.first();
                SubLObject query_nart = narts_high.find_nart(second(query_pair));
                SubLObject fort_assertions = NIL;
                SubLObject nart_assertions = NIL;
                SubLObject gloss_terms = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        fort_assertions = delete_if(symbol_function($sym384$DEDUCED_ASSERTION_), kb_mapping.gather_term_assertions(query_fort, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        nart_assertions = delete_if(symbol_function($sym384$DEDUCED_ASSERTION_), kb_mapping.gather_term_assertions(query_nart, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                fort_assertions = Sort.sort(fort_assertions, symbol_function(HALO_ASSERTION_COMPARATOR), UNPROVIDED);
                nart_assertions = Sort.sort(nart_assertions, symbol_function(HALO_ASSERTION_COMPARATOR), UNPROVIDED);
                format(stream, $str_alt395$_________Begin_definition_of_quer, halo_remove_hd_from_constants(query_fort));
                halo_write_ke_for_fort(query_fort, stream);
                {
                    SubLObject cdolist_list_var = fort_assertions;
                    SubLObject fort_assertion = NIL;
                    for (fort_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort_assertion = cdolist_list_var.first()) {
                        halo_write_assertion_as_ke_text(fort_assertion, stream);
                    }
                }
                {
                    SubLObject cdolist_list_var = nart_assertions;
                    SubLObject nart_assertion = NIL;
                    for (nart_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nart_assertion = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = halo_write_assertion_as_ke_text(nart_assertion, stream);
                            if (NIL == member(item_var, gloss_terms, symbol_function(EQ), symbol_function(IDENTITY))) {
                                gloss_terms = cons(item_var, gloss_terms);
                            }
                        }
                    }
                }
                gloss_terms = list_utilities.flatten(gloss_terms);
                format(stream, $str_alt396$_________End_definition_of_query_, halo_remove_hd_from_constants(query_fort));
                return gloss_terms;
            }
        }
    }

    public static final SubLObject halo_write_assertion_as_ke_text(SubLObject assertion, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject direction = assertions_high.assertion_direction(assertion);
                    SubLObject tv = assertions_high.assertion_strength(assertion);
                    if (NIL == subl_promotions.memberP(formula.first(), $halo_ke_filter_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        if (mt != $halo_ke_mt$.getDynamicValue(thread)) {
                            $halo_ke_mt$.setDynamicValue(mt, thread);
                            format(stream, $str_alt397$in_Mt___A___, halo_remove_hd_from_constants($halo_ke_mt$.getDynamicValue(thread)));
                        }
                        if (tv != $halo_ke_tv$.getDynamicValue(thread)) {
                            $halo_ke_tv$.setDynamicValue(tv, thread);
                            format(stream, $str_alt398$tv___A___, $halo_ke_tv$.getDynamicValue(thread));
                        }
                        if (direction != $halo_ke_direction$.getDynamicValue(thread)) {
                            $halo_ke_direction$.setDynamicValue(direction, thread);
                            format(stream, $str_alt399$d___A___, $halo_ke_direction$.getDynamicValue(thread));
                        }
                        format(stream, $str_alt400$f___A_____, halo_remove_hd_from_constants(formula));
                        if (NIL != halo_query_sentence_assertion_p(formula)) {
                            return halo_write_query_sentence_paraphrase(formula, stream);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_write_query_sentence_paraphrase(SubLObject formula, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_sentence = third(formula);
                SubLObject term_list = list_utilities.flatten(query_sentence);
                SubLObject string = NIL;
                SubLObject stream_20 = NIL;
                try {
                    stream_20 = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pph_vars.$constant_link_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = halo_inference_paraphrase.$halo_paraphrase_mode$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream_20, thread);
                            pph_vars.$constant_link_function$.bind($NONE, thread);
                            halo_inference_paraphrase.$halo_paraphrase_mode$.bind($TEXT, thread);
                            halo_inference_paraphrase.halo_show_question(query_sentence);
                        } finally {
                            halo_inference_paraphrase.$halo_paraphrase_mode$.rebind(_prev_bind_2, thread);
                            pph_vars.$constant_link_function$.rebind(_prev_bind_1, thread);
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    string = get_output_stream_string(stream_20);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream_20, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                halo_write_string_as_ke_comment(string, stream);
                format(stream, $str_alt394$__);
                return delete_duplicates(list_utilities.delete_if_not(symbol_function(CONSTANT_P), term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLObject halo_query_sentence_assertion_p(SubLObject formula) {
        return makeBoolean((formula.first() == $const168$softwareParameterValueInSpecifica) && (second(formula) == $$InferenceSentenceParameter));
    }

    /**
     * break STRING into hunks which fit in at most 76 characters
     * at word breaks and prepend ';; ' to make it a comment
     */
    public static final SubLObject halo_write_string_as_ke_comment(SubLObject string, SubLObject stream) {
        {
            SubLObject max_index = $int$76;
            SubLObject temp_string = string_utilities.strip_chars_meeting_test(string, symbol_function(HALO_NEWLINE_CHAR_P));
            SubLObject string_list = halo_wrap_string(temp_string, max_index);
            SubLObject cdolist_list_var = string_list;
            SubLObject one_string = NIL;
            for (one_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , one_string = cdolist_list_var.first()) {
                format(stream, $str_alt404$____A__, one_string);
            }
        }
        return NIL;
    }

    public static final SubLObject halo_newline_char_p(SubLObject v_char) {
        return member(v_char, $list_alt405, UNPROVIDED, UNPROVIDED);
    }

    /**
     * break STRING into a list of strings each at most MAX-INDEX
     * in length, making sure to break at whitespace
     */
    public static final SubLObject halo_wrap_string(SubLObject string, SubLObject max_index) {
        {
            SubLObject index = max_index;
            SubLObject temp_string = string;
            SubLObject string_list = NIL;
            while (length(temp_string).numG(max_index)) {
                index = max_index;
                while (NIL == string_utilities.whitespacep(string_utilities.char_at(temp_string, index))) {
                    index = subtract(index, ONE_INTEGER);
                } 
                string_list = cons(string_utilities.trim_whitespace(string_utilities.substring(temp_string, ZERO_INTEGER, index)), string_list);
                temp_string = string_utilities.trim_whitespace(string_utilities.substring(temp_string, index, UNPROVIDED));
            } 
            string_list = cons(temp_string, string_list);
            return nreverse(string_list);
        }
    }

    public static final SubLObject halo_remove_hd_from_constants(SubLObject v_object) {
        {
            SubLObject result = NIL;
            if (NIL != constant_handles.constant_p(v_object)) {
                return constants_high.constant_name(v_object);
            }
            if (v_object.isList()) {
                {
                    SubLObject cdolist_list_var = v_object;
                    SubLObject one_term = NIL;
                    for (one_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , one_term = cdolist_list_var.first()) {
                        if (one_term.isList()) {
                            result = cons(halo_remove_hd_from_constants(one_term), result);
                        } else
                            if (NIL != constant_handles.constant_p(one_term)) {
                                result = cons(constants_high.constant_name(one_term), result);
                            } else
                                if (one_term.isString()) {
                                    result = cons(cconcatenate($str_alt406$_, new SubLObject[]{ one_term, $str_alt406$_ }), result);
                                } else {
                                    result = cons(one_term, result);
                                }


                    }
                }
                return nreverse(result);
            }
        }
        return NIL;
    }

    public static final SubLObject halo_decode_number_to_letter(SubLObject number) {
        {
            SubLObject pcase_var = number;
            if (pcase_var.eql(ONE_INTEGER)) {
                return $$$A;
            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    return $$$B;
                } else
                    if (pcase_var.eql(THREE_INTEGER)) {
                        return $$$C;
                    } else
                        if (pcase_var.eql(FOUR_INTEGER)) {
                            return $$$D;
                        } else
                            if (pcase_var.eql(FIVE_INTEGER)) {
                                return $$$E;
                            }




        }
        return number;
    }

    public static final SubLObject halo_trace(SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $halo_trace$.getDynamicValue(thread)) {
                format(T, message);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    /**
     * The starting reinforcment level when doing auto-reinforcement.
     */
    // defparameter
    private static final SubLSymbol $halo_initial_reinforcement_amount$ = makeSymbol("*HALO-INITIAL-REINFORCEMENT-AMOUNT*");

    public static final SubLObject halo_reinforce_queries_with_practice_rules(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $halo_default_query_mt$.getDynamicValue();
        }
        {
            SubLObject query_constants = halo_queries_that_need_training();
            SubLObject cdolist_list_var = query_constants;
            SubLObject query_constant = NIL;
            for (query_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_constant = cdolist_list_var.first()) {
                halo_reinforce_query_with_practice_rules(query_constant, mt);
            }
        }
        return NIL;
    }

    public static final SubLObject halo_reinforce_query_with_practice_rules(SubLObject query_constant, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $halo_default_query_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject practice_rules = halo_query_practice_rules(query_constant, mt);
                SubLObject trainableP = halo_query_trainedP(query_constant, mt, practice_rules);
                if (NIL == trainableP) {
                    if (NIL != $halo_trace$.getDynamicValue(thread)) {
                        format(T, $str_alt407$__Query__S_was_untrainable_, query_constant);
                    }
                    return values(trainableP, NIL);
                }
                {
                    SubLObject reinforcement_passes = NIL;
                    SubLObject reinforcement_amount = NIL;
                    SubLObject trainedP = NIL;
                    for (reinforcement_passes = ZERO_INTEGER, reinforcement_amount = $halo_initial_reinforcement_amount$.getDynamicValue(thread), trainedP = halo_query_trainedP(query_constant, mt, NIL); NIL == trainedP; reinforcement_passes = number_utilities.f_1X(reinforcement_passes) , reinforcement_amount = multiply(TWO_INTEGER, reinforcement_amount) , trainedP = halo_query_trainedP(query_constant, mt, NIL)) {
                        halo_reinforce_query_practice_rules(practice_rules, reinforcement_amount);
                    }
                    if (NIL != $halo_trace$.getDynamicValue(thread)) {
                        if (reinforcement_passes.isZero()) {
                            format(T, $str_alt408$__Query__S_did_not_require_traini, query_constant);
                        } else {
                            format(T, $str_alt409$__Query__S_was_trained_after__S_r, query_constant, reinforcement_passes);
                        }
                    }
                    return values(trainableP, reinforcement_passes);
                }
            }
        }
    }

    public static final SubLObject halo_queries_that_need_training() {
        {
            SubLObject queries = inference_kernel.new_cyc_query($list_alt410, $const2$UIA_HaloChemistry_DemoEnvironment, $list_alt411);
            return queries;
        }
    }

    public static final SubLObject halo_query_practice_rules(SubLObject query_constant, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $halo_default_query_mt$.getDynamicValue();
        }
        return kb_mapping_utilities.pred_values_in_relevant_mts(query_constant, $$queryPracticeRules, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject halo_query_trainedP(SubLObject query_constant, SubLObject mt, SubLObject practice_rules) {
        if (mt == UNPROVIDED) {
            mt = $halo_default_query_mt$.getDynamicValue();
        }
        if (practice_rules == UNPROVIDED) {
            practice_rules = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_spec = halo_query_specification_get(query_constant, mt);
                if (NIL != practice_rules) {
                    _csetf_halo_query_spec_static_properties(query_spec, putf(halo_query_spec_static_properties(query_spec), $ALLOWED_RULES, practice_rules));
                }
                {
                    SubLObject _prev_bind_0 = inference_analysis.$transformation_rule_statistics_update_enabledP$.currentBinding(thread);
                    try {
                        inference_analysis.$transformation_rule_statistics_update_enabledP$.bind(NIL, thread);
                        halo_answer_query_spec(query_spec);
                    } finally {
                        inference_analysis.$transformation_rule_statistics_update_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.sublisp_boolean(halo_query_spec_answer(query_spec));
            }
        }
    }

    public static final SubLObject halo_reinforce_query_practice_rules(SubLObject practice_rules, SubLObject reinforcement_amount) {
        {
            SubLObject cdolist_list_var = practice_rules;
            SubLObject rule = NIL;
            for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                inference_analysis.reinforce_transformation_rule(rule, reinforcement_amount);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_halo_qa_interface_file() {
        declareFunction("halo_query_spec_show_question_p", "HALO-QUERY-SPEC-SHOW-QUESTION-P", 1, 0, false);
        declareMacro("maybe_with_halo_sbhl_resourcing", "MAYBE-WITH-HALO-SBHL-RESOURCING");
        declareFunction("initialize_halo_qa_interface", "INITIALIZE-HALO-QA-INTERFACE", 0, 0, false);
        declareFunction("ensure_halo_qa_interface_initialized", "ENSURE-HALO-QA-INTERFACE-INITIALIZED", 0, 0, false);
        declareFunction("halo_query_specification_print_function_trampoline", "HALO-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("halo_query_specification_p", "HALO-QUERY-SPECIFICATION-P", 1, 0, false);
        new halo_qa_interface.$halo_query_specification_p$UnaryFunction();
        declareFunction("halo_query_spec_cycl_id", "HALO-QUERY-SPEC-CYCL-ID", 1, 0, false);
        declareFunction("halo_query_spec_number", "HALO-QUERY-SPEC-NUMBER", 1, 0, false);
        declareFunction("halo_query_spec_formula", "HALO-QUERY-SPEC-FORMULA", 1, 0, false);
        declareFunction("halo_query_spec_query_a", "HALO-QUERY-SPEC-QUERY-A", 1, 0, false);
        declareFunction("halo_query_spec_neg_query_a", "HALO-QUERY-SPEC-NEG-QUERY-A", 1, 0, false);
        declareFunction("halo_query_spec_query_b", "HALO-QUERY-SPEC-QUERY-B", 1, 0, false);
        declareFunction("halo_query_spec_neg_query_b", "HALO-QUERY-SPEC-NEG-QUERY-B", 1, 0, false);
        declareFunction("halo_query_spec_query_c", "HALO-QUERY-SPEC-QUERY-C", 1, 0, false);
        declareFunction("halo_query_spec_neg_query_c", "HALO-QUERY-SPEC-NEG-QUERY-C", 1, 0, false);
        declareFunction("halo_query_spec_query_d", "HALO-QUERY-SPEC-QUERY-D", 1, 0, false);
        declareFunction("halo_query_spec_neg_query_d", "HALO-QUERY-SPEC-NEG-QUERY-D", 1, 0, false);
        declareFunction("halo_query_spec_query_e", "HALO-QUERY-SPEC-QUERY-E", 1, 0, false);
        declareFunction("halo_query_spec_neg_query_e", "HALO-QUERY-SPEC-NEG-QUERY-E", 1, 0, false);
        declareFunction("halo_query_spec_bindings", "HALO-QUERY-SPEC-BINDINGS", 1, 0, false);
        declareFunction("halo_query_spec_answer", "HALO-QUERY-SPEC-ANSWER", 1, 0, false);
        declareFunction("halo_query_spec_answer_just", "HALO-QUERY-SPEC-ANSWER-JUST", 1, 0, false);
        declareFunction("halo_query_spec_correct_answer", "HALO-QUERY-SPEC-CORRECT-ANSWER", 1, 0, false);
        declareFunction("halo_query_spec_time", "HALO-QUERY-SPEC-TIME", 1, 0, false);
        declareFunction("halo_query_spec_mt", "HALO-QUERY-SPEC-MT", 1, 0, false);
        declareFunction("halo_query_spec_comment", "HALO-QUERY-SPEC-COMMENT", 1, 0, false);
        declareFunction("halo_query_spec_static_properties", "HALO-QUERY-SPEC-STATIC-PROPERTIES", 1, 0, false);
        declareFunction("halo_query_spec_dynamic_properties", "HALO-QUERY-SPEC-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction("halo_query_spec_multiple_choiceP", "HALO-QUERY-SPEC-MULTIPLE-CHOICE?", 1, 0, false);
        declareFunction("halo_query_spec_generate_consequentP", "HALO-QUERY-SPEC-GENERATE-CONSEQUENT?", 1, 0, false);
        declareFunction("halo_query_spec_max_number_of_results", "HALO-QUERY-SPEC-MAX-NUMBER-OF-RESULTS", 1, 0, false);
        declareFunction("halo_query_spec_back_chaining", "HALO-QUERY-SPEC-BACK-CHAINING", 1, 0, false);
        declareFunction("halo_query_spec_time_cutoff_secs", "HALO-QUERY-SPEC-TIME-CUTOFF-SECS", 1, 0, false);
        declareFunction("halo_query_spec_max_depth", "HALO-QUERY-SPEC-MAX-DEPTH", 1, 0, false);
        declareFunction("halo_query_spec_removal_cost_cutoff", "HALO-QUERY-SPEC-REMOVAL-COST-CUTOFF", 1, 0, false);
        declareFunction("halo_query_spec_enable_negation_by_failure", "HALO-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE", 1, 0, false);
        declareFunction("halo_query_spec_enable_hl_predicate_backchaining", "HALO-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING", 1, 0, false);
        declareFunction("halo_query_spec_enable_cache_backwards_query_results", "HALO-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 1, 0, false);
        declareFunction("halo_query_spec_enable_unbound_predicate_backchaining", "HALO-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 1, 0, false);
        declareFunction("halo_query_spec_intermediate_step_validation_level", "HALO-QUERY-SPEC-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
        declareFunction("_csetf_halo_query_spec_cycl_id", "_CSETF-HALO-QUERY-SPEC-CYCL-ID", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_number", "_CSETF-HALO-QUERY-SPEC-NUMBER", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_formula", "_CSETF-HALO-QUERY-SPEC-FORMULA", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_query_a", "_CSETF-HALO-QUERY-SPEC-QUERY-A", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_neg_query_a", "_CSETF-HALO-QUERY-SPEC-NEG-QUERY-A", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_query_b", "_CSETF-HALO-QUERY-SPEC-QUERY-B", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_neg_query_b", "_CSETF-HALO-QUERY-SPEC-NEG-QUERY-B", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_query_c", "_CSETF-HALO-QUERY-SPEC-QUERY-C", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_neg_query_c", "_CSETF-HALO-QUERY-SPEC-NEG-QUERY-C", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_query_d", "_CSETF-HALO-QUERY-SPEC-QUERY-D", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_neg_query_d", "_CSETF-HALO-QUERY-SPEC-NEG-QUERY-D", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_query_e", "_CSETF-HALO-QUERY-SPEC-QUERY-E", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_neg_query_e", "_CSETF-HALO-QUERY-SPEC-NEG-QUERY-E", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_bindings", "_CSETF-HALO-QUERY-SPEC-BINDINGS", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_answer", "_CSETF-HALO-QUERY-SPEC-ANSWER", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_answer_just", "_CSETF-HALO-QUERY-SPEC-ANSWER-JUST", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_correct_answer", "_CSETF-HALO-QUERY-SPEC-CORRECT-ANSWER", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_time", "_CSETF-HALO-QUERY-SPEC-TIME", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_mt", "_CSETF-HALO-QUERY-SPEC-MT", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_comment", "_CSETF-HALO-QUERY-SPEC-COMMENT", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_static_properties", "_CSETF-HALO-QUERY-SPEC-STATIC-PROPERTIES", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_dynamic_properties", "_CSETF-HALO-QUERY-SPEC-DYNAMIC-PROPERTIES", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_multiple_choiceP", "_CSETF-HALO-QUERY-SPEC-MULTIPLE-CHOICE?", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_generate_consequentP", "_CSETF-HALO-QUERY-SPEC-GENERATE-CONSEQUENT?", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_max_number_of_results", "_CSETF-HALO-QUERY-SPEC-MAX-NUMBER-OF-RESULTS", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_back_chaining", "_CSETF-HALO-QUERY-SPEC-BACK-CHAINING", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_time_cutoff_secs", "_CSETF-HALO-QUERY-SPEC-TIME-CUTOFF-SECS", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_max_depth", "_CSETF-HALO-QUERY-SPEC-MAX-DEPTH", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_removal_cost_cutoff", "_CSETF-HALO-QUERY-SPEC-REMOVAL-COST-CUTOFF", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_enable_negation_by_failure", "_CSETF-HALO-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_enable_hl_predicate_backchaining", "_CSETF-HALO-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_enable_cache_backwards_query_results", "_CSETF-HALO-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_enable_unbound_predicate_backchaining", "_CSETF-HALO-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 2, 0, false);
        declareFunction("_csetf_halo_query_spec_intermediate_step_validation_level", "_CSETF-HALO-QUERY-SPEC-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
        declareFunction("make_halo_query_specification", "MAKE-HALO-QUERY-SPECIFICATION", 0, 1, false);
        declareFunction("halo_query_specification_print", "HALO-QUERY-SPECIFICATION-PRINT", 3, 0, false);
        declareFunction("halo_query_specification_new", "HALO-QUERY-SPECIFICATION-NEW", 0, 0, false);
        declareFunction("halo_query_specification_get", "HALO-QUERY-SPECIFICATION-GET", 1, 1, false);
        declareFunction("halo_extract_test_atom", "HALO-EXTRACT-TEST-ATOM", 1, 0, false);
        declareFunction("halo_query_specification_get_int", "HALO-QUERY-SPECIFICATION-GET-INT", 1, 2, false);
        declareFunction("halo_create_single_query_from_formula", "HALO-CREATE-SINGLE-QUERY-FROM-FORMULA", 3, 0, false);
        declareFunction("halo_list_finder_comparator", "HALO-LIST-FINDER-COMPARATOR", 2, 0, false);
        declareFunction("halo_query_specification_assign_param", "HALO-QUERY-SPECIFICATION-ASSIGN-PARAM", 3, 0, false);
        declareFunction("halo_justification_print_function_trampoline", "HALO-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("halo_justification_p", "HALO-JUSTIFICATION-P", 1, 0, false);
        new halo_qa_interface.$halo_justification_p$UnaryFunction();
        declareFunction("halo_just_answer", "HALO-JUST-ANSWER", 1, 0, false);
        declareFunction("halo_just_supportingP", "HALO-JUST-SUPPORTING?", 1, 0, false);
        declareFunction("halo_just_multiple_choiceP", "HALO-JUST-MULTIPLE-CHOICE?", 1, 0, false);
        declareFunction("halo_just_text", "HALO-JUST-TEXT", 1, 0, false);
        declareFunction("_csetf_halo_just_answer", "_CSETF-HALO-JUST-ANSWER", 2, 0, false);
        declareFunction("_csetf_halo_just_supportingP", "_CSETF-HALO-JUST-SUPPORTING?", 2, 0, false);
        declareFunction("_csetf_halo_just_multiple_choiceP", "_CSETF-HALO-JUST-MULTIPLE-CHOICE?", 2, 0, false);
        declareFunction("_csetf_halo_just_text", "_CSETF-HALO-JUST-TEXT", 2, 0, false);
        declareFunction("make_halo_justification", "MAKE-HALO-JUSTIFICATION", 0, 1, false);
        declareFunction("halo_make_justification", "HALO-MAKE-JUSTIFICATION", 3, 1, false);
        declareFunction("halo_justification_print", "HALO-JUSTIFICATION-PRINT", 3, 0, false);
        declareFunction("halo_generate_answers_with_process_wrapper", "HALO-GENERATE-ANSWERS-WITH-PROCESS-WRAPPER", 4, 0, false);
        declareFunction("format_inference_metrics", "FORMAT-INFERENCE-METRICS", 1, 0, false);
        declareFunction("halo_generate_answers_from_mt", "HALO-GENERATE-ANSWERS-FROM-MT", 0, 3, false);
        declareFunction("halo_generate_answers_for_numbers", "HALO-GENERATE-ANSWERS-FOR-NUMBERS", 1, 3, false);
        declareFunction("halo_generate_answer_for_number", "HALO-GENERATE-ANSWER-FOR-NUMBER", 1, 3, false);
        declareFunction("halo_write_results_table_to_stream", "HALO-WRITE-RESULTS-TABLE-TO-STREAM", 2, 0, false);
        declareFunction("halo_statistics_print_function_trampoline", "HALO-STATISTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("halo_statistics_p", "HALO-STATISTICS-P", 1, 0, false);
        new halo_qa_interface.$halo_statistics_p$UnaryFunction();
        declareFunction("halo_stat_name", "HALO-STAT-NAME", 1, 0, false);
        declareFunction("halo_stat_correct", "HALO-STAT-CORRECT", 1, 0, false);
        declareFunction("halo_stat_wrong", "HALO-STAT-WRONG", 1, 0, false);
        declareFunction("halo_stat_partial", "HALO-STAT-PARTIAL", 1, 0, false);
        declareFunction("halo_stat_unknown", "HALO-STAT-UNKNOWN", 1, 0, false);
        declareFunction("halo_stat_encoded", "HALO-STAT-ENCODED", 1, 0, false);
        declareFunction("halo_stat_unencoded", "HALO-STAT-UNENCODED", 1, 0, false);
        declareFunction("halo_stat_time", "HALO-STAT-TIME", 1, 0, false);
        declareFunction("halo_stat_total", "HALO-STAT-TOTAL", 1, 0, false);
        declareFunction("_csetf_halo_stat_name", "_CSETF-HALO-STAT-NAME", 2, 0, false);
        declareFunction("_csetf_halo_stat_correct", "_CSETF-HALO-STAT-CORRECT", 2, 0, false);
        declareFunction("_csetf_halo_stat_wrong", "_CSETF-HALO-STAT-WRONG", 2, 0, false);
        declareFunction("_csetf_halo_stat_partial", "_CSETF-HALO-STAT-PARTIAL", 2, 0, false);
        declareFunction("_csetf_halo_stat_unknown", "_CSETF-HALO-STAT-UNKNOWN", 2, 0, false);
        declareFunction("_csetf_halo_stat_encoded", "_CSETF-HALO-STAT-ENCODED", 2, 0, false);
        declareFunction("_csetf_halo_stat_unencoded", "_CSETF-HALO-STAT-UNENCODED", 2, 0, false);
        declareFunction("_csetf_halo_stat_time", "_CSETF-HALO-STAT-TIME", 2, 0, false);
        declareFunction("_csetf_halo_stat_total", "_CSETF-HALO-STAT-TOTAL", 2, 0, false);
        declareFunction("make_halo_statistics", "MAKE-HALO-STATISTICS", 0, 1, false);
        declareFunction("halo_make_statistics", "HALO-MAKE-STATISTICS", 1, 0, false);
        declareFunction("halo_statistics_print", "HALO-STATISTICS-PRINT", 3, 0, false);
        declareFunction("halo_write_summary_to_stream", "HALO-WRITE-SUMMARY-TO-STREAM", 2, 0, false);
        declareFunction("halo_compute_stats", "HALO-COMPUTE-STATS", 1, 0, false);
        declareFunction("halo_update_stats", "HALO-UPDATE-STATS", 2, 0, false);
        declareFunction("halo_calculate_query_correctness", "HALO-CALCULATE-QUERY-CORRECTNESS", 1, 0, false);
        declareFunction("halo_calculate_query_correctness_multiple_choice", "HALO-CALCULATE-QUERY-CORRECTNESS-MULTIPLE-CHOICE", 1, 0, false);
        declareFunction("halo_calculate_query_correctness_detailed_answer", "HALO-CALCULATE-QUERY-CORRECTNESS-DETAILED-ANSWER", 1, 0, false);
        declareFunction("halo_write_query_spec_to_stream", "HALO-WRITE-QUERY-SPEC-TO-STREAM", 2, 0, false);
        declareFunction("halo_write_justification_to_stream", "HALO-WRITE-JUSTIFICATION-TO-STREAM", 2, 0, false);
        declareFunction("halo_create_query_properties", "HALO-CREATE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction("halo_static_query_properties_from_query_spec", "HALO-STATIC-QUERY-PROPERTIES-FROM-QUERY-SPEC", 1, 0, false);
        declareFunction("halo_dynamic_query_properties_from_query_spec", "HALO-DYNAMIC-QUERY-PROPERTIES-FROM-QUERY-SPEC", 1, 0, false);
        declareFunction("halo_query_specification_conditional_sentenceP", "HALO-QUERY-SPECIFICATION-CONDITIONAL-SENTENCE?", 1, 0, false);
        declareFunction("halo_answer_query_spec", "HALO-ANSWER-QUERY-SPEC", 1, 0, false);
        declareFunction("halo_answer_query_spec_detailed_answer", "HALO-ANSWER-QUERY-SPEC-DETAILED-ANSWER", 1, 0, false);
        declareFunction("halo_query_spec_how_many_answers_desiredP", "HALO-QUERY-SPEC-HOW-MANY-ANSWERS-DESIRED?", 1, 0, false);
        declareFunction("halo_query_spec_show_consequentP", "HALO-QUERY-SPEC-SHOW-CONSEQUENT?", 1, 0, false);
        declareFunction("halo_choose_inference_answer", "HALO-CHOOSE-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("halo_choose_inference_answer_proof", "HALO-CHOOSE-INFERENCE-ANSWER-PROOF", 1, 0, false);
        declareFunction("halo_ask_priming_query", "HALO-ASK-PRIMING-QUERY", 1, 0, false);
        declareFunction("halo_repropagate_forward_rules", "HALO-REPROPAGATE-FORWARD-RULES", 1, 0, false);
        declareFunction("halo_answer_query_spec_someway_round_robin", "HALO-ANSWER-QUERY-SPEC-SOMEWAY-ROUND-ROBIN", 3, 0, false);
        declareFunction("halo_answer_query_spec_pos_round_robin", "HALO-ANSWER-QUERY-SPEC-POS-ROUND-ROBIN", 1, 0, false);
        declareFunction("halo_answer_query_spec_pos", "HALO-ANSWER-QUERY-SPEC-POS", 1, 0, false);
        declareFunction("halo_answer_query_spec_neg", "HALO-ANSWER-QUERY-SPEC-NEG", 2, 0, false);
        declareFunction("halo_ask_one_sub_query", "HALO-ASK-ONE-SUB-QUERY", 3, 1, false);
        declareFunction("halo_create_one_time_sliced_sub_query", "HALO-CREATE-ONE-TIME-SLICED-SUB-QUERY", 3, 1, false);
        declareFunction("halo_schedule_one_time_sliced_sub_query", "HALO-SCHEDULE-ONE-TIME-SLICED-SUB-QUERY", 4, 0, false);
        declareFunction("halo_generate_artefact_2", "HALO-GENERATE-ARTEFACT-2", 0, 3, false);
        declareFunction("halo_query_number_lambda", "HALO-QUERY-NUMBER-LAMBDA", 1, 0, false);
        declareFunction("halo_write_definitional_ke_for_fort", "HALO-WRITE-DEFINITIONAL-KE-FOR-FORT", 2, 0, false);
        declareFunction("halo_write_ke_for_fort", "HALO-WRITE-KE-FOR-FORT", 2, 0, false);
        declareFunction("halo_valid_definitional_assertion_p", "HALO-VALID-DEFINITIONAL-ASSERTION-P", 1, 0, false);
        declareFunction("halo_assertion_comparator", "HALO-ASSERTION-COMPARATOR", 2, 0, false);
        declareFunction("halo_write_glossary_as_ke_comment", "HALO-WRITE-GLOSSARY-AS-KE-COMMENT", 2, 0, false);
        declareFunction("halo_gloss_lambda", "HALO-GLOSS-LAMBDA", 1, 0, false);
        declareFunction("halo_dump_ke_for_fort_pair", "HALO-DUMP-KE-FOR-FORT-PAIR", 2, 0, false);
        declareFunction("halo_write_assertion_as_ke_text", "HALO-WRITE-ASSERTION-AS-KE-TEXT", 2, 0, false);
        declareFunction("halo_write_query_sentence_paraphrase", "HALO-WRITE-QUERY-SENTENCE-PARAPHRASE", 2, 0, false);
        declareFunction("halo_query_sentence_assertion_p", "HALO-QUERY-SENTENCE-ASSERTION-P", 1, 0, false);
        declareFunction("halo_write_string_as_ke_comment", "HALO-WRITE-STRING-AS-KE-COMMENT", 2, 0, false);
        declareFunction("halo_newline_char_p", "HALO-NEWLINE-CHAR-P", 1, 0, false);
        declareFunction("halo_wrap_string", "HALO-WRAP-STRING", 2, 0, false);
        declareFunction("halo_remove_hd_from_constants", "HALO-REMOVE-HD-FROM-CONSTANTS", 1, 0, false);
        declareFunction("halo_decode_number_to_letter", "HALO-DECODE-NUMBER-TO-LETTER", 1, 0, false);
        declareFunction("halo_trace", "HALO-TRACE", 1, 0, false);
        declareFunction("halo_reinforce_queries_with_practice_rules", "HALO-REINFORCE-QUERIES-WITH-PRACTICE-RULES", 0, 1, false);
        declareFunction("halo_reinforce_query_with_practice_rules", "HALO-REINFORCE-QUERY-WITH-PRACTICE-RULES", 1, 1, false);
        declareFunction("halo_queries_that_need_training", "HALO-QUERIES-THAT-NEED-TRAINING", 0, 0, false);
        declareFunction("halo_query_practice_rules", "HALO-QUERY-PRACTICE-RULES", 1, 1, false);
        declareFunction("halo_query_trainedP", "HALO-QUERY-TRAINED?", 1, 2, false);
        declareFunction("halo_reinforce_query_practice_rules", "HALO-REINFORCE-QUERY-PRACTICE-RULES", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_halo_qa_interface_file() {
        defparameter("*HALO-DEFAULT-TEST-SPECIFICATION*", $const0$HaloChemistryKnowledgeTestSpecifi);
        defparameter("*HALO-DEFAULT-OUTPUT-FILE*", cconcatenate($str_alt1$test_html, EMPTY_SUBL_OBJECT_ARRAY));
        defparameter("*HALO-DEFAULT-QUERY-MT*", $const2$UIA_HaloChemistry_DemoEnvironment);
        deflexical("*HALO-QA-RESOURCING-SPACES*", TEN_INTEGER);
        defparameter("*HALO-DESTROY-EPHEMERAL-TERMS?*", NIL);
        defparameter("*HALO-SUPPRESS-QUERY-FORMULA-DISPLAY?*", T);
        defparameter("*HALO-TRACE*", NIL);
        deflexical("*HALO-QA-INTERFACE-INTITIALIZED*", NIL);
        defconstant("*DTP-HALO-QUERY-SPECIFICATION*", HALO_QUERY_SPECIFICATION);
        defparameter("*HALO-QUERY-TIME-DEFAULT*", ZERO_INTEGER);
        defparameter("*HALO-QUERY-MAX-NUMBER-OF-RESULTS*", ONE_INTEGER);
        defparameter("*HALO-QUERY-BACK-CHAINING-DEFAULT*", THREE_INTEGER);
        defparameter("*HALO-QUERY-BACK-CHAINING-DEFAULT-OVERRIDES-SPECIFIED-SETTING?*", NIL);
        defparameter("*HALO-QUERY-TIME-CUTOFF-DEFAULT*", $int$120);
        defparameter("*HALO-QUERY-MAX-DEPTH-DEFAULT*", TWENTY_INTEGER);
        defparameter("*HALO-QUERY-REMOVAL-COST-CUTOFF-DEFAULT*", $int$10000);
        defparameter("*HALO-QUERY-ENABLE-UNBOUND-PREDICATE-BACKCHAINING-DEFAULT*", NIL);
        defparameter("*HALO-QUERY-INTERMEDIATE-STEP-VALIDATION-LEVEL-DEFAULT*", $NONE);
        defparameter("*HALO-QUERY-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS-DEFAULT*", NIL);
        defparameter("*HALO-QUERY-ENABLE-HL-PREDICATE-BACKCHAINING-DEFAULT*", NIL);
        defparameter("*HALO-QUERY-ENABLE-NEGATION-BY-FAILURE-DEFAULT*", NIL);
        defconstant("*DTP-HALO-JUSTIFICATION*", HALO_JUSTIFICATION);
        defparameter("*HALO-GENERATE-ANSWERS-WITH-METRICS*", NIL);
        defconstant("*DTP-HALO-STATISTICS*", HALO_STATISTICS);
        defvar("*PRESERVE-HALO-QUERIES?*", NIL);
        deflexical("*USE-ROUND-ROBIN-ANSWERING-SCHEME?*", T);
        defparameter("*HALO-ROUND-ROBIN-ANSWERING-TIME-SLICE*", TWENTY_INTEGER);
        defparameter("*HALO-DEFINITIONAL-FORT*", NIL);
        defparameter("*HALO-KE-DIRECTION*", $FORWARD);
        defparameter("*HALO-KE-TV*", $DEFAULT);
        defparameter("*HALO-KE-MT*", NIL);
        defparameter("*HALO-KE-CURRENT-CONSTANT*", NIL);
        defparameter("*HALO-KE-FILTER-PREDS*", $list_alt376);
        defparameter("*HALO-INITIAL-REINFORCEMENT-AMOUNT*", TEN_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_halo_qa_interface_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_halo_query_specification$.getGlobalValue(), symbol_function(HALO_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HALO_QUERY_SPEC_CYCL_ID, _CSETF_HALO_QUERY_SPEC_CYCL_ID);
        def_csetf(HALO_QUERY_SPEC_NUMBER, _CSETF_HALO_QUERY_SPEC_NUMBER);
        def_csetf(HALO_QUERY_SPEC_FORMULA, _CSETF_HALO_QUERY_SPEC_FORMULA);
        def_csetf(HALO_QUERY_SPEC_QUERY_A, _CSETF_HALO_QUERY_SPEC_QUERY_A);
        def_csetf(HALO_QUERY_SPEC_NEG_QUERY_A, _CSETF_HALO_QUERY_SPEC_NEG_QUERY_A);
        def_csetf(HALO_QUERY_SPEC_QUERY_B, _CSETF_HALO_QUERY_SPEC_QUERY_B);
        def_csetf(HALO_QUERY_SPEC_NEG_QUERY_B, _CSETF_HALO_QUERY_SPEC_NEG_QUERY_B);
        def_csetf(HALO_QUERY_SPEC_QUERY_C, _CSETF_HALO_QUERY_SPEC_QUERY_C);
        def_csetf(HALO_QUERY_SPEC_NEG_QUERY_C, _CSETF_HALO_QUERY_SPEC_NEG_QUERY_C);
        def_csetf(HALO_QUERY_SPEC_QUERY_D, _CSETF_HALO_QUERY_SPEC_QUERY_D);
        def_csetf(HALO_QUERY_SPEC_NEG_QUERY_D, _CSETF_HALO_QUERY_SPEC_NEG_QUERY_D);
        def_csetf(HALO_QUERY_SPEC_QUERY_E, _CSETF_HALO_QUERY_SPEC_QUERY_E);
        def_csetf(HALO_QUERY_SPEC_NEG_QUERY_E, _CSETF_HALO_QUERY_SPEC_NEG_QUERY_E);
        def_csetf(HALO_QUERY_SPEC_BINDINGS, _CSETF_HALO_QUERY_SPEC_BINDINGS);
        def_csetf(HALO_QUERY_SPEC_ANSWER, _CSETF_HALO_QUERY_SPEC_ANSWER);
        def_csetf(HALO_QUERY_SPEC_ANSWER_JUST, _CSETF_HALO_QUERY_SPEC_ANSWER_JUST);
        def_csetf(HALO_QUERY_SPEC_CORRECT_ANSWER, _CSETF_HALO_QUERY_SPEC_CORRECT_ANSWER);
        def_csetf(HALO_QUERY_SPEC_TIME, _CSETF_HALO_QUERY_SPEC_TIME);
        def_csetf(HALO_QUERY_SPEC_MT, _CSETF_HALO_QUERY_SPEC_MT);
        def_csetf(HALO_QUERY_SPEC_COMMENT, _CSETF_HALO_QUERY_SPEC_COMMENT);
        def_csetf(HALO_QUERY_SPEC_STATIC_PROPERTIES, _CSETF_HALO_QUERY_SPEC_STATIC_PROPERTIES);
        def_csetf(HALO_QUERY_SPEC_DYNAMIC_PROPERTIES, _CSETF_HALO_QUERY_SPEC_DYNAMIC_PROPERTIES);
        def_csetf($sym76$HALO_QUERY_SPEC_MULTIPLE_CHOICE_, $sym77$_CSETF_HALO_QUERY_SPEC_MULTIPLE_CHOICE_);
        def_csetf($sym78$HALO_QUERY_SPEC_GENERATE_CONSEQUENT_, $sym79$_CSETF_HALO_QUERY_SPEC_GENERATE_CONSEQUENT_);
        def_csetf(HALO_QUERY_SPEC_MAX_NUMBER_OF_RESULTS, _CSETF_HALO_QUERY_SPEC_MAX_NUMBER_OF_RESULTS);
        def_csetf(HALO_QUERY_SPEC_BACK_CHAINING, _CSETF_HALO_QUERY_SPEC_BACK_CHAINING);
        def_csetf(HALO_QUERY_SPEC_TIME_CUTOFF_SECS, _CSETF_HALO_QUERY_SPEC_TIME_CUTOFF_SECS);
        def_csetf(HALO_QUERY_SPEC_MAX_DEPTH, _CSETF_HALO_QUERY_SPEC_MAX_DEPTH);
        def_csetf(HALO_QUERY_SPEC_REMOVAL_COST_CUTOFF, _CSETF_HALO_QUERY_SPEC_REMOVAL_COST_CUTOFF);
        def_csetf(HALO_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE, _CSETF_HALO_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE);
        def_csetf(HALO_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING, _CSETF_HALO_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING);
        def_csetf(HALO_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS, _CSETF_HALO_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS);
        def_csetf(HALO_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING, _CSETF_HALO_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING);
        def_csetf(HALO_QUERY_SPEC_INTERMEDIATE_STEP_VALIDATION_LEVEL, _CSETF_HALO_QUERY_SPEC_INTERMEDIATE_STEP_VALIDATION_LEVEL);
        identity(HALO_QUERY_SPECIFICATION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_halo_justification$.getGlobalValue(), symbol_function(HALO_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HALO_JUST_ANSWER, _CSETF_HALO_JUST_ANSWER);
        def_csetf($sym201$HALO_JUST_SUPPORTING_, $sym202$_CSETF_HALO_JUST_SUPPORTING_);
        def_csetf($sym203$HALO_JUST_MULTIPLE_CHOICE_, $sym204$_CSETF_HALO_JUST_MULTIPLE_CHOICE_);
        def_csetf(HALO_JUST_TEXT, _CSETF_HALO_JUST_TEXT);
        identity(HALO_JUSTIFICATION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_halo_statistics$.getGlobalValue(), symbol_function(HALO_STATISTICS_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HALO_STAT_NAME, _CSETF_HALO_STAT_NAME);
        def_csetf(HALO_STAT_CORRECT, _CSETF_HALO_STAT_CORRECT);
        def_csetf(HALO_STAT_WRONG, _CSETF_HALO_STAT_WRONG);
        def_csetf(HALO_STAT_PARTIAL, _CSETF_HALO_STAT_PARTIAL);
        def_csetf(HALO_STAT_UNKNOWN, _CSETF_HALO_STAT_UNKNOWN);
        def_csetf(HALO_STAT_ENCODED, _CSETF_HALO_STAT_ENCODED);
        def_csetf(HALO_STAT_UNENCODED, _CSETF_HALO_STAT_UNENCODED);
        def_csetf(HALO_STAT_TIME, _CSETF_HALO_STAT_TIME);
        def_csetf(HALO_STAT_TOTAL, _CSETF_HALO_STAT_TOTAL);
        identity(HALO_STATISTICS);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $const0$HaloChemistryKnowledgeTestSpecifi = constant_handles.reader_make_constant_shell(makeString("HaloChemistryKnowledgeTestSpecification-Pilot"));

    static private final SubLString $str_alt1$test_html = makeString("test.html");

    public static final SubLObject $const2$UIA_HaloChemistry_DemoEnvironment = constant_handles.reader_make_constant_shell(makeString("UIA-HaloChemistry-DemoEnvironmentMt"));



    static private final SubLList $list_alt4 = list(makeSymbol("POSITIVE-INTEGER-P"), makeSymbol("*HALO-QA-RESOURCING-SPACES*"));

    private static final SubLSymbol WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");

    public static final SubLSymbol $halo_qa_resourcing_spaces$ = makeSymbol("*HALO-QA-RESOURCING-SPACES*");



    static private final SubLList $list_alt8 = list(makeSymbol("CSETQ"), makeSymbol("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?*"), T);

    private static final SubLSymbol HALO_QUERY_SPECIFICATION = makeSymbol("HALO-QUERY-SPECIFICATION");

    private static final SubLSymbol HALO_QUERY_SPECIFICATION_P = makeSymbol("HALO-QUERY-SPECIFICATION-P");

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeSymbol("CYCL-ID"), makeSymbol("NUMBER"), makeSymbol("FORMULA"), makeSymbol("QUERY-A"), makeSymbol("NEG-QUERY-A"), makeSymbol("QUERY-B"), makeSymbol("NEG-QUERY-B"), makeSymbol("QUERY-C"), makeSymbol("NEG-QUERY-C"), makeSymbol("QUERY-D"), makeSymbol("NEG-QUERY-D"), makeSymbol("QUERY-E"), makeSymbol("NEG-QUERY-E"), makeSymbol("BINDINGS"), makeSymbol("ANSWER"), makeSymbol("ANSWER-JUST"), makeSymbol("CORRECT-ANSWER"), makeSymbol("TIME"), makeSymbol("MT"), makeSymbol("COMMENT"), makeSymbol("STATIC-PROPERTIES"), makeSymbol("DYNAMIC-PROPERTIES"), makeSymbol("MULTIPLE-CHOICE?"), makeSymbol("GENERATE-CONSEQUENT?"), makeSymbol("MAX-NUMBER-OF-RESULTS"), makeSymbol("BACK-CHAINING"), makeSymbol("TIME-CUTOFF-SECS"), makeSymbol("MAX-DEPTH"), makeSymbol("REMOVAL-COST-CUTOFF"), makeSymbol("ENABLE-NEGATION-BY-FAILURE"), makeSymbol("ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL") });

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("CYCL-ID"), makeKeyword("NUMBER"), makeKeyword("FORMULA"), makeKeyword("QUERY-A"), makeKeyword("NEG-QUERY-A"), makeKeyword("QUERY-B"), makeKeyword("NEG-QUERY-B"), makeKeyword("QUERY-C"), makeKeyword("NEG-QUERY-C"), makeKeyword("QUERY-D"), makeKeyword("NEG-QUERY-D"), makeKeyword("QUERY-E"), makeKeyword("NEG-QUERY-E"), makeKeyword("BINDINGS"), makeKeyword("ANSWER"), makeKeyword("ANSWER-JUST"), makeKeyword("CORRECT-ANSWER"), $TIME, makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("STATIC-PROPERTIES"), makeKeyword("DYNAMIC-PROPERTIES"), makeKeyword("MULTIPLE-CHOICE?"), makeKeyword("GENERATE-CONSEQUENT?"), makeKeyword("MAX-NUMBER-OF-RESULTS"), makeKeyword("BACK-CHAINING"), makeKeyword("TIME-CUTOFF-SECS"), makeKeyword("MAX-DEPTH"), makeKeyword("REMOVAL-COST-CUTOFF"), makeKeyword("ENABLE-NEGATION-BY-FAILURE"), makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL") });

    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeSymbol("HALO-QUERY-SPEC-CYCL-ID"), makeSymbol("HALO-QUERY-SPEC-NUMBER"), makeSymbol("HALO-QUERY-SPEC-FORMULA"), makeSymbol("HALO-QUERY-SPEC-QUERY-A"), makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-A"), makeSymbol("HALO-QUERY-SPEC-QUERY-B"), makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-B"), makeSymbol("HALO-QUERY-SPEC-QUERY-C"), makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-C"), makeSymbol("HALO-QUERY-SPEC-QUERY-D"), makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-D"), makeSymbol("HALO-QUERY-SPEC-QUERY-E"), makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-E"), makeSymbol("HALO-QUERY-SPEC-BINDINGS"), makeSymbol("HALO-QUERY-SPEC-ANSWER"), makeSymbol("HALO-QUERY-SPEC-ANSWER-JUST"), makeSymbol("HALO-QUERY-SPEC-CORRECT-ANSWER"), makeSymbol("HALO-QUERY-SPEC-TIME"), makeSymbol("HALO-QUERY-SPEC-MT"), makeSymbol("HALO-QUERY-SPEC-COMMENT"), makeSymbol("HALO-QUERY-SPEC-STATIC-PROPERTIES"), makeSymbol("HALO-QUERY-SPEC-DYNAMIC-PROPERTIES"), makeSymbol("HALO-QUERY-SPEC-MULTIPLE-CHOICE?"), makeSymbol("HALO-QUERY-SPEC-GENERATE-CONSEQUENT?"), makeSymbol("HALO-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), makeSymbol("HALO-QUERY-SPEC-BACK-CHAINING"), makeSymbol("HALO-QUERY-SPEC-TIME-CUTOFF-SECS"), makeSymbol("HALO-QUERY-SPEC-MAX-DEPTH"), makeSymbol("HALO-QUERY-SPEC-REMOVAL-COST-CUTOFF"), makeSymbol("HALO-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), makeSymbol("HALO-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("HALO-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("HALO-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("HALO-QUERY-SPEC-INTERMEDIATE-STEP-VALIDATION-LEVEL") });

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeSymbol("_CSETF-HALO-QUERY-SPEC-CYCL-ID"), makeSymbol("_CSETF-HALO-QUERY-SPEC-NUMBER"), makeSymbol("_CSETF-HALO-QUERY-SPEC-FORMULA"), makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-A"), makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-A"), makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-B"), makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-B"), makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-C"), makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-C"), makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-D"), makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-D"), makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-E"), makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-E"), makeSymbol("_CSETF-HALO-QUERY-SPEC-BINDINGS"), makeSymbol("_CSETF-HALO-QUERY-SPEC-ANSWER"), makeSymbol("_CSETF-HALO-QUERY-SPEC-ANSWER-JUST"), makeSymbol("_CSETF-HALO-QUERY-SPEC-CORRECT-ANSWER"), makeSymbol("_CSETF-HALO-QUERY-SPEC-TIME"), makeSymbol("_CSETF-HALO-QUERY-SPEC-MT"), makeSymbol("_CSETF-HALO-QUERY-SPEC-COMMENT"), makeSymbol("_CSETF-HALO-QUERY-SPEC-STATIC-PROPERTIES"), makeSymbol("_CSETF-HALO-QUERY-SPEC-DYNAMIC-PROPERTIES"), makeSymbol("_CSETF-HALO-QUERY-SPEC-MULTIPLE-CHOICE?"), makeSymbol("_CSETF-HALO-QUERY-SPEC-GENERATE-CONSEQUENT?"), makeSymbol("_CSETF-HALO-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), makeSymbol("_CSETF-HALO-QUERY-SPEC-BACK-CHAINING"), makeSymbol("_CSETF-HALO-QUERY-SPEC-TIME-CUTOFF-SECS"), makeSymbol("_CSETF-HALO-QUERY-SPEC-MAX-DEPTH"), makeSymbol("_CSETF-HALO-QUERY-SPEC-REMOVAL-COST-CUTOFF"), makeSymbol("_CSETF-HALO-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), makeSymbol("_CSETF-HALO-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("_CSETF-HALO-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("_CSETF-HALO-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("_CSETF-HALO-QUERY-SPEC-INTERMEDIATE-STEP-VALIDATION-LEVEL") });

    private static final SubLSymbol HALO_QUERY_SPECIFICATION_PRINT = makeSymbol("HALO-QUERY-SPECIFICATION-PRINT");

    public static final SubLInteger $int$21 = makeInteger(21);

    public static final SubLInteger $int$22 = makeInteger(22);

    public static final SubLInteger $int$23 = makeInteger(23);

    public static final SubLInteger $int$24 = makeInteger(24);

    public static final SubLInteger $int$25 = makeInteger(25);

    public static final SubLInteger $int$26 = makeInteger(26);

    public static final SubLInteger $int$27 = makeInteger(27);

    public static final SubLInteger $int$28 = makeInteger(28);

    public static final SubLInteger $int$29 = makeInteger(29);

    public static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLInteger $int$31 = makeInteger(31);



    public static final SubLInteger $int$33 = makeInteger(33);

    public static final SubLInteger $int$34 = makeInteger(34);

    public static final SubLInteger $int$35 = makeInteger(35);

    private static final SubLSymbol HALO_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HALO-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol HALO_QUERY_SPEC_CYCL_ID = makeSymbol("HALO-QUERY-SPEC-CYCL-ID");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_CYCL_ID = makeSymbol("_CSETF-HALO-QUERY-SPEC-CYCL-ID");

    private static final SubLSymbol HALO_QUERY_SPEC_NUMBER = makeSymbol("HALO-QUERY-SPEC-NUMBER");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_NUMBER = makeSymbol("_CSETF-HALO-QUERY-SPEC-NUMBER");

    private static final SubLSymbol HALO_QUERY_SPEC_FORMULA = makeSymbol("HALO-QUERY-SPEC-FORMULA");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_FORMULA = makeSymbol("_CSETF-HALO-QUERY-SPEC-FORMULA");

    private static final SubLSymbol HALO_QUERY_SPEC_QUERY_A = makeSymbol("HALO-QUERY-SPEC-QUERY-A");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_QUERY_A = makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-A");

    private static final SubLSymbol HALO_QUERY_SPEC_NEG_QUERY_A = makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-A");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_NEG_QUERY_A = makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-A");

    private static final SubLSymbol HALO_QUERY_SPEC_QUERY_B = makeSymbol("HALO-QUERY-SPEC-QUERY-B");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_QUERY_B = makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-B");

    private static final SubLSymbol HALO_QUERY_SPEC_NEG_QUERY_B = makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-B");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_NEG_QUERY_B = makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-B");

    private static final SubLSymbol HALO_QUERY_SPEC_QUERY_C = makeSymbol("HALO-QUERY-SPEC-QUERY-C");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_QUERY_C = makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-C");

    private static final SubLSymbol HALO_QUERY_SPEC_NEG_QUERY_C = makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-C");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_NEG_QUERY_C = makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-C");

    private static final SubLSymbol HALO_QUERY_SPEC_QUERY_D = makeSymbol("HALO-QUERY-SPEC-QUERY-D");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_QUERY_D = makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-D");

    private static final SubLSymbol HALO_QUERY_SPEC_NEG_QUERY_D = makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-D");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_NEG_QUERY_D = makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-D");

    private static final SubLSymbol HALO_QUERY_SPEC_QUERY_E = makeSymbol("HALO-QUERY-SPEC-QUERY-E");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_QUERY_E = makeSymbol("_CSETF-HALO-QUERY-SPEC-QUERY-E");

    private static final SubLSymbol HALO_QUERY_SPEC_NEG_QUERY_E = makeSymbol("HALO-QUERY-SPEC-NEG-QUERY-E");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_NEG_QUERY_E = makeSymbol("_CSETF-HALO-QUERY-SPEC-NEG-QUERY-E");

    private static final SubLSymbol HALO_QUERY_SPEC_BINDINGS = makeSymbol("HALO-QUERY-SPEC-BINDINGS");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_BINDINGS = makeSymbol("_CSETF-HALO-QUERY-SPEC-BINDINGS");

    private static final SubLSymbol HALO_QUERY_SPEC_ANSWER = makeSymbol("HALO-QUERY-SPEC-ANSWER");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_ANSWER = makeSymbol("_CSETF-HALO-QUERY-SPEC-ANSWER");

    private static final SubLSymbol HALO_QUERY_SPEC_ANSWER_JUST = makeSymbol("HALO-QUERY-SPEC-ANSWER-JUST");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_ANSWER_JUST = makeSymbol("_CSETF-HALO-QUERY-SPEC-ANSWER-JUST");

    private static final SubLSymbol HALO_QUERY_SPEC_CORRECT_ANSWER = makeSymbol("HALO-QUERY-SPEC-CORRECT-ANSWER");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_CORRECT_ANSWER = makeSymbol("_CSETF-HALO-QUERY-SPEC-CORRECT-ANSWER");

    private static final SubLSymbol HALO_QUERY_SPEC_TIME = makeSymbol("HALO-QUERY-SPEC-TIME");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_TIME = makeSymbol("_CSETF-HALO-QUERY-SPEC-TIME");

    private static final SubLSymbol HALO_QUERY_SPEC_MT = makeSymbol("HALO-QUERY-SPEC-MT");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_MT = makeSymbol("_CSETF-HALO-QUERY-SPEC-MT");

    private static final SubLSymbol HALO_QUERY_SPEC_COMMENT = makeSymbol("HALO-QUERY-SPEC-COMMENT");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_COMMENT = makeSymbol("_CSETF-HALO-QUERY-SPEC-COMMENT");

    private static final SubLSymbol HALO_QUERY_SPEC_STATIC_PROPERTIES = makeSymbol("HALO-QUERY-SPEC-STATIC-PROPERTIES");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_STATIC_PROPERTIES = makeSymbol("_CSETF-HALO-QUERY-SPEC-STATIC-PROPERTIES");

    private static final SubLSymbol HALO_QUERY_SPEC_DYNAMIC_PROPERTIES = makeSymbol("HALO-QUERY-SPEC-DYNAMIC-PROPERTIES");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_DYNAMIC_PROPERTIES = makeSymbol("_CSETF-HALO-QUERY-SPEC-DYNAMIC-PROPERTIES");

    static private final SubLSymbol $sym76$HALO_QUERY_SPEC_MULTIPLE_CHOICE_ = makeSymbol("HALO-QUERY-SPEC-MULTIPLE-CHOICE?");

    static private final SubLSymbol $sym77$_CSETF_HALO_QUERY_SPEC_MULTIPLE_CHOICE_ = makeSymbol("_CSETF-HALO-QUERY-SPEC-MULTIPLE-CHOICE?");

    static private final SubLSymbol $sym78$HALO_QUERY_SPEC_GENERATE_CONSEQUENT_ = makeSymbol("HALO-QUERY-SPEC-GENERATE-CONSEQUENT?");

    static private final SubLSymbol $sym79$_CSETF_HALO_QUERY_SPEC_GENERATE_CONSEQUENT_ = makeSymbol("_CSETF-HALO-QUERY-SPEC-GENERATE-CONSEQUENT?");

    private static final SubLSymbol HALO_QUERY_SPEC_MAX_NUMBER_OF_RESULTS = makeSymbol("HALO-QUERY-SPEC-MAX-NUMBER-OF-RESULTS");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_MAX_NUMBER_OF_RESULTS = makeSymbol("_CSETF-HALO-QUERY-SPEC-MAX-NUMBER-OF-RESULTS");

    private static final SubLSymbol HALO_QUERY_SPEC_BACK_CHAINING = makeSymbol("HALO-QUERY-SPEC-BACK-CHAINING");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_BACK_CHAINING = makeSymbol("_CSETF-HALO-QUERY-SPEC-BACK-CHAINING");

    private static final SubLSymbol HALO_QUERY_SPEC_TIME_CUTOFF_SECS = makeSymbol("HALO-QUERY-SPEC-TIME-CUTOFF-SECS");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_TIME_CUTOFF_SECS = makeSymbol("_CSETF-HALO-QUERY-SPEC-TIME-CUTOFF-SECS");

    private static final SubLSymbol HALO_QUERY_SPEC_MAX_DEPTH = makeSymbol("HALO-QUERY-SPEC-MAX-DEPTH");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_MAX_DEPTH = makeSymbol("_CSETF-HALO-QUERY-SPEC-MAX-DEPTH");

    private static final SubLSymbol HALO_QUERY_SPEC_REMOVAL_COST_CUTOFF = makeSymbol("HALO-QUERY-SPEC-REMOVAL-COST-CUTOFF");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_REMOVAL_COST_CUTOFF = makeSymbol("_CSETF-HALO-QUERY-SPEC-REMOVAL-COST-CUTOFF");

    private static final SubLSymbol HALO_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE = makeSymbol("HALO-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE = makeSymbol("_CSETF-HALO-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE");

    private static final SubLSymbol HALO_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING = makeSymbol("HALO-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING = makeSymbol("_CSETF-HALO-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING");

    private static final SubLSymbol HALO_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeSymbol("HALO-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeSymbol("_CSETF-HALO-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");

    private static final SubLSymbol HALO_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeSymbol("HALO-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeSymbol("_CSETF-HALO-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING");

    private static final SubLSymbol HALO_QUERY_SPEC_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol("HALO-QUERY-SPEC-INTERMEDIATE-STEP-VALIDATION-LEVEL");

    public static final SubLSymbol _CSETF_HALO_QUERY_SPEC_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol("_CSETF-HALO-QUERY-SPEC-INTERMEDIATE-STEP-VALIDATION-LEVEL");







    private static final SubLSymbol $QUERY_A = makeKeyword("QUERY-A");

    private static final SubLSymbol $NEG_QUERY_A = makeKeyword("NEG-QUERY-A");

    private static final SubLSymbol $QUERY_B = makeKeyword("QUERY-B");

    private static final SubLSymbol $NEG_QUERY_B = makeKeyword("NEG-QUERY-B");

    private static final SubLSymbol $QUERY_C = makeKeyword("QUERY-C");

    private static final SubLSymbol $NEG_QUERY_C = makeKeyword("NEG-QUERY-C");

    private static final SubLSymbol $QUERY_D = makeKeyword("QUERY-D");

    private static final SubLSymbol $NEG_QUERY_D = makeKeyword("NEG-QUERY-D");

    private static final SubLSymbol $QUERY_E = makeKeyword("QUERY-E");

    private static final SubLSymbol $NEG_QUERY_E = makeKeyword("NEG-QUERY-E");





    private static final SubLSymbol $ANSWER_JUST = makeKeyword("ANSWER-JUST");

    private static final SubLSymbol $CORRECT_ANSWER = makeKeyword("CORRECT-ANSWER");









    private static final SubLSymbol $DYNAMIC_PROPERTIES = makeKeyword("DYNAMIC-PROPERTIES");

    public static final SubLSymbol $kw122$MULTIPLE_CHOICE_ = makeKeyword("MULTIPLE-CHOICE?");

    public static final SubLSymbol $kw123$GENERATE_CONSEQUENT_ = makeKeyword("GENERATE-CONSEQUENT?");

    private static final SubLSymbol $MAX_NUMBER_OF_RESULTS = makeKeyword("MAX-NUMBER-OF-RESULTS");



    private static final SubLSymbol $TIME_CUTOFF_SECS = makeKeyword("TIME-CUTOFF-SECS");



    private static final SubLSymbol $REMOVAL_COST_CUTOFF = makeKeyword("REMOVAL-COST-CUTOFF");

    private static final SubLSymbol $ENABLE_NEGATION_BY_FAILURE = makeKeyword("ENABLE-NEGATION-BY-FAILURE");

    private static final SubLSymbol $ENABLE_HL_PREDICATE_BACKCHAINING = makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING");

    private static final SubLSymbol $ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");

    private static final SubLSymbol $ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING");

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");

    static private final SubLString $str_alt134$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt135$___Ahalo_query_specification___ = makeString("~%~Ahalo-query-specification:~%");

    static private final SubLString $str_alt136$_Acycl_id____A__ = makeString("~Acycl-id:  ~A~%");

    static private final SubLString $str_alt137$_Aquestion_number___A__ = makeString("~Aquestion number: ~A~%");

    static private final SubLString $str_alt138$_Aformula___A__ = makeString("~Aformula: ~A~%");

    static private final SubLString $str_alt139$_ACorrect_Answer___A__ = makeString("~ACorrect Answer: ~A~%");

    static private final SubLString $str_alt140$_ABindings___A__ = makeString("~ABindings: ~A~%");

    static private final SubLString $str_alt141$_AAnswer___A__ = makeString("~AAnswer: ~A~%");

    static private final SubLString $str_alt142$_ATime___A__ = makeString("~ATime: ~A~%");

    static private final SubLString $str_alt143$_AJustification___A__ = makeString("~AJustification: ~A~%");

    static private final SubLString $str_alt144$_Amt___S__ = makeString("~Amt: ~S~%");

    static private final SubLString $str_alt145$_Acomment___A__ = makeString("~Acomment: ~A~%");

    static private final SubLString $str_alt146$_Amax_number_of_results___A__ = makeString("~Amax-number-of-results: ~A~%");

    static private final SubLString $str_alt147$_Aback_chaining___A__ = makeString("~Aback-chaining: ~A~%");

    static private final SubLString $str_alt148$_Atime_cutoff_secs___A__ = makeString("~Atime-cutoff-secs: ~A~%");

    static private final SubLString $str_alt149$_Amax_depth___A__ = makeString("~Amax-depth: ~A~%");

    static private final SubLString $str_alt150$_Aremoval_cost_cutoff___A__ = makeString("~Aremoval-cost-cutoff: ~A~%");

    static private final SubLString $str_alt151$_Aenable_negation_by_failure___A_ = makeString("~Aenable-negation-by-failure: ~A~%");

    static private final SubLString $str_alt152$_Aenable_hl_predicate_backchainin = makeString("~Aenable-hl-predicate-backchaining: ~A~%");

    static private final SubLString $str_alt153$_Aenable_cache_backwards_query_re = makeString("~Aenable-cache-backwards-query-results: ~A~%");

    static private final SubLString $str_alt154$_Aenable_unbound_predicate_backch = makeString("~Aenable-unbound-predicate-backchaining: ~A~%");

    static private final SubLString $str_alt155$_Aintermediate_step_validation_le = makeString("~Aintermediate-step-validation-level: ~A~%");

    public static final SubLInteger $int$120 = makeInteger(120);

    public static final SubLInteger $int$10000 = makeInteger(10000);







    public static final SubLObject $$TestQuery_MultipleChoice = constant_handles.reader_make_constant_shell(makeString("TestQuery-MultipleChoice"));

    public static final SubLObject $$TestQuery_ResultAsConsequent = constant_handles.reader_make_constant_shell(makeString("TestQuery-ResultAsConsequent"));

    public static final SubLObject $$testQueryToNumber = constant_handles.reader_make_constant_shell(makeString("testQueryToNumber"));

    static private final SubLSymbol $sym164$_COMMENT = makeSymbol("?COMMENT");

    public static final SubLObject $$comment = constant_handles.reader_make_constant_shell(makeString("comment"));

    static private final SubLList $list_alt166 = list(makeSymbol("?COMMENT"));

    static private final SubLList $list_alt167 = cons(makeSymbol("?PARAM"), makeSymbol("?VAL"));

    public static final SubLObject $const168$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

    static private final SubLSymbol $sym169$_PARAM = makeSymbol("?PARAM");

    static private final SubLSymbol $sym170$_VAL = makeSymbol("?VAL");

    static private final SubLList $list_alt171 = cons(makeSymbol("PARAM"), makeSymbol("VAL"));

    static private final SubLSymbol $sym172$_BINDINGS = makeSymbol("?BINDINGS");

    public static final SubLObject $$testAnswersCycL_Exact = constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-Exact"));

    static private final SubLList $list_alt174 = list(makeSymbol("?BINDINGS"));

    public static final SubLObject $$goodChoiceAmongSentences = constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences"));

    public static final SubLObject $$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));

    private static final SubLSymbol HALO_LIST_FINDER_COMPARATOR = makeSymbol("HALO-LIST-FINDER-COMPARATOR");

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));

    public static final SubLObject $$InferenceSentenceParameter = constant_handles.reader_make_constant_shell(makeString("InferenceSentenceParameter"));

    public static final SubLObject $$InferenceMicrotheoryParameter = constant_handles.reader_make_constant_shell(makeString("InferenceMicrotheoryParameter"));

    public static final SubLObject $$InferenceMaxAnswersParameter = constant_handles.reader_make_constant_shell(makeString("InferenceMaxAnswersParameter"));

    public static final SubLObject $const182$InferenceMaxTransformationStepsPa = constant_handles.reader_make_constant_shell(makeString("InferenceMaxTransformationStepsParameter"));

    public static final SubLObject $$InferenceMaxTimeParameter = constant_handles.reader_make_constant_shell(makeString("InferenceMaxTimeParameter"));

    public static final SubLObject $$InferenceMaxProofDepthParameter = constant_handles.reader_make_constant_shell(makeString("InferenceMaxProofDepthParameter"));

    public static final SubLObject $const185$InferenceAllowUnboundPredicateTra = constant_handles.reader_make_constant_shell(makeString("InferenceAllowUnboundPredicateTransformationParameter"));

    public static final SubLObject $const186$InferenceProductivityLimitParamet = constant_handles.reader_make_constant_shell(makeString("InferenceProductivityLimitParameter"));

    public static final SubLObject $const187$InferenceIntermediateStepValidati = constant_handles.reader_make_constant_shell(makeString("InferenceIntermediateStepValidationParameter"));

    public static final SubLObject $const188$InferenceCacheInferenceResultsPar = constant_handles.reader_make_constant_shell(makeString("InferenceCacheInferenceResultsParameter"));

    public static final SubLObject $const189$InferenceAllowHLPredicateTransfor = constant_handles.reader_make_constant_shell(makeString("InferenceAllowHLPredicateTransformationParameter"));

    public static final SubLObject $const190$InferenceNegationByFailureParamet = constant_handles.reader_make_constant_shell(makeString("InferenceNegationByFailureParameter"));

    private static final SubLSymbol HALO_JUSTIFICATION = makeSymbol("HALO-JUSTIFICATION");

    private static final SubLSymbol HALO_JUSTIFICATION_P = makeSymbol("HALO-JUSTIFICATION-P");

    static private final SubLList $list_alt193 = list(makeSymbol("ANSWER"), makeSymbol("SUPPORTING?"), makeSymbol("MULTIPLE-CHOICE?"), makeSymbol("TEXT"));

    static private final SubLList $list_alt194 = list(makeKeyword("ANSWER"), makeKeyword("SUPPORTING?"), makeKeyword("MULTIPLE-CHOICE?"), $TEXT);

    static private final SubLList $list_alt195 = list(makeSymbol("HALO-JUST-ANSWER"), makeSymbol("HALO-JUST-SUPPORTING?"), makeSymbol("HALO-JUST-MULTIPLE-CHOICE?"), makeSymbol("HALO-JUST-TEXT"));

    static private final SubLList $list_alt196 = list(makeSymbol("_CSETF-HALO-JUST-ANSWER"), makeSymbol("_CSETF-HALO-JUST-SUPPORTING?"), makeSymbol("_CSETF-HALO-JUST-MULTIPLE-CHOICE?"), makeSymbol("_CSETF-HALO-JUST-TEXT"));

    private static final SubLSymbol HALO_JUSTIFICATION_PRINT = makeSymbol("HALO-JUSTIFICATION-PRINT");

    private static final SubLSymbol HALO_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HALO-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol HALO_JUST_ANSWER = makeSymbol("HALO-JUST-ANSWER");

    public static final SubLSymbol _CSETF_HALO_JUST_ANSWER = makeSymbol("_CSETF-HALO-JUST-ANSWER");

    static private final SubLSymbol $sym201$HALO_JUST_SUPPORTING_ = makeSymbol("HALO-JUST-SUPPORTING?");

    static private final SubLSymbol $sym202$_CSETF_HALO_JUST_SUPPORTING_ = makeSymbol("_CSETF-HALO-JUST-SUPPORTING?");

    static private final SubLSymbol $sym203$HALO_JUST_MULTIPLE_CHOICE_ = makeSymbol("HALO-JUST-MULTIPLE-CHOICE?");

    static private final SubLSymbol $sym204$_CSETF_HALO_JUST_MULTIPLE_CHOICE_ = makeSymbol("_CSETF-HALO-JUST-MULTIPLE-CHOICE?");

    private static final SubLSymbol HALO_JUST_TEXT = makeSymbol("HALO-JUST-TEXT");

    public static final SubLSymbol _CSETF_HALO_JUST_TEXT = makeSymbol("_CSETF-HALO-JUST-TEXT");

    public static final SubLSymbol $kw207$SUPPORTING_ = makeKeyword("SUPPORTING?");



    static private final SubLString $str_alt209$__Answer________A__ = makeString("~%Answer:      ~A~%");

    static private final SubLString $str_alt210$__Supporting____A__ = makeString("~%Supporting?: ~A~%");

    static private final SubLString $str_alt211$__Multiple______A__ = makeString("~%Multiple?:   ~A~%");

    static private final SubLString $str_alt212$__Text__________A__ = makeString("~%Text:        ~A~%");

    static private final SubLSymbol $sym213$_QUERY_NART = makeSymbol("?QUERY-NART");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLSymbol $sym216$_QUERY = makeSymbol("?QUERY");

    static private final SubLList $list_alt217 = list(list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?QUERY"), makeSymbol("?QUERY-NART")));

    static private final SubLSymbol $sym218$_ = makeSymbol("<");

    private static final SubLSymbol $TOTAL_QUESTIONS = makeKeyword("TOTAL-QUESTIONS");



    static private final SubLString $str_alt221$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$Cyc_Halo_Batch_Results = makeString("Cyc Halo Batch Results");



    static private final SubLString $str_alt224$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt225$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt226$Run_with_KB__A_on_system__A = makeString("Run with KB ~A on system ~A");

    private static final SubLSymbol $CURRENT_QUESTION = makeKeyword("CURRENT-QUESTION");

    static private final SubLString $$$Start_metrics = makeString("Start metrics");

    static private final SubLString $$$End_metrics = makeString("End metrics");

    static private final SubLString $str_alt230$__Problem_store_count___A__ = makeString("~&Problem store count: ~A~%");

    static private final SubLString $str_alt231$_br_ = makeString("<br>");

    static private final SubLString $str_alt232$_html__head__title_Cyc_Halo_Batch = makeString("<html><head><title>Cyc Halo Batch Results</title></head><body>~%");

    static private final SubLString $str_alt233$_h3_Run_with_KB__A_on_system__A__ = makeString("<h3>Run with KB ~A on system ~A</h3><br>~%");

    static private final SubLString $str_alt234$____body___html_ = makeString("~%</body></html>");

    static private final SubLString $str_alt235$__body___html_ = makeString("</body></html>");

    static private final SubLList $list_alt236 = list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?QUERY"), makeSymbol("?QUERY-NART"));

    static private final SubLString $str_alt237$_br_Query_took___A_seconds_br___ = makeString("<br>Query took: ~A seconds<br>~%");

    static private final SubLString $$$Not_a_valid_question_number = makeString("Not a valid question number");

    static private final SubLString $str_alt239$_br__center__h3_Tabulated_Results = makeString("<br><center><h3>Tabulated Results</h3><table border=\"1\">~%");

    static private final SubLString $str_alt240$_tr__td_width__10___Question____t = makeString("<tr><td width=\"10%\">Question #</td><td width=\"15%\">Encoded?</td><td width=\"15%\">Answer</td><td width=\"10%\">Time</td><td width=\"30%\">Correct?</td></tr>~%");

    static private final SubLString $str_alt241$_tr__td__A__td__td__A__td__td__A_ = makeString("<tr><td>~A</td><td>~A</td><td>~A</td><td>~A</td><td>~A</td></tr>~%");

    static private final SubLString $$$Yes = makeString("Yes");

    static private final SubLString $$$No = makeString("No");

    static private final SubLString $str_alt244$_nbsp_ = makeString("&nbsp;");

    static private final SubLString $str_alt245$__table___center___ = makeString("</table></center>~%");

    private static final SubLSymbol HALO_STATISTICS = makeSymbol("HALO-STATISTICS");

    private static final SubLSymbol HALO_STATISTICS_P = makeSymbol("HALO-STATISTICS-P");

    static private final SubLList $list_alt248 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("CORRECT"), makeSymbol("WRONG"), makeSymbol("PARTIAL"), makeSymbol("UNKNOWN"), makeSymbol("ENCODED"), makeSymbol("UNENCODED"), makeSymbol("TIME"), makeSymbol("TOTAL") });

    static private final SubLList $list_alt249 = list(new SubLObject[]{ $NAME, makeKeyword("CORRECT"), makeKeyword("WRONG"), makeKeyword("PARTIAL"), makeKeyword("UNKNOWN"), makeKeyword("ENCODED"), makeKeyword("UNENCODED"), $TIME, makeKeyword("TOTAL") });

    static private final SubLList $list_alt250 = list(new SubLObject[]{ makeSymbol("HALO-STAT-NAME"), makeSymbol("HALO-STAT-CORRECT"), makeSymbol("HALO-STAT-WRONG"), makeSymbol("HALO-STAT-PARTIAL"), makeSymbol("HALO-STAT-UNKNOWN"), makeSymbol("HALO-STAT-ENCODED"), makeSymbol("HALO-STAT-UNENCODED"), makeSymbol("HALO-STAT-TIME"), makeSymbol("HALO-STAT-TOTAL") });

    static private final SubLList $list_alt251 = list(new SubLObject[]{ makeSymbol("_CSETF-HALO-STAT-NAME"), makeSymbol("_CSETF-HALO-STAT-CORRECT"), makeSymbol("_CSETF-HALO-STAT-WRONG"), makeSymbol("_CSETF-HALO-STAT-PARTIAL"), makeSymbol("_CSETF-HALO-STAT-UNKNOWN"), makeSymbol("_CSETF-HALO-STAT-ENCODED"), makeSymbol("_CSETF-HALO-STAT-UNENCODED"), makeSymbol("_CSETF-HALO-STAT-TIME"), makeSymbol("_CSETF-HALO-STAT-TOTAL") });

    private static final SubLSymbol HALO_STATISTICS_PRINT = makeSymbol("HALO-STATISTICS-PRINT");

    private static final SubLSymbol HALO_STATISTICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HALO-STATISTICS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol HALO_STAT_NAME = makeSymbol("HALO-STAT-NAME");

    public static final SubLSymbol _CSETF_HALO_STAT_NAME = makeSymbol("_CSETF-HALO-STAT-NAME");

    private static final SubLSymbol HALO_STAT_CORRECT = makeSymbol("HALO-STAT-CORRECT");

    public static final SubLSymbol _CSETF_HALO_STAT_CORRECT = makeSymbol("_CSETF-HALO-STAT-CORRECT");

    private static final SubLSymbol HALO_STAT_WRONG = makeSymbol("HALO-STAT-WRONG");

    public static final SubLSymbol _CSETF_HALO_STAT_WRONG = makeSymbol("_CSETF-HALO-STAT-WRONG");

    private static final SubLSymbol HALO_STAT_PARTIAL = makeSymbol("HALO-STAT-PARTIAL");

    public static final SubLSymbol _CSETF_HALO_STAT_PARTIAL = makeSymbol("_CSETF-HALO-STAT-PARTIAL");

    private static final SubLSymbol HALO_STAT_UNKNOWN = makeSymbol("HALO-STAT-UNKNOWN");

    public static final SubLSymbol _CSETF_HALO_STAT_UNKNOWN = makeSymbol("_CSETF-HALO-STAT-UNKNOWN");

    private static final SubLSymbol HALO_STAT_ENCODED = makeSymbol("HALO-STAT-ENCODED");

    public static final SubLSymbol _CSETF_HALO_STAT_ENCODED = makeSymbol("_CSETF-HALO-STAT-ENCODED");

    private static final SubLSymbol HALO_STAT_UNENCODED = makeSymbol("HALO-STAT-UNENCODED");

    public static final SubLSymbol _CSETF_HALO_STAT_UNENCODED = makeSymbol("_CSETF-HALO-STAT-UNENCODED");

    private static final SubLSymbol HALO_STAT_TIME = makeSymbol("HALO-STAT-TIME");

    public static final SubLSymbol _CSETF_HALO_STAT_TIME = makeSymbol("_CSETF-HALO-STAT-TIME");

    private static final SubLSymbol HALO_STAT_TOTAL = makeSymbol("HALO-STAT-TOTAL");

    public static final SubLSymbol _CSETF_HALO_STAT_TOTAL = makeSymbol("_CSETF-HALO-STAT-TOTAL");



    private static final SubLSymbol $CORRECT = makeKeyword("CORRECT");

    private static final SubLSymbol $WRONG = makeKeyword("WRONG");





    private static final SubLSymbol $ENCODED = makeKeyword("ENCODED");

    private static final SubLSymbol $UNENCODED = makeKeyword("UNENCODED");



    static private final SubLString $str_alt280$__Name________A__ = makeString("~%Name:      ~A~%");

    static private final SubLString $str_alt281$__Correct_____A__ = makeString("~%Correct:   ~A~%");

    static private final SubLString $str_alt282$__Wrong_______A__ = makeString("~%Wrong:     ~A~%");

    static private final SubLString $str_alt283$__Partial_____A__ = makeString("~%Partial:   ~A~%");

    static private final SubLString $str_alt284$__Unknown_____A__ = makeString("~%Unknown:   ~A~%");

    static private final SubLString $str_alt285$__Encoded_____A__ = makeString("~%Encoded:   ~A~%");

    static private final SubLString $str_alt286$__Unencoded___A__ = makeString("~%Unencoded: ~A~%");

    static private final SubLString $str_alt287$__Time________A__ = makeString("~%Time:      ~A~%");

    static private final SubLString $str_alt288$__Total_______A__ = makeString("~%Total:     ~A~%");

    static private final SubLString $str_alt289$_br__center__h3_Summary__h3__tabl = makeString("<br><center><h3>Summary</h3><table border=\"1\">~%");

    static private final SubLString $str_alt290$_tr__td_Type__td__td_width__10___ = makeString("<tr><td>Type</td><td width=\"10%\">Correct</td>");

    static private final SubLString $str_alt291$_td_width__10___Partial__td_ = makeString("<td width=\"10%\">Partial</td>");

    static private final SubLString $str_alt292$_td_width__10___Wrong__td_ = makeString("<td width=\"10%\">Wrong</td>");

    static private final SubLString $str_alt293$_td_width__10___Unknown__td_ = makeString("<td width=\"10%\">Unknown</td>");

    static private final SubLString $str_alt294$_td_width__10___Encoded_Questions = makeString("<td width=\"10%\">Encoded Questions</td>");

    static private final SubLString $str_alt295$_td_width__10___Total_Questions__ = makeString("<td width=\"10%\">Total Questions</td>");

    static private final SubLString $str_alt296$_td_width__10___Time__td___tr___ = makeString("<td width=\"10%\">Time</td></tr>~%");

    static private final SubLString $str_alt297$_tr__td__A__td__td__A__td__td__A_ = makeString("<tr><td>~A</td><td>~A</td><td>~A</td>");

    static private final SubLString $str_alt298$_td__A__td__td__A__td__td__A__td_ = makeString("<td>~A</td><td>~A</td><td>~A</td>");

    static private final SubLString $str_alt299$_td__A__td__td__A__td___tr___ = makeString("<td>~A</td><td>~A</td></tr>~%");

    static private final SubLString $str_alt300$_h3_Correct__h3__A_br___ = makeString("<h3>Correct</h3>~A<br>~%");

    static private final SubLString $str_alt301$_h3_Partial__h3__A_br___ = makeString("<h3>Partial</h3>~A<br>~%");

    static private final SubLString $str_alt302$_h3_Wrong__h3__A_br___ = makeString("<h3>Wrong</h3>~A<br>~%");

    static private final SubLString $str_alt303$_h3_Unencoded__h3__A_br___ = makeString("<h3>Unencoded</h3>~A<br>~%");

    static private final SubLString $$$Multiple_Choice = makeString("Multiple Choice");

    static private final SubLString $$$Detailed_Answer = makeString("Detailed Answer");

    static private final SubLString $$$Combined = makeString("Combined");

    static private final SubLString $$$Correct = makeString("Correct");

    static private final SubLString $$$Partial = makeString("Partial");

    static private final SubLString $$$Wrong = makeString("Wrong");

    static private final SubLString $$$Unknown = makeString("Unknown");

    static private final SubLString $str_alt311$_nbsp = makeString("&nbsp");

    static private final SubLString $str_alt312$Both_answer_and_correct_answer_un = makeString("Both answer and correct answer unknown");

    static private final SubLString $$$Correct_answer_unknown = makeString("Correct answer unknown");

    static private final SubLString $str_alt314$_A = makeString("~A");

    static private final SubLString $$$Answer = makeString("Answer");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $str_alt317$_ = makeString(":");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt319$is_one_of_ = makeString("is one of ");

    static private final SubLString $str_alt320$_A__ = makeString("~A, ");

    static private final SubLString $str_alt321$Formulation_of_Question_ = makeString("Formulation of Question:");

    static private final SubLString $str_alt322$Justification_ = makeString("Justification:");

    static private final SubLString $str_alt323$Answer__A_is_the_right_answer_bec = makeString("Answer ~A is the right answer because:");

    static private final SubLString $str_alt324$Answer__A_can_be_excluded_because = makeString("Answer ~A can be excluded because:");

    public static final SubLSymbol $kw325$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    public static final SubLSymbol $kw326$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw327$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    public static final SubLSymbol $kw328$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");



    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");







    public static final SubLSymbol $kw336$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");





    public static final SubLSymbol $kw339$FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");

    static private final SubLString $str_alt340$__Trying__S__ = makeString("~&Trying ~S~%");

    static private final SubLString $str_alt341$__Results___S__ = makeString("~&Results: ~S~%");



    public static final SubLObject $$implies = constant_handles.reader_make_constant_shell(makeString("implies"));

    static private final SubLList $list_alt344 = list(list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Thing")), constant_handles.reader_make_constant_shell(makeString("Thing"))));

    static private final SubLString $str_alt345$__Asking_priming_query__A__ = makeString("~&Asking priming query ~A~%");

    static private final SubLString $str_alt346$__Halt_reason___A__Inference_stat = makeString("~&Halt reason: ~A~%Inference status: ~A~%");

    public static final SubLObject $$completeAtomicComposition_List = constant_handles.reader_make_constant_shell(makeString("completeAtomicComposition-List"));

    public static final SubLObject $$insolubleIn_TypeType = constant_handles.reader_make_constant_shell(makeString("insolubleIn-TypeType"));

    public static final SubLObject $$chemicalProducts_TypeType = constant_handles.reader_make_constant_shell(makeString("chemicalProducts-TypeType"));

    public static final SubLObject $$reactionTypeInMixture = constant_handles.reader_make_constant_shell(makeString("reactionTypeInMixture"));

    static private final SubLString $str_alt351$__repropagating__A_assertions____ = makeString("~&repropagating ~A assertions...~%");

    public static final SubLObject $$CycAdministrator = constant_handles.reader_make_constant_shell(makeString("CycAdministrator"));

    static private final SubLString $$$A = makeString("A");

    static private final SubLString $$$B = makeString("B");

    static private final SubLString $$$C = makeString("C");

    static private final SubLString $$$D = makeString("D");

    static private final SubLString $$$E = makeString("E");

    static private final SubLList $list_alt358 = list(makeSymbol("INFERENCE"), makeSymbol("LETTER"), makeSymbol("TIME-TO-DIE"));

    static private final SubLString $str_alt359$Scheduling__A_with__A_time_to_liv = makeString("Scheduling ~A with ~A time to live~%");

    static private final SubLString $str_alt360$enqueing__A_with__A_time_to_live_ = makeString("enqueing ~A with ~A time to live~%");

    static private final SubLList $list_alt361 = list(makeString("A"), makeString("B"), makeString("C"), makeString("D"), makeString("E"));



    static private final SubLString $str_alt363$__Trying__S_S__ = makeString("~&Trying ~S~S~%");





    static private final SubLList $list_alt366 = list(makeSymbol("BINDING"), makeSymbol("JUSTIFICATION"));

    static private final SubLString $str_alt367$__Allocating_inference_for__S_S__ = makeString("~&Allocating inference for ~S~S~%");

    static private final SubLString $str_alt368$Inference_aborted_asking__A__ = makeString("Inference aborted asking ~A~%");

    static private final SubLString $str_alt369$Timed_out_asking__A__ = makeString("Timed out asking ~A~%");

    static private final SubLString $str_alt370$Got_an_answer_for__A__ = makeString("Got an answer for ~A~%");

    static private final SubLString $str_alt371$struck_out_on__A__ = makeString("struck out on ~A~%");

    static private final SubLString $str_alt372$halt_reason___A__ = makeString("halt-reason: ~A~%");

    static private final SubLString $str_alt373$Non_continuable_inference_for__A_ = makeString("Non continuable inference for ~A!~%");





    static private final SubLList $list_alt376 = list(constant_handles.reader_make_constant_shell(makeString("termOfUnit")), constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-Exact")), constant_handles.reader_make_constant_shell(makeString("oldConstantName")), constant_handles.reader_make_constant_shell(makeString("queryPracticeRules")), constant_handles.reader_make_constant_shell(makeString("querySpecificationForFormulaTemplate")), constant_handles.reader_make_constant_shell(makeString("cyclistNotes")));

    static private final SubLList $list_alt377 = list(makeSymbol("?QUERY"), makeSymbol("?QUERY-NART"));

    private static final SubLSymbol HALO_QUERY_NUMBER_LAMBDA = makeSymbol("HALO-QUERY-NUMBER-LAMBDA");

    static private final SubLString $str_alt379$___KE_file_for_loading_all_querie = makeString(";; KE file for loading all queries~%;;~%");

    static private final SubLString $str_alt380$_________Test_specification_const = makeString("~%;;~%;; Test specification constant definition~%;;~%");

    static private final SubLString $str_alt381$_________Detailed_query_definitio = makeString("~%;;~%;; Detailed query definitions~%;;~%");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLSymbol $sym384$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");

    private static final SubLSymbol HALO_VALID_DEFINITIONAL_ASSERTION_P = makeSymbol("HALO-VALID-DEFINITIONAL-ASSERTION-P");

    private static final SubLSymbol ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");

    private static final SubLSymbol HALO_ASSERTION_COMPARATOR = makeSymbol("HALO-ASSERTION-COMPARATOR");

    static private final SubLString $str_alt388$Constant___A_____ = makeString("Constant: ~A.~%~%");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    static private final SubLSymbol $sym390$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol HALO_GLOSS_LAMBDA = makeSymbol("HALO-GLOSS-LAMBDA");

    static private final SubLString $str_alt392$___________Glossary_of_terms_____ = makeString("~%~%;;~%;; Glossary of terms~%;;~%~%");

    static private final SubLString $str_alt393$__ = makeString(": ");

    static private final SubLString $str_alt394$__ = makeString("~%");

    static private final SubLString $str_alt395$_________Begin_definition_of_quer = makeString("~%;;~%;; Begin definition of query ~A~%;;~%");

    static private final SubLString $str_alt396$_________End_definition_of_query_ = makeString("~%;;~%;; End definition of query ~A~%;;~%");

    static private final SubLString $str_alt397$in_Mt___A___ = makeString("in Mt: ~A.~%");

    static private final SubLString $str_alt398$tv___A___ = makeString("tv: ~A.~%");

    static private final SubLString $str_alt399$d___A___ = makeString("d: ~A.~%");

    static private final SubLString $str_alt400$f___A_____ = makeString("f: ~A.~%~%");



    public static final SubLInteger $int$76 = makeInteger(76);

    private static final SubLSymbol HALO_NEWLINE_CHAR_P = makeSymbol("HALO-NEWLINE-CHAR-P");

    static private final SubLString $str_alt404$____A__ = makeString(";; ~A~%");

    static private final SubLList $list_alt405 = list(CHAR_return, CHAR_newline, CHAR_newline);

    static private final SubLString $str_alt406$_ = makeString("\"");

    static private final SubLString $str_alt407$__Query__S_was_untrainable_ = makeString("~%Query ~S was untrainable!");

    static private final SubLString $str_alt408$__Query__S_did_not_require_traini = makeString("~%Query ~S did not require training!");

    static private final SubLString $str_alt409$__Query__S_was_trained_after__S_r = makeString("~%Query ~S was trained after ~S reinforcement passes.");

    static private final SubLList $list_alt410 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?QUERY"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?RULE"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?QUERY"), constant_handles.reader_make_constant_shell(makeString("HaloPilotChallengeTestSpecification"))), list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?QUERY"), makeSymbol("?SPEC")), list(constant_handles.reader_make_constant_shell(makeString("queryPracticeRules")), makeSymbol("?SPEC"), makeSymbol("?RULE")))));

    static private final SubLList $list_alt411 = list(makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?SPEC")), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    public static final SubLObject $$queryPracticeRules = constant_handles.reader_make_constant_shell(makeString("queryPracticeRules"));



    // // Initializers
    public void declareFunctions() {
        declare_halo_qa_interface_file();
    }

    public void initializeVariables() {
        init_halo_qa_interface_file();
    }

    public void runTopLevelForms() {
        setup_halo_qa_interface_file();
    }
}

