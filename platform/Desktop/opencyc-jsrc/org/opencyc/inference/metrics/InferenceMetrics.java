/*
 */
package org.opencyc.inference.metrics;

import java.util.HashSet;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.inference.params.InferenceParameterValue;

/**
 * The preferred value type for the :METRICS inference parameter.
 * See {@link org.opencyc.inference.params.InferenceParameters#setMetrics(org.opencyc.inference.metrics.InferenceMetrics)}
 *
 * @author baxter
 */
public class InferenceMetrics extends HashSet<InferenceMetric> implements InferenceParameterValue {

  @Override
  public String stringApiValue() {
    return cycListApiValue().stringApiValue();
  }

  @Override
  public CycList cycListApiValue() {
    final CycList cyclistApiValue = new CycList<CycSymbol>(this.size());
    for (final InferenceMetric metric : this) {
      cyclistApiValue.add(metric.getName());
    }
    return cyclistApiValue;
  }
}
