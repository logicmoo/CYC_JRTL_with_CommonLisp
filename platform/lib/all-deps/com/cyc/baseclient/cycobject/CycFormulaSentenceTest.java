package com.cyc.baseclient.cycobject;

import com.cyc.base.CycAccess;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.cycobject.CycSentence;
import com.cyc.base.cycobject.CycObject;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import static com.cyc.baseclient.CommonConstants.*;
import com.cyc.baseclient.CycObjectFactory;
import static com.cyc.baseclient.api.TestUtils.getCyc;
import static com.cyc.baseclient.cycobject.CycFormulaSentence.*;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;

/**
 *
 * @author daves
 */
public class CycFormulaSentenceTest {

  private final String genlsMarkDugganBLO = "(#$genls #$MarkDuggan-SoccerPlayer #$BiologicalLivingObject)";
  private final String isaMarkDugganBLO = "(#$isa #$MarkDuggan-SoccerPlayer #$BiologicalLivingObject)";
  private final CycVariable X = CycObjectFactory.makeCycVariable("X");
  final FormulaSentence isaThingThing = makeCycFormulaSentence(isa, thing,
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
            convertIfPromising(CycArrayList.makeCycList(isa, thing, thing)) instanceof CycFormulaSentence);
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
    final FormulaSentence sentence = makeCycFormulaSentence(isa, X, thing);
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
      final FormulaSentence sentence = makeCycFormulaSentence(isa, X,
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
      final FormulaSentence sentence = makeCycFormulaSentence(isa, X,
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
      final FormulaSentence sentence = makeCycFormulaSentence(isa, X,
              collection);
      assertEquals(sentence, makeConjunction(sentence).getSimplifiedSentence(
              getCyc(), baseKB));
    }
  }

  /**
   * Test of getNonWffAssertExplanation method, of class CycFormulaSentence.
   */
  @Test
  public void testGetNonWffAssertExplanation_CycAccess() throws CycConnectionException {
    System.out.println("getNonWffAssertExplanation");
      makeCycSentence(getCyc(), genlsMarkDugganBLO).getNonWffAssertExplanation(
              getCyc());
  }

  /**
   * Test of getNonWffAssertExplanation method, of class CycFormulaSentence.
   */
  @Test
  public void testGetNonWffAssertExplanation_CycAccess_ELMt() throws CycConnectionException {
    System.out.println("getNonWffAssertExplanation");
      makeCycSentence(getCyc(), genlsMarkDugganBLO).getNonWffAssertExplanation(
              getCyc(), baseKB);
  }

  /**
   * Test of getNonWffExplanation method, of class CycFormulaSentence.
   */
  @Test
  public void testGetNonWffExplanation_CycAccess() throws CycConnectionException {
    System.out.println("getNonWffExplanation");
      makeCycSentence(getCyc(), genlsMarkDugganBLO).getNonWffExplanation(
              getCyc());
  }

  /**
   * Test of getNonWffExplanation method, of class CycFormulaSentence.
   */
  @Test
  public void testGetNonWffExplanation_CycAccess_ELMt() throws CycApiException, CycConnectionException {
    System.out.println("getNonWffExplanation");
      makeCycSentence(getCyc(), genlsMarkDugganBLO).getNonWffExplanation(
              getCyc(), baseKB);
  }

  /**
   * Test of deepCopy method, of class CycFormulaSentence.
   */
  @Test
  public void testDeepCopy() {
    System.out.println("deepCopy");
    final FormulaSentence sentence = makeCycFormulaSentence(isa, X,
            collection);
    assertEquals(sentence.deepCopy(), sentence);
  }

  /**
   * Test of substituteNonDestructive method, of class CycFormulaSentence.
   */
  @Test
  public void testSubstituteNonDestructive() {
    System.out.println("substituteNonDestructive");
    final FormulaSentence sentence = makeCycFormulaSentence(isa, X,
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
    final FormulaSentence sentence = makeCycFormulaSentence(isa, X,
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
    Fort theDog = getCyc().getLookupTool().getKnownFortByName("(#$The #$Dog)");
    Map<CycObject, Object> substitutions = new HashMap<CycObject, Object>();

    substitutions.put(theDog, X);

    FormulaSentence sentence = getCyc().getObjectTool().makeCyclifiedSentence(
            "(#$isa (#$The #$Dog) #$Dog)");

    FormulaSentence result = sentence.treeSubstitute(getCyc(), substitutions);
    assertNotEquals(result, sentence);
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
    assertEquals(getCyc().getObjectTool().makeCycSentence(isaThingThing),
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
  public void testSplice() throws CycConnectionException {
    if (!getCyc().isOpenCyc()) {
      System.out.println("splice");
      final FormulaSentence conjunction = CycFormulaSentence.makeConjunction(
              isaThingThing);
      final FormulaSentence toInsert = getCyc().getObjectTool().makeCycSentence(
              isaMarkDugganBLO);
      final FormulaSentence result = conjunction.splice(
              toInsert, CycArgPosition.ARG1, getCyc());
      assertTrue(result.treeContains(isaThingThing));
      assertTrue(result.treeContains(toInsert));
    }
  }

  /**
   * Test of getCandidateReplacements method, of class CycFormulaSentence.
   */
  @Test
  public void testGetCandidateReplacements() throws CycConnectionException {
    System.out.println("getCandidateReplacements");
    if (!getCyc().isOpenCyc()) {
      final CycConstantI universeDataMt = getCyc().getLookupTool().getKnownConstantByName(
              "UniverseDataMt");
      final FormulaSentence suggestionSentence =
              getCyc().getObjectTool().makeCycSentence(
              "(#$suggestionsForPredRelativeToIsaInArg #$weightOnPlanet #$CelestialBody 2 #$CelestialBody 2)");
      final boolean suggestionKnown = getCyc().getInferenceTool().isQueryTrue(
              suggestionSentence, universeDataMt,
              new DefaultInferenceParameters(
              getCyc()));
      if (!suggestionKnown) {
        getCyc().getAssertTool().assertGaf(suggestionSentence, universeDataMt);
      }
      try {
        Collection result = getCyc().getObjectTool().makeCycSentence(
                "(#$weightOnPlanet ?ME #$PlanetMars)").getCandidateReplacements(
                CycArgPosition.ARG2,
                ELMtConstant.makeELMtConstant(universeDataMt), getCyc());
        assertFalse(result.isEmpty());
        assertTrue(
                result.contains(getCyc().getLookupTool().getKnownConstantByName("PlanetVenus")));
      } finally {
        if (!suggestionKnown) {
          getCyc().getUnassertTool().unassertGaf(suggestionSentence, universeDataMt);
        }
      }
    }
  }

  /**
   * Test of isValidReplacement method, of class CycFormulaSentence.
   */
  @Test
  public void testIsValidReplacement() throws CycConnectionException {
    System.out.println("isValidReplacement");
    Object isa = isaThingThing.getArg0();
    assertFalse(isaThingThing.isValidReplacement(CycArgPosition.ARG2, isa,
            baseKB, getCyc()));
    assertTrue(isaThingThing.isValidReplacement(CycArgPosition.ARG1, isa,
            baseKB, getCyc()));
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
