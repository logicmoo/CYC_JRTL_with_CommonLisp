/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb;

import com.cyc.kb.Variable;
import com.cyc.kb.exception.KBApiException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.opencyc.api.CycObjectFactory;

/**
 *
 * @author vijay
 */
public class VariableTest {

  private static Logger log = null;

  public VariableTest() throws Exception {
    log = Logger.getLogger(FunctionTest.class.getName());
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
    Variable instance = new Variable(CycObjectFactory.makeCycVariable("?VAR"));
    String expResult = "#$CycLVariable";
    String result = instance.getTypeString();
    assertEquals(expResult, result);
    
    assertEquals("?VAR", instance.toString());
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
  }
}