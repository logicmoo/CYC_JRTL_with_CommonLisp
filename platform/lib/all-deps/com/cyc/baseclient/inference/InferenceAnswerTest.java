package com.cyc.baseclient.inference;

import com.cyc.base.CycConnectionException;

import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static com.cyc.baseclient.api.TestUtils.getCyc;

import com.cyc.base.CycApiException;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.baseclient.cycobject.ELMtConstant;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.base.CycTimeOutException;
import com.cyc.baseclient.CommonConstants;

/**
 *
 * @author baxter
 */
public abstract class InferenceAnswerTest {

  protected static final ELMtConstant TKB_MT = ELMtConstant.makeELMtConstant(new CycConstant("TKBSourceSpindleCollectorMt", new CycGuid("a0f3570a-444c-41d7-8eb6-dd385690e4bf")));
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
      } catch (CycConnectionException ex) {
        ex.printStackTrace();
      }
    }
  }

  /**
   * Test of getAnswerID method, of class CycBackedInferenceAnswer.
   */
  @Test
  public void testGetAnswerID() throws CycConnectionException {
    System.out.println("getAnswerID");
    InferenceAnswer instance = getFirstInferenceAnswer(WHAT_IS_ONE_PLUS_ONE, CommonConstants.baseKB);
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
    InferenceAnswer inferenceAnswer = getFirstInferenceAnswer(WHAT_IS_ONE_PLUS_ONE, CommonConstants.baseKB);
    assertEquals(2, inferenceAnswer.getBinding(CycObjectFactory.makeCycVariable("X")));
  }

  /**
   * Test of getBindings method, of class CycBackedInferenceAnswer.
   */
  @Test
  public void testGetBindings() throws Exception {
    System.out.println("getBindings");
    InferenceAnswer instance = getFirstInferenceAnswer(WHAT_IS_ONE_PLUS_ONE, CommonConstants.baseKB);
    Map bindings = instance.getBindings();
    assertEquals(1, bindings.size());
    assertEquals(2, bindings.get(CycObjectFactory.makeCycVariable("X")));
  }
  private DefaultInferenceWorker worker = null;

  protected InferenceAnswer getFirstInferenceAnswer(
          final String querySentence,
          final ELMt mt) throws CycConnectionException, CycTimeOutException, CycApiException {
    worker = new DefaultInferenceWorkerSynch(
            getCyc().getObjectTool().makeCycSentence(querySentence), mt, null, getCyc(), 10000);
    ((DefaultInferenceWorkerSynch) worker).performSynchronousInference();
    DefaultInferenceSuspendReason suspendReason = worker.getSuspendReason();
    assertFalse("Got error running query " + querySentence + ": "
            + suspendReason, suspendReason.isError());
    assertTrue(worker.getAnswersCount() > 0);
    final InferenceAnswer inferenceAnswer =
            constructFirstInferenceAnswer(worker);
    return inferenceAnswer;
  }

  protected abstract InferenceAnswer constructFirstInferenceAnswer(DefaultInferenceWorker worker);
}
