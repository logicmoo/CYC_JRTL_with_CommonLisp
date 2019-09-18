package com.cyc.baseclient.examples;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.InferenceResultSet;
import com.cyc.base.inference.InferenceStatus;
import com.cyc.base.inference.InferenceSuspendReason;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.inference.InferenceWorkerListener;
import com.cyc.base.inference.InferenceWorkerSynch;

import com.cyc.baseclient.CycClientManager;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.baseclient.inference.DefaultInferenceWorker;
import com.cyc.baseclient.inference.KBQueryFactory;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nwinant
 */
public class BaseApiOverview {
  
  protected CycAccess getCyc() throws CycConnectionException {
    final String host = "localhost";
    final int basePort = 3600;
    return CycClientManager.get().getAccess(host, basePort);
  }
  
  
  
  public void simpleSynchronousQuery() throws CycConnectionException {
    final CycAccess access = getCyc();
    
    final CycVariable var1 = new CycVariable("?var");
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            access.getLookupTool().getConstantByName("#$isa"),
            var1,
            access.getLookupTool().getConstantByName("#$Dog"));
    
    final DefaultInferenceParameters params = new DefaultInferenceParameters(access);
    // You can now override params like so:
    params.setMaxTransformationDepth(1);
    params.setBrowsable(true);
    params.setMaxTime(30000);
    params.put(CycObjectFactory.makeCycSymbol(":INFERENCE-MODE"), 
            CycObjectFactory.makeCycSymbol(":MINIMAL"));
    // etc...
    
    final ELMt queryMt = access.getObjectTool().makeELMt("InferencePSC");
    
    InferenceResultSet rs = null;
    try {
      rs = access.getInferenceTool().executeQuery(query, queryMt, params);
      while (rs.next()){
        rs.getCycObject(var1);
      }
    } finally {
      if (rs != null) { rs.close(); }
    }
  }
  
  
  
  
  public void indexicalQuery() throws CycConnectionException {
    final CycAccess access = getCyc();
    
    final int timeoutMS = 30000;
    final boolean sync = true;    
    final CycConstantI kbq = access.getLookupTool().getConstantByName("#$SampleIndexicalQuery");
    final InferenceWorkerSynch worker = (InferenceWorkerSynch) KBQueryFactory.prepareKBQuery(access, kbq, timeoutMS, sync);
    InferenceResultSet rs = null;
    try {
      rs = worker.executeQuery();
      
//      ... iterate over RS...
      
    } finally {
      if (rs != null) { rs.close(); }
    }
  }
  
  
  
  
  public void treeTemplatedQuery() throws CycConnectionException {
    final CycAccess access = getCyc();
    
    final int timeoutMS = 30000;
    final boolean sync = true;
    final CycVariable eventVar = new CycVariable(":EVENT");
    final CycVariable locVar = new CycVariable(":LOCATION");
//    final CycObject event = ...;
//    final CycObject location = ...;
    
    final CycConstantI kbq = access.getLookupTool().getConstantByName("#$SampleIndexicalQuery");
    final Map<CycObject,Object> substitutions = new HashMap<CycObject,Object>();
//    substitutions.put(eventVar, event);
//    substitutions.put(locVar, location);
    final InferenceWorkerSynch worker = (InferenceWorkerSynch) KBQueryFactory.prepareKBQueryTreeTemplate(access, kbq, substitutions, timeoutMS, sync);
    InferenceResultSet rs = null;
    try {
      rs = worker.executeQuery();
      
//       ... iterate over RS...
    } finally {
      if (rs != null) { rs.close(); }
    }
  }
  
  
  
  
  public void asynchronousQuery() throws CycConnectionException {
    final CycAccess access = getCyc();
    
    final CycVariable var1 = new CycVariable("?var");
    final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
            access.getLookupTool().getConstantByName("#$isa"),
            var1,
            access.getLookupTool().getConstantByName("#$Dog"));
    
    final InferenceParameters params = new DefaultInferenceParameters(access);
// You can now override params like so:
// params.setMaxTransformationDepth(1);
// params.setBrowsable(true);
// params.setMaxTime(30000);
// params.put(CycObjectFactory.makeCycSymbol(":INFERENCE-MODE"), CycObjectFactory.makeCycSymbol(":MINIMAL"));
// etc...
    
    final ELMt queryMt = access.getObjectTool().makeELMt("InferencePSC");
    
    final InferenceWorker worker = new DefaultInferenceWorker(query, queryMt, params, access, 30000);
    worker.addInferenceListener(new InferenceWorkerListener() {
      @Override
      public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
        System.out.println("Inference created");
      }
      
      @Override
      public void notifyInferenceStatusChanged(InferenceStatus oldStatus, InferenceStatus newStatus, InferenceSuspendReason suspendReason, InferenceWorker inferenceWorker) {
        System.out.println("Inference status changed: " + newStatus);
      }
      
      @Override
      public void notifyInferenceAnswersAvailable(InferenceWorker inferenceWorker, List newAnswers) {
        
        // THIS IS WHERE YOU COLLECT ANY INCREMENTAL ANSWERS...
        
        for (Object o : newAnswers) {
          System.out.println("> " + o);
        }
      }
      
      @Override
      public void notifyInferenceTerminated(InferenceWorker inferenceWorker, Exception e) {
        System.out.println("Inference terminated: " + e);
      }
    });
    
// And now we can actually run the worker...
    
    try {
      System.out.println("Beginning...");
      worker.start();
      while (!worker.isDone()) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
      System.out.println(" ... done!");
    } finally {
      if (!worker.isDone()) {
        worker.abort();
      }
      worker.releaseInferenceResources(30000);
    }
  }
  
  
  public void simpleAssertion() throws CycConnectionException {
    final CycAccess access = getCyc();
    
    // FIXME implement
    
//    access.getAssertTool().
  }
  
  
  
  
  public void assertTemplatedSentences() throws CycConnectionException {
    final CycAccess access = getCyc();
    
    final CycVariableI eventVar = new CycVariable(":EVENT");
    final CycVariableI locVar = new CycVariable(":LOCATION");
    final FormulaSentence sentenceTemplate = CycFormulaSentence.makeCycFormulaSentence(
            access.getLookupTool().getConstantByName("eventOccuredAtPlace"),
            eventVar,
            locVar
    );
    
//    final CycObject event = ...;
//    final CycObject location = ...;
    final CycConstantI sentenceMt = access.getLookupTool().getConstantByName("#$AssertionMt");
    final Map<CycObject,Object> substitutions = new HashMap<CycObject,Object>();
//    substitutions.put(eventVar, event);
//    substitutions.put(locVar, location);
    final FormulaSentence newSentence = sentenceTemplate.treeSubstitute(access, substitutions);
    access.getAssertTool().assertWithTranscriptAndBookkeeping(newSentence, sentenceMt);
  }
  
  
  
  
  public void simpleKill() throws CycConnectionException {
    final CycAccess access = getCyc();
    
    // FIXME implement
    
//    access.getUnassertTool().kill(...);
  }
  
  
  
    
  public void justificationExample() throws CycConnectionException {
    final CycAccess access = getCyc();
    
    // FIXME implement
    
//   ??????
  }
  
  
  
}
