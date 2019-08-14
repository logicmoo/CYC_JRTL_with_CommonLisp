/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-WORKER-ANSWER
 * source file: /cyc/top/cycl/inference/harness/inference-worker-answer.lisp
 * created:     2019/07/03 17:37:39
 */
public final class inference_worker_answer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_worker_answer();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_answer";


    private static final SubLSymbol ANSWER_LINK_P = makeSymbol("ANSWER-LINK-P");

    private static final SubLSymbol EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("EXPLANATORY-SUBQUERY-SPEC-P");

    // Definitions
    public static final SubLObject answer_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($ANSWER == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    // Definitions
    public static SubLObject answer_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($ANSWER == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    /**
     * Creates a new answer link under INFERENCE.
     * An :answer link is special because it supports an inference (namely, INFERENCE)
     * rather than a problem.
     */
    @LispMethod(comment = "Creates a new answer link under INFERENCE.\r\nAn :answer link is special because it supports an inference (namely, INFERENCE)\r\nrather than a problem.\nCreates a new answer link under INFERENCE.\nAn :answer link is special because it supports an inference (namely, INFERENCE)\nrather than a problem.")
    public static final SubLObject new_answer_link_alt(SubLObject inference) {
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        {
            SubLObject answer_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_answer.new_answer_link_int(inference);
            inference_datastructures_inference.set_inference_root_link(inference, answer_link);
            return answer_link;
        }
    }

    /**
     * Creates a new answer link under INFERENCE.
     * An :answer link is special because it supports an inference (namely, INFERENCE)
     * rather than a problem.
     */
    @LispMethod(comment = "Creates a new answer link under INFERENCE.\r\nAn :answer link is special because it supports an inference (namely, INFERENCE)\r\nrather than a problem.\nCreates a new answer link under INFERENCE.\nAn :answer link is special because it supports an inference (namely, INFERENCE)\nrather than a problem.")
    public static SubLObject new_answer_link(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        final SubLObject answer_link = new_answer_link_int(inference);
        inference_datastructures_inference.set_inference_root_link(inference, answer_link);
        return answer_link;
    }

    public static final SubLObject new_answer_link_int_alt(SubLObject inference) {
        {
            SubLObject explanatory_subquery = inference_datastructures_inference.inference_explanatory_subquery(inference);
            SubLObject answer_link = inference_datastructures_problem_link.new_problem_link_int(inference, $ANSWER);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_answer.set_answer_link_explanatory_subquery(answer_link, explanatory_subquery);
            return answer_link;
        }
    }

    public static SubLObject new_answer_link_int(final SubLObject inference) {
        final SubLObject explanatory_subquery = inference_datastructures_inference.inference_explanatory_subquery(inference);
        final SubLObject answer_link = inference_datastructures_problem_link.new_problem_link_int(inference, $ANSWER);
        set_answer_link_explanatory_subquery(answer_link, explanatory_subquery);
        return answer_link;
    }

    public static final SubLObject answer_link_supported_inference_alt(SubLObject answer_link) {
        SubLTrampolineFile.checkType(answer_link, ANSWER_LINK_P);
        return inference_datastructures_problem_link.problem_link_supported_object(answer_link);
    }

    public static SubLObject answer_link_supported_inference(final SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : "! inference_worker_answer.answer_link_p(answer_link) " + ("inference_worker_answer.answer_link_p(answer_link) " + "CommonSymbols.NIL != inference_worker_answer.answer_link_p(answer_link) ") + answer_link;
        return inference_datastructures_problem_link.problem_link_supported_object(answer_link);
    }

    /**
     *
     *
     * @unknown this will return NIL if ANSWER-LINK gets closed later, after propagation.
     */
    @LispMethod(comment = "@unknown this will return NIL if ANSWER-LINK gets closed later, after propagation.")
    public static final SubLObject answer_link_propagatedP_alt(SubLObject answer_link) {
        SubLTrampolineFile.checkType(answer_link, ANSWER_LINK_P);
        return inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP(answer_link);
    }

    /**
     *
     *
     * @unknown this will return NIL if ANSWER-LINK gets closed later, after propagation.
     */
    @LispMethod(comment = "@unknown this will return NIL if ANSWER-LINK gets closed later, after propagation.")
    public static SubLObject answer_link_propagatedP(final SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : "! inference_worker_answer.answer_link_p(answer_link) " + ("inference_worker_answer.answer_link_p(answer_link) " + "CommonSymbols.NIL != inference_worker_answer.answer_link_p(answer_link) ") + answer_link;
        return inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP(answer_link);
    }

    public static final SubLObject answer_link_supporting_mapped_problem_alt(SubLObject answer_link) {
        SubLTrampolineFile.checkType(answer_link, ANSWER_LINK_P);
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(answer_link);
    }

    public static SubLObject answer_link_supporting_mapped_problem(final SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : "! inference_worker_answer.answer_link_p(answer_link) " + ("inference_worker_answer.answer_link_p(answer_link) " + "CommonSymbols.NIL != inference_worker_answer.answer_link_p(answer_link) ") + answer_link;
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(answer_link);
    }

    public static final SubLObject answer_link_explanatory_subquery_alt(SubLObject answer_link) {
        SubLTrampolineFile.checkType(answer_link, ANSWER_LINK_P);
        return inference_datastructures_problem_link.problem_link_data(answer_link);
    }

    public static SubLObject answer_link_explanatory_subquery(final SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : "! inference_worker_answer.answer_link_p(answer_link) " + ("inference_worker_answer.answer_link_p(answer_link) " + "CommonSymbols.NIL != inference_worker_answer.answer_link_p(answer_link) ") + answer_link;
        return inference_datastructures_problem_link.problem_link_data(answer_link);
    }

    public static final SubLObject set_answer_link_explanatory_subquery_alt(SubLObject answer_link, SubLObject subquery) {
        SubLTrampolineFile.checkType(answer_link, ANSWER_LINK_P);
        SubLTrampolineFile.checkType(subquery, EXPLANATORY_SUBQUERY_SPEC_P);
        inference_datastructures_problem_link.set_problem_link_data(answer_link, subquery);
        return answer_link;
    }

    public static SubLObject set_answer_link_explanatory_subquery(final SubLObject answer_link, final SubLObject subquery) {
        assert NIL != answer_link_p(answer_link) : "! inference_worker_answer.answer_link_p(answer_link) " + ("inference_worker_answer.answer_link_p(answer_link) " + "CommonSymbols.NIL != inference_worker_answer.answer_link_p(answer_link) ") + answer_link;
        assert NIL != inference_datastructures_problem_query.explanatory_subquery_spec_p(subquery) : "! inference_datastructures_problem_query.explanatory_subquery_spec_p(subquery) " + ("inference_datastructures_problem_query.explanatory_subquery_spec_p(subquery) " + "CommonSymbols.NIL != inference_datastructures_problem_query.explanatory_subquery_spec_p(subquery) ") + subquery;
        inference_datastructures_problem_link.set_problem_link_data(answer_link, subquery);
        return answer_link;
    }

    public static final SubLObject note_answer_link_propagated_alt(SubLObject answer_link) {
        SubLTrampolineFile.checkType(answer_link, ANSWER_LINK_P);
        inference_datastructures_problem_link.problem_link_open_sole_supporting_mapped_problem(answer_link);
        return answer_link;
    }

    public static SubLObject note_answer_link_propagated(final SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : "! inference_worker_answer.answer_link_p(answer_link) " + ("inference_worker_answer.answer_link_p(answer_link) " + "CommonSymbols.NIL != inference_worker_answer.answer_link_p(answer_link) ") + answer_link;
        inference_datastructures_problem_link.problem_link_open_sole_supporting_mapped_problem(answer_link);
        return answer_link;
    }

    public static final SubLObject answer_link_supporting_problem_alt(SubLObject answer_link) {
        {
            SubLObject mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_answer.answer_link_supporting_mapped_problem(answer_link);
            return inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        }
    }

    public static SubLObject answer_link_supporting_problem(final SubLObject answer_link) {
        final SubLObject mapped_problem = answer_link_supporting_mapped_problem(answer_link);
        return inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
    }

    public static final SubLObject answer_link_supporting_problem_wholly_explanatoryP_alt(SubLObject answer_link) {
        return eq($ALL, com.cyc.cycjava.cycl.inference.harness.inference_worker_answer.answer_link_explanatory_subquery(answer_link));
    }

    public static SubLObject answer_link_supporting_problem_wholly_explanatoryP(final SubLObject answer_link) {
        return eq($ALL, answer_link_explanatory_subquery(answer_link));
    }

    public static SubLObject declare_inference_worker_answer_file() {
        declareFunction("answer_link_p", "ANSWER-LINK-P", 1, 0, false);
        declareFunction("new_answer_link", "NEW-ANSWER-LINK", 1, 0, false);
        declareFunction("new_answer_link_int", "NEW-ANSWER-LINK-INT", 1, 0, false);
        declareFunction("answer_link_supported_inference", "ANSWER-LINK-SUPPORTED-INFERENCE", 1, 0, false);
        declareFunction("answer_link_propagatedP", "ANSWER-LINK-PROPAGATED?", 1, 0, false);
        declareFunction("answer_link_supporting_mapped_problem", "ANSWER-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("answer_link_explanatory_subquery", "ANSWER-LINK-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction("set_answer_link_explanatory_subquery", "SET-ANSWER-LINK-EXPLANATORY-SUBQUERY", 2, 0, false);
        declareFunction("note_answer_link_propagated", "NOTE-ANSWER-LINK-PROPAGATED", 1, 0, false);
        declareFunction("answer_link_supporting_problem", "ANSWER-LINK-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction("answer_link_supporting_problem_wholly_explanatoryP", "ANSWER-LINK-SUPPORTING-PROBLEM-WHOLLY-EXPLANATORY?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_answer_file() {
        return NIL;
    }

    public static SubLObject setup_inference_worker_answer_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_answer_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_answer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_answer_file();
    }

    static {
    }
}

/**
 * Total time: 84 ms
 */
