package com.cyc.kb;

import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.Guid;

public class KBCollectionTest {

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
  public void testCollection() throws KBApiException, UnknownHostException, IOException, Exception {
    String str1 = "dog";
    KBCollection constrainingCol1 = KBCollection.get("#$BiologicalSpecies");
    Context ctx1 = Context.get("#$UniversalVocabularyMt");

    KBCollection c1 = new KBCollection(ctx1, str1, constrainingCol1);
    assertEquals(c1.getCore().cyclify(), "#$Dog");

    String str2 = "dog123";
    KBCollection constrainingCol2 = constrainingCol1;
    Context ctx2 = ctx1;

    KBCollection c2 = null;
    try {
      c2 = new KBCollection(ctx2, str2, constrainingCol2);
      System.out.println("Result is: " + c2.getCore().cyclify());
      assertTrue(false);
    } catch (KBApiException e) {
      assertTrue(true);
    } finally {
      // c2.delete();
    }
  }

  @Test
  public void testCollectionString() throws KBApiException {
    KBCollection c = KBCollection.findOrCreate("iProduct");
    assertEquals(c.toString(), "iProduct");
    c.addComment("All Apple products start with i", "AppleProductMt");
    assertTrue(c.getComments("AppleProductMt").contains("All Apple products start with i"));

  }

  @Test
  public void testGetMinCol() throws KBApiException {
    KBCollection expected_min = KBCollection.get("Volume");
    KBCollection somegenls = KBCollection.get("Individual");
    
    List<KBCollection> l = new ArrayList<KBCollection>();
    l.add(expected_min);
    l.add(somegenls);
    KBCollection min = KBCollection.getMinCol(l);
    
    System.out.println("List of Cols: " + l + ", Expected min: " + min);
    assertEquals(expected_min, min);
  }

  @Test
  public void testSpecs() throws KBApiException {
    final String iProductString = "IProduct";
    KBCollection c = KBCollection.findOrCreate(iProductString);
    assertEquals(c.toString(), iProductString);
    final String IPaidString = "IPaid";
    final KBCollection ipadColl = KBCollection.findOrCreate(IPaidString);
    assertTrue(KBCollection.existsAsType(ipadColl.getCore()));
    final Context ctx = Context.findOrCreate("AppleProductMt");
    c.addSpecialization(ipadColl, ctx);
    c.addSpecialization(KBCollection.findOrCreate("IPhony"), ctx);
    final Collection<KBCollection> productTypes = c.getSpecializations("AppleProductMt");

    assertTrue("Couldn't find " + IPaidString + " in " + productTypes,
            productTypes.contains(ipadColl));
    //assertEquals(c.specs("").get(1).toString(), "IPhony");
    // AppleProductMt is not visible by default

  }

  @Test
  public void testGenls() throws KBApiException {

    KBCollection c = KBCollection.findOrCreate("IProduct");
    assertEquals(c.toString(), "IProduct");
    final String productString = "Product";

    // Internally genls(mt, c) will be run, so not additional test needed.
    c.addGeneralization(productString, "AppleProductMt");
    final Collection<? extends KBCollection> generalizations = c.getGeneralizations("AppleProductMt");
    final FirstOrderCollection productQuaFOC = FirstOrderCollection.findOrCreate(productString);
    assertTrue(generalizations + " does not contain " + productString + " qua "
            + FirstOrderCollection.class.getSimpleName(),
            generalizations.contains(productQuaFOC));
    final KBCollection productQuaKBC = KBCollection.findOrCreate(productString);
    assertTrue(generalizations + " does not contain " + productString + " qua "
            + KBCollection.class.getSimpleName(),
            generalizations.contains(productQuaKBC));
  }

  @Test
  public void testAllGeneralizations() throws KBApiException {

    KBCollection c = KBCollection.findOrCreate("iProduct");
    assertEquals(c.toString(), "iProduct");

    java.util.Collection<KBCollection> ags = c.allGeneralizations();
    log.fine("All Generalizations: " + ags);
    KBCollection[] expectedArray = {KBCollection.get("(CollectionUnionFn (TheSet DurableGood ServiceEvent Product))"),
      KBCollection.get("TemporallyExistingThing"),
      KBCollection.get("Location-Underspecified"),
      KBCollection.get("Trajector-Underspecified"),
      KBCollection.get("Individual"),
      KBCollection.get("(CollectionUnionFn (TheSet TemporalThing Collection))"),
      KBCollection.get("Thing"),
      KBCollection.get("aura:Thing"),
      KBCollection.get("TemporalThing"),
      KBCollection.get("BusinessRelatedThing"),
      KBCollection.get("Product"),
      KBCollection.findOrCreate("iProduct")};
    Set expected = new HashSet(Arrays.asList(expectedArray));
    assertEquals(ags, expected);
  }

  @Test
  public void testSubTypes() throws KBApiException, Exception {
    KBCollection c = KBCollection.findOrCreate("IPaid");
    KBIndividual a = KBIndividual.findOrCreate("anIPad");
    Context con = Context.findOrCreate("AppleProductMt");
    a.instantiates(c, con);
    assertTrue(c.<KBIndividual>getInstances("AppleProductMt").contains(KBIndividual.get("anIPad")));

    KBCollection cet = KBCollection.get("ConsumerElectronicsType");
    c.instantiates(cet, con);
    assertTrue(cet.<KBCollection>getInstances("AppleProductMt").contains(
            KBCollection.get("IPaid")));

  }

  @Test
  public void testSuperTypes() throws KBApiException {
    KBCollection c = KBCollection.findOrCreate("IPhony");
    c.instantiates("ConsumerElectronicsType", "AppleProductMt");

    assertTrue(c.instancesOf("AppleProductMt").contains(KBCollection.get("ConsumerElectronicsType")));
  }

  @Test
  public void testGetValues() throws Exception {
    //TODO: Find better example. Here iGuy is not a collection.

    KBIndividual ig = KBIndividual.findOrCreate("iGuy");
    ig.instantiates("Person", "AppleProductMt");
    ig.addFact(Context.get("AppleProductMt"), Predicate.get("owns"), 1, KBIndividual.findOrCreate("anIPad"));
  }

  /*
   * @Test public void testDelete() { try { KBCollection c = new
   * KBCollection("iProduct"); c.delete();
   *
   * new KBCollection("IPhony").delete(); new KBCollection("IPaid").delete(); new
   * KBIndividual("iGuy").delete(); new KBIndividual("anIPad").delete();
   *
   * new Context("AppleProductMt").delete();
   *
   * assertEquals(c.getComments("").size(), 0);
   *
   * } catch(CycApiException cae) { assertEquals(cae.getMessage(), "Expected
   * constant not found #$iProduct"); } catch (Exception e) {
   * e.printStackTrace(); fail("Failed to create or retrieve comments."); }
   }
   */
  @Test
  public void testCheckSuperType() throws KBApiException {
    //TODO: Find better example. Here iGuy is not a collection.

    KBCollection hc = KBCollection.get("HumanCyclist");
    assertFalse(hc.isInstanceOf(KBCollection.findOrCreate("PersonTypeByRegionalAffiliation"), Context.get("UniversalVocabularyMt")));
    System.out.print(hc.isInstanceOf(KBCollection.findOrCreate("PersonTypeByRegionalAffiliation"), Context.get("UniversalVocabularyMt")));
  }

  @Test
  public void testCheckGeneralizations() throws KBApiException {
    KBCollection hc = KBCollection.get("HumanCyclist");
    assertTrue(hc.isGeneralizationOf(KBCollection.get("HumanAdult"), Context.get("UniversalVocabularyMt")));
    System.out.print(hc.isGeneralizationOf(KBCollection.get("HumanAdult"), Context.get("UniversalVocabularyMt")));
  }

  /**
   * CollectionFactory get tests
   */
  @Test
  public void testCollectionFactoryGet() throws KBApiException {
    System.out.println("collectionFactoryGet");
    final String collName = "Emu";
    KBCollection c1 = new KBCollection(collName);
    KBCollection c2 = new KBCollection(collName);
    assertFalse("Two different " + collName + " are the same object!", c1 == c2);
    assertTrue("Two different " + collName + " are not equals()!", c2.equals(c1));


    c1 = KBCollection.get(collName);
    c2 = KBCollection.get(new CycConstant(collName, new Guid("c01a4ba0-9c29-11b1-9dad-c379636f7270")));
    assertTrue("CycObject-based " + collName + " and string-based version differ!", c1 == c2);

    c2 = KBCollection.get("Mx4rwBpLoJwpEbGdrcN5Y29ycA");
    assertTrue("HLID-based " + collName + " and string-based version differ!", c1 == c2);

  }

  @Test(expected = KBTypeException.class)
  public void testGetTypeConflictException() throws KBApiException {
    KBCollection c3 = KBCollection.get("isa");
  }

  @Test(expected = KBTypeException.class)
  public void testGetTypeConflictException2() throws KBApiException {
    //even though i1 could be coerced into a Context, get() isn't supposed to do so.
    KBIndividual i1 = new KBIndividual("TestIndividualForTypeConflict");
    try {
      KBCollection c3 = KBCollection.get("TestIndividualForTypeConflict");
      assertTrue("TestIndividualForTypeConflict shouldn't be a collection!", c3 == null);
    } finally {
      i1.delete();
    }
  }

  @Test
  public void testCollectionFactoryFindOrCreateWorksLikeGet() throws KBApiException {

    final KBCollection c1 = KBCollection.findOrCreate("Emu");
    KBCollection c2 = KBCollection.findOrCreate("Emu");
    assertTrue("Two different BaseKBs are actually different objects!", c2 == c1);
    assertTrue("Two different BaseKBs are not equals()!", c2.equals(c1));

    c2 = KBCollection.findOrCreate(new CycConstant("Emu", new Guid("c01a4ba0-9c29-11b1-9dad-c379636f7270")));
    assertTrue("CycObject-based BaseKB and string-based version differ!", c1 == c2);

    c2 = KBCollection.findOrCreate("Mx4rwBpLoJwpEbGdrcN5Y29ycA");
    assertTrue("HLID-based BaseKB and string-based version differ!", c1 == c2);

  }

  @Test
  public void testContextFactoryFindOrCreateCreatesOnlyOneObject() throws KBApiException {

    final KBCollection c1 = KBCollection.findOrCreate("Emu234");
    KBCollection c2 = KBCollection.findOrCreate("Emu234");
    assertTrue("Two different Emu234s are actually different objects!", c2 == c1);
    assertTrue("Two different Emu234s are not equals()!", c2.equals(c1));

    c2 = KBCollection.findOrCreate(c1.getCore());
    assertTrue("CycObject-based Emu234 and string-based version differ!", c1 == c2);

    c2 = KBCollection.findOrCreate(c1.getId());
    assertTrue("HLID-based BaseKB234 and string-based version differ!", c1 == c2);
  }

  @Test(expected = KBTypeConflictException.class)
  public void testFindOrCreateTypeConflictException() throws KBApiException {
    KBCollection c3 = KBCollection.findOrCreate("isa");
    System.out.println("Done.");
  }

  @Test(expected = InvalidNameException.class)
  public void testFindOrCreateInvalidNameException() throws KBApiException {
    KBCollection c3 = KBCollection.findOrCreate("Emu@#$SVA!@#R");
  }

  @Test
  public void testCollectionFactoryGetStatus() throws KBApiException {
    KBIndividual i1 = null;
    String testIndName = "TestIndividualForTypeConflict";
    try {
      assertTrue("Emu isn't a collection!", KBCollection.getStatus("Emu").equals(KBStatus.EXISTS_AS_TYPE));
      assertTrue("isa isn't in type-conflict with collection!", KBCollection.getStatus("isa").equals(KBStatus.EXISTS_WITH_TYPE_CONFLICT));
      assertTrue(testIndName + " shouldn't exist at all, but has status " + KBCollection.getStatus(testIndName) + ".",
              KBCollection.getStatus(testIndName).equals(KBStatus.DOES_NOT_EXIST));
      System.out.println("Status = " + KBCollection.getStatus(testIndName));
    } finally {
      if (KBIndividual.getStatus(testIndName) != KBStatus.DOES_NOT_EXIST) {
        KBIndividual.get(testIndName).delete();
      }
    }
  }

  @Test
  public void testCollectionFactoryExistsAsType() throws KBApiException {
    KBIndividual i1 = null;
    try {
      String testIndName = "TestIndividualForTypeConflict";

      assertTrue("Emu isn't a collection!", KBCollection.existsAsType("Emu"));
      assertFalse("isa is a collection!", KBCollection.existsAsType("isa"));
      assertFalse(testIndName + " is a collection.", KBCollection.existsAsType(testIndName));
      i1 = new KBIndividual(testIndName);
      assertFalse(testIndName + " is a collection!", KBCollection.existsAsType(testIndName));
    } finally {
      if (i1 != null) {
        i1.delete();
      }
    }
  }

}
