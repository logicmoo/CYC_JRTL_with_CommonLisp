package com.cyc.baseclient.inference;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.cyc.baseclient.api.SubLAPIHelper;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.baseclient.cycobject.CycInformationSource;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.InformationSource;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.baseclient.cycobject.CycVariable;

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
  public Object getBinding(CycVariableI var) throws CycConnectionException {
    final String command = SubLAPIHelper.makeSubLStmt(
            "open-cyc-get-binding-for-variable", var, getId().cycListApiValue());
    return getCycAccess().converse().converseObject(command);
  }

  @Override
  public synchronized Map<CycVariableI, Object> getBindings() throws CycConnectionException {
    if (bindings == null) {
      bindings = new Bindings();
      final String command = SubLAPIHelper.makeSubLStmt(
              "open-cyc-get-answer-bindings", getId().cycListApiValue());
      final CycObject result = getCycAccess().converse().converseCycObject(command);
      if (result instanceof CycArrayList) {
        bindings.populateFromCycList((CycArrayList) result);
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
  public Collection<InformationSource> getSources(
          InformationSource.CitationGenerator citationGenerator) throws CycConnectionException {
    final String command = SubLAPIHelper.makeSubLStmt(
            "inference-answer-sources-from-signature", getId().cycListApiValue());
    final Set<InformationSource> sources = new HashSet<InformationSource>();
    final CycAccess cycAccess = getCycAccess();
    for (final Object sourceObj : cycAccess.converse().converseList(command)) {
      if (sourceObj instanceof DenotationalTerm) {
        sources.add(new CycInformationSource((DenotationalTerm) sourceObj,
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
