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

import com.cyc.kb.client.FactImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.exception.KBApiException;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import org.junit.AfterClass;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class RelationTest {

  private static Logger log = null;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(RelationTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testArity() throws KBApiException, UnknownHostException, IOException, Exception {
    KBPredicateImpl p = KBPredicateImpl.get("isa");
    assertTrue(p.getArityMin() == 2);
    assertTrue(p.getArityMax() == 2);
    assertTrue(p.getArity() == 2);
    final String predName = "testArityTestPred";
    assertFalse(KBPredicateImpl.existsAsType(predName));
    KBPredicateImpl np = KBPredicateImpl.findOrCreate(predName);
    new FactImpl("BaseKB", "(#$arityMax " + predName + " 12)");
    new FactImpl("BaseKB", "(#$arityMin " + predName + " 1)");

    assertTrue(np.getArityMin() == 1);
    assertTrue("Got " + np.getArityMax() + " as max arity, but expected 12", np.getArityMax() == 12);
    //assertTrue(p.setArity() == 2);

    np.delete();
  }
}
