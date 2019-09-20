package org.opencyc.util;

import java.util.EventListener;

public interface CycWorkerListener extends EventListener
{
    void notifyWorkerStarted(final CycWorkerEvent p0);
    
    void notifyWorkerInterrupted(final CycWorkerEvent p0);
    
    void notifyWorkerFinished(final CycWorkerEvent p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 3 ms
	
	Decompiled with Procyon 0.5.32.
*/