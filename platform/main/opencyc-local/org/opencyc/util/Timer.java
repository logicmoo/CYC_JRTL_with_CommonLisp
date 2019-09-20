package org.opencyc.util;

import java.util.Date;

public class Timer
{
    public static final Date APOCALYPSE;
    private Date timeOut;
    private Date start;
    private long timeAlloted;
    
    public Timer(final int timeAlloted) {
        this.timeOut = Timer.APOCALYPSE;
        this.start = new Date();
        this.timeAlloted = timeAlloted * 1000L;
        this.timeOut = new Date(this.start.getTime() + timeAlloted * 1000L);
    }
    
    public Timer(final long timeAlloted) {
        this.timeOut = Timer.APOCALYPSE;
        this.start = new Date();
        this.timeAlloted = timeAlloted;
        this.timeOut = new Date(this.start.getTime() + timeAlloted);
    }
    
    public Timer() {
        this.timeOut = Timer.APOCALYPSE;
        this.start = new Date();
        this.timeAlloted = 0L;
    }
    
    public long getAllotedMSecs() {
        return this.timeAlloted;
    }
    
    public void start() {
        final Date now = new Date();
        this.timeOut = new Date(2L * this.timeOut.getTime() - now.getTime());
        this.start = now;
    }
    
    public int getElapsedSeconds() {
        return (int)(this.getElapsedMilliSeconds() / 1000L);
    }
    
    public long getElapsedMilliSeconds() {
        return new Date().getTime() - this.start.getTime();
    }
    
    public int getRemainingSeconds() {
        return (int)(this.getRemainingMilliSeconds() / 1000L);
    }
    
    public long getRemainingMilliSeconds() {
        return this.timeOut.getTime() - new Date().getTime();
    }
    
    public boolean isTimedOut() {
        return new Date().after(this.timeOut);
    }
    
    public void checkForTimeOut() throws TimeOutException {
        if (this.isTimedOut()) {
            throw new TimeOutException("");
        }
    }
    
    static {
        APOCALYPSE = new Date(Long.MAX_VALUE);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 20 ms
	
	Decompiled with Procyon 0.5.32.
*/