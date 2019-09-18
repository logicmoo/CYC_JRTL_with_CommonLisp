package com.cyc.baseclient.inference;

import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.InformationSource;
import com.cyc.base.inference.InferenceAnswer;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import com.cyc.baseclient.CycObjectFactory;
import com.cyc.base.cycobject.InformationSource.CitationGenerator;

/**
 * An InferenceAnswer backed by an DefaultResultSet.
 *
 * @author baxter
 */
public class ResultSetInferenceAnswer implements InferenceAnswer {

  private final DefaultResultSet resultSet;
  private final int answerId;
  private Bindings bindings = null;

  /**
   * Create a new inference answer for the answer currently at the cursor in the
   * specified result set.
   *
   * @param resultSet
   */
  public ResultSetInferenceAnswer(DefaultResultSet resultSet) {
    this(resultSet, resultSet.getRow() - 1);
  }

  /**
   * Create a new inference answer for the nth answer in the specified result
   * set.
   *
   * @param resultSet
   * @param answerId the ID of the answer. The first answer's ID is 0.
   */
  public ResultSetInferenceAnswer(DefaultResultSet resultSet, int answerId) {
    this.resultSet = resultSet;
    this.answerId = answerId;
  }

  @Override
  public Object getBinding(CycVariableI var) throws CycConnectionException {
    resultSet.absolute(answerId + 1);
    return resultSet.getObject(var);
  }

  @Override
  public synchronized Map<CycVariableI, Object> getBindings() throws CycConnectionException {
    if (bindings == null) {
      bindings = new Bindings();
      for (final String varName : resultSet.getColumnNames()) {
        final CycVariableI var = CycObjectFactory.makeCycVariable(varName);
        bindings.put(var, getBinding(var));
      }
    }
    return Collections.unmodifiableMap(bindings);
  }

  @Override
  public InferenceAnswerIdentifier getId() {
    return null;
  }

  @Override
  public Collection<InformationSource> getSources(CitationGenerator citationGenerator) throws CycConnectionException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int getAnswerID() {
    return answerId;
  }
}
