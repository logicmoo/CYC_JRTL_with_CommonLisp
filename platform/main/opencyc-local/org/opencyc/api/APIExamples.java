package org.opencyc.api;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.cycobject.Guid;
import java.util.Iterator;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.DefaultCycObject;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycObject;
import org.opencyc.inference.InferenceSuspendReason;
import org.opencyc.inference.InferenceStatus;
import org.opencyc.inference.InferenceWorker;
import org.opencyc.inference.InferenceWorkerListener;
import org.opencyc.inference.DefaultInferenceWorker;
import java.util.List;
import org.opencyc.inference.InferenceWorkerSynch;
import org.opencyc.cycobject.CycFormulaSentence;
import org.opencyc.cycobject.ELMt;
import org.opencyc.inference.params.InferenceParameters;
import org.opencyc.inference.DefaultInferenceWorkerSynch;
import org.opencyc.parser.CycLParserUtil;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.inference.params.DefaultInferenceParameters;
import org.opencyc.cycobject.CycConstant;
import java.io.IOException;
import java.net.UnknownHostException;
import org.opencyc.cycobject.CycFort;

public class APIExamples
{
    private static CycAccess access;
    
    public static final void exampleConnectingToCyc() {
        System.out.println("Starting Cyc connection examples.");
        try {
            System.out.println("Successfully established CYC access " + APIExamples.access);
            final CycConstant cycAdministrator = APIExamples.access.getKnownConstantByName("CycAdministrator");
            final CycConstant generalCycKE = APIExamples.access.getKnownConstantByName("GeneralCycKE");
            APIExamples.access.setCyclist((CycFort)cycAdministrator);
            APIExamples.access.setKePurpose((CycFort)generalCycKE);
        }
        catch (UnknownHostException nohost) {
            nohost.printStackTrace();
        }
        catch (IOException io) {
            io.printStackTrace();
        }
        catch (CycApiException cyc_e) {
            cyc_e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static final void exampleTemplate() {
        System.out.println("Starting Cyc connection examples.");
        try {
            final CycConstant cycAdministrator = APIExamples.access.getKnownConstantByName("CycAdministrator");
            final CycConstant generalCycKE = APIExamples.access.getKnownConstantByName("GeneralCycKE");
            APIExamples.access.setCyclist((CycFort)cycAdministrator);
            APIExamples.access.setKePurpose((CycFort)generalCycKE);
        }
        catch (UnknownHostException nohost) {
            nohost.printStackTrace();
        }
        catch (IOException io) {
            io.printStackTrace();
        }
        catch (CycApiException cyc_e) {
            cyc_e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static final void exampleInferenceParameters() {
        System.out.println("Starting inference parameters examples.");
        try {
            final InferenceParameters inferenceParameters = new DefaultInferenceParameters(APIExamples.access).setMaxTime(10).setMaxNumber(100).setMaxTransformationDepth(2);
            inferenceParameters.put(new CycSymbol(":ALLOW-INDETERMINATE-RESULTS?"), (Object)Boolean.FALSE);
            final ELMt inferencePSC = APIExamples.access.makeELMt("InferencePSC");
            final CycFormulaSentence query = CycLParserUtil.parseCycLSentence("(isa ?X Dog)", true, APIExamples.access);
            InferenceWorkerSynch worker = (InferenceWorkerSynch)new DefaultInferenceWorkerSynch(query, inferencePSC, inferenceParameters, APIExamples.access, 10000L);
            List answers = null;
            try {
                answers = worker.performSynchronousInference();
                System.out.println("Got " + answers.size() + " paramaterized inference answers: " + answers);
            }
            finally {
                worker.releaseInferenceResources(60000L);
            }
            worker = (InferenceWorkerSynch)new DefaultInferenceWorkerSynch(query, inferencePSC, (InferenceParameters)null, APIExamples.access, 10000L);
            try {
                answers = worker.performSynchronousInference();
                System.out.println("Got " + answers.size() + " non-paramaterized inference answers: " + answers);
            }
            finally {
                worker.releaseInferenceResources(60000L);
            }
        }
        catch (UnknownHostException nohost) {
            nohost.printStackTrace();
        }
        catch (IOException io) {
            io.printStackTrace();
        }
        catch (CycApiException cyc_e) {
            cyc_e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static final void exampleSynchronousQueries() {
        System.out.println("Starting Cyc synchronous query examples.");
        try {
            final ELMt inferencePSC = APIExamples.access.makeELMt("InferencePSC");
            final CycFormulaSentence query = CycLParserUtil.parseCycLSentence("(isa ?X Dog)", true, APIExamples.access);
            final InferenceWorkerSynch worker = (InferenceWorkerSynch)new DefaultInferenceWorkerSynch(query, inferencePSC, (InferenceParameters)null, APIExamples.access, 10000L);
            try {
                final List answers = worker.performSynchronousInference();
                System.out.println("Got " + answers.size() + " inference answers: " + answers);
            }
            finally {
                worker.releaseInferenceResources(60000L);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static final void exampleAsynchronousQueries() {
        System.out.println("Starting Cyc asynchronous query examples.");
        try {
            final ELMt inferencePSC = APIExamples.access.makeELMt("InferencePSC");
            final CycFormulaSentence query = CycLParserUtil.parseCycLSentence("(isa ?X Dog)", true, APIExamples.access);
            final InferenceWorker worker = (InferenceWorker)new DefaultInferenceWorker(query, inferencePSC, (InferenceParameters)null, APIExamples.access, 10000L);
            worker.addInferenceListener((InferenceWorkerListener)new InferenceWorkerListener() {
                public void notifyInferenceCreated(final InferenceWorker inferenceWorker) {
                    System.out.println("GOT CREATED EVENT\n" + inferenceWorker);
                }
                
                public void notifyInferenceStatusChanged(final InferenceStatus oldStatus, final InferenceStatus newStatus, final InferenceSuspendReason suspendReason, final InferenceWorker inferenceWorker) {
                    System.out.println("GOT STATUS CHANGED EVENT\n" + inferenceWorker);
                }
                
                public void notifyInferenceAnswersAvailable(final InferenceWorker inferenceWorker, final List newAnswers) {
                    System.out.println("GOT NEW ANSWERS EVENT\n" + inferenceWorker);
                }
                
                public void notifyInferenceTerminated(final InferenceWorker inferenceWorker, final Exception e) {
                    System.out.println("GOT TERMINATED EVENT\n" + inferenceWorker);
                    if (e != null) {
                        e.printStackTrace();
                    }
                }
            });
            try {
                worker.start();
                Thread.sleep(10000L);
            }
            catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            finally {
                worker.releaseInferenceResources(60000L);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static final void exampleAssertionManipulations() {
        System.out.println("Starting assertion examples.");
        try {
            final CycConstant cycAdministrator = APIExamples.access.getKnownConstantByName("CycAdministrator");
            final CycConstant generalCycKE = APIExamples.access.getKnownConstantByName("GeneralCycKE");
            APIExamples.access.setCyclist((CycFort)cycAdministrator);
            APIExamples.access.setKePurpose((CycFort)generalCycKE);
            final CycFormulaSentence gaf = CycFormulaSentence.makeCycFormulaSentence(new Object[] { APIExamples.access.getKnownConstantByName("likesAsFriend"), APIExamples.access.getKnownConstantByName("BillClinton"), APIExamples.access.getKnownConstantByName("HillaryClinton") });
            final CycFormulaSentence gaf2 = CycLParserUtil.parseCycLSentence("(likesAsFriend BillClinton HillaryClinton)", true, APIExamples.access);
            assert gaf.equals((Object)gaf2) : "Good grief! List parsing appears to be broken.";
            final ELMt peopleDataMt = APIExamples.access.makeELMt((CycFort)APIExamples.access.getKnownConstantByName("PeopleDataMt"));
            APIExamples.access.assertGaf(gaf, (CycObject)peopleDataMt);
            boolean isValid = APIExamples.access.isGafValidAssertion(gaf, peopleDataMt);
            assert isValid : "Good grief! Our assertion didn't make it into the KB.";
            APIExamples.access.unassertGaf(gaf, (CycObject)peopleDataMt);
            isValid = APIExamples.access.isGafValidAssertion(gaf, peopleDataMt);
            assert !isValid : "Good grief! Our assertion didn't get removed from the KB.";
            final String nl = APIExamples.access.getImpreciseParaphrase(gaf);
            System.out.println("Got generation for assertion, " + gaf + "\n" + nl);
        }
        catch (UnknownHostException nohost) {
            nohost.printStackTrace();
        }
        catch (IOException io) {
            io.printStackTrace();
        }
        catch (CycApiException cyc_e) {
            cyc_e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static final void exampleNartManipulations() {
        System.out.println("Starting Cyc NART examples.");
        try {
            final CycConstant cycAdministrator = APIExamples.access.getKnownConstantByName("CycAdministrator");
            final CycConstant generalCycKE = APIExamples.access.getKnownConstantByName("GeneralCycKE");
            APIExamples.access.setCyclist((CycFort)cycAdministrator);
            APIExamples.access.setKePurpose((CycFort)generalCycKE);
            final CycNart apple = (CycNart)DefaultCycObject.fromCompactExternalId("Mx8Ngh4rvVipdpwpEbGdrcN5Y29ycB4rvVjBnZwpEbGdrcN5Y29ycA", APIExamples.access);
            final CycNart apple2 = APIExamples.access.getCycNartFromCons((CycList)CycLParserUtil.parseCycLDenotationalTerm("(FruitFn AppleTree)", true, APIExamples.access));
            assert apple.equals((Object)apple2) : "Lookup failed to produce equal results.";
            final String appleEID = DefaultCycObject.toCompactExternalId((Object)apple, APIExamples.access);
            final CycNart elmFruit = new CycNart((CycFort)APIExamples.access.getKnownConstantByName("FruitFn"), new Object[] { APIExamples.access.getKnownConstantByName("ElmTree") });
            APIExamples.access.assertIsa((CycFort)elmFruit, (CycFort)CycAccess.collection, (CycObject)CycAccess.baseKB);
            assert APIExamples.access.isSpecOf((CycObject)elmFruit, (CycObject)APIExamples.access.getKnownConstantByName("Fruit"), (CycObject)CycAccess.baseKB) : "Good grief! Elm fruit isn't known to be a type of fruit.";
            System.out.println("Got instances of Apple: " + APIExamples.access.getAllInstances((CycObject)apple, (CycObject)CycAccess.baseKB));
            System.out.println("Got generalizations of Apple: " + APIExamples.access.getAllGenls((CycObject)apple, (CycObject)CycAccess.baseKB));
            System.out.println("Got specializations of Apple: " + APIExamples.access.getAllSpecs((CycFort)apple, (CycObject)CycAccess.baseKB));
            System.out.println("The concept " + apple.cyclify() + " can be referred to in English as '" + APIExamples.access.getGeneratedPhrase((CycObject)apple) + "'.");
            APIExamples.access.kill((CycFort)elmFruit);
        }
        catch (UnknownHostException nohost) {
            nohost.printStackTrace();
        }
        catch (IOException io) {
            io.printStackTrace();
        }
        catch (CycApiException cyc_e) {
            cyc_e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static final void exampleContantsManipulations() {
        System.out.println("Starting Cyc constant manipulation examples.");
        try {
            final CycConstant cycAdministrator = APIExamples.access.getKnownConstantByName("CycAdministrator");
            final CycConstant generalCycKE = APIExamples.access.getKnownConstantByName("GeneralCycKE");
            APIExamples.access.setCyclist((CycFort)cycAdministrator);
            APIExamples.access.setKePurpose((CycFort)generalCycKE);
            final CycConstant dog = (CycConstant)DefaultCycObject.fromCompactExternalId("Mx4rvVjaoJwpEbGdrcN5Y29ycA", APIExamples.access);
            final String externalId = DefaultCycObject.toCompactExternalId((Object)dog, APIExamples.access);
            final CycConstant dog2 = APIExamples.access.getKnownConstantByName("Dog");
            final String comment = APIExamples.access.getComment((CycObject)dog);
            System.out.println("Got comments for constant Dog:\n" + comment);
            final CycConstant newTypeOfDog = APIExamples.access.findOrCreate("NewTypeOfDog");
            APIExamples.access.assertIsa((CycFort)newTypeOfDog, (CycFort)CycAccess.collection, (CycObject)CycAccess.baseKB);
            APIExamples.access.assertGenls((CycFort)newTypeOfDog, (CycFort)dog, (CycObject)CycAccess.baseKB);
            assert APIExamples.access.isSpecOf((CycObject)newTypeOfDog, (CycObject)dog, (CycObject)CycAccess.baseKB) : "Good grief! Our new type of dog isn't known to be a type of dog.";
            System.out.println("Got instances of Dog: " + APIExamples.access.getAllInstances((CycObject)dog, (CycObject)CycAccess.baseKB));
            System.out.println("Got generalizations of Dog: " + APIExamples.access.getAllGenls((CycObject)dog, (CycObject)CycAccess.baseKB));
            System.out.println("Got specializations of Dog: " + APIExamples.access.getAllSpecs((CycFort)dog, (CycObject)CycAccess.baseKB));
            final String dogNl = APIExamples.access.getGeneratedPhrase((CycObject)dog);
            System.out.println("The concept " + dog.cyclify() + " can be referred to in English as '" + dogNl + "'.");
            APIExamples.access.kill((CycFort)newTypeOfDog);
        }
        catch (UnknownHostException nohost) {
            nohost.printStackTrace();
        }
        catch (IOException io) {
            io.printStackTrace();
        }
        catch (CycApiException cyc_e) {
            cyc_e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static final void helloWorldExample() {
        try {
            final CycConstant planetInSolarSystem = (CycConstant)DefaultCycObject.fromCompactExternalId("Mx4rWIie-jN6EduAAADggVbxzQ", APIExamples.access);
            final CycList planets = APIExamples.access.getAllInstances((CycObject)planetInSolarSystem);
            for (final Object planet : planets) {
                System.out.println("Hello '" + APIExamples.access.getGeneratedPhrase((CycObject)planet) + "'.");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static final void exampleGenericLispAPI() {
        System.out.println("Starting Cyc connection examples.");
        try {
            System.out.println("Successfully established CYC access " + APIExamples.access);
            final CycConstant cycAdministrator = new CycConstant("CycAdministrator", new Guid("c0bf7a98-9c29-11b1-9dad-c379636f7270"));
            final CycConstant generalCycKE = new CycConstant("GeneralCycKE", new Guid("bd8345f2-9c29-11b1-9dad-c379636f7270"));
            APIExamples.access.setCyclist((CycFort)cycAdministrator);
            APIExamples.access.setKePurpose((CycFort)generalCycKE);
            final Object result = APIExamples.access.converseObject((Object)"(+ 3 4)");
            final Object result2 = APIExamples.access.converseObject((Object)"(new-cyc-query '(#$isa ?X #$Dog) #$EverythingPSC)");
        }
        catch (UnknownHostException nohost) {
            nohost.printStackTrace();
        }
        catch (IOException io) {
            io.printStackTrace();
        }
        catch (CycApiException cyc_e) {
            cyc_e.printStackTrace();
        }
        System.out.println("Finished.");
    }
    
    public static void main(final String[] args) {
        try {
            APIExamples.access = CycAccess.getNewCycAccessInteractively();
            helloWorldExample();
            exampleConnectingToCyc();
            exampleContantsManipulations();
            exampleNartManipulations();
            exampleAssertionManipulations();
            exampleSynchronousQueries();
            exampleAsynchronousQueries();
            exampleInferenceParameters();
            exampleGenericLispAPI();
        }
        catch (CycApiException ex) {
            Logger.getLogger(APIExamples.class.getName()).log(Level.SEVERE, null, (Throwable)ex);
        }
        finally {
            if (APIExamples.access != null) {
                APIExamples.access.close();
            }
        }
        System.exit(0);
    }
    
    static {
        APIExamples.access = null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 182 ms
	
	Decompiled with Procyon 0.5.32.
*/