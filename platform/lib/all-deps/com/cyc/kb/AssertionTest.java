/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.opencyc.api.CycAccess;

/**
 *
 * @author daves
 */
public class AssertionTest {
  
  public AssertionTest() {
  }
  
  @BeforeClass
  public static void setUpClass() throws UnknownHostException, IOException {
    CycAccess.setCurrent("localhost", 3640);
  }
  
  @AfterClass
  public static void tearDownClass() {
    CycAccess.getCurrent().close();
  }

  /**
   * Test of context method, of class Assertion.
   */
  //@Test
  public void testContext() throws Exception {
    System.out.println("context");
    Assertion instance = new Assertion();
    Context expResult = null;
    Context result = instance.context();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getSupportingAssertions method, of class Assertion.
   */
  @Test
  public void testGetSupportingAssertions() throws KBApiException {
    System.out.println("getSupportingAssertions");
    Assertion instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) ExistingObjectType)");
    Collection result = instance.getSupportingAssertions();
    assertTrue(!result.isEmpty());

    // non-deduced assertion
    instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
    result = instance.getSupportingAssertions();
    assertTrue(result.isEmpty());
  }

  /**
   * Test of getAllSupportingAssertions method, of class Assertion.
   */
  //@Test
  /*
  public void testGetAllSupportingAssertions() throws KBApiException {
    System.out.println("getAllSupportingAssertions");
    Assertion instance = new Assertion();
    Collection expResult = null;
    Collection result = instance.getAllSupportingAssertions();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  * */

  /**
   * Test of isDeducedAssertion method, of class Assertion.
   */
  @Test
  public void testIsDeducedAssertion() throws Exception {
    System.out.println("isDeducedAssertion");
    Assertion instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) ExistingObjectType)");
    boolean expResult = true;
    boolean result = instance.isDeducedAssertion();
    assertEquals(expResult, result);    
    instance = new Fact(true, "BaseKB", "(genls (FruitFn RedDeliciousAppleTree) (FruitFn AppleTree))");
    assertEquals(true, instance.isDeducedAssertion());
    
    //asserted only
    instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
    assertEquals(false, instance.isDeducedAssertion());
    
  }

  /**
   * Test of isAssertedAssertion method, of class Assertion.
   */
  @Test
  public void testIsAssertedAssertion() throws Exception {
    System.out.println("isAssertedAssertion");
    Assertion instance = new Fact(true, "BaseKB", "(genls (FruitFn RedDeliciousAppleTree) (FruitFn AppleTree))");
    assertEquals(true, instance.isAssertedAssertion());
    instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
    assertEquals(true, instance.isAssertedAssertion());
    //derived only
    instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) ExistingObjectType)");
    assertEquals(false, instance.isAssertedAssertion());
    
  }
}