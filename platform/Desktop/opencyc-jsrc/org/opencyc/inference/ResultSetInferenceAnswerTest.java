package org.opencyc.inference;

/**
 *
 * @author baxter
 */
public class ResultSetInferenceAnswerTest extends InferenceAnswerTest {

  public ResultSetInferenceAnswerTest() {
  }

  @Override
  protected InferenceAnswer constructFirstInferenceAnswer(DefaultInferenceWorker worker) {
    return new ResultSetInferenceAnswer(new InferenceResultSet(worker.getAnswers(), worker), 0);
  }
}
