/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.baseclient.api;

import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.base.cycobject.CycObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author daves
 */
public class CycObjectFactoryTest {

  public CycObjectFactoryTest() {
  }

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
  }

  /**
   * Test of makeUniqueCycVariable method, of class CycObjectFactory.
   */
  @Test
  public void testMakeUniqueCycVariable_CycVariable() {
    System.out.println("makeUniqueCycVariable");
    // makeUniqueCycVariable
    CycVariable x = CycObjectFactory.makeCycVariable("?X");
    CycVariable x1 = CycObjectFactory.makeUniqueCycVariable(x);
    CycVariable x2 = CycObjectFactory.makeUniqueCycVariable(x);
    CycVariable x3 = CycObjectFactory.makeUniqueCycVariable(x);
    assertNotSame(x, x1);
    assertNotSame(x, x2);
    assertNotSame(x, x3);
    assertNotSame(x1, x2);
    assertNotSame(x1, x3);
    assertNotSame(x2, x3);
    assertTrue(x.cyclify().equals("?X"));
    assertTrue(x1.cyclify().startsWith("?X-"));
    assertTrue(x3.cyclify().startsWith("?X-"));
  }

  /**
   * Test of makeUniqueCycVariable method, of class CycObjectFactory.
   */
  @Test
  public void testMakeUniqueCycVariable_CycVariable_Collection() {
    System.out.println("makeUniqueCycVariable");

    CycVariable x = CycObjectFactory.makeCycVariable("?X");
    CycVariable x1 = CycObjectFactory.makeCycVariable("?X-1");
    CycVariable x2 = CycObjectFactory.makeCycVariable("?X-2");
    CycVariable x3 = CycObjectFactory.makeCycVariable("?X-3");
    Collection<CycObject> existingVariables = new ArrayList<CycObject>();
    Collections.addAll(existingVariables, x, x1, x2, x3);
    CycVariable result = CycObjectFactory.makeUniqueCycVariable(x,
            existingVariables);
    assertNotSame(x, result);
    assertNotSame(x1, result);
    assertNotSame(x2, result);
    assertNotSame(x3, result);
    System.out.println("x1: '" + x1 + "'");
    System.out.println("Result: '" + result + "'");
    assertNotSame(x.toString(), result.toString());
    assertNotSame(x1.toString(), result.toString());
    assertNotSame(x2.toString(), result.toString());
    assertNotSame(x3.toString(), result.toString());

  }

  /**
   * Test of makeCycSymbol method, of class CycObjectFactory.
   */
  @Test
  public void testMakeCycSymbol_String_boolean() {
    System.out.println("makeCycSymbol");
    String symbolNameAnyCase = "*foo*";
    boolean shouldQuote = false;
    CycSymbol result = CycObjectFactory.makeCycSymbol(symbolNameAnyCase,
            shouldQuote);
    assertEquals(shouldQuote, result.shouldQuote());
    shouldQuote = true;
    result = CycObjectFactory.makeCycSymbol(symbolNameAnyCase,
            shouldQuote);
    assertEquals(shouldQuote, result.shouldQuote());
  }
  
  
  
  
}
