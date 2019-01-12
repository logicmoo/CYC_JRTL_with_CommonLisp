/*
 */
package org.opencyc.inference.metrics;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.inference.InferenceIdentifier;

/**
 * A map containing data about an inference.
 * The metrics whose values are returned are those specified in the inference
 * parameters for the inference when it was run.
 * See {@link org.opencyc.inference.params.InferenceParameters#setMetrics(org.opencyc.inference.metrics.InferenceMetrics) }.
 *
 * @author baxter
 */
public class InferenceMetricsValues {

  private final Map<InferenceMetric, Object> map =
          new HashMap<InferenceMetric, Object>();

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
  static public InferenceMetricsValues fromInference(
          final InferenceIdentifier inferenceID) throws IOException {
    final InferenceMetricsValues metrics = new InferenceMetricsValues();
    final CycList plist = CycAccess.getCurrent().converseList(
            "(inference-metrics " + inferenceID.stringApiValue() + ")");
    for (int i = 0; i < plist.size(); i++) {
      final CycSymbol name = (CycSymbol) plist.get(i);
      final Object value = plist.get(++i);
      InferenceMetric inferenceMetric;
      inferenceMetric = StandardInferenceMetric.fromCycSymbol(name);
      if (inferenceMetric == null) {
        System.out.println(
                name + " does not correspond to a standard inference metric.");
        inferenceMetric = new InferenceMetric() {
          @Override
          public CycSymbol getName() {
            return name;
          }
        };
      }
      metrics.map.put(inferenceMetric, value);
    }
    return metrics;
  }
}
