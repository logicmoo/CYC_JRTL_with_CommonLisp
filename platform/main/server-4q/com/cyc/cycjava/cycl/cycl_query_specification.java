/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYCL-QUERY-SPECIFICATION
 * source file: /cyc/top/cycl/cycl-query-specification.lisp
 * created:     2019/07/03 17:37:58
 */
public final class cycl_query_specification extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cycl_query_specification();

 public static final String myName = "com.cyc.cycjava.cycl.cycl_query_specification";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cycl_query_specification$ = makeSymbol("*DTP-CYCL-QUERY-SPECIFICATION*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYCL_QUERY_SPECIFICATION = makeSymbol("CYCL-QUERY-SPECIFICATION");

    private static final SubLSymbol CYCL_QUERY_SPECIFICATION_P = makeSymbol("CYCL-QUERY-SPECIFICATION-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("CYCL-ID"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("COMMENT"), makeSymbol("MAX-NUMBER-OF-RESULTS"), makeSymbol("BACK-CHAINING"), makeSymbol("TIME-CUTOFF-SECS"), makeSymbol("MAX-DEPTH"), makeSymbol("REMOVAL-COST-CUTOFF"), makeSymbol("ENABLE-NEGATION-BY-FAILURE"), makeSymbol("ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("ENABLE-SEMANTIC-PRUNING"), makeSymbol("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("CYCL-ID"), makeKeyword("FORMULA"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("MAX-NUMBER-OF-RESULTS"), makeKeyword("BACK-CHAINING"), makeKeyword("TIME-CUTOFF-SECS"), makeKeyword("MAX-DEPTH"), makeKeyword("REMOVAL-COST-CUTOFF"), makeKeyword("ENABLE-NEGATION-BY-FAILURE"), makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-SEMANTIC-PRUNING"), makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("CYCL-QUERY-SPEC-FORMULA"), makeSymbol("CYCL-QUERY-SPEC-MT"), makeSymbol("CYCL-QUERY-SPEC-COMMENT"), makeSymbol("CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), makeSymbol("CYCL-QUERY-SPEC-BACK-CHAINING"), makeSymbol("CYCL-QUERY-SPEC-TIME-CUTOFF-SECS"), makeSymbol("CYCL-QUERY-SPEC-MAX-DEPTH"), makeSymbol("CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-FORMULA"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MT"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-COMMENT"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });

    private static final SubLSymbol CYCL_QUERY_SPECIFICATION_PRINT = makeSymbol("CYCL-QUERY-SPECIFICATION-PRINT");

    private static final SubLSymbol CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYCL-QUERY-SPECIFICATION-P"));

    private static final SubLSymbol CYCL_QUERY_SPEC_CYCL_ID = makeSymbol("CYCL-QUERY-SPEC-CYCL-ID");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_CYCL_ID = makeSymbol("_CSETF-CYCL-QUERY-SPEC-CYCL-ID");

    private static final SubLSymbol CYCL_QUERY_SPEC_FORMULA = makeSymbol("CYCL-QUERY-SPEC-FORMULA");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_FORMULA = makeSymbol("_CSETF-CYCL-QUERY-SPEC-FORMULA");

    private static final SubLSymbol CYCL_QUERY_SPEC_MT = makeSymbol("CYCL-QUERY-SPEC-MT");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_MT = makeSymbol("_CSETF-CYCL-QUERY-SPEC-MT");

    private static final SubLSymbol CYCL_QUERY_SPEC_COMMENT = makeSymbol("CYCL-QUERY-SPEC-COMMENT");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_COMMENT = makeSymbol("_CSETF-CYCL-QUERY-SPEC-COMMENT");

    private static final SubLSymbol CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS = makeSymbol("CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS = makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS");

    private static final SubLSymbol CYCL_QUERY_SPEC_BACK_CHAINING = makeSymbol("CYCL-QUERY-SPEC-BACK-CHAINING");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_BACK_CHAINING = makeSymbol("_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING");

    private static final SubLSymbol CYCL_QUERY_SPEC_TIME_CUTOFF_SECS = makeSymbol("CYCL-QUERY-SPEC-TIME-CUTOFF-SECS");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS = makeSymbol("_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS");

    private static final SubLSymbol CYCL_QUERY_SPEC_MAX_DEPTH = makeSymbol("CYCL-QUERY-SPEC-MAX-DEPTH");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_MAX_DEPTH = makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH");

    private static final SubLSymbol CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF = makeSymbol("CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF = makeSymbol("_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF");

    private static final SubLSymbol CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE = makeSymbol("CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE");

    private static final SubLSymbol CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING = makeSymbol("CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING");

    private static final SubLSymbol CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeSymbol("CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");

    private static final SubLSymbol CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeSymbol("CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING");

    private static final SubLSymbol CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING = makeSymbol("CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING");

    private static final SubLSymbol _CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING");

    private static final SubLSymbol $sym37$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA = makeSymbol("CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");

    private static final SubLSymbol $sym38$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");

    private static final SubLSymbol $MAX_NUMBER_OF_RESULTS = makeKeyword("MAX-NUMBER-OF-RESULTS");

    private static final SubLSymbol $TIME_CUTOFF_SECS = makeKeyword("TIME-CUTOFF-SECS");

    private static final SubLSymbol $REMOVAL_COST_CUTOFF = makeKeyword("REMOVAL-COST-CUTOFF");

    private static final SubLSymbol $ENABLE_NEGATION_BY_FAILURE = makeKeyword("ENABLE-NEGATION-BY-FAILURE");

    private static final SubLSymbol $ENABLE_HL_PREDICATE_BACKCHAINING = makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING");

    private static final SubLSymbol $ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");

    private static final SubLSymbol $ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING");

    private static final SubLSymbol $ENABLE_SEMANTIC_PRUNING = makeKeyword("ENABLE-SEMANTIC-PRUNING");

    private static final SubLSymbol $ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS = makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");

    private static final SubLString $str54$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CYCL_QUERY_SPECIFICATION = makeSymbol("MAKE-CYCL-QUERY-SPECIFICATION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYCL_QUERY_SPECIFICATION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCL-QUERY-SPECIFICATION-METHOD");

    private static final SubLString $str60$___Acycl_query_specification___ = makeString("~%~Acycl-query-specification:~%");

    private static final SubLString $str61$_Acycl_id____A__ = makeString("~Acycl-id:  ~A~%");

    private static final SubLString $str62$_Aformula___A__ = makeString("~Aformula: ~A~%");

    private static final SubLString $str63$_Amt___S__ = makeString("~Amt: ~S~%");

    private static final SubLString $str64$_Acomment___A__ = makeString("~Acomment: ~A~%");

    private static final SubLString $str65$_Amax_number_of_results___A__ = makeString("~Amax-number-of-results: ~A~%");

    private static final SubLString $str66$_Aback_chaining___A__ = makeString("~Aback-chaining: ~A~%");

    private static final SubLString $str67$_Atime_cutoff_secs___A__ = makeString("~Atime-cutoff-secs: ~A~%");

    private static final SubLString $str68$_Amax_depth___A__ = makeString("~Amax-depth: ~A~%");

    private static final SubLString $str69$_Aremoval_cost_cutoff___A__ = makeString("~Aremoval-cost-cutoff: ~A~%");

    private static final SubLString $str70$_Aenable_negation_by_failure___A_ = makeString("~Aenable-negation-by-failure: ~A~%");

    private static final SubLString $str71$_Aenable_hl_predicate_backchainin = makeString("~Aenable-hl-predicate-backchaining: ~A~%");

    private static final SubLString $str72$_Aenable_cache_backwards_query_re = makeString("~Aenable-cache-backwards-query-results: ~A~%");

    private static final SubLString $str73$_Aenable_unbound_predicate_backch = makeString("~Aenable-unbound-predicate-backchaining: ~A~%");

    private static final SubLString $str74$_Aenable_semantic_pruning___A__ = makeString("~Aenable-semantic-pruning: ~A~%");

    private static final SubLString $str75$_Aenable_consideration_of_disjunc = makeString("~Aenable-consideration-of-disjunctive-temporal-relations: ~A~%~%");



    private static final SubLInteger $int$10000 = makeInteger(10000);







    private static final SubLObject $const81$InferenceMaxTransformationStepsPa = reader_make_constant_shell("InferenceMaxTransformationStepsParameter");





    private static final SubLObject $const84$InferenceAllowUnboundPredicateTra = reader_make_constant_shell("InferenceAllowUnboundPredicateTransformationParameter");

    private static final SubLObject $const85$InferenceProductivityLimitParamet = reader_make_constant_shell("InferenceProductivityLimitParameter");

    private static final SubLObject $const86$InferenceEnableConsiderDisjunctiv = reader_make_constant_shell("InferenceEnableConsiderDisjunctiveTemporalRelationsParameter");

    private static final SubLObject $const87$InferenceEnableSemanticPruningPar = reader_make_constant_shell("InferenceEnableSemanticPruningParameter");

    private static final SubLObject $const88$InferenceCacheInferenceResultsPar = reader_make_constant_shell("InferenceCacheInferenceResultsParameter");

    private static final SubLObject $const89$InferenceAllowHLPredicateTransfor = reader_make_constant_shell("InferenceAllowHLPredicateTransformationParameter");

    private static final SubLObject $const90$InferenceNegationByFailureParamet = reader_make_constant_shell("InferenceNegationByFailureParameter");



    private static final SubLList $list94 = list(makeSymbol("?COMMENT"));

    private static final SubLObject $const95$softwareParameterValueInSpecifica = reader_make_constant_shell("softwareParameterValueInSpecification");

    private static final SubLSymbol $sym96$_PARAM = makeSymbol("?PARAM");

    private static final SubLSymbol $sym97$_VAL = makeSymbol("?VAL");

    private static final SubLList $list98 = list(makeSymbol("PARAM"), makeSymbol("VAL"));

    private static final SubLSymbol $kw99$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLSymbol $kw100$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw101$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLSymbol $kw102$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol $kw110$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    static final boolean assertionsDisabledSynth = true;

    public static final SubLObject cycl_query_specification_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        cycl_query_specification_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cycl_query_specification_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cycl_query_specification_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cycl_query_specification_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cycl_query_specification.$cycl_query_specification_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cycl_query_specification_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cycl_query_specification.$cycl_query_specification_native.class ? T : NIL;
    }

    public static final SubLObject cycl_query_spec_cycl_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField2();
    }

    public static SubLObject cycl_query_spec_cycl_id(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject cycl_query_spec_formula_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField3();
    }

    public static SubLObject cycl_query_spec_formula(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject cycl_query_spec_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField4();
    }

    public static SubLObject cycl_query_spec_mt(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject cycl_query_spec_comment_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField5();
    }

    public static SubLObject cycl_query_spec_comment(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject cycl_query_spec_max_number_of_results_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField6();
    }

    public static SubLObject cycl_query_spec_max_number_of_results(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject cycl_query_spec_back_chaining_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField7();
    }

    public static SubLObject cycl_query_spec_back_chaining(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject cycl_query_spec_time_cutoff_secs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField8();
    }

    public static SubLObject cycl_query_spec_time_cutoff_secs(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject cycl_query_spec_max_depth_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField9();
    }

    public static SubLObject cycl_query_spec_max_depth(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject cycl_query_spec_removal_cost_cutoff_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField10();
    }

    public static SubLObject cycl_query_spec_removal_cost_cutoff(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject cycl_query_spec_enable_negation_by_failure_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField11();
    }

    public static SubLObject cycl_query_spec_enable_negation_by_failure(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject cycl_query_spec_enable_hl_predicate_backchaining_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField12();
    }

    public static SubLObject cycl_query_spec_enable_hl_predicate_backchaining(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject cycl_query_spec_enable_cache_backwards_query_results_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField13();
    }

    public static SubLObject cycl_query_spec_enable_cache_backwards_query_results(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject cycl_query_spec_enable_unbound_predicate_backchaining_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField14();
    }

    public static SubLObject cycl_query_spec_enable_unbound_predicate_backchaining(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject cycl_query_spec_enable_semantic_pruning_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField15();
    }

    public static SubLObject cycl_query_spec_enable_semantic_pruning(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.getField16();
    }

    public static SubLObject cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(final SubLObject v_object) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject _csetf_cycl_query_spec_cycl_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cycl_query_spec_cycl_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_formula_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cycl_query_spec_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cycl_query_spec_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_comment_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_cycl_query_spec_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_max_number_of_results_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_cycl_query_spec_max_number_of_results(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_back_chaining_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_cycl_query_spec_back_chaining(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_time_cutoff_secs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_cycl_query_spec_time_cutoff_secs(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_max_depth_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_cycl_query_spec_max_depth(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_removal_cost_cutoff_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_cycl_query_spec_removal_cost_cutoff(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_enable_negation_by_failure_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_cycl_query_spec_enable_negation_by_failure(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_enable_hl_predicate_backchaining_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_cycl_query_spec_enable_hl_predicate_backchaining(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_enable_cache_backwards_query_results_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_cycl_query_spec_enable_cache_backwards_query_results(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_enable_unbound_predicate_backchaining_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_enable_semantic_pruning_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_cycl_query_spec_enable_semantic_pruning(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCL_QUERY_SPECIFICATION_P);
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycl_query_specification_p(v_object) : "! cycl_query_specification.cycl_query_specification_p(v_object) " + "cycl_query_specification.cycl_query_specification_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject make_cycl_query_specification_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cycl_query_specification.$cycl_query_specification_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL_ID)) {
                        _csetf_cycl_query_spec_cycl_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FORMULA)) {
                            _csetf_cycl_query_spec_formula(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MT)) {
                                _csetf_cycl_query_spec_mt(v_new, current_value);
                            } else {
                                if (pcase_var.eql($COMMENT)) {
                                    _csetf_cycl_query_spec_comment(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($MAX_NUMBER_OF_RESULTS)) {
                                        _csetf_cycl_query_spec_max_number_of_results(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($BACK_CHAINING)) {
                                            _csetf_cycl_query_spec_back_chaining(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($TIME_CUTOFF_SECS)) {
                                                _csetf_cycl_query_spec_time_cutoff_secs(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($MAX_DEPTH)) {
                                                    _csetf_cycl_query_spec_max_depth(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($REMOVAL_COST_CUTOFF)) {
                                                        _csetf_cycl_query_spec_removal_cost_cutoff(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($ENABLE_NEGATION_BY_FAILURE)) {
                                                            _csetf_cycl_query_spec_enable_negation_by_failure(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($ENABLE_HL_PREDICATE_BACKCHAINING)) {
                                                                _csetf_cycl_query_spec_enable_hl_predicate_backchaining(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($ENABLE_CACHE_BACKWARDS_QUERY_RESULTS)) {
                                                                    _csetf_cycl_query_spec_enable_cache_backwards_query_results(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($ENABLE_UNBOUND_PREDICATE_BACKCHAINING)) {
                                                                        _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($ENABLE_SEMANTIC_PRUNING)) {
                                                                            _csetf_cycl_query_spec_enable_semantic_pruning(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS)) {
                                                                                _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
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
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cycl_query_specification(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cycl_query_specification.$cycl_query_specification_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL_ID)) {
                _csetf_cycl_query_spec_cycl_id(v_new, current_value);
            } else
                if (pcase_var.eql($FORMULA)) {
                    _csetf_cycl_query_spec_formula(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        _csetf_cycl_query_spec_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($COMMENT)) {
                            _csetf_cycl_query_spec_comment(v_new, current_value);
                        } else
                            if (pcase_var.eql($MAX_NUMBER_OF_RESULTS)) {
                                _csetf_cycl_query_spec_max_number_of_results(v_new, current_value);
                            } else
                                if (pcase_var.eql($BACK_CHAINING)) {
                                    _csetf_cycl_query_spec_back_chaining(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TIME_CUTOFF_SECS)) {
                                        _csetf_cycl_query_spec_time_cutoff_secs(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($MAX_DEPTH)) {
                                            _csetf_cycl_query_spec_max_depth(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($REMOVAL_COST_CUTOFF)) {
                                                _csetf_cycl_query_spec_removal_cost_cutoff(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ENABLE_NEGATION_BY_FAILURE)) {
                                                    _csetf_cycl_query_spec_enable_negation_by_failure(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($ENABLE_HL_PREDICATE_BACKCHAINING)) {
                                                        _csetf_cycl_query_spec_enable_hl_predicate_backchaining(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($ENABLE_CACHE_BACKWARDS_QUERY_RESULTS)) {
                                                            _csetf_cycl_query_spec_enable_cache_backwards_query_results(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($ENABLE_UNBOUND_PREDICATE_BACKCHAINING)) {
                                                                _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($ENABLE_SEMANTIC_PRUNING)) {
                                                                    _csetf_cycl_query_spec_enable_semantic_pruning(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS)) {
                                                                        _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str54$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cycl_query_specification(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CYCL_QUERY_SPECIFICATION, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL_ID, cycl_query_spec_cycl_id(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA, cycl_query_spec_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, cycl_query_spec_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, cycl_query_spec_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_NUMBER_OF_RESULTS, cycl_query_spec_max_number_of_results(obj));
        funcall(visitor_fn, obj, $SLOT, $BACK_CHAINING, cycl_query_spec_back_chaining(obj));
        funcall(visitor_fn, obj, $SLOT, $TIME_CUTOFF_SECS, cycl_query_spec_time_cutoff_secs(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_DEPTH, cycl_query_spec_max_depth(obj));
        funcall(visitor_fn, obj, $SLOT, $REMOVAL_COST_CUTOFF, cycl_query_spec_removal_cost_cutoff(obj));
        funcall(visitor_fn, obj, $SLOT, $ENABLE_NEGATION_BY_FAILURE, cycl_query_spec_enable_negation_by_failure(obj));
        funcall(visitor_fn, obj, $SLOT, $ENABLE_HL_PREDICATE_BACKCHAINING, cycl_query_spec_enable_hl_predicate_backchaining(obj));
        funcall(visitor_fn, obj, $SLOT, $ENABLE_CACHE_BACKWARDS_QUERY_RESULTS, cycl_query_spec_enable_cache_backwards_query_results(obj));
        funcall(visitor_fn, obj, $SLOT, $ENABLE_UNBOUND_PREDICATE_BACKCHAINING, cycl_query_spec_enable_unbound_predicate_backchaining(obj));
        funcall(visitor_fn, obj, $SLOT, $ENABLE_SEMANTIC_PRUNING, cycl_query_spec_enable_semantic_pruning(obj));
        funcall(visitor_fn, obj, $SLOT, $ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS, cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(obj));
        funcall(visitor_fn, obj, $END, MAKE_CYCL_QUERY_SPECIFICATION, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cycl_query_specification_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cycl_query_specification(obj, visitor_fn);
    }

    public static final SubLObject cycl_query_specification_cycl_id_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_cycl_id(cycl_query);
    }

    public static SubLObject cycl_query_specification_cycl_id(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_cycl_id(cycl_query);
    }

    public static final SubLObject cycl_query_specification_formula_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_formula(cycl_query);
    }

    public static SubLObject cycl_query_specification_formula(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_formula(cycl_query);
    }

    public static final SubLObject cycl_query_specification_mt_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_mt(cycl_query);
    }

    public static SubLObject cycl_query_specification_mt(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_mt(cycl_query);
    }

    public static final SubLObject cycl_query_specification_comment_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_comment(cycl_query);
    }

    public static SubLObject cycl_query_specification_comment(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_comment(cycl_query);
    }

    public static final SubLObject cycl_query_specification_max_number_of_results_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_max_number_of_results(cycl_query);
    }

    public static SubLObject cycl_query_specification_max_number_of_results(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_max_number_of_results(cycl_query);
    }

    public static final SubLObject cycl_query_specification_back_chaining_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_back_chaining(cycl_query);
    }

    public static SubLObject cycl_query_specification_back_chaining(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_back_chaining(cycl_query);
    }

    public static final SubLObject cycl_query_specification_time_cutoff_secs_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_time_cutoff_secs(cycl_query);
    }

    public static SubLObject cycl_query_specification_time_cutoff_secs(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_time_cutoff_secs(cycl_query);
    }

    public static final SubLObject cycl_query_specification_max_depth_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_max_depth(cycl_query);
    }

    public static SubLObject cycl_query_specification_max_depth(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_max_depth(cycl_query);
    }

    /**
     * Should CYCL-QUERY be treated as a conditional, hypothesizing any neg-lits?
     */
    @LispMethod(comment = "Should CYCL-QUERY be treated as a conditional, hypothesizing any neg-lits?")
    public static final SubLObject cycl_query_specification_conditional_sentenceP_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        {
            SubLObject formula = cycl_query_spec_formula(cycl_query);
            SubLObject conditional_sentenceP = inference_strategist.inference_conditional_sentence_p(formula);
            return conditional_sentenceP;
        }
    }

    /**
     * Should CYCL-QUERY be treated as a conditional, hypothesizing any neg-lits?
     */
    @LispMethod(comment = "Should CYCL-QUERY be treated as a conditional, hypothesizing any neg-lits?")
    public static SubLObject cycl_query_specification_conditional_sentenceP(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        final SubLObject formula = cycl_query_spec_formula(cycl_query);
        final SubLObject conditional_sentenceP = inference_strategist.inference_conditional_sentence_p(formula);
        return conditional_sentenceP;
    }

    public static final SubLObject cycl_query_specification_removal_cost_cutoff_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_removal_cost_cutoff(cycl_query);
    }

    public static SubLObject cycl_query_specification_removal_cost_cutoff(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_removal_cost_cutoff(cycl_query);
    }

    public static final SubLObject cycl_query_specification_enable_negation_by_failure_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_enable_negation_by_failure(cycl_query);
    }

    public static SubLObject cycl_query_specification_enable_negation_by_failure(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_enable_negation_by_failure(cycl_query);
    }

    public static final SubLObject cycl_query_specification_enable_hl_predicate_backchaining_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_enable_hl_predicate_backchaining(cycl_query);
    }

    public static SubLObject cycl_query_specification_enable_hl_predicate_backchaining(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_enable_hl_predicate_backchaining(cycl_query);
    }

    public static final SubLObject cycl_query_specification_enable_cache_backwards_query_results_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_enable_cache_backwards_query_results(cycl_query);
    }

    public static SubLObject cycl_query_specification_enable_cache_backwards_query_results(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_enable_cache_backwards_query_results(cycl_query);
    }

    public static final SubLObject cycl_query_specification_enable_unbound_predicate_backchaining_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_enable_unbound_predicate_backchaining(cycl_query);
    }

    public static SubLObject cycl_query_specification_enable_unbound_predicate_backchaining(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_enable_unbound_predicate_backchaining(cycl_query);
    }

    public static final SubLObject cycl_query_specification_enable_semantic_pruning_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_enable_semantic_pruning(cycl_query);
    }

    public static SubLObject cycl_query_specification_enable_semantic_pruning(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_enable_semantic_pruning(cycl_query);
    }

    public static final SubLObject cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations_alt(SubLObject cycl_query) {
        SubLTrampolineFile.checkType(cycl_query, CYCL_QUERY_SPECIFICATION_P);
        return cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(cycl_query);
    }

    public static SubLObject cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(final SubLObject cycl_query) {
        assert NIL != cycl_query_specification_p(cycl_query) : "! cycl_query_specification.cycl_query_specification_p(cycl_query) " + ("cycl_query_specification.cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(cycl_query) ") + cycl_query;
        return cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(cycl_query);
    }

    /**
     * Makes a new cycl-query-specification with the same entries as query.
     */
    @LispMethod(comment = "Makes a new cycl-query-specification with the same entries as query.")
    public static final SubLObject cycl_query_specification_copy_alt(SubLObject query) {
        {
            SubLObject result = make_cycl_query_specification(UNPROVIDED);
            _csetf_cycl_query_spec_cycl_id(result, cycl_query_specification_cycl_id(query));
            _csetf_cycl_query_spec_formula(result, cycl_query_specification_formula(query));
            _csetf_cycl_query_spec_mt(result, cycl_query_specification_mt(query));
            _csetf_cycl_query_spec_comment(result, cycl_query_specification_comment(query));
            _csetf_cycl_query_spec_max_number_of_results(result, cycl_query_specification_max_number_of_results(query));
            _csetf_cycl_query_spec_back_chaining(result, cycl_query_specification_back_chaining(query));
            _csetf_cycl_query_spec_time_cutoff_secs(result, cycl_query_specification_time_cutoff_secs(query));
            _csetf_cycl_query_spec_max_depth(result, cycl_query_specification_max_depth(query));
            _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(result, cycl_query_specification_enable_unbound_predicate_backchaining(query));
            _csetf_cycl_query_spec_removal_cost_cutoff(result, cycl_query_specification_removal_cost_cutoff(query));
            _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(result, cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query));
            _csetf_cycl_query_spec_enable_semantic_pruning(result, cycl_query_specification_enable_semantic_pruning(query));
            _csetf_cycl_query_spec_enable_cache_backwards_query_results(result, cycl_query_spec_enable_cache_backwards_query_results(query));
            _csetf_cycl_query_spec_enable_hl_predicate_backchaining(result, cycl_query_specification_enable_hl_predicate_backchaining(query));
            _csetf_cycl_query_spec_enable_negation_by_failure(result, cycl_query_specification_enable_negation_by_failure(query));
            return result;
        }
    }

    /**
     * Makes a new cycl-query-specification with the same entries as query.
     */
    @LispMethod(comment = "Makes a new cycl-query-specification with the same entries as query.")
    public static SubLObject cycl_query_specification_copy(final SubLObject query) {
        final SubLObject result = make_cycl_query_specification(UNPROVIDED);
        _csetf_cycl_query_spec_cycl_id(result, cycl_query_specification_cycl_id(query));
        _csetf_cycl_query_spec_formula(result, cycl_query_specification_formula(query));
        _csetf_cycl_query_spec_mt(result, cycl_query_specification_mt(query));
        _csetf_cycl_query_spec_comment(result, cycl_query_specification_comment(query));
        _csetf_cycl_query_spec_max_number_of_results(result, cycl_query_specification_max_number_of_results(query));
        _csetf_cycl_query_spec_back_chaining(result, cycl_query_specification_back_chaining(query));
        _csetf_cycl_query_spec_time_cutoff_secs(result, cycl_query_specification_time_cutoff_secs(query));
        _csetf_cycl_query_spec_max_depth(result, cycl_query_specification_max_depth(query));
        _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(result, cycl_query_specification_enable_unbound_predicate_backchaining(query));
        _csetf_cycl_query_spec_removal_cost_cutoff(result, cycl_query_specification_removal_cost_cutoff(query));
        _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(result, cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query));
        _csetf_cycl_query_spec_enable_semantic_pruning(result, cycl_query_specification_enable_semantic_pruning(query));
        _csetf_cycl_query_spec_enable_cache_backwards_query_results(result, cycl_query_spec_enable_cache_backwards_query_results(query));
        _csetf_cycl_query_spec_enable_hl_predicate_backchaining(result, cycl_query_specification_enable_hl_predicate_backchaining(query));
        _csetf_cycl_query_spec_enable_negation_by_failure(result, cycl_query_specification_enable_negation_by_failure(query));
        return result;
    }

    public static final SubLObject cycl_query_specification_print_alt(SubLObject query_spec, SubLObject stream, SubLObject depth) {
        {
            SubLObject indent1 = Strings.make_string(depth, UNPROVIDED);
            SubLObject indent2 = Strings.make_string(add(depth, THREE_INTEGER), UNPROVIDED);
            format(stream, $str_alt54$___Acycl_query_specification___, indent1);
            format(stream, $str_alt55$_Acycl_id____A__, indent2, cycl_query_specification_cycl_id(query_spec));
            format(stream, $str_alt56$_Aformula___A__, indent2, cycl_query_specification_formula(query_spec));
            format(stream, $str_alt57$_Amt___S__, indent2, cycl_query_specification_mt(query_spec));
            format(stream, $str_alt58$_Acomment___A__, indent2, cycl_query_specification_comment(query_spec));
            format(stream, $str_alt59$_Amax_number_of_results___A__, indent2, cycl_query_specification_max_number_of_results(query_spec));
            format(stream, $str_alt60$_Aback_chaining___A__, indent2, cycl_query_specification_back_chaining(query_spec));
            format(stream, $str_alt61$_Atime_cutoff_secs___A__, indent2, cycl_query_specification_time_cutoff_secs(query_spec));
            format(stream, $str_alt62$_Amax_depth___A__, indent2, cycl_query_specification_max_depth(query_spec));
            format(stream, $str_alt63$_Aremoval_cost_cutoff___A__, indent2, cycl_query_specification_removal_cost_cutoff(query_spec));
            format(stream, $str_alt64$_Aenable_negation_by_failure___A_, indent2, cycl_query_specification_enable_negation_by_failure(query_spec));
            format(stream, $str_alt65$_Aenable_hl_predicate_backchainin, indent2, cycl_query_specification_enable_hl_predicate_backchaining(query_spec));
            format(stream, $str_alt66$_Aenable_cache_backwards_query_re, indent2, cycl_query_specification_enable_cache_backwards_query_results(query_spec));
            format(stream, $str_alt67$_Aenable_unbound_predicate_backch, indent2, cycl_query_specification_enable_unbound_predicate_backchaining(query_spec));
            format(stream, $str_alt68$_Aenable_semantic_pruning___A__, indent2, cycl_query_specification_enable_semantic_pruning(query_spec));
            format(stream, $str_alt69$_Aenable_consideration_of_disjunc, indent2, cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec));
        }
        return NIL;
    }

    public static SubLObject cycl_query_specification_print(final SubLObject query_spec, final SubLObject stream, final SubLObject depth) {
        final SubLObject indent1 = Strings.make_string(depth, UNPROVIDED);
        final SubLObject indent2 = Strings.make_string(add(depth, THREE_INTEGER), UNPROVIDED);
        format(stream, $str60$___Acycl_query_specification___, indent1);
        format(stream, $str61$_Acycl_id____A__, indent2, cycl_query_specification_cycl_id(query_spec));
        format(stream, $str62$_Aformula___A__, indent2, cycl_query_specification_formula(query_spec));
        format(stream, $str63$_Amt___S__, indent2, cycl_query_specification_mt(query_spec));
        format(stream, $str64$_Acomment___A__, indent2, cycl_query_specification_comment(query_spec));
        format(stream, $str65$_Amax_number_of_results___A__, indent2, cycl_query_specification_max_number_of_results(query_spec));
        format(stream, $str66$_Aback_chaining___A__, indent2, cycl_query_specification_back_chaining(query_spec));
        format(stream, $str67$_Atime_cutoff_secs___A__, indent2, cycl_query_specification_time_cutoff_secs(query_spec));
        format(stream, $str68$_Amax_depth___A__, indent2, cycl_query_specification_max_depth(query_spec));
        format(stream, $str69$_Aremoval_cost_cutoff___A__, indent2, cycl_query_specification_removal_cost_cutoff(query_spec));
        format(stream, $str70$_Aenable_negation_by_failure___A_, indent2, cycl_query_specification_enable_negation_by_failure(query_spec));
        format(stream, $str71$_Aenable_hl_predicate_backchainin, indent2, cycl_query_specification_enable_hl_predicate_backchaining(query_spec));
        format(stream, $str72$_Aenable_cache_backwards_query_re, indent2, cycl_query_specification_enable_cache_backwards_query_results(query_spec));
        format(stream, $str73$_Aenable_unbound_predicate_backch, indent2, cycl_query_specification_enable_unbound_predicate_backchaining(query_spec));
        format(stream, $str74$_Aenable_semantic_pruning___A__, indent2, cycl_query_specification_enable_semantic_pruning(query_spec));
        format(stream, $str75$_Aenable_consideration_of_disjunc, indent2, cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec));
        return NIL;
    }

    /**
     * Makes a new cycl-query-specification with the appropriate defaults.
     */
    @LispMethod(comment = "Makes a new cycl-query-specification with the appropriate defaults.")
    public static final SubLObject cycl_query_specification_new_alt() {
        {
            SubLObject result = make_cycl_query_specification(UNPROVIDED);
            _csetf_cycl_query_spec_max_number_of_results(result, NIL);
            _csetf_cycl_query_spec_back_chaining(result, NIL);
            _csetf_cycl_query_spec_time_cutoff_secs(result, $int$30);
            _csetf_cycl_query_spec_max_depth(result, TWENTY_INTEGER);
            _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(result, NIL);
            _csetf_cycl_query_spec_removal_cost_cutoff(result, $int$10000);
            _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(result, NIL);
            _csetf_cycl_query_spec_enable_semantic_pruning(result, NIL);
            _csetf_cycl_query_spec_enable_cache_backwards_query_results(result, NIL);
            _csetf_cycl_query_spec_enable_hl_predicate_backchaining(result, NIL);
            _csetf_cycl_query_spec_enable_negation_by_failure(result, NIL);
            return result;
        }
    }

    /**
     * Makes a new cycl-query-specification with the appropriate defaults.
     */
    @LispMethod(comment = "Makes a new cycl-query-specification with the appropriate defaults.")
    public static SubLObject cycl_query_specification_new() {
        final SubLObject result = make_cycl_query_specification(UNPROVIDED);
        _csetf_cycl_query_spec_max_number_of_results(result, NIL);
        _csetf_cycl_query_spec_back_chaining(result, NIL);
        _csetf_cycl_query_spec_time_cutoff_secs(result, $int$30);
        _csetf_cycl_query_spec_max_depth(result, TWENTY_INTEGER);
        _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(result, NIL);
        _csetf_cycl_query_spec_removal_cost_cutoff(result, $int$10000);
        _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(result, NIL);
        _csetf_cycl_query_spec_enable_semantic_pruning(result, NIL);
        _csetf_cycl_query_spec_enable_cache_backwards_query_results(result, NIL);
        _csetf_cycl_query_spec_enable_hl_predicate_backchaining(result, NIL);
        _csetf_cycl_query_spec_enable_negation_by_failure(result, NIL);
        return result;
    }

    /**
     * Assigns the given parameter to the given value in the query specification passed.
     */
    @LispMethod(comment = "Assigns the given parameter to the given value in the query specification passed.")
    public static final SubLObject cycl_query_specification_assign_param_alt(SubLObject query_spec, SubLObject param, SubLObject val) {
        if (param == $$InferenceFormulaParameter) {
            _csetf_cycl_query_spec_formula(query_spec, val);
            return NIL;
        }
        if (param == $$InferenceMicrotheoryParameter) {
            _csetf_cycl_query_spec_mt(query_spec, NIL != function_terms.nat_formula_p(val) ? ((SubLObject) (narts_high.nart_substitute(val))) : val);
            return NIL;
        }
        if (param == $$InferenceMaxAnswersParameter) {
            _csetf_cycl_query_spec_max_number_of_results(query_spec, val);
            return NIL;
        }
        if (param == $const75$InferenceMaxTransformationStepsPa) {
            _csetf_cycl_query_spec_back_chaining(query_spec, val);
            return NIL;
        }
        if (param == $$InferenceMaxTimeParameter) {
            if (NIL != nart_handles.nart_p(val)) {
                _csetf_cycl_query_spec_time_cutoff_secs(query_spec, cycl_utilities.formula_arg1(narts_high.nart_el_formula(val), UNPROVIDED));
            } else {
                if (NIL != possibly_naut_p(val)) {
                    _csetf_cycl_query_spec_time_cutoff_secs(query_spec, cycl_utilities.formula_arg1(val, UNPROVIDED));
                } else {
                    _csetf_cycl_query_spec_time_cutoff_secs(query_spec, val);
                }
            }
            return NIL;
        }
        if (param == $$InferenceMaxProofDepthParameter) {
            _csetf_cycl_query_spec_max_depth(query_spec, val);
            return NIL;
        }
        if (param == $const78$InferenceAllowUnboundPredicateTra) {
            _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(query_spec, val);
            return NIL;
        }
        if (param == $const79$InferenceProductivityLimitParamet) {
            _csetf_cycl_query_spec_removal_cost_cutoff(query_spec, val);
            return NIL;
        }
        if (param == $const80$InferenceEnableConsiderDisjunctiv) {
            _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(query_spec, val);
            return NIL;
        }
        if (param == $const81$InferenceEnableSemanticPruningPar) {
            _csetf_cycl_query_spec_enable_semantic_pruning(query_spec, val);
            return NIL;
        }
        if (param == $const82$InferenceCacheInferenceResultsPar) {
            _csetf_cycl_query_spec_enable_cache_backwards_query_results(query_spec, val);
            return NIL;
        }
        if (param == $const83$InferenceAllowHLPredicateTransfor) {
            _csetf_cycl_query_spec_enable_hl_predicate_backchaining(query_spec, val);
            return NIL;
        }
        if (param == $const84$InferenceNegationByFailureParamet) {
            _csetf_cycl_query_spec_enable_negation_by_failure(query_spec, val);
            return NIL;
        }
        if (param == $$comment) {
            _csetf_cycl_query_spec_comment(query_spec, val);
            return NIL;
        }
        return NIL;
    }

    /**
     * Assigns the given parameter to the given value in the query specification passed.
     */
    @LispMethod(comment = "Assigns the given parameter to the given value in the query specification passed.")
    public static SubLObject cycl_query_specification_assign_param(final SubLObject query_spec, final SubLObject param, final SubLObject val) {
        if (NIL != kb_utilities.kbeq(param, $$InferenceFormulaParameter)) {
            _csetf_cycl_query_spec_formula(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $$InferenceMicrotheoryParameter)) {
            _csetf_cycl_query_spec_mt(query_spec, NIL != function_terms.nat_formula_p(val) ? narts_high.nart_substitute(val) : val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $$InferenceMaxAnswersParameter)) {
            _csetf_cycl_query_spec_max_number_of_results(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $const81$InferenceMaxTransformationStepsPa)) {
            _csetf_cycl_query_spec_back_chaining(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $$InferenceMaxTimeParameter)) {
            if (NIL != nart_handles.nart_p(val)) {
                _csetf_cycl_query_spec_time_cutoff_secs(query_spec, cycl_utilities.formula_arg1(narts_high.nart_el_formula(val), UNPROVIDED));
            } else
                if (NIL != possibly_naut_p(val)) {
                    _csetf_cycl_query_spec_time_cutoff_secs(query_spec, cycl_utilities.formula_arg1(val, UNPROVIDED));
                } else {
                    _csetf_cycl_query_spec_time_cutoff_secs(query_spec, val);
                }

            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $$InferenceMaxProofDepthParameter)) {
            _csetf_cycl_query_spec_max_depth(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $const84$InferenceAllowUnboundPredicateTra)) {
            _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $const85$InferenceProductivityLimitParamet)) {
            _csetf_cycl_query_spec_removal_cost_cutoff(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $const86$InferenceEnableConsiderDisjunctiv)) {
            _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $const87$InferenceEnableSemanticPruningPar)) {
            _csetf_cycl_query_spec_enable_semantic_pruning(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $const88$InferenceCacheInferenceResultsPar)) {
            _csetf_cycl_query_spec_enable_cache_backwards_query_results(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $const89$InferenceAllowHLPredicateTransfor)) {
            _csetf_cycl_query_spec_enable_hl_predicate_backchaining(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $const90$InferenceNegationByFailureParamet)) {
            _csetf_cycl_query_spec_enable_negation_by_failure(query_spec, val);
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(param, $$comment)) {
            _csetf_cycl_query_spec_comment(query_spec, val);
            return NIL;
        }
        return NIL;
    }

    /**
     * Given the cyc-constant for a cycl-query-specification and an mt, reads the query specification from the KB and returns it as a cycl-query-specifaction structure.
     */
    @LispMethod(comment = "Given the cyc-constant for a cycl-query-specification and an mt, reads the query specification from the KB and returns it as a cycl-query-specifaction structure.")
    public static final SubLObject cycl_query_specification_get_alt(SubLObject constant_id, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(constant_id, CYCL_DENOTATIONAL_TERM_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, MICROTHEORY_P);
            }
            {
                SubLObject result = cycl_query_specification_new();
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        _csetf_cycl_query_spec_cycl_id(result, constant_id);
                        thread.resetMultipleValues();
                        {
                            SubLObject values = fi.fi_ask_int(listS($$comment, constant_id, $list_alt88), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject v_answer = thread.secondMultipleValue();
                            SubLObject reason = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (values != NIL) {
                                {
                                    SubLObject comment_str = values.first().first().rest();
                                    cycl_query_specification_assign_param(result, $$comment, comment_str);
                                }
                            }
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject values = fi.fi_ask_int(list($const89$softwareParameterValueInSpecifica, $sym90$_PARAM, $sym91$_VAL, constant_id), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject v_answer = thread.secondMultipleValue();
                            SubLObject reason = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = values;
                                SubLObject binding = NIL;
                                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = binding;
                                        SubLObject current = datum;
                                        SubLObject param = NIL;
                                        SubLObject val = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt92);
                                        param = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt92);
                                        val = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            param = param.rest();
                                            val = val.rest();
                                            cycl_query_specification_assign_param(result, param, val);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt92);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Given the cyc-constant for a cycl-query-specification and an mt, reads the query specification from the KB and returns it as a cycl-query-specifaction structure.
     */
    @LispMethod(comment = "Given the cyc-constant for a cycl-query-specification and an mt, reads the query specification from the KB and returns it as a cycl-query-specifaction structure.")
    public static SubLObject cycl_query_specification_get(final SubLObject constant_id, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(constant_id) : "! cycl_grammar.cycl_denotational_term_p(constant_id) " + ("cycl_grammar.cycl_denotational_term_p(constant_id) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(constant_id) ") + constant_id;
        if (((NIL != mt) && (!assertionsDisabledSynth)) && (NIL == fort_types_interface.microtheory_p(mt))) {
            throw new AssertionError(mt);
        }
        final SubLObject result = cycl_query_specification_new();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            _csetf_cycl_query_spec_cycl_id(result, constant_id);
            thread.resetMultipleValues();
            SubLObject values = fi.fi_ask_int(listS($$comment, constant_id, $list94), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_answer = thread.secondMultipleValue();
            SubLObject reason = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (values != NIL) {
                final SubLObject comment_str = values.first().first().rest();
                cycl_query_specification_assign_param(result, $$comment, comment_str);
            }
            thread.resetMultipleValues();
            values = fi.fi_ask_int(list($const95$softwareParameterValueInSpecifica, $sym96$_PARAM, $sym97$_VAL, constant_id), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            v_answer = thread.secondMultipleValue();
            reason = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = values;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = binding;
                SubLObject param = NIL;
                SubLObject val = NIL;
                destructuring_bind_must_consp(current, datum, $list98);
                param = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list98);
                val = current.first();
                current = current.rest();
                if (NIL == current) {
                    param = param.rest();
                    val = val.rest();
                    cycl_query_specification_assign_param(result, param, val);
                } else {
                    cdestructuring_bind_error(datum, $list98);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask-int.
     */
    @LispMethod(comment = "Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask-int.")
    public static final SubLObject cycl_query_specification_ask_int_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query_spec, CYCL_QUERY_SPECIFICATION_P);
            {
                SubLObject values = NIL;
                SubLObject v_answer = NIL;
                SubLObject reason = NIL;
                {
                    SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $hl_failure_backchaining$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $cache_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $unbound_rule_backchain_enabled$.currentBinding(thread);
                    SubLObject _prev_bind_4 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $removal_cost_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_6 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
                    try {
                        $negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
                        $hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
                        $cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
                        $unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
                        backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
                        $removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject values_1 = fi.fi_ask_int(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
                            SubLObject v_answer_2 = thread.secondMultipleValue();
                            SubLObject reason_3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            values = values_1;
                            v_answer = v_answer_2;
                            reason = reason_3;
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_6, thread);
                        $removal_cost_cutoff$.rebind(_prev_bind_5, thread);
                        backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_4, thread);
                        $unbound_rule_backchain_enabled$.rebind(_prev_bind_3, thread);
                        $cache_inference_results$.rebind(_prev_bind_2, thread);
                        $hl_failure_backchaining$.rebind(_prev_bind_1, thread);
                        $negation_by_failure$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(values, v_answer, reason);
            }
        }
    }

    /**
     * Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask-int.
     */
    @LispMethod(comment = "Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask-int.")
    public static SubLObject cycl_query_specification_ask_int(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_query_specification_p(query_spec) : "! cycl_query_specification.cycl_query_specification_p(query_spec) " + ("cycl_query_specification.cycl_query_specification_p(query_spec) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(query_spec) ") + query_spec;
        SubLObject values = NIL;
        SubLObject v_answer = NIL;
        SubLObject reason = NIL;
        final SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $hl_failure_backchaining$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $unbound_rule_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $removal_cost_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
        try {
            $negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
            $hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
            $cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
            $unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
            backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
            $removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
            thread.resetMultipleValues();
            final SubLObject values_$1 = fi.fi_ask_int(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
            final SubLObject v_answer_$2 = thread.secondMultipleValue();
            final SubLObject reason_$3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            values = values_$1;
            v_answer = v_answer_$2;
            reason = reason_$3;
        } finally {
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_7, thread);
            $removal_cost_cutoff$.rebind(_prev_bind_6, thread);
            backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_5, thread);
            $unbound_rule_backchain_enabled$.rebind(_prev_bind_4, thread);
            $cache_inference_results$.rebind(_prev_bind_3, thread);
            $hl_failure_backchaining$.rebind(_prev_bind_2, thread);
            $negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return values(values, v_answer, reason);
    }

    /**
     * Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask.
     */
    @LispMethod(comment = "Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask.")
    public static final SubLObject cycl_query_specification_ask_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query_spec, CYCL_QUERY_SPECIFICATION_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $hl_failure_backchaining$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $cache_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $unbound_rule_backchain_enabled$.currentBinding(thread);
                    SubLObject _prev_bind_4 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $removal_cost_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_6 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
                    try {
                        $negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
                        $hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
                        $cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
                        $unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
                        backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
                        $removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
                        if (NIL != cycl_query_specification_formula(query_spec)) {
                            result = fi.fi_ask(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_6, thread);
                        $removal_cost_cutoff$.rebind(_prev_bind_5, thread);
                        backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_4, thread);
                        $unbound_rule_backchain_enabled$.rebind(_prev_bind_3, thread);
                        $cache_inference_results$.rebind(_prev_bind_2, thread);
                        $hl_failure_backchaining$.rebind(_prev_bind_1, thread);
                        $negation_by_failure$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask.
     */
    @LispMethod(comment = "Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask.")
    public static SubLObject cycl_query_specification_ask(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_query_specification_p(query_spec) : "! cycl_query_specification.cycl_query_specification_p(query_spec) " + ("cycl_query_specification.cycl_query_specification_p(query_spec) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(query_spec) ") + query_spec;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $hl_failure_backchaining$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $unbound_rule_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $removal_cost_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
        try {
            $negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
            $hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
            $cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
            $unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
            backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
            $removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
            if (NIL != cycl_query_specification_formula(query_spec)) {
                result = fi.fi_ask(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
            }
        } finally {
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_7, thread);
            $removal_cost_cutoff$.rebind(_prev_bind_6, thread);
            backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_5, thread);
            $unbound_rule_backchain_enabled$.rebind(_prev_bind_4, thread);
            $cache_inference_results$.rebind(_prev_bind_3, thread);
            $hl_failure_backchaining$.rebind(_prev_bind_2, thread);
            $negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject cycl_query_specification_set_mt_alt(SubLObject query, SubLObject new_mt) {
        SubLTrampolineFile.checkType(query, CYCL_QUERY_SPECIFICATION_P);
        SubLTrampolineFile.checkType(new_mt, MICROTHEORY_P);
        _csetf_cycl_query_spec_mt(query, new_mt);
        return NIL;
    }

    public static SubLObject cycl_query_specification_set_mt(final SubLObject query, final SubLObject new_mt) {
        assert NIL != cycl_query_specification_p(query) : "! cycl_query_specification.cycl_query_specification_p(query) " + ("cycl_query_specification.cycl_query_specification_p(query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(query) ") + query;
        assert NIL != fort_types_interface.microtheory_p(new_mt) : "! fort_types_interface.microtheory_p(new_mt) " + ("fort_types_interface.microtheory_p(new_mt) " + "CommonSymbols.NIL != fort_types_interface.microtheory_p(new_mt) ") + new_mt;
        _csetf_cycl_query_spec_mt(query, new_mt);
        return NIL;
    }

    public static final SubLObject cycl_query_specification_new_query_from_old_alt(SubLObject old_query, SubLObject new_formula, SubLObject new_mt) {
        SubLTrampolineFile.checkType(old_query, CYCL_QUERY_SPECIFICATION_P);
        {
            SubLObject new_query = cycl_query_specification_copy(old_query);
            if (NIL != new_formula) {
                _csetf_cycl_query_spec_formula(new_query, new_formula);
            }
            if (NIL != new_mt) {
                _csetf_cycl_query_spec_mt(new_query, new_mt);
            }
            return new_query;
        }
    }

    public static SubLObject cycl_query_specification_new_query_from_old(final SubLObject old_query, final SubLObject new_formula, final SubLObject new_mt) {
        assert NIL != cycl_query_specification_p(old_query) : "! cycl_query_specification.cycl_query_specification_p(old_query) " + ("cycl_query_specification.cycl_query_specification_p(old_query) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(old_query) ") + old_query;
        final SubLObject new_query = cycl_query_specification_copy(old_query);
        if (NIL != new_formula) {
            _csetf_cycl_query_spec_formula(new_query, new_formula);
        }
        if (NIL != new_mt) {
            _csetf_cycl_query_spec_mt(new_query, new_mt);
        }
        return new_query;
    }

    /**
     * Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask.
     */
    @LispMethod(comment = "Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask.")
    public static final SubLObject cycl_query_specification_rkf_ask_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query_spec, CYCL_QUERY_SPECIFICATION_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $hl_failure_backchaining$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $cache_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $unbound_rule_backchain_enabled$.currentBinding(thread);
                    SubLObject _prev_bind_4 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $removal_cost_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_6 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
                    try {
                        $negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
                        $hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
                        $cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
                        $unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
                        backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
                        $removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
                        if (NIL != cycl_query_specification_formula(query_spec)) {
                            result = rkf_query_utilities.rkf_query(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_6, thread);
                        $removal_cost_cutoff$.rebind(_prev_bind_5, thread);
                        backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_4, thread);
                        $unbound_rule_backchain_enabled$.rebind(_prev_bind_3, thread);
                        $cache_inference_results$.rebind(_prev_bind_2, thread);
                        $hl_failure_backchaining$.rebind(_prev_bind_1, thread);
                        $negation_by_failure$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask.
     */
    @LispMethod(comment = "Given a cycl-query-specifications, runs the query with the parameters specified and returns the results of calling fi-ask.")
    public static SubLObject cycl_query_specification_rkf_ask(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_query_specification_p(query_spec) : "! cycl_query_specification.cycl_query_specification_p(query_spec) " + ("cycl_query_specification.cycl_query_specification_p(query_spec) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(query_spec) ") + query_spec;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $hl_failure_backchaining$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $unbound_rule_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $removal_cost_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
        try {
            $negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
            $hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
            $cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
            $unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
            backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
            $removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
            if (NIL != cycl_query_specification_formula(query_spec)) {
                result = rkf_query_utilities.rkf_query(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
            }
        } finally {
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_7, thread);
            $removal_cost_cutoff$.rebind(_prev_bind_6, thread);
            backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_5, thread);
            $unbound_rule_backchain_enabled$.rebind(_prev_bind_4, thread);
            $cache_inference_results$.rebind(_prev_bind_3, thread);
            $hl_failure_backchaining$.rebind(_prev_bind_2, thread);
            $negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return CONTINUABLE-INFERENCE-P corresponding to QUERY-SPEC.
     */
    @LispMethod(comment = "@return CONTINUABLE-INFERENCE-P corresponding to QUERY-SPEC.")
    public static final SubLObject new_continuable_inference_from_cycl_query_spec_alt(SubLObject query_spec) {
        SubLTrampolineFile.checkType(query_spec, CYCL_QUERY_SPECIFICATION_P);
        {
            SubLObject sentence = cycl_query_spec_formula(query_spec);
            SubLObject mt = cycl_query_spec_mt(query_spec);
            SubLObject query_properties = static_query_properties_from_cycl_query_spec(query_spec);
            return inference_kernel.new_continuable_inference(sentence, mt, query_properties);
        }
    }

    /**
     *
     *
     * @return CONTINUABLE-INFERENCE-P corresponding to QUERY-SPEC.
     */
    @LispMethod(comment = "@return CONTINUABLE-INFERENCE-P corresponding to QUERY-SPEC.")
    public static SubLObject new_continuable_inference_from_cycl_query_spec(final SubLObject query_spec) {
        assert NIL != cycl_query_specification_p(query_spec) : "! cycl_query_specification.cycl_query_specification_p(query_spec) " + ("cycl_query_specification.cycl_query_specification_p(query_spec) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(query_spec) ") + query_spec;
        final SubLObject sentence = cycl_query_spec_formula(query_spec);
        final SubLObject mt = cycl_query_spec_mt(query_spec);
        final SubLObject query_properties = static_query_properties_from_cycl_query_spec(query_spec);
        return inference_kernel.new_continuable_inference(sentence, mt, query_properties);
    }

    public static final SubLObject continue_cycl_query_spec_inference_alt(SubLObject query_spec, SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query_spec, CYCL_QUERY_SPECIFICATION_P);
            {
                SubLObject result = NIL;
                SubLObject query_properties = dynamic_query_properties_from_cycl_query_spec(query_spec);
                {
                    SubLObject _prev_bind_0 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
                    try {
                        backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
                        result = inference_kernel.continue_inference(inference, query_properties);
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_1, thread);
                        backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject continue_cycl_query_spec_inference(final SubLObject query_spec, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_query_specification_p(query_spec) : "! cycl_query_specification.cycl_query_specification_p(query_spec) " + ("cycl_query_specification.cycl_query_specification_p(query_spec) " + "CommonSymbols.NIL != cycl_query_specification.cycl_query_specification_p(query_spec) ") + query_spec;
        SubLObject result = NIL;
        final SubLObject query_properties = dynamic_query_properties_from_cycl_query_spec(query_spec);
        final SubLObject _prev_bind_0 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
        try {
            backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
            result = inference_kernel.continue_inference(inference, query_properties);
        } finally {
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_2, thread);
            backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return QUERY-STATIC-PROPERTIES-P corresponding to QUERY-SPEC.
     */
    @LispMethod(comment = "@return QUERY-STATIC-PROPERTIES-P corresponding to QUERY-SPEC.")
    public static final SubLObject static_query_properties_from_cycl_query_spec_alt(SubLObject query_spec) {
        {
            SubLObject hl_pred_transformationP = cycl_query_spec_enable_hl_predicate_backchaining(query_spec);
            SubLObject unbound_pred_transformationP = cycl_query_spec_enable_unbound_predicate_backchaining(query_spec);
            SubLObject negation_by_failureP = cycl_query_spec_enable_negation_by_failure(query_spec);
            SubLObject conditional_sentenceP = cycl_query_specification_conditional_sentenceP(query_spec);
            return list($kw93$CONDITIONAL_SENTENCE_, conditional_sentenceP, $kw94$ALLOW_HL_PREDICATE_TRANSFORMATION_, hl_pred_transformationP, $kw95$NEGATION_BY_FAILURE_, negation_by_failureP, $kw96$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, unbound_pred_transformationP);
        }
    }

    /**
     *
     *
     * @return QUERY-STATIC-PROPERTIES-P corresponding to QUERY-SPEC.
     */
    @LispMethod(comment = "@return QUERY-STATIC-PROPERTIES-P corresponding to QUERY-SPEC.")
    public static SubLObject static_query_properties_from_cycl_query_spec(final SubLObject query_spec) {
        final SubLObject hl_pred_transformationP = cycl_query_spec_enable_hl_predicate_backchaining(query_spec);
        final SubLObject unbound_pred_transformationP = cycl_query_spec_enable_unbound_predicate_backchaining(query_spec);
        final SubLObject negation_by_failureP = cycl_query_spec_enable_negation_by_failure(query_spec);
        final SubLObject conditional_sentenceP = cycl_query_specification_conditional_sentenceP(query_spec);
        return list($kw99$CONDITIONAL_SENTENCE_, conditional_sentenceP, $kw100$ALLOW_HL_PREDICATE_TRANSFORMATION_, hl_pred_transformationP, $kw101$NEGATION_BY_FAILURE_, negation_by_failureP, $kw102$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, unbound_pred_transformationP);
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("CYCL-ID"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("COMMENT"), makeSymbol("MAX-NUMBER-OF-RESULTS"), makeSymbol("BACK-CHAINING"), makeSymbol("TIME-CUTOFF-SECS"), makeSymbol("MAX-DEPTH"), makeSymbol("REMOVAL-COST-CUTOFF"), makeSymbol("ENABLE-NEGATION-BY-FAILURE"), makeSymbol("ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("ENABLE-SEMANTIC-PRUNING"), makeSymbol("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("CYCL-ID"), makeKeyword("FORMULA"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("MAX-NUMBER-OF-RESULTS"), makeKeyword("BACK-CHAINING"), makeKeyword("TIME-CUTOFF-SECS"), makeKeyword("MAX-DEPTH"), makeKeyword("REMOVAL-COST-CUTOFF"), makeKeyword("ENABLE-NEGATION-BY-FAILURE"), makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-SEMANTIC-PRUNING"), makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });

    /**
     *
     *
     * @return QUERY-DYNAMIC-PROPERTIES-P corresponding to QUERY-SPEC.
     */
    @LispMethod(comment = "@return QUERY-DYNAMIC-PROPERTIES-P corresponding to QUERY-SPEC.")
    public static final SubLObject dynamic_query_properties_from_cycl_query_spec_alt(SubLObject query_spec) {
        {
            SubLObject max_backchain = cycl_query_spec_back_chaining(query_spec);
            SubLObject max_depth = cycl_query_spec_max_depth(query_spec);
            SubLObject removal_cost_cutoff = cycl_query_specification_removal_cost_cutoff(query_spec);
            SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff(removal_cost_cutoff);
            SubLObject cache_resultsP = cycl_query_spec_enable_cache_backwards_query_results(query_spec);
            SubLObject time = cycl_query_spec_time_cutoff_secs(query_spec);
            SubLObject number = cycl_query_spec_max_number_of_results(query_spec);
            return list(new SubLObject[]{ $MAX_TRANSFORMATION_DEPTH, max_backchain, $MAX_PROOF_DEPTH, max_depth, $RETURN, $BINDINGS_AND_SUPPORTS, $PRODUCTIVITY_LIMIT, productivity_limit, $ANSWER_LANGUAGE, $HL, $kw104$CACHE_INFERENCE_RESULTS_, cache_resultsP, $MAX_TIME, time, $MAX_NUMBER, number });
        }
    }

    /**
     *
     *
     * @return QUERY-DYNAMIC-PROPERTIES-P corresponding to QUERY-SPEC.
     */
    @LispMethod(comment = "@return QUERY-DYNAMIC-PROPERTIES-P corresponding to QUERY-SPEC.")
    public static SubLObject dynamic_query_properties_from_cycl_query_spec(final SubLObject query_spec) {
        final SubLObject max_backchain = cycl_query_spec_back_chaining(query_spec);
        final SubLObject max_depth = cycl_query_spec_max_depth(query_spec);
        final SubLObject removal_cost_cutoff = cycl_query_specification_removal_cost_cutoff(query_spec);
        final SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff(removal_cost_cutoff);
        final SubLObject cache_resultsP = cycl_query_spec_enable_cache_backwards_query_results(query_spec);
        final SubLObject time = cycl_query_spec_time_cutoff_secs(query_spec);
        final SubLObject number = cycl_query_spec_max_number_of_results(query_spec);
        return list(new SubLObject[]{ $MAX_TRANSFORMATION_DEPTH, max_backchain, $MAX_PROOF_DEPTH, max_depth, $RETURN, $BINDINGS_AND_SUPPORTS, $PRODUCTIVITY_LIMIT, productivity_limit, $ANSWER_LANGUAGE, $HL, $kw110$CACHE_INFERENCE_RESULTS_, cache_resultsP, $MAX_TIME, time, $MAX_NUMBER, number });
    }

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("CYCL-QUERY-SPEC-FORMULA"), makeSymbol("CYCL-QUERY-SPEC-MT"), makeSymbol("CYCL-QUERY-SPEC-COMMENT"), makeSymbol("CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), makeSymbol("CYCL-QUERY-SPEC-BACK-CHAINING"), makeSymbol("CYCL-QUERY-SPEC-TIME-CUTOFF-SECS"), makeSymbol("CYCL-QUERY-SPEC-MAX-DEPTH"), makeSymbol("CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });

    public static SubLObject declare_cycl_query_specification_file() {
        declareFunction("cycl_query_specification_print_function_trampoline", "CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cycl_query_specification_p", "CYCL-QUERY-SPECIFICATION-P", 1, 0, false);
        new cycl_query_specification.$cycl_query_specification_p$UnaryFunction();
        declareFunction("cycl_query_spec_cycl_id", "CYCL-QUERY-SPEC-CYCL-ID", 1, 0, false);
        declareFunction("cycl_query_spec_formula", "CYCL-QUERY-SPEC-FORMULA", 1, 0, false);
        declareFunction("cycl_query_spec_mt", "CYCL-QUERY-SPEC-MT", 1, 0, false);
        declareFunction("cycl_query_spec_comment", "CYCL-QUERY-SPEC-COMMENT", 1, 0, false);
        declareFunction("cycl_query_spec_max_number_of_results", "CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS", 1, 0, false);
        declareFunction("cycl_query_spec_back_chaining", "CYCL-QUERY-SPEC-BACK-CHAINING", 1, 0, false);
        declareFunction("cycl_query_spec_time_cutoff_secs", "CYCL-QUERY-SPEC-TIME-CUTOFF-SECS", 1, 0, false);
        declareFunction("cycl_query_spec_max_depth", "CYCL-QUERY-SPEC-MAX-DEPTH", 1, 0, false);
        declareFunction("cycl_query_spec_removal_cost_cutoff", "CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF", 1, 0, false);
        declareFunction("cycl_query_spec_enable_negation_by_failure", "CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE", 1, 0, false);
        declareFunction("cycl_query_spec_enable_hl_predicate_backchaining", "CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING", 1, 0, false);
        declareFunction("cycl_query_spec_enable_cache_backwards_query_results", "CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 1, 0, false);
        declareFunction("cycl_query_spec_enable_unbound_predicate_backchaining", "CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 1, 0, false);
        declareFunction("cycl_query_spec_enable_semantic_pruning", "CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING", 1, 0, false);
        declareFunction("cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations", "CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 1, 0, false);
        declareFunction("_csetf_cycl_query_spec_cycl_id", "_CSETF-CYCL-QUERY-SPEC-CYCL-ID", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_formula", "_CSETF-CYCL-QUERY-SPEC-FORMULA", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_mt", "_CSETF-CYCL-QUERY-SPEC-MT", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_comment", "_CSETF-CYCL-QUERY-SPEC-COMMENT", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_max_number_of_results", "_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_back_chaining", "_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_time_cutoff_secs", "_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_max_depth", "_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_removal_cost_cutoff", "_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_enable_negation_by_failure", "_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_enable_hl_predicate_backchaining", "_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_enable_cache_backwards_query_results", "_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_enable_unbound_predicate_backchaining", "_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_enable_semantic_pruning", "_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING", 2, 0, false);
        declareFunction("_csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations", "_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 2, 0, false);
        declareFunction("make_cycl_query_specification", "MAKE-CYCL-QUERY-SPECIFICATION", 0, 1, false);
        declareFunction("visit_defstruct_cycl_query_specification", "VISIT-DEFSTRUCT-CYCL-QUERY-SPECIFICATION", 2, 0, false);
        declareFunction("visit_defstruct_object_cycl_query_specification_method", "VISIT-DEFSTRUCT-OBJECT-CYCL-QUERY-SPECIFICATION-METHOD", 2, 0, false);
        declareFunction("cycl_query_specification_cycl_id", "CYCL-QUERY-SPECIFICATION-CYCL-ID", 1, 0, false);
        declareFunction("cycl_query_specification_formula", "CYCL-QUERY-SPECIFICATION-FORMULA", 1, 0, false);
        declareFunction("cycl_query_specification_mt", "CYCL-QUERY-SPECIFICATION-MT", 1, 0, false);
        declareFunction("cycl_query_specification_comment", "CYCL-QUERY-SPECIFICATION-COMMENT", 1, 0, false);
        declareFunction("cycl_query_specification_max_number_of_results", "CYCL-QUERY-SPECIFICATION-MAX-NUMBER-OF-RESULTS", 1, 0, false);
        declareFunction("cycl_query_specification_back_chaining", "CYCL-QUERY-SPECIFICATION-BACK-CHAINING", 1, 0, false);
        declareFunction("cycl_query_specification_time_cutoff_secs", "CYCL-QUERY-SPECIFICATION-TIME-CUTOFF-SECS", 1, 0, false);
        declareFunction("cycl_query_specification_max_depth", "CYCL-QUERY-SPECIFICATION-MAX-DEPTH", 1, 0, false);
        declareFunction("cycl_query_specification_conditional_sentenceP", "CYCL-QUERY-SPECIFICATION-CONDITIONAL-SENTENCE?", 1, 0, false);
        declareFunction("cycl_query_specification_removal_cost_cutoff", "CYCL-QUERY-SPECIFICATION-REMOVAL-COST-CUTOFF", 1, 0, false);
        declareFunction("cycl_query_specification_enable_negation_by_failure", "CYCL-QUERY-SPECIFICATION-ENABLE-NEGATION-BY-FAILURE", 1, 0, false);
        declareFunction("cycl_query_specification_enable_hl_predicate_backchaining", "CYCL-QUERY-SPECIFICATION-ENABLE-HL-PREDICATE-BACKCHAINING", 1, 0, false);
        declareFunction("cycl_query_specification_enable_cache_backwards_query_results", "CYCL-QUERY-SPECIFICATION-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 1, 0, false);
        declareFunction("cycl_query_specification_enable_unbound_predicate_backchaining", "CYCL-QUERY-SPECIFICATION-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 1, 0, false);
        declareFunction("cycl_query_specification_enable_semantic_pruning", "CYCL-QUERY-SPECIFICATION-ENABLE-SEMANTIC-PRUNING", 1, 0, false);
        declareFunction("cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations", "CYCL-QUERY-SPECIFICATION-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 1, 0, false);
        declareFunction("cycl_query_specification_copy", "CYCL-QUERY-SPECIFICATION-COPY", 1, 0, false);
        declareFunction("cycl_query_specification_print", "CYCL-QUERY-SPECIFICATION-PRINT", 3, 0, false);
        declareFunction("cycl_query_specification_new", "CYCL-QUERY-SPECIFICATION-NEW", 0, 0, false);
        declareFunction("cycl_query_specification_assign_param", "CYCL-QUERY-SPECIFICATION-ASSIGN-PARAM", 3, 0, false);
        declareFunction("cycl_query_specification_get", "CYCL-QUERY-SPECIFICATION-GET", 1, 1, false);
        declareFunction("cycl_query_specification_ask_int", "CYCL-QUERY-SPECIFICATION-ASK-INT", 1, 0, false);
        declareFunction("cycl_query_specification_ask", "CYCL-QUERY-SPECIFICATION-ASK", 1, 0, false);
        declareFunction("cycl_query_specification_set_mt", "CYCL-QUERY-SPECIFICATION-SET-MT", 2, 0, false);
        declareFunction("cycl_query_specification_new_query_from_old", "CYCL-QUERY-SPECIFICATION-NEW-QUERY-FROM-OLD", 3, 0, false);
        declareFunction("cycl_query_specification_rkf_ask", "CYCL-QUERY-SPECIFICATION-RKF-ASK", 1, 0, false);
        declareFunction("new_continuable_inference_from_cycl_query_spec", "NEW-CONTINUABLE-INFERENCE-FROM-CYCL-QUERY-SPEC", 1, 0, false);
        declareFunction("continue_cycl_query_spec_inference", "CONTINUE-CYCL-QUERY-SPEC-INFERENCE", 2, 0, false);
        declareFunction("static_query_properties_from_cycl_query_spec", "STATIC-QUERY-PROPERTIES-FROM-CYCL-QUERY-SPEC", 1, 0, false);
        declareFunction("dynamic_query_properties_from_cycl_query_spec", "DYNAMIC-QUERY-PROPERTIES-FROM-CYCL-QUERY-SPEC", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-FORMULA"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MT"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-COMMENT"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });

    static private final SubLSymbol $sym36$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA = makeSymbol("CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");

    static private final SubLSymbol $sym37$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");

    static private final SubLString $str_alt53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt54$___Acycl_query_specification___ = makeString("~%~Acycl-query-specification:~%");

    static private final SubLString $str_alt55$_Acycl_id____A__ = makeString("~Acycl-id:  ~A~%");

    static private final SubLString $str_alt56$_Aformula___A__ = makeString("~Aformula: ~A~%");

    static private final SubLString $str_alt57$_Amt___S__ = makeString("~Amt: ~S~%");

    static private final SubLString $str_alt58$_Acomment___A__ = makeString("~Acomment: ~A~%");

    static private final SubLString $str_alt59$_Amax_number_of_results___A__ = makeString("~Amax-number-of-results: ~A~%");

    static private final SubLString $str_alt60$_Aback_chaining___A__ = makeString("~Aback-chaining: ~A~%");

    static private final SubLString $str_alt61$_Atime_cutoff_secs___A__ = makeString("~Atime-cutoff-secs: ~A~%");

    static private final SubLString $str_alt62$_Amax_depth___A__ = makeString("~Amax-depth: ~A~%");

    static private final SubLString $str_alt63$_Aremoval_cost_cutoff___A__ = makeString("~Aremoval-cost-cutoff: ~A~%");

    static private final SubLString $str_alt64$_Aenable_negation_by_failure___A_ = makeString("~Aenable-negation-by-failure: ~A~%");

    static private final SubLString $str_alt65$_Aenable_hl_predicate_backchainin = makeString("~Aenable-hl-predicate-backchaining: ~A~%");

    static private final SubLString $str_alt66$_Aenable_cache_backwards_query_re = makeString("~Aenable-cache-backwards-query-results: ~A~%");

    static private final SubLString $str_alt67$_Aenable_unbound_predicate_backch = makeString("~Aenable-unbound-predicate-backchaining: ~A~%");

    public static SubLObject init_cycl_query_specification_file() {
        defconstant("*DTP-CYCL-QUERY-SPECIFICATION*", CYCL_QUERY_SPECIFICATION);
        return NIL;
    }

    static private final SubLString $str_alt68$_Aenable_semantic_pruning___A__ = makeString("~Aenable-semantic-pruning: ~A~%");

    public static final SubLObject setup_cycl_query_specification_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cycl_query_specification$.getGlobalValue(), symbol_function(CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CYCL_QUERY_SPEC_CYCL_ID, _CSETF_CYCL_QUERY_SPEC_CYCL_ID);
        def_csetf(CYCL_QUERY_SPEC_FORMULA, _CSETF_CYCL_QUERY_SPEC_FORMULA);
        def_csetf(CYCL_QUERY_SPEC_MT, _CSETF_CYCL_QUERY_SPEC_MT);
        def_csetf(CYCL_QUERY_SPEC_COMMENT, _CSETF_CYCL_QUERY_SPEC_COMMENT);
        def_csetf(CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS, _CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS);
        def_csetf(CYCL_QUERY_SPEC_BACK_CHAINING, _CSETF_CYCL_QUERY_SPEC_BACK_CHAINING);
        def_csetf(CYCL_QUERY_SPEC_TIME_CUTOFF_SECS, _CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS);
        def_csetf(CYCL_QUERY_SPEC_MAX_DEPTH, _CSETF_CYCL_QUERY_SPEC_MAX_DEPTH);
        def_csetf(CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF, _CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE, _CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING, _CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS, _CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING, _CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING, _CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING);
        def_csetf($sym36$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA, $sym37$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR);
        identity(CYCL_QUERY_SPECIFICATION);
        return NIL;
    }

    public static SubLObject setup_cycl_query_specification_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_cycl_query_specification$.getGlobalValue(), symbol_function(CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(CYCL_QUERY_SPEC_CYCL_ID, _CSETF_CYCL_QUERY_SPEC_CYCL_ID);
            def_csetf(CYCL_QUERY_SPEC_FORMULA, _CSETF_CYCL_QUERY_SPEC_FORMULA);
            def_csetf(CYCL_QUERY_SPEC_MT, _CSETF_CYCL_QUERY_SPEC_MT);
            def_csetf(CYCL_QUERY_SPEC_COMMENT, _CSETF_CYCL_QUERY_SPEC_COMMENT);
            def_csetf(CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS, _CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS);
            def_csetf(CYCL_QUERY_SPEC_BACK_CHAINING, _CSETF_CYCL_QUERY_SPEC_BACK_CHAINING);
            def_csetf(CYCL_QUERY_SPEC_TIME_CUTOFF_SECS, _CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS);
            def_csetf(CYCL_QUERY_SPEC_MAX_DEPTH, _CSETF_CYCL_QUERY_SPEC_MAX_DEPTH);
            def_csetf(CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF, _CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF);
            def_csetf(CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE, _CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE);
            def_csetf(CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING, _CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING);
            def_csetf(CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS, _CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS);
            def_csetf(CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING, _CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING);
            def_csetf(CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING, _CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING);
            def_csetf($sym37$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA, $sym38$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR);
            identity(CYCL_QUERY_SPECIFICATION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cycl_query_specification$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYCL_QUERY_SPECIFICATION_METHOD));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym36$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA, $sym37$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR);
        }
        return NIL;
    }

    public static SubLObject setup_cycl_query_specification_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cycl_query_specification$.getGlobalValue(), symbol_function(CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(CYCL_QUERY_SPEC_CYCL_ID, _CSETF_CYCL_QUERY_SPEC_CYCL_ID);
        def_csetf(CYCL_QUERY_SPEC_FORMULA, _CSETF_CYCL_QUERY_SPEC_FORMULA);
        def_csetf(CYCL_QUERY_SPEC_MT, _CSETF_CYCL_QUERY_SPEC_MT);
        def_csetf(CYCL_QUERY_SPEC_COMMENT, _CSETF_CYCL_QUERY_SPEC_COMMENT);
        def_csetf(CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS, _CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS);
        def_csetf(CYCL_QUERY_SPEC_BACK_CHAINING, _CSETF_CYCL_QUERY_SPEC_BACK_CHAINING);
        def_csetf(CYCL_QUERY_SPEC_TIME_CUTOFF_SECS, _CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS);
        def_csetf(CYCL_QUERY_SPEC_MAX_DEPTH, _CSETF_CYCL_QUERY_SPEC_MAX_DEPTH);
        def_csetf(CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF, _CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE, _CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING, _CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS, _CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING, _CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING);
        def_csetf(CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING, _CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING);
        def_csetf($sym37$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA, $sym38$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR);
        identity(CYCL_QUERY_SPECIFICATION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cycl_query_specification$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYCL_QUERY_SPECIFICATION_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt69$_Aenable_consideration_of_disjunc = makeString("~Aenable-consideration-of-disjunctive-temporal-relations: ~A~%~%");

    public static final SubLObject $const75$InferenceMaxTransformationStepsPa = reader_make_constant_shell("InferenceMaxTransformationStepsParameter");

    public static final SubLObject $const78$InferenceAllowUnboundPredicateTra = reader_make_constant_shell("InferenceAllowUnboundPredicateTransformationParameter");

    public static final SubLObject $const79$InferenceProductivityLimitParamet = reader_make_constant_shell("InferenceProductivityLimitParameter");

    public static final SubLObject $const80$InferenceEnableConsiderDisjunctiv = reader_make_constant_shell("InferenceEnableConsiderDisjunctiveTemporalRelationsParameter");

    public static final SubLObject $const81$InferenceEnableSemanticPruningPar = reader_make_constant_shell("InferenceEnableSemanticPruningParameter");

    public static final SubLObject $const82$InferenceCacheInferenceResultsPar = reader_make_constant_shell("InferenceCacheInferenceResultsParameter");

    @Override
    public void declareFunctions() {
        declare_cycl_query_specification_file();
    }

    public static final SubLObject $const83$InferenceAllowHLPredicateTransfor = reader_make_constant_shell("InferenceAllowHLPredicateTransformationParameter");

    @Override
    public void initializeVariables() {
        init_cycl_query_specification_file();
    }

    public static final SubLObject $const84$InferenceNegationByFailureParamet = reader_make_constant_shell("InferenceNegationByFailureParameter");

    @Override
    public void runTopLevelForms() {
        setup_cycl_query_specification_file();
    }

    static {
    }

    static private final SubLList $list_alt88 = list(makeSymbol("?COMMENT"));

    public static final SubLObject $const89$softwareParameterValueInSpecifica = reader_make_constant_shell("softwareParameterValueInSpecification");

    public static final class $cycl_query_specification_native extends SubLStructNative {
        public SubLObject $cycl_id;

        public SubLObject $formula;

        public SubLObject $mt;

        public SubLObject $comment;

        public SubLObject $max_number_of_results;

        public SubLObject $back_chaining;

        public SubLObject $time_cutoff_secs;

        public SubLObject $max_depth;

        public SubLObject $removal_cost_cutoff;

        public SubLObject $enable_negation_by_failure;

        public SubLObject $enable_hl_predicate_backchaining;

        public SubLObject $enable_cache_backwards_query_results;

        public SubLObject $enable_unbound_predicate_backchaining;

        public SubLObject $enable_semantic_pruning;

        public SubLObject $enable_consideration_of_disjunctive_temporal_relations;

        private static final SubLStructDeclNative structDecl;

        public $cycl_query_specification_native() {
            cycl_query_specification.$cycl_query_specification_native.this.$cycl_id = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$formula = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$mt = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$comment = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$max_number_of_results = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$back_chaining = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$time_cutoff_secs = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$max_depth = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$removal_cost_cutoff = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$enable_negation_by_failure = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$enable_hl_predicate_backchaining = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$enable_cache_backwards_query_results = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$enable_unbound_predicate_backchaining = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$enable_semantic_pruning = Lisp.NIL;
            cycl_query_specification.$cycl_query_specification_native.this.$enable_consideration_of_disjunctive_temporal_relations = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cycl_query_specification.$cycl_query_specification_native.this.$cycl_id;
        }

        @Override
        public SubLObject getField3() {
            return cycl_query_specification.$cycl_query_specification_native.this.$formula;
        }

        @Override
        public SubLObject getField4() {
            return cycl_query_specification.$cycl_query_specification_native.this.$mt;
        }

        @Override
        public SubLObject getField5() {
            return cycl_query_specification.$cycl_query_specification_native.this.$comment;
        }

        @Override
        public SubLObject getField6() {
            return cycl_query_specification.$cycl_query_specification_native.this.$max_number_of_results;
        }

        @Override
        public SubLObject getField7() {
            return cycl_query_specification.$cycl_query_specification_native.this.$back_chaining;
        }

        @Override
        public SubLObject getField8() {
            return cycl_query_specification.$cycl_query_specification_native.this.$time_cutoff_secs;
        }

        @Override
        public SubLObject getField9() {
            return cycl_query_specification.$cycl_query_specification_native.this.$max_depth;
        }

        @Override
        public SubLObject getField10() {
            return cycl_query_specification.$cycl_query_specification_native.this.$removal_cost_cutoff;
        }

        @Override
        public SubLObject getField11() {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_negation_by_failure;
        }

        @Override
        public SubLObject getField12() {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_hl_predicate_backchaining;
        }

        @Override
        public SubLObject getField13() {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_cache_backwards_query_results;
        }

        @Override
        public SubLObject getField14() {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_unbound_predicate_backchaining;
        }

        @Override
        public SubLObject getField15() {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_semantic_pruning;
        }

        @Override
        public SubLObject getField16() {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_consideration_of_disjunctive_temporal_relations;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$cycl_id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$formula = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$comment = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$max_number_of_results = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$back_chaining = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$time_cutoff_secs = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$max_depth = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$removal_cost_cutoff = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_negation_by_failure = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_hl_predicate_backchaining = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_cache_backwards_query_results = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_unbound_predicate_backchaining = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_semantic_pruning = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return cycl_query_specification.$cycl_query_specification_native.this.$enable_consideration_of_disjunctive_temporal_relations = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cycl_query_specification.$cycl_query_specification_native.class, CYCL_QUERY_SPECIFICATION, CYCL_QUERY_SPECIFICATION_P, $list2, $list3, new String[]{ "$cycl_id", "$formula", "$mt", "$comment", "$max_number_of_results", "$back_chaining", "$time_cutoff_secs", "$max_depth", "$removal_cost_cutoff", "$enable_negation_by_failure", "$enable_hl_predicate_backchaining", "$enable_cache_backwards_query_results", "$enable_unbound_predicate_backchaining", "$enable_semantic_pruning", "$enable_consideration_of_disjunctive_temporal_relations" }, $list4, $list5, CYCL_QUERY_SPECIFICATION_PRINT);
        }
    }

    static private final SubLSymbol $sym90$_PARAM = makeSymbol("?PARAM");

    static private final SubLSymbol $sym91$_VAL = makeSymbol("?VAL");

    static private final SubLList $list_alt92 = list(makeSymbol("PARAM"), makeSymbol("VAL"));

    public static final SubLSymbol $kw93$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    public static final SubLSymbol $kw94$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw95$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    public static final SubLSymbol $kw96$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw104$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    public static final class $cycl_query_specification_p$UnaryFunction extends UnaryFunction {
        public $cycl_query_specification_p$UnaryFunction() {
            super(extractFunctionNamed("CYCL-QUERY-SPECIFICATION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_query_specification_p(arg1);
        }
    }
}

/**
 * Total time: 290 ms synthetic
 */
