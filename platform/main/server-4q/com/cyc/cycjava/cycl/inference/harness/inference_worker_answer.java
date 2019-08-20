package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_worker_answer extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "f85af1c4cc9823ebc7cd6cb3409daf488454879add6f05669bfd68e6f2244cf3";
    private static SubLSymbol $ANSWER;
    private static SubLSymbol $sym1$INFERENCE_P;
    private static SubLSymbol $sym2$ANSWER_LINK_P;
    private static SubLSymbol $sym3$EXPLANATORY_SUBQUERY_SPEC_P;
    private static SubLSymbol $ALL;

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 800L)
    public static SubLObject answer_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_p(v_object) && $ANSWER == inference_datastructures_problem_link.problem_link_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 1400L)
    public static SubLObject new_answer_link(SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject answer_link = new_answer_link_int(inference);
        inference_datastructures_inference.set_inference_root_link(inference, answer_link);
        return answer_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 1800L)
    public static SubLObject new_answer_link_int(SubLObject inference) {
        SubLObject explanatory_subquery = inference_datastructures_inference.inference_explanatory_subquery(inference);
        SubLObject answer_link = inference_datastructures_problem_link.new_problem_link_int(inference, $ANSWER);
        set_answer_link_explanatory_subquery(answer_link, explanatory_subquery);
        return answer_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2100L)
    public static SubLObject answer_link_supported_inference(SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : answer_link;
        return inference_datastructures_problem_link.problem_link_supported_object(answer_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2300L)
    public static SubLObject answer_link_propagatedP(SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : answer_link;
        return inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP(answer_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2600L)
    public static SubLObject answer_link_supporting_mapped_problem(SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : answer_link;
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(answer_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2700L)
    public static SubLObject answer_link_explanatory_subquery(SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : answer_link;
        return inference_datastructures_problem_link.problem_link_data(answer_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2900L)
    public static SubLObject set_answer_link_explanatory_subquery(SubLObject answer_link, SubLObject subquery) {
        assert NIL != answer_link_p(answer_link) : answer_link;
        assert NIL != inference_datastructures_problem_query.explanatory_subquery_spec_p(subquery) : subquery;
        inference_datastructures_problem_link.set_problem_link_data(answer_link, subquery);
        return answer_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3100L)
    public static SubLObject note_answer_link_propagated(SubLObject answer_link) {
        assert NIL != answer_link_p(answer_link) : answer_link;
        inference_datastructures_problem_link.problem_link_open_sole_supporting_mapped_problem(answer_link);
        return answer_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3300L)
    public static SubLObject answer_link_supporting_problem(SubLObject answer_link) {
        SubLObject mapped_problem = answer_link_supporting_mapped_problem(answer_link);
        return inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3500L)
    public static SubLObject answer_link_supporting_problem_wholly_explanatoryP(SubLObject answer_link) {
        return Equality.eq($ALL, answer_link_explanatory_subquery(answer_link));
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
        me = new inference_worker_answer();
        $ANSWER = makeKeyword("ANSWER");
        $sym1$INFERENCE_P = makeSymbol("INFERENCE-P");
        $sym2$ANSWER_LINK_P = makeSymbol("ANSWER-LINK-P");
        $sym3$EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("EXPLANATORY-SUBQUERY-SPEC-P");
        $ALL = makeKeyword("ALL");
    }
}
/*
 *
 * Total time: 84 ms
 *
 */