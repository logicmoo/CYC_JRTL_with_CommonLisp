package org.opencyc.api;

import java.util.EventListener;

public interface SubLWorkerListener extends EventListener
{
    void notifySubLWorkerStarted(final SubLWorkerEvent p0);
    
    void notifySubLWorkerDataAvailable(final SubLWorkerEvent p0);
    
    void notifySubLWorkerTerminated(final SubLWorkerEvent p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 3 ms
	
	Decompiled with Procyon 0.5.32.
*/