package com.cyc.base.inference;

//// External Imports
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import java.util.List;

//// Internal Imports
import com.cyc.base.conn.Worker;
import com.cyc.base.cycobject.CycList;

/**
 * <P>InferenceWorker is designed to...
 *
 * @author tbrussea, zelal
 * @date July 27, 2005, 11:40 AM
 * @version $Id: InferenceWorker.java 150734 2014-04-24 22:32:49Z nwinant $
 */
public interface InferenceWorker extends Worker {

  void setSubLCommand(CycList cycList);

  int getInferenceId();
  
  int getProblemStoreId();
  
  void releaseInferenceResources(long timeoutMsecs) throws CycConnectionException, 
    CycTimeOutException, CycApiException;

  int getAnswersCount();
  
  Object getAnswerAt(int index);
  
  List getAnswers();
  
  List getAnswers(int startIndex, int endIndex);
  
  void interruptInference(); // with infinite patience
  
  void interruptInference(int patience); // with some amount of patience

  void continueInference(InferenceParameters queryProperties);
  
  InferenceStatus getInferenceStatus();
  
  InferenceSuspendReason getSuspendReason();
  
  public Object[] getInferenceListeners();
  
  void addInferenceListener(InferenceWorkerListener inferenceListener);
  
  void removeInferenceListener(InferenceWorkerListener inferenceListener);
  
  void removeAllInferenceListeners();

  public InferenceIdentifier getInferenceIdentifier();
  
}
