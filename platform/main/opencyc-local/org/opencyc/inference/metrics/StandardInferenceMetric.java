package org.opencyc.inference.metrics;

import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycSymbol;

public enum StandardInferenceMetric implements InferenceMetric
{
    ANSWER_COUNT(":ANSWER-COUNT"), 
    HYPOTHESIZATION_TIME(":HYPOTHESIZATION-TIME"), 
    LINK_COUNT(":LINK-COUNT"), 
    PROBLEM_COUNT(":PROBLEM-COUNT"), 
    PROBLEM_STORE_PROBLEM_COUNT(":PROBLEM-STORE-PROBLEM-COUNT"), 
    PROBLEM_STORE_PROOF_COUNT(":PROBLEM-STORE-PROOF-COUNT"), 
    PROOF_COUNT(":PROOF-COUNT"), 
    SKSI_QUERY_START_TIMES(":SKSI-QUERY-START-TIMES"), 
    SKSI_QUERY_TOTAL_TIME(":SKSI-QUERY-TOTAL-TIME"), 
    TACTIC_COUNT(":TACTIC-COUNT"), 
    TIME_PER_ANSWER(":TIME-PER-ANSWER"), 
    TIME_TO_FIRST_ANSWER(":TIME-TO-FIRST-ANSWER"), 
    TIME_TO_LAST_ANSWER(":TIME-TO-LAST-ANSWER"), 
    TOTAL_TIME(":TOTAL-TIME"), 
    WASTED_TIME_AFTER_LAST_ANSWER(":WASTED-TIME-AFTER-LAST-ANSWER");
    
    private final CycSymbol name;
    
    public static StandardInferenceMetric fromCycSymbol(final CycSymbol name) {
        for (final StandardInferenceMetric metric : values()) {
            if (name.equals((Object)metric.getName())) {
                return metric;
            }
        }
        return null;
    }
    
    public CycSymbol getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name.toCanonicalString();
    }
    
    private StandardInferenceMetric(final String nameString) {
        this.name = CycObjectFactory.makeCycSymbol(nameString);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 36 ms
	
	Decompiled with Procyon 0.5.32.
*/