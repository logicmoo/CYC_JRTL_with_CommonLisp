package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycObject;

public class KBIndividualTest {

  private static Logger log = null;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(KBIndividualTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    if(TestConstants.cyc.find("NewConstantNotInKB") != null) {
      TestConstants.cyc.kill(TestConstants.cyc.getKnownConstantByName("NewConstantNotInKB"));
    }
  }
  

  /**
   * Test of get method, of class KBIndividual.
   */
  @Test
  public void testGet_String() throws Exception {
    System.out.println("get");
    String nameOrId1 = "AlbertEinstein";
    KBIndividual kbi1 = KBIndividual.get(nameOrId1);
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);
    
    String nameOrId2 = "(GenericInstanceFn Dog)";
    KBIndividual kbi2 = KBIndividual.get(nameOrId2);
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
    CycObject object1 = TestConstants.cyc.getKnownConstantByName(nameOrId1);
    KBIndividual kbi1 = KBIndividual.get(object1);
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);
    
    CycFort object2_functor = TestConstants.cyc.getKnownFortByName("GenericInstanceFn");
    CycConstant object2_arg = TestConstants.cyc.getKnownConstantByName("Dog");
    CycObject object2 = new CycNart(object2_functor, object2_arg);
    KBIndividual kbi2 = KBIndividual.get(object2);
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
    KBIndividual kbi1 = KBIndividual.findOrCreate(nameOrId1);
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBIndividual kbi2 = KBIndividual.findOrCreate(nameOrId2);
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividual.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
    TestConstants.cyc.kill(TestConstants.cyc.getKnownConstantByName("NewConstantNotInKB"));
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_CycObject() throws Exception {
    System.out.println("findOrCreate");
    // Test for find
    String nameOrId1 = "AlbertEinstein";
    CycObject object1 = TestConstants.cyc.getKnownConstantByName(nameOrId1);
    KBIndividual kbi1 = KBIndividual.findOrCreate(object1);
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
    KBCollection col1 = KBCollection.get("Scientist");
    KBIndividual kbi1 = KBIndividual.findOrCreate(nameOrId1, col1);
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBCollection col2 = KBCollection.get("Nonsense");
    KBIndividual kbi2 = KBIndividual.findOrCreate(nameOrId2, col2);
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividual.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
    TestConstants.cyc.kill(TestConstants.cyc.getKnownConstantByName("NewConstantNotInKB"));
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_String_String() throws Exception {
    System.out.println("findOrCreate");
    // Test for find
    String nameOrId1 = "AlbertEinstein";
    KBIndividual kbi1 = KBIndividual.findOrCreate(nameOrId1, "Scientist");
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = kbi1.getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBIndividual kbi2 = KBIndividual.findOrCreate(nameOrId2, "Nonsense");
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividual.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
    TestConstants.cyc.kill(TestConstants.cyc.getKnownConstantByName("NewConstantNotInKB"));
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_String_KBCollection_Context() throws Exception {
    System.out.println("findOrCreate");
    // Test for find
    String nameOrId1 = "AlbertEinstein";
    KBCollection col1 = KBCollection.get("Scientist");
    Context ctx1 = Context.get("WebSearchDataMt");
    KBIndividual.findOrCreate(nameOrId1, col1, ctx1);
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = KBIndividual.get(nameOrId1).getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBCollection col2 = KBCollection.get("Nonsense");
    KBIndividual.findOrCreate(nameOrId2, col2, TestConstants.baseKB);
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividual.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
    TestConstants.cyc.kill(TestConstants.cyc.getKnownConstantByName("NewConstantNotInKB"));
  }

  /**
   * Test of findOrCreate method, of class KBIndividual.
   */
  @Test
  public void testFindOrCreate_String_String_String() throws Exception {
    System.out.println("findOrCreate");
        // Test for find
    String nameOrId1 = "AlbertEinstein";
    KBIndividual.findOrCreate(nameOrId1, "Scientist", "WebSearchDataMt");
    String expResult1 = TestConstants.cyc.cyclifyString(nameOrId1);
    String result1 = KBIndividual.get(nameOrId1).getCore().cyclify();
    assertEquals(expResult1, result1);

    // Test for create
    String nameOrId2 = "NewConstantNotInKB";
    KBIndividual.findOrCreate(nameOrId2, "Nonsense", "BaseKB");
    String expResult2 = TestConstants.cyc.cyclifyString(nameOrId2);
    String result2 = KBIndividual.get(nameOrId2).getCore().cyclify();
    assertEquals(expResult2, result2);
    
    TestConstants.cyc.kill(TestConstants.cyc.getKnownConstantByName("NewConstantNotInKB"));
  }

  
  
  
    /**
   * Test of existsAsType method, of class KBIndividual.
   */
  @Test
  public void testExistsAsType_String() throws Exception {
    System.out.println("existsAsType");
    String nameOrId1 = "AlbertEinstein";
    boolean expResult1 = true;
    boolean result1 = KBIndividual.existsAsType(nameOrId1);
    assertEquals(expResult1, result1);
    
    String nameOrId2 = "Scientist";
    boolean expResult2 = false;
    boolean result2 = KBIndividual.existsAsType(nameOrId2);
    assertEquals(expResult2, result2);
  }

  /**
   * Test of existsAsType method, of class KBIndividual.
   */
  @Test
  public void testExistsAsType_CycObject() throws Exception {
    System.out.println("existsAsType");
    String nameOrId1 = "AlbertEinstein";
    CycObject object1 = TestConstants.cyc.getKnownConstantByName(nameOrId1);
    boolean expResult1 = true;
    boolean result1 = KBIndividual.existsAsType(object1);
    assertEquals(expResult1, result1);

    String nameOrId2 = "Scientist";
    CycObject object2 = TestConstants.cyc.getKnownConstantByName(nameOrId2);
    boolean expResult2 = false;
    boolean result2 = KBIndividual.existsAsType(object2);
    assertEquals(expResult2, result2);
  }

    /**
   * Test of getStatus method, of class KBIndividual.
   */
  @Test
  public void testGetStatus_String() throws Exception {
    System.out.println("getStatus");
    String nameOrId = "";
    KBStatus expResult = null;
    KBStatus result = KBIndividual.getStatus(nameOrId);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getStatus method, of class KBIndividual.
   */
  @Test
  public void testGetStatus_CycObject() throws Exception {
    System.out.println("getStatus");
    CycObject object = null;
    KBStatus expResult = null;
    KBStatus result = KBIndividual.getStatus(object);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  @Test
  public void testIndividualString() {
    try {
      KBIndividual i = KBIndividual.findOrCreate("VijayRaj009");
      assertEquals(i.toString(), "VijayRaj009");
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create individual or failed to find context.");
    }
  }

  @Test
  public void testIndividualStringLookupType() throws KBApiException {
    assertFalse(KBIndividual.existsAsType("ThisConstantDoesNotExist"));
  }

  @Test
  public void testIndividualStringFort() throws KBApiException, Exception {
    //Individual i = new KBIndividual("(InstanceOfCollectionFromVideoFn WeddingCeremony (AVWorkWithIDFn 20834) 1)");
    //assertEquals(i.toString(), "(InstanceOfCollectionFromVideoFn WeddingCeremony (AVWorkWithIDFn 20834) 1)");
    //System.out.println("Isas: " + i.instantiates("BaseKB").toString());

    KBIndividual i = KBIndividual.findOrCreate("(AVWorkWithIDFn 99799)");
    assertEquals(i.toString(), "(AVWorkWithIDFn 99799)");
    System.out.println("Isas: " + i.instanceOf("BaseKB").toString());

  }

  @Test
  public void testSuperTypes() throws Exception {
    final String name = "TestSuperTypesTestIndividual";
    KBIndividual i = KBIndividual.findOrCreate(name);
    assertEquals(i.toString(), name);
    final KBCollection person = KBCollection.get("Person");


    i.instantiates(person, Context.get("PeopleDataMt")).instantiates(
            "MaleHuman", "PeopleDataMt");
    System.out.println("Just checking: " + i.isInstanceOf("MaleHuman", "EverythingPSC"));
    assertTrue(i.instanceOf("PeopleDataMt").contains(person));
  }

  @Test
  public void testComment() throws KBApiException {
    KBIndividual i = KBIndividual.findOrCreate("TestCommentTestIndividual");
    i.addComment("Adding a comment", "PeopleDataMt");
    assertTrue(i.getComments("PeopleDataMt").contains("Adding a comment"));
  }

  @Test(expected = KBApiException.class)
  public void testDelete() throws Exception {
    KBIndividual i = KBIndividual.findOrCreate("TestDeleteTestIndividual");
    i.delete();
    assertEquals(i.getComments("").size(), 0);
  }

  @Test(expected = KBApiException.class)
  public void testDelete2() throws Exception {
    final String name = "TestDelete2TestIndividual";
    KBIndividual i = KBIndividual.findOrCreate(name);
    i.delete();
    i = KBIndividual.get(name);
    assertTrue(i != null);
  }

  @Test
  public void testDelete3() throws Exception {
    final String name = "TestDelete3TestIndividual";
    KBIndividual i = KBIndividual.findOrCreate(name);
    String id = i.getId();
    i.delete();
    i = KBIndividual.findOrCreate(name);
    assertFalse(i.getId().equals(id));
  }

  /**
   * Test of getClassTypeCore method, of class KBIndividual.
   */
  @Test
  public void testGetClassTypeCore() {
    System.out.println("getClassTypeCore");
    CycDenotationalTerm expResult = null;
    CycDenotationalTerm result = KBIndividual.getClassTypeCore();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }


  


  /**
   * Test of instanceOf method, of class KBIndividual.
   */
  @Test
  public void testInstanceOf_0args() throws Exception {
    System.out.println("instanceOf");
    KBIndividual instance = new KBIndividual();
    Collection<KBCollection> expResult = null;
    Collection<KBCollection> result = instance.instanceOf();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of instanceOf method, of class KBIndividual.
   */
  @Test
  public void testInstanceOf_String() throws Exception {
    System.out.println("instanceOf");
    String ctx = "";
    KBIndividual instance = new KBIndividual();
    Collection<KBCollection> expResult = null;
    Collection<KBCollection> result = instance.instanceOf(ctx);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getTypeString method, of class KBIndividual.
   */
  @Test
  public void testGetTypeString() throws KBApiException {
    System.out.println("getTypeString");
    KBIndividual instance = new KBIndividual();
    String expResult = "";
    String result = instance.getTypeString();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getClassTypeString method, of class KBIndividual.
   */
  @Test
  public void testGetClassTypeString() {
    System.out.println("getClassTypeString");
    String expResult = "";
    String result = KBIndividual.getClassTypeString();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}
