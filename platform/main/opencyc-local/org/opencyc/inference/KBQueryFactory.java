package org.opencyc.inference;

import java.util.Collections;
import org.opencyc.api.CycObjectFactory;
import java.util.List;
import org.opencyc.inference.params.DefaultInferenceParameters;
import org.opencyc.api.SubLAPIHelper;
import org.opencyc.cycobject.CycObject;
import org.opencyc.inference.params.InferenceParameters;
import org.opencyc.cycobject.ELMt;
import org.opencyc.cycobject.CycFormulaSentence;
import java.io.IOException;
import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycVariable;
import java.util.Map;
import org.opencyc.cycobject.CycSymbol;

public class KBQueryFactory
{
    private static final KBQueryFactory INSTANCE;
    public static final CycSymbol KBQ_SENTENCE;
    public static final CycSymbol KBQ_ELMT;
    public static final CycSymbol KBQ_PROPERTIES;
    private static final Map<CycVariable, Object> NO_SUBSTITUTIONS;
    
    public static KBQueryFactory getInstance() {
        return KBQueryFactory.INSTANCE;
    }
    
    public InferenceWorker getInferenceWorker(final CycAccess access, final CycDenotationalTerm kbq, final long timeoutMsecs, final boolean sync) throws CycApiException, IOException {
        return this.getInferenceWorkerWithSubstitutions(access, kbq, KBQueryFactory.NO_SUBSTITUTIONS, timeoutMsecs, sync);
    }
    
    public static InferenceWorker prepareKBQuery(final CycAccess access, final CycDenotationalTerm kbq, final long timeoutMsecs, final boolean sync) throws IOException, CycApiException {
        return prepareKBQueryTemplate(access, kbq, KBQueryFactory.NO_SUBSTITUTIONS, timeoutMsecs, sync);
    }
    
    public InferenceWorker getInferenceWorkerWithSubstitutions(final CycAccess access, final CycDenotationalTerm kbq, final Map<CycVariable, Object> substitutions, final long timeoutMsecs, final boolean sync) throws CycApiException, IOException {
        final CycFormulaSentence sentence = this.loadKBQSentence(access, kbq);
        final ELMt elmt = this.loadKBQELMt(access, kbq);
        final InferenceParameters properties = this.loadKBQProperties(access, kbq);
        if (substitutions != null) {
            sentence.applySubstitutionsDestructive((Map)substitutions);
        }
        return (InferenceWorker)(sync ? new DefaultInferenceWorkerSynch(sentence, elmt, properties, access, timeoutMsecs) : new DefaultInferenceWorker(sentence, elmt, properties, access, timeoutMsecs));
    }
    
    public static InferenceWorker prepareKBQueryTemplate(final CycAccess access, final CycDenotationalTerm kbq, final Map<CycVariable, Object> substitutions, final long timeoutMsecs, final boolean sync) throws IOException, CycApiException {
        return getInstance().getInferenceWorkerWithSubstitutions(access, kbq, substitutions, timeoutMsecs, sync);
    }
    
    public InferenceWorker getInferenceWorkerWithTreeSubstitutions(final CycAccess access, final CycDenotationalTerm kbq, final Map<CycObject, Object> substitutions, final long timeoutMsecs, final boolean sync) throws CycApiException, IOException {
        final CycFormulaSentence sentence = this.loadKBQSentence(access, kbq);
        final ELMt elmt = this.loadKBQELMt(access, kbq);
        final InferenceParameters properties = this.loadKBQProperties(access, kbq);
        final CycFormulaSentence subsSentence = sentence.treeSubstitute(access, (Map)substitutions);
        return (InferenceWorker)(sync ? new DefaultInferenceWorkerSynch(subsSentence, elmt, properties, access, timeoutMsecs) : new DefaultInferenceWorker(subsSentence, elmt, properties, access, timeoutMsecs));
    }
    
    public static InferenceWorker prepareKBQueryTreeTemplate(final CycAccess access, final CycDenotationalTerm kbq, final Map<CycObject, Object> substitutions, final long timeoutMsecs, final boolean sync) throws IOException, CycApiException {
        return getInstance().getInferenceWorkerWithTreeSubstitutions(access, kbq, substitutions, timeoutMsecs, sync);
    }
    
    protected CycFormulaSentence loadKBQSentence(final CycAccess access, final CycDenotationalTerm kbq) throws CycApiException, IOException {
        try {
            final String command = SubLAPIHelper.makeSubLStmt(KBQueryFactory.KBQ_SENTENCE, new Object[] { kbq });
            return access.converseSentence((Object)command);
        }
        catch (CycApiException xcpt) {
            throw new CycApiException("Could not load query sentence for KBQ " + kbq.cyclify(), (Throwable)xcpt);
        }
    }
    
    protected ELMt loadKBQELMt(final CycAccess access, final CycDenotationalTerm kbq) throws CycApiException, IOException {
        try {
            final String command = SubLAPIHelper.makeSubLStmt(KBQueryFactory.KBQ_ELMT, new Object[] { kbq });
            return access.makeELMt(access.converseCycObject((Object)command));
        }
        catch (CycApiException xcpt) {
            throw new CycApiException("Could not load query MT for KBQ " + kbq.cyclify(), (Throwable)xcpt);
        }
    }
    
    protected InferenceParameters loadKBQProperties(final CycAccess access, final CycDenotationalTerm kbq) throws CycApiException, IOException {
        try {
            final InferenceParameters properties = (InferenceParameters)new DefaultInferenceParameters(access);
            final String command = SubLAPIHelper.makeSubLStmt(KBQueryFactory.KBQ_PROPERTIES, new Object[] { kbq });
            properties.updateFromPlist((List)access.converseList((Object)command));
            return properties;
        }
        catch (CycApiException xcpt) {
            throw new CycApiException("Could not load query inference properties for KBQ " + kbq.cyclify(), (Throwable)xcpt);
        }
    }
    
    static {
        INSTANCE = new KBQueryFactory();
        KBQ_SENTENCE = CycObjectFactory.makeCycSymbol("KBQ-SENTENCE");
        KBQ_ELMT = CycObjectFactory.makeCycSymbol("KBQ-MT");
        KBQ_PROPERTIES = CycObjectFactory.makeCycSymbol("KBQ-QUERY-PROPERTIES");
        NO_SUBSTITUTIONS = Collections.emptyMap();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 69 ms
	
	Decompiled with Procyon 0.5.32.
*/