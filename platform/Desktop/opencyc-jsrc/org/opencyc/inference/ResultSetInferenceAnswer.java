package org.opencyc.inference;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycInformationSource;
import org.opencyc.cycobject.CycInformationSource.CitationGenerator;
import org.opencyc.cycobject.CycVariable;

/**
 * An InferenceAnswer backed by an InferenceResultSet.
 *
 * @author baxter
 */
public class ResultSetInferenceAnswer implements InferenceAnswer {

  private final InferenceResultSet resultSet;
  private final int answerId;
  private Bindings bindings = null;

  /**
   * Create a new inference answer for the answer currently at the cursor in the
   * specified result set.
   *
   * @param resultSet
   */
  public ResultSetInferenceAnswer(InferenceResultSet resultSet) {
    this(resultSet, resultSet.getRow() - 1);
  }

  /**
   * Create a new inference answer for the nth answer in the specified result
   * set.
   *
   * @param resultSet
   * @param answerId the ID of the answer. The first answer's ID is 0.
   */
  public ResultSetInferenceAnswer(InferenceResultSet resultSet, int answerId) {
    this.resultSet = resultSet;
    this.answerId = answerId;
  }

  @Override
  public Object getBinding(CycVariable var) throws IOException {
    resultSet.absolute(answerId + 1);
    return resultSet.getObject(var);
  }

  @Override
  public synchronized Map<CycVariable, Object> getBindings() throws IOException {
    if (bindings == null) {
      bindings = new Bindings();
      for (final String varName : resultSet.getColumnNames()) {
        final CycVariable var = CycObjectFactory.makeCycVariable(varName);
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
  public Collection<CycInformationSource> getSources(CitationGenerator citationGenerator) throws IOException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int getAnswerID() {
    return answerId;
  }
}
