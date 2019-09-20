package org.opencyc.api;

import org.opencyc.util.Log;
import org.opencyc.util.TimeOutException;

class ConnectionTimer extends Thread
{
    private final CycConnection cycConnection;
    final long TIMEOUT_MILLIS = 60000L;
    final long WAIT_TIME_INCREMENT = 1000L;
    long timerMillis;
    volatile boolean isCycConnectionEstablished;
    
    ConnectionTimer(final CycConnection cycConnection) {
        this.timerMillis = 0L;
        this.isCycConnectionEstablished = false;
        this.cycConnection = cycConnection;
    }
    
    @Override
    public void run() {
        try {
            while (!this.isCycConnectionEstablished) {
                Thread.sleep(1000L);
                this.timerMillis += 1000L;
                if (this.timerMillis > 60000L) {
                    throw new TimeOutException("Timeout exceeded when connecting to Cyc.");
                }
            }
        }
        catch (InterruptedException e) {
            Log.current.println("Interruption while waiting on Cyc connection establishment, closing sockets");
            if (this.cycConnection.trace == 0) {
                this.cycConnection.trace = 1;
            }
            this.cycConnection.close();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while establishing Cyc connection.", e);
        }
        catch (TimeOutException e2) {
            Log.current.println("Timed out while waiting Cyc connection establishment, closing sockets");
            if (this.cycConnection.trace == 0) {
                this.cycConnection.trace = 1;
            }
            this.cycConnection.close();
            throw e2;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 17 ms
	
	Decompiled with Procyon 0.5.32.
*/