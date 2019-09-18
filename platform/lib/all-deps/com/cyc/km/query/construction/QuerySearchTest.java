/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.km.query.construction;

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
import com.cyc.nl.Span;
import com.cyc.kb.Query;
import com.cyc.km.modeling.task.CycBasedTask;
import com.cyc.kb.TestUtils;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author baxter
 */
public class QuerySearchTest {

  private static final String searchString = "How many chromosomes do plants have?";
  private static CycBasedTask task;
  private static QuerySearch querySearch;
  private static KBObject plant;

  public QuerySearchTest() {
  }

  @BeforeClass
  public static void setUpClass() throws KBApiException, IOException {
    TestUtils.ensureConstantsInitialized();
    task = new CycBasedTask(KBIndividualImpl.get("GeneralCycKETask-Allotment"));
    plant = KBCollectionImpl.get("Plant");
    querySearch = new QuerySearch(searchString, task);
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of getSearchString method, of class QuerySearch.
   */
  @Test
  public void testGetSearchString() {
    System.out.println("getSearchString");
    String expResult = searchString;
    String result = querySearch.getSearchString();
    assertEquals(expResult, result);
  }

  /**
   * Test of getTerms method, of class QuerySearch.
   */
  @Test
  public void testGetTerms() throws UnknownHostException, IOException {
    System.out.println("getTerms");
    Collection result = querySearch.getTerms();
    assertTrue("Failed to find " + plant, result.contains(plant));
  }

  /**
   * Test of getTermLocations method, of class QuerySearch.
   *
   */
  @Test
  public void testGetTermLocations() {
    System.out.println("getTermLocations");
    Collection<Span> result = querySearch.getTermLocations(plant);
    final Span span = new Span(24, 29);
    assertTrue("Failed to find " + span + " Found " + result, result.contains(
            span));
  }

  /**
   * Test of getSituatedTerms method, of class QuerySearch.
   */
  @Test
  public void testGetSituatedTerms() {
    System.out.println("getSituatedTerms");
    Collection<Span> result = querySearch.getSituatedTerms().get(plant);
    final Span span = new Span(24, 29);
    assertTrue("Failed to find " + span + " Found " + result, result.contains(
            span));
  }

  /**
   * Test of getQueries method, of class QuerySearch.
   */
  @Test
  public void testGetQueries() {
    System.out.println("getQueries");
    Collection<Query> result = Collections.emptyList();
    try {
      result = querySearch.getQueries();
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
      fail("Got exception getting queries.");
    }
    assertFalse("Found no queries.", result.isEmpty());
  }

  /**
   * Test of getQueryLocations method, of class QuerySearch.
   */
  @Test
  public void testGetQueryLocations() throws KBApiException {
    System.out.println("getQueryLocations");
    final Collection<Query> queries = querySearch.getQueries();
    final KBPredicate targetPred = KBPredicateImpl.get("cellHasNumberOfChromosomes");
    final String targetSubstring = "How many chromosomes";
    boolean foundTarget = false;
    for (final Query query : queries) {
      if (targetPred.equals(query.getQuerySentence().getArgument(0))) {
        foundTarget = true;
        Collection<Span> locations = querySearch.getQueryLocations(query);
        final Span span = new Span(querySearch.getSearchString().indexOf(
                targetSubstring), targetSubstring.length() - 1);
        assertTrue("Failed to find " + span + " Found " + locations,
                locations.contains(span));
      }
    }
    assertTrue("Failed to find query using " + targetPred, foundTarget);
  }

  /**
   * Test of getSituatedQueries method, of class QuerySearch.
   */
  @Test
  public void testGetSituatedQueries() throws KBApiException {
    System.out.println("getSituatedQueries");
    final Collection<Query> queries = querySearch.getQueries();
    final KBPredicate targetPred = KBPredicateImpl.get("cellHasNumberOfChromosomes");
    final String targetSubstring = "How many chromosomes";
    boolean foundTarget = false;
    final Map<Query, Collection<Span>> situatedQueries = querySearch.getSituatedQueries();
    assertTrue("Found only " + situatedQueries.size() + " situated queries.",
            (situatedQueries.size() > 1));
    for (final Query query : queries) {
      if (targetPred.equals(query.getQuerySentence().getArgument(0))) {
        foundTarget = true;
        Collection<Span> locations = situatedQueries.get(query);
        final Span span = new Span(querySearch.getSearchString().indexOf(
                targetSubstring), targetSubstring.length() - 1);
        assertTrue("Failed to find " + span + ". Found " + locations,
                locations.contains(span));
      }
    }
    assertTrue("Failed to find query using " + targetPred, foundTarget);
  }

  /**
   * Test of getTask method, of class QuerySearch.
   */
  @Test
  public void testGetTask() {
    System.out.println("getTask");
    CycBasedTask expResult = task;
    CycBasedTask result = querySearch.getTask();
    assertEquals(expResult, result);
  }
}
