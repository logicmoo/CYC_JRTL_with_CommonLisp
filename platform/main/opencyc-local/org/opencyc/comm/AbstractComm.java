package org.opencyc.comm;

import org.opencyc.api.CycConnectionInterface;

public abstract class AbstractComm implements Comm
{
    private CycConnectionInterface cycConnection;
    
    public synchronized CycConnectionInterface getCycConnection() {
        return this.cycConnection;
    }
    
    public synchronized void setCycConnection(final CycConnectionInterface conn) {
        if (conn == this.cycConnection) {
            return;
        }
        this.cycConnection = conn;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 6 ms
	
	Decompiled with Procyon 0.5.32.
*/