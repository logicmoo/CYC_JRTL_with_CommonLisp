package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Logger;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class KBIndividualTest {

  private static Logger log = null;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(KBIndividualTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testIndividual() throws KBApiException, UnknownHostException, IOException {
    String str = "AlbertEinstein";
    KBCollection constrainingCol = KBCollection.get("#$Scientist");
    Context ctx = Context.get("#$WebSearchDataMt");

    KBIndividual i = new KBIndividual(ctx, str, constrainingCol);//@todo convert to factory
    assertEquals(i.getCore().cyclify(), "#$AlbertEinstein");
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
}
