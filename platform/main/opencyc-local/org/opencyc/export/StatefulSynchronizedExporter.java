package org.opencyc.export;

public abstract class StatefulSynchronizedExporter<T> implements Exporter<T>
{
    protected T object;
    
    public final synchronized void export(final T object) throws ExportException {
        try {
            this.initializeState(object);
            this.doExport();
        }
        catch (Exception e) {
            throw new ExportException((Throwable)e);
        }
        finally {
            this.finalizeState();
        }
    }
    
    protected void initializeState(final T object) throws ExportException {
        this.object = object;
    }
    
    protected abstract void doExport() throws Exception;
    
    protected void finalizeState() throws ExportException {
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 16 ms
	
	Decompiled with Procyon 0.5.32.
*/