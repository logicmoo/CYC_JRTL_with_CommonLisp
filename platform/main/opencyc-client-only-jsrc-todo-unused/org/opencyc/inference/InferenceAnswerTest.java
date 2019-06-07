/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opencyc.inference;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.opencyc.api.TestUtils.getCyc;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycInformationSource;
import org.opencyc.cycobject.ELMt;
import org.opencyc.cycobject.ELMtConstant;
import org.opencyc.cycobject.Guid;
import org.opencyc.util.TimeOutException;

/**
 *
 * @author baxter
 */
public abstract class InferenceAnswerTest {

  protected static final ELMtConstant TKB_MT = ELMtConstant.makeELMtConstant(new CycConstant("TKBSourceSpindleCollectorMt", new Guid("a0f3570a-444c-41d7-8eb6-dd385690e4bf")));
  protected static final String WHAT_IS_ONE_PLUS_ONE = "(#$evaluate ?X (#$PlusFn 1 1))";

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
    if (worker != null) {
      try {
        worker.cancel();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }

  /**
   * Test of getAnswerID method, of class CycBackedInferenceAnswer.
   */
  @Test
  public void testGetAnswerID() throws IOException {
    System.out.println("getAnswerID");
    InferenceAnswer instance = getFirstInferenceAnswer(WHAT_IS_ONE_PLUS_ONE, CycAccess.baseKB);
    int identifier = instance.getAnswerID();
    assertNotNull(identifier);
    assertEquals(0, identifier);
  }

  /**
   * Test of getBinding method, of class CycBackedInferenceAnswer.
   */
  @Test
  public void testGetBinding() throws Exception {
    System.out.println("getBinding");
    InferenceAnswer inferenceAnswer = getFirstInferenceAnswer(WHAT_IS_ONE_PLUS_ONE, CycAccess.baseKB);
    assertEquals(2, inferenceAnswer.getBinding(CycObjectFactory.makeCycVariable("X")));
  }

  /**
   * Test of getBindings method, of class CycBackedInferenceAnswer.
   */
  @Test
  public void testGetBindings() throws Exception {
    System.out.println("getBindings");
    InferenceAnswer instance = getFirstInferenceAnswer(WHAT_IS_ONE_PLUS_ONE, CycAccess.baseKB);
    Map bindings = instance.getBindings();
    assertEquals(1, bindings.size());
    assertEquals(2, bindings.get(CycObjectFactory.makeCycVariable("X")));
  }
  private DefaultInferenceWorker worker = null;

  protected InferenceAnswer getFirstInferenceAnswer(
          final String querySentence,
          final ELMt mt) throws IOException, TimeOutException, CycApiException {
    worker = new DefaultInferenceWorkerSynch(
            getCyc().makeCycSentence(querySentence), mt, null, getCyc(), 10000);
    ((DefaultInferenceWorkerSynch) worker).performSynchronousInference();
    InferenceSuspendReason suspendReason = worker.getSuspendReason();
    assertFalse("Got error running query " + querySentence + ": "
            + suspendReason, suspendReason.isError());
    assertTrue(worker.getAnswersCount() > 0);
    final InferenceAnswer inferenceAnswer =
            constructFirstInferenceAnswer(worker);
    return inferenceAnswer;
  }

  protected abstract InferenceAnswer constructFirstInferenceAnswer(DefaultInferenceWorker worker);
}
