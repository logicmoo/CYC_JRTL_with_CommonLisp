package com.cyc.baseclient.inference;

import com.cyc.base.inference.InferenceAnswerIdentifierI;
import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.base.cycobject.CycList;
import com.cyc.baseclient.cycobject.CycArrayList;

/**
 * An identifier for an individual answer within a specific Cyc inference.
 *
 * @author baxter
 */
public class InferenceAnswerIdentifier implements InferenceAnswerIdentifierI {

  public InferenceAnswerIdentifier(InferenceIdentifier inferenceID, int answerID) {
    this.inferenceID = inferenceID;
    this.answerID = answerID;
  }

  @Override
  public String toString() {
    return "Answer " + answerID + " for " + inferenceID;
  }

  @Override
  public String stringApiValue() {
    return cycListApiValue().stringApiValue();
  }

  @Override
  public CycList<Integer> cycListApiValue() {
    return CycArrayList.makeCycList(inferenceID.getProblemStoreID(),
            inferenceID.getInferenceID(), answerID);
  }

  @Override
  public int getAnswerID() {
    return answerID;
  }

  @Override
  public InferenceIdentifier getInferenceID() {
    return inferenceID;
  }

  public static boolean possiblyInferenceAnswerSignature(Object obj) {
    if (obj instanceof CycArrayList) {
      final CycArrayList cycList = (CycArrayList) obj;
      if (cycList.size() == 3) {
        try {
          return (Integer.valueOf(cycList.get(0).toString()) >= 0
                  && Integer.valueOf(cycList.get(1).toString()) >= 0
                  && Integer.valueOf(cycList.get(2).toString()) >= 0);
        } catch (NumberFormatException e) {
          return false;
        }
      }
    }
    return false;
  }
  private InferenceIdentifier inferenceID;
  private int answerID;
}
