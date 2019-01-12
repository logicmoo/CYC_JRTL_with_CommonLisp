
package org.opencyc.inference;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import org.opencyc.cycobject.CycInformationSource;
import org.opencyc.cycobject.CycVariable;

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
  Object getBinding(CycVariable var) throws IOException;
  
  /**
   * Returns the set of bindings for this answer for all query variables.
   * @return the set of bindings.
   */
  Map<CycVariable, Object> getBindings() throws IOException;

  /**
   * Returns the identifier for this answer.
   *
   * @return the identifier for this answer.
   */
  InferenceAnswerIdentifier getId();

  /**
   * Return the sources to which this answer is attributed.
   *
   * @return the sources to which this answer is attributed.
   */
  Collection<CycInformationSource> getSources(CycInformationSource.CitationGenerator citationGenerator) throws IOException;

  /**
   * Returns the identifier for this answer within its inference.
   * The first answer has the identifier 0.
   * @return 
   */
  public int getAnswerID();
  
}
