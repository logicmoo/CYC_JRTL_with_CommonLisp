/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb.client;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.baseclient.CycObjectFactory;
import com.cyc.kb.client.VariableImpl;
import com.cyc.kb.exception.KBApiException;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author vijay
 */
public class VariableTest {

  private static Logger log = null;

  public VariableTest() throws Exception {
    log = Logger.getLogger(KBFunctionTest.class.getName());
    log.setLevel(Level.FINE);
    TestConstants.ensureInitialized();
  }

  @BeforeClass
  public static void setUpClass() {
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
   * Test of getTypeString method, of class Variable.
   */
  @Test
  public void testGetTypeString() throws KBApiException {
    System.out.println("getTypeString");
    VariableImpl instance = new VariableImpl(CycObjectFactory.makeCycVariable("?VAR"));
    String expResult = "#$CycLVariable";
    String result = instance.getTypeString();
    assertEquals(expResult, result);
    
    assertEquals("?VAR", instance.toString());
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
  }
}