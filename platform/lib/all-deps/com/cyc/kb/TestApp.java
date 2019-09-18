package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestApp {

  private static Logger log = null;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(TestApp.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testConnection() throws Exception {


    KBCollection d = KBCollection.get("Dog");
    //log.info("d: " + d.toDetailedString());
    //log.info("d: " + d.toDetailedString());
    KBCollection f = KBCollection.get("(FruitFn AppleTree)");
    //log.info("f: " + f.toDetailedString());
    Context m = Context.get("BiologyMt");
    //log.info("m: " + f.toDetailedString());


    // Vijay: 2013-05-22: This is not relevant anymore.
    // QueryAPI should be used for querying.
    /*
    String queryStr =
            "(#$and  "
            + "	  (#$isa ?PRED #$QuasiTemporalSubSituationTypesPredicate)  "
            + "	  (#$isa ?PRED #$TernaryPredicate)  "
            + "	  (#$assertedSentence  "
            + "	    (?PRED  "
            + "	       #$AerialBombing ?SUB-TYPE1 ?SUB-TYPE2))) ";

    CycAccess cyc = CycAccess.getCurrent();
    final CycFormulaSentence sentence = cyc.makeCycSentence(queryStr);
    InferenceResultSet result = null;
    try {
      result = cyc.executeQuery(sentence, CycAccess.universalVocabularyMt,
              new DefaultInferenceParameters(cyc));

      while (!result.isAfterLast()) {
        Predicate pred = new Predicate(result.getCycObject("?PRED"));
        System.out.println("All edges: " + pred);
        System.out.println(
                "All nodes: " + new KBCollection(result.getCycObject("?SUB-TYPE1")).addGeneralization());
      }
    } finally {
      if (result != null) {
        result.close();
      }
    }
    */
    
    
    KBCollection w = KBCollection.get("DreamcatcherWell");
    System.out.println("All wells: " + w.<KBIndividual>getValues("isa", 2, 1, "OrionAssetMt"));
    System.out.println("All wells: " + w.<KBIndividual>getInstances("OrionAssetMt"));

    // LOG.info("values of d: " + d.getValues("ownerOfType"));
    // LOG.info("values of m: " +
    // m.getValues("genlMt").get(2).getValues("genlMt"));


  }

  /*
   * @Test public void testHelloWorlds() { try { cyc =
   * CycAccessFactory.getCycAccess("localhost", 3600); KBCollection p = new
   * KBCollection ("Planet"); Predicate p1 = new Predicate ("isa"); Context m1 =
   * new Context ("SimpleAstronomyDataVocabularyMt");
   *
   * List<Individual> d = p.<Individual>getValues(p1, 2, 1, m1,
   * KBIndividual.class).get(0).<Individual>getValues(p1, 1, 2, m1,
   * KBIndividual.class); //d.get(0);
   *
   * LOG.fine("Instance of planets are: " + d.toString());
   * //log.fine("Instance of planets are: " + new KBCollection
   * ("Planet").getInstances("SimpleAstronomyDataVocabularyMt")); } catch
   * (Exception e) { e.printStackTrace(); }
   *
   * }
   */
  @Test
  public void testNewHelloWorlds() throws KBApiException {
      KBCollection p = KBCollection.get("Planet");

      Collection<KBIndividual> ps1 = p.<KBIndividual>getInstances("SimpleAstronomyDataVocabularyMt");
      log.fine("Instance of planets are: " + ps1.toString());

      Collection<KBIndividual> ps2 = p.<KBIndividual>getValues(
              "isa", 2, 1, "SimpleAstronomyDataVocabularyMt");
      log.fine("Instance of planets are: " + ps2.toString());

      KBIndividual aPlanet = (KBIndividual)p.<KBIndividual>getValues("isa", 2, 1, 
              "SimpleAstronomyDataVocabularyMt").toArray()[0]; 
      Collection<KBCollection> d = aPlanet.<KBCollection>getValues("isa",
              1, 2, "SimpleAstronomyDataVocabularyMt");
      log.fine("Instance of planets are: " + d.toString());

      Collection<String> str = p.<String>getValues("comment",
              1, 2, "UniversalVocabularyMt");
      log.fine("Comment of planets are: " + str.toArray());
      log.fine("Comment of planets are (2): " + p.getComments(
              "UniversalVocabularyMt"));

      KBIndividual pluto = KBIndividual.get("Mx4rvVjS-pwpEbGdrcN5Y29ycA");
      Collection<Double> flt = pluto.<Double>getValues("orbitalEccentricity", 1, 2, 
              "UniverseDataMt");
      log.fine("Orbital eccentricity of planets are: " + flt);

      //@todo get rid of this, or re-do with less project-specific content.
      KBIndividual i = KBIndividual.get("Mx4raK803tcqREq_Vj_lenejOQ");
      Collection<Date> date = i.<Date>getValues("bhpValueAtDate", 1,
              2, "DTSTestDataMt");
      //log.fine("well dates are: " + date.get(0));

      //log.fine("Instance of planets are: " + new KBCollection ("Planet").getInstances("SimpleAstronomyDataVocabularyMt"));

  }
}
