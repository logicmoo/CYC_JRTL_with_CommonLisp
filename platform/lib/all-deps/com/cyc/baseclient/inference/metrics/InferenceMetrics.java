/*
 */
package com.cyc.baseclient.inference.metrics;

import com.cyc.base.inference.InferenceParameterValue;
import com.cyc.base.inference.metrics.InferenceMetric;
import com.cyc.base.inference.metrics.InferenceMetricsI;

import java.util.HashSet;

import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.baseclient.cycobject.CycArrayList;

/**
 * The preferred value type for the :METRICS inference parameter.
 * See {@link com.cyc.baseclient.inference.params.InferenceParameters#setMetrics(com.cyc.baseclient.inference.metrics.InferenceMetrics)}
 *
 * @author baxter
 */
public class InferenceMetrics extends HashSet<InferenceMetric> implements InferenceMetricsI {

  @Override
  public String stringApiValue() {
    return cycListApiValue().stringApiValue();
  }

  @Override
  public CycList cycListApiValue() {
    final CycList cyclistApiValue = new CycArrayList<CycSymbolI>(this.size());
    for (final InferenceMetric metric : this) {
      cyclistApiValue.add(metric.getName());
    }
    return cyclistApiValue;
  }
}
