/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opencyc.cycobject;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import org.opencyc.api.CycAccess;
import static org.opencyc.api.CycAccess.*;
import org.opencyc.api.CycObjectFactory;
import static org.opencyc.api.TestUtils.getCyc;
import static org.opencyc.cycobject.CycFormulaSentence.*;
import org.opencyc.inference.params.DefaultInferenceParameters;

/**
 *
 * @author daves
 */
public class CycFormulaSentenceTest {

  private final String genlsMarkDugganBLO = "(#$genls #$MarkDuggan-SoccerPlayer #$BiologicalLivingObject)";
  private final String isaMarkDugganBLO = "(#$isa #$MarkDuggan-SoccerPlayer #$BiologicalLivingObject)";
  private final CycVariable X = CycObjectFactory.makeCycVariable("X");
  final CycFormulaSentence isaThingThing = makeCycFormulaSentence(isa, thing,
          thing);

  public CycFormulaSentenceTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of makeCycFormulaSentence method, of class CycFormulaSentence.
   */
  @Test
  public void testMakeCycFormulaSentence() {
    System.out.println("makeCycFormulaSentence");
    makeCycFormulaSentence(isa, thing, thing);
  }

  /**
   * Test of makeConjunction method, of class CycFormulaSentence.
   */
  @Test
  public void testMakeConjunction_CycFormulaSentenceArr() {
    System.out.println("makeConjunction");
    assertTrue(makeConjunction(isaThingThing, isaThingThing).isConjunction());
  }

  /**
   * Test of makeConjunction method, of class CycFormulaSentence.
   */
  @Test
  public void testMakeConjunction_Iterable() {
    System.out.println("makeConjunction");
    assertTrue(
            makeConjunction(Arrays.asList(isaThingThing, isaThingThing)).isConjunction());
  }

  /**
   * Test of makeDisjunction method, of class CycFormulaSentence.
   */
  @Test
  public void testMakeDisjunction() {
    System.out.println("makeDisjunction");
    makeDisjunction(Arrays.asList(isaThingThing, isaThingThing));
  }

  /**
   * Test of makeNegation method, of class CycFormulaSentence.
   */
  @Test
  public void testMakeNegation() {
    System.out.println("makeNegation");
    assertTrue(makeNegation(isaThingThing).isNegated());
  }

  /**
   * Test of convertIfPromising method, of class CycFormulaSentence.
   */
  @Test
  public void testConvertIfPromising() {
    System.out.println("convertIfPromising");
    assertTrue(
            convertIfPromising(CycList.makeCycList(isa, thing, thing)) instanceof CycFormulaSentence);
  }

  /**
   * Test of isConditionalSentence method, of class CycFormulaSentence.
   */
  @Test
  public void testIsConditionalSentence() {
    System.out.println("isConditionalSentence");
    assertTrue(makeConditional(isaThingThing,
            isaThingThing).isConditionalSentence());
  }

  /**
   * Test of isConjunction method, of class CycFormulaSentence.
   */
  @Test
  public void testIsConjunction() {
    System.out.println("isConjunction");
    assertTrue(makeConjunction(isaThingThing).isConjunction());
  }

  /**
   * Test of isLogicalConnectorSentence method, of class CycFormulaSentence.
   */
  @Test
  public void testIsLogicalConnectorSentence() {
    System.out.println("isLogicalConnectorSentence");
    assertTrue(makeConjunction(isaThingThing).isLogicalConnectorSentence());
  }

  /**
   * Test of isExistential method, of class CycFormulaSentence.
   */
  @Test
  public void testIsExistential() {
    System.out.println("isExistential");
    final CycFormulaSentence sentence = makeCycFormulaSentence(isa, X, thing);
    assertFalse(sentence.isExistential());
    sentence.existentiallyBind(X);
    assertTrue(sentence.isExistential());
  }

  /**
   * Test of isUniversal method, of class CycFormulaSentence.
   */
  @Test
  public void testIsUniversal() {
    System.out.println("isUniversal");
    assertFalse(isaThingThing.isUniversal());
  }

  /**
   * Test of getOptimizedVarNames method, of class CycFormulaSentence.
   */
  @Test
  public void testGetOptimizedVarNames() throws Exception {
    System.out.println("getOptimizedVarNames");
    if (!getCyc().isOpenCyc()) {
      final CycFormulaSentence sentence = makeCycFormulaSentence(isa, X,
              collection);
      Map result = sentence.getOptimizedVarNames(getCyc());
      assertTrue(result.containsKey(X));
    }
  }

  /**
   * Test of getSimplifiedSentence method, of class CycFormulaSentence.
   */
  @Test
  public void testGetSimplifiedSentence_CycAccess() throws Exception {
    if (!getCyc().isOpenCyc()) {
      System.out.println("getSimplifiedSentence");
      final CycFormulaSentence sentence = makeCycFormulaSentence(isa, X,
              collection);
      assertEquals(sentence, makeConjunction(sentence).getSimplifiedSentence(
              getCyc()));
    }
  }

  /**
   * Test of getSimplifiedSentence method, of class CycFormulaSentence.
   */
  @Test
  public void testGetSimplifiedSentence_CycAccess_ELMt() throws Exception {
    if (!getCyc().isOpenCyc()) {
      System.out.println("getSimplifiedSentence");
      final CycFormulaSentence sentence = makeCycFormulaSentence(isa, X,
              collection);
      assertEquals(sentence, makeConjunction(sentence).getSimplifiedSentence(
              getCyc(), baseKB));
    }
  }

  /**
   * Test of getNonWffAssertExplanation method, of class CycFormulaSentence.
   */
  @Test
  public void testGetNonWffAssertExplanation_CycAccess() {
    System.out.println("getNonWffAssertExplanation");
    try {
      makeCycSentence(getCyc(), genlsMarkDugganBLO).getNonWffAssertExplanation(
              getCyc());
    } catch (Exception ex) {
      fail();
    }
  }

  /**
   * Test of getNonWffAssertExplanation method, of class CycFormulaSentence.
   */
  @Test
  public void testGetNonWffAssertExplanation_CycAccess_ELMt() {
    System.out.println("getNonWffAssertExplanation");
    try {
      makeCycSentence(getCyc(), genlsMarkDugganBLO).getNonWffAssertExplanation(
              getCyc(), baseKB);
    } catch (Exception ex) {
      fail();
    }
  }

  /**
   * Test of getNonWffExplanation method, of class CycFormulaSentence.
   */
  @Test
  public void testGetNonWffExplanation_CycAccess() {
    System.out.println("getNonWffExplanation");
    try {
      makeCycSentence(getCyc(), genlsMarkDugganBLO).getNonWffExplanation(
              getCyc());
    } catch (Exception ex) {
      fail();
    }
  }

  /**
   * Test of getNonWffExplanation method, of class CycFormulaSentence.
   */
  @Test
  public void testGetNonWffExplanation_CycAccess_ELMt() {
    System.out.println("getNonWffExplanation");
    try {
      makeCycSentence(getCyc(), genlsMarkDugganBLO).getNonWffExplanation(
              getCyc(), baseKB);
    } catch (Exception ex) {
      fail();
    }
  }

  /**
   * Test of deepCopy method, of class CycFormulaSentence.
   */
  @Test
  public void testDeepCopy() {
    System.out.println("deepCopy");
    final CycFormulaSentence sentence = makeCycFormulaSentence(isa, X,
            collection);
    assertEquals(sentence.deepCopy(), sentence);
  }

  /**
   * Test of substituteNonDestructive method, of class CycFormulaSentence.
   */
  @Test
  public void testSubstituteNonDestructive() {
    System.out.println("substituteNonDestructive");
    final CycFormulaSentence sentence = makeCycFormulaSentence(isa, X,
            collection);
    assertEquals(makeCycFormulaSentence(isa, thing,
            collection), sentence.substituteNonDestructive(X,
            thing));
    assertEquals(makeCycFormulaSentence(isa, X,
            collection), sentence);
  }

  /**
   * Test of substituteDestructive method, of class CycFormulaSentence.
   */
  @Test
  public void testSubstituteDestructive() {
    System.out.println("substituteDestructive");
    final CycFormulaSentence sentence = makeCycFormulaSentence(isa, X,
            collection);
    sentence.substituteDestructive(X, thing);
    assertEquals(makeCycFormulaSentence(isa, thing,
            collection), sentence);
  }

  /**
   * Test of treeSubstitute method, of class CycFormulaSentence.
   */
  @Test
  public void testTreeSubstitute() throws Exception {
    System.out.println("treeSubstitute");
    CycFort theDog = getCyc().getKnownFortByName("(#$The #$Dog)");
    Map<CycObject, Object> substitutions = new HashMap<CycObject, Object>();

    substitutions.put(theDog, X);

    CycFormulaSentence sentence = getCyc().makeCyclifiedSentence(
            "(#$isa (#$The #$Dog) #$Dog)");

    CycFormulaSentence result = sentence.treeSubstitute(getCyc(), substitutions);
     Assert.assertNotSame(result, sentence); 
  }

  /**
   * Test of clone method, of class CycFormulaSentence.
   */
  //@Test
  public void testClone() {
    System.out.println("clone");
    CycFormulaSentence instance = null;
    Object expResult = null;
    Object result = instance.clone();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of compareTo method, of class CycFormulaSentence.
   */
  //@Test
  public void testCompareTo() {
    System.out.println("compareTo");
    Object o = null;
    CycFormulaSentence instance = null;
    int expResult = 0;
    int result = instance.compareTo(o);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of makeCycSentence method, of class CycFormulaSentence.
   */
  @Test
  public void testMakeCycSentence() throws Exception {
    System.out.println("makeCycSentence");
    final String isaThingThing = "(#$isa #$Thing #$Thing)";
    assertEquals(getCyc().makeCycSentence(isaThingThing),
            makeCycSentence(getCyc(), isaThingThing));
  }

  /**
   * Test of isNegated method, of class CycFormulaSentence.
   */
  //@Test
  public void testIsNegated() {
    System.out.println("isNegated");
    CycFormulaSentence instance = null;
    boolean expResult = false;
    boolean result = instance.isNegated();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of existentiallyBind method, of class CycFormulaSentence.
   */
  //@Test
  public void testExistentiallyBind() {
    System.out.println("existentiallyBind");
    CycVariable var = null;
    CycFormulaSentence instance = null;
    instance.existentiallyBind(var);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of existentiallyUnbind method, of class CycFormulaSentence.
   */
  //@Test
  public void testExistentiallyUnbind() {
    System.out.println("existentiallyUnbind");
    CycVariable var = null;
    CycFormulaSentence instance = null;
    instance.existentiallyUnbind(var);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of splice method, of class CycFormulaSentence.
   */
  @Test
  public void testSplice() throws IOException {
    if (!getCyc().isOpenCyc()) {
      System.out.println("splice");
      final CycFormulaSentence conjunction = CycFormulaSentence.makeConjunction(
              isaThingThing);
      final CycFormulaSentence toInsert = getCyc().makeCycSentence(
              isaMarkDugganBLO);
      final CycFormulaSentence result = conjunction.splice(
              toInsert, ArgPosition.ARG1, getCyc());
      assertTrue(result.treeContains(isaThingThing));
      assertTrue(result.treeContains(toInsert));
    }
  }

  /**
   * Test of getCandidateReplacements method, of class CycFormulaSentence.
   */
  @Test
  public void testGetCandidateReplacements() throws IOException {
    System.out.println("getCandidateReplacements");
    if (!getCyc().isOpenCyc()) {
      final CycConstant universeDataMt = getCyc().getKnownConstantByName(
              "UniverseDataMt");
      final CycFormulaSentence suggestionSentence =
              getCyc().makeCycSentence(
              "(#$suggestionsForPredRelativeToIsaInArg #$weightOnPlanet #$CelestialBody 2 #$CelestialBody 2)");
      final boolean suggestionKnown = getCyc().isQueryTrue(
              suggestionSentence, universeDataMt,
              new DefaultInferenceParameters(
              getCyc()));
      if (!suggestionKnown) {
        getCyc().assertGaf(suggestionSentence, universeDataMt);
      }
      try {
        Collection result = getCyc().makeCycSentence(
                "(#$weightOnPlanet ?ME #$PlanetMars)").getCandidateReplacements(
                ArgPosition.ARG2,
                ELMtConstant.makeELMtConstant(universeDataMt), getCyc());
        assertFalse(result.isEmpty());
        assertTrue(
                result.contains(getCyc().getKnownConstantByName("PlanetVenus")));
      } finally {
        if (!suggestionKnown) {
          getCyc().unassertGaf(suggestionSentence, universeDataMt);
        }
      }
    }
  }

  /**
   * Test of isValidReplacement method, of class CycFormulaSentence.
   */
  @Test
  public void testIsValidReplacement() throws IOException {
    System.out.println("isValidReplacement");
    Object isa = isaThingThing.getArg0();
    assertFalse(isaThingThing.isValidReplacement(ArgPosition.ARG2, isa,
            CycAccess.baseKB, getCyc()));
    assertTrue(isaThingThing.isValidReplacement(ArgPosition.ARG1, isa,
            CycAccess.baseKB, getCyc()));
  }

  /**
   * Test of getEqualsFoldedSentence method, of class CycFormulaSentence.
   */
  //@Test
  public void testGetEqualsFoldedSentence_CycAccess() throws Exception {
    System.out.println("getEqualsFoldedSentence");
    CycAccess access = null;
    CycFormulaSentence instance = null;
    CycSentence expResult = null;
    CycSentence result = instance.getEqualsFoldedSentence(access);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getEqualsFoldedSentence method, of class CycFormulaSentence.
   */
  //@Test
  public void testGetEqualsFoldedSentence_CycAccess_ELMt() throws Exception {
    System.out.println("getEqualsFoldedSentence");
    CycAccess access = null;
    ELMt mt = null;
    CycFormulaSentence instance = null;
    CycSentence expResult = null;
    CycSentence result = instance.getEqualsFoldedSentence(access, mt);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getExpandedSentence method, of class CycFormulaSentence.
   */
  //@Test
  public void testGetExpandedSentence_CycAccess() throws Exception {
    System.out.println("getExpandedSentence");
    CycAccess access = null;
    CycFormulaSentence instance = null;
    CycFormulaSentence expResult = null;
    CycFormulaSentence result = instance.getExpandedSentence(access);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getExpandedSentence method, of class CycFormulaSentence.
   */
  //@Test
  public void testGetExpandedSentence_CycAccess_ELMt() throws Exception {
    System.out.println("getExpandedSentence");
    CycAccess access = null;
    ELMt mt = null;
    CycFormulaSentence instance = null;
    CycFormulaSentence expResult = null;
    CycFormulaSentence result = instance.getExpandedSentence(access, mt);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getCanonicalElSentence method, of class CycFormulaSentence.
   */
  //@Test
  public void testGetCanonicalElSentence_CycAccess() throws Exception {
    System.out.println("getCanonicalElSentence");
    CycAccess access = null;
    CycFormulaSentence instance = null;
    CycFormulaSentence expResult = null;
    CycFormulaSentence result = instance.getCanonicalElSentence(access);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getCanonicalElSentence method, of class CycFormulaSentence.
   */
  //@Test
  public void testGetCanonicalElSentence_CycAccess_Boolean() throws Exception {
    System.out.println("getCanonicalElSentence");
    CycAccess access = null;
    Boolean canonicalizeVars = null;
    CycFormulaSentence instance = null;
    CycFormulaSentence expResult = null;
    CycFormulaSentence result = instance.getCanonicalElSentence(access,
            canonicalizeVars);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getCanonicalElSentence method, of class CycFormulaSentence.
   */
  //@Test
  public void testGetCanonicalElSentence_3args() throws Exception {
    System.out.println("getCanonicalElSentence");
    CycAccess access = null;
    ELMt mt = null;
    Boolean canonicalizeVars = null;
    CycFormulaSentence instance = null;
    CycFormulaSentence expResult = null;
    CycFormulaSentence result = instance.getCanonicalElSentence(access, mt,
            canonicalizeVars);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of hasWffConstraintViolations method, of class CycFormulaSentence.
   */
  //@Test
  public void testHasWffConstraintViolations() {
    System.out.println("hasWffConstraintViolations");
    CycAccess access = null;
    ELMt mt = null;
    CycFormulaSentence instance = null;
    boolean expResult = false;
    boolean result = instance.hasWffConstraintViolations(access, mt);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}
