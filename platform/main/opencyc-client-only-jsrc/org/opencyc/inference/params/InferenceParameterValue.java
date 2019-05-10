/*
 */
package org.opencyc.inference.params;

import org.opencyc.cycobject.CycList;

/**
 * A representation of a value for an inference parameter.
 * @see org.opencyc.inference.params.InferenceParameter.
 * @author baxter
 */
public interface InferenceParameterValue {

  /**
   * Get the string API representation for this value.
   * @return the string API representation.
   */
  String stringApiValue();

  /**
   * Get the CycList API representation for this value.
   * @return the CycList API representation.
   */
  CycList cycListApiValue();
}
