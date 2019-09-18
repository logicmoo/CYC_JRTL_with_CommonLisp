package com.cyc.baseclient.inference.params;

import com.cyc.base.CycAccess;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.inference.InferenceMode;
import com.cyc.base.inference.InferenceParameterValue;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.metrics.InferenceMetricsI;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.inference.metrics.InferenceMetrics;

import static com.cyc.baseclient.inference.params.InferenceParametersSymbols.*;

import com.cyc.baseclient.inference.params.OpenCycInferenceParameterEnum.OpenCycInferenceMode;

/**
 * <P>SpecifiedInferenceParameters is designed to be used when you want to carry
 around inference parameters, but do not have access to a CycAccess instance. It will not
 perform value canonicalization or other useful checks on the names or values
 of the inference parameters. When the time comes to actually run the query, this
 can be converted into a DefaultInferenceParameters object by providing a CycAccess and
 calling the toDefaultInferenceParameters method.

 <P>Copyright (c) 2011 Cycorp, Inc. All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author daves
 * @date March 15, 2011
 * @version $Id: SpecifiedInferenceParameters.java 151256 2014-05-14 22:57:51Z jmoszko $
 */
public class SpecifiedInferenceParameters implements InferenceParameters {

  @Override
  public Object clone() {
    SpecifiedInferenceParameters copy = new SpecifiedInferenceParameters();
    Iterator<CycSymbolI> iterator = this.keySet().iterator();
    while (iterator.hasNext()) {
      CycSymbolI key = iterator.next();
      Object value = this.get(key); // note: this might should be cloned
      copy.put(key, value);
    }
    return copy;
  }

//  @Override
  public DefaultInferenceParameters toDefaultInferenceParameters(CycAccess cyc) {
    DefaultInferenceParameters copy = new DefaultInferenceParameters(cyc);
    Iterator<CycSymbolI> iterator = this.keySet().iterator();
    while (iterator.hasNext()) {
      CycSymbolI key = iterator.next();
      Object value = this.get(key); // note: this might should be cloned
      copy.put(key, value);
    }
    return copy;
  }

  @Override
  public void clear() {
    map.clear();
  }

  @Override
  public Object parameterValueCycListApiValue(CycSymbolI key, Object val) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Set<Entry<CycSymbolI, Object>> entrySet() {
    return Collections.unmodifiableSet(map.entrySet());
  }

  @Override
  public Integer getMaxNumber() {
    final Object rawValue = get(MAX_NUMBER);
    if (rawValue instanceof Integer) {
      return (Integer) rawValue;
    } else {
      return null;
    }
  }

  @Override
  public Integer getMaxTime() {
    final Object rawValue = get(MAX_TIME);
    if (rawValue instanceof Integer) {
      return (Integer) rawValue;
    } else {
      return null;
    }
  }

  @Override
  public Set<CycSymbolI> keySet() {
    return Collections.unmodifiableSet(map.keySet());
  }

  @Override
  public Object get(CycSymbolI parameterName) {
    return map.get(parameterName);
  }

  @Override
  public void putAll(InferenceParameters properties) {
    for (final CycSymbolI key : properties.keySet()) {
      put(key, properties.get(key));
    }
  }

  @Override
  public void remove(CycSymbolI property) {
    map.remove(property);
  }

  @Override
  public Object put(CycSymbolI parameterName, Object value) {
    return map.put(parameterName, value);
  }

  @Override
  public boolean containsKey(CycSymbolI key) {
    return map.containsKey(key);
  }

  @Override
  public InferenceParameters setMaxNumber(Integer max) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public InferenceParameters setMaxTime(Integer max) {
    put(MAX_TIME, max);
    return this;
  }

  /**
   * Get the set of inference metrics to gather.
   * @return the inference metrics.
   */
  @Override
  public synchronized InferenceMetrics getMetrics() {
    InferenceMetrics metrics = (InferenceMetrics) get(METRICS);
    if (metrics == null) {
      metrics = new InferenceMetrics();
      setMetrics(metrics);
    }
    return metrics;
  }

  /**
   * Specify the set of inference metrics to gather.
   * @param metrics 
   */
  @Override
  public InferenceParameters setMetrics(InferenceMetricsI metrics) {
    put(METRICS, metrics);
    return this;
  }

  @Override
  public InferenceParameters setInferenceMode(InferenceMode mode) {
    put(INFERENCE_MODE, mode.getDescription().getValue());
    return this;
  }

  @Override
  public InferenceMode getInferenceMode() {
    final Object modeSymbol = get(INFERENCE_MODE);
    return (modeSymbol == null) ? null : OpenCycInferenceMode.fromString(
            modeSymbol.toString());
  }

  @Override
  public String stringApiValue() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Object cycListApiValue() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  public CycAccess getCycAccess() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateFromPlist(final List plist) {
    for (int i = 0; i < plist.size(); i++) {
      final CycSymbolI paramKey = (CycSymbolI) plist.get(i++);
      final Object paramValue = plist.get(i);
      put(paramKey, paramValue);
    }
  }

  @Override
  public boolean getAbductionAllowed() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public InferenceParameters setMaxTransformationDepth(Integer i) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Integer getMaxTransformationDepth() {
    final Object rawValue = get(MAX_TRANSFORMATION_DEPTH);
    if (rawValue instanceof Integer) {
      return (Integer) rawValue;
    } else {
      return null;
    }
  }

  @Override
  public void setProblemStorePath(String path) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void setProblemStoreId(int id) {
    put(PROBLEM_STORE, new CycArrayList(FIND_PROBLEM_STORE_BY_ID, id));
  }

  @Override
  public boolean usesLoadedProblemStore() {
    final Object value = get(PROBLEM_STORE);
    return (value instanceof CycArrayList
            && LOAD_PROBLEM_STORE.equals(((CycArrayList) value).first()));
  }

  @Override
  public void makeAtLeastAsLooseAs(final InferenceParameters newParams) {
    if (newParams.getMaxTransformationDepth() == null || newParams.getMaxTransformationDepth() > this.getMaxTransformationDepth()) {
      setMaxTransformationDepth(newParams.getMaxTransformationDepth());
    }
    if (newParams.getMaxTime() == null || newParams.getMaxTime() > this.getMaxTime()) {
      setMaxTime(newParams.getMaxTime());
    }
    if (newParams.getMaxNumber() == null || newParams.getMaxNumber() > this.getMaxNumber()) {
      setMaxNumber(newParams.getMaxNumber());
    }
    //@TODO -- Add more as needed.
  }

  @Override
  public Boolean isBrowsable() {
    return (Boolean) get(BROWSABLE);
  }

  public void setBrowsable(boolean b) {
    final CycSymbolI value = b ? CycObjectFactory.t : CycObjectFactory.nil;
    put(BROWSABLE, value);
  }

  @Override
  public boolean equals(Object rhs) {
    // Can't guarantee that this works on subclasses right now, so use reflection
    //  to verify that we're not looking at subclasses.
    // TODO:  Generalize this to work on subclasses as well, or override .equals
    //  in those classes in some appropriate fashion
    return this.getClass().equals(SpecifiedInferenceParameters.class)
            && rhs.getClass().equals(SpecifiedInferenceParameters.class)
            && map.equals(((SpecifiedInferenceParameters) rhs).map);
  }

  @Override
  public int hashCode() {
    return map.hashCode();
  }
  final Map<CycSymbolI, Object> map = new HashMap<CycSymbolI, Object>();

  @Override
  public String toString() {
    final int maxLen = 10;
    StringBuilder builder = new StringBuilder();
    builder.append("SpecifiedInferenceParameters [");
    if (map != null) {
      builder.append("map=").append(toString(map.entrySet(), maxLen));
    }
    builder.append("]");
    return builder.toString();
  }

  private String toString(Collection<?> collection, int maxLen) {
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    int i = 0;
    for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
      if (i > 0) {
        builder.append(", ");
      }
      builder.append(iterator.next());
    }
    builder.append("]");
    return builder.toString();
  }

  @Override
  public Boolean isContinuable() {
    return (Boolean) get(CONTINUABLE);
  }

  public void setContinuable(boolean b) {
    final CycSymbolI value = b ? CycObjectFactory.t : CycObjectFactory.nil;
    put(CONTINUABLE, value);
  }
}
