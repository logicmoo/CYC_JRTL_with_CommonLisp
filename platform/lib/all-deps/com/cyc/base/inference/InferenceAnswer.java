
package com.cyc.base.inference;

import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycVariableI;

import java.util.Collection;
import java.util.Map;

import com.cyc.base.cycobject.InformationSource;
import com.cyc.base.inference.InferenceAnswerIdentifierI;

/**
 * An interface for representing one answer to a Cyc query.
 * @author baxter
 */
public interface InferenceAnswer {

  /**
   * Returns the value to which var is bound in this answer
   *
   * @param var a variable for which this answer provides a binding.
   * @return the value to which var is bound.
   */
  Object getBinding(CycVariableI var) throws CycConnectionException;
  
  /**
   * Returns the set of bindings for this answer for all query variables.
   * @return the set of bindings.
   */
  Map<CycVariableI, Object> getBindings() throws CycConnectionException;

  /**
   * Returns the identifier for this answer.
   *
   * @return the identifier for this answer.
   */
  InferenceAnswerIdentifierI getId();

  /**
   * Return the sources to which this answer is attributed.
   *
   * @return the sources to which this answer is attributed.
   */
  Collection<InformationSource> getSources(InformationSource.CitationGenerator citationGenerator) throws CycConnectionException;

  /**
   * Returns the identifier for this answer within its inference.
   * The first answer has the identifier 0.
   * @return 
   */
  public int getAnswerID();
  
}
