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

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;
import com.cyc.kb.Assertion;
import com.cyc.kb.BinaryPredicate;
import com.cyc.kb.Context;
import com.cyc.kb.Fact;
import com.cyc.kb.FirstOrderCollection;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBFunction;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.Sentence;
import com.cyc.kb.Variable;
import com.cyc.kb.KBAPIEnums.Direction;
import com.cyc.kb.client.AssertionImpl;
import com.cyc.kb.client.BinaryPredicateImpl;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.FactImpl;
import com.cyc.kb.client.FirstOrderCollectionImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBFunctionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.client.SecondOrderCollectionImpl;
import com.cyc.kb.client.SentenceImpl;
import com.cyc.kb.client.VariableImpl;
import com.cyc.kb.config.KBAPIConfiguration;
import com.cyc.kb.config.KBAPIDefaultContext;
import com.cyc.kb.exception.KBApiException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;



/**
 *
 * @author vijay
 */
public class TestConstants {

  public static final String HOSTNAME = "localhost";
  public static final int PORT = 3600;
  public static CycAccess cyc = null;
  public static ContextImpl baseKB;
  public static Context universalVocabularyMt;
  public static AssertionImpl flyingRule;

  public static void ensureInitialized() throws Exception {

    if (TestConstants.cyc == null) {
      TestConstants.cyc = InteractiveCycAccessProvider.get().getAccess(TestConstants.HOSTNAME, TestConstants.PORT); 
      CycAccessManager.get().setCurrentAccess(TestConstants.cyc);
      
      KBAPIConfiguration.setShouldTranscriptOperations(false);
      // Example usage of KBAPIConfiguration methods
      //KBAPIConfiguration.setCurrentCyclist("(#$UserOfProgramFn #$OWLImporter-Cyc #$ChrisDeaton)");
      //KBAPIConfiguration.setProject(KBIndividual.get("DreamcatcherProject"));
      KBAPIConfiguration.setDefaultContext(new KBAPIDefaultContext(Constants.uvMt(), Constants.inferencePSCMt()));
    }
    universalVocabularyMt = new ImmutableContext("UniversalVocabularyMt");
    baseKB = new ImmutableContext("BaseKB");
    
    setupOEScript();
  }
  
  private static void setupOEScript() throws KBApiException {
    
    // Create a temporary CycKBSubsetCollection to gather the newly created constants
    // Demonstrate the use of quote, quotedIsa
    KBCollection cycSubsetCol = KBCollectionImpl.get("CycKBSubsetCollection");
    FirstOrderCollection tempTestSubset = FirstOrderCollectionImpl.findOrCreate("ApiTestingSubset", cycSubsetCol, Constants.uvMt());
    
    FirstOrderCollection flying1Col = FirstOrderCollectionImpl.findOrCreate("FlyingAnObject-Operate");
    flying1Col.addGeneralization(KBCollectionImpl.get("ControllingSomething"), Constants.uvMt()); 
    // Change this to OperatingSomething, where we are operating a PhysicalDevice
    
    SecondOrderCollectionImpl flyingType = SecondOrderCollectionImpl.findOrCreate("FlyingTypeByTypeOfObjectFlown");
    KBCollection cPlane = KBCollectionImpl.get("CommercialAircraft");
    
    KBFunction flying1Fun = KBFunctionImpl.findOrCreate("FlyingATypeOfObject-Operate-Fn", KBCollectionImpl.get("ReifiableFunction"));
    flying1Fun.addArgGenl(1, KBCollectionImpl.get("PhysicalDevice"), Constants.uvMt());
    flying1Fun.addResultGenl(flying1Col, Constants.uvMt());
    flying1Fun.addResultIsa(flyingType, Constants.uvMt());
    flying1Fun.setArity(1);
    
    FirstOrderCollectionImpl flyingAPlane = flying1Fun.findOrCreateFunctionalTerm(FirstOrderCollectionImpl.class, cPlane);
    
    
    BinaryPredicate flying1Pred1 = BinaryPredicateImpl.findOrCreate("flyingAnObject-Operate", KBCollectionImpl.get("ActorSlot"));
    flying1Pred1.addArgIsa(1, flying1Col, Constants.uvMt());
    // flying1Pred1.addArgIsa(2, KBCollection.get("PhysicalDevice"), Constants.uvMt());
    SentenceImpl sargisa2 = new SentenceImpl (KBPredicateImpl.get("argIsa"), flying1Pred1, 2, KBCollectionImpl.get("PhysicalDevice"));
    AssertionImpl.findOrCreate (sargisa2, Constants.uvMt());
    flying1Pred1.addGeneralization(KBPredicateImpl.get("objectActedOn"), Constants.uvMt());
    // Rule that FlyinATypeOfObject => objectActedOn is a of certain type
    
        
    BinaryPredicateImpl flying1Pred2 = BinaryPredicateImpl.findOrCreate("flyingDoneBySomething-Operate", "ActorSlot");
    flying1Pred2.addArgIsa(1, flying1Col, Constants.uvMt());
    flying1Pred2.addArgIsa(2, KBCollectionImpl.get("IntelligentAgent"), Constants.uvMt());
    KBPredicateImpl.get("performedBy").addSpecialization(flying1Pred2, Constants.uvMt()); 
    
    FirstOrderCollectionImpl flying2Col = FirstOrderCollectionImpl.findOrCreate("Flying-Move");
    FirstOrderCollectionImpl move = FirstOrderCollectionImpl.findOrCreate("MovementThroughAir");
    move.addSpecialization(flying2Col, Constants.uvMt());
    
    BinaryPredicateImpl flying2Pred1 = BinaryPredicateImpl.findOrCreate("flyingDoneBySomething-Move", KBCollectionImpl.get("ActorSlot"), Constants.uvMt());
    flying2Pred1.addArgIsa(1, flying2Col, Constants.uvMt());
    flying2Pred1.addArgIsa(2, KBCollectionImpl.get("SomethingExisting"), Constants.uvMt());
    flying2Pred1.addGeneralization(KBPredicateImpl.get("doneBy"), Constants.uvMt());
        
    // objectActedOn is on self in Flying-Move
    
    
    FirstOrderCollection flying3Col = FirstOrderCollectionImpl.findOrCreate("Flying-Travel");
    FirstOrderCollectionImpl travel = FirstOrderCollectionImpl.get("Travel-TripEvent");
    //travel.addSpecialization(flying3Col, Constants.uvMt());
    // The above can be rewritten using addArg2 as follows:
    travel.addArg2(BinaryPredicateImpl.get("genls"), flying3Col, Constants.uvMt());
    
    BinaryPredicateImpl flying3Pred1 = BinaryPredicateImpl.findOrCreate("flyingDoneBySomeone-Travel", "ActorSlot", "UniversalVocabularyMt");
    // flying3Pred1.addArgIsa(1, flying2Col, Constants.uvMt());
    // The above can be rewritten using addFact as follows:
    // Expect: (ist UniversalVocabularyMt (argIsa flyingDoneBySomeone-Travel 1 Flying-Travel))
    flying3Pred1.addFact(Constants.uvMt(), KBPredicateImpl.get("argIsa"), 1, 1, flying2Col);
    
    flying3Pred1.addArgIsa(2, KBCollectionImpl.get("Person"), Constants.uvMt());
    flying3Pred1.addGeneralization(KBPredicateImpl.get("performedBy"), Constants.uvMt());
    
    // Setup a context hierarchy
    ContextImpl airlineLogMt = ContextImpl.findOrCreate("SomeAirlineLogMt");
    Context airlineEmpMt = ContextImpl.findOrCreate("SomeAirlineEmployeeMt");
    ContextImpl airlineEquipMt = ContextImpl.findOrCreate("SomeAirlineEquipmentMt");
    
    airlineLogMt.addInheritsFrom(airlineEmpMt);
    airlineEquipMt.addExtension(airlineLogMt);
    
    // Not asserting specializations for fromLocation and toLocation
    KBIndividualImpl apilot = KBIndividualImpl.findOrCreate("Pilot-APITest", "AirplanePilot", "SomeAirlineEmployeeMt");
    
    KBIndividualImpl aplane = KBIndividualImpl.findOrCreate("Plane-APITest", cPlane, airlineEquipMt);
    
    //KBIndividual operate = KBIndividual.findOrCreate("FlyingAPlane-APITest", flying1Col, airlineLogMt);
    KBIndividual operate = KBIndividualImpl.findOrCreate("FlyingAPlane-APITest", flyingAPlane, airlineLogMt);
    apilot.addArg1(flying1Pred2, operate, airlineLogMt);
    aplane.addArg1(flying1Pred1, operate, airlineLogMt);
    
    KBIndividualImpl flight = KBIndividualImpl.findOrCreate("FlightXYZ-APITest", flying2Col, airlineLogMt);
    flight.addArg2(flying2Pred1, aplane, airlineLogMt);
    
    SentenceImpl s = new SentenceImpl (KBPredicateImpl.get("fromLocation"), flight, KBIndividualImpl.get("CityOfNewYorkNY"));
    
    FactImpl f1 = new FactImpl(airlineLogMt, s); // From        
    // Adding comment on a GAF
    f1.addComment("A flight from New York", airlineLogMt);
    
    // Adding GAFs using fact
    FactImpl f2 = new FactImpl(airlineLogMt, KBPredicateImpl.get("toLocation"), flight, KBIndividualImpl.get("CityOfSanFranciscoCA")); // To
    f2.addComment("A flight to San Francisco", "SomeAirlineLogMt");
    
    
    KBCollection publicData = KBCollectionImpl.findOrCreate("SomeAirlinePublicData");
            
    flight.addQuotedIsa(KBCollectionImpl.findOrCreate("SomeAirlinePublicData"), airlineLogMt);
    f1.addQuotedIsa(publicData, airlineLogMt);
    f2.addQuotedIsa(publicData, airlineLogMt);
    
    Assertion cause = AssertionImpl.findOrCreate("(causes-EventEvent FlyingAPlane-APITest FlightXYZ-APITest)", "SomeAirlineLogMt");
    
    // artifactFoundInLocation
    // aircraftInAirport
    
    // Transport by Air
    /*
     * (implies 
    (and 
      (isa ?PLANE CommercialAircraft) 
      (flyingDoneBySomething-Move ?FLIGHT ?PLANE) 
      (endingDate ?FLIGHT ?END-DATE) 
      (toLocation ?FLIGHT ?TO)) 
    (holdsIn ?END-DATE 
      (artifactFoundInLocation ?PLANE ?TO)))
      
     */
    
    Variable varp = new VariableImpl("?PLANE");
    Variable varf = new VariableImpl("?FLIGHT");
    Variable varend = new VariableImpl("?END-DATE");
    Variable vart = new VariableImpl("?TO");
    SentenceImpl s1 = new SentenceImpl (KBPredicateImpl.get("isa"), varp, cPlane);
    SentenceImpl s2 = new SentenceImpl (flying2Pred1, varf, varp);
    SentenceImpl s3 = new SentenceImpl (KBPredicateImpl.get("endingDate"), varf, varend);
    SentenceImpl s4 = new SentenceImpl (KBPredicateImpl.get("toLocation"), varf, vart);
    Sentence s5 = new SentenceImpl (KBPredicateImpl.get("artifactFoundInLocation"), varp, vart);
    Sentence s6 = new SentenceImpl (KBPredicateImpl.get("holdsIn"), varend, s5);
    List<SentenceImpl> sandlist = new ArrayList<SentenceImpl>();
    sandlist.add(s1);
    sandlist.add(s2);
    sandlist.add(s3);
    sandlist.add(s4);
    Sentence sand = SentenceImpl.and(sandlist);
    
    
    SentenceImpl rule = new SentenceImpl(KBIndividualImpl.get("implies"), sand, s6);
    flyingRule = AssertionImpl.findOrCreate(rule, Constants.baseKbMt(), null, Direction.FORWARD);
    
    System.out.println("Rule assertion hlid: " + flyingRule.getId());
    		
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm");
    try {
		Date d = sdf.parse("2014 03 15 10:20");
		Fact f = new FactImpl(airlineLogMt, KBPredicateImpl.get("endingDate"), flight, d);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    /*
    <Present Participle><NP>-[Verb Specialization]-Fn
    FlyingAnObject-Operate FlyingAnObject-Operate-Fn AnObject;
    
    FlyingAnObject-Operate;
    
    flyingAnObject-Operate FlyingAnObject-Operate AnObject;
    
    flyingDoneBySomething-Operate FlyingAnObject-Operate Something;
    */
    
    // For intransitive sense, don't add anything
    // Flying;
    
    // Dying - intransitive; Working
    // KillingAnObject - instead of just Killing - monotransitive
    // GivingAnObjectToSomeone - ditransitive
    // GivingAnObject
            
            
  }

  private static class ImmutableContext extends ContextImpl {

    public ImmutableContext(CycObject cycCtx) throws Exception {
      super(cycCtx);
    }

    private ImmutableContext(String cycName) throws Exception {
      super(cycName);
    }

    @Override //Because we want to allow equality with mutable contexts.
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null) {
        return false;
      }
      if (!(obj instanceof Context)) {
        return false;
      }
      ContextImpl other = (ContextImpl) obj;
      if (core == null) {
        if (other.core != null) {
          return false;
        }
      } else if (!core.equals(other.core)) {
        return false;
      }
      return true;
    }
  }
}
