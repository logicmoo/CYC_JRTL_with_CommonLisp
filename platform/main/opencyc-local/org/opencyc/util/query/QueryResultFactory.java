package org.opencyc.util.query;

import org.opencyc.inference.InferenceAnswerIdentifier;
import java.util.List;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.cycobject.CycList;

public class QueryResultFactory
{
    public static QueryResult.Binding parseBinding(final CycList rawBinding) {
        if (rawBinding.size() == 2) {
            final CycVariable variable = (CycVariable)rawBinding.get(0);
            final Object term = rawBinding.getDottedElement();
            return (QueryResult.Binding)new DefaultQueryResult.DefaultBinding(variable, term);
        }
        return null;
    }
    
    public static QueryResult constructResult(final List<QueryResult.Binding> bindings) {
        return (QueryResult)new DefaultQueryResult((List)bindings, (InferenceAnswerIdentifier)null);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 8 ms
	
	Decompiled with Procyon 0.5.32.
*/