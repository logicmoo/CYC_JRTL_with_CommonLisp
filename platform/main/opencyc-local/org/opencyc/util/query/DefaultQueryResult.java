package org.opencyc.util.query;

import java.util.Iterator;
import org.opencyc.cycobject.CycVariable;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import org.opencyc.inference.InferenceAnswerIdentifier;
import java.util.List;

public class DefaultQueryResult implements QueryResult
{
    private final List<QueryResult.Binding> bindings;
    private final Integer answerID;
    
    public DefaultQueryResult(final List<? extends QueryResult.Binding> bindings, final InferenceAnswerIdentifier inferenceAnswerIdentifier) {
        this.bindings = new ArrayList<QueryResult.Binding>();
        this.answerID = ((inferenceAnswerIdentifier == null) ? null : inferenceAnswerIdentifier.getAnswerID());
        if (bindings != null) {
            this.bindings.addAll(bindings);
        }
    }
    
    protected DefaultQueryResult() {
        this(null, null);
    }
    
    public List<QueryResult.Binding> getBindings() {
        return Collections.unmodifiableList((List<? extends QueryResult.Binding>)this.bindings);
    }
    
    public Integer getAnswerID() {
        return this.answerID;
    }
    
    public Object getBindingForVar(final CycVariable var) {
        for (final QueryResult.Binding binding : this.getBindings()) {
            if (binding.getVariable().equals((Object)var)) {
                return binding.getValue();
            }
        }
        return null;
    }
    
    public int compareTo(final QueryResult o) {
        if (o == null) {
            return -1;
        }
        return this.answerID.compareTo(o.getAnswerID());
    }
    
    public static class DefaultBinding implements QueryResult.Binding
    {
        private final Object term;
        private CycVariable variable;
        
        public DefaultBinding(final CycVariable variable, final Object term) {
            this.variable = variable;
            this.term = term;
        }
        
        @Override
        public String toString() {
            return this.variable + " -> " + this.term;
        }
        
        public String getVariableName() {
            return this.variable.name;
        }
        
        public CycVariable getVariable() {
            return this.variable;
        }
        
        public Object getValue() {
            return this.term;
        }
        
        public void setVariable(final CycVariable variable) {
            this.variable = variable;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 64 ms
	
	Decompiled with Procyon 0.5.32.
*/