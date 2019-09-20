package org.opencyc.inference;

import java.util.List;
import java.util.EventListener;

public interface InferenceWorkerListener extends EventListener
{
    void notifyInferenceCreated(final InferenceWorker p0);
    
    void notifyInferenceStatusChanged(final InferenceStatus p0, final InferenceStatus p1, final InferenceSuspendReason p2, final InferenceWorker p3);
    
    void notifyInferenceAnswersAvailable(final InferenceWorker p0, final List p1);
    
    void notifyInferenceTerminated(final InferenceWorker p0, final Exception p1);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 5 ms
	
	Decompiled with Procyon 0.5.32.
*/