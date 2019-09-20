package org.opencyc.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CycWorkerQueue
{
    private BlockingQueue<CycWorker> workerQueue;
    private final Thread thread;
    
    public CycWorkerQueue() {
        this("Cyc Worker Queue");
    }
    
    public CycWorkerQueue(final String name) {
        this.workerQueue = new LinkedBlockingQueue<CycWorker>();
        (this.thread = new Thread() {
            @Override
            public void run() {
                CycWorkerQueue.this.processQueue();
            }
        }).setName(name);
        this.thread.start();
    }
    
    public void enqueue(final CycWorker worker) {
        this.workerQueue.add(worker);
    }
    
    private void processQueue() {
        while (true) {
            CycWorker worker = null;
            try {
                worker = this.getNextWorker();
            }
            catch (InterruptedException ie) {
                if (worker == null) {
                    continue;
                }
            }
            worker.start();
            try {
                worker.getThread().join();
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            catch (NullPointerException ex2) {}
        }
    }
    
    private CycWorker getNextWorker() throws InterruptedException {
        return this.workerQueue.take();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 26 ms
	
	Decompiled with Procyon 0.5.32.
*/