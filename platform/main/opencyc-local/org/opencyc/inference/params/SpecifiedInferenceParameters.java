package org.opencyc.inference.params;

import java.util.Collection;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import java.util.List;
import org.opencyc.inference.metrics.InferenceMetrics;
import java.util.Collections;
import java.util.Set;
import org.opencyc.api.CycAccess;
import java.util.Iterator;
import java.util.HashMap;
import org.opencyc.cycobject.CycSymbol;
import java.util.Map;

public class SpecifiedInferenceParameters implements InferenceParameters
{
    final Map<CycSymbol, Object> map;
    
    public SpecifiedInferenceParameters() {
        this.map = new HashMap<CycSymbol, Object>();
    }
    
    public Object clone() {
        final SpecifiedInferenceParameters copy = new SpecifiedInferenceParameters();
        for (final CycSymbol key : this.keySet()) {
            final Object value = this.get(key);
            copy.put(key, value);
        }
        return copy;
    }
    
    public DefaultInferenceParameters toDefaultInferenceParameters(final CycAccess cyc) {
        final DefaultInferenceParameters copy = new DefaultInferenceParameters(cyc);
        for (final CycSymbol key : this.keySet()) {
            final Object value = this.get(key);
            copy.put(key, value);
        }
        return copy;
    }
    
    public void clear() {
        this.map.clear();
    }
    
    public Object parameterValueCycListApiValue(final CycSymbol key, final Object val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Set<Map.Entry<CycSymbol, Object>> entrySet() {
        return Collections.unmodifiableSet((Set<? extends Map.Entry<CycSymbol, Object>>)this.map.entrySet());
    }
    
    public Integer getMaxNumber() {
        final Object rawValue = this.get(SpecifiedInferenceParameters.MAX_NUMBER);
        if (rawValue instanceof Integer) {
            return (Integer)rawValue;
        }
        return null;
    }
    
    public Integer getMaxTime() {
        final Object rawValue = this.get(SpecifiedInferenceParameters.MAX_TIME);
        if (rawValue instanceof Integer) {
            return (Integer)rawValue;
        }
        return null;
    }
    
    public Set<CycSymbol> keySet() {
        return Collections.unmodifiableSet((Set<? extends CycSymbol>)this.map.keySet());
    }
    
    public Object get(final CycSymbol parameterName) {
        return this.map.get(parameterName);
    }
    
    public void putAll(final InferenceParameters properties) {
        for (final CycSymbol key : properties.keySet()) {
            this.put(key, properties.get(key));
        }
    }
    
    public void remove(final CycSymbol property) {
        this.map.remove(property);
    }
    
    public Object put(final CycSymbol parameterName, final Object value) {
        return this.map.put(parameterName, value);
    }
    
    public boolean containsKey(final CycSymbol key) {
        return this.map.containsKey(key);
    }
    
    public InferenceParameters setMaxNumber(final Integer max) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public InferenceParameters setMaxTime(final Integer max) {
        this.put(SpecifiedInferenceParameters.MAX_TIME, max);
        return (InferenceParameters)this;
    }
    
    public synchronized InferenceMetrics getMetrics() {
        InferenceMetrics metrics = (InferenceMetrics)this.get(SpecifiedInferenceParameters.METRICS);
        if (metrics == null) {
            metrics = new InferenceMetrics();
            this.setMetrics(metrics);
        }
        return metrics;
    }
    
    public InferenceParameters setMetrics(final InferenceMetrics metrics) {
        this.put(SpecifiedInferenceParameters.METRICS, metrics);
        return (InferenceParameters)this;
    }
    
    public InferenceParameters setInferenceMode(final OpenCycInferenceParameterEnum.OpenCycInferenceMode mode) {
        this.put(SpecifiedInferenceParameters.INFERENCE_MODE, mode.getDescription().getValue());
        return (InferenceParameters)this;
    }
    
    public OpenCycInferenceParameterEnum.OpenCycInferenceMode getInferenceMode() {
        final Object modeSymbol = this.get(SpecifiedInferenceParameters.INFERENCE_MODE);
        return (modeSymbol == null) ? null : OpenCycInferenceParameterEnum.OpenCycInferenceMode.fromString(modeSymbol.toString());
    }
    
    public String stringApiValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Object cycListApiValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public CycAccess getCycAccess() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void updateFromPlist(final List plist) {
        for (int i = 0; i < plist.size(); ++i) {
            final CycSymbol paramKey = (CycSymbol) plist.get(i++);
            final Object paramValue = plist.get(i);
            this.put(paramKey, paramValue);
        }
    }
    
    public boolean getAbductionAllowed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public InferenceParameters setMaxTransformationDepth(final Integer i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Integer getMaxTransformationDepth() {
        final Object rawValue = this.get(SpecifiedInferenceParameters.MAX_TRANSFORMATION_DEPTH);
        if (rawValue instanceof Integer) {
            return (Integer)rawValue;
        }
        return null;
    }
    
    public void setProblemStorePath(final String path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setProblemStoreId(final int id) {
        this.put(SpecifiedInferenceParameters.PROBLEM_STORE, new CycList((Object)SpecifiedInferenceParameters.FIND_PROBLEM_STORE_BY_ID, (Object)id));
    }
    
    public boolean usesLoadedProblemStore() {
        final Object value = this.get(SpecifiedInferenceParameters.PROBLEM_STORE);
        return value instanceof CycList && SpecifiedInferenceParameters.LOAD_PROBLEM_STORE.equals(((CycList)value).first());
    }
    
    public void makeAtLeastAsLooseAs(final InferenceParameters newParams) {
        if (newParams.getMaxTransformationDepth() == null || newParams.getMaxTransformationDepth() > this.getMaxTransformationDepth()) {
            this.setMaxTransformationDepth(newParams.getMaxTransformationDepth());
        }
        if (newParams.getMaxTime() == null || newParams.getMaxTime() > this.getMaxTime()) {
            this.setMaxTime(newParams.getMaxTime());
        }
        if (newParams.getMaxNumber() == null || newParams.getMaxNumber() > this.getMaxNumber()) {
            this.setMaxNumber(newParams.getMaxNumber());
        }
    }
    
    public Boolean isBrowsable() {
        return (Boolean)this.get(SpecifiedInferenceParameters.BROWSABLE);
    }
    
    public void setBrowsable(final boolean b) {
        final CycSymbol value = b ? CycObjectFactory.t : CycObjectFactory.nil;
        this.put(SpecifiedInferenceParameters.BROWSABLE, value);
    }
    
    @Override
    public boolean equals(final Object rhs) {
        return this.getClass().equals(SpecifiedInferenceParameters.class) && rhs.getClass().equals(SpecifiedInferenceParameters.class) && this.map.equals(((SpecifiedInferenceParameters)rhs).map);
    }
    
    @Override
    public int hashCode() {
        return this.map.hashCode();
    }
    
    @Override
    public String toString() {
        final int maxLen = 10;
        final StringBuilder builder = new StringBuilder();
        builder.append("SpecifiedInferenceParameters [");
        if (this.map != null) {
            builder.append("map=").append(this.toString(this.map.entrySet(), 10));
        }
        builder.append("]");
        return builder.toString();
    }
    
    private String toString(final Collection<?> collection, final int maxLen) {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        int i = 0;
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; ++i) {
            if (i > 0) {
                builder.append(", ");
            }
            builder.append(iterator.next());
        }
        builder.append("]");
        return builder.toString();
    }
    
    public Boolean isContinuable() {
        return (Boolean)this.get(SpecifiedInferenceParameters.CONTINUABLE);
    }
    
    public void setContinuable(final boolean b) {
        final CycSymbol value = b ? CycObjectFactory.t : CycObjectFactory.nil;
        this.put(SpecifiedInferenceParameters.CONTINUABLE, value);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 106 ms
	
	Decompiled with Procyon 0.5.32.
*/