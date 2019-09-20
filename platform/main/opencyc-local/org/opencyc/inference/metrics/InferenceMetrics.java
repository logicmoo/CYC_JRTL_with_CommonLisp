package org.opencyc.inference.metrics;

import java.util.Iterator;
import org.opencyc.cycobject.CycList;
import org.opencyc.inference.params.InferenceParameterValue;
import java.util.HashSet;

public class InferenceMetrics extends HashSet<InferenceMetric> implements InferenceParameterValue
{
    public String stringApiValue() {
        return this.cycListApiValue().stringApiValue();
    }
    
    public CycList cycListApiValue() {
        final CycList cyclistApiValue = new CycList(this.size());
        for (final InferenceMetric metric : this) {
            cyclistApiValue.add((Object)metric.getName());
        }
        return cyclistApiValue;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 34 ms
	
	Decompiled with Procyon 0.5.32.
*/