package com.cyc.kb;

import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.Predicate;
import com.cyc.kb.Context;
import com.cyc.kb.KBObject;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeConflictException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class PredicateTest {

  private static Logger log = null;
  private static Set<KBObject> testTerms = new HashSet<KBObject>();

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(PredicateTest.class.getName());
    TestConstants.ensureInitialized();
    if (!Context.existsAsType("AppleProductMt")) {
      testTerms.add(Context.findOrCreate("AppleProductMt"));
    }
    if (!Predicate.existsAsType("iLikes")) {
      testTerms.add(Predicate.findOrCreate("iLikes"));
    }
  }

  @AfterClass
  public static void tearDown() throws Exception {
      for (KBObject obj : testTerms) {
          obj.delete();
      }
  }
  
     @Test
    public void testPredicate() throws KBApiException, UnknownHostException, IOException {
        String str = "age";
        KBCollection constrainingCol = KBCollection.get("#$MeasurableQuantitySlot");
        Context ctx = Context.get("#$UniversalVocabularyMt");
        
        KBIndividual i = new KBIndividual(ctx, str, constrainingCol); //@todo convert to use IndividualFactory
        assertEquals(i.getCore().cyclify(), "#$age");
    }

  @Test
  public void testGenls() throws Exception {
      Predicate p = Predicate.get("iLikes");
      Context ctx = Context.get("AppleProductMt");
      p.addGeneralization("likesObject", "AppleProductMt");
      assertTrue(p.getGeneralizations("AppleProductMt").contains(Predicate.get("likesObject")));
  }

  @Test
  public void testSpecs() throws KBApiException {
      Predicate p = Predicate.get("likesObject");
      p.addSpecialization("iLikes", "AppleProductMt");
      assertTrue(p.getSpecializations("AppleProductMt").contains(Predicate.get("iLikes")));
  }

  @Test
  public void testArgIsa() throws KBApiException {
      Predicate p = Predicate.get("iLikes");
      p.addArgIsa(1, "Person", "AppleProductMt");
      assertEquals(p.getArgIsa(1, "AppleProductMt").iterator().next().toString(), "Person");

      KBCollection iprod = new KBCollection("iProduct");
      iprod.addGeneralization("Product", "AppleProductMt");
      p.addArgIsa(2, iprod, new Context("AppleProductMt"));
  }

  @Test
  public void testArgGenl() throws KBApiException {
      Predicate p = Predicate.get("iLikes");

      // TODO: This assertion does not make sense logically. Find a better
      // assertion.
      p.addArgGenl(2, "Product", "AppleProductMt");
      assertEquals(p.getArgGenl(2, "AppleProductMt").iterator().next().toString(), "Product");
  }

//  @Test
//  public void testChaining() throws KBTypeConflictException, InvalidNameException, KBApiException {
//      BinaryPredicate p1 = BinaryPredicate.findOrCreate("iLikes34");
//      testTerms.add(p1);
//      BinaryPredicate p2 = p1.addArgGenl(1, "Person", "BaseKB").addGeneralization("likesAsFriend", "BaseKB");
//      assertEquals("Chained methods did not return the original predicate", p1, p2);
//      assertTrue("Chained methods did not return the original predicate", p2.getGeneralizations().contains(Predicate.get("likesAsFriend")));
//              
//  }
  
  @Test
  public void testDelete() {
    try {
      Predicate p = Predicate.findOrCreate("iLikes2");
      p.delete();

      KBCollection.findOrCreate("iProduct2").delete();
      Context.findOrCreate("AppleProductMt2").delete();

      assertEquals(p.getComments("").size(), 0);
    } catch (KBApiException ex) {
      assertEquals(ex.getCause().getMessage(),
              "Expected constant not found #$iLikes2");
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to delete predicate");
    }
  }
}
