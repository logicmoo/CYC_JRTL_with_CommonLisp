package org.opencyc.inference;

import java.util.HashMap;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycVariable;

/**
 * A map from variables to values.
 * A Bindings object covering the query variables in a query constitutes a
 * common type of "answer" for that query.
 */
public class Bindings extends HashMap<CycVariable, Object> {
  
  public Bindings() {
    super();
  }
  
  /**
   * Create a Bindings object from a result set and row.
   * @param resultSet
   * @param row -- The first set of bindings is in row 1.
   */
  public Bindings(InferenceResultSet resultSet, int row) {
    final int oldRow = resultSet.getRow();
    resultSet.absolute(row);
    populateFromResultSet(resultSet);
    resultSet.absolute(oldRow);
  }
  
  /**
   * Create a Bindings object from the current row of a result set.
   * @param resultSet
   */
  public Bindings(InferenceResultSet resultSet) {
    populateFromResultSet(resultSet);
  }

  /**
   * Construct a Bindings object from its standard CycL representation.
   * Example:
   * <pre>(TheSet
   *  (ELInferenceBindingFn ?X Gallium)
   *  (ELInferenceBindingFn ?Y 31))</pre>
   *
   * @param bindingsNaut
   */
  public Bindings(CycNaut bindingsNaut) {
    super();
    for (int argNum = 1; argNum <= bindingsNaut.getArity(); argNum++) {
      CycNaut binding = (CycNaut) bindingsNaut.getArg(argNum);
      final CycVariable var = (CycVariable) binding.getArg(1);
      final Object desiredValue = binding.getArg(2);
      put(var, desiredValue);
    }
  }

  /**
   * Populate this Bindings object from its standard SubL representation.
   * Example:
   * <pre>((?X . Gallium) (?Y . 31))</pre>
   * @param cycList 
   */
  void populateFromCycList(CycList cycList) {
    clear();
    putAll(cycList.toMap());
  }

  private void populateFromResultSet(InferenceResultSet resultSet) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, CycApiException {
    for (final String varName : resultSet.getColumnNames()) {
      final CycVariable var = CycObjectFactory.makeCycVariable(varName);
      put(var, resultSet.getObject(var));
    }
  }
}
