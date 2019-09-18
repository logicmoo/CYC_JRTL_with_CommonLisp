package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
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
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycNaut;

public class FunctionTest {

  private static Logger log = null;
  private static Function appfn;
  private static KBCollection iPad;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(FunctionTest.class.getName());
    log.setLevel(Level.FINE);
    TestConstants.ensureInitialized();
    appfn = Function.findOrCreate("AppFn");
    appfn.addFact(Context.findOrCreate("AppleProductMt"), Predicate.findOrCreate("arity"), 1,
            (Object) 1);
    appfn.addResultIsa("Collection", "UniversalVocabularyMt");
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testFunction() throws KBApiException, UnknownHostException, IOException {
    String str = "AgeFn";
    KBCollection constrainingCol = KBCollection.get("#$UnaryFunction");
    Context ctx = Context.get("#$UniversalVocabularyMt");

    Function f = Function.findOrCreate(str, constrainingCol, ctx);
    assertEquals(f.getCore().cyclify(), "#$AgeFn");
  }

  @Test
  public void testFunctionString() {
    try {
      Function f = Function.findOrCreate("AppFn");
      f.addFact(Context.findOrCreate("AppleProductMt"), Predicate.get("arity"), 1,
              (Object) 1);
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to create or retrieve a Function");
    }
  }

  @Test
  public void testArgIsa() throws KBApiException {
    Function f = Function.findOrCreate("AppFn");
    KBCollection c = KBCollection.findOrCreate("iProduct");
    c.addGeneralization("Product", "AppleProductMt");

    f.addArgIsa(1, "iProduct", "AppleProductMt");
    assertEquals(f.getArgIsa(1, "AppleProductMt").iterator().next().toString(), "iProduct");
    new Fact("AppleProductMt", "(argIsa AppFn 1 iProduct)").delete();
    try {
      new Fact(true, "AppleProductMt", "(arg1Isa AppFn iProduct)");
      fail("This shouldn't be true any more.");
    } catch (KBApiException ex) {
    }
  }

  @Test
  public void testArgGenl() throws KBApiException {
    Function f = Function.findOrCreate("AppFn");

    // TODO: This assertion does not make sense logically. Find a better
    // assertion.
    f.addArgGenl(1, "Product", "AppleProductMt");
    assertEquals(f.getArgGenl(1, "AppleProductMt").iterator().next().toString(), "Product");
  }

  @Test
  public void testResultIsa() throws KBApiException {
    Function f = Function.findOrCreate("AppFn");
    final String computerProgramTypeByPlatform = "ComputerProgramTypeByPlatform";
    //ComputerProgramTypeByPlatform  
    // TODO: This assertion does not make sense logically. Find a better
    // assertion.
    f.addResultIsa(computerProgramTypeByPlatform, "AppleProductMt");
    final Collection<KBCollection> resultIsas = f.getResultIsa("AppleProductMt");
    assertTrue("resultIsas for " + f + " were " + resultIsas
            + ". Couldn't find " + computerProgramTypeByPlatform,
            resultIsas.contains(SecondOrderCollection.get(computerProgramTypeByPlatform)));
  }

  @Test
  public void testGenObject() throws KBApiException, Exception {
    Function f = Function.get("FruitFn");
    KBCollection c = f.<KBCollection>findOrCreateFunctionalTerm(KBCollection.class,
            KBCollection.get("AppleTree"));
    log.fine("Returned function extent: " + c.toString());

    Function f2 = Function.get("AVWorkWithIDFn");
    KBIndividual ct = f2.<KBIndividual>findOrCreateFunctionalTerm(KBIndividual.class,
            507995);
    log.fine("Returned func extent ct: " + ct.toString());
    assertTrue(ct + " should be an instance of CycNart, but isn't.", ct.getCore() instanceof CycNart);

    // TODO: The following three lines of code returns a NAUT
    // (AVAnalysisContextFn AVWorkWithIDFn) this is completely wrong!
    // CycAPI is not checking if what is returned is valid or not
    Function f3 = Function.get("AVAnalysisContextFn");
    //SObj mt = f3.<SObj>genObject(SObj.class, f2);
    //log.fine("Returned func extent mt: " + mt.toString());

    Context ctx2 = f3.<Context>findOrCreateFunctionalTerm(Context.class, ct);
    final java.util.Collection<Context> supers = ctx2.getInheritsFrom();
    log.fine("Returned func extent mt: " + supers);
    assertTrue(supers.contains(Context.findOrCreate("AVAnalysisCeilingMt")));

    KBIndividual i = KBIndividual.findOrCreate("VijayRaj009");
    i.instantiates(KBCollection.get("Person"), ctx2);

    i.instantiates("MaleHuman", 
            "(#$AVAnalysisContextFn (AVWorkWithIDFn 507995) )");
    Fact a = new Fact("(#$AVAnalysisContextFn (AVWorkWithIDFn 507995) )",
            "(#$isa #$VijayRaj009 #$IndianCitizenOrSubject)");

    try {
      String s = f3.<String>findOrCreateFunctionalTerm(String.class, ct);
    } catch (Exception e) {
      assertEquals(e.getMessage(),
              "Casting of type class java.lang.String not supported");
    }

    // Apple Ontology related
    KBCollection ipad = KBCollection.findOrCreate("iPad");
    ipad.addGeneralization("iProduct", "AppleProductMt");

    KBCollection ipadapp = appfn.<KBCollection>findOrCreateFunctionalTerm(
            KBCollection.class, (Object) ipad);
    ipadapp.instantiates("ComputerProgramTypeByPlatform", "AppleProductMt");

    Function f4 = Function.get("MtSpace");
    f4.<Context>findOrCreateFunctionalTerm(Context.class, new Date());
  }

  @Test
  public void testUnreifiableFunctionWithDateInput() throws KBApiException {
    try {
      Function f4 = Function.get("MtDim");
      Predicate p = Predicate.get("mtTimeIndex");
      Context c = f4.<Context>findOrCreateFunctionalTerm(Context.class, p, new Date());
      System.out.println("Context : " + c);

      Function dollars = Function.findOrCreate("(USDollarFn 2012)");
      KBIndividual m1 = dollars.findOrCreateFunctionalTerm(KBIndividual.class, 5);
      System.out.println("Ind 1: " + m1);

      KBIndividual m2 = KBIndividual.findOrCreate("((USDollarFn 2012) 5)");
      System.out.println("Ind 2: " + m2);
      assertTrue(m2 + " should be a NAUT, but is not.", m2.getCore() instanceof CycNaut);
      
    } catch (Exception e) {
      e.printStackTrace();
      e.getCause().printStackTrace();
      fail("Something went wrong");
    }
  }

  @Test
  public void testUnreifiableFunctionWithDateInput2() throws KBApiException {
  
    Function f1 = Function.get ("USDollarFn");
    Function f2 = f1.findOrCreateFunctionalTerm(Function.class, 2012);
    KBIndividual i1 = f2.findOrCreateFunctionalTerm(KBIndividual.class, 10000000);
    
    Predicate p = Predicate.get("revenueForPeriodByAccountingCOC");
    KBIndividual w = KBIndividual.get("Walmart-CommercialOrganization");
    
    Function fy = Function.get("FiscalYearFn");
    KBIndividual i2 = fy.findOrCreateFunctionalTerm(KBIndividual.class, w, 2012);
    KBIndividual coc = KBIndividual.findOrCreate("(#$AccountingCodeOfTypeTypicallyUsedByAgentFn #$GenerallyAcceptedAccountingPrinciples #$Walmart-CommercialOrganization)");
    w.addFact(Constants.uvMt(), p, 1, i1, i2, coc);
  }
  
  @Test
  public void testDelete() {
    try {
      Function f = Function.get("AppFn");
      f.delete();

      new KBCollection("iProduct").delete();
      new KBCollection("iPad").delete();
      new Context("AppleProductFn").delete();

      assertEquals(f.getComments("").size(), 0);
    } catch (KBApiException ex) {
      assertEquals(ex.getCause().getMessage(), "Expected constant not found #$AppFn");
    } catch (Exception e) {
      e.printStackTrace();
      fail("Failed to delete something.");
    }
  }
  
  @Test 
  public void testFunctionCreateKBTerm() throws Exception {
  
  Function fin = Function.get("FindObjectByCompactHLExternalIDStringFn");
  Function phys = Function.get("ThePhysicalFieldValueFn");
  
  KBIndividual ps = KBIndividual.findOrCreate("DreamStore-EVIDENCE-PS");
  ps.isInstanceOf(KBCollection.get("PhysicalSchema"), Context.get("UniversalVocabularyMt"));
  
  fin.findOrCreateFunctionalTerm(KBTerm.class, 
          phys.findOrCreateFunctionalTerm(KBIndividual.class, ps, "SOMETHING"));
  
  Function lsf = Function.get("TheLogicalFieldValueFn");
  
  
  KBIndividual ls = KBIndividual.findOrCreate("DreamStore-EVIDENCE-LS");
  ls.isInstanceOf(KBCollection.get("LogicalSchema"), Context.get("UniversalVocabularyMt"));
  
  //(TheLogicalFieldValueFn DreamStore-EVIDENCE-LS Set-Mathematical 1)
  lsf.findOrCreateFunctionalTerm(KBTerm.class, ls, KBCollection.get("Set-Mathematical"), 1);
  }
}
