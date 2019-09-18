package com.cyc.baseclient.inference.metrics;

import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycList;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.base.inference.metrics.InferenceMetric;
import com.cyc.base.inference.metrics.InferenceMetricsValuesI;

/**
 * A map containing data about an inference.
 * The metrics whose values are returned are those specified in the inference
 * parameters for the inference when it was run.
 * See {@link com.cyc.baseclient.inference.params.InferenceParameters#setMetrics(com.cyc.baseclient.inference.metrics.InferenceMetrics) }.
 *
 * @author baxter
 */
public class InferenceMetricsValues implements InferenceMetricsValuesI {

  private final Map<InferenceMetric, Object> map =
          new HashMap<InferenceMetric, Object>();

  /* (non-Javadoc)
 * @see com.cyc.baseclient.inference.metrics.InferenceMetricsValuesI#getValue(com.cyc.base.inference.metrics.InferenceMetric)
 */
@Override
public Object getValue(final InferenceMetric metric) {
    return map.get(metric);
  }

  /**
   * Create a new inference metrics object populated from the specified inference.
   *
   * @param inferenceID the identifier of the target inference.
   * @return data for all metrics collected for the specified inference.
   * @throws IOException if there is a problem communicating with Cyc.
   */
  static public InferenceMetricsValuesI fromInference(
          final InferenceIdentifier inferenceID) throws CycConnectionException {
    final InferenceMetricsValues metrics = new InferenceMetricsValues();
    final CycList plist = CycAccessManager.get().getCurrentAccess().converse().converseList(
            "(inference-metrics " + inferenceID.stringApiValue() + ")");
    for (int i = 0; i < plist.size(); i++) {
      final CycSymbolI name = (CycSymbolI) plist.get(i);
      final Object value = plist.get(++i);
      InferenceMetric inferenceMetric;
      inferenceMetric = StandardInferenceMetric.fromCycSymbol(name);
      if (inferenceMetric == null) {
        System.out.println(
                name + " does not correspond to a standard inference metric.");
        inferenceMetric = new InferenceMetric() {
          @Override
          public CycSymbolI getName() {
            return name;
          }
        };
      }
      metrics.map.put(inferenceMetric, value);
    }
    return metrics;
  }
}
