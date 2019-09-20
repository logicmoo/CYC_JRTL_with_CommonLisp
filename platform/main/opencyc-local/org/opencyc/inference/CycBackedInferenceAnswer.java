package org.opencyc.inference;

import java.util.Iterator;
import org.opencyc.api.CycAccess;
import java.util.Set;
import org.opencyc.cycobject.CycDenotationalTerm;
import java.util.HashSet;
import java.util.Collection;
import org.opencyc.cycobject.CycInformationSource;
import org.opencyc.cycobject.CycObject;
import java.util.Collections;
import org.opencyc.cycobject.CycList;
import java.util.Map;
import java.io.IOException;
import org.opencyc.api.SubLAPIHelper;
import org.opencyc.cycobject.CycVariable;

public class CycBackedInferenceAnswer implements InferenceAnswer
{
    private final InferenceAnswerIdentifier id;
    private Bindings bindings;
    
    public CycBackedInferenceAnswer(final InferenceAnswerIdentifier id) {
        this.bindings = null;
        this.id = id;
    }
    
    public Object getBinding(final CycVariable var) throws IOException {
        final String command = SubLAPIHelper.makeSubLStmt("open-cyc-get-binding-for-variable", new Object[] { var, this.getId().cycListApiValue() });
        return this.getCycAccess().converseObject((Object)command);
    }
    
    public synchronized Map<CycVariable, Object> getBindings() throws IOException {
        if (this.bindings == null) {
            this.bindings = new Bindings();
            final String command = SubLAPIHelper.makeSubLStmt("open-cyc-get-answer-bindings", new Object[] { this.getId().cycListApiValue() });
            final CycObject result = this.getCycAccess().converseCycObject((Object)command);
            if (result instanceof CycList) {
                this.bindings.populateFromCycList((CycList)result);
            }
        }
        return Collections.unmodifiableMap((Map<? extends CycVariable, ?>)this.bindings);
    }
    
    public InferenceAnswerIdentifier getId() {
        return this.id;
    }
    
    @Override
    public String toString() {
        return this.id.toString();
    }
    
    public int getAnswerID() {
        return this.getId().getAnswerID();
    }
    
    public Collection<CycInformationSource> getSources(final CycInformationSource.CitationGenerator citationGenerator) throws IOException {
        final String command = SubLAPIHelper.makeSubLStmt("inference-answer-sources-from-signature", new Object[] { this.getId().cycListApiValue() });
        final Set<CycInformationSource> sources = new HashSet<CycInformationSource>();
        final CycAccess cycAccess = this.getCycAccess();
        for (final Object sourceObj : cycAccess.converseList((Object)command)) {
            if (sourceObj instanceof CycDenotationalTerm) {
                sources.add(new CycInformationSource((CycDenotationalTerm)sourceObj, citationGenerator, cycAccess));
            }
        }
        return sources;
    }
    
    private CycAccess getCycAccess() {
        return this.getId().getInferenceID().getCycAccess();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 46 ms
	
	Decompiled with Procyon 0.5.32.
*/