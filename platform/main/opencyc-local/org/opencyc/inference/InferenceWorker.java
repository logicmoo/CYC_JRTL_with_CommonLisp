package org.opencyc.inference;

import org.opencyc.inference.params.InferenceParameters;
import java.util.List;
import org.opencyc.api.CycApiException;
import org.opencyc.util.TimeOutException;
import java.io.IOException;
import org.opencyc.cycobject.CycList;
import org.opencyc.api.SubLWorker;

public interface InferenceWorker extends SubLWorker
{
    void setSubLCommand(final CycList p0);
    
    int getInferenceId();
    
    int getProblemStoreId();
    
    void releaseInferenceResources(final long p0) throws IOException, TimeOutException, CycApiException;
    
    int getAnswersCount();
    
    Object getAnswerAt(final int p0);
    
    List getAnswers();
    
    List getAnswers(final int p0, final int p1);
    
    void interruptInference();
    
    void interruptInference(final int p0);
    
    void continueInference(final InferenceParameters p0);
    
    InferenceStatus getInferenceStatus();
    
    InferenceSuspendReason getSuspendReason();
    
    Object[] getInferenceListeners();
    
    void addInferenceListener(final InferenceWorkerListener p0);
    
    void removeInferenceListener(final InferenceWorkerListener p0);
    
    void removeAllInferenceListeners();
    
    InferenceIdentifier getInferenceIdentifier();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 8 ms
	
	Decompiled with Procyon 0.5.32.
*/