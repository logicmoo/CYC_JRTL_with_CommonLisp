package org.opencyc.util;

import javax.swing.SwingUtilities;

public abstract class SwingWorker
{
    private Object value;
    private Thread thread;
    private Exception exception;
    protected ThreadVar threadVar;
    
    protected synchronized Object getValue() {
        return this.value;
    }
    
    private synchronized void setValue(final Object x) {
        this.value = x;
    }
    
    public abstract Object construct() throws Exception;
    
    public void finished() {
    }
    
    public void interrupt() {
        final Thread t = this.threadVar.get();
        if (t != null) {
            t.interrupt();
        }
        this.threadVar.clear();
    }
    
    public Object get() {
        while (true) {
            final Thread t = this.threadVar.get();
            if (t == null) {
                break;
            }
            try {
                t.join();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        return this.getValue();
    }
    
    public SwingWorker() {
        final Runnable doFinished = new Runnable() {
            @Override
            public void run() {
                SwingWorker.this.finished();
            }
        };
        final Runnable doConstruct = new Runnable() {
            @Override
            public void run() {
                try {
                    SwingWorker.this.setValue(SwingWorker.this.construct());
                }
                catch (Exception e) {
                    SwingWorker.this.setException(e);
                }
                finally {
                    SwingWorker.this.threadVar.clear();
                }
                SwingUtilities.invokeLater(doFinished);
            }
        };
        final Thread t = new Thread(doConstruct);
        this.threadVar = new ThreadVar(t);
    }
    
    public void start() {
        final Thread t = this.threadVar.get();
        if (t != null) {
            t.start();
        }
    }
    
    public Exception getException() {
        return this.exception;
    }
    
    public void setException(final Exception exception) {
        this.exception = exception;
    }
    
    public static class ThreadVar
    {
        protected Thread thread;
        
        ThreadVar(final Thread t) {
            this.thread = t;
        }
        
        public synchronized Thread get() {
            return this.thread;
        }
        
        public synchronized void clear() {
            this.thread = null;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 82 ms
	
	Decompiled with Procyon 0.5.32.
*/