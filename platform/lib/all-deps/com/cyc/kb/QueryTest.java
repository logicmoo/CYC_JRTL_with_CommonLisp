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
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.inference.InferenceStatus;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.inference.InferenceWorkerListener;
import com.cyc.base.inference.InferenceSuspendReason;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.inference.DefaultInferenceStatus;
import com.cyc.baseclient.inference.params.OpenCycInferenceParameterEnum;
import com.cyc.kb.Query.Category;
import com.cyc.kb.client.AssertionImpl;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.VariableImpl;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class QueryTest {

  private static final String INFERENCE_PSC = "InferencePSC";
  private static Logger log = null;
  private static final String queryStringAnimals = "(elementOf ?N (TheSet Emu Zebra))";
  private static final String queryStringAssemblingSlots = "(#$nearestRequiredActorSlots #$Assembling ?ACTOR)";
  private static final String queryStringAbesAPresident = "(#$isa #$AbrahamLincoln #$UnitedStatesPresident)";
  private static final String queryStringConditional = "(implies " + queryStringAssemblingSlots + " " + queryStringAbesAPresident + ")";
  private static KBCollection emu;
  private static KBCollection zebra;
  private static final String WHAT_IS_ABE = "(#$isa #$AbrahamLincoln ?TYPE)";
  private Query q = null;
  private KBInferenceResultSet r = null;

  @BeforeClass
  public static void setUpClass() throws Exception {
    TestUtils.ensureConstantsInitialized();
    log = Logger.getLogger(QueryTest.class.getName());
    emu = KBCollectionImpl.get("Emu");
    zebra = KBCollectionImpl.get("Zebra");
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
    if (q != null) {
      q.close();
    }
  }

  @Test
  public void testGetInferenceIdentifier() throws IOException {
    System.out.println("testGetInferenceIdentifier");
    q = new Query(queryStringAnimals);
    try {
      q.retainInference();
      assertNull(q.getInferenceIdentifier());
      q.addListener(new InferenceWorkerListener() {
        int problemStoreID;

        @Override
        public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
          try {
            assertNotNull(q.getInferenceIdentifier());
            problemStoreID = q.getInferenceIdentifier().getProblemStoreID();
            System.out.println("Problem store ID: " + problemStoreID);
            assertTrue("Got problem store ID " + problemStoreID, problemStoreID > 1);
          } catch (CycConnectionException ex) {
            ex.printStackTrace();
            fail("Caught exception.");
          }
        }

        @Override
        public void notifyInferenceStatusChanged(InferenceStatus oldStatus, InferenceStatus newStatus, InferenceSuspendReason suspendReason, InferenceWorker inferenceWorker) {
          System.out.println(oldStatus + " -> " + newStatus);
        }

        @Override
        public void notifyInferenceAnswersAvailable(InferenceWorker inferenceWorker, List newAnswers) {
          try {
            final int problemStoreID1 = q.getInferenceIdentifier().getProblemStoreID();
            assertEquals("Inference answers available; problem store ID now " + problemStoreID1,
                    problemStoreID, problemStoreID1);
          } catch (CycConnectionException ex) {
            ex.printStackTrace();
            fail("Caught exception.");
          }
        }

        @Override
        public void notifyInferenceTerminated(InferenceWorker inferenceWorker, Exception e) {
          try {
            final int problemStoreID1 = q.getInferenceIdentifier().getProblemStoreID();
            assertEquals("Inference terminated; problem store ID now " + problemStoreID1,
                    problemStoreID, problemStoreID1);
          } catch (CycConnectionException ex) {
            ex.printStackTrace();
            fail("Caught exception.");
          }
        }
      });
      q.performInference();
      assertNotNull(q.getInferenceIdentifier());
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Caught exception running testGetInferenceIdentifier");
    }
  }

  @Test
  public void testQueryString() {

    try {
      //String queryStr = "(#$visuallyDepicts-Type-Precise (AVWorkWithIDFn 6184) ?TYPE)";
      String queryStr = queryStringAssemblingSlots;
      q = new Query(queryStr);
      KBInferenceResultSet results = q.getResultSet();
      while (results.next()) {
        System.out.println("All types: " + results.getObject("?ACTOR"));
      }

    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create a Query from a query string.");
    }
  }

  @Test
  public void testBooleanQueryString() {

    try {
      String queryStr = queryStringAbesAPresident;
      q = new Query(queryStr, INFERENCE_PSC);
      assertTrue(q.isTrue());

    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create a Query from a query string.");
    }
  }

  @Test
  public void testCycAssertionAsBinding() throws Exception {
    q = new Query("(assertionSentence ?AS (genls Emu ?X))", INFERENCE_PSC);
    final Object binding = q.getAnswer(0).getBinding(CycObjectFactory.makeCycVariable("AS"));
    assertTrue("Wanted a CycAssertion, got " + binding.getClass().getSimpleName(),
            binding instanceof CycAssertion);
  }

  @Test
  public void testQueryStringString() {

    try {
      String queryStr = WHAT_IS_ABE;
      r = new Query(queryStr, "PeopleDataMt").getResultSet();
      while (r.next()) {
        System.out.println("All types: " + r.getObject("?TYPE", KBCollection.class));
      }

    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create a Query from a query string.");
    }
  }

  @Test
  public void testContinuableQuery() {
    System.out.println("testContinuableQuery");
    try {
      q = new Query(WHAT_IS_ABE, "#$PeopleDataMt");
      q.setInferenceMode(OpenCycInferenceParameterEnum.OpenCycInferenceMode.MINIMAL_MODE);
      q.setMaxNumber(1);
      q.setContinuable(true);
      assertTrue("Query not continuable.", q.isContinuable());
      int answerCount = q.getAnswerCount();
      assertEquals("Expected one answer, got " + answerCount, 1, answerCount);
      q.continueQuery();
      int updatedAnswerCount = q.getAnswerCount();
      while (updatedAnswerCount > answerCount) {
        answerCount = updatedAnswerCount;
        q.continueQuery();
        updatedAnswerCount = q.getAnswerCount();
      }
      assertTrue("Found only " + answerCount + " answers.", answerCount > 1);
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create a Query from a query string.");
    }
  }

  @Test
  public void testQueryStringStringString() {
    try {

      String queryStr = WHAT_IS_ABE;

      r = new Query(queryStr, "#$PeopleDataMt",
              ":INFERENCE-MODE :MINIMAL :MAX-TIME 1 :MAX-NUMBER 12").getResultSet();
      while (r.next()) {
        System.out.println("TYPE: " + r.getObject("?TYPE", KBObject.class));
      }

    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create a Query from a query string.");
    }
  }

  @Test
  public void testGetStringClassOfO() {
    //fail("Not yet implemented");
  }

  @Test
  public void testGetIntClassOfO() {
    //fail("Not yet implemented");
  }

  @Test
  public void testFindColumn() {
    //fail("Not yet implemented");
  }

  /**
   * Test of getId method, of class Query.
   */
  @Test
  public void testGetId() throws Exception {
    System.out.println("getId and saveAs");
    q = new Query(queryStringAssemblingSlots);
    final KBIndividual id = q.saveAs("TestQuery-AssemblingSlots");
    try {
      assertEquals(id, q.getId());
    } finally {
      id.delete();
    }
  }

  /**
   * Test of setId method, of class Query.
   */
  @Test
  public void testSetId() throws IOException {
  }

  /**
   * Test of load method, of class Query.
   */
  @Test
  public void testLoad() throws Exception {
    System.out.println("load");
    //Query conceptFinder = Query.load(new KBIndividual("AURORAQuery-PredictAllFeaturesFromReifiedVideosUsingThisFeatureSet"));
    q = new Query(queryStringAssemblingSlots);
    final KBIndividual id = q.saveAs("TestQuery-AssemblingSlots");
    try {
      final Query loadedQuery = Query.load(id);
      assertEquals("Query contexts are different.", q.getContext(),
              loadedQuery.getContext());
      assertEquals("Query sentences are different.", q.getQuerySentenceCyc(),
              loadedQuery.getQuerySentenceCyc());
    } finally {
      id.delete();
    }
  }

  //@Test Depends on #$TestKBQuery
  public void testKBQ() throws Exception {
    r = Query.load(KBIndividualImpl.get("TestKBQuery")).getResultSet();
    while (r.next()) {
      System.out.println("Dog: " + r.getObject(TestUtils.X.toCanonicalString(),
              KBIndividual.class));
    }
  }

  @Test
  public void testKBQIndexical() throws Exception {
    System.out.println("testKBQIndexical");

    q = new Query("(#$isa (#$TheFn #$Dog) #$Dog)");
    q.saveAs("TestKBQueryIndexical-2012-01-16");

    try {
      Map<CycObject, Object> indexicals = new HashMap<CycObject, Object>();
      indexicals.put((CycObject) CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownFortByName(
              "(#$TheFn #$Dog)"),
              (CycObject) CycObjectFactory.makeCycVariable("X"));

      Query query = Query.loadCycObjectMap(KBIndividualImpl.get("TestKBQueryIndexical-2012-01-16"),
              indexicals);
      r = query.getResultSet();
      while (r.next()) {
        System.out.println("Dog: " + r.getObject("?X", KBIndividual.class));
      }
    } finally {
      q.getId().delete();
    }
  }

  @Test
  public void testKBQIndexicalKBObject() throws Exception {
    System.out.println("testKBQIndexicalKBObject");

    q = new Query("(#$isa (#$TheFn #$Dog) #$Dog)");
    q.saveAs("TestKBQueryKBObject-2014-04-1");

    try {
      Map<KBObject, Object> indexicals = new HashMap<KBObject, Object>();
      indexicals.put(KBIndividualImpl.get("(#$TheFn #$Dog)"),
              new VariableImpl("X"));

      r = Query.load(KBIndividualImpl.get("TestKBQueryKBObject-2014-04-1"),
              indexicals).getResultSet();
      while (r.next()) {
        System.out.println("Dog: " + r.getObject("?X", KBIndividual.class));
      }
    } finally {
      q.getId().delete();
    }
  }

  @Test
  public void testKBQIndexicalString() throws Exception {
    System.out.println("testKBQIndexicalString");

    q = new Query("(#$isa (#$TheFn #$Dog) #$Dog)");
    q.saveAs("TestKBQuery-Vijay-2012-01-16");
    try {
      // The bound query is converted to an unbound query.
      // The "(#$TheFn #$Dog)" in the query is replaced with "?X".
      Map<String, String> indexicals = new HashMap<String, String>();
      indexicals.put("(#$TheFn #$Dog)", "?X");

      r = Query.load("TestKBQuery-Vijay-2012-01-16", indexicals).getResultSet();

      while (r.next()) {
        System.out.println("Dog: " + r.getObject("?X", KBIndividual.class));
      }
    } finally {
      q.getId().delete();
    }
  }

  @Test
  public void testKBQIndexicalVarToConst() throws Exception {
    System.out.println("testKBQIndexicalVarToConst");

    q = new Query("(#$and (#$isa ?X #$Dog) (#$owns ?Y ?X))", "#$EverythingPSC");
    q.saveAs("TestKBQueryDogOwners-Vijay-2012-01-16");

    try {
      Map<String, String> indexicals = new HashMap<String, String>();
      indexicals.put("?Y", "AbrahamLincoln");

      r = Query.load("TestKBQueryDogOwners-Vijay-2012-01-16", indexicals).getResultSet();
      while (r.next()) {
        System.out.println("Answer " + r.getObject("?X", KBIndividual.class));
      }
    } finally {
      q.getId().delete();
    }
  }

  @Test
  public void testKBQIndexicalAurora() throws Exception {
    if (!CycAccessManager.get().getCurrentAccess().isOpenCyc()) {
      System.out.println("testKBQIndexicalAurora");
      Map<CycObject, Object> binding = new HashMap<CycObject, Object>();
      binding.put(CycObjectFactory.makeCycVariable("?VIDEO-ID"), 27850);
      //Idiotically, need #$ here
      binding.put(CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownFortByName(
              "(#$TheFn #$AuroraConceptIDSourceStore)"),
              CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownFortByName("MED12-SIN-Concept-List"));

      Query conceptFinder = Query.loadCycObjectMap(
              KBIndividualImpl.get(
                      "AURORAQuery-PredictAllFeaturesFromReifiedVideosUsingThisFeatureSet"),
              binding);
      conceptFinder.setMaxTime(30).setMaxNumber(10);
      r = conceptFinder.getResultSet();
      while (r.next()) {
        System.out.println("Answer " + r.getObject("?READABLE",
                String.class));
      }
    }
  }

  /**
   * Test of save method, of class Query.
   */
  @Test
  public void testSave() throws Exception {
  }

  /**
   * Test of saveAs method, of class Query.
   */
  @Test
  public void testSaveAs() throws Exception {
  }

  /**
   * Test of getCategories method, of class Query.
   */
  @Test
  public void testGetCategories() throws IOException {
    System.out.println("getCategories");
    q = new Query(queryStringAssemblingSlots);
    assertTrue(q.getCategories().isEmpty());
  }

  /**
   * Test of addCategory method, of class Query.
   */
  @Test
  public void testAddCategory() throws IOException {
    System.out.println("addCategory");
    q = new Query(queryStringAssemblingSlots);
    Category cat = Category.get("Test Queries");
    q.addCategory(cat);
    assertTrue(q.getCategories().contains(cat));
  }

  /**
   * Test of getAnswerCount method, of class Query.
 * @throws CycConnectionException 
 * @throws CycTimeOutException 
 * @throws CycApiException 
   */
  @Test
  public void testGetAnswerCount() throws IOException, CycApiException, CycTimeOutException, CycConnectionException {
    System.out.println("getAnswerCount");
    q = new Query(queryStringAnimals, INFERENCE_PSC);
    assertEquals(2, q.getAnswerCount());
  }

  /**
   * Test of getContext method, of class Query.
   */
  @Test
  public void testGetContext() throws Exception {
    System.out.println("getContext");
    q = new Query(queryStringAssemblingSlots, INFERENCE_PSC);
    assertEquals(ContextImpl.get(INFERENCE_PSC), q.getContext());
  }

  /**
   * Test of getQuerySentence method, of class Query.
   */
  @Test
  public void testgetQuerySentenceCyc() throws Exception {
    System.out.println("getQuerySentence");
    q = new Query(queryStringAssemblingSlots, INFERENCE_PSC);
    assertEquals(queryStringAssemblingSlots, q.getQuerySentenceCyc().cyclify());
  }

  /**
   * Test of getQuerySentenceMainClauseCyc method, of class Query.
   */
  @Test
  public void testgetQuerySentenceMainClauseCyc() throws IOException {
    System.out.println("getQuerySentenceMainClauseCyc");
    q = new Query(queryStringAssemblingSlots, INFERENCE_PSC);
    assertEquals(queryStringAssemblingSlots,
            q.getQuerySentenceMainClauseCyc().cyclify());
  }

  /**
   * Test of getQuerySentenceHypothesizedClause method, of class Query.
   */
  @Test
  public void testGetQuerySentenceHypothesizedClause() throws IOException {
    System.out.println("getQuerySentenceHypothesizedClause");
    q = new Query(queryStringConditional, INFERENCE_PSC);
    assertEquals(queryStringAssemblingSlots,
            q.getQuerySentenceHypothesizedClauseCyc().cyclify());
    assertEquals(queryStringAbesAPresident,
            q.getQuerySentenceMainClauseCyc().cyclify());
  }

  /**
   * Test of getMaxTime method, of class Query.
   */
  @Test
  public void testGetMaxTime() throws IOException {
    System.out.println("getMaxTime");
    q = new Query(queryStringAssemblingSlots);
    assertEquals(null, q.getMaxTime());
  }

  /**
   * Test of getMaxNumber method, of class Query.
   */
  @Test
  public void testGetMaxNumber() throws IOException {
    System.out.println("getMaxNumber");
    q = new Query(queryStringAssemblingSlots);
    assertEquals(null, q.getMaxNumber());
  }

  /**
   * Test of getInferenceMode method, of class Query.
   */
  @Test
  public void testGetInferenceMode() throws IOException {
    System.out.println("getInferenceMode");
    q = new Query(queryStringAssemblingSlots);
    assertEquals(null, q.getInferenceMode());
  }

  /**
   * Test of getStatus method, of class Query.
 * @throws CycConnectionException 
 * @throws CycApiException 
 * @throws CycTimeOutException 
   */
  @Test
  public void testGetStatus() throws IOException, CycTimeOutException, CycApiException, CycConnectionException {
    System.out.println("getStatus");
    q = new Query(queryStringAssemblingSlots);
    q.performInference();
    assertEquals(DefaultInferenceStatus.SUSPENDED, q.getStatus());
  }

  /**
   * Test of get method, of class Query.
   */
  @Test
  public void testGet() throws Exception {
    System.out.println("get");
    r = new Query(queryStringAnimals).getResultSet();
    r.next();
    final KBCollection animal = (KBCollection) r.getKBObject("?N");
    final List<KBCollection> emuAndZebra = Arrays.asList(emu, zebra);
    assertTrue("Couldn't find " + animal + " (" + animal.getClass().getSimpleName()
            + ") in " + emuAndZebra, emuAndZebra.contains(animal));
  }
   
  /**
   * Test of isTrue method, of class Query.
   */
  @Test
  public void testIsTrue() throws Exception {
    System.out.println("isTrue");
    q = new Query(queryStringAbesAPresident);
    assertTrue(q.isTrue());
  }

  /**
   * Test of isProvable method, of class Query.
   */
  @Test
  public void testIsProvable() throws Exception {
    System.out.println("isProvable");
    q = new Query(queryStringAbesAPresident);
    assertTrue(q.isProvable());
    q.close();
    q = new Query(queryStringAnimals);
    assertTrue(q.isProvable());
  }

  @Test
  public void testClearResults() throws Exception {
    System.out.println("clearResults");
    final String whatTimeIsIt = "(#$indexicalReferent #$Now-Indexical ?NOW)";
    q = new Query(whatTimeIsIt);
    final CycVariableI var = CycObjectFactory.makeCycVariable("NOW");
    final Object firstTime = q.getAnswer(0).getBinding(var);
    assertEquals(firstTime, q.getAnswer(0).getBinding(var));
    q.clearResults();
    Thread.sleep(1500);
    assertFalse(firstTime.equals(q.getAnswer(0).getBinding(var)));
  }

  /**
   * Test of next method, of class Query.
   */
  @Test
  public void testNext() throws Exception {
    System.out.println("next");
    r = new Query(queryStringAnimals).getResultSet();
    assertTrue(r.next());
  }

  /**
   * Test of close method, of class Query.
   */
  @Test
  public void testClose() throws IOException {
    System.out.println("close");
    q = new Query(queryStringAnimals);
    q.close();
  }

  /**
   * Test of getResultSet method, of class Query.
   */
  @Test
  public void testGetResultSet() throws Exception {
    System.out.println("getResultSet");
    q = new Query(queryStringAnimals);
    q.getResultSet();
  }

  /**
   * Test of getQueryVariablesCyc method, of class Query.
   */
  @Test
  public void testGetQueryVariables() throws IOException {
    System.out.println("getQueryVariablesCyc");
    q = new Query(queryStringAnimals);
    assertTrue(q.getQueryVariablesCyc().contains(CycObjectFactory.makeCycVariable(
            "N")));
    q.close();
    q = new Query(queryStringConditional);
    assertTrue(q.getQueryVariablesCyc().isEmpty());
  }

  @Test
  public void testFactFromCycAssertion() throws IOException, Exception {
    String assertionStr = "(#$isa #$Thing #$Collection)";

    Query q = new Query(assertionStr, "InferencePSC");
    q.performInference();
    r = q.getResultSet();
    while (r.next()) {
      Fact f = r.getObject("?ASSERTION", Fact.class);
      final CycObject cycAssertion = f.getCore();
      assertEquals(f, AssertionImpl.get(cycAssertion));
    }
  }
}
