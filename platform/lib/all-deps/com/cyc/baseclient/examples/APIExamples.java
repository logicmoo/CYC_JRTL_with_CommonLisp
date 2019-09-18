package com.cyc.baseclient.examples;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycConstantI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.cyc.base.CycApiException;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.FormulaSentence;

//// Internal Imports
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycNart;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.DefaultCycObject;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.cycobject.Nart;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.InferenceStatus;
import com.cyc.base.inference.InferenceSuspendReason;
import com.cyc.baseclient.CommonConstants;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.baseclient.inference.DefaultInferenceWorker;
import com.cyc.baseclient.inference.DefaultInferenceWorkerSynch;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.inference.InferenceWorkerListener;
import com.cyc.base.inference.InferenceWorkerSynch;
import com.cyc.baseclient.nl.Paraphraser;
import com.cyc.baseclient.parser.CycLParserUtil;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;

//// External Imports
/** 
 * <P>APIExamples is designed to...
 *
 * <P>Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : May 1, 2009, 11:13:55 AM
 * Author     : tbrussea
 * @version $Id: APIExamples.java 150938 2014-05-02 21:39:12Z nwinant $
 */
public class APIExamples {

  //// Constructors
  /** Creates a new instance of APIExamples. */
  public APIExamples() {
  }

  //// Public Area
  public static final void exampleConnectingToCyc() {
    System.out.println("Starting Cyc connection examples.");
    try {
      System.out.println("Successfully established CYC access " + access);

      // The following code should only be called if you will be modifying the KB
      // and one should typically use a real user and more specific KE purpose.
      // This information is used for accurately maintaining KB content
      // bookkeeping information.
      CycConstantI cycAdministrator = access.getLookupTool().getKnownConstantByName("CycAdministrator");
      CycConstantI generalCycKE = access.getLookupTool().getKnownConstantByName("GeneralCycKE");
      access.setCyclist(cycAdministrator);
      access.setKePurpose(generalCycKE);

      // Do stuff with the connection here.

      // Note: The class CycAccess contains many of the
      // useful public methods for interacting with Cyc.

      // Note: Establishing a connection with Cyc is relatively expensive.
      // If you have a lot of work to do with Cyc over time, make a single
      // CycAccess object and use that everywhere.
    } catch (CycConnectionException ex) {
      ex.printStackTrace();
    } catch (CycApiException cyc_e) {
      // if the api request results in a cyc server error
      // example: cannot launch servicing thread;
      // protocol errors, etc.
      cyc_e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Finished.");
  }

  public static final void exampleTemplate() {
    System.out.println("Starting Cyc connection examples.");
    try {
      CycConstantI cycAdministrator = access.getLookupTool().getKnownConstantByName("CycAdministrator");
      CycConstantI generalCycKE = access.getLookupTool().getKnownConstantByName("GeneralCycKE");
      access.setCyclist(cycAdministrator); // needed to maintain bookeeping information
      access.setKePurpose(generalCycKE); // needed to maintain bookeeping information
    } catch (CycConnectionException ex) {
      ex.printStackTrace();
    } catch (CycApiException cyc_e) {
      cyc_e.printStackTrace();
    }
    System.out.println("Finished.");
  }

  public static final void exampleInferenceParameters() {
    System.out.println("Starting inference parameters examples.");
    try {
      // Note: The available inference engine parameters and descriptions are documented
      // in the KB and can be viewed using the Cyc browser. The inference parameters will
      // be isas of InferenceParameter. The Symbol name to use will be documented
      // as a rewriteOf assertion on the inference parameter.
      // Note: NIL can be passed by using CycObjectFactory.nil
      InferenceParameters inferenceParameters = new DefaultInferenceParameters(access).setMaxTime(10).
          setMaxNumber(100).setMaxTransformationDepth(2);
      inferenceParameters.put(new CycSymbol(":ALLOW-INDETERMINATE-RESULTS?"), Boolean.FALSE);
      ELMt inferencePSC = access.getObjectTool().makeELMt("InferencePSC");
      CycFormulaSentence query = CycLParserUtil.parseCycLSentence("(isa ?X Dog)", true, access);
      InferenceWorkerSynch worker = new DefaultInferenceWorkerSynch(query,
              inferencePSC, inferenceParameters, access, 10000);
      List answers = null;
      try {
        answers = worker.performSynchronousInference(); // Note: workers are 1-shot, don't call more than once
        System.out.println("Got " + answers.size() + " paramaterized inference answers: " + answers);
      } finally {
        // If inference resources are not released, they can accumulate, causing a memory leak.
        worker.releaseInferenceResources(60000);
      }
      worker = new DefaultInferenceWorkerSynch(query,
              inferencePSC, null, access, 10000);
      try {
        answers = worker.performSynchronousInference();
        System.out.println("Got " + answers.size() + " non-paramaterized inference answers: " + answers);
      } finally {
        // If inference resources are not released, they can accumulate, causing a memory leak.
        worker.releaseInferenceResources(60000);
      }
    } catch (CycConnectionException ex) {
      ex.printStackTrace();
    } catch (CycApiException cyc_e) {
      cyc_e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Finished.");
  }

  public static final void exampleSynchronousQueries() {
    System.out.println("Starting Cyc synchronous query examples.");
    try {
      ELMt inferencePSC = access.getObjectTool().makeELMt("InferencePSC");
      CycFormulaSentence query = CycLParserUtil.parseCycLSentence("(isa ?X Dog)", true, access);
      InferenceWorkerSynch worker = new DefaultInferenceWorkerSynch(query,
              inferencePSC, null, access, 10000);
      try {
        List answers = worker.performSynchronousInference(); // Note: workers are 1-shot, don't call more than once
        System.out.println("Got " + answers.size() + " inference answers: " + answers);
      } finally {
        // If inference resources are not released, they can accumulate, causing a memory leak.
        worker.releaseInferenceResources(60000);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Finished.");
  }

  public static final void exampleAsynchronousQueries() {
    System.out.println("Starting Cyc asynchronous query examples.");
    try {
      ELMt inferencePSC = access.getObjectTool().makeELMt("InferencePSC");
      CycFormulaSentence query = CycLParserUtil.parseCycLSentence("(isa ?X Dog)", true, access);
      final InferenceWorker worker = new DefaultInferenceWorker(query,
              inferencePSC, null, access, 10000);
      worker.addInferenceListener(new InferenceWorkerListener() {

        public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
          System.out.println("GOT CREATED EVENT\n" + inferenceWorker);
        }

        public void notifyInferenceStatusChanged(InferenceStatus oldStatus, InferenceStatus newStatus,
                InferenceSuspendReason suspendReason, InferenceWorker inferenceWorker) {
          System.out.println("GOT STATUS CHANGED EVENT\n" + inferenceWorker);
        }

        public void notifyInferenceAnswersAvailable(InferenceWorker inferenceWorker, List newAnswers) {
          System.out.println("GOT NEW ANSWERS EVENT\n" + inferenceWorker);
        }

        public void notifyInferenceTerminated(InferenceWorker inferenceWorker, Exception e) {
          System.out.println("GOT TERMINATED EVENT\n" + inferenceWorker);
          if (e != null) {
            e.printStackTrace();
          }
        }
      });
      try {
        worker.start();
        // Warning: the following is here so that the query has time to run, you wouldn't want this in real code
        Thread.sleep(10000);
      } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
      } finally {
        // If inference resources are not released, they can accumulate, causing a memory leak.
        worker.releaseInferenceResources(60000);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Finished.");
  }

  public static final void exampleAssertionManipulations() {
    System.out.println("Starting assertion examples.");
    try {
      CycConstantI cycAdministrator = access.getLookupTool().getKnownConstantByName("CycAdministrator");
      CycConstantI generalCycKE = access.getLookupTool().getKnownConstantByName("GeneralCycKE");
      access.setCyclist(cycAdministrator); // needed to maintain bookeeping information
      access.setKePurpose(generalCycKE); // needed to maintain bookeeping information

      // Note: the CycAccess class has many assertion helper methods
      // that begin with "assert" like assertIsa, assertIsas, assertGenls,
      // assertComment, etc. that are worth investigating

      // Creating a formula (local) for asserting
      final FormulaSentence gaf = CycFormulaSentence.makeCycFormulaSentence(
              access.getLookupTool().getKnownConstantByName("likesAsFriend"),
              access.getLookupTool().getKnownConstantByName("BillClinton"),
              access.getLookupTool().getKnownConstantByName("HillaryClinton"));
      // alternatvely, one could use the CycLParser
      CycFormulaSentence gaf2 = CycLParserUtil.parseCycLSentence("(likesAsFriend BillClinton HillaryClinton)", true, access);

      assert gaf.equals(gaf2) : "Good grief! List parsing appears to be broken.";

      // making an assertion to the KB
      ELMt peopleDataMt = access.getObjectTool().makeELMt(access.getLookupTool().getKnownConstantByName("PeopleDataMt"));
      access.getAssertTool().assertGaf(gaf, peopleDataMt);

      // verifying that a forumla is asserted
      boolean isValid = access.getInspectorTool().isGafValidAssertion(gaf, peopleDataMt);
      // Note: the previous call is very new and may not be in all distrubutions yet
      assert isValid : "Good grief! Our assertion didn't make it into the KB.";

      // removing an assertion from the KB
      access.getUnassertTool().unassertGaf(gaf, peopleDataMt);

      isValid = access.getInspectorTool().isGafValidAssertion(gaf, peopleDataMt);
      assert !isValid : "Good grief! Our assertion didn't get removed from the KB.";

      // Generating NL for an assertion
      Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);

      String nl = p.paraphrase(gaf).getString();
      System.out.println("Got generation for assertion, " + gaf + "\n" + nl);

    } catch (CycConnectionException ex) {
      ex.printStackTrace();
    } catch (CycApiException cyc_e) {
      cyc_e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Finished.");
  }

  public static final void exampleNartManipulations() {
    System.out.println("Starting Cyc NART examples.");
    try {
      Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.KBOBJECT);

      CycConstantI cycAdministrator = access.getLookupTool().getKnownConstantByName("CycAdministrator");
      CycConstantI generalCycKE = access.getLookupTool().getKnownConstantByName("GeneralCycKE");
      access.setCyclist(cycAdministrator); // needed to maintain bookeeping information
      access.setKePurpose(generalCycKE); // needed to maintain bookeeping information

      // find nart by external id (preferred lookup mechanism)
      CycNart apple = (CycNart) DefaultCycObject.fromCompactExternalId("Mx8Ngh4rvVipdpwpEbGdrcN5Y29ycB4rvVjBnZwpEbGdrcN5Y29ycA",
              access);

      // find nart by name (dispreferred because names in the KB can change)
      Nart apple2 = access.getLookupTool().getCycNartFromCons((CycArrayList) CycLParserUtil.parseCycLDenotationalTerm("(FruitFn AppleTree)", true, access));

      assert apple.equals(apple2) : "Lookup failed to produce equal results.";

      // getting the external id for a NART
      String appleEID = DefaultCycObject.toCompactExternalId(apple, access);

      // creating a nart
      // There is no direct way of creating NARTs, they are an implementation detail
      // of the inference engine. However, if you make an assertion using arguments
      // to a reifiable function that the inference engine hasn't seen before, then it will be create
      // automatically.
      CycNart elmFruit = new CycNart(access.getLookupTool().getKnownConstantByName("FruitFn"),
              access.getLookupTool().getKnownConstantByName("ElmTree"));
      // NOTE: the previous call only makes the NART locally and not in the KB

      // Asserting the isa and genls relations
      // every new term should have at least 1 isa assertion made on it
      access.getAssertTool().assertIsa(elmFruit, CommonConstants.collection, CommonConstants.baseKB);
      // Note: the previous line causes the new NART to be created in the KB!

      // Every new collection should have at least 1 genls assertion made on it,
      // however, in this case, the inference engine has made it for you since
      // any new terms involving FruitFn's must be types of fruits.
      // access.assertGenls(elmFruit, access.getKnownConstantByName("Fruit"), CycClient.baseKB);

      // verify genls relation
      assert access.getInspectorTool().isSpecOf(elmFruit, access.getLookupTool().getKnownConstantByName("Fruit"), CommonConstants.baseKB) : "Good grief! Elm fruit isn't known to be a type of fruit.";

      // find everything that is an apple
      System.out.println("Got instances of Apple: " + access.getLookupTool().getAllInstances(apple, CommonConstants.baseKB));

      // find everything that a apple is a type of
      System.out.println("Got generalizations of Apple: " + access.getLookupTool().getAllGenls(apple, CommonConstants.baseKB));

      // find everything that is a type of apple
      System.out.println("Got specializations of Apple: " + access.getLookupTool().getAllSpecs(apple, CommonConstants.baseKB));

      // generating NL
      System.out.println("The concept " + apple.cyclify()
              + " can be referred to in English as '" + p.paraphrase(apple).getString() + "'.");

      // Killing a NART -- removing a NART and all assertions involving that NART from the KB
      // Warning: you can potentially do serious harm to the KB if you remove critical information
      access.getUnassertTool().kill(elmFruit);


    } catch (CycConnectionException ex) {
      ex.printStackTrace();
    } catch (CycApiException cyc_e) {
      cyc_e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Finished.");
  }

  public static final void exampleContantsManipulations() {
    System.out.println("Starting Cyc constant manipulation examples.");
    try {
      Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);

      CycConstantI cycAdministrator = access.getLookupTool().getKnownConstantByName("CycAdministrator");
      CycConstantI generalCycKE = access.getLookupTool().getKnownConstantByName("GeneralCycKE");
      access.setCyclist(cycAdministrator); // needed to maintain bookeeping information
      access.setKePurpose(generalCycKE); // needed to maintain bookeeping information

      // obtaining a constant from its external ID (preferred mechanism for lookup)
      CycConstant dog = (CycConstant) DefaultCycObject.fromCompactExternalId("Mx4rvVjaoJwpEbGdrcN5Y29ycA", access);

      // obtaining an external id from a CycObject
      String externalId = DefaultCycObject.toCompactExternalId(dog, access);

      // obtaining a constant from its name
      // Note: not preferred, because constant names can change in the KB
      // which would require all the code references to be modified to
      // maintain correct behavior
      CycConstantI dog2 = access.getLookupTool().getKnownConstantByName("Dog");

      // obtain comments for a CycConstant
      String comment = access.getLookupTool().getComment(dog);
      System.out.println("Got comments for constant Dog:\n" + comment);

      // creating a constant
      CycConstantI newTypeOfDog = access.getLookupTool().findOrCreate("NewTypeOfDog");

      // asserting the isa and genls relations
      // every new term should have at least 1 isa assertion made on it
      access.getAssertTool().assertIsa(newTypeOfDog, CommonConstants.collection, CommonConstants.baseKB);
      // every new collection should have at least 1 genls assertion made on it
      access.getAssertTool().assertGenls(newTypeOfDog, dog, CommonConstants.baseKB);

      // verify genls relation
      assert access.getInspectorTool().isSpecOf(newTypeOfDog, dog, CommonConstants.baseKB) : "Good grief! Our new type of dog isn't known to be a type of dog.";

      // find everything that is a dog
      System.out.println("Got instances of Dog: " + access.getLookupTool().getAllInstances(dog, CommonConstants.baseKB));

      // find everything that a dog is a type of
      System.out.println("Got generalizations of Dog: " + access.getLookupTool().getAllGenls(dog, CommonConstants.baseKB));

      // find everything that is a type of dog
      System.out.println("Got specializations of Dog: " + access.getLookupTool().getAllSpecs(dog, CommonConstants.baseKB));

      // generating NL
      String dogNl = p.paraphrase(dog).getString();
      System.out.println("The concept " + dog.cyclify()
              + " can be referred to in English as '" + dogNl + "'.");

      // Killing a constant -- removing a constant and all assertions involving that constant
      // Warning: you can potentially do serious harm to the KB if you remove critical information
      access.getUnassertTool().kill(newTypeOfDog);

    } catch (CycConnectionException ex) {
      ex.printStackTrace();
    } catch (CycApiException cyc_e) {
      cyc_e.printStackTrace();
    }
    System.out.println("Finished.");
  }

  public static final void helloWorldExample() {
    try {
      Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);

      CycConstant planetInSolarSystem = (CycConstant) DefaultCycObject.fromCompactExternalId("Mx4rWIie-jN6EduAAADggVbxzQ", access);
      CycList planets = access.getLookupTool().getAllInstances(planetInSolarSystem);
      for (Object planet : planets) {
        System.out.println("Hello '"
                + p.paraphrase((CycObject) planet).getString() + "'.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static final void exampleGenericLispAPI() {
    System.out.println("Starting Cyc connection examples.");
    try {
      System.out.println("Successfully established CYC access " + access);
      CycConstant cycAdministrator = new CycConstant("CycAdministrator", new CycGuid("c0bf7a98-9c29-11b1-9dad-c379636f7270"));
      CycConstant generalCycKE = new CycConstant("GeneralCycKE", new CycGuid("bd8345f2-9c29-11b1-9dad-c379636f7270"));
      // see:
      // see:
      access.setCyclist(cycAdministrator); // needed to maintain bookeeping information
      access.setKePurpose(generalCycKE); // needed to maintain bookeeping information
      Object result = access.converse().converseObject("(+ 3 4)");
      Object result2 = access.converse().converseObject("(new-cyc-query '(#$isa ?X #$Dog) #$EverythingPSC)");
    } catch (CycConnectionException ex) {
      ex.printStackTrace();
    } catch (CycApiException cyc_e) {
      cyc_e.printStackTrace();
    }
    System.out.println("Finished.");
  }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private static CycAccess access = null;

  //// Main
  public static void main(String[] args) {
    try {
      access = InteractiveCycAccessProvider.get().getAccess();
      helloWorldExample();
      exampleConnectingToCyc();
      exampleContantsManipulations();
      exampleNartManipulations();
      exampleAssertionManipulations();
      exampleSynchronousQueries();
      exampleAsynchronousQueries();
      exampleInferenceParameters();
      exampleGenericLispAPI();
    } catch (CycApiException ex) {
      Logger.getLogger(APIExamples.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      if (access != null) {
        access.close();
      }
    }
    System.exit(0);
  }
}
