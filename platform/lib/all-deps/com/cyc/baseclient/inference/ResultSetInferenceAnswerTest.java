package com.cyc.baseclient.inference;

import com.cyc.base.inference.InferenceAnswer;
import com.cyc.baseclient.inference.DefaultResultSet;
import com.cyc.baseclient.inference.DefaultInferenceWorker;
import com.cyc.baseclient.inference.ResultSetInferenceAnswer;

/**
 *
 * @author baxter
 */
public class ResultSetInferenceAnswerTest extends InferenceAnswerTest {

  public ResultSetInferenceAnswerTest() {
  }

  @Override
  protected InferenceAnswer constructFirstInferenceAnswer(DefaultInferenceWorker worker) {
    return new ResultSetInferenceAnswer(new DefaultResultSet(worker.getAnswers(), worker), 0);
  }
}
