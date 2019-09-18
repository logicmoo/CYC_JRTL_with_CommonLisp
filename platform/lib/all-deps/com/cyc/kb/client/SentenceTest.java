/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.Sentence;
import com.cyc.kb.Symbol;
import com.cyc.kb.Variable;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBFunctionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.client.KBTermImpl;
import com.cyc.kb.client.QuantifierImpl;
import com.cyc.kb.client.SentenceImpl;
import com.cyc.kb.client.SymbolImpl;
import com.cyc.kb.client.VariableImpl;
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


/**
 *
 * @author vijay
 */
// TODO: Cleanup this test suite
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
    
    KBCollection c = KBCollectionImpl.get("#$Dog");
    RestrictedVariable rv = c.toInstanceRestrictedVariable();
    
    KBPredicate p = KBPredicateImpl.get("#$owns");
    //Variable v = new Variable ("?PER");
    KBIndividual d = KBIndividualImpl.get("DaveS");
    
    List<Object> ol = new ArrayList();
    ol.add(p);
    //ol.add(v);
    ol.add(d);
    ol.add(rv);
    
    Sentence instance = new SentenceImpl(ol.toArray());
    System.out.println("Sentence: " + instance);
    // TODO review the generated test code and remove the default call to fail.
  }
  
  @Test
  public void testSentenceArgs2() throws KBApiException {
    System.out.println("Sentence (Object[] args)");
    
    KBCollection c = KBCollectionImpl.get("#$Dog");
    RestrictedVariable rv1 = c.toInstanceRestrictedVariable();
    KBPredicate p = KBPredicateImpl.get("#$owns");
    KBCollection c2 = KBCollectionImpl.get("#$Person");
    RestrictedVariable rv2 = c2.toInstanceRestrictedVariable();
    
    List<Object> ol = new ArrayList();
    ol.add(p);
    ol.add(rv2);
    ol.add(rv1);
    
    Sentence instance = new SentenceImpl(ol.toArray());
    System.out.println("Sentence: " + instance);
    
    RestrictedVariable rv3 = new SpecializationRestrictedVariable(null, c);
    
    List<Object> ol2 = new ArrayList();
    ol2.add(p);
    ol2.add(rv2);
    ol2.add(rv3);
    
    Sentence instance2 = new SentenceImpl(ol2.toArray());
    System.out.println("Sentence: " + instance2);
  }
      
  @Test
  public void testSentenceArgs3() throws KBApiException {
    System.out.println("Sentence (Object[] args)");
    
    Symbol pred = new SymbolImpl(":PRED");
    Variable well = new VariableImpl("WELL");
    Variable date = new VariableImpl("DATE");
    Variable event = new VariableImpl("EVENT");
    
    List<Object> ol = new ArrayList();
    ol.add(pred);
    ol.add(well);
    ol.add(date);
    ol.add(event);
    
    Sentence instance = new SentenceImpl(ol.toArray());
    System.out.println("Sentence: " + instance);
    
    List<Object> ol2 = new ArrayList();
    ol2.add(new QuantifierImpl("thereExists"));
    ol2.add(event);
    ol2.add(instance);
    Sentence nestedS = new SentenceImpl(ol2.toArray());
    System.out.println("Nested Sentence: " + nestedS);
    
    List<Object> ol3 = new ArrayList();
    ol3.add(KBFunctionImpl.get("Quote"));
    ol3.add(nestedS);
    SentenceImpl q = new SentenceImpl(ol3.toArray());
    q.addFact(ContextImpl.get("UniversalVocabularyMt"), KBPredicateImpl.get("sentenceParameterValueInSpecification"), 1, KBIndividualImpl.findOrCreate("SomeQuerySpecification"));
    
    // TODO review the generated test code and remove the default call to fail.
  }
  
  @Test
  public void testNegatedSentenceFromString() throws KBApiException, CycApiException, IOException, CycConnectionException {
    System.out.println("testNegatedSentenceFromString");
        
    Sentence instance = new SentenceImpl(CycFormulaSentence.makeCycSentence("(#$not (#$isa #$Thing #$Predicate))"));
    System.out.println("Sentence: " + instance);
    assertTrue(instance instanceof Sentence);
   }

  @Test
  public void testNegatedSentence() throws KBApiException, CycApiException, IOException, CycConnectionException {
    System.out.println("testNegatedSentence");
    Sentence base = new SentenceImpl(CycFormulaSentence.makeCycSentence("(#$isa #$Thing #$Predicate)"));
    Sentence instance = new SentenceImpl(KBTermImpl.get("not"), base);
    System.out.println("Sentence: " + instance);
    assertTrue(instance instanceof Sentence);
   }

  
   @Test
  public void testSentenceArgs4() throws KBApiException {
    System.out.println("Sentence (Object[] args)");
    
    
    List<Object> ol = new ArrayList();
    ol.add(KBFunctionImpl.get("TheList"));
    
    Sentence instance = new SentenceImpl(ol.toArray());
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
    ol.add(KBPredicateImpl.get("relationAllExists"));
    ol.add(new InstanceRestrictedVariable(null, KBCollectionImpl.get("QuantificationalRuleMacroPredicate-Canonical")));
    ol.add(new SpecializationRestrictedVariable(null, KBCollectionImpl.get("Event")));
    ol.add(new SpecializationRestrictedVariable(null, KBCollectionImpl.get("Dog")));
    
    Sentence instance = new SentenceImpl(ol.toArray());
    System.out.println("Sentence: " + instance);
   }
   
  /**
   * Test of getTypeString method, of class Sentence.
   */
  //@Test
  public void testGetTypeString() throws KBApiException {
    System.out.println("getTypeString");
    SentenceImpl instance = new SentenceImpl("");
    String expResult = "";
    String result = instance.getTypeString();
    //assertEquals(expResult, result);
    // @TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
  }
}
