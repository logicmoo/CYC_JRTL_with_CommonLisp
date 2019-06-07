package org.opencyc.inference;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.opencyc.api.CycAccess;
import org.opencyc.api.SubLAPIHelper;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.cycobject.CycInformationSource;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycVariable;

/**
 * A class for representing one answer to an inference.
 * Instances contain pointers to inference objects in a Cyc image,
 * and rely on that Cyc to provide their functionality.
 *
 * @author baxter
 */
public class CycBackedInferenceAnswer implements InferenceAnswer {

  public CycBackedInferenceAnswer(InferenceAnswerIdentifier id) {
    this.id = id;
  }

  /**
   * Returns the value to which var is bound in this answer
   *
   * @param var a variable for which this answer provides a binding.
   * @return the value to which var is bound.
   */
  @Override
  public Object getBinding(CycVariable var) throws IOException {
    final String command = SubLAPIHelper.makeSubLStmt(
            "open-cyc-get-binding-for-variable", var, getId().cycListApiValue());
    return getCycAccess().converseObject(command);
  }

  @Override
  public synchronized Map<CycVariable, Object> getBindings() throws IOException {
    if (bindings == null) {
      bindings = new Bindings();
      final String command = SubLAPIHelper.makeSubLStmt(
              "open-cyc-get-answer-bindings", getId().cycListApiValue());
      final CycObject result = getCycAccess().converseCycObject(command);
      if (result instanceof CycList) {
        bindings.populateFromCycList((CycList) result);
      }
    }
    return Collections.unmodifiableMap(bindings);
  }

  /**
   * Returns the identifier for this answer.
   *
   * @return the identifier for this answer.
   */
  @Override
  public InferenceAnswerIdentifier getId() {
    return this.id;
  }

  @Override
  public String toString() {
    return id.toString();
  }

  @Override
  public int getAnswerID() {
    return getId().getAnswerID();
  }

  /**
   * Return the sources to which this answer is attributed.
   *
   * @return the sources to which this answer is attributed.
   */
  @Override
  public Collection<CycInformationSource> getSources(
          CycInformationSource.CitationGenerator citationGenerator) throws IOException {
    final String command = SubLAPIHelper.makeSubLStmt(
            "inference-answer-sources-from-signature", getId().cycListApiValue());
    final Set<CycInformationSource> sources = new HashSet<CycInformationSource>();
    final CycAccess cycAccess = getCycAccess();
    for (final Object sourceObj : cycAccess.converseList(command)) {
      if (sourceObj instanceof CycDenotationalTerm) {
        sources.add(new CycInformationSource((CycDenotationalTerm) sourceObj,
                citationGenerator, cycAccess));
      }
    }
    return sources;
  }

  private CycAccess getCycAccess() {
    return getId().getInferenceID().getCycAccess();
  }
  private final InferenceAnswerIdentifier id;
  private Bindings bindings = null;
}
