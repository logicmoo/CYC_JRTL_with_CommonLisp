package org.opencyc.api;

import java.util.Arrays;
import org.opencyc.util.OpenCycTaskInterruptedException;
import org.opencyc.util.TimeOutException;
import java.io.IOException;
import java.util.List;

public class SubLInteractor
{
    private CycAccess cycAccess;
    private DefaultSubLWorkerSynch worker;
    private Exception ex;
    private int timeoutMsecs;
    
    SubLInteractor(final CycAccess cycAccess) {
        this.timeoutMsecs = 0;
        this.cycAccess = cycAccess;
    }
    
    CycAccess getCycAccess() {
        return this.cycAccess;
    }
    
    void cancelLastCommand() {
        try {
            this.worker.abort();
        }
        catch (Exception ex) {}
    }
    
    void quit() {
        this.cancelLastCommand();
    }
    
    void setTimeoutMsecs(final int msecs) {
        this.timeoutMsecs = msecs;
    }
    
    List submitSubL(final String text) throws Exception {
        this.ex = null;
        Object result = null;
        try {
            this.worker = new DefaultSubLWorkerSynch("(multiple-value-list " + text + ")", this.cycAccess, (long)this.timeoutMsecs);
            result = this.worker.getWork();
        }
        catch (IOException iOException) {
            this.ex = iOException;
        }
        catch (TimeOutException timeOutException) {
            this.ex = (Exception)timeOutException;
        }
        catch (CycApiException cycApiException) {
            this.ex = (Exception)cycApiException;
        }
        catch (OpenCycTaskInterruptedException openCycTaskInterruptedException) {
            this.ex = (Exception)openCycTaskInterruptedException;
        }
        catch (RuntimeException e) {
            this.ex = e;
        }
        catch (Exception e2) {
            this.ex = e2;
        }
        catch (Throwable t) {
            System.out.println(t);
        }
        if (this.ex != null) {
            throw this.ex;
        }
        if (result instanceof List) {
            return (List)result;
        }
        final Object[] results = { result };
        return Arrays.asList(results);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 37 ms
	
	Decompiled with Procyon 0.5.32.
*/