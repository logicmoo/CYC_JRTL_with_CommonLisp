/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_length;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TVA-INFERENCE
 * source file: /cyc/top/cycl/tva-inference.lisp
 * created:     2019/07/03 17:37:35
 */
public final class tva_inference extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new tva_inference();



    // deflexical
    // Definitions
    /**
     * Whether the inner loop of TVA-UNIFY checks its current controlling inference
     * to see if its :MAX-TIME parameter has been exceeded.
     */
    @LispMethod(comment = "Whether the inner loop of TVA-UNIFY checks its current controlling inference\r\nto see if its :MAX-TIME parameter has been exceeded.\ndeflexical\nWhether the inner loop of TVA-UNIFY checks its current controlling inference\nto see if its :MAX-TIME parameter has been exceeded.")
    private static final SubLSymbol $tva_max_time_enabledP$ = makeSymbol("*TVA-MAX-TIME-ENABLED?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_tva_inference$ = makeSymbol("*DTP-TVA-INFERENCE*");

    // defparameter
    // The current TVA inference.
    /**
     * The current TVA inference.
     */
    @LispMethod(comment = "The current TVA inference.\ndefparameter")
    public static final SubLSymbol $tva_inference$ = makeSymbol("*TVA-INFERENCE*");

    // defparameter
    /**
     * Reuse search spaces when the same transitive predicate and goal-node are used
     * multiple times. Saves time and space.
     */
    @LispMethod(comment = "Reuse search spaces when the same transitive predicate and goal-node are used\r\nmultiple times. Saves time and space.\ndefparameter\nReuse search spaces when the same transitive predicate and goal-node are used\nmultiple times. Saves time and space.")
    private static final SubLSymbol $tva_reuse_spacesP$ = makeSymbol("*TVA-REUSE-SPACES?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol TVA_INFERENCE = makeSymbol("TVA-INFERENCE");

    private static final SubLSymbol TVA_INFERENCE_P = makeSymbol("TVA-INFERENCE-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("PROBLEM"), makeSymbol("ASENT-PRED"), makeSymbol("ASENT-ARGS"), makeSymbol("ARGS-ADMITTED"), makeSymbol("TERM-ARGNUMS"), makeSymbol("VAR-ARGNUMS"), makeSymbol("PRECOMPUTATIONS"), makeSymbol("REUSED-SPACES"), makeSymbol("ONE-ANSWER?"), makeSymbol("JUSTIFY?"), makeSymbol("RESTRICTED-ASSERTION"), makeSymbol("ANSWERS") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("PROBLEM"), makeKeyword("ASENT-PRED"), makeKeyword("ASENT-ARGS"), makeKeyword("ARGS-ADMITTED"), makeKeyword("TERM-ARGNUMS"), makeKeyword("VAR-ARGNUMS"), makeKeyword("PRECOMPUTATIONS"), makeKeyword("REUSED-SPACES"), makeKeyword("ONE-ANSWER?"), makeKeyword("JUSTIFY?"), makeKeyword("RESTRICTED-ASSERTION"), makeKeyword("ANSWERS") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("TVA-INF-PROBLEM"), makeSymbol("TVA-INF-ASENT-PRED"), makeSymbol("TVA-INF-ASENT-ARGS"), makeSymbol("TVA-INF-ARGS-ADMITTED"), makeSymbol("TVA-INF-TERM-ARGNUMS"), makeSymbol("TVA-INF-VAR-ARGNUMS"), makeSymbol("TVA-INF-PRECOMPUTATIONS"), makeSymbol("TVA-INF-REUSED-SPACES"), makeSymbol("TVA-INF-ONE-ANSWER?"), makeSymbol("TVA-INF-JUSTIFY?"), makeSymbol("TVA-INF-RESTRICTED-ASSERTION"), makeSymbol("TVA-INF-ANSWERS") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-TVA-INF-PROBLEM"), makeSymbol("_CSETF-TVA-INF-ASENT-PRED"), makeSymbol("_CSETF-TVA-INF-ASENT-ARGS"), makeSymbol("_CSETF-TVA-INF-ARGS-ADMITTED"), makeSymbol("_CSETF-TVA-INF-TERM-ARGNUMS"), makeSymbol("_CSETF-TVA-INF-VAR-ARGNUMS"), makeSymbol("_CSETF-TVA-INF-PRECOMPUTATIONS"), makeSymbol("_CSETF-TVA-INF-REUSED-SPACES"), makeSymbol("_CSETF-TVA-INF-ONE-ANSWER?"), makeSymbol("_CSETF-TVA-INF-JUSTIFY?"), makeSymbol("_CSETF-TVA-INF-RESTRICTED-ASSERTION"), makeSymbol("_CSETF-TVA-INF-ANSWERS") });

    private static final SubLSymbol PRINT_TVA_INFERENCE = makeSymbol("PRINT-TVA-INFERENCE");

    private static final SubLSymbol TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TVA-INFERENCE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TVA-INFERENCE-P"));

    private static final SubLSymbol TVA_INF_PROBLEM = makeSymbol("TVA-INF-PROBLEM");

    private static final SubLSymbol _CSETF_TVA_INF_PROBLEM = makeSymbol("_CSETF-TVA-INF-PROBLEM");

    private static final SubLSymbol TVA_INF_ASENT_PRED = makeSymbol("TVA-INF-ASENT-PRED");

    private static final SubLSymbol _CSETF_TVA_INF_ASENT_PRED = makeSymbol("_CSETF-TVA-INF-ASENT-PRED");

    private static final SubLSymbol TVA_INF_ASENT_ARGS = makeSymbol("TVA-INF-ASENT-ARGS");

    private static final SubLSymbol _CSETF_TVA_INF_ASENT_ARGS = makeSymbol("_CSETF-TVA-INF-ASENT-ARGS");

    private static final SubLSymbol TVA_INF_ARGS_ADMITTED = makeSymbol("TVA-INF-ARGS-ADMITTED");

    private static final SubLSymbol _CSETF_TVA_INF_ARGS_ADMITTED = makeSymbol("_CSETF-TVA-INF-ARGS-ADMITTED");

    private static final SubLSymbol TVA_INF_TERM_ARGNUMS = makeSymbol("TVA-INF-TERM-ARGNUMS");

    private static final SubLSymbol _CSETF_TVA_INF_TERM_ARGNUMS = makeSymbol("_CSETF-TVA-INF-TERM-ARGNUMS");

    private static final SubLSymbol TVA_INF_VAR_ARGNUMS = makeSymbol("TVA-INF-VAR-ARGNUMS");

    private static final SubLSymbol _CSETF_TVA_INF_VAR_ARGNUMS = makeSymbol("_CSETF-TVA-INF-VAR-ARGNUMS");

    private static final SubLSymbol TVA_INF_PRECOMPUTATIONS = makeSymbol("TVA-INF-PRECOMPUTATIONS");

    private static final SubLSymbol _CSETF_TVA_INF_PRECOMPUTATIONS = makeSymbol("_CSETF-TVA-INF-PRECOMPUTATIONS");

    private static final SubLSymbol TVA_INF_REUSED_SPACES = makeSymbol("TVA-INF-REUSED-SPACES");

    private static final SubLSymbol _CSETF_TVA_INF_REUSED_SPACES = makeSymbol("_CSETF-TVA-INF-REUSED-SPACES");

    private static final SubLSymbol $sym25$TVA_INF_ONE_ANSWER_ = makeSymbol("TVA-INF-ONE-ANSWER?");

    private static final SubLSymbol $sym26$_CSETF_TVA_INF_ONE_ANSWER_ = makeSymbol("_CSETF-TVA-INF-ONE-ANSWER?");

    private static final SubLSymbol $sym27$TVA_INF_JUSTIFY_ = makeSymbol("TVA-INF-JUSTIFY?");

    private static final SubLSymbol $sym28$_CSETF_TVA_INF_JUSTIFY_ = makeSymbol("_CSETF-TVA-INF-JUSTIFY?");

    private static final SubLSymbol TVA_INF_RESTRICTED_ASSERTION = makeSymbol("TVA-INF-RESTRICTED-ASSERTION");

    private static final SubLSymbol _CSETF_TVA_INF_RESTRICTED_ASSERTION = makeSymbol("_CSETF-TVA-INF-RESTRICTED-ASSERTION");

    private static final SubLSymbol TVA_INF_ANSWERS = makeSymbol("TVA-INF-ANSWERS");

    private static final SubLSymbol _CSETF_TVA_INF_ANSWERS = makeSymbol("_CSETF-TVA-INF-ANSWERS");

    private static final SubLSymbol $kw41$ONE_ANSWER_ = makeKeyword("ONE-ANSWER?");

    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TVA_INFERENCE = makeSymbol("MAKE-TVA-INFERENCE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TVA_INFERENCE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TVA-INFERENCE-METHOD");

    private static final SubLList $list52 = list(list(makeSymbol("*TVA-INFERENCE*"), list(makeSymbol("MAKE-TVA-INFERENCE"))));

    private static final SubLSymbol $TVA_MAX_TIME = makeKeyword("TVA-MAX-TIME");



    private static final SubLString $str59$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str64$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLString $$$SKSI_SQL_statement_cache_ = makeString("SKSI SQL statement cache ");

    private static final SubLString $str72$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str73$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str74$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLList $list76 = cons(makeSymbol("GATHER-ARG-VALUE"), makeSymbol("SUPPORTS"));

    private static final SubLList $list77 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol TVA_UNIFY_CLOSURE_ITERATOR_DONE = makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-DONE");

    private static final SubLSymbol TVA_UNIFY_CLOSURE_ITERATOR_NEXT = makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-NEXT");

    private static final SubLSymbol TVA_UNIFY_CLOSURE_ITERATOR_FINALIZE = makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-FINALIZE");

    private static final SubLList $list82 = list(makeSymbol("VAR"), makeSymbol("ARGNUM"));

    private static final SubLList $list83 = list(makeSymbol("ITERATOR"), makeSymbol("TVA-ANSWERS"), makeSymbol("VAR-PRED-DIRECTION"));

    private static final SubLList $list84 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORT"));

    static private final SubLList $list85 = list(makeSymbol("PRED"), makeSymbol("DIRECTION"));

    private static final SubLSymbol TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_DONE = makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-DONE");

    private static final SubLSymbol TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_NEXT = makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-NEXT");

    private static final SubLSymbol TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_FINALIZE = makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-FINALIZE");

    private static final SubLList $list89 = list(makeSymbol("VAR"), makeSymbol("ITERATOR"));

    public static final SubLObject tva_inference_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_tva_inference(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tva_inference_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_tva_inference(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tva_inference_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.tva_inference.$tva_inference_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject tva_inference_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.tva_inference.$tva_inference_native.class ? T : NIL;
    }

    public static final SubLObject tva_inf_problem_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField2();
    }

    public static SubLObject tva_inf_problem(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tva_inf_asent_pred_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField3();
    }

    public static SubLObject tva_inf_asent_pred(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tva_inf_asent_args_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField4();
    }

    public static SubLObject tva_inf_asent_args(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject tva_inf_args_admitted_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField5();
    }

    public static SubLObject tva_inf_args_admitted(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject tva_inf_term_argnums_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField6();
    }

    public static SubLObject tva_inf_term_argnums(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject tva_inf_var_argnums_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField7();
    }

    public static SubLObject tva_inf_var_argnums(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject tva_inf_precomputations_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField8();
    }

    public static SubLObject tva_inf_precomputations(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject tva_inf_reused_spaces_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField9();
    }

    public static SubLObject tva_inf_reused_spaces(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject tva_inf_one_answerP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField10();
    }

    public static SubLObject tva_inf_one_answerP(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject tva_inf_justifyP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField11();
    }

    public static SubLObject tva_inf_justifyP(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject tva_inf_restricted_assertion_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField12();
    }

    public static SubLObject tva_inf_restricted_assertion(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject tva_inf_answers_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.getField13();
    }

    public static SubLObject tva_inf_answers(final SubLObject v_object) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject _csetf_tva_inf_problem_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tva_inf_problem(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tva_inf_asent_pred_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tva_inf_asent_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tva_inf_asent_args_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tva_inf_asent_args(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tva_inf_args_admitted_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tva_inf_args_admitted(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tva_inf_term_argnums_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tva_inf_term_argnums(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tva_inf_var_argnums_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tva_inf_var_argnums(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tva_inf_precomputations_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tva_inf_precomputations(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tva_inf_reused_spaces_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_tva_inf_reused_spaces(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_tva_inf_one_answerP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_tva_inf_one_answerP(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_tva_inf_justifyP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_tva_inf_justifyP(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_tva_inf_restricted_assertion_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_tva_inf_restricted_assertion(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_tva_inf_answers_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TVA_INFERENCE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_tva_inf_answers(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_inference_p(v_object) : "! tva_inference.tva_inference_p(v_object) " + "tva_inference.tva_inference_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_tva_inference_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.tva_inference.$tva_inference_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PROBLEM)) {
                        _csetf_tva_inf_problem(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ASENT_PRED)) {
                            _csetf_tva_inf_asent_pred(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ASENT_ARGS)) {
                                _csetf_tva_inf_asent_args(v_new, current_value);
                            } else {
                                if (pcase_var.eql($ARGS_ADMITTED)) {
                                    _csetf_tva_inf_args_admitted(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TERM_ARGNUMS)) {
                                        _csetf_tva_inf_term_argnums(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($VAR_ARGNUMS)) {
                                            _csetf_tva_inf_var_argnums(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PRECOMPUTATIONS)) {
                                                _csetf_tva_inf_precomputations(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($REUSED_SPACES)) {
                                                    _csetf_tva_inf_reused_spaces(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($kw40$ONE_ANSWER_)) {
                                                        _csetf_tva_inf_one_answerP(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($JUSTIFY_)) {
                                                            _csetf_tva_inf_justifyP(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($RESTRICTED_ASSERTION)) {
                                                                _csetf_tva_inf_restricted_assertion(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($ANSWERS)) {
                                                                    _csetf_tva_inf_answers(v_new, current_value);
                                                                } else {
                                                                    Errors.error($str_alt44$Invalid_slot__S_for_construction_, current_arg);
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
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_tva_inference(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.tva_inference.$tva_inference_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PROBLEM)) {
                _csetf_tva_inf_problem(v_new, current_value);
            } else
                if (pcase_var.eql($ASENT_PRED)) {
                    _csetf_tva_inf_asent_pred(v_new, current_value);
                } else
                    if (pcase_var.eql($ASENT_ARGS)) {
                        _csetf_tva_inf_asent_args(v_new, current_value);
                    } else
                        if (pcase_var.eql($ARGS_ADMITTED)) {
                            _csetf_tva_inf_args_admitted(v_new, current_value);
                        } else
                            if (pcase_var.eql($TERM_ARGNUMS)) {
                                _csetf_tva_inf_term_argnums(v_new, current_value);
                            } else
                                if (pcase_var.eql($VAR_ARGNUMS)) {
                                    _csetf_tva_inf_var_argnums(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PRECOMPUTATIONS)) {
                                        _csetf_tva_inf_precomputations(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($REUSED_SPACES)) {
                                            _csetf_tva_inf_reused_spaces(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($kw41$ONE_ANSWER_)) {
                                                _csetf_tva_inf_one_answerP(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($JUSTIFY_)) {
                                                    _csetf_tva_inf_justifyP(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($RESTRICTED_ASSERTION)) {
                                                        _csetf_tva_inf_restricted_assertion(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($ANSWERS)) {
                                                            _csetf_tva_inf_answers(v_new, current_value);
                                                        } else {
                                                            Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tva_inference(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TVA_INFERENCE, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PROBLEM, tva_inf_problem(obj));
        funcall(visitor_fn, obj, $SLOT, $ASENT_PRED, tva_inf_asent_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $ASENT_ARGS, tva_inf_asent_args(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGS_ADMITTED, tva_inf_args_admitted(obj));
        funcall(visitor_fn, obj, $SLOT, $TERM_ARGNUMS, tva_inf_term_argnums(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR_ARGNUMS, tva_inf_var_argnums(obj));
        funcall(visitor_fn, obj, $SLOT, $PRECOMPUTATIONS, tva_inf_precomputations(obj));
        funcall(visitor_fn, obj, $SLOT, $REUSED_SPACES, tva_inf_reused_spaces(obj));
        funcall(visitor_fn, obj, $SLOT, $kw41$ONE_ANSWER_, tva_inf_one_answerP(obj));
        funcall(visitor_fn, obj, $SLOT, $JUSTIFY_, tva_inf_justifyP(obj));
        funcall(visitor_fn, obj, $SLOT, $RESTRICTED_ASSERTION, tva_inf_restricted_assertion(obj));
        funcall(visitor_fn, obj, $SLOT, $ANSWERS, tva_inf_answers(obj));
        funcall(visitor_fn, obj, $END, MAKE_TVA_INFERENCE, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tva_inference_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tva_inference(obj, visitor_fn);
    }

    public static final SubLObject print_tva_inference_alt(SubLObject v_tva_inference, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_tva_inference, stream);
            } else {
                {
                    SubLObject v_object = v_tva_inference;
                    SubLObject stream_1 = stream;
                    write_string($str_alt45$__, stream_1, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                    write_char(CHAR_space, stream_1);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_1);
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_tva_inference(final SubLObject v_tva_inference, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_tva_inference, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_tva_inference, T, NIL);
            print_macros.print_unreadable_object_postamble(stream, v_tva_inference, T, T);
        }
        return NIL;
    }

    public static final SubLObject initialize_tva_inference_alt(SubLObject asent, SubLObject one_answerP, SubLObject justifyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inf = $tva_inference$.getDynamicValue(thread);
                _csetf_tva_inf_asent_pred(inf, cycl_utilities.atomic_sentence_predicate(asent));
                _csetf_tva_inf_asent_args(inf, initialize_tva_asent_vector(asent));
                _csetf_tva_inf_args_admitted(inf, initialize_tva_args_admitted_vector(asent));
                _csetf_tva_inf_term_argnums(inf, determine_term_argnums(asent));
                _csetf_tva_inf_var_argnums(inf, determine_var_argnums(asent));
                _csetf_tva_inf_precomputations(inf, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                _csetf_tva_inf_reused_spaces(inf, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
                _csetf_tva_inf_one_answerP(inf, one_answerP);
                _csetf_tva_inf_restricted_assertion(inf, determine_restricted_assertion(asent));
                _csetf_tva_inf_justifyP(inf, justifyP);
                return inf;
            }
        }
    }

    public static SubLObject initialize_tva_inference(final SubLObject asent, final SubLObject one_answerP, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inf = $tva_inference$.getDynamicValue(thread);
        _csetf_tva_inf_asent_pred(inf, cycl_utilities.atomic_sentence_predicate(asent));
        _csetf_tva_inf_asent_args(inf, initialize_tva_asent_vector(asent));
        _csetf_tva_inf_args_admitted(inf, initialize_tva_args_admitted_vector(asent));
        _csetf_tva_inf_term_argnums(inf, determine_term_argnums(asent));
        _csetf_tva_inf_var_argnums(inf, determine_var_argnums(asent));
        _csetf_tva_inf_precomputations(inf, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_tva_inf_reused_spaces(inf, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        _csetf_tva_inf_one_answerP(inf, one_answerP);
        _csetf_tva_inf_restricted_assertion(inf, determine_restricted_assertion(asent));
        _csetf_tva_inf_justifyP(inf, justifyP);
        return inf;
    }

    public static final SubLObject tva_inference_asent_pred_alt(SubLObject inf) {
        return tva_inf_asent_pred(inf);
    }

    public static SubLObject tva_inference_asent_pred(final SubLObject inf) {
        return tva_inf_asent_pred(inf);
    }

    public static final SubLObject tva_inference_asent_args_alt(SubLObject inf) {
        return tva_inf_asent_args(inf);
    }

    public static SubLObject tva_inference_asent_args(final SubLObject inf) {
        return tva_inf_asent_args(inf);
    }

    public static final SubLObject tva_inference_args_admitted_alt(SubLObject inf) {
        return tva_inf_args_admitted(inf);
    }

    public static SubLObject tva_inference_args_admitted(final SubLObject inf) {
        return tva_inf_args_admitted(inf);
    }

    public static final SubLObject tva_inference_term_argnums_alt(SubLObject inf) {
        return tva_inf_term_argnums(inf);
    }

    public static SubLObject tva_inference_term_argnums(final SubLObject inf) {
        return tva_inf_term_argnums(inf);
    }

    public static final SubLObject tva_inference_var_argnums_alt(SubLObject inf) {
        return tva_inf_var_argnums(inf);
    }

    public static SubLObject tva_inference_var_argnums(final SubLObject inf) {
        return tva_inf_var_argnums(inf);
    }

    public static final SubLObject tva_inference_precomputations_alt(SubLObject inf) {
        return tva_inf_precomputations(inf);
    }

    public static SubLObject tva_inference_precomputations(final SubLObject inf) {
        return tva_inf_precomputations(inf);
    }

    public static final SubLObject tva_inference_reused_spaces_alt(SubLObject inf) {
        return tva_inf_reused_spaces(inf);
    }

    public static SubLObject tva_inference_reused_spaces(final SubLObject inf) {
        return tva_inf_reused_spaces(inf);
    }

    public static final SubLObject tva_inference_justifyP_alt(SubLObject inf) {
        return tva_inf_justifyP(inf);
    }

    public static SubLObject tva_inference_justifyP(final SubLObject inf) {
        return tva_inf_justifyP(inf);
    }

    public static final SubLObject tva_inference_one_answerP_alt(SubLObject inf) {
        return tva_inf_one_answerP(inf);
    }

    public static SubLObject tva_inference_one_answerP(final SubLObject inf) {
        return tva_inf_one_answerP(inf);
    }

    public static final SubLObject tva_inference_restricted_assertion_alt(SubLObject inf) {
        return tva_inf_restricted_assertion(inf);
    }

    public static SubLObject tva_inference_restricted_assertion(final SubLObject inf) {
        return tva_inf_restricted_assertion(inf);
    }

    public static final SubLObject tva_inference_answers_alt(SubLObject inf) {
        return tva_inf_answers(inf);
    }

    public static SubLObject tva_inference_answers(final SubLObject inf) {
        return tva_inf_answers(inf);
    }

    public static final SubLObject tva_inference_asent_arg_alt(SubLObject inf, SubLObject argnum) {
        return aref(tva_inference_asent_args(inf), argnum);
    }

    public static SubLObject tva_inference_asent_arg(final SubLObject inf, final SubLObject argnum) {
        return aref(tva_inference_asent_args(inf), argnum);
    }

    public static final SubLObject tva_inference_arg_admitted_alt(SubLObject inf, SubLObject argnum) {
        return aref(tva_inference_args_admitted(inf), argnum);
    }

    public static SubLObject tva_inference_arg_admitted(final SubLObject inf, final SubLObject argnum) {
        return aref(tva_inference_args_admitted(inf), argnum);
    }

    public static final SubLObject store_tva_inference_precomputation_alt(SubLObject inf, SubLObject tactic, SubLObject precomputation) {
        dictionary.dictionary_enter(tva_inf_precomputations(inf), tactic, precomputation);
        return NIL;
    }

    public static SubLObject store_tva_inference_precomputation(final SubLObject inf, final SubLObject tactic, final SubLObject precomputation) {
        dictionary.dictionary_enter(tva_inf_precomputations(inf), tactic, precomputation);
        return NIL;
    }

    public static final SubLObject store_tva_inference_reused_spaces_alt(SubLObject inf, SubLObject key, SubLObject spaces) {
        dictionary.dictionary_enter(tva_inf_reused_spaces(inf), key, spaces);
        return NIL;
    }

    public static SubLObject store_tva_inference_reused_spaces(final SubLObject inf, final SubLObject key, final SubLObject spaces) {
        dictionary.dictionary_enter(tva_inf_reused_spaces(inf), key, spaces);
        return NIL;
    }

    public static final SubLObject set_tva_inference_arg_admitted_alt(SubLObject inf, SubLObject argnum, SubLObject val) {
        set_aref(tva_inference_args_admitted(inf), number_utilities.f_1_(argnum), val);
        return NIL;
    }

    public static SubLObject set_tva_inference_arg_admitted(final SubLObject inf, final SubLObject argnum, final SubLObject val) {
        set_aref(tva_inference_args_admitted(inf), number_utilities.f_1_(argnum), val);
        return NIL;
    }

    public static final SubLObject with_new_tva_inference_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt49, append(body, NIL));
        }
    }

    public static SubLObject with_new_tva_inference(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list52, append(body, NIL));
    }

    /**
     * Returns the predicate for the atomic sentence that started the whole problem.
     */
    @LispMethod(comment = "Returns the predicate for the atomic sentence that started the whole problem.")
    public static final SubLObject tva_asent_pred_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_asent_pred($tva_inference$.getDynamicValue(thread));
        }
    }

    /**
     * Returns the predicate for the atomic sentence that started the whole problem.
     */
    @LispMethod(comment = "Returns the predicate for the atomic sentence that started the whole problem.")
    public static SubLObject tva_asent_pred() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_asent_pred($tva_inference$.getDynamicValue(thread));
    }

    /**
     * Returns the argnums which are variables.
     */
    @LispMethod(comment = "Returns the argnums which are variables.")
    public static final SubLObject tva_var_argnums_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_var_argnums($tva_inference$.getDynamicValue(thread));
        }
    }

    /**
     * Returns the argnums which are variables.
     */
    @LispMethod(comment = "Returns the argnums which are variables.")
    public static SubLObject tva_var_argnums() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_var_argnums($tva_inference$.getDynamicValue(thread));
    }

    /**
     * Returns the argnum for VAR.
     */
    @LispMethod(comment = "Returns the argnum for VAR.")
    public static final SubLObject tva_var_argnum_alt(SubLObject var) {
        {
            SubLObject argnum = NIL;
            if (NIL == argnum) {
                {
                    SubLObject csome_list_var = tva_var_argnums();
                    SubLObject pair = NIL;
                    for (pair = csome_list_var.first(); !((NIL != argnum) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pair = csome_list_var.first()) {
                        if (pair.first() == var) {
                            argnum = second(pair);
                        }
                    }
                }
            }
            return argnum;
        }
    }

    /**
     * Returns the argnum for VAR.
     */
    @LispMethod(comment = "Returns the argnum for VAR.")
    public static SubLObject tva_var_argnum(final SubLObject var) {
        SubLObject argnum = NIL;
        if (NIL == argnum) {
            SubLObject csome_list_var = tva_var_argnums();
            SubLObject pair = NIL;
            pair = csome_list_var.first();
            while ((NIL == argnum) && (NIL != csome_list_var)) {
                if (pair.first().eql(var)) {
                    argnum = second(pair);
                }
                csome_list_var = csome_list_var.rest();
                pair = csome_list_var.first();
            } 
        }
        return argnum;
    }

    /**
     * Returns the argnums which are terms
     */
    @LispMethod(comment = "Returns the argnums which are terms")
    public static final SubLObject tva_term_argnums_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_term_argnums($tva_inference$.getDynamicValue(thread));
        }
    }

    /**
     * Returns the argnums which are terms
     */
    @LispMethod(comment = "Returns the argnums which are terms")
    public static SubLObject tva_term_argnums() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_term_argnums($tva_inference$.getDynamicValue(thread));
    }

    /**
     * Returns the ARGNUMth element of the TVA asent.
     */
    @LispMethod(comment = "Returns the ARGNUMth element of the TVA asent.")
    public static final SubLObject tva_asent_arg_alt(SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_asent_arg($tva_inference$.getDynamicValue(thread), number_utilities.f_1_(argnum));
        }
    }

    /**
     * Returns the ARGNUMth element of the TVA asent.
     */
    @LispMethod(comment = "Returns the ARGNUMth element of the TVA asent.")
    public static SubLObject tva_asent_arg(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_asent_arg($tva_inference$.getDynamicValue(thread), number_utilities.f_1_(argnum));
    }

    /**
     * Returns whether the ARGNUMth element of TVA asent has been checked for arg admittance.
     */
    @LispMethod(comment = "Returns whether the ARGNUMth element of TVA asent has been checked for arg admittance.")
    public static final SubLObject tva_asent_arg_admitted_alt(SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_arg_admitted($tva_inference$.getDynamicValue(thread), number_utilities.f_1_(argnum));
        }
    }

    /**
     * Returns whether the ARGNUMth element of TVA asent has been checked for arg admittance.
     */
    @LispMethod(comment = "Returns whether the ARGNUMth element of TVA asent has been checked for arg admittance.")
    public static SubLObject tva_asent_arg_admitted(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_arg_admitted($tva_inference$.getDynamicValue(thread), number_utilities.f_1_(argnum));
    }

    public static final SubLObject set_tva_asent_arg_admitted_alt(SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            set_tva_inference_arg_admitted($tva_inference$.getDynamicValue(thread), argnum, T);
            return NIL;
        }
    }

    public static SubLObject set_tva_asent_arg_admitted(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_tva_inference_arg_admitted($tva_inference$.getDynamicValue(thread), argnum, T);
        return NIL;
    }

    public static final SubLObject set_tva_asent_arg_failed_alt(SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            set_tva_inference_arg_admitted($tva_inference$.getDynamicValue(thread), argnum, $FAIL);
            return NIL;
        }
    }

    public static SubLObject set_tva_asent_arg_failed(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_tva_inference_arg_admitted($tva_inference$.getDynamicValue(thread), argnum, $FAIL);
        return NIL;
    }

    public static final SubLObject tva_return_one_answerP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_one_answerP($tva_inference$.getDynamicValue(thread));
        }
    }

    public static SubLObject tva_return_one_answerP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_one_answerP($tva_inference$.getDynamicValue(thread));
    }

    public static final SubLObject tva_compute_justificationsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_justifyP($tva_inference$.getDynamicValue(thread));
        }
    }

    public static SubLObject tva_compute_justificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_justifyP($tva_inference$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @return hash-table-p. Returns the closure associated with TACTIC.
     */
    @LispMethod(comment = "@return hash-table-p. Returns the closure associated with TACTIC.")
    public static final SubLObject tva_tactic_precomputations_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_lookup(tva_inference_precomputations($tva_inference$.getDynamicValue(thread)), tactic, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return hash-table-p. Returns the closure associated with TACTIC.
     */
    @LispMethod(comment = "@return hash-table-p. Returns the closure associated with TACTIC.")
    public static SubLObject tva_tactic_precomputations(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup(tva_inference_precomputations($tva_inference$.getDynamicValue(thread)), tactic, UNPROVIDED);
    }

    /**
     * Stores the closure PRECOMPUTATION associated with TACTIC.
     */
    @LispMethod(comment = "Stores the closure PRECOMPUTATION associated with TACTIC.")
    public static final SubLObject tva_store_precomputation_alt(SubLObject tactic, SubLObject precomputation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            store_tva_inference_precomputation($tva_inference$.getDynamicValue(thread), tactic, precomputation);
            return NIL;
        }
    }

    @LispMethod(comment = "Stores the closure PRECOMPUTATION associated with TACTIC.")
    public static SubLObject tva_store_precomputation(final SubLObject tactic, final SubLObject precomputation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        store_tva_inference_precomputation($tva_inference$.getDynamicValue(thread), tactic, precomputation);
        return NIL;
    }

    /**
     *
     *
     * @return booleanp. Returns whether ASSERTION is the assertion we're attempting to justify or prove in TVA inference.
     */
    @LispMethod(comment = "@return booleanp. Returns whether ASSERTION is the assertion we\'re attempting to justify or prove in TVA inference.")
    public static final SubLObject tva_restricted_assertion_p_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq(assertion, tva_inference_restricted_assertion($tva_inference$.getDynamicValue(thread)));
        }
    }

    /**
     *
     *
     * @return booleanp. Returns whether ASSERTION is the assertion we're attempting to justify or prove in TVA inference.
     */
    @LispMethod(comment = "@return booleanp. Returns whether ASSERTION is the assertion we\'re attempting to justify or prove in TVA inference.")
    public static SubLObject tva_restricted_assertion_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(assertion, tva_inference_restricted_assertion($tva_inference$.getDynamicValue(thread)));
    }

    /**
     *
     *
     * @return listp. Returns the spaces associated with TACTIC.
     */
    @LispMethod(comment = "@return listp. Returns the spaces associated with TACTIC.")
    public static final SubLObject tva_reused_spaces_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_reused_spaces($tva_inference$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @return listp. Returns the spaces associated with TACTIC.
     */
    @LispMethod(comment = "@return listp. Returns the spaces associated with TACTIC.")
    public static SubLObject tva_reused_spaces() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_reused_spaces($tva_inference$.getDynamicValue(thread));
    }

    /**
     * Stores the SPACES used by the SBHL in tva inference by KEY.
     */
    @LispMethod(comment = "Stores the SPACES used by the SBHL in tva inference by KEY.")
    public static final SubLObject tva_store_reused_spaces_alt(SubLObject key, SubLObject spaces) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            store_tva_inference_reused_spaces($tva_inference$.getDynamicValue(thread), key, spaces);
            return NIL;
        }
    }

    @LispMethod(comment = "Stores the SPACES used by the SBHL in tva inference by KEY.")
    public static SubLObject tva_store_reused_spaces(final SubLObject key, final SubLObject spaces) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        store_tva_inference_reused_spaces($tva_inference$.getDynamicValue(thread), key, spaces);
        return NIL;
    }

    /**
     *
     *
     * @return listp. Returns the spaces associated with TACTIC. Creates and stores new spaces if none are currently associated with TACTIC.
     */
    @LispMethod(comment = "@return listp. Returns the spaces associated with TACTIC. Creates and stores new spaces if none are currently associated with TACTIC.")
    public static final SubLObject tva_reused_spaces_for_relation_alt(SubLObject trans_pred, SubLObject goal_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject key = list(trans_pred, goal_node);
                SubLObject spaces = dictionary.dictionary_lookup(tva_reused_spaces(), key, UNPROVIDED);
                if (NIL != spaces) {
                    return spaces;
                } else {
                    {
                        SubLObject fail_space = ghl_marking_utilities.ghl_instantiate_new_space();
                        SubLObject goal_space = ghl_marking_utilities.ghl_instantiate_new_space();
                        spaces = list(fail_space, goal_space);
                        if (NIL != $tva_reuse_spacesP$.getDynamicValue(thread)) {
                            tva_store_reused_spaces(key, spaces);
                        }
                        return spaces;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp. Returns the spaces associated with TACTIC. Creates and stores new spaces if none are currently associated with TACTIC.
     */
    @LispMethod(comment = "@return listp. Returns the spaces associated with TACTIC. Creates and stores new spaces if none are currently associated with TACTIC.")
    public static SubLObject tva_reused_spaces_for_relation(final SubLObject trans_pred, final SubLObject goal_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = list(trans_pred, goal_node);
        SubLObject spaces = dictionary.dictionary_lookup(tva_reused_spaces(), key, UNPROVIDED);
        if (NIL != spaces) {
            return spaces;
        }
        final SubLObject fail_space = ghl_marking_utilities.ghl_instantiate_new_space();
        final SubLObject goal_space = ghl_marking_utilities.ghl_instantiate_new_space();
        spaces = list(fail_space, goal_space);
        if (NIL != $tva_reuse_spacesP$.getDynamicValue(thread)) {
            tva_store_reused_spaces(key, spaces);
        }
        return spaces;
    }

    public static final SubLObject tva_answers_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tva_inference_answers($tva_inference$.getDynamicValue(thread));
        }
    }

    public static SubLObject tva_answers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_answers($tva_inference$.getDynamicValue(thread));
    }

    public static final SubLObject add_to_tva_answers_alt(SubLObject new_answers) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            _csetf_tva_inf_answers($tva_inference$.getDynamicValue(thread), nconc(new_answers, tva_answers()));
            return NIL;
        }
    }

    public static SubLObject add_to_tva_answers(final SubLObject new_answers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        _csetf_tva_inf_answers($tva_inference$.getDynamicValue(thread), nconc(new_answers, tva_answers()));
        return NIL;
    }

    /**
     *
     *
     * @return listp. Determines the argnums for each of the fully bound terms in ASENT.
     */
    @LispMethod(comment = "@return listp. Determines the argnums for each of the fully bound terms in ASENT.")
    public static final SubLObject determine_term_argnums_alt(SubLObject asent) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = list_utilities.num_list(formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
            SubLObject num = NIL;
            for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num = cdolist_list_var.first()) {
                if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                    result = cons(num, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return listp. Determines the argnums for each of the fully bound terms in ASENT.
     */
    @LispMethod(comment = "@return listp. Determines the argnums for each of the fully bound terms in ASENT.")
    public static SubLObject determine_term_argnums(final SubLObject asent) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                result = cons(num, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     *
     *
     * @return listp. Determines the argnums for the hl-variable positions in ASENT.
     */
    @LispMethod(comment = "@return listp. Determines the argnums for the hl-variable positions in ASENT.")
    public static final SubLObject determine_var_argnums_alt(SubLObject asent) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = list_utilities.num_list(formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
            SubLObject num = NIL;
            for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num = cdolist_list_var.first()) {
                if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                    result = cons(list(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED), num), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return listp. Determines the argnums for the hl-variable positions in ASENT.
     */
    @LispMethod(comment = "@return listp. Determines the argnums for the hl-variable positions in ASENT.")
    public static SubLObject determine_var_argnums(final SubLObject asent) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                result = cons(list(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED), num), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     *
     *
     * @return (:or assertion-p nil).  Finds the assertion which shouldn't be used in TVA justification (b/c lookup could do it).
     */
    @LispMethod(comment = "@return (:or assertion-p nil).  Finds the assertion which shouldn\'t be used in TVA justification (b/c lookup could do it).")
    public static final SubLObject determine_restricted_assertion_alt(SubLObject asent) {
        if (NIL != variables.fully_bound_p(asent)) {
            return czer_meta.find_assertion_cycl(asent, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return (:or assertion-p nil).  Finds the assertion which shouldn't be used in TVA justification (b/c lookup could do it).
     */
    @LispMethod(comment = "@return (:or assertion-p nil).  Finds the assertion which shouldn\'t be used in TVA justification (b/c lookup could do it).")
    public static SubLObject determine_restricted_assertion(final SubLObject asent) {
        if (NIL != variables.fully_bound_p(asent)) {
            return czer_meta.find_assertion_cycl(asent, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return vectorp. The vector corresponding to the formula ASENT.
     */
    @LispMethod(comment = "@return vectorp. The vector corresponding to the formula ASENT.")
    public static final SubLObject initialize_tva_asent_vector_alt(SubLObject asent) {
        {
            SubLObject arg_count = formula_arity(asent, UNPROVIDED);
            SubLObject vector = make_vector(arg_count, UNPROVIDED);
            SubLObject n = NIL;
            for (n = ZERO_INTEGER; n.numL(arg_count); n = add(n, ONE_INTEGER)) {
                set_aref(vector, n, cycl_utilities.atomic_sentence_arg(asent, add(ONE_INTEGER, n), UNPROVIDED));
            }
            return vector;
        }
    }

    /**
     *
     *
     * @return vectorp. The vector corresponding to the formula ASENT.
     */
    @LispMethod(comment = "@return vectorp. The vector corresponding to the formula ASENT.")
    public static SubLObject initialize_tva_asent_vector(final SubLObject asent) {
        final SubLObject arg_count = formula_arity(asent, UNPROVIDED);
        final SubLObject vector = make_vector(arg_count, UNPROVIDED);
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(arg_count); n = add(n, ONE_INTEGER)) {
            set_aref(vector, n, cycl_utilities.atomic_sentence_arg(asent, add(ONE_INTEGER, n), UNPROVIDED));
        }
        return vector;
    }

    public static final SubLObject initialize_tva_args_admitted_vector_alt(SubLObject asent) {
        {
            SubLObject arg_count = formula_arity(asent, UNPROVIDED);
            SubLObject vector = make_vector(arg_count, UNPROVIDED);
            return vector;
        }
    }

    public static SubLObject initialize_tva_args_admitted_vector(final SubLObject asent) {
        final SubLObject arg_count = formula_arity(asent, UNPROVIDED);
        final SubLObject vector = make_vector(arg_count, UNPROVIDED);
        return vector;
    }

    /**
     * Return a list of (BINDINGS SUPPORTS) pairs that support ASENT being proven true in MT
     * CLOSURE-MODE should be either :none, :focused, or :all.
     */
    @LispMethod(comment = "Return a list of (BINDINGS SUPPORTS) pairs that support ASENT being proven true in MT\r\nCLOSURE-MODE should be either :none, :focused, or :all.\nReturn a list of (BINDINGS SUPPORTS) pairs that support ASENT being proven true in MT\nCLOSURE-MODE should be either :none, :focused, or :all.")
    public static final SubLObject tva_unify(SubLObject asent, SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p, SubLObject closure_mode, SubLObject checking_spec_preds_for_cache_resultsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (return_one_answer_p == UNPROVIDED) {
            return_one_answer_p = NIL;
        }
        if (compute_justifications_p == UNPROVIDED) {
            compute_justifications_p = NIL;
        }
        if (closure_mode == UNPROVIDED) {
            closure_mode = $NONE;
        }
        if (checking_spec_preds_for_cache_resultsP == UNPROVIDED) {
            checking_spec_preds_for_cache_resultsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject answers = tva_unify_from_cache(asent, mt, return_one_answer_p, compute_justifications_p);
                SubLObject use_general_methodP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != use_general_methodP) {
                    {
                        SubLObject timed_outP = NIL;
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                                    {
                                        SubLObject _prev_bind_0_2 = $tva_inference$.currentBinding(thread);
                                        try {
                                            $tva_inference$.bind(make_tva_inference(UNPROVIDED), thread);
                                            initialize_tva_inference(asent, return_one_answer_p, compute_justifications_p);
                                            try {
                                                {
                                                    SubLObject strategy = tva_strategy.make_tva_default_strategy();
                                                    {
                                                        SubLObject _prev_bind_0_3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_5 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                            {
                                                                SubLObject mt_var_6 = mt;
                                                                {
                                                                    SubLObject _prev_bind_0_7 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_9 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                    try {
                                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_6), thread);
                                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_6), thread);
                                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_6), thread);
                                                                        {
                                                                            SubLObject tv_var = NIL;
                                                                            {
                                                                                SubLObject _prev_bind_0_10 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_11 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                                    if (NIL != tv_var) {
                                                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                {
                                                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                                    if (pcase_var.eql($ERROR)) {
                                                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    } else {
                                                                                                        if (pcase_var.eql($CERROR)) {
                                                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        } else {
                                                                                                            if (pcase_var.eql($WARN)) {
                                                                                                                Errors.warn($str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                            } else {
                                                                                                                Errors.warn($str_alt61$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                                Errors.cerror($$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject _prev_bind_0_12 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_2_14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                                            {
                                                                                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_15 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_16 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_17 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_1_18 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_2_19 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_3_20 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_4_21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                        {
                                                                                                                            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                                                            SubLObject needs_to_releaseP = NIL;
                                                                                                                            try {
                                                                                                                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject spec_preds = tva_utilities.tva_spec_preds_and_inverses(tva_asent_pred());
                                                                                                                                    SubLObject spec_inverses = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject rest = NIL;
                                                                                                                                        for (rest = spec_preds; !(((NIL != tva_return_one_answerP()) && (NIL != tva_answers())) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                            {
                                                                                                                                                SubLObject pred = rest.first();
                                                                                                                                                tva_mark_and_sweep(pred, strategy);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(T, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject rest = NIL;
                                                                                                                                                for (rest = spec_inverses; !(((NIL != tva_return_one_answerP()) && (NIL != tva_answers())) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject pred = rest.first();
                                                                                                                                                        tva_mark_and_sweep(pred, strategy);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_22, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                if (NIL != needs_to_releaseP) {
                                                                                                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_21, thread);
                                                                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_20, thread);
                                                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_19, thread);
                                                                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_18, thread);
                                                                                                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_17, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (source == $RESOURCE) {
                                                                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_16, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        if (source == $RESOURCE) {
                                                                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_15, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_14, thread);
                                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_13, thread);
                                                                                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_12, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_11, thread);
                                                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_10, thread);
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
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_5, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_4, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_3, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                timed_outP = Errors.handleThrowable(ccatch_env_var, $TVA_MAX_TIME);
                                            }
                                            answers = list_utilities.fast_delete_duplicates(tva_answers(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL == return_one_answer_p) {
                                                answers = tva_unify_closure(answers, closure_mode);
                                            }
                                        } finally {
                                            $tva_inference$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject _prev_bind_0_23 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                                        SubLObject _prev_bind_1_24 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                                        SubLObject _prev_bind_2_25 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                                        try {
                                            sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                            sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                                            sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($str_alt65$SKSI_SQL_statement_cache_))), thread);
                                            {
                                                SubLObject resourcing_caches_finalizedP = NIL;
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_26 = $tva_inference$.currentBinding(thread);
                                                        try {
                                                            $tva_inference$.bind(make_tva_inference(UNPROVIDED), thread);
                                                            initialize_tva_inference(asent, return_one_answer_p, compute_justifications_p);
                                                            try {
                                                                {
                                                                    SubLObject strategy = tva_strategy.make_tva_default_strategy();
                                                                    {
                                                                        SubLObject _prev_bind_0_27 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_29 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                            {
                                                                                SubLObject mt_var_30 = mt;
                                                                                {
                                                                                    SubLObject _prev_bind_0_31 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_32 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_33 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                    try {
                                                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_30), thread);
                                                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_30), thread);
                                                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_30), thread);
                                                                                        {
                                                                                            SubLObject tv_var = NIL;
                                                                                            {
                                                                                                SubLObject _prev_bind_0_34 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_35 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                                                    if (NIL != tv_var) {
                                                                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                                {
                                                                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                                                    if (pcase_var.eql($ERROR)) {
                                                                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    } else {
                                                                                                                        if (pcase_var.eql($CERROR)) {
                                                                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        } else {
                                                                                                                            if (pcase_var.eql($WARN)) {
                                                                                                                                Errors.warn($str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                            } else {
                                                                                                                                Errors.warn($str_alt61$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                                                Errors.cerror($$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_36 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_37 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_2_38 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                                                            {
                                                                                                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_39 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_40 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_41 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                                                                    SubLObject _prev_bind_1_42 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                                                                    SubLObject _prev_bind_2_43 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                                                    SubLObject _prev_bind_3_44 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                                                                    SubLObject _prev_bind_4_45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                                                                            SubLObject needs_to_releaseP = NIL;
                                                                                                                                            try {
                                                                                                                                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject spec_preds = tva_utilities.tva_spec_preds_and_inverses(tva_asent_pred());
                                                                                                                                                    SubLObject spec_inverses = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject rest = NIL;
                                                                                                                                                        for (rest = spec_preds; !(((NIL != tva_return_one_answerP()) && (NIL != tva_answers())) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject pred = rest.first();
                                                                                                                                                                tva_mark_and_sweep(pred, strategy);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(T, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject rest = NIL;
                                                                                                                                                                for (rest = spec_inverses; !(((NIL != tva_return_one_answerP()) && (NIL != tva_answers())) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject pred = rest.first();
                                                                                                                                                                        tva_mark_and_sweep(pred, strategy);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_46, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                if (NIL != needs_to_releaseP) {
                                                                                                                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_45, thread);
                                                                                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_44, thread);
                                                                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_43, thread);
                                                                                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_42, thread);
                                                                                                                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_41, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (source == $RESOURCE) {
                                                                                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_40, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (source == $RESOURCE) {
                                                                                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_39, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_38, thread);
                                                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_37, thread);
                                                                                                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_36, thread);
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_35, thread);
                                                                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_34, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_33, thread);
                                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_32, thread);
                                                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_31, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_29, thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_28, thread);
                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_27, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Throwable ccatch_env_var) {
                                                                timed_outP = Errors.handleThrowable(ccatch_env_var, $TVA_MAX_TIME);
                                                            }
                                                            answers = list_utilities.fast_delete_duplicates(tva_answers(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            if (NIL == return_one_answer_p) {
                                                                answers = tva_unify_closure(answers, closure_mode);
                                                            }
                                                        } finally {
                                                            $tva_inference$.rebind(_prev_bind_0_26, thread);
                                                        }
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            try {
                                                                resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL == resourcing_caches_finalizedP) {
                                                                            sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_48, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2_25, thread);
                                            sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_24, thread);
                                            sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_23, thread);
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
                    if (NIL == checking_spec_preds_for_cache_resultsP) {
                        {
                            SubLObject arg0 = cycl_utilities.atomic_sentence_predicate(asent);
                            SubLObject node_var = arg0;
                            SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_49 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt61$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_50 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_51 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(arg0, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_52 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_53 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(arg0, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while (NIL != node_and_predicate_mode) {
                                                                        {
                                                                            SubLObject node_var_55 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject spec_pred = node_var_55;
                                                                            {
                                                                                SubLObject _prev_bind_0_56 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverseP = predicate_mode;
                                                                                        if (!(spec_pred.equal(arg0) || (NIL == tva_utilities.some_transitive_via_arg_assertionP(spec_pred)))) {
                                                                                            {
                                                                                                SubLObject new_asent = (NIL != inverseP) ? ((SubLObject) (make_formula(spec_pred, reverse(cycl_utilities.atomic_sentence_args(asent, UNPROVIDED)), UNPROVIDED))) : replace_formula_arg(ZERO_INTEGER, spec_pred, asent);
                                                                                                SubLObject cdolist_list_var = tva_unify(new_asent, mt, return_one_answer_p, compute_justifications_p, closure_mode, T);
                                                                                                SubLObject v_answer = NIL;
                                                                                                for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject item_var = v_answer;
                                                                                                        if (NIL == member(item_var, answers, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                            answers = cons(item_var, answers);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                                            SubLObject module_var = NIL;
                                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_57 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_58 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                        {
                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_55);
                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                {
                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != d_link) {
                                                                                                                        {
                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != mt_links) {
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject mt_59 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_59)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_59, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject iteration_state_61 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_61)) {
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                {
                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_61);
                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject _prev_bind_0_62 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                            try {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                    SubLObject cdolist_list_var_63 = new_list;
                                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_63.first(); NIL != cdolist_list_var_63; cdolist_list_var_63 = cdolist_list_var_63.rest() , node_vars_link_node = cdolist_list_var_63.first()) {
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } finally {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_62, thread);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    iteration_state_61 = dictionary_contents.do_dictionary_contents_next(iteration_state_61);
                                                                                                                                                                }
                                                                                                                                                            } 
                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_61);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_60, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt69$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        SubLObject cdolist_list_var_64 = new_list;
                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                        for (generating_fn = cdolist_list_var_64.first(); NIL != cdolist_list_var_64; cdolist_list_var_64 = cdolist_list_var_64.rest() , generating_fn = cdolist_list_var_64.first()) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_65 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_66 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject cdolist_list_var_67 = new_list_66;
                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                        for (node_vars_link_node = cdolist_list_var_67.first(); NIL != cdolist_list_var_67; cdolist_list_var_67 = cdolist_list_var_67.rest() , node_vars_link_node = cdolist_list_var_67.first()) {
                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_65, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_58, thread);
                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_57, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_56, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_54, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_53, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_52, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt70$Node__a_does_not_pass_sbhl_type_t, arg0, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_51, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_50, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return answers;
            }
        }
    }

    public static SubLObject tva_unify(final SubLObject asent, SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p, SubLObject closure_mode, SubLObject checking_spec_preds_for_cache_resultsP, SubLObject prove_negationP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (return_one_answer_p == UNPROVIDED) {
            return_one_answer_p = NIL;
        }
        if (compute_justifications_p == UNPROVIDED) {
            compute_justifications_p = NIL;
        }
        if (closure_mode == UNPROVIDED) {
            closure_mode = $NONE;
        }
        if (checking_spec_preds_for_cache_resultsP == UNPROVIDED) {
            checking_spec_preds_for_cache_resultsP = T;
        }
        if (prove_negationP == UNPROVIDED) {
            prove_negationP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject answers = tva_unify_from_cache(asent, mt, return_one_answer_p, compute_justifications_p);
        final SubLObject use_general_methodP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != use_general_methodP) {
            SubLObject timed_outP = NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                    final SubLObject _prev_bind_0_$1 = $tva_inference$.currentBinding(thread);
                    try {
                        $tva_inference$.bind(make_tva_inference(UNPROVIDED), thread);
                        initialize_tva_inference(asent, return_one_answer_p, compute_justifications_p);
                        try {
                            thread.throwStack.push($TVA_MAX_TIME);
                            final SubLObject strategy = tva_strategy.make_tva_default_strategy();
                            final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$4 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                final SubLObject mt_var_$5 = mt;
                                final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$5), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$5), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$5), thread);
                                    final SubLObject tv_var = NIL;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql($ERROR)) {
                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($WARN)) {
                                                        Errors.warn($str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    } else {
                                                        Errors.warn($str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror($$$continue_anyway, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    }


                                        }
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                            final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                    final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$7 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$19 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                        SubLObject needs_to_releaseP = NIL;
                                                        try {
                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                            thread.resetMultipleValues();
                                                            final SubLObject spec_preds = tva_utilities.tva_spec_preds_and_inverses(tva_asent_pred(), prove_negationP);
                                                            final SubLObject spec_inverses = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            SubLObject rest;
                                                            SubLObject pred;
                                                            for (rest = NIL, rest = spec_preds; ((NIL == tva_return_one_answerP()) || (NIL == tva_answers())) && (NIL != rest); rest = rest.rest()) {
                                                                pred = rest.first();
                                                                tva_mark_and_sweep(pred, strategy);
                                                            }
                                                            final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(T, thread);
                                                                SubLObject rest2;
                                                                SubLObject pred2;
                                                                for (rest2 = NIL, rest2 = spec_inverses; ((NIL == tva_return_one_answerP()) || (NIL == tva_answers())) && (NIL != rest2); rest2 = rest2.rest()) {
                                                                    pred2 = rest2.first();
                                                                    tva_mark_and_sweep(pred2, strategy);
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$9, thread);
                                                            }
                                                        } finally {
                                                            if (NIL != needs_to_releaseP) {
                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$20, thread);
                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$19, thread);
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$7, thread);
                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                    if (source == $RESOURCE) {
                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$7, thread);
                                                }
                                                if (source == $RESOURCE) {
                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$6, thread);
                                            }
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$6, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$6, thread);
                                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$5, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$4, thread);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$5, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$4, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$4, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            timed_outP = Errors.handleThrowable(ccatch_env_var, $TVA_MAX_TIME);
                        } finally {
                            thread.throwStack.pop();
                        }
                        answers = list_utilities.fast_delete_duplicates(tva_answers(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == return_one_answer_p) {
                            answers = tva_unify_closure(answers, closure_mode);
                        }
                    } finally {
                        $tva_inference$.rebind(_prev_bind_0_$1, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0_$10 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$8 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$8 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                    try {
                        sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($$$SKSI_SQL_statement_cache_))), thread);
                        SubLObject resourcing_caches_finalizedP = NIL;
                        try {
                            final SubLObject _prev_bind_0_$11 = $tva_inference$.currentBinding(thread);
                            try {
                                $tva_inference$.bind(make_tva_inference(UNPROVIDED), thread);
                                initialize_tva_inference(asent, return_one_answer_p, compute_justifications_p);
                                try {
                                    thread.throwStack.push($TVA_MAX_TIME);
                                    final SubLObject strategy2 = tva_strategy.make_tva_default_strategy();
                                    final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        final SubLObject mt_var_$6 = mt;
                                        final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$10 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$6), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$6), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$6), thread);
                                            final SubLObject tv_var2 = NIL;
                                            final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var2 ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var2 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (((NIL != tv_var2) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2))) {
                                                    final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var2.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str59$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if (pcase_var2.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str59$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (pcase_var2.eql($WARN)) {
                                                                Errors.warn($str59$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str59$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                                            }


                                                }
                                                final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                    final SubLObject source2 = sbhl_marking_vars.sbhl_new_space_source();
                                                    final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(source2 == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source2), thread);
                                                        final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                        try {
                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source2 == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source2), thread);
                                                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3_$20 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                            final SubLObject _prev_bind_4_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                final SubLObject rw_lock_var2 = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                SubLObject needs_to_releaseP2 = NIL;
                                                                try {
                                                                    needs_to_releaseP2 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var2);
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject spec_preds2 = tva_utilities.tva_spec_preds_and_inverses(tva_asent_pred(), prove_negationP);
                                                                    final SubLObject spec_inverses2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    SubLObject rest3;
                                                                    SubLObject pred3;
                                                                    for (rest3 = NIL, rest3 = spec_preds2; ((NIL == tva_return_one_answerP()) || (NIL == tva_answers())) && (NIL != rest3); rest3 = rest3.rest()) {
                                                                        pred3 = rest3.first();
                                                                        tva_mark_and_sweep(pred3, strategy2);
                                                                    }
                                                                    final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(T, thread);
                                                                        SubLObject rest4;
                                                                        SubLObject pred4;
                                                                        for (rest4 = NIL, rest4 = spec_inverses2; ((NIL == tva_return_one_answerP()) || (NIL == tva_answers())) && (NIL != rest4); rest4 = rest4.rest()) {
                                                                            pred4 = rest4.first();
                                                                            tva_mark_and_sweep(pred4, strategy2);
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$19, thread);
                                                                    }
                                                                } finally {
                                                                    if (NIL != needs_to_releaseP2) {
                                                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var2);
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$21, thread);
                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$20, thread);
                                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$12, thread);
                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$13, thread);
                                                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$18, thread);
                                                            }
                                                            if (source2 == $RESOURCE) {
                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                            }
                                                        } finally {
                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$17, thread);
                                                        }
                                                        if (source2 == $RESOURCE) {
                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$11, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$12, thread);
                                                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$15, thread);
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$11, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$14, thread);
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$10, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$9, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$12, thread);
                                    }
                                } catch (final Throwable ccatch_env_var2) {
                                    timed_outP = Errors.handleThrowable(ccatch_env_var2, $TVA_MAX_TIME);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                answers = list_utilities.fast_delete_duplicates(tva_answers(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL == return_one_answer_p) {
                                    answers = tva_unify_closure(answers, closure_mode);
                                }
                            } finally {
                                $tva_inference$.rebind(_prev_bind_0_$11, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                try {
                                    resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                } finally {
                                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values_$48 = getValuesAsVector();
                                        if (NIL == resourcing_caches_finalizedP) {
                                            sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        restoreValuesFromVector(_values_$48);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                    }
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    } finally {
                        sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2_$8, thread);
                        sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$8, thread);
                        sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL == checking_spec_preds_for_cache_resultsP) {
                final SubLObject node_var;
                final SubLObject arg0 = node_var = cycl_utilities.atomic_sentence_predicate(asent);
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var3 = NIL;
                        final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var3 ? tv_var3 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var3 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var3) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var3))) {
                                final SubLObject pcase_var3 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var3.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str59$_A_is_not_a__A, tv_var3, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var3.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str59$_A_is_not_a__A, tv_var3, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var3.eql($WARN)) {
                                            Errors.warn($str59$_A_is_not_a__A, tv_var3, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str59$_A_is_not_a__A, tv_var3, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(arg0, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list(arg0, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$55 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$55;
                                            final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if ((!spec_pred.equal(arg0)) && (NIL != tva_utilities.some_transitive_via_arg_assertionP(spec_pred))) {
                                                    final SubLObject new_asent = (NIL != inverseP) ? make_formula(spec_pred, reverse(cycl_utilities.atomic_sentence_args(asent, UNPROVIDED)), UNPROVIDED) : replace_formula_arg(ZERO_INTEGER, spec_pred, asent);
                                                    SubLObject cdolist_list_var = tva_unify(new_asent, mt, return_one_answer_p, compute_justifications_p, closure_mode, T, UNPROVIDED);
                                                    SubLObject v_answer = NIL;
                                                    v_answer = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject item_var = v_answer;
                                                        if (NIL == member(item_var, answers, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                            answers = cons(item_var, answers);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        v_answer = cdolist_list_var.first();
                                                    } 
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$55);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$59 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$59)) {
                                                                            final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$59, thread);
                                                                                SubLObject iteration_state_$61;
                                                                                for (iteration_state_$61 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$61); iteration_state_$61 = dictionary_contents.do_dictionary_contents_next(iteration_state_$61)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$61);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str72$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$61);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str73$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$63;
                                                                final SubLObject new_list = cdolist_list_var_$63 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$63.first();
                                                                while (NIL != cdolist_list_var_$63) {
                                                                    final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str72$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                                    }
                                                                    cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                                                                    generating_fn = cdolist_list_var_$63.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$16, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$25, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$13, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$15, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$24, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str74$Node__a_does_not_pass_sbhl_type_t, arg0, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_12, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_11, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_10, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$14, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$23, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_9, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$22, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_8, thread);
                }
            }

        return answers;
    }

    /**
     * Try to resolve ASENT using TVA caches.
     *
     * @return 0; LISTP answers of TVA-UNIFY format
     * @return 1; BOOLEANP -- Do we need to revert to the general method?
     * @unknown baxter
     */
    @LispMethod(comment = "Try to resolve ASENT using TVA caches.\r\n\r\n@return 0; LISTP answers of TVA-UNIFY format\r\n@return 1; BOOLEANP -- Do we need to revert to the general method?\r\n@unknown baxter")
    public static final SubLObject tva_unify_from_cache_alt(SubLObject asent, SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p) {
        if (return_one_answer_p == UNPROVIDED) {
            return_one_answer_p = NIL;
        }
        if (compute_justifications_p == UNPROVIDED) {
            compute_justifications_p = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject use_general_methodP = T;
                SubLObject answers = NIL;
                SubLObject arg0 = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject doneP = NIL;
                if (NIL != tva_cache.tva_cache_enabled_p()) {
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
                                {
                                    SubLObject index_argnum = ZERO_INTEGER;
                                    SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                                    SubLObject rest = NIL;
                                    for (rest = args; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject index_arg = rest.first();
                                            index_argnum = add(index_argnum, ONE_INTEGER);
                                            if ((NIL != variables.fully_bound_p(index_arg)) && (NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(arg0, index_argnum))) {
                                                {
                                                    SubLObject gather_arg = cycl_utilities.atomic_sentence_arg(asent, subtract(THREE_INTEGER, index_argnum), UNPROVIDED);
                                                    SubLObject alist = (NIL != variables.fully_bound_p(gather_arg)) ? ((SubLObject) (tva_cache.tva_cache_check_value(index_arg, arg0, index_argnum, gather_arg, symbol_function(EQUAL), compute_justifications_p))) : tva_cache.tva_cache_get_values(index_arg, arg0, index_argnum, compute_justifications_p);
                                                    {
                                                        SubLObject _prev_bind_0_68 = unification.$unify_return_justificationP$.currentBinding(thread);
                                                        try {
                                                            unification.$unify_return_justificationP$.bind(compute_justifications_p, thread);
                                                            {
                                                                SubLObject rest_69 = NIL;
                                                                for (rest_69 = alist; !((NIL != doneP) || (NIL == rest_69)); rest_69 = rest_69.rest()) {
                                                                    {
                                                                        SubLObject cons = rest_69.first();
                                                                        SubLObject datum = cons;
                                                                        SubLObject current = datum;
                                                                        SubLObject gather_arg_value = NIL;
                                                                        SubLObject supports = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt72);
                                                                        gather_arg_value = current.first();
                                                                        current = current.rest();
                                                                        supports = current;
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject v_bindings = unification_utilities.term_unify(gather_arg, gather_arg_value, T, UNPROVIDED);
                                                                            SubLObject justification = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            answers = cons(list(v_bindings, append(supports, justification)), answers);
                                                                            if ((NIL != variables.fully_bound_p(gather_arg)) && (NIL == compute_justifications_p)) {
                                                                                doneP = T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            unification.$unify_return_justificationP$.rebind(_prev_bind_0_68, thread);
                                                        }
                                                    }
                                                }
                                                use_general_methodP = NIL;
                                            }
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
                }
                return values(answers, use_general_methodP);
            }
        }
    }

    @LispMethod(comment = "Try to resolve ASENT using TVA caches.\r\n\r\n@return 0; LISTP answers of TVA-UNIFY format\r\n@return 1; BOOLEANP -- Do we need to revert to the general method?\r\n@unknown baxter")
    public static SubLObject tva_unify_from_cache(final SubLObject asent, final SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p) {
        if (return_one_answer_p == UNPROVIDED) {
            return_one_answer_p = NIL;
        }
        if (compute_justifications_p == UNPROVIDED) {
            compute_justifications_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject use_general_methodP = T;
        SubLObject answers = NIL;
        final SubLObject arg0 = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject doneP = NIL;
        if (NIL != tva_cache.tva_cache_enabled_p()) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                SubLObject index_argnum = ZERO_INTEGER;
                final SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject rest;
                SubLObject index_arg;
                SubLObject gather_arg;
                SubLObject alist;
                SubLObject _prev_bind_0_$66;
                SubLObject rest_$67;
                SubLObject cons;
                SubLObject current;
                SubLObject datum;
                SubLObject gather_arg_value;
                SubLObject supports;
                SubLObject v_bindings;
                SubLObject justification;
                for (rest = NIL, rest = args; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                    index_arg = rest.first();
                    index_argnum = add(index_argnum, ONE_INTEGER);
                    if ((NIL != variables.fully_bound_p(index_arg)) && (NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(arg0, index_argnum))) {
                        gather_arg = cycl_utilities.atomic_sentence_arg(asent, subtract(THREE_INTEGER, index_argnum), UNPROVIDED);
                        alist = (NIL != variables.fully_bound_p(gather_arg)) ? tva_cache.tva_cache_check_value(index_arg, arg0, index_argnum, gather_arg, symbol_function(EQUAL), compute_justifications_p) : tva_cache.tva_cache_get_values(index_arg, arg0, index_argnum, compute_justifications_p);
                        _prev_bind_0_$66 = unification.$unify_return_justificationP$.currentBinding(thread);
                        try {
                            unification.$unify_return_justificationP$.bind(compute_justifications_p, thread);
                            for (rest_$67 = NIL, rest_$67 = alist; (NIL == doneP) && (NIL != rest_$67); rest_$67 = rest_$67.rest()) {
                                cons = rest_$67.first();
                                datum = current = cons;
                                gather_arg_value = NIL;
                                supports = NIL;
                                destructuring_bind_must_consp(current, datum, $list76);
                                gather_arg_value = current.first();
                                current = supports = current.rest();
                                thread.resetMultipleValues();
                                v_bindings = unification_utilities.term_unify(gather_arg, gather_arg_value, T, UNPROVIDED);
                                justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                answers = cons(list(v_bindings, append(supports, justification)), answers);
                                if ((NIL != variables.fully_bound_p(gather_arg)) && (NIL == compute_justifications_p)) {
                                    doneP = T;
                                }
                            }
                        } finally {
                            unification.$unify_return_justificationP$.rebind(_prev_bind_0_$66, thread);
                        }
                        use_general_methodP = NIL;
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return values(answers, use_general_methodP);
    }/**
     * Try to resolve ASENT using TVA caches.
     *
     * @return 0; LISTP answers of TVA-UNIFY format
     * @return 1; BOOLEANP -- Do we need to revert to the general method?
     * @unknown baxter
     */


    /**
     * Return the transitve closures of TVA answers.  CLOSURE-MODE should be one of:
     * :none    - no closure
     * :focused - closure except in fan-out directions
     * :all     - all closures
     */
    @LispMethod(comment = "Return the transitve closures of TVA answers.  CLOSURE-MODE should be one of:\r\n:none    - no closure\r\n:focused - closure except in fan-out directions\r\n:all     - all closures\nReturn the transitve closures of TVA answers.  CLOSURE-MODE should be one of:\n:none    - no closure\n:focused - closure except in fan-out directions\n:all     - all closures")
    public static final SubLObject tva_unify_closure_alt(SubLObject answers, SubLObject closure_mode) {
        {
            SubLObject pcase_var = closure_mode;
            if (pcase_var.eql($NONE)) {
                return answers;
            } else {
                {
                    SubLObject closure = NIL;
                    SubLObject cdolist_list_var = answers;
                    SubLObject v_answer = NIL;
                    for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                        {
                            SubLObject datum = v_answer;
                            SubLObject current = datum;
                            SubLObject v_bindings = NIL;
                            SubLObject supports = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt73);
                            v_bindings = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt73);
                            supports = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject answer_closure = NIL;
                                    {
                                        SubLObject cdolist_list_var_70 = v_bindings;
                                        SubLObject binding = NIL;
                                        for (binding = cdolist_list_var_70.first(); NIL != cdolist_list_var_70; cdolist_list_var_70 = cdolist_list_var_70.rest() , binding = cdolist_list_var_70.first()) {
                                            {
                                                SubLObject var = bindings.variable_binding_variable(binding);
                                                SubLObject value = bindings.variable_binding_value(binding);
                                                SubLObject argnum = tva_var_argnum(var);
                                                SubLObject var_closure = list(binding);
                                                SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                                                SubLObject tva_pred = NIL;
                                                for (tva_pred = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , tva_pred = csome_list_var.first()) {
                                                    {
                                                        SubLObject direction = tva_utilities.tva_direction_to_ghl_closure_direction(tva_utilities.tva_direction_for_tva_pred(tva_pred));
                                                        SubLObject cdolist_list_var_71 = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, tva_asent_pred(), argnum, NIL);
                                                        SubLObject trans_pred = NIL;
                                                        for (trans_pred = cdolist_list_var_71.first(); NIL != cdolist_list_var_71; cdolist_list_var_71 = cdolist_list_var_71.rest() , trans_pred = cdolist_list_var_71.first()) {
                                                            if (!((closure_mode == $FOCUSED) && (direction == ghl_search_vars.ghl_fan_out_direction(trans_pred)))) {
                                                                {
                                                                    SubLObject cdolist_list_var_72 = ghl_search_methods.ghl_closure(trans_pred, value, direction, UNPROVIDED, UNPROVIDED);
                                                                    SubLObject node = NIL;
                                                                    for (node = cdolist_list_var_72.first(); NIL != cdolist_list_var_72; cdolist_list_var_72 = cdolist_list_var_72.rest() , node = cdolist_list_var_72.first()) {
                                                                        var_closure = cons(bindings.make_variable_binding(var, node), var_closure);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                answer_closure = cons(list_utilities.fast_delete_duplicates(var_closure, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), answer_closure);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var_73 = list_utilities.cartesian_product(nreverse(answer_closure), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject new_bindings = NIL;
                                        for (new_bindings = cdolist_list_var_73.first(); NIL != cdolist_list_var_73; cdolist_list_var_73 = cdolist_list_var_73.rest() , new_bindings = cdolist_list_var_73.first()) {
                                            closure = cons(list(new_bindings, supports), closure);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt73);
                            }
                        }
                    }
                    return list_utilities.fast_delete_duplicates(append(answers, closure), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    @LispMethod(comment = "Return the transitve closures of TVA answers.  CLOSURE-MODE should be one of:\r\n:none    - no closure\r\n:focused - closure except in fan-out directions\r\n:all     - all closures\nReturn the transitve closures of TVA answers.  CLOSURE-MODE should be one of:\n:none    - no closure\n:focused - closure except in fan-out directions\n:all     - all closures")
    public static SubLObject tva_unify_closure(final SubLObject answers, final SubLObject closure_mode) {
        if (closure_mode.eql($NONE)) {
            return answers;
        }
        SubLObject closure = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = v_answer;
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list77);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list77);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject answer_closure = NIL;
                SubLObject cdolist_list_var_$68 = v_bindings;
                SubLObject binding = NIL;
                binding = cdolist_list_var_$68.first();
                while (NIL != cdolist_list_var_$68) {
                    final SubLObject var = bindings.variable_binding_variable(binding);
                    final SubLObject value = bindings.variable_binding_value(binding);
                    final SubLObject argnum = tva_var_argnum(var);
                    SubLObject var_closure = list(binding);
                    SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                    SubLObject tva_pred = NIL;
                    tva_pred = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject direction = tva_utilities.tva_direction_to_ghl_closure_direction(tva_utilities.tva_direction_for_tva_pred(tva_pred));
                        SubLObject cdolist_list_var_$69 = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, tva_asent_pred(), argnum, NIL, UNPROVIDED);
                        SubLObject trans_pred = NIL;
                        trans_pred = cdolist_list_var_$69.first();
                        while (NIL != cdolist_list_var_$69) {
                            if ((closure_mode != $FOCUSED) || (!direction.eql(ghl_search_vars.ghl_fan_out_direction(trans_pred)))) {
                                SubLObject cdolist_list_var_$70 = ghl_search_methods.ghl_closure(trans_pred, value, direction, UNPROVIDED, UNPROVIDED);
                                SubLObject node = NIL;
                                node = cdolist_list_var_$70.first();
                                while (NIL != cdolist_list_var_$70) {
                                    var_closure = cons(bindings.make_variable_binding(var, node), var_closure);
                                    cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                                    node = cdolist_list_var_$70.first();
                                } 
                            }
                            cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                            trans_pred = cdolist_list_var_$69.first();
                        } 
                        csome_list_var = csome_list_var.rest();
                        tva_pred = csome_list_var.first();
                    } 
                    answer_closure = cons(list_utilities.fast_delete_duplicates(var_closure, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), answer_closure);
                    cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                    binding = cdolist_list_var_$68.first();
                } 
                SubLObject cdolist_list_var_$71 = list_utilities.cartesian_product(nreverse(answer_closure), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject new_bindings = NIL;
                new_bindings = cdolist_list_var_$71.first();
                while (NIL != cdolist_list_var_$71) {
                    closure = cons(list(new_bindings, supports), closure);
                    cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                    new_bindings = cdolist_list_var_$71.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list77);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(append(answers, closure), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Return the transitve closures of TVA answers.  CLOSURE-MODE should be one of:
     * :none    - no closure
     * :focused - closure except in fan-out directions
     * :all     - all closures
     */


    /**
     * Determines whether PRED has already been visited by a strategy subsuming the current one.
     */
    @LispMethod(comment = "Determines whether PRED has already been visited by a strategy subsuming the current one.")
    public static final SubLObject tva_marked_p_alt(SubLObject pred, SubLObject new_strategy) {
        {
            SubLObject subsumedP = NIL;
            if (NIL == subsumedP) {
                {
                    SubLObject csome_list_var = sbhl_marking_utilities.sbhl_marked_with(pred, UNPROVIDED);
                    SubLObject old_strategy = NIL;
                    for (old_strategy = csome_list_var.first(); !((NIL != subsumedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , old_strategy = csome_list_var.first()) {
                        if (NIL != tva_strategy.tva_strategy_subsumes_strategy_p(old_strategy, new_strategy)) {
                            subsumedP = T;
                        }
                    }
                }
            }
            return subsumedP;
        }
    }

    @LispMethod(comment = "Determines whether PRED has already been visited by a strategy subsuming the current one.")
    public static SubLObject tva_marked_p(final SubLObject pred, final SubLObject new_strategy) {
        SubLObject subsumedP = NIL;
        if (NIL == subsumedP) {
            SubLObject csome_list_var = sbhl_marking_utilities.sbhl_marked_with(pred, UNPROVIDED);
            SubLObject old_strategy = NIL;
            old_strategy = csome_list_var.first();
            while ((NIL == subsumedP) && (NIL != csome_list_var)) {
                if (NIL != tva_strategy.tva_strategy_subsumes_strategy_p(old_strategy, new_strategy)) {
                    subsumedP = T;
                }
                csome_list_var = csome_list_var.rest();
                old_strategy = csome_list_var.first();
            } 
        }
        return subsumedP;
    }/**
     * Determines whether PRED has already been visited by a strategy subsuming the current one.
     */


    /**
     * Marks PRED by adding a pair containing the current genl-inverse-mode and the current *tva-strategy* to the marking already on PRED.
     */
    @LispMethod(comment = "Marks PRED by adding a pair containing the current genl-inverse-mode and the current *tva-strategy* to the marking already on PRED.")
    public static final SubLObject tva_mark_node_marked_alt(SubLObject pred, SubLObject strategy) {
        sbhl_marking_utilities.prepend_to_sbhl_marking_state(pred, strategy, UNPROVIDED);
        return NIL;
    }

    @LispMethod(comment = "Marks PRED by adding a pair containing the current genl-inverse-mode and the current *tva-strategy* to the marking already on PRED.")
    public static SubLObject tva_mark_node_marked(final SubLObject pred, final SubLObject strategy) {
        sbhl_marking_utilities.prepend_to_sbhl_marking_state(pred, strategy, UNPROVIDED);
        return NIL;
    }/**
     * Marks PRED by adding a pair containing the current genl-inverse-mode and the current *tva-strategy* to the marking already on PRED.
     */


    /**
     * Workhorse recursive function that iterates over preds accessible to PRED, formulating and proceeding with new strategies along the way.
     */
    @LispMethod(comment = "Workhorse recursive function that iterates over preds accessible to PRED, formulating and proceeding with new strategies along the way.")
    public static final SubLObject tva_mark_and_sweep_alt(SubLObject pred, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $tva_max_time_enabledP$.getGlobalValue()) {
                if (NIL != inference_strategist.current_controlling_inference_max_time_reachedP()) {
                    sublisp_throw($TVA_MAX_TIME, T);
                }
            }
            {
                SubLObject flipped_modeP = makeBoolean(tva_strategy.tva_strategy_inverse_mode_p(strategy) != sbhl_search_vars.genl_inverse_mode_p());
                SubLObject new_strategy = tva_strategy.tva_restrategize(pred, strategy, flipped_modeP);
                if (NIL == tva_marked_p(pred, new_strategy)) {
                    tva_mark_node_marked(pred, new_strategy);
                    if (NIL != tva_strategy.tva_strategy_p(new_strategy)) {
                        add_to_tva_answers(tva_strategy.proceed_with_tva_strategy(new_strategy));
                    }
                    if ((NIL != tva_return_one_answerP()) && (NIL != tva_answers())) {
                        sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
                    }
                    if (NIL != tva_strategy.tva_strategy_p(new_strategy)) {
                        {
                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            SubLObject rest = NIL;
                            for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                                {
                                    SubLObject module_var = rest.first();
                                    {
                                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            {
                                                SubLObject node = function_terms.naut_to_nart(pred);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    {
                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    {
                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                        while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_74 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                            {
                                                                                                SubLObject iteration_state_75 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_75)))) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    {
                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_75);
                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_76 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject rest_77 = NIL;
                                                                                                                        for (rest_77 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_77)); rest_77 = rest_77.rest()) {
                                                                                                                            {
                                                                                                                                SubLObject link_pred = rest_77.first();
                                                                                                                                tva_mark_and_sweep(link_pred, new_strategy);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_76, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        iteration_state_75 = dictionary_contents.do_dictionary_contents_next(iteration_state_75);
                                                                                                    }
                                                                                                } 
                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_75);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_74, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                            }
                                                                        } 
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt69$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    }
                                                } else {
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        {
                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject rest_78 = NIL;
                                                            for (rest_78 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_78)); rest_78 = rest_78.rest()) {
                                                                {
                                                                    SubLObject generating_fn = rest_78.first();
                                                                    {
                                                                        SubLObject _prev_bind_0_79 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            {
                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                SubLObject new_list_80 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                SubLObject rest_81 = NIL;
                                                                                for (rest_81 = new_list_80; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_81)); rest_81 = rest_81.rest()) {
                                                                                    {
                                                                                        SubLObject link_pred = rest_81.first();
                                                                                        tva_mark_and_sweep(link_pred, new_strategy);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_79, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
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

    @LispMethod(comment = "Workhorse recursive function that iterates over preds accessible to PRED, formulating and proceeding with new strategies along the way.")
    public static SubLObject tva_mark_and_sweep(final SubLObject pred, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $tva_max_time_enabledP$.getGlobalValue()) && (NIL != inference_strategist.current_controlling_inference_max_time_reachedP())) {
            sublisp_throw($TVA_MAX_TIME, T);
        }
        final SubLObject flipped_modeP = makeBoolean(!tva_strategy.tva_strategy_inverse_mode_p(strategy).eql(sbhl_search_vars.genl_inverse_mode_p()));
        final SubLObject new_strategy = tva_strategy.tva_restrategize(pred, strategy, flipped_modeP);
        if (NIL == tva_marked_p(pred, new_strategy)) {
            tva_mark_node_marked(pred, new_strategy);
            if (NIL != tva_strategy.tva_strategy_p(new_strategy)) {
                add_to_tva_answers(tva_strategy.proceed_with_tva_strategy(new_strategy));
            }
            if ((NIL != tva_return_one_answerP()) && (NIL != tva_answers())) {
                sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
            }
            if (NIL != tva_strategy.tva_strategy_p(new_strategy)) {
                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject rest;
                SubLObject module_var;
                SubLObject _prev_bind_0;
                SubLObject _prev_bind_2;
                SubLObject node;
                SubLObject d_link;
                SubLObject mt_links;
                SubLObject iteration_state;
                SubLObject mt;
                SubLObject tv_links;
                SubLObject _prev_bind_0_$72;
                SubLObject iteration_state_$73;
                SubLObject tv;
                SubLObject link_nodes;
                SubLObject _prev_bind_0_$73;
                SubLObject sol;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_pred;
                SubLObject csome_list_var;
                SubLObject link_pred2;
                SubLObject new_list;
                SubLObject rest_$75;
                SubLObject generating_fn;
                SubLObject _prev_bind_0_$74;
                SubLObject sol2;
                SubLObject link_nodes2;
                SubLObject set_contents_var2;
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject link_pred3;
                SubLObject csome_list_var2;
                SubLObject link_pred4;
                for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                    module_var = rest.first();
                    _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        node = function_terms.naut_to_nart(pred);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            _prev_bind_0_$72 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                for (iteration_state_$73 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$73)); iteration_state_$73 = dictionary_contents.do_dictionary_contents_next(iteration_state_$73)) {
                                                    thread.resetMultipleValues();
                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$73);
                                                    link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                set_contents_var = set.do_set_internal(sol);
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_pred = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_pred)) {
                                                                        tva_mark_and_sweep(link_pred, new_strategy);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                        csome_list_var = sol;
                                                                        link_pred2 = NIL;
                                                                        link_pred2 = csome_list_var.first();
                                                                        while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                            tva_mark_and_sweep(link_pred2, new_strategy);
                                                                            csome_list_var = csome_list_var.rest();
                                                                            link_pred2 = csome_list_var.first();
                                                                        } 
                                                                    }
                                                                } else {
                                                                    Errors.error($str72$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$73, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$73);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$72, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str73$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                for (rest_$75 = NIL, rest_$75 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$75); rest_$75 = rest_$75.rest()) {
                                    generating_fn = rest_$75.first();
                                    _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                        if (NIL != set.set_p(sol2)) {
                                            set_contents_var2 = set.do_set_internal(sol2);
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_pred3)) {
                                                    tva_mark_and_sweep(link_pred3, new_strategy);
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                    csome_list_var2 = sol2;
                                                    link_pred4 = NIL;
                                                    link_pred4 = csome_list_var2.first();
                                                    while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                        tva_mark_and_sweep(link_pred4, new_strategy);
                                                        csome_list_var2 = csome_list_var2.rest();
                                                        link_pred4 = csome_list_var2.first();
                                                    } 
                                                }
                                            } else {
                                                Errors.error($str72$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$74, thread);
                                    }
                                }
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return NIL;
    }/**
     * Workhorse recursive function that iterates over preds accessible to PRED, formulating and proceeding with new strategies along the way.
     */


    public static final SubLObject tva_unify_closure_iterator_alt(SubLObject asent, SubLObject mt, SubLObject closure_mode) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (closure_mode == UNPROVIDED) {
            closure_mode = $NONE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iterator = NIL;
                SubLObject timed_outP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                            {
                                SubLObject _prev_bind_0_82 = $tva_inference$.currentBinding(thread);
                                try {
                                    $tva_inference$.bind(make_tva_inference(UNPROVIDED), thread);
                                    initialize_tva_inference(asent, NIL, NIL);
                                    try {
                                        {
                                            SubLObject strategy = tva_strategy.make_tva_default_strategy();
                                            {
                                                SubLObject _prev_bind_0_83 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                SubLObject _prev_bind_1_84 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                SubLObject _prev_bind_2_85 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                    {
                                                        SubLObject mt_var_86 = mt;
                                                        {
                                                            SubLObject _prev_bind_0_87 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_88 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_89 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_86), thread);
                                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_86), thread);
                                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_86), thread);
                                                                {
                                                                    SubLObject tv_var = NIL;
                                                                    {
                                                                        SubLObject _prev_bind_0_90 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_91 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                            if (NIL != tv_var) {
                                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                        {
                                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                            if (pcase_var.eql($ERROR)) {
                                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            } else {
                                                                                                if (pcase_var.eql($CERROR)) {
                                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                } else {
                                                                                                    if (pcase_var.eql($WARN)) {
                                                                                                        Errors.warn($str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                    } else {
                                                                                                        Errors.warn($str_alt61$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                        Errors.cerror($$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject _prev_bind_0_92 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_93 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_94 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                                    {
                                                                                        SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                                                        {
                                                                                            SubLObject _prev_bind_0_95 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_96 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_97 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_98 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_2_99 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_3_100 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_4_101 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                {
                                                                                                                    SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                                                    SubLObject needs_to_releaseP = NIL;
                                                                                                                    try {
                                                                                                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                                                        tva_mark_and_sweep(tva_asent_pred(), strategy);
                                                                                                                    } finally {
                                                                                                                        if (NIL != needs_to_releaseP) {
                                                                                                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_101, thread);
                                                                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_100, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_99, thread);
                                                                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_98, thread);
                                                                                                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_97, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        if (source == $RESOURCE) {
                                                                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_96, thread);
                                                                                                    }
                                                                                                }
                                                                                                if (source == $RESOURCE) {
                                                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_95, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_94, thread);
                                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_93, thread);
                                                                                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_92, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_91, thread);
                                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_90, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_89, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_88, thread);
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_87, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_85, thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_84, thread);
                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_83, thread);
                                                }
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        timed_outP = Errors.handleThrowable(ccatch_env_var, $TVA_MAX_TIME);
                                    }
                                    iterator = tva_unify_closure_iterator_int(list_utilities.fast_delete_duplicates(tva_answers(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), closure_mode);
                                } finally {
                                    $tva_inference$.rebind(_prev_bind_0_82, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0_102 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                                SubLObject _prev_bind_1_103 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                                SubLObject _prev_bind_2_104 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                                try {
                                    sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                    sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                                    sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($str_alt65$SKSI_SQL_statement_cache_))), thread);
                                    {
                                        SubLObject resourcing_caches_finalizedP = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_105 = $tva_inference$.currentBinding(thread);
                                                try {
                                                    $tva_inference$.bind(make_tva_inference(UNPROVIDED), thread);
                                                    initialize_tva_inference(asent, NIL, NIL);
                                                    try {
                                                        {
                                                            SubLObject strategy = tva_strategy.make_tva_default_strategy();
                                                            {
                                                                SubLObject _prev_bind_0_106 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_107 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_108 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                    {
                                                                        SubLObject mt_var_109 = mt;
                                                                        {
                                                                            SubLObject _prev_bind_0_110 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_111 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_112 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                            try {
                                                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_109), thread);
                                                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_109), thread);
                                                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_109), thread);
                                                                                {
                                                                                    SubLObject tv_var = NIL;
                                                                                    {
                                                                                        SubLObject _prev_bind_0_113 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_114 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                                            if (NIL != tv_var) {
                                                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                        {
                                                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                                            if (pcase_var.eql($ERROR)) {
                                                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            } else {
                                                                                                                if (pcase_var.eql($CERROR)) {
                                                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                } else {
                                                                                                                    if (pcase_var.eql($WARN)) {
                                                                                                                        Errors.warn($str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                    } else {
                                                                                                                        Errors.warn($str_alt61$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                                        Errors.cerror($$$continue_anyway, $str_alt56$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject _prev_bind_0_115 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_116 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_2_117 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                                                    {
                                                                                                        SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_118 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_119 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_120 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                                                            SubLObject _prev_bind_1_121 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                                                            SubLObject _prev_bind_2_122 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                                            SubLObject _prev_bind_3_123 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                                                            SubLObject _prev_bind_4_124 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                                {
                                                                                                                                    SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                                                                    SubLObject needs_to_releaseP = NIL;
                                                                                                                                    try {
                                                                                                                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                                                                        tva_mark_and_sweep(tva_asent_pred(), strategy);
                                                                                                                                    } finally {
                                                                                                                                        if (NIL != needs_to_releaseP) {
                                                                                                                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_124, thread);
                                                                                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_123, thread);
                                                                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_122, thread);
                                                                                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_121, thread);
                                                                                                                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_120, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (source == $RESOURCE) {
                                                                                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_119, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (source == $RESOURCE) {
                                                                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_118, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_117, thread);
                                                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_116, thread);
                                                                                                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_115, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_114, thread);
                                                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_113, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_112, thread);
                                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_111, thread);
                                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_110, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_108, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_107, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_106, thread);
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable ccatch_env_var) {
                                                        timed_outP = Errors.handleThrowable(ccatch_env_var, $TVA_MAX_TIME);
                                                    }
                                                    iterator = tva_unify_closure_iterator_int(list_utilities.fast_delete_duplicates(tva_answers(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), closure_mode);
                                                } finally {
                                                    $tva_inference$.rebind(_prev_bind_0_105, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_125 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    try {
                                                        resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_126 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL == resourcing_caches_finalizedP) {
                                                                    sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_126, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_125, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2_104, thread);
                                    sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_103, thread);
                                    sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_102, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return iterator;
            }
        }
    }

    public static SubLObject tva_unify_closure_iterator(final SubLObject asent, SubLObject mt, SubLObject closure_mode) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (closure_mode == UNPROVIDED) {
            closure_mode = $NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = NIL;
        SubLObject timed_outP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                final SubLObject _prev_bind_0_$77 = $tva_inference$.currentBinding(thread);
                try {
                    $tva_inference$.bind(make_tva_inference(UNPROVIDED), thread);
                    initialize_tva_inference(asent, NIL, NIL);
                    try {
                        thread.throwStack.push($TVA_MAX_TIME);
                        final SubLObject strategy = tva_strategy.make_tva_default_strategy();
                        final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$80 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            final SubLObject mt_var_$81 = mt;
                            final SubLObject _prev_bind_0_$79 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$80 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$81 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$81), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$81), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$81), thread);
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$82 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                        final SubLObject _prev_bind_0_$82 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                            final SubLObject _prev_bind_0_$83 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                final SubLObject _prev_bind_0_$84 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$83 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$83 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                final SubLObject _prev_bind_3_$95 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                final SubLObject _prev_bind_4_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                    SubLObject needs_to_releaseP = NIL;
                                                    try {
                                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                        tva_mark_and_sweep(tva_asent_pred(), strategy);
                                                    } finally {
                                                        if (NIL != needs_to_releaseP) {
                                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$96, thread);
                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$95, thread);
                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$83, thread);
                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$83, thread);
                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$84, thread);
                                                }
                                                if (source == $RESOURCE) {
                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$83, thread);
                                            }
                                            if (source == $RESOURCE) {
                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$82, thread);
                                        }
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$82, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$82, thread);
                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$81, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$81, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$80, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$81, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$80, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$79, thread);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$80, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$79, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$78, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        timed_outP = Errors.handleThrowable(ccatch_env_var, $TVA_MAX_TIME);
                    } finally {
                        thread.throwStack.pop();
                    }
                    iterator = tva_unify_closure_iterator_int(list_utilities.fast_delete_duplicates(tva_answers(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), closure_mode);
                } finally {
                    $tva_inference$.rebind(_prev_bind_0_$77, thread);
                }
            } else {
                final SubLObject _prev_bind_0_$85 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                final SubLObject _prev_bind_1_$84 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                final SubLObject _prev_bind_2_$84 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                try {
                    sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($$$SKSI_SQL_statement_cache_))), thread);
                    SubLObject resourcing_caches_finalizedP = NIL;
                    try {
                        final SubLObject _prev_bind_0_$86 = $tva_inference$.currentBinding(thread);
                        try {
                            $tva_inference$.bind(make_tva_inference(UNPROVIDED), thread);
                            initialize_tva_inference(asent, NIL, NIL);
                            try {
                                thread.throwStack.push($TVA_MAX_TIME);
                                final SubLObject strategy2 = tva_strategy.make_tva_default_strategy();
                                final SubLObject _prev_bind_0_$87 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$85 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$85 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    final SubLObject mt_var_$82 = mt;
                                    final SubLObject _prev_bind_0_$88 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$86 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$86 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$82), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$82), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$82), thread);
                                        final SubLObject tv_var2 = NIL;
                                        final SubLObject _prev_bind_0_$89 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var2 ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var2 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                            if (((NIL != tv_var2) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2))) {
                                                final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                if (pcase_var2.eql($ERROR)) {
                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str59$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var2.eql($CERROR)) {
                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str59$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if (pcase_var2.eql($WARN)) {
                                                            Errors.warn($str59$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                                        } else {
                                                            Errors.warn($str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                            Errors.cerror($$$continue_anyway, $str59$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                                        }


                                            }
                                            final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$87 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                final SubLObject source2 = sbhl_marking_vars.sbhl_new_space_source();
                                                final SubLObject _prev_bind_0_$91 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space$.bind(source2 == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source2), thread);
                                                    final SubLObject _prev_bind_0_$92 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_gather_space$.bind(source2 == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source2), thread);
                                                        final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$89 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$88 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                        final SubLObject _prev_bind_3_$96 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                        final SubLObject _prev_bind_4_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                            sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            final SubLObject rw_lock_var2 = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                            SubLObject needs_to_releaseP2 = NIL;
                                                            try {
                                                                needs_to_releaseP2 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var2);
                                                                tva_mark_and_sweep(tva_asent_pred(), strategy2);
                                                            } finally {
                                                                if (NIL != needs_to_releaseP2) {
                                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var2);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$97, thread);
                                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$96, thread);
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$88, thread);
                                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$89, thread);
                                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$93, thread);
                                                        }
                                                        if (source2 == $RESOURCE) {
                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$92, thread);
                                                    }
                                                    if (source2 == $RESOURCE) {
                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$91, thread);
                                                }
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$87, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$88, thread);
                                                sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$90, thread);
                                            }
                                        } finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$87, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$89, thread);
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$86, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$86, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$88, thread);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$85, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$85, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$87, thread);
                                }
                            } catch (final Throwable ccatch_env_var2) {
                                timed_outP = Errors.handleThrowable(ccatch_env_var2, $TVA_MAX_TIME);
                            } finally {
                                thread.throwStack.pop();
                            }
                            iterator = tva_unify_closure_iterator_int(list_utilities.fast_delete_duplicates(tva_answers(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), closure_mode);
                        } finally {
                            $tva_inference$.rebind(_prev_bind_0_$86, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            try {
                                resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                            } finally {
                                final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values_$122 = getValuesAsVector();
                                    if (NIL == resourcing_caches_finalizedP) {
                                        sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                    }
                                    restoreValuesFromVector(_values_$122);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                                }
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                        }
                    }
                } finally {
                    sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2_$84, thread);
                    sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$84, thread);
                    sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$85, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return iterator;
    }

    public static final SubLObject tva_unify_closure_iterator_int_alt(SubLObject tva_answers, SubLObject closure_mode) {
        return $NONE == closure_mode ? ((SubLObject) (iteration.new_list_iterator(tva_answers))) : iteration.new_iterator(tva_unify_closure_iterator_state(tva_answers, closure_mode), TVA_UNIFY_CLOSURE_ITERATOR_DONE, TVA_UNIFY_CLOSURE_ITERATOR_NEXT, TVA_UNIFY_CLOSURE_ITERATOR_FINALIZE);
    }

    public static SubLObject tva_unify_closure_iterator_int(final SubLObject tva_answers, final SubLObject closure_mode) {
        return $NONE == closure_mode ? iteration.new_list_iterator(tva_answers) : iteration.new_iterator(tva_unify_closure_iterator_state(tva_answers, closure_mode), TVA_UNIFY_CLOSURE_ITERATOR_DONE, TVA_UNIFY_CLOSURE_ITERATOR_NEXT, TVA_UNIFY_CLOSURE_ITERATOR_FINALIZE);
    }

    public static final SubLObject tva_unify_closure_iterator_state_alt(SubLObject tva_answers, SubLObject closure_mode) {
        {
            SubLObject var_pred_direction = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = tva_var_argnums();
            SubLObject var_argnum = NIL;
            for (var_argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_argnum = cdolist_list_var.first()) {
                {
                    SubLObject datum = var_argnum;
                    SubLObject current = datum;
                    SubLObject var = NIL;
                    SubLObject argnum = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt78);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt78);
                    argnum = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                            SubLObject tva_pred = NIL;
                            for (tva_pred = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , tva_pred = csome_list_var.first()) {
                                {
                                    SubLObject direction = tva_utilities.tva_direction_to_ghl_closure_direction(tva_utilities.tva_direction_for_tva_pred(tva_pred));
                                    SubLObject cdolist_list_var_127 = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, tva_asent_pred(), argnum, NIL);
                                    SubLObject trans_pred = NIL;
                                    for (trans_pred = cdolist_list_var_127.first(); NIL != cdolist_list_var_127; cdolist_list_var_127 = cdolist_list_var_127.rest() , trans_pred = cdolist_list_var_127.first()) {
                                        if (!((closure_mode == $FOCUSED) && (direction == ghl_search_vars.ghl_fan_out_direction(trans_pred)))) {
                                            dictionary_utilities.dictionary_pushnew(var_pred_direction, var, list(trans_pred, direction), symbol_function(EQUAL), UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt78);
                    }
                }
            }
            return list(NIL, tva_answers, var_pred_direction);
        }
    }

    public static SubLObject tva_unify_closure_iterator_state(final SubLObject tva_answers, final SubLObject closure_mode) {
        final SubLObject var_pred_direction = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = tva_var_argnums();
        SubLObject var_argnum = NIL;
        var_argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = var_argnum;
            SubLObject var = NIL;
            SubLObject argnum = NIL;
            destructuring_bind_must_consp(current, datum, $list82);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list82);
            argnum = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                SubLObject tva_pred = NIL;
                tva_pred = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject direction = tva_utilities.tva_direction_to_ghl_closure_direction(tva_utilities.tva_direction_for_tva_pred(tva_pred));
                    SubLObject cdolist_list_var_$123 = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, tva_asent_pred(), argnum, NIL, UNPROVIDED);
                    SubLObject trans_pred = NIL;
                    trans_pred = cdolist_list_var_$123.first();
                    while (NIL != cdolist_list_var_$123) {
                        if ((closure_mode != $FOCUSED) || (!direction.eql(ghl_search_vars.ghl_fan_out_direction(trans_pred)))) {
                            dictionary_utilities.dictionary_pushnew(var_pred_direction, var, list(trans_pred, direction), symbol_function(EQUAL), UNPROVIDED);
                        }
                        cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                        trans_pred = cdolist_list_var_$123.first();
                    } 
                    csome_list_var = csome_list_var.rest();
                    tva_pred = csome_list_var.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list82);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var_argnum = cdolist_list_var.first();
        } 
        return list(NIL, tva_answers, var_pred_direction);
    }

    public static final SubLObject tva_unify_closure_iterator_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject iterator = NIL;
            SubLObject tva_answers = NIL;
            SubLObject var_pred_direction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            tva_answers = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            var_pred_direction = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((NIL == tva_answers) && ((NIL == iterator) || (NIL != iteration.iteration_done(iterator))));
            } else {
                cdestructuring_bind_error(datum, $list_alt79);
            }
        }
        return NIL;
    }

    public static SubLObject tva_unify_closure_iterator_done(final SubLObject state) {
        SubLObject iterator = NIL;
        SubLObject tva_answers = NIL;
        SubLObject var_pred_direction = NIL;
        destructuring_bind_must_consp(state, state, $list83);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list83);
        tva_answers = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list83);
        var_pred_direction = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL == tva_answers) && ((NIL == iterator) || (NIL != iteration.iteration_done(iterator))));
        }
        cdestructuring_bind_error(state, $list83);
        return NIL;
    }

    public static final SubLObject tva_unify_closure_iterator_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject iterator = NIL;
            SubLObject tva_answers = NIL;
            SubLObject var_pred_direction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            tva_answers = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            var_pred_direction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject result = NIL;
                    SubLObject doneP = NIL;
                    while (!((NIL != result) || (NIL != doneP))) {
                        if (NIL == iterator) {
                            iterator = new_tva_unify_closure_answer_iterator(tva_answers.first(), var_pred_direction);
                            set_nth(ZERO_INTEGER, state, iterator);
                            set_nth(ONE_INTEGER, state, tva_answers.rest());
                            if (NIL == iteration.iterator_p(iterator)) {
                                doneP = T;
                            }
                        } else {
                            if (NIL != iteration.iteration_done(iterator)) {
                                iterator = NIL;
                                set_nth(ZERO_INTEGER, state, NIL);
                            } else {
                                result = iteration.iteration_next_without_values(iterator, UNPROVIDED);
                            }
                        }
                    } 
                    return values(result, state, sublisp_null(result));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt79);
            }
        }
        return NIL;
    }

    public static SubLObject tva_unify_closure_iterator_next(final SubLObject state) {
        SubLObject iterator = NIL;
        SubLObject tva_answers = NIL;
        SubLObject var_pred_direction = NIL;
        destructuring_bind_must_consp(state, state, $list83);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list83);
        tva_answers = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list83);
        var_pred_direction = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject result = NIL;
            SubLObject doneP = NIL;
            while ((NIL == result) && (NIL == doneP)) {
                if (NIL == iterator) {
                    iterator = new_tva_unify_closure_answer_iterator(tva_answers.first(), var_pred_direction);
                    set_nth(ZERO_INTEGER, state, iterator);
                    set_nth(ONE_INTEGER, state, tva_answers.rest());
                    if (NIL != iteration.iterator_p(iterator)) {
                        continue;
                    }
                    doneP = T;
                } else
                    if (NIL != iteration.iteration_done(iterator)) {
                        iterator = NIL;
                        set_nth(ZERO_INTEGER, state, NIL);
                    } else {
                        result = iteration.iteration_next_without_values(iterator, UNPROVIDED);
                    }

            } 
            return values(result, state, sublisp_null(result));
        }
        cdestructuring_bind_error(state, $list83);
        return NIL;
    }

    public static final SubLObject tva_unify_closure_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject iterator = NIL;
            SubLObject tva_answers = NIL;
            SubLObject var_pred_direction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            tva_answers = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            var_pred_direction = current.first();
            current = current.rest();
            if (NIL == current) {
                dictionary.clear_dictionary(var_pred_direction);
                if (NIL != iterator) {
                    iteration.iteration_finalize(iterator);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt79);
            }
        }
        return T;
    }

    public static SubLObject tva_unify_closure_iterator_finalize(final SubLObject state) {
        SubLObject iterator = NIL;
        SubLObject tva_answers = NIL;
        SubLObject var_pred_direction = NIL;
        destructuring_bind_must_consp(state, state, $list83);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list83);
        tva_answers = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list83);
        var_pred_direction = current.first();
        current = current.rest();
        if (NIL == current) {
            dictionary.clear_dictionary(var_pred_direction);
            if (NIL != iterator) {
                iteration.iteration_finalize(iterator);
            }
        } else {
            cdestructuring_bind_error(state, $list83);
        }
        return T;
    }

    public static final SubLObject new_tva_unify_closure_answer_iterator_alt(SubLObject tva_answer, SubLObject var_pred_direction) {
        {
            SubLObject datum = tva_answer;
            SubLObject current = datum;
            SubLObject v_bindings = NIL;
            SubLObject support = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt80);
            support = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject iterators = new_tva_unify_closure_bindings_iterators(v_bindings, var_pred_direction);
                    return iteration.new_reusable_iterator_cartesian_iterator(iterators);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt80);
            }
        }
        return NIL;
    }

    public static SubLObject new_tva_unify_closure_answer_iterator(final SubLObject tva_answer, final SubLObject var_pred_direction) {
        SubLObject v_bindings = NIL;
        SubLObject support = NIL;
        destructuring_bind_must_consp(tva_answer, tva_answer, $list84);
        v_bindings = tva_answer.first();
        SubLObject current = tva_answer.rest();
        destructuring_bind_must_consp(current, tva_answer, $list84);
        support = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject iterators = new_tva_unify_closure_bindings_iterators(v_bindings, var_pred_direction);
            return iteration.new_reusable_iterator_cartesian_iterator(iterators);
        }
        cdestructuring_bind_error(tva_answer, $list84);
        return NIL;
    }

    public static final SubLObject new_tva_unify_closure_bindings_iterators_alt(SubLObject v_bindings, SubLObject var_pred_direction) {
        {
            SubLObject iterators = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject var = bindings.variable_binding_variable(binding);
                    SubLObject value = bindings.variable_binding_value(binding);
                    SubLObject var_iterators = NIL;
                    SubLObject cdolist_list_var_128 = dictionary.dictionary_lookup_without_values(var_pred_direction, var, UNPROVIDED);
                    SubLObject pred_direction = NIL;
                    for (pred_direction = cdolist_list_var_128.first(); NIL != cdolist_list_var_128; cdolist_list_var_128 = cdolist_list_var_128.rest() , pred_direction = cdolist_list_var_128.first()) {
                        {
                            SubLObject datum = pred_direction;
                            SubLObject current = datum;
                            SubLObject pred = NIL;
                            SubLObject direction = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt81);
                            pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt81);
                            direction = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject closure_iterator = ghl_search_methods.new_ghl_closure_iterator(pred, value, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject bindings_iterator = new_tva_unify_closure_var_bindings_iterator(var, closure_iterator);
                                    var_iterators = cons(bindings_iterator, var_iterators);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt81);
                            }
                        }
                    }
                    var_iterators = cons(iteration.new_singleton_iterator(binding), var_iterators);
                    {
                        SubLObject var_iterator_iterator = iteration.new_rotating_iterator_iterator(var_iterators);
                        SubLObject var_reusable_iterator = iteration.new_reusable_iterator_from_iterator(var_iterator_iterator);
                        iterators = cons(var_reusable_iterator, iterators);
                    }
                }
            }
            return nreverse(iterators);
        }
    }

    public static SubLObject new_tva_unify_closure_bindings_iterators(final SubLObject v_bindings, final SubLObject var_pred_direction) {
        SubLObject iterators = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = bindings.variable_binding_variable(binding);
            final SubLObject value = bindings.variable_binding_value(binding);
            SubLObject var_iterators = NIL;
            SubLObject cdolist_list_var_$124 = dictionary.dictionary_lookup_without_values(var_pred_direction, var, UNPROVIDED);
            SubLObject pred_direction = NIL;
            pred_direction = cdolist_list_var_$124.first();
            while (NIL != cdolist_list_var_$124) {
                SubLObject current;
                final SubLObject datum = current = pred_direction;
                SubLObject pred = NIL;
                SubLObject direction = NIL;
                destructuring_bind_must_consp(current, datum, $list85);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list85);
                direction = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject closure_iterator = ghl_search_methods.new_ghl_closure_iterator(pred, value, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject bindings_iterator = new_tva_unify_closure_var_bindings_iterator(var, closure_iterator);
                    var_iterators = cons(bindings_iterator, var_iterators);
                } else {
                    cdestructuring_bind_error(datum, $list85);
                }
                cdolist_list_var_$124 = cdolist_list_var_$124.rest();
                pred_direction = cdolist_list_var_$124.first();
            } 
            var_iterators = cons(iteration.new_singleton_iterator(binding), var_iterators);
            final SubLObject var_iterator_iterator = iteration.new_rotating_iterator_iterator(var_iterators);
            final SubLObject var_reusable_iterator = iteration.new_reusable_iterator_from_iterator(var_iterator_iterator);
            iterators = cons(var_reusable_iterator, iterators);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(iterators);
    }

    public static final SubLObject new_tva_unify_closure_var_bindings_iterator_alt(SubLObject var, SubLObject iterator) {
        return iteration.new_iterator(list(var, iterator), TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_DONE, TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_NEXT, TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_FINALIZE);
    }

    public static SubLObject new_tva_unify_closure_var_bindings_iterator(final SubLObject var, final SubLObject iterator) {
        return iteration.new_iterator(list(var, iterator), TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_DONE, TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_NEXT, TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_FINALIZE);
    }

    public static final SubLObject tva_unify_closure_var_bindings_iterator_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject iterator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            iterator = current.first();
            current = current.rest();
            if (NIL == current) {
                return iteration.iteration_done(iterator);
            } else {
                cdestructuring_bind_error(datum, $list_alt85);
            }
        }
        return NIL;
    }

    public static SubLObject tva_unify_closure_var_bindings_iterator_done(final SubLObject state) {
        SubLObject var = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(state, state, $list89);
        var = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list89);
        iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(iterator);
        }
        cdestructuring_bind_error(state, $list89);
        return NIL;
    }

    public static final SubLObject tva_unify_closure_var_bindings_iterator_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject iterator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            iterator = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject value = iteration.iteration_next_without_values(iterator, UNPROVIDED);
                    return NIL != value ? ((SubLObject) (values(bindings.make_variable_binding(var, value), state, NIL))) : values(NIL, state, T);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt85);
            }
        }
        return NIL;
    }

    public static SubLObject tva_unify_closure_var_bindings_iterator_next(final SubLObject state) {
        SubLObject var = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(state, state, $list89);
        var = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list89);
        iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject value = iteration.iteration_next_without_values(iterator, UNPROVIDED);
            return NIL != value ? values(bindings.make_variable_binding(var, value), state, NIL) : values(NIL, state, T);
        }
        cdestructuring_bind_error(state, $list89);
        return NIL;
    }

    public static final SubLObject tva_unify_closure_var_bindings_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject iterator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            iterator = current.first();
            current = current.rest();
            if (NIL == current) {
                return iteration.iteration_finalize(iterator);
            } else {
                cdestructuring_bind_error(datum, $list_alt85);
            }
        }
        return NIL;
    }

    public static SubLObject tva_unify_closure_var_bindings_iterator_finalize(final SubLObject state) {
        SubLObject var = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(state, state, $list89);
        var = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list89);
        iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(iterator);
        }
        cdestructuring_bind_error(state, $list89);
        return NIL;
    }

    public static final SubLObject declare_tva_inference_file_alt() {
        declareFunction("tva_inference_print_function_trampoline", "TVA-INFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tva_inference_p", "TVA-INFERENCE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.tva_inference.$tva_inference_p$UnaryFunction();
        declareFunction("tva_inf_problem", "TVA-INF-PROBLEM", 1, 0, false);
        declareFunction("tva_inf_asent_pred", "TVA-INF-ASENT-PRED", 1, 0, false);
        declareFunction("tva_inf_asent_args", "TVA-INF-ASENT-ARGS", 1, 0, false);
        declareFunction("tva_inf_args_admitted", "TVA-INF-ARGS-ADMITTED", 1, 0, false);
        declareFunction("tva_inf_term_argnums", "TVA-INF-TERM-ARGNUMS", 1, 0, false);
        declareFunction("tva_inf_var_argnums", "TVA-INF-VAR-ARGNUMS", 1, 0, false);
        declareFunction("tva_inf_precomputations", "TVA-INF-PRECOMPUTATIONS", 1, 0, false);
        declareFunction("tva_inf_reused_spaces", "TVA-INF-REUSED-SPACES", 1, 0, false);
        declareFunction("tva_inf_one_answerP", "TVA-INF-ONE-ANSWER?", 1, 0, false);
        declareFunction("tva_inf_justifyP", "TVA-INF-JUSTIFY?", 1, 0, false);
        declareFunction("tva_inf_restricted_assertion", "TVA-INF-RESTRICTED-ASSERTION", 1, 0, false);
        declareFunction("tva_inf_answers", "TVA-INF-ANSWERS", 1, 0, false);
        declareFunction("_csetf_tva_inf_problem", "_CSETF-TVA-INF-PROBLEM", 2, 0, false);
        declareFunction("_csetf_tva_inf_asent_pred", "_CSETF-TVA-INF-ASENT-PRED", 2, 0, false);
        declareFunction("_csetf_tva_inf_asent_args", "_CSETF-TVA-INF-ASENT-ARGS", 2, 0, false);
        declareFunction("_csetf_tva_inf_args_admitted", "_CSETF-TVA-INF-ARGS-ADMITTED", 2, 0, false);
        declareFunction("_csetf_tva_inf_term_argnums", "_CSETF-TVA-INF-TERM-ARGNUMS", 2, 0, false);
        declareFunction("_csetf_tva_inf_var_argnums", "_CSETF-TVA-INF-VAR-ARGNUMS", 2, 0, false);
        declareFunction("_csetf_tva_inf_precomputations", "_CSETF-TVA-INF-PRECOMPUTATIONS", 2, 0, false);
        declareFunction("_csetf_tva_inf_reused_spaces", "_CSETF-TVA-INF-REUSED-SPACES", 2, 0, false);
        declareFunction("_csetf_tva_inf_one_answerP", "_CSETF-TVA-INF-ONE-ANSWER?", 2, 0, false);
        declareFunction("_csetf_tva_inf_justifyP", "_CSETF-TVA-INF-JUSTIFY?", 2, 0, false);
        declareFunction("_csetf_tva_inf_restricted_assertion", "_CSETF-TVA-INF-RESTRICTED-ASSERTION", 2, 0, false);
        declareFunction("_csetf_tva_inf_answers", "_CSETF-TVA-INF-ANSWERS", 2, 0, false);
        declareFunction("make_tva_inference", "MAKE-TVA-INFERENCE", 0, 1, false);
        declareFunction("print_tva_inference", "PRINT-TVA-INFERENCE", 3, 0, false);
        declareFunction("initialize_tva_inference", "INITIALIZE-TVA-INFERENCE", 3, 0, false);
        declareFunction("tva_inference_asent_pred", "TVA-INFERENCE-ASENT-PRED", 1, 0, false);
        declareFunction("tva_inference_asent_args", "TVA-INFERENCE-ASENT-ARGS", 1, 0, false);
        declareFunction("tva_inference_args_admitted", "TVA-INFERENCE-ARGS-ADMITTED", 1, 0, false);
        declareFunction("tva_inference_term_argnums", "TVA-INFERENCE-TERM-ARGNUMS", 1, 0, false);
        declareFunction("tva_inference_var_argnums", "TVA-INFERENCE-VAR-ARGNUMS", 1, 0, false);
        declareFunction("tva_inference_precomputations", "TVA-INFERENCE-PRECOMPUTATIONS", 1, 0, false);
        declareFunction("tva_inference_reused_spaces", "TVA-INFERENCE-REUSED-SPACES", 1, 0, false);
        declareFunction("tva_inference_justifyP", "TVA-INFERENCE-JUSTIFY?", 1, 0, false);
        declareFunction("tva_inference_one_answerP", "TVA-INFERENCE-ONE-ANSWER?", 1, 0, false);
        declareFunction("tva_inference_restricted_assertion", "TVA-INFERENCE-RESTRICTED-ASSERTION", 1, 0, false);
        declareFunction("tva_inference_answers", "TVA-INFERENCE-ANSWERS", 1, 0, false);
        declareFunction("tva_inference_asent_arg", "TVA-INFERENCE-ASENT-ARG", 2, 0, false);
        declareFunction("tva_inference_arg_admitted", "TVA-INFERENCE-ARG-ADMITTED", 2, 0, false);
        declareFunction("store_tva_inference_precomputation", "STORE-TVA-INFERENCE-PRECOMPUTATION", 3, 0, false);
        declareFunction("store_tva_inference_reused_spaces", "STORE-TVA-INFERENCE-REUSED-SPACES", 3, 0, false);
        declareFunction("set_tva_inference_arg_admitted", "SET-TVA-INFERENCE-ARG-ADMITTED", 3, 0, false);
        declareMacro("with_new_tva_inference", "WITH-NEW-TVA-INFERENCE");
        declareFunction("tva_asent_pred", "TVA-ASENT-PRED", 0, 0, false);
        declareFunction("tva_var_argnums", "TVA-VAR-ARGNUMS", 0, 0, false);
        declareFunction("tva_var_argnum", "TVA-VAR-ARGNUM", 1, 0, false);
        declareFunction("tva_term_argnums", "TVA-TERM-ARGNUMS", 0, 0, false);
        declareFunction("tva_asent_arg", "TVA-ASENT-ARG", 1, 0, false);
        declareFunction("tva_asent_arg_admitted", "TVA-ASENT-ARG-ADMITTED", 1, 0, false);
        declareFunction("set_tva_asent_arg_admitted", "SET-TVA-ASENT-ARG-ADMITTED", 1, 0, false);
        declareFunction("set_tva_asent_arg_failed", "SET-TVA-ASENT-ARG-FAILED", 1, 0, false);
        declareFunction("tva_return_one_answerP", "TVA-RETURN-ONE-ANSWER?", 0, 0, false);
        declareFunction("tva_compute_justificationsP", "TVA-COMPUTE-JUSTIFICATIONS?", 0, 0, false);
        declareFunction("tva_tactic_precomputations", "TVA-TACTIC-PRECOMPUTATIONS", 1, 0, false);
        declareFunction("tva_store_precomputation", "TVA-STORE-PRECOMPUTATION", 2, 0, false);
        declareFunction("tva_restricted_assertion_p", "TVA-RESTRICTED-ASSERTION-P", 1, 0, false);
        declareFunction("tva_reused_spaces", "TVA-REUSED-SPACES", 0, 0, false);
        declareFunction("tva_store_reused_spaces", "TVA-STORE-REUSED-SPACES", 2, 0, false);
        declareFunction("tva_reused_spaces_for_relation", "TVA-REUSED-SPACES-FOR-RELATION", 2, 0, false);
        declareFunction("tva_answers", "TVA-ANSWERS", 0, 0, false);
        declareFunction("add_to_tva_answers", "ADD-TO-TVA-ANSWERS", 1, 0, false);
        declareFunction("determine_term_argnums", "DETERMINE-TERM-ARGNUMS", 1, 0, false);
        declareFunction("determine_var_argnums", "DETERMINE-VAR-ARGNUMS", 1, 0, false);
        declareFunction("determine_restricted_assertion", "DETERMINE-RESTRICTED-ASSERTION", 1, 0, false);
        declareFunction("initialize_tva_asent_vector", "INITIALIZE-TVA-ASENT-VECTOR", 1, 0, false);
        declareFunction("initialize_tva_args_admitted_vector", "INITIALIZE-TVA-ARGS-ADMITTED-VECTOR", 1, 0, false);
        declareFunction("tva_unify", "TVA-UNIFY", 1, 5, false);
        declareFunction("tva_unify_from_cache", "TVA-UNIFY-FROM-CACHE", 2, 2, false);
        declareFunction("tva_unify_closure", "TVA-UNIFY-CLOSURE", 2, 0, false);
        declareFunction("tva_marked_p", "TVA-MARKED-P", 2, 0, false);
        declareFunction("tva_mark_node_marked", "TVA-MARK-NODE-MARKED", 2, 0, false);
        declareFunction("tva_mark_and_sweep", "TVA-MARK-AND-SWEEP", 2, 0, false);
        declareFunction("tva_unify_closure_iterator", "TVA-UNIFY-CLOSURE-ITERATOR", 1, 2, false);
        declareFunction("tva_unify_closure_iterator_int", "TVA-UNIFY-CLOSURE-ITERATOR-INT", 2, 0, false);
        declareFunction("tva_unify_closure_iterator_state", "TVA-UNIFY-CLOSURE-ITERATOR-STATE", 2, 0, false);
        declareFunction("tva_unify_closure_iterator_done", "TVA-UNIFY-CLOSURE-ITERATOR-DONE", 1, 0, false);
        declareFunction("tva_unify_closure_iterator_next", "TVA-UNIFY-CLOSURE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("tva_unify_closure_iterator_finalize", "TVA-UNIFY-CLOSURE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_tva_unify_closure_answer_iterator", "NEW-TVA-UNIFY-CLOSURE-ANSWER-ITERATOR", 2, 0, false);
        declareFunction("new_tva_unify_closure_bindings_iterators", "NEW-TVA-UNIFY-CLOSURE-BINDINGS-ITERATORS", 2, 0, false);
        declareFunction("new_tva_unify_closure_var_bindings_iterator", "NEW-TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR", 2, 0, false);
        declareFunction("tva_unify_closure_var_bindings_iterator_done", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-DONE", 1, 0, false);
        declareFunction("tva_unify_closure_var_bindings_iterator_next", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-NEXT", 1, 0, false);
        declareFunction("tva_unify_closure_var_bindings_iterator_finalize", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-FINALIZE", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_tva_inference_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("tva_inference_print_function_trampoline", "TVA-INFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("tva_inference_p", "TVA-INFERENCE-P", 1, 0, false);
            new tva_inference.$tva_inference_p$UnaryFunction();
            declareFunction("tva_inf_problem", "TVA-INF-PROBLEM", 1, 0, false);
            declareFunction("tva_inf_asent_pred", "TVA-INF-ASENT-PRED", 1, 0, false);
            declareFunction("tva_inf_asent_args", "TVA-INF-ASENT-ARGS", 1, 0, false);
            declareFunction("tva_inf_args_admitted", "TVA-INF-ARGS-ADMITTED", 1, 0, false);
            declareFunction("tva_inf_term_argnums", "TVA-INF-TERM-ARGNUMS", 1, 0, false);
            declareFunction("tva_inf_var_argnums", "TVA-INF-VAR-ARGNUMS", 1, 0, false);
            declareFunction("tva_inf_precomputations", "TVA-INF-PRECOMPUTATIONS", 1, 0, false);
            declareFunction("tva_inf_reused_spaces", "TVA-INF-REUSED-SPACES", 1, 0, false);
            declareFunction("tva_inf_one_answerP", "TVA-INF-ONE-ANSWER?", 1, 0, false);
            declareFunction("tva_inf_justifyP", "TVA-INF-JUSTIFY?", 1, 0, false);
            declareFunction("tva_inf_restricted_assertion", "TVA-INF-RESTRICTED-ASSERTION", 1, 0, false);
            declareFunction("tva_inf_answers", "TVA-INF-ANSWERS", 1, 0, false);
            declareFunction("_csetf_tva_inf_problem", "_CSETF-TVA-INF-PROBLEM", 2, 0, false);
            declareFunction("_csetf_tva_inf_asent_pred", "_CSETF-TVA-INF-ASENT-PRED", 2, 0, false);
            declareFunction("_csetf_tva_inf_asent_args", "_CSETF-TVA-INF-ASENT-ARGS", 2, 0, false);
            declareFunction("_csetf_tva_inf_args_admitted", "_CSETF-TVA-INF-ARGS-ADMITTED", 2, 0, false);
            declareFunction("_csetf_tva_inf_term_argnums", "_CSETF-TVA-INF-TERM-ARGNUMS", 2, 0, false);
            declareFunction("_csetf_tva_inf_var_argnums", "_CSETF-TVA-INF-VAR-ARGNUMS", 2, 0, false);
            declareFunction("_csetf_tva_inf_precomputations", "_CSETF-TVA-INF-PRECOMPUTATIONS", 2, 0, false);
            declareFunction("_csetf_tva_inf_reused_spaces", "_CSETF-TVA-INF-REUSED-SPACES", 2, 0, false);
            declareFunction("_csetf_tva_inf_one_answerP", "_CSETF-TVA-INF-ONE-ANSWER?", 2, 0, false);
            declareFunction("_csetf_tva_inf_justifyP", "_CSETF-TVA-INF-JUSTIFY?", 2, 0, false);
            declareFunction("_csetf_tva_inf_restricted_assertion", "_CSETF-TVA-INF-RESTRICTED-ASSERTION", 2, 0, false);
            declareFunction("_csetf_tva_inf_answers", "_CSETF-TVA-INF-ANSWERS", 2, 0, false);
            declareFunction("make_tva_inference", "MAKE-TVA-INFERENCE", 0, 1, false);
            declareFunction("visit_defstruct_tva_inference", "VISIT-DEFSTRUCT-TVA-INFERENCE", 2, 0, false);
            declareFunction("visit_defstruct_object_tva_inference_method", "VISIT-DEFSTRUCT-OBJECT-TVA-INFERENCE-METHOD", 2, 0, false);
            declareFunction("print_tva_inference", "PRINT-TVA-INFERENCE", 3, 0, false);
            declareFunction("initialize_tva_inference", "INITIALIZE-TVA-INFERENCE", 3, 0, false);
            declareFunction("tva_inference_asent_pred", "TVA-INFERENCE-ASENT-PRED", 1, 0, false);
            declareFunction("tva_inference_asent_args", "TVA-INFERENCE-ASENT-ARGS", 1, 0, false);
            declareFunction("tva_inference_args_admitted", "TVA-INFERENCE-ARGS-ADMITTED", 1, 0, false);
            declareFunction("tva_inference_term_argnums", "TVA-INFERENCE-TERM-ARGNUMS", 1, 0, false);
            declareFunction("tva_inference_var_argnums", "TVA-INFERENCE-VAR-ARGNUMS", 1, 0, false);
            declareFunction("tva_inference_precomputations", "TVA-INFERENCE-PRECOMPUTATIONS", 1, 0, false);
            declareFunction("tva_inference_reused_spaces", "TVA-INFERENCE-REUSED-SPACES", 1, 0, false);
            declareFunction("tva_inference_justifyP", "TVA-INFERENCE-JUSTIFY?", 1, 0, false);
            declareFunction("tva_inference_one_answerP", "TVA-INFERENCE-ONE-ANSWER?", 1, 0, false);
            declareFunction("tva_inference_restricted_assertion", "TVA-INFERENCE-RESTRICTED-ASSERTION", 1, 0, false);
            declareFunction("tva_inference_answers", "TVA-INFERENCE-ANSWERS", 1, 0, false);
            declareFunction("tva_inference_asent_arg", "TVA-INFERENCE-ASENT-ARG", 2, 0, false);
            declareFunction("tva_inference_arg_admitted", "TVA-INFERENCE-ARG-ADMITTED", 2, 0, false);
            declareFunction("store_tva_inference_precomputation", "STORE-TVA-INFERENCE-PRECOMPUTATION", 3, 0, false);
            declareFunction("store_tva_inference_reused_spaces", "STORE-TVA-INFERENCE-REUSED-SPACES", 3, 0, false);
            declareFunction("set_tva_inference_arg_admitted", "SET-TVA-INFERENCE-ARG-ADMITTED", 3, 0, false);
            declareMacro("with_new_tva_inference", "WITH-NEW-TVA-INFERENCE");
            declareFunction("tva_asent_pred", "TVA-ASENT-PRED", 0, 0, false);
            declareFunction("tva_var_argnums", "TVA-VAR-ARGNUMS", 0, 0, false);
            declareFunction("tva_var_argnum", "TVA-VAR-ARGNUM", 1, 0, false);
            declareFunction("tva_term_argnums", "TVA-TERM-ARGNUMS", 0, 0, false);
            declareFunction("tva_asent_arg", "TVA-ASENT-ARG", 1, 0, false);
            declareFunction("tva_asent_arg_admitted", "TVA-ASENT-ARG-ADMITTED", 1, 0, false);
            declareFunction("set_tva_asent_arg_admitted", "SET-TVA-ASENT-ARG-ADMITTED", 1, 0, false);
            declareFunction("set_tva_asent_arg_failed", "SET-TVA-ASENT-ARG-FAILED", 1, 0, false);
            declareFunction("tva_return_one_answerP", "TVA-RETURN-ONE-ANSWER?", 0, 0, false);
            declareFunction("tva_compute_justificationsP", "TVA-COMPUTE-JUSTIFICATIONS?", 0, 0, false);
            declareFunction("tva_tactic_precomputations", "TVA-TACTIC-PRECOMPUTATIONS", 1, 0, false);
            declareFunction("tva_store_precomputation", "TVA-STORE-PRECOMPUTATION", 2, 0, false);
            declareFunction("tva_restricted_assertion_p", "TVA-RESTRICTED-ASSERTION-P", 1, 0, false);
            declareFunction("tva_reused_spaces", "TVA-REUSED-SPACES", 0, 0, false);
            declareFunction("tva_store_reused_spaces", "TVA-STORE-REUSED-SPACES", 2, 0, false);
            declareFunction("tva_reused_spaces_for_relation", "TVA-REUSED-SPACES-FOR-RELATION", 2, 0, false);
            declareFunction("tva_answers", "TVA-ANSWERS", 0, 0, false);
            declareFunction("add_to_tva_answers", "ADD-TO-TVA-ANSWERS", 1, 0, false);
            declareFunction("determine_term_argnums", "DETERMINE-TERM-ARGNUMS", 1, 0, false);
            declareFunction("determine_var_argnums", "DETERMINE-VAR-ARGNUMS", 1, 0, false);
            declareFunction("determine_restricted_assertion", "DETERMINE-RESTRICTED-ASSERTION", 1, 0, false);
            declareFunction("initialize_tva_asent_vector", "INITIALIZE-TVA-ASENT-VECTOR", 1, 0, false);
            declareFunction("initialize_tva_args_admitted_vector", "INITIALIZE-TVA-ARGS-ADMITTED-VECTOR", 1, 0, false);
            declareFunction("tva_unify", "TVA-UNIFY", 1, 6, false);
            declareFunction("tva_unify_from_cache", "TVA-UNIFY-FROM-CACHE", 2, 2, false);
            declareFunction("tva_unify_closure", "TVA-UNIFY-CLOSURE", 2, 0, false);
            declareFunction("tva_marked_p", "TVA-MARKED-P", 2, 0, false);
            declareFunction("tva_mark_node_marked", "TVA-MARK-NODE-MARKED", 2, 0, false);
            declareFunction("tva_mark_and_sweep", "TVA-MARK-AND-SWEEP", 2, 0, false);
            declareFunction("tva_unify_closure_iterator", "TVA-UNIFY-CLOSURE-ITERATOR", 1, 2, false);
            declareFunction("tva_unify_closure_iterator_int", "TVA-UNIFY-CLOSURE-ITERATOR-INT", 2, 0, false);
            declareFunction("tva_unify_closure_iterator_state", "TVA-UNIFY-CLOSURE-ITERATOR-STATE", 2, 0, false);
            declareFunction("tva_unify_closure_iterator_done", "TVA-UNIFY-CLOSURE-ITERATOR-DONE", 1, 0, false);
            declareFunction("tva_unify_closure_iterator_next", "TVA-UNIFY-CLOSURE-ITERATOR-NEXT", 1, 0, false);
            declareFunction("tva_unify_closure_iterator_finalize", "TVA-UNIFY-CLOSURE-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("new_tva_unify_closure_answer_iterator", "NEW-TVA-UNIFY-CLOSURE-ANSWER-ITERATOR", 2, 0, false);
            declareFunction("new_tva_unify_closure_bindings_iterators", "NEW-TVA-UNIFY-CLOSURE-BINDINGS-ITERATORS", 2, 0, false);
            declareFunction("new_tva_unify_closure_var_bindings_iterator", "NEW-TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR", 2, 0, false);
            declareFunction("tva_unify_closure_var_bindings_iterator_done", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-DONE", 1, 0, false);
            declareFunction("tva_unify_closure_var_bindings_iterator_next", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-NEXT", 1, 0, false);
            declareFunction("tva_unify_closure_var_bindings_iterator_finalize", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-FINALIZE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("tva_unify", "TVA-UNIFY", 1, 5, false);
        }
        return NIL;
    }

    public static SubLObject declare_tva_inference_file_Previous() {
        declareFunction("tva_inference_print_function_trampoline", "TVA-INFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tva_inference_p", "TVA-INFERENCE-P", 1, 0, false);
        new tva_inference.$tva_inference_p$UnaryFunction();
        declareFunction("tva_inf_problem", "TVA-INF-PROBLEM", 1, 0, false);
        declareFunction("tva_inf_asent_pred", "TVA-INF-ASENT-PRED", 1, 0, false);
        declareFunction("tva_inf_asent_args", "TVA-INF-ASENT-ARGS", 1, 0, false);
        declareFunction("tva_inf_args_admitted", "TVA-INF-ARGS-ADMITTED", 1, 0, false);
        declareFunction("tva_inf_term_argnums", "TVA-INF-TERM-ARGNUMS", 1, 0, false);
        declareFunction("tva_inf_var_argnums", "TVA-INF-VAR-ARGNUMS", 1, 0, false);
        declareFunction("tva_inf_precomputations", "TVA-INF-PRECOMPUTATIONS", 1, 0, false);
        declareFunction("tva_inf_reused_spaces", "TVA-INF-REUSED-SPACES", 1, 0, false);
        declareFunction("tva_inf_one_answerP", "TVA-INF-ONE-ANSWER?", 1, 0, false);
        declareFunction("tva_inf_justifyP", "TVA-INF-JUSTIFY?", 1, 0, false);
        declareFunction("tva_inf_restricted_assertion", "TVA-INF-RESTRICTED-ASSERTION", 1, 0, false);
        declareFunction("tva_inf_answers", "TVA-INF-ANSWERS", 1, 0, false);
        declareFunction("_csetf_tva_inf_problem", "_CSETF-TVA-INF-PROBLEM", 2, 0, false);
        declareFunction("_csetf_tva_inf_asent_pred", "_CSETF-TVA-INF-ASENT-PRED", 2, 0, false);
        declareFunction("_csetf_tva_inf_asent_args", "_CSETF-TVA-INF-ASENT-ARGS", 2, 0, false);
        declareFunction("_csetf_tva_inf_args_admitted", "_CSETF-TVA-INF-ARGS-ADMITTED", 2, 0, false);
        declareFunction("_csetf_tva_inf_term_argnums", "_CSETF-TVA-INF-TERM-ARGNUMS", 2, 0, false);
        declareFunction("_csetf_tva_inf_var_argnums", "_CSETF-TVA-INF-VAR-ARGNUMS", 2, 0, false);
        declareFunction("_csetf_tva_inf_precomputations", "_CSETF-TVA-INF-PRECOMPUTATIONS", 2, 0, false);
        declareFunction("_csetf_tva_inf_reused_spaces", "_CSETF-TVA-INF-REUSED-SPACES", 2, 0, false);
        declareFunction("_csetf_tva_inf_one_answerP", "_CSETF-TVA-INF-ONE-ANSWER?", 2, 0, false);
        declareFunction("_csetf_tva_inf_justifyP", "_CSETF-TVA-INF-JUSTIFY?", 2, 0, false);
        declareFunction("_csetf_tva_inf_restricted_assertion", "_CSETF-TVA-INF-RESTRICTED-ASSERTION", 2, 0, false);
        declareFunction("_csetf_tva_inf_answers", "_CSETF-TVA-INF-ANSWERS", 2, 0, false);
        declareFunction("make_tva_inference", "MAKE-TVA-INFERENCE", 0, 1, false);
        declareFunction("visit_defstruct_tva_inference", "VISIT-DEFSTRUCT-TVA-INFERENCE", 2, 0, false);
        declareFunction("visit_defstruct_object_tva_inference_method", "VISIT-DEFSTRUCT-OBJECT-TVA-INFERENCE-METHOD", 2, 0, false);
        declareFunction("print_tva_inference", "PRINT-TVA-INFERENCE", 3, 0, false);
        declareFunction("initialize_tva_inference", "INITIALIZE-TVA-INFERENCE", 3, 0, false);
        declareFunction("tva_inference_asent_pred", "TVA-INFERENCE-ASENT-PRED", 1, 0, false);
        declareFunction("tva_inference_asent_args", "TVA-INFERENCE-ASENT-ARGS", 1, 0, false);
        declareFunction("tva_inference_args_admitted", "TVA-INFERENCE-ARGS-ADMITTED", 1, 0, false);
        declareFunction("tva_inference_term_argnums", "TVA-INFERENCE-TERM-ARGNUMS", 1, 0, false);
        declareFunction("tva_inference_var_argnums", "TVA-INFERENCE-VAR-ARGNUMS", 1, 0, false);
        declareFunction("tva_inference_precomputations", "TVA-INFERENCE-PRECOMPUTATIONS", 1, 0, false);
        declareFunction("tva_inference_reused_spaces", "TVA-INFERENCE-REUSED-SPACES", 1, 0, false);
        declareFunction("tva_inference_justifyP", "TVA-INFERENCE-JUSTIFY?", 1, 0, false);
        declareFunction("tva_inference_one_answerP", "TVA-INFERENCE-ONE-ANSWER?", 1, 0, false);
        declareFunction("tva_inference_restricted_assertion", "TVA-INFERENCE-RESTRICTED-ASSERTION", 1, 0, false);
        declareFunction("tva_inference_answers", "TVA-INFERENCE-ANSWERS", 1, 0, false);
        declareFunction("tva_inference_asent_arg", "TVA-INFERENCE-ASENT-ARG", 2, 0, false);
        declareFunction("tva_inference_arg_admitted", "TVA-INFERENCE-ARG-ADMITTED", 2, 0, false);
        declareFunction("store_tva_inference_precomputation", "STORE-TVA-INFERENCE-PRECOMPUTATION", 3, 0, false);
        declareFunction("store_tva_inference_reused_spaces", "STORE-TVA-INFERENCE-REUSED-SPACES", 3, 0, false);
        declareFunction("set_tva_inference_arg_admitted", "SET-TVA-INFERENCE-ARG-ADMITTED", 3, 0, false);
        declareMacro("with_new_tva_inference", "WITH-NEW-TVA-INFERENCE");
        declareFunction("tva_asent_pred", "TVA-ASENT-PRED", 0, 0, false);
        declareFunction("tva_var_argnums", "TVA-VAR-ARGNUMS", 0, 0, false);
        declareFunction("tva_var_argnum", "TVA-VAR-ARGNUM", 1, 0, false);
        declareFunction("tva_term_argnums", "TVA-TERM-ARGNUMS", 0, 0, false);
        declareFunction("tva_asent_arg", "TVA-ASENT-ARG", 1, 0, false);
        declareFunction("tva_asent_arg_admitted", "TVA-ASENT-ARG-ADMITTED", 1, 0, false);
        declareFunction("set_tva_asent_arg_admitted", "SET-TVA-ASENT-ARG-ADMITTED", 1, 0, false);
        declareFunction("set_tva_asent_arg_failed", "SET-TVA-ASENT-ARG-FAILED", 1, 0, false);
        declareFunction("tva_return_one_answerP", "TVA-RETURN-ONE-ANSWER?", 0, 0, false);
        declareFunction("tva_compute_justificationsP", "TVA-COMPUTE-JUSTIFICATIONS?", 0, 0, false);
        declareFunction("tva_tactic_precomputations", "TVA-TACTIC-PRECOMPUTATIONS", 1, 0, false);
        declareFunction("tva_store_precomputation", "TVA-STORE-PRECOMPUTATION", 2, 0, false);
        declareFunction("tva_restricted_assertion_p", "TVA-RESTRICTED-ASSERTION-P", 1, 0, false);
        declareFunction("tva_reused_spaces", "TVA-REUSED-SPACES", 0, 0, false);
        declareFunction("tva_store_reused_spaces", "TVA-STORE-REUSED-SPACES", 2, 0, false);
        declareFunction("tva_reused_spaces_for_relation", "TVA-REUSED-SPACES-FOR-RELATION", 2, 0, false);
        declareFunction("tva_answers", "TVA-ANSWERS", 0, 0, false);
        declareFunction("add_to_tva_answers", "ADD-TO-TVA-ANSWERS", 1, 0, false);
        declareFunction("determine_term_argnums", "DETERMINE-TERM-ARGNUMS", 1, 0, false);
        declareFunction("determine_var_argnums", "DETERMINE-VAR-ARGNUMS", 1, 0, false);
        declareFunction("determine_restricted_assertion", "DETERMINE-RESTRICTED-ASSERTION", 1, 0, false);
        declareFunction("initialize_tva_asent_vector", "INITIALIZE-TVA-ASENT-VECTOR", 1, 0, false);
        declareFunction("initialize_tva_args_admitted_vector", "INITIALIZE-TVA-ARGS-ADMITTED-VECTOR", 1, 0, false);
        declareFunction("tva_unify", "TVA-UNIFY", 1, 6, false);
        declareFunction("tva_unify_from_cache", "TVA-UNIFY-FROM-CACHE", 2, 2, false);
        declareFunction("tva_unify_closure", "TVA-UNIFY-CLOSURE", 2, 0, false);
        declareFunction("tva_marked_p", "TVA-MARKED-P", 2, 0, false);
        declareFunction("tva_mark_node_marked", "TVA-MARK-NODE-MARKED", 2, 0, false);
        declareFunction("tva_mark_and_sweep", "TVA-MARK-AND-SWEEP", 2, 0, false);
        declareFunction("tva_unify_closure_iterator", "TVA-UNIFY-CLOSURE-ITERATOR", 1, 2, false);
        declareFunction("tva_unify_closure_iterator_int", "TVA-UNIFY-CLOSURE-ITERATOR-INT", 2, 0, false);
        declareFunction("tva_unify_closure_iterator_state", "TVA-UNIFY-CLOSURE-ITERATOR-STATE", 2, 0, false);
        declareFunction("tva_unify_closure_iterator_done", "TVA-UNIFY-CLOSURE-ITERATOR-DONE", 1, 0, false);
        declareFunction("tva_unify_closure_iterator_next", "TVA-UNIFY-CLOSURE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("tva_unify_closure_iterator_finalize", "TVA-UNIFY-CLOSURE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_tva_unify_closure_answer_iterator", "NEW-TVA-UNIFY-CLOSURE-ANSWER-ITERATOR", 2, 0, false);
        declareFunction("new_tva_unify_closure_bindings_iterators", "NEW-TVA-UNIFY-CLOSURE-BINDINGS-ITERATORS", 2, 0, false);
        declareFunction("new_tva_unify_closure_var_bindings_iterator", "NEW-TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR", 2, 0, false);
        declareFunction("tva_unify_closure_var_bindings_iterator_done", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-DONE", 1, 0, false);
        declareFunction("tva_unify_closure_var_bindings_iterator_next", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-NEXT", 1, 0, false);
        declareFunction("tva_unify_closure_var_bindings_iterator_finalize", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-FINALIZE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_tva_inference_file() {
        deflexical("*TVA-MAX-TIME-ENABLED?*", T);
        defconstant("*DTP-TVA-INFERENCE*", TVA_INFERENCE);
        defparameter("*TVA-INFERENCE*", NIL);
        defparameter("*TVA-REUSE-SPACES?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_tva_inference_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tva_inference$.getGlobalValue(), symbol_function(TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TVA_INF_PROBLEM, _CSETF_TVA_INF_PROBLEM);
        def_csetf(TVA_INF_ASENT_PRED, _CSETF_TVA_INF_ASENT_PRED);
        def_csetf(TVA_INF_ASENT_ARGS, _CSETF_TVA_INF_ASENT_ARGS);
        def_csetf(TVA_INF_ARGS_ADMITTED, _CSETF_TVA_INF_ARGS_ADMITTED);
        def_csetf(TVA_INF_TERM_ARGNUMS, _CSETF_TVA_INF_TERM_ARGNUMS);
        def_csetf(TVA_INF_VAR_ARGNUMS, _CSETF_TVA_INF_VAR_ARGNUMS);
        def_csetf(TVA_INF_PRECOMPUTATIONS, _CSETF_TVA_INF_PRECOMPUTATIONS);
        def_csetf(TVA_INF_REUSED_SPACES, _CSETF_TVA_INF_REUSED_SPACES);
        def_csetf($sym24$TVA_INF_ONE_ANSWER_, $sym25$_CSETF_TVA_INF_ONE_ANSWER_);
        def_csetf($sym26$TVA_INF_JUSTIFY_, $sym27$_CSETF_TVA_INF_JUSTIFY_);
        def_csetf(TVA_INF_RESTRICTED_ASSERTION, _CSETF_TVA_INF_RESTRICTED_ASSERTION);
        def_csetf(TVA_INF_ANSWERS, _CSETF_TVA_INF_ANSWERS);
        identity(TVA_INFERENCE);
        return NIL;
    }

    public static SubLObject setup_tva_inference_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_tva_inference$.getGlobalValue(), symbol_function(TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(TVA_INF_PROBLEM, _CSETF_TVA_INF_PROBLEM);
            def_csetf(TVA_INF_ASENT_PRED, _CSETF_TVA_INF_ASENT_PRED);
            def_csetf(TVA_INF_ASENT_ARGS, _CSETF_TVA_INF_ASENT_ARGS);
            def_csetf(TVA_INF_ARGS_ADMITTED, _CSETF_TVA_INF_ARGS_ADMITTED);
            def_csetf(TVA_INF_TERM_ARGNUMS, _CSETF_TVA_INF_TERM_ARGNUMS);
            def_csetf(TVA_INF_VAR_ARGNUMS, _CSETF_TVA_INF_VAR_ARGNUMS);
            def_csetf(TVA_INF_PRECOMPUTATIONS, _CSETF_TVA_INF_PRECOMPUTATIONS);
            def_csetf(TVA_INF_REUSED_SPACES, _CSETF_TVA_INF_REUSED_SPACES);
            def_csetf($sym25$TVA_INF_ONE_ANSWER_, $sym26$_CSETF_TVA_INF_ONE_ANSWER_);
            def_csetf($sym27$TVA_INF_JUSTIFY_, $sym28$_CSETF_TVA_INF_JUSTIFY_);
            def_csetf(TVA_INF_RESTRICTED_ASSERTION, _CSETF_TVA_INF_RESTRICTED_ASSERTION);
            def_csetf(TVA_INF_ANSWERS, _CSETF_TVA_INF_ANSWERS);
            identity(TVA_INFERENCE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tva_inference$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TVA_INFERENCE_METHOD));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym24$TVA_INF_ONE_ANSWER_, $sym25$_CSETF_TVA_INF_ONE_ANSWER_);
            def_csetf($sym26$TVA_INF_JUSTIFY_, $sym27$_CSETF_TVA_INF_JUSTIFY_);
        }
        return NIL;
    }

    public static SubLObject setup_tva_inference_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tva_inference$.getGlobalValue(), symbol_function(TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(TVA_INF_PROBLEM, _CSETF_TVA_INF_PROBLEM);
        def_csetf(TVA_INF_ASENT_PRED, _CSETF_TVA_INF_ASENT_PRED);
        def_csetf(TVA_INF_ASENT_ARGS, _CSETF_TVA_INF_ASENT_ARGS);
        def_csetf(TVA_INF_ARGS_ADMITTED, _CSETF_TVA_INF_ARGS_ADMITTED);
        def_csetf(TVA_INF_TERM_ARGNUMS, _CSETF_TVA_INF_TERM_ARGNUMS);
        def_csetf(TVA_INF_VAR_ARGNUMS, _CSETF_TVA_INF_VAR_ARGNUMS);
        def_csetf(TVA_INF_PRECOMPUTATIONS, _CSETF_TVA_INF_PRECOMPUTATIONS);
        def_csetf(TVA_INF_REUSED_SPACES, _CSETF_TVA_INF_REUSED_SPACES);
        def_csetf($sym25$TVA_INF_ONE_ANSWER_, $sym26$_CSETF_TVA_INF_ONE_ANSWER_);
        def_csetf($sym27$TVA_INF_JUSTIFY_, $sym28$_CSETF_TVA_INF_JUSTIFY_);
        def_csetf(TVA_INF_RESTRICTED_ASSERTION, _CSETF_TVA_INF_RESTRICTED_ASSERTION);
        def_csetf(TVA_INF_ANSWERS, _CSETF_TVA_INF_ANSWERS);
        identity(TVA_INFERENCE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tva_inference$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TVA_INFERENCE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_tva_inference_file();
    }

    @Override
    public void initializeVariables() {
        init_tva_inference_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tva_inference_file();
    }

    static {
    }

    public static final class $tva_inference_native extends SubLStructNative {
        public SubLObject $problem;

        public SubLObject $asent_pred;

        public SubLObject $asent_args;

        public SubLObject $args_admitted;

        public SubLObject $term_argnums;

        public SubLObject $var_argnums;

        public SubLObject $precomputations;

        public SubLObject $reused_spaces;

        public SubLObject $one_answerP;

        public SubLObject $justifyP;

        public SubLObject $restricted_assertion;

        public SubLObject $answers;

        private static final SubLStructDeclNative structDecl;

        public $tva_inference_native() {
            tva_inference.$tva_inference_native.this.$problem = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$asent_pred = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$asent_args = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$args_admitted = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$term_argnums = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$var_argnums = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$precomputations = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$reused_spaces = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$one_answerP = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$justifyP = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$restricted_assertion = Lisp.NIL;
            tva_inference.$tva_inference_native.this.$answers = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return tva_inference.$tva_inference_native.this.$problem;
        }

        @Override
        public SubLObject getField3() {
            return tva_inference.$tva_inference_native.this.$asent_pred;
        }

        @Override
        public SubLObject getField4() {
            return tva_inference.$tva_inference_native.this.$asent_args;
        }

        @Override
        public SubLObject getField5() {
            return tva_inference.$tva_inference_native.this.$args_admitted;
        }

        @Override
        public SubLObject getField6() {
            return tva_inference.$tva_inference_native.this.$term_argnums;
        }

        @Override
        public SubLObject getField7() {
            return tva_inference.$tva_inference_native.this.$var_argnums;
        }

        @Override
        public SubLObject getField8() {
            return tva_inference.$tva_inference_native.this.$precomputations;
        }

        @Override
        public SubLObject getField9() {
            return tva_inference.$tva_inference_native.this.$reused_spaces;
        }

        @Override
        public SubLObject getField10() {
            return tva_inference.$tva_inference_native.this.$one_answerP;
        }

        @Override
        public SubLObject getField11() {
            return tva_inference.$tva_inference_native.this.$justifyP;
        }

        @Override
        public SubLObject getField12() {
            return tva_inference.$tva_inference_native.this.$restricted_assertion;
        }

        @Override
        public SubLObject getField13() {
            return tva_inference.$tva_inference_native.this.$answers;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$problem = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$asent_pred = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$asent_args = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$args_admitted = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$term_argnums = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$var_argnums = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$precomputations = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$reused_spaces = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$one_answerP = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$justifyP = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$restricted_assertion = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return tva_inference.$tva_inference_native.this.$answers = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.tva_inference.$tva_inference_native.class, TVA_INFERENCE, TVA_INFERENCE_P, $list2, $list3, new String[]{ "$problem", "$asent_pred", "$asent_args", "$args_admitted", "$term_argnums", "$var_argnums", "$precomputations", "$reused_spaces", "$one_answerP", "$justifyP", "$restricted_assertion", "$answers" }, $list4, $list5, PRINT_TVA_INFERENCE);
        }
    }

    public static final class $tva_inference_p$UnaryFunction extends UnaryFunction {
        public $tva_inference_p$UnaryFunction() {
            super(extractFunctionNamed("TVA-INFERENCE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tva_inference_p(arg1);
        }
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("PROBLEM"), makeSymbol("ASENT-PRED"), makeSymbol("ASENT-ARGS"), makeSymbol("ARGS-ADMITTED"), makeSymbol("TERM-ARGNUMS"), makeSymbol("VAR-ARGNUMS"), makeSymbol("PRECOMPUTATIONS"), makeSymbol("REUSED-SPACES"), makeSymbol("ONE-ANSWER?"), makeSymbol("JUSTIFY?"), makeSymbol("RESTRICTED-ASSERTION"), makeSymbol("ANSWERS") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("PROBLEM"), makeKeyword("ASENT-PRED"), makeKeyword("ASENT-ARGS"), makeKeyword("ARGS-ADMITTED"), makeKeyword("TERM-ARGNUMS"), makeKeyword("VAR-ARGNUMS"), makeKeyword("PRECOMPUTATIONS"), makeKeyword("REUSED-SPACES"), makeKeyword("ONE-ANSWER?"), makeKeyword("JUSTIFY?"), makeKeyword("RESTRICTED-ASSERTION"), makeKeyword("ANSWERS") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("TVA-INF-PROBLEM"), makeSymbol("TVA-INF-ASENT-PRED"), makeSymbol("TVA-INF-ASENT-ARGS"), makeSymbol("TVA-INF-ARGS-ADMITTED"), makeSymbol("TVA-INF-TERM-ARGNUMS"), makeSymbol("TVA-INF-VAR-ARGNUMS"), makeSymbol("TVA-INF-PRECOMPUTATIONS"), makeSymbol("TVA-INF-REUSED-SPACES"), makeSymbol("TVA-INF-ONE-ANSWER?"), makeSymbol("TVA-INF-JUSTIFY?"), makeSymbol("TVA-INF-RESTRICTED-ASSERTION"), makeSymbol("TVA-INF-ANSWERS") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-TVA-INF-PROBLEM"), makeSymbol("_CSETF-TVA-INF-ASENT-PRED"), makeSymbol("_CSETF-TVA-INF-ASENT-ARGS"), makeSymbol("_CSETF-TVA-INF-ARGS-ADMITTED"), makeSymbol("_CSETF-TVA-INF-TERM-ARGNUMS"), makeSymbol("_CSETF-TVA-INF-VAR-ARGNUMS"), makeSymbol("_CSETF-TVA-INF-PRECOMPUTATIONS"), makeSymbol("_CSETF-TVA-INF-REUSED-SPACES"), makeSymbol("_CSETF-TVA-INF-ONE-ANSWER?"), makeSymbol("_CSETF-TVA-INF-JUSTIFY?"), makeSymbol("_CSETF-TVA-INF-RESTRICTED-ASSERTION"), makeSymbol("_CSETF-TVA-INF-ANSWERS") });

    static private final SubLSymbol $sym24$TVA_INF_ONE_ANSWER_ = makeSymbol("TVA-INF-ONE-ANSWER?");

    static private final SubLSymbol $sym25$_CSETF_TVA_INF_ONE_ANSWER_ = makeSymbol("_CSETF-TVA-INF-ONE-ANSWER?");

    static private final SubLSymbol $sym26$TVA_INF_JUSTIFY_ = makeSymbol("TVA-INF-JUSTIFY?");

    static private final SubLSymbol $sym27$_CSETF_TVA_INF_JUSTIFY_ = makeSymbol("_CSETF-TVA-INF-JUSTIFY?");

    public static final SubLSymbol $kw40$ONE_ANSWER_ = makeKeyword("ONE-ANSWER?");

    static private final SubLString $str_alt44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt45$__ = makeString("#<");

    static private final SubLList $list_alt49 = list(list(makeSymbol("*TVA-INFERENCE*"), list(makeSymbol("MAKE-TVA-INFERENCE"))));

    static private final SubLString $str_alt56$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt61$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt65$SKSI_SQL_statement_cache_ = makeString("SKSI SQL statement cache ");

    static private final SubLString $str_alt69$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt70$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt72 = cons(makeSymbol("GATHER-ARG-VALUE"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt73 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt78 = list(makeSymbol("VAR"), makeSymbol("ARGNUM"));

    static private final SubLList $list_alt79 = list(makeSymbol("ITERATOR"), makeSymbol("TVA-ANSWERS"), makeSymbol("VAR-PRED-DIRECTION"));

    static private final SubLList $list_alt80 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORT"));

    static private final SubLList $list_alt81 = list(makeSymbol("PRED"), makeSymbol("DIRECTION"));

    static private final SubLList $list_alt85 = list(makeSymbol("VAR"), makeSymbol("ITERATOR"));
}

/**
 * Total time: 3011 ms
 */
