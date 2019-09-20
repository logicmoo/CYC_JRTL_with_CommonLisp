package org.opencyc.inference;

import org.opencyc.api.CycApiException;
import org.opencyc.util.TimeOutException;
import java.io.IOException;
import java.util.List;

public interface InferenceWorkerSynch extends InferenceWorker
{
    List performSynchronousInference() throws IOException, TimeOutException, CycApiException;
    
    InferenceResultSet executeQuery() throws IOException, TimeOutException, CycApiException;
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/