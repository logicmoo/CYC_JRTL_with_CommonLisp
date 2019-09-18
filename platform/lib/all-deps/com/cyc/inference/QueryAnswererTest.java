package com.cyc.inference;

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

import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.inference.async.Ticket;
import com.cyc.inference.async.TicketManager;
import com.cyc.kb.TestUtils;

import java.util.Properties;

import org.junit.*;

import static org.junit.Assert.*;

//import org.opencyc.inference.InferenceIdentifier;

/**
 *
 * @author nwinant
 */
public class QueryAnswererTest {

  /** A nice query. One that answers, and isn't *too* expensive. * */
  private static final String QID = "Mx8Ngh4rQsTFGIIMEdaAAACQJ5T1Bh4rNr4qM3_0TB2B-zuP66OI4g";

  public QueryAnswererTest() throws Exception {
  }

    @BeforeClass
    public static void setUpClass() throws Exception {
        TestUtils.ensureConstantsInitialized();
        TicketManager.get().setInferenceCleanupDelaySeconds(300);
    }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
    this.answerer = new QueryAnswerer();
  }

  @After
  public void tearDown() {
    try {
      ticket.relinquish();
    } catch (Exception e) {
    }
  }

  // Tests
  /**
   * Test of getResultsForQuery method, of class QueryAnswerer.
   */
  @Test
  public void testGetResultsForQuery() throws Exception {
    System.out.println("getResultsForQuery");
    final String results = answerer.getResultsForQuery(QID);
    System.out.println("RESULTS: " + results);
    assertNotNull(results);
  }
  // Internal
  private static final String HOST = "localhost";
  private static final int PORT = 3660;
  private QueryAnswerer answerer;
  private Ticket ticket = null;

  /**
   * Test of getResultsForQueryIdAsync method, of class QueryAnswerer.
   */
  //@Test
  public void testGetResultsForQueryIdAsync() throws Exception {
    System.out.println("getResultsForQueryIdAsync");
    ticket = answerer.beginAsyncQuery(QID);
    final String results = ticket.getResult();
    assertNotNull(results);
  }

  /**
   * Test of getResultsForAsyncQuery method, of class QueryAnswerer.
   */
  //@Test
  public void testGetResultsForAsyncQuery() throws Exception {
    System.out.println("getResultsForAsyncQuery");
    ticket = answerer.beginAsyncQuery(QID);
    String results = answerer.getResultsForAsyncQuery(ticket);
    assertNotNull(results);
  }

  /**
   * Test of relinquishTicket method, of class QueryAnswerer.
   */
  @Test
  public void testRelinquishTicket() {
    System.out.println("relinquishTicket");
  }

  /**
   * Test of forgetCachedQueryResults method, of class QueryAnswerer.
   */
  @Test
  public void testForgetCachedQueryResults() {
    System.out.println("forgetCachedQueryResults");
  }

  /**
   * Test of getInferenceIdentifier method, of class QueryAnswerer.
   */
  @Test
  public void testGetInferenceIdentifier() throws Exception {
    System.out.println("getInferenceIdentifier");
    ticket = answerer.beginAsyncQuery(QID);
    final InferenceIdentifier inferenceIdentifier = ticket.getInferenceIdentifier();
    assertNotNull("Couldn't get inference identifier.", inferenceIdentifier);
  }

  /**
   * Test of destroyOneInference method, of class QueryAnswerer.
   */
  @Test
  public void testDestroyOneInference() throws Exception {
    System.out.println("destroyOneInference");
  }

  /**
   * Test of getUUID method, of class QueryAnswerer.
   */
  @Test
  public void testGetUUID() {
    System.out.println("getUUID");
  }
}
