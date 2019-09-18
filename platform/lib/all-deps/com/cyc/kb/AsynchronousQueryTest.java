/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import static com.cyc.kb.TestUtils.*;

import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.ArgPosition;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.InferenceStatus;
import com.cyc.base.inference.InferenceSuspendReason;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.inference.InferenceWorkerListener;
import com.cyc.base.inference.metrics.InferenceMetric;
import com.cyc.kb.exception.KBApiException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.*;

import static org.junit.Assert.*;

import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycArgPosition;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.inference.DefaultInferenceStatus;
import com.cyc.baseclient.inference.metrics.InferenceMetricsValues;
import com.cyc.baseclient.inference.metrics.StandardInferenceMetric;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.baseclient.inference.params.OpenCycInferenceParameterEnum.OpenCycInferenceMode;

/**
 *
 * @author baxter
 */
public class AsynchronousQueryTest {

  static Query q;
  private InferenceParameters defaultParams;

  public AsynchronousQueryTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
    TestUtils.ensureConstantsInitialized();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
    defaultParams = new DefaultInferenceParameters(CycAccessManager.get().getCurrentAccess());
  }

  @After
  public void tearDown() {
    closeTestQuery();
  }

  /**
   * Test of start method, of class Query.
 * @throws CycConnectionException 
 * @throws CycApiException 
 * @throws CycTimeOutException 
   */
  @Test
  public void testStart() throws IOException, InterruptedException, CycTimeOutException, CycApiException, CycConnectionException {
    System.out.println("start");
    q = constructXIsaBirdQuery();
    final InferenceStatus status = q.getStatus();
    q.start();
    waitForQueryToFinish();
    System.out.println(q.getStatus());
    assertFalse("Wrong query status after starting and waiting.", status.equals(q.getStatus()));
  }

  /**
   * Test of stop method, of class Query.
 * @throws CycConnectionException 
 * @throws CycApiException 
 * @throws CycTimeOutException 
   */
  @Test
  public void testStop() throws IOException, InterruptedException, CycTimeOutException, CycApiException, CycConnectionException {
    System.out.println("stop");
    q = constructXIsaBirdQuery();
    q.start();
    q.stop(1);
    waitForQueryToFinish();
    final InferenceStatus status = q.getStatus();
    System.out.println(q.getStatus());
    assertFalse("Wrong query status after starting, stopping and waiting.", status.equals(DefaultInferenceStatus.RUNNING));
  }

  /**
   * Test of continueQuery method, of class Query.
 * @throws CycConnectionException 
 * @throws CycApiException 
 * @throws CycTimeOutException 
   */
  @Test
  public void testContinueQuery() throws IOException, InterruptedException, CycTimeOutException, CycApiException, CycConnectionException {
    System.out.println("continueQuery");
    q = constructXIsaBirdQuery().setInferenceMode(
            OpenCycInferenceMode.MAXIMAL_MODE);
    System.out.println(q.getStatus());
    q.start();
    System.out.println(q.getStatus());
    q.stop(1);
    waitForQueryToFinish();
    System.out.println(q.getStatus());
    q.continueQuery();
    System.out.println(q.getStatus());
  }

  /**
   * Test of addListener method, of class Query.
 * @throws CycConnectionException 
 * @throws CycApiException 
 * @throws CycTimeOutException 
   */
  @Test
  public void testAddListener() throws IOException, InterruptedException, CycTimeOutException, CycApiException, CycConnectionException {
    System.out.println("addListener");
    final TestQueryListener testQueryListener = new TestQueryListener();
    {
      q = constructXIsaBirdQuery().setMaxTime(1).
              addListener(testQueryListener);
      q.start();
      final long startMillis = System.currentTimeMillis();
      while (testQueryListener.terminated == false
              && System.currentTimeMillis() - startMillis < 1000) {
        Thread.sleep(10);
      }
      assertTrue(testQueryListener.terminated);
    }
    {//Try with performInference()
      q.close();
      q = constructXIsaBirdQuery().setMaxTime(1).
              addListener(testQueryListener);
      q.performInference();
      final long startMillis = System.currentTimeMillis();
      while (testQueryListener.terminated == false
              && System.currentTimeMillis() - startMillis < 1000) {
        Thread.sleep(10);
      }
      assertTrue(testQueryListener.terminated);
    }
  }

  /**
   * Test of removeQueryVariable and addQueryVariable methods, of class Query.
   */
  @Test
  public void testAddAndRemoveQueryVariable() throws IOException {
    System.out.println("removeQueryVariable");
    q = constructXIsaBirdQuery();
    assertTrue(q.getQueryVariablesCyc().contains(X));
    q.removeQueryVariable(X);
    assertFalse(q.getQueryVariablesCyc().contains(X));
    q.addQueryVariable(X);
    assertTrue(q.getQueryVariablesCyc().contains(X));
  }
  
  /**
   * Test of removeQueryVariable and addQueryVariable methods of Query class
   * using Variable
 * @throws KBApiException 
   */
  @Test
  public void testAddAndRemoveQueryVariableKBAPI() throws IOException, KBApiException {
	    System.out.println("removeQueryVariable");
	    q = constructXIsaBirdQuery();
	    assertTrue(q.getQueryVariables().contains(kbv));
	    q.removeQueryVariable(kbv);
	    assertFalse(q.getQueryVariables().contains(kbv));
	    q.addQueryVariable(kbv);
	    assertTrue(q.getQueryVariables().contains(kbv));
	  }

  /**
   * Test of setQueryVariables method, of class Query.
   */
  @Test
  public void testSetQueryVariables() throws IOException {
    System.out.println("setQueryVariables");
    q = constructXIsaBirdQuery();
    assertTrue(q + " does not contain " + X, q.getQueryVariablesCyc().contains(X));
    final List<CycVariableI> vars = new ArrayList<CycVariableI>();
    q.setQueryVariablesCyc(vars);
    assertFalse(q.getQueryVariablesCyc().contains(X));
    vars.add(X);
    q.setQueryVariablesCyc(vars);
    assertTrue(q.getQueryVariablesCyc().contains(X));
  }

  /**
   * Test of setQuerySentenceMainClause method, of class Query.
   */
  @Test
  public void testSetQuerySentenceMainClause() throws IOException {
    System.out.println("setQuerySentenceMainClause");
    q = constructXIsaBirdQuery().
            setQuerySentenceMainClause(
            (CycFormulaSentence) xIsaEmu);
    assertEquals(xIsaEmu, q.getQuerySentenceMainClauseCyc());
  }

  /**
   * Test of setQuerySentenceHypothesizedClause method, of class Query.
   */
  @Test
  public void testSetQuerySentenceHypothesizedClause() throws IOException {
    System.out.println("setQuerySentenceHypothesizedClause");
    q = constructXIsaBirdQuery().
            setQuerySentenceHypothesizedClause(
            (CycFormulaSentence) xIsaEmu);
    assertEquals(xIsaEmu, q.getQuerySentenceHypothesizedClauseCyc());
    q.setQuerySentenceHypothesizedClause(
            (CycFormulaSentence) xIsaBird);
    assertEquals(xIsaBird, q.getQuerySentenceHypothesizedClauseCyc());
  }

  /**
   * Test of findRedundantClauses method, of class Query.
   * @throws IOException 
 * @throws CycConnectionException 
 * @throws CycApiException 
   */
  @Test
  public void testFindRedundantClauses() throws IOException, CycApiException, CycConnectionException {
    q = new Query(CycFormulaSentence.makeConjunction(
            xIsaBird, xIsaEmu), INFERENCE_PSC);
    final Collection<Collection<FormulaSentence>> redundantClauses = q.findRedundantClausesCFS();
    assertFalse(redundantClauses.isEmpty());
    final Collection<FormulaSentence> oneSet = redundantClauses.iterator().next();
    assertTrue(oneSet.contains(xIsaBird) && oneSet.contains(xIsaEmu));
  }

  /**
   * Test of findUnconnectedClauses method, of class Query.
 * @throws CycConnectionException 
 * @throws CycApiException 
   */
  @Test
  public void testFindUnconnectedClauses() throws IOException, CycApiException, CycConnectionException {
    System.out.println("findUnconnectedClauses");
    q = new Query(CycFormulaSentence.makeConjunction(
            xIsaBird, xIsaEmu), INFERENCE_PSC);
    final Collection<ArgPosition> unconnectedClauses = q.findUnconnectedClauses();
    assertTrue(unconnectedClauses.isEmpty());
    FormulaSentence newSentence = q.getQuerySentenceMainClauseCyc().deepCopy();
    newSentence.setSpecifiedObject(CycArgPosition.ARG1.deepCopy().extend(
            CycArgPosition.ARG1),
            CycObjectFactory.makeCycVariable("Y"));
    q.setQuerySentenceMainClause((CycFormulaSentence) newSentence);
    unconnectedClauses.addAll(q.findUnconnectedClauses());
    assertFalse(unconnectedClauses.isEmpty());
  }

  /**
   * Test of merge method, of class Query.
 * @throws CycConnectionException 
 * @throws CycApiException 
   */
  @Test
  public void testMerge() throws IOException, KBApiException, CycApiException, CycConnectionException {
    System.out.println("merge");
    q = new Query(xIsaBird, INFERENCE_PSC, defaultParams);
    Query otherQuery = new Query(xIsaEmu,
            INFERENCE_PSC, defaultParams);
    q = q.merge(otherQuery);
    assertTrue(q.getQuerySentenceCyc().treeContains(BIRD));
  }

  /**
   * Test of getStatus method, of class Query.
   */
  @Test
  public void testGetStatus() {
    System.out.println("getStatus");
    // This method is tested in other tests.
  }

  /**
   * Test of setMaxTime method, of class Query.
   */
  @Test
  public void testSetMaxTime() throws IOException {
    System.out.println("setMaxTime");
    q = constructXIsaBirdQuery()
            .setMaxTime(12);
    assertTrue(12 == q.getMaxTime());
  }

  /**
   * Test of setMaxNumber method, of class Query.
   */
  @Test
  public void testSetMaxNumber() throws IOException {
    System.out.println("setMaxNumber");
    q = constructXIsaBirdQuery()
            .setMaxNumber(12);
    assertTrue(12 == q.getMaxNumber());
  }

  /**
   * Test of setInferenceMode method, of class Query.
   */
  @Test
  public void testSetInferenceMode() throws IOException {
    System.out.println("setInferenceMode");
    q = constructXIsaBirdQuery()
            .setInferenceMode(
            OpenCycInferenceMode.MINIMAL_MODE);
    assertEquals(OpenCycInferenceMode.MINIMAL_MODE, q.getInferenceMode());
  }

  private static void waitForQueryToFinish() throws InterruptedException {
    Thread.sleep(1000);
  }

  private static class TestQueryListener implements InferenceWorkerListener {

    private boolean created = false;
    private boolean terminated = false;
    private final List<InferenceStatus> statuses = new ArrayList<InferenceStatus>();
    private final List answers = new ArrayList();

    public TestQueryListener() {
    }

    @Override
    public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
      System.out.println("Inference created.");
      created = true;
    }

    @Override
    public void notifyInferenceStatusChanged(InferenceStatus oldStatus,
            InferenceStatus newStatus,
            InferenceSuspendReason suspendReason,
            InferenceWorker inferenceWorker) {
      System.out.println(
              "Inference status changed from " + oldStatus + " to " + newStatus);
      statuses.add(oldStatus);
      statuses.add(newStatus);
    }

    @Override
    public void notifyInferenceAnswersAvailable(
            InferenceWorker inferenceWorker,
            List newAnswers) {
      System.out.println("New answers: " + newAnswers);
      answers.addAll(newAnswers);
    }

    @Override
    public void notifyInferenceTerminated(InferenceWorker inferenceWorker,
            Exception e) {
      System.out.println("Inference terminated.");
      terminated = true;
    }
  }

  /**
   * Test of addQueryVariable method, of class Query.
   */
  @Test
  public void testAddQueryVariable() {
  }

  /**
   * Test of removeQueryVariable method, of class Query.
   */
  @Test
  public void testRemoveQueryVariable() {
  }

  /**
   * Test of bindVariable method, of class Query.
   */
  @Test
  public void testBindVariable_String_Object() throws IOException {
    q = constructXIsaBirdQuery();
    assertTrue(q + " does not contain " + X, q.getQueryVariablesCyc().contains(X));
    q.bindVariable("?X", BIRD);
    assertFalse(q + " contains " + X, q.getQueryVariablesCyc().contains(X));
    q.setQuerySentenceMainClause((CycFormulaSentence) xIsaBird.deepCopy());
    assertTrue(q + " does not contain " + X, q.getQueryVariablesCyc().contains(X));
    q.bindVariable("X", BIRD);
  }

  /**
   * Test of bindVariable method, of class Query.
   */
  @Test
  public void testBindVariable_CycVariable_Object() throws IOException {
    q = constructXIsaBirdQuery();
    assertTrue(q + " does not contain " + X, q.getQueryVariablesCyc().contains(X));
    q.bindVariable(X, BIRD);
    assertFalse(q + " contains " + X, q.getQueryVariablesCyc().contains(X));
  }

  /**
   * Test of metrics accessors, of class Query.
 * @throws CycConnectionException 
 * @throws CycApiException 
 * @throws CycTimeOutException 
   */
  @Test
  public void testMetrics() throws IOException, InterruptedException, CycTimeOutException, CycApiException, CycConnectionException {
    System.out.println("testMetrics");
    q = constructXIsaBirdQuery();
    // Gather up all the metrics we have java constants for:
    final List<? extends InferenceMetric> metricsList = Arrays.asList(
            StandardInferenceMetric.ANSWER_COUNT, StandardInferenceMetric.HYPOTHESIZATION_TIME, StandardInferenceMetric.LINK_COUNT,
            StandardInferenceMetric.PROBLEM_COUNT, StandardInferenceMetric.PROBLEM_STORE_PROBLEM_COUNT,
            StandardInferenceMetric.PROBLEM_STORE_PROOF_COUNT, StandardInferenceMetric.PROOF_COUNT,
            StandardInferenceMetric.SKSI_QUERY_START_TIMES, StandardInferenceMetric.SKSI_QUERY_TOTAL_TIME,
            StandardInferenceMetric.TACTIC_COUNT, StandardInferenceMetric.TIME_PER_ANSWER, StandardInferenceMetric.TIME_TO_FIRST_ANSWER,
            StandardInferenceMetric.TIME_TO_LAST_ANSWER, StandardInferenceMetric.TOTAL_TIME, StandardInferenceMetric.WASTED_TIME_AFTER_LAST_ANSWER);
    // Add them all to our query:
    q.getMetrics().addAll(metricsList);
    q.start();
    waitForQueryToFinish();
    final InferenceMetricsValues metricsValues = (InferenceMetricsValues) q.getMetricsValues();
    for (final InferenceMetric metric : metricsList) {
      final Object value = metricsValues.getValue(metric);
      System.out.println(metric + ": " + value);
      assertNotNull("Got null for " + metric, value);
    }
  }

  /**
   * Test of setMetrics method, of class Query.
   */
  @Test
  public void testSetMetrics() throws IOException, InterruptedException {
  }
}
