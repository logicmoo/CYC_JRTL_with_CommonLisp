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

import com.cyc.base.cycobject.Nart;
import com.cyc.base.cycobject.Naut;
import com.cyc.kb.Context;
import com.cyc.kb.Fact;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBFunction;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.FactImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBFunctionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.client.KBTermImpl;
import com.cyc.kb.client.SecondOrderCollectionImpl;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBApiRuntimeException;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.AfterClass;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class KBFunctionTest {

  private static Logger log = null;
  private static KBFunctionImpl appfn;
  private static KBCollection iPad;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(KBFunctionTest.class.getName());
    log.setLevel(Level.FINE);
    TestConstants.ensureInitialized();
    appfn = KBFunctionImpl.findOrCreate("AppFn");
    appfn.addFact(ContextImpl.findOrCreate("AppleProductMt"), KBPredicateImpl.findOrCreate("arity"), 1,
            (Object) 1);
    appfn.addResultIsa("Collection", "UniversalVocabularyMt");
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testFunction() throws KBApiException, UnknownHostException, IOException {
    String str = "AgeFn";
    KBCollection constrainingCol = KBCollectionImpl.get("#$UnaryFunction");
    ContextImpl ctx = ContextImpl.get("#$UniversalVocabularyMt");

    KBFunctionImpl f = KBFunctionImpl.findOrCreate(str, constrainingCol, ctx);
    assertEquals(f.getCore().cyclify(), "#$AgeFn");
  }

  @Test
  public void testFunctionString() {
    try {
      KBFunctionImpl f = KBFunctionImpl.findOrCreate("AppFn");
      f.addFact(ContextImpl.findOrCreate("AppleProductMt"), KBPredicateImpl.get("arity"), 1,
              (Object) 1);
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create or retrieve a Function");
    }
  }

  @Test
  public void testArgIsa() throws KBApiException {
    KBFunctionImpl f = KBFunctionImpl.findOrCreate("AppFn");
    KBCollection c = KBCollectionImpl.findOrCreate("iProduct");
    c.addGeneralization("Product", "AppleProductMt");

    f.addArgIsa(1, "iProduct", "AppleProductMt");
    assertEquals(f.getArgIsa(1, "AppleProductMt").iterator().next().toString(), "iProduct");
    new FactImpl("AppleProductMt", "(argIsa AppFn 1 iProduct)").delete();
    try {
      new FactImpl(true, "AppleProductMt", "(arg1Isa AppFn iProduct)");
      fail("This shouldn't be true any more.");
    } catch (KBApiException ex) {
    }
  }

  @Test
  public void testArgGenl() throws KBApiException {
    KBFunctionImpl f = KBFunctionImpl.findOrCreate("AppFn");

    // TODO: This assertion does not make sense logically. Find a better
    // assertion.
    f.addArgGenl(1, "Product", "AppleProductMt");
    assertEquals(f.getArgGenl(1, "AppleProductMt").iterator().next().toString(), "Product");
  }

  @Test
  public void testResultIsa() throws KBApiException {
    KBFunction f = KBFunctionImpl.findOrCreate("AppFn");
    final String computerProgramTypeByPlatform = "ComputerProgramTypeByPlatform";
    //ComputerProgramTypeByPlatform  
    // TODO: This assertion does not make sense logically. Find a better
    // assertion.
    f.addResultIsa(computerProgramTypeByPlatform, "AppleProductMt");
    final Collection<KBCollection> resultIsas = f.getResultIsa("AppleProductMt");
    assertTrue("resultIsas for " + f + " were " + resultIsas
            + ". Couldn't find " + computerProgramTypeByPlatform,
            resultIsas.contains(SecondOrderCollectionImpl.get(computerProgramTypeByPlatform)));
  }

  @Test
  public void testGenObject() throws KBApiException, Exception {
    KBFunctionImpl f = KBFunctionImpl.get("FruitFn");
    KBCollection c = f.<KBCollection>findOrCreateFunctionalTerm(KBCollection.class,
            KBCollectionImpl.get("AppleTree"));
    log.fine("Returned function extent: " + c.toString());

    KBFunctionImpl f2 = KBFunctionImpl.get("AVWorkWithIDFn");
    KBIndividual ct = f2.<KBIndividual>findOrCreateFunctionalTerm(KBIndividual.class,
            507995);
    log.fine("Returned func extent ct: " + ct.toString());
    assertTrue(ct + " should be an instance of CycNart, but isn't.", ct.getCore() instanceof Nart);

    // TODO: The following three lines of code returns a NAUT
    // (AVAnalysisContextFn AVWorkWithIDFn) this is completely wrong!
    // CycAPI is not checking if what is returned is valid or not
    KBFunctionImpl f3 = KBFunctionImpl.get("AVAnalysisContextFn");
    //SObj mt = f3.<SObj>genObject(SObj.class, f2);
    //log.fine("Returned func extent mt: " + mt.toString());

    Context ctx2 = f3.<Context>findOrCreateFunctionalTerm(Context.class, ct);
    final Collection<Context> supers = ctx2.getInheritsFrom();
    log.fine("Returned func extent mt: " + supers);
    assertTrue(supers.contains(ContextImpl.findOrCreate("AVAnalysisCeilingMt")));

    KBIndividual i = KBIndividualImpl.findOrCreate("VijayRaj009");
    i.instantiates(KBCollectionImpl.get("Person"), ctx2);

    i.instantiates("MaleHuman", 
            "(#$AVAnalysisContextFn (AVWorkWithIDFn 507995) )");
    Fact a = new FactImpl("(#$AVAnalysisContextFn (AVWorkWithIDFn 507995) )",
            "(#$isa #$VijayRaj009 #$IndianCitizenOrSubject)");

    // Apple Ontology related
    KBCollection ipad = KBCollectionImpl.findOrCreate("iPad");
    ipad.addGeneralization("iProduct", "AppleProductMt");

    KBCollection ipadapp = appfn.<KBCollection>findOrCreateFunctionalTerm(
            KBCollection.class, (Object) ipad);
    ipadapp.instantiates("ComputerProgramTypeByPlatform", "AppleProductMt");

    KBFunctionImpl f4 = KBFunctionImpl.get("MtSpace");
    f4.<Context>findOrCreateFunctionalTerm(Context.class, new Date());
    
    try {
      String s = f3.<String>findOrCreateFunctionalTerm(String.class, ct);
    } catch (Exception e) {
      // assertEquals(e.getMessage(), "Casting of type class java.lang.String not supported");
      assertEquals(e.getMessage(),
          "com.cyc.kb.client.ContextImpl cannot be cast to java.lang.String");
    }

  }

  @Test
  public void testUnreifiableFunctionWithDateInput() throws KBApiException {
    try {
      KBFunctionImpl f4 = KBFunctionImpl.get("MtDim");
      KBPredicate p = KBPredicateImpl.get("mtTimeIndex");
      Context c = f4.<Context>findOrCreateFunctionalTerm(Context.class, p, new Date());
      System.out.println("Context : " + c);

      KBFunctionImpl dollars = KBFunctionImpl.findOrCreate("(USDollarFn 2012)");
      KBIndividual m1 = dollars.findOrCreateFunctionalTerm(KBIndividualImpl.class, 5);
      System.out.println("Ind 1: " + m1);

      KBIndividualImpl m2 = KBIndividualImpl.findOrCreate("((USDollarFn 2012) 5)");
      System.out.println("Ind 2: " + m2);
      assertTrue(m2 + " should be a NAUT, but is not.", m2.getCore() instanceof Naut);
      
    } catch (Exception e) {
      e.printStackTrace();
      e.getCause().printStackTrace();
      fail("Something went wrong");
    }
  }

  @Test
  public void testUnreifiableFunctionWithDateInput2() throws KBApiException {
  
    KBFunctionImpl f1 = KBFunctionImpl.get ("USDollarFn");
    KBFunctionImpl f2 = f1.findOrCreateFunctionalTerm(KBFunctionImpl.class, 2012);
    KBIndividual i1 = f2.findOrCreateFunctionalTerm(KBIndividualImpl.class, 10000000);
    
    KBPredicate p = KBPredicateImpl.get("revenueForPeriodByAccountingCOC");
    KBIndividualImpl w = KBIndividualImpl.get("Walmart-CommercialOrganization");
    
    KBFunctionImpl fy = KBFunctionImpl.get("FiscalYearFn");
    KBIndividual i2 = fy.findOrCreateFunctionalTerm(KBIndividualImpl.class, w, 2012);
    KBIndividual coc = KBIndividualImpl.findOrCreate("(#$AccountingCodeOfTypeTypicallyUsedByAgentFn #$GenerallyAcceptedAccountingPrinciples #$Walmart-CommercialOrganization)");
    w.addFact(Constants.uvMt(), p, 1, i1, i2, coc);
  }
  
  @Test
  public void testDelete() {
    try {
      
      KBFunctionImpl f = KBFunctionImpl.get("AppFn");
      f.delete();

      new KBCollectionImpl("iProduct").delete();
      new KBCollectionImpl("iPad").delete();
      new ContextImpl("AppleProductFn").delete();

      assertEquals(f.getComments("").size(), 0);
    } catch (KBApiRuntimeException ex) {
      assertEquals(ex.getMessage(), "The reference to AppFn object is stale. Possibly because it was delete using x.delete() method.");
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to delete something.");
    }
  }
  
  @Test 
  public void testFunctionCreateKBTerm() throws Exception {
  
  KBFunctionImpl fin = KBFunctionImpl.get("FindObjectByCompactHLExternalIDStringFn");
  KBFunctionImpl phys = KBFunctionImpl.get("ThePhysicalFieldValueFn");
  
  KBIndividualImpl ps = KBIndividualImpl.findOrCreate("DreamStore-EVIDENCE-PS");
  ps.isInstanceOf(KBCollectionImpl.get("PhysicalSchema"), ContextImpl.get("UniversalVocabularyMt"));
  
  fin.findOrCreateFunctionalTerm(KBTermImpl.class, 
          phys.findOrCreateFunctionalTerm(KBIndividualImpl.class, ps, "SOMETHING"));
  
  KBFunctionImpl lsf = KBFunctionImpl.get("TheLogicalFieldValueFn");
  
  
  KBIndividualImpl ls = KBIndividualImpl.findOrCreate("DreamStore-EVIDENCE-LS");
  ls.isInstanceOf(KBCollectionImpl.get("LogicalSchema"), ContextImpl.get("UniversalVocabularyMt"));
  
  //(TheLogicalFieldValueFn DreamStore-EVIDENCE-LS Set-Mathematical 1)
  lsf.findOrCreateFunctionalTerm(KBTermImpl.class, ls, KBCollectionImpl.get("Set-Mathematical"), 1);
  }
}
