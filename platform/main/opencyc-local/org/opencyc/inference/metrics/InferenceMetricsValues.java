package org.opencyc.inference.metrics;

import java.io.IOException;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.api.CycAccess;
import org.opencyc.inference.InferenceIdentifier;
import java.util.HashMap;
import java.util.Map;

public class InferenceMetricsValues
{
    private final Map<InferenceMetric, Object> map;
    
    public InferenceMetricsValues() {
        this.map = new HashMap<InferenceMetric, Object>();
    }
    
    public Object getValue(final InferenceMetric metric) {
        return this.map.get(metric);
    }
    
    public static InferenceMetricsValues fromInference(final InferenceIdentifier inferenceID) throws IOException {
        final InferenceMetricsValues metrics = new InferenceMetricsValues();
        final CycList plist = CycAccess.getCurrent().converseList((Object)("(inference-metrics " + inferenceID.stringApiValue() + ")"));
        for (int i = 0; i < plist.size(); ++i) {
            final CycSymbol name = (CycSymbol)plist.get(i);
            final Object value = plist.get(++i);
            InferenceMetric inferenceMetric = (InferenceMetric)StandardInferenceMetric.fromCycSymbol(name);
            if (inferenceMetric == null) {
                System.out.println(name + " does not correspond to a standard inference metric.");
                inferenceMetric = (InferenceMetric)new InferenceMetric() {
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

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 46 ms
	
	Decompiled with Procyon 0.5.32.
*/