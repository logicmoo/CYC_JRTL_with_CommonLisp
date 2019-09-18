package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;

public class BinaryPredicateTest {

  private static Logger log = null;
  private static KBIndividual i;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(BinaryPredicateTest.class.getName());
    TestConstants.ensureInitialized();
    i = new KBIndividual("VijayRaj009");
    i.instantiates("Person", "UniversalVocabularyMt");
    
    // Create a temporary CycKBSubsetCollection to gather the newly created constants
    // Demonstrate the use of quote, quotedIsa
    KBCollection cycSubsetCol = KBCollection.get("CycKBSubsetCollection");
    FirstOrderCollection tempTestSubset = FirstOrderCollection.findOrCreate("ApiTestingSubset", cycSubsetCol, Constants.uvMt());
    
    FirstOrderCollection flying1Col = FirstOrderCollection.findOrCreate("FlyingAnObject-Control");
    flying1Col.addGeneralization(KBCollection.get("ControllingSomething"), Constants.uvMt());
    
    Function flying1Fun = Function.findOrCreate("FlyingATypeOfObject-Control-Fn", KBCollection.get("ReifiableFunction"));
    flying1Fun.addArgGenl(1, KBCollection.get("SomethingExisting"), Constants.uvMt());
    flying1Fun.addResultGenl(flying1Col, Constants.uvMt());
    flying1Fun.addResultIsa(KBCollection.get("Collection"), Constants.uvMt());
    
    BinaryPredicate flying1Pred1 = BinaryPredicate.findOrCreate("flyingAnObject-Control", KBCollection.get("ActorSlot"));
    flying1Pred1.addArgIsa(1, flying1Col, Constants.uvMt());
    flying1Pred1.addArgIsa(2, KBCollection.get("SomethingExisting"), Constants.uvMt());
    // Rule that FlyinATypeOfObject => objectActedOn is a of certain type
    
        
    BinaryPredicate flying1Pred2 = BinaryPredicate.findOrCreate("flyingDoneBySomething-Control", KBCollection.get("ActorSlot"));
    flying1Pred2.addArgIsa(1, flying1Col, Constants.uvMt());
    flying1Pred2.addArgIsa(2, KBCollection.get("IntelligentAgent"), Constants.uvMt());
    
    /*
    <Present Participle><NP>-[Verb Specialization]-Fn
    FlyingAnObject-Control FlyingAnObject-Control-Fn AnObject;
    
    FlyingAnObject-Control;
    
    flyingAnObject-Control FlyingAnObject-Control AnObject;
    
    flyingDoneBySomething-Control FlyingAnObject-Control Something;
    */
    
    // For intransitive sense, don't add anything
    // Flying;
    
    // Dying - intransitive; Working
    // KillingAnObject - instead of just Killing - monotransitive
    // GivingAnObjectToSomeone - ditransitive
    // GivingAnObject
            
            
    
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testBinaryPredicateString() {
    try {
      BinaryPredicate bp = BinaryPredicate.get("comment");
      i.setObject(bp, "Vijay is a person", Constants.uvMt());
      i.delete();
      java.util.Collection<String> comments = i.getComments("");
      assertEquals(comments.size(), 0);
    } catch (KBApiException ex) {
      assertEquals(ex.getCause().getMessage(), "Expected constant not found #$VijayRaj009");
    } catch (Exception e) {
      e.printStackTrace();
      fail("BinaryPredicate could not be created");
    }

  }
}
