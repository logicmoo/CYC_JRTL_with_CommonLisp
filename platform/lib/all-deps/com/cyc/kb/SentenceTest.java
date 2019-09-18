/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.quant.InstanceRestrictedVariable;
import com.cyc.kb.quant.RestrictedVariable;
import com.cyc.kb.quant.SpecializationRestrictedVariable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycFormulaSentence;

/**
 *
 * @author vijay
 */
public class SentenceTest {
  
  public SentenceTest() {
  }
  
  @BeforeClass
  public static void setUpClass() throws Exception {
        TestConstants.ensureInitialized();
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
  public void testSentenceArgs() throws KBApiException {
    System.out.println("Sentence (Object[] args)");
    
    KBCollection c = KBCollection.get("#$Dog");
    RestrictedVariable rv = c.toInstanceRestrictedVariable();
    
    Predicate p = Predicate.get("#$owns");
    //Variable v = new Variable ("?PER");
    KBIndividual d = KBIndividual.get("DaveS");
    
    List<Object> ol = new ArrayList();
    ol.add(p);
    //ol.add(v);
    ol.add(d);
    ol.add(rv);
    
    Sentence instance = new Sentence(ol.toArray());
    System.out.println("Sentence: " + instance);
    // TODO review the generated test code and remove the default call to fail.
  }
  
  @Test
  public void testSentenceArgs2() throws KBApiException {
    System.out.println("Sentence (Object[] args)");
    
    KBCollection c = KBCollection.get("#$Dog");
    RestrictedVariable rv1 = c.toInstanceRestrictedVariable();
    Predicate p = Predicate.get("#$owns");
    KBCollection c2 = KBCollection.get("#$Person");
    RestrictedVariable rv2 = c2.toInstanceRestrictedVariable();
    
    List<Object> ol = new ArrayList();
    ol.add(p);
    ol.add(rv2);
    ol.add(rv1);
    
    Sentence instance = new Sentence(ol.toArray());
    System.out.println("Sentence: " + instance);
    
    RestrictedVariable rv3 = new SpecializationRestrictedVariable(null, c);
    
    List<Object> ol2 = new ArrayList();
    ol2.add(p);
    ol2.add(rv2);
    ol2.add(rv3);
    
    Sentence instance2 = new Sentence(ol2.toArray());
    System.out.println("Sentence: " + instance2);
  }
      
  @Test
  public void testSentenceArgs3() throws KBApiException {
    System.out.println("Sentence (Object[] args)");
    
    Symbol pred = new Symbol(":PRED");
    Variable well = new Variable("WELL");
    Variable date = new Variable("DATE");
    Variable event = new Variable("EVENT");
    
    List<Object> ol = new ArrayList();
    ol.add(pred);
    ol.add(well);
    ol.add(date);
    ol.add(event);
    
    Sentence instance = new Sentence(ol.toArray());
    System.out.println("Sentence: " + instance);
    
    List<Object> ol2 = new ArrayList();
    ol2.add(new Quantifier("thereExists"));
    ol2.add(event);
    ol2.add(instance);
    Sentence nestedS = new Sentence(ol2.toArray());
    System.out.println("Nested Sentence: " + nestedS);
    
    List<Object> ol3 = new ArrayList();
    ol3.add(KBObject.get("Quote"));
    ol3.add(nestedS);
    Sentence q = new Sentence(ol3.toArray());
    q.addFact(Context.get("UniversalVocabularyMt"), Predicate.get("sentenceParameterValueInSpecification"), 1, KBIndividual.findOrCreate("SomeQuerySpecification"));
    
    // TODO review the generated test code and remove the default call to fail.
  }
  
  @Test
  public void testNegatedSentenceFromString() throws KBApiException, CycApiException, IOException {
    System.out.println("testNegatedSentenceFromString");
        
    Sentence instance = new Sentence(CycFormulaSentence.makeCycSentence("(#$not (#$isa #$Thing #$Predicate))"));
    System.out.println("Sentence: " + instance);
    assertTrue(instance instanceof Sentence);
   }

  @Test
  public void testNegatedSentence() throws KBApiException, CycApiException, IOException {
    System.out.println("testNegatedSentence");
    Sentence base = new Sentence(CycFormulaSentence.makeCycSentence("(#$isa #$Thing #$Predicate)"));
    Sentence instance = new Sentence(KBTerm.get("not"), base);
    System.out.println("Sentence: " + instance);
    assertTrue(instance instanceof Sentence);
   }

  
   @Test
  public void testSentenceArgs4() throws KBApiException {
    System.out.println("Sentence (Object[] args)");
    
    
    List<Object> ol = new ArrayList();
    ol.add(KBObject.get("TheList"));
    
    Sentence instance = new Sentence(ol.toArray());
    System.out.println("Sentence: " + instance);
   }

   
   
   
   @Test
  public void testSentenceArgs5() throws KBApiException {
    System.out.println("Sentence (Object[] args)");
    
    String col = "Someevent type";
    
    //TODO: add sentence support to get to this target Sentence. We are not
    // capable of doing that yet. 
   String qStr = "(#$thereExists ?PRED\n"
            + " (#$thereExists ?BPRED\n"
            + "   (#$thereExists ?COL1\n"
            + "     (#$thereExists ?COL2\n"
            + "       (#$and\n"
            + "         (#$isa ?PRED #$QuantificationalRuleMacroPredicate-Canonical)"
            + "         (#$genls ?COL1 #$Event)"
            + "         (#$assertedSentence\n"
            + "           (#$genls " + col + " ?COL2))\n"
            + "         (#$assertionSentence ?ASSERTION (#$relationAllExists ?BPRED ?COL1 ?COL2)))))))";

    
    List<Object> ol = new ArrayList();
    ol.add(Predicate.get("relationAllExists"));
    ol.add(new InstanceRestrictedVariable(null, KBCollection.get("QuantificationalRuleMacroPredicate-Canonical")));
    ol.add(new SpecializationRestrictedVariable(null, KBCollection.get("Event")));
    ol.add(new SpecializationRestrictedVariable(null, KBCollection.get("DreamcatcherWell")));
    
    Sentence instance = new Sentence(ol.toArray());
    System.out.println("Sentence: " + instance);
   }
   
  /**
   * Test of getTypeString method, of class Sentence.
   */
  //@Test
  public void testGetTypeString() throws KBApiException {
    System.out.println("getTypeString");
    Sentence instance = new Sentence("");
    String expResult = "";
    String result = instance.getTypeString();
    //assertEquals(expResult, result);
    // @TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
  }
}
