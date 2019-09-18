/*
 */
package com.cyc.base.inference.metrics;

import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.baseclient.inference.metrics.StandardInferenceMetric;

/**
 * An interface representing an inference metric.
 * Inference metrics are a way of telling Cyc's inference engine to collect
 * a certain type of data for later inspection.
 * The most common metrics are in {@link StandardInferenceMetric}.
 * @author baxter
 */
public interface InferenceMetric {

  /** 
   * Return the name by which this metric is known to Cyc.
   * @return the name
   */
  CycSymbolI getName();
  
}
