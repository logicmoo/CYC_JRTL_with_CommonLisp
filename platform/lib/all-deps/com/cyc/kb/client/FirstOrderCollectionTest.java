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

import com.cyc.kb.FirstOrderCollection;
import com.cyc.kb.KBAPIEnums.LookupType;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.FirstOrderCollectionImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.client.SecondOrderCollectionImpl;
import com.cyc.kb.exception.KBApiException;

import java.util.Set;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author vijay
 */
public class FirstOrderCollectionTest {

  public FirstOrderCollectionTest() {
  }
  private static Logger log = null;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(KBCollectionTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testFirstOrderCollection_Constructors() throws Exception {
    System.out.println("Constructors");
    FirstOrderCollection foc1 = new FirstOrderCollectionImpl("Dog");
    System.out.println("Generalizations: " + foc1.getGeneralizations());
    
    try {
      FirstOrderCollection foc_bad = new FirstOrderCollectionImpl("BiologicalSpecies");
      fail("Allowed a second order collection to be created using FirstOrderCollection");
    } catch (KBApiException sae) {
      assertTrue(true);
    }
    
    FirstOrderCollectionImpl foc2 = new FirstOrderCollectionImpl("NewFirstOrderCollectionByUser");
    System.out.println("Facts: " + foc2.getFacts(Constants.isa(), 1, Constants.uvMt()));
    foc2.delete();
    
    try {
      FirstOrderCollection foc3 = new FirstOrderCollectionImpl("NewFirstOrderCollectionByUser", LookupType.FIND);
      fail("Lookup mode FIND should not have found \"NewFirstOrderCollectionByUser\"");
    } catch (KBApiException sae) {
      assertTrue(true);
    }
  }
  
  /**
   * Test of addGeneralization method, of class FirstOrderCollection.
   */
  /*
  @Test
  public void testGeneralizations_0args() throws Exception {
    System.out.println("addGeneralization");
    FirstOrderCollection instance = new FirstOrderCollection();
    List expResult = null;
    List result = instance.addGeneralization();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }*/

  /**
   * Test of addGeneralization method, of class FirstOrderCollection.
   */
  @Test
  public void testGeneralizations_String() throws Exception {
    System.out.println("generalizations");
    
    FirstOrderCollection foc1 = new FirstOrderCollectionImpl("Dog");
    java.util.Collection<FirstOrderCollection> genls = foc1.getGeneralizations();
    System.out.println("Generalizations: " + genls);
    
    if (!genls.contains(new FirstOrderCollectionImpl ("CanisGenus"))) {
      fail("Dog genls does not contain CanisGenus");
    }
  }

  /**
   * Test of addGeneralization method, of class FirstOrderCollection.
   */
  @Test
  public void testGeneralizations_String_String() throws Exception {
    System.out.println("generalizations");
      
    FirstOrderCollectionImpl foc1 = new FirstOrderCollectionImpl("NewFirstOrderCollectionByUser");
    System.out.println("Facts: " + foc1.getFacts(Constants.isa(), 1, Constants.uvMt()));
    
    String ctxStr = "UniversalVocabularyMt";
    String collectionStr = "AnotherNewFirstOrderCollectionByUser";
    FirstOrderCollectionImpl foc2 = FirstOrderCollectionImpl.findOrCreate("AnotherNewFirstOrderCollectionByUser");
    
    FirstOrderCollection result = foc1.addGeneralization(collectionStr, ctxStr);
    assertEquals(foc1, result);
    
    java.util.Collection<FirstOrderCollection> genls = foc1.getGeneralizations();
    System.out.println("Generalizations: " + genls);
    
    if (!genls.contains(foc2)) {
      fail("\"NewFirstOrderCollectionByUser\" genls does not contain \"AnotherNewFirstOrderCollectionByUser\"");
    }
    foc1.delete();
    foc2.delete();   
  }

  /**
   * Test of addGeneralization method, of class FirstOrderCollection.
   */
  /*
  @Test
  public void testGeneralizations_Context_Collection() throws Exception {
    System.out.println("addGeneralization");
    Context ctx = null;
    Collection c = null;
    FirstOrderCollection instance = new FirstOrderCollection();
    FirstOrderCollection expResult = null;
    FirstOrderCollection result = instance.addGeneralization(ctx, c);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  */

  /**
   * Test of isInstanceOf method, of class FirstOrderCollection.
   */
  @Test
  public void testCheckSuperType() throws Exception {
    System.out.println("checkSuperType");
    
    FirstOrderCollectionImpl foc1 = new FirstOrderCollectionImpl("NewFirstOrderCollectionByUser");

    if (!foc1.isInstanceOf(new SecondOrderCollectionImpl("FirstOrderCollection"), new ContextImpl("UniversalVocabularyMt"))){     
      fail("\"NewFirstOrderCollectionByUser\" is not an isa of \"FirstOrderCollection\"");
    }
    
    foc1.delete();
  }

}