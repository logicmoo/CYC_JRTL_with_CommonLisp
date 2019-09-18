package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.quant.ForAllQuantifiedInstanceRestrictedVariable;
import com.cyc.kb.quant.QuantifiedRestrictedVariable;
import com.cyc.kb.quant.ThereExistsQuantifiedInstanceRestrictedVariable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycObject;
import org.opencyc.util.DateConverter;

public class KBObjectTest {

  private static Logger log = null;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(KBObjectTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testGetAssertions() {
    //fail("Not yet implemented");
  }

  @Test
  public void testGetValuesString() {
    //fail("Not yet implemented");
  }

  @Test
  public void testGetValuesSPredicate() {
    //fail("Not yet implemented");
  }

  @Test
  public void testGetValuesSPredicateKBObject() {
    //fail("Not yet implemented");
  }

  @Test
  public void testSetAssertion() throws KBApiException {
    //(genls Dog CanisGenus)
    Predicate p = Predicate.get("genls");
    KBCollection c = KBCollection.get("Dog");
    KBCollection genl = KBCollection.get("CanisGenus");
    Fact a = c.addFact(Context.get("UniversalVocabularyMt"), p, 1,
            (Object) genl);

    //String factString = a.toString();
    //assertEquals(factString, "( (canonicalize-term #$genls)  (canonicalize-term #$Dog)  (canonicalize-term #$CanisGenus) )");
    //log.fine("Fact string: " + factString);

  }

  @Test
  public void testSetAssertion2() throws KBApiException {
    BinaryPredicate p = BinaryPredicate.get("physicalParts");
    KBCollection c1 = KBCollection.get("Heart");
    KBCollection c2 = KBCollection.get("Supracommissure");

    QuantifiedRestrictedVariable qc1 = new ForAllQuantifiedInstanceRestrictedVariable(c1);
    QuantifiedRestrictedVariable qc2 = new ThereExistsQuantifiedInstanceRestrictedVariable(c1);

    //forAll.quantified(c2);
    //c1.setObject(new Context("UniversalVocabularyMt"), p, c2);

    qc1.setObject(p, qc2, Context.get("UniversalVocabularyMt"));
    /*
     qc1.set(new Context("UniversalVocabularyMt"), p, qc1, qc2);
     // new Rule(ctx, p, qc1, qc2)
     f1 = Fact(p, uqc1, uqc2)
     f2 = f1.forAll(uqc1);
     f3 = f2.thereExists(uqc2);
      
     UnquantifiedLiteral ucq1 = new UnquantifiedLiteral(c1);
      
     f1 = new Fact( Formula(p, uqc1, uqc2).thereExists(uqc2).forAll(uqc1))
              
     f1 = Fact(p, forAll(uqc1), thereExists(uqc2))
              
     forAll(uqc1, thereExists(uqc2, f1))
     */
  }
  
  /*
   @Test
   public void testSetAssertion2() throws KBApiException {
   BinaryPredicate p = new BinaryPredicate("physicalParts");
   KBCollection c1 = new KBCollection("Heart");
   KBCollection c2 = new KBCollection("Supracommissure");
       
   RestrictedVariable uqc1 = new UnquantifiedInstanceVariable(c1);
   RestrictedVariable uqc2 = new UnquantifiedInstanceVariable(c2);
      
   f1 = new Fact( Formula(p, uqc1, uqc2).thereExists(uqc2).forAll(uqc1))
 
   }
   
   @Test
   public void testSetAssertion2() throws KBApiException {
   BinaryPredicate p = new BinaryPredicate("likes");
   KBCollection c = new KBCollection("Person");
       
   RestrictedVariable uqc1 = new UnquantifiedInstanceVariable(c, "var1");
   RestrictedVariable uqc2 = new UnquantifiedInstanceVariable(c, "var2");
      
   f1 = new Fact( Formula(p, uqc1, uqc2).thereExists(uqc2).forAll(uqc1))
 
   }
   */
//	@Test
//	public void testGetFact() {
//		//(genls Dog CanisGenus)
//		try {
//			KBCollection c = new KBCollection ("Dog");
//			Fact a = c.getFact("'(#$genls #$Dog #$CanisGenus)", "#$UniversalVocabularyMt");
//
//			LOG.fine("Fact string:" + a.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail("Exception when running the test case");
//		}
//	}
//	
  @Test
  public void testKBObjectHashSet() throws KBApiException {
    Set<KBObject> sso = new HashSet<KBObject>();

    sso.add(KBCollection.get("Dog"));
    sso.add(KBCollection.get("Dog"));
    assertEquals(1, sso.size());

  }

  @Test
  public void testComment() throws KBApiException {
    KBIndividual pluto = KBIndividual.get("Pluto");
    java.util.Collection<String> comments = pluto.getComments("UniverseDataMt");
    assertFalse("Found no comments for " + pluto, comments.isEmpty());
  }

  @Test
  public void testGetArguments() throws KBApiException {

    KBCollection c = KBCollection.get(
            "(SubcollectionOfWithRelationToTypeFn PettingAnAnimal doneBy Person)");
    assertEquals(c.<KBCollection>getArgument(3).toString(), "Person");
    assertEquals(c.<Predicate>getArgument(2).toString(), "doneBy");
    assertEquals(c.<FirstOrderCollection>getArgument(1).toString(), "PettingAnAnimal");
    assertEquals(c.<Relation>getArgument(0).toString(),
            "SubcollectionOfWithRelationToTypeFn");

    KBCollection pa = KBCollection.get("PettingAnAnimal");
    try {
      pa.<KBCollection>getArgument(0);
    } catch (Exception e) {
      assertEquals(e.getMessage(),
              "The object: PettingAnAnimal is an Atomic term. It does not have arguments.");
    }
    try {
      pa.<KBCollection>getArgument(1);
    } catch (Exception e) {
      assertEquals(e.getMessage(),
              "The object: PettingAnAnimal is an Atomic term. It does not have arguments.");
    }
  }

  @Test
  public void testGenerateJson() throws Exception {

    Context c = Context.get(
            "(InstanceWithRelationFromFn MappingMicrotheory informationStoreMappingMt (CycExtendedSystemFn LSCOMObjectAndSituationOntology))");
    System.out.println("\nGenerating JSON: " + c.generateJSON());

    Fact f = new Fact("UniversalVocabularyMt", "(isa Dog BiologicalSpecies)");

    System.out.println("\nGenerating JSON: " + f.generateJSON());

  }

  @Test
  public void testPredValues() throws Exception {
    Context c = Context.get("SCGTemplateMt");
    KBIndividual i = KBIndividual.get("SCGTemplate-PlaceInPlaceAPopularPlace");
    Predicate p = Predicate.get("nLPattern");
    Collection<List> list = i.getValues(p, 1, 2, c);
    System.out.println("TheList: " + list);
    assertEquals("[[(PatternTermFn Place 0),  in , (PatternTermFn Place 1), ,  a popular , (PatternTermFn Place 2)]]", list.toString());
  }
  
  @Test
  public void testQuotedIsa() throws KBApiException {
    FirstOrderCollection c = FirstOrderCollection.get("TheTerm");
    KBIndividual t = KBIndividual.findOrCreate("Trixie-TheDog");
    t.addQuotedIsa(c, Context.get("BaseKB"));
    assertEquals(t.getQuotedIsa().iterator().next(), c);
  }
  
  @Test
  public void testQuote() throws Exception {
    Function f = Function.get("Quote");
    KBCollection d = KBCollection.get("Dog");
    KBIndividual kbo1 = f.findOrCreateFunctionalTerm(KBIndividual.class, d);
    System.out.println("Quote 1: " + kbo1);
    
    KBIndividual kbo1_api = d.quote();
    assertEquals(kbo1, kbo1_api);

    List<Object> l = new ArrayList<Object>();
    l.add(Predicate.get("isa"));
    l.add(KBIndividual.get("ThePrototypicalDog"));
    l.add(KBCollection.get("Dog"));
    Sentence s = new Sentence(l.toArray());
    KBIndividual kbo2 = f.findOrCreateFunctionalTerm(KBIndividual.class, s);
    System.out.println("Quote 2: " + kbo2);
    
    KBIndividual kbo2_api = s.quote();
    assertEquals(kbo2, kbo2_api);

    //you can't make a sentence into a proprietary constant, no matter how hard you try!
    //@todo fix this test to test so we create  new constant, then assert something quoted about it.
    //kbo2_api.addQuotedIsa(KBCollection.get("ProprietaryConstant"), Constants.uvMt());
    //assertEquals(true, kbo2_api.isQuotedInstanceOf(KBCollection.get("ProprietaryConstant"), Constants.uvMt()));
    
    
    Fact b = s.addFact(Context.get("UniversalVocabularyMt"), Predicate.get("beliefs"), 2, KBIndividual.get("VijayRaj"));
    Fact b_expt = new Fact("UniversalVocabularyMt", "(beliefs VijayRaj (isa ThePrototypicalDog Dog))");
    assertEquals(b_expt, b);
    
  }
  
  @Test
  public void testCheckAndCastObject() throws Exception {

    Calendar c = Calendar.getInstance();
    c.set(2014, 0, 10, 16, 10, 10);
    Date d = c.getTime();
    
    CycAccess ca = CycAccess.getCurrent();
    CycConstant f1 = ca.getConstantByName("TheList");
    CycConstant c1 = ca.getConstantByName("RonaldReagan");
    CycConstant c2 = ca.getConstantByName("GeorgeHWBush");
    CycConstant c3 = ca.getConstantByName("UnitedStatesPresident");
    CycObject cd = DateConverter.toCycDate(d);
    
    CycNaut cn1 = new CycNaut(f1, c1, c2, c3, "President", 1, cd);
    List<Object> o1 = KBObject.checkAndCastObject(cn1);
    
    KBIndividual k1 = KBIndividual.class.cast(o1.get(0));
    assertEquals(c1, k1.getCore());

    KBIndividual k2 = KBIndividual.class.cast(o1.get(1));
    assertEquals(c2, k2.getCore());
    
    KBCollection k3 = KBCollection.class.cast(o1.get(2));
    assertEquals(c3, k3.getCore());
    
    assertEquals("President", String.class.cast(o1.get(3)));
    
    assertEquals(new Integer(1), Integer.class.cast(o1.get(4)));
    
    assertEquals(d, Date.class.cast(o1.get(5)));

    System.out.println("TheList Example: " + o1);
    
    CycConstant f2 = ca.getConstantByName("TheSet");
    CycNaut cn2 = new CycNaut(f2, c1, c2, c3, "President", 1, cd);
    
    HashSet<Object> o2 = KBObject.checkAndCastObject(cn2);
    assertEquals(6, o2.size());
    
    assertTrue(o2.contains(k1));
    assertTrue(o2.contains(k2));
    assertTrue(o2.contains(k3));
    assertTrue(o2.contains("President"));
    assertTrue(o2.contains(new Integer(1)));
    assertTrue(o2.contains(d));
    
    System.out.println("TheSet Example: " + o2);
    
    CycNaut cn3 = new CycNaut(f1, cn2, c1, c3, "President", 1, cd);
    List<Object> o3 = KBObject.checkAndCastObject(cn3);
    
    assertEquals(o2, HashSet.class.cast(o3.get(0)));
    System.out.println("The Nested List-Set: " + o3);
  }
}
