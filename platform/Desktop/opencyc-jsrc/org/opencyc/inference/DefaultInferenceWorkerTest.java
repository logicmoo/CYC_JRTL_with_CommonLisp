package org.opencyc.inference;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;

import org.opencyc.api.*;
import org.opencyc.cycobject.*;
import org.opencyc.inference.params.*;

/**
 * 
 * @author nwinant
 */
public class DefaultInferenceWorkerTest  {

  @BeforeClass
  public static void setUpClass() throws MalformedURLException, Exception {
    TestUtils.ensureConstantsInitialized();
  }
  
  @Test
  public void testInferenceWorkerListener() {
    boolean errorFree = false;
    try {
      final List answers = new ArrayList();
      final CycAccess access = CycAccess.getCurrent();
      final CycVariable var1 = new CycVariable("?var");
      final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
              access.getConstantByName("#$isa"),
              var1,
              access.getConstantByName("#$Dog"));
      final InferenceParameters params = new DefaultInferenceParameters(access);
      /*
      You can now override params like so:
      params.setMaxTransformationDepth(1);
      params.setBrowsable(true);
      params.setMaxTime(30000);
      params.put(CycObjectFactory.makeCycSymbol(":INFERENCE-MODE"), CycObjectFactory.makeCycSymbol(":MINIMAL"));
      etc...
      */
      final ELMt queryMt = access.makeELMt("InferencePSC");
      
      final InferenceWorker worker = new DefaultInferenceWorker(query, queryMt, params, access, 30000);
      worker.addInferenceListener(new InferenceWorkerListener() {
        @Override
        public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
          //System.out.println("Inference created");
        }
        
        @Override
        public void notifyInferenceStatusChanged(InferenceStatus oldStatus, InferenceStatus newStatus, InferenceSuspendReason suspendReason, InferenceWorker inferenceWorker) {
          //System.out.println("Inference status changed: " + newStatus);
        }
        
        @Override
        public void notifyInferenceAnswersAvailable(InferenceWorker inferenceWorker, List newAnswers) {
          
          // THIS IS WHERE YOU COLLECT ANY INCREMENTAL ANSWERS...
          
          for (Object o : newAnswers) {
            answers.add(o);
            //System.out.println("> " + o);
          }
        }
        
        @Override
        public void notifyInferenceTerminated(InferenceWorker inferenceWorker, Exception e) {
          //System.out.println("Inference terminated: " + e);
        }
      });
      try {
        //System.out.println("Beginning...");
        worker.start();
        while (!worker.isDone()) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
          }
        }
        //System.out.println(" ... done!");
      } finally {
        if (!worker.isDone()) {
          worker.abort();
        }
        worker.releaseInferenceResources(30000);
      }
      errorFree = true;
      assertFalse(answers.isEmpty());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertTrue(errorFree);
  }
}
