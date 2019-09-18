/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.task;

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

import com.cyc.km.modeling.task.CycBasedTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;
import org.junit.*;
import static com.cyc.kb.TestUtils.*;

/**
 *
 * @author baxter
 */
public class CycBasedTaskTest {

  public CycBasedTaskTest() {
  }
  static private CycBasedTask t;

  @BeforeClass
  public static void setUpClass() throws Exception {
    ensureConstantsInitialized();
    t = CycBasedTask.getAll().iterator().next();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of getAll method, of class CycBasedTask.
   */
  @Test
  public void testGetAll() {
    System.out.println("getAll");
    try {
      assertFalse(CycBasedTask.getAll().isEmpty());
    } catch (Exception ex) {
      Logger.getLogger(CycBasedTaskTest.class.getName()).log(Level.SEVERE, null,
              ex);
    }
  }

  /**
   * Test of getTaskTerm method, of class CycBasedTask.
   */
  @Test
  public void testGetTaskTerm() {
    System.out.println("getTaskTerm");
    assertNotNull(t.getTaskTerm());
  }

  /**
   * Test of getDescription method, of class CycBasedTask.
   */
  @Test
  public void testGetDescription() throws Exception {
    System.out.println("getDescription");
    t.getDescription();
  }

  /**
   * Test of getSummary method, of class CycBasedTask.
   */
  @Test
  public void testGetSummary() throws Exception {
    System.out.println("getSummary");
    assertNotNull("Couldn't get a summary for " + t, t.getSummary());
  }

  /**
   * Test of getAssignedCyclists method, of class CycBasedTask.
   */
  @Test
  public void testGetAssignedCyclists() throws Exception {
    System.out.println("getAssignedCyclists");
    t.getAssignedCyclists();
  }

  /**
   * Test of getKeyConcepts method, of class CycBasedTask.
   */
  @Test
  public void testGetKeyConcepts() throws Exception {
    System.out.println("getKeyConcepts");
    t.getKeyConcepts();
  }
}
