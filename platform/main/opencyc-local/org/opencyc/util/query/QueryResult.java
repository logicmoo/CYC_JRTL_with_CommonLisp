package org.opencyc.util.query;

import org.opencyc.cycobject.CycVariable;
import java.util.List;

public interface QueryResult extends Comparable<QueryResult>
{
    List<Binding> getBindings();
    
    Integer getAnswerID();
    
    Object getBindingForVar(final CycVariable p0);
    
    public interface Binding
    {
        String getVariableName();
        
        CycVariable getVariable();
        
        void setVariable(final CycVariable p0);
        
        Object getValue();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 5 ms
	
	Decompiled with Procyon 0.5.32.
*/