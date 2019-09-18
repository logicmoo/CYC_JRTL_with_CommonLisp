/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb.quant;

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

import com.cyc.kb.quant.ForAllQuantifiedInstanceRestrictedVariable;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.TestConstants;
import com.cyc.kb.exception.KBApiException;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author vijay
 */
public class ForAllQuantifiedInstanceLiteralTest {

  private static Logger log = null;

  public ForAllQuantifiedInstanceLiteralTest() throws Exception {
    log = Logger.getLogger(ForAllQuantifiedInstanceLiteralTest.class.getName());
    log.setLevel(Level.FINE);
    TestConstants.ensureInitialized();
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testSomeMethod() throws KBApiException {
    ForAllQuantifiedInstanceRestrictedVariable faqc = new ForAllQuantifiedInstanceRestrictedVariable(KBCollectionImpl.get("#$Dog"));
    System.out.print(faqc);
    
    //forAll.quantified(null);
  }
}