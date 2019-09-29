package com.cyc.kb;

import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.Predicate;
import com.cyc.kb.Context;
import com.cyc.kb.Constants;
import com.cyc.kb.Fact;
import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycObject;
import org.opencyc.inference.params.DefaultInferenceParameters;

public class FactTest {

    private static Logger log = null;

    @BeforeClass
    public static void setUp() throws Exception {
        log = Logger.getLogger(FactTest.class.getName());
        TestConstants.ensureInitialized();
    }

    @AfterClass
    public static void tearDown() throws Exception {
    }

    @Test
    public void testFactStringString() throws KBApiException {


            //Fact a = new Fact("'( #$genls  #$Dog  #$CanisGenus )", "#$UniversalVocabularyMt" );
            Fact a = new Fact("#$UniversalVocabularyMt", "(#$superTaxons #$Dog #$CanisGenus)");
            assertEquals("(ist UniversalVocabularyMt (superTaxons Dog CanisGenus))", a.toString());

            assertEquals(a.<Predicate>getArgument(0).toString(), "superTaxons");
            assertEquals(a.<KBCollection>getArgument(1).toString(), "Dog");
            assertEquals(a.<KBCollection>getArgument(2).toString(), "CanisGenus");
            
            KBIndividual v = KBIndividual.findOrCreate("VijayRaj001");

            Fact f = new Fact("UniversalVocabularyMt", "(isa VijayRaj001 MaleHuman)");
            assertEquals("(ist UniversalVocabularyMt (isa VijayRaj001 MaleHuman))", f.toString());

        
    }

    @Test
    public void testFactContextObject() throws KBApiException {

        Context uctx = Constants.uvMt();

        Context ctx = Context.get("(UserAnalysisContextOfThingFn JonC (AVWorkWithIDFn 701537))");
        Fact anA = new Fact("(AVAnalysisContextFn (AVWorkWithIDFn 701537))", "(visuallyDepictsTypes-Refined (AVWorkWithIDFn 701537) Food-ReadyToEat)");

        Fact anAonA = new Fact("(UserAnalysisContextOfThingFn JonC (AVWorkWithIDFn 701537))", "(#$assertionConfidence  (#$ist (#$AVAnalysisContextFn (#$AVWorkWithIDFn 701537)) (#$visuallyDepictsTypes-Refined (#$AVWorkWithIDFn 701537) #$Food-ReadyToEat))  0.5 )");

        Predicate p = Predicate.get("assertionConfidence");
        Fact a = new Fact(uctx, p, anA, 0.89);
        assertEquals("(ist UniversalVocabularyMt (assertionConfidence (() ((#$visuallyDepictsTypes-Refined (#$AVWorkWithIDFn 701537) #$Food-ReadyToEat))) 0.89))", a.toString());

        assertEquals(a.context().toString(), "UniversalVocabularyMt");

    }

    @Test
    public void testConstructAssertion() throws KBApiException {
        //(genls Dog CanisGenus)
            Predicate p = Predicate.get("genls");
            KBCollection c = KBCollection.get("Dog");
            KBCollection genl = KBCollection.get("CanisGenus");
            List<Object> arguments = new ArrayList<Object>();
            arguments.add(c);
            arguments.add(genl);

            Context ctx = Constants.uvMt();
            Fact a = new Fact(ctx, p, arguments.toArray());
            String factString = a.toString();

            log.fine("Fact string: " + factString);

            // With date
            // 

            Context octx = Context.get("OrionAssetMt");
            Predicate op = Predicate.get("wellHasProductionStartDate");
            KBIndividual iwell = KBIndividual.get("Well-106P1-Orion");
            Date d = new Date(2012, 03, 19);
            log.fine("Check the date: " + d.toString());

            Fact wellA = new Fact(octx, op, iwell, d);
            log.fine("Fact to start the well today: " + wellA.toString());

       
    }

    @Test
    public void testDelete() throws KBApiException {

            Fact a = new Fact("#$UniversalVocabularyMt", "(#$superTaxons #$Dog #$CanisGenus)");
            assertEquals("(ist UniversalVocabularyMt (superTaxons Dog CanisGenus))", a.toString());
            a.delete();

    }
  
  @Test
  public void testAddList() throws KBApiException {
    KBIndividual i = new KBIndividual("(#$PhysicalSchemaForKSFn   #$DreamStore-EVIDENCE-DefinedReport   \"DreamStore-EVIDENCE-DefinedReport\")");
    List<String> ls = new ArrayList<String>();
    ls.add("INDEX1");
    ls.add("INDEX2");
    ls.add("BHP_INCREASE");
    i.addFact(Context.get("ReportGeneratorEntitiesMt"), Predicate.get("schemaFieldNameList"), 1, ls);
  }
  
  @Test
  public void testAddSet() throws KBApiException {
    KBIndividual i = KBIndividual.get("TheSet");
    Set<KBObject> ls = new HashSet<KBObject>();
    ls.add(KBIndividual.get("BillClinton"));
    ls.add(KBIndividual.get("BarackObama"));
    i.addFact(Context.get("UniversalVocabularyMt"), Predicate.get("exampleNATs"), 1, ls);
  }
  
  @Test 
  public void testAddAndGetSentence() throws KBApiException {
    
    KBIndividual i = KBIndividual.findOrCreate("DreamStore-EVIDENCE-LS");
    i.isInstanceOf(KBCollection.get("LogicalSchema"));
    Predicate p = Predicate.get("meaningSentenceOfSchema");
    List<Object> l = new ArrayList<Object>();
    l.add(Predicate.get("isa"));
    l.add(i);
    l.add(p);
    Sentence s = new Sentence(l.toArray());
    
    i.addFact(Context.get("UniversalVocabularyMt"), p, 1, s);
    
    Collection<Fact> lfs = i.getFacts(Context.get("UniversalVocabularyMt"), p, 1);
    KBIndividual iback = lfs.iterator().next().<KBIndividual>getArgument(1);
    Sentence a = lfs.iterator().next().<Sentence>getArgument(2);
    System.out.println("Got a sentence: " + a);
  }
  
}

