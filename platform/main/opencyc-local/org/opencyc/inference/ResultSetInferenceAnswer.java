package org.opencyc.inference;

import java.util.Collection;
import org.opencyc.cycobject.CycInformationSource;
import java.util.Iterator;
import java.util.Collections;
import org.opencyc.api.CycObjectFactory;
import java.util.Map;
import java.io.IOException;
import org.opencyc.cycobject.CycVariable;

public class ResultSetInferenceAnswer implements InferenceAnswer
{
    private final InferenceResultSet resultSet;
    private final int answerId;
    private Bindings bindings;
    
    public ResultSetInferenceAnswer(final InferenceResultSet resultSet) {
        this(resultSet, resultSet.getRow() - 1);
    }
    
    public ResultSetInferenceAnswer(final InferenceResultSet resultSet, final int answerId) {
        this.bindings = null;
        this.resultSet = resultSet;
        this.answerId = answerId;
    }
    
    public Object getBinding(final CycVariable var) throws IOException {
        this.resultSet.absolute(this.answerId + 1);
        return this.resultSet.getObject(var);
    }
    
    public synchronized Map<CycVariable, Object> getBindings() throws IOException {
        if (this.bindings == null) {
            this.bindings = new Bindings();
            for (final String varName : this.resultSet.getColumnNames()) {
                final CycVariable var = CycObjectFactory.makeCycVariable(varName);
                this.bindings.put(var, this.getBinding(var));
            }
        }
        return Collections.unmodifiableMap((Map<? extends CycVariable, ?>)this.bindings);
    }
    
    public InferenceAnswerIdentifier getId() {
        return null;
    }
    
    public Collection<CycInformationSource> getSources(final CycInformationSource.CitationGenerator citationGenerator) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public int getAnswerID() {
        return this.answerId;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 47 ms
	
	Decompiled with Procyon 0.5.32.
*/