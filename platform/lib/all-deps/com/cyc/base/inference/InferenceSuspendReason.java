package com.cyc.base.inference;

/**
 *
 * @author nwinant
 */
public interface InferenceSuspendReason {

  /** Can an inference suspended for this reason be reset? */
  boolean allowReset();

  /** Can an inference suspended for this reason be stopped? */
  boolean allowStop();

  /** A string to describe the status of the inference. */
  String getInferenceStatusString();

  /** Can an inference suspended for this reason be continued? */
  boolean isContinuable();

  /** Was inference suspended because of an error? */
  boolean isError();
  
}
