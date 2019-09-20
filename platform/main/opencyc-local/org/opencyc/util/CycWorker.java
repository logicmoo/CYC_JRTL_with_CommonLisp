package org.opencyc.util;

import javax.swing.event.EventListenerList;

public abstract class CycWorker extends SwingWorker
{
    private EventListenerList listeners;
    private static final int CYC_WORKER_START = 0;
    private static final int CYC_WORKER_INTERRUPT = 1;
    private static final int CYC_WORKER_FINISHED = 2;
    
    public CycWorker() {
        this.listeners = new EventListenerList();
    }
    
    public void addListener(final CycWorkerListener cwl) {
        this.listeners.add(CycWorkerListener.class, cwl);
    }
    
    public void removeListener(final CycWorkerListener cwl) {
        this.listeners.remove(CycWorkerListener.class, cwl);
    }
    
    public Object[] getListeners() {
        return this.listeners.getListeners(CycWorkerListener.class);
    }
    
    private void notifyStatChange(final int eventType) {
        try {
            final Object[] curListeners = this.listeners.getListenerList();
            CycWorkerEvent cwe = null;
            for (int i = curListeners.length - 2; i >= 0; i -= 2) {
                if (curListeners[i] == CycWorkerListener.class) {
                    if (cwe == null) {
                        cwe = new CycWorkerEvent((Object)this);
                    }
                    switch (eventType) {
                        case 0: {
                            ((CycWorkerListener)curListeners[i + 1]).notifyWorkerStarted(cwe);
                            break;
                        }
                        case 1: {
                            ((CycWorkerListener)curListeners[i + 1]).notifyWorkerInterrupted(cwe);
                            break;
                        }
                        case 2: {
                            ((CycWorkerListener)curListeners[i + 1]).notifyWorkerFinished(cwe);
                            break;
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void start() {
        this.notifyStatChange(0);
        super.start();
    }
    
    public void interrupt() {
        this.notifyStatChange(1);
        super.interrupt();
    }
    
    public void finished() {
        this.notifyStatChange(2);
        super.finished();
    }
    
    public Object getWork() throws Exception {
        if (this.getException() != null) {
            throw this.getException();
        }
        return super.get();
    }
    
    public Thread getThread() {
        return this.threadVar.get();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 45 ms
	
	Decompiled with Procyon 0.5.32.
*/