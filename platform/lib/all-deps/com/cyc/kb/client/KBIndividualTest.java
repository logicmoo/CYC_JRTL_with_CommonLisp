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

import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.Fort;
import com.cyc.baseclient.cycobject.CycNart;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBStatus;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBApiRuntimeException;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class KBIndividualTest {

  private static Logger log = null;

  @BeforeClass
  public static void setUpClass() throws Exception {
    log = Logger.getLogger(KBIndividualTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    if(TestConstants.cyc.getLookupTool().find("NewConstantNotInKB") != null) {
      TestConstants.cyc.getUnassertTool().kill(TestConstants.cyc.getLookupTool().getKnownConstantByName("NewConstantNotInKB"));
    }
  }
  
  @Before
  public void setUp() {
    
  }
  
  @After
  public void tearDown() {
    // Do not do this. We setup a detailed script based on flying event.
    // KBObjectFactory.clearKBObjectCache();
  }
  

  /**
   * Test of get method, of class KBIndividual.
   */
  @Test
  public void testGet_String() throws Exception {
    System.out.println("get");
    String nameOrId1 = "AlbertEinstein";
    KBIndividualImpl kbi1 = KBIndividualImpl.get(nameOrId1);
    assertEquals(KBIndividualImpl.class, kbi1.getClass());
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);
    
    String nameOrId2 = "(GenericInstanceFn Dog)";
    KBIndividualImpl kbi2 = KBIndividualImpl.get(nameOrId2);
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = kbi2.getCore().cyclify();
    assertEquals(expResult2, result2);
  }

  /**
   * Test of get method, of class KBIndividual.
   */
  @Test
  public void testGet_CycObject() throws Exception {
    System.out.println("get");
    String nameOrId1 = "AlbertEinstein";
    CycObject object1 = TestConstants.cyc.getLookupTool().getKnownConstantByName(nameOrId1);
    KBIndividualImpl kbi1 = KBIndividualImpl.get(object1);
    assertEquals(KBIndividualImpl.class, kbi1.getClass());
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);
    
    Fort object2_functor = TestConstants.cyc.getLookupTool().getKnownFortByName("GenericInstanceFn");
    CycConstantI object2_arg = TestConstants.cyc.getLookupTool().getKnownConstantByName("Dog");
    CycObject object2 = new CycNart(object2_functor, object2_arg);
    KBIndividualImpl kbi2 = KBIndividualImpl.get(object2);
    String expResult2 = TestConstants.cyc.cyclifyString("(GenericInstanceFn Dog)");
    String result2 = kbi2.getCore().cyclify();
    assertEquals(expResult2, result2);
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
    @Test
    public void testFindOrCreate_String() throws Exception {
    System.out.println("findOrCreate");
    // Test for find
    String nameOrId1 = "AlbertEinstein";
    KBIndividualImpl kbi1 = KBIndividualImpl.findOrCreate(nameOrId1);
    assertEquals(KBIndividualImpl.class, kbi1.getClass());
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBIndividualImpl kbi2 = KBIndividualImpl.findOrCreate(nameOrId2);
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividualImpl.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
    kbi2.delete();
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_CycObject() throws Exception {
    System.out.println("findOrCreate");
    // Test for find
    String nameOrId1 = "AlbertEinstein";
    CycObject object1 = TestConstants.cyc.getLookupTool().getKnownConstantByName(nameOrId1);
    KBIndividualImpl kbi1 = KBIndividualImpl.findOrCreate(object1);
    assertEquals(KBIndividualImpl.class, kbi1.getClass());
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);
    
    /* Test for create
    Question - why do we need this? If the method takes a CycObject object as input, then 
               the corresponding term already exists in the KB. 
    CycObject object2 = "ThisIsANewKBIndividualForTestingCreation";
    KBIndividual kbi2 = KBIndividual.findOrCreate(nameOrId2);
    String expResult2 = TestConstants.cyc.cyclifyString("ThisIsANewKBIndividualForTestingCreation");
    String result2 = kbi2.getCore().cyclify();
    assertEquals(expResult2, result2);
    */
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_String_KBCollection() throws Exception {
    System.out.println("findOrCreate");
    // Test for find
    String nameOrId1 = "AlbertEinstein";
    KBCollection col1 = KBCollectionImpl.get("Scientist");
    KBIndividualImpl kbi1 = KBIndividualImpl.findOrCreate(nameOrId1, col1);
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBCollection col2 = KBCollectionImpl.get("Nonsense");
    KBIndividualImpl kbi2 = KBIndividualImpl.findOrCreate(nameOrId2, col2);
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividualImpl.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
   kbi2.delete();
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_String_String() throws Exception {
    System.out.println("findOrCreate");
    // Test for find
    String nameOrId1 = "AlbertEinstein";
    KBIndividualImpl kbi1 = KBIndividualImpl.findOrCreate(nameOrId1, "Scientist");
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBIndividualImpl kbi2 = KBIndividualImpl.findOrCreate(nameOrId2, "Nonsense");
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividualImpl.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
    kbi2.delete();
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_String_KBCollection_Context() throws Exception {
    System.out.println("findOrCreate");
    // Test for find
    String nameOrId1 = "AlbertEinstein";
    KBCollection col1 = KBCollectionImpl.get("Scientist");
    ContextImpl ctx1 = ContextImpl.get("WebSearchDataMt");
    KBIndividualImpl.findOrCreate(nameOrId1, col1, ctx1);
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = KBIndividualImpl.get(nameOrId1).getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBCollection col2 = KBCollectionImpl.get("Nonsense");
    KBIndividualImpl kbi2 = KBIndividualImpl.findOrCreate(nameOrId2, col2, TestConstants.baseKB);
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividualImpl.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
    kbi2.delete();
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_String_String_String() throws Exception {
    System.out.println("findOrCreate");
        // Test for find
    String nameOrId1 = "AlbertEinstein";
    KBIndividualImpl.findOrCreate(nameOrId1, "Scientist", "WebSearchDataMt");
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = KBIndividualImpl.get(nameOrId1).getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBIndividualImpl.findOrCreate(nameOrId2, "Nonsense", "BaseKB");
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    KBIndividualImpl kbi2 = KBIndividualImpl.get(nameOrId2);
    String result2 = kbi2.getCore().cyclify();
    assertEquals(expResult2, result2);
    kbi2.delete();
  }

  
  
  
    /**
   * Test of existsAsType method, of class KBIndividual.
   */
  @Test
  public void testExistsAsType_String() throws Exception {
    System.out.println("existsAsType");
    String nameOrId1 = "AlbertEinstein";
    boolean expResult1 = true;
    boolean result1 = KBIndividualImpl.existsAsType(nameOrId1);
    assertEquals(expResult1, result1);
    
    String nameOrId2 = "Scientist";
    boolean expResult2 = false;
    boolean result2 = KBIndividualImpl.existsAsType(nameOrId2);
    assertEquals(expResult2, result2);
  }

  /**
   * Test of existsAsType method, of class KBIndividual.
   */
  @Test
  public void testExistsAsType_CycObject() throws Exception {
    System.out.println("existsAsType");
    String nameOrId1 = "AlbertEinstein";
    CycObject object1 = TestConstants.cyc.getLookupTool().getKnownConstantByName(nameOrId1);
    boolean expResult1 = true;
    boolean result1 = KBIndividualImpl.existsAsType(object1);
    assertEquals(expResult1, result1);

    String nameOrId2 = "Scientist";
    CycObject object2 = TestConstants.cyc.getLookupTool().getKnownConstantByName(nameOrId2);
    boolean expResult2 = false;
    boolean result2 = KBIndividualImpl.existsAsType(object2);
    assertEquals(expResult2, result2);
  }

    /**
   * Test of getStatus method, of class KBIndividual.
   */
  @Test
  public void testGetStatus() throws Exception {
    System.out.println("getStatus");
    String nameOrId = "Pilot-APITest";
    KBStatus expResult = KBStatus.EXISTS_AS_TYPE;
    KBStatus result = KBIndividualImpl.getStatus(nameOrId);
    assertEquals(expResult, result);
    
    CycConstantI cc = CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownConstantByName(nameOrId);
    KBStatus result1 = KBIndividualImpl.getStatus(cc);
    assertEquals(expResult, result1);
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  @Test
  public void testIndividualString() {
    try {
      KBIndividualImpl i = KBIndividualImpl.findOrCreate("VijayRaj009");
      assertEquals(i.toString(), "VijayRaj009");
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create individual or failed to find context.");
    }
  }

  @Test
  public void testIndividualStringLookupType() throws KBApiException {
    assertFalse(KBIndividualImpl.existsAsType("ThisConstantDoesNotExist"));
  }

  @Test
  public void testIndividualStringFort() throws KBApiException, Exception {
    //Individual i = new KBIndividual("(InstanceOfCollectionFromVideoFn WeddingCeremony (AVWorkWithIDFn 20834) 1)");
    //assertEquals(i.toString(), "(InstanceOfCollectionFromVideoFn WeddingCeremony (AVWorkWithIDFn 20834) 1)");
    //System.out.println("Isas: " + i.instantiates("BaseKB").toString());

    KBIndividualImpl i = KBIndividualImpl.findOrCreate("(AVWorkWithIDFn 99799)");
    assertEquals(i.toString(), "(AVWorkWithIDFn 99799)");
    System.out.println("Isas: " + i.instanceOf("BaseKB").toString());

  }

  @Test
  public void testSuperTypes() throws Exception {
    final String name = "TestSuperTypesTestIndividual";
    KBIndividualImpl i = KBIndividualImpl.findOrCreate(name);
    assertEquals(i.toString(), name);
    final KBCollection person = KBCollectionImpl.get("Person");


    i.instantiates(person, ContextImpl.get("PeopleDataMt")).instantiates(
            "MaleHuman", "PeopleDataMt");
    System.out.println("Just checking: " + i.isInstanceOf("MaleHuman", "EverythingPSC"));
    assertTrue(i.instanceOf("PeopleDataMt").contains(person));
  }

  @Test
  public void testComment() throws KBApiException {
    KBIndividualImpl i = KBIndividualImpl.findOrCreate("TestCommentTestIndividual");
    i.addComment("Adding a comment", "PeopleDataMt");
    assertTrue(i.getComments("PeopleDataMt").contains("Adding a comment"));
  }

  @Test(expected = KBApiRuntimeException.class)
  public void testDelete() throws Exception {
    KBIndividualImpl i = KBIndividualImpl.findOrCreate("TestDeleteTestIndividual");
    i.delete();
    assertEquals(i.getComments("").size(), 0);
  }

  @Test(expected = KBApiException.class)
  public void testDelete2() throws Exception {
    final String name = "TestDelete2TestIndividual";
    KBIndividualImpl i = KBIndividualImpl.findOrCreate(name);
    i.delete();
    i = KBIndividualImpl.get(name);
    assertTrue(i != null);
  }

  @Test
  public void testDelete3() throws Exception {
    final String name = "TestDelete3TestIndividual";
    KBIndividualImpl i = KBIndividualImpl.findOrCreate(name);
    String id = i.getId();
    i.delete();
    i = KBIndividualImpl.findOrCreate(name);
    assertFalse(i.getId().equals(id));
  }

  /**
   * Test of getClassTypeCore method, of class KBIndividual.
 * @throws IOException 
 * @throws CycApiException 
 * @throws Exception 
   */
  @Test
  public void testGetClassTypeCore() throws Exception {
    System.out.println("getClassTypeCore");
    DenotationalTerm expResult = CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownConstantByName("Individual");
    DenotationalTerm result = KBIndividualImpl.getClassTypeCore();
    assertEquals(expResult, result);
  }


  


  /**
   * Test of instanceOf method, of class KBIndividual.
   */
  @Test
  public void testInstanceOf() throws Exception {
    System.out.println("instanceOf");
    KBIndividual instance = KBIndividualImpl.get("FlightXYZ-APITest");
    KBCollectionImpl col = KBCollectionImpl.get("Flying-Move");
    Collection<KBCollectionImpl> expResult = new HashSet<KBCollectionImpl>();
    expResult.add(col);
    expResult.add(KBCollectionImpl.get("Individual"));
    Collection<KBCollection> result = instance.instanceOf("SomeAirlineLogMt");
    assertEquals(expResult, result);
    
    expResult = new HashSet<KBCollectionImpl>();
    expResult.add(KBCollectionImpl.get("Individual"));
    expResult.add(col);
    result = instance.instanceOf();
    assertTrue(result.containsAll(expResult));
  }


  /**
   * Test of getTypeString method, of class KBIndividual.
   */
  @Test
  public void testGetTypeString() throws KBApiException {
    System.out.println("getTypeString");
    KBIndividualImpl instance = new KBIndividualImpl();
    String expResult = "#$Individual";
    String result = instance.getTypeString();
    assertEquals(expResult, result);
  }
}
