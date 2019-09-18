/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.quant.QuantifiedInstanceRestrictedVariable;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.opencyc.cycobject.CycAssertion;
import org.opencyc.cycobject.CycFormulaSentence;

/**
 *
 * @author vijay
 */
public class TypeFactTest {
  
  public TypeFactTest() {
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
  public void testSomeMethod() throws Exception {
    CycFormulaSentence cfs = CycFormulaSentence.makeCycSentence("(relationAllExists inputsDestroyed BoilingWater (LiquidFn Water))");
                    
    CycAssertion ca = new CycAssertion(cfs, Constants.uvMt().getCore());
    System.out.println("CycAssertion: " + ca);
    
    TypeFact tf = new TypeFact(ca);
    System.out.println("Type Fact: " + tf);
  }
  
  @Test
  public void addTypeFacts() throws KBApiException {
    List<Object> argList = new ArrayList<Object>();
    KBCollection col_election = KBCollection.get("ElectionForOffice");
    QuantifiedInstanceRestrictedVariable election = new QuantifiedInstanceRestrictedVariable(new Quantifier("thereExists"), col_election);
    KBCollection col_official = KBCollection.get("ElectedOfficial");
    QuantifiedInstanceRestrictedVariable officer = new QuantifiedInstanceRestrictedVariable(new Quantifier("forAll"), col_official);
    Predicate pred_osel = Predicate.get("objectSelected");
    argList.add(pred_osel);
    argList.add(election);
    argList.add(officer);
    TypeFact tf = new TypeFact(Constants.uvMt(), argList.toArray());
    // Can't just cast to Fact to assertEquals?
    Fact f = new Fact(tf.getCore());
    
    Sentence s = new Sentence(Predicate.get("relationExistsAll"), pred_osel, col_election, col_official);
    Fact f_expt = new Fact(Constants.uvMt(), s);
    assertEquals(f_expt, f);
  }
}