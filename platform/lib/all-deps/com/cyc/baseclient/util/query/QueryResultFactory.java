/*
 *
 */
package com.cyc.baseclient.util.query;

//// External Imports
import java.util.List;

//// Internal Imports
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.baseclient.util.query.DefaultQueryResult.DefaultBinding;
import com.cyc.baseclient.util.query.QueryResult.Binding;

/**
 *
 * @author baxter
 */
public class QueryResultFactory {

  public static Binding parseBinding(final CycArrayList rawBinding) {
    if (rawBinding.size() == 2) {
      final CycVariable variable = (CycVariable) rawBinding.get(0);
      final Object term = rawBinding.getDottedElement();
      return new DefaultBinding(variable, term);
    }
    return null;
  }

  public static QueryResult constructResult(List<Binding> bindings) {
    return new DefaultQueryResult(bindings, null);
  }
}
