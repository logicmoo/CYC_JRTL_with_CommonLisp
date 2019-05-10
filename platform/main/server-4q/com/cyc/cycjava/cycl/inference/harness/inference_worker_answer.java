package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_answer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_answer";
  public static final String myFingerPrint = "f85af1c4cc9823ebc7cd6cb3409daf488454879add6f05669bfd68e6f2244cf3";
  private static final SubLSymbol $kw0$ANSWER;
  private static final SubLSymbol $sym1$INFERENCE_P;
  private static final SubLSymbol $sym2$ANSWER_LINK_P;
  private static final SubLSymbol $sym3$EXPLANATORY_SUBQUERY_SPEC_P;
  private static final SubLSymbol $kw4$ALL;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 867L)
  public static SubLObject answer_link_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_problem_link.problem_link_p( v_object ) && $kw0$ANSWER == inference_datastructures_problem_link.problem_link_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 1485L)
  public static SubLObject new_answer_link(final SubLObject inference)
  {
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject answer_link = new_answer_link_int( inference );
    inference_datastructures_inference.set_inference_root_link( inference, answer_link );
    return answer_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 1895L)
  public static SubLObject new_answer_link_int(final SubLObject inference)
  {
    final SubLObject explanatory_subquery = inference_datastructures_inference.inference_explanatory_subquery( inference );
    final SubLObject answer_link = inference_datastructures_problem_link.new_problem_link_int( inference, $kw0$ANSWER );
    set_answer_link_explanatory_subquery( answer_link, explanatory_subquery );
    return answer_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2177L)
  public static SubLObject answer_link_supported_inference(final SubLObject answer_link)
  {
    assert NIL != answer_link_p( answer_link ) : answer_link;
    return inference_datastructures_problem_link.problem_link_supported_object( answer_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2348L)
  public static SubLObject answer_link_propagatedP(final SubLObject answer_link)
  {
    assert NIL != answer_link_p( answer_link ) : answer_link;
    return inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP( answer_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2603L)
  public static SubLObject answer_link_supporting_mapped_problem(final SubLObject answer_link)
  {
    assert NIL != answer_link_p( answer_link ) : answer_link;
    return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem( answer_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2783L)
  public static SubLObject answer_link_explanatory_subquery(final SubLObject answer_link)
  {
    assert NIL != answer_link_p( answer_link ) : answer_link;
    return inference_datastructures_problem_link.problem_link_data( answer_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2931L)
  public static SubLObject set_answer_link_explanatory_subquery(final SubLObject answer_link, final SubLObject subquery)
  {
    assert NIL != answer_link_p( answer_link ) : answer_link;
    assert NIL != inference_datastructures_problem_query.explanatory_subquery_spec_p( subquery ) : subquery;
    inference_datastructures_problem_link.set_problem_link_data( answer_link, subquery );
    return answer_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3181L)
  public static SubLObject note_answer_link_propagated(final SubLObject answer_link)
  {
    assert NIL != answer_link_p( answer_link ) : answer_link;
    inference_datastructures_problem_link.problem_link_open_sole_supporting_mapped_problem( answer_link );
    return answer_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3369L)
  public static SubLObject answer_link_supporting_problem(final SubLObject answer_link)
  {
    final SubLObject mapped_problem = answer_link_supporting_mapped_problem( answer_link );
    return inference_datastructures_problem_link.mapped_problem_problem( mapped_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3578L)
  public static SubLObject answer_link_supporting_problem_wholly_explanatoryP(final SubLObject answer_link)
  {
    return Equality.eq( $kw4$ALL, answer_link_explanatory_subquery( answer_link ) );
  }

  public static SubLObject declare_inference_worker_answer_file()
  {
    SubLFiles.declareFunction( me, "answer_link_p", "ANSWER-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_answer_link", "NEW-ANSWER-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "new_answer_link_int", "NEW-ANSWER-LINK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_link_supported_inference", "ANSWER-LINK-SUPPORTED-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_link_propagatedP", "ANSWER-LINK-PROPAGATED?", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_link_supporting_mapped_problem", "ANSWER-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_link_explanatory_subquery", "ANSWER-LINK-EXPLANATORY-SUBQUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_answer_link_explanatory_subquery", "SET-ANSWER-LINK-EXPLANATORY-SUBQUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "note_answer_link_propagated", "NOTE-ANSWER-LINK-PROPAGATED", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_link_supporting_problem", "ANSWER-LINK-SUPPORTING-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_link_supporting_problem_wholly_explanatoryP", "ANSWER-LINK-SUPPORTING-PROBLEM-WHOLLY-EXPLANATORY?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_worker_answer_file()
  {
    return NIL;
  }

  public static SubLObject setup_inference_worker_answer_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_worker_answer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_worker_answer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_worker_answer_file();
  }
  static
  {
    me = new inference_worker_answer();
    $kw0$ANSWER = makeKeyword( "ANSWER" );
    $sym1$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym2$ANSWER_LINK_P = makeSymbol( "ANSWER-LINK-P" );
    $sym3$EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol( "EXPLANATORY-SUBQUERY-SPEC-P" );
    $kw4$ALL = makeKeyword( "ALL" );
  }
}
/*
 * 
 * Total time: 84 ms
 * 
 */