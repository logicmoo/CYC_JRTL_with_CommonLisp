package org.opencyc.api;

import java.io.IOException;
import org.opencyc.util.CycUtils;
import org.opencyc.util.CycWorkerListener;
import org.opencyc.util.CycWorker;

public class CycCommunication extends CycWorker
{
    int timeOutMS;
    String subL;
    CycAccess conn;
    
    public CycCommunication(final CycAccess theConn, final String subLExp, final int theTimeOutMS, final CycWorkerListener cwl) {
        this.timeOutMS = 0;
        this.subL = "";
        this.conn = null;
        this.conn = theConn;
        this.subL = subLExp;
        this.timeOutMS = theTimeOutMS;
        this.addListener(cwl);
    }
    
    public CycCommunication(final CycAccess theConn, final String subLExp, final int theTimeOutMS) {
        this.timeOutMS = 0;
        this.subL = "";
        this.conn = null;
        this.conn = theConn;
        this.subL = subLExp;
        this.timeOutMS = theTimeOutMS;
    }
    
    public Object construct() throws IOException, CycApiException {
        return CycUtils.evalSubLWithWorker(this.conn, this.subL);
    }
    
    public Object getReply() throws Exception {
        return this.getWork();
    }
    
    public boolean isDone() {
        return null == this.threadVar.get();
    }
    
    public void waitTillDone() {
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
            }
        }
    }
    
    public void interrupt() {
        super.interrupt();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 19 ms
	
	Decompiled with Procyon 0.5.32.
*/