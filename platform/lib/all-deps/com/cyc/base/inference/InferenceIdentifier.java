package com.cyc.base.inference;

import com.cyc.base.CycAccess;

/**
 *
 * @author nwinant
 */
public interface InferenceIdentifier {

  void close();

  CycAccess getCycAccess();

  Integer getFirstProofId(Integer answerId);

  int getInferenceID();

  int getProblemStoreID();

  /**
   * Interrupt this inference.
   *
   * @param patience Give inference process this many seconds to halt gracefully,
   * after which terminate it with prejudice. A null value indicates infinite patience.
   */
  void interrupt(final Integer patience);

  String stringApiValue();
}
