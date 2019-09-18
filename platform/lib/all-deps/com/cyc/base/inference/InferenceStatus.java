package com.cyc.base.inference;

import com.cyc.base.cycobject.CycSymbolI;

/**
 *
 * @author nwinant
 */
public interface InferenceStatus extends CycSymbolI {

  /**
   * Does this status indicate that the inference is done? It may be
   * continuable, but no further work will be performed on it until
   * instructed.
   *
   * @return true iff this status indicates that the inference is done.
   */
  boolean indicatesDone();
  
}
