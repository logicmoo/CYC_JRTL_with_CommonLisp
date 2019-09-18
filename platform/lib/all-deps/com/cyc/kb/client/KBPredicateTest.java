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

import com.cyc.kb.Context;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBObjectImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBApiRuntimeException;
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

public class KBPredicateTest {

  private static Logger log = null;
  private static Set<KBObjectImpl> testTerms = new HashSet<KBObjectImpl>();

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(KBPredicateTest.class.getName());
    TestConstants.ensureInitialized();
    if (!ContextImpl.existsAsType("AppleProductMt")) {
      testTerms.add(ContextImpl.findOrCreate("AppleProductMt"));
    }
    if (!KBPredicateImpl.existsAsType("iLikes")) {
      testTerms.add(KBPredicateImpl.findOrCreate("iLikes"));
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
        
        KBIndividualImpl i = KBIndividualImpl.get(str);
        assertEquals(i.getCore().cyclify(), "#$age");
    }


  @Test
  public void testGenls() throws Exception {
      KBPredicate p = KBPredicateImpl.get("iLikes");
      Context ctx = ContextImpl.get("AppleProductMt");
      p.addGeneralization("likesObject", "AppleProductMt");
      assertTrue(p.getGeneralizations("AppleProductMt").contains(KBPredicateImpl.get("likesObject")));
  }

  @Test
  public void testSpecs() throws KBApiException {
      KBPredicate p = KBPredicateImpl.get("likesObject");
      p.addSpecialization("iLikes", "AppleProductMt");
      assertTrue(p.getSpecializations("AppleProductMt").contains(KBPredicateImpl.get("iLikes")));
  }

  @Test
  public void testArgIsa() throws KBApiException {
      KBPredicateImpl p = KBPredicateImpl.get("iLikes");
      p.addArgIsa(1, "Person", "AppleProductMt");
      assertEquals(p.getArgIsa(1, "AppleProductMt").iterator().next().toString(), "Person");

      KBCollection iprod = new KBCollectionImpl("iProduct");
      iprod.addGeneralization("Product", "AppleProductMt");
      p.addArgIsa(2, iprod, new ContextImpl("AppleProductMt"));
  }

  @Test
  public void testArgGenl() throws KBApiException {
      KBPredicateImpl p = KBPredicateImpl.get("iLikes");

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
      KBPredicateImpl p = KBPredicateImpl.findOrCreate("iLikes2");
      p.delete();

      KBCollectionImpl.findOrCreate("iProduct2").delete();
      ContextImpl.findOrCreate("AppleProductMt2").delete();

      assertEquals(p.getComments("").size(), 0);
    } catch (KBApiRuntimeException ex) {
      assertEquals(ex.getMessage(),
              "The reference to iLikes2 object is stale. Possibly because it was delete using x.delete() method.");
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to delete predicate");
    }
  }
}
